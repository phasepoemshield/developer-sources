/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 */
package net.irisshaders.iris.shaderpack.option;

import com.google.common.collect.ImmutableList;
import java.util.Objects;
import net.irisshaders.iris.shaderpack.option.BaseOption;
import net.irisshaders.iris.shaderpack.option.OptionType;

public class StringOption
extends BaseOption {
    private final String defaultValue;
    private final ImmutableList<String> allowedValues;

    public static StringOption create(OptionType optionType, String string, String object, String string2) {
        if (object == null) {
            return null;
        }
        int n = ((String)object).indexOf(91);
        if (n == -1) {
            return null;
        }
        int n2 = ((String)object).indexOf(93, n);
        if (n2 == -1) {
            return null;
        }
        ImmutableList.Builder builder = ((String)object).substring(n + 1, n2).split(" ");
        object = ((String)object).substring(0, n) + ((String)object).substring(n2 + 1);
        boolean bl = false;
        for (ImmutableList.Builder builder2 : builder) {
            if (!string2.equals(builder2)) continue;
            bl = true;
            break;
        }
        ImmutableList.Builder builder3 = ImmutableList.builder();
        builder3.add((Object[])builder);
        if (!bl) {
            builder3.add((Object)string2);
        }
        return new StringOption(optionType, string, ((String)object).trim(), string2, (ImmutableList<String>)builder3.build());
    }

    private StringOption(OptionType optionType, String string, String string2) {
        super(optionType, string, null);
        this.defaultValue = Objects.requireNonNull(string2);
        this.allowedValues = ImmutableList.of((Object)string2);
    }

    private StringOption(OptionType optionType, String string, String string2, String string3, ImmutableList<String> immutableList) {
        super(optionType, string, string2);
        this.defaultValue = Objects.requireNonNull(string3);
        this.allowedValues = immutableList;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public ImmutableList<String> getAllowedValues() {
        return this.allowedValues;
    }
}

