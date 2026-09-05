/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.DatePolicy;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.IndentationPolicy;

class WriterContext {
    private String arrayKey = null;
    private boolean isArrayOfTable = false;
    private boolean empty = true;
    private final String key;
    private final String currentTableIndent;
    private final String currentFieldIndent;
    private final Writer output;
    private final IndentationPolicy indentationPolicy;
    private final DatePolicy datePolicy;

    private WriterContext(String string, String string2, Writer writer, IndentationPolicy indentationPolicy, DatePolicy datePolicy) {
        this.key = string;
        this.output = writer;
        this.indentationPolicy = indentationPolicy;
        this.currentTableIndent = string2;
        this.datePolicy = datePolicy;
        this.currentFieldIndent = string2 + this.fillStringWithSpaces(this.indentationPolicy.getKeyValueIndent());
    }

    WriterContext(IndentationPolicy indentationPolicy, DatePolicy datePolicy, Writer writer) {
        this("", "", writer, indentationPolicy, datePolicy);
    }

    void indent() {
        if (!this.key.isEmpty()) {
            this.write(this.currentFieldIndent);
        }
    }

    WriterContext write(char c) {
        try {
            this.output.write(c);
            this.empty = false;
            return this;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    void write(char[] cArray) {
        for (char c : cArray) {
            this.write(c);
        }
    }

    WriterContext write(String string) {
        try {
            this.output.write(string);
            if (this.empty && !string.isEmpty()) {
                this.empty = false;
            }
            return this;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    void writeKey() {
        if (this.key.isEmpty()) {
            return;
        }
        if (!this.empty) {
            this.write('\n');
        }
        this.write(this.currentTableIndent);
        if (this.isArrayOfTable) {
            this.write("[[").write(this.key).write("]]\n");
        } else {
            this.write('[').write(this.key).write("]\n");
        }
    }

    WriterContext pushTable(String string) {
        String string2 = "";
        if (!this.key.isEmpty()) {
            string2 = this.growIndent(this.indentationPolicy);
        }
        String string3 = this.key.isEmpty() ? string : this.key + "." + string;
        WriterContext writerContext = new WriterContext(string3, string2, this.output, this.indentationPolicy, this.datePolicy);
        if (!this.empty) {
            writerContext.empty = false;
        }
        return writerContext;
    }

    private String growIndent(IndentationPolicy indentationPolicy) {
        return this.currentTableIndent + this.fillStringWithSpaces(indentationPolicy.getTableIndent());
    }

    DatePolicy getDatePolicy() {
        return this.datePolicy;
    }

    String getContextPath() {
        return this.key.isEmpty() ? this.arrayKey : this.key + "." + this.arrayKey;
    }

    WriterContext pushTableFromArray() {
        WriterContext writerContext = new WriterContext(this.key, this.currentTableIndent, this.output, this.indentationPolicy, this.datePolicy);
        if (!this.empty) {
            writerContext.empty = false;
        }
        writerContext.setIsArrayOfTable(true);
        return writerContext;
    }

    WriterContext setIsArrayOfTable(boolean bl) {
        this.isArrayOfTable = bl;
        return this;
    }

    WriterContext setArrayKey(String string) {
        this.arrayKey = string;
        return this;
    }

    private String fillStringWithSpaces(int n) {
        char[] cArray = new char[n];
        Arrays.fill(cArray, ' ');
        return new String(cArray);
    }

    void writeArrayDelimiterPadding() {
        for (int i = 0; i < this.indentationPolicy.getArrayDelimiterPadding(); ++i) {
            this.write(' ');
        }
    }
}

