/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.other;

import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R'\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0018"}, d2={"Lkotakbaz/rain/client/util/other/KeyMappings;", "", "<init>", "()V", "", "key", "", "getKey", "(I)Ljava/lang/String;", "input", "formatKeyLabel", "(Ljava/lang/String;)Ljava/lang/String;", "raw", "formatWord", "NONE", "Ljava/lang/String;", "", "mouseLabels", "Ljava/util/Map;", "keyLabels$delegate", "Lkotlin/Lazy;", "getKeyLabels", "()Ljava/util/Map;", "keyLabels", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nKeyMappings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyMappings.kt\nkotakbaz/rain/client/util/other/KeyMappings\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
public final class KeyMappings {
    @NotNull
    public static final KeyMappings INSTANCE;
    @NotNull
    private static final String a = "None";
    @NotNull
    private static final Map<Integer, String> A;
    @NotNull
    private static final Lazy b;
    private static Object[] B;
    private static Object C;
    private static Object[] d;
    private static Object[] c;
    private static Object[] D;
    public static int[] e;

    private KeyMappings() {
    }

    private final Map<Integer, String> getKeyLabels() {
        Lazy lazy = b;
        return (Map)lazy.getValue();
    }

    @NotNull
    public final String getKey(int key) {
        long l2 = 6780553434279544022L;
        int n2 = e[0];
        n2 += e[1];
        if (key == (n2 -= e[2])) {
            int n3 = e[3];
            n3 ^= e[4];
            return (String)B[n3 -= e[5]];
        }
        String string = A.get(key);
        if (string != null) {
            String string2 = string;
            long l3 = l2;
            int n4 = e[6];
            n4 += e[7];
            l2 = l3 ^ (0L ^ l3) & -1L << (n4 += e[8]);
            return string2;
        }
        String string3 = this.getKeyLabels().get(key);
        if (string3 == null) {
            int n5 = e[9];
            n5 ^= e[10];
            string3 = (String)B[n5 -= e[11]];
        }
        return string3;
    }

    /*
     * Unable to fully structure code
     */
    private final String formatKeyLabel(String input) {
        block21: {
            block17: {
                block20: {
                    block19: {
                        block18: {
                            if (((CharSequence)input).length() == 0) {
                                var7_2 = KeyMappings.e[12];
                                var7_2 -= KeyMappings.e[13];
                                v0 = var7_2 += KeyMappings.e[14];
                            } else {
                                var9_3 = KeyMappings.e[15];
                                var9_3 -= KeyMappings.e[16];
                                v0 = var9_3 -= KeyMappings.e[17];
                            }
                            if (v0 != 0) {
                                return input;
                            }
                            var11_4 = KeyMappings.e[18];
                            var11_4 -= KeyMappings.e[19];
                            var11_4 ^= KeyMappings.e[20];
                            var13_5 = KeyMappings.e[21];
                            var13_5 ^= KeyMappings.e[22];
                            var15_6 = KeyMappings.e[24];
                            var15_6 -= KeyMappings.e[25];
                            if (StringsKt.startsWith$default(input, (String)KeyMappings.B[var11_4], var13_5 -= KeyMappings.e[23], var15_6 -= KeyMappings.e[26], null)) {
                                var17_7 = KeyMappings.e[27];
                                var17_7 ^= KeyMappings.e[28];
                                v1 = input.substring(var17_7 -= KeyMappings.e[29]);
                                var19_8 = KeyMappings.e[30];
                                var19_8 += KeyMappings.e[31];
                                Intrinsics.checkNotNullExpressionValue(v1, (String)KeyMappings.B[var19_8 -= KeyMappings.e[32]]);
                                var3_9 = this.formatWord(v1);
                                var21_10 = KeyMappings.e[33];
                                var21_10 ^= KeyMappings.e[34];
                                return (String)KeyMappings.B[var21_10 ^= KeyMappings.e[35]] + var3_9;
                            }
                            var23_11 = KeyMappings.e[36];
                            var23_11 += KeyMappings.e[37];
                            var23_11 ^= KeyMappings.e[38];
                            var25_12 = KeyMappings.e[39];
                            var25_12 -= KeyMappings.e[40];
                            var27_13 = KeyMappings.e[42];
                            var27_13 ^= KeyMappings.e[43];
                            if (StringsKt.startsWith$default(input, (String)KeyMappings.B[var23_11], var25_12 += KeyMappings.e[41], var27_13 += KeyMappings.e[44], null)) {
                                var29_14 = KeyMappings.e[45];
                                var29_14 ^= KeyMappings.e[46];
                                v2 = input.substring(var29_14 ^= KeyMappings.e[47]);
                                var31_15 = KeyMappings.e[48];
                                var31_15 -= KeyMappings.e[49];
                                Intrinsics.checkNotNullExpressionValue(v2, (String)KeyMappings.B[var31_15 += KeyMappings.e[50]]);
                                var4_16 = this.formatWord(v2);
                                var33_17 = KeyMappings.e[51];
                                var33_17 ^= KeyMappings.e[52];
                                return (String)KeyMappings.B[var33_17 -= KeyMappings.e[53]] + var4_16;
                            }
                            var35_18 = KeyMappings.e[54];
                            var35_18 -= KeyMappings.e[55];
                            var35_18 += KeyMappings.e[56];
                            var37_19 = KeyMappings.e[57];
                            var37_19 += KeyMappings.e[58];
                            var39_20 = KeyMappings.e[60];
                            var39_20 ^= KeyMappings.e[61];
                            if (StringsKt.startsWith$default(input, (String)KeyMappings.B[var35_18], var37_19 += KeyMappings.e[59], var39_20 ^= KeyMappings.e[62], null)) {
                                var41_21 = KeyMappings.e[63];
                                var41_21 -= KeyMappings.e[64];
                                v3 = input.substring(var41_21 += KeyMappings.e[65]);
                                var43_22 = KeyMappings.e[66];
                                var43_22 ^= KeyMappings.e[67];
                                Intrinsics.checkNotNullExpressionValue(v3, (String)KeyMappings.B[var43_22 ^= KeyMappings.e[68]]);
                                var5_23 = this.formatWord(v3);
                                var45_24 = KeyMappings.e[69];
                                var45_24 += KeyMappings.e[70];
                                return (String)KeyMappings.B[var45_24 -= KeyMappings.e[71]] + var5_23;
                            }
                            var2_25 = input;
                            switch (var2_25.hashCode()) {
                                case -595411886: {
                                    var47_26 = KeyMappings.e[72];
                                    var47_26 += KeyMappings.e[73];
                                    if (!var2_25.equals((String)KeyMappings.B[var47_26 ^= KeyMappings.e[74]])) {
                                        ** break;
                                    }
                                    break block17;
                                }
                                case 1225304009: {
                                    var49_27 = KeyMappings.e[75];
                                    var49_27 ^= KeyMappings.e[76];
                                    if (!var2_25.equals((String)KeyMappings.B[var49_27 -= KeyMappings.e[77]])) {
                                        ** break;
                                    }
                                    break block18;
                                }
                                case -1076824476: {
                                    var51_28 = KeyMappings.e[78];
                                    var51_28 ^= KeyMappings.e[79];
                                    if (!var2_25.equals((String)KeyMappings.B[var51_28 -= KeyMappings.e[80]])) {
                                        ** break;
                                    }
                                    break block19;
                                }
                                case 928738910: {
                                    var53_29 = KeyMappings.e[81];
                                    var53_29 += KeyMappings.e[82];
                                    if (var2_25.equals((String)KeyMappings.B[var53_29 += KeyMappings.e[83]])) break;
                                    ** break;
                                }
                                case -85535157: {
                                    var55_30 = KeyMappings.e[84];
                                    var55_30 += KeyMappings.e[85];
                                    if (!var2_25.equals((String)KeyMappings.B[var55_30 += KeyMappings.e[86]])) {
                                        ** break;
                                    }
                                    break block20;
                                }
                            }
                            var57_31 = KeyMappings.e[87];
                            var57_31 -= KeyMappings.e[88];
                            v4 = (String)KeyMappings.B[var57_31 += KeyMappings.e[89]];
                            break block21;
                        }
                        var59_32 = KeyMappings.e[90];
                        var59_32 ^= KeyMappings.e[91];
                        v4 = (String)KeyMappings.B[var59_32 ^= KeyMappings.e[92]];
                        break block21;
                    }
                    var61_33 = KeyMappings.e[93];
                    var61_33 ^= KeyMappings.e[94];
                    v4 = (String)KeyMappings.B[var61_33 ^= KeyMappings.e[95]];
                    break block21;
                }
                var63_34 = KeyMappings.e[96];
                var63_34 ^= KeyMappings.e[97];
                v4 = (String)KeyMappings.B[var63_34 ^= KeyMappings.e[98]];
                break block21;
            }
            var65_35 = KeyMappings.e[99];
            var65_35 += KeyMappings.e[100];
            v4 = (String)KeyMappings.B[var65_35 ^= KeyMappings.e[101]];
            break block21;
lbl120:
            // 6 sources

            var67_36 = KeyMappings.e[102];
            var67_36 += KeyMappings.e[103];
            var69_37 = KeyMappings.e[105];
            var69_37 -= KeyMappings.e[106];
            var71_38 = KeyMappings.e[108];
            var71_38 += KeyMappings.e[109];
            v4 = this.formatWord(StringsKt.replace$default(input, (String)KeyMappings.B[var67_36 -= KeyMappings.e[104]], "", var69_37 ^= KeyMappings.e[107], var71_38 += KeyMappings.e[110], null));
        }
        return v4;
    }

    private final String formatWord(String raw) {
        String string;
        int n2;
        int n3;
        long l2 = 7210908047055654479L;
        long l3 = 2195052169240091455L;
        long l4 = 2507208510972564131L;
        long l5 = 7198012760834919111L;
        if (((CharSequence)raw).length() == 0) {
            int n4 = e[111];
            n4 ^= e[112];
            n3 = n4 += e[113];
        } else {
            int n5 = e[114];
            n5 ^= e[115];
            n3 = n5 ^= e[116];
        }
        if (n3 != 0) {
            return "";
        }
        String string2 = raw.toLowerCase(Locale.ROOT);
        int n6 = e[117];
        n6 += e[118];
        int n7 = e[120];
        n7 += e[121];
        Intrinsics.checkNotNullExpressionValue(string2, (String)B[n6 -= e[119]] + (String)B[n7 ^= e[122]]);
        String string3 = string2;
        int n8 = e[123];
        n8 ^= e[124];
        boolean bl = e[126];
        bl ^= e[127];
        int n9 = e[129];
        n9 += e[130];
        string3 = StringsKt.replace$default(string3, (String)B[n8 += e[125]], "", bl += e[128], n9 += e[131], null);
        int n10 = e[132];
        n10 += e[133];
        n10 += e[134];
        int n11 = e[135];
        n11 ^= e[136];
        boolean bl2 = e[138];
        bl2 += e[139];
        int n12 = e[141];
        n12 += e[142];
        string3 = StringsKt.replace$default(string3, (String)B[n10], (String)B[n11 += e[137]], bl2 -= e[140], n12 -= e[143], null);
        int n13 = e[144];
        n13 += e[145];
        n13 -= e[146];
        int n14 = e[147];
        n14 += e[148];
        boolean bl3 = e[150];
        bl3 += e[151];
        int n15 = e[153];
        n15 -= e[154];
        string3 = StringsKt.replace$default(string3, (String)B[n13], (String)B[n14 ^= e[149]], bl3 += e[152], n15 -= e[155], null);
        int n16 = e[156];
        n16 -= e[157];
        n16 -= e[158];
        int n17 = e[159];
        n17 -= e[160];
        boolean bl4 = e[162];
        bl4 -= e[163];
        int n18 = e[165];
        n18 -= e[166];
        string3 = StringsKt.replace$default(string3, (String)B[n16], (String)B[n17 += e[161]], bl4 ^= e[164], n18 -= e[167], null);
        int n19 = e[168];
        n19 += e[169];
        n19 += e[170];
        int n20 = e[171];
        n20 ^= e[172];
        boolean bl5 = e[174];
        bl5 ^= e[175];
        int n21 = e[177];
        n21 += e[178];
        String string4 = string3 = StringsKt.replace$default(string3, (String)B[n19], (String)B[n20 += e[173]], bl5 -= e[176], n21 -= e[179], null);
        if (((CharSequence)string4).length() > 0) {
            int n22 = e[180];
            n22 -= e[181];
            n2 = n22 -= e[182];
        } else {
            int n23 = e[183];
            n23 += e[184];
            n2 = n23 ^= e[185];
        }
        if (n2 != 0) {
            String string5;
            int n24 = e[186];
            n24 += e[187];
            n24 -= e[188];
            int n25 = e[189];
            n25 -= e[190];
            long l6 = l4;
            int n26 = e[192];
            n26 ^= e[193];
            l4 = l6 ^ ((long)string4.charAt(n24) << (n25 ^= e[191]) ^ l6) & -1L << (n26 += e[194]);
            StringBuilder stringBuilder = new StringBuilder();
            long l7 = l5;
            int n27 = e[195];
            n27 += e[196];
            l5 = l7 ^ (0L ^ l7) & -1L << (n27 += e[197]);
            int n28 = e[198];
            n28 -= e[199];
            if (Character.isLowerCase((char)(l4 >>> (n28 -= e[200])))) {
                int n29 = e[201];
                n29 ^= e[202];
                string5 = CharsKt.titlecase((char)(l4 >>> (n29 -= e[203])));
            } else {
                int n30 = e[204];
                n30 -= e[205];
                string5 = String.valueOf((char)(l4 >>> (n30 ^= e[206])));
            }
            StringBuilder stringBuilder2 = stringBuilder.append((Object)string5);
            String string6 = string4;
            long l8 = l5;
            int n31 = e[207];
            n31 ^= e[208];
            l5 = l8 ^ (0x100000000L ^ l8) & -1L << (n31 -= e[209]);
            int n32 = e[210];
            n32 ^= e[211];
            String string7 = string6.substring((int)(l5 >>> (n32 ^= e[212])));
            int n33 = e[213];
            n33 += e[214];
            Intrinsics.checkNotNullExpressionValue(string7, (String)B[n33 ^= e[215]]);
            string = stringBuilder2.append(string7).toString();
        } else {
            string = string4;
        }
        return string;
    }

    private static final HashMap keyLabels_delegate$lambda$0() {
        long l2 = 6422109278324051730L;
        long l3 = 5813043039179244649L;
        long l4 = -1085201639472633171L;
        long l5 = 4002694969798062368L;
        long l6 = -6823708570854032203L;
        HashMap hashMap = new HashMap();
        Field[] fieldArray = GLFW.class.getDeclaredFields();
        int n2 = e[216];
        n2 ^= e[217];
        int n3 = e[219];
        n3 ^= e[220];
        Intrinsics.checkNotNullExpressionValue(fieldArray, (String)B[n2 -= e[218]] + (String)B[n3 -= e[221]]);
        Field[] fieldArray2 = fieldArray;
        long l7 = l6;
        int n4 = e[222];
        n4 -= e[223];
        l6 = l7 ^ (0L ^ l7) & -1L << (n4 ^= e[224]);
        long l8 = l5;
        int n5 = e[225];
        n5 += e[226];
        l5 = l8 ^ ((long)fieldArray2.length ^ l8) & -1L >>> (n5 ^= e[227]);
        while (true) {
            int n6 = e[228];
            n6 ^= e[229];
            if ((int)(l6 >>> (n6 += e[230])) >= (int)l5) break;
            int n7 = e[231];
            n7 += e[232];
            Field field = fieldArray2[(int)(l6 >>> (n7 ^= e[233]))];
            String string = field.getName();
            int n8 = e[234];
            n8 ^= e[235];
            Intrinsics.checkNotNullExpressionValue(string, (String)B[n8 ^= e[236]]);
            int n9 = e[237];
            n9 += e[238];
            boolean bl = e[240];
            bl ^= e[241];
            int n10 = e[243];
            n10 ^= e[244];
            if (StringsKt.startsWith$default(string, (String)B[n9 ^= e[239]], bl ^= e[242], n10 ^= e[245], null) && Intrinsics.areEqual(field.getType(), Integer.TYPE)) {
                Object object;
                Object object2 = INSTANCE;
                try {
                    object = object2;
                    long l9 = l6;
                    int n11 = e[246];
                    n11 ^= e[247];
                    l6 = l9 ^ (0L ^ l9) & -1L >>> (n11 -= e[248]);
                    object = Result.cfr_renamed_1(field.getInt(null));
                }
                catch (Throwable throwable) {
                    object = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
                }
                object2 = object;
                Integer n12 = (Integer)(Result.cfr_renamed_3(object2) ? null : object2);
                if (n12 == null) {
                } else {
                    int n13 = e[249];
                    n13 -= e[250];
                    long l10 = l2;
                    int n14 = e[252];
                    n14 -= e[253];
                    l2 = l10 ^ ((long)n12.intValue() << (n13 ^= e[251]) ^ l10) & -1L << (n14 ^= e[254]);
                    String string2 = field.getName();
                    int n15 = e[255];
                    n15 -= e[256];
                    Intrinsics.checkNotNullExpressionValue(string2, (String)B[n15 += e[257]]);
                    int n16 = e[258];
                    n16 += e[259];
                    String string3 = StringsKt.removePrefix(string2, (CharSequence)((String)B[n16 -= e[260]]));
                    int n17 = e[261];
                    n17 += e[262];
                    ((Map)hashMap).put((int)(l2 >>> (n17 -= e[263])), INSTANCE.formatKeyLabel(string3));
                }
            }
            l6 += 0x100000000L;
        }
        return hashMap;
    }

    static {
        KeyMappings.b();
        long l2 = 2424425803884833432L;
        long l3 = -1287739133863602576L;
        long l4 = 8075753627830504231L;
        long l5 = 1273450932550833728L;
        long l6 = -3618003601047156482L;
        long l7 = 8028274172564232176L;
        long l8 = -9067483739583164261L;
        long l9 = 5412069375551903313L;
        long l10 = -9036659429771603326L;
        long l11 = -8830827660142734843L;
        long l12 = -165381113828001749L;
        long l13 = -6303837927042428518L;
        long l14 = -6530180427063528386L;
        long l15 = 5974861406623108826L;
        int n2 = e[264];
        n2 += e[265];
        B = new Object[n2 -= e[266]];
        long l16 = l15;
        int n3 = e[267];
        n3 -= e[268];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= e[269]);
        Object[] objectArray = new Object[e[270]];
        objectArray[KeyMappings.e[271]] = c;
        objectArray[KeyMappings.e[272]] = e[273];
        int n4 = e[274];
        Object object = KeyMappings.A()[e[275]];
        if (object == null) {
            char[] cArray = "\u4442\u4457\u46ee\u4688\u444f\u4443\u46e7\u4441\u4444\u46e4\u46ec\u469d\u4565\u46ef\u46e1\u4440\u4691\u4456\u4698\u445e\u4695\u4568\u4448\u46e7\u4685\u468a\u45a0\u46e6\u4565\u445e\u456a\u46ee\u4444\u46e3\u4440\u4698\u45ae\u4447\u46e3\u4447\u4457\u4448\u4571\u4568\u4693\u46ec\u4694\u46e9\u46e0\u4443\u456b\u4457\u468a\u46ee\u445e\u4440\u4478\u4685\u444a\u4574\u46ec\u45ae\u4456\u4688\u4574\u4446\u4571\u4695\u46ef\u4451\u444f\u4698\u469a\u4478\u46e1\u45a0\u4693\u4571\u469a\u46e4\u45a0\u4695\u444f\u4454\u46ef\u45ae\u4693\u4577\u4565\u4443\u4448\u444c\u4475\u4577\u45a0\u46e7\u4445\u456a\u468b\u468b\u46ee\u46e7\u46e9\u4694\u469a\u4688\u4444\u456a\u4440\u4448\u4691\u4696\u444e\u445e\u447a\u4456\u456b\u4445\u4444\u4576\u46e3\u444a\u46e1\u4447\u4454\u4445\u45a9\u4696\u468b\u4576\u45a0\u4574\u4441\u4478\u447b\u4571\u46e3\u46e2\u4448\u46e7\u45ac\u4576\u4456\u46e2\u4698\u46e3\u4449\u46e7\u444e\u4445\u4573\u469d\u4568\u4451\u4574\u46ee\u469b\u4446\u444c\u4441\u469b\u4573\u4449\u4574\u46e6\u4694\u4456\u444c\u4688\u45a0\u46e3\u456b\u4441\u469a\u4442\u469a\u447b\u4442\u4691\u4451\u469b\u444b\u456b\u46e9\u46e9\u4475\u45ae\u45a0\u469b\u46e6\u456b\u4565\u4576\u447a\u4447\u444f\u447a\u4442\u46ee\u4478\u46e9\u447b\u447b\u445e\u45ac\u4457\u445e\u46e3\u4568\u4443\u456b\u444a\u46ef\u4478\u4475\u4565\u468a\u4694\u4577\u447b\u46e6\u46e9\u4478\u4698\u46e1\u4697\u46e4\u456b\u4442\u444e\u447a\u4441\u4695\u444c\u4573\u4574\u444e\u469d\u456b\u447a\u469d\u46e3\u46e6\u46ee\u4571\u456a\u447b\u447d\u4698\u46ec\u4445\u4688\u4440\u447b\u45a9\u4697\u4695\u447b\u46e4\u4698\u46e6\u46e9\u4478\u4456\u4442\u4696\u456a\u4478\u469d\u4685\u4441\u45a9\u4696\u444a\u46ef\u4444\u46e4\u4447\u4695\u46ef\u469a\u4457\u4685\u4694\u4446\u469d\u4577\u45ac\u4576\u46e7\u4695\u4574\u45a9\u444a\u4443\u45a0\u46ee\u4446\u4571\u468a\u444a\u4449\u45ae\u4697\u46e7\u444c\u45ac\u447d\u4577\u444e\u444c\u4457\u4451\u4440\u456b\u45ac\u468a\u444e\u468a\u469d\u4445\u4574\u4442\u444a\u46e3\u456a\u447d\u445e\u4447\u444f\u46e6\u4568\u4688\u4698\u4577\u445e\u4576\u4571\u4697\u444b\u4688\u445e\u4573\u45ac\u4576\u4571\u4448\u447d\u4445\u468a\u456b\u4447\u4565\u45a9\u4574\u444f\u46e7\u4441\u4697\u4577\u4445\u4694\u444e\u4446\u444b\u4571\u46e7\u4685\u4457\u46e6\u46e2\u46e4\u447a\u4475\u45ae\u4695\u4454\u4685\u46e2\u4696\u46e4\u4454\u4440\u4694\u4695\u4698\u4451\u4457\u4568\u4573\u456a\u4449\u4454\u46ec\u469a\u4478\u4573\u4478\u4697\u468b\u4440\u4571\u4691\u46ec\u45ae\u4457\u444a\u4442\u46e3\u45ac\u447a\u456b\u45ae\u445e\u4577\u46e7\u4440\u4457\u445e\u4456\u445e\u45a0\u46e7\u456a\u46e0\u445e\u4573\u456a\u4573\u46e3\u4447\u46ee\u4445\u469a\u46e3\u4698\u447d\u444f\u444a\u45ae\u46e9\u4685\u4694\u468a\u468b\u4449\u46ec\u45ae\u468a\u4454\u444f\u46e1\u45ac\u445e\u4447\u46e9\u4695\u444e\u4456\u4695\u469a\u4565\u468b\u4441\u456b\u469b\u46ec\u4475\u46e7\u46ec\u4565\u4444\u46ef\u4445\u444c\u444e\u46e3\u4693\u46e3\u444b\u447b\u4685\u4441\u4475\u46e1\u4447\u468a\u4456\u4697\u46e6\u4573\u4688\u4451\u444b\u4565\u444a\u4441\u468a\u469b\u46e7\u46e9\u447d\u4441\u46ec\u456a\u4573\u4449\u4688\u4576\u46e2\u444c\u46e4\u4478\u46ef\u46e3\u46e6\u4576\u46ee\u4693\u4456\u4688\u4442\u444e\u447a\u444b\u4447\u447a\u46e0\u4565\u4457\u45a0\u45a0\u469d\u46e7\u4576\u4577\u468b\u456b\u45a9\u45ae\u4446\u4571\u4440\u4451\u444e\u456b\u4457\u45ae\u4693\u4688\u4451\u444e\u4441\u4691\u4475\u4693\u4565\u4698\u4688\u456b\u4698\u4478\u4565\u4475\u469b\u447b\u4444\u4451\u4440\u444f\u46e2\u4698\u4696\u4576\u447d\u4454\u46e2\u447b\u45a9\u4457\u4565\u4456\u45a9\u4576\u46ef\u447a\u469b\u45a9\u4571\u4446\u4475\u4475\u45a9\u4444\u4695\u468a\u469a\u46e9\u4574\u4442\u45a9\u456a\u4443\u447e\u468b\u4478\u447e\u4451\u4445\u4695\u445e\u4446\u4454\u4577\u46e4\u444b\u4446\u469d\u4454\u46e2\u46e4\u447a\u46e6\u4698\u4574\u4441\u447d\u469a\u444c\u4685\u444c\u46e0\u45ac\u45ae\u45a9\u4574\u468a\u46e9\u4577\u447e".toCharArray();
            for (int i2 = e[276]; i2 < e[277]; ++i2) {
                int n5 = cArray[i2];
                n5 ^= e[278];
                n5 += e[279];
                n5 += e[280];
                n5 += e[281];
                n5 -= e[282];
                n5 += e[283];
                n5 -= e[284];
                n5 ^= e[285];
                n5 -= e[286];
                n5 ^= e[287];
                cArray[i2] = (char)(n5 -= e[288]);
            }
            object = KeyMappings.A()[KeyMappings.e[289]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)KeyMappings.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = e[290];
        n6 += e[291];
        l6 = l17 ^ (0x1C900000000L ^ l17) & -1L << (n6 ^= e[292]);
        long l18 = l13;
        int n7 = e[293];
        n7 ^= e[294];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= e[295]);
        while (true) {
            int n8 = e[296];
            n8 ^= e[297];
            if ((int)l13 >= (int)(l6 >>> (n8 += e[298]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = e[299];
            n10 += e[300];
            int n11 = e[302];
            n11 ^= e[303];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += e[301])) & -1L >>> (n11 -= e[304]);
            long l20 = l9;
            int n12 = e[305];
            n12 -= e[306];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += e[307]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = e[308];
            n14 += e[309];
            int n15 = e[311];
            n15 += e[312];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= e[310])) & -1L >>> (n15 += e[313]);
            int n16 = e[314];
            n16 -= e[315];
            long l22 = l10;
            int n17 = e[317];
            n17 += e[318];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= e[316]) ^ l22) & -1L << (n17 += e[319]);
            int n18 = e[320];
            n18 ^= e[321];
            n18 += e[322];
            int n19 = e[323];
            n19 ^= e[324];
            long l23 = l12;
            int n20 = e[326];
            n20 -= e[327];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= e[325]))) ^ l23) & -1L >>> (n20 -= e[328]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = e[329];
            n21 -= e[330];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += e[331]);
            while (true) {
                int n22 = e[332];
                n22 += e[333];
                if ((int)(l14 >>> (n22 += e[334])) >= (int)l12) break;
                int n23 = e[335];
                n23 -= e[336];
                int n24 = e[338];
                n24 ^= e[339];
                cArray2[(int)(l14 >>> (n23 += KeyMappings.e[337]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= e[340]))];
                l14 += 0x100000000L;
            }
            int n25 = e[341];
            n25 -= e[342];
            int n26 = (int)(l15 >>> (n25 ^= e[343]));
            l15 += 0x100000000L;
            KeyMappings.B[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = e[344];
            n27 -= e[345];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += e[346]);
        }
        INSTANCE = new KeyMappings();
        int n28 = e[347];
        n28 ^= e[348];
        Pair[] pairArray = new Pair[n28 ^= e[349]];
        int n29 = e[350];
        n29 += e[351];
        int n30 = e[353];
        n30 -= e[354];
        int n31 = e[356];
        n31 += e[357];
        pairArray[n29 ^= KeyMappings.e[352]] = TuplesKt.to(n30 -= e[355], (String)B[n31 ^= e[358]]);
        int n32 = e[359];
        n32 += e[360];
        int n33 = e[362];
        n33 -= e[363];
        int n34 = e[365];
        n34 += e[366];
        pairArray[n32 ^= KeyMappings.e[361]] = TuplesKt.to(n33 += e[364], (String)B[n34 -= e[367]]);
        int n35 = e[368];
        n35 += e[369];
        int n36 = e[371];
        n36 ^= e[372];
        int n37 = e[374];
        n37 += e[375];
        pairArray[n35 ^= KeyMappings.e[370]] = TuplesKt.to(n36 -= e[373], (String)B[n37 ^= e[376]]);
        int n38 = e[377];
        n38 -= e[378];
        int n39 = e[380];
        n39 ^= e[381];
        int n40 = e[383];
        n40 -= e[384];
        pairArray[n38 ^= KeyMappings.e[379]] = TuplesKt.to(n39 += e[382], (String)B[n40 += e[385]]);
        int n41 = e[386];
        n41 -= e[387];
        int n42 = e[389];
        n42 += e[390];
        int n43 = e[392];
        n43 ^= e[393];
        pairArray[n41 -= KeyMappings.e[388]] = TuplesKt.to(n42 -= e[391], (String)B[n43 -= e[394]]);
        int n44 = e[395];
        n44 += e[396];
        int n45 = e[398];
        n45 ^= e[399];
        int n46 = -71;
        n46 -= 49;
        pairArray[n44 += KeyMappings.e[397]] = TuplesKt.to(n45 += -110, (String)B[n46 ^= 0xFFFFFFA8]);
        int n47 = 111;
        n47 -= 50;
        int n48 = 10;
        n48 ^= 0x31;
        int n49 = 125;
        n49 += -46;
        pairArray[n47 += -55] = TuplesKt.to(n48 -= 53, (String)B[n49 ^= 0x5F]);
        int n50 = 28;
        n50 -= 68;
        int n51 = 15;
        n51 += 36;
        int n52 = 89;
        n52 ^= 0x31;
        pairArray[n50 += 47] = TuplesKt.to(n51 -= 44, (String)B[n52 ^= 0x46]);
        A = MapsKt.mapOf(pairArray);
        b = LazyKt.lazy(KeyMappings::keyLabels_delegate$lambda$0);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[1];
        String string = (String)object[2];
        object = object[0];
        Object[] objectArray = d;
        if (d == null) {
            objectArray = d = new Object[1];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[1];
                c = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[0x395B ^ 0x394B];
                byArray[0x3344 ^ 0x334B] = 0x3360 ^ 0x334B;
                byArray[0x109EF ^ 0x109EC] = 0xFFFEF60D ^ 0x109EC;
                byArray[0xFF99 ^ 0xFF98] = 0xFF95 ^ 0xFF98;
                byArray[0xF721 ^ 0xF721] = 0xF771 ^ 0xF721;
                byArray[0x299A ^ 0x2997] = 0x29C1 ^ 0x2997;
                byArray[0x64FF ^ 0x64F7] = 0xFFFF9B67 ^ 0x64F7;
                byArray[0x2606 ^ 0x2600] = 0xFFFFD9D6 ^ 0x2600;
                byArray[0x1FBE ^ 0x1FB2] = 0x1FAC ^ 0x1FB2;
                byArray[0xFDB8 ^ 0xFDB6] = 0xFD9A ^ 0xFDB6;
                byArray[0x4DDA ^ 0x4DDD] = 0xFFFFB23E ^ 0x4DDD;
                byArray[0xF578 ^ 0xF572] = 0xF55D ^ 0xF572;
                byArray[0x2BFE ^ 0x2BFA] = 0x2BDE ^ 0x2BFA;
                byArray[0x2C81 ^ 0x2C83] = 0xFFFFD371 ^ 0x2C83;
                byArray[0x2A09 ^ 0x2A0C] = 0x2A50 ^ 0x2A0C;
                byArray[0x28BE ^ 0x28B7] = 0x28AD ^ 0x28B7;
                byArray[0xB748 ^ 0xB743] = 0xFFFF48A6 ^ 0xB743;
                objectArray2[0] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (C == null) {
                byte[] byArray2 = new byte[0xA227 ^ 0xA207];
                byArray2[0x26DB ^ 0x26C1] = 0xFFFFD905 ^ 0x26C1;
                byArray2[0x1C93 ^ 0x1C95] = 0x1CB5 ^ 0x1C95;
                byArray2[0x1880 ^ 0x189B] = 0x188A ^ 0x189B;
                byArray2[0xC41A ^ 0xC40C] = 0xFFFF3B88 ^ 0xC40C;
                byArray2[0x720C ^ 0x7214] = 0x7260 ^ 0x7214;
                byArray2[0xF8C0 ^ 0xF8D4] = 0xF8BE ^ 0xF8D4;
                byArray2[0x7B4A ^ 0x7B5A] = 0x7B08 ^ 0x7B5A;
                byArray2[0xB41 ^ 0xB5E] = 0xFFFFF4E4 ^ 0xB5E;
                byArray2[0xD45A ^ 0xD443] = 0xD400 ^ 0xD443;
                byArray2[0x1029B ^ 0x10288] = 0x10295 ^ 0x10288;
                byArray2[0xAB6 ^ 0xAB5] = 0xACA ^ 0xAB5;
                byArray2[0x8AF0 ^ 0x8AF2] = 0xFFFF7544 ^ 0x8AF2;
                byArray2[0x516C ^ 0x5179] = 0x517C ^ 0x5179;
                byArray2[0xD1D4 ^ 0xD1D3] = 0xFFFF2E6D ^ 0xD1D3;
                byArray2[0xEB19 ^ 0xEB10] = 0xFFFF14D6 ^ 0xEB10;
                byArray2[0xC85 ^ 0xC99] = 0xFFFFF356 ^ 0xC99;
                byArray2[0xBDE2 ^ 0xBDEF] = 0xBD88 ^ 0xBDEF;
                byArray2[0x91F5 ^ 0x91F4] = 0xFFFF6E46 ^ 0x91F4;
                byArray2[0x9212 ^ 0x9212] = 0xFFFF6DE4 ^ 0x9212;
                byArray2[0x536 ^ 0x532] = 0xFFFFFAE6 ^ 0x532;
                byArray2[0xB779 ^ 0xB771] = 0xFFFF48B5 ^ 0xB771;
                byArray2[0xDAD8 ^ 0xDACA] = 0xDAA3 ^ 0xDACA;
                byArray2[0x1850 ^ 0x185E] = 0x1846 ^ 0x185E;
                byArray2[0x7569 ^ 0x756C] = 0xFFFF8AA7 ^ 0x756C;
                byArray2[0x5113 ^ 0x5104] = 0xFFFFAEAD ^ 0x5104;
                byArray2[0xAE8C ^ 0xAE9D] = 0xFFFF515E ^ 0xAE9D;
                byArray2[0x109F5 ^ 0x109FF] = 0x1099E ^ 0x109FF;
                byArray2[0x64F7 ^ 0x64FC] = 0x64BF ^ 0x64FC;
                byArray2[0xBE6F ^ 0xBE60] = 0xBE31 ^ 0xBE60;
                byArray2[0xEDE2 ^ 0xEDFC] = 0xEDBE ^ 0xEDFC;
                byArray2[0x4ECD ^ 0x4EC1] = 0x4E9C ^ 0x4EC1;
                byArray2[0x3929 ^ 0x3934] = 0x393E ^ 0x3934;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = KeyMappings.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u262e\u2660\u262b\u265a\u265c\u25d0\u262f\u2609\u260a\u2606\u2626\u2645\u2641\u2643\u2633\u2626\u2661\u25d1".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 -= 22096;
                        n3 += 28353;
                        n3 -= 46499;
                        n3 -= 15508;
                        n3 ^= 0xBD94;
                        n3 ^= 0x4E75;
                        n3 -= 62581;
                        n3 ^= 0x4AB8;
                        n3 ^= 0xD0CA;
                        n3 ^= 0xC5AB;
                        cArray[i2] = (char)(n3 ^= 0x949D);
                    }
                    object4 = KeyMappings.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[10] = -12;
                byArray4[4] = -87;
                byArray4[8] = -83;
                byArray4[12] = -99;
                byArray4[3] = -109;
                byArray4[6] = -32;
                byArray4[1] = 16;
                byArray4[0] = -121;
                byArray4[13] = -119;
                byArray4[5] = -8;
                byArray4[15] = -27;
                byArray4[2] = -55;
                byArray4[11] = -94;
                byArray4[7] = 43;
                byArray4[9] = -10;
                byArray4[14] = 97;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 25, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = KeyMappings.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ufad6\ufa0a\uf9f8".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 30600;
                        n4 -= 50920;
                        n4 += 46477;
                        n4 += 29197;
                        n4 += 29072;
                        n4 -= 19219;
                        n4 += 22100;
                        n4 ^= 0x7857;
                        n4 -= 28121;
                        n4 += 1755;
                        n4 ^= 0x10FB;
                        n4 ^= 0x5E3C;
                        cArray[i3] = (char)(n4 -= 40510);
                    }
                    object5 = KeyMappings.A()[2] = new String(cArray);
                }
                C = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = KeyMappings.A()[3];
            if (object6 == null) {
                char[] cArray = "\u0e33\u0e3f\u1155\u1019\u0fe5\u0e3c\u0fe5\u1019\u117a\u0fed\u0fe5\u1155\u100f\u117a\u1193\u11c6\u11c6\u11db\u11c0\u11d1".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 31587;
                    n5 += 13635;
                    n5 ^= 0x5EF4;
                    n5 -= 19333;
                    n5 ^= 0xDFE6;
                    n5 -= 39494;
                    n5 ^= 0x6D5A;
                    n5 += 5226;
                    n5 ^= 0x89BC;
                    n5 += 2093;
                    cArray[i4] = (char)(n5 -= 10846);
                }
                object6 = KeyMappings.A()[3] = new String(cArray);
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
        e = new int[0x4BC9 ^ 0x4A59];
        KeyMappings.e[0x5017 ^ 0x50E2] = 0x50D6 ^ 0x50E2;
        KeyMappings.e[0x11A0 ^ 0x1113] = 0x110D ^ 0x1113;
        KeyMappings.e[0x1F7C ^ 0x1FFA] = 0x1FE2 ^ 0x1FFA;
        KeyMappings.e[0x6A79 ^ 0x6A18] = 0xFFFF95A2 ^ 0x6A18;
        KeyMappings.e[0x85BD ^ 0x84C8] = 0xFFFF7B09 ^ 0x84C8;
        KeyMappings.e[0x84FF ^ 0x85F8] = 0xFFFF7A7C ^ 0x85F8;
        KeyMappings.e[0x6DD4 ^ 0x6DF1] = 0xFFFF924B ^ 0x6DF1;
        KeyMappings.e[0x293B ^ 0x2915] = 0x295D ^ 0x2915;
        KeyMappings.e[0xC541 ^ 0xC534] = 0xC51A ^ 0xC534;
        KeyMappings.e[0x1018D ^ 0x100FB] = 0x100F2 ^ 0x100FB;
        KeyMappings.e[0x17DF ^ 0x16E8] = 0x16DC ^ 0x16E8;
        KeyMappings.e[0x3A5B ^ 0x3B12] = 0x3BA9 ^ 0x3B12;
        KeyMappings.e[0x996B ^ 0x994F] = 0x99C7 ^ 0x994F;
        KeyMappings.e[0xE59D ^ 0xE58B] = 0xFFFF1A55 ^ 0xE58B;
        KeyMappings.e[0x3E3 ^ 0x368] = 0x320 ^ 0x368;
        KeyMappings.e[0xE444 ^ 0xE4CB] = 0xE4C3 ^ 0xE4CB;
        KeyMappings.e[0x17BE ^ 0x1744] = 0xFFFFE8A6 ^ 0x1744;
        KeyMappings.e[0x44D9 ^ 0x447D] = 0x447E ^ 0x447D;
        KeyMappings.e[0x7211 ^ 0x7299] = 0xFFFF8D3B ^ 0x7299;
        KeyMappings.e[0xF7DD ^ 0xF7B8] = 0xFFFF080B ^ 0xF7B8;
        KeyMappings.e[0x1F7C ^ 0x1E2A] = 0xFFFFE1FC ^ 0x1E2A;
        KeyMappings.e[0x7331 ^ 0x7271] = 0xFFFF8DD7 ^ 0x7271;
        KeyMappings.e[0xB966 ^ 0xB84F] = 0xFFFF47F5 ^ 0xB84F;
        KeyMappings.e[0x4801 ^ 0x4939] = 0xFFFFB6C1 ^ 0x4939;
        KeyMappings.e[0x11BA ^ 0x10C1] = 0x10BB ^ 0x10C1;
        KeyMappings.e[0xE627 ^ 0xE636] = 0xE659 ^ 0xE636;
        KeyMappings.e[0xE10F ^ 0xE00C] = 0xFFFF1FA9 ^ 0xE00C;
        KeyMappings.e[0x6A47 ^ 0x6ACB] = 0x6A97 ^ 0x6ACB;
        KeyMappings.e[0x7555 ^ 0x7590] = 0x75CB ^ 0x7590;
        KeyMappings.e[0xA253 ^ 0xA21E] = 0xA221 ^ 0xA21E;
        KeyMappings.e[0x1073F ^ 0x107C2] = 0x107F2 ^ 0x107C2;
        KeyMappings.e[0x10C60 ^ 0x10D78] = 0x1A5BF ^ 0x10D78;
        KeyMappings.e[0x3961 ^ 0x396F] = 0x3949 ^ 0x396F;
        KeyMappings.e[0xD745 ^ 0xD7BA] = 0xD768 ^ 0xD7BA;
        KeyMappings.e[0x974 ^ 0x844] = 0xFFFFF796 ^ 0x844;
        KeyMappings.e[0xD6D ^ 0xD19] = 0xD36 ^ 0xD19;
        KeyMappings.e[0xB71E ^ 0xB7D4] = 0xFFFF486F ^ 0xB7D4;
        KeyMappings.e[0x1E55 ^ 0x1EC6] = 0xFFFFE137 ^ 0x1EC6;
        KeyMappings.e[0xB7 ^ 0x1D6] = 0xFFFFFE28 ^ 0x1D6;
        KeyMappings.e[0xA4F7 ^ 0xA5D4] = 0xA5AF ^ 0xA5D4;
        KeyMappings.e[0xD3AF ^ 0xD2FB] = 0xFFFF2D59 ^ 0xD2FB;
        KeyMappings.e[0xBEDC ^ 0xBFBE] = 0xBFE0 ^ 0xBFBE;
        KeyMappings.e[0x4218 ^ 0x4267] = 0x426A ^ 0x4267;
        KeyMappings.e[0xECE0 ^ 0xECA6] = 0xFFFF1361 ^ 0xECA6;
        KeyMappings.e[0x8FB3 ^ 0x8FB5] = 0x8FC6 ^ 0x8FB5;
        KeyMappings.e[0x535B ^ 0x535B] = 0xFFFFAC9D ^ 0x535B;
        KeyMappings.e[0x9A70 ^ 0x9B29] = 0xFFFF64FE ^ 0x9B29;
        KeyMappings.e[0x99F8 ^ 0x989E] = 0xFFFF6708 ^ 0x989E;
        KeyMappings.e[0xD0D9 ^ 0xD0AB] = 0xD081 ^ 0xD0AB;
        KeyMappings.e[0xC46 ^ 0xD51] = 0xE4B5 ^ 0xD51;
        KeyMappings.e[0xDC9C ^ 0xDC3A] = 0xFFFF23FF ^ 0xDC3A;
        KeyMappings.e[0x5807 ^ 0x5970] = 0xFFFFA6FF ^ 0x5970;
        KeyMappings.e[0x23DD ^ 0x23EC] = 0x23C7 ^ 0x23EC;
        KeyMappings.e[0x31C3 ^ 0x319A] = 0x31AE ^ 0x319A;
        KeyMappings.e[0xE09C ^ 0xE1C6] = 0xE1C9 ^ 0xE1C6;
        KeyMappings.e[0xE35E ^ 0xE3F7] = 0xE3A7 ^ 0xE3F7;
        KeyMappings.e[0x8C60 ^ 0x8DEC] = 0x8DEC ^ 0x8DEC;
        KeyMappings.e[0x3919 ^ 0x3800] = 0xD9C8 ^ 0x3800;
        KeyMappings.e[0x3053 ^ 0x307A] = 0x3065 ^ 0x307A;
        KeyMappings.e[0x9BE8 ^ 0x9BDC] = 0x9BBF ^ 0x9BDC;
        KeyMappings.e[0xFA02 ^ 0xFB30] = 0xFFFF04C8 ^ 0xFB30;
        KeyMappings.e[0xD1D3 ^ 0xD1FF] = 0xFFFF2E7D ^ 0xD1FF;
        KeyMappings.e[0xD8C1 ^ 0xD984] = 0xD98F ^ 0xD984;
        KeyMappings.e[0x9F38 ^ 0x9F5A] = 0xFFFF60FD ^ 0x9F5A;
        KeyMappings.e[0xA2B2 ^ 0xA295] = 0xA294 ^ 0xA295;
        KeyMappings.e[0xDE22 ^ 0xDF1D] = 0xDF32 ^ 0xDF1D;
        KeyMappings.e[0x6349 ^ 0x63A7] = 0x63E2 ^ 0x63A7;
        KeyMappings.e[0xDB76 ^ 0xDBD7] = 0xFFFF2444 ^ 0xDBD7;
        KeyMappings.e[0x4ED1 ^ 0x4F8C] = 0xFFFFB06F ^ 0x4F8C;
        KeyMappings.e[0xEBFF ^ 0xEB27] = 0xEB60 ^ 0xEB27;
        KeyMappings.e[0x1EC0 ^ 0x1F97] = 0xFFFFE067 ^ 0x1F97;
        KeyMappings.e[0x21B9 ^ 0x216D] = 0xFFFFDEE9 ^ 0x216D;
        KeyMappings.e[0x315F ^ 0x31B6] = 0x3187 ^ 0x31B6;
        KeyMappings.e[0x2AF8 ^ 0x2A71] = 0x2A3F ^ 0x2A71;
        KeyMappings.e[0x301B ^ 0x307D] = 0xFFFFCF0B ^ 0x307D;
        KeyMappings.e[0x9FE5 ^ 0x9EA4] = 0xFFFF6169 ^ 0x9EA4;
        KeyMappings.e[0x9F96 ^ 0x9F68] = 0x9F29 ^ 0x9F68;
        KeyMappings.e[0x495F ^ 0x4835] = 0xFFFFB7EE ^ 0x4835;
        KeyMappings.e[0xF8C6 ^ 0xF8F4] = 0xF8D8 ^ 0xF8F4;
        KeyMappings.e[0x9941 ^ 0x980E] = 0x987A ^ 0x980E;
        KeyMappings.e[0x5DEA ^ 0x5CEC] = 0xFFFFA374 ^ 0x5CEC;
        KeyMappings.e[0xA291 ^ 0xA3EE] = 0xFFFF5C91 ^ 0xA3EE;
        KeyMappings.e[0xBD71 ^ 0xBD62] = 0xBD33 ^ 0xBD62;
        KeyMappings.e[0xD219 ^ 0xD243] = 0xD20A ^ 0xD243;
        KeyMappings.e[0xD502 ^ 0xD411] = 0xD411 ^ 0xD411;
        KeyMappings.e[0x3B10 ^ 0x3A00] = 0x3A01 ^ 0x3A00;
        KeyMappings.e[0xB543 ^ 0xB558] = 0xB54D ^ 0xB558;
        KeyMappings.e[0x55FC ^ 0x55E3] = 0xFFFFAA47 ^ 0x55E3;
        KeyMappings.e[0xE82F ^ 0xE92A] = 0xE926 ^ 0xE92A;
        KeyMappings.e[0x21FE ^ 0x212B] = 0xFFFFDECE ^ 0x212B;
        KeyMappings.e[0x6747 ^ 0x67C3] = 0x6742 ^ 0x67C3;
        KeyMappings.e[0x52C2 ^ 0x527A] = 0xFFFFADE0 ^ 0x527A;
        KeyMappings.e[0xCAAD ^ 0xCA4A] = 0xCA09 ^ 0xCA4A;
        KeyMappings.e[0x236A ^ 0x239A] = 0x23BC ^ 0x239A;
        KeyMappings.e[0x44C8 ^ 0x45BA] = 0x45BD ^ 0x45BA;
        KeyMappings.e[0x7A7E ^ 0x7B45] = 0x7B5F ^ 0x7B45;
        KeyMappings.e[0x18DE ^ 0x1956] = 0x1976 ^ 0x1956;
        KeyMappings.e[0x6AE5 ^ 0x6AFD] = 0xFFFF9551 ^ 0x6AFD;
        KeyMappings.e[0xA59F ^ 0xA5B0] = 0xFFFF5A71 ^ 0xA5B0;
        KeyMappings.e[0x1061E ^ 0x106A7] = 0x10698 ^ 0x106A7;
        KeyMappings.e[0x3BE1 ^ 0x3B09] = 0xFFFFC4C7 ^ 0x3B09;
        KeyMappings.e[0xC598 ^ 0xC490] = 0xC4E4 ^ 0xC490;
        KeyMappings.e[0xA177 ^ 0xA165] = 0xFFFF5EBE ^ 0xA165;
        KeyMappings.e[0x102B3 ^ 0x10334] = 0xFFFEFCC1 ^ 0x10334;
        KeyMappings.e[0x1098D ^ 0x1093A] = 0x1099F ^ 0x1093A;
        KeyMappings.e[0xC86A ^ 0xC8A7] = 0xFFFF3738 ^ 0xC8A7;
        KeyMappings.e[0xDB3C ^ 0xDABC] = 0xFFFF253A ^ 0xDABC;
        KeyMappings.e[0x335D ^ 0x3271] = 0x3235 ^ 0x3271;
        KeyMappings.e[0x101D9 ^ 0x100C6] = 0x13E8B ^ 0x100C6;
        KeyMappings.e[0xB2C1 ^ 0xB289] = 0xFFFF4D3C ^ 0xB289;
        KeyMappings.e[0x39B8 ^ 0x38B3] = 0x380E ^ 0x38B3;
        KeyMappings.e[0xFDDF ^ 0xFCA5] = 0xFCE0 ^ 0xFCA5;
        KeyMappings.e[0x9C05 ^ 0x9D07] = 0x9D38 ^ 0x9D07;
        KeyMappings.e[0xCD11 ^ 0xCC75] = 0xFFFF3319 ^ 0xCC75;
        KeyMappings.e[0xC28D ^ 0xC256] = 0xC2D3 ^ 0xC256;
        KeyMappings.e[0xBE35 ^ 0xBE67] = 0xBE71 ^ 0xBE67;
        KeyMappings.e[0xFB7E ^ 0xFBD6] = 0xFFFF0440 ^ 0xFBD6;
        KeyMappings.e[0xE098 ^ 0xE0DA] = 0xFFFF1F75 ^ 0xE0DA;
        KeyMappings.e[0xBD1B ^ 0xBDA6] = 0xBD7D ^ 0xBDA6;
        KeyMappings.e[0x7CC8 ^ 0x7C29] = 0xFFFF8393 ^ 0x7C29;
        KeyMappings.e[0xD9C1 ^ 0xD997] = 0xFFFF2601 ^ 0xD997;
        KeyMappings.e[0x9D02 ^ 0x9DA7] = 0xFFFF6244 ^ 0x9DA7;
        KeyMappings.e[0x2DA8 ^ 0x2CF8] = 0x2CB0 ^ 0x2CF8;
        KeyMappings.e[0x2A06 ^ 0x2ABD] = 0xFFFFD577 ^ 0x2ABD;
        KeyMappings.e[0xC15A ^ 0xC02E] = 0xFFFF3FE7 ^ 0xC02E;
        KeyMappings.e[0x6F8D ^ 0x6EA7] = 0xFFFF9166 ^ 0x6EA7;
        KeyMappings.e[0x945 ^ 0x9B2] = 0x9C1 ^ 0x9B2;
        KeyMappings.e[0x2BBC ^ 0x2BA6] = 0xFFFFD422 ^ 0x2BA6;
        KeyMappings.e[0xFCE9 ^ 0xFD82] = 0xFDCB ^ 0xFD82;
        KeyMappings.e[0xDE67 ^ 0xDEA5] = 0xDEE9 ^ 0xDEA5;
        KeyMappings.e[0x5651 ^ 0x5652] = 0xFFFFA990 ^ 0x5652;
        KeyMappings.e[0xE2B5 ^ 0xE3FD] = 0xFFFF1C76 ^ 0xE3FD;
        KeyMappings.e[0xB40D ^ 0xB530] = 0xFFFF4AA3 ^ 0xB530;
        KeyMappings.e[0x81B0 ^ 0x8190] = 0x81CF ^ 0x8190;
        KeyMappings.e[0xDA28 ^ 0xDB35] = 0xDF4E ^ 0xDB35;
        KeyMappings.e[0xE37B ^ 0xE3E9] = 0xFFFF1C2B ^ 0xE3E9;
        KeyMappings.e[0x6CE ^ 0x61D] = 0x604 ^ 0x61D;
        KeyMappings.e[0x8695 ^ 0x8692] = 0xFFFF795F ^ 0x8692;
        KeyMappings.e[0xF49D ^ 0xF456] = 0xFFFF0B9E ^ 0xF456;
        KeyMappings.e[0x432 ^ 0x4AC] = 0x4A5 ^ 0x4AC;
        KeyMappings.e[0xBDE5 ^ 0xBC95] = 0xBCC9 ^ 0xBC95;
        KeyMappings.e[0xA7FF ^ 0xA682] = 0xA6C7 ^ 0xA682;
        KeyMappings.e[0x3BD5 ^ 0x3BD8] = 0xFFFFC412 ^ 0x3BD8;
        KeyMappings.e[0x2105 ^ 0x2172] = 0x2169 ^ 0x2172;
        KeyMappings.e[0x858 ^ 0x899] = 0x8CA ^ 0x899;
        KeyMappings.e[0xB8D9 ^ 0xB8B7] = 0xFFFF4777 ^ 0xB8B7;
        KeyMappings.e[0xECA9 ^ 0xEC1D] = 0xEC38 ^ 0xEC1D;
        KeyMappings.e[0xFF24 ^ 0xFF94] = 0xFFFF0031 ^ 0xFF94;
        KeyMappings.e[0x73BC ^ 0x7285] = 0xFFFF8D71 ^ 0x7285;
        KeyMappings.e[0x6A92 ^ 0x6A38] = 0x6A7F ^ 0x6A38;
        KeyMappings.e[0xE0B0 ^ 0xE0B2] = 0xE0B9 ^ 0xE0B2;
        KeyMappings.e[0xF9B8 ^ 0xF882] = 0xF89F ^ 0xF882;
        KeyMappings.e[0x7C72 ^ 0x7D6C] = 0x7EA0 ^ 0x7D6C;
        KeyMappings.e[0xE9B4 ^ 0xE9CE] = 0xE9C0 ^ 0xE9CE;
        KeyMappings.e[0x2C5A ^ 0x2CD7] = 0x2CF9 ^ 0x2CD7;
        KeyMappings.e[0x657A ^ 0x659A] = 0xFFFF9A59 ^ 0x659A;
        KeyMappings.e[0x6E1B ^ 0x6ED8] = 0xFFFF9107 ^ 0x6ED8;
        KeyMappings.e[0x7506 ^ 0x7548] = 0xFFFF8AB1 ^ 0x7548;
        KeyMappings.e[0xD743 ^ 0xD666] = 0xFFFF29FC ^ 0xD666;
        KeyMappings.e[0xC8EA ^ 0xC8BB] = 0xFFFF3754 ^ 0xC8BB;
        KeyMappings.e[0x1B55 ^ 0x1BEA] = 0x1BA5 ^ 0x1BEA;
        KeyMappings.e[0x9B4A ^ 0x9B3A] = 0x9B7F ^ 0x9B3A;
        KeyMappings.e[0x108EB ^ 0x109F0] = 0x1C4B9 ^ 0x109F0;
        KeyMappings.e[0x97C2 ^ 0x9786] = 0xFFFF6864 ^ 0x9786;
        KeyMappings.e[0xB43A ^ 0xB462] = 0xFFFF4BFF ^ 0xB462;
        KeyMappings.e[0x9CE9 ^ 0x9C7F] = 0xFFFF634C ^ 0x9C7F;
        KeyMappings.e[0xD66C ^ 0xD65A] = 0xFFFF299B ^ 0xD65A;
        KeyMappings.e[0xF7D6 ^ 0xF743] = 0xF748 ^ 0xF743;
        KeyMappings.e[0x91E9 ^ 0x90F8] = 0x90F8 ^ 0x90F8;
        KeyMappings.e[0xC4E0 ^ 0xC4C2] = 0xC4EF ^ 0xC4C2;
        KeyMappings.e[0x10F43 ^ 0x10E2A] = 0xFFFEF1B8 ^ 0x10E2A;
        KeyMappings.e[0xA472 ^ 0xA564] = 0x17C6 ^ 0xA564;
        KeyMappings.e[0xFE59 ^ 0xFFD8] = 0xFFD7 ^ 0xFFD8;
        KeyMappings.e[0x7D61 ^ 0x7C43] = 0xFFFF832A ^ 0x7C43;
        KeyMappings.e[0x658F ^ 0x6586] = 0x65D5 ^ 0x6586;
        KeyMappings.e[0xF3FD ^ 0xF351] = 0xFFFF0CEB ^ 0xF351;
        KeyMappings.e[0x4F66 ^ 0x4E73] = 0x4CF3 ^ 0x4E73;
        KeyMappings.e[0xDD0B ^ 0xDD5C] = 0xFFFF22C9 ^ 0xDD5C;
        KeyMappings.e[0x78AC ^ 0x7921] = 0xFFFF86EB ^ 0x7921;
        KeyMappings.e[0x3927 ^ 0x39B0] = 0x39CE ^ 0x39B0;
        KeyMappings.e[0xBEBE ^ 0xBEE0] = 0xFFFF4102 ^ 0xBEE0;
        KeyMappings.e[0x4EE9 ^ 0x4FC2] = 0xFFFFB0B4 ^ 0x4FC2;
        KeyMappings.e[0x53FA ^ 0x532D] = 0xFFFFACB9 ^ 0x532D;
        KeyMappings.e[0x10339 ^ 0x10348] = 0xFFFEFCDD ^ 0x10348;
        KeyMappings.e[0x10EDF ^ 0x10E8F] = 0x10EA5 ^ 0x10E8F;
        KeyMappings.e[0x5797 ^ 0x56C8] = 0xFFFFA923 ^ 0x56C8;
        KeyMappings.e[0x4CF0 ^ 0x4C04] = 0x4C55 ^ 0x4C04;
        KeyMappings.e[0x592F ^ 0x59B0] = 0x59D0 ^ 0x59B0;
        KeyMappings.e[0x5503 ^ 0x557E] = 0x5570 ^ 0x557E;
        KeyMappings.e[0x106D1 ^ 0x106CC] = 0xFFFEF92F ^ 0x106CC;
        KeyMappings.e[0xB519 ^ 0xB44A] = 0xB47F ^ 0xB44A;
        KeyMappings.e[0xDB88 ^ 0xDAE6] = 0xFFFF254A ^ 0xDAE6;
        KeyMappings.e[0x10686 ^ 0x107E5] = 0xFFFEF845 ^ 0x107E5;
        KeyMappings.e[0x17F7 ^ 0x17A2] = 0xFFFFE80B ^ 0x17A2;
        KeyMappings.e[0x8ADB ^ 0x8AE4] = 0x8AEF ^ 0x8AE4;
        KeyMappings.e[0xBA1B ^ 0xBA72] = 0xBAE8 ^ 0xBA72;
        KeyMappings.e[0x1AFE ^ 0x1BFF] = 0xFFFFE45D ^ 0x1BFF;
        KeyMappings.e[0xA92A ^ 0xA985] = 0xA981 ^ 0xA985;
        KeyMappings.e[0x5D26 ^ 0x5D61] = 0x5D4C ^ 0x5D61;
        KeyMappings.e[0x96CF ^ 0x9611] = 0x9615 ^ 0x9611;
        KeyMappings.e[0x183C ^ 0x191A] = 0x1942 ^ 0x191A;
        KeyMappings.e[0x62FA ^ 0x62C4] = 0xFFFF9D24 ^ 0x62C4;
        KeyMappings.e[0x373 ^ 0x25E] = 0x219 ^ 0x25E;
        KeyMappings.e[0xF101 ^ 0xF1F3] = 0xF1DC ^ 0xF1F3;
        KeyMappings.e[0xD822 ^ 0xD92C] = 0xD92F ^ 0xD92C;
        KeyMappings.e[0xE18C ^ 0xE1CC] = 0xE19E ^ 0xE1CC;
        KeyMappings.e[0x548B ^ 0x5429] = 0xFFFFABD8 ^ 0x5429;
        KeyMappings.e[0x618D ^ 0x6161] = 0x616E ^ 0x6161;
        KeyMappings.e[0xC404 ^ 0xC58A] = 0xC5F2 ^ 0xC58A;
        KeyMappings.e[0x3197 ^ 0x3107] = 0xFFFFCE81 ^ 0x3107;
        KeyMappings.e[0xC68E ^ 0xC7DF] = 0xFFFF382B ^ 0xC7DF;
        KeyMappings.e[0x664C ^ 0x66A3] = 0xFFFF9965 ^ 0x66A3;
        KeyMappings.e[0x4BFE ^ 0x4B1D] = 0xFFFFB48D ^ 0x4B1D;
        KeyMappings.e[0x2596 ^ 0x25A3] = 0xFFFFDA6B ^ 0x25A3;
        KeyMappings.e[0x829 ^ 0x96D] = 0xFFFFF6E3 ^ 0x96D;
        KeyMappings.e[0x3196 ^ 0x30D8] = 0x30D1 ^ 0x30D8;
        KeyMappings.e[0x909B ^ 0x9029] = 0xFFFF6FCA ^ 0x9029;
        KeyMappings.e[0x10DA7 ^ 0x10D9B] = 0x10DDD ^ 0x10D9B;
        KeyMappings.e[0x4B73 ^ 0x4B43] = 0x4B4D ^ 0x4B43;
        KeyMappings.e[0x575B ^ 0x565B] = 0x5628 ^ 0x565B;
        KeyMappings.e[0xE4F7 ^ 0xE415] = 0xFFFF1BE3 ^ 0xE415;
        KeyMappings.e[0xCECB ^ 0xCE71] = 0xCE0F ^ 0xCE71;
        KeyMappings.e[0xCE6F ^ 0xCE57] = 0xCE5A ^ 0xCE57;
        KeyMappings.e[0x4FB3 ^ 0x4E94] = 0xFFFFB136 ^ 0x4E94;
        KeyMappings.e[0x3C56 ^ 0x3CB0] = 0x3CF7 ^ 0x3CB0;
        KeyMappings.e[0xA412 ^ 0xA43F] = 0xFFFF5BB0 ^ 0xA43F;
        KeyMappings.e[0xA338 ^ 0xA26D] = 0xFFFF5DCB ^ 0xA26D;
        KeyMappings.e[0xBD94 ^ 0xBCA5] = 0xFFFF4349 ^ 0xBCA5;
        KeyMappings.e[0x45C7 ^ 0x452D] = 0x4562 ^ 0x452D;
        KeyMappings.e[0x1950 ^ 0x18DA] = 0x189C ^ 0x18DA;
        KeyMappings.e[0xFFAE ^ 0xFFF1] = 0xFFFF0031 ^ 0xFFF1;
        KeyMappings.e[0xD66B ^ 0xD615] = 0xFFFF29B9 ^ 0xD615;
        KeyMappings.e[0x5E37 ^ 0x5F3B] = 0x5F0A ^ 0x5F3B;
        KeyMappings.e[0xE01C ^ 0xE0CC] = 0xFFFF1F6A ^ 0xE0CC;
        KeyMappings.e[0x105C3 ^ 0x1049D] = 0x10482 ^ 0x1049D;
        KeyMappings.e[0xF6BF ^ 0xF63F] = 0xF660 ^ 0xF63F;
        KeyMappings.e[0x4125 ^ 0x41E9] = 0xFFFFBEDA ^ 0x41E9;
        KeyMappings.e[0x6497 ^ 0x643C] = 0xFFFF9BB2 ^ 0x643C;
        KeyMappings.e[0x9983 ^ 0x9801] = 0xFFFF67F7 ^ 0x9801;
        KeyMappings.e[0x70CC ^ 0x7050] = 0xFFFF8FA7 ^ 0x7050;
        KeyMappings.e[0xB5F ^ 0xB55] = 0xFFFFF4A0 ^ 0xB55;
        KeyMappings.e[0xB4A4 ^ 0xB43C] = 0xB473 ^ 0xB43C;
        KeyMappings.e[0xD554 ^ 0xD563] = 0xFFFF2AA1 ^ 0xD563;
        KeyMappings.e[0xF911 ^ 0xF97D] = 0xFFFF0694 ^ 0xF97D;
        KeyMappings.e[0x9B11 ^ 0x9B1D] = 0xFFFF64B8 ^ 0x9B1D;
        KeyMappings.e[0x40E8 ^ 0x4187] = 0xFFFFBE3C ^ 0x4187;
        KeyMappings.e[0x10CEC ^ 0x10C3E] = 0xFFFEF383 ^ 0x10C3E;
        KeyMappings.e[0x1079C ^ 0x1073B] = 0x10721 ^ 0x1073B;
        KeyMappings.e[0xAD4 ^ 0xA53] = 0xA36 ^ 0xA53;
        KeyMappings.e[0x5B18 ^ 0x5B72] = 0x5B21 ^ 0x5B72;
        KeyMappings.e[0x55FA ^ 0x54E8] = 0x54EA ^ 0x54E8;
        KeyMappings.e[0x55BB ^ 0x551B] = 0xFFFFAACF ^ 0x551B;
        KeyMappings.e[0x7EA3 ^ 0x7FD2] = 0xFFFF807B ^ 0x7FD2;
        KeyMappings.e[0x15F9 ^ 0x157A] = 0x1524 ^ 0x157A;
        KeyMappings.e[0xEC8A ^ 0xEC56] = 0xEC56 ^ 0xEC56;
        KeyMappings.e[0x9E2D ^ 0x9E6E] = 0x9E24 ^ 0x9E6E;
        KeyMappings.e[0x98FC ^ 0x9826] = 0xFFFF67F6 ^ 0x9826;
        KeyMappings.e[0x10AD3 ^ 0x10AC3] = 0xFFFEF559 ^ 0x10AC3;
        KeyMappings.e[0x2E3F ^ 0x2ECE] = 0x2EC7 ^ 0x2ECE;
        KeyMappings.e[0xFBEE ^ 0xFB37] = 0xFFFF048A ^ 0xFB37;
        KeyMappings.e[0xFCEF ^ 0xFDCB] = 0xFFFF020F ^ 0xFDCB;
        KeyMappings.e[0xDDE4 ^ 0xDD7D] = 0xDD1B ^ 0xDD7D;
        KeyMappings.e[0x251C ^ 0x2498] = 0x2493 ^ 0x2498;
        KeyMappings.e[0x8EB6 ^ 0x8ED6] = 0x8EC9 ^ 0x8ED6;
        KeyMappings.e[0x48A0 ^ 0x48B4] = 0xFFFFB72F ^ 0x48B4;
        KeyMappings.e[0x3671 ^ 0x3744] = 0x3751 ^ 0x3744;
        KeyMappings.e[0xD6B7 ^ 0xD738] = 0xD733 ^ 0xD738;
        KeyMappings.e[0xA863 ^ 0xA8AC] = 0xFFFF5721 ^ 0xA8AC;
        KeyMappings.e[0x9445 ^ 0x94A8] = 0xFFFF6B25 ^ 0x94A8;
        KeyMappings.e[0x4FC4 ^ 0x4EA8] = 0x4EC7 ^ 0x4EA8;
        KeyMappings.e[0x4BB ^ 0x473] = 0x42E ^ 0x473;
        KeyMappings.e[0x68A4 ^ 0x6875] = 0x687E ^ 0x6875;
        KeyMappings.e[0xBDA8 ^ 0xBC89] = 0xBC89 ^ 0xBC89;
        KeyMappings.e[0x10636 ^ 0x106EB] = 0x10699 ^ 0x106EB;
        KeyMappings.e[0x8DAF ^ 0x8D25] = 0x8D31 ^ 0x8D25;
        KeyMappings.e[0x9833 ^ 0x9848] = 0xFFFF67DC ^ 0x9848;
        KeyMappings.e[0x74DF ^ 0x75B8] = 0xFFFF8A91 ^ 0x75B8;
        KeyMappings.e[0x959 ^ 0x964] = 0xFFFFF6C0 ^ 0x964;
        KeyMappings.e[0x6192 ^ 0x60E1] = 0x60EB ^ 0x60E1;
        KeyMappings.e[0xEA6 ^ 0xF90] = 0xFFFFF029 ^ 0xF90;
        KeyMappings.e[0x832C ^ 0x8315] = 0xFFFF7C54 ^ 0x8315;
        KeyMappings.e[0x2D98 ^ 0x2DF7] = 0x2DDE ^ 0x2DF7;
        KeyMappings.e[0xFBD9 ^ 0xFAC5] = 0x7BCE ^ 0xFAC5;
        KeyMappings.e[0x13A0 ^ 0x13D9] = 0xFFFFEC23 ^ 0x13D9;
        KeyMappings.e[0xD99 ^ 0xC12] = 0xC29 ^ 0xC12;
        KeyMappings.e[0x1099E ^ 0x108DC] = 0xFFFEF779 ^ 0x108DC;
        KeyMappings.e[0x8E53 ^ 0x8E25] = 0x8E2F ^ 0x8E25;
        KeyMappings.e[0xAE22 ^ 0xAF28] = 0xAF0A ^ 0xAF28;
        KeyMappings.e[0xF796 ^ 0xF6BE] = 0xFFFF095B ^ 0xF6BE;
        KeyMappings.e[0x699C ^ 0x6906] = 0xFFFF96F1 ^ 0x6906;
        KeyMappings.e[0x3547 ^ 0x35C2] = 0xFFFFCA4F ^ 0x35C2;
        KeyMappings.e[0x853D ^ 0x84BB] = 0xFFFF7B74 ^ 0x84BB;
        KeyMappings.e[0x55B6 ^ 0x54AC] = 0x7024 ^ 0x54AC;
        KeyMappings.e[0x2C05 ^ 0x2D6D] = 0x2D07 ^ 0x2D6D;
        KeyMappings.e[0x9C12 ^ 0x9D51] = 0xFFFF62F4 ^ 0x9D51;
        KeyMappings.e[0x104C8 ^ 0x105AD] = 0x1059D ^ 0x105AD;
        KeyMappings.e[0xF1DA ^ 0xF174] = 0xFFFF0ED5 ^ 0xF174;
        KeyMappings.e[0xDE71 ^ 0xDEB8] = 0xDEEB ^ 0xDEB8;
        KeyMappings.e[0x11ED ^ 0x1068] = 0x1042 ^ 0x1068;
        KeyMappings.e[0xEEA ^ 0xEA1] = 0xE98 ^ 0xEA1;
        KeyMappings.e[0xD1A6 ^ 0xD0FD] = 0xD0DF ^ 0xD0FD;
        KeyMappings.e[0x5BF7 ^ 0x5B49] = 0x5B25 ^ 0x5B49;
        KeyMappings.e[0x412E ^ 0x4130] = 0x41D4 ^ 0x4130;
        KeyMappings.e[0x8154 ^ 0x8177] = 0x8119 ^ 0x8177;
        KeyMappings.e[0x3C75 ^ 0x3CB2] = 0x3CD3 ^ 0x3CB2;
        KeyMappings.e[0xB3AC ^ 0xB2D0] = 0xB2AE ^ 0xB2D0;
        KeyMappings.e[0x10286 ^ 0x102DD] = 0x102FC ^ 0x102DD;
        KeyMappings.e[0x4675 ^ 0x4616] = 0xFFFFB943 ^ 0x4616;
        KeyMappings.e[0x5F1E ^ 0x5E46] = 0xFFFFA1AE ^ 0x5E46;
        KeyMappings.e[0xFCE ^ 0xFA3] = 0xFF8 ^ 0xFA3;
        KeyMappings.e[0x673D ^ 0x6630] = 0x665C ^ 0x6630;
        KeyMappings.e[0x995 ^ 0x8C7] = 0xFFFFF770 ^ 0x8C7;
        KeyMappings.e[0xD085 ^ 0xD08D] = 0xFFFF2F6D ^ 0xD08D;
        KeyMappings.e[0x764A ^ 0x76B3] = 0x76D3 ^ 0x76B3;
        KeyMappings.e[0x9AD6 ^ 0x9A2E] = 0x9A44 ^ 0x9A2E;
        KeyMappings.e[0x7E20 ^ 0x7F0F] = 0xFFFF80F3 ^ 0x7F0F;
        KeyMappings.e[0x4809 ^ 0x4942] = 0xFFFFB6C4 ^ 0x4942;
        KeyMappings.e[0x3230 ^ 0x3203] = 0xFFFFCD82 ^ 0x3203;
        KeyMappings.e[0x8465 ^ 0x84C6] = 0xFFFF7B28 ^ 0x84C6;
        KeyMappings.e[0x885B ^ 0x887A] = 0x8839 ^ 0x887A;
        KeyMappings.e[0xE669 ^ 0xE6D5] = 0xE69D ^ 0xE6D5;
        KeyMappings.e[0x1073D ^ 0x106BE] = 0xFFFEF959 ^ 0x106BE;
        KeyMappings.e[0x32C ^ 0x26A] = 0x266 ^ 0x26A;
        KeyMappings.e[0xB663 ^ 0xB61B] = 0xB634 ^ 0xB61B;
        KeyMappings.e[0x4822 ^ 0x4968] = 0x4949 ^ 0x4968;
        KeyMappings.e[0x6832 ^ 0x696E] = 0xFFFF96A7 ^ 0x696E;
        KeyMappings.e[0x10729 ^ 0x107B4] = 0xFFFEF85C ^ 0x107B4;
        KeyMappings.e[0x5085 ^ 0x50E2] = 0x50A3 ^ 0x50E2;
        KeyMappings.e[0x53C7 ^ 0x52B9] = 0xFFFFAD71 ^ 0x52B9;
        KeyMappings.e[0x81B4 ^ 0x80BB] = 0x80BB ^ 0x80BB;
        KeyMappings.e[0x9A5F ^ 0x9A79] = 0x9A23 ^ 0x9A79;
        KeyMappings.e[0xB23A ^ 0xB2C6] = 0xB257 ^ 0xB2C6;
        KeyMappings.e[0x159B ^ 0x157F] = 0xFFFFEAD0 ^ 0x157F;
        KeyMappings.e[0xC76F ^ 0xC732] = 0xC709 ^ 0xC732;
        KeyMappings.e[0xC42E ^ 0xC414] = 0xC443 ^ 0xC414;
        KeyMappings.e[0x4177 ^ 0x417C] = 0xFFFFBEEC ^ 0x417C;
        KeyMappings.e[0x1AE5 ^ 0x1A54] = 0x1A6B ^ 0x1A54;
        KeyMappings.e[0x6B29 ^ 0x6B3C] = 0x6B05 ^ 0x6B3C;
        KeyMappings.e[0x9592 ^ 0x9503] = 0x9550 ^ 0x9503;
        KeyMappings.e[0xE1C1 ^ 0xE0AC] = 0xE09F ^ 0xE0AC;
        KeyMappings.e[0x143C ^ 0x14C7] = 0x1499 ^ 0x14C7;
        KeyMappings.e[0x22E2 ^ 0x22FE] = 0xFFFFDD03 ^ 0x22FE;
        KeyMappings.e[0xF864 ^ 0xF800] = 0xF841 ^ 0xF800;
        KeyMappings.e[0x4955 ^ 0x497F] = 0x4997 ^ 0x497F;
        KeyMappings.e[0x1A98 ^ 0x1BD4] = 0x1B9D ^ 0x1BD4;
        KeyMappings.e[0x5449 ^ 0x5577] = 0x5529 ^ 0x5577;
        KeyMappings.e[0xC710 ^ 0xC7CF] = 0xC7EE ^ 0xC7CF;
        KeyMappings.e[0x9949 ^ 0x9948] = 0x990C ^ 0x9948;
        KeyMappings.e[0xAFD1 ^ 0xAE9C] = 0xFFFF5152 ^ 0xAE9C;
        KeyMappings.e[0x119C ^ 0x11B4] = 0x1194 ^ 0x11B4;
        KeyMappings.e[0x6F58 ^ 0x6F9C] = 0xFFFF907A ^ 0x6F9C;
        KeyMappings.e[0xAF4A ^ 0xAF4E] = 0xFFFF50EE ^ 0xAF4E;
        KeyMappings.e[0x7839 ^ 0x793D] = 0xFFFF86DD ^ 0x793D;
        KeyMappings.e[0xD3C3 ^ 0xD2E3] = 0x7F7D ^ 0xD2E3;
        KeyMappings.e[0x961F ^ 0x977F] = 0x9775 ^ 0x977F;
        KeyMappings.e[0x728C ^ 0x724A] = 0x7294 ^ 0x724A;
        KeyMappings.e[0x27BE ^ 0x2795] = 0x27FD ^ 0x2795;
        KeyMappings.e[0xE5BA ^ 0xE5E6] = 0xE583 ^ 0xE5E6;
        KeyMappings.e[0x34B9 ^ 0x34BC] = 0x34E3 ^ 0x34BC;
        KeyMappings.e[0x8758 ^ 0x87EE] = 0x87D4 ^ 0x87EE;
        KeyMappings.e[0x3B72 ^ 0x3BC7] = 0xFFFFC42D ^ 0x3BC7;
        KeyMappings.e[0x7728 ^ 0x7614] = 0xFFFF89F7 ^ 0x7614;
        KeyMappings.e[0x6498 ^ 0x65DF] = 0x65BE ^ 0x65DF;
        KeyMappings.e[0x5342 ^ 0x5316] = 0x53F5 ^ 0x5316;
        KeyMappings.e[0xB440 ^ 0xB433] = 0xB436 ^ 0xB433;
        KeyMappings.e[0xB14D ^ 0xB125] = 0xFFFF4EAD ^ 0xB125;
        KeyMappings.e[0x2999 ^ 0x29A2] = 0x29CA ^ 0x29A2;
        KeyMappings.e[0x8B8D ^ 0x8AA3] = 0x8AAD ^ 0x8AA3;
        KeyMappings.e[0x3265 ^ 0x3296] = 0x32F1 ^ 0x3296;
        KeyMappings.e[0xC610 ^ 0xC607] = 0xFFFF39E0 ^ 0xC607;
        KeyMappings.e[0x736 ^ 0x605] = 0x629 ^ 0x605;
        KeyMappings.e[0x6878 ^ 0x68E3] = 0x6888 ^ 0x68E3;
        KeyMappings.e[0x14D ^ 0x107] = 0xFFFFFED6 ^ 0x107;
        KeyMappings.e[0x41EF ^ 0x41F6] = 0x41D0 ^ 0x41F6;
        KeyMappings.e[0xE726 ^ 0xE78B] = 0xFFFF187C ^ 0xE78B;
        KeyMappings.e[0xAB7E ^ 0xAB32] = 0xAB6B ^ 0xAB32;
        KeyMappings.e[0xC7CA ^ 0xC704] = 0xFFFF38B0 ^ 0xC704;
        KeyMappings.e[0x82F9 ^ 0x82B6] = 0xFFFF7D7C ^ 0x82B6;
        KeyMappings.e[0x3355 ^ 0x331C] = 0x3304 ^ 0x331C;
        KeyMappings.e[0xE4E2 ^ 0xE434] = 0xFFFF1B8E ^ 0xE434;
        KeyMappings.e[0x9A90 ^ 0x9A04] = 0x9A36 ^ 0x9A04;
        KeyMappings.e[0x7FDC ^ 0x7F2A] = 0x7FD3 ^ 0x7F2A;
        KeyMappings.e[0xCD80 ^ 0xCDD3] = 0xCDCD ^ 0xCDD3;
        KeyMappings.e[0x37E1 ^ 0x37A4] = 0x37D0 ^ 0x37A4;
        KeyMappings.e[0x5DC1 ^ 0x5D40] = 0xFFFFA288 ^ 0x5D40;
        KeyMappings.e[0x8D2D ^ 0x8DC6] = 0x8D83 ^ 0x8DC6;
        KeyMappings.e[0xD4FA ^ 0xD5EE] = 0xD5EE ^ 0xD5EE;
        KeyMappings.e[0xD099 ^ 0xD110] = 0xD151 ^ 0xD110;
        KeyMappings.e[0xEAB5 ^ 0xEA3B] = 0xFFFF15E5 ^ 0xEA3B;
        KeyMappings.e[0x509D ^ 0x50E1] = 0xFFFFAF65 ^ 0x50E1;
        KeyMappings.e[0xCB1A ^ 0xCA13] = 0xFFFF35CD ^ 0xCA13;
        KeyMappings.e[0x5D5D ^ 0x5D52] = 0x5D5B ^ 0x5D52;
        KeyMappings.e[0x6B54 ^ 0x6B15] = 0x6B5F ^ 0x6B15;
        KeyMappings.e[0x4B2B ^ 0x4A1F] = 0xFFFFB5BA ^ 0x4A1F;
        KeyMappings.e[0xBC7 ^ 0xABF] = 0xFFFFF535 ^ 0xABF;
        KeyMappings.e[0x272A ^ 0x27A8] = 0xFFFFD876 ^ 0x27A8;
        KeyMappings.e[0x10BDD ^ 0x10BB6] = 0x10BF1 ^ 0x10BB6;
        KeyMappings.e[0xF8DD ^ 0xF838] = 0xF84E ^ 0xF838;
        KeyMappings.e[0xB5E8 ^ 0xB528] = 0xFFFF4AAF ^ 0xB528;
        KeyMappings.e[0x2723 ^ 0x265A] = 0x26E4 ^ 0x265A;
    }
}

