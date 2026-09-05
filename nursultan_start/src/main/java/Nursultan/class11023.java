/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Arrows
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11515
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11785
 *  Nursultan.class11786
 *  Nursultan.class11791
 *  Nursultan.class11793
 *  Nursultan.class11817
 *  minecraft.class07049
 *  minecraft.class08036
 */
package Nursultan;

import Nursultan.Arrows;
import Nursultan.class11042;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11785;
import Nursultan.class11786;
import Nursultan.class11791;
import Nursultan.class11793;
import Nursultan.class11817;
import minecraft.class07049;
import minecraft.class08036;

public class class11023
extends class11042<class08036> {
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;

    @Override
    public int L() {
        this.i();
        return (Integer)((class11515)this.u_4).i();
    }

    public class11023(Arrows arrows, String string, boolean bl) {
        super(arrows, string, bl);
        this.i();
        this.u_0 = new class11785("invisible", false);
        this.u_1 = new class11786("naked", true);
        this.u_2 = new class11793("bot", true);
    }

    private void i() {
    }

    @Override
    public boolean test(class07049 class070492) {
        this.i();
        return class11791.B().and(class11791.N()).and(class11791.E().negate()).and(class11791.y().negate()).and((class11786)this.u_1).and((class11785)this.u_0).and((class11793)this.u_2).test(class070492);
    }

    @Override
    public void N(Arrows arrows) {
        this.i();
        class11524.y((class11512)arrows, (String)"target-condition", (class11535[])new class11817[]{(class11785)this.u_0, (class11786)this.u_1, (class11793)this.u_2}).N(class115362 -> this.U());
        this.u_3 = (class11504)class11524.N((class11512)arrows, (String)"player-radius", (float)90.0f, (float)70.0f, (float)140.0f, (float)1.0f).N(class115362 -> this.U());
        this.u_4 = (class11515)class11524.N((class11512)arrows, (String)"player-color", (int)-65536).N(class115362 -> this.U());
    }

    @Override
    public float N() {
        this.i();
        return ((Float)((class11504)this.u_3).i()).floatValue();
    }
}

