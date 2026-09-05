/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01028
 *  minecraft.class01590
 *  minecraft.class03054
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01028;
import minecraft.class01590;
import minecraft.class03054;
import org.jspecify.annotations.Nullable;

public final class class06419
extends Record {
    private final int addedTime;
    private final class01028 content;
    private final @Nullable class03054 tag;
    private final boolean endOfEntry;

    public @Nullable class03054 L() {
        return this.tag;
    }

    public class06419(int n, class01028 class010282, @Nullable class03054 class030542, boolean bl) {
        this.addedTime = n;
        this.content = class010282;
        this.tag = class030542;
        this.endOfEntry = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06419.class, "addedTime;content;tag;endOfEntry", "addedTime", "content", "tag", "endOfEntry"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06419.class, "addedTime;content;tag;endOfEntry", "addedTime", "content", "tag", "endOfEntry"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06419.class, "addedTime;content;tag;endOfEntry", "addedTime", "content", "tag", "endOfEntry"}, this);
    }

    public boolean u() {
        return this.endOfEntry;
    }

    public class01028 y() {
        return this.content;
    }

    public int N(class01590 class015902) {
        return class015902.N(this.content) + 4;
    }

    public int N() {
        return this.addedTime;
    }
}

