/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.concurrent.atomic.AtomicInteger;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Context;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Identifier;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Keys;

class IdentifierConverter {
    static final IdentifierConverter IDENTIFIER_CONVERTER = new IdentifierConverter();

    private IdentifierConverter() {
    }

    Identifier convert(String string, AtomicInteger atomicInteger, Context context) {
        boolean bl = false;
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl2 = false;
        boolean bl3 = string.charAt(atomicInteger.get()) != '[';
        boolean bl4 = !bl3 && string.length() > atomicInteger.get() + 1 && string.charAt(atomicInteger.get() + 1) == '[';
        boolean bl5 = false;
        int n = atomicInteger.get();
        while (n < string.length()) {
            char c = string.charAt(n);
            if (Keys.isQuote(c) && (n == 0 || string.charAt(n - 1) != '\\')) {
                bl = !bl;
                stringBuilder.append(c);
            } else {
                if (c == '\n') {
                    atomicInteger.decrementAndGet();
                    break;
                }
                if (bl) {
                    stringBuilder.append(c);
                } else {
                    if (c == '=' && bl3) {
                        bl2 = true;
                        break;
                    }
                    if (c == ']' && !bl3) {
                        if (!bl4 || string.length() > atomicInteger.get() + 1 && string.charAt(atomicInteger.get() + 1) == ']') {
                            bl2 = true;
                            stringBuilder.append(']');
                            if (bl4) {
                                stringBuilder.append(']');
                            }
                        }
                    } else if (bl2 && c == '#') {
                        bl5 = true;
                    } else {
                        if (bl2 && !Character.isWhitespace(c) && !bl5) {
                            bl2 = false;
                            break;
                        }
                        if (!bl2) {
                            stringBuilder.append(c);
                        }
                    }
                }
            }
            n = atomicInteger.incrementAndGet();
        }
        if (!bl2) {
            if (bl3) {
                context.errors.unterminatedKey(stringBuilder.toString(), context.line.get());
            } else {
                context.errors.invalidKey(stringBuilder.toString(), context.line.get());
            }
            return Identifier.INVALID;
        }
        return Identifier.from(stringBuilder.toString(), context);
    }
}

