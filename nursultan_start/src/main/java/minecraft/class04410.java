/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Queues
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  minecraft.class00951
 *  minecraft.class00954
 *  minecraft.class00961
 *  minecraft.class00962
 *  minecraft.class00967
 *  minecraft.class00987
 *  minecraft.class01383
 *  minecraft.class01894
 *  minecraft.class03448
 *  minecraft.class03646
 *  minecraft.class04206
 *  minecraft.class05363
 *  minecraft.class06064
 *  minecraft.class06069
 *  minecraft.class06166
 *  minecraft.class06627
 *  minecraft.class07049
 *  minecraft.class07126
 *  minecraft.class08700
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.particle.ParticleRendererRegistryImpl
 *  net.fabricmc.fabric.mixin.client.particle.ParticleEngineAccessor
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.function.Function;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import minecraft.class00951;
import minecraft.class00954;
import minecraft.class00961;
import minecraft.class00962;
import minecraft.class00967;
import minecraft.class00987;
import minecraft.class01383;
import minecraft.class01894;
import minecraft.class03448;
import minecraft.class03646;
import minecraft.class04206;
import minecraft.class04406;
import minecraft.class04417;
import minecraft.class05363;
import minecraft.class06064;
import minecraft.class06069;
import minecraft.class06166;
import minecraft.class06627;
import minecraft.class07049;
import minecraft.class07126;
import minecraft.class08700;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.particle.ParticleRendererRegistryImpl;
import net.fabricmc.fabric.mixin.client.particle.ParticleEngineAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class04410
implements ParticleEngineAccessor {
    public static List<class06166> L = List.of(class06166.N, class06166.y, class06166.L);
    protected class03448 N;
    private final Map<class06166, class00962<?>> u = Maps.newIdentityHashMap();
    private final Queue<class03646> i = Queues.newArrayDeque();
    private final Queue<class04406> R = Queues.newArrayDeque();
    private final Object2IntOpenHashMap<class06064> M = new Object2IntOpenHashMap();
    public final class00951 y;
    private final class06069 B = class06069.u();

    public void L() {
        this.u.clear();
        this.R.clear();
        this.i.clear();
        this.M.clear();
    }

    public class04410(class03448 class034482, class00951 class009512) {
        this.N = class034482;
        this.y = class009512;
    }

    public static /* synthetic */ List u() {
        return L;
    }

    public String y() {
        return String.valueOf(this.u.values().stream().mapToInt(class00962::L).sum());
    }

    private <T extends class07126> @Nullable class04406 y(T t, double d, double d2, double d3, double d4, double d5, double d6) {
        class04417 var14 = (class04417)this.y.N().get(class04206.z.N((Object)t.method_10295()));
        if (var14 == null) {
            return null;
        }
        return var14.method_3090(t, this.N, d, d2, d3, d4, d5, d6, this.B);
    }

    private static void N(CallbackInfo callbackInfo) {
        L = new ArrayList<class06166>(L);
    }

    public void N(class07049 class070492, class07126 class071262) {
        this.i.add(new class03646(this.N, class070492, class071262));
    }

    public void N(class07049 class070492, class07126 class071262, int n) {
        this.i.add(new class03646(this.N, class070492, class071262, n));
    }

    public void N(@Nullable class03448 class034482) {
        this.N = class034482;
        this.L();
        this.i.clear();
    }

    public void N(class07126 class071262, double d, double d2, double d3, double d4, double d5, double d6, CallbackInfoReturnable callbackInfoReturnable) {
        if (SodiumExtraClientMod.options().particleSettings.particles) {
            class01894 class018943 = class04206.z.y((Object)class071262.method_10295());
            if (!SodiumExtraClientMod.options().particleSettings.otherMap.computeIfAbsent(class018943, class018942 -> true).booleanValue()) {
                callbackInfoReturnable.setReturnValue(null);
            }
        } else {
            callbackInfoReturnable.setReturnValue(null);
        }
    }

    private void N(class06166 class061662, CallbackInfoReturnable callbackInfoReturnable) {
        Function var3 = ParticleRendererRegistryImpl.INSTANCE.getFactory(class061662);
        if (var3 != null) {
            callbackInfoReturnable.setReturnValue((Object)((class00962)var3.apply(this)));
        }
    }

    protected void N(class06064 class060642, int n) {
        this.M.addTo((Object)class060642, n);
    }

    private class00962<?> N(class06166 class061662) {
        if (class061662 == class06166.y) {
            return new class00961(this);
        }
        if (class061662 == class06166.L) {
            return new class06627(this);
        }
        if (class061662 == class06166.u) {
            return new class00967(this);
        }
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class061662, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00962)callbackInfoReturnable.getReturnValue();
        }
        return new class00954(this, class061662);
    }

    public void N() {
        Object object;
        this.u.forEach((class061662, class009622) -> {
            class08700.N().N(class061662.N());
            class009622.y();
            class08700.N().L();
        });
        if (!this.i.isEmpty()) {
            object = Lists.newArrayList();
            for (class03646 class036462 : this.i) {
                class036462.method_3070();
                if (class036462.method_3086()) continue;
                object.add(class036462);
            }
            this.i.removeAll((Collection<?>)object);
        }
        if (!this.R.isEmpty()) {
            while ((object = this.R.poll()) != null) {
                this.u.computeIfAbsent(((class04406)object).method_74274(), this::N).N((class04406)object);
            }
        }
    }

    public void N(class04406 class044062) {
        Optional<class06064> var2 = class044062.method_34019();
        if (var2.isPresent()) {
            if (this.N(var2.get())) {
                this.R.add(class044062);
                this.N(var2.get(), 1);
            }
        } else {
            this.R.add(class044062);
        }
    }

    public void N(class00987 class009872, class01383 class013832, class05363 class053632, float f) {
        for (class06166 class061662 : L) {
            class00962<?> var7 = this.u.get(class061662);
            if (var7 == null || var7.N()) continue;
            class009872.N(var7.N(class013832, class053632, f));
        }
    }

    public @Nullable class04406 N(class07126 class071262, double d, double d2, double d3, double d4, double d5, double d6) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class071262, d, d2, d3, d4, d5, d6, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class04406)callbackInfoReturnable.getReturnValue();
        }
        class04406 class044062 = this.y(class071262, d, d2, d3, d4, d5, d6);
        if (class044062 != null) {
            this.N(class044062);
            return class044062;
        }
        return null;
    }

    private boolean N(class06064 class060642) {
        return this.M.getInt((Object)class060642) < class060642.N();
    }
}

