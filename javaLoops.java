import java.util.Scanner;
import javax.swing.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ME
 */
public class WLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String out = "";
        while (true) {
            String words = JOptionPane.showInputDialog("Enter a word. Click cancel to quit");
            if (words == null) {
                break;
            }
            if (words.equals("Alabama")) {
                continue;
            }
            out = out + words + "\n";
        }//End While
        JTextArea displayArea1 = new JTextArea(out, 15, 30);
        JOptionPane.showMessageDialog(null, displayArea1);
        int sum = 0;
        
        while (true) {
            String output = JOptionPane.showInputDialog("Enter a Word and a Number");
            if (output == null) {
                break;
            }
            Scanner Scan = new Scanner(output);
            String words = Scan.next();
            int B = Scan.nextInt();
            out = out + words;
            sum = sum + B;
        }
        out = out + sum;
        JTextArea displayArea2 = new JTextArea(out, 15, 30);
        JOptionPane.showMessageDialog(null, displayArea2);
    }
}
