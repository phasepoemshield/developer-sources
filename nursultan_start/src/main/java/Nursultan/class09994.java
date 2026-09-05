/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09668
 *  Nursultan.class09728
 *  Nursultan.class09736
 *  Nursultan.class09743
 *  Nursultan.class09782
 *  Nursultan.class09815
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09668;
import Nursultan.class09728;
import Nursultan.class09736;
import Nursultan.class09743;
import Nursultan.class09782;
import Nursultan.class09815;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;

public final class class09994
extends Record {
    private final class09736 property;
    private final class09743 spec;
    private final class09668 group;

    public class09668 L() {
        return this.group;
    }

    public static class09994 L(class09743 class097432) {
        return class09994.N(class09736.COLOR, class097432);
    }

    public static class09994 M(class09743 class097432) {
        return class09994.N(class09668.PADDING, class097432);
    }

    public static class09994 P(class09743 class097432) {
        return class09994.N(class09736.BACKDROP_SHADOW_COLOR, class097432);
    }

    public class09994(class09736 class097362, class09743 class097432, class09668 class096682) {
        class097432 = class097432 == null ? class09743.Z() : class097432;
        class096682 = class096682 == null ? class09668.SINGLE : class096682;
        class09994.N(class097362, class096682, class097432);
        this.property = class097362;
        this.spec = class097432;
        this.group = class096682;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09994.class, "property;spec;group", "property", "spec", "group"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09994.class, "property;spec;group", "property", "spec", "group"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09994.class, "property;spec;group", "property", "spec", "group"}, this);
    }

    public static class09994 B(class09743 class097432) {
        return class09994.N(class09668.POSITION_OFFSET, class097432);
    }

    public static class09994 Z(class09743 class097432) {
        return class09994.N(class09668.VISUAL_TRANSLATE, class097432);
    }

    public static class09994 i(class09743 class097432) {
        return class09994.N(class09736.BORDER_WIDTH, class097432);
    }

    public static class09994 s(class09743 class097432) {
        return class09994.N(class09736.OPACITY, class097432);
    }

    public static class09994 m(class09743 class097432) {
        return class09994.N(class09736.BACKDROP_SHADOW_RADIUS, class097432);
    }

    public static class09994 U(class09743 class097432) {
        return class09994.N(class09736.VISUAL_ROTATE, class097432);
    }

    public static class09994 z(class09743 class097432) {
        return class09994.N(class09736.VISUAL_SCALE, class097432);
    }

    public static class09994 u(class09743 class097432) {
        return class09994.N(class09736.BORDER_RADIUS, class097432);
    }

    public static class09994 y(class09743 class097432) {
        return class09994.N(class09736.BORDER_COLOR, class097432);
    }

    public class09743 y() {
        return this.spec;
    }

    public static class09994 E(class09743 class097432) {
        return class09994.N(class09736.WIDTH, class097432);
    }

    public class09736 N() {
        return this.property;
    }

    public static class09994 N(class09743 class097432) {
        return class09994.N(class09736.BACKGROUND_COLOR, class097432);
    }

    public static class09994 N(class09736 class097362, class09743 class097432) {
        return new class09994(Objects.requireNonNull(class097362, "property"), class097432, class09668.SINGLE);
    }

    private static class09994 N(class09668 class096682, class09743 class097432) {
        return new class09994(null, class097432, Objects.requireNonNull(class096682, "group"));
    }

    private static void N(class09736 class097362, class09668 class096682, class09743 class097432) {
        if (!class097432.u()) {
            return;
        }
        if (class097432 instanceof class09728) {
            return;
        }
        if (class097432 instanceof class09815) {
            class09815 class098152 = (class09815)class097432;
            class09782 class097822 = class09994.N(class097362, class096682);
            if (class097822 != null && !class098152.N(class097822)) {
                throw new IllegalArgumentException("Transition spec does not support " + String.valueOf(class097822) + " values");
            }
            return;
        }
        throw new IllegalArgumentException("Unsupported transition spec type: " + class097432.getClass().getName());
    }

    private static class09782 N(class09736 class097362, class09668 class096682) {
        if (class097362 != null) {
            return class097362.N();
        }
        return switch (class096682) {
            default -> throw new MatchException(null, null);
            case class09668.SINGLE, class09668.PADDING -> class09782.FLOAT;
            case class09668.POSITION_OFFSET -> class09782.TRANSLATE_LENGTH;
            case class09668.VISUAL_TRANSLATE -> null;
        };
    }

    public static class09994 W(class09743 class097432) {
        return class09994.N(class09736.HEIGHT, class097432);
    }

    public static class09994 R(class09743 class097432) {
        return class09994.N(class09736.GAP, class097432);
    }
}

