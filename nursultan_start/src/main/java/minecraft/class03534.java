/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10416
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  minecraft.class03449
 *  minecraft.class03942
 *  minecraft.class04129
 *  minecraft.class04480
 *  minecraft.class04489
 *  minecraft.class05561
 *  minecraft.class05908
 *  minecraft.class05957
 */
package minecraft;

import Nursultan.class10416;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class03449;
import minecraft.class03537;
import minecraft.class03551;
import minecraft.class03599;
import minecraft.class03942;
import minecraft.class04129;
import minecraft.class04480;
import minecraft.class04489;
import minecraft.class05561;
import minecraft.class05908;
import minecraft.class05957;

public abstract class class03534
extends class04129 {
    public static final class04480 i = new class03537();
    protected final List<class04129> R;
    private final class03449 N;

    public class03534(List<class04129> list, List<class05957> list2) {
        super(list2);
        this.R = list;
        this.N = this.N(list);
    }

    public final boolean expand(class05908 class059082, Consumer<class03599> consumer) {
        if (!this.N(class059082)) {
            return false;
        }
        return this.N.expand(class059082, consumer);
    }

    public static <T extends class03534> MapCodec<T> N(class03551<T> class035512) {
        return RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03942.N.listOf().optionalFieldOf("children", List.of()).forGetter(class035342 -> class035342.R)).and(class03534.N((RecordCodecBuilder.Instance)instance).t1()).apply((Applicative)instance, class035512::create));
    }

    public void N(class05561 class055612) {
        super.N(class055612);
        if (this.R.isEmpty()) {
            class055612.N(i);
        }
        for (int i = 0; i < this.R.size(); ++i) {
            this.R.get(i).N(class055612.N((class04489)new class10416("children", i)));
        }
    }

    protected abstract class03449 N(List<? extends class03449> var1);
}

