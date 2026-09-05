/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.utils;

import baritone.api.utils.SettingsUtil$Parser;
import baritone.api.utils.TypeUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

final class SettingsUtil$Parser$2
extends SettingsUtil$Parser {
    @Override
    public String toString(Type type, Object object) {
        Type type2 = ((ParameterizedType)type).getActualTypeArguments()[0];
        Type type3 = ((ParameterizedType)type).getActualTypeArguments()[1];
        SettingsUtil$Parser settingsUtil$Parser = SettingsUtil$Parser.getParser(type2);
        SettingsUtil$Parser settingsUtil$Parser2 = SettingsUtil$Parser.getParser(type3);
        return ((Map)object).entrySet().stream().map(entry -> settingsUtil$Parser.toString(type2, entry.getKey()) + "->" + settingsUtil$Parser2.toString(type3, entry.getValue())).collect(Collectors.joining(","));
    }

    @Override
    public Object parse(Type type, String string2) {
        Type type2 = ((ParameterizedType)type).getActualTypeArguments()[0];
        Type type3 = ((ParameterizedType)type).getActualTypeArguments()[1];
        SettingsUtil$Parser settingsUtil$Parser = SettingsUtil$Parser.getParser(type2);
        SettingsUtil$Parser settingsUtil$Parser2 = SettingsUtil$Parser.getParser(type3);
        return Stream.of(string2.split(",(?=[^,]*->)")).map(string -> string.split("->")).collect(Collectors.toMap(stringArray -> settingsUtil$Parser.parse(type2, stringArray[0]), stringArray -> settingsUtil$Parser2.parse(type3, stringArray[1])));
    }

    @Override
    public boolean accepts(Type type) {
        return Map.class.isAssignableFrom(TypeUtils.resolveBaseClass(type));
    }
}

