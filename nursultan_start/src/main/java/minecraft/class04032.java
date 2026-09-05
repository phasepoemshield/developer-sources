/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.apache.commons.lang3.ObjectUtils
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Supplier;
import minecraft.class04038;
import org.apache.commons.lang3.ObjectUtils;

public final class class04032
extends Record {
    private final class04038 confidence;
    private final String description;

    public class04038 L() {
        return this.confidence;
    }

    public class04032(class04038 class040382, String string) {
        this.confidence = class040382;
        this.description = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04032.class, "confidence;description", "confidence", "description"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04032.class, "confidence;description", "confidence", "description"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04032.class, "confidence;description", "confidence", "description"}, this);
    }

    public String u() {
        return this.description;
    }

    public String y() {
        return this.confidence.field_35177 + " " + this.description;
    }

    public class04032 N(class04032 class040322) {
        return new class04032((class04038)((Object)ObjectUtils.max((Comparable[])new class04038[]{this.confidence, class040322.confidence})), this.description + "; " + class040322.description);
    }

    public static class04032 N(String string, Supplier<String> supplier, String string2, Class<?> clazz) {
        String string3 = supplier.get();
        if (!string.equals(string3)) {
            return new class04032(class04038.field_35176, string2 + " brand changed to '" + string3 + "'");
        }
        if (clazz.getSigners() == null) {
            return new class04032(class04038.field_35175, string2 + " jar signature invalidated");
        }
        return new class04032(class04038.field_35174, string2 + " jar signature and brand is untouched");
    }

    public boolean N() {
        return this.confidence.field_35178;
    }
}

