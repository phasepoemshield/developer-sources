/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.builders;

import java.util.ArrayList;
import java.util.HashMap;
import kotakbaz.rain.client.render.main.compile.b;
import kotakbaz.rain.client.render.main.program.GlProgram;
import kotakbaz.rain.client.render.main.program.a;
import oxxxde.\u0628\u062a;
import oxxxde.\u062a\u0626;
import oxxxde.\u062d\u0622;
import oxxxde.\u062f\u0646;
import oxxxde.\u0631\u0628;
import oxxxde.\u0631\u0631;
import oxxxde.\u0634\u064c;
import oxxxde.\u0637\u064a;

public class GlProgramBuilder<T> {
    private final a[] snippets;
    private final HashMap<\u062d\u0622, kotakbaz.rain.client.render.main.compile.a> shaders = new HashMap();
    private String name;
    private final \u062a\u0626<T> loader;
    private final HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a<?>> uniforms = new HashMap();

    public GlProgramBuilder<T> shader(String name, T shaderPath, \u062d\u0622 type) {
        if (this.shaders.containsKey((Object)type)) {
            \u062f\u0646.printAndExit(new \u0631\u0628(name, type, this.shaders.get((Object)type).name()));
        }
        this.shaders.put(type, this.loader.createGlslFileEntry(name, shaderPath));
        return this;
    }

    public GlProgram build() {
        if (this.name == null) {
            \u062f\u0646.printAndExit(new \u0634\u064c("Missing name in program builder."));
        }
        if (!this.shaders.containsKey((Object)\u062d\u0622.Compute)) {
            if (!this.shaders.containsKey((Object)\u062d\u0622.Vertex)) {
                Object[] objectArray = new Object[1];
                objectArray[0] = this.name;
                \u062f\u0646.printAndExit(new \u0634\u064c(String.format("Missing vertex shader in program '%s'.", objectArray)));
            }
            if (!this.shaders.containsKey((Object)\u062d\u0622.Fragment)) {
                Object[] objectArray = new Object[1];
                objectArray[0] = this.name;
                \u062f\u0646.printAndExit(new \u0634\u064c(String.format("Missing fragment shader in program '%s'.", objectArray)));
            }
        }
        ArrayList<\u0631\u0631> shaderList = new ArrayList<\u0631\u0631>();
        this.shaders.forEach((type, glslFileEntry) -> shaderList.add(b.compileShader(glslFileEntry, type)));
        return b.compileProgram(this.name, shaderList, this.snippets, this.uniforms);
    }

    public GlProgramBuilder<T> sampler(String name) {
        this.uniform(name, kotakbaz.rain.client.render.main.program.uniform.a.SAMPLER);
        return this;
    }

    public GlProgramBuilder<T> shader(kotakbaz.rain.client.render.main.compile.a shaderEntry, \u062d\u0622 type) {
        if (this.shaders.containsKey((Object)type)) {
            \u062f\u0646.printAndExit(new \u0631\u0628(shaderEntry.name(), type, this.shaders.get((Object)type).name()));
        }
        this.shaders.put(type, shaderEntry);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public GlProgramBuilder(\u062a\u0626<T> loader, a ... snippets) {
        void var2_2;
        a[] aArray = snippets;
        int n = aArray.length;
        for (int i = 0; i < n; ++i) {
            a snippet = aArray[i];
            snippet.applyTo(this);
        }
        this.loader = loader;
        this.snippets = var2_2;
    }

    public a buildSnippet() {
        return new a(this.shaders, this.uniforms);
    }

    public GlProgramBuilder<T> name(String name) {
        this.name = name;
        return this;
    }

    public <S extends \u0637\u064a> GlProgramBuilder<T> uniform(String name, kotakbaz.rain.client.render.main.program.uniform.a<S> uniformType) {
        if (this.uniforms.containsKey(name)) {
            \u062f\u0646.printAndExit(new \u0628\u062a(name));
        }
        this.uniforms.put(name, uniformType);
        return this;
    }
}

