/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02789
 *  minecraft.class03739
 *  minecraft.class04832
 *  minecraft.class08007
 *  minecraft.class08037
 *  minecraft.class08254
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02789;
import minecraft.class03739;
import minecraft.class04832;
import minecraft.class08007;
import minecraft.class08037;
import minecraft.class08254;

public class class02654
extends class03739<class08037, class08254> {
    public static final class01894 N = class01894.y((String)"textures/entity/projectiles/arrow.png");
    public static final class01894 y = class01894.y((String)"textures/entity/projectiles/tipped_arrow.png");

    public class02654(class04832 class048322) {
        super(class048322);
    }

    protected class01894 N(class08254 class082542) {
        return class082542.N ? y : N;
    }

    public class08254 method_55269() {
        return new class08254();
    }

    public void method_62354(class08037 class080372, class08254 class082542, float f) {
        super.method_62354((class08007)class080372, (class02789)class082542, f);
        class082542.N = class080372.m() > 0;
    }
}

