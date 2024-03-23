public class Repeated {
    //Criando a função para realizar a soma dos dígitos
    public int repeatedSum(int num){
        //Retorno de que o número foi recebido
        System.out.println("O número recebido foi: " + num);
        
        //o loop que irá extrair os digitos
        while (num >= 10){
            //lógica do processo
            int sum = 0;
            int originalNum = num; //salvando o numero origina
            while (num > 0){
                sum += num % 10; //add ultimo digito a soma
                num /= 10; //removendo o ultimo digito
            }
            System.out.println("Soma dos dígitos de " + originalNum + " = " + sum);
            //Se a soma ainda tiver mais de um dígito, atualiza num com a soma dos dígitos
            if (sum >= 10) {
                num = sum; 
            } else {
                //Retorna se houver apenas um digito
                System.out.println("A soma repetida dos dígitos de " + originalNum + " é: " + sum);
                return sum; 
            }
        }
        // Retorna num se ele tiver apenas um dígito
        System.out.println("A soma repetida dos dígitos de " + num + " é: " + num);
        return num; 
    }
}
