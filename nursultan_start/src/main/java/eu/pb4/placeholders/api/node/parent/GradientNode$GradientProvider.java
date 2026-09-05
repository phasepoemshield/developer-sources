/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.impl.color.HSV
 *  eu.pb4.placeholders.impl.color.OkLab
 *  eu.pb4.placeholders.impl.color.OkLch
 *  minecraft.class04995
 *  minecraft.class05194
 */
package eu.pb4.placeholders.api.node.parent;

import eu.pb4.placeholders.impl.color.HSV;
import eu.pb4.placeholders.impl.color.OkLab;
import eu.pb4.placeholders.impl.color.OkLch;
import java.util.ArrayList;
import java.util.List;
import minecraft.class04995;
import minecraft.class05194;

@FunctionalInterface
public interface GradientNode$GradientProvider {
    public static GradientNode$GradientProvider colors(List<class05194> list) {
        return GradientNode$GradientProvider.colorsOkLab(list);
    }

    public static GradientNode$GradientProvider colorsOkLab(List<class05194> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (class05194 class051942 : list) {
            arrayList.add(OkLab.fromRgb((int)class051942.N()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new OkLab(1.0f, 1.0f, 1.0f));
        } else if (arrayList.size() == 1) {
            arrayList.add((OkLab)arrayList.getFirst());
        }
        int n = arrayList.size();
        return (n2, n3) -> {
            float f = (float)n3 / (float)(n - 1);
            float f2 = (float)n2 % f / f;
            OkLab okLab = (OkLab)arrayList.get(Math.min((int)((float)n2 / f), n - 1));
            OkLab okLab2 = (OkLab)arrayList.get(Math.min((int)((float)n2 / f) + 1, n - 1));
            float f3 = class04995.B((float)f2, (float)okLab.l(), (float)okLab2.l());
            float f4 = class04995.B((float)f2, (float)okLab.a(), (float)okLab2.a());
            float f5 = class04995.B((float)f2, (float)okLab.b(), (float)okLab2.b());
            return class05194.N((int)OkLab.toRgb((float)f3, (float)f4, (float)f5));
        };
    }

    public static GradientNode$GradientProvider rainbowOkLch(float f, float f2, float f3, float f4) {
        float f5 = f3 < 0.0f ? -f3 : 0.0f;
        return (n, n2) -> class05194.N((int)OkLch.toRgb((float)f2, (float)(f / 2.0f), (float)(((float)n * f3 * ((float)Math.PI * 2) + f5 * (float)n2) / (float)n2 + f4)));
    }

    public static GradientNode$GradientProvider rainbowOkLch(float f, float f2, float f3, float f4, int n) {
        float f5 = f3 < 0.0f ? -f3 : 0.0f;
        return (n2, n3) -> class05194.N((int)OkLch.toRgb((float)f2, (float)(f / 2.0f), (float)((((float)n2 * f3 * ((float)Math.PI * 2) + f5 * (float)n3) / (float)(n + 1) + f4) % 1.0f)));
    }

    public static GradientNode$GradientProvider colorsHvs(List<class05194> list) {
        ArrayList<HSV> arrayList = new ArrayList<HSV>(list.size());
        for (class05194 class051942 : list) {
            arrayList.add(HSV.fromRgb((int)class051942.N()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new HSV(1.0f, 1.0f, 1.0f));
        } else if (arrayList.size() == 1) {
            arrayList.add((HSV)arrayList.get(0));
        }
        int n = arrayList.size();
        return (n2, n3) -> {
            float f;
            double d = ((double)n - 1.0) / (double)n3;
            float f2 = (float)n3 / (float)(n - 1);
            float f3 = (float)n2 % f2 / f2;
            HSV hSV = (HSV)arrayList.get(Math.min((int)((float)n2 / f2), n - 1));
            HSV hSV2 = (HSV)arrayList.get(Math.min((int)((float)n2 / f2) + 1, n - 1));
            float f4 = f + (float)((double)Math.abs(f = hSV2.h() - hSV.h()) > 0.50001 ? (f < 0.0f ? 1 : -1) : 0);
            float f5 = (float)((double)hSV.h() + (double)f4 * d * (double)((float)n2 % f2));
            if (f5 < 0.0f) {
                f5 += 1.0f;
            } else if (f5 > 1.0f) {
                f5 -= 1.0f;
            }
            float f6 = f5;
            f = class04995.N((float)(hSV2.s() * f3 + hSV.s() * (1.0f - f3)), (float)0.0f, (float)1.0f);
            f4 = class04995.N((float)(hSV2.v() * f3 + hSV.v() * (1.0f - f3)), (float)0.0f, (float)1.0f);
            return class05194.N((int)HSV.toRgb((float)class04995.N((float)f6, (float)0.0f, (float)1.0f), (float)f, (float)f4));
        };
    }

    public static GradientNode$GradientProvider rainbowHvs(float f, float f2, float f3, float f4, int n) {
        float f5 = f3 < 0.0f ? -f3 : 0.0f;
        return (n2, n3) -> class05194.N((int)HSV.toRgb((float)((((float)n2 * f3 + f5 * (float)n3) / (float)(n + 1) + f4) % 1.0f), (float)f, (float)f2));
    }

    public static GradientNode$GradientProvider rainbowHvs(float f, float f2, float f3, float f4) {
        float f5 = f3 < 0.0f ? -f3 : 0.0f;
        return (n, n2) -> class05194.N((int)HSV.toRgb((float)(((float)n * f3 + f5 * (float)n2) / (float)(n2 + 1) + f4), (float)f, (float)f2));
    }

    public class05194 getColorAt(int var1, int var2);

    public static GradientNode$GradientProvider rainbow(float f, float f2, float f3, float f4) {
        return GradientNode$GradientProvider.rainbowHvs(f, f2, f3, f4);
    }

    public static GradientNode$GradientProvider rainbow(float f, float f2, float f3, float f4, int n) {
        return GradientNode$GradientProvider.rainbowHvs(f, f2, f3, f4, n);
    }

    public static GradientNode$GradientProvider colorsHard(List<class05194> list) {
        int n = list.size();
        return (n2, n3) -> {
            if (n3 == 0) {
                return (class05194)list.get(0);
            }
            float f = (float)n3 / (float)n;
            return (class05194)list.get(Math.min((int)((float)n2 / f), n - 1));
        };
    }
}

