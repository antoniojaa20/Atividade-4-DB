package com.unifacisa.Aula04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
    public static void main( String[] args ) throws JsonGenerationException, JsonMappingException, IOException
    {
    	ObjectMapper mapper = new ObjectMapper();

        // Serialize
        StringWriter writer = new StringWriter();
        mapper.writeValue(writer, getPessoas());
        System.out.println(writer);
        
        try (PrintWriter out = new PrintWriter(new FileWriter("arquivo.json"))) {
            out.println(writer.toString());
        }

        // Deserialize
    String jsonInput = "[{\"id\":1,\"nome\":\"Lucas\",\"idade\":29,\"matricula\":\"123456\",\"telefone\":\"8394002-8922\"},"
            + "{\"id\":2,\"nome\":\"Maria\",\"idade\":40,\"matricula\":\"654321\",\"telefone\":\"8393322-9988\"},"
            + "{\"id\":3,\"nome\":\"Jose\",\"idade\":33,\"matricula\":\"567890\",\"telefone\":\"8391234-5678\"}]";
        List<Pessoa> p = mapper.readValue(jsonInput, new TypeReference<List<Pessoa>>(){});
        System.out.println("Pessoa: " + p);

    }
    private static List<Pessoa> getPessoas() {

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        Pessoa p1 = new Pessoa();
        p1.setId(1);
        p1.setNome("Lucas");
        p1.setIdade(29);
        p1.setMatricula("123456");
        p1.setTelefone("8394002-8922");

        Pessoa p2 = new Pessoa();
        p2.setId(2);
        p2.setNome("Maria");
        p2.setIdade(40);
        p2.setMatricula("654321");
        p2.setTelefone("8393322-9988");

        Pessoa p3 = new Pessoa();
        p3.setId(3);
        p3.setNome("Jose");
        p3.setIdade(33);
        p3.setMatricula("567890");
        p3.setTelefone("8391234-5678");

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        return pessoas;
    }
}
