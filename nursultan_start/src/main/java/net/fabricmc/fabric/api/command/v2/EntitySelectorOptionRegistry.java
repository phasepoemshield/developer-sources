/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class06790
 *  minecraft.class06798
 *  net.fabricmc.fabric.mixin.command.EntitySelectorOptionsAccessor
 */
package net.fabricmc.fabric.api.command.v2;

import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class06790;
import minecraft.class06798;
import net.fabricmc.fabric.mixin.command.EntitySelectorOptionsAccessor;

public final class EntitySelectorOptionRegistry {
    private EntitySelectorOptionRegistry() {
    }

    public static void register(class01894 class018942, class00392 class003922, class06798 class067982, Predicate<class06790> predicate) {
        EntitySelectorOptionsAccessor.callPutOption((String)class018942.L(), (class06798)class067982, predicate, (class00392)class003922);
    }

    public static void registerNonRepeatable(class01894 class018942, class00392 class003922, class06798 class067982) {
        EntitySelectorOptionRegistry.register(class018942, class003922, class067902 -> {
            class067982.handle(class067902);
            class067902.setCustomFlag(class018942, true);
        }, class067902 -> !class067902.getCustomFlag(class018942));
    }
}

