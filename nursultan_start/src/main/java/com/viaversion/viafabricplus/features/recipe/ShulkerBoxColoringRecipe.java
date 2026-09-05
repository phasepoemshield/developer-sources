/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class01929
 *  minecraft.class02903
 *  minecraft.class02950
 *  minecraft.class03762
 *  minecraft.class06514
 *  minecraft.class06520
 *  minecraft.class06522
 *  minecraft.class06559
 *  minecraft.class06563
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07027
 *  minecraft.class07299
 *  minecraft.class07310
 */
package com.viaversion.viafabricplus.features.recipe;

import minecraft.class00891;
import minecraft.class01929;
import minecraft.class02903;
import minecraft.class02950;
import minecraft.class03762;
import minecraft.class06514;
import minecraft.class06520;
import minecraft.class06522;
import minecraft.class06559;
import minecraft.class06563;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07027;
import minecraft.class07299;
import minecraft.class07310;

public final class ShulkerBoxColoringRecipe
extends class06520 {
    public static final class06514<ShulkerBoxColoringRecipe> SERIALIZER = new class06522(ShulkerBoxColoringRecipe::new);

    public ShulkerBoxColoringRecipe(class03762 class037622) {
        super(class037622);
    }

    public boolean matches(class02903 class029032, class07299 class072992) {
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < class029032.N(); ++i) {
            class06584 class065842 = class029032.N(i);
            if (class065842.R()) continue;
            if (class00891.N((class06581)class065842.B()) instanceof class07027) {
                ++n;
            } else {
                if (!(class065842.B() instanceof class06559)) {
                    return false;
                }
                ++n2;
            }
            if (n2 <= 1 && n <= 1) continue;
            return false;
        }
        return n == 1 && n2 == 1;
    }

    public class06514<ShulkerBoxColoringRecipe> method_8119() {
        return SERIALIZER;
    }

    public /* synthetic */ boolean method_8115(class02950 class029502, class07299 class072992) {
        return this.matches((class02903)class029502, class072992);
    }

    public /* synthetic */ class06584 method_8116(class02950 class029502, class01929 class019292) {
        return this.assemble((class02903)class029502, class019292);
    }

    public class06584 assemble(class02903 class029032, class01929 class019292) {
        class06584 class065842 = class06584.E;
        class06559 class065592 = (class06559)class06570.vW;
        for (int i = 0; i < class029032.N(); ++i) {
            class06584 class065843 = class029032.N(i);
            if (class065843.R()) continue;
            class06581 class065812 = class065843.B();
            if (class00891.N((class06581)class065812) instanceof class07027) {
                class065842 = class065843;
                continue;
            }
            if (!(class065812 instanceof class06559)) continue;
            class065592 = (class06559)class065812;
        }
        return class065842.N((class07310)class07027.N((class06563)class065592.N()), 1);
    }
}

