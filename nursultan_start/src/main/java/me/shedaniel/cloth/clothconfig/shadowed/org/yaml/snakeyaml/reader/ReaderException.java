/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.reader;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;

public class ReaderException
extends YAMLException {
    private static final long serialVersionUID = 8710781187529689083L;
    private final String name;
    private final int codePoint;
    private final int position;

    public ReaderException(String string, int n, int n2, String string2) {
        super(string2);
        this.name = string;
        this.codePoint = n2;
        this.position = n;
    }

    @Override
    public String toString() {
        String string = new String(Character.toChars(this.codePoint));
        return "unacceptable code point '" + string + "' (0x" + Integer.toHexString(this.codePoint).toUpperCase() + ") " + this.getMessage() + "\nin \"" + this.name + "\", position " + this.position;
    }

    public String getName() {
        return this.name;
    }

    public int getCodePoint() {
        return this.codePoint;
    }

    public int getPosition() {
        return this.position;
    }
}

