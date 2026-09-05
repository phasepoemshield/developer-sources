/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00275
 *  minecraft.class01134
 *  minecraft.class01894
 *  minecraft.class03761
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class07311
 *  minecraft.class08790
 */
package minecraft;

import minecraft.class00275;
import minecraft.class01134;
import minecraft.class01894;
import minecraft.class03761;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class07311;
import minecraft.class08790;

public class class00243
extends class00275 {
    private final class06078<class08790> N;
    private final class01894 y;

    public class00243(class04832 class048322, class01134 class011342) {
        super(class048322);
        this.y = class011342.N().N(string -> "textures/entity/" + string + ".png");
        this.N = new class03761(class048322.N(class011342));
    }

    protected class07311 method_64520() {
        return this.N.method_23500(this.y);
    }

    protected class06078<class08790> method_64517() {
        return this.N;
    }
}

