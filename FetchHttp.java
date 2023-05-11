import java.net.URI;
import java.net.http.*;
import java.net.http.HttpResponse.BodyHandlers;

public class FetchHttp extends Thread {
    public void run(String url) {
        System.out.println("run was called");

        // Try to use run to call the protected function
        // get a URI
        try {
            get(url);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    protected void get(String url) throws Exception {
        String randString = Integer.toString((int)(Math.random() * 8000));
        HttpClient http = HttpClient.newHttpClient();
        HttpRequest req = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .header("Accept", "text/plain")
            .header("User-Agent", randString)
            .build();

        HttpResponse<String> res = http.send(req, BodyHandlers.ofString());
        
        System.out.println(res.body());
    }
} 