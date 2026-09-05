/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01134
 *  minecraft.class01894
 *  minecraft.class02840
 *  minecraft.class04385
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07141
 *  minecraft.class08476
 *  minecraft.class08799
 */
package minecraft;

import minecraft.class01134;
import minecraft.class01894;
import minecraft.class02840;
import minecraft.class04385;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07141;
import minecraft.class08476;
import minecraft.class08799;

public class class02634<T extends class07141>
extends class02840<T, class08476, class04385> {
    private static final class01894 N = class01894.y((String)"textures/entity/spider/spider.png");

    public class02634(class04832 class048322) {
        this(class048322, class04802.ut);
    }

    public class02634(class04832 class048322, class01134 class011342) {
        super(class048322, (class06078)new class04385(class048322.N(class011342)), 0.8f);
        this.N((class06249)new class08799((class06252)this));
    }

    public class08476 method_55269() {
        return new class08476();
    }

    public class01894 N(class08476 class084762) {
        return N;
    }

    protected float f_() {
        return 180.0f;
    }
}

