/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01894
 *  minecraft.class03530
 *  minecraft.class03542
 *  minecraft.class04227
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
import minecraft.class03530;
import minecraft.class03542;
import minecraft.class04227;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.fabricmc.fabric.impl.resource.conditions.DefaultResourceConditionTypes;
import net.fabricmc.fabric.impl.resource.conditions.ResourceConditionsImpl;
import org.jspecify.annotations.Nullable;

public record TagsPopulatedResourceCondition(class01894 registry, List<class01894> tags) implements ResourceCondition
{
    public static final MapCodec<TagsPopulatedResourceCondition> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("registry").orElse((Object)class04227.F.N()).forGetter(TagsPopulatedResourceCondition::registry), (App)class01894.N.listOf().fieldOf("values").forGetter(TagsPopulatedResourceCondition::tags)).apply((Applicative)instance, TagsPopulatedResourceCondition::new));

    @SafeVarargs
    public <T> TagsPopulatedResourceCondition(class01894 class018942, class03530<T> ... class03530Array) {
        this(class018942, Arrays.stream(class03530Array).map(class03530::y).toList());
    }

    @SafeVarargs
    public <T> TagsPopulatedResourceCondition(class03530<T> ... class03530Array) {
        this(class03530Array[0].N().N(), Arrays.stream(class03530Array).map(class03530::y).toList());
    }

    public boolean test(@Nullable class03542 class035422) {
        return ResourceConditionsImpl.tagsPopulated(class035422, this.registry(), this.tags());
    }

    public ResourceConditionType<?> getType() {
        return DefaultResourceConditionTypes.TAGS_POPULATED;
    }
}

