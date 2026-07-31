/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.program;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import kotakbaz.rain.client.render.main.builders.b;

/*
 * Renamed from kotakbaz.rain.client.render.main.program.a
 */
public final class a_0
extends Record {
    private final HashMap<kotakbaz.rain.client.render.main.program.shader.a_0, kotakbaz.rain.client.render.main.compile.a_0> a;
    private final HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a_0<?>> A;

    public a_0(HashMap<kotakbaz.rain.client.render.main.program.shader.a_0, kotakbaz.rain.client.render.main.compile.a_0> hashMap, HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a_0<?>> hashMap2) {
        super();
        this.a = hashMap;
        this.A = hashMap2;
    }

    public <T> void applyTo(b<T> b2) {
        this.a.forEach((a_02, a_03) -> b2.shader((kotakbaz.rain.client.render.main.compile.a_0)a_03, (kotakbaz.rain.client.render.main.program.shader.a_0)((Object)a_02)));
        this.A.forEach(b2::uniform);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{a_0.class, "shaders;uniforms", "a", "A"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a_0.class, "shaders;uniforms", "a", "A"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a_0.class, "shaders;uniforms", "a", "A"}, this, object);
    }

    public HashMap<kotakbaz.rain.client.render.main.program.shader.a_0, kotakbaz.rain.client.render.main.compile.a_0> shaders() {
        return this.a;
    }

    public HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a_0<?>> uniforms() {
        return this.A;
    }
}

