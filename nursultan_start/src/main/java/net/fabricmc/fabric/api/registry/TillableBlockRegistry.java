/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class06501
 *  minecraft.class06561
 *  minecraft.class07310
 *  net.fabricmc.fabric.mixin.content.registry.HoeItemAccessor
 */
package net.fabricmc.fabric.api.registry;

import com.mojang.datafixers.util.Pair;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class06501;
import minecraft.class06561;
import minecraft.class07310;
import net.fabricmc.fabric.mixin.content.registry.HoeItemAccessor;

public final class TillableBlockRegistry {
    private TillableBlockRegistry() {
    }

    public static void register(class00891 class008912, Predicate<class06501> predicate, class00500 class005002, class07310 class073102) {
        Objects.requireNonNull(class005002, "tilled block state cannot be null");
        Objects.requireNonNull(class073102, "dropped item cannot be null");
        TillableBlockRegistry.register(class008912, predicate, class06561.N((class00500)class005002, (class07310)class073102));
    }

    public static void register(class00891 class008912, Predicate<class06501> predicate, class00500 class005002) {
        Objects.requireNonNull(class005002, "tilled block state cannot be null");
        TillableBlockRegistry.register(class008912, predicate, class06561.N((class00500)class005002));
    }

    public static void register(class00891 class008912, Predicate<class06501> predicate, Consumer<class06501> consumer) {
        Objects.requireNonNull(class008912, "input block cannot be null");
        HoeItemAccessor.getTillingActions().put(class008912, Pair.of(predicate, consumer));
    }
}

