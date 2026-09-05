/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.Iris
 */
package net.irisshaders.iris.shaderpack.option;

import java.util.HashMap;
import java.util.Map;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.shaderpack.option.BooleanOption;
import net.irisshaders.iris.shaderpack.option.MergedBooleanOption;
import net.irisshaders.iris.shaderpack.option.MergedStringOption;
import net.irisshaders.iris.shaderpack.option.OptionLocation;
import net.irisshaders.iris.shaderpack.option.OptionSet;
import net.irisshaders.iris.shaderpack.option.StringOption;

public class OptionSet$Builder {
    final Map<String, MergedBooleanOption> booleanOptions = new HashMap<String, MergedBooleanOption>();
    final Map<String, MergedStringOption> stringOptions = new HashMap<String, MergedStringOption>();

    public void addAll(OptionSet optionSet) {
        if (this.booleanOptions.isEmpty()) {
            this.booleanOptions.putAll((Map<String, MergedBooleanOption>)optionSet.booleanOptions);
        } else {
            optionSet.booleanOptions.values().forEach(this::addBooleanOption);
        }
        if (this.stringOptions.isEmpty()) {
            this.stringOptions.putAll((Map<String, MergedStringOption>)optionSet.stringOptions);
        } else {
            optionSet.stringOptions.values().forEach(this::addStringOption);
        }
    }

    public OptionSet build() {
        return new OptionSet(this);
    }

    public void addStringOption(MergedStringOption mergedStringOption) {
        MergedStringOption mergedStringOption2;
        StringOption stringOption = mergedStringOption.getOption();
        MergedStringOption mergedStringOption3 = this.stringOptions.get(stringOption.getName());
        if (mergedStringOption3 != null) {
            mergedStringOption2 = mergedStringOption3.merge(mergedStringOption);
            if (mergedStringOption2 == null) {
                Iris.logger.warn("Ignoring ambiguous string option " + stringOption.getName());
                this.stringOptions.remove(stringOption.getName());
                return;
            }
        } else {
            mergedStringOption2 = mergedStringOption;
        }
        this.stringOptions.put(stringOption.getName(), mergedStringOption2);
    }

    public void addStringOption(OptionLocation optionLocation, StringOption stringOption) {
        this.addStringOption(new MergedStringOption(optionLocation, stringOption));
    }

    public void addBooleanOption(MergedBooleanOption mergedBooleanOption) {
        MergedBooleanOption mergedBooleanOption2;
        BooleanOption booleanOption = mergedBooleanOption.getOption();
        MergedBooleanOption mergedBooleanOption3 = this.booleanOptions.get(booleanOption.getName());
        if (mergedBooleanOption3 != null) {
            mergedBooleanOption2 = mergedBooleanOption3.merge(mergedBooleanOption);
            if (mergedBooleanOption2 == null) {
                Iris.logger.warn("Ignoring ambiguous boolean option " + booleanOption.getName());
                this.booleanOptions.remove(booleanOption.getName());
                return;
            }
        } else {
            mergedBooleanOption2 = mergedBooleanOption;
        }
        this.booleanOptions.put(booleanOption.getName(), mergedBooleanOption2);
    }

    public void addBooleanOption(OptionLocation optionLocation, BooleanOption booleanOption) {
        this.addBooleanOption(new MergedBooleanOption(optionLocation, booleanOption));
    }
}

