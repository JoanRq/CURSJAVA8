package es.pue.demotdd.entities;

import java.lang.reflect.Modifier;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

public class LocationTest  {

    //<editor-fold defaultstate="collapsed" desc="Mock Object">
    private Location bcn;
    private Location mad;
    private Location pmi;
    private Location ny;
    private Location ld;
    private Location ba;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="TestCase Life Cycle">
    
    @BeforeClass
    public static void loadTest() {
        System.out.printf("Se carga el juego de pruebas %s en el Test Runner %n", LocationTest.class.getSimpleName());
    }
    
    @Before
    public void setUp() {
        bcn = new Location(41.3850639, 2.1734034999999494);
        mad = new Location(40.4167754, -3.703790199999957);
        pmi = new Location(39.57119, 2.6466339);
        ny = new Location(40.7143528, -74.005973);
        ld = new Location(51.5112138, -0.11982439);
        ba = new Location(-34.6131500, -58.3772300);
    }
    
    @After
    public void tearDown() {
        bcn = null;
        mad = null;
        pmi = null;
        ny = null;
        ld = null;
    }
    
    @AfterClass
    public static void unloadTest() {
        System.out.printf("Se descarga el juego de pruebas  %s del Test Runner %n", LocationTest.class.getSimpleName());
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Test Methods">
    
    //<editor-fold defaultstate="collapsed" desc="Escenario: Atributos privados">
    @Test
    public void attributes_are_private() throws NoSuchFieldException {
        Class c = Location.class;
        Assert.assertTrue("latitude private --> Fail!!", Modifier.isPrivate(c.getDeclaredField("latitude").getModifiers()));
        Assert.assertTrue("longitude private --> Fail!!", Modifier.isPrivate(c.getDeclaredField("longitude").getModifiers()));
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Escenario: Constructores">
    @Test
    public void ctor_2params() {
       Location loc = new Location(85.54, -15.34);
       Assert.assertEquals("constructor(lat, lon) --> lat Fails!!", 85.54, loc.getLatitude(), 0.00D);
       Assert.assertEquals("constructor(lat, lon) --> lon Fails!!", -15.34, loc.getLongitude(), 0.00D);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void ctor_2params_lat_upper_error() {
       Location loc = new Location(185.54, -15.34);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void ctor_2params_lat_lower_error() {
       Location loc = new Location(-185.54, -15.34);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void ctor_2params_lon_upper_error() {
       Location loc = new Location(50.43, 250.34);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void ctor_2params_lon_lower_error() {
       Location loc = new Location(50.43, -198.34);
    }
    
    @Test
    public void ctor_noparams() {
       Location loc = new Location();
       Assert.assertEquals("constructor() --> lat Fails!!", 0.0, loc.getLatitude(), 0.00D);
       Assert.assertEquals("constructor() --> lon Fails!!", 0.0, loc.getLongitude(), 0.00D);
        
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Escenario: loc.setLatitude">
    @Test(expected = IllegalArgumentException.class)
    public void bcn_setLatitude_upper_error() {
       bcn.setLatitude(91.5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void bcn_setLatitude_lower_error() {
       bcn.setLatitude(-91.5);
    }
    
    @Test
    public void bcn_setLatitude() {
       bcn.setLatitude(50.55);
       Assert.assertEquals("bcn.setLatitude(50.55) --> Fails!!", 50.55, bcn.getLatitude(), 0.00D);
    }
    
    @Test
    public void bcn_setLatitude_max_value() {
       bcn.setLatitude(Location.MAX_LATITUDE);
       Assert.assertEquals("bcn.setLatitude(MAX) --> Fails!!", Location.MAX_LATITUDE, bcn.getLatitude(), 0.00D);
    }
    
    @Test
    public void bcn_setLatitude_min_value() {
       bcn.setLatitude(Location.MIN_LATITUDE);
       Assert.assertEquals("bcn.setLatitude(MIN) --> Fails!!", Location.MIN_LATITUDE, bcn.getLatitude(), 0.00D);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Escenario: loc.setLongitude">
    @Test(expected = IllegalArgumentException.class)
    public void bcn_setLongitude_upper_error() {
       bcn.setLongitude(191.5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void bcn_setLongitude_lower_error() {
       bcn.setLongitude(-191.5);
    }
    
    @Test
    public void bcn_setLongitude() {
       bcn.setLongitude(150.55);
       Assert.assertEquals("bcn.setLongitude(150.55) --> Fails!!", 150.55, bcn.getLongitude(), 0.00D);
    }
    
    @Test
    public void bcn_setLongitude_max_value() {
       bcn.setLongitude(Location.MAX_LONGITUDE);
       Assert.assertEquals("bcn.setLongitude(MAX) --> Fails!!", Location.MAX_LONGITUDE, bcn.getLongitude(), 0.00D);
    }
    
    @Test
    public void bcn_setLongitude_min_value() {
       bcn.setLongitude(Location.MIN_LONGITUDE);
       Assert.assertEquals("bcn.setLongitude(MIN) --> Fails!!", Location.MIN_LONGITUDE, bcn.getLongitude(), 0.00D);
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Escenario: loc.getCardinalPoints()">
    @Test
    public void bcn_getCardinalPoints() {
       CardinalPoint[] points = bcn.getCardinalPoints();
       Assert.assertEquals("bcn.getCardinalPoints() Length: 2 --> Fails!!", 2, points.length);
       Assert.assertEquals("bcn.getCardinalPoints(): NORTH --> Fails!!", CardinalPoint.NORTH, points[0]);
       Assert.assertEquals("bcn.getCardinalPoints(): EAST --> Fails!!", CardinalPoint.EAST, points[1]);
    }
    
    @Test
    public void pmi_getCardinalPoints() {
       CardinalPoint[] points = pmi.getCardinalPoints();
       Assert.assertEquals("pmi.getCardinalPoints() Length: 2 --> Fails!!", 2, points.length);
       Assert.assertEquals("pmi.getCardinalPoints(): NORTH --> Fails!!", CardinalPoint.NORTH, points[0]);
       Assert.assertEquals("pmi.getCardinalPoints(): EAST --> Fails!!", CardinalPoint.EAST, points[1]);
    }
    
    @Test
    public void mad_getCardinalPoints() {
       CardinalPoint[] points = mad.getCardinalPoints();
       Assert.assertEquals("mad.getCardinalPoints() Length: 2 --> Fails!!", 2, points.length);
       Assert.assertEquals("mad.getCardinalPoints(): NORTH --> Fails!!", CardinalPoint.NORTH, points[0]);
       Assert.assertEquals("mad.getCardinalPoints(): WEST --> Fails!!", CardinalPoint.WEST, points[1]);
    }
    
    @Test
    public void ld_getCardinalPoints() {
       CardinalPoint[] points = ld.getCardinalPoints();
       Assert.assertEquals("ld.getCardinalPoints() Length: 2 --> Fails!!", 2, points.length);
       Assert.assertEquals("ld.getCardinalPoints(): NORTH --> Fails!!", CardinalPoint.NORTH, points[0]);
       Assert.assertEquals("ld.getCardinalPoints(): WEST --> Fails!!", CardinalPoint.WEST, points[1]);
    }
    
    @Test
    public void ny_getCardinalPoints() {
       CardinalPoint[] points = ny.getCardinalPoints();
       Assert.assertEquals("ny.getCardinalPoints() Length: 2 --> Fails!!", 2, points.length);
       Assert.assertEquals("ny.getCardinalPoints(): NORTH --> Fails!!", CardinalPoint.NORTH, points[0]);
       Assert.assertEquals("ny.getCardinalPoints(): WEST --> Fails!!", CardinalPoint.WEST, points[1]);
    }
    
    @Test
    public void ba_getCardinalPoints() {
       CardinalPoint[] points = ba.getCardinalPoints();
       Assert.assertEquals("ba.getCardinalPoints() Length: 2 --> Fails!!", 2, points.length);
       Assert.assertEquals("ba.getCardinalPoints(): SOUTH --> Fails!!", CardinalPoint.SOUTH, points[0]);
       Assert.assertEquals("ba.getCardinalPoints(): WEST --> Fails!!", CardinalPoint.WEST, points[1]);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Escenario: loc.getDecimalLatitude()">
    @Test(expected=NullPointerException.class)
    public void bcn_getDecimalLatitude_null() {
        bcn.getDecimalLatitude(null);
    }
    
    @Test(expected=NullPointerException.class)
    public void bcn_getDecimalLatitude_null_positive() {
        bcn.getDecimalLatitude(null, 5);
    }
    
    @Test(expected=NullPointerException.class)
    public void bcn_getDecimalLatitude_null_negative() {
        bcn.getDecimalLatitude(null, -5);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void bcn_getDecimalLatitude_nolocale_neg() {
        bcn.getDecimalLatitude(-10);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void bcn_getDecimalLatitude_locale_neg() {
        bcn.getDecimalLatitude("es", -10);
    }
    
   
    
    @Test
    public void bcn_getDecimalLatitude_es_2() {
        String value = bcn.getDecimalLatitude("es", 2);
        Assert.assertEquals("bcn.getDecimalLatitude(\"es\", 2) --> Fails!!", "41,39°", value);
    }
    
    @Test
    public void mad_getDecimalLatitude_es_2() {
        String value = mad.getDecimalLatitude("es", 2);
        Assert.assertEquals("mad.getDecimalLatitude(\"es\", 2) --> Fails!!", "40,42°", value);
    }
    
    @Test
    public void pmi_getDecimalLatitude_es_2() {
        String value = pmi.getDecimalLatitude("es", 2);
        Assert.assertEquals("pmi.getDecimalLatitude(\"es\", 2) --> Fails!!", "39,57°", value);
    }
    
    @Test
    public void ny_getDecimalLatitude_es_2() {
        String value = ny.getDecimalLatitude("es", 2);
        Assert.assertEquals("ny.getDecimalLatitude(\"es\", 2) --> Fails!!", "40,71°", value);
    }
    
    @Test
    public void ld_getDecimalLatitude_es_2() {
        String value = ld.getDecimalLatitude("es", 2);
        Assert.assertEquals("ld.getDecimalLatitude(\"es\", 2) --> Fails!!", "51,51°", value);
    }
    
    @Test
    public void bcn_getDecimalLatitude_en_2() {
        String value = bcn.getDecimalLatitude("en", 2);
        Assert.assertEquals("bcn.getDecimalLatitude(\"en\", 2) --> Fails!!", "41.39°", value);
    }
    
    @Test
    public void mad_getDecimalLatitude_en_2() {
        String value = mad.getDecimalLatitude("en", 2);
        Assert.assertEquals("mad.getDecimalLatitude(\"en\", 2) --> Fails!!", "40.42°", value);
    }
    
    @Test
    public void pmi_getDecimalLatitude_en_2() {
        String value = pmi.getDecimalLatitude("en", 2);
        Assert.assertEquals("pmi.getDecimalLatitude(\"en\", 2) --> Fails!!", "39.57°", value);
    }
    
    @Test
    public void ny_getDecimalLatitude_en_2() {
        String value = ny.getDecimalLatitude("en", 2);
        Assert.assertEquals("ny.getDecimalLatitude(\"en\", 2) --> Fails!!", "40.71°", value);
    }
    
    @Test
    public void ld_getDecimalLatitude_en_2() {
        String value = ld.getDecimalLatitude("en", 2);
        Assert.assertEquals("ld.getDecimalLatitude(\"en\", 2) --> Fails!!", "51.51°", value);
    }
    
    @Test
    public void bcn_getDecimalLatitude_es_noprecision() {
        String value = bcn.getDecimalLatitude("es");
        Assert.assertEquals("bcn.getDecimalLatitude(\"es\") --> Fails!!", "41,385064°", value);
    }
    
    @Test
    public void mad_getDecimalLatitude_es_noprecision() {
        String value = mad.getDecimalLatitude("es");
        Assert.assertEquals("mad.getDecimalLatitude(\"es\") --> Fails!!", "40,416775°", value);
    }
    
    @Test
    public void pmi_getDecimalLatitude_es_noprecision() {
        String value = pmi.getDecimalLatitude("es");
        Assert.assertEquals("pmi.getDecimalLatitude(\"es\") --> Fails!!", "39,571190°", value);
    }
    
    @Test
    public void ny_getDecimalLatitude_es_noprecision() {
        String value = ny.getDecimalLatitude("es");
        Assert.assertEquals("ny.getDecimalLatitude(\"es\") --> Fails!!", "40,714353°", value);
    }
    
    @Test
    public void ld_getDecimalLatitude_es_noprecision() {
        String value = ld.getDecimalLatitude("es");
        Assert.assertEquals("ld.getDecimalLatitude(\"es\") --> Fails!!", "51,511214°", value);
    }
    
    @Test
    public void bcn_getDecimalLatitude_en_noprecision() {
        String value = bcn.getDecimalLatitude("en");
        Assert.assertEquals("bcn.getDecimalLatitude(\"en\") --> Fails!!", "41.385064°", value);
    }
    
    @Test
    public void mad_getDecimalLatitude_en_noprecision() {
        String value = mad.getDecimalLatitude("en");
        Assert.assertEquals("mad.getDecimalLatitude(\"en\") --> Fails!!", "40.416775°", value);
    }
    
    @Test
    public void pmi_getDecimalLatitude_en_noprecision() {
        String value = pmi.getDecimalLatitude("en");
        Assert.assertEquals("pmi.getDecimalLatitude(\"en\") --> Fails!!", "39.571190°", value);
    }
    
    @Test
    public void ny_getDecimalLatitude_en_noprecision() {
        String value = ny.getDecimalLatitude("en");
        Assert.assertEquals("ny.getDecimalLatitude(\"en\") --> Fails!!", "40.714353°", value);
    }
    
    @Test
    public void ld_getDecimalLatitude_en_noprecision() {
        String value = ld.getDecimalLatitude("en");
        Assert.assertEquals("ld.getDecimalLatitude(\"en\") --> Fails!!", "51.511214°", value);
    }
    
    @Test
    public void bcn_getDecimalLatitude_nolocale_2() {
        String value = bcn.getDecimalLatitude(2);
        Assert.assertEquals("bcn.getDecimalLatitude(2) --> Fails!!", "41.39°", value);
    }
    
    @Test
    public void mad_getDecimalLatitude_nolocale_2() {
        String value = mad.getDecimalLatitude(2);
        Assert.assertEquals("mad.getDecimalLatitude(2) --> Fails!!", "40.42°", value);
    }
    
    @Test
    public void pmi_getDecimalLatitude_nolocale_2() {
        String value = pmi.getDecimalLatitude(2);
        Assert.assertEquals("pmi.getDecimalLatitude(2) --> Fails!!", "39.57°", value);
    }
    
    @Test
    public void ny_getDecimalLatitude_nolocale_2() {
        String value = ny.getDecimalLatitude(2);
        Assert.assertEquals("ny.getDecimalLatitude(2) --> Fails!!", "40.71°", value);
    }
    
    @Test
    public void ld_getDecimalLatitude_nolocale_2() {
        String value = ld.getDecimalLatitude(2);
        Assert.assertEquals("ld.getDecimalLatitude(2) --> Fails!!", "51.51°", value);
    }
    
    
    @Test
    public void bcn_getDecimalLatitude_nolocale_noprecision() {
        String value = bcn.getDecimalLatitude();
        Assert.assertEquals("bcn.getDecimalLatitude() --> Fails!!", "41.385064°", value);
    }
    
    @Test
    public void mad_getDecimalLatitude_nolocale_noprecision() {
        String value = mad.getDecimalLatitude();
        Assert.assertEquals("mad.getDecimalLatitude() --> Fails!!", "40.416775°", value);
    }
    
    @Test
    public void pmi_getDecimalLatitude_nolocale_noprecision() {
        String value = pmi.getDecimalLatitude();
        Assert.assertEquals("pmi.getDecimalLatitude() --> Fails!!", "39.571190°", value);
    }
    
    @Test
    public void ny_getDecimalLatitude_nolocale_noprecision() {
        String value = ny.getDecimalLatitude();
        Assert.assertEquals("ny.etDecimalLatitude() --> Fails!!", "40.714353°", value);
    }
    
    @Test
    public void ld_getDecimalLatitude_nolocale_noprecision() {
        String value = ld.getDecimalLatitude();
        Assert.assertEquals("ld.getDecimalLatitude() --> Fails!!", "51.511214°", value);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Escenario: loc.getDecimalLongitude()">
    @Test(expected=NullPointerException.class)
    public void bcn_getDecimalLongitude_null() {
        bcn.getDecimalLongitude(null);
    }
    
    @Test(expected=NullPointerException.class)
    public void bcn_getDecimalLongitude_null_positive() {
        bcn.getDecimalLongitude(null, 5);
    }
    
    @Test(expected=NullPointerException.class)
    public void bcn_getDecimalLongitude_null_negative() {
        bcn.getDecimalLongitude(null, -5);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void bcn_getDecimalLongitude_nolocale_neg() {
        bcn.getDecimalLongitude(-10);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void bcn_getDecimalLongitude_locale_neg() {
        bcn.getDecimalLongitude("es", -10);
    }
    
    @Test
    public void bcn_getDecimalLongitude_es_3() {
        String value = bcn.getDecimalLongitude("es", 3);
        Assert.assertEquals("bcn.getDecimalLongitude(\"es\", 3) --> Fails!!", "2,173°", value);
    }
    
    @Test
    public void mad_getDecimalLongitude_es_3() {
        String value = mad.getDecimalLongitude("es", 3);
        Assert.assertEquals("mad.getDecimalLongitude(\"es\", 3) --> Fails!!", "-3,704°", value);
    }
    
    @Test
    public void pmi_getDecimalLongitude_es_3() {
        String value = pmi.getDecimalLongitude("es", 3);
        Assert.assertEquals("pmi.getDecimalLongitude(\"es\", 3) --> Fails!!", "2,647°", value);
    }
    
    @Test
    public void ny_getDecimalLongitude_es_3() {
        String value = ny.getDecimalLongitude("es", 3);
        Assert.assertEquals("ny.getDecimalLongitude(\"es\", 3) --> Fails!!", "-74,006°", value);
    }
    
    @Test
    public void ld_getDecimalLongitude_es_3() {
        String value = ld.getDecimalLongitude("es", 3);
        Assert.assertEquals("ld.getDecimalLongitude(\"es\", 3) --> Fails!!", "-0,120°", value);
    }
    
    @Test
    public void bcn_getDecimalLongitude_en_3() {
        String value = bcn.getDecimalLongitude("en", 3);
        Assert.assertEquals("bcn.getDecimalLongitude(\"en\", 3) --> Fails!!", "2.173°", value);
    }
    
    @Test
    public void mad_getDecimalLongitude_en_3() {
        String value = mad.getDecimalLongitude("en", 3);
        Assert.assertEquals("mad.getDecimalLongitude(\"en\", 3) --> Fails!!", "-3.704°", value);
    }
    
    @Test
    public void pmi_getDecimalLongitude_en_3() {
        String value = pmi.getDecimalLongitude("en", 3);
        Assert.assertEquals("pmi.getDecimalLongitude(\"en\", 3) --> Fails!!", "2.647°", value);
    }
    
    @Test
    public void ny_getDecimalLongitude_en_3() {
        String value = ny.getDecimalLongitude("en", 3);
        Assert.assertEquals("ny.getDecimalLongitude(\"en\", 3) --> Fails!!", "-74.006°", value);
    }
    
    @Test
    public void ld_getDecimalLongitude_en_3() {
        String value = ld.getDecimalLongitude("en", 3);
        Assert.assertEquals("ld.getDecimalLongitude(\"en\", 3) --> Fails!!", "-0.120°", value);
    }
    
    @Test
    public void bcn_getDecimalLongitude_es_noprecision() {
        String value = bcn.getDecimalLongitude("es");
        Assert.assertEquals("bcn.getDecimalLongitude(\"es\") --> Fails!!", "2,173403°", value);
    }
    
    @Test
    public void mad_getDecimalLongitude_es_noprecision() {
        String value = mad.getDecimalLongitude("es");
        Assert.assertEquals("mad.getDecimalLongitude(\"es\") --> Fails!!", "-3,703790°", value);
    }
    
    @Test
    public void pmi_getDecimalLongitude_es_noprecision() {
        String value = pmi.getDecimalLongitude("es");
        Assert.assertEquals("pmi.getDecimalLongitude(\"es\") --> Fails!!I", "2,646634°", value);
    }
    
    @Test
    public void ny_getDecimalLongitude_es_noprecision() {
        String value = ny.getDecimalLongitude("es");
        Assert.assertEquals("ny.getDecimalLongitude(\"es\") --> Fails!!", "-74,005973°", value);
    }
    
    @Test
    public void ld_getDecimalLongitude_es_noprecision() {
        String value = ld.getDecimalLongitude("es");
        Assert.assertEquals("ld.getDecimalLongitude(\"es\") --> Fails!!", "-0,119824°", value);
    }
    
    @Test
    public void bcn_getDecimalLongitude_false_noprecision() {
        String value = bcn.getDecimalLongitude("en");
        Assert.assertEquals("bcn.getDecimalLongitude(\"en\") --> Fails!!", "2.173403°", value);
    }
    
    @Test
    public void mad_getDecimalLongitude_false_noprecision() {
        String value = mad.getDecimalLongitude("en");
        Assert.assertEquals("mad.getDecimalLongitude(\"en\") --> Fails!!", "-3.703790°", value);
    }
     
    @Test
    public void pmi_getDecimalLongitude_false_noprecision() {
        String value = pmi.getDecimalLongitude("en");
        Assert.assertEquals("pmi.getDecimalLongitude(\"en\") --> Fails!!", "2.646634°", value);
    }
    
    @Test
    public void  ny_getDecimalLongitude_false_noprecision() {
        String value = ny.getDecimalLongitude("en");
        Assert.assertEquals("ny.getDecimalLongitude(\"en\") --> Fails!!", "-74.005973°", value);
    }
    
    @Test
    public void ld_getDecimalLongitude_false_noprecision() {
        String value = ld.getDecimalLongitude("en");
        Assert.assertEquals("ld.getDecimalLongitude(\"en\") --> Fails!!", "-0.119824°", value);
    }
    
    @Test
    public void bcn_getDecimalLongitude_nolocale_3() {
        String value = bcn.getDecimalLongitude(3);
        Assert.assertEquals("bcn.getDecimalLongitude(3) --> Fails!!", "2.173°", value);
    }
    
    @Test
    public void mad_getDecimalLongitude_nolocale_3() {
        String value = mad.getDecimalLongitude(3);
        Assert.assertEquals("mad.getDecimalLongitude(3) --> Fails!!", "-3.704°", value);
    }
    
    @Test
    public void pmi_getDecimalLongitude_nolocale_3() {
        String value = pmi.getDecimalLongitude(3);
        Assert.assertEquals("pmi.getDecimalLongitude(3) --> Fails!!", "2.647°", value);
    }
    
    @Test
    public void ny_getDecimalLongitude_nolocale_3() {
        String value = ny.getDecimalLongitude(3);
        Assert.assertEquals("ny.getDecimalLongitude(3) --> Fails!!", "-74.006°", value);
    }
    
    @Test
    public void ld_getDecimalLongitude_nolocale_3() {
        String value = ld.getDecimalLongitude(3);
        Assert.assertEquals("ld.getDecimalLongitude(3) --> Fails!!", "-0.120°", value);
    }
    
    @Test
    public void bcn_getDecimalLongitude_nolocale_noprecision() {
        String value = bcn.getDecimalLongitude();
        Assert.assertEquals("bcn.getDecimalLongitude() --> Fails!!", "2.173403°", value);
    }
    
    @Test
    public void mad_getDecimalLongitude_nolocale_noprecision() {
        String value = mad.getDecimalLongitude();
        Assert.assertEquals("mad.getDecimalLongitude() --> Fails!!", "-3.703790°", value);
    }
    
    @Test
    public void pmi_getDecimalLongitude_nolocale_noprecision() {
        String value = pmi.getDecimalLongitude();
        Assert.assertEquals("pmi.getDecimalLongitude() --> Fails!!", "2.646634°", value);
    }
    
    @Test
    public void ny_getDecimalLongitude_nolocale_noprecision() {
        String value = ny.getDecimalLongitude();
        Assert.assertEquals("ny.getDecimalLongitude() --> Fails!!", "-74.005973°", value);
    }
    
    @Test
    public void ld_getDecimalLongitude_nolocale_noprecision() {
        String value = ld.getDecimalLongitude();
        Assert.assertEquals("ld.getDecimalLongitude() --> Fails!!", "-0.119824°", value);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Escenario: loc.toDecimal()">
    @Test(expected=NullPointerException.class)
    public void bcn_toDecimal_null() {
        bcn.toDecimal(null);
    }
    
    @Test(expected=NullPointerException.class)
    public void bcn_toDecimal_null_positive() {
        bcn.toDecimal(null, 5);
    }
    
    @Test(expected=NullPointerException.class)
    public void bcn_toDecimal_null_negative() {
        bcn.toDecimal(null, -5);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void bcn_toDecimal_nolocale_neg() {
        bcn.toDecimal(-10);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void bcn_toDecimal_locale_neg() {
        bcn.toDecimal("es", -10);
    }
    
    @Test
    public void bcn_toDecimal_es_4() {
        String value = bcn.toDecimal("es", 4);
        Assert.assertEquals("bcn.toDecimal(\"es\", 4) --> Fails!!", "41,3851°  2,1734°", value);
    }
    
    @Test
    public void mad_toDecimal_es_4() {
        String value = mad.toDecimal("es", 4);
        Assert.assertEquals("mad.toDecimal(\"es\", 4) --> Fails!!", "40,4168°  -3,7038°", value);
    }
    
    @Test
    public void pmi_toDecimal_es_4() {
        String value = pmi.toDecimal("es", 4);
        Assert.assertEquals("pmi.toDecimal(\"es\", 4) --> Fails!!", "39,5712°  2,6466°", value);
    }
    
    @Test
    public void ny_toDecimal_es_4() {
        String value = ny.toDecimal("es", 4);
        Assert.assertEquals("ny.toDecimal(\"es\", 4) --> Fails!!", "40,7144°  -74,0060°", value);
    }
    
    @Test
    public void ld_toDecimal_es_4() {
        String value = ld.toDecimal("es", 4);
        Assert.assertEquals("ld.toDecimal(\"es\", 4) --> Fails!!", "51,5112°  -0,1198°", value);
    }
    
    @Test
    public void bcn_toDecimal_en_4() {
        String value = bcn.toDecimal("en", 4);
        Assert.assertEquals("bcn.toDecimal(\"en\", 4) --> Fails!!", "41.3851°  2.1734°", value);
    }
    
    @Test
    public void mad_toDecimal_en_4() {
        String value = mad.toDecimal("en", 4);
        Assert.assertEquals("mad.toDecimal(\"en\", 4) --> Fails!!", "40.4168°  -3.7038°", value);
    }
    
    @Test
    public void pmi_toDecimal_en_4() {
        String value = pmi.toDecimal("en", 4);
        Assert.assertEquals("pmi.toDecimal(\"en\", 4) --> Fails!!", "39.5712°  2.6466°", value);
    }    
    
    @Test
    public void ny_toDecimal_en_4() {
        String value = ny.toDecimal("en", 4);
        Assert.assertEquals("ny.toDecimal(\"en\", 4) --> Fails!!", "40.7144°  -74.0060°", value);
    }
    
    @Test
    public void ld_toDecimal_en_4() {
        String value = ld.toDecimal("en", 4);
        Assert.assertEquals("ld.toDecimal(\"en\", 4) --> Fails!!", "51.5112°  -0.1198°", value);
    }
    
    
    @Test
    public void bcn_toDecimal_es_noprecision() {
        String value = bcn.toDecimal("es");
        Assert.assertEquals("bcn.toDecimal(\"es\") --> Fails!!", "41,385064°  2,173403°", value);
    }
    
    @Test
    public void mad_toDecimal_es_noprecision() {
        String value = mad.toDecimal("es");
        Assert.assertEquals("mad.toDecimal(\"es\") --> Fails!!", "40,416775°  -3,703790°", value);
    }
    
    @Test
    public void pmi_toDecimal_es_noprecision() {
        String value = pmi.toDecimal("es");
        Assert.assertEquals("pmi.toDecimal(\"es\") --> Fails!!", "39,571190°  2,646634°", value);
    }
    
    @Test
    public void ny_toDecimal_es_noprecision() {
        String value = ny.toDecimal("es");
        Assert.assertEquals("ny.toDecimal(\"es\") --> Fails!!", "40,714353°  -74,005973°", value);
    }
    
    @Test
    public void ld_toDecimal_es_noprecision() {
        String value = ld.toDecimal("es");
        Assert.assertEquals("ld.toDecimal(\"es\") --> Fails!!", "51,511214°  -0,119824°", value);
    }
    
    @Test
    public void bcn_toDecimal_en_precision() {
        String value = bcn.toDecimal("en");
        Assert.assertEquals("bcn.toDecimal(\"en\") --> Fails!!", "41.385064°  2.173403°", value);
    }
    
    @Test
    public void mad_toDecimal_en_precision() {
        String value = mad.toDecimal("en");
        Assert.assertEquals("mad.toDecimal(\"en\") --> Fails!!", "40.416775°  -3.703790°", value);
    }
    
    @Test
    public void pmi_toDecimal_en_precision() {
        String value = pmi.toDecimal("en");
        Assert.assertEquals("pmi.toDecimal(\"en\") --> Fails!!", "39.571190°  2.646634°", value);
    }
    
    @Test
    public void ny_toDecimal_en_precision() {
        String value = ny.toDecimal("en");
        Assert.assertEquals("ny.toDecimal(\"en\") --> Fails!!", "40.714353°  -74.005973°", value);
    }
    
    @Test
    public void ld_toDecimal_en_precision() {
        String value = ld.toDecimal("en");
        Assert.assertEquals("ld.toDecimal(\"en\") --> Fails!!", "51.511214°  -0.119824°", value);
    }
    
    @Test
    public void bcn_toDecimal_nolocale_4() {
        String value = bcn.toDecimal(4);
        Assert.assertEquals("bcn.toDecimal(4) --> Fails!!", "41.3851°  2.1734°", value);
    }
    
    @Test
    public void mad_toDecimal_nolocale_4() {
        String value = mad.toDecimal(4);
        Assert.assertEquals("mad.toDecimal(4) --> Fails!!", "40.4168°  -3.7038°", value);
    }
    
    @Test
    public void pmi_toDecimal_nolocale_4() {
        String value = pmi.toDecimal(4);
        Assert.assertEquals("pmi.toDecimal(4) --> Fails!!", "39.5712°  2.6466°", value);
    }
    
    @Test
    public void ny_toDecimal_nolocale_4() {
        String value = ny.toDecimal(4);
        Assert.assertEquals("ny.toDecimal(4) --> Fails!!", "40.7144°  -74.0060°", value);
    }
    
    @Test
    public void ld_toDecimal_nolocale_4() {
        String value = ld.toDecimal(4);
        Assert.assertEquals("ld.toDecimal(4) --> Fails!!", "51.5112°  -0.1198°", value);
    }
    
    @Test
    public void bcn_toDecimal_nolocale_noprecision() {
        String value = bcn.toDecimal();
        Assert.assertEquals("bcn.toDecimal() --> Fails!!", "41.385064°  2.173403°", value);
    } 
    
    @Test
    public void mad_toDecimal_nolocale_noprecision() {
        String value = mad.toDecimal();
        Assert.assertEquals("mad.toDecimal() --> Fails!!", "40.416775°  -3.703790°", value);
    }
    
    @Test
    public void pmi_toDecimal_nolocale_noprecision() {
        String value = pmi.toDecimal();
        Assert.assertEquals("pmi.toDecimal() --> Fails!!", "39.571190°  2.646634°", value);
    }
    
    @Test
    public void ny_toDecimal_nolocale_noprecision() {
        String value = ny.toDecimal();
        Assert.assertEquals("ny.toDecimal() --> Fails!!", "40.714353°  -74.005973°", value);
    }
    
    @Test
    public void ld_toDecimal_nolocale_noprecision() {
        String value = ld.toDecimal();
        Assert.assertEquals("ld.toDecimal() --> Fails!!", "51.511214°  -0.119824°", value);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Escenario: loc.getSexagesimalLatitude()">
    @Test(expected=NullPointerException.class)
    public void bcn_getSexagesimalLatitude_null() {
        bcn.getSexagesimalLatitude(null);
    }
    
    @Test(expected=NullPointerException.class)
    public void bcn_getSexagesimalLatitude_null_positive() {
        bcn.getSexagesimalLatitude(null, 5);
    }
    
    @Test(expected=NullPointerException.class)
    public void bcn_getSexagesimalLatitude_null_negative() {
        bcn.getSexagesimalLatitude(null, -5);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void bcn_getSexagesimalLatitude_nolocale_neg() {
        bcn.getSexagesimalLatitude(-10);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void bcn_getSexagesimalLatitude_locale_neg() {
        bcn.getSexagesimalLatitude("es", -10);
    }
    
    @Test
    public void bcn_getSexagesimalLatitude_es_1() {
        String value = bcn.getSexagesimalLatitude("es", 1);
        Assert.assertEquals("bcn.getSexagesimalLatitude(\"es\", 1) --> Fails!!", "41° 23′ 6,2″ N", value);
    }
    
    @Test
    public void mad_getSexagesimalLatitude_es_1() {
        String value = mad.getSexagesimalLatitude("es", 1);
        Assert.assertEquals("mad.getSexagesimalLatitude(\"es\", 1) --> Fails!!", "40° 25′ 0,4″ N", value);
    }
    
    @Test
    public void pmi_getSexagesimalLatitude_es_1() {
        String value = pmi.getSexagesimalLatitude("es", 1);
        Assert.assertEquals("pmi.getSexagesimalLatitude(\"es\", 1) --> Fails!!", "39° 34′ 16,3″ N", value);
    }
    
    @Test
    public void ny_getSexagesimalLatitude_es_1() {
        String value = ny.getSexagesimalLatitude("es", 1);
        Assert.assertEquals("ny.getSexagesimalLatitude(\"es\", 1) --> Fails!!", "40° 42′ 51,7″ N", value);
    }
    
    @Test
    public void ld_getSexagesimalLatitude_es_1() {
        String value = ld.getSexagesimalLatitude("es", 1);
        Assert.assertEquals("ld.getSexagesimalLatitude(\"es\", 1) --> Fails!!", "51° 30′ 40,4″ N", value);
    }
    
    @Test
    public void bcn_getSexagesimalLatitude_en_1() {
        String value = bcn.getSexagesimalLatitude("en", 1);
        Assert.assertEquals("bcn.getSexagesimalLatitude(\"en\", 1) --> Fails!!", "41° 23′ 6.2″ N", value);
    }
    
    @Test
    public void mad_getSexagesimalLatitude_en_1() {
        String value = mad.getSexagesimalLatitude("en", 1);
        Assert.assertEquals("mad.getSexagesimalLatitude(\"en\", 1) --> Fails!!", "40° 25′ 0.4″ N", value);
    }
    
    @Test
    public void pmi_getSexagesimalLatitude_en_1() {
        String value = pmi.getSexagesimalLatitude("en", 1);
        Assert.assertEquals("pmi.getSexagesimalLatitude(\"en\", 1) --> Fails!!", "39° 34′ 16.3″ N", value);
    }
    
    @Test
    public void ny_getSexagesimalLatitude_en_1() {
        String value = ny.getSexagesimalLatitude("en", 1);
        Assert.assertEquals("ny.getSexagesimalLatitude(\"en\", 1) --> Fails!!", "40° 42′ 51.7″ N", value);
    }
    
    @Test
    public void ld_getSexagesimalLatitude_en_1() {
        String value = ld.getSexagesimalLatitude("en", 1);
        Assert.assertEquals("ld.getSexagesimalLatitude(\"en\", 1) --> Fails!!", "51° 30′ 40.4″ N", value);
    }
    
    
    @Test
    public void bcn_getSexagesimalLatitude_es_noprecision() {
        String value = bcn.getSexagesimalLatitude("es");
        Assert.assertEquals("bcn.getSexagesimalLatitude(\"es\") --> Fails!!", "41° 23′ 6,230040″ N", value);
    }
    
    @Test
    public void mad_getSexagesimalLatitude_es_noprecision() {
        String value = mad.getSexagesimalLatitude("es");
        Assert.assertEquals("mad.getSexagesimalLatitude(\"es\") --> Fails!!", "40° 25′ 0,391440″ N", value);
    }
    
    @Test
    public void pmi_getSexagesimalLatitude_es_noprecision() {
        String value = pmi.getSexagesimalLatitude("es");
        Assert.assertEquals("pmi.getSexagesimalLatitude(\"es\") --> Fails!!", "39° 34′ 16,284000″ N", value);
    }
    
    @Test
    public void ny_getSexagesimalLatitude_es_noprecision() {
        String value = ny.getSexagesimalLatitude("es");
        Assert.assertEquals("ny.getSexagesimalLatitude(\"es\") --> Fails!!", "40° 42′ 51,670080″ N", value);
    }
    
    @Test
    public void ld_getSexagesimalLatitude_es_noprecision() {
        String value = ld.getSexagesimalLatitude("es");
        Assert.assertEquals("ld.getSexagesimalLatitude(\"es\") --> Fails!!", "51° 30′ 40,369680″ N", value);
    }
    
    @Test
    public void bcn_getSexagesimalLatitude_en_noprecision() {
        String value = bcn.getSexagesimalLatitude("en");
        Assert.assertEquals("bcn.getSexagesimalLatitude(\"en\") --> Fails!!", "41° 23′ 6.230040″ N", value);
    }
    
    @Test
    public void mad_getSexagesimalLatitude_en_noprecision() {
        String value = mad.getSexagesimalLatitude("en");
        Assert.assertEquals("mad.getSexagesimalLatitude(\"en\") --> Fails!!", "40° 25′ 0.391440″ N", value);
    }
    
    @Test
    public void pmi_getSexagesimalLatitude_en_noprecision() {
        String value = pmi.getSexagesimalLatitude("en");
        Assert.assertEquals("pmi.getSexagesimalLatitude(\"en\") --> Fails!!", "39° 34′ 16.284000″ N", value);
    }
    
    @Test
    public void ny_getSexagesimalLatitude_en_noprecision() {
        String value = ny.getSexagesimalLatitude("en");
        Assert.assertEquals("ny.getSexagesimalLatitude(\"en\") --> Fails!!", "40° 42′ 51.670080″ N", value);
    }
    
    @Test
    public void ld_getSexagesimalLatitude_en_noprecision() {
        String value = ld.getSexagesimalLatitude("en");
        Assert.assertEquals("ld.getSexagesimalLatitude(\"en\") --> Fails!!", "51° 30′ 40.369680″ N", value);
    }
    
    @Test
    public void bcn_getSexagesimalLatitude_nolocale_1() {
        String value = bcn.getSexagesimalLatitude(1);
        Assert.assertEquals("bcn.getSexagesimalLatitude(1) --> Fails!!", "41° 23′ 6.2″ N", value);
    }
    
    @Test
    public void mad_getSexagesimalLatitude_nolocale_1() {
        String value = mad.getSexagesimalLatitude(1);
        Assert.assertEquals("mad.getSexagesimalLatitude(1) --> Fails!!", "40° 25′ 0.4″ N", value);
    }
    
    @Test
    public void pmi_getSexagesimalLatitude_nolocale_1() {
        String value = pmi.getSexagesimalLatitude(1);
        Assert.assertEquals("pmi.getSexagesimalLatitude(1) --> Fails!!", "39° 34′ 16.3″ N", value);
    }
    
    @Test
    public void ny_getSexagesimalLatitude_nolocale_1() {
        String value = ny.getSexagesimalLatitude(1);
        Assert.assertEquals("ny.getSexagesimalLatitude(1) --> Fails!!", "40° 42′ 51.7″ N", value);
    }
    
    @Test
    public void ld_getSexagesimalLatitude_nolocale_1() {
        String value = ld.getSexagesimalLatitude(1);
        Assert.assertEquals("ld.getSexagesimalLatitude(1) --> Fails!!", "51° 30′ 40.4″ N", value);
    }
    
    @Test
    public void bcn_getSexagesimalLatitude_nolocale_noprecision() {
        String value = bcn.getSexagesimalLatitude();
        Assert.assertEquals("bcn.getSexagesimalLatitude() --> Fails!!", "41° 23′ 6.230040″ N", value);
    }
    
    @Test
    public void mad_getSexagesimalLatitude_nolocale_noprecision() {
        String value = mad.getSexagesimalLatitude();
        Assert.assertEquals("mad.getSexagesimalLatitude() --> Fails!!", "40° 25′ 0.391440″ N", value);
    }
    
    @Test
    public void pmi_getSexagesimalLatitude_nolocale_noprecision() {
        String value = pmi.getSexagesimalLatitude();
        Assert.assertEquals("pmi.getSexagesimalLatitude() --> Fails!!", "39° 34′ 16.284000″ N", value);
    }
    
    @Test
    public void ny_getSexagesimalLatitude_nolocale_noprecision() {
        String value = ny.getSexagesimalLatitude();
        Assert.assertEquals("ny.getSexagesimalLatitude() --> Fails!!", "40° 42′ 51.670080″ N", value);
    }
    
    @Test
    public void ld_getSexagesimalLatitude_nolocale_noprecision() {
        String value = ld.getSexagesimalLatitude();
        Assert.assertEquals("ld.getSexagesimalLatitude() --> Fails!!", "51° 30′ 40.369680″ N", value);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Escenario: loc.getSexagesimalLongitude()">
    @Test(expected=NullPointerException.class)
    public void bcn_getSexagesimalLongitude_null() {
        bcn.getSexagesimalLongitude(null);
    }
    
    @Test(expected=NullPointerException.class)
    public void bcn_getSexagesimalLongitude_null_positive() {
        bcn.getSexagesimalLongitude(null, 5);
    }
    
    @Test(expected=NullPointerException.class)
    public void bcn_getSexagesimalLongitude_null_negative() {
        bcn.getSexagesimalLongitude(null, -5);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void bcn_getSexagesimalLongitude_nolocale_neg() {
        bcn.getSexagesimalLongitude(-10);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void bcn_getSexagesimalLongitude_locale_neg() {
        bcn.getSexagesimalLongitude("es", -10);
    }
    
    @Test
    public void bcn_getSexagesimalLongitude_es_3() {
        String value = bcn.getSexagesimalLongitude("es", 3);
        Assert.assertEquals("bcn.getSexagesimalLongitude(\"es\", 3) --> Fails!!", "2° 10′ 24,253″ E", value);
    }
    
    @Test
    public void mad_getSexagesimalLongitude_es_3() {
        String value = mad.getSexagesimalLongitude("es", 3);
        Assert.assertEquals("mad.getSexagesimalLongitude(\"es\", 3) --> Fails!!", "3° 42′ 13,645″ W", value);
    }
    
    @Test
    public void pmi_getSexagesimalLongitude_es_3() {
        String value = pmi.getSexagesimalLongitude("es", 3);
        Assert.assertEquals("pmi.getSexagesimalLongitude(\"es\", 3) --> Fails!!", "2° 38′ 47,882″ E", value);
    }
    
    @Test
    public void ny_getSexagesimalLongitude_es_3() {
        String value = ny.getSexagesimalLongitude("es", 3);
        Assert.assertEquals("ny.getSexagesimalLongitude(\"es\", 3) --> Fails!!", "74° 0′ 21,503″ W", value);
    }
    
    @Test
    public void ld_getSexagesimalLongitude_es_3() {
        String value = ld.getSexagesimalLongitude("es", 3);
        Assert.assertEquals("ld.getSexagesimalLongitude(\"es\", 3) --> Fails!!", "0° 7′ 11,368″ W", value);
    }
    
    @Test
    public void bcn_getSexagesimalLongitude_en_3() {
        String value = bcn.getSexagesimalLongitude("en", 3);
        Assert.assertEquals("bcn.getSexagesimalLongitude(\"en\", 3) --> Fails!!", "2° 10′ 24.253″ E", value);
    }
    
    @Test
    public void mad_getSexagesimalLongitude_en_3() {
        String value = mad.getSexagesimalLongitude("en", 3);
        Assert.assertEquals("mad.getSexagesimalLongitude(\"en\", 3) --> Fails!!", "3° 42′ 13.645″ W", value);
    }
    
    @Test
    public void pmi_getSexagesimalLongitude_en_3() {
        String value = pmi.getSexagesimalLongitude("en", 3);
        Assert.assertEquals("pmi.getSexagesimalLongitude(\"en\", 3) --> Fails!!", "2° 38′ 47.882″ E", value);
    }
    
    @Test
    public void ny_getSexagesimalLongitude_en_3() {
        String value = ny.getSexagesimalLongitude("en", 3);
        Assert.assertEquals("ny.getSexagesimalLongitude(\"en\", 3) --> Fails!!", "74° 0′ 21.503″ W", value);
    }
    
    @Test
    public void ld_getSexagesimalLongitude_en_3() {
        String value = ld.getSexagesimalLongitude("en", 3);
        Assert.assertEquals("ld.getSexagesimalLongitude(\"en\", 3) --> Fails!!", "0° 7′ 11.368″ W", value);
    }
    
    @Test
    public void bcn_getSexagesimalLongitude_es_noprecision() {
        String value = bcn.getSexagesimalLongitude("es");
        Assert.assertEquals("bcn.getSexagesimalLongitude(\"es\") --> Fails!!", "2° 10′ 24,252600″ E", value);
    } 
    
    @Test
    public void mad_getSexagesimalLongitude_es_noprecision() {
        String value = mad.getSexagesimalLongitude("es");
        Assert.assertEquals("mad.getSexagesimalLongitude(\"es\") --> Fails!!", "3° 42′ 13,644720″ W", value);
    }    
    
    @Test
    public void pmi_getSexagesimalLongitude_es_noprecision() {
        String value = pmi.getSexagesimalLongitude("es");
        Assert.assertEquals("pmi.getSexagesimalLongitude(\"es\") --> Fails!!", "2° 38′ 47,882040″ E", value);
    }
    
    @Test
    public void ny_getSexagesimalLongitude_es_noprecision() {
        String value = ny.getSexagesimalLongitude("es");
        Assert.assertEquals("ny.getSexagesimalLongitude(\"es\") --> Fails!!", "74° 0′ 21,502800″ W", value);
    }
    
    @Test
    public void ld_getSexagesimalLongitude_es_noprecision() {
        String value = ld.getSexagesimalLongitude("es");
        Assert.assertEquals("ld.getSexagesimalLongitude(\"es\") --> Fails!!", "0° 7′ 11,367804″ W", value);
    }
    
    @Test
    public void bcn_getSexagesimalLongitude_en_noprecision() {
        String value = bcn.getSexagesimalLongitude("en");
        Assert.assertEquals("bcn.getSexagesimalLongitude(\"en\") --> Fails!!", "2° 10′ 24.252600″ E", value);
    }
    
    @Test
    public void mad_getSexagesimalLongitude_en_noprecision() {
        String value = mad.getSexagesimalLongitude("en");
        Assert.assertEquals("mad.getSexagesimalLongitude(\"en\") --> Fails!!", "3° 42′ 13.644720″ W", value);
    }
    
    @Test
    public void pmi_getSexagesimalLongitude_en_noprecision() {
        String value = pmi.getSexagesimalLongitude("en");
        Assert.assertEquals("pmi.getSexagesimalLongitude(\"en\") --> Fails!!", "2° 38′ 47.882040″ E", value);
    }
    
    @Test
    public void ny_getSexagesimalLongitude_en_noprecision() {
        String value = ny.getSexagesimalLongitude("en");
        Assert.assertEquals("ny.getSexagesimalLongitude(\"en\") --> Fails!!", "74° 0′ 21.502800″ W", value);
    }
    
    @Test
    public void ld_getSexagesimalLongitude_en_noprecision() {
        String value = ld.getSexagesimalLongitude("en");
        Assert.assertEquals("ld.getSexagesimalLongitude(\"en\") --> Fails!!", "0° 7′ 11.367804″ W", value);
    }
    
    @Test
    public void bcn_getSexagesimalLongitude_nolocale_3() {
        String value = bcn.getSexagesimalLongitude(3);
        Assert.assertEquals("bcn.getSexagesimalLongitude(3) --> Fails!!", "2° 10′ 24.253″ E", value);
    }
    
    @Test
    public void mad_getSexagesimalLongitude_nolocale_3() {
        String value = mad.getSexagesimalLongitude(3);
        Assert.assertEquals("mad.getSexagesimalLongitude(3) --> Fails!!", "3° 42′ 13.645″ W", value);
    }
    
    @Test
    public void pmi_getSexagesimalLongitude_nolocale_3() {
        String value = pmi.getSexagesimalLongitude(3);
        Assert.assertEquals("pmi.getSexagesimalLongitude(3) --> Fails!!", "2° 38′ 47.882″ E", value);
    }
    
    @Test
    public void ny_getSexagesimalLongitude_nolocale_3() {
        String value = ny.getSexagesimalLongitude(3);
        Assert.assertEquals("ny.getSexagesimalLongitude(3) --> Fails!!", "74° 0′ 21.503″ W", value);
    }
    
    @Test
    public void ld_getSexagesimalLongitude_nolocale_3() {
        String value = ld.getSexagesimalLongitude(3);
        Assert.assertEquals("ld.getSexagesimalLongitude(3) --> Fails!!", "0° 7′ 11.368″ W", value);
    }
    
    @Test
    public void bcn_getSexagesimalLongitude_nolocale_noprecision() {
        String value = bcn.getSexagesimalLongitude();
        Assert.assertEquals("bcn.getSexagesimalLongitude() --> Fails!!", "2° 10′ 24.252600″ E", value);
    }
    
    @Test
    public void mad_getSexagesimalLongitude_nolocale_noprecision() {
        String value = mad.getSexagesimalLongitude();
        Assert.assertEquals("mad.getSexagesimalLongitude() --> Fails!!", "3° 42′ 13.644720″ W", value);
    }
    
    @Test
    public void pmi_getSexagesimalLongitude_nolocale_noprecision() {
        String value = pmi.getSexagesimalLongitude();
        Assert.assertEquals("pmi.getSexagesimalLongitude() --> Fails!!", "2° 38′ 47.882040″ E", value);
    }
    
    @Test
    public void ny_getSexagesimalLongitude_nolocale_noprecision() {
        String value = ny.getSexagesimalLongitude();
        Assert.assertEquals("ny.getSexagesimalLongitude() --> Fails!!", "74° 0′ 21.502800″ W", value);
    }
    
    @Test
    public void ld_getSexagesimalLongitude_nolocale_noprecision() {
        String value = ld.getSexagesimalLongitude();
        Assert.assertEquals("ld.getSexagesimalLongitude() --> Fails!!", "0° 7′ 11.367804″ W", value);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Escenario: loc.toSexagesimal()">
    @Test(expected=NullPointerException.class)
    public void bcn_toSexagesimal_null() {
        bcn.toSexagesimal(null);
    }
    
    @Test(expected=NullPointerException.class)
    public void bcn_toSexagesimal_null_positive() {
        bcn.toSexagesimal(null, 5);
    }
    
    @Test(expected=NullPointerException.class)
    public void bcn_toSexagesimal_null_negative() {
        bcn.toSexagesimal(null, -5);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void bcn_toSexagesimal_nolocale_neg() {
        bcn.toSexagesimal(-10);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void bcn_toSexagesimal_locale_neg() {
        bcn.toSexagesimal("es", -10);
    }
    
    @Test
    public void bcn_toSexagesimal_es_2() {
        String value = bcn.toSexagesimal("es", 2);
        Assert.assertEquals("bcn.toSexagesimal(\"es\", 2) --> Fails!!", "41° 23′ 6,23″ N  2° 10′ 24,25″ E", value);
    }
    
    @Test
    public void mad_toSexagesimal_es_2() {
        String value = mad.toSexagesimal("es", 2);
        Assert.assertEquals("mad.toSexagesimal(\"es\", 2) --> Fails!!", "40° 25′ 0,39″ N  3° 42′ 13,64″ W", value);
    }
    
    @Test
    public void pmi_toSexagesimal_es_2() {
        String value = pmi.toSexagesimal("es", 2);
        Assert.assertEquals("pmi.toSexagesimal(\"es\", 2) --> Fails!!", "39° 34′ 16,28″ N  2° 38′ 47,88″ E", value);
    }
    
    @Test
    public void ny_toSexagesimal_es_2() {
        String value = ny.toSexagesimal("es", 2);
        Assert.assertEquals("ny.toSexagesimal(\"es\", 2) --> Fails!!", "40° 42′ 51,67″ N  74° 0′ 21,50″ W", value);
    }
    
    @Test
    public void ld_toSexagesimal_es_2() {
        String value = ld.toSexagesimal("es", 2);
        Assert.assertEquals("ld.toSexagesimal(\"es\", 2) --> Fails!!", "51° 30′ 40,37″ N  0° 7′ 11,37″ W", value);
    }
    
    @Test
    public void bcn_toSexagesimal_en_3() {
        String value = bcn.toSexagesimal("en", 3);
        Assert.assertEquals("bcn.toSexagesimal(\"en\", 3) --> Fails!!", "41° 23′ 6.230″ N  2° 10′ 24.253″ E", value);
    }
    
    @Test
    public void mad_toSexagesimal_en_3() {
        String value = mad.toSexagesimal("en", 3);
        Assert.assertEquals("mad.toSexagesimal(\"en\", 3) --> Fails!!", "40° 25′ 0.391″ N  3° 42′ 13.645″ W", value);
    }
    
    @Test
    public void pmi_toSexagesimal_en_3() {
        String value = pmi.toSexagesimal("en", 3);
        Assert.assertEquals("pmi.toSexagesimal(\"en\", 3) --> Fails!!", "39° 34′ 16.284″ N  2° 38′ 47.882″ E", value);
    }
    
    @Test
    public void ny_toSexagesimal_en_3() {
        String value = ny.toSexagesimal("en", 3);
        Assert.assertEquals("ny.toSexagesimal(\"en\", 3) --> Fails!!", "40° 42′ 51.670″ N  74° 0′ 21.503″ W", value);
    }    
    
    @Test
    public void ld_toSexagesimal_en_3() {
        String value = ld.toSexagesimal("en", 3);
        Assert.assertEquals("ld.toSexagesimal(\"en\", 3) --> Fails!!", "51° 30′ 40.370″ N  0° 7′ 11.368″ W", value);
    }
    
    @Test
    public void bcn_toSexagesimal_es_noprecision() {
        String value = bcn.toSexagesimal("es");
        Assert.assertEquals("bcn.toSexagesimal(\"es\") --> Fails!!", "41° 23′ 6,230040″ N  2° 10′ 24,252600″ E", value);
    } 
    
    @Test
    public void mad_toSexagesimal_es_noprecision() {
        String value = mad.toSexagesimal("es");
        Assert.assertEquals("mad.toSexagesimal(\"es\") --> Fails!!", "40° 25′ 0,391440″ N  3° 42′ 13,644720″ W", value);
    }
    
    @Test
    public void pmi_toSexagesimal_es_noprecision() {
        String value = pmi.toSexagesimal("es");
        Assert.assertEquals("pmi.toSexagesimal(\"es\") --> Fails!!", "39° 34′ 16,284000″ N  2° 38′ 47,882040″ E", value);
    }
    
    @Test
    public void ny_toSexagesimal_es_noprecision() {
        String value = ny.toSexagesimal("es");
        Assert.assertEquals("ny.toSexagesimal(\"es\") --> Fails!!", "40° 42′ 51,670080″ N  74° 0′ 21,502800″ W", value);
    }
    
    @Test
    public void ld_toSexagesimal_es_noprecision() {
        String value = ld.toSexagesimal("es");
        Assert.assertEquals("ld.toSexagesimal(\"es\") --> Fails!!", "51° 30′ 40,369680″ N  0° 7′ 11,367804″ W", value);
    }
    
    @Test
    public void bcn_toSexagesimal_en_noprecision() {
        String value = bcn.toSexagesimal("en");
        Assert.assertEquals("bcn.toSexagesimal(\"en\") --> Fails!!", "41° 23′ 6.230040″ N  2° 10′ 24.252600″ E", value);
    }
    
    @Test
    public void mad_toSexagesimal_en_noprecision() {
        String value = mad.toSexagesimal("en");
        Assert.assertEquals("mad.toSexagesimal(\"en\") --> Fails!!", "40° 25′ 0.391440″ N  3° 42′ 13.644720″ W", value);
    }
    
    @Test
    public void pmi_toSexagesimal_en_noprecision() {
        String value = pmi.toSexagesimal("en");
        Assert.assertEquals("pmi.toSexagesimal(\"en\") --> Fails!!", "39° 34′ 16.284000″ N  2° 38′ 47.882040″ E", value);
    }
    
    @Test
    public void ny_toSexagesimal_en_noprecision() {
        String value = ny.toSexagesimal("en");
        Assert.assertEquals("ny.toSexagesimal(\"en\") --> Fails!!", "40° 42′ 51.670080″ N  74° 0′ 21.502800″ W", value);
    }
    
    @Test
    public void ld_toSexagesimal_en_noprecision() {
        String value = ld.toSexagesimal("en");
        Assert.assertEquals("ld.toSexagesimal(\"en\") --> Fails!!", "51° 30′ 40.369680″ N  0° 7′ 11.367804″ W", value);
    }
    
    @Test
    public void bcn_toSexagesimal_nolocale_noprecision() {
        String value = bcn.toSexagesimal();
        Assert.assertEquals("bcn.toSexagesimal() --> Fails!!", "41° 23′ 6.230040″ N  2° 10′ 24.252600″ E", value);
    }
    
    @Test
    public void mad_toSexagesimal_nolocale_noprecision() {
        String value = mad.toSexagesimal();
        Assert.assertEquals("mad.toSexagesimal() --> Fails!!", "40° 25′ 0.391440″ N  3° 42′ 13.644720″ W", value);
    }
    
    @Test
    public void pmi_toSexagesimal_nolocale_noprecision() {
        String value = pmi.toSexagesimal();
        Assert.assertEquals("pmi.toSexagesimal() --> Fails!!", "39° 34′ 16.284000″ N  2° 38′ 47.882040″ E", value);
    }
    
    @Test
    public void ny_toSexagesimal_nolocale_noprecision() {
        String value = ny.toSexagesimal();
        Assert.assertEquals("ny.toSexagesimal() --> Fails!!", "40° 42′ 51.670080″ N  74° 0′ 21.502800″ W", value);
    }
    
    @Test
    public void ld_toSexagesimal_nolocale_noprecision() {
        String value = ld.toSexagesimal();
        Assert.assertEquals("ld.toSexagesimal() --> Fails!!", "51° 30′ 40.369680″ N  0° 7′ 11.367804″ W", value);
    }
    
    @Test
    public void bcn_toSexagesimal_nolocale_3() {
        String value = bcn.toSexagesimal(3);
        Assert.assertEquals("bcn.toSexagesimal(3) --> Fails!!", "41° 23′ 6.230″ N  2° 10′ 24.253″ E", value);
    }
    
    @Test
    public void mad_toSexagesimal_nolocale_3() {
        String value = mad.toSexagesimal(3);
        Assert.assertEquals("mad.toSexagesimal(3) --> Fails!!", "40° 25′ 0.391″ N  3° 42′ 13.645″ W", value);
    }
    
    @Test
    public void pmi_toSexagesimal_nolocale_3() {
        String value = pmi.toSexagesimal(3);
        Assert.assertEquals("pmi.toSexagesimal(3) --> Fails!!", "39° 34′ 16.284″ N  2° 38′ 47.882″ E", value);
    }
    
    @Test
    public void ny_toSexagesimal_nolocale_3() {
        String value = ny.toSexagesimal(3);
        Assert.assertEquals("ny.toSexagesimal(3) --> Fails!!", "40° 42′ 51.670″ N  74° 0′ 21.503″ W", value);
    }
    
    @Test
    public void ld_toSexagesimal_nolocale_3() {
        String value = ld.toSexagesimal(3);
        Assert.assertEquals("ld.toSexagesimal(3) --> Fails!!", "51° 30′ 40.370″ N  0° 7′ 11.368″ W", value);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Escenario: loc.getDistanceTo(l2)">
    
    @Test(expected = NullPointerException.class)
    public void bcn_getDistanceTo_null_error() {
        bcn.getDistanceTo(null);
    }
    
    @Test
    public void bcn_getDistanceTo_mad() {
        double distance = bcn.getDistanceTo(mad);
        Assert.assertEquals("bcn.getDistanceTo(mad) --> Fails!!", 505.4429, distance, 0.01D);
    }
    
    @Test
    public void mad_getDistanceTo_bcn() {
        double distance = mad.getDistanceTo(bcn);
        Assert.assertEquals("mad.getDistanceTo((bcn) --> Fails!!", 505.4429, distance, 0.01D);
    }
    
    @Test
    public void bcn_getDistanceTo_pmi() {
        double distance = bcn.getDistanceTo(pmi);
        Assert.assertEquals("bcn.getDistanceTo(pmi) --> Fails!!", 205.6257, distance, 0.01D);
    }
    
    @Test
    public void pmi_getDistanceTo_bcn() {
        double distance = pmi.getDistanceTo(bcn);
        Assert.assertEquals("pmi.getDistanceTo(bcn) --> Fails!!", 205.6257, distance, 0.01D);
    }
    
    @Test
    public void bcn_getDistanceTo_ny() {
        double distance = bcn.getDistanceTo(ny);
        Assert.assertEquals("bcn.getDistanceTo(ny) --> Fails!!", 6166.034, distance, 0.01D);
    }
    
    @Test
    public void ny_getDistanceTo_bcn() {
        double distance = ny.getDistanceTo(bcn);
        Assert.assertEquals("ny.getDistanceTo(bcn) --> Fails!!", 6166.034, distance, 0.01D);
    }
    
    @Test
    public void bcn_getDistanceTo_ld() {
        double distance = bcn.getDistanceTo(ld);
        Assert.assertEquals("bcn.getDistanceTo(ld) --> Fails!!", 1139.4479, distance, 0.01D);
    }
    
    @Test
    public void ld_getDistanceTo_bcn() {
        double distance = ld.getDistanceTo(bcn);
        Assert.assertEquals("ld.getDistanceTo(bcn) --> Fails!!", 1139.4479, distance, 0.01D);
    }
    
    @Test
    public void bcn_getDistanceTo_bcn() {
        double distance = bcn.getDistanceTo(bcn);
        Assert.assertEquals("bcn.getDistanceTo(bcn) --> Fails!!", 0.0, distance, 0.01D);
        
    }
    
    
    //</editor-fold>
     
    //<editor-fold defaultstate="collapsed" desc="Escenario: loc.getMidpointTo(loc)">
    
    @Test(expected = NullPointerException.class)
    public void bcn_getMidpointTo_null_error() {
        bcn.getMidpointTo(null);
    }
    
    @Test
    public void bcn_getMidpointTo_mad() {
        Location midpoint = bcn.getMidpointTo(mad);
        Assert.assertEquals("bcn.getMidpointTo(mad) lat --> Fails!!", 40.938, midpoint.getLatitude(), 0.01D);
        Assert.assertEquals("bcn.getMidpointTo(mad) lon --> Fails!!", -0.786, midpoint.getLongitude(), 0.01D);
    }
    
    @Test
    public void mad_getMidpointTo_bcn() {
        Location midpoint = mad.getMidpointTo(bcn);
        Assert.assertEquals("mad.getMidpointTo(bcn) lat --> Fails!!", 40.938, midpoint.getLatitude(), 0.01D);
        Assert.assertEquals("mad.getMidpointTo(bcn) lon --> Fails!!", -0.7867, midpoint.getLongitude(), 0.01D);
    }
    
    @Test
    public void bcn_getMidpointTo_pmi() {
        Location midpoint = bcn.getMidpointTo(pmi);
        Assert.assertEquals("bcn.getMidpointTo(pmi) lat --> Fails!!", 40.483, midpoint.getLatitude(), 0.01D);
        Assert.assertEquals("bcn.getMidpointTo(pmi) lon --> Fails!!", 2.413215, midpoint.getLongitude(), 0.01D);
    }
    
    @Test
    public void pmi_getMidpointTo_bcn() {
        Location midpoint = pmi.getMidpointTo(bcn);
        Assert.assertEquals("pmi.getMidpointTo(bcn) lat --> Fails!!", 40.483, midpoint.getLatitude(), 0.01D);
        Assert.assertEquals("pmi.getMidpointTo(bcn) lon --> Fails!!", 2.413215, midpoint.getLongitude(), 0.01D);
    }
    
    @Test
    public void bcn_getMidpointTo_ny() {
        Location midpoint = bcn.getMidpointTo(ny);
        Assert.assertEquals("bcn.getMidpointTo(ny) lat --> Fails!!", 47.892, midpoint.getLatitude(), 0.01D);
        Assert.assertEquals("bcn.getMidpointTo(ny) lon --> Fails!!", -36.1451, midpoint.getLongitude(), 0.01D);
    }
    
    @Test
    public void ny_getMidpointTo_bcn() {
        Location midpoint = ny.getMidpointTo(bcn);
        Assert.assertEquals("ny.getMidpointTo(bcn) lat --> Fails!!", 47.892, midpoint.getLatitude(), 0.01D);
        Assert.assertEquals("ny.getMidpointTo(bcn) lon --> Fails!!", -36.1451, midpoint.getLongitude(), 0.01D);
    }
    
    @Test
    public void bcn_getMidpointTo_ld() {
        Location midpoint = bcn.getMidpointTo(ld);
        Assert.assertEquals("bcn.getMidpointTo(ld) lat --> Fails!!", 46.4538, midpoint.getLatitude(), 0.01D);
        Assert.assertEquals("bcn.getMidpointTo(ld) lon --> Fails!!", 1.133, midpoint.getLongitude(), 0.01D);
    }
    
    @Test
    public void ld_getMidpointTo_bcn() {
        Location midpoint = ld.getMidpointTo(bcn);
        Assert.assertEquals("ld.getMidpointTo(bcn) lat --> Fails!!", 46.4538, midpoint.getLatitude(), 0.01D);
        Assert.assertEquals("ld.getMidpointTo(bcn) lon --> Fails!!", 1.133, midpoint.getLongitude(), 0.01D);
    }
    
    @Test
    public void bcn_getMidpointTo_bcn() {
        Location midpoint = bcn.getMidpointTo(bcn);
        Assert.assertEquals("bcn.getMidpointTo(bcn) lat --> Fails!!", 41.385, midpoint.getLatitude(), 0.01D);
        Assert.assertEquals("bcn.getMidpointTo(bcn) lon --> Fails!!", 2.173, midpoint.getLongitude(), 0.01D);
    }
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Escenario: Location.getDistanceBetween(loc, loc)">
    
    @Test(expected = NullPointerException.class)
    public void Location_getDistanceBetween_null_bcn_error() {
        Location.getDistanceBetween(null, bcn);
    }
    
    @Test(expected = NullPointerException.class)
    public void Location_getDistanceBetween_bcn_null_error() {
        Location.getDistanceBetween(bcn, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void Location_getDistanceBetween_null_null_error() {
        double distance = Location.getDistanceBetween(null, null);
    }
    
    @Test
    public void Location_getDistanceBetween_bcn_mad() {
        double distance = Location.getDistanceBetween(bcn, mad);
        Assert.assertEquals("Location.getDistanceBetween(bcn, mad) --> Fails", 505.4429, distance, 0.01D);
    }
    
    @Test
    public void Location_getDistanceBetween_mad_bcn() {
        double distance = Location.getDistanceBetween(mad, bcn);
        Assert.assertEquals("Location.getDistanceBetween(mad, bcn) --> Fails", 505.4429, distance, 0.01D);
    }
    
    @Test
    public void Location_getDistanceBetween_bcn_pmi() {
        double distance = Location.getDistanceBetween(bcn, pmi);
        Assert.assertEquals("Location.getDistanceBetween(bcn, pmi) --> Fails", 205.625, distance, 0.01D);
    }
    
    @Test
    public void Location_getDistanceBetween_pmi_bcn() {
        double distance = Location.getDistanceBetween(pmi, bcn);
        Assert.assertEquals("Location.getDistanceBetween(pmi, bcn) --> Fails", 205.625, distance, 0.01D);
    }
    
    @Test
    public void Location_getDistanceBetween_bcn_ny() {
        double distance = Location.getDistanceBetween(bcn, ny);
        Assert.assertEquals("Location.getDistanceBetween(bcn, ny) --> Fails", 6166.034, distance, 0.01D);
    }
    
    @Test
    public void Location_getDistanceBetween_ny_bcn() {
        double distance = Location.getDistanceBetween(ny, bcn);
        Assert.assertEquals("Location.getDistanceBetween(ny, bcn) --> Fails", 6166.034, distance, 0.01D);
    }
    
    @Test
    public void Location_getDistanceBetween_bcn_ld() {
        double distance = Location.getDistanceBetween(bcn, ld);
        Assert.assertEquals("Location.getDistanceBetween(bcn, ld) --> Fails", 1139.4479, distance, 0.01D);
    }
    
    @Test
    public void Location_getDistanceBetween_ld_bcn() {
        double distance = Location.getDistanceBetween(ld, bcn);
        Assert.assertEquals("Location.getDistanceBetween(ld, bcn) --> Fails", 1139.4479, distance, 0.01D);
    }
    
    @Test
    public void Location_getDistanceBetween_bcn_bcn() {
        double distance = Location.getDistanceBetween(bcn, bcn);
        Assert.assertEquals("Location.getDistanceBetween(bcn, bcn) --> Fails", 0.0, distance, 0.01D);
    }
    
    //</editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc="Escenario: Location.getMidpointBetween(loc, loc)">
    
    @Test(expected = NullPointerException.class)
    public void Location_getMidpointBetween_bcn_null_error() {
        Location.getMidpointBetween(bcn, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void Location_getMidpointBetween_null_bcn_error() {
        Location.getMidpointBetween(null, bcn);
    }
    
    @Test(expected = NullPointerException.class)
    public void Location_getMidpointBetween_null_null_error() {
        Location.getMidpointBetween(null, null);
    }
    
    @Test
    public void Location_getMidpointBetween_bcn_mad() {
        Location midpoint = Location.getMidpointBetween(bcn, mad);
        Assert.assertEquals("Location.getMidpointBetween(bcn, mad) lat --> Fails!!", 40.938, midpoint.getLatitude(), 0.01D);
        Assert.assertEquals("Location.getMidpointBetween(bcn, mad) lon --> Fails!!", -0.786, midpoint.getLongitude(), 0.01D);
    }
    
    @Test
    public void Location_getMidpointBetween_mad_bcn() {
        Location midpoint = Location.getMidpointBetween(mad, bcn);
        Assert.assertEquals("Location.getMidpointBetween(mad, bcn) lat --> Fails!!", 40.938, midpoint.getLatitude(), 0.01D);
        Assert.assertEquals("Location.getMidpointBetween(mad, bcn) lon --> Fails!!", -0.7867, midpoint.getLongitude(), 0.01D);
    }
    
    
    @Test
    public void Location_getMidpointBetween_bcn_pmi() {
        Location midpoint = Location.getMidpointBetween(bcn, pmi);
        Assert.assertEquals("Location.getMidpointBetween(bcn, pmi) lat --> Fails!!", 40.483, midpoint.getLatitude(), 0.01D);
        Assert.assertEquals("Location.getMidpointBetween(bcn, pmi) lon --> Fails!!", 2.413, midpoint.getLongitude(), 0.01D);
    }
    
    @Test
    public void Location_getMidpointBetween_pmi_bcn() {
        Location midpoint = Location.getMidpointBetween(pmi, bcn);
        Assert.assertEquals("Location.getMidpointBetween(pmi, bcn) lat --> Fails!!", 40.483, midpoint.getLatitude(), 0.01D);
        Assert.assertEquals("Location.getMidpointBetween(pmi, bcn) lon --> Fails!!", 2.413, midpoint.getLongitude(), 0.01D);
    }
    
    @Test
    public void Location_getMidpointBetween_bcn_ny() {
        Location midpoint = Location.getMidpointBetween(bcn, ny);
        Assert.assertEquals("Location.getMidpointBetween(bcn, ny) lat --> Fails!!", 47.892, midpoint.getLatitude(), 0.01D);
        Assert.assertEquals("Location.getMidpointBetween(bcn, ny) lon --> Fails!!", -36.1451, midpoint.getLongitude(), 0.01D);
    }
    
    @Test
    public void Location_getMidpointBetween_ny_bcn() {
        Location midpoint = Location.getMidpointBetween(ny, bcn);
        Assert.assertEquals("Location.getMidpointBetween(ny, bcn) lat --> Fails!!", 47.892, midpoint.getLatitude(), 0.01D);
        Assert.assertEquals("Location.getMidpointBetween(ny, bcn) lon --> Fails!!", -36.1451, midpoint.getLongitude(), 0.01D);
    }
    
    @Test
    public void Location_getMidpointBetween_bcn_ld() {
        Location midpoint = Location.getMidpointBetween(bcn, ld);
        Assert.assertEquals("Location.getMidpointBetween(bcn, ld) lat --> Fails!!", 46.4538, midpoint.getLatitude(), 0.01D);
        Assert.assertEquals("Location.getMidpointBetween(bcn, ld) lon --> Fails!!", 1.133, midpoint.getLongitude(), 0.01D);
    }
    
    @Test
    public void Location_getMidpointBetween_ld_bcn() {
        Location midpoint = Location.getMidpointBetween(ld, bcn);
        Assert.assertEquals("Location.getMidpointBetween(ld, bcn) lat --> Fails!!", 46.4538, midpoint.getLatitude(), 0.01D);
        Assert.assertEquals("Location.getMidpointBetween(ld, bcn) lon --> Fails!!", 1.133, midpoint.getLongitude(), 0.01D);
    }
    
    @Test
    public void Location_getMidpointBetween_bcn_bcn() {
        Location midpoint = Location.getMidpointBetween(bcn, bcn);
        Assert.assertEquals("Location.getMidpointBetween(bcn, bcn) lat --> Fails!!", 41.385, midpoint.getLatitude(), 0.01D);
        Assert.assertEquals("Location.getMidpointBetween(bcn, bcn) lon --> Fails!!", 2.173, midpoint.getLongitude(), 0.01D);
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Escenario: loc.equals(loc)">
    public void l1_equals_null_false() {
        Assert.assertFalse("bcn.equals(null) --> Fails!!", bcn.equals(null));
        Assert.assertFalse("mad.equals(null) --> Fails!!", mad.equals(null));
        Assert.assertFalse("ny.equals(null) --> Fails!!", ny.equals(null));
    }
    
    public void l1_equals_other_type_false() {
        Assert.assertFalse("bcn.equals(\"hola\") --> Fails!!", bcn.equals("hola"));
        Assert.assertFalse("mad.equals(new Random()) --> Fails!!", mad.equals(new Random()));
        Assert.assertFalse("ny.equals(5) --> Fails!!", ny.equals(5));
    }
    
    public void l1_equals_l2_true() {
        Assert.assertTrue("bcn.equals(bcn) --> Fails!!", bcn.equals(bcn));
        Assert.assertTrue("mad.equals(mad) --> Fails!!", mad.equals(mad));
        Assert.assertTrue("ny.equals(ny) --> Fails!!", ny.equals(ny));
        
        Location newl = new Location(bcn.getLatitude(), bcn.getLongitude());
        Assert.assertTrue("bcn.equals(newl) --> Fails!!", bcn.equals(newl));
        
        newl = new Location(mad.getLatitude(), mad.getLongitude());
        Assert.assertTrue("mad.equals(newl) --> Fails!!", mad.equals(newl));
        
        newl = new Location(pmi.getLatitude(), pmi.getLongitude());
        Assert.assertTrue("pmi.equals(newl) --> Fails!!", pmi.equals(newl));
    }
    
    public void l1_equals_l2_false() {
        Assert.assertFalse("bcn.equals(mad) --> Fails!!", bcn.equals(mad));
        Assert.assertFalse("mad.equals(pmi) --> Fails!!", mad.equals(pmi));
        Assert.assertFalse("ny.equals(ld) --> Fails!!", ny.equals(ld));
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Escenario: loc.hashCode()">
    public void l1_hashCode_equals() {
        Location newl = new Location(bcn.getLatitude(), bcn.getLongitude());
        Assert.assertTrue("bcn.hashCode() == newl.hashCode() --> Fails!!", bcn.hashCode() == newl.hashCode());
        
        newl = new Location(mad.getLatitude(), mad.getLongitude());
        Assert.assertTrue("mad.hashCode() == newl.hashCode() --> Fails!!", mad.hashCode() == newl.hashCode());
        
        newl = new Location(pmi.getLatitude(), pmi.getLongitude());
        Assert.assertTrue("pmi.hashCode() == newl.hashCode() --> Fails!!", pmi.hashCode() == newl.hashCode());
    }
    
    public void l1_hashCode_false() {
        Assert.assertFalse("bcn.hashCode() == mad.hashCode() --> Fails!!", bcn.hashCode() == mad.hashCode());
        Assert.assertFalse("mad.hashCode() == pmi.hashCode() --> Fails!!", mad.hashCode() == pmi.hashCode());
        Assert.assertFalse("ny.hashCode() == ld.hashCode() --> Fails!!", ny.hashCode() == ld.hashCode());
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Escenario: loc.toString()">
    public void l1_toString() {
        Assert.assertTrue("bcn.toString() --> Fails!!", bcn.toString().contains(bcn.getDecimalLatitude()));
        Assert.assertTrue("bcn.toString() --> Fails!!", bcn.toString().contains(bcn.getDecimalLongitude()));
        
        Assert.assertTrue("mad.toString() --> Fails!!", mad.toString().contains(mad.getDecimalLatitude()));
        Assert.assertTrue("mad.toString() --> Fails!!", mad.toString().contains(mad.getDecimalLongitude()));
        
        Assert.assertTrue("mad.toString() --> Fails!!", pmi.toString().contains(pmi.getDecimalLatitude()));
        Assert.assertTrue("mad.toString() --> Fails!!", pmi.toString().contains(pmi.getDecimalLongitude()));
    }
    //</editor-fold>
    
    //</editor-fold>
    
}
