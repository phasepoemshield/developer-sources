/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.concurrent.atomic.AtomicInteger;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Context;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueReader;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.WriterContext;

class BooleanValueReaderWriter
implements ValueReader,
ValueWriter {
    static final BooleanValueReaderWriter BOOLEAN_VALUE_READER_WRITER = new BooleanValueReaderWriter();

    @Override
    public boolean isPrimitiveType() {
        return true;
    }

    private BooleanValueReaderWriter() {
    }

    public String toString() {
        return "boolean";
    }

    @Override
    public void write(Object object, WriterContext writerContext) {
        writerContext.write(object.toString());
    }

    @Override
    public Object read(String string, AtomicInteger atomicInteger, Context context) {
        Boolean bl = (string = string.substring(atomicInteger.get())).startsWith("true") ? Boolean.TRUE : Boolean.FALSE;
        int n = bl == Boolean.TRUE ? 4 : 5;
        atomicInteger.addAndGet(n - 1);
        return bl;
    }

    @Override
    public boolean canRead(String string) {
        return string.startsWith("true") || string.startsWith("false");
    }

    @Override
    public boolean canWrite(Object object) {
        return Boolean.class.isInstance(object);
    }
}

