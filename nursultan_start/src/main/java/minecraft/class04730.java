/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01858
 *  minecraft.class01894
 *  minecraft.class03434
 *  minecraft.class04601
 *  minecraft.class04654
 *  minecraft.class04950
 *  minecraft.class04964
 *  minecraft.class05096
 *  minecraft.class05122
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05936
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01858;
import minecraft.class01894;
import minecraft.class03434;
import minecraft.class04601;
import minecraft.class04654;
import minecraft.class04710;
import minecraft.class04718;
import minecraft.class04950;
import minecraft.class04964;
import minecraft.class05096;
import minecraft.class05122;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05936;

class class04730
extends class04718 {
    protected static final int N = 32;
    private static final class00392 L = class00392.L((String)"mco.configure.world.invites.normal.tooltip");
    private static final class00392 u = class00392.L((String)"mco.configure.world.invites.ops.tooltip");
    private static final class00392 i = class00392.L((String)"mco.configure.world.invites.remove.tooltip");
    private static final class01894 R = class01894.y((String)"player_list/make_operator");
    private static final class01894 M = class01894.y((String)"player_list/remove_operator");
    private static final class01894 B = class01894.y((String)"player_list/remove_player");
    private static final int Z = 8;
    private static final int z = 7;
    private final class04950 U;
    private final class05362 E;
    private final class05362 W;
    private final class05362 m;
    final /* synthetic */ class04710 y;

    private void L(int n) {
        if (n >= 0 && n < this.y.M.Z.size()) {
            class04950 class049502 = (class04950)this.y.M.Z.get(n);
            class05122 class051222 = new class05122(bl -> {
                if (bl) {
                    class04601.N(class051112 -> class051112.N(this.y.M.y, class049502.y), (T class050972) -> class04710.N.error("Couldn't uninvite user", (Throwable)class050972));
                    this.y.M.Z.remove(n);
                    this.y.N(this.y.M);
                }
                this.y.i.N((class05096)this.y.u);
            }, class04710.L, (class00392)class00392.N((String)"mco.configure.world.uninvite.player", (Object[])new Object[]{class049502.N}));
            this.y.i.N((class05096)class051222);
        }
    }

    public class04730(class04710 class047102, class04950 class049502) {
        this.y = class047102;
        this.U = class049502;
        int n = class047102.M.Z.indexOf(this.U);
        this.W = class01858.N((class00392)L, class053622 -> this.N(n), (boolean)false).N(R, 8, 7).N(16 + class047102.u.method_64506().N((class05936)L)).N(supplier -> class05220.N((class00392[])new class00392[]{class00392.N((String)"mco.invited.player.narration", (Object[])new Object[]{class049502.N}), (class00392)supplier.get(), class00392.N((String)"narration.cycle_button.usage.focused", (Object[])new Object[]{u})})).y();
        this.m = class01858.N((class00392)u, class053622 -> this.y(n), (boolean)false).N(M, 8, 7).N(16 + class047102.u.method_64506().N((class05936)u)).N(supplier -> class05220.N((class00392[])new class00392[]{class00392.N((String)"mco.invited.player.narration", (Object[])new Object[]{class049502.N}), (class00392)supplier.get(), class00392.N((String)"narration.cycle_button.usage.focused", (Object[])new Object[]{L})})).y();
        this.E = class01858.N((class00392)i, class053622 -> this.L(n), (boolean)false).N(B, 8, 7).N(16 + class047102.u.method_64506().N((class05936)i)).N(supplier -> class05220.N((class00392[])new class00392[]{class00392.N((String)"mco.invited.player.narration", (Object[])new Object[]{class049502.N}), (class00392)supplier.get()})).y();
        this.N();
    }

    private class05362 y() {
        if (this.W.field_22764) {
            return this.W;
        }
        return this.m;
    }

    private void y(int n) {
        UUID uUID = ((class04950)this.y.M.Z.get((int)n)).y;
        class04601.N(class051112 -> class051112.L(this.y.M.y, uUID), (T class050972) -> class04710.N.error("Couldn't deop the user", (Throwable)class050972)).thenAcceptAsync(class049642 -> {
            this.N((class04964)class049642);
            this.N();
            this.method_25395((class04654)this.W);
        }, (Executor)this.y.i);
    }

    private void N(class04964 class049642) {
        for (class04950 class049502 : this.y.M.Z) {
            class049502.L = class049642.N().contains(class049502.N);
        }
    }

    private void N(int n) {
        UUID uUID = ((class04950)this.y.M.Z.get((int)n)).y;
        class04601.N(class051112 -> class051112.y(this.y.M.y, uUID), (T class050972) -> class04710.N.error("Couldn't op the user", (Throwable)class050972)).thenAcceptAsync(class049642 -> {
            this.N((class04964)class049642);
            this.N();
            this.method_25395((class04654)this.m);
        }, (Executor)this.y.i);
    }

    private void N() {
        this.W.field_22764 = !this.U.L;
        this.m.field_22764 = !this.W.field_22764;
    }

    public List<? extends class04654> method_25396() {
        return ImmutableList.of((Object)this.y(), (Object)this.E);
    }

    public List<? extends class03434> method_37025() {
        return ImmutableList.of((Object)this.y(), (Object)this.E);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = !this.U.u ? -6250336 : (this.U.i ? -16711936 : -1);
        int n4 = this.method_73385() - 16;
        class04601.N((class01054)class010542, (int)this.method_73380(), (int)n4, (int)32, (UUID)this.U.y);
        int n5 = this.method_73385();
        Objects.requireNonNull(this.y.R);
        int n6 = n5 - 4;
        class010542.y(this.y.R, this.U.N, this.method_73380() + 8 + 32, n6, n3);
        int n7 = this.method_73385() - 10;
        int n8 = this.method_73389() - this.E.method_25368();
        this.E.y(n8, n7);
        this.E.method_25394(class010542, n, n2, f);
        int n9 = n8 - this.y().method_25368() - 8;
        this.W.y(n9, n7);
        this.W.method_25394(class010542, n, n2, f);
        this.m.y(n9, n7);
        this.m.method_25394(class010542, n, n2, f);
    }
}

