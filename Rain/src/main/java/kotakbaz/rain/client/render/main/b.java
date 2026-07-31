/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main;

import java.util.function.Function;
import kotakbaz.rain.client.render.main.compile.a;
import kotakbaz.rain.client.render.main.exceptions.a_0;
import kotakbaz.rain.client.render.main.exceptions.impl.load.A;

public abstract class b<T> {
    private final Function<T, String> E = path -> {
        String string = null;
        try {
            string = this.getContent(path);
        }
        catch (Exception exception) {
            a_0.printAndExit(new A(exception));
        }
        return string;
    };
    private final Function<T, String> f = path -> {
        String string = null;
        try {
            string = this.getContent(path);
        }
        catch (Exception exception) {
            a_0.printAndExit(new kotakbaz.rain.client.render.main.exceptions.impl.load.a_0(exception));
        }
        return string;
    };

    public kotakbaz.rain.client.render.main.builders.b<T> createProgramBuilder(kotakbaz.rain.client.render.main.program.a ... snippets) {
        return new kotakbaz.rain.client.render.main.builders.b(this, snippets);
    }

    public kotakbaz.rain.client.render.main.builders.a<T> createShaderLibraryBuilder(kotakbaz.rain.client.render.main.program.a ... snippets) {
        return new kotakbaz.rain.client.render.main.builders.a<T>(this.f, snippets);
    }

    public a createGlslFileEntry(String name, T path) {
        return new a(name, this.E.apply(path));
    }

    public abstract String getContent(T var1);
}

