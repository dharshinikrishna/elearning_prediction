/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e_learning_bck;

import e_learning.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DisableCloseButtonDemo extends JFrame {
    public DisableCloseButtonDemo()  {
        initialize();
    }

    private void initialize() {
        // WindowConstants.DO_NOTHING_ON_CLOSE tell JFrame instance to do
        // nothing when a window closing event occurs.
      this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        JButton button = new JButton("Close");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setSize(new Dimension(100, 100));
        this.getContentPane().add(button);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DisableCloseButtonDemo().setVisible(true);
            }
        });
    }
}