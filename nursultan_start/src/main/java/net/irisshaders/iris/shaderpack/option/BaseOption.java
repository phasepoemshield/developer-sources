/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.option;

import java.util.Optional;
import net.irisshaders.iris.shaderpack.option.OptionType;

public abstract class BaseOption {
    private final OptionType type;
    private final String name;
    private final String comment;

    BaseOption(OptionType optionType, String string, String string2) {
        this.type = optionType;
        this.name = string;
        this.comment = string2 == null || string2.isEmpty() ? null : string2;
    }

    public String getName() {
        return this.name;
    }

    public OptionType getType() {
        return this.type;
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(this.comment);
    }
}

