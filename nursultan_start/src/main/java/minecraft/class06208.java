/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class00392
 *  minecraft.class00737
 *  minecraft.class00863
 *  minecraft.class00874
 *  minecraft.class00894
 *  minecraft.class00897
 *  minecraft.class04782
 *  minecraft.class05042
 *  minecraft.class05946
 *  minecraft.class07109
 *  minecraft.class07209
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00737;
import minecraft.class00863;
import minecraft.class00874;
import minecraft.class00894;
import minecraft.class00897;
import minecraft.class04782;
import minecraft.class05042;
import minecraft.class05946;
import minecraft.class07109;
import minecraft.class07209;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class06208 {
    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"setworldspawn").requires((Predicate)class07686.N((class08164)class07686.u))).executes(commandContext -> class06208.N((class07701)commandContext.getSource(), class07209.method_49638((class00737)((class07701)commandContext.getSource()).i()), (class00874)class00863.N))).then(((RequiredArgumentBuilder)class07686.N((String)"pos", (ArgumentType)class00894.N()).executes(commandContext -> class06208.N((class07701)commandContext.getSource(), class00894.L((CommandContext)commandContext, (String)"pos"), (class00874)class00863.N))).then(class07686.N((String)"rotation", (ArgumentType)class00897.N()).executes(commandContext -> class06208.N((class07701)commandContext.getSource(), class00894.L((CommandContext)commandContext, (String)"pos"), class00897.N((CommandContext)commandContext, (String)"rotation"))))));
    }

    private static int N(class07701 class077012, class07209 class072092, class00874 class008742) {
        class04782 class047822 = class077012.R();
        class07109 class071092 = class008742.y(class077012);
        float f = class071092.U;
        float f2 = class071092.z;
        class05042 class050422 = class05042.N((class05946)class047822.method_27983(), (class07209)class072092, (float)f, (float)f2);
        class047822.method_27873(class050422);
        class077012.N(() -> class00392.N((String)"commands.setworldspawn.success", (Object[])new Object[]{class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), Float.valueOf(class050422.u()), Float.valueOf(class050422.i()), class047822.method_27983().N().toString()}), true);
        return 1;
    }
}

