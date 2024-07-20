import javax.swing.JFrame;

import java.awt.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class Filemenu {

    public static JFrame frame;
    public static String fileName;
    public static String filepath;
    public static String directory;


    public static void newFile() {
        Frame.textArea.setText("");
        Frame.frame.setTitle("NEW");
    }

    public static void OpenFile() {
        FileDialog fileDialog = new FileDialog(frame, "Open File", FileDialog.LOAD);
        fileDialog.setVisible(true);

        if (fileDialog.getFile() != null) {
            directory = fileDialog.getDirectory();
            fileName = fileDialog.getFile();
            filepath = directory + fileName;
            Frame.frame.setTitle(fileName);

            try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
                String Line;
                Frame.textArea.setText("");
                while ((Line = reader.readLine()) != null) {
                    Frame.textArea.append(Line + "\n");
                }
            } catch (IOException e) {
                System.out.println("File not opend");

            }
        }

    }
    public  static void SaveAs() {
        FileDialog fileDialog = new FileDialog(frame, "Save File", FileDialog.SAVE);
        fileDialog.setVisible(true);

        if (fileDialog.getFile() != null) {
            directory = fileDialog.getDirectory();
            fileName = fileDialog.getFile();
            filepath = directory + fileName;
            Frame.frame.setTitle(fileName);

            try {
                FileWriter write = new FileWriter(filepath);
                write.write(Frame.textArea.getText());
                write.close();
            }
            catch (IOException e){
                System.out.println("File can not be saved");
            }

        }
    }

    public static void Save(){
        if (fileName == null){
            SaveAs();
        }
        else {
            try {
                FileWriter write = new FileWriter(filepath);
                write.write(Frame.textArea.getText());
                write.close();
            }
            catch (IOException e){
                System.out.println("File can not be saved");
            }
        }
    }
}
