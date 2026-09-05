/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class06790;
import minecraft.class06798;

final class class06800
extends Record {
    final class06798 modifier;
    final Predicate<class06790> canUse;
    final class00392 description;

    public class00392 L() {
        return this.description;
    }

    class06800(class06798 class067982, Predicate<class06790> predicate, class00392 class003922) {
        this.modifier = class067982;
        this.canUse = predicate;
        this.description = class003922;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06800.class, "modifier;canUse;description", "modifier", "canUse", "description"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06800.class, "modifier;canUse;description", "modifier", "canUse", "description"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06800.class, "modifier;canUse;description", "modifier", "canUse", "description"}, this);
    }

    public Predicate<class06790> y() {
        return this.canUse;
    }

    public class06798 N() {
        return this.modifier;
    }
}

