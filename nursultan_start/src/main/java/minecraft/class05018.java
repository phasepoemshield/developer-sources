/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.features.limitation.max_chat_length.MaxChatLength
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.viaversion.viafabricplus.features.limitation.max_chat_length.MaxChatLength;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class04995;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class class05018 {
    private static final Pattern N = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");
    private static final Pattern y = Pattern.compile("\\r\\n|\\v");
    private static final Pattern L = Pattern.compile("(?:\\r\\n|\\v)$");

    public static int L(String string) {
        if (string.isEmpty()) {
            return 0;
        }
        Matcher matcher = y.matcher(string);
        int n = 1;
        while (matcher.find()) {
            ++n;
        }
        return n;
    }

    public static String M(String string) {
        return class05018.N(string, false);
    }

    public static boolean B(@Nullable String string) {
        if (string == null || string.isEmpty()) {
            return true;
        }
        return string.chars().allMatch(class05018::y);
    }

    public static String i(String string) {
        return class05018.N(string, class05018.u(256), false);
    }

    private static int u(int n) {
        return MaxChatLength.getChatLength();
    }

    public static boolean u(String string) {
        return L.matcher(string).find();
    }

    public static boolean y(@Nullable String string) {
        return StringUtils.isEmpty((CharSequence)string);
    }

    public static boolean y(int n) {
        return Character.isWhitespace(n) || Character.isSpaceChar(n);
    }

    public static boolean N(int n) {
        return n != 167 && n >= 32 && n != 127;
    }

    public static String N(int n, float f) {
        int n2 = class04995.y((float)n / f);
        int n3 = n2 / 60;
        n2 %= 60;
        int n4 = n3 / 60;
        n3 %= 60;
        if (n4 > 0) {
            return String.format(Locale.ROOT, "%02d:%02d:%02d", n4, n3, n2);
        }
        return String.format(Locale.ROOT, "%02d:%02d", n3, n2);
    }

    public static String N(String string) {
        return N.matcher(string).replaceAll("");
    }

    public static String N(String string, int n, boolean bl) {
        if (string.length() <= n) {
            return string;
        }
        if (bl && n > 3) {
            return string.substring(0, n - 3) + "...";
        }
        return string.substring(0, n);
    }

    public static String N(String string, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (class05018.N(c)) {
                stringBuilder.append(c);
                continue;
            }
            if (!bl || c != '\n') continue;
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static boolean R(String string) {
        if (string.length() > 16) {
            return false;
        }
        return string.chars().filter(n -> n <= 32 || n >= 127).findAny().isEmpty();
    }
}

