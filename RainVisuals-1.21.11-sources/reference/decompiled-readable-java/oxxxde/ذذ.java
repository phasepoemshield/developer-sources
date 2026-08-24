/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.HashMap;
import java.util.function.Function;
import kotakbaz.rain.client.render.main.compile.GlShaderLibrary;
import kotakbaz.rain.client.render.main.program.a;
import oxxxde.\u0628\u062a;
import oxxxde.\u062d\u062c;
import oxxxde.\u062f\u0646;
import oxxxde.\u0637\u064a;

public class \u0630\u0630<T> {
    private final HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a<?>> uniforms = new HashMap();
    private String name;
    private T libraryPath;
    private final Function<T, String> contentGetter;

    /*
     * WARNING - void declaration
     */
    public \u0630\u0630(Function<T, String> contentGetter, a ... snippets) {
        void var1_1;
        a[] aArray = snippets;
        int n = aArray.length;
        for (int i = 0; i < n; ++i) {
            a snippet = aArray[i];
            snippet.uniforms().forEach(this::uniform);
        }
        this.contentGetter = var1_1;
    }

    public \u0630\u0630<T> sampler(String name) {
        this.uniform(name, kotakbaz.rain.client.render.main.program.uniform.a.SAMPLER);
        return this;
    }

    public GlShaderLibrary build() {
        if (this.name == null) {
            \u062f\u0646.printAndExit(new \u062d\u062c("Missing name in shader library builder."));
        }
        if (this.libraryPath == null) {
            Object[] objectArray = new Object[1];
            objectArray[0] = this.name;
            \u062f\u0646.printAndExit(new \u062d\u062c(String.format("Missing libraryPath in library '%s'.", objectArray)));
        }
        return new GlShaderLibrary(new kotakbaz.rain.client.render.main.compile.a(this.name, this.contentGetter.apply(this.libraryPath)), this.uniforms);
    }

    public \u0630\u0630<T> name(String name) {
        this.name = name;
        return this;
    }

    public \u0630\u0630<T> library(T libraryPath) {
        this.libraryPath = libraryPath;
        return this;
    }

    public <S extends \u0637\u064a> \u0630\u0630<T> uniform(String name, kotakbaz.rain.client.render.main.program.uniform.a<S> uniformType) {
        if (this.uniforms.containsKey(name)) {
            \u062f\u0646.printAndExit(new \u0628\u062a(name));
        }
        this.uniforms.put(name, uniformType);
        return this;
    }
}

