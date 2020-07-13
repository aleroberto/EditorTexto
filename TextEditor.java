import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JTextArea;


public class TextEditor extends JFrame {
    private JPanel contentPane;
    private JScrollPane scrollPane;
    private JTextArea jTextArea;

    public TextEditor()  {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 820, 370);
        contentPane = new JPanel();
     
        setContentPane(contentPane);
        contentPane.setLayout(null);
        scrollPane = new JScrollPane();

       scrollPane.setBounds(10, 61, 783, 219);
        contentPane.add(scrollPane);
       scrollPane.setViewportView(new JTextArea());
    }


    public static void main(String[] args) throws ClassNotFoundException,  UnsupportedLookAndFeelException,  IllegalAccessException,  InstantiationException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TextEditor().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}