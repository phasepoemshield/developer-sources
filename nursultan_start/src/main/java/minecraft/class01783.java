/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09520
 *  minecraft.class01176
 *  minecraft.class01894
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06105
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07148
 *  minecraft.class08474
 *  minecraft.class08475
 */
package minecraft;

import Nursultan.class09520;
import minecraft.class01176;
import minecraft.class01894;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06105;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07148;
import minecraft.class08474;
import minecraft.class08475;

public class class01783<T extends class07148>
extends class06105<T, class08474> {
    private static final class01894 N = class01894.y((String)"textures/entity/illager/evoker.png");

    public class01783(class04832 class048322) {
        super(class048322, new class01176(class048322.N(class04802.yN)), 0.5f);
        this.N((class06249)new class09520(this, (class06252)this));
    }

    public class08474 method_55269() {
        return new class08474();
    }

    public class01894 N(class08474 class084742) {
        return N;
    }

    public void method_62354(T t, class08474 class084742, float f) {
        super.method_62354(t, (class08475)class084742, f);
        class084742.N = t.n();
    }
}

