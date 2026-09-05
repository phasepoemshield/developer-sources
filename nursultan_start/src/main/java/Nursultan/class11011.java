/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Arrows
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11515
 *  Nursultan.class11524
 *  Nursultan.class11791
 *  minecraft.class00717
 *  minecraft.class07049
 */
package Nursultan;

import Nursultan.Arrows;
import Nursultan.class11034;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11524;
import Nursultan.class11791;
import minecraft.class00717;
import minecraft.class07049;

public class class11011
extends class11034<class00717> {
    public Object y_0;
    public Object y_1;

    @Override
    public int L() {
        this.W();
        return (Integer)((class11515)this.y_1).i();
    }

    public class11011(Arrows arrows, String string, boolean bl) {
        super(arrows, string, bl);
        this.W();
    }

    @Override
    public float N() {
        this.W();
        return ((Float)((class11504)this.y_0).i()).floatValue();
    }

    public boolean test(class07049 class070492) {
        return class11791.M().test(class070492);
    }

    public void N(Arrows arrows) {
        this.W();
        this.y_0 = (class11504)class11524.N((class11512)arrows, (String)"item-radius", (float)90.0f, (float)70.0f, (float)140.0f, (float)1.0f).N(class115362 -> this.U());
        this.y_1 = (class11515)class11524.N((class11512)arrows, (String)"item-color", (int)-16711681).N(class115362 -> this.U());
    }

    private void W() {
    }
}

