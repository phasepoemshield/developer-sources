/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03202
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.ColorResolverRegistryImpl
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import java.util.Set;
import minecraft.class03202;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.ColorResolverRegistryImpl;

@Environment(value=EnvType.CLIENT)
public final class ColorResolverRegistry {
    private ColorResolverRegistry() {
    }

    public static boolean isRegistered(class03202 class032022) {
        return ColorResolverRegistry.getAllResolvers().contains(class032022);
    }

    public static void register(class03202 class032022) {
        ColorResolverRegistryImpl.register((class03202)class032022);
    }

    public static Set<class03202> getAllResolvers() {
        return ColorResolverRegistryImpl.getAllResolvers();
    }

    public static Set<class03202> getCustomResolvers() {
        return ColorResolverRegistryImpl.getCustomResolvers();
    }
}

