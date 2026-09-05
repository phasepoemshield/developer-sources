/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class01587
 *  minecraft.class04750
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.rendering;

import minecraft.class00891;
import minecraft.class01587;
import minecraft.class04750;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl;

@Environment(value=EnvType.CLIENT)
class ColorProviderRegistryImpl$1
extends ColorProviderRegistryImpl<class00891, class04750, class01587> {
    ColorProviderRegistryImpl$1() {
    }

    @Override
    void registerUnderlying(class01587 class015872, class04750 class047502, class00891 class008912) {
        class015872.N(class047502, new class00891[]{class008912});
    }
}

