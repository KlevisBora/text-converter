import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextConverter {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton toLowerButton = new JButton("To Lower Case");
        JButton toUpperButton = new JButton("To Upper Case");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(toLowerButton);
        buttonPanel.add(toUpperButton);


        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);


        toLowerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lowerText = textArea.getText().toLowerCase();
                textArea.setText(lowerText);
            }
        });


        toUpperButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String upperText = textArea.getText().toUpperCase();
                textArea.setText(upperText);
            }
        });


        frame.setVisible(true);
    }
}
