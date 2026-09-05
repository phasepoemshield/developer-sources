/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.util.ChatUtil
 *  minecraft.class00392
 */
package com.viaversion.viafabricplus.api.settings;

import com.viaversion.viafabricplus.api.settings.AbstractSetting;
import com.viaversion.viafabricplus.util.ChatUtil;
import java.util.ArrayList;
import java.util.List;
import minecraft.class00392;

public class SettingGroup {
    private final List<AbstractSetting<?>> settings = new ArrayList();
    private final class00392 name;

    public SettingGroup(class00392 class003922) {
        this.name = class003922;
    }

    public class00392 getName() {
        return this.name;
    }

    public List<AbstractSetting<?>> getSettings() {
        return this.settings;
    }

    public AbstractSetting<?> getSetting(String string) {
        for (AbstractSetting<?> abstractSetting : this.settings) {
            if (!ChatUtil.uncoverTranslationKey((class00392)abstractSetting.getName()).equals(string)) continue;
            return abstractSetting;
        }
        return null;
    }
}

