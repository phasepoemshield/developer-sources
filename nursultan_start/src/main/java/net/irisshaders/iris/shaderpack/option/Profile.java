/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.option;

import java.util.List;
import java.util.Map;
import net.irisshaders.iris.shaderpack.option.OptionSet;
import net.irisshaders.iris.shaderpack.option.values.OptionValues;

public final class Profile {
    public final String name;
    public final int precedence;
    public final Map<String, String> optionValues;
    public final List<String> disabledPrograms;

    Profile(String string, Map<String, String> map, List<String> list) {
        this.name = string;
        this.optionValues = map;
        this.precedence = map.size();
        this.disabledPrograms = list;
    }

    public boolean matches(OptionSet optionSet, OptionValues optionValues) {
        for (Map.Entry<String, String> entry : this.optionValues.entrySet()) {
            String string;
            boolean bl;
            String string2 = entry.getKey();
            String string3 = entry.getValue();
            if (optionSet.getBooleanOptions().containsKey((Object)string2) && !Boolean.toString(bl = optionValues.getBooleanValueOrDefault(string2)).equals(string3)) {
                return false;
            }
            if (!optionSet.getStringOptions().containsKey((Object)string2) || string3.equals(string = optionValues.getStringValueOrDefault(string2))) continue;
            return false;
        }
        return true;
    }
}

