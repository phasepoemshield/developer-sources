/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main;

import java.util.function.Function;
import kotakbaz.rain.client.render.main.builders.a_0;
import kotakbaz.rain.client.render.main.builders.b;
import kotakbaz.rain.client.render.main.exceptions.A;

/*
 * Renamed from kotakbaz.rain.client.render.main.b
 */
public abstract class b_0<T> {
    private final Function<T, String> E = object -> {
        String string = null;
        try {
            string = this.getContent(object);
        }
        catch (Exception exception) {
            A.printAndExit(new kotakbaz.rain.client.render.main.exceptions.impl.load.A(exception));
        }
        return string;
    };
    private final Function<T, String> f = object -> {
        String string = null;
        try {
            string = this.getContent(object);
        }
        catch (Exception exception) {
            A.printAndExit(new kotakbaz.rain.client.render.main.exceptions.impl.load.a_0(exception));
        }
        return string;
    };

    public b_0() {
        super();
    }

    public b<T> createProgramBuilder(kotakbaz.rain.client.render.main.program.a_0 ... a_0Array) {
        return new b(this, a_0Array);
    }

    public a_0<T> createShaderLibraryBuilder(kotakbaz.rain.client.render.main.program.a_0 ... a_0Array) {
        return new a_0<T>(this.f, a_0Array);
    }

    public kotakbaz.rain.client.render.main.compile.a_0 createGlslFileEntry(String string, T t2) {
        return new kotakbaz.rain.client.render.main.compile.a_0(string, this.E.apply(t2));
    }

    public abstract String getContent(T var1);
}

