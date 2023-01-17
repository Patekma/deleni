package deleni;

import deleni.gui.MainFrame;
import deleni.model.PrikladDeleni;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });


    }
}
