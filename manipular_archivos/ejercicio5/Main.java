package ejercicio5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
//Carlos Tenajas
public class Main {

    public static void main(String[] args) {
    	System.out.println("Introduce la ruta al archivo:");
    	Scanner sc = new Scanner(System.in);
    	String ruta = sc.next();
    	File archivo = new File(ruta);
        String carpetaEquipos = "equipos";
        Map<String, List<String>> jugadoresPorEquipo = new HashMap<>();
       
			
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            br.readLine(); // Descartamos la primera línea con los encabezados
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                String nombreEquipo = campos[7].replace("_", " ");
                if (!jugadoresPorEquipo.containsKey(nombreEquipo)) {
                    jugadoresPorEquipo.put(nombreEquipo, new ArrayList<>());
                }
                jugadoresPorEquipo.get(nombreEquipo).add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Map.Entry<String, List<String>> equipo : jugadoresPorEquipo.entrySet()) {
            String nombreEquipo = equipo.getKey();
            List<String> jugadores = equipo.getValue();
            File carpeta = new File(carpetaEquipos);
            if (!carpeta.exists()) {
                carpeta.mkdir();
            }
            try (FileWriter fw = new FileWriter(carpetaEquipos + File.separator + nombreEquipo + ".csv")) {
                fw.write("full_name,age,birthday,birthday_GMT,league,season,position,Current Club,minutes_played_overall,minutes_played_home,minutes_played_away,nationality,appearances_overall,appearances_home,appearances_away,goals_overall,goals_home,goals_away,assists_overall,assists_home,assists_away,penalty_goals,penalty_misses,clean_sheets_overall,clean_sheets_home,clean_sheets_away,conceded_overall,conceded_home,conceded_away,yellow_cards_overall,red_cards_overall,goals_involved_per_90_overall,assists_per_90_overall,goals_per_90_overall,goals_per_90_home,goals_per_90_away,min_per_goal_overall,conceded_per_90_overall,min_per_conceded_overall,min_per_match,min_per_card_overall,min_per_assist_overall,cards_per_90_overall,rank_in_league_top_attackers,rank_in_league_top_midfielders,rank_in_league_top_defenders,rank_in_club_top_scorer\n");
                for (String jugador : jugadores) {
                    fw.write(jugador.replace("_", " ") + "\n");
                }
                fw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        sc.close();
    }

}