/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.parsing;

import net.irisshaders.iris.shaderpack.parsing.ConstDirectiveParser$Type;

public class ConstDirectiveParser$ConstDirective {
    private final ConstDirectiveParser$Type type;
    private final String key;
    private final String value;

    ConstDirectiveParser$ConstDirective(ConstDirectiveParser$Type type, String string, String string2) {
        this.type = type;
        this.key = string;
        this.value = string2;
    }

    public String toString() {
        return "ConstDirective { " + String.valueOf((Object)this.type) + " " + this.key + " = " + this.value + "; }";
    }

    public String getValue() {
        return this.value;
    }

    public String getKey() {
        return this.key;
    }

    public ConstDirectiveParser$Type getType() {
        return this.type;
    }
}

