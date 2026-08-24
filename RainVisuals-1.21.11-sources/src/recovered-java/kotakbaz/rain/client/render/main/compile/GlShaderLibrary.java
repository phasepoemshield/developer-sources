/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.compile;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import kotakbaz.rain.client.render.main.compile.a;

public final class GlShaderLibrary
extends Record {
    private final HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a<?>> uniforms;
    private final a libraryEntry;

    public GlShaderLibrary(a libraryEntry, HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a<?>> uniforms) {
        this.libraryEntry = libraryEntry;
        this.uniforms = uniforms;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{GlShaderLibrary.class, "libraryEntry;uniforms", "libraryEntry", "uniforms"}, this);
    }

    @Override
    public final boolean equals(Object o) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{GlShaderLibrary.class, "libraryEntry;uniforms", "libraryEntry", "uniforms"}, this, o);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{GlShaderLibrary.class, "libraryEntry;uniforms", "libraryEntry", "uniforms"}, this);
    }

    public a libraryEntry() {
        return this.libraryEntry;
    }

    public HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a<?>> uniforms() {
        return this.uniforms;
    }
}

