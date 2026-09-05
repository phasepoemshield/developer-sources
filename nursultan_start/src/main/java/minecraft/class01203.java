/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01019
 *  minecraft.class01228
 *  minecraft.class01894
 *  minecraft.class04853
 *  minecraft.class04858
 *  minecraft.class05281
 *  minecraft.class05946
 *  minecraft.class07001
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Locale;
import java.util.Objects;
import minecraft.class01019;
import minecraft.class01207;
import minecraft.class01228;
import minecraft.class01894;
import minecraft.class04853;
import minecraft.class04858;
import minecraft.class05281;
import minecraft.class05946;
import minecraft.class07001;

public final class class01203
extends Record {
    final class01228 info;
    private final class04853 jointType;
    private final class01894 name;
    private final class05946<class05281> pool;
    private final class01894 target;
    private final int placementPriority;
    private final int selectionPriority;

    public class01894 L() {
        return this.name;
    }

    public int M() {
        return this.selectionPriority;
    }

    public class01203(class01228 class012282, class04853 class048532, class01894 class018942, class05946<class05281> class059462, class01894 class018943, int n, int n2) {
        this.info = class012282;
        this.jointType = class048532;
        this.name = class018942;
        this.pool = class059462;
        this.target = class018943;
        this.placementPriority = n;
        this.selectionPriority = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01203.class, "info;jointType;name;pool;target;placementPriority;selectionPriority", "info", "jointType", "name", "pool", "target", "placementPriority", "selectionPriority"}, this, object);
    }

    public String toString() {
        return String.format(Locale.ROOT, "<JigsawBlockInfo | %s | %s | name: %s | pool: %s | target: %s | placement: %d | selection: %d | %s>", this.info.N(), this.info.y(), this.name, this.pool.N(), this.target, this.placementPriority, this.selectionPriority, this.info.L());
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01203.class, "info;jointType;name;pool;target;placementPriority;selectionPriority", "info", "jointType", "name", "pool", "target", "placementPriority", "selectionPriority"}, this);
    }

    public class01894 i() {
        return this.target;
    }

    public class05946<class05281> u() {
        return this.pool;
    }

    public class04853 y() {
        return this.jointType;
    }

    public class01203 y(class01228 class012282) {
        return new class01203(class012282, this.jointType, this.name, this.pool, this.target, this.placementPriority, this.selectionPriority);
    }

    public static class01203 N(class01228 class012282) {
        class07001 class070012 = Objects.requireNonNull(class012282.L(), () -> String.valueOf(class012282) + " nbt was null");
        return new class01203(class012282, class01207.N(class070012, class012282.y()), class070012.N_15("name", class01894.N).orElse(class04858.y), (class05946<class05281>)class070012.N_15("pool", class04858.N).orElse(class01019.N), class070012.N_15("target", class01894.N).orElse(class04858.y), class070012.y("placement_priority", 0), class070012.y("selection_priority", 0));
    }

    public class01228 N() {
        return this.info;
    }

    public int R() {
        return this.placementPriority;
    }
}

