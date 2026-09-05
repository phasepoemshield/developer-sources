/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class04206
 */
package minecraft;

import minecraft.class00751;
import minecraft.class04206;

public class class05359 {
    public static final class05359 N = class05359.N("core");
    public static final class05359 y = class05359.N("idle");
    public static final class05359 L = class05359.N("work");
    public static final class05359 u = class05359.N("play");
    public static final class05359 i = class05359.N("rest");
    public static final class05359 R = class05359.N("meet");
    public static final class05359 M = class05359.N("panic");
    public static final class05359 B = class05359.N("raid");
    public static final class05359 Z = class05359.N("pre_raid");
    public static final class05359 z = class05359.N("hide");
    public static final class05359 U = class05359.N("fight");
    public static final class05359 E = class05359.N("celebrate");
    public static final class05359 W = class05359.N("admire_item");
    public static final class05359 m = class05359.N("avoid");
    public static final class05359 P = class05359.N("ride");
    public static final class05359 s = class05359.N("play_dead");
    public static final class05359 T = class05359.N("long_jump");
    public static final class05359 b = class05359.N("ram");
    public static final class05359 j = class05359.N("tongue");
    public static final class05359 v = class05359.N("swim");
    public static final class05359 n = class05359.N("lay_spawn");
    public static final class05359 t = class05359.N("sniff");
    public static final class05359 G = class05359.N("investigate");
    public static final class05359 l = class05359.N("roar");
    public static final class05359 d = class05359.N("emerge");
    public static final class05359 w = class05359.N("dig");
    private final String k;
    private final int Y;

    public class05359(String string) {
        this.k = string;
        this.Y = string.hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        class05359 class053592 = (class05359)object;
        return this.k.equals(class053592.k);
    }

    public String toString() {
        return this.N();
    }

    public int hashCode() {
        return this.Y;
    }

    public String N() {
        return this.k;
    }

    private static class05359 N(String string) {
        return (class05359)class00751.N((class00751)class04206.Q, (String)string, (Object)new class05359(string));
    }
}

