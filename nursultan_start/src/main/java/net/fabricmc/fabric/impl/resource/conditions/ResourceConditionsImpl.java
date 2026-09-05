/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$Error
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class01894
 *  minecraft.class02055
 *  minecraft.class03515
 *  minecraft.class03530
 *  minecraft.class03542
 *  minecraft.class03767
 *  minecraft.class03794
 *  minecraft.class05946
 *  net.fabricmc.api.ModInitializer
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions
 *  net.fabricmc.loader.api.FabricLoader
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.resource.conditions;

import com.google.gson.JsonObject;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import minecraft.class01894;
import minecraft.class02055;
import minecraft.class03515;
import minecraft.class03530;
import minecraft.class03542;
import minecraft.class03767;
import minecraft.class03794;
import minecraft.class05946;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;
import net.fabricmc.fabric.impl.resource.conditions.DefaultResourceConditionTypes;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ResourceConditionsImpl
implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger((String)"Fabric Resource Conditions");
    public static class03767 currentFeatures = null;

    public static boolean applyResourceConditions(JsonObject jsonObject, String string, class01894 class018942, @Nullable class03542 class035422) {
        boolean bl = LOGGER.isDebugEnabled();
        if (jsonObject.has("fabric:load_conditions")) {
            DataResult dataResult = ResourceCondition.CONDITION_CODEC.parse((DynamicOps)JsonOps.INSTANCE, (Object)jsonObject.get("fabric:load_conditions"));
            if (dataResult.isSuccess()) {
                boolean bl2 = ((ResourceCondition)dataResult.getOrThrow()).test(class035422);
                if (bl) {
                    String string2 = bl2 ? "Allowed" : "Rejected";
                    LOGGER.debug("{} resource of type {} with id {}", new Object[]{string2, string, class018942});
                }
                return bl2;
            }
            LOGGER.error("Failed to parse resource conditions for file of type {} with id {}, skipping: {}", new Object[]{string, class018942, ((DataResult.Error)dataResult.error().get()).message()});
        }
        return true;
    }

    public static boolean conditionsMet(List<ResourceCondition> list, @Nullable class03542 class035422, boolean bl) {
        for (ResourceCondition resourceCondition : list) {
            if (resourceCondition.test(class035422) == bl) continue;
            return !bl;
        }
        return bl;
    }

    public static boolean featuresEnabled(Collection<class01894> collection) {
        MutableBoolean mutableBoolean = new MutableBoolean();
        class03767 class037672 = class03794.i.N(collection, class018942 -> {
            LOGGER.info("Found unknown feature {}, treating it as failure", class018942);
            mutableBoolean.setTrue();
        });
        if (mutableBoolean.booleanValue()) {
            return false;
        }
        if (currentFeatures == null) {
            LOGGER.warn("Can't retrieve current features, failing features_enabled resource condition check.");
            return false;
        }
        return class037672.N(currentFeatures);
    }

    public static boolean registryContains(@Nullable class03542 class035422, class01894 class018942, List<class01894> list) {
        if (class035422 == null) {
            LOGGER.warn("Can't retrieve registry {}, failing registry_contains resource condition check", (Object)class018942);
            return false;
        }
        class05946 class059462 = class05946.N((class01894)class018942);
        Optional optional = class035422.N(class059462);
        if (optional.isPresent()) {
            class02055 class020552 = ((class03515)optional.get()).y();
            for (class01894 class018943 : list) {
                if (!class020552.N(class05946.N((class05946)class059462, (class01894)class018943)).isEmpty()) continue;
                return false;
            }
            return true;
        }
        return list.isEmpty();
    }

    public static boolean tagsPopulated(@Nullable class03542 class035422, class01894 class018942, List<class01894> list) {
        if (class035422 == null) {
            LOGGER.warn("Can't retrieve registry {}, failing tags_populated resource condition check", (Object)class018942);
            return false;
        }
        class05946 class059462 = class05946.N((class01894)class018942);
        Optional optional = class035422.N(class059462);
        if (optional.isPresent()) {
            class02055 class020552 = ((class03515)optional.get()).y();
            for (class01894 class018943 : list) {
                if (!class020552.N(class03530.N((class05946)class059462, (class01894)class018943)).isEmpty()) continue;
                return false;
            }
            return true;
        }
        return list.isEmpty();
    }

    public void onInitialize() {
        ResourceConditions.register(DefaultResourceConditionTypes.TRUE);
        ResourceConditions.register(DefaultResourceConditionTypes.NOT);
        ResourceConditions.register(DefaultResourceConditionTypes.AND);
        ResourceConditions.register(DefaultResourceConditionTypes.OR);
        ResourceConditions.register(DefaultResourceConditionTypes.ALL_MODS_LOADED);
        ResourceConditions.register(DefaultResourceConditionTypes.ANY_MODS_LOADED);
        ResourceConditions.register(DefaultResourceConditionTypes.TAGS_POPULATED);
        ResourceConditions.register(DefaultResourceConditionTypes.FEATURES_ENABLED);
        ResourceConditions.register(DefaultResourceConditionTypes.REGISTRY_CONTAINS);
    }

    public static boolean modsLoaded(List<String> list, boolean bl) {
        for (String string : list) {
            if (FabricLoader.getInstance().isModLoaded(string) == bl) continue;
            return !bl;
        }
        return bl;
    }
}

