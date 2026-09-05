/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11300
 *  org.lwjgl.opengl.GL33
 */
package Nursultan;

import Nursultan.class11300;
import Nursultan.class12004;
import org.lwjgl.opengl.GL33;

public non-sealed class class12043
implements class12004 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public boolean N_init;

    public class12043(int n) {
        this.y();
        this.N_0 = n;
    }

    private void y() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
            this.N_1 = Float.valueOf(0.0f);
            this.N_2 = Float.valueOf(0.0f);
            this.N_3 = Float.valueOf(0.0f);
            this.N_4 = Float.valueOf(0.0f);
        }
    }

    public void N(float f, float f2, float f3, float f4) {
        if (f != ((Float)this.N_1).floatValue() || f2 != ((Float)this.N_2).floatValue() || f3 != ((Float)this.N_3).floatValue() || f4 != ((Float)this.N_4).floatValue()) {
            GL33.glUniform4f((int)((Integer)this.N_0), (float)f, (float)f2, (float)f3, (float)f4);
            this.N_1 = Float.valueOf(f);
            this.N_2 = Float.valueOf(f2);
            this.N_3 = Float.valueOf(f3);
            this.N_4 = Float.valueOf(f4);
        }
    }

    public void N(int n) {
        this.N((float)class11300.u((int)n) / 255.0f, (float)class11300.N((int)n) / 255.0f, (float)class11300.i((int)n) / 255.0f, (float)class11300.y((int)n) / 255.0f);
    }
}

