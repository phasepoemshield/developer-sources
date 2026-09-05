/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00764
 *  minecraft.class00767
 *  minecraft.class00784
 *  minecraft.class00789
 *  minecraft.class00791
 *  minecraft.class00818
 *  minecraft.class00826
 *  minecraft.class00837
 *  minecraft.class00843
 *  minecraft.class00869
 *  minecraft.class01226
 *  minecraft.class01894
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class02026
 *  minecraft.class02055
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class03659
 *  minecraft.class03696
 *  minecraft.class03711
 *  minecraft.class03741
 *  minecraft.class04227
 *  minecraft.class04433
 *  minecraft.class05946
 *  minecraft.class06570
 *  minecraft.class07296
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07682
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00764;
import minecraft.class00767;
import minecraft.class00784;
import minecraft.class00789;
import minecraft.class00791;
import minecraft.class00818;
import minecraft.class00826;
import minecraft.class00837;
import minecraft.class00843;
import minecraft.class00869;
import minecraft.class01226;
import minecraft.class01894;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class02026;
import minecraft.class02055;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class03659;
import minecraft.class03696;
import minecraft.class03711;
import minecraft.class03741;
import minecraft.class04227;
import minecraft.class04433;
import minecraft.class05946;
import minecraft.class06570;
import minecraft.class07165;
import minecraft.class07296;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07682;

public class class07128
implements class02026 {
    public void N(class01929 class019292, Consumer<class03711> consumer) {
        class01921 class019212 = class019292.y(class04227.F);
        class03711 class037112 = class07165.N().N((class07310)class00869.Z, (class00392)class00392.L((String)"advancements.story.root.title"), (class00392)class00392.L((String)"advancements.story.root.description"), class01894.y((String)"gui/advancements/backgrounds/stone"), class07296.field_1254, false, false, false).N("crafting_table", class00843.N((class07310[])new class07310[]{class00869.LD})).N(consumer, "story/root");
        class03711 class037113 = class07165.N().N(class037112).N((class07310)class06570.Ts, (class00392)class00392.L((String)"advancements.story.mine_stone.title"), (class00392)class00392.L((String)"advancements.story.mine_stone.description"), null, class07296.field_1254, true, true, false).N("get_stone", class00843.N((class00837[])new class00837[]{class00837.N().N((class02055)class019212, class01226.yG)})).N(consumer, "story/mine_stone");
        class03711 class037114 = class07165.N().N(class037113).N((class07310)class06570.Tw, (class00392)class00392.L((String)"advancements.story.upgrade_tools.title"), (class00392)class00392.L((String)"advancements.story.upgrade_tools.description"), null, class07296.field_1254, true, true, false).N("stone_pickaxe", class00843.N((class07310[])new class07310[]{class06570.Tw})).N(consumer, "story/upgrade_tools");
        class03711 class037115 = class07165.N().N(class037114).N((class07310)class06570.TM, (class00392)class00392.L((String)"advancements.story.smelt_iron.title"), (class00392)class00392.L((String)"advancements.story.smelt_iron.description"), null, class07296.field_1254, true, true, false).N("iron", class00843.N((class07310[])new class07310[]{class06570.TM})).N(consumer, "story/smelt_iron");
        class03711 class037116 = class07165.N().N(class037115).N((class07310)class06570.TK, (class00392)class00392.L((String)"advancements.story.iron_tools.title"), (class00392)class00392.L((String)"advancements.story.iron_tools.description"), null, class07296.field_1254, true, true, false).N("iron_pickaxe", class00843.N((class07310[])new class07310[]{class06570.TK})).N(consumer, "story/iron_tools");
        class03711 class037117 = class07165.N().N(class037116).N((class07310)class06570.TN, (class00392)class00392.L((String)"advancements.story.mine_diamond.title"), (class00392)class00392.L((String)"advancements.story.mine_diamond.description"), null, class07296.field_1254, true, true, false).N("diamond", class00843.N((class07310[])new class07310[]{class06570.TN})).N(consumer, "story/mine_diamond");
        class03711 class037118 = class07165.N().N(class037115).N((class07310)class06570.jW, (class00392)class00392.L((String)"advancements.story.lava_bucket.title"), (class00392)class00392.L((String)"advancements.story.lava_bucket.description"), null, class07296.field_1254, true, true, false).N("lava_bucket", class00843.N((class07310[])new class07310[]{class06570.jW})).N(consumer, "story/lava_bucket");
        class03711 class037119 = class07165.N().N(class037115).N((class07310)class06570.bb, (class00392)class00392.L((String)"advancements.story.obtain_armor.title"), (class00392)class00392.L((String)"advancements.story.obtain_armor.description"), null, class07296.field_1254, true, true, false).N(class03741.y).N("iron_helmet", class00843.N((class07310[])new class07310[]{class06570.bT})).N("iron_chestplate", class00843.N((class07310[])new class07310[]{class06570.bb})).N("iron_leggings", class00843.N((class07310[])new class07310[]{class06570.bj})).N("iron_boots", class00843.N((class07310[])new class07310[]{class06570.bv})).N(consumer, "story/obtain_armor");
        class07165.N().N(class037117).N((class07310)class06570.Gq, (class00392)class00392.L((String)"advancements.story.enchant_item.title"), (class00392)class00392.L((String)"advancements.story.enchant_item.description"), null, class07296.field_1254, true, true, false).N("enchanted_item", class00791.y()).N(consumer, "story/enchant_item");
        class03711 class0371110 = class07165.N().N(class037118).N((class07310)class00869.LV, (class00392)class00392.L((String)"advancements.story.form_obsidian.title"), (class00392)class00392.L((String)"advancements.story.form_obsidian.description"), null, class07296.field_1254, true, true, false).N("obsidian", class00843.N((class07310[])new class07310[]{class00869.LV})).N(consumer, "story/form_obsidian");
        class07165.N().N(class037119).N((class07310)class06570.lo, (class00392)class00392.L((String)"advancements.story.deflect_arrow.title"), (class00392)class00392.L((String)"advancements.story.deflect_arrow.description"), null, class07296.field_1254, true, true, false).N("deflected_projectile", class00826.N((class00764)class00764.N().N(class00789.N().N(class03659.N((class03530)class03696.z))).N(Boolean.valueOf(true)))).N(consumer, "story/deflect_arrow");
        class07165.N().N(class037117).N((class07310)class06570.bt, (class00392)class00392.L((String)"advancements.story.shiny_gear.title"), (class00392)class00392.L((String)"advancements.story.shiny_gear.description"), null, class07296.field_1254, true, true, false).N(class03741.y).N("diamond_helmet", class00843.N((class07310[])new class07310[]{class06570.bn})).N("diamond_chestplate", class00843.N((class07310[])new class07310[]{class06570.bt})).N("diamond_leggings", class00843.N((class07310[])new class07310[]{class06570.bG})).N("diamond_boots", class00843.N((class07310[])new class07310[]{class06570.bl})).N(consumer, "story/shiny_gear");
        class03711 class0371111 = class07165.N().N(class0371110).N((class07310)class06570.sf, (class00392)class00392.L((String)"advancements.story.enter_the_nether.title"), (class00392)class00392.L((String)"advancements.story.enter_the_nether.description"), null, class07296.field_1254, true, true, false).N("entered_nether", class00767.N((class05946)class07299.field_25180)).N(consumer, "story/enter_the_nether");
        class07165.N().N(class0371111).N((class07310)class06570.bV, (class00392)class00392.L((String)"advancements.story.cure_zombie_villager.title"), (class00392)class00392.L((String)"advancements.story.cure_zombie_villager.description"), null, class07296.field_1249, true, true, false).N("cured_zombie", class00784.y()).N(consumer, "story/cure_zombie_villager");
        class03711 class0371112 = class07165.N().N(class0371111).N((class07310)class06570.nG, (class00392)class00392.L((String)"advancements.story.follow_ender_eye.title"), (class00392)class00392.L((String)"advancements.story.follow_ender_eye.description"), null, class07296.field_1254, true, true, false).N("in_stronghold", class07682.N((class00818)class00818.y((class03556)class019292.y(class04227.yj).y(class04433.U)))).N(consumer, "story/follow_ender_eye");
        class07165.N().N(class0371112).N((class07310)class00869.MP, (class00392)class00392.L((String)"advancements.story.enter_the_end.title"), (class00392)class00392.L((String)"advancements.story.enter_the_end.description"), null, class07296.field_1254, true, true, false).N("entered_end", class00767.N((class05946)class07299.field_25181)).N(consumer, "story/enter_the_end");
    }
}

