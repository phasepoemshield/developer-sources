/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.configbuilder.custom.serializer;

import de.maxhenkel.voicechat.configbuilder.custom.IntegerList;
import de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer;
import java.util.ArrayList;
import javax.annotation.Nullable;

public class IntegerListValueSerializer
implements ValueSerializer<IntegerList> {
    public static final IntegerListValueSerializer INSTANCE = new IntegerListValueSerializer();

    @Nullable
    public IntegerList deserialize(String string) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (String string2 : string.split(",")) {
            try {
                arrayList.add(Integer.valueOf(string2));
            }
            catch (NumberFormatException numberFormatException) {
                return null;
            }
        }
        return IntegerList.of(arrayList);
    }

    public String serialize(IntegerList integerList) {
        ArrayList<String> arrayList = new ArrayList<String>(integerList.size());
        for (Integer n : integerList) {
            arrayList.add(String.valueOf(n));
        }
        return String.join((CharSequence)",", arrayList);
    }
}

