/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  minecraft.class00392
 *  minecraft.class01603
 *  minecraft.class04551
 *  minecraft.class07529
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class01603;
import minecraft.class04551;
import minecraft.class07529;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class00017 {
    private static final class00392 N = class00392.L((String)"commands.version.header");
    private static final class00392 y = class00392.L((String)"commands.version.stable.yes");
    private static final class00392 L = class00392.L((String)"commands.version.stable.no");

    public static void N(CommandDispatcher<class07701> commandDispatcher, boolean bl) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"version").requires((Predicate)class07686.N((class08164)(bl ? class07686.u : class07686.y)))).executes(commandContext -> {
            class07701 class077012 = (class07701)commandContext.getSource();
            class077012.N(N);
            class00017.N(arg_0 -> ((class07701)class077012).N(arg_0));
            return 1;
        }));
    }

    public static void N(Consumer<class00392> consumer) {
        class04551 class045512 = class07529.y();
        consumer.accept((class00392)class00392.N((String)"commands.version.id", (Object[])new Object[]{class045512.comp_4024()}));
        consumer.accept((class00392)class00392.N((String)"commands.version.name", (Object[])new Object[]{class045512.comp_4025()}));
        consumer.accept((class00392)class00392.N((String)"commands.version.data", (Object[])new Object[]{class045512.comp_4026().y()}));
        consumer.accept((class00392)class00392.N((String)"commands.version.series", (Object[])new Object[]{class045512.comp_4026().L()}));
        consumer.accept((class00392)class00392.N((String)"commands.version.protocol", (Object[])new Object[]{class045512.comp_4027(), "0x" + Integer.toHexString(class045512.comp_4027())}));
        consumer.accept((class00392)class00392.N((String)"commands.version.build_time", (Object[])new Object[]{class00392.N((Date)class045512.comp_4030())}));
        consumer.accept((class00392)class00392.N((String)"commands.version.pack.resource", (Object[])new Object[]{class045512.method_70592(class01603.field_14188).toString()}));
        consumer.accept((class00392)class00392.N((String)"commands.version.pack.data", (Object[])new Object[]{class045512.method_70592(class01603.field_14190).toString()}));
        consumer.accept(class045512.comp_4031() ? y : L);
    }
}

