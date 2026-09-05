/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.autoconfig.AutoConfig
 *  me.shedaniel.autoconfig.ConfigData
 *  me.shedaniel.autoconfig.ConfigHolder
 *  me.shedaniel.autoconfig.annotation.Config
 *  me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$Excluded
 *  me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$Tooltip
 *  me.shedaniel.autoconfig.serializer.DummyConfigSerializer
 *  minecraft.class07082
 */
package squeek.appleskin.gui;

import java.io.IOException;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.ConfigHolder;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.DummyConfigSerializer;
import minecraft.class07082;
import squeek.appleskin.ModConfig;

@Config(name="appleskin")
public class AutoConfigIntegration
implements ConfigData {
    @ConfigEntry.Gui.Excluded
    private static final ModConfig DEFAULTS = new ModConfig();
    @ConfigEntry.Gui.Tooltip
    public boolean showFoodValuesInTooltip;
    @ConfigEntry.Gui.Tooltip
    public boolean showFoodValuesInTooltipAlways;
    @ConfigEntry.Gui.Tooltip
    public boolean showSaturationHudOverlay;
    @ConfigEntry.Gui.Tooltip
    public boolean showFoodValuesHudOverlay;
    @ConfigEntry.Gui.Tooltip
    public boolean showFoodValuesHudOverlayWhenOffhand;
    @ConfigEntry.Gui.Tooltip
    public boolean showFoodExhaustionHudUnderlay;
    @ConfigEntry.Gui.Tooltip
    public boolean showFoodHealthHudOverlay;
    @ConfigEntry.Gui.Tooltip
    public boolean showVanillaAnimationsOverlay;
    @ConfigEntry.Gui.Tooltip
    public float maxHudOverlayFlashAlpha;

    public AutoConfigIntegration() {
        this.showFoodValuesInTooltip = AutoConfigIntegration.DEFAULTS.showFoodValuesInTooltip;
        this.showFoodValuesInTooltipAlways = AutoConfigIntegration.DEFAULTS.showFoodValuesInTooltipAlways;
        this.showSaturationHudOverlay = AutoConfigIntegration.DEFAULTS.showSaturationHudOverlay;
        this.showFoodValuesHudOverlay = AutoConfigIntegration.DEFAULTS.showFoodValuesHudOverlay;
        this.showFoodValuesHudOverlayWhenOffhand = AutoConfigIntegration.DEFAULTS.showFoodValuesHudOverlayWhenOffhand;
        this.showFoodExhaustionHudUnderlay = AutoConfigIntegration.DEFAULTS.showFoodExhaustionHudUnderlay;
        this.showFoodHealthHudOverlay = AutoConfigIntegration.DEFAULTS.showFoodHealthHudOverlay;
        this.showVanillaAnimationsOverlay = AutoConfigIntegration.DEFAULTS.showVanillaAnimationsOverlay;
        this.maxHudOverlayFlashAlpha = AutoConfigIntegration.DEFAULTS.maxHudOverlayFlashAlpha;
    }

    public static void init() {
        ConfigHolder configHolder2 = AutoConfig.register(AutoConfigIntegration.class, DummyConfigSerializer::new);
        configHolder2.registerSaveListener((configHolder, autoConfigIntegration) -> {
            ModConfig.INSTANCE.maxHudOverlayFlashAlpha = autoConfigIntegration.maxHudOverlayFlashAlpha;
            ModConfig.INSTANCE.showFoodHealthHudOverlay = autoConfigIntegration.showFoodHealthHudOverlay;
            ModConfig.INSTANCE.showFoodExhaustionHudUnderlay = autoConfigIntegration.showFoodExhaustionHudUnderlay;
            ModConfig.INSTANCE.showFoodValuesInTooltip = autoConfigIntegration.showFoodValuesInTooltip;
            ModConfig.INSTANCE.showFoodValuesHudOverlay = autoConfigIntegration.showFoodValuesHudOverlay;
            ModConfig.INSTANCE.showFoodValuesInTooltipAlways = autoConfigIntegration.showFoodValuesInTooltipAlways;
            ModConfig.INSTANCE.showSaturationHudOverlay = autoConfigIntegration.showSaturationHudOverlay;
            ModConfig.INSTANCE.showVanillaAnimationsOverlay = autoConfigIntegration.showVanillaAnimationsOverlay;
            ModConfig.INSTANCE.showFoodValuesHudOverlayWhenOffhand = autoConfigIntegration.showFoodValuesHudOverlayWhenOffhand;
            try {
                ModConfig.INSTANCE.save();
                return class07082.N;
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        });
        configHolder2.registerLoadListener((configHolder, autoConfigIntegration) -> {
            autoConfigIntegration.maxHudOverlayFlashAlpha = ModConfig.INSTANCE.maxHudOverlayFlashAlpha;
            autoConfigIntegration.showFoodHealthHudOverlay = ModConfig.INSTANCE.showFoodHealthHudOverlay;
            autoConfigIntegration.showFoodExhaustionHudUnderlay = ModConfig.INSTANCE.showFoodExhaustionHudUnderlay;
            autoConfigIntegration.showFoodValuesInTooltip = ModConfig.INSTANCE.showFoodValuesInTooltip;
            autoConfigIntegration.showFoodValuesHudOverlay = ModConfig.INSTANCE.showFoodValuesHudOverlay;
            autoConfigIntegration.showFoodValuesInTooltipAlways = ModConfig.INSTANCE.showFoodValuesInTooltipAlways;
            autoConfigIntegration.showSaturationHudOverlay = ModConfig.INSTANCE.showSaturationHudOverlay;
            autoConfigIntegration.showVanillaAnimationsOverlay = ModConfig.INSTANCE.showVanillaAnimationsOverlay;
            autoConfigIntegration.showFoodValuesHudOverlayWhenOffhand = ModConfig.INSTANCE.showFoodValuesHudOverlayWhenOffhand;
            return class07082.N;
        });
        configHolder2.load();
    }
}

