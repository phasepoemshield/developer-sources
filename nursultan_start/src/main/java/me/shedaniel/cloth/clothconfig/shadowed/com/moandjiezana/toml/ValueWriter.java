/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.WriterContext;

interface ValueWriter {
    public boolean isPrimitiveType();

    public void write(Object var1, WriterContext var2);

    public boolean canWrite(Object var1);
}

