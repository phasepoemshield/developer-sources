/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00518
 *  minecraft.class01759
 *  minecraft.class01762
 *  minecraft.class01765
 *  minecraft.class01766
 *  minecraft.class01782
 *  minecraft.class01784
 *  minecraft.class01786
 *  minecraft.class01788
 *  minecraft.class01890
 *  minecraft.class04348
 *  minecraft.class06394
 *  minecraft.class06640
 *  minecraft.class06675
 *  minecraft.class07686
 *  minecraft.class07689
 *  minecraft.class07698
 *  minecraft.class07701
 *  minecraft.class07758
 *  minecraft.class07764
 *  minecraft.class07785
 *  minecraft.class07786
 *  minecraft.class07794
 *  minecraft.class07802
 *  minecraft.class08164
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00518;
import minecraft.class01759;
import minecraft.class01762;
import minecraft.class01765;
import minecraft.class01766;
import minecraft.class01782;
import minecraft.class01784;
import minecraft.class01786;
import minecraft.class01788;
import minecraft.class01890;
import minecraft.class04348;
import minecraft.class06199;
import minecraft.class06394;
import minecraft.class06640;
import minecraft.class06675;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07698;
import minecraft.class07701;
import minecraft.class07758;
import minecraft.class07764;
import minecraft.class07785;
import minecraft.class07786;
import minecraft.class07794;
import minecraft.class07802;
import minecraft.class08164;
import org.jspecify.annotations.Nullable;

public class class06206 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.scoreboard.objectives.add.duplicate"));
    private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.scoreboard.objectives.display.alreadyEmpty"));
    private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.scoreboard.objectives.display.alreadySet"));
    private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.scoreboard.players.enable.failed"));
    private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.scoreboard.players.enable.invalid"));
    private static final Dynamic2CommandExceptionType R = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"commands.scoreboard.players.get.null", (Object[])new Object[]{object, object2}));

    private static int L(class07701 class077012, Collection<class01766> collection, class00518 class005182, int n) {
        class06394 class063942 = class077012.W().yB();
        int n2 = 0;
        for (class01766 class017662 : collection) {
            class01765 class017652 = class063942.N(class017662, class005182);
            class017652.N(class017652.N() - n);
            n2 += class017652.N();
        }
        if (collection.size() == 1) {
            int n3 = n2;
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.remove.success.single", (Object[])new Object[]{n, class005182.B(), class06206.N(collection), n3}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.remove.success.multiple", (Object[])new Object[]{n, class005182.B(), collection.size()}), true);
        }
        return n2;
    }

    private static int y(class07701 class077012, Collection<class01766> collection, class00518 class005182, int n) {
        class06394 class063942 = class077012.W().yB();
        int n2 = 0;
        for (class01766 class017662 : collection) {
            class01765 class017652 = class063942.N(class017662, class005182);
            class017652.N(class017652.N() + n);
            n2 += class017652.N();
        }
        if (collection.size() == 1) {
            int n3 = n2;
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.add.success.single", (Object[])new Object[]{n, class005182.B(), class06206.N(collection), n3}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.add.success.multiple", (Object[])new Object[]{n, class005182.B(), collection.size()}), true);
        }
        return n2;
    }

    private static int y(class07701 class077012) {
        Collection var1 = class077012.W().yB().N();
        if (var1.isEmpty()) {
            class077012.N(() -> class00392.L((String)"commands.scoreboard.objectives.list.empty"), false);
        } else {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.objectives.list.success", (Object[])new Object[]{var1.size(), class00390.y((Collection)var1, class00518::B)}), false);
        }
        return var1.size();
    }

    private static int y(class07701 class077012, Collection<class01766> collection, class00518 class005182) {
        class06394 class063942 = class077012.W().yB();
        for (class01766 class017662 : collection) {
            class063942.L(class017662, class005182);
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.reset.specific.single", (Object[])new Object[]{class005182.B(), class06206.N(collection)}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.reset.specific.multiple", (Object[])new Object[]{class005182.B(), collection.size()}), true);
        }
        return collection.size();
    }

    private static class00392 N(Collection<class01766> collection) {
        return collection.iterator().next().yZ();
    }

    private static LiteralArgumentBuilder<class07701> N() {
        LiteralArgumentBuilder var0 = class07686.y((String)"rendertype");
        for (class06640 class066402 : class06640.values()) {
            var0.then(class07686.y((String)class066402.N()).executes(commandContext -> class06206.N((class07701)commandContext.getSource(), class07794.N((CommandContext)commandContext, (String)"objective"), class066402)));
        }
        return var0;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"scoreboard").requires((Predicate)class07686.N((class08164)class07686.u))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"objectives").then(class07686.y((String)"list").executes(commandContext -> class06206.y((class07701)commandContext.getSource())))).then(class07686.y((String)"add").then(class07686.N((String)"objective", (ArgumentType)StringArgumentType.word()).then(((RequiredArgumentBuilder)class07686.N((String)"criteria", (ArgumentType)class07764.N()).executes(commandContext -> class06206.N((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"objective"), class07764.N((CommandContext)commandContext, (String)"criteria"), (class00392)class00392.y((String)StringArgumentType.getString((CommandContext)commandContext, (String)"objective"))))).then(class07686.N((String)"displayName", (ArgumentType)class07698.N((class04348)class043482)).executes(commandContext -> class06206.N((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"objective"), class07764.N((CommandContext)commandContext, (String)"criteria"), class07698.y((CommandContext)commandContext, (String)"displayName")))))))).then(class07686.y((String)"modify").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"objective", (ArgumentType)class07794.N()).then(class07686.y((String)"displayname").then(class07686.N((String)"displayName", (ArgumentType)class07698.N((class04348)class043482)).executes(commandContext -> class06206.N((class07701)commandContext.getSource(), class07794.N((CommandContext)commandContext, (String)"objective"), class07698.y((CommandContext)commandContext, (String)"displayName")))))).then(class06206.N())).then(class07686.y((String)"displayautoupdate").then(class07686.N((String)"value", (ArgumentType)BoolArgumentType.bool()).executes(commandContext -> class06206.N((class07701)commandContext.getSource(), class07794.N((CommandContext)commandContext, (String)"objective"), BoolArgumentType.getBool((CommandContext)commandContext, (String)"value")))))).then(class06206.N(class043482, class07686.y((String)"numberformat"), (CommandContext<class07701> commandContext, class01762 class017622) -> class06206.N((class07701)commandContext.getSource(), class07794.N((CommandContext)commandContext, (String)"objective"), class017622)))))).then(class07686.y((String)"remove").then(class07686.N((String)"objective", (ArgumentType)class07794.N()).executes(commandContext -> class06206.N((class07701)commandContext.getSource(), class07794.N((CommandContext)commandContext, (String)"objective")))))).then(class07686.y((String)"setdisplay").then(((RequiredArgumentBuilder)class07686.N((String)"slot", (ArgumentType)class07758.N()).executes(commandContext -> class06206.N((class07701)commandContext.getSource(), class07758.N((CommandContext)commandContext, (String)"slot")))).then(class07686.N((String)"objective", (ArgumentType)class07794.N()).executes(commandContext -> class06206.N((class07701)commandContext.getSource(), class07758.N((CommandContext)commandContext, (String)"slot"), class07794.N((CommandContext)commandContext, (String)"objective")))))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"players").then(((LiteralArgumentBuilder)class07686.y((String)"list").executes(commandContext -> class06206.N((class07701)commandContext.getSource()))).then(class07686.N((String)"target", (ArgumentType)class07786.N()).suggests(class07786.N).executes(commandContext -> class06206.N((class07701)commandContext.getSource(), class07786.N((CommandContext)commandContext, (String)"target")))))).then(class07686.y((String)"set").then(class07686.N((String)"targets", (ArgumentType)class07786.y()).suggests(class07786.N).then(class07686.N((String)"objective", (ArgumentType)class07794.N()).then(class07686.N((String)"score", (ArgumentType)IntegerArgumentType.integer()).executes(commandContext -> class06206.N((class07701)commandContext.getSource(), (Collection<class01766>)class07786.L((CommandContext)commandContext, (String)"targets"), class07794.y((CommandContext)commandContext, (String)"objective"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"score")))))))).then(class07686.y((String)"get").then(class07686.N((String)"target", (ArgumentType)class07786.N()).suggests(class07786.N).then(class07686.N((String)"objective", (ArgumentType)class07794.N()).executes(commandContext -> class06206.N((class07701)commandContext.getSource(), class07786.N((CommandContext)commandContext, (String)"target"), class07794.N((CommandContext)commandContext, (String)"objective"))))))).then(class07686.y((String)"add").then(class07686.N((String)"targets", (ArgumentType)class07786.y()).suggests(class07786.N).then(class07686.N((String)"objective", (ArgumentType)class07794.N()).then(class07686.N((String)"score", (ArgumentType)IntegerArgumentType.integer((int)0)).executes(commandContext -> class06206.y((class07701)commandContext.getSource(), class07786.L((CommandContext)commandContext, (String)"targets"), class07794.y((CommandContext)commandContext, (String)"objective"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"score")))))))).then(class07686.y((String)"remove").then(class07686.N((String)"targets", (ArgumentType)class07786.y()).suggests(class07786.N).then(class07686.N((String)"objective", (ArgumentType)class07794.N()).then(class07686.N((String)"score", (ArgumentType)IntegerArgumentType.integer((int)0)).executes(commandContext -> class06206.L((class07701)commandContext.getSource(), class07786.L((CommandContext)commandContext, (String)"targets"), class07794.y((CommandContext)commandContext, (String)"objective"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"score")))))))).then(class07686.y((String)"reset").then(((RequiredArgumentBuilder)class07686.N((String)"targets", (ArgumentType)class07786.y()).suggests(class07786.N).executes(commandContext -> class06206.N((class07701)commandContext.getSource(), (Collection<class01766>)class07786.L((CommandContext)commandContext, (String)"targets")))).then(class07686.N((String)"objective", (ArgumentType)class07794.N()).executes(commandContext -> class06206.y((class07701)commandContext.getSource(), (Collection<class01766>)class07786.L((CommandContext)commandContext, (String)"targets"), class07794.N((CommandContext)commandContext, (String)"objective"))))))).then(class07686.y((String)"enable").then(class07686.N((String)"targets", (ArgumentType)class07786.y()).suggests(class07786.N).then(class07686.N((String)"objective", (ArgumentType)class07794.N()).suggests((commandContext, suggestionsBuilder) -> class06206.N((class07701)commandContext.getSource(), (Collection<class01766>)class07786.L((CommandContext)commandContext, (String)"targets"), suggestionsBuilder)).executes(commandContext -> class06206.N((class07701)commandContext.getSource(), (Collection<class01766>)class07786.L((CommandContext)commandContext, (String)"targets"), class07794.N((CommandContext)commandContext, (String)"objective"))))))).then(((LiteralArgumentBuilder)class07686.y((String)"display").then(class07686.y((String)"name").then(class07686.N((String)"targets", (ArgumentType)class07786.y()).suggests(class07786.N).then(((RequiredArgumentBuilder)class07686.N((String)"objective", (ArgumentType)class07794.N()).then(class07686.N((String)"name", (ArgumentType)class07698.N((class04348)class043482)).executes(commandContext -> class06206.N((class07701)commandContext.getSource(), (Collection<class01766>)class07786.L((CommandContext)commandContext, (String)"targets"), class07794.N((CommandContext)commandContext, (String)"objective"), class07698.y((CommandContext)commandContext, (String)"name"))))).executes(commandContext -> class06206.N((class07701)commandContext.getSource(), (Collection<class01766>)class07786.L((CommandContext)commandContext, (String)"targets"), class07794.N((CommandContext)commandContext, (String)"objective"), null)))))).then(class07686.y((String)"numberformat").then(class07686.N((String)"targets", (ArgumentType)class07786.y()).suggests(class07786.N).then(class06206.N(class043482, class07686.N((String)"objective", (ArgumentType)class07794.N()), (CommandContext<class07701> commandContext, class01762 class017622) -> class06206.N((class07701)commandContext.getSource(), (Collection<class01766>)class07786.L((CommandContext)commandContext, (String)"targets"), class07794.N((CommandContext)commandContext, (String)"objective"), class017622))))))).then(class07686.y((String)"operation").then(class07686.N((String)"targets", (ArgumentType)class07786.y()).suggests(class07786.N).then(class07686.N((String)"targetObjective", (ArgumentType)class07794.N()).then(class07686.N((String)"operation", (ArgumentType)class07785.N()).then(class07686.N((String)"source", (ArgumentType)class07786.y()).suggests(class07786.N).then(class07686.N((String)"sourceObjective", (ArgumentType)class07794.N()).executes(commandContext -> class06206.N((class07701)commandContext.getSource(), class07786.L((CommandContext)commandContext, (String)"targets"), class07794.y((CommandContext)commandContext, (String)"targetObjective"), class07785.N((CommandContext)commandContext, (String)"operation"), class07786.L((CommandContext)commandContext, (String)"source"), class07794.N((CommandContext)commandContext, (String)"sourceObjective")))))))))));
    }

    private static int N(class07701 class077012, class01766 class017662, class00518 class005182) throws CommandSyntaxException {
        class01788 class017882 = class077012.W().yB().y(class017662, class005182);
        if (class017882 == null) {
            throw R.create((Object)class005182.L(), (Object)class017662.yZ());
        }
        class077012.N(() -> class00392.N((String)"commands.scoreboard.players.get.success", (Object[])new Object[]{class017662.yZ(), class017882.y(), class005182.B()}), false);
        return class017882.y();
    }

    private static ArgumentBuilder<class07701, ?> N(class04348 class043482, ArgumentBuilder<class07701, ?> argumentBuilder, class06199 class061992) {
        return argumentBuilder.then(class07686.y((String)"blank").executes(commandContext -> class061992.run((CommandContext<class07701>)commandContext, (class01762)class01784.N))).then(class07686.y((String)"fixed").then(class07686.N((String)"contents", (ArgumentType)class07698.N((class04348)class043482)).executes(commandContext -> {
            class00392 class003922 = class07698.y((CommandContext)commandContext, (String)"contents");
            return class061992.run((CommandContext<class07701>)commandContext, (class01762)new class01782(class003922));
        }))).then(class07686.y((String)"styled").then(class07686.N((String)"style", (ArgumentType)class01786.N((class04348)class043482)).executes(commandContext -> {
            class00405 class004052 = class01786.N((CommandContext)commandContext, (String)"style");
            return class061992.run((CommandContext<class07701>)commandContext, (class01762)new class01759(class004052));
        }))).executes(commandContext -> class061992.run((CommandContext<class07701>)commandContext, null));
    }

    private static CompletableFuture<Suggestions> N(class07701 class077012, Collection<class01766> collection, SuggestionsBuilder suggestionsBuilder) {
        ArrayList arrayList = Lists.newArrayList();
        class06394 class063942 = class077012.W().yB();
        for (class00518 class005182 : class063942.N()) {
            if (class005182.u() != class06675.L) continue;
            boolean bl = false;
            for (class01766 class017662 : collection) {
                class01788 class017882 = class063942.y(class017662, class005182);
                if (class017882 != null && !class017882.L()) continue;
                bl = true;
                break;
            }
            if (!bl) continue;
            arrayList.add(class005182.L());
        }
        return class07689.y((Iterable)arrayList, (SuggestionsBuilder)suggestionsBuilder);
    }

    private static int N(class07701 class077012, String string, class06675 class066752, class00392 class003922) throws CommandSyntaxException {
        class06394 class063942 = class077012.W().yB();
        if (class063942.N(string) != null) {
            throw N.create();
        }
        class063942.N(string, class066752, class003922, class066752.u(), false, null);
        class00518 class005182 = class063942.N(string);
        class077012.N(() -> class00392.N((String)"commands.scoreboard.objectives.add.success", (Object[])new Object[]{class005182.B()}), true);
        return class063942.N().size();
    }

    private static int N(class07701 class077012, class00518 class005182) {
        class06394 class063942 = class077012.W().yB();
        class063942.y(class005182);
        class077012.N(() -> class00392.N((String)"commands.scoreboard.objectives.remove.success", (Object[])new Object[]{class005182.B()}), true);
        return class063942.N().size();
    }

    private static int N(class07701 class077012, class00518 class005182, class06640 class066402) {
        if (class005182.Z() != class066402) {
            class005182.N(class066402);
            class077012.N(() -> class00392.N((String)"commands.scoreboard.objectives.modify.rendertype", (Object[])new Object[]{class005182.B()}), true);
        }
        return 0;
    }

    private static int N(class07701 class077012, Collection<class01766> collection, class00518 class005182, @Nullable class00392 class003922) {
        class06394 class063942 = class077012.W().yB();
        for (class01766 class017662 : collection) {
            class063942.N(class017662, class005182).N(class003922);
        }
        if (class003922 == null) {
            if (collection.size() == 1) {
                class077012.N(() -> class00392.N((String)"commands.scoreboard.players.display.name.clear.success.single", (Object[])new Object[]{class06206.N(collection), class005182.B()}), true);
            } else {
                class077012.N(() -> class00392.N((String)"commands.scoreboard.players.display.name.clear.success.multiple", (Object[])new Object[]{collection.size(), class005182.B()}), true);
            }
        } else if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.display.name.set.success.single", (Object[])new Object[]{class003922, class06206.N(collection), class005182.B()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.display.name.set.success.multiple", (Object[])new Object[]{class003922, collection.size(), class005182.B()}), true);
        }
        return collection.size();
    }

    private static int N(class07701 class077012, Collection<class01766> collection, class00518 class005182, @Nullable class01762 class017622) {
        class06394 class063942 = class077012.W().yB();
        for (class01766 class017662 : collection) {
            class063942.N(class017662, class005182).N(class017622);
        }
        if (class017622 == null) {
            if (collection.size() == 1) {
                class077012.N(() -> class00392.N((String)"commands.scoreboard.players.display.numberFormat.clear.success.single", (Object[])new Object[]{class06206.N(collection), class005182.B()}), true);
            } else {
                class077012.N(() -> class00392.N((String)"commands.scoreboard.players.display.numberFormat.clear.success.multiple", (Object[])new Object[]{collection.size(), class005182.B()}), true);
            }
        } else if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.display.numberFormat.set.success.single", (Object[])new Object[]{class06206.N(collection), class005182.B()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.display.numberFormat.set.success.multiple", (Object[])new Object[]{collection.size(), class005182.B()}), true);
        }
        return collection.size();
    }

    private static int N(class07701 class077012, class01890 class018902, class00518 class005182) throws CommandSyntaxException {
        class06394 class063942 = class077012.W().yB();
        if (class063942.N(class018902) == class005182) {
            throw L.create();
        }
        class063942.N(class018902, class005182);
        class077012.N(() -> class00392.N((String)"commands.scoreboard.objectives.display.set", (Object[])new Object[]{class018902.method_15434(), class005182.i()}), true);
        return 0;
    }

    private static int N(class07701 class077012, class01890 class018902) throws CommandSyntaxException {
        class06394 class063942 = class077012.W().yB();
        if (class063942.N(class018902) == null) {
            throw y.create();
        }
        class063942.N(class018902, null);
        class077012.N(() -> class00392.N((String)"commands.scoreboard.objectives.display.cleared", (Object[])new Object[]{class018902.method_15434()}), true);
        return 0;
    }

    private static int N(class07701 class077012, class01766 class017662) {
        Object2IntMap var2 = class077012.W().yB().y(class017662);
        if (var2.isEmpty()) {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.list.entity.empty", (Object[])new Object[]{class017662.yZ()}), false);
        } else {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.list.entity.success", (Object[])new Object[]{class017662.yZ(), var2.size()}), false);
            Object2IntMaps.fastForEach((Object2IntMap)var2, entry -> class077012.N(() -> class00392.N((String)"commands.scoreboard.players.list.entity.entry", (Object[])new Object[]{((class00518)entry.getKey()).B(), entry.getIntValue()}), false));
        }
        return var2.size();
    }

    private static int N(class07701 class077012) {
        Collection var1 = class077012.W().yB().L();
        if (var1.isEmpty()) {
            class077012.N(() -> class00392.L((String)"commands.scoreboard.players.list.empty"), false);
        } else {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.list.success", (Object[])new Object[]{var1.size(), class00390.y((Collection)var1, class01766::yZ)}), false);
        }
        return var1.size();
    }

    private static int N(class07701 class077012, class00518 class005182, class00392 class003922) {
        if (!class005182.i().equals((Object)class003922)) {
            class005182.N(class003922);
            class077012.N(() -> class00392.N((String)"commands.scoreboard.objectives.modify.displayname", (Object[])new Object[]{class005182.L(), class005182.B()}), true);
        }
        return 0;
    }

    private static int N(class07701 class077012, class00518 class005182, boolean bl) {
        if (class005182.R() != bl) {
            class005182.N(bl);
            if (bl) {
                class077012.N(() -> class00392.N((String)"commands.scoreboard.objectives.modify.displayAutoUpdate.enable", (Object[])new Object[]{class005182.L(), class005182.B()}), true);
            } else {
                class077012.N(() -> class00392.N((String)"commands.scoreboard.objectives.modify.displayAutoUpdate.disable", (Object[])new Object[]{class005182.L(), class005182.B()}), true);
            }
        }
        return 0;
    }

    private static int N(class07701 class077012, class00518 class005182, @Nullable class01762 class017622) {
        class005182.y(class017622);
        if (class017622 != null) {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.objectives.modify.objectiveFormat.set", (Object[])new Object[]{class005182.L()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.objectives.modify.objectiveFormat.clear", (Object[])new Object[]{class005182.L()}), true);
        }
        return 0;
    }

    private static int N(class07701 class077012, Collection<class01766> collection, class00518 class005182) throws CommandSyntaxException {
        if (class005182.u() != class06675.L) {
            throw i.create();
        }
        class06394 class063942 = class077012.W().yB();
        int n = 0;
        for (class01766 class017662 : collection) {
            class01765 class017652 = class063942.N(class017662, class005182);
            if (!class017652.L()) continue;
            class017652.u();
            ++n;
        }
        if (n == 0) {
            throw u.create();
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.enable.success.single", (Object[])new Object[]{class005182.B(), class06206.N(collection)}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.enable.success.multiple", (Object[])new Object[]{class005182.B(), collection.size()}), true);
        }
        return n;
    }

    private static int N(class07701 class077012, Collection<class01766> collection) {
        class06394 class063942 = class077012.W().yB();
        for (class01766 class017662 : collection) {
            class063942.N(class017662);
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.reset.all.single", (Object[])new Object[]{class06206.N(collection)}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.reset.all.multiple", (Object[])new Object[]{collection.size()}), true);
        }
        return collection.size();
    }

    private static int N(class07701 class077012, Collection<class01766> collection, class00518 class005182, class07802 class078022, Collection<class01766> collection2, class00518 class005183) throws CommandSyntaxException {
        class06394 class063942 = class077012.W().yB();
        int n = 0;
        for (class01766 class017662 : collection) {
            class01765 class017652 = class063942.N(class017662, class005182);
            for (class01766 class017663 : collection2) {
                class01765 class017653 = class063942.N(class017663, class005183);
                class078022.apply(class017652, class017653);
            }
            n += class017652.N();
        }
        if (collection.size() == 1) {
            int n2 = n;
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.operation.success.single", (Object[])new Object[]{class005182.B(), class06206.N(collection), n2}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.operation.success.multiple", (Object[])new Object[]{class005182.B(), collection.size()}), true);
        }
        return n;
    }

    private static int N(class07701 class077012, Collection<class01766> collection, class00518 class005182, int n) {
        class06394 class063942 = class077012.W().yB();
        for (class01766 class017662 : collection) {
            class063942.N(class017662, class005182).N(n);
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.set.success.single", (Object[])new Object[]{class005182.B(), class06206.N(collection), n}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.scoreboard.players.set.success.multiple", (Object[])new Object[]{class005182.B(), collection.size(), n}), true);
        }
        return n * collection.size();
    }
}

