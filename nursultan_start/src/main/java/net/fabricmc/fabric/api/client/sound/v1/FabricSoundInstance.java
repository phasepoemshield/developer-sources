/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class06299
 *  minecraft.class06304
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.sound.v1;

import java.util.concurrent.CompletableFuture;
import minecraft.class01894;
import minecraft.class06299;
import minecraft.class06304;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface FabricSoundInstance {
    public static final class01894 EMPTY_SOUND = class01894.N((String)"fabric-sound-api-v1", (String)"empty");

    default public CompletableFuture<class06304> getAudioStream(class06299 class062992, class01894 class018942, boolean bl) {
        return class062992.N(class018942, bl);
    }
}

