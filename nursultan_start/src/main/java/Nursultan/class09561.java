/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02112
 *  minecraft.class03255
 *  org.joml.Vector2i
 *  org.joml.Vector2ic
 */
package Nursultan;

import minecraft.class02112;
import minecraft.class03255;
import org.joml.Vector2i;
import org.joml.Vector2ic;

public class class09561
implements class02112 {
    private final class03255 N;

    public class09561(class03255 class032552) {
        this.N = class032552;
    }

    public Vector2ic method_47944(int n, int n2, int n3, int n4, int n5, int n6) {
        Vector2i vector2i = new Vector2i();
        vector2i.x = this.N.u() + 3;
        vector2i.y = this.N.L() + 3 + 1;
        if (vector2i.y + n6 + 3 > n2) {
            vector2i.y = this.N.y() - n6 - 3 - 1;
        }
        if (vector2i.x + n5 > n) {
            vector2i.x = Math.max(this.N.i() - n5 - 3, 4);
        }
        return vector2i;
    }
}

