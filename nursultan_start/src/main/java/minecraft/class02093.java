/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  minecraft.class00140
 *  minecraft.class00167
 *  minecraft.class01894
 *  minecraft.class01991
 *  minecraft.class02028
 *  minecraft.class02052
 *  minecraft.class04673
 *  minecraft.class05913
 *  minecraft.class07211
 *  minecraft.class08496
 *  minecraft.class08505
 *  minecraft.class08511
 *  minecraft.class08512
 *  minecraft.class08534
 *  minecraft.class08814
 *  minecraft.class08823
 *  minecraft.class08838
 *  net.caffeinemc.mods.sodium.client.render.immediate.model.ImprovedItemModelBuilder
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import minecraft.class00140;
import minecraft.class00167;
import minecraft.class01894;
import minecraft.class01991;
import minecraft.class02028;
import minecraft.class02052;
import minecraft.class02067;
import minecraft.class02081;
import minecraft.class02122;
import minecraft.class02124;
import minecraft.class04673;
import minecraft.class05913;
import minecraft.class07211;
import minecraft.class08496;
import minecraft.class08505;
import minecraft.class08511;
import minecraft.class08512;
import minecraft.class08534;
import minecraft.class08814;
import minecraft.class08823;
import minecraft.class08838;
import net.caffeinemc.mods.sodium.client.render.immediate.model.ImprovedItemModelBuilder;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class02093
implements class00167 {
    public static final class01894 y = class01894.y((String)"builtin/generated");
    public static final List<String> L = List.of("layer0", "layer1", "layer2", "layer3", "layer4");
    public static final float u = 7.5f;
    public static final float i = 8.5f;
    private static final class08814 M = new class08823().N("particle", "layer0").N();
    private static final class02052 B = new class02052(0.0f, 0.0f, 16.0f, 16.0f);
    private static final class02052 Z = new class02052(16.0f, 0.0f, 0.0f, 16.0f);
    public static final float R = 0.1f;

    private static List y(class01991 class019912, String string, int n) {
        float f = 16.0f / (float)class019912.method_45807();
        float f2 = 16.0f / (float)class019912.method_45815();
        ArrayList<class02081> arrayList = new ArrayList<class02081>();
        for (class02122 class021222 : class02093.N(class019912)) {
            float f3;
            float f4;
            float f5 = class021222.y();
            float f6 = class021222.L();
            class02124 class021242 = class021222.N();
            float f7 = f5 + 0.1f;
            float f8 = f5 + 1.0f - 0.1f;
            if (class021242.y()) {
                f4 = f6 + 0.1f;
                f3 = f6 + 1.0f - 0.1f;
            } else {
                f4 = f6 + 1.0f - 0.1f;
                f3 = f6 + 0.1f;
            }
            float f9 = f5;
            float f10 = f6;
            float f11 = f5;
            float f12 = f6;
            switch (class021242.ordinal()) {
                case 0: {
                    f11 += 1.0f;
                    break;
                }
                case 1: {
                    f11 += 1.0f;
                    f10 += 1.0f;
                    f12 += 1.0f;
                    break;
                }
                case 2: {
                    f12 += 1.0f;
                    break;
                }
                case 3: {
                    f9 += 1.0f;
                    f11 += 1.0f;
                    f12 += 1.0f;
                }
            }
            f9 *= f;
            f11 *= f;
            f10 *= f2;
            f12 *= f2;
            f10 = 16.0f - f10;
            f12 = 16.0f - f12;
            Map<class07211, class02067> map = Map.of(class021242.N(), new class02067(null, n, string, new class02052(f7 * f, f4 * f, f8 * f2, f3 * f2), class08511.field_57029));
            switch (class021242.ordinal()) {
                case 0: {
                    arrayList.add(new class02081((Vector3fc)new Vector3f(f9, f10, 7.5f), (Vector3fc)new Vector3f(f11, f10, 8.5f), map));
                    break;
                }
                case 1: {
                    arrayList.add(new class02081((Vector3fc)new Vector3f(f9, f12, 7.5f), (Vector3fc)new Vector3f(f11, f12, 8.5f), map));
                    break;
                }
                case 2: {
                    arrayList.add(new class02081((Vector3fc)new Vector3f(f9, f10, 7.5f), (Vector3fc)new Vector3f(f9, f12, 8.5f), map));
                    break;
                }
                case 3: {
                    arrayList.add(new class02081((Vector3fc)new Vector3f(f11, f10, 7.5f), (Vector3fc)new Vector3f(f11, f12, 8.5f), map));
                }
            }
        }
        return arrayList;
    }

    public static boolean N(class01991 class019912, int n, int n2, int n3, int n4, int n5) {
        if (n2 < 0 || n3 < 0 || n2 >= n4 || n3 >= n5) {
            return true;
        }
        return class019912.method_45810(n, n2, n3);
    }

    private static void N(class02124 class021242, Set<class02122> set, class01991 class019912, int n, int n2, int n3, int n4, int n5) {
        if (class02093.N(class019912, n, n2 - class021242.field_4276.P(), n3 - class021242.field_4276.s(), n4, n5)) {
            set.add(new class02122(class021242, n2, n3));
        }
    }

    private static List N(class01991 class019912, String string, int n, Operation operation) {
        return ImprovedItemModelBuilder.bakeSideQuads((class01991)class019912, (String)string, (int)n);
    }

    private static class08496 N(class08838 class088382, class02028 class020282, class04673 class046732, class08512 class085122) {
        String string;
        class05913 class059132;
        ArrayList<class02081> arrayList = new ArrayList<class02081>();
        for (int i = 0; i < L.size() && (class059132 = class088382.N(string = L.get(i))) != null; ++i) {
            class01991 class019912 = class020282.y().N(class059132, class085122).method_45851();
            arrayList.addAll(class02093.N(i, string, class019912));
        }
        return class08505.N(arrayList, (class08838)class088382, (class02028)class020282, (class04673)class046732, (class08512)class085122);
    }

    private static List<class02081> N(int n, String string, class01991 class019912) {
        Map<class07211, class02067> map = Map.of(class07211.field_11035, new class02067(null, n, string, B, class08511.field_57029), class07211.field_11043, new class02067(null, n, string, Z, class08511.field_57029));
        ArrayList<class02081> arrayList = new ArrayList<class02081>();
        arrayList.add(new class02081((Vector3fc)new Vector3f(0.0f, 0.0f, 7.5f), (Vector3fc)new Vector3f(16.0f, 16.0f, 8.5f), map));
        arrayList.addAll(class02093.N(class019912, string, n));
        return arrayList;
    }

    private static List<class02081> N(class01991 class019912, String string, int n) {
        return class02093.N(class019912, string, n, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_7764, java.lang.String, int]");
            Object[] objectArray2 = objectArray;
            return class02093.y((class01991)objectArray[0], (String)objectArray2[1], (Integer)objectArray2[2]);
        });
    }

    private static Collection<class02122> N(class01991 class019912) {
        int n = class019912.method_45807();
        int n2 = class019912.method_45815();
        HashSet<class02122> hashSet = new HashSet<class02122>();
        class019912.method_45817().forEach(n3 -> {
            for (int i = 0; i < n2; ++i) {
                for (int j = 0; j < n; ++j) {
                    if (!(!class02093.N(class019912, n3, j, i, n, n2))) continue;
                    class02093.N(class02124.field_4281, hashSet, class019912, n3, j, i, n, n2);
                    class02093.N(class02124.field_4277, hashSet, class019912, n3, j, i, n, n2);
                    class02093.N(class02124.field_4278, hashSet, class019912, n3, j, i, n, n2);
                    class02093.N(class02124.field_4283, hashSet, class019912, n3, j, i, n, n2);
                }
            }
        });
        return hashSet;
    }

    public class08814 comp_3743() {
        return M;
    }

    public @Nullable class00140 comp_3740() {
        return class00140.field_21858;
    }

    public class08534 comp_3739() {
        return class02093::N;
    }
}

