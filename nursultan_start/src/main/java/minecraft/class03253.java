/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10168
 *  minecraft.class00381
 *  minecraft.class02897
 *  minecraft.class03276
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10168;
import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class00381;
import minecraft.class02897;
import minecraft.class03242;
import minecraft.class03257;
import minecraft.class03260;
import minecraft.class03276;
import org.jspecify.annotations.Nullable;

public class class03253
implements class03276 {
    final /* synthetic */ class02897 y;
    public final /* synthetic */ class03242 L;
    public final /* synthetic */ Function u;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class03253(class02897 class028972, class03242 class032422, Function function) {
        this.y = class028972;
        this.L = class032422;
        this.u = function;
    }

    public void N(class00381<?> class003812, Consumer<class00381<?>> consumer) {
        if (class003812.method_65080() == this.y) {
            class03260 class032602 = (class03260)class003812;
            consumer.accept(this.L);
            class032602.N().forEach(consumer);
            consumer.accept(this.L);
        } else {
            consumer.accept(class003812);
        }
    }

    public @Nullable class03257 N(class00381<?> class003812) {
        if (class003812 == this.L) {
            return new class10168(this);
        }
        return null;
    }
}

