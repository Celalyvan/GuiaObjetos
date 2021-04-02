public class Main {
    public static void main(String[] args) {
        int[] array= {1,2,3}; //= new Integer[]();

        for (int i=0 ; i< array.length; i++)
        {
            System.out.println(array[i]);
        }

        System.out.println("foreach");
        // por cada variable de una clase iterable
        //(tipo de dato que levanta la info :elemento sobre el q voy a iterar)

        for (int aux : array) {
            System.out.println(aux);
        }
    }
}
