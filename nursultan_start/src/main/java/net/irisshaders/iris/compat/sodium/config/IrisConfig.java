/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class05096
 *  minecraft.class06202
 *  minecraft.class06532
 *  net.caffeinemc.mods.sodium.api.config.ConfigEntryPoint
 *  net.caffeinemc.mods.sodium.api.config.ConfigState
 *  net.caffeinemc.mods.sodium.api.config.option.OptionImpact
 *  net.caffeinemc.mods.sodium.api.config.option.Range
 *  net.caffeinemc.mods.sodium.api.config.structure.ConfigBuilder
 *  net.caffeinemc.mods.sodium.api.config.structure.OptionBuilder
 *  net.caffeinemc.mods.sodium.api.config.structure.PageBuilder
 *  net.caffeinemc.mods.sodium.client.gui.options.control.ControlValueFormatterImpls
 *  net.irisshaders.iris.gui.option.IrisVideoSettings
 *  net.irisshaders.iris.gui.screen.ShaderPackScreen
 *  net.irisshaders.iris.pathways.colorspace.ColorSpace
 */
package net.irisshaders.iris.compat.sodium.config;

import java.io.IOException;
import java.util.Locale;
import java.util.Set;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06532;
import net.caffeinemc.mods.sodium.api.config.ConfigEntryPoint;
import net.caffeinemc.mods.sodium.api.config.ConfigState;
import net.caffeinemc.mods.sodium.api.config.option.OptionImpact;
import net.caffeinemc.mods.sodium.api.config.option.Range;
import net.caffeinemc.mods.sodium.api.config.structure.ConfigBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.OptionBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.PageBuilder;
import net.caffeinemc.mods.sodium.client.gui.options.control.ControlValueFormatterImpls;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gui.option.IrisVideoSettings;
import net.irisshaders.iris.gui.screen.ShaderPackScreen;
import net.irisshaders.iris.pathways.colorspace.ColorSpace;

public class IrisConfig
implements ConfigEntryPoint {
    public static final class01894 MONO;
    public static final class01894 COLOR;

    public void registerConfigLate(ConfigBuilder configBuilder) {
        configBuilder.registerOwnModOptions().setName("Iris").setIcon(MONO).setColorTheme(configBuilder.createColorTheme().setBaseThemeRGB(-698654)).setVersion(Iris.getVersionSimple()).addPage((PageBuilder)configBuilder.createExternalPage().setName((class00392)class00392.L((String)"options.iris.shaderPackSelection.title")).setScreenConsumer(class050962 -> class06202.Nq().N((class05096)new ShaderPackScreen(class050962)))).addPage((PageBuilder)configBuilder.createOptionPage().setName((class00392)class00392.y((String)"Settings")).addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createExternalButtonOption(class01894.N((String)"iris", (String)"settings")).setTooltip((class00392)class00392.y((String)"Packs")).setName((class00392)class00392.L((String)"options.iris.shaderPackList")).setScreenConsumer(class050962 -> class06202.Nq().N((class05096)new ShaderPackScreen(class050962))))).addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createEnumOption(class01894.N((String)"iris", (String)"color_space"), ColorSpace.class).setBinding(colorSpace -> {
            IrisVideoSettings.colorSpace = colorSpace;
        }, () -> IrisVideoSettings.colorSpace).setName((class00392)class00392.L((String)"options.iris.colorSpace")).setDefaultValue((Enum)ColorSpace.SRGB).setTooltip((class00392)class00392.L((String)"options.iris.colorSpace.sodium_tooltip")).setStorageHandler(() -> {
            try {
                Iris.getIrisConfig().save();
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }).setElementNameProvider(ColorSpace::getName)).addOption((OptionBuilder)configBuilder.createIntegerOption(class01894.N((String)"iris", (String)"shadow_distance")).setDefaultValue(Integer.valueOf(32)).setBinding(n -> {
            IrisVideoSettings.shadowDistance = n;
        }, () -> IrisVideoSettings.getOverriddenShadowDistance((int)IrisVideoSettings.shadowDistance)).setName((class00392)class00392.L((String)"options.iris.shadowDistance")).setTooltip(n -> {
            if (!IrisVideoSettings.isShadowDistanceSliderEnabled()) {
                return class00392.L((String)"options.iris.shadowDistance.disabled");
            }
            return class00392.L((String)"options.iris.shadowDistance.sodium_tooltip");
        }).setValueFormatter(ControlValueFormatterImpls.quantityOrDisabled(n -> class00392.N((String)"options.chunks", (Object[])new Object[]{n}), (class00392)class00392.y((String)"None"))).setEnabledProvider(configState -> IrisVideoSettings.isShadowDistanceSliderEnabled(), new class01894[]{ConfigState.UPDATE_ON_REBUILD}).setStorageHandler(() -> {
            try {
                Iris.getIrisConfig().save();
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }).setRange(new Range(0, 32, 1)).setImpact(OptionImpact.HIGH)))).registerOptionOverlay(class01894.N((String)"sodium:quality.filtering_mode"), (OptionBuilder)configBuilder.createEnumOption(class01894.N((String)"sodium:quality.filtering_mode"), class06532.class).setTooltip(class065322 -> {
            if (class065322 == class06532.field_64664) {
                return class00392.L((String)("options.textureFiltering." + class065322.name().toLowerCase(Locale.ROOT) + ".tooltip")).y((class00392)class00392.y((String)" (RGSS is not usable with shaders on.)"));
            }
            return class00392.L((String)("options.textureFiltering." + class065322.name().toLowerCase(Locale.ROOT) + ".tooltip"));
        }).setAllowedValuesProvider(configState -> {
            if (Iris.getCurrentPack().isPresent()) {
                return Set.of(class06532.field_64663, class06532.field_64665);
            }
            return Set.of(class06532.values());
        }, new class01894[]{ConfigState.UPDATE_ON_REBUILD})).registerOptionOverlay(class01894.N((String)"sodium:quality.graphics"), (OptionBuilder)configBuilder.createBooleanOption(class01894.N((String)"sodium:quality.graphics")).setTooltip(bl -> {
            if (Iris.getCurrentPack().isPresent()) {
                return class00392.y((String)"This option is not relevant when a shader pack is active.");
            }
            return class00392.L((String)"options.improvedTransparency.tooltip");
        }).setEnabledProvider(configState -> Iris.getCurrentPack().isEmpty(), new class01894[]{ConfigState.UPDATE_ON_REBUILD}));
    }
}

