import java.awt.*;
import javax.swing.JColorChooser;
public class FormatMenu {

    public static void bold() {
        Font CurrentFont = Frame.textArea.getFont();
        Font boldfont = CurrentFont.deriveFont(Font.BOLD);
        Frame.textArea.setFont(boldfont);
    }

    public static void italic() {
        Font CurrentFont = Frame.textArea.getFont();
        Font italicfont = CurrentFont.deriveFont(Font.ITALIC);
        Frame.textArea.setFont(italicfont);
    }

    public static void fontcolor(){
        Color selectedcolor = JColorChooser.showDialog(null, "Selet Font Color", Color.BLACK);
        if (selectedcolor != null);
        Frame.textArea.setForeground(selectedcolor);
    }}
