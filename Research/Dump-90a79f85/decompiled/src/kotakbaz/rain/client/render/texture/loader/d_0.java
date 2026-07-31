/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.texture.loader;

import kotakbaz.rain.client.render.texture.builder.a_0;
import kotakbaz.rain.client.render.texture.builder.b_0;
import kotakbaz.rain.client.render.texture.texture.A;
import kotakbaz.rain.client.render.texture.texture.B;

/*
 * Renamed from kotakbaz.rain.client.render.texture.loader.d
 */
public abstract class d_0<T> {
    public d_0() {
        super();
    }

    public abstract b_0 load(T var1, B var2, A var3, kotakbaz.rain.client.render.texture.texture.b_0 var4);

    public a_0<T> createTextureBuilder() {
        return new a_0(this);
    }
}

