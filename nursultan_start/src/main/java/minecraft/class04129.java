/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10416
 *  com.mojang.datafixers.Products$P1
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 *  minecraft.class03449
 *  minecraft.class04489
 *  minecraft.class05561
 *  minecraft.class05908
 *  minecraft.class05950
 *  minecraft.class05957
 *  minecraft.class07536
 */
package minecraft;

import Nursultan.class10416;
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class03449;
import minecraft.class04489;
import minecraft.class05561;
import minecraft.class05908;
import minecraft.class05950;
import minecraft.class05957;
import minecraft.class07536;

public abstract class class04129
implements class03449 {
    public final List<class05957> M;
    private final Predicate<class05908> N;

    public class04129(List<class05957> list) {
        this.M = list;
        this.N = class07536.N(list);
    }

    protected final boolean N(class05908 class059082) {
        return this.N.test(class059082);
    }

    public abstract class05950 N();

    public void N(class05561 class055612) {
        for (int i = 0; i < this.M.size(); ++i) {
            this.M.get(i).N(class055612.N((class04489)new class10416("conditions", i)));
        }
    }

    protected static <T extends class04129> Products.P1<RecordCodecBuilder.Mu<T>, List<class05957>> N(RecordCodecBuilder.Instance<T> instance) {
        return instance.group((App)class05957.L.listOf().optionalFieldOf("conditions", List.of()).forGetter(class041292 -> class041292.M));
    }
}

