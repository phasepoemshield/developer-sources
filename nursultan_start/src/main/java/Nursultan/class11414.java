/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Tracers
 *  Nursultan.class11785
 *  Nursultan.class11786
 *  Nursultan.class11791
 *  Nursultan.class11793
 *  Nursultan.class11817
 *  minecraft.class07049
 *  minecraft.class08036
 */
package Nursultan;

import Nursultan.Tracers;
import Nursultan.class11413;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11536;
import Nursultan.class11785;
import Nursultan.class11786;
import Nursultan.class11791;
import Nursultan.class11793;
import Nursultan.class11817;
import minecraft.class07049;
import minecraft.class08036;

public class class11414
extends class11413<class08036> {
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;

    private void M() {
    }

    public class11414(Tracers tracers, String string, boolean bl) {
        super(tracers, string, bl);
        this.M();
        this.u_0 = new class11785("invisible", false);
        this.u_1 = new class11786("naked", true);
        this.u_2 = new class11793("bot", true);
    }

    @Override
    public boolean test(class07049 class070492) {
        this.M();
        return class11791.B().and(class11791.N()).and(class11791.E().negate()).and(class11791.y().negate()).and((class11786)this.u_1).and((class11785)this.u_0).and((class11793)this.u_2).test(class070492);
    }

    @Override
    public void N(Tracers tracers) {
        this.M();
        class11524.y((class11512)tracers, (String)"target-condition", (class11535[])new class11817[]{(class11785)this.u_0, (class11786)this.u_1, (class11793)this.u_2}).N((class11536<T> class115362) -> this.U());
        this.u_3 = (class11515)class11524.N((class11512)tracers, "player-color", -65536).N((class11536<T> class115362) -> this.U());
    }

    @Override
    public int N() {
        this.M();
        return (Integer)((class11515)this.u_3).i();
    }
}

