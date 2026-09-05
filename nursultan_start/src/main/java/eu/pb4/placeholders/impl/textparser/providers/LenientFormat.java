/*
 * Decompiled with CFR 0.152.
 */
package eu.pb4.placeholders.impl.textparser.providers;

import eu.pb4.placeholders.api.parsers.format.BaseFormat;

public record LenientFormat() implements BaseFormat
{
    public static final LenientFormat INSTANCE = new LenientFormat();

    public int index() {
        return -1;
    }

    @Override
    public boolean hasArgument() {
        return true;
    }

    @Override
    public int matchArgument(String string, int n) {
        char c = string.charAt(n);
        return c == ':' || c == ' ' ? 1 : 0;
    }

    @Override
    public char[] argumentWrappers() {
        return BaseFormat.DEFAULT_ARGUMENT_WRAPPER;
    }

    @Override
    public int matchEnd(String string, int n) {
        return string.charAt(n) == '>' ? 1 : 0;
    }

    @Override
    public int matchStart(String string, int n) {
        return string.charAt(n) == '<' ? 1 : 0;
    }

    @Override
    public int endLength() {
        return 1;
    }
}

