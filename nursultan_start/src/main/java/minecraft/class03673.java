/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02112
 *  minecraft.class03255
 *  minecraft.class04995
 *  org.joml.Vector2i
 *  org.joml.Vector2ic
 */
package minecraft;

import minecraft.class02112;
import minecraft.class03255;
import minecraft.class04995;
import org.joml.Vector2i;
import org.joml.Vector2ic;

public class class03673
implements class02112 {
    private static final int L = 5;
    private static final int u = 12;
    public static final int N = 3;
    public static final int y = 5;
    private final class03255 i;

    public class03673(class03255 class032552) {
        this.i = class032552;
    }

    private static int N(int n, int n2, int n3) {
        return Math.round(class04995.B((float)((float)Math.min(Math.abs(n - n2), n3) / (float)n3), (float)(n3 - 3), (float)5.0f));
    }

    public Vector2ic method_47944(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        Vector2i vector2i = new Vector2i(n3 + 12, n4);
        if (vector2i.x + n5 > n - 5) {
            vector2i.x = Math.max(n3 - 12 - n5, 9);
        }
        vector2i.y += 3;
        int n8 = n6 + 3 + 3;
        int n9 = this.i.L() + 3 + class03673.N(0, 0, this.i.B());
        vector2i.y = n9 + n8 <= (n7 = n2 - 5) ? (vector2i.y += class03673.N(vector2i.y, this.i.y(), this.i.B())) : (vector2i.y -= n8 + class03673.N(vector2i.y, this.i.L(), this.i.B()));
        return vector2i;
    }
}

