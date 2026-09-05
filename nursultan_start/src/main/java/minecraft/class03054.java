/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class06541
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class03050;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class06541;
import org.jspecify.annotations.Nullable;

public final class class03054
extends Record {
    private final int indicatorColor;
    private final @Nullable class03050 icon;
    private final @Nullable class00392 text;
    private final @Nullable String logTag;
    private static final class00392 i = class00392.L((String)"chat.tag.system");
    private static final class00392 R = class00392.L((String)"chat.tag.system_single_player");
    private static final class00392 M = class00392.L((String)"chat.tag.not_secure");
    private static final class00392 B = class00392.L((String)"chat.tag.modified");
    private static final class00392 Z = class00392.L((String)"chat.tag.error");
    private static final int z = 0xD0D0D0;
    private static final int U = 0x606060;
    private static final class03054 E = new class03054(0xD0D0D0, null, i, "System");
    private static final class03054 W = new class03054(0xD0D0D0, null, R, "System");
    private static final class03054 m = new class03054(0xD0D0D0, null, M, "Not Secure");
    private static final class03054 P = new class03054(0xFF5555, null, Z, "Chat Error");

    public static class03054 L() {
        return m;
    }

    public @Nullable class00392 M() {
        return this.text;
    }

    public class03054(int n, @Nullable class03050 class030502, @Nullable class00392 class003922, @Nullable String string) {
        this.indicatorColor = n;
        this.icon = class030502;
        this.text = class003922;
        this.logTag = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03054.class, "indicatorColor;icon;text;logTag", "indicatorColor", "icon", "text", "logTag"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03054.class, "indicatorColor;icon;text;logTag", "indicatorColor", "icon", "text", "logTag"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03054.class, "indicatorColor;icon;text;logTag", "indicatorColor", "icon", "text", "logTag"}, this);
    }

    public @Nullable String B() {
        return this.logTag;
    }

    public int i() {
        return this.indicatorColor;
    }

    public static class03054 u() {
        return P;
    }

    public static class03054 y() {
        return W;
    }

    public static class03054 N(String string) {
        class05216 class052162 = class00392.y((String)string).N(class06541.field_1080);
        class05216 class052163 = class00392.i().y(B).y(class05220.n).y((class00392)class052162);
        return new class03054(0x606060, class03050.field_39763, (class00392)class052163, "Modified");
    }

    public static class03054 N() {
        return E;
    }

    public @Nullable class03050 R() {
        return this.icon;
    }
}

