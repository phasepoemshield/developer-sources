/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09181
 *  Nursultan.class09211
 *  Nursultan.class09221
 *  Nursultan.class09227
 *  Nursultan.class09662
 *  Nursultan.class09692
 *  Nursultan.class09743
 *  Nursultan.class09778
 *  Nursultan.class09785
 *  Nursultan.class09798
 *  Nursultan.class09804
 *  Nursultan.class09809
 *  Nursultan.class09837
 *  Nursultan.class09842
 *  Nursultan.class09844
 *  Nursultan.class09864
 *  Nursultan.class09867
 *  Nursultan.class09904
 *  Nursultan.class09962
 *  Nursultan.class09969
 *  Nursultan.class09973
 *  Nursultan.class09991
 *  Nursultan.class09994
 *  Nursultan.class11830
 *  Nursultan.class11863
 *  Nursultan.class11908
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09181;
import Nursultan.class09211;
import Nursultan.class09221;
import Nursultan.class09227;
import Nursultan.class09662;
import Nursultan.class09692;
import Nursultan.class09743;
import Nursultan.class09778;
import Nursultan.class09785;
import Nursultan.class09798;
import Nursultan.class09804;
import Nursultan.class09809;
import Nursultan.class09837;
import Nursultan.class09842;
import Nursultan.class09844;
import Nursultan.class09864;
import Nursultan.class09867;
import Nursultan.class09904;
import Nursultan.class09962;
import Nursultan.class09969;
import Nursultan.class09973;
import Nursultan.class09991;
import Nursultan.class09994;
import Nursultan.class11602;
import Nursultan.class11644;
import Nursultan.class11830;
import Nursultan.class11863;
import Nursultan.class11908;

public class class11624 {
    private static String[] I;
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

    private static void L() {
        I = new String[6];
        class11624.I[0] = "sliderDrag";
        class11624.I[1] = "sliderValue";
        class11624.I[2] = "sliderDragOffset";
        class11624.I[3] = "sliderClickAnimating";
        class11624.I[4] = "sliderInputText";
        class11624.I[5] = "";
    }

    private class11624() {
    }

    static {
        class11624.N();
        class11624.y();
        class11624.L();
        class11624.u();
        N_0 = new class11624()::N;
        L_2 = class09991.N().N(class09962.N()).B(12.0f).y(class09973.CENTER).y(class09962.y((float)26.0f));
        L_3 = class09991.N().N(class09962.N()).y(class09973.CENTER).y(class09962.y((float)26.0f));
        y_0 = class09227.N((T class092112) -> class09991.N().u(104.0f, 6.0f).Z(999.0f).y(class092112.i()));
        y_1 = class09227.N((T class092112) -> class09991.N().y(class09962.y((float)6.0f)).Z(999.0f).y(class092112.B()));
        y_2 = new class11863(360.0f, 27.0f, 1.0f, 0.1f, 2.0f, 0.008333334f);
        y_3 = class09991.N().N(class09692.N((class09994[])new class09994[]{class09994.E((class09743)((class09743)y_2))}));
        y_4 = class09227.N((T class092112) -> class09991.N().u(16.0f, 10.0f).Z(999.0f).N(class09969.FLOATING).v(8.0f).L(class09662.N((int)-16777216, (float)0.2f)).N(-8.0f, -2.0f).y(class092112.N()));
        y_5 = class09991.N().N(class09692.N((class09994[])new class09994[]{class09994.E((class09743)((class09743)y_2)), class09994.W((class09743)((class09743)y_2)), class09994.B((class09743)((class09743)y_2))}));
        class09991 class099913 = class09991.N().u(40.0f, 26.0f).y(((Integer)class09181.L_1).intValue()).z(1.0f).u(((Integer)class09181.y_1).intValue()).i(((Integer)class09181.N_4).intValue()).y(class09973.CENTER).N(class09973.CENTER).u(2.0f).i(2.0f).Z(8.0f).N(class09692.N((class09994[])new class09994[]{class09994.L((class09743)((class09743)class11644.N_0))}));
        y_6 = class09991.N((class09991[])new class09991[]{class099913.u(class099912 -> class099912.i(((Integer)class09181.N_0).intValue())), class09221.N((int)14, (class09079)class09079.REGULAR)});
        class09991 class099914 = class09991.N();
        y_7 = class09991.N((class09991[])new class09991[]{(class09991)y_6, class099914.i(((Integer)class09181.N_0).intValue())});
    }

    private static void u() {
        N_1 = Float.valueOf(104.0f);
        N_2 = Float.valueOf(6.0f);
        N_3 = 16;
        N_4 = 10;
        N_5 = Float.valueOf(-8.0f);
        N_6 = Float.valueOf(-2.0f);
        N_7 = Float.valueOf(3.0f);
        L_0 = Float.valueOf(4.0f);
        L_1 = 999;
    }

    private static void y() {
    }

    private boolean N(float f, float f2) {
        float f3 = f2 * 104.0f + -8.0f;
        float f4 = f3 + 16.0f;
        return f >= f3 && f <= f4;
    }

    private float N(float f, class11830 class118302) {
        return Math.clamp((float)class11908.N((float)(f * class118302.L() + class118302.i()), (float)class118302.y()), (float)class118302.i(), (float)class118302.R());
    }

    private static void N() {
    }

    private void N(class09785<Float> class097852, class11830 class118302, float f, float f2, float f3, boolean bl) {
        float f4 = Math.clamp((float)((f - f3) / f2), (float)0.0f, (float)1.0f);
        if (bl) {
            class097852.N((Object)Float.valueOf((class11908.N((float)(f4 * class118302.L() + class118302.i()), (float)class118302.y()) - class118302.i()) / class118302.L()));
        } else {
            class097852.N((Object)Float.valueOf(f4));
        }
    }

    private class09798 N(class11830 class118302, class09809 class098092) {
        class09211 class092112 = (class09211)class098092.N((class09804)class09211.N_6);
        class09785 class097852 = class098092.N(I[0], (Object)false);
        class09785 class097853 = class098092.N(I[1], (Object)Float.valueOf(class118302.N()));
        class09785 class097854 = class098092.N(I[2], (Object)Float.valueOf(0.0f));
        class09785 class097855 = class098092.N(I[3], (Object)false);
        class09785 class097856 = class098092.N(I[4], (Object)null);
        return class09778.N((class09991)((class09991)L_2), (T class097843) -> {
            class097843.N_3((class09991)L_3, class097842 -> {
                class097842.N(class09867.POINTER_DOWN, class098602 -> {
                    class09864 class098642 = (class09864)class098602;
                    if (class098642.L() != 0) {
                        return;
                    }
                    class097852.N((Object)true);
                    class09904 class099042 = class098642.z();
                    float f = class098642.N() - class099042.c().y();
                    float f2 = class118302.N() * 104.0f;
                    if (this.N(f, class118302.N())) {
                        class097855.N((Object)false);
                        class097854.N((Object)Float.valueOf(f - f2));
                    } else {
                        class097855.N((Object)true);
                        class118302.M().N((Object)false);
                        class097854.N((Object)Float.valueOf(0.0f));
                        this.N((class09785<Float>)class097853, class118302, f, class099042.c().u(), 0.0f, true);
                        class118302.Z().accept(Float.valueOf(this.N(((Float)class097853.L()).floatValue(), class118302)));
                    }
                });
                class097842.N(class09867.POINTER_UP, class098602 -> {
                    class09864 class098642 = (class09864)class098602;
                    if (class098642.L() != 0) {
                        return;
                    }
                    class097852.N((Object)false);
                    if (((Boolean)class118302.M().L()).booleanValue()) {
                        class09904 class099042 = class098642.z();
                        float f = class098642.N() - class099042.c().y();
                        this.N((class09785<Float>)class097853, class118302, f, class099042.c().u(), ((Float)class097854.L()).floatValue(), true);
                        class118302.Z().accept(Float.valueOf(this.N(((Float)class097853.L()).floatValue(), class118302)));
                    }
                    class118302.M().N((Object)false);
                    class097854.N((Object)Float.valueOf(0.0f));
                    class097855.N((Object)false);
                });
                class097842.N(class09867.POINTER_MOVE, class098602 -> {
                    if (!((Boolean)class097852.L()).booleanValue()) {
                        return;
                    }
                    class09864 class098642 = (class09864)class098602;
                    class09904 class099042 = class098642.z();
                    float f = class098642.N() - class099042.c().y();
                    if (((Boolean)class097855.L()).booleanValue() && this.N(class099042, f)) {
                        class097855.N((Object)false);
                    }
                    this.N((class09785<Float>)class097853, class118302, f, class099042.c().u(), ((Float)class097854.L()).floatValue(), false);
                    class118302.Z().accept(Float.valueOf(this.N(((Float)class097853.L()).floatValue(), class118302)));
                    if (!((Boolean)class097855.L()).booleanValue()) {
                        class118302.M().N((Object)true);
                    }
                });
                class097842.N_3(((class09227)y_0).N(class092112), class097843 -> {
                    class09991 class099912 = class09991.N((class09991[])new class09991[]{((class09227)y_1).N(class092112), class09991.N().N(class09962.N((float)(((Boolean)class097852.L() != false ? ((Float)class097853.L()).floatValue() : class118302.N()) * 100.0f)))});
                    if ((Boolean)class097855.L() != false || (Boolean)class118302.M().L() == false) {
                        class099912 = class09991.N((class09991[])new class09991[]{class099912, (class09991)y_3});
                    }
                    class09991 class099913 = class099912;
                    class097843.N_3(class099913, class097842 -> class097842.N(class09867.TRANSITION_END, class098602 -> {
                        if (((class09842)class098602).y()) {
                            class097855.N((Object)false);
                        }
                    }));
                    class09991 class099914 = class09991.N((class09991[])new class09991[]{((class09227)y_4).N(class092112), class09991.N().u(16.0f, 10.0f).N(-8.0f, -2.0f), (class09991)y_5});
                    class097843.N((T class097842) -> class097842.y(class099914));
                });
            });
            class097843.u(class098142 -> {
                String string = this.N(class118302);
                class098142.L(class097856.L() != null ? (String)class097856.L() : class11602.N((Boolean)class097852.L() != false ? this.N(((Float)class097853.L()).floatValue(), class118302) : class118302.B(), string));
                class098142.N((Boolean)class118302.M().L() != false ? (class09991)y_7 : (class09991)y_6);
                class098142.N(class09867.INPUT, class098602 -> {
                    class09844 class098442 = (class09844)class098602;
                    String string2 = class098442.y();
                    class097856.N((Object)string2);
                    String string3 = class11602.N(string2, string);
                    if (class11602.N(string3)) {
                        return;
                    }
                    try {
                        Float.parseFloat(string3);
                    }
                    catch (NumberFormatException numberFormatException) {
                        class097856.N((Object)class098442.N());
                        class098442.b();
                        class098442.j();
                        class098602.z().N(class098442.N());
                    }
                });
                class098142.N(class09867.BLUR, class098602 -> {
                    String string2 = class11602.N(class098602.z().B(), string);
                    class097856.N(null);
                    if (string2.isBlank() || class11602.N(string2)) {
                        class118302.Z().accept(Float.valueOf(class118302.i()));
                        class097853.N((Object)Float.valueOf(0.0f));
                        return;
                    }
                    try {
                        float f = Math.clamp((float)class11908.N((float)Float.parseFloat(string2), (float)class118302.y()), (float)class118302.i(), (float)class118302.R());
                        class118302.Z().accept(Float.valueOf(f));
                        class097853.N((Object)Float.valueOf((f - class118302.i()) / class118302.L()));
                    }
                    catch (NumberFormatException numberFormatException) {
                        // empty catch block
                    }
                });
                class098142.N(class09867.WHEEL, class098602 -> {
                    if (!class098602.z().W()) {
                        return;
                    }
                    class09837 class098372 = (class09837)class098602;
                    class098602.T();
                    class098602.j();
                    float f = Math.clamp((float)class11908.N((float)(class118302.B() + Math.signum(class098372.L()) * class118302.y()), (float)class118302.y()), (float)class118302.i(), (float)class118302.R());
                    class118302.Z().accept(Float.valueOf(f));
                    class097853.N((Object)Float.valueOf((f - class118302.i()) / class118302.L()));
                    class097856.N(null);
                });
            });
        });
    }

    private boolean N(class09904 class099042, float f) {
        if (class099042.L().isEmpty()) {
            return false;
        }
        class09904 class099043 = (class09904)class099042.L().getFirst();
        if (class099043.L().isEmpty()) {
            return false;
        }
        class09904 class099044 = (class09904)class099043.L().getFirst();
        float f2 = class099043.c().y() - class099042.c().y() + class099044.c().u();
        return Math.abs(f - f2) <= 4.0f;
    }

    private String N(class11830 class118302) {
        String string = (String)class118302.u().get();
        return string == null ? I[5] : string;
    }
}

