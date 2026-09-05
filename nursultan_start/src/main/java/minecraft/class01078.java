/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class01614
 *  minecraft.class03767
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00392;
import minecraft.class01614;
import minecraft.class03767;

public final class class01078
extends Record {
    final class00392 description;
    private final class01614 compatibility;
    private final class03767 requestedFeatures;
    private final List<String> overlays;

    public class03767 L() {
        return this.requestedFeatures;
    }

    public class01078(class00392 class003922, class01614 class016142, class03767 class037672, List<String> list) {
        this.description = class003922;
        this.compatibility = class016142;
        this.requestedFeatures = class037672;
        this.overlays = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01078.class, "description;compatibility;requestedFeatures;overlays", "description", "compatibility", "requestedFeatures", "overlays"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01078.class, "description;compatibility;requestedFeatures;overlays", "description", "compatibility", "requestedFeatures", "overlays"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01078.class, "description;compatibility;requestedFeatures;overlays", "description", "compatibility", "requestedFeatures", "overlays"}, this);
    }

    public List<String> u() {
        return this.overlays;
    }

    public class01614 y() {
        return this.compatibility;
    }

    public class00392 N() {
        return this.description;
    }
}

