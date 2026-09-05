/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.sound.v1.FabricSoundInstance
 */
package net.fabricmc.fabric.mixin.client.sound;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.sound.v1.FabricSoundInstance;

@Environment(value=EnvType.CLIENT)
public interface SoundInstanceMixin
extends FabricSoundInstance {
}

