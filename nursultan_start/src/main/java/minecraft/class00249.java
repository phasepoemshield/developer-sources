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
 *  minecraft.class00874
 *  minecraft.class00881
 *  minecraft.class00897
 *  minecraft.class05596
 *  minecraft.class05601
 *  minecraft.class05617
 *  minecraft.class07049
 *  minecraft.class07109
 *  minecraft.class07664
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07687
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
import minecraft.class00874;
import minecraft.class00881;
import minecraft.class00897;
import minecraft.class05596;
import minecraft.class05601;
import minecraft.class05617;
import minecraft.class07049;
import minecraft.class07109;
import minecraft.class07664;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07687;
import minecraft.class07701;
import minecraft.class08164;

public class class00249 {
    private static int N(class07701 class077012, class07049 class070492, class05617 class056172) {
        class056172.N(class077012, class070492);
        class077012.N(() -> class00392.N((String)"commands.rotate.success", (Object[])new Object[]{class070492.method_5476()}), true);
        return 1;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"rotate").requires((Predicate)class07686.N((class08164)class07686.u))).then(((RequiredArgumentBuilder)class07686.N((String)"target", (ArgumentType)class07680.N()).then(class07686.N((String)"rotation", (ArgumentType)class00897.N()).executes(commandContext -> class00249.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), class00897.N((CommandContext)commandContext, (String)"rotation"))))).then(((LiteralArgumentBuilder)class07686.y((String)"facing").then(class07686.y((String)"entity").then(((RequiredArgumentBuilder)class07686.N((String)"facingEntity", (ArgumentType)class07680.N()).executes(commandContext -> class00249.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), (class05617)new class05601(class07680.N((CommandContext)commandContext, (String)"facingEntity"), class07664.field_9853)))).then(class07686.N((String)"facingAnchor", (ArgumentType)class07687.N()).executes(commandContext -> class00249.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), (class05617)new class05601(class07680.N((CommandContext)commandContext, (String)"facingEntity"), class07687.N((CommandContext)commandContext, (String)"facingAnchor")))))))).then(class07686.N((String)"facingLocation", (ArgumentType)class00881.N()).executes(commandContext -> class00249.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), (class05617)new class05596(class00881.N((CommandContext)commandContext, (String)"facingLocation"))))))));
    }

    private static int N(class07701 class077012, class07049 class070492, class00874 class008742) {
        class07109 class071092 = class008742.y(class077012);
        float f = class008742.y() ? class071092.U - class070492.method_36454() : class071092.U;
        float f2 = class008742.N() ? class071092.z - class070492.method_36455() : class071092.z;
        class070492.method_64578(f, class008742.y(), f2, class008742.N());
        class077012.N(() -> class00392.N((String)"commands.rotate.success", (Object[])new Object[]{class070492.method_5476()}), true);
        return 1;
    }
}

