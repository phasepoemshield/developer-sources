/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.concurrent.atomic.AtomicInteger;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ArrayValueReader;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.BooleanValueReaderWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Context;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.DateValueReaderWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.InlineTableValueReader;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.LiteralStringValueReader;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.MultilineLiteralStringValueReader;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.MultilineStringValueReader;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.NumberValueReaderWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Results$Errors;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.StringValueReaderWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueReader;

class ValueReaders {
    static final ValueReaders VALUE_READERS = new ValueReaders();
    private static final ValueReader[] READERS = new ValueReader[]{MultilineStringValueReader.MULTILINE_STRING_VALUE_READER, MultilineLiteralStringValueReader.MULTILINE_LITERAL_STRING_VALUE_READER, LiteralStringValueReader.LITERAL_STRING_VALUE_READER, StringValueReaderWriter.STRING_VALUE_READER_WRITER, DateValueReaderWriter.DATE_VALUE_READER_WRITER, NumberValueReaderWriter.NUMBER_VALUE_READER_WRITER, BooleanValueReaderWriter.BOOLEAN_VALUE_READER_WRITER, ArrayValueReader.ARRAY_VALUE_READER, InlineTableValueReader.INLINE_TABLE_VALUE_READER};

    private ValueReaders() {
    }

    Object convert(String string, AtomicInteger atomicInteger, Context context) {
        String string2 = string.substring(atomicInteger.get());
        for (ValueReader valueReader : READERS) {
            if (!valueReader.canRead(string2)) continue;
            return valueReader.read(string, atomicInteger, context);
        }
        Results$Errors results$Errors = new Results$Errors();
        results$Errors.invalidValue(context.identifier.getName(), string2, context.line.get());
        return results$Errors;
    }
}

