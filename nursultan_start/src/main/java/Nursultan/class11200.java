/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12004
 *  org.lwjgl.opengl.GL33
 */
package Nursultan;

import Nursultan.class12004;
import org.lwjgl.opengl.GL33;

public class class11200
implements class12004 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    public class11200(int n) {
        this.y();
        this.N_0 = n;
    }

    private void y() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
            this.N_1 = Float.valueOf(0.0f);
        }
    }

    public void N(float f) {
        if (f != ((Float)this.N_1).floatValue()) {
            GL33.glUniform1f((int)((Integer)this.N_0), (float)f);
            this.N_1 = Float.valueOf(f);
        }
    }
}

