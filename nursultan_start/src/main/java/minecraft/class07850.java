/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00765
 *  minecraft.class00782
 *  minecraft.class00869
 *  minecraft.class01376
 *  minecraft.class01584
 *  minecraft.class01607
 *  minecraft.class01905
 *  minecraft.class02045
 *  minecraft.class03001
 *  minecraft.class03543
 *  minecraft.class04084
 *  minecraft.class04412
 *  minecraft.class05324
 *  minecraft.class05474
 *  minecraft.class05517
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07536
 *  minecraft.class08050
 *  minecraft.class08088
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import minecraft.class00500;
import minecraft.class00765;
import minecraft.class00782;
import minecraft.class00869;
import minecraft.class01376;
import minecraft.class01584;
import minecraft.class01607;
import minecraft.class01905;
import minecraft.class02045;
import minecraft.class03001;
import minecraft.class03543;
import minecraft.class04084;
import minecraft.class04412;
import minecraft.class05324;
import minecraft.class05474;
import minecraft.class05517;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07536;
import minecraft.class07830;
import minecraft.class07841;
import minecraft.class08050;
import minecraft.class08088;

public class class07850
extends class08088 {
    public static final MapCodec<class07850> u = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01584.N.fieldOf("settings").forGetter(class07850::B)).apply(instance, instance.stable(class07850::new)));
    private final class01584 i;

    public int M() {
        return 0;
    }

    public class07850(class01584 class015842) {
        super((class00765)new class00782(class015842.u()), class07536.y_4(arg_0 -> ((class01584)class015842).N(arg_0)));
        this.i = class015842;
    }

    public class01584 B() {
        return this.i;
    }

    public int i() {
        return 384;
    }

    protected MapCodec<? extends class08088> y() {
        return u;
    }

    public class02045 N(class01905<class04412> class019052, class04084 class040842, long l) {
        Stream stream = this.i.L().map(class03543::N).orElseGet(() -> class019052.z().map(class035292 -> class035292));
        return class02045.N((class04084)class040842, (long)l, (class00765)this.y, (Stream)stream);
    }

    public void N(class01607 class016072, long l, class04084 class040842, class05517 class055172, class05324 class053242, class08050 class080502) {
    }

    public int N(int n, int n2, class07830 class078302, class05474 class054742, class04084 class040842) {
        List list = this.i.R();
        for (int i = Math.min(list.size() - 1, class054742.method_31600()); i >= 0; --i) {
            class00500 class005002 = (class00500)list.get(i);
            if (class005002 == null || !class078302.u().test(class005002)) continue;
            return class054742.method_31607() + i + 1;
        }
        return class054742.method_31607();
    }

    public CompletableFuture<class08050> N(class03001 class030012, class04084 class040842, class05324 class053242, class08050 class080502) {
        List list = this.i.R();
        class07218 class072182 = new class07218();
        class07841 class078412 = class080502.N(class07830.field_13195);
        class07841 class078413 = class080502.N(class07830.field_13194);
        for (int i = 0; i < Math.min(class080502.method_31605(), list.size()); ++i) {
            class00500 class005002 = (class00500)list.get(i);
            if (class005002 == null) continue;
            int n = class080502.method_31607() + i;
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    class080502.N((class07209)class072182.N(j, n, k), class005002);
                    class078412.N(j, n, k, class005002);
                    class078413.N(j, n, k, class005002);
                }
            }
        }
        return CompletableFuture.completedFuture(class080502);
    }

    public int N(class05474 class054742) {
        return class054742.method_31607() + Math.min(class054742.method_31605(), this.i.R().size());
    }

    public void N(class01607 class016072, class05324 class053242, class04084 class040842, class08050 class080502) {
    }

    public void N(class01607 class016072) {
    }

    public void N(List<String> list, class04084 class040842, class07209 class072092) {
    }

    public class01376 N(int n, int n2, class05474 class054742, class04084 class040842) {
        return new class01376(class054742.method_31607(), (class00500[])this.i.R().stream().limit(class054742.method_31605()).map(class005002 -> class005002 == null ? class00869.N.W() : class005002).toArray(class00500[]::new));
    }

    public int R() {
        return -63;
    }
}

