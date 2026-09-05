/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.helpers.OptionalBoolean
 */
package net.irisshaders.iris.shaderpack.option.values;

import java.util.Optional;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.helpers.OptionalBoolean;
import net.irisshaders.iris.shaderpack.option.MergedBooleanOption;
import net.irisshaders.iris.shaderpack.option.MergedStringOption;
import net.irisshaders.iris.shaderpack.option.OptionSet;
import net.irisshaders.iris.shaderpack.option.values.ImmutableOptionValues;
import net.irisshaders.iris.shaderpack.option.values.MutableOptionValues;

public interface OptionValues {
    public MutableOptionValues mutableCopy();

    public OptionSet getOptionSet();

    public ImmutableOptionValues toImmutable();

    public OptionalBoolean getBooleanValue(String var1);

    public Optional<String> getStringValue(String var1);

    default public String getStringValueOrDefault(String string) {
        return this.getStringValue(string).orElseGet(() -> ((MergedStringOption)this.getOptionSet().getStringOptions().get((Object)string)).getOption().getDefaultValue());
    }

    default public boolean getBooleanValueOrDefault(String string) {
        if ("0".equals(string)) {
            return false;
        }
        if ("1".equals(string)) {
            return true;
        }
        return this.getBooleanValue(string).orElseGet(() -> {
            if (!this.getOptionSet().getBooleanOptions().containsKey((Object)string)) {
                Iris.logger.warn("Tried to get boolean value for unknown option: " + string + ", defaulting to true!");
                return true;
            }
            return ((MergedBooleanOption)this.getOptionSet().getBooleanOptions().get((Object)string)).getOption().getDefaultValue();
        });
    }

    public int getOptionsChanged();
}

