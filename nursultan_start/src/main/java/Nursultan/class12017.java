/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL33
 */
package Nursultan;

import Nursultan.class12004;
import org.lwjgl.opengl.GL33;

public non-sealed class class12017
implements class12004 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public boolean N_init;

    public class12017(int n) {
        this.N();
        this.N_0 = n;
    }

    public void N(float f, float f2, float f3) {
        if (f != ((Float)this.N_1).floatValue() || f2 != ((Float)this.N_2).floatValue() || f3 != ((Float)this.N_3).floatValue()) {
            GL33.glUniform3f((int)((Integer)this.N_0), (float)f, (float)f2, (float)f3);
            this.N_1 = Float.valueOf(f);
            this.N_2 = Float.valueOf(f2);
            this.N_3 = Float.valueOf(f3);
        }
    }

    private void N() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
            this.N_1 = Float.valueOf(0.0f);
            this.N_2 = Float.valueOf(0.0f);
            this.N_3 = Float.valueOf(0.0f);
        }
    }
}

