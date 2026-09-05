/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10957
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11512
 *  Nursultan.class11517
 *  Nursultan.class11523
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11677
 *  Nursultan.class11700
 *  Nursultan.class11707
 *  Nursultan.class11708
 *  Nursultan.class11710
 *  Nursultan.class11716
 *  Nursultan.class11719
 *  Nursultan.class11782
 *  Nursultan.class11796
 *  Nursultan.class11801
 *  Nursultan.class11807
 *  Nursultan.class11815
 *  Nursultan.class11822
 *  minecraft.class04453
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class10957;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11512;
import Nursultan.class11517;
import Nursultan.class11523;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11677;
import Nursultan.class11700;
import Nursultan.class11707;
import Nursultan.class11708;
import Nursultan.class11710;
import Nursultan.class11716;
import Nursultan.class11719;
import Nursultan.class11782;
import Nursultan.class11796;
import Nursultan.class11801;
import Nursultan.class11807;
import Nursultan.class11815;
import Nursultan.class11822;
import java.util.Iterator;
import java.util.List;
import minecraft.class04453;
import minecraft.class06202;

@class11080(L="AutoLeave", y=class11072.PLAYER, N=class11106.AUTO)
public class AutoLeave
extends class11067 {
    public Object L_0;
    public Object L_1;

    public AutoLeave() {
        class11801 class118012;
        this.j();
        this.L_0 = class11524.N((class11512)this, (String)"action", (class11535[])new class11535[]{new class11710(this, "hub", "hub", true), new class11710(this, "spawn", "spawn", false), new class11716(this, "custom-command", false), new class11677("disconnect", false)});
        for (class11535 class115352 : ((class11517)this.L_0).L()) {
            if (!(class115352 instanceof class11801)) continue;
            class118012 = (class11801)class115352;
            class118012.N((Object)this);
        }
        this.L_1 = class11524.y((class11512)this, (String)"triggers", (class11535[])new class11807[]{new class11719(this, "player-nearby", true), new class11700(this, "health", false), new class11707(this, "was-in-pvp", false)});
        for (class11535 class115352 : ((class11523)this.L_1).L()) {
            if (!(class115352 instanceof class11801)) continue;
            class118012 = (class11801)class115352;
            class118012.N((Object)this);
        }
    }

    public void m() {
        this.j();
        if (((class11815)((class11796)((class11822)((class04453)((class06202)this.y_0).T_4)).dataManager()).y().N()).N()) {
            return;
        }
        ((class11708)((class11535)((class11517)this.L_0).i())).N();
        this.N(false);
    }

    private void j() {
    }

    @class11782
    public void N(class10957 class109572) {
        this.j();
        Iterator iterator = ((List)((class11523)this.L_1).i()).iterator();
        while (iterator.hasNext()) {
            ((class11807)iterator.next()).y((Object)class109572);
        }
    }
}

