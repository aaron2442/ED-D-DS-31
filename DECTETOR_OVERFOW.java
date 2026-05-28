public class DECTETOR_OVERFOW{
    public static void main(String[] args) {

       
        int numeroInt = Integer.MAX_VALUE;

        System.out.println("Valor máximo int: " + numeroInt);

        numeroInt = numeroInt + 1;

        System.out.println("Después de sumar 1: " + numeroInt);


    
        long numeroLong = (long) Integer.MAX_VALUE;

        System.out.println("\nValor máximo convertido a long: " + numeroLong);

        numeroLong = numeroLong + 1;

        System.out.println("Después de sumar 1 usando long: " + numeroLong);
    }
}
