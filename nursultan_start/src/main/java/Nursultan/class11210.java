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

public class class11210
implements class12004 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    public class11210(int n) {
        this.N();
        this.N_0 = n;
    }

    private void N() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
            this.N_1 = 0;
            this.N_2 = 0;
        }
    }

    public void N(int n, int n2) {
        if (n != (Integer)this.N_1 || n2 != (Integer)this.N_2) {
            GL33.glUniform2i((int)((Integer)this.N_0), (int)n, (int)n2);
            this.N_1 = n;
            this.N_2 = n2;
        }
    }
}

