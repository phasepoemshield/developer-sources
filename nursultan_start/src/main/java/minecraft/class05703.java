/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class00751
 *  minecraft.class01079
 *  minecraft.class01089
 *  minecraft.class01291
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class03069
 *  minecraft.class03347
 *  minecraft.class03542
 *  minecraft.class04643
 *  minecraft.class05946
 *  minecraft.class08326
 *  net.fabricmc.fabric.impl.loot.LootUtil
 *  net.fabricmc.fabric.impl.resource.conditions.ResourceConditionsImpl
 *  net.fabricmc.fabric.mixin.loot.FileToIdConverterAccessor
 *  net.fabricmc.fabric.mixin.resource.conditions.FileToIdConverterAccessor
 *  net.fabricmc.fabric.mixin.resource.conditions.RegistryOpsAccessor
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import minecraft.class00751;
import minecraft.class01079;
import minecraft.class01089;
import minecraft.class01291;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class03069;
import minecraft.class03347;
import minecraft.class03542;
import minecraft.class04643;
import minecraft.class05946;
import minecraft.class08326;
import net.fabricmc.fabric.impl.loot.LootUtil;
import net.fabricmc.fabric.impl.resource.conditions.ResourceConditionsImpl;
import net.fabricmc.fabric.mixin.resource.conditions.FileToIdConverterAccessor;
import net.fabricmc.fabric.mixin.resource.conditions.RegistryOpsAccessor;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class05703<T>
extends class01291<Map<class01894, T>> {
    private static final Logger N = LogUtils.getLogger();
    private final DynamicOps<JsonElement> y;
    private final Codec<T> L;
    private final class03069 u;
    private static final Object i;

    private class05703(DynamicOps<JsonElement> dynamicOps, Codec<T> codec, class03069 class030692) {
        this.y = dynamicOps;
        this.L = codec;
        this.u = class030692;
    }

    public class05703(Codec<T> codec, class03069 class030692) {
        this((DynamicOps<JsonElement>)JsonOps.INSTANCE, codec, class030692);
    }

    protected class05703(class01929 class019292, Codec<T> codec, class05946<? extends class00751<T>> class059462) {
        this((DynamicOps<JsonElement>)class019292.N((DynamicOps)JsonOps.INSTANCE), codec, class03069.N(class059462));
    }

    private static DataResult N(Codec codec, DynamicOps dynamicOps, Object object, Operation operation, class03069 class030692, Map.Entry entry) {
        String string;
        RegistryOpsAccessor registryOpsAccessor;
        JsonElement jsonElement = (JsonElement)object;
        class03542 class035422 = null;
        if (dynamicOps instanceof RegistryOpsAccessor) {
            registryOpsAccessor = (RegistryOpsAccessor)dynamicOps;
            class035422 = registryOpsAccessor.getRegistryInfoGetter();
        }
        if (jsonElement.isJsonObject() && !ResourceConditionsImpl.applyResourceConditions((JsonObject)(registryOpsAccessor = jsonElement.getAsJsonObject()), (String)(string = ((FileToIdConverterAccessor)class030692).getDirectoryName()), (class01894)((class01894)entry.getKey()), (class03542)class035422)) {
            return DataResult.success((Object)i);
        }
        return (DataResult)operation.call(new Object[]{codec, dynamicOps, object});
    }

    private static void N(Map map, class01894 class018942, Object object, CallbackInfo callbackInfo) {
        if (object == i) {
            callbackInfo.cancel();
        }
    }

    private static void N(class01089 class010892, class03069 class030692, DynamicOps dynamicOps, Codec codec, Map map, CallbackInfo callbackInfo, Map.Entry entry, class01894 class018942) {
        String string = ((net.fabricmc.fabric.mixin.loot.FileToIdConverterAccessor)class030692).getDirectoryName();
        if (!class03347.L.y().N().N().equals(string)) {
            return;
        }
        ((Map)LootUtil.SOURCES.get()).put(class018942, LootUtil.determineSource((class01079)((class01079)entry.getValue())));
    }

    private static DataResult N(Codec codec, DynamicOps dynamicOps, Object object, Operation operation, LocalRef localRef, LocalRef localRef2) {
        return class05703.N(codec, dynamicOps, object, operation, (class03069)localRef.get(), (Map.Entry)localRef2.get());
    }

    protected Map<class01894, T> y(class01089 class010892, class04643 class046432) {
        HashMap hashMap = new HashMap();
        class05703.N(class010892, this.u, this.y, this.L, hashMap);
        return hashMap;
    }

    public static <T> void N(class01089 class010892, class05946<? extends class00751<T>> class059462, DynamicOps<JsonElement> dynamicOps, Codec<T> codec, Map<class01894, T> map) {
        class05703.N(class010892, class03069.N(class059462), dynamicOps, codec, map);
    }

    public static <T> void N(class01089 class010892, class03069 class030692, DynamicOps<JsonElement> dynamicOps, Codec<T> codec, Map<class01894, T> map) {
        for (Map.Entry entry : class030692.N(class010892).entrySet()) {
            class01894 class018942 = (class01894)entry.getKey();
            class01894 class018943 = class030692.y(class018942);
            try {
                class05703.N(class010892, class030692, dynamicOps, codec, map, null, entry, class018943);
                BufferedReader bufferedReader = ((class01079)entry.getValue()).method_43039();
                try {
                    JsonElement jsonElement = class08326.N((Reader)bufferedReader);
                    Operation operation = objectArray -> {
                        WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[com.mojang.serialization.Codec, com.mojang.serialization.DynamicOps, java.lang.Object]");
                        Object[] objectArray2 = objectArray;
                        return ((Codec)objectArray[0]).parse((DynamicOps)objectArray2[1], objectArray2[2]);
                    };
                    LocalRefImpl localRefImpl = new LocalRefImpl();
                    LocalRefImpl localRefImpl2 = new LocalRefImpl();
                    localRefImpl.init((Object)class030692);
                    localRefImpl2.init(entry);
                    Map.Entry entry2 = (Map.Entry)localRefImpl2.dispose();
                    class030692 = (class03069)localRefImpl.dispose();
                    class05703.N(codec, dynamicOps, (Object)jsonElement, operation, (LocalRef)localRefImpl, (LocalRef)localRefImpl2).ifSuccess(object -> {
                        CallbackInfo callbackInfo = new CallbackInfo("", true);
                        class05703.N(map, class018943, object, callbackInfo);
                        if (callbackInfo.isCancelled()) {
                            return;
                        }
                        if (map.putIfAbsent(class018943, object) != null) {
                            throw new IllegalStateException("Duplicate data file ignored with ID " + String.valueOf(class018943));
                        }
                    }).ifError(error -> N.error("Couldn't parse data file '{}' from '{}': {}", new Object[]{class018943, class018942, error}));
                }
                finally {
                    if (bufferedReader == null) continue;
                    ((Reader)bufferedReader).close();
                }
            }
            catch (JsonParseException | IOException | IllegalArgumentException throwable) {
                N.error("Couldn't parse data file '{}' from '{}'", new Object[]{class018943, class018942, throwable});
            }
        }
    }
}

