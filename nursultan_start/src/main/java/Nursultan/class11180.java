/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09057
 *  Nursultan.class09086
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  org.lwjgl.opengl.GL11
 */
package Nursultan;

import Nursultan.class09057;
import Nursultan.class09086;
import com.mojang.blaze3d.opengl.GlStateManager;
import org.lwjgl.opengl.GL11;

public class class11180
implements class09086 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    public class09057 L() {
        return null;
    }

    public class11180(int n, int n2, int n3) {
        this.Z();
        this.N_0 = n;
        this.N_1 = n2;
        this.N_2 = n3;
    }

    private void Z() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
            this.N_1 = 0;
            this.N_2 = 0;
        }
    }

    public int i() {
        return (Integer)this.N_0;
    }

    public int u() {
        return (Integer)this.N_2;
    }

    public void y() {
    }

    public void N(boolean bl) {
        GlStateManager._glBindFramebuffer((int)36160, (int)((Integer)this.N_0));
        if (bl) {
            GL11.glViewport((int)0, (int)0, (int)((Integer)this.N_1), (int)((Integer)this.N_2));
        }
    }

    public class09057 N() {
        return null;
    }

    public void N(boolean bl, boolean bl2) {
        this.N(true);
        int n = 0;
        if (bl) {
            n |= 0x4000;
        }
        if (bl2) {
            n |= 0x100;
        }
        if (n != 0) {
            GL11.glClear((int)n);
        }
    }

    public int R() {
        return (Integer)this.N_1;
    }
}

