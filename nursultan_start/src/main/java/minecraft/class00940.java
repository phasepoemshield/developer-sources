/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00625
 *  minecraft.class00627
 *  minecraft.class00647
 *  minecraft.class02689
 *  minecraft.class02796
 *  minecraft.class03748
 *  minecraft.class05193
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class06541
 *  minecraft.class06609
 *  minecraft.class07536
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class07713
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00625;
import minecraft.class00627;
import minecraft.class00647;
import minecraft.class00909;
import minecraft.class00926;
import minecraft.class02689;
import minecraft.class02796;
import minecraft.class03748;
import minecraft.class05193;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class06541;
import minecraft.class06609;
import minecraft.class07536;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class07713;
import minecraft.class08164;

public class class00940 {
    private static /* synthetic */ void y(Optional optional, class07701 class077012, class00392 class003922) {
        optional.ifPresentOrElse(gameProfile -> class00940.N(class077012, gameProfile, "commands.fetchprofile.name.success", class003922), () -> class077012.y((class00392)class00392.N((String)"commands.fetchprofile.name.failure", (Object[])new Object[]{class003922})));
    }

    private static int N(class07701 class077012, UUID uUID) {
        class02796 class027962 = class077012.W();
        class00909 class009092 = class027962.Nf().M();
        class07536.z().execute(() -> {
            class00392 class003922 = class00392.N((UUID)uUID);
            Optional<GameProfile> var5 = class009092.N(uUID);
            class027962.execute(() -> var5.ifPresentOrElse(gameProfile -> class00940.N(class077012, gameProfile, "commands.fetchprofile.id.success", class003922), () -> class077012.y((class00392)class00392.N((String)"commands.fetchprofile.id.failure", (Object[])new Object[]{class003922}))));
        });
        return 1;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"fetchprofile").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.y((String)"name").then(class07686.N((String)"name", (ArgumentType)StringArgumentType.greedyString()).executes(commandContext -> class00940.N((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"name")))))).then(class07686.y((String)"id").then(class07686.N((String)"id", (ArgumentType)class05193.N()).executes(commandContext -> class00940.N((class07701)commandContext.getSource(), class05193.N((CommandContext)commandContext, (String)"id"))))));
    }

    private static void N(class07701 class077012, GameProfile gameProfile, String string, class00392 class003922) {
        class02689 class026892 = class02689.N((GameProfile)gameProfile);
        class02689.N.encodeStart((DynamicOps)class07713.N, (Object)class026892).ifSuccess(class077093 -> {
            String string2 = class077093.toString();
            class05216 class052162 = class00392.N((class00926)new class06609(class026892, true));
            class03748.N.encodeStart((DynamicOps)class07713.N, (Object)class052162).ifSuccess(class077092 -> {
                String string3 = class077092.toString();
                class077012.N(() -> {
                    class05216 class052164 = class00390.N(List.of(class00392.L((String)"commands.fetchprofile.copy_component").N(class004052 -> class004052.N((class00647)new class00627(string2))), class00392.L((String)"commands.fetchprofile.give_item").N(class004052 -> class004052.N((class00647)new class00625("give @s minecraft:player_head[profile=" + string2 + "]"))), class00392.L((String)"commands.fetchprofile.summon_mannequin").N(class004052 -> class004052.N((class00647)new class00625("summon minecraft:mannequin ~ ~ ~ {profile:" + string2 + "}"))), class00392.N((String)"commands.fetchprofile.copy_text", (Object[])new Object[]{class052162.N(class06541.field_1068)}).N(class004052 -> class004052.N((class00647)new class00627(string3)))), (class00392)class05220.l, (T class052162) -> class00390.N((class00392)class052162.N(class06541.field_1060)));
                    return class00392.N((String)string, (Object[])new Object[]{class003922, class052164});
                }, false);
            }).ifError(error -> class077012.y((class00392)class00392.N((String)"commands.fetchprofile.failed_to_serialize", (Object[])new Object[]{error.message()})));
        }).ifError(error -> class077012.y((class00392)class00392.N((String)"commands.fetchprofile.failed_to_serialize", (Object[])new Object[]{error.message()})));
    }

    private static int N(class07701 class077012, String string) {
        class02796 class027962 = class077012.W();
        class00909 class009092 = class027962.Nf().M();
        class07536.z().execute(() -> {
            class05216 class052162 = class00392.y((String)string);
            Optional<GameProfile> var5 = class009092.N(string);
            class027962.execute(() -> class00940.y(var5, class077012, (class00392)class052162));
        });
        return 1;
    }
}

