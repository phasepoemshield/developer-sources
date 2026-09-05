/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL33
 */
package Nursultan;

import Nursultan.class12004;
import java.nio.FloatBuffer;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL33;

public non-sealed class class12038
implements class12004 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;
    public static Object y_0;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
        }
    }

    public class12038(int n) {
        this.L();
        this.N_1 = new Matrix4f().zero();
        this.N_0 = n;
    }

    static {
        class12038.N();
        y_0 = BufferUtils.createFloatBuffer((int)16);
    }

    private static void N() {
        y_0 = null;
    }

    public void N(Matrix4f matrix4f) {
        if (!((Matrix4f)this.N_1).equals((Object)matrix4f)) {
            ((Matrix4f)this.N_1).set((Matrix4fc)matrix4f);
            matrix4f.get(((FloatBuffer)y_0).position(0));
            GL33.glUniformMatrix4fv((int)((Integer)this.N_0), (boolean)false, (FloatBuffer)((FloatBuffer)y_0));
        }
    }
}

