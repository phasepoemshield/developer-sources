/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  minecraft.class00891
 *  minecraft.class00948
 *  minecraft.class02674
 *  minecraft.class02859
 */
package net.fabricmc.fabric.impl.content.registry;

import com.google.common.collect.BiMap;
import java.util.Objects;
import minecraft.class00891;
import minecraft.class00948;
import minecraft.class02674;
import minecraft.class02859;
import net.fabricmc.fabric.impl.content.registry.OxidizableBlocksRegistryImpl$RandomTickCacheRefresher;

public final class OxidizableBlocksRegistryImpl {
    private OxidizableBlocksRegistryImpl() {
    }

    public static void registerWaxableBlockPair(class00891 class008912, class00891 class008913) {
        Objects.requireNonNull(class008912, "Unwaxed block cannot be null!");
        Objects.requireNonNull(class008913, "Waxed block cannot be null!");
        ((BiMap)class02859.N.get()).put((Object)class008912, (Object)class008913);
    }

    public static void registerCopperBlockSet(class00948 class009482) {
        Objects.requireNonNull(class009482, "blockSet cannot be null!");
        class009482.N().forEach(OxidizableBlocksRegistryImpl::registerOxidizableBlockPair);
        class009482.y().forEach(OxidizableBlocksRegistryImpl::registerWaxableBlockPair);
    }

    public static void registerOxidizableBlockPair(class00891 class008912, class00891 class008913) {
        Objects.requireNonNull(class008912, "Oxidizable block cannot be null!");
        Objects.requireNonNull(class008913, "Oxidizable block cannot be null!");
        ((BiMap)class02674.k_.get()).put((Object)class008912, (Object)class008913);
        OxidizableBlocksRegistryImpl.refreshRandomTickCache(class008912);
        OxidizableBlocksRegistryImpl.refreshRandomTickCache(class008913);
    }

    private static void refreshRandomTickCache(class00891 class008912) {
        class008912.E().N().forEach(class005002 -> ((OxidizableBlocksRegistryImpl$RandomTickCacheRefresher)class005002).fabric_api$refreshRandomTickCache());
    }
}

