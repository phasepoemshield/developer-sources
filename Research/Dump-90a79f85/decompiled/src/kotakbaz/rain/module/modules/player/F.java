/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_2561
 *  net.minecraft.class_634
 *  net.minecraft.class_746
 */
package kotakbaz.rain.module.modules.player;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.client.util.other.e_0;
import kotakbaz.rain.event.events.A;
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.restrict.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import net.minecraft.class_634;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a"}, d2={"Lkotakbaz/rain/module/modules/player/SearchHelperModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "Lkotakbaz/rain/event/events/ChatMessageEvent;", "event", "", "onChat", "(Lkotakbaz/rain/event/events/ChatMessageEvent;)V", "", "message", "", "isBareAhSearch", "(Ljava/lang/String;)Z", "Lnet/minecraft/class_1799;", "mainHand", "offHand", "getHeldItem", "(Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Lnet/minecraft/class_1799;", "Lnet/minecraft/class_2561;", "text", "sanitizeItemName", "(Lnet/minecraft/class_2561;)Ljava/lang/String;", "Lkotlin/text/Regex;", "lineBreakRegex", "Lkotlin/text/Regex;", "rain-visuals"})
public final class F
extends a_0 {
    @NotNull
    public static final F INSTANCE;
    @NotNull
    private static final Regex a;
    private static Object[] A;
    private static Object B;
    private static Object[] c;
    private static Object[] b;
    private static Object[] C;
    public static int[] d;

    private F() {
        int n = d[0];
        n -= d[1];
        int n2 = d[3];
        n2 ^= d[4];
        int n3 = d[6];
        n3 += d[7];
        super((String)A[n -= d[2]], kotakbaz.rain.client.extensions.a_0.getPLAYER(), (String)A[n2 ^= d[5]] + (String)A[n3 -= d[8]]);
    }

    @Commando
    public final void onChat(@NotNull A a2) {
        int n;
        int n2 = d[9];
        n2 ^= d[10];
        Intrinsics.checkNotNullParameter(a2, (String)A[n2 -= d[11]]);
        if (!a2.getSend()) {
            return;
        }
        if (!e_0.INSTANCE.isFunTime()) {
            return;
        }
        class_746 class_7462 = b_0.getMc().field_1724;
        if (class_7462 == null) {
            return;
        }
        class_746 class_7463 = class_7462;
        String string = a2.getText();
        if (!this.isBareAhSearch(string)) {
            return;
        }
        class_1799 class_17992 = class_7463.method_6047();
        int n3 = d[12];
        n3 += d[13];
        int n4 = d[15];
        n4 ^= d[16];
        Intrinsics.checkNotNullExpressionValue(class_17992, (String)A[n3 += d[14]] + (String)A[n4 ^= d[17]]);
        class_1799 class_17993 = class_7463.method_6079();
        int n5 = d[18];
        n5 += d[19];
        int n6 = d[21];
        n6 += d[22];
        Intrinsics.checkNotNullExpressionValue(class_17993, (String)A[n5 += d[20]] + (String)A[n6 -= d[23]]);
        class_1799 class_17994 = this.getHeldItem(class_17992, class_17993);
        if (class_17994 == null || class_17994.method_7960()) {
            int n7 = d[24];
            n7 ^= d[25];
            int n8 = d[27];
            n8 += d[28];
            kotakbaz.rain.command.A.INSTANCE.sendClientMessage((String)A[n7 -= d[26]] + (String)A[n8 ^= d[29]]);
            boolean bl = d[30];
            bl -= d[31];
            a2.setCancel(bl += d[32]);
            return;
        }
        class_2561 class_25612 = class_17994.method_7964();
        int n9 = d[33];
        n9 ^= d[34];
        Intrinsics.checkNotNullExpressionValue(class_25612, (String)A[n9 ^= d[35]]);
        String string2 = this.sanitizeItemName(class_25612);
        if (((CharSequence)string2).length() == 0) {
            int n10 = d[36];
            n10 -= d[37];
            n = n10 ^= d[38];
        } else {
            int n11 = d[39];
            n11 += d[40];
            n = n11 ^= d[41];
        }
        if (n != 0) {
            int n12 = d[42];
            n12 -= d[43];
            int n13 = d[45];
            n13 ^= d[46];
            kotakbaz.rain.command.A.INSTANCE.sendClientMessage((String)A[n12 += d[44]] + (String)A[n13 += d[47]]);
            boolean bl = d[48];
            bl += d[49];
            a2.setCancel(bl -= d[50]);
            return;
        }
        class_634 class_6342 = b_0.getMc().method_1562();
        if (class_6342 == null) {
            return;
        }
        class_634 class_6343 = class_6342;
        int n14 = d[51];
        n14 += d[52];
        boolean bl = d[54];
        bl -= d[55];
        int n15 = d[57];
        n15 ^= d[58];
        String string3 = StringsKt.replace$default(string2, (String)A[n14 ^= d[53]], "", bl += d[56], n15 -= d[59], null);
        int n16 = d[60];
        n16 -= d[61];
        class_6343.method_45730((String)A[n16 -= d[62]] + string3);
        boolean bl2 = d[63];
        bl2 += d[64];
        a2.setCancel(bl2 ^= d[65]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean isBareAhSearch(String string) {
        int n;
        int n2;
        long l = 1891847738331413162L;
        String string2 = ((Object)StringsKt.trim((CharSequence)string)).toString();
        if (((CharSequence)string2).length() == 0) {
            int n3 = d[66];
            n3 += d[67];
            n2 = n3 ^= d[68];
        } else {
            int n4 = d[69];
            n4 += d[70];
            n2 = n4 -= d[71];
        }
        if (n2 != 0) {
            boolean bl = d[72];
            bl ^= d[73];
            return bl ^= d[74];
        }
        Object object = string2;
        Locale locale = Locale.ROOT;
        int n5 = d[75];
        n5 ^= d[76];
        Intrinsics.checkNotNullExpressionValue(locale, (String)A[n5 -= d[77]]);
        String string3 = ((String)object).toLowerCase(locale);
        int n6 = d[78];
        n6 += d[79];
        int n7 = d[81];
        n7 += d[82];
        Intrinsics.checkNotNullExpressionValue(string3, (String)A[n6 ^= d[80]] + (String)A[n7 -= d[83]]);
        String string4 = string3;
        int n8 = d[84];
        n8 -= d[85];
        boolean bl = d[87];
        bl += d[88];
        int n9 = d[90];
        n9 ^= d[91];
        if (!StringsKt.startsWith$default(string4, (String)A[n8 ^= d[86]], bl += d[89], n9 -= d[92], null)) {
            boolean bl2 = d[93];
            bl2 += d[94];
            return bl2 += d[95];
        }
        CharSequence charSequence = string2;
        int n10 = d[96];
        n10 -= d[97];
        Regex regex = new Regex((String)A[n10 -= d[98]]);
        long l2 = l;
        int n11 = d[99];
        n11 += d[100];
        l = l2 ^ (0L ^ l2) & -1L << (n11 += d[101]);
        int n12 = d[102];
        n12 -= d[103];
        object = regex.split(charSequence, (int)(l >>> (n12 += d[104])));
        int n13 = d[105];
        n13 -= d[106];
        if (object.size() == (n13 -= d[107])) {
            int n14 = d[108];
            n14 += d[109];
            n14 -= d[110];
            int n15 = d[111];
            n15 -= d[112];
            boolean bl3 = d[114];
            bl3 ^= d[115];
            if (StringsKt.equals((String)object.get(n14), (String)A[n15 ^= d[113]], bl3 ^= d[116])) {
                int n16 = d[117];
                n16 -= d[118];
                n16 -= d[119];
                int n17 = d[120];
                n17 ^= d[121];
                boolean bl4 = d[123];
                bl4 ^= d[124];
                if (StringsKt.equals((String)object.get(n16), (String)A[n17 ^= d[122]], bl4 -= d[125])) {
                    int n18 = d[126];
                    n18 ^= d[127];
                    n = n18 += d[128];
                    return n != 0;
                }
            }
        }
        int n19 = d[129];
        n19 ^= d[130];
        n = n19 ^= d[131];
        return n != 0;
    }

    private final class_1799 getHeldItem(class_1799 class_17992, class_1799 class_17993) {
        if (!class_17992.method_7960()) {
            return class_17992;
        }
        if (!class_17993.method_7960()) {
            return class_17993;
        }
        return null;
    }

    private final String sanitizeItemName(class_2561 class_25612) {
        String string = class_25612.getString();
        int n = d[132];
        n -= d[133];
        Intrinsics.checkNotNullExpressionValue(string, (String)A[n -= d[134]]);
        CharSequence charSequence = ((Object)StringsKt.trim((CharSequence)string)).toString();
        Regex regex = a;
        int n2 = d[135];
        n2 += d[136];
        String string2 = (String)A[n2 -= d[137]];
        return ((Object)StringsKt.trim((CharSequence)regex.replace(charSequence, string2))).toString();
    }

    static {
        F.b();
        long l = -1564915970702183774L;
        long l2 = 8117820220943684291L;
        long l3 = 3297291576693530326L;
        long l4 = 6484532672881376753L;
        long l5 = 3244237376339110964L;
        long l6 = -8769402238668187670L;
        long l7 = 5435007975017977470L;
        long l8 = 92767083264591125L;
        long l9 = 3122249523259834841L;
        long l10 = 6267006029554910777L;
        long l11 = -2370657897394940000L;
        long l12 = 5454698823449580407L;
        long l13 = -6776330634346226572L;
        long l14 = 4113142450231816826L;
        int n = d[138];
        n -= d[139];
        A = new Object[n += d[140]];
        long l15 = l14;
        int n2 = d[141];
        n2 -= d[142];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 ^= d[143]);
        Object[] objectArray = new Object[d[144]];
        objectArray[F.d[145]] = b;
        objectArray[F.d[146]] = d[147];
        int n3 = d[148];
        Object object = F.A()[d[149]];
        if (object == null) {
            char[] cArray = "\u055c\u0588\u0572\u0533\u0560\u0574\u056e\u0560\u0570\u054f\u0573\u052e\u0549\u0552\u056d\u0586\u0561\u0532\u0553\u057f\u055e\u0546\u0589\u0586\u055c\u057d\u0530\u0566\u055b\u053b\u0589\u0562\u057d\u058a\u058a\u0546\u0562\u057e\u056e\u056c\u0563\u0569\u0565\u054f\u057f\u0532\u056f\u052e\u0564\u0561\u0563\u056e\u056b\u057c\u0532\u0570\u054e\u0568\u058c\u0552\u0584\u056f\u054f\u0550\u052e\u057c\u0588\u056e\u0545\u0534\u057f\u0532\u0545\u052d\u0589\u0550\u055e\u0585\u0549\u056d\u0567\u055b\u0586\u055f\u0582\u0588\u0553\u0572\u0560\u0568\u053b\u0545\u0545\u0550\u0564\u055f\u0530\u0574\u0586\u0574\u056e\u055e\u056e\u0568\u0545\u054d\u0571\u0585\u0583\u0546\u0569\u054f\u0551\u0583\u0571\u0589\u054e\u0589\u0566\u0571\u052f\u054d\u0571\u0567\u0580\u056d\u0564\u056d\u0569\u0570\u055d\u0580\u052e\u0574\u055c\u0552\u0530\u0563\u0580\u054d\u057c\u0566\u0563\u056a\u054d\u0554\u0534\u057b\u0582\u0552\u056a\u052f\u0564\u056e\u056c\u055c\u053b\u056c\u0570\u0554\u0568\u0551\u0580\u057e\u055d\u0580\u0570\u0581\u0546\u0561\u0530\u0571\u0581\u052e\u0550\u0586\u0531\u0545\u0570\u0568\u055d\u0563\u056c\u0567\u0560\u0566\u0570\u055b\u0552\u057f\u055c\u057e\u0550\u0586\u0554\u0570\u0566\u0552\u0581\u056e\u0549\u0546\u058c\u0549\u0554\u056d\u052f\u0567\u0573\u055e\u0586\u0585\u058b\u053b\u0564\u052f\u052e\u0570\u0534\u056c\u0584\u055f\u058c\u0546\u056e\u055c\u0565\u0550\u0553\u0581\u055f\u0553\u052d\u056b\u057e\u0530\u056a\u054f\u0563\u0582\u0582\u0545\u0545\u052e\u058c\u0561\u0563\u054e\u0582\u055f\u0588\u058a\u052d\u0573\u0566\u057c\u055b\u057d\u0549\u058a\u055d\u0546\u0534\u0550\u0546\u055c\u0561\u0570\u0532\u0574\u0580\u0589\u052d\u0533\u0551\u052f\u0569\u0554\u052e\u0531\u054d\u0549\u0581\u058a\u0574\u0554\u0573\u0551\u0564\u0561\u0531\u054e\u0572\u0581\u054d\u0583\u0546\u058a\u0574\u0570\u057f\u0589\u055f\u0566\u0532\u0562\u0572\u0553\u056a\u0563\u0566\u054d\u0551\u0563\u0571\u0550\u0581\u0546\u055b\u054e\u056b\u0563\u0582\u057d\u055c\u0550\u0587\u0549\u057b\u056d\u0573\u0554\u0563\u057c\u056a\u056e\u056a\u056a\u0564\u052e\u0586\u0582\u0546\u0563\u0574\u0573\u0571\u0569\u0545\u056b\u0580\u054f\u0561\u052f\u0561\u0582\u0572\u058c\u052d\u0566\u0565\u0564\u0545\u0534\u0580\u0562\u055d\u0572\u055f\u054f\u055b\u054d\u0571\u054d\u056a\u058c\u058a\u0553\u0568\u056b\u0561\u0587\u0582\u0569\u0572\u054e\u0589\u057e\u0587\u0572\u0581\u056e\u0550\u057c\u0582\u0561\u054f\u0546\u0554\u056d\u0562\u0554\u0589\u055f\u052f\u0586\u0583\u058c\u0564\u0546\u054d\u0566\u0550\u0586\u0566\u0554\u053b\u055e\u0552\u053b\u0568\u0530\u0565\u0546\u055d\u057d\u056f\u0550\u052d\u0530\u0574\u0562\u0571\u0573\u0531\u0570\u0564\u057d\u057d\u052d\u0586\u057d\u058c\u057c\u056e\u0550\u0551\u058b\u0571\u057f\u052e\u0553\u055b\u0561\u052f\u052f\u0563\u055b\u0546\u0546\u0573\u054d\u0569\u056d\u052e\u052e\u0583\u0587\u0573\u054d\u0545\u0530\u0571\u0581\u0560\u054f\u057b\u055f\u0530\u058a\u056f\u0549\u0580\u0531\u0588\u0550\u057b\u055e\u057b\u0567\u0589\u054d\u0554\u055d\u056b\u054e\u056e\u0550\u054f\u0550\u056f\u0553\u055b\u0574\u0560\u057c\u0568\u0563\u057f\u056f\u0567\u0554\u0585\u0564\u056c\u057e\u0531\u0587\u0551\u0573\u0534\u0530\u053b\u0550\u0585\u0587\u0574\u057c\u0549\u0587\u0573\u0588\u057d\u052f\u0589\u058a\u0588\u0568\u056c\u052f\u0584\u057e\u058b\u056d\u056b\u057b\u0580\u0589\u057b\u055b\u0581\u0554\u0567\u0574\u054d\u0561\u0561\u054f\u055f\u0562\u0530\u056c\u0589\u056a\u0569\u0554\u0549\u0532\u0550\u0569\u0580\u0532\u0532\u052e\u0570\u055b\u057f\u0581\u0532\u0564\u0565\u058b\u054d\u0571\u0550\u057b\u0583\u0570\u055b\u057b\u0549\u0550\u057d\u0534\u0585\u0561\u0562\u058b\u0581\u0560\u0545\u056d\u0534\u056e\u0534\u0545\u055c\u0563\u0554\u058b\u0574\u0562\u054d\u058b\u0568\u055c\u052d\u0567\u0546\u0537".toCharArray();
            for (int i2 = d[150]; i2 < d[151]; ++i2) {
                int n4 = cArray[i2];
                n4 += d[152];
                n4 += d[153];
                n4 += d[154];
                n4 -= d[155];
                n4 += d[156];
                n4 -= d[157];
                n4 += d[158];
                n4 -= d[159];
                n4 += d[160];
                n4 += d[161];
                n4 += d[162];
                n4 ^= d[163];
                n4 -= d[164];
                n4 += d[165];
                n4 -= d[166];
                cArray[i2] = (char)(n4 += d[167]);
            }
            object = F.A()[F.d[168]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)F.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = d[169];
        n5 ^= d[170];
        l5 = l16 ^ (0x14F00000000L ^ l16) & -1L << (n5 += d[171]);
        long l17 = l12;
        int n6 = d[172];
        n6 -= d[173];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= d[174]);
        while (true) {
            int n7 = d[175];
            n7 -= d[176];
            if ((int)l12 >= (int)(l5 >>> (n7 -= d[177]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = d[178];
            n9 ^= d[179];
            int n10 = d[181];
            n10 += d[182];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 += d[180])) & -1L >>> (n10 ^= d[183]);
            long l19 = l8;
            int n11 = d[184];
            n11 ^= d[185];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= d[186]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = d[187];
            n13 += d[188];
            int n14 = d[190];
            n14 -= d[191];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 += d[189])) & -1L >>> (n14 -= d[192]);
            int n15 = d[193];
            n15 -= d[194];
            long l21 = l9;
            int n16 = d[196];
            n16 -= d[197];
            l9 = l21 ^ ((long)cArray[n12] << (n15 += d[195]) ^ l21) & -1L << (n16 ^= d[198]);
            int n17 = d[199];
            n17 += d[200];
            n17 -= d[201];
            int n18 = d[202];
            n18 ^= d[203];
            long l22 = l11;
            int n19 = d[205];
            n19 += d[206];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += d[204]))) ^ l22) & -1L >>> (n19 -= d[207]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = d[208];
            n20 -= d[209];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 -= d[210]);
            while (true) {
                int n21 = d[211];
                n21 -= d[212];
                if ((int)(l13 >>> (n21 ^= d[213])) >= (int)l11) break;
                int n22 = d[214];
                n22 += d[215];
                int n23 = d[217];
                n23 ^= d[218];
                cArray2[(int)(l13 >>> (n22 += F.d[216]))] = cArray[(int)l12 + (int)(l13 >>> (n23 += d[219]))];
                l13 += 0x100000000L;
            }
            int n24 = d[220];
            n24 -= d[221];
            int n25 = (int)(l14 >>> (n24 -= d[222]));
            l14 += 0x100000000L;
            F.A[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = d[223];
            n26 += d[224];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 -= d[225]);
        }
        INSTANCE = new F();
        int n27 = d[226];
        n27 += d[227];
        a = new Regex((String)A[n27 += d[228]]);
        int n28 = d[229];
        n28 ^= d[230];
        kotakbaz.rain.module.restrict.a.moduleOnFuntime$default(kotakbaz.rain.module.restrict.a.INSTANCE, INSTANCE, null, n28 += d[231], null);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[d[232]];
        String string = (String)object[d[233]];
        object = object[d[234]];
        Object[] objectArray = c;
        if (c == null) {
            objectArray = c = new Object[d[235]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[d[236]];
                b = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[d[238] ^ d[239]];
                byArray[F.d[240] ^ F.d[241]] = d[242] ^ d[243];
                byArray[F.d[244] ^ F.d[245]] = d[246] ^ d[247];
                byArray[F.d[248] ^ F.d[249]] = d[250] ^ d[251];
                byArray[F.d[252] ^ F.d[253]] = d[254] ^ d[255];
                byArray[F.d[256] ^ F.d[257]] = d[258] ^ d[259];
                byArray[F.d[260] ^ F.d[261]] = d[262] ^ d[263];
                byArray[F.d[264] ^ F.d[265]] = d[266] ^ d[267];
                byArray[F.d[268] ^ F.d[269]] = d[270] ^ d[271];
                byArray[F.d[272] ^ F.d[273]] = d[274] ^ d[275];
                byArray[F.d[276] ^ F.d[277]] = d[278] ^ d[279];
                byArray[F.d[280] ^ F.d[281]] = d[282] ^ d[283];
                byArray[F.d[284] ^ F.d[285]] = d[286] ^ d[287];
                byArray[F.d[288] ^ F.d[289]] = d[290] ^ d[291];
                byArray[F.d[292] ^ F.d[293]] = d[294] ^ d[295];
                byArray[F.d[296] ^ F.d[297]] = d[298] ^ d[299];
                byArray[F.d[300] ^ F.d[301]] = d[302] ^ d[303];
                objectArray2[F.d[237]] = byArray;
            }
            byte[] byArray = (byte[])object3[d[304]];
            if (B == null) {
                byte[] byArray2 = new byte[d[305] ^ d[306]];
                byArray2[F.d[307] ^ F.d[308]] = d[309] ^ d[310];
                byArray2[F.d[311] ^ F.d[312]] = d[313] ^ d[314];
                byArray2[F.d[315] ^ F.d[316]] = d[317] ^ d[318];
                byArray2[F.d[319] ^ F.d[320]] = d[321] ^ d[322];
                byArray2[F.d[323] ^ F.d[324]] = d[325] ^ d[326];
                byArray2[F.d[327] ^ F.d[328]] = d[329] ^ d[330];
                byArray2[F.d[331] ^ F.d[332]] = d[333] ^ d[334];
                byArray2[F.d[335] ^ F.d[336]] = d[337] ^ d[338];
                byArray2[F.d[339] ^ F.d[340]] = d[341] ^ d[342];
                byArray2[F.d[343] ^ F.d[344]] = d[345] ^ d[346];
                byArray2[F.d[347] ^ F.d[348]] = d[349] ^ d[350];
                byArray2[F.d[351] ^ F.d[352]] = d[353] ^ d[354];
                byArray2[F.d[355] ^ F.d[356]] = d[357] ^ d[358];
                byArray2[F.d[359] ^ F.d[360]] = d[361] ^ d[362];
                byArray2[F.d[363] ^ F.d[364]] = d[365] ^ d[366];
                byArray2[F.d[367] ^ F.d[368]] = d[369] ^ d[370];
                byArray2[F.d[371] ^ F.d[372]] = d[373] ^ d[374];
                byArray2[F.d[375] ^ F.d[376]] = d[377] ^ d[378];
                byArray2[F.d[379] ^ F.d[380]] = d[381] ^ d[382];
                byArray2[F.d[383] ^ F.d[384]] = d[385] ^ d[386];
                byArray2[F.d[387] ^ F.d[388]] = d[389] ^ d[390];
                byArray2[F.d[391] ^ F.d[392]] = d[393] ^ d[394];
                byArray2[F.d[395] ^ F.d[396]] = d[397] ^ d[398];
                byArray2[F.d[399] ^ 0x2D67] = 0xFFFFD2F6 ^ 0x2D67;
                byArray2[0xF6B ^ 0xF7C] = 0xFFFFF0BE ^ 0xF7C;
                byArray2[0xEC14 ^ 0xEC0A] = 0xEC18 ^ 0xEC0A;
                byArray2[0x9964 ^ 0x996B] = 0xFFFF66FE ^ 0x996B;
                byArray2[0x851 ^ 0x85C] = 0x843 ^ 0x85C;
                byArray2[0x4C4D ^ 0x4C4F] = 0xFFFFB3B8 ^ 0x4C4F;
                byArray2[0x57E3 ^ 0x57F2] = 0xFFFFA814 ^ 0x57F2;
                byArray2[0xA986 ^ 0xA993] = 0xFFFF5607 ^ 0xA993;
                byArray2[0xD31F ^ 0xD31E] = 0xFFFF2CED ^ 0xD31E;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = F.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u7aad\u7adf\u7ada\u7ae1\u7ad3\u7acf\u7926\u7938\u7991\u7935\u7ad5\u798c\u7940\u7942\u7932\u7ad5\u7ae0\u7ad0".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n2 = cArray[i2];
                        n2 += 28864;
                        n2 -= 15843;
                        n2 ^= 0xAAA5;
                        n2 ^= 0x4C65;
                        n2 ^= 0xA068;
                        n2 += 37451;
                        n2 -= 47630;
                        n2 -= 25935;
                        n2 -= 63122;
                        n2 ^= 0xDF36;
                        n2 ^= 0x77;
                        n2 += 30903;
                        cArray[i2] = (char)(n2 += 53082);
                    }
                    object4 = F.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[9] = 104;
                byArray4[12] = 109;
                byArray4[6] = 108;
                byArray4[2] = 120;
                byArray4[11] = -82;
                byArray4[5] = 71;
                byArray4[8] = 93;
                byArray4[4] = 66;
                byArray4[15] = 79;
                byArray4[1] = 2;
                byArray4[10] = 100;
                byArray4[7] = 49;
                byArray4[3] = -81;
                byArray4[0] = -71;
                byArray4[14] = -13;
                byArray4[13] = 109;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 6, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = F.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ua9cc\uaa28\ua9d6".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 += 23616;
                        n3 -= 54001;
                        n3 -= 63877;
                        n3 ^= 0x572A;
                        n3 += 20331;
                        n3 -= 28763;
                        n3 ^= 0xB9AC;
                        n3 += 17101;
                        n3 ^= 0x354D;
                        n3 += 59934;
                        cArray[i3] = (char)(n3 ^= 0xEC3F);
                    }
                    object5 = F.A()[2] = new String(cArray);
                }
                B = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = F.A()[3];
            if (object6 == null) {
                char[] cArray = "\u0d74\u0d70\u0d7e\u0d62\u0d6e\u0d75\u0d6e\u0d62\u0d83\u0d76\u0d6e\u0d7e\u0d60\u0d83\u0d94\u0d8f\u0d8f\u0d7c\u0d99\u0d7a".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 -= 41984;
                    n4 -= 37635;
                    n4 += 51332;
                    n4 += 49573;
                    n4 ^= 0x8BCF;
                    n4 -= 18544;
                    n4 += 50192;
                    n4 += 20468;
                    n4 ^= 0xBA55;
                    n4 ^= 0x5CF7;
                    n4 ^= 0xA37;
                    n4 ^= 0xA89E;
                    cArray[i4] = (char)(n4 += 3423);
                }
                object6 = F.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)B), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = C;
        if (C == null) {
            C = new Object[4];
            objectArray = C;
        }
        return objectArray;
    }

    public static void b() {
        d = new int[0x5EE8 ^ 0x5F78];
        F.d[0x5172 ^ 0x5165] = 0x515F ^ 0x5165;
        F.d[0x3FAC ^ 0x3E83] = 0x21AA ^ 0x3E83;
        F.d[0x4780 ^ 0x47BC] = 0xFFFFB8C2 ^ 0x47BC;
        F.d[0x1F70 ^ 0x1F42] = 0xFFFFE0E6 ^ 0x1F42;
        F.d[0x53AB ^ 0x533E] = 0x533E ^ 0x533E;
        F.d[0x42C6 ^ 0x42D9] = 0x4295 ^ 0x42D9;
        F.d[0xE884 ^ 0xE8F8] = 0xE8F9 ^ 0xE8F8;
        F.d[0x8DA9 ^ 0x8CD7] = 0x3967 ^ 0x8CD7;
        F.d[0x4CFE ^ 0x4CC3] = 0xFFFFB36C ^ 0x4CC3;
        F.d[0x6A6B ^ 0x6A58] = 0x6A5B ^ 0x6A58;
        F.d[0xB198 ^ 0xB0DE] = 0x3F1B ^ 0xB0DE;
        F.d[0xD582 ^ 0xD560] = 0xFFFF2AEC ^ 0xD560;
        F.d[0x8263 ^ 0x82C7] = 0x77B ^ 0x82C7;
        F.d[0x353D ^ 0x3585] = 0x35CF ^ 0x3585;
        F.d[0xB363 ^ 0xB220] = 0x3DFE ^ 0xB220;
        F.d[0xB771 ^ 0xB7ED] = 0xFA8B ^ 0xB7ED;
        F.d[0x4A08 ^ 0x4B19] = 0xBA5E ^ 0x4B19;
        F.d[0xA814 ^ 0xA953] = 0xADD0 ^ 0xA953;
        F.d[0x68BE ^ 0x69CE] = 0x99D2 ^ 0x69CE;
        F.d[0xF98 ^ 0xF73] = 0xF72 ^ 0xF73;
        F.d[0x1A08 ^ 0x1A2D] = 0xFFFFE5D5 ^ 0x1A2D;
        F.d[0x33BC ^ 0x3284] = 0x62FC ^ 0x3284;
        F.d[0xE212 ^ 0xE310] = 0xFFFF6B76 ^ 0xE310;
        F.d[0x10108 ^ 0x10189] = 0x101EF ^ 0x10189;
        F.d[0xC828 ^ 0xC89A] = 0xFFFF3753 ^ 0xC89A;
        F.d[0x45B8 ^ 0x44F0] = 0x4076 ^ 0x44F0;
        F.d[0x1EBC ^ 0x1E82] = 0xFFFFE14D ^ 0x1E82;
        F.d[0x34EA ^ 0x3400] = 0x3400 ^ 0x3400;
        F.d[0xAC6D ^ 0xAD3A] = 0xB96B ^ 0xAD3A;
        F.d[0x39B0 ^ 0x3949] = 0x302A ^ 0x3949;
        F.d[0x19EE ^ 0x1923] = 0x199F ^ 0x1923;
        F.d[0xBDB ^ 0xA5B] = 0x4EB6 ^ 0xA5B;
        F.d[0xFE63 ^ 0xFE63] = 0xFFFF0192 ^ 0xFE63;
        F.d[0x8FDA ^ 0x8FDC] = 0x8FE0 ^ 0x8FDC;
        F.d[0xA788 ^ 0xA781] = 0xFFFF585A ^ 0xA781;
        F.d[0xD652 ^ 0xD695] = 0xFFFF29C4 ^ 0xD695;
        F.d[0x816E ^ 0x8024] = 0x84A2 ^ 0x8024;
        F.d[0x28FC ^ 0x280B] = 0x6CA ^ 0x280B;
        F.d[0xDDC2 ^ 0xDDE0] = 0xFFFF224C ^ 0xDDE0;
        F.d[0x19F0 ^ 0x18A9] = 0xFFFFF31F ^ 0x18A9;
        F.d[0xB933 ^ 0xB9D2] = 0xB9E8 ^ 0xB9D2;
        F.d[0x2947 ^ 0x2828] = 0xD829 ^ 0x2828;
        F.d[0x9683 ^ 0x965F] = 0xFFFF696A ^ 0x965F;
        F.d[0x7A01 ^ 0x7A3A] = 0xFFFF85D5 ^ 0x7A3A;
        F.d[0xEBF5 ^ 0xEB45] = 0xFFFF14FB ^ 0xEB45;
        F.d[0x55CB ^ 0x54C1] = 0x1B36 ^ 0x54C1;
        F.d[0xEEEA ^ 0xEFE7] = 0x4222 ^ 0xEFE7;
        F.d[0xD6FF ^ 0xD60B] = 0xF8CD ^ 0xD60B;
        F.d[0x5B02 ^ 0x5A3D] = 0x96A1 ^ 0x5A3D;
        F.d[0xC84B ^ 0xC8BD] = 0xE65F ^ 0xC8BD;
        F.d[0x35B ^ 0x35E] = 0x329 ^ 0x35E;
        F.d[0x956D ^ 0x95C7] = 0xFFFF6A3A ^ 0x95C7;
        F.d[0x406E ^ 0x41E5] = 0x5CE0 ^ 0x41E5;
        F.d[0x5F4 ^ 0x525] = 0x504 ^ 0x525;
        F.d[0x7F98 ^ 0x7EEF] = 0x5D28 ^ 0x7EEF;
        F.d[0xF2D7 ^ 0xF3C8] = 0xEB7B ^ 0xF3C8;
        F.d[0x9CA6 ^ 0x9CF0] = 0x9CBE ^ 0x9CF0;
        F.d[0x56D8 ^ 0x57F2] = 0xCC32 ^ 0x57F2;
        F.d[0x6443 ^ 0x655D] = 0x7DA4 ^ 0x655D;
        F.d[0xC644 ^ 0xC670] = 0xFFFF398F ^ 0xC670;
        F.d[0xCDA4 ^ 0xCCA8] = 0x616C ^ 0xCCA8;
        F.d[0x8F8 ^ 0x806] = 0xFFFFAC45 ^ 0x806;
        F.d[0x1011A ^ 0x10132] = 0xFFFEFECF ^ 0x10132;
        F.d[0x92A2 ^ 0x925E] = 0xC9F5 ^ 0x925E;
        F.d[0xCF9E ^ 0xCF17] = 0xFFFF30A2 ^ 0xCF17;
        F.d[0x4A74 ^ 0x4B6F] = 0xED2 ^ 0x4B6F;
        F.d[0x2D74 ^ 0x2D31] = 0x2D1B ^ 0x2D31;
        F.d[0xE2B4 ^ 0xE275] = 0xFFFF1DBF ^ 0xE275;
        F.d[0xF033 ^ 0xF1BC] = 0xDCD5 ^ 0xF1BC;
        F.d[0x9C58 ^ 0x9C8C] = 0xFFFF6300 ^ 0x9C8C;
        F.d[0x3C92 ^ 0x3DA7] = 0xFFFEC9B7 ^ 0x3DA7;
        F.d[0xAF96 ^ 0xAE8F] = 0xEB32 ^ 0xAE8F;
        F.d[0x4A7B ^ 0x4BF8] = 0x3CEB ^ 0x4BF8;
        F.d[0x6203 ^ 0x629C] = 0x79B3 ^ 0x629C;
        F.d[0xE815 ^ 0xE8A1] = 0xFFFF174A ^ 0xE8A1;
        F.d[0x246F ^ 0x24BD] = 0x24C6 ^ 0x24BD;
        F.d[0x9B1 ^ 0x9E4] = 0xFFFFF612 ^ 0x9E4;
        F.d[0xC76B ^ 0xC74C] = 0xFFFF38F4 ^ 0xC74C;
        F.d[0xCF37 ^ 0xCFB0] = 0xFFFF305D ^ 0xCFB0;
        F.d[0x16B5 ^ 0x1610] = 0x912C ^ 0x1610;
        F.d[0x39AF ^ 0x3977] = 0x395E ^ 0x3977;
        F.d[0x424F ^ 0x4237] = 0x422F ^ 0x4237;
        F.d[0x4DB2 ^ 0x4C9A] = 0xD77F ^ 0x4C9A;
        F.d[0xBD53 ^ 0xBD2E] = 0xBD22 ^ 0xBD2E;
        F.d[0x310F ^ 0x3145] = 0x3126 ^ 0x3145;
        F.d[0x9E9 ^ 0x945] = 0xFFFFF6A4 ^ 0x945;
        F.d[0x97B8 ^ 0x97E6] = 0xFFFF6860 ^ 0x97E6;
        F.d[0x9C6A ^ 0x9CE8] = 0x9CF9 ^ 0x9CE8;
        F.d[0xC17B ^ 0xC122] = 0xC166 ^ 0xC122;
        F.d[0x9834 ^ 0x99B3] = 0xFCED ^ 0x99B3;
        F.d[0xEE84 ^ 0xEFB8] = 0xE59E ^ 0xEFB8;
        F.d[0x4943 ^ 0x496E] = 0x494A ^ 0x496E;
        F.d[0xDC36 ^ 0xDC95] = 0xC803 ^ 0xDC95;
        F.d[0x9F27 ^ 0x9F5D] = 0x9F62 ^ 0x9F5D;
        F.d[0x1D7E ^ 0x1C30] = 0x59D9 ^ 0x1C30;
        F.d[0x106AF ^ 0x1061A] = 0x1061E ^ 0x1061A;
        F.d[0xCDE4 ^ 0xCC82] = 0xCFFA ^ 0xCC82;
        F.d[0x2123 ^ 0x214E] = 0xFFFFDED1 ^ 0x214E;
        F.d[0x108D ^ 0x1199] = 0xBF76 ^ 0x1199;
        F.d[0x22D7 ^ 0x23A1] = 0x187F ^ 0x23A1;
        F.d[0x9C8C ^ 0x9C16] = 0xB332 ^ 0x9C16;
        F.d[0xEAC3 ^ 0xEBF7] = 0x1E04B ^ 0xEBF7;
        F.d[0xCDE5 ^ 0xCD54] = 0xCD67 ^ 0xCD54;
        F.d[0x3B6A ^ 0x3A3F] = 0xFFFFAE40 ^ 0x3A3F;
        F.d[0x421E ^ 0x4319] = 0xF84C ^ 0x4319;
        F.d[0x792E ^ 0x785F] = 0x8854 ^ 0x785F;
        F.d[0x6679 ^ 0x6714] = 0xF28A ^ 0x6714;
        F.d[0xAE2D ^ 0xAE22] = 0xAE30 ^ 0xAE22;
        F.d[0xCF1 ^ 0xCDE] = 0xFFFFF31B ^ 0xCDE;
        F.d[0x481A ^ 0x4967] = 0xFCA8 ^ 0x4967;
        F.d[0x1093F ^ 0x109EC] = 0xFFFEF6A0 ^ 0x109EC;
        F.d[0x2657 ^ 0x26D3] = 0xFFFFD925 ^ 0x26D3;
        F.d[0x7877 ^ 0x790F] = 0x5ADB ^ 0x790F;
        F.d[0x9D78 ^ 0x9D2F] = 0xFFFF62B4 ^ 0x9D2F;
        F.d[0xAA2A ^ 0xAB09] = 0x70BD ^ 0xAB09;
        F.d[0x70D7 ^ 0x715A] = 0xFFFF93C5 ^ 0x715A;
        F.d[0x2369 ^ 0x2279] = 0xD335 ^ 0x2279;
        F.d[0x9D74 ^ 0x9C29] = 0x37D5 ^ 0x9C29;
        F.d[0xB8A5 ^ 0xB92D] = 0xDC67 ^ 0xB92D;
        F.d[0x195A ^ 0x19FA] = 0xA2B ^ 0x19FA;
        F.d[0xEBCB ^ 0xEBA3] = 0xEBF9 ^ 0xEBA3;
        F.d[0x20C8 ^ 0x2094] = 0x2099 ^ 0x2094;
        F.d[0x10063 ^ 0x100AC] = 0x100FA ^ 0x100AC;
        F.d[0x13F6 ^ 0x13C0] = 0xFFFFEC32 ^ 0x13C0;
        F.d[0xDFFD ^ 0xDF97] = 0xFFFF203F ^ 0xDF97;
        F.d[0xAF6D ^ 0xAF4B] = 0xAF32 ^ 0xAF4B;
        F.d[0xBFA2 ^ 0xBF19] = 0xFFFF408B ^ 0xBF19;
        F.d[0xA142 ^ 0xA130] = 0xFFFF5E84 ^ 0xA130;
        F.d[0x952E ^ 0x957C] = 0x956A ^ 0x957C;
        F.d[0x75FC ^ 0x7588] = 0xFFFF8A4B ^ 0x7588;
        F.d[0xCA1E ^ 0xCA19] = 0xCA1F ^ 0xCA19;
        F.d[0x404D ^ 0x407C] = 0xFFFFBFC1 ^ 0x407C;
        F.d[0x8818 ^ 0x8820] = 0xFFFF77D1 ^ 0x8820;
        F.d[0x96A7 ^ 0x96E0] = 0xFFFF6912 ^ 0x96E0;
        F.d[0x591 ^ 0x5E1] = 0x5A5 ^ 0x5E1;
        F.d[0x8C04 ^ 0x8D58] = 0x26D2 ^ 0x8D58;
        F.d[0xE5CE ^ 0xE520] = 0x599B ^ 0xE520;
        F.d[0x86CB ^ 0x86A2] = 0xFFFF7932 ^ 0x86A2;
        F.d[0xBB4 ^ 0xA86] = 0x33A4 ^ 0xA86;
        F.d[0xBD92 ^ 0xBCB4] = 0x4F27 ^ 0xBCB4;
        F.d[0xDE94 ^ 0xDFB9] = 0xC090 ^ 0xDFB9;
        F.d[0xEFBE ^ 0xEF7D] = 0xEF73 ^ 0xEF7D;
        F.d[0xBA14 ^ 0xBA98] = 0xBAF3 ^ 0xBA98;
        F.d[0xA217 ^ 0xA24C] = 0xFFFF5DD0 ^ 0xA24C;
        F.d[0xF4D ^ 0xE2C] = 0x1035 ^ 0xE2C;
        F.d[0xD92 ^ 0xCF0] = 0x12C1 ^ 0xCF0;
        F.d[0x6F30 ^ 0x6F1E] = 0x6F79 ^ 0x6F1E;
        F.d[0x7225 ^ 0x7296] = 0xFFFF8D49 ^ 0x7296;
        F.d[0xF085 ^ 0xF10F] = 0x9445 ^ 0xF10F;
        F.d[0x564C ^ 0x5620] = 0x56F6 ^ 0x5620;
        F.d[0x769F ^ 0x77D2] = 0x324D ^ 0x77D2;
        F.d[0x2A14 ^ 0x2B6B] = 0x6F90 ^ 0x2B6B;
        F.d[0xE470 ^ 0xE4D9] = 0xFFFF1B09 ^ 0xE4D9;
        F.d[0xB017 ^ 0xB099] = 0xB0B8 ^ 0xB099;
        F.d[0x5DB3 ^ 0x5CAF] = 0x4410 ^ 0x5CAF;
        F.d[0xF040 ^ 0xF09D] = 0xFFFF0F09 ^ 0xF09D;
        F.d[0xBE47 ^ 0xBF1D] = 0xAB5C ^ 0xBF1D;
        F.d[0xFF22 ^ 0xFF4C] = 0xFF39 ^ 0xFF4C;
        F.d[0xF463 ^ 0xF4F3] = 0xF4F0 ^ 0xF4F3;
        F.d[0x8A5E ^ 0x8B7F] = 0x50CB ^ 0x8B7F;
        F.d[0x5871 ^ 0x59F0] = 0xFFFFE291 ^ 0x59F0;
        F.d[0x10531 ^ 0x10424] = 0x1AACD ^ 0x10424;
        F.d[0x2CA4 ^ 0x2DDF] = 0x9869 ^ 0x2DDF;
        F.d[0x1C00 ^ 0x1D20] = 0xC697 ^ 0x1D20;
        F.d[0xC143 ^ 0xC15A] = 0xFFFF3E84 ^ 0xC15A;
        F.d[0xD002 ^ 0xD046] = 0xD065 ^ 0xD046;
        F.d[0xD7BB ^ 0xD6D5] = 0x436C ^ 0xD6D5;
        F.d[0x74B0 ^ 0x75AD] = 0x6D1E ^ 0x75AD;
        F.d[0xAFDF ^ 0xAE94] = 0xEB67 ^ 0xAE94;
        F.d[0x84CB ^ 0x8409] = 0xFFFF7BB1 ^ 0x8409;
        F.d[0xA2AC ^ 0xA2BE] = 0xFFFF5D34 ^ 0xA2BE;
        F.d[0x9B72 ^ 0x9A6A] = 0xDFD9 ^ 0x9A6A;
        F.d[0x980 ^ 0x912] = 0x913 ^ 0x912;
        F.d[0x100D1 ^ 0x10040] = 0x10040 ^ 0x10040;
        F.d[0x6ABB ^ 0x6A07] = 0x6A11 ^ 0x6A07;
        F.d[0xD807 ^ 0xD876] = 0xD81C ^ 0xD876;
        F.d[0x3F11 ^ 0x3E07] = 0xFFFF6F05 ^ 0x3E07;
        F.d[0x7D3E ^ 0x7C04] = 0x2C7C ^ 0x7C04;
        F.d[0xC335 ^ 0xC241] = 0xF99F ^ 0xC241;
        F.d[0xAD54 ^ 0xAC0A] = 0x780 ^ 0xAC0A;
        F.d[0x2562 ^ 0x252F] = 0xFFFFDAD7 ^ 0x252F;
        F.d[0x2D45 ^ 0x2D0B] = 0x2DC3 ^ 0x2D0B;
        F.d[0x72C1 ^ 0x72F1] = 0xFFFF8D19 ^ 0x72F1;
        F.d[0x5C85 ^ 0x5CD1] = 0x5CE6 ^ 0x5CD1;
        F.d[0x8D8B ^ 0x8DCA] = 0x8DA5 ^ 0x8DCA;
        F.d[0xBBD9 ^ 0xBBF9] = 0xBBD6 ^ 0xBBF9;
        F.d[0x628E ^ 0x6221] = 0x6230 ^ 0x6221;
        F.d[0x1846 ^ 0x182D] = 0xFFFFE7CB ^ 0x182D;
        F.d[0x4C1F ^ 0x4C0E] = 0x4C63 ^ 0x4C0E;
        F.d[0x10AFD ^ 0x10BAB] = 0x16077 ^ 0x10BAB;
        F.d[0x94D6 ^ 0x94CD] = 0x941D ^ 0x94CD;
        F.d[0xF12C ^ 0xF073] = 0xEE5D ^ 0xF073;
        F.d[0x3FD ^ 0x3E1] = 0xFFFFFC77 ^ 0x3E1;
        F.d[0xDE69 ^ 0xDED7] = 0xDEB8 ^ 0xDED7;
        F.d[0x8659 ^ 0x8636] = 0x8689 ^ 0x8636;
        F.d[0x8D10 ^ 0x8D05] = 0x8DAA ^ 0x8D05;
        F.d[0xBAE1 ^ 0xBA5B] = 0xBA42 ^ 0xBA5B;
        F.d[0x83CC ^ 0x83B3] = 0xFFFF7C06 ^ 0x83B3;
        F.d[0x1519 ^ 0x1538] = 0xFFFFEABD ^ 0x1538;
        F.d[0x6965 ^ 0x6858] = 0x6218 ^ 0x6858;
        F.d[0xC5FC ^ 0xC552] = 0xFFFF3A91 ^ 0xC552;
        F.d[0xD4A3 ^ 0xD429] = 0xD428 ^ 0xD429;
        F.d[0xEF0 ^ 0xFD4] = 0xFC5F ^ 0xFD4;
        F.d[0xA278 ^ 0xA234] = 0xA277 ^ 0xA234;
        F.d[0xEA1D ^ 0xEA5E] = 0xEA0E ^ 0xEA5E;
        F.d[0x838E ^ 0x8354] = 0x8374 ^ 0x8354;
        F.d[0x95AD ^ 0x94AE] = 0xE373 ^ 0x94AE;
        F.d[0xAE73 ^ 0xAEAC] = 0xAE61 ^ 0xAEAC;
        F.d[0x8D42 ^ 0x8DC1] = 0x8DB6 ^ 0x8DC1;
        F.d[0x109A9 ^ 0x10904] = 0xFFFEF6FA ^ 0x10904;
        F.d[0x7CCC ^ 0x7C7B] = 0x7C23 ^ 0x7C7B;
        F.d[0xB349 ^ 0xB20D] = 0x3DC8 ^ 0xB20D;
        F.d[0xF74 ^ 0xF84] = 0x61E0 ^ 0xF84;
        F.d[0xC50A ^ 0xC55B] = 0xC503 ^ 0xC55B;
        F.d[0xB6A ^ 0xBCC] = 0x89D2 ^ 0xBCC;
        F.d[0x9F25 ^ 0x9FDF] = 0x96D5 ^ 0x9FDF;
        F.d[0x5A74 ^ 0x5B4A] = 0x516C ^ 0x5B4A;
        F.d[0xF675 ^ 0xF698] = 0xF698 ^ 0xF698;
        F.d[0xE777 ^ 0xE7F2] = 0xFFFF180F ^ 0xE7F2;
        F.d[0x372E ^ 0x3714] = 0x3774 ^ 0x3714;
        F.d[0x3C5E ^ 0x3C40] = 0x3C5E ^ 0x3C40;
        F.d[0x28E7 ^ 0x2868] = 0x2805 ^ 0x2868;
        F.d[0xE2EF ^ 0xE2CB] = 0xE2BB ^ 0xE2CB;
        F.d[0xBE72 ^ 0xBFFC] = 0xA2E0 ^ 0xBFFC;
        F.d[0xCF8A ^ 0xCFD2] = 0xCFF3 ^ 0xCFD2;
        F.d[0xA48B ^ 0xA481] = 0xA4F0 ^ 0xA481;
        F.d[0x5156 ^ 0x515E] = 0x5168 ^ 0x515E;
        F.d[0x629B ^ 0x6278] = 0x622E ^ 0x6278;
        F.d[0x4076 ^ 0x403D] = 0x407C ^ 0x403D;
        F.d[0x23B6 ^ 0x22C5] = 0x191F ^ 0x22C5;
        F.d[0x10093 ^ 0x100F2] = 0x100C0 ^ 0x100F2;
        F.d[0x10DE3 ^ 0x10CF9] = 0xFFFEB693 ^ 0x10CF9;
        F.d[0x2A6D ^ 0x2A52] = 0x2A85 ^ 0x2A52;
        F.d[0x94C0 ^ 0x95C4] = 0x2E91 ^ 0x95C4;
        F.d[0x6863 ^ 0x6898] = 0x61FB ^ 0x6898;
        F.d[0xC013 ^ 0xC169] = 0xE2BD ^ 0xC169;
        F.d[0x874C ^ 0x8732] = 0x8711 ^ 0x8732;
        F.d[0x82F2 ^ 0x8229] = 0xFFFF7DA2 ^ 0x8229;
        F.d[0x9881 ^ 0x98F4] = 0x98D7 ^ 0x98F4;
        F.d[0x2BEB ^ 0x2AAB] = 0xE637 ^ 0x2AAB;
        F.d[0xE40F ^ 0xE55C] = 0x8E88 ^ 0xE55C;
        F.d[0xB9AD ^ 0xB8F5] = 0xACB4 ^ 0xB8F5;
        F.d[0x10A74 ^ 0x10B35] = 0xFFFE3805 ^ 0x10B35;
        F.d[0xD9F ^ 0xCFB] = 0xF83 ^ 0xCFB;
        F.d[0xBD0F ^ 0xBDA8] = 0x5337 ^ 0xBDA8;
        F.d[0xBDCD ^ 0xBDBE] = 0xBDC8 ^ 0xBDBE;
        F.d[0xAF1D ^ 0xAE2D] = 0xAE2D ^ 0xAE2D;
        F.d[0x178C ^ 0x16DE] = 0x2B60 ^ 0x16DE;
        F.d[0x2826 ^ 0x2946] = 0x3777 ^ 0x2946;
        F.d[0xBD1F ^ 0xBC5A] = 0x33D9 ^ 0xBC5A;
        F.d[0xA2C5 ^ 0xA3EB] = 0xFFFF4315 ^ 0xA3EB;
        F.d[0x6C90 ^ 0x6C54] = 0x6C1A ^ 0x6C54;
        F.d[0xF4A6 ^ 0xF4A5] = 0xFFFF0B51 ^ 0xF4A5;
        F.d[0x3440 ^ 0x34A4] = 0x3488 ^ 0x34A4;
        F.d[0xA8D4 ^ 0xA83B] = 0x1490 ^ 0xA83B;
        F.d[0x10533 ^ 0x105ED] = 0xFFFEFA6C ^ 0x105ED;
        F.d[0x70C ^ 0x7A4] = 0x7A4 ^ 0x7A4;
        F.d[0xBCE9 ^ 0xBC0E] = 0xFFFF43B8 ^ 0xBC0E;
        F.d[0xDF25 ^ 0xDF47] = 0xDF08 ^ 0xDF47;
        F.d[0x45E3 ^ 0x45A3] = 0xFFFFBA34 ^ 0x45A3;
        F.d[0xB1AF ^ 0xB084] = 0x2B6B ^ 0xB084;
        F.d[0xBE8D ^ 0xBE70] = 0xE5D3 ^ 0xBE70;
        F.d[0x84A3 ^ 0x841E] = 0x8447 ^ 0x841E;
        F.d[0x615B ^ 0x6031] = 0x2F8F ^ 0x6031;
        F.d[0xC61 ^ 0xCDE] = 0xFFFFF323 ^ 0xCDE;
        F.d[0xE348 ^ 0xE3EA] = 0x6F5F ^ 0xE3EA;
        F.d[0xB3DD ^ 0xB35D] = 0xB336 ^ 0xB35D;
        F.d[0xCA81 ^ 0xCAA2] = 0xCA9B ^ 0xCAA2;
        F.d[0x4E14 ^ 0x4ECD] = 0x4E78 ^ 0x4ECD;
        F.d[0x3DF5 ^ 0x3D13] = 0xFFFFC2ED ^ 0x3D13;
        F.d[0x8B97 ^ 0x8A85] = 0xFFFF8438 ^ 0x8A85;
        F.d[0xBB9F ^ 0xBB6A] = 0x95AB ^ 0xBB6A;
        F.d[0xB434 ^ 0xB476] = 0xFFFF4BA4 ^ 0xB476;
        F.d[0xDACF ^ 0xDBF4] = 0xD1D8 ^ 0xDBF4;
        F.d[0xE25F ^ 0xE24B] = 0xE205 ^ 0xE24B;
        F.d[9 ^ 0xC9] = 0x9B ^ 0xC9;
        F.d[0x6774 ^ 0x6663] = 0xC88A ^ 0x6663;
        F.d[0x3CE4 ^ 0x3C7F] = 0x465A ^ 0x3C7F;
        F.d[0x10C12 ^ 0x10C3E] = 0x10C00 ^ 0x10C3E;
        F.d[0xC14D ^ 0xC178] = 0xC16D ^ 0xC178;
        F.d[0xDF8B ^ 0xDF00] = 0xDF53 ^ 0xDF00;
        F.d[0xA8DA ^ 0xA9F6] = 0xB6DD ^ 0xA9F6;
        F.d[0x15D9 ^ 0x14D9] = 0x6309 ^ 0x14D9;
        F.d[0x27E9 ^ 0x278C] = 0xFFFFD836 ^ 0x278C;
        F.d[0x3279 ^ 0x334E] = 0x633D ^ 0x334E;
        F.d[0xA200 ^ 0xA385] = 0xD4F9 ^ 0xA385;
        F.d[0x3151 ^ 0x31CF] = 0x86A7 ^ 0x31CF;
        F.d[0x8412 ^ 0x84DB] = 0xFFFF7B4E ^ 0x84DB;
        F.d[0x2194 ^ 0x216B] = 0x7AC8 ^ 0x216B;
        F.d[0x4150 ^ 0x4116] = 0xFFFFBEDE ^ 0x4116;
        F.d[0x7C99 ^ 0x7D1F] = 0xA05 ^ 0x7D1F;
        F.d[0x387D ^ 0x3972] = 0x94B7 ^ 0x3972;
        F.d[0xF51C ^ 0xF415] = 0xBBF0 ^ 0xF415;
        F.d[0x4726 ^ 0x477C] = 0xFFFFB8EF ^ 0x477C;
        F.d[0x11DF ^ 0x10EE] = 0x29EC ^ 0x10EE;
        F.d[0x4BCF ^ 0x4B6E] = 0xC63D ^ 0x4B6E;
        F.d[0xC00 ^ 0xD8C] = 0x1090 ^ 0xD8C;
        F.d[0x15A3 ^ 0x1594] = 0xFFFFEA77 ^ 0x1594;
        F.d[0x8A28 ^ 0x8A11] = 0xFFFF7582 ^ 0x8A11;
        F.d[0x1559 ^ 0x14DD] = 0x63C7 ^ 0x14DD;
        F.d[0xF99D ^ 0xF900] = 0x7EC7 ^ 0xF900;
        F.d[0x424F ^ 0x4323] = 0xD69A ^ 0x4323;
        F.d[0x930A ^ 0x9382] = 0xFFFF6C4D ^ 0x9382;
        F.d[0xA688 ^ 0xA695] = 0xA6FA ^ 0xA695;
        F.d[0x3988 ^ 0x389B] = 0xC9DC ^ 0x389B;
        F.d[0x78D8 ^ 0x7991] = 0xFFFF82EA ^ 0x7991;
        F.d[0x90D ^ 0x906] = 0xFFFFF692 ^ 0x906;
        F.d[0xF58 ^ 0xE59] = 0x7984 ^ 0xE59;
        F.d[0x79BA ^ 0x79EA] = 0x7984 ^ 0x79EA;
        F.d[0x27F3 ^ 0x2784] = 0x27CE ^ 0x2784;
        F.d[0xC991 ^ 0xC91C] = 0xC972 ^ 0xC91C;
        F.d[0x4F9A ^ 0x4F98] = 0xFFFFB04D ^ 0x4F98;
        F.d[0xA5C9 ^ 0xA52C] = 0xFFFF5A9E ^ 0xA52C;
        F.d[0x7F66 ^ 0x7F1D] = 0x7F11 ^ 0x7F1D;
        F.d[0x4D4B ^ 0x4C4D] = 0xFFFF08BD ^ 0x4C4D;
        F.d[0x2711 ^ 0x2771] = 0x27F5 ^ 0x2771;
        F.d[0x54A4 ^ 0x5472] = 0xFFFFAB0D ^ 0x5472;
        F.d[0xC7F8 ^ 0xC718] = 0xFFFF3895 ^ 0xC718;
        F.d[0xED76 ^ 0xECF4] = 0xA819 ^ 0xECF4;
        F.d[0xCF74 ^ 0xCE17] = 0xCD68 ^ 0xCE17;
        F.d[0x4F3B ^ 0x4E6F] = 0x25B3 ^ 0x4E6F;
        F.d[0x3DD9 ^ 0x3DBE] = 0x3D98 ^ 0x3DBE;
        F.d[0xEF6C ^ 0xEF15] = 0xEF36 ^ 0xEF15;
        F.d[0xAD93 ^ 0xAD0A] = 0x5DA9 ^ 0xAD0A;
        F.d[0x1DC6 ^ 0x1C84] = 0xD018 ^ 0x1C84;
        F.d[0xB832 ^ 0xB82A] = 0xB802 ^ 0xB82A;
        F.d[0x3E89 ^ 0x3E5C] = 0xFFFFC1BC ^ 0x3E5C;
        F.d[0x9A6 ^ 0x98C] = 0xFFFFF6D6 ^ 0x98C;
        F.d[0x5C9B ^ 0x5DCB] = 0x6075 ^ 0x5DCB;
        F.d[0x84DA ^ 0x8429] = 0xEA44 ^ 0x8429;
        F.d[0x1A19 ^ 0x1A17] = 0x1A1B ^ 0x1A17;
        F.d[0x855B ^ 0x8504] = 0xFFFF7AA6 ^ 0x8504;
        F.d[0x5874 ^ 0x5901] = 0xFFFF9D34 ^ 0x5901;
        F.d[0x25B8 ^ 0x2481] = 0x74D6 ^ 0x2481;
        F.d[0x10F7B ^ 0x10E09] = 0x1FE15 ^ 0x10E09;
        F.d[0x171B ^ 0x1662] = 0x35CC ^ 0x1662;
        F.d[0x1D27 ^ 0x1D31] = 0xFFFFE2AC ^ 0x1D31;
        F.d[0xDED2 ^ 0xDFB7] = 0xDCEB ^ 0xDFB7;
        F.d[0x10B27 ^ 0x10A05] = 0xFFFE2E75 ^ 0x10A05;
        F.d[0x1659 ^ 0x160A] = 0x1650 ^ 0x160A;
        F.d[0x4693 ^ 0x467F] = 0x467E ^ 0x467F;
        F.d[0x21A ^ 0x312] = 0x4CF2 ^ 0x312;
        F.d[0xEAF5 ^ 0xEA61] = 0xEA63 ^ 0xEA61;
        F.d[0x7ACB ^ 0x7AAF] = 0xFFFF8541 ^ 0x7AAF;
        F.d[0xFF19 ^ 0xFFCE] = 0xFFB6 ^ 0xFFCE;
        F.d[0x2A20 ^ 0x2A7D] = 0x2AA5 ^ 0x2A7D;
        F.d[0xBF4 ^ 0xBF9] = 0xFFFFF46E ^ 0xBF9;
        F.d[0x1A2B ^ 0x1A2A] = 0x1A3B ^ 0x1A2A;
        F.d[0xEAF0 ^ 0xEBD9] = 0x7036 ^ 0xEBD9;
        F.d[0xC442 ^ 0xC46B] = 0xFFFF3BDE ^ 0xC46B;
        F.d[0xE701 ^ 0xE650] = 0xDB82 ^ 0xE650;
        F.d[0xE843 ^ 0xE964] = 0x1AE0 ^ 0xE964;
        F.d[0x4ED ^ 0x4F7] = 0xFFFFFB02 ^ 0x4F7;
        F.d[0xC46 ^ 0xCAE] = 0xCAF ^ 0xCAE;
        F.d[0xCC3D ^ 0xCCAE] = 0xCCAE ^ 0xCCAE;
        F.d[0x68E1 ^ 0x6808] = 0x680A ^ 0x6808;
        F.d[0xA795 ^ 0xA70D] = 0xEB2D ^ 0xA70D;
        F.d[0x7741 ^ 0x77B3] = 0xFFFFE676 ^ 0x77B3;
        F.d[0xD865 ^ 0xD953] = 0x1D2EF ^ 0xD953;
        F.d[0x70C ^ 0x7C4] = 0x790 ^ 0x7C4;
        F.d[0x3665 ^ 0x3661] = 0xFFFFC9EF ^ 0x3661;
        F.d[0x4CDC ^ 0x4CAA] = 0xFFFFB372 ^ 0x4CAA;
        F.d[0x3826 ^ 0x38B0] = 0x38B0 ^ 0x38B0;
        F.d[0x8525 ^ 0x85E3] = 0xFFFF7A11 ^ 0x85E3;
        F.d[0xAD40 ^ 0xAD8A] = 0xAD99 ^ 0xAD8A;
        F.d[0xF9A5 ^ 0xF8EA] = 0xC548 ^ 0xF8EA;
        F.d[0xA2A3 ^ 0xA3AD] = 0xE3D ^ 0xA3AD;
        F.d[0xD424 ^ 0xD46C] = 0xD40E ^ 0xD46C;
        F.d[0x73B6 ^ 0x72ED] = 0xD975 ^ 0x72ED;
        F.d[0xAEFD ^ 0xAE6A] = 0xAC06 ^ 0xAE6A;
        F.d[0xC34A ^ 0xC329] = 0xC351 ^ 0xC329;
        F.d[0xE9B1 ^ 0xE99A] = 0xFFFF1608 ^ 0xE99A;
        F.d[0x6C63 ^ 0x6C92] = 0x2FF ^ 0x6C92;
        F.d[0x8CB4 ^ 0x8C71] = 0x8C0D ^ 0x8C71;
        F.d[0x5FD3 ^ 0x5F1F] = 0xFFFFA0FF ^ 0x5F1F;
        F.d[0x2A53 ^ 0x2B1F] = 0x6EF6 ^ 0x2B1F;
        F.d[0x10A4F ^ 0x10B28] = 0x1448E ^ 0x10B28;
        F.d[0x3B93 ^ 0x3AB6] = 0xC932 ^ 0x3AB6;
        F.d[0x9897 ^ 0x99FE] = 0xFFFF29E9 ^ 0x99FE;
        F.d[0x32E6 ^ 0x3236] = 0x328A ^ 0x3236;
        F.d[0xF064 ^ 0xF157] = 0x1FAE8 ^ 0xF157;
        F.d[0x8F97 ^ 0x8FDE] = 0x8FDF ^ 0x8FDE;
        F.d[0x7B5F ^ 0x7A34] = 0xEF81 ^ 0x7A34;
        F.d[0xFFD7 ^ 0xFEBF] = 0xB101 ^ 0xFEBF;
        F.d[0x9CA0 ^ 0x9C19] = 0x9C6A ^ 0x9C19;
        F.d[0x968B ^ 0x9687] = 0x96F2 ^ 0x9687;
        F.d[0xAC1D ^ 0xAD94] = 0xFFFF3726 ^ 0xAD94;
        F.d[0x108D9 ^ 0x1086F] = 0x1081B ^ 0x1086F;
        F.d[0xF833 ^ 0xF8FD] = 0xFFFF0747 ^ 0xF8FD;
        F.d[0x6F01 ^ 0x6F12] = 0x6F38 ^ 0x6F12;
        F.d[0xCA4C ^ 0xCB30] = 0x7E80 ^ 0xCB30;
        F.d[0x1002E ^ 0x10048] = 0xFFFEFFA4 ^ 0x10048;
        F.d[0x352D ^ 0x3428] = 0x8F7D ^ 0x3428;
        F.d[0x9EB3 ^ 0x9EFC] = 0xFFFF614F ^ 0x9EFC;
        F.d[0xC9F1 ^ 0xC8FA] = 0x871F ^ 0xC8FA;
        F.d[0x2DAB ^ 0x2D60] = 0x2D33 ^ 0x2D60;
        F.d[0x7A02 ^ 0x7A12] = 0x7A68 ^ 0x7A12;
        F.d[0x70BC ^ 0x7044] = 0x7923 ^ 0x7044;
        F.d[0x557 ^ 0x5D1] = 0xFFFFFA37 ^ 0x5D1;
        F.d[0x544A ^ 0x54E1] = 0xFFFFAB12 ^ 0x54E1;
    }
}

