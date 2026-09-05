/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09692
 *  Nursultan.class09736
 *  Nursultan.class09743
 *  Nursultan.class09778
 *  Nursultan.class09784
 *  Nursultan.class09785
 *  Nursultan.class09788
 *  Nursultan.class09798
 *  Nursultan.class09804
 *  Nursultan.class09809
 *  Nursultan.class09842
 *  Nursultan.class09860
 *  Nursultan.class09867
 *  Nursultan.class09962
 *  Nursultan.class09965
 *  Nursultan.class09969
 *  Nursultan.class09973
 *  Nursultan.class09975
 *  Nursultan.class09976
 *  Nursultan.class09983
 *  Nursultan.class09991
 *  Nursultan.class09994
 *  Nursultan.class11067
 *  Nursultan.class11838
 *  Nursultan.class11863
 *  Nursultan.class12018
 *  Nursultan.class12020
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09180;
import Nursultan.class09181;
import Nursultan.class09211;
import Nursultan.class09213;
import Nursultan.class09221;
import Nursultan.class09692;
import Nursultan.class09736;
import Nursultan.class09743;
import Nursultan.class09778;
import Nursultan.class09784;
import Nursultan.class09785;
import Nursultan.class09788;
import Nursultan.class09798;
import Nursultan.class09804;
import Nursultan.class09809;
import Nursultan.class09842;
import Nursultan.class09860;
import Nursultan.class09867;
import Nursultan.class09962;
import Nursultan.class09965;
import Nursultan.class09969;
import Nursultan.class09973;
import Nursultan.class09975;
import Nursultan.class09976;
import Nursultan.class09983;
import Nursultan.class09991;
import Nursultan.class09994;
import Nursultan.class11067;
import Nursultan.class11838;
import Nursultan.class11863;
import Nursultan.class12018;
import Nursultan.class12020;
import java.util.List;

public class class09187 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object N_6;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;
    public static Object y_5;
    public static Object y_6;
    public static Object y_7;

    private class09187() {
    }

    static {
        class09187.N();
        class09187.u();
        N_0 = new class09187()::N;
        N_5 = new class11863(260.0f, 30.0f, 1.4f, 0.2f, 4.0f, 0.008333334f);
        float f = ((class11863)N_5).L();
        float f2 = ((class11863)N_5).i();
        float f3 = ((class11863)N_5).M();
        N_6 = new class11863(f, f2, f3, 0.05f, 1.0f, ((class11863)N_5).R());
        y_0 = class09991.N().N(class09692.N((class09994[])new class09994[]{class09994.L((class09743)((class09743)N_5))}));
        y_1 = class09991.N().N(class09962.N((float)100.0f)).N(class09692.N((class09994[])new class09994[]{class09994.W((class09743)((class09743)N_5))})).Z(12.0f).z(1.0f).N(class09975.COLUMN).u(((Integer)class09181.y_1).intValue()).y(((Integer)class09181.y_0).intValue());
        y_2 = class09991.N().N(class09976.SELF);
        y_3 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.y((float)60.0f)).y(class09973.CENTER).u(17.0f).i(17.0f).y().N(class09983.BORDER_BOX).N(new class09965(12.0f, 12.0f, 0.0f, 0.0f)).y(((Integer)class09181.y_3).intValue());
        y_4 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.N()).u(18.0f).i(18.0f).N(class09975.COLUMN).N(class09983.BORDER_BOX).N(class09692.N((class09994[])new class09994[]{class09994.s((class09743)((class09743)N_6))}));
        y_5 = class09991.N().u(24.0f, 24.0f);
        y_6 = class09991.N().u(24.0f, 24.0f);
        y_7 = class09991.N().N(class09969.FLOATING).N(0.0f, 0.0f).u(24.0f, 24.0f).N(class09692.N((class09994[])new class09994[]{class09994.s((class09743)((class09743)N_6)), class09994.L((class09743)((class09743)N_6))}));
    }

    private static void u() {
        N_0 = null;
        N_1 = 1;
        N_2 = 2;
        N_3 = 12;
        N_4 = 24;
        N_5 = null;
        N_6 = null;
        y_0 = null;
        y_1 = null;
        y_2 = null;
        y_3 = null;
        y_4 = null;
        y_5 = null;
        y_6 = null;
        y_7 = null;
    }

    private static class09991 y(boolean bl) {
        return class09991.N((class09991[])new class09991[]{(class09991)y_4, class09991.N().l(bl ? 1.0f : 0.0f)});
    }

    public static int N(int n, boolean bl) {
        int n2 = Math.max(0, n);
        int n3 = n2 * 66 + Math.max(0, n2 - 1);
        int n4 = bl ? n3 : 12;
        return 61 + n4 + 2;
    }

    public static int N(int n) {
        return class09187.N(n, true);
    }

    private static void N() {
    }

    private static void N(class09784 class097842, List<class11067> list, class09809 class098092) {
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            class11067 class110672 = list.get(i);
            class097842.N(new Object[]{class098092.N(class110672.N(), (class09788)class09213.y_1, (Object)class110672), i == n - 1 ? null : class09778.N((class09991)((class09991)class09180.N_2))});
        }
    }

    private static class09991 N(int n, boolean bl, boolean bl2) {
        class09991 class099912 = class09991.N((class09991[])new class09991[]{(class09991)y_1, class09991.N().y(class09962.y((float)class09187.N(n, bl)))});
        return bl2 ? class09991.N((class09991[])new class09991[]{class099912, (class09991)y_2}) : class099912;
    }

    private static class09991 N(boolean bl) {
        return class09991.N((class09991[])new class09991[]{(class09991)y_6, class09991.N().i(-7171438).N(bl)});
    }

    private static class09991 N(boolean bl, class09211 class092112) {
        int n = bl ? class092112.M() : -7171438;
        return class09991.N((class09991[])new class09991[]{(class09991)y_0, class09991.N().i(n), class09221.N(22, class09079.SEMI_BOLD)});
    }

    private class09798 N(class11838 class118382, class09809 class098092) {
        class09211 class092112 = (class09211)class098092.N((class09804)class09211.N_6);
        boolean bl = (Boolean)class118382.L().L();
        class09785 class097852 = class098092.N("renderList", (Object)bl);
        class09785 class097853 = class098092.N("animatingHeight", (Object)false);
        class09785 class097854 = class098092.N("baseIconVisible", (Object)(!bl ? 1 : 0));
        class09785 class097855 = class098092.N("overlayIconVisible", (Object)bl);
        if (bl) {
            if (!((Boolean)class097852.L()).booleanValue()) {
                class097852.N((Object)true);
            }
            if (!((Boolean)class097855.L()).booleanValue()) {
                class097855.N((Object)true);
            }
        } else if (!((Boolean)class097854.L()).booleanValue()) {
            class097854.N((Object)true);
        }
        return class09778.N((class09991)class09187.N(class118382.N().size(), bl, (Boolean)class097853.L()), (T class097844) -> {
            class097844.N("subcategoryCard" + class118382.y().N().N());
            class097844.N(class09867.POINTER_DOWN, class09860::T);
            class097844.N(class09867.TRANSITION_END, class098602 -> {
                if (((class09842)class098602).N() != class09736.HEIGHT) {
                    return;
                }
                class097853.N((Object)false);
                if (!((Boolean)class118382.L().L()).booleanValue()) {
                    class097852.N((Object)false);
                }
            });
            class097844.N_3((class09991)y_3, class097843 -> {
                class097843.N(class12020.N((class12018)class118382.y().N()), class09187.N(bl, class092112));
                class097843.N_3((class09991)y_5, class097842 -> {
                    class097842.N(class09867.POINTER_DOWN, class09860::T);
                    class097842.N_1(class098602 -> {
                        boolean bl = (Boolean)class118382.L().L() == false;
                        class097853.N((Object)true);
                        if (bl) {
                            class097852.N((Object)true);
                            class097855.N((Object)true);
                        } else {
                            class097854.N((Object)true);
                        }
                        class118382.L().N((Object)bl);
                    });
                    class097842.L(class097773 -> {
                        class097773.L("icon:menu/expand");
                        class097773.N(class09187.N((Boolean)class097854.L()));
                        class097842.L(class097772 -> {
                            class097772.L("icon:menu/squeeze");
                            class097772.N(class09187.N(bl, (boolean)((Boolean)class097855.L()), class092112));
                            class097772.N(class09867.TRANSITION_END, class098602 -> {
                                if (((class09842)class098602).N() != class09736.OPACITY) {
                                    return;
                                }
                                if (((Boolean)class118382.L().L()).booleanValue()) {
                                    class097854.N((Object)false);
                                } else {
                                    class097855.N((Object)false);
                                }
                            });
                        });
                    });
                });
            });
            class097844.y((class09991)class09180.N_2);
            if (((Boolean)class097852.L()).booleanValue()) {
                class097844.N_3(class09187.y(bl), class097842 -> class09187.N(class097842, class118382.N(), class098092));
            }
        });
    }

    private static class09991 N(boolean bl, boolean bl2, class09211 class092112) {
        int n = bl ? class092112.M() : -7171438;
        return class09991.N((class09991[])new class09991[]{(class09991)y_7, class09991.N().i(n).l(bl ? 1.0f : 0.0f).N(bl2)});
    }
}

