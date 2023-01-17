package deleni;

import deleni.model.PrikladDeleni;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        int max = 100;
        int pocet = 20;

        List<PrikladDeleni> priklady = new ArrayList<>();

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
