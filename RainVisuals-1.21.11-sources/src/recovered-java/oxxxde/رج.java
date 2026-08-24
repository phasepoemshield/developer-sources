/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.text.Text
 *  net.minecraft.util.Formatting
 */
package oxxxde;

import java.util.Locale;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0003R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001e"}, d2={"Loxxxde/\u0631\u062c;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "", "clearHistory", "shouldKeepHistory", "(Z)Z", "Lnet/minecraft/class_2561;", "message", "processIncomingMessage", "(Lnet/minecraft/class_2561;)Lnet/minecraft/class_2561;", "onChatCleared", "", "text", "normalize", "(Ljava/lang/String;)Ljava/lang/String;", "resetAntiFlood", "Loxxxde/\u062e\u0630;", "keepHistory", "Loxxxde/\u062e\u0630;", "antiFlood", "lastMessageKey", "Ljava/lang/String;", "", "repeatCount", "I", "rain-visuals"})
public final class \u0631\u062c
extends Module {
    @NotNull
    private static final BooleanSetting keepHistory;
    private static int repeatCount;
    @NotNull
    private static final BooleanSetting antiFlood;
    @Nullable
    private static String lastMessageKey;
    @NotNull
    public static final \u0631\u062c INSTANCE;

    static {
        INSTANCE = new \u0631\u062c();
        keepHistory = Module.boolean$default(INSTANCE, "\u0418\u0441\u0442\u043e\u0440\u0438\u044f \u0447\u0430\u0442\u0430", false, null, 4, null);
        antiFlood = Module.boolean$default(INSTANCE, "\u0410\u043d\u0442\u0438-\u0444\u043b\u0443\u0434", true, null, 4, null);
        antiFlood.onChange(\u0631\u062c::_init_$lambda$0);
    }

    public final boolean shouldKeepHistory(boolean clearHistory) {
        return this.isEnabled() && ((Boolean)keepHistory.getValue()).booleanValue() && clearHistory;
    }

    private final void resetAntiFlood() {
        lastMessageKey = null;
        repeatCount = 0;
    }

    public final void onChatCleared() {
        this.resetAntiFlood();
    }

    @Nullable
    public final Text processIncomingMessage(@NotNull Text message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!this.isEnabled() || !((Boolean)antiFlood.getValue()).booleanValue()) {
            this.resetAntiFlood();
            return null;
        }
        String string = message.getString();
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String key = this.normalize(string);
        boolean bl = ((CharSequence)key).length() == 0;
        if (bl) {
            this.resetAntiFlood();
            return null;
        }
        if (!Intrinsics.areEqual(key, lastMessageKey)) {
            lastMessageKey = key;
            repeatCount = 1;
            return null;
        }
        int n = repeatCount;
        repeatCount = n + 1;
        return (Text)message.copy().append((Text)Text.literal((String)(" [x" + repeatCount + "]")).formatted(Formatting.GRAY));
    }

    private static final Unit _init_$lambda$0(boolean enabled) {
        if (!enabled) {
            INSTANCE.resetAntiFlood();
        }
        return Unit.INSTANCE;
    }

    @Override
    public void onEnable() {
        this.resetAntiFlood();
    }

    private final String normalize(String text) {
        CharSequence charSequence = ((Object)StringsKt.trim((CharSequence)text)).toString();
        Regex regex = new Regex("\\s+");
        String string = " ";
        charSequence = regex.replace(charSequence, string);
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String string2 = ((String)charSequence).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        return string2;
    }

    private \u0631\u062c() {
        super("ChatHelper", \u0638\u0646.getPLAYER(), "\u0420\u0430\u0437\u043b\u0438\u0447\u043d\u044b\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 \u0447\u0430\u0442\u0430");
    }

    @Override
    public void onDisable() {
        this.resetAntiFlood();
    }
}

