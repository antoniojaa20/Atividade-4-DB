import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String nomeArquivo = "preferencias.json"; 
        List<Map<String, Object>> dados = Preferencia.lerDadosDeArquivoJSON(nomeArquivo);

        for (Map<String, Object> hospede : dados) {
            String nome = (String) hospede.get("Nome do Hóspede");
            String preferenciaAlimentacao = (String) hospede.get("Preferência de Alimentação");
            String solicitacoesEspeciais = (String) hospede.get("Solicitações Especiais");
            List<String> atividadesLazer = (List<String>) hospede.get("Atividades de Lazer");

            // Faça o que você precisa com os dados
            System.out.println("Nome do Hóspede: " + nome);
            System.out.println("Preferência de Alimentação: " + preferenciaAlimentacao);
            System.out.println("Solicitações Especiais: " + solicitacoesEspeciais);
            System.out.println("Atividades de Lazer: " + atividadesLazer);
        }
    }
}
