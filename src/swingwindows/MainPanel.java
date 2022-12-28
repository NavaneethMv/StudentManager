package swingwindows;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class MainPanel extends JPanel {
    public MainPanel() {
        initComponents();
    }
    private void initComponents() {
        setSize(200, 700);
        setVisible(true);
        setLayout(null);

        addButton = new JButton("Add");
        editButton = new JButton("Edit");
        searchButton = new JButton("Search");
        deleteButton = new JButton("Delete");

        add(addButton);
        addButton.setBounds(0, 100, 290, 40);
        addButton.setBorderPainted(false);
        addButton.setOpaque(false);
        addButton.setContentAreaFilled(false);
        addButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        addButton.setForeground(Color.white);
        addButton.setFocusPainted(false);
        addButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                if (currentHighlight != addButton) {
                    addButton.setBorderPainted(false);
                    addButton.setOpaque(true);
                    addButton.setContentAreaFilled(true);
                    addButton.setBackground(Color.decode("#5A8F7B"));
                }
            }
            public void mouseExited(MouseEvent evt) {
                if (currentHighlight != addButton) {
                    addButton.setBorderPainted(false);
                    addButton.setOpaque(false);
                    addButton.setContentAreaFilled(false);
                }
            }
            public void mouseClicked(MouseEvent evt) {
                if (currentHighlight != null) {
                    currentHighlight.setBorderPainted(false);
                    currentHighlight.setOpaque(false);
                    currentHighlight.setContentAreaFilled(false);
                }
                currentHighlight = addButton;
                addButton.setBackground(Color.decode("#5A8F7B"));
            }
        });
        add(editButton);
        editButton.setBounds(0, 100, 290, 40);
        editButton.setBorderPainted(false);
        editButton.setOpaque(false);
        editButton.setContentAreaFilled(false);
        editButton.setBorderPainted(false);
        editButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        editButton.setForeground(Color.white);
        editButton.setBounds(0, 150, 290, 40);
        editButton.setFocusPainted(false);
        editButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                if (currentHighlight != editButton) {
                    editButton.setBorderPainted(false);
                    editButton.setOpaque(true);
                    editButton.setContentAreaFilled(true);
                    editButton.setBackground(Color.decode("#5A8F7B"));
                }
            }
            public void mouseExited(MouseEvent evt) {
                if (currentHighlight != editButton) {
                    editButton.setBorderPainted(false);
                    editButton.setOpaque(false);
                    editButton.setContentAreaFilled(false);
                }
            }
            public void mouseClicked(MouseEvent evt) {
                if (currentHighlight != null) {
                    currentHighlight.setBorderPainted(false);
                    currentHighlight.setOpaque(false);
                    currentHighlight.setContentAreaFilled(false);
                }
                currentHighlight = editButton;
                editButton.setBackground(Color.decode("#5A8F7B"));
            }
        });
        add(searchButton);
        searchButton.setBounds(0, 100, 290, 40);
        searchButton.setBorderPainted(false);
        searchButton.setOpaque(false);
        searchButton.setContentAreaFilled(false);
        searchButton.setBorderPainted(false);
        searchButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        searchButton.setForeground(Color.white);
        searchButton.setBounds(0, 200, 290, 40);
        searchButton.setFocusPainted(false);
        searchButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                if (currentHighlight != searchButton) {
                    searchButton.setBorderPainted(false);
                    searchButton.setOpaque(true);
                    searchButton.setContentAreaFilled(true);
                    searchButton.setBackground(Color.decode("#5A8F7B"));
                }
            }
            public void mouseExited(MouseEvent evt) {
                if (currentHighlight != searchButton) {
                    searchButton.setBorderPainted(false);
                    searchButton.setOpaque(false);
                    searchButton.setContentAreaFilled(false);
                }
            }
            public void mouseClicked(MouseEvent evt) {
                if (currentHighlight != null) {
                    currentHighlight.setBorderPainted(false);
                    currentHighlight.setOpaque(false);
                    currentHighlight.setContentAreaFilled(false);
                }
                currentHighlight = searchButton;
                searchButton.setBackground(Color.decode("#5A8F7B"));
            }
        });
        add(deleteButton);
        deleteButton.setBounds(0, 100, 290, 40);
        deleteButton.setBorderPainted(false);
        deleteButton.setOpaque(false);
        deleteButton.setContentAreaFilled(false);
        deleteButton.setBorderPainted(false);
        deleteButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        deleteButton.setForeground(Color.white);
        deleteButton.setFocusPainted(false);
        deleteButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                if (currentHighlight != deleteButton) {
                    deleteButton.setBorderPainted(false);
                    deleteButton.setOpaque(true);
                    deleteButton.setContentAreaFilled(true);
                    deleteButton.setBackground(Color.decode("#5A8F7B"));
                }
            }
            public void mouseExited(MouseEvent evt) {
                if (currentHighlight != deleteButton) {
                    deleteButton.setBorderPainted(false);
                    deleteButton.setOpaque(false);
                    deleteButton.setContentAreaFilled(false);
                }
            }
            public void mouseClicked(MouseEvent evt) {
                if (currentHighlight != null) {
                    currentHighlight.setBorderPainted(false);
                    currentHighlight.setOpaque(false);
                    currentHighlight.setContentAreaFilled(false);
                }
                currentHighlight = deleteButton;
                deleteButton.setBackground(Color.decode("#5A8F7B"));
            }
        });
        deleteButton.setBounds(0, 250, 290, 40);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth(), h = getHeight();
        Color color1 = Color.decode("#000000");
        Color color2 = Color.decode("#2D3436");
        GradientPaint gp = new GradientPaint(0, 0, color1, w, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }
    static JButton addButton;
    static JButton editButton;
    static JButton searchButton;
    static JButton deleteButton;
    static JButton currentHighlight;
}
