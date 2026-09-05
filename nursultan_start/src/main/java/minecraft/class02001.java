/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00751
 *  minecraft.class01012
 *  minecraft.class01042
 *  minecraft.class02298
 *  minecraft.class02819
 *  minecraft.class02965
 *  minecraft.class02969
 *  minecraft.class03078
 *  minecraft.class05946
 *  minecraft.class07709
 *  net.fabricmc.fabric.impl.registry.sync.DynamicRegistriesImpl
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01012;
import minecraft.class01042;
import minecraft.class02003;
import minecraft.class02017;
import minecraft.class02298;
import minecraft.class02819;
import minecraft.class02965;
import minecraft.class02969;
import minecraft.class03078;
import minecraft.class05946;
import minecraft.class07709;
import net.fabricmc.fabric.impl.registry.sync.DynamicRegistriesImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02001 {
    public static Set<class05946<? extends class00751<?>>> N = class03078.L.stream().map(class02965::N).collect(Collectors.toUnmodifiableSet());

    public static Stream<class01012<?>> y(class02003<class02969> class020032) {
        Stream var1 = class020032.N(class02969.field_39971).method_40311();
        return Stream.concat(class02001.N(class020032), var1);
    }

    private static void N(class01012 class010122, CallbackInfoReturnable callbackInfoReturnable) {
        if (DynamicRegistriesImpl.SKIP_EMPTY_SYNC_REGISTRIES.contains(class010122.N()) && class010122.y().L() == 0) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    private static void N(Set set, class02965 class029652, DynamicOps dynamicOps, BiConsumer biConsumer, class00751 class007512, CallbackInfo callbackInfo) {
        if (DynamicRegistriesImpl.SKIP_EMPTY_SYNC_REGISTRIES.contains(class007512.i()) && class007512.L() == 0) {
            callbackInfo.cancel();
        }
    }

    public static void N(DynamicOps<class07709> dynamicOps, class01042 class010422, Set<class02298> set, BiConsumer<class05946<? extends class00751<?>>, List<class02017>> biConsumer) {
        class03078.L.forEach(class029652 -> class02001.N(dynamicOps, class029652, class010422, set, biConsumer));
    }

    private static <T> void N(DynamicOps<class07709> dynamicOps, class02965<T> class029652, class01042 class010422, Set<class02298> set, BiConsumer<class05946<? extends class00751<?>>, List<class02017>> biConsumer) {
        class010422.method_46759(class029652.N()).ifPresent(class007512 -> {
            CallbackInfo callbackInfo = new CallbackInfo("", true);
            class02001.N(set, class029652, dynamicOps, biConsumer, class007512, callbackInfo);
            if (callbackInfo.isCancelled()) {
                return;
            }
            ArrayList arrayList = new ArrayList(class007512.L());
            class007512.z().forEach(class035292 -> {
                Optional<class07709> optional = class007512.i(class035292.B()).flatMap(class02819::N).filter(set::contains).isPresent() ? Optional.empty() : Optional.of((class07709)class029652.y().encodeStart(dynamicOps, class035292.N()).getOrThrow(string -> new IllegalArgumentException("Failed to serialize " + String.valueOf(class035292.B()) + ": " + string)));
                arrayList.add(new class02017(class035292.B().N(), optional));
            });
            biConsumer.accept(class007512.i(), arrayList);
        });
    }

    private static Stream<class01012<?>> N(class01042 class010422) {
        return class010422.method_40311().filter(class010122 -> {
            CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
            class02001.N(class010122, callbackInfoReturnable);
            if (callbackInfoReturnable.isCancelled()) {
                return callbackInfoReturnable.getReturnValueZ();
            }
            return class02001.N(class010122.N());
        });
    }

    public static Stream<class01012<?>> N(class02003<class02969> class020032) {
        return class02001.N((class01042)class020032.L(class02969.field_39972));
    }

    public static boolean N(class05946<? extends class00751<?>> class059462) {
        return N.contains(class059462);
    }
}

