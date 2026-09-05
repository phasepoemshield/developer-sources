/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ObjectValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.PrimitiveArrayValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.TableArrayValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueWriters;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.WriterContext;

class MapValueWriter
implements ValueWriter {
    static final ValueWriter MAP_VALUE_WRITER = new MapValueWriter();
    private static final Pattern REQUIRED_QUOTING_PATTERN = Pattern.compile("^.*[^A-Za-z\\d_-].*$");

    @Override
    public boolean isPrimitiveType() {
        return false;
    }

    private MapValueWriter() {
    }

    @Override
    public void write(Object object, WriterContext writerContext) {
        Object object2;
        Object object3;
        Map map = (Map)object;
        if (MapValueWriter.hasPrimitiveValues(map, writerContext)) {
            writerContext.writeKey();
        }
        for (Map.Entry entry : map.entrySet()) {
            object3 = entry.getKey();
            object2 = entry.getValue();
            if (object2 == null) continue;
            ValueWriter valueWriter = ValueWriters.WRITERS.findWriterFor(object2);
            if (valueWriter.isPrimitiveType()) {
                writerContext.indent();
                writerContext.write(MapValueWriter.quoteKey(object3)).write(" = ");
                valueWriter.write(object2, writerContext);
                writerContext.write('\n');
                continue;
            }
            if (valueWriter != PrimitiveArrayValueWriter.PRIMITIVE_ARRAY_VALUE_WRITER) continue;
            writerContext.setArrayKey(object3.toString());
            writerContext.write(MapValueWriter.quoteKey(object3)).write(" = ");
            valueWriter.write(object2, writerContext);
            writerContext.write('\n');
        }
        for (Map.Entry entry : map.keySet()) {
            object3 = map.get(entry);
            if (object3 == null || (object2 = ValueWriters.WRITERS.findWriterFor(object3)) != this && object2 != ObjectValueWriter.OBJECT_VALUE_WRITER && object2 != TableArrayValueWriter.TABLE_ARRAY_VALUE_WRITER) continue;
            object2.write(object3, writerContext.pushTable(MapValueWriter.quoteKey(entry)));
        }
    }

    @Override
    public boolean canWrite(Object object) {
        return object instanceof Map;
    }

    private static String quoteKey(Object object) {
        String string = object.toString();
        Matcher matcher = REQUIRED_QUOTING_PATTERN.matcher(string);
        if (matcher.matches()) {
            string = "\"" + string + "\"";
        }
        return string;
    }

    private static boolean hasPrimitiveValues(Map<?, ?> map, WriterContext writerContext) {
        for (Object obj : map.keySet()) {
            ValueWriter valueWriter;
            Object obj2 = map.get(obj);
            if (obj2 == null || !(valueWriter = ValueWriters.WRITERS.findWriterFor(obj2)).isPrimitiveType() && valueWriter != PrimitiveArrayValueWriter.PRIMITIVE_ARRAY_VALUE_WRITER) continue;
            return true;
        }
        return false;
    }
}

