/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package Nursultan;

import Nursultan.class11773;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class class11731 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public boolean N_init;

    public float L() {
        return ((Float)this.N_3).floatValue();
    }

    public class11731(int n, int n2, int n3, float f, Map<String, class11773> map) {
        this.B();
        this.N_0 = n;
        this.N_1 = n2;
        this.N_2 = n3;
        this.N_3 = Float.valueOf(f);
        this.N_4 = map;
    }

    private void B() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
            this.N_1 = 0;
            this.N_2 = 0;
            this.N_3 = Float.valueOf(0.0f);
        }
    }

    public int i() {
        return (Integer)this.N_2;
    }

    public int u() {
        return (Integer)this.N_1;
    }

    public int y() {
        return (Integer)this.N_0;
    }

    public class11773 N(String string) {
        return (class11773)((Object)((Map)this.N_4).get(string));
    }

    public void N() {
        if ((Integer)this.N_0 != 0) {
            GL11.glDeleteTextures((int)((Integer)this.N_0));
        }
    }

    public Map<String, class11773> R() {
        return (Map)this.N_4;
    }
}

