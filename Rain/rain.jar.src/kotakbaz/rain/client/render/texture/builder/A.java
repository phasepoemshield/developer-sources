/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.texture.builder;

import java.util.List;
import kotakbaz.rain.client.render.texture.builder.b_0;

public class A {
    private final List<b_0> a;
    private final int A;

    public A(List<b_0> textures, int delay) {
        this.a = textures;
        this.A = delay;
    }

    public List<b_0> getTextures() {
        return this.a;
    }

    public int getDelay() {
        return this.A;
    }
}

