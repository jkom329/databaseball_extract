package com.databaseball;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	//Comments
        String gameID="";
        String visitors="";
        String hosts="";
        BoxScore box = new BoxScore();
        File file = new File("test");
        if ( file.exists() ){

            try {
                //get a file scanner
                Scanner inFile = new Scanner(file);
                //Get the products line by line
                while ( inFile.hasNext() ) {
                    String line = inFile.nextLine();

                    String fields[]=line.split(",");

                    //id, 1 of 10 options
                    if (fields[0].equals("id")){
                        //Start of a new game
                        gameID=fields[1];
                        System.out.println(gameID);
                        //new boxscore created here.
                        box.setID(gameID);
                    }
                    //info, 2 of 10
                    else if(fields[0].equals("info")){
                        if (fields[1].equals("visteam")){
                            visitors=fields[2];
                        }
                        else if (fields[1].equals("hometeam")){
                            hosts = fields[2];
                        }

                    }
                    //need to have the box score started at this point
                    //start, 3 of 10
                    else if (fields[0].equals("start")){
                        //create line score and stat blocks when you know you've seen the teams
                        box.makeLineScore(new Team(hosts), new Team(visitors));
                        box.getBattingStats().addBatter(new Player(fields[2],fields[1]),Integer.valueOf(fields[3]));
                    }
                    //play, meat and potatoes, 4 of 10
                    else if(fields[0].equals("play")){

                    }
                    //sub, 5 of 10
                    else if(fields[0].equals("sub")){

                    }
                    //data, 6 of 10
                    else if(fields[0].equals("")) {

                    }

                }
                //close the file when we are done
                inFile.close();
            }
            catch (FileNotFoundException e) {
                //Catch the exception in case new Scanner assignment fails
                System.out.println("Error: Cannot access file");
            }
        }
        //If for some reason we have no file but didn't get an exception.
        else {
            System.out.println("Error: Cannot access file");
        }

        System.out.println("Check");
    }
}
