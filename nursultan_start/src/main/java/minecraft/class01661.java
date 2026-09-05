/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02959
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01672;
import minecraft.class01676;
import minecraft.class02959;

final class class01661
extends Record {
    final class01676 storage;
    final class01672 events;

    class01661(class02959 class029592) {
        this(new class01676(class029592), new class01672());
    }

    private class01661(class01676 class016762, class01672 class016722) {
        this.storage = class016762;
        this.events = class016722;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01661.class, "storage;events", "storage", "events"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01661.class, "storage;events", "storage", "events"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01661.class, "storage;events", "storage", "events"}, this);
    }

    public class01672 y() {
        return this.events;
    }

    public class01676 N() {
        return this.storage;
    }
}

