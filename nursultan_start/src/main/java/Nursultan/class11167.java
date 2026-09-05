/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09337
 */
package Nursultan;

import Nursultan.class09337;
import Nursultan.class11169;
import Nursultan.class11193;
import Nursultan.class11208;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class11167
implements class09337 {
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public boolean y_init;

    class11167(List<class11208> list) {
        this.i();
        this.y_0 = new ArrayList();
        this.y_1 = new HashMap();
        this.y_2 = new HashSet();
        this.y_3 = new HashSet();
        for (class11208 class112082 : list) {
            if (class112082.u() == null) {
                ((List)this.y_0).add(class112082);
                continue;
            }
            if (((Map)this.y_1).put(class112082.u(), class112082) == null) continue;
            throw new IllegalArgumentException("Shader template arg was configured twice: " + class112082.u());
        }
    }

    private void i() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_4 = 0;
        }
    }

    public void y() {
        this.y_4 = 0;
        ((Set)this.y_2).clear();
        ((Set)this.y_3).clear();
    }

    private class11208 y(String string) {
        class11208 class112082 = (class11208)((Object)((Map)this.y_1).get(string));
        if (class112082 != null) {
            ((Set)this.y_2).add(string);
            return class112082;
        }
        if ((Integer)this.y_4 < ((List)this.y_0).size()) {
            int n = (Integer)this.y_4;
            this.y_4 = n + 1;
            return (class11208)((Object)((List)this.y_0).get(n));
        }
        throw new IllegalArgumentException("Missing shader template value for " + string);
    }

    public boolean N() {
        return true;
    }

    public String N(int n, String string, String string2) {
        Matcher matcher = ((Pattern)class11193.N_0).matcher(string2);
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()) {
            String string3 = matcher.group(1);
            String string4 = matcher.group(2);
            class11169 class111692 = class11169.N(matcher.group(3));
            int n2 = class11167.N(class111692, string4, matcher.group(4));
            String string5 = matcher.group(5);
            class11208 class112082 = this.y(string4);
            String string6 = this.N(string, string4, class111692, n2, class112082);
            matcher.appendReplacement(stringBuilder, Matcher.quoteReplacement(string3 + string6 + string5));
            ((Set)this.y_3).add(string4);
        }
        matcher.appendTail(stringBuilder);
        if (n == 35632) {
            this.N(string);
        }
        return stringBuilder.toString();
    }

    private String N(String string, String string2, class11169 class111692, int n, class11208 class112082) {
        if (class112082.N() != null && class112082.N() != class111692) {
            throw new IllegalArgumentException("Shader template type mismatch for " + string2 + " in " + string + ". Expected " + String.valueOf((Object)class112082.N()) + ", actual " + String.valueOf((Object)class111692));
        }
        if (class112082.y()) {
            return class111692.N(string2, n);
        }
        try {
            return class111692.N(string2, class112082.L(), n);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalArgumentException("Invalid shader template value for " + string2 + " (" + String.valueOf((Object)class111692) + ") in " + string + ": " + illegalArgumentException.getMessage(), illegalArgumentException);
        }
    }

    private static int N(class11169 class111692, String string, String string2) {
        if (!class111692.N()) {
            if (string2 != null) {
                throw new IllegalArgumentException("Only array shader template args can have a size: " + string);
            }
            return 0;
        }
        if (string2 == null) {
            throw new IllegalArgumentException("Array shader template arg needs a marker size: " + string);
        }
        return Integer.parseInt(string2);
    }

    private void N(String string) {
        if ((Integer)this.y_4 < ((List)this.y_0).size()) {
            throw new IllegalArgumentException("Too many ordered shader template actions for " + string + ". First unused action index: " + (Integer)this.y_4);
        }
        for (String string2 : ((Map)this.y_1).keySet()) {
            if (!((Set)this.y_3).contains(string2)) {
                throw new IllegalArgumentException("Shader template arg was not found: " + string2);
            }
            if (((Set)this.y_2).contains(string2)) continue;
            throw new IllegalArgumentException("Shader template arg was not used: " + string2);
        }
    }
}

