/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class00720
 *  minecraft.class00731
 *  minecraft.class00751
 *  minecraft.class01014
 *  minecraft.class01022
 *  minecraft.class01089
 *  minecraft.class01214
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class02003
 *  minecraft.class02063
 *  minecraft.class02819
 *  minecraft.class02969
 *  minecraft.class03347
 *  minecraft.class03519
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04482
 *  minecraft.class04490
 *  minecraft.class05062
 *  minecraft.class05074
 *  minecraft.class05561
 *  minecraft.class05703
 *  minecraft.class05946
 *  minecraft.class06925
 *  minecraft.class07099
 *  minecraft.class07536
 *  net.fabricmc.fabric.api.loot.v3.FabricLootTableBuilder
 *  net.fabricmc.fabric.api.loot.v3.LootTableEvents
 *  net.fabricmc.fabric.api.loot.v3.LootTableEvents$Loaded
 *  net.fabricmc.fabric.api.loot.v3.LootTableEvents$Modify
 *  net.fabricmc.fabric.api.loot.v3.LootTableEvents$Replace
 *  net.fabricmc.fabric.api.loot.v3.LootTableSource
 *  net.fabricmc.fabric.impl.loot.FabricLootTable
 *  net.fabricmc.fabric.impl.loot.LootUtil
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.gson.JsonElement;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.WeakHashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;
import minecraft.class00720;
import minecraft.class00731;
import minecraft.class00751;
import minecraft.class01014;
import minecraft.class01022;
import minecraft.class01089;
import minecraft.class01214;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class02003;
import minecraft.class02063;
import minecraft.class02347;
import minecraft.class02819;
import minecraft.class02969;
import minecraft.class03347;
import minecraft.class03519;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04482;
import minecraft.class04490;
import minecraft.class05062;
import minecraft.class05074;
import minecraft.class05561;
import minecraft.class05703;
import minecraft.class05946;
import minecraft.class06925;
import minecraft.class07099;
import minecraft.class07536;
import net.fabricmc.fabric.api.loot.v3.FabricLootTableBuilder;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import net.fabricmc.fabric.impl.loot.FabricLootTable;
import net.fabricmc.fabric.impl.loot.LootUtil;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02314 {
    private static final Logger N = LogUtils.getLogger();
    private static final class02819 y = new class02819(Optional.empty(), Lifecycle.experimental());
    private static final WeakHashMap L = new WeakHashMap();

    private static void N(class03347 class033472, class01089 class010892, class03519 class035192, CallbackInfoReturnable callbackInfoReturnable) {
        if (class033472 != class03347.L) {
            return;
        }
        class00751 class007512 = (class00751)callbackInfoReturnable.getReturnValue();
        ((LootTableEvents.Loaded)LootTableEvents.ALL_LOADED.invoker()).onLootTablesLoaded(class010892, class007512);
        LootUtil.SOURCES.remove();
        class007512.z().forEach(class035292 -> ((FabricLootTable)class035292.N()).fabric$setRegistryEntry((class03556)class035292));
    }

    private static Object N(Object object, class01894 class018942, class03519 class035192) {
        if (!(object instanceof class05074)) {
            return object;
        }
        class05074 class050742 = (class05074)object;
        class05946 class059462 = class05946.N((class05946)class04227.yJ, (class01894)class018942);
        class01929 class019292 = (class01929)L.get(class035192);
        LootTableSource lootTableSource = ((Map)LootUtil.SOURCES.get()).getOrDefault(class018942, LootTableSource.DATA_PACK);
        class05074 class050743 = ((LootTableEvents.Replace)LootTableEvents.REPLACE.invoker()).replaceLootTable(class059462, class050742, lootTableSource, class019292);
        if (class050743 != null) {
            class050742 = class050743;
            lootTableSource = LootTableSource.REPLACED;
        }
        class05062 class050622 = FabricLootTableBuilder.copyOf((class05074)class050742);
        ((LootTableEvents.Modify)LootTableEvents.MODIFY.invoker()).modifyLootTable(class059462, class050622, lootTableSource, class019292);
        return class050622.L();
    }

    private static void N(class03347 class033472, class01089 class010892, class03519 class035192, CallbackInfoReturnable callbackInfoReturnable, Map map) {
        map.replaceAll((class018942, object) -> class02314.N(object, class018942, class035192));
    }

    private static CompletableFuture N(CompletableFuture completableFuture, Function function, Executor executor, Operation operation, class03519 class035192) {
        return (CompletableFuture)operation.call(new Object[]{completableFuture.thenApply(list -> {
            L.remove(class035192);
            return list;
        }), function, executor});
    }

    private static class03519 N(class01929 class019292, DynamicOps dynamicOps, Operation operation) {
        class03519 class035192 = (class03519)operation.call(new Object[]{class019292, dynamicOps});
        L.put(class035192, class019292);
        return class035192;
    }

    private static <T> CompletableFuture<class07099<?>> N(class03347<T> class033472, class03519<JsonElement> class035192, class01089 class010892, Executor executor) {
        return CompletableFuture.supplyAsync(() -> {
            class00731 class007312 = new class00731(class033472.y(), Lifecycle.experimental());
            HashMap<class01894, Object> hashMap = new HashMap<class01894, Object>();
            class05703.N((class01089)class010892, (class05946)class033472.y(), (DynamicOps)class035192, (Codec)class033472.L(), hashMap);
            BiConsumer<class01894, Object> biConsumer = (arg_0, arg_1) -> class02314.N((class07099)class007312, class033472, arg_0, arg_1);
            class02314.N(class033472, class010892, class035192, null, hashMap);
            hashMap.forEach(biConsumer);
            class01214.N((class01089)class010892, (class07099)class007312);
            class00731 class007313 = class007312;
            class02314.N(class033472, class010892, class035192, new CallbackInfoReturnable("", false, (Object)class007313));
            return class007313;
        }, executor);
    }

    public static CompletableFuture<class02347> N(class02003<class02969> class020032, List<class00720<?>> list2, class01089 class010892, Executor executor) {
        class01929 class019292 = class01929.N(class01214.N((class01022)class020032.y((Object)class02969.field_39974), list2).stream());
        Object object = JsonOps.INSTANCE;
        Object object2 = class019292;
        class03519 class035192 = class02314.N(object2, (DynamicOps)object, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_7225$class_7874, com.mojang.serialization.DynamicOps]");
            return ((class01929)objectArray[0]).N((DynamicOps)objectArray[1]);
        });
        Executor executor2 = executor;
        object = list -> class02314.N(class020032, class019292, list);
        object2 = class07536.L((List)class03347.N().map(class033472 -> class02314.N(class033472, (class03519<JsonElement>)class035192, class010892, executor)).toList());
        Operation operation = objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[java.util.concurrent.CompletableFuture, java.util.function.Function, java.util.concurrent.Executor]");
            Object[] objectArray2 = objectArray;
            return ((CompletableFuture)objectArray[0]).thenApplyAsync((Function)objectArray2[1], (Executor)objectArray2[2]);
        };
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init((Object)class035192);
        class035192 = (class03519)localRefImpl.dispose();
        return class02314.N((CompletableFuture)object2, (Function)object, executor2, operation, (LocalRef)localRefImpl);
    }

    private static CompletableFuture N(CompletableFuture completableFuture, Function function, Executor executor, Operation operation, LocalRef localRef) {
        return class02314.N(completableFuture, function, executor, operation, (class03519)localRef.get());
    }

    private static <T> void N(class05561 class055612, class03347<T> class033472, class01929 class019292) {
        class019292.y(class033472.y()).z().forEach(class035292 -> class033472.N(class055612, class035292.B(), class035292.N()));
    }

    private static class02003<class02969> N(class02003<class02969> class020032, List<class07099<?>> list) {
        return class020032.N((Object)class02969.field_39974, new class01022[]{new class01014(list).method_40316()});
    }

    private static void N(class01929 class019292) {
        class04482 class044822 = new class04482();
        class05561 class055612 = new class05561((class04490)class044822, class06925.b, (class02063)class019292);
        class03347.N().forEach(class033472 -> class02314.N(class055612, class033472, class019292));
        class044822.N((T string, U class044802) -> N.warn("Found loot table element validation problem in {}: {}", string, (Object)class044802.N()));
    }

    private static class01929 N(class01929 class019292, class01929 class019293) {
        return class01929.N(Stream.concat(class019292.L(), class019293.L()));
    }

    private static class02347 N(class02003<class02969> class020032, class01929 class019292, List<class07099<?>> list) {
        class02003<class02969> var3 = class02314.N(class020032, list);
        class01929 class019293 = class02314.N(class019292, (class01929)var3.N((Object)class02969.field_39974));
        class02314.N(class019293);
        return new class02347(var3, class019293);
    }

    private static /* synthetic */ void N(class07099 class070992, class03347 class033472, class01894 class018942, Object object) {
        class070992.N(class05946.N((class05946)class033472.y(), (class01894)class018942), object, y);
    }
}

