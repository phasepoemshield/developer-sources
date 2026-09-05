/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class00719
 *  minecraft.class00737
 *  minecraft.class00894
 *  minecraft.class01001
 *  minecraft.class01201
 *  minecraft.class01207
 *  minecraft.class01219
 *  minecraft.class01224
 *  minecraft.class01233
 *  minecraft.class01296
 *  minecraft.class01894
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class03935
 *  minecraft.class03966
 *  minecraft.class04227
 *  minecraft.class04403
 *  minecraft.class04748
 *  minecraft.class04782
 *  minecraft.class04848
 *  minecraft.class04932
 *  minecraft.class05163
 *  minecraft.class05281
 *  minecraft.class05474
 *  minecraft.class05946
 *  minecraft.class05974
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07253
 *  minecraft.class07321
 *  minecraft.class07686
 *  minecraft.class07689
 *  minecraft.class07701
 *  minecraft.class07778
 *  minecraft.class08088
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class00719;
import minecraft.class00737;
import minecraft.class00894;
import minecraft.class01001;
import minecraft.class01201;
import minecraft.class01207;
import minecraft.class01219;
import minecraft.class01224;
import minecraft.class01233;
import minecraft.class01296;
import minecraft.class01894;
import minecraft.class03238;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class03935;
import minecraft.class03966;
import minecraft.class04227;
import minecraft.class04403;
import minecraft.class04748;
import minecraft.class04782;
import minecraft.class04848;
import minecraft.class04932;
import minecraft.class05163;
import minecraft.class05281;
import minecraft.class05474;
import minecraft.class05946;
import minecraft.class05974;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07253;
import minecraft.class07321;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class07778;
import minecraft.class08088;
import minecraft.class08164;

public class class03186 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.place.feature.failed"));
    private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.place.jigsaw.failed"));
    private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.place.structure.failed"));
    private static final DynamicCommandExceptionType u = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.place.template.invalid", (Object[])new Object[]{object}));
    private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.place.template.failed"));
    private static final SuggestionProvider<class07701> R = (commandContext, suggestionsBuilder) -> class07689.N((Stream)((class07701)commandContext.getSource()).R().method_14183().N(), (SuggestionsBuilder)suggestionsBuilder);

    public static int y(class07701 class077012, class03529<class04748> class035292, class07209 class072092) throws CommandSyntaxException {
        class04782 class047822 = class077012.R();
        class04748 class047482 = (class04748)class035292.N();
        class08088 class080882 = class047822.method_14178().U();
        class04932 class049322 = class047482.N(class035292, class047822.method_27983(), class077012.t(), class080882, class080882.u(), class047822.method_14178().W(), class047822.method_14183(), class047822.method_8412(), new class07321(class072092), 0, (class05474)class047822, class035562 -> true);
        if (!class049322.y()) {
            throw L.create();
        }
        class05163 class051632 = class049322.N();
        class07321 class073213 = new class07321(class01296.N((int)class051632.B()), class01296.N((int)class051632.z()));
        class07321 class073214 = new class07321(class01296.N((int)class051632.U()), class01296.N((int)class051632.W()));
        class03186.N(class047822, class073213, class073214);
        class07321.N((class07321)class073213, (class07321)class073214).forEach(class073212 -> class049322.N((class05974)class047822, class047822.method_27056(), class080882, class047822.method_8409(), new class05163(class073212.i(), class047822.method_31607(), class073212.R(), class073212.M(), class047822.method_31600() + 1, class073212.B()), class073212));
        String string = class035292.B().N().toString();
        class077012.N(() -> class00392.N((String)"commands.place.structure.success", (Object[])new Object[]{string, class072092.method_10263(), class072092.method_10264(), class072092.method_10260()}), true);
        return 1;
    }

    private static void N(class04782 class047822, class07321 class073213, class07321 class073214) throws CommandSyntaxException {
        if (class07321.N((class07321)class073213, (class07321)class073214).filter(class073212 -> !class047822.method_8477(class073212.W())).findAny().isPresent()) {
            throw class00894.N.create();
        }
    }

    public static int N(class07701 class077012, class01894 class018942, class07209 class072092, class06993 class069932, class07111 class071112, float f, int n, boolean bl) throws CommandSyntaxException {
        Optional var10;
        class04782 class047822 = class077012.R();
        class01224 class012242 = class047822.method_14183();
        try {
            var10 = class012242.y(class018942);
        }
        catch (class00719 class007192) {
            throw u.create((Object)class018942);
        }
        if (var10.isEmpty()) {
            throw u.create((Object)class018942);
        }
        class01207 class012072 = (class01207)var10.get();
        class03186.N(class047822, new class07321(class072092), new class07321(class072092.method_10081(class012072.N())));
        class01233 class012332 = new class01233().N(class071112).N(class069932).y(bl);
        if (f < 1.0f) {
            class012332.y().N((class01219)new class01201(f)).N(class07253.y((long)n));
        }
        if (!class012072.N((class01001)class047822, class072092, class072092, class012332, class07253.y((long)n), 2 | (bl ? 816 : 0))) {
            throw i.create();
        }
        class077012.N(() -> class00392.N((String)"commands.place.template.success", (Object[])new Object[]{class00392.N((class01894)class018942), class072092.method_10263(), class072092.method_10264(), class072092.method_10260()}), true);
        return 1;
    }

    public static int N(class07701 class077012, class03529<class03238<?, ?>> class035292, class07209 class072092) throws CommandSyntaxException {
        class04782 class047822 = class077012.R();
        class03238 class032382 = (class03238)((Object)class035292.N());
        class07321 class073212 = new class07321(class072092);
        class03186.N(class047822, new class07321(class073212.B - 1, class073212.Z - 1), new class07321(class073212.B + 1, class073212.Z + 1));
        if (!class032382.N((class05974)class047822, class047822.method_14178().U(), class047822.method_8409(), class072092)) {
            throw N.create();
        }
        String string = class035292.B().N().toString();
        class077012.N(() -> class00392.N((String)"commands.place.feature.success", (Object[])new Object[]{string, class072092.method_10263(), class072092.method_10264(), class072092.method_10260()}), true);
        return 1;
    }

    public static int N(class07701 class077012, class03556<class05281> class035562, class01894 class018942, int n, class07209 class072092) throws CommandSyntaxException {
        class04782 class047822 = class077012.R();
        class07321 class073212 = new class07321(class072092);
        class03186.N(class047822, class073212, class073212);
        if (!class04848.N((class04782)class047822, class035562, (class01894)class018942, (int)n, (class07209)class072092, (boolean)false)) {
            throw y.create();
        }
        class077012.N(() -> class00392.N((String)"commands.place.jigsaw.success", (Object[])new Object[]{class072092.method_10263(), class072092.method_10264(), class072092.method_10260()}), true);
        return 1;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"place").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.y((String)"feature").then(((RequiredArgumentBuilder)class07686.N((String)"feature", (ArgumentType)class04403.N((class05946)class04227.Nh)).executes(commandContext -> class03186.N((class07701)commandContext.getSource(), class04403.N((CommandContext)commandContext, (String)"feature"), class07209.method_49638((class00737)((class07701)commandContext.getSource()).i())))).then(class07686.N((String)"pos", (ArgumentType)class00894.N()).executes(commandContext -> class03186.N((class07701)commandContext.getSource(), class04403.N((CommandContext)commandContext, (String)"feature"), class00894.N((CommandContext)commandContext, (String)"pos"))))))).then(class07686.y((String)"jigsaw").then(class07686.N((String)"pool", (ArgumentType)class04403.N((class05946)class04227.yv)).then(class07686.N((String)"target", (ArgumentType)class07778.N()).then(((RequiredArgumentBuilder)class07686.N((String)"max_depth", (ArgumentType)IntegerArgumentType.integer((int)1, (int)20)).executes(commandContext -> class03186.N((class07701)commandContext.getSource(), (class03556<class05281>)class04403.L((CommandContext)commandContext, (String)"pool"), class07778.N((CommandContext)commandContext, (String)"target"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"max_depth"), class07209.method_49638((class00737)((class07701)commandContext.getSource()).i())))).then(class07686.N((String)"position", (ArgumentType)class00894.N()).executes(commandContext -> class03186.N((class07701)commandContext.getSource(), (class03556<class05281>)class04403.L((CommandContext)commandContext, (String)"pool"), class07778.N((CommandContext)commandContext, (String)"target"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"max_depth"), class00894.N((CommandContext)commandContext, (String)"position"))))))))).then(class07686.y((String)"structure").then(((RequiredArgumentBuilder)class07686.N((String)"structure", (ArgumentType)class04403.N((class05946)class04227.yj)).executes(commandContext -> class03186.y((class07701)commandContext.getSource(), (class03529<class04748>)class04403.y((CommandContext)commandContext, (String)"structure"), class07209.method_49638((class00737)((class07701)commandContext.getSource()).i())))).then(class07686.N((String)"pos", (ArgumentType)class00894.N()).executes(commandContext -> class03186.y((class07701)commandContext.getSource(), (class03529<class04748>)class04403.y((CommandContext)commandContext, (String)"structure"), class00894.N((CommandContext)commandContext, (String)"pos"))))))).then(class07686.y((String)"template").then(((RequiredArgumentBuilder)class07686.N((String)"template", (ArgumentType)class07778.N()).suggests(R).executes(commandContext -> class03186.N((class07701)commandContext.getSource(), class07778.N((CommandContext)commandContext, (String)"template"), class07209.method_49638((class00737)((class07701)commandContext.getSource()).i()), class06993.field_11467, class07111.field_11302, 1.0f, 0, false))).then(((RequiredArgumentBuilder)class07686.N((String)"pos", (ArgumentType)class00894.N()).executes(commandContext -> class03186.N((class07701)commandContext.getSource(), class07778.N((CommandContext)commandContext, (String)"template"), class00894.N((CommandContext)commandContext, (String)"pos"), class06993.field_11467, class07111.field_11302, 1.0f, 0, false))).then(((RequiredArgumentBuilder)class07686.N((String)"rotation", (ArgumentType)class03935.N()).executes(commandContext -> class03186.N((class07701)commandContext.getSource(), class07778.N((CommandContext)commandContext, (String)"template"), class00894.N((CommandContext)commandContext, (String)"pos"), class03935.N((CommandContext)commandContext, (String)"rotation"), class07111.field_11302, 1.0f, 0, false))).then(((RequiredArgumentBuilder)class07686.N((String)"mirror", (ArgumentType)class03966.N()).executes(commandContext -> class03186.N((class07701)commandContext.getSource(), class07778.N((CommandContext)commandContext, (String)"template"), class00894.N((CommandContext)commandContext, (String)"pos"), class03935.N((CommandContext)commandContext, (String)"rotation"), class03966.N((CommandContext)commandContext, (String)"mirror"), 1.0f, 0, false))).then(((RequiredArgumentBuilder)class07686.N((String)"integrity", (ArgumentType)FloatArgumentType.floatArg((float)0.0f, (float)1.0f)).executes(commandContext -> class03186.N((class07701)commandContext.getSource(), class07778.N((CommandContext)commandContext, (String)"template"), class00894.N((CommandContext)commandContext, (String)"pos"), class03935.N((CommandContext)commandContext, (String)"rotation"), class03966.N((CommandContext)commandContext, (String)"mirror"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"integrity"), 0, false))).then(((RequiredArgumentBuilder)class07686.N((String)"seed", (ArgumentType)IntegerArgumentType.integer()).executes(commandContext -> class03186.N((class07701)commandContext.getSource(), class07778.N((CommandContext)commandContext, (String)"template"), class00894.N((CommandContext)commandContext, (String)"pos"), class03935.N((CommandContext)commandContext, (String)"rotation"), class03966.N((CommandContext)commandContext, (String)"mirror"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"integrity"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"seed"), false))).then(class07686.y((String)"strict").executes(commandContext -> class03186.N((class07701)commandContext.getSource(), class07778.N((CommandContext)commandContext, (String)"template"), class00894.N((CommandContext)commandContext, (String)"pos"), class03935.N((CommandContext)commandContext, (String)"rotation"), class03966.N((CommandContext)commandContext, (String)"mirror"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"integrity"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"seed"), true)))))))))));
    }
}

