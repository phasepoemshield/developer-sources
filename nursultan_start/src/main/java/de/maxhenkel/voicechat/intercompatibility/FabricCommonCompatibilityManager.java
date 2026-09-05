/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  de.maxhenkel.voicechat.api.VoicechatPlugin
 *  de.maxhenkel.voicechat.events.PlayerEvents
 *  de.maxhenkel.voicechat.events.ServerVoiceChatEvents
 *  de.maxhenkel.voicechat.events.VanishEvents
 *  de.maxhenkel.voicechat.integration.vanish.VanishIntegration
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  minecraft.class02796
 *  minecraft.class04770
 *  minecraft.class07701
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.entrypoint.EntrypointContainer
 */
package de.maxhenkel.voicechat.intercompatibility;

import com.mojang.brigadier.CommandDispatcher;
import de.maxhenkel.voicechat.api.VoicechatPlugin;
import de.maxhenkel.voicechat.events.PlayerEvents;
import de.maxhenkel.voicechat.events.ServerVoiceChatEvents;
import de.maxhenkel.voicechat.events.VanishEvents;
import de.maxhenkel.voicechat.integration.vanish.VanishIntegration;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.net.FabricNetManager;
import de.maxhenkel.voicechat.net.NetManager;
import de.maxhenkel.voicechat.permission.FabricPermissionManager;
import de.maxhenkel.voicechat.permission.PermissionManager;
import java.nio.file.Path;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import minecraft.class02796;
import minecraft.class04770;
import minecraft.class07701;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.entrypoint.EntrypointContainer;

public class FabricCommonCompatibilityManager
extends CommonCompatibilityManager {
    private FabricNetManager netManager;

    public Path getGameDirectory() {
        return FabricLoader.getInstance().getGameDir();
    }

    public boolean isModLoaded(String string) {
        return FabricLoader.getInstance().isModLoaded(string);
    }

    public void onServerVoiceChatConnected(Consumer<class04770> consumer) {
        ServerVoiceChatEvents.VOICECHAT_CONNECTED.register(consumer);
    }

    public PermissionManager createPermissionManager() {
        return new FabricPermissionManager();
    }

    public void onRegisterServerCommands(Consumer<CommandDispatcher<class07701>> consumer) {
        CommandRegistrationCallback.EVENT.register((commandDispatcher, class043482, class076712) -> consumer.accept(commandDispatcher));
    }

    public void onServerStopping(Consumer<class02796> consumer) {
        ServerLifecycleEvents.SERVER_STOPPING.register(consumer::accept);
    }

    public void onServerStarting(Consumer<class02796> consumer) {
        ServerLifecycleEvents.SERVER_STARTED.register(consumer::accept);
    }

    public void emitServerVoiceChatConnectedEvent(class04770 class047702) {
        ((Consumer)ServerVoiceChatEvents.VOICECHAT_CONNECTED.invoker()).accept(class047702);
    }

    public void onServerVoiceChatDisconnected(Consumer<UUID> consumer) {
        ServerVoiceChatEvents.VOICECHAT_DISCONNECTED.register(consumer);
    }

    public NetManager getNetManager() {
        if (this.netManager == null) {
            this.netManager = new FabricNetManager();
        }
        return this.netManager;
    }

    public boolean isDevEnvironment() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    public void onPlayerLoggedOut(Consumer<class04770> consumer) {
        PlayerEvents.PLAYER_LOGGED_OUT.register(consumer);
    }

    public String getModVersion() {
        ModContainer modContainer = FabricLoader.getInstance().getModContainer("voicechat").orElse(null);
        if (modContainer == null) {
            return "N/A";
        }
        return modContainer.getMetadata().getVersion().getFriendlyString();
    }

    public boolean isDedicatedServer() {
        return FabricLoader.getInstance().getEnvironmentType().equals((Object)EnvType.SERVER);
    }

    public void onPlayerShow(BiConsumer<class04770, class04770> biConsumer) {
        VanishEvents.ON_UNVANISH.register(biConsumer);
    }

    public void onPlayerHide(BiConsumer<class04770, class04770> biConsumer) {
        VanishEvents.ON_VANISH.register(biConsumer);
    }

    public List<VoicechatPlugin> loadPlugins() {
        return FabricLoader.getInstance().getEntrypointContainers("voicechat", VoicechatPlugin.class).stream().map(EntrypointContainer::getEntrypoint).collect(Collectors.toList());
    }

    public void onPlayerLoggedIn(Consumer<class04770> consumer) {
        PlayerEvents.PLAYER_LOGGED_IN.register(consumer);
    }

    public boolean canSee(class04770 class047702, class04770 class047703) {
        return VanishIntegration.canSee((class04770)class047702, (class04770)class047703);
    }

    public String getModName() {
        ModContainer modContainer = FabricLoader.getInstance().getModContainer("voicechat").orElse(null);
        if (modContainer == null) {
            return "voicechat";
        }
        return modContainer.getMetadata().getName();
    }

    public void onPlayerCompatibilityCheckSucceeded(Consumer<class04770> consumer) {
        ServerVoiceChatEvents.VOICECHAT_COMPATIBILITY_CHECK_SUCCEEDED.register(consumer);
    }

    public void emitServerVoiceChatDisconnectedEvent(UUID uUID) {
        ((Consumer)ServerVoiceChatEvents.VOICECHAT_DISCONNECTED.invoker()).accept(uUID);
    }

    public void emitPlayerCompatibilityCheckSucceeded(class04770 class047702) {
        ((Consumer)ServerVoiceChatEvents.VOICECHAT_COMPATIBILITY_CHECK_SUCCEEDED.invoker()).accept(class047702);
    }
}

