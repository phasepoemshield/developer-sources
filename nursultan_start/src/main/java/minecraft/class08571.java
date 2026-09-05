/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class05913
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class05913;

public final class class08571
extends Record {
    private final class01894 sheet;
    private final String prefix;

    public class08571(class01894 class018942, String string) {
        this.sheet = class018942;
        this.prefix = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08571.class, "sheet;prefix", "sheet", "prefix"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08571.class, "sheet;prefix", "sheet", "prefix"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08571.class, "sheet;prefix", "sheet", "prefix"}, this);
    }

    public String y() {
        return this.prefix;
    }

    public class05913 N(String string) {
        return this.N(class01894.y((String)string));
    }

    public class01894 N() {
        return this.sheet;
    }

    public class05913 N(class01894 class018942) {
        return new class05913(this.sheet, class018942.R(this.prefix + "/"));
    }
}

