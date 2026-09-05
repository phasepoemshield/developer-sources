/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 *  net.fabricmc.fabric.api.message.v1.ServerMessageEvents$AllowChatMessage
 *  net.fabricmc.fabric.api.message.v1.ServerMessageEvents$AllowCommandMessage
 *  net.fabricmc.fabric.api.message.v1.ServerMessageEvents$AllowGameMessage
 *  net.fabricmc.fabric.api.message.v1.ServerMessageEvents$ChatMessage
 *  net.fabricmc.fabric.api.message.v1.ServerMessageEvents$CommandMessage
 *  net.fabricmc.fabric.api.message.v1.ServerMessageEvents$GameMessage
 */
package net.fabricmc.fabric.api.message.v1;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.message.v1.ServerMessageEvents;

public final class ServerMessageEvents {
    public static final Event<AllowChatMessage> ALLOW_CHAT_MESSAGE = EventFactory.createArrayBacked(AllowChatMessage.class, allowChatMessageArray -> (class039262, class047702, class006492) -> {
        for (AllowChatMessage allowChatMessage : allowChatMessageArray) {
            if (allowChatMessage.allowChatMessage(class039262, class047702, class006492)) continue;
            return false;
        }
        return true;
    });
    public static final Event<AllowGameMessage> ALLOW_GAME_MESSAGE = EventFactory.createArrayBacked(AllowGameMessage.class, allowGameMessageArray -> (class027962, class003922, bl) -> {
        for (AllowGameMessage allowGameMessage : allowGameMessageArray) {
            if (allowGameMessage.allowGameMessage(class027962, class003922, bl)) continue;
            return false;
        }
        return true;
    });
    public static final Event<AllowCommandMessage> ALLOW_COMMAND_MESSAGE = EventFactory.createArrayBacked(AllowCommandMessage.class, allowCommandMessageArray -> (class039262, class077012, class006492) -> {
        for (AllowCommandMessage allowCommandMessage : allowCommandMessageArray) {
            if (allowCommandMessage.allowCommandMessage(class039262, class077012, class006492)) continue;
            return false;
        }
        return true;
    });
    public static final Event<ChatMessage> CHAT_MESSAGE = EventFactory.createArrayBacked(ChatMessage.class, chatMessageArray -> (class039262, class047702, class006492) -> {
        for (ChatMessage chatMessage : chatMessageArray) {
            chatMessage.onChatMessage(class039262, class047702, class006492);
        }
    });
    public static final Event<GameMessage> GAME_MESSAGE = EventFactory.createArrayBacked(GameMessage.class, gameMessageArray -> (class027962, class003922, bl) -> {
        for (GameMessage gameMessage : gameMessageArray) {
            gameMessage.onGameMessage(class027962, class003922, bl);
        }
    });
    public static final Event<CommandMessage> COMMAND_MESSAGE = EventFactory.createArrayBacked(CommandMessage.class, commandMessageArray -> (class039262, class077012, class006492) -> {
        for (CommandMessage commandMessage : commandMessageArray) {
            commandMessage.onCommandMessage(class039262, class077012, class006492);
        }
    });

    private ServerMessageEvents() {
    }
}

