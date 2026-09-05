/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import org.jspecify.annotations.Nullable;

public final class class04215
extends Record {
    private final LocalDate date;
    private final int index;
    private static final DateTimeFormatter L = DateTimeFormatter.BASIC_ISO_DATE;

    public class04215(LocalDate localDate, int n) {
        this.date = localDate;
        this.index = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04215.class, "date;index", "date", "index"}, this, object);
    }

    public String toString() {
        return L.format(this.date) + "-" + this.index;
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04215.class, "date;index", "date", "index"}, this);
    }

    public int y() {
        return this.index;
    }

    public String y(String string) {
        return String.valueOf((Object)this) + string;
    }

    public static @Nullable class04215 N(String string) {
        int n = string.indexOf("-");
        if (n == -1) {
            return null;
        }
        String string2 = string.substring(0, n);
        String string3 = string.substring(n + 1);
        try {
            return new class04215(LocalDate.parse(string2, L), Integer.parseInt(string3));
        }
        catch (NumberFormatException | DateTimeParseException runtimeException) {
            return null;
        }
    }

    public LocalDate N() {
        return this.date;
    }
}

