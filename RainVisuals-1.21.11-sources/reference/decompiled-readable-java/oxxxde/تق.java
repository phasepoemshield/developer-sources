/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.stream.ImageInputStream;
import kotakbaz.rain.client.render.texture.utils.gif.gif.A;
import kotakbaz.rain.client.render.texture.utils.gif.gif.a_0;
import oxxxde.\u0630\u0626;
import oxxxde.\u0637\u0632;

public class \u062a\u0642 {
    /*
     * WARNING - void declaration
     */
    public static \u0637\u0632 decompileDeltas(ImageInputStream inputStream) throws IOException {
        ArrayList<BufferedImage> frames = new ArrayList<BufferedImage>();
        \u0630\u0626 ir = new \u0630\u0626(new A());
        ir.setInput(inputStream);
        int i = 0;
        while (i < ir.getNumImages(true)) {
            void var3_3;
            frames.add(ir.read(i));
            ++var3_3;
        }
        return new \u0637\u0632(frames, ((a_0)ir.getImageMetadata((int)0)).delayTime);
    }

    /*
     * WARNING - void declaration
     */
    public static \u0637\u0632 decompileFull(ImageInputStream inputStream) throws IOException {
        void var2_2;
        void var1_1;
        ArrayList<Object> copies = new ArrayList<Object>();
        \u0637\u0632 deltaData = \u062a\u0642.decompileDeltas(inputStream);
        List<BufferedImage> frames = deltaData.images;
        copies.add(frames.removeFirst());
        for (BufferedImage frame : frames) {
            void var6_6;
            BufferedImage img = new BufferedImage(((BufferedImage)copies.getFirst()).getWidth(), ((BufferedImage)copies.getFirst()).getHeight(), 1);
            Graphics g = img.getGraphics();
            g.drawImage((Image)copies.getLast(), 0, 0, null);
            g.drawImage(frame, 0, 0, null);
            copies.add(var6_6);
        }
        return new \u0637\u0632((List<BufferedImage>)var1_1, var2_2.updateDelay);
    }
}

