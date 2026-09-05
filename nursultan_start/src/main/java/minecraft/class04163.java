/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00638
 *  minecraft.class00642
 *  minecraft.class02198
 *  minecraft.class02796
 *  minecraft.class03556
 *  minecraft.class04348
 *  minecraft.class04770
 *  minecraft.class05193
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07689
 *  minecraft.class07701
 *  minecraft.class08164
 *  minecraft.class09030
 *  minecraft.class09037
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.function.Predicate;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00638;
import minecraft.class00642;
import minecraft.class02198;
import minecraft.class02796;
import minecraft.class03556;
import minecraft.class04176;
import minecraft.class04348;
import minecraft.class04770;
import minecraft.class05193;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class08164;
import minecraft.class09030;
import minecraft.class09037;
import org.jspecify.annotations.Nullable;

public class class04163 {
    private static void N(class04176 class041762) {
        class041762.L();
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"debugconfig").requires((Predicate)class07686.N((class08164)class07686.i))).then(class07686.y((String)"config").then(class07686.N((String)"target", (ArgumentType)class07680.L()).executes(commandContext -> class04163.N((class07701)commandContext.getSource(), class07680.i((CommandContext)commandContext, (String)"target")))))).then(class07686.y((String)"unconfig").then(class07686.N((String)"target", (ArgumentType)class05193.N()).suggests((commandContext, suggestionsBuilder) -> class07689.y(class04163.N(((class07701)commandContext.getSource()).W()), (SuggestionsBuilder)suggestionsBuilder)).executes(commandContext -> class04163.N((class07701)commandContext.getSource(), class05193.N((CommandContext)commandContext, (String)"target")))))).then(class07686.y((String)"dialog").then(class07686.N((String)"target", (ArgumentType)class05193.N()).suggests((commandContext, suggestionsBuilder) -> class07689.y(class04163.N(((class07701)commandContext.getSource()).W()), (SuggestionsBuilder)suggestionsBuilder)).then(class07686.N((String)"dialog", (ArgumentType)class02198.u((class04348)class043482)).executes(commandContext -> class04163.N((class07701)commandContext.getSource(), class05193.N((CommandContext)commandContext, (String)"target"), (class03556<class09037>)class02198.u((CommandContext)commandContext, (String)"dialog")))))));
    }

    private static Iterable<String> N(class02796 class027962) {
        HashSet<String> hashSet = new HashSet<String>();
        Iterator var2 = class027962.Na().i().iterator();
        while (var2.hasNext()) {
            class00638 class006382 = ((class00642)var2.next()).method_10744();
            if (!(class006382 instanceof class04176)) continue;
            class04176 class041762 = (class04176)class006382;
            hashSet.add(class041762.method_52404().id().toString());
        }
        return hashSet;
    }

    private static int N(class07701 class077012, class04770 class047702) {
        GameProfile gameProfile = class047702.method_7334();
        class047702.field_13987.method_52414();
        class077012.N(() -> class00392.y((String)("Switched player " + gameProfile.name() + "(" + String.valueOf(gameProfile.id()) + ") to config mode")), false);
        return 1;
    }

    private static @Nullable class04176 N(class02796 class027962, UUID uUID) {
        Iterator var2 = class027962.Na().i().iterator();
        while (var2.hasNext()) {
            class04176 class041762;
            class00638 class006382 = ((class00642)var2.next()).method_10744();
            if (!(class006382 instanceof class04176) || !(class041762 = (class04176)class006382).method_52404().id().equals(uUID)) continue;
            return class041762;
        }
        return null;
    }

    private static int N(class07701 class077012, UUID uUID) {
        class04176 class041762 = class04163.N(class077012.W(), uUID);
        if (class041762 != null) {
            class04163.N(class041762);
            return 1;
        }
        class077012.y((class00392)class00392.y((String)"Can't find player to unconfig"));
        return 0;
    }

    private static int N(class07701 class077012, UUID uUID, class03556<class09037> class035562) {
        class04176 class041762 = class04163.N(class077012.W(), uUID);
        if (class041762 != null) {
            class041762.method_14364((class00381<?>)new class09030(class035562));
            return 1;
        }
        class077012.y((class00392)class00392.y((String)"Can't find player to talk to"));
        return 0;
    }
}

