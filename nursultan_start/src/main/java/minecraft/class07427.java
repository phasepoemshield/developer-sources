/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01231
 *  minecraft.class07079
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class01231;
import minecraft.class07079;
import minecraft.class07430;
import minecraft.class07473;

public class class07427
extends class07473 {
    private final class07079 N;

    public class07427(class07079 class070792) {
        this.N = class070792;
        this.N_71(EnumSet.of(class07430.field_18407));
        class070792.f().N(true);
    }

    public boolean B() {
        return true;
    }

    public void i() {
        if (this.N.method_59922().z() < 0.8f) {
            this.N.A().y();
        }
    }

    public boolean N() {
        return this.N.method_5799() && this.N.method_5861(class01231.N) > this.N.method_29241() || this.N.method_5771();
    }
}

