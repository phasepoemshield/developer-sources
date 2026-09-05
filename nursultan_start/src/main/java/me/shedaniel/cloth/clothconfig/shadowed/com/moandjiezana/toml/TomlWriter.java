/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.TimeZone;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.DatePolicy;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.IndentationPolicy;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.MapValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ObjectValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.TomlWriter$1;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueWriters;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.WriterContext;

public class TomlWriter {
    private final IndentationPolicy indentationPolicy;
    private final DatePolicy datePolicy;

    /* synthetic */ TomlWriter(int n, int n2, int n3, TimeZone timeZone, boolean bl, TomlWriter$1 tomlWriter$1) {
        this(n, n2, n3, timeZone, bl);
    }

    private TomlWriter(int n, int n2, int n3, TimeZone timeZone, boolean bl) {
        this.indentationPolicy = new IndentationPolicy(n, n2, n3);
        this.datePolicy = new DatePolicy(timeZone, bl);
    }

    public TomlWriter() {
        this(0, 0, 0, TimeZone.getTimeZone("UTC"), false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void write(Object object, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            this.write(object, fileOutputStream);
        }
        finally {
            ((OutputStream)fileOutputStream).close();
        }
    }

    public void write(Object object, Writer writer) throws IOException {
        ValueWriter valueWriter = ValueWriters.WRITERS.findWriterFor(object);
        if (valueWriter != MapValueWriter.MAP_VALUE_WRITER && valueWriter != ObjectValueWriter.OBJECT_VALUE_WRITER) {
            throw new IllegalArgumentException("An object of class " + object.getClass().getSimpleName() + " cannot produce valid TOML. Please pass in a Map or a custom type.");
        }
        WriterContext writerContext = new WriterContext(this.indentationPolicy, this.datePolicy, writer);
        valueWriter.write(object, writerContext);
    }

    public void write(Object object, OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
        this.write(object, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public String write(Object object) {
        try {
            StringWriter stringWriter = new StringWriter();
            this.write(object, stringWriter);
            return stringWriter.toString();
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }
}

