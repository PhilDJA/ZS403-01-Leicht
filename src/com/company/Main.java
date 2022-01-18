package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //System.out.println("\n#############################################################################\n" +
        //        "#                                                                           #"+
        //        "\n#       Guten Tag, willkommen bei der Datenbank für Personenerfassung.      #\n#"+
        //                ""+
        //        "                                                                    "+
        //        "       #\n#                           Was möchten Sie tun?:" +
        //        "                           #\n#                                                        "+
        //        "                   #\n"+
        //        "#          >    Neue Person registrieren                -->   '1'           #\n"
        //        +"#          >    Alle vorhandenen Personen ausgeben      -->   '2'           #\n"
        //        +"#          >    Eine Person löschen                     -->   '3'           #\n"
        //        +"#          >    Details einer Person anzeigen           -->   '4'           #\n"
        //        +"#       " +
        //        "   >    Personenregistrierung schliessen        -->   '5'           #\n#"+
        //        "                                                                           #\n"+
        //        "#############################################################################\n\n" +
        //        "Geben Sie Ihre Auswahl ein und bestätigen Sie mit [Enter]:");





        Scanner scanner = new Scanner(System.in);
        int UserInput = scanner.nextInt();


        if(UserInput==1){

        } else if (UserInput==2){

        } else if (UserInput==3){

        }else if (UserInput==4){

        }else if (UserInput==5){

        }else{
            System.out.println("Bitte treffen Sie eine Auswahl mit den Zahlen zwischen 1 - 5 ein.");
        }



    }
}