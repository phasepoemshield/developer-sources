/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00093
 *  minecraft.class00392
 *  minecraft.class03420
 *  minecraft.class04981
 *  minecraft.class05096
 *  minecraft.class05129
 *  minecraft.class05435
 *  minecraft.class06202
 */
package minecraft;

import minecraft.class00093;
import minecraft.class00392;
import minecraft.class03420;
import minecraft.class04981;
import minecraft.class05096;
import minecraft.class05129;
import minecraft.class05435;
import minecraft.class06202;

public class class04722
extends class05129 {
    private static final class00392 y = class00392.L((String)"mco.connect.connecting");
    private final class05435 L;
    private final class04981 u;
    private final class00093 i;

    public void L() {
        this.L.y();
    }

    public class04722(class05096 class050962, class04981 class049812, class00093 class000932) {
        this.u = class049812;
        this.i = class000932;
        this.L = new class05435(class050962);
    }

    public void run() {
        if (this.i.N() != null) {
            this.L.N(this.u, class03420.N((String)this.i.N()));
        } else {
            this.i();
        }
    }

    public void i() {
        super.i();
        this.L.N();
        class06202.Nq().yL().Z();
    }

    public class00392 N() {
        return y;
    }
}

