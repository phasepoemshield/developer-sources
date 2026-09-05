/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00392
 *  minecraft.class03556
 *  minecraft.class03784
 *  minecraft.class04227
 *  minecraft.class04348
 *  minecraft.class05946
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07304
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 *  net.fabricmc.fabric.api.item.v1.EnchantingContext
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class03556;
import minecraft.class03784;
import minecraft.class04227;
import minecraft.class04348;
import minecraft.class05946;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07304;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;
import net.fabricmc.fabric.api.item.v1.EnchantingContext;

public class class01545 {
    private static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.enchant.failed.entity", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.enchant.failed.itemless", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.enchant.failed.incompatible", (Object[])new Object[]{object}));
    private static final Dynamic2CommandExceptionType u = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"commands.enchant.failed.level", (Object[])new Object[]{object, object2}));
    private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.enchant.failed"));

    private static int N(class07701 class077012, Collection<? extends class07049> collection, class03556<class07304> class035562, int n) throws CommandSyntaxException {
        class07304 class073042 = (class07304)class035562.N();
        if (n > class073042.i()) {
            throw u.create((Object)n, (Object)class073042.i());
        }
        int n2 = 0;
        for (class07049 class070492 : collection) {
            if (class070492 instanceof class07438) {
                class07438 class074382 = (class07438)class070492;
                class06584 class065842 = class074382.method_6047();
                if (!class065842.R()) {
                    if (class01545.N(class073042, class065842, class077012, collection, class035562) && class07323.N((Collection)class07323.y((class06584)class065842).N(), class035562)) {
                        class065842.N(class035562, n);
                        ++n2;
                        continue;
                    }
                    if (collection.size() != 1) continue;
                    throw L.create((Object)class065842.d().getString());
                }
                if (collection.size() != 1) continue;
                throw y.create((Object)class074382.method_5477().getString());
            }
            if (collection.size() != 1) continue;
            throw N.create((Object)class070492.method_5477().getString());
        }
        if (n2 == 0) {
            throw i.create();
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.enchant.success.single", (Object[])new Object[]{class07304.N((class03556)class035562, (int)n), ((class07049)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.enchant.success.multiple", (Object[])new Object[]{class07304.N((class03556)class035562, (int)n), collection.size()}), true);
        }
        return n2;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"enchant").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.N((String)"targets", (ArgumentType)class07680.y()).then(((RequiredArgumentBuilder)class07686.N((String)"enchantment", (ArgumentType)class03784.N((class04348)class043482, (class05946)class04227.yR)).executes(commandContext -> class01545.N((class07701)commandContext.getSource(), class07680.y((CommandContext)commandContext, (String)"targets"), (class03556<class07304>)class03784.M((CommandContext)commandContext, (String)"enchantment"), 1))).then(class07686.N((String)"level", (ArgumentType)IntegerArgumentType.integer((int)0)).executes(commandContext -> class01545.N((class07701)commandContext.getSource(), class07680.y((CommandContext)commandContext, (String)"targets"), (class03556<class07304>)class03784.M((CommandContext)commandContext, (String)"enchantment"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"level")))))));
    }

    private static boolean N(class07304 class073042, class06584 class065842, class07701 class077012, Collection collection, class03556 class035562) {
        return class065842.canBeEnchantedWith(class035562, EnchantingContext.ACCEPTABLE);
    }
}

