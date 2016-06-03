public class Orden4 {
        static { sumar(2); }

        static void sumar (int num){
            System.out.print(num+" ");
        }

        static { sumar(4); }

        { sumar(5);}

        static { new Orden4(); }

        { sumar(8);}

        public static void main(String[] args){ }
}