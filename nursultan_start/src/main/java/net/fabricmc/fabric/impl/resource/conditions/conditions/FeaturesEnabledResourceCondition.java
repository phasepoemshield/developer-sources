/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01894
 *  minecraft.class02957
 *  minecraft.class03542
 *  minecraft.class03794
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.resource.conditions.conditions;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.List;
import minecraft.class01894;
import minecraft.class02957;
import minecraft.class03542;
import minecraft.class03794;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.fabricmc.fabric.impl.resource.conditions.DefaultResourceConditionTypes;
import net.fabricmc.fabric.impl.resource.conditions.ResourceConditionsImpl;
import org.jspecify.annotations.Nullable;

public record FeaturesEnabledResourceCondition(Collection<class01894> features) implements ResourceCondition
{
    public static final MapCodec<FeaturesEnabledResourceCondition> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.listOf().fieldOf("features").forGetter(featuresEnabledResourceCondition -> List.copyOf(featuresEnabledResourceCondition.features))).apply((Applicative)instance, FeaturesEnabledResourceCondition::new));

    public FeaturesEnabledResourceCondition(class01894 ... class01894Array) {
        this(List.of(class01894Array));
    }

    public FeaturesEnabledResourceCondition(class02957 ... class02957Array) {
        this(class03794.i.y(class03794.i.N(class02957Array)));
    }

    public boolean test(@Nullable class03542 class035422) {
        return ResourceConditionsImpl.featuresEnabled(this.features());
    }

    public ResourceConditionType<?> getType() {
        return DefaultResourceConditionTypes.FEATURES_ENABLED;
    }
}

