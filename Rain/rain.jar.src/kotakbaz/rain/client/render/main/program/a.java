/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.program;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import kotakbaz.rain.client.render.main.builders.b;
import kotakbaz.rain.client.render.main.program.shader.a_0;

public final class a
extends Record {
    private final HashMap<a_0, kotakbaz.rain.client.render.main.compile.a> a;
    private final HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a<?>> A;

    public a(HashMap<a_0, kotakbaz.rain.client.render.main.compile.a> shaders, HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a<?>> uniforms) {
        this.a = shaders;
        this.A = uniforms;
    }

    public <T> void applyTo(b<T> builder) {
        this.a.forEach((type, glslFileEntry) -> builder.shader((kotakbaz.rain.client.render.main.compile.a)glslFileEntry, (a_0)((Object)type)));
        this.A.forEach(builder::uniform);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "shaders;uniforms", "a", "A"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "shaders;uniforms", "a", "A"}, this);
    }

    @Override
    public final boolean equals(Object o2) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "shaders;uniforms", "a", "A"}, this, o2);
    }

    public HashMap<a_0, kotakbaz.rain.client.render.main.compile.a> shaders() {
        return this.a;
    }

    public HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a<?>> uniforms() {
        return this.A;
    }
}

