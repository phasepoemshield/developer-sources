/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Context;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.DatePolicy;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.DateValueReaderWriter$1;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.DateValueReaderWriter$DateConverterJdk6;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Results$Errors;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueReader;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.ValueWriter;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.WriterContext;

class DateValueReaderWriter
implements ValueReader,
ValueWriter {
    static final DateValueReaderWriter DATE_VALUE_READER_WRITER = new DateValueReaderWriter();
    static final DateValueReaderWriter DATE_PARSER_JDK_6 = new DateValueReaderWriter$DateConverterJdk6(null);
    private static final Pattern DATE_REGEX = Pattern.compile("(\\d{4}-[0-1][0-9]-[0-3][0-9]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9])(\\.\\d*)?(Z|(?:[+\\-]\\d{2}:\\d{2}))(.*)");

    @Override
    public boolean isPrimitiveType() {
        return true;
    }

    static /* synthetic */ DateFormat access$200(DateValueReaderWriter dateValueReaderWriter, DatePolicy datePolicy) {
        return dateValueReaderWriter.getFormatter(datePolicy);
    }

    /* synthetic */ DateValueReaderWriter(DateValueReaderWriter$1 dateValueReaderWriter$1) {
        this();
    }

    private DateValueReaderWriter() {
    }

    public String toString() {
        return "datetime";
    }

    @Override
    public void write(Object object, WriterContext writerContext) {
        DateFormat dateFormat = this.getFormatter(writerContext.getDatePolicy());
        writerContext.write(dateFormat.format(object));
    }

    @Override
    public Object read(String string, AtomicInteger atomicInteger, Context context) {
        String string2;
        Matcher matcher;
        StringBuilder stringBuilder = new StringBuilder();
        int n = atomicInteger.get();
        while (n < string.length()) {
            char c = string.charAt(n);
            if (!Character.isDigit(c) && c != '-' && c != '+' && c != ':' && c != '.' && c != 'T' && c != 'Z') {
                atomicInteger.decrementAndGet();
                break;
            }
            stringBuilder.append(c);
            n = atomicInteger.incrementAndGet();
        }
        if (!(matcher = DATE_REGEX.matcher(string2 = stringBuilder.toString())).matches()) {
            Results$Errors results$Errors = new Results$Errors();
            results$Errors.invalidValue(context.identifier.getName(), string2, context.line.get());
            return results$Errors;
        }
        String string3 = matcher.group(1);
        String string4 = matcher.group(3);
        String string5 = matcher.group(2);
        String string6 = "yyyy-MM-dd'T'HH:mm:ss";
        if (string5 != null && !string5.isEmpty()) {
            string6 = string6 + ".SSS";
            string3 = string3 + string5;
        }
        string6 = string6 + "Z";
        if ("Z".equals(string4)) {
            string3 = string3 + "+0000";
        } else if (string4.contains(":")) {
            string3 = string3 + string4.replace(":", "");
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string6);
            simpleDateFormat.setLenient(false);
            return simpleDateFormat.parse(string3);
        }
        catch (Exception exception) {
            Results$Errors results$Errors = new Results$Errors();
            results$Errors.invalidValue(context.identifier.getName(), string2, context.line.get());
            return results$Errors;
        }
    }

    @Override
    public boolean canRead(String string) {
        if (string.length() < 5) {
            return false;
        }
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(i);
            if (!(i < 4 ? !Character.isDigit(c) : c != '-')) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean canWrite(Object object) {
        return object instanceof Date;
    }

    private DateFormat getFormatter(DatePolicy datePolicy) {
        boolean bl = "UTC".equals(datePolicy.getTimeZone().getID());
        String string = bl && datePolicy.isShowFractionalSeconds() ? "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'" : (bl ? "yyyy-MM-dd'T'HH:mm:ss'Z'" : (datePolicy.isShowFractionalSeconds() ? this.getTimeZoneAndFractionalSecondsFormat() : this.getTimeZoneFormat()));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string);
        simpleDateFormat.setTimeZone(datePolicy.getTimeZone());
        return simpleDateFormat;
    }

    String getTimeZoneAndFractionalSecondsFormat() {
        return "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
    }

    String getTimeZoneFormat() {
        return "yyyy-MM-dd'T'HH:mm:ssXXX";
    }
}

