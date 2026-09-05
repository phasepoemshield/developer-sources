/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00502
 *  minecraft.class01766
 *  minecraft.class04348
 *  minecraft.class06394
 *  minecraft.class06541
 *  minecraft.class06656
 *  minecraft.class06672
 *  minecraft.class07686
 *  minecraft.class07696
 *  minecraft.class07698
 *  minecraft.class07701
 *  minecraft.class07761
 *  minecraft.class07786
 *  minecraft.class08164
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00502;
import minecraft.class01766;
import minecraft.class04348;
import minecraft.class06394;
import minecraft.class06541;
import minecraft.class06656;
import minecraft.class06672;
import minecraft.class07686;
import minecraft.class07696;
import minecraft.class07698;
import minecraft.class07701;
import minecraft.class07761;
import minecraft.class07786;
import minecraft.class08164;

public class class05595 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.team.add.duplicate"));
    private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.team.empty.unchanged"));
    private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.team.option.name.unchanged"));
    private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.team.option.color.unchanged"));
    private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.team.option.friendlyfire.alreadyEnabled"));
    private static final SimpleCommandExceptionType R = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.team.option.friendlyfire.alreadyDisabled"));
    private static final SimpleCommandExceptionType M = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
    private static final SimpleCommandExceptionType B = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
    private static final SimpleCommandExceptionType Z = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.team.option.nametagVisibility.unchanged"));
    private static final SimpleCommandExceptionType z = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.team.option.deathMessageVisibility.unchanged"));
    private static final SimpleCommandExceptionType U = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.team.option.collisionRule.unchanged"));

    private static int L(class07701 class077012, class00502 class005022) {
        Collection var2 = class005022.B();
        if (var2.isEmpty()) {
            class077012.N(() -> class00392.N((String)"commands.team.list.members.empty", (Object[])new Object[]{class005022.i()}), false);
        } else {
            class077012.N(() -> class00392.N((String)"commands.team.list.members.success", (Object[])new Object[]{class005022.i(), var2.size(), class00390.N((Collection)var2)}), false);
        }
        return var2.size();
    }

    private static int L(class07701 class077012, class00502 class005022, class00392 class003922) {
        class005022.L(class003922);
        class077012.N(() -> class00392.N((String)"commands.team.option.suffix.success", (Object[])new Object[]{class003922}), false);
        return 1;
    }

    private static int y(class07701 class077012, class00502 class005022, class06672 class066722) throws CommandSyntaxException {
        if (class005022.E() == class066722) {
            throw z.create();
        }
        class005022.y(class066722);
        class077012.N(() -> class00392.N((String)"commands.team.option.deathMessageVisibility.success", (Object[])new Object[]{class005022.i(), class066722.N()}), true);
        return 0;
    }

    private static int y(class07701 class077012, class00502 class005022, class00392 class003922) {
        class005022.y(class003922);
        class077012.N(() -> class00392.N((String)"commands.team.option.prefix.success", (Object[])new Object[]{class003922}), false);
        return 1;
    }

    private static int y(class07701 class077012, class00502 class005022, boolean bl) throws CommandSyntaxException {
        if (class005022.Z() == bl) {
            if (bl) {
                throw i.create();
            }
            throw R.create();
        }
        class005022.N(bl);
        class077012.N(() -> class00392.N((String)("commands.team.option.friendlyfire." + (bl ? "enabled" : "disabled")), (Object[])new Object[]{class005022.i()}), true);
        return 0;
    }

    private static int y(class07701 class077012, class00502 class005022) {
        class06394 class063942 = class077012.W().yB();
        class063942.N(class005022);
        class077012.N(() -> class00392.N((String)"commands.team.remove.success", (Object[])new Object[]{class005022.i()}), true);
        return class063942.i().size();
    }

    private static int N(class07701 class077012, class00502 class005022, Collection<class01766> collection) {
        class06394 class063942 = class077012.W().yB();
        for (class01766 class017662 : collection) {
            class063942.N(class017662.method_5820(), class005022);
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.team.join.success.single", (Object[])new Object[]{class05595.N(collection), class005022.i()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.team.join.success.multiple", (Object[])new Object[]{collection.size(), class005022.i()}), true);
        }
        return collection.size();
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"team").requires((Predicate)class07686.N((class08164)class07686.u))).then(((LiteralArgumentBuilder)class07686.y((String)"list").executes(commandContext -> class05595.N((class07701)commandContext.getSource()))).then(class07686.N((String)"team", (ArgumentType)class07761.N()).executes(commandContext -> class05595.L((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team")))))).then(class07686.y((String)"add").then(((RequiredArgumentBuilder)class07686.N((String)"team", (ArgumentType)StringArgumentType.word()).executes(commandContext -> class05595.N((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"team")))).then(class07686.N((String)"displayName", (ArgumentType)class07698.N((class04348)class043482)).executes(commandContext -> class05595.N((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"team"), class07698.y((CommandContext)commandContext, (String)"displayName"))))))).then(class07686.y((String)"remove").then(class07686.N((String)"team", (ArgumentType)class07761.N()).executes(commandContext -> class05595.y((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team")))))).then(class07686.y((String)"empty").then(class07686.N((String)"team", (ArgumentType)class07761.N()).executes(commandContext -> class05595.N((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team")))))).then(class07686.y((String)"join").then(((RequiredArgumentBuilder)class07686.N((String)"team", (ArgumentType)class07761.N()).executes(commandContext -> class05595.N((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team"), Collections.singleton(((class07701)commandContext.getSource()).B())))).then(class07686.N((String)"members", (ArgumentType)class07786.y()).suggests(class07786.N).executes(commandContext -> class05595.N((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team"), class07786.L((CommandContext)commandContext, (String)"members"))))))).then(class07686.y((String)"leave").then(class07686.N((String)"members", (ArgumentType)class07786.y()).suggests(class07786.N).executes(commandContext -> class05595.N((class07701)commandContext.getSource(), (Collection<class01766>)class07786.L((CommandContext)commandContext, (String)"members")))))).then(class07686.y((String)"modify").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"team", (ArgumentType)class07761.N()).then(class07686.y((String)"displayName").then(class07686.N((String)"displayName", (ArgumentType)class07698.N((class04348)class043482)).executes(commandContext -> class05595.N((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team"), class07698.y((CommandContext)commandContext, (String)"displayName")))))).then(class07686.y((String)"color").then(class07686.N((String)"value", (ArgumentType)class07696.N()).executes(commandContext -> class05595.N((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team"), class07696.N((CommandContext)commandContext, (String)"value")))))).then(class07686.y((String)"friendlyFire").then(class07686.N((String)"allowed", (ArgumentType)BoolArgumentType.bool()).executes(commandContext -> class05595.y((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team"), BoolArgumentType.getBool((CommandContext)commandContext, (String)"allowed")))))).then(class07686.y((String)"seeFriendlyInvisibles").then(class07686.N((String)"allowed", (ArgumentType)BoolArgumentType.bool()).executes(commandContext -> class05595.N((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team"), BoolArgumentType.getBool((CommandContext)commandContext, (String)"allowed")))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"nametagVisibility").then(class07686.y((String)"never").executes(commandContext -> class05595.N((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team"), class06672.field_1443)))).then(class07686.y((String)"hideForOtherTeams").executes(commandContext -> class05595.N((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team"), class06672.field_1444)))).then(class07686.y((String)"hideForOwnTeam").executes(commandContext -> class05595.N((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team"), class06672.field_1446)))).then(class07686.y((String)"always").executes(commandContext -> class05595.N((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team"), class06672.field_1442))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"deathMessageVisibility").then(class07686.y((String)"never").executes(commandContext -> class05595.y((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team"), class06672.field_1443)))).then(class07686.y((String)"hideForOtherTeams").executes(commandContext -> class05595.y((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team"), class06672.field_1444)))).then(class07686.y((String)"hideForOwnTeam").executes(commandContext -> class05595.y((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team"), class06672.field_1446)))).then(class07686.y((String)"always").executes(commandContext -> class05595.y((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team"), class06672.field_1442))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"collisionRule").then(class07686.y((String)"never").executes(commandContext -> class05595.N((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team"), class06656.field_1435)))).then(class07686.y((String)"pushOwnTeam").executes(commandContext -> class05595.N((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team"), class06656.field_1440)))).then(class07686.y((String)"pushOtherTeams").executes(commandContext -> class05595.N((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team"), class06656.field_1434)))).then(class07686.y((String)"always").executes(commandContext -> class05595.N((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team"), class06656.field_1437))))).then(class07686.y((String)"prefix").then(class07686.N((String)"prefix", (ArgumentType)class07698.N((class04348)class043482)).executes(commandContext -> class05595.y((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team"), class07698.y((CommandContext)commandContext, (String)"prefix")))))).then(class07686.y((String)"suffix").then(class07686.N((String)"suffix", (ArgumentType)class07698.N((class04348)class043482)).executes(commandContext -> class05595.L((class07701)commandContext.getSource(), class07761.N((CommandContext)commandContext, (String)"team"), class07698.y((CommandContext)commandContext, (String)"suffix"))))))));
    }

    private static class00392 N(Collection<class01766> collection) {
        return collection.iterator().next().yZ();
    }

    private static int N(class07701 class077012, Collection<class01766> collection) {
        class06394 class063942 = class077012.W().yB();
        for (class01766 class017662 : collection) {
            class063942.u(class017662.method_5820());
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.team.leave.success.single", (Object[])new Object[]{class05595.N(collection)}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.team.leave.success.multiple", (Object[])new Object[]{collection.size()}), true);
        }
        return collection.size();
    }

    private static int N(class07701 class077012, class00502 class005022) throws CommandSyntaxException {
        class06394 class063942 = class077012.W().yB();
        ArrayList arrayList = Lists.newArrayList((Iterable)class005022.B());
        if (arrayList.isEmpty()) {
            throw y.create();
        }
        for (String string : arrayList) {
            class063942.y(string, class005022);
        }
        class077012.N(() -> class00392.N((String)"commands.team.empty.success", (Object[])new Object[]{arrayList.size(), class005022.i()}), true);
        return arrayList.size();
    }

    private static int N(class07701 class077012, String string) throws CommandSyntaxException {
        return class05595.N(class077012, string, (class00392)class00392.y((String)string));
    }

    private static int N(class07701 class077012, String string, class00392 class003922) throws CommandSyntaxException {
        class06394 class063942 = class077012.W().yB();
        if (class063942.y(string) != null) {
            throw N.create();
        }
        class00502 class005022 = class063942.L(string);
        class005022.N(class003922);
        class077012.N(() -> class00392.N((String)"commands.team.add.success", (Object[])new Object[]{class005022.i()}), true);
        return class063942.i().size();
    }

    private static int N(class07701 class077012, class00502 class005022, class06541 class065412) throws CommandSyntaxException {
        if (class005022.P() == class065412) {
            throw u.create();
        }
        class005022.N(class065412);
        class077012.N(() -> class00392.N((String)"commands.team.option.color.success", (Object[])new Object[]{class005022.i(), class065412.R()}), true);
        return 0;
    }

    private static int N(class07701 class077012) {
        Collection var1 = class077012.W().yB().i();
        if (var1.isEmpty()) {
            class077012.N(() -> class00392.L((String)"commands.team.list.teams.empty"), false);
        } else {
            class077012.N(() -> class00392.N((String)"commands.team.list.teams.success", (Object[])new Object[]{var1.size(), class00390.y((Collection)var1, class00502::i)}), false);
        }
        return var1.size();
    }

    private static int N(class07701 class077012, class00502 class005022, class00392 class003922) throws CommandSyntaxException {
        if (class005022.u().equals((Object)class003922)) {
            throw L.create();
        }
        class005022.N(class003922);
        class077012.N(() -> class00392.N((String)"commands.team.option.name.success", (Object[])new Object[]{class005022.i()}), true);
        return 0;
    }

    private static int N(class07701 class077012, class00502 class005022, boolean bl) throws CommandSyntaxException {
        if (class005022.z() == bl) {
            if (bl) {
                throw M.create();
            }
            throw B.create();
        }
        class005022.y(bl);
        class077012.N(() -> class00392.N((String)("commands.team.option.seeFriendlyInvisibles." + (bl ? "enabled" : "disabled")), (Object[])new Object[]{class005022.i()}), true);
        return 0;
    }

    private static int N(class07701 class077012, class00502 class005022, class06656 class066562) throws CommandSyntaxException {
        if (class005022.W() == class066562) {
            throw U.create();
        }
        class005022.N(class066562);
        class077012.N(() -> class00392.N((String)"commands.team.option.collisionRule.success", (Object[])new Object[]{class005022.i(), class066562.N()}), true);
        return 0;
    }

    private static int N(class07701 class077012, class00502 class005022, class06672 class066722) throws CommandSyntaxException {
        if (class005022.U() == class066722) {
            throw Z.create();
        }
        class005022.N(class066722);
        class077012.N(() -> class00392.N((String)"commands.team.option.nametagVisibility.success", (Object[])new Object[]{class005022.i(), class066722.N()}), true);
        return 0;
    }
}

