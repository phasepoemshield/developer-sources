/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00094
 *  minecraft.class01686
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import minecraft.class00094;
import minecraft.class01686;
import minecraft.class04373;

public final class class04353
extends Record {
    private final float lengthInSeconds;
    private final boolean looping;
    private final Map<String, List<class04373>> boneAnimations;

    public Map<String, List<class04373>> L() {
        return this.boneAnimations;
    }

    public class04353(float f, boolean bl, Map<String, List<class04373>> map) {
        this.lengthInSeconds = f;
        this.looping = bl;
        this.boneAnimations = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04353.class, "lengthInSeconds;looping;boneAnimations", "lengthInSeconds", "looping", "boneAnimations"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04353.class, "lengthInSeconds;looping;boneAnimations", "lengthInSeconds", "looping", "boneAnimations"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04353.class, "lengthInSeconds;looping;boneAnimations", "lengthInSeconds", "looping", "boneAnimations"}, this);
    }

    public boolean y() {
        return this.looping;
    }

    public float N() {
        return this.lengthInSeconds;
    }

    public class00094 N(class01686 class016862) {
        return class00094.N((class01686)class016862, (class04353)this);
    }
}

