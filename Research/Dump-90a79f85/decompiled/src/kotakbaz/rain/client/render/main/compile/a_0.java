/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.compile;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

/*
 * Renamed from kotakbaz.rain.client.render.main.compile.a
 */
public final class a_0
extends Record {
    private final String a;
    private final String A;

    public a_0(String string, String string2) {
        super();
        this.a = string;
        this.A = string2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{a_0.class, "name;content", "a", "A"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a_0.class, "name;content", "a", "A"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a_0.class, "name;content", "a", "A"}, this, object);
    }

    public String name() {
        return this.a;
    }

    public String content() {
        return this.A;
    }
}

