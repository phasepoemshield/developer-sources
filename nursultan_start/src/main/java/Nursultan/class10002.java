/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09666
 *  Nursultan.class09689
 *  Nursultan.class09713
 *  Nursultan.class09838
 *  Nursultan.class10009
 */
package Nursultan;

import Nursultan.class09666;
import Nursultan.class09689;
import Nursultan.class09713;
import Nursultan.class09838;
import Nursultan.class09962;
import Nursultan.class09964;
import Nursultan.class09965;
import Nursultan.class09966;
import Nursultan.class09968;
import Nursultan.class09969;
import Nursultan.class09970;
import Nursultan.class09973;
import Nursultan.class09975;
import Nursultan.class09976;
import Nursultan.class09980;
import Nursultan.class09981;
import Nursultan.class09983;
import Nursultan.class09985;
import Nursultan.class09989;
import Nursultan.class09993;
import Nursultan.class10001;
import Nursultan.class10003;
import Nursultan.class10008;
import Nursultan.class10009;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class class10002 {
    public static final class10002 N = new class10002();
    private final EnumMap<class09989, Object> y;
    private final int L;

    public class10002 L(int n) {
        return this.N(class09989.BACKDROP_SHADOW_COLOR, n);
    }

    public class10002 L(float f) {
        return this.N(class09989.PADDING_TOP, Float.valueOf(f));
    }

    public class10002 L(class09973 class099732) {
        return this.N(class09989.ANCHOR_ALIGN, (Object)class099732);
    }

    public class10002 L() {
        return this.N(class09989.Z_INDEX, (Object)new class09966(true, 0));
    }

    public class10002 L(boolean bl) {
        return this.N(class09989.FOCUSABLE, bl);
    }

    public class10002 M(float f) {
        return this.N(class09989.POSITION_OFFSET_X, Float.valueOf(f));
    }

    public class10002 P(float f) {
        return this.N(class09989.TEXT_OUTLINE_WIDTH, Float.valueOf(f));
    }

    public class10002 T(float f) {
        return this.N(class09989.BLUR_RADIUS, Float.valueOf(f));
    }

    private class10002() {
        this.y = new EnumMap(class09989.class);
        this.L = this.y.hashCode();
    }

    private class10002(EnumMap<class09989, Object> enumMap) {
        this.y = class10002.N(enumMap);
        this.L = this.y.hashCode();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof class10002)) {
            return false;
        }
        class10002 class100022 = (class10002)object;
        if (this.L != class100022.L) {
            return false;
        }
        return this.y.equals((Object)class100022.y);
    }

    public String toString() {
        return "StylePatch[values=" + String.valueOf(this.y) + "]";
    }

    public int hashCode() {
        return this.L;
    }

    public class10002 B(float f) {
        return this.N(class09989.POSITION_OFFSET_Y, Float.valueOf(f));
    }

    public class10002 Z(float f) {
        return this.N(class09989.ANCHOR_GAP, Float.valueOf(f));
    }

    public class10002 i(float f) {
        return this.N(class10009.N((float)f));
    }

    public class10002 i(int n) {
        return this.N(class09989.COLOR, n);
    }

    public class10002 s(float f) {
        return this.N(class09989.OPACITY, Float.valueOf(f));
    }

    public class10002 m(float f) {
        return this.N(class09989.TEXT_FONT_SIZE, Float.valueOf(f));
    }

    public class10002 U(float f) {
        return this.N(class09989.VISUAL_ROTATE, Float.valueOf(f));
    }

    public class10002 z(float f) {
        return this.N(class09989.VISUAL_SCALE, Float.valueOf(f));
    }

    public class10002 u(float f) {
        return this.N(class09989.PADDING_BOTTOM, Float.valueOf(f));
    }

    public class10002 u(boolean bl) {
        return this.N(class09989.POINTER_TRANSPARENT, bl);
    }

    private EnumMap<class09989, Object> u() {
        return new EnumMap<class09989, Object>(this.y);
    }

    public class10002 u(int n) {
        return this.N(class09989.BORDER_COLOR, n);
    }

    public class10002 y(int n) {
        return this.N(class09989.BACKGROUND_COLOR, n);
    }

    public Object y(class09989 class099892) {
        if (class099892 == null) {
            return null;
        }
        return this.y.get((Object)class099892);
    }

    public class10002 y(class09962 class099622) {
        return this.N(class09989.HEIGHT, (Object)class099622);
    }

    public class10002 y(class09666 class096662) {
        return this.N(class09989.VISUAL_TRANSLATE_Y, class096662);
    }

    public Set<class09989> y() {
        return Collections.unmodifiableSet(this.y.keySet());
    }

    public class10002 y(class09973 class099732) {
        return this.N(class09989.ALIGN_Y, (Object)class099732);
    }

    public class10002 y(boolean bl) {
        return this.N(class09989.ANCHOR_CLAMP, bl);
    }

    public class10002 y(float f) {
        return this.N(class09989.PADDING_RIGHT, Float.valueOf(f));
    }

    public class10002 E(float f) {
        return this.N(class09989.BACKDROP_BLUR_RADIUS, Float.valueOf(f));
    }

    private static EnumMap<class09989, Object> N(Map<class09989, Object> map) {
        EnumMap<class09989, Object> enumMap = new EnumMap<class09989, Object>(class09989.class);
        if (map == null || map.isEmpty()) {
            return enumMap;
        }
        for (Map.Entry<class09989, Object> entry : map.entrySet()) {
            class10002.N(enumMap, entry.getKey(), entry.getValue());
        }
        return enumMap;
    }

    public boolean N(class09989 class099892) {
        return class099892 != null && this.y.containsKey((Object)class099892);
    }

    private static void N(EnumMap<class09989, Object> enumMap, class09989 class099892, Object object) {
        if (class099892 == null || object == null) {
            return;
        }
        Object object2 = class099892.N(object);
        if (object2 != null) {
            enumMap.put(class099892, object2);
        }
    }

    public class10002 N(class09973 class099732) {
        return this.N(class09989.ALIGN_X, (Object)class099732);
    }

    public class10002 N(class09838 class098382) {
        return this.N(class09989.TEXT_FONT_SPEC, class098382);
    }

    public class10002 N(class09964 class099642) {
        return this.N(class09989.TEXT_WRAP, (Object)class099642);
    }

    public boolean N() {
        return this.y.isEmpty();
    }

    public class10002 N(class09713 class097132) {
        return this.N(class09989.TRANSITIONS, class097132);
    }

    public class10002 N(class10002 class100022) {
        if (class100022 == null || class100022.N()) {
            return this;
        }
        if (this.N()) {
            return class100022;
        }
        EnumMap<class09989, Object> enumMap = this.u();
        enumMap.putAll(class100022.y);
        return new class10002(enumMap);
    }

    public class10002 N(class09689 class096892) {
        return this.N(class09989.TEXTURE_UV, class096892);
    }

    public class10002 N(class09965 class099652) {
        return this.N(class09989.BORDER_RADIUS, (Object)class099652);
    }

    public class10002 N(class09981 class099812) {
        return this.N(class09989.BORDER_POSITION, (Object)class099812);
    }

    public class10002 N(class09969 class099692) {
        return this.N(class09989.POSITION, (Object)class099692);
    }

    public class10002 N(class09989 class099892, Object object) {
        if (class099892 == null || object == null) {
            return this;
        }
        Object object2 = class099892.N(object);
        if (object2 == null || Objects.equals(this.y.get((Object)class099892), object2)) {
            return this;
        }
        EnumMap<class09989, Object> enumMap = this.u();
        enumMap.put(class099892, object2);
        return new class10002(enumMap);
    }

    public class10002 N(int n) {
        return this.N(class09989.Z_INDEX, (Object)new class09966(false, n));
    }

    public class09980 N(class09980 class099802) {
        return class10008.N(class099802 == null ? class09968.N() : class099802, this.y);
    }

    public class10002 N(class09983 class099832) {
        return this.N(class09989.BOX_SIZING, (Object)class099832);
    }

    public class10002 N(class09985 class099852) {
        if (class099852 == null) {
            return this;
        }
        EnumMap<class09989, Object> enumMap = this.u();
        class10002.N(enumMap, class09989.PADDING_LEFT, Float.valueOf(class099852.L()));
        class10002.N(enumMap, class09989.PADDING_RIGHT, Float.valueOf(class099852.u()));
        class10002.N(enumMap, class09989.PADDING_TOP, Float.valueOf(class099852.i()));
        class10002.N(enumMap, class09989.PADDING_BOTTOM, Float.valueOf(class099852.R()));
        return new class10002(enumMap);
    }

    public class10002 N(float f) {
        return this.N(class09989.PADDING_LEFT, Float.valueOf(f));
    }

    public class10002 N(class09975 class099752) {
        return this.N(class09989.LAYOUT_DIRECTION, (Object)class099752);
    }

    public class10002 N(class10009 class100092) {
        return this.N(class09989.GAP, class100092);
    }

    public class10002 N(class09666 class096662) {
        return this.N(class09989.VISUAL_TRANSLATE_X, class096662);
    }

    public class10002 N(class10001 class100012) {
        if (class100012 == null) {
            return this;
        }
        EnumMap<class09989, Object> enumMap = this.u();
        class10002.N(enumMap, class09989.SCROLLBAR_TRACK_WIDTH, Float.valueOf(class100012.N()));
        class10002.N(enumMap, class09989.SCROLLBAR_TRACK_PADDING, Float.valueOf(class100012.y()));
        class10002.N(enumMap, class09989.SCROLLBAR_THUMB_MIN_HEIGHT, Float.valueOf(class100012.u()));
        class10002.N(enumMap, class09989.SCROLLBAR_TRACK_COLOR, class100012.i());
        class10002.N(enumMap, class09989.SCROLLBAR_TRACK_HOVER_COLOR, class100012.R());
        class10002.N(enumMap, class09989.SCROLLBAR_TRACK_ACTIVE_COLOR, class100012.M());
        class10002.N(enumMap, class09989.SCROLLBAR_THUMB_COLOR, class100012.B());
        class10002.N(enumMap, class09989.SCROLLBAR_THUMB_HOVER_COLOR, class100012.Z());
        class10002.N(enumMap, class09989.SCROLLBAR_THUMB_ACTIVE_COLOR, class100012.z());
        return new class10002(enumMap);
    }

    public class10002 N(class09976 class099762) {
        return this.N(class09989.CLIP, (Object)class099762);
    }

    public class10002 N(class09993 class099932) {
        return this.N(class09989.OVERFLOW_Y, (Object)class099932);
    }

    public class10002 N(class09970 class099702) {
        return this.N(class09989.SCROLLBAR_MODE, (Object)class099702);
    }

    public class10002 N(String string) {
        return this.N(class09989.ANCHOR_KEY, string);
    }

    public class10002 N(class09962 class099622) {
        return this.N(class09989.WIDTH, (Object)class099622);
    }

    public class10002 N(class10003 class100032) {
        return this.N(class09989.ANCHOR_SIDE, (Object)class100032);
    }

    public <T> T N(class09989 class099892, Class<T> clazz) {
        Object object = this.y(class099892);
        return object == null ? null : (T)clazz.cast(object);
    }

    public class10002 N(boolean bl) {
        return this.N(class09989.ANCHOR_FLIP, bl);
    }

    public class10002 W(float f) {
        return this.N(class09989.BACKDROP_SHADOW_RADIUS, Float.valueOf(f));
    }

    public class10002 R(int n) {
        return this.N(class09989.TEXT_OUTLINE_COLOR, n);
    }

    public class10002 R(float f) {
        return this.N(class09989.BORDER_WIDTH, Float.valueOf(f));
    }
}

