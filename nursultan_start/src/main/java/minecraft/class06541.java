/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class05033
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import minecraft.class05033;
import org.jspecify.annotations.Nullable;

public final class class06541
extends Enum<class06541>
implements class05033 {
    public static final /* enum */ class06541 field_1074 = new class06541("BLACK", '0', 0, 0);
    public static final /* enum */ class06541 field_1058 = new class06541("DARK_BLUE", '1', 1, 170);
    public static final /* enum */ class06541 field_1077 = new class06541("DARK_GREEN", '2', 2, 43520);
    public static final /* enum */ class06541 field_1062 = new class06541("DARK_AQUA", '3', 3, 43690);
    public static final /* enum */ class06541 field_1079 = new class06541("DARK_RED", '4', 4, 0xAA0000);
    public static final /* enum */ class06541 field_1064 = new class06541("DARK_PURPLE", '5', 5, 0xAA00AA);
    public static final /* enum */ class06541 field_1065 = new class06541("GOLD", '6', 6, 0xFFAA00);
    public static final /* enum */ class06541 field_1080 = new class06541("GRAY", '7', 7, 0xAAAAAA);
    public static final /* enum */ class06541 field_1063 = new class06541("DARK_GRAY", '8', 8, 0x555555);
    public static final /* enum */ class06541 field_1078 = new class06541("BLUE", '9', 9, 0x5555FF);
    public static final /* enum */ class06541 field_1060 = new class06541("GREEN", 'a', 10, 0x55FF55);
    public static final /* enum */ class06541 field_1075 = new class06541("AQUA", 'b', 11, 0x55FFFF);
    public static final /* enum */ class06541 field_1061 = new class06541("RED", 'c', 12, 0xFF5555);
    public static final /* enum */ class06541 field_1076 = new class06541("LIGHT_PURPLE", 'd', 13, 0xFF55FF);
    public static final /* enum */ class06541 field_1054 = new class06541("YELLOW", 'e', 14, 0xFFFF55);
    public static final /* enum */ class06541 field_1068 = new class06541("WHITE", 'f', 15, 0xFFFFFF);
    public static final /* enum */ class06541 field_1051 = new class06541("OBFUSCATED", 'k', true);
    public static final /* enum */ class06541 field_1067 = new class06541("BOLD", 'l', true);
    public static final /* enum */ class06541 field_1055 = new class06541("STRIKETHROUGH", 'm', true);
    public static final /* enum */ class06541 field_1073 = new class06541("UNDERLINE", 'n', true);
    public static final /* enum */ class06541 field_1056 = new class06541("ITALIC", 'o', true);
    public static final /* enum */ class06541 field_1070 = new class06541("RESET", 'r', -1, null);
    public static final Codec<class06541> field_39218;
    public static final Codec<class06541> field_56511;
    public static final char field_33292 = '\u00a7';
    private static final Map<String, class06541> field_1052;
    private static final Pattern field_1066;
    private final String field_1057;
    private final char field_1059;
    private final boolean field_1081;
    private final String field_1069;
    private final int field_1071;
    private final @Nullable Integer field_1053;
    private static final /* synthetic */ class06541[] field_1072;

    private static String L(String string) {
        return string.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
    }

    public boolean L() {
        return this.field_1081;
    }

    private static /* synthetic */ class06541[] M() {
        return new class06541[]{field_1074, field_1058, field_1077, field_1062, field_1079, field_1064, field_1065, field_1080, field_1063, field_1078, field_1060, field_1075, field_1061, field_1076, field_1054, field_1068, field_1051, field_1067, field_1055, field_1073, field_1056, field_1070};
    }

    private class06541(String string2, char c, @Nullable boolean bl, int n2, Integer n3) {
        this.field_1057 = string2;
        this.field_1059 = c;
        this.field_1081 = bl;
        this.field_1071 = n2;
        this.field_1053 = n3;
        this.field_1069 = "\u00a7" + String.valueOf(c);
    }

    private class06541(String string2, char c, boolean bl) {
        this(string2, c, bl, -1, null);
    }

    private class06541(String string2, @Nullable char c, int n2, Integer n3) {
        this(string2, c, false, n2, n3);
    }

    public String toString() {
        return this.field_1069;
    }

    public static class06541[] values() {
        return (class06541[])field_1072.clone();
    }

    public static class06541 valueOf(String string) {
        return Enum.valueOf(class06541.class, string);
    }

    public @Nullable Integer i() {
        return this.field_1053;
    }

    public boolean u() {
        return !this.field_1081 && this != field_1070;
    }

    public int y() {
        return this.field_1071;
    }

    public static @Nullable class06541 y(@Nullable String string) {
        if (string == null) {
            return null;
        }
        return field_1052.get(class06541.L(string));
    }

    public char N() {
        return this.field_1059;
    }

    public static Collection<String> N(boolean bl, boolean bl2) {
        ArrayList arrayList = Lists.newArrayList();
        for (class06541 class065412 : class06541.values()) {
            if (class065412.u() && !bl || class065412.L() && !bl2) continue;
            arrayList.add(class065412.R());
        }
        return arrayList;
    }

    public static @Nullable class06541 N(int n) {
        if (n < 0) {
            return field_1070;
        }
        for (class06541 class065412 : class06541.values()) {
            if (class065412.y() != n) continue;
            return class065412;
        }
        return null;
    }

    public static @Nullable String N(@Nullable String string) {
        return string == null ? null : field_1066.matcher(string).replaceAll("");
    }

    public static @Nullable class06541 N(char c) {
        char c2 = Character.toLowerCase(c);
        for (class06541 class065412 : class06541.values()) {
            if (class065412.field_1059 != c2) continue;
            return class065412;
        }
        return null;
    }

    public String R() {
        return this.name().toLowerCase(Locale.ROOT);
    }

    public String method_15434() {
        return this.R();
    }

    static {
        field_1072 = class06541.M();
        field_39218 = class05033.N(class06541::values);
        field_56511 = field_39218.validate(class065412 -> class065412.L() ? DataResult.error(() -> "Formatting was not a valid color: " + String.valueOf(class065412)) : DataResult.success((Object)class065412));
        field_1052 = Arrays.stream(class06541.values()).collect(Collectors.toMap(class065412 -> class06541.L(class065412.field_1057), class065412 -> class065412));
        field_1066 = Pattern.compile("(?i)\u00a7[0-9A-FK-OR]");
    }
}

