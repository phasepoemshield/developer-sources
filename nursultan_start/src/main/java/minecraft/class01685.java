/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class00392
 *  minecraft.class00737
 *  minecraft.class01001
 *  minecraft.class02055
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04348
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04868
 *  minecraft.class04877
 *  minecraft.class04882
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06113
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07078
 *  minecraft.class07085
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07686
 *  minecraft.class07698
 *  minecraft.class07701
 *  minecraft.class08164
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00737;
import minecraft.class01001;
import minecraft.class02055;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04348;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04868;
import minecraft.class04877;
import minecraft.class04882;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06113;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07078;
import minecraft.class07085;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07686;
import minecraft.class07698;
import minecraft.class07701;
import minecraft.class08164;
import org.jspecify.annotations.Nullable;

public class class01685 {
    private static int L(class07701 class077012) throws CommandSyntaxException {
        class04770 class047702 = class077012.Z();
        class07209 class072092 = class047702.method_24515();
        class04877 class048772 = class047702.method_51469().method_19502(class072092);
        if (class048772 != null) {
            class048772.W();
            class077012.N(() -> class00392.y((String)"Stopped raid"), false);
            return 1;
        }
        class077012.y((class00392)class00392.y((String)"No raid here"));
        return -1;
    }

    private static int u(class07701 class077012) throws CommandSyntaxException {
        class04877 class048772 = class01685.N(class077012.Z());
        if (class048772 != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Found a started raid! ");
            class077012.N(() -> class00392.y((String)stringBuilder.toString()), false);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Num groups spawned: ");
            stringBuilder2.append(class048772.z());
            stringBuilder2.append(" Raid omen level: ");
            stringBuilder2.append(class048772.E());
            stringBuilder2.append(" Num mobs: ");
            stringBuilder2.append(class048772.P());
            stringBuilder2.append(" Raid health: ");
            stringBuilder2.append(class048772.m());
            stringBuilder2.append(" / ");
            stringBuilder2.append(class048772.M());
            class077012.N(() -> class00392.y((String)stringBuilder2.toString()), false);
            return 1;
        }
        class077012.y((class00392)class00392.y((String)"Found no started raids"));
        return 0;
    }

    private static int y(class07701 class077012) {
        class077012.N(() -> class00392.y((String)"Spawned a raid captain"), false);
        class04882 class048822 = (class04882)class07078.yy.N((class07299)class077012.R(), class06113.field_16462);
        if (class048822 == null) {
            class077012.y((class00392)class00392.y((String)"Pillager failed to spawn"));
            return 0;
        }
        class048822.M(true);
        class048822.method_5673(class07085.field_6169, class04877.N((class02055)class077012.t().L(class04227.NF)));
        class048822.method_5814(class077012.i().M, class077012.i().B, class077012.i().Z);
        class048822.N((class01001)class077012.R(), class077012.R().method_8404(class07209.method_49638((class00737)class077012.i())), class06113.field_16462, null);
        class077012.R().y((class07049)class048822);
        return 1;
    }

    private static int y(class07701 class077012, int n) throws CommandSyntaxException {
        class04770 class047702 = class077012.Z();
        class07209 class072092 = class047702.method_24515();
        if (class047702.method_51469().method_19503(class072092)) {
            class077012.y((class00392)class00392.y((String)"Raid already started close by"));
            return -1;
        }
        class04868 class048682 = class047702.method_51469().method_19495();
        class04877 class048772 = class048682.N(class047702, class047702.method_24515());
        if (class048772 != null) {
            class048772.N(n);
            class048682.method_80();
            class077012.N(() -> class00392.y((String)"Created a raid in your local village"), false);
        } else {
            class077012.y((class00392)class00392.y((String)"Failed to create a raid in your local village"));
        }
        return 1;
    }

    private static int N(class07701 class077012, @Nullable class00392 class003922) {
        if (class003922 != null && class003922.getString().equals("local")) {
            class04782 class047822 = class077012.R();
            class06889 class068892 = class077012.i().y(5.0, 0.0, 0.0);
            class047822.method_8465(null, class068892.M, class068892.B, class068892.Z, (class03556)class04909.lc, class04911.field_15254, 2.0f, 1.0f, class047822.field_9229.B());
        }
        return 1;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"raid").requires((Predicate)class07686.N((class08164)class07686.i))).then(class07686.y((String)"start").then(class07686.N((String)"omenlvl", (ArgumentType)IntegerArgumentType.integer((int)0)).executes(commandContext -> class01685.y((class07701)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"omenlvl")))))).then(class07686.y((String)"stop").executes(commandContext -> class01685.L((class07701)commandContext.getSource())))).then(class07686.y((String)"check").executes(commandContext -> class01685.u((class07701)commandContext.getSource())))).then(class07686.y((String)"sound").then(class07686.N((String)"type", (ArgumentType)class07698.N((class04348)class043482)).executes(commandContext -> class01685.N((class07701)commandContext.getSource(), class07698.y((CommandContext)commandContext, (String)"type")))))).then(class07686.y((String)"spawnleader").executes(commandContext -> class01685.y((class07701)commandContext.getSource())))).then(class07686.y((String)"setomen").then(class07686.N((String)"level", (ArgumentType)IntegerArgumentType.integer((int)0)).executes(commandContext -> class01685.N((class07701)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"level")))))).then(class07686.y((String)"glow").executes(commandContext -> class01685.N((class07701)commandContext.getSource()))));
    }

    private static @Nullable class04877 N(class04770 class047702) {
        return class047702.method_51469().method_19502(class047702.method_24515());
    }

    private static int N(class07701 class077012, int n) throws CommandSyntaxException {
        class04877 class048772 = class01685.N(class077012.Z());
        if (class048772 != null) {
            int n2 = class048772.U();
            if (n > n2) {
                class077012.y((class00392)class00392.y((String)("Sorry, the max raid omen level you can set is " + n2)));
            } else {
                int n3 = class048772.E();
                class048772.N(n);
                class077012.N(() -> class00392.y((String)("Changed village's raid omen level from " + n3 + " to " + n)), false);
            }
        } else {
            class077012.y((class00392)class00392.y((String)"No raid found here"));
        }
        return 1;
    }

    private static int N(class07701 class077012) throws CommandSyntaxException {
        class04877 class048772 = class01685.N(class077012.Z());
        if (class048772 != null) {
            Iterator var3 = class048772.B().iterator();
            while (var3.hasNext()) {
                ((class04882)var3.next()).method_6092(new class07055(class07047.l, 1000, 1));
            }
        }
        return 1;
    }
}

