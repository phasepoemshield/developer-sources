/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class03784
 *  minecraft.class04227
 *  minecraft.class04348
 *  minecraft.class05320
 *  minecraft.class05946
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class07463
 *  minecraft.class07468
 *  minecraft.class07469
 *  minecraft.class07471
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07689
 *  minecraft.class07701
 *  minecraft.class07778
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class03784;
import minecraft.class04227;
import minecraft.class04348;
import minecraft.class05320;
import minecraft.class05946;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class07463;
import minecraft.class07468;
import minecraft.class07469;
import minecraft.class07471;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class07778;
import minecraft.class08164;

public class class05195 {
    private static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.attribute.failed.entity", (Object[])new Object[]{object}));
    private static final Dynamic2CommandExceptionType y = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"commands.attribute.failed.no_attribute", (Object[])new Object[]{object, object2}));
    private static final Dynamic3CommandExceptionType L = new Dynamic3CommandExceptionType((object, object2, object3) -> class00392.y((String)"commands.attribute.failed.no_modifier", (Object[])new Object[]{object2, object, object3}));
    private static final Dynamic3CommandExceptionType u = new Dynamic3CommandExceptionType((object, object2, object3) -> class00392.y((String)"commands.attribute.failed.modifier_already_present", (Object[])new Object[]{object3, object2, object}));

    private static int L(class07701 class077012, class07049 class070492, class03556<class07468> class035562, double d) throws CommandSyntaxException {
        class05195.N(class070492, class035562).N(d);
        class077012.N(() -> class00392.N((String)"commands.attribute.base_value.set.success", (Object[])new Object[]{class05195.N(class035562), class070492.method_5477(), d}), false);
        return 1;
    }

    private static Stream<class01894> L(class07049 class070492, class03556<class07468> class035562) throws CommandSyntaxException {
        return class05195.N(class070492, class035562).L().stream().map(class07471::N);
    }

    private static class07438 y(class07049 class070492, class03556<class07468> class035562) throws CommandSyntaxException {
        class07438 class074382 = class05195.N(class070492);
        if (!class074382.method_6127().y(class035562)) {
            throw y.create((Object)class070492.method_5477(), (Object)class05195.N(class035562));
        }
        return class074382;
    }

    private static int y(class07701 class077012, class07049 class070492, class03556<class07468> class035562, double d) throws CommandSyntaxException {
        double d2 = class05195.y(class070492, class035562).method_45326(class035562);
        class077012.N(() -> class00392.N((String)"commands.attribute.base_value.get.success", (Object[])new Object[]{class05195.N(class035562), class070492.method_5477(), d2}), false);
        return (int)(d2 * d);
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"attribute").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.N((String)"target", (ArgumentType)class07680.N()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"attribute", (ArgumentType)class03784.N((class04348)class043482, (class05946)class04227.L)).then(((LiteralArgumentBuilder)class07686.y((String)"get").executes(commandContext -> class05195.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), (class03556<class07468>)class03784.N((CommandContext)commandContext, (String)"attribute"), 1.0))).then(class07686.N((String)"scale", (ArgumentType)DoubleArgumentType.doubleArg()).executes(commandContext -> class05195.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), (class03556<class07468>)class03784.N((CommandContext)commandContext, (String)"attribute"), DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale")))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"base").then(class07686.y((String)"set").then(class07686.N((String)"value", (ArgumentType)DoubleArgumentType.doubleArg()).executes(commandContext -> class05195.L((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), (class03556<class07468>)class03784.N((CommandContext)commandContext, (String)"attribute"), DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"value")))))).then(((LiteralArgumentBuilder)class07686.y((String)"get").executes(commandContext -> class05195.y((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), (class03556<class07468>)class03784.N((CommandContext)commandContext, (String)"attribute"), 1.0))).then(class07686.N((String)"scale", (ArgumentType)DoubleArgumentType.doubleArg()).executes(commandContext -> class05195.y((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), (class03556<class07468>)class03784.N((CommandContext)commandContext, (String)"attribute"), DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale")))))).then(class07686.y((String)"reset").executes(commandContext -> class05195.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), (class03556<class07468>)class03784.N((CommandContext)commandContext, (String)"attribute")))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"modifier").then(class07686.y((String)"add").then(class07686.N((String)"id", (ArgumentType)class07778.N()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"value", (ArgumentType)DoubleArgumentType.doubleArg()).then(class07686.y((String)"add_value").executes(commandContext -> class05195.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), (class03556<class07468>)class03784.N((CommandContext)commandContext, (String)"attribute"), class07778.N((CommandContext)commandContext, (String)"id"), DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"value"), class07463.field_6328)))).then(class07686.y((String)"add_multiplied_base").executes(commandContext -> class05195.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), (class03556<class07468>)class03784.N((CommandContext)commandContext, (String)"attribute"), class07778.N((CommandContext)commandContext, (String)"id"), DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"value"), class07463.field_6330)))).then(class07686.y((String)"add_multiplied_total").executes(commandContext -> class05195.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), (class03556<class07468>)class03784.N((CommandContext)commandContext, (String)"attribute"), class07778.N((CommandContext)commandContext, (String)"id"), DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"value"), class07463.field_6331))))))).then(class07686.y((String)"remove").then(class07686.N((String)"id", (ArgumentType)class07778.N()).suggests((commandContext, suggestionsBuilder) -> class07689.N(class05195.L(class07680.N((CommandContext)commandContext, (String)"target"), (class03556<class07468>)class03784.N((CommandContext)commandContext, (String)"attribute")), (SuggestionsBuilder)suggestionsBuilder)).executes(commandContext -> class05195.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), (class03556<class07468>)class03784.N((CommandContext)commandContext, (String)"attribute"), class07778.N((CommandContext)commandContext, (String)"id")))))).then(class07686.y((String)"value").then(class07686.y((String)"get").then(((RequiredArgumentBuilder)class07686.N((String)"id", (ArgumentType)class07778.N()).suggests((commandContext, suggestionsBuilder) -> class07689.N(class05195.L(class07680.N((CommandContext)commandContext, (String)"target"), (class03556<class07468>)class03784.N((CommandContext)commandContext, (String)"attribute")), (SuggestionsBuilder)suggestionsBuilder)).executes(commandContext -> class05195.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), (class03556<class07468>)class03784.N((CommandContext)commandContext, (String)"attribute"), class07778.N((CommandContext)commandContext, (String)"id"), 1.0))).then(class07686.N((String)"scale", (ArgumentType)DoubleArgumentType.doubleArg()).executes(commandContext -> class05195.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), (class03556<class07468>)class03784.N((CommandContext)commandContext, (String)"attribute"), class07778.N((CommandContext)commandContext, (String)"id"), DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale")))))))))));
    }

    private static int N(class07701 class077012, class07049 class070492, class03556<class07468> class035562, class01894 class018942, double d) throws CommandSyntaxException {
        class05320 class053202 = class05195.y(class070492, class035562).method_6127();
        if (!class053202.N(class035562, class018942)) {
            throw L.create((Object)class070492.method_5477(), (Object)class05195.N(class035562), (Object)class018942);
        }
        double d2 = class053202.y(class035562, class018942);
        class077012.N(() -> class00392.N((String)"commands.attribute.modifier.value.get.success", (Object[])new Object[]{class00392.N((class01894)class018942), class05195.N(class035562), class070492.method_5477(), d2}), false);
        return (int)(d2 * d);
    }

    private static int N(class07701 class077012, class07049 class070492, class03556<class07468> class035562, class01894 class018942) throws CommandSyntaxException {
        if (class05195.N(class070492, class035562).L(class018942)) {
            class077012.N(() -> class00392.N((String)"commands.attribute.modifier.remove.success", (Object[])new Object[]{class00392.N((class01894)class018942), class05195.N(class035562), class070492.method_5477()}), false);
            return 1;
        }
        throw L.create((Object)class070492.method_5477(), (Object)class05195.N(class035562), (Object)class018942);
    }

    private static class00392 N(class03556<class07468> class035562) {
        return class00392.L((String)((class07468)class035562.N()).L());
    }

    private static int N(class07701 class077012, class07049 class070492, class03556<class07468> class035562, class01894 class018942, double d, class07463 class074632) throws CommandSyntaxException {
        class07469 class074692 = class05195.N(class070492, class035562);
        class07471 class074712 = new class07471(class018942, d, class074632);
        if (class074692.y(class018942)) {
            throw u.create((Object)class070492.method_5477(), (Object)class05195.N(class035562), (Object)class018942);
        }
        class074692.u(class074712);
        class077012.N(() -> class00392.N((String)"commands.attribute.modifier.add.success", (Object[])new Object[]{class00392.N((class01894)class018942), class05195.N(class035562), class070492.method_5477()}), false);
        return 1;
    }

    private static int N(class07701 class077012, class07049 class070492, class03556<class07468> class035562) throws CommandSyntaxException {
        class07438 class074382 = class05195.N(class070492);
        if (!class074382.method_6127().i(class035562)) {
            throw y.create((Object)class070492.method_5477(), (Object)class05195.N(class035562));
        }
        double d = class074382.method_45326(class035562);
        class077012.N(() -> class00392.N((String)"commands.attribute.base_value.reset.success", (Object[])new Object[]{class05195.N(class035562), class070492.method_5477(), d}), false);
        return 1;
    }

    private static int N(class07701 class077012, class07049 class070492, class03556<class07468> class035562, double d) throws CommandSyntaxException {
        double d2 = class05195.y(class070492, class035562).method_45325(class035562);
        class077012.N(() -> class00392.N((String)"commands.attribute.value.get.success", (Object[])new Object[]{class05195.N(class035562), class070492.method_5477(), d2}), false);
        return (int)(d2 * d);
    }

    private static class07469 N(class07049 class070492, class03556<class07468> class035562) throws CommandSyntaxException {
        class07469 class074692 = class05195.N(class070492).method_6127().N(class035562);
        if (class074692 == null) {
            throw y.create((Object)class070492.method_5477(), (Object)class05195.N(class035562));
        }
        return class074692;
    }

    private static class07438 N(class07049 class070492) throws CommandSyntaxException {
        if (!(class070492 instanceof class07438)) {
            throw N.create((Object)class070492.method_5477());
        }
        return (class07438)class070492;
    }
}

