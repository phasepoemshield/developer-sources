/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.shaderpack.materialmap.TagEntry
 */
package net.irisshaders.iris.shaderpack.materialmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.shaderpack.materialmap.Entry;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.TagEntry;

public record BlockEntry(NamespacedId id, Map<String, String> propertyPredicates) implements Entry
{
    public static Entry parse(String string) {
        NamespacedId namespacedId;
        if (string.isEmpty()) {
            throw new IllegalArgumentException("Called BlockEntry::parse with an empty string");
        }
        if (string.startsWith("%")) {
            NamespacedId namespacedId2;
            String[] stringArray = (string = string.replace("%", "")).split(":");
            if (stringArray.length == 1) {
                return new TagEntry(new NamespacedId("minecraft", string), Map.of());
            }
            if (stringArray.length == 2 && !stringArray[1].contains("=")) {
                return new TagEntry(new NamespacedId(stringArray[0], stringArray[1]), Map.of());
            }
            if (stringArray[1].contains("=")) {
                var2_3 = 1;
                namespacedId2 = new NamespacedId("minecraft", stringArray[0]);
            } else {
                var2_3 = 2;
                namespacedId2 = new NamespacedId(stringArray[0], stringArray[1]);
            }
            HashMap<String, String> hashMap = new HashMap<String, String>();
            for (int i = var2_3; i < stringArray.length; ++i) {
                String[] stringArray2 = stringArray[i].split("=");
                if (stringArray2.length != 2) {
                    Iris.logger.warn("Warning: the block ID map entry \"" + string + "\" could not be fully parsed:");
                    Iris.logger.warn("- Block state property filters must be of the form \"key=value\", but " + stringArray[i] + " is not of that form!");
                    continue;
                }
                hashMap.put(stringArray2[0], stringArray2[1]);
            }
            return new TagEntry(namespacedId2, hashMap);
        }
        String[] stringArray = string.split(":");
        if (stringArray.length == 1) {
            return new BlockEntry(new NamespacedId("minecraft", string), Collections.emptyMap());
        }
        if (stringArray.length == 2 && !stringArray[1].contains("=")) {
            return new BlockEntry(new NamespacedId(stringArray[0], stringArray[1]), Collections.emptyMap());
        }
        if (stringArray[1].contains("=")) {
            var2_4 = 1;
            namespacedId = new NamespacedId("minecraft", stringArray[0]);
        } else {
            var2_4 = 2;
            namespacedId = new NamespacedId(stringArray[0], stringArray[1]);
        }
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (int i = var2_4; i < stringArray.length; ++i) {
            String[] stringArray3 = stringArray[i].split("=");
            if (stringArray3.length != 2) {
                Iris.logger.warn("Warning: the block ID map entry \"" + string + "\" could not be fully parsed:");
                Iris.logger.warn("- Block state property filters must be of the form \"key=value\", but " + stringArray[i] + " is not of that form!");
                continue;
            }
            hashMap.put(stringArray3[0], stringArray3[1]);
        }
        return new BlockEntry(namespacedId, hashMap);
    }
}

