/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02721
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class08468
 *  org.joml.Quaternionf
 */
package minecraft;

import minecraft.class01686;
import minecraft.class02721;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class08468;
import org.joml.Quaternionf;

public class class02423
extends class02721 {
    private static final String G = "cape";
    private final class01686 l;

    public class02423(class01686 class016862) {
        super(class016862, false);
        this.l = this.Z.y(G);
    }

    public void method_2819(class08468 class084682) {
        super.method_2819(class084682);
        this.l.N(new Quaternionf().rotateY((float)(-Math.PI)).rotateX((6.0f + class084682.a / 2.0f + class084682.y) * ((float)Math.PI / 180)).rotateZ(class084682.p / 2.0f * ((float)Math.PI / 180)).rotateY((180.0f - class084682.p / 2.0f) * ((float)Math.PI / 180)));
    }

    public static class04806 N() {
        class04792 class047922 = class02721.N((class04834)class04834.N, (boolean)false);
        class047922.N().N().y("body").N(G, class04822.L().N(0, 0).N(-5.0f, 0.0f, -1.0f, 10.0f, 16.0f, 1.0f, class04834.N, 1.0f, 0.5f), class04838.N((float)0.0f, (float)0.0f, (float)2.0f, (float)0.0f, (float)((float)Math.PI), (float)0.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }
}

