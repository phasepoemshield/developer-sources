/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.AddressMode
 *  com.mojang.blaze3d.textures.FilterMode
 *  minecraft.class08188
 */
package minecraft;

import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import java.util.OptionalDouble;
import minecraft.class08188;

public class class08178 {
    private final class08188[] N = new class08188[32];

    static int y(AddressMode addressMode, AddressMode addressMode2, FilterMode filterMode, FilterMode filterMode2, boolean bl) {
        int n = 0;
        n |= addressMode.ordinal() & 1;
        n |= (addressMode2.ordinal() & 1) << 1;
        n |= (filterMode.ordinal() & 1) << 2;
        n |= (filterMode2.ordinal() & 1) << 3;
        if (bl) {
            n |= 0x10;
        }
        return n;
    }

    public class08188 y(FilterMode filterMode) {
        return this.N(AddressMode.REPEAT, AddressMode.REPEAT, filterMode, filterMode, false);
    }

    public class08188 y(FilterMode filterMode, boolean bl) {
        return this.N(AddressMode.REPEAT, AddressMode.REPEAT, filterMode, filterMode, bl);
    }

    public void y() {
        class08188[] class08188Array = this.N;
        int n = class08188Array.length;
        for (int i = 0; i < n; ++i) {
            class08188Array[i].close();
        }
    }

    public class08188 N(FilterMode filterMode, boolean bl) {
        return this.N(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, filterMode, filterMode, bl);
    }

    public void N() {
        GpuDevice gpuDevice = RenderSystem.getDevice();
        if (AddressMode.values().length != 2 || FilterMode.values().length != 2) {
            throw new IllegalStateException("AddressMode and FilterMode enum sizes must be 2 - if you expanded them, please update SamplerCache");
        }
        for (AddressMode addressMode : AddressMode.values()) {
            for (AddressMode addressMode2 : AddressMode.values()) {
                for (FilterMode filterMode : FilterMode.values()) {
                    for (FilterMode filterMode2 : FilterMode.values()) {
                        for (boolean bl : new boolean[]{true, false}) {
                            this.N[class08178.y((AddressMode)addressMode, (AddressMode)addressMode2, (FilterMode)filterMode, (FilterMode)filterMode2, (boolean)bl)] = gpuDevice.createSampler(addressMode, addressMode2, filterMode, filterMode2, 1, bl ? OptionalDouble.empty() : OptionalDouble.of(0.0));
                        }
                    }
                }
            }
        }
    }

    public class08188 N(AddressMode addressMode, AddressMode addressMode2, FilterMode filterMode, FilterMode filterMode2, boolean bl) {
        return this.N[class08178.y(addressMode, addressMode2, filterMode, filterMode2, bl)];
    }

    public class08188 N(FilterMode filterMode) {
        return this.N(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, filterMode, filterMode, false);
    }
}

