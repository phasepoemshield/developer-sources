/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.concurrent.atomic.AtomicInteger;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Context;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Results$Errors;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueReader;

class LiteralStringValueReader
implements ValueReader {
    static final LiteralStringValueReader LITERAL_STRING_VALUE_READER = new LiteralStringValueReader();

    private LiteralStringValueReader() {
    }

    @Override
    public Object read(String string, AtomicInteger atomicInteger, Context context) {
        int n = context.line.get();
        boolean bl = false;
        int n2 = atomicInteger.incrementAndGet();
        int n3 = atomicInteger.get();
        while (n3 < string.length()) {
            char c = string.charAt(n3);
            if (c == '\'') {
                bl = true;
                break;
            }
            n3 = atomicInteger.incrementAndGet();
        }
        if (!bl) {
            Results$Errors results$Errors = new Results$Errors();
            results$Errors.unterminated(context.identifier.getName(), string.substring(n2), n);
            return results$Errors;
        }
        String string2 = string.substring(n2, atomicInteger.get());
        return string2;
    }

    @Override
    public boolean canRead(String string) {
        return string.startsWith("'");
    }
}

