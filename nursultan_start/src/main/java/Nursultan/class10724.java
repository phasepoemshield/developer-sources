/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03556
 *  minecraft.class06069
 *  minecraft.class07047
 *  minecraft.class07084
 *  minecraft.class07446
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import minecraft.class03556;
import minecraft.class06069;
import minecraft.class07047;
import minecraft.class07084;
import minecraft.class07446;
import org.jspecify.annotations.Nullable;

public class class10724
implements class07446 {
    public @Nullable class03556<class07084> N;

    public void N(class06069 class060692) {
        int n = class060692.y(5);
        if (n <= 1) {
            this.N = class07047.N;
        } else if (n <= 2) {
            this.N = class07047.i;
        } else if (n <= 3) {
            this.N = class07047.z;
        } else if (n <= 4) {
            this.N = class07047.m;
        }
    }
}

