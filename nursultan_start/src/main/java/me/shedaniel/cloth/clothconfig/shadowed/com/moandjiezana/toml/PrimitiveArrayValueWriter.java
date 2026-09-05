/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.Collection;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ArrayValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueWriters;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.WriterContext;

class PrimitiveArrayValueWriter
extends ArrayValueWriter {
    static final ValueWriter PRIMITIVE_ARRAY_VALUE_WRITER = new PrimitiveArrayValueWriter();

    private PrimitiveArrayValueWriter() {
    }

    public String toString() {
        return "primitive-array";
    }

    @Override
    public void write(Object object, WriterContext writerContext) {
        Collection<?> collection = this.normalize(object);
        writerContext.write('[');
        writerContext.writeArrayDelimiterPadding();
        boolean bl = true;
        ValueWriter valueWriter = null;
        for (Object obj : collection) {
            if (bl) {
                valueWriter = ValueWriters.WRITERS.findWriterFor(obj);
                bl = false;
            } else {
                ValueWriter valueWriter2 = ValueWriters.WRITERS.findWriterFor(obj);
                if (valueWriter2 != valueWriter) {
                    throw new IllegalStateException(writerContext.getContextPath() + ": cannot write a heterogeneous array; first element was of type " + valueWriter + " but found " + valueWriter2);
                }
                writerContext.write(", ");
            }
            ValueWriters.WRITERS.findWriterFor(obj).write(obj, writerContext);
        }
        writerContext.writeArrayDelimiterPadding();
        writerContext.write(']');
    }

    @Override
    public boolean canWrite(Object object) {
        return PrimitiveArrayValueWriter.isArrayish(object) && PrimitiveArrayValueWriter.isArrayOfPrimitive(object);
    }
}

