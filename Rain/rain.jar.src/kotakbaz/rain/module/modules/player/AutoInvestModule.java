/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.player;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.client.util.other.ServerUtil;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.restrict.FuntimeRestrict;
import kotakbaz.rain.module.setting.settings.TextSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardEntry;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u0003R\u0014\u0010\u001c\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b'\u0010\u001fR\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b(\u0010\u001fR\u0016\u0010)\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b)\u0010\u001fR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010,\u00a8\u0006-"}, d2={"Lkotakbaz/rain/module/modules/player/AutoInvestModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "", "configuredInvestAmount", "()Ljava/lang/Long;", "findSidebarBalance", "", "value", "sanitizeScoreboardLine", "(Ljava/lang/String;)Ljava/lang/String;", "text", "parseLargestPositiveNumber", "(Ljava/lang/String;)Ljava/lang/Long;", "currentBalance", "", "isInvestmentApplied", "(J)Z", "clearPendingInvestment", "resetState", "BALANCE_MARKER", "Ljava/lang/String;", "INVEST_COMMAND_COOLDOWN_MS", "J", "INVEST_CONFIRM_TIMEOUT_MS", "INVEST_RETRY_DELAY_MS", "Lkotakbaz/rain/module/setting/settings/TextSetting;", "investAmount", "Lkotakbaz/rain/module/setting/settings/TextSetting;", "pendingBalanceBeforeInvest", "Ljava/lang/Long;", "pendingInvestAmount", "pendingUntil", "nextInvestAt", "Lkotlin/text/Regex;", "NUMBER_REGEX", "Lkotlin/text/Regex;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nAutoInvestModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoInvestModule.kt\nkotakbaz/rain/module/modules/player/AutoInvestModule\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,187:1\n437#2:188\n513#2,5:189\n437#2:205\n513#2,5:206\n1#3:194\n1915#4,2:195\n296#4,2:197\n296#4:199\n1807#4,3:200\n297#4:203\n1342#5:204\n1343#5:211\n*S KotlinDebug\n*F\n+ 1 AutoInvestModule.kt\nkotakbaz/rain/module/modules/player/AutoInvestModule\n*L\n97#1:188\n97#1:189,5\n158#1:205\n158#1:206,5\n116#1:195,2\n129#1:197,2\n138#1:199\n140#1:200,3\n138#1:203\n157#1:204\n157#1:211\n*E\n"})
public final class AutoInvestModule
extends Module {
    @NotNull
    public static final AutoInvestModule INSTANCE;
    @NotNull
    private static final String a = "\u043c\u043e\u043d\u0435\u0442";
    private static final long A = 1250L;
    private static final long b = 4000L;
    private static final long B = 500L;
    @NotNull
    private static final TextSetting c;
    @Nullable
    private static Long C;
    private static long d;
    private static long D;
    private static long e;
    @NotNull
    private static final Regex E;
    private static Object[] f;
    private static Object g;
    private static Object[] G;
    private static Object[] F;
    private static Object[] h;
    public static int[] H;

    private AutoInvestModule() {
        int n2 = H[0];
        n2 -= H[1];
        int n3 = H[3];
        n3 -= H[4];
        int n4 = H[6];
        n4 ^= H[7];
        super((String)f[n2 -= H[2]], a_0.getPLAYER(), (String)f[n3 -= H[5]] + (String)f[n4 += H[8]]);
    }

    @Override
    public void onEnable() {
        this.resetState();
    }

    @Override
    public void onDisable() {
        this.resetState();
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        long l2 = 3096355305677719615L;
        int n2 = H[9];
        n2 ^= H[10];
        Intrinsics.checkNotNullParameter(event, (String)f[n2 ^= H[11]]);
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            AutoInvestModule autoInvestModule = this;
            long l3 = l2;
            int n3 = H[12];
            n3 ^= H[13];
            l2 = l3 ^ (0L ^ l3) & -1L << (n3 -= H[14]);
            autoInvestModule.resetState();
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        if (kotakbaz.rain.client.extensions.b.getMc().world == null) {
            AutoInvestModule autoInvestModule = this;
            long l4 = l2;
            int n4 = H[15];
            n4 -= H[16];
            l2 = l4 ^ (0L ^ l4) & -1L << (n4 -= H[17]);
            autoInvestModule.resetState();
            return;
        }
        if (!ServerUtil.INSTANCE.isFunTimeContext()) {
            this.resetState();
            return;
        }
        if (!clientPlayerEntity2.isAlive() || clientPlayerEntity2.isSpectator()) {
            this.resetState();
            return;
        }
        if (kotakbaz.rain.client.extensions.b.getMc().currentScreen instanceof ChatScreen) {
            return;
        }
        Long l5 = this.configuredInvestAmount();
        if (l5 == null) {
            return;
        }
        long l6 = l5;
        Long l7 = this.findSidebarBalance();
        if (l7 == null) {
            return;
        }
        long l8 = l7;
        ClientPlayNetworkHandler clientPlayNetworkHandler = kotakbaz.rain.client.extensions.b.getMc().getNetworkHandler();
        if (clientPlayNetworkHandler == null) {
            return;
        }
        ClientPlayNetworkHandler clientPlayNetworkHandler2 = clientPlayNetworkHandler;
        long l9 = System.currentTimeMillis();
        if (C != null) {
            if (this.isInvestmentApplied(l8)) {
                this.clearPendingInvestment();
            } else {
                if (l9 < D) {
                    return;
                }
                this.clearPendingInvestment();
                e = Math.max(e, l9 + 500L);
            }
        }
        if (l9 < e) {
            return;
        }
        if (l8 < l6) {
            return;
        }
        long l10 = l6;
        int n5 = H[18];
        n5 += H[19];
        clientPlayNetworkHandler2.sendChatCommand((String)f[n5 ^= H[20]] + l10);
        C = l8;
        d = l6;
        D = l9 + 4000L;
        e = l9 + 1250L;
    }

    private final Long configuredInvestAmount() {
        int n2;
        long l2 = 3328576203262200243L;
        long l3 = 3990287256631281808L;
        long l4 = 2693010801295790109L;
        long l5 = 4875543648086178323L;
        long l6 = -8327255201376831993L;
        long l7 = -870185258252598377L;
        long l8 = 6964303040403239280L;
        long l9 = -6106329647353325995L;
        String string = (String)c.getValue();
        long l10 = l8;
        int n3 = H[21];
        n3 -= H[22];
        l8 = l10 ^ (0L ^ l10) & -1L << (n3 -= H[23]);
        Object object = string;
        Appendable appendable = new StringBuilder();
        long l11 = l8;
        int n4 = H[24];
        n4 += H[25];
        l8 = l11 ^ (0L ^ l11) & -1L >>> (n4 ^= H[26]);
        long l12 = l9;
        int n5 = H[27];
        n5 += H[28];
        long l13 = l9 = l12 ^ (0L ^ l12) & -1L << (n5 -= H[29]);
        int n6 = H[30];
        n6 += H[31];
        l9 = l13 ^ ((long)object.length() ^ l13) & -1L >>> (n6 ^= H[32]);
        while (true) {
            int n7 = H[33];
            n7 -= H[34];
            if ((int)(l9 >>> (n7 ^= H[35])) >= (int)l9) break;
            int n8 = H[36];
            n8 -= H[37];
            n8 -= H[38];
            int n9 = H[39];
            n9 ^= H[40];
            long l14 = l6;
            int n10 = H[42];
            n10 += H[43];
            l6 = l14 ^ ((long)object.charAt((int)(l9 >>> n8)) << (n9 ^= H[41]) ^ l14) & -1L << (n10 ^= H[44]);
            int n11 = H[45];
            n11 -= H[46];
            long l15 = l5;
            int n12 = H[48];
            n12 ^= H[49];
            long l16 = l5 = l15 ^ ((long)((int)(l6 >>> (n11 ^= H[47]))) ^ l15) & -1L >>> (n12 -= H[50]);
            int n13 = H[51];
            n13 -= H[52];
            l5 = l16 ^ (0L ^ l16) & -1L << (n13 += H[53]);
            if (Character.isDigit((char)l5)) {
                int n14 = H[54];
                n14 += H[55];
                appendable.append((char)(l6 >>> (n14 ^= H[56])));
            }
            l9 += 0x100000000L;
        }
        String string2 = ((StringBuilder)appendable).toString();
        Long l17 = StringsKt.toLongOrNull(string2);
        if (l17 == null) {
            return null;
        }
        long l18 = l17;
        object = l18;
        long l19 = ((Number)object).longValue();
        long l20 = l9;
        int n15 = H[57];
        n15 ^= H[58];
        l9 = l20 ^ (0L ^ l20) & -1L << (n15 += H[59]);
        if (l19 > 0L) {
            int n16 = H[60];
            n16 ^= H[61];
            n2 = n16 += H[62];
        } else {
            int n17 = H[63];
            n17 += H[64];
            n2 = n17 -= H[65];
        }
        return n2 != 0 ? object : null;
    }

    private final Long findSidebarBalance() {
        Long l2;
        Object object;
        Object object3;
        long l3;
        block17: {
            Object v11;
            String string;
            Object object2;
            List<String> list;
            Object object4;
            Object object7;
            Object object8;
            LinkedHashSet<String> linkedHashSet;
            long l4;
            long l5;
            block15: {
                long l6 = 2659057524403891927L;
                long l7 = -4937641029568568987L;
                l5 = -4659693787267173427L;
                l4 = 371499175848855667L;
                l3 = -4471784254542309691L;
                ClientWorld clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
                if (clientWorld == null || (clientWorld = clientWorld.getScoreboard()) == null) {
                    return null;
                }
                ClientWorld clientWorld2 = clientWorld;
                ScoreboardObjective scoreboardObjective = clientWorld2.getObjectiveForSlot(ScoreboardDisplaySlot.SIDEBAR);
                if (scoreboardObjective == null) {
                    return null;
                }
                ScoreboardObjective scoreboardObjective2 = scoreboardObjective;
                linkedHashSet = new LinkedHashSet<String>();
                AutoInvestModule.findSidebarBalance$addCandidate(linkedHashSet, scoreboardObjective2.getDisplayName().getString());
                Collection collection = clientWorld2.getScoreboardEntries(scoreboardObjective2);
                int n2 = H[66];
                n2 -= H[67];
                int n3 = H[69];
                n3 -= H[70];
                Intrinsics.checkNotNullExpressionValue(collection, (String)f[n2 += H[68]] + (String)f[n3 -= H[71]]);
                object8 = collection;
                long l8 = l6;
                int n4 = H[72];
                n4 += H[73];
                l6 = l8 ^ (0L ^ l8) & -1L << (n4 += H[74]);
                object3 = object8.iterator();
                while (object3.hasNext()) {
                    object7 = object3.next();
                    ScoreboardEntry object22 = (ScoreboardEntry)object7;
                    long l9 = l3;
                    int n5 = H[75];
                    n5 -= H[76];
                    l3 = l9 ^ (0L ^ l9) & -1L >>> (n5 ^= H[77]);
                    AutoInvestModule.findSidebarBalance$addCandidate(linkedHashSet, object22.owner());
                    AutoInvestModule.findSidebarBalance$addCandidate(linkedHashSet, object22.name().getString());
                    Text text = object22.display();
                    AutoInvestModule.findSidebarBalance$addCandidate(linkedHashSet, text != null ? text.getString() : null);
                    if (clientWorld2.getScoreHolderTeam(object22.owner()) == null) continue;
                    long l10 = l7;
                    int n6 = H[78];
                    n6 ^= H[79];
                    l7 = l10 ^ (0L ^ l10) & -1L << (n6 ^= H[80]);
                    AutoInvestModule.findSidebarBalance$addCandidate(linkedHashSet, object4.getPrefix().getString());
                    AutoInvestModule.findSidebarBalance$addCandidate(linkedHashSet, object4.getSuffix().getString());
                    AutoInvestModule.findSidebarBalance$addCandidate(linkedHashSet, object4.decorateName((Text)Text.literal((String)object22.owner())).getString());
                    AutoInvestModule.findSidebarBalance$addCandidate(linkedHashSet, object4.decorateName(object22.name()).getString());
                }
                list = (List<String>)((Object)linkedHashSet);
                long l11 = l7;
                int n5 = H[81];
                n5 ^= H[82];
                l7 = l11 ^ (0L ^ l11) & -1L >>> (n5 += H[83]);
                for (Object e2 : list) {
                    int n6;
                    String string2;
                    object2 = (String)e2;
                    long l12 = l5;
                    int n7 = H[84];
                    n7 += H[85];
                    l5 = l12 ^ (0L ^ l12) & -1L << (n7 -= H[86]);
                    string = object2;
                    Locale locale = Locale.ROOT;
                    int n8 = H[87];
                    n8 += H[88];
                    Intrinsics.checkNotNullExpressionValue(locale, (String)f[n8 -= H[89]]);
                    int n9 = H[90];
                    n9 ^= H[91];
                    int n10 = H[93];
                    n10 += H[94];
                    Intrinsics.checkNotNullExpressionValue(string.toLowerCase(locale), (String)f[n9 ^= H[92]] + (String)f[n10 -= H[95]]);
                    int n11 = H[96];
                    n11 ^= H[97];
                    boolean bl = H[99];
                    bl -= H[100];
                    int n12 = H[102];
                    n12 -= H[103];
                    if (StringsKt.contains$default((CharSequence)string2, (String)f[n11 += H[98]], bl -= H[101], n12 += H[104], null) && INSTANCE.parseLargestPositiveNumber((String)object2) != null) {
                        int n13 = H[105];
                        n13 ^= H[106];
                        n6 = n13 -= H[107];
                    } else {
                        int n14 = H[108];
                        n14 += H[109];
                        n6 = n14 -= H[110];
                    }
                    if (n6 == 0) continue;
                    v11 = e2;
                    break block15;
                }
                v11 = null;
            }
            object8 = v11;
            if (object8 != null) {
                return this.parseLargestPositiveNumber((String)object8);
            }
            int n15 = H[111];
            n15 += H[112];
            object3 = new String[n15 ^= H[113]];
            int n16 = H[114];
            n16 -= H[115];
            int n17 = H[117];
            n17 -= H[118];
            object3[n16 += AutoInvestModule.H[116]] = (String)f[n17 ^= H[119]];
            int n18 = H[120];
            n18 -= H[121];
            int n19 = H[123];
            n19 ^= H[124];
            object3[n18 += AutoInvestModule.H[122]] = (String)f[n19 ^= H[125]];
            int n20 = H[126];
            n20 += H[127];
            int n21 = H[129];
            n21 ^= H[130];
            object3[n20 += AutoInvestModule.H[128]] = (String)f[n21 -= H[131]];
            list = CollectionsKt.listOf(object3);
            object7 = linkedHashSet;
            long l13 = l5;
            int n22 = H[132];
            n22 += H[133];
            l5 = l13 ^ (0L ^ l13) & -1L >>> (n22 ^= H[134]);
            object2 = object7.iterator();
            while (object2.hasNext()) {
                int n23;
                int n24;
                block16: {
                    object4 = object2.next();
                    string = (String)object4;
                    long l14 = l4;
                    int n25 = H[135];
                    n25 ^= H[136];
                    l4 = l14 ^ (0L ^ l14) & -1L << (n25 += H[137]);
                    Object object5 = string;
                    Locale locale = Locale.ROOT;
                    int n26 = H[138];
                    n26 ^= H[139];
                    Intrinsics.checkNotNullExpressionValue(locale, (String)f[n26 -= H[140]]);
                    int n27 = H[141];
                    n27 -= H[142];
                    int n28 = H[144];
                    n28 += H[145];
                    Intrinsics.checkNotNullExpressionValue(((String)object5).toLowerCase(locale), (String)f[n27 += H[143]] + (String)f[n28 += H[146]]);
                    object5 = list;
                    long l15 = l4;
                    int n29 = H[147];
                    n29 -= H[148];
                    l4 = l15 ^ (0L ^ l15) & -1L >>> (n29 += H[149]);
                    if (object5 instanceof Collection && ((Collection)object5).isEmpty()) {
                        int n30 = H[150];
                        n30 -= H[151];
                        n24 = n30 -= H[152];
                    } else {
                        Iterator iterator2 = object5.iterator();
                        while (iterator2.hasNext()) {
                            String string3;
                            Object t2 = iterator2.next();
                            CharSequence charSequence = (CharSequence)t2;
                            long l16 = l3;
                            int n31 = H[153];
                            n31 += H[154];
                            l3 = l16 ^ (0L ^ l16) & -1L << (n31 -= H[155]);
                            boolean bl = H[156];
                            bl -= H[157];
                            int n32 = H[159];
                            n32 -= H[160];
                            if (!StringsKt.contains$default((CharSequence)string3, charSequence, bl -= H[158], n32 -= H[161], null)) continue;
                            int n33 = H[162];
                            n33 += H[163];
                            n24 = n33 ^= H[164];
                            break block16;
                        }
                        int n34 = H[165];
                        n34 ^= H[166];
                        n24 = n34 += H[167];
                    }
                }
                if (n24 != 0 && INSTANCE.parseLargestPositiveNumber(string) != null) {
                    int n35 = H[168];
                    n35 ^= H[169];
                    n23 = n35 ^= H[170];
                } else {
                    int n36 = H[171];
                    n36 ^= H[172];
                    n23 = n36 ^= H[173];
                }
                if (n23 == 0) continue;
                object = object4;
                break block17;
            }
            object = null;
        }
        if (object3 != null) {
            Object object6 = object3 = (String)object;
            long l17 = l3;
            int n37 = H[174];
            n37 -= H[175];
            l3 = l17 ^ (0L ^ l17) & -1L >>> (n37 ^= H[176]);
            l2 = this.parseLargestPositiveNumber((String)object6);
        } else {
            l2 = null;
        }
        return l2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final String sanitizeScoreboardLine(String value2) {
        if (value2 == null) return "";
        char c2 = H[177];
        c2 ^= H[178];
        c2 -= H[179];
        char c3 = H[180];
        c3 ^= H[181];
        boolean bl = H[183];
        bl += H[184];
        int n2 = H[186];
        n2 += H[187];
        String string = StringsKt.replace$default(value2, c2, c3 ^= H[182], bl ^= H[185], n2 += H[188], null);
        if (string == null) return "";
        String string2 = ((Object)StringsKt.trim((CharSequence)string)).toString();
        String string3 = string2;
        if (string2 != null) return string3;
        return "";
    }

    private final Long parseLargestPositiveNumber(String text) {
        long l2 = 2307246438149493170L;
        long l3 = -6732109776440909778L;
        long l4 = -1643780742497059056L;
        long l5 = 7697030064804079811L;
        long l6 = 725359805988554410L;
        long l7 = 7767169367694461217L;
        long l8 = 7490108918669958785L;
        long l9 = -7569324126550118759L;
        int n2 = H[189];
        n2 -= H[190];
        int n3 = H[192];
        n3 -= H[193];
        Sequence sequence = Regex.findAll$default(E, text, n2 -= H[191], n3 += H[194], null);
        Long l10 = null;
        Sequence sequence2 = sequence;
        long l11 = l5;
        int n4 = H[195];
        n4 += H[196];
        l5 = l11 ^ (0L ^ l11) & -1L << (n4 ^= H[197]);
        Iterator iterator2 = sequence2.iterator();
        while (iterator2.hasNext()) {
            Object t2 = iterator2.next();
            MatchResult matchResult = (MatchResult)t2;
            long l12 = l5;
            int n5 = H[198];
            n5 += H[199];
            l5 = l12 ^ (0L ^ l12) & -1L >>> (n5 ^= H[200]);
            String string = matchResult.getValue();
            long l13 = l6;
            int n6 = H[201];
            n6 -= H[202];
            l6 = l13 ^ (0L ^ l13) & -1L << (n6 -= H[203]);
            CharSequence charSequence = string;
            Appendable appendable = new StringBuilder();
            long l14 = l6;
            int n7 = H[204];
            n7 -= H[205];
            l6 = l14 ^ (0L ^ l14) & -1L >>> (n7 += H[206]);
            long l15 = l9;
            int n8 = H[207];
            n8 ^= H[208];
            l9 = l15 ^ (0L ^ l15) & -1L << (n8 += H[209]);
            long l16 = l8;
            int n9 = H[210];
            n9 ^= H[211];
            l8 = l16 ^ ((long)charSequence.length() ^ l16) & -1L >>> (n9 ^= H[212]);
            while (true) {
                int n10 = H[213];
                n10 -= H[214];
                if ((int)(l9 >>> (n10 += H[215])) >= (int)l8) break;
                int n11 = H[216];
                n11 += H[217];
                long l17 = l9;
                int n12 = H[219];
                n12 += H[220];
                l9 = l17 ^ ((long)charSequence.charAt((int)(l9 >>> (n11 ^= H[218]))) ^ l17) & -1L >>> (n12 -= H[221]);
                long l18 = l3;
                int n13 = H[222];
                n13 += H[223];
                long l19 = l3 = l18 ^ ((long)((int)l9) ^ l18) & -1L >>> (n13 += H[224]);
                int n14 = H[225];
                n14 += H[226];
                l3 = l19 ^ (0L ^ l19) & -1L << (n14 -= H[227]);
                if (Character.isDigit((char)l3)) {
                    appendable.append((char)l9);
                }
                l9 += 0x100000000L;
            }
            String string2 = ((StringBuilder)appendable).toString();
            Long l20 = StringsKt.toLongOrNull(string2);
            if (l20 == null) {
                continue;
            }
            long l21 = l20;
            if (l10 != null && l21 <= ((Number)l10).longValue()) continue;
            l10 = l21;
        }
        return l10;
    }

    private final boolean isInvestmentApplied(long currentBalance) {
        boolean bl;
        Long l2 = C;
        if (l2 == null) {
            boolean bl2 = H[228];
            bl2 ^= H[229];
            return bl2 += H[230];
        }
        long l3 = l2;
        long l4 = RangesKt.coerceAtLeast(l3 - d, 0L);
        if (currentBalance <= l4) {
            boolean bl3 = H[231];
            bl3 += H[232];
            bl = bl3 ^= H[233];
        } else {
            boolean bl4 = H[234];
            bl4 -= H[235];
            bl = bl4 ^= H[236];
        }
        return bl;
    }

    private final void clearPendingInvestment() {
        C = null;
        d = 0L;
        D = 0L;
    }

    private final void resetState() {
        this.clearPendingInvestment();
        e = 0L;
    }

    private static final void findSidebarBalance$addCandidate(LinkedHashSet<String> candidates, String value2) {
        int n2;
        String string = INSTANCE.sanitizeScoreboardLine(value2);
        if (((CharSequence)string).length() > 0) {
            int n3 = H[237];
            n3 ^= H[238];
            n2 = n3 += H[239];
        } else {
            int n4 = H[240];
            n4 -= H[241];
            n2 = n4 ^= H[242];
        }
        if (n2 != 0) {
            ((Collection)candidates).add(string);
        }
    }

    static {
        AutoInvestModule.b();
        long l2 = 7921274143652171630L;
        long l3 = 4188293238226037063L;
        long l4 = 5250011732453360467L;
        long l5 = 2017478414157743971L;
        long l6 = -4917967289604357485L;
        long l7 = -3020727637246029354L;
        long l8 = 8293337082792400067L;
        long l9 = -1508055144047788528L;
        long l10 = 4213538020543166625L;
        long l11 = -8941133504207918824L;
        long l12 = 4799388400222791492L;
        long l13 = 2007173960148561892L;
        long l14 = -7908783281591462251L;
        long l15 = 4865788106816010474L;
        int n2 = H[243];
        n2 += H[244];
        f = new Object[n2 ^= H[245]];
        long l16 = l15;
        int n3 = H[246];
        n3 -= H[247];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += H[248]);
        Object[] objectArray = new Object[H[249]];
        objectArray[AutoInvestModule.H[250]] = F;
        objectArray[AutoInvestModule.H[251]] = H[252];
        int n4 = H[253];
        Object object = AutoInvestModule.A()[H[254]];
        if (object == null) {
            char[] cArray = "\u0dcb\u0dff\u0e09\u0dce\u0dee\u0df9\u0dc7\u0d11\u0e04\u0dfe\u0de5\u0de4\u0e02\u0e0b\u0e09\u0dfa\u0d1b\u0dde\u0df0\u0df7\u0dbf\u0d17\u0dca\u0dff\u0d11\u0dee\u0df8\u0de3\u0df0\u0deb\u0dc0\u0dd8\u0de6\u0e09\u0dc0\u0de7\u0e06\u0d18\u0dfd\u0dbf\u0d18\u0de3\u0e02\u0de5\u0dc7\u0de5\u0e0c\u0d1c\u0dff\u0dc7\u0d18\u0df9\u0deb\u0d18\u0dfc\u0e0a\u0e02\u0dee\u0dce\u0d1c\u0dff\u0e01\u0dfb\u0de5\u0d10\u0e05\u0dea\u0de7\u0dd8\u0dec\u0d19\u0df8\u0dc7\u0dfc\u0e00\u0dc1\u0d15\u0e09\u0dbf\u0de7\u0d18\u0d1c\u0d18\u0dcb\u0d17\u0dfd\u0e06\u0deb\u0dc1\u0d16\u0dfa\u0dca\u0e0b\u0dc7\u0dde\u0de0\u0e07\u0de9\u0dcb\u0ddf\u0d1a\u0dd8\u0d16\u0df0\u0df6\u0d1b\u0dca\u0dca\u0d15\u0dbf\u0d19\u0df1\u0dcc\u0d1b\u0dd8\u0d19\u0dc0\u0de5\u0d1a\u0dfe\u0df6\u0d11\u0e05\u0e04\u0d18\u0dc7\u0d1a\u0e04\u0df5\u0dc7\u0e04\u0e05\u0d1b\u0dc6\u0e0a\u0dff\u0de9\u0dce\u0e01\u0d17\u0d17\u0dc9\u0de1\u0de9\u0de0\u0de4\u0dfd\u0e00\u0de3\u0e06\u0dc9\u0dca\u0dc6\u0de4\u0dfa\u0df5\u0de6\u0dc6\u0df0\u0dfd\u0d1c\u0e07\u0d17\u0dcb\u0e07\u0dcb\u0e0c\u0dec\u0dc6\u0deb\u0df1\u0de1\u0dfd\u0ddf\u0dc5\u0d17\u0dc7\u0dec\u0e0c\u0d1b\u0dc0\u0dcb\u0dfd\u0df7\u0de4\u0dee\u0e09\u0e0b\u0dca\u0dc9\u0dc6\u0de6\u0df0\u0e02\u0e04\u0de5\u0dec\u0d18\u0de0\u0dec\u0e07\u0dc0\u0e09\u0df8\u0dc1\u0de2\u0df7\u0e0a\u0d16\u0e06\u0de0\u0d18\u0df8\u0dc0\u0df6\u0d17\u0de4\u0df8\u0dfc\u0de0\u0e06\u0deb\u0d18\u0df9\u0d1c\u0d17\u0d11\u0e09\u0de0\u0dc3\u0dc3\u0dfb\u0dc1\u0e0a\u0e0b\u0de1\u0e07\u0dea\u0e00\u0e00\u0dca\u0d15\u0df5\u0ddd\u0de2\u0d1c\u0dc0\u0de3\u0df6\u0dc5\u0dc1\u0dfb\u0dc6\u0e0c\u0e04\u0e01\u0de1\u0de0\u0dc1\u0d15\u0dee\u0d10\u0d15\u0dc7\u0d11\u0d1b\u0df7\u0d1a\u0e05\u0dd8\u0d1a\u0df1\u0d19\u0ddf\u0dc9\u0de5\u0ddf\u0e01\u0dfe\u0dd8\u0e04\u0dce\u0d17\u0dfa\u0dbf\u0d10\u0e0a\u0dc6\u0dfb\u0e00\u0de0\u0ddd\u0e01\u0d18\u0dcc\u0dc6\u0d17\u0dd8\u0d19\u0e00\u0de5\u0d1b\u0e06\u0d15\u0dfb\u0dc5\u0de5\u0deb\u0dfd\u0d11\u0dff\u0ddd\u0dd8\u0d10\u0e0c\u0dfd\u0df7\u0e07\u0e01\u0de3\u0ddf\u0d1c\u0de9\u0ddf\u0dfa\u0ddf\u0e07\u0dfd\u0d1c\u0e0a\u0d1a\u0d18\u0d1a\u0dec\u0d18\u0dff\u0df7\u0dc3\u0dcb\u0e00\u0dc3\u0dfa\u0de7\u0e00\u0de1\u0df7\u0e0b\u0de0\u0e07\u0df6\u0dc0\u0d11\u0d17\u0dc3\u0dd8\u0de6\u0d18\u0de5\u0dfc\u0de6\u0d17\u0dc0\u0de7\u0e0b\u0de7\u0e07\u0de2\u0d11\u0e06\u0deb\u0dfd\u0dce\u0dff\u0dcc\u0e04\u0d15\u0e00\u0dc1\u0df1\u0d1c\u0dca\u0e0a\u0dc9\u0de5".toCharArray();
            for (int i2 = H[255]; i2 < H[256]; ++i2) {
                int n5 = cArray[i2];
                n5 -= H[257];
                n5 += H[258];
                n5 ^= H[259];
                n5 -= H[260];
                n5 ^= H[261];
                n5 += H[262];
                n5 -= H[263];
                n5 -= H[264];
                n5 ^= H[265];
                n5 -= H[266];
                n5 ^= H[267];
                cArray[i2] = (char)(n5 ^= H[268]);
            }
            object = AutoInvestModule.A()[AutoInvestModule.H[269]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)AutoInvestModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = H[270];
        n6 -= H[271];
        l6 = l17 ^ (0xD600000000L ^ l17) & -1L << (n6 ^= H[272]);
        long l18 = l13;
        int n7 = H[273];
        n7 ^= H[274];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= H[275]);
        while (true) {
            int n8 = H[276];
            n8 += H[277];
            if ((int)l13 >= (int)(l6 >>> (n8 += H[278]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = H[279];
            n10 -= H[280];
            int n11 = H[282];
            n11 -= H[283];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += H[281])) & -1L >>> (n11 -= H[284]);
            long l20 = l9;
            int n12 = H[285];
            n12 += H[286];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= H[287]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = H[288];
            n14 += H[289];
            int n15 = H[291];
            n15 += H[292];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= H[290])) & -1L >>> (n15 ^= H[293]);
            int n16 = H[294];
            n16 += H[295];
            long l22 = l10;
            int n17 = H[297];
            n17 += H[298];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= H[296]) ^ l22) & -1L << (n17 += H[299]);
            int n18 = H[300];
            n18 += H[301];
            n18 -= H[302];
            int n19 = H[303];
            n19 += H[304];
            long l23 = l12;
            int n20 = H[306];
            n20 ^= H[307];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += H[305]))) ^ l23) & -1L >>> (n20 -= H[308]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = H[309];
            n21 ^= H[310];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= H[311]);
            while (true) {
                int n22 = H[312];
                n22 += H[313];
                if ((int)(l14 >>> (n22 -= H[314])) >= (int)l12) break;
                int n23 = H[315];
                n23 ^= H[316];
                int n24 = H[318];
                n24 ^= H[319];
                cArray2[(int)(l14 >>> (n23 -= AutoInvestModule.H[317]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= H[320]))];
                l14 += 0x100000000L;
            }
            int n25 = H[321];
            n25 += H[322];
            int n26 = (int)(l15 >>> (n25 ^= H[323]));
            l15 += 0x100000000L;
            AutoInvestModule.f[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = H[324];
            n27 += H[325];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= H[326]);
        }
        INSTANCE = new AutoInvestModule();
        int n28 = H[327];
        n28 += H[328];
        int n29 = H[330];
        n29 -= H[331];
        int n30 = H[333];
        n30 -= H[334];
        c = INSTANCE.text((String)f[n28 -= H[329]], (String)f[n29 -= H[332]], n30 ^= H[335]);
        int n31 = H[336];
        n31 += H[337];
        FuntimeRestrict.moduleOnFuntime$default(FuntimeRestrict.INSTANCE, INSTANCE, null, n31 ^= H[338], null);
        int n32 = H[339];
        n32 -= H[340];
        E = new Regex((String)f[n32 += H[341]]);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[H[342]];
        String string = (String)object[H[343]];
        object = object[H[344]];
        Object[] objectArray = G;
        if (G == null) {
            objectArray = G = new Object[H[345]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[H[346]];
                F = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[H[348] ^ H[349]];
                byArray[AutoInvestModule.H[350] ^ AutoInvestModule.H[351]] = H[352] ^ H[353];
                byArray[AutoInvestModule.H[354] ^ AutoInvestModule.H[355]] = H[356] ^ H[357];
                byArray[AutoInvestModule.H[358] ^ AutoInvestModule.H[359]] = H[360] ^ H[361];
                byArray[AutoInvestModule.H[362] ^ AutoInvestModule.H[363]] = H[364] ^ H[365];
                byArray[AutoInvestModule.H[366] ^ AutoInvestModule.H[367]] = H[368] ^ H[369];
                byArray[AutoInvestModule.H[370] ^ AutoInvestModule.H[371]] = H[372] ^ H[373];
                byArray[AutoInvestModule.H[374] ^ AutoInvestModule.H[375]] = H[376] ^ H[377];
                byArray[AutoInvestModule.H[378] ^ AutoInvestModule.H[379]] = H[380] ^ H[381];
                byArray[AutoInvestModule.H[382] ^ AutoInvestModule.H[383]] = H[384] ^ H[385];
                byArray[AutoInvestModule.H[386] ^ AutoInvestModule.H[387]] = H[388] ^ H[389];
                byArray[AutoInvestModule.H[390] ^ AutoInvestModule.H[391]] = H[392] ^ H[393];
                byArray[AutoInvestModule.H[394] ^ AutoInvestModule.H[395]] = H[396] ^ H[397];
                byArray[AutoInvestModule.H[398] ^ AutoInvestModule.H[399]] = 0xFFFF7F2A ^ 0x80C2;
                byArray[0xE211 ^ 0xE21C] = 0xE261 ^ 0xE21C;
                byArray[0xD85F ^ 0xD855] = 0xD851 ^ 0xD855;
                byArray[0x5699 ^ 0x5691] = 0x56E2 ^ 0x5691;
                objectArray2[AutoInvestModule.H[347]] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (g == null) {
                byte[] byArray2 = new byte[0x58F6 ^ 0x58D6];
                byArray2[0x3DF8 ^ 0x3DEC] = 0xFFFFC25C ^ 0x3DEC;
                byArray2[0x31E0 ^ 0x31FB] = 0x318E ^ 0x31FB;
                byArray2[0x505D ^ 0x505D] = 0x5065 ^ 0x505D;
                byArray2[0x996F ^ 0x9973] = 0xFFFF66D0 ^ 0x9973;
                byArray2[0xF1A6 ^ 0xF1AA] = 0xF1ED ^ 0xF1AA;
                byArray2[0xDB4C ^ 0xDB43] = 0xFFFF24A0 ^ 0xDB43;
                byArray2[0x985A ^ 0x9849] = 0xFFFF67CA ^ 0x9849;
                byArray2[0x107A2 ^ 0x107A8] = 0xFFFEF80E ^ 0x107A8;
                byArray2[0xB0A0 ^ 0xB0A3] = 0xB0A6 ^ 0xB0A3;
                byArray2[0x4DA6 ^ 0x4DB1] = 0x4DC1 ^ 0x4DB1;
                byArray2[0x51F6 ^ 0x51E7] = 0xFFFFAE01 ^ 0x51E7;
                byArray2[0xF6BA ^ 0xF6B4] = 0xFFFF097F ^ 0xF6B4;
                byArray2[0x8135 ^ 0x8137] = 0x8114 ^ 0x8137;
                byArray2[0x3898 ^ 0x3882] = 0x38CE ^ 0x3882;
                byArray2[0xADEE ^ 0xADE8] = 0xFFFF5251 ^ 0xADE8;
                byArray2[0x20C4 ^ 0x20C1] = 0xFFFFDF2C ^ 0x20C1;
                byArray2[0xAF49 ^ 0xAF4E] = 0xAF3F ^ 0xAF4E;
                byArray2[0xD62B ^ 0xD636] = 0xFFFF29A3 ^ 0xD636;
                byArray2[0x9DBD ^ 0x9DBC] = 0x9D8F ^ 0x9DBC;
                byArray2[0x4044 ^ 0x404C] = 0xFFFFBF85 ^ 0x404C;
                byArray2[0x10876 ^ 0x1087B] = 0x10814 ^ 0x1087B;
                byArray2[0xF3A8 ^ 0xF3B8] = 0xFFFF0C1B ^ 0xF3B8;
                byArray2[0x9B19 ^ 0x9B07] = 0xFFFF64E5 ^ 0x9B07;
                byArray2[0x4F27 ^ 0x4F3F] = 0xFFFFB0BC ^ 0x4F3F;
                byArray2[0xC01 ^ 0xC0A] = 0xC59 ^ 0xC0A;
                byArray2[0x56C ^ 0x568] = 0xFFFFFAF8 ^ 0x568;
                byArray2[0x7FCC ^ 0x7FD3] = 0xFFFF8028 ^ 0x7FD3;
                byArray2[0x3572 ^ 0x3567] = 0xFFFFCABC ^ 0x3567;
                byArray2[0xE5DA ^ 0xE5C3] = 0xE5FA ^ 0xE5C3;
                byArray2[0xF48 ^ 0xF5E] = 0xF56 ^ 0xF5E;
                byArray2[0x1026B ^ 0x10262] = 0x10267 ^ 0x10262;
                byArray2[0x5B2D ^ 0x5B3F] = 0xFFFFA4D5 ^ 0x5B3F;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = AutoInvestModule.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u4834\u4806\u4839\u4808\u480a\u4856\u4835\u481f\u4818\u481c\u483c\u48e3\u48e7\u48e1\u4831\u483c\u4807\u4857".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= 0x4D62;
                        n3 -= 12133;
                        n3 -= 31910;
                        n3 ^= 0xF3A9;
                        n3 ^= 0xF86C;
                        n3 ^= 0x2E4D;
                        n3 ^= 0x8CEE;
                        n3 ^= 0xCEAE;
                        n3 ^= 0x7FD3;
                        n3 += 46228;
                        n3 -= 39861;
                        n3 -= 29149;
                        cArray[i2] = (char)(n3 += 6142);
                    }
                    object4 = AutoInvestModule.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[4] = -82;
                byArray4[5] = 12;
                byArray4[8] = -101;
                byArray4[12] = -99;
                byArray4[10] = 117;
                byArray4[14] = 104;
                byArray4[3] = -108;
                byArray4[7] = -44;
                byArray4[9] = -27;
                byArray4[15] = -68;
                byArray4[6] = -65;
                byArray4[13] = 52;
                byArray4[0] = -110;
                byArray4[1] = -119;
                byArray4[11] = 55;
                byArray4[2] = 94;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 1, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = AutoInvestModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u5b40\u5b3c\u5b4a".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 17187;
                        n4 -= 46676;
                        n4 += 30836;
                        n4 ^= 0xC775;
                        n4 ^= 0x3D76;
                        n4 -= 6038;
                        n4 ^= 0x2647;
                        n4 ^= 0x6C68;
                        n4 += 45134;
                        cArray[i3] = (char)(n4 += 34606);
                    }
                    object5 = AutoInvestModule.A()[2] = new String(cArray);
                }
                g = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = AutoInvestModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\u7632\u762e\u761c\u75c0\u762c\u7631\u762c\u75c0\u7627\u7624\u762c\u761c\u763e\u7627\u7612\u7603\u7603\u760a\u7605\u7608".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 38721;
                    n5 -= 46242;
                    n5 += 64291;
                    n5 ^= 0xDE25;
                    n5 ^= 0xD287;
                    n5 ^= 0x6108;
                    n5 ^= 0xB46E;
                    n5 -= 24887;
                    n5 ^= 0xF678;
                    n5 ^= 0x8A7A;
                    n5 ^= 0x2AFB;
                    n5 += 6715;
                    n5 -= 317;
                    cArray[i4] = (char)(n5 += 6589);
                }
                object6 = AutoInvestModule.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)g), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = h;
        if (h == null) {
            h = new Object[4];
            objectArray = h;
        }
        return objectArray;
    }

    public static void b() {
        H = new int[0x475D ^ 0x46CD];
        AutoInvestModule.H[0x107A5 ^ 0x107B1] = 0xFFFEF835 ^ 0x107B1;
        AutoInvestModule.H[0x713 ^ 0x7CF] = 0xFFFFF865 ^ 0x7CF;
        AutoInvestModule.H[0xC9E8 ^ 0xC978] = 0xFFFF36D5 ^ 0xC978;
        AutoInvestModule.H[0x165 ^ 8] = 0x6C06 ^ 8;
        AutoInvestModule.H[0xAABF ^ 0xAB9D] = 0xABB2 ^ 0xAB9D;
        AutoInvestModule.H[0x109F3 ^ 0x108FB] = 0x13327 ^ 0x108FB;
        AutoInvestModule.H[0x7044 ^ 0x70E0] = 0xFFFF8F49 ^ 0x70E0;
        AutoInvestModule.H[0x911B ^ 0x910D] = 0x9129 ^ 0x910D;
        AutoInvestModule.H[0xA9A5 ^ 0xA976] = 0xA914 ^ 0xA976;
        AutoInvestModule.H[0x8197 ^ 0x81D6] = 0xFFFF7E45 ^ 0x81D6;
        AutoInvestModule.H[0xC625 ^ 0xC6D6] = 0xFFFF397B ^ 0xC6D6;
        AutoInvestModule.H[0xCFFC ^ 0xCFBF] = 0xCF8F ^ 0xCFBF;
        AutoInvestModule.H[0xAE24 ^ 0xAF58] = 0xFFFFC609 ^ 0xAF58;
        AutoInvestModule.H[0x222D ^ 0x22C1] = 0xFFFFDD69 ^ 0x22C1;
        AutoInvestModule.H[0xD8A6 ^ 0xD987] = 0xFFFF267D ^ 0xD987;
        AutoInvestModule.H[0x6DD9 ^ 0x6D8A] = 0x6DB1 ^ 0x6D8A;
        AutoInvestModule.H[0x520A ^ 0x534F] = 0xFFFFACE2 ^ 0x534F;
        AutoInvestModule.H[0x2C5C ^ 0x2CE3] = 0xFFFFD308 ^ 0x2CE3;
        AutoInvestModule.H[0x3C5A ^ 0x3D0A] = 0xFFFFC277 ^ 0x3D0A;
        AutoInvestModule.H[0xDFFE ^ 0xDED6] = 0xFFFF210E ^ 0xDED6;
        AutoInvestModule.H[0x1FB0 ^ 0x1F87] = 0x1FF5 ^ 0x1F87;
        AutoInvestModule.H[0x878C ^ 0x86B2] = 0x86D3 ^ 0x86B2;
        AutoInvestModule.H[0x4E18 ^ 0x4E97] = 0xFFFFB13B ^ 0x4E97;
        AutoInvestModule.H[0x7117 ^ 0x7134] = 0xFFFF8E93 ^ 0x7134;
        AutoInvestModule.H[0xAE31 ^ 0xAFB1] = 0xFFFFA50A ^ 0xAFB1;
        AutoInvestModule.H[0x4D16 ^ 0x4D38] = 0x4D0A ^ 0x4D38;
        AutoInvestModule.H[0xDADB ^ 0xDADA] = 0xFFFF255D ^ 0xDADA;
        AutoInvestModule.H[0xBF3 ^ 0xBD8] = 0xBEF ^ 0xBD8;
        AutoInvestModule.H[0xE9C4 ^ 0xE9AC] = 0xFFFF1656 ^ 0xE9AC;
        AutoInvestModule.H[0x7655 ^ 0x7760] = 0xFFFF88AC ^ 0x7760;
        AutoInvestModule.H[0x1558 ^ 0x1514] = 0x1511 ^ 0x1514;
        AutoInvestModule.H[0xF747 ^ 0xF783] = 0xF7B3 ^ 0xF783;
        AutoInvestModule.H[0xA399 ^ 0xA2B2] = 0xA2A1 ^ 0xA2B2;
        AutoInvestModule.H[0x61B9 ^ 0x60A2] = 0x60E7 ^ 0x60A2;
        AutoInvestModule.H[0x2F36 ^ 0x2E29] = 0x2E5D ^ 0x2E29;
        AutoInvestModule.H[0x3822 ^ 0x38C8] = 0xFFFFC749 ^ 0x38C8;
        AutoInvestModule.H[0xCA01 ^ 0xCB8A] = 0xC46C ^ 0xCB8A;
        AutoInvestModule.H[0x6F7D ^ 0x6E60] = 0x6E04 ^ 0x6E60;
        AutoInvestModule.H[0xFCEF ^ 0xFC81] = 0xFCDA ^ 0xFC81;
        AutoInvestModule.H[0xE696 ^ 0xE7B9] = 0xE727 ^ 0xE7B9;
        AutoInvestModule.H[0x621D ^ 0x631E] = 0x9A6A ^ 0x631E;
        AutoInvestModule.H[0x63CF ^ 0x62E5] = 0xFFFF9D28 ^ 0x62E5;
        AutoInvestModule.H[0x7FCF ^ 0x7EAC] = 0x5E27 ^ 0x7EAC;
        AutoInvestModule.H[0xC6B2 ^ 0xC61E] = 0xC639 ^ 0xC61E;
        AutoInvestModule.H[0x1031A ^ 0x1021D] = 0x1F826 ^ 0x1021D;
        AutoInvestModule.H[0x947D ^ 0x94DA] = 0x94FC ^ 0x94DA;
        AutoInvestModule.H[0x1095E ^ 0x10983] = 0xFFFEF670 ^ 0x10983;
        AutoInvestModule.H[0x10172 ^ 0x10035] = 0x1000B ^ 0x10035;
        AutoInvestModule.H[0xBB96 ^ 0xBBCA] = 0xFFFF446A ^ 0xBBCA;
        AutoInvestModule.H[0xBA5B ^ 0xBAC0] = 0xBA95 ^ 0xBAC0;
        AutoInvestModule.H[0xFFC7 ^ 0xFE96] = 0xFEE7 ^ 0xFE96;
        AutoInvestModule.H[0x3393 ^ 0x33D9] = 0xFFFFCC4B ^ 0x33D9;
        AutoInvestModule.H[0x10A72 ^ 0x10B78] = 0x1DFF4 ^ 0x10B78;
        AutoInvestModule.H[0xBCC1 ^ 0xBDB8] = 0x27F6 ^ 0xBDB8;
        AutoInvestModule.H[0xD694 ^ 0xD662] = 0xD64D ^ 0xD662;
        AutoInvestModule.H[0x10425 ^ 0x104F2] = 0xFFFEFB02 ^ 0x104F2;
        AutoInvestModule.H[0xBC38 ^ 0xBDBD] = 0x1BB15 ^ 0xBDBD;
        AutoInvestModule.H[0x7371 ^ 0x73BD] = 0x73C9 ^ 0x73BD;
        AutoInvestModule.H[0x26DC ^ 0x2656] = 0x264F ^ 0x2656;
        AutoInvestModule.H[0x7697 ^ 0x769B] = 0xFFFF8909 ^ 0x769B;
        AutoInvestModule.H[0x6B7B ^ 0x6B5B] = 0xFFFF94D2 ^ 0x6B5B;
        AutoInvestModule.H[0xF9EB ^ 0xF93B] = 0xF907 ^ 0xF93B;
        AutoInvestModule.H[0x3A9C ^ 0x3A56] = 0x3A5C ^ 0x3A56;
        AutoInvestModule.H[0xF8B5 ^ 0xF8C1] = 0xFFFF0707 ^ 0xF8C1;
        AutoInvestModule.H[0x29D3 ^ 0x2893] = 0x28C4 ^ 0x2893;
        AutoInvestModule.H[0x91F7 ^ 0x91ED] = 0xFFFF6E68 ^ 0x91ED;
        AutoInvestModule.H[0x6884 ^ 0x690D] = 0xA7F5 ^ 0x690D;
        AutoInvestModule.H[0x54BE ^ 0x5446] = 0x541B ^ 0x5446;
        AutoInvestModule.H[0xFF1E ^ 0xFE12] = 0x379D ^ 0xFE12;
        AutoInvestModule.H[0x1EF5 ^ 0x1FBD] = 0xFFFFE025 ^ 0x1FBD;
        AutoInvestModule.H[0x434D ^ 0x4242] = 0xFFFFBD88 ^ 0x4242;
        AutoInvestModule.H[0xF782 ^ 0xF72D] = 0xFFFF08A4 ^ 0xF72D;
        AutoInvestModule.H[0x2488 ^ 0x24CE] = 0xFFFFDB2B ^ 0x24CE;
        AutoInvestModule.H[0x102EB ^ 0x1039F] = 0x1B187 ^ 0x1039F;
        AutoInvestModule.H[0xB33A ^ 0xB34A] = 0xFFFF4CFC ^ 0xB34A;
        AutoInvestModule.H[0x58E2 ^ 0x58B8] = 0x58E2 ^ 0x58B8;
        AutoInvestModule.H[0x231E ^ 0x23AA] = 0xFFFFDC50 ^ 0x23AA;
        AutoInvestModule.H[0x9C3E ^ 0x9C51] = 0x9CF2 ^ 0x9C51;
        AutoInvestModule.H[0x2A0D ^ 0x2A7A] = 0xFFFFD58C ^ 0x2A7A;
        AutoInvestModule.H[0xDF12 ^ 0xDE4F] = 0xC429 ^ 0xDE4F;
        AutoInvestModule.H[0x2A95 ^ 0x2AB9] = 0x2A91 ^ 0x2AB9;
        AutoInvestModule.H[0x109D1 ^ 0x108EC] = 0x1089A ^ 0x108EC;
        AutoInvestModule.H[0x92FA ^ 0x93C3] = 0xFFFF6C67 ^ 0x93C3;
        AutoInvestModule.H[0xDCC0 ^ 0xDC0E] = 0xDC11 ^ 0xDC0E;
        AutoInvestModule.H[0x1C07 ^ 0x1CDF] = 0x1C4D ^ 0x1CDF;
        AutoInvestModule.H[0x3092 ^ 0x31BC] = 0x31DA ^ 0x31BC;
        AutoInvestModule.H[0x52C8 ^ 0x5216] = 0xFFFFADC2 ^ 0x5216;
        AutoInvestModule.H[0x8FB ^ 0x868] = 0x872 ^ 0x868;
        AutoInvestModule.H[0xFC2E ^ 0xFCB2] = 0xFFFF034A ^ 0xFCB2;
        AutoInvestModule.H[0x6E97 ^ 0x6EB1] = 0x6EF8 ^ 0x6EB1;
        AutoInvestModule.H[0x3BCD ^ 0x3B85] = 0x3B3D ^ 0x3B85;
        AutoInvestModule.H[0x2B48 ^ 0x2A09] = 0xFFFFD584 ^ 0x2A09;
        AutoInvestModule.H[0xEE5A ^ 0xEEE2] = 0xFFFF115F ^ 0xEEE2;
        AutoInvestModule.H[0x105C3 ^ 0x105AE] = 0x1059D ^ 0x105AE;
        AutoInvestModule.H[0x78B2 ^ 0x79ED] = 0x231E ^ 0x79ED;
        AutoInvestModule.H[0xF2B4 ^ 0xF236] = 0xFFFF0DDC ^ 0xF236;
        AutoInvestModule.H[0xBF6A ^ 0xBF23] = 0xFFFF40F5 ^ 0xBF23;
        AutoInvestModule.H[0x21D4 ^ 0x21CB] = 0xFFFFDE06 ^ 0x21CB;
        AutoInvestModule.H[0x6ABC ^ 0x6A68] = 0x6A61 ^ 0x6A68;
        AutoInvestModule.H[0xFB5E ^ 0xFA7D] = 0xFFFF05AE ^ 0xFA7D;
        AutoInvestModule.H[0xCDB ^ 0xC41] = 0xFFFFF3FA ^ 0xC41;
        AutoInvestModule.H[0xFD18 ^ 0xFD23] = 0xFD19 ^ 0xFD23;
        AutoInvestModule.H[0x8CDB ^ 0x8C27] = 0x8C27 ^ 0x8C27;
        AutoInvestModule.H[0x9B37 ^ 0x9A06] = 0xFFFF658E ^ 0x9A06;
        AutoInvestModule.H[0xCBB0 ^ 0xCB55] = 0xCB27 ^ 0xCB55;
        AutoInvestModule.H[0x60AA ^ 0x61E7] = 0xFFFF9E1D ^ 0x61E7;
        AutoInvestModule.H[0x9166 ^ 0x9029] = 0xFFFF6F88 ^ 0x9029;
        AutoInvestModule.H[0xA48 ^ 0xB03] = 0xFFFFF49F ^ 0xB03;
        AutoInvestModule.H[0xDB88 ^ 0xDB8B] = 0xFFFF2478 ^ 0xDB8B;
        AutoInvestModule.H[0xF ^ 0x63] = 0x4B ^ 0x63;
        AutoInvestModule.H[0x8E4E ^ 0x8EAD] = 0x8E85 ^ 0x8EAD;
        AutoInvestModule.H[0xC789 ^ 0xC6A0] = 0xC6E0 ^ 0xC6A0;
        AutoInvestModule.H[0xA9A2 ^ 0xA8C4] = 0xCECB ^ 0xA8C4;
        AutoInvestModule.H[0x10808 ^ 0x108FC] = 0x1088D ^ 0x108FC;
        AutoInvestModule.H[0x47DC ^ 0x47D4] = 0x47E3 ^ 0x47D4;
        AutoInvestModule.H[0xFA81 ^ 0xFA46] = 0xFFFF059A ^ 0xFA46;
        AutoInvestModule.H[0x23CE ^ 0x22FD] = 0x2280 ^ 0x22FD;
        AutoInvestModule.H[0x24A2 ^ 0x25AF] = 0x25AF ^ 0x25AF;
        AutoInvestModule.H[0x2F9B ^ 0x2F89] = 0xFFFFD00A ^ 0x2F89;
        AutoInvestModule.H[0xAD36 ^ 0xAC40] = 0x3605 ^ 0xAC40;
        AutoInvestModule.H[0x4CB2 ^ 0x4C4D] = 0x4C4D ^ 0x4C4D;
        AutoInvestModule.H[0x10D2 ^ 0x10F6] = 0xFFFFEF0E ^ 0x10F6;
        AutoInvestModule.H[0xDAAC ^ 0xDAD7] = 0xFFFF2515 ^ 0xDAD7;
        AutoInvestModule.H[0xD11C ^ 0xD04F] = 0xD0E0 ^ 0xD04F;
        AutoInvestModule.H[0xDDAA ^ 0xDDD0] = 0xDDF6 ^ 0xDDD0;
        AutoInvestModule.H[0xFF66 ^ 0xFF4C] = 0xFFFF009D ^ 0xFF4C;
        AutoInvestModule.H[0xAB0D ^ 0xAA76] = 0x3CDC ^ 0xAA76;
        AutoInvestModule.H[0xECF0 ^ 0xEC90] = 0xECEB ^ 0xEC90;
        AutoInvestModule.H[0x66E6 ^ 0x66D4] = 0xFFFF9912 ^ 0x66D4;
        AutoInvestModule.H[0x2986 ^ 0x28E3] = 0x868 ^ 0x28E3;
        AutoInvestModule.H[0x7D82 ^ 0x7D88] = 0xFFFF8217 ^ 0x7D88;
        AutoInvestModule.H[0x9DC0 ^ 0x9DFC] = 0xFFFF6211 ^ 0x9DFC;
        AutoInvestModule.H[0xF1A2 ^ 0xF103] = 0xF101 ^ 0xF103;
        AutoInvestModule.H[0x12F2 ^ 0x12B9] = 0x12E8 ^ 0x12B9;
        AutoInvestModule.H[0xD120 ^ 0xD041] = 0x8AB2 ^ 0xD041;
        AutoInvestModule.H[0x365F ^ 0x3694] = 0xFFFFC976 ^ 0x3694;
        AutoInvestModule.H[0xE310 ^ 0xE256] = 0xFFFF1DDD ^ 0xE256;
        AutoInvestModule.H[0xDA8F ^ 0xDAA7] = 0xDAC3 ^ 0xDAA7;
        AutoInvestModule.H[0x3020 ^ 0x30FB] = 0x3092 ^ 0x30FB;
        AutoInvestModule.H[0xF6DE ^ 0xF7BC] = 0xD736 ^ 0xF7BC;
        AutoInvestModule.H[0xBB82 ^ 0xBAB9] = 0xFFFF45A6 ^ 0xBAB9;
        AutoInvestModule.H[0xC6EF ^ 0xC60B] = 0xFFFF39CC ^ 0xC60B;
        AutoInvestModule.H[0x70C5 ^ 0x701A] = 0x707C ^ 0x701A;
        AutoInvestModule.H[0x680A ^ 0x697A] = 0xAFF5 ^ 0x697A;
        AutoInvestModule.H[0xDEFE ^ 0xDE66] = 0xFFFF21CB ^ 0xDE66;
        AutoInvestModule.H[0x7370 ^ 0x7341] = 0x7306 ^ 0x7341;
        AutoInvestModule.H[0xA406 ^ 0xA512] = 0xA536 ^ 0xA512;
        AutoInvestModule.H[0x724E ^ 0x73C9] = 0xBD31 ^ 0x73C9;
        AutoInvestModule.H[0x1F25 ^ 0x1E66] = 0xFFFFE1C1 ^ 0x1E66;
        AutoInvestModule.H[0x807 ^ 0x8DE] = 0xFFFFF751 ^ 0x8DE;
        AutoInvestModule.H[0x3597 ^ 0x35E1] = 0x35A8 ^ 0x35E1;
        AutoInvestModule.H[0x759A ^ 0x74FD] = 0x12FE ^ 0x74FD;
        AutoInvestModule.H[0x5090 ^ 0x5033] = 0x5060 ^ 0x5033;
        AutoInvestModule.H[0xE01 ^ 0xEFB] = 0xEFB ^ 0xEFB;
        AutoInvestModule.H[0xAAEB ^ 0xAB99] = 0x19D5 ^ 0xAB99;
        AutoInvestModule.H[0xD15E ^ 0xD1F4] = 0xD1E3 ^ 0xD1F4;
        AutoInvestModule.H[0xEFC5 ^ 0xEF80] = 0xFFFF1048 ^ 0xEF80;
        AutoInvestModule.H[0x9AA3 ^ 0x9A15] = 0x9A29 ^ 0x9A15;
        AutoInvestModule.H[0x812C ^ 0x8075] = 0x8074 ^ 0x8075;
        AutoInvestModule.H[0xFECB ^ 0xFE0D] = 0xFFFF01A2 ^ 0xFE0D;
        AutoInvestModule.H[0x259D ^ 0x25A3] = 0xFFFFDA54 ^ 0x25A3;
        AutoInvestModule.H[0x9B44 ^ 0x9B09] = 0x9B65 ^ 0x9B09;
        AutoInvestModule.H[0x10B08 ^ 0x10BCD] = 0xFFFEF409 ^ 0x10BCD;
        AutoInvestModule.H[0xB4DC ^ 0xB445] = 0xB4FF ^ 0xB445;
        AutoInvestModule.H[0x1CC5 ^ 0x1DF7] = 0x1DF5 ^ 0x1DF7;
        AutoInvestModule.H[0xFC8B ^ 0xFC07] = 0xFFFF03BF ^ 0xFC07;
        AutoInvestModule.H[0x278F ^ 0x2701] = 0x2773 ^ 0x2701;
        AutoInvestModule.H[0x7602 ^ 0x7750] = 0xFFFF88BC ^ 0x7750;
        AutoInvestModule.H[0x10DD1 ^ 0x10CD4] = 0x17F2C ^ 0x10CD4;
        AutoInvestModule.H[0xB800 ^ 0xB8C1] = 0xFFFF477B ^ 0xB8C1;
        AutoInvestModule.H[0xEDB ^ 0xF5D] = 0xC1A6 ^ 0xF5D;
        AutoInvestModule.H[0x6E10 ^ 0x6E10] = 0xFFFF91D4 ^ 0x6E10;
        AutoInvestModule.H[0x40C6 ^ 0x4096] = 0xFFFFBF55 ^ 0x4096;
        AutoInvestModule.H[0x32B9 ^ 0x32A8] = 0x32E0 ^ 0x32A8;
        AutoInvestModule.H[0x82D2 ^ 0x823B] = 0xFFFF7DCF ^ 0x823B;
        AutoInvestModule.H[0x49DB ^ 0x498D] = 0xFFFFB654 ^ 0x498D;
        AutoInvestModule.H[0xCDE9 ^ 0xCD7C] = 0xCD54 ^ 0xCD7C;
        AutoInvestModule.H[0x6E85 ^ 0x6F06] = 0x169AE ^ 0x6F06;
        AutoInvestModule.H[0xD0CE ^ 0xD096] = 0xFFFF2F4C ^ 0xD096;
        AutoInvestModule.H[0xC222 ^ 0xC37A] = 0xC37A ^ 0xC37A;
        AutoInvestModule.H[0x9E01 ^ 0x9E05] = 0xFFFF61BC ^ 0x9E05;
        AutoInvestModule.H[0xA10A ^ 0xA13A] = 0xFFFF5E9B ^ 0xA13A;
        AutoInvestModule.H[0x42C2 ^ 0x4262] = 0x4253 ^ 0x4262;
        AutoInvestModule.H[0xE6E8 ^ 0xE7CE] = 0xE7D3 ^ 0xE7CE;
        AutoInvestModule.H[0xCA76 ^ 0xCA4E] = 0xFFFF35F6 ^ 0xCA4E;
        AutoInvestModule.H[0x5103 ^ 0x5101] = 0x512F ^ 0x5101;
        AutoInvestModule.H[0xE557 ^ 0xE509] = 0xFFFF1AB6 ^ 0xE509;
        AutoInvestModule.H[0x3F5E ^ 0x3E35] = 0x523B ^ 0x3E35;
        AutoInvestModule.H[0xF6FA ^ 0xF772] = 0x398B ^ 0xF772;
        AutoInvestModule.H[0x9E51 ^ 0x9E67] = 0xFFFF6141 ^ 0x9E67;
        AutoInvestModule.H[0x2C1B ^ 0x2D6C] = 0xB722 ^ 0x2D6C;
        AutoInvestModule.H[0xC697 ^ 0xC7CB] = 0xDDBD ^ 0xC7CB;
        AutoInvestModule.H[0x9A51 ^ 0x9AE4] = 0xFFFF6502 ^ 0x9AE4;
        AutoInvestModule.H[0x6912 ^ 0x6983] = 0x69A0 ^ 0x6983;
        AutoInvestModule.H[0x7FD3 ^ 0x7FC4] = 0xFFFF8017 ^ 0x7FC4;
        AutoInvestModule.H[0xC950 ^ 0xC9AD] = 0xC9AF ^ 0xC9AD;
        AutoInvestModule.H[0x11B2 ^ 0x1124] = 0xFFFFEE78 ^ 0x1124;
        AutoInvestModule.H[0x107EB ^ 0x10758] = 0x10710 ^ 0x10758;
        AutoInvestModule.H[0xF1CB ^ 0xF102] = 0xF10E ^ 0xF102;
        AutoInvestModule.H[0x3BD0 ^ 0x3BBB] = 0xFFFFC46B ^ 0x3BBB;
        AutoInvestModule.H[0x9D8B ^ 0x9D92] = 0xFFFF6274 ^ 0x9D92;
        AutoInvestModule.H[0x6510 ^ 0x65D0] = 0x65D5 ^ 0x65D0;
        AutoInvestModule.H[0x7CAE ^ 0x7C25] = 0xFFFF83FD ^ 0x7C25;
        AutoInvestModule.H[0x361B ^ 0x374F] = 0x370D ^ 0x374F;
        AutoInvestModule.H[0x91E0 ^ 0x9123] = 0xFFFF6E97 ^ 0x9123;
        AutoInvestModule.H[0x10E84 ^ 0x10EC0] = 0x10E94 ^ 0x10EC0;
        AutoInvestModule.H[0xD9A9 ^ 0xD95C] = 0xD956 ^ 0xD95C;
        AutoInvestModule.H[0x54DE ^ 0x54B7] = 0x54C0 ^ 0x54B7;
        AutoInvestModule.H[0x8E20 ^ 0x8F2B] = 0x38C6 ^ 0x8F2B;
        AutoInvestModule.H[0x331F ^ 0x3363] = 0xFFFFCCF5 ^ 0x3363;
        AutoInvestModule.H[0x109FB ^ 0x10950] = 0xFFFEF6F3 ^ 0x10950;
        AutoInvestModule.H[0xBA92 ^ 0xBA50] = 0xFFFF45E7 ^ 0xBA50;
        AutoInvestModule.H[0xA294 ^ 0xA225] = 0xA2CB ^ 0xA225;
        AutoInvestModule.H[0xA94F ^ 0xA9BF] = 0xFFFF5658 ^ 0xA9BF;
        AutoInvestModule.H[0x3A5B ^ 0x3A3E] = 0xFFFFC584 ^ 0x3A3E;
        AutoInvestModule.H[0xE169 ^ 0xE118] = 0xE142 ^ 0xE118;
        AutoInvestModule.H[0xF373 ^ 0xF3DB] = 0xFFFF0C50 ^ 0xF3DB;
        AutoInvestModule.H[0xFEAC ^ 0xFFC4] = 0x99EF ^ 0xFFC4;
        AutoInvestModule.H[0xA448 ^ 0xA574] = 0xFFFF5AFD ^ 0xA574;
        AutoInvestModule.H[0x5131 ^ 0x504E] = 0xA559 ^ 0x504E;
        AutoInvestModule.H[0xC698 ^ 0xC693] = 0xC684 ^ 0xC693;
        AutoInvestModule.H[0x45A ^ 0x529] = 0xB767 ^ 0x529;
        AutoInvestModule.H[0x5C00 ^ 0x5D78] = 0xC71B ^ 0x5D78;
        AutoInvestModule.H[0x1717 ^ 0x1659] = 0x1610 ^ 0x1659;
        AutoInvestModule.H[0xF0E ^ 0xF57] = 0xF11 ^ 0xF57;
        AutoInvestModule.H[0x52AD ^ 0x52D4] = 0xFFFFAD6D ^ 0x52D4;
        AutoInvestModule.H[0x8B6A ^ 0x8B6C] = 0xFFFF74F7 ^ 0x8B6C;
        AutoInvestModule.H[0xD327 ^ 0xD385] = 0xFFFF2CD0 ^ 0xD385;
        AutoInvestModule.H[0x35C8 ^ 0x35F2] = 0xFFFFCA6B ^ 0x35F2;
        AutoInvestModule.H[0x7484 ^ 0x746F] = 0xFFFF8BB6 ^ 0x746F;
        AutoInvestModule.H[0xF1F9 ^ 0xF193] = 0xFFFF0E35 ^ 0xF193;
        AutoInvestModule.H[0xE611 ^ 0xE775] = 0xFFFF3806 ^ 0xE775;
        AutoInvestModule.H[0x5EF0 ^ 0x5EA1] = 0xFFFFA11E ^ 0x5EA1;
        AutoInvestModule.H[0xD612 ^ 0xD66F] = 0xD630 ^ 0xD66F;
        AutoInvestModule.H[0x13FE ^ 0x136C] = 0x1350 ^ 0x136C;
        AutoInvestModule.H[0x5565 ^ 0x557D] = 0xFFFFAAC2 ^ 0x557D;
        AutoInvestModule.H[0x5068 ^ 0x51E2] = 0x5E00 ^ 0x51E2;
        AutoInvestModule.H[0x4BBE ^ 0x4BAD] = 0x4BBF ^ 0x4BAD;
        AutoInvestModule.H[0x922A ^ 0x9324] = 0x9311 ^ 0x9324;
        AutoInvestModule.H[0xE6D0 ^ 0xE618] = 0xFFFF19B3 ^ 0xE618;
        AutoInvestModule.H[0x622F ^ 0x621B] = 0xFFFF9DE0 ^ 0x621B;
        AutoInvestModule.H[0x2A31 ^ 0x2A8C] = 0x2AB0 ^ 0x2A8C;
        AutoInvestModule.H[0xC98A ^ 0xC806] = 0xFFFF382D ^ 0xC806;
        AutoInvestModule.H[0xBD5D ^ 0xBDD5] = 0xBDE5 ^ 0xBDD5;
        AutoInvestModule.H[0xA703 ^ 0xA687] = 0xFFFE5FBB ^ 0xA687;
        AutoInvestModule.H[0xBCD8 ^ 0xBD5A] = 0x1BBFD ^ 0xBD5A;
        AutoInvestModule.H[0x8453 ^ 0x857E] = 0x853C ^ 0x857E;
        AutoInvestModule.H[0x1FB1 ^ 0x1F94] = 0xFFFFE01B ^ 0x1F94;
        AutoInvestModule.H[0xD8B1 ^ 0xD89E] = 0xD8AB ^ 0xD89E;
        AutoInvestModule.H[0x6598 ^ 0x654D] = 0x65C5 ^ 0x654D;
        AutoInvestModule.H[0xB500 ^ 0xB563] = 0xFFFF4A35 ^ 0xB563;
        AutoInvestModule.H[0x2709 ^ 0x2746] = 0x2745 ^ 0x2746;
        AutoInvestModule.H[0xFF35 ^ 0xFF18] = 0xFF5F ^ 0xFF18;
        AutoInvestModule.H[0x328E ^ 0x33D5] = 0x33D5 ^ 0x33D5;
        AutoInvestModule.H[0xFB02 ^ 0xFB56] = 0xFB36 ^ 0xFB56;
        AutoInvestModule.H[0x174D ^ 0x17F4] = 0x17C0 ^ 0x17F4;
        AutoInvestModule.H[0xDBC0 ^ 0xDAAF] = 0x1C3C ^ 0xDAAF;
        AutoInvestModule.H[0x1075C ^ 0x1077E] = 0xFFFEF8F3 ^ 0x1077E;
        AutoInvestModule.H[0xFF0A ^ 0xFF48] = 0xFFFF00AB ^ 0xFF48;
        AutoInvestModule.H[0x35F3 ^ 0x34BF] = 0x34F6 ^ 0x34BF;
        AutoInvestModule.H[0xCDC7 ^ 0xCCE2] = 0xCCF6 ^ 0xCCE2;
        AutoInvestModule.H[0x6E30 ^ 0x6E39] = 0xFFFF91B7 ^ 0x6E39;
        AutoInvestModule.H[0xA71C ^ 0xA65E] = 0xFFFF59A4 ^ 0xA65E;
        AutoInvestModule.H[0xB600 ^ 0xB6CF] = 0xFFFF4912 ^ 0xB6CF;
        AutoInvestModule.H[0xBA3 ^ 0xBF6] = 0xFFFFF46F ^ 0xBF6;
        AutoInvestModule.H[0xD400 ^ 0xD43D] = 0xFFFF2BDA ^ 0xD43D;
        AutoInvestModule.H[0x7AF ^ 0x6F8] = 0x6FA ^ 0x6F8;
        AutoInvestModule.H[0xF7D3 ^ 0xF6A6] = 0x44E8 ^ 0xF6A6;
        AutoInvestModule.H[0x6040 ^ 0x605E] = 0xFFFF9F82 ^ 0x605E;
        AutoInvestModule.H[0xBB6A ^ 0xBBB0] = 0xBBB1 ^ 0xBBB0;
        AutoInvestModule.H[0xF3EB ^ 0xF2A2] = 0xFFFF0D70 ^ 0xF2A2;
        AutoInvestModule.H[0xD44E ^ 0xD4AF] = 0xFFFF2B48 ^ 0xD4AF;
        AutoInvestModule.H[0xA269 ^ 0xA208] = 0xA22D ^ 0xA208;
        AutoInvestModule.H[0x17EE ^ 0x1660] = 0x96AC ^ 0x1660;
        AutoInvestModule.H[0x5093 ^ 0x501A] = 0x5067 ^ 0x501A;
        AutoInvestModule.H[0xF5F5 ^ 0xF5AE] = 0xFFFF0A46 ^ 0xF5AE;
        AutoInvestModule.H[0xAA1D ^ 0xAA00] = 0xAA7E ^ 0xAA00;
        AutoInvestModule.H[0xF13F ^ 0xF02E] = 0xF043 ^ 0xF02E;
        AutoInvestModule.H[0x1A4 ^ 0x1C6] = 0xFFFFFE6C ^ 0x1C6;
        AutoInvestModule.H[0x9DCC ^ 0x9DBF] = 0x9DB9 ^ 0x9DBF;
        AutoInvestModule.H[0xECEA ^ 0xEC11] = 0xEC10 ^ 0xEC11;
        AutoInvestModule.H[0xFE60 ^ 0xFEC5] = 0xFFFF016E ^ 0xFEC5;
        AutoInvestModule.H[0xB69C ^ 0xB71D] = 0x420A ^ 0xB71D;
        AutoInvestModule.H[0x10BF9 ^ 0x10AEC] = 0x10ADF ^ 0x10AEC;
        AutoInvestModule.H[0x1010B ^ 0x101ED] = 0x101A6 ^ 0x101ED;
        AutoInvestModule.H[0x585A ^ 0x58C7] = 0x5897 ^ 0x58C7;
        AutoInvestModule.H[0xBF36 ^ 0xBF84] = 0xBF82 ^ 0xBF84;
        AutoInvestModule.H[0x6F99 ^ 0x6EAE] = 0xFFFF911F ^ 0x6EAE;
        AutoInvestModule.H[0xC4C0 ^ 0xC411] = 0xC42E ^ 0xC411;
        AutoInvestModule.H[0x72BF ^ 0x72AA] = 0x72BD ^ 0x72AA;
        AutoInvestModule.H[0x4F33 ^ 0x4EBE] = 0x4158 ^ 0x4EBE;
        AutoInvestModule.H[0x34DD ^ 0x35E9] = 0x35B6 ^ 0x35E9;
        AutoInvestModule.H[0x19A7 ^ 0x18BD] = 0x186E ^ 0x18BD;
        AutoInvestModule.H[0xC2EE ^ 0xC201] = 0xFFFF3D95 ^ 0xC201;
        AutoInvestModule.H[0x7075 ^ 0x70A7] = 0x70EC ^ 0x70A7;
        AutoInvestModule.H[0x1969 ^ 0x199E] = 0x19F2 ^ 0x199E;
        AutoInvestModule.H[0xF1D2 ^ 0xF1C2] = 0xFFFF0E6B ^ 0xF1C2;
        AutoInvestModule.H[0x3C66 ^ 0x3D70] = 0xFFFFC2B9 ^ 0x3D70;
        AutoInvestModule.H[0xCEFD ^ 0xCE79] = 0xFFFF316F ^ 0xCE79;
        AutoInvestModule.H[0x118A ^ 0x11F2] = 0xFFFFEE66 ^ 0x11F2;
        AutoInvestModule.H[0xE7BD ^ 0xE6EB] = 0xE6EA ^ 0xE6EB;
        AutoInvestModule.H[0x2AA7 ^ 0x2AA9] = 0xFFFFD555 ^ 0x2AA9;
        AutoInvestModule.H[0x2B26 ^ 0x2A34] = 0x2A70 ^ 0x2A34;
        AutoInvestModule.H[0x6C50 ^ 0x6C17] = 0xFFFF93F7 ^ 0x6C17;
        AutoInvestModule.H[0x9930 ^ 0x9996] = 0x99E7 ^ 0x9996;
        AutoInvestModule.H[0x7A99 ^ 0x7AAA] = 0x7A9A ^ 0x7AAA;
        AutoInvestModule.H[0x3EE2 ^ 0x3E2F] = 0x3E5C ^ 0x3E2F;
        AutoInvestModule.H[0xB771 ^ 0xB7FC] = 0xB72F ^ 0xB7FC;
        AutoInvestModule.H[0x7EC2 ^ 0x7E30] = 0x7E28 ^ 0x7E30;
        AutoInvestModule.H[0xC379 ^ 0xC219] = 0x98F0 ^ 0xC219;
        AutoInvestModule.H[0x97D8 ^ 0x9775] = 0xFFFF68F1 ^ 0x9775;
        AutoInvestModule.H[0x4F44 ^ 0x4F1B] = 0x4F31 ^ 0x4F1B;
        AutoInvestModule.H[0xD9EB ^ 0xD995] = 0xD9F7 ^ 0xD995;
        AutoInvestModule.H[0x7AE2 ^ 0x7AE7] = 0x7AC0 ^ 0x7AE7;
        AutoInvestModule.H[0x1DB8 ^ 0x1D06] = 0x1D57 ^ 0x1D06;
        AutoInvestModule.H[0x7FB5 ^ 0x7E3A] = 0xFEF8 ^ 0x7E3A;
        AutoInvestModule.H[0x8C9A ^ 0x8DEB] = 0x4B78 ^ 0x8DEB;
        AutoInvestModule.H[0x8296 ^ 0x83C3] = 0xFFFF7C57 ^ 0x83C3;
        AutoInvestModule.H[0x3ADF ^ 0x3BE9] = 0x3BB4 ^ 0x3BE9;
        AutoInvestModule.H[0xA8E9 ^ 0xA87D] = 0xA85F ^ 0xA87D;
        AutoInvestModule.H[0xC961 ^ 0xC87F] = 0xC84F ^ 0xC87F;
        AutoInvestModule.H[0x47CA ^ 0x46A4] = 0x8037 ^ 0x46A4;
        AutoInvestModule.H[0xEFF8 ^ 0xEFAA] = 0xEFF0 ^ 0xEFAA;
        AutoInvestModule.H[0xF401 ^ 0xF481] = 0xFFFF0B23 ^ 0xF481;
        AutoInvestModule.H[0xB95E ^ 0xB800] = 0xE2FA ^ 0xB800;
        AutoInvestModule.H[0x5968 ^ 0x598F] = 0xFFFFA64A ^ 0x598F;
        AutoInvestModule.H[0x10C30 ^ 0x10CB6] = 0xFFFEF310 ^ 0x10CB6;
        AutoInvestModule.H[0x68A ^ 0x6BF] = 0xFFFFF954 ^ 0x6BF;
        AutoInvestModule.H[0x10574 ^ 0x10579] = 0xFFFEFAF7 ^ 0x10579;
        AutoInvestModule.H[0x87CD ^ 0x8733] = 0x8733 ^ 0x8733;
        AutoInvestModule.H[0xD991 ^ 0xD92A] = 0xFFFF26B2 ^ 0xD92A;
        AutoInvestModule.H[0xA1E2 ^ 0xA17D] = 0xA148 ^ 0xA17D;
        AutoInvestModule.H[0xF690 ^ 0xF63E] = 0xFFFF09D9 ^ 0xF63E;
        AutoInvestModule.H[0xC4C4 ^ 0xC4FB] = 0xFFFF3B23 ^ 0xC4FB;
        AutoInvestModule.H[0xF755 ^ 0xF7BB] = 0xF781 ^ 0xF7BB;
        AutoInvestModule.H[0x4B70 ^ 0x4A0A] = 0xDCA5 ^ 0x4A0A;
        AutoInvestModule.H[0x2AE9 ^ 0x2BE8] = 0x28E8 ^ 0x2BE8;
        AutoInvestModule.H[0x7857 ^ 0x7870] = 0xFFFF87E2 ^ 0x7870;
        AutoInvestModule.H[0x408F ^ 0x41AB] = 0x41CA ^ 0x41AB;
        AutoInvestModule.H[0x3F20 ^ 0x3FD9] = 0x3FDA ^ 0x3FD9;
        AutoInvestModule.H[0x1A65 ^ 0x1AD2] = 0x1AA5 ^ 0x1AD2;
        AutoInvestModule.H[0xDFAF ^ 0xDFA0] = 0xDFB1 ^ 0xDFA0;
        AutoInvestModule.H[0x10C5F ^ 0x10CEF] = 0x10C91 ^ 0x10CEF;
        AutoInvestModule.H[0xD69B ^ 0xD680] = 0xD61B ^ 0xD680;
        AutoInvestModule.H[0x8E43 ^ 0x8F3D] = 0x7A2D ^ 0x8F3D;
        AutoInvestModule.H[0x879D ^ 0x86BD] = 0x8689 ^ 0x86BD;
        AutoInvestModule.H[0xF9F8 ^ 0xF918] = 0xFFFF06FE ^ 0xF918;
        AutoInvestModule.H[0xCDE4 ^ 0xCCFC] = 0xCC94 ^ 0xCCFC;
        AutoInvestModule.H[0xF047 ^ 0xF141] = 0xD2B8 ^ 0xF141;
        AutoInvestModule.H[0x7183 ^ 0x7155] = 0x710D ^ 0x7155;
        AutoInvestModule.H[0xD788 ^ 0xD7C6] = 0xFFFF2826 ^ 0xD7C6;
        AutoInvestModule.H[0xA79C ^ 0xA6D6] = 0xFFFF593C ^ 0xA6D6;
        AutoInvestModule.H[0x2BE6 ^ 0x2BE1] = 0x2BA3 ^ 0x2BE1;
        AutoInvestModule.H[0x7D15 ^ 0x7C39] = 0x7C0D ^ 0x7C39;
        AutoInvestModule.H[0xE718 ^ 0xE608] = 0xE643 ^ 0xE608;
        AutoInvestModule.H[0xB433 ^ 0xB4B4] = 0xFFFF4B27 ^ 0xB4B4;
        AutoInvestModule.H[0x95EB ^ 0x95BC] = 0x95C6 ^ 0x95BC;
        AutoInvestModule.H[0x1540 ^ 0x1478] = 0x14A0 ^ 0x1478;
        AutoInvestModule.H[0xC7D3 ^ 0xC76F] = 0xC702 ^ 0xC76F;
        AutoInvestModule.H[0x1B1E ^ 0x1B9B] = 0x1BEB ^ 0x1B9B;
        AutoInvestModule.H[0xE0E8 ^ 0xE076] = 0xFFFF1FDE ^ 0xE076;
        AutoInvestModule.H[0x7F74 ^ 0x7FF5] = 0xFFFF8068 ^ 0x7FF5;
        AutoInvestModule.H[0xE971 ^ 0xE915] = 0xFFFF1689 ^ 0xE915;
        AutoInvestModule.H[0x7441 ^ 0x743E] = 0xFFFF8BC0 ^ 0x743E;
        AutoInvestModule.H[0x91EC ^ 0x90E5] = 0xCE19 ^ 0x90E5;
        AutoInvestModule.H[0xC9FC ^ 0xC881] = 0x5E2B ^ 0xC881;
        AutoInvestModule.H[0x33AF ^ 0x32B3] = 0x32DD ^ 0x32B3;
        AutoInvestModule.H[0x7F80 ^ 0x7FB9] = 0x7FC6 ^ 0x7FB9;
        AutoInvestModule.H[0x8BF4 ^ 0x8AE3] = 0xFFFF7519 ^ 0x8AE3;
        AutoInvestModule.H[0xC283 ^ 0xC387] = 0xE080 ^ 0xC387;
        AutoInvestModule.H[0xB28E ^ 0xB266] = 0xB256 ^ 0xB266;
        AutoInvestModule.H[0xFE7B ^ 0xFF44] = 0xFF52 ^ 0xFF44;
        AutoInvestModule.H[0xAF1C ^ 0xAE05] = 0xAE6A ^ 0xAE05;
        AutoInvestModule.H[0x6190 ^ 0x61D0] = 0xFFFF9E6B ^ 0x61D0;
        AutoInvestModule.H[0x3A69 ^ 0x3B03] = 0x570B ^ 0x3B03;
        AutoInvestModule.H[0x9E99 ^ 0x9E1A] = 0x9E6D ^ 0x9E1A;
        AutoInvestModule.H[0x9766 ^ 0x978B] = 0x97DC ^ 0x978B;
        AutoInvestModule.H[0xC7F ^ 0xC63] = 0xC60 ^ 0xC63;
        AutoInvestModule.H[0x8A37 ^ 0x8B24] = 0x8B2D ^ 0x8B24;
        AutoInvestModule.H[0x3298 ^ 0x33A8] = 0xFFFFCC52 ^ 0x33A8;
        AutoInvestModule.H[0xBD5 ^ 0xB24] = 0xFFFFF4EB ^ 0xB24;
        AutoInvestModule.H[0xB939 ^ 0xB81E] = 0xFFFF47C5 ^ 0xB81E;
        AutoInvestModule.H[0x908D ^ 0x90F8] = 0x90C5 ^ 0x90F8;
        AutoInvestModule.H[0xD0B9 ^ 0xD1E3] = 0xD1E2 ^ 0xD1E3;
        AutoInvestModule.H[0x8235 ^ 0x830F] = 0x8353 ^ 0x830F;
        AutoInvestModule.H[0x332E ^ 0x322C] = 0x6CDF ^ 0x322C;
        AutoInvestModule.H[0xE0D ^ 0xF0D] = 0xE8D ^ 0xF0D;
        AutoInvestModule.H[0x10551 ^ 0x105F8] = 0xFFFEFA65 ^ 0x105F8;
        AutoInvestModule.H[0x68C7 ^ 0x687D] = 0xFFFF9782 ^ 0x687D;
        AutoInvestModule.H[0xCDA2 ^ 0xCD40] = 0xCD21 ^ 0xCD40;
        AutoInvestModule.H[0x106CE ^ 0x106BC] = 0x106FC ^ 0x106BC;
        AutoInvestModule.H[0xC596 ^ 0xC501] = 0xFFFF3AAE ^ 0xC501;
        AutoInvestModule.H[0xFF40 ^ 0xFE29] = 0x982A ^ 0xFE29;
        AutoInvestModule.H[0x158E ^ 0x14CA] = 0xFFFFEB34 ^ 0x14CA;
        AutoInvestModule.H[0x7FEB ^ 0x7FC2] = 0xFFFF8014 ^ 0x7FC2;
        AutoInvestModule.H[0x1DCE ^ 0x1DEF] = 0xFFFFE2FB ^ 0x1DEF;
        AutoInvestModule.H[0x2512 ^ 0x2574] = 0xFFFFDAC1 ^ 0x2574;
        AutoInvestModule.H[0xC7F1 ^ 0xC69D] = 0xAAD7 ^ 0xC69D;
        AutoInvestModule.H[0x5CF6 ^ 0x5C91] = 0xFFFFA33C ^ 0x5C91;
        AutoInvestModule.H[0xC314 ^ 0xC349] = 0xC33C ^ 0xC349;
    }
}

