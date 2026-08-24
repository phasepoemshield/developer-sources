/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ru.ocz.protection.annotation.Compile
 */
package kotakbaz.rain.module.modules.player;

import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotakbaz.rain.command.Command;
import kotakbaz.rain.event.events.ChatMessageEvent;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062f\u0625;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.annotation.Compile;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0015\u00a8\u0006\u0017"}, d2={"Loxxxde/\u062f\u0651;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u062f\u0634;", "event", "", "onMessage", "(Lkotakbaz/rain/event/events/ChatMessageEvent;)V", "", "token", "", "shouldConvertToSlash", "(Ljava/lang/String;)Z", "translateCommandToken", "(Ljava/lang/String;)Ljava/lang/String;", "", "char", "translateChar", "(C)C", "RU_LAYOUT", "Ljava/lang/String;", "EN_LAYOUT", "rain-visuals"})
public final class CommandFixModule
extends Module {
    @NotNull
    private static final String RU_LAYOUT = "\u0439\u0446\u0443\u043a\u0435\u043d\u0433\u0448\u0449\u0437\u0445\u044a\u0444\u044b\u0432\u0430\u043f\u0440\u043e\u043b\u0434\u0436\u044d\u044f\u0447\u0441\u043c\u0438\u0442\u044c\u0431\u044e";
    @NotNull
    private static final String EN_LAYOUT = "qwertyuiop[]asdfghjkl;'zxcvbnm,.";
    @NotNull
    public static final CommandFixModule INSTANCE = new CommandFixModule();

    /*
     * WARNING - void declaration
     */
    private final String translateCommandToken(String token) {
        void var1_1;
        void var3_3;
        boolean changed = false;
        char[] translated = new char[token.length()];
        CharSequence $this$forEachIndexed$iv = token;
        boolean $i$f$forEachIndexed = false;
        int index$iv = 0;
        for (int i = 0; i < $this$forEachIndexed$iv.length(); ++i) {
            char item$iv = $this$forEachIndexed$iv.charAt(i);
            int n = index$iv++;
            char c = item$iv;
            int index = n;
            boolean bl = false;
            char mapped = INSTANCE.translateChar(c);
            translated[index] = mapped;
            changed = changed || mapped != c;
        }
        return changed ? new String((char[])var3_3) : var1_1;
    }

    private final char translateChar(char c) {
        return switch (c) {
            case '\u0451' -> '`';
            case '\u0401' -> '~';
            default -> {
                void var3_3;
                int index = StringsKt.indexOf$default((CharSequence)RU_LAYOUT, Character.toLowerCase(c), 0, false, 6, null);
                if (index == -1) {
                    yield c;
                }
                char mapped = EN_LAYOUT.charAt(index);
                yield Character.isUpperCase(c) ? Character.toUpperCase(mapped) : var3_3;
            }
        };
    }

    private CommandFixModule() {
        super("CommandFix", \u0638\u0646.getPLAYER(), "\u0418\u0441\u043f\u0440\u0430\u0432\u043b\u044f\u0435\u0442 \u043a\u043e\u043c\u0430\u043d\u0434\u044b \u043d\u0430 \u0440\u0443\u0441\u0441\u043a\u043e\u0439 \u0440\u0430\u0441\u043a\u043b\u0430\u0434\u043a\u0435");
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean shouldConvertToSlash(String token) {
        void var7_7;
        String string = token.substring(1);
        Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
        String string2 = string;
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String string3 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string3, "toLowerCase(...)");
        String commandName = string3;
        if (((CharSequence)commandName).length() <= 0) return false;
        boolean bl = true;
        if (!bl) return false;
        Iterable $this$none$iv = \u062f\u0625.INSTANCE.getCommands();
        boolean $i$f$none = false;
        if ($this$none$iv instanceof Collection) {
            if (((Collection)$this$none$iv).isEmpty()) {
                return true;
            }
        }
        Iterator iterator2 = $this$none$iv.iterator();
        do {
            if (!iterator2.hasNext()) return true;
            Object element$iv = iterator2.next();
            Command it = (Command)element$iv;
            boolean bl2 = false;
        } while (!StringsKt.equals(var7_7.getName(), commandName, true));
        return false;
    }

    @Commando
    @Compile
    public final void onMessage(@NotNull ChatMessageEvent chatMessageEvent) {
        String string;
        int n;
        String string2;
        block8: {
            Intrinsics.checkNotNullParameter(chatMessageEvent, "event");
            if (!chatMessageEvent.getSend()) {
                return;
            }
            string2 = chatMessageEvent.getText();
            if (string2.length() == 0) {
                return;
            }
            CharSequence charSequence = string2;
            char c = StringsKt.first(charSequence);
            if (c != '.' && c != '/') {
                return;
            }
            int n2 = charSequence.length();
            for (int i = 0; i < n2; ++i) {
                if (!CharsKt.isWhitespace(charSequence.charAt(i))) {
                    continue;
                }
                n = i;
                break block8;
            }
            n = string2.length();
        }
        String string3 = string2.substring(0, n);
        Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
        String string4 = string3;
        String string5 = this.translateCommandToken(string4);
        if (Intrinsics.areEqual(string5, string4)) {
            return;
        }
        if (this.shouldConvertToSlash(string5)) {
            String string6 = string5.substring(1);
            Intrinsics.checkNotNullExpressionValue(string6, "substring(...)");
            string = CommandFixModule.lamda$onMessage$1_2e3b4394(string6);
        } else {
            string = string5;
        }
        String string7 = string2.substring(n);
        Intrinsics.checkNotNullExpressionValue(string7, "substring(...)");
        String string8 = string7;
        chatMessageEvent.setText(CommandFixModule.lamda$onMessage$2_70ccb3bf(string, string8));
    }

    static /* synthetic */ String lamda$onMessage$1_2e3b4394(String string) {
        return "/" + string;
    }

    static /* synthetic */ String lamda$onMessage$2_70ccb3bf(String string, String string2) {
        return string + string2;
    }
}

