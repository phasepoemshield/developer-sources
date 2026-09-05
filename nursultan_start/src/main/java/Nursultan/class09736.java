/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09782
 *  Nursultan.class09815
 *  Nursultan.class09962
 *  Nursultan.class09965
 *  Nursultan.class09980
 *  Nursultan.class09982
 *  Nursultan.class09989
 *  Nursultan.class09996
 *  Nursultan.class10009
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09666;
import Nursultan.class09712;
import Nursultan.class09728;
import Nursultan.class09733;
import Nursultan.class09738;
import Nursultan.class09743;
import Nursultan.class09753;
import Nursultan.class09782;
import Nursultan.class09815;
import Nursultan.class09962;
import Nursultan.class09965;
import Nursultan.class09980;
import Nursultan.class09982;
import Nursultan.class09989;
import Nursultan.class09996;
import Nursultan.class10009;
import java.util.Objects;

public final class class09736
extends Enum<class09736> {
    public static final /* enum */ class09736 BACKGROUND_COLOR = new class09736(class09989.BACKGROUND_COLOR);
    public static final /* enum */ class09736 BORDER_COLOR = new class09736(class09989.BORDER_COLOR);
    public static final /* enum */ class09736 COLOR = new class09736(class09989.COLOR);
    public static final /* enum */ class09736 BORDER_RADIUS = new class09736(class09989.BORDER_RADIUS);
    public static final /* enum */ class09736 BORDER_WIDTH = new class09736(class09989.BORDER_WIDTH);
    public static final /* enum */ class09736 GAP = new class09736(class09989.GAP);
    public static final /* enum */ class09736 PADDING_LEFT = new class09736(class09989.PADDING_LEFT);
    public static final /* enum */ class09736 PADDING_RIGHT = new class09736(class09989.PADDING_RIGHT);
    public static final /* enum */ class09736 PADDING_TOP = new class09736(class09989.PADDING_TOP);
    public static final /* enum */ class09736 PADDING_BOTTOM = new class09736(class09989.PADDING_BOTTOM);
    public static final /* enum */ class09736 POSITION_OFFSET_X = new class09736(class09989.POSITION_OFFSET_X);
    public static final /* enum */ class09736 POSITION_OFFSET_Y = new class09736(class09989.POSITION_OFFSET_Y);
    public static final /* enum */ class09736 VISUAL_TRANSLATE_X = new class09736(class09989.VISUAL_TRANSLATE_X);
    public static final /* enum */ class09736 VISUAL_TRANSLATE_Y = new class09736(class09989.VISUAL_TRANSLATE_Y);
    public static final /* enum */ class09736 VISUAL_SCALE = new class09736(class09989.VISUAL_SCALE);
    public static final /* enum */ class09736 VISUAL_ROTATE = new class09736(class09989.VISUAL_ROTATE);
    public static final /* enum */ class09736 WIDTH = new class09736(class09989.WIDTH);
    public static final /* enum */ class09736 HEIGHT = new class09736(class09989.HEIGHT);
    public static final /* enum */ class09736 BACKDROP_SHADOW_RADIUS = new class09736(class09989.BACKDROP_SHADOW_RADIUS);
    public static final /* enum */ class09736 BACKDROP_SHADOW_COLOR = new class09736(class09989.BACKDROP_SHADOW_COLOR);
    public static final /* enum */ class09736 OPACITY = new class09736(class09989.OPACITY);
    private final class09989 styleField;
    private static final /* synthetic */ class09736[] $VALUES;

    public boolean L(class09980 class099802, class09980 class099803) {
        return switch (this.ordinal()) {
            case 3 -> {
                if (class099802.W().L() && class099803.W().L()) {
                    yield true;
                }
                yield false;
            }
            case 5 -> {
                if (class099802.E().L() && class099803.E().L()) {
                    yield true;
                }
                yield false;
            }
            case 16 -> class09736.N(class099802.Q(), class099803.Q());
            case 17 -> class09736.N(class099802.O(), class099803.O());
            default -> true;
        };
    }

    private static class09962 L(class09738 class097382, float f) {
        class09962 class099622 = class097382.z();
        class09962 class099623 = class097382.U();
        if (class099622 == null || class099623 == null || class099622.u() != class099623.u()) {
            return class099623;
        }
        float f2 = class09712.N(class099622.i(), class099623.i(), f);
        float f3 = class09712.N(class099622.R(), class099623.R(), f);
        if (f3 < f2) {
            f3 = f2;
        }
        float f4 = class09712.N(class099622.M(), class099623.M(), f);
        return switch (class099622.u()) {
            default -> throw new MatchException(null, null);
            case class09982.FIXED -> class09962.y((float)f4);
            case class09982.PERCENT -> class09962.N((float)f4);
            case class09982.FIT -> class09962.N((float)f2, (float)f3);
            case class09982.GROW -> class09962.y((float)f2, (float)f3);
        };
    }

    public boolean L() {
        return this.styleField.R();
    }

    private class09736(class09989 class099892) {
        this.styleField = class099892;
    }

    static {
        $VALUES = class09736.i();
    }

    public static class09736[] values() {
        return (class09736[])$VALUES.clone();
    }

    public static class09736 valueOf(String string) {
        return Enum.valueOf(class09736.class, string);
    }

    private static /* synthetic */ class09736[] i() {
        return new class09736[]{BACKGROUND_COLOR, BORDER_COLOR, COLOR, BORDER_RADIUS, BORDER_WIDTH, GAP, PADDING_LEFT, PADDING_RIGHT, PADDING_TOP, PADDING_BOTTOM, POSITION_OFFSET_X, POSITION_OFFSET_Y, VISUAL_TRANSLATE_X, VISUAL_TRANSLATE_Y, VISUAL_SCALE, VISUAL_ROTATE, WIDTH, HEIGHT, BACKDROP_SHADOW_RADIUS, BACKDROP_SHADOW_COLOR, OPACITY};
    }

    public class09989 u() {
        return this.styleField;
    }

    public boolean y() {
        return this.styleField.i();
    }

    public void y(class09743 class097432) {
        if (!this.N(class097432)) {
            throw new IllegalArgumentException(this.name() + " does not support transition spec " + class097432.getClass().getName());
        }
    }

    private static class09666 y(class09738 class097382, float f) {
        class09666 class096662 = class097382.E();
        class09666 class096663 = class097382.W();
        if (class096662 == null || class096663 == null) {
            return class096663 == null ? class09666.N : class096663;
        }
        return class09666.N(class09712.N(class096662.y(), class096663.y(), f), class09712.N(class096662.L(), class096663.L(), f));
    }

    public class09980 y(class09980 class099802, class09980 class099803) {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class099803.y(class099802.o());
            case 1 -> class099803.u(class099802.e());
            case 2 -> class099803.i(class099802.H());
            case 3 -> class099803.N(class099802.N());
            case 4 -> class099803.M(class099802.m());
            case 5 -> class099803.N(class099802.E());
            case 6 -> class099803.L(class099802.U().L());
            case 7 -> class099803.u(class099802.U().u());
            case 8 -> class099803.i(class099802.U().i());
            case 9 -> class099803.R(class099802.U().R());
            case 10 -> class099803.B(class099802.j());
            case 11 -> class099803.Z(class099802.v());
            case 12 -> class099803.N(class099802.n());
            case 13 -> class099803.y(class099802.t());
            case 14 -> class099803.z(class099802.G());
            case 15 -> class099803.U(class099802.l());
            case 16 -> class099803.N(class099802.Q());
            case 17 -> class099803.y(class099802.O());
            case 18 -> class099803.W(class099802.K());
            case 19 -> class099803.L(class099802.V());
            case 20 -> class099803.s(class099802.f());
        };
    }

    public boolean y(class09980 class099802, class09980 class099803, class09743 class097432) {
        return this.N(class097432) && this.L(class099802, class099803);
    }

    public boolean N(class09980 class099802, class09980 class099803) {
        return this.styleField.N(class099802, class099803);
    }

    public class09782 N() {
        return switch (this.ordinal()) {
            case 0, 1, 2, 19 -> class09782.COLOR;
            case 16, 17 -> class09782.AXIS_SIZE;
            case 12, 13 -> class09782.TRANSLATE_LENGTH;
            default -> class09782.FLOAT;
        };
    }

    private static float N(float f) {
        return Math.max(0.0f, f);
    }

    private int N(class09738 class097382, float f) {
        return class09712.N(class097382.R(), class097382.M(), f);
    }

    private static boolean N(class09962 class099622, class09962 class099623) {
        class09982 class099822;
        if (class099622 == null || class099623 == null) {
            return false;
        }
        class09982 class099823 = class099622.u();
        if (class099823 != (class099822 = class099623.u())) {
            return false;
        }
        return switch (class099823) {
            default -> throw new MatchException(null, null);
            case class09982.FIXED, class09982.PERCENT -> {
                if (Float.isFinite(class099622.M()) && Float.isFinite(class099623.M())) {
                    yield true;
                }
                yield false;
            }
            case class09982.FIT, class09982.GROW -> Float.isFinite(class099622.i()) && Float.isFinite(class099622.R()) && Float.isFinite(class099623.i()) && Float.isFinite(class099623.R());
        };
    }

    public boolean N(class09743 class097432) {
        Objects.requireNonNull(class097432, "spec");
        if (!class097432.u() || class097432 instanceof class09728) {
            return true;
        }
        if (class097432 instanceof class09815) {
            return ((class09815)class097432).N(this.N());
        }
        return false;
    }

    public boolean N(class09738 class097382, class09980 class099802) {
        return class097382.N(this.N(class099802));
    }

    public class09980 N(class09980 class099802, class09738 class097382) {
        class09996 class099962 = class099802.R();
        this.N(class099962, class097382);
        return class099962.N();
    }

    public void N(class09996 class099962, class09738 class097382) {
        if (class097382.m() == class09733.RUNTIME_VALUE) {
            this.N(class099962, class097382.u());
            return;
        }
        float f = class097382.y();
        switch (this.ordinal()) {
            case 0: {
                class099962.y(this.N(class097382, f));
                break;
            }
            case 1: {
                class099962.u(this.N(class097382, f));
                break;
            }
            case 2: {
                class099962.i(this.N(class097382, f));
                break;
            }
            case 3: {
                class099962.N(class09965.N((float)class097382.L()));
                break;
            }
            case 4: {
                class099962.N(class097382.L());
                break;
            }
            case 5: {
                class099962.N(class10009.N((float)class097382.L()));
                break;
            }
            case 6: {
                class099962.N(Float.valueOf(class09736.N(class097382.L())), null, null, null);
                break;
            }
            case 7: {
                class099962.N(null, Float.valueOf(class09736.N(class097382.L())), null, null);
                break;
            }
            case 8: {
                class099962.N(null, null, Float.valueOf(class09736.N(class097382.L())), null);
                break;
            }
            case 9: {
                class099962.N(null, null, null, Float.valueOf(class09736.N(class097382.L())));
                break;
            }
            case 10: {
                class099962.y(class097382.L());
                break;
            }
            case 11: {
                class099962.L(class097382.L());
                break;
            }
            case 12: {
                class099962.N(class09736.y(class097382, f));
                break;
            }
            case 13: {
                class099962.y(class09736.y(class097382, f));
                break;
            }
            case 14: {
                class099962.u(class097382.L());
                break;
            }
            case 15: {
                class099962.i(class097382.L());
                break;
            }
            case 16: {
                class099962.N(class09736.L(class097382, f));
                break;
            }
            case 17: {
                class099962.y(class09736.L(class097382, f));
                break;
            }
            case 18: {
                class099962.M(class097382.L());
                break;
            }
            case 19: {
                class099962.L(this.N(class097382, f));
                break;
            }
            case 20: {
                class099962.z(class097382.L());
            }
        }
    }

    public class09980 N(class09980 class099802, class09753 class097532) {
        class09996 class099962 = class099802.R();
        this.N(class099962, class097532);
        return class099962.N();
    }

    public void N(class09996 class099962, class09753 class097532) {
        switch (this.ordinal()) {
            case 0: {
                class099962.y(class097532.L());
                break;
            }
            case 1: {
                class099962.u(class097532.L());
                break;
            }
            case 2: {
                class099962.i(class097532.L());
                break;
            }
            case 3: {
                class099962.N(class09965.N((float)class097532.y()));
                break;
            }
            case 4: {
                class099962.N(class097532.y());
                break;
            }
            case 5: {
                class099962.N(class10009.N((float)class097532.y()));
                break;
            }
            case 6: {
                class099962.N(Float.valueOf(class09736.N(class097532.y())), null, null, null);
                break;
            }
            case 7: {
                class099962.N(null, Float.valueOf(class09736.N(class097532.y())), null, null);
                break;
            }
            case 8: {
                class099962.N(null, null, Float.valueOf(class09736.N(class097532.y())), null);
                break;
            }
            case 9: {
                class099962.N(null, null, null, Float.valueOf(class09736.N(class097532.y())));
                break;
            }
            case 10: {
                class099962.y(class097532.y());
                break;
            }
            case 11: {
                class099962.L(class097532.y());
                break;
            }
            case 12: {
                class099962.N(class097532.i());
                break;
            }
            case 13: {
                class099962.y(class097532.i());
                break;
            }
            case 14: {
                class099962.u(class097532.y());
                break;
            }
            case 15: {
                class099962.i(class097532.y());
                break;
            }
            case 16: {
                class099962.N(class097532.u());
                break;
            }
            case 17: {
                class099962.y(class097532.u());
                break;
            }
            case 18: {
                class099962.M(class097532.y());
                break;
            }
            case 19: {
                class099962.L(class097532.L());
                break;
            }
            case 20: {
                class099962.z(class097532.y());
            }
        }
    }

    public class09753 N(class09980 class099802) {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class09753.N(class099802.o());
            case 1 -> class09753.N(class099802.e());
            case 2 -> class09753.N(class099802.H());
            case 3 -> class09753.N(class099802.N());
            case 4 -> class09753.N(class099802.m());
            case 5 -> class09753.N(class099802.E().u());
            case 6 -> class09753.N(class099802.U().L());
            case 7 -> class09753.N(class099802.U().u());
            case 8 -> class09753.N(class099802.U().i());
            case 9 -> class09753.N(class099802.U().R());
            case 10 -> class09753.N(class099802.j());
            case 11 -> class09753.N(class099802.v());
            case 12 -> class09753.N(class099802.n());
            case 13 -> class09753.N(class099802.t());
            case 14 -> class09753.N(class099802.G());
            case 15 -> class09753.N(class099802.l());
            case 16 -> class09753.N(class099802.Q());
            case 17 -> class09753.N(class099802.O());
            case 18 -> class09753.N(class099802.K());
            case 19 -> class09753.N(class099802.V());
            case 20 -> class09753.N(class099802.f());
        };
    }

    public class09738 N(class09980 class099802, class09980 class099803, class09743 class097432) {
        this.y(class097432);
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class09738.N(this, class097432, class099802.o(), class099803.o());
            case 1 -> class09738.N(this, class097432, class099802.e(), class099803.e());
            case 2 -> class09738.N(this, class097432, class099802.H(), class099803.H());
            case 3 -> class09738.N(this, class097432, class099802.N(), class099803.N());
            case 4 -> class09738.N(this, class097432, class099802.m(), class099803.m());
            case 5 -> class09738.N(this, class097432, class099802.E().u(), class099803.E().u());
            case 6 -> class09738.N(this, class097432, class099802.U().L(), class099803.U().L());
            case 7 -> class09738.N(this, class097432, class099802.U().u(), class099803.U().u());
            case 8 -> class09738.N(this, class097432, class099802.U().i(), class099803.U().i());
            case 9 -> class09738.N(this, class097432, class099802.U().R(), class099803.U().R());
            case 10 -> class09738.N(this, class097432, class099802.j(), class099803.j());
            case 11 -> class09738.N(this, class097432, class099802.v(), class099803.v());
            case 12 -> class09738.N(this, class097432, class099802.n(), class099803.n());
            case 13 -> class09738.N(this, class097432, class099802.t(), class099803.t());
            case 14 -> class09738.N(this, class097432, class099802.G(), class099803.G());
            case 15 -> class09738.N(this, class097432, class099802.l(), class099803.l());
            case 16 -> class09738.N(this, class097432, class099802.Q(), class099803.Q());
            case 17 -> class09738.N(this, class097432, class099802.O(), class099803.O());
            case 18 -> class09738.N(this, class097432, class099802.K(), class099803.K());
            case 19 -> class09738.N(this, class097432, class099802.V(), class099803.V());
            case 20 -> class09738.N(this, class097432, class099802.f(), class099803.f());
        };
    }
}

