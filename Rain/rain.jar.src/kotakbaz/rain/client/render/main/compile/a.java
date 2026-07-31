/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.compile;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class a
extends Record {
    private final String a;
    private final String A;

    public a(String name, String content) {
        this.a = name;
        this.A = content;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "name;content", "a", "A"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "name;content", "a", "A"}, this);
    }

    @Override
    public final boolean equals(Object o2) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "name;content", "a", "A"}, this, o2);
    }

    public String name() {
        return this.a;
    }

    public String content() {
        return this.A;
    }
}

