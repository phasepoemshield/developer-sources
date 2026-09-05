/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11938
 *  Nursultan.class11999
 */
package Nursultan;

import Nursultan.class11938;
import Nursultan.class11999;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class class11480 {
    private static String[] R;
    private static String[] M;
    private static String[] B;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;

    public static String L() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(B[0]));
    }

    private static void M() {
        N_0 = M[4];
        N_1 = M[5];
        N_2 = M[6];
    }

    private class11480() {
        throw new UnsupportedOperationException(M[3]);
    }

    static {
        class11480.B();
        class11480.M();
    }

    private static void B() {
        R = new String[4];
        class11480.R[0] = "HH:mm";
        class11480.R[1] = "dd.MM.yyyy HH:mm";
        class11480.R[2] = "dd.MM HH:mm";
        class11480.R[3] = "dd.MM.yyyy HH:mm";
        B = new String[3];
        class11480.B[0] = "dd.MM.yyyy";
        class11480.B[1] = "HH:mm";
        class11480.B[2] = "\u0421\u0435\u0433\u043e\u0434\u043d\u044f \u0432";
        M = new String[7];
        class11480.M[0] = "Today at";
        class11480.M[1] = "\u0412\u0447\u0435\u0440\u0430 \u0432";
        class11480.M[2] = "Yesterday at";
        class11480.M[3] = "This is a utility class and cannot be instantiated";
        class11480.M[4] = "dd.MM.yyyy HH:mm";
        class11480.M[5] = "dd.MM.yyyy";
        class11480.M[6] = "HH:mm";
    }

    private static String U() {
        return class11938.P().N() == class11999.RU ? B[2] : M[0];
    }

    public static String y() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(R[3]));
    }

    public static String N(String string, long l) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(string);
        return Instant.ofEpochMilli(l).atZone(ZoneId.systemDefault()).format(dateTimeFormatter);
    }

    public static String N() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(B[1]));
    }

    public static String N(long l) {
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = Instant.ofEpochMilli(l).atZone(zoneId);
        LocalDate localDate = zonedDateTime.toLocalDate();
        LocalDate localDate2 = LocalDate.now(zoneId);
        String string = zonedDateTime.format(DateTimeFormatter.ofPattern(R[0]));
        if (localDate.equals(localDate2)) {
            return class11480.U() + " " + string;
        }
        if (localDate.equals(localDate2.minusDays(1L))) {
            return class11480.R() + " " + string;
        }
        if (localDate.getYear() != localDate2.getYear()) {
            return zonedDateTime.format(DateTimeFormatter.ofPattern(R[1]));
        }
        return zonedDateTime.format(DateTimeFormatter.ofPattern(R[2]));
    }

    private static String R() {
        return class11938.P().N() == class11999.RU ? M[1] : M[2];
    }
}

