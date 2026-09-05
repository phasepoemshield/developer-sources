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
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$AllowChat;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$AllowCommand;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$Chat;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$ChatCanceled;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$Command;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$CommandCanceled;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$ModifyChat;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents$ModifyCommand;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public final class ClientSendMessageEvents {
    public static final Event<ClientSendMessageEvents$AllowChat> ALLOW_CHAT = EventFactory.createArrayBacked(ClientSendMessageEvents$AllowChat.class, clientSendMessageEvents$AllowChatArray -> string -> {
        for (ClientSendMessageEvents$AllowChat clientSendMessageEvents$AllowChat : clientSendMessageEvents$AllowChatArray) {
            if (clientSendMessageEvents$AllowChat.allowSendChatMessage(string)) continue;
            return false;
        }
        return true;
    });
    public static final Event<ClientSendMessageEvents$AllowCommand> ALLOW_COMMAND = EventFactory.createArrayBacked(ClientSendMessageEvents$AllowCommand.class, clientSendMessageEvents$AllowCommandArray -> string -> {
        for (ClientSendMessageEvents$AllowCommand clientSendMessageEvents$AllowCommand : clientSendMessageEvents$AllowCommandArray) {
            if (clientSendMessageEvents$AllowCommand.allowSendCommandMessage(string)) continue;
            return false;
        }
        return true;
    });
    public static final Event<ClientSendMessageEvents$ModifyChat> MODIFY_CHAT = EventFactory.createArrayBacked(ClientSendMessageEvents$ModifyChat.class, clientSendMessageEvents$ModifyChatArray -> string -> {
        for (ClientSendMessageEvents$ModifyChat clientSendMessageEvents$ModifyChat : clientSendMessageEvents$ModifyChatArray) {
            string = clientSendMessageEvents$ModifyChat.modifySendChatMessage(string);
        }
        return string;
    });
    public static final Event<ClientSendMessageEvents$ModifyCommand> MODIFY_COMMAND = EventFactory.createArrayBacked(ClientSendMessageEvents$ModifyCommand.class, clientSendMessageEvents$ModifyCommandArray -> string -> {
        for (ClientSendMessageEvents$ModifyCommand clientSendMessageEvents$ModifyCommand : clientSendMessageEvents$ModifyCommandArray) {
            string = clientSendMessageEvents$ModifyCommand.modifySendCommandMessage(string);
        }
        return string;
    });
    public static final Event<ClientSendMessageEvents$Chat> CHAT = EventFactory.createArrayBacked(ClientSendMessageEvents$Chat.class, clientSendMessageEvents$ChatArray -> string -> {
        for (ClientSendMessageEvents$Chat clientSendMessageEvents$Chat : clientSendMessageEvents$ChatArray) {
            clientSendMessageEvents$Chat.onSendChatMessage(string);
        }
    });
    public static final Event<ClientSendMessageEvents$Command> COMMAND = EventFactory.createArrayBacked(ClientSendMessageEvents$Command.class, clientSendMessageEvents$CommandArray -> string -> {
        for (ClientSendMessageEvents$Command clientSendMessageEvents$Command : clientSendMessageEvents$CommandArray) {
            clientSendMessageEvents$Command.onSendCommandMessage(string);
        }
    });
    public static final Event<ClientSendMessageEvents$ChatCanceled> CHAT_CANCELED = EventFactory.createArrayBacked(ClientSendMessageEvents$ChatCanceled.class, clientSendMessageEvents$ChatCanceledArray -> string -> {
        for (ClientSendMessageEvents$ChatCanceled clientSendMessageEvents$ChatCanceled : clientSendMessageEvents$ChatCanceledArray) {
            clientSendMessageEvents$ChatCanceled.onSendChatMessageCanceled(string);
        }
    });
    public static final Event<ClientSendMessageEvents$CommandCanceled> COMMAND_CANCELED = EventFactory.createArrayBacked(ClientSendMessageEvents$CommandCanceled.class, clientSendMessageEvents$CommandCanceledArray -> string -> {
        for (ClientSendMessageEvents$CommandCanceled clientSendMessageEvents$CommandCanceled : clientSendMessageEvents$CommandCanceledArray) {
            clientSendMessageEvents$CommandCanceled.onSendCommandMessageCanceled(string);
        }
    });

    private ClientSendMessageEvents() {
    }
}

