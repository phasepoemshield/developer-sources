/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.texture;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotakbaz.rain.client.render.texture.A;

/*
 * Renamed from kotakbaz.rain.client.render.texture.a
 */
public class a_0 {
    protected static final List<A> a = new CopyOnWriteArrayList<A>();
    protected static kotakbaz.rain.client.render.texture.controller.A A = new kotakbaz.rain.client.render.texture.controller.a_0();

    public a_0() {
        super();
    }

    public static void setGlController(kotakbaz.rain.client.render.texture.controller.A a2) {
        A = a2;
    }

    public static kotakbaz.rain.client.render.texture.controller.A getGlController() {
        return A;
    }

    public static void addTexture(A a2) {
        a.add(a2);
    }

    public static void removeTexture(A a2) {
        a.remove(a2);
    }

    public static void close() {
        a.forEach(A::delete);
        a.clear();
    }
}

