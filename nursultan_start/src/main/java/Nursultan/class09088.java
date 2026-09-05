/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  org.lwjgl.opengl.GL30
 */
package Nursultan;

import Nursultan.class09057;
import Nursultan.class09086;
import com.mojang.blaze3d.opengl.GlStateManager;
import org.lwjgl.opengl.GL30;

public class class09088
implements class09086 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public boolean N_init;

    @Override
    public class09057 L() {
        return (class09057)this.N_1;
    }

    public String M() {
        return (String)this.N_2;
    }

    public class09088(class09057 class090572, class09057 class090573, String string) {
        this.Z();
        this.N_0 = class090572;
        this.N_1 = class090573;
        this.N_2 = string;
    }

    private void Z() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_3 = 0;
        }
    }

    @Override
    public int i() {
        if ((Integer)this.N_3 == 0) {
            this.N_3 = GL30.glGenFramebuffers();
            GlStateManager._glBindFramebuffer((int)36160, (int)((Integer)this.N_3));
            GL30.glFramebufferTexture2D((int)36160, (int)36064, (int)3553, (int)((class09057)this.N_0).i(), (int)0);
            if ((class09057)this.N_1 != null && ((class09057)this.N_1).y()) {
                GL30.glFramebufferTexture2D((int)36160, (int)36096, (int)3553, (int)((class09057)this.N_1).i(), (int)0);
            }
        }
        return (Integer)this.N_3;
    }

    @Override
    public int u() {
        return ((class09057)this.N_0).R();
    }

    @Override
    public void y() {
        if ((Integer)this.N_3 != 0) {
            GL30.glDeleteFramebuffers((int)((Integer)this.N_3));
            this.N_3 = 0;
        }
    }

    @Override
    public void N(boolean bl, boolean bl2) {
        this.N(true);
        int n = 0;
        if (bl) {
            n |= 0x4000;
        }
        if (bl2 && (class09057)this.N_1 != null && ((class09057)this.N_1).y()) {
            n |= 0x100;
        }
        if (n != 0) {
            GL30.glClear((int)n);
        }
    }

    @Override
    public void N(boolean bl) {
        GlStateManager._glBindFramebuffer((int)36160, (int)this.i());
        if (bl) {
            GL30.glViewport((int)0, (int)0, (int)this.R(), (int)this.u());
        }
    }

    @Override
    public class09057 N() {
        return (class09057)this.N_0;
    }

    @Override
    public int R() {
        return ((class09057)this.N_0).N();
    }
}

