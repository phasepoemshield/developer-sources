/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10285
 *  com.google.common.base.Suppliers
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 *  minecraft.class00765
 *  minecraft.class00780
 *  minecraft.class00795
 *  minecraft.class01146
 *  minecraft.class01296
 *  minecraft.class02055
 *  minecraft.class03222
 *  minecraft.class03519
 *  minecraft.class03556
 *  minecraft.class03875
 *  minecraft.class04227
 *  minecraft.class05946
 *  net.fabricmc.fabric.impl.biome.TheEndBiomeData
 *  net.fabricmc.fabric.impl.biome.TheEndBiomeData$Overrides
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10285;
import com.google.common.base.Suppliers;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;
import minecraft.class00765;
import minecraft.class00780;
import minecraft.class00795;
import minecraft.class01146;
import minecraft.class01296;
import minecraft.class02055;
import minecraft.class03222;
import minecraft.class03519;
import minecraft.class03556;
import minecraft.class03875;
import minecraft.class04227;
import minecraft.class05946;
import net.fabricmc.fabric.impl.biome.TheEndBiomeData;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07663
extends class00765 {
    public static MapCodec<class07663> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03519.L((class05946)class04227.NA)).apply(instance, instance.stable(class07663::N)));
    private final class03556<class00780> L;
    private final class03556<class00780> u;
    private final class03556<class00780> i;
    private final class03556<class00780> R;
    private final class03556<class00780> M;
    private Supplier B;
    private boolean Z = false;
    private boolean z = false;

    private class07663(class03556<class00780> class035562, class03556<class00780> class035563, class03556<class00780> class035564, class03556<class00780> class035565, class03556<class00780> class035566) {
        this.L = class035562;
        this.u = class035563;
        this.i = class035564;
        this.R = class035565;
        this.M = class035566;
        this.N(class035562, class035563, class035564, class035565, class035566, null);
    }

    private static void y(class02055 class020552, CallbackInfoReturnable callbackInfoReturnable) {
        TheEndBiomeData.biomeRegistry.remove();
    }

    protected Stream<class03556<class00780>> y() {
        return Stream.of(this.L, this.u, this.i, this.R, this.M);
    }

    private void N(class03556 class035562, class03556 class035563, class03556 class035564, class03556 class035565, class03556 class035566, CallbackInfo callbackInfo) {
        class02055 var7 = (class02055)TheEndBiomeData.biomeRegistry.get();
        if (var7 == null) {
            throw new IllegalStateException("Biome registry not set by Mixin");
        }
        this.B = Suppliers.memoize(() -> TheEndBiomeData.createOverrides((class02055)var7));
    }

    protected Set N(Set set) {
        if (!this.z) {
            this.z = true;
            boolean bl = this.Z = !((TheEndBiomeData.Overrides)this.B.get()).customBiomes.isEmpty();
        }
        if (this.Z) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.addAll(((TheEndBiomeData.Overrides)this.B.get()).customBiomes);
            return Collections.unmodifiableSet(linkedHashSet);
        }
        return set;
    }

    private void N(int n, int n2, int n3, class03222 class032222, CallbackInfoReturnable callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue((Object)((TheEndBiomeData.Overrides)this.B.get()).pick(n, n2, n3, class032222, (class03556)callbackInfoReturnable.getReturnValue()));
    }

    public static class07663 N(class02055<class00780> class020552) {
        class07663.N(class020552, null);
        class07663 class076632 = new class07663((class03556<class00780>)class020552.y(class00795.NZ), (class03556<class00780>)class020552.y(class00795.Nz), (class03556<class00780>)class020552.y(class00795.NU), (class03556<class00780>)class020552.y(class00795.NE), (class03556<class00780>)class020552.y(class00795.NW));
        class07663.y(class020552, null);
        return class076632;
    }

    protected MapCodec<? extends class00765> N() {
        return y;
    }

    private static /* synthetic */ App<RecordCodecBuilder.Mu<class07663>, class07663> N(RecordCodecBuilder.Instance<class07663> instance) {
        return instance.group((App)class03519.u((class05946)class00795.NZ), (App)class03519.u((class05946)class00795.Nz), (App)class03519.u((class05946)class00795.NU), (App)class03519.u((class05946)class00795.NE), (App)class03519.u((class05946)class00795.NW)).apply(instance, instance.stable(class07663::new));
    }

    private static void N(CallbackInfo callbackInfo) {
        y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03519.L((class05946)class04227.NA)).apply(instance, instance.stable(class07663::N)));
    }

    private static void N(class02055 class020552, CallbackInfoReturnable callbackInfoReturnable) {
        TheEndBiomeData.biomeRegistry.set(class020552);
    }

    public class03556<class00780> method_38109(int n, int n2, int n3, class03222 class032222) {
        int n4;
        int n5 = class01146.L((int)n);
        int n6 = class01146.L((int)n2);
        int n7 = class01146.L((int)n3);
        int n8 = class01296.N((int)n5);
        if ((long)n8 * (long)n8 + (long)(n4 = class01296.N((int)n7)) * (long)n4 <= 4096L) {
            class03556<class00780> var14 = this.L;
            CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, var14);
            this.N(n, n2, n3, class032222, callbackInfoReturnable);
            if (callbackInfoReturnable.isCancelled()) {
                return (class03556)callbackInfoReturnable.getReturnValue();
            }
            return var14;
        }
        int n9 = (class01296.N((int)n5) * 2 + 1) * 8;
        int n10 = (class01296.N((int)n7) * 2 + 1) * 8;
        double d = class032222.i().N((class03875)new class10285(n9, n6, n10));
        if (d > 0.25) {
            class03556<class00780> var15 = this.u;
            CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, var15);
            this.N(n, n2, n3, class032222, callbackInfoReturnable);
            if (callbackInfoReturnable.isCancelled()) {
                return (class03556)callbackInfoReturnable.getReturnValue();
            }
            return var15;
        }
        if (d >= -0.0625) {
            class03556<class00780> var16 = this.i;
            CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, var16);
            this.N(n, n2, n3, class032222, callbackInfoReturnable);
            if (callbackInfoReturnable.isCancelled()) {
                return (class03556)callbackInfoReturnable.getReturnValue();
            }
            return var16;
        }
        if (d < -0.21875) {
            class03556<class00780> var17 = this.R;
            CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, var17);
            this.N(n, n2, n3, class032222, callbackInfoReturnable);
            if (callbackInfoReturnable.isCancelled()) {
                return (class03556)callbackInfoReturnable.getReturnValue();
            }
            return var17;
        }
        class03556<class00780> var18 = this.M;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, var18);
        this.N(n, n2, n3, class032222, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class03556)callbackInfoReturnable.getReturnValue();
        }
        return var18;
    }
}

