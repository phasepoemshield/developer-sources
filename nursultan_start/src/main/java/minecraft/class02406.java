/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00502
 *  minecraft.class03748
 *  minecraft.class04247
 *  minecraft.class06541
 *  minecraft.class06656
 *  minecraft.class06672
 */
package minecraft;

import minecraft.class00392;
import minecraft.class00502;
import minecraft.class03748;
import minecraft.class04247;
import minecraft.class06541;
import minecraft.class06656;
import minecraft.class06672;

public class class02406 {
    private final class00392 N;
    private final class00392 y;
    private final class00392 L;
    private final class06672 u;
    private final class06656 i;
    private final class06541 R;
    private final int M;

    public class06541 L() {
        return this.R;
    }

    public class00392 M() {
        return this.L;
    }

    public class02406(class04247 class042472) {
        this.N = (class00392)class03748.u.decode(class042472);
        this.M = class042472.readByte();
        this.u = (class06672)class06672.field_56490.decode(class042472);
        this.i = (class06656)class06656.field_56487.decode(class042472);
        this.R = (class06541)class042472.y(class06541.class);
        this.y = (class00392)class03748.u.decode(class042472);
        this.L = (class00392)class03748.u.decode(class042472);
    }

    public class02406(class00502 class005022) {
        this.N = class005022.u();
        this.M = class005022.m();
        this.u = class005022.U();
        this.i = class005022.W();
        this.R = class005022.P();
        this.y = class005022.R();
        this.L = class005022.M();
    }

    public class06656 i() {
        return this.i;
    }

    public class06672 u() {
        return this.u;
    }

    public int y() {
        return this.M;
    }

    public void N(class04247 class042472) {
        class03748.u.encode(class042472, this.N);
        class042472.writeByte(this.M);
        class06672.field_56490.encode(class042472, this.u);
        class06656.field_56487.encode(class042472, this.i);
        class042472.N((Enum)this.R);
        class03748.u.encode(class042472, this.y);
        class03748.u.encode(class042472, this.L);
    }

    public class00392 N() {
        return this.N;
    }

    public class00392 R() {
        return this.y;
    }
}

