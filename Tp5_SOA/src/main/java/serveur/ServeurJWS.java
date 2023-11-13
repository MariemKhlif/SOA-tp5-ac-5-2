package serveur;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;

import static jakarta.xml.ws.Endpoint.publish;

public class ServeurJWS {
    public static void main(String[] args) {
        // Crée une instance du banque service
        BanqueService bs = new BanqueService();
        // URL du service web
        String url = "http://localhost:8084/";
        Endpoint.publish(url, bs);
        // Affichege de l'URL du serveur
        System.out.println("Server url: " + url);
    }
}
