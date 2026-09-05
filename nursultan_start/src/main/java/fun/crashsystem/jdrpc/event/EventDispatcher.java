/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.util.JsonUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package fun.crashsystem.jdrpc.event;

import fun.crashsystem.jdrpc.entity.User;
import fun.crashsystem.jdrpc.event.DiscordEventListener;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject;
import fun.crashsystem.jdrpc.util.JsonUtils;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class EventDispatcher {
    private static Logger log = LogManager.getLogger((String)"fun.crashsystem.jdrpc.event.EventDispatcher");
    private final List<DiscordEventListener> listeners = new CopyOnWriteArrayList<DiscordEventListener>();

    public void removeListener(DiscordEventListener discordEventListener) {
        this.listeners.remove(discordEventListener);
    }

    private void notifyListeners(String string, ListenerCallback listenerCallback) {
        for (DiscordEventListener discordEventListener : this.listeners) {
            try {
                listenerCallback.accept(discordEventListener);
            }
            catch (Exception exception) {
                log.warn("Error in listener for event {}", (Object)string, (Object)exception);
            }
        }
    }

    public void addListener(DiscordEventListener discordEventListener) {
        this.listeners.add(discordEventListener);
    }

    public void dispatch(String string, JsonObject jsonObject) {
        switch (string) {
            case "ACTIVITY_JOIN": {
                JsonUtils.optString((JsonObject)jsonObject, (String)"secret").ifPresent(arg_0 -> this.lambda$dispatch$4(string, arg_0));
                break;
            }
            case "ACTIVITY_SPECTATE": {
                JsonUtils.optString((JsonObject)jsonObject, (String)"secret").ifPresent(arg_0 -> this.lambda$dispatch$6(string, arg_0));
                break;
            }
            case "ACTIVITY_JOIN_REQUEST": {
                JsonUtils.optObject((JsonObject)jsonObject, (String)"user").ifPresent(arg_0 -> this.lambda$dispatch$8(string, arg_0));
                break;
            }
            default: {
                log.debug("Unknown event type: {}", (Object)string);
            }
        }
    }

    private static void lambda$dispatchDisconnect$2(int n, String string, DiscordEventListener discordEventListener) throws Exception {
        discordEventListener.onDisconnect(n, string);
    }

    public void dispatchReady(User user) {
        this.notifyListeners("READY", arg_0 -> EventDispatcher.lambda$dispatchReady$0(user, arg_0));
    }

    public void dispatchDisconnect(int n, String string) {
        this.notifyListeners("DISCONNECT", arg_0 -> EventDispatcher.lambda$dispatchDisconnect$2(n, string, arg_0));
    }

    private static void lambda$dispatch$7(User user, DiscordEventListener discordEventListener) throws Exception {
        discordEventListener.onActivityJoinRequest(user);
    }

    private static void lambda$dispatch$5(String string, DiscordEventListener discordEventListener) throws Exception {
        discordEventListener.onActivitySpectate(string);
    }

    public void dispatchClose() {
        this.notifyListeners("CLOSE", DiscordEventListener::onClose);
    }

    private void lambda$dispatch$4(String string, String string2) {
        this.notifyListeners(string, arg_0 -> EventDispatcher.lambda$dispatch$3(string2, arg_0));
    }

    private void lambda$dispatch$6(String string, String string2) {
        this.notifyListeners(string, arg_0 -> EventDispatcher.lambda$dispatch$5(string2, arg_0));
    }

    private void lambda$dispatch$8(String string, JsonObject jsonObject) {
        try {
            User user = User.fromJson(jsonObject);
            this.notifyListeners(string, arg_0 -> EventDispatcher.lambda$dispatch$7(user, arg_0));
        }
        catch (RuntimeException runtimeException) {
            log.warn("Failed to parse user payload for event {}", (Object)string, (Object)runtimeException);
        }
    }

    public void dispatchError(int n, String string) {
        this.notifyListeners("ERROR", arg_0 -> EventDispatcher.lambda$dispatchError$1(n, string, arg_0));
    }

    private static void lambda$dispatch$3(String string, DiscordEventListener discordEventListener) throws Exception {
        discordEventListener.onActivityJoin(string);
    }

    public static void lambda$dispatchReady$0(User user, DiscordEventListener discordEventListener) throws Exception {
        discordEventListener.onReady(user);
    }

    private static void lambda$dispatchError$1(int n, String string, DiscordEventListener discordEventListener) throws Exception {
        discordEventListener.onError(n, string);
    }

    final class Lambda0
    implements ListenerCallback {
        private final User arg$1;

        private Lambda0(User user) {
            this.arg$1 = user;
        }

        @Override
        public void accept(DiscordEventListener discordEventListener) {
            EventDispatcher.lambda$dispatchReady$0(this.arg$1, discordEventListener);
        }
    }

    @FunctionalInterface
    interface ListenerCallback {
        public void accept(DiscordEventListener var1) throws Exception;
    }
}

