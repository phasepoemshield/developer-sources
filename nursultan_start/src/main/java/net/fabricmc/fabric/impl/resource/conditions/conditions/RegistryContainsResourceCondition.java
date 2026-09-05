/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01894
 *  minecraft.class03542
 *  minecraft.class04227
 *  minecraft.class05946
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.resource.conditions.conditions;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import minecraft.class01894;
import minecraft.class03542;
import minecraft.class04227;
import minecraft.class05946;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.fabricmc.fabric.impl.resource.conditions.DefaultResourceConditionTypes;
import net.fabricmc.fabric.impl.resource.conditions.ResourceConditionsImpl;
import org.jspecify.annotations.Nullable;

public record RegistryContainsResourceCondition(class01894 registry, List<class01894> entries) implements ResourceCondition
{
    public static final MapCodec<RegistryContainsResourceCondition> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("registry").orElse((Object)class04227.F.N()).forGetter(RegistryContainsResourceCondition::registry), (App)class01894.N.listOf().fieldOf("values").forGetter(RegistryContainsResourceCondition::entries)).apply((Applicative)instance, RegistryContainsResourceCondition::new));

    public RegistryContainsResourceCondition(class01894 class018942, class01894 ... class01894Array) {
        this(class018942, List.of(class01894Array));
    }

    @SafeVarargs
    public <T> RegistryContainsResourceCondition(class05946<T> ... class05946Array) {
        this(class05946Array[0].y(), Arrays.stream(class05946Array).map(class05946::N).toList());
    }

    public boolean test(@Nullable class03542 class035422) {
        return ResourceConditionsImpl.registryContains(class035422, this.registry(), this.entries());
    }

    public ResourceConditionType<?> getType() {
        return DefaultResourceConditionTypes.REGISTRY_CONTAINS;
    }
}

