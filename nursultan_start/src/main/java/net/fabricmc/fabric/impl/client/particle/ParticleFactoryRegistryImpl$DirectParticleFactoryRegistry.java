/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00951
 *  minecraft.class00975
 *  minecraft.class04206
 *  minecraft.class04417
 *  minecraft.class07103
 *  minecraft.class07126
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.particle.v1.FabricSpriteProvider
 *  net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry
 *  net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry$PendingParticleFactory
 */
package net.fabricmc.fabric.impl.client.particle;

import minecraft.class00951;
import minecraft.class00975;
import minecraft.class04206;
import minecraft.class04417;
import minecraft.class07103;
import minecraft.class07126;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.FabricSpriteProvider;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.impl.client.particle.FabricSpriteProviderImpl;

@Environment(value=EnvType.CLIENT)
record ParticleFactoryRegistryImpl$DirectParticleFactoryRegistry(class00951 particleSpriteManager) implements ParticleFactoryRegistry
{
    public <T extends class07126> void register(class07103<T> class071032, class04417<T> class044172) {
        this.particleSpriteManager.y.put(class04206.z.N(class071032), class044172);
    }

    public <T extends class07126> void register(class07103<T> class071032, ParticleFactoryRegistry.PendingParticleFactory<T> pendingParticleFactory) {
        class00975 class009752 = new class00975();
        FabricSpriteProviderImpl fabricSpriteProviderImpl = new FabricSpriteProviderImpl(class009752);
        this.particleSpriteManager.N.put(class04206.z.y(class071032), class009752);
        this.register(class071032, pendingParticleFactory.create((FabricSpriteProvider)fabricSpriteProviderImpl));
    }
}

