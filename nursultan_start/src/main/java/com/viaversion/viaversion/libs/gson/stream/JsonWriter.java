/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.FormattingStyle
 *  com.viaversion.viaversion.libs.gson.Strictness
 */
package com.viaversion.viaversion.libs.gson.stream;

import com.viaversion.viaversion.libs.gson.FormattingStyle;
import com.viaversion.viaversion.libs.gson.Strictness;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public class JsonWriter
implements Closeable,
Flushable {
    private static final Pattern VALID_JSON_NUMBER_PATTERN = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] REPLACEMENT_CHARS = new String[128];
    private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
    private final Writer out;
    private int[] stack = new int[32];
    private int stackSize = 0;
    private FormattingStyle formattingStyle;
    private String formattedColon;
    private String formattedComma;
    private boolean usesEmptyNewlineAndIndent;
    private Strictness strictness;
    private boolean htmlSafe;
    private String deferredName;
    private boolean serializeNulls;

    @Deprecated
    public final void setLenient(boolean bl) {
        this.setStrictness(bl ? Strictness.LENIENT : Strictness.LEGACY_STRICT);
    }

    public JsonWriter beginObject() throws IOException {
        this.writeDeferredName();
        return this.openScope(3, '{');
    }

    public JsonWriter endObject() throws IOException {
        return this.closeScope(3, 5, '}');
    }

    public JsonWriter beginArray() throws IOException {
        this.writeDeferredName();
        return this.openScope(1, '[');
    }

    public JsonWriter endArray() throws IOException {
        return this.closeScope(1, 2, ']');
    }

    public JsonWriter(Writer writer) {
        this.push(6);
        this.strictness = Strictness.LEGACY_STRICT;
        this.serializeNulls = true;
        this.out = Objects.requireNonNull(writer, "out == null");
        this.setFormattingStyle(FormattingStyle.COMPACT);
    }

    public JsonWriter name(String string) throws IOException {
        Objects.requireNonNull(string, "name == null");
        if (this.deferredName != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int n = this.peek();
        if (n != 3 && n != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.deferredName = string;
        return this;
    }

    public JsonWriter value(long l) throws IOException {
        this.writeDeferredName();
        this.beforeValue();
        this.out.write(Long.toString(l));
        return this;
    }

    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return this.nullValue();
        }
        this.writeDeferredName();
        String string = number.toString();
        Class<?> clazz = number.getClass();
        if (!JsonWriter.alwaysCreatesValidJsonNumber(clazz)) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.strictness != Strictness.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
                }
            } else if (clazz != Float.class && clazz != Double.class && !VALID_JSON_NUMBER_PATTERN.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + clazz + " is not a valid JSON number: " + string);
            }
        }
        this.beforeValue();
        this.out.append(string);
        return this;
    }

    public JsonWriter value(double d) throws IOException {
        this.writeDeferredName();
        if (this.strictness != Strictness.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        this.beforeValue();
        this.out.append(Double.toString(d));
        return this;
    }

    public JsonWriter value(boolean bl) throws IOException {
        this.writeDeferredName();
        this.beforeValue();
        this.out.write(bl ? "true" : "false");
        return this;
    }

    public JsonWriter value(Boolean bl) throws IOException {
        if (bl == null) {
            return this.nullValue();
        }
        this.writeDeferredName();
        this.beforeValue();
        this.out.write(bl != false ? "true" : "false");
        return this;
    }

    public JsonWriter value(float f) throws IOException {
        this.writeDeferredName();
        if (this.strictness != Strictness.LENIENT && (Float.isNaN(f) || Float.isInfinite(f))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f);
        }
        this.beforeValue();
        this.out.append(Float.toString(f));
        return this;
    }

    public JsonWriter value(String string) throws IOException {
        if (string == null) {
            return this.nullValue();
        }
        this.writeDeferredName();
        this.beforeValue();
        this.string(string);
        return this;
    }

    @Override
    public void flush() throws IOException {
        if (this.stackSize == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.out.flush();
    }

    @Override
    public void close() throws IOException {
        this.out.close();
        int n = this.stackSize;
        if (n > 1 || n == 1 && this.stack[n - 1] != 7) {
            throw new IOException("Incomplete document");
        }
        this.stackSize = 0;
    }

    private int peek() {
        if (this.stackSize == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.stack[this.stackSize - 1];
    }

    private JsonWriter closeScope(int n, int n2, char c) throws IOException {
        int n3 = this.peek();
        if (n3 != n2 && n3 != n) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.deferredName != null) {
            throw new IllegalStateException("Dangling name: " + this.deferredName);
        }
        --this.stackSize;
        if (n3 == n2) {
            this.newline();
        }
        this.out.write(c);
        return this;
    }

    private void string(String string) throws IOException {
        String[] stringArray = this.htmlSafe ? HTML_SAFE_REPLACEMENT_CHARS : REPLACEMENT_CHARS;
        this.out.write(34);
        int n = 0;
        int n2 = string.length();
        for (int i = 0; i < n2; ++i) {
            String string2;
            char c = string.charAt(i);
            if (c < '\u0080') {
                string2 = stringArray[c];
                if (string2 == null) {
                    continue;
                }
            } else if (c == '\u2028') {
                string2 = "\\u2028";
            } else {
                if (c != '\u2029') continue;
                string2 = "\\u2029";
            }
            if (n < i) {
                this.out.write(string, n, i - n);
            }
            this.out.write(string2);
            n = i + 1;
        }
        if (n < n2) {
            this.out.write(string, n, n2 - n);
        }
        this.out.write(34);
    }

    private void push(int n) {
        if (this.stackSize == this.stack.length) {
            this.stack = Arrays.copyOf(this.stack, this.stackSize * 2);
        }
        this.stack[this.stackSize++] = n;
    }

    public final boolean isHtmlSafe() {
        return this.htmlSafe;
    }

    private void newline() throws IOException {
        if (this.usesEmptyNewlineAndIndent) {
            return;
        }
        this.out.write(this.formattingStyle.getNewline());
        int n = this.stackSize;
        for (int i = 1; i < n; ++i) {
            this.out.write(this.formattingStyle.getIndent());
        }
    }

    public JsonWriter nullValue() throws IOException {
        if (this.deferredName != null) {
            if (this.serializeNulls) {
                this.writeDeferredName();
            } else {
                this.deferredName = null;
                return this;
            }
        }
        this.beforeValue();
        this.out.write("null");
        return this;
    }

    private static boolean alwaysCreatesValidJsonNumber(Class<? extends Number> clazz) {
        return clazz == Integer.class || clazz == Long.class || clazz == Byte.class || clazz == Short.class || clazz == BigDecimal.class || clazz == BigInteger.class || clazz == AtomicInteger.class || clazz == AtomicLong.class;
    }

    public boolean isLenient() {
        return this.strictness == Strictness.LENIENT;
    }

    public final void setStrictness(Strictness strictness) {
        this.strictness = Objects.requireNonNull(strictness);
    }

    public final void setFormattingStyle(FormattingStyle formattingStyle) {
        this.formattingStyle = Objects.requireNonNull(formattingStyle);
        this.formattedComma = ",";
        if (this.formattingStyle.usesSpaceAfterSeparators()) {
            this.formattedColon = ": ";
            if (this.formattingStyle.getNewline().isEmpty()) {
                this.formattedComma = ", ";
            }
        } else {
            this.formattedColon = ":";
        }
        this.usesEmptyNewlineAndIndent = this.formattingStyle.getNewline().isEmpty() && this.formattingStyle.getIndent().isEmpty();
    }

    public final Strictness getStrictness() {
        return this.strictness;
    }

    public final void setHtmlSafe(boolean bl) {
        this.htmlSafe = bl;
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public final void setSerializeNulls(boolean bl) {
        this.serializeNulls = bl;
    }

    public final void setIndent(String string) {
        if (string.isEmpty()) {
            this.setFormattingStyle(FormattingStyle.COMPACT);
        } else {
            this.setFormattingStyle(FormattingStyle.PRETTY.withIndent(string));
        }
    }

    public final FormattingStyle getFormattingStyle() {
        return this.formattingStyle;
    }

    private void writeDeferredName() throws IOException {
        if (this.deferredName != null) {
            this.beforeName();
            this.string(this.deferredName);
            this.deferredName = null;
        }
    }

    private void beforeValue() throws IOException {
        switch (this.peek()) {
            case 7: {
                if (this.strictness != Strictness.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            case 6: {
                this.replaceTop(7);
                break;
            }
            case 1: {
                this.replaceTop(2);
                this.newline();
                break;
            }
            case 2: {
                this.out.append(this.formattedComma);
                this.newline();
                break;
            }
            case 4: {
                this.out.append(this.formattedColon);
                this.replaceTop(5);
                break;
            }
            default: {
                throw new IllegalStateException("Nesting problem.");
            }
        }
    }

    private void replaceTop(int n) {
        this.stack[this.stackSize - 1] = n;
    }

    private void beforeName() throws IOException {
        int n = this.peek();
        if (n == 5) {
            this.out.write(this.formattedComma);
        } else if (n != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.newline();
        this.replaceTop(4);
    }

    private JsonWriter openScope(int n, char c) throws IOException {
        this.beforeValue();
        this.push(n);
        this.out.write(c);
        return this;
    }

    public JsonWriter jsonValue(String string) throws IOException {
        if (string == null) {
            return this.nullValue();
        }
        this.writeDeferredName();
        this.beforeValue();
        this.out.append(string);
        return this;
    }

    static {
        for (int i = 0; i <= 31; ++i) {
            JsonWriter.REPLACEMENT_CHARS[i] = String.format("\\u%04x", i);
        }
        JsonWriter.REPLACEMENT_CHARS[34] = "\\\"";
        JsonWriter.REPLACEMENT_CHARS[92] = "\\\\";
        JsonWriter.REPLACEMENT_CHARS[9] = "\\t";
        JsonWriter.REPLACEMENT_CHARS[8] = "\\b";
        JsonWriter.REPLACEMENT_CHARS[10] = "\\n";
        JsonWriter.REPLACEMENT_CHARS[13] = "\\r";
        JsonWriter.REPLACEMENT_CHARS[12] = "\\f";
        HTML_SAFE_REPLACEMENT_CHARS = (String[])REPLACEMENT_CHARS.clone();
        JsonWriter.HTML_SAFE_REPLACEMENT_CHARS[60] = "\\u003c";
        JsonWriter.HTML_SAFE_REPLACEMENT_CHARS[62] = "\\u003e";
        JsonWriter.HTML_SAFE_REPLACEMENT_CHARS[38] = "\\u0026";
        JsonWriter.HTML_SAFE_REPLACEMENT_CHARS[61] = "\\u003d";
        JsonWriter.HTML_SAFE_REPLACEMENT_CHARS[39] = "\\u0027";
    }
}

