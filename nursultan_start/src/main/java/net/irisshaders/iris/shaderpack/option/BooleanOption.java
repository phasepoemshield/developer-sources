/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.option;

import net.irisshaders.iris.shaderpack.option.BaseOption;
import net.irisshaders.iris.shaderpack.option.OptionType;

public final class BooleanOption
extends BaseOption {
    private final boolean defaultValue;

    public BooleanOption(OptionType optionType, String string, String string2, boolean bl) {
        super(optionType, string, string2);
        this.defaultValue = bl;
    }

    public String toString() {
        return "BooleanDefineOption{name=" + this.getName() + ", comment=" + String.valueOf(this.getComment()) + ", defaultValue=" + this.defaultValue + "}";
    }

    public boolean getDefaultValue() {
        return this.defaultValue;
    }
}

