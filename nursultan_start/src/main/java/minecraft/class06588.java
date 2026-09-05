/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03704
 *  minecraft.class03711
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03704;
import minecraft.class03711;
import minecraft.class06516;

public final class class06588<T extends class06516>
extends Record {
    private final T trigger;
    private final class03711 advancement;
    private final String criterion;

    public String L() {
        return this.criterion;
    }

    public class06588(T t, class03711 class037112, String string) {
        this.trigger = t;
        this.advancement = class037112;
        this.criterion = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06588.class, "trigger;advancement;criterion", "trigger", "advancement", "criterion"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06588.class, "trigger;advancement;criterion", "trigger", "advancement", "criterion"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06588.class, "trigger;advancement;criterion", "trigger", "advancement", "criterion"}, this);
    }

    public class03711 y() {
        return this.advancement;
    }

    public T N() {
        return this.trigger;
    }

    public void N(class03704 class037042) {
        class037042.N(this.advancement, this.criterion);
    }
}

