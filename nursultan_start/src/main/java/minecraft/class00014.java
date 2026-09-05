/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00028
 *  minecraft.class00037
 *  minecraft.class00039
 *  minecraft.class00381
 *  minecraft.class00753
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07280
 *  minecraft.class07321
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import minecraft.class00005;
import minecraft.class00028;
import minecraft.class00037;
import minecraft.class00039;
import minecraft.class00381;
import minecraft.class00753;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07280;
import minecraft.class07321;

public final class class00014
extends Record
implements class00381<class07280> {
    private final class00039 operation;
    private final class00037 waypoint;
    public static final class02362<class04247, class00014> N = class02362.N((class02362)class00039.field_59617, class00014::N, (class02362)class00037.y, class00014::y, class00014::new);

    public class00014(class00039 class000392, class00037 class000372) {
        this.operation = class000392;
        this.waypoint = class000372;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00014.class, "operation;waypoint", "operation", "waypoint"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00014.class, "operation;waypoint", "operation", "waypoint"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00014.class, "operation;waypoint", "operation", "waypoint"}, this);
    }

    public static class00014 y(UUID uUID, class00028 class000282, class00753 class007532) {
        return new class00014(class00039.field_59615, class00037.N((UUID)uUID, (class00028)class000282, (class00753)class007532));
    }

    public static class00014 y(UUID uUID, class00028 class000282, float f) {
        return new class00014(class00039.field_59615, class00037.N((UUID)uUID, (class00028)class000282, (float)f));
    }

    public class00037 y() {
        return this.waypoint;
    }

    public static class00014 y(UUID uUID, class00028 class000282, class07321 class073212) {
        return new class00014(class00039.field_59615, class00037.N((UUID)uUID, (class00028)class000282, (class07321)class073212));
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class00039 N() {
        return this.operation;
    }

    public static class00014 N(UUID uUID, class00028 class000282, class00753 class007532) {
        return new class00014(class00039.field_59613, class00037.N((UUID)uUID, (class00028)class000282, (class00753)class007532));
    }

    public static class00014 N(UUID uUID, class00028 class000282, class07321 class073212) {
        return new class00014(class00039.field_59613, class00037.N((UUID)uUID, (class00028)class000282, (class07321)class073212));
    }

    public static class00014 N(UUID uUID, class00028 class000282, float f) {
        return new class00014(class00039.field_59613, class00037.N((UUID)uUID, (class00028)class000282, (float)f));
    }

    public void N(class00005 class000052) {
        this.operation.field_59618.accept(class000052, this.waypoint);
    }

    public static class00014 N(UUID uUID) {
        return new class00014(class00039.field_59614, class00037.N((UUID)uUID));
    }

    public class02897<class00014> method_65080() {
        return class04248.ys;
    }
}

