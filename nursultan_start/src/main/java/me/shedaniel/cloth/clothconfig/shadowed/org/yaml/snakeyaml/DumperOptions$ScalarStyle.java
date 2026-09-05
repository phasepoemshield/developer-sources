/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;

public enum DumperOptions$ScalarStyle {
    DOUBLE_QUOTED(Character.valueOf('\"')),
    SINGLE_QUOTED(Character.valueOf('\'')),
    LITERAL(Character.valueOf('|')),
    FOLDED(Character.valueOf('>')),
    PLAIN(null);

    private Character styleChar;

    private DumperOptions$ScalarStyle(Character c) {
        this.styleChar = c;
    }

    public String toString() {
        return "Scalar style: '" + this.styleChar + "'";
    }

    public Character getChar() {
        return this.styleChar;
    }

    public static DumperOptions$ScalarStyle createStyle(Character c) {
        if (c == null) {
            return PLAIN;
        }
        switch (c.charValue()) {
            case '\"': {
                return DOUBLE_QUOTED;
            }
            case '\'': {
                return SINGLE_QUOTED;
            }
            case '|': {
                return LITERAL;
            }
            case '>': {
                return FOLDED;
            }
        }
        throw new YAMLException("Unknown scalar style character: " + c);
    }
}

