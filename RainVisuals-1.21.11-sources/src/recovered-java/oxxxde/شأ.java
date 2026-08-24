/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotakbaz.rain.client.render.texture.GlTex;
import oxxxde.\u0627\u064e;
import oxxxde.\u0636\u0651;

public class \u0634\u0623 {
    protected static final List<GlTex> ALL_TEXTURES = new CopyOnWriteArrayList<GlTex>();
    protected static \u0636\u0651 glController = new \u0627\u064e();

    public static void close() {
        ALL_TEXTURES.forEach(GlTex::delete);
        ALL_TEXTURES.clear();
    }

    public static void setGlController(\u0636\u0651 controller) {
        glController = controller;
    }

    public static void addTexture(GlTex texture) {
        ALL_TEXTURES.add(texture);
    }

    public static void removeTexture(GlTex texture) {
        ALL_TEXTURES.remove(texture);
    }

    public static \u0636\u0651 getGlController() {
        return glController;
    }
}

