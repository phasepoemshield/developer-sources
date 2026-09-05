/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04271
 *  minecraft.class07845
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04271;
import minecraft.class07845;

public final class class07816
extends Record
implements class00381<class07845> {
    private final String name;
    private final UUID profileId;
    public static final class02362<class00667, class07816> N = class00381.N(class07816::N, class07816::new);

    private class07816(class00667 class006672) {
        this(class006672.u(16), class006672.m());
    }

    public class07816(String string, UUID uUID) {
        this.name = string;
        this.profileId = uUID;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07816.class, "name;profileId", "name", "profileId"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07816.class, "name;profileId", "name", "profileId"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07816.class, "name;profileId", "name", "profileId"}, this);
    }

    public UUID y() {
        return this.profileId;
    }

    private void N(class00667 class006672) {
        class006672.N(this.name, 16);
        class006672.N(this.profileId);
    }

    public String N() {
        return this.name;
    }

    public void method_65081(class07845 class078452) {
        class078452.N(this);
    }

    public class02897<class07816> method_65080() {
        return class04271.M;
    }
}

