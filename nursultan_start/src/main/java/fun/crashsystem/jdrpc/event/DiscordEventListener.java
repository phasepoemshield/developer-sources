/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.event;

import fun.crashsystem.jdrpc.entity.User;

public interface DiscordEventListener {
    default public void onClose() {
    }

    default public void onDisconnect(int errorCode, String message) {
    }

    default public void onError(int errorCode, String message) {
    }

    default public void onActivityJoinRequest(User user) {
    }

    default public void onReady(User user) {
    }

    default public void onActivitySpectate(String secret) {
    }

    default public void onActivityJoin(String secret) {
    }
}

