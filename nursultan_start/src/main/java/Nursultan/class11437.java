/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Tracers
 *  Nursultan.class11791
 *  minecraft.class07049
 */
package Nursultan;

import Nursultan.Tracers;
import Nursultan.class11414;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11524;
import Nursultan.class11536;
import Nursultan.class11791;
import minecraft.class07049;

public class class11437
extends class11414 {
    public Object y_0;

    private void M() {
    }

    public class11437(Tracers tracers, String string, boolean bl) {
        super(tracers, string, bl);
        this.M();
    }

    @Override
    public int N() {
        this.M();
        return (Integer)((class11515)this.y_0).i();
    }

    @Override
    public void N(Tracers tracers) {
        this.M();
        this.y_0 = (class11515)class11524.N((class11512)tracers, "friend-color", -16711936).N((class11536<T> class115362) -> this.U());
    }

    @Override
    public boolean test(class07049 class070492) {
        return class11791.E().and(class11791.N()).and(class11791.y().negate()).test(class070492);
    }
}

