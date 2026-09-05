/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.net.URI;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Context;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Results$Errors;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueReader;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.WriterContext;

class StringValueReaderWriter
implements ValueReader,
ValueWriter {
    static final StringValueReaderWriter STRING_VALUE_READER_WRITER = new StringValueReaderWriter();
    private static final Pattern UNICODE_REGEX = Pattern.compile("\\\\[uU](.{4})");
    private static final String[] specialCharacterEscapes = new String[93];

    @Override
    public boolean isPrimitiveType() {
        return true;
    }

    private StringValueReaderWriter() {
    }

    static {
        StringValueReaderWriter.specialCharacterEscapes[8] = "\\b";
        StringValueReaderWriter.specialCharacterEscapes[9] = "\\t";
        StringValueReaderWriter.specialCharacterEscapes[10] = "\\n";
        StringValueReaderWriter.specialCharacterEscapes[12] = "\\f";
        StringValueReaderWriter.specialCharacterEscapes[13] = "\\r";
        StringValueReaderWriter.specialCharacterEscapes[34] = "\\\"";
        StringValueReaderWriter.specialCharacterEscapes[92] = "\\\\";
    }

    public String toString() {
        return "string";
    }

    @Override
    public void write(Object object, WriterContext writerContext) {
        writerContext.write('\"');
        this.escapeUnicode(object.toString(), writerContext);
        writerContext.write('\"');
    }

    @Override
    public Object read(String string, AtomicInteger atomicInteger, Context context) {
        int n = atomicInteger.incrementAndGet();
        int n2 = -1;
        int n3 = atomicInteger.get();
        while (n3 < string.length()) {
            char c = string.charAt(n3);
            if (c == '\"' && string.charAt(n3 - 1) != '\\') {
                n2 = n3;
                break;
            }
            n3 = atomicInteger.incrementAndGet();
        }
        if (n2 == -1) {
            Results$Errors results$Errors = new Results$Errors();
            results$Errors.unterminated(context.identifier.getName(), string.substring(n - 1), context.line.get());
            return results$Errors;
        }
        String string2 = string.substring(n, n2);
        string = this.replaceUnicodeCharacters(string2);
        if ((string = this.replaceSpecialCharacters(string)) == null) {
            Results$Errors results$Errors = new Results$Errors();
            results$Errors.invalidValue(context.identifier.getName(), string2, context.line.get());
            return results$Errors;
        }
        return string;
    }

    private void escapeUnicode(String string, WriterContext writerContext) {
        for (int i = 0; i < string.length(); ++i) {
            int n = string.codePointAt(i);
            if (n < specialCharacterEscapes.length && specialCharacterEscapes[n] != null) {
                writerContext.write(specialCharacterEscapes[n]);
                continue;
            }
            writerContext.write(string.charAt(i));
        }
    }

    @Override
    public boolean canRead(String string) {
        return string.startsWith("\"");
    }

    @Override
    public boolean canWrite(Object object) {
        return object instanceof String || object instanceof Character || object instanceof URL || object instanceof URI || object instanceof Enum;
    }

    String replaceUnicodeCharacters(String string) {
        Matcher matcher = UNICODE_REGEX.matcher(string);
        while (matcher.find()) {
            string = string.replace(matcher.group(), new String(Character.toChars(Integer.parseInt(matcher.group(1), 16))));
        }
        return string;
    }

    String replaceSpecialCharacters(String string) {
        for (int i = 0; i < string.length() - 1; ++i) {
            char c = string.charAt(i);
            char c2 = string.charAt(i + 1);
            if (c == '\\' && c2 == '\\') {
                ++i;
                continue;
            }
            if (c != '\\' || c2 == 'b' || c2 == 'f' || c2 == 'n' || c2 == 't' || c2 == 'r' || c2 == '\"' || c2 == '\\') continue;
            return null;
        }
        return string.replace("\\n", "\n").replace("\\\"", "\"").replace("\\t", "\t").replace("\\r", "\r").replace("\\\\", "\\").replace("\\/", "/").replace("\\b", "\b").replace("\\f", "\f");
    }
}

