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
 *  minecraft.class04744
 *  minecraft.class04770
 *  minecraft.class04995
 *  minecraft.class05042
 *  minecraft.class05946
 *  minecraft.class07109
 *  minecraft.class07209
 *  minecraft.class07680
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
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00737;
import minecraft.class00863;
import minecraft.class00874;
import minecraft.class00894;
import minecraft.class00897;
import minecraft.class04744;
import minecraft.class04770;
import minecraft.class04995;
import minecraft.class05042;
import minecraft.class05946;
import minecraft.class07109;
import minecraft.class07209;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class06205 {
    private static /* synthetic */ class00392 y(class07209 class072092, float f, float f2, String string, Collection collection) {
        return class00392.N((String)"commands.spawnpoint.success.single", (Object[])new Object[]{class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), Float.valueOf(f), Float.valueOf(f2), string, ((class04770)collection.iterator().next()).method_5476()});
    }

    private static /* synthetic */ class00392 N(class07209 class072092, float f, float f2, String string, Collection collection) {
        return class00392.N((String)"commands.spawnpoint.success.multiple", (Object[])new Object[]{class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), Float.valueOf(f), Float.valueOf(f2), string, collection.size()});
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"spawnpoint").requires((Predicate)class07686.N((class08164)class07686.u))).executes(commandContext -> class06205.N((class07701)commandContext.getSource(), Collections.singleton(((class07701)commandContext.getSource()).Z()), class07209.method_49638((class00737)((class07701)commandContext.getSource()).i()), (class00874)class00863.N))).then(((RequiredArgumentBuilder)class07686.N((String)"targets", (ArgumentType)class07680.u()).executes(commandContext -> class06205.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class07209.method_49638((class00737)((class07701)commandContext.getSource()).i()), (class00874)class00863.N))).then(((RequiredArgumentBuilder)class07686.N((String)"pos", (ArgumentType)class00894.N()).executes(commandContext -> class06205.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class00894.L((CommandContext)commandContext, (String)"pos"), (class00874)class00863.N))).then(class07686.N((String)"rotation", (ArgumentType)class00897.N()).executes(commandContext -> class06205.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class00894.L((CommandContext)commandContext, (String)"pos"), class00897.N((CommandContext)commandContext, (String)"rotation")))))));
    }

    private static int N(class07701 class077012, Collection<class04770> collection, class07209 class072092, class00874 class008742) {
        class05946 var4 = class077012.R().method_27983();
        class07109 class071092 = class008742.y(class077012);
        float f = class04995.R((float)class071092.U);
        float f2 = class04995.N((float)class071092.z, (float)-90.0f, (float)90.0f);
        Object object = collection.iterator();
        while (object.hasNext()) {
            object.next().method_26284(new class04744(class05042.N((class05946)var4, (class07209)class072092, (float)f, (float)f2), true), false);
        }
        object = var4.N().toString();
        if (collection.size() == 1) {
            class077012.N(() -> class06205.y(class072092, f, f2, (String)object, collection), true);
        } else {
            class077012.N(() -> class06205.N(class072092, f, f2, (String)object, collection), true);
        }
        return collection.size();
    }
}

