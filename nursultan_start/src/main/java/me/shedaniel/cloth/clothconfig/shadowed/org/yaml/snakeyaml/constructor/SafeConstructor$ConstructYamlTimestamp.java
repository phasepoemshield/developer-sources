/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.AbstractConstruct
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.AbstractConstruct;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.SafeConstructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.ScalarNode;

public class SafeConstructor$ConstructYamlTimestamp
extends AbstractConstruct {
    private Calendar calendar;

    public Calendar getCalendar() {
        return this.calendar;
    }

    public Object construct(Node node) {
        TimeZone timeZone;
        ScalarNode scalarNode = (ScalarNode)node;
        String string = scalarNode.getValue();
        Matcher matcher = SafeConstructor.access$200().matcher(string);
        if (matcher.matches()) {
            String string2 = matcher.group(1);
            String string3 = matcher.group(2);
            String string4 = matcher.group(3);
            this.calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            this.calendar.clear();
            this.calendar.set(1, Integer.parseInt(string2));
            this.calendar.set(2, Integer.parseInt(string3) - 1);
            this.calendar.set(5, Integer.parseInt(string4));
            return this.calendar.getTime();
        }
        matcher = SafeConstructor.access$300().matcher(string);
        if (!matcher.matches()) {
            throw new YAMLException("Unexpected timestamp: " + string);
        }
        String string5 = matcher.group(1);
        String string6 = matcher.group(2);
        String string7 = matcher.group(3);
        String string8 = matcher.group(4);
        String string9 = matcher.group(5);
        String string10 = matcher.group(6);
        String string11 = matcher.group(7);
        if (string11 != null) {
            string10 = string10 + "." + string11;
        }
        double d = Double.parseDouble(string10);
        int n = (int)Math.round(Math.floor(d));
        int n2 = (int)Math.round((d - (double)n) * 1000.0);
        String string12 = matcher.group(8);
        String string13 = matcher.group(9);
        if (string12 != null) {
            String string14 = string13 != null ? ":" + string13 : "00";
            timeZone = TimeZone.getTimeZone("GMT" + string12 + string14);
        } else {
            timeZone = TimeZone.getTimeZone("UTC");
        }
        this.calendar = Calendar.getInstance(timeZone);
        this.calendar.set(1, Integer.parseInt(string5));
        this.calendar.set(2, Integer.parseInt(string6) - 1);
        this.calendar.set(5, Integer.parseInt(string7));
        this.calendar.set(11, Integer.parseInt(string8));
        this.calendar.set(12, Integer.parseInt(string9));
        this.calendar.set(13, n);
        this.calendar.set(14, n2);
        return this.calendar.getTime();
    }
}

