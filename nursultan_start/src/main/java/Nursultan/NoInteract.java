/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11015
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11357
 *  Nursultan.class11393
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11523
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11714
 *  Nursultan.class11782
 *  Nursultan.class11796
 *  Nursultan.class11815
 *  Nursultan.class11822
 *  Nursultan.class11938
 *  minecraft.class00250
 *  minecraft.class00624
 *  minecraft.class00748
 *  minecraft.class00869
 *  minecraft.class00889
 *  minecraft.class00891
 *  minecraft.class02484
 *  minecraft.class02833
 *  minecraft.class04453
 *  minecraft.class05982
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class07027
 *  minecraft.class07036
 *  minecraft.class07078
 *  minecraft.class07196
 *  minecraft.class07504
 *  minecraft.class07789
 *  minecraft.class07804
 */
package Nursultan;

import Nursultan.AttackAura;
import Nursultan.class11015;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11357;
import Nursultan.class11393;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11523;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11714;
import Nursultan.class11782;
import Nursultan.class11796;
import Nursultan.class11815;
import Nursultan.class11822;
import Nursultan.class11938;
import java.util.Iterator;
import java.util.List;
import minecraft.class00250;
import minecraft.class00624;
import minecraft.class00748;
import minecraft.class00869;
import minecraft.class00889;
import minecraft.class00891;
import minecraft.class02484;
import minecraft.class02833;
import minecraft.class04453;
import minecraft.class05982;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07027;
import minecraft.class07036;
import minecraft.class07078;
import minecraft.class07196;
import minecraft.class07504;
import minecraft.class07789;
import minecraft.class07804;

@class11080(L="NoInteract", y=class11072.PLAYER, N=class11106.BASE)
public class NoInteract
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;

    private void P() {
    }

    public NoInteract() {
        this.P();
        this.L_0 = class11524.N((class11512)this, (String)"aura-only", (boolean)true);
        this.L_1 = class11524.N((class11512)this, (String)"pvp-only", (boolean)true);
        this.L_2 = class11524.N((class11512)this, (String)"dont-place-orbs", (boolean)true);
        this.L_3 = class11524.y((class11512)this, (String)"block-interact", (class11535[])new class11714[]{new class11714(this, "furnace", true, class008912 -> class008912 instanceof class00748), new class11714(this, "signs", true, class008912 -> class008912 instanceof class07036), new class11714(this, "hopper", true, new class00891[]{class00869.Bf}), new class11714(this, "dispenser", true, new class00891[]{class00869.yy}), new class11714(this, "dropper", true, new class00891[]{class00869.Br}), new class11714(this, "shulker", true, class008912 -> class008912 instanceof class07027), new class11714(this, "barrel", true, new class00891[]{class00869.PF}), new class11714(this, "door", true, class008912 -> class008912 instanceof class07196), new class11714(this, "chest", true, class008912 -> class008912 instanceof class05982), new class11714(this, "anvil", true, class008912 -> class008912 instanceof class07804), new class11714(this, "lever", true, new class00891[]{class00869.uD}), new class11714(this, "bed", true, class008912 -> class008912 instanceof class07789), new class11714(this, "note-block", true, new class00891[]{class00869.yR}), new class11714(this, "enchant-tables", true, new class00891[]{class00869.MM}), new class11714(this, "brewing-stands", true, new class00891[]{class00869.MB}), new class11714(this, "button", true, class008912 -> class008912 instanceof class00889), new class11714(this, "trapdoor", true, class008912 -> class008912 instanceof class00624), new class11714(this, "crafting-tables", true, new class00891[]{class00869.LD})});
        this.L_4 = class11524.y((class11512)this, (String)"entity-interact", (class11535[])new class11015[]{new class11015(this, "armor-stand", true, class070492 -> class070492.method_5864() == class07078.B), new class11015(this, "boat", true, class070492 -> class070492 instanceof class00250), new class11015(this, "minecart", true, class070492 -> class070492 instanceof class07504)});
    }

    private boolean s() {
        this.P();
        AttackAura attackAura = class11938.u().C();
        if (!(!((Boolean)((class11507)this.L_0).i()).booleanValue() || attackAura.U() && attackAura.s())) {
            return false;
        }
        return (Boolean)((class11507)this.L_1).i() == false || ((class11815)((class11796)((class11822)((class04453)((class06202)this.y_0).T_4)).dataManager()).y().N()).N();
    }

    @class11782
    public void N(class11357 class113572) {
        this.P();
        if (!this.s()) {
            return;
        }
        ((List)((class11523)this.L_4).i()).forEach(class110152 -> class110152.y((Object)class113572));
    }

    @class11782
    public void N(class11393 class113932) {
        class06584 class065842;
        this.P();
        if (!this.s()) {
            return;
        }
        if (((Boolean)((class11507)this.L_2).i()).booleanValue() && !(class065842 = ((class04453)((class06202)this.y_0).T_4).method_5998(class113932.u())).R() && !((class02833)class065842.y().a_(class02484.b, (Object)class02833.N)).y().isEmpty()) {
            class113932.N();
        }
        boolean bl = !((class04453)((class06202)this.y_0).T_4).method_6047().R() || !((class04453)((class06202)this.y_0).T_4).method_6079().R();
        if (!(((class04453)((class06202)this.y_0).T_4).method_21823() && bl)) {
            Iterator iterator = ((List)((class11523)this.L_3).i()).iterator();
            while (iterator.hasNext()) {
                ((class11714)iterator.next()).y((Object)class113932);
            }
        }
    }
}

