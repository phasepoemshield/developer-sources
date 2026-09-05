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
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00877
 *  minecraft.class00894
 *  minecraft.class00903
 *  minecraft.class04348
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06646
 *  minecraft.class07209
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 *  org.jspecify.annotations.Nullable
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
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00877;
import minecraft.class00894;
import minecraft.class00903;
import minecraft.class04348;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06193;
import minecraft.class06646;
import minecraft.class07209;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;
import org.jspecify.annotations.Nullable;

public class class06192 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.setblock.failed"));

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        Predicate<class06646> predicate = class066462 -> class066462.L().R(class066462.u());
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"setblock").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.N((String)"pos", (ArgumentType)class00894.N()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"block", (ArgumentType)class00877.N((class04348)class043482)).executes(commandContext -> class06192.N((class07701)commandContext.getSource(), class00894.N((CommandContext)commandContext, (String)"pos"), class00877.N((CommandContext)commandContext, (String)"block"), class06193.field_13722, null, false))).then(class07686.y((String)"destroy").executes(commandContext -> class06192.N((class07701)commandContext.getSource(), class00894.N((CommandContext)commandContext, (String)"pos"), class00877.N((CommandContext)commandContext, (String)"block"), class06193.field_13721, null, false)))).then(class07686.y((String)"keep").executes(commandContext -> class06192.N((class07701)commandContext.getSource(), class00894.N((CommandContext)commandContext, (String)"pos"), class00877.N((CommandContext)commandContext, (String)"block"), class06193.field_13722, predicate, false)))).then(class07686.y((String)"replace").executes(commandContext -> class06192.N((class07701)commandContext.getSource(), class00894.N((CommandContext)commandContext, (String)"pos"), class00877.N((CommandContext)commandContext, (String)"block"), class06193.field_13722, null, false)))).then(class07686.y((String)"strict").executes(commandContext -> class06192.N((class07701)commandContext.getSource(), class00894.N((CommandContext)commandContext, (String)"pos"), class00877.N((CommandContext)commandContext, (String)"block"), class06193.field_13722, null, true))))));
    }

    private static int N(class07701 class077012, class07209 class072092, class00903 class009032, class06193 class061932, @Nullable Predicate<class06646> predicate, boolean bl) throws CommandSyntaxException {
        boolean bl2;
        class04782 class047822 = class077012.R();
        if (class047822.method_27982()) {
            throw N.create();
        }
        if (predicate != null && !predicate.test(new class06646((class05487)class047822, class072092, true))) {
            throw N.create();
        }
        if (class061932 == class06193.field_13721) {
            class047822.N(class072092, true);
            bl2 = !class009032.N().P() || !class047822.method_8320(class072092).P();
        } else {
            bl2 = true;
        }
        class00500 class005002 = class047822.method_8320(class072092);
        if (bl2 && !class009032.N(class047822, class072092, 2 | (bl ? 816 : 256))) {
            throw N.create();
        }
        if (!bl) {
            class047822.method_70635(class072092, class005002);
        }
        class077012.N(() -> class00392.N((String)"commands.setblock.success", (Object[])new Object[]{class072092.method_10263(), class072092.method_10264(), class072092.method_10260()}), true);
        return 1;
    }
}

