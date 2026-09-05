/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class00392
 *  minecraft.class00717
 *  minecraft.class04348
 *  minecraft.class04770
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06584
 *  minecraft.class06770
 *  minecraft.class06778
 *  minecraft.class07482
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00717;
import minecraft.class04348;
import minecraft.class04770;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06584;
import minecraft.class06770;
import minecraft.class06778;
import minecraft.class07482;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class01542 {
    public static final int N = 100;

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"give").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.N((String)"targets", (ArgumentType)class07680.u()).then(((RequiredArgumentBuilder)class07686.N((String)"item", (ArgumentType)class06770.N((class04348)class043482)).executes(commandContext -> class01542.N((class07701)commandContext.getSource(), class06770.N((CommandContext)commandContext, (String)"item"), class07680.R((CommandContext)commandContext, (String)"targets"), 1))).then(class07686.N((String)"count", (ArgumentType)IntegerArgumentType.integer((int)1)).executes(commandContext -> class01542.N((class07701)commandContext.getSource(), class06770.N((CommandContext)commandContext, (String)"item"), class07680.R((CommandContext)commandContext, (String)"targets"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"count")))))));
    }

    private static int N(class07701 class077012, class06778 class067782, Collection<class04770> collection, int n) throws CommandSyntaxException {
        class06584 class065842 = class067782.N(1, false);
        int n2 = class065842.U();
        int n3 = n2 * 100;
        if (n > n3) {
            class077012.y((class00392)class00392.N((String)"commands.give.failed.toomanyitems", (Object[])new Object[]{n3, class065842.V()}));
            return 0;
        }
        for (class04770 class047702 : collection) {
            int n4 = n;
            while (n4 > 0) {
                class00717 class007172;
                int n5 = Math.min(n2, n4);
                n4 -= n5;
                class06584 class065843 = class067782.N(n5, false);
                if (!class047702.method_31548().M(class065843) || !class065843.R()) {
                    class007172 = class047702.method_7328(class065843, false);
                    if (class007172 == null) continue;
                    class007172.u();
                    class007172.N(class047702.method_5667());
                    continue;
                }
                class007172 = class047702.method_7328(class065842, false);
                if (class007172 != null) {
                    class007172.Z();
                }
                class047702.method_51469().method_43128(null, class047702.method_23317(), class047702.method_23318(), class047702.method_23321(), class04909.sJ, class04911.field_15248, 0.2f, ((class047702.method_59922().z() - class047702.method_59922().z()) * 0.7f + 1.0f) * 2.0f);
                ((class07482)class047702.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).u();
            }
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.give.success.single", (Object[])new Object[]{n, class065842.V(), ((class04770)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.give.success.single", (Object[])new Object[]{n, class065842.V(), collection.size()}), true);
        }
        return collection.size();
    }
}

