/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.configbuilder.entry.BooleanConfigEntry
 *  de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry
 *  de.maxhenkel.voicechat.configbuilder.entry.DoubleConfigEntry
 *  de.maxhenkel.voicechat.voice.client.GroupPlayerIconOrientation
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  me.shedaniel.clothconfig2.api.ConfigBuilder
 *  me.shedaniel.clothconfig2.api.ConfigCategory
 *  me.shedaniel.clothconfig2.api.ConfigEntryBuilder
 *  me.shedaniel.clothconfig2.impl.builders.DoubleFieldBuilder
 *  me.shedaniel.clothconfig2.impl.builders.IntFieldBuilder
 *  minecraft.class00392
 *  minecraft.class05096
 *  minecraft.class05216
 */
package de.maxhenkel.voicechat.integration.clothconfig;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.configbuilder.entry.BooleanConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.DoubleConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.IntegerConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.StringConfigEntry;
import de.maxhenkel.voicechat.integration.freecam.FreecamMode;
import de.maxhenkel.voicechat.voice.client.GroupPlayerIconOrientation;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import me.shedaniel.clothconfig2.impl.builders.DoubleFieldBuilder;
import me.shedaniel.clothconfig2.impl.builders.IntFieldBuilder;
import minecraft.class00392;
import minecraft.class05096;
import minecraft.class05216;

public class ClothConfigIntegration {
    public static final class05216 SETTINGS = class00392.L((String)"cloth_config.voicechat.settings");
    public static final class05216 OTHER_SETTINGS = class00392.L((String)"cloth_config.voicechat.category.ingame_menu");

    protected static <T> AbstractConfigListEntry<T> fromConfigEntry(ConfigEntryBuilder configEntryBuilder, ConfigEntry<T> configEntry) {
        class05216 class052162 = class00392.L((String)String.format("cloth_config.voicechat.config.%s", configEntry.getKey()));
        class05216 class052163 = class00392.L((String)String.format("cloth_config.voicechat.config.%s.description", configEntry.getKey()));
        if (configEntry instanceof DoubleConfigEntry) {
            DoubleConfigEntry doubleConfigEntry = (DoubleConfigEntry)configEntry;
            return ((DoubleFieldBuilder)((DoubleFieldBuilder)configEntryBuilder.startDoubleField((class00392)class052162, ((Double)doubleConfigEntry.get()).doubleValue()).setTooltip(new class00392[]{class052163}).setMin((Object)((Double)doubleConfigEntry.getMin()))).setMax((Object)((Double)doubleConfigEntry.getMax()))).setDefaultValue(() -> ((DoubleConfigEntry)doubleConfigEntry).getDefault()).setSaveConsumer(d -> {
                doubleConfigEntry.set(d);
                doubleConfigEntry.save();
            }).build();
        }
        if (configEntry instanceof IntegerConfigEntry) {
            IntegerConfigEntry integerConfigEntry = (IntegerConfigEntry)configEntry;
            return ((IntFieldBuilder)((IntFieldBuilder)configEntryBuilder.startIntField((class00392)class052162, ((Integer)integerConfigEntry.get()).intValue()).setTooltip(new class00392[]{class052163}).setMin((Object)((Integer)integerConfigEntry.getMin()))).setMax((Object)((Integer)integerConfigEntry.getMax()))).setDefaultValue(() -> ((IntegerConfigEntry)integerConfigEntry).getDefault()).setSaveConsumer(n -> integerConfigEntry.set(n).save()).build();
        }
        if (configEntry instanceof BooleanConfigEntry) {
            BooleanConfigEntry booleanConfigEntry = (BooleanConfigEntry)configEntry;
            return configEntryBuilder.startBooleanToggle((class00392)class052162, ((Boolean)booleanConfigEntry.get()).booleanValue()).setTooltip(new class00392[]{class052163}).setDefaultValue(() -> ((BooleanConfigEntry)booleanConfigEntry).getDefault()).setSaveConsumer(bl -> booleanConfigEntry.set(bl).save()).build();
        }
        if (configEntry instanceof StringConfigEntry) {
            StringConfigEntry stringConfigEntry = (StringConfigEntry)configEntry;
            return configEntryBuilder.startStrField((class00392)class052162, (String)stringConfigEntry.get()).setTooltip(new class00392[]{class052163}).setDefaultValue(() -> ((StringConfigEntry)stringConfigEntry).getDefault()).setSaveConsumer(string -> stringConfigEntry.set(string).save()).build();
        }
        throw new IllegalArgumentException("Unknown config entry type %s".formatted(new Object[]{configEntry.getClass().getName()}));
    }

    public static class05096 createConfigScreen(class05096 class050962) {
        ConfigBuilder configBuilder = ConfigBuilder.create().setParentScreen(class050962).setTitle((class00392)SETTINGS);
        ConfigEntryBuilder configEntryBuilder = configBuilder.entryBuilder();
        ConfigCategory configCategory = configBuilder.getOrCreateCategory((class00392)class00392.L((String)"cloth_config.voicechat.category.general"));
        configCategory.addEntry(ClothConfigIntegration.fromConfigEntry(configEntryBuilder, VoicechatClient.CLIENT_CONFIG.recordingDestination));
        configCategory.addEntry(ClothConfigIntegration.fromConfigEntry(configEntryBuilder, VoicechatClient.CLIENT_CONFIG.runLocalServer));
        configCategory.addEntry(ClothConfigIntegration.fromConfigEntry(configEntryBuilder, VoicechatClient.CLIENT_CONFIG.offlinePlayerVolumeAdjustment));
        configCategory.addEntry((AbstractConfigListEntry)configEntryBuilder.startEnumSelector((class00392)class00392.L((String)"cloth_config.voicechat.config.freecam_mode"), FreecamMode.class, (Enum)((FreecamMode)((Object)VoicechatClient.CLIENT_CONFIG.freecamMode.get()))).setEnumNameProvider(enum_ -> class00392.L((String)String.format("cloth_config.voicechat.config.freecam_mode.%s", enum_.name().toLowerCase()))).setTooltip(new class00392[]{class00392.L((String)"cloth_config.voicechat.config.freecam_mode.description")}).setDefaultValue(() -> ((ConfigEntry)VoicechatClient.CLIENT_CONFIG.freecamMode).getDefault()).setSaveConsumer(freecamMode -> VoicechatClient.CLIENT_CONFIG.freecamMode.set((Object)freecamMode).save()).build());
        configCategory.addEntry(ClothConfigIntegration.fromConfigEntry(configEntryBuilder, VoicechatClient.CLIENT_CONFIG.muteOnJoin));
        ConfigCategory configCategory2 = configBuilder.getOrCreateCategory((class00392)class00392.L((String)"cloth_config.voicechat.category.audio"));
        configCategory2.addEntry(ClothConfigIntegration.fromConfigEntry(configEntryBuilder, VoicechatClient.CLIENT_CONFIG.audioPacketThreshold));
        configCategory2.addEntry(ClothConfigIntegration.fromConfigEntry(configEntryBuilder, VoicechatClient.CLIENT_CONFIG.voiceDeactivationDelay));
        configCategory2.addEntry(ClothConfigIntegration.fromConfigEntry(configEntryBuilder, VoicechatClient.CLIENT_CONFIG.pttDeactivationDelay));
        configCategory2.addEntry(ClothConfigIntegration.fromConfigEntry(configEntryBuilder, VoicechatClient.CLIENT_CONFIG.outputBufferSize));
        ConfigCategory configCategory3 = configBuilder.getOrCreateCategory((class00392)class00392.L((String)"cloth_config.voicechat.category.hud_icons"));
        configCategory3.addEntry(ClothConfigIntegration.fromConfigEntry(configEntryBuilder, VoicechatClient.CLIENT_CONFIG.showNametagIcons));
        configCategory3.addEntry(ClothConfigIntegration.fromConfigEntry(configEntryBuilder, VoicechatClient.CLIENT_CONFIG.showHudIcons));
        configCategory3.addEntry(ClothConfigIntegration.fromConfigEntry(configEntryBuilder, VoicechatClient.CLIENT_CONFIG.hudIconScale));
        configCategory3.addEntry(ClothConfigIntegration.fromConfigEntry(configEntryBuilder, VoicechatClient.CLIENT_CONFIG.hudIconPosX));
        configCategory3.addEntry(ClothConfigIntegration.fromConfigEntry(configEntryBuilder, VoicechatClient.CLIENT_CONFIG.hudIconPosY));
        configCategory3.addEntry((AbstractConfigListEntry)configEntryBuilder.startEnumSelector((class00392)class00392.L((String)"cloth_config.voicechat.config.group_player_icon_orientation"), GroupPlayerIconOrientation.class, (Enum)((GroupPlayerIconOrientation)VoicechatClient.CLIENT_CONFIG.groupPlayerIconOrientation.get())).setEnumNameProvider(enum_ -> class00392.L((String)String.format("cloth_config.voicechat.config.group_player_icon_orientation.%s", enum_.name().toLowerCase()))).setTooltip(new class00392[]{class00392.L((String)"cloth_config.voicechat.config.group_player_icon_orientation.description")}).setDefaultValue(() -> ((ConfigEntry)VoicechatClient.CLIENT_CONFIG.groupPlayerIconOrientation).getDefault()).setSaveConsumer(groupPlayerIconOrientation -> VoicechatClient.CLIENT_CONFIG.groupPlayerIconOrientation.set(groupPlayerIconOrientation).save()).build());
        configCategory3.addEntry(ClothConfigIntegration.fromConfigEntry(configEntryBuilder, VoicechatClient.CLIENT_CONFIG.groupHudIconScale));
        configCategory3.addEntry(ClothConfigIntegration.fromConfigEntry(configEntryBuilder, VoicechatClient.CLIENT_CONFIG.groupPlayerIconPosX));
        configCategory3.addEntry(ClothConfigIntegration.fromConfigEntry(configEntryBuilder, VoicechatClient.CLIENT_CONFIG.groupPlayerIconPosY));
        configCategory3.addEntry(ClothConfigIntegration.fromConfigEntry(configEntryBuilder, VoicechatClient.CLIENT_CONFIG.showOwnGroupIcon));
        configBuilder.getOrCreateCategory((class00392)OTHER_SETTINGS);
        return configBuilder.build();
    }
}

