/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00412
 *  minecraft.class00869
 *  minecraft.class04444
 *  minecraft.class05946
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07310
 */
package com.viaversion.viafabricplus.features.recipe;

import minecraft.class00412;
import minecraft.class00869;
import minecraft.class04444;
import minecraft.class05946;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07310;

public enum BannerPattern_1_13_2 {
    BASE((class05946<class00412>)class04444.N),
    SQUARE_BOTTOM_LEFT((class05946<class00412>)class04444.y, "   ", "   ", "#  "),
    SQUARE_BOTTOM_RIGHT((class05946<class00412>)class04444.L, "   ", "   ", "  #"),
    SQUARE_TOP_LEFT((class05946<class00412>)class04444.u, "#  ", "   ", "   "),
    SQUARE_TOP_RIGHT((class05946<class00412>)class04444.i, "  #", "   ", "   "),
    STRIPE_BOTTOM((class05946<class00412>)class04444.R, "   ", "   ", "###"),
    STRIPE_TOP((class05946<class00412>)class04444.M, "###", "   ", "   "),
    STRIPE_LEFT((class05946<class00412>)class04444.B, "#  ", "#  ", "#  "),
    STRIPE_RIGHT((class05946<class00412>)class04444.Z, "  #", "  #", "  #"),
    STRIPE_CENTER((class05946<class00412>)class04444.z, " # ", " # ", " # "),
    STRIPE_MIDDLE((class05946<class00412>)class04444.U, "   ", "###", "   "),
    STRIPE_DOWNRIGHT((class05946<class00412>)class04444.E, "#  ", " # ", "  #"),
    STRIPE_DOWNLEFT((class05946<class00412>)class04444.W, "  #", " # ", "#  "),
    STRIPE_SMALL((class05946<class00412>)class04444.m, "# #", "# #", "   "),
    CROSS((class05946<class00412>)class04444.P, "# #", " # ", "# #"),
    STRAIGHT_CROSS((class05946<class00412>)class04444.s, " # ", "###", " # "),
    TRIANGLE_BOTTOM((class05946<class00412>)class04444.T, "   ", " # ", "# #"),
    TRIANGLE_TOP((class05946<class00412>)class04444.b, "# #", " # ", "   "),
    TRIANGLES_BOTTOM((class05946<class00412>)class04444.j, "   ", "# #", " # "),
    TRIANGLES_TOP((class05946<class00412>)class04444.v, " # ", "# #", "   "),
    DIAGONAL_LEFT((class05946<class00412>)class04444.n, "## ", "#  ", "   "),
    DIAGONAL_RIGHT((class05946<class00412>)class04444.l, "   ", "  #", " ##"),
    DIAGONAL_LEFT_MIRROR((class05946<class00412>)class04444.G, "   ", "#  ", "## "),
    DIAGONAL_RIGHT_MIRROR((class05946<class00412>)class04444.t, " ##", "  #", "   "),
    CIRCLE_MIDDLE((class05946<class00412>)class04444.d, "   ", " # ", "   "),
    RHOMBUS_MIDDLE((class05946<class00412>)class04444.w, " # ", "# #", " # "),
    HALF_VERTICAL((class05946<class00412>)class04444.k, "## ", "## ", "## "),
    HALF_HORIZONTAL((class05946<class00412>)class04444.Y, "###", "###", "   "),
    HALF_VERTICAL_MIRROR((class05946<class00412>)class04444.Q, " ##", " ##", " ##"),
    HALF_HORIZONTAL_MIRROR((class05946<class00412>)class04444.O, "   ", "###", "###"),
    BORDER((class05946<class00412>)class04444.g, "###", "# #", "###"),
    CURLY_BORDER((class05946<class00412>)class04444.I, new class06584((class07310)class00869.Rc)),
    GRADIENT((class05946<class00412>)class04444.J, "# #", " # ", " # "),
    GRADIENT_UP((class05946<class00412>)class04444.o, " # ", " # ", "# #"),
    BRICKS((class05946<class00412>)class04444.q, new class06584((class07310)class00869.Lv)),
    GLOBE((class05946<class00412>)class04444.K),
    CREEPER((class05946<class00412>)class04444.V, new class06584((class07310)class06570.GY)),
    SKULL((class05946<class00412>)class04444.e, new class06584((class07310)class06570.Gd)),
    FLOWER((class05946<class00412>)class04444.H, new class06584((class07310)class00869.LE)),
    MOJANG((class05946<class00412>)class04444.c, new class06584((class07310)class06570.be));

    private final class05946<class00412> pattern;
    private final String[] recipePattern = new String[3];
    private class06584 baseStack = class06584.E;

    private BannerPattern_1_13_2(class05946<class00412> class059462, class06584 class065842) {
        this(class059462);
        this.baseStack = class065842;
    }

    private BannerPattern_1_13_2(class05946<class00412> class059462, String string2, String string3, String string4) {
        this(class059462);
        this.recipePattern[0] = string2;
        this.recipePattern[1] = string3;
        this.recipePattern[2] = string4;
    }

    private BannerPattern_1_13_2(class05946<class00412> class059462) {
        this.pattern = class059462;
    }

    public class05946<class00412> getKey() {
        return this.pattern;
    }

    public boolean hasBaseStack() {
        return !this.baseStack.R();
    }

    public String[] getRecipePattern() {
        return this.recipePattern;
    }

    public boolean isCraftable() {
        return !this.baseStack.R() || this.recipePattern[0] != null;
    }

    public class06584 getBaseStack() {
        return this.baseStack;
    }
}

