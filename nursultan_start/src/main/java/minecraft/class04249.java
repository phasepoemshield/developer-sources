/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class00201
 *  minecraft.class00204
 *  minecraft.class00211
 *  minecraft.class00226
 *  minecraft.class00737
 *  minecraft.class03529
 *  minecraft.class04782
 *  minecraft.class05514
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import minecraft.class00201;
import minecraft.class00204;
import minecraft.class00211;
import minecraft.class00226;
import minecraft.class00737;
import minecraft.class03529;
import minecraft.class04283;
import minecraft.class04782;
import minecraft.class05514;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07701;

public class class04249 {
    private final UnaryOperator<Supplier<Stream<class03529<class00201>>>> N;
    private final UnaryOperator<Supplier<Stream<class07209>>> y;

    public class04283 L(CommandContext<class07701> commandContext) {
        class07701 class077012 = (class07701)commandContext.getSource();
        return this.N(class077012, class04283.N, () -> class05514.N((class07209)class07209.method_49638((class00737)class077012.i()), (class07049)class077012.z().method_14242(), (class04782)class077012.R()));
    }

    public class04249() {
        this.N = supplier -> supplier;
        this.y = supplier -> supplier;
    }

    private class04249(UnaryOperator<Supplier<Stream<class03529<class00201>>>> unaryOperator, UnaryOperator<Supplier<Stream<class07209>>> unaryOperator2) {
        this.N = unaryOperator;
        this.y = unaryOperator2;
    }

    public class04283 u(CommandContext<class07701> commandContext) {
        return this.N(commandContext, false);
    }

    public class04283 y(CommandContext<class07701> commandContext) {
        class07701 class077012 = (class07701)commandContext.getSource();
        class07209 class072092 = class07209.method_49638((class00737)class077012.i());
        return this.N(class077012, class04283.N, () -> class05514.L((class07209)class072092, (int)250, (class04782)class077012.R()));
    }

    private static <Q> UnaryOperator<Supplier<Stream<Q>>> y(int n) {
        return supplier -> {
            LinkedList linkedList = new LinkedList();
            List list = ((Stream)supplier.get()).toList();
            for (int i = 0; i < n; ++i) {
                linkedList.addAll(list);
            }
            return linkedList::stream;
        };
    }

    public class04283 N(CommandContext<class07701> commandContext, Collection<class03529<class00201>> collection) {
        return this.N((class07701)commandContext.getSource(), collection::stream, class04283.y);
    }

    public class04249 N(int n) {
        return new class04249(class04249.y(n), class04249.y(n));
    }

    public class04283 N(CommandContext<class07701> commandContext) {
        class07701 class077012 = (class07701)commandContext.getSource();
        class07209 class072092 = class07209.method_49638((class00737)class077012.i());
        return this.N(class077012, class04283.N, () -> class05514.y((class07209)class072092, (int)15, (class04782)class077012.R()).stream());
    }

    public class04283 N(CommandContext<class07701> commandContext, int n) {
        class07701 class077012 = (class07701)commandContext.getSource();
        class07209 class072092 = class07209.method_49638((class00737)class077012.i());
        return this.N(class077012, class04283.N, () -> class05514.L((class07209)class072092, (int)n, (class04782)class077012.R()));
    }

    public class04283 N(CommandContext<class07701> commandContext, boolean bl) {
        return this.N((class07701)commandContext.getSource(), () -> class00204.N().filter(class035292 -> !bl || ((class00201)class035292.N()).B()), class04283.y);
    }

    private class04283 N(class07701 class077012, class00211 class002112, class00226 class002262) {
        return new class04283(class077012, ((Supplier)((Supplier)this.N.apply(() -> ((class00211)class002112).findTests())))::get, ((Supplier)((Supplier)this.y.apply(() -> ((class00226)class002262).findTestPos())))::get);
    }
}

