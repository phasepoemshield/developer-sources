/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.client.message.v1;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$AllowChat;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$AllowGame;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$Chat;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$ChatCanceled;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$Game;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$GameCanceled;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents$ModifyGame;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public final class ClientReceiveMessageEvents {
    public static final Event<ClientReceiveMessageEvents$AllowChat> ALLOW_CHAT = EventFactory.createArrayBacked(ClientReceiveMessageEvents$AllowChat.class, clientReceiveMessageEvents$AllowChatArray -> (class003922, class039262, gameProfile, class006492, instant) -> {
        boolean bl = true;
        for (ClientReceiveMessageEvents$AllowChat clientReceiveMessageEvents$AllowChat : clientReceiveMessageEvents$AllowChatArray) {
            bl &= clientReceiveMessageEvents$AllowChat.allowReceiveChatMessage(class003922, class039262, gameProfile, class006492, instant);
        }
        return bl;
    });
    public static final Event<ClientReceiveMessageEvents$AllowGame> ALLOW_GAME = EventFactory.createArrayBacked(ClientReceiveMessageEvents$AllowGame.class, clientReceiveMessageEvents$AllowGameArray -> (class003922, bl) -> {
        boolean bl2 = true;
        for (ClientReceiveMessageEvents$AllowGame clientReceiveMessageEvents$AllowGame : clientReceiveMessageEvents$AllowGameArray) {
            bl2 &= clientReceiveMessageEvents$AllowGame.allowReceiveGameMessage(class003922, bl);
        }
        return bl2;
    });
    public static final Event<ClientReceiveMessageEvents$ModifyGame> MODIFY_GAME = EventFactory.createArrayBacked(ClientReceiveMessageEvents$ModifyGame.class, clientReceiveMessageEvents$ModifyGameArray -> (class003922, bl) -> {
        for (ClientReceiveMessageEvents$ModifyGame clientReceiveMessageEvents$ModifyGame : clientReceiveMessageEvents$ModifyGameArray) {
            class003922 = clientReceiveMessageEvents$ModifyGame.modifyReceivedGameMessage(class003922, bl);
        }
        return class003922;
    });
    public static final Event<ClientReceiveMessageEvents$Chat> CHAT = EventFactory.createArrayBacked(ClientReceiveMessageEvents$Chat.class, clientReceiveMessageEvents$ChatArray -> (class003922, class039262, gameProfile, class006492, instant) -> {
        for (ClientReceiveMessageEvents$Chat clientReceiveMessageEvents$Chat : clientReceiveMessageEvents$ChatArray) {
            clientReceiveMessageEvents$Chat.onReceiveChatMessage(class003922, class039262, gameProfile, class006492, instant);
        }
    });
    public static final Event<ClientReceiveMessageEvents$Game> GAME = EventFactory.createArrayBacked(ClientReceiveMessageEvents$Game.class, clientReceiveMessageEvents$GameArray -> (class003922, bl) -> {
        for (ClientReceiveMessageEvents$Game clientReceiveMessageEvents$Game : clientReceiveMessageEvents$GameArray) {
            clientReceiveMessageEvents$Game.onReceiveGameMessage(class003922, bl);
        }
    });
    public static final Event<ClientReceiveMessageEvents$ChatCanceled> CHAT_CANCELED = EventFactory.createArrayBacked(ClientReceiveMessageEvents$ChatCanceled.class, clientReceiveMessageEvents$ChatCanceledArray -> (class003922, class039262, gameProfile, class006492, instant) -> {
        for (ClientReceiveMessageEvents$ChatCanceled clientReceiveMessageEvents$ChatCanceled : clientReceiveMessageEvents$ChatCanceledArray) {
            clientReceiveMessageEvents$ChatCanceled.onReceiveChatMessageCanceled(class003922, class039262, gameProfile, class006492, instant);
        }
    });
    public static final Event<ClientReceiveMessageEvents$GameCanceled> GAME_CANCELED = EventFactory.createArrayBacked(ClientReceiveMessageEvents$GameCanceled.class, clientReceiveMessageEvents$GameCanceledArray -> (class003922, bl) -> {
        for (ClientReceiveMessageEvents$GameCanceled clientReceiveMessageEvents$GameCanceled : clientReceiveMessageEvents$GameCanceledArray) {
            clientReceiveMessageEvents$GameCanceled.onReceiveGameMessageCanceled(class003922, bl);
        }
    });

    private ClientReceiveMessageEvents() {
    }
}

