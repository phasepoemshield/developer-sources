/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.texture.builder;

import java.nio.ByteBuffer;
import kotakbaz.rain.client.render.texture.texture.A;
import kotakbaz.rain.client.render.texture.texture.B;

/*
 * Renamed from kotakbaz.rain.client.render.texture.builder.b
 */
public class b_0 {
    private final ByteBuffer a;
    private final int A;
    private final int b;
    private final B B;
    private final A c;
    private final kotakbaz.rain.client.render.texture.texture.b_0 C;
    private final boolean d;

    public b_0(ByteBuffer byteBuffer, int n, int n2, B b2, A a2, kotakbaz.rain.client.render.texture.texture.b_0 b_02, boolean bl) {
        super();
        this.a = byteBuffer;
        this.A = n;
        this.b = n2;
        this.B = b2;
        this.c = a2;
        this.C = b_02;
        this.d = bl;
    }

    public ByteBuffer getPixels() {
        return this.a;
    }

    public int getWidth() {
        return this.A;
    }

    public int getHeight() {
        return this.b;
    }

    public B getColorMode() {
        return this.B;
    }

    public A getFiltering() {
        return this.c;
    }

    public kotakbaz.rain.client.render.texture.texture.b_0 getWrapping() {
        return this.C;
    }

    public boolean isUsingStb() {
        return this.d;
    }
}

