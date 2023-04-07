import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IntegerVerifier extends JFrame implements ActionListener {
    private JLabel label;
    private JTextField textField;

    public IntegerVerifier() {
        super("Integer Verifier");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);

        label = new JLabel("Enter an integer:");
        textField = new JTextField(10);

        JButton verifyButton = new JButton("Verify");
        verifyButton.addActionListener(this);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the window
            }
        });

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(verifyButton);
        panel.add(cancelButton);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = textField.getText();

        try {
            int num = Integer.parseInt(input);
            JOptionPane.showMessageDialog(this, num + " is an integer.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, input + " is not an integer.");
        }
    }
}