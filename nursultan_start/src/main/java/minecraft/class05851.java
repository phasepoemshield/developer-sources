/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01712
 *  minecraft.class02957
 *  minecraft.class02995
 *  minecraft.class03767
 *  minecraft.class03794
 *  minecraft.class04206
 *  minecraft.class04974
 *  minecraft.class05262
 *  minecraft.class05670
 *  minecraft.class06085
 *  minecraft.class06096
 *  minecraft.class06146
 *  minecraft.class06231
 *  minecraft.class06922
 *  minecraft.class06951
 *  minecraft.class06952
 *  minecraft.class07478
 *  minecraft.class07482
 *  minecraft.class07485
 *  minecraft.class07489
 *  minecraft.class07490
 *  minecraft.class07497
 *  minecraft.class07500
 *  minecraft.class07501
 *  minecraft.class07502
 *  minecraft.class08044
 */
package minecraft;

import minecraft.class00751;
import minecraft.class01712;
import minecraft.class02957;
import minecraft.class02995;
import minecraft.class03767;
import minecraft.class03794;
import minecraft.class04206;
import minecraft.class04974;
import minecraft.class05262;
import minecraft.class05670;
import minecraft.class05837;
import minecraft.class05856;
import minecraft.class06085;
import minecraft.class06096;
import minecraft.class06146;
import minecraft.class06231;
import minecraft.class06922;
import minecraft.class06951;
import minecraft.class06952;
import minecraft.class07478;
import minecraft.class07482;
import minecraft.class07485;
import minecraft.class07489;
import minecraft.class07490;
import minecraft.class07497;
import minecraft.class07500;
import minecraft.class07501;
import minecraft.class07502;
import minecraft.class08044;

public class class05851<T extends class07482>
implements class02995 {
    public static final class05851<class07490> field_18664 = class05851.method_17435("generic_9x1", class07490::N);
    public static final class05851<class07490> field_18665 = class05851.method_17435("generic_9x2", class07490::y);
    public static final class05851<class07490> field_17326 = class05851.method_17435("generic_9x3", class07490::L);
    public static final class05851<class07490> field_18666 = class05851.method_17435("generic_9x4", class07490::u);
    public static final class05851<class07490> field_18667 = class05851.method_17435("generic_9x5", class07490::i);
    public static final class05851<class07490> field_17327 = class05851.method_17435("generic_9x6", class07490::R);
    public static final class05851<class07502> field_17328 = class05851.method_17435("generic_3x3", class07502::new);
    public static final class05851<class01712> field_46790 = class05851.method_17435("crafter_3x3", class01712::new);
    public static final class05851<class07497> field_17329 = class05851.method_17435("anvil", class07497::new);
    public static final class05851<class07501> field_17330 = class05851.method_17435("beacon", class07501::new);
    public static final class05851<class06096> field_17331 = class05851.method_17435("blast_furnace", class06096::new);
    public static final class05851<class07489> field_17332 = class05851.method_17435("brewing_stand", class07489::new);
    public static final class05851<class07485> field_17333 = class05851.method_17435("crafting", class07485::new);
    public static final class05851<class07500> field_17334 = class05851.method_17435("enchantment", class07500::new);
    public static final class05851<class05670> field_17335 = class05851.method_17435("furnace", class05670::new);
    public static final class05851<class05262> field_17336 = class05851.method_17435("grindstone", class05262::new);
    public static final class05851<class07478> field_17337 = class05851.method_17435("hopper", class07478::new);
    public static final class05851<class05856> field_17338 = class05851.method_17435("lectern", (n, class080442) -> new class05856(n));
    public static final class05851<class06951> field_17339 = class05851.method_17435("loom", class06951::new);
    public static final class05851<class06952> field_17340 = class05851.method_17435("merchant", class06952::new);
    public static final class05851<class06922> field_17341 = class05851.method_17435("shulker_box", class06922::new);
    public static final class05851<class04974> field_22484 = class05851.method_17435("smithing", class04974::new);
    public static final class05851<class06085> field_17342 = class05851.method_17435("smoker", class06085::new);
    public static final class05851<class06231> field_17343 = class05851.method_17435("cartography_table", class06231::new);
    public static final class05851<class06146> field_17625 = class05851.method_17435("stonecutter", class06146::new);
    private final class03767 field_41923;
    private final class05837<T> field_17344;

    public class05851(class05837<T> class058372, class03767 class037672) {
        this.field_17344 = class058372;
        this.field_41923 = class037672;
    }

    public T method_17434(int n, class08044 class080442) {
        return this.field_17344.create(n, class080442);
    }

    private static <T extends class07482> class05851<T> method_17435(String string, class05837<T> class058372) {
        return (class05851)class00751.N((class00751)class04206.T, (String)string, new class05851<T>(class058372, class03794.M));
    }

    private static <T extends class07482> class05851<T> method_48387(String string, class05837<T> class058372, class02957 ... class02957Array) {
        return (class05851)class00751.N((class00751)class04206.T, (String)string, new class05851<T>(class058372, class03794.i.N(class02957Array)));
    }

    public class03767 method_45322() {
        return this.field_41923;
    }
}

