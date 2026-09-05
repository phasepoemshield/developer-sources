/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P3
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01210
 *  minecraft.class01467
 *  minecraft.class01476
 *  minecraft.class03194
 *  minecraft.class04206
 *  minecraft.class04887
 *  minecraft.class05312
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07218
 */
package minecraft;

import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01210;
import minecraft.class01467;
import minecraft.class01476;
import minecraft.class03194;
import minecraft.class04206;
import minecraft.class04887;
import minecraft.class05312;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07218;

public abstract class class05291 {
    public static final Codec<class05291> y = class04206.S.T().dispatch(class05291::N, class05312::N);
    private static final int N = 32;
    private static final int M = 24;
    public static final int L = 80;
    protected final int u;
    protected final int i;
    protected final int R;

    private static boolean L(class04887 class048872, class07209 class072092) {
        return class048872.method_16358(class072092, class005002 -> class06391.y((class00500)class005002) && !class005002.N(class00869.Z) && !class005002.N(class00869.RC));
    }

    public class05291(int n, int n2, int n3) {
        this.u = n;
        this.i = n2;
        this.R = n3;
    }

    public boolean y(class04887 class048872, class07209 class072092) {
        return this.N(class048872, class072092) || class048872.method_16358(class072092, class005002 -> class005002.N(class01210.g));
    }

    protected boolean y(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, class07209 class072092, class01476 class014762) {
        return this.N(class048872, biConsumer, class060692, class072092, class014762, Function.identity());
    }

    protected static <P extends class05291> Products.P3<RecordCodecBuilder.Mu<P>, Integer, Integer, Integer> N(RecordCodecBuilder.Instance<P> instance) {
        return instance.group((App)Codec.intRange((int)0, (int)32).fieldOf("base_height").forGetter(class052912 -> class052912.u), (App)Codec.intRange((int)0, (int)24).fieldOf("height_rand_a").forGetter(class052912 -> class052912.i), (App)Codec.intRange((int)0, (int)24).fieldOf("height_rand_b").forGetter(class052912 -> class052912.R));
    }

    protected static void N(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, class07209 class072092, class01476 class014762) {
        if (class014762.E || !class05291.L(class048872, class072092)) {
            biConsumer.accept(class072092, class014762.L.N(class060692, class072092));
        }
    }

    public int N(class06069 class060692) {
        return this.u + class060692.y(this.i + 1) + class060692.y(this.R + 1);
    }

    public abstract List<class01467> N(class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, int var4, class07209 var5, class01476 var6);

    protected abstract class05312<?> N();

    protected boolean N(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, class07209 class072092, class01476 class014762, Function<class00500, class00500> function) {
        if (this.N(class048872, class072092)) {
            biConsumer.accept(class072092, function.apply(class014762.y.N(class060692, class072092)));
            return true;
        }
        return false;
    }

    protected void N(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, class07218 class072182, class01476 class014762) {
        if (this.y(class048872, (class07209)class072182)) {
            this.y(class048872, biConsumer, class060692, (class07209)class072182, class014762);
        }
    }

    public boolean N(class04887 class048872, class07209 class072092) {
        return class03194.L((class04887)class048872, (class07209)class072092);
    }
}

