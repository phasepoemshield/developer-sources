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
import net.irisshaders.iris.shaderpack.option.values.ImmutableOptionValues;
import net.irisshaders.iris.shaderpack.option.values.OptionValues;

public class MutableOptionValues
implements OptionValues {
    private final OptionSet options;
    private final Map<String, Boolean> booleanValues;
    private final Map<String, String> stringValues;

    public Map<String, Boolean> getBooleanValues() {
        return this.booleanValues;
    }

    @Override
    public MutableOptionValues mutableCopy() {
        return new MutableOptionValues(this.options, new HashMap<String, Boolean>(this.booleanValues), new HashMap<String, String>(this.stringValues));
    }

    public Map<String, String> getStringValues() {
        return this.stringValues;
    }

    @Override
    public OptionSet getOptionSet() {
        return this.options;
    }

    public OptionSet getOptions() {
        return this.options;
    }

    MutableOptionValues(OptionSet optionSet, Map<String, Boolean> map, Map<String, String> map2) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        map.forEach((string, bl) -> hashMap.put((String)string, Boolean.toString(bl)));
        hashMap.putAll(map2);
        this.options = optionSet;
        this.booleanValues = new HashMap<String, Boolean>();
        this.stringValues = new HashMap<String, String>();
        this.addAll(hashMap);
    }

    public MutableOptionValues(OptionSet optionSet, Map<String, String> map) {
        this.options = optionSet;
        this.booleanValues = new HashMap<String, Boolean>();
        this.stringValues = new HashMap<String, String>();
        this.addAll(map);
    }

    public void addAll(Map<String, String> map) {
        this.options.getBooleanOptions().forEach((string, mergedBooleanOption) -> {
            String string2 = (String)map.get(string);
            if (string2 == null) {
                return;
            }
            OptionalBoolean optionalBoolean = string2.equals("false") ? OptionalBoolean.FALSE : (string2.equals("true") ? OptionalBoolean.TRUE : OptionalBoolean.DEFAULT);
            boolean bl = optionalBoolean.orElse(mergedBooleanOption.getOption().getDefaultValue());
            if (bl == mergedBooleanOption.getOption().getDefaultValue()) {
                this.booleanValues.remove(string);
                return;
            }
            this.booleanValues.put((String)string, bl);
        });
        this.options.getStringOptions().forEach((string, mergedStringOption) -> {
            String string2 = (String)map.get(string);
            if (string2 == null) {
                return;
            }
            if (string2.equals(mergedStringOption.getOption().getDefaultValue())) {
                this.stringValues.remove(string);
                return;
            }
            this.stringValues.put((String)string, string2);
        });
    }

    @Override
    public ImmutableOptionValues toImmutable() {
        return new ImmutableOptionValues(this.options, (ImmutableMap<String, Boolean>)ImmutableMap.copyOf(this.booleanValues), (ImmutableMap<String, String>)ImmutableMap.copyOf(this.stringValues));
    }

    @Override
    public OptionalBoolean getBooleanValue(String string) {
        if (this.booleanValues.containsKey(string)) {
            return this.booleanValues.get(string) != false ? OptionalBoolean.TRUE : OptionalBoolean.FALSE;
        }
        return OptionalBoolean.DEFAULT;
    }

    @Override
    public Optional<String> getStringValue(String string) {
        return Optional.ofNullable(this.stringValues.get(string));
    }

    @Override
    public int getOptionsChanged() {
        return this.stringValues.size() + this.booleanValues.size();
    }
}

