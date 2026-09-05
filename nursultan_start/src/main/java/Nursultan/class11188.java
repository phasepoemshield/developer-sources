/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL33
 */
package Nursultan;

import org.lwjgl.opengl.GL33;

public class class11188 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public boolean N_init;

    public void L(int n) {
        GL33.glQueryCounter((int)((int[])this.N_1)[n], (int)36392);
        ((boolean[])this.N_2)[n] = true;
    }

    public class11188(int n) {
        this.R();
        this.N_0 = new int[n];
        this.N_1 = new int[n];
        this.N_2 = new boolean[n];
        GL33.glGenQueries((int[])((int[])this.N_0));
        GL33.glGenQueries((int[])((int[])this.N_1));
    }

    public void y(int n) {
        GL33.glQueryCounter((int)((int[])this.N_0)[n], (int)36392);
    }

    public void N() {
        if (((Boolean)this.N_3).booleanValue()) {
            return;
        }
        this.N_3 = true;
        GL33.glDeleteQueries((int[])((int[])this.N_0));
        GL33.glDeleteQueries((int[])((int[])this.N_1));
        for (int i = 0; i < ((boolean[])this.N_2).length; ++i) {
            ((boolean[])this.N_2)[i] = false;
        }
    }

    public long N(int n) {
        if (!((boolean[])this.N_2)[n]) {
            return -1L;
        }
        ((boolean[])this.N_2)[n] = false;
        long l = GL33.glGetQueryObjectui64((int)((int[])this.N_0)[n], (int)34918);
        return GL33.glGetQueryObjectui64((int)((int[])this.N_1)[n], (int)34918) - l;
    }

    private void R() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_3 = false;
        }
    }
}

