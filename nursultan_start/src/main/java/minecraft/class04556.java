/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class01517
 *  minecraft.class02796
 *  minecraft.class03423
 *  minecraft.class03463
 *  minecraft.class04645
 *  minecraft.class04681
 *  minecraft.class06290
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 *  org.apache.commons.io.FileUtils
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class01517;
import minecraft.class02796;
import minecraft.class03423;
import minecraft.class03463;
import minecraft.class04524;
import minecraft.class04645;
import minecraft.class04681;
import minecraft.class06290;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class class04556 {
    private static final Logger N = LogUtils.getLogger();
    private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.perf.notRunning"));
    private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.perf.alreadyRunning"));

    private static int y(class07701 class077012) throws CommandSyntaxException {
        class02796 class027962 = class077012.W();
        if (!class027962.ys()) {
            throw y.create();
        }
        class027962.yb();
        return 0;
    }

    private static int N(class07701 class077012) throws CommandSyntaxException {
        class02796 class027962 = class077012.W();
        if (class027962.ys()) {
            throw L.create();
        }
        Consumer<class04681> consumer = class046812 -> class04556.N(class077012, class046812);
        Consumer<Path> consumer2 = path -> class04556.N(class077012, path, class027962);
        class027962.N(consumer, consumer2);
        class077012.N(() -> class00392.L((String)"commands.perf.started"), false);
        return 0;
    }

    private static void N(class07701 class077012, Path path, class02796 class027962) {
        String string;
        String string2 = String.format(Locale.ROOT, "%s-%s-%s", class07536.R(), class027962.yn().u(), class07529.y().comp_4024());
        try {
            string = class06290.N((Path)class04524.N, (String)string2, (String)".zip");
        }
        catch (IOException iOException) {
            class077012.y((class00392)class00392.L((String)"commands.perf.reportFailed"));
            N.error("Failed to create report name", (Throwable)iOException);
            return;
        }
        try (class03423 class034232 = new class03423(class04524.N.resolve(string));){
            class034232.N(Paths.get("system.txt", new String[0]), class027962.y(new class03463()).N());
            class034232.N(path);
        }
        try {
            FileUtils.forceDelete((File)path.toFile());
        }
        catch (IOException iOException) {
            N.warn("Failed to delete temporary profiling file {}", (Object)path, (Object)iOException);
        }
        class077012.N(() -> class00392.N((String)"commands.perf.reportSaved", (Object[])new Object[]{string}), false);
    }

    private static void N(class07701 class077012, class04681 class046812) {
        if (class046812 == class04645.N) {
            return;
        }
        int n = class046812.R();
        double d = (double)class046812.M() / (double)class01517.N;
        class077012.N(() -> class00392.N((String)"commands.perf.stopped", (Object[])new Object[]{String.format(Locale.ROOT, "%.2f", d), n, String.format(Locale.ROOT, "%.2f", (double)n / d)}), false);
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"perf").requires((Predicate)class07686.N((class08164)class07686.R))).then(class07686.y((String)"start").executes(commandContext -> class04556.N((class07701)commandContext.getSource())))).then(class07686.y((String)"stop").executes(commandContext -> class04556.y((class07701)commandContext.getSource()))));
    }
}

