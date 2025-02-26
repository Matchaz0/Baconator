import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToBacon {
    public void writeActor(String fileName, String actorName, int baconNumber) {
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