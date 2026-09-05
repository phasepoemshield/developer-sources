/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  de.maxhenkel.voicechat.api.VoicechatPlugin
 *  de.maxhenkel.voicechat.api.VoicechatServerApi
 *  de.maxhenkel.voicechat.net.NetManager
 *  de.maxhenkel.voicechat.permission.PermissionManager
 *  de.maxhenkel.voicechat.plugins.impl.VoicechatServerApiImpl
 *  de.maxhenkel.voicechat.service.Service
 *  minecraft.class02796
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class07049
 *  minecraft.class07701
 *  minecraft.class08036
 */
package de.maxhenkel.voicechat.intercompatibility;

import com.mojang.brigadier.CommandDispatcher;
import de.maxhenkel.voicechat.api.VoicechatPlugin;
import de.maxhenkel.voicechat.api.VoicechatServerApi;
import de.maxhenkel.voicechat.net.NetManager;
import de.maxhenkel.voicechat.permission.PermissionManager;
import de.maxhenkel.voicechat.plugins.impl.VoicechatServerApiImpl;
import de.maxhenkel.voicechat.service.Service;
import java.nio.file.Path;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import minecraft.class02796;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class07049;
import minecraft.class07701;
import minecraft.class08036;

public abstract class CommonCompatibilityManager {
    public static CommonCompatibilityManager INSTANCE = (CommonCompatibilityManager)Service.get(CommonCompatibilityManager.class);

    public abstract Path getGameDirectory();

    public abstract boolean isModLoaded(String var1);

    public void execute(class02796 class027962, Runnable runnable) {
        class027962.execute(runnable);
    }

    public abstract void onServerVoiceChatConnected(Consumer<class04770> var1);

    public abstract PermissionManager createPermissionManager();

    public abstract void onRegisterServerCommands(Consumer<CommandDispatcher<class07701>> var1);

    public abstract void onServerStopping(Consumer<class02796> var1);

    public abstract void onServerStarting(Consumer<class02796> var1);

    public abstract void emitServerVoiceChatConnectedEvent(class04770 var1);

    public abstract void onServerVoiceChatDisconnected(Consumer<UUID> var1);

    public abstract NetManager getNetManager();

    public abstract boolean isDevEnvironment();

    public abstract void onPlayerLoggedOut(Consumer<class04770> var1);

    public VoicechatServerApi getServerApi() {
        return VoicechatServerApiImpl.INSTANCE;
    }

    public abstract String getModVersion();

    public Object createRawApiPlayer(class08036 class080362) {
        return class080362;
    }

    public abstract boolean isDedicatedServer();

    public abstract void onPlayerShow(BiConsumer<class04770, class04770> var1);

    public Object createRawApiLevel(class04782 class047822) {
        return class047822;
    }

    public abstract void onPlayerHide(BiConsumer<class04770, class04770> var1);

    public abstract List<VoicechatPlugin> loadPlugins();

    public Object createRawApiEntity(class07049 class070492) {
        return class070492;
    }

    public abstract void onPlayerLoggedIn(Consumer<class04770> var1);

    public abstract boolean canSee(class04770 var1, class04770 var2);

    public abstract String getModName();

    public abstract void onPlayerCompatibilityCheckSucceeded(Consumer<class04770> var1);

    public abstract void emitServerVoiceChatDisconnectedEvent(UUID var1);

    public abstract void emitPlayerCompatibilityCheckSucceeded(class04770 var1);
}

