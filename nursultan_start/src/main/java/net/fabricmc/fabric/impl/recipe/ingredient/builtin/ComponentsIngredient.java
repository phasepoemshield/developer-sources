/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00283
 *  minecraft.class00299
 *  minecraft.class00302
 *  minecraft.class02477
 *  minecraft.class02678
 *  minecraft.class03556
 *  minecraft.class06510
 *  minecraft.class06581
 *  minecraft.class06584
 *  net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredient
 *  net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.recipe.ingredient.builtin;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00283;
import minecraft.class00299;
import minecraft.class00302;
import minecraft.class02477;
import minecraft.class02678;
import minecraft.class03556;
import minecraft.class06510;
import minecraft.class06581;
import minecraft.class06584;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredient;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer;
import net.fabricmc.fabric.impl.recipe.ingredient.builtin.ComponentsIngredient$Serializer;
import org.jspecify.annotations.Nullable;

public class ComponentsIngredient
implements CustomIngredient {
    public static final CustomIngredientSerializer<ComponentsIngredient> SERIALIZER = new ComponentsIngredient$Serializer();
    private final class06510 base;
    private final class02678 components;

    private class06510 getBase() {
        return this.base;
    }

    public ComponentsIngredient(class06510 class065102, class02678 class026782) {
        if (class026782.u()) {
            throw new IllegalArgumentException("ComponentIngredient must have at least one defined component");
        }
        this.base = class065102;
        this.components = class026782;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ComponentsIngredient componentsIngredient = (ComponentsIngredient)object;
        return this.base.equals((Object)componentsIngredient.base) && this.components.equals((Object)componentsIngredient.components);
    }

    public int hashCode() {
        return Objects.hash(this.base, this.components);
    }

    public boolean test(class06584 class065842) {
        if (!this.base.method_8093(class065842)) {
            return false;
        }
        for (Map.Entry entry : this.components.y()) {
            class02477 class024772 = (class02477)entry.getKey();
            Optional optional = (Optional)entry.getValue();
            if (optional.isPresent()) {
                if (!class065842.L(class024772)) {
                    return false;
                }
                if (Objects.equals(optional.get(), class065842.method_58694(class024772))) continue;
                return false;
            }
            if (!class065842.L(class024772)) continue;
            return false;
        }
        return true;
    }

    public boolean requiresTesting() {
        return true;
    }

    public Stream<class03556<class06581>> getMatchingItems() {
        return this.base.method_8105();
    }

    private @Nullable class02678 getComponents() {
        return this.components;
    }

    public CustomIngredientSerializer<?> getSerializer() {
        return SERIALIZER;
    }

    private class00299 createEntryDisplay(class03556<class06581> class035562) {
        class06584 class065842 = ((class06581)class035562.N()).E();
        class065842.N(this.components);
        return new class00302(class065842);
    }

    public class00299 toDisplay() {
        return new class00283(this.base.method_8105().map(this::createEntryDisplay).toList());
    }
}

