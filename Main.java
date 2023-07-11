package transparentToOpaqueEx;


import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               TransparentToOpaqueEx ex = new TransparentToOpaqueEx();
                ex.setVisible(true);
            }
        });
    }
}
