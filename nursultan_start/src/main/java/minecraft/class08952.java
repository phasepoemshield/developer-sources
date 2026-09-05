/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class00500;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class08953;
import minecraft.class08958;
import minecraft.class08960;
import minecraft.class08972;
import minecraft.class08976;

public final class class08952
extends Record {
    private final class08960 block;
    private final class07284 level;
    private final class07211 facing;
    private final class07209 center;
    private final Map<class07209, class08976> cache;

    public class08960 L() {
        return this.block;
    }

    public Map<class07209, class08976> M() {
        return this.cache;
    }

    public class08952(class08960 class089602, class07284 class072842, class07211 class072112, class07209 class072092, Map<class07209, class08976> map) {
        this.block = class089602;
        this.level = class072842;
        this.facing = class072112;
        this.center = class072092;
        this.cache = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08952.class, "block;level;facing;center;cache", "block", "level", "facing", "center", "cache"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08952.class, "block;level;facing;center;cache", "block", "level", "facing", "center", "cache"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08952.class, "block;level;facing;center;cache", "block", "level", "facing", "center", "cache"}, this);
    }

    public class07211 i() {
        return this.facing;
    }

    public class07284 u() {
        return this.level;
    }

    public class08976 y() {
        return this.y(1);
    }

    public class08976 y(int n) {
        return this.N(this.facing.M(), n);
    }

    private boolean N(class00500 class005002) {
        return this.block.B(class005002) && this.block.M(class005002) == this.facing;
    }

    private class08976 N(class07211 class072112, Integer n) {
        return this.cache.computeIfAbsent(this.center.method_10079(class072112, n.intValue()), this::N);
    }

    public class08976 N() {
        return this.N(1);
    }

    private class08976 N(class07209 class072092) {
        class00500 class005002 = this.level.method_8320(class072092);
        class08972 class089722 = this.N(class005002) ? this.block.R(class005002) : null;
        return class089722 == null ? new class08958(class072092) : new class08953(this.level, this.block, class072092, class089722);
    }

    public class08976 N(int n) {
        return this.N(this.facing.R(), n);
    }

    public class07209 R() {
        return this.center;
    }
}

