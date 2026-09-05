/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00951
 *  minecraft.class04417
 *  minecraft.class07103
 *  minecraft.class07126
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry
 *  net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry$PendingParticleFactory
 */
package net.fabricmc.fabric.impl.client.particle;

import minecraft.class00951;
import minecraft.class04417;
import minecraft.class07103;
import minecraft.class07126;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.impl.client.particle.ParticleFactoryRegistryImpl$DeferredParticleFactoryRegistry;
import net.fabricmc.fabric.impl.client.particle.ParticleFactoryRegistryImpl$DirectParticleFactoryRegistry;

@Environment(value=EnvType.CLIENT)
public final class ParticleFactoryRegistryImpl
implements ParticleFactoryRegistry {
    public static final ParticleFactoryRegistryImpl INSTANCE = new ParticleFactoryRegistryImpl();
    ParticleFactoryRegistry internalRegistry = new ParticleFactoryRegistryImpl$DeferredParticleFactoryRegistry();

    private ParticleFactoryRegistryImpl() {
    }

    public void initialize(class00951 class009512) {
        ParticleFactoryRegistryImpl$DirectParticleFactoryRegistry particleFactoryRegistryImpl$DirectParticleFactoryRegistry = new ParticleFactoryRegistryImpl$DirectParticleFactoryRegistry(class009512);
        ParticleFactoryRegistryImpl$DeferredParticleFactoryRegistry particleFactoryRegistryImpl$DeferredParticleFactoryRegistry = (ParticleFactoryRegistryImpl$DeferredParticleFactoryRegistry)this.internalRegistry;
        particleFactoryRegistryImpl$DeferredParticleFactoryRegistry.applyTo(particleFactoryRegistryImpl$DirectParticleFactoryRegistry);
        this.internalRegistry = particleFactoryRegistryImpl$DirectParticleFactoryRegistry;
    }

    public <T extends class07126> void register(class07103<T> class071032, class04417<T> class044172) {
        this.internalRegistry.register(class071032, class044172);
    }

    public <T extends class07126> void register(class07103<T> class071032, ParticleFactoryRegistry.PendingParticleFactory<T> pendingParticleFactory) {
        this.internalRegistry.register(class071032, pendingParticleFactory);
    }
}

