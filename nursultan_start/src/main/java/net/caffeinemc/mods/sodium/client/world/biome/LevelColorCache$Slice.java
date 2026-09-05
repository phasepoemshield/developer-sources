/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.world.biome;

import net.caffeinemc.mods.sodium.client.util.color.BoxBlur$ColorBuffer;

class LevelColorCache$Slice {
    final BoxBlur$ColorBuffer buffer;
    long lastPopulateStamp;

    public BoxBlur$ColorBuffer getBuffer() {
        return this.buffer;
    }

    LevelColorCache$Slice(int n) {
        this.buffer = new BoxBlur$ColorBuffer(n, n);
        this.lastPopulateStamp = 0L;
    }
}

