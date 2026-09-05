/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10188
 *  Nursultan.class10416
 *  com.mojang.datafixers.Products$P4
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 *  minecraft.class03477
 *  minecraft.class03479
 *  minecraft.class03599
 *  minecraft.class04129
 *  minecraft.class04489
 *  minecraft.class05561
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class06584
 *  minecraft.class07439
 *  minecraft.class08122
 */
package minecraft;

import Nursultan.class10188;
import Nursultan.class10416;
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import minecraft.class03366;
import minecraft.class03477;
import minecraft.class03479;
import minecraft.class03599;
import minecraft.class04129;
import minecraft.class04489;
import minecraft.class05561;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class06584;
import minecraft.class07439;
import minecraft.class08122;

public abstract class class03328
extends class04129 {
    public static final int i = 1;
    public static final int R = 0;
    public final int B;
    public final int Z;
    protected final List<class08122> z;
    public final BiFunction<class06584, class05908, class06584> U;
    private final class03599 N = new class10188(this);

    public class03328(int n, int n2, List<class05957> list, List<class08122> list2) {
        super(list);
        this.B = n;
        this.Z = n2;
        this.z = list2;
        this.U = class07439.N(list2);
    }

    public boolean expand(class05908 class059082, Consumer<class03599> consumer) {
        if (this.N(class059082)) {
            consumer.accept(this.N);
            return true;
        }
        return false;
    }

    protected static <T extends class03328> Products.P4<RecordCodecBuilder.Mu<T>, Integer, Integer, List<class05957>, List<class08122>> y(RecordCodecBuilder.Instance<T> instance) {
        return instance.group((App)Codec.INT.optionalFieldOf("weight", (Object)1).forGetter(class033282 -> class033282.B), (App)Codec.INT.optionalFieldOf("quality", (Object)0).forGetter(class033282 -> class033282.Z)).and(class03328.N(instance).t1()).and((App)class07439.L.listOf().optionalFieldOf("functions", List.of()).forGetter(class033282 -> class033282.z));
    }

    public void N(class05561 class055612) {
        super.N(class055612);
        for (int i = 0; i < this.z.size(); ++i) {
            this.z.get(i).N(class055612.N((class04489)new class10416("functions", i)));
        }
    }

    public static class03366<?> N(class03477 class034772) {
        return new class03479(class034772);
    }

    public abstract void N(Consumer<class06584> var1, class05908 var2);
}

