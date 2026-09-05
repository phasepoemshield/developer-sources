/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07079
 *  minecraft.class07430
 *  minecraft.class07466
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class07079;
import minecraft.class07430;
import minecraft.class07466;
import minecraft.class08011;

class class08010
extends class07466 {
    public void L() {
        super.L();
        this.u.method_16826(0);
    }

    public class08010(class07079 class070792) {
        super(class070792, 6, class08011.N);
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    public boolean y() {
        return ((class08011)this.u).NQ() && super.y();
    }

    public boolean N() {
        class08011 class080112 = (class08011)this.u;
        return class080112.NQ() && class08011.N(class080112).y(class08010.y((int)10)) == 0 && super.N();
    }
}

