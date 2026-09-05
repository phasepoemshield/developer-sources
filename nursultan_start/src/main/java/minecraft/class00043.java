/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02726
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class07049
 *  minecraft.class07504
 *  minecraft.class08036
 *  minecraft.class08678
 */
package minecraft;

import minecraft.class02726;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class07049;
import minecraft.class07504;
import minecraft.class08036;
import minecraft.class08678;

public class class00043
extends class08678 {
    private final class08036 m;
    private final class07504 P;
    private final boolean s;

    protected boolean T() {
        return this.s != this.m.method_5869();
    }

    public class00043(class08036 class080362, class07504 class075042, boolean bl, class04891 class048912, float f, float f2, float f3) {
        super(class080362, (class07049)class075042, bl, class048912, class04911.field_15254, f, f2, f3);
        this.m = class080362;
        this.P = class075042;
        this.s = bl;
    }

    protected float b() {
        return (float)this.P.method_18798().Z();
    }

    protected boolean j() {
        return this.P.method_52172() || !(this.P.N() instanceof class02726);
    }
}

