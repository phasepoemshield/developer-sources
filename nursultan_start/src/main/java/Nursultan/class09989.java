/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09693
 *  Nursultan.class10009
 */
package Nursultan;

import Nursultan.class09693;
import Nursultan.class09966;
import Nursultan.class09968;
import Nursultan.class09980;
import Nursultan.class09984;
import Nursultan.class10008;
import Nursultan.class10009;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public final class class09989
extends Enum<class09989> {
    public static final /* enum */ class09989 LAYOUT_DIRECTION = new class09989(true, true, true, false, class09980::M, class09984.N(class09980::M), object -> object);
    public static final /* enum */ class09989 ALIGN_X = new class09989(true, true, true, false, class09980::B, class09984.N(class09980::B), object -> object);
    public static final /* enum */ class09989 ALIGN_Y = new class09989(true, true, true, false, class09980::Z, class09984.N(class09980::Z), object -> object);
    public static final /* enum */ class09989 BOX_SIZING = new class09989(true, true, true, false, class09980::z, class09984.N(class09980::z), object -> object);
    public static final /* enum */ class09989 PADDING_LEFT = new class09989(true, true, true, true, class099802 -> Float.valueOf(class099802.U().L()), class09984.N(class099802 -> class099802.U().L()), class09989::y);
    public static final /* enum */ class09989 PADDING_RIGHT = new class09989(true, true, true, true, class099802 -> Float.valueOf(class099802.U().u()), class09984.N(class099802 -> class099802.U().u()), object -> object);
    public static final /* enum */ class09989 PADDING_TOP = new class09989(true, true, true, true, class099802 -> Float.valueOf(class099802.U().i()), class09984.N(class099802 -> class099802.U().i()), object -> object);
    public static final /* enum */ class09989 PADDING_BOTTOM = new class09989(true, true, true, true, class099802 -> Float.valueOf(class099802.U().R()), class09984.N(class099802 -> class099802.U().R()), object -> object);
    public static final /* enum */ class09989 GAP = new class09989(true, true, true, true, class09980::E, class09984.N(class09980::E), class09989::L);
    public static final /* enum */ class09989 BORDER_RADIUS = new class09989(true, true, true, true, class09980::W, class09984.N(class09980::W), object -> object);
    public static final /* enum */ class09989 BORDER_WIDTH = new class09989(true, true, true, true, class09980::m, class09984.N(class09980::m), object -> object);
    public static final /* enum */ class09989 BORDER_POSITION = new class09989(true, true, true, false, class09980::P, class09984.N(class09980::P), object -> object);
    public static final /* enum */ class09989 POSITION = new class09989(true, true, true, false, class09980::s, class09984.N(class09980::s), object -> object);
    public static final /* enum */ class09989 Z_INDEX = new class09989(true, true, true, false, class099802 -> new class09966(class099802.T(), class099802.b()), (class099802, class099803) -> class099802.T() != class099803.T() || class099802.b() != class099803.b(), object -> object);
    public static final /* enum */ class09989 POSITION_OFFSET_X = new class09989(true, true, true, true, class09980::j, class09984.N(class09980::j), object -> object);
    public static final /* enum */ class09989 POSITION_OFFSET_Y = new class09989(true, true, true, true, class09980::v, class09984.N(class09980::v), object -> object);
    public static final /* enum */ class09989 ANCHOR_KEY = new class09989(true, true, true, false, class09980::x, class09984.N(class09980::x), object -> object);
    public static final /* enum */ class09989 ANCHOR_SIDE = new class09989(true, true, true, false, class09980::D, class09984.N(class09980::D), object -> object);
    public static final /* enum */ class09989 ANCHOR_GAP = new class09989(true, true, true, false, class09980::h, class09984.N(class09980::h), object -> object);
    public static final /* enum */ class09989 ANCHOR_ALIGN = new class09989(true, true, true, false, class09980::r, class09984.N(class09980::r), object -> object);
    public static final /* enum */ class09989 ANCHOR_FLIP = new class09989(true, true, true, false, class09980::NN, class09984.N(class09980::NN), object -> object);
    public static final /* enum */ class09989 ANCHOR_CLAMP = new class09989(true, true, true, false, class09980::Ny, class09984.N(class09980::Ny), object -> object);
    public static final /* enum */ class09989 VISUAL_TRANSLATE_X = new class09989(true, true, true, true, class09980::n, class09984.N(class09980::n), object -> object);
    public static final /* enum */ class09989 VISUAL_TRANSLATE_Y = new class09989(true, true, true, true, class09980::t, class09984.N(class09980::t), object -> object);
    public static final /* enum */ class09989 VISUAL_SCALE = new class09989(true, true, true, true, class09980::G, class09984.N(class09980::G), class09989::R);
    public static final /* enum */ class09989 VISUAL_ROTATE = new class09989(true, true, true, true, class09980::l, class09984.N(class09980::l), class09989::M);
    public static final /* enum */ class09989 CLIP = new class09989(true, true, true, false, class09980::d, class09984.N(class09980::d), object -> object);
    public static final /* enum */ class09989 OVERFLOW_Y = new class09989(true, true, true, false, class09980::w, class09984.N(class09980::w), object -> object);
    public static final /* enum */ class09989 SCROLLBAR_MODE = new class09989(true, true, true, false, class09980::k, class09984.N(class09980::k), object -> object);
    public static final /* enum */ class09989 SCROLLBAR_TRACK_WIDTH = new class09989(true, true, true, false, class099802 -> Float.valueOf(class099802.Y().N()), class09984.N(class099802 -> class099802.Y().N()), object -> object);
    public static final /* enum */ class09989 SCROLLBAR_TRACK_PADDING = new class09989(true, true, true, false, class099802 -> Float.valueOf(class099802.Y().y()), class09984.N(class099802 -> class099802.Y().y()), object -> object);
    public static final /* enum */ class09989 SCROLLBAR_THUMB_MIN_HEIGHT = new class09989(true, true, true, false, class099802 -> Float.valueOf(class099802.Y().u()), class09984.N(class099802 -> class099802.Y().u()), object -> object);
    public static final /* enum */ class09989 SCROLLBAR_TRACK_COLOR = new class09989(true, true, true, false, class099802 -> class099802.Y().i(), class09984.N(class099802 -> class099802.Y().i()), object -> object);
    public static final /* enum */ class09989 SCROLLBAR_TRACK_HOVER_COLOR = new class09989(true, true, true, false, class099802 -> class099802.Y().R(), class09984.N(class099802 -> class099802.Y().R()), object -> object);
    public static final /* enum */ class09989 SCROLLBAR_TRACK_ACTIVE_COLOR = new class09989(true, true, true, false, class099802 -> class099802.Y().M(), class09984.N(class099802 -> class099802.Y().M()), object -> object);
    public static final /* enum */ class09989 SCROLLBAR_THUMB_COLOR = new class09989(true, true, true, false, class099802 -> class099802.Y().B(), class09984.N(class099802 -> class099802.Y().B()), object -> object);
    public static final /* enum */ class09989 SCROLLBAR_THUMB_HOVER_COLOR = new class09989(true, true, true, false, class099802 -> class099802.Y().Z(), class09984.N(class099802 -> class099802.Y().Z()), object -> object);
    public static final /* enum */ class09989 SCROLLBAR_THUMB_ACTIVE_COLOR = new class09989(true, true, true, false, class099802 -> class099802.Y().z(), class09984.N(class099802 -> class099802.Y().z()), object -> object);
    public static final /* enum */ class09989 WIDTH = new class09989(true, true, true, true, class09980::Q, class09984.N(class09980::Q), object -> object);
    public static final /* enum */ class09989 HEIGHT = new class09989(true, true, true, true, class09980::O, class09984.N(class09980::O), object -> object);
    public static final /* enum */ class09989 VISIBLE = new class09989(true, true, true, false, class09980::g, class09984.N(class09980::g), object -> object);
    public static final /* enum */ class09989 FOCUSABLE = new class09989(true, true, true, false, class09980::I, class09984.N(class09980::I), object -> object);
    public static final /* enum */ class09989 POINTER_TRANSPARENT = new class09989(true, true, true, false, class09980::J, class09984.N(class09980::J), object -> object);
    public static final /* enum */ class09989 BACKGROUND_COLOR = new class09989(true, true, true, true, class09980::o, class09984.N(class09980::o), object -> object);
    public static final /* enum */ class09989 BACKDROP_BLUR_RADIUS = new class09989(true, true, true, false, class09980::q, class09984.N(class09980::q), object -> object);
    public static final /* enum */ class09989 BACKDROP_SHADOW_RADIUS = new class09989(true, true, true, true, class09980::K, class09984.N(class09980::K), object -> object);
    public static final /* enum */ class09989 BACKDROP_SHADOW_COLOR = new class09989(true, true, true, true, class09980::V, class09984.N(class09980::V), object -> object);
    public static final /* enum */ class09989 BORDER_COLOR = new class09989(true, true, true, true, class09980::e, class09984.N(class09980::e), object -> object);
    public static final /* enum */ class09989 COLOR = new class09989(true, true, true, true, class09980::H, class09984.N(class09980::H), object -> object);
    public static final /* enum */ class09989 TEXT_FONT_SIZE = new class09989(true, true, true, false, class09980::c, class09984.N(class09980::c), class09989::u);
    public static final /* enum */ class09989 TEXT_FONT_SPEC = new class09989(true, true, true, false, class09980::X, class09984.N(class09980::X), object -> object);
    public static final /* enum */ class09989 TEXT_WRAP = new class09989(true, true, true, false, class09980::a, class09984.N(class09980::a), object -> object);
    public static final /* enum */ class09989 TEXT_OUTLINE_COLOR = new class09989(true, true, true, false, class09980::p, class09984.N(class09980::p), object -> object);
    public static final /* enum */ class09989 TEXT_OUTLINE_WIDTH = new class09989(true, true, true, false, class09980::F, class09984.N(class09980::F), object -> object);
    public static final /* enum */ class09989 TRANSITIONS = new class09989(true, true, true, false, class09980::A, class09984.N(class09980::A), object -> object);
    public static final /* enum */ class09989 OPACITY = new class09989(true, true, true, true, class09980::f, class09984.N(class09980::f), class09989::i);
    public static final /* enum */ class09989 BLUR_RADIUS = new class09989(true, true, true, false, class09980::C, class09984.N(class09980::C), class09989::B);
    public static final /* enum */ class09989 TEXTURE_UV = new class09989(true, true, true, false, class09980::S, class09984.N(class09980::S), object -> object);
    private static final List<class09989> LAYOUT_AFFECTING_FIELDS;
    private static final List<class09989> POSITION_AFFECTING_FIELDS;
    private static final List<class09989> DRAW_AFFECTING_FIELDS;
    private static final List<class09989> ANIMATABLE_FIELDS;
    private final boolean layoutAffecting;
    private final boolean positionAffecting;
    private final boolean drawAffecting;
    private final boolean animatable;
    private final Function<class09980, Object> reader;
    private final BiPredicate<class09980, class09980> changed;
    private final UnaryOperator<Object> sanitizer;
    private static final /* synthetic */ class09989[] $VALUES;

    public static List<class09989> L() {
        return DRAW_AFFECTING_FIELDS;
    }

    private static Object L(Object object) {
        return class10009.class.cast(object);
    }

    public boolean M() {
        return this.drawAffecting;
    }

    private static Object M(Object object) {
        float f = ((Float)object).floatValue();
        return Float.valueOf(Float.isFinite(f) ? f : 0.0f);
    }

    private class09989(boolean bl, boolean bl2, boolean bl3, boolean bl4, Function<class09980, Object> function, BiPredicate<class09980, class09980> biPredicate, UnaryOperator<Object> unaryOperator) {
        this.layoutAffecting = bl;
        this.positionAffecting = bl2;
        this.drawAffecting = bl3;
        this.animatable = bl4;
        this.reader = function;
        this.changed = biPredicate;
        this.sanitizer = unaryOperator;
    }

    private class09989(boolean bl, boolean bl2, boolean bl3, Function<class09980, Object> function, BiPredicate<class09980, class09980> biPredicate, UnaryOperator<Object> unaryOperator) {
        this(bl, false, bl2, bl3, function, biPredicate, unaryOperator);
    }

    private class09989(boolean bl, boolean bl2, boolean bl3, boolean bl4, Function<class09980, Object> function, BiPredicate<class09980, class09980> biPredicate) {
        this(bl, bl2, bl3, bl4, function, biPredicate, object -> object);
    }

    private class09989(boolean bl, boolean bl2, boolean bl3, Function<class09980, Object> function, BiPredicate<class09980, class09980> biPredicate) {
        this(bl, false, bl2, bl3, function, biPredicate, object -> object);
    }

    static {
        $VALUES = class09989.Z();
        LAYOUT_AFFECTING_FIELDS = Arrays.stream(class09989.values()).filter(class09989::i).toList();
        POSITION_AFFECTING_FIELDS = Arrays.stream(class09989.values()).filter(class09989::R).toList();
        DRAW_AFFECTING_FIELDS = Arrays.stream(class09989.values()).filter(class09989::M).toList();
        ANIMATABLE_FIELDS = Arrays.stream(class09989.values()).filter(class09989::B).toList();
    }

    public static class09989[] values() {
        return (class09989[])$VALUES.clone();
    }

    public static class09989 valueOf(String string) {
        return Enum.valueOf(class09989.class, string);
    }

    private static Object B(Object object) {
        return Float.valueOf(Math.max(0.0f, ((Float)object).floatValue()));
    }

    public boolean B() {
        return this.animatable;
    }

    private static /* synthetic */ class09989[] Z() {
        return new class09989[]{LAYOUT_DIRECTION, ALIGN_X, ALIGN_Y, BOX_SIZING, PADDING_LEFT, PADDING_RIGHT, PADDING_TOP, PADDING_BOTTOM, GAP, BORDER_RADIUS, BORDER_WIDTH, BORDER_POSITION, POSITION, Z_INDEX, POSITION_OFFSET_X, POSITION_OFFSET_Y, ANCHOR_KEY, ANCHOR_SIDE, ANCHOR_GAP, ANCHOR_ALIGN, ANCHOR_FLIP, ANCHOR_CLAMP, VISUAL_TRANSLATE_X, VISUAL_TRANSLATE_Y, VISUAL_SCALE, VISUAL_ROTATE, CLIP, OVERFLOW_Y, SCROLLBAR_MODE, SCROLLBAR_TRACK_WIDTH, SCROLLBAR_TRACK_PADDING, SCROLLBAR_THUMB_MIN_HEIGHT, SCROLLBAR_TRACK_COLOR, SCROLLBAR_TRACK_HOVER_COLOR, SCROLLBAR_TRACK_ACTIVE_COLOR, SCROLLBAR_THUMB_COLOR, SCROLLBAR_THUMB_HOVER_COLOR, SCROLLBAR_THUMB_ACTIVE_COLOR, WIDTH, HEIGHT, VISIBLE, FOCUSABLE, POINTER_TRANSPARENT, BACKGROUND_COLOR, BACKDROP_BLUR_RADIUS, BACKDROP_SHADOW_RADIUS, BACKDROP_SHADOW_COLOR, BORDER_COLOR, COLOR, TEXT_FONT_SIZE, TEXT_FONT_SPEC, TEXT_WRAP, TEXT_OUTLINE_COLOR, TEXT_OUTLINE_WIDTH, TRANSITIONS, OPACITY, BLUR_RADIUS, TEXTURE_UV};
    }

    private static Object i(Object object) {
        return Float.valueOf(class09693.N((float)((Float)object).floatValue(), (float)0.0f, (float)1.0f));
    }

    public boolean i() {
        return this.layoutAffecting;
    }

    public static List<class09989> u() {
        return ANIMATABLE_FIELDS;
    }

    private static Object u(Object object) {
        float f = ((Float)object).floatValue();
        if (!Float.isFinite(f) || f <= 0.0f) {
            return Float.valueOf(16.0f);
        }
        return Float.valueOf(f);
    }

    class09980 y(class09980 class099802, Object object) {
        class09980 class099803;
        class09980 class099804 = class099803 = class099802 == null ? class09968.N() : class099802;
        if (object == null) {
            return class099803;
        }
        return class10008.N(class099803, this, object);
    }

    public static List<class09989> y() {
        return POSITION_AFFECTING_FIELDS;
    }

    private static Object y(Object object) {
        float f = ((Float)object).floatValue();
        if (!Float.isFinite(f)) {
            return Float.valueOf(0.0f);
        }
        return Float.valueOf(Math.max(0.0f, f));
    }

    public class09980 N(class09980 class099802, Object object) {
        class09980 class099803 = class099802 == null ? class09968.N() : class099802;
        Object object2 = this.N(object);
        if (object2 == null) {
            return class099803;
        }
        return this.y(class099803, object2);
    }

    public boolean N(class09980 class099802, class09980 class099803) {
        if (class099802 == null || class099803 == null) {
            return class099802 != class099803;
        }
        return this.changed.test(class099802, class099803);
    }

    public static List<class09989> N() {
        return LAYOUT_AFFECTING_FIELDS;
    }

    public Object N(class09980 class099802) {
        if (class099802 == null) {
            return null;
        }
        return this.reader.apply(class099802);
    }

    public Object N(Object object) {
        if (object == null) {
            return null;
        }
        return this.sanitizer.apply(object);
    }

    public boolean R() {
        return this.positionAffecting;
    }

    private static Object R(Object object) {
        float f = ((Float)object).floatValue();
        if (!Float.isFinite(f)) {
            return Float.valueOf(1.0f);
        }
        return Float.valueOf(Math.max(0.0f, f));
    }
}

