/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class02233
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement
 */
package net.fabricmc.fabric.impl.client.rendering.hud;

import java.util.ArrayList;
import java.util.List;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class02233;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.fabricmc.fabric.impl.client.rendering.hud.HudLayer;

@Environment(value=EnvType.CLIENT)
public record HudElementRegistryImpl$RootLayer(class01894 id, List<HudLayer> layers) {
    private HudElementRegistryImpl$RootLayer(class01894 class018942) {
        this(class018942, new ArrayList<HudLayer>());
        this.layers().add(HudLayer.ofVanilla(class018942));
    }

    public void render(class01054 class010542, class02233 class022332, HudElement hudElement) {
        for (HudLayer hudLayer : this.layers) {
            if (hudLayer.isRemoved()) continue;
            hudLayer.element(hudElement).render(class010542, class022332);
        }
    }
}

