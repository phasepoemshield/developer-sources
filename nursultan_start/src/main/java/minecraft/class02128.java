/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector2i
 *  org.joml.Vector2ic
 */
package minecraft;

import minecraft.class02112;
import org.joml.Vector2i;
import org.joml.Vector2ic;

public class class02128
implements class02112 {
    public static final class02112 N = new class02128();

    private class02128() {
    }

    private void N(int n, int n2, Vector2i vector2i, int n3, int n4) {
        int n5;
        if (vector2i.x + n3 > n) {
            vector2i.x = Math.max(vector2i.x - 24 - n3, 4);
        }
        if (vector2i.y + (n5 = n4 + 3) > n2) {
            vector2i.y = n2 - n5;
        }
    }

    @Override
    public Vector2ic method_47944(int n, int n2, int n3, int n4, int n5, int n6) {
        Vector2i vector2i = new Vector2i(n3, n4).add(12, -12);
        this.N(n, n2, vector2i, n5, n6);
        return vector2i;
    }
}

