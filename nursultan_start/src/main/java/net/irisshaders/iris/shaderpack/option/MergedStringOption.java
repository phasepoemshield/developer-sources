/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 */
package net.irisshaders.iris.shaderpack.option;

import com.google.common.collect.ImmutableSet;
import net.irisshaders.iris.shaderpack.option.OptionLocation;
import net.irisshaders.iris.shaderpack.option.StringOption;

public class MergedStringOption {
    private final StringOption option;
    private final ImmutableSet<OptionLocation> locations;

    MergedStringOption(StringOption stringOption, ImmutableSet<OptionLocation> immutableSet) {
        this.option = stringOption;
        this.locations = immutableSet;
    }

    public MergedStringOption(OptionLocation optionLocation, StringOption stringOption) {
        this.option = stringOption;
        this.locations = ImmutableSet.of((Object)((Object)optionLocation));
    }

    public MergedStringOption merge(MergedStringOption mergedStringOption) {
        if (!this.option.getDefaultValue().equals(mergedStringOption.option.getDefaultValue())) {
            return null;
        }
        StringOption stringOption = this.option.getComment().isPresent() ? this.option : mergedStringOption.option;
        ImmutableSet.Builder builder = ImmutableSet.builder();
        builder.addAll(this.locations);
        builder.addAll(mergedStringOption.locations);
        return new MergedStringOption(stringOption, (ImmutableSet<OptionLocation>)builder.build());
    }

    public StringOption getOption() {
        return this.option;
    }

    public ImmutableSet<OptionLocation> getLocations() {
        return this.locations;
    }
}

