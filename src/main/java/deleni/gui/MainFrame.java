package deleni.gui;

import deleni.model.PrikladDeleni;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainFrame extends JFrame {
    private final JTextField tfPocetPrikladu;
    private final JTextField tfMax;
    private List<PrikladDeleni> priklady;

    public MainFrame(){
        setTitle("Generovani deleni");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        tfPocetPrikladu = new JTextField(5);
        tfMax = new JTextField(5);

        JPanel pnlNorth = new JPanel();
        pnlNorth.add(new JLabel("Pocet"));
        pnlNorth.add(tfPocetPrikladu);
        pnlNorth.add(new JLabel("Maximum"));
        pnlNorth.add(tfMax);

        JButton btnGeneruj = new JButton("Generuj");
        pnlNorth.add(btnGeneruj);

        add(pnlNorth, BorderLayout.NORTH);

        pack();
        setVisible(true);
    }
}
