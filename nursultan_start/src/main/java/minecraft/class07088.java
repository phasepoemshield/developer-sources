/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10758
 *  minecraft.class00392
 *  minecraft.class00761
 *  minecraft.class00767
 *  minecraft.class00810
 *  minecraft.class00816
 *  minecraft.class00818
 *  minecraft.class00825
 *  minecraft.class00840
 *  minecraft.class00843
 *  minecraft.class00858
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class02026
 *  minecraft.class02055
 *  minecraft.class03556
 *  minecraft.class03711
 *  minecraft.class04227
 *  minecraft.class04433
 *  minecraft.class05946
 *  minecraft.class06570
 *  minecraft.class07165
 *  minecraft.class07296
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07682
 *  minecraft.class07691
 */
package minecraft;

import Nursultan.class10758;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00761;
import minecraft.class00767;
import minecraft.class00810;
import minecraft.class00816;
import minecraft.class00818;
import minecraft.class00825;
import minecraft.class00840;
import minecraft.class00843;
import minecraft.class00858;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class02026;
import minecraft.class02055;
import minecraft.class03556;
import minecraft.class03711;
import minecraft.class04227;
import minecraft.class04433;
import minecraft.class05946;
import minecraft.class06570;
import minecraft.class07078;
import minecraft.class07165;
import minecraft.class07296;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07682;
import minecraft.class07691;

public class class07088
implements class02026 {
    public void N(class01929 class019292, Consumer<class03711> consumer) {
        class01921 class019212 = class019292.y(class04227.I);
        class03711 class037112 = class07165.N().N((class07310)class00869.MP, (class00392)class00392.L((String)"advancements.end.root.title"), (class00392)class00392.L((String)"advancements.end.root.description"), class01894.y((String)"gui/advancements/backgrounds/end"), class07296.field_1254, false, false, false).N("entered_end", class00767.N((class05946)class07299.field_25181)).N(consumer, "end/root");
        class03711 class037113 = class07165.N().N(class037112).N((class07310)class00869.BI, (class00392)class00392.L((String)"advancements.end.kill_dragon.title"), (class00392)class00392.L((String)"advancements.end.kill_dragon.description"), null, class07296.field_1254, true, true, false).N("killed_dragon", class00825.N((class00810)class00810.N().N((class02055)class019212, class07078.f))).N(consumer, "end/kill_dragon");
        class03711 class037114 = class07165.N().N(class037113).N((class07310)class06570.nz, (class00392)class00392.L((String)"advancements.end.enter_end_gateway.title"), (class00392)class00392.L((String)"advancements.end.enter_end_gateway.description"), null, class07296.field_1254, true, true, false).N("entered_end_gateway", class00858.N((class00891)class00869.EY)).N(consumer, "end/enter_end_gateway");
        class07165.N().N(class037113).N((class07310)class06570.ln, (class00392)class00392.L((String)"advancements.end.respawn_dragon.title"), (class00392)class00392.L((String)"advancements.end.respawn_dragon.description"), null, class07296.field_1249, true, true, false).N("summoned_dragon", class07691.N((class00810)class00810.N().N((class02055)class019212, class07078.f))).N(consumer, "end/respawn_dragon");
        class03711 class037115 = class07165.N().N(class037114).N((class07310)class00869.Ej, (class00392)class00392.L((String)"advancements.end.find_end_city.title"), (class00392)class00392.L((String)"advancements.end.find_end_city.description"), null, class07296.field_1254, true, true, false).N("in_city", class07682.N((class00818)class00818.y((class03556)class019292.y(class04227.yj).y(class04433.T)))).N(consumer, "end/find_end_city");
        class07165.N().N(class037113).N((class07310)class06570.lQ, (class00392)class00392.L((String)"advancements.end.dragon_breath.title"), (class00392)class00392.L((String)"advancements.end.dragon_breath.description"), null, class07296.field_1249, true, true, false).N("dragon_breath", class00843.N((class07310[])new class07310[]{class06570.lQ})).N(consumer, "end/dragon_breath");
        class07165.N().N(class037115).N((class07310)class06570.lp, (class00392)class00392.L((String)"advancements.end.levitate.title"), (class00392)class00392.L((String)"advancements.end.levitate.description"), null, class07296.field_1250, true, true, false).N(class10758.N((int)50)).N("levitated", class00840.N((class00761)class00761.y((class00816)class00816.y((double)50.0)))).N(consumer, "end/levitate");
        class07165.N().N(class037115).N((class07310)class06570.sT, (class00392)class00392.L((String)"advancements.end.elytra.title"), (class00392)class00392.L((String)"advancements.end.elytra.description"), null, class07296.field_1249, true, true, false).N("elytra", class00843.N((class07310[])new class07310[]{class06570.sT})).N(consumer, "end/elytra");
        class07165.N().N(class037113).N((class07310)class00869.Ms, (class00392)class00392.L((String)"advancements.end.dragon_egg.title"), (class00392)class00392.L((String)"advancements.end.dragon_egg.description"), null, class07296.field_1249, true, true, false).N("dragon_egg", class00843.N((class07310[])new class07310[]{class00869.Ms})).N(consumer, "end/dragon_egg");
    }
}

