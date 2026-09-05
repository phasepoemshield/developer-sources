/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer
 */
package de.maxhenkel.voicechat.configbuilder.custom.serializer;

import de.maxhenkel.voicechat.configbuilder.custom.StringList;
import de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer;
import java.util.ArrayList;

public class StringListValueSerializer
implements ValueSerializer<StringList> {
    public static final StringListValueSerializer INSTANCE = new StringListValueSerializer();

    public StringList deserialize(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string2 : string.split("(?<!\\\\),")) {
            arrayList.add(string2.replace("\\,", ","));
        }
        return StringList.of(arrayList);
    }

    public String serialize(StringList stringList) {
        ArrayList<String> arrayList = new ArrayList<String>(stringList.size());
        for (String string : stringList) {
            arrayList.add(string.replace(",", "\\,"));
        }
        return String.join((CharSequence)",", arrayList);
    }
}

