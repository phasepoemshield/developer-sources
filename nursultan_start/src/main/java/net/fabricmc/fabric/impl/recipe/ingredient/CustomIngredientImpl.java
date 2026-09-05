/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class00299
 *  minecraft.class01894
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class06510
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredient
 *  net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.recipe.ingredient;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;
import minecraft.class00299;
import minecraft.class01894;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class06510;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredient;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer;
import org.jspecify.annotations.Nullable;

public class CustomIngredientImpl
extends class06510 {
    public static final String TYPE_KEY = "fabric:type";
    static final Map<class01894, CustomIngredientSerializer<?>> REGISTERED_SERIALIZERS = new ConcurrentHashMap();
    public static final Codec<CustomIngredientSerializer<?>> CODEC = class01894.N.flatXmap(class018942 -> Optional.ofNullable(REGISTERED_SERIALIZERS.get(class018942)).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown custom ingredient serializer: " + String.valueOf(class018942))), customIngredientSerializer -> DataResult.success((Object)customIngredientSerializer.getIdentifier()));
    private final CustomIngredient customIngredient;
    private @Nullable List<class03556<class06581>> customMatchingItems;

    public static void registerSerializer(CustomIngredientSerializer<?> customIngredientSerializer) {
        Objects.requireNonNull(customIngredientSerializer.getIdentifier(), "CustomIngredientSerializer identifier may not be null.");
        if (REGISTERED_SERIALIZERS.putIfAbsent(customIngredientSerializer.getIdentifier(), customIngredientSerializer) != null) {
            throw new IllegalArgumentException("CustomIngredientSerializer with identifier " + String.valueOf(customIngredientSerializer.getIdentifier()) + " already registered.");
        }
    }

    public CustomIngredientImpl(CustomIngredient customIngredient) {
        super((class03543)class03543.N((class03556[])new class03556[]{class06570.y.i()}));
        this.customIngredient = customIngredient;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof CustomIngredientImpl)) {
            return false;
        }
        CustomIngredientImpl customIngredientImpl = (CustomIngredientImpl)((Object)object);
        return this.customIngredient.equals((Object)customIngredientImpl.customIngredient);
    }

    public int hashCode() {
        return this.customIngredient.hashCode();
    }

    public /* synthetic */ boolean test(Object object) {
        return this.method_8093((class06584)object);
    }

    public List<class03556<class06581>> getCustomMatchingItems() {
        if (this.customMatchingItems == null) {
            this.customMatchingItems = this.customIngredient.getMatchingItems().toList();
        }
        return this.customMatchingItems;
    }

    public CustomIngredient getCustomIngredient() {
        return this.customIngredient;
    }

    public class00299 method_64673() {
        return this.customIngredient.toDisplay();
    }

    public Stream<class03556<class06581>> method_8105() {
        return this.getCustomMatchingItems().stream();
    }

    public boolean method_8093(class06584 class065842) {
        return this.customIngredient.test(class065842);
    }

    public boolean method_65798(class03556<class06581> class035562) {
        return this.getCustomMatchingItems().contains(class035562);
    }

    public boolean method_65799() {
        return this.getCustomMatchingItems().isEmpty();
    }

    public boolean requiresTesting() {
        return this.customIngredient.requiresTesting();
    }

    public /* synthetic */ boolean acceptsItem(Object object) {
        return this.method_65798((class03556<class06581>)((class03556)object));
    }

    public static @Nullable CustomIngredientSerializer<?> getSerializer(class01894 class018942) {
        Objects.requireNonNull(class018942, "Identifier may not be null.");
        return REGISTERED_SERIALIZERS.get(class018942);
    }
}

