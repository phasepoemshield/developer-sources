/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09785
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09785;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import java.util.regex.Pattern;

public class class11858
extends Record {
    public Pattern regex;
    public Consumer<String> onChange;
    public class09785<Boolean> focused;
    public String value;
    public String placeholderKey;

    public class09785<Boolean> L() {
        return this.focused;
    }

    public class11858(String string, String string2, Pattern pattern, Consumer<String> consumer, class09785<Boolean> class097852) {
        this.placeholderKey = string;
        this.value = string2;
        this.regex = pattern;
        this.onChange = consumer;
        this.focused = class097852;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11858.class, "placeholderKey;value;regex;onChange;focused", "placeholderKey", "value", "regex", "onChange", "focused"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11858.class, "placeholderKey;value;regex;onChange;focused", "placeholderKey", "value", "regex", "onChange", "focused"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11858.class, "placeholderKey;value;regex;onChange;focused", "placeholderKey", "value", "regex", "onChange", "focused"}, this);
    }

    public String i() {
        return this.value;
    }

    public String u() {
        return this.placeholderKey;
    }

    public Pattern y() {
        return this.regex;
    }

    public Consumer<String> N() {
        return this.onChange;
    }
}

