/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class05216
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class05216;

public final class class05086
extends Record {
    private final class01894 id;
    private static final List<class05086> Z = new ArrayList<class05086>();
    public static final class05086 N = class05086.N("player");
    public static final class05086 y = class05086.N("mobs");
    public static final class05086 L = class05086.N("spawning");
    public static final class05086 u = class05086.N("drops");
    public static final class05086 i = class05086.N("updates");
    public static final class05086 R = class05086.N("chat");
    public static final class05086 M = class05086.N("misc");

    public class01894 L() {
        return this.id;
    }

    public class05086(class01894 class018942) {
        this.id = class018942;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05086.class, "id", "id"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05086.class, "id", "id"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05086.class, "id", "id"}, this);
    }

    public class05216 y() {
        return class00392.L((String)this.id.B("gamerule.category"));
    }

    public static class05086 N(class01894 class018942) {
        class05086 class050862 = new class05086(class018942);
        if (Z.contains((Object)class050862)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Category '%s' is already registered.", class018942));
        }
        Z.add(class050862);
        return class050862;
    }

    public class01894 N() {
        return this.id;
    }

    private static class05086 N(String string) {
        return class05086.N(class01894.y((String)string));
    }
}

