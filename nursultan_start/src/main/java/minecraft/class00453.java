/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10416
 *  com.mojang.datafixers.Products$P1
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 *  minecraft.class04489
 *  minecraft.class05561
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06584
 *  minecraft.class07536
 *  minecraft.class08122
 */
package minecraft;

import Nursultan.class10416;
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import minecraft.class00460;
import minecraft.class00471;
import minecraft.class04489;
import minecraft.class05561;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class07536;
import minecraft.class08122;

public abstract class class00453
implements class08122 {
    protected final List<class05957> M;
    private final Predicate<class05908> N;

    public class00453(List<class05957> list) {
        this.M = list;
        this.N = class07536.N(list);
    }

    public final class06584 apply(class06584 class065842, class05908 class059082) {
        return this.N.test(class059082) ? this.N(class065842, class059082) : class065842;
    }

    protected static class00471<?> N(Function<List<class05957>, class08122> function) {
        return new class00460(function);
    }

    public void N(class05561 class055612) {
        super.N(class055612);
        for (int i = 0; i < this.M.size(); ++i) {
            this.M.get(i).N(class055612.N((class04489)new class10416("conditions", i)));
        }
    }

    protected abstract class06584 N(class06584 var1, class05908 var2);

    protected static <T extends class00453> Products.P1<RecordCodecBuilder.Mu<T>, List<class05957>> N(RecordCodecBuilder.Instance<T> instance) {
        return instance.group((App)class05957.L.listOf().optionalFieldOf("conditions", List.of()).forGetter(class004532 -> class004532.M));
    }

    public abstract class05959<? extends class00453> N();
}

