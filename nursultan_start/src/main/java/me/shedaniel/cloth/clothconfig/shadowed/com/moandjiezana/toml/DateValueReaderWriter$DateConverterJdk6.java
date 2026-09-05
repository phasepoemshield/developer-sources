/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.text.DateFormat;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.DateValueReaderWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.DateValueReaderWriter$1;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.WriterContext;

class DateValueReaderWriter$DateConverterJdk6
extends DateValueReaderWriter {
    /* synthetic */ DateValueReaderWriter$DateConverterJdk6(DateValueReaderWriter$1 dateValueReaderWriter$1) {
        this();
    }

    private DateValueReaderWriter$DateConverterJdk6() {
        super(null);
    }

    @Override
    public void write(Object object, WriterContext writerContext) {
        DateFormat dateFormat = DateValueReaderWriter.access$200(this, writerContext.getDatePolicy());
        String string = dateFormat.format(object);
        if ("UTC".equals(writerContext.getDatePolicy().getTimeZone().getID())) {
            writerContext.write(string);
        } else {
            int n = string.length() - 2;
            writerContext.write(string.substring(0, n)).write(':').write(string.substring(n));
        }
    }

    @Override
    String getTimeZoneAndFractionalSecondsFormat() {
        return "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    }

    @Override
    String getTimeZoneFormat() {
        return "yyyy-MM-dd'T'HH:mm:ssZ";
    }
}

