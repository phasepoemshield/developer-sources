/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00500
 *  minecraft.class00860
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class02484
 *  minecraft.class02674
 *  minecraft.class02749
 *  minecraft.class02859
 *  minecraft.class03556
 *  minecraft.class04770
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06501
 *  minecraft.class06573
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06638
 *  minecraft.class07004
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08092
 *  net.fabricmc.fabric.api.registry.StrippableBlockRegistry$StrippingTransformer
 *  net.fabricmc.fabric.impl.content.registry.StrippableBlockRegistryImpl
 *  net.fabricmc.fabric.mixin.content.registry.AxeItemAccessor
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableMap;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import minecraft.class00500;
import minecraft.class00860;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class02484;
import minecraft.class02674;
import minecraft.class02749;
import minecraft.class02859;
import minecraft.class03556;
import minecraft.class04770;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06501;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06638;
import minecraft.class06912;
import minecraft.class07004;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08092;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.fabricmc.fabric.impl.content.registry.StrippableBlockRegistryImpl;
import net.fabricmc.fabric.mixin.content.registry.AxeItemAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06938
extends class06581
implements AxeItemAccessor {
    protected static Map<class00891, class00891> N = new ImmutableMap.Builder().put((Object)class00869.Nv, (Object)class00869.NY).put((Object)class00869.D, (Object)class00869.NT).put((Object)class00869.Nw, (Object)class00869.No).put((Object)class00869.Nu, (Object)class00869.NP).put((Object)class00869.n, (Object)class00869.Nq).put((Object)class00869.Ni, (Object)class00869.Ns).put((Object)class00869.Nl, (Object)class00869.NI).put((Object)class00869.Ny, (Object)class00869.NW).put((Object)class00869.Nd, (Object)class00869.NJ).put((Object)class00869.NL, (Object)class00869.Nm).put((Object)class00869.Nt, (Object)class00869.NO).put((Object)class00869.r, (Object)class00869.NU).put((Object)class00869.NG, (Object)class00869.Ng).put((Object)class00869.NN, (Object)class00869.NE).put((Object)class00869.Nn, (Object)class00869.NQ).put((Object)class00869.h, (Object)class00869.Nz).put((Object)class00869.sB, (Object)class00869.sZ).put((Object)class00869.sz, (Object)class00869.sU).put((Object)class00869.sT, (Object)class00869.sb).put((Object)class00869.sj, (Object)class00869.sv).put((Object)class00869.Nk, (Object)class00869.NK).put((Object)class00869.NR, (Object)class00869.Nb).put((Object)class00869.NZ, (Object)class00869.Nj).build();

    private boolean L(class06501 class065012) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_20_5) && class06938.y(class065012);
    }

    public class06938(class02749 class027492, float f, float f2, class06573 class065732) {
        super(class065732.y(class027492, f, f2));
    }

    private static boolean y(class06501 class065012) {
        class08036 class080362 = class065012.method_8036();
        return class065012.method_20287().equals((Object)class07050.field_5808) && class080362.method_6079().L(class02484.H) && !class080362.method_21823();
    }

    public class07082 N(class06501 class065012) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class065012, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        class07299 class072992 = class065012.method_8045();
        class07209 class072092 = class065012.method_8037();
        class08036 class080362 = class065012.method_8036();
        class06501 class065013 = class065012;
        if (this.L(class065013)) {
            return class07082.i;
        }
        Optional<class00500> var5 = this.N(class072992, class072092, class080362, class072992.method_8320(class072092));
        if (var5.isEmpty()) {
            return class07082.i;
        }
        class06584 class065842 = class065012.method_8041();
        if (class080362 instanceof class04770) {
            class06912.X.N((class04770)class080362, class072092, class065842);
        }
        class072992.method_8652(class072092, var5.get(), 11);
        class072992.N((class03556)class01194.L, class072092, class01164.N((class07049)class080362, (class00500)var5.get()));
        if (class080362 != null) {
            class065842.N(1, (class07438)class080362, class065012.method_20287().N());
        }
        return class07082.N;
    }

    private void N(class06501 class065012, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            callbackInfoReturnable.setReturnValue((Object)class07082.i);
        }
    }

    public static /* synthetic */ Map N() {
        return N;
    }

    public static /* synthetic */ void N(Map map) {
        N = map;
    }

    private static void N(class07299 class072992, class07209 class072092, @Nullable class08036 class080362, class00500 class005002, class04891 class048912, int n) {
        class072992.method_8396((class07049)class080362, class072092, class048912, class04911.field_15245, 1.0f, 1.0f);
        class072992.method_8444((class07049)class080362, n, class072092, 0);
        if (class005002.i() instanceof class00860 && class005002.L((class08092)class00860.i) != class06638.field_12569) {
            class07209 class072093 = class00860.y((class07209)class072092, (class00500)class005002);
            class072992.N((class03556)class01194.L, class072093, class01164.N((class07049)class080362, (class00500)class072992.method_8320(class072093)));
            class072992.method_8444((class07049)class080362, n, class072093, 0);
        }
    }

    private Optional<class00500> N(class00500 class005002) {
        Function<class00891, class00500> function = class008912 -> (class00500)class008912.W().y((class08092)class07004.L, (Comparable)((class07185)class005002.L((class08092)class07004.L)));
        return Optional.ofNullable(N.get(class005002.i())).map(this.N(function, class005002));
    }

    private Optional<class00500> N(class07299 class072992, class07209 class072092, @Nullable class08036 class080362, class00500 class005002) {
        Optional<class00500> var5 = this.N(class005002);
        if (var5.isPresent()) {
            class072992.method_8396((class07049)class080362, class072092, class04909.NV, class04911.field_15245, 1.0f, 1.0f);
            return var5;
        }
        Optional var6 = class02674.f_((class00500)class005002);
        if (var6.isPresent()) {
            class06938.N(class072992, class072092, class080362, class005002, class04909.Ne, 3005);
            return var6;
        }
        Optional<class00500> optional = Optional.ofNullable((class00891)((BiMap)class02859.y.get()).get((Object)class005002.i())).map(class008912 -> class008912.s(class005002));
        if (optional.isPresent()) {
            class06938.N(class072992, class072092, class080362, class005002, class04909.NH, 3004);
            return optional;
        }
        return Optional.empty();
    }

    private Function N(Function function, class00500 class005002) {
        StrippableBlockRegistry.StrippingTransformer strippingTransformer = StrippableBlockRegistryImpl.getTransformer((class00891)class005002.i());
        if (strippingTransformer != null) {
            return class008912 -> strippingTransformer.getStrippedBlockState(class008912, class005002);
        }
        return function;
    }
}

