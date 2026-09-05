/*
 * Decompiled with CFR 0.152.
 */
package eu.pb4.placeholders.api.parsers.format;

import eu.pb4.placeholders.api.parsers.format.BaseFormat;

public record MultiCharacterFormat(char[] start, char[] end, char[] argument, char[] argumentWrappers) implements BaseFormat
{
    public int index() {
        return -this.start.length;
    }

    public MultiCharacterFormat(String string, String string2, String string3) {
        this(string.toCharArray(), string2.toCharArray(), string3.toCharArray(), DEFAULT_ARGUMENT_WRAPPER);
    }

    public MultiCharacterFormat(String string, String string2, String string3, String string4) {
        this(string.toCharArray(), string2.toCharArray(), string3.toCharArray(), string4.toCharArray());
    }

    @Override
    public boolean hasArgument() {
        return this.argument.length != 0;
    }

    @Override
    public int matchArgument(String string, int n) {
        if (this.argument.length == 0) {
            return 0;
        }
        for (int i = 0; i < this.argument.length; ++i) {
            char c = string.charAt(n + i);
            if (c == this.argument[i]) continue;
            return 0;
        }
        return this.argument.length;
    }

    @Override
    public int matchEnd(String string, int n) {
        for (int i = 0; i < this.end.length; ++i) {
            char c = string.charAt(n + i);
            if (c == this.end[i]) continue;
            return 0;
        }
        return this.end.length;
    }

    @Override
    public int matchStart(String string, int n) {
        for (int i = 0; i < this.start.length; ++i) {
            char c = string.charAt(n + i);
            if (c == this.start[i]) continue;
            return 0;
        }
        return this.start.length;
    }

    @Override
    public int endLength() {
        return this.end.length;
    }
}

