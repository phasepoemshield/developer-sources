/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_3414
 */
package com.holdmylua.source.scripting.custom_api;

import com.holdmylua.source.annotation.Safe;
import net.minecraft.class_310;
import net.minecraft.class_3414;

public class Sound {
    private class_3414 sound;

    @Safe
    public void play(float volume, float pitch) {
        class_310.method_1551().field_1724.method_5783(this.sound, volume, pitch);
    }
}

