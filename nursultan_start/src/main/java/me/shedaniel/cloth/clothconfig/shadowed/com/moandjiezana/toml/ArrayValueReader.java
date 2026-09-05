/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Context;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Results$Errors;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueReader;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueReaders;

class ArrayValueReader
implements ValueReader {
    static final ArrayValueReader ARRAY_VALUE_READER = new ArrayValueReader();

    private ArrayValueReader() {
    }

    @Override
    public Object read(String string, AtomicInteger atomicInteger, Context context) {
        AtomicInteger atomicInteger2 = context.line;
        int n = atomicInteger2.get();
        int n2 = atomicInteger.get();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        boolean bl = false;
        boolean bl2 = false;
        Results$Errors results$Errors = new Results$Errors();
        int n3 = atomicInteger.incrementAndGet();
        while (n3 < string.length()) {
            char c = string.charAt(n3);
            if (c == '#' && !bl2) {
                bl2 = true;
            } else if (c == '\n') {
                bl2 = false;
                atomicInteger2.incrementAndGet();
            } else if (!bl2 && !Character.isWhitespace(c) && c != ',') {
                Object object;
                if (c == '[') {
                    object = this.read(string, atomicInteger, context);
                    if (object instanceof Results$Errors) {
                        results$Errors.add((Results$Errors)object);
                    } else if (!this.isHomogenousArray(object, arrayList)) {
                        results$Errors.heterogenous(context.identifier.getName(), atomicInteger2.get());
                    } else {
                        arrayList.add(object);
                    }
                } else {
                    if (c == ']') {
                        bl = true;
                        break;
                    }
                    object = ValueReaders.VALUE_READERS.convert(string, atomicInteger, context);
                    if (object instanceof Results$Errors) {
                        results$Errors.add((Results$Errors)object);
                    } else if (!this.isHomogenousArray(object, arrayList)) {
                        results$Errors.heterogenous(context.identifier.getName(), atomicInteger2.get());
                    } else {
                        arrayList.add(object);
                    }
                }
            }
            n3 = atomicInteger.incrementAndGet();
        }
        if (!bl) {
            results$Errors.unterminated(context.identifier.getName(), string.substring(n2, string.length()), n);
        }
        if (results$Errors.hasErrors()) {
            return results$Errors;
        }
        return arrayList;
    }

    @Override
    public boolean canRead(String string) {
        return string.startsWith("[");
    }

    private boolean isHomogenousArray(Object object, List<?> list) {
        return list.isEmpty() || list.get(0).getClass().isAssignableFrom(object.getClass()) || object.getClass().isAssignableFrom(list.get(0).getClass());
    }
}

