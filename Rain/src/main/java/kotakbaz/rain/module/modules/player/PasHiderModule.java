/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.player;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\u0012\u0010\fJ#\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010 \u00a8\u0006\""}, d2={"Lkotakbaz/rain/module/modules/player/PasHiderModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "shouldMask", "()Z", "", "message", "isSensitivePrefix", "(Ljava/lang/String;)Z", "maskIfSensitive", "(Ljava/lang/String;)Ljava/lang/String;", "maskForHistory", "", "", "findSensitiveRanges", "(Ljava/lang/String;)Ljava/util/List;", "restoreOriginalIfMasked", "useAsterisks", "maskSensitive", "(Ljava/lang/String;Z)Ljava/lang/String;", "", "start", "findNextCommandStart", "(Ljava/lang/String;I)I", "commandLength", "isRegisterCommand", "(Ljava/lang/String;II)Z", "getCommandLength", "", "registerCommands", "Ljava/util/Set;", "supportedCommands", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nPasHiderModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PasHiderModule.kt\nkotakbaz/rain/module/modules/player/PasHiderModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,160:1\n1807#2,3:161\n*S KotlinDebug\n*F\n+ 1 PasHiderModule.kt\nkotakbaz/rain/module/modules/player/PasHiderModule\n*L\n21#1:161,3\n*E\n"})
public final class PasHiderModule
extends Module {
    @NotNull
    public static final PasHiderModule INSTANCE;
    @NotNull
    private static final Set<String> a;
    @NotNull
    private static final Set<String> A;
    private static Object[] b;
    private static Object c;
    private static Object[] C;
    private static Object[] B;
    private static Object[] d;
    public static int[] D;

    private PasHiderModule() {
        int n2 = D[0];
        n2 -= D[1];
        int n3 = D[3];
        n3 ^= D[4];
        int n4 = D[6];
        n4 += D[7];
        super((String)b[n2 += D[2]], a_0.getPLAYER(), (String)b[n3 ^= D[5]] + (String)b[n4 ^= D[8]]);
    }

    public final boolean shouldMask() {
        return this.isEnabled();
    }

    public final boolean isSensitivePrefix(@Nullable String message) {
        int n2;
        block4: {
            long l2 = 3543813177758950698L;
            if (message == null) {
                boolean bl = D[9];
                bl -= D[10];
                return bl -= D[11];
            }
            Iterable iterable = A;
            long l3 = l2;
            int n3 = D[12];
            n3 -= D[13];
            l2 = l3 ^ (0L ^ l3) & -1L << (n3 ^= D[14]);
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                int n4 = D[15];
                n4 -= D[16];
                n2 = n4 ^= D[17];
            } else {
                for (Object t2 : iterable) {
                    String string = (String)t2;
                    long l4 = l2;
                    int n5 = D[18];
                    n5 += D[19];
                    l2 = l4 ^ (0L ^ l4) & -1L >>> (n5 -= D[20]);
                    String string2 = ((Object)StringsKt.trim((CharSequence)message)).toString();
                    Locale locale = Locale.ROOT;
                    int n6 = D[21];
                    n6 ^= D[22];
                    Intrinsics.checkNotNullExpressionValue(locale, (String)b[n6 -= D[23]]);
                    String string3 = string2.toLowerCase(locale);
                    int n7 = D[24];
                    n7 += D[25];
                    int n8 = D[27];
                    n8 -= D[28];
                    Intrinsics.checkNotNullExpressionValue(string3, (String)b[n7 ^= D[26]] + (String)b[n8 ^= D[29]]);
                    String string4 = string;
                    int n9 = D[30];
                    n9 += D[31];
                    boolean bl = D[33];
                    bl -= D[34];
                    int n10 = D[36];
                    n10 += D[37];
                    if (!StringsKt.startsWith$default(string3, string4 + (String)b[n9 ^= D[32]], bl -= D[35], n10 -= D[38], null)) continue;
                    int n11 = D[39];
                    n11 ^= D[40];
                    n2 = n11 ^= D[41];
                    break block4;
                }
                int n12 = D[42];
                n12 -= D[43];
                n2 = n12 ^= D[44];
            }
        }
        return n2 != 0;
    }

    @Nullable
    public final String maskIfSensitive(@Nullable String message) {
        boolean bl = D[45];
        bl += D[46];
        return this.maskSensitive(message, bl -= D[47]);
    }

    @Nullable
    public final String maskForHistory(@Nullable String message) {
        boolean bl = D[48];
        bl += D[49];
        return this.maskSensitive(message, bl ^= D[50]);
    }

    @NotNull
    public final List<int[]> findSensitiveRanges(@Nullable String message) {
        int n2;
        long l2 = -7563737434345133100L;
        long l3 = 827159449740660705L;
        long l4 = -4459532652939928295L;
        long l5 = -2294825758988996435L;
        long l6 = 8438845152314067800L;
        long l7 = 5117763598656834226L;
        long l8 = 1149420690892563107L;
        long l9 = -1870266786156025002L;
        long l10 = -4971830685945748191L;
        long l11 = 1110873662313251640L;
        long l12 = -4121162706661953755L;
        long l13 = 7515860945620752992L;
        long l14 = -3963736427297200004L;
        long l15 = 39334575217824696L;
        long l16 = -8984955444060686586L;
        long l17 = 248240585236165563L;
        long l18 = 8562275790962247303L;
        long l19 = 4951049974600801900L;
        long l20 = -1064744285501949505L;
        long l21 = 5990830008309973128L;
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence = message;
        if (charSequence == null || charSequence.length() == 0) {
            int n3 = D[51];
            n3 ^= D[52];
            n2 = n3 ^= D[53];
        } else {
            int n4 = D[54];
            n4 ^= D[55];
            n2 = n4 ^= D[56];
        }
        if (n2 != 0) {
            return arrayList;
        }
        long l22 = l17;
        int n5 = D[57];
        n5 += D[58];
        l17 = l22 ^ (0L ^ l22) & -1L >>> (n5 ^= D[59]);
        while ((int)l17 < message.length()) {
            int n6;
            int n7 = D[60];
            n7 ^= D[61];
            long l23 = l20;
            int n8 = D[63];
            n8 ^= D[64];
            l20 = l23 ^ ((long)this.findNextCommandStart(message, (int)l17) << (n7 ^= D[62]) ^ l23) & -1L << (n8 -= D[65]);
            int n9 = D[66];
            n9 ^= D[67];
            if ((int)(l20 >>> (n9 ^= D[68])) < 0) break;
            int n10 = D[69];
            n10 ^= D[70];
            long l24 = l20;
            int n11 = D[72];
            n11 += D[73];
            if ((int)(l20 = l24 ^ ((long)this.getCommandLength(message, (int)(l20 >>> (n10 += D[71]))) ^ l24) & -1L >>> (n11 ^= D[74])) == 0) {
                int n12 = D[75];
                n12 ^= D[76];
                n12 += D[77];
                int n13 = D[78];
                n13 ^= D[79];
                long l25 = l17;
                int n14 = D[81];
                n14 ^= D[82];
                l17 = l25 ^ ((long)((int)(l20 >>> n12) + (n13 -= D[80])) ^ l25) & -1L >>> (n14 += D[83]);
                continue;
            }
            int n15 = D[84];
            n15 ^= D[85];
            if (this.isRegisterCommand(message, (int)(l20 >>> (n15 -= D[86])), (int)l20)) {
                int n16 = D[87];
                n16 ^= D[88];
                n6 = n16 -= D[89];
            } else {
                int n17 = D[90];
                n17 -= D[91];
                n6 = n17 -= D[92];
            }
            int n18 = D[93];
            n18 += D[94];
            long l26 = l19;
            int n19 = D[96];
            n19 -= D[97];
            l19 = l26 ^ ((long)n6 << (n18 -= D[95]) ^ l26) & -1L << (n19 += D[98]);
            long l27 = l21;
            int n20 = D[99];
            n20 ^= D[100];
            l21 = l27 ^ (0L ^ l27) & -1L << (n20 ^= D[101]);
            int n21 = D[102];
            n21 += D[103];
            n21 += D[104];
            int n22 = D[105];
            n22 ^= D[106];
            long l28 = l21;
            int n23 = D[108];
            n23 ^= D[109];
            long l29 = l21 = l28 ^ ((long)((int)(l20 >>> n21) + (int)l20) << (n22 -= D[107]) ^ l28) & -1L << (n23 += D[110]);
            int n24 = D[111];
            n24 += D[112];
            l21 = l29 ^ (0L ^ l29) & -1L >>> (n24 ^= D[113]);
            while (true) {
                int n25 = D[114];
                n25 += D[115];
                if ((int)l21 >= (int)(l19 >>> (n25 ^= D[116]))) break;
                long l30 = l3;
                int n26 = D[117];
                n26 ^= D[118];
                l3 = l30 ^ ((long)((int)l21) ^ l30) & -1L >>> (n26 -= D[119]);
                long l31 = l4;
                int n27 = D[120];
                n27 -= D[121];
                l4 = l31 ^ (0L ^ l31) & -1L << (n27 += D[122]);
                while (true) {
                    int n28 = D[123];
                    n28 += D[124];
                    if ((int)(l21 >>> (n28 += D[125])) >= message.length()) break;
                    int n29 = D[126];
                    n29 -= D[127];
                    if (!CharsKt.isWhitespace(message.charAt((int)(l21 >>> (n29 += D[128]))))) break;
                    int n30 = D[129];
                    n30 += D[130];
                    n30 ^= D[131];
                    int n31 = D[132];
                    n31 -= D[133];
                    n31 ^= D[134];
                    int n32 = D[135];
                    n32 ^= D[136];
                    long l32 = l21;
                    int n33 = D[138];
                    n33 ^= D[139];
                    l21 = l32 ^ ((long)((int)(l21 >>> n30) + n31) << (n32 -= D[137]) ^ l32) & -1L << (n33 += D[140]);
                }
                int n34 = D[141];
                n34 -= D[142];
                long l33 = l12;
                int n35 = D[144];
                n35 ^= D[145];
                l12 = l33 ^ ((long)((int)(l21 >>> (n34 -= D[143]))) ^ l33) & -1L >>> (n35 -= D[146]);
                while (true) {
                    int n36 = D[147];
                    n36 += D[148];
                    if ((int)(l21 >>> (n36 ^= D[149])) >= message.length()) break;
                    int n37 = D[150];
                    n37 ^= D[151];
                    if (CharsKt.isWhitespace(message.charAt((int)(l21 >>> (n37 -= D[152]))))) break;
                    int n38 = D[153];
                    n38 ^= D[154];
                    n38 -= D[155];
                    int n39 = D[156];
                    n39 += D[157];
                    n39 ^= D[158];
                    int n40 = D[159];
                    n40 ^= D[160];
                    long l34 = l21;
                    int n41 = D[162];
                    n41 ^= D[163];
                    l21 = l34 ^ ((long)((int)(l21 >>> n38) + n39) << (n40 -= D[161]) ^ l34) & -1L << (n41 += D[164]);
                }
                int n42 = D[165];
                n42 -= D[166];
                if ((int)l12 != (int)(l21 >>> (n42 += D[167]))) {
                    Collection collection = arrayList;
                    int n43 = D[168];
                    n43 -= D[169];
                    int[] nArray = new int[n43 += D[170]];
                    int n44 = D[171];
                    n44 -= D[172];
                    nArray[n44 += PasHiderModule.D[173]] = (int)l12;
                    int n45 = D[174];
                    n45 -= D[175];
                    int n46 = D[177];
                    n46 += D[178];
                    nArray[n45 += PasHiderModule.D[176]] = (int)(l21 >>> (n46 ^= D[179]));
                    collection.add(nArray);
                }
                long l35 = l21;
                int n47 = D[180];
                n47 += D[181];
                int n48 = D[183];
                n48 ^= D[184];
                l21 = l35 ^ (l35 ^ l35 + (long)(n47 -= D[182])) & -1L >>> (n48 ^= D[185]);
            }
            int n49 = D[186];
            n49 -= D[187];
            long l36 = l17;
            int n50 = D[189];
            n50 += D[190];
            l17 = l36 ^ ((long)((int)(l21 >>> (n49 -= D[188]))) ^ l36) & -1L >>> (n50 -= D[191]);
        }
        return arrayList;
    }

    @Nullable
    public final String restoreOriginalIfMasked(@Nullable String message) {
        return message;
    }

    private final String maskSensitive(String message, boolean useAsterisks) {
        long l2 = 8018240299767404727L;
        long l3 = 2370326165975570430L;
        long l4 = -3742297926525988771L;
        long l5 = 8032997019643252638L;
        long l6 = -961668422467037357L;
        long l7 = 8539846190572049L;
        long l8 = -7068213563654845437L;
        long l9 = -8051905291843635191L;
        long l10 = 4206794730319765494L;
        long l11 = 3010258656050787768L;
        long l12 = -5283067291329403802L;
        long l13 = -8120498176703730811L;
        long l14 = 1873122014742318097L;
        long l15 = 1959403856450870781L;
        long l16 = 2048989978175370831L;
        long l17 = 5998518992782678279L;
        long l18 = -2000139403073398938L;
        long l19 = -8011021519374319012L;
        long l20 = 240743272632209949L;
        long l21 = 4914045484914302773L;
        long l22 = 945903255160116878L;
        long l23 = -6355034887022706363L;
        long l24 = -5588228699296818624L;
        long l25 = -3728284132003410199L;
        long l26 = 8938547895499783541L;
        long l27 = 2650225136599341725L;
        long l28 = -7463005267771854401L;
        long l29 = -8223342682509574734L;
        long l30 = 245904839716320728L;
        long l31 = -2794721572707915203L;
        long l32 = -5054899544695571789L;
        long l33 = 7663654513763264594L;
        if (message == null) {
            return null;
        }
        int n2 = D[192];
        n2 ^= D[193];
        StringBuilder stringBuilder = new StringBuilder(message.length() + (n2 += D[194]));
        long l34 = l11;
        int n3 = D[195];
        n3 -= D[196];
        l11 = l34 ^ (0L ^ l34) & -1L << (n3 ^= D[197]);
        long l35 = l19;
        int n4 = D[198];
        n4 ^= D[199];
        l19 = l35 ^ (0L ^ l35) & -1L >>> (n4 ^= D[200]);
        while ((int)l19 < message.length()) {
            int n5;
            long l36 = l21;
            int n6 = D[201];
            n6 ^= D[202];
            l21 = l36 ^ ((long)this.findNextCommandStart(message, (int)l19) ^ l36) & -1L >>> (n6 += D[203]);
            if ((int)l21 < 0) {
                stringBuilder.append(message, (int)l19, message.length());
                break;
            }
            int n7 = D[204];
            n7 ^= D[205];
            long l37 = l22;
            int n8 = D[207];
            n8 ^= D[208];
            l22 = l37 ^ ((long)this.getCommandLength(message, (int)l21) << (n7 -= D[206]) ^ l37) & -1L << (n8 ^= D[209]);
            int n9 = D[210];
            n9 += D[211];
            if ((int)(l22 >>> (n9 ^= D[212])) == 0) {
                int n10 = D[213];
                n10 ^= D[214];
                stringBuilder.append(message, (int)l19, (int)l21 + (n10 ^= D[215]));
                int n11 = D[216];
                n11 -= D[217];
                long l38 = l19;
                int n12 = D[219];
                n12 += D[220];
                l19 = l38 ^ ((long)((int)l21 + (n11 += D[218])) ^ l38) & -1L >>> (n12 ^= D[221]);
                continue;
            }
            int n13 = D[222];
            n13 -= D[223];
            if (this.isRegisterCommand(message, (int)l21, (int)(l22 >>> (n13 += D[224])))) {
                int n14 = D[225];
                n14 -= D[226];
                n5 = n14 -= D[227];
            } else {
                int n15 = D[228];
                n15 -= D[229];
                n5 = n15 += D[230];
            }
            int n16 = D[231];
            n16 ^= D[232];
            long l39 = l24;
            int n17 = D[234];
            n17 -= D[235];
            l24 = l39 ^ ((long)n5 << (n16 += D[233]) ^ l39) & -1L << (n17 ^= D[236]);
            int n18 = D[237];
            n18 ^= D[238];
            stringBuilder.append(message, (int)l19, (int)l21 + (int)(l22 >>> (n18 += D[239])));
            long l40 = l33;
            int n19 = D[240];
            n19 ^= D[241];
            l33 = l40 ^ (0L ^ l40) & -1L >>> (n19 -= D[242]);
            int n20 = D[243];
            n20 ^= D[244];
            long l41 = l33;
            int n21 = D[246];
            n21 -= D[247];
            l33 = l41 ^ ((long)((int)l21 + (int)(l22 >>> (n20 -= D[245]))) ^ l41) & -1L >>> (n21 += D[248]);
            long l42 = l24;
            int n22 = D[249];
            n22 -= D[250];
            l24 = l42 ^ (0L ^ l42) & -1L >>> (n22 ^= D[251]);
            while (true) {
                int n23 = D[252];
                n23 += D[253];
                if ((int)l24 >= (int)(l24 >>> (n23 += D[254]))) break;
                int n24 = D[255];
                n24 -= D[256];
                long l43 = l25;
                int n25 = D[258];
                n25 ^= D[259];
                long l44 = l25 = l43 ^ ((long)((int)l24) << (n24 += D[257]) ^ l43) & -1L << (n25 += D[260]);
                int n26 = D[261];
                n26 ^= D[262];
                l25 = l44 ^ (0L ^ l44) & -1L >>> (n26 += D[263]);
                int n27 = D[264];
                n27 ^= D[265];
                long l45 = l29;
                int n28 = D[267];
                n28 ^= D[268];
                l29 = l45 ^ ((long)((int)l33) << (n27 ^= D[266]) ^ l45) & -1L << (n28 -= D[269]);
                while ((int)l33 < message.length() && CharsKt.isWhitespace(message.charAt((int)l33))) {
                    int n29 = D[270];
                    n29 ^= D[271];
                    long l46 = l33;
                    int n30 = D[273];
                    n30 -= D[274];
                    l33 = l46 ^ ((long)((int)l33 + (n29 += D[272])) ^ l46) & -1L >>> (n30 ^= D[275]);
                }
                int n31 = D[276];
                n31 -= D[277];
                stringBuilder.append(message, (int)(l29 >>> (n31 -= D[278])), (int)l33);
                int n32 = D[279];
                n32 -= D[280];
                long l47 = l33;
                int n33 = D[282];
                n33 += D[283];
                l33 = l47 ^ ((long)((int)l33) << (n32 ^= D[281]) ^ l47) & -1L << (n33 += D[284]);
                while ((int)l33 < message.length() && !CharsKt.isWhitespace(message.charAt((int)l33))) {
                    int n34 = D[285];
                    n34 ^= D[286];
                    long l48 = l33;
                    int n35 = D[288];
                    n35 += D[289];
                    l33 = l48 ^ ((long)((int)l33 + (n34 += D[287])) ^ l48) & -1L >>> (n35 ^= D[290]);
                }
                int n36 = D[291];
                n36 ^= D[292];
                if ((int)(l33 >>> (n36 ^= D[293])) != (int)l33) {
                    if (useAsterisks) {
                        int n37 = D[294];
                        n37 ^= D[295];
                        long l49 = l4;
                        int n38 = D[297];
                        n38 ^= D[298];
                        l4 = l49 ^ ((long)((int)l33 - (int)(l33 >>> (n37 ^= D[296]))) ^ l49) & -1L >>> (n38 ^= D[299]);
                        long l50 = l6;
                        int n39 = D[300];
                        n39 -= D[301];
                        l6 = l50 ^ (0L ^ l50) & -1L >>> (n39 -= D[302]);
                        while ((int)l6 < (int)l4) {
                            long l51 = l5;
                            int n40 = D[303];
                            n40 += D[304];
                            l5 = l51 ^ ((long)((int)l6) ^ l51) & -1L >>> (n40 -= D[305]);
                            long l52 = l6;
                            int n41 = D[306];
                            n41 += D[307];
                            l6 = l52 ^ (0L ^ l52) & -1L << (n41 += D[308]);
                            char c2 = D[309];
                            c2 += D[310];
                            stringBuilder.append(c2 ^= D[311]);
                            long l53 = l6;
                            int n42 = D[312];
                            n42 -= D[313];
                            int n43 = D[315];
                            n43 ^= D[316];
                            l6 = l53 ^ (l53 ^ l53 + (long)(n42 -= D[314])) & -1L >>> (n43 += D[317]);
                        }
                    } else {
                        int n44 = D[318];
                        n44 ^= D[319];
                        stringBuilder.append((String)b[n44 += D[320]]);
                        int n45 = D[321];
                        n45 += D[322];
                        stringBuilder.append(message, (int)(l33 >>> (n45 += D[323])), (int)l33);
                        int n46 = D[324];
                        n46 += D[325];
                        stringBuilder.append((String)b[n46 ^= D[326]]);
                    }
                    long l54 = l11;
                    int n47 = D[327];
                    n47 += D[328];
                    l11 = l54 ^ (0x100000000L ^ l54) & -1L << (n47 -= D[329]);
                }
                long l55 = l24;
                int n48 = D[330];
                n48 += D[331];
                int n49 = D[333];
                n49 -= D[334];
                l24 = l55 ^ (l55 ^ l55 + (long)(n48 -= D[332])) & -1L >>> (n49 += D[335]);
            }
            long l56 = l19;
            int n50 = D[336];
            n50 -= D[337];
            l19 = l56 ^ ((long)((int)l33) ^ l56) & -1L >>> (n50 -= D[338]);
        }
        int n51 = D[339];
        n51 += D[340];
        return (int)(l11 >>> (n51 += D[341])) != 0 ? stringBuilder.toString() : message;
    }

    private final int findNextCommandStart(String message, int start) {
        long l2 = -189830457130203698L;
        long l3 = 6100643569707659890L;
        long l4 = -8021227414076119862L;
        long l5 = -6115924192563190463L;
        long l6 = -6953947741074979268L;
        int n2 = D[342];
        n2 ^= D[343];
        long l7 = l6;
        int n3 = D[345];
        n3 ^= D[346];
        l6 = l7 ^ ((long)start << (n2 += D[344]) ^ l7) & -1L << (n3 -= D[347]);
        long l8 = l3;
        int n4 = D[348];
        n4 ^= D[349];
        l3 = l8 ^ ((long)message.length() ^ l8) & -1L >>> (n4 += D[350]);
        while (true) {
            block3: {
                block4: {
                    int n5 = D[351];
                    n5 -= D[352];
                    if ((int)(l6 >>> (n5 ^= D[353])) >= (int)l3) break;
                    int n6 = D[354];
                    n6 += D[355];
                    int n7 = D[357];
                    n7 ^= D[358];
                    if (message.charAt((int)(l6 >>> (n6 ^= D[356]))) != (n7 += D[359])) break block3;
                    int n8 = D[360];
                    n8 ^= D[361];
                    if ((int)(l6 >>> (n8 -= D[362])) == 0) break block4;
                    int n9 = D[363];
                    n9 ^= D[364];
                    int n10 = D[366];
                    n10 += D[367];
                    if (!CharsKt.isWhitespace(message.charAt((int)(l6 >>> (n9 ^= D[365])) - (n10 ^= D[368])))) break block3;
                }
                int n11 = D[369];
                n11 ^= D[370];
                return (int)(l6 >>> (n11 -= D[371]));
            }
            l6 += 0x100000000L;
        }
        int n12 = D[372];
        n12 ^= D[373];
        return n12 += D[374];
    }

    private final boolean isRegisterCommand(String message, int start, int commandLength) {
        String string = message.substring(start, start + commandLength);
        int n2 = D[375];
        n2 += D[376];
        Intrinsics.checkNotNullExpressionValue(string, (String)b[n2 += D[377]]);
        String string2 = string;
        Locale locale = Locale.ROOT;
        int n3 = D[378];
        n3 -= D[379];
        Intrinsics.checkNotNullExpressionValue(locale, (String)b[n3 ^= D[380]]);
        String string3 = string2.toLowerCase(locale);
        int n4 = D[381];
        n4 -= D[382];
        int n5 = D[384];
        n5 ^= D[385];
        Intrinsics.checkNotNullExpressionValue(string3, (String)b[n4 ^= D[383]] + (String)b[n5 ^= D[386]]);
        return a.contains(string3);
    }

    private final int getCommandLength(String message, int start) {
        int n2;
        long l2 = -8385842707745851781L;
        long l3 = -1503784374482482235L;
        long l4 = -6874701824044030168L;
        int n3 = D[387];
        n3 ^= D[388];
        n3 += D[389];
        int n4 = D[390];
        n4 += D[391];
        long l5 = l4;
        int n5 = D[393];
        n5 -= D[394];
        l4 = l5 ^ ((long)(start + n3) << (n4 ^= D[392]) ^ l5) & -1L << (n5 -= D[395]);
        while (true) {
            int n6 = D[396];
            n6 ^= D[397];
            if ((int)(l4 >>> (n6 ^= D[398])) >= message.length()) break;
            int n7 = D[399];
            n7 += -26;
            if (!Character.isLetter(message.charAt((int)(l4 >>> (n7 -= 73))))) break;
            l4 += 0x100000000L;
        }
        int n8 = 75;
        n8 += 19;
        int n9 = -72;
        n9 ^= 0x4C;
        if ((int)(l4 >>> (n8 ^= 0x7E)) <= start + (n9 -= -13)) {
            int n10 = 89;
            n10 -= 18;
            return n10 ^= 0x47;
        }
        int n11 = -17;
        n11 += -10;
        String string = message.substring(start, (int)(l4 >>> (n11 += 59)));
        int n12 = -186;
        n12 -= -77;
        Intrinsics.checkNotNullExpressionValue(string, (String)b[n12 ^= 0xFFFFFF81]);
        String string2 = string;
        Locale locale = Locale.ROOT;
        int n13 = -116;
        n13 += 49;
        Intrinsics.checkNotNullExpressionValue(locale, (String)b[n13 += 79]);
        String string3 = string2.toLowerCase(locale);
        int n14 = 36;
        n14 -= -5;
        int n15 = -152;
        n15 -= -68;
        Intrinsics.checkNotNullExpressionValue(string3, (String)b[n14 += -38] + (String)b[n15 += 101]);
        String string4 = string3;
        if (A.contains(string4)) {
            n2 = string4.length();
        } else {
            int n16 = 112;
            n16 += -54;
            n2 = n16 ^= 0x3A;
        }
        return n2;
    }

    static {
        PasHiderModule.b();
        long l2 = 3579118225861765471L;
        long l3 = -2162474242908199665L;
        long l4 = 6193401708447933946L;
        long l5 = -3342325497286144153L;
        long l6 = -692650209795255993L;
        long l7 = 1388141495445918420L;
        long l8 = 2654623053293716178L;
        long l9 = 7416062708705939601L;
        long l10 = 4413322334470387286L;
        long l11 = -4109047281324325655L;
        long l12 = 4151566453758810444L;
        long l13 = -3021464474857447189L;
        long l14 = -3858087546766090812L;
        long l15 = 4323943125683833693L;
        int n2 = 78;
        n2 ^= 0x15;
        b = new Object[n2 -= 70];
        long l16 = l15;
        int n3 = 168;
        n3 += -97;
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= 39);
        Object[] objectArray = new Object[3];
        objectArray[0] = B;
        objectArray[1] = 0;
        Object object = PasHiderModule.A()[0];
        if (object == null) {
            char[] cArray = "\u5954\u5923\u5923\u5768\u5957\u576a\u594c\u58d8\u594c\u58e7\u576f\u5777\u5946\u5911\u5939\u593b\u576a\u5916\u58e2\u58e3\u576f\u5952\u5920\u576d\u5911\u5940\u594f\u594b\u5924\u5777\u5923\u5770\u576b\u5946\u5956\u5945\u5923\u5957\u5950\u5949\u58e6\u576c\u5775\u5776\u5956\u5911\u5951\u5769\u5943\u594d\u5924\u5951\u5950\u58d9\u5947\u5940\u5916\u5945\u5938\u5776\u5944\u5922\u5925\u5947\u591e\u58e5\u5923\u5942\u58db\u5925\u593b\u5956\u5953\u5952\u594b\u5944\u5773\u5770\u5938\u58e5\u5924\u576f\u58d8\u5948\u5777\u5772\u5952\u58e4\u5922\u5769\u576c\u5945\u58db\u58d9\u5924\u5944\u5908\u590a\u593e\u5925\u58e6\u590b\u5923\u593e\u594a\u5777\u5947\u58e3\u5939\u594a\u594a\u5908\u5773\u5957\u5946\u58e3\u5769\u5925\u5775\u5909\u5953\u5770\u594c\u5923\u5938\u590b\u5952\u5949\u5951\u593e\u5770\u5955\u594c\u593b\u590b\u5957\u594a\u5925\u5947\u5775\u58d9\u593e\u5954\u5950\u5951\u576a\u5951\u5939\u5773\u5952\u5777\u5922\u5955\u5925\u58db\u593e\u5923\u5953\u5923\u5943\u5908\u5943\u5955\u5951\u5772\u5948\u58d9\u58e4\u5920\u5948\u5920\u58d9\u576d\u5946\u590d\u5925\u591e\u5923\u5927\u5909\u5923\u58d8\u58d8\u593b\u5924\u5771\u5768\u5911\u58e4\u5911\u5927\u5951\u593b\u5909\u5909\u576f\u5925\u5772\u594d\u5775\u593b\u594d\u5908\u5925\u593b\u5772\u594c\u58e3\u594a\u5774\u593e\u58e3\u594a\u593e\u590b\u594f\u590d\u5938\u5940\u5938\u594b\u5946\u58d9\u576b\u5956\u5949\u58e3\u591e\u5908\u5777\u5943\u5945\u5776\u5771\u594b\u5943\u5777\u5946\u58e3\u594a\u58d8\u5943\u5938\u593e\u590b\u5946\u5942\u58d8\u593b\u5769\u5946\u5772\u5943\u594a\u5957\u5956\u5952\u5777\u5911\u594a\u5770\u58e2\u58e2\u5940\u5948\u58d8\u5949\u5916\u58e6\u5952\u5940\u5944\u5916\u5925\u5927\u594d\u58e5\u576b\u5771\u5777\u5916\u5940\u5770\u5952\u5771\u5938\u5776\u576c\u5950\u5951\u591e\u5775\u5942\u5925\u5769\u5909\u593e\u5771\u5951\u58df".toCharArray();
            for (int i2 = 0; i2 < 300; ++i2) {
                int n4 = cArray[i2];
                n4 += 13699;
                n4 += 31013;
                n4 ^= 0x7CE6;
                n4 -= 64776;
                n4 -= 15529;
                n4 ^= 0x292;
                n4 ^= 0x2FD6;
                n4 ^= 0x696;
                n4 ^= 0xE0B9;
                n4 ^= 0x935C;
                n4 += 31965;
                n4 += 44638;
                cArray[i2] = (char)(n4 ^= 0x44FF);
            }
            object = PasHiderModule.A()[0] = new String(cArray);
        }
        objectArray[2] = (String)object;
        char[] cArray = ((String)PasHiderModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n5 = 133;
        n5 -= 66;
        l6 = l17 ^ (0xB900000000L ^ l17) & -1L << (n5 ^= 0x63);
        long l18 = l13;
        int n6 = 85;
        n6 ^= 0xFFFFFFE7;
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n6 ^= 0xFFFFFF92);
        while (true) {
            int n7 = 47;
            n7 += -105;
            if ((int)l13 >= (int)(l6 >>> (n7 -= -90))) break;
            int n8 = (int)l13;
            long l19 = l13;
            int n9 = 196;
            n9 += -72;
            int n10 = -29;
            n10 -= 18;
            l13 = l19 ^ (l19 ^ l19 + (long)(n9 -= 123)) & -1L >>> (n10 -= -79);
            long l20 = l9;
            int n11 = -36;
            n11 += 25;
            l9 = l20 ^ ((long)cArray[n8] ^ l20) & -1L >>> (n11 ^= 0xFFFFFFD5);
            int n12 = (int)l13;
            long l21 = l13;
            int n13 = -173;
            n13 -= -111;
            int n14 = -185;
            n14 ^= 0xFFFFFFCF;
            l13 = l21 ^ (l21 ^ l21 + (long)(n13 += 63)) & -1L >>> (n14 -= 104);
            int n15 = 43;
            n15 += 35;
            long l22 = l10;
            int n16 = -103;
            n16 ^= 0x4B;
            l10 = l22 ^ ((long)cArray[n12] << (n15 -= 46) ^ l22) & -1L << (n16 += 78);
            int n17 = 96;
            n17 -= 65;
            n17 -= 15;
            int n18 = 103;
            n18 += -89;
            long l23 = l12;
            int n19 = 126;
            n19 ^= 0x12;
            l12 = l23 ^ ((long)((int)l9 << n17 | (int)(l10 >>> (n18 ^= 0x2E))) ^ l23) & -1L >>> (n19 -= 76);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n20 = 205;
            n20 += -67;
            l14 = l24 ^ (0L ^ l24) & -1L << (n20 += -106);
            while (true) {
                int n21 = 1;
                n21 ^= 0xFFFFFFFB;
                if ((int)(l14 >>> (n21 ^= 0xFFFFFFDA)) >= (int)l12) break;
                int n22 = 199;
                n22 -= 82;
                int n23 = 96;
                n23 += -79;
                cArray2[(int)(l14 >>> (n22 -= 85))] = cArray[(int)l13 + (int)(l14 >>> (n23 -= -15))];
                l14 += 0x100000000L;
            }
            int n24 = -235;
            n24 -= -109;
            int n25 = (int)(l15 >>> (n24 ^= 0xFFFFFFA2));
            l15 += 0x100000000L;
            PasHiderModule.b[n25] = new String(cArray2);
            long l25 = l13;
            int n26 = 4;
            n26 ^= 0xFFFFFFE5;
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n26 += 63);
        }
        INSTANCE = new PasHiderModule();
        int n27 = -80;
        n27 -= -2;
        String[] stringArray = new String[n27 ^= 0xFFFFFFB0];
        int n28 = -74;
        n28 -= -65;
        int n29 = 3;
        n29 -= 95;
        stringArray[n28 += 9] = (String)b[n29 -= -112];
        int n30 = 103;
        n30 -= 80;
        int n31 = -168;
        n31 -= -95;
        stringArray[n30 += -22] = (String)b[n31 ^= 0xFFFFFFB0];
        a = SetsKt.setOf(stringArray);
        int n32 = -18;
        n32 ^= 0xFFFFFF9F;
        stringArray = new String[n32 -= 111];
        int n33 = -53;
        n33 ^= 0x62;
        int n34 = 41;
        n34 += 81;
        stringArray[n33 -= -87] = (String)b[n34 += -107];
        int n35 = 205;
        n35 -= 111;
        int n36 = 34;
        n36 += 80;
        stringArray[n35 ^= 0x5F] = (String)b[n36 -= 98];
        A = SetsKt.plus(SetsKt.setOf(stringArray), (Iterable)a);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[1];
        String string = (String)object[2];
        object = object[0];
        Object[] objectArray = C;
        if (C == null) {
            objectArray = C = new Object[1];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[1];
                B = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[0x50ED ^ 0x50FD];
                byArray[0x2561 ^ 0x2568] = 0x2541 ^ 0x2568;
                byArray[0x3B1E ^ 0x3B11] = 0x3B22 ^ 0x3B11;
                byArray[0xE0BE ^ 0xE0BB] = 0xE09D ^ 0xE0BB;
                byArray[0x1005B ^ 0x1005D] = 0xFFFEFFC4 ^ 0x1005D;
                byArray[0x356E ^ 0x3565] = 0x3576 ^ 0x3565;
                byArray[0xC519 ^ 0xC515] = 0xFFFF3ACD ^ 0xC515;
                byArray[0x7CD9 ^ 0x7CD8] = 0xFFFF8377 ^ 0x7CD8;
                byArray[0x72EA ^ 0x72E2] = 0xFFFF8D54 ^ 0x72E2;
                byArray[0xD129 ^ 0xD12E] = 0xD122 ^ 0xD12E;
                byArray[0xDF16 ^ 0xDF18] = 0xFFFF2093 ^ 0xDF18;
                byArray[0xBE81 ^ 0xBE81] = 0xBECB ^ 0xBE81;
                byArray[0xAA44 ^ 0xAA46] = 0xFFFF55F9 ^ 0xAA46;
                byArray[0x3E67 ^ 0x3E6A] = 0xFFFFC1F3 ^ 0x3E6A;
                byArray[0xAA1C ^ 0xAA18] = 0xAA07 ^ 0xAA18;
                byArray[0xC945 ^ 0xC946] = 0xC97F ^ 0xC946;
                byArray[0x5E5D ^ 0x5E57] = 0xFFFFA1D8 ^ 0x5E57;
                objectArray2[0] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (c == null) {
                byte[] byArray2 = new byte[0xD43C ^ 0xD41C];
                byArray2[0xC20 ^ 0xC2D] = 0xFFFFF38D ^ 0xC2D;
                byArray2[0xD7D2 ^ 0xD7CD] = 0xFFFF2845 ^ 0xD7CD;
                byArray2[0x8FC3 ^ 0x8FD8] = 0xFFFF7060 ^ 0x8FD8;
                byArray2[0x2BDD ^ 0x2BD6] = 0x2BAD ^ 0x2BD6;
                byArray2[0xC686 ^ 0xC68F] = 0xC6E5 ^ 0xC68F;
                byArray2[0xA192 ^ 0xA192] = 0xFFFF5E78 ^ 0xA192;
                byArray2[0x10F3E ^ 0x10F23] = 0xFFFEF0EE ^ 0x10F23;
                byArray2[0xA9BB ^ 0xA9BE] = 0xFFFF567F ^ 0xA9BE;
                byArray2[0x2826 ^ 0x2834] = 0x2809 ^ 0x2834;
                byArray2[0x106C6 ^ 0x106C1] = 0x10686 ^ 0x106C1;
                byArray2[0x611 ^ 0x602] = 0xFFFFF9C2 ^ 0x602;
                byArray2[0xC8CE ^ 0xC8DA] = 0xC8C6 ^ 0xC8DA;
                byArray2[0x5FEB ^ 0x5FEF] = 0xFFFFA014 ^ 0x5FEF;
                byArray2[0x308A ^ 0x3096] = 0xFFFFCF30 ^ 0x3096;
                byArray2[0xD798 ^ 0xD794] = 0xFFFF2801 ^ 0xD794;
                byArray2[0x854B ^ 0x855C] = 0xFFFF7AA7 ^ 0x855C;
                byArray2[0x9AE4 ^ 0x9AFC] = 0x9AE9 ^ 0x9AFC;
                byArray2[0x10DFE ^ 0x10DFF] = 0xFFFEF223 ^ 0x10DFF;
                byArray2[0x8C72 ^ 0x8C7D] = 0xFFFF73C8 ^ 0x8C7D;
                byArray2[0x21D3 ^ 0x21C2] = 0x21E7 ^ 0x21C2;
                byArray2[0x1DE6 ^ 0x1DEC] = 0x1DF9 ^ 0x1DEC;
                byArray2[0x5498 ^ 0x549E] = 0x54A8 ^ 0x549E;
                byArray2[0x862B ^ 0x8632] = 0xFFFF79B9 ^ 0x8632;
                byArray2[0x7E86 ^ 0x7E96] = 0xFFFF815D ^ 0x7E96;
                byArray2[0x82CE ^ 0x82D4] = 0xFFFF7D6D ^ 0x82D4;
                byArray2[0xCB47 ^ 0xCB44] = 0xFFFF34BF ^ 0xCB44;
                byArray2[0xF893 ^ 0xF89B] = 0xF896 ^ 0xF89B;
                byArray2[0x108C5 ^ 0x108D3] = 0xFFFEF71C ^ 0x108D3;
                byArray2[0xB71D ^ 0xB71F] = 0xFFFF48CD ^ 0xB71F;
                byArray2[0x5F73 ^ 0x5F7D] = 0xFFFFA09B ^ 0x5F7D;
                byArray2[0x349C ^ 0x3489] = 0x34E4 ^ 0x3489;
                byArray2[0x93C9 ^ 0x93D7] = 0xFFFF6C6B ^ 0x93D7;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = PasHiderModule.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u9bad\u9b9f\u9b94\u9b99\u9b9b\u9bcf\ua2e8\ua2f2\ua2c9\ua2f5\u9b95\ua20e\ua2fa\ua2fc\u9bac\u9b95\u9b9a\u9bca".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= 0x3F71;
                        n3 += 37185;
                        n3 += 16609;
                        n3 += 45219;
                        n3 ^= 0xE824;
                        n3 ^= 0x4C79;
                        n3 += 14697;
                        n3 += 25145;
                        n3 -= 15307;
                        cArray[i2] = (char)(n3 += 7293);
                    }
                    object4 = PasHiderModule.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[6] = 26;
                byArray4[2] = 15;
                byArray4[7] = -78;
                byArray4[4] = -109;
                byArray4[9] = 81;
                byArray4[5] = 85;
                byArray4[3] = 18;
                byArray4[1] = 104;
                byArray4[8] = 121;
                byArray4[10] = -76;
                byArray4[15] = -30;
                byArray4[12] = -3;
                byArray4[14] = -96;
                byArray4[13] = -110;
                byArray4[11] = -119;
                byArray4[0] = -22;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 17, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = PasHiderModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u65eb\u65ff\u66a5".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 ^= 0x3762;
                        n4 -= 13349;
                        n4 ^= 0x9C6B;
                        n4 -= 29227;
                        n4 ^= 0x2BED;
                        n4 ^= 0x59CE;
                        n4 += 37583;
                        n4 += 46895;
                        n4 -= 27216;
                        n4 ^= 0x4D30;
                        n4 += 38577;
                        n4 += 51378;
                        n4 ^= 0xF036;
                        n4 ^= 0xC5D;
                        cArray[i3] = (char)(n4 += 27774);
                    }
                    object5 = PasHiderModule.A()[2] = new String(cArray);
                }
                c = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = PasHiderModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\ueb2a\ueb26\uea20\ueb14\ueb30\ueb2b\ueb30\ueb14\ueb35\ueb38\ueb30\uea20\ueaf6\ueb35\ueb4a\ueb51\ueb51\ueb52\ueb4f\ueb4c".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= 0x7001;
                    n5 += 5922;
                    n5 ^= 0xC043;
                    n5 += 58212;
                    n5 += 21221;
                    n5 += 64102;
                    n5 += 33991;
                    n5 ^= 0x7E8B;
                    n5 -= 48461;
                    n5 -= 53902;
                    n5 += 57109;
                    n5 += 55670;
                    n5 += 41626;
                    n5 -= 18235;
                    cArray[i4] = (char)(n5 ^= 0xDD5F);
                }
                object6 = PasHiderModule.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)c), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = d;
        if (d == null) {
            d = new Object[4];
            objectArray = d;
        }
        return objectArray;
    }

    public static void b() {
        D = new int[0x82AE ^ 0x833E];
        PasHiderModule.D[0xCC65 ^ 0xCD6F] = 0xCD31 ^ 0xCD6F;
        PasHiderModule.D[0xEBEC ^ 0xEB77] = 0xFFFF14CD ^ 0xEB77;
        PasHiderModule.D[0x84E ^ 0x850] = 0x870 ^ 0x850;
        PasHiderModule.D[0x4E9D ^ 0x4FA9] = 0xFFFFB069 ^ 0x4FA9;
        PasHiderModule.D[0x62F0 ^ 0x62E5] = 0x62F6 ^ 0x62E5;
        PasHiderModule.D[0x7A4B ^ 0x7A78] = 0xFFFF85C7 ^ 0x7A78;
        PasHiderModule.D[0x2DFC ^ 0x2D11] = 0xFFFFD2FB ^ 0x2D11;
        PasHiderModule.D[0x71FA ^ 0x71AD] = 0x7181 ^ 0x71AD;
        PasHiderModule.D[0xE0F5 ^ 0xE199] = 0xFFFF1E17 ^ 0xE199;
        PasHiderModule.D[0x7BE4 ^ 0x7B23] = 0xFFFF84A8 ^ 0x7B23;
        PasHiderModule.D[0xE3EA ^ 0xE3EA] = 0xE3E3 ^ 0xE3EA;
        PasHiderModule.D[0x817 ^ 0x8AA] = 0xFFFFF72C ^ 0x8AA;
        PasHiderModule.D[0xACC ^ 0xA39] = 0xA7A ^ 0xA39;
        PasHiderModule.D[0x42F1 ^ 0x4386] = 0x43EC ^ 0x4386;
        PasHiderModule.D[0xF11F ^ 0xF10C] = 0xF139 ^ 0xF10C;
        PasHiderModule.D[0x41E ^ 0x48F] = 0x4A7 ^ 0x48F;
        PasHiderModule.D[0x1E9E ^ 0x1FB5] = 0x1FA3 ^ 0x1FB5;
        PasHiderModule.D[0x6AD5 ^ 0x6A94] = 0x6ABB ^ 0x6A94;
        PasHiderModule.D[0x534F ^ 0x530F] = 0xFFFFACD0 ^ 0x530F;
        PasHiderModule.D[0xE947 ^ 0xE82F] = 0xE878 ^ 0xE82F;
        PasHiderModule.D[0x5B30 ^ 0x5A6B] = 0x5A27 ^ 0x5A6B;
        PasHiderModule.D[0xE7DA ^ 0xE6C0] = 0xE6D3 ^ 0xE6C0;
        PasHiderModule.D[0xE5F9 ^ 0xE598] = 0xFFFF1A55 ^ 0xE598;
        PasHiderModule.D[0x7B8A ^ 0x7BC2] = 0xFFFF8423 ^ 0x7BC2;
        PasHiderModule.D[0x4992 ^ 0x4939] = 0xFFFFB6A0 ^ 0x4939;
        PasHiderModule.D[0x5B79 ^ 0x5A71] = 0x5A3B ^ 0x5A71;
        PasHiderModule.D[0xA409 ^ 0xA458] = 0xA485 ^ 0xA458;
        PasHiderModule.D[0x23F2 ^ 0x23F1] = 0x23CB ^ 0x23F1;
        PasHiderModule.D[0xBDA3 ^ 0xBC8A] = 0xBCFC ^ 0xBC8A;
        PasHiderModule.D[0xC4EB ^ 0xC5D8] = 0xFFFF3A1F ^ 0xC5D8;
        PasHiderModule.D[0xE48 ^ 0xE2B] = 0xE4C ^ 0xE2B;
        PasHiderModule.D[0x2945 ^ 0x2909] = 0x2919 ^ 0x2909;
        PasHiderModule.D[0xFEA8 ^ 0xFFAB] = 0xFFFF0046 ^ 0xFFAB;
        PasHiderModule.D[0x9F32 ^ 0x9F71] = 0xFFFF60DC ^ 0x9F71;
        PasHiderModule.D[0x5C42 ^ 0x5C74] = 0xFFFFA3DF ^ 0x5C74;
        PasHiderModule.D[0xA2A6 ^ 0xA298] = 0xFFFF5D70 ^ 0xA298;
        PasHiderModule.D[0x6141 ^ 0x61D7] = 0x61C7 ^ 0x61D7;
        PasHiderModule.D[0xEE38 ^ 0xEE5C] = 0xEE47 ^ 0xEE5C;
        PasHiderModule.D[0x7861 ^ 0x7951] = 0xFFFF86AA ^ 0x7951;
        PasHiderModule.D[0xA28E ^ 0xA270] = 0xA254 ^ 0xA270;
        PasHiderModule.D[0x1118 ^ 0x1145] = 0x1176 ^ 0x1145;
        PasHiderModule.D[0xF671 ^ 0xF734] = 0xFFFF08AF ^ 0xF734;
        PasHiderModule.D[0x7D0C ^ 0x7D62] = 0x7D0C ^ 0x7D62;
        PasHiderModule.D[0x8EB ^ 0x8F1] = 0x8BE ^ 0x8F1;
        PasHiderModule.D[0xFE01 ^ 0xFE59] = 0xFFFF01E2 ^ 0xFE59;
        PasHiderModule.D[0x3073 ^ 0x3085] = 0x30DD ^ 0x3085;
        PasHiderModule.D[0xB8D1 ^ 0xB862] = 0xB866 ^ 0xB862;
        PasHiderModule.D[0xEC8E ^ 0xEC52] = 0xEC15 ^ 0xEC52;
        PasHiderModule.D[0xF6F9 ^ 0xF7F6] = 0xFFFF080A ^ 0xF7F6;
        PasHiderModule.D[0xD3E5 ^ 0xD397] = 0xD319 ^ 0xD397;
        PasHiderModule.D[0xF54D ^ 0xF45B] = 0xF401 ^ 0xF45B;
        PasHiderModule.D[0x8109 ^ 0x806D] = 0x8039 ^ 0x806D;
        PasHiderModule.D[0x47E4 ^ 0x475F] = 0x476D ^ 0x475F;
        PasHiderModule.D[0xBAB ^ 0xAA9] = 0xFFFFF52B ^ 0xAA9;
        PasHiderModule.D[0xF103 ^ 0xF023] = 0xFFFF0FE3 ^ 0xF023;
        PasHiderModule.D[0x95E4 ^ 0x94AB] = 0x94E4 ^ 0x94AB;
        PasHiderModule.D[0x4E97 ^ 0x4FF8] = 0x4FFB ^ 0x4FF8;
        PasHiderModule.D[0x5B6C ^ 0x5B37] = 0x5B01 ^ 0x5B37;
        PasHiderModule.D[0x8685 ^ 0x861B] = 0x8640 ^ 0x861B;
        PasHiderModule.D[0x103BF ^ 0x10379] = 0x10353 ^ 0x10379;
        PasHiderModule.D[0xBF6D ^ 0xBFA4] = 0xFFFF4024 ^ 0xBFA4;
        PasHiderModule.D[0x9F7D ^ 0x9E0E] = 0xFFFF61CC ^ 0x9E0E;
        PasHiderModule.D[0x5658 ^ 0x56F5] = 0xFFFFA907 ^ 0x56F5;
        PasHiderModule.D[0xF44 ^ 0xF9E] = 0xFFFFF002 ^ 0xF9E;
        PasHiderModule.D[0xCBEC ^ 0xCABC] = 0xFFFF3534 ^ 0xCABC;
        PasHiderModule.D[0x14B2 ^ 0x153B] = 0xFFFFEADC ^ 0x153B;
        PasHiderModule.D[0xD0E6 ^ 0xD04E] = 0xFFFF2F92 ^ 0xD04E;
        PasHiderModule.D[0xD6D6 ^ 0xD7FC] = 0xD7BC ^ 0xD7FC;
        PasHiderModule.D[0xF32D ^ 0xF378] = 0xFFFF0CE6 ^ 0xF378;
        PasHiderModule.D[0x67D4 ^ 0x66F1] = 0x66BA ^ 0x66F1;
        PasHiderModule.D[0xA425 ^ 0xA5A1] = 0xA5ED ^ 0xA5A1;
        PasHiderModule.D[0xADF7 ^ 0xAD57] = 0xFFFF52CD ^ 0xAD57;
        PasHiderModule.D[0x7117 ^ 0x71A0] = 0x71EF ^ 0x71A0;
        PasHiderModule.D[0xA27C ^ 0xA2E6] = 0xFFFF5D28 ^ 0xA2E6;
        PasHiderModule.D[0x562F ^ 0x5718] = 0x5717 ^ 0x5718;
        PasHiderModule.D[0x10247 ^ 0x10352] = 0xFFFEFCCE ^ 0x10352;
        PasHiderModule.D[0x8BD9 ^ 0x8AA2] = 0xFFFF7511 ^ 0x8AA2;
        PasHiderModule.D[0xFD33 ^ 0xFC1C] = 0xFFFF03F3 ^ 0xFC1C;
        PasHiderModule.D[0x7E2F ^ 0x7E2B] = 0xFFFF819E ^ 0x7E2B;
        PasHiderModule.D[0xDADA ^ 0xDBCB] = 0xFFFF241F ^ 0xDBCB;
        PasHiderModule.D[0xAB16 ^ 0xAB9F] = 0xABD8 ^ 0xAB9F;
        PasHiderModule.D[0xB108 ^ 0xB01A] = 0xFFFF4F90 ^ 0xB01A;
        PasHiderModule.D[0xDE98 ^ 0xDE3A] = 0xDE9E ^ 0xDE3A;
        PasHiderModule.D[0xD682 ^ 0xD6D0] = 0xD69D ^ 0xD6D0;
        PasHiderModule.D[0x7FC4 ^ 0x7F86] = 0xFFFF8062 ^ 0x7F86;
        PasHiderModule.D[0x1391 ^ 0x132E] = 0xFFFFECEE ^ 0x132E;
        PasHiderModule.D[0x9585 ^ 0x9408] = 0x9478 ^ 0x9408;
        PasHiderModule.D[0x5E1E ^ 0x5F52] = 0xFFFFA0C6 ^ 0x5F52;
        PasHiderModule.D[0xE890 ^ 0xE9EE] = 0xE9EF ^ 0xE9EE;
        PasHiderModule.D[0xFE2E ^ 0xFE89] = 0xFFFF0168 ^ 0xFE89;
        PasHiderModule.D[0xC43E ^ 0xC416] = 0xFFFF3B92 ^ 0xC416;
        PasHiderModule.D[0xF792 ^ 0xF7AD] = 0xFFFF083D ^ 0xF7AD;
        PasHiderModule.D[0xC486 ^ 0xC5E5] = 0xFFFF3A4A ^ 0xC5E5;
        PasHiderModule.D[0x21B6 ^ 0x21EF] = 0xFFFFDE7A ^ 0x21EF;
        PasHiderModule.D[0xC53F ^ 0xC5EF] = 0xFFFF3A61 ^ 0xC5EF;
        PasHiderModule.D[0xCBA8 ^ 0xCA27] = 0xCAA4 ^ 0xCA27;
        PasHiderModule.D[0xA3E5 ^ 0xA341] = 0xFFFF5CC0 ^ 0xA341;
        PasHiderModule.D[0x93BA ^ 0x939F] = 0x93C9 ^ 0x939F;
        PasHiderModule.D[0xBC44 ^ 0xBC81] = 0xFFFF4312 ^ 0xBC81;
        PasHiderModule.D[0x65E ^ 0x62F] = 0x674 ^ 0x62F;
        PasHiderModule.D[0xE8B0 ^ 0xE9C6] = 0xFFFF1677 ^ 0xE9C6;
        PasHiderModule.D[0x10EA5 ^ 0x10EA8] = 0x10EA3 ^ 0x10EA8;
        PasHiderModule.D[0x1953 ^ 0x193A] = 0x1957 ^ 0x193A;
        PasHiderModule.D[0xDBDE ^ 0xDB15] = 0xDB0C ^ 0xDB15;
        PasHiderModule.D[0x291 ^ 0x3FA] = 0xFFFFFC59 ^ 0x3FA;
        PasHiderModule.D[0x668C ^ 0x665F] = 0xFFFF9997 ^ 0x665F;
        PasHiderModule.D[0x68E7 ^ 0x68C5] = 0xFFFF9729 ^ 0x68C5;
        PasHiderModule.D[0x54C ^ 0x5B0] = 0xFFFFFA3C ^ 0x5B0;
        PasHiderModule.D[0x7819 ^ 0x7815] = 0xFFFF87EB ^ 0x7815;
        PasHiderModule.D[0x9F10 ^ 0x9FDD] = 0x9FAE ^ 0x9FDD;
        PasHiderModule.D[0xD023 ^ 0xD031] = 0xFFFF2FA1 ^ 0xD031;
        PasHiderModule.D[0x7301 ^ 0x73D3] = 0xFFFF8C1A ^ 0x73D3;
        PasHiderModule.D[0x36DD ^ 0x37D0] = 0xFFFFC855 ^ 0x37D0;
        PasHiderModule.D[0xC58F ^ 0xC574] = 0xFFFF3AB3 ^ 0xC574;
        PasHiderModule.D[0x2751 ^ 0x260F] = 0x2677 ^ 0x260F;
        PasHiderModule.D[0x656E ^ 0x6409] = 0x6464 ^ 0x6409;
        PasHiderModule.D[0xF5B2 ^ 0xF437] = 0xF43A ^ 0xF437;
        PasHiderModule.D[0x7E2D ^ 0x7EA3] = 0xFFFF8129 ^ 0x7EA3;
        PasHiderModule.D[0x1AE9 ^ 0x1BDC] = 0x1BD2 ^ 0x1BDC;
        PasHiderModule.D[0x74BF ^ 0x7535] = 0xFFFF8AE0 ^ 0x7535;
        PasHiderModule.D[0xEAEC ^ 0xEA03] = 0xEA26 ^ 0xEA03;
        PasHiderModule.D[0xD57F ^ 0xD460] = 0xD463 ^ 0xD460;
        PasHiderModule.D[0x2084 ^ 0x21C6] = 0xFFFFDE68 ^ 0x21C6;
        PasHiderModule.D[0x4ECB ^ 0x4E73] = 0xFFFFB1FB ^ 0x4E73;
        PasHiderModule.D[0x34A4 ^ 0x341A] = 0x3440 ^ 0x341A;
        PasHiderModule.D[0x2A84 ^ 0x2A1B] = 0x2A44 ^ 0x2A1B;
        PasHiderModule.D[0x9CDA ^ 0x9C7C] = 0xFFFF6383 ^ 0x9C7C;
        PasHiderModule.D[0x1465 ^ 0x15E5] = 0xFFFFEA38 ^ 0x15E5;
        PasHiderModule.D[0x3C0F ^ 0x3D18] = 0x3D11 ^ 0x3D18;
        PasHiderModule.D[0x57F4 ^ 0x56A1] = 0xFFFFA953 ^ 0x56A1;
        PasHiderModule.D[0x3B19 ^ 0x3BDA] = 0xFFFFC406 ^ 0x3BDA;
        PasHiderModule.D[0xAD82 ^ 0xADFB] = 0xADDB ^ 0xADFB;
        PasHiderModule.D[0x34BB ^ 0x35D9] = 0x351C ^ 0x35D9;
        PasHiderModule.D[0x14B1 ^ 0x15E0] = 0xFFFFEA26 ^ 0x15E0;
        PasHiderModule.D[0x26C0 ^ 0x2674] = 0x26EC ^ 0x2674;
        PasHiderModule.D[0x12DB ^ 0x12AB] = 0x12EC ^ 0x12AB;
        PasHiderModule.D[0x842C ^ 0x8435] = 0x8447 ^ 0x8435;
        PasHiderModule.D[0x2F92 ^ 0x2E8A] = 0x2E9E ^ 0x2E8A;
        PasHiderModule.D[0xF5CB ^ 0xF52F] = 0xF56E ^ 0xF52F;
        PasHiderModule.D[0x1043D ^ 0x10437] = 0xFFFEFB99 ^ 0x10437;
        PasHiderModule.D[0xE771 ^ 0xE639] = 0xE661 ^ 0xE639;
        PasHiderModule.D[0x88EF ^ 0x89BD] = 0xFFFF761F ^ 0x89BD;
        PasHiderModule.D[0xB105 ^ 0xB03B] = 0xB03E ^ 0xB03B;
        PasHiderModule.D[0x9C11 ^ 0x9D69] = 0x9D49 ^ 0x9D69;
        PasHiderModule.D[0xAE61 ^ 0xAF3B] = 0xAF28 ^ 0xAF3B;
        PasHiderModule.D[0x9B0D ^ 0x9B62] = 0x9B56 ^ 0x9B62;
        PasHiderModule.D[0x100BB ^ 0x10073] = 0xFFFEFFF2 ^ 0x10073;
        PasHiderModule.D[0x17F1 ^ 0x175F] = 0xFFFFE8EF ^ 0x175F;
        PasHiderModule.D[0x7E8C ^ 0x7E30] = 0xFFFF81B6 ^ 0x7E30;
        PasHiderModule.D[0xFD5A ^ 0xFD82] = 0xFD35 ^ 0xFD82;
        PasHiderModule.D[0xEF15 ^ 0xEF9D] = 0xFFFF1012 ^ 0xEF9D;
        PasHiderModule.D[0xA0A4 ^ 0xA0A1] = 0xFFFF5F25 ^ 0xA0A1;
        PasHiderModule.D[0xDC6F ^ 0xDD1E] = 0xDD73 ^ 0xDD1E;
        PasHiderModule.D[0x170C ^ 0x177B] = 0x1732 ^ 0x177B;
        PasHiderModule.D[0xDD90 ^ 0xDD49] = 0xDD1B ^ 0xDD49;
        PasHiderModule.D[0x10BC6 ^ 0x10B81] = 0x10BCE ^ 0x10B81;
        PasHiderModule.D[0x6326 ^ 0x6272] = 0x6247 ^ 0x6272;
        PasHiderModule.D[0xEE20 ^ 0xEEDF] = 0xEE91 ^ 0xEEDF;
        PasHiderModule.D[0x4A0A ^ 0x4B4A] = 0xFFFFB4F0 ^ 0x4B4A;
        PasHiderModule.D[0x4731 ^ 0x46BD] = 0x46D7 ^ 0x46BD;
        PasHiderModule.D[0xB064 ^ 0xB059] = 0xB06C ^ 0xB059;
        PasHiderModule.D[0x6050 ^ 0x616D] = 0x6166 ^ 0x616D;
        PasHiderModule.D[0x29D4 ^ 0x2971] = 0x294F ^ 0x2971;
        PasHiderModule.D[0x447D ^ 0x4438] = 0xFFFFBB8A ^ 0x4438;
        PasHiderModule.D[0x8832 ^ 0x88A6] = 0x88D4 ^ 0x88A6;
        PasHiderModule.D[0x64FA ^ 0x64B3] = 0x64A3 ^ 0x64B3;
        PasHiderModule.D[0x9452 ^ 0x946B] = 0x9473 ^ 0x946B;
        PasHiderModule.D[0xF025 ^ 0xF086] = 0xF0BD ^ 0xF086;
        PasHiderModule.D[0x618B ^ 0x61C6] = 0x619F ^ 0x61C6;
        PasHiderModule.D[0x80E9 ^ 0x80CD] = 0xFFFF7FB0 ^ 0x80CD;
        PasHiderModule.D[0x5835 ^ 0x5812] = 0x5866 ^ 0x5812;
        PasHiderModule.D[0x3F24 ^ 0x3E5E] = 0x3E43 ^ 0x3E5E;
        PasHiderModule.D[0x4B95 ^ 0x4BAF] = 0xFFFFB422 ^ 0x4BAF;
        PasHiderModule.D[0xCF25 ^ 0xCF4D] = 0xCF76 ^ 0xCF4D;
        PasHiderModule.D[0xEA47 ^ 0xEA2A] = 0xEA76 ^ 0xEA2A;
        PasHiderModule.D[0x6E1C ^ 0x6E08] = 0xFFFF91AD ^ 0x6E08;
        PasHiderModule.D[0xA2A0 ^ 0xA381] = 0xA3A2 ^ 0xA381;
        PasHiderModule.D[0x8EE8 ^ 0x8E12] = 0xFFFF718B ^ 0x8E12;
        PasHiderModule.D[0x52EE ^ 0x52DC] = 0xFFFFAD4D ^ 0x52DC;
        PasHiderModule.D[0x10D88 ^ 0x10D89] = 0xFFFEF21F ^ 0x10D89;
        PasHiderModule.D[0xD1F7 ^ 0xD1E7] = 0xFFFF2E3E ^ 0xD1E7;
        PasHiderModule.D[0x6C6D ^ 0x6D76] = 0x6D67 ^ 0x6D76;
        PasHiderModule.D[0x5611 ^ 0x569C] = 0x568D ^ 0x569C;
        PasHiderModule.D[0x1C1B ^ 0x1C44] = 0x1C7D ^ 0x1C44;
        PasHiderModule.D[0xD84D ^ 0xD8FD] = 0xD88B ^ 0xD8FD;
        PasHiderModule.D[0xAB9A ^ 0xAB92] = 0xFFFF5449 ^ 0xAB92;
        PasHiderModule.D[0x3340 ^ 0x323D] = 0x3219 ^ 0x323D;
        PasHiderModule.D[0x10CD7 ^ 0x10C40] = 0xFFFEF3FA ^ 0x10C40;
        PasHiderModule.D[0x1016 ^ 0x1177] = 0xFFFFEEC4 ^ 0x1177;
        PasHiderModule.D[0xADC5 ^ 0xAD40] = 0xAD49 ^ 0xAD40;
        PasHiderModule.D[0x93AF ^ 0x92CA] = 0xFFFF6D01 ^ 0x92CA;
        PasHiderModule.D[0xC587 ^ 0xC5A4] = 0xFFFF3A26 ^ 0xC5A4;
        PasHiderModule.D[0xDAC2 ^ 0xDA41] = 0xFFFF259B ^ 0xDA41;
        PasHiderModule.D[0x3A7B ^ 0x3A6A] = 0x3A6D ^ 0x3A6A;
        PasHiderModule.D[0x979 ^ 0x830] = 0x859 ^ 0x830;
        PasHiderModule.D[0x6757 ^ 0x665E] = 0x666A ^ 0x665E;
        PasHiderModule.D[0x3603 ^ 0x3675] = 0xFFFFC988 ^ 0x3675;
        PasHiderModule.D[0xD89D ^ 0xD87B] = 0xD869 ^ 0xD87B;
        PasHiderModule.D[0x9AD ^ 0x934] = 0x920 ^ 0x934;
        PasHiderModule.D[0xCC88 ^ 0xCDFA] = 0xFFFF3275 ^ 0xCDFA;
        PasHiderModule.D[0xDA3A ^ 0xDA14] = 0xFFFF2588 ^ 0xDA14;
        PasHiderModule.D[0xF141 ^ 0xF1AD] = 0xFFFF0E48 ^ 0xF1AD;
        PasHiderModule.D[0xD682 ^ 0xD6FE] = 0xFFFF2951 ^ 0xD6FE;
        PasHiderModule.D[0x75F3 ^ 0x74CC] = 0x748E ^ 0x74CC;
        PasHiderModule.D[0x10951 ^ 0x109E0] = 0xFFFEF612 ^ 0x109E0;
        PasHiderModule.D[0xB874 ^ 0xB8E7] = 0xFFFF47C8 ^ 0xB8E7;
        PasHiderModule.D[0x683E ^ 0x693F] = 0x6977 ^ 0x693F;
        PasHiderModule.D[0xFE36 ^ 0xFF5F] = 0xFF6E ^ 0xFF5F;
        PasHiderModule.D[0x7F39 ^ 0x7F12] = 0x7F3C ^ 0x7F12;
        PasHiderModule.D[0xE2B9 ^ 0xE33A] = 0xFFFF1C82 ^ 0xE33A;
        PasHiderModule.D[0xD47C ^ 0xD54A] = 0xD55D ^ 0xD54A;
        PasHiderModule.D[0xF7B5 ^ 0xF742] = 0xFFFF08FE ^ 0xF742;
        PasHiderModule.D[0x5E86 ^ 0x5FA2] = 0x5FD4 ^ 0x5FA2;
        PasHiderModule.D[0xE533 ^ 0xE4B2] = 0xFFFF1B15 ^ 0xE4B2;
        PasHiderModule.D[0xE662 ^ 0xE66D] = 0xFFFF198D ^ 0xE66D;
        PasHiderModule.D[0xCA53 ^ 0xCB57] = 0xFFFF34E6 ^ 0xCB57;
        PasHiderModule.D[0x793F ^ 0x7941] = 0xFFFF86EF ^ 0x7941;
        PasHiderModule.D[0xCAA5 ^ 0xCAD8] = 0xCAD7 ^ 0xCAD8;
        PasHiderModule.D[0x1520 ^ 0x15C2] = 0x15D1 ^ 0x15C2;
        PasHiderModule.D[0xC7D4 ^ 0xC75B] = 0xC73C ^ 0xC75B;
        PasHiderModule.D[0x44D6 ^ 0x4412] = 0x443B ^ 0x4412;
        PasHiderModule.D[0x4128 ^ 0x402D] = 0x4004 ^ 0x402D;
        PasHiderModule.D[0x51D9 ^ 0x5138] = 0x5112 ^ 0x5138;
        PasHiderModule.D[0x4CB0 ^ 0x4C41] = 0xFFFFB3CB ^ 0x4C41;
        PasHiderModule.D[0x19A4 ^ 0x18F3] = 0xFFFFE71A ^ 0x18F3;
        PasHiderModule.D[0x9E97 ^ 0x9EDD] = 0xFFFF610C ^ 0x9EDD;
        PasHiderModule.D[0xFFFA ^ 0xFF67] = 0xFFFF0099 ^ 0xFF67;
        PasHiderModule.D[0x8F7B ^ 0x8E3C] = 0x8E0D ^ 0x8E3C;
        PasHiderModule.D[0x732E ^ 0x73DD] = 0x73CE ^ 0x73DD;
        PasHiderModule.D[0x52F ^ 0x513] = 0xFFFFFAEE ^ 0x513;
        PasHiderModule.D[0x10547 ^ 0x104C9] = 0x104F3 ^ 0x104C9;
        PasHiderModule.D[0x248A ^ 0x24F9] = 0xFFFFDB37 ^ 0x24F9;
        PasHiderModule.D[0x8669 ^ 0x86BC] = 0x86A2 ^ 0x86BC;
        PasHiderModule.D[0x8B7E ^ 0x8BC7] = 0xFFFF7420 ^ 0x8BC7;
        PasHiderModule.D[0x271 ^ 0x2D0] = 0xFFFFFD75 ^ 0x2D0;
        PasHiderModule.D[0x69C0 ^ 0x6883] = 0x68B0 ^ 0x6883;
        PasHiderModule.D[0x4A2C ^ 0x4A96] = 0xFFFFB54E ^ 0x4A96;
        PasHiderModule.D[0xC4E8 ^ 0xC5F1] = 0xFFFF3A24 ^ 0xC5F1;
        PasHiderModule.D[0x2F91 ^ 0x2F1A] = 0xFFFFD0C0 ^ 0x2F1A;
        PasHiderModule.D[0x6BC ^ 0x630] = 0x60A ^ 0x630;
        PasHiderModule.D[0x18FC ^ 0x19CD] = 0xFFFFE607 ^ 0x19CD;
        PasHiderModule.D[0x4E3B ^ 0x4F19] = 0xFFFFB0DA ^ 0x4F19;
        PasHiderModule.D[0x37BB ^ 0x3746] = 0x3736 ^ 0x3746;
        PasHiderModule.D[0x1082F ^ 0x108F1] = 0xFFFEF713 ^ 0x108F1;
        PasHiderModule.D[0x79B0 ^ 0x7988] = 0x79EE ^ 0x7988;
        PasHiderModule.D[0x30E3 ^ 0x300B] = 0xFFFFCF86 ^ 0x300B;
        PasHiderModule.D[0x94A9 ^ 0x94CE] = 0xFFFF6B10 ^ 0x94CE;
        PasHiderModule.D[0x523A ^ 0x5215] = 0xFFFFAD9F ^ 0x5215;
        PasHiderModule.D[0x1749 ^ 0x1635] = 0x165A ^ 0x1635;
        PasHiderModule.D[0xDD5A ^ 0xDC37] = 0xDC3A ^ 0xDC37;
        PasHiderModule.D[0x1A8B ^ 0x1A22] = 0xFFFFE5D7 ^ 0x1A22;
        PasHiderModule.D[0x8CAD ^ 0x8C96] = 0xFFFF7313 ^ 0x8C96;
        PasHiderModule.D[0x109D9 ^ 0x1095B] = 0xFFFEF6E4 ^ 0x1095B;
        PasHiderModule.D[0x1068A ^ 0x10618] = 0x10601 ^ 0x10618;
        PasHiderModule.D[0x2B9D ^ 0x2BF7] = 0xFFFFD46C ^ 0x2BF7;
        PasHiderModule.D[0x30C6 ^ 0x31A8] = 0xFFFFCE3E ^ 0x31A8;
        PasHiderModule.D[0x4494 ^ 0x44A0] = 0xFFFFBB59 ^ 0x44A0;
        PasHiderModule.D[0xAF23 ^ 0xAF12] = 0xFFFF50BC ^ 0xAF12;
        PasHiderModule.D[0x6A21 ^ 0x6AE0] = 0x6AE8 ^ 0x6AE0;
        PasHiderModule.D[0xD90A ^ 0xD826] = 0xD840 ^ 0xD826;
        PasHiderModule.D[0x14FB ^ 0x15BF] = 0x1599 ^ 0x15BF;
        PasHiderModule.D[0xD56E ^ 0xD452] = 0xD47B ^ 0xD452;
        PasHiderModule.D[0x35FC ^ 0x35D1] = 0xFFFFCA3F ^ 0x35D1;
        PasHiderModule.D[0xB42C ^ 0xB4F8] = 0xFFFF4B49 ^ 0xB4F8;
        PasHiderModule.D[0x8E09 ^ 0x8EC3] = 0xFFFF7144 ^ 0x8EC3;
        PasHiderModule.D[0x1052E ^ 0x105EE] = 0x105FB ^ 0x105EE;
        PasHiderModule.D[0x3CFF ^ 0x3C6F] = 0x3C7E ^ 0x3C6F;
        PasHiderModule.D[0x630C ^ 0x6394] = 0xFFFF9C1E ^ 0x6394;
        PasHiderModule.D[0x682A ^ 0x6841] = 0xFFFF9797 ^ 0x6841;
        PasHiderModule.D[0xEAAE ^ 0xEBFD] = 0xFFFF1404 ^ 0xEBFD;
        PasHiderModule.D[0x75E6 ^ 0x7580] = 0x7587 ^ 0x7580;
        PasHiderModule.D[0xA27E ^ 0xA328] = 0xFFFF5C9A ^ 0xA328;
        PasHiderModule.D[0x252E ^ 0x243E] = 0x2423 ^ 0x243E;
        PasHiderModule.D[0xEB0A ^ 0xEBDC] = 0xFFFF1462 ^ 0xEBDC;
        PasHiderModule.D[0xB7EF ^ 0xB79A] = 0xFFFF480E ^ 0xB79A;
        PasHiderModule.D[0x1F09 ^ 0x1E0E] = 0xFFFFE1BB ^ 0x1E0E;
        PasHiderModule.D[0xBAF4 ^ 0xBAB0] = 0xBAD9 ^ 0xBAB0;
        PasHiderModule.D[0xB6E4 ^ 0xB601] = 0xB653 ^ 0xB601;
        PasHiderModule.D[0x4C1E ^ 0x4CA8] = 0x4CCD ^ 0x4CA8;
        PasHiderModule.D[0xCC39 ^ 0xCC1F] = 0xFFFF33CE ^ 0xCC1F;
        PasHiderModule.D[0x9258 ^ 0x9327] = 0x9304 ^ 0x9327;
        PasHiderModule.D[0x593C ^ 0x5923] = 0x592F ^ 0x5923;
        PasHiderModule.D[0x6241 ^ 0x62B3] = 0x62B8 ^ 0x62B3;
        PasHiderModule.D[0xEF64 ^ 0xEF78] = 0xEF20 ^ 0xEF78;
        PasHiderModule.D[0x307B ^ 0x310F] = 0x3136 ^ 0x310F;
        PasHiderModule.D[0x5BB2 ^ 0x5BFC] = 0xFFFFA425 ^ 0x5BFC;
        PasHiderModule.D[0xE8C1 ^ 0xE8C8] = 0xFFFF172C ^ 0xE8C8;
        PasHiderModule.D[0xCDB6 ^ 0xCCF8] = 0xCCDD ^ 0xCCF8;
        PasHiderModule.D[0x9085 ^ 0x9098] = 0x90E3 ^ 0x9098;
        PasHiderModule.D[0xF8C4 ^ 0xF8C2] = 0xF889 ^ 0xF8C2;
        PasHiderModule.D[0x12FE ^ 0x1230] = 0xFFFFEDF6 ^ 0x1230;
        PasHiderModule.D[0x11EB ^ 0x1177] = 0x112B ^ 0x1177;
        PasHiderModule.D[0x3475 ^ 0x340A] = 0x3408 ^ 0x340A;
        PasHiderModule.D[0xE2FA ^ 0xE3D4] = 0xE38E ^ 0xE3D4;
        PasHiderModule.D[0x6832 ^ 0x6824] = 0x6825 ^ 0x6824;
        PasHiderModule.D[0x7EB6 ^ 0x7E7A] = 0xFFFF81EF ^ 0x7E7A;
        PasHiderModule.D[0x21AC ^ 0x21C0] = 0xFFFFDE2E ^ 0x21C0;
        PasHiderModule.D[0xFA ^ 0x7A] = 0xE ^ 0x7A;
        PasHiderModule.D[0xEBD1 ^ 0xEB25] = 0xEB55 ^ 0xEB25;
        PasHiderModule.D[0x8F9A ^ 0x8F47] = 0x8F7B ^ 0x8F47;
        PasHiderModule.D[0x6ACD ^ 0x6BE5] = 0xFFFF9466 ^ 0x6BE5;
        PasHiderModule.D[0x84F5 ^ 0x8474] = 0x844F ^ 0x8474;
        PasHiderModule.D[0x5401 ^ 0x547B] = 0xFFFFABAF ^ 0x547B;
        PasHiderModule.D[0x51F2 ^ 0x5079] = 0xFFFFAF8B ^ 0x5079;
        PasHiderModule.D[0xA51E ^ 0xA5CF] = 0xFFFF5A2B ^ 0xA5CF;
        PasHiderModule.D[0xF7F0 ^ 0xF6CA] = 0xFFFF0942 ^ 0xF6CA;
        PasHiderModule.D[0x10A87 ^ 0x10AE7] = 0xFFFEF50D ^ 0x10AE7;
        PasHiderModule.D[0xAFAF ^ 0xAE94] = 0xAEA8 ^ 0xAE94;
        PasHiderModule.D[0x570D ^ 0x57E4] = 0x5781 ^ 0x57E4;
        PasHiderModule.D[0x5400 ^ 0x54F9] = 0xFFFFAB79 ^ 0x54F9;
        PasHiderModule.D[0x4745 ^ 0x471B] = 0x473D ^ 0x471B;
        PasHiderModule.D[0xC9F2 ^ 0xC9B4] = 0xC9D7 ^ 0xC9B4;
        PasHiderModule.D[0xF8F9 ^ 0xF813] = 0xFFFF07D7 ^ 0xF813;
        PasHiderModule.D[0x2AF0 ^ 0x2A32] = 0xFFFFD5C1 ^ 0x2A32;
        PasHiderModule.D[0xC661 ^ 0xC73D] = 0xFFFF38C5 ^ 0xC73D;
        PasHiderModule.D[0x5426 ^ 0x557F] = 0x5500 ^ 0x557F;
        PasHiderModule.D[0xF20E ^ 0xF224] = 0xFFFF0DCB ^ 0xF224;
        PasHiderModule.D[0x8759 ^ 0x86DB] = 0x86A5 ^ 0x86DB;
        PasHiderModule.D[0x10858 ^ 0x1096A] = 0x109F3 ^ 0x1096A;
        PasHiderModule.D[0x7962 ^ 0x79BD] = 0xFFFF8656 ^ 0x79BD;
        PasHiderModule.D[0x10EE0 ^ 0x10EBA] = 0x10E29 ^ 0x10EBA;
        PasHiderModule.D[0xA2A1 ^ 0xA281] = 0xA2BE ^ 0xA281;
        PasHiderModule.D[0x7CBE ^ 0x7C55] = 0xFFFF83AA ^ 0x7C55;
        PasHiderModule.D[0xF3A8 ^ 0xF32F] = 0xFFFF0CC7 ^ 0xF32F;
        PasHiderModule.D[0x93BC ^ 0x9234] = 0x9223 ^ 0x9234;
        PasHiderModule.D[0xFD26 ^ 0xFDC5] = 0xFDD0 ^ 0xFDC5;
        PasHiderModule.D[0x10734 ^ 0x1064D] = 0xFFFEF9C9 ^ 0x1064D;
        PasHiderModule.D[0xE678 ^ 0xE75E] = 0xE752 ^ 0xE75E;
        PasHiderModule.D[0x8B05 ^ 0x8A4F] = 0xFFFF75CA ^ 0x8A4F;
        PasHiderModule.D[0xEDB4 ^ 0xED21] = 0xFFFF12A0 ^ 0xED21;
        PasHiderModule.D[0x65AD ^ 0x642A] = 0x645B ^ 0x642A;
        PasHiderModule.D[0x5B90 ^ 0x5BCC] = 0x5B90 ^ 0x5BCC;
        PasHiderModule.D[0x3BAD ^ 0x3AA3] = 0x3ABB ^ 0x3AA3;
        PasHiderModule.D[0x103E7 ^ 0x1033C] = 0xFFFEFCE9 ^ 0x1033C;
        PasHiderModule.D[0xFF58 ^ 0xFF43] = 0xFF8D ^ 0xFF43;
        PasHiderModule.D[0x3654 ^ 0x3724] = 0xFFFFC8BC ^ 0x3724;
        PasHiderModule.D[0xE143 ^ 0xE01C] = 0xFFFF1F72 ^ 0xE01C;
        PasHiderModule.D[0xB04F ^ 0xB02A] = 0xB076 ^ 0xB02A;
        PasHiderModule.D[0xA5C8 ^ 0xA4D5] = 0xFFFF5B7A ^ 0xA4D5;
        PasHiderModule.D[0xBD5B ^ 0xBC7C] = 0xFFFF43D3 ^ 0xBC7C;
        PasHiderModule.D[0x943 ^ 0x9C7] = 0x9B1 ^ 0x9C7;
        PasHiderModule.D[0x9A52 ^ 0x9B27] = 0x9B50 ^ 0x9B27;
        PasHiderModule.D[0xD59 ^ 0xC4A] = 0xC20 ^ 0xC4A;
        PasHiderModule.D[0x809D ^ 0x807A] = 0x804C ^ 0x807A;
        PasHiderModule.D[0x87D ^ 0x85C] = 0xFFFFF732 ^ 0x85C;
        PasHiderModule.D[0xCB9E ^ 0xCB18] = 0xCB74 ^ 0xCB18;
        PasHiderModule.D[0x2090 ^ 0x21A9] = 0x21AD ^ 0x21A9;
        PasHiderModule.D[0xBA4E ^ 0xBB5A] = 0xBB4C ^ 0xBB5A;
        PasHiderModule.D[0x10CE0 ^ 0x10CB4] = 0xFFFEF31E ^ 0x10CB4;
        PasHiderModule.D[0x914E ^ 0x9156] = 0xFFFF6E85 ^ 0x9156;
        PasHiderModule.D[0x103A7 ^ 0x1028A] = 0xFFFEFD66 ^ 0x1028A;
        PasHiderModule.D[0xB026 ^ 0xB021] = 0xFFFF4FAF ^ 0xB021;
        PasHiderModule.D[0x8BFF ^ 0x8BA9] = 0x8BBD ^ 0x8BA9;
        PasHiderModule.D[0x9A92 ^ 0x9AEA] = 0x9A86 ^ 0x9AEA;
        PasHiderModule.D[0xE984 ^ 0xE974] = 0xFFFF16D5 ^ 0xE974;
        PasHiderModule.D[0x6D7 ^ 0x7B1] = 0x7B8 ^ 0x7B1;
        PasHiderModule.D[0x2212 ^ 0x2222] = 0xFFFFDDC0 ^ 0x2222;
        PasHiderModule.D[0x30A6 ^ 0x30B1] = 0x30B8 ^ 0x30B1;
        PasHiderModule.D[0x1911 ^ 0x1817] = 0x1855 ^ 0x1817;
        PasHiderModule.D[0x59DA ^ 0x5915] = 0x595F ^ 0x5915;
        PasHiderModule.D[0xF130 ^ 0xF071] = 0xF04E ^ 0xF071;
        PasHiderModule.D[0xA00C ^ 0xA043] = 0xFFFF5FEE ^ 0xA043;
        PasHiderModule.D[0xC602 ^ 0xC676] = 0xC60A ^ 0xC676;
        PasHiderModule.D[0x1A2C ^ 0x1B27] = 0xFFFFE4F7 ^ 0x1B27;
        PasHiderModule.D[0x5876 ^ 0x58DC] = 0x58C7 ^ 0x58DC;
        PasHiderModule.D[0x677E ^ 0x672E] = 0x675D ^ 0x672E;
        PasHiderModule.D[0x713E ^ 0x718B] = 0xFFFF8E45 ^ 0x718B;
        PasHiderModule.D[0xCCE8 ^ 0xCC06] = 0xCC17 ^ 0xCC06;
        PasHiderModule.D[0xFE20 ^ 0xFF20] = 0xFF56 ^ 0xFF20;
        PasHiderModule.D[0xF2D7 ^ 0xF29C] = 0xFFFF0D4B ^ 0xF29C;
        PasHiderModule.D[0x8A4E ^ 0x8A40] = 0xFFFF7593 ^ 0x8A40;
        PasHiderModule.D[0xD74E ^ 0xD652] = 0xFFFF29AE ^ 0xD652;
        PasHiderModule.D[0x369D ^ 0x3696] = 0x36A0 ^ 0x3696;
        PasHiderModule.D[0x5B11 ^ 0x5B6A] = 0x5B08 ^ 0x5B6A;
        PasHiderModule.D[0x2E1D ^ 0x2E97] = 0x2EAB ^ 0x2E97;
        PasHiderModule.D[0x8F8D ^ 0x8F5A] = 0xFFFF70FB ^ 0x8F5A;
        PasHiderModule.D[0xF79E ^ 0xF77E] = 0xF757 ^ 0xF77E;
        PasHiderModule.D[0x732F ^ 0x7264] = 0x7274 ^ 0x7264;
        PasHiderModule.D[0x109C0 ^ 0x109C2] = 0xFFFEF651 ^ 0x109C2;
        PasHiderModule.D[0x59B5 ^ 0x58B9] = 0x58CC ^ 0x58B9;
        PasHiderModule.D[0x83E5 ^ 0x83D2] = 0xFFFF7C1F ^ 0x83D2;
        PasHiderModule.D[0x1B01 ^ 0x1B28] = 0xFFFFE4D9 ^ 0x1B28;
        PasHiderModule.D[0x875A ^ 0x8607] = 0x8657 ^ 0x8607;
        PasHiderModule.D[0x4C4E ^ 0x4CE2] = 0xFFFFB369 ^ 0x4CE2;
        PasHiderModule.D[0xF514 ^ 0xF459] = 0xFFFF0BAF ^ 0xF459;
        PasHiderModule.D[0x8859 ^ 0x8947] = 0x8916 ^ 0x8947;
        PasHiderModule.D[0x101AF ^ 0x100CF] = 0xFFFEFF14 ^ 0x100CF;
        PasHiderModule.D[0x165D ^ 0x163F] = 0x163C ^ 0x163F;
        PasHiderModule.D[0x568F ^ 0x57E5] = 0x57A3 ^ 0x57E5;
        PasHiderModule.D[0xD1A8 ^ 0xD0F0] = 0xFFFF2F35 ^ 0xD0F0;
        PasHiderModule.D[0x1A26 ^ 0x1B1E] = 0xFFFFE493 ^ 0x1B1E;
        PasHiderModule.D[0x5ED1 ^ 0x5F57] = 0xFFFFA091 ^ 0x5F57;
        PasHiderModule.D[0x5F50 ^ 0x5FA8] = 0xFFFFA02C ^ 0x5FA8;
        PasHiderModule.D[0xE97B ^ 0xE957] = 0xFFFF1696 ^ 0xE957;
        PasHiderModule.D[0x3876 ^ 0x38C4] = 0x38F6 ^ 0x38C4;
        PasHiderModule.D[0xE8B7 ^ 0xE8E4] = 0xFFFF1774 ^ 0xE8E4;
        PasHiderModule.D[0x3F77 ^ 0x3F42] = 0x3F05 ^ 0x3F42;
        PasHiderModule.D[0x24E2 ^ 0x244D] = 0x2468 ^ 0x244D;
        PasHiderModule.D[0x57AC ^ 0x568F] = 0x5692 ^ 0x568F;
        PasHiderModule.D[0x5060 ^ 0x5126] = 0xFFFFAEEF ^ 0x5126;
    }
}

