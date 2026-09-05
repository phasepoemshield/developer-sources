/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class03529
 *  minecraft.class04206
 *  minecraft.class08092
 */
package baritone.utils.schematic.format.defaults;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class03529;
import minecraft.class04206;
import minecraft.class08092;

final class SpongeSchematic$SerializedBlockState {
    private static final Pattern REGEX = Pattern.compile("(?<location>(\\w+:)?\\w+)(\\[(?<properties>(\\w+=\\w+,?)+)])?");
    private final class01894 identifier;
    private final Map<String, String> properties;
    private class00500 blockState;

    class00500 deserialize() {
        if (this.blockState == null) {
            class00891 class008912 = (class00891)class04206.i.L(this.identifier).map(class03529::N).orElse(class00869.N);
            this.blockState = class008912.W();
            this.properties.keySet().stream().sorted(String::compareTo).forEachOrdered(string -> {
                class08092 class080922 = class008912.E().N(string);
                if (class080922 != null) {
                    this.blockState = SpongeSchematic$SerializedBlockState.setPropertyValue(this.blockState, class080922, this.properties.get(string));
                }
            });
        }
        return this.blockState;
    }

    private SpongeSchematic$SerializedBlockState(class01894 class018942, Map<String, String> map) {
        this.identifier = class018942;
        this.properties = map;
    }

    private static <T extends Comparable<T>> class00500 setPropertyValue(class00500 class005002, class08092<T> class080922, String string) {
        Optional optional = class080922.y(string);
        if (optional.isPresent()) {
            return (class00500)class005002.y(class080922, (Comparable)optional.get());
        }
        throw new IllegalArgumentException("Invalid value for property " + String.valueOf(class080922));
    }

    static SpongeSchematic$SerializedBlockState getFromString(String string) {
        Matcher matcher = REGEX.matcher(string);
        if (!matcher.matches()) {
            return null;
        }
        try {
            String string2 = matcher.group("location");
            String string3 = matcher.group("properties");
            class01894 class018942 = class01894.N((String)string2);
            HashMap<String, String> hashMap = new HashMap<String, String>();
            if (string3 != null) {
                for (String string4 : string3.split(",")) {
                    String[] stringArray = string4.split("=");
                    hashMap.put(stringArray[0], stringArray[1]);
                }
            }
            return new SpongeSchematic$SerializedBlockState(class018942, hashMap);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }
}

