/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 */
package net.irisshaders.iris.shaderpack.option;

import com.google.common.collect.ImmutableSet;
import net.irisshaders.iris.shaderpack.option.BooleanOption;
import net.irisshaders.iris.shaderpack.option.OptionLocation;

public class MergedBooleanOption {
    private final BooleanOption option;
    private final ImmutableSet<OptionLocation> locations;

    MergedBooleanOption(BooleanOption booleanOption, ImmutableSet<OptionLocation> immutableSet) {
        this.option = booleanOption;
        this.locations = immutableSet;
    }

    public MergedBooleanOption(OptionLocation optionLocation, BooleanOption booleanOption) {
        this.option = booleanOption;
        this.locations = ImmutableSet.of((Object)((Object)optionLocation));
    }

    public MergedBooleanOption merge(MergedBooleanOption mergedBooleanOption) {
        if (this.option.getDefaultValue() != mergedBooleanOption.option.getDefaultValue()) {
            return null;
        }
        BooleanOption booleanOption = this.option.getComment().isPresent() ? this.option : mergedBooleanOption.option;
        ImmutableSet.Builder builder = ImmutableSet.builder();
        builder.addAll(this.locations);
        builder.addAll(mergedBooleanOption.locations);
        return new MergedBooleanOption(booleanOption, (ImmutableSet<OptionLocation>)builder.build());
    }

    public BooleanOption getOption() {
        return this.option;
    }

    public ImmutableSet<OptionLocation> getLocations() {
        return this.locations;
    }
}

