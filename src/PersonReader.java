import javax.swing.*;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class PersonReader {
    public static void main(String[] args){
        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        String rec = "";
        ArrayList<String> lines = new ArrayList<>();

        try{
            File workingDirectory = new File(System.getProperty("user.dir"));

            chooser.setCurrentDirectory(workingDirectory);

            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
                selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();
                InputSystem in =
                        new BufferedInputStream(Files.newInputStream(file, CREATE));
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(in));

                int line = 0;
                while(reader.ready()){
                    String[] fields;
                    for(String l:lines){
                        fields = l.split(",");

                        if(fields.length == FIELDS_LENGTH){
                            id        = fields[0].trim();
                            title     = fields[1].trim();
                            firstName = fields[2].trim();
                            lastName  = fields[3].trim();
                            yob       = Integer.parseInt(fields[4].trim());
                            System.out.printf()
                        }
                    }
                }
            }
        }
    }
}
