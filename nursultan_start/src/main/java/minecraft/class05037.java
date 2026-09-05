/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04370
 *  minecraft.class06478
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04370;
import minecraft.class06478;
import org.jspecify.annotations.Nullable;

public final class class05037
extends Record {
    private final class06478 widget;
    final @Nullable class04370<?> optionInstance;

    public class05037(class06478 class064782) {
        this(class064782, null);
    }

    public class05037(class06478 class064782, @Nullable class04370<?> class043702) {
        this.widget = class064782;
        this.optionInstance = class043702;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05037.class, "widget;optionInstance", "widget", "optionInstance"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05037.class, "widget;optionInstance", "widget", "optionInstance"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05037.class, "widget;optionInstance", "widget", "optionInstance"}, this);
    }

    public @Nullable class04370<?> y() {
        return this.optionInstance;
    }

    public class06478 N() {
        return this.widget;
    }
}

