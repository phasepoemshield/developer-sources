/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  minecraft.class00392
 *  minecraft.class00681
 *  minecraft.class01905
 *  minecraft.class02484
 *  minecraft.class03246
 *  minecraft.class03247
 *  minecraft.class03252
 *  minecraft.class03254
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04403
 *  minecraft.class04782
 *  minecraft.class05946
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07043
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07536
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08036
 *  minecraft.class08164
 *  minecraft.class08725
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class00681;
import minecraft.class01905;
import minecraft.class02484;
import minecraft.class03246;
import minecraft.class03247;
import minecraft.class03252;
import minecraft.class03254;
import minecraft.class03270;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04403;
import minecraft.class04782;
import minecraft.class05946;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07043;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07536;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08036;
import minecraft.class08164;
import minecraft.class08725;

public class class03282 {
    private static final List<class05946<class03246>> N = List.of(class03247.N, class03247.y, class03247.L, class03247.u, class03247.i, class03247.R, class03247.M, class03247.B, class03247.Z, class03247.z, class03247.U, class03247.E, class03247.W, class03247.m, class03247.P, class03247.s, class03247.T, class03247.b);
    private static final List<class05946<class03252>> y = List.of(class03270.N, class03270.y, class03270.L, class03270.u, class03270.i, class03270.R, class03270.M, class03270.B, class03270.Z, class03270.z, class03270.U);
    private static final ToIntFunction<class05946<class03246>> L = class07536.R(N);
    private static final ToIntFunction<class05946<class03252>> u = class07536.R(y);
    private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(object -> class00392.y((String)"Invalid pattern", (Object[])new Object[]{object}));

    private static int N(class07701 class077012, class08036 class080362) {
        return class03282.N(class077012, class080362, class077012.W().yt().L(class04227.yk).z());
    }

    private static int N(class07701 class077012, class08036 class080362, class05946<class03246> class059462) {
        return class03282.N(class077012, class080362, Stream.of((class03529)class077012.W().yt().L(class04227.yk).N(class059462).orElseThrow()));
    }

    private static int N(class07701 class077012, class08036 class080362, Stream<class03529<class03246>> stream) {
        class04782 class047822 = class077012.R();
        List list = stream.sorted(Comparator.comparing(class035292 -> L.applyAsInt((class05946<class03246>)class035292.B()))).toList();
        List list2 = class047822.method_30349().L(class04227.yw).z().sorted(Comparator.comparing(class035292 -> u.applyAsInt((class05946<class03252>)class035292.B()))).toList();
        List<class03529<class06581>> var6 = class03282.N((class01905<class06581>)class047822.method_30349().L(class04227.F));
        class07209 class072092 = class080362.method_24515().method_10079(class080362.method_5735(), 5);
        double d = 3.0;
        for (int i = 0; i < list2.size(); ++i) {
            class03529 class035293 = (class03529)list2.get(i);
            for (int j = 0; j < list.size(); ++j) {
                class03529 class035294 = (class03529)list.get(j);
                class03254 class032542 = new class03254((class03556)class035293, (class03556)class035294);
                for (int k = 0; k < var6.size(); ++k) {
                    class03529<class06581> var16 = var6.get(k);
                    double d2 = (double)class072092.method_10263() + 0.5 - (double)k * 3.0;
                    double d3 = (double)class072092.method_10264() + 0.5 + (double)i * 3.0;
                    double d4 = (double)class072092.method_10260() + 0.5 + (double)(j * 10);
                    class00681 class006812 = new class00681((class07299)class047822, d2, d3, d4);
                    class006812.method_36456(180.0f);
                    class006812.method_5875(true);
                    class06584 class065842 = new class06584(var16);
                    class08725 class087252 = Objects.requireNonNull((class08725)class065842.method_58694(class02484.o));
                    class065842.N(class02484.Nu, (Object)class032542);
                    class006812.method_5673(class087252.y(), class065842);
                    if (k == 0) {
                        class006812.method_5665((class00392)((class03246)class032542.y().N()).N(class032542.N()).L().i(" & ").y(((class03252)class032542.N().N()).y()));
                        class006812.method_5880(true);
                    } else {
                        class006812.method_5648(true);
                    }
                    class047822.method_8649((class07049)class006812);
                }
            }
        }
        class077012.N(() -> class00392.y((String)"Armorstands with trimmed armor spawned around you"), true);
        return 1;
    }

    private static List<class03529<class06581>> N(class01905<class06581> class019052) {
        ArrayList<class03529<class06581>> arrayList = new ArrayList<class03529<class06581>>();
        class019052.z().forEach(class035292 -> {
            class08725 class087252 = (class08725)((class06581)class035292.N()).R().method_58694(class02484.o);
            if (class087252 != null && class087252.y().N() == class07043.field_6178 && class087252.u().isPresent()) {
                arrayList.add((class03529<class06581>)class035292);
            }
        });
        return arrayList;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"spawn_armor_trims").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.y((String)"*_lag_my_game").executes(commandContext -> class03282.N((class07701)commandContext.getSource(), (class08036)((class07701)commandContext.getSource()).Z())))).then(class07686.N((String)"pattern", (ArgumentType)class04403.N((class05946)class04227.yk)).executes(commandContext -> class03282.N((class07701)commandContext.getSource(), (class08036)((class07701)commandContext.getSource()).Z(), (class05946<class03246>)class04403.N((CommandContext)commandContext, (String)"pattern", (class05946)class04227.yk, (DynamicCommandExceptionType)i)))));
    }
}

