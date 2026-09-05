/*
 * Decompiled with CFR 0.152.
 */
package eu.pb4.placeholders.api.parsers.format;

import eu.pb4.placeholders.api.parsers.format.BaseFormat;

public record SingleCharacterFormat(char start, char end, char argument, char[] argumentWrappers) implements BaseFormat
{
    public int index() {
        return -1;
    }

    public SingleCharacterFormat(char c, char c2) {
        this(c, c2, '\u0000', DEFAULT_ARGUMENT_WRAPPER);
    }

    public SingleCharacterFormat(char c, char c2, char c3) {
        this(c, c2, c3, DEFAULT_ARGUMENT_WRAPPER);
    }

    @Override
    public boolean hasArgument() {
        return this.argument != '\u0000';
    }

    @Override
    public int matchArgument(String string, int n) {
        return string.charAt(n) == this.argument ? 1 : 0;
    }

    @Override
    public int matchEnd(String string, int n) {
        return string.charAt(n) == this.end ? 1 : 0;
    }

    @Override
    public int matchStart(String string, int n) {
        return string.charAt(n) == this.start ? 1 : 0;
    }

    @Override
    public int endLength() {
        return 1;
    }
}

