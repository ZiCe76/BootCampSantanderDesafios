import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class TerminalSearch {
    public static void main(String[] args) {
        try {
            // Cria um leitor de entrada para ler a entrada do usuário
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter search term: ");
            String searchTerm = reader.readLine(); // Lê o termo de pesquisa fornecido pelo usuário

            // Codifica o termo de pesquisa para que seja seguro em uma URL
            String encodedSearchTerm = URLEncoder.encode(searchTerm, StandardCharsets.UTF_8);
            
            // Monta a URL de pesquisa usando o Google como exemplo
            String searchUrl = "https://www.google.com/search?q=" + encodedSearchTerm;

            // Cria uma instância do HttpClient para fazer a solicitação HTTP
            HttpClient client = HttpClient.newHttpClient();
            
            // Cria uma solicitação HTTP com a URL de pesquisa fornecida
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new java.net.URI(searchUrl)) // Cria uma URI a partir da URL de pesquisa
                    .build();

            // Envia a solicitação HTTP e recebe a resposta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Obtém o corpo da resposta HTTP (o conteúdo da página de pesquisa)
            String responseBody = response.body();

            // Imprime o conteúdo da página de pesquisa no terminal
            System.out.println(responseBody);
        } catch (IOException | InterruptedException | URISyntaxException e) {
            // Lida com exceções que podem ocorrer durante a leitura da entrada, a solicitação HTTP ou a criação da URI
            e.printStackTrace();
        }
    }
}
