/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.viaversion.viafabricplus.util.ChatUtil
 *  minecraft.class00392
 *  minecraft.class05216
 */
package com.viaversion.viafabricplus.api.settings.type;

import com.google.gson.JsonObject;
import com.viaversion.viafabricplus.api.settings.AbstractSetting;
import com.viaversion.viafabricplus.api.settings.SettingGroup;
import com.viaversion.viafabricplus.util.ChatUtil;
import java.util.Arrays;
import minecraft.class00392;
import minecraft.class05216;

public class ModeSetting
extends AbstractSetting<class05216> {
    private final class05216[] options;

    public class05216[] getOptions() {
        return this.options;
    }

    public ModeSetting(SettingGroup settingGroup, class05216 class052162, class05216 ... class05216Array) {
        this(settingGroup, class052162, 0, class05216Array);
    }

    public ModeSetting(SettingGroup settingGroup, class05216 class052162, int n, class05216 ... class05216Array) {
        super(settingGroup, class052162, class05216Array[n]);
        this.options = class05216Array;
    }

    @Override
    public void write(JsonObject jsonObject) {
        jsonObject.addProperty(this.getTranslationKey(), ModeSetting.mapTranslationKey(ChatUtil.uncoverTranslationKey((class00392)((class00392)this.getCurrentValue()))));
    }

    @Override
    public void read(JsonObject jsonObject) {
        String string = jsonObject.get(this.getTranslationKey()).getAsString();
        for (class05216 class052162 : this.options) {
            if (!ModeSetting.mapTranslationKey(ChatUtil.uncoverTranslationKey((class00392)class052162)).equals(string)) continue;
            this.setValue(class052162);
            break;
        }
    }

    @Override
    public void setValue(int n) {
        super.setValue(this.options[n]);
    }

    public int getIndex() {
        return Arrays.stream(this.options).toList().indexOf(this.getValue());
    }
}

