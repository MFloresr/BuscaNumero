import java.util.*;

public class Main {

    public static final int CANTIDADNUMERO = 1000000;

    public static void main(String[] args) {


        Random aleatori = new Random();
        ArrayList numeros = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce un numero para buscar en la lista: ");
        Integer numeropant = input.nextInt();

        // guardar timestamp inicio
        long start = System.currentTimeMillis();
        //hacemos algo
        for (int i = 0; i < CANTIDADNUMERO; i++) {
            int numero = aleatori.nextInt(10000000 + 1);
            numeros.add(numero);
        }

        Collections.sort(numeros);

        for(int i=0;i<numeros.size();i++){
            Integer comparenumber = (Integer) numeros.get(i);
            if(numeropant == comparenumber){
                System.out.println("El numero "+ numeropant +" se encuentra la lista en la posicion "+ i);
            }
        }

        // calcular tiempo transcurrido
        long end = System.currentTimeMillis();
        long resultado = end - start;
        System.out.println("Segundos: "+resultado/1000);

        /*for(int i=0;i<numeros.size();i++){
            System.out.println(numeros.get(i));
        }*/


    }
}
