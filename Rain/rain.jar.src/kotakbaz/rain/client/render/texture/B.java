/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.texture;

import java.util.HashMap;
import java.util.Map;
import kotakbaz.rain.client.render.texture.texture.a;

public class B {
    private static final Map<String, a> a;
    public static int[] b;

    public static boolean addTexture(String key, a texture) {
        if (a.containsKey(key)) {
            boolean bl = b[0];
            bl -= b[1];
            return bl ^= b[2];
        }
        a.put(key, texture);
        boolean bl = b[3];
        bl ^= b[4];
        return bl -= b[5];
    }

    public static boolean removeTexture(String key) {
        if (!a.containsKey(key)) {
            boolean bl = b[6];
            bl -= b[7];
            return bl += b[8];
        }
        a.remove(key);
        boolean bl = b[9];
        bl ^= b[10];
        return bl -= b[11];
    }

    public static a getTexture(String key) {
        return a.get(key);
    }

    private static a register(String key, a texture) {
        a.put(key, texture);
        return texture;
    }

    static {
        B.a();
        a = new HashMap<String, a>();
    }

    public static void a() {
        b = new int[0xF4DA ^ 0xF4D6];
        B.b[0x1A8D ^ 0x1A8F] = 0xFFFFE57F ^ 0x1A8F;
        B.b[0x1664 ^ 0x1662] = 0xFFFFE9CA ^ 0x1662;
        B.b[0x7EE9 ^ 0x7EE9] = 0x7E88 ^ 0x7EE9;
        B.b[0x14E1 ^ 0x14EA] = 0x1481 ^ 0x14EA;
        B.b[0x577D ^ 0x5775] = 0xFFFFA892 ^ 0x5775;
        B.b[0x5ECE ^ 0x5ECF] = 0x5EBE ^ 0x5ECF;
        B.b[0x428 ^ 0x42B] = 0x444 ^ 0x42B;
        B.b[0xA8CB ^ 0xA8CC] = 0xFFFF5743 ^ 0xA8CC;
        B.b[0x5DC ^ 0x5D8] = 0x5FC ^ 0x5D8;
        B.b[0x91AA ^ 0x91A0] = 0x91E3 ^ 0x91A0;
        B.b[0x466 ^ 0x46F] = 0x440 ^ 0x46F;
        B.b[0x3FDB ^ 0x3FDE] = 0x3F94 ^ 0x3FDE;
    }
}

