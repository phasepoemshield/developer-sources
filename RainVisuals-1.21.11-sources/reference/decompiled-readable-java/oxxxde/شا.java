/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\u0012\u0010\fJ#\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010 \u00a8\u0006\""}, d2={"Loxxxde/\u0634\u0627;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "shouldMask", "()Z", "", "message", "isSensitivePrefix", "(Ljava/lang/String;)Z", "maskIfSensitive", "(Ljava/lang/String;)Ljava/lang/String;", "maskForHistory", "", "", "findSensitiveRanges", "(Ljava/lang/String;)Ljava/util/List;", "restoreOriginalIfMasked", "useAsterisks", "maskSensitive", "(Ljava/lang/String;Z)Ljava/lang/String;", "", "start", "findNextCommandStart", "(Ljava/lang/String;I)I", "commandLength", "isRegisterCommand", "(Ljava/lang/String;II)Z", "getCommandLength", "", "registerCommands", "Ljava/util/Set;", "supportedCommands", "rain-visuals"})
public final class \u0634\u0627
extends Module {
    @NotNull
    public static final \u0634\u0627 INSTANCE = new \u0634\u0627();
    @NotNull
    private static final Set<String> registerCommands;
    @NotNull
    private static final Set<String> supportedCommands;

    @Nullable
    public final String maskForHistory(@Nullable String message) {
        return this.maskSensitive(message, true);
    }

    /*
     * WARNING - void declaration
     */
    private final int findNextCommandStart(String message, int start) {
        int index = start;
        int n = message.length();
        while (index < n) {
            void var3_3;
            block3: {
                block4: {
                    if (message.charAt(index) != '/') break block3;
                    if (index == 0) break block4;
                    if (!CharsKt.isWhitespace(message.charAt(index + -1))) break block3;
                }
                return index;
            }
            ++var3_3;
        }
        return -1;
    }

    public final boolean shouldMask() {
        return this.isEnabled();
    }

    @Nullable
    public final String restoreOriginalIfMasked(@Nullable String message) {
        return message;
    }

    /*
     * WARNING - void declaration
     */
    private final String maskSensitive(String message, boolean useAsterisks) {
        void var1_1;
        void var3_3;
        void var4_4;
        if (message == null) {
            return null;
        }
        StringBuilder result = new StringBuilder(message.length() + 16);
        boolean changed = false;
        int cursor = 0;
        while (cursor < message.length()) {
            void var9_9;
            int slashIndex = this.findNextCommandStart(message, cursor);
            if (slashIndex < 0) {
                result.append(message, cursor, message.length());
                break;
            }
            int commandLength = this.getCommandLength(message, slashIndex);
            if (commandLength == 0) {
                result.append(message, cursor, slashIndex + 1);
                cursor = slashIndex + 1;
                continue;
            }
            int argsToMask = this.isRegisterCommand(message, slashIndex, commandLength) ? 2 : 1;
            result.append(message, cursor, slashIndex + commandLength);
            int index = 0;
            index = slashIndex + commandLength;
            for (int i = 0; i < argsToMask; ++i) {
                int it = i;
                boolean bl = false;
                int spacesStart = index;
                while (index < message.length() && CharsKt.isWhitespace(message.charAt(index))) {
                    ++index;
                }
                result.append(message, spacesStart, index);
                int start = index;
                while (index < message.length() && !CharsKt.isWhitespace(message.charAt(index))) {
                    ++index;
                }
                if (start == index) continue;
                if (useAsterisks) {
                    int n = index - start;
                    int n2 = 0;
                    while (n2 < n) {
                        int n3 = n2++;
                        boolean bl2 = false;
                        result.append('*');
                    }
                } else {
                    void var14_14;
                    result.append("\u00a70");
                    result.append(message, (int)var14_14, index);
                    result.append("\u00a7r");
                }
                changed = true;
            }
            void var5_5 = var9_9;
        }
        return var4_4 != false ? var3_3.toString() : var1_1;
    }

    /*
     * Unable to fully structure code
     */
    @NotNull
    public final List<int[]> findSensitiveRanges(@Nullable String message) {
        ranges = new ArrayList<E>();
        var3_3 = message;
        if (var3_3 == null) ** GOTO lbl-1000
        if (var3_3.length() == 0) lbl-1000:
        // 2 sources

        {
            v0 = true;
        } else {
            v0 = false;
        }
        if (v0) {
            return ranges;
        }
        cursor = 0;
        while (cursor < message.length()) {
            slashIndex = this.findNextCommandStart(message, cursor);
            if (slashIndex < 0) break;
            commandLength = this.getCommandLength(message, slashIndex);
            if (commandLength == 0) {
                cursor = slashIndex + 1;
                continue;
            }
            argsToMask = this.isRegisterCommand(message, slashIndex, commandLength) ? 2 : 1;
            index = 0;
            index = slashIndex + commandLength;
            for (var8_9 = 0; var8_9 < argsToMask; ++var8_9) {
                it = var8_9;
                $i$a$-repeat-PasHiderModule$findSensitiveRanges$1 = false;
                while (index < message.length() && CharsKt.isWhitespace(message.charAt(index))) {
                    ++index;
                }
                start = index;
                while (index < message.length() && !CharsKt.isWhitespace(message.charAt(index))) {
                    ++index;
                }
                if (start == index) continue;
                var12_13 = ranges;
                var13_14 = new int[2];
                var13_14[0] = start;
                var13_14[1] = index;
                var12_13.add(var13_14);
            }
            var3_4 = var7_8;
        }
        return (List)var2_2;
    }

    @Nullable
    public final String maskIfSensitive(@Nullable String message) {
        return this.maskSensitive(message, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isSensitivePrefix(@Nullable String message) {
        String it;
        String string;
        if (message == null) {
            return false;
        }
        Iterable $this$any$iv = supportedCommands;
        boolean $i$f$any = false;
        if ($this$any$iv instanceof Collection) {
            if (((Collection)$this$any$iv).isEmpty()) {
                return false;
            }
        }
        Iterator iterator2 = $this$any$iv.iterator();
        do {
            if (!iterator2.hasNext()) return false;
            Object element$iv = iterator2.next();
            it = (String)element$iv;
            boolean bl = false;
            String string2 = ((Object)StringsKt.trim((CharSequence)message)).toString();
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
            string = string2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
        } while (!StringsKt.startsWith$default(string, it + " ", false, 2, null));
        return true;
    }

    private final boolean isRegisterCommand(String message, int start, int commandLength) {
        String string = message.substring(start, start + commandLength);
        Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
        String string2 = string;
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String string3 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string3, "toLowerCase(...)");
        return registerCommands.contains(string3);
    }

    private \u0634\u0627() {
        super("PasHider", \u0638\u0646.getPLAYER(), "\u0421\u043a\u0440\u044b\u0432\u0430\u0435\u0442 \u0432\u0432\u043e\u0434 \u043f\u0430\u0440\u043e\u043b\u044f \u0432 \u0447\u0430\u0442");
    }

    private final int getCommandLength(String message, int start) {
        int end;
        for (end = start + 1; end < message.length(); ++end) {
            if (!Character.isLetter(message.charAt(end))) break;
        }
        if (end <= start + 1) {
            return 0;
        }
        String string = message.substring(start, end);
        Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
        String string2 = string;
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String string3 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string3, "toLowerCase(...)");
        String command = string3;
        return supportedCommands.contains(command) ? command.length() : 0;
    }

    static {
        String[] stringArray = new String[2];
        stringArray[0] = "/reg";
        stringArray[1] = "/register";
        registerCommands = SetsKt.setOf(stringArray);
        stringArray = new String[2];
        stringArray[0] = "/l";
        stringArray[1] = "/login";
        supportedCommands = SetsKt.plus(SetsKt.setOf(stringArray), (Iterable)registerCommands);
    }
}

