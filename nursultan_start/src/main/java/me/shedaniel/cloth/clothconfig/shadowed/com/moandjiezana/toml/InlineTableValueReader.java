/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Context;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Identifier;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Results$Errors;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueReader;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueReaders;

class InlineTableValueReader
implements ValueReader {
    static final InlineTableValueReader INLINE_TABLE_VALUE_READER = new InlineTableValueReader();

    private InlineTableValueReader() {
    }

    @Override
    public Object read(String string, AtomicInteger atomicInteger, Context context) {
        AtomicInteger atomicInteger2 = context.line;
        int n = atomicInteger2.get();
        int n2 = atomicInteger.get();
        boolean bl = true;
        boolean bl2 = false;
        boolean bl3 = false;
        StringBuilder stringBuilder = new StringBuilder();
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Results$Errors results$Errors = new Results$Errors();
        int n3 = atomicInteger.incrementAndGet();
        while (atomicInteger.get() < string.length()) {
            char c = string.charAt(n3);
            if (bl2 && !Character.isWhitespace(c)) {
                Object object = ValueReaders.VALUE_READERS.convert(string, atomicInteger, context.with(Identifier.from(stringBuilder.toString(), context)));
                if (object instanceof Results$Errors) {
                    results$Errors.add((Results$Errors)object);
                    return results$Errors;
                }
                String string2 = stringBuilder.toString().trim();
                Object object2 = hashMap.put(string2, object);
                if (object2 != null) {
                    results$Errors.duplicateKey(string2, context.line.get());
                    return results$Errors;
                }
                stringBuilder = new StringBuilder();
                bl2 = false;
            } else if (c == ',') {
                bl = true;
                bl2 = false;
                stringBuilder = new StringBuilder();
            } else if (c == '=') {
                bl = false;
                bl2 = true;
            } else {
                if (c == '}') {
                    bl3 = true;
                    break;
                }
                if (bl) {
                    stringBuilder.append(c);
                }
            }
            n3 = atomicInteger.incrementAndGet();
        }
        if (!bl3) {
            results$Errors.unterminated(context.identifier.getName(), string.substring(n2), n);
        }
        if (results$Errors.hasErrors()) {
            return results$Errors;
        }
        return hashMap;
    }

    @Override
    public boolean canRead(String string) {
        return string.startsWith("{");
    }
}

