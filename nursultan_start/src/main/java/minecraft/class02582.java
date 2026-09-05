/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02769
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07049
 *  minecraft.class07280
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02769;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07049;
import minecraft.class07280;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public final class class02582
extends Record
implements class00381<class07280> {
    private final int entityId;
    private final List<class02769> lerpSteps;
    public static final class02362<class00667, class02582> N = class02362.N((class02362)class02389.B, class02582::N, (class02362)class02769.R.N_33(class02389.N()), class02582::y, class02582::new);

    public class02582(int n, List<class02769> list) {
        this.entityId = n;
        this.lerpSteps = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02582.class, "entityId;lerpSteps", "entityId", "lerpSteps"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02582.class, "entityId;lerpSteps", "entityId", "lerpSteps"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02582.class, "entityId;lerpSteps", "entityId", "lerpSteps"}, this);
    }

    public List<class02769> y() {
        return this.lerpSteps;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public int N() {
        return this.entityId;
    }

    public @Nullable class07049 N(class07299 class072992) {
        return class072992.method_8469(this.entityId);
    }

    public class02897<class02582> method_65080() {
        return class04248.h;
    }
}

