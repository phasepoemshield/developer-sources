/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.text.Text
 */
package oxxxde;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001b\u00a8\u0006\u001d"}, d2={"Loxxxde/\u0636\u064e;", "", "<init>", "()V", "Lnet/minecraft/class_2561;", "text", "", "sanitizeName", "(Lnet/minecraft/class_2561;)Ljava/lang/String;", "", "tokens", "", "removeMirroredBorderTokens", "(Ljava/util/List;)V", "token", "", "isPureDecoration", "(Ljava/lang/String;)Z", "", "codePointCount", "(Ljava/lang/String;)I", "STAR_MARKER", "Ljava/lang/String;", "MAX_BORDER_TOKEN_LENGTH", "I", "Lkotlin/text/Regex;", "whitespaceRegex", "Lkotlin/text/Regex;", "heartMarkerRegex", "rain-visuals"})
public final class \u0636\u064e {
    @NotNull
    private static final String STAR_MARKER = "[\u2605]";
    @NotNull
    private static final Regex heartMarkerRegex;
    private static final int MAX_BORDER_TOKEN_LENGTH = 8;
    @NotNull
    public static final \u0636\u064e INSTANCE;
    @NotNull
    private static final Regex whitespaceRegex;

    static {
        INSTANCE = new \u0636\u064e();
        whitespaceRegex = new Regex("[\\s\\u00A0]+");
        heartMarkerRegex = new Regex("^\\[\\s*<3\\s*]$", RegexOption.IGNORE_CASE);
    }

    /*
     * WARNING - void declaration
     */
    @JvmStatic
    @NotNull
    public static final String sanitizeName(@NotNull Text text) {
        void var2_4;
        Intrinsics.checkNotNullParameter(text, "text");
        String string = text.getString();
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Object object = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(string, STAR_MARKER, " ", false, 4, null), '\u200b', ' ', false, 4, null), '\u200c', ' ', false, 4, null), '\u200d', ' ', false, 4, null), '\ufeff', ' ', false, 4, null);
        boolean bl = false;
        String normalized = ((Object)StringsKt.trim((CharSequence)whitespaceRegex.replace((CharSequence)object, " "))).toString();
        boolean bl2 = ((CharSequence)normalized).length() == 0;
        if (bl2) {
            return "";
        }
        object = new char[1];
        object[0] = 32;
        List<String> tokens = CollectionsKt.toMutableList(StringsKt.split$default((CharSequence)normalized, (char[])object, false, 0, 6, null));
        INSTANCE.removeMirroredBorderTokens(tokens);
        while (true) {
            boolean bl3 = !((Collection)tokens).isEmpty();
            if (!bl3) break;
            if (!INSTANCE.isPureDecoration(CollectionsKt.first(tokens))) break;
            tokens.remove(0);
        }
        while (true) {
            boolean bl4 = !((Collection)tokens).isEmpty();
            if (!bl4) break;
            if (!INSTANCE.isPureDecoration(CollectionsKt.last(tokens))) break;
            tokens.remove(CollectionsKt.getLastIndex(tokens));
        }
        return ((Object)StringsKt.trim((CharSequence)CollectionsKt.joinToString$default((Iterable)var2_4, " ", null, null, 0, null, null, 62, null))).toString();
    }

    private final int codePointCount(String $this$codePointCount) {
        return $this$codePointCount.codePointCount(0, $this$codePointCount.length());
    }

    private final void removeMirroredBorderTokens(List<String> tokens) {
        while (tokens.size() >= 3) {
            String first = CollectionsKt.first(tokens);
            String last = CollectionsKt.last(tokens);
            if (!StringsKt.equals(first, last, true)) {
                return;
            }
            if (this.codePointCount(first) > 8) {
                return;
            }
            tokens.remove(CollectionsKt.getLastIndex(tokens));
            tokens.remove(0);
        }
    }

    private \u0636\u064e() {
    }

    private final boolean isPureDecoration(String token) {
        block4: {
            block3: {
                if (((CharSequence)token).length() == 0) break block3;
                if (!heartMarkerRegex.matches(token)) break block4;
            }
            return true;
        }
        return token.codePoints().noneMatch(\u0636\u064e::isPureDecoration$lambda$0);
    }

    private static final boolean isPureDecoration$lambda$0(int codePoint) {
        return Character.isLetterOrDigit(codePoint);
    }
}

