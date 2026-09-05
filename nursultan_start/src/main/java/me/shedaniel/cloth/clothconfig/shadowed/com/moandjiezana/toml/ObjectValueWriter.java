/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.MapValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.WriterContext;

class ObjectValueWriter
implements ValueWriter {
    static final ValueWriter OBJECT_VALUE_WRITER = new ObjectValueWriter();

    @Override
    public boolean isPrimitiveType() {
        return false;
    }

    private ObjectValueWriter() {
    }

    private static Set<Field> getFields(Class<?> clazz) {
        LinkedHashSet<Field> linkedHashSet = new LinkedHashSet<Field>(Arrays.asList(clazz.getDeclaredFields()));
        while (clazz != Object.class) {
            linkedHashSet.addAll(Arrays.asList(clazz.getDeclaredFields()));
            clazz = clazz.getSuperclass();
        }
        ObjectValueWriter.removeConstantsAndSyntheticFields(linkedHashSet);
        return linkedHashSet;
    }

    @Override
    public void write(Object object, WriterContext writerContext) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        Set<Field> set = ObjectValueWriter.getFields(object.getClass());
        for (Field field : set) {
            linkedHashMap.put(field.getName(), ObjectValueWriter.getFieldValue(field, object));
        }
        MapValueWriter.MAP_VALUE_WRITER.write(linkedHashMap, writerContext);
    }

    @Override
    public boolean canWrite(Object object) {
        return true;
    }

    private static Object getFieldValue(Field field, Object object) {
        boolean bl = field.isAccessible();
        field.setAccessible(true);
        Object object2 = null;
        try {
            object2 = field.get(object);
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        field.setAccessible(bl);
        return object2;
    }

    private static void removeConstantsAndSyntheticFields(Set<Field> set) {
        Iterator<Field> iterator = set.iterator();
        while (iterator.hasNext()) {
            Field field = iterator.next();
            if ((!Modifier.isFinal(field.getModifiers()) || !Modifier.isStatic(field.getModifiers())) && !field.isSynthetic() && !Modifier.isTransient(field.getModifiers())) continue;
            iterator.remove();
        }
    }
}

