/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 */
package net.irisshaders.iris.shaderpack.option;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.irisshaders.iris.shaderpack.option.Profile;

public class Profile$Builder {
    private final String name;
    private final Map<String, String> optionValues = new HashMap<String, String>();
    private final List<String> disabledPrograms = new ArrayList<String>();

    public Profile$Builder(String string) {
        this.name = string;
    }

    public Profile$Builder addAll(Profile profile) {
        this.optionValues.putAll(profile.optionValues);
        this.disabledPrograms.addAll(profile.disabledPrograms);
        return this;
    }

    public Profile$Builder option(String string, String string2) {
        this.optionValues.put(string, string2);
        return this;
    }

    public Profile build() {
        return new Profile(this.name, (Map<String, String>)ImmutableMap.copyOf(this.optionValues), (List<String>)ImmutableList.copyOf(this.disabledPrograms));
    }

    public Profile$Builder disableProgram(String string) {
        this.disabledPrograms.add(string);
        return this;
    }
}

