/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03265
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03265;
import minecraft.class03662;

public final class class03702
extends Record {
    private final class03265 thirdPersonLeftHand;
    private final class03265 thirdPersonRightHand;
    private final class03265 firstPersonLeftHand;
    private final class03265 firstPersonRightHand;
    private final class03265 head;
    private final class03265 gui;
    private final class03265 ground;
    private final class03265 fixed;
    private final class03265 fixedFromBottom;
    public static final class03702 N = new class03702(class03265.N, class03265.N, class03265.N, class03265.N, class03265.N, class03265.N, class03265.N, class03265.N, class03265.N);

    public class03265 L() {
        return this.firstPersonLeftHand;
    }

    public class03265 M() {
        return this.ground;
    }

    public class03702(class03265 class032652, class03265 class032653, class03265 class032654, class03265 class032655, class03265 class032656, class03265 class032657, class03265 class032658, class03265 class032659, class03265 class0326510) {
        this.thirdPersonLeftHand = class032652;
        this.thirdPersonRightHand = class032653;
        this.firstPersonLeftHand = class032654;
        this.firstPersonRightHand = class032655;
        this.head = class032656;
        this.gui = class032657;
        this.ground = class032658;
        this.fixed = class032659;
        this.fixedFromBottom = class0326510;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03702.class, "thirdPersonLeftHand;thirdPersonRightHand;firstPersonLeftHand;firstPersonRightHand;head;gui;ground;fixed;fixedFromBottom", "thirdPersonLeftHand", "thirdPersonRightHand", "firstPersonLeftHand", "firstPersonRightHand", "head", "gui", "ground", "fixed", "fixedFromBottom"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03702.class, "thirdPersonLeftHand;thirdPersonRightHand;firstPersonLeftHand;firstPersonRightHand;head;gui;ground;fixed;fixedFromBottom", "thirdPersonLeftHand", "thirdPersonRightHand", "firstPersonLeftHand", "firstPersonRightHand", "head", "gui", "ground", "fixed", "fixedFromBottom"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03702.class, "thirdPersonLeftHand;thirdPersonRightHand;firstPersonLeftHand;firstPersonRightHand;head;gui;ground;fixed;fixedFromBottom", "thirdPersonLeftHand", "thirdPersonRightHand", "firstPersonLeftHand", "firstPersonRightHand", "head", "gui", "ground", "fixed", "fixedFromBottom"}, this);
    }

    public class03265 B() {
        return this.fixed;
    }

    public class03265 Z() {
        return this.fixedFromBottom;
    }

    public class03265 i() {
        return this.head;
    }

    public class03265 u() {
        return this.firstPersonRightHand;
    }

    public class03265 y() {
        return this.thirdPersonRightHand;
    }

    public class03265 N() {
        return this.thirdPersonLeftHand;
    }

    public class03265 N(class03662 class036622) {
        return switch (class036622) {
            case class03662.field_4323 -> this.thirdPersonLeftHand;
            case class03662.field_4320 -> this.thirdPersonRightHand;
            case class03662.field_4321 -> this.firstPersonLeftHand;
            case class03662.field_4322 -> this.firstPersonRightHand;
            case class03662.field_4316 -> this.head;
            case class03662.field_4317 -> this.gui;
            case class03662.field_4318 -> this.ground;
            case class03662.field_4319 -> this.fixed;
            case class03662.field_61988 -> this.fixedFromBottom;
            default -> class03265.N;
        };
    }

    public class03265 R() {
        return this.gui;
    }
}

