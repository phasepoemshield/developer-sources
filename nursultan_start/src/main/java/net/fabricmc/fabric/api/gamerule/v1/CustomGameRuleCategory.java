/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class06839
 *  net.fabricmc.fabric.impl.gamerule.RuleCategoryExtensions
 */
package net.fabricmc.fabric.api.gamerule.v1;

import java.util.Optional;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class06839;
import net.fabricmc.fabric.impl.gamerule.RuleCategoryExtensions;

public final class CustomGameRuleCategory {
    private final class01894 id;
    private final class00392 name;

    public static <T> Optional<CustomGameRuleCategory> getCategory(class06839<T> class068392) {
        return Optional.ofNullable(((RuleCategoryExtensions)class068392).fabric_getCustomCategory());
    }

    public CustomGameRuleCategory(class01894 class018942, class00392 class003922) {
        this.id = class018942;
        this.name = class003922;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        CustomGameRuleCategory customGameRuleCategory = (CustomGameRuleCategory)object;
        return this.id.equals((Object)customGameRuleCategory.id);
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public class00392 getName() {
        return this.name;
    }

    public class01894 getId() {
        return this.id;
    }
}

