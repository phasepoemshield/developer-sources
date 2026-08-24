/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.function.Function;
import kotakbaz.rain.client.render.main.builders.GlProgramBuilder;
import kotakbaz.rain.client.render.main.compile.a;
import oxxxde.\u062d\u0650;
import oxxxde.\u062e;
import oxxxde.\u062f\u0646;
import oxxxde.\u0630\u0630;

public abstract class \u062a\u0626<T> {
    private final Function<T, String> shaderLibraryContentGetter;
    private final Function<T, String> glslContentGetter = path -> {
        void var2_2;
        String content = null;
        try {
            content = this.getContent(path);
        }
        catch (Exception e) {
            \u062f\u0646.printAndExit(new \u062e(e));
        }
        return var2_2;
    };

    public \u0630\u0630<T> createShaderLibraryBuilder(kotakbaz.rain.client.render.main.program.a ... snippets) {
        return new \u0630\u0630<T>(this.shaderLibraryContentGetter, snippets);
    }

    public GlProgramBuilder<T> createProgramBuilder(kotakbaz.rain.client.render.main.program.a ... snippets) {
        return new GlProgramBuilder(this, snippets);
    }

    public a createGlslFileEntry(String name, T path) {
        return new a(name, this.glslContentGetter.apply(path));
    }

    public abstract String getContent(T var1) throws Exception;

    public \u062a\u0626() {
        this.shaderLibraryContentGetter = path -> {
            void var2_2;
            String content = null;
            try {
                content = this.getContent(path);
            }
            catch (Exception e) {
                \u062f\u0646.printAndExit(new \u062d\u0650(e));
            }
            return var2_2;
        };
    }
}

