/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.viaversion.viafabricplus.api.settings.AbstractSetting
 *  com.viaversion.viafabricplus.api.settings.SettingGroup
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 */
package com.viaversion.viafabricplus.save.impl;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.viaversion.viafabricplus.api.settings.AbstractSetting;
import com.viaversion.viafabricplus.api.settings.SettingGroup;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.save.AbstractSave;
import com.viaversion.viafabricplus.settings.SettingsManager;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import com.viaversion.viafabricplus.util.ChatUtil;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;

public final class SettingsSave
extends AbstractSave {
    private String selectedProtocolVersion;

    public SettingsSave() {
        super("settings");
    }

    @Override
    public void write(JsonObject jsonObject) {
        this.writeSettings(jsonObject);
        jsonObject.addProperty("selected-protocol-version", ProtocolTranslator.getTargetVersion().getName());
    }

    @Override
    public void read(JsonObject jsonObject) {
        for (SettingGroup settingGroup : SettingsManager.INSTANCE.getGroups()) {
            String string = ChatUtil.uncoverTranslationKey(settingGroup.getName());
            JsonObject jsonObject2 = jsonObject.getAsJsonObject(AbstractSetting.mapTranslationKey((String)string));
            if (jsonObject2 == null) continue;
            for (AbstractSetting abstractSetting : settingGroup.getSettings()) {
                if (!jsonObject2.has(abstractSetting.getTranslationKey())) continue;
                abstractSetting.read(jsonObject2);
            }
        }
        if (jsonObject.has("selected-protocol-version")) {
            this.selectedProtocolVersion = jsonObject.get("selected-protocol-version").getAsString();
        }
    }

    public void writeSettings(JsonObject jsonObject) {
        for (SettingGroup settingGroup : SettingsManager.INSTANCE.getGroups()) {
            JsonObject jsonObject2 = new JsonObject();
            for (AbstractSetting abstractSetting : settingGroup.getSettings()) {
                abstractSetting.write(jsonObject2);
            }
            jsonObject.add(AbstractSetting.mapTranslationKey((String)ChatUtil.uncoverTranslationKey(settingGroup.getName())), (JsonElement)jsonObject2);
        }
    }

    public static ProtocolVersion protocolVersionByName(String string) {
        if (string == null) {
            return null;
        }
        if (string.contains("Bedrock")) {
            return BedrockProtocolVersion.bedrockLatest;
        }
        return ProtocolVersion.getClosest((String)string);
    }

    @Override
    public void postInit() {
        if (this.selectedProtocolVersion == null) {
            return;
        }
        if (((Boolean)GeneralSettings.INSTANCE.saveSelectedProtocolVersion.getValue()).booleanValue()) {
            ProtocolVersion protocolVersion = SettingsSave.protocolVersionByName(this.selectedProtocolVersion);
            if (protocolVersion != null) {
                ProtocolTranslator.setTargetVersion(protocolVersion);
            }
        } else {
            ProtocolTranslator.setTargetVersion(ProtocolTranslator.NATIVE_VERSION);
        }
    }
}

