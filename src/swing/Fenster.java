package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Package: swiing
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 06.02.2018 2018
 */
public class Fenster extends JFrame {
    public Fenster() {
        setTitle("Mein erstes Fenster");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        /**
         * Layout
         */
        Container container = getContentPane();
        GroupLayout groupLayout = new GroupLayout(container);
        container.setLayout(groupLayout);
        /**
         * Button / ActionEvent
         */
        JButton button = new JButton("Ende");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        groupLayout.setVerticalGroup(groupLayout.createSequentialGroup().addComponent(button));
        groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup().addComponent(button));
        groupLayout.setAutoCreateContainerGaps(true);

    }

}