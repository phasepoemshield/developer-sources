/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12004
 *  org.lwjgl.opengl.GL33
 */
package Nursultan;

import Nursultan.class12004;
import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL33;

public class class11170
implements class12004 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    public class11170(int n) {
        this.N();
        this.N_0 = n;
    }

    private static int y(FloatBuffer floatBuffer) {
        int n = 1;
        int n2 = floatBuffer.limit();
        for (int i = 0; i < n2; ++i) {
            n = 31 * n + Float.floatToIntBits(floatBuffer.get(i));
        }
        return n;
    }

    public void N(FloatBuffer floatBuffer) {
        int n = class11170.y(floatBuffer);
        if (!((Boolean)this.N_2).booleanValue() || n != (Integer)this.N_1) {
            this.N_1 = n;
            this.N_2 = true;
            floatBuffer.position(0);
            GL33.glUniform1fv((int)((Integer)this.N_0), (FloatBuffer)floatBuffer);
        }
    }

    private void N() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
            this.N_1 = 0;
            this.N_2 = false;
        }
    }
}

