/**
 * Java 1. Homework 8
 *
 * @author Ekaterina Bataeva
 * @version 09.05.2022
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class App extends JFrame {

    int counter = 0;

    public App() {

        setTitle("Генератор номера телефона");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 150);

        Font font = new Font("Arrial", Font.BOLD, 40);

        JTextField counterText = new JTextField("Генератор");
        add(counterText, BorderLayout.CENTER);
        counterText.setFont(font);
        counterText.setHorizontalAlignment(SwingConstants.CENTER);

        counterText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterText.setText(generateNumber());
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        App app = new App();
    }

    public String generateNumber() {
        Random random = new Random();
        return "8999" + random.nextInt(10) + random.nextInt(10) + random.nextInt(10) + random.nextInt(10)
                + random.nextInt(10) + random.nextInt(10) + random.nextInt(10);
    }
}

