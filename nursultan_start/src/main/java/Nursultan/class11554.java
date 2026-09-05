/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.ClickAction
 *  Nursultan.class09327
 *  Nursultan.class11142
 *  Nursultan.class11303
 *  Nursultan.class11389
 *  Nursultan.class11499
 *  Nursultan.class11504
 *  Nursultan.class11505
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11527
 *  Nursultan.class11791
 *  Nursultan.class11892
 *  Nursultan.class11921
 *  Nursultan.class11938
 *  Nursultan.class12002
 *  minecraft.class04453
 *  minecraft.class06145
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class07049
 *  minecraft.class07089
 */
package Nursultan;

import Nursultan.ClickAction;
import Nursultan.class09327;
import Nursultan.class11142;
import Nursultan.class11303;
import Nursultan.class11389;
import Nursultan.class11499;
import Nursultan.class11504;
import Nursultan.class11505;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11527;
import Nursultan.class11791;
import Nursultan.class11892;
import Nursultan.class11921;
import Nursultan.class11938;
import Nursultan.class12002;
import minecraft.class04453;
import minecraft.class06145;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class07049;
import minecraft.class07089;

public class class11554
extends class11142 {
    public Object y_0;

    public class11554(ClickAction clickAction) {
        super(clickAction, "interaction-hotkey");
        this.N();
        this.y_0 = (class11504)class11524.N((class11512)clickAction, (String)"click-distance-limit", (float)3.0f, (float)2.0f, (float)32.0f, (float)1.0f).N(class115362 -> !((class12002)((class11527)this.N_1).i()).y());
    }

    public void y(class11389 class113892) {
        String string;
        this.N();
        class07089 class070892 = class11892.N((class07049)((class04453)((class06202)this.N_0).T_4), (class11499)class11505.L(), (double)((Float)((class11504)this.y_0).i()).floatValue(), (boolean)false, class11791.B().and(class11791.N()));
        if (!(class070892 instanceof class06145)) {
            return;
        }
        class06145 class061452 = (class06145)class070892;
        String string2 = class061452.L().method_5820();
        class09327 class093272 = class11938.t();
        if (class093272.N(string2, System.currentTimeMillis())) {
            string = "friend.added";
        } else {
            string = "friend.removed";
            class093272.y(string2);
        }
        class11303.y((Object)class11921.N((String)string, (Object[])new Object[]{String.valueOf(class06541.field_1068) + string2 + String.valueOf(class06541.field_1080)}).N(class06541.field_1080));
    }

    private void N() {
    }
}

