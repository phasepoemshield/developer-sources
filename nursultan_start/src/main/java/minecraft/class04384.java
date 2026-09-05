/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01097
 *  minecraft.class01112
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 */
package minecraft;

import minecraft.class01097;
import minecraft.class01112;
import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;

public class class04384
extends class01097 {
    protected final class01686 N;

    public static class04806 L() {
        return class04806.N((class04792)class04384.N(), (int)64, (int)32);
    }

    public class04384(class01686 class016862) {
        super(class016862);
        this.N = class016862.y("head");
    }

    public static class04806 y() {
        class04792 class047922 = class04384.N();
        class047922.N().y("head").N("hat", class04822.L().N(32, 0).N(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new class04834(0.25f)), class04838.N);
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    public void method_2819(class01112 class011122) {
        super.method_2819((Object)class011122);
        this.N.R = class011122.y * ((float)Math.PI / 180);
        this.N.i = class011122.L * ((float)Math.PI / 180);
    }

    public static class04792 N() {
        class04792 class047922 = new class04792();
        class047922.N().N("head", class04822.L().N(0, 0).N(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f), class04838.N);
        return class047922;
    }
}

