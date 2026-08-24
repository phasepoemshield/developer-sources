/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

public final class Streams {
    public static Writer writerForAppendable(Appendable appendable) {
        return appendable instanceof Writer ? (Writer)appendable : new AppendableWriter(appendable);
    }

    public static void write(JsonElement element, JsonWriter writer) throws IOException {
        TypeAdapters.JSON_ELEMENT.write(writer, element);
    }

    /*
     * WARNING - void declaration
     */
    public static JsonElement parse(JsonReader reader) throws JsonParseException {
        boolean isEmpty = true;
        try {
            reader.peek();
            isEmpty = false;
            return TypeAdapters.JSON_ELEMENT.read(reader);
        }
        catch (EOFException e) {
            if (isEmpty) {
                return JsonNull.INSTANCE;
            }
            throw new JsonSyntaxException(e);
        }
        catch (MalformedJsonException e) {
            throw new JsonSyntaxException(e);
        }
        catch (IOException e) {
            throw new JsonIOException(e);
        }
        catch (NumberFormatException e) {
            void var2_5;
            throw new JsonSyntaxException((Throwable)var2_5);
        }
    }

    private Streams() {
        throw new UnsupportedOperationException();
    }

    private static final class AppendableWriter
    extends Writer {
        private final CurrentWrite currentWrite = new CurrentWrite();
        private final Appendable appendable;

        @Override
        public void write(char[] chars, int offset, int length) throws IOException {
            this.currentWrite.setChars(chars);
            this.appendable.append(this.currentWrite, offset, offset + length);
        }

        @Override
        public Writer append(CharSequence csq) throws IOException {
            this.appendable.append(csq);
            return this;
        }

        @Override
        public void write(String str, int off, int len) throws IOException {
            Objects.requireNonNull(str);
            this.appendable.append(str, off, off + len);
        }

        @Override
        public void flush() {
        }

        AppendableWriter(Appendable appendable) {
            this.appendable = appendable;
        }

        @Override
        public void write(int i) throws IOException {
            this.appendable.append((char)i);
        }

        @Override
        public void close() {
        }

        @Override
        public Writer append(CharSequence csq, int start, int end) throws IOException {
            this.appendable.append(csq, start, end);
            return this;
        }

        private static class CurrentWrite
        implements CharSequence {
            private char[] chars;
            private String cachedString;

            @Override
            public int length() {
                return this.chars.length;
            }

            @Override
            public CharSequence subSequence(int start, int end) {
                return new String(this.chars, start, end - start);
            }

            private CurrentWrite() {
            }

            @Override
            public String toString() {
                if (this.cachedString == null) {
                    this.cachedString = new String(this.chars);
                }
                return this.cachedString;
            }

            @Override
            public char charAt(int i) {
                return this.chars[i];
            }

            void setChars(char[] chars) {
                this.chars = chars;
                this.cachedString = null;
            }
        }
    }
}

