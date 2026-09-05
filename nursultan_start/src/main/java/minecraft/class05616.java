/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10524
 *  Nursultan.class10527
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Iterables
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00392
 *  minecraft.class01413
 *  minecraft.class04995
 *  minecraft.class06997
 *  minecraft.class07001
 *  minecraft.class07023
 *  minecraft.class07667
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class07707
 *  minecraft.class07709
 *  minecraft.class07737
 *  minecraft.class07759
 *  minecraft.class07791
 *  minecraft.class07793
 *  minecraft.class08164
 *  minecraft.class08884
 */
package minecraft;

import Nursultan.class10524;
import Nursultan.class10527;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class01413;
import minecraft.class04995;
import minecraft.class05593;
import minecraft.class05598;
import minecraft.class05605;
import minecraft.class05608;
import minecraft.class05622;
import minecraft.class06997;
import minecraft.class07001;
import minecraft.class07023;
import minecraft.class07667;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class07707;
import minecraft.class07709;
import minecraft.class07737;
import minecraft.class07759;
import minecraft.class07791;
import minecraft.class07793;
import minecraft.class08164;
import minecraft.class08884;

public class class05616 {
    private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.data.merge.failed"));
    private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.data.get.invalid", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType R = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.data.get.unknown", (Object[])new Object[]{object}));
    private static final SimpleCommandExceptionType M = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.data.get.multiple"));
    private static final DynamicCommandExceptionType B = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.data.modify.expected_object", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType Z = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.data.modify.expected_value", (Object[])new Object[]{object}));
    private static final Dynamic2CommandExceptionType z = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"commands.data.modify.invalid_substring", (Object[])new Object[]{object, object2}));
    public static final List<Function<String, class05622>> N = ImmutableList.of(class05605.N, class05608.y, (Object)class01413.y);
    public static final List<class05622> y = (List)N.stream().map(function -> (class05622)function.apply("target")).collect(ImmutableList.toImmutableList());
    public static final List<class05622> L = (List)N.stream().map(function -> (class05622)function.apply("source")).collect(ImmutableList.toImmutableList());

    private static String y(String string, int n, int n2) throws CommandSyntaxException {
        int n3 = string.length();
        int n4 = class05616.N(n, n3);
        int n5 = class05616.N(n2, n3);
        return class05616.N(string, n4, n5);
    }

    /*
     * Loose catch block
     */
    private static int y(class07701 class077012, class05598 class055982, class07793 class077932) throws CommandSyntaxException {
        class07709 class077092;
        class07709 class077093 = class077092 = class05616.N(class077932, class055982);
        Objects.requireNonNull(class077093);
        class07709 class077094 = class077093;
        int n = 0;
        int n2 = switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class07737.class, class07023.class, class07001.class, class07707.class, class06997.class}, (Object)class077094, (int)n)) {
            default -> throw new MatchException(null, null);
            case 0 -> class04995.N((double)((class07737)class077094).U());
            case 1 -> ((class07023)class077094).size();
            case 2 -> ((class07001)class077094).Z();
            case 3 -> ((class07707)class077094).U().length();
            case 4 -> {
                class06997 var12_7 = (class06997)class077094;
                throw R.create((Object)class077932.toString());
            }
        };
        class077012.N(() -> class055982.N(class077092), false);
        return n2;
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
    }

    private static List<class07709> y(CommandContext<class07701> commandContext, class05622 class056222) throws CommandSyntaxException {
        class05598 class055982 = class056222.N(commandContext);
        return class07759.N(commandContext, (String)"sourcePath").N((class07709)class055982.N());
    }

    public static class07709 N(class07793 class077932, class05598 class055982) throws CommandSyntaxException {
        Iterator var3 = class077932.N((class07709)class055982.N()).iterator();
        class07709 class077092 = (class07709)var3.next();
        if (var3.hasNext()) {
            throw M.create();
        }
        return class077092;
    }

    private static List<class07709> N(List<class07709> list, class10527 class105272) throws CommandSyntaxException {
        ArrayList<class07709> arrayList = new ArrayList<class07709>(list.size());
        Iterator<class07709> iterator = list.iterator();
        while (iterator.hasNext()) {
            String string = class05616.N(iterator.next());
            arrayList.add((class07709)class07707.N((String)class105272.process(string)));
        }
        return arrayList;
    }

    private static int N(class07701 class077012, class05598 class055982, class07001 class070012) throws CommandSyntaxException {
        class07001 class070013 = class055982.N();
        if (class07793.N((class07709)class070012, (int)0)) {
            throw class07759.y.create();
        }
        class07001 class070014 = class070013.N().N(class070012);
        if (class070013.equals((Object)class070014)) {
            throw u.create();
        }
        class055982.N(class070014);
        class077012.N(() -> class055982.y(), true);
        return 1;
    }

    private static int N(class07701 class077012, class05598 class055982) throws CommandSyntaxException {
        class07001 class070012 = class055982.N();
        class077012.N(() -> class055982.N((class07709)class070012), false);
        return 1;
    }

    private static int N(class07701 class077012, class05598 class055982, class07793 class077932, double d) throws CommandSyntaxException {
        class07709 class077092 = class05616.N(class077932, class055982);
        if (!(class077092 instanceof class07737)) {
            throw i.create((Object)class077932.toString());
        }
        int n = class04995.N((double)(((class07737)class077092).U() * d));
        class077012.N(() -> class055982.N(class077932, d, n), false);
        return n;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        LiteralArgumentBuilder var1 = (LiteralArgumentBuilder)class07686.y((String)"data").requires((Predicate)class07686.N((class08164)class07686.u));
        for (class05622 class056222 : y) {
            ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.then(class056222.N((ArgumentBuilder<class07701, ?>)class07686.y((String)"merge"), argumentBuilder -> argumentBuilder.then(class07686.N((String)"nbt", (ArgumentType)class07667.N()).executes(commandContext -> class05616.N((class07701)commandContext.getSource(), class056222.N((CommandContext<class07701>)commandContext), class07667.N((CommandContext)commandContext, (String)"nbt"))))))).then(class056222.N((ArgumentBuilder<class07701, ?>)class07686.y((String)"get"), argumentBuilder -> argumentBuilder.executes(commandContext -> class05616.N((class07701)commandContext.getSource(), class056222.N((CommandContext<class07701>)commandContext))).then(((RequiredArgumentBuilder)class07686.N((String)"path", (ArgumentType)class07759.N()).executes(commandContext -> class05616.y((class07701)commandContext.getSource(), class056222.N((CommandContext<class07701>)commandContext), class07759.N((CommandContext)commandContext, (String)"path")))).then(class07686.N((String)"scale", (ArgumentType)DoubleArgumentType.doubleArg()).executes(commandContext -> class05616.N((class07701)commandContext.getSource(), class056222.N((CommandContext<class07701>)commandContext), class07759.N((CommandContext)commandContext, (String)"path"), DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale")))))))).then(class056222.N((ArgumentBuilder<class07701, ?>)class07686.y((String)"remove"), argumentBuilder -> argumentBuilder.then(class07686.N((String)"path", (ArgumentType)class07759.N()).executes(commandContext -> class05616.N((class07701)commandContext.getSource(), class056222.N((CommandContext<class07701>)commandContext), class07759.N((CommandContext)commandContext, (String)"path"))))))).then(class05616.N((ArgumentBuilder<class07701, ?> argumentBuilder, class10524 class105242) -> argumentBuilder.then(class07686.y((String)"insert").then(class07686.N((String)"index", (ArgumentType)IntegerArgumentType.integer()).then(class105242.create((commandContext, class070012, class077932, list) -> class077932.N(IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"index"), class070012, list))))).then(class07686.y((String)"prepend").then(class105242.create((commandContext, class070012, class077932, list) -> class077932.N(0, class070012, list)))).then(class07686.y((String)"append").then(class105242.create((commandContext, class070012, class077932, list) -> class077932.N(-1, class070012, list)))).then(class07686.y((String)"set").then(class105242.create((commandContext, class070012, class077932, list) -> class077932.N((class07709)class070012, (class07709)Iterables.getLast((Iterable)list))))).then(class07686.y((String)"merge").then(class105242.create((commandContext, class070012, class077932, list) -> {
                class07001 class070013 = new class07001();
                for (class07709 class077092 : list) {
                    if (class07793.N((class07709)class077092, (int)0)) {
                        throw class07759.y.create();
                    }
                    if (class077092 instanceof class07001) {
                        class07001 class070014 = (class07001)class077092;
                        class070013.N(class070014);
                        continue;
                    }
                    throw B.create((Object)class077092);
                }
                List var5 = class077932.N((class07709)class070012, class07001::new);
                int n = 0;
                for (class07709 class077093 : var5) {
                    if (!(class077093 instanceof class07001)) {
                        throw B.create((Object)class077093);
                    }
                    class07001 class070015 = (class07001)class077093;
                    class07001 class070016 = class070015.N();
                    class070015.N(class070013);
                    n += class070016.equals((Object)class070015) ? 0 : 1;
                }
                return n;
            })))));
        }
        commandDispatcher.register(var1);
    }

    private static List<class07709> N(CommandContext<class07701> commandContext, class05622 class056222) throws CommandSyntaxException {
        return Collections.singletonList(class056222.N(commandContext).N());
    }

    private static int N(int n, int n2) {
        return n >= 0 ? n : n2 + n;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String N(class07709 class077092) throws CommandSyntaxException {
        class07709 class077093 = class077092;
        Objects.requireNonNull(class077093);
        class07709 class077094 = class077093;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class07707.class, class08884.class}, (Object)class077094, (int)n)) {
            case 0: {
                String string;
                try {
                    String string2;
                    string = string2 = ((class07707)class077094).U();
                    return string;
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
            }
            case 1: {
                class08884 class088842 = (class08884)class077094;
                String string = class088842.toString();
                return string;
            }
        }
        throw Z.create((Object)class077092);
    }

    private static int N(class07701 class077012, class05598 class055982, class07793 class077932) throws CommandSyntaxException {
        class07001 class070012 = class055982.N();
        int n = class077932.L((class07709)class070012);
        if (n == 0) {
            throw u.create();
        }
        class055982.N(class070012);
        class077012.N(() -> class055982.y(), true);
        return n;
    }

    private static int N(CommandContext<class07701> commandContext, class05622 class056222, class05593 class055932, List<class07709> list) throws CommandSyntaxException {
        class05598 class055982 = class056222.N(commandContext);
        class07793 class077932 = class07759.N(commandContext, (String)"targetPath");
        class07001 class070012 = class055982.N();
        int n = class055932.modify(commandContext, class070012, class077932, list);
        if (n == 0) {
            throw u.create();
        }
        class055982.N(class070012);
        ((class07701)commandContext.getSource()).N(() -> class055982.y(), true);
        return n;
    }

    private static String N(String string, int n, int n2) throws CommandSyntaxException {
        if (n < 0 || n2 > string.length() || n > n2) {
            throw z.create((Object)n, (Object)n2);
        }
        return string.substring(n, n2);
    }

    private static ArgumentBuilder<class07701, ?> N(BiConsumer<ArgumentBuilder<class07701, ?>, class10524> biConsumer) {
        LiteralArgumentBuilder var1 = class07686.y((String)"modify");
        for (class05622 class056222 : y) {
            class056222.N((ArgumentBuilder<class07701, ?>)var1, argumentBuilder -> {
                RequiredArgumentBuilder requiredArgumentBuilder = class07686.N((String)"targetPath", (ArgumentType)class07759.N());
                for (class05622 class056223 : L) {
                    biConsumer.accept((ArgumentBuilder<class07701, ?>)requiredArgumentBuilder, class055932 -> class056223.N((ArgumentBuilder<class07701, ?>)class07686.y((String)"from"), argumentBuilder -> argumentBuilder.executes(commandContext -> class05616.N((CommandContext<class07701>)commandContext, class056222, class055932, class05616.N((CommandContext<class07701>)commandContext, class056223))).then(class07686.N((String)"sourcePath", (ArgumentType)class07759.N()).executes(commandContext -> class05616.N((CommandContext<class07701>)commandContext, class056222, class055932, class05616.y((CommandContext<class07701>)commandContext, class056223))))));
                    biConsumer.accept((ArgumentBuilder<class07701, ?>)requiredArgumentBuilder, class055932 -> class056223.N((ArgumentBuilder<class07701, ?>)class07686.y((String)"string"), argumentBuilder -> argumentBuilder.executes(commandContext -> class05616.N((CommandContext<class07701>)commandContext, class056222, class055932, class05616.N(class05616.N((CommandContext<class07701>)commandContext, class056223), string -> string))).then(((RequiredArgumentBuilder)class07686.N((String)"sourcePath", (ArgumentType)class07759.N()).executes(commandContext -> class05616.N((CommandContext<class07701>)commandContext, class056222, class055932, class05616.N(class05616.y((CommandContext<class07701>)commandContext, class056223), string -> string)))).then(((RequiredArgumentBuilder)class07686.N((String)"start", (ArgumentType)IntegerArgumentType.integer()).executes(commandContext -> class05616.N((CommandContext<class07701>)commandContext, class056222, class055932, class05616.N(class05616.y((CommandContext<class07701>)commandContext, class056223), string -> class05616.N(string, IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"start")))))).then(class07686.N((String)"end", (ArgumentType)IntegerArgumentType.integer()).executes(commandContext -> class05616.N((CommandContext<class07701>)commandContext, class056222, class055932, class05616.N(class05616.y((CommandContext<class07701>)commandContext, class056223), string -> class05616.y(string, IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"start"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"end"))))))))));
                }
                biConsumer.accept((ArgumentBuilder<class07701, ?>)requiredArgumentBuilder, class055932 -> class07686.y((String)"value").then(class07686.N((String)"value", (ArgumentType)class07791.N()).executes(commandContext -> {
                    List<class07709> list = Collections.singletonList(class07791.N((CommandContext)commandContext, (String)"value"));
                    return class05616.N((CommandContext<class07701>)commandContext, class056222, class055932, list);
                })));
                return argumentBuilder.then((ArgumentBuilder)requiredArgumentBuilder);
            });
        }
        return var1;
    }

    private static String N(String string, int n) throws CommandSyntaxException {
        int n2 = string.length();
        return class05616.N(string, class05616.N(n, n2), n2);
    }
}

