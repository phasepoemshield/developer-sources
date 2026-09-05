/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package Nursultan;

import Nursultan.class09057;
import Nursultan.class09073;
import org.lwjgl.opengl.GL11;

public class class09098
implements class09057 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    @Override
    public void L() {
        if ((Integer)this.N_1 != 0) {
            GL11.glDeleteTextures((int)((Integer)this.N_1));
            this.N_1 = 0;
        }
    }

    public class09098(class09073 class090732, int n) {
        this.Z();
        this.N_0 = class090732;
        this.N_1 = n;
    }

    private void Z() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = 0;
        }
    }

    @Override
    public int i() {
        return (Integer)this.N_1;
    }

    @Override
    public class09073 u() {
        return (class09073)((Object)this.N_0);
    }

    @Override
    public boolean y() {
        return (Integer)this.N_1 != 0;
    }

    @Override
    public int N() {
        return ((class09073)((Object)this.N_0)).B();
    }

    @Override
    public int R() {
        return ((class09073)((Object)this.N_0)).N();
    }
}

