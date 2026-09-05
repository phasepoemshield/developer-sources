/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class03264
 *  minecraft.class05388
 *  minecraft.class05404
 *  minecraft.class05418
 */
package minecraft;

import java.util.function.BiConsumer;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class03264;
import minecraft.class05388;
import minecraft.class05404;
import minecraft.class05418;
import minecraft.class05433;

public class class05424 {
    private final class05388 y;
    final /* synthetic */ class05404 N;

    public class05424 L(class00891 class008912) {
        class01894 class018942 = class05433.z.N(class008912, this.y, this.N.L);
        class03264 class032642 = class05404.y((class01894)class05433.U.N(class008912, this.y, this.N.L));
        this.N.N.accept(class05404.L((class00891)class008912, (class03264)class05404.y((class01894)class018942), (class03264)class032642));
        this.N.N(class008912, class018942);
        return this;
    }

    public class05424(class05404 class054042, class05388 class053882) {
        this.N = class054042;
        this.y = class053882;
    }

    public class05424 u(class00891 class008912) {
        this.N.N.accept(class05404.N((class00891)class008912, (class05388)this.y, (BiConsumer)this.N.L));
        this.N.N(class008912, class05433.z.N(class008912, this.y, this.N.L));
        return this;
    }

    public class05424 y(class00891 class008912) {
        class01894 class018942 = class05433.z.N(class008912, this.y, this.N.L);
        this.N.N.accept(class05404.y((class00891)class008912, (class03264)class05404.y((class01894)class018942)));
        this.N.N(class008912, class018942);
        return this;
    }

    public class05424 N(class00891 class008912) {
        class05388 class053882 = this.y.L(class05418.u, this.y.N(class05418.Z));
        class01894 class018942 = class05433.z.N(class008912, class053882, this.N.L);
        this.N.N.accept(class05404.y((class00891)class008912, (class03264)class05404.y((class01894)class018942)));
        this.N.N(class008912, class018942);
        return this;
    }
}

