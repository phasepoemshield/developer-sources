/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.Collection;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ArrayValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueWriters;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.WriterContext;

class TableArrayValueWriter
extends ArrayValueWriter {
    static final ValueWriter TABLE_ARRAY_VALUE_WRITER = new TableArrayValueWriter();

    private TableArrayValueWriter() {
    }

    public String toString() {
        return "table-array";
    }

    @Override
    public void write(Object object, WriterContext writerContext) {
        Collection<?> collection = this.normalize(object);
        WriterContext writerContext2 = writerContext.pushTableFromArray();
        for (Object obj : collection) {
            ValueWriters.WRITERS.findWriterFor(obj).write(obj, writerContext2);
        }
    }

    @Override
    public boolean canWrite(Object object) {
        return TableArrayValueWriter.isArrayish(object) && !TableArrayValueWriter.isArrayOfPrimitive(object);
    }
}

