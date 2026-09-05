/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.concurrent.atomic.AtomicInteger;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Context;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Results$Errors;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueReader;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.WriterContext;

class NumberValueReaderWriter
implements ValueReader,
ValueWriter {
    static final NumberValueReaderWriter NUMBER_VALUE_READER_WRITER = new NumberValueReaderWriter();

    @Override
    public boolean isPrimitiveType() {
        return true;
    }

    NumberValueReaderWriter() {
    }

    public String toString() {
        return "number";
    }

    @Override
    public void write(Object object, WriterContext writerContext) {
        writerContext.write(object.toString());
    }

    @Override
    public Object read(String string, AtomicInteger atomicInteger, Context context) {
        boolean bl = true;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        String string2 = "";
        StringBuilder stringBuilder = new StringBuilder();
        int n = atomicInteger.get();
        while (n < string.length()) {
            boolean bl6;
            char c = string.charAt(n);
            boolean bl7 = bl6 = string.length() > n + 1;
            if (Character.isDigit(c)) {
                stringBuilder.append(c);
                bl = false;
                bl4 = true;
                if (string2.isEmpty()) {
                    string2 = "integer";
                    bl2 = true;
                }
                bl5 = bl6;
                bl3 = !string2.equals("exponent");
            } else if ((c == '+' || c == '-') && bl && bl6) {
                bl = false;
                bl4 = false;
                if (c == '-') {
                    stringBuilder.append('-');
                }
            } else if (c == '.' && bl2 && bl6) {
                stringBuilder.append('.');
                string2 = "float";
                bl4 = false;
                bl2 = false;
                bl3 = false;
                bl5 = false;
            } else if ((c == 'E' || c == 'e') && bl3 && bl6) {
                stringBuilder.append('E');
                string2 = "exponent";
                bl4 = false;
                bl = true;
                bl2 = false;
                bl3 = false;
                bl5 = false;
            } else if (c == '_' && bl5 && bl6 && Character.isDigit(string.charAt(n + 1))) {
                bl5 = false;
            } else {
                if (!bl4) {
                    string2 = "";
                }
                atomicInteger.decrementAndGet();
                break;
            }
            n = atomicInteger.incrementAndGet();
        }
        if (string2.equals("integer")) {
            return Long.valueOf(stringBuilder.toString());
        }
        if (string2.equals("float")) {
            return Double.valueOf(stringBuilder.toString());
        }
        if (string2.equals("exponent")) {
            String[] stringArray = stringBuilder.toString().split("E");
            return Double.parseDouble(stringArray[0]) * Math.pow(10.0, Double.parseDouble(stringArray[1]));
        }
        Results$Errors results$Errors = new Results$Errors();
        results$Errors.invalidValue(context.identifier.getName(), stringBuilder.toString(), context.line.get());
        return results$Errors;
    }

    @Override
    public boolean canRead(String string) {
        char c = string.charAt(0);
        return c == '+' || c == '-' || Character.isDigit(c);
    }

    @Override
    public boolean canWrite(Object object) {
        return Number.class.isInstance(object);
    }
}

