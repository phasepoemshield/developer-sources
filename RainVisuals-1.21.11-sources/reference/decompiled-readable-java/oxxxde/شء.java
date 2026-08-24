/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.function.Consumer;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u062b\u064b;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0013\u00a8\u0006\u0015"}, d2={"Loxxxde/\u0634\u0621;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "message", "getHoveredTranslation", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/function/Consumer;", "callback", "", "interceptOutgoingMessage", "(Ljava/lang/String;Ljava/util/function/Consumer;)Z", "text", "containsNonCyrillicLetters", "(Ljava/lang/String;)Z", "containsCyrillicLetters", "Loxxxde/\u062e\u0630;", "incomingTranslation", "Loxxxde/\u062e\u0630;", "outgoingTranslation", "rain-visuals"})
public final class \u0634\u0621
extends Module {
    @NotNull
    private static final BooleanSetting outgoingTranslation;
    @NotNull
    private static final BooleanSetting incomingTranslation;
    @NotNull
    public static final \u0634\u0621 INSTANCE;

    @Nullable
    public final String getHoveredTranslation(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!(this.isEnabled() && ((Boolean)incomingTranslation.getValue()).booleanValue() && this.containsNonCyrillicLetters(message))) {
            return "";
        }
        return \u062b\u064b.getCachedOrRequest(message, "auto", "ru");
    }

    private static final void interceptOutgoingMessage$lambda$0(Consumer $callback, String translation) {
        \u0636\u0643.getMc().execute(() -> \u0634\u0621.interceptOutgoingMessage$lambda$0$0($callback, translation));
    }

    private static final void interceptOutgoingMessage$lambda$0$0(Consumer $callback, String $translation) {
        $callback.accept($translation);
    }

    private \u0634\u0621() {
        super("ChatTranslator", \u0638\u0646.getPLAYER(), "\u041f\u0435\u0440\u0435\u0432\u043e\u0434\u0447\u0438\u043a \u043e\u0442\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u043d\u044b\u0445 \u0438 \u0432\u0445\u043e\u0434\u044f\u0449\u0438\u0445 \u0441\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u0439");
    }

    static {
        INSTANCE = new \u0634\u0621();
        incomingTranslation = Module.boolean$default(INSTANCE, "\u041f\u0435\u0440\u0435\u0432\u043e\u0434 \u0432\u0445\u043e\u0434\u044f\u0449\u0438\u0445", true, null, 4, null);
        outgoingTranslation = Module.boolean$default(INSTANCE, "\u041f\u0435\u0440\u0435\u0432\u043e\u0434 \u043e\u0442\u043f\u0440\u0430\u0432\u043a\u0438", true, null, 4, null);
    }

    public final boolean interceptOutgoingMessage(@NotNull String message, @NotNull Consumer<String> callback) {
        block3: {
            block2: {
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(callback, "callback");
                if (!this.isEnabled() || !((Boolean)outgoingTranslation.getValue()).booleanValue()) break block2;
                if (StringsKt.startsWith$default(message, "/", false, 2, null)) break block2;
                if (this.containsCyrillicLetters(message)) break block3;
            }
            return false;
        }
        \u062b\u064b.translateAsync(message, "ru", "en", arg_0 -> \u0634\u0621.interceptOutgoingMessage$lambda$0(callback, arg_0));
        return true;
    }

    private final boolean containsCyrillicLetters(String text) {
        boolean bl;
        block1: {
            CharSequence $this$any$iv = text;
            boolean $i$f$any = false;
            for (int i = 0; i < $this$any$iv.length(); ++i) {
                char element$iv;
                char it = element$iv = $this$any$iv.charAt(i);
                boolean bl2 = false;
                boolean bl3 = Character.isLetter(it) && Character.UnicodeScript.of(it) == Character.UnicodeScript.CYRILLIC;
                if (!bl3) continue;
                bl = true;
                break block1;
            }
            bl = false;
        }
        return bl;
    }

    private final boolean containsNonCyrillicLetters(String text) {
        boolean bl;
        block1: {
            CharSequence $this$any$iv = text;
            boolean $i$f$any = false;
            for (int i = 0; i < $this$any$iv.length(); ++i) {
                char element$iv;
                char it = element$iv = $this$any$iv.charAt(i);
                boolean bl2 = false;
                boolean bl3 = Character.isLetter(it) && Character.UnicodeScript.of(it) != Character.UnicodeScript.CYRILLIC;
                if (!bl3) continue;
                bl = true;
                break block1;
            }
            bl = false;
        }
        return bl;
    }
}

