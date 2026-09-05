/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class02827
 *  minecraft.class02835
 *  minecraft.class02903
 *  minecraft.class03762
 *  minecraft.class06510
 *  minecraft.class06514
 *  minecraft.class06520
 *  minecraft.class06559
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07299
 *  minecraft.class07310
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;
import minecraft.class01929;
import minecraft.class02484;
import minecraft.class02827;
import minecraft.class02835;
import minecraft.class02903;
import minecraft.class03762;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class06520;
import minecraft.class06559;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07299;
import minecraft.class07310;

public class class06503
extends class06520 {
    private static final Map<class06581, class02835> N = Map.of(class06570.GZ, class02835.field_7977, class06570.Tr, class02835.field_7970, class06570.nW, class02835.field_7973, class06570.Gl, class02835.field_7974, class06570.Gd, class02835.field_7974, class06570.GY, class02835.field_7974, class06570.Gw, class02835.field_7974, class06570.GQ, class02835.field_7974, class06570.Gk, class02835.field_7974, class06570.GO, class02835.field_7974);
    private static final class06510 y = class06510.method_8101((class07310)class06570.TN);
    private static final class06510 L = class06510.method_8101((class07310)class06570.vL);
    private static final class06510 u = class06510.method_8101((class07310)class06570.bN);

    public class06503(class03762 class037622) {
        super(class037622);
    }

    public class06584 method_8116(class02903 class029032, class01929 class019292) {
        class02835 class028352 = class02835.field_7976;
        boolean bl = false;
        boolean bl2 = false;
        IntArrayList intArrayList = new IntArrayList();
        for (int i = 0; i < class029032.N(); ++i) {
            class06584 class065842 = class029032.N(i);
            if (class065842.R()) continue;
            class02835 class028353 = N.get(class065842.B());
            if (class028353 != null) {
                class028352 = class028353;
                continue;
            }
            if (L.method_8093(class065842)) {
                bl = true;
                continue;
            }
            if (y.method_8093(class065842)) {
                bl2 = true;
                continue;
            }
            class06581 class065812 = class065842.B();
            if (!(class065812 instanceof class06559)) continue;
            class06559 class065592 = (class06559)class065812;
            intArrayList.add(class065592.N().i());
        }
        class06584 class065843 = new class06584((class07310)class06570.Go);
        class065843.N(class02484.Ns, (Object)new class02827(class028352, (IntList)intArrayList, IntList.of(), bl2, bl));
        return class065843;
    }

    public boolean method_8115(class02903 class029032, class07299 class072992) {
        if (class029032.i() < 2) {
            return false;
        }
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        for (int i = 0; i < class029032.N(); ++i) {
            class06584 class065842 = class029032.N(i);
            if (class065842.R()) continue;
            if (N.containsKey(class065842.B())) {
                if (bl3) {
                    return false;
                }
                bl3 = true;
                continue;
            }
            if (L.method_8093(class065842)) {
                if (bl5) {
                    return false;
                }
                bl5 = true;
                continue;
            }
            if (y.method_8093(class065842)) {
                if (bl4) {
                    return false;
                }
                bl4 = true;
                continue;
            }
            if (u.method_8093(class065842)) {
                if (bl) {
                    return false;
                }
                bl = true;
                continue;
            }
            if (class065842.B() instanceof class06559) {
                bl2 = true;
                continue;
            }
            return false;
        }
        return bl && bl2;
    }

    public class06514<class06503> method_8119() {
        return class06514.Z;
    }
}

