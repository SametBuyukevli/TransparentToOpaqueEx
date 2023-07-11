package transparentToOpaqueEx;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Surface2 extends JPanel {

    private void Draw(Graphics g) {

        Graphics2D g2d = (Graphics2D) g.create();

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);

        Random random = new Random();

        int gw = getWidth() - 1;
        int gh = getHeight() - 1;
        float[] dash = {4f, 4f, 1f};

        BasicStroke bs1 = new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 1.0f, dash, 2f);

        for (int i = 0; i < 10; i++) {

            float alpha = (i + 1) * 0.1f;
            AlphaComposite alcom = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha);
            g2d.setComposite(alcom);

            for (int y = 0; y < 8; y++) {


                g2d.setStroke(bs1);

                g2d.setPaint(Color.BLACK);

                g2d.drawRect(i * (gw / 10), y * (gh / 8), gw / 10, gh / 8);

                g2d.setColor(new Color(random.nextInt()));

                g2d.fillRect(i * (gw / 10), y * (gh / 8), gw / 10, gh / 8);
            }
        }


    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Draw(g);
    }
}

