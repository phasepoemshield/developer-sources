/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.program.compile;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import oxxxde.\u0635\u062c;

public final class A
extends Record {
    private final String message;
    private final \u0635\u062c status;

    public A(\u0635\u062c status, String message) {
        this.status = status;
        this.message = message;
    }

    @Override
    public final boolean equals(Object o) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "status;message", "status", "message"}, this, o);
    }

    public \u0635\u062c status() {
        return this.status;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "status;message", "status", "message"}, this);
    }

    public String message() {
        return this.message;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "status;message", "status", "message"}, this);
    }

    public boolean isFailure() {
        return this.status.equals((Object)\u0635\u062c.FAILURE);
    }
}

