/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01079
 *  minecraft.class01283
 *  minecraft.class01894
 *  minecraft.class01905
 *  minecraft.class01929
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04782
 *  minecraft.class05074
 *  net.fabricmc.fabric.api.loot.v3.LootTableSource
 *  net.fabricmc.fabric.impl.resource.pack.BuiltinModResourcePackSource
 *  net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator
 */
package net.fabricmc.fabric.impl.loot;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import minecraft.class01079;
import minecraft.class01283;
import minecraft.class01894;
import minecraft.class01905;
import minecraft.class01929;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04782;
import minecraft.class05074;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import net.fabricmc.fabric.impl.resource.pack.BuiltinModResourcePackSource;
import net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator;

public final class LootUtil {
    public static final ThreadLocal<Map<class01894, LootTableSource>> SOURCES = ThreadLocal.withInitial(HashMap::new);

    public static class03556<class05074> getEntryOrDirect(class04782 class047822, class05074 class050742) {
        class01929 class019292 = class047822.method_8503().yd().N();
        class01905 class019052 = (class01905)class019292.method_46759(class04227.yJ).orElseThrow(() -> new IllegalStateException("Failed to fetch LootTable wrapper from WrapperLookup"));
        return class019052.z().filter(class035292 -> ((class05074)class035292.N()).equals(class050742)).findFirst().map(Function.identity()).orElseGet(() -> class03556.N((Object)class050742));
    }

    public static LootTableSource determineSource(class01079 class010792) {
        if (class010792 != null) {
            class01283 class012832 = class010792.getFabricPackSource();
            if (class012832 == class01283.L) {
                return LootTableSource.VANILLA;
            }
            if (class012832 == ModResourcePackCreator.RESOURCE_PACK_SOURCE || class012832 instanceof BuiltinModResourcePackSource) {
                return LootTableSource.MOD;
            }
        }
        return LootTableSource.DATA_PACK;
    }
}

