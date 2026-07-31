/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.texture.builder;

import java.nio.ByteBuffer;
import kotakbaz.rain.client.render.texture.texture.B;
import kotakbaz.rain.client.render.texture.texture.a_0;

/*
 * Renamed from kotakbaz.rain.client.render.texture.builder.b
 */
public class b_0 {
    private final ByteBuffer a;
    private final int A;
    private final int b;
    private final B B;
    private final a_0 c;
    private final kotakbaz.rain.client.render.texture.texture.b_0 C;
    private final boolean d;

    public b_0(ByteBuffer pixels, int width2, int height, B colorMode, a_0 filtering, kotakbaz.rain.client.render.texture.texture.b_0 wrapping, boolean usingStb) {
        this.a = pixels;
        this.A = width2;
        this.b = height;
        this.B = colorMode;
        this.c = filtering;
        this.C = wrapping;
        this.d = usingStb;
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

    public a_0 getFiltering() {
        return this.c;
    }

    public kotakbaz.rain.client.render.texture.texture.b_0 getWrapping() {
        return this.C;
    }

    public boolean isUsingStb() {
        return this.d;
    }
}

