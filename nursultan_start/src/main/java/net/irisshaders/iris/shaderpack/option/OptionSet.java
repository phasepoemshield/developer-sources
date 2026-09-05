/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package net.irisshaders.iris.shaderpack.option;

import com.google.common.collect.ImmutableMap;
import net.irisshaders.iris.shaderpack.option.MergedBooleanOption;
import net.irisshaders.iris.shaderpack.option.MergedStringOption;
import net.irisshaders.iris.shaderpack.option.OptionSet$Builder;

public class OptionSet {
    final ImmutableMap<String, MergedBooleanOption> booleanOptions;
    final ImmutableMap<String, MergedStringOption> stringOptions;

    public ImmutableMap<String, MergedBooleanOption> getBooleanOptions() {
        return this.booleanOptions;
    }

    public ImmutableMap<String, MergedStringOption> getStringOptions() {
        return this.stringOptions;
    }

    OptionSet(OptionSet$Builder optionSet$Builder) {
        this.booleanOptions = ImmutableMap.copyOf(optionSet$Builder.booleanOptions);
        this.stringOptions = ImmutableMap.copyOf(optionSet$Builder.stringOptions);
    }

    public static OptionSet$Builder builder() {
        return new OptionSet$Builder();
    }

    public boolean isBooleanOption(String string) {
        return this.booleanOptions.containsKey((Object)string);
    }
}

