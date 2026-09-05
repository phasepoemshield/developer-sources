/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement
 */
package net.fabricmc.fabric.impl.client.rendering.hud;

import java.util.function.Function;
import minecraft.class01894;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.fabricmc.fabric.impl.client.rendering.hud.HudLayer$1;

@Environment(value=EnvType.CLIENT)
public interface HudLayer {
    public static HudLayer of(class01894 class018942, Function<HudElement, HudElement> function, boolean bl) {
        return new HudLayer$1(class018942, function, bl);
    }

    public class01894 id();

    public HudElement element(HudElement var1);

    public boolean isRemoved();

    public static HudLayer ofVanilla(class01894 class018942) {
        return HudLayer.of(class018942, Function.identity(), false);
    }

    public static HudLayer ofElement(class01894 class018942, HudElement hudElement) {
        return HudLayer.of(class018942, hudElement2 -> hudElement, false);
    }
}

