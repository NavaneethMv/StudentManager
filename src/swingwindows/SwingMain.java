package swingwindows;
import javax.swing.*;
import java.awt.*;
public class SwingMain extends JFrame {
    public SwingMain() {
        initComponents();
        setSize(1200, 700);
    }
    private void initComponents() {
        setLayout(new BorderLayout());
        MainPanel mainPanel = new MainPanel();
        AddPanel addPanel = new AddPanel();

        mainPanel.setPreferredSize(new Dimension(290, 700));
        add(mainPanel, BorderLayout.LINE_START);
        add(addPanel, BorderLayout.CENTER);
    }
}
