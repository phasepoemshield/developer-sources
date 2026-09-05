/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09870;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Locale;

public final class class09838
extends Record {
    private final String family;
    private final float weight;
    private final class09870 slant;
    public static final class09838 N = new class09838(null, 0.0f, null);

    public class09870 L() {
        return this.slant;
    }

    public class09838(String string, float f, class09870 class098702) {
        string = class09838.N(string);
        f = class09838.N(f);
        class098702 = class098702 == null ? class09870.NORMAL : class098702;
        this.family = string;
        this.weight = f;
        this.slant = class098702;
    }

    public class09838(String string, float f) {
        this(string, f, class09870.NORMAL);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09838.class, "family;weight;slant", "family", "weight", "slant"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09838.class, "family;weight;slant", "family", "weight", "slant"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09838.class, "family;weight;slant", "family", "weight", "slant"}, this);
    }

    public float y() {
        return this.weight;
    }

    public String N() {
        return this.family;
    }

    private static String N(String string) {
        if (string == null || string.isBlank()) {
            return "default";
        }
        return string.trim().toLowerCase(Locale.ROOT);
    }

    private static float N(float f) {
        if (f < 1.0f) {
            return 400.0f;
        }
        if (f < 100.0f) {
            return 100.0f;
        }
        return Math.min(f, 900.0f);
    }
}

