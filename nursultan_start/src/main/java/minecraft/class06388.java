/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.ContextChain
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class00392
 *  minecraft.class01704
 *  minecraft.class01723
 *  minecraft.class01743
 *  minecraft.class01744
 *  minecraft.class01747
 *  minecraft.class01878
 *  minecraft.class01894
 *  minecraft.class02796
 *  minecraft.class03102
 *  minecraft.class03126
 *  minecraft.class06808
 *  minecraft.class06984
 *  minecraft.class07536
 *  minecraft.class07684
 *  minecraft.class07701
 *  minecraft.class07703
 *  minecraft.class08152
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Collection;
import minecraft.class00392;
import minecraft.class01704;
import minecraft.class01723;
import minecraft.class01743;
import minecraft.class01744;
import minecraft.class01747;
import minecraft.class01878;
import minecraft.class01894;
import minecraft.class02796;
import minecraft.class03102;
import minecraft.class03126;
import minecraft.class06401;
import minecraft.class06408;
import minecraft.class06410;
import minecraft.class06808;
import minecraft.class06984;
import minecraft.class07536;
import minecraft.class07684;
import minecraft.class07701;
import minecraft.class07703;
import minecraft.class08152;

class class06388
extends class01723<class07701>
implements class01743<class07701> {
    class06388() {
    }

    public void N(class07701 class077012, ContextChain<class07701> contextChain, class03126 class031262, class01744<class07701> class017442) throws CommandSyntaxException {
        if (class031262.L()) {
            throw class06401.L.create();
        }
        if (class017442.N() != null) {
            throw class06401.y.create();
        }
        Collection var6 = class06808.N((CommandContext)contextChain.getTopContext(), (String)"name");
        class02796 class027962 = class077012.W();
        String string = "debug-trace-" + class07536.R() + ".txt";
        CommandDispatcher var9 = class077012.W().Nr().N();
        int n = 0;
        try {
            Path path = class027962.i("debug");
            Files.createDirectories(path, new FileAttribute[0]);
            PrintWriter printWriter = new PrintWriter(Files.newBufferedWriter(path.resolve(string), StandardCharsets.UTF_8, new OpenOption[0]));
            class06410 class064102 = new class06410(printWriter);
            class017442.N((class01704)class064102);
            for (class07684 var15 : var6) {
                try {
                    class07701 class077013 = class077012.N((class07703)class064102).y((class08152)class06984.L);
                    class01747 var17 = var15.N(null, var9);
                    class017442.N(new class06408(this, var17, class03102.N, false, printWriter, var15).N(class077013));
                    n += var17.y().size();
                }
                catch (class01878 class018782) {
                    class077012.y(class018782.N());
                }
            }
        }
        catch (IOException | UncheckedIOException exception) {
            class06401.N.warn("Tracing failed", (Throwable)exception);
            class077012.y((class00392)class00392.L((String)"commands.debug.function.traceFailed"));
        }
        int n2 = n;
        class017442.N((class017522, class030992) -> {
            if (var6.size() == 1) {
                class077012.N(() -> class00392.N((String)"commands.debug.function.success.single", (Object[])new Object[]{n2, class00392.N((class01894)((class07684)var6.iterator().next()).N()), string}), true);
            } else {
                class077012.N(() -> class00392.N((String)"commands.debug.function.success.multiple", (Object[])new Object[]{n2, var6.size(), string}), true);
            }
        });
    }
}

