/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class00948
 *  net.fabricmc.fabric.impl.content.registry.OxidizableBlocksRegistryImpl
 */
package net.fabricmc.fabric.api.registry;

import minecraft.class00891;
import minecraft.class00948;
import net.fabricmc.fabric.impl.content.registry.OxidizableBlocksRegistryImpl;

public final class OxidizableBlocksRegistry {
    private OxidizableBlocksRegistry() {
    }

    public static void registerWaxableBlockPair(class00891 class008912, class00891 class008913) {
        OxidizableBlocksRegistryImpl.registerWaxableBlockPair((class00891)class008912, (class00891)class008913);
    }

    public static void registerCopperBlockSet(class00948 class009482) {
        OxidizableBlocksRegistryImpl.registerCopperBlockSet((class00948)class009482);
    }

    public static void registerOxidizableBlockPair(class00891 class008912, class00891 class008913) {
        OxidizableBlocksRegistryImpl.registerOxidizableBlockPair((class00891)class008912, (class00891)class008913);
    }
}

