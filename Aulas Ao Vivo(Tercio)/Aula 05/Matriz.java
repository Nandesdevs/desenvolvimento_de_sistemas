public class Matriz {
    public static void main(String[] args) {
        // matriz 3x3
        int[][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // percorre a matriz
        for (int i = 0; i < matriz.length; i++){ // escolhe a linha para percorrer
            for (int j = 0; j < matriz[i].length;j++){ // matriz[i].length percorre todas as colunas da linha do primeiro loop 
                System.out.println("["+ i +"]["+ j +"] ="+ matriz[i][j]);
            }
        }

        // outra forma de percorrer
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.println(valor);
            }
        }

        // mostra posição especifica
        System.out.println("Matriz na posição(0:0): " + matriz[0][0]);
    }    
}
