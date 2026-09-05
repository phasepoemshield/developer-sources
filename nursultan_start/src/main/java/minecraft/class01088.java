/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01622
 *  minecraft.class01894
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.function.Predicate;
import minecraft.class01622;
import minecraft.class01894;
import org.jspecify.annotations.Nullable;

final class class01088
extends Record {
    final String name;
    final @Nullable class01622 resources;
    private final @Nullable Predicate<class01894> filter;

    public @Nullable Predicate<class01894> L() {
        return this.filter;
    }

    class01088(String string, @Nullable class01622 class016222, @Nullable Predicate<class01894> predicate) {
        this.name = string;
        this.resources = class016222;
        this.filter = predicate;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01088.class, "name;resources;filter", "name", "resources", "filter"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01088.class, "name;resources;filter", "name", "resources", "filter"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01088.class, "name;resources;filter", "name", "resources", "filter"}, this);
    }

    public @Nullable class01622 y() {
        return this.resources;
    }

    public boolean N(class01894 class018942) {
        return this.filter != null && this.filter.test(class018942);
    }

    public void N(Collection<class01894> collection) {
        if (this.filter != null) {
            collection.removeIf(this.filter);
        }
    }

    public String N() {
        return this.name;
    }
}

