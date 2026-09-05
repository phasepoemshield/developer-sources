/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package com.terraformersmc.modmenu.util.mod;

import com.terraformersmc.modmenu.api.UpdateChannel;
import com.terraformersmc.modmenu.api.UpdateInfo;
import com.terraformersmc.modmenu.util.VersionUtil;
import minecraft.class00392;

public record ModrinthUpdateInfo(String projectId, String versionId, String versionNumber, UpdateChannel getUpdateChannel) implements UpdateInfo
{
    private static final class00392 MODRINTH_TEXT = class00392.L((String)"modmenu.modrinth");

    @Override
    public boolean isUpdateAvailable() {
        return true;
    }

    @Override
    public String getDownloadLink() {
        return "https://modrinth.com/project/%s/version/%s".formatted(new Object[]{this.projectId, this.versionId});
    }

    @Override
    public class00392 getUpdateMessage() {
        return class00392.N((String)"modmenu.updateText", (Object[])new Object[]{VersionUtil.stripPrefix(this.versionNumber), MODRINTH_TEXT});
    }
}

