/*
 * Decompiled with CFR 0.152.
 */
package wrench_wrapper.relocated.org.quiltmc.parsers.json;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Arrays;

public final class JsonWriter
implements Closeable,
Flushable {
    public static final String[] REPLACEMENT_CHARS = new String[128];
    public final Writer out;
    public final int format;
    public int[] stack;
    public int stackSize;
    public final String indent;
    public final String separator;
    public String deferredName;
    public String deferredComment;
    public final boolean serializeNulls;

    public JsonWriter(OutputStreamWriter outputStreamWriter) {
        JsonWriter jsonWriter = this;
        JsonWriter jsonWriter2 = this;
        jsonWriter2.stack = new int[32];
        jsonWriter2.stackSize = 0;
        jsonWriter2.push(6);
        jsonWriter2.indent = "\t";
        jsonWriter2.separator = ": ";
        jsonWriter2.serializeNulls = true;
        jsonWriter.out = outputStreamWriter;
        jsonWriter.format = 3;
    }

    public final void name(String string) {
        if (string != null) {
            if (this.deferredName == null) {
                if (this.stackSize != 0) {
                    this.deferredName = string;
                    return;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public final void value(Number number) {
        if (number == null) {
            this.nullValue();
            return;
        }
        this.writeDeferredName();
        String string = number.toString();
        if (this.format != 3 && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        JsonWriter jsonWriter = this;
        jsonWriter.beforeValue();
        jsonWriter.out.append(string);
    }

    @Override
    public final void flush() {
        if (this.stackSize != 0) {
            this.out.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override
    public final void close() {
        JsonWriter jsonWriter = this;
        jsonWriter.out.close();
        int n = jsonWriter.stackSize;
        if (n <= 1 && (n != 1 || this.stack[n - 1] == 7)) {
            this.stackSize = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final JsonWriter close(int n, int n2, char c) {
        int n3 = this.stackSize;
        if (n3 != 0) {
            int n4 = this.stack[n3 - 1];
            if (n4 != n2 && n4 != n) {
                throw new IllegalStateException("Nesting problem.");
            }
            if (this.deferredName == null) {
                this.stackSize = n3 - 1;
                if (n4 == n2) {
                    this.commentAndNewline();
                }
                JsonWriter jsonWriter = this;
                jsonWriter.out.write(c);
                return jsonWriter;
            }
            throw new IllegalStateException("Dangling name: " + this.deferredName);
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void comment(String string) {
        if (this.format != 1 && string != null) {
            this.deferredComment = this.deferredComment == null ? string : this.deferredComment + "\n" + string;
            int n = this.stackSize;
            if (n == 1) {
                if (n != 0) {
                    if (this.stack[n - 1] == 7) {
                        JsonWriter jsonWriter = this;
                        jsonWriter.out.append('\n');
                        jsonWriter.writeDeferredComment();
                    }
                } else {
                    throw new IllegalStateException("JsonWriter is closed.");
                }
            }
            return;
        }
    }

    public final void string(String string, boolean bl, boolean bl2) {
        String[] stringArray = REPLACEMENT_CHARS;
        if (bl) {
            this.out.write(34);
        }
        int n = 0;
        int n2 = string.length();
        for (int i = 0; i < n2; ++i) {
            String string2;
            char c = string.charAt(i);
            if (c < '\u0080') {
                if (c == '\"' && !bl2 || (string2 = stringArray[c]) == null) {
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
        if (bl) {
            this.out.write(34);
        }
    }

    public final void push(int n) {
        int n2 = this.stackSize;
        int[] nArray = this.stack;
        if (n2 == this.stack.length) {
            this.stack = Arrays.copyOf(nArray, n2 * 2);
        }
        int n3 = this.stackSize;
        this.stackSize = n3 + 1;
        this.stack[n3] = n;
    }

    public final JsonWriter nullValue() {
        if (this.deferredName != null) {
            if (this.serializeNulls) {
                this.writeDeferredName();
            } else {
                this.deferredName = null;
                return this;
            }
        }
        JsonWriter jsonWriter = this;
        jsonWriter.beforeValue();
        jsonWriter.out.write("null");
        return jsonWriter;
    }

    public final void writeDeferredComment() {
        String[] stringArray = this.deferredComment;
        if (this.deferredComment == null) {
            return;
        }
        for (String string : stringArray.split("\n")) {
            int n = this.stackSize;
            for (int i = 1; i < n; ++i) {
                this.out.write(this.indent);
            }
            JsonWriter jsonWriter = this;
            this.out.write("// ");
            jsonWriter.string(string, false, false);
            jsonWriter.out.write("\n");
        }
        this.deferredComment = null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void writeDeferredName() {
        if (this.deferredName == null) return;
        int n = this.stackSize;
        if (n == 0) throw new IllegalStateException("JsonWriter is closed.");
        if ((n = this.stack[n - 1]) == 5) {
            this.out.write(44);
        } else if (n != 3) throw new IllegalStateException("Nesting problem.");
        JsonWriter jsonWriter = this;
        jsonWriter.commentAndNewline();
        jsonWriter.stack[this.stackSize - 1] = n = 4;
        n = 1;
        if (jsonWriter.format == 3 && this.deferredName.length() > 0 && Character.isJavaIdentifierStart(this.deferredName.charAt(0))) {
            n = 0;
            for (int i = 1; i < this.deferredName.length(); ++i) {
                if (Character.isJavaIdentifierPart(this.deferredName.charAt(i))) continue;
                n = 1;
                break;
            }
        }
        JsonWriter jsonWriter2 = this;
        jsonWriter2.string(jsonWriter2.deferredName, n != 0, true);
        jsonWriter2.deferredName = null;
    }

    public final void beforeValue() {
        int n = this.stackSize;
        if (n != 0) {
            int[] nArray = this.stack;
            switch (this.stack[n - 1]) {
                default: {
                    throw new IllegalStateException("Nesting problem.");
                }
                case 7: {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                case 6: {
                    JsonWriter jsonWriter = this;
                    jsonWriter.writeDeferredComment();
                    jsonWriter.stack[this.stackSize - 1] = n = 7;
                    break;
                }
                case 4: {
                    JsonWriter jsonWriter = this;
                    jsonWriter.out.append(this.separator);
                    jsonWriter.stack[this.stackSize - 1] = n = 5;
                    break;
                }
                case 2: {
                    JsonWriter jsonWriter = this;
                    jsonWriter.out.append(',');
                    jsonWriter.commentAndNewline();
                    break;
                }
                case 1: {
                    int n2;
                    nArray[n - 1] = n2 = 2;
                    this.commentAndNewline();
                }
            }
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void commentAndNewline() {
        if (this.indent == null) {
            return;
        }
        JsonWriter jsonWriter = this;
        jsonWriter.out.write(10);
        jsonWriter.writeDeferredComment();
        int n = jsonWriter.stackSize;
        for (int i = 1; i < n; ++i) {
            this.out.write(this.indent);
        }
    }

    static {
        int n = 0;
        while (n <= 31) {
            int n2 = n++;
            Integer n3 = n2;
            Object[] objectArray = new Object[1];
            Object[] objectArray2 = objectArray;
            objectArray[0] = n3;
            JsonWriter.REPLACEMENT_CHARS[n2] = String.format("\\u%04x", objectArray2);
        }
        String[] stringArray = REPLACEMENT_CHARS;
        String[] stringArray2 = REPLACEMENT_CHARS;
        stringArray[34] = "\\\"";
        stringArray2[92] = "\\\\";
        stringArray[9] = "\\t";
        stringArray2[8] = "\\b";
        stringArray[10] = "\\n";
        stringArray2[13] = "\\r";
        stringArray[12] = "\\f";
        String[] stringArray3 = (String[])stringArray2.clone();
        stringArray3[60] = "\\u003c";
        stringArray3[62] = "\\u003e";
        stringArray3[38] = "\\u0026";
        stringArray3[61] = "\\u003d";
        stringArray3[39] = "\\u0027";
    }
}

