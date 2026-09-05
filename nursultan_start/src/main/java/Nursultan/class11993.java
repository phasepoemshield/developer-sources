/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL33
 */
package Nursultan;

import Nursultan.class12004;
import org.lwjgl.opengl.GL33;

public non-sealed class class11993
implements class12004 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    public class11993(int n) {
        this.u();
        this.N_0 = n;
    }

    private void u() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
            this.N_1 = Float.valueOf(0.0f);
            this.N_2 = Float.valueOf(0.0f);
        }
    }

    public void N(float f, float f2) {
        if (f != ((Float)this.N_1).floatValue() || f2 != ((Float)this.N_2).floatValue()) {
            GL33.glUniform2f((int)((Integer)this.N_0), (float)f, (float)f2);
            this.N_1 = Float.valueOf(f);
            this.N_2 = Float.valueOf(f2);
        }
    }
}

