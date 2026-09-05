/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class02957
 *  minecraft.class03530
 *  minecraft.class05946
 *  net.fabricmc.fabric.impl.resource.conditions.conditions.AllModsLoadedResourceCondition
 *  net.fabricmc.fabric.impl.resource.conditions.conditions.AndResourceCondition
 *  net.fabricmc.fabric.impl.resource.conditions.conditions.AnyModsLoadedResourceCondition
 *  net.fabricmc.fabric.impl.resource.conditions.conditions.FeaturesEnabledResourceCondition
 *  net.fabricmc.fabric.impl.resource.conditions.conditions.NotResourceCondition
 *  net.fabricmc.fabric.impl.resource.conditions.conditions.OrResourceCondition
 *  net.fabricmc.fabric.impl.resource.conditions.conditions.RegistryContainsResourceCondition
 *  net.fabricmc.fabric.impl.resource.conditions.conditions.TagsPopulatedResourceCondition
 *  net.fabricmc.fabric.impl.resource.conditions.conditions.TrueResourceCondition
 */
package net.fabricmc.fabric.api.resource.conditions.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class02957;
import minecraft.class03530;
import minecraft.class05946;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.fabricmc.fabric.impl.resource.conditions.conditions.AllModsLoadedResourceCondition;
import net.fabricmc.fabric.impl.resource.conditions.conditions.AndResourceCondition;
import net.fabricmc.fabric.impl.resource.conditions.conditions.AnyModsLoadedResourceCondition;
import net.fabricmc.fabric.impl.resource.conditions.conditions.FeaturesEnabledResourceCondition;
import net.fabricmc.fabric.impl.resource.conditions.conditions.NotResourceCondition;
import net.fabricmc.fabric.impl.resource.conditions.conditions.OrResourceCondition;
import net.fabricmc.fabric.impl.resource.conditions.conditions.RegistryContainsResourceCondition;
import net.fabricmc.fabric.impl.resource.conditions.conditions.TagsPopulatedResourceCondition;
import net.fabricmc.fabric.impl.resource.conditions.conditions.TrueResourceCondition;

public final class ResourceConditions {
    private static final Map<class01894, ResourceConditionType<?>> REGISTERED_CONDITIONS = new ConcurrentHashMap();
    public static final String CONDITIONS_KEY = "fabric:load_conditions";
    public static final String OVERLAYS_KEY = "fabric:overlays";

    public static ResourceCondition and(ResourceCondition ... resourceConditionArray) {
        return new AndResourceCondition(List.of(resourceConditionArray));
    }

    private ResourceConditions() {
    }

    public static void register(ResourceConditionType<?> resourceConditionType) {
        Objects.requireNonNull(resourceConditionType, "Condition may not be null.");
        if (REGISTERED_CONDITIONS.put(resourceConditionType.id(), resourceConditionType) != null) {
            throw new IllegalArgumentException("Duplicate resource condition registered with id " + String.valueOf(resourceConditionType.id()));
        }
    }

    public static ResourceCondition or(ResourceCondition ... resourceConditionArray) {
        return new OrResourceCondition(List.of(resourceConditionArray));
    }

    public static ResourceCondition not(ResourceCondition resourceCondition) {
        return new NotResourceCondition(resourceCondition);
    }

    public static ResourceCondition allModsLoaded(String ... stringArray) {
        return new AllModsLoadedResourceCondition(List.of(stringArray));
    }

    public static ResourceCondition anyModsLoaded(String ... stringArray) {
        return new AnyModsLoadedResourceCondition(List.of(stringArray));
    }

    public static ResourceConditionType<?> getConditionType(class01894 class018942) {
        return REGISTERED_CONDITIONS.get(class018942);
    }

    public static ResourceCondition featuresEnabled(class01894 ... class01894Array) {
        return new FeaturesEnabledResourceCondition(class01894Array);
    }

    public static ResourceCondition featuresEnabled(class02957 ... class02957Array) {
        return new FeaturesEnabledResourceCondition(class02957Array);
    }

    public static <T> ResourceCondition registryContains(class05946<? extends class00751<T>> class059462, class01894 ... class01894Array) {
        return new RegistryContainsResourceCondition(class059462.N(), class01894Array);
    }

    @SafeVarargs
    public static <T> ResourceCondition registryContains(class05946<T> ... class05946Array) {
        return new RegistryContainsResourceCondition(class05946Array);
    }

    @SafeVarargs
    public static <T> ResourceCondition tagsPopulated(class05946<? extends class00751<T>> class059462, class03530<T> ... class03530Array) {
        return new TagsPopulatedResourceCondition(class059462.N(), class03530Array);
    }

    @SafeVarargs
    public static <T> ResourceCondition tagsPopulated(class03530<T> ... class03530Array) {
        return new TagsPopulatedResourceCondition(class03530Array);
    }

    public static ResourceCondition alwaysTrue() {
        return new TrueResourceCondition();
    }
}

