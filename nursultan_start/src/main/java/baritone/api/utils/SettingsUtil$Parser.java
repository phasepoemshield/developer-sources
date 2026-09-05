/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class03529
 *  minecraft.class04206
 *  minecraft.class06581
 *  minecraft.class06993
 *  minecraft.class07111
 */
package baritone.api.utils;

import baritone.api.utils.BlockUtils;
import baritone.api.utils.SettingsUtil$ISettingParser;
import baritone.api.utils.SettingsUtil$Parser$1;
import baritone.api.utils.SettingsUtil$Parser$2;
import java.awt.Color;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class03529;
import minecraft.class04206;
import minecraft.class06581;
import minecraft.class06993;
import minecraft.class07111;

sealed class SettingsUtil$Parser
extends Enum<SettingsUtil$Parser>
implements SettingsUtil$ISettingParser
permits SettingsUtil$Parser$1, SettingsUtil$Parser$2 {
    public static final /* enum */ SettingsUtil$Parser DOUBLE = new SettingsUtil$Parser(Double.class, Double::parseDouble);
    public static final /* enum */ SettingsUtil$Parser BOOLEAN = new SettingsUtil$Parser(Boolean.class, Boolean::parseBoolean);
    public static final /* enum */ SettingsUtil$Parser INTEGER = new SettingsUtil$Parser(Integer.class, Integer::parseInt);
    public static final /* enum */ SettingsUtil$Parser FLOAT = new SettingsUtil$Parser(Float.class, Float::parseFloat);
    public static final /* enum */ SettingsUtil$Parser LONG = new SettingsUtil$Parser(Long.class, Long::parseLong);
    public static final /* enum */ SettingsUtil$Parser STRING = new SettingsUtil$Parser(String.class, String::new);
    public static final /* enum */ SettingsUtil$Parser MIRROR = new SettingsUtil$Parser(class07111.class, class07111::valueOf, Enum::name);
    public static final /* enum */ SettingsUtil$Parser ROTATION = new SettingsUtil$Parser(class06993.class, class06993::valueOf, Enum::name);
    public static final /* enum */ SettingsUtil$Parser COLOR = new SettingsUtil$Parser(Color.class, string -> new Color(Integer.parseInt(string.split(",")[0]), Integer.parseInt(string.split(",")[1]), Integer.parseInt(string.split(",")[2])), color -> color.getRed() + "," + color.getGreen() + "," + color.getBlue());
    public static final /* enum */ SettingsUtil$Parser VEC3I = new SettingsUtil$Parser(class00753.class, string -> new class00753(Integer.parseInt(string.split(",")[0]), Integer.parseInt(string.split(",")[1]), Integer.parseInt(string.split(",")[2])), class007532 -> class007532.method_10263() + "," + class007532.method_10264() + "," + class007532.method_10260());
    public static final /* enum */ SettingsUtil$Parser BLOCK = new SettingsUtil$Parser(class00891.class, string -> BlockUtils.stringToBlockRequired(string.trim()), BlockUtils::blockToString);
    public static final /* enum */ SettingsUtil$Parser ITEM = new SettingsUtil$Parser(class06581.class, string -> class04206.B.L(class01894.N((String)string.trim())).map(class03529::N).orElse(null), class065812 -> class04206.B.y(class065812).toString());
    public static final /* enum */ SettingsUtil$Parser LIST = new SettingsUtil$Parser$1();
    public static final /* enum */ SettingsUtil$Parser MAPPING = new SettingsUtil$Parser$2();
    private final Class<?> cla$$;
    private final Function<String, Object> parser;
    private final Function<Object, String> toString;
    private static final /* synthetic */ SettingsUtil$Parser[] $VALUES;

    private <T> SettingsUtil$Parser(Class<T> clazz, Function<String, T> function) {
        this(clazz, function, Object::toString);
    }

    private <T> SettingsUtil$Parser(Class<T> clazz, Function<String, T> function, Function<T, String> function2) {
        this.cla$$ = clazz;
        this.parser = function::apply;
        this.toString = object -> (String)function2.apply(object);
    }

    SettingsUtil$Parser() {
        this.cla$$ = null;
        this.parser = null;
        this.toString = null;
    }

    static {
        $VALUES = SettingsUtil$Parser.$values();
    }

    public String toString(Type type, Object object) {
        return this.toString.apply(object);
    }

    public static SettingsUtil$Parser[] values() {
        return (SettingsUtil$Parser[])$VALUES.clone();
    }

    public static SettingsUtil$Parser valueOf(String string) {
        return Enum.valueOf(SettingsUtil$Parser.class, string);
    }

    public Object parse(Type type, String string) {
        Object object = this.parser.apply(string);
        Objects.requireNonNull(object);
        return object;
    }

    private static /* synthetic */ SettingsUtil$Parser[] $values() {
        return new SettingsUtil$Parser[]{DOUBLE, BOOLEAN, INTEGER, FLOAT, LONG, STRING, MIRROR, ROTATION, COLOR, VEC3I, BLOCK, ITEM, LIST, MAPPING};
    }

    @Override
    public boolean accepts(Type type) {
        return type instanceof Class && this.cla$$.isAssignableFrom((Class)type);
    }

    public static SettingsUtil$Parser getParser(Type type) {
        return Stream.of(SettingsUtil$Parser.values()).filter(settingsUtil$Parser -> settingsUtil$Parser.accepts(type)).findFirst().orElse(null);
    }
}

