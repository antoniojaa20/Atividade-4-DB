import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Preferencia {
    public static List<Map<String, Object>> lerDadosDeArquivoJSON(String nomeArquivo) {
        List<Map<String, Object>> dados = new ArrayList<>();

        try (FileReader file = new FileReader(nomeArquivo)) {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(file);
            JSONArray jsonArray = (JSONArray) obj;

            for (Object jsonObj : jsonArray) {
                JSONObject jsonHospede = (JSONObject) jsonObj;
                dados.add(jsonHospede);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return dados;
    }

    public static void salvarDadosEmArquivoJSON(List<Map<String, Object>> dados, String nomeArquivo) {
        try (FileWriter file = new FileWriter(nomeArquivo)) {
            JSONArray jsonArray = new JSONArray();
            jsonArray.addAll(dados);
            file.write(jsonArray.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
