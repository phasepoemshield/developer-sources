/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AttackAura
 *  Nursultan.class11505
 *  Nursultan.class11517
 *  Nursultan.class11523
 *  Nursultan.class11892
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.AttackAura;
import Nursultan.class11079;
import Nursultan.class11505;
import Nursultan.class11517;
import Nursultan.class11523;
import Nursultan.class11892;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;

public class class11094
implements Predicate<class07049> {
    public Object N_0;

    class11094(AttackAura attackAura) {
        this.y();
        this.N_0 = attackAura;
    }

    static {
        class11094.N();
    }

    private void y() {
    }

    @Override
    public boolean test(class07049 class070492) {
        class06889 class068892;
        if (class070492 == null || class070492.method_73183() != (class03448)AttackAura.y((AttackAura)((AttackAura)this.N_0)).T_3 || !class070492.method_5805() || class070492 == ((class04453)AttackAura.L((AttackAura)((AttackAura)this.N_0)).T_4).method_5854()) {
            return false;
        }
        if (!(class070492 instanceof class07438)) {
            return false;
        }
        class07438 class074382 = (class07438)class070492;
        if (((List)((class11523)((AttackAura)this.N_0).L_1).i()).stream().noneMatch(class118092 -> class118092.test((class07049)class074382))) {
            return false;
        }
        if (!((AttackAura)this.N_0).N(class074382)) {
            return false;
        }
        double d = ((AttackAura)this.N_0).d();
        class06889 class068893 = ((class11079)((Object)((class11517)((AttackAura)this.N_0).L_3).i())).N(class074382, d);
        class06889 class068894 = ((class04453)AttackAura.N((AttackAura)((AttackAura)this.N_0)).T_4).method_33571();
        if (class11892.N((class06889)class068894, (class06889)(class068892 = class11505.N((class06889)class068893).U().L(d).i(class068894)), (class07049)class070492)) {
            return false;
        }
        return ((AttackAura)this.N_0).l() || !((AttackAura)this.N_0).N(class068893, class070492);
    }

    private static void N() {
    }
}

