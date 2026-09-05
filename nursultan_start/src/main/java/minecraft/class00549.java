/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class07830
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import minecraft.class00544;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class07830;
import org.jspecify.annotations.Nullable;

public class class00549 {
    public static final int N = 8;
    private static final EnumSet<class07830> s = EnumSet.of(class07830.field_13195, class07830.field_13194);
    public static final EnumSet<class07830> y = EnumSet.of(class07830.field_13200, class07830.field_13202, class07830.field_13197, class07830.field_13203);
    public static final class00549 L = class00549.N("empty", null, s, class00544.field_12808);
    public static final class00549 u = class00549.N("structure_starts", L, s, class00544.field_12808);
    public static final class00549 i = class00549.N("structure_references", u, s, class00544.field_12808);
    public static final class00549 R = class00549.N("biomes", i, s, class00544.field_12808);
    public static final class00549 M = class00549.N("noise", R, s, class00544.field_12808);
    public static final class00549 B = class00549.N("surface", M, s, class00544.field_12808);
    public static final class00549 Z = class00549.N("carvers", B, y, class00544.field_12808);
    public static final class00549 z = class00549.N("features", Z, y, class00544.field_12808);
    public static final class00549 U = class00549.N("initialize_light", z, y, class00544.field_12808);
    public static final class00549 E = class00549.N("light", U, y, class00544.field_12808);
    public static final class00549 W = class00549.N("spawn", E, y, class00544.field_12808);
    public static final class00549 m = class00549.N("full", W, y, class00544.field_12807);
    public static final Codec<class00549> P = class04206.W.T();
    private final int T;
    private final class00549 b;
    private final class00544 j;
    private final EnumSet<class07830> v;

    public class00549 L() {
        return this.b;
    }

    public boolean L(class00549 class005492) {
        return this.y() <= class005492.y();
    }

    protected class00549(@Nullable class00549 class005492, EnumSet<class07830> enumSet, class00544 class005442) {
        this.b = class005492 == null ? this : class005492;
        this.j = class005442;
        this.v = enumSet;
        this.T = class005492 == null ? 0 : class005492.y() + 1;
    }

    public String toString() {
        return this.R();
    }

    public EnumSet<class07830> i() {
        return this.v;
    }

    public boolean u(class00549 class005492) {
        return this.y() < class005492.y();
    }

    public class00544 u() {
        return this.j;
    }

    public boolean y(class00549 class005492) {
        return this.y() > class005492.y();
    }

    public int y() {
        return this.T;
    }

    private static class00549 N(String string, @Nullable class00549 class005492, EnumSet<class07830> enumSet, class00544 class005442) {
        return (class00549)class00751.N((class00751)class04206.W, (String)string, (Object)new class00549(class005492, enumSet, class005442));
    }

    public static class00549 N(class00549 class005492, class00549 class005493) {
        return class005492.y(class005493) ? class005492 : class005493;
    }

    public static List<class00549> N() {
        class00549 class005492;
        ArrayList arrayList = Lists.newArrayList();
        for (class005492 = m; class005492.L() != class005492; class005492 = class005492.L()) {
            arrayList.add(class005492);
        }
        arrayList.add(class005492);
        Collections.reverse(arrayList);
        return arrayList;
    }

    public static class00549 N(String string) {
        return (class00549)class04206.W.N(class01894.L((String)string));
    }

    public boolean N(class00549 class005492) {
        return this.y() >= class005492.y();
    }

    public String R() {
        return class04206.W.y((Object)this).toString();
    }
}

