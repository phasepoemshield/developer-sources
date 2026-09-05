/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01097
 *  minecraft.class01112
 *  minecraft.class01486
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04834
 */
package minecraft;

import minecraft.class01097;
import minecraft.class01112;
import minecraft.class01486;
import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04834;

public class class04225
extends class01097 {
    private final class01686 N;
    private final class01686 y;
    private final class01686 L;

    public class04225(class01686 class016862) {
        super(class016862);
        this.N = class016862.y("head");
        this.y = this.N.y("left_ear");
        this.L = this.N.y("right_ear");
    }

    public void method_2819(class01112 class011122) {
        super.method_2819((Object)class011122);
        this.N.R = class011122.y * ((float)Math.PI / 180);
        this.N.i = class011122.L * ((float)Math.PI / 180);
        float f = 1.2f;
        this.y.M = (float)(-(Math.cos(class011122.N * (float)Math.PI * 0.2f * 1.2f) + 2.5)) * 0.2f;
        this.L.M = (float)(Math.cos(class011122.N * (float)Math.PI * 0.2f) + 2.5) * 0.2f;
    }

    public static class04792 N() {
        class04792 class047922 = new class04792();
        class01486.N((class04834)class04834.N, (class04792)class047922);
        return class047922;
    }
}

