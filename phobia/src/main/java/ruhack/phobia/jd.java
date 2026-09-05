/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  net.minecraft.class_11890
 *  net.minecraft.class_12249
 *  net.minecraft.class_1297
 *  net.minecraft.class_1921
 *  net.minecraft.class_2487
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_742
 *  org.figuramc.figura.avatar.Avatar
 *  org.figuramc.figura.avatar.AvatarManager
 *  org.figuramc.figura.permissions.PermissionManager
 *  org.figuramc.figura.utils.PhobiaFiguraBridge
 *  org.figuramc.figura.utils.PhobiaFiguraBridge$FirstPersonPassProvider
 *  org.figuramc.figura.utils.PhobiaFiguraBridge$RenderPass
 *  org.figuramc.figura.utils.PhobiaFiguraBridge$WorldPassProvider
 */
package ruhack.phobia;

import com.mojang.blaze3d.vertex.VertexFormat;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Path;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import net.minecraft.class_11890;
import net.minecraft.class_12249;
import net.minecraft.class_1297;
import net.minecraft.class_1921;
import net.minecraft.class_2487;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_742;
import org.figuramc.figura.avatar.Avatar;
import org.figuramc.figura.avatar.AvatarManager;
import org.figuramc.figura.permissions.PermissionManager;
import org.figuramc.figura.utils.PhobiaFiguraBridge;
import ruhack.phobia.aw;
import ruhack.phobia.df;
import ruhack.phobia.di;
import ruhack.phobia.dl;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jd$CachedShaderPasses;
import ruhack.phobia.jd$EmbeddedAvatar;
import ruhack.phobia.jm;
import ruhack.phobia.jn;
import ruhack.phobia.jn$HaloPassConsumer;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.kf;
import ruhack.phobia.oj;

public final class jd
extends ds {
    private String loadedModel;
    private static final Map<class_1921, PhobiaFiguraBridge.RenderPass[]> SHADER_ESP_PASS_CACHE;
    private final kb onFriends;
    private final Set<UUID> appliedFriends;
    private static long[] ahly;
    private int worldReloadDelay;
    public static final boolean a;
    private static final Map<String, jd$EmbeddedAvatar> AVATARS;
    protected static final long bz = -5819752379727462246L;
    private static int[] ahlk;
    public static final int b;
    private static int[] ahll;
    public static final boolean c;
    private static jd instance;
    private final kf model;
    private Avatar friendSourceAvatar;
    private static long[] ahlz;
    private static final Map<class_1921, jd$CachedShaderPasses> SHADER_PASS_CACHE;
    private static PhobiaFiguraBridge.RenderPass[] updatingPasses;
    private static int updatingPassIndex;

    private static /* synthetic */ void ajez() {
        jd.ahlz[300] = 8531301708060751378L;
        jd.ahlz[301] = 7281214407200961064L;
        jd.ahlz[302] = -6395053980123373269L;
        jd.ahlz[303] = 5658907166744506763L;
        jd.ahlz[304] = -8921361596660429902L;
        jd.ahlz[305] = -5990935594173108203L;
        jd.ahlz[306] = -9192488187433397069L;
        jd.ahlz[307] = -6255199243871891942L;
        jd.ahlz[308] = -2281487687798506130L;
        jd.ahlz[309] = -1632436852237113747L;
        jd.ahlz[310] = 5324208128531934676L;
        jd.ahlz[311] = -9054742747244951638L;
        jd.ahlz[312] = 772504790170179995L;
        jd.ahlz[313] = -817094580583062506L;
        jd.ahlz[314] = 6265652161577094851L;
        jd.ahlz[315] = 6626761968727496601L;
        jd.ahlz[316] = 4044773632488679136L;
        jd.ahlz[317] = 4191718103411710609L;
        jd.ahlz[318] = -2967283832397899490L;
        jd.ahlz[319] = -4025985184560441845L;
        jd.ahlz[320] = 8745504975197357347L;
        jd.ahlz[321] = 3859905126164284244L;
        jd.ahlz[322] = 5294164403493646907L;
        jd.ahlz[323] = 1405264206573149854L;
        jd.ahlz[324] = -323685613702858903L;
        jd.ahlz[325] = -7715990722009617936L;
        jd.ahlz[326] = 7514786549344991608L;
        jd.ahlz[327] = -1172774192840460721L;
        jd.ahlz[328] = -617039030981404836L;
        jd.ahlz[329] = -554766337625894982L;
        jd.ahlz[330] = -5669431353346187756L;
        jd.ahlz[331] = -6155525631102833750L;
        jd.ahlz[332] = -4588069718724668797L;
        jd.ahlz[333] = 7436231608688621520L;
        jd.ahlz[334] = 8086438532802858003L;
        jd.ahlz[335] = 8084808816882436066L;
        jd.ahlz[336] = 5964860386944397909L;
        jd.ahlz[337] = 3142814538772280167L;
        jd.ahlz[338] = -4015032149992737489L;
        jd.ahlz[339] = 326266170991844768L;
        jd.ahlz[340] = -666194447795941962L;
        jd.ahlz[341] = 8792783484233138967L;
        jd.ahlz[342] = -1429256790214105303L;
        jd.ahlz[343] = -5336205873453259685L;
        jd.ahlz[344] = 4803699230403173401L;
        jd.ahlz[345] = 2973848488423053212L;
        jd.ahlz[346] = 933500745191706098L;
        jd.ahlz[347] = -3216430716394401448L;
    }

    private static /* synthetic */ float ahvz(int n2) {
        return Float.intBitsToFloat(ahlk[n2] ^ ahll[n2]);
    }

    private static /* synthetic */ void ajev() {
        jd.ahly[300] = 3824542543093232842L;
        jd.ahly[301] = -39920406670243555L;
        jd.ahly[302] = 9195289631195884297L;
        jd.ahly[303] = 8847349024961791662L;
        jd.ahly[304] = -4073660303652630870L;
        jd.ahly[305] = 8160625248112003422L;
        jd.ahly[306] = -2520390734575076094L;
        jd.ahly[307] = 268557916204931267L;
        jd.ahly[308] = 6782588576856870440L;
        jd.ahly[309] = -1493720412427829900L;
        jd.ahly[310] = -5032618229020476362L;
        jd.ahly[311] = 5172838688615805434L;
        jd.ahly[312] = -6699797214976759252L;
        jd.ahly[313] = 7257797691629105353L;
        jd.ahly[314] = 8608232152038846077L;
        jd.ahly[315] = 395272266884848343L;
        jd.ahly[316] = -5561615055598746687L;
        jd.ahly[317] = 7835253455978321557L;
        jd.ahly[318] = -2152683091304653587L;
        jd.ahly[319] = 3734074645468389522L;
        jd.ahly[320] = 2685897672988282910L;
        jd.ahly[321] = -7107053985005401026L;
        jd.ahly[322] = 4309608713608462073L;
        jd.ahly[323] = 5346894426265344358L;
        jd.ahly[324] = 4697765150655288433L;
        jd.ahly[325] = 8284926689646589715L;
        jd.ahly[326] = 7203196652521326101L;
        jd.ahly[327] = -5436870514510825424L;
        jd.ahly[328] = -1956118297582042112L;
        jd.ahly[329] = -613691822332949527L;
        jd.ahly[330] = -9093669662119330283L;
        jd.ahly[331] = 8489847017171122525L;
        jd.ahly[332] = -2557911331902997319L;
        jd.ahly[333] = 9173499156380801288L;
        jd.ahly[334] = 5406082344200232066L;
        jd.ahly[335] = -292709134165460871L;
        jd.ahly[336] = -4066879859028447008L;
        jd.ahly[337] = 2695814798070025372L;
        jd.ahly[338] = -5528704074961125930L;
        jd.ahly[339] = -6021994123315375967L;
        jd.ahly[340] = -6648162186089614242L;
        jd.ahly[341] = 1708830490875612076L;
        jd.ahly[342] = -5042290119074436938L;
        jd.ahly[343] = -6576696991141322385L;
        jd.ahly[344] = 1313752727791560914L;
        jd.ahly[345] = 1622651515085882992L;
        jd.ahly[346] = 3680696517887708658L;
        jd.ahly[347] = -1392009034897393858L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public jd() {
        var2_1 /* !! */  = jd.b;
        super("Custom Models", "\u041f\u0440\u0438\u043c\u0435\u043d\u044f\u0435\u0442 \u0432\u0441\u0442\u0440\u043e\u0435\u043d\u043d\u044b\u0435 \u0430\u043d\u0438\u043c\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0435 \u043c\u043e\u0434\u0435\u043b\u0438 \u043a \u0432\u0430\u0448\u0435\u043c\u0443 \u0438\u0433\u0440\u043e\u043a\u0443", du.RENDER);
        this.model = new kf("\u041c\u043e\u0434\u0435\u043b\u044c", "\u041c\u043e\u0434\u0435\u043b\u044c, \u043f\u0440\u0438\u043c\u0435\u043d\u044f\u0435\u043c\u0430\u044f \u043a \u0432\u0430\u0448\u0435\u043c\u0443 \u0438\u0433\u0440\u043e\u043a\u0443", "Repo", new String[]{"Repo", "Bacon", "Peter Griffin", "Aria", "Sahur"});
        this.onFriends = new kb("\u041d\u0430 \u0434\u0440\u0443\u0437\u0435\u0439", "\u041f\u0440\u0438\u043c\u0435\u043d\u044f\u0442\u044c \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u0443\u044e \u043c\u043e\u0434\u0435\u043b\u044c \u043a \u0434\u0440\u0443\u0437\u044c\u044f\u043c");
        this.appliedFriends = new HashSet<UUID>();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                jd.instance = this;
                this.settings(new jx[]{this.model, this.onFriends});
                PhobiaFiguraBridge.setFirstPersonPassProvider((PhobiaFiguraBridge.FirstPersonPassProvider)(PhobiaFiguraBridge.FirstPersonPassProvider)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_1921;)[Lorg/figuramc/figura/utils/PhobiaFiguraBridge$RenderPass;, createShaderHandsPasses(net.minecraft.class_1921 ), (Lnet/minecraft/class_1921;)[Lorg/figuramc/figura/utils/PhobiaFiguraBridge$RenderPass;)());
                PhobiaFiguraBridge.setWorldPassProvider((PhobiaFiguraBridge.WorldPassProvider)(PhobiaFiguraBridge.WorldPassProvider)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_1297;Lnet/minecraft/class_1921;)[Lorg/figuramc/figura/utils/PhobiaFiguraBridge$RenderPass;, createShaderEspPasses(net.minecraft.class_1297 net.minecraft.class_1921 ), (Lnet/minecraft/class_1297;Lnet/minecraft/class_1921;)[Lorg/figuramc/figura/utils/PhobiaFiguraBridge$RenderPass;)());
                return;
            }
lbl14:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)jd.ahlm("ahln", ahlj(int ), (int)0);
                ** GOTO lbl31
            }
lbl17:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)jd.ahlm("ahlo", ahlj(int ), (int)1);
                    break block0;
                    break;
                }
            }
            case 2: {
                while (true) {
                    var2_1 /* !! */  = (int)jd.ahlm("ahlp", ahlj(int ), (int)2);
                }
            }
            case 3: {
                var2_1 /* !! */  = (int)jd.ahlm("ahlq", ahlj(int ), (int)3);
                ** GOTO lbl14
            }
            case 4: {
                var2_1 /* !! */  = (int)jd.ahlm("ahlr", ahlj(int ), (int)4);
                ** GOTO lbl17
            }
lbl31:
            // 4 sources

            case 5: {
                while (true) {
                    var2_1 /* !! */  = (int)jd.ahlm("ahls", ahlj(int ), (int)5);
                }
            }
            case 6: {
                var2_1 /* !! */  = (int)jd.ahlm("ahlt", ahlj(int ), (int)6);
            }
            case 7: {
                var2_1 /* !! */  = (int)jd.ahlm("ahlu", ahlj(int ), (int)7);
                ** GOTO lbl31
            }
            case 8: {
                var2_1 /* !! */  = (int)jd.ahlm("ahlv", ahlj(int ), (int)8);
                ** GOTO lbl31
            }
            case 9: 
        }
        var2_1 /* !! */  = (int)jd.ahlm("ahlw", ahlj(int ), (int)9);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jd.bz - jd.ahlm("aiep", ahlx(int ), (int)155)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jd.ahlm("aieq", ahlj(int ), (int)325)) break;
            v0 /* !! */  = (long)jd.ahlm("aier", ahlj(int ), (int)326);
        }
        var3_1 = jd.c;
        v1 /* !! */  = jd.bz;
        if (true) ** GOTO lbl11
        block37: while (true) {
            v1 /* !! */  = (long)(v2 - jd.ahlm("aies", ahlx(int ), (int)156));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2053357414: {
                    break block37;
                }
                case 1282441201: {
                    v2 = jd.ahlm("aiet", ahlx(int ), (int)157);
                    continue block37;
                }
                case 1493876497: {
                    v2 = jd.ahlm("aieu", ahlx(int ), (int)158);
                    continue block37;
                }
            }
            break;
        }
        var2_2 /* !! */  = jd.b;
        v3 /* !! */  = jd.bz;
        if (true) ** GOTO lbl25
        block38: while (true) {
            v3 /* !! */  = (long)(v4 - jd.ahlm("aiev", ahlx(int ), (int)159));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2053357414: {
                    break block38;
                }
                case -936661303: {
                    v4 = jd.ahlm("aiew", ahlx(int ), (int)160);
                    continue block38;
                }
                case -164467260: {
                    v4 = jd.ahlm("aiex", ahlx(int ), (int)161);
                    continue block38;
                }
                case 832220649: {
                    v4 = jd.ahlm("aiey", ahlx(int ), (int)162);
                    continue block38;
                }
            }
            break;
        }
        var1_3 = jd.a;
        if (var3_1) {
            throw null;
lbl40:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl40
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = jd.bz;
                if (true) ** GOTO lbl50
                block40: while (true) {
                    v5 /* !! */  = (long)(v6 - jd.ahlm("aiez", ahlx(int ), (int)163));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2053357414: {
                            break block40;
                        }
                        case -1619913565: {
                            v6 = jd.ahlm("aifa", ahlx(int ), (int)164);
                            continue block40;
                        }
                        case 351166199: {
                            v6 = jd.ahlm("aifb", ahlx(int ), (int)165);
                            continue block40;
                        }
                    }
                    break;
                }
                this.loadedModel = null;
                if (var1_3 || var1_3) ** GOTO lbl40
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = jd.bz - jd.ahlm("aifc", ahlx(int ), (int)166)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == jd.ahlm("aifd", ahlj(int ), (int)327)) break;
                    v7 /* !! */  = (long)jd.ahlm("aife", ahlj(int ), (int)328);
                }
                this.friendSourceAvatar = null;
                if (var1_3 || var1_3) ** GOTO lbl40
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = jd.bz - jd.ahlm("aiff", ahlx(int ), (int)167)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == jd.ahlm("aifg", ahlj(int ), (int)329)) break;
                    v8 /* !! */  = (long)jd.ahlm("aifh", ahlj(int ), (int)330);
                }
                this.clearAppliedFriendModels();
                if (var1_3 || var1_3) ** GOTO lbl40
                v9 = jd.ahlm("aifi", ahlj(int ), (int)331);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = jd.bz - jd.ahlm("aifj", ahlx(int ), (int)168)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == jd.ahlm("aifk", ahlj(int ), (int)332)) break;
                    v10 /* !! */  = (long)jd.ahlm("aifl", ahlj(int ), (int)333);
                }
                PhobiaFiguraBridge.setCustomModelsActive((boolean)v9);
                if (var1_3 || var1_3) ** GOTO lbl40
                v11 /* !! */  = jd.bz;
                if (true) ** GOTO lbl87
                block44: while (true) {
                    v11 /* !! */  = (long)(jd.ahlm("aifn", ahlx(int ), (int)170) - jd.ahlm("aifm", ahlx(int ), (int)169));
lbl87:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -2053357414: {
                            break block44;
                        }
                        case -1199374872: {
                            continue block44;
                        }
                    }
                    break;
                }
                AvatarManager.loadLocalAvatar(null);
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl95:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)jd.ahlm("aifo", ahlj(int ), (int)334);
                if (var3_1) {
                    throw null;
                }
            }
lbl99:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)jd.ahlm("aifp", ahlj(int ), (int)335);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)jd.ahlm("aifq", ahlj(int ), (int)336);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl122
            }
            case 3: {
                do {
                    var2_2 /* !! */  = (int)jd.ahlm("aifr", ahlj(int ), (int)337);
                } while (!var3_1);
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)jd.ahlm("aifs", ahlj(int ), (int)338);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 5: {
                var2_2 /* !! */  = (int)jd.ahlm("aift", ahlj(int ), (int)339);
                if (!var3_1) ** GOTO lbl95
                throw null;
            }
lbl122:
            // 4 sources

            case 6: {
                var2_2 /* !! */  = (int)jd.ahlm("aifu", ahlj(int ), (int)340);
                if (!var3_1) break;
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)jd.ahlm("aifv", ahlj(int ), (int)341);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 8: {
                var2_2 /* !! */  = (int)jd.ahlm("aifw", ahlj(int ), (int)342);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 9: {
                var2_2 /* !! */  = (int)jd.ahlm("aifx", ahlj(int ), (int)343);
                if (!var3_1) ** GOTO lbl122
                throw null;
            }
lbl140:
            // 3 sources

            case 10: {
                var2_2 /* !! */  = (int)jd.ahlm("aify", ahlj(int ), (int)344);
                if (!var3_1) ** GOTO lbl122
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)jd.ahlm("aifz", ahlj(int ), (int)345);
                if (!var3_1) ** GOTO lbl99
                throw null;
            }
lbl148:
            // 3 sources

            case 12: {
                var2_2 /* !! */  = (int)jd.ahlm("aiga", ahlj(int ), (int)346);
                if (!var3_1) ** GOTO lbl140
                throw null;
            }
            case 13: 
        }
        do {
            var2_2 /* !! */  = (int)jd.ahlm("aigb", ahlj(int ), (int)347);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static double tagHeightExtra(class_1297 var0) {
        block81: {
            block80: {
                v0 /* !! */  = jd.bz;
                if (true) ** GOTO lbl5
                block49: while (true) {
                    v0 /* !! */  = (long)(v1 - jd.ahlm("ahot", ahlx(int ), (int)24));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -2053357414: {
                            break block49;
                        }
                        case -534351825: {
                            v1 = jd.ahlm("ahou", ahlx(int ), (int)25);
                            continue block49;
                        }
                        case -125167544: {
                            v1 = jd.ahlm("ahov", ahlx(int ), (int)26);
                            continue block49;
                        }
                        case 1821709868: {
                            v1 = jd.ahlm("ahow", ahlx(int ), (int)27);
                            continue block49;
                        }
                    }
                    break;
                }
                var5_1 = jd.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = jd.bz - jd.ahlm("ahox", ahlx(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == jd.ahlm("ahoy", ahlj(int ), (int)53)) break;
                    v2 /* !! */  = (long)jd.ahlm("ahoz", ahlj(int ), (int)54);
                }
                var4_2 /* !! */  = jd.b;
                v3 /* !! */  = jd.bz;
                if (true) ** GOTO lbl28
                block51: while (true) {
                    v3 /* !! */  = (long)(jd.ahlm("ahpb", ahlx(int ), (int)30) - jd.ahlm("ahpa", ahlx(int ), (int)29));
lbl28:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2053357414: {
                            break block51;
                        }
                        case -1120690253: {
                            continue block51;
                        }
                    }
                    break;
                }
                var3_3 = jd.a;
                if (var5_1) {
                    throw null;
lbl36:
                    // 10 sources

                    return (double)jd.ahlm("ahpd", ahpc(int ), (int)31);
                }
                if (var3_3 || var3_3) ** GOTO lbl36
                if (!(var0 instanceof class_11890)) break block80;
                if (var3_3) ** GOTO lbl36
                var1_4 = (class_11890)var0;
                if (var3_3 || var3_3) ** GOTO lbl36
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = jd.bz - jd.ahlm("ahpe", ahlx(int ), (int)32)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == jd.ahlm("ahpf", ahlj(int ), (int)55)) break;
                    v4 /* !! */  = (long)jd.ahlm("ahpg", ahlj(int ), (int)56);
                }
                if (jd.appliesTo(var1_4)) break block81;
                if (var3_3) ** GOTO lbl36
            }
            if (var3_3 || var3_3) ** GOTO lbl36
            return 0.0;
        }
        if (var3_3 || var3_3) ** GOTO lbl36
        v5 /* !! */  = jd.bz;
        if (true) ** GOTO lbl59
        block54: while (true) {
            v5 /* !! */  = (long)(jd.ahlm("ahpj", ahlx(int ), (int)34) - jd.ahlm("ahpi", ahlx(int ), (int)33));
lbl59:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -2053357414: {
                    break block54;
                }
                case -1672073229: {
                    continue block54;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = jd.bz - jd.ahlm("ahpk", ahlx(int ), (int)35)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == jd.ahlm("ahpl", ahlj(int ), (int)57)) break;
            v6 /* !! */  = (long)jd.ahlm("ahpm", ahlj(int ), (int)58);
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = jd.bz - jd.ahlm("ahpn", ahlx(int ), (int)36)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == jd.ahlm("ahpo", ahlj(int ), (int)59)) break;
            v7 /* !! */  = (long)jd.ahlm("ahpp", ahlj(int ), (int)60);
        }
        v8 = jd.instance.model;
        v9 /* !! */  = jd.bz;
        if (true) ** GOTO lbl79
        block57: while (true) {
            v9 /* !! */  = (long)(v10 - jd.ahlm("ahpq", ahlx(int ), (int)37));
lbl79:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -2053357414: {
                    break block57;
                }
                case -1074251087: {
                    v10 = jd.ahlm("ahpr", ahlx(int ), (int)38);
                    continue block57;
                }
                case -813116028: {
                    v10 = jd.ahlm("ahps", ahlx(int ), (int)39);
                    continue block57;
                }
                case -547426355: {
                    v10 = jd.ahlm("ahpt", ahlx(int ), (int)40);
                    continue block57;
                }
            }
            break;
        }
        v11 = v8.getValue();
        v12 /* !! */  = jd.bz;
        if (true) ** GOTO lbl96
        block58: while (true) {
            v12 /* !! */  = (long)(jd.ahlm("ahpv", ahlx(int ), (int)42) - jd.ahlm("ahpu", ahlx(int ), (int)41));
lbl96:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -2053357414: {
                    break block58;
                }
                case 1800371892: {
                    continue block58;
                }
            }
            break;
        }
        var2_5 = jd.AVATARS.get(v11);
        if (var3_3) ** GOTO lbl36
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl36
                if (var2_5 != null) ** GOTO lbl113
                if (var3_3) ** GOTO lbl36
                v13 = 0.0;
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl129
lbl113:
                // 1 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                v14 /* !! */  = jd.bz;
                if (true) ** GOTO lbl119
                block59: while (true) {
                    v14 /* !! */  = (long)(v15 - jd.ahlm("ahpw", ahlx(int ), (int)43));
lbl119:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -2053357414: {
                            break block59;
                        }
                        case 772371755: {
                            v15 = jd.ahlm("ahpx", ahlx(int ), (int)44);
                            continue block59;
                        }
                        case 1072629848: {
                            v15 = jd.ahlm("ahpy", ahlx(int ), (int)45);
                            continue block59;
                        }
                    }
                    break;
                }
                v13 = var2_5.tagHeightExtra();
lbl129:
                // 2 sources

                return v13;
            }
lbl130:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)jd.ahlm("ahpz", ahlj(int ), (int)61);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl135:
            // 2 sources

            case 1: {
                var4_2 /* !! */  = (int)jd.ahlm("ahqa", ahlj(int ), (int)62);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl140:
            // 2 sources

            case 2: {
                var4_2 /* !! */  = (int)jd.ahlm("ahqb", ahlj(int ), (int)63);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl145:
            // 2 sources

            case 3: {
                var4_2 /* !! */  = (int)jd.ahlm("ahqc", ahlj(int ), (int)64);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 4: {
                var4_2 /* !! */  = (int)jd.ahlm("ahqe", ahlj(int ), (int)65);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl155:
            // 2 sources

            case 5: {
                var4_2 /* !! */  = (int)jd.ahlm("ahqf", ahlj(int ), (int)66);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl160:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)jd.ahlm("ahqg", ahlj(int ), (int)67);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl165:
            // 3 sources

            case 7: {
                var4_2 /* !! */  = (int)jd.ahlm("ahqh", ahlj(int ), (int)68);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl170:
            // 2 sources

            case 8: {
                var4_2 /* !! */  = (int)jd.ahlm("ahqi", ahlj(int ), (int)69);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 9: {
                do {
                    var4_2 /* !! */  = (int)jd.ahlm("ahqj", ahlj(int ), (int)70);
                } while (!var5_1);
                throw null;
            }
lbl180:
            // 3 sources

            case 10: {
                var4_2 /* !! */  = (int)jd.ahlm("ahqk", ahlj(int ), (int)71);
                if (!var5_1) ** GOTO lbl130
                throw null;
            }
            case 11: {
                var4_2 /* !! */  = (int)jd.ahlm("ahql", ahlj(int ), (int)72);
                if (!var5_1) ** GOTO lbl160
                throw null;
            }
lbl188:
            // 3 sources

            case 12: {
                var4_2 /* !! */  = (int)jd.ahlm("ahqm", ahlj(int ), (int)73);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 13: {
                var4_2 /* !! */  = (int)jd.ahlm("ahqn", ahlj(int ), (int)74);
                if (var5_1) {
                    throw null;
                }
            }
            case 14: {
                var4_2 /* !! */  = (int)jd.ahlm("ahqo", ahlj(int ), (int)75);
                if (!var5_1) ** GOTO lbl140
                throw null;
            }
lbl201:
            // 2 sources

            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)jd.ahlm("ahqp", ahlj(int ), (int)76);
                    if (!var5_1) ** GOTO lbl135
                    throw null;
                }
            }
lbl206:
            // 2 sources

            case 16: {
                var4_2 /* !! */  = (int)jd.ahlm("ahqq", ahlj(int ), (int)77);
                if (!var5_1) ** GOTO lbl145
                throw null;
            }
            case 17: 
        }
        var4_2 /* !! */  = (int)jd.ahlm("ahqr", ahlj(int ), (int)78);
        ** while (!var5_1)
lbl213:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lambda$buildShaderHandsPasses$1(List list, class_1921 class_19212, int n2, int n3) {
        Object object = bz;
        boolean bl2 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - jd.ahlm("ajbd", ahlx(int ), (int)315);
            }
            switch ((int)object) {
                case -2053357414: {
                    break block17;
                }
                case 644365143: {
                    callSite = jd.ahlm("ajbe", ahlx(int ), (int)316);
                    continue block17;
                }
                case 1175826356: {
                    callSite = jd.ahlm("ajbf", ahlx(int ), (int)317);
                    continue block17;
                }
                case 1960971676: {
                    callSite = jd.ahlm("ajbg", ahlx(int ), (int)318);
                    continue block17;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = bz;
        boolean bl4 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - jd.ahlm("ajbh", ahlx(int ), (int)319);
            }
            switch ((int)object2) {
                case -2053357414: {
                    break block18;
                }
                case -667286523: {
                    callSite = jd.ahlm("ajbi", ahlx(int ), (int)320);
                    continue block18;
                }
                case 1633526609: {
                    callSite = jd.ahlm("ajbj", ahlx(int ), (int)321);
                    continue block18;
                }
            }
            break;
        }
        int n4 = b;
        Object object3 = bz;
        boolean bl5 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - jd.ahlm("ajbk", ahlx(int ), (int)322);
            }
            switch ((int)object3) {
                case -2068962105: {
                    callSite = jd.ahlm("ajbl", ahlx(int ), (int)323);
                    continue block19;
                }
                case -2053357414: {
                    break block19;
                }
                case -572733042: {
                    callSite = jd.ahlm("ajbm", ahlx(int ), (int)324);
                    continue block19;
                }
                case 573035693: {
                    callSite = jd.ahlm("ajbn", ahlx(int ), (int)325);
                    continue block19;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl3) {
            throw null;
        }
        if (bl6 || bl6) return;
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = bz - jd.ahlm("ajbo", ahlx(int ), (int)326)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object4 == jd.ahlm("ajbp", ahlj(int ), (int)751)) break;
            object4 = jd.ahlm("ajbq", ahlj(int ), (int)752);
        }
        PhobiaFiguraBridge.RenderPass renderPass = PhobiaFiguraBridge.RenderPass.shader((class_1921)class_19212, (int)n2, (int)n3);
        while (true) {
            long l3;
            Object object5;
            if ((object5 = (l3 = bz - jd.ahlm("ajbr", ahlx(int ), (int)327)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object5 == jd.ahlm("ajbs", ahlj(int ), (int)753)) {
                list.add(renderPass);
                if (bl6) return;
                return;
            }
            object5 = jd.ahlm("ajbt", ahlj(int ), (int)754);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldLoad(di var1_1) {
        v0 /* !! */  = jd.bz;
        if (true) ** GOTO lbl5
        block41: while (true) {
            v0 /* !! */  = (long)(jd.ahlm("aiii", ahlx(int ), (int)200) - jd.ahlm("aiih", ahlx(int ), (int)199));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2053357414: {
                    break block41;
                }
                case -228157865: {
                    continue block41;
                }
            }
            break;
        }
        var4_2 = jd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = jd.bz - jd.ahlm("aiij", ahlx(int ), (int)201)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == jd.ahlm("aiik", ahlj(int ), (int)377)) break;
            v1 /* !! */  = (long)jd.ahlm("aiil", ahlj(int ), (int)378);
        }
        var3_3 /* !! */  = jd.b;
        v2 /* !! */  = jd.bz;
        if (true) ** GOTO lbl21
        block43: while (true) {
            v2 /* !! */  = (long)(v3 - jd.ahlm("aiim", ahlx(int ), (int)202));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2053357414: {
                    break block43;
                }
                case -1673582470: {
                    v3 = jd.ahlm("aiin", ahlx(int ), (int)203);
                    continue block43;
                }
                case 1017550916: {
                    v3 = jd.ahlm("aiio", ahlx(int ), (int)204);
                    continue block43;
                }
                case 1625429395: {
                    v3 = jd.ahlm("aiip", ahlx(int ), (int)205);
                    continue block43;
                }
            }
            break;
        }
        var2_4 = jd.a;
        if (var4_2) {
            throw null;
lbl36:
            // 6 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl36
        v4 /* !! */  = jd.bz;
        if (true) ** GOTO lbl43
        block45: while (true) {
            v4 /* !! */  = (long)(v5 - jd.ahlm("aiiq", ahlx(int ), (int)206));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2127202428: {
                    v5 = jd.ahlm("aiir", ahlx(int ), (int)207);
                    continue block45;
                }
                case -2053357414: {
                    break block45;
                }
                case -19539738: {
                    v5 = jd.ahlm("aiis", ahlx(int ), (int)208);
                    continue block45;
                }
            }
            break;
        }
        this.loadedModel = null;
        if (var2_4 || var2_4) ** GOTO lbl36
        v6 /* !! */  = jd.bz;
        if (true) ** GOTO lbl58
        block46: while (true) {
            v6 /* !! */  = (long)(v7 - jd.ahlm("aiit", ahlx(int ), (int)209));
lbl58:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -2053357414: {
                    break block46;
                }
                case -1672994598: {
                    v7 = jd.ahlm("aiiu", ahlx(int ), (int)210);
                    continue block46;
                }
                case 1421030372: {
                    v7 = jd.ahlm("aiiv", ahlx(int ), (int)211);
                    continue block46;
                }
            }
            break;
        }
        this.friendSourceAvatar = null;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl36
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = jd.bz - jd.ahlm("aiiw", ahlx(int ), (int)212)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == jd.ahlm("aiix", ahlj(int ), (int)379)) break;
                    v8 /* !! */  = (long)jd.ahlm("aiiy", ahlj(int ), (int)380);
                }
                this.clearAppliedFriendModels();
                if (var2_4 || var2_4) ** GOTO lbl36
                v9 = jd.ahlm("aiiz", ahlj(int ), (int)381);
                v10 /* !! */  = jd.bz;
                if (true) ** GOTO lbl84
                block48: while (true) {
                    v10 /* !! */  = (long)(v11 - jd.ahlm("aija", ahlx(int ), (int)213));
lbl84:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -2053357414: {
                            break block48;
                        }
                        case -1315873220: {
                            v11 = jd.ahlm("aijb", ahlx(int ), (int)214);
                            continue block48;
                        }
                        case -1179576297: {
                            v11 = jd.ahlm("aijc", ahlx(int ), (int)215);
                            continue block48;
                        }
                    }
                    break;
                }
                PhobiaFiguraBridge.setCustomModelsActive((boolean)v9);
                if (var2_4 || var2_4) ** GOTO lbl36
                v12 = jd.ahlm("aijd", ahlj(int ), (int)382);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_2 = jd.bz - jd.ahlm("aije", ahlx(int ), (int)216)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == jd.ahlm("aijf", ahlj(int ), (int)383)) break;
                    v13 /* !! */  = (long)jd.ahlm("aijg", ahlj(int ), (int)384);
                }
                this.worldReloadDelay = (int)v12;
                if (var2_4 || var2_4) ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)jd.ahlm("aijh", ahlj(int ), (int)385);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 1: {
                var3_3 /* !! */  = (int)jd.ahlm("aiji", ahlj(int ), (int)386);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl114:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)jd.ahlm("aijj", ahlj(int ), (int)387);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl119:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)jd.ahlm("aijk", ahlj(int ), (int)388);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl157
                    break;
                }
            }
lbl125:
            // 4 sources

            case 4: {
                var3_3 /* !! */  = (int)jd.ahlm("aijl", ahlj(int ), (int)389);
                if (!var4_2) ** GOTO lbl114
                throw null;
            }
lbl129:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)jd.ahlm("aijm", ahlj(int ), (int)390);
                if (!var4_2) ** GOTO lbl125
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)jd.ahlm("aijn", ahlj(int ), (int)391);
                if (!var4_2) ** GOTO lbl114
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)jd.ahlm("aijo", ahlj(int ), (int)392);
                if (!var4_2) ** GOTO lbl125
                throw null;
            }
lbl141:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)jd.ahlm("aijp", ahlj(int ), (int)393);
                if (!var4_2) ** GOTO lbl125
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)jd.ahlm("aijq", ahlj(int ), (int)394);
                if (!var4_2) ** GOTO lbl129
                throw null;
            }
lbl149:
            // 4 sources

            case 10: {
                var3_3 /* !! */  = (int)jd.ahlm("aijr", ahlj(int ), (int)395);
                if (var4_2) {
                    throw null;
                }
            }
            case 11: {
                var3_3 /* !! */  = (int)jd.ahlm("aijs", ahlj(int ), (int)396);
                if (!var4_2) ** GOTO lbl119
                throw null;
            }
lbl157:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)jd.ahlm("aijt", ahlj(int ), (int)397);
                if (!var4_2) ** GOTO lbl149
                throw null;
            }
            case 13: 
        }
        var3_3 /* !! */  = (int)jd.ahlm("aiju", ahlj(int ), (int)398);
        ** while (!var4_2)
lbl164:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ajet() {
        jd.ahly[100] = -3058619593451663214L;
        jd.ahly[101] = -7685747368074384096L;
        jd.ahly[102] = -540260484326678677L;
        jd.ahly[103] = 6397978536866545247L;
        jd.ahly[104] = -6032950628122157719L;
        jd.ahly[105] = -349683322195069062L;
        jd.ahly[106] = 7351313976305338244L;
        jd.ahly[107] = 4356933696714368779L;
        jd.ahly[108] = 6816095832661454018L;
        jd.ahly[109] = 2743907084675262579L;
        jd.ahly[110] = 1691308427366928294L;
        jd.ahly[111] = -202740154284295056L;
        jd.ahly[112] = -8546877863526727134L;
        jd.ahly[113] = -3700889944819787353L;
        jd.ahly[114] = -1805927310802666135L;
        jd.ahly[115] = 4463702063052625852L;
        jd.ahly[116] = -7117369286816742176L;
        jd.ahly[117] = 3834833187482799125L;
        jd.ahly[118] = -5141322494507885590L;
        jd.ahly[119] = -4246293882952875155L;
        jd.ahly[120] = -4553146403528022348L;
        jd.ahly[121] = -9010810137912888909L;
        jd.ahly[122] = -6046609672909558822L;
        jd.ahly[123] = -249596531114726056L;
        jd.ahly[124] = 6867888050028202148L;
        jd.ahly[125] = -7822602740145031141L;
        jd.ahly[126] = -8832342805582952405L;
        jd.ahly[127] = 1371375187142884240L;
        jd.ahly[128] = 5307464896561208087L;
        jd.ahly[129] = -9099472355728665315L;
        jd.ahly[130] = 1904122085473190787L;
        jd.ahly[131] = 5950216171825109315L;
        jd.ahly[132] = -6402727976082930631L;
        jd.ahly[133] = 6421644648120327295L;
        jd.ahly[134] = 5855631486699360926L;
        jd.ahly[135] = -8697905757768699902L;
        jd.ahly[136] = -6889205887312139203L;
        jd.ahly[137] = 6884256809845246782L;
        jd.ahly[138] = -446646680977856676L;
        jd.ahly[139] = -1188959071283159405L;
        jd.ahly[140] = 3498614703706525944L;
        jd.ahly[141] = -6873081682366277285L;
        jd.ahly[142] = -7102943342649237543L;
        jd.ahly[143] = 6197607795694593074L;
        jd.ahly[144] = -3101892499337264156L;
        jd.ahly[145] = -7427224470310027821L;
        jd.ahly[146] = 573205519183529895L;
        jd.ahly[147] = 2975440726347611684L;
        jd.ahly[148] = -8024054889993589243L;
        jd.ahly[149] = -89061269222249756L;
        jd.ahly[150] = 8889904914256782593L;
        jd.ahly[151] = -3548140540582871859L;
        jd.ahly[152] = 1443128887475496804L;
        jd.ahly[153] = 8462767752660408758L;
        jd.ahly[154] = -4195802216501158352L;
        jd.ahly[155] = -3660718944485296518L;
        jd.ahly[156] = -1549370151410735702L;
        jd.ahly[157] = 7768621964297822938L;
        jd.ahly[158] = -6421791049267224462L;
        jd.ahly[159] = 6131771741797497086L;
        jd.ahly[160] = -3035542084705328304L;
        jd.ahly[161] = -7881708678149702923L;
        jd.ahly[162] = 8211008037340436321L;
        jd.ahly[163] = -1150964383211175585L;
        jd.ahly[164] = 8842074759235244700L;
        jd.ahly[165] = 6109383640551969155L;
        jd.ahly[166] = -807399527835454854L;
        jd.ahly[167] = -3142826674507740287L;
        jd.ahly[168] = -3074984615698807540L;
        jd.ahly[169] = 7633516273126536384L;
        jd.ahly[170] = 7158987793148205443L;
        jd.ahly[171] = -4704031213798262577L;
        jd.ahly[172] = 2909197703172779105L;
        jd.ahly[173] = -4975186664088815546L;
        jd.ahly[174] = 1695436176948231702L;
        jd.ahly[175] = 8255201341908511389L;
        jd.ahly[176] = -1681437436195613248L;
        jd.ahly[177] = 8472875911247576705L;
        jd.ahly[178] = 6868281191145822834L;
        jd.ahly[179] = 4737987157094008439L;
        jd.ahly[180] = 2855450598319001498L;
        jd.ahly[181] = -6142555965265388095L;
        jd.ahly[182] = -2884921853971544520L;
        jd.ahly[183] = 5719429215160730171L;
        jd.ahly[184] = -4345576581214561579L;
        jd.ahly[185] = 292530036247645880L;
        jd.ahly[186] = 3764691678892294753L;
        jd.ahly[187] = -6073924310811645148L;
        jd.ahly[188] = -8767040572357245258L;
        jd.ahly[189] = 8812210521650914197L;
        jd.ahly[190] = 4644182012040005083L;
        jd.ahly[191] = -2975232422807536508L;
        jd.ahly[192] = 8840543735045554817L;
        jd.ahly[193] = -6381822914145254227L;
        jd.ahly[194] = -3349847867708918209L;
        jd.ahly[195] = -2856153534289297472L;
        jd.ahly[196] = 5118796275332222199L;
        jd.ahly[197] = 7578374912336507029L;
        jd.ahly[198] = 475759170444884987L;
        jd.ahly[199] = -7392945144187611927L;
    }

    private static /* synthetic */ void ajek() {
        jd.ahll[0] = -2001563025;
        jd.ahll[1] = 26781915;
        jd.ahll[2] = -1421865201;
        jd.ahll[3] = 279161287;
        jd.ahll[4] = 222911553;
        jd.ahll[5] = 1573096459;
        jd.ahll[6] = -1699702915;
        jd.ahll[7] = -819829097;
        jd.ahll[8] = 713372566;
        jd.ahll[9] = 926280730;
        jd.ahll[10] = -1729395284;
        jd.ahll[11] = -1420734648;
        jd.ahll[12] = 1511508437;
        jd.ahll[13] = 2063742241;
        jd.ahll[14] = -754574614;
        jd.ahll[15] = 1052311531;
        jd.ahll[16] = -1715990941;
        jd.ahll[17] = -1261074134;
        jd.ahll[18] = -1174195251;
        jd.ahll[19] = 1816839286;
        jd.ahll[20] = 692253686;
        jd.ahll[21] = -1779263822;
        jd.ahll[22] = -796747917;
        jd.ahll[23] = 1631517278;
        jd.ahll[24] = 840612749;
        jd.ahll[25] = 1427162169;
        jd.ahll[26] = 1530103846;
        jd.ahll[27] = -1983515401;
        jd.ahll[28] = -1434696223;
        jd.ahll[29] = 756175305;
        jd.ahll[30] = 164584169;
        jd.ahll[31] = -1482983371;
        jd.ahll[32] = 1952405115;
        jd.ahll[33] = -204338358;
        jd.ahll[34] = 1571396993;
        jd.ahll[35] = 646188822;
        jd.ahll[36] = 1852397702;
        jd.ahll[37] = 797150831;
        jd.ahll[38] = -378353113;
        jd.ahll[39] = -1476994915;
        jd.ahll[40] = 1926631290;
        jd.ahll[41] = -1115279947;
        jd.ahll[42] = -1823458490;
        jd.ahll[43] = 873402067;
        jd.ahll[44] = 357260792;
        jd.ahll[45] = -2064740439;
        jd.ahll[46] = 597536698;
        jd.ahll[47] = -693630740;
        jd.ahll[48] = -488470753;
        jd.ahll[49] = 479786926;
        jd.ahll[50] = 1959157305;
        jd.ahll[51] = -1925923928;
        jd.ahll[52] = 1483976989;
        jd.ahll[53] = 1751620043;
        jd.ahll[54] = 2068965673;
        jd.ahll[55] = -2086878867;
        jd.ahll[56] = 848591906;
        jd.ahll[57] = 348376304;
        jd.ahll[58] = 1073442828;
        jd.ahll[59] = -174451391;
        jd.ahll[60] = 677400150;
        jd.ahll[61] = -311353687;
        jd.ahll[62] = -1470959464;
        jd.ahll[63] = -1756838794;
        jd.ahll[64] = 917071456;
        jd.ahll[65] = 1735490833;
        jd.ahll[66] = -160404777;
        jd.ahll[67] = 1056068505;
        jd.ahll[68] = -1575198412;
        jd.ahll[69] = -1365970392;
        jd.ahll[70] = -1282514941;
        jd.ahll[71] = -35808568;
        jd.ahll[72] = 1288816067;
        jd.ahll[73] = -174738740;
        jd.ahll[74] = 479754812;
        jd.ahll[75] = 1452045627;
        jd.ahll[76] = -24438762;
        jd.ahll[77] = -1435216585;
        jd.ahll[78] = -411715222;
        jd.ahll[79] = -1096656029;
        jd.ahll[80] = -209961375;
        jd.ahll[81] = -1362985952;
        jd.ahll[82] = 211988515;
        jd.ahll[83] = -1518991941;
        jd.ahll[84] = -527666665;
        jd.ahll[85] = -1145520286;
        jd.ahll[86] = -497638170;
        jd.ahll[87] = 1901855534;
        jd.ahll[88] = -1929916014;
        jd.ahll[89] = 1914492651;
        jd.ahll[90] = 599595392;
        jd.ahll[91] = -708633993;
        jd.ahll[92] = 1863530224;
        jd.ahll[93] = 2039429710;
        jd.ahll[94] = -1867517312;
        jd.ahll[95] = 1633035333;
        jd.ahll[96] = 1225121836;
        jd.ahll[97] = -1511377752;
        jd.ahll[98] = 938812343;
        jd.ahll[99] = 2000559820;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ PhobiaFiguraBridge.RenderPass[] lambda$createShaderEspPasses$0(class_2960 var0, jm var1_1, class_1921 var2_2) {
        v0 /* !! */  = jd.bz;
        if (true) ** GOTO lbl5
        block34: while (true) {
            v0 /* !! */  = (long)(jd.ahlm("ajca", ahlx(int ), (int)329) - jd.ahlm("ajbz", ahlx(int ), (int)328));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2053357414: {
                    break block34;
                }
                case -1440802442: {
                    continue block34;
                }
            }
            break;
        }
        var6_3 = jd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = jd.bz - jd.ahlm("ajcb", ahlx(int ), (int)330)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == jd.ahlm("ajcc", ahlj(int ), (int)760)) break;
            v1 /* !! */  = (long)jd.ahlm("ajcd", ahlj(int ), (int)761);
        }
        var5_4 /* !! */  = jd.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = jd.bz - jd.ahlm("ajce", ahlx(int ), (int)331)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jd.ahlm("ajcf", ahlj(int ), (int)762)) break;
            v2 /* !! */  = (long)jd.ahlm("ajcg", ahlj(int ), (int)763);
        }
        var4_5 = jd.a;
        if (var6_3) {
            throw null;
lbl25:
            // 8 sources

            return null;
        }
        if (var4_5 || var4_5) ** GOTO lbl25
        var3_6 = var2_2;
        if (var4_5 || var4_5) ** GOTO lbl25
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = jd.bz - jd.ahlm("ajch", ahlx(int ), (int)332)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jd.ahlm("ajci", ahlj(int ), (int)764)) break;
            v3 /* !! */  = (long)jd.ahlm("ajcj", ahlj(int ), (int)765);
        }
        if (!var2_2.method_24295()) ** GOTO lbl76
        if (var4_5 || var4_5) ** GOTO lbl25
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_3 = jd.bz - jd.ahlm("ajck", ahlx(int ), (int)333)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == jd.ahlm("ajcl", ahlj(int ), (int)766)) break;
            v4 /* !! */  = (long)jd.ahlm("ajcm", ahlj(int ), (int)767);
        }
        v5 = var2_2.method_73243();
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_4 = jd.bz - jd.ahlm("ajcn", ahlx(int ), (int)334)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == jd.ahlm("ajco", ahlj(int ), (int)768)) break;
            v6 /* !! */  = (long)jd.ahlm("ajcp", ahlj(int ), (int)769);
        }
        if (!v5.isCull()) ** GOTO lbl63
        if (var4_5) ** GOTO lbl25
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5) ** GOTO lbl25
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_5 = jd.bz - jd.ahlm("ajcq", ahlx(int ), (int)335)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == jd.ahlm("ajcr", ahlj(int ), (int)770)) break;
                    v7 /* !! */  = (long)jd.ahlm("ajcs", ahlj(int ), (int)771);
                }
                v8 = class_12249.method_75990((class_2960)var0);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl75
            }
lbl63:
            // 1 sources

            if (var4_5 || var4_5) ** GOTO lbl25
            v9 = jd.ahlm("ajct", ahlj(int ), (int)772);
            v10 /* !! */  = jd.bz;
            if (true) ** GOTO lbl69
            block42: while (true) {
                v10 /* !! */  = (long)(jd.ahlm("ajcv", ahlx(int ), (int)337) - jd.ahlm("ajcu", ahlx(int ), (int)336));
lbl69:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -2053357414: {
                        break block42;
                    }
                    case -1843293859: {
                        continue block42;
                    }
                }
                break;
            }
            v8 = var3_6 = class_12249.method_75969((class_2960)var0, (boolean)v9);
lbl75:
            // 2 sources

            if (var4_5) ** GOTO lbl25
lbl76:
            // 2 sources

            if (!var4_5 && !var4_5) ** break;
            ** continue;
            v11 = new PhobiaFiguraBridge.RenderPass[2];
            v12 = jd.ahlm("ajcw", ahlj(int ), (int)773);
            while (true) {
                if ((v13 = (cfr_temp_6 = jd.bz - jd.ahlm("ajcx", ahlx(int ), (int)338)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v13 == jd.ahlm("ajcy", ahlj(int ), (int)774)) break;
                v13 = -512368586;
            }
            v11[v12] = PhobiaFiguraBridge.RenderPass.original((class_1921)var3_6);
            v14 = jd.ahlm("ajcz", ahlj(int ), (int)775);
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_7 = jd.bz - jd.ahlm("ajda", ahlx(int ), (int)339)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == jd.ahlm("ajdb", ahlj(int ), (int)776)) break;
                v15 /* !! */  = (long)jd.ahlm("ajdc", ahlj(int ), (int)777);
            }
            v16 /* !! */  = jd.bz;
            if (true) ** GOTO lbl96
            block45: while (true) {
                v16 /* !! */  = (long)(jd.ahlm("ajde", ahlx(int ), (int)341) - jd.ahlm("ajdd", ahlx(int ), (int)340));
lbl96:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -2101743058: {
                        continue block45;
                    }
                    case -2053357414: {
                        break block45;
                    }
                }
                break;
            }
            v17 /* !! */  = jd.bz;
            if (true) ** GOTO lbl105
            block46: while (true) {
                v17 /* !! */  = (long)(jd.ahlm("ajdg", ahlx(int ), (int)343) - jd.ahlm("ajdf", ahlx(int ), (int)342));
lbl105:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -2053357414: {
                        break block46;
                    }
                    case -33355136: {
                        continue block46;
                    }
                }
                break;
            }
            v18 = var1_1.getOutlineColor();
            while (true) {
                if ((v19 = (cfr_temp_8 = jd.bz - jd.ahlm("ajdh", ahlx(int ), (int)344)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v19 == jd.ahlm("ajdi", ahlj(int ), (int)778)) break;
                v19 = 341325955;
            }
            v11[v14] = PhobiaFiguraBridge.RenderPass.colored((class_1921)oj.CUSTOM_MODEL_OUTLINE.apply(var0), (int)v18);
            return v11;
            case 0: {
                var5_4 /* !! */  = (int)jd.ahlm("ajdj", ahlj(int ), (int)779);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl167
            }
            case 1: {
                var5_4 /* !! */  = (int)jd.ahlm("ajdk", ahlj(int ), (int)780);
                if (!var6_3) break;
                throw null;
            }
            case 2: {
                do {
                    var5_4 /* !! */  = (int)jd.ahlm("ajdl", ahlj(int ), (int)781);
                } while (!var6_3);
                throw null;
            }
            case 3: {
                var5_4 /* !! */  = (int)jd.ahlm("ajdm", ahlj(int ), (int)782);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl137:
            // 2 sources

            case 4: {
                var5_4 /* !! */  = (int)jd.ahlm("ajdn", ahlj(int ), (int)783);
                if (var6_3) {
                    throw null;
                }
            }
lbl141:
            // 5 sources

            case 5: {
                var5_4 /* !! */  = (int)jd.ahlm("ajdo", ahlj(int ), (int)784);
                if (!var6_3) ** GOTO lbl137
                throw null;
            }
            case 6: {
                do {
                    var5_4 /* !! */  = (int)jd.ahlm("ajdp", ahlj(int ), (int)785);
                } while (!var6_3);
                throw null;
            }
            case 7: {
                var5_4 /* !! */  = (int)jd.ahlm("ajdq", ahlj(int ), (int)786);
                if (!var6_3) ** GOTO lbl141
                throw null;
            }
            case 8: {
                var5_4 /* !! */  = (int)jd.ahlm("ajdr", ahlj(int ), (int)787);
                if (!var6_3) ** GOTO lbl141
                throw null;
            }
            case 9: {
                var5_4 /* !! */  = (int)jd.ahlm("ajds", ahlj(int ), (int)788);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl163:
            // 2 sources

            case 10: {
                var5_4 /* !! */  = (int)jd.ahlm("ajdt", ahlj(int ), (int)789);
                if (!var6_3) break;
                throw null;
            }
lbl167:
            // 4 sources

            case 11: {
                var5_4 /* !! */  = (int)jd.ahlm("ajdu", ahlj(int ), (int)790);
                if (!var6_3) break;
                throw null;
            }
lbl171:
            // 2 sources

            case 12: {
                var5_4 /* !! */  = (int)jd.ahlm("ajdv", ahlj(int ), (int)791);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl181
            }
            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)jd.ahlm("ajdw", ahlj(int ), (int)792);
                    if (!var6_3) ** GOTO lbl171
                    throw null;
                }
            }
lbl181:
            // 2 sources

            case 14: {
                var5_4 /* !! */  = (int)jd.ahlm("ajdx", ahlj(int ), (int)793);
                if (!var6_3) ** GOTO lbl163
                throw null;
            }
            case 15: 
        }
        var5_4 /* !! */  = (int)jd.ahlm("ajdy", ahlj(int ), (int)794);
        ** while (!var6_3)
lbl188:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    private static void deleteTree(Path var0) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 3[CASE]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean isFiguraReady() {
        block40: {
            v0 /* !! */  = jd.bz;
            if (true) ** GOTO lbl5
            block21: while (true) {
                v0 /* !! */  = (long)(v1 - jd.ahlm("aijv", ahlx(int ), (int)217));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -2053357414: {
                        break block21;
                    }
                    case 119423119: {
                        v1 = jd.ahlm("aijw", ahlx(int ), (int)218);
                        continue block21;
                    }
                    case 778949286: {
                        v1 = jd.ahlm("aijx", ahlx(int ), (int)219);
                        continue block21;
                    }
                    case 1444694719: {
                        v1 = jd.ahlm("aijy", ahlx(int ), (int)220);
                        continue block21;
                    }
                }
                break;
            }
            var2 = jd.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = jd.bz - jd.ahlm("aijz", ahlx(int ), (int)221)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == jd.ahlm("aika", ahlj(int ), (int)399)) break;
                v2 /* !! */  = (long)jd.ahlm("aikb", ahlj(int ), (int)400);
            }
            var1_1 /* !! */  = jd.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = jd.bz - jd.ahlm("aikc", ahlx(int ), (int)222)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == jd.ahlm("aikd", ahlj(int ), (int)401)) break;
                v3 /* !! */  = (long)jd.ahlm("aike", ahlj(int ), (int)402);
            }
            var0_2 = jd.a;
            if (var2) {
                throw null;
lbl34:
                // 3 sources

                return (boolean)jd.ahlm("aikf", ahlj(int ), (int)403);
            }
            if (var0_2 || var0_2) ** GOTO lbl34
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = jd.bz - jd.ahlm("aikg", ahlx(int ), (int)223)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == jd.ahlm("aikh", ahlj(int ), (int)404)) break;
                v4 /* !! */  = (long)jd.ahlm("aiki", ahlj(int ), (int)405);
            }
            v5 /* !! */  = jd.bz;
            if (true) ** GOTO lbl47
            block26: while (true) {
                v5 /* !! */  = (long)(v6 - jd.ahlm("aikj", ahlx(int ), (int)224));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -2053357414: {
                        break block26;
                    }
                    case -1730617968: {
                        v6 = jd.ahlm("aikk", ahlx(int ), (int)225);
                        continue block26;
                    }
                    case -997036043: {
                        v6 = jd.ahlm("aikl", ahlx(int ), (int)226);
                        continue block26;
                    }
                }
                break;
            }
            if (PermissionManager.CATEGORIES.isEmpty()) break block40;
            if (var0_2) ** GOTO lbl34
            v7 = jd.ahlm("aikm", ahlj(int ), (int)406);
            if (var2) {
                throw null;
            }
            ** GOTO lbl69
        }
        if (!var0_2 && !var0_2) ** break;
        ** while (true)
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v7 = jd.ahlm("aikn", ahlj(int ), (int)407);
lbl69:
                // 2 sources

                return (boolean)v7;
            }
lbl70:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)jd.ahlm("aiko", ahlj(int ), (int)408);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl99
            }
lbl75:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)jd.ahlm("aikp", ahlj(int ), (int)409);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl90
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)jd.ahlm("aikq", ahlj(int ), (int)410);
                    if (!var2) ** GOTO lbl75
                    throw null;
                }
            }
            case 3: {
                do {
                    var1_1 /* !! */  = (int)jd.ahlm("aikr", ahlj(int ), (int)411);
                } while (!var2);
                throw null;
            }
lbl90:
            // 2 sources

            case 4: {
                var1_1 /* !! */  = (int)jd.ahlm("aiks", ahlj(int ), (int)412);
                if (var2) {
                    throw null;
                }
            }
            case 5: {
                do {
                    var1_1 /* !! */  = (int)jd.ahlm("aikt", ahlj(int ), (int)413);
                } while (!var2);
                throw null;
            }
lbl99:
            // 2 sources

            case 6: {
                var1_1 /* !! */  = (int)jd.ahlm("aiku", ahlj(int ), (int)414);
                if (!var2) ** GOTO lbl70
                throw null;
            }
            case 7: 
        }
        var1_1 /* !! */  = (int)jd.ahlm("aikv", ahlj(int ), (int)415);
        ** while (!var2)
lbl106:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static PhobiaFiguraBridge.RenderPass[] buildShaderHandsPasses(jn var0, class_1921 var1_1, class_2960 var2_2) {
        block53: {
            var8_3 = jd.c;
            var7_4 /* !! */  = jd.b;
            var6_5 = jd.a;
            if (var8_3) {
                throw null;
lbl6:
                // 13 sources

                return null;
            }
            if (var6_5 || var6_5) ** GOTO lbl6
            if (var0.isGlowMode()) break block53;
            if (var6_5 || var6_5) ** GOTO lbl6
            v0 = new PhobiaFiguraBridge.RenderPass[1];
            v0[jd.ahlm("ahxg", ahlj(int ), (int)200)] = PhobiaFiguraBridge.RenderPass.shader((class_1921)oj.SHADER_HANDS_GRADIENT.apply(var2_2), (int)jd.ahlm("ahxh", ahlj(int ), (int)201), (int)jd.ahlm("ahxi", ahlj(int ), (int)202));
            return v0;
        }
        if (var6_5 || var6_5) ** GOTO lbl6
        var3_6 = new ArrayList<PhobiaFiguraBridge.RenderPass>();
        if (var6_5 || var6_5) ** GOTO lbl6
        if (var7_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var3_6.add(PhobiaFiguraBridge.RenderPass.original((class_1921)var1_1));
                if (var6_5 || var6_5) ** GOTO lbl6
                var4_7 = oj.SHADER_HANDS_HALO.apply(var2_2);
                if (var6_5 || var6_5) ** GOTO lbl6
                var0.forEachHaloPass((jn$HaloPassConsumer)LambdaMetafactory.metafactory(null, null, null, (II)V, lambda$buildShaderHandsPasses$1(java.util.List net.minecraft.class_1921 int int ), (II)V)(var3_6, (class_1921)var4_7));
                if (var6_5 || var6_5) ** GOTO lbl6
                if (!var0.isTrailEnabled()) ** GOTO lbl39
                if (var6_5 || var6_5) ** GOTO lbl6
                var5_8 = oj.SHADER_HANDS_TRAIL_HALO.apply(var2_2);
                if (var6_5 || var6_5) ** GOTO lbl6
                var0.forEachHaloPass((jn$HaloPassConsumer)LambdaMetafactory.metafactory(null, null, null, (II)V, lambda$buildShaderHandsPasses$2(java.util.List net.minecraft.class_1921 int int ), (II)V)(var3_6, (class_1921)var5_8));
                if (var6_5 || var6_5) ** GOTO lbl6
                if (!var0.isTrailModelEnabled()) ** GOTO lbl39
                if (var6_5 || var6_5) ** GOTO lbl6
                var3_6.add(PhobiaFiguraBridge.RenderPass.shader((class_1921)var5_8, (int)var0.packTrailModelColor(), (int)var0.packTrailModelOverlay()));
                if (var6_5) ** GOTO lbl6
lbl39:
                // 3 sources

                if (!var6_5 && !var6_5) ** break;
                ** continue;
                return (PhobiaFiguraBridge.RenderPass[])var3_6.toArray((IntFunction<PhobiaFiguraBridge.RenderPass[]>)LambdaMetafactory.metafactory(null, null, null, (I)Ljava/lang/Object;, lambda$buildShaderHandsPasses$3(int ), (I)[Lorg/figuramc/figura/utils/PhobiaFiguraBridge$RenderPass;)());
            }
lbl42:
            // 4 sources

            case 0: {
                var7_4 /* !! */  = (int)jd.ahlm("ahxj", ahlj(int ), (int)203);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl47:
            // 3 sources

            case 1: {
                var7_4 /* !! */  = (int)jd.ahlm("ahxk", ahlj(int ), (int)204);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl69
            }
            case 2: {
                var7_4 /* !! */  = (int)jd.ahlm("ahxl", ahlj(int ), (int)205);
                if (!var8_3) ** GOTO lbl42
                throw null;
            }
            case 3: {
                var7_4 /* !! */  = (int)jd.ahlm("ahxm", ahlj(int ), (int)206);
                if (!var8_3) break;
                throw null;
            }
lbl60:
            // 2 sources

            case 4: {
                var7_4 /* !! */  = (int)jd.ahlm("ahxn", ahlj(int ), (int)207);
                if (!var8_3) ** GOTO lbl42
                throw null;
            }
            case 5: {
                var7_4 /* !! */  = (int)jd.ahlm("ahxo", ahlj(int ), (int)208);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl69:
            // 2 sources

            case 6: {
                var7_4 /* !! */  = (int)jd.ahlm("ahxp", ahlj(int ), (int)209);
                if (!var8_3) ** GOTO lbl60
                throw null;
            }
            case 7: {
                var7_4 /* !! */  = (int)jd.ahlm("ahxq", ahlj(int ), (int)210);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl101
            }
            case 8: {
                var7_4 /* !! */  = (int)jd.ahlm("ahxr", ahlj(int ), (int)211);
                if (var8_3) {
                    throw null;
                }
            }
lbl82:
            // 4 sources

            case 9: {
                var7_4 /* !! */  = (int)jd.ahlm("ahxs", ahlj(int ), (int)212);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl87:
            // 2 sources

            case 10: {
                var7_4 /* !! */  = (int)jd.ahlm("ahxt", ahlj(int ), (int)213);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl92:
            // 2 sources

            case 11: {
                var7_4 /* !! */  = (int)jd.ahlm("ahxu", ahlj(int ), (int)214);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl97:
            // 2 sources

            case 12: {
                var7_4 /* !! */  = (int)jd.ahlm("ahxv", ahlj(int ), (int)215);
                if (!var8_3) ** GOTO lbl82
                throw null;
            }
lbl101:
            // 2 sources

            case 13: {
                var7_4 /* !! */  = (int)jd.ahlm("ahxw", ahlj(int ), (int)216);
                if (!var8_3) ** GOTO lbl87
                throw null;
            }
lbl105:
            // 2 sources

            case 14: {
                var7_4 /* !! */  = (int)jd.ahlm("ahxx", ahlj(int ), (int)217);
                if (!var8_3) ** GOTO lbl47
                throw null;
            }
            case 15: {
                var7_4 /* !! */  = (int)jd.ahlm("ahxy", ahlj(int ), (int)218);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl114:
            // 2 sources

            case 16: {
                var7_4 /* !! */  = (int)jd.ahlm("ahxz", ahlj(int ), (int)219);
                if (!var8_3) ** GOTO lbl97
                throw null;
            }
lbl118:
            // 3 sources

            case 17: {
                var7_4 /* !! */  = (int)jd.ahlm("ahya", ahlj(int ), (int)220);
                if (!var8_3) ** GOTO lbl92
                throw null;
            }
            case 18: {
                var7_4 /* !! */  = (int)jd.ahlm("ahyb", ahlj(int ), (int)221);
                if (!var8_3) ** GOTO lbl118
                throw null;
            }
lbl126:
            // 2 sources

            case 19: {
                var7_4 /* !! */  = (int)jd.ahlm("ahyc", ahlj(int ), (int)222);
                if (!var8_3) ** GOTO lbl47
                throw null;
            }
            case 20: {
                var7_4 /* !! */  = (int)jd.ahlm("ahyd", ahlj(int ), (int)223);
                if (!var8_3) ** GOTO lbl114
                throw null;
            }
lbl134:
            // 2 sources

            case 21: {
                var7_4 /* !! */  = (int)jd.ahlm("ahye", ahlj(int ), (int)224);
                if (!var8_3) ** GOTO lbl42
                throw null;
            }
lbl138:
            // 3 sources

            case 22: {
                var7_4 /* !! */  = (int)jd.ahlm("ahyf", ahlj(int ), (int)225);
                if (!var8_3) break;
                throw null;
            }
            case 23: {
                var7_4 /* !! */  = (int)jd.ahlm("ahyg", ahlj(int ), (int)226);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl147:
            // 2 sources

            case 24: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var7_4 /* !! */  = (int)jd.ahlm("ahyh", ahlj(int ), (int)227);
                    if (!var8_3) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 25: {
                var7_4 /* !! */  = (int)jd.ahlm("ahyi", ahlj(int ), (int)228);
                if (!var8_3) ** GOTO lbl138
                throw null;
            }
lbl156:
            // 3 sources

            case 26: {
                var7_4 /* !! */  = (int)jd.ahlm("ahyj", ahlj(int ), (int)229);
                if (!var8_3) ** GOTO lbl118
                throw null;
            }
            case 27: 
        }
        var7_4 /* !! */  = (int)jd.ahlm("ahyk", ahlj(int ), (int)230);
        ** while (!var8_3)
lbl163:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ajew() {
        jd.ahlz[0] = 6556032143748606968L;
        jd.ahlz[1] = 6284551355764150151L;
        jd.ahlz[2] = 662815506940838108L;
        jd.ahlz[3] = -3818805273462874077L;
        jd.ahlz[4] = 3645192793599302426L;
        jd.ahlz[5] = -7811729186746515008L;
        jd.ahlz[6] = -2052820938032526226L;
        jd.ahlz[7] = -6044246364111185444L;
        jd.ahlz[8] = -8774650703231308678L;
        jd.ahlz[9] = -6468245919230125636L;
        jd.ahlz[10] = 7677328614685337171L;
        jd.ahlz[11] = 2890616219756413400L;
        jd.ahlz[12] = 4200926600179164441L;
        jd.ahlz[13] = 5698427538987448511L;
        jd.ahlz[14] = 1370120865097195136L;
        jd.ahlz[15] = -760903373847294854L;
        jd.ahlz[16] = -946973775718037718L;
        jd.ahlz[17] = 1388918255775810236L;
        jd.ahlz[18] = -3766189376288714141L;
        jd.ahlz[19] = -1118541347023867367L;
        jd.ahlz[20] = -8564408451171107997L;
        jd.ahlz[21] = 6749602508585630520L;
        jd.ahlz[22] = 1027421348790573437L;
        jd.ahlz[23] = -4030178138264346884L;
        jd.ahlz[24] = 4112022843831045137L;
        jd.ahlz[25] = -7501769943541711608L;
        jd.ahlz[26] = -5732543646728463597L;
        jd.ahlz[27] = -6513322227731806227L;
        jd.ahlz[28] = -1592192394748443953L;
        jd.ahlz[29] = -6507146287762577151L;
        jd.ahlz[30] = 6161497601629094391L;
        jd.ahlz[31] = -1592682064138547894L;
        jd.ahlz[32] = -4956211413785103798L;
        jd.ahlz[33] = -1878702811453995299L;
        jd.ahlz[34] = 8389489781997780236L;
        jd.ahlz[35] = -2397654082281950073L;
        jd.ahlz[36] = -2334281936018279213L;
        jd.ahlz[37] = 969535303583897551L;
        jd.ahlz[38] = 3109144272563765831L;
        jd.ahlz[39] = 7287769710582341412L;
        jd.ahlz[40] = -5282609735495857512L;
        jd.ahlz[41] = 4119452530430703207L;
        jd.ahlz[42] = 1455926984631459024L;
        jd.ahlz[43] = -5827859079750017875L;
        jd.ahlz[44] = 6396802694486424314L;
        jd.ahlz[45] = -7986167911379348636L;
        jd.ahlz[46] = 4234588161280430958L;
        jd.ahlz[47] = -6441798370082045842L;
        jd.ahlz[48] = -9056573249375429475L;
        jd.ahlz[49] = 8939782076472836505L;
        jd.ahlz[50] = -5028993033797253743L;
        jd.ahlz[51] = -8946342930652236239L;
        jd.ahlz[52] = -3348100109242986927L;
        jd.ahlz[53] = 6551575821281070699L;
        jd.ahlz[54] = -3128179726169513663L;
        jd.ahlz[55] = 4492223862843479437L;
        jd.ahlz[56] = 5395430683831021767L;
        jd.ahlz[57] = 2458183314152377044L;
        jd.ahlz[58] = -8570719086839671571L;
        jd.ahlz[59] = -6865900313034118334L;
        jd.ahlz[60] = 6898675859047612596L;
        jd.ahlz[61] = 3851681006952523383L;
        jd.ahlz[62] = 8075521386512141875L;
        jd.ahlz[63] = 847691441819472899L;
        jd.ahlz[64] = 7767717886342442377L;
        jd.ahlz[65] = -2384807118555957595L;
        jd.ahlz[66] = -520721227941921035L;
        jd.ahlz[67] = -2827208958415635341L;
        jd.ahlz[68] = -3742273640269042181L;
        jd.ahlz[69] = 826975245142743296L;
        jd.ahlz[70] = 3245342964359905006L;
        jd.ahlz[71] = 7694420681010976655L;
        jd.ahlz[72] = -8132896536848837955L;
        jd.ahlz[73] = -4023433824595113444L;
        jd.ahlz[74] = 640552830130312925L;
        jd.ahlz[75] = 9169776442982052572L;
        jd.ahlz[76] = -4448356338987252555L;
        jd.ahlz[77] = 2643214389572544000L;
        jd.ahlz[78] = 2840983900169916488L;
        jd.ahlz[79] = -8451347267509168179L;
        jd.ahlz[80] = 7960039245699403000L;
        jd.ahlz[81] = 7191544696124190341L;
        jd.ahlz[82] = -188240842766467820L;
        jd.ahlz[83] = -6721383041759576136L;
        jd.ahlz[84] = -667378197140491399L;
        jd.ahlz[85] = -4732770416665281951L;
        jd.ahlz[86] = 2006410264610093169L;
        jd.ahlz[87] = -5895673910421776870L;
        jd.ahlz[88] = -629304704645026660L;
        jd.ahlz[89] = 1773486811193222352L;
        jd.ahlz[90] = -2262185365121344091L;
        jd.ahlz[91] = 4971539395603064004L;
        jd.ahlz[92] = 5954881974289073399L;
        jd.ahlz[93] = 3812899917995279274L;
        jd.ahlz[94] = -2175892834242671088L;
        jd.ahlz[95] = 314032493231851251L;
        jd.ahlz[96] = 265576960292851915L;
        jd.ahlz[97] = 5922284506818162389L;
        jd.ahlz[98] = 7503396930608564536L;
        jd.ahlz[99] = -6017670659889785982L;
    }

    private static /* synthetic */ void ajej() {
        jd.ahlk[700] = 1955638976;
        jd.ahlk[701] = -763772820;
        jd.ahlk[702] = -1830729935;
        jd.ahlk[703] = -55213836;
        jd.ahlk[704] = 818337;
        jd.ahlk[705] = -1255895573;
        jd.ahlk[706] = -413872948;
        jd.ahlk[707] = -310728985;
        jd.ahlk[708] = 1157060485;
        jd.ahlk[709] = 1613395385;
        jd.ahlk[710] = 148250746;
        jd.ahlk[711] = -772785970;
        jd.ahlk[712] = -1639318460;
        jd.ahlk[713] = 793170807;
        jd.ahlk[714] = -810642150;
        jd.ahlk[715] = 880007269;
        jd.ahlk[716] = 239164899;
        jd.ahlk[717] = 924083853;
        jd.ahlk[718] = 935871778;
        jd.ahlk[719] = -791524198;
        jd.ahlk[720] = 169148754;
        jd.ahlk[721] = -570285895;
        jd.ahlk[722] = -2123253943;
        jd.ahlk[723] = 2039948072;
        jd.ahlk[724] = -799123636;
        jd.ahlk[725] = 0xB7FBBB7;
        jd.ahlk[726] = -774502057;
        jd.ahlk[727] = -2056733722;
        jd.ahlk[728] = 384012604;
        jd.ahlk[729] = 71839075;
        jd.ahlk[730] = -1323609973;
        jd.ahlk[731] = -711213011;
        jd.ahlk[732] = 876617714;
        jd.ahlk[733] = 1423729651;
        jd.ahlk[734] = 2002072290;
        jd.ahlk[735] = 1192384978;
        jd.ahlk[736] = 131233918;
        jd.ahlk[737] = 1176094240;
        jd.ahlk[738] = -291216049;
        jd.ahlk[739] = -210892584;
        jd.ahlk[740] = -1067183866;
        jd.ahlk[741] = 1256926180;
        jd.ahlk[742] = -1918193491;
        jd.ahlk[743] = 380361298;
        jd.ahlk[744] = -1655838750;
        jd.ahlk[745] = 857322068;
        jd.ahlk[746] = 1331767646;
        jd.ahlk[747] = 1678745216;
        jd.ahlk[748] = -1463051516;
        jd.ahlk[749] = -2018354128;
        jd.ahlk[750] = -909184518;
        jd.ahlk[751] = -600248987;
        jd.ahlk[752] = 1771836171;
        jd.ahlk[753] = -1724145049;
        jd.ahlk[754] = -828368905;
        jd.ahlk[755] = 1086044119;
        jd.ahlk[756] = 1688252813;
        jd.ahlk[757] = -2095325275;
        jd.ahlk[758] = -795594491;
        jd.ahlk[759] = 1273318059;
        jd.ahlk[760] = 504249970;
        jd.ahlk[761] = -1468063218;
        jd.ahlk[762] = -1971965413;
        jd.ahlk[763] = -1472811602;
        jd.ahlk[764] = -1029799576;
        jd.ahlk[765] = -1681279341;
        jd.ahlk[766] = 16786249;
        jd.ahlk[767] = 935804316;
        jd.ahlk[768] = 667149311;
        jd.ahlk[769] = 1352478556;
        jd.ahlk[770] = 876925518;
        jd.ahlk[771] = -1065326684;
        jd.ahlk[772] = -481099123;
        jd.ahlk[773] = -322229448;
        jd.ahlk[774] = 1241508695;
        jd.ahlk[775] = -423355725;
        jd.ahlk[776] = 290553902;
        jd.ahlk[777] = -324427972;
        jd.ahlk[778] = -1776092496;
        jd.ahlk[779] = -1751465914;
        jd.ahlk[780] = 1022225285;
        jd.ahlk[781] = 919693095;
        jd.ahlk[782] = 669988641;
        jd.ahlk[783] = 311493030;
        jd.ahlk[784] = -373054157;
        jd.ahlk[785] = -1299832312;
        jd.ahlk[786] = 133901309;
        jd.ahlk[787] = 429740423;
        jd.ahlk[788] = -776945499;
        jd.ahlk[789] = 1739546043;
        jd.ahlk[790] = 184699835;
        jd.ahlk[791] = -955426232;
        jd.ahlk[792] = 813246968;
        jd.ahlk[793] = -147168769;
        jd.ahlk[794] = 126086239;
    }

    private static /* synthetic */ void ajec() {
        jd.ahlk[0] = -2001563031;
        jd.ahlk[1] = 26781914;
        jd.ahlk[2] = -1421865206;
        jd.ahlk[3] = 279161287;
        jd.ahlk[4] = 222911555;
        jd.ahlk[5] = 1573096456;
        jd.ahlk[6] = -1699702917;
        jd.ahlk[7] = -819829102;
        jd.ahlk[8] = 713372566;
        jd.ahlk[9] = 926280728;
        jd.ahlk[10] = 1729395283;
        jd.ahlk[11] = 1329953143;
        jd.ahlk[12] = -1511508438;
        jd.ahlk[13] = -883834388;
        jd.ahlk[14] = -754574613;
        jd.ahlk[15] = -1052311532;
        jd.ahlk[16] = 1955170292;
        jd.ahlk[17] = 1261074133;
        jd.ahlk[18] = 638748259;
        jd.ahlk[19] = 1816839287;
        jd.ahlk[20] = 1698469679;
        jd.ahlk[21] = -1779263822;
        jd.ahlk[22] = 796747916;
        jd.ahlk[23] = -1854295214;
        jd.ahlk[24] = -840612750;
        jd.ahlk[25] = -1065896278;
        jd.ahlk[26] = 1530103847;
        jd.ahlk[27] = -1983515401;
        jd.ahlk[28] = -1434696224;
        jd.ahlk[29] = 756175322;
        jd.ahlk[30] = 164584172;
        jd.ahlk[31] = -1482983368;
        jd.ahlk[32] = 1952405119;
        jd.ahlk[33] = -204338362;
        jd.ahlk[34] = 1571397011;
        jd.ahlk[35] = 646188831;
        jd.ahlk[36] = 1852397700;
        jd.ahlk[37] = 797150847;
        jd.ahlk[38] = -378353100;
        jd.ahlk[39] = -1476994919;
        jd.ahlk[40] = 1926631279;
        jd.ahlk[41] = -1115279939;
        jd.ahlk[42] = -1823458490;
        jd.ahlk[43] = 873402073;
        jd.ahlk[44] = 357260778;
        jd.ahlk[45] = -2064740434;
        jd.ahlk[46] = 597536686;
        jd.ahlk[47] = -693630748;
        jd.ahlk[48] = -488470760;
        jd.ahlk[49] = 479786938;
        jd.ahlk[50] = 1959157307;
        jd.ahlk[51] = -1925923908;
        jd.ahlk[52] = 1483976984;
        jd.ahlk[53] = -1751620044;
        jd.ahlk[54] = 19506870;
        jd.ahlk[55] = 2086878866;
        jd.ahlk[56] = 1886314835;
        jd.ahlk[57] = -348376305;
        jd.ahlk[58] = 1746812528;
        jd.ahlk[59] = -174451392;
        jd.ahlk[60] = -489757177;
        jd.ahlk[61] = -311353682;
        jd.ahlk[62] = -1470959468;
        jd.ahlk[63] = -1756838793;
        jd.ahlk[64] = 917071470;
        jd.ahlk[65] = 1735490838;
        jd.ahlk[66] = -160404793;
        jd.ahlk[67] = 1056068509;
        jd.ahlk[68] = -1575198414;
        jd.ahlk[69] = -1365970375;
        jd.ahlk[70] = -1282514930;
        jd.ahlk[71] = -35808565;
        jd.ahlk[72] = 1288816077;
        jd.ahlk[73] = -174738724;
        jd.ahlk[74] = 479754811;
        jd.ahlk[75] = 1452045626;
        jd.ahlk[76] = -24438754;
        jd.ahlk[77] = -1435216584;
        jd.ahlk[78] = -411715227;
        jd.ahlk[79] = -1096656030;
        jd.ahlk[80] = -1274746263;
        jd.ahlk[81] = -1362985951;
        jd.ahlk[82] = 206386242;
        jd.ahlk[83] = 1518991940;
        jd.ahlk[84] = 652329433;
        jd.ahlk[85] = 1145520285;
        jd.ahlk[86] = 1962022871;
        jd.ahlk[87] = -1901855535;
        jd.ahlk[88] = 107865246;
        jd.ahlk[89] = -1914492652;
        jd.ahlk[90] = -1619527092;
        jd.ahlk[91] = -708634001;
        jd.ahlk[92] = 1863530227;
        jd.ahlk[93] = 2039429706;
        jd.ahlk[94] = -1867517309;
        jd.ahlk[95] = 1633035330;
        jd.ahlk[96] = 1225121853;
        jd.ahlk[97] = -1511377750;
        jd.ahlk[98] = 938812323;
        jd.ahlk[99] = 2000559836;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void updateShaderHandsPasses(jn var0, PhobiaFiguraBridge.RenderPass[] var1_1) {
        v0 /* !! */  = jd.bz;
        if (true) ** GOTO lbl5
        block74: while (true) {
            v0 /* !! */  = (long)(v1 - jd.ahlm("ahyl", ahlx(int ), (int)89));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2143924533: {
                    v1 = jd.ahlm("ahym", ahlx(int ), (int)90);
                    continue block74;
                }
                case -2053357414: {
                    break block74;
                }
                case -712991945: {
                    v1 = jd.ahlm("ahyn", ahlx(int ), (int)91);
                    continue block74;
                }
                case 1106031761: {
                    v1 = jd.ahlm("ahyo", ahlx(int ), (int)92);
                    continue block74;
                }
            }
            break;
        }
        var4_2 = jd.c;
        v2 /* !! */  = jd.bz;
        if (true) ** GOTO lbl22
        block75: while (true) {
            v2 /* !! */  = (long)(v3 - jd.ahlm("ahyp", ahlx(int ), (int)93));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2053357414: {
                    break block75;
                }
                case -2048809532: {
                    v3 = jd.ahlm("ahyq", ahlx(int ), (int)94);
                    continue block75;
                }
                case -1113381421: {
                    v3 = jd.ahlm("ahyr", ahlx(int ), (int)95);
                    continue block75;
                }
                case -569403187: {
                    v3 = jd.ahlm("ahys", ahlx(int ), (int)96);
                    continue block75;
                }
            }
            break;
        }
        var3_3 /* !! */  = jd.b;
        v4 /* !! */  = jd.bz;
        if (true) ** GOTO lbl39
        block76: while (true) {
            v4 /* !! */  = (long)(jd.ahlm("ahyu", ahlx(int ), (int)98) - jd.ahlm("ahyt", ahlx(int ), (int)97));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2053357414: {
                    break block76;
                }
                case 1862470017: {
                    continue block76;
                }
            }
            break;
        }
        var2_4 = jd.a;
        if (var4_2) {
            throw null;
lbl47:
            // 14 sources

            return;
        }
        if (var2_4) ** GOTO lbl47
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl47
                v5 /* !! */  = jd.bz;
                if (true) ** GOTO lbl58
                block78: while (true) {
                    v5 /* !! */  = (long)(jd.ahlm("ahyw", ahlx(int ), (int)100) - jd.ahlm("ahyv", ahlx(int ), (int)99));
lbl58:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2053357414: {
                            break block78;
                        }
                        case -413185512: {
                            continue block78;
                        }
                    }
                    break;
                }
                if (var0.isGlowMode()) ** GOTO lbl86
                if (var2_4 || var2_4) ** GOTO lbl47
                v6 = var1_1[0];
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_0 = jd.bz - jd.ahlm("ahyx", ahlx(int ), (int)101)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == jd.ahlm("ahyy", ahlj(int ), (int)231)) break;
                    v7 /* !! */  = (long)jd.ahlm("ahyz", ahlj(int ), (int)232);
                }
                v8 = var0.packColor1();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = jd.bz - jd.ahlm("ahza", ahlx(int ), (int)102)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == jd.ahlm("ahzb", ahlj(int ), (int)233)) break;
                    v9 /* !! */  = (long)jd.ahlm("ahzc", ahlj(int ), (int)234);
                }
                v10 = var0.packColor2Speed();
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = jd.bz - jd.ahlm("ahzd", ahlx(int ), (int)103)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == jd.ahlm("ahze", ahlj(int ), (int)235)) break;
                    v11 /* !! */  = (long)jd.ahlm("ahzf", ahlj(int ), (int)236);
                }
                v6.setPackedData(v8, v10);
                if (var2_4 || var2_4) ** GOTO lbl47
                return;
lbl86:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl47
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = jd.bz - jd.ahlm("ahzg", ahlx(int ), (int)104)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == jd.ahlm("ahzh", ahlj(int ), (int)237)) break;
                    v12 /* !! */  = (long)jd.ahlm("ahzi", ahlj(int ), (int)238);
                }
                jd.updatingPasses = var1_1;
                if (var2_4 || var2_4) ** GOTO lbl47
                v13 = jd.ahlm("ahzj", ahlj(int ), (int)239);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = jd.bz - jd.ahlm("ahzk", ahlx(int ), (int)105)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == jd.ahlm("ahzl", ahlj(int ), (int)240)) break;
                    v14 /* !! */  = (long)jd.ahlm("ahzm", ahlj(int ), (int)241);
                }
                jd.updatingPassIndex = (int)v13;
                if (var2_4 || var2_4) ** GOTO lbl47
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = jd.bz - jd.ahlm("ahzn", ahlx(int ), (int)106)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == jd.ahlm("ahzo", ahlj(int ), (int)242)) break;
                    v15 /* !! */  = (long)jd.ahlm("ahzp", ahlj(int ), (int)243);
                }
                v16 = (jn$HaloPassConsumer)LambdaMetafactory.metafactory(null, null, null, (II)V, updateCurrentPass(int int ), (II)V)();
                v17 /* !! */  = jd.bz;
                if (true) ** GOTO lbl112
                block85: while (true) {
                    v17 /* !! */  = (long)(jd.ahlm("ahzr", ahlx(int ), (int)108) - jd.ahlm("ahzq", ahlx(int ), (int)107));
lbl112:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -2053357414: {
                            break block85;
                        }
                        case -843643663: {
                            continue block85;
                        }
                    }
                    break;
                }
                var0.forEachHaloPass(v16);
                if (var2_4 || var2_4) ** GOTO lbl47
                v18 /* !! */  = jd.bz;
                if (true) ** GOTO lbl123
                block86: while (true) {
                    v18 /* !! */  = (long)(v19 - jd.ahlm("ahzs", ahlx(int ), (int)109));
lbl123:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -2053357414: {
                            break block86;
                        }
                        case 316767199: {
                            v19 = jd.ahlm("ahzt", ahlx(int ), (int)110);
                            continue block86;
                        }
                        case 1371382844: {
                            v19 = jd.ahlm("ahzu", ahlx(int ), (int)111);
                            continue block86;
                        }
                    }
                    break;
                }
                if (!var0.isTrailEnabled()) ** GOTO lbl202
                if (var2_4 || var2_4) ** GOTO lbl47
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_6 = jd.bz - jd.ahlm("ahzv", ahlx(int ), (int)112)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == jd.ahlm("ahzw", ahlj(int ), (int)244)) break;
                    v20 /* !! */  = (long)jd.ahlm("ahzx", ahlj(int ), (int)245);
                }
                v21 = (jn$HaloPassConsumer)LambdaMetafactory.metafactory(null, null, null, (II)V, updateCurrentPass(int int ), (II)V)();
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_7 = jd.bz - jd.ahlm("ahzy", ahlx(int ), (int)113)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == jd.ahlm("ahzz", ahlj(int ), (int)246)) break;
                    v22 /* !! */  = (long)jd.ahlm("aiaa", ahlj(int ), (int)247);
                }
                var0.forEachHaloPass(v21);
                if (var2_4 || var2_4) ** GOTO lbl47
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_8 = jd.bz - jd.ahlm("aiab", ahlx(int ), (int)114)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == jd.ahlm("aiac", ahlj(int ), (int)248)) break;
                    v23 /* !! */  = (long)jd.ahlm("aiad", ahlj(int ), (int)249);
                }
                if (!var0.isTrailModelEnabled()) ** GOTO lbl202
                if (var2_4 || var2_4) ** GOTO lbl47
                v24 /* !! */  = jd.bz;
                if (true) ** GOTO lbl158
                block90: while (true) {
                    v24 /* !! */  = (long)(v25 - jd.ahlm("aiae", ahlx(int ), (int)115));
lbl158:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -2053357414: {
                            break block90;
                        }
                        case -763607782: {
                            v25 = jd.ahlm("aiaf", ahlx(int ), (int)116);
                            continue block90;
                        }
                        case -24721203: {
                            v25 = jd.ahlm("aiag", ahlx(int ), (int)117);
                            continue block90;
                        }
                    }
                    break;
                }
                v26 = var1_1[jd.updatingPassIndex];
                v27 /* !! */  = jd.bz;
                if (true) ** GOTO lbl172
                block91: while (true) {
                    v27 /* !! */  = (long)(jd.ahlm("aiai", ahlx(int ), (int)119) - jd.ahlm("aiah", ahlx(int ), (int)118));
lbl172:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case -2053357414: {
                            break block91;
                        }
                        case -134567785: {
                            continue block91;
                        }
                    }
                    break;
                }
                v28 = var0.packTrailModelColor();
                v29 /* !! */  = jd.bz;
                if (true) ** GOTO lbl182
                block92: while (true) {
                    v29 /* !! */  = (long)(v30 - jd.ahlm("aiaj", ahlx(int ), (int)120));
lbl182:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -2053357414: {
                            break block92;
                        }
                        case -1345671884: {
                            v30 = jd.ahlm("aiak", ahlx(int ), (int)121);
                            continue block92;
                        }
                        case -279833209: {
                            v30 = jd.ahlm("aial", ahlx(int ), (int)122);
                            continue block92;
                        }
                        case 647372975: {
                            v30 = jd.ahlm("aiam", ahlx(int ), (int)123);
                            continue block92;
                        }
                    }
                    break;
                }
                v31 = var0.packTrailModelOverlay();
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_9 = jd.bz - jd.ahlm("aian", ahlx(int ), (int)124)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == jd.ahlm("aiao", ahlj(int ), (int)250)) break;
                    v32 /* !! */  = (long)jd.ahlm("aiap", ahlj(int ), (int)251);
                }
                v26.setPackedData(v28, v31);
                if (var2_4) ** GOTO lbl47
lbl202:
                // 3 sources

                if (var2_4 || var2_4) ** GOTO lbl47
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_10 = jd.bz - jd.ahlm("aiaq", ahlx(int ), (int)125)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == jd.ahlm("aiar", ahlj(int ), (int)252)) break;
                    v33 /* !! */  = (long)jd.ahlm("aias", ahlj(int ), (int)253);
                }
                jd.updatingPasses = null;
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)jd.ahlm("aiat", ahlj(int ), (int)254);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl256
            }
            case 1: {
                var3_3 /* !! */  = (int)jd.ahlm("aiau", ahlj(int ), (int)255);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl303
            }
lbl222:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)jd.ahlm("aiav", ahlj(int ), (int)256);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl227:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)jd.ahlm("aiaw", ahlj(int ), (int)257);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl287
            }
            case 4: {
                var3_3 /* !! */  = (int)jd.ahlm("aiax", ahlj(int ), (int)258);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl282
            }
lbl237:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)jd.ahlm("aiay", ahlj(int ), (int)259);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl242:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)jd.ahlm("aiaz", ahlj(int ), (int)260);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl247:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)jd.ahlm("aiba", ahlj(int ), (int)261);
                if (!var4_2) ** GOTO lbl242
                throw null;
            }
lbl251:
            // 3 sources

            case 8: {
                var3_3 /* !! */  = (int)jd.ahlm("aibb", ahlj(int ), (int)262);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl303
            }
lbl256:
            // 3 sources

            case 9: {
                var3_3 /* !! */  = (int)jd.ahlm("aibc", ahlj(int ), (int)263);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl321
            }
            case 10: {
                var3_3 /* !! */  = (int)jd.ahlm("aibd", ahlj(int ), (int)264);
                if (!var4_2) ** GOTO lbl247
                throw null;
            }
            case 11: {
                var3_3 /* !! */  = (int)jd.ahlm("aibe", ahlj(int ), (int)265);
                if (!var4_2) ** GOTO lbl237
                throw null;
            }
            case 12: {
                var3_3 /* !! */  = (int)jd.ahlm("aibf", ahlj(int ), (int)266);
                if (!var4_2) ** GOTO lbl251
                throw null;
            }
            case 13: {
                var3_3 /* !! */  = (int)jd.ahlm("aibg", ahlj(int ), (int)267);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl334
            }
lbl278:
            // 2 sources

            case 14: {
                var3_3 /* !! */  = (int)jd.ahlm("aibh", ahlj(int ), (int)268);
                if (!var4_2) ** GOTO lbl227
                throw null;
            }
lbl282:
            // 2 sources

            case 15: {
                var3_3 /* !! */  = (int)jd.ahlm("aibi", ahlj(int ), (int)269);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl313
            }
lbl287:
            // 3 sources

            case 16: {
                var3_3 /* !! */  = (int)jd.ahlm("aibj", ahlj(int ), (int)270);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl298
            }
lbl292:
            // 2 sources

            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)jd.ahlm("aibk", ahlj(int ), (int)271);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl313
                    break;
                }
            }
lbl298:
            // 3 sources

            case 18: {
                var3_3 /* !! */  = (int)jd.ahlm("aibl", ahlj(int ), (int)272);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl325
            }
lbl303:
            // 3 sources

            case 19: {
                var3_3 /* !! */  = (int)jd.ahlm("aibm", ahlj(int ), (int)273);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl334
            }
            case 20: {
                var3_3 /* !! */  = (int)jd.ahlm("aibn", ahlj(int ), (int)274);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl317
            }
lbl313:
            // 3 sources

            case 21: {
                var3_3 /* !! */  = (int)jd.ahlm("aibo", ahlj(int ), (int)275);
                if (!var4_2) ** GOTO lbl222
                throw null;
            }
lbl317:
            // 3 sources

            case 22: {
                var3_3 /* !! */  = (int)jd.ahlm("aibp", ahlj(int ), (int)276);
                if (!var4_2) ** GOTO lbl298
                throw null;
            }
lbl321:
            // 2 sources

            case 23: {
                var3_3 /* !! */  = (int)jd.ahlm("aibq", ahlj(int ), (int)277);
                if (!var4_2) ** GOTO lbl292
                throw null;
            }
lbl325:
            // 2 sources

            case 24: {
                var3_3 /* !! */  = (int)jd.ahlm("aibr", ahlj(int ), (int)278);
                if (!var4_2) ** GOTO lbl317
                throw null;
            }
            case 25: {
                do {
                    var3_3 /* !! */  = (int)jd.ahlm("aibs", ahlj(int ), (int)279);
                } while (!var4_2);
                throw null;
            }
lbl334:
            // 3 sources

            case 26: {
                var3_3 /* !! */  = (int)jd.ahlm("aibt", ahlj(int ), (int)280);
                if (!var4_2) ** GOTO lbl278
                throw null;
            }
            case 27: 
        }
        var3_3 /* !! */  = (int)jd.ahlm("aibu", ahlj(int ), (int)281);
        ** while (!var4_2)
lbl341:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    private static void extract(byte[] var0, Path var1_1) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 5[CASE]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ void lambda$syncFriendModels$4(Set var0, class_742 var1_1) {
        v0 /* !! */  = jd.bz;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - jd.ahlm("aiyn", ahlx(int ), (int)286));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2053357414: {
                    break block28;
                }
                case -1674987064: {
                    v1 = jd.ahlm("aiyo", ahlx(int ), (int)287);
                    continue block28;
                }
                case 12490615: {
                    v1 = jd.ahlm("aiyp", ahlx(int ), (int)288);
                    continue block28;
                }
                case 2032960317: {
                    v1 = jd.ahlm("aiyq", ahlx(int ), (int)289);
                    continue block28;
                }
            }
            break;
        }
        var4_2 = jd.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jd.bz - jd.ahlm("aiyr", ahlx(int ), (int)290)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jd.ahlm("aiys", ahlj(int ), (int)712)) break;
            v2 /* !! */  = (long)jd.ahlm("aiyt", ahlj(int ), (int)713);
        }
        var3_3 /* !! */  = jd.b;
        v3 /* !! */  = jd.bz;
        if (true) ** GOTO lbl28
        block30: while (true) {
            v3 /* !! */  = (long)(jd.ahlm("aiyv", ahlx(int ), (int)292) - jd.ahlm("aiyu", ahlx(int ), (int)291));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2053357414: {
                    break block30;
                }
                case -1827652578: {
                    continue block30;
                }
            }
            break;
        }
        var2_4 = jd.a;
        if (var4_2) {
            throw null;
lbl36:
            // 5 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl36
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = jd.bz - jd.ahlm("aiyw", ahlx(int ), (int)293)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == jd.ahlm("aiyx", ahlj(int ), (int)714)) break;
            v4 /* !! */  = (long)jd.ahlm("aiyy", ahlj(int ), (int)715);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = jd.bz - jd.ahlm("aiyz", ahlx(int ), (int)294)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == jd.ahlm("aiza", ahlj(int ), (int)716)) break;
            v5 /* !! */  = (long)jd.ahlm("aizb", ahlj(int ), (int)717);
        }
        if (var1_1 == jd.mc.field_1724) ** GOTO lbl86
        if (var2_4) ** GOTO lbl36
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = jd.bz - jd.ahlm("aizc", ahlx(int ), (int)295)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == jd.ahlm("aizd", ahlj(int ), (int)718)) break;
            v6 /* !! */  = (long)jd.ahlm("aize", ahlj(int ), (int)719);
        }
        if (!dl.isFriend((class_1297)var1_1)) ** GOTO lbl86
        if (var2_4 || var2_4) ** GOTO lbl36
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_4 = jd.bz - jd.ahlm("aizf", ahlx(int ), (int)296)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == jd.ahlm("aizg", ahlj(int ), (int)720)) break;
            v7 /* !! */  = (long)jd.ahlm("aizh", ahlj(int ), (int)721);
        }
        v8 = var1_1.method_5667();
        v9 /* !! */  = jd.bz;
        if (true) ** GOTO lbl68
        block36: while (true) {
            v9 /* !! */  = (long)(v10 - jd.ahlm("aizi", ahlx(int ), (int)297));
lbl68:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -2053357414: {
                    break block36;
                }
                case -710799885: {
                    v10 = jd.ahlm("aizj", ahlx(int ), (int)298);
                    continue block36;
                }
                case -315411670: {
                    v10 = jd.ahlm("aizk", ahlx(int ), (int)299);
                    continue block36;
                }
                case 595310272: {
                    v10 = jd.ahlm("aizl", ahlx(int ), (int)300);
                    continue block36;
                }
            }
            break;
        }
        var0.add(v8);
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block16 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl36
lbl86:
                // 3 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl89:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)jd.ahlm("aizm", ahlj(int ), (int)722);
                    if (!var4_2) break block16;
                    throw null;
                }
            }
lbl94:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)jd.ahlm("aizn", ahlj(int ), (int)723);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl99:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)jd.ahlm("aizo", ahlj(int ), (int)724);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl125
            }
            case 3: {
                var3_3 /* !! */  = (int)jd.ahlm("aizp", ahlj(int ), (int)725);
                if (!var4_2) ** GOTO lbl94
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)jd.ahlm("aizq", ahlj(int ), (int)726);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl125
            }
lbl113:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)jd.ahlm("aizr", ahlj(int ), (int)727);
                if (!var4_2) ** GOTO lbl89
                throw null;
            }
lbl117:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)jd.ahlm("aizs", ahlj(int ), (int)728);
                if (!var4_2) ** GOTO lbl99
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)jd.ahlm("aizt", ahlj(int ), (int)729);
                if (!var4_2) ** GOTO lbl117
                throw null;
            }
lbl125:
            // 3 sources

            case 8: {
                var3_3 /* !! */  = (int)jd.ahlm("aizu", ahlj(int ), (int)730);
                if (!var4_2) ** GOTO lbl99
                throw null;
            }
            case 9: 
        }
        var3_3 /* !! */  = (int)jd.ahlm("aizv", ahlj(int ), (int)731);
        ** while (!var4_2)
lbl132:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ajeo() {
        jd.ahll[400] = -805768211;
        jd.ahll[401] = -438374774;
        jd.ahll[402] = -1959901036;
        jd.ahll[403] = -940832710;
        jd.ahll[404] = -733017068;
        jd.ahll[405] = -1567373678;
        jd.ahll[406] = 2030817635;
        jd.ahll[407] = 1062097029;
        jd.ahll[408] = -81931034;
        jd.ahll[409] = 1685117684;
        jd.ahll[410] = -249226029;
        jd.ahll[411] = -704476050;
        jd.ahll[412] = -817401372;
        jd.ahll[413] = 1506698589;
        jd.ahll[414] = -607973822;
        jd.ahll[415] = -790521027;
        jd.ahll[416] = 675975482;
        jd.ahll[417] = 1011711471;
        jd.ahll[418] = -485682636;
        jd.ahll[419] = 1820293112;
        jd.ahll[420] = -244357719;
        jd.ahll[421] = -1231562522;
        jd.ahll[422] = -163112920;
        jd.ahll[423] = 327602500;
        jd.ahll[424] = -364538192;
        jd.ahll[425] = 1187191221;
        jd.ahll[426] = 1338720489;
        jd.ahll[427] = -904414418;
        jd.ahll[428] = 1247545597;
        jd.ahll[429] = 1956209775;
        jd.ahll[430] = -2067816924;
        jd.ahll[431] = 481900840;
        jd.ahll[432] = 868760096;
        jd.ahll[433] = -745594520;
        jd.ahll[434] = -1146104006;
        jd.ahll[435] = 894100560;
        jd.ahll[436] = -132439167;
        jd.ahll[437] = 870242076;
        jd.ahll[438] = 828098391;
        jd.ahll[439] = 460599800;
        jd.ahll[440] = -87238508;
        jd.ahll[441] = -1435615666;
        jd.ahll[442] = 780757187;
        jd.ahll[443] = -1042080158;
        jd.ahll[444] = 117920842;
        jd.ahll[445] = 1269691508;
        jd.ahll[446] = -1078353544;
        jd.ahll[447] = -1635500085;
        jd.ahll[448] = -2142492214;
        jd.ahll[449] = -1126731694;
        jd.ahll[450] = -175848205;
        jd.ahll[451] = -1241872982;
        jd.ahll[452] = 620235872;
        jd.ahll[453] = 520297700;
        jd.ahll[454] = 1532813134;
        jd.ahll[455] = 1245521977;
        jd.ahll[456] = -1839045963;
        jd.ahll[457] = 2060107392;
        jd.ahll[458] = 666967438;
        jd.ahll[459] = -1784247244;
        jd.ahll[460] = 998660416;
        jd.ahll[461] = 1204454972;
        jd.ahll[462] = 2110711610;
        jd.ahll[463] = -14213408;
        jd.ahll[464] = -1610209284;
        jd.ahll[465] = 596998028;
        jd.ahll[466] = -774734548;
        jd.ahll[467] = 503017038;
        jd.ahll[468] = -785350821;
        jd.ahll[469] = 1574437935;
        jd.ahll[470] = 440545706;
        jd.ahll[471] = 1400177120;
        jd.ahll[472] = 1891324026;
        jd.ahll[473] = -441580980;
        jd.ahll[474] = 967609784;
        jd.ahll[475] = 475641612;
        jd.ahll[476] = -2140773227;
        jd.ahll[477] = -52469545;
        jd.ahll[478] = -573376601;
        jd.ahll[479] = -380262817;
        jd.ahll[480] = 1978365884;
        jd.ahll[481] = 587808313;
        jd.ahll[482] = -1582321935;
        jd.ahll[483] = -80227131;
        jd.ahll[484] = -355939641;
        jd.ahll[485] = 317670704;
        jd.ahll[486] = 1556033864;
        jd.ahll[487] = -1670236921;
        jd.ahll[488] = -154247034;
        jd.ahll[489] = -1182043149;
        jd.ahll[490] = 1322409196;
        jd.ahll[491] = 299482516;
        jd.ahll[492] = 1311070781;
        jd.ahll[493] = 1865462169;
        jd.ahll[494] = -164633540;
        jd.ahll[495] = -1188325757;
        jd.ahll[496] = -888395954;
        jd.ahll[497] = -1049176646;
        jd.ahll[498] = 1528882832;
        jd.ahll[499] = 1084793816;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static PhobiaFiguraBridge.RenderPass[] createShaderHandsPasses(class_1921 var0) {
        var9_1 = jd.c;
        var8_2 /* !! */  = jd.b;
        var7_3 = jd.a;
        if (var9_1) {
            throw null;
lbl6:
            // 24 sources

            return null;
        }
        if (var7_3) ** GOTO lbl6
        if (var8_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_3) ** GOTO lbl6
                var1_4 = jn.getInstance();
                if (var7_3 || var7_3) ** GOTO lbl6
                if (var1_4 == null) ** GOTO lbl21
                if (var7_3) ** GOTO lbl6
                if (!var1_4.isState()) ** GOTO lbl21
                if (var7_3) ** GOTO lbl6
                if (var0.method_23033() == VertexFormat.class_5596.field_27382) ** GOTO lbl23
                if (var7_3) ** GOTO lbl6
lbl21:
                // 3 sources

                if (var7_3 || var7_3) ** GOTO lbl6
                return null;
lbl23:
                // 1 sources

                if (var7_3 || var7_3) ** GOTO lbl6
                var2_5 = oj.layerTextureOf(var0);
                if (var7_3 || var7_3) ** GOTO lbl6
                if (var2_5 != null) ** GOTO lbl29
                if (var7_3 || var7_3) ** GOTO lbl6
                return null;
lbl29:
                // 1 sources

                if (var7_3 || var7_3) ** GOTO lbl6
                var3_6 = jd.shaderPassLayout(var1_4);
                if (var7_3 || var7_3) ** GOTO lbl6
                var4_7 = jd.SHADER_PASS_CACHE.get(var0);
                if (var7_3 || var7_3) ** GOTO lbl6
                if (var4_7 == null) ** GOTO lbl38
                if (var7_3) ** GOTO lbl6
                if (var4_7.layout == var3_6) ** GOTO lbl44
                if (var7_3) ** GOTO lbl6
lbl38:
                // 2 sources

                if (var7_3 || var7_3) ** GOTO lbl6
                var4_7 = new jd$CachedShaderPasses(var3_6, jd.buildShaderHandsPasses(var1_4, var0, var2_5));
                if (var7_3 || var7_3) ** GOTO lbl6
                jd.SHADER_PASS_CACHE.put(var0, var4_7);
                if (var7_3) ** GOTO lbl6
lbl44:
                // 2 sources

                if (var7_3 || var7_3) ** GOTO lbl6
                var5_8 = var1_4.getRenderFrameSerial();
                if (var7_3 || var7_3) ** GOTO lbl6
                if (var4_7.updatedFrameSerial == var5_8) ** GOTO lbl53
                if (var7_3 || var7_3) ** GOTO lbl6
                jd.updateShaderHandsPasses(var1_4, var4_7.passes);
                if (var7_3 || var7_3) ** GOTO lbl6
                var4_7.updatedFrameSerial = var5_8;
                if (var7_3) ** GOTO lbl6
lbl53:
                // 2 sources

                if (!var7_3 && !var7_3) ** break;
                ** continue;
                return var4_7.passes;
            }
            case 0: {
                var8_2 /* !! */  = (int)jd.ahlm("ahtp", ahlj(int ), (int)119);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl80
            }
lbl61:
            // 4 sources

            case 1: {
                var8_2 /* !! */  = (int)jd.ahlm("ahtq", ahlj(int ), (int)120);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl80
            }
lbl66:
            // 3 sources

            case 2: {
                var8_2 /* !! */  = (int)jd.ahlm("ahtr", ahlj(int ), (int)121);
                if (!var9_1) ** GOTO lbl61
                throw null;
            }
            case 3: {
                var8_2 /* !! */  = (int)jd.ahlm("ahts", ahlj(int ), (int)122);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 4: {
                var8_2 /* !! */  = (int)jd.ahlm("ahtt", ahlj(int ), (int)123);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl80:
            // 4 sources

            case 5: {
                var8_2 /* !! */  = (int)jd.ahlm("ahtv", ahlj(int ), (int)124);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl85:
            // 2 sources

            case 6: {
                var8_2 /* !! */  = (int)jd.ahlm("ahtw", ahlj(int ), (int)125);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl231
            }
            case 7: {
                var8_2 /* !! */  = (int)jd.ahlm("ahtx", ahlj(int ), (int)126);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl95:
            // 4 sources

            case 8: {
                var8_2 /* !! */  = (int)jd.ahlm("ahty", ahlj(int ), (int)127);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl123
            }
            case 9: {
                var8_2 /* !! */  = (int)jd.ahlm("ahtz", ahlj(int ), (int)128);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 10: {
                var8_2 /* !! */  = (int)jd.ahlm("ahua", ahlj(int ), (int)129);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl110:
            // 2 sources

            case 11: {
                var8_2 /* !! */  = (int)jd.ahlm("ahub", ahlj(int ), (int)130);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl115:
            // 2 sources

            case 12: {
                var8_2 /* !! */  = (int)jd.ahlm("ahuc", ahlj(int ), (int)131);
                if (!var9_1) ** GOTO lbl110
                throw null;
            }
            case 13: {
                var8_2 /* !! */  = (int)jd.ahlm("ahud", ahlj(int ), (int)132);
                if (var9_1) {
                    throw null;
                }
            }
lbl123:
            // 6 sources

            case 14: {
                var8_2 /* !! */  = (int)jd.ahlm("ahue", ahlj(int ), (int)133);
                if (!var9_1) ** GOTO lbl95
                throw null;
            }
            case 15: {
                var8_2 /* !! */  = (int)jd.ahlm("ahuf", ahlj(int ), (int)134);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 16: {
                var8_2 /* !! */  = (int)jd.ahlm("ahug", ahlj(int ), (int)135);
                if (!var9_1) ** GOTO lbl85
                throw null;
            }
lbl136:
            // 2 sources

            case 17: {
                var8_2 /* !! */  = (int)jd.ahlm("ahuh", ahlj(int ), (int)136);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl194
            }
            case 18: {
                var8_2 /* !! */  = (int)jd.ahlm("ahui", ahlj(int ), (int)137);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl194
            }
lbl146:
            // 2 sources

            case 19: {
                var8_2 /* !! */  = (int)jd.ahlm("ahuj", ahlj(int ), (int)138);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl151:
            // 2 sources

            case 20: {
                var8_2 /* !! */  = (int)jd.ahlm("ahuk", ahlj(int ), (int)139);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl156:
            // 2 sources

            case 21: {
                var8_2 /* !! */  = (int)jd.ahlm("ahul", ahlj(int ), (int)140);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl161:
            // 2 sources

            case 22: {
                var8_2 /* !! */  = (int)jd.ahlm("ahum", ahlj(int ), (int)141);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 23: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_2 /* !! */  = (int)jd.ahlm("ahun", ahlj(int ), (int)142);
                    if (!var9_1) ** GOTO lbl95
                    throw null;
                }
            }
            case 24: {
                var8_2 /* !! */  = (int)jd.ahlm("ahuo", ahlj(int ), (int)143);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl176:
            // 2 sources

            case 25: {
                var8_2 /* !! */  = (int)jd.ahlm("ahup", ahlj(int ), (int)144);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl181:
            // 2 sources

            case 26: {
                var8_2 /* !! */  = (int)jd.ahlm("ahuq", ahlj(int ), (int)145);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl215
            }
            case 27: {
                var8_2 /* !! */  = (int)jd.ahlm("ahur", ahlj(int ), (int)146);
                if (!var9_1) ** GOTO lbl181
                throw null;
            }
lbl190:
            // 4 sources

            case 28: {
                var8_2 /* !! */  = (int)jd.ahlm("ahus", ahlj(int ), (int)147);
                if (!var9_1) ** GOTO lbl95
                throw null;
            }
lbl194:
            // 4 sources

            case 29: {
                var8_2 /* !! */  = (int)jd.ahlm("ahut", ahlj(int ), (int)148);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl215
            }
            case 30: {
                var8_2 /* !! */  = (int)jd.ahlm("ahuu", ahlj(int ), (int)149);
                if (!var9_1) ** GOTO lbl115
                throw null;
            }
            case 31: {
                var8_2 /* !! */  = (int)jd.ahlm("ahuv", ahlj(int ), (int)150);
                if (!var9_1) ** GOTO lbl190
                throw null;
            }
lbl207:
            // 2 sources

            case 32: {
                var8_2 /* !! */  = (int)jd.ahlm("ahuw", ahlj(int ), (int)151);
                if (!var9_1) ** GOTO lbl66
                throw null;
            }
            case 33: {
                var8_2 /* !! */  = (int)jd.ahlm("ahux", ahlj(int ), (int)152);
                if (!var9_1) ** GOTO lbl66
                throw null;
            }
lbl215:
            // 3 sources

            case 34: {
                var8_2 /* !! */  = (int)jd.ahlm("ahuy", ahlj(int ), (int)153);
                if (!var9_1) ** GOTO lbl194
                throw null;
            }
lbl219:
            // 3 sources

            case 35: {
                var8_2 /* !! */  = (int)jd.ahlm("ahuz", ahlj(int ), (int)154);
                if (var9_1) {
                    throw null;
                }
            }
lbl223:
            // 4 sources

            case 36: {
                var8_2 /* !! */  = (int)jd.ahlm("ahva", ahlj(int ), (int)155);
                if (!var9_1) ** GOTO lbl80
                throw null;
            }
lbl227:
            // 2 sources

            case 37: {
                var8_2 /* !! */  = (int)jd.ahlm("ahvb", ahlj(int ), (int)156);
                if (!var9_1) ** GOTO lbl61
                throw null;
            }
lbl231:
            // 2 sources

            case 38: {
                do {
                    var8_2 /* !! */  = (int)jd.ahlm("ahvc", ahlj(int ), (int)157);
                } while (!var9_1);
                throw null;
            }
            case 39: {
                var8_2 /* !! */  = (int)jd.ahlm("ahvd", ahlj(int ), (int)158);
                if (!var9_1) ** GOTO lbl61
                throw null;
            }
            case 40: {
                var8_2 /* !! */  = (int)jd.ahlm("ahve", ahlj(int ), (int)159);
                if (!var9_1) ** GOTO lbl123
                throw null;
            }
            case 41: 
        }
        var8_2 /* !! */  = (int)jd.ahlm("ahvf", ahlj(int ), (int)160);
        ** while (!var9_1)
lbl247:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    private Path prepareAvatar(jd$EmbeddedAvatar var1_1) throws IOException, NoSuchAlgorithmException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 6[CASE]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static PhobiaFiguraBridge.RenderPass[] createShaderEspPasses(class_1297 var0, class_1921 var1_1) {
        v0 /* !! */  = jd.bz;
        if (true) ** GOTO lbl5
        block71: while (true) {
            v0 /* !! */  = (long)(v1 - jd.ahlm("ahqs", ahlx(int ), (int)46));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2053357414: {
                    break block71;
                }
                case -722122790: {
                    v1 = jd.ahlm("ahqt", ahlx(int ), (int)47);
                    continue block71;
                }
                case -81842840: {
                    v1 = jd.ahlm("ahqu", ahlx(int ), (int)48);
                    continue block71;
                }
                case 1698263212: {
                    v1 = jd.ahlm("ahqv", ahlx(int ), (int)49);
                    continue block71;
                }
            }
            break;
        }
        var8_2 = jd.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jd.bz - jd.ahlm("ahqw", ahlx(int ), (int)50)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jd.ahlm("ahqx", ahlj(int ), (int)79)) break;
            v2 /* !! */  = (long)jd.ahlm("ahqy", ahlj(int ), (int)80);
        }
        var7_3 /* !! */  = jd.b;
        v3 /* !! */  = jd.bz;
        if (true) ** GOTO lbl28
        block73: while (true) {
            v3 /* !! */  = (long)(v4 - jd.ahlm("ahqz", ahlx(int ), (int)51));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2053357414: {
                    break block73;
                }
                case -1034475536: {
                    v4 = jd.ahlm("ahrb", ahlx(int ), (int)52);
                    continue block73;
                }
                case -535451627: {
                    v4 = jd.ahlm("ahrc", ahlx(int ), (int)53);
                    continue block73;
                }
                case 82084727: {
                    v4 = jd.ahlm("ahrd", ahlx(int ), (int)54);
                    continue block73;
                }
            }
            break;
        }
        var6_4 = jd.a;
        if (var8_2) {
            throw null;
lbl43:
            // 15 sources

            return null;
        }
        if (var6_4 || var6_4) ** GOTO lbl43
        v5 /* !! */  = jd.bz;
        if (true) ** GOTO lbl50
        block75: while (true) {
            v5 /* !! */  = (long)(v6 - jd.ahlm("ahre", ahlx(int ), (int)55));
lbl50:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -2053357414: {
                    break block75;
                }
                case -1942587860: {
                    v6 = jd.ahlm("ahrf", ahlx(int ), (int)56);
                    continue block75;
                }
                case 864331823: {
                    v6 = jd.ahlm("ahrg", ahlx(int ), (int)57);
                    continue block75;
                }
                case 1572265933: {
                    v6 = jd.ahlm("ahrh", ahlx(int ), (int)58);
                    continue block75;
                }
            }
            break;
        }
        var2_5 = jm.getInstance();
        if (var6_4 || var6_4) ** GOTO lbl43
        if (!(var0 instanceof class_11890)) ** GOTO lbl112
        if (var6_4) ** GOTO lbl43
        var3_6 = (class_11890)var0;
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4 || var6_4) ** GOTO lbl43
                if (var2_5 == null) ** GOTO lbl112
                if (var6_4) ** GOTO lbl43
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = jd.bz - jd.ahlm("ahri", ahlx(int ), (int)59)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == jd.ahlm("ahrj", ahlj(int ), (int)81)) break;
                    v7 /* !! */  = (long)jd.ahlm("ahrk", ahlj(int ), (int)82);
                }
                if (!var2_5.isState()) ** GOTO lbl112
                if (var6_4) ** GOTO lbl43
                v8 /* !! */  = jd.bz;
                if (true) ** GOTO lbl84
                block77: while (true) {
                    v8 /* !! */  = (long)(jd.ahlm("ahrn", ahlx(int ), (int)61) - jd.ahlm("ahrl", ahlx(int ), (int)60));
lbl84:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -2053357414: {
                            break block77;
                        }
                        case -74321342: {
                            continue block77;
                        }
                    }
                    break;
                }
                if (!var2_5.shouldOutline(var3_6)) ** GOTO lbl112
                if (var6_4) ** GOTO lbl43
                v9 /* !! */  = jd.bz;
                if (true) ** GOTO lbl95
                block78: while (true) {
                    v9 /* !! */  = (long)(v10 - jd.ahlm("ahro", ahlx(int ), (int)62));
lbl95:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2053357414: {
                            break block78;
                        }
                        case 92324233: {
                            v10 = jd.ahlm("ahrp", ahlx(int ), (int)63);
                            continue block78;
                        }
                        case 838791912: {
                            v10 = jd.ahlm("ahrq", ahlx(int ), (int)64);
                            continue block78;
                        }
                    }
                    break;
                }
                v11 = var1_1.method_23033();
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_2 = jd.bz - jd.ahlm("ahrr", ahlx(int ), (int)65)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == jd.ahlm("ahrs", ahlj(int ), (int)83)) break;
                    v12 /* !! */  = (long)jd.ahlm("ahrt", ahlj(int ), (int)84);
                }
                if (v11 == VertexFormat.class_5596.field_27382) ** GOTO lbl114
                if (var6_4) ** GOTO lbl43
lbl112:
                // 5 sources

                if (var6_4 || var6_4) ** GOTO lbl43
                return null;
lbl114:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl43
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = jd.bz - jd.ahlm("ahru", ahlx(int ), (int)66)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == jd.ahlm("ahrv", ahlj(int ), (int)85)) break;
                    v13 /* !! */  = (long)jd.ahlm("ahrw", ahlj(int ), (int)86);
                }
                var4_7 = oj.layerTextureOf(var1_1);
                if (var6_4 || var6_4) ** GOTO lbl43
                if (var4_7 != null) ** GOTO lbl125
                if (var6_4 || var6_4) ** GOTO lbl43
                return null;
lbl125:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl43
                v14 /* !! */  = jd.bz;
                if (true) ** GOTO lbl130
                block81: while (true) {
                    v14 /* !! */  = (long)(v15 - jd.ahlm("ahrx", ahlx(int ), (int)67));
lbl130:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -2053357414: {
                            break block81;
                        }
                        case 304704302: {
                            v15 = jd.ahlm("ahry", ahlx(int ), (int)68);
                            continue block81;
                        }
                        case 1224371923: {
                            v15 = jd.ahlm("ahrz", ahlx(int ), (int)69);
                            continue block81;
                        }
                    }
                    break;
                }
                v16 /* !! */  = jd.bz;
                if (true) ** GOTO lbl143
                block82: while (true) {
                    v16 /* !! */  = (long)(jd.ahlm("ahsb", ahlx(int ), (int)71) - jd.ahlm("ahsa", ahlx(int ), (int)70));
lbl143:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -2053357414: {
                            break block82;
                        }
                        case 775659459: {
                            continue block82;
                        }
                    }
                    break;
                }
                v17 = (Function<class_1921, PhobiaFiguraBridge.RenderPass[]>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$createShaderEspPasses$0(net.minecraft.class_2960 ruhack.phobia.jm net.minecraft.class_1921 ), (Lnet/minecraft/class_1921;)[Lorg/figuramc/figura/utils/PhobiaFiguraBridge$RenderPass;)((class_2960)var4_7, (jm)var2_5);
                v18 /* !! */  = jd.bz;
                if (true) ** GOTO lbl153
                block83: while (true) {
                    v18 /* !! */  = (long)(v19 - jd.ahlm("ahsc", ahlx(int ), (int)72));
lbl153:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -2053357414: {
                            break block83;
                        }
                        case 1361082205: {
                            v19 = jd.ahlm("ahsd", ahlx(int ), (int)73);
                            continue block83;
                        }
                        case 2116357417: {
                            v19 = jd.ahlm("ahse", ahlx(int ), (int)74);
                            continue block83;
                        }
                    }
                    break;
                }
                var5_8 = jd.SHADER_ESP_PASS_CACHE.computeIfAbsent(var1_1, v17);
                if (var6_4 || var6_4) ** GOTO lbl43
                v20 = var5_8[1];
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_4 = jd.bz - jd.ahlm("ahsf", ahlx(int ), (int)75)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == jd.ahlm("ahsg", ahlj(int ), (int)87)) break;
                    v21 /* !! */  = (long)jd.ahlm("ahsh", ahlj(int ), (int)88);
                }
                v22 = var2_5.getOutlineColor();
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_5 = jd.bz - jd.ahlm("ahsi", ahlx(int ), (int)76)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == jd.ahlm("ahsj", ahlj(int ), (int)89)) break;
                    v23 /* !! */  = (long)jd.ahlm("ahsk", ahlj(int ), (int)90);
                }
                v20.setColor(v22);
                if (!var6_4 && !var6_4) ** break;
                ** continue;
                return var5_8;
            }
            case 0: {
                var7_3 /* !! */  = (int)jd.ahlm("ahsl", ahlj(int ), (int)91);
                if (var8_2) {
                    throw null;
                }
            }
lbl184:
            // 7 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)jd.ahlm("ahsm", ahlj(int ), (int)92);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl280
                    break;
                }
            }
            case 2: {
                var7_3 /* !! */  = (int)jd.ahlm("ahsn", ahlj(int ), (int)93);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 3: {
                var7_3 /* !! */  = (int)jd.ahlm("ahso", ahlj(int ), (int)94);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 4: {
                var7_3 /* !! */  = (int)jd.ahlm("ahsp", ahlj(int ), (int)95);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl205:
            // 2 sources

            case 5: {
                var7_3 /* !! */  = (int)jd.ahlm("ahsr", ahlj(int ), (int)96);
                if (!var8_2) break;
                throw null;
            }
lbl209:
            // 2 sources

            case 6: {
                var7_3 /* !! */  = (int)jd.ahlm("ahss", ahlj(int ), (int)97);
                if (!var8_2) ** GOTO lbl184
                throw null;
            }
            case 7: {
                var7_3 /* !! */  = (int)jd.ahlm("ahst", ahlj(int ), (int)98);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl292
            }
            case 8: {
                do {
                    var7_3 /* !! */  = (int)jd.ahlm("ahsu", ahlj(int ), (int)99);
                } while (!var8_2);
                throw null;
            }
lbl223:
            // 3 sources

            case 9: {
                var7_3 /* !! */  = (int)jd.ahlm("ahsv", ahlj(int ), (int)100);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl242
            }
            case 10: {
                var7_3 /* !! */  = (int)jd.ahlm("ahsw", ahlj(int ), (int)101);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl238
            }
            case 11: {
                var7_3 /* !! */  = (int)jd.ahlm("ahsx", ahlj(int ), (int)102);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl238:
            // 4 sources

            case 12: {
                var7_3 /* !! */  = (int)jd.ahlm("ahsy", ahlj(int ), (int)103);
                if (!var8_2) ** GOTO lbl184
                throw null;
            }
lbl242:
            // 3 sources

            case 13: {
                var7_3 /* !! */  = (int)jd.ahlm("ahsz", ahlj(int ), (int)104);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl268
            }
            case 14: {
                var7_3 /* !! */  = (int)jd.ahlm("ahta", ahlj(int ), (int)105);
                if (!var8_2) ** GOTO lbl184
                throw null;
            }
lbl251:
            // 3 sources

            case 15: {
                var7_3 /* !! */  = (int)jd.ahlm("ahtb", ahlj(int ), (int)106);
                if (!var8_2) ** GOTO lbl209
                throw null;
            }
            case 16: {
                do {
                    var7_3 /* !! */  = (int)jd.ahlm("ahtc", ahlj(int ), (int)107);
                } while (!var8_2);
                throw null;
            }
            case 17: {
                var7_3 /* !! */  = (int)jd.ahlm("ahtd", ahlj(int ), (int)108);
                if (!var8_2) ** GOTO lbl251
                throw null;
            }
lbl264:
            // 2 sources

            case 18: {
                var7_3 /* !! */  = (int)jd.ahlm("ahte", ahlj(int ), (int)109);
                if (!var8_2) ** GOTO lbl238
                throw null;
            }
lbl268:
            // 2 sources

            case 19: {
                var7_3 /* !! */  = (int)jd.ahlm("ahtf", ahlj(int ), (int)110);
                if (!var8_2) ** GOTO lbl184
                throw null;
            }
            case 20: {
                var7_3 /* !! */  = (int)jd.ahlm("ahth", ahlj(int ), (int)111);
                if (var8_2) {
                    throw null;
                }
            }
lbl276:
            // 4 sources

            case 21: {
                var7_3 /* !! */  = (int)jd.ahlm("ahti", ahlj(int ), (int)112);
                if (var8_2) {
                    throw null;
                }
            }
lbl280:
            // 4 sources

            case 22: {
                var7_3 /* !! */  = (int)jd.ahlm("ahtj", ahlj(int ), (int)113);
                if (!var8_2) ** GOTO lbl264
                throw null;
            }
lbl284:
            // 2 sources

            case 23: {
                var7_3 /* !! */  = (int)jd.ahlm("ahtk", ahlj(int ), (int)114);
                if (!var8_2) ** GOTO lbl205
                throw null;
            }
            case 24: {
                var7_3 /* !! */  = (int)jd.ahlm("ahtl", ahlj(int ), (int)115);
                if (!var8_2) ** GOTO lbl223
                throw null;
            }
lbl292:
            // 2 sources

            case 25: {
                var7_3 /* !! */  = (int)jd.ahlm("ahtm", ahlj(int ), (int)116);
                if (!var8_2) ** GOTO lbl238
                throw null;
            }
            case 26: {
                var7_3 /* !! */  = (int)jd.ahlm("ahtn", ahlj(int ), (int)117);
                if (!var8_2) ** GOTO lbl284
                throw null;
            }
            case 27: 
        }
        var7_3 /* !! */  = (int)jd.ahlm("ahto", ahlj(int ), (int)118);
        ** while (!var8_2)
lbl303:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite ahlm(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ PhobiaFiguraBridge.RenderPass[] lambda$buildShaderHandsPasses$3(int var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jd.bz - jd.ahlm("aizw", ahlx(int ), (int)301)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jd.ahlm("aizx", ahlj(int ), (int)732)) break;
            v0 /* !! */  = (long)jd.ahlm("aizy", ahlj(int ), (int)733);
        }
        var3_1 = jd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jd.bz - jd.ahlm("aizz", ahlx(int ), (int)302)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jd.ahlm("ajaa", ahlj(int ), (int)734)) break;
            v1 /* !! */  = (long)jd.ahlm("ajab", ahlj(int ), (int)735);
        }
        var2_2 /* !! */  = jd.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = jd.bz - jd.ahlm("ajac", ahlx(int ), (int)303)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jd.ahlm("ajad", ahlj(int ), (int)736)) break;
            v2 /* !! */  = (long)jd.ahlm("ajae", ahlj(int ), (int)737);
        }
        var1_3 = jd.a;
        if (!var3_1) ** GOTO lbl28
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl28:
                // 1 sources

                if (var1_3 || var1_3) continue block9;
                return new PhobiaFiguraBridge.RenderPass[var0];
lbl30:
                // 2 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)jd.ahlm("ajaf", ahlj(int ), (int)738);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl40
                        break;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)jd.ahlm("ajag", ahlj(int ), (int)739);
                    if (!var3_1) break block9;
                    throw null;
                }
lbl40:
                // 2 sources

                case 2: {
                    var2_2 /* !! */  = (int)jd.ahlm("ajah", ahlj(int ), (int)740);
                    if (!var3_1) ** GOTO lbl30
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)jd.ahlm("ajai", ahlj(int ), (int)741);
        ** while (!var3_1)
lbl47:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void clearAppliedFriendModels() {
        v0 /* !! */  = jd.bz;
        if (true) ** GOTO lbl5
        block45: while (true) {
            v0 /* !! */  = (long)(v1 - jd.ahlm("aiot", ahlx(int ), (int)227));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2053357414: {
                    break block45;
                }
                case -1749716958: {
                    v1 = jd.ahlm("aiou", ahlx(int ), (int)228);
                    continue block45;
                }
                case -834659966: {
                    v1 = jd.ahlm("aiov", ahlx(int ), (int)229);
                    continue block45;
                }
                case 31545935: {
                    v1 = jd.ahlm("aiow", ahlx(int ), (int)230);
                    continue block45;
                }
            }
            break;
        }
        var5_1 = jd.c;
        v2 /* !! */  = jd.bz;
        if (true) ** GOTO lbl22
        block46: while (true) {
            v2 /* !! */  = (long)(jd.ahlm("aioy", ahlx(int ), (int)232) - jd.ahlm("aiox", ahlx(int ), (int)231));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2053357414: {
                    break block46;
                }
                case 372039056: {
                    continue block46;
                }
            }
            break;
        }
        var4_2 /* !! */  = jd.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = jd.bz - jd.ahlm("aioz", ahlx(int ), (int)233)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jd.ahlm("aipa", ahlj(int ), (int)517)) break;
            v3 /* !! */  = (long)jd.ahlm("aipb", ahlj(int ), (int)518);
        }
        var3_3 = jd.a;
        if (var5_1) {
            throw null;
lbl36:
            // 9 sources

            return;
        }
        if (var3_3 || var3_3) ** GOTO lbl36
        v4 /* !! */  = jd.bz;
        if (true) ** GOTO lbl43
        block49: while (true) {
            v4 /* !! */  = (long)(v5 - jd.ahlm("aipc", ahlx(int ), (int)234));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2053357414: {
                    break block49;
                }
                case -2037613115: {
                    v5 = jd.ahlm("aipd", ahlx(int ), (int)235);
                    continue block49;
                }
                case 1047566448: {
                    v5 = jd.ahlm("aipe", ahlx(int ), (int)236);
                    continue block49;
                }
            }
            break;
        }
        v6 /* !! */  = jd.bz;
        if (true) ** GOTO lbl56
        block50: while (true) {
            v6 /* !! */  = (long)(v7 - jd.ahlm("aipf", ahlx(int ), (int)237));
lbl56:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -2053357414: {
                    break block50;
                }
                case -592096265: {
                    v7 = jd.ahlm("aipg", ahlx(int ), (int)238);
                    continue block50;
                }
                case 1217118908: {
                    v7 = jd.ahlm("aiph", ahlx(int ), (int)239);
                    continue block50;
                }
            }
            break;
        }
        var1_4 = this.appliedFriends.iterator();
        if (var3_3) ** GOTO lbl36
        block51: while (true) {
            if (var3_3 || var3_3) ** GOTO lbl36
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_1 = jd.bz - jd.ahlm("aipi", ahlx(int ), (int)240)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == jd.ahlm("aipj", ahlj(int ), (int)519)) break;
                v8 /* !! */  = (long)jd.ahlm("aipk", ahlj(int ), (int)520);
            }
            if (!var1_4.hasNext()) ** GOTO lbl96
            if (var3_3) ** GOTO lbl36
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_2 = jd.bz - jd.ahlm("aipl", ahlx(int ), (int)241)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == jd.ahlm("aipm", ahlj(int ), (int)521)) break;
                v9 /* !! */  = (long)jd.ahlm("aipn", ahlj(int ), (int)522);
            }
            var2_5 = var1_4.next();
            if (var3_3 || var3_3) ** GOTO lbl36
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_3 = jd.bz - jd.ahlm("aipo", ahlx(int ), (int)242)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == jd.ahlm("aipp", ahlj(int ), (int)523)) break;
                v10 /* !! */  = (long)jd.ahlm("aipq", ahlj(int ), (int)524);
            }
            AvatarManager.clearAvatars((UUID)var2_5);
            if (var3_3) ** GOTO lbl36
            if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var4_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var3_3) ** GOTO lbl36
                    if (!var5_1) continue block51;
                    throw null;
                }
lbl96:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl36
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = jd.bz - jd.ahlm("aipr", ahlx(int ), (int)243)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == jd.ahlm("aips", ahlj(int ), (int)525)) break;
                    v11 /* !! */  = (long)jd.ahlm("aipt", ahlj(int ), (int)526);
                }
                v12 /* !! */  = jd.bz;
                if (true) ** GOTO lbl106
                block56: while (true) {
                    v12 /* !! */  = (long)(v13 - jd.ahlm("aipu", ahlx(int ), (int)244));
lbl106:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -2053357414: {
                            break block56;
                        }
                        case -173256897: {
                            v13 = jd.ahlm("aipv", ahlx(int ), (int)245);
                            continue block56;
                        }
                        case 364198998: {
                            v13 = jd.ahlm("aipw", ahlx(int ), (int)246);
                            continue block56;
                        }
                        case 1599114428: {
                            v13 = jd.ahlm("aipx", ahlx(int ), (int)247);
                            continue block56;
                        }
                    }
                    break;
                }
                this.appliedFriends.clear();
                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return;
                case 0: {
                    var4_2 /* !! */  = (int)jd.ahlm("aipy", ahlj(int ), (int)527);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl141
                }
lbl127:
                // 2 sources

                case 1: {
                    var4_2 /* !! */  = (int)jd.ahlm("aipz", ahlj(int ), (int)528);
                    if (!var5_1) break block51;
                    throw null;
                }
lbl131:
                // 2 sources

                case 2: {
                    var4_2 /* !! */  = (int)jd.ahlm("aiqa", ahlj(int ), (int)529);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl141
                }
lbl136:
                // 2 sources

                case 3: {
                    var4_2 /* !! */  = (int)jd.ahlm("aiqb", ahlj(int ), (int)530);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl190
                }
lbl141:
                // 3 sources

                case 4: {
                    var4_2 /* !! */  = (int)jd.ahlm("aiqc", ahlj(int ), (int)531);
                    if (!var5_1) ** GOTO lbl136
                    throw null;
                }
                case 5: {
                    var4_2 /* !! */  = (int)jd.ahlm("aiqd", ahlj(int ), (int)532);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl186
                }
                case 6: {
                    var4_2 /* !! */  = (int)jd.ahlm("aiqe", ahlj(int ), (int)533);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl160
                }
                case 7: {
                    var4_2 /* !! */  = (int)jd.ahlm("aiqf", ahlj(int ), (int)534);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl165
                }
lbl160:
                // 3 sources

                case 8: {
                    var4_2 /* !! */  = (int)jd.ahlm("aiqg", ahlj(int ), (int)535);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl173
                }
lbl165:
                // 4 sources

                case 9: {
                    var4_2 /* !! */  = (int)jd.ahlm("aiqh", ahlj(int ), (int)536);
                    if (!var5_1) ** GOTO lbl127
                    throw null;
                }
                case 10: {
                    var4_2 /* !! */  = (int)jd.ahlm("aiqi", ahlj(int ), (int)537);
                    if (var5_1) {
                        throw null;
                    }
                }
lbl173:
                // 4 sources

                case 11: {
                    var4_2 /* !! */  = (int)jd.ahlm("aiqj", ahlj(int ), (int)538);
                    if (!var5_1) ** GOTO lbl165
                    throw null;
                }
                case 12: {
                    var4_2 /* !! */  = (int)jd.ahlm("aiqk", ahlj(int ), (int)539);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl186
                }
                case 13: {
                    var4_2 /* !! */  = (int)jd.ahlm("aiql", ahlj(int ), (int)540);
                    if (!var5_1) ** GOTO lbl131
                    throw null;
                }
lbl186:
                // 3 sources

                case 14: {
                    var4_2 /* !! */  = (int)jd.ahlm("aiqm", ahlj(int ), (int)541);
                    if (!var5_1) ** GOTO lbl160
                    throw null;
                }
lbl190:
                // 2 sources

                case 15: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var4_2 /* !! */  = (int)jd.ahlm("aiqn", ahlj(int ), (int)542);
                        if (!var5_1) ** GOTO lbl165
                        throw null;
                    }
                }
                case 16: 
            }
            break;
        }
        var4_2 /* !! */  = (int)jd.ahlm("aiqo", ahlj(int ), (int)543);
        ** while (!var5_1)
lbl198:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ajef() {
        jd.ahlk[300] = -399799186;
        jd.ahlk[301] = -318140449;
        jd.ahlk[302] = -1479666995;
        jd.ahlk[303] = 220333055;
        jd.ahlk[304] = -224884464;
        jd.ahlk[305] = -736456797;
        jd.ahlk[306] = -1099222265;
        jd.ahlk[307] = 595946325;
        jd.ahlk[308] = 876425513;
        jd.ahlk[309] = 606686287;
        jd.ahlk[310] = -234350616;
        jd.ahlk[311] = -70484376;
        jd.ahlk[312] = 686767217;
        jd.ahlk[313] = 1420756778;
        jd.ahlk[314] = -1159600927;
        jd.ahlk[315] = 1381529070;
        jd.ahlk[316] = -593331678;
        jd.ahlk[317] = -1615860076;
        jd.ahlk[318] = 1333362193;
        jd.ahlk[319] = 1598909115;
        jd.ahlk[320] = 1888201991;
        jd.ahlk[321] = 2127533551;
        jd.ahlk[322] = -297569533;
        jd.ahlk[323] = 1737552468;
        jd.ahlk[324] = -271259041;
        jd.ahlk[325] = 367143538;
        jd.ahlk[326] = 1051200773;
        jd.ahlk[327] = 1142539573;
        jd.ahlk[328] = 1428390885;
        jd.ahlk[329] = 727235052;
        jd.ahlk[330] = -1277988716;
        jd.ahlk[331] = 1023661304;
        jd.ahlk[332] = 1955981658;
        jd.ahlk[333] = -1118893257;
        jd.ahlk[334] = -742723906;
        jd.ahlk[335] = -1994098996;
        jd.ahlk[336] = -342534626;
        jd.ahlk[337] = 1841371100;
        jd.ahlk[338] = -892349679;
        jd.ahlk[339] = 1583469463;
        jd.ahlk[340] = 2131892722;
        jd.ahlk[341] = -1253612123;
        jd.ahlk[342] = -741438000;
        jd.ahlk[343] = 26723990;
        jd.ahlk[344] = 1616642956;
        jd.ahlk[345] = 1943562485;
        jd.ahlk[346] = 1315995500;
        jd.ahlk[347] = -690891603;
        jd.ahlk[348] = 770148906;
        jd.ahlk[349] = 1881547690;
        jd.ahlk[350] = 1175379687;
        jd.ahlk[351] = -388674845;
        jd.ahlk[352] = 1721913873;
        jd.ahlk[353] = 2037558472;
        jd.ahlk[354] = -1344685910;
        jd.ahlk[355] = -1152818014;
        jd.ahlk[356] = -768680712;
        jd.ahlk[357] = 660112266;
        jd.ahlk[358] = -1891597321;
        jd.ahlk[359] = -169858600;
        jd.ahlk[360] = 1335221799;
        jd.ahlk[361] = -268241770;
        jd.ahlk[362] = 1106676169;
        jd.ahlk[363] = 813771317;
        jd.ahlk[364] = 1202755869;
        jd.ahlk[365] = -1931106569;
        jd.ahlk[366] = -1424497986;
        jd.ahlk[367] = 1565466891;
        jd.ahlk[368] = 786120087;
        jd.ahlk[369] = -1327499677;
        jd.ahlk[370] = -1818548476;
        jd.ahlk[371] = 1828163591;
        jd.ahlk[372] = -413413512;
        jd.ahlk[373] = -295414631;
        jd.ahlk[374] = -874951323;
        jd.ahlk[375] = 1936633320;
        jd.ahlk[376] = -1309106100;
        jd.ahlk[377] = 1017062994;
        jd.ahlk[378] = -1433123762;
        jd.ahlk[379] = -1955124970;
        jd.ahlk[380] = 600129441;
        jd.ahlk[381] = 1267611;
        jd.ahlk[382] = -1874784401;
        jd.ahlk[383] = -1487336721;
        jd.ahlk[384] = -564438966;
        jd.ahlk[385] = -171531410;
        jd.ahlk[386] = 2130233377;
        jd.ahlk[387] = -1825199012;
        jd.ahlk[388] = 1549539873;
        jd.ahlk[389] = -816287471;
        jd.ahlk[390] = 125705230;
        jd.ahlk[391] = -720893485;
        jd.ahlk[392] = 787999804;
        jd.ahlk[393] = -152879607;
        jd.ahlk[394] = -728714778;
        jd.ahlk[395] = -892030531;
        jd.ahlk[396] = -1088851646;
        jd.ahlk[397] = 249271097;
        jd.ahlk[398] = -1020586636;
        jd.ahlk[399] = 1173372240;
    }

    /*
     * Exception decompiling
     */
    private void loadSelected() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[CASE]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void ajes() {
        jd.ahly[0] = 805338012153666547L;
        jd.ahly[1] = 5152157048287885558L;
        jd.ahly[2] = -6688885795184279940L;
        jd.ahly[3] = 679934005626568147L;
        jd.ahly[4] = 8970390876733626764L;
        jd.ahly[5] = 7593813392545863717L;
        jd.ahly[6] = 6562297443274421705L;
        jd.ahly[7] = -1951742466175952131L;
        jd.ahly[8] = -39480953873381869L;
        jd.ahly[9] = -1029373650539370668L;
        jd.ahly[10] = -4163905006906305690L;
        jd.ahly[11] = 8562368078971575911L;
        jd.ahly[12] = -8724926767610358048L;
        jd.ahly[13] = -4054424921540375888L;
        jd.ahly[14] = 3506959987151778009L;
        jd.ahly[15] = -8616133815342450210L;
        jd.ahly[16] = 4207311728843017464L;
        jd.ahly[17] = -2943869516299895028L;
        jd.ahly[18] = 718960014703147854L;
        jd.ahly[19] = 7320308051511856224L;
        jd.ahly[20] = 6859704716033830196L;
        jd.ahly[21] = -7979706374529826185L;
        jd.ahly[22] = 705525616923932619L;
        jd.ahly[23] = 6281704778284684705L;
        jd.ahly[24] = -8070828673922017292L;
        jd.ahly[25] = 6704231006222670176L;
        jd.ahly[26] = -496444763485867341L;
        jd.ahly[27] = -2346696427620341037L;
        jd.ahly[28] = -2844115644567826224L;
        jd.ahly[29] = -8135774981883003411L;
        jd.ahly[30] = -8786084768025865402L;
        jd.ahly[31] = -3011888604935722704L;
        jd.ahly[32] = 1460774542593831079L;
        jd.ahly[33] = -5607666834033761344L;
        jd.ahly[34] = 7736871212697745586L;
        jd.ahly[35] = 473295563462860887L;
        jd.ahly[36] = 9007705815327229992L;
        jd.ahly[37] = 4659430855547397495L;
        jd.ahly[38] = -6127355900785722657L;
        jd.ahly[39] = 5556540164991072160L;
        jd.ahly[40] = -8662215458135926818L;
        jd.ahly[41] = -6610885499387939237L;
        jd.ahly[42] = -5090109546876242609L;
        jd.ahly[43] = 2475029781630312205L;
        jd.ahly[44] = -3538914075017893315L;
        jd.ahly[45] = 6767499678420132575L;
        jd.ahly[46] = 6671393249539857186L;
        jd.ahly[47] = 4972982313790758461L;
        jd.ahly[48] = 7449856074677388869L;
        jd.ahly[49] = -3888694089968281071L;
        jd.ahly[50] = 3703735847743239903L;
        jd.ahly[51] = -8171036886897941267L;
        jd.ahly[52] = -3074414585562089791L;
        jd.ahly[53] = 6021751007859872297L;
        jd.ahly[54] = -1660268361811992733L;
        jd.ahly[55] = -3684484184700850105L;
        jd.ahly[56] = -8505206017272874656L;
        jd.ahly[57] = -8233382435685559996L;
        jd.ahly[58] = 2155742645580030433L;
        jd.ahly[59] = 2809555123909635141L;
        jd.ahly[60] = -2728301035070020633L;
        jd.ahly[61] = 7696125396579272718L;
        jd.ahly[62] = -8413238921371137982L;
        jd.ahly[63] = 3326115710527644514L;
        jd.ahly[64] = -7340610983672929727L;
        jd.ahly[65] = -4952833028564078848L;
        jd.ahly[66] = -2689552125198708654L;
        jd.ahly[67] = -931501688867182518L;
        jd.ahly[68] = 2092943270232159809L;
        jd.ahly[69] = 3541677531881300089L;
        jd.ahly[70] = -2119405412983470054L;
        jd.ahly[71] = 3018211215200513366L;
        jd.ahly[72] = 8880594881287983737L;
        jd.ahly[73] = 656686847198604714L;
        jd.ahly[74] = 2553122388961237174L;
        jd.ahly[75] = 9088820433118727150L;
        jd.ahly[76] = 3641322248427166257L;
        jd.ahly[77] = 4976525254060040711L;
        jd.ahly[78] = 332957484140696054L;
        jd.ahly[79] = 8218715674691314424L;
        jd.ahly[80] = 7906187625425764471L;
        jd.ahly[81] = 6407410207241214699L;
        jd.ahly[82] = -8871559453844108507L;
        jd.ahly[83] = -1436608916142963962L;
        jd.ahly[84] = 2052352785991997928L;
        jd.ahly[85] = 6427886825963088569L;
        jd.ahly[86] = 2134247989322901938L;
        jd.ahly[87] = 26046469710995785L;
        jd.ahly[88] = -5288713349644077593L;
        jd.ahly[89] = -8568254513957156170L;
        jd.ahly[90] = 7536581518042390423L;
        jd.ahly[91] = 7608001463111669604L;
        jd.ahly[92] = 4828993022870234417L;
        jd.ahly[93] = -2203939461608858058L;
        jd.ahly[94] = -8287744537243856465L;
        jd.ahly[95] = -1974699580554098264L;
        jd.ahly[96] = 891797768629679651L;
        jd.ahly[97] = 4762018089769225678L;
        jd.ahly[98] = -8607055586807454026L;
        jd.ahly[99] = -3276556486726095859L;
    }

    private static /* synthetic */ long ahlx(int n2) {
        return ahly[n2] ^ ahlz[n2];
    }

    private static /* synthetic */ void ajed() {
        jd.ahlk[100] = 1278954652;
        jd.ahlk[101] = 2059941137;
        jd.ahlk[102] = 1245141750;
        jd.ahlk[103] = -1033420681;
        jd.ahlk[104] = -55721121;
        jd.ahlk[105] = -1251697420;
        jd.ahlk[106] = -1184829208;
        jd.ahlk[107] = 814670587;
        jd.ahlk[108] = 1906093897;
        jd.ahlk[109] = -2143482821;
        jd.ahlk[110] = -27991061;
        jd.ahlk[111] = 2045401846;
        jd.ahlk[112] = 1739415275;
        jd.ahlk[113] = 610817245;
        jd.ahlk[114] = 1532828104;
        jd.ahlk[115] = -1462927584;
        jd.ahlk[116] = 105074633;
        jd.ahlk[117] = -810600606;
        jd.ahlk[118] = 64045354;
        jd.ahlk[119] = -1900829537;
        jd.ahlk[120] = -684361616;
        jd.ahlk[121] = 680611547;
        jd.ahlk[122] = 1171972734;
        jd.ahlk[123] = 1089868275;
        jd.ahlk[124] = 946423418;
        jd.ahlk[125] = -417149373;
        jd.ahlk[126] = -462391586;
        jd.ahlk[127] = -492359613;
        jd.ahlk[128] = -1305263223;
        jd.ahlk[129] = 425063385;
        jd.ahlk[130] = -1226139449;
        jd.ahlk[131] = 1253702643;
        jd.ahlk[132] = 1458083264;
        jd.ahlk[133] = -720545763;
        jd.ahlk[134] = 775135406;
        jd.ahlk[135] = 1645312088;
        jd.ahlk[136] = 1326173792;
        jd.ahlk[137] = 8550970;
        jd.ahlk[138] = -289192997;
        jd.ahlk[139] = 1284255047;
        jd.ahlk[140] = 1563606382;
        jd.ahlk[141] = 1281240460;
        jd.ahlk[142] = 2006779964;
        jd.ahlk[143] = -1092882068;
        jd.ahlk[144] = -865453463;
        jd.ahlk[145] = 546754505;
        jd.ahlk[146] = 446800221;
        jd.ahlk[147] = -113606292;
        jd.ahlk[148] = 1857559421;
        jd.ahlk[149] = -536713285;
        jd.ahlk[150] = -152007840;
        jd.ahlk[151] = 823111789;
        jd.ahlk[152] = 246073243;
        jd.ahlk[153] = -1261891099;
        jd.ahlk[154] = 1679324416;
        jd.ahlk[155] = 967191425;
        jd.ahlk[156] = -1310121941;
        jd.ahlk[157] = -473538131;
        jd.ahlk[158] = 1370116724;
        jd.ahlk[159] = -1302847883;
        jd.ahlk[160] = -357781785;
        jd.ahlk[161] = -529990407;
        jd.ahlk[162] = 1660743344;
        jd.ahlk[163] = 1360986938;
        jd.ahlk[164] = -498901619;
        jd.ahlk[165] = 266879763;
        jd.ahlk[166] = 553949245;
        jd.ahlk[167] = 11962542;
        jd.ahlk[168] = 1819865713;
        jd.ahlk[169] = 1541741846;
        jd.ahlk[170] = -2046002221;
        jd.ahlk[171] = 1244341669;
        jd.ahlk[172] = 397279561;
        jd.ahlk[173] = -1023683840;
        jd.ahlk[174] = -604461010;
        jd.ahlk[175] = 278861717;
        jd.ahlk[176] = 1668267409;
        jd.ahlk[177] = -1891159266;
        jd.ahlk[178] = -1450165296;
        jd.ahlk[179] = -1668908875;
        jd.ahlk[180] = 272123040;
        jd.ahlk[181] = -11301582;
        jd.ahlk[182] = -1386851382;
        jd.ahlk[183] = -984082795;
        jd.ahlk[184] = 1252915089;
        jd.ahlk[185] = -600284838;
        jd.ahlk[186] = -1078967663;
        jd.ahlk[187] = 1198120911;
        jd.ahlk[188] = -1500136654;
        jd.ahlk[189] = -132215650;
        jd.ahlk[190] = -945353453;
        jd.ahlk[191] = -1761516256;
        jd.ahlk[192] = 673570659;
        jd.ahlk[193] = -1525601549;
        jd.ahlk[194] = -1724018855;
        jd.ahlk[195] = 855250177;
        jd.ahlk[196] = -1108696198;
        jd.ahlk[197] = -1152304463;
        jd.ahlk[198] = -549289637;
        jd.ahlk[199] = 787988817;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$prepareAvatar$6(Path var0) {
        block25: {
            block24: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = jd.bz - jd.ahlm("aiwo", ahlx(int ), (int)261)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  == jd.ahlm("aiwp", ahlj(int ), (int)686)) break;
                    v0 /* !! */  = (long)jd.ahlm("aiwq", ahlj(int ), (int)687);
                }
                var3_1 = jd.c;
                v1 /* !! */  = jd.bz;
                if (true) ** GOTO lbl12
                block15: while (true) {
                    v1 /* !! */  = (long)(v2 - jd.ahlm("aiwr", ahlx(int ), (int)262));
lbl12:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -2053357414: {
                            break block15;
                        }
                        case -647627046: {
                            v2 = jd.ahlm("aiws", ahlx(int ), (int)263);
                            continue block15;
                        }
                        case -124816773: {
                            v2 = jd.ahlm("aiwt", ahlx(int ), (int)264);
                            continue block15;
                        }
                        case 2087763954: {
                            v2 = jd.ahlm("aiwu", ahlx(int ), (int)265);
                            continue block15;
                        }
                    }
                    break;
                }
                var2_2 = jd.b;
                v3 /* !! */  = jd.bz;
                if (true) ** GOTO lbl29
                block16: while (true) {
                    v3 /* !! */  = (long)(jd.ahlm("aiww", ahlx(int ), (int)267) - jd.ahlm("aiwv", ahlx(int ), (int)266));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2053357414: {
                            break block16;
                        }
                        case -1135421783: {
                            continue block16;
                        }
                    }
                    break;
                }
                var1_3 = jd.a;
                if (var3_1) {
                    throw null;
lbl37:
                    // 3 sources

                    return (boolean)jd.ahlm("aiwx", ahlj(int ), (int)688);
                }
                if (var1_3 || var1_3) ** GOTO lbl37
                v4 /* !! */  = jd.bz;
                if (true) ** GOTO lbl44
                block18: while (true) {
                    v4 /* !! */  = (long)(jd.ahlm("aiwz", ahlx(int ), (int)269) - jd.ahlm("aiwy", ahlx(int ), (int)268));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2053357414: {
                            break block18;
                        }
                        case -1827040565: {
                            continue block18;
                        }
                    }
                    break;
                }
                v5 = var0.toString();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = jd.bz - jd.ahlm("aixa", ahlx(int ), (int)270)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == jd.ahlm("aixb", ahlj(int ), (int)689)) break;
                    v6 /* !! */  = (long)jd.ahlm("aixc", ahlj(int ), (int)690);
                }
                if (v5.contains("__MACOSX")) break block24;
                if (var1_3) ** GOTO lbl37
                v7 = jd.ahlm("aixd", ahlj(int ), (int)691);
                if (var3_1) {
                    throw null;
                }
                break block25;
            }
            if (!var1_3 && !var1_3) ** break;
            ** while (true)
            v7 = jd.ahlm("aixe", ahlj(int ), (int)692);
        }
        return (boolean)v7;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$prepareAvatar$5(Path var0) {
        v0 /* !! */  = jd.bz;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - jd.ahlm("aixn", ahlx(int ), (int)271));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2053357414: {
                    break block24;
                }
                case -1340019790: {
                    v1 = jd.ahlm("aixo", ahlx(int ), (int)272);
                    continue block24;
                }
                case -477131449: {
                    v1 = jd.ahlm("aixp", ahlx(int ), (int)273);
                    continue block24;
                }
                case 1259798164: {
                    v1 = jd.ahlm("aixq", ahlx(int ), (int)274);
                    continue block24;
                }
            }
            break;
        }
        var3_1 = jd.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jd.bz - jd.ahlm("aixr", ahlx(int ), (int)275)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jd.ahlm("aixs", ahlj(int ), (int)701)) break;
            v2 /* !! */  = (long)jd.ahlm("aixt", ahlj(int ), (int)702);
        }
        var2_2 /* !! */  = jd.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jd.bz - jd.ahlm("aixu", ahlx(int ), (int)276)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jd.ahlm("aixv", ahlj(int ), (int)703)) break;
            v3 /* !! */  = (long)jd.ahlm("aixw", ahlj(int ), (int)704);
        }
        var1_3 = jd.a;
        if (!var3_1) ** GOTO lbl36
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)jd.ahlm("aixx", ahlj(int ), (int)705);
                }
lbl36:
                // 1 sources

                if (var1_3 || var1_3) continue block27;
                v4 /* !! */  = jd.bz;
                if (true) ** GOTO lbl41
                block28: while (true) {
                    v4 /* !! */  = (long)(v5 - jd.ahlm("aixy", ahlx(int ), (int)277));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2053357414: {
                            break block28;
                        }
                        case -395228801: {
                            v5 = jd.ahlm("aixz", ahlx(int ), (int)278);
                            continue block28;
                        }
                        case 599876779: {
                            v5 = jd.ahlm("aiya", ahlx(int ), (int)279);
                            continue block28;
                        }
                        case 2042796532: {
                            v5 = jd.ahlm("aiyb", ahlx(int ), (int)280);
                            continue block28;
                        }
                    }
                    break;
                }
                v6 = var0.getFileName();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = jd.bz - jd.ahlm("aiyc", ahlx(int ), (int)281)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == jd.ahlm("aiyd", ahlj(int ), (int)706)) break;
                    v7 /* !! */  = (long)jd.ahlm("aiye", ahlj(int ), (int)707);
                }
                v8 = v6.toString();
                v9 /* !! */  = jd.bz;
                if (true) ** GOTO lbl64
                block30: while (true) {
                    v9 /* !! */  = (long)(v10 - jd.ahlm("aiyf", ahlx(int ), (int)282));
lbl64:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2053357414: {
                            break block30;
                        }
                        case -324957289: {
                            v10 = jd.ahlm("aiyg", ahlx(int ), (int)283);
                            continue block30;
                        }
                        case -189883907: {
                            v10 = jd.ahlm("aiyh", ahlx(int ), (int)284);
                            continue block30;
                        }
                        case 448538907: {
                            v10 = jd.ahlm("aiyi", ahlx(int ), (int)285);
                            continue block30;
                        }
                    }
                    break;
                }
                return v8.equals("avatar.json");
                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)jd.ahlm("aiyj", ahlj(int ), (int)708);
                        if (!var3_1) break block27;
                        throw null;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)jd.ahlm("aiyk", ahlj(int ), (int)709);
                    if (!var3_1) break block27;
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)jd.ahlm("aiyl", ahlj(int ), (int)710);
                    if (!var3_1) break block27;
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)jd.ahlm("aiym", ahlj(int ), (int)711);
        ** while (!var3_1)
lbl93:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int shaderPassLayout(jn var0) {
        block69: {
            block68: {
                block67: {
                    block66: {
                        block65: {
                            v0 /* !! */  = jd.bz;
                            if (true) ** GOTO lbl5
                            block35: while (true) {
                                v0 /* !! */  = (long)(v1 - jd.ahlm("ahvg", ahlx(int ), (int)77));
lbl5:
                                // 2 sources

                                switch ((int)v0 /* !! */ ) {
                                    case -2053357414: {
                                        break block35;
                                    }
                                    case -1806696363: {
                                        v1 = jd.ahlm("ahvh", ahlx(int ), (int)78);
                                        continue block35;
                                    }
                                    case -718224632: {
                                        v1 = jd.ahlm("ahvi", ahlx(int ), (int)79);
                                        continue block35;
                                    }
                                    case 944406170: {
                                        v1 = jd.ahlm("ahvj", ahlx(int ), (int)80);
                                        continue block35;
                                    }
                                }
                                break;
                            }
                            var4_1 = jd.c;
                            while (true) {
                                if ((v2 /* !! */  = (cfr_temp_0 = jd.bz - jd.ahlm("ahvk", ahlx(int ), (int)81)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                                    continue;
                                }
                                if (v2 /* !! */  == jd.ahlm("ahvl", ahlj(int ), (int)161)) break;
                                v2 /* !! */  = (long)jd.ahlm("ahvm", ahlj(int ), (int)162);
                            }
                            var3_2 /* !! */  = jd.b;
                            while (true) {
                                if ((v3 /* !! */  = (cfr_temp_1 = jd.bz - jd.ahlm("ahvn", ahlx(int ), (int)82)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                                    continue;
                                }
                                if (v3 /* !! */  == jd.ahlm("ahvo", ahlj(int ), (int)163)) break;
                                v3 /* !! */  = (long)jd.ahlm("ahvp", ahlj(int ), (int)164);
                            }
                            var2_3 = jd.a;
                            if (var4_1) {
                                throw null;
lbl34:
                                // 14 sources

                                return (int)jd.ahlm("ahvq", ahlj(int ), (int)165);
                            }
                            if (var2_3 || var2_3) ** GOTO lbl34
                            while (true) {
                                if ((v4 /* !! */  = (cfr_temp_2 = jd.bz - jd.ahlm("ahvr", ahlx(int ), (int)83)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                    continue;
                                }
                                if (v4 /* !! */  == jd.ahlm("ahvs", ahlj(int ), (int)166)) break;
                                v4 /* !! */  = (long)jd.ahlm("ahvt", ahlj(int ), (int)167);
                            }
                            if (!var0.isGlowMode()) break block65;
                            if (var2_3) ** GOTO lbl34
                            v5 = jd.ahlm("ahvu", ahlj(int ), (int)168);
                            if (var4_1) {
                                throw null;
                            }
                            break block66;
                        }
                        if (var2_3 || var2_3) ** GOTO lbl34
                        v5 = var1_4 /* !! */  = jd.ahlm("ahvv", ahlj(int ), (int)169);
                    }
                    if (var2_3 || var2_3) ** GOTO lbl34
                    v6 /* !! */  = jd.bz;
                    if (true) ** GOTO lbl58
                    block40: while (true) {
                        v6 /* !! */  = (long)(v7 - jd.ahlm("ahvw", ahlx(int ), (int)84));
lbl58:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case -2053357414: {
                                break block40;
                            }
                            case -1068392315: {
                                v7 = jd.ahlm("ahvx", ahlx(int ), (int)85);
                                continue block40;
                            }
                            case -845737494: {
                                v7 = jd.ahlm("ahvy", ahlx(int ), (int)86);
                                continue block40;
                            }
                        }
                        break;
                    }
                    if (!(var0.fillFraction() > jd.ahlm("ahwa", ahvz(int ), (int)170))) break block67;
                    if (var2_3) ** GOTO lbl34
                    var1_4 /* !! */  = (CallSite)(var1_4 /* !! */  | jd.ahlm("ahwb", ahlj(int ), (int)171));
                    if (var2_3) ** GOTO lbl34
                }
                if (var2_3 || var2_3) ** GOTO lbl34
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = jd.bz - jd.ahlm("ahwc", ahlx(int ), (int)87)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == jd.ahlm("ahwd", ahlj(int ), (int)172)) break;
                    v8 /* !! */  = (long)jd.ahlm("ahwe", ahlj(int ), (int)173);
                }
                if (!var0.isTrailEnabled()) break block68;
                if (var2_3) ** GOTO lbl34
                var1_4 /* !! */  = (CallSite)(var1_4 /* !! */  | jd.ahlm("ahwf", ahlj(int ), (int)174));
                if (var2_3) ** GOTO lbl34
            }
            if (var2_3 || var2_3) ** GOTO lbl34
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_4 = jd.bz - jd.ahlm("ahwg", ahlx(int ), (int)88)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v9 /* !! */  == jd.ahlm("ahwh", ahlj(int ), (int)175)) break;
                v9 /* !! */  = (long)jd.ahlm("ahwi", ahlj(int ), (int)176);
            }
            if (!var0.isTrailModelEnabled()) break block69;
            if (var2_3) ** GOTO lbl34
            var1_4 /* !! */  = (CallSite)(var1_4 /* !! */  | jd.ahlm("ahwj", ahlj(int ), (int)177));
            if (var2_3) ** GOTO lbl34
        }
        if (var2_3) ** GOTO lbl34
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_3) ** break;
                ** continue;
                return (int)var1_4 /* !! */ ;
            }
            case 0: {
                var3_2 /* !! */  = (int)jd.ahlm("ahwk", ahlj(int ), (int)178);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl108:
            // 4 sources

            case 1: {
                var3_2 /* !! */  = (int)jd.ahlm("ahwl", ahlj(int ), (int)179);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
            case 2: {
                var3_2 /* !! */  = (int)jd.ahlm("ahwm", ahlj(int ), (int)180);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 3: {
                var3_2 /* !! */  = (int)jd.ahlm("ahwn", ahlj(int ), (int)181);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl123:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)jd.ahlm("ahwo", ahlj(int ), (int)182);
                if (!var4_1) break;
                throw null;
            }
lbl127:
            // 4 sources

            case 5: {
                var3_2 /* !! */  = (int)jd.ahlm("ahwp", ahlj(int ), (int)183);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 6: {
                var3_2 /* !! */  = (int)jd.ahlm("ahwq", ahlj(int ), (int)184);
                if (!var4_1) ** GOTO lbl123
                throw null;
            }
lbl136:
            // 2 sources

            case 7: {
                var3_2 /* !! */  = (int)jd.ahlm("ahwr", ahlj(int ), (int)185);
                if (!var4_1) break;
                throw null;
            }
lbl140:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)jd.ahlm("ahws", ahlj(int ), (int)186);
                if (!var4_1) ** GOTO lbl108
                throw null;
            }
lbl144:
            // 2 sources

            case 9: {
                var3_2 /* !! */  = (int)jd.ahlm("ahwt", ahlj(int ), (int)187);
                if (!var4_1) ** GOTO lbl140
                throw null;
            }
lbl148:
            // 3 sources

            case 10: {
                var3_2 /* !! */  = (int)jd.ahlm("ahwu", ahlj(int ), (int)188);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 11: {
                var3_2 /* !! */  = (int)jd.ahlm("ahwv", ahlj(int ), (int)189);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl187
            }
            case 12: {
                var3_2 /* !! */  = (int)jd.ahlm("ahww", ahlj(int ), (int)190);
                if (!var4_1) break;
                throw null;
            }
lbl162:
            // 2 sources

            case 13: {
                var3_2 /* !! */  = (int)jd.ahlm("ahwx", ahlj(int ), (int)191);
                if (!var4_1) ** GOTO lbl148
                throw null;
            }
            case 14: {
                var3_2 /* !! */  = (int)jd.ahlm("ahwy", ahlj(int ), (int)192);
                if (!var4_1) ** GOTO lbl148
                throw null;
            }
            case 15: {
                var3_2 /* !! */  = (int)jd.ahlm("ahwz", ahlj(int ), (int)193);
                if (!var4_1) ** GOTO lbl108
                throw null;
            }
            case 16: {
                var3_2 /* !! */  = (int)jd.ahlm("ahxa", ahlj(int ), (int)194);
                if (!var4_1) ** GOTO lbl108
                throw null;
            }
lbl178:
            // 3 sources

            case 17: {
                var3_2 /* !! */  = (int)jd.ahlm("ahxb", ahlj(int ), (int)195);
                if (!var4_1) ** GOTO lbl162
                throw null;
            }
            case 18: {
                var3_2 /* !! */  = (int)jd.ahlm("ahxc", ahlj(int ), (int)196);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl187:
            // 2 sources

            case 19: {
                var3_2 /* !! */  = (int)jd.ahlm("ahxd", ahlj(int ), (int)197);
                if (!var4_1) ** GOTO lbl127
                throw null;
            }
lbl191:
            // 3 sources

            case 20: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)jd.ahlm("ahxe", ahlj(int ), (int)198);
                    if (!var4_1) ** GOTO lbl127
                    throw null;
                }
            }
            case 21: 
        }
        var3_2 /* !! */  = (int)jd.ahlm("ahxf", ahlj(int ), (int)199);
        ** while (!var4_1)
lbl199:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void updateCurrentPass(int var0, int var1_1) {
        v0 /* !! */  = jd.bz;
        block18: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -2053357414: {
                    break block18;
                }
                case -87501305: {
                    v0 /* !! */  = (long)(jd.ahlm("aibw", ahlx(int ), (int)127) - jd.ahlm("aibv", ahlx(int ), (int)126));
                    continue block18;
                }
            }
            break;
        }
        var4_2 = jd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jd.bz - jd.ahlm("aibx", ahlx(int ), (int)128)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == jd.ahlm("aiby", ahlj(int ), (int)282)) break;
            v1 /* !! */  = (long)jd.ahlm("aibz", ahlj(int ), (int)283);
        }
        var3_3 /* !! */  = jd.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = jd.bz - jd.ahlm("aica", ahlx(int ), (int)129)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jd.ahlm("aicb", ahlj(int ), (int)284)) {
                var2_4 = jd.a;
                if (var4_2) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)jd.ahlm("aicc", ahlj(int ), (int)285);
        }
        if (var2_4 || var2_4) return;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = jd.bz - jd.ahlm("aicd", ahlx(int ), (int)130)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jd.ahlm("aice", ahlj(int ), (int)286)) break;
            v3 /* !! */  = (long)jd.ahlm("aicf", ahlj(int ), (int)287);
        }
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_4 = jd.bz - jd.ahlm("aicg", ahlx(int ), (int)131)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == jd.ahlm("aich", ahlj(int ), (int)288)) break;
            v4 /* !! */  = (long)jd.ahlm("aici", ahlj(int ), (int)289);
        }
        v5 = jd.updatingPassIndex;
        v6 = v5 + jd.ahlm("aicj", ahlj(int ), (int)290);
        while (true) {
            block37: {
                if ((v7 = (cfr_temp_5 = jd.bz - jd.ahlm("aick", ahlx(int ), (int)132)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v7 != jd.ahlm("aicl", ahlj(int ), (int)291)) break block37;
                jd.updatingPassIndex = v6;
                v8 = jd.updatingPasses[v5];
                v9 /* !! */  = jd.bz;
                if (true) ** GOTO lbl50
            }
            v7 = -508289090;
        }
        block24: while (true) {
            v9 /* !! */  = (long)(v10 - jd.ahlm("aicm", ahlx(int ), (int)133));
lbl50:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -2053357414: {
                    break block24;
                }
                case -1441617277: {
                    v10 = jd.ahlm("aicn", ahlx(int ), (int)134);
                    continue block24;
                }
                case -383795287: {
                    v10 = jd.ahlm("aico", ahlx(int ), (int)135);
                    continue block24;
                }
                case -36597246: {
                    v10 = jd.ahlm("aicp", ahlx(int ), (int)136);
                    continue block24;
                }
            }
            break;
        }
        v8.setPackedData(var0, var1_1);
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block25: while (true) {
            block38: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (!var2_4 && !var2_4) return;
                        return;
                    }
                    case 0: {
                        var3_3 /* !! */  = (int)jd.ahlm("aicq", ahlj(int ), (int)292);
                        cfr_temp_0 = 4;
                        if (var4_2) {
                            throw null;
                        }
                        break block38;
                    }
                    case 1: {
                        do {
                            var3_3 /* !! */  = (int)jd.ahlm("aicr", ahlj(int ), (int)293);
                        } while (!var4_2);
                        throw null;
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)jd.ahlm("aics", ahlj(int ), (int)294);
                        cfr_temp_0 = 3;
                        if (var4_2) {
                            throw null;
                        }
                        break block38;
                    }
                    case 5: {
                        var3_3 /* !! */  = (int)jd.ahlm("aicv", ahlj(int ), (int)297);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 3: lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)jd.ahlm("aict", ahlj(int ), (int)295);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 4: 
                }
                ** GOTO lbl102
            }
            do {
                if (true) continue block25;
lbl102:
                // 2 sources

                var3_3 /* !! */  = (int)jd.ahlm("aicu", ahlj(int ), (int)296);
                cfr_temp_0 = 3;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void ajeq() {
        jd.ahll[600] = 1954205380;
        jd.ahll[601] = -1679091141;
        jd.ahll[602] = 2113365500;
        jd.ahll[603] = -340411425;
        jd.ahll[604] = 1873025603;
        jd.ahll[605] = -268339429;
        jd.ahll[606] = 1285867524;
        jd.ahll[607] = -652970215;
        jd.ahll[608] = 2068554436;
        jd.ahll[609] = -1915682414;
        jd.ahll[610] = -696565514;
        jd.ahll[611] = -1392811654;
        jd.ahll[612] = -1772131349;
        jd.ahll[613] = 304989905;
        jd.ahll[614] = 608577608;
        jd.ahll[615] = -333885882;
        jd.ahll[616] = 281311342;
        jd.ahll[617] = 1364887445;
        jd.ahll[618] = -1290909271;
        jd.ahll[619] = 471871428;
        jd.ahll[620] = -1143562705;
        jd.ahll[621] = -1334838100;
        jd.ahll[622] = -296703694;
        jd.ahll[623] = -112371351;
        jd.ahll[624] = 1376323469;
        jd.ahll[625] = -1974116426;
        jd.ahll[626] = -2057251110;
        jd.ahll[627] = -1355726794;
        jd.ahll[628] = 788329974;
        jd.ahll[629] = -1129169872;
        jd.ahll[630] = -673675985;
        jd.ahll[631] = 1267227998;
        jd.ahll[632] = 950639040;
        jd.ahll[633] = -1992438610;
        jd.ahll[634] = 618485571;
        jd.ahll[635] = 183310123;
        jd.ahll[636] = -930540743;
        jd.ahll[637] = -1555011481;
        jd.ahll[638] = 1746999779;
        jd.ahll[639] = 2034553889;
        jd.ahll[640] = 1449914620;
        jd.ahll[641] = 1021297910;
        jd.ahll[642] = 487578639;
        jd.ahll[643] = 424189027;
        jd.ahll[644] = 248889221;
        jd.ahll[645] = -380170145;
        jd.ahll[646] = 1877121701;
        jd.ahll[647] = 1907092821;
        jd.ahll[648] = -1579516408;
        jd.ahll[649] = 877143887;
        jd.ahll[650] = -1669041314;
        jd.ahll[651] = -244669566;
        jd.ahll[652] = -828502915;
        jd.ahll[653] = 1443064743;
        jd.ahll[654] = 2007208702;
        jd.ahll[655] = 837885632;
        jd.ahll[656] = 672392959;
        jd.ahll[657] = -990380229;
        jd.ahll[658] = -299478329;
        jd.ahll[659] = 861930642;
        jd.ahll[660] = -1968258474;
        jd.ahll[661] = -929667370;
        jd.ahll[662] = -305120978;
        jd.ahll[663] = 1734296780;
        jd.ahll[664] = -845881902;
        jd.ahll[665] = 898357633;
        jd.ahll[666] = -563490351;
        jd.ahll[667] = -1073068931;
        jd.ahll[668] = -1914233254;
        jd.ahll[669] = 734838788;
        jd.ahll[670] = 7966887;
        jd.ahll[671] = -1397140728;
        jd.ahll[672] = 83248836;
        jd.ahll[673] = -515299155;
        jd.ahll[674] = -1932839816;
        jd.ahll[675] = -2079666796;
        jd.ahll[676] = -1138564762;
        jd.ahll[677] = 277754703;
        jd.ahll[678] = -504996720;
        jd.ahll[679] = -2083482458;
        jd.ahll[680] = -1480142117;
        jd.ahll[681] = -305654635;
        jd.ahll[682] = 1494642291;
        jd.ahll[683] = 1863413355;
        jd.ahll[684] = 748280112;
        jd.ahll[685] = -1803365312;
        jd.ahll[686] = 1798878786;
        jd.ahll[687] = -714213914;
        jd.ahll[688] = -1124398375;
        jd.ahll[689] = 1052358294;
        jd.ahll[690] = 1490343588;
        jd.ahll[691] = -68149712;
        jd.ahll[692] = 253080543;
        jd.ahll[693] = -1787497233;
        jd.ahll[694] = -1822910570;
        jd.ahll[695] = 1464730746;
        jd.ahll[696] = -1830670417;
        jd.ahll[697] = 1647239211;
        jd.ahll[698] = 1299149875;
        jd.ahll[699] = 1295615669;
    }

    private static /* synthetic */ void ajeh() {
        jd.ahlk[500] = 1207532580;
        jd.ahlk[501] = -18020794;
        jd.ahlk[502] = 292405837;
        jd.ahlk[503] = 1885925436;
        jd.ahlk[504] = -209500982;
        jd.ahlk[505] = -839282712;
        jd.ahlk[506] = 185431075;
        jd.ahlk[507] = 672971435;
        jd.ahlk[508] = 1669727600;
        jd.ahlk[509] = 622631972;
        jd.ahlk[510] = 412817306;
        jd.ahlk[511] = -2096549925;
        jd.ahlk[512] = 601645116;
        jd.ahlk[513] = 1581083050;
        jd.ahlk[514] = -246784640;
        jd.ahlk[515] = 1416301222;
        jd.ahlk[516] = -977424229;
        jd.ahlk[517] = -240782390;
        jd.ahlk[518] = 971255700;
        jd.ahlk[519] = 802418605;
        jd.ahlk[520] = 544678604;
        jd.ahlk[521] = -1842068302;
        jd.ahlk[522] = 1226852208;
        jd.ahlk[523] = -808853123;
        jd.ahlk[524] = 1691949262;
        jd.ahlk[525] = -874367660;
        jd.ahlk[526] = 1361587399;
        jd.ahlk[527] = -1160683397;
        jd.ahlk[528] = 1488177845;
        jd.ahlk[529] = -1375573998;
        jd.ahlk[530] = -578893982;
        jd.ahlk[531] = 719403280;
        jd.ahlk[532] = 627946781;
        jd.ahlk[533] = 1379811862;
        jd.ahlk[534] = -539682450;
        jd.ahlk[535] = -489613976;
        jd.ahlk[536] = 683762290;
        jd.ahlk[537] = 1860768605;
        jd.ahlk[538] = -1493502798;
        jd.ahlk[539] = -1463380679;
        jd.ahlk[540] = -440032458;
        jd.ahlk[541] = -8969136;
        jd.ahlk[542] = -1719116205;
        jd.ahlk[543] = 927595151;
        jd.ahlk[544] = 1135429475;
        jd.ahlk[545] = 1023125120;
        jd.ahlk[546] = -545037303;
        jd.ahlk[547] = 583222375;
        jd.ahlk[548] = -1562927164;
        jd.ahlk[549] = 923457672;
        jd.ahlk[550] = 1387596189;
        jd.ahlk[551] = -1255990058;
        jd.ahlk[552] = 1953432946;
        jd.ahlk[553] = -221518208;
        jd.ahlk[554] = 2138234218;
        jd.ahlk[555] = 1215986853;
        jd.ahlk[556] = -664241941;
        jd.ahlk[557] = 1158810032;
        jd.ahlk[558] = -2043123355;
        jd.ahlk[559] = -1207031482;
        jd.ahlk[560] = -950751294;
        jd.ahlk[561] = -1815564706;
        jd.ahlk[562] = 2087383527;
        jd.ahlk[563] = -2002685420;
        jd.ahlk[564] = -1012652960;
        jd.ahlk[565] = 1031184570;
        jd.ahlk[566] = 1364539462;
        jd.ahlk[567] = 780520837;
        jd.ahlk[568] = 772077422;
        jd.ahlk[569] = -1084717876;
        jd.ahlk[570] = -1827654054;
        jd.ahlk[571] = 11747391;
        jd.ahlk[572] = 1805303720;
        jd.ahlk[573] = -2083315090;
        jd.ahlk[574] = 1089011916;
        jd.ahlk[575] = -1106794255;
        jd.ahlk[576] = -1338142334;
        jd.ahlk[577] = 147487;
        jd.ahlk[578] = 623070871;
        jd.ahlk[579] = 990470504;
        jd.ahlk[580] = -1544626759;
        jd.ahlk[581] = -399434812;
        jd.ahlk[582] = -1443148168;
        jd.ahlk[583] = -1385444499;
        jd.ahlk[584] = 1183313564;
        jd.ahlk[585] = -2074756335;
        jd.ahlk[586] = 1824573122;
        jd.ahlk[587] = -849692564;
        jd.ahlk[588] = -2138102390;
        jd.ahlk[589] = -814178629;
        jd.ahlk[590] = -787435366;
        jd.ahlk[591] = -2055485494;
        jd.ahlk[592] = 694042615;
        jd.ahlk[593] = 327588032;
        jd.ahlk[594] = -724451483;
        jd.ahlk[595] = 1742940114;
        jd.ahlk[596] = -225099532;
        jd.ahlk[597] = 648203548;
        jd.ahlk[598] = 1726713519;
        jd.ahlk[599] = 2049659833;
    }

    private static /* synthetic */ double ahpc(int n2) {
        return Double.longBitsToDouble(ahly[n2] ^ ahlz[n2]);
    }

    private static /* synthetic */ void ajem() {
        jd.ahll[200] = 999978979;
        jd.ahll[201] = 1791841850;
        jd.ahll[202] = -226659193;
        jd.ahll[203] = -800799130;
        jd.ahll[204] = -1258881637;
        jd.ahll[205] = -2126469097;
        jd.ahll[206] = -849010809;
        jd.ahll[207] = 1670223165;
        jd.ahll[208] = -503106835;
        jd.ahll[209] = 1091206564;
        jd.ahll[210] = -543257930;
        jd.ahll[211] = -58480896;
        jd.ahll[212] = -1653963682;
        jd.ahll[213] = 1241652104;
        jd.ahll[214] = -1066798606;
        jd.ahll[215] = 1217272840;
        jd.ahll[216] = 326874268;
        jd.ahll[217] = 1939912862;
        jd.ahll[218] = -870617164;
        jd.ahll[219] = 323914606;
        jd.ahll[220] = 1188417454;
        jd.ahll[221] = -116014308;
        jd.ahll[222] = 336250208;
        jd.ahll[223] = 1663354574;
        jd.ahll[224] = 118791532;
        jd.ahll[225] = -1971858441;
        jd.ahll[226] = -1018768163;
        jd.ahll[227] = 88381005;
        jd.ahll[228] = -391297230;
        jd.ahll[229] = -326699898;
        jd.ahll[230] = 437165928;
        jd.ahll[231] = -1588433397;
        jd.ahll[232] = -1905827893;
        jd.ahll[233] = -1095920165;
        jd.ahll[234] = -651974041;
        jd.ahll[235] = 1508444962;
        jd.ahll[236] = 1926475403;
        jd.ahll[237] = -365597620;
        jd.ahll[238] = -1281194670;
        jd.ahll[239] = 767605196;
        jd.ahll[240] = 0xCA8CCCC;
        jd.ahll[241] = 1523688727;
        jd.ahll[242] = 2035383754;
        jd.ahll[243] = -121785620;
        jd.ahll[244] = -1171387718;
        jd.ahll[245] = -1035341119;
        jd.ahll[246] = -448889894;
        jd.ahll[247] = -476564230;
        jd.ahll[248] = 1456192733;
        jd.ahll[249] = 99434800;
        jd.ahll[250] = -273015409;
        jd.ahll[251] = -37762620;
        jd.ahll[252] = 1563834588;
        jd.ahll[253] = 26733242;
        jd.ahll[254] = -1434505913;
        jd.ahll[255] = 2045937781;
        jd.ahll[256] = -1880444085;
        jd.ahll[257] = 1181408593;
        jd.ahll[258] = -1631331810;
        jd.ahll[259] = 1716972879;
        jd.ahll[260] = 523279471;
        jd.ahll[261] = 1728404853;
        jd.ahll[262] = 1293674705;
        jd.ahll[263] = -956662998;
        jd.ahll[264] = 76741639;
        jd.ahll[265] = 1969099657;
        jd.ahll[266] = 42112909;
        jd.ahll[267] = -1796363467;
        jd.ahll[268] = -1757439013;
        jd.ahll[269] = 1180695471;
        jd.ahll[270] = 1111551273;
        jd.ahll[271] = 240429394;
        jd.ahll[272] = 1440357067;
        jd.ahll[273] = -228754105;
        jd.ahll[274] = 62870612;
        jd.ahll[275] = -2046353088;
        jd.ahll[276] = 889494820;
        jd.ahll[277] = 2032072374;
        jd.ahll[278] = 1861826062;
        jd.ahll[279] = 2021472763;
        jd.ahll[280] = -363680203;
        jd.ahll[281] = 778551656;
        jd.ahll[282] = -561041673;
        jd.ahll[283] = 1489590604;
        jd.ahll[284] = 894281727;
        jd.ahll[285] = 1251903526;
        jd.ahll[286] = -1636589994;
        jd.ahll[287] = -408232615;
        jd.ahll[288] = 1144097725;
        jd.ahll[289] = 1301339769;
        jd.ahll[290] = -762969938;
        jd.ahll[291] = 577528184;
        jd.ahll[292] = 1803298165;
        jd.ahll[293] = 1487229741;
        jd.ahll[294] = -1495279622;
        jd.ahll[295] = 1141835168;
        jd.ahll[296] = -430025670;
        jd.ahll[297] = -1855397262;
        jd.ahll[298] = -1577686066;
        jd.ahll[299] = -2019998879;
    }

    private static /* synthetic */ void ajen() {
        jd.ahll[300] = 399799185;
        jd.ahll[301] = -1102766824;
        jd.ahll[302] = -1479666996;
        jd.ahll[303] = -1363247971;
        jd.ahll[304] = -224884464;
        jd.ahll[305] = -736456798;
        jd.ahll[306] = 709313678;
        jd.ahll[307] = -595946326;
        jd.ahll[308] = -1200219102;
        jd.ahll[309] = 606686278;
        jd.ahll[310] = -234350613;
        jd.ahll[311] = -70484379;
        jd.ahll[312] = 686767217;
        jd.ahll[313] = 1420756782;
        jd.ahll[314] = -1159600918;
        jd.ahll[315] = 1381529065;
        jd.ahll[316] = -593331680;
        jd.ahll[317] = -1615860065;
        jd.ahll[318] = 1333362198;
        jd.ahll[319] = 1598909108;
        jd.ahll[320] = 1888201999;
        jd.ahll[321] = 2127533536;
        jd.ahll[322] = -297569535;
        jd.ahll[323] = 1737552470;
        jd.ahll[324] = -271259048;
        jd.ahll[325] = -367143539;
        jd.ahll[326] = 1957129245;
        jd.ahll[327] = 1142539572;
        jd.ahll[328] = -455700259;
        jd.ahll[329] = -727235053;
        jd.ahll[330] = 688732603;
        jd.ahll[331] = 1023661304;
        jd.ahll[332] = -1955981659;
        jd.ahll[333] = -2107952510;
        jd.ahll[334] = -742723918;
        jd.ahll[335] = -1994099008;
        jd.ahll[336] = -342534626;
        jd.ahll[337] = 1841371094;
        jd.ahll[338] = -892349676;
        jd.ahll[339] = 1583469457;
        jd.ahll[340] = 2131892724;
        jd.ahll[341] = -1253612122;
        jd.ahll[342] = -741437994;
        jd.ahll[343] = 26723991;
        jd.ahll[344] = 1616642954;
        jd.ahll[345] = 1943562482;
        jd.ahll[346] = 1315995496;
        jd.ahll[347] = -690891602;
        jd.ahll[348] = 770148907;
        jd.ahll[349] = -739378818;
        jd.ahll[350] = -1175379688;
        jd.ahll[351] = -1862230133;
        jd.ahll[352] = 1721913872;
        jd.ahll[353] = -2037558473;
        jd.ahll[354] = 1447975725;
        jd.ahll[355] = 1152818013;
        jd.ahll[356] = 190255367;
        jd.ahll[357] = -660112267;
        jd.ahll[358] = 2116007271;
        jd.ahll[359] = -169858602;
        jd.ahll[360] = 1335221801;
        jd.ahll[361] = -268241769;
        jd.ahll[362] = 1106676171;
        jd.ahll[363] = 813771315;
        jd.ahll[364] = 1202755862;
        jd.ahll[365] = -1931106586;
        jd.ahll[366] = -1424497996;
        jd.ahll[367] = 1565466906;
        jd.ahll[368] = 786120090;
        jd.ahll[369] = -1327499669;
        jd.ahll[370] = -1818548467;
        jd.ahll[371] = 1828163591;
        jd.ahll[372] = -413413505;
        jd.ahll[373] = -295414638;
        jd.ahll[374] = -874951320;
        jd.ahll[375] = 1936633327;
        jd.ahll[376] = -1309106109;
        jd.ahll[377] = -1017062995;
        jd.ahll[378] = 851153880;
        jd.ahll[379] = -1955124969;
        jd.ahll[380] = 1564307358;
        jd.ahll[381] = 1267611;
        jd.ahll[382] = -1874784406;
        jd.ahll[383] = 1487336720;
        jd.ahll[384] = -43168767;
        jd.ahll[385] = -171531416;
        jd.ahll[386] = 2130233377;
        jd.ahll[387] = -1825199016;
        jd.ahll[388] = 1549539881;
        jd.ahll[389] = -816287459;
        jd.ahll[390] = 125705230;
        jd.ahll[391] = -720893479;
        jd.ahll[392] = 787999798;
        jd.ahll[393] = -152879605;
        jd.ahll[394] = -728714777;
        jd.ahll[395] = -892030529;
        jd.ahll[396] = -1088851641;
        jd.ahll[397] = 249271093;
        jd.ahll[398] = -1020586625;
        jd.ahll[399] = -1173372241;
    }

    private static /* synthetic */ void ajei() {
        jd.ahlk[600] = 1954205409;
        jd.ahlk[601] = -1679091157;
        jd.ahlk[602] = 2113365453;
        jd.ahlk[603] = -340411428;
        jd.ahlk[604] = 1873025610;
        jd.ahlk[605] = -268339450;
        jd.ahlk[606] = 1285867550;
        jd.ahlk[607] = -652970224;
        jd.ahlk[608] = 2068554460;
        jd.ahlk[609] = -1915682383;
        jd.ahlk[610] = -696565511;
        jd.ahlk[611] = -1392811668;
        jd.ahlk[612] = -1772131341;
        jd.ahlk[613] = 304989917;
        jd.ahlk[614] = 608577614;
        jd.ahlk[615] = -333885886;
        jd.ahlk[616] = 281311304;
        jd.ahlk[617] = 1364887474;
        jd.ahlk[618] = -1290909259;
        jd.ahlk[619] = 471871457;
        jd.ahlk[620] = -1143562708;
        jd.ahlk[621] = -1334838105;
        jd.ahlk[622] = -296703708;
        jd.ahlk[623] = -112371377;
        jd.ahlk[624] = 1376323468;
        jd.ahlk[625] = -1974116438;
        jd.ahlk[626] = -2057251073;
        jd.ahlk[627] = -1355726795;
        jd.ahlk[628] = 788329941;
        jd.ahlk[629] = -1129169900;
        jd.ahlk[630] = -673675969;
        jd.ahlk[631] = 1267227993;
        jd.ahlk[632] = 950639074;
        jd.ahlk[633] = -1992438600;
        jd.ahlk[634] = 618485590;
        jd.ahlk[635] = 183310088;
        jd.ahlk[636] = -930540750;
        jd.ahlk[637] = -1555011519;
        jd.ahlk[638] = 1746999750;
        jd.ahlk[639] = 2034553893;
        jd.ahlk[640] = 1449914601;
        jd.ahlk[641] = 1021297875;
        jd.ahlk[642] = 487578667;
        jd.ahlk[643] = 424189055;
        jd.ahlk[644] = 248889240;
        jd.ahlk[645] = -380170149;
        jd.ahlk[646] = 1877121714;
        jd.ahlk[647] = 1907092800;
        jd.ahlk[648] = -1579516403;
        jd.ahlk[649] = 877143896;
        jd.ahlk[650] = -1669041337;
        jd.ahlk[651] = -244669539;
        jd.ahlk[652] = -828502939;
        jd.ahlk[653] = 1443064742;
        jd.ahlk[654] = 2007208671;
        jd.ahlk[655] = 837885634;
        jd.ahlk[656] = 672392927;
        jd.ahlk[657] = -990380256;
        jd.ahlk[658] = -299478316;
        jd.ahlk[659] = 861930639;
        jd.ahlk[660] = -1968258479;
        jd.ahlk[661] = -929667337;
        jd.ahlk[662] = -305120990;
        jd.ahlk[663] = 1734296799;
        jd.ahlk[664] = -845881912;
        jd.ahlk[665] = 898357638;
        jd.ahlk[666] = -563490320;
        jd.ahlk[667] = -1073068931;
        jd.ahlk[668] = -1914233255;
        jd.ahlk[669] = 734838797;
        jd.ahlk[670] = 7966892;
        jd.ahlk[671] = -1397140712;
        jd.ahlk[672] = 83248843;
        jd.ahlk[673] = -515299154;
        jd.ahlk[674] = -1932839829;
        jd.ahlk[675] = -2079666808;
        jd.ahlk[676] = -1138564753;
        jd.ahlk[677] = 277754695;
        jd.ahlk[678] = -504996735;
        jd.ahlk[679] = -2083482464;
        jd.ahlk[680] = 1480142116;
        jd.ahlk[681] = -1562962968;
        jd.ahlk[682] = 1494642289;
        jd.ahlk[683] = 1863413354;
        jd.ahlk[684] = 748280115;
        jd.ahlk[685] = -1803365309;
        jd.ahlk[686] = 1798878787;
        jd.ahlk[687] = 1424997766;
        jd.ahlk[688] = -1124398375;
        jd.ahlk[689] = -1052358295;
        jd.ahlk[690] = 729704003;
        jd.ahlk[691] = -68149711;
        jd.ahlk[692] = 253080543;
        jd.ahlk[693] = -1787497238;
        jd.ahlk[694] = -1822910576;
        jd.ahlk[695] = 1464730746;
        jd.ahlk[696] = -1830670422;
        jd.ahlk[697] = 1647239214;
        jd.ahlk[698] = 1299149876;
        jd.ahlk[699] = 1295615667;
    }

    static {
        ahlk = new int[795];
        ahll = new int[795];
        jd.ajec();
        jd.ajed();
        jd.ajee();
        jd.ajef();
        jd.ajeg();
        jd.ajeh();
        jd.ajei();
        jd.ajej();
        jd.ajek();
        jd.ajel();
        jd.ajem();
        jd.ajen();
        jd.ajeo();
        jd.ajep();
        jd.ajeq();
        jd.ajer();
        ahly = new long[348];
        ahlz = new long[348];
        jd.ajes();
        jd.ajet();
        jd.ajeu();
        jd.ajev();
        jd.ajew();
        jd.ajex();
        jd.ajey();
        jd.ajez();
        SHADER_PASS_CACHE = new IdentityHashMap<class_1921, jd$CachedShaderPasses>();
        SHADER_ESP_PASS_CACHE = new IdentityHashMap<class_1921, PhobiaFiguraBridge.RenderPass[]>();
        AVATARS = Map.of("Repo", new jd$EmbeddedAvatar("repo", "/assets/phobia/custom_models/repo_v2.zip", 0.0), "Bacon", new jd$EmbeddedAvatar("bacon", "/assets/phobia/custom_models/bacon.zip", 0.0), "Peter Griffin", new jd$EmbeddedAvatar("peter_griffin", "/assets/phobia/custom_models/peter_griffin.zip", (double)jd.ahlm("ajdz", ahpc(int ), (int)345)), "Aria", new jd$EmbeddedAvatar("aria", "/assets/phobia/custom_models/aria.zip", (double)jd.ahlm("ajea", ahpc(int ), (int)346)), "Sahur", new jd$EmbeddedAvatar("sahur", "/assets/phobia/custom_models/sahur.zip", (double)jd.ahlm("ajeb", ahpc(int ), (int)347)));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void syncFriendModels() {
        block129: {
            block128: {
                block127: {
                    block126: {
                        var7_1 = jd.c;
                        var6_2 /* !! */  = jd.b;
                        var5_3 = jd.a;
                        if (var7_1) {
                            throw null;
lbl6:
                            // 38 sources

                            return;
                        }
                        if (var5_3 || var5_3) ** GOTO lbl6
                        if (!this.onFriends.isValue()) break block126;
                        if (var5_3) ** GOTO lbl6
                        if (jd.mc.field_1724 == null) break block126;
                        if (var5_3) ** GOTO lbl6
                        if (jd.mc.field_1687 != null) break block127;
                        if (var5_3) ** GOTO lbl6
                    }
                    if (var5_3 || var5_3) ** GOTO lbl6
                    this.friendSourceAvatar = null;
                    if (var5_3 || var5_3) ** GOTO lbl6
                    this.clearAppliedFriendModels();
                    if (var5_3 || var5_3) ** GOTO lbl6
                    return;
                }
                if (var5_3 || var5_3) ** GOTO lbl6
                var1_4 = AvatarManager.getLoadedAvatar((UUID)jd.mc.field_1724.method_5667());
                if (var5_3 || var5_3) ** GOTO lbl6
                if (var1_4 == null) break block128;
                if (var5_3) ** GOTO lbl6
                if (!var1_4.loaded) break block128;
                if (var5_3) ** GOTO lbl6
                if (var1_4.renderer == null) break block128;
                if (var5_3) ** GOTO lbl6
                if (var1_4.nbt != null) break block129;
                if (var5_3) ** GOTO lbl6
            }
            if (var5_3 || var5_3) ** GOTO lbl6
            return;
        }
        if (var5_3 || var5_3) ** GOTO lbl6
        if (var1_4 == this.friendSourceAvatar) ** GOTO lbl48
        if (var5_3 || var5_3) ** GOTO lbl6
        this.clearAppliedFriendModels();
        if (var5_3 || var5_3) ** GOTO lbl6
        if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.friendSourceAvatar = var1_4;
                if (var5_3) ** GOTO lbl6
lbl48:
                // 2 sources

                if (var5_3 || var5_3) ** GOTO lbl6
                var2_5 = new HashSet<E>();
                if (var5_3 || var5_3) ** GOTO lbl6
                jd.mc.field_1687.method_18456().forEach((Consumer<class_742>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$syncFriendModels$4(java.util.Set net.minecraft.class_742 ), (Lnet/minecraft/class_742;)V)(var2_5));
                if (var5_3 || var5_3) ** GOTO lbl6
                var3_6 = new HashSet<UUID>(this.appliedFriends).iterator();
                if (var5_3) ** GOTO lbl6
                do {
                    if (var5_3 || var5_3) ** GOTO lbl6
                    if (!var3_6.hasNext()) ** GOTO lbl71
                    if (var5_3) ** GOTO lbl6
                    var4_7 = var3_6.next();
                    if (var5_3 || var5_3) ** GOTO lbl6
                    if (var2_5.contains(var4_7)) ** GOTO lbl68
                    if (var5_3 || var5_3) ** GOTO lbl6
                    AvatarManager.clearAvatars((UUID)var4_7);
                    if (var5_3 || var5_3) ** GOTO lbl6
                    this.appliedFriends.remove(var4_7);
                    if (var5_3) ** GOTO lbl6
lbl68:
                    // 2 sources

                    if (var5_3 || var5_3) ** GOTO lbl6
                } while (!var7_1);
                throw null;
lbl71:
                // 1 sources

                if (var5_3 || var5_3) ** GOTO lbl6
                var3_6 = var2_5.iterator();
                if (var5_3) ** GOTO lbl6
                do {
                    if (var5_3 || var5_3) ** GOTO lbl6
                    if (!var3_6.hasNext()) ** GOTO lbl87
                    if (var5_3) ** GOTO lbl6
                    var4_7 = var3_6.next();
                    if (var5_3 || var5_3) ** GOTO lbl6
                    if (!this.appliedFriends.add(var4_7)) ** GOTO lbl84
                    if (var5_3 || var5_3) ** GOTO lbl6
                    AvatarManager.setAvatar((UUID)var4_7, (class_2487)var1_4.nbt);
                    if (var5_3) ** GOTO lbl6
lbl84:
                    // 2 sources

                    if (var5_3 || var5_3) ** GOTO lbl6
                } while (!var7_1);
                throw null;
lbl87:
                // 1 sources

                if (!var5_3 && !var5_3) ** break;
                ** continue;
                return;
            }
lbl90:
            // 2 sources

            case 0: {
                var6_2 /* !! */  = (int)jd.ahlm("aimf", ahlj(int ), (int)451);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl304
            }
lbl95:
            // 3 sources

            case 1: {
                var6_2 /* !! */  = (int)jd.ahlm("aimg", ahlj(int ), (int)452);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl100:
            // 2 sources

            case 2: {
                var6_2 /* !! */  = (int)jd.ahlm("aimh", ahlj(int ), (int)453);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl105:
            // 2 sources

            case 3: {
                var6_2 /* !! */  = (int)jd.ahlm("aimi", ahlj(int ), (int)454);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl369
            }
lbl110:
            // 2 sources

            case 4: {
                var6_2 /* !! */  = (int)jd.ahlm("aimj", ahlj(int ), (int)455);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl115:
            // 3 sources

            case 5: {
                var6_2 /* !! */  = (int)jd.ahlm("aimk", ahlj(int ), (int)456);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl120:
            // 4 sources

            case 6: {
                var6_2 /* !! */  = (int)jd.ahlm("aiml", ahlj(int ), (int)457);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 7: {
                var6_2 /* !! */  = (int)jd.ahlm("aimm", ahlj(int ), (int)458);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl130:
            // 2 sources

            case 8: {
                var6_2 /* !! */  = (int)jd.ahlm("aimn", ahlj(int ), (int)459);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl336
            }
            case 9: {
                var6_2 /* !! */  = (int)jd.ahlm("aimo", ahlj(int ), (int)460);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl140:
            // 5 sources

            case 10: {
                var6_2 /* !! */  = (int)jd.ahlm("aimp", ahlj(int ), (int)461);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl292
            }
            case 11: {
                var6_2 /* !! */  = (int)jd.ahlm("aimq", ahlj(int ), (int)462);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl356
            }
lbl150:
            // 2 sources

            case 12: {
                var6_2 /* !! */  = (int)jd.ahlm("aimr", ahlj(int ), (int)463);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl352
            }
lbl155:
            // 2 sources

            case 13: {
                var6_2 /* !! */  = (int)jd.ahlm("aims", ahlj(int ), (int)464);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 14: {
                var6_2 /* !! */  = (int)jd.ahlm("aimt", ahlj(int ), (int)465);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl332
            }
lbl165:
            // 3 sources

            case 15: {
                var6_2 /* !! */  = (int)jd.ahlm("aimu", ahlj(int ), (int)466);
                if (!var7_1) ** GOTO lbl110
                throw null;
            }
lbl169:
            // 4 sources

            case 16: {
                var6_2 /* !! */  = (int)jd.ahlm("aimv", ahlj(int ), (int)467);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl174:
            // 4 sources

            case 17: {
                var6_2 /* !! */  = (int)jd.ahlm("aimw", ahlj(int ), (int)468);
                if (!var7_1) ** GOTO lbl169
                throw null;
            }
            case 18: {
                var6_2 /* !! */  = (int)jd.ahlm("aimx", ahlj(int ), (int)469);
                if (!var7_1) ** GOTO lbl140
                throw null;
            }
            case 19: {
                var6_2 /* !! */  = (int)jd.ahlm("aimy", ahlj(int ), (int)470);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl228
            }
            case 20: {
                var6_2 /* !! */  = (int)jd.ahlm("aimz", ahlj(int ), (int)471);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl332
            }
            case 21: {
                var6_2 /* !! */  = (int)jd.ahlm("aina", ahlj(int ), (int)472);
                if (!var7_1) ** GOTO lbl165
                throw null;
            }
lbl196:
            // 3 sources

            case 22: {
                var6_2 /* !! */  = (int)jd.ahlm("ainb", ahlj(int ), (int)473);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl340
            }
            case 23: {
                var6_2 /* !! */  = (int)jd.ahlm("ainc", ahlj(int ), (int)474);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl373
            }
            case 24: {
                var6_2 /* !! */  = (int)jd.ahlm("aind", ahlj(int ), (int)475);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl280
            }
            case 25: {
                var6_2 /* !! */  = (int)jd.ahlm("aine", ahlj(int ), (int)476);
                if (!var7_1) ** GOTO lbl105
                throw null;
            }
            case 26: {
                var6_2 /* !! */  = (int)jd.ahlm("ainf", ahlj(int ), (int)477);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl356
            }
lbl220:
            // 3 sources

            case 27: {
                var6_2 /* !! */  = (int)jd.ahlm("aing", ahlj(int ), (int)478);
                if (!var7_1) ** GOTO lbl174
                throw null;
            }
lbl224:
            // 3 sources

            case 28: {
                var6_2 /* !! */  = (int)jd.ahlm("ainh", ahlj(int ), (int)479);
                if (!var7_1) ** GOTO lbl155
                throw null;
            }
lbl228:
            // 3 sources

            case 29: {
                var6_2 /* !! */  = (int)jd.ahlm("aini", ahlj(int ), (int)480);
                if (!var7_1) ** GOTO lbl169
                throw null;
            }
lbl232:
            // 2 sources

            case 30: {
                var6_2 /* !! */  = (int)jd.ahlm("ainj", ahlj(int ), (int)481);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl340
            }
            case 31: {
                var6_2 /* !! */  = (int)jd.ahlm("aink", ahlj(int ), (int)482);
                if (!var7_1) ** GOTO lbl95
                throw null;
            }
            case 32: {
                var6_2 /* !! */  = (int)jd.ahlm("ainl", ahlj(int ), (int)483);
                if (!var7_1) ** GOTO lbl95
                throw null;
            }
            case 33: {
                var6_2 /* !! */  = (int)jd.ahlm("ainm", ahlj(int ), (int)484);
                if (!var7_1) break;
                throw null;
            }
            case 34: {
                var6_2 /* !! */  = (int)jd.ahlm("ainn", ahlj(int ), (int)485);
                if (!var7_1) ** GOTO lbl140
                throw null;
            }
            case 35: {
                var6_2 /* !! */  = (int)jd.ahlm("aino", ahlj(int ), (int)486);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl328
            }
            case 36: {
                var6_2 /* !! */  = (int)jd.ahlm("ainp", ahlj(int ), (int)487);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl304
            }
            case 37: {
                var6_2 /* !! */  = (int)jd.ahlm("ainq", ahlj(int ), (int)488);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl268:
            // 2 sources

            case 38: {
                var6_2 /* !! */  = (int)jd.ahlm("ainr", ahlj(int ), (int)489);
                if (!var7_1) ** GOTO lbl150
                throw null;
            }
            case 39: {
                var6_2 /* !! */  = (int)jd.ahlm("ains", ahlj(int ), (int)490);
                if (!var7_1) ** GOTO lbl115
                throw null;
            }
lbl276:
            // 3 sources

            case 40: {
                var6_2 /* !! */  = (int)jd.ahlm("aint", ahlj(int ), (int)491);
                if (!var7_1) ** GOTO lbl174
                throw null;
            }
lbl280:
            // 3 sources

            case 41: {
                var6_2 /* !! */  = (int)jd.ahlm("ainu", ahlj(int ), (int)492);
                if (!var7_1) ** GOTO lbl120
                throw null;
            }
            case 42: {
                var6_2 /* !! */  = (int)jd.ahlm("ainv", ahlj(int ), (int)493);
                if (!var7_1) ** GOTO lbl268
                throw null;
            }
lbl288:
            // 2 sources

            case 43: {
                var6_2 /* !! */  = (int)jd.ahlm("ainw", ahlj(int ), (int)494);
                if (!var7_1) ** GOTO lbl140
                throw null;
            }
lbl292:
            // 4 sources

            case 44: {
                var6_2 /* !! */  = (int)jd.ahlm("ainx", ahlj(int ), (int)495);
                if (!var7_1) ** GOTO lbl280
                throw null;
            }
lbl296:
            // 3 sources

            case 45: {
                var6_2 /* !! */  = (int)jd.ahlm("ainy", ahlj(int ), (int)496);
                if (!var7_1) ** GOTO lbl115
                throw null;
            }
lbl300:
            // 2 sources

            case 46: {
                var6_2 /* !! */  = (int)jd.ahlm("ainz", ahlj(int ), (int)497);
                if (!var7_1) ** GOTO lbl130
                throw null;
            }
lbl304:
            // 3 sources

            case 47: {
                var6_2 /* !! */  = (int)jd.ahlm("aioa", ahlj(int ), (int)498);
                if (!var7_1) ** GOTO lbl196
                throw null;
            }
lbl308:
            // 2 sources

            case 48: {
                var6_2 /* !! */  = (int)jd.ahlm("aiob", ahlj(int ), (int)499);
                if (!var7_1) ** GOTO lbl292
                throw null;
            }
            case 49: {
                var6_2 /* !! */  = (int)jd.ahlm("aioc", ahlj(int ), (int)500);
                if (!var7_1) ** GOTO lbl90
                throw null;
            }
            case 50: {
                var6_2 /* !! */  = (int)jd.ahlm("aiod", ahlj(int ), (int)501);
                if (var7_1) {
                    throw null;
                }
            }
            case 51: {
                var6_2 /* !! */  = (int)jd.ahlm("aioe", ahlj(int ), (int)502);
                if (!var7_1) ** GOTO lbl292
                throw null;
            }
            case 52: {
                var6_2 /* !! */  = (int)jd.ahlm("aiof", ahlj(int ), (int)503);
                if (!var7_1) ** GOTO lbl308
                throw null;
            }
lbl328:
            // 3 sources

            case 53: {
                var6_2 /* !! */  = (int)jd.ahlm("aiog", ahlj(int ), (int)504);
                if (!var7_1) ** GOTO lbl224
                throw null;
            }
lbl332:
            // 3 sources

            case 54: {
                var6_2 /* !! */  = (int)jd.ahlm("aioh", ahlj(int ), (int)505);
                if (!var7_1) ** GOTO lbl174
                throw null;
            }
lbl336:
            // 2 sources

            case 55: {
                var6_2 /* !! */  = (int)jd.ahlm("aioi", ahlj(int ), (int)506);
                if (!var7_1) ** GOTO lbl220
                throw null;
            }
lbl340:
            // 3 sources

            case 56: {
                var6_2 /* !! */  = (int)jd.ahlm("aioj", ahlj(int ), (int)507);
                if (var7_1) {
                    throw null;
                }
            }
            case 57: {
                var6_2 /* !! */  = (int)jd.ahlm("aiok", ahlj(int ), (int)508);
                if (!var7_1) ** GOTO lbl100
                throw null;
            }
            case 58: {
                var6_2 /* !! */  = (int)jd.ahlm("aiol", ahlj(int ), (int)509);
                if (!var7_1) ** GOTO lbl296
                throw null;
            }
lbl352:
            // 2 sources

            case 59: {
                var6_2 /* !! */  = (int)jd.ahlm("aiom", ahlj(int ), (int)510);
                if (!var7_1) ** GOTO lbl300
                throw null;
            }
lbl356:
            // 3 sources

            case 60: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_2 /* !! */  = (int)jd.ahlm("aion", ahlj(int ), (int)511);
                    if (!var7_1) ** GOTO lbl120
                    throw null;
                }
            }
            case 61: {
                var6_2 /* !! */  = (int)jd.ahlm("aioo", ahlj(int ), (int)512);
                if (!var7_1) ** GOTO lbl288
                throw null;
            }
            case 62: {
                var6_2 /* !! */  = (int)jd.ahlm("aiop", ahlj(int ), (int)513);
                if (!var7_1) ** GOTO lbl328
                throw null;
            }
lbl369:
            // 2 sources

            case 63: {
                var6_2 /* !! */  = (int)jd.ahlm("aioq", ahlj(int ), (int)514);
                if (!var7_1) ** GOTO lbl140
                throw null;
            }
lbl373:
            // 2 sources

            case 64: {
                var6_2 /* !! */  = (int)jd.ahlm("aior", ahlj(int ), (int)515);
                if (!var7_1) ** GOTO lbl165
                throw null;
            }
            case 65: 
        }
        var6_2 /* !! */  = (int)jd.ahlm("aios", ahlj(int ), (int)516);
        ** while (!var7_1)
lbl380:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ajep() {
        jd.ahll[500] = 1207532600;
        jd.ahll[501] = -18020778;
        jd.ahll[502] = 292405829;
        jd.ahll[503] = 1885925381;
        jd.ahll[504] = -209500992;
        jd.ahll[505] = -839282699;
        jd.ahll[506] = 185431064;
        jd.ahll[507] = 672971444;
        jd.ahll[508] = 1669727596;
        jd.ahll[509] = 622631952;
        jd.ahll[510] = 412817335;
        jd.ahll[511] = -2096549949;
        jd.ahll[512] = 601645112;
        jd.ahll[513] = 1581083055;
        jd.ahll[514] = -246784619;
        jd.ahll[515] = 1416301200;
        jd.ahll[516] = -977424252;
        jd.ahll[517] = 240782389;
        jd.ahll[518] = 1721066431;
        jd.ahll[519] = -802418606;
        jd.ahll[520] = -428097217;
        jd.ahll[521] = 1842068301;
        jd.ahll[522] = -1901482453;
        jd.ahll[523] = 808853122;
        jd.ahll[524] = -273525505;
        jd.ahll[525] = 874367659;
        jd.ahll[526] = 1569000180;
        jd.ahll[527] = -1160683413;
        jd.ahll[528] = 1488177855;
        jd.ahll[529] = -1375573986;
        jd.ahll[530] = -578893982;
        jd.ahll[531] = 719403294;
        jd.ahll[532] = 627946780;
        jd.ahll[533] = 1379811864;
        jd.ahll[534] = -539682450;
        jd.ahll[535] = -489613981;
        jd.ahll[536] = 683762288;
        jd.ahll[537] = 1860768597;
        jd.ahll[538] = -1493502814;
        jd.ahll[539] = -1463380676;
        jd.ahll[540] = -440032454;
        jd.ahll[541] = -8969130;
        jd.ahll[542] = -1719116208;
        jd.ahll[543] = 927595144;
        jd.ahll[544] = 1135429478;
        jd.ahll[545] = 1023125152;
        jd.ahll[546] = -545037290;
        jd.ahll[547] = 583222371;
        jd.ahll[548] = -1562927131;
        jd.ahll[549] = 923457727;
        jd.ahll[550] = 1387596184;
        jd.ahll[551] = -1255990068;
        jd.ahll[552] = 1953432953;
        jd.ahll[553] = -221518195;
        jd.ahll[554] = 2138234222;
        jd.ahll[555] = 1215986825;
        jd.ahll[556] = -664241968;
        jd.ahll[557] = 1158810035;
        jd.ahll[558] = -2043123360;
        jd.ahll[559] = -1207031481;
        jd.ahll[560] = -950751276;
        jd.ahll[561] = -1815564688;
        jd.ahll[562] = 2087383504;
        jd.ahll[563] = -2002685436;
        jd.ahll[564] = -1012652991;
        jd.ahll[565] = 1031184537;
        jd.ahll[566] = 1364539511;
        jd.ahll[567] = 780520881;
        jd.ahll[568] = 772077431;
        jd.ahll[569] = -1084717856;
        jd.ahll[570] = -1827654061;
        jd.ahll[571] = 11747346;
        jd.ahll[572] = 1805303697;
        jd.ahll[573] = -2083315112;
        jd.ahll[574] = 1089011936;
        jd.ahll[575] = -1106794263;
        jd.ahll[576] = -1338142283;
        jd.ahll[577] = 147512;
        jd.ahll[578] = 623070853;
        jd.ahll[579] = 990470482;
        jd.ahll[580] = -1544626771;
        jd.ahll[581] = -399434786;
        jd.ahll[582] = -1443148207;
        jd.ahll[583] = -1385444496;
        jd.ahll[584] = 1183313590;
        jd.ahll[585] = -2074756329;
        jd.ahll[586] = 1824573158;
        jd.ahll[587] = -849692599;
        jd.ahll[588] = -2138102376;
        jd.ahll[589] = -814178659;
        jd.ahll[590] = -787435339;
        jd.ahll[591] = -2055485458;
        jd.ahll[592] = 694042614;
        jd.ahll[593] = 327588064;
        jd.ahll[594] = -724451477;
        jd.ahll[595] = 1742940127;
        jd.ahll[596] = -225099545;
        jd.ahll[597] = 648203529;
        jd.ahll[598] = 1726713514;
        jd.ahll[599] = 2049659820;
    }

    private static /* synthetic */ void ajeu() {
        jd.ahly[200] = 856447744825612668L;
        jd.ahly[201] = -6221987743498759195L;
        jd.ahly[202] = 2307946870062638196L;
        jd.ahly[203] = 2666189228214133511L;
        jd.ahly[204] = 8820739479422906588L;
        jd.ahly[205] = 6904499940863047670L;
        jd.ahly[206] = -6010592755040956077L;
        jd.ahly[207] = 2710612677270565278L;
        jd.ahly[208] = -8487039999660628408L;
        jd.ahly[209] = -7873141811666056941L;
        jd.ahly[210] = -2491070077388028119L;
        jd.ahly[211] = 2711555433951017467L;
        jd.ahly[212] = -4387544804885793229L;
        jd.ahly[213] = -1940582261398513508L;
        jd.ahly[214] = 2500687436632383478L;
        jd.ahly[215] = 5974886545694215577L;
        jd.ahly[216] = -7828788061367890233L;
        jd.ahly[217] = -1246729865765223368L;
        jd.ahly[218] = -6318605397810649177L;
        jd.ahly[219] = 9093624108208230555L;
        jd.ahly[220] = 6461689722810634807L;
        jd.ahly[221] = 8553144579667085581L;
        jd.ahly[222] = 439626216598287141L;
        jd.ahly[223] = -5306545196993324912L;
        jd.ahly[224] = 3080525590547982947L;
        jd.ahly[225] = 4538930952709883819L;
        jd.ahly[226] = -2251285081237007931L;
        jd.ahly[227] = -5984078367125069806L;
        jd.ahly[228] = -2352959608156970606L;
        jd.ahly[229] = 8587484097098417392L;
        jd.ahly[230] = 1745156340272529990L;
        jd.ahly[231] = 452649925448941359L;
        jd.ahly[232] = 2442518077929391974L;
        jd.ahly[233] = 3265072571466538083L;
        jd.ahly[234] = -4359345900032411920L;
        jd.ahly[235] = 6474030126518297295L;
        jd.ahly[236] = 8407096776335816090L;
        jd.ahly[237] = 8049251748964853148L;
        jd.ahly[238] = -4634670405717897391L;
        jd.ahly[239] = -8522377952247397179L;
        jd.ahly[240] = 4346585710612239796L;
        jd.ahly[241] = 1592229683165562832L;
        jd.ahly[242] = -3092783455961196687L;
        jd.ahly[243] = 491877889975377291L;
        jd.ahly[244] = -5764418604094204485L;
        jd.ahly[245] = 8390508467461866048L;
        jd.ahly[246] = 6049919645329454559L;
        jd.ahly[247] = 2422563371965250206L;
        jd.ahly[248] = -1463505129333121198L;
        jd.ahly[249] = 9189401176729034020L;
        jd.ahly[250] = 7659991485631957789L;
        jd.ahly[251] = 8505763849546986297L;
        jd.ahly[252] = 8279029398397026134L;
        jd.ahly[253] = 5174381543026048566L;
        jd.ahly[254] = 6290011562393937595L;
        jd.ahly[255] = 1372103056140029386L;
        jd.ahly[256] = 8464098773527943840L;
        jd.ahly[257] = 233186643408654549L;
        jd.ahly[258] = 510562590715290399L;
        jd.ahly[259] = 148069137290387788L;
        jd.ahly[260] = -719822891591977053L;
        jd.ahly[261] = -7583469590923529433L;
        jd.ahly[262] = -8540147875008142137L;
        jd.ahly[263] = 5892422820548414426L;
        jd.ahly[264] = -1804153422627611270L;
        jd.ahly[265] = 190456404152194240L;
        jd.ahly[266] = -8196440110153401244L;
        jd.ahly[267] = -1892006773983914042L;
        jd.ahly[268] = -8344773279994029109L;
        jd.ahly[269] = 720311482806019565L;
        jd.ahly[270] = -7190180206484964672L;
        jd.ahly[271] = -8702166426489696291L;
        jd.ahly[272] = -3462234147123582898L;
        jd.ahly[273] = -551608923324368797L;
        jd.ahly[274] = -4245354474834326688L;
        jd.ahly[275] = -2794909096913210027L;
        jd.ahly[276] = 6613091718256764896L;
        jd.ahly[277] = 1080245724648066022L;
        jd.ahly[278] = 9009762324212373146L;
        jd.ahly[279] = 2577192553005788243L;
        jd.ahly[280] = -2731802475198222620L;
        jd.ahly[281] = 7555835716607327181L;
        jd.ahly[282] = -6120469742750184837L;
        jd.ahly[283] = -5428577264959153150L;
        jd.ahly[284] = -8060482168524596721L;
        jd.ahly[285] = -7441761640197901737L;
        jd.ahly[286] = -7413829079267560149L;
        jd.ahly[287] = -5910158350333751497L;
        jd.ahly[288] = 4153704272557510229L;
        jd.ahly[289] = -8796416617124562000L;
        jd.ahly[290] = 1173481713116749366L;
        jd.ahly[291] = 5248952058402607370L;
        jd.ahly[292] = 2165029185087909039L;
        jd.ahly[293] = 2898696720817226466L;
        jd.ahly[294] = 5467536944094249364L;
        jd.ahly[295] = -6859924314773038785L;
        jd.ahly[296] = 5674661804630951998L;
        jd.ahly[297] = -8766925914119323343L;
        jd.ahly[298] = 5702635711633239238L;
        jd.ahly[299] = -5363674386796206596L;
    }

    private static /* synthetic */ int ahlj(int n2) {
        return ahlk[n2] ^ ahll[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        v0 /* !! */  = jd.bz;
        if (true) ** GOTO lbl5
        block59: while (true) {
            v0 /* !! */  = (long)(v1 - jd.ahlm("aigc", ahlx(int ), (int)171));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2053357414: {
                    break block59;
                }
                case -185320330: {
                    v1 = jd.ahlm("aigd", ahlx(int ), (int)172);
                    continue block59;
                }
                case -109441765: {
                    v1 = jd.ahlm("aige", ahlx(int ), (int)173);
                    continue block59;
                }
                case 1044364125: {
                    v1 = jd.ahlm("aigf", ahlx(int ), (int)174);
                    continue block59;
                }
            }
            break;
        }
        var4_2 = jd.c;
        v2 /* !! */  = jd.bz;
        if (true) ** GOTO lbl22
        block60: while (true) {
            v2 /* !! */  = (long)(jd.ahlm("aigh", ahlx(int ), (int)176) - jd.ahlm("aigg", ahlx(int ), (int)175));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2083209567: {
                    continue block60;
                }
                case -2053357414: {
                    break block60;
                }
            }
            break;
        }
        var3_3 /* !! */  = jd.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = jd.bz - jd.ahlm("aigi", ahlx(int ), (int)177)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jd.ahlm("aigj", ahlj(int ), (int)348)) break;
            v3 /* !! */  = (long)jd.ahlm("aigk", ahlj(int ), (int)349);
        }
        var2_4 = jd.a;
        if (var4_2) {
            throw null;
lbl36:
            // 9 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl36
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = jd.bz - jd.ahlm("aigl", ahlx(int ), (int)178)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == jd.ahlm("aigm", ahlj(int ), (int)350)) break;
            v4 /* !! */  = (long)jd.ahlm("aign", ahlj(int ), (int)351);
        }
        if (this.worldReloadDelay <= 0) ** GOTO lbl78
        if (var2_4 || var2_4) ** GOTO lbl36
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = jd.bz;
                if (true) ** GOTO lbl53
                block64: while (true) {
                    v5 /* !! */  = (long)(v6 - jd.ahlm("aigo", ahlx(int ), (int)179));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2053357414: {
                            break block64;
                        }
                        case 27832473: {
                            v6 = jd.ahlm("aigp", ahlx(int ), (int)180);
                            continue block64;
                        }
                        case 255911979: {
                            v6 = jd.ahlm("aigq", ahlx(int ), (int)181);
                            continue block64;
                        }
                        case 1516013836: {
                            v6 = jd.ahlm("aigr", ahlx(int ), (int)182);
                            continue block64;
                        }
                    }
                    break;
                }
                v7 = this.worldReloadDelay - jd.ahlm("aigs", ahlj(int ), (int)352);
                v8 /* !! */  = jd.bz;
                if (true) ** GOTO lbl70
                block65: while (true) {
                    v8 /* !! */  = (long)(jd.ahlm("aigu", ahlx(int ), (int)184) - jd.ahlm("aigt", ahlx(int ), (int)183));
lbl70:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -2053357414: {
                            break block65;
                        }
                        case 961963614: {
                            continue block65;
                        }
                    }
                    break;
                }
                this.worldReloadDelay = v7;
                if (var2_4 || var2_4) ** GOTO lbl36
                return;
            }
lbl78:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl36
            v9 /* !! */  = jd.bz;
            if (true) ** GOTO lbl83
            block66: while (true) {
                v9 /* !! */  = (long)(v10 - jd.ahlm("aigv", ahlx(int ), (int)185));
lbl83:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -2053357414: {
                        break block66;
                    }
                    case -1635464986: {
                        v10 = jd.ahlm("aigw", ahlx(int ), (int)186);
                        continue block66;
                    }
                    case 1327521882: {
                        v10 = jd.ahlm("aigx", ahlx(int ), (int)187);
                        continue block66;
                    }
                }
                break;
            }
            if (!jd.isFiguraReady()) ** GOTO lbl139
            if (var2_4) ** GOTO lbl36
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_2 = jd.bz - jd.ahlm("aigy", ahlx(int ), (int)188)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == jd.ahlm("aigz", ahlj(int ), (int)353)) break;
                v11 /* !! */  = (long)jd.ahlm("aiha", ahlj(int ), (int)354);
            }
            v12 /* !! */  = jd.bz;
            if (true) ** GOTO lbl103
            block68: while (true) {
                v12 /* !! */  = (long)(jd.ahlm("aihc", ahlx(int ), (int)190) - jd.ahlm("aihb", ahlx(int ), (int)189));
lbl103:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -2053357414: {
                        break block68;
                    }
                    case 736837268: {
                        continue block68;
                    }
                }
                break;
            }
            v13 = this.model.getValue();
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_3 = jd.bz - jd.ahlm("aihd", ahlx(int ), (int)191)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == jd.ahlm("aihe", ahlj(int ), (int)355)) break;
                v14 /* !! */  = (long)jd.ahlm("aihf", ahlj(int ), (int)356);
            }
            v15 /* !! */  = jd.bz;
            if (true) ** GOTO lbl118
            block70: while (true) {
                v15 /* !! */  = (long)(v16 - jd.ahlm("aihg", ahlx(int ), (int)192));
lbl118:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -2053357414: {
                        break block70;
                    }
                    case -1940802068: {
                        v16 = jd.ahlm("aihh", ahlx(int ), (int)193);
                        continue block70;
                    }
                    case -914829175: {
                        v16 = jd.ahlm("aihi", ahlx(int ), (int)194);
                        continue block70;
                    }
                    case 681938759: {
                        v16 = jd.ahlm("aihj", ahlx(int ), (int)195);
                        continue block70;
                    }
                }
                break;
            }
            if (v13.equals(this.loadedModel)) ** GOTO lbl139
            if (var2_4) ** GOTO lbl36
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_4 = jd.bz - jd.ahlm("aihk", ahlx(int ), (int)196)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == jd.ahlm("aihl", ahlj(int ), (int)357)) break;
                v17 /* !! */  = (long)jd.ahlm("aihm", ahlj(int ), (int)358);
            }
            this.loadSelected();
            if (var2_4) ** GOTO lbl36
lbl139:
            // 3 sources

            if (var2_4 || var2_4) ** GOTO lbl36
            v18 /* !! */  = jd.bz;
            if (true) ** GOTO lbl144
            block72: while (true) {
                v18 /* !! */  = (long)(jd.ahlm("aiho", ahlx(int ), (int)198) - jd.ahlm("aihn", ahlx(int ), (int)197));
lbl144:
                // 2 sources

                switch ((int)v18 /* !! */ ) {
                    case -2053357414: {
                        break block72;
                    }
                    case -1809094448: {
                        continue block72;
                    }
                }
                break;
            }
            this.syncFriendModels();
            if (!var2_4 && !var2_4) ** break;
            ** continue;
            return;
lbl153:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)jd.ahlm("aihp", ahlj(int ), (int)359);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl220
                    break;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)jd.ahlm("aihq", ahlj(int ), (int)360);
                if (!var4_2) ** GOTO lbl153
                throw null;
            }
lbl163:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)jd.ahlm("aihr", ahlj(int ), (int)361);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl168:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)jd.ahlm("aihs", ahlj(int ), (int)362);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl173:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)jd.ahlm("aiht", ahlj(int ), (int)363);
                if (!var4_2) break;
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)jd.ahlm("aihu", ahlj(int ), (int)364);
                if (!var4_2) ** GOTO lbl153
                throw null;
            }
lbl181:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)jd.ahlm("aihv", ahlj(int ), (int)365);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl212
            }
            case 7: {
                var3_3 /* !! */  = (int)jd.ahlm("aihw", ahlj(int ), (int)366);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl191:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)jd.ahlm("aihx", ahlj(int ), (int)367);
                if (!var4_2) ** GOTO lbl181
                throw null;
            }
lbl195:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)jd.ahlm("aihy", ahlj(int ), (int)368);
                if (!var4_2) ** GOTO lbl168
                throw null;
            }
            case 10: {
                var3_3 /* !! */  = (int)jd.ahlm("aihz", ahlj(int ), (int)369);
                if (!var4_2) ** GOTO lbl195
                throw null;
            }
lbl203:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)jd.ahlm("aiia", ahlj(int ), (int)370);
                if (!var4_2) ** GOTO lbl173
                throw null;
            }
lbl207:
            // 3 sources

            case 12: {
                var3_3 /* !! */  = (int)jd.ahlm("aiib", ahlj(int ), (int)371);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl212:
            // 2 sources

            case 13: {
                var3_3 /* !! */  = (int)jd.ahlm("aiic", ahlj(int ), (int)372);
                if (!var4_2) ** GOTO lbl203
                throw null;
            }
lbl216:
            // 3 sources

            case 14: {
                var3_3 /* !! */  = (int)jd.ahlm("aiid", ahlj(int ), (int)373);
                if (!var4_2) ** GOTO lbl168
                throw null;
            }
lbl220:
            // 2 sources

            case 15: {
                var3_3 /* !! */  = (int)jd.ahlm("aiie", ahlj(int ), (int)374);
                if (!var4_2) ** GOTO lbl216
                throw null;
            }
            case 16: {
                var3_3 /* !! */  = (int)jd.ahlm("aiif", ahlj(int ), (int)375);
                if (!var4_2) ** GOTO lbl163
                throw null;
            }
            case 17: 
        }
        var3_3 /* !! */  = (int)jd.ahlm("aiig", ahlj(int ), (int)376);
        ** while (!var4_2)
lbl231:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ajer() {
        jd.ahll[700] = 1955638976;
        jd.ahll[701] = 763772819;
        jd.ahll[702] = -1258654314;
        jd.ahll[703] = 55213835;
        jd.ahll[704] = -1375039053;
        jd.ahll[705] = -1255895574;
        jd.ahll[706] = 413872947;
        jd.ahll[707] = -791441295;
        jd.ahll[708] = 1157060485;
        jd.ahll[709] = 1613395385;
        jd.ahll[710] = 148250745;
        jd.ahll[711] = -772785970;
        jd.ahll[712] = 1639318459;
        jd.ahll[713] = -459732478;
        jd.ahll[714] = 810642149;
        jd.ahll[715] = -64724712;
        jd.ahll[716] = -239164900;
        jd.ahll[717] = 597383350;
        jd.ahll[718] = 935871779;
        jd.ahll[719] = 49266535;
        jd.ahll[720] = -169148755;
        jd.ahll[721] = 1720144953;
        jd.ahll[722] = -2123253951;
        jd.ahll[723] = 2039948078;
        jd.ahll[724] = -799123638;
        jd.ahll[725] = 0xB7FBBBF;
        jd.ahll[726] = -774502057;
        jd.ahll[727] = -2056733725;
        jd.ahll[728] = 384012606;
        jd.ahll[729] = 71839073;
        jd.ahll[730] = -1323609970;
        jd.ahll[731] = -711213016;
        jd.ahll[732] = 876617715;
        jd.ahll[733] = -984962727;
        jd.ahll[734] = -2002072291;
        jd.ahll[735] = -393472833;
        jd.ahll[736] = -131233919;
        jd.ahll[737] = -929682852;
        jd.ahll[738] = -291216049;
        jd.ahll[739] = -210892584;
        jd.ahll[740] = -1067183867;
        jd.ahll[741] = 1256926183;
        jd.ahll[742] = -1918193492;
        jd.ahll[743] = 689763724;
        jd.ahll[744] = 1655838749;
        jd.ahll[745] = -623354985;
        jd.ahll[746] = 1331767642;
        jd.ahll[747] = 1678745219;
        jd.ahll[748] = -1463051515;
        jd.ahll[749] = -2018354125;
        jd.ahll[750] = -909184514;
        jd.ahll[751] = 600248986;
        jd.ahll[752] = 1856498525;
        jd.ahll[753] = 1724145048;
        jd.ahll[754] = 1910135416;
        jd.ahll[755] = 1086044115;
        jd.ahll[756] = 1688252809;
        jd.ahll[757] = -2095325275;
        jd.ahll[758] = -795594490;
        jd.ahll[759] = 1273318059;
        jd.ahll[760] = -504249971;
        jd.ahll[761] = 2022531444;
        jd.ahll[762] = 1971965412;
        jd.ahll[763] = 267634960;
        jd.ahll[764] = 1029799575;
        jd.ahll[765] = 2068382755;
        jd.ahll[766] = -16786250;
        jd.ahll[767] = -648609654;
        jd.ahll[768] = -667149312;
        jd.ahll[769] = 12497549;
        jd.ahll[770] = 876925519;
        jd.ahll[771] = 114092352;
        jd.ahll[772] = -481099123;
        jd.ahll[773] = -322229448;
        jd.ahll[774] = -1241508696;
        jd.ahll[775] = -423355726;
        jd.ahll[776] = 290553903;
        jd.ahll[777] = -2085955349;
        jd.ahll[778] = 1776092495;
        jd.ahll[779] = -1751465910;
        jd.ahll[780] = 1022225282;
        jd.ahll[781] = 919693103;
        jd.ahll[782] = 669988654;
        jd.ahll[783] = 311493035;
        jd.ahll[784] = -373054156;
        jd.ahll[785] = -1299832318;
        jd.ahll[786] = 133901299;
        jd.ahll[787] = 429740416;
        jd.ahll[788] = -776945490;
        jd.ahll[789] = 1739546043;
        jd.ahll[790] = 184699824;
        jd.ahll[791] = -955426237;
        jd.ahll[792] = 813246962;
        jd.ahll[793] = -147168773;
        jd.ahll[794] = 126086226;
    }

    private static /* synthetic */ void ajex() {
        jd.ahlz[100] = 3399507255740160504L;
        jd.ahlz[101] = 2212468414700052892L;
        jd.ahlz[102] = -5549106547022386713L;
        jd.ahlz[103] = -364238087570294721L;
        jd.ahlz[104] = -1207487169143102003L;
        jd.ahlz[105] = 6724044068992873134L;
        jd.ahlz[106] = -4184774712629654733L;
        jd.ahlz[107] = -4112290154076449477L;
        jd.ahlz[108] = -4695623866869841783L;
        jd.ahlz[109] = -45835577703453761L;
        jd.ahlz[110] = 4516931417039152110L;
        jd.ahlz[111] = -3798847118255055688L;
        jd.ahlz[112] = -4683320236255867932L;
        jd.ahlz[113] = 7128945049449716801L;
        jd.ahlz[114] = 6186939968897632874L;
        jd.ahlz[115] = -794571962966131175L;
        jd.ahlz[116] = 513707173889565754L;
        jd.ahlz[117] = -6097907080793900448L;
        jd.ahlz[118] = 7660514541385127077L;
        jd.ahlz[119] = 3737664808396935918L;
        jd.ahlz[120] = 4464630132999009171L;
        jd.ahlz[121] = -7974602959249395313L;
        jd.ahlz[122] = -9179772357864163361L;
        jd.ahlz[123] = 2934857607695790073L;
        jd.ahlz[124] = -193686378499774587L;
        jd.ahlz[125] = 1223673779805455169L;
        jd.ahlz[126] = -4725604938262617246L;
        jd.ahlz[127] = -7381356762949422569L;
        jd.ahlz[128] = -5355767116472722918L;
        jd.ahlz[129] = -3860462609116232270L;
        jd.ahlz[130] = 7031431499878896903L;
        jd.ahlz[131] = -4687858835953320726L;
        jd.ahlz[132] = -5934269867596282707L;
        jd.ahlz[133] = 8533814310890311399L;
        jd.ahlz[134] = -5754577028770280851L;
        jd.ahlz[135] = -967084591861668959L;
        jd.ahlz[136] = 8467681988245971350L;
        jd.ahlz[137] = 2670531267060350501L;
        jd.ahlz[138] = 6757431456880652917L;
        jd.ahlz[139] = -573290589026389159L;
        jd.ahlz[140] = 3960598831353448600L;
        jd.ahlz[141] = -3240498741000676403L;
        jd.ahlz[142] = -7828585028475326317L;
        jd.ahlz[143] = -846281281213048541L;
        jd.ahlz[144] = 214992362919649258L;
        jd.ahlz[145] = -140328961055241249L;
        jd.ahlz[146] = -2639768572342025882L;
        jd.ahlz[147] = 1126703459673315328L;
        jd.ahlz[148] = 1405411496782706345L;
        jd.ahlz[149] = 8176071835155227244L;
        jd.ahlz[150] = -7864829336711292626L;
        jd.ahlz[151] = -5786356245532284191L;
        jd.ahlz[152] = -6147543175430280264L;
        jd.ahlz[153] = 2754300700841623612L;
        jd.ahlz[154] = 1752581147054880195L;
        jd.ahlz[155] = 9050385155480410629L;
        jd.ahlz[156] = -1341291210592785509L;
        jd.ahlz[157] = 1828790259052973825L;
        jd.ahlz[158] = 2956181572218748653L;
        jd.ahlz[159] = 3244802311902573274L;
        jd.ahlz[160] = 1931407874388966313L;
        jd.ahlz[161] = 8427021977581810340L;
        jd.ahlz[162] = 1580843659235923223L;
        jd.ahlz[163] = -817325602108610632L;
        jd.ahlz[164] = -6390726775109655955L;
        jd.ahlz[165] = -8143275316868682692L;
        jd.ahlz[166] = 6102345638226831457L;
        jd.ahlz[167] = -8578340418584680448L;
        jd.ahlz[168] = -4093623911144940628L;
        jd.ahlz[169] = -938538947163572761L;
        jd.ahlz[170] = 5480434918365762649L;
        jd.ahlz[171] = 76413661986936000L;
        jd.ahlz[172] = -3459662427861800097L;
        jd.ahlz[173] = 7002777328869251992L;
        jd.ahlz[174] = -8682600124109841636L;
        jd.ahlz[175] = -4484128503547052694L;
        jd.ahlz[176] = 616424142387835337L;
        jd.ahlz[177] = -317595807886078033L;
        jd.ahlz[178] = 4112614767588926413L;
        jd.ahlz[179] = 3779393833946099647L;
        jd.ahlz[180] = -4991831284080113732L;
        jd.ahlz[181] = -77094072004961035L;
        jd.ahlz[182] = -1383909034081218595L;
        jd.ahlz[183] = -894490676179112380L;
        jd.ahlz[184] = 7732688808385896329L;
        jd.ahlz[185] = -8447056005400861720L;
        jd.ahlz[186] = 9116868928723644482L;
        jd.ahlz[187] = -4286857115032358403L;
        jd.ahlz[188] = -7222831827288560270L;
        jd.ahlz[189] = 8274075324666857787L;
        jd.ahlz[190] = -5909062119413400802L;
        jd.ahlz[191] = -129339831010600419L;
        jd.ahlz[192] = 9110669539251255722L;
        jd.ahlz[193] = 2655869230266605445L;
        jd.ahlz[194] = -4979237784927217025L;
        jd.ahlz[195] = 7138149749478159791L;
        jd.ahlz[196] = 5126424912159164786L;
        jd.ahlz[197] = -3347712762881552888L;
        jd.ahlz[198] = 8009971084878572275L;
        jd.ahlz[199] = -5975058884353840293L;
    }

    private static /* synthetic */ void ajel() {
        jd.ahll[100] = 1278954645;
        jd.ahll[101] = 2059941143;
        jd.ahll[102] = 1245141733;
        jd.ahll[103] = -1033420698;
        jd.ahll[104] = -55721130;
        jd.ahll[105] = -1251697433;
        jd.ahll[106] = -1184829190;
        jd.ahll[107] = 814670568;
        jd.ahll[108] = 1906093899;
        jd.ahll[109] = -2143482828;
        jd.ahll[110] = -27991058;
        jd.ahll[111] = 2045401827;
        jd.ahll[112] = 1739415291;
        jd.ahll[113] = 610817235;
        jd.ahll[114] = 1532828113;
        jd.ahll[115] = -1462927578;
        jd.ahll[116] = 105074629;
        jd.ahll[117] = -810600590;
        jd.ahll[118] = 64045345;
        jd.ahll[119] = -1900829561;
        jd.ahll[120] = -684361640;
        jd.ahll[121] = 680611581;
        jd.ahll[122] = 1171972699;
        jd.ahll[123] = 1089868258;
        jd.ahll[124] = 946423400;
        jd.ahll[125] = -417149373;
        jd.ahll[126] = -462391596;
        jd.ahll[127] = -492359582;
        jd.ahll[128] = -1305263203;
        jd.ahll[129] = 425063385;
        jd.ahll[130] = -1226139448;
        jd.ahll[131] = 1253702654;
        jd.ahll[132] = 1458083279;
        jd.ahll[133] = -720545730;
        jd.ahll[134] = 775135411;
        jd.ahll[135] = 1645312070;
        jd.ahll[136] = 1326173808;
        jd.ahll[137] = 8550975;
        jd.ahll[138] = -289192993;
        jd.ahll[139] = 1284255071;
        jd.ahll[140] = 1563606345;
        jd.ahll[141] = 1281240476;
        jd.ahll[142] = 2006779966;
        jd.ahll[143] = -1092882100;
        jd.ahll[144] = -865453463;
        jd.ahll[145] = 546754540;
        jd.ahll[146] = 446800249;
        jd.ahll[147] = -113606290;
        jd.ahll[148] = 1857559385;
        jd.ahll[149] = -536713283;
        jd.ahll[150] = -152007864;
        jd.ahll[151] = 823111757;
        jd.ahll[152] = 246073236;
        jd.ahll[153] = -1261891073;
        jd.ahll[154] = 1679324420;
        jd.ahll[155] = 967191448;
        jd.ahll[156] = -1310121931;
        jd.ahll[157] = -473538143;
        jd.ahll[158] = 1370116729;
        jd.ahll[159] = -1302847894;
        jd.ahll[160] = -357781774;
        jd.ahll[161] = 529990406;
        jd.ahll[162] = -740550991;
        jd.ahll[163] = -1360986939;
        jd.ahll[164] = -1404363762;
        jd.ahll[165] = 999878459;
        jd.ahll[166] = -553949246;
        jd.ahll[167] = 1285848856;
        jd.ahll[168] = 1819865712;
        jd.ahll[169] = 1541741846;
        jd.ahll[170] = -1171280679;
        jd.ahll[171] = 1244341671;
        jd.ahll[172] = 397279560;
        jd.ahll[173] = 773925380;
        jd.ahll[174] = -604461014;
        jd.ahll[175] = -278861718;
        jd.ahll[176] = 438535572;
        jd.ahll[177] = -1891159274;
        jd.ahll[178] = -1450165291;
        jd.ahll[179] = -1668908892;
        jd.ahll[180] = 272123050;
        jd.ahll[181] = -11301570;
        jd.ahll[182] = -1386851368;
        jd.ahll[183] = -984082793;
        jd.ahll[184] = 1252915089;
        jd.ahll[185] = -600284855;
        jd.ahll[186] = -1078967678;
        jd.ahll[187] = 1198120906;
        jd.ahll[188] = -1500136666;
        jd.ahll[189] = -132215670;
        jd.ahll[190] = -945353472;
        jd.ahll[191] = -1761516247;
        jd.ahll[192] = 673570678;
        jd.ahll[193] = -1525601548;
        jd.ahll[194] = -1724018851;
        jd.ahll[195] = 855250181;
        jd.ahll[196] = -1108696206;
        jd.ahll[197] = -1152304453;
        jd.ahll[198] = -549289636;
        jd.ahll[199] = 787988831;
    }

    private static /* synthetic */ void ajee() {
        jd.ahlk[200] = 999978979;
        jd.ahlk[201] = 1791841850;
        jd.ahlk[202] = -226659193;
        jd.ahlk[203] = -800799121;
        jd.ahlk[204] = -1258881636;
        jd.ahlk[205] = -2126469117;
        jd.ahlk[206] = -849010787;
        jd.ahlk[207] = 1670223142;
        jd.ahlk[208] = -503106821;
        jd.ahlk[209] = 1091206572;
        jd.ahlk[210] = -543257949;
        jd.ahlk[211] = -58480870;
        jd.ahlk[212] = -1653963699;
        jd.ahlk[213] = 1241652096;
        jd.ahlk[214] = -1066798602;
        jd.ahlk[215] = 1217272847;
        jd.ahlk[216] = 326874269;
        jd.ahlk[217] = 1939912851;
        jd.ahlk[218] = -870617181;
        jd.ahlk[219] = 323914595;
        jd.ahlk[220] = 1188417443;
        jd.ahlk[221] = -116014323;
        jd.ahlk[222] = 336250210;
        jd.ahlk[223] = 1663354586;
        jd.ahlk[224] = 118791530;
        jd.ahlk[225] = -1971858444;
        jd.ahlk[226] = -1018768184;
        jd.ahlk[227] = 88381014;
        jd.ahlk[228] = -391297230;
        jd.ahlk[229] = -326699884;
        jd.ahlk[230] = 437165924;
        jd.ahlk[231] = -1588433398;
        jd.ahlk[232] = 4007576;
        jd.ahlk[233] = 1095920164;
        jd.ahlk[234] = 550936762;
        jd.ahlk[235] = 1508444963;
        jd.ahlk[236] = 551035194;
        jd.ahlk[237] = 365597619;
        jd.ahlk[238] = -636335982;
        jd.ahlk[239] = 767605197;
        jd.ahlk[240] = 212389069;
        jd.ahlk[241] = -1456061587;
        jd.ahlk[242] = 2035383755;
        jd.ahlk[243] = -1617210662;
        jd.ahlk[244] = 1171387717;
        jd.ahlk[245] = 1808013819;
        jd.ahlk[246] = -448889893;
        jd.ahlk[247] = 1722785206;
        jd.ahlk[248] = -1456192734;
        jd.ahlk[249] = 1411865933;
        jd.ahlk[250] = -273015410;
        jd.ahlk[251] = 1985930773;
        jd.ahlk[252] = 1563834589;
        jd.ahlk[253] = -1914603663;
        jd.ahlk[254] = -1434505900;
        jd.ahlk[255] = 2045937766;
        jd.ahlk[256] = -1880444092;
        jd.ahlk[257] = 1181408587;
        jd.ahlk[258] = -1631331836;
        jd.ahlk[259] = 1716972875;
        jd.ahlk[260] = 523279461;
        jd.ahlk[261] = 1728404846;
        jd.ahlk[262] = 1293674697;
        jd.ahlk[263] = -956663007;
        jd.ahlk[264] = 76741642;
        jd.ahlk[265] = 1969099678;
        jd.ahlk[266] = 42112920;
        jd.ahlk[267] = -1796363466;
        jd.ahlk[268] = -1757439012;
        jd.ahlk[269] = 1180695485;
        jd.ahlk[270] = 1111551265;
        jd.ahlk[271] = 240429406;
        jd.ahlk[272] = 1440357072;
        jd.ahlk[273] = -228754103;
        jd.ahlk[274] = 62870615;
        jd.ahlk[275] = -2046353067;
        jd.ahlk[276] = 889494838;
        jd.ahlk[277] = 2032072380;
        jd.ahlk[278] = 1861826050;
        jd.ahlk[279] = 2021472747;
        jd.ahlk[280] = -363680195;
        jd.ahlk[281] = 778551649;
        jd.ahlk[282] = 561041672;
        jd.ahlk[283] = -952174651;
        jd.ahlk[284] = -894281728;
        jd.ahlk[285] = -788652467;
        jd.ahlk[286] = 1636589993;
        jd.ahlk[287] = 613065109;
        jd.ahlk[288] = -1144097726;
        jd.ahlk[289] = 2085454530;
        jd.ahlk[290] = -762969937;
        jd.ahlk[291] = -577528185;
        jd.ahlk[292] = 1803298164;
        jd.ahlk[293] = 1487229740;
        jd.ahlk[294] = -1495279618;
        jd.ahlk[295] = 1141835168;
        jd.ahlk[296] = -430025672;
        jd.ahlk[297] = -1855397257;
        jd.ahlk[298] = 1577686065;
        jd.ahlk[299] = -1430543415;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ IOException lambda$prepareAvatar$7() {
        v0 /* !! */  = jd.bz;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - jd.ahlm("aivv", ahlx(int ), (int)248));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2053357414: {
                    break block26;
                }
                case -1171028058: {
                    v1 = jd.ahlm("aivw", ahlx(int ), (int)249);
                    continue block26;
                }
                case 2124196438: {
                    v1 = jd.ahlm("aivx", ahlx(int ), (int)250);
                    continue block26;
                }
            }
            break;
        }
        var2 = jd.c;
        v2 /* !! */  = jd.bz;
        if (true) ** GOTO lbl19
        block27: while (true) {
            v2 /* !! */  = (long)(jd.ahlm("aivz", ahlx(int ), (int)252) - jd.ahlm("aivy", ahlx(int ), (int)251));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2053357414: {
                    break block27;
                }
                case -560035801: {
                    continue block27;
                }
            }
            break;
        }
        var1_1 /* !! */  = jd.b;
        v3 /* !! */  = jd.bz;
        if (true) ** GOTO lbl29
        block28: while (true) {
            v3 /* !! */  = (long)(v4 - jd.ahlm("aiwa", ahlx(int ), (int)253));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2053357414: {
                    break block28;
                }
                case -954342859: {
                    v4 = jd.ahlm("aiwb", ahlx(int ), (int)254);
                    continue block28;
                }
                case -336761315: {
                    v4 = jd.ahlm("aiwc", ahlx(int ), (int)255);
                    continue block28;
                }
                case -306004308: {
                    v4 = jd.ahlm("aiwd", ahlx(int ), (int)256);
                    continue block28;
                }
            }
            break;
        }
        var0_2 = jd.a;
        if (var2) {
            throw null;
lbl44:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl44
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block15 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v5 /* !! */  = jd.bz;
                if (true) ** GOTO lbl55
                block30: while (true) {
                    v5 /* !! */  = (long)(v6 - jd.ahlm("aiwe", ahlx(int ), (int)257));
lbl55:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2053357414: {
                            break block30;
                        }
                        case 1121619256: {
                            v6 = jd.ahlm("aiwf", ahlx(int ), (int)258);
                            continue block30;
                        }
                        case 1572749195: {
                            v6 = jd.ahlm("aiwg", ahlx(int ), (int)259);
                            continue block30;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_0 = jd.bz - jd.ahlm("aiwh", ahlx(int ), (int)260)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == jd.ahlm("aiwi", ahlj(int ), (int)680)) break;
                    v7 /* !! */  = (long)jd.ahlm("aiwj", ahlj(int ), (int)681);
                }
                return new IOException("avatar.json not found");
            }
            case 0: {
                var1_1 /* !! */  = (int)jd.ahlm("aiwk", ahlj(int ), (int)682);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl80
            }
            case 1: {
                var1_1 /* !! */  = (int)jd.ahlm("aiwl", ahlj(int ), (int)683);
                if (!var2) break;
                throw null;
            }
lbl80:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)jd.ahlm("aiwm", ahlj(int ), (int)684);
                    if (!var2) break block15;
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)jd.ahlm("aiwn", ahlj(int ), (int)685);
        ** while (!var2)
lbl88:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jd.bz - jd.ahlm("aicw", ahlx(int ), (int)137)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jd.ahlm("aicx", ahlj(int ), (int)298)) break;
            v0 /* !! */  = (long)jd.ahlm("aicy", ahlj(int ), (int)299);
        }
        var3_1 = jd.c;
        v1 /* !! */  = jd.bz;
        if (true) ** GOTO lbl11
        block40: while (true) {
            v1 /* !! */  = (long)(v2 - jd.ahlm("aicz", ahlx(int ), (int)138));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2053357414: {
                    break block40;
                }
                case -1791569981: {
                    v2 = jd.ahlm("aida", ahlx(int ), (int)139);
                    continue block40;
                }
                case -324171880: {
                    v2 = jd.ahlm("aidb", ahlx(int ), (int)140);
                    continue block40;
                }
            }
            break;
        }
        var2_2 /* !! */  = jd.b;
        v3 /* !! */  = jd.bz;
        if (true) ** GOTO lbl25
        block41: while (true) {
            v3 /* !! */  = (long)(jd.ahlm("aidd", ahlx(int ), (int)142) - jd.ahlm("aidc", ahlx(int ), (int)141));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2053357414: {
                    break block41;
                }
                case -1257348451: {
                    continue block41;
                }
            }
            break;
        }
        var1_3 = jd.a;
        if (var3_1) {
            throw null;
lbl33:
            // 9 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl33
        v4 /* !! */  = jd.bz;
        if (true) ** GOTO lbl40
        block43: while (true) {
            v4 /* !! */  = (long)(v5 - jd.ahlm("aide", ahlx(int ), (int)143));
lbl40:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2053357414: {
                    break block43;
                }
                case -1523324895: {
                    v5 = jd.ahlm("aidf", ahlx(int ), (int)144);
                    continue block43;
                }
                case -1510024740: {
                    v5 = jd.ahlm("aidg", ahlx(int ), (int)145);
                    continue block43;
                }
                case 1481698880: {
                    v5 = jd.ahlm("aidh", ahlx(int ), (int)146);
                    continue block43;
                }
            }
            break;
        }
        this.loadedModel = null;
        if (var1_3 || var1_3) ** GOTO lbl33
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = jd.bz - jd.ahlm("aidi", ahlx(int ), (int)147)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == jd.ahlm("aidj", ahlj(int ), (int)300)) break;
            v6 /* !! */  = (long)jd.ahlm("aidk", ahlj(int ), (int)301);
        }
        this.friendSourceAvatar = null;
        if (var1_3 || var1_3) ** GOTO lbl33
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = jd.bz - jd.ahlm("aidl", ahlx(int ), (int)148)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == jd.ahlm("aidm", ahlj(int ), (int)302)) break;
            v7 /* !! */  = (long)jd.ahlm("aidn", ahlj(int ), (int)303);
        }
        this.clearAppliedFriendModels();
        if (var1_3) ** GOTO lbl33
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block15 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl33
                v8 = jd.ahlm("aido", ahlj(int ), (int)304);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = jd.bz - jd.ahlm("aidp", ahlx(int ), (int)149)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == jd.ahlm("aidq", ahlj(int ), (int)305)) break;
                    v9 /* !! */  = (long)jd.ahlm("aidr", ahlj(int ), (int)306);
                }
                PhobiaFiguraBridge.setCustomModelsActive((boolean)v8);
                if (var1_3 || var1_3) ** GOTO lbl33
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = jd.bz - jd.ahlm("aids", ahlx(int ), (int)150)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == jd.ahlm("aidt", ahlj(int ), (int)307)) break;
                    v10 /* !! */  = (long)jd.ahlm("aidu", ahlj(int ), (int)308);
                }
                if (!jd.isFiguraReady()) ** GOTO lbl105
                if (var1_3) ** GOTO lbl33
                v11 /* !! */  = jd.bz;
                if (true) ** GOTO lbl91
                block48: while (true) {
                    v11 /* !! */  = (long)(v12 - jd.ahlm("aidv", ahlx(int ), (int)151));
lbl91:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -2053357414: {
                            break block48;
                        }
                        case -1011386743: {
                            v12 = jd.ahlm("aidw", ahlx(int ), (int)152);
                            continue block48;
                        }
                        case 747295717: {
                            v12 = jd.ahlm("aidx", ahlx(int ), (int)153);
                            continue block48;
                        }
                        case 1142867231: {
                            v12 = jd.ahlm("aidy", ahlx(int ), (int)154);
                            continue block48;
                        }
                    }
                    break;
                }
                this.loadSelected();
                if (var1_3) ** GOTO lbl33
lbl105:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl108:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)jd.ahlm("aidz", ahlj(int ), (int)309);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl113:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)jd.ahlm("aiea", ahlj(int ), (int)310);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl118:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)jd.ahlm("aieb", ahlj(int ), (int)311);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl123:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)jd.ahlm("aiec", ahlj(int ), (int)312);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl147
            }
            case 4: {
                var2_2 /* !! */  = (int)jd.ahlm("aied", ahlj(int ), (int)313);
                if (!var3_1) ** GOTO lbl108
                throw null;
            }
lbl132:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jd.ahlm("aiee", ahlj(int ), (int)314);
                    if (!var3_1) break block15;
                    throw null;
                }
            }
            case 6: {
                var2_2 /* !! */  = (int)jd.ahlm("aief", ahlj(int ), (int)315);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 7: {
                do {
                    var2_2 /* !! */  = (int)jd.ahlm("aieg", ahlj(int ), (int)316);
                } while (!var3_1);
                throw null;
            }
lbl147:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)jd.ahlm("aieh", ahlj(int ), (int)317);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl160
            }
            case 9: {
                var2_2 /* !! */  = (int)jd.ahlm("aiei", ahlj(int ), (int)318);
                if (!var3_1) ** GOTO lbl113
                throw null;
            }
lbl156:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)jd.ahlm("aiej", ahlj(int ), (int)319);
                if (!var3_1) ** GOTO lbl113
                throw null;
            }
lbl160:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)jd.ahlm("aiek", ahlj(int ), (int)320);
                if (!var3_1) ** GOTO lbl118
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)jd.ahlm("aiel", ahlj(int ), (int)321);
                if (!var3_1) ** GOTO lbl156
                throw null;
            }
lbl168:
            // 3 sources

            case 13: {
                var2_2 /* !! */  = (int)jd.ahlm("aiem", ahlj(int ), (int)322);
                if (!var3_1) ** GOTO lbl132
                throw null;
            }
lbl172:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)jd.ahlm("aien", ahlj(int ), (int)323);
                if (!var3_1) ** GOTO lbl168
                throw null;
            }
            case 15: 
        }
        var2_2 /* !! */  = (int)jd.ahlm("aieo", ahlj(int ), (int)324);
        ** while (!var3_1)
lbl179:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ajey() {
        jd.ahlz[200] = -1144654825890140404L;
        jd.ahlz[201] = 1856531384588720280L;
        jd.ahlz[202] = 8493609618333609787L;
        jd.ahlz[203] = 134764294600485368L;
        jd.ahlz[204] = 5152734922519936355L;
        jd.ahlz[205] = 1520197632940993982L;
        jd.ahlz[206] = -3799592345288655869L;
        jd.ahlz[207] = -732117721571442315L;
        jd.ahlz[208] = -397252455949410566L;
        jd.ahlz[209] = -1679792229393756783L;
        jd.ahlz[210] = 3918490158977454688L;
        jd.ahlz[211] = -2059060334768164825L;
        jd.ahlz[212] = 5822605609502898466L;
        jd.ahlz[213] = -1698067273500401749L;
        jd.ahlz[214] = -8036985077154904137L;
        jd.ahlz[215] = -8381868829142019642L;
        jd.ahlz[216] = 9198261348999694888L;
        jd.ahlz[217] = 5872518991677345467L;
        jd.ahlz[218] = 4594839345581443869L;
        jd.ahlz[219] = -157524902903382813L;
        jd.ahlz[220] = 9097421924642643275L;
        jd.ahlz[221] = 2487476167055096568L;
        jd.ahlz[222] = -4287987178050040241L;
        jd.ahlz[223] = -2886665751437882197L;
        jd.ahlz[224] = 2452089677656974150L;
        jd.ahlz[225] = -4964073641582345577L;
        jd.ahlz[226] = -3495335363480054126L;
        jd.ahlz[227] = 2233763782470732285L;
        jd.ahlz[228] = -5743873528770989493L;
        jd.ahlz[229] = -2910744737891167894L;
        jd.ahlz[230] = 894340102293579930L;
        jd.ahlz[231] = 8540313690969089557L;
        jd.ahlz[232] = -3840511821120161986L;
        jd.ahlz[233] = 1428291964250737358L;
        jd.ahlz[234] = 1836670502208552719L;
        jd.ahlz[235] = 8602913431473746317L;
        jd.ahlz[236] = 5218392488725665869L;
        jd.ahlz[237] = 7607232478594862457L;
        jd.ahlz[238] = -3828345947164533615L;
        jd.ahlz[239] = -8954773725313205146L;
        jd.ahlz[240] = -3557816520615906745L;
        jd.ahlz[241] = 5305399600794401110L;
        jd.ahlz[242] = 2121513109575147888L;
        jd.ahlz[243] = -5268623172366249558L;
        jd.ahlz[244] = 1858190397812225358L;
        jd.ahlz[245] = 2311598606723937177L;
        jd.ahlz[246] = 8894785162220175856L;
        jd.ahlz[247] = -4501776470072506613L;
        jd.ahlz[248] = -8657696481529841267L;
        jd.ahlz[249] = -1050387993507088373L;
        jd.ahlz[250] = 8640066186222352216L;
        jd.ahlz[251] = 3629868600572148986L;
        jd.ahlz[252] = -6089409075210274891L;
        jd.ahlz[253] = -3613362616815115654L;
        jd.ahlz[254] = 1436570147263662531L;
        jd.ahlz[255] = 7846532578903328769L;
        jd.ahlz[256] = -2326403457472216580L;
        jd.ahlz[257] = -2933653922623907235L;
        jd.ahlz[258] = 5830969156070263739L;
        jd.ahlz[259] = 9199159096643726039L;
        jd.ahlz[260] = 4917863189388758781L;
        jd.ahlz[261] = 406888029724844439L;
        jd.ahlz[262] = -8902818353190326394L;
        jd.ahlz[263] = 7579909084843605280L;
        jd.ahlz[264] = 6935845900048764270L;
        jd.ahlz[265] = 5488523134295059319L;
        jd.ahlz[266] = -1022175642804230721L;
        jd.ahlz[267] = -5156953382560577277L;
        jd.ahlz[268] = 4020108524674106721L;
        jd.ahlz[269] = 5701367276367683262L;
        jd.ahlz[270] = -3412218534204778118L;
        jd.ahlz[271] = -4644115448322463548L;
        jd.ahlz[272] = 2257332523493393875L;
        jd.ahlz[273] = -6081746011438791535L;
        jd.ahlz[274] = -7097311634439079927L;
        jd.ahlz[275] = 7021697926238262384L;
        jd.ahlz[276] = -5161321048679439714L;
        jd.ahlz[277] = -7274615423814481262L;
        jd.ahlz[278] = -5125408806415272628L;
        jd.ahlz[279] = -4561221126753959796L;
        jd.ahlz[280] = -2265794211331287510L;
        jd.ahlz[281] = 7441109552016276548L;
        jd.ahlz[282] = -9209707967390919632L;
        jd.ahlz[283] = -5307196599720442957L;
        jd.ahlz[284] = 4942807241803462776L;
        jd.ahlz[285] = 8459948606539512654L;
        jd.ahlz[286] = 6974390430813806597L;
        jd.ahlz[287] = -1788400691912114033L;
        jd.ahlz[288] = 767319587175377454L;
        jd.ahlz[289] = -1569489162947638105L;
        jd.ahlz[290] = 5168947851153108292L;
        jd.ahlz[291] = -8465582411751742373L;
        jd.ahlz[292] = -4497842137850477619L;
        jd.ahlz[293] = 8124605582792417424L;
        jd.ahlz[294] = -998722133932492466L;
        jd.ahlz[295] = 2903920688145530061L;
        jd.ahlz[296] = 6290209665976296667L;
        jd.ahlz[297] = -6834230353080691745L;
        jd.ahlz[298] = 5744072788303605546L;
        jd.ahlz[299] = 856105805639343641L;
    }

    private static /* synthetic */ void ajeg() {
        jd.ahlk[400] = -424895111;
        jd.ahlk[401] = 438374773;
        jd.ahlk[402] = -1181442449;
        jd.ahlk[403] = -940832710;
        jd.ahlk[404] = 733017067;
        jd.ahlk[405] = -1006013538;
        jd.ahlk[406] = 2030817634;
        jd.ahlk[407] = 1062097029;
        jd.ahlk[408] = -81931036;
        jd.ahlk[409] = 1685117682;
        jd.ahlk[410] = -249226027;
        jd.ahlk[411] = -704476054;
        jd.ahlk[412] = -817401370;
        jd.ahlk[413] = 1506698590;
        jd.ahlk[414] = -607973821;
        jd.ahlk[415] = -790521030;
        jd.ahlk[416] = 675975483;
        jd.ahlk[417] = 1011711471;
        jd.ahlk[418] = -485682633;
        jd.ahlk[419] = 1820293091;
        jd.ahlk[420] = -244357724;
        jd.ahlk[421] = -1231562499;
        jd.ahlk[422] = -163112905;
        jd.ahlk[423] = 327602500;
        jd.ahlk[424] = -364538206;
        jd.ahlk[425] = 1187191205;
        jd.ahlk[426] = 1338720489;
        jd.ahlk[427] = -904414450;
        jd.ahlk[428] = 1247545586;
        jd.ahlk[429] = 1956209743;
        jd.ahlk[430] = -2067816916;
        jd.ahlk[431] = 481900832;
        jd.ahlk[432] = 868760124;
        jd.ahlk[433] = -745594524;
        jd.ahlk[434] = -1146104030;
        jd.ahlk[435] = 894100563;
        jd.ahlk[436] = -132439145;
        jd.ahlk[437] = 870242061;
        jd.ahlk[438] = 828098388;
        jd.ahlk[439] = 460599806;
        jd.ahlk[440] = -87238514;
        jd.ahlk[441] = -1435615651;
        jd.ahlk[442] = 780757198;
        jd.ahlk[443] = -1042080148;
        jd.ahlk[444] = 117920835;
        jd.ahlk[445] = 1269691501;
        jd.ahlk[446] = -1078353568;
        jd.ahlk[447] = -1635500093;
        jd.ahlk[448] = -2142492208;
        jd.ahlk[449] = -1126731685;
        jd.ahlk[450] = -175848203;
        jd.ahlk[451] = -1241873009;
        jd.ahlk[452] = 620235903;
        jd.ahlk[453] = 520297666;
        jd.ahlk[454] = 1532813162;
        jd.ahlk[455] = 1245521970;
        jd.ahlk[456] = -1839046010;
        jd.ahlk[457] = 2060107457;
        jd.ahlk[458] = 666967457;
        jd.ahlk[459] = -1784247265;
        jd.ahlk[460] = 998660435;
        jd.ahlk[461] = 1204454975;
        jd.ahlk[462] = 2110711555;
        jd.ahlk[463] = -14213400;
        jd.ahlk[464] = -1610209333;
        jd.ahlk[465] = 596998075;
        jd.ahlk[466] = -774734550;
        jd.ahlk[467] = 503017064;
        jd.ahlk[468] = -785350832;
        jd.ahlk[469] = 1574437921;
        jd.ahlk[470] = 440545698;
        jd.ahlk[471] = 1400177091;
        jd.ahlk[472] = 1891324026;
        jd.ahlk[473] = -441580992;
        jd.ahlk[474] = 967609744;
        jd.ahlk[475] = 475641656;
        jd.ahlk[476] = -2140773164;
        jd.ahlk[477] = -52469522;
        jd.ahlk[478] = -573376592;
        jd.ahlk[479] = -380262824;
        jd.ahlk[480] = 1978365824;
        jd.ahlk[481] = 587808279;
        jd.ahlk[482] = -1582321961;
        jd.ahlk[483] = -80227095;
        jd.ahlk[484] = -355939597;
        jd.ahlk[485] = 317670658;
        jd.ahlk[486] = 1556033874;
        jd.ahlk[487] = -1670236897;
        jd.ahlk[488] = -154247029;
        jd.ahlk[489] = -1182043178;
        jd.ahlk[490] = 1322409183;
        jd.ahlk[491] = 299482526;
        jd.ahlk[492] = 1311070782;
        jd.ahlk[493] = 1865462178;
        jd.ahlk[494] = -164633572;
        jd.ahlk[495] = -1188325720;
        jd.ahlk[496] = -888395928;
        jd.ahlk[497] = -1049176582;
        jd.ahlk[498] = 1528882843;
        jd.ahlk[499] = 1084793852;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ void lambda$buildShaderHandsPasses$2(List var0, class_1921 var1_1, int var2_2, int var3_3) {
        v0 /* !! */  = jd.bz;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - jd.ahlm("ajaj", ahlx(int ), (int)304));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2053357414: {
                    break block22;
                }
                case 97300516: {
                    v1 = jd.ahlm("ajak", ahlx(int ), (int)305);
                    continue block22;
                }
                case 281537186: {
                    v1 = jd.ahlm("ajal", ahlx(int ), (int)306);
                    continue block22;
                }
            }
            break;
        }
        var6_4 = jd.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jd.bz - jd.ahlm("ajam", ahlx(int ), (int)307)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jd.ahlm("ajan", ahlj(int ), (int)742)) break;
            v2 /* !! */  = (long)jd.ahlm("ajao", ahlj(int ), (int)743);
        }
        var5_5 /* !! */  = jd.b;
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = jd.bz;
                if (true) ** GOTO lbl28
                block24: while (true) {
                    v3 /* !! */  = (long)(v4 - jd.ahlm("ajap", ahlx(int ), (int)308));
lbl28:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2054301357: {
                            v4 = jd.ahlm("ajaq", ahlx(int ), (int)309);
                            continue block24;
                        }
                        case -2053357414: {
                            break block24;
                        }
                        case -1370540792: {
                            v4 = jd.ahlm("ajar", ahlx(int ), (int)310);
                            continue block24;
                        }
                    }
                    break;
                }
                var4_6 = jd.a;
                if (var6_4) {
                    throw null;
lbl40:
                    // 2 sources

                    return;
                }
                if (var4_6 || var4_6) ** GOTO lbl40
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = jd.bz - jd.ahlm("ajas", ahlx(int ), (int)311)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == jd.ahlm("ajat", ahlj(int ), (int)744)) break;
                    v5 /* !! */  = (long)jd.ahlm("ajau", ahlj(int ), (int)745);
                }
                v6 = PhobiaFiguraBridge.RenderPass.shader((class_1921)var1_1, (int)var2_2, (int)var3_3);
                v7 /* !! */  = jd.bz;
                if (true) ** GOTO lbl53
                block27: while (true) {
                    v7 /* !! */  = (long)(v8 - jd.ahlm("ajav", ahlx(int ), (int)312));
lbl53:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2053357414: {
                            break block27;
                        }
                        case -257066745: {
                            v8 = jd.ahlm("ajaw", ahlx(int ), (int)313);
                            continue block27;
                        }
                        case 1115685229: {
                            v8 = jd.ahlm("ajax", ahlx(int ), (int)314);
                            continue block27;
                        }
                    }
                    break;
                }
                var0.add(v6);
                if (!var4_6) ** break;
                ** continue;
                return;
            }
            case 0: {
                var5_5 /* !! */  = (int)jd.ahlm("ajay", ahlj(int ), (int)746);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl80
            }
lbl72:
            // 2 sources

            case 1: {
                var5_5 /* !! */  = (int)jd.ahlm("ajaz", ahlj(int ), (int)747);
                if (!var6_4) break;
                throw null;
            }
            case 2: {
                var5_5 /* !! */  = (int)jd.ahlm("ajba", ahlj(int ), (int)748);
                if (!var6_4) ** GOTO lbl72
                throw null;
            }
lbl80:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_5 /* !! */  = (int)jd.ahlm("ajbb", ahlj(int ), (int)749);
                    if (!var6_4) break block5;
                    throw null;
                }
            }
            case 4: 
        }
        var5_5 /* !! */  = (int)jd.ahlm("ajbc", ahlj(int ), (int)750);
        ** while (!var6_4)
lbl88:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean appliesTo(class_11890 var0) {
        block93: {
            block92: {
                block91: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = jd.bz - jd.ahlm("ahma", ahlx(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == jd.ahlm("ahmb", ahlj(int ), (int)10)) break;
                        v0 /* !! */  = (long)jd.ahlm("ahmc", ahlj(int ), (int)11);
                    }
                    var5_1 = jd.c;
                    v1 /* !! */  = jd.bz;
                    if (true) ** GOTO lbl11
                    block55: while (true) {
                        v1 /* !! */  = (long)(jd.ahlm("ahme", ahlx(int ), (int)2) - jd.ahlm("ahmd", ahlx(int ), (int)1));
lbl11:
                        // 2 sources

                        switch ((int)v1 /* !! */ ) {
                            case -2053357414: {
                                break block55;
                            }
                            case -377768961: {
                                continue block55;
                            }
                        }
                        break;
                    }
                    var4_2 /* !! */  = jd.b;
                    while (true) {
                        if ((v2 /* !! */  = (cfr_temp_1 = jd.bz - jd.ahlm("ahmg", ahlx(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v2 /* !! */  == jd.ahlm("ahmh", ahlj(int ), (int)12)) break;
                        v2 /* !! */  = (long)jd.ahlm("ahmi", ahlj(int ), (int)13);
                    }
                    var3_3 = jd.a;
                    if (var5_1) {
                        throw null;
lbl25:
                        // 14 sources

                        return (boolean)jd.ahlm("ahmj", ahlj(int ), (int)14);
                    }
                    if (var3_3 || var3_3) ** GOTO lbl25
                    v3 /* !! */  = jd.bz;
                    if (true) ** GOTO lbl32
                    block58: while (true) {
                        v3 /* !! */  = (long)(v4 - jd.ahlm("ahmk", ahlx(int ), (int)4));
lbl32:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -2053357414: {
                                break block58;
                            }
                            case -1175444701: {
                                v4 = jd.ahlm("ahml", ahlx(int ), (int)5);
                                continue block58;
                            }
                            case -248394403: {
                                v4 = jd.ahlm("ahmm", ahlx(int ), (int)6);
                                continue block58;
                            }
                            case 1802213127: {
                                v4 = jd.ahlm("ahmn", ahlx(int ), (int)7);
                                continue block58;
                            }
                        }
                        break;
                    }
                    var1_4 = jd.instance;
                    if (var3_3 || var3_3) ** GOTO lbl25
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_2 = jd.bz - jd.ahlm("ahmo", ahlx(int ), (int)8)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  == jd.ahlm("ahmp", ahlj(int ), (int)15)) break;
                        v5 /* !! */  = (long)jd.ahlm("ahmq", ahlj(int ), (int)16);
                    }
                    var2_5 = class_310.method_1551();
                    if (var3_3 || var3_3) ** GOTO lbl25
                    if (var1_4 == null) break block91;
                    if (var3_3) ** GOTO lbl25
                    while (true) {
                        if ((v6 /* !! */  = (cfr_temp_3 = jd.bz - jd.ahlm("ahmr", ahlx(int ), (int)9)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v6 /* !! */  == jd.ahlm("ahms", ahlj(int ), (int)17)) break;
                        v6 /* !! */  = (long)jd.ahlm("ahmt", ahlj(int ), (int)18);
                    }
                    if (!var1_4.isState()) break block91;
                    if (var3_3 || var3_3) ** GOTO lbl25
                    v7 /* !! */  = jd.bz;
                    if (true) ** GOTO lbl66
                    block61: while (true) {
                        v7 /* !! */  = (long)(v8 - jd.ahlm("ahmu", ahlx(int ), (int)10));
lbl66:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -2053357414: {
                                break block61;
                            }
                            case 310276687: {
                                v8 = jd.ahlm("ahmv", ahlx(int ), (int)11);
                                continue block61;
                            }
                            case 1873721757: {
                                v8 = jd.ahlm("ahmw", ahlx(int ), (int)12);
                                continue block61;
                            }
                        }
                        break;
                    }
                    if (!PhobiaFiguraBridge.isCustomModelsActive()) break block91;
                    if (var3_3) ** GOTO lbl25
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_4 = jd.bz - jd.ahlm("ahmx", ahlx(int ), (int)13)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  == jd.ahlm("ahmy", ahlj(int ), (int)19)) break;
                        v9 /* !! */  = (long)jd.ahlm("ahmz", ahlj(int ), (int)20);
                    }
                    if (var2_5.field_1724 != null) break block92;
                    if (var3_3) ** GOTO lbl25
                }
                if (var3_3 || var3_3) ** GOTO lbl25
                return (boolean)jd.ahlm("ahna", ahlj(int ), (int)21);
            }
            if (var3_3 || var3_3) ** GOTO lbl25
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_5 = jd.bz - jd.ahlm("ahnb", ahlx(int ), (int)14)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == jd.ahlm("ahnc", ahlj(int ), (int)22)) break;
                v10 /* !! */  = (long)jd.ahlm("ahnd", ahlj(int ), (int)23);
            }
            if (var0 == var2_5.field_1724) break block93;
            if (var3_3) ** GOTO lbl25
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_6 = jd.bz - jd.ahlm("ahnf", ahlx(int ), (int)15)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == jd.ahlm("ahng", ahlj(int ), (int)24)) break;
                v11 /* !! */  = (long)jd.ahlm("ahnh", ahlj(int ), (int)25);
            }
            v12 = var1_4.onFriends;
            v13 /* !! */  = jd.bz;
            if (true) ** GOTO lbl106
            block65: while (true) {
                v13 /* !! */  = (long)(v14 - jd.ahlm("ahni", ahlx(int ), (int)16));
lbl106:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -2053357414: {
                        break block65;
                    }
                    case -1091676211: {
                        v14 = jd.ahlm("ahnj", ahlx(int ), (int)17);
                        continue block65;
                    }
                    case 174339935: {
                        v14 = jd.ahlm("ahnk", ahlx(int ), (int)18);
                        continue block65;
                    }
                    case 2119660950: {
                        v14 = jd.ahlm("ahnl", ahlx(int ), (int)19);
                        continue block65;
                    }
                }
                break;
            }
            if (!v12.isValue()) ** GOTO lbl147
            if (var3_3) ** GOTO lbl25
            v15 /* !! */  = jd.bz;
            if (true) ** GOTO lbl124
            block66: while (true) {
                v15 /* !! */  = (long)(v16 - jd.ahlm("ahnm", ahlx(int ), (int)20));
lbl124:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -2088671903: {
                        v16 = jd.ahlm("ahnn", ahlx(int ), (int)21);
                        continue block66;
                    }
                    case -2053357414: {
                        break block66;
                    }
                    case -1494599197: {
                        v16 = jd.ahlm("ahno", ahlx(int ), (int)22);
                        continue block66;
                    }
                    case -273633493: {
                        v16 = jd.ahlm("ahnp", ahlx(int ), (int)23);
                        continue block66;
                    }
                }
                break;
            }
            if (!dl.isFriend((class_1297)var0)) ** GOTO lbl147
            if (var3_3) ** GOTO lbl25
        }
        if (var3_3 || var3_3) ** GOTO lbl25
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v17 = jd.ahlm("ahnq", ahlj(int ), (int)26);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl147:
            // 2 sources

            if (!var3_3 && !var3_3) ** break;
            ** continue;
            v17 = jd.ahlm("ahnr", ahlj(int ), (int)27);
lbl150:
            // 2 sources

            return (boolean)v17;
            case 0: {
                var4_2 /* !! */  = (int)jd.ahlm("ahns", ahlj(int ), (int)28);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl156:
            // 3 sources

            case 1: {
                var4_2 /* !! */  = (int)jd.ahlm("ahnt", ahlj(int ), (int)29);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl161:
            // 3 sources

            case 2: {
                var4_2 /* !! */  = (int)jd.ahlm("ahnu", ahlj(int ), (int)30);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl226
            }
            case 3: {
                var4_2 /* !! */  = (int)jd.ahlm("ahnv", ahlj(int ), (int)31);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl247
            }
            case 4: {
                var4_2 /* !! */  = (int)jd.ahlm("ahnw", ahlj(int ), (int)32);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl176:
            // 2 sources

            case 5: {
                var4_2 /* !! */  = (int)jd.ahlm("ahnx", ahlj(int ), (int)33);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl181:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)jd.ahlm("ahny", ahlj(int ), (int)34);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl186:
            // 2 sources

            case 7: {
                var4_2 /* !! */  = (int)jd.ahlm("ahnz", ahlj(int ), (int)35);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl191:
            // 2 sources

            case 8: {
                var4_2 /* !! */  = (int)jd.ahlm("ahoa", ahlj(int ), (int)36);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl196:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)jd.ahlm("ahob", ahlj(int ), (int)37);
                if (!var5_1) ** GOTO lbl156
                throw null;
            }
lbl200:
            // 2 sources

            case 10: {
                var4_2 /* !! */  = (int)jd.ahlm("ahoc", ahlj(int ), (int)38);
                if (var5_1) {
                    throw null;
                }
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)jd.ahlm("ahod", ahlj(int ), (int)39);
                    if (!var5_1) ** GOTO lbl191
                    throw null;
                }
            }
lbl209:
            // 2 sources

            case 12: {
                var4_2 /* !! */  = (int)jd.ahlm("ahoe", ahlj(int ), (int)40);
                if (!var5_1) break;
                throw null;
            }
lbl213:
            // 2 sources

            case 13: {
                var4_2 /* !! */  = (int)jd.ahlm("ahof", ahlj(int ), (int)41);
                if (!var5_1) ** GOTO lbl176
                throw null;
            }
            case 14: {
                var4_2 /* !! */  = (int)jd.ahlm("ahoh", ahlj(int ), (int)42);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl222:
            // 2 sources

            case 15: {
                var4_2 /* !! */  = (int)jd.ahlm("ahoi", ahlj(int ), (int)43);
                if (!var5_1) ** GOTO lbl186
                throw null;
            }
lbl226:
            // 3 sources

            case 16: {
                var4_2 /* !! */  = (int)jd.ahlm("ahoj", ahlj(int ), (int)44);
                if (!var5_1) break;
                throw null;
            }
lbl230:
            // 3 sources

            case 17: {
                var4_2 /* !! */  = (int)jd.ahlm("ahok", ahlj(int ), (int)45);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl243
            }
lbl235:
            // 2 sources

            case 18: {
                var4_2 /* !! */  = (int)jd.ahlm("ahom", ahlj(int ), (int)46);
                if (!var5_1) ** GOTO lbl161
                throw null;
            }
lbl239:
            // 2 sources

            case 19: {
                var4_2 /* !! */  = (int)jd.ahlm("ahon", ahlj(int ), (int)47);
                if (!var5_1) ** GOTO lbl196
                throw null;
            }
lbl243:
            // 2 sources

            case 20: {
                var4_2 /* !! */  = (int)jd.ahlm("ahoo", ahlj(int ), (int)48);
                if (!var5_1) ** GOTO lbl213
                throw null;
            }
lbl247:
            // 2 sources

            case 21: {
                var4_2 /* !! */  = (int)jd.ahlm("ahop", ahlj(int ), (int)49);
                if (!var5_1) ** GOTO lbl156
                throw null;
            }
            case 22: {
                var4_2 /* !! */  = (int)jd.ahlm("ahoq", ahlj(int ), (int)50);
                if (!var5_1) ** GOTO lbl239
                throw null;
            }
            case 23: {
                var4_2 /* !! */  = (int)jd.ahlm("ahor", ahlj(int ), (int)51);
                if (!var5_1) ** GOTO lbl181
                throw null;
            }
            case 24: 
        }
        var4_2 /* !! */  = (int)jd.ahlm("ahos", ahlj(int ), (int)52);
        ** while (!var5_1)
lbl262:
        // 1 sources

        throw null;
    }
}

