/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_337
 *  net.minecraft.class_345
 *  net.minecraft.class_638
 *  net.minecraft.class_746
 */
package kotakbaz.rain.module.modules.player;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.event.events.A;
import kotakbaz.rain.mixin.BossBarHudAccessor;
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.setting.settings.c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import net.minecraft.class_2561;
import net.minecraft.class_337;
import net.minecraft.class_345;
import net.minecraft.class_638;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t\u00a2\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2={"Lkotakbaz/rain/module/modules/player/PvpSafeModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "Lkotakbaz/rain/event/events/ChatMessageEvent;", "event", "", "onMessage", "(Lkotakbaz/rain/event/events/ChatMessageEvent;)V", "", "shouldBlockDisconnectButton", "()Z", "isCombatTagged", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "blockButton", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "blockCommands", "Lkotlin/text/Regex;", "blockedCommandRegex", "Lkotlin/text/Regex;", "", "", "combatKeywords", "Ljava/util/List;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nPvpSafeModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PvpSafeModule.kt\nkotakbaz/rain/module/modules/player/PvpSafeModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1807#2,2:64\n1807#2,3:66\n1809#2:69\n*S KotlinDebug\n*F\n+ 1 PvpSafeModule.kt\nkotakbaz/rain/module/modules/player/PvpSafeModule\n*L\n53#1:64,2\n59#1:66,3\n53#1:69\n*E\n"})
public final class I
extends a_0 {
    @NotNull
    public static final I INSTANCE;
    @NotNull
    private static final c a;
    @NotNull
    private static final c A;
    @NotNull
    private static final Regex b;
    @NotNull
    private static final List<String> B;
    private static Object[] c;
    private static Object d;
    private static Object[] D;
    private static Object[] C;
    private static Object[] e;
    public static int[] E;

    private I() {
        int n = E[0];
        n -= E[1];
        int n2 = E[3];
        n2 -= E[4];
        int n3 = E[6];
        n3 -= E[7];
        super((String)c[n += E[2]], kotakbaz.rain.client.extensions.a_0.getPLAYER(), (String)c[n2 ^= E[5]] + (String)c[n3 ^= E[8]]);
    }

    @Commando
    public final void onMessage(@NotNull A a2) {
        int n = E[9];
        n -= E[10];
        Intrinsics.checkNotNullParameter(a2, (String)c[n -= E[11]]);
        if (!(a2.getSend() && this.isEnabled() && ((Boolean)A.getValue()).booleanValue() && this.isCombatTagged())) {
            return;
        }
        if (!b.containsMatchIn(((Object)StringsKt.trim((CharSequence)a2.getText())).toString())) {
            return;
        }
        boolean bl = E[12];
        bl ^= E[13];
        a2.setCancel(bl ^= E[14]);
        int n2 = E[15];
        n2 ^= E[16];
        int n3 = E[18];
        n3 -= E[19];
        boolean bl2 = E[21];
        bl2 -= E[22];
        b_0.getMc().field_1705.method_1758((class_2561)class_2561.method_43470((String)((String)c[n2 -= E[17]] + (String)c[n3 += E[20]])), bl2 += E[23]);
    }

    public final boolean shouldBlockDisconnectButton() {
        int n;
        if (this.isEnabled() && ((Boolean)a.getValue()).booleanValue() && this.isCombatTagged()) {
            int n2 = E[24];
            n2 -= E[25];
            n = n2 += E[26];
        } else {
            int n3 = E[27];
            n3 -= E[28];
            n = n3 ^= E[29];
        }
        return n != 0;
    }

    public final boolean isCombatTagged() {
        int n;
        block11: {
            long l = -4360481679813000358L;
            long l2 = -5003932503776721131L;
            class_746 class_7462 = b_0.getMc().field_1724;
            if (class_7462 == null) {
                boolean bl = E[30];
                bl ^= E[31];
                return bl ^= E[32];
            }
            class_746 class_7463 = class_7462;
            class_638 class_6382 = b_0.getMc().field_1687;
            if (class_6382 == null) {
                boolean bl = E[33];
                bl ^= E[34];
                return bl += E[35];
            }
            class_638 class_6383 = class_6382;
            if (class_7463.method_31481() || !class_7463.method_5805() || !Intrinsics.areEqual(class_6383, class_7463.method_37908())) {
                boolean bl = E[36];
                bl += E[37];
                return bl ^= E[38];
            }
            class_337 class_3372 = b_0.getMc().field_1705.method_1740();
            int n2 = E[39];
            n2 += E[40];
            int n3 = E[42];
            n3 += E[43];
            int n4 = E[45];
            n4 ^= E[46];
            Intrinsics.checkNotNull(class_3372, (String)c[n2 -= E[41]] + (String)c[n3 ^= E[44]] + (String)c[n4 -= E[47]]);
            Collection<class_345> collection = ((BossBarHudAccessor)class_3372).rain$getBossBars().values();
            if (collection.isEmpty()) {
                boolean bl = E[48];
                bl ^= E[49];
                return bl -= E[50];
            }
            Iterable iterable = collection;
            long l3 = l;
            int n5 = E[51];
            n5 ^= E[52];
            l = l3 ^ (0L ^ l3) & -1L << (n5 -= E[53]);
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                int n6 = E[54];
                n6 -= E[55];
                n = n6 ^= E[56];
            } else {
                for (Object t2 : iterable) {
                    int n7;
                    block10: {
                        class_345 class_3452 = (class_345)t2;
                        long l4 = l;
                        int n8 = E[57];
                        n8 += E[58];
                        l = l4 ^ (0L ^ l4) & -1L >>> (n8 ^= E[59]);
                        String string = class_3452.method_5414().getString();
                        int n9 = E[60];
                        n9 += E[61];
                        Intrinsics.checkNotNullExpressionValue(string, (String)c[n9 ^= E[62]]);
                        Object object = string;
                        Locale locale = Locale.ROOT;
                        int n10 = E[63];
                        n10 ^= E[64];
                        Intrinsics.checkNotNullExpressionValue(locale, (String)c[n10 += E[65]]);
                        String string2 = ((String)object).toLowerCase(locale);
                        int n11 = E[66];
                        n11 -= E[67];
                        int n12 = E[69];
                        n12 += E[70];
                        Intrinsics.checkNotNullExpressionValue(string2, (String)c[n11 += E[68]] + (String)c[n12 ^= E[71]]);
                        char c2 = E[72];
                        c2 ^= E[73];
                        c2 -= E[74];
                        char c3 = E[75];
                        c3 += E[76];
                        boolean bl = E[78];
                        bl += E[79];
                        int n13 = E[81];
                        n13 ^= E[82];
                        object = StringsKt.replace$default(string2, c2, c3 += E[77], bl -= E[80], n13 ^= E[83], null);
                        int n14 = E[84];
                        n14 ^= E[85];
                        Regex regex = new Regex((String)c[n14 += E[86]]);
                        int n15 = E[87];
                        n15 += E[88];
                        Object object2 = (String)c[n15 += E[89]];
                        String string3 = regex.replace((CharSequence)object, (String)object2);
                        object = B;
                        long l5 = l2;
                        int n16 = E[90];
                        n16 -= E[91];
                        l2 = l5 ^ (0L ^ l5) & -1L << (n16 ^= E[92]);
                        if (object instanceof Collection && ((Collection)object).isEmpty()) {
                            int n17 = E[93];
                            n17 -= E[94];
                            n7 = n17 ^= E[95];
                        } else {
                            object2 = object.iterator();
                            while (object2.hasNext()) {
                                Object e2 = object2.next();
                                CharSequence charSequence = (CharSequence)e2;
                                long l6 = l2;
                                int n18 = E[96];
                                n18 += E[97];
                                l2 = l6 ^ (0L ^ l6) & -1L >>> (n18 ^= E[98]);
                                boolean bl2 = E[99];
                                bl2 ^= E[100];
                                int n19 = E[102];
                                n19 -= E[103];
                                if (!StringsKt.contains$default((CharSequence)string3, charSequence, bl2 -= E[101], n19 += E[104], null)) continue;
                                int n20 = E[105];
                                n20 ^= E[106];
                                n7 = n20 += E[107];
                                break block10;
                            }
                            int n21 = E[108];
                            n21 -= E[109];
                            n7 = n21 -= E[110];
                        }
                    }
                    if (n7 == 0) continue;
                    int n22 = E[111];
                    n22 += E[112];
                    n = n22 -= E[113];
                    break block11;
                }
                int n23 = E[114];
                n23 += E[115];
                n = n23 ^= E[116];
            }
        }
        return n != 0;
    }

    static {
        I.b();
        long l = -4736969708965616564L;
        long l2 = 1391420649658532829L;
        long l3 = -4912235156099299884L;
        long l4 = 5577157579225547272L;
        long l5 = 1680655035562891004L;
        long l6 = -4805384902050790137L;
        long l7 = 5914437438190475035L;
        long l8 = -7516305008541569116L;
        long l9 = -1575467555438557367L;
        long l10 = 6398348034453689502L;
        long l11 = 3474573085005561614L;
        long l12 = -4392880022227125128L;
        long l13 = -8778937001817204644L;
        long l14 = -3900468022535097203L;
        int n = E[117];
        n -= E[118];
        c = new Object[n ^= E[119]];
        long l15 = l14;
        int n2 = E[120];
        n2 -= E[121];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 ^= E[122]);
        Object[] objectArray = new Object[E[123]];
        objectArray[I.E[124]] = C;
        objectArray[I.E[125]] = E[126];
        int n3 = E[127];
        Object object = I.A()[E[128]];
        if (object == null) {
            char[] cArray = "\u5612\u55b3\u56df\u5615\u5614\u5626\u55b6\u5613\u56d3\u56e4\u562f\u567e\u562f\u5622\u55bc\u5616\u55b4\u5610\u55bf\u562d\u56e4\u5630\u55b6\u561c\u5624\u560f\u56df\u55de\u5623\u55b3\u55bf\u55c6\u5631\u5610\u5615\u560b\u55c4\u56e4\u56e6\u55c1\u5612\u55b7\u561a\u561c\u561d\u56dc\u5623\u5630\u5612\u56df\u55b7\u55bc\u55b4\u56e0\u5614\u55bd\u560f\u560b\u55b5\u5618\u5632\u55de\u5615\u55c2\u560f\u562d\u5614\u560b\u56df\u56da\u5623\u55bf\u55c2\u55c7\u5616\u5631\u5622\u56dc\u5627\u5613\u55b4\u56d3\u55c6\u5611\u567e\u55de\u560f\u5616\u5624\u561c\u5632\u5623\u567e\u55b9\u55c7\u56e2\u560d\u561d\u56e2\u5616\u56e6\u56d9\u567e\u56e0\u55b7\u56df\u5612\u55c0\u5603\u55b4\u5613\u55c1\u562d\u562d\u5626\u55c1\u55c2\u560d\u560b\u55b7\u562b\u562f\u561c\u561f\u55c7\u55c1\u55c7\u5615\u5615\u5630\u55b6\u55b5\u561f\u562c\u5620\u560c\u5603\u56d3\u567e\u55c4\u56d9\u5621\u56d9\u5626\u55de\u560f\u56e4\u5613\u56e2\u56da\u56d9\u56d3\u55b4\u55b5\u561a\u55bf\u55c4\u56e4\u56e4\u5623\u56d3\u5614\u562f\u56da\u560c\u55c1\u562b\u5615\u5612\u562c\u55be\u5622\u5612\u56d9\u560f\u5626\u5630\u55c1\u562c\u55de\u56dd\u5619\u56dd\u56e6\u5624\u5603\u5632\u55bd\u561f\u56dd\u55c7\u5622\u56d9\u5623\u560b\u55b4\u5622\u56df\u5631\u55bc\u562c\u560d\u562b\u560d\u5630\u5603\u5620\u56d9\u56d3\u55c1\u56d9\u55b3\u5631\u56e2\u5613\u55b5\u560d\u560b\u5615\u55b7\u56e2\u55c2\u5623\u55bc\u5631\u562f\u55c2\u56e2\u56dc\u55bc\u5624\u5614\u55b5\u56da\u56e2\u5632\u567e\u55be\u56dd\u560d\u560c\u560f\u561c\u561c\u5624\u55b4\u5631\u5623\u5620\u55b8\u55b6\u5621\u56df\u5610\u56dd\u567e\u5620\u5616\u5632\u560d\u56e6\u561c\u55c6\u5614\u5615\u560d\u5612\u562f\u5615\u55ba\u561d\u56e2\u567e\u55b5\u55bc\u56e4\u562d\u560b\u5626\u560b\u560b\u5619\u55de\u55c6\u55b6\u55bf\u55c6\u5614\u56e0\u55bf\u55b6\u561f\u562c\u55b8\u56e2\u55bf\u56e4\u55bf\u56e0\u55bd\u5614\u5611\u55c1\u5626\u5621\u5632\u5619\u5630\u56e2\u561c\u55b5\u562f\u55c7\u55c2\u55b4\u55c0\u5623\u560c\u55b7\u5618\u560b\u55c4\u56e4\u56dc\u5618\u55b7\u56d9\u560d\u55b5\u567e\u5619\u5621\u561c\u56df\u5614\u55b9\u55c0\u561c\u5627\u560f\u55be\u560c\u5630\u55b5\u5626\u55c2\u56df\u5615\u5617\u5621\u5624\u560d\u55be\u56d9\u562c\u56dd\u5615\u56e1\u5612\u561a\u562b\u562c\u56e2\u55be\u55be\u5626\u55b5\u5619\u55de\u55bf\u5615\u56dc\u5619\u5632\u55b5\u56e4\u561c\u55b5\u562b\u5615\u55b3\u562c\u5611\u5613\u560c\u5631\u55b7\u55b6\u5616\u5618\u55bd\u5615\u55bc\u55c7\u56e2\u5617\u561f\u5610\u56da\u56e2\u5603\u55bc\u56d9\u562f\u5627\u5631\u55c0\u56dd\u561f\u56e2\u562f\u5616\u55b7\u567e\u5611\u5618\u5612\u55b4\u5630\u5614\u55b4\u5618\u55b7\u561a\u567e\u562f\u55b3\u567e\u5618\u560d\u560c\u55ba\u5621\u55b3\u5620\u56e1\u55c6\u56e4\u560f\u55be\u56df\u56e2\u55b5\u5624\u567e\u56e1\u5613\u56e1\u56d3\u5615\u562d\u5626\u5622\u55bc\u560f\u5603\u562f\u560b\u560c\u560f\u56df\u56d9\u5620\u560b\u56df\u5630\u5622\u5621\u55c2\u55c1\u56df\u562b\u55c4\u55bc\u55be\u55c0\u56da\u5603\u561a\u55be\u56dd\u560c\u55b6\u55bf\u55b4\u5627\u5617\u5616\u5616\u55b5\u55c6\u55c2\u55bf\u562d\u56e1\u55b8\u5614\u5620\u55b9\u561a\u561c\u5624\u5610\u562b\u55c6\u56dd\u5611\u5614\u5615\u5630\u56d3\u5631\u5619\u55b9\u56e6\u56dd\u56e0\u561c\u55c6\u56dd\u55b5\u560c\u562b\u56e1\u562f\u56e6\u55ba\u55b4\u567e\u5617\u561f\u5619\u55c1\u55bd\u5627\u5612\u5621\u560d\u56e4\u5619\u5619\u562b\u5620\u56dc\u562d\u55b6\u55b3\u562b\u55c0\u560f\u56e1\u5627\u560b\u55b7\u55bd\u5620\u5632\u55c6\u56e4\u56e4\u5616\u5618\u5614\u56e2\u5621\u56e2\u56e0\u562f\u5620\u55bd\u5611\u56d3\u55bd\u5610\u56e2\u562c\u561f\u55b7\u561c\u55bc\u562f\u5623\u55b5\u5632\u55b6\u5619\u5624\u55b4\u561c\u5631\u567e\u561c\u5632\u55b3\u5614\u55bd\u55c4\u55bd\u56da\u55c1\u56d3\u567e\u5611\u5623\u5610\u55c7\u5616\u5619\u560d\u562c\u561a\u56dd\u55bf\u5616\u56dd\u55bd\u5603\u5622\u5632\u5623\u5619\u55c6\u55b4\u5603\u55b8\u56e6\u5624\u55bd\u562c\u55b7\u5631\u5615\u5619\u56dd\u5631\u55bd\u567e\u560d\u5614\u5615\u5622\u560b\u5610\u55b4\u55c4\u560f\u561d\u56e2\u56dc\u5617\u561d\u5619\u56d9\u560c\u5614\u56d3\u55c2\u55c6\u567e\u55c1\u5626\u560c\u55bd\u5622\u5626\u561c\u561d\u56e4\u56d3\u5621\u561f\u567e\u55c0\u56e4\u560f\u560c\u5617\u5621\u56e2\u560f\u56e0\u5624\u55b8\u56e8".toCharArray();
            for (int i2 = E[129]; i2 < E[130]; ++i2) {
                int n4 = cArray[i2];
                n4 -= E[131];
                n4 += E[132];
                n4 -= E[133];
                n4 ^= E[134];
                n4 -= E[135];
                n4 ^= E[136];
                n4 -= E[137];
                n4 += E[138];
                n4 ^= E[139];
                n4 ^= E[140];
                n4 ^= E[141];
                cArray[i2] = (char)(n4 -= E[142]);
            }
            object = I.A()[I.E[143]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)I.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = E[144];
        n5 += E[145];
        l5 = l16 ^ (0x17200000000L ^ l16) & -1L << (n5 += E[146]);
        long l17 = l12;
        int n6 = E[147];
        n6 ^= E[148];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 += E[149]);
        while (true) {
            int n7 = E[150];
            n7 -= E[151];
            if ((int)l12 >= (int)(l5 >>> (n7 ^= E[152]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = E[153];
            n9 -= E[154];
            int n10 = E[156];
            n10 ^= E[157];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 += E[155])) & -1L >>> (n10 += E[158]);
            long l19 = l8;
            int n11 = E[159];
            n11 ^= E[160];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += E[161]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = E[162];
            n13 += E[163];
            int n14 = E[165];
            n14 += E[166];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 ^= E[164])) & -1L >>> (n14 -= E[167]);
            int n15 = E[168];
            n15 -= E[169];
            long l21 = l9;
            int n16 = E[171];
            n16 ^= E[172];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= E[170]) ^ l21) & -1L << (n16 -= E[173]);
            int n17 = E[174];
            n17 -= E[175];
            n17 += E[176];
            int n18 = E[177];
            n18 += E[178];
            long l22 = l11;
            int n19 = E[180];
            n19 -= E[181];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 -= E[179]))) ^ l22) & -1L >>> (n19 ^= E[182]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = E[183];
            n20 ^= E[184];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 += E[185]);
            while (true) {
                int n21 = E[186];
                n21 += E[187];
                if ((int)(l13 >>> (n21 -= E[188])) >= (int)l11) break;
                int n22 = E[189];
                n22 += E[190];
                int n23 = E[192];
                n23 += E[193];
                cArray2[(int)(l13 >>> (n22 -= I.E[191]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= E[194]))];
                l13 += 0x100000000L;
            }
            int n24 = E[195];
            n24 -= E[196];
            int n25 = (int)(l14 >>> (n24 -= E[197]));
            l14 += 0x100000000L;
            I.c[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = E[198];
            n26 += E[199];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 -= E[200]);
        }
        INSTANCE = new I();
        int n27 = E[201];
        n27 -= E[202];
        int n28 = E[204];
        n28 -= E[205];
        boolean bl = E[207];
        bl -= E[208];
        a = INSTANCE.boolean((String)c[n27 += E[203]] + (String)c[n28 += E[206]], bl ^= E[209]);
        int n29 = E[210];
        n29 ^= E[211];
        int n30 = E[213];
        n30 -= E[214];
        boolean bl2 = E[216];
        bl2 -= E[217];
        A = INSTANCE.boolean((String)c[n29 -= E[212]] + (String)c[n30 += E[215]], bl2 -= E[218]);
        int n31 = E[219];
        n31 ^= E[220];
        b = new Regex((String)c[n31 ^= E[221]], RegexOption.IGNORE_CASE);
        int n32 = E[222];
        n32 ^= E[223];
        String[] stringArray = new String[n32 -= E[224]];
        int n33 = E[225];
        n33 += E[226];
        int n34 = E[228];
        n34 ^= E[229];
        stringArray[n33 += I.E[227]] = (String)c[n34 += E[230]];
        int n35 = E[231];
        n35 += E[232];
        int n36 = E[234];
        n36 ^= E[235];
        stringArray[n35 -= I.E[233]] = (String)c[n36 += E[236]];
        int n37 = E[237];
        n37 -= E[238];
        int n38 = E[240];
        n38 -= E[241];
        stringArray[n37 -= I.E[239]] = (String)c[n38 -= E[242]];
        int n39 = E[243];
        n39 += E[244];
        int n40 = E[246];
        n40 -= E[247];
        stringArray[n39 += I.E[245]] = (String)c[n40 -= E[248]];
        int n41 = E[249];
        n41 += E[250];
        int n42 = E[252];
        n42 ^= E[253];
        stringArray[n41 -= I.E[251]] = (String)c[n42 -= E[254]];
        int n43 = E[255];
        n43 += E[256];
        int n44 = E[258];
        n44 ^= E[259];
        stringArray[n43 ^= I.E[257]] = (String)c[n44 += E[260]];
        int n45 = E[261];
        n45 ^= E[262];
        int n46 = E[264];
        n46 -= E[265];
        stringArray[n45 += I.E[263]] = (String)c[n46 ^= E[266]];
        int n47 = E[267];
        n47 -= E[268];
        int n48 = E[270];
        n48 ^= E[271];
        stringArray[n47 -= I.E[269]] = (String)c[n48 -= E[272]];
        B = CollectionsKt.listOf(stringArray);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[E[273]];
        String string = (String)object[E[274]];
        object = object[E[275]];
        Object[] objectArray = D;
        if (D == null) {
            objectArray = D = new Object[E[276]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[E[277]];
                C = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[E[279] ^ E[280]];
                byArray[I.E[281] ^ I.E[282]] = E[283] ^ E[284];
                byArray[I.E[285] ^ I.E[286]] = E[287] ^ E[288];
                byArray[I.E[289] ^ I.E[290]] = E[291] ^ E[292];
                byArray[I.E[293] ^ I.E[294]] = E[295] ^ E[296];
                byArray[I.E[297] ^ I.E[298]] = E[299] ^ E[300];
                byArray[I.E[301] ^ I.E[302]] = E[303] ^ E[304];
                byArray[I.E[305] ^ I.E[306]] = E[307] ^ E[308];
                byArray[I.E[309] ^ I.E[310]] = E[311] ^ E[312];
                byArray[I.E[313] ^ I.E[314]] = E[315] ^ E[316];
                byArray[I.E[317] ^ I.E[318]] = E[319] ^ E[320];
                byArray[I.E[321] ^ I.E[322]] = E[323] ^ E[324];
                byArray[I.E[325] ^ I.E[326]] = E[327] ^ E[328];
                byArray[I.E[329] ^ I.E[330]] = E[331] ^ E[332];
                byArray[I.E[333] ^ I.E[334]] = E[335] ^ E[336];
                byArray[I.E[337] ^ I.E[338]] = E[339] ^ E[340];
                byArray[I.E[341] ^ I.E[342]] = E[343] ^ E[344];
                objectArray2[I.E[278]] = byArray;
            }
            byte[] byArray = (byte[])object3[E[345]];
            if (d == null) {
                byte[] byArray2 = new byte[E[346] ^ E[347]];
                byArray2[I.E[348] ^ I.E[349]] = E[350] ^ E[351];
                byArray2[I.E[352] ^ I.E[353]] = E[354] ^ E[355];
                byArray2[I.E[356] ^ I.E[357]] = E[358] ^ E[359];
                byArray2[I.E[360] ^ I.E[361]] = E[362] ^ E[363];
                byArray2[I.E[364] ^ I.E[365]] = E[366] ^ E[367];
                byArray2[I.E[368] ^ I.E[369]] = E[370] ^ E[371];
                byArray2[I.E[372] ^ I.E[373]] = E[374] ^ E[375];
                byArray2[I.E[376] ^ I.E[377]] = E[378] ^ E[379];
                byArray2[I.E[380] ^ I.E[381]] = E[382] ^ E[383];
                byArray2[I.E[384] ^ I.E[385]] = E[386] ^ E[387];
                byArray2[I.E[388] ^ I.E[389]] = E[390] ^ E[391];
                byArray2[I.E[392] ^ I.E[393]] = E[394] ^ E[395];
                byArray2[I.E[396] ^ I.E[397]] = E[398] ^ E[399];
                byArray2[0x3C41 ^ 0x3C54] = 0xFFFFC3FF ^ 0x3C54;
                byArray2[0x1083C ^ 0x1083C] = 0x1080A ^ 0x1083C;
                byArray2[0x670B ^ 0x6714] = 0x6736 ^ 0x6714;
                byArray2[0x2748 ^ 0x275B] = 0xFFFFD8C7 ^ 0x275B;
                byArray2[0x9210 ^ 0x920B] = 0xFFFF6DA5 ^ 0x920B;
                byArray2[0x9055 ^ 0x904F] = 0xFFFF6F88 ^ 0x904F;
                byArray2[0xF19A ^ 0xF196] = 0xFFFF0E00 ^ 0xF196;
                byArray2[0xB2A ^ 0xB3A] = 0xFFFFF4EF ^ 0xB3A;
                byArray2[0x27A1 ^ 0x27A3] = 0x2788 ^ 0x27A3;
                byArray2[0x10A39 ^ 0x10A2B] = 0x10A3E ^ 0x10A2B;
                byArray2[0xE1FD ^ 0xE1FE] = 0xE1E1 ^ 0xE1FE;
                byArray2[0x24AB ^ 0x24A2] = 0x24E5 ^ 0x24A2;
                byArray2[0x46D7 ^ 0x46CB] = 0xFFFFB964 ^ 0x46CB;
                byArray2[0x3D79 ^ 0x3D7E] = 0x3D16 ^ 0x3D7E;
                byArray2[0xD692 ^ 0xD696] = 0xFFFF2931 ^ 0xD696;
                byArray2[0xEAE9 ^ 0xEAE2] = 0xEA8D ^ 0xEAE2;
                byArray2[0x936C ^ 0x9374] = 0x9361 ^ 0x9374;
                byArray2[0xF24A ^ 0xF244] = 0xF267 ^ 0xF244;
                byArray2[0xAF48 ^ 0xAF51] = 0xAF4F ^ 0xAF51;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = I.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u2172\u2170\u2159\u2166\u1dc4\u21a0\u1dd5\u202b\u2056\u202a\u1dca\u204f\u2183\u2051\u2181\u1dca\u21a3\u2193".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n2 = cArray[i2];
                        n2 += 12416;
                        n2 -= 13474;
                        n2 -= 44675;
                        n2 += 50439;
                        n2 += 59658;
                        n2 ^= 0x200B;
                        n2 -= 17675;
                        n2 ^= 0x6090;
                        n2 ^= 0x4950;
                        n2 += 58385;
                        n2 ^= 0xC7F2;
                        n2 -= 30772;
                        n2 ^= 0x6B5B;
                        cArray[i2] = (char)(n2 -= 59038);
                    }
                    object4 = I.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[12] = -81;
                byArray4[14] = 74;
                byArray4[13] = 74;
                byArray4[2] = 6;
                byArray4[3] = -29;
                byArray4[7] = -50;
                byArray4[5] = 89;
                byArray4[11] = 25;
                byArray4[15] = -62;
                byArray4[0] = -77;
                byArray4[9] = -86;
                byArray4[1] = -105;
                byArray4[4] = 70;
                byArray4[6] = -50;
                byArray4[10] = -87;
                byArray4[8] = -14;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 23, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = I.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u1581\u15b5\u15b3".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 -= 11075;
                        n3 += 3011;
                        n3 ^= 0xACA5;
                        n3 ^= 0x5885;
                        n3 += 23240;
                        n3 -= 41167;
                        n3 -= 18640;
                        n3 -= 49878;
                        n3 -= 33271;
                        n3 ^= 0xB298;
                        n3 ^= 0xD318;
                        n3 ^= 0xEF58;
                        n3 += 29978;
                        n3 -= 36763;
                        cArray[i3] = (char)(n3 += 31261);
                    }
                    object5 = I.A()[2] = new String(cArray);
                }
                d = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = I.A()[3];
            if (object6 == null) {
                char[] cArray = "\ucfaf\ucf9b\ucf95\ucfb9\ucfa5\ucf80\ucfa5\ucfb9\ucf92\ucf9d\ucfa5\ucf95\ucfab\ucf92\ucf8f\ucf8e\ucf8e\ucfc7\ucff4\ucfc1".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 ^= 0xD2E4;
                    n4 += 53412;
                    n4 += 51494;
                    n4 ^= 0xDD29;
                    n4 ^= 0xEF2D;
                    n4 -= 46990;
                    n4 -= 19631;
                    n4 += 31983;
                    n4 ^= 0x3A73;
                    n4 -= 3059;
                    n4 += 34164;
                    n4 ^= 0xB817;
                    n4 ^= 0xA7BA;
                    cArray[i4] = (char)(n4 -= 24155);
                }
                object6 = I.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)d), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = e;
        if (e == null) {
            e = new Object[4];
            objectArray = e;
        }
        return objectArray;
    }

    public static void b() {
        E = new int[0x7509 ^ 0x7499];
        I.E[0x4B97 ^ 0x4A83] = 0x4A82 ^ 0x4A83;
        I.E[0x93FD ^ 0x929D] = 0x19FA2 ^ 0x929D;
        I.E[0x8DF0 ^ 0x8CF0] = 0x8CB1 ^ 0x8CF0;
        I.E[0x100D4 ^ 0x10183] = 0x103D6 ^ 0x10183;
        I.E[0xB5EF ^ 0xB4D3] = 0x2C0B ^ 0xB4D3;
        I.E[0xE6DF ^ 0xE6FD] = 0xFFFF1961 ^ 0xE6FD;
        I.E[0x70DF ^ 0x70BE] = 0xFFFF8F50 ^ 0x70BE;
        I.E[0x29F0 ^ 0x290A] = 0x2958 ^ 0x290A;
        I.E[0x7CF8 ^ 0x7C0B] = 0x7C6D ^ 0x7C0B;
        I.E[0x10040 ^ 0x100C7] = 0x199B0 ^ 0x100C7;
        I.E[0xE0C3 ^ 0xE09C] = 0xE08F ^ 0xE09C;
        I.E[0xFA3F ^ 0xFB05] = 0x63DD ^ 0xFB05;
        I.E[0x2DDF ^ 0x2DA7] = 0x2DD3 ^ 0x2DA7;
        I.E[0x81A1 ^ 0x8028] = 0x4E44 ^ 0x8028;
        I.E[0xD1A2 ^ 0xD15E] = 0xFFFF2EF9 ^ 0xD15E;
        I.E[0x4BD0 ^ 0x4B26] = 0x4B85 ^ 0x4B26;
        I.E[0x6BE9 ^ 0x6B60] = 0x870C ^ 0x6B60;
        I.E[0x27BF ^ 0x2798] = 0xFFFFD842 ^ 0x2798;
        I.E[0x58C ^ 0x48E] = 0xFFFFFB05 ^ 0x48E;
        I.E[0xA6C1 ^ 0xA780] = 0xFD75 ^ 0xA780;
        I.E[0xFF21 ^ 0xFF0A] = 0xFFFF00F1 ^ 0xFF0A;
        I.E[0x6B81 ^ 0x6AAC] = 0xDBFE ^ 0x6AAC;
        I.E[0x985B ^ 0x9960] = 0xFFFFFE2D ^ 0x9960;
        I.E[0xC82E ^ 0xC889] = 0xFFFF376B ^ 0xC889;
        I.E[0xDC8E ^ 0xDCB7] = 0xDCAB ^ 0xDCB7;
        I.E[0x1051E ^ 0x1051A] = 0x1053F ^ 0x1051A;
        I.E[0x235F ^ 0x2262] = 0x3A05 ^ 0x2262;
        I.E[0x56B1 ^ 0x5666] = 0x5639 ^ 0x5666;
        I.E[0x58E6 ^ 0x58F1] = 0x58CD ^ 0x58F1;
        I.E[0xF44C ^ 0xF4C2] = 0xC8FD ^ 0xF4C2;
        I.E[0x1F11 ^ 0x1F6A] = 0x1F69 ^ 0x1F6A;
        I.E[0x438E ^ 0x43C5] = 0x47B6 ^ 0x43C5;
        I.E[0x7079 ^ 0x7079] = 0x7065 ^ 0x7079;
        I.E[0x8F0D ^ 0x8E43] = 0xE6F1 ^ 0x8E43;
        I.E[0x2F70 ^ 0x2E15] = 0x731A ^ 0x2E15;
        I.E[0xB45B ^ 0xB4F8] = 0xB4D8 ^ 0xB4F8;
        I.E[0xB2ED ^ 0xB2A3] = 0xFFFF4D9B ^ 0xB2A3;
        I.E[0x6D65 ^ 0x6D09] = 0xFFFF92F2 ^ 0x6D09;
        I.E[0x7F73 ^ 0x7E43] = 0xCF1F ^ 0x7E43;
        I.E[0x7459 ^ 0x7462] = 0xFFFF8BAB ^ 0x7462;
        I.E[0xF776 ^ 0xF63C] = 0x1F2DC ^ 0xF63C;
        I.E[0x3FF6 ^ 0x3F9E] = 0x3FEF ^ 0x3F9E;
        I.E[0xDD27 ^ 0xDC2F] = 0xFFFF2364 ^ 0xDC2F;
        I.E[0x3FD2 ^ 0x3F1A] = 0x3F64 ^ 0x3F1A;
        I.E[0xB60D ^ 0xB78F] = 0x338E ^ 0xB78F;
        I.E[0x5B6F ^ 0x5A37] = 0x5857 ^ 0x5A37;
        I.E[0x9773 ^ 0x9703] = 0x9713 ^ 0x9703;
        I.E[0x37EF ^ 0x36AB] = 0x6C5C ^ 0x36AB;
        I.E[0x3821 ^ 0x38EF] = 0xFFFFC705 ^ 0x38EF;
        I.E[0x58A6 ^ 0x5870] = 0x5860 ^ 0x5870;
        I.E[0xE7A ^ 0xE94] = 0xFFFFF15B ^ 0xE94;
        I.E[0x1F70 ^ 0x1E26] = 0x1C46 ^ 0x1E26;
        I.E[0xD300 ^ 0xD26F] = 0x9DC1 ^ 0xD26F;
        I.E[0x5794 ^ 0x571E] = 0x95D3 ^ 0x571E;
        I.E[0x411F ^ 0x4064] = 0x6C30 ^ 0x4064;
        I.E[0x1960 ^ 0x19D5] = 0xFFFFE61E ^ 0x19D5;
        I.E[0x94E3 ^ 0x9460] = 0x8641 ^ 0x9460;
        I.E[0xBCFC ^ 0xBCF2] = 0xBCC8 ^ 0xBCF2;
        I.E[0x83DE ^ 0x838F] = 0xFFFF7C30 ^ 0x838F;
        I.E[0xB9D9 ^ 0xB931] = 0xB976 ^ 0xB931;
        I.E[0xD10E ^ 0xD18A] = 0x178E ^ 0xD18A;
        I.E[0xEA9C ^ 0xEBDA] = 0x8AF2 ^ 0xEBDA;
        I.E[0x3EE1 ^ 0x3FEC] = 0x3F80 ^ 0x3FEC;
        I.E[0x936B ^ 0x9279] = 0x927B ^ 0x9279;
        I.E[0xA28C ^ 0xA230] = 0xFFFF5DC8 ^ 0xA230;
        I.E[0xCCE9 ^ 0xCC7D] = 0xFFFF33C4 ^ 0xCC7D;
        I.E[0x7FD7 ^ 0x7F4F] = 0xFFFF80DE ^ 0x7F4F;
        I.E[0x24D ^ 0x2F7] = 0x2B8 ^ 0x2F7;
        I.E[0x3738 ^ 0x3771] = 0x3724 ^ 0x3771;
        I.E[0x9F1E ^ 0x9F8B] = 0xFFFF604E ^ 0x9F8B;
        I.E[0x7D63 ^ 0x7DA9] = 0x7DAE ^ 0x7DA9;
        I.E[0xAF08 ^ 0xAE14] = 0xE04D ^ 0xAE14;
        I.E[0x922E ^ 0x931B] = 0xFABB ^ 0x931B;
        I.E[0x856E ^ 0x85AF] = 0xFFFF7A01 ^ 0x85AF;
        I.E[0x3A10 ^ 0x3A87] = 0xFFFFC57E ^ 0x3A87;
        I.E[0x5D3E ^ 0x5C76] = 0x3D5E ^ 0x5C76;
        I.E[0xF9A5 ^ 0xF9E2] = 0xF9B0 ^ 0xF9E2;
        I.E[0x547A ^ 0x55FD] = 0x9734 ^ 0x55FD;
        I.E[0x577 ^ 0x536] = 0x52E ^ 0x536;
        I.E[0x30FD ^ 0x30D9] = 0xFFFFCF47 ^ 0x30D9;
        I.E[0x9079 ^ 0x901E] = 0xFFFF6F81 ^ 0x901E;
        I.E[0x5ADC ^ 0x5A1F] = 0x5A49 ^ 0x5A1F;
        I.E[0x3E9B ^ 0x3EE9] = 0x3EC1 ^ 0x3EE9;
        I.E[0x5E21 ^ 0x5FA4] = 0x9D6D ^ 0x5FA4;
        I.E[0x3E44 ^ 0x3E42] = 0x3E7A ^ 0x3E42;
        I.E[0x1CA1 ^ 0x1D86] = 0xD1A4 ^ 0x1D86;
        I.E[0x6E2B ^ 0x6EBB] = 0x6EFB ^ 0x6EBB;
        I.E[0xD546 ^ 0xD459] = 0xD2A ^ 0xD459;
        I.E[0x10C36 ^ 0x10C00] = 0x10CAA ^ 0x10C00;
        I.E[0x7195 ^ 0x7084] = 0x7085 ^ 0x7084;
        I.E[0x3E95 ^ 0x3E87] = 0x3EF4 ^ 0x3E87;
        I.E[0xDD35 ^ 0xDC43] = 0x1691 ^ 0xDC43;
        I.E[0x4ECE ^ 0x4EF6] = 0x4EBF ^ 0x4EF6;
        I.E[0xFE8B ^ 0xFFA8] = 0xF61C ^ 0xFFA8;
        I.E[0x2A82 ^ 0x2ADC] = 0xFFFFD522 ^ 0x2ADC;
        I.E[0x201F ^ 0x2074] = 0xFFFFDF93 ^ 0x2074;
        I.E[0x5CA ^ 0x4D3] = 0x4A8A ^ 0x4D3;
        I.E[0x1495 ^ 0x159C] = 0xFFFFEA12 ^ 0x159C;
        I.E[0x4E22 ^ 0x4E62] = 0x4E65 ^ 0x4E62;
        I.E[0x10DFC ^ 0x10D7E] = 0x10FD2 ^ 0x10D7E;
        I.E[0xED07 ^ 0xEC34] = 0xFFFFBEDE ^ 0xEC34;
        I.E[0x7F12 ^ 0x7F9E] = 0x5890 ^ 0x7F9E;
        I.E[0x42AB ^ 0x4264] = 0x4255 ^ 0x4264;
        I.E[0x938C ^ 0x930D] = 0x930D ^ 0x930D;
        I.E[0x1094A ^ 0x10854] = 0x1D10E ^ 0x10854;
        I.E[0x20A4 ^ 0x2097] = 0xFFFFDF62 ^ 0x2097;
        I.E[0xDB01 ^ 0xDB12] = 0xDB15 ^ 0xDB12;
        I.E[0x9F87 ^ 0x9F85] = 0x9FC9 ^ 0x9F85;
        I.E[0x5464 ^ 0x55E0] = 0x9728 ^ 0x55E0;
        I.E[0xA322 ^ 0xA3C0] = 0xFFFF5C7E ^ 0xA3C0;
        I.E[0xE923 ^ 0xE90E] = 0xFFFF16DC ^ 0xE90E;
        I.E[0xAD6 ^ 0xBCB] = 0xD296 ^ 0xBCB;
        I.E[0xC323 ^ 0xC377] = 0xC312 ^ 0xC377;
        I.E[0x511B ^ 0x51FF] = 0xFFFFAE45 ^ 0x51FF;
        I.E[0xCE4 ^ 0xC72] = 0xFFFFF3D8 ^ 0xC72;
        I.E[0x91B0 ^ 0x9150] = 0xFFFF6EA7 ^ 0x9150;
        I.E[0x8332 ^ 0x8317] = 0x8327 ^ 0x8317;
        I.E[0x1407 ^ 0x158D] = 0xDBB1 ^ 0x158D;
        I.E[0x4C15 ^ 0x4D21] = 0xE054 ^ 0x4D21;
        I.E[0x1BDD ^ 0x1BF3] = 0xFFFFE450 ^ 0x1BF3;
        I.E[0xD83 ^ 0xDAB] = 0xDDA ^ 0xDAB;
        I.E[0xD7DF ^ 0xD74D] = 0xD755 ^ 0xD74D;
        I.E[0xD8E7 ^ 0xD99F] = 0xF5C3 ^ 0xD99F;
        I.E[0x9C17 ^ 0x9D5A] = 0xF5EE ^ 0x9D5A;
        I.E[0x5A3D ^ 0x5ACC] = 0x5AD4 ^ 0x5ACC;
        I.E[0x2BBC ^ 0x2B4C] = 0x2BD1 ^ 0x2B4C;
        I.E[0x8686 ^ 0x865A] = 0xFFFF79D5 ^ 0x865A;
        I.E[0x9EE6 ^ 0x9F80] = 0xC2F9 ^ 0x9F80;
        I.E[0x8AD0 ^ 0x8A0E] = 0x8A18 ^ 0x8A0E;
        I.E[0xDCEC ^ 0xDCBE] = 0xDCE7 ^ 0xDCBE;
        I.E[0x251A ^ 0x241E] = 0xFFFFDBAC ^ 0x241E;
        I.E[0xA342 ^ 0xA3BD] = 0xFFFF5C47 ^ 0xA3BD;
        I.E[0xD0E6 ^ 0xD1AF] = 0x1D542 ^ 0xD1AF;
        I.E[0xAA08 ^ 0xAB06] = 0xAB69 ^ 0xAB06;
        I.E[0x9ADC ^ 0x9A71] = 0x9A6F ^ 0x9A71;
        I.E[0x666C ^ 0x66D4] = 0x6695 ^ 0x66D4;
        I.E[0x578B ^ 0x57DD] = 0x5783 ^ 0x57DD;
        I.E[0xE666 ^ 0xE6C0] = 0xE696 ^ 0xE6C0;
        I.E[0x96F1 ^ 0x978E] = 0x749C ^ 0x978E;
        I.E[0x2806 ^ 0x28AF] = 0xFFFFD755 ^ 0x28AF;
        I.E[0x101CB ^ 0x100E2] = 0x10B7F ^ 0x100E2;
        I.E[0x135A ^ 0x1326] = 0x1326 ^ 0x1326;
        I.E[0x248E ^ 0x24B9] = 0x24D8 ^ 0x24B9;
        I.E[0x84F6 ^ 0x85B4] = 0xDF43 ^ 0x85B4;
        I.E[0x51C0 ^ 0x5110] = 0x5136 ^ 0x5110;
        I.E[0xC325 ^ 0xC2A6] = 0x4691 ^ 0xC2A6;
        I.E[0xE5EB ^ 0xE52F] = 0xE51E ^ 0xE52F;
        I.E[0x7B73 ^ 0x7A30] = 0xFFFFDF70 ^ 0x7A30;
        I.E[0x4C60 ^ 0x4CD6] = 0x4CA8 ^ 0x4CD6;
        I.E[0xA6D2 ^ 0xA783] = 0x44B4 ^ 0xA783;
        I.E[0x252B ^ 0x2427] = 0xFFFFDB84 ^ 0x2427;
        I.E[0x8F31 ^ 0x8E62] = 0xFFFF92ED ^ 0x8E62;
        I.E[0xD66B ^ 0xD67A] = 0xFFFF298A ^ 0xD67A;
        I.E[0xE9F9 ^ 0xE939] = 0xE9B7 ^ 0xE939;
        I.E[0x5A6 ^ 0x53A] = 0xFFFFFACF ^ 0x53A;
        I.E[0x107D5 ^ 0x106E7] = 0x1AB92 ^ 0x106E7;
        I.E[0x2AE8 ^ 0x2A7B] = 0xFFFFD599 ^ 0x2A7B;
        I.E[0x883D ^ 0x88E0] = 0xFFFF770E ^ 0x88E0;
        I.E[0x1C45 ^ 0x1D1C] = 0x1D1C ^ 0x1D1C;
        I.E[0x1A03 ^ 0x1AFB] = 0x1AC1 ^ 0x1AFB;
        I.E[0x94A3 ^ 0x9585] = 0x59CA ^ 0x9585;
        I.E[0xBC1C ^ 0xBD50] = 0x1B9B0 ^ 0xBD50;
        I.E[0xC4AE ^ 0xC5CC] = 0x1C8C0 ^ 0xC5CC;
        I.E[0x5F95 ^ 0x5EC5] = 0x3677 ^ 0x5EC5;
        I.E[0x4A46 ^ 0x4AE7] = 0x4AE8 ^ 0x4AE7;
        I.E[0xEEAA ^ 0xEFBA] = 0xEFF5 ^ 0xEFBA;
        I.E[0x48AF ^ 0x4893] = 0xFFFFB746 ^ 0x4893;
        I.E[0x479F ^ 0x4746] = 0xFFFFB89E ^ 0x4746;
        I.E[0x1098C ^ 0x1092E] = 0xFFFEF653 ^ 0x1092E;
        I.E[0xE2D5 ^ 0xE38E] = 0x9BA8 ^ 0xE38E;
        I.E[0x1056C ^ 0x105DD] = 0xFFFEFA1A ^ 0x105DD;
        I.E[0x10401 ^ 0x104E4] = 0xFFFEFB0B ^ 0x104E4;
        I.E[0x10D03 ^ 0x10C71] = 0xFFFEF85C ^ 0x10C71;
        I.E[0x8CCF ^ 0x8C64] = 0xFFFF73E0 ^ 0x8C64;
        I.E[0xCCA2 ^ 0xCD8C] = 0x7CD0 ^ 0xCD8C;
        I.E[0x9D0A ^ 0x9D45] = 0x9D0E ^ 0x9D45;
        I.E[0x3600 ^ 0x368B] = 0x8BC5 ^ 0x368B;
        I.E[0x5591 ^ 0x54A9] = 0x3D01 ^ 0x54A9;
        I.E[0x3432 ^ 0x34CB] = 0x34E2 ^ 0x34CB;
        I.E[0x77B4 ^ 0x76A2] = 0x76A2 ^ 0x76A2;
        I.E[0xDD3B ^ 0xDD1B] = 0xDD55 ^ 0xDD1B;
        I.E[0x552B ^ 0x5567] = 0xFFFFAAE3 ^ 0x5567;
        I.E[0x10E85 ^ 0x10E47] = 0x10E5B ^ 0x10E47;
        I.E[0xA2C ^ 0xA26] = 0xA16 ^ 0xA26;
        I.E[0x70AF ^ 0x7083] = 0x708A ^ 0x7083;
        I.E[0x3A69 ^ 0x3A75] = 0xFFFFC596 ^ 0x3A75;
        I.E[0xC29C ^ 0xC250] = 0xFFFF3DA7 ^ 0xC250;
        I.E[0x87A5 ^ 0x874C] = 0xFFFF78CF ^ 0x874C;
        I.E[0xA5AF ^ 0xA423] = 0xF827 ^ 0xA423;
        I.E[0xEAE8 ^ 0xEAA0] = 0xE927 ^ 0xEAA0;
        I.E[0xFCCA ^ 0xFDA2] = 0x69F8 ^ 0xFDA2;
        I.E[0xD97B ^ 0xD821] = 0xA027 ^ 0xD821;
        I.E[0x9794 ^ 0x961B] = 0xCA0E ^ 0x961B;
        I.E[0xF5BA ^ 0xF4EE] = 0x17D2 ^ 0xF4EE;
        I.E[0x9568 ^ 0x94E5] = 0xC8F0 ^ 0x94E5;
        I.E[0x3ED7 ^ 0x3E72] = 0xFFFFC1DE ^ 0x3E72;
        I.E[0x3924 ^ 0x39A1] = 0xA637 ^ 0x39A1;
        I.E[0xA040 ^ 0xA0CF] = 0xA0CF ^ 0xA0CF;
        I.E[0x84CC ^ 0x8583] = 0xED5A ^ 0x8583;
        I.E[0x2C7C ^ 0x2CA9] = 0xFFFFD31E ^ 0x2CA9;
        I.E[0x10236 ^ 0x10285] = 0xFFFEFD32 ^ 0x10285;
        I.E[0x7938 ^ 0x7845] = 0x9B57 ^ 0x7845;
        I.E[0x52D ^ 0x55B] = 0xFFFFFAC7 ^ 0x55B;
        I.E[0x95E2 ^ 0x948E] = 0xDB2D ^ 0x948E;
        I.E[0x1080D ^ 0x1092F] = 0x100AD ^ 0x1092F;
        I.E[0xB3C7 ^ 0xB3A4] = 0xB3B4 ^ 0xB3A4;
        I.E[0x2166 ^ 0x203A] = 0x818F ^ 0x203A;
        I.E[0x7BA3 ^ 0x7B1C] = 0x7B1B ^ 0x7B1C;
        I.E[0x7EE0 ^ 0x7EFD] = 0xFFFF817F ^ 0x7EFD;
        I.E[0xBA9 ^ 0xB86] = 0xBD9 ^ 0xB86;
        I.E[0xCE9A ^ 0xCEFC] = 0xFFFF31CC ^ 0xCEFC;
        I.E[0xB995 ^ 0xB968] = 0xB953 ^ 0xB968;
        I.E[0xD78 ^ 0xC63] = 0xFFFFBDF6 ^ 0xC63;
        I.E[0x18B0 ^ 0x1836] = 0x4E71 ^ 0x1836;
        I.E[0xC427 ^ 0xC4BE] = 0xC4F2 ^ 0xC4BE;
        I.E[0xF185 ^ 0xF12B] = 0xF181 ^ 0xF12B;
        I.E[0xC18 ^ 0xC87] = 0xCA5 ^ 0xC87;
        I.E[0xED30 ^ 0xEDAB] = 0xFFFF127D ^ 0xEDAB;
        I.E[0x90A2 ^ 0x9010] = 0x9000 ^ 0x9010;
        I.E[0x40E1 ^ 0x40C8] = 0x408B ^ 0x40C8;
        I.E[0x7944 ^ 0x7990] = 0x79A9 ^ 0x7990;
        I.E[0x24 ^ 7] = 0xFFFFFFD3 ^ 7;
        I.E[0xEA93 ^ 0xEACB] = 0xEA9F ^ 0xEACB;
        I.E[0x2F42 ^ 0x2FA8] = 0xFFFFD060 ^ 0x2FA8;
        I.E[0x9880 ^ 0x9830] = 0xFFFF67B8 ^ 0x9830;
        I.E[0x2571 ^ 0x2570] = 0x2528 ^ 0x2570;
        I.E[0x7339 ^ 0x7221] = 0x84D6 ^ 0x7221;
        I.E[0xADD0 ^ 0xADBE] = 0xFFFF5264 ^ 0xADBE;
        I.E[0xD096 ^ 0xD05D] = 0xFFFF2FB9 ^ 0xD05D;
        I.E[0xDF00 ^ 0xDE21] = 0xD7A9 ^ 0xDE21;
        I.E[0xDAB8 ^ 0xDA87] = 0xFFFF256D ^ 0xDA87;
        I.E[0x37E0 ^ 0x37E3] = 0xFFFFC848 ^ 0x37E3;
        I.E[0x9EAA ^ 0x9EAF] = 0xFFFF6126 ^ 0x9EAF;
        I.E[0x9EF7 ^ 0x9FDC] = 0xFFFF6BD2 ^ 0x9FDC;
        I.E[0x2E33 ^ 0x2E97] = 0xFFFFD10B ^ 0x2E97;
        I.E[0x881C ^ 0x8875] = 0x887A ^ 0x8875;
        I.E[0xBBC1 ^ 0xBBE0] = 0xFFFF4450 ^ 0xBBE0;
        I.E[0x737 ^ 0x7E6] = 0x7EC ^ 0x7E6;
        I.E[0x3B06 ^ 0x3A3F] = 0xA2E6 ^ 0x3A3F;
        I.E[0xE190 ^ 0xE0BA] = 0xEB24 ^ 0xE0BA;
        I.E[0x336A ^ 0x3319] = 0xFFFFCCA0 ^ 0x3319;
        I.E[0x76C2 ^ 0x762D] = 0x7631 ^ 0x762D;
        I.E[0x284F ^ 0x29C7] = 0xE7A4 ^ 0x29C7;
        I.E[0xE16 ^ 0xF68] = 0xEC4E ^ 0xF68;
        I.E[0x3EAC ^ 0x3FCD] = 0x132E4 ^ 0x3FCD;
        I.E[0xE7A8 ^ 0xE74E] = 0xFFFF18E0 ^ 0xE74E;
        I.E[0xB94E ^ 0xB84B] = 0xB84A ^ 0xB84B;
        I.E[0xF26C ^ 0xF212] = 0xF212 ^ 0xF212;
        I.E[0x8EE9 ^ 0x8FA2] = 0x18B16 ^ 0x8FA2;
        I.E[0xA70F ^ 0xA732] = 0xFFFF58C9 ^ 0xA732;
        I.E[0xF4F2 ^ 0xF421] = 0xF479 ^ 0xF421;
        I.E[0xF3F1 ^ 0xF30A] = 0xF37D ^ 0xF30A;
        I.E[0xAD54 ^ 0xAC52] = 0xAC46 ^ 0xAC52;
        I.E[0xCBFA ^ 0xCA86] = 0x2992 ^ 0xCA86;
        I.E[0x778E ^ 0x76B0] = 0x6ED3 ^ 0x76B0;
        I.E[0x6172 ^ 0x6032] = 0x7851 ^ 0x6032;
        I.E[0x5EA3 ^ 0x5FA0] = 0xFFFFA042 ^ 0x5FA0;
        I.E[0x6066 ^ 0x6151] = 0xFFFFF74A ^ 0x6151;
        I.E[0x6C5E ^ 0x6C97] = 0x6CB3 ^ 0x6C97;
        I.E[0x2044 ^ 0x20CC] = 0x28A6 ^ 0x20CC;
        I.E[0x6A06 ^ 0x6ADC] = 0x6AB6 ^ 0x6ADC;
        I.E[0x91F5 ^ 0x91A8] = 0x91B9 ^ 0x91A8;
        I.E[0x6433 ^ 0x6543] = 0x6E97 ^ 0x6543;
        I.E[0x6847 ^ 0x68EB] = 0xFFFF9751 ^ 0x68EB;
        I.E[0x73C0 ^ 0x734D] = 0x5483 ^ 0x734D;
        I.E[0xA371 ^ 0xA313] = 0xA344 ^ 0xA313;
        I.E[0x8B0F ^ 0x8A7B] = 0x4096 ^ 0x8A7B;
        I.E[0xCE8D ^ 0xCE98] = 0xCEB5 ^ 0xCE98;
        I.E[0x28B4 ^ 0x28E7] = 0xFFFFD705 ^ 0x28E7;
        I.E[0x1FF6 ^ 0x1F2D] = 0x1F55 ^ 0x1F2D;
        I.E[0x971E ^ 0x9615] = 0x9603 ^ 0x9615;
        I.E[0x8E60 ^ 0x8E8D] = 0xFFFF7160 ^ 0x8E8D;
        I.E[0x72D2 ^ 0x72CA] = 0x72F0 ^ 0x72CA;
        I.E[0xF8CC ^ 0xF8B3] = 0xF8B1 ^ 0xF8B3;
        I.E[0xCF8D ^ 0xCEF7] = 0xE290 ^ 0xCEF7;
        I.E[0x64E4 ^ 0x64FE] = 0xFFFF9B0D ^ 0x64FE;
        I.E[0xE231 ^ 0xE340] = 0xE889 ^ 0xE340;
        I.E[0xA70A ^ 0xA67D] = 0x6C8E ^ 0xA67D;
        I.E[0x1004D ^ 0x10041] = 0x1002D ^ 0x10041;
        I.E[0x6083 ^ 0x60D6] = 0xFFFF9F18 ^ 0x60D6;
        I.E[0xD046 ^ 0xD15C] = 0x9F05 ^ 0xD15C;
        I.E[0x7D0B ^ 0x7D5B] = 0xFFFF82D8 ^ 0x7D5B;
        I.E[0x752B ^ 0x74A0] = 0xBACC ^ 0x74A0;
        I.E[0xB979 ^ 0xB824] = 0x1994 ^ 0xB824;
        I.E[0xCE1A ^ 0xCF69] = 0xC4A0 ^ 0xCF69;
        I.E[0x2681 ^ 0x27AD] = 0x2C33 ^ 0x27AD;
        I.E[0x10F14 ^ 0x10F1C] = 0xFFFEF0DB ^ 0x10F1C;
        I.E[0x54C0 ^ 0x55CF] = 0x55F6 ^ 0x55CF;
        I.E[0x7A30 ^ 0x7B37] = 0xFFFF84C6 ^ 0x7B37;
        I.E[0xC8AA ^ 0xC86C] = 0xC835 ^ 0xC86C;
        I.E[0xBF5 ^ 0xB95] = 0xB1C ^ 0xB95;
        I.E[0x2301 ^ 0x225F] = 0xFFFF7C1F ^ 0x225F;
        I.E[0xE74C ^ 0xE73B] = 0xE776 ^ 0xE73B;
        I.E[0x60FB ^ 0x61D3] = 0xAD9C ^ 0x61D3;
        I.E[0xF9 ^ 0x9D] = 0xAA ^ 0x9D;
        I.E[0x10CAA ^ 0x10CAD] = 0x10CCF ^ 0x10CAD;
        I.E[0xDDB6 ^ 0xDD16] = 0xDD25 ^ 0xDD16;
        I.E[0xF71E ^ 0xF7B6] = 0xF7AE ^ 0xF7B6;
        I.E[0x6720 ^ 0x6777] = 0xFFFF988B ^ 0x6777;
        I.E[0xA01F ^ 0xA174] = 0x3539 ^ 0xA174;
        I.E[0xD856 ^ 0xD8BA] = 0xD8BE ^ 0xD8BA;
        I.E[0x235D ^ 0x223E] = 0x12F17 ^ 0x223E;
        I.E[0xAEDB ^ 0xAFDA] = 0xAFE4 ^ 0xAFDA;
        I.E[0x5568 ^ 0x559C] = 0xFFFFAA57 ^ 0x559C;
        I.E[0xF3ED ^ 0xF3B7] = 0xFFFF0CF3 ^ 0xF3B7;
        I.E[0x905B ^ 0x9019] = 0xFFFF6FBA ^ 0x9019;
        I.E[0xFB8F ^ 0xFB48] = 0xFB0D ^ 0xFB48;
        I.E[0x701D ^ 0x70AA] = 0xFFFF8F42 ^ 0x70AA;
        I.E[0x2B40 ^ 0x2B7E] = 0xFFFFD4B6 ^ 0x2B7E;
        I.E[0xBC1F ^ 0xBD3F] = 0x6465 ^ 0xBD3F;
        I.E[0x1B5 ^ 0x124] = 0xFFFFFEEC ^ 0x124;
        I.E[0xBE8B ^ 0xBE6A] = 0xBE76 ^ 0xBE6A;
        I.E[0x9EE6 ^ 0x9E49] = 0x9E6B ^ 0x9E49;
        I.E[0x104E2 ^ 0x104FD] = 0xFFFEFB44 ^ 0x104FD;
        I.E[0x2B5B ^ 0x2B56] = 0x2B01 ^ 0x2B56;
        I.E[0x204C ^ 0x2168] = 0x28EA ^ 0x2168;
        I.E[0x9C83 ^ 0x9C29] = 0x9C17 ^ 0x9C29;
        I.E[0x9B53 ^ 0x9B48] = 0xFFFF642D ^ 0x9B48;
        I.E[0xFA5A ^ 0xFB1F] = 0x9A3E ^ 0xFB1F;
        I.E[0x567D ^ 0x57FB] = 0x9516 ^ 0x57FB;
        I.E[0x5BA0 ^ 0x5A21] = 0xDE16 ^ 0x5A21;
        I.E[0xC257 ^ 0xC258] = 0xFFFF3DD6 ^ 0xC258;
        I.E[0x53BA ^ 0x53D7] = 0x53F6 ^ 0x53D7;
        I.E[0xBFA7 ^ 0xBFB3] = 0xFFFF4014 ^ 0xBFB3;
        I.E[0xD7FB ^ 0xD794] = 0xFFFF2851 ^ 0xD794;
        I.E[0xAA63 ^ 0xAB46] = 0x670C ^ 0xAB46;
        I.E[0xF9B8 ^ 0xF99E] = 0xFFFF0650 ^ 0xF99E;
        I.E[0x108F1 ^ 0x1089B] = 0x1088E ^ 0x1089B;
        I.E[0x8892 ^ 0x8899] = 0x88FF ^ 0x8899;
        I.E[0x89A0 ^ 0x8992] = 0xFFFF7653 ^ 0x8992;
        I.E[0x3FC3 ^ 0x3F11] = 0x3F70 ^ 0x3F11;
        I.E[0xD815 ^ 0xD97C] = 0x4D31 ^ 0xD97C;
        I.E[0xD374 ^ 0xD2FA] = 0xFFFF7167 ^ 0xD2FA;
        I.E[0x9FCA ^ 0x9F87] = 0x9FB9 ^ 0x9F87;
        I.E[0x4406 ^ 0x4541] = 0xFFFFDB9B ^ 0x4541;
        I.E[0x82CD ^ 0x82B0] = 0x82B1 ^ 0x82B0;
        I.E[0x133A ^ 0x1343] = 0x130B ^ 0x1343;
        I.E[0xE75A ^ 0xE7C7] = 0xE7D0 ^ 0xE7C7;
        I.E[0xDA1D ^ 0xDB68] = 0x119B ^ 0xDB68;
        I.E[0x102F9 ^ 0x103AC] = 0x101C0 ^ 0x103AC;
        I.E[0x8819 ^ 0x890C] = 0x890D ^ 0x890C;
        I.E[0x105DE ^ 0x105AA] = 0xFFFEFA4B ^ 0x105AA;
        I.E[0xA942 ^ 0xA9F6] = 0xA9DF ^ 0xA9F6;
        I.E[0xFE35 ^ 0xFEB5] = 0xFEB5 ^ 0xFEB5;
        I.E[0x9DC2 ^ 0x9DF8] = 0xFFFF6235 ^ 0x9DF8;
        I.E[0x1352 ^ 0x13A0] = 0x13DB ^ 0x13A0;
        I.E[0xEFAE ^ 0xEF9E] = 0xEFDE ^ 0xEF9E;
        I.E[0x265B ^ 0x2684] = 0xFFFFD96D ^ 0x2684;
        I.E[0xA3C4 ^ 0xA37A] = 0xA34F ^ 0xA37A;
        I.E[0x10DA2 ^ 0x10DBB] = 0x10D97 ^ 0x10DBB;
        I.E[0x57E3 ^ 0x57F5] = 0x579C ^ 0x57F5;
        I.E[0x9707 ^ 0x9610] = 0x60F7 ^ 0x9610;
        I.E[0x11D7 ^ 0x10BD] = 0x84D6 ^ 0x10BD;
        I.E[0xDCCB ^ 0xDC0E] = 0xDC0B ^ 0xDC0E;
        I.E[0xF643 ^ 0xF600] = 0xFFFF09D3 ^ 0xF600;
        I.E[0x8CE8 ^ 0x8C30] = 0x8C73 ^ 0x8C30;
        I.E[0x453D ^ 0x4450] = 0xBFE ^ 0x4450;
        I.E[0x6484 ^ 0x641A] = 0x6424 ^ 0x641A;
        I.E[0xE140 ^ 0xE04A] = 0xFFFF1FE2 ^ 0xE04A;
        I.E[0x2F29 ^ 0x2F58] = 0xFFFFD08C ^ 0x2F58;
        I.E[0xA813 ^ 0xA8A8] = 0xFFFF5761 ^ 0xA8A8;
        I.E[0x47A5 ^ 0x4718] = 0xFFFFB8EA ^ 0x4718;
        I.E[0xBA46 ^ 0xBA72] = 0xFFFF45AE ^ 0xBA72;
        I.E[0x611B ^ 0x61D6] = 0xFFFF9E09 ^ 0x61D6;
        I.E[0x5F1B ^ 0x5E2A] = 0xF350 ^ 0x5E2A;
        I.E[0xE629 ^ 0xE6C2] = 0xFFFF1919 ^ 0xE6C2;
        I.E[0xE191 ^ 0xE128] = 0xE15F ^ 0xE128;
        I.E[0xAF14 ^ 0xAE6D] = 0x8239 ^ 0xAE6D;
        I.E[0x5B6C ^ 0x5B9B] = 0x5BFE ^ 0x5B9B;
        I.E[0xC9A2 ^ 0xC9E6] = 0xC9DA ^ 0xC9E6;
        I.E[0x152C ^ 0x1448] = 0x4953 ^ 0x1448;
        I.E[0x1EB1 ^ 0x1E84] = 0x1E8D ^ 0x1E84;
        I.E[0x6DDB ^ 0x6D25] = 0xFFFF92B4 ^ 0x6D25;
        I.E[0x1191 ^ 0x118F] = 0xFFFFEE78 ^ 0x118F;
        I.E[0x99CC ^ 0x9995] = 0xFFFF665F ^ 0x9995;
        I.E[0xF8DE ^ 0xF981] = 0x5831 ^ 0xF981;
        I.E[0x365D ^ 0x3677] = 0x3655 ^ 0x3677;
        I.E[0x6560 ^ 0x6525] = 0x65EB ^ 0x6525;
        I.E[0xEF04 ^ 0xEFF1] = 0xFFFF1023 ^ 0xEFF1;
        I.E[0x197B ^ 0x1815] = 0x57A4 ^ 0x1815;
        I.E[0x34BC ^ 0x34C9] = 0xFFFFCB24 ^ 0x34C9;
        I.E[0xD7CE ^ 0xD7DE] = 0xFFFF2856 ^ 0xD7DE;
        I.E[0x2486 ^ 0x25E1] = 0x78EE ^ 0x25E1;
        I.E[0x105A8 ^ 0x104BB] = 0x104BB ^ 0x104BB;
        I.E[0xC6FB ^ 0xC7D4] = 0x7694 ^ 0xC7D4;
        I.E[0x7BBB ^ 0x7BE0] = 0xFFFF8453 ^ 0x7BE0;
        I.E[0x10C1 ^ 0x1026] = 0xFFFFEF1B ^ 0x1026;
        I.E[0xB540 ^ 0xB525] = 0xB502 ^ 0xB525;
        I.E[0xFEAB ^ 0xFEF7] = 0xFFFF0146 ^ 0xFEF7;
        I.E[0x3730 ^ 0x360F] = 0x2E44 ^ 0x360F;
        I.E[0xD2EB ^ 0xD2E2] = 0xD241 ^ 0xD2E2;
        I.E[0x998F ^ 0x99C9] = 0xFFFF6647 ^ 0x99C9;
        I.E[0x10711 ^ 0x10720] = 0xFFFEF8A1 ^ 0x10720;
        I.E[0xDE0 ^ 0xC60] = 0x885D ^ 0xC60;
        I.E[0x1758 ^ 0x1712] = 0xFFFFE893 ^ 0x1712;
        I.E[0xAB29 ^ 0xABB3] = 0xAB92 ^ 0xABB3;
        I.E[0x6250 ^ 0x6366] = 0xACE ^ 0x6366;
        I.E[0x6EA5 ^ 0x6E46] = 0x6E60 ^ 0x6E46;
        I.E[0x109E5 ^ 0x1099F] = 0x10993 ^ 0x1099F;
        I.E[0x5F10 ^ 0x5E42] = 0xBD7E ^ 0x5E42;
    }
}

