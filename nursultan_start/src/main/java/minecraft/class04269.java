/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02872
 *  minecraft.class02874
 *  minecraft.class02895
 *  minecraft.class02897
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02872;
import minecraft.class02874;
import minecraft.class02895;
import minecraft.class02897;
import minecraft.class04245;
import minecraft.class04261;
import org.jspecify.annotations.Nullable;

public final class class04269
extends Record
implements class00381<class04245> {
    private final class01894 key;
    private final byte @Nullable [] payload;
    public static final class02362<class00667, class04269> N = class00381.N(class04269::N, class04269::new);

    private class04269(class00667 class006672) {
        this(class006672.T(), (byte[])class006672.L((class02895)class02872.y));
    }

    public class04269(class01894 class018942, byte @Nullable [] byArray) {
        this.key = class018942;
        this.payload = byArray;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04269.class, "key;payload", "key", "payload"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04269.class, "key;payload", "key", "payload"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04269.class, "key;payload", "key", "payload"}, this);
    }

    public byte @Nullable [] y() {
        return this.payload;
    }

    private void N(class00667 class006672) {
        class006672.N(this.key);
        class006672.N((Object)this.payload, (class02874)class02872.y);
    }

    public class01894 N() {
        return this.key;
    }

    public void method_65081(class04245 class042452) {
        class042452.method_55851(this);
    }

    public class02897<class04269> method_65080() {
        return class04261.y;
    }
}

