/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.utils;

import baritone.api.utils.SettingsUtil$Parser;
import baritone.api.utils.TypeUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

final class SettingsUtil$Parser$1
extends SettingsUtil$Parser {
    @Override
    public String toString(Type type, Object object2) {
        Type type2 = ((ParameterizedType)type).getActualTypeArguments()[0];
        SettingsUtil$Parser settingsUtil$Parser = SettingsUtil$Parser.getParser(type2);
        return ((List)object2).stream().map(object -> settingsUtil$Parser.toString(type2, object)).collect(Collectors.joining(","));
    }

    @Override
    public Object parse(Type type, String string2) {
        Type type2 = ((ParameterizedType)type).getActualTypeArguments()[0];
        SettingsUtil$Parser settingsUtil$Parser = SettingsUtil$Parser.getParser(type2);
        return Stream.of(string2.split(",")).map(string -> settingsUtil$Parser.parse(type2, (String)string)).collect(Collectors.toList());
    }

    @Override
    public boolean accepts(Type type) {
        return List.class.isAssignableFrom(TypeUtils.resolveBaseClass(type));
    }
}

