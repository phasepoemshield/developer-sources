/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class03711
 *  minecraft.class03734
 *  minecraft.class04227
 *  minecraft.class04403
 *  minecraft.class04770
 *  minecraft.class05946
 *  minecraft.class07151
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07689
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class03711;
import minecraft.class03734;
import minecraft.class04227;
import minecraft.class04403;
import minecraft.class04770;
import minecraft.class05946;
import minecraft.class06402;
import minecraft.class06430;
import minecraft.class07151;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class08164;

public class class06405 {
    private static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> (class00392)object);
    private static final Dynamic2CommandExceptionType y = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"commands.advancement.criterionNotFound", (Object[])new Object[]{object, object2}));

    private static void N(class03734 class037342, List<class03711> list) {
        for (class03734 class037343 : class037342.i()) {
            list.add(class037343.y());
            class06405.N(class037343, list);
        }
    }

    private static List<class03711> N(CommandContext<class07701> commandContext, class03711 class037112, class06402 class064022) {
        class03734 class037342 = ((class07701)commandContext.getSource()).W().Nh().N().N(class037112);
        if (class037342 == null) {
            return List.of(class037112);
        }
        ArrayList<class03711> arrayList = new ArrayList<class03711>();
        if (class064022.field_13460) {
            for (class03734 class037343 = class037342.L(); class037343 != null; class037343 = class037343.L()) {
                arrayList.add(class037343.y());
            }
        }
        arrayList.add(class037112);
        if (class064022.field_13459) {
            class06405.N(class037342, arrayList);
        }
        return arrayList;
    }

    private static int N(class07701 class077012, Collection<class04770> collection, class06430 class064302, Collection<class03711> collection2) throws CommandSyntaxException {
        return class06405.N(class077012, collection, class064302, collection2, true);
    }

    private static int N(class07701 class077012, Collection<class04770> collection, class06430 class064302, Collection<class03711> collection2, boolean bl) throws CommandSyntaxException {
        int n = 0;
        for (class04770 class047702 : collection) {
            n += class064302.N(class047702, collection2, bl);
        }
        if (n == 0) {
            if (collection2.size() == 1) {
                if (collection.size() == 1) {
                    throw N.create((Object)class00392.N((String)(class064302.N() + ".one.to.one.failure"), (Object[])new Object[]{class07151.N((class03711)collection2.iterator().next()), collection.iterator().next().method_5476()}));
                }
                throw N.create((Object)class00392.N((String)(class064302.N() + ".one.to.many.failure"), (Object[])new Object[]{class07151.N((class03711)collection2.iterator().next()), collection.size()}));
            }
            if (collection.size() == 1) {
                throw N.create((Object)class00392.N((String)(class064302.N() + ".many.to.one.failure"), (Object[])new Object[]{collection2.size(), collection.iterator().next().method_5476()}));
            }
            throw N.create((Object)class00392.N((String)(class064302.N() + ".many.to.many.failure"), (Object[])new Object[]{collection2.size(), collection.size()}));
        }
        if (collection2.size() == 1) {
            if (collection.size() == 1) {
                class077012.N(() -> class00392.N((String)(class064302.N() + ".one.to.one.success"), (Object[])new Object[]{class07151.N((class03711)((class03711)collection2.iterator().next())), ((class04770)collection.iterator().next()).method_5476()}), true);
            } else {
                class077012.N(() -> class00392.N((String)(class064302.N() + ".one.to.many.success"), (Object[])new Object[]{class07151.N((class03711)((class03711)collection2.iterator().next())), collection.size()}), true);
            }
        } else if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)(class064302.N() + ".many.to.one.success"), (Object[])new Object[]{collection2.size(), ((class04770)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)(class064302.N() + ".many.to.many.success"), (Object[])new Object[]{collection2.size(), collection.size()}), true);
        }
        return n;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"advancement").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.y((String)"grant").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"targets", (ArgumentType)class07680.u()).then(class07686.y((String)"only").then(((RequiredArgumentBuilder)class07686.N((String)"advancement", (ArgumentType)class04403.N((class05946)class04227.yK)).executes(commandContext -> class06405.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class06430.field_13457, class06405.N((CommandContext<class07701>)commandContext, class04403.i((CommandContext)commandContext, (String)"advancement"), class06402.field_13464)))).then(class07686.N((String)"criterion", (ArgumentType)StringArgumentType.greedyString()).suggests((commandContext, suggestionsBuilder) -> class07689.y(class04403.i((CommandContext)commandContext, (String)"advancement").y().i().keySet(), (SuggestionsBuilder)suggestionsBuilder)).executes(commandContext -> class06405.N((class07701)commandContext.getSource(), (Collection<class04770>)class07680.R((CommandContext)commandContext, (String)"targets"), class06430.field_13457, class04403.i((CommandContext)commandContext, (String)"advancement"), StringArgumentType.getString((CommandContext)commandContext, (String)"criterion"))))))).then(class07686.y((String)"from").then(class07686.N((String)"advancement", (ArgumentType)class04403.N((class05946)class04227.yK)).executes(commandContext -> class06405.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class06430.field_13457, class06405.N((CommandContext<class07701>)commandContext, class04403.i((CommandContext)commandContext, (String)"advancement"), class06402.field_13458)))))).then(class07686.y((String)"until").then(class07686.N((String)"advancement", (ArgumentType)class04403.N((class05946)class04227.yK)).executes(commandContext -> class06405.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class06430.field_13457, class06405.N((CommandContext<class07701>)commandContext, class04403.i((CommandContext)commandContext, (String)"advancement"), class06402.field_13465)))))).then(class07686.y((String)"through").then(class07686.N((String)"advancement", (ArgumentType)class04403.N((class05946)class04227.yK)).executes(commandContext -> class06405.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class06430.field_13457, class06405.N((CommandContext<class07701>)commandContext, class04403.i((CommandContext)commandContext, (String)"advancement"), class06402.field_13462)))))).then(class07686.y((String)"everything").executes(commandContext -> class06405.N((class07701)commandContext.getSource(), (Collection<class04770>)class07680.R((CommandContext)commandContext, (String)"targets"), class06430.field_13457, ((class07701)commandContext.getSource()).W().Nh().y(), false)))))).then(class07686.y((String)"revoke").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"targets", (ArgumentType)class07680.u()).then(class07686.y((String)"only").then(((RequiredArgumentBuilder)class07686.N((String)"advancement", (ArgumentType)class04403.N((class05946)class04227.yK)).executes(commandContext -> class06405.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class06430.field_13456, class06405.N((CommandContext<class07701>)commandContext, class04403.i((CommandContext)commandContext, (String)"advancement"), class06402.field_13464)))).then(class07686.N((String)"criterion", (ArgumentType)StringArgumentType.greedyString()).suggests((commandContext, suggestionsBuilder) -> class07689.y(class04403.i((CommandContext)commandContext, (String)"advancement").y().i().keySet(), (SuggestionsBuilder)suggestionsBuilder)).executes(commandContext -> class06405.N((class07701)commandContext.getSource(), (Collection<class04770>)class07680.R((CommandContext)commandContext, (String)"targets"), class06430.field_13456, class04403.i((CommandContext)commandContext, (String)"advancement"), StringArgumentType.getString((CommandContext)commandContext, (String)"criterion"))))))).then(class07686.y((String)"from").then(class07686.N((String)"advancement", (ArgumentType)class04403.N((class05946)class04227.yK)).executes(commandContext -> class06405.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class06430.field_13456, class06405.N((CommandContext<class07701>)commandContext, class04403.i((CommandContext)commandContext, (String)"advancement"), class06402.field_13458)))))).then(class07686.y((String)"until").then(class07686.N((String)"advancement", (ArgumentType)class04403.N((class05946)class04227.yK)).executes(commandContext -> class06405.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class06430.field_13456, class06405.N((CommandContext<class07701>)commandContext, class04403.i((CommandContext)commandContext, (String)"advancement"), class06402.field_13465)))))).then(class07686.y((String)"through").then(class07686.N((String)"advancement", (ArgumentType)class04403.N((class05946)class04227.yK)).executes(commandContext -> class06405.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class06430.field_13456, class06405.N((CommandContext<class07701>)commandContext, class04403.i((CommandContext)commandContext, (String)"advancement"), class06402.field_13462)))))).then(class07686.y((String)"everything").executes(commandContext -> class06405.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class06430.field_13456, (Collection<class03711>)((class07701)commandContext.getSource()).W().Nh().y()))))));
    }

    private static int N(class07701 class077012, Collection<class04770> collection, class06430 class064302, class03711 class037112, String string) throws CommandSyntaxException {
        int n = 0;
        if (!class037112.y().i().containsKey(string)) {
            throw y.create((Object)class07151.N((class03711)class037112), (Object)string);
        }
        for (class04770 class047702 : collection) {
            if (!class064302.N(class047702, class037112, string)) continue;
            ++n;
        }
        if (n == 0) {
            if (collection.size() == 1) {
                throw N.create((Object)class00392.N((String)(class064302.N() + ".criterion.to.one.failure"), (Object[])new Object[]{string, class07151.N((class03711)class037112), collection.iterator().next().method_5476()}));
            }
            throw N.create((Object)class00392.N((String)(class064302.N() + ".criterion.to.many.failure"), (Object[])new Object[]{string, class07151.N((class03711)class037112), collection.size()}));
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)(class064302.N() + ".criterion.to.one.success"), (Object[])new Object[]{string, class07151.N((class03711)class037112), ((class04770)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)(class064302.N() + ".criterion.to.many.success"), (Object[])new Object[]{string, class07151.N((class03711)class037112), collection.size()}), true);
        }
        return n;
    }
}

