import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acond003
 */
public class LabExerciseFive {
    public static void main(String[] args)throws FileNotFoundException{        
        Scanner fileScanner = new Scanner (new File("src/ LabExerciseFive.java"));
        fileScanner.useDelimiter("[^a-zA-Z]+");
        ArrayList<String> words = new ArrayList();
        while (fileScanner.hasNext()){
            fileScanner.next();
            words.contains(words);
            words.add("");
        }
        JTextArea Area = new JTextArea(words, 15, 30);
        JScrollPane Scroll = new JScrollPane(Area, 15, 30);
        JOptionPane.showMessageDialog(null, Scroll);
        Collections.sort(words);
        
    }

}
