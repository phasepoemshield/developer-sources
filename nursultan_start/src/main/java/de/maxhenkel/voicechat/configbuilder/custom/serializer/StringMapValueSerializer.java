/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.configbuilder.custom.serializer;

import de.maxhenkel.voicechat.configbuilder.custom.StringMap;
import de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public class StringMapValueSerializer
implements ValueSerializer<StringMap> {
    public static final StringMapValueSerializer INSTANCE = new StringMapValueSerializer();
    public static final Pattern QUOTE_ESCAPE_PATTERN = Pattern.compile("\"((?:(?![\"\\\\]).|\\\\.)*)\"\\s*=\\s*\"((?:(?![\"\\\\]).|\\\\.)*)\"");

    @Nullable
    public StringMap deserialize(String string2) {
        boolean bl = QUOTE_ESCAPE_PATTERN.splitAsStream(string2).allMatch(string -> string.trim().isEmpty() || string.trim().equals(","));
        if (!bl) {
            return null;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        Matcher matcher = QUOTE_ESCAPE_PATTERN.matcher(string2);
        while (matcher.find()) {
            linkedHashMap.put(StringMapValueSerializer.unescape(matcher.group(1)), StringMapValueSerializer.unescape(matcher.group(2)));
        }
        return StringMap.of(linkedHashMap);
    }

    private static String escape(String string) {
        return string.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    private static String unescape(String string) {
        return string.replace("\\\"", "\"").replace("\\\\", "\\");
    }

    public String serialize(StringMap stringMap) {
        ArrayList<String> arrayList = new ArrayList<String>(stringMap.size());
        for (Map.Entry entry : stringMap.entrySet()) {
            arrayList.add("\"" + StringMapValueSerializer.escape((String)entry.getKey()) + "\"=\"" + StringMapValueSerializer.escape((String)entry.getValue()) + "\"");
        }
        return String.join((CharSequence)",", arrayList);
    }
}

