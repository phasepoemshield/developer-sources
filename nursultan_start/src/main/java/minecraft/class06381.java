/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10576
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00717
 *  minecraft.class00753
 *  minecraft.class00881
 *  minecraft.class00894
 *  minecraft.class01894
 *  minecraft.class02198
 *  minecraft.class03556
 *  minecraft.class04160
 *  minecraft.class04162
 *  minecraft.class04348
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04803
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06411
 *  minecraft.class06551
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06770
 *  minecraft.class06889
 *  minecraft.class06925
 *  minecraft.class07049
 *  minecraft.class07085
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07482
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class07787
 *  minecraft.class08036
 *  minecraft.class08164
 */
package minecraft;

import Nursultan.class10576;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00717;
import minecraft.class00753;
import minecraft.class00881;
import minecraft.class00894;
import minecraft.class01894;
import minecraft.class02198;
import minecraft.class03556;
import minecraft.class04160;
import minecraft.class04162;
import minecraft.class04348;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04803;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06352;
import minecraft.class06383;
import minecraft.class06411;
import minecraft.class06551;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06770;
import minecraft.class06889;
import minecraft.class06925;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07482;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class07787;
import minecraft.class08036;
import minecraft.class08164;

public class class06381 {
    private static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.drop.no_held_items", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.drop.no_loot_table.entity", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.drop.no_loot_table.block", (Object[])new Object[]{object}));

    private static boolean N(class06695 class066952, class06584 class065842) {
        boolean bl = false;
        for (int i = 0; i < class066952.method_5439() && !class065842.R(); ++i) {
            class06584 class065843 = class066952.method_5438(i);
            if (!class066952.method_5437(i, class065842)) continue;
            if (class065843.R()) {
                class066952.method_5447(i, class065842);
                bl = true;
                break;
            }
            if (!class06381.N(class065843, class065842)) continue;
            int n = class065842.U() - class065843.c();
            int n2 = Math.min(class065842.c(), n);
            class065842.B(n2);
            class065843.M(n2);
            bl = true;
        }
        return bl;
    }

    private static int N(class07701 class077012, class07209 class072092, List<class06584> list, class06411 class064112) throws CommandSyntaxException {
        class06695 class066952 = class06381.N(class077012, class072092);
        ArrayList arrayList = Lists.newArrayListWithCapacity((int)list.size());
        for (class06584 class065842 : list) {
            if (!class06381.N(class066952, class065842.t())) continue;
            class066952.method_5431();
            arrayList.add(class065842);
        }
        class064112.accept((List)arrayList);
        return arrayList.size();
    }

    private static class06695 N(class07701 class077012, class07209 class072092) throws CommandSyntaxException {
        class00394 class003942 = class077012.R().method_8321(class072092);
        if (!(class003942 instanceof class06695)) {
            throw class06352.N.create((Object)class072092.method_10263(), (Object)class072092.method_10264(), (Object)class072092.method_10260());
        }
        return (class06695)class003942;
    }

    private static <T extends ArgumentBuilder<class07701, T>> T N(T t, class10576 class105762) {
        return (T)t.then(((LiteralArgumentBuilder)class07686.y((String)"replace").then(class07686.y((String)"entity").then(class07686.N((String)"entities", (ArgumentType)class07680.y()).then(class105762.construct((ArgumentBuilder)class07686.N((String)"slot", (ArgumentType)class07787.N()), (commandContext, list, class064112) -> class06381.N(class07680.y((CommandContext)commandContext, (String)"entities"), class07787.N((CommandContext)commandContext, (String)"slot"), list.size(), list, class064112)).then(class105762.construct((ArgumentBuilder)class07686.N((String)"count", (ArgumentType)IntegerArgumentType.integer((int)0)), (commandContext, list, class064112) -> class06381.N(class07680.y((CommandContext)commandContext, (String)"entities"), class07787.N((CommandContext)commandContext, (String)"slot"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"count"), list, class064112))))))).then(class07686.y((String)"block").then(class07686.N((String)"targetPos", (ArgumentType)class00894.N()).then(class105762.construct((ArgumentBuilder)class07686.N((String)"slot", (ArgumentType)class07787.N()), (commandContext, list, class064112) -> class06381.N((class07701)commandContext.getSource(), class00894.N((CommandContext)commandContext, (String)"targetPos"), class07787.N((CommandContext)commandContext, (String)"slot"), list.size(), list, class064112)).then(class105762.construct((ArgumentBuilder)class07686.N((String)"count", (ArgumentType)IntegerArgumentType.integer((int)0)), (commandContext, list, class064112) -> class06381.N((class07701)commandContext.getSource(), class00894.N((CommandContext)commandContext, (String)"targetPos"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"slot"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"count"), list, class064112))))))).then(class07686.y((String)"insert").then(class105762.construct((ArgumentBuilder)class07686.N((String)"targetPos", (ArgumentType)class00894.N()), (commandContext, list, class064112) -> class06381.N((class07701)commandContext.getSource(), class00894.N((CommandContext)commandContext, (String)"targetPos"), (List<class06584>)list, class064112)))).then(class07686.y((String)"give").then(class105762.construct((ArgumentBuilder)class07686.N((String)"players", (ArgumentType)class07680.u()), (commandContext, list, class064112) -> class06381.N(class07680.R((CommandContext)commandContext, (String)"players"), (List<class06584>)list, class064112)))).then(class07686.y((String)"spawn").then(class105762.construct((ArgumentBuilder)class07686.N((String)"targetPos", (ArgumentType)class00881.N()), (commandContext, list, class064112) -> class06381.N((class07701)commandContext.getSource(), class00881.N((CommandContext)commandContext, (String)"targetPos"), (List<class06584>)list, class064112))));
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register(class06381.N((LiteralArgumentBuilder)class07686.y((String)"loot").requires((Predicate)class07686.N((class08164)class07686.u)), (argumentBuilder, class063832) -> argumentBuilder.then(class07686.y((String)"fish").then(class07686.N((String)"loot_table", (ArgumentType)class02198.N((class04348)class043482)).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"pos", (ArgumentType)class00894.N()).executes(commandContext -> class06381.N((CommandContext<class07701>)commandContext, (class03556<class05074>)class02198.N((CommandContext)commandContext, (String)"loot_table"), class00894.N((CommandContext)commandContext, (String)"pos"), class06584.E, class063832))).then(class07686.N((String)"tool", (ArgumentType)class06770.N((class04348)class043482)).executes(commandContext -> class06381.N((CommandContext<class07701>)commandContext, (class03556<class05074>)class02198.N((CommandContext)commandContext, (String)"loot_table"), class00894.N((CommandContext)commandContext, (String)"pos"), class06770.N((CommandContext)commandContext, (String)"tool").N(1, false), class063832)))).then(class07686.y((String)"mainhand").executes(commandContext -> class06381.N((CommandContext<class07701>)commandContext, (class03556<class05074>)class02198.N((CommandContext)commandContext, (String)"loot_table"), class00894.N((CommandContext)commandContext, (String)"pos"), class06381.N((class07701)commandContext.getSource(), class07085.field_6173), class063832)))).then(class07686.y((String)"offhand").executes(commandContext -> class06381.N((CommandContext<class07701>)commandContext, (class03556<class05074>)class02198.N((CommandContext)commandContext, (String)"loot_table"), class00894.N((CommandContext)commandContext, (String)"pos"), class06381.N((class07701)commandContext.getSource(), class07085.field_6171), class063832)))))).then(class07686.y((String)"loot").then(class07686.N((String)"loot_table", (ArgumentType)class02198.N((class04348)class043482)).executes(commandContext -> class06381.N((CommandContext<class07701>)commandContext, (class03556<class05074>)class02198.N((CommandContext)commandContext, (String)"loot_table"), class063832)))).then(class07686.y((String)"kill").then(class07686.N((String)"target", (ArgumentType)class07680.N()).executes(commandContext -> class06381.N((CommandContext<class07701>)commandContext, class07680.N((CommandContext)commandContext, (String)"target"), class063832)))).then(class07686.y((String)"mine").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"pos", (ArgumentType)class00894.N()).executes(commandContext -> class06381.N((CommandContext<class07701>)commandContext, class00894.N((CommandContext)commandContext, (String)"pos"), class06584.E, class063832))).then(class07686.N((String)"tool", (ArgumentType)class06770.N((class04348)class043482)).executes(commandContext -> class06381.N((CommandContext<class07701>)commandContext, class00894.N((CommandContext)commandContext, (String)"pos"), class06770.N((CommandContext)commandContext, (String)"tool").N(1, false), class063832)))).then(class07686.y((String)"mainhand").executes(commandContext -> class06381.N((CommandContext<class07701>)commandContext, class00894.N((CommandContext)commandContext, (String)"pos"), class06381.N((class07701)commandContext.getSource(), class07085.field_6173), class063832)))).then(class07686.y((String)"offhand").executes(commandContext -> class06381.N((CommandContext<class07701>)commandContext, class00894.N((CommandContext)commandContext, (String)"pos"), class06381.N((class07701)commandContext.getSource(), class07085.field_6171), class063832)))))));
    }

    private static void N(class07701 class077012, List<class06584> list) {
        if (list.size() == 1) {
            class06584 class065842 = list.get(0);
            class077012.N(() -> class00392.N((String)"commands.drop.success.single", (Object[])new Object[]{class065842.c(), class065842.V()}), false);
        } else {
            class077012.N(() -> class00392.N((String)"commands.drop.success.multiple", (Object[])new Object[]{list.size()}), false);
        }
    }

    private static void N(class07701 class077012, List<class06584> list, class05946<class05074> class059462) {
        if (list.size() == 1) {
            class06584 class065842 = list.get(0);
            class077012.N(() -> class00392.N((String)"commands.drop.success.single_with_table", (Object[])new Object[]{class065842.c(), class065842.V(), class00392.N((class01894)class059462.N())}), false);
        } else {
            class077012.N(() -> class00392.N((String)"commands.drop.success.multiple_with_table", (Object[])new Object[]{list.size(), class00392.N((class01894)class059462.N())}), false);
        }
    }

    private static class06584 N(class07701 class077012, class07085 class070852) throws CommandSyntaxException {
        class07049 class070492 = class077012.B();
        if (class070492 instanceof class07438) {
            return ((class07438)class070492).method_6118(class070852);
        }
        throw N.create((Object)class070492.method_5476());
    }

    private static int N(CommandContext<class07701> commandContext, class07209 class072092, class06584 class065842, class06383 class063832) throws CommandSyntaxException {
        class07701 class077012 = (class07701)commandContext.getSource();
        class04782 class047822 = class077012.R();
        class00500 class005002 = class047822.method_8320(class072092);
        class00394 class003942 = class047822.method_8321(class072092);
        Optional var8 = class005002.i().d();
        if (var8.isEmpty()) {
            throw L.create((Object)class005002.i().M());
        }
        class04160 class041602 = new class04160(class047822).N(class06551.B, (Object)class06889.y((class00753)class072092)).N(class06551.Z, (Object)class005002).y(class06551.z, (Object)class003942).y(class06551.N, (Object)class077012.M()).N(class06551.U, (Object)class065842);
        List var10 = class005002.N(class041602);
        return class063832.accept(commandContext, var10, list -> class06381.N(class077012, (List<class06584>)list, (class05946<class05074>)((class05946)var8.get())));
    }

    private static int N(CommandContext<class07701> commandContext, class07049 class070492, class06383 class063832) throws CommandSyntaxException {
        class08036 class080362;
        Optional var3 = class070492.method_5991();
        if (var3.isEmpty()) {
            throw y.create((Object)class070492.method_5476());
        }
        class07701 class077012 = (class07701)commandContext.getSource();
        class04160 class041602 = new class04160(class077012.R());
        class07049 class070493 = class077012.M();
        if (class070493 instanceof class08036) {
            class080362 = (class08036)class070493;
            class041602.N(class06551.u, (Object)class080362);
        }
        class041602.N(class06551.i, (Object)class070492.method_48923().T());
        class041602.y(class06551.M, (Object)class070493);
        class041602.y(class06551.R, (Object)class070493);
        class041602.N(class06551.N, (Object)class070492);
        class041602.N(class06551.B, (Object)class077012.i());
        class080362 = class041602.N(class06925.B);
        ObjectArrayList var9 = class077012.W().yd().N((class05946)var3.get()).N((class04162)class080362);
        return class063832.accept(commandContext, (List<class06584>)var9, list -> class06381.N(class077012, (List<class06584>)list, (class05946<class05074>)((class05946)var3.get())));
    }

    private static boolean N(class06584 class065842, class06584 class065843) {
        return class065842.c() <= class065842.U() && class06584.L((class06584)class065842, (class06584)class065843);
    }

    private static int N(Collection<class04770> collection, List<class06584> list, class06411 class064112) throws CommandSyntaxException {
        ArrayList arrayList = Lists.newArrayListWithCapacity((int)list.size());
        for (class06584 class065842 : list) {
            Iterator<class04770> iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (!iterator.next().method_31548().M(class065842.t())) continue;
                arrayList.add(class065842);
            }
        }
        class064112.accept((List)arrayList);
        return arrayList.size();
    }

    private static void N(class07049 class070492, List<class06584> list, int n, int n2, List<class06584> list2) {
        for (int i = 0; i < n2; ++i) {
            class06584 class065842 = i < list.size() ? list.get(i) : class06584.E;
            class04803 class048032 = class070492.method_32318(n + i);
            if (class048032 == null || !class048032.N(class065842.t())) continue;
            list2.add(class065842);
        }
    }

    private static int N(Collection<? extends class07049> collection, int n, int n2, List<class06584> list, class06411 class064112) throws CommandSyntaxException {
        ArrayList arrayList = Lists.newArrayListWithCapacity((int)list.size());
        for (class07049 class070492 : collection) {
            if (class070492 instanceof class04770) {
                class04770 class047702 = (class04770)class070492;
                class06381.N(class070492, list, n, n2, arrayList);
                ((class07482)class047702.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).u();
                continue;
            }
            class06381.N(class070492, list, n, n2, arrayList);
        }
        class064112.accept((List)arrayList);
        return arrayList.size();
    }

    private static int N(class07701 class077012, class06889 class068892, List<class06584> list, class06411 class064112) throws CommandSyntaxException {
        class04782 class047822 = class077012.R();
        list.forEach(class065842 -> {
            class00717 class007172 = new class00717((class07299)class047822, class068892.M, class068892.B, class068892.Z, class065842.t());
            class007172.L();
            class047822.method_8649((class07049)class007172);
        });
        class064112.accept(list);
        return list.size();
    }

    private static int N(class07701 class077012, class07209 class072092, int n, int n2, List<class06584> list, class06411 class064112) throws CommandSyntaxException {
        class06695 class066952 = class06381.N(class077012, class072092);
        int n3 = class066952.method_5439();
        if (n < 0 || n >= n3) {
            throw class06352.L.create((Object)n);
        }
        ArrayList arrayList = Lists.newArrayListWithCapacity((int)list.size());
        for (int i = 0; i < n2; ++i) {
            class06584 class065842;
            int n4 = n + i;
            class06584 class065843 = class065842 = i < list.size() ? list.get(i) : class06584.E;
            if (!class066952.method_5437(n4, class065842)) continue;
            class066952.method_5447(n4, class065842);
            arrayList.add(class065842);
        }
        class064112.accept((List)arrayList);
        return arrayList.size();
    }

    private static int N(CommandContext<class07701> commandContext, class03556<class05074> class035562, class07209 class072092, class06584 class065842, class06383 class063832) throws CommandSyntaxException {
        class07701 class077012 = (class07701)commandContext.getSource();
        class04162 class041622 = new class04160(class077012.R()).N(class06551.B, (Object)class06889.y((class00753)class072092)).N(class06551.U, (Object)class065842).y(class06551.N, (Object)class077012.M()).N(class06925.M);
        return class06381.N(commandContext, class035562, class041622, class063832);
    }

    private static int N(CommandContext<class07701> commandContext, class03556<class05074> class035562, class06383 class063832) throws CommandSyntaxException {
        class07701 class077012 = (class07701)commandContext.getSource();
        class04162 class041622 = new class04160(class077012.R()).y(class06551.N, (Object)class077012.M()).N(class06551.B, (Object)class077012.i()).N(class06925.u);
        return class06381.N(commandContext, class035562, class041622, class063832);
    }

    private static int N(CommandContext<class07701> commandContext, class03556<class05074> class035562, class04162 class041622, class06383 class063832) throws CommandSyntaxException {
        class07701 class077012 = (class07701)commandContext.getSource();
        ObjectArrayList var5 = ((class05074)class035562.N()).N(class041622);
        return class063832.accept(commandContext, (List<class06584>)var5, list -> class06381.N(class077012, list));
    }
}

