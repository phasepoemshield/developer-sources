/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.concurrent.atomic.AtomicInteger;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Context;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Identifier;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.IdentifierConverter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Results;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Results$Errors;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueReaders;

class TomlParser {
    private TomlParser() {
    }

    static Results run(String string) {
        Results results = new Results();
        if (string.isEmpty()) {
            return results;
        }
        AtomicInteger atomicInteger = new AtomicInteger();
        boolean bl = false;
        AtomicInteger atomicInteger2 = new AtomicInteger(1);
        Identifier identifier = null;
        Object object = null;
        int n = atomicInteger.get();
        while (n < string.length()) {
            char c = string.charAt(n);
            if (results.errors.hasErrors()) break;
            if (c == '#' && !bl) {
                bl = true;
            } else if (!Character.isWhitespace(c) && !bl && identifier == null) {
                Identifier identifier2 = IdentifierConverter.IDENTIFIER_CONVERTER.convert(string, atomicInteger, new Context(null, atomicInteger2, results.errors));
                if (identifier2 != Identifier.INVALID) {
                    if (identifier2.isKey()) {
                        identifier = identifier2;
                    } else if (identifier2.isTable()) {
                        results.startTables(identifier2, atomicInteger2);
                    } else if (identifier2.isTableArray()) {
                        results.startTableArray(identifier2, atomicInteger2);
                    }
                }
            } else if (c == '\n') {
                bl = false;
                identifier = null;
                object = null;
                atomicInteger2.incrementAndGet();
            } else if (!bl && identifier != null && identifier.isKey() && object == null && !Character.isWhitespace(c)) {
                object = ValueReaders.VALUE_READERS.convert(string, atomicInteger, new Context(identifier, atomicInteger2, results.errors));
                if (object instanceof Results$Errors) {
                    results.errors.add((Results$Errors)object);
                } else {
                    results.addValue(identifier.getName(), object, atomicInteger2);
                }
            } else if (object != null && !bl && !Character.isWhitespace(c)) {
                results.errors.invalidTextAfterIdentifier(identifier, c, atomicInteger2.get());
            }
            n = atomicInteger.incrementAndGet();
        }
        return results;
    }
}

