/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.tree.CommandNode
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  de.maxhenkel.voicechat.permission.Permission
 *  de.maxhenkel.voicechat.permission.PermissionManager
 *  de.maxhenkel.voicechat.voice.common.PlayerState
 *  de.maxhenkel.voicechat.voice.server.ClientConnection
 *  de.maxhenkel.voicechat.voice.server.Group
 *  de.maxhenkel.voicechat.voice.server.PingManager$PingListener
 *  de.maxhenkel.voicechat.voice.server.Server
 *  javax.annotation.Nullable
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00625
 *  minecraft.class00647
 *  minecraft.class04770
 *  minecraft.class05193
 *  minecraft.class06541
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08159
 *  minecraft.class08179
 *  minecraft.class08195
 */
package de.maxhenkel.voicechat.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.CommandNode;
import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.command.GroupNameSuggestionProvider;
import de.maxhenkel.voicechat.command.VoicechatCommands$1;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.permission.Permission;
import de.maxhenkel.voicechat.permission.PermissionManager;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import de.maxhenkel.voicechat.voice.server.ClientConnection;
import de.maxhenkel.voicechat.voice.server.Group;
import de.maxhenkel.voicechat.voice.server.PingManager;
import de.maxhenkel.voicechat.voice.server.Server;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00625;
import minecraft.class00647;
import minecraft.class04770;
import minecraft.class05193;
import minecraft.class06541;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08159;
import minecraft.class08179;
import minecraft.class08195;

public class VoicechatCommands {
    public static final String VOICECHAT_COMMAND = "voicechat";

    private static boolean checkPermission(class07701 class077012, Permission permission) {
        try {
            return permission.hasPermission(class077012.Z());
        }
        catch (CommandSyntaxException commandSyntaxException) {
            return class077012.N().hasPermission((class08159)new class08179(class08195.field_63199));
        }
    }

    public static void register(CommandDispatcher<class07701> commandDispatcher) {
        LiteralArgumentBuilder literalArgumentBuilder = class07686.y((String)VOICECHAT_COMMAND);
        literalArgumentBuilder.executes(commandContext -> VoicechatCommands.help(commandDispatcher, (CommandContext<class07701>)commandContext));
        literalArgumentBuilder.then(class07686.y((String)"help").executes(commandContext -> VoicechatCommands.help(commandDispatcher, (CommandContext<class07701>)commandContext)));
        literalArgumentBuilder.then(((LiteralArgumentBuilder)class07686.y((String)"test").requires(class077012 -> VoicechatCommands.checkPermission(class077012, PermissionManager.INSTANCE.ADMIN_PERMISSION))).then(class07686.N((String)"target", (ArgumentType)class07680.L()).executes(commandContext -> {
            if (VoicechatCommands.checkNoVoicechat((CommandContext<class07701>)commandContext)) {
                return 0;
            }
            class04770 class047702 = class07680.i((CommandContext)commandContext, (String)"target");
            Server server = Voicechat.SERVER.getServer();
            if (server == null) {
                ((class07701)commandContext.getSource()).N(() -> class00392.L((String)"message.voicechat.voice_chat_unavailable"), false);
                return 1;
            }
            if (!Voicechat.SERVER.isCompatible(class047702)) {
                ((class07701)commandContext.getSource()).N(() -> class00392.N((String)"message.voicechat.player_no_voicechat", (Object[])new Object[]{class047702.method_5476(), CommonCompatibilityManager.INSTANCE.getModName()}), false);
                return 1;
            }
            ClientConnection clientConnection = (ClientConnection)server.getConnections().get(class047702.method_5667());
            if (clientConnection == null) {
                ((class07701)commandContext.getSource()).N(() -> class00392.L((String)"message.voicechat.client_not_connected"), false);
                return 1;
            }
            try {
                ((class07701)commandContext.getSource()).N(() -> class00392.L((String)"message.voicechat.sending_ping"), false);
                server.getPingManager().sendPing(clientConnection, 500L, 10, (PingManager.PingListener)new VoicechatCommands$1(commandContext));
                ((class07701)commandContext.getSource()).N(() -> class00392.L((String)"message.voicechat.ping_sent_waiting"), false);
            }
            catch (Exception exception) {
                ((class07701)commandContext.getSource()).N(() -> class00392.N((String)"message.voicechat.failed_to_send_ping", (Object[])new Object[]{exception.getMessage()}), false);
                Voicechat.LOGGER.warn("Failed to send ping", new Object[]{exception});
                return 1;
            }
            return 1;
        })));
        literalArgumentBuilder.then(class07686.y((String)"invite").then(class07686.N((String)"target", (ArgumentType)class07680.L()).executes(commandContext -> {
            if (VoicechatCommands.checkNoVoicechat((CommandContext<class07701>)commandContext)) {
                return 0;
            }
            class04770 class047702 = ((class07701)commandContext.getSource()).Z();
            Server server = Voicechat.SERVER.getServer();
            if (server == null) {
                ((class07701)commandContext.getSource()).N(() -> class00392.L((String)"message.voicechat.voice_chat_unavailable"), false);
                return 1;
            }
            PlayerState playerState = server.getPlayerStateManager().getState(class047702.method_5667());
            if (playerState == null || !playerState.hasGroup()) {
                ((class07701)commandContext.getSource()).N(() -> class00392.L((String)"message.voicechat.not_in_group"), false);
                return 1;
            }
            class04770 class047703 = class07680.i((CommandContext)commandContext, (String)"target");
            Group group = server.getGroupManager().getGroup(playerState.getGroup());
            if (group == null) {
                return 1;
            }
            if (!Voicechat.SERVER.isCompatible(class047703)) {
                ((class07701)commandContext.getSource()).N(() -> class00392.N((String)"message.voicechat.player_no_voicechat", (Object[])new Object[]{class047703.method_5476(), CommonCompatibilityManager.INSTANCE.getModName()}), false);
                return 1;
            }
            String string = group.getPassword() == null ? "" : " \"" + group.getPassword() + "\"";
            class047703.method_64398((class00392)class00392.N((String)"message.voicechat.invite", (Object[])new Object[]{class047702.method_5476(), class00392.y((String)group.getName()).N(class06541.field_1080), class00390.N((class00392)class00392.L((String)"message.voicechat.accept_invite").N(class004052 -> class004052.N((class00647)new class00625("/voicechat join " + group.getId().toString() + string)).N((class00395)new class00401((class00392)class00392.L((String)"message.voicechat.accept_invite.hover"))))).N(class06541.field_1060)}));
            ((class07701)commandContext.getSource()).N(() -> class00392.N((String)"message.voicechat.invite_successful", (Object[])new Object[]{class047703.method_5476()}), false);
            return 1;
        })));
        literalArgumentBuilder.then(class07686.y((String)"join").then(class07686.N((String)"group_id", (ArgumentType)class05193.N()).executes(commandContext -> {
            if (VoicechatCommands.checkNoVoicechat((CommandContext<class07701>)commandContext)) {
                return 0;
            }
            UUID uUID = class05193.N((CommandContext)commandContext, (String)"group_id");
            return VoicechatCommands.joinGroupById((class07701)commandContext.getSource(), uUID, null);
        })));
        literalArgumentBuilder.then(class07686.y((String)"join").then(class07686.N((String)"group_id", (ArgumentType)class05193.N()).then(class07686.N((String)"password", (ArgumentType)StringArgumentType.string()).executes(commandContext -> {
            if (VoicechatCommands.checkNoVoicechat((CommandContext<class07701>)commandContext)) {
                return 0;
            }
            UUID uUID = class05193.N((CommandContext)commandContext, (String)"group_id");
            String string = StringArgumentType.getString((CommandContext)commandContext, (String)"password");
            return VoicechatCommands.joinGroupById((class07701)commandContext.getSource(), uUID, string.isEmpty() ? null : string);
        }))));
        literalArgumentBuilder.then(class07686.y((String)"join").then(class07686.N((String)"group_name", (ArgumentType)StringArgumentType.string()).suggests((SuggestionProvider)GroupNameSuggestionProvider.INSTANCE).executes(commandContext -> {
            if (VoicechatCommands.checkNoVoicechat((CommandContext<class07701>)commandContext)) {
                return 0;
            }
            String string = StringArgumentType.getString((CommandContext)commandContext, (String)"group_name");
            return VoicechatCommands.joinGroupByName((class07701)commandContext.getSource(), string, null);
        })));
        literalArgumentBuilder.then(class07686.y((String)"join").then(class07686.N((String)"group_name", (ArgumentType)StringArgumentType.string()).suggests((SuggestionProvider)GroupNameSuggestionProvider.INSTANCE).then(class07686.N((String)"password", (ArgumentType)StringArgumentType.string()).executes(commandContext -> {
            if (VoicechatCommands.checkNoVoicechat((CommandContext<class07701>)commandContext)) {
                return 0;
            }
            String string = StringArgumentType.getString((CommandContext)commandContext, (String)"group_name");
            String string2 = StringArgumentType.getString((CommandContext)commandContext, (String)"password");
            return VoicechatCommands.joinGroupByName((class07701)commandContext.getSource(), string, string2.isEmpty() ? null : string2);
        }))));
        literalArgumentBuilder.then(class07686.y((String)"leave").executes(commandContext -> {
            if (VoicechatCommands.checkNoVoicechat((CommandContext<class07701>)commandContext)) {
                return 0;
            }
            if (!((Boolean)Voicechat.SERVER_CONFIG.groupsEnabled.get()).booleanValue()) {
                ((class07701)commandContext.getSource()).y((class00392)class00392.L((String)"message.voicechat.groups_disabled"));
                return 1;
            }
            Server server = Voicechat.SERVER.getServer();
            if (server == null) {
                ((class07701)commandContext.getSource()).N(() -> class00392.L((String)"message.voicechat.voice_chat_unavailable"), false);
                return 1;
            }
            class04770 class047702 = ((class07701)commandContext.getSource()).Z();
            PlayerState playerState = server.getPlayerStateManager().getState(class047702.method_5667());
            if (playerState == null || !playerState.hasGroup()) {
                ((class07701)commandContext.getSource()).N(() -> class00392.L((String)"message.voicechat.not_in_group"), false);
                return 1;
            }
            server.getGroupManager().leaveGroup(class047702);
            ((class07701)commandContext.getSource()).N(() -> class00392.L((String)"message.voicechat.leave_successful"), false);
            return 1;
        }));
        commandDispatcher.register(literalArgumentBuilder);
    }

    private static int help(CommandDispatcher<class07701> commandDispatcher, CommandContext<class07701> commandContext) {
        if (VoicechatCommands.checkNoVoicechat(commandContext)) {
            return 0;
        }
        CommandNode commandNode = commandDispatcher.getRoot().getChild(VOICECHAT_COMMAND);
        Map map = commandDispatcher.getSmartUsage(commandNode, (Object)((class07701)commandContext.getSource()));
        for (Map.Entry entry : map.entrySet()) {
            ((class07701)commandContext.getSource()).N(() -> class00392.y((String)"/%s %s".formatted(new Object[]{VOICECHAT_COMMAND, entry.getValue()})), false);
        }
        return map.size();
    }

    private static Server joinGroup(class07701 class077012) throws CommandSyntaxException {
        if (!((Boolean)Voicechat.SERVER_CONFIG.groupsEnabled.get()).booleanValue()) {
            class077012.y((class00392)class00392.L((String)"message.voicechat.groups_disabled"));
            return null;
        }
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            class077012.N(() -> class00392.L((String)"message.voicechat.voice_chat_unavailable"), false);
            return null;
        }
        class04770 class047702 = class077012.Z();
        if (!PermissionManager.INSTANCE.GROUPS_PERMISSION.hasPermission(class047702)) {
            class077012.N(() -> class00392.L((String)"message.voicechat.no_group_permission"), false);
            return null;
        }
        return server;
    }

    private static int joinGroup(class07701 class077012, Server server, UUID uUID, @Nullable String string) throws CommandSyntaxException {
        Group group = server.getGroupManager().getGroup(uUID);
        if (group == null) {
            class077012.y((class00392)class00392.L((String)"message.voicechat.group_does_not_exist"));
            return 1;
        }
        server.getGroupManager().joinGroup(group, class077012.Z(), string);
        class077012.N(() -> class00392.N((String)"message.voicechat.join_successful", (Object[])new Object[]{class00392.y((String)group.getName()).N(class06541.field_1080)}), false);
        return 1;
    }

    private static int joinGroupById(class07701 class077012, UUID uUID, @Nullable String string) throws CommandSyntaxException {
        Server server = VoicechatCommands.joinGroup(class077012);
        if (server == null) {
            return 1;
        }
        return VoicechatCommands.joinGroup(class077012, server, uUID, string);
    }

    private static boolean checkNoVoicechat(CommandContext<class07701> commandContext) {
        try {
            class04770 class047702 = ((class07701)commandContext.getSource()).Z();
            if (Voicechat.SERVER.isCompatible(class047702)) {
                return false;
            }
            ((class07701)commandContext.getSource()).y((class00392)class00392.y((String)((String)Voicechat.TRANSLATIONS.voicechatNeededForCommandMessage.get()).formatted(new Object[]{CommonCompatibilityManager.INSTANCE.getModName()})));
            return true;
        }
        catch (Exception exception) {
            ((class07701)commandContext.getSource()).y((class00392)class00392.y((String)((String)Voicechat.TRANSLATIONS.playerCommandMessage.get())));
            return true;
        }
    }

    private static int joinGroupByName(class07701 class077012, String string, @Nullable String string2) throws CommandSyntaxException {
        Server server = VoicechatCommands.joinGroup(class077012);
        if (server == null) {
            return 1;
        }
        List list = server.getGroupManager().getGroups().values().stream().filter(group -> group.getName().equals(string)).collect(Collectors.toList());
        if (list.isEmpty()) {
            class077012.y((class00392)class00392.L((String)"message.voicechat.group_does_not_exist"));
            return 1;
        }
        if (list.size() > 1) {
            class077012.y((class00392)class00392.L((String)"message.voicechat.group_name_not_unique"));
            return 1;
        }
        return VoicechatCommands.joinGroup(class077012, server, ((Group)list.get(0)).getId(), string2);
    }
}

