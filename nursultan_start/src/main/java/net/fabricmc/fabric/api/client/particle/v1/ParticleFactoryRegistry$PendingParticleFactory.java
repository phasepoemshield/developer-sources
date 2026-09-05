/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04417
 *  minecraft.class07126
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.particle.v1;

import minecraft.class04417;
import minecraft.class07126;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.FabricSpriteProvider;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ParticleFactoryRegistry$PendingParticleFactory<T extends class07126> {
    public class04417<T> create(FabricSpriteProvider var1);
}

