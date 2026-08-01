/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.setting;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.module.setting.Setting;
import kotakbaz.rain.module.setting.a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/*
 * Signature claims super is kotakbaz.rain.module.setting.B<java.lang.String>, not kotakbaz.rain.module.setting.Setting - discarding signature.
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000b\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001cH\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\"\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b#\u0010$R\u0011\u0010'\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010*\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b(\u0010)\u00a8\u0006,"}, d2={"Lkotakbaz/rain/module/setting/ModeSetting;", "Lkotakbaz/rain/module/setting/Setting;", "", "name", "", "modes", "", "initialIndex", "<init>", "(Ljava/lang/String;Ljava/util/List;I)V", "mode", "", "setMode", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "provider", "withDisplayNameProvider", "(Lkotlin/jvm/functions/Function1;)Lkotakbaz/rain/module/setting/ModeSetting;", "displayNameFor", "(Ljava/lang/String;)Ljava/lang/String;", "index", "setIndex", "(I)V", "", "isSelected", "(I)Z", "cycleNext", "()V", "Lkotlin/Function0;", "condition", "setVisible", "(Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/setting/ModeSetting;", "Ljava/util/List;", "getModes", "()Ljava/util/List;", "displayNameProvider", "Lkotlin/jvm/functions/Function1;", "getSelectedIndex", "()I", "selectedIndex", "getDisplayValue", "()Ljava/lang/String;", "displayValue", "Companion", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nModeSetting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModeSetting.kt\nkotakbaz/rain/module/setting/ModeSetting\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
public class ModeSetting
extends Setting {
    @NotNull
    public static final a m;
    @NotNull
    private final List<String> M;
    @NotNull
    private Function1<? super String, String> n;
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    public ModeSetting(@NotNull String name, @NotNull List<String> modes, int initialIndex) {
        int n2;
        long l2 = 6279190028503868390L;
        int n3 = C[0];
        n3 += C[1];
        Intrinsics.checkNotNullParameter(name, (String)a[n3 += C[2]]);
        int n4 = C[3];
        n4 -= C[4];
        Intrinsics.checkNotNullParameter(modes, (String)a[n4 -= C[5]]);
        super(name, kotakbaz.rain.module.setting.a.access$initialMode(m, modes, initialIndex));
        this.M = modes;
        this.n = ModeSetting::displayNameProvider$lambda$0;
        if (!((Collection)this.M).isEmpty()) {
            int n5 = C[6];
            n5 ^= C[7];
            n2 = n5 ^= C[8];
        } else {
            int n6 = C[9];
            n6 ^= C[10];
            n2 = n6 += C[11];
        }
        if (n2 == 0) {
            long l3 = l2;
            int n7 = C[12];
            n7 ^= C[13];
            l2 = l3 ^ (0L ^ l3) & -1L << (n7 -= C[14]);
            int n8 = C[15];
            n8 += C[16];
            int n9 = C[18];
            n9 += C[19];
            String string = (String)a[n8 ^= C[17]] + (String)a[n9 -= C[20]];
            throw new IllegalArgumentException(string.toString());
        }
    }

    public /* synthetic */ ModeSetting(String string, List list, int n2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = C[21];
        n4 += C[22];
        if ((n3 & (n4 -= C[23])) != 0) {
            int n5 = C[24];
            n5 -= C[25];
            n2 = n5 ^= C[26];
        }
        this(string, list, n2);
    }

    @NotNull
    public final List<String> getModes() {
        return this.M;
    }

    public final int getSelectedIndex() {
        int n2;
        int n3;
        long l2 = -6021095240372517062L;
        long l3 = 8988857595091375354L;
        Integer n4 = this.M.indexOf(this.getValue());
        int n5 = C[27];
        n5 -= C[28];
        long l4 = l3;
        int n6 = C[30];
        n6 ^= C[31];
        l3 = l4 ^ ((long)((Number)n4).intValue() << (n5 += C[29]) ^ l4) & -1L << (n6 += C[32]);
        long l5 = l2;
        int n7 = C[33];
        n7 ^= C[34];
        l2 = l5 ^ (0L ^ l5) & -1L >>> (n7 ^= C[35]);
        int n8 = C[36];
        n8 += C[37];
        if ((int)(l3 >>> (n8 += C[38])) >= 0) {
            int n9 = C[39];
            n9 ^= C[40];
            n3 = n9 ^= C[41];
        } else {
            int n10 = C[42];
            n10 ^= C[43];
            n3 = n10 -= C[44];
        }
        Integer n11 = n3 != 0 ? n4 : null;
        if (n11 != null) {
            n2 = n11;
        } else {
            int n12 = C[45];
            n12 ^= C[46];
            n2 = n12 -= C[47];
        }
        return n2;
    }

    public final void setMode(@NotNull String mode) {
        int n2 = C[48];
        n2 -= C[49];
        Intrinsics.checkNotNullParameter(mode, (String)a[n2 += C[50]]);
        if (this.M.contains(mode)) {
            this.set(mode);
        }
    }

    @NotNull
    public final ModeSetting withDisplayNameProvider(@NotNull Function1<? super String, String> provider) {
        int n2 = C[51];
        n2 += C[52];
        Intrinsics.checkNotNullParameter(provider, (String)a[n2 ^= C[53]]);
        this.n = provider;
        return this;
    }

    @NotNull
    public final String displayNameFor(@NotNull String mode) {
        CharSequence charSequence;
        long l2 = -3141540710621699135L;
        int n2 = C[54];
        n2 -= C[55];
        Intrinsics.checkNotNullParameter(mode, (String)a[n2 += C[56]]);
        CharSequence charSequence2 = this.n.invoke(mode);
        if (StringsKt.isBlank(charSequence2)) {
            long l3 = l2;
            int n3 = C[57];
            n3 -= C[58];
            l2 = l3 ^ (0L ^ l3) & -1L << (n3 -= C[59]);
            charSequence = mode;
        } else {
            charSequence = charSequence2;
        }
        return (String)charSequence;
    }

    @NotNull
    public final String getDisplayValue() {
        return this.displayNameFor((String)this.getValue());
    }

    public final void setIndex(int index) {
        int n2 = C[60];
        n2 += C[61];
        this.set(this.M.get(RangesKt.coerceIn(index, n2 += C[62], CollectionsKt.getLastIndex(this.M))));
    }

    public final boolean isSelected(int index) {
        boolean bl;
        if (this.getSelectedIndex() == index) {
            boolean bl2 = C[63];
            bl2 += C[64];
            bl = bl2 ^= C[65];
        } else {
            boolean bl3 = C[66];
            bl3 -= C[67];
            bl = bl3 -= C[68];
        }
        return bl;
    }

    public final void cycleNext() {
        long l2 = 8923266090373492902L;
        int n2 = C[69];
        n2 += C[70];
        n2 ^= C[71];
        int n3 = C[72];
        n3 -= C[73];
        long l3 = l2;
        int n4 = C[75];
        n4 ^= C[76];
        l2 = l3 ^ ((long)((this.getSelectedIndex() + n2) % this.M.size()) << (n3 += C[74]) ^ l3) & -1L << (n4 -= C[77]);
        int n5 = C[78];
        n5 += C[79];
        this.set(this.M.get((int)(l2 >>> (n5 -= C[80]))));
    }

    @NotNull
    public ModeSetting setVisible(@NotNull Function0<Boolean> condition) {
        int n2 = C[81];
        n2 += C[82];
        Intrinsics.checkNotNullParameter(condition, (String)a[n2 ^= C[83]]);
        super.setVisible(condition);
        return this;
    }

    private static final String displayNameProvider$lambda$0(String it) {
        int n2 = C[84];
        n2 += C[85];
        Intrinsics.checkNotNullParameter(it, (String)a[n2 += C[86]]);
        return it;
    }

    static {
        ModeSetting.b();
        long l2 = -4179918812563137608L;
        long l3 = -8100091948796585326L;
        long l4 = -8436795279339558005L;
        long l5 = -2119498907923338425L;
        long l6 = -3460075222976645189L;
        long l7 = 124668765565032162L;
        long l8 = 7892640883521467566L;
        long l9 = 8598830194767301380L;
        long l10 = -6138588326789924928L;
        long l11 = -5327014234307807220L;
        long l12 = 1329178579922863517L;
        long l13 = -6643892680400225912L;
        long l14 = -2538886908423228975L;
        long l15 = 1471415307878257128L;
        int n2 = C[87];
        n2 -= C[88];
        a = new Object[n2 -= C[89]];
        long l16 = l15;
        int n3 = C[90];
        n3 += C[91];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= C[92]);
        Object[] objectArray = new Object[C[93]];
        objectArray[ModeSetting.C[94]] = A;
        objectArray[ModeSetting.C[95]] = C[96];
        int n4 = C[97];
        Object object = ModeSetting.A()[C[98]];
        if (object == null) {
            char[] cArray = "\u5527\u5554\u555e\u5593\u54ba\u54bb\u5559\u559c\u555e\u554a\u554a\u54ea\u54c6\u5552\u554d\u559c\u559c\u5527\u559d\u5538\u54ec\u55a1\u5536\u5535\u5592\u5540\u5593\u5554\u5534\u5534\u5538\u54eb\u5534\u54c6\u54ed\u54eb\u54f8\u54ec\u5541\u5532\u553e\u5527\u55a1\u5540\u5528\u5552\u5524\u552f\u552b\u552d\u559e\u559f\u5534\u54f8\u554b\u55a1\u559f\u5529\u559b\u552f\u555e\u54ea\u554d\u54ed\u5534\u54f6\u5554\u5535\u54c9\u559c\u553e\u554f\u54f8\u54bc\u552b\u54c4\u54f5\u554f\u553e\u54f8\u555e\u5539\u54f7\u54c8\u5532\u5534\u54f9\u554f\u553e\u5538\u5535\u5534\u54bc\u5557\u5534\u54f5\u54f9\u54f6\u5540\u552f\u552c\u5537\u54ed\u5528\u54ed\u5556\u54f5\u5592\u559d\u559d\u54f4\u5555\u559b\u553f\u559f\u54ed\u5529\u552d\u554f\u54f6\u5527\u553e\u559b\u54c9\u555e\u553f\u559a\u552c".toCharArray();
            for (int i2 = C[99]; i2 < C[100]; ++i2) {
                int n5 = cArray[i2];
                n5 -= C[101];
                n5 -= C[102];
                n5 ^= C[103];
                n5 += C[104];
                n5 += C[105];
                n5 -= C[106];
                n5 ^= C[107];
                n5 -= C[108];
                n5 += C[109];
                n5 += C[110];
                n5 ^= C[111];
                n5 ^= C[112];
                n5 -= C[113];
                n5 -= C[114];
                cArray[i2] = (char)(n5 -= C[115]);
            }
            object = ModeSetting.A()[ModeSetting.C[116]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)ModeSetting.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = C[117];
        n6 += C[118];
        l6 = l17 ^ (0x4B00000000L ^ l17) & -1L << (n6 += C[119]);
        long l18 = l13;
        int n7 = C[120];
        n7 ^= C[121];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= C[122]);
        while (true) {
            int n8 = C[123];
            n8 ^= C[124];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= C[125]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = C[126];
            n10 += C[127];
            int n11 = C[129];
            n11 -= C[130];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= C[128])) & -1L >>> (n11 ^= C[131]);
            long l20 = l9;
            int n12 = C[132];
            n12 -= C[133];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= C[134]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = C[135];
            n14 -= C[136];
            int n15 = C[138];
            n15 ^= C[139];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += C[137])) & -1L >>> (n15 -= C[140]);
            int n16 = C[141];
            n16 ^= C[142];
            long l22 = l10;
            int n17 = C[144];
            n17 ^= C[145];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= C[143]) ^ l22) & -1L << (n17 ^= C[146]);
            int n18 = C[147];
            n18 += C[148];
            n18 += C[149];
            int n19 = C[150];
            n19 -= C[151];
            long l23 = l12;
            int n20 = C[153];
            n20 ^= C[154];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= C[152]))) ^ l23) & -1L >>> (n20 += C[155]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = C[156];
            n21 += C[157];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= C[158]);
            while (true) {
                int n22 = C[159];
                n22 += C[160];
                if ((int)(l14 >>> (n22 ^= C[161])) >= (int)l12) break;
                int n23 = C[162];
                n23 -= C[163];
                int n24 = C[165];
                n24 += C[166];
                cArray2[(int)(l14 >>> (n23 -= ModeSetting.C[164]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += C[167]))];
                l14 += 0x100000000L;
            }
            int n25 = C[168];
            n25 -= C[169];
            int n26 = (int)(l15 >>> (n25 ^= C[170]));
            l15 += 0x100000000L;
            ModeSetting.a[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = C[171];
            n27 ^= C[172];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += C[173]);
        }
        m = new a(null);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[C[174]];
        String string = (String)object[C[175]];
        object = object[C[176]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[177]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[178]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[180] ^ C[181]];
                byArray[ModeSetting.C[182] ^ ModeSetting.C[183]] = C[184] ^ C[185];
                byArray[ModeSetting.C[186] ^ ModeSetting.C[187]] = C[188] ^ C[189];
                byArray[ModeSetting.C[190] ^ ModeSetting.C[191]] = C[192] ^ C[193];
                byArray[ModeSetting.C[194] ^ ModeSetting.C[195]] = C[196] ^ C[197];
                byArray[ModeSetting.C[198] ^ ModeSetting.C[199]] = C[200] ^ C[201];
                byArray[ModeSetting.C[202] ^ ModeSetting.C[203]] = C[204] ^ C[205];
                byArray[ModeSetting.C[206] ^ ModeSetting.C[207]] = C[208] ^ C[209];
                byArray[ModeSetting.C[210] ^ ModeSetting.C[211]] = C[212] ^ C[213];
                byArray[ModeSetting.C[214] ^ ModeSetting.C[215]] = C[216] ^ C[217];
                byArray[ModeSetting.C[218] ^ ModeSetting.C[219]] = C[220] ^ C[221];
                byArray[ModeSetting.C[222] ^ ModeSetting.C[223]] = C[224] ^ C[225];
                byArray[ModeSetting.C[226] ^ ModeSetting.C[227]] = C[228] ^ C[229];
                byArray[ModeSetting.C[230] ^ ModeSetting.C[231]] = C[232] ^ C[233];
                byArray[ModeSetting.C[234] ^ ModeSetting.C[235]] = C[236] ^ C[237];
                byArray[ModeSetting.C[238] ^ ModeSetting.C[239]] = C[240] ^ C[241];
                byArray[ModeSetting.C[242] ^ ModeSetting.C[243]] = C[244] ^ C[245];
                objectArray2[ModeSetting.C[179]] = byArray;
            }
            byte[] byArray = (byte[])object3[C[246]];
            if (b == null) {
                byte[] byArray2 = new byte[C[247] ^ C[248]];
                byArray2[ModeSetting.C[249] ^ ModeSetting.C[250]] = C[251] ^ C[252];
                byArray2[ModeSetting.C[253] ^ ModeSetting.C[254]] = C[255] ^ C[256];
                byArray2[ModeSetting.C[257] ^ ModeSetting.C[258]] = C[259] ^ C[260];
                byArray2[ModeSetting.C[261] ^ ModeSetting.C[262]] = C[263] ^ C[264];
                byArray2[ModeSetting.C[265] ^ ModeSetting.C[266]] = C[267] ^ C[268];
                byArray2[ModeSetting.C[269] ^ ModeSetting.C[270]] = C[271] ^ C[272];
                byArray2[ModeSetting.C[273] ^ ModeSetting.C[274]] = C[275] ^ C[276];
                byArray2[ModeSetting.C[277] ^ ModeSetting.C[278]] = C[279] ^ C[280];
                byArray2[ModeSetting.C[281] ^ ModeSetting.C[282]] = C[283] ^ C[284];
                byArray2[ModeSetting.C[285] ^ ModeSetting.C[286]] = C[287] ^ C[288];
                byArray2[ModeSetting.C[289] ^ ModeSetting.C[290]] = C[291] ^ C[292];
                byArray2[ModeSetting.C[293] ^ ModeSetting.C[294]] = C[295] ^ C[296];
                byArray2[ModeSetting.C[297] ^ ModeSetting.C[298]] = C[299] ^ C[300];
                byArray2[ModeSetting.C[301] ^ ModeSetting.C[302]] = C[303] ^ C[304];
                byArray2[ModeSetting.C[305] ^ ModeSetting.C[306]] = C[307] ^ C[308];
                byArray2[ModeSetting.C[309] ^ ModeSetting.C[310]] = C[311] ^ C[312];
                byArray2[ModeSetting.C[313] ^ ModeSetting.C[314]] = C[315] ^ C[316];
                byArray2[ModeSetting.C[317] ^ ModeSetting.C[318]] = C[319] ^ C[320];
                byArray2[ModeSetting.C[321] ^ ModeSetting.C[322]] = C[323] ^ C[324];
                byArray2[ModeSetting.C[325] ^ ModeSetting.C[326]] = C[327] ^ C[328];
                byArray2[ModeSetting.C[329] ^ ModeSetting.C[330]] = C[331] ^ C[332];
                byArray2[ModeSetting.C[333] ^ ModeSetting.C[334]] = C[335] ^ C[336];
                byArray2[ModeSetting.C[337] ^ ModeSetting.C[338]] = C[339] ^ C[340];
                byArray2[ModeSetting.C[341] ^ ModeSetting.C[342]] = C[343] ^ C[344];
                byArray2[ModeSetting.C[345] ^ ModeSetting.C[346]] = C[347] ^ C[348];
                byArray2[ModeSetting.C[349] ^ ModeSetting.C[350]] = C[351] ^ C[352];
                byArray2[ModeSetting.C[353] ^ ModeSetting.C[354]] = C[355] ^ C[356];
                byArray2[ModeSetting.C[357] ^ ModeSetting.C[358]] = C[359] ^ C[360];
                byArray2[ModeSetting.C[361] ^ ModeSetting.C[362]] = C[363] ^ C[364];
                byArray2[ModeSetting.C[365] ^ ModeSetting.C[366]] = C[367] ^ C[368];
                byArray2[ModeSetting.C[369] ^ ModeSetting.C[370]] = C[371] ^ C[372];
                byArray2[ModeSetting.C[373] ^ ModeSetting.C[374]] = C[375] ^ C[376];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, C[377], byArray3, C[378], byArray.length);
                System.arraycopy(byArray2, C[379], byArray3, byArray.length, byArray2.length);
                Object object4 = ModeSetting.A()[C[380]];
                if (object4 == null) {
                    char[] cArray = "\u5141\u5707\u56e4\u571d\u56e3\u5137\u5158\u5126\u53cd\u5129\u5709\u5702\u512e\u512c\u515c\u5709\u570e\u513e".toCharArray();
                    for (int i2 = C[381]; i2 < C[382]; ++i2) {
                        int n3 = cArray[i2];
                        n3 += C[383];
                        n3 += C[384];
                        n3 ^= C[385];
                        n3 ^= C[386];
                        n3 += C[387];
                        n3 ^= C[388];
                        n3 += C[389];
                        n3 ^= C[390];
                        n3 += C[391];
                        n3 ^= C[392];
                        n3 -= C[393];
                        cArray[i2] = (char)(n3 ^= C[394]);
                    }
                    object4 = ModeSetting.A()[ModeSetting.C[395]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[C[396]];
                byArray4[ModeSetting.C[397]] = C[398];
                byArray4[ModeSetting.C[399]] = 76;
                byArray4[10] = 18;
                byArray4[1] = -76;
                byArray4[5] = -4;
                byArray4[14] = -106;
                byArray4[9] = 86;
                byArray4[4] = -105;
                byArray4[15] = 35;
                byArray4[3] = -56;
                byArray4[7] = 46;
                byArray4[11] = 60;
                byArray4[12] = -20;
                byArray4[8] = 92;
                byArray4[0] = 21;
                byArray4[6] = -9;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 3, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = ModeSetting.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u1604\u1610\u160a".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 62017;
                        n4 ^= 0x6203;
                        n4 -= 13188;
                        n4 -= 42884;
                        n4 -= 27542;
                        n4 ^= 0xCAB6;
                        n4 += 17335;
                        n4 ^= 0x9077;
                        n4 += 58634;
                        n4 ^= 0x865A;
                        n4 ^= 0x71AE;
                        cArray[i3] = (char)(n4 += 49807);
                    }
                    object5 = ModeSetting.A()[2] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = ModeSetting.A()[3];
            if (object6 == null) {
                char[] cArray = "\ue922\ue93e\ue894\ue8c8\ue924\ue923\ue924\ue8c8\ue929\ue92c\ue924\ue894\ue90e\ue929\ue882\ue885\ue885\ue88a\ue887\ue880".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= 0x75D1;
                    n5 -= 6098;
                    n5 += 32756;
                    n5 ^= 0x825;
                    n5 -= 19781;
                    n5 += 5783;
                    n5 += 5545;
                    n5 -= 53210;
                    n5 -= 12891;
                    n5 += 8445;
                    cArray[i4] = (char)(n5 += 62798);
                }
                object6 = ModeSetting.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)b), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = c;
        if (c == null) {
            c = new Object[4];
            objectArray = c;
        }
        return objectArray;
    }

    public static void b() {
        C = new int[0x4418 ^ 0x4588];
        ModeSetting.C[0xA1A9 ^ 0xA18D] = 0xA124 ^ 0xA18D;
        ModeSetting.C[0xC8EA ^ 0xC80B] = 0x8702 ^ 0xC80B;
        ModeSetting.C[0xCE18 ^ 0xCF0E] = 0x63CF ^ 0xCF0E;
        ModeSetting.C[0xFDCA ^ 0xFD2F] = 0xA93E ^ 0xFD2F;
        ModeSetting.C[0x10719 ^ 0x1075D] = 0x1075A ^ 0x1075D;
        ModeSetting.C[0xBC91 ^ 0xBC63] = 0xC237 ^ 0xBC63;
        ModeSetting.C[0x991B ^ 0x982E] = 0xDA40 ^ 0x982E;
        ModeSetting.C[0x7D70 ^ 0x7D1C] = 0xADEF ^ 0x7D1C;
        ModeSetting.C[0x9C23 ^ 0x9CE0] = 0xC5E0 ^ 0x9CE0;
        ModeSetting.C[0xA1AE ^ 0xA1BF] = 0xFFFF5E39 ^ 0xA1BF;
        ModeSetting.C[0x1F37 ^ 0x1FD0] = 0xCF43 ^ 0x1FD0;
        ModeSetting.C[0x7E76 ^ 0x7F77] = 0x468A ^ 0x7F77;
        ModeSetting.C[0x89EF ^ 0x89AA] = 0x89FB ^ 0x89AA;
        ModeSetting.C[0xCAC5 ^ 0xCA9B] = 0xCA9B ^ 0xCA9B;
        ModeSetting.C[0x8CB1 ^ 0x8C47] = 0x8C47 ^ 0x8C47;
        ModeSetting.C[0xD701 ^ 0xD780] = 0xFFFF280F ^ 0xD780;
        ModeSetting.C[0x1829 ^ 0x193C] = 0xB5F2 ^ 0x193C;
        ModeSetting.C[0xDF21 ^ 0xDFB8] = 0xDFA7 ^ 0xDFB8;
        ModeSetting.C[0x92FE ^ 0x93C3] = 0x8C52 ^ 0x93C3;
        ModeSetting.C[0xAD5F ^ 0xAD5D] = 0xAD28 ^ 0xAD5D;
        ModeSetting.C[0x6279 ^ 0x632D] = 0xD769 ^ 0x632D;
        ModeSetting.C[0xA751 ^ 0xA768] = 0xFFFF5895 ^ 0xA768;
        ModeSetting.C[0xE010 ^ 0xE030] = 0xFFFF1FB1 ^ 0xE030;
        ModeSetting.C[0x711E ^ 0x71A4] = 0x1F01 ^ 0x71A4;
        ModeSetting.C[0x10960 ^ 0x10807] = 0x15AF1 ^ 0x10807;
        ModeSetting.C[0x279A ^ 0x26B7] = 0x2390 ^ 0x26B7;
        ModeSetting.C[0x58E8 ^ 0x5991] = 0x5991 ^ 0x5991;
        ModeSetting.C[0xE448 ^ 0xE518] = 0xF75C ^ 0xE518;
        ModeSetting.C[0xAB48 ^ 0xAA17] = 0xFFFF2183 ^ 0xAA17;
        ModeSetting.C[0xCA43 ^ 0xCAD6] = 0xFFFF354C ^ 0xCAD6;
        ModeSetting.C[0x4708 ^ 0x4647] = 0x5472 ^ 0x4647;
        ModeSetting.C[0x2705 ^ 0x264C] = 0xE4E3 ^ 0x264C;
        ModeSetting.C[0x8EB0 ^ 0x8FA7] = 0x2367 ^ 0x8FA7;
        ModeSetting.C[0xF3DC ^ 0xF346] = 0xF306 ^ 0xF346;
        ModeSetting.C[0xA994 ^ 0xA8FA] = 0x235F ^ 0xA8FA;
        ModeSetting.C[0x821E ^ 0x8278] = 0x901A ^ 0x8278;
        ModeSetting.C[0x1548 ^ 0x1468] = 0x1FF7 ^ 0x1468;
        ModeSetting.C[0xC3EA ^ 0xC320] = 0x707B ^ 0xC320;
        ModeSetting.C[0x84A9 ^ 0x848C] = 0xFFFF7B0B ^ 0x848C;
        ModeSetting.C[0xAAA2 ^ 0xABFF] = 0xDFFD ^ 0xABFF;
        ModeSetting.C[0xD744 ^ 0xD7FC] = 0xFFFF990B ^ 0xD7FC;
        ModeSetting.C[0x5CD5 ^ 0x5D5E] = 0x5D5F ^ 0x5D5E;
        ModeSetting.C[0x202A ^ 0x20FB] = 0xEA7 ^ 0x20FB;
        ModeSetting.C[0x492C ^ 0x48AD] = 0xCB8F ^ 0x48AD;
        ModeSetting.C[0x69C0 ^ 0x69FA] = 0x69CE ^ 0x69FA;
        ModeSetting.C[0xCA30 ^ 0xCA9F] = 0xCA9D ^ 0xCA9F;
        ModeSetting.C[0x93B2 ^ 0x92F0] = 0x6D6E ^ 0x92F0;
        ModeSetting.C[0x3186 ^ 0x315E] = 0x6A87 ^ 0x315E;
        ModeSetting.C[0x9A70 ^ 0x9B57] = 0x19223 ^ 0x9B57;
        ModeSetting.C[0x1036 ^ 0x117D] = 0xD3F0 ^ 0x117D;
        ModeSetting.C[0x6985 ^ 0x696D] = 0xB9C9 ^ 0x696D;
        ModeSetting.C[0xD16B ^ 0xD1B2] = 0x8A60 ^ 0xD1B2;
        ModeSetting.C[0xD220 ^ 0xD31A] = 0x2547 ^ 0xD31A;
        ModeSetting.C[0x1422 ^ 0x1546] = 0x7946 ^ 0x1546;
        ModeSetting.C[0x7122 ^ 0x7151] = 0x8DAF ^ 0x7151;
        ModeSetting.C[0x1369 ^ 0x12E6] = 0x12EB ^ 0x12E6;
        ModeSetting.C[0x9652 ^ 0x9774] = 0x19E75 ^ 0x9774;
        ModeSetting.C[0x370D ^ 0x365F] = 0x821B ^ 0x365F;
        ModeSetting.C[0xD8EC ^ 0xD88B] = 0xC04C ^ 0xD88B;
        ModeSetting.C[0x683E ^ 0x69B4] = 0x95DB ^ 0x69B4;
        ModeSetting.C[0x38EE ^ 0x38DE] = 0x38C6 ^ 0x38DE;
        ModeSetting.C[0xA198 ^ 0xA0F3] = 0x9F73 ^ 0xA0F3;
        ModeSetting.C[0x617D ^ 0x601F] = 0xC1F ^ 0x601F;
        ModeSetting.C[0x93E7 ^ 0x9382] = 0x9BC2 ^ 0x9382;
        ModeSetting.C[0x8B57 ^ 0x8AD4] = 0xA467 ^ 0x8AD4;
        ModeSetting.C[0xCCC ^ 0xC08] = 0x5566 ^ 0xC08;
        ModeSetting.C[0xDF5 ^ 0xDC6] = 0xFFFFF22B ^ 0xDC6;
        ModeSetting.C[0x313F ^ 0x3047] = 0x1ABE ^ 0x3047;
        ModeSetting.C[0xEF2C ^ 0xEF53] = 0xFFFF10D4 ^ 0xEF53;
        ModeSetting.C[0x3907 ^ 0x385E] = 0xD9E6 ^ 0x385E;
        ModeSetting.C[0xDEBF ^ 0xDFB6] = 0xE2E ^ 0xDFB6;
        ModeSetting.C[0x2CE9 ^ 0x2DC2] = 0xFFFFAA18 ^ 0x2DC2;
        ModeSetting.C[0x6B2C ^ 0x6B75] = 0xFFFF94C0 ^ 0x6B75;
        ModeSetting.C[0x311D ^ 0x3112] = 0xFFFFCE18 ^ 0x3112;
        ModeSetting.C[0x52BD ^ 0x52FE] = 0x52DA ^ 0x52FE;
        ModeSetting.C[0xBF78 ^ 0xBE7E] = 0xE68A ^ 0xBE7E;
        ModeSetting.C[0x7FF ^ 0x759] = 0x73A ^ 0x759;
        ModeSetting.C[0x9CE5 ^ 0x9DFE] = 0xFFFF9AB6 ^ 0x9DFE;
        ModeSetting.C[0x7DEB ^ 0x7CF1] = 0x843E ^ 0x7CF1;
        ModeSetting.C[0xF550 ^ 0xF58F] = 0xBA86 ^ 0xF58F;
        ModeSetting.C[0x19A0 ^ 0x18B0] = 0xD861 ^ 0x18B0;
        ModeSetting.C[0xE583 ^ 0xE5DE] = 0xE5DD ^ 0xE5DE;
        ModeSetting.C[0xDF11 ^ 0xDFB4] = 0xFFFF201B ^ 0xDFB4;
        ModeSetting.C[0xE5DE ^ 0xE490] = 0xF6D4 ^ 0xE490;
        ModeSetting.C[0x83B0 ^ 0x83E5] = 0xFFFF7C03 ^ 0x83E5;
        ModeSetting.C[0xF65A ^ 0xF650] = 0xF666 ^ 0xF650;
        ModeSetting.C[0x2254 ^ 0x236F] = 0xD556 ^ 0x236F;
        ModeSetting.C[0x99FB ^ 0x997E] = 0x9972 ^ 0x997E;
        ModeSetting.C[0xDBC5 ^ 0xDB55] = 0xFFFF24B0 ^ 0xDB55;
        ModeSetting.C[0x8177 ^ 0x8056] = 0xD135 ^ 0x8056;
        ModeSetting.C[0x616C ^ 0x61AA] = 0xD8E1 ^ 0x61AA;
        ModeSetting.C[0xD4F4 ^ 0xD467] = 0xD4DC ^ 0xD467;
        ModeSetting.C[0x553C ^ 0x5585] = 0xE4CC ^ 0x5585;
        ModeSetting.C[0xAB06 ^ 0xAB86] = 0xFFFF5440 ^ 0xAB86;
        ModeSetting.C[0x82E5 ^ 0x8235] = 0xAC4F ^ 0x8235;
        ModeSetting.C[0x1DD2 ^ 0x1DFF] = 0x1DFC ^ 0x1DFF;
        ModeSetting.C[0xD159 ^ 0xD1A7] = 0x6A68 ^ 0xD1A7;
        ModeSetting.C[0x8E39 ^ 0x8EA8] = 0x8EEE ^ 0x8EA8;
        ModeSetting.C[0xFF86 ^ 0xFFAE] = 0xFFAF ^ 0xFFAE;
        ModeSetting.C[0x5108 ^ 0x516B] = 0x516B ^ 0x516B;
        ModeSetting.C[0x9138 ^ 0x9047] = 0x5B97 ^ 0x9047;
        ModeSetting.C[0x2CAE ^ 0x2CDC] = 0xC1A1 ^ 0x2CDC;
        ModeSetting.C[0x58AF ^ 0x58D7] = 0xFFFFA775 ^ 0x58D7;
        ModeSetting.C[0x8531 ^ 0x843F] = 0x44EE ^ 0x843F;
        ModeSetting.C[0x2D36 ^ 0x2DF8] = 0x3A8 ^ 0x2DF8;
        ModeSetting.C[0x6015 ^ 0x613F] = 0x197F ^ 0x613F;
        ModeSetting.C[0x12FF ^ 0x12D4] = 0xFFFFED0A ^ 0x12D4;
        ModeSetting.C[0x3827 ^ 0x3873] = 0xFFFFC780 ^ 0x3873;
        ModeSetting.C[0x97F7 ^ 0x9740] = 0x2609 ^ 0x9740;
        ModeSetting.C[0xDFEF ^ 0xDEEA] = 0x861E ^ 0xDEEA;
        ModeSetting.C[0xA041 ^ 0xA136] = 0xFFFF7460 ^ 0xA136;
        ModeSetting.C[0xD68A ^ 0xD608] = 0xFFFF29F6 ^ 0xD608;
        ModeSetting.C[0xB6A9 ^ 0xB669] = 0xFFFFB5C1 ^ 0xB669;
        ModeSetting.C[0x10756 ^ 0x107D1] = 0x10762 ^ 0x107D1;
        ModeSetting.C[0x103F9 ^ 0x102F6] = 0x1C232 ^ 0x102F6;
        ModeSetting.C[0x1051 ^ 0x1149] = 0xBD88 ^ 0x1149;
        ModeSetting.C[0x7CB9 ^ 0x7CBF] = 0x7CB2 ^ 0x7CBF;
        ModeSetting.C[0x6A2F ^ 0x6B5B] = 0xD431 ^ 0x6B5B;
        ModeSetting.C[0x55BA ^ 0x55CB] = 0x62B0 ^ 0x55CB;
        ModeSetting.C[0xC1B7 ^ 0xC114] = 0xC132 ^ 0xC114;
        ModeSetting.C[0x686A ^ 0x68E3] = 0xFFFF9753 ^ 0x68E3;
        ModeSetting.C[0x9140 ^ 0x903D] = 0x903D ^ 0x903D;
        ModeSetting.C[0xAA34 ^ 0xAB16] = 0xFA63 ^ 0xAB16;
        ModeSetting.C[0xBB67 ^ 0xBB2E] = 0xBB7E ^ 0xBB2E;
        ModeSetting.C[0xAE19 ^ 0xAE22] = 0xFFFF518B ^ 0xAE22;
        ModeSetting.C[0x466A ^ 0x4775] = 0xFFFFB339 ^ 0x4775;
        ModeSetting.C[0x9D82 ^ 0x9DF9] = 0xFFFF6274 ^ 0x9DF9;
        ModeSetting.C[0x3942 ^ 0x3938] = 0xFFFFC6BE ^ 0x3938;
        ModeSetting.C[0xE091 ^ 0xE0C6] = 0xFFFF1F04 ^ 0xE0C6;
        ModeSetting.C[0x6B20 ^ 0x6A76] = 0x325B ^ 0x6A76;
        ModeSetting.C[0xBA14 ^ 0xBA14] = 0xFFFF4585 ^ 0xBA14;
        ModeSetting.C[0x81FB ^ 0x8133] = 0x3806 ^ 0x8133;
        ModeSetting.C[0x7E45 ^ 0x7F6B] = 0x7A55 ^ 0x7F6B;
        ModeSetting.C[0x3541 ^ 0x3529] = 0x5F22 ^ 0x3529;
        ModeSetting.C[0xE2AF ^ 0xE3E5] = 0x2152 ^ 0xE3E5;
        ModeSetting.C[0x789E ^ 0x79FD] = 0x15E3 ^ 0x79FD;
        ModeSetting.C[0xD2D2 ^ 0xD2A6] = 0xD2A6 ^ 0xD2A6;
        ModeSetting.C[0x1FDD ^ 0x1F96] = 0x1FF0 ^ 0x1F96;
        ModeSetting.C[0x40D5 ^ 0x40C3] = 0x4087 ^ 0x40C3;
        ModeSetting.C[0x9B69 ^ 0x9A70] = 0x62BB ^ 0x9A70;
        ModeSetting.C[0x2170 ^ 0x204E] = 0x3FD5 ^ 0x204E;
        ModeSetting.C[0xC475 ^ 0xC465] = 0xC412 ^ 0xC465;
        ModeSetting.C[0x1A12 ^ 0x1ABA] = 0xFFFFE537 ^ 0x1ABA;
        ModeSetting.C[0x1A88 ^ 0x1A5F] = 0x418D ^ 0x1A5F;
        ModeSetting.C[0x8CBE ^ 0x8DCB] = 0xA728 ^ 0x8DCB;
        ModeSetting.C[0x447 ^ 0x44C] = 0x435 ^ 0x44C;
        ModeSetting.C[0x316B ^ 0x3159] = 0x316F ^ 0x3159;
        ModeSetting.C[0x49E2 ^ 0x490F] = 0x945A ^ 0x490F;
        ModeSetting.C[0x5004 ^ 0x5065] = 0x5067 ^ 0x5065;
        ModeSetting.C[0xE87F ^ 0xE8CD] = 0xE8CC ^ 0xE8CD;
        ModeSetting.C[0x1C3F ^ 0x1C83] = 0xFFFF8D90 ^ 0x1C83;
        ModeSetting.C[0x55F4 ^ 0x555F] = 0x5502 ^ 0x555F;
        ModeSetting.C[0xE685 ^ 0xE7C3] = 0x1A98 ^ 0xE7C3;
        ModeSetting.C[0xEAED ^ 0xEBAA] = 0xFFFFE974 ^ 0xEBAA;
        ModeSetting.C[0x84F5 ^ 0x85C6] = 0x72CD ^ 0x85C6;
        ModeSetting.C[0x53C5 ^ 0x5367] = 0xFFFFAC8E ^ 0x5367;
        ModeSetting.C[0xB48 ^ 0xBF7] = 0xF7DF ^ 0xBF7;
        ModeSetting.C[0x76B1 ^ 0x76BF] = 0xFFFF895F ^ 0x76BF;
        ModeSetting.C[0xBAC5 ^ 0xBA5D] = 0xBA71 ^ 0xBA5D;
        ModeSetting.C[0xCD74 ^ 0xCDA2] = 0x967D ^ 0xCDA2;
        ModeSetting.C[0xCC00 ^ 0xCCFF] = 0x7728 ^ 0xCCFF;
        ModeSetting.C[0x71FF ^ 0x7077] = 0xDDAB ^ 0x7077;
        ModeSetting.C[0x2260 ^ 0x2362] = 0x1A9C ^ 0x2362;
        ModeSetting.C[0x2FAE ^ 0x2EC4] = 0x1138 ^ 0x2EC4;
        ModeSetting.C[0xA547 ^ 0xA5CC] = 0xA5EA ^ 0xA5CC;
        ModeSetting.C[0x103AA ^ 0x10377] = 0x125CA ^ 0x10377;
        ModeSetting.C[0x7D42 ^ 0x7C07] = 0x8159 ^ 0x7C07;
        ModeSetting.C[0xAFBE ^ 0xAF77] = 0x1635 ^ 0xAF77;
        ModeSetting.C[0xC351 ^ 0xC32C] = 0xC33F ^ 0xC32C;
        ModeSetting.C[0xFD75 ^ 0xFDD1] = 0xFFFF0272 ^ 0xFDD1;
        ModeSetting.C[0xD615 ^ 0xD6FA] = 0x5504 ^ 0xD6FA;
        ModeSetting.C[0x699B ^ 0x698E] = 0x6995 ^ 0x698E;
        ModeSetting.C[0x14C2 ^ 0x14FE] = 0xFFFFEB1E ^ 0x14FE;
        ModeSetting.C[0x62F6 ^ 0x62B1] = 0xFFFF9D41 ^ 0x62B1;
        ModeSetting.C[0xC4F0 ^ 0xC581] = 0x7AEA ^ 0xC581;
        ModeSetting.C[0xC58E ^ 0xC52F] = 0xC51C ^ 0xC52F;
        ModeSetting.C[0xE72E ^ 0xE679] = 0xBE70 ^ 0xE679;
        ModeSetting.C[0xB76E ^ 0xB7DB] = 0x3EC3 ^ 0xB7DB;
        ModeSetting.C[0x45B4 ^ 0x4482] = 0x6E0 ^ 0x4482;
        ModeSetting.C[0x3564 ^ 0x358F] = 0xE8DA ^ 0x358F;
        ModeSetting.C[0x9C48 ^ 0x9D42] = 0x4CC8 ^ 0x9D42;
        ModeSetting.C[0x593B ^ 0x59A6] = 0xFFFFA653 ^ 0x59A6;
        ModeSetting.C[0x36A9 ^ 0x37F2] = 0xFFFF2997 ^ 0x37F2;
        ModeSetting.C[0xD043 ^ 0xD011] = 0xFFFF2FC9 ^ 0xD011;
        ModeSetting.C[0x572C ^ 0x5762] = 0x5767 ^ 0x5762;
        ModeSetting.C[0xFF13 ^ 0xFFC9] = 0xD977 ^ 0xFFC9;
        ModeSetting.C[0xBC99 ^ 0xBCA8] = 0xBCEE ^ 0xBCA8;
        ModeSetting.C[0xD361 ^ 0xD3AD] = 0x609B ^ 0xD3AD;
        ModeSetting.C[0xCD6 ^ 0xCB4] = 0xCB4 ^ 0xCB4;
        ModeSetting.C[0xF484 ^ 0xF499] = 0xF4D7 ^ 0xF499;
        ModeSetting.C[0xB03C ^ 0xB01F] = 0xB028 ^ 0xB01F;
        ModeSetting.C[0x10DEA ^ 0x10DA2] = 0x10D24 ^ 0x10DA2;
        ModeSetting.C[0xF798 ^ 0xF7D2] = 0xFFFF0838 ^ 0xF7D2;
        ModeSetting.C[0x4A9D ^ 0x4AA9] = 0x4AE7 ^ 0x4AA9;
        ModeSetting.C[0xBDDB ^ 0xBDFC] = 0xBDF7 ^ 0xBDFC;
        ModeSetting.C[0x6CAD ^ 0x6CF1] = 0x6CFF ^ 0x6CF1;
        ModeSetting.C[0x7A2F ^ 0x7B18] = 0xFFFFC6E1 ^ 0x7B18;
        ModeSetting.C[0x57E7 ^ 0x575C] = 0x39F3 ^ 0x575C;
        ModeSetting.C[0xE2BF ^ 0xE255] = 0x3F00 ^ 0xE255;
        ModeSetting.C[0x10E4E ^ 0x10EC1] = 0xFFFEF14D ^ 0x10EC1;
        ModeSetting.C[0xCC02 ^ 0xCCDE] = 0xEA2E ^ 0xCCDE;
        ModeSetting.C[0xC4 ^ 0x17] = 0x10BBC ^ 0x17;
        ModeSetting.C[0x4688 ^ 0x4708] = 0xDB18 ^ 0x4708;
        ModeSetting.C[0x10590 ^ 0x104E3] = 0xFFFE442D ^ 0x104E3;
        ModeSetting.C[0x9E1C ^ 0x9E05] = 0xFFFF61EC ^ 0x9E05;
        ModeSetting.C[0x57A2 ^ 0x5708] = 0xFFFFA8FB ^ 0x5708;
        ModeSetting.C[0x4865 ^ 0x4965] = 0xF2AA ^ 0x4965;
        ModeSetting.C[0x1FF9 ^ 0x1FBF] = 0xFFFFE01F ^ 0x1FBF;
        ModeSetting.C[0x17AE ^ 0x17AA] = 0xFFFFE844 ^ 0x17AA;
        ModeSetting.C[0xFEDF ^ 0xFFD3] = 0x2E59 ^ 0xFFD3;
        ModeSetting.C[0xD892 ^ 0xD891] = 0xFFFF27EF ^ 0xD891;
        ModeSetting.C[0xF4A9 ^ 0xF581] = 0x1FC80 ^ 0xF581;
        ModeSetting.C[0x869B ^ 0x8719] = 0xE12B ^ 0x8719;
        ModeSetting.C[0xFB4B ^ 0xFA48] = 0xC3CD ^ 0xFA48;
        ModeSetting.C[0xFF6C ^ 0xFF9F] = 0x81CA ^ 0xFF9F;
        ModeSetting.C[0x53B6 ^ 0x52DB] = 0xD976 ^ 0x52DB;
        ModeSetting.C[0xA023 ^ 0xA0BF] = 0xA029 ^ 0xA0BF;
        ModeSetting.C[0xCBD2 ^ 0xCA5E] = 0xCA4E ^ 0xCA5E;
        ModeSetting.C[0x415C ^ 0x411E] = 0x4135 ^ 0x411E;
        ModeSetting.C[0xA117 ^ 0xA179] = 0x6DEC ^ 0xA179;
        ModeSetting.C[0x4E1E ^ 0x4E77] = 0xCDDA ^ 0x4E77;
        ModeSetting.C[0x75F5 ^ 0x7473] = 0x6F99 ^ 0x7473;
        ModeSetting.C[0x77BB ^ 0x7792] = 0x7799 ^ 0x7792;
        ModeSetting.C[0x6998 ^ 0x6916] = 0x6924 ^ 0x6916;
        ModeSetting.C[0x69F ^ 0x7CC] = 0xFFFF4C6E ^ 0x7CC;
        ModeSetting.C[0x1E8 ^ 0xBD] = 0x5883 ^ 0xBD;
        ModeSetting.C[0x3E48 ^ 0x3E9C] = 0x1355B ^ 0x3E9C;
        ModeSetting.C[0xC2CE ^ 0xC2E0] = 0xC2B9 ^ 0xC2E0;
        ModeSetting.C[0xA33 ^ 0xAD1] = 0x5EC5 ^ 0xAD1;
        ModeSetting.C[0x45CF ^ 0x44F0] = 0xFFFFA4B3 ^ 0x44F0;
        ModeSetting.C[0x9348 ^ 0x922E] = 0xC0D6 ^ 0x922E;
        ModeSetting.C[0xB1AE ^ 0xB11D] = 0xB11D ^ 0xB11D;
        ModeSetting.C[0xDD3 ^ 0xD88] = 0xFFFFF22A ^ 0xD88;
        ModeSetting.C[0x9590 ^ 0x95DC] = 0xFFFF6A50 ^ 0x95DC;
        ModeSetting.C[0xA675 ^ 0xA769] = 0x5FA6 ^ 0xA769;
        ModeSetting.C[0xE77A ^ 0xE6F3] = 0x5C7D ^ 0xE6F3;
        ModeSetting.C[0xF864 ^ 0xF89F] = 0x1F0EB ^ 0xF89F;
        ModeSetting.C[0xFD80 ^ 0xFCFB] = 0xFCFB ^ 0xFCFB;
        ModeSetting.C[0x3BCA ^ 0x3BFF] = 0x3BC0 ^ 0x3BFF;
        ModeSetting.C[0x6867 ^ 0x68C9] = 0x68C8 ^ 0x68C9;
        ModeSetting.C[0x428C ^ 0x42A3] = 0x42F9 ^ 0x42A3;
        ModeSetting.C[0xB7C1 ^ 0xB73B] = 0x1BF6B ^ 0xB73B;
        ModeSetting.C[0x7CC8 ^ 0x7C3F] = 0xBFE7 ^ 0x7C3F;
        ModeSetting.C[0x45DB ^ 0x45E5] = 0x45D1 ^ 0x45E5;
        ModeSetting.C[0x6E9C ^ 0x6FD0] = 0xAD67 ^ 0x6FD0;
        ModeSetting.C[0x9A0A ^ 0x9A5A] = 0x9A44 ^ 0x9A5A;
        ModeSetting.C[0xB134 ^ 0xB011] = 0x1B91B ^ 0xB011;
        ModeSetting.C[0x10A47 ^ 0x10A58] = 0xFFFEF5B6 ^ 0x10A58;
        ModeSetting.C[0x3B88 ^ 0x3B38] = 0x3B38 ^ 0x3B38;
        ModeSetting.C[0xB891 ^ 0xB878] = 0x68EB ^ 0xB878;
        ModeSetting.C[0x7E44 ^ 0x7F5A] = 0x74C5 ^ 0x7F5A;
        ModeSetting.C[0xFA54 ^ 0xFAB4] = 0xFFFF4A72 ^ 0xFAB4;
        ModeSetting.C[0x5E9 ^ 0x4C5] = 0x7C85 ^ 0x4C5;
        ModeSetting.C[0x60F7 ^ 0x617A] = 0x6178 ^ 0x617A;
        ModeSetting.C[0xF642 ^ 0xF6E5] = 0xF6EB ^ 0xF6E5;
        ModeSetting.C[0x1F66 ^ 0x1FCF] = 0xFFFFE075 ^ 0x1FCF;
        ModeSetting.C[0xCB0F ^ 0xCBE1] = 0x4819 ^ 0xCBE1;
        ModeSetting.C[0xE833 ^ 0xE8AC] = 0xE8AF ^ 0xE8AC;
        ModeSetting.C[0xB43 ^ 0xA2A] = 0x35C8 ^ 0xA2A;
        ModeSetting.C[0x35D5 ^ 0x34B5] = 0x40A2 ^ 0x34B5;
        ModeSetting.C[0x121C ^ 0x1294] = 0x12F6 ^ 0x1294;
        ModeSetting.C[0x81F1 ^ 0x81E3] = 0xFFFF7E60 ^ 0x81E3;
        ModeSetting.C[0xE9E4 ^ 0xE8D0] = 0x1FEC ^ 0xE8D0;
        ModeSetting.C[0x1096B ^ 0x10915] = 0x10955 ^ 0x10915;
        ModeSetting.C[0xF4D7 ^ 0xF42F] = 0x37D7 ^ 0xF42F;
        ModeSetting.C[0xC2B5 ^ 0xC3C3] = 0xE93A ^ 0xC3C3;
        ModeSetting.C[0x6DDC ^ 0x6C52] = 0xFFFF93B4 ^ 0x6C52;
        ModeSetting.C[0x37DB ^ 0x3719] = 0x6E17 ^ 0x3719;
        ModeSetting.C[0x9E9 ^ 0x9E1] = 0xFFFFF645 ^ 0x9E1;
        ModeSetting.C[0xCD0A ^ 0xCD89] = 0xFFFF3238 ^ 0xCD89;
        ModeSetting.C[0xD884 ^ 0xD813] = 0xD857 ^ 0xD813;
        ModeSetting.C[0x24B6 ^ 0x2592] = 0x74E7 ^ 0x2592;
        ModeSetting.C[0xDEA ^ 0xCF7] = 0x774 ^ 0xCF7;
        ModeSetting.C[0x5C09 ^ 0x5D66] = 0xFFFF2928 ^ 0x5D66;
        ModeSetting.C[0x8D7 ^ 0x898] = 0x8A1 ^ 0x898;
        ModeSetting.C[0xE36E ^ 0xE372] = 0xFFFF1C88 ^ 0xE372;
        ModeSetting.C[0x4E5E ^ 0x4ECA] = 0xFFFFB171 ^ 0x4ECA;
        ModeSetting.C[0x8C37 ^ 0x8CCE] = 0x18498 ^ 0x8CCE;
        ModeSetting.C[0xDCD3 ^ 0xDCF1] = 0xFFFF231E ^ 0xDCF1;
        ModeSetting.C[0x2B68 ^ 0x2B18] = 0x35C3 ^ 0x2B18;
        ModeSetting.C[0x7069 ^ 0x7150] = 0x8704 ^ 0x7150;
        ModeSetting.C[0x31D9 ^ 0x3183] = 0x310F ^ 0x3183;
        ModeSetting.C[0x4C81 ^ 0x4DAE] = 0x488B ^ 0x4DAE;
        ModeSetting.C[0x1F74 ^ 0x1F58] = 0x1F4F ^ 0x1F58;
        ModeSetting.C[0xBBD8 ^ 0xBBAF] = 0xFFFF443B ^ 0xBBAF;
        ModeSetting.C[0x275F ^ 0x263E] = 0x4A3C ^ 0x263E;
        ModeSetting.C[0x5A17 ^ 0x5AD8] = 0x7484 ^ 0x5AD8;
        ModeSetting.C[0x3822 ^ 0x396F] = 0x2B26 ^ 0x396F;
        ModeSetting.C[0x490F ^ 0x4950] = 0x4951 ^ 0x4950;
        ModeSetting.C[0x457A ^ 0x444B] = 0xB368 ^ 0x444B;
        ModeSetting.C[0x2FB6 ^ 0x2EBD] = 0xFFFF00BF ^ 0x2EBD;
        ModeSetting.C[0xBCA3 ^ 0xBDAB] = 0xE55F ^ 0xBDAB;
        ModeSetting.C[0x8E79 ^ 0x8F6A] = 0x4369 ^ 0x8F6A;
        ModeSetting.C[0xDC11 ^ 0xDCF2] = 0x88E3 ^ 0xDCF2;
        ModeSetting.C[0xA224 ^ 0xA318] = 0x5545 ^ 0xA318;
        ModeSetting.C[0xFF5F ^ 0xFFC1] = 0xFFAA ^ 0xFFC1;
        ModeSetting.C[0xFCB6 ^ 0xFDEA] = 0x1C4F ^ 0xFDEA;
        ModeSetting.C[0xE3B8 ^ 0xE3AB] = 0xE3A6 ^ 0xE3AB;
        ModeSetting.C[0xFECB ^ 0xFE10] = 0xD8AD ^ 0xFE10;
        ModeSetting.C[0x86DB ^ 0x87F8] = 0xD6FF ^ 0x87F8;
        ModeSetting.C[0xB11 ^ 0xB06] = 0xB5D ^ 0xB06;
        ModeSetting.C[0xD11B ^ 0xD1FD] = 0x165 ^ 0xD1FD;
        ModeSetting.C[0xDE49 ^ 0xDE2D] = 0xDEAD ^ 0xDE2D;
        ModeSetting.C[0x4A03 ^ 0x4B47] = 0xB4D9 ^ 0x4B47;
        ModeSetting.C[0x9299 ^ 0x9252] = 0x2106 ^ 0x9252;
        ModeSetting.C[0xD549 ^ 0xD59C] = 0x1DE37 ^ 0xD59C;
        ModeSetting.C[0x47A5 ^ 0x472F] = 0x4724 ^ 0x472F;
        ModeSetting.C[0x35B9 ^ 0x34CB] = 0x8BA1 ^ 0x34CB;
        ModeSetting.C[0xF24E ^ 0xF290] = 0xBD9D ^ 0xF290;
        ModeSetting.C[0x76DD ^ 0x76D0] = 0x76A2 ^ 0x76D0;
        ModeSetting.C[0xC40B ^ 0xC4FB] = 0x470B ^ 0xC4FB;
        ModeSetting.C[0xEE79 ^ 0xEE84] = 0x555F ^ 0xEE84;
        ModeSetting.C[0x1E75 ^ 0x1F78] = 0xDFB8 ^ 0x1F78;
        ModeSetting.C[0xF8FC ^ 0xF8CA] = 0xF8FC ^ 0xF8CA;
        ModeSetting.C[0x9BA8 ^ 0x9BC5] = 0xE0D1 ^ 0x9BC5;
        ModeSetting.C[0x935B ^ 0x9363] = 0xFFFF6C8F ^ 0x9363;
        ModeSetting.C[0x1DDD ^ 0x1CDA] = 0x442B ^ 0x1CDA;
        ModeSetting.C[0xA4DD ^ 0xA559] = 0x63DE ^ 0xA559;
        ModeSetting.C[0x112D ^ 0x1146] = 0xC868 ^ 0x1146;
        ModeSetting.C[0xD223 ^ 0xD2B5] = 0xD2E5 ^ 0xD2B5;
        ModeSetting.C[0x6AD2 ^ 0x6A1F] = 0xD94B ^ 0x6A1F;
        ModeSetting.C[0x3D2F ^ 0x3C3E] = 0xF005 ^ 0x3C3E;
        ModeSetting.C[0x9149 ^ 0x9126] = 0xEABD ^ 0x9126;
        ModeSetting.C[0xFAA2 ^ 0xFA2F] = 0xFFFF05B1 ^ 0xFA2F;
        ModeSetting.C[0x4E50 ^ 0x4F79] = 0x3737 ^ 0x4F79;
        ModeSetting.C[0x368B ^ 0x36D3] = 0x36D7 ^ 0x36D3;
        ModeSetting.C[0x6489 ^ 0x64F5] = 0xFFFF9B4B ^ 0x64F5;
        ModeSetting.C[0x1106 ^ 0x111D] = 0xFFFFEED1 ^ 0x111D;
        ModeSetting.C[0x18CB ^ 0x18E1] = 0xFFFFE728 ^ 0x18E1;
        ModeSetting.C[0xE11D ^ 0xE05D] = 0xFFC6 ^ 0xE05D;
        ModeSetting.C[0x1143 ^ 0x1115] = 0x1138 ^ 0x1115;
        ModeSetting.C[0x105C2 ^ 0x105D8] = 0x10590 ^ 0x105D8;
        ModeSetting.C[0xC2B6 ^ 0xC2D6] = 0xC2D6 ^ 0xC2D6;
        ModeSetting.C[0xA06A ^ 0xA110] = 0xA110 ^ 0xA110;
        ModeSetting.C[0x3E98 ^ 0x3E8C] = 0xFFFFC11C ^ 0x3E8C;
        ModeSetting.C[0xFE28 ^ 0xFEA4] = 0xFEA9 ^ 0xFEA4;
        ModeSetting.C[0x5A9A ^ 0x5A37] = 0x5A20 ^ 0x5A37;
        ModeSetting.C[0xD130 ^ 0xD06E] = 0xA479 ^ 0xD06E;
        ModeSetting.C[0x856D ^ 0x8561] = 0x8513 ^ 0x8561;
        ModeSetting.C[0xC57 ^ 0xCC5] = 0xFFFFF346 ^ 0xCC5;
        ModeSetting.C[0xE40C ^ 0xE58B] = 0x4980 ^ 0xE58B;
        ModeSetting.C[0xE26F ^ 0xE311] = 0xE303 ^ 0xE311;
        ModeSetting.C[0x2BF1 ^ 0x2B23] = 0x12080 ^ 0x2B23;
        ModeSetting.C[0x1B36 ^ 0x1BD2] = 0x4FF5 ^ 0x1BD2;
        ModeSetting.C[0x1DB8 ^ 0x1D3C] = 0xFFFFE2B2 ^ 0x1D3C;
        ModeSetting.C[0x95E2 ^ 0x9554] = 0x241F ^ 0x9554;
        ModeSetting.C[0xC789 ^ 0xC78E] = 0xFFFF3826 ^ 0xC78E;
        ModeSetting.C[0x9456 ^ 0x94E8] = 0x68C7 ^ 0x94E8;
        ModeSetting.C[0x1432 ^ 0x1461] = 0xFFFFEBF5 ^ 0x1461;
        ModeSetting.C[0x9315 ^ 0x9314] = 0xFFFF6CEF ^ 0x9314;
        ModeSetting.C[0x59DA ^ 0x5892] = 0xA5C9 ^ 0x5892;
        ModeSetting.C[0xCE9A ^ 0xCE93] = 0xFFFF3122 ^ 0xCE93;
        ModeSetting.C[0x652D ^ 0x65EC] = 0x99C4 ^ 0x65EC;
        ModeSetting.C[0x42BB ^ 0x420A] = 0x420B ^ 0x420A;
        ModeSetting.C[0xC927 ^ 0xC910] = 0xC930 ^ 0xC910;
        ModeSetting.C[0xE627 ^ 0xE6E0] = 0x5FA2 ^ 0xE6E0;
        ModeSetting.C[0xAAB8 ^ 0xAA9E] = 0xFFFF556E ^ 0xAA9E;
        ModeSetting.C[0xDA13 ^ 0xDB4B] = 0x8366 ^ 0xDB4B;
        ModeSetting.C[0xAFF3 ^ 0xAF53] = 0xAF43 ^ 0xAF53;
        ModeSetting.C[0xC939 ^ 0xC921] = 0xC910 ^ 0xC921;
        ModeSetting.C[0xC6FC ^ 0xC7CC] = 0xC2F2 ^ 0xC7CC;
        ModeSetting.C[0xE8F7 ^ 0xE882] = 0xE8C7 ^ 0xE882;
        ModeSetting.C[0xC832 ^ 0xC942] = 0x42E7 ^ 0xC942;
        ModeSetting.C[0x308A ^ 0x310F] = 0x1986 ^ 0x310F;
        ModeSetting.C[0x206C ^ 0x2090] = 0x128C0 ^ 0x2090;
        ModeSetting.C[0x1292 ^ 0x12D2] = 0xFFFFED0F ^ 0x12D2;
        ModeSetting.C[0x3E78 ^ 0x3E7D] = 0xFFFFC1F6 ^ 0x3E7D;
        ModeSetting.C[0x35C9 ^ 0x3598] = 0xFFFFCA27 ^ 0x3598;
        ModeSetting.C[0xED27 ^ 0xED4D] = 0xEBE3 ^ 0xED4D;
        ModeSetting.C[0x95FD ^ 0x9481] = 0x9480 ^ 0x9481;
        ModeSetting.C[0xE54 ^ 0xF50] = 0x36AE ^ 0xF50;
        ModeSetting.C[0xD149 ^ 0xD018] = 0x6447 ^ 0xD018;
        ModeSetting.C[0x3663 ^ 0x3777] = 0xFB4B ^ 0x3777;
        ModeSetting.C[0x635B ^ 0x63AE] = 0x1DFB ^ 0x63AE;
        ModeSetting.C[0xCCC0 ^ 0xCDF2] = 0x3ACE ^ 0xCDF2;
        ModeSetting.C[0xCDB9 ^ 0xCDF8] = 0xCDB7 ^ 0xCDF8;
        ModeSetting.C[0x8C1F ^ 0x8C01] = 0xFFFF7370 ^ 0x8C01;
        ModeSetting.C[0xA635 ^ 0xA681] = 0x2F89 ^ 0xA681;
        ModeSetting.C[0xBC86 ^ 0xBC2A] = 0xBC7E ^ 0xBC2A;
        ModeSetting.C[0x786F ^ 0x789B] = 0xFFFFF95F ^ 0x789B;
        ModeSetting.C[0xC5C8 ^ 0xC4F0] = 0x8692 ^ 0xC4F0;
        ModeSetting.C[0x779C ^ 0x776D] = 0xF493 ^ 0x776D;
        ModeSetting.C[0xE7D ^ 0xE0B] = 0xE4C ^ 0xE0B;
        ModeSetting.C[0x10C36 ^ 0x10CF3] = 0x155F3 ^ 0x10CF3;
        ModeSetting.C[0x29B6 ^ 0x290B] = 0x47A4 ^ 0x290B;
        ModeSetting.C[0x8E94 ^ 0x8FD7] = 0xFFFF8FE5 ^ 0x8FD7;
        ModeSetting.C[0xD9AE ^ 0xD8F4] = 0x3951 ^ 0xD8F4;
        ModeSetting.C[0x16AC ^ 0x1691] = 0xFFFFE97D ^ 0x1691;
        ModeSetting.C[0xAED ^ 0xAD2] = 0xAA3 ^ 0xAD2;
        ModeSetting.C[0x1CAC ^ 0x1C37] = 0xFFFFE3F6 ^ 0x1C37;
        ModeSetting.C[0x8D42 ^ 0x8C2E] = 0xB3D2 ^ 0x8C2E;
        ModeSetting.C[0x168C ^ 0x179E] = 0xDBA2 ^ 0x179E;
        ModeSetting.C[0x1DC5 ^ 0x1C84] = 0xE30A ^ 0x1C84;
        ModeSetting.C[0x6CF0 ^ 0x6C1C] = 0xB15C ^ 0x6C1C;
        ModeSetting.C[0x7EA6 ^ 0x7FCE] = 0x2D36 ^ 0x7FCE;
        ModeSetting.C[0x1196 ^ 0x10F3] = 0x421C ^ 0x10F3;
        ModeSetting.C[0x65C5 ^ 0x65BC] = 0x65B8 ^ 0x65BC;
        ModeSetting.C[0xBDCD ^ 0xBD80] = 0xFFFF424A ^ 0xBD80;
        ModeSetting.C[0x68AC ^ 0x688D] = 0xFFFF9775 ^ 0x688D;
        ModeSetting.C[0x22C1 ^ 0x2247] = 0xFFFFDDE5 ^ 0x2247;
    }
}

