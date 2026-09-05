/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class06665
 *  minecraft.class08092
 *  net.fabricmc.fabric.impl.content.registry.StrippableBlockRegistryImpl
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.registry;

import minecraft.class00500;
import minecraft.class00891;
import minecraft.class06665;
import minecraft.class08092;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry$StrippingTransformer;
import net.fabricmc.fabric.impl.content.registry.StrippableBlockRegistryImpl;
import org.jspecify.annotations.Nullable;

public final class StrippableBlockRegistry {
    private StrippableBlockRegistry() {
    }

    public static void register(class00891 class008912, class00891 class008913) {
        StrippableBlockRegistry$StrippingTransformer strippableBlockRegistry$StrippingTransformer = class008912.W().y((class08092)class06665.V) && class008913.W().y((class08092)class06665.V) ? StrippableBlockRegistry$StrippingTransformer.VANILLA : StrippableBlockRegistry$StrippingTransformer.DEFAULT_STATE;
        StrippableBlockRegistryImpl.register((class00891)class008912, (class00891)class008913, (StrippableBlockRegistry$StrippingTransformer)strippableBlockRegistry$StrippingTransformer);
    }

    public static void register(class00891 class008912, class00891 class008913, StrippableBlockRegistry$StrippingTransformer strippableBlockRegistry$StrippingTransformer) {
        StrippableBlockRegistryImpl.register((class00891)class008912, (class00891)class008913, (StrippableBlockRegistry$StrippingTransformer)strippableBlockRegistry$StrippingTransformer);
    }

    public static @Nullable class00500 getStrippedBlockState(class00500 class005002) {
        return StrippableBlockRegistryImpl.getStrippedBlockState((class00500)class005002);
    }

    public static void registerCopyState(class00891 class008912, class00891 class008913) {
        StrippableBlockRegistryImpl.register((class00891)class008912, (class00891)class008913, (StrippableBlockRegistry$StrippingTransformer)StrippableBlockRegistry$StrippingTransformer.COPY);
    }
}

