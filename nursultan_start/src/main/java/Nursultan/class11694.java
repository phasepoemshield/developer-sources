/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AutoTotem
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  minecraft.class01128
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07078
 *  minecraft.class07517
 */
package Nursultan;

import Nursultan.AutoTotem;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11697;
import java.util.function.Predicate;
import minecraft.class01128;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07078;
import minecraft.class07517;

public class class11694
extends class11697 {
    public Object N_0;

    private void M() {
    }

    public class11694(String string, boolean bl) {
        super(string, bl);
        this.M();
    }

    private Predicate<class07517> u() {
        return class075172 -> {
            class06889 class068892 = class075172.method_18798();
            if (class068892.B() == 0.0) {
                return false;
            }
            class06889 class068893 = ((class04453)((class06202)this.y_0).T_4).method_73189().u(class075172.method_73189()).u();
            return class068892.u().y(class068893) > 0.5 && !class075172.u && class075172.R == 0;
        };
    }

    @Override
    public boolean N() {
        this.M();
        return !((class03448)((class06202)this.y_0).T_3).method_18023((class01128)class07078.yo, ((class04453)((class06202)this.y_0).T_4).method_5829().M((double)((Float)((class11504)this.N_0).i()).floatValue()), this.u()).isEmpty();
    }

    @Override
    public void N(AutoTotem autoTotem) {
        this.M();
        this.N_0 = (class11504)class11524.N((class11512)autoTotem, (String)"distance-to-trident", (float)5.0f, (float)5.0f, (float)40.0f, (float)1.0f).N(class115362 -> this.U());
    }
}

