/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11380
 *  Nursultan.class11385
 *  Nursultan.class11512
 *  Nursultan.class11523
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11689
 *  Nursultan.class11704
 *  Nursultan.class11720
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11801
 *  Nursultan.class11899
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class08687
 */
package Nursultan;

import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11380;
import Nursultan.class11385;
import Nursultan.class11512;
import Nursultan.class11523;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11689;
import Nursultan.class11704;
import Nursultan.class11720;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11801;
import Nursultan.class11899;
import java.util.List;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class08687;

@class11080(L="NoDelay", y=class11072.PLAYER, N=class11106.BASE)
public class NoDelay
extends class11067 {
    public Object L_0;
    public Object L_1;

    public NoDelay() {
        this.b();
        this.L_0 = new class11720(this, "block-breaking", false);
        this.L_1 = class11524.y((class11512)this, (String)"delays", (class11535[])new class11704[]{new class11689(this, "right-click", false, object -> {
            if (object instanceof class11380 && (class04453)((class06202)this.y_0).T_4 != null) {
                ((class06202)this.y_0).M_4 = 0;
            }
        }), new class11689(this, "jump-delay", true, object -> {
            if (object instanceof class11385) {
                class11385 class113852 = (class11385)object;
                if ((class04453)((class06202)this.y_0).T_4 != null && class113852.L() && ((class04453)((class06202)this.y_0).T_4).fields_17fa3311b0e9d3e9b883d09222919bf5a_1 == 0 && class11899.N((class08687)class113852.z(), (int)0).N() > 1) {
                    class113852.i(false);
                }
            }
        }), (class11720)this.L_0});
        ((class11523)this.L_1).L().forEach(class117042 -> {
            if (class117042 instanceof class11801) {
                ((class11801)class117042).N((Object)this);
            }
        });
    }

    private void b() {
    }

    @class11782
    public void N(class11380 class113802) {
        this.b();
        ((List)((class11523)this.L_1).i()).forEach(class117042 -> class117042.y((Object)class113802));
    }

    @class11782(y=class11777.AFTER_ALL)
    public void N(class11385 class113852) {
        this.b();
        ((List)((class11523)this.L_1).i()).forEach(class117042 -> class117042.y((Object)class113852));
    }
}

