/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class01659
 *  minecraft.class01666
 *  minecraft.class02362
 */
package net.fabricmc.fabric.impl.particle;

import minecraft.class00667;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class02362;
import net.fabricmc.fabric.impl.particle.ExtendedBlockStateParticleEffectSync;

public record ExtendedBlockStateParticleEffectSync$DummyPayload() implements class01659
{
    public static final ExtendedBlockStateParticleEffectSync$DummyPayload INSTANCE = new ExtendedBlockStateParticleEffectSync$DummyPayload();
    public static final class02362<class00667, ExtendedBlockStateParticleEffectSync$DummyPayload> CODEC = class02362.N((Object)((Object)INSTANCE));
    public static final class01666<ExtendedBlockStateParticleEffectSync$DummyPayload> ID = new class01666(ExtendedBlockStateParticleEffectSync.PACKET_ID);

    public class01666<? extends class01659> method_56479() {
        return ID;
    }
}

