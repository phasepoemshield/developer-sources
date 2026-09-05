/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01487
 *  minecraft.class01662
 *  minecraft.class02362
 *  minecraft.class02874
 *  minecraft.class02885
 *  minecraft.class02895
 *  minecraft.class02897
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.UUID;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01487;
import minecraft.class01662;
import minecraft.class02362;
import minecraft.class02874;
import minecraft.class02885;
import minecraft.class02895;
import minecraft.class02897;

public final class class03807
extends Record
implements class00381<class01662> {
    private final Optional<UUID> id;
    public static final class02362<class00667, class03807> N = class00381.N(class03807::N, class03807::new);

    private class03807(class00667 class006672) {
        this(class006672.y((class02895)class01487.M));
    }

    public class03807(Optional<UUID> optional) {
        this.id = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03807.class, "id", "id"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03807.class, "id", "id"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03807.class, "id", "id"}, this);
    }

    public Optional<UUID> N() {
        return this.id;
    }

    public void method_65081(class01662 class016622) {
        class016622.N(this);
    }

    private void N(class00667 class006672) {
        class006672.N_13(this.id, (class02874)class01487.M);
    }

    public class02897<class03807> method_65080() {
        return class02885.M;
    }
}

