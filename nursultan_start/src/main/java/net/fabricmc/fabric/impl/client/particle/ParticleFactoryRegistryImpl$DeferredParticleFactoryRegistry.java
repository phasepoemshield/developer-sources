/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04417
 *  minecraft.class07103
 *  minecraft.class07126
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry
 *  net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry$PendingParticleFactory
 */
package net.fabricmc.fabric.impl.client.particle;

import java.util.IdentityHashMap;
import java.util.Map;
import minecraft.class04417;
import minecraft.class07103;
import minecraft.class07126;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

@Environment(value=EnvType.CLIENT)
class ParticleFactoryRegistryImpl$DeferredParticleFactoryRegistry
implements ParticleFactoryRegistry {
    private final Map<class07103<?>, class04417<?>> factories = new IdentityHashMap();
    private final Map<class07103<?>, ParticleFactoryRegistry.PendingParticleFactory<?>> constructors = new IdentityHashMap();

    ParticleFactoryRegistryImpl$DeferredParticleFactoryRegistry() {
    }

    public <T extends class07126> void register(class07103<T> class071032, ParticleFactoryRegistry.PendingParticleFactory<T> pendingParticleFactory) {
        this.constructors.put(class071032, pendingParticleFactory);
    }

    public <T extends class07126> void register(class07103<T> class071032, class04417<T> class044172) {
        this.factories.put(class071032, class044172);
    }

    void applyTo(ParticleFactoryRegistry particleFactoryRegistry) {
        ParticleFactoryRegistry.PendingParticleFactory pendingParticleFactory;
        class07103<?> class071032;
        for (Map.Entry<class07103<?>, class04417<?>> entry : this.factories.entrySet()) {
            class071032 = entry.getKey();
            pendingParticleFactory = entry.getValue();
            particleFactoryRegistry.register(class071032, pendingParticleFactory);
        }
        for (Map.Entry<class07103<?>, class04417<?>> entry : this.constructors.entrySet()) {
            class071032 = entry.getKey();
            pendingParticleFactory = (ParticleFactoryRegistry.PendingParticleFactory)entry.getValue();
            particleFactoryRegistry.register(class071032, pendingParticleFactory);
        }
    }
}

