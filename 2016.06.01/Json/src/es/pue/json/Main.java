package es.pue.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {

    // De objeto Java a String JSON
    Persona p1 = new Persona();
    p1.nombre = "Joan";
    p1.edad = 50;
    p1.pasta = 0.45;
    p1.hijos = new String[] { "Frodo", "Trancos" };

    Persona p2 = new Persona();
    p2.nombre = "Ventura";
    p2.edad = 48;
    p2.pasta = 0.12;
    p2.hijos = new String[] { "Uno", "Dos", "Tres" };

    HashMap<String, Persona> hs = new HashMap<>();
    hs.put("Joan", p1);
    hs.put("Ventura", p2);

    GsonBuilder builder = new GsonBuilder();
    Gson gson = builder.setPrettyPrinting().create();

    String mapaPersonas = gson.toJson(hs);

    System.out.println(mapaPersonas);


    // De String JSON a objeto Java
    Type tipoHashMap = new TypeToken<HashMap<String, Persona>>(){}.getType();
    HashMap<String, Persona> hs2 = gson.fromJson(mapaPersonas, tipoHashMap);

    System.out.println(hs2.get("Joan").pasta);
  }
}
