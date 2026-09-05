/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P1
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class05974
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class04025;
import minecraft.class05974;
import minecraft.class07209;

public abstract class class04028
implements class04025 {
    protected final class00753 i;

    public class04028(class00753 class007532) {
        this.i = class007532;
    }

    protected abstract boolean N(class00500 var1);

    @Override
    public final boolean test(class05974 class059742, class07209 class072092) {
        return this.N(class059742.method_8320(class072092.method_10081(this.i)));
    }

    protected static <P extends class04028> Products.P1<RecordCodecBuilder.Mu<P>, class00753> N(RecordCodecBuilder.Instance<P> instance) {
        return instance.group((App)class00753.method_39677((int)16).optionalFieldOf("offset", (Object)class00753.field_11176).forGetter(class040282 -> class040282.i));
    }
}

