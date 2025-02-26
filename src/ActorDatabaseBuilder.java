import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors


public class ActorDatabaseBuilder {
    String fileName;
    public ActorDatabaseBuilder(String fileName) {
        this.fileName = fileName;
    }

    // Creating the file
    public void createFile() {

        try {
            File createTheBaconArmy = new File("MovieData/filename.txt");
            if (createTheBaconArmy.createNewFile()) {
                System.out.println("File created: " + createTheBaconArmy.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    // Writing to file
    public void writeActor(String actorName, int baconNumber) {
        try {
            FileWriter baconWriter = new FileWriter(fileName);
            baconWriter.write("Kevin Bacon:0");
            baconWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}


