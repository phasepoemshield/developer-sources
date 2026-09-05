/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class05096
 *  minecraft.class06202
 *  net.caffeinemc.mods.sodium.api.config.ConfigEntryPoint
 *  net.caffeinemc.mods.sodium.api.config.structure.ConfigBuilder
 *  net.caffeinemc.mods.sodium.api.config.structure.PageBuilder
 */
package page.langeweile.ok_zoomer.config.sodium;

import minecraft.class00392;
import minecraft.class05096;
import minecraft.class06202;
import net.caffeinemc.mods.sodium.api.config.ConfigEntryPoint;
import net.caffeinemc.mods.sodium.api.config.structure.ConfigBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.PageBuilder;
import page.langeweile.ok_zoomer.config.screen.OkZoomerConfigScreen;
import page.langeweile.ok_zoomer.utils.ModUtils;

public class OkZoomerSodiumEntry
implements ConfigEntryPoint {
    public void registerConfigLate(ConfigBuilder configBuilder) {
        configBuilder.registerOwnModOptions().setIcon(ModUtils.id("textures/sodium/icon.png")).setColorTheme(configBuilder.createColorTheme().setBaseThemeRGB(16768093)).addPage((PageBuilder)configBuilder.createExternalPage().setName((class00392)class00392.L((String)"config.ok_zoomer.sodium.page.zoom")).setScreenConsumer(class050962 -> class06202.Nq().N((class05096)new OkZoomerConfigScreen((class05096)class050962))));
    }
}

