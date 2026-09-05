/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07475
 *  minecraft.class07872
 *  minecraft.class07993
 */
package Nursultan;

import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07475;
import minecraft.class07872;
import minecraft.class07993;

public class class10846
extends class07993 {
    public class10846(class07872 class078722, double d) {
        super((class07475)class078722, d);
    }

    public boolean N() {
        if (!this.M()) {
            return false;
        }
        class07209 class072092 = this.N((class07290)this.L.method_73183(), (class07049)this.L, 7);
        if (class072092 != null) {
            this.i = class072092.method_10263();
            this.R = class072092.method_10264();
            this.M = class072092.method_10260();
            return true;
        }
        return this.Z();
    }
}

