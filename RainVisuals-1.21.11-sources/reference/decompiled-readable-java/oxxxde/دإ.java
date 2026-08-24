/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.Suggestions
 *  net.minecraft.client.gui.hud.InGameHud
 *  net.minecraft.client.network.ClientCommandSource
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.text.MutableText
 *  net.minecraft.text.Style
 *  net.minecraft.text.Text
 *  net.minecraft.text.TextColor
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package oxxxde;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import kotakbaz.rain.command.Command;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.network.ClientCommandSource;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u0636\u0643;
import oxxxde.\u0647;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J!\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u001f\u001a&\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d \u001e*\u0012\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d\u0018\u00010\u001c0\u001c2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070#\u00a2\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\b&\u0010'J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020(\u00a2\u0006\u0004\b&\u0010)J\u000f\u0010+\u001a\u00020*H\u0002\u00a2\u0006\u0004\b+\u0010,R&\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u001a0-0#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b/\u00100R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u0016018\u0006\u00a2\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u0007068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b7\u00100\u00a8\u00068"}, d2={"Loxxxde/\u062f\u0625;", "Loxxxde/\u0647;", "<init>", "()V", "", "load", "", "Loxxxde/\u0627\u0647;", "commands", "registerCommands", "([Lkotakbaz/rain/command/Command;)V", "", "getPrefix", "()Ljava/lang/String;", "message", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;", "ci", "createCommands", "(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V", "Lcom/mojang/brigadier/StringReader;", "reader", "Lcom/mojang/brigadier/ParseResults;", "Lnet/minecraft/class_637;", "parse", "(Lcom/mojang/brigadier/StringReader;)Lcom/mojang/brigadier/ParseResults;", "parseResults", "", "cursor", "Ljava/util/concurrent/CompletableFuture;", "Lcom/mojang/brigadier/suggestion/Suggestions;", "kotlin.jvm.PlatformType", "suggest", "(Lcom/mojang/brigadier/ParseResults;I)Ljava/util/concurrent/CompletableFuture;", "source", "()Lnet/minecraft/class_637;", "", "getCommands", "()Ljava/util/List;", "sendClientMessage", "(Ljava/lang/String;)V", "Lnet/minecraft/class_2561;", "(Lnet/minecraft/class_2561;)V", "Lnet/minecraft/class_5250;", "buildPrefix", "()Lnet/minecraft/class_5250;", "Lkotlin/Pair;", "", "prefixSegments", "Ljava/util/List;", "Lcom/mojang/brigadier/CommandDispatcher;", "dispatcher", "Lcom/mojang/brigadier/CommandDispatcher;", "getDispatcher", "()Lcom/mojang/brigadier/CommandDispatcher;", "", "commandList", "rain-visuals"})
public final class \u062f\u0625
implements \u0647 {
    @NotNull
    public static final \u062f\u0625 INSTANCE = new \u062f\u0625();
    @NotNull
    private static final CommandDispatcher<ClientCommandSource> dispatcher;
    @NotNull
    private static final List<Pair<Character, Integer>> prefixSegments;
    @NotNull
    private static final List<Command> commandList;

    /*
     * WARNING - void declaration
     */
    private final MutableText buildPrefix() {
        void var1_1;
        MutableText mutableText = Text.empty();
        Intrinsics.checkNotNullExpressionValue(mutableText, "empty(...)");
        MutableText text = mutableText;
        Iterable $this$forEach$iv = prefixSegments;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            Pair pair = (Pair)element$iv;
            boolean bl = false;
            char c = ((Character)pair.component1()).charValue();
            int color = ((Number)pair.component2()).intValue();
            text.append((Text)Text.literal((String)String.valueOf(c)).setStyle(Style.EMPTY.withColor(TextColor.fromRgb((int)color)).withBold(Boolean.valueOf(true))));
        }
        return var1_1;
    }

    @NotNull
    public final CommandDispatcher<ClientCommandSource> getDispatcher() {
        return dispatcher;
    }

    public final void registerCommands(Command ... commands) {
        Intrinsics.checkNotNullParameter(commands, "commands");
        Command[] $this$forEach$iv = commands;
        boolean $i$f$forEach = false;
        int n = $this$forEach$iv.length;
        for (int i = 0; i < n; ++i) {
            Command element$iv;
            Command command = element$iv = $this$forEach$iv[i];
            boolean bl = false;
            command.register(dispatcher);
            commandList.add(command);
        }
    }

    static {
        Pair[] pairArray = new Pair[7];
        pairArray[0] = TuplesKt.to(Character.valueOf('['), 0x737373);
        pairArray[1] = TuplesKt.to(Character.valueOf('R'), 0x737373);
        pairArray[2] = TuplesKt.to(Character.valueOf('a'), 0x737373);
        pairArray[3] = TuplesKt.to(Character.valueOf('i'), 0x929292);
        pairArray[4] = TuplesKt.to(Character.valueOf('n'), 0xB1B1B1);
        pairArray[5] = TuplesKt.to(Character.valueOf(']'), 0xD0D0D0);
        pairArray[6] = TuplesKt.to(Character.valueOf(':'), 0xEFEFEF);
        prefixSegments = CollectionsKt.listOf(pairArray);
        dispatcher = new CommandDispatcher();
        commandList = new ArrayList();
    }

    @NotNull
    public final String getPrefix() {
        return ".";
    }

    /*
     * WARNING - void declaration
     */
    public final void createCommands(@NotNull String message, @NotNull CallbackInfo ci) {
        void var2_2;
        boolean bl;
        block9: {
            int n;
            String commandText;
            block8: {
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(ci, "ci");
                if (!StringsKt.startsWith$default(message, this.getPrefix(), false, 2, null)) {
                    return;
                }
                String string = message.substring(this.getPrefix().length());
                Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
                commandText = string;
                CharSequence $this$indexOfFirst$iv = commandText;
                boolean $i$f$indexOfFirst = false;
                int n2 = $this$indexOfFirst$iv.length();
                for (int index$iv = 0; index$iv < n2; ++index$iv) {
                    char p0 = $this$indexOfFirst$iv.charAt(index$iv);
                    boolean bl2 = false;
                    if (!CharsKt.isWhitespace(p0)) continue;
                    n = index$iv;
                    break block8;
                }
                n = -1;
            }
            int index = n;
            boolean bl3 = false;
            int commandEnd = index == -1 ? commandText.length() : index;
            String string = commandText.substring(0, commandEnd);
            Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
            String commandName = string;
            Iterable $this$none$iv = commandList;
            boolean $i$f$none = false;
            if ($this$none$iv instanceof Collection && ((Collection)$this$none$iv).isEmpty()) {
                bl = true;
            } else {
                for (Object element$iv : $this$none$iv) {
                    Command command = (Command)element$iv;
                    boolean bl4 = false;
                    if (!StringsKt.equals(command.getName(), commandName, true)) continue;
                    bl = false;
                    break block9;
                }
                bl = true;
            }
        }
        if (bl) {
            return;
        }
        try {
            void var3_3;
            dispatcher.execute((String)var3_3, (Object)this.source());
        }
        catch (CommandSyntaxException commandSyntaxException) {
        }
        var2_2.cancel();
    }

    @Nullable
    public final ParseResults<ClientCommandSource> parse(@NotNull StringReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        ClientCommandSource clientCommandSource = this.source();
        if (clientCommandSource == null) {
            return null;
        }
        ClientCommandSource source = clientCommandSource;
        return dispatcher.parse(reader, (Object)source);
    }

    @Override
    public void load() {
    }

    @NotNull
    public final List<Command> getCommands() {
        return CollectionsKt.toList((Iterable)commandList);
    }

    @Nullable
    public final ClientCommandSource source() {
        ClientPlayNetworkHandler clientPlayNetworkHandler = \u0636\u0643.getMc().getNetworkHandler();
        return clientPlayNetworkHandler != null ? clientPlayNetworkHandler.getCommandSource() : null;
    }

    private \u062f\u0625() {
    }

    public final CompletableFuture<Suggestions> suggest(@NotNull ParseResults<?> parseResults, int cursor) {
        Intrinsics.checkNotNullParameter(parseResults, "parseResults");
        return dispatcher.getCompletionSuggestions(parseResults, cursor);
    }

    public final void sendClientMessage(@NotNull Text message) {
        Intrinsics.checkNotNullParameter(message, "message");
        InGameHud inGameHud = \u0636\u0643.getMc().inGameHud;
        if (inGameHud == null) {
            return;
        }
        InGameHud hud = inGameHud;
        hud.getChatHud().addMessage((Text)this.buildPrefix().append((Text)Text.literal((String)" ")).append(message));
    }

    public final void sendClientMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        MutableText mutableText = Text.literal((String)message);
        Intrinsics.checkNotNullExpressionValue(mutableText, "literal(...)");
        this.sendClientMessage((Text)mutableText);
    }
}

