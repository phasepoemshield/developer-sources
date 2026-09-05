/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04247
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import minecraft.class04247;
import minecraft.class07238;
import minecraft.class07239;
import minecraft.class07262;

final class class07272
extends Record
implements class07238 {
    private final float progress;

    public class07272(class04247 class042472) {
        this(class042472.readFloat());
    }

    class07272(float f) {
        this.progress = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07272.class, "progress", "progress"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07272.class, "progress", "progress"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07272.class, "progress", "progress"}, this);
    }

    public float y() {
        return this.progress;
    }

    @Override
    public void N(class04247 class042472) {
        class042472.writeFloat(this.progress);
    }

    @Override
    public class07239 N() {
        return class07239.field_29109;
    }

    @Override
    public void N(UUID uUID, class07262 class072622) {
        class072622.N(uUID, this.progress);
    }
}

