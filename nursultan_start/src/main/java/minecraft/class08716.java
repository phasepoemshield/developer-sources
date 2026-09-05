/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 *  minecraft.class01032
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04995
 *  minecraft.class06681
 *  minecraft.class06889
 *  minecraft.class07049
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import minecraft.class00667;
import minecraft.class01032;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04995;
import minecraft.class06681;
import minecraft.class06889;
import minecraft.class07049;

public final class class08716
extends Record {
    private final class06889 position;
    private final class06889 deltaMovement;
    private final float yRot;
    private final float xRot;
    public static final class02362<class00667, class08716> N = class02362.N((class02362)class06889.y, class08716::N, (class02362)class06889.y, class08716::y, (class02362)class02389.E, class08716::L, (class02362)class02389.E, class08716::u, class08716::new);

    public float L() {
        return this.yRot;
    }

    public class08716(class06889 class068892, class06889 class068893, float f, float f2) {
        this.position = class068892;
        this.deltaMovement = class068893;
        this.yRot = f;
        this.xRot = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08716.class, "position;deltaMovement;yRot;xRot", "position", "deltaMovement", "yRot", "xRot"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08716.class, "position;deltaMovement;yRot;xRot", "position", "deltaMovement", "yRot", "xRot"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08716.class, "position;deltaMovement;yRot;xRot", "position", "deltaMovement", "yRot", "xRot"}, this);
    }

    public float u() {
        return this.xRot;
    }

    public class06889 y() {
        return this.deltaMovement;
    }

    public class08716 N(float f, float f2) {
        return new class08716(this.N(), this.y(), f, f2);
    }

    public static class08716 N(class07049 class070492) {
        if (class070492.method_66245()) {
            return new class08716(class070492.method_66233().method_66265(), class070492.method_60478(), class070492.method_66233().method_66268(), class070492.method_66233().method_66269());
        }
        return new class08716(class070492.method_73189(), class070492.method_60478(), class070492.method_36454(), class070492.method_36455());
    }

    private static float N(float f, float f2, float f3) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            return f;
        }
        return class04995.N((float)f, (float)f2, (float)f3);
    }

    public static class08716 N(class08716 class087162, class08716 class087163, Set<class06681> set) {
        double d = set.contains(class06681.field_12400) ? class087162.position.M : 0.0;
        double d2 = set.contains(class06681.field_12398) ? class087162.position.B : 0.0;
        double d3 = set.contains(class06681.field_12403) ? class087162.position.Z : 0.0;
        float f = set.contains(class06681.field_12401) ? class087162.yRot : 0.0f;
        float f2 = set.contains(class06681.field_12397) ? class087162.xRot : 0.0f;
        class06889 class068892 = new class06889(d + class087163.position.M, d2 + class087163.position.B, d3 + class087163.position.Z);
        float f3 = f + class087163.yRot;
        float f4 = class08716.N(f2 + class087163.xRot, -90.0f, 90.0f);
        class06889 class068893 = class087162.deltaMovement;
        if (set.contains(class06681.field_54093)) {
            float f5 = class087162.yRot - f3;
            float f6 = class087162.xRot - f4;
            class068893 = class068893.N((float)Math.toRadians(f6));
            class068893 = class068893.y((float)Math.toRadians(f5));
        }
        class06889 class068894 = new class06889(class08716.N(class068893.M, class087163.deltaMovement.M, set, class06681.field_54090), class08716.N(class068893.B, class087163.deltaMovement.B, set, class06681.field_54091), class08716.N(class068893.Z, class087163.deltaMovement.Z, set, class06681.field_54092));
        return new class08716(class068892, class068894, f3, f4);
    }

    public static class08716 N(class01032 class010322) {
        return new class08716(class010322.L(), class010322.u(), class010322.i(), class010322.R());
    }

    public class06889 N() {
        return this.position;
    }

    private static double N(double d, double d2, Set<class06681> set, class06681 class066812) {
        return set.contains(class066812) ? d + d2 : d2;
    }
}

