/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.external.com.google.gdata.util.common.base;

final class UnicodeEscaper$2
extends ThreadLocal<char[]> {
    UnicodeEscaper$2() {
    }

    @Override
    protected char[] initialValue() {
        return new char[1024];
    }
}

