/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00516
 *  minecraft.class00737
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05042
 *  minecraft.class06681
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import minecraft.class00381;
import minecraft.class00516;
import minecraft.class00737;
import minecraft.class01026;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05042;
import minecraft.class06681;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;

public final class class01032
extends Record {
    private final class04782 newLevel;
    private final class06889 position;
    private final class06889 deltaMovement;
    private final float yRot;
    private final float xRot;
    private final boolean missingRespawnBlock;
    private final boolean asPassenger;
    private final Set<class06681> relatives;
    private final class01026 postTeleportTransition;
    public static final class01026 N = class070492 -> {};
    public static final class01026 y = class01032::N;
    public static final class01026 L = class01032::y;

    public class06889 L() {
        return this.position;
    }

    public boolean M() {
        return this.missingRespawnBlock;
    }

    public class01032(class04782 class047822, class06889 class068892, class06889 class068893, float f, float f2, class01026 class010262) {
        this(class047822, class068892, class068893, f, f2, Set.of(), class010262);
    }

    public class01032(class04782 class047822, class06889 class068892, class06889 class068893, float f, float f2, boolean bl, boolean bl2, Set<class06681> set, class01026 class010262) {
        this.newLevel = class047822;
        this.position = class068892;
        this.deltaMovement = class068893;
        this.yRot = f;
        this.xRot = f2;
        this.missingRespawnBlock = bl;
        this.asPassenger = bl2;
        this.relatives = set;
        this.postTeleportTransition = class010262;
    }

    public class01032(class04782 class047822, class06889 class068892, class06889 class068893, float f, float f2, Set<class06681> set, class01026 class010262) {
        this(class047822, class068892, class068893, f, f2, false, false, set, class010262);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01032.class, "newLevel;position;deltaMovement;yRot;xRot;missingRespawnBlock;asPassenger;relatives;postTeleportTransition", "newLevel", "position", "deltaMovement", "yRot", "xRot", "missingRespawnBlock", "asPassenger", "relatives", "postTeleportTransition"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01032.class, "newLevel;position;deltaMovement;yRot;xRot;missingRespawnBlock;asPassenger;relatives;postTeleportTransition", "newLevel", "position", "deltaMovement", "yRot", "xRot", "missingRespawnBlock", "asPassenger", "relatives", "postTeleportTransition"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01032.class, "newLevel;position;deltaMovement;yRot;xRot;missingRespawnBlock;asPassenger;relatives;postTeleportTransition", "newLevel", "position", "deltaMovement", "yRot", "xRot", "missingRespawnBlock", "asPassenger", "relatives", "postTeleportTransition"}, this);
    }

    public boolean B() {
        return this.asPassenger;
    }

    public Set<class06681> Z() {
        return this.relatives;
    }

    public float i() {
        return this.yRot;
    }

    public class01026 z() {
        return this.postTeleportTransition;
    }

    public class06889 u() {
        return this.deltaMovement;
    }

    private static void y(class07049 class070492) {
        class070492.method_60950(class07209.method_49638((class00737)class070492.method_73189()));
    }

    public class04782 y() {
        return this.newLevel;
    }

    public static class01032 y(class04770 class047702, class01026 class010262) {
        class04782 class047822 = class047702.method_51469().method_8503().yi();
        class05042 class050422 = class047822.method_74854();
        return new class01032(class047822, class01032.N(class047822, (class07049)class047702), class06889.L, class050422.u(), class050422.i(), true, false, Set.of(), class010262);
    }

    public class01032 N(float f, float f2) {
        return new class01032(this.y(), this.L(), this.u(), f, f2, this.M(), this.B(), this.Z(), this.z());
    }

    public class01032 N(class06889 class068892) {
        return new class01032(this.y(), class068892, this.u(), this.i(), this.R(), this.M(), this.B(), this.Z(), this.z());
    }

    private static void N(class07049 class070492) {
        if (class070492 instanceof class04770) {
            ((class04770)class070492).field_13987.method_14364((class00381)new class00516(1032, class07209.field_10980, 0, false));
        }
    }

    private static class06889 N(class04782 class047822, class07049 class070492) {
        return class070492.method_14245(class047822, class047822.method_74854().y()).method_61082();
    }

    public class01032 N() {
        return new class01032(this.y(), this.L(), this.u(), this.i(), this.R(), this.M(), true, this.Z(), this.z());
    }

    public static class01032 N(class04770 class047702, class01026 class010262) {
        class04782 class047822 = class047702.method_51469().method_8503().yi();
        class05042 class050422 = class047822.method_74854();
        return new class01032(class047822, class01032.N(class047822, (class07049)class047702), class06889.L, class050422.u(), class050422.i(), false, false, Set.of(), class010262);
    }

    public float R() {
        return this.xRot;
    }
}

