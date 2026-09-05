/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.google.common.collect.ImmutableBiMap
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01108
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01108;
import minecraft.class02774;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public interface class02674
extends class01108<class02774> {
    public static final Supplier<BiMap<class00891, class00891>> k_ = Suppliers.memoize(() -> {
        ImmutableBiMap immutableBiMap = ImmutableBiMap.builder().put((Object)class00869.bx, (Object)class00869.bD).put((Object)class00869.bD, (Object)class00869.bh).put((Object)class00869.bh, (Object)class00869.br).put((Object)class00869.jR, (Object)class00869.ji).put((Object)class00869.ji, (Object)class00869.ju).put((Object)class00869.ju, (Object)class00869.jL).put((Object)class00869.jz, (Object)class00869.jZ).put((Object)class00869.jZ, (Object)class00869.jB).put((Object)class00869.jB, (Object)class00869.jM).put((Object)class00869.jt, (Object)class00869.jn).put((Object)class00869.jn, (Object)class00869.jv).put((Object)class00869.jv, (Object)class00869.jj).put((Object)class00869.jb, (Object)class00869.jT).put((Object)class00869.jT, (Object)class00869.js).put((Object)class00869.js, (Object)class00869.jP).put((Object)class00869.jH, (Object)class00869.jc).put((Object)class00869.jc, (Object)class00869.ja).put((Object)class00869.ja, (Object)class00869.jX).put((Object)class00869.jC, (Object)class00869.jS).put((Object)class00869.jS, (Object)class00869.jD).put((Object)class00869.jD, (Object)class00869.jx).putAll((Map)class00869.RO.N()).put((Object)class00869.vL, (Object)class00869.vu).put((Object)class00869.vu, (Object)class00869.vi).put((Object)class00869.vi, (Object)class00869.vR).put((Object)class00869.vU, (Object)class00869.vE).put((Object)class00869.vE, (Object)class00869.vW).put((Object)class00869.vW, (Object)class00869.vm).putAll((Map)class00869.su.N()).put((Object)class00869.vj, (Object)class00869.vv).put((Object)class00869.vv, (Object)class00869.vn).put((Object)class00869.vn, (Object)class00869.vt).put((Object)class00869.vk, (Object)class00869.vY).put((Object)class00869.vY, (Object)class00869.vQ).put((Object)class00869.vQ, (Object)class00869.vO).put((Object)class00869.vq, (Object)class00869.vK).put((Object)class00869.vK, (Object)class00869.vV).put((Object)class00869.vV, (Object)class00869.ve).putAll((Map)class00869.RI.N()).build();
        ImmutableBiMap immutableBiMap2 = immutableBiMap;
        immutableBiMap2 = new CallbackInfoReturnable("", true, (Object)immutableBiMap2);
        class02674.N((CallbackInfoReturnable)immutableBiMap2);
        if (immutableBiMap2.isCancelled()) {
            return (BiMap)immutableBiMap2.getReturnValue();
        }
        return immutableBiMap;
    });
    public static final Supplier<BiMap<class00891, class00891>> l_ = Suppliers.memoize(() -> k_.get().inverse());

    public static Optional<class00891> L(class00891 class008912) {
        return Optional.ofNullable((class00891)k_.get().get((Object)class008912));
    }

    public static class00891 y(class00891 class008912) {
        class00891 class008913 = class008912;
        class00891 class008914 = (class00891)l_.get().get((Object)class008913);
        while (class008914 != null) {
            class008913 = class008914;
            class008914 = (class00891)l_.get().get((Object)class008913);
        }
        return class008913;
    }

    private static void N(CallbackInfoReturnable callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue((Object)HashBiMap.create((Map)((Map)callbackInfoReturnable.getReturnValue())));
    }

    public static Optional<class00891> N(class00891 class008912) {
        return Optional.ofNullable((class00891)l_.get().get((Object)class008912));
    }

    public static class00500 g_(class00500 class005002) {
        return class02674.y(class005002.i()).s(class005002);
    }

    public static Optional<class00500> f_(class00500 class005002) {
        return class02674.N(class005002.i()).map(class008912 -> class008912.s(class005002));
    }

    default public float J_() {
        if (this.i() == class02774.field_28704) {
            return 0.75f;
        }
        return 1.0f;
    }

    default public Optional<class00500> h_(class00500 class005002) {
        return class02674.L(class005002.i()).map(class008912 -> class008912.s(class005002));
    }
}

