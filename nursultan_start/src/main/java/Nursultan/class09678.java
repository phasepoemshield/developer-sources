/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01463
 *  minecraft.class01488
 *  minecraft.class04453
 *  minecraft.class04655
 *  minecraft.class05096
 *  minecraft.class05462
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class06937
 *  minecraft.class07482
 *  minecraft.class08844
 */
package Nursultan;

import Nursultan.class09669;
import Nursultan.class09670;
import Nursultan.class09671;
import Nursultan.class09673;
import Nursultan.class09674;
import Nursultan.class09679;
import Nursultan.class09680;
import Nursultan.class09684;
import Nursultan.class09690;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import minecraft.class01463;
import minecraft.class01488;
import minecraft.class04453;
import minecraft.class04655;
import minecraft.class05096;
import minecraft.class05462;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06937;
import minecraft.class07482;
import minecraft.class08844;

public class class09678 {
    public static class09674 N;
    private static class06202 L;
    private static class05096 u;
    private static class09670 i;
    private static boolean R;
    private static class06937 M;
    private static double B;
    private static boolean Z;
    private static boolean z;
    private static boolean U;
    private static boolean E;
    static final /* synthetic */ boolean y;

    public static boolean L(class05096 class050962, double d, double d2, class09690 class096902) {
        class09678.N(class050962);
        if (i == null) {
            return false;
        }
        class06937 class069372 = i.N(d, d2);
        if (class069372 == M) {
            return false;
        }
        class06584 class065842 = ((class07482)((class04453)class09678.L.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M();
        if (z && class096902 == class09690.RIGHT && !U) {
            U = true;
            i.u();
            class09678.N(M, class065842);
        }
        M = class069372;
        if (class069372 == null) {
            return false;
        }
        if (i.y(class069372)) {
            return false;
        }
        if (class096902 == class09690.LEFT) {
            boolean bl;
            if (!Z) {
                return false;
            }
            class06584 class065843 = class069372.i();
            if (class065843.R()) {
                return false;
            }
            boolean bl2 = bl = class04655.N((class08844)L.Nt(), (int)340) || class04655.N((class08844)L.Nt(), (int)344);
            if (class065842.R()) {
                if (!class09678.N.L || !bl) {
                    return false;
                }
                i.N(class069372, class09690.LEFT, true);
            } else {
                if (!class09678.N.y) {
                    return false;
                }
                if (!class09678.N(class065843, class065842)) {
                    return false;
                }
                if (bl) {
                    i.N(class069372, class09690.LEFT, true);
                } else {
                    if (class065842.c() + class065843.c() > class065842.U()) {
                        return false;
                    }
                    i.N(class069372, class09690.LEFT, false);
                    if (!i.N(class069372)) {
                        i.N(class069372, class09690.LEFT, false);
                    }
                }
            }
        } else if (class096902 == class09690.RIGHT) {
            if (!z) {
                return false;
            }
            class09678.N(class069372, class065842);
        }
        return false;
    }

    public static boolean y(class05096 class050962, double d, double d2, class09690 class096902) {
        class09678.N(class050962);
        if (i == null) {
            return false;
        }
        if (class096902 == class09690.LEFT) {
            Z = false;
        } else if (class096902 == class09690.RIGHT) {
            z = false;
        }
        return false;
    }

    private static class09670 y(class05096 class050962) {
        if (class050962 instanceof class09679) {
            return new class09680((class09679)class050962);
        }
        if (class050962 instanceof class01488) {
            return new class09671((class01488)class050962);
        }
        if (class050962 instanceof class01463) {
            return new class09669((class01463)class050962);
        }
        return null;
    }

    public static boolean N(class05096 class050962, double d, double d2, double d3) {
        class06937 class069372;
        boolean bl;
        class09678.N(class050962);
        if (i == null || R || !class09678.N.u) {
            return false;
        }
        class06937 class069373 = i.N(d, d2);
        if (class069373 == null || i.y(class069373)) {
            return false;
        }
        class06584 class065842 = class069373.i();
        if (class065842.B() instanceof class05462) {
            return false;
        }
        double d4 = class09678.N.M.N(d3);
        if (B != 0.0 && Math.signum(d4) != Math.signum(B)) {
            B = 0.0;
        }
        int n = (int)(B += d4);
        B -= (double)n;
        if (n == 0) {
            return true;
        }
        List<class06937> var12 = i.L();
        int n2 = Math.abs(n);
        boolean bl2 = bl = n < 0;
        if (class09678.N.R.L() && class09678.N(class069373, var12)) {
            boolean bl3 = bl = !bl;
        }
        if (class09678.N.R.y()) {
            boolean bl4 = bl = !bl;
        }
        if (class065842.R()) {
            return true;
        }
        class06584 class065843 = ((class07482)((class04453)class09678.L.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M();
        if (i.N(class069373)) {
            if (!class09678.N(class065842, class065843)) {
                return true;
            }
            if (class065843.R()) {
                List<class06937> var16;
                if (!bl) {
                    return true;
                }
                while (n2-- > 0 && (var16 = class09678.N(var12, class069373, class065842.c(), true)) != null) {
                    i.N(class069373, class09690.LEFT, false);
                    for (int i = 0; i < var16.size(); ++i) {
                        class06937 class069374 = var16.get(i);
                        if (i == var16.size() - 1) {
                            class09678.i.N(class069374, class09690.LEFT, false);
                            continue;
                        }
                        int n3 = class069374.b_(class069374.i()) - class069374.i().c();
                        while (n3-- > 0) {
                            class09678.i.N(class069374, class09690.RIGHT, false);
                        }
                    }
                }
            } else {
                while (n2-- > 0) {
                    i.N(class069373, class09690.LEFT, false);
                }
            }
            return true;
        }
        if (!class065843.R() && class09678.N(class065842, class065843)) {
            return true;
        }
        if (bl) {
            if (!class065843.R() && !class069373.N(class065843)) {
                return true;
            }
            n2 = Math.min(n2, class065842.c());
            List<class06937> var16 = class09678.N(var12, class069373, n2, false);
            if (!y && var16 == null) {
                throw new AssertionError();
            }
            if (var16.isEmpty()) {
                return true;
            }
            i.N(class069373, class09690.LEFT, false);
            for (class06937 class069375 : var16) {
                int n4 = class069375.b_(class069375.i()) - class069375.i().c();
                n4 = Math.min(n4, n2);
                n2 -= n4;
                while (n4-- > 0) {
                    i.N(class069375, class09690.RIGHT, false);
                }
            }
            i.N(class069373, class09690.LEFT, false);
            return true;
        }
        int n5 = class069373.b_(class065842) - class065842.c();
        n2 = Math.min(n2, n5);
        while (n2 > 0 && (class069372 = class09678.N(var12, class069373)) != null) {
            int n6 = class069372.i().c();
            if (i.N(class069372)) {
                if (n5 < n6) break;
                n2 = Math.min(n2 - 1, n5 -= n6);
                if (!class065843.R() && !class069373.N(class065843)) break;
                i.N(class069373, class09690.LEFT, false);
                i.N(class069372, class09690.LEFT, false);
                i.N(class069373, class09690.LEFT, false);
                continue;
            }
            int n7 = Math.min(n2, n6);
            n5 -= n7;
            n2 -= n7;
            if (!class065843.R() && !class069372.N(class065843)) break;
            i.N(class069372, class09690.LEFT, false);
            if (n7 == n6) {
                i.N(class069373, class09690.LEFT, false);
            } else {
                for (int i = 0; i < n7; ++i) {
                    class09678.i.N(class069373, class09690.RIGHT, false);
                }
            }
            i.N(class069372, class09690.LEFT, false);
        }
        return true;
    }

    private static boolean N(class06584 class065842, class06584 class065843) {
        return class065842.R() || class065843.R() || class06584.y((class06584)class065842, (class06584)class065843) && class06584.L((class06584)class065842, (class06584)class065843);
    }

    private static class06937 N(List<class06937> list, class06937 class069372) {
        int n;
        int n2;
        if (class09678.N.i == class09684.FIRST_TO_LAST) {
            var2_2 = 0;
            n2 = list.size();
            n = 1;
        } else {
            var2_2 = list.size() - 1;
            n2 = -1;
            n = -1;
        }
        class06584 class065842 = class069372.i();
        boolean bl = class069372.L != ((class04453)class09678.L.T_4).method_31548();
        for (int i = var2_2; i != n2; i += n) {
            class06584 class065843;
            boolean bl2;
            class06937 class069373 = list.get(i);
            if (class09678.i.y(class069373)) continue;
            boolean bl3 = bl2 = class069373.L == ((class04453)class09678.L.T_4).method_31548();
            if (bl != bl2 || (class065843 = class069373.i()).R() || !class09678.N(class065842, class065843)) continue;
            return class069373;
        }
        return null;
    }

    private static List<class06937> N(List<class06937> list, class06937 class069372, int n, boolean bl) {
        class06937 class069373;
        int n2;
        class06584 class065842 = class069372.i();
        boolean bl2 = class069372.L != ((class04453)class09678.L.T_4).method_31548();
        ArrayList<class06937> arrayList = new ArrayList<class06937>();
        ArrayList<class06937> arrayList2 = new ArrayList<class06937>();
        for (n2 = 0; n2 != list.size() && n > 0; ++n2) {
            boolean bl3;
            class069373 = list.get(n2);
            if (i.y(class069373)) continue;
            boolean bl4 = bl3 = class069373.L == ((class04453)class09678.L.T_4).method_31548();
            if (bl2 != bl3 || i.N(class069373)) continue;
            class06584 class065843 = class069373.i();
            if (class065843.R()) {
                if (!class069373.N(class065842)) continue;
                arrayList2.add(class069373);
                continue;
            }
            if (!class09678.N(class065842, class065843) || class065843.c() >= class069373.b_(class065843)) continue;
            arrayList.add(class069373);
            n -= Math.min(n, class069373.b_(class065843) - class065843.c());
        }
        for (n2 = 0; n2 != arrayList2.size() && n > 0; n -= Math.min(n, class069373.y()), ++n2) {
            class069373 = (class06937)arrayList2.get(n2);
            arrayList.add(class069373);
        }
        if (bl && n > 0) {
            return null;
        }
        return arrayList;
    }

    public static boolean N(class05096 class050962, double d, double d2, class09690 class096902) {
        class09678.N(class050962);
        if (i == null) {
            return false;
        }
        M = i.N(d, d2);
        class06584 class065842 = ((class07482)((class04453)class09678.L.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M();
        if (class096902 == class09690.LEFT) {
            if (class065842.R()) {
                Z = true;
            }
        } else if (class096902 == class09690.RIGHT) {
            if (class065842.R()) {
                return false;
            }
            if (!class09678.N.N) {
                return false;
            }
            z = true;
            U = false;
        }
        return false;
    }

    private static void N(class06937 class069372, class06584 class065842) {
        if (class069372 == null) {
            return;
        }
        if (class065842.R()) {
            return;
        }
        if (i.y(class069372)) {
            return;
        }
        if (i.N(class069372)) {
            return;
        }
        if (!(class065842.B() instanceof class05462)) {
            class06584 class065843 = class069372.i();
            if (!class09678.N(class065843, class065842)) {
                return;
            }
            if (class065843.c() == class069372.b_(class065843)) {
                return;
            }
        }
        i.N(class069372, class09690.RIGHT, false);
    }

    private static void N(class05096 class050962) {
        if (class050962 == u) {
            return;
        }
        u = class050962;
        i = null;
        M = null;
        B = 0.0;
        Z = false;
        z = false;
        U = false;
        if (u != null) {
            class09673.y("You have just opened a " + u.getClass().getName() + ".");
            N.N();
            i = class09678.y(u);
            if (i == null) {
                class09673.y("No valid handler found; Mouse Tweaks is disabled.");
            } else {
                boolean bl = i.N();
                R = i.y();
                class09673.y("Handler: " + i.getClass().getSimpleName() + "; Mouse Tweaks is " + (bl ? "disabled" : "enabled") + "; wheel tweak is " + (R ? "disabled" : "enabled") + ".");
                if (bl) {
                    i = null;
                }
            }
        }
    }

    public static void N() {
        class09673.N("Main.initialize()");
        if (E) {
            return;
        }
        L = class06202.Nq();
        N = new class09674(((File)class09678.L.l_1).getAbsolutePath() + File.separator + "config" + File.separator + "MouseTweaks.cfg");
        N.N();
        class09673.N("Initialized.");
        E = true;
    }

    private static boolean N(class06937 class069372, List<class06937> list) {
        boolean bl = class069372.L == ((class04453)class09678.L.T_4).method_31548();
        int n = 0;
        int n2 = 0;
        for (class06937 class069373 : list) {
            if (class069373.L == ((class04453)class09678.L.T_4).method_31548() == bl) continue;
            if (class069373.R < class069372.R) {
                ++n2;
                continue;
            }
            ++n;
        }
        return n2 > n;
    }
}

