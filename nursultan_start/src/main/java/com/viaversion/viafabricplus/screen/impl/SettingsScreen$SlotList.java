/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.ViaFabricPlusImpl
 *  com.viaversion.viafabricplus.api.settings.AbstractSetting
 *  com.viaversion.viafabricplus.api.settings.SettingGroup
 *  com.viaversion.viafabricplus.api.settings.type.BooleanSetting
 *  com.viaversion.viafabricplus.api.settings.type.ButtonSetting
 *  com.viaversion.viafabricplus.api.settings.type.ModeSetting
 *  com.viaversion.viafabricplus.api.settings.type.VersionedBooleanSetting
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class01202
 *  minecraft.class06202
 */
package com.viaversion.viafabricplus.screen.impl;

import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.api.settings.AbstractSetting;
import com.viaversion.viafabricplus.api.settings.SettingGroup;
import com.viaversion.viafabricplus.api.settings.type.BooleanSetting;
import com.viaversion.viafabricplus.api.settings.type.ButtonSetting;
import com.viaversion.viafabricplus.api.settings.type.ModeSetting;
import com.viaversion.viafabricplus.api.settings.type.VersionedBooleanSetting;
import com.viaversion.viafabricplus.screen.VFPList;
import com.viaversion.viafabricplus.screen.impl.settings.BooleanListEntry;
import com.viaversion.viafabricplus.screen.impl.settings.ButtonListEntry;
import com.viaversion.viafabricplus.screen.impl.settings.ModeListEntry;
import com.viaversion.viafabricplus.screen.impl.settings.TitleEntry;
import com.viaversion.viafabricplus.screen.impl.settings.VersionedBooleanListEntry;
import com.viaversion.viafabricplus.settings.SettingsManager;
import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import minecraft.class01202;
import minecraft.class06202;

public class SettingsScreen$SlotList
extends VFPList {
    private static double scrollAmount;

    public SettingsScreen$SlotList(class06202 class062022, int n, int n2, int n3, int n4, int n5) {
        super(class062022, n, n2, n3, n4, n5);
        for (SettingGroup settingGroup : SettingsManager.INSTANCE.getGroups()) {
            this.method_25321((class01202)new TitleEntry(settingGroup.getName()));
            block7: for (AbstractSetting abstractSetting : settingGroup.getSettings()) {
                AbstractSetting abstractSetting2;
                Objects.requireNonNull(abstractSetting);
                int n6 = 0;
                switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{BooleanSetting.class, ButtonSetting.class, ModeSetting.class, VersionedBooleanSetting.class}, (Object)abstractSetting2, (int)n6)) {
                    case 0: {
                        BooleanSetting booleanSetting = (BooleanSetting)abstractSetting2;
                        this.method_25321((class01202)new BooleanListEntry(booleanSetting));
                        continue block7;
                    }
                    case 1: {
                        ButtonSetting buttonSetting = (ButtonSetting)abstractSetting2;
                        this.method_25321((class01202)new ButtonListEntry(buttonSetting));
                        continue block7;
                    }
                    case 2: {
                        ModeSetting modeSetting = (ModeSetting)abstractSetting2;
                        this.method_25321((class01202)new ModeListEntry(modeSetting));
                        continue block7;
                    }
                    case 3: {
                        VersionedBooleanSetting versionedBooleanSetting = (VersionedBooleanSetting)abstractSetting2;
                        this.method_25321((class01202)new VersionedBooleanListEntry(versionedBooleanSetting));
                        continue block7;
                    }
                }
                ViaFabricPlusImpl.INSTANCE.getLogger().warn("Unknown setting type: {}", (Object)abstractSetting.getClass().getName());
            }
        }
        this.initScrollY(scrollAmount);
    }

    @Override
    public void updateSlotAmount(double d) {
        scrollAmount = d;
    }

    public int method_25322() {
        return super.method_25322() + 140;
    }
}

