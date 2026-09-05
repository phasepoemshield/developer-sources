/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00751
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class02042
 *  minecraft.class02965
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class05946
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import com.mojang.serialization.Codec;
import java.util.IdentityHashMap;
import java.util.Map;
import minecraft.class00751;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class02042;
import minecraft.class02965;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class05946;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider$ConditionalEntry;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import org.jspecify.annotations.Nullable;

class FabricDynamicRegistryProvider$RegistryEntries<T> {
    final class02042<T> lookup;
    final class05946<? extends class00751<T>> registry;
    final Codec<T> elementCodec;
    Map<class05946<T>, FabricDynamicRegistryProvider$ConditionalEntry<T>> entries = new IdentityHashMap<class05946<T>, FabricDynamicRegistryProvider$ConditionalEntry<T>>();

    static <T> FabricDynamicRegistryProvider$RegistryEntries<T> create(class01929 class019292, class02965<T> class029652) {
        class01921 class019212 = class019292.y(class029652.N());
        return new FabricDynamicRegistryProvider$RegistryEntries<T>(class019212, class029652.N(), class029652.y());
    }

    FabricDynamicRegistryProvider$RegistryEntries(class02042<T> class020422, class05946<? extends class00751<T>> class059462, Codec<T> codec) {
        this.lookup = class020422;
        this.registry = class059462;
        this.elementCodec = codec;
    }

    class03556<T> add(class05946<T> class059462, T t, @Nullable ResourceCondition[] resourceConditionArray) {
        if (this.entries.put(class059462, new FabricDynamicRegistryProvider$ConditionalEntry<T>(t, resourceConditionArray)) != null) {
            throw new IllegalArgumentException("Trying to add registry key " + String.valueOf(class059462) + " more than once.");
        }
        return class03529.N_40(this.lookup, class059462);
    }
}

