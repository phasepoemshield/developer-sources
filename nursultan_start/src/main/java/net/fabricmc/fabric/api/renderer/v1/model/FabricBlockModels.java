/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class03770
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class08388
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.renderer.v1.model;

import minecraft.class00500;
import minecraft.class03770;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class08388;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface FabricBlockModels {
    default public class08388 getModelParticleSprite(class00500 class005002, class07295 class072952, class07209 class072092) {
        return ((class03770)this).y(class005002).particleSprite(class072952, class072092, class005002);
    }
}

