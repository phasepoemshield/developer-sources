/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class04750
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import minecraft.class00891;
import minecraft.class04750;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface ColorProviderRegistry<T, Provider> {
    public static final ColorProviderRegistry<class00891, class04750> BLOCK = ColorProviderRegistryImpl.BLOCK;

    public @Nullable Provider get(T var1);

    public void register(Provider var1, T ... var2);
}

