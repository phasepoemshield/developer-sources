/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.program.compile;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import kotakbaz.rain.client.render.main.program.compile.a_0;

public final class A
extends Record {
    private final a_0 a;
    private final String A;

    public A(a_0 status, String message) {
        this.a = status;
        this.A = message;
    }

    public boolean isFailure() {
        return this.a.equals((Object)a_0.A);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "status;message", "a", "A"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "status;message", "a", "A"}, this);
    }

    @Override
    public final boolean equals(Object o2) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "status;message", "a", "A"}, this, o2);
    }

    public a_0 status() {
        return this.a;
    }

    public String message() {
        return this.A;
    }
}

