/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.HashMap;
import java.util.Map;
import kotakbaz.rain.client.render.texture.texture.GLTexture;

public class \u0630\u064e {
    private static final Map<String, GLTexture> TEXTURES = new HashMap<String, GLTexture>();

    public static GLTexture getTexture(String key) {
        return TEXTURES.get(key);
    }

    public static boolean addTexture(String key, GLTexture texture) {
        if (TEXTURES.containsKey(key)) {
            return false;
        }
        TEXTURES.put(key, texture);
        return true;
    }

    private static GLTexture register(String key, GLTexture texture) {
        TEXTURES.put(key, texture);
        return texture;
    }

    public static boolean removeTexture(String key) {
        if (!TEXTURES.containsKey(key)) {
            return false;
        }
        TEXTURES.remove(key);
        return true;
    }
}

