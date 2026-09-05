/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  net.irisshaders.iris.helpers.OptionalBoolean
 */
package net.irisshaders.iris.shaderpack.option.values;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import net.irisshaders.iris.helpers.OptionalBoolean;
import net.irisshaders.iris.shaderpack.option.OptionSet;
import net.irisshaders.iris.shaderpack.option.values.MutableOptionValues;
import net.irisshaders.iris.shaderpack.option.values.OptionValues;

public class ImmutableOptionValues
implements OptionValues {
    private final OptionSet options;
    private final ImmutableMap<String, Boolean> booleanValues;
    private final ImmutableMap<String, String> stringValues;

    @Override
    public MutableOptionValues mutableCopy() {
        return new MutableOptionValues(this.options, new HashMap<String, Boolean>((Map<String, Boolean>)this.booleanValues), new HashMap<String, String>((Map<String, String>)this.stringValues));
    }

    @Override
    public OptionSet getOptionSet() {
        return this.options;
    }

    ImmutableOptionValues(OptionSet optionSet, ImmutableMap<String, Boolean> immutableMap, ImmutableMap<String, String> immutableMap2) {
        this.options = optionSet;
        this.booleanValues = immutableMap;
        this.stringValues = immutableMap2;
    }

    @Override
    public ImmutableOptionValues toImmutable() {
        return this;
    }

    @Override
    public OptionalBoolean getBooleanValue(String string) {
        if (this.booleanValues.containsKey((Object)string)) {
            return (Boolean)this.booleanValues.get((Object)string) != false ? OptionalBoolean.TRUE : OptionalBoolean.FALSE;
        }
        return OptionalBoolean.DEFAULT;
    }

    @Override
    public Optional<String> getStringValue(String string) {
        return Optional.ofNullable((String)this.stringValues.get((Object)string));
    }

    @Override
    public int getOptionsChanged() {
        return this.stringValues.size() + this.booleanValues.size();
    }
}

