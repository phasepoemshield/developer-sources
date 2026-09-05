/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.ClickAction
 *  Nursultan.class11142
 *  Nursultan.class11281
 *  Nursultan.class11297
 *  Nursultan.class11322
 *  Nursultan.class11389
 *  Nursultan.class11907
 *  Nursultan.class11938
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class07050
 *  minecraft.class07510
 */
package Nursultan;

import Nursultan.ClickAction;
import Nursultan.class11142;
import Nursultan.class11281;
import Nursultan.class11297;
import Nursultan.class11322;
import Nursultan.class11389;
import Nursultan.class11907;
import Nursultan.class11938;
import java.util.Comparator;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class07050;
import minecraft.class07510;

public class class11591
extends class11142 {
    public class11591(ClickAction clickAction) {
        super(clickAction, "throw-key");
    }

    static {
        class11591.i();
        class11591.N();
    }

    private static void i() {
    }

    private boolean y() {
        if (((class04453)((class06202)this.N_0).T_4).method_6079().B() == class06570.nz) {
            class11907.N((class07050)class07050.field_5810);
            return true;
        }
        return false;
    }

    public void y(class11389 class113892) {
        class11938.Z().N(() -> {
            if (((class04453)((class06202)this.N_0).T_4).method_7357().N(class06570.nz.E()) || this.y()) {
                return;
            }
            class11281.N((int)class11281.i((class06581)class06570.nz).min(Comparator.comparingInt(class112972 -> class112972.N().I() ? 1 : 0)).map(class11297::y).orElse(-1)).ifPresent(n -> {
                if (class11281.u((int)n)) {
                    class11322.N((int)n);
                    class11907.N((class07050)class07050.field_5808);
                    class11938.Z().y(3, class11322::i);
                } else {
                    this.N(n);
                }
            });
        });
    }

    private static void N() {
    }

    private void N(int n) {
        int n2 = ((class04453)((class06202)this.N_0).T_4).method_31548().N();
        class11938.m().N(0, n, n2, class07510.field_7791).y(class062022 -> {
            class11907.N((class07050)class07050.field_5808);
            class11938.Z().y(4, () -> class11938.m().N(0, n, n2, class07510.field_7791).y());
        }).y();
    }
}

