/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Arrows
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11515
 *  Nursultan.class11524
 *  minecraft.class07049
 */
package Nursultan;

import Nursultan.Arrows;
import Nursultan.class11034;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11524;
import minecraft.class07049;

public class class11012
extends class11034<class07049> {
    public Object y_0;
    public Object y_1;

    @Override
    public int L() {
        this.R();
        return (Integer)((class11515)this.y_1).i();
    }

    public class11012(Arrows arrows, String string, boolean bl) {
        super(arrows, string, bl);
        this.R();
    }

    @Override
    public float N() {
        this.R();
        return ((Float)((class11504)this.y_0).i()).floatValue();
    }

    public void N(Arrows arrows) {
        this.R();
        this.y_0 = (class11504)class11524.N((class11512)arrows, (String)"party-radius", (float)90.0f, (float)70.0f, (float)140.0f, (float)1.0f).N(class115362 -> this.U());
        this.y_1 = (class11515)class11524.N((class11512)arrows, (String)"party-color", (int)-16711681).N(class115362 -> this.U());
    }

    public boolean test(class07049 class070492) {
        return false;
    }

    private void R() {
    }
}

