package swingwindows;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

import static dbmsfunctions.DbmsFunc.con;

public class AddPanel extends JPanel{
    public AddPanel() {initComponents();}
    private void initComponents() {
        JPanel addPanel = new JPanel();
        setSize(910, 700);
        setVisible(true);

        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 250, 5, 250);

        setLayout(grid);

        regNo = new JLabel("Reg. No.");
        name = new JLabel("Name");
        mark1 = new JLabel("mark1");
        mark2 = new JLabel("mark2");
        mark3 = new JLabel("mark3");
        regNoTextField = new JTextField();
        nameTextField = new JTextField();
        mark1TextField = new JTextField();
        mark2TextField = new JTextField();
        mark3TextField = new JTextField();
        submit = new JButton("SUBMIT");
        status = new JLabel("nothing", SwingConstants.CENTER);

        gbc.gridx = 0;
        gbc.gridy = 0;
        regNo.setFont(new Font("Verdana", Font.PLAIN, 18));
        add(regNo, gbc);
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy = 1;
        regNoTextField.setFont(new Font("Verdana", Font.PLAIN, 18));
        regNoTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.decode("#5A8F7B")));
        add(regNoTextField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        name.setFont(new Font("Verdana", Font.PLAIN, 18));
        add(name, gbc);
        gbc.weightx = 2;
        gbc.gridx = 0;
        gbc.gridy = 3;
        nameTextField.setFont(new Font("Verdana", Font.PLAIN, 18));
        nameTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.decode("#5A8F7B")));
        add(nameTextField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        mark1.setFont(new Font("Verdana", Font.PLAIN, 18));
        add(mark1, gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        mark1TextField.setFont(new Font("Verdana", Font.PLAIN, 18));
        mark1TextField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.decode("#5A8F7B")));
        add(mark1TextField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 6;
        mark2.setFont(new Font("Verdana", Font.PLAIN, 18));
        add(mark2, gbc);
        gbc.gridx = 0;
        gbc.gridy = 7;
        mark2TextField.setFont(new Font("Verdana", Font.PLAIN, 18));
        mark2TextField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.decode("#5A8F7B")));
        add(mark2TextField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 8;
        mark3.setFont(new Font("Verdana", Font.PLAIN, 18));
        add(mark3, gbc);
        gbc.gridx = 0;
        gbc.gridy = 9;
        mark3TextField.setFont(new Font("Verdana", Font.PLAIN, 18));
        mark3TextField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.decode("#5A8F7B")));
        add(mark3TextField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 10;
        add(submit, gbc);
        submit.setFont(new Font("Verdana", Font.BOLD, 18));
        submit.setBorderPainted(false);
        submit.setOpaque(true);
        submit.setContentAreaFilled(true);
        submit.setBackground(Color.decode("#5A8F7B"));
        submit.setForeground(Color.white);
        submit.setFocusPainted(false);
        submit.addActionListener(new ActionListener() {
            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    con.add(regNoTextField.getText(), nameTextField.getText(), Integer.parseInt(mark1TextField.getText()), Integer.parseInt(mark2TextField.getText()), Integer.parseInt(mark3TextField.getText()));
//                } catch (SQLException ex) {
//                    throw new RuntimeException(ex);
//                }
//            }
        });
        gbc.gridx = 0;
        gbc.gridy = 11;
        status.setFont(new Font("Verdana", Font.PLAIN, 18));
        add(status, gbc);
        status.setVisible(true);
        setBackground(Color.white);
    }
    JLabel regNo;
    JTextField regNoTextField;
    JLabel name;
    JTextField nameTextField;
    JLabel mark1;
    JTextField mark1TextField;
    JLabel mark2;
    JTextField mark2TextField;
    JLabel mark3;
    JTextField mark3TextField;
    JButton submit;
    JLabel status;
}
