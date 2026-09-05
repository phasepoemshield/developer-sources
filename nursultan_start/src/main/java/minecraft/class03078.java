/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10081
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class00201
 *  minecraft.class00225
 *  minecraft.class00412
 *  minecraft.class00629
 *  minecraft.class00693
 *  minecraft.class00751
 *  minecraft.class00780
 *  minecraft.class01014
 *  minecraft.class01022
 *  minecraft.class01079
 *  minecraft.class01089
 *  minecraft.class01214
 *  minecraft.class01255
 *  minecraft.class01894
 *  minecraft.class01921
 *  minecraft.class02017
 *  minecraft.class02206
 *  minecraft.class02298
 *  minecraft.class02505
 *  minecraft.class02530
 *  minecraft.class02819
 *  minecraft.class02857
 *  minecraft.class02965
 *  minecraft.class02982
 *  minecraft.class02992
 *  minecraft.class02996
 *  minecraft.class03238
 *  minecraft.class03246
 *  minecraft.class03252
 *  minecraft.class03515
 *  minecraft.class03516
 *  minecraft.class03519
 *  minecraft.class03529
 *  minecraft.class03542
 *  minecraft.class03573
 *  minecraft.class03648
 *  minecraft.class03689
 *  minecraft.class03877
 *  minecraft.class04068
 *  minecraft.class04086
 *  minecraft.class04227
 *  minecraft.class04336
 *  minecraft.class04382
 *  minecraft.class04412
 *  minecraft.class04449
 *  minecraft.class04513
 *  minecraft.class04748
 *  minecraft.class05056
 *  minecraft.class05235
 *  minecraft.class05281
 *  minecraft.class05943
 *  minecraft.class05946
 *  minecraft.class07080
 *  minecraft.class07099
 *  minecraft.class07304
 *  minecraft.class07376
 *  minecraft.class07536
 *  minecraft.class07587
 *  minecraft.class07589
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class07829
 *  minecraft.class07878
 *  minecraft.class08326
 *  minecraft.class08403
 *  minecraft.class08423
 *  minecraft.class08519
 *  minecraft.class08642
 *  minecraft.class09037
 *  net.fabricmc.fabric.api.event.registry.DynamicRegistrySetupCallback
 *  net.fabricmc.fabric.api.event.registry.DynamicRegistryView
 *  net.fabricmc.fabric.api.item.v1.EnchantmentSource
 *  net.fabricmc.fabric.impl.item.EnchantmentUtil
 *  net.fabricmc.fabric.impl.registry.sync.DynamicRegistryViewImpl
 *  net.fabricmc.fabric.impl.resource.conditions.ResourceConditionsImpl
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10081;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import minecraft.class00201;
import minecraft.class00225;
import minecraft.class00412;
import minecraft.class00629;
import minecraft.class00693;
import minecraft.class00751;
import minecraft.class00780;
import minecraft.class01014;
import minecraft.class01022;
import minecraft.class01079;
import minecraft.class01089;
import minecraft.class01214;
import minecraft.class01255;
import minecraft.class01894;
import minecraft.class01921;
import minecraft.class02017;
import minecraft.class02206;
import minecraft.class02298;
import minecraft.class02505;
import minecraft.class02530;
import minecraft.class02819;
import minecraft.class02857;
import minecraft.class02965;
import minecraft.class02982;
import minecraft.class02992;
import minecraft.class02996;
import minecraft.class03069;
import minecraft.class03238;
import minecraft.class03246;
import minecraft.class03252;
import minecraft.class03515;
import minecraft.class03516;
import minecraft.class03519;
import minecraft.class03529;
import minecraft.class03542;
import minecraft.class03573;
import minecraft.class03648;
import minecraft.class03689;
import minecraft.class03877;
import minecraft.class04068;
import minecraft.class04086;
import minecraft.class04227;
import minecraft.class04336;
import minecraft.class04382;
import minecraft.class04412;
import minecraft.class04449;
import minecraft.class04513;
import minecraft.class04748;
import minecraft.class05056;
import minecraft.class05235;
import minecraft.class05281;
import minecraft.class05943;
import minecraft.class05946;
import minecraft.class07080;
import minecraft.class07099;
import minecraft.class07304;
import minecraft.class07376;
import minecraft.class07536;
import minecraft.class07587;
import minecraft.class07589;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07829;
import minecraft.class07878;
import minecraft.class08326;
import minecraft.class08403;
import minecraft.class08423;
import minecraft.class08519;
import minecraft.class08642;
import minecraft.class09037;
import net.fabricmc.fabric.api.event.registry.DynamicRegistrySetupCallback;
import net.fabricmc.fabric.api.event.registry.DynamicRegistryView;
import net.fabricmc.fabric.api.item.v1.EnchantmentSource;
import net.fabricmc.fabric.impl.item.EnchantmentUtil;
import net.fabricmc.fabric.impl.registry.sync.DynamicRegistryViewImpl;
import net.fabricmc.fabric.impl.resource.conditions.ResourceConditionsImpl;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03078 {
    private static final Logger u = LogUtils.getLogger();
    private static final Comparator<class05946<?>> i = Comparator.comparing(class05946::y).thenComparing(class05946::N);
    private static final class02819 R = new class02819(Optional.empty(), Lifecycle.experimental());
    private static final Function<Optional<class02298>, class02819> M = class07536.y_4(optional -> {
        Lifecycle lifecycle = optional.map(class02298::N).map(bl -> Lifecycle.stable()).orElse(Lifecycle.experimental());
        return new class02819(optional, lifecycle);
    });
    public static final List<class02965<?>> N = List.of(new class02965(class04227.yu, class07376.B), new class02965(class04227.NA, class00780.N), new class02965(class04227.NC, class00629.N), new class02965(class04227.ND, class07829.N), new class02965(class04227.Nh, class03238.N), new class02965(class04227.ys, class04336.N), new class02965(class04227.yj, class04748.L), new class02965(class04227.yb, class04412.N), new class02965(class04227.yT, class05235.L), new class02965(class04227.yv, class05281.N), new class02965(class04227.yE, class05943.N), new class02965(class04227.yW, class05056.L), new class02965(class04227.yy, class03877.u), new class02965(class04227.yO, class04382.N), new class02965(class04227.yM, class04086.N), new class02965(class04227.yk, class03246.N), new class02965(class04227.yw, class03252.N), new class02965(class04227.yl, class04513.y), new class02965(class04227.yY, class02505.N, true), new class02965(class04227.yQ, class08519.N, true), new class02965(class04227.yP, class08642.N, true), new class02965(class04227.yB, class04068.N, true), new class02965(class04227.Nf, class03648.N, true), new class02965(class04227.Nr, class08403.N, true), new class02965(class04227.NS, class08423.N, true), new class02965(class04227.Nx, class07589.N, true), new class02965(class04227.ym, class00693.N, true), new class02965(class04227.yN, class03689.N), new class02965(class04227.yU, class03573.N), new class02965(class04227.NF, class00412.N), new class02965(class04227.yR, class07304.y), new class02965(class04227.yi, class02530.N), new class02965(class04227.yz, class02206.N), new class02965(class04227.yZ, class04449.N), new class02965(class04227.yn, class00225.N), new class02965(class04227.yt, class00201.y), new class02965(class04227.yL, class09037.L), new class02965(class04227.yG, class07587.y));
    public static final List<class02965<?>> y = List.of(new class02965(class04227.yI, class01255.N));
    public static List<class02965<?>> L = List.of(new class02965(class04227.NA, class00780.y), new class02965(class04227.NC, class00629.N), new class02965(class04227.yk, class03246.N), new class02965(class04227.yw, class03252.N), new class02965(class04227.yY, class02505.y, true), new class02965(class04227.yQ, class08519.y, true), new class02965(class04227.yP, class08642.y, true), new class02965(class04227.yB, class04068.y, true), new class02965(class04227.Nf, class03648.y, true), new class02965(class04227.Nr, class08403.y, true), new class02965(class04227.NS, class08423.y, true), new class02965(class04227.Nx, class07589.y, true), new class02965(class04227.ym, class00693.N, true), new class02965(class04227.yu, class07376.Z), new class02965(class04227.yN, class03689.N), new class02965(class04227.NF, class00412.N), new class02965(class04227.yR, class07304.y), new class02965(class04227.yz, class02206.N), new class02965(class04227.yZ, class04449.N), new class02965(class04227.yn, class00225.N), new class02965(class04227.yt, class00201.y), new class02965(class04227.yL, class09037.L), new class02965(class04227.yG, class07587.L));
    private static final ThreadLocal B = ThreadLocal.withInitial(() -> false);
    private static final ThreadLocal Z = new ThreadLocal();

    private static class07878 L(Map<class05946<?>, Exception> map) {
        class07080 class070802 = class07080.N((Throwable)new IllegalStateException("Failed to load registries due to errors"), (String)"Registry Loading");
        class070802.N("Loading info").N("Errors", () -> {
            StringBuilder stringBuilder = new StringBuilder();
            map.entrySet().stream().sorted(Map.Entry.comparingByKey(i)).forEach(entry -> stringBuilder.append("\n\t\t").append(((class05946)entry.getKey()).y()).append("/").append(((class05946)entry.getKey()).N()).append(": ").append(((Exception)entry.getValue()).getMessage()));
            return stringBuilder.toString();
        });
        return new class07878(class070802);
    }

    private static void y(class01089 class010892, class03542 class035422, class07099 class070992, Decoder decoder, Map map, CallbackInfo callbackInfo) {
        Z.remove();
    }

    private static void y(Map<class05946<?>, Exception> map) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        map.entrySet().stream().collect(Collectors.groupingBy(entry -> ((class05946)entry.getKey()).y(), Collectors.toMap(entry -> ((class05946)entry.getKey()).N(), Map.Entry::getValue))).entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry2 -> {
            printWriter.printf(Locale.ROOT, "> Errors in registry %s:%n", entry2.getKey());
            ((Map)entry2.getValue()).entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry -> {
                printWriter.printf(Locale.ROOT, ">> Errors in element %s:%n", entry.getKey());
                ((Exception)entry.getValue()).printStackTrace(printWriter);
            });
        });
        printWriter.flush();
        u.error("Registry loading errors:\n{}", (Object)stringWriter);
    }

    public static class01022 N(Map<class05946<? extends class00751<?>>, class02982> map, class02857 class028572, List<class01921<?>> list, List<class02965<?>> list2) {
        return class03078.N((class029922, class035422) -> class029922.N(map, class028572, class035422), list, list2);
    }

    private static class03529 N(class07099 class070992, class05946 class059462, Object object, class02819 class028192, Operation operation, class07099 class070993, Decoder decoder, class03519 class035192, class05946 class059463, class01079 class010792, class02819 class028193) {
        class07304 class073042;
        class07304 class073043;
        if (object instanceof class07304 && (class073043 = EnchantmentUtil.modify((class05946)class059462, (class07304)(class073042 = (class07304)object), (EnchantmentSource)EnchantmentUtil.determineSource((class01079)class010792))) != null) {
            object = class073043;
            class028192 = new class02819(Optional.empty(), class028192.y());
        }
        return (class03529)operation.call(new Object[]{class070992, class059463, object, class028192});
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static class01022 N(Object object, List list, List list2, Operation operation) {
        try {
            B.set(true);
            class01022 class010222 = (class01022)operation.call(new Object[]{object, list, list2});
            return class010222;
        }
        finally {
            B.set(false);
        }
    }

    public static class01022 N(class01089 class010892, List<class01921<?>> list, List<class02965<?>> list2) {
        return class03078.N((class029922, class035422) -> class029922.N(class010892, class035422), list, list2, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_7655$class_7656, java.util.List, java.util.List]");
            Object[] objectArray2 = objectArray;
            return class03078.N((class02996)objectArray[0], (List)objectArray2[1], (List)objectArray2[2]);
        });
    }

    private static void N(class07099 class070992, Decoder decoder, class03519 class035192, class05946 class059462, class01079 class010792, class02819 class028192, CallbackInfo callbackInfo, Reader reader, JsonElement jsonElement) throws IOException {
        class03542 class035422 = (class03542)Z.get();
        if (class035422 == null) {
            return;
        }
        if (jsonElement.isJsonObject() && !ResourceConditionsImpl.applyResourceConditions((JsonObject)jsonElement.getAsJsonObject(), (String)class059462.y().toString(), (class01894)class059462.N(), (class03542)class035422)) {
            reader.close();
            callbackInfo.cancel();
        }
    }

    private static void N(class01089 class010892, class03542 class035422, class07099 class070992, Decoder decoder, Map map, CallbackInfo callbackInfo) {
        Z.set(class035422);
    }

    private static void N(Object object, List list, List list2, CallbackInfoReturnable callbackInfoReturnable, List list3) {
        if (!((Boolean)B.get()).booleanValue()) {
            return;
        }
        IdentityHashMap<class05946, class07099> identityHashMap = new IdentityHashMap<class05946, class07099>(list3.size());
        for (class02992 class029922 : list3) {
            identityHashMap.put(class029922.y().i(), class029922.y());
        }
        ((DynamicRegistrySetupCallback)DynamicRegistrySetupCallback.EVENT.invoker()).onRegistrySetup((DynamicRegistryView)new DynamicRegistryViewImpl(identityHashMap));
    }

    private static class07878 N(Map<class05946<?>, Exception> map) {
        class03078.y(map);
        return class03078.L(map);
    }

    private static <T> class03515<T> N(class01921<T> class019212) {
        return new class03515(class019212, class019212, class019212.R());
    }

    static <E> void N(Map<class05946<? extends class00751<?>>, class02982> map, class02857 class028572, class03542 class035422, class07099<E> class070992, Decoder<E> decoder, Map<class05946<?>, Exception> map2) {
        class02982 class029822 = map.get(class070992.i());
        if (class029822 == null) {
            return;
        }
        class03519 class035192 = class03519.N((DynamicOps)class07713.N, (class03542)class035422);
        class03519 class035193 = class03519.N((DynamicOps)JsonOps.INSTANCE, (class03542)class035422);
        class03069 class030692 = class03069.N(class070992.i());
        for (class02017 class020172 : class029822.N()) {
            Object object;
            class01894 class018942;
            class05946 class059462 = class05946.N((class05946)class070992.i(), (class01894)class020172.N());
            Optional var13 = class020172.y();
            if (var13.isPresent()) {
                try {
                    class018942 = decoder.parse((DynamicOps)class035192, (Object)((class07709)var13.get()));
                    object = class018942.getOrThrow();
                    class070992.N(class059462, object, R);
                }
                catch (Exception exception) {
                    map2.put(class059462, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", var13.get()), exception));
                }
                continue;
            }
            class018942 = class030692.N(class020172.N());
            try {
                object = class028572.L(class018942);
                class03078.N(class070992, decoder, (class03519<JsonElement>)class035193, class059462, object, R);
            }
            catch (Exception exception) {
                map2.put(class059462, new IllegalStateException("Failed to parse local data", exception));
            }
        }
        class01214.N((class03516)class029822.y(), class070992);
    }

    static <E> void N(class01089 class010892, class03542 class035422, class07099<E> class070992, Decoder<E> decoder, Map<class05946<?>, Exception> map) {
        class03078.N(class010892, class035422, class070992, decoder, map, null);
        class03069 class030692 = class03069.N(class070992.i());
        class03519 class035192 = class03519.N((DynamicOps)JsonOps.INSTANCE, (class03542)class035422);
        for (Map.Entry<class01894, class01079> entry : class030692.N(class010892).entrySet()) {
            class01894 class018942 = entry.getKey();
            class05946 class059462 = class05946.N((class05946)class070992.i(), (class01894)class030692.y(class018942));
            class01079 class010792 = entry.getValue();
            class02819 class028192 = M.apply(class010792.method_56936());
            try {
                class03078.N(class070992, decoder, (class03519<JsonElement>)class035192, class059462, class010792, class028192);
            }
            catch (Exception exception) {
                map.put(class059462, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", class018942, class010792.method_14480()), exception));
            }
        }
        class01214.N((class01089)class010892, class070992);
        class03078.y(class010892, class035422, class070992, decoder, map, null);
    }

    private static <E> void N(class07099<E> class070992, Decoder<E> decoder, class03519<JsonElement> class035192, class05946<E> class059462, class01079 class010792, class02819 class028192) throws IOException {
        try (BufferedReader bufferedReader = class010792.method_43039();){
            JsonElement jsonElement = class08326.N((Reader)bufferedReader);
            CallbackInfo callbackInfo = new CallbackInfo("", true);
            class03078.N(class070992, decoder, class035192, class059462, class010792, class028192, callbackInfo, bufferedReader, jsonElement);
            if (callbackInfo.isCancelled()) {
                return;
            }
            DataResult dataResult = decoder.parse(class035192, (Object)jsonElement);
            Object object = dataResult.getOrThrow();
            class03078.N(class070992, class059462, object, class028192, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)4, (String)"[net.minecraft.class_2385, net.minecraft.class_5321, java.lang.Object, net.minecraft.class_9248]");
                Object[] objectArray2 = objectArray;
                return ((class07099)objectArray[0]).N((class05946)objectArray2[1], objectArray2[2], (class02819)objectArray2[3]);
            }, class070992, decoder, class035192, class059462, class010792, class028192);
        }
    }

    private static class01022 N(class02996 class029962, List<class01921<?>> list, List<class02965<?>> list2) {
        HashMap hashMap = new HashMap();
        List<class02992<?>> list3 = list2.stream().map(class029652 -> class029652.N(Lifecycle.stable(), hashMap)).collect(Collectors.toUnmodifiableList());
        class03542 class035422 = class03078.N(list, list3);
        Consumer<class02992> consumer = class029922 -> class029962.apply(class029922, class035422);
        class03078.N(class029962, list, list2, null, list3);
        list3.forEach(consumer);
        list3.forEach(class029922 -> {
            class07099 class070992 = class029922.y();
            try {
                class070992.W();
            }
            catch (Exception exception) {
                hashMap.put(class070992.i(), exception);
            }
            if (class029922.N().L() && class070992.L() == 0) {
                hashMap.put(class070992.i(), new IllegalStateException("Registry must be non-empty: " + String.valueOf(class070992.i().N())));
            }
        });
        if (!hashMap.isEmpty()) {
            throw class03078.N(hashMap);
        }
        return new class01014(list3.stream().map(class02992::y).toList()).method_40316();
    }

    private static class03542 N(List<class01921<?>> list, List<class02992<?>> list2) {
        HashMap hashMap = new HashMap();
        list.forEach(class019212 -> hashMap.put(class019212.i(), class03078.N(class019212)));
        list2.forEach(class029922 -> hashMap.put(class029922.y().i(), class03078.N(class029922.y())));
        return new class10081(hashMap);
    }

    private static <T> class03515<T> N(class07099<T> class070992) {
        return new class03515(class070992, class070992.s(), class070992.R());
    }
}

