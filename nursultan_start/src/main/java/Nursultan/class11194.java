/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09064
 *  Nursultan.class09065
 *  Nursultan.class09076
 *  org.lwjgl.opengl.GL11
 */
package Nursultan;

import Nursultan.class09064;
import Nursultan.class09065;
import Nursultan.class09076;
import Nursultan.class11171;
import Nursultan.class11173;
import Nursultan.class11192;
import Nursultan.class11202;
import Nursultan.class11211;
import Nursultan.class11212;
import Nursultan.class11218;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.lwjgl.opengl.GL11;

public class class11194<C>
implements class11171<C> {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public boolean N_init;

    class11194(class11192<C> class111922) {
        this.i();
        this.N_1 = new ArrayList();
        this.N_2 = new ArrayList();
        this.N_3 = new ArrayList();
        this.N_6 = (int[])class11218.N_0;
        this.N_0 = Objects.requireNonNull(class111922, "pass");
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_5 = false;
        }
    }

    void y(class11173<C> class111732) {
        ((ArrayList)this.N_1).add(Objects.requireNonNull(class111732, "setup"));
    }

    void y(boolean bl) {
        this.N_5 = bl;
    }

    @Override
    public int[] y() {
        return (int[])this.N_6;
    }

    private static void N(boolean bl) {
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GL11.glClear((int)(0x4000 | (bl ? 256 : 0)));
    }

    void N(class11212 class112122) {
        this.N_4 = Objects.requireNonNull(class112122, "target");
    }

    @Override
    public void N(class11202 class112022) {
        ((class11212)this.N_4).N(class112022);
        int n = 0;
        for (class11211 class112112 : (ArrayList)this.N_3) {
            class112112.N(class112022);
            if (class112112.a_() < 0) continue;
            ++n;
        }
        if (n == 0) {
            this.N_6 = (int[])class11218.N_0;
            return;
        }
        Object object = new int[n];
        int n2 = 0;
        Iterator iterator = ((ArrayList)this.N_3).iterator();
        while (iterator.hasNext()) {
            int n3 = ((class11211)iterator.next()).a_();
            if (n3 < 0) continue;
            object[n2++] = n3;
        }
        this.N_6 = object;
    }

    void N(class11173<C> class111732) {
        ((ArrayList)this.N_2).add(Objects.requireNonNull(class111732, "beforePass"));
    }

    @Override
    public void N() {
        if ((class11212)this.N_4 == null) {
            throw new IllegalStateException("Pass step has no target: " + ((class11192)this.N_0).getClass().getName());
        }
        class09064 class090642 = ((class11212)this.N_4).N();
        for (int i = 0; i < ((ArrayList)this.N_3).size(); ++i) {
            class11211 class112112 = (class11211)((ArrayList)this.N_3).get(i);
            if (class090642 != null && class090642 == class112112.L()) {
                throw new IllegalStateException("Pass reads and writes the same framebuffer: " + class090642.d());
            }
            for (int j = i + 1; j < ((ArrayList)this.N_3).size(); ++j) {
                if (class112112.y() != ((class11211)((ArrayList)this.N_3).get(j)).y()) continue;
                throw new IllegalStateException("Texture unit is bound twice in one pass: " + class112112.y());
            }
        }
    }

    void N(class11211 class112112) {
        ((ArrayList)this.N_3).add(Objects.requireNonNull(class112112, "input"));
    }

    @Override
    public void N(C c, class09076 class090762, class09065 class090652) {
        for (int i = 0; i < ((ArrayList)this.N_1).size(); ++i) {
            ((class11173)((ArrayList)this.N_1).get(i)).execute(c);
        }
        ((class11212)this.N_4).N(class090762, class090652);
        if (((Boolean)this.N_5).booleanValue()) {
            class11194.N(((class11212)this.N_4).N(class090762));
        }
        for (Object object : (ArrayList)this.N_2) {
            object.execute(c);
        }
        for (Object object : (ArrayList)this.N_3) {
            object.N(class090762);
        }
        ((class11192)this.N_0).execute(c);
    }
}

