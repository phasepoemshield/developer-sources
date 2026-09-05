/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.metadata.CustomValue
 *  net.fabricmc.loader.api.metadata.CustomValue$CvArray
 *  net.fabricmc.loader.api.metadata.CustomValue$CvObject
 *  net.fabricmc.loader.api.metadata.ModMetadata
 */
package com.terraformersmc.modmenu.util.mod.fabric;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import net.fabricmc.loader.api.metadata.CustomValue;
import net.fabricmc.loader.api.metadata.ModMetadata;

public class CustomValueUtil {
    public static Optional<String> getString(String string, ModMetadata modMetadata) {
        if (modMetadata.containsCustomValue(string)) {
            return Optional.of(modMetadata.getCustomValue(string).getAsString());
        }
        return Optional.empty();
    }

    public static Optional<String> getString(String string, CustomValue.CvObject cvObject) {
        if (cvObject.containsKey(string)) {
            return Optional.of(cvObject.get(string).getAsString());
        }
        return Optional.empty();
    }

    public static Optional<String[]> getStringArray(String string, CustomValue.CvObject cvObject) {
        if (cvObject.containsKey(string)) {
            CustomValue.CvArray cvArray = cvObject.get(string).getAsArray();
            String[] stringArray = new String[cvArray.size()];
            for (int i = 0; i < cvArray.size(); ++i) {
                stringArray[i] = cvArray.get(i).getAsString();
            }
            return Optional.of(stringArray);
        }
        return Optional.empty();
    }

    public static Optional<Map<String, String>> getStringMap(String string, CustomValue.CvObject cvObject) {
        if (cvObject.containsKey(string)) {
            HashMap<String, String> hashMap = new HashMap<String, String>();
            for (Map.Entry entry : cvObject.get(string).getAsObject()) {
                hashMap.put((String)entry.getKey(), ((CustomValue)entry.getValue()).getAsString());
            }
            return Optional.of(hashMap);
        }
        return Optional.empty();
    }

    public static Optional<Boolean> getBoolean(String string, CustomValue.CvObject cvObject) {
        if (cvObject.containsKey(string)) {
            return Optional.of(cvObject.get(string).getAsBoolean());
        }
        return Optional.empty();
    }

    public static Optional<Boolean> getBoolean(String string, ModMetadata modMetadata) {
        if (modMetadata.containsCustomValue(string)) {
            return Optional.of(modMetadata.getCustomValue(string).getAsBoolean());
        }
        return Optional.empty();
    }

    public static Optional<Set<String>> getStringSet(String string, ModMetadata modMetadata) {
        if (modMetadata.containsCustomValue(string)) {
            return CustomValueUtil.getStringSet(string, modMetadata.getCustomValue(string).getAsObject());
        }
        return Optional.empty();
    }

    public static Optional<Set<String>> getStringSet(String string, CustomValue.CvObject cvObject) {
        if (cvObject.containsKey(string)) {
            HashSet<String> hashSet = new HashSet<String>();
            for (CustomValue customValue : cvObject.get(string).getAsArray()) {
                hashSet.add(customValue.getAsString());
            }
            return Optional.of(hashSet);
        }
        return Optional.empty();
    }
}

