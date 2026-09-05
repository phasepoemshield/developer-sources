/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersionRange
 *  minecraft.class05216
 */
package com.viaversion.viafabricplus.api.settings.type;

import com.google.gson.JsonObject;
import com.viaversion.viafabricplus.ViaFabricPlus;
import com.viaversion.viafabricplus.api.settings.AbstractSetting;
import com.viaversion.viafabricplus.api.settings.SettingGroup;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersionRange;
import minecraft.class05216;

public class VersionedBooleanSetting
extends AbstractSetting<Integer> {
    public static final int AUTO_INDEX = 2;
    public static final int DISABLED_INDEX = 1;
    public static final int ENABLED_INDEX = 0;
    private final ProtocolVersionRange protocolRange;

    public VersionedBooleanSetting(SettingGroup settingGroup, class05216 class052162, ProtocolVersionRange protocolVersionRange) {
        super(settingGroup, class052162, 2);
        this.protocolRange = protocolVersionRange;
    }

    public boolean isEnabled() {
        return this.isEnabled(ViaFabricPlus.getImpl().getTargetVersion());
    }

    public boolean isEnabled(ProtocolVersion protocolVersion) {
        if (this.isAuto()) {
            return this.protocolRange.contains(protocolVersion);
        }
        return (Integer)this.getValue() == 0;
    }

    public boolean isEnabled(Integer n) {
        return this.isEnabled(n, ViaFabricPlus.getImpl().getTargetVersion());
    }

    public boolean isEnabled(Integer n, ProtocolVersion protocolVersion) {
        if (n == 2) {
            return this.protocolRange.contains(protocolVersion);
        }
        return n == 0;
    }

    @Override
    public void write(JsonObject jsonObject) {
        jsonObject.addProperty(this.getTranslationKey(), (Integer)this.getCurrentValue() == 2 ? "auto" : ((Integer)this.getCurrentValue() == 0 ? "enabled" : "disabled"));
    }

    @Override
    public void read(JsonObject jsonObject) {
        String string = jsonObject.get(this.getTranslationKey()).getAsString();
        this.setValue(string.equals("auto") ? 2 : (string.equals("enabled") ? 0 : 1));
    }

    public ProtocolVersionRange getProtocolRange() {
        return this.protocolRange;
    }

    public boolean isAuto() {
        return (Integer)this.getValue() == 2;
    }
}

