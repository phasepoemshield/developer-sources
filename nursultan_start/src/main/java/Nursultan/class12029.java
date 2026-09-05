/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  minecraft.class00147
 *  minecraft.class00176
 *  minecraft.class00539
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class07482
 *  minecraft.class07510
 */
package Nursultan;

import Nursultan.class12001;
import Nursultan.class12006;
import Nursultan.class12028;
import Nursultan.class12040;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.ArrayList;
import minecraft.class00147;
import minecraft.class00176;
import minecraft.class00539;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07482;
import minecraft.class07510;

public class class12029 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public boolean N_init;
    public static Object y_0;

    public void L() {
        ((class12001)this.N_2).u(this);
    }

    public class12029() {
        this.B();
        this.N_0 = new ArrayList();
        this.N_1 = new ArrayList();
        this.N_2 = (class12001)y_0;
        this.N_3 = -1;
    }

    static {
        class12029.z();
        y_0 = new class12001();
    }

    private void B() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_3 = 0;
            this.N_4 = false;
        }
    }

    public class12029 i() {
        ((class12001)this.N_2).y(this);
        return this;
    }

    private static void z() {
        y_0 = null;
    }

    public boolean u() {
        return ((class12001)this.N_2).M(this);
    }

    public class12029 y(class00539 class005392) {
        return this.N(new class12006(class005392.N(), class005392.y(), class005392.L(), class005392.u(), class005392.M(), class005392.Z(), (Int2ObjectMap<class00176>)class005392.B()));
    }

    public void y() {
        ((class12001)this.N_2).N(this);
    }

    public class12029 y(class12040 class120402) {
        ((class12001)this.N_2).y(class120402, this);
        return this;
    }

    public class12029 N(class12001 class120012) {
        this.N_2 = class120012;
        return this;
    }

    public class12029 N(class00539 class005392) {
        return this.N(new class12028(class005392.N(), class005392.L(), class005392.u(), class005392.M()));
    }

    public class12029 N(class12006 class120062) {
        ((class12001)this.N_2).N(class120062, this);
        return this;
    }

    public class12029 N(class12040 class120402) {
        ((class12001)this.N_2).N(class120402, this);
        return this;
    }

    public class12029 N() {
        ((class12001)this.N_2).B(this);
        return this;
    }

    public class12029 N(int n, int n2, int n3, class07510 class075102) {
        return this.N(new class12028(n, n2, n3, class075102));
    }

    public class12029 N(int n, short s, byte by, class07510 class075102) {
        class07482 class074822 = (class07482)((class04453)class06202.Nq().T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3;
        int n2 = class074822.z();
        Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap();
        class00176 class001762 = class00176.y((class06584)class074822.L((int)s).i(), (class00147)class06202.Nq().NE().Q());
        int2ObjectOpenHashMap.put((int)s, (Object)class001762);
        return this.N(new class12006(n, n2, s, by, class075102, class001762, (Int2ObjectMap<class00176>)int2ObjectOpenHashMap));
    }

    public class12029 N(class12028 class120282) {
        ((class12001)this.N_2).N(class120282, this);
        return this;
    }
}

