package transparentToOpaqueEx;

import javax.swing.*;
import java.util.Random;

public class TransparentToOpaqueEx extends JFrame {

    Random random = new Random();
    int a, b;
    TransparentToOpaqueEx(){
        initUI();
    }

    private void initUI() {
        add(new Surface2());
        setTitle("Transparent To Opaque");
        do {
            a = random.nextInt(800 - 400) + 400;
            b = random.nextInt(720 - 200) + 200;
           System.out.println(a + " " + b);
        } while (a % 10 != 0 || b % 8 != 0);
        setSize(a , b );
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setResizable(false);
    }
}
