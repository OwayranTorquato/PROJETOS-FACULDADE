public class Main {
    public static void main(String[] args) {
        Repeated repeated = new Repeated();
        int num = 547856988;

        int sumDigits = repeated.repeatedSum(num); // Chama o método
        
        //Exibe o resultado da soma repetida dos dígitos
        System.out.println("A soma repetida dos dígitos de " + num + " é: " + sumDigits);
    }
}
