/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class03383
 *  minecraft.class05936
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class03383;
import minecraft.class03404;
import minecraft.class03417;
import minecraft.class05936;

public class class03413
extends class03404 {
    private final class00392 y;
    final /* synthetic */ class03383 N;

    public class03413(class03383 class033832, class00392 class003922) {
        this.N = class033832;
        this.y = class003922;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = this.method_73385();
        int n4 = this.method_73389() - 8;
        int n5 = class03417.U(this.N.y).N((class05936)this.y);
        int n6 = (this.method_73380() + n4 - n5) / 2;
        Objects.requireNonNull(class03417.E(this.N.y));
        int n7 = n3 - 4;
        class010542.y(class03417.W(this.N.y), this.y, n6, n7, -6250336);
    }

    @Override
    public class00392 method_37006() {
        return this.y;
    }
}

