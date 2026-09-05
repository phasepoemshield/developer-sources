/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01631
 *  minecraft.class03383
 *  minecraft.class03404
 *  minecraft.class03417
 *  minecraft.class03933
 */
package Nursultan;

import com.mojang.authlib.GameProfile;
import java.util.Objects;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01631;
import minecraft.class03383;
import minecraft.class03404;
import minecraft.class03417;
import minecraft.class03933;

public class class10192
extends class03404 {
    private static final int y = 12;
    private static final int L = 4;
    private final class00392 u;
    private final Supplier<class01631> i;
    private final boolean R;
    final /* synthetic */ class03383 N;

    public class10192(class03383 class033832, GameProfile gameProfile, class00392 class003922, boolean bl) {
        this.N = class033832;
        this.u = class003922;
        this.R = bl;
        this.i = class03383.N((class03383)class033832).yP().N(gameProfile, true);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = this.method_73380() - 12 + 4;
        int n4 = this.method_73382() + (this.method_73384() - 12) / 2;
        class03933.N((class01054)class010542, (class01631)this.i.get(), (int)n3, (int)n4, (int)12);
        int n5 = this.method_73382() + 1;
        int n6 = this.method_73384();
        Objects.requireNonNull(class03417.Z((class03417)this.N.y));
        int n7 = n5 + (n6 - 9) / 2;
        class010542.y(class03417.z((class03417)this.N.y), this.u, n3 + 12 + 4, n7, this.R ? -1 : -1593835521);
    }
}

