package com.example;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

// get command from user
// move according to commands
// refuel or develiver package according to command
public class App {
    public static void main(String[] args) {
        System.out.println("Enter two coordinates x1, y1, and x2, y2:");
        
        try (Scanner scanner = new Scanner(System.in)) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            // Pass the coordinates to the MakePath panel and display it
            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("Path Drawer");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(500, 500);

                MakePath panel = new MakePath(x1, y1, x2, y2);
                frame.add(panel);

                frame.setVisible(true);
            });
        }
    }

}