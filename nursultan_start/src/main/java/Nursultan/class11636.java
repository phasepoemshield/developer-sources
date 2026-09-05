/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09181
 *  Nursultan.class09211
 *  Nursultan.class09221
 *  Nursultan.class09227
 *  Nursultan.class09692
 *  Nursultan.class09743
 *  Nursultan.class09778
 *  Nursultan.class09784
 *  Nursultan.class09785
 *  Nursultan.class09798
 *  Nursultan.class09804
 *  Nursultan.class09809
 *  Nursultan.class09814
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
 *  Nursultan.class11494
 *  Nursultan.class11863
 *  Nursultan.class11871
 *  Nursultan.class11908
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09181;
import Nursultan.class09211;
import Nursultan.class09221;
import Nursultan.class09227;
import Nursultan.class09692;
import Nursultan.class09743;
import Nursultan.class09778;
import Nursultan.class09784;
import Nursultan.class09785;
import Nursultan.class09798;
import Nursultan.class09804;
import Nursultan.class09809;
import Nursultan.class09814;
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
import Nursultan.class11494;
import Nursultan.class11602;
import Nursultan.class11604;
import Nursultan.class11644;
import Nursultan.class11863;
import Nursultan.class11871;
import Nursultan.class11908;
import java.util.function.Consumer;

public class class11636 {
    private static String[] R;
    private static String[] o;
    public static Object N_0;
    public static Object N_1;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;
    public static Object y_5;
    public static Object L_0;
    public static Object L_1;
    public static Object u_0;
    public static Object u_1;
    public static Object u_2;
    public static Object u_3;
    public static Object i_0;
    public static Object i_1;
    public static Object i_2;
    public static Object i_3;
    public static Object i_4;

    private static void L() {
        i_1 = Float.valueOf(104.0f);
        i_2 = Float.valueOf(6.0f);
        i_3 = 16;
        i_4 = 10;
        N_0 = Float.valueOf(-8.0f);
        N_1 = Float.valueOf(-2.0f);
        L_0 = Float.valueOf(4.0f);
        L_1 = 999;
        u_0 = Float.valueOf(1.0E-4f);
    }

    private class11636() {
    }

    static {
        class11636.N();
        class11636.y();
        class11636.L();
        i_0 = new class11636()::N;
        u_1 = new class11863(360.0f, 27.0f, 1.0f, 0.1f, 2.0f, 0.008333334f);
        u_2 = class09991.N().N(class09962.N()).B(12.0f).y(class09973.CENTER).y(class09962.y((float)26.0f));
        u_3 = class09991.N().N(class09962.N()).y(class09973.CENTER).y(class09962.y((float)26.0f));
        y_0 = class09227.N((T class092112) -> class09991.N().u(104.0f, 6.0f).Z(999.0f).y(class092112.i()));
        y_1 = class09227.N((T class092112) -> class09991.N().y(class09962.y((float)6.0f)).Z(999.0f).N(class09969.FLOATING).E(0.0f).y(class092112.B()));
        y_2 = class09991.N().N(class09692.N((class09994[])new class09994[]{class09994.E((class09743)((class09743)u_1)), class09994.B((class09743)((class09743)u_1))}));
        y_3 = class09227.N((T class092112) -> class09991.N().u(16.0f, 10.0f).Z(999.0f).N(class09969.FLOATING).N(-8.0f, -2.0f).y(class092112.N()));
        class09991 class099913 = class09991.N().u(40.0f, 26.0f).y(((Integer)class09181.L_1).intValue()).z(1.0f).u(((Integer)class09181.y_1).intValue()).i(((Integer)class09181.N_4).intValue()).y(class09973.CENTER).N(class09973.CENTER).u(2.0f).i(2.0f).Z(8.0f).N(class09692.N((class09994[])new class09994[]{class09994.L((class09743)((class09743)class11644.N_0))}));
        y_4 = class09991.N((class09991[])new class09991[]{class099913.u(class099912 -> class099912.i(((Integer)class09181.N_0).intValue())), class09221.N((int)14, (class09079)class09079.REGULAR)});
        class09991 class099914 = class09991.N();
        y_5 = class09991.N((class09991[])new class09991[]{(class09991)y_4, class099914.i(((Integer)class09181.N_0).intValue())});
    }

    private static void y() {
        o = new String[5];
        class11636.o[0] = "rangeSliderDrag";
        class11636.o[1] = "rangeSliderMinValue";
        class11636.o[2] = "rangeSliderMaxValue";
        class11636.o[3] = "rangeSliderActiveThumb";
        class11636.o[4] = "rangeSliderPointerDownX";
        R = new String[5];
        class11636.R[0] = "rangeSliderDragOffset";
        class11636.R[1] = "rangeSliderClickAnimating";
        class11636.R[2] = "rangeSliderMinInputText";
        class11636.R[3] = "rangeSliderMaxInputText";
        class11636.R[4] = "";
    }

    private float y(float f, class11871 class118712) {
        return Math.clamp((float)((f - class118712.u()) / class118712.L()), (float)0.0f, (float)1.0f);
    }

    private float y(float f, float f2) {
        return Math.clamp((float)(f / f2), (float)0.0f, (float)1.0f);
    }

    private class09991 N(class09211 class092112, float f, float f2, boolean bl) {
        float f3 = Math.clamp((float)Math.min(f, f2), (float)0.0f, (float)1.0f);
        float f4 = Math.clamp((float)Math.max(f, f2), (float)0.0f, (float)1.0f);
        class09991 class099912 = class09991.N((class09991[])new class09991[]{((class09227)y_1).N(class092112), class09991.N().N(class09962.y((float)((f4 - f3) * 104.0f))).U(f3 * 104.0f)});
        if (!bl) {
            class099912 = class09991.N((class09991[])new class09991[]{class099912, (class09991)y_2});
        }
        return class099912;
    }

    private void N(Consumer<Consumer<class09814>> consumer, class11871 class118712, class09785<Boolean> class097852, class09785<Float> class097853, class09785<Float> class097854, class09785<class11604> class097855, class09785<String> class097856, boolean bl) {
        consumer.accept(class098142 -> {
            class11604 class116042;
            String string = this.N(class118712);
            class11604 class116043 = class116042 = bl ? class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0 : class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1;
            float f = (Boolean)class097852.L() != false ? this.N((bl ? (Float)class097853.L() : (Float)class097854.L()).floatValue(), class118712) : (bl ? class118712.B().N() : class118712.B().L());
            class098142.L(class097856.L() != null ? (String)class097856.L() : class11602.N(f, string));
            class098142.N((Boolean)class118712.i().L() != false && class097855.L() == class116042 ? (class09991)y_5 : (class09991)y_4);
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
                    this.N(bl ? class118712.u() : class118712.N(), class118712, class097853, class097854, bl);
                    return;
                }
                try {
                    this.N(Float.parseFloat(string2), class118712, class097853, class097854, bl);
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
                float f = this.N((bl ? (Float)class097853.L() : (Float)class097854.L()).floatValue(), class118712);
                this.N(f + Math.signum(class098372.L()) * class118712.M(), class118712, class097853, class097854, bl);
                class097856.N(null);
            });
        });
    }

    private class11604 N(float f, class09785<Float> class097852, class09785<Float> class097853) {
        float f2;
        float f3 = Math.abs(f - ((Float)class097852.L()).floatValue());
        return f3 <= (f2 = Math.abs(f - ((Float)class097853.L()).floatValue())) ? class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0 : class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1;
    }

    private boolean N(class09904 class099042, float f, class11604 class116042) {
        float f2;
        if (class116042 == null || class099042.L().isEmpty()) {
            return false;
        }
        class09904 class099043 = (class09904)class099042.L().get(0);
        if (class099043.L().isEmpty()) {
            return false;
        }
        class09904 class099044 = (class09904)class099043.L().get(0);
        float f3 = class099043.c().y() - class099042.c().y();
        float f4 = class099044.c().y() - class099042.c().y();
        float f5 = f2 = class116042 == class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0 ? f4 : f4 + class099044.c().u();
        if (!Float.isFinite(f2)) {
            f2 = f3;
        }
        return Math.abs(f - f2) <= 4.0f;
    }

    private class09991 N(class09211 class092112, float f, boolean bl) {
        class09991 class099912 = class09991.N((class09991[])new class09991[]{((class09227)y_3).N(class092112), class09991.N().U(Math.clamp((float)f, (float)0.0f, (float)1.0f) * 104.0f + -8.0f)});
        if (!bl) {
            class099912 = class09991.N((class09991[])new class09991[]{class099912, (class09991)y_2});
        }
        return class099912;
    }

    private static void N() {
    }

    private float N(float f, class11871 class118712) {
        return Math.clamp((float)class11908.N((float)(f * class118712.L() + class118712.u()), (float)class118712.M()), (float)class118712.u(), (float)class118712.N());
    }

    private void N(class09785<Float> class097852, class09785<Float> class097853, class11871 class118712, float f, float f2, float f3, class11604 class116042, boolean bl) {
        float f4 = Math.clamp((float)((f - f3) / f2), (float)0.0f, (float)1.0f);
        if (class116042 == class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0) {
            f4 = Math.min(f4, ((Float)class097853.L()).floatValue());
            class097852.N((Object)Float.valueOf(bl ? this.y(this.N(f4, class118712), class118712) : f4));
        } else if (class116042 == class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1) {
            f4 = Math.max(f4, ((Float)class097852.L()).floatValue());
            class097853.N((Object)Float.valueOf(bl ? this.y(this.N(f4, class118712), class118712) : f4));
        }
    }

    private class11494 N(class09785<Float> class097852, class09785<Float> class097853, class11871 class118712) {
        float f = this.N(Math.min(((Float)class097852.L()).floatValue(), ((Float)class097853.L()).floatValue()), class118712);
        float f2 = this.N(Math.max(((Float)class097852.L()).floatValue(), ((Float)class097853.L()).floatValue()), class118712);
        return new class11494(f, f2);
    }

    private boolean N(float f, float f2) {
        float f3 = f2 * 104.0f + -8.0f;
        float f4 = f3 + 16.0f;
        return f >= f3 && f <= f4;
    }

    private class09798 N(class11871 class118712, class09809 class098092) {
        class09211 class092112 = (class09211)class098092.N((class09804)class09211.N_6);
        class09785 class097852 = class098092.N(o[0], (Object)false);
        class09785 class097853 = class098092.N(o[1], (Object)Float.valueOf(class118712.U()));
        class09785 class097854 = class098092.N(o[2], (Object)Float.valueOf(class118712.y()));
        class09785 class097855 = class098092.N(o[3], (Object)((class11604)null));
        class09785 class097856 = class098092.N(o[4], (Object)Float.valueOf(0.0f));
        class09785 class097857 = class098092.N(R[0], (Object)Float.valueOf(0.0f));
        class09785 class097858 = class098092.N(R[1], (Object)false);
        class09785 class097859 = class098092.N(R[2], (Object)null);
        class09785 class0978510 = class098092.N(R[3], (Object)null);
        return class09778.N((class09991)((class09991)u_2), (T class097843) -> {
            this.N(arg_0 -> ((class09784)class097843).u(arg_0), class118712, (class09785<Boolean>)class097852, (class09785<Float>)class097853, (class09785<Float>)class097854, (class09785<class11604>)class097855, (class09785<String>)class097859, true);
            class097843.N_3((class09991)u_3, class097842 -> {
                class097842.N(class09867.POINTER_DOWN, class098602 -> {
                    class11604 class116042;
                    class09864 class098642 = (class09864)class098602;
                    if (class098642.L() != 0) {
                        return;
                    }
                    class097852.N((Object)true);
                    class097856.N((Object)Float.valueOf(class098642.N()));
                    class09904 class099042 = class098642.z();
                    float f = class098642.N() - class099042.c().y();
                    boolean bl = this.N((class09785<Float>)class097853, (class09785<Float>)class097854);
                    class11604 class116043 = class116042 = bl ? null : this.N(f, ((Float)class097853.L()).floatValue(), ((Float)class097854.L()).floatValue());
                    if (class116042 != null) {
                        class097855.N(class116042);
                        class097858.N((Object)false);
                        float f2 = (class116042 == class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0 ? (Float)class097853.L() : (Float)class097854.L()).floatValue() * 104.0f;
                        class097857.N((Object)Float.valueOf(f - f2));
                    } else {
                        class097857.N((Object)Float.valueOf(0.0f));
                        if (bl) {
                            class097855.N(null);
                            class097858.N((Object)false);
                        } else {
                            class11604 class116044 = this.N(this.y(f, class099042.c().u()), (class09785<Float>)class097853, (class09785<Float>)class097854);
                            class097855.N((Object)class116044);
                            class097858.N((Object)true);
                            class118712.i().N((Object)false);
                            this.N((class09785<Float>)class097853, (class09785<Float>)class097854, class118712, f, class099042.c().u(), 0.0f, class116044, true);
                            class118712.R().accept(this.N((class09785<Float>)class097853, (class09785<Float>)class097854, class118712));
                        }
                    }
                });
                class097842.N(class09867.POINTER_UP, class098602 -> {
                    class09864 class098642 = (class09864)class098602;
                    if (class098642.L() != 0) {
                        return;
                    }
                    class097852.N((Object)false);
                    if (((Boolean)class118712.i().L()).booleanValue() && class097855.L() != null) {
                        class09904 class099042 = class098642.z();
                        float f = class098642.N() - class099042.c().y();
                        this.N((class09785<Float>)class097853, (class09785<Float>)class097854, class118712, f, class099042.c().u(), ((Float)class097857.L()).floatValue(), (class11604)((Object)((Object)((Object)((Object)class097855.L())))), true);
                        class118712.R().accept(this.N((class09785<Float>)class097853, (class09785<Float>)class097854, class118712));
                    }
                    class097855.N(null);
                    class118712.i().N((Object)false);
                    class097857.N((Object)Float.valueOf(0.0f));
                    class097858.N((Object)false);
                });
                class097842.N(class09867.POINTER_MOVE, class098602 -> {
                    if (!((Boolean)class097852.L()).booleanValue()) {
                        return;
                    }
                    class09864 class098642 = (class09864)class098602;
                    class09904 class099042 = class098642.z();
                    float f = class098642.N() - class099042.c().y();
                    if (class097855.L() == null) {
                        float f2 = class098642.N() - ((Float)class097856.L()).floatValue();
                        if (f2 > 0.0f) {
                            class097855.N((Object)class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1);
                        } else if (f2 < 0.0f) {
                            class097855.N((Object)class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0);
                        } else {
                            return;
                        }
                        class097857.N((Object)Float.valueOf(0.0f));
                    }
                    if (((Boolean)class097858.L()).booleanValue() && this.N(class099042, f, (class11604)((Object)((Object)((Object)((Object)class097855.L())))))) {
                        class097858.N((Object)false);
                    }
                    this.N((class09785<Float>)class097853, (class09785<Float>)class097854, class118712, f, class099042.c().u(), ((Float)class097857.L()).floatValue(), (class11604)((Object)((Object)((Object)((Object)class097855.L())))), false);
                    class118712.R().accept(this.N((class09785<Float>)class097853, (class09785<Float>)class097854, class118712));
                    if (!((Boolean)class097858.L()).booleanValue()) {
                        class118712.i().N((Object)true);
                    }
                });
                class097842.N_3(((class09227)y_0).N(class092112), class097843 -> {
                    float f = (Boolean)class097852.L() != false ? ((Float)class097853.L()).floatValue() : class118712.U();
                    float f2 = (Boolean)class097852.L() != false ? ((Float)class097854.L()).floatValue() : class118712.y();
                    boolean bl = (Boolean)class118712.i().L() != false && (Boolean)class097858.L() == false;
                    class097843.N_3(this.N(class092112, f, f2, bl), class097842 -> class097842.N(class09867.TRANSITION_END, class098602 -> {
                        if (((class09842)class098602).y()) {
                            class097858.N((Object)false);
                        }
                    }));
                    class097843.y(this.N(class092112, f, bl));
                    class097843.y(this.N(class092112, f2, bl));
                });
            });
            this.N(arg_0 -> ((class09784)class097843).u(arg_0), class118712, (class09785<Boolean>)class097852, (class09785<Float>)class097853, (class09785<Float>)class097854, (class09785<class11604>)class097855, (class09785<String>)class0978510, false);
        });
    }

    private class11604 N(float f, float f2, float f3) {
        boolean bl = this.N(f, f3);
        boolean bl2 = this.N(f, f2);
        if (bl && bl2) {
            float f4 = f3 * 104.0f;
            float f5 = f2 * 104.0f;
            return Math.abs(f - f4) <= Math.abs(f - f5) ? class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1 : class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0;
        }
        if (bl) {
            return class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1;
        }
        if (bl2) {
            return class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0;
        }
        return null;
    }

    private void N(float f, class11871 class118712, class09785<Float> class097852, class09785<Float> class097853, boolean bl) {
        float f2 = Math.clamp((float)class11908.N((float)f, (float)class118712.M()), (float)class118712.u(), (float)class118712.N());
        if (bl) {
            f2 = Math.min(f2, this.N(((Float)class097853.L()).floatValue(), class118712));
            class097852.N((Object)Float.valueOf(this.y(f2, class118712)));
        } else {
            f2 = Math.max(f2, this.N(((Float)class097852.L()).floatValue(), class118712));
            class097853.N((Object)Float.valueOf(this.y(f2, class118712)));
        }
        class118712.R().accept(this.N(class097852, class097853, class118712));
    }

    private String N(class11871 class118712) {
        String string = (String)class118712.Z().get();
        return string == null ? R[4] : string;
    }

    private boolean N(class09785<Float> class097852, class09785<Float> class097853) {
        return Math.abs(((Float)class097852.L()).floatValue() - ((Float)class097853.L()).floatValue()) < 1.0E-4f;
    }
}

