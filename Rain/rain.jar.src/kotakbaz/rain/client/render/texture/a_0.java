/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.texture;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotakbaz.rain.client.render.texture.A;
import kotakbaz.rain.client.render.texture.controller.a;

/*
 * Renamed from kotakbaz.rain.client.render.texture.a
 */
public class a_0 {
    protected static final List<A> a = new CopyOnWriteArrayList<A>();
    protected static kotakbaz.rain.client.render.texture.controller.a_0 A = new a();

    public static void setGlController(kotakbaz.rain.client.render.texture.controller.a_0 controller) {
        A = controller;
    }

    public static kotakbaz.rain.client.render.texture.controller.a_0 getGlController() {
        return A;
    }

    public static void addTexture(A texture) {
        a.add(texture);
    }

    public static void removeTexture(A texture) {
        a.remove(texture);
    }

    public static void close() {
        a.forEach(A::delete);
        a.clear();
    }
}

