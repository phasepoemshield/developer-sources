/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class03475
 *  minecraft.class05855
 *  minecraft.class06246
 *  minecraft.class06254
 *  minecraft.class06262
 *  minecraft.class06270
 *  minecraft.class08247
 *  minecraft.class08280
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class03475;
import minecraft.class05656;
import minecraft.class05658;
import minecraft.class05855;
import minecraft.class06246;
import minecraft.class06254;
import minecraft.class06262;
import minecraft.class06270;
import minecraft.class08247;
import minecraft.class08280;

public final class class05638
extends Record
implements class06270 {
    private final class01894 file;
    private final int height;
    private final int ascent;
    private final int[][] codepointGrid;
    private static final Codec<int[][]> M = Codec.STRING.listOf().xmap(list -> {
        int n = list.size();
        int[][] nArrayArray = new int[n][];
        for (int i = 0; i < n; ++i) {
            nArrayArray[i] = ((String)list.get(i)).codePoints().toArray();
        }
        return nArrayArray;
    }, nArray -> {
        ArrayList<String> arrayList = new ArrayList<String>(((int[][])nArray).length);
        for (int[] nArray2 : nArray) {
            arrayList.add(new String(nArray2, 0, nArray2.length));
        }
        return arrayList;
    }).validate(class05638::N);
    public static final MapCodec<class05638> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("file").forGetter(class05638::L), (App)Codec.INT.optionalFieldOf("height", (Object)8).forGetter(class05638::u), (App)Codec.INT.fieldOf("ascent").forGetter(class05638::i), (App)M.fieldOf("chars").forGetter(class05638::R)).apply(instance, class05638::new)).validate(class05638::N);

    public class01894 L() {
        return this.file;
    }

    public class05638(class01894 class018942, int n, int n2, int[][] nArray) {
        this.file = class018942;
        this.height = n;
        this.ascent = n2;
        this.codepointGrid = nArray;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05638.class, "file;height;ascent;codepointGrid", "file", "height", "ascent", "codepointGrid"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05638.class, "file;height;ascent;codepointGrid", "file", "height", "ascent", "codepointGrid"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05638.class, "file;height;ascent;codepointGrid", "file", "height", "ascent", "codepointGrid"}, this);
    }

    public int i() {
        return this.ascent;
    }

    public int u() {
        return this.height;
    }

    public Either<class06246, class06254> y() {
        return Either.left(this::N);
    }

    private int N(class08280 class082802, int n, int n2, int n3, int n4) {
        int n5;
        for (n5 = n - 1; n5 >= 0; --n5) {
            int n6 = n3 * n + n5;
            for (int i = 0; i < n2; ++i) {
                int n7 = n4 * n2 + i;
                if (class082802.y(n6, n7) == 0) continue;
                return n5 + 1;
            }
        }
        return n5 + 1;
    }

    private class06262 N(class01089 class010892) throws IOException {
        class01894 class018942 = this.file.R("textures/");
        try (InputStream inputStream = class010892.u(class018942);){
            class08280 class082802 = class08280.N((class08247)class08247.field_4997, (InputStream)inputStream);
            int n2 = class082802.N();
            int n3 = class082802.y();
            int n4 = n2 / this.codepointGrid[0].length;
            int n5 = n3 / this.codepointGrid.length;
            float f = (float)this.height / (float)n5;
            class03475 class034752 = new class03475(class05656[]::new, n -> new class05656[n][]);
            for (int i = 0; i < this.codepointGrid.length; ++i) {
                int n6 = 0;
                for (int n7 : this.codepointGrid[i]) {
                    int n8;
                    int n9 = n6++;
                    if (n7 == 0 || (class05656)((Object)class034752.N(n7, (Object)new class05656(f, class082802, n9 * n4, i * n5, n4, n5, (int)(0.5 + (double)((float)(n8 = this.N(class082802, n4, n5, n9, i)) * f)) + 1, this.ascent))) == null) continue;
                    class05658.N.warn("Codepoint '{}' declared multiple times in {}", (Object)Integer.toHexString(n7), (Object)class018942);
                }
            }
            class05658 class056582 = new class05658(class082802, (class03475<class05656>)class034752);
            return class056582;
        }
    }

    private static DataResult<int[][]> N(int[][] nArray) {
        int n = nArray.length;
        if (n == 0) {
            return DataResult.error(() -> "Expected to find data in codepoint grid");
        }
        int n2 = nArray[0].length;
        if (n2 == 0) {
            return DataResult.error(() -> "Expected to find data in codepoint grid");
        }
        for (int i = 1; i < n; ++i) {
            int[] nArray2 = nArray[i];
            if (nArray2.length == n2) continue;
            return DataResult.error(() -> "Lines in codepoint grid have to be the same length (found: " + nArray2.length + " codepoints, expected: " + n2 + "), pad with \\u0000");
        }
        return DataResult.success((Object)nArray);
    }

    private static DataResult<class05638> N(class05638 class056382) {
        if (class056382.ascent > class056382.height) {
            return DataResult.error(() -> "Ascent " + class056382.ascent + " higher than height " + class056382.height);
        }
        return DataResult.success((Object)((Object)class056382));
    }

    public class05855 N() {
        return class05855.field_2312;
    }

    public int[][] R() {
        return this.codepointGrid;
    }
}

