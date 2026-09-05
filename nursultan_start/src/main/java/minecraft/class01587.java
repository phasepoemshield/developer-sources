/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceMap
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ReferenceSet
 *  it.unimi.dsi.fastutil.objects.ReferenceSets
 *  minecraft.class00500
 *  minecraft.class00742
 *  minecraft.class00751
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class02566
 *  minecraft.class04206
 *  minecraft.class04689
 *  minecraft.class04750
 *  minecraft.class06229
 *  minecraft.class06761
 *  minecraft.class06884
 *  minecraft.class07209
 *  minecraft.class07287
 *  minecraft.class07290
 *  minecraft.class07295
 *  minecraft.class07299
 *  minecraft.class07728
 *  minecraft.class08059
 *  minecraft.class08092
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.model.color.interop.BlockColorsExtension
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl
 *  net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl$ColorMapperHolder
 *  net.fabricmc.fabric.impl.registry.sync.trackers.IdListTracker
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceMap;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceSet;
import it.unimi.dsi.fastutil.objects.ReferenceSets;
import java.util.Map;
import java.util.Set;
import minecraft.class00500;
import minecraft.class00742;
import minecraft.class00751;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class02566;
import minecraft.class04206;
import minecraft.class04689;
import minecraft.class04750;
import minecraft.class06229;
import minecraft.class06761;
import minecraft.class06884;
import minecraft.class07209;
import minecraft.class07287;
import minecraft.class07290;
import minecraft.class07295;
import minecraft.class07299;
import minecraft.class07728;
import minecraft.class08059;
import minecraft.class08092;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.model.color.interop.BlockColorsExtension;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl;
import net.fabricmc.fabric.impl.registry.sync.trackers.IdListTracker;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class01587
implements BlockColorsExtension,
ColorProviderRegistryImpl.ColorMapperHolder {
    private static final int L = -1;
    public static final int N = -14647248;
    public static final int y = -9321636;
    private final class00742<class04750> u;
    private final Map<class00891, Set<class08092<?>>> i;
    private final Reference2ReferenceMap R = new Reference2ReferenceOpenHashMap();
    private final ReferenceSet M = new ReferenceOpenHashSet();

    public class01587() {
        this.u = new class00742(32);
        this.i = Maps.newHashMap();
        this.N((CallbackInfo)null);
    }

    public class04750 get(class00891 class008912) {
        return (class04750)this.u.N(class04206.i.N((Object)class008912));
    }

    private void N(class04750 class047502, class00891[] class00891Array, CallbackInfo callbackInfo) {
        for (class00891 class008912 : class00891Array) {
            if (this.R.put((Object)class008912, (Object)class047502) == null) continue;
            this.M.add((Object)class008912);
            SodiumClientMod.logger().info("Block {} had its color provider replaced with {} and will not use per-vertex coloring", (Object)class04206.i.y((Object)class008912), (Object)class047502.toString());
        }
    }

    private void N(CallbackInfo callbackInfo) {
        IdListTracker.register((class00751)class04206.i, (String)"BlockColors.providers", this.u);
    }

    public static class01587 N() {
        class01587 class015872 = new class01587();
        class015872.N((class005002, class072952, class072092, n) -> {
            if (class072952 == null || class072092 == null) {
                return class07287.N();
            }
            return class06229.N((class07295)class072952, (class07209)(class005002.L((class08092)class06761.y) == class08059.field_12609 ? class072092.method_10074() : class072092));
        }, class00869.zk, class00869.zw);
        class015872.N((class08092<?>)class06761.y, class00869.zk, class00869.zw);
        class015872.N((class005002, class072952, class072092, n) -> {
            if (class072952 == null || class072092 == null) {
                return class07287.N();
            }
            return class06229.N((class07295)class072952, (class07209)class072092);
        }, class00869.Z, class00869.yY, class00869.yk, class00869.MF, class00869.yO);
        class015872.N((class005002, class072952, class072092, n) -> {
            if (n != 0) {
                if (class072952 == null || class072092 == null) {
                    return class07287.N();
                }
                return class06229.N((class07295)class072952, (class07209)class072092);
            }
            return -1;
        }, class00869.vh, class00869.vr);
        class015872.N((class005002, class072952, class072092, n) -> -10380959, class00869.Ne);
        class015872.N((class005002, class072952, class072092, n) -> -8345771, class00869.NH);
        class015872.N((class005002, class072952, class072092, n) -> {
            if (class072952 == null || class072092 == null) {
                return -12012264;
            }
            return class06229.y((class07295)class072952, (class07209)class072092);
        }, class00869.NV, class00869.Nc, class00869.NX, class00869.Np, class00869.Rc, class00869.NA);
        class015872.N((class005002, class072952, class072092, n) -> {
            if (class072952 == null || class072092 == null) {
                return -10732494;
            }
            return class06229.L((class07295)class072952, (class07209)class072092);
        }, class00869.nN);
        class015872.N((class005002, class072952, class072092, n) -> {
            if (class072952 == null || class072092 == null) {
                return -1;
            }
            return class06229.u((class07295)class072952, (class07209)class072092);
        }, class00869.K, class00869.PN, class00869.Mz);
        class015872.N((class005002, class072952, class072092, n) -> class06884.y((int)((Integer)class005002.L((class08092)class06884.R))), class00869.Lf);
        class015872.N((class08092<?>)class06884.R, class00869.Lf);
        class015872.N((class005002, class072952, class072092, n) -> {
            if (class072952 == null || class072092 == null) {
                return -1;
            }
            return class06229.N((class07295)class072952, (class07209)class072092);
        }, class00869.it);
        class015872.N((class005002, class072952, class072092, n) -> -2046180, class00869.RV, class00869.RK);
        class015872.N((class005002, class072952, class072092, n) -> {
            int n2 = (Integer)class005002.L((class08092)class07728.L);
            return class02566.N((int)(n2 * 32), (int)(255 - n2 * 8), (int)(n2 * 4));
        }, class00869.RH, class00869.Re);
        class015872.N((class08092<?>)class07728.L, class00869.RH, class00869.Re);
        class015872.N((class005002, class072952, class072092, n) -> {
            if (class072952 == null || class072092 == null) {
                return -9321636;
            }
            return -14647248;
        }, class00869.RS);
        class01587 class015873 = class015872;
        class01587.N(new CallbackInfoReturnable("", false, (Object)class015873));
        return class015873;
    }

    private static void N(CallbackInfoReturnable callbackInfoReturnable) {
        ColorProviderRegistryImpl.BLOCK.initialize((Object)((class01587)callbackInfoReturnable.getReturnValue()));
    }

    public int N(class00500 class005002, @Nullable class07295 class072952, @Nullable class07209 class072092, int n) {
        class04750 class047502 = (class04750)this.u.N(class04206.i.N((Object)class005002.i()));
        return class047502 == null ? -1 : class047502.getColor(class005002, class072952, class072092, n);
    }

    public void N(class04750 class047502, class00891 ... class00891Array) {
        this.N(class047502, class00891Array, (CallbackInfo)null);
        for (class00891 class008912 : class00891Array) {
            this.u.N((Object)class047502, class04206.i.N((Object)class008912));
        }
    }

    public Set<class08092<?>> N(class00891 class008912) {
        return (Set)this.i.getOrDefault(class008912, (Set<class08092<?>>)ImmutableSet.of());
    }

    private void N(class08092<?> class080922, class00891 ... class00891Array) {
        this.N((Set<class08092<?>>)ImmutableSet.of(class080922), class00891Array);
    }

    private void N(Set<class08092<?>> set, class00891 ... class00891Array) {
        for (class00891 class008912 : class00891Array) {
            this.i.put(class008912, set);
        }
    }

    public int N(class00500 class005002, class07299 class072992, class07209 class072092) {
        class04750 class047502 = (class04750)this.u.N(class04206.i.N((Object)class005002.i()));
        if (class047502 != null) {
            return class047502.getColor(class005002, null, null, 0);
        }
        class04689 class046892 = class005002.N((class07290)class072992, class072092);
        return class046892 != null ? class046892.NU : -1;
    }

    public Reference2ReferenceMap sodium$getProviders() {
        return Reference2ReferenceMaps.unmodifiable((Reference2ReferenceMap)this.R);
    }

    public ReferenceSet sodium$getOverridenVanillaBlocks() {
        return ReferenceSets.unmodifiable((ReferenceSet)this.M);
    }
}

