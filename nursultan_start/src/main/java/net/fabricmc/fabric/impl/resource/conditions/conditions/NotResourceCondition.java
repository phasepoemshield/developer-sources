/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03542
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.resource.conditions.conditions;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class03542;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.fabricmc.fabric.impl.resource.conditions.DefaultResourceConditionTypes;
import org.jspecify.annotations.Nullable;

public record NotResourceCondition(ResourceCondition condition) implements ResourceCondition
{
    public static final MapCodec<NotResourceCondition> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group((App)ResourceCondition.CODEC.fieldOf("value").forGetter(NotResourceCondition::condition)).apply((Applicative)instance, NotResourceCondition::new));

    public boolean test(@Nullable class03542 class035422) {
        return !this.condition().test(class035422);
    }

    public ResourceConditionType<?> getType() {
        return DefaultResourceConditionTypes.NOT;
    }
}

