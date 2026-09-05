/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04206
 *  minecraft.class05300
 *  minecraft.class05308
 *  minecraft.class07078
 *  minecraft.class07438
 *  net.fabricmc.fabric.mixin.object.builder.DefaultAttributesAccessor
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.api.object.builder.v1.entity;

import minecraft.class04206;
import minecraft.class05300;
import minecraft.class05308;
import minecraft.class07078;
import minecraft.class07438;
import net.fabricmc.fabric.mixin.object.builder.DefaultAttributesAccessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class FabricDefaultAttributeRegistry {
    private static final Logger LOGGER = LoggerFactory.getLogger(FabricDefaultAttributeRegistry.class);

    private FabricDefaultAttributeRegistry() {
    }

    public static void register(class07078<? extends class07438> class070782, class05300 class053002) {
        FabricDefaultAttributeRegistry.register(class070782, class053002.N());
    }

    public static void register(class07078<? extends class07438> class070782, class05308 class053082) {
        if (DefaultAttributesAccessor.getRegistry().put(class070782, class053082) != null) {
            LOGGER.debug("Overriding existing registration for entity type {}", (Object)class04206.M.y(class070782));
        }
    }
}

