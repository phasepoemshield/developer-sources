/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.compile;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import kotakbaz.rain.client.render.main.compile.a;

/*
 * Renamed from kotakbaz.rain.client.render.main.compile.A
 */
public final class a_0
extends Record {
    private final a a;
    private final HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a<?>> A;

    public a_0(a libraryEntry, HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a<?>> uniforms) {
        this.a = libraryEntry;
        this.A = uniforms;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{a_0.class, "libraryEntry;uniforms", "a", "A"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a_0.class, "libraryEntry;uniforms", "a", "A"}, this);
    }

    @Override
    public final boolean equals(Object o2) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a_0.class, "libraryEntry;uniforms", "a", "A"}, this, o2);
    }

    public a libraryEntry() {
        return this.a;
    }

    public HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a<?>> uniforms() {
        return this.A;
    }
}

