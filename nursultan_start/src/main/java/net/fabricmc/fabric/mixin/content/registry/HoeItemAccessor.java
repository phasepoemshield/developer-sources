/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00891
 *  minecraft.class06501
 *  minecraft.class06561
 */
package net.fabricmc.fabric.mixin.content.registry;

import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class00891;
import minecraft.class06501;
import minecraft.class06561;

public interface HoeItemAccessor {
    public static /* synthetic */ Map<class00891, Pair<Predicate<class06501>, Consumer<class06501>>> getTillingActions() {
        return class06561.N();
    }
}

