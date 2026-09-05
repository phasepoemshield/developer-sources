/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class04798
 *  minecraft.class05216
 *  minecraft.class05630
 *  minecraft.class06202
 *  net.caffeinemc.caffeineconfig.Option
 *  net.caffeinemc.mods.sodium.api.config.ConfigEntryPoint
 *  net.caffeinemc.mods.sodium.api.config.StorageEventHandler
 *  net.caffeinemc.mods.sodium.api.config.option.OptionFlag
 *  net.caffeinemc.mods.sodium.api.config.option.OptionImpact
 *  net.caffeinemc.mods.sodium.api.config.structure.ConfigBuilder
 *  net.caffeinemc.mods.sodium.api.config.structure.IntegerOptionBuilder
 *  net.caffeinemc.mods.sodium.api.config.structure.OptionBuilder
 *  net.caffeinemc.mods.sodium.api.config.structure.OptionGroupBuilder
 *  net.caffeinemc.mods.sodium.api.config.structure.OptionPageBuilder
 *  net.caffeinemc.mods.sodium.api.config.structure.PageBuilder
 *  net.caffeinemc.mods.sodium.client.gui.options.control.ControlValueFormatterImpls
 */
package me.flashyreese.mods.sodiumextra.client.config;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import me.flashyreese.mods.sodiumextra.client.config.FogTypeConfig;
import me.flashyreese.mods.sodiumextra.client.config.SodiumExtraGameOptions$OverlayCorner;
import me.flashyreese.mods.sodiumextra.client.config.SodiumExtraGameOptions$TextContrast;
import me.flashyreese.mods.sodiumextra.client.config.SodiumExtraGameOptions$VerticalSyncOption;
import me.flashyreese.mods.sodiumextra.common.util.ControlValueFormatterExtended;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class04798;
import minecraft.class05216;
import minecraft.class05630;
import minecraft.class06202;
import net.caffeinemc.caffeineconfig.Option;
import net.caffeinemc.mods.sodium.api.config.ConfigEntryPoint;
import net.caffeinemc.mods.sodium.api.config.StorageEventHandler;
import net.caffeinemc.mods.sodium.api.config.option.OptionFlag;
import net.caffeinemc.mods.sodium.api.config.option.OptionImpact;
import net.caffeinemc.mods.sodium.api.config.structure.ConfigBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.IntegerOptionBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.OptionBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.OptionGroupBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.OptionPageBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.PageBuilder;
import net.caffeinemc.mods.sodium.client.gui.options.control.ControlValueFormatterImpls;

public class SodiumExtraConfig
implements ConfigEntryPoint {
    private static class01894 id(String string) {
        return class01894.N((String)("sodium-extra:" + string));
    }

    private OptionPageBuilder createRenderPage(ConfigBuilder configBuilder) {
        ArrayList arrayList = new ArrayList();
        Arrays.stream(class04798.values()).sorted(Comparator.comparing(Enum::name)).filter(class047982 -> class047982 != class04798.field_27888).forEach(class047982 -> {
            IntegerOptionBuilder integerOptionBuilder = configBuilder.createIntegerOption(SodiumExtraConfig.id(class047982.name().toLowerCase(Locale.ROOT) + "_environment_start")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.fog")).isEnabled()).setName((class00392)class00392.N((String)"sodium-extra.option.fog_type.environment_start", (Object[])new Object[]{SodiumExtraConfig.fogTypeName(class047982)})).setTooltip((class00392)class00392.L((String)"sodium-extra.option.fog_type.environment_start.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setRange(0, 300, 1).setValueFormatter(ControlValueFormatterImpls.percentage()).setDefaultValue(Integer.valueOf(100)).setBinding(n -> {
                FogTypeConfig fogTypeConfig = SodiumExtraClientMod.options().renderSettings.fogTypeConfig.computeIfAbsent((class04798)class047982, class047982 -> new FogTypeConfig());
                fogTypeConfig.environmentStartMultiplier = n;
            }, () -> ((FogTypeConfig)SodiumExtraClientMod.options().renderSettings.fogTypeConfig.computeIfAbsent((class04798)class047982, (Function<class04798, Object>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$createRenderPage$46(minecraft.class04798 ), (Lminecraft/class04798;)Ljava/lang/Object;)())).environmentStartMultiplier).setValueFormatter(ControlValueFormatterImpls.percentage());
            IntegerOptionBuilder integerOptionBuilder2 = configBuilder.createIntegerOption(SodiumExtraConfig.id(class047982.name().toLowerCase(Locale.ROOT) + "_environment_end")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.fog")).isEnabled()).setName((class00392)class00392.N((String)"sodium-extra.option.fog_type.environment_end", (Object[])new Object[]{SodiumExtraConfig.fogTypeName(class047982)})).setTooltip((class00392)class00392.L((String)"sodium-extra.option.fog_type.environment_end.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setRange(0, 300, 1).setValueFormatter(ControlValueFormatterImpls.percentage()).setDefaultValue(Integer.valueOf(100)).setBinding(n -> {
                FogTypeConfig fogTypeConfig = SodiumExtraClientMod.options().renderSettings.fogTypeConfig.computeIfAbsent((class04798)class047982, class047982 -> new FogTypeConfig());
                fogTypeConfig.environmentEndMultiplier = n;
            }, () -> ((FogTypeConfig)SodiumExtraClientMod.options().renderSettings.fogTypeConfig.computeIfAbsent((class04798)class047982, (Function<class04798, Object>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$createRenderPage$50(minecraft.class04798 ), (Lminecraft/class04798;)Ljava/lang/Object;)())).environmentEndMultiplier).setValueFormatter(ControlValueFormatterImpls.percentage());
            IntegerOptionBuilder integerOptionBuilder3 = configBuilder.createIntegerOption(SodiumExtraConfig.id(class047982.name().toLowerCase(Locale.ROOT) + "_render_distance_start")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.fog")).isEnabled()).setName((class00392)class00392.N((String)"sodium-extra.option.fog_type.render_distance_start", (Object[])new Object[]{SodiumExtraConfig.fogTypeName(class047982)})).setTooltip((class00392)class00392.L((String)"sodium-extra.option.fog_type.render_distance_start.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setRange(0, 300, 1).setValueFormatter(ControlValueFormatterImpls.percentage()).setDefaultValue(Integer.valueOf(100)).setBinding(n -> {
                FogTypeConfig fogTypeConfig = SodiumExtraClientMod.options().renderSettings.fogTypeConfig.computeIfAbsent((class04798)class047982, class047982 -> new FogTypeConfig());
                fogTypeConfig.renderDistanceStartMultiplier = n;
            }, () -> ((FogTypeConfig)SodiumExtraClientMod.options().renderSettings.fogTypeConfig.computeIfAbsent((class04798)class047982, (Function<class04798, Object>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$createRenderPage$54(minecraft.class04798 ), (Lminecraft/class04798;)Ljava/lang/Object;)())).renderDistanceStartMultiplier).setValueFormatter(ControlValueFormatterImpls.percentage());
            IntegerOptionBuilder integerOptionBuilder4 = configBuilder.createIntegerOption(SodiumExtraConfig.id(class047982.name().toLowerCase(Locale.ROOT) + "_render_distance_end")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.fog")).isEnabled()).setName((class00392)class00392.N((String)"sodium-extra.option.fog_type.render_distance_end", (Object[])new Object[]{SodiumExtraConfig.fogTypeName(class047982)})).setTooltip((class00392)class00392.L((String)"sodium-extra.option.fog_type.render_distance_end.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setRange(0, 300, 1).setValueFormatter(ControlValueFormatterImpls.percentage()).setDefaultValue(Integer.valueOf(100)).setBinding(n -> {
                FogTypeConfig fogTypeConfig = SodiumExtraClientMod.options().renderSettings.fogTypeConfig.computeIfAbsent((class04798)class047982, class047982 -> new FogTypeConfig());
                fogTypeConfig.renderDistanceEndMultiplier = n;
            }, () -> ((FogTypeConfig)SodiumExtraClientMod.options().renderSettings.fogTypeConfig.computeIfAbsent((class04798)class047982, (Function<class04798, Object>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$createRenderPage$58(minecraft.class04798 ), (Lminecraft/class04798;)Ljava/lang/Object;)())).renderDistanceEndMultiplier).setValueFormatter(ControlValueFormatterImpls.percentage());
            IntegerOptionBuilder integerOptionBuilder5 = configBuilder.createIntegerOption(SodiumExtraConfig.id(class047982.name().toLowerCase(Locale.ROOT) + "_sky_end")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.fog")).isEnabled()).setName((class00392)class00392.N((String)"sodium-extra.option.fog_type.sky_end", (Object[])new Object[]{SodiumExtraConfig.fogTypeName(class047982)})).setTooltip((class00392)class00392.L((String)"sodium-extra.option.fog_type.sky_end.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setRange(0, 300, 1).setValueFormatter(ControlValueFormatterImpls.percentage()).setDefaultValue(Integer.valueOf(100)).setBinding(n -> {
                FogTypeConfig fogTypeConfig = SodiumExtraClientMod.options().renderSettings.fogTypeConfig.computeIfAbsent((class04798)class047982, class047982 -> new FogTypeConfig());
                fogTypeConfig.skyEndMultiplier = n;
            }, () -> ((FogTypeConfig)SodiumExtraClientMod.options().renderSettings.fogTypeConfig.computeIfAbsent((class04798)class047982, (Function<class04798, Object>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$createRenderPage$62(minecraft.class04798 ), (Lminecraft/class04798;)Ljava/lang/Object;)())).skyEndMultiplier).setValueFormatter(ControlValueFormatterImpls.percentage());
            IntegerOptionBuilder integerOptionBuilder6 = configBuilder.createIntegerOption(SodiumExtraConfig.id(class047982.name().toLowerCase(Locale.ROOT) + "_cloud_end")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.fog")).isEnabled()).setName((class00392)class00392.N((String)"sodium-extra.option.fog_type.cloud_end", (Object[])new Object[]{SodiumExtraConfig.fogTypeName(class047982)})).setTooltip((class00392)class00392.L((String)"sodium-extra.option.fog_type.cloud_end.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setRange(0, 300, 1).setValueFormatter(ControlValueFormatterImpls.percentage()).setDefaultValue(Integer.valueOf(100)).setBinding(n -> {
                FogTypeConfig fogTypeConfig = SodiumExtraClientMod.options().renderSettings.fogTypeConfig.computeIfAbsent((class04798)class047982, class047982 -> new FogTypeConfig());
                fogTypeConfig.cloudEndMultiplier = n;
            }, () -> ((FogTypeConfig)SodiumExtraClientMod.options().renderSettings.fogTypeConfig.computeIfAbsent((class04798)class047982, (Function<class04798, Object>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$createRenderPage$66(minecraft.class04798 ), (Lminecraft/class04798;)Ljava/lang/Object;)())).cloudEndMultiplier).setValueFormatter(ControlValueFormatterImpls.percentage());
            arrayList.add(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id(class047982.name().toLowerCase(Locale.ROOT) + "_fog")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.fog")).isEnabled()).setName(SodiumExtraConfig.fogTypeName(class047982)).setTooltip(SodiumExtraConfig.fogTypeTooltip(class047982)).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> {
                SodiumExtraClientMod.options().renderSettings.fogTypeConfig.computeIfAbsent((class04798)class047982, (Function<class04798, FogTypeConfig>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$createRenderPage$68(minecraft.class04798 ), (Lminecraft/class04798;)Lme/flashyreese/mods/sodiumextra/client/config/FogTypeConfig;)()).enable = bl;
            }, () -> ((FogTypeConfig)SodiumExtraClientMod.options().renderSettings.fogTypeConfig.computeIfAbsent((class04798)class047982, (Function<class04798, Object>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$createRenderPage$70(minecraft.class04798 ), (Lminecraft/class04798;)Ljava/lang/Object;)())).enable).setDefaultValue(Boolean.valueOf(true))).addOption((OptionBuilder)integerOptionBuilder).addOption((OptionBuilder)integerOptionBuilder2).addOption((OptionBuilder)integerOptionBuilder3).addOption((OptionBuilder)integerOptionBuilder4).addOption((OptionBuilder)integerOptionBuilder5).addOption((OptionBuilder)integerOptionBuilder6));
        });
        OptionPageBuilder optionPageBuilder = configBuilder.createOptionPage().setName((class00392)class00392.L((String)"sodium-extra.option.render"));
        optionPageBuilder.addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("global_fog")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.fog")).isEnabled()).setName((class00392)class00392.L((String)"sodium-extra.option.global_fog")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.global_fog.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> {
            SodiumExtraClientMod.options().renderSettings.globalFog = bl;
        }, () -> SodiumExtraClientMod.options().renderSettings.globalFog).setDefaultValue(Boolean.valueOf(true))));
        arrayList.forEach(arg_0 -> ((OptionPageBuilder)optionPageBuilder).addOptionGroup(arg_0));
        optionPageBuilder.addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("light_updates")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.light_updates")).isEnabled()).setName((class00392)class00392.L((String)"sodium-extra.option.light_updates")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.light_updates.tooltip")).setBinding(bl -> {
            SodiumExtraClientMod.options().renderSettings.lightUpdates = bl;
        }, () -> SodiumExtraClientMod.options().renderSettings.lightUpdates).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setDefaultValue(Boolean.valueOf(true))));
        optionPageBuilder.addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("item_frame")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.render.entity")).isEnabled()).setName(SodiumExtraConfig.parseVanillaString("entity.minecraft.item_frame")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.item_frames.tooltip")).setBinding(bl -> {
            SodiumExtraClientMod.options().renderSettings.itemFrame = bl;
        }, () -> SodiumExtraClientMod.options().renderSettings.itemFrame).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setDefaultValue(Boolean.valueOf(true))).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("armor_stands")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.render.entity")).isEnabled()).setName(SodiumExtraConfig.parseVanillaString("entity.minecraft.armor_stand")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.armor_stands.tooltip")).setBinding(bl -> {
            SodiumExtraClientMod.options().renderSettings.armorStand = bl;
        }, () -> SodiumExtraClientMod.options().renderSettings.armorStand).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setDefaultValue(Boolean.valueOf(true))).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("paintings")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.render.entity")).isEnabled()).setName(SodiumExtraConfig.parseVanillaString("entity.minecraft.painting")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.paintings.tooltip")).setBinding(bl -> {
            SodiumExtraClientMod.options().renderSettings.painting = bl;
        }, () -> SodiumExtraClientMod.options().renderSettings.painting).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setDefaultValue(Boolean.valueOf(true))));
        optionPageBuilder.addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("beacon_beam")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.render.block.entity")).isEnabled()).setName((class00392)class00392.L((String)"sodium-extra.option.beacon_beam")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.beacon_beam.tooltip")).setBinding(bl -> {
            SodiumExtraClientMod.options().renderSettings.beaconBeam = bl;
        }, () -> SodiumExtraClientMod.options().renderSettings.beaconBeam).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setDefaultValue(Boolean.valueOf(true))).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("limit_beacon_beam_height")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.render.block.entity")).isEnabled()).setName((class00392)class00392.L((String)"sodium-extra.option.limit_beacon_beam_height")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.limit_beacon_beam_height.tooltip")).setBinding(bl -> {
            SodiumExtraClientMod.options().renderSettings.limitBeaconBeamHeight = bl;
        }, () -> SodiumExtraClientMod.options().renderSettings.limitBeaconBeamHeight).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setDefaultValue(Boolean.valueOf(false))).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("enchanting_table_book")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.render.block.entity")).isEnabled()).setName((class00392)class00392.L((String)"sodium-extra.option.enchanting_table_book")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.enchanting_table_book.tooltip")).setBinding(bl -> {
            SodiumExtraClientMod.options().renderSettings.enchantingTableBook = bl;
        }, () -> SodiumExtraClientMod.options().renderSettings.enchantingTableBook).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setDefaultValue(Boolean.valueOf(true))).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("piston")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.render.block.entity")).isEnabled()).setName(SodiumExtraConfig.parseVanillaString("block.minecraft.piston")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.piston.tooltip")).setBinding(bl -> {
            SodiumExtraClientMod.options().renderSettings.piston = bl;
        }, () -> SodiumExtraClientMod.options().renderSettings.piston).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setDefaultValue(Boolean.valueOf(true))));
        optionPageBuilder.addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("item_frame_name_tag")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.render.entity")).isEnabled()).setName((class00392)class00392.L((String)"sodium-extra.option.item_frame_name_tag")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.item_frame_name_tag.tooltip")).setBinding(bl -> {
            SodiumExtraClientMod.options().renderSettings.itemFrameNameTag = bl;
        }, () -> SodiumExtraClientMod.options().renderSettings.itemFrameNameTag).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setDefaultValue(Boolean.valueOf(true))).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("player_name_tag")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.render.entity")).isEnabled()).setName((class00392)class00392.L((String)"sodium-extra.option.player_name_tag")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.player_name_tag.tooltip")).setBinding(bl -> {
            SodiumExtraClientMod.options().renderSettings.playerNameTag = bl;
        }, () -> SodiumExtraClientMod.options().renderSettings.playerNameTag).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setDefaultValue(Boolean.valueOf(true))));
        return optionPageBuilder;
    }

    private static class00392 fogTypeTooltip(class04798 class047982) {
        String string = "sodium-extra.option.fog_type." + class047982.name().toLowerCase() + ".tooltip";
        class05216 class052162 = class00392.L((String)string);
        if (!class00390.y((class00392)class052162)) {
            return class00392.N((String)"sodium-extra.option.fog_type.default.tooltip", (Object[])new Object[]{SodiumExtraConfig.fogTypeName(class047982)});
        }
        return class052162;
    }

    private OptionPageBuilder createDetailsPage(ConfigBuilder configBuilder) {
        return configBuilder.createOptionPage().setName((class00392)class00392.L((String)"sodium-extra.option.details")).addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("sky")).setName((class00392)class00392.L((String)"sodium-extra.option.sky")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.sky.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> {
            SodiumExtraClientMod.options().detailSettings.sky = bl;
        }, () -> SodiumExtraClientMod.options().detailSettings.sky).setDefaultValue(Boolean.valueOf(true)).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.sky")).isEnabled())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("stars")).setName((class00392)class00392.L((String)"sodium-extra.option.stars")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.stars.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> {
            SodiumExtraClientMod.options().detailSettings.stars = bl;
        }, () -> SodiumExtraClientMod.options().detailSettings.stars).setDefaultValue(Boolean.valueOf(true)).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.sky")).isEnabled())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("sun")).setName((class00392)class00392.L((String)"sodium-extra.option.sun")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.sun.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> {
            SodiumExtraClientMod.options().detailSettings.sun = bl;
        }, () -> SodiumExtraClientMod.options().detailSettings.sun).setDefaultValue(Boolean.valueOf(true)).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.sky")).isEnabled())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("moon")).setName((class00392)class00392.L((String)"sodium-extra.option.moon")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.moon.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> {
            SodiumExtraClientMod.options().detailSettings.moon = bl;
        }, () -> SodiumExtraClientMod.options().detailSettings.moon).setDefaultValue(Boolean.valueOf(true)).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.sky")).isEnabled())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("rain_snow")).setName(SodiumExtraConfig.parseVanillaString("soundCategory.weather")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.rain_snow.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> {
            SodiumExtraClientMod.options().detailSettings.rainSnow = bl;
        }, () -> SodiumExtraClientMod.options().detailSettings.rainSnow).setDefaultValue(Boolean.valueOf(true)).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.particle")).isEnabled())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("biome_colors")).setName((class00392)class00392.L((String)"sodium-extra.option.biome_colors")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.biome_colors.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> {
            SodiumExtraClientMod.options().detailSettings.biomeColors = bl;
        }, () -> SodiumExtraClientMod.options().detailSettings.biomeColors).setDefaultValue(Boolean.valueOf(true)).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.biome_colors")).isEnabled())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("sky_colors")).setName((class00392)class00392.L((String)"sodium-extra.option.sky_colors")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.sky_colors.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> {
            SodiumExtraClientMod.options().detailSettings.skyColors = bl;
        }, () -> SodiumExtraClientMod.options().detailSettings.skyColors).setDefaultValue(Boolean.valueOf(true)).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.sky_colors")).isEnabled())));
    }

    private static class00392 fogTypeName(class04798 class047982) {
        String string2 = "sodium-extra.option.fog_type." + class047982.name().toLowerCase();
        class05216 class052162 = class00392.L((String)string2);
        if (!class00390.y((class00392)class052162)) {
            String string3 = Arrays.stream(class047982.name().split("_")).map(string -> string.charAt(0) + string.substring(1).toLowerCase()).collect(Collectors.joining(" ")) + " Fog";
            return class00392.y((String)string3);
        }
        return class052162;
    }

    private static class00392 parseVanillaString(String string) {
        return class00392.y((String)class00392.L((String)string).getString().replaceAll("\u00a7.", ""));
    }

    private static class00392 translatableName(class01894 class018942, String string2) {
        String string3 = class018942.B("options.".concat(string2));
        class05216 class052162 = class00392.L((String)string3);
        if (!class00390.y((class00392)class052162)) {
            class052162 = class00392.y((String)Arrays.stream(string3.substring(string3.lastIndexOf(46) + 1).split("_")).map(string -> string.substring(0, 1).toUpperCase() + string.substring(1)).collect(Collectors.joining(" ")));
        }
        return class052162;
    }

    private OptionPageBuilder createExtraPage(ConfigBuilder configBuilder) {
        return configBuilder.createOptionPage().setName((class00392)class00392.L((String)"sodium-extra.option.extras")).addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("reduce_resolution_on_mac")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.reduce_resolution_on_mac")).isEnabled() && System.getProperty("os.name").toLowerCase().contains("mac")).setName((class00392)class00392.L((String)"sodium-extra.option.reduce_resolution_on_mac")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.reduce_resolution_on_mac.tooltip")).setImpact(OptionImpact.HIGH).setBinding(bl -> {
            SodiumExtraClientMod.options().extraSettings.reduceResolutionOnMac = bl;
        }, () -> SodiumExtraClientMod.options().extraSettings.reduceResolutionOnMac).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setDefaultValue(Boolean.valueOf(false)))).addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createEnumOption(SodiumExtraConfig.id("overlay_corner"), SodiumExtraGameOptions$OverlayCorner.class).setName((class00392)class00392.L((String)"sodium-extra.option.overlay_corner")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.overlay_corner.tooltip")).setDefaultValue((Enum)SodiumExtraGameOptions$OverlayCorner.TOP_LEFT).setBinding(overlayCorner -> {
            SodiumExtraClientMod.options().extraSettings.overlayCorner = overlayCorner;
        }, () -> SodiumExtraClientMod.options().extraSettings.overlayCorner).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options())).addOption((OptionBuilder)configBuilder.createEnumOption(SodiumExtraConfig.id("text_contrast"), SodiumExtraGameOptions$TextContrast.class).setName((class00392)class00392.L((String)"sodium-extra.option.text_contrast")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.text_contrast.tooltip")).setDefaultValue((Enum)SodiumExtraGameOptions$TextContrast.NONE).setBinding(textContrast -> {
            SodiumExtraClientMod.options().extraSettings.textContrast = textContrast;
        }, () -> SodiumExtraClientMod.options().extraSettings.textContrast).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("show_fps")).setName((class00392)class00392.L((String)"sodium-extra.option.show_fps")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.show_fps.tooltip")).setDefaultValue(Boolean.valueOf(false)).setBinding(bl -> {
            SodiumExtraClientMod.options().extraSettings.showFps = bl;
        }, () -> SodiumExtraClientMod.options().extraSettings.showFps).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("show_fps_extended")).setName((class00392)class00392.L((String)"sodium-extra.option.show_fps_extended")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.show_fps_extended.tooltip")).setDefaultValue(Boolean.valueOf(true)).setBinding(bl -> {
            SodiumExtraClientMod.options().extraSettings.showFPSExtended = bl;
        }, () -> SodiumExtraClientMod.options().extraSettings.showFPSExtended).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("show_coordinates")).setName((class00392)class00392.L((String)"sodium-extra.option.show_coordinates")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.show_coordinates.tooltip")).setDefaultValue(Boolean.valueOf(false)).setBinding(bl -> {
            SodiumExtraClientMod.options().extraSettings.showCoords = bl;
        }, () -> SodiumExtraClientMod.options().extraSettings.showCoords).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options())).addOption((OptionBuilder)configBuilder.createIntegerOption(SodiumExtraConfig.id("cloud_height")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.cloud")).isEnabled()).setName((class00392)class00392.L((String)"sodium-extra.option.cloud_height")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.cloud_height.tooltip")).setRange(-64, 319, 1).setDefaultValue(Integer.valueOf(192)).setValueFormatter(ControlValueFormatterImpls.number()).setBinding(n -> {
            SodiumExtraClientMod.options().extraSettings.cloudHeight = n;
        }, () -> SodiumExtraClientMod.options().extraSettings.cloudHeight).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()))).addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("advanced_item_tooltips")).setName((class00392)class00392.L((String)"sodium-extra.option.advanced_item_tooltips")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.advanced_item_tooltips.tooltip")).setStorageHandler(() -> ((class05630)class06202.Nq().i_7).Np()).setBinding(bl -> {
            ((class05630)class06202.Nq().i_7).W = bl;
        }, () -> ((class05630)class06202.Nq().i_7).W).setDefaultValue(Boolean.valueOf(false)))).addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("toasts")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.toasts")).isEnabled()).setName((class00392)class00392.L((String)"sodium-extra.option.toasts")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.toasts.tooltip")).setBinding(bl -> {
            SodiumExtraClientMod.options().extraSettings.toasts = bl;
        }, () -> SodiumExtraClientMod.options().extraSettings.toasts).setDefaultValue(Boolean.valueOf(true)).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("advancement_toast")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.toasts")).isEnabled()).setName((class00392)class00392.L((String)"sodium-extra.option.advancement_toast")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.advancement_toast.tooltip")).setBinding(bl -> {
            SodiumExtraClientMod.options().extraSettings.advancementToast = bl;
        }, () -> SodiumExtraClientMod.options().extraSettings.advancementToast).setDefaultValue(Boolean.valueOf(true)).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("recipe_toast")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.toasts")).isEnabled()).setName((class00392)class00392.L((String)"sodium-extra.option.recipe_toast")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.recipe_toast.tooltip")).setBinding(bl -> {
            SodiumExtraClientMod.options().extraSettings.recipeToast = bl;
        }, () -> SodiumExtraClientMod.options().extraSettings.recipeToast).setDefaultValue(Boolean.valueOf(true)).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("system_toast")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.toasts")).isEnabled()).setName((class00392)class00392.L((String)"sodium-extra.option.system_toast")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.system_toast.tooltip")).setBinding(bl -> {
            SodiumExtraClientMod.options().extraSettings.systemToast = bl;
        }, () -> SodiumExtraClientMod.options().extraSettings.systemToast).setDefaultValue(Boolean.valueOf(true)).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("tutorial_toast")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.toasts")).isEnabled()).setName((class00392)class00392.L((String)"sodium-extra.option.tutorial_toast")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.tutorial_toast.tooltip")).setBinding(bl -> {
            SodiumExtraClientMod.options().extraSettings.tutorialToast = bl;
        }, () -> SodiumExtraClientMod.options().extraSettings.tutorialToast).setDefaultValue(Boolean.valueOf(true)).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()))).addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("instant_sneak")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.instant_sneak")).isEnabled()).setName((class00392)class00392.L((String)"sodium-extra.option.instant_sneak")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.instant_sneak.tooltip")).setBinding(bl -> {
            SodiumExtraClientMod.options().extraSettings.instantSneak = bl;
        }, () -> SodiumExtraClientMod.options().extraSettings.instantSneak).setDefaultValue(Boolean.valueOf(false)).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("prevent_shaders")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.prevent_shaders")).isEnabled()).setName((class00392)class00392.L((String)"sodium-extra.option.prevent_shaders")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.prevent_shaders.tooltip")).setBinding(bl -> {
            SodiumExtraClientMod.options().extraSettings.preventShaders = bl;
        }, () -> SodiumExtraClientMod.options().extraSettings.preventShaders).setFlags(new OptionFlag[]{OptionFlag.REQUIRES_RENDERER_RELOAD}).setDefaultValue(Boolean.valueOf(false)).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()))).addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("steady_debug_hud")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.steady_debug_hud")).isEnabled()).setName((class00392)class00392.L((String)"sodium-extra.option.steady_debug_hud")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.steady_debug_hud.tooltip")).setBinding(bl -> {
            SodiumExtraClientMod.options().extraSettings.steadyDebugHud = bl;
        }, () -> SodiumExtraClientMod.options().extraSettings.steadyDebugHud).setDefaultValue(Boolean.valueOf(true)).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options())).addOption((OptionBuilder)configBuilder.createIntegerOption(SodiumExtraConfig.id("steady_debug_hud_refresh_interval")).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.steady_debug_hud")).isEnabled()).setName((class00392)class00392.L((String)"sodium-extra.option.steady_debug_hud_refresh_interval")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.steady_debug_hud_refresh_interval.tooltip")).setRange(1, 20, 1).setValueFormatter(ControlValueFormatterExtended.ticks()).setDefaultValue(Integer.valueOf(1)).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(n -> {
            SodiumExtraClientMod.options().extraSettings.steadyDebugHudRefreshInterval = n;
        }, () -> SodiumExtraClientMod.options().extraSettings.steadyDebugHudRefreshInterval)));
    }

    private static class00392 translatableTooltip(class01894 class018942, String string) {
        String string2 = class018942.B("options.".concat(string)).concat(".tooltip");
        class05216 class052162 = class00392.L((String)string2);
        if (!class00390.y((class00392)class052162)) {
            class052162 = class00392.N((String)"sodium-extra.option.".concat(string).concat(".tooltips"), (Object[])new Object[]{SodiumExtraConfig.translatableName(class018942, string)});
        }
        return class052162;
    }

    private OptionPageBuilder createParticlesPage(ConfigBuilder configBuilder) {
        OptionGroupBuilder optionGroupBuilder = configBuilder.createOptionGroup();
        class04206.z.M().stream().sorted((class018942, class018943) -> SodiumExtraConfig.translatableName(class018942, "particles").getString().compareToIgnoreCase(SodiumExtraConfig.translatableName(class018943, "particles").getString())).forEach(class018942 -> optionGroupBuilder.addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("particle." + class018942.B("options.particles"))).setName(SodiumExtraConfig.translatableName(class018942, "particles")).setTooltip(SodiumExtraConfig.translatableTooltip(class018942, "particles")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> SodiumExtraClientMod.options().particleSettings.otherMap.put((class01894)class018942, (Boolean)bl), () -> (Boolean)SodiumExtraClientMod.options().particleSettings.otherMap.computeIfAbsent((class01894)class018942, class018942 -> true)).setDefaultValue(Boolean.valueOf(true)).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.particle")).isEnabled())));
        return configBuilder.createOptionPage().setName(SodiumExtraConfig.parseVanillaString("options.particles")).addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("particles_all")).setName(SodiumExtraConfig.parseVanillaString("gui.socialInteractions.tab_all")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.particles_all.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> {
            SodiumExtraClientMod.options().particleSettings.particles = bl;
        }, () -> SodiumExtraClientMod.options().particleSettings.particles).setDefaultValue(Boolean.valueOf(true)).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.particle")).isEnabled()))).addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("rain_splash_particles")).setName(SodiumExtraConfig.parseVanillaString("subtitles.entity.generic.splash")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.rain_splash.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> {
            SodiumExtraClientMod.options().particleSettings.rainSplash = bl;
        }, () -> SodiumExtraClientMod.options().particleSettings.rainSplash).setDefaultValue(Boolean.valueOf(true)).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.particle")).isEnabled())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("block_break_particles")).setName(SodiumExtraConfig.parseVanillaString("subtitles.block.generic.break")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.block_break.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> {
            SodiumExtraClientMod.options().particleSettings.blockBreak = bl;
        }, () -> SodiumExtraClientMod.options().particleSettings.blockBreak).setDefaultValue(Boolean.valueOf(true)).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.particle")).isEnabled())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("block_breaking_particles")).setName(SodiumExtraConfig.parseVanillaString("subtitles.block.generic.hit")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.block_breaking.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> {
            SodiumExtraClientMod.options().particleSettings.blockBreaking = bl;
        }, () -> SodiumExtraClientMod.options().particleSettings.blockBreaking).setDefaultValue(Boolean.valueOf(true)).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.particle")).isEnabled()))).addOptionGroup(optionGroupBuilder);
    }

    private OptionPageBuilder createAnimationsPage(ConfigBuilder configBuilder) {
        return configBuilder.createOptionPage().setName((class00392)class00392.L((String)"sodium-extra.option.animations")).addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("animations_all")).setName(SodiumExtraConfig.parseVanillaString("gui.socialInteractions.tab_all")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.animations_all.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> {
            SodiumExtraClientMod.options().animationSettings.animation = bl;
        }, () -> SodiumExtraClientMod.options().animationSettings.animation).setDefaultValue(Boolean.valueOf(true)).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.animation")).isEnabled()))).addOptionGroup(configBuilder.createOptionGroup().addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("animate_water")).setName(SodiumExtraConfig.parseVanillaString("block.minecraft.water")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.animate_water.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> {
            SodiumExtraClientMod.options().animationSettings.water = bl;
        }, () -> SodiumExtraClientMod.options().animationSettings.water).setDefaultValue(Boolean.valueOf(true)).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.animation")).isEnabled())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("animate_lava")).setName(SodiumExtraConfig.parseVanillaString("block.minecraft.lava")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.animate_lava.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> {
            SodiumExtraClientMod.options().animationSettings.lava = bl;
        }, () -> SodiumExtraClientMod.options().animationSettings.lava).setDefaultValue(Boolean.valueOf(true)).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.animation")).isEnabled())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("animate_fire")).setName(SodiumExtraConfig.parseVanillaString("block.minecraft.fire")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.animate_fire.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> {
            SodiumExtraClientMod.options().animationSettings.fire = bl;
        }, () -> SodiumExtraClientMod.options().animationSettings.fire).setDefaultValue(Boolean.valueOf(true)).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.animation")).isEnabled())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("animate_portal")).setName(SodiumExtraConfig.parseVanillaString("block.minecraft.nether_portal")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.animate_portal.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> {
            SodiumExtraClientMod.options().animationSettings.portal = bl;
        }, () -> SodiumExtraClientMod.options().animationSettings.portal).setDefaultValue(Boolean.valueOf(true)).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.animation")).isEnabled())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("block_animations")).setName((class00392)class00392.L((String)"sodium-extra.option.block_animations")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.block_animations.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> {
            SodiumExtraClientMod.options().animationSettings.blockAnimations = bl;
        }, () -> SodiumExtraClientMod.options().animationSettings.blockAnimations).setDefaultValue(Boolean.valueOf(true)).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.animation")).isEnabled())).addOption((OptionBuilder)configBuilder.createBooleanOption(SodiumExtraConfig.id("animate_sculk_sensor")).setName(SodiumExtraConfig.parseVanillaString("block.minecraft.sculk_sensor")).setTooltip((class00392)class00392.L((String)"sodium-extra.option.animate_sculk_sensor.tooltip")).setStorageHandler((StorageEventHandler)SodiumExtraClientMod.options()).setBinding(bl -> {
            SodiumExtraClientMod.options().animationSettings.sculkSensor = bl;
        }, () -> SodiumExtraClientMod.options().animationSettings.sculkSensor).setDefaultValue(Boolean.valueOf(true)).setEnabled(((Option)SodiumExtraClientMod.mixinConfig().getOptions().get("mixin.animation")).isEnabled())));
    }

    private static /* synthetic */ FogTypeConfig lambda$createRenderPage$70(class04798 class047982) {
        return new FogTypeConfig();
    }

    private static /* synthetic */ FogTypeConfig lambda$createRenderPage$46(class04798 class047982) {
        return new FogTypeConfig();
    }

    private static /* synthetic */ FogTypeConfig lambda$createRenderPage$58(class04798 class047982) {
        return new FogTypeConfig();
    }

    private static /* synthetic */ FogTypeConfig lambda$createRenderPage$62(class04798 class047982) {
        return new FogTypeConfig();
    }

    private static /* synthetic */ FogTypeConfig lambda$createRenderPage$54(class04798 class047982) {
        return new FogTypeConfig();
    }

    private static /* synthetic */ FogTypeConfig lambda$createRenderPage$68(class04798 class047982) {
        return new FogTypeConfig();
    }

    private static /* synthetic */ FogTypeConfig lambda$createRenderPage$50(class04798 class047982) {
        return new FogTypeConfig();
    }

    private static /* synthetic */ FogTypeConfig lambda$createRenderPage$66(class04798 class047982) {
        return new FogTypeConfig();
    }

    public void registerConfigLate(ConfigBuilder configBuilder) {
        configBuilder.registerOwnModOptions().setIcon(class01894.N((String)"sodium-extra:textures/icon.png")).addPage((PageBuilder)this.createAnimationsPage(configBuilder)).addPage((PageBuilder)this.createParticlesPage(configBuilder)).addPage((PageBuilder)this.createDetailsPage(configBuilder)).addPage((PageBuilder)this.createRenderPage(configBuilder)).addPage((PageBuilder)this.createExtraPage(configBuilder)).registerOptionReplacement(class01894.N((String)"sodium:general.vsync"), (OptionBuilder)configBuilder.createEnumOption(class01894.N((String)"sodium:general.vsync"), SodiumExtraGameOptions$VerticalSyncOption.class).setDefaultValue((Enum)SodiumExtraGameOptions$VerticalSyncOption.ON).setName((class00392)class00392.L((String)"options.vsync")).setTooltip((class00392)class00392.y((String)(class00392.L((String)"sodium.options.v_sync.tooltip").getString() + "\n- " + class00392.L((String)"sodium-extra.option.use_adaptive_sync.name").getString() + ": " + class00392.L((String)"sodium-extra.option.use_adaptive_sync.tooltip").getString()))).setBinding(sodiumExtraGameOptions$VerticalSyncOption -> {
            switch (sodiumExtraGameOptions$VerticalSyncOption) {
                case OFF: {
                    SodiumExtraClientMod.options().extraSettings.useAdaptiveSync = false;
                    ((class05630)class06202.Nq().i_7).NN().method_41748((Object)false);
                    break;
                }
                case ON: {
                    SodiumExtraClientMod.options().extraSettings.useAdaptiveSync = false;
                    ((class05630)class06202.Nq().i_7).NN().method_41748((Object)true);
                    break;
                }
                case ADAPTIVE: {
                    SodiumExtraClientMod.options().extraSettings.useAdaptiveSync = true;
                    ((class05630)class06202.Nq().i_7).NN().method_41748((Object)true);
                }
            }
        }, () -> {
            if (((Boolean)((class05630)class06202.Nq().i_7).NN().method_41753()).booleanValue() && !SodiumExtraClientMod.options().extraSettings.useAdaptiveSync) {
                return SodiumExtraGameOptions$VerticalSyncOption.ON;
            }
            if (!((Boolean)((class05630)class06202.Nq().i_7).NN().method_41753()).booleanValue() && !SodiumExtraClientMod.options().extraSettings.useAdaptiveSync) {
                return SodiumExtraGameOptions$VerticalSyncOption.OFF;
            }
            return SodiumExtraGameOptions$VerticalSyncOption.ADAPTIVE;
        }).setStorageHandler(() -> {
            SodiumExtraClientMod.options().afterSave();
            ((class05630)class06202.Nq().i_7).Np();
        }));
    }
}

