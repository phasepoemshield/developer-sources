/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10668
 *  Nursultan.class10671
 *  Nursultan.class10672
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01391
 *  minecraft.class01407
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class01583
 *  minecraft.class01590
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06752
 *  minecraft.class06754
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06959
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionfc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
package minecraft;

import Nursultan.class10668;
import Nursultan.class10671;
import Nursultan.class10672;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import minecraft.class01391;
import minecraft.class01407;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class01583;
import minecraft.class01590;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06752;
import minecraft.class06754;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06959;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;
import org.joml.Vector4f;
import org.joml.Vector4fc;

final class class06720
extends Record {
    private final boolean opaque;
    final List<class10668> lines;
    final List<class06754> quads;
    final List<class06752> triangleFans;
    final List<class10672> texts;
    final List<class10671> points;

    private void L(class01421 class014212, class01407 class014072, class06959 class069592) {
        class01391 class013912 = class014072.method_73477(class06851.n());
        class01423 class014232 = class014212.L();
        double d = class069592.y.N();
        double d2 = class069592.y.y();
        double d3 = class069592.y.L();
        for (class06754 class067542 : this.quads) {
            class013912.N(class014232, (float)(class067542.N().N() - d), (float)(class067542.N().y() - d2), (float)(class067542.N().L() - d3)).method_39415(class067542.i());
            class013912.N(class014232, (float)(class067542.y().N() - d), (float)(class067542.y().y() - d2), (float)(class067542.y().L() - d3)).method_39415(class067542.i());
            class013912.N(class014232, (float)(class067542.L().N() - d), (float)(class067542.L().y() - d2), (float)(class067542.L().L() - d3)).method_39415(class067542.i());
            class013912.N(class014232, (float)(class067542.u().N() - d), (float)(class067542.u().y() - d2), (float)(class067542.u().L() - d3)).method_39415(class067542.i());
        }
    }

    public List<class06754> L() {
        return this.quads;
    }

    class06720(boolean bl) {
        this(bl, new ArrayList<class10668>(), new ArrayList<class06754>(), new ArrayList<class06752>(), new ArrayList<class10672>(), new ArrayList<class10671>());
    }

    private class06720(boolean bl, List<class10668> list, List<class06754> list2, List<class06752> list3, List<class10672> list4, List<class10671> list5) {
        this.opaque = bl;
        this.lines = list;
        this.quads = list2;
        this.triangleFans = list3;
        this.texts = list4;
        this.points = list5;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06720.class, "opaque;lines;quads;triangleFans;texts;points", "opaque", "lines", "quads", "triangleFans", "texts", "points"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06720.class, "opaque;lines;quads;triangleFans;texts;points", "opaque", "lines", "quads", "triangleFans", "texts", "points"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06720.class, "opaque;lines;quads;triangleFans;texts;points", "opaque", "lines", "quads", "triangleFans", "texts", "points"}, this);
    }

    public List<class10672> i() {
        return this.texts;
    }

    public List<class06752> u() {
        return this.triangleFans;
    }

    private void u(class01421 class014212, class01407 class014072, class06959 class069592) {
        class01391 class013912 = class014072.method_73477(class06851.t());
        class01423 class014232 = class014212.L();
        double d = class069592.y.N();
        double d2 = class069592.y.y();
        double d3 = class069592.y.L();
        for (class10671 class106712 : this.points) {
            class013912.N(class014232, (float)(class106712.N().N() - d), (float)(class106712.N().y() - d2), (float)(class106712.N().L() - d3)).method_39415(class106712.y()).method_75298(class106712.L());
        }
    }

    public List<class10668> y() {
        return this.lines;
    }

    private void y(class01421 class014212, class01407 class014072, class06959 class069592) {
        class01423 class014232 = class014212.L();
        double d = class069592.y.N();
        double d2 = class069592.y.y();
        double d3 = class069592.y.L();
        for (class06752 class067522 : this.triangleFans) {
            class01391 class013912 = class014072.method_73477(class06851.l());
            for (class06889 class068892 : class067522.N()) {
                class013912.N(class014232, (float)(class068892.N() - d), (float)(class068892.y() - d2), (float)(class068892.L() - d3)).method_39415(class067522.y());
            }
        }
    }

    private void y(class01421 class014212, class01407 class014072, class06959 class069592, Matrix4f matrix4f) {
        class01391 class013912 = class014072.method_73477(this.opaque ? class06851.b() : class06851.j());
        class01423 class014232 = class014212.L();
        Vector4f vector4f = new Vector4f();
        Vector4f vector4f2 = new Vector4f();
        Vector4f vector4f3 = new Vector4f();
        Vector4f vector4f4 = new Vector4f();
        Vector4f vector4f5 = new Vector4f();
        double d = class069592.y.N();
        double d2 = class069592.y.y();
        double d3 = class069592.y.L();
        for (class10668 class106682 : this.lines) {
            boolean bl;
            vector4f.set(class106682.N().N() - d, class106682.N().y() - d2, class106682.N().L() - d3, 1.0);
            vector4f2.set(class106682.y().N() - d, class106682.y().y() - d2, class106682.y().L() - d3, 1.0);
            vector4f.mul((Matrix4fc)matrix4f, vector4f3);
            vector4f2.mul((Matrix4fc)matrix4f, vector4f4);
            boolean bl2 = vector4f3.z > -0.05f;
            boolean bl3 = bl = vector4f4.z > -0.05f;
            if (bl2 && bl) continue;
            if (bl2 || bl) {
                float f = vector4f4.z - vector4f3.z;
                if (Math.abs(f) < 1.0E-9f) continue;
                float f2 = class04995.N((float)((-0.05f - vector4f3.z) / f), (float)0.0f, (float)1.0f);
                vector4f.lerp((Vector4fc)vector4f2, f2, vector4f5);
                if (bl2) {
                    vector4f.set((Vector4fc)vector4f5);
                } else {
                    vector4f2.set((Vector4fc)vector4f5);
                }
            }
            class013912.N(class014232, vector4f.x, vector4f.y, vector4f.z).y(class014232, vector4f2.x - vector4f.x, vector4f2.y - vector4f.y, vector4f2.z - vector4f.z).method_39415(class106682.L()).method_75298(class106682.u());
            class013912.N(class014232, vector4f2.x, vector4f2.y, vector4f2.z).y(class014232, vector4f2.x - vector4f.x, vector4f2.y - vector4f.y, vector4f2.z - vector4f.z).method_39415(class106682.L()).method_75298(class106682.u());
        }
    }

    public void N(class01421 class014212, class01407 class014072, class06959 class069592, Matrix4f matrix4f) {
        this.L(class014212, class014072, class069592);
        this.y(class014212, class014072, class069592);
        this.y(class014212, class014072, class069592, matrix4f);
        this.N(class014212, class014072, class069592);
        this.u(class014212, class014072, class069592);
    }

    public boolean N() {
        return this.opaque;
    }

    private void N(class01421 class014212, class01407 class014072, class06959 class069592) {
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        if (!class069592.L) {
            return;
        }
        double d = class069592.y.N();
        double d2 = class069592.y.y();
        double d3 = class069592.y.L();
        for (class10672 class106722 : this.texts) {
            class014212.N();
            class014212.N((float)(class106722.N().N() - d), (float)(class106722.N().y() - d2), (float)(class106722.N().L() - d3));
            class014212.N((Quaternionfc)class069592.i);
            class014212.y(class106722.L().L() / 16.0f, -class106722.L().L() / 16.0f, class106722.L().L() / 16.0f);
            float f = class106722.L().u().isEmpty() ? (float)(-class015902.y(class106722.y())) / 2.0f : (float)(-class106722.L().u().getAsDouble()) / class106722.L().L();
            class015902.N(class106722.y(), f, 0.0f, class106722.L().y(), false, class014212.L().N(), class014072, class01583.field_33993, 0, 0xF000F0);
            class014212.y();
        }
    }

    public List<class10671> R() {
        return this.points;
    }
}

