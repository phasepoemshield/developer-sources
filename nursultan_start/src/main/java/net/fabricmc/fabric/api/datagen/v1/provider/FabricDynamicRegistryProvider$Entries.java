/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class02055
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04336
 *  minecraft.class05946
 *  minecraft.class07829
 *  net.fabricmc.fabric.api.event.registry.DynamicRegistries
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class02055;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04336;
import minecraft.class05946;
import minecraft.class07829;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider$RegistryEntries;
import net.fabricmc.fabric.api.event.registry.DynamicRegistries;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;

public final class FabricDynamicRegistryProvider$Entries {
    private final class01929 registries;
    final Map<class01894, FabricDynamicRegistryProvider$RegistryEntries<?>> queuedEntries;
    private final String modId;

    FabricDynamicRegistryProvider$Entries(class01929 class019292, String string) {
        this.registries = class019292;
        this.queuedEntries = DynamicRegistries.getDynamicRegistries().stream().filter(class029652 -> class019292.method_46759(class029652.N()).isPresent()).collect(Collectors.toMap(class029652 -> class029652.N().N(), class029652 -> FabricDynamicRegistryProvider$RegistryEntries.create(class019292, class029652)));
        this.modId = string;
    }

    public <T> void add(class03529<T> class035292) {
        this.add(class035292.B(), class035292.N());
    }

    public <T> class03556<T> add(class05946<T> class059462, T t, ResourceCondition ... resourceConditionArray) {
        return this.getQueuedEntries(class059462).add(class059462, t, resourceConditionArray);
    }

    public <T> class03556<T> add(class05946<T> class059462, T t) {
        return this.getQueuedEntries(class059462).add(class059462, t, null);
    }

    public <T> void add(class03529<T> class035292, ResourceCondition ... resourceConditionArray) {
        this.add(class035292.B(), class035292.N(), resourceConditionArray);
    }

    public <T> class03556<T> add(class01921<T> class019212, class05946<T> class059462) {
        return this.add(class059462, class019212.y(class059462).N());
    }

    public <T> class03556<T> add(class01921<T> class019212, class05946<T> class059462, ResourceCondition ... resourceConditionArray) {
        return this.add(class059462, class019212.y(class059462).N(), resourceConditionArray);
    }

    public <T> List<class03556<T>> addAll(class01921<T> class019212) {
        return class019212.n().filter(class059462 -> class059462.N().y().equals(this.modId)).map(class059462 -> this.add(class019212, (class05946)class059462)).toList();
    }

    public <T> class03556<T> ref(class05946<T> class059462) {
        FabricDynamicRegistryProvider$RegistryEntries<T> fabricDynamicRegistryProvider$RegistryEntries = this.getQueuedEntries(class059462);
        return class03529.N_40(fabricDynamicRegistryProvider$RegistryEntries.lookup, class059462);
    }

    public <T> class02055<T> getLookup(class05946<? extends class00751<T>> class059462) {
        return this.registries.y(class059462);
    }

    public class01929 getLookups() {
        return this.registries;
    }

    public class02055<class07829<?>> configuredCarvers() {
        return this.getLookup(class04227.ND);
    }

    <T> FabricDynamicRegistryProvider$RegistryEntries<T> getQueuedEntries(class05946<T> class059462) {
        FabricDynamicRegistryProvider$RegistryEntries<?> fabricDynamicRegistryProvider$RegistryEntries = this.queuedEntries.get(class059462.y());
        if (fabricDynamicRegistryProvider$RegistryEntries == null) {
            throw new IllegalArgumentException("Registry " + String.valueOf(class059462.y()) + " is not loaded from datapacks");
        }
        return fabricDynamicRegistryProvider$RegistryEntries;
    }

    public class02055<class04336> placedFeatures() {
        return this.getLookup(class04227.ys);
    }
}

