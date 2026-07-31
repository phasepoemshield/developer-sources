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
import java.util.Locale;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.command.Command;
import kotakbaz.rain.command.b;
import kotakbaz.rain.event.events.ChatMessageEvent;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a"}, d2={"Lkotakbaz/rain/module/modules/player/CommandFixModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "Lkotakbaz/rain/event/events/ChatMessageEvent;", "event", "", "onMessage", "(Lkotakbaz/rain/event/events/ChatMessageEvent;)V", "", "token", "", "shouldConvertToSlash", "(Ljava/lang/String;)Z", "translateCommandToken", "(Ljava/lang/String;)Ljava/lang/String;", "", "char", "translateChar", "(C)C", "RU_LAYOUT", "Ljava/lang/String;", "EN_LAYOUT", "", "builtInDotCommands", "Ljava/util/Set;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nCommandFixModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandFixModule.kt\nkotakbaz/rain/module/modules/player/CommandFixModule\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n161#2,6:80\n1207#2,3:89\n2792#3,3:86\n*S KotlinDebug\n*F\n+ 1 CommandFixModule.kt\nkotakbaz/rain/module/modules/player/CommandFixModule\n*L\n30#1:80,6\n56#1:89,3\n49#1:86,3\n*E\n"})
public final class CommandFixModule
extends Module {
    @NotNull
    public static final CommandFixModule INSTANCE;
    @NotNull
    private static final String a = "\u0439\u0446\u0443\u043a\u0435\u043d\u0433\u0448\u0449\u0437\u0445\u044a\u0444\u044b\u0432\u0430\u043f\u0440\u043e\u043b\u0434\u0436\u044d\u044f\u0447\u0441\u043c\u0438\u0442\u044c\u0431\u044e";
    @NotNull
    private static final String A = "qwertyuiop[]asdfghjkl;'zxcvbnm,.";
    @NotNull
    private static final Set<String> b;
    private static Object[] B;
    private static Object C;
    private static Object[] d;
    private static Object[] c;
    private static Object[] D;
    public static int[] e;

    private CommandFixModule() {
        int n2 = e[0];
        n2 += e[1];
        int n3 = e[3];
        n3 ^= e[4];
        int n4 = e[6];
        n4 ^= e[7];
        super((String)B[n2 += e[2]], a_0.getPLAYER(), (String)B[n3 ^= e[5]] + (String)B[n4 -= e[8]]);
    }

    @Commando
    public final void onMessage(@NotNull ChatMessageEvent event) {
        CharSequence charSequence;
        int n2;
        CharSequence charSequence2;
        String string;
        long l2;
        long l3;
        long l4;
        block10: {
            long l5 = -3907007875528426602L;
            long l6 = 8431277053132089292L;
            long l7 = 5570048209412628038L;
            long l8 = -5848047755849109409L;
            long l9 = -57227576058186688L;
            l4 = -4505644613557890127L;
            long l10 = 5998172134742636110L;
            long l11 = -6938570689236198874L;
            long l12 = 221327906819504402L;
            long l13 = 3795913416526853704L;
            l3 = -3868971517684822286L;
            l2 = 940027911075658199L;
            int n3 = e[9];
            n3 += e[10];
            Intrinsics.checkNotNullParameter(event, (String)B[n3 ^= e[11]]);
            if (!event.getSend()) {
                return;
            }
            string = event.getText();
            int n4 = e[12];
            n4 -= e[13];
            if (string.length() < (n4 -= e[14])) {
                return;
            }
            int n5 = e[15];
            n5 += e[16];
            long l14 = l3;
            int n6 = e[18];
            n6 += e[19];
            l3 = l14 ^ ((long)StringsKt.first(string) << (n5 -= e[17]) ^ l14) & -1L << (n6 ^= e[20]);
            int n7 = e[21];
            n7 += e[22];
            int n8 = e[24];
            n8 += e[25];
            if ((int)(l3 >>> (n7 -= e[23])) != (n8 += e[26])) {
                int n9 = e[27];
                n9 -= e[28];
                int n10 = e[30];
                n10 -= e[31];
                if ((int)(l3 >>> (n9 += e[29])) != (n10 -= e[32])) {
                    int n11 = e[33];
                    n11 += e[34];
                    int n12 = e[36];
                    n12 -= e[37];
                    if ((int)(l3 >>> (n11 += e[35])) != (n12 -= e[38])) {
                        return;
                    }
                }
            }
            charSequence2 = string;
            long l15 = l2;
            int n13 = e[39];
            n13 -= e[40];
            long l16 = l2 = l15 ^ (0L ^ l15) & -1L >>> (n13 -= e[41]);
            int n14 = e[42];
            n14 += e[43];
            l2 = l16 ^ (0L ^ l16) & -1L << (n14 += e[44]);
            int n15 = e[45];
            n15 ^= e[46];
            long l17 = l10;
            int n16 = e[48];
            n16 -= e[49];
            l10 = l17 ^ ((long)charSequence2.length() << (n15 -= e[47]) ^ l17) & -1L << (n16 += e[50]);
            while (true) {
                int n17 = e[51];
                n17 += e[52];
                int n18 = e[54];
                n18 += e[55];
                if ((int)(l2 >>> (n17 ^= e[53])) >= (int)(l10 >>> (n18 ^= e[56]))) break;
                int n19 = e[57];
                n19 ^= e[58];
                n19 += e[59];
                int n20 = e[60];
                n20 += e[61];
                long l18 = l12;
                int n21 = e[63];
                n21 -= e[64];
                l12 = l18 ^ ((long)charSequence2.charAt((int)(l2 >>> n19)) << (n20 += e[62]) ^ l18) & -1L << (n21 += e[65]);
                long l19 = l11;
                int n22 = e[66];
                n22 ^= e[67];
                l11 = l19 ^ (0L ^ l19) & -1L >>> (n22 ^= e[68]);
                int n23 = e[69];
                n23 -= e[70];
                if (CharsKt.isWhitespace((char)(l12 >>> (n23 += e[71])))) {
                    int n24 = e[72];
                    n24 -= e[73];
                    n2 = (int)(l2 >>> (n24 -= e[74]));
                    break block10;
                }
                l2 += 0x100000000L;
            }
            int n25 = e[75];
            n25 ^= e[76];
            n2 = n25 ^= e[77];
        }
        long l20 = l2;
        int n26 = e[78];
        n26 ^= e[79];
        long l21 = l2 = l20 ^ ((long)n2 ^ l20) & -1L >>> (n26 += e[80]);
        int n27 = e[81];
        n27 += e[82];
        l2 = l21 ^ (0L ^ l21) & -1L << (n27 += e[83]);
        int n28 = e[84];
        n28 -= e[85];
        long l22 = l4;
        int n29 = e[87];
        n29 -= e[88];
        l4 = l22 ^ ((long)((int)l2 == (n28 -= e[86]) ? string.length() : (int)l2) ^ l22) & -1L >>> (n29 += e[89]);
        int n30 = e[90];
        n30 ^= e[91];
        String string2 = string.substring(n30 ^= e[92], (int)l4);
        int n31 = e[93];
        n31 -= e[94];
        Intrinsics.checkNotNullExpressionValue(string2, (String)B[n31 -= e[95]]);
        charSequence2 = this.translateCommandToken(string2);
        int n32 = e[96];
        n32 ^= e[97];
        String string3 = string.substring(n32 += e[98], (int)l4);
        int n33 = e[99];
        n33 += e[100];
        Intrinsics.checkNotNullExpressionValue(string3, (String)B[n33 ^= e[101]]);
        if (Intrinsics.areEqual(charSequence2, string3)) {
            return;
        }
        int n34 = e[102];
        n34 -= e[103];
        int n35 = e[105];
        n35 += e[106];
        if ((int)(l3 >>> (n34 += e[104])) == (n35 ^= e[107]) && this.shouldConvertToSlash((String)charSequence2)) {
            int n36 = e[108];
            n36 -= e[109];
            String string4 = ((String)charSequence2).substring(n36 += e[110]);
            int n37 = e[111];
            n37 += e[112];
            Intrinsics.checkNotNullExpressionValue(string4, (String)B[n37 ^= e[113]]);
            String string5 = string4;
            int n38 = e[114];
            n38 ^= e[115];
            charSequence = (String)B[n38 += e[116]] + string5;
        } else {
            charSequence = charSequence2;
        }
        CharSequence charSequence3 = charSequence;
        String string6 = string.substring((int)l4);
        int n39 = e[117];
        n39 ^= e[118];
        Intrinsics.checkNotNullExpressionValue(string6, (String)B[n39 -= e[119]]);
        String string7 = string6;
        CharSequence charSequence4 = charSequence3;
        event.setText(charSequence4 + string7);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean shouldConvertToSlash(String token) {
        int n2;
        int n3;
        long l2 = 2348673827639432528L;
        int n4 = e[120];
        n4 += e[121];
        String string = token.substring(n4 ^= e[122]);
        int n5 = e[123];
        n5 -= e[124];
        Intrinsics.checkNotNullExpressionValue(string, (String)B[n5 += e[125]]);
        Object object = string;
        Locale locale = Locale.ROOT;
        int n6 = e[126];
        n6 ^= e[127];
        Intrinsics.checkNotNullExpressionValue(locale, (String)B[n6 -= e[128]]);
        String string2 = ((String)object).toLowerCase(locale);
        int n7 = e[129];
        n7 -= e[130];
        int n8 = e[132];
        n8 += e[133];
        Intrinsics.checkNotNullExpressionValue(string2, (String)B[n7 ^= e[131]] + (String)B[n8 ^= e[134]]);
        String string3 = string2;
        if (((CharSequence)string3).length() > 0) {
            int n9 = e[135];
            n9 -= e[136];
            n3 = n9 -= e[137];
        } else {
            int n10 = e[138];
            n10 += e[139];
            n3 = n10 += e[140];
        }
        if (n3 != 0 && !b.contains(string3)) {
            int n11;
            block7: {
                object = Command.INSTANCE.getCommands();
                long l3 = l2;
                int n12 = e[141];
                n12 ^= e[142];
                l2 = l3 ^ (0L ^ l3) & -1L << (n12 ^= e[143]);
                if (object instanceof Collection && ((Collection)object).isEmpty()) {
                    int n13 = e[144];
                    n13 += e[145];
                    n11 = n13 ^= e[146];
                } else {
                    Iterator iterator2 = object.iterator();
                    while (iterator2.hasNext()) {
                        Object t2 = iterator2.next();
                        b b2 = (b)t2;
                        long l4 = l2;
                        int n14 = e[147];
                        n14 += e[148];
                        l2 = l4 ^ (0L ^ l4) & -1L >>> (n14 ^= e[149]);
                        boolean bl = e[150];
                        bl ^= e[151];
                        if (!StringsKt.equals(b2.getName(), string3, bl ^= e[152])) continue;
                        int n15 = e[153];
                        n15 += e[154];
                        n11 = n15 -= e[155];
                        break block7;
                    }
                    int n16 = e[156];
                    n16 ^= e[157];
                    n11 = n16 -= e[158];
                }
            }
            if (n11 != 0) {
                int n17 = e[159];
                n17 ^= e[160];
                n2 = n17 ^= e[161];
                return n2 != 0;
            }
        }
        int n18 = e[162];
        n18 += e[163];
        n2 = n18 += e[164];
        return n2 != 0;
    }

    /*
     * Unable to fully structure code
     */
    private final String translateCommandToken(String token) {
        var17_2 = -1149616306561660892L;
        var33_3 = 7751004264950817022L;
        var19_4 = -2521578749865715298L;
        var35_5 = 7781816121380617713L;
        var21_6 = 6726255350449988781L;
        var23_7 = 1964103677360191027L;
        var25_8 = -4440431886035009602L;
        var27_9 = -8604440848181210082L;
        var13_10 = 1413317400367845534L;
        var29_11 = 908779628866802630L;
        var15_12 = -2009452850639053557L;
        var31_13 = -1889513557829453897L;
        v0 = var29_11;
        var38_14 = CommandFixModule.e[165];
        var38_14 += CommandFixModule.e[166];
        var29_11 = v0 ^ (0L ^ v0) & -1L >>> (var38_14 -= CommandFixModule.e[167]);
        var3_15 = new char[token.length()];
        var4_16 = token;
        v1 = var13_10;
        var40_17 = CommandFixModule.e[168];
        var40_17 += CommandFixModule.e[169];
        var13_10 = v1 ^ (0L ^ v1) & -1L >>> (var40_17 ^= CommandFixModule.e[170]);
        v2 = var15_12;
        var42_18 = CommandFixModule.e[171];
        var42_18 ^= CommandFixModule.e[172];
        v3 = var15_12 = v2 ^ (0L ^ v2) & -1L << (var42_18 += CommandFixModule.e[173]);
        var44_19 = CommandFixModule.e[174];
        var44_19 ^= CommandFixModule.e[175];
        var15_12 = v3 ^ (0L ^ v3) & -1L >>> (var44_19 -= CommandFixModule.e[176]);
        while ((int)var15_12 < var4_16.length()) {
            v4 = var21_6;
            var46_25 = CommandFixModule.e[177];
            var46_25 -= CommandFixModule.e[178];
            var21_6 = v4 ^ ((long)var4_16.charAt((int)var15_12) ^ v4) & -1L >>> (var46_25 ^= CommandFixModule.e[179]);
            var48_26 = CommandFixModule.e[180];
            var48_26 -= CommandFixModule.e[181];
            v5 = (int)(var15_12 >>> (var48_26 -= CommandFixModule.e[182]));
            var15_12 += 0x100000000L;
            v6 = var31_13;
            var50_27 = CommandFixModule.e[183];
            var50_27 ^= CommandFixModule.e[184];
            var31_13 = v6 ^ ((long)((int)var21_6) ^ v6) & -1L >>> (var50_27 += CommandFixModule.e[185]);
            v7 = var27_9;
            var52_28 = CommandFixModule.e[186];
            var52_28 -= CommandFixModule.e[187];
            var27_9 = v7 ^ ((long)v5 ^ v7) & -1L >>> (var52_28 += CommandFixModule.e[188]);
            v8 = var25_8;
            var54_29 = CommandFixModule.e[189];
            var54_29 -= CommandFixModule.e[190];
            var25_8 = v8 ^ (0L ^ v8) & -1L << (var54_29 += CommandFixModule.e[191]);
            var56_30 = CommandFixModule.e[192];
            var56_30 -= CommandFixModule.e[193];
            v9 = var31_13;
            var58_31 = CommandFixModule.e[195];
            var58_31 ^= CommandFixModule.e[196];
            var31_13 = v9 ^ ((long)CommandFixModule.INSTANCE.translateChar((char)var31_13) << (var56_30 += CommandFixModule.e[194]) ^ v9) & -1L << (var58_31 ^= CommandFixModule.e[197]);
            var60_32 = CommandFixModule.e[198];
            var60_32 += CommandFixModule.e[199];
            var3_15[(int)var27_9] = (int)(var31_13 >>> (var60_32 ^= CommandFixModule.e[200]));
            if ((int)var29_11 != 0) ** GOTO lbl-1000
            var62_33 = CommandFixModule.e[201];
            var62_33 ^= CommandFixModule.e[202];
            if ((int)(var31_13 >>> (var62_33 += CommandFixModule.e[203])) != (int)var31_13) lbl-1000:
            // 2 sources

            {
                var64_20 = CommandFixModule.e[204];
                var64_20 -= CommandFixModule.e[205];
                v10 = var64_20 ^= CommandFixModule.e[206];
            } else {
                var66_21 = CommandFixModule.e[207];
                var66_21 += CommandFixModule.e[208];
                v10 = var66_21 -= CommandFixModule.e[209];
            }
            v11 = var29_11;
            var68_22 = CommandFixModule.e[210];
            var68_22 ^= CommandFixModule.e[211];
            var29_11 = v11 ^ ((long)v10 ^ v11) & -1L >>> (var68_22 ^= CommandFixModule.e[212]);
            v12 = var15_12;
            var70_23 = CommandFixModule.e[213];
            var70_23 ^= CommandFixModule.e[214];
            var72_24 = CommandFixModule.e[216];
            var72_24 += CommandFixModule.e[217];
            var15_12 = v12 ^ (v12 ^ v12 + (long)(var70_23 += CommandFixModule.e[215])) & -1L >>> (var72_24 ^= CommandFixModule.e[218]);
        }
        return (int)var29_11 != 0 ? new String(var3_15) : token;
    }

    private final char translateChar(char c2) {
        long l2 = 6759842394999902344L;
        long l3 = -3624402282200812320L;
        long l4 = -2942410550865278095L;
        return (char)(switch (c2) {
            case '\u0451' -> {
                char var11_5 = e[219];
                var11_5 += e[220];
                yield var11_5 ^= e[221];
            }
            case '\u0401' -> {
                char var13_6 = e[222];
                var13_6 += e[223];
                yield var13_6 += e[224];
            }
            default -> {
                int var15_7 = e[225];
                var15_7 ^= e[226];
                var15_7 += e[227];
                int var17_8 = e[228];
                var17_8 ^= e[229];
                var17_8 += e[230];
                int var19_9 = e[231];
                var19_9 -= e[232];
                var19_9 -= e[233];
                boolean var21_10 = e[234];
                var21_10 ^= e[235];
                var21_10 ^= e[236];
                int var23_11 = e[237];
                var23_11 += e[238];
                var23_11 += e[239];
                int var25_12 = e[240];
                var25_12 -= e[241];
                long v1 = l3;
                int var27_13 = e[243];
                var27_13 += e[244];
                l3 = v1 ^ ((long)StringsKt.indexOf$default((CharSequence)((String)B[var15_7] + (String)B[var17_8]), Character.toLowerCase(c2), var19_9, var21_10, var23_11, null) << (var25_12 ^= e[242]) ^ v1) & -1L << (var27_13 += e[245]);
                int var29_14 = e[246];
                var29_14 ^= e[247];
                int var31_15 = e[249];
                var31_15 += e[250];
                if ((int)(l3 >>> (var29_14 += e[248])) == (var31_15 -= e[251])) {
                    yield c2;
                }
                int var33_16 = e[252];
                var33_16 -= e[253];
                var33_16 ^= e[254];
                int var35_17 = e[255];
                var35_17 -= e[256];
                var35_17 -= e[257];
                int var37_18 = e[258];
                var37_18 -= e[259];
                var37_18 ^= e[260];
                int var39_19 = e[261];
                var39_19 += e[262];
                long v2 = l4;
                int var41_20 = e[264];
                var41_20 += e[265];
                l4 = v2 ^ ((long)((String)B[var33_16] + (String)B[var35_17]).charAt((int)(l3 >>> var37_18)) << (var39_19 -= e[263]) ^ v2) & -1L << (var41_20 -= e[266]);
                if (Character.isUpperCase(c2)) {
                    int var43_21 = e[267];
                    var43_21 ^= e[268];
                    yield Character.toUpperCase((char)(l4 >>> (var43_21 ^= e[269])));
                }
                int var45_22 = e[270];
                var45_22 -= e[271];
                yield (int)(l4 >>> (var45_22 += e[272]));
            }
        });
    }

    static {
        CommandFixModule.b();
        long l2 = -6468748925789886003L;
        long l3 = -6638118115093082290L;
        long l4 = 1278283163711345948L;
        long l5 = 6006161332776393835L;
        long l6 = -4838889130983407831L;
        long l7 = -6265405689545747289L;
        long l8 = -6013597966288516341L;
        long l9 = -6752605853104883828L;
        long l10 = -1488423492036222268L;
        long l11 = 5519281448267451296L;
        long l12 = 1592419677336089267L;
        long l13 = -1899730200045287174L;
        long l14 = 3924668421822048333L;
        long l15 = 4346760209941616919L;
        int n2 = e[273];
        n2 -= e[274];
        B = new Object[n2 -= e[275]];
        long l16 = l15;
        int n3 = e[276];
        n3 += e[277];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= e[278]);
        Object[] objectArray = new Object[e[279]];
        objectArray[CommandFixModule.e[280]] = c;
        objectArray[CommandFixModule.e[281]] = e[282];
        int n4 = e[283];
        Object object = CommandFixModule.A()[e[284]];
        if (object == null) {
            char[] cArray = "\uae4d\u25e6\uae4c\uae6e\uaeba\uae6e\u25e5\uaf9d\uaed6\u25e6\uaf97\uae76\uae4b\uae47\uaed0\uaea4\uae42\uaecf\u251f\uaeaa\uaea2\uae74\uaedf\uaea8\uae42\uae4c\uae7d\uae74\uae4c\uae79\uaead\uaea5\uaed1\uae76\uaedf\u25e9\uae73\uaea5\u2510\u25e6\uae4a\u25e8\uaed8\uaeaa\uae49\uaea8\uae74\u25e8\uaeba\u25e8\u25e6\uae74\uae72\uaead\uaea3\u25e2\uaed8\uae7d\uae43\uaea9\uae78\u25e3\uae43\u25e5\uaecf\uaea2\uae7d\uaed0\u25e5\uae78\u25e8\uae73\uae70\uaed3\uae70\u25e6\u251f\uae47\uaea5\uae4a\uaecf\uaeaa\uae43\uaed6\uaea9\uaf97\uaed8\uaeba\uaf9d\uaea7\uaed0\u25e5\u25e5\uae77\u25e8\uaea7\uaeba\uae76\u25e3\uae6f\uae47\uaed3\uaea4\uae4a\uae4c\uae4a\uaf9d\uaecf\uae72\uae78\uae44\uae4b\uaea7\uaea2\uaea9\uaeaa\uaea2\uae4b\uaf9d\uae42\uaead\uaea9\uae43\uaeba\uae7a\uaecf\uae7d\uaea6\uae70\uae4a\uaed8\uae43\uaeac\uaf9a\uae79\uaed2\uae6e\uae7a\uaea3\uae7d\uae47\uae73\uae73\uaed2\uae45\uaea4\uaea6\u25e9\uae46\u25e6\u251f\uaebd\uae71\u25ec\uae7f\uaed9\uaece\uaeba\uaeaa\uaed4\u25ec\u25e2\uae48\uae6e\u25e3\uae7d\uae70\u25e6\u25e6\u25e8\u25e5\uae76\uae7d\uae71\uae48\u2510\u251f\u251f\uaea7\uaea2\uae4b\uaed3\uae4b\u25e6\uae49\u2510\uae72\u25e8\uaed2\u25e5\uaf9d\uae49\uae73\uae46\uae74\uae7d\uae70\uae76\uaeac\uae6f\uae6f\uaed1\uaed8\uaed1\uaed9\uae76\uae7a\uae73\uaea3\uaed3\uaece\uae74\u25e3\uaea7\u25e3\uae42\uaed4\uaed2\u251f\uaebd\uaed0\uaea2\uae6f\uaea9\uaed8\u25e5\u25e6\uae4b\uae43\uaea7\uaf97\u25e8\uaeba\uaed2\uaea8\uaea2\uae76\u25e6\uae47\uae7d\uaea9\uaeab\uaea2\uaea8\uae73\uaea5\uae7f\uaeab\uaea4\uae6f\uaf9a\uaeac\uae44\uaece\uaea5\uae44\uaea2\uae47\uae44\uae79\uae48\uae72\uae45\uae4b\u251f\uaed2\uae6e\uaed9\u25e4\uae79\uae45\uaea9\uaeba\uae7d\uae77\uae43\uae71\uae74\uae44\uaea4\uae44\uae71\uae48\uaea9\u25e6\u25e6\uaedf\uaed3\uae6e\u25ec\uaeac\uaedf\uaea2\u25ec\uaea6\uaea8\uaf9d\uaebd\uaecf\uaea9\u251f\uae76\uae76\u25e6\uaf9a\u25e3\uaf9a\u2510\uae78\uaed4\uaea4\uaed1\uaea9\uaed9\uaed0\uaecf\u25ec\uaeaa\uaf9a\uae79\uaecf\uae42\uae70\uaed9\u25e5\u25e2\uae42\uae7a\uaea2\uae42\uae7a\uaedf\uaeac\uae71\u251f\uae7f\u25ec\uae4b\u25e5\uae76\uae6e\uae4c\uae78\uaea9\uaed2\uae78\uaea6\uaf9a\u251f\uaea7\uae7d\u25e8\u25e2\u25ec\uaed1\uae79\uae72\uae70\uaf9d\uaed8\uae76\uaecf\u25e8\uaedf\uae79\uaed3\u251f\uaead\uae7d\uaeac\uaece\uaeac\uaed1\uaea3\uae4c\u25e5\uae73\uae79\uae46\uae76\uae71\u25e8\uaed9\uae79\uae79\uaea4\uae7a\uaed4\uaea5\uaed9\uae73\uae4d\uae72\uaea6\uaea9\uaed1\uaed0\uae6e\uaea7\uae45\uae49\uaed8\uae78\uaea5\uaeaa\uae6e\uaed8\uae7f\uaea2\u25e3\u25e2\uae77\uae4c\uaed8\uae77\uaed2\uae78\uae73\uaea8\uae45\uaed4\uae4d\uaed3\uaeab\uae43\u25e5\u251f\uaeaa\uaed1\uaea4\uae49\u25e9\u25e5\uaea7\uae48\uaf97\uaeab\uae46\uae43\u251f\uae44\uae74\uae42\uae47\uaed4\u25e8\uaed1\uae77\uae7a\uae7d\u25e3\uae76\uae46\uae7a\uaed2\uae78\uae4b\uae79\uae48\u25e8\uae74\uaebd\uaea9\uaecf\uaf97\u25e4\uaeba\uae44\u25e3\uaea8\uae1e\uae1e".toCharArray();
            for (int i2 = e[285]; i2 < e[286]; ++i2) {
                int n5 = cArray[i2];
                n5 ^= e[287];
                n5 ^= e[288];
                n5 += e[289];
                n5 -= e[290];
                n5 -= e[291];
                n5 ^= e[292];
                n5 += e[293];
                n5 += e[294];
                n5 -= e[295];
                n5 += e[296];
                n5 ^= e[297];
                n5 -= e[298];
                n5 -= e[299];
                n5 -= e[300];
                cArray[i2] = (char)(n5 ^= e[301]);
            }
            object = CommandFixModule.A()[CommandFixModule.e[302]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)CommandFixModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = e[303];
        n6 -= e[304];
        l6 = l17 ^ (0x10500000000L ^ l17) & -1L << (n6 ^= e[305]);
        long l18 = l13;
        int n7 = e[306];
        n7 ^= e[307];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += e[308]);
        while (true) {
            int n8 = e[309];
            n8 += e[310];
            if ((int)l13 >= (int)(l6 >>> (n8 -= e[311]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = e[312];
            n10 ^= e[313];
            int n11 = e[315];
            n11 += e[316];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += e[314])) & -1L >>> (n11 -= e[317]);
            long l20 = l9;
            int n12 = e[318];
            n12 += e[319];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= e[320]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = e[321];
            n14 += e[322];
            int n15 = e[324];
            n15 ^= e[325];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += e[323])) & -1L >>> (n15 += e[326]);
            int n16 = e[327];
            n16 ^= e[328];
            long l22 = l10;
            int n17 = e[330];
            n17 += e[331];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= e[329]) ^ l22) & -1L << (n17 += e[332]);
            int n18 = e[333];
            n18 ^= e[334];
            n18 -= e[335];
            int n19 = e[336];
            n19 ^= e[337];
            long l23 = l12;
            int n20 = e[339];
            n20 += e[340];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= e[338]))) ^ l23) & -1L >>> (n20 ^= e[341]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = e[342];
            n21 += e[343];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += e[344]);
            while (true) {
                int n22 = e[345];
                n22 += e[346];
                if ((int)(l14 >>> (n22 -= e[347])) >= (int)l12) break;
                int n23 = e[348];
                n23 ^= e[349];
                int n24 = e[351];
                n24 -= e[352];
                cArray2[(int)(l14 >>> (n23 -= CommandFixModule.e[350]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= e[353]))];
                l14 += 0x100000000L;
            }
            int n25 = e[354];
            n25 ^= e[355];
            int n26 = (int)(l15 >>> (n25 -= e[356]));
            l15 += 0x100000000L;
            CommandFixModule.B[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = e[357];
            n27 ^= e[358];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= e[359]);
        }
        INSTANCE = new CommandFixModule();
        int n28 = e[360];
        n28 ^= e[361];
        String[] stringArray = new String[n28 -= e[362]];
        int n29 = e[363];
        n29 ^= e[364];
        int n30 = e[366];
        n30 += e[367];
        stringArray[n29 += CommandFixModule.e[365]] = (String)B[n30 += e[368]];
        int n31 = e[369];
        n31 ^= e[370];
        int n32 = e[372];
        n32 += e[373];
        stringArray[n31 ^= CommandFixModule.e[371]] = (String)B[n32 ^= e[374]];
        int n33 = e[375];
        n33 += e[376];
        int n34 = e[378];
        n34 ^= e[379];
        stringArray[n33 ^= CommandFixModule.e[377]] = (String)B[n34 -= e[380]];
        b = SetsKt.setOf(stringArray);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[e[381]];
        String string = (String)object[e[382]];
        object = object[e[383]];
        Object[] objectArray = d;
        if (d == null) {
            objectArray = d = new Object[e[384]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[e[385]];
                c = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[e[387] ^ e[388]];
                byArray[CommandFixModule.e[389] ^ CommandFixModule.e[390]] = e[391] ^ e[392];
                byArray[CommandFixModule.e[393] ^ CommandFixModule.e[394]] = e[395] ^ e[396];
                byArray[CommandFixModule.e[397] ^ CommandFixModule.e[398]] = e[399] ^ 0xC205;
                byArray[0x84E1 ^ 0x84E5] = 0xFFFF7B75 ^ 0x84E5;
                byArray[0x7A3E ^ 0x7A32] = 0x7A15 ^ 0x7A32;
                byArray[0x8A80 ^ 0x8A8F] = 0xFFFF757E ^ 0x8A8F;
                byArray[0x39EC ^ 0x39ED] = 0x39CD ^ 0x39ED;
                byArray[0xDD30 ^ 0xDD3A] = 0xDD31 ^ 0xDD3A;
                byArray[0x11A0 ^ 0x11AB] = 0xFFFFEE3D ^ 0x11AB;
                byArray[0x259A ^ 0x2593] = 0xFFFFDA34 ^ 0x2593;
                byArray[0x1B74 ^ 0x1B72] = 0xFFFFE483 ^ 0x1B72;
                byArray[0x42F3 ^ 0x42F4] = 0xFFFFBD23 ^ 0x42F4;
                byArray[0x420B ^ 0x420E] = 0xFFFFBDE2 ^ 0x420E;
                byArray[0x1CC2 ^ 0x1CCA] = 0x1CD1 ^ 0x1CCA;
                byArray[0xCEEA ^ 0xCEE7] = 0xCED7 ^ 0xCEE7;
                byArray[0x91B2 ^ 0x91B2] = 0xFFFF6E63 ^ 0x91B2;
                objectArray2[CommandFixModule.e[386]] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (C == null) {
                byte[] byArray2 = new byte[0x5350 ^ 0x5370];
                byArray2[0x3412 ^ 0x3400] = 0xFFFFCBED ^ 0x3400;
                byArray2[0x93C3 ^ 0x93DF] = 0x938F ^ 0x93DF;
                byArray2[0xC9FD ^ 0xC9F1] = 0xC9C5 ^ 0xC9F1;
                byArray2[0xDC76 ^ 0xDC62] = 0xFFFF23E2 ^ 0xDC62;
                byArray2[0xD0F9 ^ 0xD0E3] = 0xD0C2 ^ 0xD0E3;
                byArray2[0x100C7 ^ 0x100C3] = 0xFFFEFF77 ^ 0x100C3;
                byArray2[0x28DB ^ 0x28C5] = 0x28FA ^ 0x28C5;
                byArray2[0x5AF5 ^ 0x5AF8] = 0xFFFFA514 ^ 0x5AF8;
                byArray2[0x86A9 ^ 0x86BA] = 0xFFFF792B ^ 0x86BA;
                byArray2[0x3DE2 ^ 0x3DE9] = 0xFFFFC201 ^ 0x3DE9;
                byArray2[0x10669 ^ 0x10679] = 0xFFFEF998 ^ 0x10679;
                byArray2[0x10B2E ^ 0x10B24] = 0x10B64 ^ 0x10B24;
                byArray2[0x4D18 ^ 0x4D1B] = 0x4D68 ^ 0x4D1B;
                byArray2[0x36EF ^ 0x36E1] = 0xFFFFC90B ^ 0x36E1;
                byArray2[0xE493 ^ 0xE48A] = 0xFFFF1B61 ^ 0xE48A;
                byArray2[0x1059 ^ 0x1048] = 0xFFFFEFB9 ^ 0x1048;
                byArray2[0xB471 ^ 0xB467] = 0xB45F ^ 0xB467;
                byArray2[0x902F ^ 0x9034] = 0xFFFF6FDF ^ 0x9034;
                byArray2[0x5110 ^ 0x5117] = 0xFFFFAEDB ^ 0x5117;
                byArray2[0x5D53 ^ 0x5D56] = 0xFFFFA291 ^ 0x5D56;
                byArray2[0x916C ^ 0x916E] = 0xFFFF6EB5 ^ 0x916E;
                byArray2[0xF8F8 ^ 0xF8F1] = 0xFFFF070B ^ 0xF8F1;
                byArray2[0xBBB1 ^ 0xBBB7] = 0xBBE7 ^ 0xBBB7;
                byArray2[0xDEC4 ^ 0xDED3] = 0xDEAB ^ 0xDED3;
                byArray2[0xC79D ^ 0xC792] = 0xFFFF3874 ^ 0xC792;
                byArray2[0x2170 ^ 0x2165] = 0xFFFFDEC5 ^ 0x2165;
                byArray2[0x6592 ^ 0x6592] = 0xFFFF9A14 ^ 0x6592;
                byArray2[0x10EA4 ^ 0x10EAC] = 0x10EF9 ^ 0x10EAC;
                byArray2[0x3351 ^ 0x3350] = 0xFFFFCCEE ^ 0x3350;
                byArray2[0x10A73 ^ 0x10A6E] = 0xFFFEF5C9 ^ 0x10A6E;
                byArray2[0xE92C ^ 0xE933] = 0xFFFF16D1 ^ 0xE933;
                byArray2[0xF390 ^ 0xF388] = 0xFFFF0C1B ^ 0xF388;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = CommandFixModule.A()[1];
                if (object4 == null) {
                    char[] cArray = "\udba4\uda9a\udba5\uda98\udbbe\uda0a\udbb1\udb5f\udb48\udb5c\udbbc\udb43\udbb7\udb5d\udb4d\udbbc\uda97\uda07".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= 0xB030;
                        n3 -= 13185;
                        n3 += 62721;
                        n3 += 63077;
                        n3 ^= 0x5E05;
                        n3 ^= 0x6788;
                        n3 += 33307;
                        n3 -= 5883;
                        n3 += 50717;
                        n3 ^= 0x34BE;
                        cArray[i2] = (char)(n3 -= 30783);
                    }
                    object4 = CommandFixModule.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[10] = 100;
                byArray4[15] = -28;
                byArray4[4] = -16;
                byArray4[0] = 31;
                byArray4[11] = -117;
                byArray4[2] = 23;
                byArray4[13] = -119;
                byArray4[1] = 120;
                byArray4[9] = -122;
                byArray4[6] = 62;
                byArray4[12] = -6;
                byArray4[14] = 16;
                byArray4[5] = -75;
                byArray4[3] = -104;
                byArray4[8] = -2;
                byArray4[7] = 122;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 8, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = CommandFixModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\uf693\uf6af\uf6c5".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 6304;
                        n4 += 39893;
                        n4 ^= 0x96D5;
                        n4 += 19719;
                        n4 ^= 0xB048;
                        n4 -= 24344;
                        n4 += 5176;
                        n4 -= 13240;
                        n4 += 25036;
                        n4 -= 17756;
                        cArray[i3] = (char)(n4 += 54781);
                    }
                    object5 = CommandFixModule.A()[2] = new String(cArray);
                }
                C = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = CommandFixModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\u063e\u0642\u0634\u0650\u0644\u063f\u0644\u0650\u0631\u063c\u0644\u0634\u0652\u0631\u069e\u06a5\u06a5\u0696\u069b\u0698".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 18449;
                    n5 += 30401;
                    n5 -= 22610;
                    n5 += 3331;
                    n5 -= 7429;
                    n5 += 32038;
                    n5 += 45784;
                    n5 ^= 0xF5BA;
                    n5 += 63533;
                    cArray[i4] = (char)(n5 -= 270);
                }
                object6 = CommandFixModule.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)C), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = D;
        if (D == null) {
            D = new Object[4];
            objectArray = D;
        }
        return objectArray;
    }

    public static void b() {
        e = new int[0x6B67 ^ 0x6AF7];
        CommandFixModule.e[0xE4E6 ^ 0xE4AD] = 0xFFFF1B29 ^ 0xE4AD;
        CommandFixModule.e[0x6B48 ^ 0x6A25] = 0xFFFF95B5 ^ 0x6A25;
        CommandFixModule.e[0x705E ^ 0x7084] = 0x709D ^ 0x7084;
        CommandFixModule.e[0x1628 ^ 0x168A] = 0x16F2 ^ 0x168A;
        CommandFixModule.e[0x5C37 ^ 0x5D56] = 0xFFFFA281 ^ 0x5D56;
        CommandFixModule.e[0x659B ^ 0x64C7] = 0xFFFF9B0D ^ 0x64C7;
        CommandFixModule.e[0x486 ^ 0x4AB] = 0xFFFFFB71 ^ 0x4AB;
        CommandFixModule.e[0x101E4 ^ 0x1016B] = 0xFFFEFEF9 ^ 0x1016B;
        CommandFixModule.e[0x618E ^ 0x6130] = 0x6139 ^ 0x6130;
        CommandFixModule.e[0x9E56 ^ 0x9F4A] = 0x9F4A ^ 0x9F4A;
        CommandFixModule.e[0x4236 ^ 0x429F] = 0x42BF ^ 0x429F;
        CommandFixModule.e[0x547E ^ 0x5487] = 0x541A ^ 0x5487;
        CommandFixModule.e[0xF7F4 ^ 0xF796] = 0xF7ED ^ 0xF796;
        CommandFixModule.e[0xF8FB ^ 0xF866] = 0xF86F ^ 0xF866;
        CommandFixModule.e[0xEC86 ^ 0xED00] = 0xB201 ^ 0xED00;
        CommandFixModule.e[0xEDC8 ^ 0xED53] = 0xED5E ^ 0xED53;
        CommandFixModule.e[0x49ED ^ 0x48DD] = 0xFFFFB714 ^ 0x48DD;
        CommandFixModule.e[0x10045 ^ 0x10048] = 0xFFFEFFF7 ^ 0x10048;
        CommandFixModule.e[0x6D1F ^ 0x6C12] = 0xFFFF9387 ^ 0x6C12;
        CommandFixModule.e[0x9B6E ^ 0x9BB5] = 0x9BE3 ^ 0x9BB5;
        CommandFixModule.e[0xF5FA ^ 0xF5E7] = 0xFFFF0A56 ^ 0xF5E7;
        CommandFixModule.e[0x586C ^ 0x5816] = 0x582C ^ 0x5816;
        CommandFixModule.e[0x10BE1 ^ 0x10BA8] = 0x10BC8 ^ 0x10BA8;
        CommandFixModule.e[0xB3F2 ^ 0xB3E7] = 0xB3CB ^ 0xB3E7;
        CommandFixModule.e[0x7EB ^ 0x6B2] = 0x6D7 ^ 0x6B2;
        CommandFixModule.e[0x86AE ^ 0x87FD] = 0x87C7 ^ 0x87FD;
        CommandFixModule.e[0xB25B ^ 0xB2DC] = 0xB2FC ^ 0xB2DC;
        CommandFixModule.e[0xA499 ^ 0xA4D7] = 0xFFFF5B04 ^ 0xA4D7;
        CommandFixModule.e[0x8607 ^ 0x86CA] = 0xFFFF7904 ^ 0x86CA;
        CommandFixModule.e[0xE426 ^ 0xE500] = 0xF4 ^ 0xE500;
        CommandFixModule.e[0xCACA ^ 0xCA41] = 0xFFFF35FD ^ 0xCA41;
        CommandFixModule.e[0x988A ^ 0x99D1] = 0x99F2 ^ 0x99D1;
        CommandFixModule.e[0x44CE ^ 0x44AF] = 0x44EA ^ 0x44AF;
        CommandFixModule.e[0xE6AE ^ 0xE7DF] = 0xFFFF182A ^ 0xE7DF;
        CommandFixModule.e[0xBF2C ^ 0xBF95] = 0xBFAA ^ 0xBF95;
        CommandFixModule.e[0x25BE ^ 0x251F] = 0x2505 ^ 0x251F;
        CommandFixModule.e[0x8076 ^ 0x80EE] = 0xFFFF7F4B ^ 0x80EE;
        CommandFixModule.e[0x8FCB ^ 0x8F55] = 0xFFFF70F1 ^ 0x8F55;
        CommandFixModule.e[0x1A7A ^ 0x1B4C] = 0x1B60 ^ 0x1B4C;
        CommandFixModule.e[0xA8EE ^ 0xA8E7] = 0xFFFF5766 ^ 0xA8E7;
        CommandFixModule.e[0xF470 ^ 0xF481] = 0xFFFF0B2B ^ 0xF481;
        CommandFixModule.e[0x48EC ^ 0x487B] = 0x4873 ^ 0x487B;
        CommandFixModule.e[0xB611 ^ 0xB6F4] = 0xFFFF4941 ^ 0xB6F4;
        CommandFixModule.e[0x5F04 ^ 0x5E2E] = 0xC32 ^ 0x5E2E;
        CommandFixModule.e[0xC838 ^ 0xC8B9] = 0xFFFF378E ^ 0xC8B9;
        CommandFixModule.e[0xBEC2 ^ 0xBE02] = 0xFFFF41FA ^ 0xBE02;
        CommandFixModule.e[0x1D54 ^ 0x1D43] = 0xFFFFE298 ^ 0x1D43;
        CommandFixModule.e[0xC1AF ^ 0xC186] = 0xFFFF3E66 ^ 0xC186;
        CommandFixModule.e[0xCCFF ^ 0xCC40] = 0xCC6D ^ 0xCC40;
        CommandFixModule.e[0xD1A6 ^ 0xD1B6] = 0xFFFF2E0C ^ 0xD1B6;
        CommandFixModule.e[0x7363 ^ 0x7242] = 0xED45 ^ 0x7242;
        CommandFixModule.e[0x83C4 ^ 0x8351] = 0x8377 ^ 0x8351;
        CommandFixModule.e[0xA34A ^ 0xA326] = 0xA377 ^ 0xA326;
        CommandFixModule.e[0x7509 ^ 0x7410] = 0x7411 ^ 0x7410;
        CommandFixModule.e[0x599B ^ 0x58DD] = 0x58C7 ^ 0x58DD;
        CommandFixModule.e[0x87E4 ^ 0x8697] = 0x86C8 ^ 0x8697;
        CommandFixModule.e[0x8D04 ^ 0x8C0C] = 0x8C66 ^ 0x8C0C;
        CommandFixModule.e[0x5CBC ^ 0x5CE2] = 0x5CB1 ^ 0x5CE2;
        CommandFixModule.e[0x1360 ^ 0x1332] = 0x1342 ^ 0x1332;
        CommandFixModule.e[0xB96E ^ 0xB910] = 0xB941 ^ 0xB910;
        CommandFixModule.e[0x1A95 ^ 0x1A81] = 0xFFFFE522 ^ 0x1A81;
        CommandFixModule.e[0xC327 ^ 0xC380] = 0xFFFF3C62 ^ 0xC380;
        CommandFixModule.e[0x25BD ^ 0x25F1] = 0xFFFFDA7D ^ 0x25F1;
        CommandFixModule.e[0xA2B5 ^ 0xA332] = 0xFC7D ^ 0xA332;
        CommandFixModule.e[0x2B57 ^ 0x2B8F] = 0x2BC5 ^ 0x2B8F;
        CommandFixModule.e[0x2F03 ^ 0x2E08] = 0xFFFFD1A8 ^ 0x2E08;
        CommandFixModule.e[0 ^ 0xE] = 0x5F ^ 0xE;
        CommandFixModule.e[0xDB1A ^ 0xDBBC] = 0xDBA5 ^ 0xDBBC;
        CommandFixModule.e[0x6366 ^ 0x6226] = 0xFFFF9DFE ^ 0x6226;
        CommandFixModule.e[0x35CA ^ 0x344B] = 0x344A ^ 0x344B;
        CommandFixModule.e[0xC78C ^ 0xC7AD] = 0xFFFF3870 ^ 0xC7AD;
        CommandFixModule.e[0x9966 ^ 0x9818] = 0x981A ^ 0x9818;
        CommandFixModule.e[0x8287 ^ 0x83A5] = 0xF2CF ^ 0x83A5;
        CommandFixModule.e[0x6144 ^ 0x6019] = 0xFFFF9FC3 ^ 0x6019;
        CommandFixModule.e[0xAAB8 ^ 0xAB34] = 0xBBBF ^ 0xAB34;
        CommandFixModule.e[0x2D61 ^ 0x2C3F] = 0xFFFFD3CF ^ 0x2C3F;
        CommandFixModule.e[0xB581 ^ 0xB530] = 0xB50E ^ 0xB530;
        CommandFixModule.e[0x4C53 ^ 0x4C2E] = 0x4C71 ^ 0x4C2E;
        CommandFixModule.e[0x972B ^ 0x9783] = 0xFFFF6859 ^ 0x9783;
        CommandFixModule.e[0x6F90 ^ 0x6F51] = 0x6F41 ^ 0x6F51;
        CommandFixModule.e[0xBD29 ^ 0xBC1C] = 0xBC0F ^ 0xBC1C;
        CommandFixModule.e[0x7E7B ^ 0x7EA5] = 0x7FA0 ^ 0x7EA5;
        CommandFixModule.e[0x3733 ^ 0x37A1] = 0xFFFFC860 ^ 0x37A1;
        CommandFixModule.e[0x40BA ^ 0x41F9] = 0xFFFFBE0E ^ 0x41F9;
        CommandFixModule.e[0x80BE ^ 0x813B] = 0xDE34 ^ 0x813B;
        CommandFixModule.e[0xAE28 ^ 0xAE11] = 0xAE15 ^ 0xAE11;
        CommandFixModule.e[0xDA33 ^ 0xDB31] = 0xFFFF24CE ^ 0xDB31;
        CommandFixModule.e[0xC8A ^ 0xCB1] = 0xCAE ^ 0xCB1;
        CommandFixModule.e[0x93A1 ^ 0x9349] = 0xFFFF6CF1 ^ 0x9349;
        CommandFixModule.e[0xBD69 ^ 0xBC26] = 0xFFFF43D5 ^ 0xBC26;
        CommandFixModule.e[0x7ECC ^ 0x7EB0] = 0xFFFF812A ^ 0x7EB0;
        CommandFixModule.e[0xFCBF ^ 0xFC3C] = 0xFFFF03B1 ^ 0xFC3C;
        CommandFixModule.e[0x4136 ^ 0x4134] = 0x4119 ^ 0x4134;
        CommandFixModule.e[0xB46F ^ 0xB444] = 0xB400 ^ 0xB444;
        CommandFixModule.e[0x9FB3 ^ 0x9E8B] = 0x9EDE ^ 0x9E8B;
        CommandFixModule.e[0xED8B ^ 0xED4E] = 0xED75 ^ 0xED4E;
        CommandFixModule.e[0x2F43 ^ 0x2F0C] = 0xFFFFD085 ^ 0x2F0C;
        CommandFixModule.e[0x5383 ^ 0x53BE] = 0xFFFFAC48 ^ 0x53BE;
        CommandFixModule.e[0xD14E ^ 0xD121] = 0xD1BD ^ 0xD121;
        CommandFixModule.e[0x10ADD ^ 0x10BDD] = 0x10BCC ^ 0x10BDD;
        CommandFixModule.e[0xBFCF ^ 0xBFF7] = 0xBF9B ^ 0xBFF7;
        CommandFixModule.e[0x7C41 ^ 0x7C8D] = 0xFFFF83E8 ^ 0x7C8D;
        CommandFixModule.e[0xD4BD ^ 0xD532] = 0xFFFFE8BB ^ 0xD532;
        CommandFixModule.e[0x8477 ^ 0x8488] = 0xFFFF7B6B ^ 0x8488;
        CommandFixModule.e[0x3766 ^ 0x3730] = 0x374C ^ 0x3730;
        CommandFixModule.e[0xB037 ^ 0xB06D] = 0xB041 ^ 0xB06D;
        CommandFixModule.e[0xAB10 ^ 0xAB58] = 0xAB4E ^ 0xAB58;
        CommandFixModule.e[0x10736 ^ 0x1076B] = 0x10707 ^ 0x1076B;
        CommandFixModule.e[0xFDD9 ^ 0xFCF6] = 0xFCC0 ^ 0xFCF6;
        CommandFixModule.e[0xDBD6 ^ 0xDBF0] = 0xFFFF2429 ^ 0xDBF0;
        CommandFixModule.e[0x102CD ^ 0x1022D] = 0xFFFEFDCF ^ 0x1022D;
        CommandFixModule.e[0xE9C7 ^ 0xE9D4] = 0xE9C7 ^ 0xE9D4;
        CommandFixModule.e[0xD70C ^ 0xD648] = 0xD649 ^ 0xD648;
        CommandFixModule.e[0x944A ^ 0x9485] = 0x94B7 ^ 0x9485;
        CommandFixModule.e[0xB147 ^ 0xB1E2] = 0xFFFF4E0B ^ 0xB1E2;
        CommandFixModule.e[0xAEB4 ^ 0xAEF0] = 0xFFFF5118 ^ 0xAEF0;
        CommandFixModule.e[0x6232 ^ 0x62AB] = 0xFFFF9D4A ^ 0x62AB;
        CommandFixModule.e[0x1CA1 ^ 0x1CD9] = 0xFFFFE302 ^ 0x1CD9;
        CommandFixModule.e[0xF49E ^ 0xF5EB] = 0xFFFF0A26 ^ 0xF5EB;
        CommandFixModule.e[0x7B26 ^ 0x7B79] = 0x7B7F ^ 0x7B79;
        CommandFixModule.e[0xA245 ^ 0xA2BF] = 0xFFFF5D35 ^ 0xA2BF;
        CommandFixModule.e[0xC036 ^ 0xC0CD] = 0xC0E5 ^ 0xC0CD;
        CommandFixModule.e[0x8519 ^ 0x858D] = 0x85D9 ^ 0x858D;
        CommandFixModule.e[0x32F ^ 0x22E] = 0xFFFFFDEF ^ 0x22E;
        CommandFixModule.e[0xDB3C ^ 0xDB60] = 0xDB38 ^ 0xDB60;
        CommandFixModule.e[0xD41B ^ 0xD569] = 0xFFFF2AC2 ^ 0xD569;
        CommandFixModule.e[0x1187 ^ 0x108D] = 0xFFFFEF7C ^ 0x108D;
        CommandFixModule.e[0x10633 ^ 0x10710] = 0x1049B ^ 0x10710;
        CommandFixModule.e[0xC4DD ^ 0xC423] = 0xC46F ^ 0xC423;
        CommandFixModule.e[0x6462 ^ 0x64B4] = 0xFFFF9B3A ^ 0x64B4;
        CommandFixModule.e[0x5AE3 ^ 0x5B86] = 0xFFFFA40B ^ 0x5B86;
        CommandFixModule.e[0xB2B0 ^ 0xB3A7] = 0xB3A4 ^ 0xB3A7;
        CommandFixModule.e[0x55B0 ^ 0x5553] = 0xFFFFAAD9 ^ 0x5553;
        CommandFixModule.e[0x6E15 ^ 0x6E73] = 0x6E52 ^ 0x6E73;
        CommandFixModule.e[0x2C14 ^ 0x2CBB] = 0xFFFFD36D ^ 0x2CBB;
        CommandFixModule.e[0x10788 ^ 0x106E7] = 0xFFFEF94E ^ 0x106E7;
        CommandFixModule.e[0x39DA ^ 0x38A1] = 0x38E5 ^ 0x38A1;
        CommandFixModule.e[0x90A3 ^ 0x9039] = 0x9015 ^ 0x9039;
        CommandFixModule.e[0xD42C ^ 0xD4DF] = 0xFFFF2B79 ^ 0xD4DF;
        CommandFixModule.e[0xBF6 ^ 0xBD1] = 0xFFFFF453 ^ 0xBD1;
        CommandFixModule.e[0x5A1 ^ 0x557] = 0x5CF ^ 0x557;
        CommandFixModule.e[0xA2E2 ^ 0xA290] = 0xA2AF ^ 0xA290;
        CommandFixModule.e[0xF28A ^ 0xF229] = 0xFFFF0DB6 ^ 0xF229;
        CommandFixModule.e[0xBA00 ^ 0xBAD4] = 0xBAEC ^ 0xBAD4;
        CommandFixModule.e[0x8C26 ^ 0x8D08] = 0x8D08 ^ 0x8D08;
        CommandFixModule.e[0x5503 ^ 0x5418] = 0x541A ^ 0x5418;
        CommandFixModule.e[0x3F81 ^ 0x3FD0] = 0xFFFFC02D ^ 0x3FD0;
        CommandFixModule.e[0x48A5 ^ 0x48B3] = 0xFFFFB77C ^ 0x48B3;
        CommandFixModule.e[0x4F42 ^ 0x4F84] = 0x4FC6 ^ 0x4F84;
        CommandFixModule.e[0x6DFF ^ 0x6CC1] = 0x6CAE ^ 0x6CC1;
        CommandFixModule.e[0x8247 ^ 0x828E] = 0x82CD ^ 0x828E;
        CommandFixModule.e[0x9CB6 ^ 0x9CB9] = 0x9C84 ^ 0x9CB9;
        CommandFixModule.e[0x54DB ^ 0x55EC] = 0x55F3 ^ 0x55EC;
        CommandFixModule.e[0xF392 ^ 0xF3E7] = 0xF3A0 ^ 0xF3E7;
        CommandFixModule.e[0x9C96 ^ 0x9C9C] = 0x9C8F ^ 0x9C9C;
        CommandFixModule.e[0xAAE0 ^ 0xAAB0] = 0xFFFF5576 ^ 0xAAB0;
        CommandFixModule.e[0x3483 ^ 0x34ED] = 0xFFFFCB5F ^ 0x34ED;
        CommandFixModule.e[0xD68A ^ 0xD7DD] = 0xFFFF2860 ^ 0xD7DD;
        CommandFixModule.e[0xE6B7 ^ 0xE68B] = 0xFFFF1950 ^ 0xE68B;
        CommandFixModule.e[0x8A03 ^ 0x8A85] = 0x8AB1 ^ 0x8A85;
        CommandFixModule.e[0x517 ^ 0x5D0] = 0xFFFFFA0C ^ 0x5D0;
        CommandFixModule.e[0x108F3 ^ 0x109BD] = 0x109DF ^ 0x109BD;
        CommandFixModule.e[0x6FA5 ^ 0x6FD4] = 0x6FE8 ^ 0x6FD4;
        CommandFixModule.e[0xCAAA ^ 0xCA11] = 0xFFFF35BA ^ 0xCA11;
        CommandFixModule.e[0xA50C ^ 0xA46E] = 0xA430 ^ 0xA46E;
        CommandFixModule.e[0x2C3B ^ 0x2D4F] = 0x2D3B ^ 0x2D4F;
        CommandFixModule.e[0xB9BC ^ 0xB90A] = 0xB967 ^ 0xB90A;
        CommandFixModule.e[0xFAAF ^ 0xFBEA] = 0xFBED ^ 0xFBEA;
        CommandFixModule.e[0x3615 ^ 0x377B] = 0x3739 ^ 0x377B;
        CommandFixModule.e[0xBC7 ^ 0xA91] = 0xA5E ^ 0xA91;
        CommandFixModule.e[0x289B ^ 0x28F8] = 0x28B4 ^ 0x28F8;
        CommandFixModule.e[0xE2ED ^ 0xE384] = 0xFFFF1C7E ^ 0xE384;
        CommandFixModule.e[0xAC ^ 0xC8] = 0xFFFFFF6A ^ 0xC8;
        CommandFixModule.e[0xF193 ^ 0xF11D] = 0xFFFF0E8A ^ 0xF11D;
        CommandFixModule.e[0xAAAE ^ 0xAA4A] = 0xAA5A ^ 0xAA4A;
        CommandFixModule.e[0x8A95 ^ 0x8BF1] = 0x8BC8 ^ 0x8BF1;
        CommandFixModule.e[0xDAC6 ^ 0xDAAF] = 0xDAB5 ^ 0xDAAF;
        CommandFixModule.e[0xB8A4 ^ 0xB989] = 0x8256 ^ 0xB989;
        CommandFixModule.e[0xBE0C ^ 0xBF38] = 0xFFFF40CA ^ 0xBF38;
        CommandFixModule.e[0xFD38 ^ 0xFDA7] = 0xFDAE ^ 0xFDA7;
        CommandFixModule.e[0x8A94 ^ 0x8A08] = 0xFFFF75A4 ^ 0x8A08;
        CommandFixModule.e[0x3F6F ^ 0x3F59] = 0x3F1A ^ 0x3F59;
        CommandFixModule.e[0xFC43 ^ 0xFD19] = 0xFFFF02C7 ^ 0xFD19;
        CommandFixModule.e[0xFF67 ^ 0xFE17] = 0xFE30 ^ 0xFE17;
        CommandFixModule.e[0x4CDF ^ 0x4DD1] = 0x4D31 ^ 0x4DD1;
        CommandFixModule.e[0xDF81 ^ 0xDFA2] = 0xDFC7 ^ 0xDFA2;
        CommandFixModule.e[0xB269 ^ 0xB3E4] = 0x71E3 ^ 0xB3E4;
        CommandFixModule.e[0x965E ^ 0x9694] = 0x96D1 ^ 0x9694;
        CommandFixModule.e[0x4716 ^ 0x4629] = 0xFFFFB9A0 ^ 0x4629;
        CommandFixModule.e[0xCFFD ^ 0xCF4A] = 0xCF1E ^ 0xCF4A;
        CommandFixModule.e[0x4BE4 ^ 0x4B19] = 0x4B42 ^ 0x4B19;
        CommandFixModule.e[0x2899 ^ 0x299D] = 0x2982 ^ 0x299D;
        CommandFixModule.e[0x4ECB ^ 0x4F9A] = 0x4FD2 ^ 0x4F9A;
        CommandFixModule.e[0xA4A2 ^ 0xA440] = 0xA462 ^ 0xA440;
        CommandFixModule.e[0x432 ^ 0x4BF] = 0x49A ^ 0x4BF;
        CommandFixModule.e[0x1D7F ^ 0x1D0C] = 0x1D69 ^ 0x1D0C;
        CommandFixModule.e[0x51AD ^ 0x509F] = 0x508D ^ 0x509F;
        CommandFixModule.e[0x9073 ^ 0x9033] = 0x9005 ^ 0x9033;
        CommandFixModule.e[0x10B58 ^ 0x10A7C] = 0x14FD0 ^ 0x10A7C;
        CommandFixModule.e[0x81B2 ^ 0x80B7] = 0x80C4 ^ 0x80B7;
        CommandFixModule.e[0x91F0 ^ 0x915E] = 0xFFFF6E04 ^ 0x915E;
        CommandFixModule.e[0xF2C7 ^ 0xF2C0] = 0xF283 ^ 0xF2C0;
        CommandFixModule.e[0xA2D2 ^ 0xA3E1] = 0xA3DD ^ 0xA3E1;
        CommandFixModule.e[0x7BD ^ 0x7A2] = 0xFFFFF810 ^ 0x7A2;
        CommandFixModule.e[0x10293 ^ 0x10238] = 0x1026C ^ 0x10238;
        CommandFixModule.e[0x2D86 ^ 0x2DDF] = 0x2DA3 ^ 0x2DDF;
        CommandFixModule.e[0x2416 ^ 0x2551] = 0x25FF ^ 0x2551;
        CommandFixModule.e[0xB1FE ^ 0xB0B6] = 0xB092 ^ 0xB0B6;
        CommandFixModule.e[0xCCBB ^ 0xCC2B] = 0xCC07 ^ 0xCC2B;
        CommandFixModule.e[0xE7F8 ^ 0xE7AC] = 0xE732 ^ 0xE7AC;
        CommandFixModule.e[0x9CA9 ^ 0x9D21] = 0xC220 ^ 0x9D21;
        CommandFixModule.e[0x10CDE ^ 0x10CFA] = 0xFFFEF308 ^ 0x10CFA;
        CommandFixModule.e[0x822F ^ 0x828B] = 0xFFFF7D62 ^ 0x828B;
        CommandFixModule.e[0x18C2 ^ 0x1828] = 0x1867 ^ 0x1828;
        CommandFixModule.e[0xD6E2 ^ 0xD7BD] = 0xFFFF283F ^ 0xD7BD;
        CommandFixModule.e[0xD50A ^ 0xD53F] = 0xD51A ^ 0xD53F;
        CommandFixModule.e[0x9A42 ^ 0x9B51] = 0x9B4D ^ 0x9B51;
        CommandFixModule.e[0x49BD ^ 0x493D] = 0xFFFFB68C ^ 0x493D;
        CommandFixModule.e[0x6B10 ^ 0x6B3F] = 0xFFFF94A4 ^ 0x6B3F;
        CommandFixModule.e[0xCC1A ^ 0xCD98] = 0xCD98 ^ 0xCD98;
        CommandFixModule.e[0xD9B4 ^ 0xD9C3] = 0xFFFF2669 ^ 0xD9C3;
        CommandFixModule.e[0xE522 ^ 0xE42D] = 0xE458 ^ 0xE42D;
        CommandFixModule.e[0x1B5D ^ 0x1BD1] = 0xFFFFE44D ^ 0x1BD1;
        CommandFixModule.e[0x9711 ^ 0x975C] = 0xFFFF68AB ^ 0x975C;
        CommandFixModule.e[0x5413 ^ 0x549A] = 0xFFFFAB7E ^ 0x549A;
        CommandFixModule.e[0x4634 ^ 0x4640] = 0xFFFFB9F2 ^ 0x4640;
        CommandFixModule.e[0x8460 ^ 0x84CD] = 0x84C7 ^ 0x84CD;
        CommandFixModule.e[0xD1A ^ 0xC72] = 0xFFFFF384 ^ 0xC72;
        CommandFixModule.e[0x840B ^ 0x8516] = 0x8516 ^ 0x8516;
        CommandFixModule.e[0x2560 ^ 0x241D] = 0x241C ^ 0x241D;
        CommandFixModule.e[0xBDC5 ^ 0xBDE5] = 0xFFFF4267 ^ 0xBDE5;
        CommandFixModule.e[0x37DE ^ 0x376C] = 0x372B ^ 0x376C;
        CommandFixModule.e[0xC720 ^ 0xC763] = 0xC775 ^ 0xC763;
        CommandFixModule.e[0x7117 ^ 0x71E0] = 0x71F8 ^ 0x71E0;
        CommandFixModule.e[0xCFF ^ 0xDF6] = 0xFFFFF251 ^ 0xDF6;
        CommandFixModule.e[0x1ED9 ^ 0x1FA5] = 0x1F9B ^ 0x1FA5;
        CommandFixModule.e[0x960 ^ 0x9B0] = 0x9F0 ^ 0x9B0;
        CommandFixModule.e[0xBADF ^ 0xBADA] = 0xFFFF4573 ^ 0xBADA;
        CommandFixModule.e[0xF77A ^ 0xF652] = 0xEE85 ^ 0xF652;
        CommandFixModule.e[0x3E4F ^ 0x3EF3] = 0x3E88 ^ 0x3EF3;
        CommandFixModule.e[0x20B0 ^ 0x201C] = 0x205E ^ 0x201C;
        CommandFixModule.e[0x2891 ^ 0x284D] = 0x2855 ^ 0x284D;
        CommandFixModule.e[0x8C61 ^ 0x8D0B] = 0x8D02 ^ 0x8D0B;
        CommandFixModule.e[0x58EA ^ 0x599C] = 0x59D0 ^ 0x599C;
        CommandFixModule.e[0xF4FE ^ 0xF47B] = 0xF439 ^ 0xF47B;
        CommandFixModule.e[0x7420 ^ 0x743E] = 0xFFFF8B5C ^ 0x743E;
        CommandFixModule.e[0x2D45 ^ 0x2C10] = 0xFFFFD3E4 ^ 0x2C10;
        CommandFixModule.e[0x6A47 ^ 0x6A6F] = 0xFFFF95ED ^ 0x6A6F;
        CommandFixModule.e[0xE6CE ^ 0xE7F5] = 0xE79D ^ 0xE7F5;
        CommandFixModule.e[0xD573 ^ 0xD5CB] = 0xFFFF2A7E ^ 0xD5CB;
        CommandFixModule.e[0x8459 ^ 0x8512] = 0x8572 ^ 0x8512;
        CommandFixModule.e[0xE272 ^ 0xE33F] = 0xE35E ^ 0xE33F;
        CommandFixModule.e[0x8166 ^ 0x819A] = 0x812D ^ 0x819A;
        CommandFixModule.e[0x71EB ^ 0x719D] = 0xFFFF8E62 ^ 0x719D;
        CommandFixModule.e[0xCC40 ^ 0xCC84] = 0xCCD6 ^ 0xCC84;
        CommandFixModule.e[0xFAAA ^ 0xFA64] = 0xFFFF05F2 ^ 0xFA64;
        CommandFixModule.e[0x6803 ^ 0x68D6] = 0x68EB ^ 0x68D6;
        CommandFixModule.e[0xDD3F ^ 0xDC20] = 0xA5C4 ^ 0xDC20;
        CommandFixModule.e[0xF98D ^ 0xF96B] = 0xF936 ^ 0xF96B;
        CommandFixModule.e[0x9CDE ^ 0x9CD2] = 0x9CC0 ^ 0x9CD2;
        CommandFixModule.e[0xDD58 ^ 0xDD1F] = 0xDD15 ^ 0xDD1F;
        CommandFixModule.e[0x84C6 ^ 0x85D8] = 0x8400 ^ 0x85D8;
        CommandFixModule.e[0x252B ^ 0x2543] = 0xFFFFDA83 ^ 0x2543;
        CommandFixModule.e[0x28D1 ^ 0x2819] = 0x2827 ^ 0x2819;
        CommandFixModule.e[0x8A47 ^ 0x8BCC] = 0x9B43 ^ 0x8BCC;
        CommandFixModule.e[0x9B70 ^ 0x9B82] = 0x9BA4 ^ 0x9B82;
        CommandFixModule.e[0x160A ^ 0x16BE] = 0x1648 ^ 0x16BE;
        CommandFixModule.e[0x1316 ^ 0x1211] = 0x1276 ^ 0x1211;
        CommandFixModule.e[0xD3FD ^ 0xD32A] = 0xD364 ^ 0xD32A;
        CommandFixModule.e[0x3526 ^ 0x3595] = 0xFFFFCA42 ^ 0x3595;
        CommandFixModule.e[0x3D00 ^ 0x3D60] = 0xFFFFC2A0 ^ 0x3D60;
        CommandFixModule.e[0x9D7F ^ 0x9C69] = 0xFFFF638E ^ 0x9C69;
        CommandFixModule.e[0xCDEA ^ 0xCD04] = 0xCD76 ^ 0xCD04;
        CommandFixModule.e[0xC5A4 ^ 0xC4C8] = 0xC4A1 ^ 0xC4C8;
        CommandFixModule.e[0xBE05 ^ 0xBE2B] = 0xBE4A ^ 0xBE2B;
        CommandFixModule.e[0x10488 ^ 0x10443] = 0x10459 ^ 0x10443;
        CommandFixModule.e[0xF64F ^ 0xF70E] = 0xF703 ^ 0xF70E;
        CommandFixModule.e[0x1E83 ^ 0x1E07] = 0xFFFFE1F5 ^ 0x1E07;
        CommandFixModule.e[0x6CF ^ 0x74B] = 0x9AC2 ^ 0x74B;
        CommandFixModule.e[0x7748 ^ 0x7664] = 0xEFFB ^ 0x7664;
        CommandFixModule.e[0x6A01 ^ 0x6A43] = 0xFFFF959D ^ 0x6A43;
        CommandFixModule.e[0x5B98 ^ 0x5B74] = 0x5B1F ^ 0x5B74;
        CommandFixModule.e[0x10981 ^ 0x109EC] = 0x109EE ^ 0x109EC;
        CommandFixModule.e[0xB457 ^ 0xB52E] = 0xB57A ^ 0xB52E;
        CommandFixModule.e[0x481F ^ 0x481E] = 0x481F ^ 0x481E;
        CommandFixModule.e[0x7A43 ^ 0x7BCA] = 0x6B42 ^ 0x7BCA;
        CommandFixModule.e[0x4AC1 ^ 0x4B88] = 0x4BE2 ^ 0x4B88;
        CommandFixModule.e[0xFCB7 ^ 0xFDBB] = 0xFDAE ^ 0xFDBB;
        CommandFixModule.e[0xF36A ^ 0xF331] = 0xF345 ^ 0xF331;
        CommandFixModule.e[0x9352 ^ 0x9272] = 0x9EF7 ^ 0x9272;
        CommandFixModule.e[0x215B ^ 0x2120] = 0xFFFFDE66 ^ 0x2120;
        CommandFixModule.e[0x996E ^ 0x9987] = 0xFFFF6656 ^ 0x9987;
        CommandFixModule.e[0x9EE4 ^ 0x9E39] = 0x9E37 ^ 0x9E39;
        CommandFixModule.e[0x62 ^ 0x52] = 0xFFFFFF05 ^ 0x52;
        CommandFixModule.e[0x6691 ^ 0x67B8] = 0xD2C2 ^ 0x67B8;
        CommandFixModule.e[0xCECE ^ 0xCE21] = 0xCE5C ^ 0xCE21;
        CommandFixModule.e[0xBCC0 ^ 0xBC03] = 0xBC4A ^ 0xBC03;
        CommandFixModule.e[0x2507 ^ 0x2420] = 0x48F7 ^ 0x2420;
        CommandFixModule.e[0xF55C ^ 0xF545] = 0xF542 ^ 0xF545;
        CommandFixModule.e[0xE355 ^ 0xE353] = 0xE31D ^ 0xE353;
        CommandFixModule.e[0x6911 ^ 0x6909] = 0xFFFF96E7 ^ 0x6909;
        CommandFixModule.e[0x4FD6 ^ 0x4F14] = 0x4F2C ^ 0x4F14;
        CommandFixModule.e[0x6192 ^ 0x60C2] = 0xFFFF9F5F ^ 0x60C2;
        CommandFixModule.e[0xE295 ^ 0xE385] = 0xFFFF1C30 ^ 0xE385;
        CommandFixModule.e[0xC238 ^ 0xC285] = 0xFFFF3D79 ^ 0xC285;
        CommandFixModule.e[0xF59 ^ 0xE0D] = 0xFFFFF197 ^ 0xE0D;
        CommandFixModule.e[0xF6EF ^ 0xF65A] = 0xF633 ^ 0xF65A;
        CommandFixModule.e[0x8D50 ^ 0x8C61] = 0x8C2C ^ 0x8C61;
        CommandFixModule.e[0x7A24 ^ 0x7B18] = 0x7B28 ^ 0x7B18;
        CommandFixModule.e[0xF34D ^ 0xF327] = 0xF360 ^ 0xF327;
        CommandFixModule.e[0x5499 ^ 0x54CC] = 0x54EF ^ 0x54CC;
        CommandFixModule.e[0xA75E ^ 0xA721] = 0xFFFF58C2 ^ 0xA721;
        CommandFixModule.e[0x8416 ^ 0x856E] = 0xFFFF7AD1 ^ 0x856E;
        CommandFixModule.e[0xF9C3 ^ 0xF990] = 0xFFFF0623 ^ 0xF990;
        CommandFixModule.e[0x6111 ^ 0x61FC] = 0xFFFF9EEB ^ 0x61FC;
        CommandFixModule.e[0x8123 ^ 0x81B5] = 0xFFFF7E19 ^ 0x81B5;
        CommandFixModule.e[0xE043 ^ 0xE066] = 0xFFFF1F8A ^ 0xE066;
        CommandFixModule.e[0x2DD5 ^ 0x2DCF] = 0x2DF5 ^ 0x2DCF;
        CommandFixModule.e[0x4581 ^ 0x45C4] = 0x45BC ^ 0x45C4;
        CommandFixModule.e[0x309A ^ 0x30A4] = 0x30EB ^ 0x30A4;
        CommandFixModule.e[0xFD10 ^ 0xFD47] = 0xFFFF02E3 ^ 0xFD47;
        CommandFixModule.e[0x10550 ^ 0x10511] = 0xFFFEFAA1 ^ 0x10511;
        CommandFixModule.e[0x31F2 ^ 0x3178] = 0x31D0 ^ 0x3178;
        CommandFixModule.e[0x4FDE ^ 0x4F0F] = 0x4F7D ^ 0x4F0F;
        CommandFixModule.e[0x7E9A ^ 0x7E99] = 0xFFFF8169 ^ 0x7E99;
        CommandFixModule.e[0xE614 ^ 0xE763] = 0xE7F4 ^ 0xE763;
        CommandFixModule.e[0xE68F ^ 0xE7EF] = 0xFFFF1864 ^ 0xE7EF;
        CommandFixModule.e[0x9DC0 ^ 0x9DF7] = 0x9DFE ^ 0x9DF7;
        CommandFixModule.e[0x588F ^ 0x5868] = 0xFFFFA7E1 ^ 0x5868;
        CommandFixModule.e[0x102B4 ^ 0x103D7] = 0x103D0 ^ 0x103D7;
        CommandFixModule.e[0xA58A ^ 0xA598] = 0xFFFF5AE8 ^ 0xA598;
        CommandFixModule.e[0x22AA ^ 0x2299] = 0xFFFFDD2A ^ 0x2299;
        CommandFixModule.e[0x1065F ^ 0x10619] = 0x1067B ^ 0x10619;
        CommandFixModule.e[0xEED7 ^ 0xEEE6] = 0xFFFF1153 ^ 0xEEE6;
        CommandFixModule.e[0x10332 ^ 0x10306] = 0x10354 ^ 0x10306;
        CommandFixModule.e[0xED0C ^ 0xEC14] = 0xEC14 ^ 0xEC14;
        CommandFixModule.e[0x2094 ^ 0x21BF] = 0x8AE2 ^ 0x21BF;
        CommandFixModule.e[0x30FB ^ 0x30FB] = 0xFFFFCF23 ^ 0x30FB;
        CommandFixModule.e[0xDDAE ^ 0xDD7C] = 0xFFFF22AB ^ 0xDD7C;
        CommandFixModule.e[0x93C3 ^ 0x92E6] = 0x7A9 ^ 0x92E6;
        CommandFixModule.e[0xC382 ^ 0xC363] = 0xC33A ^ 0xC363;
        CommandFixModule.e[0x5C01 ^ 0x5D59] = 0xFFFFA2CD ^ 0x5D59;
        CommandFixModule.e[0xFE13 ^ 0xFEB3] = 0xFEA1 ^ 0xFEB3;
        CommandFixModule.e[0x811A ^ 0x81AA] = 0x81C6 ^ 0x81AA;
        CommandFixModule.e[0x10932 ^ 0x109A1] = 0xFFFEF613 ^ 0x109A1;
        CommandFixModule.e[0xF8B1 ^ 0xF820] = 0xFFFF07B4 ^ 0xF820;
        CommandFixModule.e[0x3882 ^ 0x3800] = 0xFFFFC7AE ^ 0x3800;
        CommandFixModule.e[0x11C1 ^ 0x10D5] = 0x10CD ^ 0x10D5;
        CommandFixModule.e[0x1041C ^ 0x104EC] = 0xFFFEFB5C ^ 0x104EC;
        CommandFixModule.e[0xA5D1 ^ 0xA45B] = 0xB4D0 ^ 0xA45B;
        CommandFixModule.e[0x10B0E ^ 0x10A5C] = 0xFFFEF5E9 ^ 0x10A5C;
        CommandFixModule.e[0x401D ^ 0x4176] = 0x416F ^ 0x4176;
        CommandFixModule.e[0xDE9A ^ 0xDEA8] = 0xDED6 ^ 0xDEA8;
        CommandFixModule.e[0xF57C ^ 0xF574] = 0xF571 ^ 0xF574;
        CommandFixModule.e[0x6398 ^ 0x62A1] = 0x628A ^ 0x62A1;
        CommandFixModule.e[0xB6B4 ^ 0xB68E] = 0xB68B ^ 0xB68E;
        CommandFixModule.e[0xCB6E ^ 0xCA11] = 0xCA11 ^ 0xCA11;
        CommandFixModule.e[0xE400 ^ 0xE506] = 0xE512 ^ 0xE506;
        CommandFixModule.e[0x10A1D ^ 0x10A16] = 0xFFFEF585 ^ 0x10A16;
        CommandFixModule.e[0xAEB8 ^ 0xAFA9] = 0xAF92 ^ 0xAFA9;
        CommandFixModule.e[0xF44E ^ 0xF5CD] = 0x6854 ^ 0xF5CD;
        CommandFixModule.e[0x1074C ^ 0x1075D] = 0xFFFEF88A ^ 0x1075D;
        CommandFixModule.e[0xE486 ^ 0xE49D] = 0xE4C3 ^ 0xE49D;
        CommandFixModule.e[0x10BBA ^ 0x10BE2] = 0x10BE2 ^ 0x10BE2;
        CommandFixModule.e[0x1706 ^ 0x176D] = 0x1722 ^ 0x176D;
        CommandFixModule.e[0xFA8C ^ 0xFBCE] = 0xFFFF0433 ^ 0xFBCE;
        CommandFixModule.e[0xEF4A ^ 0xEF93] = 0xFFFF107C ^ 0xEF93;
        CommandFixModule.e[0x3EDF ^ 0x3E27] = 0xFFFFC187 ^ 0x3E27;
        CommandFixModule.e[0x793F ^ 0x782A] = 0xFFFF87C5 ^ 0x782A;
        CommandFixModule.e[0x290C ^ 0x2975] = 0x2915 ^ 0x2975;
        CommandFixModule.e[0x6E79 ^ 0x6E92] = 0x6EB6 ^ 0x6E92;
        CommandFixModule.e[0xB8D2 ^ 0xB9B4] = 0xB9FD ^ 0xB9B4;
        CommandFixModule.e[0xE5E9 ^ 0xE5F5] = 0xFFFF1A1A ^ 0xE5F5;
        CommandFixModule.e[0xB95C ^ 0xB963] = 0xB9C5 ^ 0xB963;
        CommandFixModule.e[0xF850 ^ 0xF92A] = 0xF926 ^ 0xF92A;
        CommandFixModule.e[0x9353 ^ 0x93DB] = 0x93E0 ^ 0x93DB;
        CommandFixModule.e[0xA7C9 ^ 0xA71A] = 0xFFFF58D5 ^ 0xA71A;
        CommandFixModule.e[0xBCAF ^ 0xBCE5] = 0xFFFF4373 ^ 0xBCE5;
        CommandFixModule.e[0x9F5D ^ 0x9E47] = 0x9E47 ^ 0x9E47;
        CommandFixModule.e[0xEA37 ^ 0xEB0A] = 0xEB72 ^ 0xEB0A;
        CommandFixModule.e[0xCCED ^ 0xCD8A] = 0xFFFF322E ^ 0xCD8A;
        CommandFixModule.e[0x1056E ^ 0x1056A] = 0x1053A ^ 0x1056A;
        CommandFixModule.e[0x5C53 ^ 0x5C36] = 0xFFFFA3D7 ^ 0x5C36;
        CommandFixModule.e[0x4A2B ^ 0x4B28] = 0xFFFFB4E8 ^ 0x4B28;
        CommandFixModule.e[0xEA5D ^ 0xEB17] = 0xFFFF14DA ^ 0xEB17;
        CommandFixModule.e[0x9F7D ^ 0x9FD7] = 0xFFFF600D ^ 0x9FD7;
        CommandFixModule.e[0x3CF0 ^ 0x3DCA] = 0xFFFFC249 ^ 0x3DCA;
        CommandFixModule.e[0x33C1 ^ 0x3241] = 0x3240 ^ 0x3241;
        CommandFixModule.e[0x1014E ^ 0x10191] = 0xFFFEFE06 ^ 0x10191;
        CommandFixModule.e[0x4FF0 ^ 0x4EBC] = 0xFFFFB14F ^ 0x4EBC;
        CommandFixModule.e[0xF4CA ^ 0xF4BA] = 0xFFFF0B19 ^ 0xF4BA;
        CommandFixModule.e[0x73F1 ^ 0x72E3] = 0x72E8 ^ 0x72E3;
        CommandFixModule.e[0x93B0 ^ 0x939C] = 0x9394 ^ 0x939C;
        CommandFixModule.e[0xCE26 ^ 0xCFA8] = 0xDAD ^ 0xCFA8;
        CommandFixModule.e[0x4480 ^ 0x44A2] = 0xFFFFBB7C ^ 0x44A2;
        CommandFixModule.e[0x7A22 ^ 0x7A08] = 0xFFFF85DC ^ 0x7A08;
        CommandFixModule.e[0x2A43 ^ 0x2AB6] = 0x2AE8 ^ 0x2AB6;
        CommandFixModule.e[0x4F6D ^ 0x4FD7] = 0xFFFFB087 ^ 0x4FD7;
        CommandFixModule.e[0xF3B8 ^ 0xF34C] = 0xF350 ^ 0xF34C;
        CommandFixModule.e[0x1C2B ^ 0x1C4C] = 0xFFFFE38D ^ 0x1C4C;
    }
}

