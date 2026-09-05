/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class02566
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class06244
 *  minecraft.class06271
 *  minecraft.class06597
 *  minecraft.class07311
 *  org.joml.Quaternionfc
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class02566;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class06244;
import minecraft.class06271;
import minecraft.class06597;
import minecraft.class07311;
import org.joml.Quaternionfc;

final class class00963
extends Record {
    final class06271<class06244> model;
    final class01421 poseStack;
    final class07311 renderType;
    final int color;

    public class07311 L() {
        return this.renderType;
    }

    private class00963(class06271<class06244> class062712, class01421 class014212, class07311 class073112, int n) {
        this.model = class062712;
        this.poseStack = class014212;
        this.renderType = class073112;
        this.color = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00963.class, "model;poseStack;renderType;color", "model", "poseStack", "renderType", "color"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00963.class, "model;poseStack;renderType;color", "model", "poseStack", "renderType", "color"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00963.class, "model;poseStack;renderType;color", "model", "poseStack", "renderType", "color"}, this);
    }

    public int u() {
        return this.color;
    }

    public class01421 y() {
        return this.poseStack;
    }

    public static class00963 N(class06597 class065972, class05363 class053632, float f) {
        float f2 = ((float)class065972.field_3866 + f) / (float)class065972.field_3847;
        int n = class02566.N((float)(0.05f + 0.5f * class04995.m((double)(f2 * (float)Math.PI))), (float)1.0f, (float)1.0f, (float)1.0f);
        class01421 class014212 = new class01421();
        class014212.N();
        class014212.N((Quaternionfc)class053632.M());
        class014212.N((Quaternionfc)class02058.y.N(60.0f - 150.0f * f2));
        float f3 = 0.42553192f;
        class014212.y(0.42553192f, -0.42553192f, -0.42553192f);
        class014212.N(0.0f, -0.56f, 3.5f);
        return new class00963((class06271<class06244>)class065972.N, class014212, class065972.y, n);
    }

    public class06271<class06244> N() {
        return this.model;
    }
}

