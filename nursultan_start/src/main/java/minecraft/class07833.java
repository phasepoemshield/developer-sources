/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00765
 *  minecraft.class00780
 *  minecraft.class00782
 *  minecraft.class00795
 *  minecraft.class00869
 *  minecraft.class01296
 *  minecraft.class01376
 *  minecraft.class01607
 *  minecraft.class03001
 *  minecraft.class03519
 *  minecraft.class03529
 *  minecraft.class04084
 *  minecraft.class04206
 *  minecraft.class04995
 *  minecraft.class05324
 *  minecraft.class05474
 *  minecraft.class05517
 *  minecraft.class05946
 *  minecraft.class05974
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07321
 *  minecraft.class08050
 *  minecraft.class08088
 *  net.fabricmc.fabric.mixin.registry.sync.DebugLevelSourceAccessor
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import minecraft.class00500;
import minecraft.class00765;
import minecraft.class00780;
import minecraft.class00782;
import minecraft.class00795;
import minecraft.class00869;
import minecraft.class01296;
import minecraft.class01376;
import minecraft.class01607;
import minecraft.class03001;
import minecraft.class03519;
import minecraft.class03529;
import minecraft.class04084;
import minecraft.class04206;
import minecraft.class04995;
import minecraft.class05324;
import minecraft.class05474;
import minecraft.class05517;
import minecraft.class05946;
import minecraft.class05974;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07321;
import minecraft.class07830;
import minecraft.class08050;
import minecraft.class08088;
import net.fabricmc.fabric.mixin.registry.sync.DebugLevelSourceAccessor;

public class class07833
extends class08088
implements DebugLevelSourceAccessor {
    public static final MapCodec<class07833> u = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03519.u((class05946)class00795.y)).apply(instance, instance.stable(class07833::new)));
    private static final int Z = 2;
    public static List<class00500> z = StreamSupport.stream(class04206.i.spliterator(), false).flatMap(class008912 -> class008912.E().N().stream()).collect(Collectors.toList());
    public static int U = class04995.u((float)class04995.N((float)z.size()));
    public static int E = class04995.u((float)((float)z.size() / (float)U));
    protected static final class00500 i = class00869.N.W();
    protected static final class00500 R = class00869.ZX.W();
    public static final int M = 70;
    public static final int B = 60;

    public int M() {
        return 0;
    }

    public class07833(class03529<class00780> class035292) {
        super((class00765)new class00782(class035292));
    }

    public int i() {
        return 384;
    }

    public static /* synthetic */ void y(int n) {
        E = n;
    }

    protected MapCodec<? extends class08088> y() {
        return u;
    }

    public void N(class01607 class016072, class05324 class053242, class04084 class040842, class08050 class080502) {
    }

    public void N(class01607 class016072) {
    }

    public static /* synthetic */ void N(List list) {
        z = list;
    }

    public static /* synthetic */ void N(int n) {
        U = n;
    }

    public static class00500 N(int n, int n2) {
        int n3;
        class00500 class005002 = i;
        if (n > 0 && n2 > 0 && n % 2 != 0 && n2 % 2 != 0 && (n /= 2) <= U && (n2 /= 2) <= E && (n3 = class04995.N((int)(n * U + n2))) < z.size()) {
            class005002 = z.get(n3);
        }
        return class005002;
    }

    public void N(List<String> list, class04084 class040842, class07209 class072092) {
    }

    public class01376 N(int n, int n2, class05474 class054742, class04084 class040842) {
        return new class01376(0, new class00500[0]);
    }

    public int N(int n, int n2, class07830 class078302, class05474 class054742, class04084 class040842) {
        return 0;
    }

    public void N(class05974 class059742, class08050 class080502, class05324 class053242) {
        class07218 class072182 = new class07218();
        class07321 class073212 = class080502.R();
        int n = class073212.B;
        int n2 = class073212.Z;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                int n3 = class01296.N((int)n, (int)i);
                int n4 = class01296.N((int)n2, (int)j);
                class059742.method_8652((class07209)class072182.N(n3, 60, n4), R, 2);
                class00500 class005002 = class07833.N(n3, n4);
                class059742.method_8652((class07209)class072182.N(n3, 70, n4), class005002, 2);
            }
        }
    }

    public CompletableFuture<class08050> N(class03001 class030012, class04084 class040842, class05324 class053242, class08050 class080502) {
        return CompletableFuture.completedFuture(class080502);
    }

    public void N(class01607 class016072, long l, class04084 class040842, class05517 class055172, class05324 class053242, class08050 class080502) {
    }

    public int R() {
        return 63;
    }
}

