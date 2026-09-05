/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.scanner.Constant
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.reader;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.reader.ReaderException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.scanner.Constant;

public class StreamReader {
    private String name = "'reader'";
    private final Reader stream;
    private int[] dataWindow = new int[0];
    private int dataLength = 0;
    private int pointer = 0;
    private boolean eof;
    private int index = 0;
    private int line = 0;
    private int column = 0;
    private char[] buffer;
    private static final int BUFFER_SIZE = 1025;

    public int getColumn() {
        return this.column;
    }

    public static boolean isPrintable(String string) {
        int n;
        int n2 = string.length();
        for (int i = 0; i < n2; i += Character.charCount(n)) {
            n = string.codePointAt(i);
            if (StreamReader.isPrintable(n)) continue;
            return false;
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean isPrintable(int n) {
        if (n >= 32) {
            if (n <= 126) return true;
        }
        if (n == 9) return true;
        if (n == 10) return true;
        if (n == 13) return true;
        if (n == 133) return true;
        if (n >= 160) {
            if (n <= 55295) return true;
        }
        if (n >= 57344) {
            if (n <= 65533) return true;
        }
        if (n < 65536) return false;
        if (n > 0x10FFFF) return false;
        return true;
    }

    public StreamReader(String string) {
        this(new StringReader(string));
        this.name = "'string'";
    }

    public StreamReader(Reader reader) {
        this.stream = reader;
        this.eof = false;
        this.buffer = new char[1025];
    }

    private void update() {
        try {
            int n = this.stream.read(this.buffer, 0, 1024);
            if (n > 0) {
                int n2 = this.dataLength - this.pointer;
                this.dataWindow = Arrays.copyOfRange(this.dataWindow, this.pointer, this.dataLength + n);
                if (Character.isHighSurrogate(this.buffer[n - 1])) {
                    if (this.stream.read(this.buffer, n, 1) == -1) {
                        this.eof = true;
                    } else {
                        ++n;
                    }
                }
                int n3 = 32;
                int n4 = 0;
                while (n4 < n) {
                    int n5;
                    this.dataWindow[n2] = n5 = Character.codePointAt(this.buffer, n4);
                    if (StreamReader.isPrintable(n5)) {
                        n4 += Character.charCount(n5);
                    } else {
                        n3 = n5;
                        n4 = n;
                    }
                    ++n2;
                }
                this.dataLength = n2;
                this.pointer = 0;
                if (n3 != 32) {
                    throw new ReaderException(this.name, n2 - 1, n3, "special characters are not allowed");
                }
            } else {
                this.eof = true;
            }
        }
        catch (IOException iOException) {
            throw new YAMLException(iOException);
        }
    }

    public String prefix(int n) {
        if (n == 0) {
            return "";
        }
        if (this.ensureEnoughData(n)) {
            return new String(this.dataWindow, this.pointer, n);
        }
        return new String(this.dataWindow, this.pointer, Math.min(n, this.dataLength - this.pointer));
    }

    public int getIndex() {
        return this.index;
    }

    public int peek(int n) {
        return this.ensureEnoughData(n) ? this.dataWindow[this.pointer + n] : 0;
    }

    public int peek() {
        return this.ensureEnoughData() ? this.dataWindow[this.pointer] : 0;
    }

    private boolean ensureEnoughData(int n) {
        if (!this.eof && this.pointer + n >= this.dataLength) {
            this.update();
        }
        return this.pointer + n < this.dataLength;
    }

    private boolean ensureEnoughData() {
        return this.ensureEnoughData(0);
    }

    public String prefixForward(int n) {
        String string = this.prefix(n);
        this.pointer += n;
        this.index += n;
        this.column += n;
        return string;
    }

    public int getLine() {
        return this.line;
    }

    public Mark getMark() {
        return new Mark(this.name, this.index, this.line, this.column, this.dataWindow, this.pointer);
    }

    public void forward() {
        this.forward(1);
    }

    public void forward(int n) {
        for (int i = 0; i < n && this.ensureEnoughData(); ++i) {
            int n2 = this.dataWindow[this.pointer++];
            ++this.index;
            if (Constant.LINEBR.has(n2) || n2 == 13 && this.ensureEnoughData() && this.dataWindow[this.pointer] != 10) {
                ++this.line;
                this.column = 0;
                continue;
            }
            if (n2 == 65279) continue;
            ++this.column;
        }
    }
}

