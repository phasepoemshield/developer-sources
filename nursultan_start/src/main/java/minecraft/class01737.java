/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07684
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class07684;

public final class class01737
extends Record {
    private final List<String> segments;
    private final List<String> variables;

    public class01737(List<String> list, List<String> list2) {
        this.segments = list;
        this.variables = list2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01737.class, "segments;variables", "segments", "variables"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01737.class, "segments;variables", "segments", "variables"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01737.class, "segments;variables", "segments", "variables"}, this);
    }

    public List<String> y() {
        return this.variables;
    }

    public static boolean y(String string) {
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (Character.isLetterOrDigit(c) || c == '_') continue;
            return false;
        }
        return true;
    }

    public String N(List<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.variables.size(); ++i) {
            stringBuilder.append(this.segments.get(i)).append(list.get(i));
            class07684.N((CharSequence)stringBuilder);
        }
        if (this.segments.size() > this.variables.size()) {
            stringBuilder.append((String)this.segments.getLast());
        }
        class07684.N((CharSequence)stringBuilder);
        return stringBuilder.toString();
    }

    public List<String> N() {
        return this.segments;
    }

    public static class01737 N(String string) {
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableList.Builder builder2 = ImmutableList.builder();
        int n = string.length();
        int n2 = 0;
        int n3 = string.indexOf(36);
        while (n3 != -1) {
            if (n3 == n - 1 || string.charAt(n3 + 1) != '(') {
                n3 = string.indexOf(36, n3 + 1);
                continue;
            }
            builder.add((Object)string.substring(n2, n3));
            int n4 = string.indexOf(41, n3 + 1);
            if (n4 == -1) {
                throw new IllegalArgumentException("Unterminated macro variable");
            }
            String string2 = string.substring(n3 + 2, n4);
            if (!class01737.y(string2)) {
                throw new IllegalArgumentException("Invalid macro variable name '" + string2 + "'");
            }
            builder2.add((Object)string2);
            n2 = n4 + 1;
            n3 = string.indexOf(36, n2);
        }
        if (n2 == 0) {
            throw new IllegalArgumentException("No variables in macro");
        }
        if (n2 != n) {
            builder.add((Object)string.substring(n2));
        }
        return new class01737((List<String>)builder.build(), (List<String>)builder2.build());
    }
}

