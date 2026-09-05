/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class01285
 *  minecraft.class01894
 *  minecraft.class05834
 *  minecraft.class06541
 *  minecraft.class07299
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.render.SodiumWorldRenderer
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.gui;

import minecraft.class00570;
import minecraft.class01285;
import minecraft.class01894;
import minecraft.class05834;
import minecraft.class06541;
import minecraft.class07299;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.render.SodiumWorldRenderer;
import org.jspecify.annotations.Nullable;

public class SodiumDebugEntry
implements class01285 {
    private static final class01894 DEBUG_GROUP = class01894.N((String)"sodium", (String)"debug_group");
    private final boolean verbose;

    public SodiumDebugEntry(boolean bl) {
        this.verbose = bl;
    }

    private static class06541 getVersionColor() {
        String string = SodiumClientMod.getVersion();
        class06541 class065412 = string.contains("-local") ? class06541.field_1061 : (string.contains("-snapshot") ? class06541.field_1076 : class06541.field_1060);
        return class065412;
    }

    public void method_72751(class05834 class058342, @Nullable class07299 class072992, @Nullable class00570 class005702, @Nullable class00570 class005703) {
        class058342.N(DEBUG_GROUP, "%sSodium Renderer (%s)".formatted(new Object[]{SodiumDebugEntry.getVersionColor(), SodiumClientMod.getVersion()}));
        SodiumWorldRenderer sodiumWorldRenderer = SodiumWorldRenderer.instanceNullable();
        if (sodiumWorldRenderer != null) {
            class058342.N(DEBUG_GROUP, sodiumWorldRenderer.getDebugStrings(this.verbose));
        }
    }
}

