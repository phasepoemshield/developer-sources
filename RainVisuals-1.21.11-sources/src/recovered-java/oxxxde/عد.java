/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Command
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  net.minecraft.client.network.ClientCommandSource
 *  ru.ocz.protection.annotation.Compile
 */
package oxxxde;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.network.ClientCommandSource;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062d\u064f;
import oxxxde.\u062f\u0625;
import oxxxde.\u0634\u063a;
import ru.ocz.protection.annotation.Compile;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0017\u00a2\u0006\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2={"Loxxxde/\u0639\u062f;", "Loxxxde/\u0627\u0647;", "<init>", "()V", "Lcom/mojang/brigadier/builder/LiteralArgumentBuilder;", "Lnet/minecraft/class_637;", "builder", "", "execute", "(Lcom/mojang/brigadier/builder/LiteralArgumentBuilder;)V", "rain-visuals"})
public final class \u0639\u062f
extends kotakbaz.rain.command.Command {
    @NotNull
    public static final \u0639\u062f INSTANCE = new \u0639\u062f();

    private static final int execute$lambda$2(CommandContext it) {
        \u062f\u0625.INSTANCE.sendClientMessage(\u0634\u063a.INSTANCE.clear() ? "Friend list cleared." : "Failed to save friend list.");
        return INSTANCE.getSingleSuccess();
    }

    private static final int execute$lambda$3(CommandContext it) {
        String name = StringArgumentType.getString((CommandContext)it, (String)"name");
        Intrinsics.checkNotNull(name);
        switch (\u062d\u064f.$EnumSwitchMapping$0[\u0634\u063a.INSTANCE.add(name).ordinal()]) {
            case 1: {
                \u062f\u0625.INSTANCE.sendClientMessage("Added friend: " + name);
                break;
            }
            case 2: {
                \u062f\u0625.INSTANCE.sendClientMessage("Friend is already listed: " + name);
                break;
            }
            case 3: {
                \u062f\u0625.INSTANCE.sendClientMessage("Invalid friend nickname");
                break;
            }
            case 4: {
                \u062f\u0625.INSTANCE.sendClientMessage("Failed to save friend list");
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return INSTANCE.getSingleSuccess();
    }

    private \u0639\u062f() {
        super("friend");
    }

    private static final int execute$lambda$5(CommandContext it) {
        String name = StringArgumentType.getString((CommandContext)it, (String)"name");
        Intrinsics.checkNotNull(name);
        switch (\u062d\u064f.$EnumSwitchMapping$1[\u0634\u063a.INSTANCE.remove(name).ordinal()]) {
            case 1: {
                \u062f\u0625.INSTANCE.sendClientMessage("Removed friend: " + name);
                break;
            }
            case 2: {
                \u062f\u0625.INSTANCE.sendClientMessage("Friend not found: " + name);
                break;
            }
            case 3: {
                \u062f\u0625.INSTANCE.sendClientMessage("Invalid friend name");
                break;
            }
            case 4: {
                \u062f\u0625.INSTANCE.sendClientMessage("Failed to save friend list");
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return INSTANCE.getSingleSuccess();
    }

    /*
     * WARNING - void declaration
     */
    private static final CompletableFuture execute$lambda$4(CommandContext commandContext, SuggestionsBuilder suggestions) {
        void var1_1;
        void $this$forEach$iv;
        Iterable iterable = \u0634\u063a.INSTANCE.getFriends();
        Intrinsics.checkNotNull(suggestions);
        SuggestionsBuilder suggestionsBuilder = suggestions;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            String p0 = (String)element$iv;
            boolean bl = false;
            suggestionsBuilder.suggest(p0);
        }
        return var1_1.buildFuture();
    }

    private static final int execute$lambda$1(CommandContext it) {
        List<String> friends = \u0634\u063a.INSTANCE.getFriends();
        \u062f\u0625.INSTANCE.sendClientMessage((String)(friends.isEmpty() ? "\u0421\u043f\u0438\u0441\u043e\u043a \u0434\u0440\u0443\u0437\u0435\u0439 \u043f\u0443\u0441\u0442" : "Friends: " + CollectionsKt.joinToString$default(friends, ", ", null, null, 0, null, null, 62, null)));
        return INSTANCE.getSingleSuccess();
    }

    @Override
    @Compile
    public void execute(@NotNull LiteralArgumentBuilder<ClientCommandSource> literalArgumentBuilder) {
        Intrinsics.checkNotNullParameter(literalArgumentBuilder, "builder");
        literalArgumentBuilder.executes(\u0639\u062f::execute$lambda$0);
        literalArgumentBuilder.then(kotakbaz.rain.command.Command.Companion.literal("list").executes(\u0639\u062f::execute$lambda$1));
        literalArgumentBuilder.then(kotakbaz.rain.command.Command.Companion.literal("clear").executes(\u0639\u062f::execute$lambda$2));
        LiteralArgumentBuilder<ClientCommandSource> literalArgumentBuilder2 = kotakbaz.rain.command.Command.Companion.literal("add");
        StringArgumentType stringArgumentType = StringArgumentType.word();
        Intrinsics.checkNotNullExpressionValue(stringArgumentType, "word(...)");
        literalArgumentBuilder.then(literalArgumentBuilder2.then(kotakbaz.rain.command.Command.Companion.argument("name", (ArgumentType)stringArgumentType).executes(\u0639\u062f::execute$lambda$3)));
        LiteralArgumentBuilder<ClientCommandSource> literalArgumentBuilder3 = kotakbaz.rain.command.Command.Companion.literal("remove");
        StringArgumentType stringArgumentType2 = StringArgumentType.word();
        Intrinsics.checkNotNullExpressionValue(stringArgumentType2, "word(...)");
        literalArgumentBuilder.then(literalArgumentBuilder3.then(kotakbaz.rain.command.Command.Companion.argument("name", (ArgumentType)stringArgumentType2).suggests(\u0639\u062f::execute$lambda$4).executes(\u0639\u062f::execute$lambda$5)));
    }

    private static final int execute$lambda$0(CommandContext it) {
        \u062f\u0625.INSTANCE.sendClientMessage("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435: .friend <add|remove|list|clear> [\u043d\u0438\u043a\u043d\u0435\u0439\u043c]");
        return INSTANCE.getSingleSuccess();
    }

    static /* synthetic */ Command lamda$execute$1_2e17a9e6() {
        return \u0639\u062f::execute$lambda$0;
    }

    static /* synthetic */ Command lamda$execute$2_6a1b4854() {
        return \u0639\u062f::execute$lambda$1;
    }

    static /* synthetic */ Command lamda$execute$3_6a175162() {
        return \u0639\u062f::execute$lambda$2;
    }

    static /* synthetic */ Command lamda$execute$4_7641c4e7() {
        return \u0639\u062f::execute$lambda$3;
    }

    static /* synthetic */ SuggestionProvider lamda$execute$5_650a0b50() {
        return \u0639\u062f::execute$lambda$4;
    }

    static /* synthetic */ Command lamda$execute$6_55e3b64d() {
        return \u0639\u062f::execute$lambda$5;
    }
}

