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
 *  minecraft.class00381
 *  minecraft.class03807
 *  minecraft.class05193
 *  minecraft.class06666
 *  minecraft.class07686
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
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import minecraft.class00381;
import minecraft.class03807;
import minecraft.class05193;
import minecraft.class06666;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class01760 {
    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"serverpack").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.y((String)"push").then(((RequiredArgumentBuilder)class07686.N((String)"url", (ArgumentType)StringArgumentType.string()).then(((RequiredArgumentBuilder)class07686.N((String)"uuid", (ArgumentType)class05193.N()).then(class07686.N((String)"hash", (ArgumentType)StringArgumentType.word()).executes(commandContext -> class01760.N((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"url"), Optional.of(class05193.N((CommandContext)commandContext, (String)"uuid")), Optional.of(StringArgumentType.getString((CommandContext)commandContext, (String)"hash")))))).executes(commandContext -> class01760.N((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"url"), Optional.of(class05193.N((CommandContext)commandContext, (String)"uuid")), Optional.empty())))).executes(commandContext -> class01760.N((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"url"), Optional.empty(), Optional.empty()))))).then(class07686.y((String)"pop").then(class07686.N((String)"uuid", (ArgumentType)class05193.N()).executes(commandContext -> class01760.N((class07701)commandContext.getSource(), class05193.N((CommandContext)commandContext, (String)"uuid"))))));
    }

    private static int N(class07701 class077012, String string, Optional<UUID> optional, Optional<String> optional2) {
        UUID uUID = optional.orElseGet(() -> UUID.nameUUIDFromBytes(string.getBytes(StandardCharsets.UTF_8)));
        String string2 = optional2.orElse("");
        class06666 class066662 = new class06666(uUID, string, string2, false, null);
        class01760.N(class077012, class066662);
        return 0;
    }

    private static int N(class07701 class077012, UUID uUID) {
        class03807 class038072 = new class03807(Optional.of(uUID));
        class01760.N(class077012, class038072);
        return 0;
    }

    private static void N(class07701 class077012, class00381<?> class003812) {
        class077012.W().Na().i().forEach(class006422 -> class006422.method_10743(class003812));
    }
}

