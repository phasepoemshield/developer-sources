/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04804
 *  minecraft.class07049
 *  minecraft.class07078
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.EntityRendererRegistryImpl
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import minecraft.class04804;
import minecraft.class07049;
import minecraft.class07078;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.EntityRendererRegistryImpl;

@Deprecated
@Environment(value=EnvType.CLIENT)
public final class EntityRendererRegistry {
    private EntityRendererRegistry() {
    }

    public static <E extends class07049> void register(class07078<? extends E> class070782, class04804<E> class048042) {
        EntityRendererRegistryImpl.register(class070782, class048042);
    }
}

