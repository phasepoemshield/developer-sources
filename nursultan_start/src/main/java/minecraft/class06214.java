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
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  minecraft.class00392
 *  minecraft.class00737
 *  minecraft.class00881
 *  minecraft.class01001
 *  minecraft.class03529
 *  minecraft.class03784
 *  minecraft.class04227
 *  minecraft.class04348
 *  minecraft.class04782
 *  minecraft.class05946
 *  minecraft.class06113
 *  minecraft.class06791
 *  minecraft.class06889
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07086
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07667
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00737;
import minecraft.class00881;
import minecraft.class01001;
import minecraft.class03529;
import minecraft.class03784;
import minecraft.class04227;
import minecraft.class04348;
import minecraft.class04782;
import minecraft.class05946;
import minecraft.class06113;
import minecraft.class06791;
import minecraft.class06889;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07086;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07667;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class06214 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.summon.failed"));
    private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.summon.failed.peaceful"));
    private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.summon.failed.uuid"));
    private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.summon.invalidPosition"));

    private static int y(class07701 class077012, class03529<class07078<?>> class035292, class06889 class068892, class07001 class070012, boolean bl) throws CommandSyntaxException {
        class07049 class070492 = class06214.N(class077012, class035292, class068892, class070012, bl);
        class077012.N(() -> class00392.N((String)"commands.summon.success", (Object[])new Object[]{class070492.method_5476()}), true);
        return 1;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"summon").requires((Predicate)class07686.N((class08164)class07686.u))).then(((RequiredArgumentBuilder)class07686.N((String)"entity", (ArgumentType)class03784.N((class04348)class043482, (class05946)class04227.I)).suggests(class06791.N((SuggestionProvider)class06791.L)).executes(commandContext -> class06214.y((class07701)commandContext.getSource(), class03784.i((CommandContext)commandContext, (String)"entity"), ((class07701)commandContext.getSource()).i(), new class07001(), true))).then(((RequiredArgumentBuilder)class07686.N((String)"pos", (ArgumentType)class00881.N()).executes(commandContext -> class06214.y((class07701)commandContext.getSource(), class03784.i((CommandContext)commandContext, (String)"entity"), class00881.N((CommandContext)commandContext, (String)"pos"), new class07001(), true))).then(class07686.N((String)"nbt", (ArgumentType)class07667.N()).executes(commandContext -> class06214.y((class07701)commandContext.getSource(), class03784.i((CommandContext)commandContext, (String)"entity"), class00881.N((CommandContext)commandContext, (String)"pos"), class07667.N((CommandContext)commandContext, (String)"nbt"), false))))));
    }

    public static class07049 N(class07701 class077012, class03529<class07078<?>> class035292, class06889 class068892, class07001 class070012, boolean bl) throws CommandSyntaxException {
        if (!class07299.method_25953((class07209)class07209.method_49638((class00737)class068892))) {
            throw u.create();
        }
        if (class077012.R().y() == class07086.field_5801 && !((class07078)class035292.N()).b()) {
            throw y.create();
        }
        class07001 class070013 = class070012.N();
        class070013.N_67("id", class035292.B().N().toString());
        class04782 class047822 = class077012.R();
        class07049 class070493 = class07078.N((class07001)class070013, (class07299)class047822, (class06113)class06113.field_16462, class070492 -> {
            class070492.method_5808(class068892.M, class068892.B, class068892.Z, class070492.method_36454(), class070492.method_36455());
            return class070492;
        });
        if (class070493 == null) {
            throw N.create();
        }
        if (bl && class070493 instanceof class07079) {
            ((class07079)class070493).N((class01001)class077012.R(), class077012.R().method_8404(class070493.method_24515()), class06113.field_16462, null);
        }
        if (!class047822.method_30736(class070493)) {
            throw L.create();
        }
        return class070493;
    }
}

