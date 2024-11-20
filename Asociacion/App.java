package Asociacion;

import java.util.Arrays;
import java.util.Scanner;
import Asociacion.modelos.*;

public class App {
    public static String clear = "\033\143";
    private static Jugador[] playerList = {};
    private static Equipo[] teamList = {};

    public static void main(String[] args) {
        Scanner tScan = new Scanner(System.in);
        System.out.print(clear); // Limpia la consola
        boolean continuar;
        do {
            continuar = menu(tScan);
        } while (continuar);
        System.out.print(clear);
        System.out.println("¡Hasta pronto!");
    }

    public static boolean menu(Scanner sc){
        System.out.print(clear); // Limpia la consola
        boolean output = true;
        System.out.println("___LIGA TAPITAS___\nSeleccione la opción que desea ejectar\n1. Crear nuevo jugador.\n2. Crear nuevo equipo\n3. Asignar jugador a equipo.\n4. Mostrar lista de jugadores.\n5. Mostrar lista de equipos.\n6. Salir.");
        int option = Integer.valueOf(sc.nextLine());
        if (option == 1 || option == 2 || (playerList.length > 0 && teamList.length>0)) {
            switch (option) {
                case 1:
                    System.out.print(clear);
                    System.out.print("Ingrese el nombre del jugador: ");
                    String playerName = sc.nextLine();
                    Jugador player = new Jugador();
                    player.setName(playerName);
                    playerList = Arrays.copyOf(playerList,playerList.length+1);
                    playerList[playerList.length-1]=player;
                    break;
                case 2:
                    System.out.print(clear);
                    System.out.print("Ingrese el nombre del equipo: ");
                    String teamName = sc.nextLine();
                    Equipo team = new Equipo();
                    team.setName(teamName);
                    teamList = Arrays.copyOf(teamList,teamList.length+1);
                    teamList[teamList.length-1]=team;
                    break;
                case 3:
                    System.out.print(clear);
                    System.out.print("Ingrese la posición del jugador que desea asignar: ");
                    int jugPos = Integer.valueOf(sc.nextLine());
                    System.out.print("Ingrese la posición del equipo al que lo desea asignar: ");
                    int teamPos = Integer.valueOf(sc.nextLine());
                    Jugador[] listaLocal;
                    try {
                        listaLocal = teamList[teamPos].getPlayers();
                        listaLocal = Arrays.copyOf(listaLocal,listaLocal.length+1);
                        listaLocal[listaLocal.length]=playerList[jugPos];
                    } catch (Exception e) {
                        listaLocal=new Jugador[1];
                        listaLocal[0] = playerList[jugPos];
                    }
                    
                    teamList[teamPos].setPlayers(listaLocal);
                    playerList[jugPos].setTeam(teamList[teamPos]);
                    break;
                case 4:
                    System.out.print(clear);
                    String[] namesPlayers = new String[playerList.length];
                    for (int i=0;i<namesPlayers.length;i++) {
                        namesPlayers[i] = playerList[i].getName();
                    }
                    System.out.println(Arrays.toString(namesPlayers));
                    break;
                case 5:
                    System.out.print(clear); // Limpia la consola
                    String[] namesTeams = new String[teamList.length];
                    for (int i=0;i<namesTeams.length;i++) {
                        namesTeams[i] = teamList[i].getName();
                    }
                    System.out.println(Arrays.toString(namesTeams));;
                    break;
                case 6:
                    System.out.print(clear); // Limpia la consola
                    output = false;
                    break;
    
                default:
                    System.out.print(clear); // Limpia la consola
                    System.out.println("Opción no válida");
                    break;
            }
        }else{
            System.out.print(clear);
            System.out.println("Para poder continuar debes crear al menos un jugador.");
        }
        
        System.out.print("Presiona enter para continuar: ");
        sc.nextLine();

        return output;

    }

}
