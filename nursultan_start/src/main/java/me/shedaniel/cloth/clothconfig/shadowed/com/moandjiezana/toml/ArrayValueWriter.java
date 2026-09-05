/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueWriters;

abstract class ArrayValueWriter
implements ValueWriter {
    @Override
    public boolean isPrimitiveType() {
        return false;
    }

    ArrayValueWriter() {
    }

    private static Object peek(Object object) {
        if (object.getClass().isArray()) {
            if (Array.getLength(object) > 0) {
                return Array.get(object, 0);
            }
            return null;
        }
        Collection collection = (Collection)object;
        if (collection.size() > 0) {
            return collection.iterator().next();
        }
        return null;
    }

    protected Collection<?> normalize(Object object) {
        ArrayList<Object> arrayList;
        if (object.getClass().isArray()) {
            arrayList = new ArrayList<Object>(Array.getLength(object));
            for (int i = 0; i < Array.getLength(object); ++i) {
                Object object2 = Array.get(object, i);
                arrayList.add(object2);
            }
        } else {
            arrayList = (ArrayList<Object>)object;
        }
        return arrayList;
    }

    protected static boolean isArrayish(Object object) {
        return object instanceof Collection || object.getClass().isArray();
    }

    static boolean isArrayOfPrimitive(Object object) {
        Object object2 = ArrayValueWriter.peek(object);
        if (object2 != null) {
            ValueWriter valueWriter = ValueWriters.WRITERS.findWriterFor(object2);
            return valueWriter.isPrimitiveType() || ArrayValueWriter.isArrayish(object2);
        }
        return true;
    }
}

