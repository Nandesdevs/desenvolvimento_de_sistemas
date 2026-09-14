public class Vetores {
        public static void main(String[] args){
        int [] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        //ou

        int [] numeros1 = {10,20,30,40};

        //percorre o vetor
        for(int i = 0; i < numeros1.length; i ++) {
            System.out.println("Indice " + i +": " + numeros1[i]);
        }

        //outra forma de percorrer
        for (int numero1 : numeros1){
            int i = 1;
            System.out.println("Indice "+ i + ": " + numero1);
            i += 1;
        }

    // Acessando os valores do vetor
    System.out.println("primeiro elemento: " + numeros[0]);
    }   
}
