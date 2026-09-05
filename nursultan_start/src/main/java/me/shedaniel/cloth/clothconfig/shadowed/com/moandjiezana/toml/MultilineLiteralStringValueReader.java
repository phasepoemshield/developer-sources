/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.concurrent.atomic.AtomicInteger;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Context;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Results$Errors;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueReader;

class MultilineLiteralStringValueReader
implements ValueReader {
    static final MultilineLiteralStringValueReader MULTILINE_LITERAL_STRING_VALUE_READER = new MultilineLiteralStringValueReader();

    private MultilineLiteralStringValueReader() {
    }

    @Override
    public Object read(String string, AtomicInteger atomicInteger, Context context) {
        AtomicInteger atomicInteger2 = context.line;
        int n = atomicInteger2.get();
        int n2 = atomicInteger.get();
        int n3 = atomicInteger.addAndGet(3);
        int n4 = -1;
        if (string.charAt(n3) == '\n') {
            n3 = atomicInteger.incrementAndGet();
            atomicInteger2.incrementAndGet();
        }
        int n5 = n3;
        while (n5 < string.length()) {
            char c = string.charAt(n5);
            if (c == '\n') {
                atomicInteger2.incrementAndGet();
            }
            if (c == '\'' && string.length() > n5 + 2 && string.charAt(n5 + 1) == '\'' && string.charAt(n5 + 2) == '\'') {
                n4 = n5;
                atomicInteger.addAndGet(2);
                break;
            }
            n5 = atomicInteger.incrementAndGet();
        }
        if (n4 == -1) {
            Results$Errors results$Errors = new Results$Errors();
            results$Errors.unterminated(context.identifier.getName(), string.substring(n2), n);
            return results$Errors;
        }
        return string.substring(n3, n4);
    }

    @Override
    public boolean canRead(String string) {
        return string.startsWith("'''");
    }
}

