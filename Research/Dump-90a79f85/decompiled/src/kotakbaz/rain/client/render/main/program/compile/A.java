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

    public A(a_0 a_02, String string) {
        super();
        this.a = a_02;
        this.A = string;
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
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "status;message", "a", "A"}, this, object);
    }

    public a_0 status() {
        return this.a;
    }

    public String message() {
        return this.A;
    }
}

