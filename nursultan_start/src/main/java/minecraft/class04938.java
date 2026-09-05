/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public interface class04938 {
    public static final DecimalFormat N = new DecimalFormat("########0.00", DecimalFormatSymbols.getInstance(Locale.ROOT));
    public static final class04938 y = NumberFormat.getIntegerInstance(Locale.US)::format;
    public static final class04938 L = n -> N.format((double)n * 0.1);
    public static final class04938 u = n -> {
        double d = (double)n / 100.0;
        double d2 = d / 1000.0;
        if (d2 > 0.5) {
            return N.format(d2) + " km";
        }
        if (d > 0.5) {
            return N.format(d) + " m";
        }
        return n + " cm";
    };
    public static final class04938 i = n -> {
        double d = (double)n / 20.0;
        double d2 = d / 60.0;
        double d3 = d2 / 60.0;
        double d4 = d3 / 24.0;
        double d5 = d4 / 365.0;
        if (d5 > 0.5) {
            return N.format(d5) + " y";
        }
        if (d4 > 0.5) {
            return N.format(d4) + " d";
        }
        if (d3 > 0.5) {
            return N.format(d3) + " h";
        }
        if (d2 > 0.5) {
            return N.format(d2) + " min";
        }
        return d + " s";
    };

    public String format(int var1);
}

