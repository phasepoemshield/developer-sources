/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.datafixers.util.Either
 *  minecraft.class00392
 *  minecraft.class00549
 *  minecraft.class00753
 *  minecraft.class00780
 *  minecraft.class00894
 *  minecraft.class01146
 *  minecraft.class01296
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class03784
 *  minecraft.class03789
 *  minecraft.class04227
 *  minecraft.class04330
 *  minecraft.class04348
 *  minecraft.class04782
 *  minecraft.class05163
 *  minecraft.class05946
 *  minecraft.class07209
 *  minecraft.class07305
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08050
 *  minecraft.class08164
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.datafixers.util.Either;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class00549;
import minecraft.class00753;
import minecraft.class00780;
import minecraft.class00894;
import minecraft.class01146;
import minecraft.class01296;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class03784;
import minecraft.class03789;
import minecraft.class04227;
import minecraft.class04330;
import minecraft.class04348;
import minecraft.class04782;
import minecraft.class05163;
import minecraft.class05946;
import minecraft.class07209;
import minecraft.class07305;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08050;
import minecraft.class08164;
import org.apache.commons.lang3.mutable.MutableInt;

public class class04207 {
    public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.pos.unloaded"));
    private static final Dynamic2CommandExceptionType y = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"commands.fillbiome.toobig", (Object[])new Object[]{object, object2}));

    public static Either<Integer, CommandSyntaxException> N(class04782 class047822, class07209 class072092, class07209 class072093, class03556<class00780> class035563) {
        return class04207.N(class047822, class072092, class072093, class035563, class035562 -> true, supplier -> {});
    }

    private static class04330 N(MutableInt mutableInt, class08050 class080502, class05163 class051632, class03556<class00780> class035562, Predicate<class03556<class00780>> predicate) {
        return (n, n2, n3, class032222) -> {
            int n4 = class01146.L((int)n);
            int n5 = class01146.L((int)n2);
            int n6 = class01146.L((int)n3);
            class03556 class035563 = class080502.method_16359(n, n2, n3);
            if (class051632.u(n4, n5, n6) && predicate.test(class035563)) {
                mutableInt.increment();
                return class035562;
            }
            return class035563;
        };
    }

    private static class07209 N(class07209 class072092) {
        return new class07209(class04207.N(class072092.method_10263()), class04207.N(class072092.method_10264()), class04207.N(class072092.method_10260()));
    }

    private static int N(int n) {
        return class01146.L((int)class01146.N((int)n));
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"fillbiome").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.N((String)"from", (ArgumentType)class00894.N()).then(class07686.N((String)"to", (ArgumentType)class00894.N()).then(((RequiredArgumentBuilder)class07686.N((String)"biome", (ArgumentType)class03784.N((class04348)class043482, (class05946)class04227.NA)).executes(commandContext -> class04207.N((class07701)commandContext.getSource(), class00894.N((CommandContext)commandContext, (String)"from"), class00894.N((CommandContext)commandContext, (String)"to"), (class03529<class00780>)class03784.N((CommandContext)commandContext, (String)"biome", (class05946)class04227.NA), (class03556<class00780> class035562) -> true))).then(class07686.y((String)"replace").then(class07686.N((String)"filter", (ArgumentType)class03789.N((class04348)class043482, (class05946)class04227.NA)).executes(commandContext -> class04207.N((class07701)commandContext.getSource(), class00894.N((CommandContext)commandContext, (String)"from"), class00894.N((CommandContext)commandContext, (String)"to"), (class03529<class00780>)class03784.N((CommandContext)commandContext, (String)"biome", (class05946)class04227.NA), (Predicate<class03556<class00780>>)class03789.N((CommandContext)commandContext, (String)"filter", (class05946)class04227.NA)))))))));
    }

    private static int N(class07701 class077012, class07209 class072092, class07209 class072093, class03529<class00780> class035292, Predicate<class03556<class00780>> predicate) throws CommandSyntaxException {
        Either<Integer, CommandSyntaxException> either = class04207.N(class077012.R(), class072092, class072093, class035292, predicate, supplier -> class077012.N(supplier, true));
        Optional optional = either.right();
        if (optional.isPresent()) {
            throw (CommandSyntaxException)optional.get();
        }
        return (Integer)either.left().get();
    }

    public static Either<Integer, CommandSyntaxException> N(class04782 class047822, class07209 class072092, class07209 class072093, class03556<class00780> class035562, Predicate<class03556<class00780>> predicate, Consumer<Supplier<class00392>> consumer) {
        int n;
        class07209 class072094;
        class07209 class072095 = class04207.N(class072092);
        class05163 class051632 = class05163.N((class00753)class072095, (class00753)(class072094 = class04207.N(class072093)));
        int n2 = class051632.u() * class051632.i() * class051632.R();
        if (n2 > (n = ((Integer)class047822.method_64395().N(class07305.l)).intValue())) {
            return Either.right((Object)y.create((Object)n, (Object)n2));
        }
        ArrayList<class08050> arrayList = new ArrayList<class08050>();
        for (int i = class01296.N((int)class051632.z()); i <= class01296.N((int)class051632.W()); ++i) {
            for (int j = class01296.N((int)class051632.B()); j <= class01296.N((int)class051632.U()); ++j) {
                class08050 class080502 = class047822.method_8402(j, i, class00549.m, false);
                if (class080502 == null) {
                    return Either.right((Object)N.create());
                }
                arrayList.add(class080502);
            }
        }
        MutableInt mutableInt = new MutableInt(0);
        for (class08050 class080502 : arrayList) {
            class080502.N(class04207.N(mutableInt, class080502, class051632, class035562, predicate), class047822.method_14178().W().y());
            class080502.Z();
        }
        class047822.method_14178().L.y(arrayList);
        consumer.accept(() -> class00392.N((String)"commands.fillbiome.success.count", (Object[])new Object[]{mutableInt.intValue(), class051632.B(), class051632.Z(), class051632.z(), class051632.U(), class051632.E(), class051632.W()}));
        return Either.left((Object)mutableInt.intValue());
    }
}

