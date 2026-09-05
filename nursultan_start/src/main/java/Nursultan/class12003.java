/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL33
 */
package Nursultan;

import Nursultan.class12004;
import org.lwjgl.opengl.GL33;

public non-sealed class class12003
implements class12004 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    public class12003(int n) {
        this.N();
        this.N_1 = Integer.MIN_VALUE;
        this.N_0 = n;
    }

    private void N() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
            this.N_1 = 0;
        }
    }

    public void N(int n) {
        if (n != (Integer)this.N_1) {
            GL33.glUniform1i((int)((Integer)this.N_0), (int)n);
            this.N_1 = n;
        }
    }
}

