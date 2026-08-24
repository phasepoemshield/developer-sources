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
 *  net.minecraft.util.Util
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
import kotakbaz.rain.config.ConfigManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.network.ClientCommandSource;
import net.minecraft.util.Util;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062f\u0625;
import ru.ocz.protection.annotation.Compile;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0017\u00a2\u0006\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2={"Loxxxde/\u062b\u0628;", "Loxxxde/\u0627\u0647;", "<init>", "()V", "Lcom/mojang/brigadier/builder/LiteralArgumentBuilder;", "Lnet/minecraft/class_637;", "builder", "", "execute", "(Lcom/mojang/brigadier/builder/LiteralArgumentBuilder;)V", "rain-visuals"})
public final class \u062b\u0628
extends kotakbaz.rain.command.Command {
    @NotNull
    public static final \u062b\u0628 INSTANCE = new \u062b\u0628();

    private static final int execute$lambda$2(CommandContext it) {
        String name = StringArgumentType.getString((CommandContext)it, (String)"name");
        Intrinsics.checkNotNull(name);
        if (!ConfigManager.INSTANCE.isValidName(name)) {
            \u062f\u0625.INSTANCE.sendClientMessage("\u041d\u0435\u0432\u0435\u0440\u043d\u043e\u0435 \u043d\u0430\u0437\u0432\u0430\u043d\u0438\u0435 \u043a\u043e\u043d\u0444\u0438\u0433\u0430");
        } else if (!ConfigManager.INSTANCE.save(name)) {
            \u062f\u0625.INSTANCE.sendClientMessage("\u041e\u0448\u0438\u0431\u043a\u0430 \u0441\u043e\u0445\u0440\u0430\u043d\u0435\u043d\u0438\u044f \u043a\u043e\u043d\u0444\u0438\u0433\u0430: " + name);
        }
        return INSTANCE.getSingleSuccess();
    }

    private static final int execute$lambda$1(CommandContext it) {
        List<String> names = ConfigManager.INSTANCE.getConfigNames();
        \u062f\u0625.INSTANCE.sendClientMessage((String)(names.isEmpty() ? "\u0421\u043f\u0438\u0441\u043e\u043a \u043a\u043e\u043d\u0444\u0438\u0433\u043e\u0432 \u043f\u0443\u0441\u0442\u043e\u0439" : "Configs: " + CollectionsKt.joinToString$default(names, ", ", null, null, 0, null, null, 62, null)));
        return INSTANCE.getSingleSuccess();
    }

    private static final int execute$lambda$0(CommandContext it) {
        \u062f\u0625.INSTANCE.sendClientMessage("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435: .config <list|save|load|remove|folder> [\u043d\u0430\u0437\u0432\u0430\u043d\u0438\u0435]");
        return INSTANCE.getSingleSuccess();
    }

    private static final int execute$lambda$7(CommandContext it) {
        Util.getOperatingSystem().open(ConfigManager.INSTANCE.getConfigPath().toFile());
        return INSTANCE.getSingleSuccess();
    }

    private static final int execute$lambda$4(CommandContext it) {
        String name = StringArgumentType.getString((CommandContext)it, (String)"name");
        Intrinsics.checkNotNull(name);
        if (!ConfigManager.INSTANCE.isValidName(name)) {
            \u062f\u0625.INSTANCE.sendClientMessage("\u041d\u0435\u0432\u0435\u0440\u043d\u043e\u0435 \u043d\u0430\u0437\u0432\u0430\u043d\u0438\u0435 \u043a\u043e\u043d\u0444\u0438\u0433\u0430");
        } else if (!ConfigManager.INSTANCE.load(name)) {
            \u062f\u0625.INSTANCE.sendClientMessage("\u041d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u043a\u043e\u043d\u0444\u0438\u0433: " + name);
        }
        return INSTANCE.getSingleSuccess();
    }

    private static final int execute$lambda$6(CommandContext it) {
        String name = StringArgumentType.getString((CommandContext)it, (String)"name");
        Intrinsics.checkNotNull(name);
        if (!ConfigManager.INSTANCE.isValidName(name)) {
            \u062f\u0625.INSTANCE.sendClientMessage("\u041d\u0435\u0432\u0435\u0440\u043d\u043e\u0435 \u043d\u0430\u0437\u0432\u0430\u043d\u0438\u0435 \u043a\u043e\u043d\u0444\u0438\u0433\u0430");
        } else if (!ConfigManager.INSTANCE.remove(name)) {
            \u062f\u0625.INSTANCE.sendClientMessage("\u041d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u043a\u043e\u043d\u0444\u0438\u0433: " + name);
        }
        return INSTANCE.getSingleSuccess();
    }

    private \u062b\u0628() {
        super("config");
    }

    @Override
    @Compile
    public void execute(@NotNull LiteralArgumentBuilder<ClientCommandSource> literalArgumentBuilder) {
        Intrinsics.checkNotNullParameter(literalArgumentBuilder, "builder");
        literalArgumentBuilder.executes(\u062b\u0628::execute$lambda$0);
        literalArgumentBuilder.then(kotakbaz.rain.command.Command.Companion.literal("list").executes(\u062b\u0628::execute$lambda$1));
        LiteralArgumentBuilder<ClientCommandSource> literalArgumentBuilder2 = kotakbaz.rain.command.Command.Companion.literal("save");
        StringArgumentType stringArgumentType = StringArgumentType.word();
        Intrinsics.checkNotNullExpressionValue(stringArgumentType, "word(...)");
        literalArgumentBuilder.then(literalArgumentBuilder2.then(kotakbaz.rain.command.Command.Companion.argument("name", (ArgumentType)stringArgumentType).executes(\u062b\u0628::execute$lambda$2)));
        LiteralArgumentBuilder<ClientCommandSource> literalArgumentBuilder3 = kotakbaz.rain.command.Command.Companion.literal("load");
        StringArgumentType stringArgumentType2 = StringArgumentType.word();
        Intrinsics.checkNotNullExpressionValue(stringArgumentType2, "word(...)");
        literalArgumentBuilder.then(literalArgumentBuilder3.then(kotakbaz.rain.command.Command.Companion.argument("name", (ArgumentType)stringArgumentType2).suggests(\u062b\u0628::execute$lambda$3).executes(\u062b\u0628::execute$lambda$4)));
        LiteralArgumentBuilder<ClientCommandSource> literalArgumentBuilder4 = kotakbaz.rain.command.Command.Companion.literal("remove");
        StringArgumentType stringArgumentType3 = StringArgumentType.word();
        Intrinsics.checkNotNullExpressionValue(stringArgumentType3, "word(...)");
        literalArgumentBuilder.then(literalArgumentBuilder4.then(kotakbaz.rain.command.Command.Companion.argument("name", (ArgumentType)stringArgumentType3).suggests(\u062b\u0628::execute$lambda$5).executes(\u062b\u0628::execute$lambda$6)));
        literalArgumentBuilder.then(kotakbaz.rain.command.Command.Companion.literal("folder").executes(\u062b\u0628::execute$lambda$7));
    }

    /*
     * WARNING - void declaration
     */
    private static final CompletableFuture execute$lambda$3(CommandContext commandContext, SuggestionsBuilder suggestions) {
        void var1_1;
        void $this$forEach$iv;
        Iterable iterable = ConfigManager.INSTANCE.getConfigNames();
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

    /*
     * WARNING - void declaration
     */
    private static final CompletableFuture execute$lambda$5(CommandContext commandContext, SuggestionsBuilder suggestions) {
        void var1_1;
        void $this$forEach$iv;
        Iterable iterable = ConfigManager.INSTANCE.getConfigNames();
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

    static /* synthetic */ Command lamda$execute$1_4198921f() {
        return \u062b\u0628::execute$lambda$0;
    }

    static /* synthetic */ Command lamda$execute$2_44181746() {
        return \u062b\u0628::execute$lambda$1;
    }

    static /* synthetic */ Command lamda$execute$3_21fa19e4() {
        return \u062b\u0628::execute$lambda$2;
    }

    static /* synthetic */ SuggestionProvider lamda$execute$4_33a58fcb() {
        return \u062b\u0628::execute$lambda$3;
    }

    static /* synthetic */ Command lamda$execute$5_36a8ebca() {
        return \u062b\u0628::execute$lambda$4;
    }

    static /* synthetic */ SuggestionProvider lamda$execute$6_328e687e() {
        return \u062b\u0628::execute$lambda$5;
    }

    static /* synthetic */ Command lamda$execute$7_434a72f2() {
        return \u062b\u0628::execute$lambda$6;
    }

    static /* synthetic */ Command lamda$execute$8_5c8e7687() {
        return \u062b\u0628::execute$lambda$7;
    }
}

