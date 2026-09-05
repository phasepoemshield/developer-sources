/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10419
 *  com.mojang.datafixers.Products$P1
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 *  minecraft.class04489
 *  minecraft.class05561
 *  minecraft.class05908
 */
package minecraft;

import Nursultan.class10419;
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class04489;
import minecraft.class05561;
import minecraft.class05908;
import minecraft.class06834;
import minecraft.class06838;
import minecraft.class06848;

public abstract class class06813
implements class06834 {
    protected final class06834 y;

    public class06813(class06834 class068342) {
        this.y = class068342;
    }

    @Override
    public final class06838 N(class05908 class059082) {
        return this.N(this.y.N(class059082));
    }

    public void N(class05561 class055612) {
        class06834.super.N(class055612);
        this.y.N(class055612.N((class04489)new class10419("slot_source")));
    }

    protected abstract class06838 N(class06838 var1);

    protected static <T extends class06813> Products.P1<RecordCodecBuilder.Mu<T>, class06834> N(RecordCodecBuilder.Instance<T> instance) {
        return instance.group((App)class06848.y.fieldOf("slot_source").forGetter(class068132 -> class068132.y));
    }

    public abstract MapCodec<? extends class06813> N();
}

