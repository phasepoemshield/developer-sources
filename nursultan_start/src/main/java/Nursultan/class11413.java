/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Tracers
 *  minecraft.class07049
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.Tracers;
import Nursultan.class11419;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11524;
import Nursultan.class11536;
import java.util.Optional;
import minecraft.class07049;
import minecraft.class07438;

public class class11413<T extends class07438>
extends class11419<T> {
    public Object L_0;

    public class11413(Tracers tracers, String string, boolean bl) {
        super(tracers, string, bl);
        this.R();
    }

    public void N(Tracers tracers) {
        String string = "living-color";
        Optional.ofNullable((class11515)tracers.L(tracers.N_7(string).N())).ifPresentOrElse(class115152 -> {
            this.R();
            this.L_0 = (class11515)class115152.N(class115152.Z().or(class115362 -> this.U()));
        }, () -> {
            this.R();
            this.L_0 = (class11515)class11524.N((class11512)tracers, string, -1).N((class11536<T> class115362) -> this.U());
        });
    }

    public boolean test(class07049 class070492) {
        return class070492 instanceof class07438;
    }

    @Override
    public int N() {
        this.R();
        return (Integer)((class11515)this.L_0).i();
    }

    private void R() {
    }
}

