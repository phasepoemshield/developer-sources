/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.ParsedCommandNode
 *  com.mojang.brigadier.exceptions.BuiltInExceptionProvider
 *  com.mojang.brigadier.exceptions.CommandExceptionType
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class06202
 *  minecraft.class08700
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.command.v2.ClientCommandManager
 *  net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource
 *  net.fabricmc.fabric.mixin.command.HelpCommandAccessor
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.command.client;

import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.exceptions.BuiltInExceptionProvider;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class06202;
import minecraft.class08700;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.fabricmc.fabric.mixin.command.HelpCommandAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(value=EnvType.CLIENT)
public final class ClientCommandInternals {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientCommandInternals.class);
    private static final String API_COMMAND_NAME = "fabric-command-api-v2:client";
    private static final String SHORT_API_COMMAND_NAME = "fcc";
    private static @Nullable CommandDispatcher<FabricClientCommandSource> activeDispatcher;

    private static class00392 getErrorMessage(CommandSyntaxException commandSyntaxException) {
        class00392 class003922 = class00390.N((Message)commandSyntaxException.getRawMessage());
        String string = commandSyntaxException.getContext();
        return string != null ? class00392.N((String)"command.context.parse_error", (Object[])new Object[]{class003922, commandSyntaxException.getCursor(), string}) : class003922;
    }

    private static int executeRootHelp(CommandContext<FabricClientCommandSource> commandContext) {
        return ClientCommandInternals.executeHelp((CommandNode<FabricClientCommandSource>)activeDispatcher.getRoot(), commandContext);
    }

    private static void copyChildren(CommandNode<FabricClientCommandSource> commandNode, CommandNode<FabricClientCommandSource> commandNode2, FabricClientCommandSource fabricClientCommandSource2, Map<CommandNode<FabricClientCommandSource>, CommandNode<FabricClientCommandSource>> map) {
        for (CommandNode commandNode3 : commandNode.getChildren()) {
            if (!commandNode3.canUse((Object)fabricClientCommandSource2)) continue;
            ArgumentBuilder argumentBuilder = commandNode3.createBuilder();
            argumentBuilder.requires(fabricClientCommandSource -> true);
            if (argumentBuilder.getCommand() != null) {
                argumentBuilder.executes(commandContext -> 0);
            }
            if (argumentBuilder.getRedirect() != null) {
                argumentBuilder.redirect(map.get(argumentBuilder.getRedirect()));
            }
            CommandNode commandNode4 = argumentBuilder.build();
            map.put((CommandNode<FabricClientCommandSource>)commandNode3, (CommandNode<FabricClientCommandSource>)commandNode4);
            commandNode2.addChild(commandNode4);
            if (commandNode3.getChildren().isEmpty()) continue;
            ClientCommandInternals.copyChildren((CommandNode<FabricClientCommandSource>)commandNode3, (CommandNode<FabricClientCommandSource>)commandNode4, fabricClientCommandSource2, map);
        }
    }

    private static int executeHelp(CommandNode<FabricClientCommandSource> commandNode, CommandContext<FabricClientCommandSource> commandContext) {
        Map map = activeDispatcher.getSmartUsage(commandNode, (Object)((FabricClientCommandSource)commandContext.getSource()));
        for (String string : map.values()) {
            ((FabricClientCommandSource)commandContext.getSource()).sendFeedback((class00392)class00392.y((String)("/" + string)));
        }
        return map.size();
    }

    private static boolean isIgnoredException(CommandExceptionType commandExceptionType) {
        BuiltInExceptionProvider builtInExceptionProvider = CommandSyntaxException.BUILT_IN_EXCEPTIONS;
        return commandExceptionType == builtInExceptionProvider.dispatcherUnknownCommand() || commandExceptionType == builtInExceptionProvider.dispatcherParseException();
    }

    public static void finalizeInit() {
        if (!activeDispatcher.getRoot().getChildren().isEmpty()) {
            LiteralArgumentBuilder literalArgumentBuilder = ClientCommandManager.literal((String)"help");
            literalArgumentBuilder.executes(ClientCommandInternals::executeRootHelp);
            literalArgumentBuilder.then(ClientCommandManager.argument((String)"command", (ArgumentType)StringArgumentType.greedyString()).executes(ClientCommandInternals::executeArgumentHelp));
            LiteralCommandNode literalCommandNode = activeDispatcher.register((LiteralArgumentBuilder)ClientCommandManager.literal((String)API_COMMAND_NAME).then((ArgumentBuilder)literalArgumentBuilder));
            activeDispatcher.register((LiteralArgumentBuilder)ClientCommandManager.literal((String)SHORT_API_COMMAND_NAME).redirect((CommandNode)literalCommandNode));
        }
        activeDispatcher.findAmbiguities((commandNode, commandNode2, commandNode3, collection) -> LOGGER.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{activeDispatcher.getPath(commandNode2), activeDispatcher.getPath(commandNode3), collection}));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean executeCommand(String string) {
        class06202 class062022 = class06202.Nq();
        FabricClientCommandSource fabricClientCommandSource = (FabricClientCommandSource)class062022.NE().L();
        class08700.N().N(string);
        try {
            activeDispatcher.execute(string, (Object)fabricClientCommandSource);
            boolean bl = true;
            return bl;
        }
        catch (CommandSyntaxException commandSyntaxException) {
            boolean bl = ClientCommandInternals.isIgnoredException(commandSyntaxException.getType());
            if (bl) {
                LOGGER.debug("Syntax exception for client-sided command '{}'", (Object)string, (Object)commandSyntaxException);
                boolean bl2 = false;
                return bl2;
            }
            LOGGER.warn("Syntax exception for client-sided command '{}'", (Object)string, (Object)commandSyntaxException);
            fabricClientCommandSource.sendError(ClientCommandInternals.getErrorMessage(commandSyntaxException));
            boolean bl3 = true;
            return bl3;
        }
        catch (Exception exception) {
            LOGGER.warn("Error while executing client-sided command '{}'", (Object)string, (Object)exception);
            fabricClientCommandSource.sendError(class00392.N((String)exception.getMessage()));
            boolean bl = true;
            return bl;
        }
        finally {
            class08700.N().L();
        }
    }

    public static void addCommands(CommandDispatcher<FabricClientCommandSource> commandDispatcher, FabricClientCommandSource fabricClientCommandSource) {
        HashMap<CommandNode<FabricClientCommandSource>, CommandNode<FabricClientCommandSource>> hashMap = new HashMap<CommandNode<FabricClientCommandSource>, CommandNode<FabricClientCommandSource>>();
        hashMap.put((CommandNode<FabricClientCommandSource>)activeDispatcher.getRoot(), (CommandNode<FabricClientCommandSource>)commandDispatcher.getRoot());
        ClientCommandInternals.copyChildren((CommandNode<FabricClientCommandSource>)activeDispatcher.getRoot(), (CommandNode<FabricClientCommandSource>)commandDispatcher.getRoot(), fabricClientCommandSource, hashMap);
    }

    public static @Nullable CommandDispatcher<FabricClientCommandSource> getActiveDispatcher() {
        return activeDispatcher;
    }

    public static void setActiveDispatcher(@Nullable CommandDispatcher<FabricClientCommandSource> commandDispatcher) {
        activeDispatcher = commandDispatcher;
    }

    private static int executeArgumentHelp(CommandContext<FabricClientCommandSource> commandContext) throws CommandSyntaxException {
        ParseResults parseResults = activeDispatcher.parse(StringArgumentType.getString(commandContext, (String)"command"), (Object)((FabricClientCommandSource)commandContext.getSource()));
        List list = parseResults.getContext().getNodes();
        if (list.isEmpty()) {
            throw HelpCommandAccessor.getFailedException().create();
        }
        return ClientCommandInternals.executeHelp((CommandNode<FabricClientCommandSource>)((ParsedCommandNode)Iterables.getLast((Iterable)list)).getNode(), commandContext);
    }
}

