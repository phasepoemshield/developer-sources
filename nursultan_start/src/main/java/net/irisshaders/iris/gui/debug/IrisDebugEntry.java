/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class01285
 *  minecraft.class01894
 *  minecraft.class05834
 *  minecraft.class07299
 *  net.caffeinemc.mods.sodium.client.render.SodiumWorldRenderer
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.shadows.ShadowRenderer
 */
package net.irisshaders.iris.gui.debug;

import minecraft.class00570;
import minecraft.class01285;
import minecraft.class01894;
import minecraft.class05834;
import minecraft.class07299;
import net.caffeinemc.mods.sodium.client.render.SodiumWorldRenderer;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gui.option.IrisVideoSettings;
import net.irisshaders.iris.shadows.ShadowRenderer;

public class IrisDebugEntry
implements class01285 {
    public void method_72751(class05834 class058342, class07299 class072992, class00570 class005702, class00570 class005703) {
        class058342.N(class01894.N((String)"iris", (String)"name"), "[Iris] Version: " + Iris.getFormattedVersion());
        if (Iris.getIrisConfig().areShadersEnabled()) {
            class058342.N(class01894.N((String)"iris", (String)"name"), "[Iris] Shaderpack: " + Iris.getCurrentPackName() + (Iris.isFallback() ? " (fallback)" : ""));
            Iris.getCurrentPack().ifPresent(shaderPack -> class058342.N(class01894.N((String)"iris", (String)"name"), "[Iris] " + shaderPack.getProfileInfo()));
            class058342.N(class01894.N((String)"iris", (String)"name"), "[Iris] Color space: " + IrisVideoSettings.colorSpace.name());
            ShadowRenderer.ACTIVE = true;
            if (class072992 != null) {
                class058342.N(class01894.N((String)"iris", (String)"name"), "[Iris] Shadows: " + SodiumWorldRenderer.instance().getChunksDebugString());
            }
            ShadowRenderer.ACTIVE = false;
        } else {
            class058342.N(class01894.N((String)"iris", (String)"name"), "[Iris] Shaders are disabled");
        }
    }
}

