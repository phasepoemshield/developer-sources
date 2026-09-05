/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00693
 *  minecraft.class00744
 *  minecraft.class00750
 *  minecraft.class00891
 *  minecraft.class01199
 *  minecraft.class01312
 *  minecraft.class01678
 *  minecraft.class01972
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02505
 *  minecraft.class02689
 *  minecraft.class02774
 *  minecraft.class03419
 *  minecraft.class03556
 *  minecraft.class03648
 *  minecraft.class03748
 *  minecraft.class03829
 *  minecraft.class04068
 *  minecraft.class04383
 *  minecraft.class04543
 *  minecraft.class05666
 *  minecraft.class06289
 *  minecraft.class06584
 *  minecraft.class07070
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07438
 *  minecraft.class07589
 *  minecraft.class08372
 *  minecraft.class08403
 *  minecraft.class08423
 *  minecraft.class08519
 *  minecraft.class08642
 *  minecraft.class08979
 *  net.fabricmc.fabric.impl.object.builder.FabricTrackedDataRegistryImpl
 *  net.fabricmc.fabric.mixin.object.builder.EntityDataSerializersAccessor
 *  net.fabricmc.loader.api.FabricLoader
 *  org.joml.Quaternionfc
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00693;
import minecraft.class00744;
import minecraft.class00750;
import minecraft.class00891;
import minecraft.class01199;
import minecraft.class01312;
import minecraft.class01678;
import minecraft.class01972;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02505;
import minecraft.class02689;
import minecraft.class02774;
import minecraft.class03419;
import minecraft.class03556;
import minecraft.class03648;
import minecraft.class03748;
import minecraft.class03829;
import minecraft.class04068;
import minecraft.class04383;
import minecraft.class04543;
import minecraft.class05666;
import minecraft.class06289;
import minecraft.class06584;
import minecraft.class07070;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07438;
import minecraft.class07589;
import minecraft.class08372;
import minecraft.class08403;
import minecraft.class08423;
import minecraft.class08519;
import minecraft.class08642;
import minecraft.class08979;
import net.fabricmc.fabric.impl.object.builder.FabricTrackedDataRegistryImpl;
import net.fabricmc.fabric.mixin.object.builder.EntityDataSerializersAccessor;
import net.fabricmc.loader.api.FabricLoader;
import org.joml.Quaternionfc;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class02154
implements EntityDataSerializersAccessor {
    private static final class01199<class04383<?>> c = class01199.L((int)16);
    public static final class04383<Byte> N = class04383.N((class02362)class02389.L);
    public static final class04383<Integer> y = class04383.N((class02362)class02389.B);
    public static final class04383<Long> L = class04383.N((class02362)class02389.U);
    public static final class04383<Float> u = class04383.N((class02362)class02389.E);
    public static final class04383<String> i = class04383.N((class02362)class02389.s);
    public static final class04383<class00392> R = class04383.N((class02362)class03748.u);
    public static final class04383<Optional<class00392>> M = class04383.N((class02362)class03748.i);
    public static final class04383<class06584> B = new class01678();
    public static final class04383<class00500> Z = class04383.N((class02362)class02389.N((class00750)class00891.U));
    private static final class02362<ByteBuf, Optional<class00500>> X = new class03419();
    public static final class04383<Optional<class00500>> z = class04383.N(X);
    public static final class04383<Boolean> U = class04383.N((class02362)class02389.y);
    public static final class04383<class07126> E = class04383.N((class02362)class07107.yW);
    public static final class04383<List<class07126>> W = class04383.N((class02362)class07107.yW.N_33(class02389.N()));
    public static final class04383<class00744> m = class04383.N((class02362)class00744.i);
    public static final class04383<class07209> P = class04383.N((class02362)class07209.field_48404);
    public static final class04383<Optional<class07209>> s = class04383.N((class02362)class07209.field_48404.N_33(class02389::N));
    public static final class04383<class07211> T = class04383.N((class02362)class07211.field_48450);
    public static final class04383<Optional<class08372<class07438>>> b = class04383.N((class02362)class08372.y().N_33(class02389::N));
    public static final class04383<Optional<class06289>> j = class04383.N((class02362)class06289.L.N_33(class02389::N));
    public static final class04383<class05666> v = class04383.N((class02362)class05666.u);
    private static final class02362<ByteBuf, OptionalInt> a = new class04543();
    public static final class04383<OptionalInt> n = class04383.N(a);
    public static final class04383<class01312> t = class04383.N((class02362)class01312.field_48323);
    public static final class04383<class03556<class03648>> G = class04383.N((class02362)class03648.u);
    public static final class04383<class03556<class08423>> l = class04383.N((class02362)class08423.u);
    public static final class04383<class03556<class08403>> d = class04383.N((class02362)class08403.u);
    public static final class04383<class03556<class02505>> w = class04383.N((class02362)class02505.u);
    public static final class04383<class03556<class08519>> k = class04383.N((class02362)class08519.u);
    public static final class04383<class03556<class04068>> Y = class04383.N((class02362)class04068.u);
    public static final class04383<class03556<class08642>> Q = class04383.N((class02362)class08642.u);
    public static final class04383<class03556<class07589>> O = class04383.N((class02362)class07589.u);
    public static final class04383<class03556<class00693>> g = class04383.N((class02362)class00693.u);
    public static final class04383<class03829> I = class04383.N((class02362)class03829.field_48335);
    public static final class04383<class01972> J = class04383.N((class02362)class01972.field_48341);
    public static final class04383<class02774> o = class04383.N((class02362)class02774.field_61432);
    public static final class04383<class08979> q = class04383.N((class02362)class08979.field_61298);
    public static final class04383<Vector3fc> K = class04383.N((class02362)class02389.t);
    public static final class04383<Quaternionfc> V = class04383.N((class02362)class02389.G);
    public static final class04383<class02689> e = class04383.N((class02362)class02689.y);
    public static final class04383<class07070> H = class04383.N((class02362)class07070.field_64359);

    private class02154() {
    }

    public static int y(class04383<?> class043832) {
        return c.N(class043832);
    }

    private static void N(CallbackInfo callbackInfo) {
        FabricTrackedDataRegistryImpl.storeVanillaHandlers();
    }

    private static void N(class04383 class043832, CallbackInfo callbackInfo) {
        if (FabricTrackedDataRegistryImpl.hasStoredVanillaHandlers() && FabricLoader.getInstance().isDevelopmentEnvironment()) {
            throw new IllegalStateException("Tried to register tracked data handler " + String.valueOf(class043832) + " using TrackedDataHandlerRegistry.register. This is not allowed as it can lead to desynchronization issues; use FabricTrackedDataRegistry.register instead.");
        }
    }

    public static /* synthetic */ class01199 N() {
        return c;
    }

    public static void N(class04383<?> class043832) {
        class02154.N(class043832, null);
        c.u(class043832);
    }

    public static @Nullable class04383<?> N(int n) {
        return (class04383)c.N(n);
    }

    static {
        class02154.N(N);
        class02154.N(y);
        class02154.N(L);
        class02154.N(u);
        class02154.N(i);
        class02154.N(R);
        class02154.N(M);
        class02154.N(B);
        class02154.N(U);
        class02154.N(m);
        class02154.N(P);
        class02154.N(s);
        class02154.N(T);
        class02154.N(b);
        class02154.N(Z);
        class02154.N(z);
        class02154.N(E);
        class02154.N(W);
        class02154.N(v);
        class02154.N(n);
        class02154.N(t);
        class02154.N(G);
        class02154.N(d);
        class02154.N(w);
        class02154.N(k);
        class02154.N(Y);
        class02154.N(Q);
        class02154.N(l);
        class02154.N(O);
        class02154.N(j);
        class02154.N(g);
        class02154.N(J);
        class02154.N(I);
        class02154.N(q);
        class02154.N(o);
        class02154.N(K);
        class02154.N(V);
        class02154.N(e);
        class02154.N(H);
    }
}

