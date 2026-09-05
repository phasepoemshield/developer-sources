/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  minecraft.class04348
 */
package minecraft;

import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import minecraft.class04348;
import minecraft.class06763;
import minecraft.class06776;
import minecraft.class06799;

public final class class06807
implements class06763 {
    private final Function y;
    final /* synthetic */ class06776 N;

    public class06807(class06776 class067762, Function function) {
        this.N = class067762;
        this.y = function;
    }

    public ArgumentType y(class04348 class043482) {
        return (ArgumentType)this.y.apply(class043482);
    }

    public class06799 N() {
        return this.N;
    }
}

