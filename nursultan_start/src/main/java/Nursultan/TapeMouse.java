/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11154
 *  Nursultan.class11380
 *  Nursultan.class11512
 *  Nursultan.class11523
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  minecraft.class04453
 *  minecraft.class05096
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11154;
import Nursultan.class11380;
import Nursultan.class11512;
import Nursultan.class11523;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11777;
import Nursultan.class11782;
import java.util.List;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class06202;

@class11080(L="TapeMouse", y=class11072.COMBAT, N=class11106.TOOLS)
public class TapeMouse
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;

    private void P() {
    }

    public TapeMouse() {
        this.P();
        this.L_0 = new class11154("left-mouse", true, "left-mouse-delay-sec", () -> ((class06202)((class06202)this.y_0)).NF());
        this.L_1 = new class11154("right-mouse", false, "right-mouse-delay-sec", () -> ((class06202)((class06202)this.y_0)).yn());
        this.L_2 = class11524.y((class11512)this, (String)"mouse-buttons", (class11535[])new class11154[]{(class11154)this.L_0, (class11154)this.L_1});
        ((class11523)this.L_2).L().forEach(class111542 -> class111542.N(this));
    }

    @class11782(y=class11777.BEFORE_ALL)
    public void N(class11380 class113802) {
        this.P();
        if ((class04453)((class06202)this.y_0).T_4 == null || ((class04453)((class06202)this.y_0).T_4).method_6115() || (class05096)((class06202)this.y_0).v_3 != null) {
            return;
        }
        ((List)((class11523)this.L_2).i()).forEach(class111542 -> class111542.N(class113802));
    }
}

