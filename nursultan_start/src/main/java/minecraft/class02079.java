/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01487
 *  minecraft.class02362
 *  minecraft.class02874
 *  minecraft.class02895
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.UUID;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01487;
import minecraft.class02362;
import minecraft.class02874;
import minecraft.class02895;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07280;

public final class class02079
extends Record
implements class00381<class07280> {
    private final List<UUID> profileIds;
    public static final class02362<class00667, class02079> N = class00381.N(class02079::N, class02079::new);

    private class02079(class00667 class006672) {
        this(class006672.N_16((class02895)class01487.M));
    }

    public class02079(List<UUID> list) {
        this.profileIds = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02079.class, "profileIds", "profileIds"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02079.class, "profileIds", "profileIds"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02079.class, "profileIds", "profileIds"}, this);
    }

    public List<UUID> N() {
        return this.profileIds;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    private void N(class00667 class006672) {
        class006672.N_12(this.profileIds, (class02874)class01487.M);
    }

    public class02897<class02079> method_65080() {
        return class04248.NU;
    }
}

