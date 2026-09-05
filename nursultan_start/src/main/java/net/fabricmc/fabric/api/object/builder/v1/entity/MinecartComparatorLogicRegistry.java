/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04206
 *  minecraft.class07078
 *  minecraft.class07504
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.api.object.builder.v1.entity;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import minecraft.class04206;
import minecraft.class07078;
import minecraft.class07504;
import net.fabricmc.fabric.api.object.builder.v1.entity.MinecartComparatorLogic;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class MinecartComparatorLogicRegistry {
    private static final Logger LOGGER = LoggerFactory.getLogger(MinecartComparatorLogicRegistry.class);
    private static final Map<class07078<?>, MinecartComparatorLogic<?>> LOGICS = new IdentityHashMap();

    private MinecartComparatorLogicRegistry() {
    }

    public static <T extends class07504> void register(class07078<T> class070782, MinecartComparatorLogic<? super T> minecartComparatorLogic) {
        Objects.requireNonNull(class070782, "Entity type cannot be null");
        Objects.requireNonNull(minecartComparatorLogic, "Logic cannot be null");
        if (LOGICS.put(class070782, minecartComparatorLogic) != null) {
            LOGGER.warn("Overriding existing minecart comparator logic for entity type {}", (Object)class04206.M.y(class070782));
        }
    }

    public static @Nullable MinecartComparatorLogic<class07504> getCustomComparatorLogic(class07078<?> class070782) {
        return LOGICS.get(class070782);
    }
}

