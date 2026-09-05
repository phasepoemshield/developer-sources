/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07055
 *  minecraft.class07438
 */
package net.fabricmc.fabric.api.entity.event.v1.effect;

import minecraft.class07055;
import minecraft.class07438;

public interface FabricMobEffect {
    default public void onEffectRemoved(class07055 class070552, class07438 class074382) {
    }

    default public void onEffectStarted(class07055 class070552, class07438 class074382) {
    }

    default public void onEffectAdded(class07055 class070552, class07438 class074382) {
    }
}

