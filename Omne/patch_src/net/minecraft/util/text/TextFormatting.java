package net.minecraft.util.text;

import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import com.google.common.collect.Maps;

public enum TextFormatting {
    BLACK("BLACK", '0', 0, getColor(0, 1.0f)),
    DARK_BLUE("DARK_BLUE", '1', 1, getColor(170, 1.0f)),
    DARK_GREEN("DARK_GREEN", '2', 2, getColor(43520, 1.0f)),
    DARK_AQUA("DARK_AQUA", '3', 3, getColor(43690, 1.0f)),
    DARK_RED("DARK_RED", '4', 4, getColor(11141120, 1.0f)),
    DARK_PURPLE("DARK_PURPLE", '5', 5, getColor(11141290, 1.0f)),
    GOLD("GOLD", '6', 6, getColor(16755200, 1.0f)),
    GRAY("GRAY", '7', 7, getColor(11184810, 1.0f)),
    DARK_GRAY("DARK_GRAY", '8', 8, getColor(5592405, 1.0f)),
    BLUE("BLUE", '9', 9, getColor(5592575, 1.0f)),
    GREEN("GREEN", 'a', 10, getColor(5635925, 1.0f)),
    AQUA("AQUA", 'b', 11, getColor(5636095, 1.0f)),
    RED("RED", 'c', 12, getColor(16733525, 1.0f)),
    LIGHT_PURPLE("LIGHT_PURPLE", 'd', 13, getColor(16733695, 1.0f)),
    YELLOW("YELLOW", 'e', 14, getColor(16777045, 1.0f)),
    WHITE("WHITE", 'f', 15, getColor(16777215, 1.0f)),
    OBFUSCATED("OBFUSCATED", 'k', true),
    BOLD("BOLD", 'l', true),
    STRIKETHROUGH("STRIKETHROUGH", 'm', true),
    UNDERLINE("UNDERLINE", 'n', true),
    ITALIC("ITALIC", 'o', true),
    RESET("RESET", 'r', -1, null);

    public static final char COLOR_CODE = '\u00a7'; // §
    private static final Map<String, TextFormatting> NAME_MAPPING = Maps.newHashMap();
    private static final Pattern FORMATTING_CODE_PATTERN = Pattern.compile("(?i)" + COLOR_CODE + "[0-9A-FK-OR]");

    private final String name;
    private final char formattingCode;
    private final boolean fancyStyling;
    private final String controlString;
    private final int colorIndex;
    private final Integer color;

    private static Integer getColor(int val, float alpha) {
        return native0.XWyClY3Ug1T642Ca1iz6mRWBoajR6A09S3yldH0HJlMS9teTd6buwCdLg93yR4hEoGs.Rqe7hvzsosxW097QxlujehbF48k7aU05kC7reGEkkBh7quB2hW8kqYAgcncnGQ7IrELh(val, alpha);
    }

    private static String lowercaseAlpha(String name) {
        return name.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
    }

    private TextFormatting(String name, char formattingCode, int colorIndex, Integer color) {
        this.name = name;
        this.formattingCode = formattingCode;
        this.fancyStyling = false;
        this.colorIndex = colorIndex;
        this.color = color;
        this.controlString = "" + COLOR_CODE + formattingCode;
    }

    private TextFormatting(String name, char formattingCode, boolean fancyStyling) {
        this.name = name;
        this.formattingCode = formattingCode;
        this.fancyStyling = fancyStyling;
        this.colorIndex = -1;
        this.color = null;
        this.controlString = "" + COLOR_CODE + formattingCode;
    }

    public int getColorIndex() {
        return this.colorIndex;
    }

    public boolean isFancyStyling() {
        return this.fancyStyling;
    }

    public boolean isColor() {
        return !this.fancyStyling && this != RESET;
    }

    public Integer getColor() {
        return this.color;
    }

    public String getFriendlyName() {
        return this.name().toLowerCase(Locale.ROOT);
    }

    @Override
    public String toString() {
        return this.controlString;
    }

    public static String strip(String string) {
        return string == null ? null : FORMATTING_CODE_PATTERN.matcher(string).replaceAll("");
    }

    public static String removeFormatting(String string) {
        return string == null ? null : FORMATTING_CODE_PATTERN.matcher(string).replaceAll("");
    }

    public static TextFormatting getValueByName(String name) {
        return name == null ? null : NAME_MAPPING.get(lowercaseAlpha(name));
    }

    public static TextFormatting fromColorIndex(int index) {
        if (index < 0) {
            return RESET;
        }
        for (TextFormatting tf : values()) {
            if (tf.colorIndex == index) {
                return tf;
            }
        }
        return null;
    }

    public static TextFormatting fromFormattingCode(char code) {
        char lower = Character.toLowerCase(code);
        for (TextFormatting tf : values()) {
            if (tf.formattingCode == lower) {
                return tf;
            }
        }
        return null;
    }

    public static Collection<String> getValidValues(boolean colors, boolean styles) {
        java.util.List<String> list = com.google.common.collect.Lists.newArrayList();
        for (TextFormatting tf : values()) {
            if ((!tf.isColor() || colors) && (!tf.isFancyStyling() || styles)) {
                list.add(tf.getFriendlyName());
            }
        }
        return list;
    }

    static {
        for (TextFormatting tf : values()) {
            NAME_MAPPING.put(lowercaseAlpha(tf.name), tf);
        }
    }
}
