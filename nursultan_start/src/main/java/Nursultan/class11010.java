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
 *  minecraft.class07049
 */
package Nursultan;

import Nursultan.Arrows;
import Nursultan.class11023;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11524;
import Nursultan.class11791;
import minecraft.class07049;

public class class11010
extends class11023 {
    public Object y_0;
    public Object y_1;

    @Override
    public int L() {
        this.M();
        return (Integer)((class11515)this.y_1).i();
    }

    private void M() {
    }

    public class11010(Arrows arrows, String string, boolean bl) {
        super(arrows, string, bl);
        this.M();
    }

    @Override
    public boolean test(class07049 class070492) {
        return class11791.E().and(class11791.N()).and(class11791.y().negate()).and(class11791.z().negate()).test(class070492);
    }

    @Override
    public float N() {
        this.M();
        return ((Float)((class11504)this.y_0).i()).floatValue();
    }

    @Override
    public void N(Arrows arrows) {
        this.M();
        this.y_0 = (class11504)class11524.N((class11512)arrows, (String)"friends-radius", (float)90.0f, (float)70.0f, (float)140.0f, (float)1.0f).N(class115362 -> this.U());
        this.y_1 = (class11515)class11524.N((class11512)arrows, (String)"friend-color", (int)-16711936).N(class115362 -> this.U());
    }
}

