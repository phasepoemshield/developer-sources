/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class01054
 *  minecraft.class01858
 *  minecraft.class01883
 *  minecraft.class01894
 *  minecraft.class02071
 *  minecraft.class03400
 *  minecraft.class03434
 *  minecraft.class04601
 *  minecraft.class04654
 *  minecraft.class04957
 *  minecraft.class05097
 *  minecraft.class05111
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05341
 *  minecraft.class05729
 *  minecraft.class06478
 *  minecraft.class07536
 */
package minecraft;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01054;
import minecraft.class01858;
import minecraft.class01883;
import minecraft.class01894;
import minecraft.class02071;
import minecraft.class03400;
import minecraft.class03434;
import minecraft.class04601;
import minecraft.class04654;
import minecraft.class04729;
import minecraft.class04957;
import minecraft.class05097;
import minecraft.class05111;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05341;
import minecraft.class05729;
import minecraft.class06478;
import minecraft.class07536;

class class04735
extends class05729<class04735> {
    private static final class00392 y = class00392.L((String)"mco.invites.button.accept");
    private static final class00392 L = class00392.L((String)"mco.invites.button.reject");
    private static final class01883 u = new class01883(class01894.y((String)"pending_invite/accept"), class01894.y((String)"pending_invite/accept_highlighted"));
    private static final class01883 i = new class01883(class01894.y((String)"pending_invite/reject"), class01894.y((String)"pending_invite/reject_highlighted"));
    private static final int R = 18;
    private static final int M = 21;
    private static final int B = 38;
    private final class04957 Z;
    private final List<class06478> z = new ArrayList<class06478>();
    private final class01858 U;
    private final class01858 E;
    private final class02071 W;
    private final class02071 m;
    private final class02071 P;
    final /* synthetic */ class04729 N;

    class04735(class04729 class047292, class04957 class049572) {
        this.N = class047292;
        this.Z = class049572;
        int n = class047292.L.method_25322() - 32 - 32 - 42;
        this.W = new class02071((class00392)class00392.y((String)class049572.y()), class04729.N(class047292)).N(n);
        this.m = new class02071((class00392)class00392.y((String)class049572.L()).y(-6250336), class04729.y(class047292)).N(n);
        this.P = new class02071(class00390.N((class00392)class04601.N((Instant)class049572.i()), (class00405)class00405.N.N(-6250336)), class04729.L(class047292)).N(n);
        class05341 class053412 = this.N(class049572);
        this.U = class01858.N((class00392)y, class053622 -> this.N(true), (boolean)false).N(u, 18, 18).N(21, 21).N(class053412).N().y();
        this.E = class01858.N((class00392)L, class053622 -> this.N(false), (boolean)false).N(i, 18, 18).N(21, 21).N(class053412).N().y();
        this.z.addAll(List.of(this.U, this.E));
    }

    private class05341 N(class04957 class049572) {
        return supplier -> {
            class05216 class052162 = class05220.N((class00392[])new class00392[]{(class00392)supplier.get(), class00392.y((String)class049572.y()), class00392.y((String)class049572.L()), class04601.N((Instant)class049572.i())});
            return class00392.N((String)"narrator.select", (Object[])new Object[]{class052162});
        };
    }

    private void N(boolean bl) {
        String string = this.Z.N();
        CompletableFuture.supplyAsync(() -> {
            try {
                class05111 class051112 = class05111.N();
                if (bl) {
                    class051112.N(string);
                } else {
                    class051112.y(string);
                }
                return true;
            }
            catch (class05097 class050972) {
                class04729.N.error("Couldn't handle invite", (Throwable)class050972);
                return false;
            }
        }, (Executor)class07536.Z()).thenAcceptAsync(bl2 -> {
            if (bl2.booleanValue()) {
                this.N.L.N(this);
                class03400 class034002 = class04729.i(this.N).Nd();
                if (bl) {
                    class034002.L.N();
                }
                class034002.u.N();
            }
        }, class04729.u(this.N));
    }

    public List<? extends class04654> method_25396() {
        return this.z;
    }

    public List<? extends class03434> method_37025() {
        return this.z;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = this.method_73380();
        int n4 = this.method_73382();
        int n5 = n3 + 38;
        class04601.N((class01054)class010542, (int)n3, (int)n4, (int)32, (UUID)this.Z.u());
        this.W.y(n5, n4 + 1);
        this.W.method_48579(class010542, n, n2, (float)n3);
        this.m.y(n5, n4 + 12);
        this.m.method_48579(class010542, n, n2, (float)n3);
        this.P.y(n5, n4 + 24);
        this.P.method_48579(class010542, n, n2, (float)n3);
        int n6 = n4 + this.method_73384() / 2 - 10;
        this.U.y(n3 + this.method_73387() - 16 - 42, n6);
        this.U.method_25394(class010542, n, n2, f);
        this.E.y(n3 + this.method_73387() - 8 - 21, n6);
        this.E.method_25394(class010542, n, n2, f);
    }
}

