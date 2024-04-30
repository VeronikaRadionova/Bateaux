package connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConnectionOcaml {
	/**
     * Exécute le programme OCaml pour traiter les points du client.
     *
     * 
     * @return une chaîne représentant le résultat du traitement OCaml
     */
    public static String processClient(String jourAjd, String moisAjd, String nbHeure, String prixHeure) {
        String answer = "";

        try {
            // Chemin vers le fichier OCaml
            String ocamlPath = "ocaml/prix.ml";
            // Exécutable OCaml
            String ocamlExecutable = "ocaml";

            // Construction de la commande pour exécuter le programme OCaml
            ProcessBuilder processBuilder = new ProcessBuilder(ocamlExecutable, ocamlPath,
            		jourAjd, moisAjd, nbHeure, prixHeure);

            // Redirection de la sortie d'erreur pour la fusionner avec la sortie standard
            processBuilder.redirectErrorStream(true);

            // Démarrage du processus OCaml
            java.lang.Process process = processBuilder.start();

            String line;

            // Lecture de la sortie du programme OCaml
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((line = reader.readLine()) != null) {
                answer = line;
            }

            // Attente que le processus se termine et récupération du code de sortie
            int exitCode = process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return answer;
    }
}

