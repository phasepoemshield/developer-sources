/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00381
 *  minecraft.class01042
 *  minecraft.class01654
 *  minecraft.class02001
 *  minecraft.class02003
 *  minecraft.class02817
 *  minecraft.class02969
 *  minecraft.class03525
 *  minecraft.class04159
 *  minecraft.class04188
 *  minecraft.class07713
 *  minecraft.class08076
 *  net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.serialization.DynamicOps;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import minecraft.class00381;
import minecraft.class01042;
import minecraft.class01654;
import minecraft.class02001;
import minecraft.class02003;
import minecraft.class02298;
import minecraft.class02817;
import minecraft.class02969;
import minecraft.class03525;
import minecraft.class04159;
import minecraft.class04188;
import minecraft.class07713;
import minecraft.class08076;
import net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class02290
implements class04188 {
    public static final class04159 N = new class04159("synchronize_registries");
    private final List<class02298> y;
    private final class02003<class02969> L;
    private static final Logger u = LoggerFactory.getLogger((String)"SynchronizeRegistriesTaskMixin");

    public class02290(List<class02298> list, class02003<class02969> class020032) {
        this.y = list;
        this.L = class020032;
    }

    public void N(List list, Consumer consumer, CallbackInfo callbackInfo) {
        if (new HashSet<class02298>(this.y).containsAll(list)) {
            this.N(consumer, Set.copyOf(list));
            callbackInfo.cancel();
        }
    }

    public void N(Consumer consumer, Set set, CallbackInfo callbackInfo) {
        u.debug("Synchronizing registries with common known packs: {}", (Object)set);
    }

    private void N(Consumer consumer, CallbackInfo callbackInfo) {
        if (this.y.size() > ModResourcePackCreator.MAX_KNOWN_PACKS) {
            u.warn("Too many knownPacks: Found {}; max {}", (Object)this.y.size(), (Object)ModResourcePackCreator.MAX_KNOWN_PACKS);
            consumer.accept(new class02817(this.y.subList(0, ModResourcePackCreator.MAX_KNOWN_PACKS)));
            callbackInfo.cancel();
        }
    }

    private void N(Consumer<class00381<?>> consumer, Set<class02298> set) {
        this.N(consumer, set, null);
        class02001.N((DynamicOps)this.L.N().N((DynamicOps)class07713.N), (class01042)this.L.L((Object)class02969.field_39972), set, (class059462, list) -> consumer.accept((class00381<?>)new class01654(class059462, list)));
        consumer.accept((class00381<?>)new class08076(class03525.N(this.L)));
    }

    public void N(List<class02298> list, Consumer<class00381<?>> consumer) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(list, consumer, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        if (list.equals(this.y)) {
            this.N(consumer, Set.copyOf(this.y));
        } else {
            this.N(consumer, Set.of());
        }
    }

    public class04159 method_52375() {
        return N;
    }

    public void method_52376(Consumer<class00381<?>> consumer) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(consumer, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        consumer.accept((class00381<?>)new class02817(this.y));
    }
}

