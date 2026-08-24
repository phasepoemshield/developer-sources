/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import eu.donyka.discord.RPCHandler;
import eu.donyka.discord.discord.RichPresence;
import eu.donyka.discord.discord.RichPresenceBuilder;
import oxxxde.\u0631\u063a;

public final class \u062c\u064d {
    public static void shutdown() {
        RPCHandler.shutdown();
    }

    public static void startup() {
        RPCHandler.setOnReady(user -> {
            RichPresence presence = RichPresence.builder().details("User: " + \u0631\u063a.getUsername()).state("UID: " + \u0631\u063a.getUid()).largeImageKey("https://r2.e-z.host/7d033548-c904-4c5c-b3b6-413d65aadf76/bw9sqryge6baxsz9uq.gif").largeImageText("").button(RichPresenceBuilder.RPCButton.of("\u041a\u0443\u043f\u0438\u0442\u044c", "https://rainvisuals.pro")).button(RichPresenceBuilder.RPCButton.of("\u0422\u0435\u043b\u0435\u0433\u0440\u0430\u043c", "https://t.me/rainvisuals")).build();
            RPCHandler.updatePresence(presence);
        });
        RPCHandler.setOnDisconnected(error -> System.out.println("RPC Disconnected: " + String.valueOf(error)));
        RPCHandler.setOnErrored(error -> System.out.println("RPC Errored: " + String.valueOf(error)));
        RPCHandler.startup("1523103626338500718", false);
    }

    private \u062c\u064d() {
    }
}

