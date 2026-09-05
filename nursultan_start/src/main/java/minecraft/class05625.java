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
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  minecraft.class00392
 *  minecraft.class00874
 *  minecraft.class00881
 *  minecraft.class00897
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06681
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07109
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07475
 *  minecraft.class07664
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07687
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
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00874;
import minecraft.class00881;
import minecraft.class00897;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05596;
import minecraft.class05601;
import minecraft.class05617;
import minecraft.class06681;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07109;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07475;
import minecraft.class07664;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07687;
import minecraft.class07701;
import minecraft.class08164;
import org.jspecify.annotations.Nullable;

public class class05625 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.teleport.invalidPosition"));

    private static void N(class07701 class077012, class07049 class070492, class04782 class047822, double d, double d2, double d3, Set<class06681> set, float f, float f2, @Nullable class05617 class056172) throws CommandSyntaxException {
        class07438 class074382;
        float f3;
        if (!class07299.method_25953((class07209)class07209.method_49637((double)d, (double)d2, (double)d3))) {
            throw N.create();
        }
        double d4 = set.contains(class06681.field_12400) ? d - class070492.method_23317() : d;
        double d5 = set.contains(class06681.field_12398) ? d2 - class070492.method_23318() : d2;
        double d6 = set.contains(class06681.field_12403) ? d3 - class070492.method_23321() : d3;
        float f4 = set.contains(class06681.field_12401) ? f - class070492.method_36454() : f;
        float f5 = set.contains(class06681.field_12397) ? f2 - class070492.method_36455() : f2;
        float f6 = class04995.R((float)f4);
        if (!class070492.method_48105(class047822, d4, d5, d6, set, f6, f3 = class04995.R((float)f5), true)) {
            return;
        }
        if (class056172 != null) {
            class056172.N(class077012, class070492);
        }
        if (!(class070492 instanceof class07438) || !(class074382 = (class07438)class070492).method_6128()) {
            class070492.method_18799(class070492.method_18798().u(1.0, 0.0, 1.0));
            class070492.method_24830(true);
        }
        if (class070492 instanceof class07475) {
            class074382 = (class07475)class070492;
            class074382.f().W();
        }
    }

    private static String N(double d) {
        return String.format(Locale.ROOT, "%f", d);
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        LiteralCommandNode literalCommandNode = commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"teleport").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.N((String)"location", (ArgumentType)class00881.N()).executes(commandContext -> class05625.N((class07701)commandContext.getSource(), Collections.singleton(((class07701)commandContext.getSource()).B()), ((class07701)commandContext.getSource()).R(), class00881.y((CommandContext)commandContext, (String)"location"), null, null)))).then(class07686.N((String)"destination", (ArgumentType)class07680.N()).executes(commandContext -> class05625.N((class07701)commandContext.getSource(), Collections.singleton(((class07701)commandContext.getSource()).B()), class07680.N((CommandContext)commandContext, (String)"destination"))))).then(((RequiredArgumentBuilder)class07686.N((String)"targets", (ArgumentType)class07680.y()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"location", (ArgumentType)class00881.N()).executes(commandContext -> class05625.N((class07701)commandContext.getSource(), class07680.y((CommandContext)commandContext, (String)"targets"), ((class07701)commandContext.getSource()).R(), class00881.y((CommandContext)commandContext, (String)"location"), null, null))).then(class07686.N((String)"rotation", (ArgumentType)class00897.N()).executes(commandContext -> class05625.N((class07701)commandContext.getSource(), class07680.y((CommandContext)commandContext, (String)"targets"), ((class07701)commandContext.getSource()).R(), class00881.y((CommandContext)commandContext, (String)"location"), class00897.N((CommandContext)commandContext, (String)"rotation"), null)))).then(((LiteralArgumentBuilder)class07686.y((String)"facing").then(class07686.y((String)"entity").then(((RequiredArgumentBuilder)class07686.N((String)"facingEntity", (ArgumentType)class07680.N()).executes(commandContext -> class05625.N((class07701)commandContext.getSource(), class07680.y((CommandContext)commandContext, (String)"targets"), ((class07701)commandContext.getSource()).R(), class00881.y((CommandContext)commandContext, (String)"location"), null, new class05601(class07680.N((CommandContext)commandContext, (String)"facingEntity"), class07664.field_9853)))).then(class07686.N((String)"facingAnchor", (ArgumentType)class07687.N()).executes(commandContext -> class05625.N((class07701)commandContext.getSource(), class07680.y((CommandContext)commandContext, (String)"targets"), ((class07701)commandContext.getSource()).R(), class00881.y((CommandContext)commandContext, (String)"location"), null, new class05601(class07680.N((CommandContext)commandContext, (String)"facingEntity"), class07687.N((CommandContext)commandContext, (String)"facingAnchor")))))))).then(class07686.N((String)"facingLocation", (ArgumentType)class00881.N()).executes(commandContext -> class05625.N((class07701)commandContext.getSource(), class07680.y((CommandContext)commandContext, (String)"targets"), ((class07701)commandContext.getSource()).R(), class00881.y((CommandContext)commandContext, (String)"location"), null, new class05596(class00881.N((CommandContext)commandContext, (String)"facingLocation")))))))).then(class07686.N((String)"destination", (ArgumentType)class07680.N()).executes(commandContext -> class05625.N((class07701)commandContext.getSource(), class07680.y((CommandContext)commandContext, (String)"targets"), class07680.N((CommandContext)commandContext, (String)"destination"))))));
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"tp").requires((Predicate)class07686.N((class08164)class07686.u))).redirect((CommandNode)literalCommandNode));
    }

    private static Set<class06681> N(class00874 class008742, @Nullable class00874 class008743, boolean bl) {
        Set var3 = class06681.y((boolean)class008742.N(), (boolean)class008742.y(), (boolean)class008742.L());
        Set set = bl ? class06681.N((boolean)class008742.N(), (boolean)class008742.y(), (boolean)class008742.L()) : Set.of();
        Set var5 = class008743 == null ? class06681.field_40711 : class06681.N((boolean)class008743.y(), (boolean)class008743.N());
        return class06681.N((Set[])new Set[]{var3, set, var5});
    }

    private static int N(class07701 class077012, Collection<? extends class07049> collection, class04782 class047822, class00874 class008742, @Nullable class00874 class008743, @Nullable class05617 class056172) throws CommandSyntaxException {
        class06889 class068892 = class008742.N(class077012);
        class07109 class071092 = class008743 == null ? null : class008743.y(class077012);
        for (class07049 class070492 : collection) {
            Set<class06681> var10 = class05625.N(class008742, class008743, class070492.method_73183().method_27983() == class047822.method_27983());
            if (class071092 == null) {
                class05625.N(class077012, class070492, class047822, class068892.M, class068892.B, class068892.Z, var10, class070492.method_36454(), class070492.method_36455(), class056172);
                continue;
            }
            class05625.N(class077012, class070492, class047822, class068892.M, class068892.B, class068892.Z, var10, class071092.U, class071092.z, class056172);
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.teleport.success.location.single", (Object[])new Object[]{((class07049)collection.iterator().next()).method_5476(), class05625.N(class068892.M), class05625.N(class068892.B), class05625.N(class068892.Z)}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.teleport.success.location.multiple", (Object[])new Object[]{collection.size(), class05625.N(class068892.M), class05625.N(class068892.B), class05625.N(class068892.Z)}), true);
        }
        return collection.size();
    }

    private static int N(class07701 class077012, Collection<? extends class07049> collection, class07049 class070492) throws CommandSyntaxException {
        for (class07049 class070493 : collection) {
            class05625.N(class077012, class070493, (class04782)class070492.method_73183(), class070492.method_23317(), class070492.method_23318(), class070492.method_23321(), EnumSet.noneOf(class06681.class), class070492.method_36454(), class070492.method_36455(), null);
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.teleport.success.entity.single", (Object[])new Object[]{((class07049)collection.iterator().next()).method_5476(), class070492.method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.teleport.success.entity.multiple", (Object[])new Object[]{collection.size(), class070492.method_5476()}), true);
        }
        return collection.size();
    }
}

