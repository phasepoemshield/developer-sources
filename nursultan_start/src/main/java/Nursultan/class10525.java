/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05589
 *  minecraft.class05623
 */
package Nursultan;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import minecraft.class05589;
import minecraft.class05623;

public class class10525
extends WindowAdapter {
    final /* synthetic */ class05589 N;
    final /* synthetic */ JFrame y;
    final /* synthetic */ class05623 L;

    public class10525(class05589 class055892, JFrame jFrame, class05623 class056232) {
        this.N = class055892;
        this.y = jFrame;
        this.L = class056232;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        if (!this.N.N.getAndSet(true)) {
            this.y.setTitle("Minecraft server - shutting down!");
            this.L.y(true);
            this.N.L();
        }
    }
}

