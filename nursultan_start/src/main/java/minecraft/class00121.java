/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01686
 *  minecraft.class04341
 *  minecraft.class04364
 *  minecraft.class04995
 *  org.joml.Vector3f
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01686;
import minecraft.class04341;
import minecraft.class04364;
import minecraft.class04995;
import org.joml.Vector3f;

final class class00121
extends Record {
    private final class01686 part;
    private final class04364 target;
    private final class04341[] keyframes;

    public class04341[] L() {
        return this.keyframes;
    }

    class00121(class01686 class016862, class04364 class043642, class04341[] class04341Array) {
        this.part = class016862;
        this.target = class043642;
        this.keyframes = class04341Array;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00121.class, "part;target;keyframes", "part", "target", "keyframes"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00121.class, "part;target;keyframes", "part", "target", "keyframes"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00121.class, "part;target;keyframes", "part", "target", "keyframes"}, this);
    }

    public class04364 y() {
        return this.target;
    }

    public class01686 N() {
        return this.part;
    }

    public void N(float f, float f2, Vector3f vector3f) {
        int n2 = Math.max(0, class04995.N((int)0, (int)this.keyframes.length, n -> f <= this.keyframes[n].N()) - 1);
        int n3 = Math.min(this.keyframes.length - 1, n2 + 1);
        class04341 class043412 = this.keyframes[n2];
        class04341 class043413 = this.keyframes[n3];
        float f3 = f - class043412.N();
        float f4 = n3 != n2 ? class04995.N((float)(f3 / (class043413.N() - class043412.N())), (float)0.0f, (float)1.0f) : 0.0f;
        class043413.u().apply(vector3f, f4, this.keyframes, n2, n3, f2);
        this.target.apply(this.part, vector3f);
    }
}

