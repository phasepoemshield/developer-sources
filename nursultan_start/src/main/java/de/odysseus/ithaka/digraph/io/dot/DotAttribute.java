/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph.io.dot;

import java.awt.Color;
import java.io.IOException;
import java.io.Writer;

public class DotAttribute {
    private final String name;
    private final String value;
    private final boolean quotes;

    public DotAttribute(String string, Color color) {
        this.name = string;
        this.value = String.format("#%6X", color.getRGB() & 0xFFFFFF);
        this.quotes = true;
    }

    public DotAttribute(String string, boolean bl) {
        this.name = string;
        this.value = String.valueOf(bl);
        this.quotes = false;
    }

    public DotAttribute(String string, Number number) {
        this.name = string;
        this.value = number.toString();
        this.quotes = false;
    }

    public DotAttribute(String string, String string2) {
        this.name = string;
        this.value = string2;
        this.quotes = !DotAttribute.isIdentifier(string2);
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public void write(Writer writer) throws IOException {
        writer.write(this.name);
        writer.write(61);
        if (this.quotes) {
            writer.write(34);
        }
        writer.write(this.value);
        if (this.quotes) {
            writer.write(34);
        }
    }

    private static boolean isIdentifier(String string) {
        if (!Character.isJavaIdentifierStart(string.charAt(0))) {
            return false;
        }
        for (char c : string.substring(1).toCharArray()) {
            if (Character.isJavaIdentifierPart(c)) continue;
            return false;
        }
        return true;
    }
}

