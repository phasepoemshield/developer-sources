/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01894
 *  minecraft.class01962
 */
package net.fabricmc.fabric.api.resource.conditions.v1;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.Objects;
import minecraft.class01894;
import minecraft.class01962;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType$1;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;

public interface ResourceConditionType<T extends ResourceCondition> {
    public static final Codec<ResourceConditionType<?>> TYPE_CODEC = class01894.N.comapFlatMap(class018942 -> (DataResult)class01962.N(ResourceConditions.getConditionType(class018942), DataResult::success, () -> DataResult.error(() -> "Unknown resource condition key: " + String.valueOf(class018942))), ResourceConditionType::id);

    public static <T extends ResourceCondition> ResourceConditionType<T> create(class01894 class018942, MapCodec<T> mapCodec) {
        Objects.requireNonNull(class018942, "id cannot be null");
        Objects.requireNonNull(mapCodec, "codec cannot be null");
        return new ResourceConditionType$1(class018942, mapCodec);
    }

    public class01894 id();

    public MapCodec<T> codec();
}

