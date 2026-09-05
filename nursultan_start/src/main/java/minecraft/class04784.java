/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01517
 *  minecraft.class02796
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JComponent;
import javax.swing.Timer;
import minecraft.class01517;
import minecraft.class02796;
import org.jspecify.annotations.Nullable;

public class class04784
extends JComponent {
    private static final DecimalFormat N = new DecimalFormat("########0.000", DecimalFormatSymbols.getInstance(Locale.ROOT));
    private final int[] y = new int[256];
    private int L;
    private final @Nullable String[] u = new String[11];
    private final class02796 i;
    private final Timer R;

    public class04784(class02796 class027962) {
        this.i = class027962;
        this.setPreferredSize(new Dimension(456, 246));
        this.setMinimumSize(new Dimension(456, 246));
        this.setMaximumSize(new Dimension(456, 246));
        this.R = new Timer(500, actionEvent -> this.y());
        this.R.start();
        this.setBackground(Color.BLACK);
    }

    private void y() {
        long l = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        this.u[0] = "Memory use: " + l / 1024L / 1024L + " mb (" + Runtime.getRuntime().freeMemory() * 100L / Runtime.getRuntime().maxMemory() + "% free)";
        this.u[1] = "Avg tick: " + N.format((double)this.i.ym() / (double)class01517.y) + " ms";
        this.y[this.L++ & 0xFF] = (int)(l * 100L / Runtime.getRuntime().maxMemory());
        this.repaint();
    }

    public void N() {
        this.R.stop();
    }

    @Override
    public void paint(Graphics graphics) {
        int n;
        graphics.setColor(new Color(0xFFFFFF));
        graphics.fillRect(0, 0, 456, 246);
        for (n = 0; n < 256; ++n) {
            int n2 = this.y[n + this.L & 0xFF];
            graphics.setColor(new Color(n2 + 28 << 16));
            graphics.fillRect(n, 100 - n2, 1, n2);
        }
        graphics.setColor(Color.BLACK);
        for (n = 0; n < this.u.length; ++n) {
            String string = this.u[n];
            if (string == null) continue;
            graphics.drawString(string, 32, 116 + n * 16);
        }
    }
}

