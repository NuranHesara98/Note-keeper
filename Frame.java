import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.AllPermission;


public class Frame {
    public static JFrame frame;
    public static JTextArea textArea;
    public static void main (String [] args){
        creatFrame();
        creatTextArea();
        creatMenu();

        frame.setVisible(true);

    }
    public static void creatFrame(){
        frame = new JFrame("Note Keeper");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("D:/JAVA UDEMY/icon.PNG");
        frame.setIconImage(icon.getImage());
    }
    public static void creatTextArea(){
        textArea = new JTextArea();
        frame.add(textArea);

        JScrollPane scrolbar = new JScrollPane(textArea);
        scrolbar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrolbar.setBorder(BorderFactory.createEmptyBorder());
        frame.add(scrolbar);
    }

    public static void creatMenu(){
        JMenuBar menu = new JMenuBar();
        frame.setJMenuBar(menu);

        JMenu filemenu = new JMenu("File");
        menu.add(filemenu);
        JMenu editmenu = new JMenu("Edit");
        menu.add(editmenu);
        JMenu formatmenu = new JMenu("Format");
        menu.add(formatmenu);

        //Creating the file menu item
        JMenuItem New = new JMenuItem("New");
        New.addActionListener(e -> Filemenu.newFile());
        filemenu.add(New);
        New.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_DOWN_MASK));

        JMenuItem Open = new JMenuItem("Open");
        Open.addActionListener(e -> Filemenu.OpenFile());
        filemenu.add(Open);
        Open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_DOWN_MASK));

        JMenuItem Save = new JMenuItem("Save");
        Save.addActionListener(e -> Filemenu.Save());
        filemenu.add(Save);
        Save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK));

        JMenuItem SaveAs = new JMenuItem("Save As");
        SaveAs.addActionListener(e -> Filemenu.SaveAs());
        filemenu.add(SaveAs);
        SaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,KeyEvent.CTRL_DOWN_MASK));

        //Creating the file editmenu item
        JMenuItem Cut = new JMenuItem("Cut");
        Cut.addActionListener(e -> Edit.Cut());
        editmenu.add(Cut);
        Cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,KeyEvent.CTRL_DOWN_MASK));

        JMenuItem Copy = new JMenuItem("Copy");
        Copy.addActionListener(e -> Edit.Copy());
        editmenu.add(Copy);
        Copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_DOWN_MASK));

        JMenuItem Paste = new JMenuItem("Paste");
        Paste.addActionListener(e -> Edit.Paste());
        editmenu.add(Paste);
        Paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,KeyEvent.CTRL_DOWN_MASK));


        JMenuItem SelectAll  = new JMenuItem("Select All");
        SelectAll.addActionListener(e -> Edit.SelectAll());
        editmenu.add(SelectAll);
        SelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,KeyEvent.CTRL_DOWN_MASK));



        //Creating the file formatmenu item
        JMenuItem Bold = new JMenuItem("Bold");
        Bold.addActionListener(e -> FormatMenu.bold());
        formatmenu.add(Bold);
        Bold.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,KeyEvent.CTRL_DOWN_MASK));

        JMenuItem italic = new JMenuItem("Italic");
        italic.addActionListener(e -> FormatMenu.italic());
        formatmenu.add(italic);
        italic.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,KeyEvent.CTRL_DOWN_MASK));

        JMenuItem FontColor = new JMenuItem("Font Color");
        FontColor.addActionListener(e -> FormatMenu.fontcolor());
        formatmenu.add(FontColor);
        FontColor.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,KeyEvent.CTRL_DOWN_MASK));




    }
}
