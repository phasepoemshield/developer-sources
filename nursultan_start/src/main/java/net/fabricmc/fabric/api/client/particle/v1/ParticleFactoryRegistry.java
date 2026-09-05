/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04417
 *  minecraft.class07103
 *  minecraft.class07126
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.particle.ParticleFactoryRegistryImpl
 */
package net.fabricmc.fabric.api.client.particle.v1;

import minecraft.class04417;
import minecraft.class07103;
import minecraft.class07126;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry$PendingParticleFactory;
import net.fabricmc.fabric.impl.client.particle.ParticleFactoryRegistryImpl;

@Environment(value=EnvType.CLIENT)
public interface ParticleFactoryRegistry {
    public static ParticleFactoryRegistry getInstance() {
        return ParticleFactoryRegistryImpl.INSTANCE;
    }

    public <T extends class07126> void register(class07103<T> var1, class04417<T> var2);

    public <T extends class07126> void register(class07103<T> var1, ParticleFactoryRegistry$PendingParticleFactory<T> var2);
}

