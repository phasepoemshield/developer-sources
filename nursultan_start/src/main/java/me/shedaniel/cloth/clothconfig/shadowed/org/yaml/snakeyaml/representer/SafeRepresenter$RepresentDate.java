/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$ScalarStyle
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.Represent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter;

public class SafeRepresenter$RepresentDate
implements Represent {
    final /* synthetic */ SafeRepresenter this$0;

    protected SafeRepresenter$RepresentDate(SafeRepresenter safeRepresenter) {
        this.this$0 = safeRepresenter;
    }

    @Override
    public Node representData(Object object) {
        int n;
        Calendar calendar;
        if (object instanceof Calendar) {
            calendar = (Calendar)object;
        } else {
            calendar = Calendar.getInstance(this.this$0.getTimeZone() == null ? TimeZone.getTimeZone("UTC") : this.this$0.timeZone);
            calendar.setTime((Date)object);
        }
        int n2 = calendar.get(1);
        int n3 = calendar.get(2) + 1;
        int n4 = calendar.get(5);
        int n5 = calendar.get(11);
        int n6 = calendar.get(12);
        int n7 = calendar.get(13);
        int n8 = calendar.get(14);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(n2));
        while (stringBuilder.length() < 4) {
            stringBuilder.insert(0, "0");
        }
        stringBuilder.append("-");
        if (n3 < 10) {
            stringBuilder.append("0");
        }
        stringBuilder.append(String.valueOf(n3));
        stringBuilder.append("-");
        if (n4 < 10) {
            stringBuilder.append("0");
        }
        stringBuilder.append(String.valueOf(n4));
        stringBuilder.append("T");
        if (n5 < 10) {
            stringBuilder.append("0");
        }
        stringBuilder.append(String.valueOf(n5));
        stringBuilder.append(":");
        if (n6 < 10) {
            stringBuilder.append("0");
        }
        stringBuilder.append(String.valueOf(n6));
        stringBuilder.append(":");
        if (n7 < 10) {
            stringBuilder.append("0");
        }
        stringBuilder.append(String.valueOf(n7));
        if (n8 > 0) {
            if (n8 < 10) {
                stringBuilder.append(".00");
            } else if (n8 < 100) {
                stringBuilder.append(".0");
            } else {
                stringBuilder.append(".");
            }
            stringBuilder.append(String.valueOf(n8));
        }
        if ((n = calendar.getTimeZone().getOffset(calendar.getTime().getTime())) == 0) {
            stringBuilder.append('Z');
        } else {
            if (n < 0) {
                stringBuilder.append('-');
                n *= -1;
            } else {
                stringBuilder.append('+');
            }
            int n9 = n / 60000;
            int n10 = n9 / 60;
            int n11 = n9 % 60;
            if (n10 < 10) {
                stringBuilder.append('0');
            }
            stringBuilder.append(n10);
            stringBuilder.append(':');
            if (n11 < 10) {
                stringBuilder.append('0');
            }
            stringBuilder.append(n11);
        }
        return this.this$0.representScalar(this.this$0.getTag(object.getClass(), Tag.TIMESTAMP), stringBuilder.toString(), DumperOptions.ScalarStyle.PLAIN);
    }
}

