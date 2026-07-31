/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.liteapi;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.liteapi.a;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.ModuleManager;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001DB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\b\n\u0010\u0003J\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u00a2\u0006\u0004\b\u000f\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0003J\u001d\u0010\u001a\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00182\u0006\u0010\u001e\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\u0011*\u00020\u0011H\u0002\u00a2\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00110\u0018H\u0002\u00a2\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b&\u0010\u0016R\u0014\u0010'\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020)8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b/\u0010+R\u0014\u00100\u001a\u00020\f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b0\u00101R\u001c\u00104\u001a\n 3*\u0004\u0018\u000102028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b7\u00108R$\u0010;\u001a\u0012\u0012\u0004\u0012\u00020\u001109j\b\u0012\u0004\u0012\u00020\u0011`:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b;\u0010<R<\u0010?\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00180=j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0018`>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bA\u0010.R\u0016\u0010B\u001a\u00020)8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bB\u0010+R\u0016\u0010C\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bC\u00101\u00a8\u0006E"}, d2={"Lkotakbaz/rain/client/liteapi/HolyWorldFeatureControl;", "", "<init>", "()V", "", "Lkotakbaz/rain/module/Module;", "modules", "", "load", "(Ljava/util/List;)V", "tick", "module", "", "isBlocked", "(Lkotakbaz/rain/module/Module;)Z", "bind", "request", "", "requestJson", "()Ljava/lang/String;", "json", "receive", "(Ljava/lang/String;)V", "reset", "", "features", "updateBlocklist", "(Ljava/util/Set;)V", "blockedModules", "(Ljava/util/Set;)Ljava/util/List;", "name", "featureAliases", "(Ljava/lang/String;)Ljava/util/Set;", "normalizeFeature", "(Ljava/lang/String;)Ljava/lang/String;", "toDebugList", "(Ljava/util/Set;)Ljava/lang/String;", "message", "debug", "CLIENT_ID", "Ljava/lang/String;", "", "MAX_JSON_LENGTH", "I", "", "REQUEST_DELAY_MS", "J", "MAX_REQUEST_ATTEMPTS", "DEBUG", "Z", "Lnet/minecraft/class_2960;", "kotlin.jvm.PlatformType", "channel", "Lnet/minecraft/class_2960;", "Lkotlin/text/Regex;", "camelSplitRegex", "Lkotlin/text/Regex;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "blockedFeatures", "Ljava/util/HashSet;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "moduleFeatures", "Ljava/util/LinkedHashMap;", "lastRequestAt", "requestAttempts", "waitingForResponse", "LiteApiPayload", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nHolyWorldFeatureControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolyWorldFeatureControl.kt\nkotakbaz/rain/client/liteapi/HolyWorldFeatureControl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,169:1\n1807#2,3:170\n1915#2,2:173\n1915#2,2:176\n1642#2,10:178\n1915#2:188\n1916#2:190\n1652#2:191\n1807#2,3:195\n1586#2:202\n1661#2,3:203\n1#3:175\n1#3:189\n507#4,3:192\n510#4,4:198\n437#5:206\n513#5,5:207\n*S KotlinDebug\n*F\n+ 1 HolyWorldFeatureControl.kt\nkotakbaz/rain/client/liteapi/HolyWorldFeatureControl\n*L\n48#1:170,3\n52#1:173,2\n83#1:176,2\n100#1:178,10\n100#1:188\n100#1:190\n100#1:191\n128#1:195,3\n130#1:202\n130#1:203,3\n100#1:189\n128#1:192,3\n128#1:198,4\n140#1:206\n140#1:207,5\n*E\n"})
public final class HolyWorldFeatureControl {
    @NotNull
    public static final HolyWorldFeatureControl INSTANCE;
    @NotNull
    private static final String a = "rain-visuals";
    private static final int A = Short.MAX_VALUE;
    private static final long b = 10000L;
    private static final int B = 3;
    private static final boolean c = false;
    private static final Identifier C;
    @NotNull
    private static final Regex d;
    @NotNull
    private static final HashSet<String> D;
    @NotNull
    private static final LinkedHashMap<Module, Set<String>> e;
    private static long E;
    private static int f;
    private static boolean F;
    private static Object[] g;
    private static Object h;
    private static Object[] H;
    private static Object[] G;
    private static Object[] i;
    public static int[] I;

    private HolyWorldFeatureControl() {
    }

    public final void load(@NotNull List<? extends Module> modules) {
        int n2 = I[0];
        n2 += I[1];
        Intrinsics.checkNotNullParameter(modules, (String)g[n2 += I[2]]);
        this.bind(modules);
        PayloadTypeRegistry.playC2S().register(kotakbaz.rain.client.liteapi.a.a.getID(), kotakbaz.rain.client.liteapi.a.a.getCODEC());
        PayloadTypeRegistry.playS2C().register(kotakbaz.rain.client.liteapi.a.a.getID(), kotakbaz.rain.client.liteapi.a.a.getCODEC());
        ClientPlayNetworking.registerGlobalReceiver(kotakbaz.rain.client.liteapi.a.a.getID(), HolyWorldFeatureControl::load$lambda$0);
        ClientPlayConnectionEvents.JOIN.register(HolyWorldFeatureControl::load$lambda$1);
        ClientPlayConnectionEvents.DISCONNECT.register(HolyWorldFeatureControl::load$lambda$2);
    }

    public final void tick() {
        if (F) {
            this.request();
        }
    }

    public final boolean isBlocked(@NotNull Module module) {
        int n2;
        long l2 = 7136310996325444751L;
        int n3 = I[3];
        n3 -= I[4];
        Intrinsics.checkNotNullParameter(module, (String)g[n3 ^= I[5]]);
        Set<String> set = e.get(module);
        if (set != null) {
            int n4;
            block7: {
                Iterable iterable = set;
                HashSet<String> hashSet = D;
                long l3 = l2;
                int n5 = I[6];
                n5 -= I[7];
                l2 = l3 ^ (0L ^ l3) & -1L << (n5 -= I[8]);
                if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                    int n6 = I[9];
                    n6 += I[10];
                    n4 = n6 -= I[11];
                } else {
                    for (Object t2 : iterable) {
                        String string = (String)t2;
                        long l4 = l2;
                        int n7 = I[12];
                        n7 -= I[13];
                        l2 = l4 ^ (0L ^ l4) & -1L >>> (n7 -= I[14]);
                        if (!hashSet.contains(string)) continue;
                        int n8 = I[15];
                        n8 ^= I[16];
                        n4 = n8 -= I[17];
                        break block7;
                    }
                    int n9 = I[18];
                    n9 += I[19];
                    n4 = n9 -= I[20];
                }
            }
            int n10 = I[21];
            n10 += I[22];
            if (n4 == (n10 ^= I[23])) {
                int n11 = I[24];
                n11 += I[25];
                n2 = n11 += I[26];
            } else {
                int n12 = I[27];
                n12 += I[28];
                n2 = n12 += I[29];
            }
        } else {
            int n13 = I[30];
            n13 += I[31];
            n2 = n13 += I[32];
        }
        return n2 != 0;
    }

    private final void bind(List<? extends Module> modules) {
        long l2 = -9070821573077242633L;
        Iterable iterable = modules;
        long l3 = l2;
        int n2 = I[33];
        n2 += I[34];
        l2 = l3 ^ (0L ^ l3) & -1L << (n2 -= I[35]);
        for (Object t2 : iterable) {
            Module module = (Module)t2;
            long l4 = l2;
            int n3 = I[36];
            n3 ^= I[37];
            l2 = l4 ^ (0L ^ l4) & -1L >>> (n3 -= I[38]);
            ((Map)e).put(module, INSTANCE.featureAliases(module.getName()));
            module.addVisibleInGuiCondition(() -> HolyWorldFeatureControl.bind$lambda$0$0(module));
            module.addAvailabilityCondition(() -> HolyWorldFeatureControl.bind$lambda$0$1(module));
        }
    }

    private final void request() {
        block5: {
            Object object;
            long l2 = 8901129812860483280L;
            long l3 = 5117583535684544204L;
            long l4 = -8619338796028153597L;
            long l5 = 4311040389761533561L;
            long l6 = System.currentTimeMillis();
            int n2 = I[39];
            n2 += I[40];
            if (f >= (n2 ^= I[41]) || l6 - E < 10000L) {
                return;
            }
            if (!ClientPlayNetworking.canSend(kotakbaz.rain.client.liteapi.a.a.getID())) {
                int n3 = I[42];
                n3 ^= I[43];
                F = n3 -= I[44];
                int n4 = I[45];
                n4 -= I[46];
                int n5 = I[48];
                n5 += I[49];
                this.debug((String)g[n4 += I[47]] + (String)g[n5 -= I[50]]);
                return;
            }
            E = l6;
            int n6 = I[51];
            n6 ^= I[52];
            long l7 = l3;
            int n7 = I[54];
            n7 -= I[55];
            l3 = l7 ^ ((long)f << (n6 += I[53]) ^ l7) & -1L << (n7 ^= I[56]);
            int n8 = I[57];
            n8 -= I[58];
            int n9 = I[60];
            n9 -= I[61];
            f = (int)(l3 >>> (n8 ^= I[59])) + (n9 += I[62]);
            int n10 = I[63];
            n10 ^= I[64];
            F = n10 ^= I[65];
            long l8 = l5;
            int n11 = I[66];
            n11 ^= I[67];
            l5 = l8 ^ ((long)e.size() ^ l8) & -1L >>> (n11 += I[68]);
            int n12 = I[69];
            n12 ^= I[70];
            long l9 = l5;
            int n13 = I[72];
            n13 += I[73];
            l5 = l9 ^ ((long)f << (n12 ^= I[71]) ^ l9) & -1L << (n13 += I[74]);
            int n14 = I[75];
            n14 -= I[76];
            n14 ^= I[77];
            int n15 = I[78];
            n15 += I[79];
            n15 -= I[80];
            int n16 = I[81];
            n16 += I[82];
            int n17 = I[84];
            n17 ^= I[85];
            int n18 = I[87];
            n18 -= I[88];
            this.debug((String)g[n14] + (String)g[n15] + (int)(l5 >>> (n16 -= I[83])) + (String)g[n17 -= I[86]] + (int)l5 + (String)g[n18 += I[89]]);
            Object object2 = this;
            try {
                object = object2;
                long l10 = l2;
                int n19 = I[90];
                n19 -= I[91];
                l2 = l10 ^ (0L ^ l10) & -1L << (n19 += I[92]);
                ClientPlayNetworking.send((CustomPayload)new a(super.requestJson()));
                object = Result.cfr_renamed_1(Unit.INSTANCE);
            }
            catch (Throwable throwable) {
                object = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
            }
            object2 = object;
            Throwable throwable = Result.cfr_renamed_2(object2);
            if (throwable == null) break block5;
            Object object3 = object = throwable;
            long l11 = l2;
            int n20 = I[93];
            n20 ^= I[94];
            l2 = l11 ^ (0L ^ l11) & -1L >>> (n20 -= I[95]);
            int n21 = I[96];
            n21 ^= I[97];
            F = n21 -= I[98];
            String string = ((Throwable)object3).getMessage();
            if (string == null) {
                string = object3.getClass().getSimpleName();
            }
            String string2 = string;
            int n22 = I[99];
            n22 ^= I[100];
            int n23 = I[102];
            n23 += I[103];
            INSTANCE.debug((String)g[n22 -= I[101]] + (String)g[n23 ^= I[104]] + string2);
        }
    }

    private final String requestJson() {
        long l2 = -8770887000645266021L;
        long l3 = -7143400183968076993L;
        JsonObject jsonObject = new JsonObject();
        int n2 = I[105];
        n2 += I[106];
        int n3 = I[108];
        n3 ^= I[109];
        jsonObject.addProperty((String)g[n2 += I[107]], (String)g[n3 ^= I[110]]);
        int n4 = I[111];
        n4 += I[112];
        JsonArray jsonArray = new JsonArray();
        JsonElement jsonElement = jsonArray;
        String string = (String)g[n4 ^= I[113]];
        JsonObject jsonObject2 = jsonObject;
        long l4 = l3;
        int n5 = I[114];
        n5 += I[115];
        l3 = l4 ^ (0L ^ l4) & -1L << (n5 -= I[116]);
        Collection<Set<String>> collection = e.values();
        int n6 = I[117];
        n6 ^= I[118];
        int n7 = I[120];
        n7 -= I[121];
        Intrinsics.checkNotNullExpressionValue(collection, (String)g[n6 ^= I[119]] + (String)g[n7 ^= I[122]]);
        Iterable iterable = CollectionsKt.distinct(CollectionsKt.flatten((Iterable)collection));
        long l5 = l3;
        int n8 = I[123];
        n8 ^= I[124];
        l3 = l5 ^ (0L ^ l5) & -1L >>> (n8 += I[125]);
        for (Object t2 : iterable) {
            String string2 = (String)t2;
            long l6 = l2;
            int n9 = I[126];
            n9 ^= I[127];
            l2 = l6 ^ (0L ^ l6) & -1L << (n9 ^= I[128]);
            ((JsonArray)jsonElement).add(string2);
        }
        Unit unit = Unit.INSTANCE;
        jsonObject2.add(string, jsonArray);
        JsonElement jsonElement2 = jsonElement = new JsonObject();
        long l7 = l2;
        int n10 = I[129];
        n10 += I[130];
        l2 = l7 ^ (0L ^ l7) & -1L >>> (n10 += I[131]);
        int n11 = I[132];
        n11 -= I[133];
        ((JsonObject)jsonElement2).addProperty((String)g[n11 -= I[134]], UUID.randomUUID().toString());
        int n12 = I[135];
        n12 ^= I[136];
        int n13 = I[138];
        n13 ^= I[139];
        ((JsonObject)jsonElement2).addProperty((String)g[n12 ^= I[137]], (String)g[n13 -= I[140]]);
        int n14 = I[141];
        n14 ^= I[142];
        ((JsonObject)jsonElement2).add((String)g[n14 += I[143]], jsonObject);
        String string3 = jsonElement.toString();
        int n15 = I[144];
        n15 += I[145];
        Intrinsics.checkNotNullExpressionValue(string3, (String)g[n15 ^= I[146]]);
        return string3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void receive(String json) {
        var32_2 = 6984050620747892959L;
        var34_3 = 7965614220753831466L;
        var36_4 = 6823749039957153571L;
        var38_5 = 8295936382372406626L;
        var30_6 = 8667383168807068216L;
        var2_7 = this;
        try {
            var3_8 = var2_7;
            v0 = var30_6;
            var41_10 = HolyWorldFeatureControl.I[147];
            var41_10 += HolyWorldFeatureControl.I[148];
            var30_6 = v0 ^ (0L ^ v0) & -1L << (var41_10 += HolyWorldFeatureControl.I[149]);
            var5_11 = JsonParser.parseString(json).getAsJsonObject();
            var43_12 = HolyWorldFeatureControl.I[150];
            var43_12 ^= HolyWorldFeatureControl.I[151];
            v1 = var5_11.get((String)HolyWorldFeatureControl.g[var43_12 ^= HolyWorldFeatureControl.I[152]]);
            if (v1 != null) {
                var45_13 = HolyWorldFeatureControl.I[153];
                var45_13 ^= HolyWorldFeatureControl.I[154];
                if (v1.getAsBoolean() == (var45_13 += HolyWorldFeatureControl.I[155])) {
                    var47_14 = HolyWorldFeatureControl.I[156];
                    var47_14 ^= HolyWorldFeatureControl.I[157];
                    v2 = var47_14 += HolyWorldFeatureControl.I[158];
                } else {
                    var49_15 = HolyWorldFeatureControl.I[159];
                    var49_15 ^= HolyWorldFeatureControl.I[160];
                    v2 = var49_15 ^= HolyWorldFeatureControl.I[161];
                }
            } else {
                var51_16 = HolyWorldFeatureControl.I[162];
                var51_16 -= HolyWorldFeatureControl.I[163];
                v2 = var51_16 ^= HolyWorldFeatureControl.I[164];
            }
            if (v2 == 0) {
                return;
            }
            var53_17 = HolyWorldFeatureControl.I[165];
            var53_17 += HolyWorldFeatureControl.I[166];
            var6_18 = var5_11.getAsJsonObject((String)HolyWorldFeatureControl.g[var53_17 += HolyWorldFeatureControl.I[167]]);
            if (var6_18 == null) ** GOTO lbl-1000
            var55_19 = HolyWorldFeatureControl.I[168];
            var55_19 -= HolyWorldFeatureControl.I[169];
            var7_20 = var6_18.getAsJsonArray((String)HolyWorldFeatureControl.g[var55_19 ^= HolyWorldFeatureControl.I[170]]);
            if (var7_20 == null) ** GOTO lbl-1000
            var8_21 = (Set<T>)var7_20;
            v3 = var30_6;
            var57_22 = HolyWorldFeatureControl.I[171];
            var57_22 -= HolyWorldFeatureControl.I[172];
            var30_6 = v3 ^ (0L ^ v3) & -1L >>> (var57_22 -= HolyWorldFeatureControl.I[173]);
            var10_23 = var8_21;
            var11_24 = new ArrayList<E>();
            v4 = var32_2;
            var59_25 = HolyWorldFeatureControl.I[174];
            var59_25 += HolyWorldFeatureControl.I[175];
            var32_2 = v4 ^ (0L ^ v4) & -1L << (var59_25 -= HolyWorldFeatureControl.I[176]);
            var13_26 = var10_23;
            v5 = var32_2;
            var61_27 = HolyWorldFeatureControl.I[177];
            var61_27 += HolyWorldFeatureControl.I[178];
            var32_2 = v5 ^ (0L ^ v5) & -1L >>> (var61_27 ^= HolyWorldFeatureControl.I[179]);
            var15_28 = var13_26.iterator();
            while (var15_28.hasNext()) {
                var17_33 = var16_32 = var15_28.next();
                v6 = var34_3;
                var63_38 = HolyWorldFeatureControl.I[180];
                var63_38 -= HolyWorldFeatureControl.I[181];
                var34_3 = v6 ^ (0L ^ v6) & -1L << (var63_38 ^= HolyWorldFeatureControl.I[182]);
                var19_34 = (JsonElement)var17_33;
                v7 = var34_3;
                var65_29 = HolyWorldFeatureControl.I[183];
                var65_29 ^= HolyWorldFeatureControl.I[184];
                var34_3 = v7 ^ (0L ^ v7) & -1L >>> (var65_29 ^= HolyWorldFeatureControl.I[185]);
                var22_36 = var21_35 = var19_34;
                v8 = var36_4;
                var67_30 = HolyWorldFeatureControl.I[186];
                var67_30 ^= HolyWorldFeatureControl.I[187];
                var36_4 = v8 ^ (0L ^ v8) & -1L << (var67_30 += HolyWorldFeatureControl.I[188]);
                v9 = var22_36.isJsonPrimitive() != false ? var21_35 : null;
                if ((v9 != null && (v9 = v9.getAsString()) != null ? super.normalizeFeature((String)v9) : null) == null) continue;
                var24_37 = var24_37;
                v10 = var36_4;
                var69_31 = HolyWorldFeatureControl.I[189];
                var69_31 ^= HolyWorldFeatureControl.I[190];
                var36_4 = v10 ^ (0L ^ v10) & -1L >>> (var69_31 ^= HolyWorldFeatureControl.I[191]);
                var11_24.add(var24_37);
            }
            var8_21 = CollectionsKt.toSet((List)var11_24);
            if (var8_21 != null) {
                v11 /* !! */  = var8_21;
            } else lbl-1000:
            // 3 sources

            {
                v11 /* !! */  = SetsKt.emptySet();
            }
            var26_39 = v11 /* !! */ ;
            var3_8.updateBlocklist(var26_39);
            var28_40 = var3_8.toDebugList(var26_39);
            var71_41 = HolyWorldFeatureControl.I[192];
            var71_41 += HolyWorldFeatureControl.I[193];
            var73_42 = HolyWorldFeatureControl.I[195];
            var73_42 ^= HolyWorldFeatureControl.I[196];
            var3_8.debug((String)HolyWorldFeatureControl.g[var71_41 += HolyWorldFeatureControl.I[194]] + (String)HolyWorldFeatureControl.g[var73_42 -= HolyWorldFeatureControl.I[197]] + var28_40);
            v12 = var3_8;
            var75_43 = HolyWorldFeatureControl.I[198];
            var75_43 -= HolyWorldFeatureControl.I[199];
            var77_44 = HolyWorldFeatureControl.I[201];
            var77_44 ^= HolyWorldFeatureControl.I[202];
            var79_45 = HolyWorldFeatureControl.I[204];
            var79_45 += HolyWorldFeatureControl.I[205];
            var6_18 = CollectionsKt.joinToString$default(var3_8.blockedModules(var26_39), (String)HolyWorldFeatureControl.g[var75_43 -= HolyWorldFeatureControl.I[200]], null, null, var77_44 -= HolyWorldFeatureControl.I[203], null, null, var79_45 += HolyWorldFeatureControl.I[206], null);
            if (StringsKt.isBlank((CharSequence)var6_18)) {
                var27_46 = v12;
                v13 = var38_5;
                var81_47 = HolyWorldFeatureControl.I[207];
                var81_47 += HolyWorldFeatureControl.I[208];
                var38_5 = v13 ^ (0L ^ v13) & -1L << (var81_47 -= HolyWorldFeatureControl.I[209]);
                var83_48 = HolyWorldFeatureControl.I[210];
                var83_48 -= HolyWorldFeatureControl.I[211];
                v14 = (String)HolyWorldFeatureControl.g[var83_48 ^= HolyWorldFeatureControl.I[212]];
                v12 = var27_46;
            } else {
                v14 = var6_18;
            }
            var29_49 = v14;
            var85_50 = HolyWorldFeatureControl.I[213];
            var85_50 -= HolyWorldFeatureControl.I[214];
            var87_51 = HolyWorldFeatureControl.I[216];
            var87_51 += HolyWorldFeatureControl.I[217];
            v12.debug((String)HolyWorldFeatureControl.g[var85_50 ^= HolyWorldFeatureControl.I[215]] + (String)HolyWorldFeatureControl.g[var87_51 -= HolyWorldFeatureControl.I[218]] + var29_49);
            var89_52 = HolyWorldFeatureControl.I[219];
            var89_52 ^= HolyWorldFeatureControl.I[220];
            HolyWorldFeatureControl.F = var89_52 ^= HolyWorldFeatureControl.I[221];
            var3_8 = Result.cfr_renamed_1(Unit.INSTANCE);
        }
        catch (Throwable var4_53) {
            var3_9 = Result.cfr_renamed_1(ResultKt.createFailure(var4_53));
        }
    }

    private final void reset() {
        int n2 = I[222];
        n2 += I[223];
        F = n2 ^= I[224];
        E = 0L;
        int n3 = I[225];
        n3 -= I[226];
        f = n3 ^= I[227];
        this.updateBlocklist(SetsKt.emptySet());
    }

    private final void updateBlocklist(Set<String> features) {
        if (Intrinsics.areEqual(D, features)) {
            return;
        }
        D.clear();
        D.addAll((Collection<String>)features);
        ModuleManager.INSTANCE.syncAvailabilityStates();
    }

    private final List<String> blockedModules(Set<String> features) {
        Object object;
        Object object2;
        long l2 = 1589864104903991488L;
        long l3 = 7404865632896201253L;
        long l4 = 4873953024485587876L;
        long l5 = -4404012011956527850L;
        Object object3 = e;
        long l6 = l4;
        int n2 = I[228];
        n2 -= I[229];
        l4 = l6 ^ (0L ^ l6) & -1L << (n2 -= I[230]);
        Object object4 = new LinkedHashMap();
        for (Map.Entry entry : object3.entrySet()) {
            int n3;
            block5: {
                object2 = (Set)entry.getValue();
                long l7 = l2;
                int n4 = I[231];
                n4 -= I[232];
                l2 = l7 ^ (0L ^ l7) & -1L >>> (n4 += I[233]);
                object = (Iterable)object2;
                long l8 = l5;
                int n5 = I[234];
                n5 -= I[235];
                l5 = l8 ^ (0L ^ l8) & -1L << (n5 += I[236]);
                if (object instanceof Collection && ((Collection)object).isEmpty()) {
                    int n6 = I[237];
                    n6 += I[238];
                    n3 = n6 ^= I[239];
                } else {
                    Iterator iterator2 = object.iterator();
                    while (iterator2.hasNext()) {
                        Object t2 = iterator2.next();
                        String string = (String)t2;
                        long l9 = l3;
                        int n7 = I[240];
                        n7 += I[241];
                        l3 = l9 ^ (0L ^ l9) & -1L >>> (n7 ^= I[242]);
                        if (!features.contains(string)) continue;
                        int n8 = I[243];
                        n8 -= I[244];
                        n3 = n8 += I[245];
                        break block5;
                    }
                    int n9 = I[246];
                    n9 ^= I[247];
                    n3 = n9 -= I[248];
                }
            }
            if (n3 == 0) continue;
            ((HashMap)object4).put(entry.getKey(), entry.getValue());
        }
        object3 = ((Map)object4).keySet();
        long l10 = l4;
        int n10 = I[249];
        n10 += I[250];
        l4 = l10 ^ (0L ^ l10) & -1L << (n10 += I[251]);
        object4 = object3;
        int n11 = I[252];
        n11 -= I[253];
        Collection collection = new ArrayList(CollectionsKt.collectionSizeOrDefault(object3, n11 ^= I[254]));
        long l11 = l4;
        int n12 = I[255];
        n12 += I[256];
        l4 = l11 ^ (0L ^ l11) & -1L >>> (n12 += I[257]);
        object2 = object4.iterator();
        while (object2.hasNext()) {
            Object e2 = object2.next();
            object = (Module)e2;
            Collection collection2 = collection;
            long l12 = l5;
            int n13 = I[258];
            n13 ^= I[259];
            l5 = l12 ^ (0L ^ l12) & -1L << (n13 -= I[260]);
            collection2.add(((Module)object).getName());
        }
        return (List)collection;
    }

    private final Set<String> featureAliases(String name) {
        String string = this.normalizeFeature(name);
        String[] stringArray = (String[])name;
        Regex regex = d;
        int n2 = I[261];
        n2 += I[262];
        String string2 = (String)g[n2 -= I[263]];
        String string3 = this.normalizeFeature(regex.replace((CharSequence)stringArray, string2));
        int n3 = I[264];
        n3 -= I[265];
        stringArray = new String[n3 += I[266]];
        int n4 = I[267];
        n4 ^= I[268];
        stringArray[n4 ^= HolyWorldFeatureControl.I[269]] = string;
        int n5 = I[270];
        n5 += I[271];
        stringArray[n5 -= HolyWorldFeatureControl.I[272]] = string3;
        return SetsKt.setOf(stringArray);
    }

    /*
     * Unable to fully structure code
     */
    private final String normalizeFeature(String $this$normalizeFeature) {
        var16_2 = 6473259223425945605L;
        var18_3 = -7081016819088704876L;
        var20_4 = 4065002493437613768L;
        var22_5 = 6522316276644386294L;
        var24_6 = -9152424177947336363L;
        var26_7 = 1908697422435701782L;
        var12_8 = -8793261539081824152L;
        var14_9 = -2608539171058679736L;
        var2_10 = $this$normalizeFeature;
        v0 = Locale.ROOT;
        var29_11 = HolyWorldFeatureControl.I[273];
        var29_11 += HolyWorldFeatureControl.I[274];
        Intrinsics.checkNotNullExpressionValue(v0, (String)HolyWorldFeatureControl.g[var29_11 ^= HolyWorldFeatureControl.I[275]]);
        v1 = var2_10.toLowerCase(v0);
        var31_12 = HolyWorldFeatureControl.I[276];
        var31_12 ^= HolyWorldFeatureControl.I[277];
        var33_13 = HolyWorldFeatureControl.I[279];
        var33_13 += HolyWorldFeatureControl.I[280];
        Intrinsics.checkNotNullExpressionValue(v1, (String)HolyWorldFeatureControl.g[var31_12 ^= HolyWorldFeatureControl.I[278]] + (String)HolyWorldFeatureControl.g[var33_13 += HolyWorldFeatureControl.I[281]]);
        var2_10 = v1;
        v2 = var12_8;
        var35_14 = HolyWorldFeatureControl.I[282];
        var35_14 -= HolyWorldFeatureControl.I[283];
        var12_8 = v2 ^ (0L ^ v2) & -1L << (var35_14 -= HolyWorldFeatureControl.I[284]);
        var4_15 = var2_10;
        var5_16 = new StringBuilder();
        v3 = var12_8;
        var37_17 = HolyWorldFeatureControl.I[285];
        var37_17 -= HolyWorldFeatureControl.I[286];
        var12_8 = v3 ^ (0L ^ v3) & -1L >>> (var37_17 += HolyWorldFeatureControl.I[287]);
        v4 = var14_9;
        var39_18 = HolyWorldFeatureControl.I[288];
        var39_18 ^= HolyWorldFeatureControl.I[289];
        v5 = var14_9 = v4 ^ (0L ^ v4) & -1L << (var39_18 += HolyWorldFeatureControl.I[290]);
        var41_19 = HolyWorldFeatureControl.I[291];
        var41_19 += HolyWorldFeatureControl.I[292];
        var14_9 = v5 ^ ((long)var4_15.length() ^ v5) & -1L >>> (var41_19 += HolyWorldFeatureControl.I[293]);
        while (true) {
            var43_25 = HolyWorldFeatureControl.I[294];
            var43_25 ^= HolyWorldFeatureControl.I[295];
            if ((int)(var14_9 >>> (var43_25 += HolyWorldFeatureControl.I[296])) >= (int)var14_9) break;
            var45_26 = HolyWorldFeatureControl.I[297];
            var45_26 += HolyWorldFeatureControl.I[298];
            var45_26 += HolyWorldFeatureControl.I[299];
            var47_27 = HolyWorldFeatureControl.I[300];
            var47_27 ^= HolyWorldFeatureControl.I[301];
            v6 = var26_7;
            var49_28 = HolyWorldFeatureControl.I[303];
            var49_28 -= HolyWorldFeatureControl.I[304];
            var26_7 = v6 ^ ((long)var4_15.charAt((int)(var14_9 >>> var45_26)) << (var47_27 -= HolyWorldFeatureControl.I[302]) ^ v6) & -1L << (var49_28 += HolyWorldFeatureControl.I[305]);
            var51_29 = HolyWorldFeatureControl.I[306];
            var51_29 += HolyWorldFeatureControl.I[307];
            var51_29 ^= HolyWorldFeatureControl.I[308];
            var53_30 = HolyWorldFeatureControl.I[309];
            var53_30 ^= HolyWorldFeatureControl.I[310];
            v7 = var24_6;
            var55_31 = HolyWorldFeatureControl.I[312];
            var55_31 += HolyWorldFeatureControl.I[313];
            var24_6 = v7 ^ ((long)((int)(var26_7 >>> var51_29)) << (var53_30 -= HolyWorldFeatureControl.I[311]) ^ v7) & -1L << (var55_31 ^= HolyWorldFeatureControl.I[314]);
            v8 = var22_5;
            var57_32 = HolyWorldFeatureControl.I[315];
            var57_32 ^= HolyWorldFeatureControl.I[316];
            var22_5 = v8 ^ (0L ^ v8) & -1L << (var57_32 += HolyWorldFeatureControl.I[317]);
            var59_33 = HolyWorldFeatureControl.I[318];
            var59_33 += HolyWorldFeatureControl.I[319];
            if (Character.isLetterOrDigit((char)(var24_6 >>> (var59_33 -= HolyWorldFeatureControl.I[320])))) ** GOTO lbl-1000
            var61_34 = HolyWorldFeatureControl.I[321];
            var61_34 += HolyWorldFeatureControl.I[322];
            var63_35 = HolyWorldFeatureControl.I[324];
            var63_35 ^= HolyWorldFeatureControl.I[325];
            if ((int)(var24_6 >>> (var61_34 += HolyWorldFeatureControl.I[323])) == (var63_35 += HolyWorldFeatureControl.I[326])) ** GOTO lbl-1000
            var65_20 = HolyWorldFeatureControl.I[327];
            var65_20 += HolyWorldFeatureControl.I[328];
            var67_21 = HolyWorldFeatureControl.I[330];
            var67_21 += HolyWorldFeatureControl.I[331];
            if ((int)(var24_6 >>> (var65_20 ^= HolyWorldFeatureControl.I[329])) == (var67_21 ^= HolyWorldFeatureControl.I[332])) lbl-1000:
            // 3 sources

            {
                var69_22 = HolyWorldFeatureControl.I[333];
                var69_22 += HolyWorldFeatureControl.I[334];
                v9 = var69_22 += HolyWorldFeatureControl.I[335];
            } else {
                var71_23 = HolyWorldFeatureControl.I[336];
                var71_23 += HolyWorldFeatureControl.I[337];
                v9 = var71_23 -= HolyWorldFeatureControl.I[338];
            }
            if (v9 != 0) {
                var73_24 = HolyWorldFeatureControl.I[339];
                var73_24 ^= HolyWorldFeatureControl.I[340];
                var5_16.append((char)(var26_7 >>> (var73_24 += HolyWorldFeatureControl.I[341])));
            }
            var14_9 += 0x100000000L;
        }
        return ((StringBuilder)var5_16).toString();
    }

    private final String toDebugList(Set<String> $this$toDebugList) {
        CharSequence charSequence;
        long l2 = 5734541262848758820L;
        int n2 = I[342];
        n2 += I[343];
        n2 ^= I[344];
        int n3 = I[345];
        n3 -= I[346];
        int n4 = I[348];
        n4 -= I[349];
        CharSequence charSequence2 = CollectionsKt.joinToString$default(CollectionsKt.sorted((Iterable)$this$toDebugList), (String)g[n2], null, null, n3 -= I[347], null, null, n4 += I[350], null);
        if (StringsKt.isBlank(charSequence2)) {
            long l3 = l2;
            int n5 = I[351];
            n5 ^= I[352];
            l2 = l3 ^ (0L ^ l3) & -1L << (n5 ^= I[353]);
            int n6 = I[354];
            n6 += I[355];
            charSequence = (String)g[n6 += I[356]];
        } else {
            charSequence = charSequence2;
        }
        return (String)charSequence;
    }

    private final void debug(String message) {
    }

    private static final void load$lambda$0(a a2, ClientPlayNetworking.Context context) {
        INSTANCE.receive(a2.getJson());
    }

    private static final void load$lambda$1(ClientPlayNetworkHandler clientPlayNetworkHandler, PacketSender packetSender, MinecraftClient minecraftClient) {
        INSTANCE.request();
    }

    private static final void load$lambda$2(ClientPlayNetworkHandler clientPlayNetworkHandler, MinecraftClient minecraftClient) {
        INSTANCE.reset();
    }

    private static final boolean bind$lambda$0$0(Module $module) {
        boolean bl;
        if (!INSTANCE.isBlocked($module)) {
            boolean bl2 = I[357];
            bl2 -= I[358];
            bl = bl2 += I[359];
        } else {
            boolean bl3 = I[360];
            bl3 -= I[361];
            bl = bl3 -= I[362];
        }
        return bl;
    }

    private static final boolean bind$lambda$0$1(Module $module) {
        boolean bl;
        if (!INSTANCE.isBlocked($module)) {
            boolean bl2 = I[363];
            bl2 -= I[364];
            bl = bl2 += I[365];
        } else {
            boolean bl3 = I[366];
            bl3 ^= I[367];
            bl = bl3 += I[368];
        }
        return bl;
    }

    public static final /* synthetic */ Identifier access$getChannel$p() {
        return C;
    }

    static {
        HolyWorldFeatureControl.b();
        long l2 = 2463147508403057800L;
        long l3 = -5027165895717265043L;
        long l4 = 100225463863251186L;
        long l5 = -6888272524660438922L;
        long l6 = 1528625854093112950L;
        long l7 = -8832525551281837928L;
        long l8 = 446642162410535115L;
        long l9 = 8410331458176138597L;
        long l10 = -2529423889474896989L;
        long l11 = 902966781211025661L;
        long l12 = -8357232835816968415L;
        long l13 = -6787276396394618977L;
        long l14 = -4872724306100691065L;
        long l15 = 7443729560262406274L;
        int n2 = I[369];
        n2 ^= I[370];
        g = new Object[n2 ^= I[371]];
        long l16 = l15;
        int n3 = I[372];
        n3 -= I[373];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= I[374]);
        Object[] objectArray = new Object[I[375]];
        objectArray[HolyWorldFeatureControl.I[376]] = G;
        objectArray[HolyWorldFeatureControl.I[377]] = I[378];
        int n4 = I[379];
        Object object = HolyWorldFeatureControl.A()[I[380]];
        if (object == null) {
            char[] cArray = "\u7e45\u7e78\u7e87\u7e46\u7e62\u7e5b\u7e62\u7e64\u7e99\u7e44\u7e7a\u7e40\u7e83\u7e7f\u7e9d\u7e41\u7e46\u7e43\u7e67\u7e63\u7e66\u7e9a\u7e7e\u7e43\u7e81\u7e72\u7e7e\u7e88\u7e70\u7e88\u7e9e\u7e7f\u7e84\u7e87\u7e71\u7e92\u7e98\u7e93\u7e99\u7e79\u7e60\u7e47\u7e70\u7e5f\u7e7c\u7e7b\u7e42\u7e80\u7e7b\u7e97\u7e9d\u7e7f\u7e80\u7e9f\u7e77\u7e62\u7e44\u7e83\u7e61\u7e9d\u7e71\u7e7c\u7e87\u7e89\u7e42\u7e94\u7e44\u7e85\u7e61\u7e81\u7e75\u7e95\u7e86\u7e84\u7e64\u7e7c\u7e91\u7e73\u7e79\u7e65\u7e43\u7e9c\u7e90\u7e7e\u7e5f\u7e5b\u7e89\u7e60\u7e87\u7e9f\u7e9b\u7e90\u7e95\u7e66\u7e88\u7e69\u7e89\u7e9a\u7e40\u7e82\u7e88\u7e89\u7e97\u7e68\u7e95\u7e65\u7e71\u7e7b\u7e87\u7e81\u7e94\u7e47\u7e61\u7e94\u7e7c\u7e60\u7e99\u7e93\u7e83\u7e96\u7e97\u7e92\u7e94\u7e9f\u7e90\u7e77\u7e61\u7e79\u7e69\u7e85\u7e9d\u7e9d\u7e77\u7e77\u7e67\u7e74\u7e43\u7e84\u7e68\u7e78\u7e5b\u7e5e\u7e61\u7e9e\u7e9f\u7e68\u7e92\u7e91\u7e43\u7e70\u7e9a\u7e86\u7e7a\u7e87\u7e78\u7e93\u7e5f\u7e9a\u7e40\u7e61\u7e64\u7e88\u7e97\u7e79\u7e75\u7e76\u7e5f\u7e81\u7e63\u7e41\u7e70\u7e60\u7e85\u7e78\u7e70\u7e86\u7e66\u7e7e\u7e87\u7e98\u7e5f\u7e84\u7e78\u7e88\u7e89\u7e71\u7e95\u7e9c\u7e5b\u7e83\u7e98\u7e80\u7e66\u7e49\u7e68\u7e90\u7e69\u7e74\u7e66\u7e98\u7e91\u7e61\u7e81\u7e64\u7e7b\u7e49\u7e44\u7e85\u7e95\u7e60\u7e9f\u7e72\u7e98\u7e66\u7e46\u7e9b\u7e69\u7e42\u7e68\u7e42\u7e79\u7e5f\u7e9f\u7e9f\u7e9f\u7e68\u7e63\u7e66\u7e5e\u7e72\u7e69\u7e90\u7e93\u7e88\u7e92\u7e77\u7e86\u7e60\u7e80\u7e78\u7e65\u7e95\u7e99\u7e97\u7e41\u7e7a\u7e41\u7e76\u7e67\u7e88\u7e64\u7e9b\u7e84\u7e42\u7e62\u7e98\u7e9c\u7e9c\u7e81\u7e42\u7e7a\u7e44\u7e67\u7e87\u7e79\u7e9a\u7e65\u7e82\u7e63\u7e77\u7e77\u7e78\u7e70\u7e74\u7e45\u7e9f\u7e9b\u7e43\u7e61\u7e77\u7e95\u7e9d\u7e9c\u7e88\u7e75\u7e41\u7e91\u7e9e\u7e67\u7e7a\u7e95\u7e86\u7e9a\u7e94\u7e40\u7e78\u7e40\u7e85\u7e83\u7e65\u7e92\u7e66\u7e81\u7e84\u7e78\u7e62\u7e78\u7e64\u7e72\u7e84\u7e62\u7e5b\u7e87\u7e92\u7e74\u7e66\u7e66\u7e49\u7e49\u7e64\u7e80\u7e7e\u7e82\u7e83\u7e70\u7e9b\u7e45\u7e9f\u7e97\u7e66\u7e85\u7e9c\u7e90\u7e46\u7e93\u7e5e\u7e81\u7e9b\u7e43\u7e68\u7e76\u7e9b\u7e9e\u7e9e\u7e7c\u7e68\u7e62\u7e65\u7e93\u7e41\u7e73\u7e69\u7e69\u7e76\u7e7a\u7e9a\u7e75\u7e99\u7e5f\u7e7c\u7e85\u7e7d\u7e67\u7e5b\u7e92\u7e86\u7e86\u7e90\u7e66\u7e97\u7e84\u7e67\u7e64\u7e84\u7e73\u7e83\u7e79\u7e46\u7e41\u7e87\u7e79\u7e7e\u7e90\u7e79\u7e7f\u7e5e\u7e5e\u7e66\u7e69\u7e72\u7e44\u7e71\u7e47\u7e44\u7e5e\u7e63\u7e7e\u7e9d\u7e96\u7e98\u7e96\u7e9e\u7e9f\u7e92\u7e9f\u7e61\u7e5f\u7e63\u7e81\u7e99\u7e87\u7e98\u7e43\u7e69\u7e5f\u7e64\u7e76\u7e7e\u7e5e\u7e76\u7e97\u7e96\u7e65\u7e87\u7e69\u7e92\u7e82\u7e40\u7e91\u7e9d\u7e91\u7e7a\u7e75\u7e44\u7e68\u7e70\u7e9b\u7e82\u7e88\u7e71\u7e91\u7e61\u7e43\u7e47\u7e95\u7e71\u7e7f\u7e82\u7e60\u7e64\u7e7a\u7e76\u7e40\u7e9c\u7e40\u7e66\u7e7f\u7e82\u7e42\u7e5e\u7e76\u7e81\u7e42\u7e5e\u7e9e\u7e76\u7e91\u7e95\u7e42\u7e94\u7e76\u7e80\u7e88\u7e9d\u7e65\u7e92\u7e88\u7e46\u7e40\u7e66\u7e45\u7e99\u7e70\u7e97\u7e68\u7e96\u7e89\u7e60\u7e81\u7e62\u7e61\u7e81\u7e76\u7e79\u7e89\u7e42\u7e7d\u7e44\u7e87\u7e9d\u7e49\u7e7a\u7e9d\u7e85\u7e76\u7e7f\u7e77\u7e91\u7e97\u7e77\u7e95\u7e7a\u7e7a\u7e7f\u7e63\u7e47\u7e5e\u7e42\u7e91\u7e74\u7e88\u7e66\u7e84\u7e47\u7e93\u7e46\u7e95\u7e9e\u7e78\u7e93\u7e7e\u7e9c\u7e95\u7e63\u7e43\u7e71\u7e88\u7e75\u7e90\u7e49\u7e89\u7e86\u7e90\u7e67\u7e91\u7e61\u7e95\u7e46\u7e9b\u7e91\u7e9e\u7e7d\u7e9d\u7e80\u7e87\u7e4d".toCharArray();
            for (int i2 = I[381]; i2 < I[382]; ++i2) {
                int n5 = cArray[i2];
                n5 ^= I[383];
                n5 ^= I[384];
                n5 ^= I[385];
                n5 -= I[386];
                n5 -= I[387];
                n5 += I[388];
                n5 += I[389];
                n5 += I[390];
                n5 -= I[391];
                n5 += I[392];
                cArray[i2] = (char)(n5 -= I[393]);
            }
            object = HolyWorldFeatureControl.A()[HolyWorldFeatureControl.I[394]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)HolyWorldFeatureControl.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = I[395];
        n6 -= I[396];
        l6 = l17 ^ (0x18800000000L ^ l17) & -1L << (n6 += I[397]);
        long l18 = l13;
        int n7 = I[398];
        n7 ^= I[399];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += 106);
        while (true) {
            int n8 = -42;
            n8 -= -65;
            if ((int)l13 >= (int)(l6 >>> (n8 += 9))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = 118;
            --n10;
            int n11 = -34;
            n11 += 5;
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += -116)) & -1L >>> (n11 -= -61);
            long l20 = l9;
            int n12 = 11;
            n12 -= 104;
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= -125);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = 90;
            n14 ^= 0x37;
            int n15 = 3;
            n15 -= -19;
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += -108)) & -1L >>> (n15 -= -10);
            int n16 = -155;
            n16 -= -82;
            long l22 = l10;
            int n17 = 3;
            n17 -= -71;
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= -105) ^ l22) & -1L << (n17 += -42);
            int n18 = -102;
            n18 ^= 0xFFFFFFE4;
            n18 ^= 0x6E;
            int n19 = -88;
            n19 ^= 0xFFFFFFBD;
            long l23 = l12;
            int n20 = 85;
            n20 += 53;
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= -11))) ^ l23) & -1L >>> (n20 += -106);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = -12;
            n21 += -20;
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= -64);
            while (true) {
                int n22 = -62;
                n22 ^= 0x30;
                if ((int)(l14 >>> (n22 -= -46)) >= (int)l12) break;
                int n23 = 134;
                n23 -= 122;
                int n24 = -97;
                n24 += 5;
                cArray2[(int)(l14 >>> (n23 ^= 0x2C))] = cArray[(int)l13 + (int)(l14 >>> (n24 += 124))];
                l14 += 0x100000000L;
            }
            int n25 = -35;
            n25 -= 33;
            int n26 = (int)(l15 >>> (n25 += 100));
            l15 += 0x100000000L;
            HolyWorldFeatureControl.g[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = -124;
            n27 += 13;
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= 0xFFFFFFB1);
        }
        INSTANCE = new HolyWorldFeatureControl();
        int n28 = 183;
        n28 += -107;
        int n29 = 178;
        n29 -= 115;
        C = Identifier.of((String)((String)g[n28 += -64]), (String)((String)g[n29 ^= 0x29]));
        int n30 = 93;
        n30 -= -3;
        int n31 = 23;
        n31 -= 126;
        d = new Regex((String)g[n30 += -96] + (String)g[n31 ^= 0xFFFFFF81]);
        D = new HashSet();
        e = new LinkedHashMap();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[1];
        String string = (String)object[2];
        object = object[0];
        Object[] objectArray = H;
        if (H == null) {
            objectArray = H = new Object[1];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[1];
                G = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[0x9BB4 ^ 0x9BA4];
                byArray[0x69A ^ 0x69F] = 0xFFFFF949 ^ 0x69F;
                byArray[0xE0C ^ 0xE0F] = 0xE3D ^ 0xE0F;
                byArray[0x8FB1 ^ 0x8FB3] = 0xFFFF7070 ^ 0x8FB3;
                byArray[0x98D1 ^ 0x98D7] = 0x98A6 ^ 0x98D7;
                byArray[0xA3DE ^ 0xA3D7] = 0xFFFF5C63 ^ 0xA3D7;
                byArray[0x39AD ^ 0x39A2] = 0x39DD ^ 0x39A2;
                byArray[0x501A ^ 0x5011] = 0x507A ^ 0x5011;
                byArray[0x10B9 ^ 0x10B3] = 0xFFFFEF33 ^ 0x10B3;
                byArray[0x7B5 ^ 0x7B5] = 0x7B6 ^ 0x7B5;
                byArray[0x1AAA ^ 0x1AAE] = 0xFFFFE561 ^ 0x1AAE;
                byArray[0x7605 ^ 0x7609] = 0x764C ^ 0x7609;
                byArray[0x681B ^ 0x6815] = 0xFFFF97F6 ^ 0x6815;
                byArray[0x341A ^ 0x341D] = 0xFFFFCB80 ^ 0x341D;
                byArray[0x72A3 ^ 0x72AE] = 0x72CC ^ 0x72AE;
                byArray[0x9A11 ^ 0x9A10] = 0xFFFF65DF ^ 0x9A10;
                byArray[0xC4AB ^ 0xC4A3] = 0xC4DC ^ 0xC4A3;
                objectArray2[0] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (h == null) {
                byte[] byArray2 = new byte[0xBF0B ^ 0xBF2B];
                byArray2[0x6D2F ^ 0x6D32] = 0xFFFF9294 ^ 0x6D32;
                byArray2[0x4EE8 ^ 0x4EE5] = 0x4E96 ^ 0x4EE5;
                byArray2[0x7093 ^ 0x7098] = 0xFFFF8F41 ^ 0x7098;
                byArray2[0x5077 ^ 0x5061] = 0x504D ^ 0x5061;
                byArray2[0x2693 ^ 0x268C] = 0x26DF ^ 0x268C;
                byArray2[0x7D87 ^ 0x7D92] = 0xFFFF8276 ^ 0x7D92;
                byArray2[0x6B2C ^ 0x6B2D] = 0xFFFF94A5 ^ 0x6B2D;
                byArray2[0x5E63 ^ 0x5E65] = 0x5E23 ^ 0x5E65;
                byArray2[0xC9A9 ^ 0xC9A1] = 0xC987 ^ 0xC9A1;
                byArray2[0x7864 ^ 0x786A] = 0x780A ^ 0x786A;
                byArray2[0x2CA6 ^ 0x2CB7] = 0x2CC2 ^ 0x2CB7;
                byArray2[0xFA79 ^ 0xFA76] = 0xFA31 ^ 0xFA76;
                byArray2[0x3B19 ^ 0x3B10] = 0x3B51 ^ 0x3B10;
                byArray2[0x8DF5 ^ 0x8DF0] = 0x8D82 ^ 0x8DF0;
                byArray2[0x5D3E ^ 0x5D24] = 0x5D18 ^ 0x5D24;
                byArray2[0x4193 ^ 0x4180] = 0x41E9 ^ 0x4180;
                byArray2[0xA778 ^ 0xA764] = 0xFFFF58B9 ^ 0xA764;
                byArray2[0x3035 ^ 0x3035] = 0x306F ^ 0x3035;
                byArray2[0x5205 ^ 0x5211] = 0xFFFFADA5 ^ 0x5211;
                byArray2[0xBA7B ^ 0xBA63] = 0xBA28 ^ 0xBA63;
                byArray2[0xD36E ^ 0xD369] = 0xD343 ^ 0xD369;
                byArray2[0x9C22 ^ 0x9C21] = 0xFFFF63F1 ^ 0x9C21;
                byArray2[0xE8A0 ^ 0xE8AC] = 0xE89E ^ 0xE8AC;
                byArray2[0xEBE4 ^ 0xEBFF] = 0xFFFF144B ^ 0xEBFF;
                byArray2[0x4C02 ^ 0x4C1B] = 0x4C6F ^ 0x4C1B;
                byArray2[0xD42C ^ 0xD43B] = 0xFFFF2BDB ^ 0xD43B;
                byArray2[0x6FBB ^ 0x6FBF] = 0xFFFF9071 ^ 0x6FBF;
                byArray2[0xDC03 ^ 0xDC1D] = 0xFFFF239C ^ 0xDC1D;
                byArray2[0xA177 ^ 0xA165] = 0xFFFF5ED3 ^ 0xA165;
                byArray2[0xCB0E ^ 0xCB0C] = 0xFFFF34D7 ^ 0xCB0C;
                byArray2[0x2B7B ^ 0x2B6B] = 0x2B0C ^ 0x2B6B;
                byArray2[0xEFB1 ^ 0xEFBB] = 0xEF8A ^ 0xEFBB;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = HolyWorldFeatureControl.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u2378\u2352\u1e2d\u2354\u1e2e\u1de2\u2361\u1eb3\u2324\u1e90\u1e30\u1e8f\u1e8b\u1ea5\u2375\u1e30\u1e2b\u1e3b".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 += 10979;
                        n3 ^= 0xF803;
                        n3 ^= 0xCDE4;
                        n3 -= 18500;
                        n3 -= 5510;
                        n3 += 37479;
                        n3 ^= 0x1B68;
                        n3 -= 63304;
                        n3 ^= 0xBA69;
                        n3 += 51601;
                        n3 ^= 0x8553;
                        n3 += 48019;
                        n3 += 14132;
                        cArray[i2] = (char)(n3 -= 18617);
                    }
                    object4 = HolyWorldFeatureControl.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[5] = 69;
                byArray4[13] = -104;
                byArray4[3] = -20;
                byArray4[7] = 87;
                byArray4[6] = 25;
                byArray4[0] = 113;
                byArray4[1] = -107;
                byArray4[9] = -43;
                byArray4[4] = -1;
                byArray4[12] = -4;
                byArray4[2] = 124;
                byArray4[8] = -15;
                byArray4[15] = 7;
                byArray4[10] = -77;
                byArray4[11] = 69;
                byArray4[14] = -62;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 12, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = HolyWorldFeatureControl.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u6ee0\u6efc\u6ed2".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 ^= 0xB530;
                        n4 -= 18515;
                        n4 -= 20837;
                        n4 ^= 0xE355;
                        n4 ^= 0x42E6;
                        n4 -= 60488;
                        n4 -= 44504;
                        n4 -= 23882;
                        n4 += 12987;
                        n4 ^= 0xDE3E;
                        cArray[i3] = (char)(n4 += 16255);
                    }
                    object5 = HolyWorldFeatureControl.A()[2] = new String(cArray);
                }
                h = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = HolyWorldFeatureControl.A()[3];
            if (object6 == null) {
                char[] cArray = "\u613f\u613b\u60cd\u62a1\u613d\u613c\u613d\u62a1\u60ce\u6105\u613d\u60cd\u62ab\u60ce\u62df\u60ca\u60ca\u62a7\u62e0\u62d9".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= 0xCF64;
                    n5 -= 48804;
                    n5 += 49062;
                    n5 -= 36358;
                    n5 ^= 0x4308;
                    n5 ^= 0xE3A9;
                    n5 -= 8362;
                    n5 += 61079;
                    n5 ^= 0xD2F8;
                    n5 += 35736;
                    n5 -= 26168;
                    n5 += 48793;
                    n5 -= 21402;
                    cArray[i4] = (char)(n5 ^= 0x2D3B);
                }
                object6 = HolyWorldFeatureControl.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)h), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = i;
        if (i == null) {
            i = new Object[4];
            objectArray = i;
        }
        return objectArray;
    }

    public static void b() {
        I = new int[0x92E7 ^ 0x9377];
        HolyWorldFeatureControl.I[0xE61A ^ 0xE74B] = 0xE70C ^ 0xE74B;
        HolyWorldFeatureControl.I[0xE14E ^ 0xE1E3] = 0xE1F9 ^ 0xE1E3;
        HolyWorldFeatureControl.I[0x1DE7 ^ 0x1C93] = 0x1C71 ^ 0x1C93;
        HolyWorldFeatureControl.I[0x2B3E ^ 0x2BDD] = 0x2BB7 ^ 0x2BDD;
        HolyWorldFeatureControl.I[0x53FB ^ 0x535C] = 0x536A ^ 0x535C;
        HolyWorldFeatureControl.I[0x42D9 ^ 0x4281] = 0xFFFFBD4D ^ 0x4281;
        HolyWorldFeatureControl.I[0xAAB0 ^ 0xABDB] = 0xABA9 ^ 0xABDB;
        HolyWorldFeatureControl.I[0x100FB ^ 0x10005] = 0xFFFEFF89 ^ 0x10005;
        HolyWorldFeatureControl.I[0xA7F0 ^ 0xA740] = 0xFFFF58F1 ^ 0xA740;
        HolyWorldFeatureControl.I[0x10BFC ^ 0x10AA8] = 0x10A98 ^ 0x10AA8;
        HolyWorldFeatureControl.I[0xDA57 ^ 0xDA5A] = 0xFFFF2594 ^ 0xDA5A;
        HolyWorldFeatureControl.I[0xBD88 ^ 0xBD22] = 0xBD64 ^ 0xBD22;
        HolyWorldFeatureControl.I[0x8D2E ^ 0x8D9D] = 0xFFFF7215 ^ 0x8D9D;
        HolyWorldFeatureControl.I[0xF787 ^ 0xF743] = 0xFFFF089F ^ 0xF743;
        HolyWorldFeatureControl.I[0x294C ^ 0x2824] = 0xFFFFD7C8 ^ 0x2824;
        HolyWorldFeatureControl.I[0x23 ^ 0x171] = 0x158 ^ 0x171;
        HolyWorldFeatureControl.I[0x5C8A ^ 0x5C78] = 0xFFFFA38C ^ 0x5C78;
        HolyWorldFeatureControl.I[0x9B3E ^ 0x9A58] = 0x9A6E ^ 0x9A58;
        HolyWorldFeatureControl.I[0xED6D ^ 0xED6F] = 0xFFFF12AC ^ 0xED6F;
        HolyWorldFeatureControl.I[0xEED9 ^ 0xEE0B] = 0xFFFF11D5 ^ 0xEE0B;
        HolyWorldFeatureControl.I[0x70C4 ^ 0x7033] = 0xFFFF8FFD ^ 0x7033;
        HolyWorldFeatureControl.I[0xBDF8 ^ 0xBCEC] = 0xBCE3 ^ 0xBCEC;
        HolyWorldFeatureControl.I[0x8A5B ^ 0x8AFA] = 0x8AB1 ^ 0x8AFA;
        HolyWorldFeatureControl.I[0x2261 ^ 0x22AE] = 0x222C ^ 0x22AE;
        HolyWorldFeatureControl.I[0xA3DA ^ 0xA346] = 0xFFFF5CF8 ^ 0xA346;
        HolyWorldFeatureControl.I[0xA014 ^ 0xA057] = 0xA077 ^ 0xA057;
        HolyWorldFeatureControl.I[0x1745 ^ 0x1786] = 0x1792 ^ 0x1786;
        HolyWorldFeatureControl.I[0x739E ^ 0x7316] = 0xFFFF8CF8 ^ 0x7316;
        HolyWorldFeatureControl.I[0xE261 ^ 0xE2C2] = 0xE2D2 ^ 0xE2C2;
        HolyWorldFeatureControl.I[0xB67 ^ 0xB39] = 0xFFFFF494 ^ 0xB39;
        HolyWorldFeatureControl.I[0x10938 ^ 0x1084D] = 0x1082A ^ 0x1084D;
        HolyWorldFeatureControl.I[0x852D ^ 0x858D] = 0xFFFF7A33 ^ 0x858D;
        HolyWorldFeatureControl.I[0x8059 ^ 0x812E] = 0x812D ^ 0x812E;
        HolyWorldFeatureControl.I[0x40F6 ^ 0x403B] = 0xFFFFBFB4 ^ 0x403B;
        HolyWorldFeatureControl.I[0x814C ^ 0x8153] = 0x813F ^ 0x8153;
        HolyWorldFeatureControl.I[0x2287 ^ 0x224F] = 0x226A ^ 0x224F;
        HolyWorldFeatureControl.I[0xC87E ^ 0xC973] = 0xFFFF36C8 ^ 0xC973;
        HolyWorldFeatureControl.I[0xAF85 ^ 0xAE9F] = 0xFFFF512B ^ 0xAE9F;
        HolyWorldFeatureControl.I[0xBA7 ^ 0xA22] = 0x8B94 ^ 0xA22;
        HolyWorldFeatureControl.I[0x4283 ^ 0x43FA] = 0x43FB ^ 0x43FA;
        HolyWorldFeatureControl.I[0x10869 ^ 0x10858] = 0x1080C ^ 0x10858;
        HolyWorldFeatureControl.I[0x7F20 ^ 0x7F72] = 0xFFFF80BC ^ 0x7F72;
        HolyWorldFeatureControl.I[0xF5C2 ^ 0xF487] = 0xF4BB ^ 0xF487;
        HolyWorldFeatureControl.I[0xABFD ^ 0xAB28] = 0xFFFF547E ^ 0xAB28;
        HolyWorldFeatureControl.I[0xA16 ^ 0xB2B] = 0xB0D ^ 0xB2B;
        HolyWorldFeatureControl.I[0xECAD ^ 0xEC6F] = 0xEC39 ^ 0xEC6F;
        HolyWorldFeatureControl.I[0xA88C ^ 0xA88F] = 0xA8CB ^ 0xA88F;
        HolyWorldFeatureControl.I[0x4BF6 ^ 0x4A8E] = 0x4A8E ^ 0x4A8E;
        HolyWorldFeatureControl.I[0x41B3 ^ 0x4185] = 0xFFFFBEA4 ^ 0x4185;
        HolyWorldFeatureControl.I[0xD26B ^ 0xD3E0] = 0xD3C8 ^ 0xD3E0;
        HolyWorldFeatureControl.I[0xB2F8 ^ 0xB2E5] = 0xFFFF4D37 ^ 0xB2E5;
        HolyWorldFeatureControl.I[0x1265 ^ 0x136E] = 0xFFFFECC5 ^ 0x136E;
        HolyWorldFeatureControl.I[0x95B7 ^ 0x9532] = 0x952C ^ 0x9532;
        HolyWorldFeatureControl.I[0x9C4B ^ 0x9CED] = 0x9CFB ^ 0x9CED;
        HolyWorldFeatureControl.I[0x593 ^ 0x54F] = 0xFFFFFA80 ^ 0x54F;
        HolyWorldFeatureControl.I[0x978C ^ 0x970A] = 0x9725 ^ 0x970A;
        HolyWorldFeatureControl.I[0xA02E ^ 0xA0CE] = 0xA0FD ^ 0xA0CE;
        HolyWorldFeatureControl.I[0x6AFA ^ 0x6A31] = 0xFFFF95C6 ^ 0x6A31;
        HolyWorldFeatureControl.I[0x10932 ^ 0x10963] = 0x10905 ^ 0x10963;
        HolyWorldFeatureControl.I[0xB6ED ^ 0xB7F1] = 0xFFFF4867 ^ 0xB7F1;
        HolyWorldFeatureControl.I[0x7CD6 ^ 0x7CD7] = 0x7CEB ^ 0x7CD7;
        HolyWorldFeatureControl.I[0x947D ^ 0x940A] = 0xFFFF6BB2 ^ 0x940A;
        HolyWorldFeatureControl.I[0xB883 ^ 0xB812] = 0xFFFF47BF ^ 0xB812;
        HolyWorldFeatureControl.I[0x3D4F ^ 0x3C3F] = 0x3C14 ^ 0x3C3F;
        HolyWorldFeatureControl.I[0xB329 ^ 0xB345] = 0xB30F ^ 0xB345;
        HolyWorldFeatureControl.I[0x97F6 ^ 0x97EC] = 0xFFFF681F ^ 0x97EC;
        HolyWorldFeatureControl.I[0x92AB ^ 0x928E] = 0x92F6 ^ 0x928E;
        HolyWorldFeatureControl.I[0x4160 ^ 0x41F7] = 0x4195 ^ 0x41F7;
        HolyWorldFeatureControl.I[0x6B15 ^ 0x6B55] = 0xFFFF94D2 ^ 0x6B55;
        HolyWorldFeatureControl.I[0x4A79 ^ 0x4AB3] = 0x4AD4 ^ 0x4AB3;
        HolyWorldFeatureControl.I[0x1D96 ^ 0x1C95] = 0xFFFFE313 ^ 0x1C95;
        HolyWorldFeatureControl.I[0xC1C1 ^ 0xC083] = 0xC0F5 ^ 0xC083;
        HolyWorldFeatureControl.I[0x241D ^ 0x24B4] = 0xFFFFDB3A ^ 0x24B4;
        HolyWorldFeatureControl.I[0x7D99 ^ 0x7DC2] = 0x7DA8 ^ 0x7DC2;
        HolyWorldFeatureControl.I[0x5863 ^ 0x5972] = 0x59AF ^ 0x5972;
        HolyWorldFeatureControl.I[0xE807 ^ 0xE98E] = 0xBBD5 ^ 0xE98E;
        HolyWorldFeatureControl.I[0xF543 ^ 0xF50D] = 0xF572 ^ 0xF50D;
        HolyWorldFeatureControl.I[0xE30A ^ 0xE3D0] = 0xE3BB ^ 0xE3D0;
        HolyWorldFeatureControl.I[0x265C ^ 0x2608] = 0xFFFFD9E0 ^ 0x2608;
        HolyWorldFeatureControl.I[0x7DA5 ^ 0x7C9B] = 0x7CF0 ^ 0x7C9B;
        HolyWorldFeatureControl.I[0x2889 ^ 0x29D1] = 0xFFFFD635 ^ 0x29D1;
        HolyWorldFeatureControl.I[0xA64B ^ 0xA6D0] = 0xFFFF5948 ^ 0xA6D0;
        HolyWorldFeatureControl.I[0xAD51 ^ 0xAC3C] = 0xFFFF53FE ^ 0xAC3C;
        HolyWorldFeatureControl.I[0xDE4A ^ 0xDE3C] = 0xFFFF21F1 ^ 0xDE3C;
        HolyWorldFeatureControl.I[0xAA92 ^ 0xAAF7] = 0xAAEE ^ 0xAAF7;
        HolyWorldFeatureControl.I[0x853C ^ 0x8474] = 0xFFFF7BF9 ^ 0x8474;
        HolyWorldFeatureControl.I[0x8924 ^ 0x898B] = 0xFFFF765A ^ 0x898B;
        HolyWorldFeatureControl.I[0x42FA ^ 0x4292] = 0xFFFFBD59 ^ 0x4292;
        HolyWorldFeatureControl.I[0x88F2 ^ 0x88CC] = 0x88F4 ^ 0x88CC;
        HolyWorldFeatureControl.I[0xC4D1 ^ 0xC4F3] = 0xFFFF3B3D ^ 0xC4F3;
        HolyWorldFeatureControl.I[0xF66 ^ 0xE18] = 0xC34 ^ 0xE18;
        HolyWorldFeatureControl.I[0x9DA5 ^ 0x9DB5] = 0x9DD7 ^ 0x9DB5;
        HolyWorldFeatureControl.I[0x726A ^ 0x72A4] = 0x72BE ^ 0x72A4;
        HolyWorldFeatureControl.I[0x803A ^ 0x815A] = 0x815F ^ 0x815A;
        HolyWorldFeatureControl.I[0xF533 ^ 0xF5D4] = 0xF560 ^ 0xF5D4;
        HolyWorldFeatureControl.I[0xE223 ^ 0xE250] = 0xE205 ^ 0xE250;
        HolyWorldFeatureControl.I[0xF45B ^ 0xF506] = 0xF567 ^ 0xF506;
        HolyWorldFeatureControl.I[0x9013 ^ 0x9145] = 0xFFFF6E8A ^ 0x9145;
        HolyWorldFeatureControl.I[0x18F4 ^ 0x19A4] = 0xFFFFE646 ^ 0x19A4;
        HolyWorldFeatureControl.I[0x93B6 ^ 0x9345] = 0xFFFF6C80 ^ 0x9345;
        HolyWorldFeatureControl.I[0xB798 ^ 0xB75D] = 0xFFFF48EE ^ 0xB75D;
        HolyWorldFeatureControl.I[0x54DE ^ 0x5550] = 0xFFFFAA91 ^ 0x5550;
        HolyWorldFeatureControl.I[0x5B7 ^ 0x561] = 0xFFFFFAF6 ^ 0x561;
        HolyWorldFeatureControl.I[0xEFC ^ 0xF71] = 0xFFFFF0B4 ^ 0xF71;
        HolyWorldFeatureControl.I[0x4AA4 ^ 0x4ADF] = 0x4AE4 ^ 0x4ADF;
        HolyWorldFeatureControl.I[0xFA8E ^ 0xFA6F] = 0xFA3C ^ 0xFA6F;
        HolyWorldFeatureControl.I[0xA441 ^ 0xA490] = 0xA4BC ^ 0xA490;
        HolyWorldFeatureControl.I[0x667E ^ 0x675D] = 0xFFFF989D ^ 0x675D;
        HolyWorldFeatureControl.I[0x8A24 ^ 0x8A50] = 0x8A5F ^ 0x8A50;
        HolyWorldFeatureControl.I[0x6AE5 ^ 0x6AEC] = 0xFFFF9595 ^ 0x6AEC;
        HolyWorldFeatureControl.I[0x6D5C ^ 0x6C4A] = 0xFFFF93E3 ^ 0x6C4A;
        HolyWorldFeatureControl.I[0xF4F8 ^ 0xF577] = 0xF500 ^ 0xF577;
        HolyWorldFeatureControl.I[0x10DAD ^ 0x10CF2] = 0xFFFEF304 ^ 0x10CF2;
        HolyWorldFeatureControl.I[0x6668 ^ 0x6681] = 0xFFFF9933 ^ 0x6681;
        HolyWorldFeatureControl.I[0x2594 ^ 0x24FE] = 0xFFFFDB0F ^ 0x24FE;
        HolyWorldFeatureControl.I[0xD8E4 ^ 0xD8EA] = 0xD8D9 ^ 0xD8EA;
        HolyWorldFeatureControl.I[0x120F ^ 0x1209] = 0x1203 ^ 0x1209;
        HolyWorldFeatureControl.I[0x3FF0 ^ 0x3FF7] = 0x3F92 ^ 0x3FF7;
        HolyWorldFeatureControl.I[0x3E5A ^ 0x3F4A] = 0x3F65 ^ 0x3F4A;
        HolyWorldFeatureControl.I[0xC7A4 ^ 0xC79F] = 0xC7C4 ^ 0xC79F;
        HolyWorldFeatureControl.I[0x10B06 ^ 0x10BBE] = 0xFFFEF412 ^ 0x10BBE;
        HolyWorldFeatureControl.I[0x8FDB ^ 0x8EB5] = 0x8EB4 ^ 0x8EB5;
        HolyWorldFeatureControl.I[0x3380 ^ 0x332E] = 0x332E ^ 0x332E;
        HolyWorldFeatureControl.I[0xA426 ^ 0xA51D] = 0xA508 ^ 0xA51D;
        HolyWorldFeatureControl.I[0xAA76 ^ 0xAB4E] = 0xAB66 ^ 0xAB4E;
        HolyWorldFeatureControl.I[0x617D ^ 0x61E7] = 0x61E7 ^ 0x61E7;
        HolyWorldFeatureControl.I[0xC362 ^ 0xC3DB] = 0xC3B3 ^ 0xC3DB;
        HolyWorldFeatureControl.I[0xF6DC ^ 0xF7E5] = 0xFFFF0811 ^ 0xF7E5;
        HolyWorldFeatureControl.I[0x9CD7 ^ 0x9D97] = 0x9DDA ^ 0x9D97;
        HolyWorldFeatureControl.I[0xD548 ^ 0xD46C] = 0xD42C ^ 0xD46C;
        HolyWorldFeatureControl.I[0x641F ^ 0x655B] = 0x65ED ^ 0x655B;
        HolyWorldFeatureControl.I[0xE41F ^ 0xE404] = 0xE43F ^ 0xE404;
        HolyWorldFeatureControl.I[0xE887 ^ 0xE89F] = 0xE8EE ^ 0xE89F;
        HolyWorldFeatureControl.I[0x4C49 ^ 0x4D17] = 0xFFFFB2C3 ^ 0x4D17;
        HolyWorldFeatureControl.I[0xDA4D ^ 0xDB67] = 0xFFFF24DB ^ 0xDB67;
        HolyWorldFeatureControl.I[0xD2BD ^ 0xD22B] = 0xD223 ^ 0xD22B;
        HolyWorldFeatureControl.I[0x1214 ^ 0x126B] = 0xFFFFED8E ^ 0x126B;
        HolyWorldFeatureControl.I[0xD441 ^ 0xD4EA] = 0xFFFF2B2F ^ 0xD4EA;
        HolyWorldFeatureControl.I[0xE832 ^ 0xE8AA] = 0xE8D3 ^ 0xE8AA;
        HolyWorldFeatureControl.I[0x10629 ^ 0x10604] = 0x1060E ^ 0x10604;
        HolyWorldFeatureControl.I[0x19B ^ 0x1B3] = 0x1A6 ^ 0x1B3;
        HolyWorldFeatureControl.I[0x6571 ^ 0x655F] = 0x6552 ^ 0x655F;
        HolyWorldFeatureControl.I[0x36E8 ^ 0x37C5] = 0xFFFFC816 ^ 0x37C5;
        HolyWorldFeatureControl.I[0xA716 ^ 0xA788] = 0xA7CD ^ 0xA788;
        HolyWorldFeatureControl.I[0x1000B ^ 0x10115] = 0xFFFEFE82 ^ 0x10115;
        HolyWorldFeatureControl.I[0x14BE ^ 0x146E] = 0xFFFFEBA4 ^ 0x146E;
        HolyWorldFeatureControl.I[0xB490 ^ 0xB47E] = 0xB44F ^ 0xB47E;
        HolyWorldFeatureControl.I[0xE885 ^ 0xE811] = 0xE827 ^ 0xE811;
        HolyWorldFeatureControl.I[0x2E52 ^ 0x2ED6] = 0x2EBE ^ 0x2ED6;
        HolyWorldFeatureControl.I[0x75F7 ^ 0x757E] = 0xFFFF8ABD ^ 0x757E;
        HolyWorldFeatureControl.I[0xFA68 ^ 0xFB1B] = 0xFB0F ^ 0xFB1B;
        HolyWorldFeatureControl.I[0x10AFF ^ 0x10BDE] = 0xFFFEF415 ^ 0x10BDE;
        HolyWorldFeatureControl.I[0x7BA0 ^ 0x7BDC] = 0xFFFF8431 ^ 0x7BDC;
        HolyWorldFeatureControl.I[0xB53 ^ 0xB09] = 0xB54 ^ 0xB09;
        HolyWorldFeatureControl.I[0x8BE8 ^ 0x8ABF] = 0x8AAB ^ 0x8ABF;
        HolyWorldFeatureControl.I[0x3BB8 ^ 0x3B5C] = 0xFFFFC40B ^ 0x3B5C;
        HolyWorldFeatureControl.I[0xE81E ^ 0xE842] = 0xE86F ^ 0xE842;
        HolyWorldFeatureControl.I[0xAFB7 ^ 0xAE91] = 0xAEAF ^ 0xAE91;
        HolyWorldFeatureControl.I[0xA5B3 ^ 0xA5B8] = 0xFFFF5A6B ^ 0xA5B8;
        HolyWorldFeatureControl.I[0xE014 ^ 0xE04D] = 0xFFFF1FFA ^ 0xE04D;
        HolyWorldFeatureControl.I[0x5FAD ^ 0x5ED2] = 0xFA83 ^ 0x5ED2;
        HolyWorldFeatureControl.I[0xB49D ^ 0xB4CA] = 0xB4F3 ^ 0xB4CA;
        HolyWorldFeatureControl.I[0xEFEE ^ 0xEEE8] = 0xEEDD ^ 0xEEE8;
        HolyWorldFeatureControl.I[0xCC28 ^ 0xCD0F] = 0xFFFF32C0 ^ 0xCD0F;
        HolyWorldFeatureControl.I[0xD10D ^ 0xD1E2] = 0xD189 ^ 0xD1E2;
        HolyWorldFeatureControl.I[0xC292 ^ 0xC2F0] = 0xFFFF3D09 ^ 0xC2F0;
        HolyWorldFeatureControl.I[0x9B8D ^ 0x9ACB] = 0xFFFF6568 ^ 0x9ACB;
        HolyWorldFeatureControl.I[0x4443 ^ 0x4484] = 0xFFFFBB68 ^ 0x4484;
        HolyWorldFeatureControl.I[0x34E6 ^ 0x3597] = 0xFFFFCA4A ^ 0x3597;
        HolyWorldFeatureControl.I[0x609A ^ 0x6187] = 0xFFFF9EFF ^ 0x6187;
        HolyWorldFeatureControl.I[0xDF19 ^ 0xDFE1] = 0xFFFF2036 ^ 0xDFE1;
        HolyWorldFeatureControl.I[0x853A ^ 0x8428] = 0xFFFF7BBE ^ 0x8428;
        HolyWorldFeatureControl.I[0x63BE ^ 0x62B4] = 0x629E ^ 0x62B4;
        HolyWorldFeatureControl.I[0xAF49 ^ 0xAF49] = 0xAF6D ^ 0xAF49;
        HolyWorldFeatureControl.I[0x48A8 ^ 0x48EA] = 0x48F9 ^ 0x48EA;
        HolyWorldFeatureControl.I[0x6FE ^ 0x6B2] = 0x6AB ^ 0x6B2;
        HolyWorldFeatureControl.I[0x646 ^ 0x66A] = 0xFFFFF9EF ^ 0x66A;
        HolyWorldFeatureControl.I[0x10406 ^ 0x10485] = 0xFFFEFB60 ^ 0x10485;
        HolyWorldFeatureControl.I[0xA828 ^ 0xA93D] = 0xFFFF5687 ^ 0xA93D;
        HolyWorldFeatureControl.I[0xE6B1 ^ 0xE6EC] = 0xE6A6 ^ 0xE6EC;
        HolyWorldFeatureControl.I[0xE22C ^ 0xE24A] = 0xE266 ^ 0xE24A;
        HolyWorldFeatureControl.I[0x121B ^ 0x124D] = 0xFFFFEDEF ^ 0x124D;
        HolyWorldFeatureControl.I[0x2C1A ^ 0x2D29] = 0xFFFFD2D7 ^ 0x2D29;
        HolyWorldFeatureControl.I[0x2799 ^ 0x27F8] = 0xFFFFD862 ^ 0x27F8;
        HolyWorldFeatureControl.I[0xD48B ^ 0xD584] = 0xD5B2 ^ 0xD584;
        HolyWorldFeatureControl.I[0xFD41 ^ 0xFD55] = 0xFD0B ^ 0xFD55;
        HolyWorldFeatureControl.I[0x3E2E ^ 0x3F74] = 0x3F33 ^ 0x3F74;
        HolyWorldFeatureControl.I[0xDE3B ^ 0xDEF7] = 0xDE62 ^ 0xDEF7;
        HolyWorldFeatureControl.I[0x8CA ^ 0x98B] = 0x99C ^ 0x98B;
        HolyWorldFeatureControl.I[0x4297 ^ 0x43BE] = 0x43A8 ^ 0x43BE;
        HolyWorldFeatureControl.I[0x6B45 ^ 0x6B72] = 0xFFFF94E8 ^ 0x6B72;
        HolyWorldFeatureControl.I[0x8CD1 ^ 0x8C5B] = 0xFFFF7398 ^ 0x8C5B;
        HolyWorldFeatureControl.I[0xA008 ^ 0xA068] = 0xA00B ^ 0xA068;
        HolyWorldFeatureControl.I[0x7FB6 ^ 0x7EB4] = 0xFFFF814E ^ 0x7EB4;
        HolyWorldFeatureControl.I[0x6A02 ^ 0x6B4F] = 0x6B1B ^ 0x6B4F;
        HolyWorldFeatureControl.I[0xB6B4 ^ 0xB7AD] = 0xB7F3 ^ 0xB7AD;
        HolyWorldFeatureControl.I[0x32FB ^ 0x32E2] = 0xFFFFCD7F ^ 0x32E2;
        HolyWorldFeatureControl.I[0x5B53 ^ 0x5BAF] = 0xFFFFA427 ^ 0x5BAF;
        HolyWorldFeatureControl.I[0x8611 ^ 0x8721] = 0x8758 ^ 0x8721;
        HolyWorldFeatureControl.I[0x3CE0 ^ 0x3DF8] = 0x3DCE ^ 0x3DF8;
        HolyWorldFeatureControl.I[0x4081 ^ 0x418D] = 0x419D ^ 0x418D;
        HolyWorldFeatureControl.I[0xA030 ^ 0xA138] = 0xFFFF5EAA ^ 0xA138;
        HolyWorldFeatureControl.I[0x29F3 ^ 0x29A3] = 0x29CA ^ 0x29A3;
        HolyWorldFeatureControl.I[0x81A7 ^ 0x8173] = 0xFFFF7EB2 ^ 0x8173;
        HolyWorldFeatureControl.I[0xA880 ^ 0xA9CA] = 0xA9AB ^ 0xA9CA;
        HolyWorldFeatureControl.I[0x6564 ^ 0x650A] = 0xFFFF9AC0 ^ 0x650A;
        HolyWorldFeatureControl.I[0xF8F8 ^ 0xF8ED] = 0xFFFF0707 ^ 0xF8ED;
        HolyWorldFeatureControl.I[0xFF65 ^ 0xFE51] = 0xFE6A ^ 0xFE51;
        HolyWorldFeatureControl.I[0x57EC ^ 0x5767] = 0x5775 ^ 0x5767;
        HolyWorldFeatureControl.I[0xB69F ^ 0xB697] = 0xFFFF4912 ^ 0xB697;
        HolyWorldFeatureControl.I[0x110 ^ 0x66] = 0x3D ^ 0x66;
        HolyWorldFeatureControl.I[0xE07D ^ 0xE0BB] = 0xE09E ^ 0xE0BB;
        HolyWorldFeatureControl.I[0xB683 ^ 0xB700] = 0xD835 ^ 0xB700;
        HolyWorldFeatureControl.I[0x371C ^ 0x37AE] = 0x37DE ^ 0x37AE;
        HolyWorldFeatureControl.I[0xE42 ^ 0xE91] = 0xE92 ^ 0xE91;
        HolyWorldFeatureControl.I[0x9C6D ^ 0x9D5F] = 0x9D42 ^ 0x9D5F;
        HolyWorldFeatureControl.I[0x1D28 ^ 0x1D17] = 0xFFFFE2FB ^ 0x1D17;
        HolyWorldFeatureControl.I[0x1170 ^ 0x113F] = 0xFFFFEEC6 ^ 0x113F;
        HolyWorldFeatureControl.I[0xBDE1 ^ 0xBDB2] = 0xBDA6 ^ 0xBDB2;
        HolyWorldFeatureControl.I[0x348 ^ 0x22D] = 0x278 ^ 0x22D;
        HolyWorldFeatureControl.I[0xA8A3 ^ 0xA83C] = 0xFFFF57C9 ^ 0xA83C;
        HolyWorldFeatureControl.I[0xF689 ^ 0xF6F0] = 0xF6D7 ^ 0xF6F0;
        HolyWorldFeatureControl.I[0xC1ED ^ 0xC096] = 0xC094 ^ 0xC096;
        HolyWorldFeatureControl.I[0x6E26 ^ 0x6E54] = 0xFFFF918E ^ 0x6E54;
        HolyWorldFeatureControl.I[0xC8CC ^ 0xC8EA] = 0xC8C7 ^ 0xC8EA;
        HolyWorldFeatureControl.I[0xD8F0 ^ 0xD982] = 0xFFFF266C ^ 0xD982;
        HolyWorldFeatureControl.I[0xA23E ^ 0xA2F7] = 0xFFFF5D67 ^ 0xA2F7;
        HolyWorldFeatureControl.I[0x8613 ^ 0x86BF] = 0xFFFF7934 ^ 0x86BF;
        HolyWorldFeatureControl.I[0xD393 ^ 0xD2DD] = 0xD2FD ^ 0xD2DD;
        HolyWorldFeatureControl.I[0xFBDE ^ 0xFB23] = 0xFB21 ^ 0xFB23;
        HolyWorldFeatureControl.I[0xD8F5 ^ 0xD8D4] = 0xFFFF2728 ^ 0xD8D4;
        HolyWorldFeatureControl.I[0xC6BD ^ 0xC603] = 0xC678 ^ 0xC603;
        HolyWorldFeatureControl.I[0x2040 ^ 0x2176] = 0xFFFFDEAB ^ 0x2176;
        HolyWorldFeatureControl.I[0x67B5 ^ 0x674F] = 0xFFFF9890 ^ 0x674F;
        HolyWorldFeatureControl.I[0x4108 ^ 0x408A] = 0x511E ^ 0x408A;
        HolyWorldFeatureControl.I[0xE15A ^ 0xE1FF] = 0xFFFF1E49 ^ 0xE1FF;
        HolyWorldFeatureControl.I[0x9EEF ^ 0x9E19] = 0x9E00 ^ 0x9E19;
        HolyWorldFeatureControl.I[0x10A7 ^ 0x107A] = 0xFFFFEFB2 ^ 0x107A;
        HolyWorldFeatureControl.I[0x5DC3 ^ 0x5CE1] = 0x5CCA ^ 0x5CE1;
        HolyWorldFeatureControl.I[0xC237 ^ 0xC233] = 0xFFFF3DE5 ^ 0xC233;
        HolyWorldFeatureControl.I[0xB918 ^ 0xB9C6] = 0xB9F7 ^ 0xB9C6;
        HolyWorldFeatureControl.I[0xE413 ^ 0xE427] = 0xE40A ^ 0xE427;
        HolyWorldFeatureControl.I[0x6195 ^ 0x6013] = 0x6E69 ^ 0x6013;
        HolyWorldFeatureControl.I[0xAE97 ^ 0xAF8C] = 0xFFFF5072 ^ 0xAF8C;
        HolyWorldFeatureControl.I[0x7484 ^ 0x74F1] = 0x7489 ^ 0x74F1;
        HolyWorldFeatureControl.I[0x51B8 ^ 0x5030] = 0x7CEA ^ 0x5030;
        HolyWorldFeatureControl.I[0x20B7 ^ 0x20C7] = 0x209D ^ 0x20C7;
        HolyWorldFeatureControl.I[0x60BC ^ 0x61EF] = 0xFFFF9E26 ^ 0x61EF;
        HolyWorldFeatureControl.I[0xA8CD ^ 0xA9E2] = 0xA956 ^ 0xA9E2;
        HolyWorldFeatureControl.I[0xDE55 ^ 0xDEBD] = 0xDEFB ^ 0xDEBD;
        HolyWorldFeatureControl.I[0xCAB5 ^ 0xCA0F] = 0xCA60 ^ 0xCA0F;
        HolyWorldFeatureControl.I[0x3CAE ^ 0x3DD2] = 0x3DD2 ^ 0x3DD2;
        HolyWorldFeatureControl.I[0xDC8C ^ 0xDD93] = 0xDDAC ^ 0xDD93;
        HolyWorldFeatureControl.I[0xF622 ^ 0xF6AC] = 0xFFFF0940 ^ 0xF6AC;
        HolyWorldFeatureControl.I[0x6F73 ^ 0x6F99] = 0xFFFF9078 ^ 0x6F99;
        HolyWorldFeatureControl.I[0x4C67 ^ 0x4CD3] = 0xFFFFB32E ^ 0x4CD3;
        HolyWorldFeatureControl.I[0xEA92 ^ 0xEA70] = 0xFFFF1599 ^ 0xEA70;
        HolyWorldFeatureControl.I[4 ^ 0x185] = 0x88D7 ^ 0x185;
        HolyWorldFeatureControl.I[0x486E ^ 0x4979] = 0xFFFFB6F5 ^ 0x4979;
        HolyWorldFeatureControl.I[0x322F ^ 0x323C] = 0xFFFFCDE2 ^ 0x323C;
        HolyWorldFeatureControl.I[0x25DD ^ 0x2481] = 0x244A ^ 0x2481;
        HolyWorldFeatureControl.I[0x18B2 ^ 0x188E] = 0xFFFFE742 ^ 0x188E;
        HolyWorldFeatureControl.I[0x8F9A ^ 0x8EE0] = 0x8EE0 ^ 0x8EE0;
        HolyWorldFeatureControl.I[0x885B ^ 0x88DC] = 0x88F0 ^ 0x88DC;
        HolyWorldFeatureControl.I[0x692C ^ 0x6816] = 0x682A ^ 0x6816;
        HolyWorldFeatureControl.I[0x7C3C ^ 0x7CC8] = 0xFFFF8307 ^ 0x7CC8;
        HolyWorldFeatureControl.I[0xEE06 ^ 0xEEF9] = 0xEEFB ^ 0xEEF9;
        HolyWorldFeatureControl.I[0x3897 ^ 0x3840] = 0xFFFFC7E1 ^ 0x3840;
        HolyWorldFeatureControl.I[0x4585 ^ 0x4538] = 0xFFFFBAB2 ^ 0x4538;
        HolyWorldFeatureControl.I[0x5715 ^ 0x5624] = 0xFFFFA9C1 ^ 0x5624;
        HolyWorldFeatureControl.I[0xE1C6 ^ 0xE1BC] = 0xFFFF1E3A ^ 0xE1BC;
        HolyWorldFeatureControl.I[0x3C18 ^ 0x3C0F] = 0x3C10 ^ 0x3C0F;
        HolyWorldFeatureControl.I[0x743B ^ 0x745F] = 0x7477 ^ 0x745F;
        HolyWorldFeatureControl.I[0x727D ^ 0x73FA] = 0x4B60 ^ 0x73FA;
        HolyWorldFeatureControl.I[0x9557 ^ 0x953C] = 0xFFFF6AEC ^ 0x953C;
        HolyWorldFeatureControl.I[0x2C21 ^ 0x2DA1] = 0x5EB3 ^ 0x2DA1;
        HolyWorldFeatureControl.I[0xDF1F ^ 0xDF15] = 0xDF4F ^ 0xDF15;
        HolyWorldFeatureControl.I[0x4208 ^ 0x4275] = 0x423F ^ 0x4275;
        HolyWorldFeatureControl.I[0x11AC ^ 0x10EB] = 0x1083 ^ 0x10EB;
        HolyWorldFeatureControl.I[0x4BA3 ^ 0x4B33] = 0xFFFFB4D5 ^ 0x4B33;
        HolyWorldFeatureControl.I[0x15C1 ^ 0x14A3] = 0x14D4 ^ 0x14A3;
        HolyWorldFeatureControl.I[0xF680 ^ 0xF66C] = 0xF675 ^ 0xF66C;
        HolyWorldFeatureControl.I[0xBBB2 ^ 0xBB82] = 0xFFFF4478 ^ 0xBB82;
        HolyWorldFeatureControl.I[0x9235 ^ 0x92F5] = 0xFFFF6D85 ^ 0x92F5;
        HolyWorldFeatureControl.I[0x103FC ^ 0x103B7] = 0xFFFEFC28 ^ 0x103B7;
        HolyWorldFeatureControl.I[0xF649 ^ 0xF62A] = 0xF639 ^ 0xF62A;
        HolyWorldFeatureControl.I[0x7DC ^ 0x7B5] = 0xFFFFF85A ^ 0x7B5;
        HolyWorldFeatureControl.I[0x9B8A ^ 0x9BD5] = 0xFFFF6412 ^ 0x9BD5;
        HolyWorldFeatureControl.I[0xF226 ^ 0xF2A9] = 0xF2F0 ^ 0xF2A9;
        HolyWorldFeatureControl.I[0x243C ^ 0x24D1] = 0x24EB ^ 0x24D1;
        HolyWorldFeatureControl.I[0x4E4 ^ 0x5CC] = 0x5E3 ^ 0x5CC;
        HolyWorldFeatureControl.I[0xE0B ^ 0xEF2] = 0xE7B ^ 0xEF2;
        HolyWorldFeatureControl.I[0x7986 ^ 0x79BE] = 0xFFFF8619 ^ 0x79BE;
        HolyWorldFeatureControl.I[0x9561 ^ 0x9524] = 0xFFFF6AE9 ^ 0x9524;
        HolyWorldFeatureControl.I[0x6681 ^ 0x660D] = 0xFFFF99CD ^ 0x660D;
        HolyWorldFeatureControl.I[0x8F1D ^ 0x8F34] = 0xFFFF70CD ^ 0x8F34;
        HolyWorldFeatureControl.I[0x815F ^ 0x8165] = 0x810C ^ 0x8165;
        HolyWorldFeatureControl.I[0xAB8 ^ 0xBF7] = 0xFFFFF47A ^ 0xBF7;
        HolyWorldFeatureControl.I[0x25C2 ^ 0x24EE] = 0xFFFFDB62 ^ 0x24EE;
        HolyWorldFeatureControl.I[0xCCCF ^ 0xCCF2] = 0xCCF1 ^ 0xCCF2;
        HolyWorldFeatureControl.I[0xB4AE ^ 0xB489] = 0xFFFF4B6C ^ 0xB489;
        HolyWorldFeatureControl.I[0x9FC6 ^ 0x9E4C] = 0x9E4C ^ 0x9E4C;
        HolyWorldFeatureControl.I[0x773D ^ 0x7654] = 0xFFFF89AF ^ 0x7654;
        HolyWorldFeatureControl.I[0x2F62 ^ 0x2FF7] = 0x2FA9 ^ 0x2FF7;
        HolyWorldFeatureControl.I[0x795 ^ 0x686] = 0x6FB ^ 0x686;
        HolyWorldFeatureControl.I[0x1A46 ^ 0x1A2B] = 0xFFFFE5B6 ^ 0x1A2B;
        HolyWorldFeatureControl.I[0x1DA8 ^ 0x1CA6] = 0xFFFFE35C ^ 0x1CA6;
        HolyWorldFeatureControl.I[0x53B5 ^ 0x53F1] = 0xFFFFAC1C ^ 0x53F1;
        HolyWorldFeatureControl.I[0x5F9E ^ 0x5F36] = 0xFFFFA0E5 ^ 0x5F36;
        HolyWorldFeatureControl.I[0xE9BA ^ 0xE89A] = 0xE8A4 ^ 0xE89A;
        HolyWorldFeatureControl.I[0x3B1C ^ 0x3A55] = 0xFFFFC580 ^ 0x3A55;
        HolyWorldFeatureControl.I[0x14A5 ^ 0x15C9] = 0x15FA ^ 0x15C9;
        HolyWorldFeatureControl.I[0x8F32 ^ 0x8F00] = 0x8F2F ^ 0x8F00;
        HolyWorldFeatureControl.I[0xDB9D ^ 0xDB66] = 0xFFFF24DE ^ 0xDB66;
        HolyWorldFeatureControl.I[0x83A2 ^ 0x83BE] = 0xFFFF7C4D ^ 0x83BE;
        HolyWorldFeatureControl.I[0x1D92 ^ 0x1D2E] = 0x1D02 ^ 0x1D2E;
        HolyWorldFeatureControl.I[0x27ED ^ 0x2689] = 0xFFFFD94B ^ 0x2689;
        HolyWorldFeatureControl.I[0x6B63 ^ 0x6BD6] = 0x6BCA ^ 0x6BD6;
        HolyWorldFeatureControl.I[0xAE72 ^ 0xAF4E] = 0xFFFF50A1 ^ 0xAF4E;
        HolyWorldFeatureControl.I[0x4112 ^ 0x4104] = 0x4130 ^ 0x4104;
        HolyWorldFeatureControl.I[0x681F ^ 0x686E] = 0xFFFF97CF ^ 0x686E;
        HolyWorldFeatureControl.I[0xC3C7 ^ 0xC32C] = 0xFFFF3CF6 ^ 0xC32C;
        HolyWorldFeatureControl.I[0x1069A ^ 0x1067C] = 0xFFFEF9E6 ^ 0x1067C;
        HolyWorldFeatureControl.I[0xF749 ^ 0xF6CD] = 0xD858 ^ 0xF6CD;
        HolyWorldFeatureControl.I[0x7ACA ^ 0x7B86] = 0xFFFF8424 ^ 0x7B86;
        HolyWorldFeatureControl.I[0xC6CB ^ 0xC6EB] = 0xFFFF3949 ^ 0xC6EB;
        HolyWorldFeatureControl.I[0xCE88 ^ 0xCE1B] = 0xFFFF3197 ^ 0xCE1B;
        HolyWorldFeatureControl.I[0xFDF6 ^ 0xFD99] = 0xFFFF02CE ^ 0xFD99;
        HolyWorldFeatureControl.I[0xC72C ^ 0xC651] = 0xC651 ^ 0xC651;
        HolyWorldFeatureControl.I[0xD972 ^ 0xD811] = 0xFFFF27DC ^ 0xD811;
        HolyWorldFeatureControl.I[0x10300 ^ 0x1034D] = 0xFFFEFCD9 ^ 0x1034D;
        HolyWorldFeatureControl.I[0xEC06 ^ 0xECDE] = 0xEC06 ^ 0xECDE;
        HolyWorldFeatureControl.I[0x899B ^ 0x8906] = 0x8904 ^ 0x8906;
        HolyWorldFeatureControl.I[0x10345 ^ 0x10240] = 0xFFFEFD9F ^ 0x10240;
        HolyWorldFeatureControl.I[0xECE8 ^ 0xED89] = 0xFFFF125A ^ 0xED89;
        HolyWorldFeatureControl.I[0x7EC5 ^ 0x7FC2] = 0x7FCD ^ 0x7FC2;
        HolyWorldFeatureControl.I[0xF7E ^ 0xEF2] = 0xFFFFF13F ^ 0xEF2;
        HolyWorldFeatureControl.I[0xE9B1 ^ 0xE8E8] = 0xFFFF1715 ^ 0xE8E8;
        HolyWorldFeatureControl.I[0x21B4 ^ 0x21F3] = 0x2190 ^ 0x21F3;
        HolyWorldFeatureControl.I[0xACF1 ^ 0xACA4] = 0xACE0 ^ 0xACA4;
        HolyWorldFeatureControl.I[0xE081 ^ 0xE181] = 0xE1DB ^ 0xE181;
        HolyWorldFeatureControl.I[0xAC14 ^ 0xAD31] = 0xAD11 ^ 0xAD31;
        HolyWorldFeatureControl.I[0xDA1E ^ 0xDA66] = 0xFFFF25D0 ^ 0xDA66;
        HolyWorldFeatureControl.I[0x76AE ^ 0x7681] = 0x768F ^ 0x7681;
        HolyWorldFeatureControl.I[0x805F ^ 0x8138] = 0xFFFF7EDA ^ 0x8138;
        HolyWorldFeatureControl.I[0xB0F ^ 0xBD0] = 0xBD2 ^ 0xBD0;
        HolyWorldFeatureControl.I[0x4EF9 ^ 0x4EE8] = 0x4E8D ^ 0x4EE8;
        HolyWorldFeatureControl.I[0xC226 ^ 0xC260] = 0xFFFF3DEE ^ 0xC260;
        HolyWorldFeatureControl.I[0xB0DC ^ 0xB078] = 0xFFFF4FBB ^ 0xB078;
        HolyWorldFeatureControl.I[0xE709 ^ 0xE622] = 0xE66C ^ 0xE622;
        HolyWorldFeatureControl.I[0xE930 ^ 0xE839] = 0xFFFF1783 ^ 0xE839;
        HolyWorldFeatureControl.I[0xF59B ^ 0xF4F4] = 0xFFFF0B20 ^ 0xF4F4;
        HolyWorldFeatureControl.I[0x67D9 ^ 0x6798] = 0x67F2 ^ 0x6798;
        HolyWorldFeatureControl.I[0x9486 ^ 0x94CE] = 0xFFFF6B45 ^ 0x94CE;
        HolyWorldFeatureControl.I[0x7A8F ^ 0x7A34] = 0xFFFF85AF ^ 0x7A34;
        HolyWorldFeatureControl.I[0x16CC ^ 0x163C] = 0x167A ^ 0x163C;
        HolyWorldFeatureControl.I[0x2D9F ^ 0x2CCA] = 0x2CED ^ 0x2CCA;
        HolyWorldFeatureControl.I[0x180A ^ 0x1935] = 0x1937 ^ 0x1935;
        HolyWorldFeatureControl.I[0x99F3 ^ 0x99C6] = 0x998B ^ 0x99C6;
        HolyWorldFeatureControl.I[0x355B ^ 0x35D6] = 0x35F6 ^ 0x35D6;
        HolyWorldFeatureControl.I[0x63EC ^ 0x63C7] = 0xFFFF9C69 ^ 0x63C7;
        HolyWorldFeatureControl.I[0x7A1E ^ 0x7AA9] = 0xFFFF854D ^ 0x7AA9;
        HolyWorldFeatureControl.I[0xA567 ^ 0xA50D] = 0xA557 ^ 0xA50D;
        HolyWorldFeatureControl.I[0xB9F9 ^ 0xB960] = 0xB909 ^ 0xB960;
        HolyWorldFeatureControl.I[0x109E5 ^ 0x109AC] = 0x109EC ^ 0x109AC;
        HolyWorldFeatureControl.I[0xA650 ^ 0xA6C2] = 0xFFFF5977 ^ 0xA6C2;
        HolyWorldFeatureControl.I[0x4C8F ^ 0x4C0D] = 0x4C08 ^ 0x4C0D;
        HolyWorldFeatureControl.I[0x23C1 ^ 0x2377] = 0xFFFFDCB6 ^ 0x2377;
        HolyWorldFeatureControl.I[0xC606 ^ 0xC728] = 0xC717 ^ 0xC728;
        HolyWorldFeatureControl.I[0x74FA ^ 0x740B] = 0xFFFF8B85 ^ 0x740B;
        HolyWorldFeatureControl.I[0x9851 ^ 0x9888] = 0xFFFF6713 ^ 0x9888;
        HolyWorldFeatureControl.I[0x5138 ^ 0x51DD] = 0xFFFFAE40 ^ 0x51DD;
        HolyWorldFeatureControl.I[0x48FF ^ 0x48D5] = 0x48FE ^ 0x48D5;
        HolyWorldFeatureControl.I[0xC689 ^ 0xC62B] = 0xFFFF39F8 ^ 0xC62B;
        HolyWorldFeatureControl.I[0x7005 ^ 0x700A] = 0x700E ^ 0x700A;
        HolyWorldFeatureControl.I[0x10B7C ^ 0x10A27] = 0xFFFEF591 ^ 0x10A27;
        HolyWorldFeatureControl.I[0x6AC9 ^ 0x6AFA] = 0xFFFF9504 ^ 0x6AFA;
        HolyWorldFeatureControl.I[0xEA8A ^ 0xEAF4] = 0xFFFF153D ^ 0xEAF4;
        HolyWorldFeatureControl.I[0x4A35 ^ 0x4A30] = 0x4A5A ^ 0x4A30;
        HolyWorldFeatureControl.I[0x5CA0 ^ 0x5D95] = 0xFFFFA263 ^ 0x5D95;
        HolyWorldFeatureControl.I[0x745F ^ 0x74AA] = 0x74A1 ^ 0x74AA;
        HolyWorldFeatureControl.I[0x6927 ^ 0x6935] = 0x69B5 ^ 0x6935;
        HolyWorldFeatureControl.I[0xF913 ^ 0xF850] = 0xFFFF07C3 ^ 0xF850;
        HolyWorldFeatureControl.I[0x92E9 ^ 0x92A3] = 0x92F6 ^ 0x92A3;
        HolyWorldFeatureControl.I[0xB2A3 ^ 0xB222] = 0xB214 ^ 0xB222;
        HolyWorldFeatureControl.I[0x6045 ^ 0x605B] = 0xFFFF9FA9 ^ 0x605B;
        HolyWorldFeatureControl.I[0x5647 ^ 0x569C] = 0x569B ^ 0x569C;
        HolyWorldFeatureControl.I[0x28F5 ^ 0x29C2] = 0x29C9 ^ 0x29C2;
        HolyWorldFeatureControl.I[0xCDF4 ^ 0xCD93] = 0xFFFF322D ^ 0xCD93;
        HolyWorldFeatureControl.I[0x2451 ^ 0x2472] = 0xFFFFDBD8 ^ 0x2472;
        HolyWorldFeatureControl.I[0x9186 ^ 0x9087] = 0xFFFF6F43 ^ 0x9087;
        HolyWorldFeatureControl.I[0xB3F6 ^ 0xB2F2] = 0xB2AE ^ 0xB2F2;
        HolyWorldFeatureControl.I[0x4F51 ^ 0x4FD1] = 0x4FDD ^ 0x4FD1;
        HolyWorldFeatureControl.I[0x40E ^ 0x437] = 0x4D3 ^ 0x437;
        HolyWorldFeatureControl.I[0xD6A2 ^ 0xD663] = 0xD632 ^ 0xD663;
        HolyWorldFeatureControl.I[0xFA8F ^ 0xFBC4] = 0xFFFF0458 ^ 0xFBC4;
        HolyWorldFeatureControl.I[0xF5E ^ 0xF7A] = 0xF4F ^ 0xF7A;
        HolyWorldFeatureControl.I[0x398F ^ 0x3983] = 0x39A2 ^ 0x3983;
        HolyWorldFeatureControl.I[0xAEEB ^ 0xAE54] = 0xFFFF5185 ^ 0xAE54;
        HolyWorldFeatureControl.I[0xFC40 ^ 0xFCF1] = 0xFFFF03C9 ^ 0xFCF1;
    }
}

