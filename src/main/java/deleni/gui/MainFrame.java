package deleni.gui;

import com.google.gson.Gson;
import deleni.model.PrikladDeleni;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainFrame extends JFrame {
    private final JTextField tfPocetPrikladu;
    private final JTextField tfMax;
    private List<PrikladDeleni> priklady;

    public MainFrame(){
        setTitle("Generovani deleni");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        tfPocetPrikladu = new JTextField("20", 5);
        tfMax = new JTextField("100",5);

        JPanel pnlNorth = new JPanel();
        pnlNorth.add(new JLabel("Pocet"));
        pnlNorth.add(tfPocetPrikladu);
        pnlNorth.add(new JLabel("Maximum"));
        pnlNorth.add(tfMax);

        JButton btnGeneruj = new JButton("Generuj");
        pnlNorth.add(btnGeneruj);
        btnGeneruj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generuj();
                ulozDoJsonu();
            }
        });

        add(pnlNorth, BorderLayout.NORTH);

        pack();
        setVisible(true);
    }

    private void ulozDoJsonu() {
        Gson gson = new Gson();
        System.out.println(gson.toJson(priklady));
        try {
            PrintStream out = new PrintStream(new FileOutputStream("priklady.json"));
            out.print(gson.toJson(priklady));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void generuj(){
        Random random = new Random(System.currentTimeMillis());
        int max = Integer.valueOf(tfMax.getText());
        int pocet = Integer.valueOf(tfPocetPrikladu.getText());

        priklady = new ArrayList<>();

        for (int i = 0; i < pocet; i++) {
            int odmocnina = (int) Math.sqrt(max);
            int delitel1 = random.nextInt(odmocnina + 1);
            int delitel2 = random.nextInt(odmocnina) + 1;
            int delenec = delitel1 * delitel2;
            priklady.add(new PrikladDeleni(delenec,delitel2));
        }

        for (PrikladDeleni p : priklady){
            System.out.println(p);
        }
    }
}
