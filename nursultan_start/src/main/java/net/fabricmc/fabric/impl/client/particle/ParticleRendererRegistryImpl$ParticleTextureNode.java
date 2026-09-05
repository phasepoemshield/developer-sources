/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class06166
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.particle.v1.ParticleRendererRegistry
 *  net.fabricmc.fabric.impl.base.toposort.SortableNode
 */
package net.fabricmc.fabric.impl.client.particle;

import minecraft.class01894;
import minecraft.class06166;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleRendererRegistry;
import net.fabricmc.fabric.impl.base.toposort.SortableNode;

@Environment(value=EnvType.CLIENT)
class ParticleRendererRegistryImpl$ParticleTextureNode
extends SortableNode<ParticleRendererRegistryImpl$ParticleTextureNode> {
    final class01894 id;
    final class06166 textureSheet;

    ParticleRendererRegistryImpl$ParticleTextureNode(class01894 class018942, class06166 class061662) {
        this.id = class018942;
        this.textureSheet = class061662;
    }

    ParticleRendererRegistryImpl$ParticleTextureNode(class06166 class061662) {
        this.id = ParticleRendererRegistry.getId((class06166)class061662);
        this.textureSheet = class061662;
    }

    public String getDescription() {
        return this.id.toString();
    }
}

