/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.protocoltranslator.translator.ItemTranslator
 *  com.viaversion.viafabricplus.save.SaveManager
 *  com.viaversion.viafabricplus.screen.impl.ProtocolSelectionScreen
 *  com.viaversion.viafabricplus.screen.impl.SettingsScreen
 *  com.viaversion.viafabricplus.settings.SettingsManager
 *  com.viaversion.viafabricplus.util.ChatUtil
 *  com.viaversion.viafabricplus.util.ClassLoaderPriorityUtil
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  io.netty.channel.Channel
 *  minecraft.class00392
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
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.entrypoint.EntrypointContainer
 *  net.fabricmc.loader.api.metadata.ModMetadata
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.viaversion.viafabricplus;

import com.viaversion.viafabricplus.ViaFabricPlus;
import com.viaversion.viafabricplus.api.ViaFabricPlusBase;
import com.viaversion.viafabricplus.api.entrypoint.ViaFabricPlusLoadEntrypoint;
import com.viaversion.viafabricplus.api.events.ChangeProtocolVersionCallback;
import com.viaversion.viafabricplus.api.events.LoadingCycleCallback;
import com.viaversion.viafabricplus.api.settings.SettingGroup;
import com.viaversion.viafabricplus.base.Events;
import com.viaversion.viafabricplus.base.sync_tasks.SyncTasks;
import com.viaversion.viafabricplus.features.FeaturesLoading;
import com.viaversion.viafabricplus.features.item.filter_creative_tabs.VersionedRegistries;
import com.viaversion.viafabricplus.features.item.negative_item_count.NegativeItemUtil;
import com.viaversion.viafabricplus.features.limitation.max_chat_length.MaxChatLength;
import com.viaversion.viafabricplus.injection.access.base.IConnection;
import com.viaversion.viafabricplus.injection.access.base.IServerData;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.protocoltranslator.translator.ItemTranslator;
import com.viaversion.viafabricplus.save.SaveManager;
import com.viaversion.viafabricplus.screen.impl.ProtocolSelectionScreen;
import com.viaversion.viafabricplus.screen.impl.SettingsScreen;
import com.viaversion.viafabricplus.settings.SettingsManager;
import com.viaversion.viafabricplus.util.ChatUtil;
import com.viaversion.viafabricplus.util.ClassLoaderPriorityUtil;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import io.netty.channel.Channel;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
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
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.entrypoint.EntrypointContainer;
import net.fabricmc.loader.api.metadata.ModMetadata;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ViaFabricPlusImpl
implements ViaFabricPlusBase {
    public static final ViaFabricPlusImpl INSTANCE = new ViaFabricPlusImpl();
    private final Logger logger = LogManager.getLogger((String)"ViaFabricPlus");
    private final Path path = FabricLoader.getInstance().getConfigDir().resolve("viafabricplus");
    private String version;
    private String implVersion;
    private CompletableFuture<Void> loadingFuture;

    public void init() {
        ViaFabricPlus.init(INSTANCE);
        ModMetadata modMetadata = ((ModContainer)FabricLoader.getInstance().getModContainer("viafabricplus").get()).getMetadata();
        this.version = modMetadata.getVersion().getFriendlyString();
        this.implVersion = modMetadata.getCustomValue("vfp:implVersion").getAsString();
        for (EntrypointContainer entrypointContainer : FabricLoader.getInstance().getEntrypointContainers("viafabricplus", ViaFabricPlusLoadEntrypoint.class)) {
            ((ViaFabricPlusLoadEntrypoint)entrypointContainer.getEntrypoint()).onPlatformLoad(INSTANCE);
        }
        try {
            Files.createDirectories(this.path, new FileAttribute[0]);
        }
        catch (IOException iOException) {
            this.logger.error("Failed to create ViaFabricPlus directory", (Throwable)iOException);
        }
        ClassLoaderPriorityUtil.loadOverridingJars((Path)this.path, (Logger)this.logger);
        SettingsManager.INSTANCE.init();
        SaveManager.INSTANCE.init();
        SyncTasks.init();
        FeaturesLoading.init();
        this.loadingFuture = ProtocolTranslator.init((Path)this.path);
        Events.LOADING_CYCLE.register(loadingCycle -> {
            if (loadingCycle != LoadingCycleCallback.LoadingCycle.POST_GAME_LOAD) {
                return;
            }
            this.loadingFuture.join();
            FeaturesLoading.postInit();
            SaveManager.INSTANCE.postInit();
        });
        ((LoadingCycleCallback)Events.LOADING_CYCLE.invoker()).onLoadCycle(LoadingCycleCallback.LoadingCycle.FINAL_LOAD);
    }

    public Logger getLogger() {
        return this.logger;
    }

    @Override
    public Path getPath() {
        return this.path;
    }

    @Override
    public String getVersion() {
        return this.version;
    }

    @Override
    public List<SettingGroup> getSettingGroups() {
        return Collections.unmodifiableList(SettingsManager.INSTANCE.getGroups());
    }

    @Override
    public class06584 translateItem(Item item, ProtocolVersion protocolVersion) {
        return ItemTranslator.viaToMc((Item)item, (ProtocolVersion)protocolVersion);
    }

    @Override
    public Item translateItem(class06584 class065842, ProtocolVersion protocolVersion) {
        return ItemTranslator.mcToVia((class06584)class065842, (ProtocolVersion)protocolVersion);
    }

    @Override
    public void addSettingGroup(SettingGroup settingGroup) {
        SettingsManager.INSTANCE.addGroup(new SettingGroup[]{settingGroup});
    }

    @Override
    public boolean effectExists(class03556<class07084> class035562, ProtocolVersion protocolVersion) {
        return VersionedRegistries.containsEffect(class035562, protocolVersion);
    }

    @Override
    public String getImplVersion() {
        return this.implVersion;
    }

    @Override
    public int getMaxChatLength(ProtocolVersion protocolVersion) {
        return MaxChatLength.getChatLength();
    }

    @Override
    public SettingGroup getSettingGroup(String string) {
        for (SettingGroup settingGroup : SettingsManager.INSTANCE.getGroups()) {
            if (!ChatUtil.uncoverTranslationKey((class00392)settingGroup.getName()).equals(string)) continue;
            return settingGroup;
        }
        return null;
    }

    @Override
    public boolean enchantmentExists(class05946<class07304> class059462, ProtocolVersion protocolVersion) {
        return VersionedRegistries.containsEnchantment(class059462, protocolVersion);
    }

    @Override
    public UserConnection getUserConnection(class00642 class006422) {
        return ((IConnection)class006422).viaFabricPlus$getUserConnection();
    }

    @Override
    public void openSettingsScreen(class05096 class050962) {
        SettingsScreen.INSTANCE.open(class050962);
    }

    @Override
    public int getStackCount(class06584 class065842) {
        return NegativeItemUtil.getCount(class065842);
    }

    @Override
    public void setTargetVersion(ProtocolVersion protocolVersion) {
        ProtocolTranslator.setTargetVersion((ProtocolVersion)protocolVersion);
    }

    @Override
    public void setTargetVersion(ProtocolVersion protocolVersion, boolean bl) {
        ProtocolTranslator.setTargetVersion((ProtocolVersion)protocolVersion, (boolean)bl);
    }

    @Override
    public ProtocolVersion getServerVersion(class04568 class045682) {
        return ((IServerData)class045682).viaFabricPlus$forcedVersion();
    }

    @Override
    public ProtocolVersion getTargetVersion(Channel channel) {
        return ProtocolTranslator.getTargetVersion((Channel)channel);
    }

    @Override
    public ProtocolVersion getTargetVersion(class00642 class006422) {
        return ((IConnection)class006422).viaFabricPlus$getTargetVersion();
    }

    @Override
    public ProtocolVersion getTargetVersion() {
        return ProtocolTranslator.getTargetVersion();
    }

    @Override
    public UserConnection getPlayNetworkUserConnection() {
        return ProtocolTranslator.getPlayNetworkUserConnection();
    }

    @Override
    public boolean bannerPatternExists(class05946<class00412> class059462, ProtocolVersion protocolVersion) {
        return VersionedRegistries.containsBannerPattern(class059462, protocolVersion);
    }

    @Override
    public boolean itemExistsInConnection(class06584 class065842) {
        return VersionedRegistries.keepItem(class065842);
    }

    @Override
    public boolean itemExistsInConnection(class06581 class065812) {
        return VersionedRegistries.keepItem(class065812);
    }

    @Override
    public void registerOnChangeProtocolVersionCallback(ChangeProtocolVersionCallback changeProtocolVersionCallback) {
        Events.CHANGE_PROTOCOL_VERSION.register((Object)changeProtocolVersionCallback);
    }

    @Override
    public boolean itemExists(class06581 class065812, ProtocolVersion protocolVersion) {
        return VersionedRegistries.containsItem(class065812, protocolVersion);
    }

    @Override
    public void openProtocolSelectionScreen(class05096 class050962) {
        ProtocolSelectionScreen.INSTANCE.open(class050962);
    }

    @Override
    public void registerLoadingCycleCallback(LoadingCycleCallback loadingCycleCallback) {
        Events.LOADING_CYCLE.register((Object)loadingCycleCallback);
    }
}

