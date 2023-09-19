package RegrasEKS;

import java.util.Scanner;

public class RegrasEKS {
    public static void main(String[] args) {
        // Definindo as regras básicas
        int podsPorNode = 10;
        int podsPorServidor = 4;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        int numeroTotalPods = scanner.nextInt();

        // 1 node <= 10 pods
        // 1 server <= 4 ods
        //TODO: Calcule o número mínimo de nodes necessários
        int numeroMinimoNodes = numMinPods(podsPorNode, numeroTotalPods);

        //TODO: Calcule o número mínimo de servidores necessários
        int numeroMinimoServidores = numMinServer(podsPorServidor, numeroTotalPods);

        //TODO: Exiba o resultado com as recomendações de quantidades de servidores e nodes.
        //System.out.printf("numeroMinimoNodes:%d\n", numeroMinimoNodes);
        if (numeroMinimoNodes <= 1) System.out.println("1.Recomendamos usar um unico node");
        else System.out.printf("1.Numero minimo de nodes:%d\n", numeroMinimoNodes);

        //System.out.printf("numeroMinimoServidores:%d\n", numeroMinimoServidores);
        if (numeroMinimoServidores <= 1) System.out.println("2.Recomendamos usar um unico servidor");
        else System.out.printf("2.Numero minimo de servidores:%d\n", numeroMinimoServidores);
        // Fechando o Scanner
       scanner.close();
    }

    private static int numMinServer(int podsPorServidor, int numeroTotalPods) {

        int CalcMinServer = (int) Math.round((double) numeroTotalPods / podsPorServidor);
        return CalcMinServer;
    }

    private static int numMinPods(int podsPorNode, int numeroTotalPods) {
        int CalcMinPods = (int) Math.round((double) numeroTotalPods / podsPorNode);
        return CalcMinPods;
    }
}