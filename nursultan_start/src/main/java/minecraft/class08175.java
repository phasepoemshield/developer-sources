/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import jdk.jfr.consumer.RecordedEvent;

public final class class08175
extends Record {
    private final int fps;

    public class08175(int n) {
        this.fps = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08175.class, "fps", "fps"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08175.class, "fps", "fps"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08175.class, "fps", "fps"}, this);
    }

    public static class08175 N(RecordedEvent recordedEvent, String string) {
        return new class08175(recordedEvent.getInt(string));
    }

    public int N() {
        return this.fps;
    }
}

