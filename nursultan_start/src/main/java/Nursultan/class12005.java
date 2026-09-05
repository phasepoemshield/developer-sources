/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL33
 */
package Nursultan;

import Nursultan.class12004;
import org.lwjgl.opengl.GL33;

public non-sealed class class12005
implements class12004 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public boolean N_init;

    public class12005(int n) {
        this.y();
        this.N_0 = n;
    }

    private void y() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
            this.N_1 = 0;
            this.N_2 = 0;
            this.N_3 = 0;
        }
    }

    public void N(int n, int n2, int n3) {
        if (n != (Integer)this.N_1 || n2 != (Integer)this.N_2 || n3 != (Integer)this.N_3) {
            GL33.glUniform3i((int)((Integer)this.N_0), (int)n, (int)n2, (int)n3);
            this.N_1 = n;
            this.N_2 = n2;
            this.N_3 = n3;
        }
    }
}

