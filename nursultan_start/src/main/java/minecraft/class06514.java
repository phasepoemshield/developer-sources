/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class01946
 *  minecraft.class02362
 *  minecraft.class03248
 *  minecraft.class03259
 *  minecraft.class03268
 *  minecraft.class03280
 *  minecraft.class04206
 *  minecraft.class04247
 *  minecraft.class05636
 *  minecraft.class05641
 *  minecraft.class05654
 *  minecraft.class05721
 *  minecraft.class05869
 *  minecraft.class06154
 *  minecraft.class06156
 *  minecraft.class06487
 *  minecraft.class06489
 *  minecraft.class06490
 *  minecraft.class06491
 *  minecraft.class06496
 *  minecraft.class06498
 *  minecraft.class06503
 *  minecraft.class07283
 *  minecraft.class07292
 *  minecraft.class07294
 *  minecraft.class07298
 *  minecraft.class07325
 *  minecraft.class07329
 *  minecraft.class08686
 *  minecraft.class08690
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class01946;
import minecraft.class02362;
import minecraft.class03248;
import minecraft.class03259;
import minecraft.class03268;
import minecraft.class03280;
import minecraft.class04206;
import minecraft.class04247;
import minecraft.class05636;
import minecraft.class05641;
import minecraft.class05654;
import minecraft.class05721;
import minecraft.class05869;
import minecraft.class06154;
import minecraft.class06156;
import minecraft.class06487;
import minecraft.class06489;
import minecraft.class06490;
import minecraft.class06491;
import minecraft.class06496;
import minecraft.class06498;
import minecraft.class06503;
import minecraft.class06512;
import minecraft.class06521;
import minecraft.class06522;
import minecraft.class06523;
import minecraft.class07283;
import minecraft.class07292;
import minecraft.class07294;
import minecraft.class07298;
import minecraft.class07325;
import minecraft.class07329;
import minecraft.class08686;
import minecraft.class08690;

public interface class06514<T extends class06521<?>> {
    public static final class06514<class07329> y = class06514.N("crafting_shaped", new class07292());
    public static final class06514<class06523> L = class06514.N("crafting_shapeless", new class07294());
    public static final class06514<class06496> u = class06514.N("crafting_special_armordye", new class06522(class06496::new));
    public static final class06514<class06490> i = class06514.N("crafting_special_bookcloning", new class06522(class06490::new));
    public static final class06514<class06489> R = class06514.N("crafting_special_mapcloning", new class06522(class06489::new));
    public static final class06514<class06487> M = class06514.N("crafting_special_mapextending", new class06522(class06487::new));
    public static final class06514<class06491> B = class06514.N("crafting_special_firework_rocket", new class06522(class06491::new));
    public static final class06514<class06503> Z = class06514.N("crafting_special_firework_star", new class06522(class06503::new));
    public static final class06514<class06512> z = class06514.N("crafting_special_firework_star_fade", new class06522(class06512::new));
    public static final class06514<class07283> U = class06514.N("crafting_special_tippedarrow", new class06522(class07283::new));
    public static final class06514<class06498> E = class06514.N("crafting_special_bannerduplicate", new class06522(class06498::new));
    public static final class06514<class07325> W = class06514.N("crafting_special_shielddecoration", new class06522(class07325::new));
    public static final class06514<class08690> m = class06514.N("crafting_transmute", new class08686());
    public static final class06514<class05721> P = class06514.N("crafting_special_repairitem", new class06522(class05721::new));
    public static final class06514<class05654> s = class06514.N("smelting", new class07298(class05654::new, 200));
    public static final class06514<class05641> T = class06514.N("blasting", new class07298(class05641::new, 100));
    public static final class06514<class05636> b = class06514.N("smoking", new class07298(class05636::new, 100));
    public static final class06514<class05869> j = class06514.N("campfire_cooking", new class07298(class05869::new, 100));
    public static final class06514<class06156> v = class06514.N("stonecutting", new class06154(class06156::new));
    public static final class06514<class03280> n = class06514.N("smithing_transform", new class03248());
    public static final class06514<class03259> t = class06514.N("smithing_trim", new class03268());
    public static final class06514<class01946> G = class06514.N("crafting_decorated_pot", new class06522(class01946::new));

    @Deprecated
    public class02362<class04247, T> y();

    public MapCodec<T> N();

    public static <S extends class06514<T>, T extends class06521<?>> S N(String string, S s) {
        return (S)((class06514)class00751.N((class00751)class04206.j, (String)string, s));
    }
}

