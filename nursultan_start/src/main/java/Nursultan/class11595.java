/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09181
 *  Nursultan.class09221
 *  Nursultan.class09662
 *  Nursultan.class09743
 *  Nursultan.class09778
 *  Nursultan.class09784
 *  Nursultan.class09785
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09813
 *  Nursultan.class09814
 *  Nursultan.class09844
 *  Nursultan.class09864
 *  Nursultan.class09867
 *  Nursultan.class09962
 *  Nursultan.class09969
 *  Nursultan.class09973
 *  Nursultan.class09975
 *  Nursultan.class09983
 *  Nursultan.class09991
 *  Nursultan.class09994
 *  Nursultan.class11300
 *  Nursultan.class11872
 *  Nursultan.class11938
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09181;
import Nursultan.class09221;
import Nursultan.class09662;
import Nursultan.class09743;
import Nursultan.class09778;
import Nursultan.class09784;
import Nursultan.class09785;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09813;
import Nursultan.class09814;
import Nursultan.class09844;
import Nursultan.class09864;
import Nursultan.class09867;
import Nursultan.class09962;
import Nursultan.class09969;
import Nursultan.class09973;
import Nursultan.class09975;
import Nursultan.class09983;
import Nursultan.class09991;
import Nursultan.class09994;
import Nursultan.class11300;
import Nursultan.class11606;
import Nursultan.class11611;
import Nursultan.class11619;
import Nursultan.class11629;
import Nursultan.class11640;
import Nursultan.class11644;
import Nursultan.class11872;
import Nursultan.class11938;
import java.awt.Color;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.OptionalInt;

public class class11595 {
    private static String[] T;
    private static String[] l;
    private static String[] Ny;
    private static String[] Ni;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object N_6;
    public static Object N_7;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;
    public static Object y_5;
    public static Object y_6;
    public static Object y_7;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public static Object L_4;
    public static Object u_0;
    public static Object u_1;
    public static Object i_0;
    public static Object i_1;
    public static Object i_2;
    public static Object R_0;
    public static Object R_1;
    public static Object R_2;
    public static Object M_0;
    public static Object M_1;
    public static Object M_2;
    public static Object M_3;
    public static Object M_4;

    private static OptionalInt L(String string) {
        String string2 = string.trim();
        if (string2.endsWith(Ni[4])) {
            string2 = string2.substring(0, string2.length() - 1);
        }
        if (string2.isEmpty() || !string2.chars().allMatch(Character::isDigit)) {
            return OptionalInt.empty();
        }
        try {
            return OptionalInt.of(Math.round((float)Math.clamp((long)Integer.parseInt(string2), (int)0, (int)100) * 255.0f / 100.0f));
        }
        catch (NumberFormatException numberFormatException) {
            return OptionalInt.empty();
        }
    }

    private static void L() {
    }

    private static float M(int n) {
        return (float)(248 - n) - 0.0f;
    }

    private static void M() {
    }

    private static boolean Q(String string) {
        if (string.isEmpty() || string.equals(Ni[0])) {
            return true;
        }
        String string2 = string.startsWith(Ni[1]) ? string.substring(1) : string;
        return string2.length() <= 6 && string2.chars().allMatch(class11595::y);
    }

    private class11595() {
    }

    static {
        class11595.y();
        class11595.M();
        class11595.u();
        class11595.B();
        class11595.L();
        class11595.R();
        class11595.N();
        y_0 = new class11595()::N;
        M_3 = new LinkedList();
        M_4 = class09991.N().N(class09962.N()).y(class09962.N()).y(-16119286).N(8.0f).u(((Integer)class09181.y_1).intValue()).v(20.0f).L(class11300.L((int)0, (float)25.0f)).z(1.0f).Z(15.0f).B(8.0f).N(class09975.COLUMN).l(1.0f).N(class09994.s((class09743)((class09743)class11644.N_0))).N(class099912 -> class099912.l(0.0f)).y(class099912 -> class099912.l(0.0f));
        L_0 = class09991.N().u(248.0f, 186.0f).N(class09994.s((class09743)((class09743)class11644.N_0))).N(class099912 -> class099912.l(0.0f)).y(class099912 -> class099912.l(0.0f));
        L_1 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.N()).B(6.0f).N(class09975.COLUMN);
        L_2 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.y((float)14.0f));
        L_3 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.y((float)10.0f)).Z(9999.0f).y(((Integer)class09181.L_1).intValue()).N(class09994.s((class09743)((class09743)class11644.N_0))).N(class099912 -> class099912.l(0.0f)).y(class099912 -> class099912.l(0.0f));
        L_4 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.y((float)10.0f)).Z(9999.0f).y(((Integer)class09181.L_1).intValue()).N(class09994.s((class09743)((class09743)class11644.N_0))).N(class099912 -> class099912.l(0.0f)).y(class099912 -> class099912.l(0.0f));
        R_0 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.N()).B(6.0f).y(class09973.CENTER);
        R_1 = class09991.N().u(32.0f, 32.0f).y(((Integer)class09181.L_1).intValue()).z(1.0f).u(((Integer)class09181.L_2).intValue()).N(class09973.CENTER).y(class09973.CENTER).Z(8.0f);
        R_2 = class09991.N().u(16.0f, 16.0f);
        class09991 class099913 = class09991.N().y(class09962.y((float)32.0f)).y(((Integer)class09181.L_1).intValue()).z(1.0f).u(((Integer)class09181.L_2).intValue()).i(-7171438).N(class09973.CENTER).y(class09973.CENTER).N(class09983.BORDER_BOX).Z(8.0f);
        N_0 = class09991.N((class09991[])new class09991[]{class099913.u(class099912 -> class099912.i(((Integer)class09181.N_0).intValue())), class09221.N((int)14, (class09079)class09079.REGULAR)});
        class09991 class099914 = class09991.N();
        N_1 = class09991.N((class09991[])new class09991[]{(class09991)N_0, class099914.N(class09962.y((float)0.0f, (float)Float.POSITIVE_INFINITY))});
        class09991 class099915 = class09991.N();
        N_2 = class09991.N((class09991[])new class09991[]{(class09991)N_0, class099915.N(class09962.y((float)54.0f))});
        N_3 = class09991.N().N(class09962.N()).y(class09962.y((float)24.0f)).B(8.0f).N(class09975.ROW);
        N_4 = class09991.N().u(24.0f, 24.0f).z(1.0f).u(((Integer)class09181.L_2).intValue()).Z(9999.0f);
        N_5 = class11629.N();
        N_6 = class09991.N().N(class09969.FLOATING).U(-8.0f).u(0.0f, 0.0f);
    }

    private static void B() {
    }

    private static float Z(int n) {
        return (float)class11300.y((int)n) / 255.0f;
    }

    private static OptionalInt Z(String string) {
        String string2 = string.trim();
        if (string2.startsWith(Ni[2])) {
            string2 = string2.substring(1);
        }
        if (string2.length() != 6 || !class11595.Q(string2)) {
            return OptionalInt.empty();
        }
        try {
            return OptionalInt.of(0xFF000000 | Integer.parseInt(string2, 16));
        }
        catch (NumberFormatException numberFormatException) {
            return OptionalInt.empty();
        }
    }

    private static float Z() {
        return 238.0f;
    }

    private static float i() {
        return 176.0f;
    }

    private static String m(int n) {
        return String.format(Ni[5], class11300.u((int)n), class11300.N((int)n), class11300.i((int)n));
    }

    private static void U(int n) {
        ((LinkedList)M_3).removeFirstOccurrence(n);
        ((LinkedList)M_3).addFirst(n);
        while (((LinkedList)M_3).size() > 8) {
            ((LinkedList)M_3).removeLast();
        }
    }

    private static String z(int n) {
        return Math.round((float)class11300.y((int)n) * 100.0f / 255.0f) + "%";
    }

    private static boolean z(String string) {
        String string2 = string.endsWith(Ni[3]) ? string.substring(0, string.length() - 1) : string;
        return string2.isEmpty() || string2.length() <= 3 && string2.chars().allMatch(Character::isDigit);
    }

    private static float u(int n) {
        return Color.RGBtoHSB(class11300.u((int)n), class11300.N((int)n), class11300.i((int)n), null)[0];
    }

    private static void u() {
    }

    private static boolean y(int n) {
        return n >= 48 && n <= 57 || n >= 97 && n <= 102 || n >= 65 && n <= 70;
    }

    private static float y(class11872 class118722) {
        return class118722.L() ? 0.5f : 1.0f;
    }

    private static int y(float f, int n) {
        return class11300.N((int)Color.HSBtoRGB(f, 1.0f, 1.0f), (int)n);
    }

    private static void y() {
    }

    private static void y(class11872 class118722, class09785<Float> class097852, class09785<Float> class097853, class09785<Float> class097854, class09785<String> class097855, class09785<String> class097856, int n) {
        int n2 = class11595.N(class118722, class11300.N((int)n, (int)class11300.y((int)class118722.y())));
        class11595.N(class118722, n2, class097852, class097853, class097854);
        class11595.N(class118722, n2, class097855, class097856);
    }

    private static void N(class11872 class118722, class09785<Float> class097852, class09785<String> class097853, class09785<String> class097854, class09864 class098642) {
        float f = class11595.N(class098642, 14);
        class097852.N((Object)Float.valueOf(f));
        class11595.N(class118722, class11300.N((int)class118722.y(), (int)Math.round(f * 255.0f)), class097853, class097854);
    }

    private static int N(float f, float f2, float f3) {
        return class11300.N((int)Color.HSBtoRGB(f, f2, f3), (int)255);
    }

    private static void N(class11872 class118722, class09785<Float> class097852, class09785<String> class097853, class09785<String> class097854, String string) {
        class11595.L(string).ifPresentOrElse(n -> {
            class097852.N((Object)Float.valueOf((float)n / 255.0f));
            class11595.N(class118722, class11300.N((int)class118722.y(), (int)n), class097853, class097854);
        }, () -> class097854.N((Object)class11595.z(class118722.y())));
    }

    public static void N(class11872 class118722, int n, class09785<Float> class097852, class09785<Float> class097853, class09785<Float> class097854) {
        float[] fArray = Color.RGBtoHSB(class11300.u((int)n), class11300.N((int)n), class11300.i((int)n), null);
        float f = class11595.y(class118722);
        float f2 = class11595.N(class118722);
        float f3 = Math.min(fArray[1], f) / f;
        float f4 = Math.max(fArray[2], f2);
        class097852.N((Object)Float.valueOf(fArray[0]));
        class097853.N((Object)Float.valueOf(f3 * class11595.Z()));
        class097854.N((Object)Float.valueOf((1.0f - f4) / (1.0f - f2) * class11595.i()));
    }

    private static void N(int n, class09785<String> class097852, class09785<String> class097853) {
        class097852.N((Object)class11595.m(n));
        class097853.N((Object)class11595.z(n));
    }

    private static void N(class11872 class118722, class09785<class11619> class097852, class09785<Boolean> class097853, class09785<Float> class097854, class09785<Float> class097855, class09785<Float> class097856, class09785<String> class097857, class09785<String> class097858) {
        class11595.N(class097852, class097853);
        class11619 class116192 = new class11619(class118722, class097852, class097853, class097854, class097855, class097856, class097857, class097858);
        class097852.N((Object)class116192);
        class097853.N((Object)true);
        class11938.L().y((Object)class116192);
    }

    public static void N(class11872 class118722, int n, class09785<String> class097852, class09785<String> class097853) {
        n = class11595.N(class118722, n);
        class118722.i().accept(n);
        class11595.N(n, class097852, class097853);
    }

    private static float N(class09864 class098642, int n) {
        float f = class098642.N() - class098642.z().c().y() - 0.0f - (float)n / 2.0f;
        float f2 = Math.max(1.0f, class098642.z().c().u() - (float)n - 0.0f);
        return Math.clamp((float)(f / f2), (float)0.0f, (float)1.0f);
    }

    private static class09991 N(int n, float f) {
        return class09991.N().u(8.0f, 14.0f).N(class09969.FLOATING).U(class11595.N(f, 8)).E(-2.0f).v(6.0f).L(class09662.N((int)-16777216, (float)0.1f)).y(class11595.y(f, class11300.y((int)n))).z(2.0f).u(-1).Z(9999.0f);
    }

    private static void L(class11872 class118722, class09785<Float> class097852, class09785<Float> class097853, class09785<Float> class097854, class09785<String> class097855, class09785<String> class097856, class09844 class098442) {
        String string = class098442.y().trim();
        if (!class11595.Q(string)) {
            class098442.z().N(class098442.N());
            class097855.N((Object)class098442.N());
            return;
        }
        class097855.N((Object)string);
        class11595.Z(string).ifPresent(n -> class11595.y(class118722, class097852, class097853, class097854, class097855, class097856, n));
    }

    private class09798 N(class11872 class118722, class09809 class098092) {
        class09785 class097852 = class098092.N(l[0], (Object)false);
        class09785 class097853 = class098092.N(l[1], (Object)false);
        class09785 class097854 = class098092.N(l[2], (Object)false);
        class09785 class097855 = class098092.N(l[3], (Object)false);
        class09785 class097856 = class098092.N(l[4], (Object)null);
        class09785 class097857 = class098092.N(l[5], (Object)Float.valueOf(class11595.u(class118722.y())));
        class09785 class097858 = class098092.N(l[6], (Object)Float.valueOf(class11595.Z(class118722.y())));
        class09785 class097859 = class098092.N(l[7], (Object)Float.valueOf(0.0f));
        class09785 class0978510 = class098092.N(Ny[0], (Object)Float.valueOf(0.0f));
        class09785 class0978511 = class098092.N(Ny[1], (Object)false);
        class09785 class0978512 = class098092.N(Ny[2], (Object)class11595.m(class118722.y()));
        class09785 class0978513 = class098092.N(Ny[3], (Object)class11595.z(class118722.y()));
        boolean bl = (Boolean)class118722.N().L();
        if (!bl) {
            if (((Boolean)class0978511.L()).booleanValue()) {
                class0978511.N((Object)false);
            }
        } else if (!((Boolean)class0978511.L()).booleanValue()) {
            class11595.N(class118722, class118722.y(), (class09785<Float>)class097857, (class09785<Float>)class097859, (class09785<Float>)class0978510);
            class097858.N((Object)Float.valueOf(class11595.Z(class118722.y())));
            class11595.N(class118722.y(), (class09785<String>)class0978512, (class09785<String>)class0978513);
            class0978511.N((Object)true);
        }
        String string = "colorPickerAnchor" + System.identityHashCode(class118722.N());
        return class11629.N((class09991)N_5, (class09784 class097843) -> {
            class097843.N(Ni[6]);
            class097843.N_3((class09991)N_6, class097842 -> class097842.N(string));
            if (!bl) {
                return;
            }
            class097843.y(class11629.N(T[0], 2000, () -> {
                class11595.U(class118722.y());
                class097852.N((Object)false);
                class097853.N((Object)false);
                class097854.N((Object)false);
                class11595.N((class09785<class11619>)class097856, (class09785<Boolean>)class097855);
                class118722.N().N((Object)false);
            }));
            class097843.N_3(class09991.N((class09991[])new class09991[]{(class09991)M_4, class11629.N(string, 0.0f, 2001)}), class097844 -> {
                class097844.N(T[1]);
                class097844.N_3((class09991)L_0, class097842 -> {
                    class097842.N(class09867.POINTER_DOWN, class098602 -> {
                        class09864 class098642 = (class09864)class098602;
                        if (class098642.L() == 0) {
                            class097852.N((Object)true);
                            class11595.N(class118722, ((Float)class097857.L()).floatValue(), (class09785<Float>)class097859, (class09785<Float>)class0978510, (class09785<String>)class0978512, (class09785<String>)class0978513, class098642);
                        }
                    });
                    class097842.N(class09867.POINTER_MOVE, class098602 -> {
                        if (((Boolean)class097852.L()).booleanValue()) {
                            class11595.N(class118722, ((Float)class097857.L()).floatValue(), (class09785<Float>)class097859, (class09785<Float>)class0978510, (class09785<String>)class0978512, (class09785<String>)class0978513, (class09864)class098602);
                        }
                    });
                    class097842.N(class09867.POINTER_UP, class098602 -> {
                        class09864 class098642 = (class09864)class098602;
                        if (class098642.L() == 0) {
                            class097852.N((Object)false);
                            class11595.N(class118722, ((Float)class097857.L()).floatValue(), (class09785<Float>)class097859, (class09785<Float>)class0978510, (class09785<String>)class0978512, (class09785<String>)class0978513, class098642);
                        }
                    });
                    class097842.i((T class098132) -> ((class09813)class098132.N((class09991)L_0)).y(class099122 -> class11611.N(class11595.N(((Float)class097857.L()).floatValue(), 0.0f, 1.0f), class11595.N(((Float)class097857.L()).floatValue(), class11595.y(class118722), 1.0f), class11595.N(((Float)class097857.L()).floatValue(), 0.0f, class11595.N(class118722)), class11595.N(((Float)class097857.L()).floatValue(), class11595.y(class118722), class11595.N(class118722)), class099122.N(), class099122.y(), class099122.L(), class099122.u())));
                    class097842.y(class11595.N(class118722.y(), ((Float)class097859.L()).floatValue(), ((Float)class0978510.L()).floatValue()));
                });
                class097844.N_3((class09991)L_1, class097843 -> {
                    class097843.N_3((class09991)L_2, class097842 -> {
                        class097842.N(class09867.POINTER_DOWN, class098602 -> {
                            class09864 class098642 = (class09864)class098602;
                            if (class098642.L() == 0) {
                                class097853.N((Object)true);
                                class11595.N(class118722, (class09785<Float>)class097857, (class09785<Float>)class097859, (class09785<Float>)class0978510, (class09785<String>)class0978512, (class09785<String>)class0978513, class098642);
                            }
                        });
                        class097842.N(class09867.POINTER_MOVE, class098602 -> {
                            if (((Boolean)class097853.L()).booleanValue()) {
                                class11595.N(class118722, (class09785<Float>)class097857, (class09785<Float>)class097859, (class09785<Float>)class0978510, (class09785<String>)class0978512, (class09785<String>)class0978513, (class09864)class098602);
                            }
                        });
                        class097842.N(class09867.POINTER_UP, class098602 -> {
                            class09864 class098642 = (class09864)class098602;
                            if (class098642.L() == 0) {
                                class097853.N((Object)false);
                                class11595.N(class118722, (class09785<Float>)class097857, (class09785<Float>)class097859, (class09785<Float>)class0978510, (class09785<String>)class0978512, (class09785<String>)class0978513, class098642);
                            }
                        });
                        class097842.i((T class098132) -> ((class09813)class098132.N((class09991)L_3)).y(class099122 -> class11606.N(class099122.N(), class099122.y(), class099122.L(), class099122.u())));
                        class097842.y(class11595.N(class118722.y(), ((Float)class097857.L()).floatValue()));
                    });
                    class097843.N(class118722.u(), () -> class09778.N((class09991)((class09991)L_2), (T class097842) -> {
                        class097842.N(class09867.POINTER_DOWN, class098602 -> {
                            class09864 class098642 = (class09864)class098602;
                            if (class098642.L() == 0) {
                                class097854.N((Object)true);
                                class11595.N(class118722, (class09785<Float>)class097858, (class09785<String>)class0978512, (class09785<String>)class0978513, class098642);
                            }
                        });
                        class097842.N(class09867.POINTER_MOVE, class098602 -> {
                            if (((Boolean)class097854.L()).booleanValue()) {
                                class11595.N(class118722, (class09785<Float>)class097858, (class09785<String>)class0978512, (class09785<String>)class0978513, (class09864)class098602);
                            }
                        });
                        class097842.N(class09867.POINTER_UP, class098602 -> {
                            class09864 class098642 = (class09864)class098602;
                            if (class098642.L() == 0) {
                                class097854.N((Object)false);
                                class11595.N(class118722, (class09785<Float>)class097858, (class09785<String>)class0978512, (class09785<String>)class0978513, class098642);
                            }
                        });
                        class097842.i((T class098132) -> ((class09813)class098132.N((class09991)L_4)).y(class099122 -> class11640.N(class118722.y(), class099122.N(), class099122.y(), class099122.L(), class099122.u())));
                        class097842.y(class11595.N(((Float)class097858.L()).floatValue()));
                    }));
                });
                class097844.N_3((class09991)R_0, class097843 -> {
                    class097843.N_3((class09991)R_1, class097842 -> {
                        class097842.L((T class097772) -> {
                            class097772.N(T[4]);
                            class097772.L(T[5]);
                            class097772.N(class09991.N((class09991[])new class09991[]{(class09991)R_2, class09991.N().i((Boolean)class097855.L() != false ? (Integer)class09181.N_0 : -7171438)}));
                        });
                        class097842.N_1(class098602 -> class11595.N(class118722, (class09785<class11619>)class097856, (class09785<Boolean>)class097855, (class09785<Float>)class097857, (class09785<Float>)class097859, (class09785<Float>)class0978510, (class09785<String>)class0978512, (class09785<String>)class0978513));
                    });
                    class097843.u((T class098142) -> {
                        class098142.N(T[3]);
                        class098142.L((String)class0978512.L());
                        class098142.N((class09991)N_1);
                        class098142.N(class09867.INPUT, class098602 -> class11595.L(class118722, (class09785<Float>)class097857, (class09785<Float>)class097859, (class09785<Float>)class0978510, (class09785<String>)class0978512, (class09785<String>)class0978513, (class09844)class098602));
                        class098142.N(class09867.CHANGE, class098602 -> class11595.N(class118722, (class09785<Float>)class097857, (class09785<Float>)class097859, (class09785<Float>)class0978510, (class09785<String>)class0978512, (class09785<String>)class0978513, class098602.z().B()));
                        class098142.N(class09867.BLUR, class098602 -> class11595.N(class118722, (class09785<Float>)class097857, (class09785<Float>)class097859, (class09785<Float>)class0978510, (class09785<String>)class0978512, (class09785<String>)class0978513, class098602.z().B()));
                    });
                    class097843.N(class118722.u(), () -> ((class09814)((class09814)((class09814)((class09814)((class09814)class09778.i().N(T[2])).L((String)class0978513.L()).N((class09991)N_2)).N(class09867.INPUT, class098602 -> class11595.N((class09785<String>)class0978513, (class09844)class098602))).N(class09867.CHANGE, class098602 -> class11595.N(class118722, (class09785<Float>)class097858, (class09785<String>)class0978512, (class09785<String>)class0978513, class098602.z().B()))).N(class09867.BLUR, class098602 -> class11595.N(class118722, (class09785<Float>)class097858, (class09785<String>)class0978512, (class09785<String>)class0978513, class098602.z().B()))).i());
                });
                if (!((LinkedList)M_3).isEmpty()) {
                    class097844.N_3((class09991)N_3, class097843 -> {
                        Iterator iterator = ((LinkedList)M_3).iterator();
                        while (iterator.hasNext()) {
                            int n = (Integer)iterator.next();
                            class097843.N_3(class09991.N((class09991[])new class09991[]{(class09991)N_4, class09991.N().y(n)}), class097842 -> class097842.N_1(class098602 -> class11595.N(class118722, n, (class09785<Float>)class097857, (class09785<Float>)class097858, (class09785<Float>)class097859, (class09785<Float>)class0978510, (class09785<String>)class0978512, (class09785<String>)class0978513)));
                        }
                    });
                }
            });
        });
    }

    private static void N(class11872 class118722, int n, class09785<Float> class097852, class09785<Float> class097853, class09785<Float> class097854, class09785<Float> class097855, class09785<String> class097856, class09785<String> class097857) {
        if (!class118722.u()) {
            n = class11300.N((int)n, (int)class11300.y((int)class118722.y()));
        }
        n = class11595.N(class118722, n);
        class11595.N(class118722, n, class097852, class097854, class097855);
        class097853.N((Object)Float.valueOf(class11595.Z(n)));
        class11595.N(class118722, n, class097856, class097857);
    }

    private static void N(class09785<class11619> class097852, class09785<Boolean> class097853) {
        class11619 class116192 = (class11619)class097852.L();
        if (class116192 == null) {
            return;
        }
        class116192.N();
    }

    private static void N(class11872 class118722, float f, float f2, float f3, float f4, float f5, class09785<String> class097852, class09785<String> class097853) {
        float f6 = (f4 <= 0.0f ? 0.0f : f2 / f4) * class11595.y(class118722);
        float f7 = class11595.N(class118722);
        float f8 = f5 <= 0.0f ? 1.0f : 1.0f - f3 / f5 * (1.0f - f7);
        int n = Color.HSBtoRGB(f, f6, f8);
        class11595.N(class118722, class11300.N((int)n, (int)class11300.y((int)class118722.y())), class097852, class097853);
    }

    private static float N(class11872 class118722) {
        return class118722.L() ? 0.5f : 0.0f;
    }

    private static void N() {
        y_1 = 8;
        y_2 = 248;
        y_3 = 186;
        y_4 = 10;
        y_5 = 10;
        y_6 = 32;
        y_7 = 54;
        u_0 = 8;
        u_1 = 14;
        i_0 = 14;
        i_1 = 0;
        i_2 = -2;
        M_0 = 8;
        M_1 = Float.valueOf(0.5f);
        M_2 = Float.valueOf(0.5f);
        N_7 = T[6];
    }

    private static void N(class11872 class118722, class09785<Float> class097852, class09785<Float> class097853, class09785<Float> class097854, class09785<String> class097855, class09785<String> class097856, class09864 class098642) {
        float f = Math.min(class11595.N(class098642, 8), Math.nextDown(1.0f));
        class097852.N((Object)Float.valueOf(f));
        class11595.N(class118722, f, ((Float)class097853.L()).floatValue(), ((Float)class097854.L()).floatValue(), class11595.Z(), class11595.i(), class097855, class097856);
    }

    private static class09991 N(float f) {
        return class09991.N().u(14.0f, 14.0f).N(class09969.FLOATING).U(class11595.N(f, 14)).E(-2.0f).v(6.0f).L(class09662.N((int)-16777216, (float)0.1f)).y(-1).Z(9999.0f);
    }

    private static void N(class11872 class118722, class09785<Float> class097852, class09785<Float> class097853, class09785<Float> class097854, class09785<String> class097855, class09785<String> class097856, String string) {
        class11595.Z(string).ifPresentOrElse(n -> class11595.y(class118722, class097852, class097853, class097854, class097855, class097856, n), () -> class097855.N((Object)class11595.m(class118722.y())));
    }

    private static float N(float f, int n) {
        return 0.0f + Math.clamp((float)f, (float)0.0f, (float)1.0f) * class11595.M(n);
    }

    private static class09991 N(int n, float f, float f2) {
        return class09991.N().u(10.0f, 10.0f).N(class09969.FLOATING).U(f).E(f2).y(n).v(6.0f).L(class09662.N((int)-16777216, (float)0.1f)).z(1.0f).u(-1).Z(9999.0f).N(class09983.BORDER_BOX);
    }

    private static void N(class09785<String> class097852, class09844 class098442) {
        String string = class098442.y().trim();
        if (!class11595.z(string)) {
            class098442.z().N(class098442.N());
            class097852.N((Object)class098442.N());
            return;
        }
        class097852.N((Object)string);
    }

    private static void N(class11872 class118722, float f, class09785<Float> class097852, class09785<Float> class097853, class09785<String> class097854, class09785<String> class097855, class09864 class098642) {
        float f2 = Math.max(0.0f, class098642.z().c().u() - 10.0f);
        float f3 = Math.max(0.0f, class098642.z().c().i() - 10.0f);
        class097852.N((Object)Float.valueOf(Math.clamp((float)(class098642.N() - class098642.z().c().y() - 5.0f), (float)0.0f, (float)f2)));
        class097853.N((Object)Float.valueOf(Math.clamp((float)(class098642.y() - class098642.z().c().L() - 5.0f), (float)0.0f, (float)f3)));
        class11595.N(class118722, f, ((Float)class097852.L()).floatValue(), ((Float)class097853.L()).floatValue(), f2, f3, class097854, class097855);
    }

    private static int N(class11872 class118722, int n) {
        if (!class118722.L()) {
            return n;
        }
        float[] fArray = Color.RGBtoHSB(class11300.u((int)n), class11300.N((int)n), class11300.i((int)n), null);
        float f = Math.min(fArray[1], 0.5f);
        float f2 = Math.max(fArray[2], 0.5f);
        if (f == fArray[1] && f2 == fArray[2]) {
            return n;
        }
        return class11300.N((int)Color.HSBtoRGB(fArray[0], f, f2), (int)class11300.y((int)n));
    }

    private static void R() {
        l = new String[8];
        class11595.l[0] = "gradientDragging";
        class11595.l[1] = "hueDragging";
        class11595.l[2] = "alphaDragging";
        class11595.l[3] = "pipetteActive";
        class11595.l[4] = "pipetteListener";
        class11595.l[5] = "selectedHue";
        class11595.l[6] = "selectedAlpha";
        class11595.l[7] = "gradientSelectorX";
        Ny = new String[4];
        class11595.Ny[0] = "gradientSelectorY";
        class11595.Ny[1] = "gradientSyncedOnOpen";
        class11595.Ny[2] = "hexInput";
        class11595.Ny[3] = "alphaInput";
        Ni = new String[7];
        class11595.Ni[0] = "#";
        class11595.Ni[1] = "#";
        class11595.Ni[2] = "#";
        class11595.Ni[3] = "%";
        class11595.Ni[4] = "%";
        class11595.Ni[5] = "#%02X%02X%02X";
        class11595.Ni[6] = "colorPickerMount";
        T = new String[7];
        class11595.T[0] = "colorPickerCatcher";
        class11595.T[1] = "colorPickerPanel";
        class11595.T[2] = "alphaColorInput";
        class11595.T[3] = "hexColorInput";
        class11595.T[4] = "eye-dropper";
        class11595.T[5] = "icon:menu/eye-dropper";
        class11595.T[6] = "colorPickerAnchor";
    }
}

