/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.google.common.base.Ticker
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00640
 *  minecraft.class00647
 *  minecraft.class00737
 *  minecraft.class00751
 *  minecraft.class00753
 *  minecraft.class00780
 *  minecraft.class03543
 *  minecraft.class03550
 *  minecraft.class03556
 *  minecraft.class03782
 *  minecraft.class03789
 *  minecraft.class04227
 *  minecraft.class04348
 *  minecraft.class04428
 *  minecraft.class04434
 *  minecraft.class04748
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05216
 *  minecraft.class05369
 *  minecraft.class05372
 *  minecraft.class05946
 *  minecraft.class06541
 *  minecraft.class07209
 *  minecraft.class07536
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00640;
import minecraft.class00647;
import minecraft.class00737;
import minecraft.class00751;
import minecraft.class00753;
import minecraft.class00780;
import minecraft.class03543;
import minecraft.class03550;
import minecraft.class03556;
import minecraft.class03782;
import minecraft.class03789;
import minecraft.class04227;
import minecraft.class04348;
import minecraft.class04428;
import minecraft.class04434;
import minecraft.class04748;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05216;
import minecraft.class05369;
import minecraft.class05372;
import minecraft.class05946;
import minecraft.class06541;
import minecraft.class07209;
import minecraft.class07536;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;
import org.slf4j.Logger;

public class class01556 {
    private static final Logger N = LogUtils.getLogger();
    private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.locate.structure.not_found", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.locate.structure.invalid", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType u = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.locate.biome.not_found", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.locate.poi.not_found", (Object[])new Object[]{object}));
    private static final int R = 100;
    private static final int M = 6400;
    private static final int B = 32;
    private static final int Z = 64;
    private static final int z = 256;

    private static int y(class07701 class077012, class03782<class05369> class037822) throws CommandSyntaxException {
        class07209 class072092 = class07209.method_49638((class00737)class077012.i());
        class04782 class047822 = class077012.R();
        Stopwatch stopwatch = Stopwatch.createStarted((Ticker)class07536.i);
        Optional optional = class047822.method_19494().y(class037822, class072092, 256, class05372.field_18489);
        stopwatch.stop();
        if (optional.isEmpty()) {
            throw i.create((Object)class037822.y());
        }
        return class01556.N(class077012, class037822, class072092, ((Pair)optional.get()).swap(), "commands.locate.poi.success", false, stopwatch.elapsed());
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"locate").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.y((String)"structure").then(class07686.N((String)"structure", (ArgumentType)class04434.N((class05946)class04227.yj)).executes(commandContext -> class01556.N((class07701)commandContext.getSource(), (class04428<class04748>)class04434.N((CommandContext)commandContext, (String)"structure", (class05946)class04227.yj, (DynamicCommandExceptionType)L)))))).then(class07686.y((String)"biome").then(class07686.N((String)"biome", (ArgumentType)class03789.N((class04348)class043482, (class05946)class04227.NA)).executes(commandContext -> class01556.N((class07701)commandContext.getSource(), (class03782<class00780>)class03789.N((CommandContext)commandContext, (String)"biome", (class05946)class04227.NA)))))).then(class07686.y((String)"poi").then(class07686.N((String)"poi", (ArgumentType)class03789.N((class04348)class043482, (class05946)class04227.NZ)).executes(commandContext -> class01556.y((class07701)commandContext.getSource(), (class03782<class05369>)class03789.N((CommandContext)commandContext, (String)"poi", (class05946)class04227.NZ))))));
    }

    private static Optional<? extends class03550<class04748>> N(class04428<class04748> class044282, class00751<class04748> class007512) {
        return (Optional)class044282.N().map(class059462 -> class007512.N(class059462).map(class035562 -> class03543.N((class03556[])new class03556[]{class035562})), arg_0 -> class007512.N(arg_0));
    }

    private static /* synthetic */ class00392 N(String string, String string2, class00392 class003922, int n) {
        return class00392.N((String)string, (Object[])new Object[]{string2, class003922, n});
    }

    private static float N(int n, int n2, int n3, int n4) {
        int n5 = n3 - n;
        int n6 = n4 - n2;
        return class04995.N((float)(n5 * n5 + n6 * n6));
    }

    private static int N(class07701 class077012, class07209 class072092, Pair<class07209, ? extends class03556<?>> pair, String string, boolean bl, String string2, Duration duration) {
        class07209 class072093 = (class07209)pair.getFirst();
        int n = bl ? class04995.y((float)class04995.N((float)((float)class072092.method_10262((class00753)class072093)))) : class04995.y((float)class01556.N(class072092.method_10263(), class072092.method_10260(), class072093.method_10263(), class072093.method_10260()));
        String string3 = bl ? String.valueOf(class072093.method_10264()) : "~";
        class05216 class052162 = class00390.N((class00392)class00392.N((String)"chat.coordinates", (Object[])new Object[]{class072093.method_10263(), string3, class072093.method_10260()})).N(class004052 -> class004052.N(class06541.field_1060).N((class00647)new class00640("/tp @s " + class072093.method_10263() + " " + string3 + " " + class072093.method_10260())).N((class00395)new class00401((class00392)class00392.L((String)"chat.coordinates.tooltip"))));
        class077012.N(() -> class01556.N(string, string2, (class00392)class052162, n), false);
        N.info("Locating element {} took {} ms", (Object)string2, (Object)duration.toMillis());
        return n;
    }

    public static int N(class07701 class077012, class04428<?> class044282, class07209 class072092, Pair<class07209, ? extends class03556<?>> pair, String string, boolean bl, Duration duration) {
        String string2 = (String)class044282.N().map(class059462 -> class059462.N().toString(), class035302 -> "#" + String.valueOf(class035302.y()) + " (" + ((class03556)pair.getSecond()).M() + ")");
        return class01556.N(class077012, class072092, pair, string, bl, string2, duration);
    }

    public static int N(class07701 class077012, class03782<?> class037822, class07209 class072092, Pair<class07209, ? extends class03556<?>> pair, String string, boolean bl, Duration duration) {
        String string2 = (String)class037822.N().map(class035292 -> class037822.y(), class035522 -> class037822.y() + " (" + ((class03556)pair.getSecond()).M() + ")");
        return class01556.N(class077012, class072092, pair, string, bl, string2, duration);
    }

    private static int N(class07701 class077012, class03782<class00780> class037822) throws CommandSyntaxException {
        class07209 class072092 = class07209.method_49638((class00737)class077012.i());
        Stopwatch stopwatch = Stopwatch.createStarted((Ticker)class07536.i);
        Pair var4 = class077012.R().method_42108(class037822, class072092, 6400, 32, 64);
        stopwatch.stop();
        if (var4 == null) {
            throw u.create((Object)class037822.y());
        }
        return class01556.N(class077012, class037822, class072092, var4, "commands.locate.biome.success", true, stopwatch.elapsed());
    }

    private static int N(class07701 class077012, class04428<class04748> class044282) throws CommandSyntaxException {
        class00751 class007512 = class077012.R().method_30349().L(class04227.yj);
        class03543 class035432 = (class03543)class01556.N(class044282, (class00751<class04748>)class007512).orElseThrow(() -> L.create((Object)class044282.y()));
        class07209 class072092 = class07209.method_49638((class00737)class077012.i());
        class04782 class047822 = class077012.R();
        Stopwatch stopwatch = Stopwatch.createStarted((Ticker)class07536.i);
        Pair var7 = class047822.method_14178().U().N(class047822, class035432, class072092, 100, false);
        stopwatch.stop();
        if (var7 == null) {
            throw y.create((Object)class044282.y());
        }
        return class01556.N(class077012, class044282, class072092, var7, "commands.locate.structure.success", false, stopwatch.elapsed());
    }
}

