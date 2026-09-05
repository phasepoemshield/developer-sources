/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01656
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02867
 *  minecraft.class02897
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashSet;
import java.util.Set;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01656;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02867;
import minecraft.class02897;

public final class class02037
extends Record
implements class00381<class01656> {
    private final Set<class01894> features;
    public static final class02362<class00667, class02037> N = class00381.N(class02037::N, class02037::new);

    private class02037(class00667 class006672) {
        this((Set)class006672.N_15(HashSet::new, class00667::T));
    }

    public class02037(Set<class01894> set) {
        this.features = set;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02037.class, "features", "features"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02037.class, "features", "features"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02037.class, "features", "features"}, this);
    }

    public Set<class01894> N() {
        return this.features;
    }

    public void method_65081(class01656 class016562) {
        class016562.N(this);
    }

    private void N(class00667 class006672) {
        class006672.N_12(this.features, class00667::N);
    }

    public class02897<class02037> method_65080() {
        return class02867.R;
    }
}

