/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.compile;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import kotakbaz.rain.client.render.main.compile.a_0;

public final class A
extends Record {
    private final a_0 a;
    private final HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a_0<?>> A;

    public A(a_0 a_02, HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a_0<?>> hashMap) {
        super();
        this.a = a_02;
        this.A = hashMap;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "libraryEntry;uniforms", "a", "A"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "libraryEntry;uniforms", "a", "A"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "libraryEntry;uniforms", "a", "A"}, this, object);
    }

    public a_0 libraryEntry() {
        return this.a;
    }

    public HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a_0<?>> uniforms() {
        return this.A;
    }
}

