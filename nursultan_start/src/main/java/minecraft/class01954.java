/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10228
 *  java.lang.MatchException
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01583
 *  minecraft.class01590
 *  minecraft.class03663
 *  minecraft.class03677
 *  minecraft.class03681
 *  minecraft.class03684
 *  minecraft.class04832
 *  minecraft.class05630
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06851
 *  minecraft.class07926
 *  minecraft.class08284
 *  org.joml.Matrix4f
 */
package minecraft;

import Nursultan.class10228;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01583;
import minecraft.class01590;
import minecraft.class01987;
import minecraft.class03663;
import minecraft.class03677;
import minecraft.class03681;
import minecraft.class03684;
import minecraft.class04832;
import minecraft.class05630;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06851;
import minecraft.class07926;
import minecraft.class08284;
import org.joml.Matrix4f;

public class class01954
extends class01987<class03677, class03681, class08284> {
    private final class01590 N;

    protected class01954(class04832 class048322) {
        super(class048322);
        this.N = class048322.z();
    }

    @Override
    public void N(class08284 class082842, class01421 class014212, class01237 class012372, int n, float f) {
        int n2;
        float f2;
        class03681 class036812 = class082842.N;
        byte by = class036812.i();
        boolean bl = (by & 2) != 0;
        boolean bl2 = (by & 4) != 0;
        boolean bl3 = (by & 1) != 0;
        class03684 class036842 = class03677.L((byte)by);
        byte by2 = (byte)class036812.L().method_48889(f);
        if (bl2) {
            f2 = ((class05630)class06202.Nq().i_7).N(0.25f);
            n2 = (int)(f2 * 255.0f) << 24;
        } else {
            n2 = class036812.u().method_48889(f);
        }
        f2 = 0.0f;
        Matrix4f matrix4f = class014212.L().N();
        matrix4f.rotate((float)Math.PI, 0.0f, 1.0f, 0.0f);
        matrix4f.scale(-0.025f, -0.025f, -0.025f);
        class03663 class036632 = class082842.B;
        boolean bl4 = true;
        Objects.requireNonNull(this.N);
        int n3 = 10;
        int n4 = class036632.y();
        int n5 = class036632.N().size() * n3 - 1;
        matrix4f.translate(1.0f - (float)n4 / 2.0f, (float)(-n5), 0.0f);
        if (n2 != 0) {
            class012372.N(class014212, bl ? class06851.U() : class06851.z(), (class014232, class013912) -> {
                class013912.N(class014232, -1.0f, -1.0f, 0.0f).method_39415(n2).method_60803(n);
                class013912.N(class014232, -1.0f, (float)n5, 0.0f).method_39415(n2).method_60803(n);
                class013912.N(class014232, (float)n4, (float)n5, 0.0f).method_39415(n2).method_60803(n);
                class013912.N(class014232, (float)n4, -1.0f, 0.0f).method_39415(n2).method_60803(n);
            });
        }
        class07926 class079262 = class012372.N(n2 != 0 ? 1 : 0);
        for (class10228 class102282 : class036632.N()) {
            float f3 = switch (class036842) {
                default -> throw new MatchException(null, null);
                case class03684.field_42451 -> 0.0f;
                case class03684.field_42452 -> n4 - class102282.y();
                case class03684.field_42450 -> (float)n4 / 2.0f - (float)class102282.y() / 2.0f;
            };
            class079262.N(class014212, f3, f2, class102282.N(), bl3, bl ? class01583.field_33994 : class01583.field_33995, n, by2 << 24 | 0xFFFFFF, 0, 0);
            f2 += (float)n3;
        }
    }

    private class03663 N(class00392 class003922, int n) {
        List var3 = this.N.L((class05936)class003922, n);
        ArrayList<class10228> arrayList = new ArrayList<class10228>(var3.size());
        int n2 = 0;
        for (class01028 class010282 : var3) {
            int n3 = this.N.N(class010282);
            n2 = Math.max(n2, n3);
            arrayList.add(new class10228(class010282, n3));
        }
        return new class03663(arrayList, n2);
    }

    @Override
    public void method_62354(class03677 class036772, class08284 class082842, float f) {
        super.method_62354(class036772, class082842, f);
        class082842.N = class036772.n();
        class082842.B = class036772.N(this::N);
    }

    public class08284 method_55269() {
        return new class08284();
    }
}

