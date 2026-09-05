/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.BooleanValueReaderWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.DateValueReaderWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.MapValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.NumberValueReaderWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ObjectValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.PrimitiveArrayValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.StringValueReaderWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.TableArrayValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueWriter;

class ValueWriters {
    static final ValueWriters WRITERS = new ValueWriters();
    private static final ValueWriter[] VALUE_WRITERS = new ValueWriter[]{StringValueReaderWriter.STRING_VALUE_READER_WRITER, NumberValueReaderWriter.NUMBER_VALUE_READER_WRITER, BooleanValueReaderWriter.BOOLEAN_VALUE_READER_WRITER, ValueWriters.getPlatformSpecificDateConverter(), MapValueWriter.MAP_VALUE_WRITER, PrimitiveArrayValueWriter.PRIMITIVE_ARRAY_VALUE_WRITER, TableArrayValueWriter.TABLE_ARRAY_VALUE_WRITER};

    private ValueWriters() {
    }

    private static DateValueReaderWriter getPlatformSpecificDateConverter() {
        String string = Runtime.class.getPackage().getSpecificationVersion();
        return string != null && string.startsWith("1.6") ? DateValueReaderWriter.DATE_PARSER_JDK_6 : DateValueReaderWriter.DATE_VALUE_READER_WRITER;
    }

    ValueWriter findWriterFor(Object object) {
        for (ValueWriter valueWriter : VALUE_WRITERS) {
            if (!valueWriter.canWrite(object)) continue;
            return valueWriter;
        }
        return ObjectValueWriter.OBJECT_VALUE_WRITER;
    }
}

