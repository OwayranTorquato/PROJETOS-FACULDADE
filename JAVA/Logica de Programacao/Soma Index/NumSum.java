public class NumSum {
    //Criar o método tendo como parâmetro um array de nums e um target a ser encontrado
    public void numSum(int[] nums, int target){
        // utilizar o for para percorrer o array
        for (int i = 0; i<nums.length - 1; i++){
            // verificar se o numero está presente no array
            for (int j = i +1; j < nums.length; j++){
                if (nums[i] + nums [j] == target){
                    System.out.println("Dois elementos dentro deste array que somam: " + target + ": " + nums[i] + " e " + nums[j]);
                    return;
                }
            }

        }
        // Se nao for encontrado, retorna a mensagem
        System.out.println("Não foi possível encontrar elementos que somados resultam em " + target);
    }
    }

