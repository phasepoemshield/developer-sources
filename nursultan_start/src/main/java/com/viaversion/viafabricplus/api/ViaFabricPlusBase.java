/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  io.netty.channel.Channel
 *  minecraft.class00412
 *  minecraft.class00642
 *  minecraft.class03556
 *  minecraft.class04568
 *  minecraft.class05096
 *  minecraft.class05946
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07084
 *  minecraft.class07304
 */
package com.viaversion.viafabricplus.api;

import com.viaversion.viafabricplus.api.events.ChangeProtocolVersionCallback;
import com.viaversion.viafabricplus.api.events.LoadingCycleCallback;
import com.viaversion.viafabricplus.api.settings.SettingGroup;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import io.netty.channel.Channel;
import java.nio.file.Path;
import java.util.List;
import minecraft.class00412;
import minecraft.class00642;
import minecraft.class03556;
import minecraft.class04568;
import minecraft.class05096;
import minecraft.class05946;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07084;
import minecraft.class07304;

public interface ViaFabricPlusBase {
    public Path getPath();

    public String getVersion();

    public List<SettingGroup> getSettingGroups();

    public Item translateItem(class06584 var1, ProtocolVersion var2);

    public class06584 translateItem(Item var1, ProtocolVersion var2);

    public void addSettingGroup(SettingGroup var1);

    public boolean effectExists(class03556<class07084> var1, ProtocolVersion var2);

    public String getImplVersion();

    public int getMaxChatLength(ProtocolVersion var1);

    public SettingGroup getSettingGroup(String var1);

    public boolean enchantmentExists(class05946<class07304> var1, ProtocolVersion var2);

    public UserConnection getUserConnection(class00642 var1);

    public void openSettingsScreen(class05096 var1);

    public int getStackCount(class06584 var1);

    public void setTargetVersion(ProtocolVersion var1, boolean var2);

    public void setTargetVersion(ProtocolVersion var1);

    public ProtocolVersion getServerVersion(class04568 var1);

    public ProtocolVersion getTargetVersion(class00642 var1);

    public ProtocolVersion getTargetVersion();

    public ProtocolVersion getTargetVersion(Channel var1);

    public UserConnection getPlayNetworkUserConnection();

    public boolean bannerPatternExists(class05946<class00412> var1, ProtocolVersion var2);

    public boolean itemExistsInConnection(class06584 var1);

    public boolean itemExistsInConnection(class06581 var1);

    public void registerOnChangeProtocolVersionCallback(ChangeProtocolVersionCallback var1);

    public boolean itemExists(class06581 var1, ProtocolVersion var2);

    default public int apiVersion() {
        return 6;
    }

    public void openProtocolSelectionScreen(class05096 var1);

    public void registerLoadingCycleCallback(LoadingCycleCallback var1);
}

