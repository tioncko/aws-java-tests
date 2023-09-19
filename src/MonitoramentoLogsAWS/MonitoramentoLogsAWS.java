package MonitoramentoLogsAWS;

import java.util.*;

public class MonitoramentoLogsAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Map<String, Long> eventosPorServico = new HashMap<>();

        List<String> Servicos = new ArrayList<>();

        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1];
            Servicos.add(servico);
        }

        for(String server : Servicos){
            int c = 0;
            for(int i = 0; i < Servicos.size(); i++)
            {
                String s = Servicos.get(i);
                if(s.contains(server)) c++;
            }
            eventosPorServico.put(server, (long) c);
        }

        //TODO: Imprima a saída no padrão definido no enunciado deste desafio.

        System.out.println("Eventos por servico:");

        StringBuilder sb = new StringBuilder();
        eventosPorServico.forEach((key, value) -> {
            sb.append(key).append(":").append(value).append("\n");//.append("}");
        });
        String result = sb.toString();
        System.out.printf(result);

        //TODO: Identifique no mapa os serviços com maior e menor quantidade de logs.
        //      Dica: Utilize Java Streams para tornar essa tarefa mais simples.

        Map.Entry<String, Long> maxx = Collections.max(eventosPorServico.entrySet(), (entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()));
        System.out.printf("Maior:%s\n", maxx.getKey());

        Map.Entry<String, Long> minn = Collections.min(eventosPorServico.entrySet(), (entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()));
        System.out.printf("Menor:%s", minn.getKey());

        /* OUTRA FORMA DE APLICAR O LAMBDA ACIMA
Map.Entry<String, Double> min = Collections.min(map.entrySet(), new Comparator<Map.Entry<String, Double>>() {
    public int compare(Map.Entry<String, Double> entry1, Map.Entry<String, Double> entry2) {
        return entry1.getValue().compareTo(entry2.getValue());
    }
});
        * */

    }
}