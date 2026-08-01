/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.extensions;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u00020\u0016H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u0002H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b\u00a8\u0006 "}, d2={"Lkotakbaz/rain/client/extensions/Category;", "", "", "name", "icon", "desc", "searchPlaceholder", "searchFieldIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotakbaz/rain/client/extensions/Category;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getIcon", "getDesc", "getSearchPlaceholder", "getSearchFieldIcon", "rain-visuals"})
public final class Category {
    @NotNull
    private final String a;
    @NotNull
    private final String A;
    @NotNull
    private final String b;
    @NotNull
    private final String B;
    @NotNull
    private final String c;
    private static Object[] C;
    private static Object D;
    private static Object[] e;
    private static Object[] d;
    private static Object[] E;
    public static int[] f;

    public Category(@NotNull String name, @NotNull String icon, @NotNull String desc, @NotNull String searchPlaceholder, @NotNull String searchFieldIcon) {
        int n2 = f[0];
        n2 += f[1];
        Intrinsics.checkNotNullParameter(name, (String)C[n2 -= f[2]]);
        int n3 = f[3];
        n3 -= f[4];
        Intrinsics.checkNotNullParameter(icon, (String)C[n3 += f[5]]);
        int n4 = f[6];
        n4 ^= f[7];
        Intrinsics.checkNotNullParameter(desc, (String)C[n4 += f[8]]);
        int n5 = f[9];
        n5 ^= f[10];
        int n6 = f[12];
        n6 -= f[13];
        Intrinsics.checkNotNullParameter(searchPlaceholder, (String)C[n5 ^= f[11]] + (String)C[n6 ^= f[14]]);
        int n7 = f[15];
        n7 += f[16];
        Intrinsics.checkNotNullParameter(searchFieldIcon, (String)C[n7 ^= f[17]]);
        this.a = name;
        this.A = icon;
        this.b = desc;
        this.B = searchPlaceholder;
        this.c = searchFieldIcon;
    }

    public /* synthetic */ Category(String string, String string2, String string3, String string4, String string5, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        int n3 = f[18];
        n3 ^= f[19];
        if ((n2 & (n3 += f[20])) != 0) {
            int n4 = f[21];
            n4 ^= f[22];
            string4 = (String)C[n4 ^= f[23]];
        }
        int n5 = f[24];
        n5 += f[25];
        if ((n2 & (n5 += f[26])) != 0) {
            int n6 = f[27];
            n6 += f[28];
            string5 = (String)C[n6 -= f[29]];
        }
        this(string, string2, string3, string4, string5);
    }

    @NotNull
    public final String getName() {
        return this.a;
    }

    @NotNull
    public final String getIcon() {
        return this.A;
    }

    @NotNull
    public final String getDesc() {
        return this.b;
    }

    @NotNull
    public final String getSearchPlaceholder() {
        return this.B;
    }

    @NotNull
    public final String getSearchFieldIcon() {
        return this.c;
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.A;
    }

    @NotNull
    public final String component3() {
        return this.b;
    }

    @NotNull
    public final String component4() {
        return this.B;
    }

    @NotNull
    public final String component5() {
        return this.c;
    }

    @NotNull
    public final Category copy(@NotNull String name, @NotNull String icon, @NotNull String desc, @NotNull String searchPlaceholder, @NotNull String searchFieldIcon) {
        int n2 = f[30];
        n2 -= f[31];
        Intrinsics.checkNotNullParameter(name, (String)C[n2 += f[32]]);
        int n3 = f[33];
        n3 -= f[34];
        Intrinsics.checkNotNullParameter(icon, (String)C[n3 -= f[35]]);
        int n4 = f[36];
        n4 += f[37];
        Intrinsics.checkNotNullParameter(desc, (String)C[n4 ^= f[38]]);
        int n5 = f[39];
        n5 ^= f[40];
        int n6 = f[42];
        n6 += f[43];
        Intrinsics.checkNotNullParameter(searchPlaceholder, (String)C[n5 ^= f[41]] + (String)C[n6 += f[44]]);
        int n7 = f[45];
        n7 += f[46];
        Intrinsics.checkNotNullParameter(searchFieldIcon, (String)C[n7 -= f[47]]);
        return new Category(name, icon, desc, searchPlaceholder, searchFieldIcon);
    }

    public static /* synthetic */ Category copy$default(Category category, String string, String string2, String string3, String string4, String string5, int n2, Object object) {
        int n3 = f[48];
        n3 += f[49];
        if ((n2 & (n3 -= f[50])) != 0) {
            string = category.a;
        }
        int n4 = f[51];
        n4 += f[52];
        if ((n2 & (n4 -= f[53])) != 0) {
            string2 = category.A;
        }
        int n5 = f[54];
        n5 += f[55];
        if ((n2 & (n5 ^= f[56])) != 0) {
            string3 = category.b;
        }
        int n6 = f[57];
        n6 += f[58];
        if ((n2 & (n6 += f[59])) != 0) {
            string4 = category.B;
        }
        int n7 = f[60];
        n7 += f[61];
        if ((n2 & (n7 += f[62])) != 0) {
            string5 = category.c;
        }
        return category.copy(string, string2, string3, string4, string5);
    }

    @NotNull
    public String toString() {
        String string = this.c;
        String string2 = this.B;
        String string3 = this.b;
        String string4 = this.A;
        String string5 = this.a;
        int n2 = f[63];
        n2 += f[64];
        n2 += f[65];
        int n3 = f[66];
        n3 ^= f[67];
        n3 += f[68];
        int n4 = f[69];
        n4 += f[70];
        n4 -= f[71];
        int n5 = f[72];
        n5 ^= f[73];
        n5 -= f[74];
        int n6 = f[75];
        n6 -= f[76];
        n6 -= f[77];
        int n7 = f[78];
        n7 += f[79];
        int n8 = f[81];
        n8 += f[82];
        int n9 = f[84];
        n9 -= f[85];
        return (String)C[n2] + string5 + (String)C[n3] + string4 + (String)C[n4] + string3 + ((String)C[n5] + (String)C[n6]) + string2 + ((String)C[n7 ^= f[80]] + (String)C[n8 -= f[83]]) + string + (String)C[n9 += f[86]];
    }

    public int hashCode() {
        long l2 = -8321783361076695908L;
        long l3 = -3326771363988401357L;
        long l4 = 17808627488693414L;
        long l5 = 728451672723909050L;
        long l6 = 886936515586493928L;
        int n2 = f[87];
        n2 += f[88];
        long l7 = l6;
        int n3 = f[90];
        n3 ^= f[91];
        l6 = l7 ^ ((long)this.a.hashCode() << (n2 ^= f[89]) ^ l7) & -1L << (n3 -= f[92]);
        int n4 = f[93];
        n4 += f[94];
        n4 ^= f[95];
        int n5 = f[96];
        n5 += f[97];
        n5 ^= f[98];
        int n6 = f[99];
        n6 ^= f[100];
        long l8 = l6;
        int n7 = f[102];
        n7 -= f[103];
        l6 = l8 ^ ((long)((int)(l6 >>> n4) * n5 + this.A.hashCode()) << (n6 -= f[101]) ^ l8) & -1L << (n7 += f[104]);
        int n8 = f[105];
        n8 -= f[106];
        n8 -= f[107];
        int n9 = f[108];
        n9 ^= f[109];
        n9 -= f[110];
        int n10 = f[111];
        n10 += f[112];
        long l9 = l6;
        int n11 = f[114];
        n11 -= f[115];
        l6 = l9 ^ ((long)((int)(l6 >>> n8) * n9 + this.b.hashCode()) << (n10 ^= f[113]) ^ l9) & -1L << (n11 -= f[116]);
        int n12 = f[117];
        n12 ^= f[118];
        n12 += f[119];
        int n13 = f[120];
        n13 -= f[121];
        n13 += f[122];
        int n14 = f[123];
        n14 ^= f[124];
        long l10 = l6;
        int n15 = f[126];
        n15 ^= f[127];
        l6 = l10 ^ ((long)((int)(l6 >>> n12) * n13 + this.B.hashCode()) << (n14 ^= f[125]) ^ l10) & -1L << (n15 += f[128]);
        int n16 = f[129];
        n16 ^= f[130];
        n16 -= f[131];
        int n17 = f[132];
        n17 ^= f[133];
        n17 -= f[134];
        int n18 = f[135];
        n18 -= f[136];
        long l11 = l6;
        int n19 = f[138];
        n19 -= f[139];
        l6 = l11 ^ ((long)((int)(l6 >>> n16) * n17 + this.c.hashCode()) << (n18 -= f[137]) ^ l11) & -1L << (n19 += f[140]);
        int n20 = f[141];
        n20 ^= f[142];
        return (int)(l6 >>> (n20 ^= f[143]));
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            boolean bl = f[144];
            bl -= f[145];
            return bl -= f[146];
        }
        if (!(other instanceof Category)) {
            boolean bl = f[147];
            bl ^= f[148];
            return bl ^= f[149];
        }
        Category category = (Category)other;
        if (!Intrinsics.areEqual(this.a, category.a)) {
            boolean bl = f[150];
            bl += f[151];
            return bl += f[152];
        }
        if (!Intrinsics.areEqual(this.A, category.A)) {
            boolean bl = f[153];
            bl ^= f[154];
            return bl += f[155];
        }
        if (!Intrinsics.areEqual(this.b, category.b)) {
            boolean bl = f[156];
            bl += f[157];
            return bl += f[158];
        }
        if (!Intrinsics.areEqual(this.B, category.B)) {
            boolean bl = f[159];
            bl += f[160];
            return bl += f[161];
        }
        if (!Intrinsics.areEqual(this.c, category.c)) {
            boolean bl = f[162];
            bl -= f[163];
            return bl += f[164];
        }
        boolean bl = f[165];
        bl -= f[166];
        return bl -= f[167];
    }

    static {
        Category.b();
        long l2 = 2211369872005852517L;
        long l3 = 1485451360279620131L;
        long l4 = 4395353346069939527L;
        long l5 = 975286770983856623L;
        long l6 = 3694426189194204987L;
        long l7 = -4133175985994816784L;
        long l8 = -2520872534055967943L;
        long l9 = -1124929135587982008L;
        long l10 = 2534833552266739690L;
        long l11 = -156098725352752052L;
        long l12 = -6354282248269755267L;
        long l13 = 7824786778448815737L;
        long l14 = 7798346726315584443L;
        long l15 = 8349703746269599912L;
        int n2 = f[168];
        n2 += f[169];
        C = new Object[n2 -= f[170]];
        long l16 = l15;
        int n3 = f[171];
        n3 += f[172];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= f[173]);
        Object[] objectArray = new Object[f[174]];
        objectArray[Category.f[175]] = d;
        objectArray[Category.f[176]] = f[177];
        int n4 = f[178];
        Object object = Category.A()[f[179]];
        if (object == null) {
            char[] cArray = "\ub8ad\ub85e\ub8a9\ub873\ub8b4\ub887\ub8aa\ub874\ub8b3\ub870\ub872\ub8b3\ub894\ub8b3\ub8cb\ub88e\ub882\ub880\ub88c\ub8ae\ub886\ub88f\ub8a8\ub864\ub883\ub88e\ub894\ub88c\ub873\ub88b\ub899\ub865\ub892\ub892\ub867\ub8aa\ub8b3\ub866\ub8b4\ub8ab\ub889\ub8ac\ub883\ub883\ub88e\ub87a\ub8cb\ub8af\ub8b0\ub879\ub888\ub88e\ub882\ub89d\ub86e\ub8ac\ub8b4\ub873\ub8ab\ub866\ub866\ub867\ub88a\ub8b3\ub87d\ub886\ub85f\ub86f\ub8ae\ub88b\ub87d\ub8aa\ub887\ub887\ub8aa\ub8c9\ub8a9\ub8ac\ub890\ub860\ub864\ub8ad\ub85f\ub862\ub8b4\ub867\ub891\ub899\ub8ac\ub86f\ub85f\ub8b2\ub8b0\ub888\ub86f\ub88a\ub860\ub862\ub8cc\ub8af\ub865\ub8ca\ub8ab\ub85f\ub8b3\ub88e\ub8ad\ub867\ub888\ub8ab\ub861\ub889\ub899\ub885\ub87a\ub888\ub8cb\ub8b4\ub8cc\ub8b4\ub873\ub8b2\ub889\ub86e\ub865\ub885\ub8b4\ub88b\ub89d\ub8ac\ub879\ub870\ub8cc\ub8ad\ub893\ub872\ub8af\ub864\ub879\ub8cb\ub88f\ub866\ub86f\ub8cc\ub8ca\ub8b2\ub8cb\ub887\ub879\ub85f\ub88f\ub865\ub8a9\ub871\ub865\ub8a9\ub85e\ub8c9\ub8a8\ub865\ub89a\ub868\ub870\ub8a8\ub8b3\ub85e\ub890\ub888\ub873\ub88b\ub880\ub879\ub8cb\ub899\ub87a\ub891\ub88e\ub8c9\ub872\ub8b3\ub87f\ub8ad\ub874\ub886\ub8cc\ub8cb\ub893\ub86e\ub88d\ub89d\ub899\ub899\ub89a\ub8b0\ub8c9\ub8ad\ub8aa\ub865\ub882\ub889\ub872\ub891\ub879\ub871\ub8ac\ub88e\ub8a9\ub891\ub88d\ub8c9\ub88e\ub888\ub85f\ub8b0\ub8ab\ub88f\ub8ca\ub88c\ub879\ub8b3\ub85e\ub882\ub893\ub8cb\ub867\ub8cd\ub86f\ub899\ub8ac\ub8ca\ub888\ub8b0\ub86e\ub874\ub882\ub8c9\ub888\ub8b4\ub8c9\ub85e\ub861\ub8b2\ub8ae\ub88b\ub889\ub87e\ub87a\ub87a\ub864\ub865\ub8af\ub8ac\ub860\ub874\ub862\ub862\ub85f\ub885\ub8ae\ub85f\ub8b3\ub8ac\ub8a9\ub879\ub866\ub8ab\ub8b0\ub867\ub8b2\ub870\ub872\ub86e\ub873\ub8c9\ub868\ub8ab\ub891\ub8c9\ub899\ub8b2\ub8ac\ub88e\ub88f\ub879\ub8b4\ub863\ub8cb\ub881\ub8ca\ub85f\ub89a\ub8ac\ub866\ub88c\ub882\ub880\ub886\ub899\ub8cc\ub8cb\ub886\ub866\ub87a\ub888\ub8a8\ub873\ub8a8\ub863\ub8af\ub874\ub862\ub85e\ub888\ub8cd\ub8ae\ub88f\ub881\ub88f\ub894\ub899".toCharArray();
            for (int i2 = f[180]; i2 < f[181]; ++i2) {
                int n5 = cArray[i2];
                n5 += f[182];
                n5 -= f[183];
                n5 += f[184];
                n5 += f[185];
                n5 -= f[186];
                n5 ^= f[187];
                n5 ^= f[188];
                n5 += f[189];
                n5 ^= f[190];
                n5 ^= f[191];
                n5 ^= f[192];
                cArray[i2] = (char)(n5 += f[193]);
            }
            object = Category.A()[Category.f[194]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)Category.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = f[195];
        n6 += f[196];
        l6 = l17 ^ (0xCF00000000L ^ l17) & -1L << (n6 += f[197]);
        long l18 = l13;
        int n7 = f[198];
        n7 ^= f[199];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= f[200]);
        while (true) {
            int n8 = f[201];
            n8 -= f[202];
            if ((int)l13 >= (int)(l6 >>> (n8 -= f[203]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = f[204];
            n10 += f[205];
            int n11 = f[207];
            n11 -= f[208];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= f[206])) & -1L >>> (n11 += f[209]);
            long l20 = l9;
            int n12 = f[210];
            n12 ^= f[211];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= f[212]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = f[213];
            n14 -= f[214];
            int n15 = f[216];
            n15 += f[217];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= f[215])) & -1L >>> (n15 += f[218]);
            int n16 = f[219];
            n16 += f[220];
            long l22 = l10;
            int n17 = f[222];
            n17 += f[223];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += f[221]) ^ l22) & -1L << (n17 += f[224]);
            int n18 = f[225];
            n18 += f[226];
            n18 += f[227];
            int n19 = f[228];
            n19 += f[229];
            long l23 = l12;
            int n20 = f[231];
            n20 += f[232];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= f[230]))) ^ l23) & -1L >>> (n20 += f[233]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = f[234];
            n21 += f[235];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= f[236]);
            while (true) {
                int n22 = f[237];
                n22 ^= f[238];
                if ((int)(l14 >>> (n22 += f[239])) >= (int)l12) break;
                int n23 = f[240];
                n23 -= f[241];
                int n24 = f[243];
                n24 -= f[244];
                cArray2[(int)(l14 >>> (n23 ^= Category.f[242]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += f[245]))];
                l14 += 0x100000000L;
            }
            int n25 = f[246];
            n25 += f[247];
            int n26 = (int)(l15 >>> (n25 -= f[248]));
            l15 += 0x100000000L;
            Category.C[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = f[249];
            n27 -= f[250];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= f[251]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[f[252]];
        String string = (String)object[f[253]];
        object = object[f[254]];
        Object[] objectArray = e;
        if (e == null) {
            objectArray = e = new Object[f[255]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[f[256]];
                d = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[f[258] ^ f[259]];
                byArray[Category.f[260] ^ Category.f[261]] = f[262] ^ f[263];
                byArray[Category.f[264] ^ Category.f[265]] = f[266] ^ f[267];
                byArray[Category.f[268] ^ Category.f[269]] = f[270] ^ f[271];
                byArray[Category.f[272] ^ Category.f[273]] = f[274] ^ f[275];
                byArray[Category.f[276] ^ Category.f[277]] = f[278] ^ f[279];
                byArray[Category.f[280] ^ Category.f[281]] = f[282] ^ f[283];
                byArray[Category.f[284] ^ Category.f[285]] = f[286] ^ f[287];
                byArray[Category.f[288] ^ Category.f[289]] = f[290] ^ f[291];
                byArray[Category.f[292] ^ Category.f[293]] = f[294] ^ f[295];
                byArray[Category.f[296] ^ Category.f[297]] = f[298] ^ f[299];
                byArray[Category.f[300] ^ Category.f[301]] = f[302] ^ f[303];
                byArray[Category.f[304] ^ Category.f[305]] = f[306] ^ f[307];
                byArray[Category.f[308] ^ Category.f[309]] = f[310] ^ f[311];
                byArray[Category.f[312] ^ Category.f[313]] = f[314] ^ f[315];
                byArray[Category.f[316] ^ Category.f[317]] = f[318] ^ f[319];
                byArray[Category.f[320] ^ Category.f[321]] = f[322] ^ f[323];
                objectArray2[Category.f[257]] = byArray;
            }
            byte[] byArray = (byte[])object3[f[324]];
            if (D == null) {
                byte[] byArray2 = new byte[f[325] ^ f[326]];
                byArray2[Category.f[327] ^ Category.f[328]] = f[329] ^ f[330];
                byArray2[Category.f[331] ^ Category.f[332]] = f[333] ^ f[334];
                byArray2[Category.f[335] ^ Category.f[336]] = f[337] ^ f[338];
                byArray2[Category.f[339] ^ Category.f[340]] = f[341] ^ f[342];
                byArray2[Category.f[343] ^ Category.f[344]] = f[345] ^ f[346];
                byArray2[Category.f[347] ^ Category.f[348]] = f[349] ^ f[350];
                byArray2[Category.f[351] ^ Category.f[352]] = f[353] ^ f[354];
                byArray2[Category.f[355] ^ Category.f[356]] = f[357] ^ f[358];
                byArray2[Category.f[359] ^ Category.f[360]] = f[361] ^ f[362];
                byArray2[Category.f[363] ^ Category.f[364]] = f[365] ^ f[366];
                byArray2[Category.f[367] ^ Category.f[368]] = f[369] ^ f[370];
                byArray2[Category.f[371] ^ Category.f[372]] = f[373] ^ f[374];
                byArray2[Category.f[375] ^ Category.f[376]] = f[377] ^ f[378];
                byArray2[Category.f[379] ^ Category.f[380]] = f[381] ^ f[382];
                byArray2[Category.f[383] ^ Category.f[384]] = f[385] ^ f[386];
                byArray2[Category.f[387] ^ Category.f[388]] = f[389] ^ f[390];
                byArray2[Category.f[391] ^ Category.f[392]] = f[393] ^ f[394];
                byArray2[Category.f[395] ^ Category.f[396]] = f[397] ^ f[398];
                byArray2[Category.f[399] ^ 0x41FE] = 0x41CD ^ 0x41FE;
                byArray2[0x4B82 ^ 0x4B8B] = 0x4BB9 ^ 0x4B8B;
                byArray2[0x9F4C ^ 0x9F46] = 0x9F11 ^ 0x9F46;
                byArray2[0x10600 ^ 0x1060B] = 0xFFFEF983 ^ 0x1060B;
                byArray2[0xF8D0 ^ 0xF8C6] = 0xFFFF076E ^ 0xF8C6;
                byArray2[0xD9F5 ^ 0xD9EC] = 0xD992 ^ 0xD9EC;
                byArray2[0xBD51 ^ 0xBD41] = 0xFFFF4294 ^ 0xBD41;
                byArray2[0xD0B2 ^ 0xD0AE] = 0xD0F1 ^ 0xD0AE;
                byArray2[0xB156 ^ 0xB154] = 0xFFFF4EC5 ^ 0xB154;
                byArray2[0x1343 ^ 0x134D] = 0xFFFFECF1 ^ 0x134D;
                byArray2[0x10BC8 ^ 0x10BCE] = 0x10B8D ^ 0x10BCE;
                byArray2[0x490A ^ 0x4918] = 0xFFFFB6FE ^ 0x4918;
                byArray2[0x756B ^ 0x7563] = 0xFFFF8A9E ^ 0x7563;
                byArray2[0xA29C ^ 0xA28F] = 0xA2EF ^ 0xA28F;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = Category.A()[1];
                if (object4 == null) {
                    char[] cArray = "\ucf78\ucf42\ucf7b\ucf7c\ucf46\ucf52\ucf77\uce99\uce8c\ucf60\ucf40\uce9d\ucf61\ucf63\ucf73\ucf40\ucf41\ucf51".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 -= 36736;
                        n3 ^= 0xD2C0;
                        n3 ^= 0xD9A3;
                        n3 -= 27623;
                        n3 -= 15113;
                        n3 += 16689;
                        n3 -= 3795;
                        n3 -= 43828;
                        n3 += 4407;
                        n3 -= 6008;
                        n3 ^= 0x23FB;
                        n3 -= 52507;
                        cArray[i2] = (char)(n3 += 40956);
                    }
                    object4 = Category.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[13] = -38;
                byArray4[6] = -62;
                byArray4[4] = 127;
                byArray4[0] = -47;
                byArray4[8] = 6;
                byArray4[7] = -40;
                byArray4[15] = -5;
                byArray4[10] = 1;
                byArray4[11] = -48;
                byArray4[1] = 81;
                byArray4[12] = 40;
                byArray4[14] = -8;
                byArray4[5] = -18;
                byArray4[9] = -66;
                byArray4[3] = 65;
                byArray4[2] = -28;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 14, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = Category.A()[2];
                if (object5 == null) {
                    char[] cArray = "\uf046\uf04a\uf074".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 54306;
                        n4 += 23906;
                        n4 += 45988;
                        n4 ^= 0xEDE5;
                        n4 -= 12966;
                        n4 -= 22184;
                        n4 -= 62186;
                        n4 -= 59211;
                        n4 += 35883;
                        n4 -= 9932;
                        n4 -= 14062;
                        n4 -= 40860;
                        n4 += 39965;
                        cArray[i3] = (char)(n4 ^= 0x887F);
                    }
                    object5 = Category.A()[2] = new String(cArray);
                }
                D = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = Category.A()[3];
            if (object6 == null) {
                char[] cArray = "\uc229\uc22d\uc217\uc233\uc227\uc228\uc227\uc233\uc21a\uc22f\uc227\uc217\uc23d\uc21a\uc209\uc20e\uc20e\uc271\uc274\uc20b".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= 0x2230;
                    n5 += 64768;
                    n5 -= 45507;
                    n5 += 52244;
                    n5 += 48935;
                    n5 -= 39609;
                    n5 -= 35402;
                    n5 -= 30668;
                    n5 ^= 0x908D;
                    cArray[i4] = (char)(n5 ^= 0x890E);
                }
                object6 = Category.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)D), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = E;
        if (E == null) {
            E = new Object[4];
            objectArray = E;
        }
        return objectArray;
    }

    public static void b() {
        f = new int[0x4D2A ^ 0x4CBA];
        Category.f[0xE94D ^ 0xE860] = 0x1E56B ^ 0xE860;
        Category.f[0x2217 ^ 0x221C] = 0xFFFFDD8F ^ 0x221C;
        Category.f[0xF7A4 ^ 0xF723] = 0xFFFF08D6 ^ 0xF723;
        Category.f[0x62DC ^ 0x6256] = 0x621E ^ 0x6256;
        Category.f[0x6050 ^ 0x60BF] = 0x60FA ^ 0x60BF;
        Category.f[0x49C6 ^ 0x488F] = 0xFFFFD72C ^ 0x488F;
        Category.f[0x4880 ^ 0x4907] = 0xDA81 ^ 0x4907;
        Category.f[0xC2A1 ^ 0xC3EB] = 0xA3DA ^ 0xC3EB;
        Category.f[0xD867 ^ 0xD89E] = 0xFFFF275E ^ 0xD89E;
        Category.f[0x2CBF ^ 0x2D34] = 0x4CE3 ^ 0x2D34;
        Category.f[0xC169 ^ 0xC070] = 0x4C3E ^ 0xC070;
        Category.f[0x1EF1 ^ 0x1F98] = 0xFFFF4169 ^ 0x1F98;
        Category.f[0x8099 ^ 0x802A] = 0x802A ^ 0x802A;
        Category.f[0xC0A1 ^ 0xC04D] = 0xFFFF3FDC ^ 0xC04D;
        Category.f[0x28CA ^ 0x28BC] = 0xFFFFD714 ^ 0x28BC;
        Category.f[0x7B93 ^ 0x7B9E] = 0xFFFF8424 ^ 0x7B9E;
        Category.f[0x8F62 ^ 0x8E5E] = 0x3D7B ^ 0x8E5E;
        Category.f[0x4325 ^ 0x43B1] = 0xFFFFBC7A ^ 0x43B1;
        Category.f[0x5CEA ^ 0x5C88] = 0x5CA2 ^ 0x5C88;
        Category.f[0x42F4 ^ 0x42B5] = 0xFFFFBD16 ^ 0x42B5;
        Category.f[0xC859 ^ 0xC954] = 0x870B ^ 0xC954;
        Category.f[0x8AAE ^ 0x8AA4] = 0x8A92 ^ 0x8AA4;
        Category.f[0x7DBE ^ 0x7DD0] = 0xFFFF826B ^ 0x7DD0;
        Category.f[0xFEA6 ^ 0xFE9A] = 0xFFFF0174 ^ 0xFE9A;
        Category.f[0x187E ^ 0x183E] = 0x180E ^ 0x183E;
        Category.f[0x2ED3 ^ 0x2E53] = 0x2E48 ^ 0x2E53;
        Category.f[0x1EAF ^ 0x1FC8] = 0xBE9F ^ 0x1FC8;
        Category.f[0xF1BD ^ 0xF1FF] = 0xF1E9 ^ 0xF1FF;
        Category.f[0x6EB0 ^ 0x6FA8] = 0xE3E1 ^ 0x6FA8;
        Category.f[0x38BA ^ 0x39D4] = 0x4F35 ^ 0x39D4;
        Category.f[0xCBA8 ^ 0xCA29] = 0xA1D4 ^ 0xCA29;
        Category.f[0x957F ^ 0x9531] = 0x951E ^ 0x9531;
        Category.f[0x7DE5 ^ 0x7D51] = 0x7D51 ^ 0x7D51;
        Category.f[0xFFAB ^ 0xFFE8] = 0xFFA2 ^ 0xFFE8;
        Category.f[0x92A7 ^ 0x92C2] = 0xFFFF6D10 ^ 0x92C2;
        Category.f[0x40BE ^ 0x41F2] = 0x170A ^ 0x41F2;
        Category.f[0x65EF ^ 0x65E7] = 0x65FC ^ 0x65E7;
        Category.f[0x8A5E ^ 0x8AC5] = 0x8ACB ^ 0x8AC5;
        Category.f[0x2FDD ^ 0x2F85] = 0xFFFFD048 ^ 0x2F85;
        Category.f[0x101D9 ^ 0x100E6] = 0x1B3CA ^ 0x100E6;
        Category.f[0x592D ^ 0x5801] = 0x15507 ^ 0x5801;
        Category.f[0xD9CD ^ 0xD919] = 0xD927 ^ 0xD919;
        Category.f[0x7BFB ^ 0x7BFE] = 0xFFFF844F ^ 0x7BFE;
        Category.f[0xB5B7 ^ 0xB576] = 0x97A9 ^ 0xB576;
        Category.f[0xF9F1 ^ 0xF9AD] = 0xF9B1 ^ 0xF9AD;
        Category.f[0x84A1 ^ 0x84C9] = 0xFFFF7B0C ^ 0x84C9;
        Category.f[0xC65D ^ 0xC6D8] = 0xFFFF3910 ^ 0xC6D8;
        Category.f[0xEBF1 ^ 0xEAFD] = 0xA4AD ^ 0xEAFD;
        Category.f[0x365B ^ 0x36A0] = 0x369D ^ 0x36A0;
        Category.f[0xC8D7 ^ 0xC833] = 0xC827 ^ 0xC833;
        Category.f[0xB663 ^ 0xB64D] = 0xFFFF49C7 ^ 0xB64D;
        Category.f[0x870D ^ 0x8728] = 0x8736 ^ 0x8728;
        Category.f[0x6BB6 ^ 0x6BA9] = 0x6BBF ^ 0x6BA9;
        Category.f[0x25E4 ^ 0x250D] = 0x2562 ^ 0x250D;
        Category.f[0x222 ^ 0x269] = 0xFFFFFDDF ^ 0x269;
        Category.f[0x3503 ^ 0x3446] = 0x92CA ^ 0x3446;
        Category.f[0xD4F0 ^ 0xD427] = 0xFFFF2BD5 ^ 0xD427;
        Category.f[0xBE9B ^ 0xBE14] = 0xFFFF41A4 ^ 0xBE14;
        Category.f[0xA756 ^ 0xA652] = 0xE2A8 ^ 0xA652;
        Category.f[0x74D9 ^ 0x749E] = 0xFFFF8B04 ^ 0x749E;
        Category.f[0x67E5 ^ 0x6743] = 0xFFFF98DF ^ 0x6743;
        Category.f[0xABCF ^ 0xAA8B] = 0xAA8B ^ 0xAA8B;
        Category.f[0x7373 ^ 0x72FE] = 0xFFFFECA4 ^ 0x72FE;
        Category.f[0xC085 ^ 0xC055] = 0xC04C ^ 0xC055;
        Category.f[0x3CBE ^ 0x3C4C] = 0xFFFFC3D5 ^ 0x3C4C;
        Category.f[0x468E ^ 0x47FD] = 0xC1F ^ 0x47FD;
        Category.f[0x7260 ^ 0x729E] = 0x729E ^ 0x729E;
        Category.f[0x42CE ^ 0x438F] = 0xA055 ^ 0x438F;
        Category.f[0x8C7E ^ 0x8D56] = 0x426B ^ 0x8D56;
        Category.f[0x5605 ^ 0x574B] = 0x1B3 ^ 0x574B;
        Category.f[0x91CC ^ 0x91F7] = 0xFFFF6E0E ^ 0x91F7;
        Category.f[0xA3F9 ^ 0xA2C3] = 0xFFFF00D1 ^ 0xA2C3;
        Category.f[0x239E ^ 0x2324] = 0x1F30 ^ 0x2324;
        Category.f[0xC92 ^ 0xCB9] = 0xCB5 ^ 0xCB9;
        Category.f[0xCF0D ^ 0xCF17] = 0xFFFF3093 ^ 0xCF17;
        Category.f[0x6709 ^ 0x676D] = 0x676D ^ 0x676D;
        Category.f[0xC8BB ^ 0xC868] = 0xFFFF378F ^ 0xC868;
        Category.f[0x5C43 ^ 0x5C11] = 0xFFFFA3BF ^ 0x5C11;
        Category.f[0x11BB ^ 0x1089] = 0xF11C ^ 0x1089;
        Category.f[0x3888 ^ 0x39B6] = 0x8AE4 ^ 0x39B6;
        Category.f[0xDA62 ^ 0xDB79] = 0x5737 ^ 0xDB79;
        Category.f[0x8B1D ^ 0x8A4A] = 0x84EC ^ 0x8A4A;
        Category.f[0xB32C ^ 0xB273] = 0xB54C ^ 0xB273;
        Category.f[0x553E ^ 0x5539] = 0x5541 ^ 0x5539;
        Category.f[0xDEDE ^ 0xDFF1] = 0x1D2FA ^ 0xDFF1;
        Category.f[0x107DC ^ 0x106C8] = 0x1907D ^ 0x106C8;
        Category.f[0xF224 ^ 0xF2F8] = 0xFFFF0D36 ^ 0xF2F8;
        Category.f[0x7870 ^ 0x791C] = 0xFFD ^ 0x791C;
        Category.f[0x507B ^ 0x5148] = 0xB08A ^ 0x5148;
        Category.f[0xAB09 ^ 0xAB1F] = 0xFFFF54B7 ^ 0xAB1F;
        Category.f[0xDFF4 ^ 0xDE99] = 0xA85F ^ 0xDE99;
        Category.f[0x616B ^ 0x611E] = 0x6153 ^ 0x611E;
        Category.f[0x58A8 ^ 0x59AF] = 0x1D51 ^ 0x59AF;
        Category.f[0x1549 ^ 0x151A] = 0xFFFFEABE ^ 0x151A;
        Category.f[0xA2D3 ^ 0xA26C] = 0x7E86 ^ 0xA26C;
        Category.f[0x1026 ^ 0x1159] = 0x7AAB ^ 0x1159;
        Category.f[0x4F42 ^ 0x4FC3] = 0x4F46 ^ 0x4FC3;
        Category.f[0xD7D9 ^ 0xD7ED] = 0xD7EF ^ 0xD7ED;
        Category.f[0x93D5 ^ 0x9311] = 0xFFFF6CEA ^ 0x9311;
        Category.f[0x2A65 ^ 0x2A5B] = 0x2A02 ^ 0x2A5B;
        Category.f[0x834A ^ 0x822E] = 0xD1D3 ^ 0x822E;
        Category.f[0x4064 ^ 0x401A] = 0xFFFFBFD1 ^ 0x401A;
        Category.f[0x652B ^ 0x640F] = 0x392F ^ 0x640F;
        Category.f[0x2F4D ^ 0x2E15] = 0x20A2 ^ 0x2E15;
        Category.f[0xC26 ^ 0xC98] = 0xA08D ^ 0xC98;
        Category.f[0xB2B1 ^ 0xB2C0] = 0xB2D5 ^ 0xB2C0;
        Category.f[0x45AC ^ 0x4499] = 0xF1A1 ^ 0x4499;
        Category.f[0x91F8 ^ 0x9107] = 0x9106 ^ 0x9107;
        Category.f[0xB53F ^ 0xB5EA] = 0xB5A5 ^ 0xB5EA;
        Category.f[0x104BE ^ 0x104C1] = 0xFFFEFB0F ^ 0x104C1;
        Category.f[0xCD3D ^ 0xCC3C] = 0xCC3C ^ 0xCC3C;
        Category.f[0x22C6 ^ 0x23C0] = 0xFFFF9884 ^ 0x23C0;
        Category.f[0xDEA6 ^ 0xDE33] = 0xFFFF2190 ^ 0xDE33;
        Category.f[0x728E ^ 0x7208] = 0x7250 ^ 0x7208;
        Category.f[0x4DA0 ^ 0x4D3A] = 0xFFFFB2B3 ^ 0x4D3A;
        Category.f[0xEF3D ^ 0xEE4A] = 0x3D ^ 0xEE4A;
        Category.f[0x76B0 ^ 0x762F] = 0x7661 ^ 0x762F;
        Category.f[0x905C ^ 0x912D] = 0xB1AB ^ 0x912D;
        Category.f[0x6840 ^ 0x6915] = 0xFFFFDA69 ^ 0x6915;
        Category.f[0xAC00 ^ 0xAD5C] = 0x1AFFF ^ 0xAD5C;
        Category.f[0xFE80 ^ 0xFFC2] = 0xFFFFE3A1 ^ 0xFFC2;
        Category.f[0x261A ^ 0x2655] = 0xFFFFD98B ^ 0x2655;
        Category.f[0xAAB9 ^ 0xAAAC] = 0xAAE0 ^ 0xAAAC;
        Category.f[0x30A9 ^ 0x318F] = 0x6CC6 ^ 0x318F;
        Category.f[0x9CB3 ^ 0x9C0F] = 0x206B ^ 0x9C0F;
        Category.f[0x1D05 ^ 0x1D8C] = 0x1D80 ^ 0x1D8C;
        Category.f[0xDB35 ^ 0xDBEE] = 0xDB85 ^ 0xDBEE;
        Category.f[0x8027 ^ 0x8109] = 0xFFFE73B9 ^ 0x8109;
        Category.f[0x2AB8 ^ 0x2B89] = 0xCA4B ^ 0x2B89;
        Category.f[0x9C4E ^ 0x9C63] = 0x9C59 ^ 0x9C63;
        Category.f[0xE1F6 ^ 0xE099] = 0xC071 ^ 0xE099;
        Category.f[0x87CF ^ 0x87CE] = 0x87F7 ^ 0x87CE;
        Category.f[0xBAA7 ^ 0xBAFC] = 0xBADD ^ 0xBAFC;
        Category.f[0x5624 ^ 0x56E2] = 0x56C5 ^ 0x56E2;
        Category.f[0x4D6A ^ 0x4D45] = 0xFFFFB2F0 ^ 0x4D45;
        Category.f[0x6C54 ^ 0x6C0E] = 0x6C13 ^ 0x6C0E;
        Category.f[0x4FDC ^ 0x4FE6] = 0x4FC4 ^ 0x4FE6;
        Category.f[0x86BE ^ 0x878E] = 0x6642 ^ 0x878E;
        Category.f[0x52B2 ^ 0x5280] = 0xFFFFAD02 ^ 0x5280;
        Category.f[0x8668 ^ 0x86B5] = 0xFFFF7952 ^ 0x86B5;
        Category.f[0xBB29 ^ 0xBB19] = 0xFFFF449E ^ 0xBB19;
        Category.f[0x31AF ^ 0x30D1] = 0xB137 ^ 0x30D1;
        Category.f[0xB1AD ^ 0xB1BC] = 0xFFFF4E45 ^ 0xB1BC;
        Category.f[0x88F9 ^ 0x89EC] = 0x1F52 ^ 0x89EC;
        Category.f[0x43C8 ^ 0x436D] = 0x437B ^ 0x436D;
        Category.f[0x8D3E ^ 0x8D3D] = 0x8DF8 ^ 0x8D3D;
        Category.f[0xDEC ^ 0xD0C] = 0xFFFFF2AF ^ 0xD0C;
        Category.f[0x69EB ^ 0x69BD] = 0xFFFF9628 ^ 0x69BD;
        Category.f[0x999C ^ 0x9960] = 0x9961 ^ 0x9960;
        Category.f[0xCC5 ^ 0xC64] = 0xC4A ^ 0xC64;
        Category.f[0x2266 ^ 0x233B] = 0x121F7 ^ 0x233B;
        Category.f[0x9A15 ^ 0x9A08] = 0xFFFF65DE ^ 0x9A08;
        Category.f[0x4DD1 ^ 0x4CC7] = 0xDA10 ^ 0x4CC7;
        Category.f[0xA505 ^ 0xA5DB] = 0xA572 ^ 0xA5DB;
        Category.f[0xBC2F ^ 0xBC07] = 0xFFFF43CF ^ 0xBC07;
        Category.f[0xA9F3 ^ 0xA94B] = 0xE1D9 ^ 0xA94B;
        Category.f[0xA0B9 ^ 0xA180] = 0xFC3C ^ 0xA180;
        Category.f[0xCDD3 ^ 0xCDBA] = 0xFFFF32D3 ^ 0xCDBA;
        Category.f[0x3F3 ^ 0x316] = 0x37D ^ 0x316;
        Category.f[0x56F6 ^ 0x56E1] = 0xFFFFA904 ^ 0x56E1;
        Category.f[0xB4EB ^ 0xB4BF] = 0xB42B ^ 0xB4BF;
        Category.f[0x113D ^ 0x10B7] = 0x8332 ^ 0x10B7;
        Category.f[0x967C ^ 0x9727] = 0x19583 ^ 0x9727;
        Category.f[0x4171 ^ 0x412F] = 0x4138 ^ 0x412F;
        Category.f[0xE2D5 ^ 0xE3C7] = 0xFFFF1631 ^ 0xE3C7;
        Category.f[0xEEE6 ^ 0xEFEE] = 0xBAB ^ 0xEFEE;
        Category.f[0xCDE2 ^ 0xCD48] = 0xFFFF32E1 ^ 0xCD48;
        Category.f[0xA575 ^ 0xA528] = 0xA56E ^ 0xA528;
        Category.f[0xFB7A ^ 0xFA69] = 0xF05E ^ 0xFA69;
        Category.f[0x4A7B ^ 0x4B36] = 0xFFFFE20A ^ 0x4B36;
        Category.f[0x85D1 ^ 0x8507] = 0x855B ^ 0x8507;
        Category.f[0xA042 ^ 0xA11C] = 0x1A3BF ^ 0xA11C;
        Category.f[0xF9F9 ^ 0xF8A3] = 0xF614 ^ 0xF8A3;
        Category.f[0x8D1E ^ 0x8C7D] = 0xDF80 ^ 0x8C7D;
        Category.f[0x65EB ^ 0x65D6] = 0xFFFF9A1F ^ 0x65D6;
        Category.f[0xBFFA ^ 0xBF30] = 0xFFFF40EE ^ 0xBF30;
        Category.f[0xB156 ^ 0xB1F9] = 0xB1F9 ^ 0xB1F9;
        Category.f[0x726E ^ 0x7371] = 0xECCD ^ 0x7371;
        Category.f[0x5DE3 ^ 0x5D9B] = 0xFFFFA216 ^ 0x5D9B;
        Category.f[0xAC33 ^ 0xAD51] = 0xAA71 ^ 0xAD51;
        Category.f[0x7D72 ^ 0x7DBD] = 0x7D2A ^ 0x7DBD;
        Category.f[0x8235 ^ 0x8246] = 0xFFFF7DCE ^ 0x8246;
        Category.f[0xDF9C ^ 0xDEF6] = 0x7FB5 ^ 0xDEF6;
        Category.f[0x5DDC ^ 0x5CB7] = 0x2A41 ^ 0x5CB7;
        Category.f[0xD830 ^ 0xD822] = 0xFFFF27F6 ^ 0xD822;
        Category.f[0xC456 ^ 0xC4D4] = 0xC4CD ^ 0xC4D4;
        Category.f[0x2F3D ^ 0x2E00] = 0x9D2C ^ 0x2E00;
        Category.f[0xB36C ^ 0xB363] = 0xFFFF4CD9 ^ 0xB363;
        Category.f[0x6F96 ^ 0x6E16] = 0x5E0 ^ 0x6E16;
        Category.f[0xD9D ^ 0xDFC] = 0xFFFFF25A ^ 0xDFC;
        Category.f[0x731C ^ 0x722A] = 0xFFFF38CD ^ 0x722A;
        Category.f[0xD543 ^ 0xD5B3] = 0xFFFF2A37 ^ 0xD5B3;
        Category.f[0x7172 ^ 0x7191] = 0xFFFF8E20 ^ 0x7191;
        Category.f[0xAAEA ^ 0xAAEE] = 0xAA9C ^ 0xAAEE;
        Category.f[0x3642 ^ 0x3760] = 0xF4C5 ^ 0x3760;
        Category.f[0xA50C ^ 0xA595] = 0xA5EE ^ 0xA595;
        Category.f[0xDF92 ^ 0xDF7C] = 0xFFFF20E0 ^ 0xDF7C;
        Category.f[0x4B19 ^ 0x4A64] = 0xCBD3 ^ 0x4A64;
        Category.f[0x4BE2 ^ 0x4B4B] = 0xFFFFB496 ^ 0x4B4B;
        Category.f[0x3027 ^ 0x3039] = 0x3002 ^ 0x3039;
        Category.f[0x284D ^ 0x288D] = 0x8C61 ^ 0x288D;
        Category.f[0x7820 ^ 0x78B3] = 0x78DB ^ 0x78B3;
        Category.f[0xDC0A ^ 0xDC7A] = 0xDC7F ^ 0xDC7A;
        Category.f[0x57A6 ^ 0x56DD] = 0xD726 ^ 0x56DD;
        Category.f[0xEEDA ^ 0xEEC6] = 0xEEC1 ^ 0xEEC6;
        Category.f[0x4BD ^ 0x5AA] = 0x9314 ^ 0x5AA;
        Category.f[0xE9B4 ^ 0xE993] = 0xFFFF1676 ^ 0xE993;
        Category.f[0x71A3 ^ 0x71C0] = 0xFFFF8E32 ^ 0x71C0;
        Category.f[0x9644 ^ 0x9725] = 0xFFFF6FB4 ^ 0x9725;
        Category.f[0x72B8 ^ 0x7209] = 0x7209 ^ 0x7209;
        Category.f[0xC4C1 ^ 0xC586] = 0xA5AD ^ 0xC586;
        Category.f[0x7414 ^ 0x74EC] = 0xFFFF8B2B ^ 0x74EC;
        Category.f[0x2084 ^ 0x2047] = 0x200B ^ 0x2047;
        Category.f[0xB14A ^ 0xB045] = 0xFE1A ^ 0xB045;
        Category.f[0x2EC ^ 0x396] = 0xEDE0 ^ 0x396;
        Category.f[0x6BD6 ^ 0x6ACC] = 0xFFFF1939 ^ 0x6ACC;
        Category.f[0x8CB4 ^ 0x8C43] = 0x8C6B ^ 0x8C43;
        Category.f[0x392 ^ 0x33C] = 0x33F ^ 0x33C;
        Category.f[0xCEED ^ 0xCEFE] = 0xFFFF3149 ^ 0xCEFE;
        Category.f[0xEFAD ^ 0xEECD] = 0xE9ED ^ 0xEECD;
        Category.f[0xE583 ^ 0xE551] = 0xFFFF1AA8 ^ 0xE551;
        Category.f[0xE224 ^ 0xE326] = 0xDD3A ^ 0xE326;
        Category.f[0x73FD ^ 0x72B6] = 0x2442 ^ 0x72B6;
        Category.f[0xB73 ^ 0xBA9] = 0xBFB ^ 0xBA9;
        Category.f[0xDCF4 ^ 0xDC50] = 0xDC0F ^ 0xDC50;
        Category.f[0x8B6D ^ 0x8B17] = 0x8B2E ^ 0x8B17;
        Category.f[0x93CF ^ 0x93A0] = 0x9390 ^ 0x93A0;
        Category.f[0x4F66 ^ 0x4F2E] = 0xFFFFB0AC ^ 0x4F2E;
        Category.f[0x79CA ^ 0x784F] = 0xFFFF7520 ^ 0x784F;
        Category.f[0x103C7 ^ 0x1030E] = 0x10358 ^ 0x1030E;
        Category.f[0xC494 ^ 0xC410] = 0xFFFF3BAF ^ 0xC410;
        Category.f[0xBF90 ^ 0xBEF5] = 0xED58 ^ 0xBEF5;
        Category.f[0x82F4 ^ 0x82AB] = 0x82D6 ^ 0x82AB;
        Category.f[0x10E5D ^ 0x10E0A] = 0x10E85 ^ 0x10E0A;
        Category.f[0xC63C ^ 0xC609] = 0xFFFF39AA ^ 0xC609;
        Category.f[0x108B7 ^ 0x109EE] = 0xFFFEF8BF ^ 0x109EE;
        Category.f[0x876A ^ 0x877E] = 0xFFFF78DB ^ 0x877E;
        Category.f[0x1BA4 ^ 0x1BCE] = 0xFFFFE471 ^ 0x1BCE;
        Category.f[0x10A33 ^ 0x10A53] = 0x10ADC ^ 0x10A53;
        Category.f[0x8CED ^ 0x8C54] = 0xE300 ^ 0x8C54;
        Category.f[0x36C7 ^ 0x363D] = 0xFFFFC99E ^ 0x363D;
        Category.f[0x8587 ^ 0x84C7] = 0x6711 ^ 0x84C7;
        Category.f[0xA243 ^ 0xA333] = 0x83C3 ^ 0xA333;
        Category.f[0xD8AD ^ 0xD9BD] = 0xD38A ^ 0xD9BD;
        Category.f[0x2839 ^ 0x28A7] = 0x28CB ^ 0x28A7;
        Category.f[0xAD5E ^ 0xAD61] = 0xAD56 ^ 0xAD61;
        Category.f[0x25DF ^ 0x25A6] = 0xFFFFDA01 ^ 0x25A6;
        Category.f[0xD295 ^ 0xD2D8] = 0xD2DF ^ 0xD2D8;
        Category.f[0x9BB2 ^ 0x9ABB] = 0x7EFC ^ 0x9ABB;
        Category.f[0x4480 ^ 0x442D] = 0xFFFFBBEE ^ 0x442D;
        Category.f[0xD8EB ^ 0xD8A2] = 0xFFFF277C ^ 0xD8A2;
        Category.f[0x98FA ^ 0x9982] = 0x77F4 ^ 0x9982;
        Category.f[0xF80F ^ 0xF90C] = 0xC700 ^ 0xF90C;
        Category.f[0x6FB2 ^ 0x6FDF] = 0x6FDB ^ 0x6FDF;
        Category.f[0x4357 ^ 0x4377] = 0xFFFFBC93 ^ 0x4377;
        Category.f[0x78A3 ^ 0x7885] = 0xFFFF8735 ^ 0x7885;
        Category.f[0xD949 ^ 0xD9E5] = 0xD9DC ^ 0xD9E5;
        Category.f[0x1D37 ^ 0x1DD6] = 0x1DA1 ^ 0x1DD6;
        Category.f[0x5B4B ^ 0x5B68] = 0xFFFFA4F8 ^ 0x5B68;
        Category.f[0x4AF ^ 0x52B] = 0xF7C0 ^ 0x52B;
        Category.f[0xB60A ^ 0xB72A] = 0x74A2 ^ 0xB72A;
        Category.f[0x4B02 ^ 0x4BC9] = 0x4B91 ^ 0x4BC9;
        Category.f[0xCDB6 ^ 0xCDF3] = 0xFFFF326B ^ 0xCDF3;
        Category.f[0x719B ^ 0x70FD] = 0x2300 ^ 0x70FD;
        Category.f[0x3228 ^ 0x32B9] = 0x32F8 ^ 0x32B9;
        Category.f[0x2FCC ^ 0x2F0B] = 0x2F6A ^ 0x2F0B;
        Category.f[0x74CA ^ 0x74EB] = 0xFFFF8B3F ^ 0x74EB;
        Category.f[0x4F14 ^ 0x4F27] = 0xFFFFB084 ^ 0x4F27;
        Category.f[0xD494 ^ 0xD445] = 0xFFFF2BE7 ^ 0xD445;
        Category.f[0x107AA ^ 0x106B7] = 0x1990B ^ 0x106B7;
        Category.f[0xDCB5 ^ 0xDC00] = 0xDD40 ^ 0xDC00;
        Category.f[0xD5D6 ^ 0xD509] = 0xFFFF2ADD ^ 0xD509;
        Category.f[0xEC33 ^ 0xEC98] = 0xFFFF1332 ^ 0xEC98;
        Category.f[0x2FDC ^ 0x2FF6] = 0xFFFFD040 ^ 0x2FF6;
        Category.f[0x9A8A ^ 0x9BC9] = 0x7813 ^ 0x9BC9;
        Category.f[0x9F3C ^ 0x9F4E] = 0xFFFF6033 ^ 0x9F4E;
        Category.f[0xA4FC ^ 0xA5E0] = 0x3A54 ^ 0xA5E0;
        Category.f[0x2410 ^ 0x24DE] = 0x24DC ^ 0x24DE;
        Category.f[0x831A ^ 0x8272] = 0x2331 ^ 0x8272;
        Category.f[0x5437 ^ 0x5542] = 0xFFFFE12A ^ 0x5542;
        Category.f[0x900A ^ 0x90BA] = 0x90BB ^ 0x90BA;
        Category.f[0x365E ^ 0x36AA] = 0x368A ^ 0x36AA;
        Category.f[0xAD09 ^ 0xADAE] = 0xADD7 ^ 0xADAE;
        Category.f[0x1761 ^ 0x1725] = 0xFFFFE891 ^ 0x1725;
        Category.f[0x6331 ^ 0x63FD] = 0x63C8 ^ 0x63FD;
        Category.f[0xA494 ^ 0xA4C4] = 0xA4CE ^ 0xA4C4;
        Category.f[0x32BF ^ 0x32B6] = 0xFFFFCD18 ^ 0x32B6;
        Category.f[0x89F7 ^ 0x88D0] = 0xD5F6 ^ 0x88D0;
        Category.f[0xFEDD ^ 0xFF53] = 0x9E8B ^ 0xFF53;
        Category.f[0x1E0D ^ 0x1E47] = 0x1E08 ^ 0x1E47;
        Category.f[0xD160 ^ 0xD1B8] = 0xFFFF2E35 ^ 0xD1B8;
        Category.f[0x108AA ^ 0x1081C] = 0x15E9D ^ 0x1081C;
        Category.f[0xE0E6 ^ 0xE07B] = 0xFFFF1F91 ^ 0xE07B;
        Category.f[0x87EB ^ 0x8697] = 0x771 ^ 0x8697;
        Category.f[0xA12A ^ 0xA151] = 0xFFFF5E94 ^ 0xA151;
        Category.f[0x7F36 ^ 0x7F26] = 0x7F66 ^ 0x7F26;
        Category.f[0xC39A ^ 0xC317] = 0xC360 ^ 0xC317;
        Category.f[0xD307 ^ 0xD336] = 0xFFFF2CCA ^ 0xD336;
        Category.f[0x891C ^ 0x8868] = 0xC39F ^ 0x8868;
        Category.f[0x6816 ^ 0x687A] = 0xFFFF97A4 ^ 0x687A;
        Category.f[0x1C3B ^ 0x1D12] = 0xD225 ^ 0x1D12;
        Category.f[0xF1E4 ^ 0xF09D] = 0xFFFFE16C ^ 0xF09D;
        Category.f[0x418 ^ 0x54E] = 0x4996 ^ 0x54E;
        Category.f[0x10CD0 ^ 0x10CA7] = 0x10C9C ^ 0x10CA7;
        Category.f[0x10A3C ^ 0x10A69] = 0x10A48 ^ 0x10A69;
        Category.f[0xD86 ^ 0xCA5] = 0xCF28 ^ 0xCA5;
        Category.f[0xE55C ^ 0xE5C0] = 0xFFFF1A6A ^ 0xE5C0;
        Category.f[0x8A29 ^ 0x8BAF] = 0x7944 ^ 0x8BAF;
        Category.f[0xB5C6 ^ 0xB44A] = 0xD592 ^ 0xB44A;
        Category.f[0x249A ^ 0x246F] = 0xFFFFDB94 ^ 0x246F;
        Category.f[0x1052 ^ 0x10AF] = 0x10AD ^ 0x10AF;
        Category.f[0x3C39 ^ 0x3CC8] = 0xFFFFC303 ^ 0x3CC8;
        Category.f[0x4045 ^ 0x4072] = 0x401E ^ 0x4072;
        Category.f[0xC16B ^ 0xC1F3] = 0xC1C9 ^ 0xC1F3;
        Category.f[0x8DAA ^ 0x8D08] = 0xFFFF72E6 ^ 0x8D08;
        Category.f[0x35D7 ^ 0x3491] = 0x923D ^ 0x3491;
        Category.f[0x5E2E ^ 0x5E86] = 0xFFFFA164 ^ 0x5E86;
        Category.f[0xA886 ^ 0xA860] = 0xA83F ^ 0xA860;
        Category.f[0xE7EB ^ 0xE74B] = 0xFFFF18CF ^ 0xE74B;
        Category.f[0xC48 ^ 0xC6A] = 0xC52 ^ 0xC6A;
        Category.f[0x751C ^ 0x7504] = 0x7595 ^ 0x7504;
        Category.f[0x8A5F ^ 0x8AED] = 0x8AEF ^ 0x8AED;
        Category.f[0xFC7D ^ 0xFDFF] = 0x9609 ^ 0xFDFF;
        Category.f[0x65B8 ^ 0x6594] = 0x65DB ^ 0x6594;
        Category.f[0x76C2 ^ 0x7792] = 0x8103 ^ 0x7792;
        Category.f[0x966F ^ 0x96B6] = 0x96F7 ^ 0x96B6;
        Category.f[0x1F3D ^ 0x1F41] = 0x1F30 ^ 0x1F41;
        Category.f[0xEBE5 ^ 0xEA97] = 0xCA67 ^ 0xEA97;
        Category.f[0x9E2E ^ 0x9E18] = 0xFFFF61A6 ^ 0x9E18;
        Category.f[0xD4C2 ^ 0xD40F] = 0xFFFF2BC1 ^ 0xD40F;
        Category.f[0x9247 ^ 0x927E] = 0xFFFF6D93 ^ 0x927E;
        Category.f[0x973F ^ 0x9649] = 0xDDBE ^ 0x9649;
        Category.f[0xB3BD ^ 0xB297] = 0x7DC4 ^ 0xB297;
        Category.f[0xABEC ^ 0xAAD8] = 0x1FE3 ^ 0xAAD8;
        Category.f[0x10662 ^ 0x10662] = 0xFFFEF98A ^ 0x10662;
        Category.f[0x8AD1 ^ 0x8A97] = 0x8A82 ^ 0x8A97;
        Category.f[0x64D ^ 0x746] = 0xE301 ^ 0x746;
        Category.f[0x10C87 ^ 0x10DD6] = 0x1FB14 ^ 0x10DD6;
        Category.f[0xCD94 ^ 0xCC9E] = 0xFFFFD72D ^ 0xCC9E;
        Category.f[0x814C ^ 0x81A6] = 0xFFFF7E4C ^ 0x81A6;
        Category.f[0x30FD ^ 0x3075] = 0xFFFFCFBC ^ 0x3075;
        Category.f[0x1032B ^ 0x103A0] = 0xFFFEFC7A ^ 0x103A0;
        Category.f[0x85D3 ^ 0x856E] = 0x5DCB ^ 0x856E;
        Category.f[0x124 ^ 0xAC] = 0x9329 ^ 0xAC;
        Category.f[0xBAF7 ^ 0xBA1A] = 0xBA5D ^ 0xBA1A;
        Category.f[0x3583 ^ 0x3515] = 0xFFFFCAEB ^ 0x3515;
        Category.f[0xACB7 ^ 0xAC8F] = 0xACA1 ^ 0xAC8F;
        Category.f[0xD09B ^ 0xD19E] = 0x9560 ^ 0xD19E;
        Category.f[0x4752 ^ 0x47DE] = 0xFFFFB86C ^ 0x47DE;
        Category.f[0xD13C ^ 0xD13A] = 0xFFFF2EA9 ^ 0xD13A;
        Category.f[0x5B35 ^ 0x5BC6] = 0x5B83 ^ 0x5BC6;
        Category.f[0x6063 ^ 0x6005] = 0x608E ^ 0x6005;
        Category.f[0xF2C1 ^ 0xF2A6] = 0xF296 ^ 0xF2A6;
        Category.f[0x10AB4 ^ 0x10BFB] = 0x1FD74 ^ 0x10BFB;
        Category.f[0x8434 ^ 0x8525] = 0x8F12 ^ 0x8525;
        Category.f[0x91CF ^ 0x9127] = 0x9119 ^ 0x9127;
        Category.f[0x821C ^ 0x833D] = 0x40B0 ^ 0x833D;
        Category.f[0xDE25 ^ 0xDE4E] = 0xFFFF21C4 ^ 0xDE4E;
        Category.f[0x927D ^ 0x92ED] = 0x9257 ^ 0x92ED;
        Category.f[0x1B15 ^ 0x1BE3] = 0xFFFFE45C ^ 0x1BE3;
        Category.f[0xA2B8 ^ 0xA380] = 0xFE3D ^ 0xA380;
        Category.f[0xE39D ^ 0xE2B6] = 0x2D81 ^ 0xE2B6;
        Category.f[0x5640 ^ 0x5634] = 0xFFFFA9E1 ^ 0x5634;
        Category.f[0x2794 ^ 0x2776] = 0xFFFFD89E ^ 0x2776;
        Category.f[0x715B ^ 0x705B] = 0x705A ^ 0x705B;
        Category.f[0x2967 ^ 0x28EE] = 0xFFFF44D5 ^ 0x28EE;
        Category.f[0x102E2 ^ 0x10261] = 0x1021D ^ 0x10261;
        Category.f[0x554 ^ 0x558] = 0xFFFFFAAF ^ 0x558;
        Category.f[0xEA24 ^ 0xEA7D] = 0xEA01 ^ 0xEA7D;
        Category.f[0x6257 ^ 0x631F] = 0x32E ^ 0x631F;
        Category.f[0xF9D ^ 0xFCC] = 0xFC8 ^ 0xFCC;
        Category.f[0x3073 ^ 0x31FC] = 0x7007 ^ 0x31FC;
        Category.f[0x2B15 ^ 0x2B82] = 0xFFFFD44A ^ 0x2B82;
        Category.f[0xA65 ^ 0xA8E] = 0xFFFFF549 ^ 0xA8E;
        Category.f[0x69C2 ^ 0x694C] = 0xFFFF96AB ^ 0x694C;
        Category.f[0x2E0E ^ 0x2E9C] = 0x2EE4 ^ 0x2E9C;
        Category.f[0x7FA6 ^ 0x7EF5] = 0x3220 ^ 0x7EF5;
        Category.f[0x546F ^ 0x54D4] = 0xEEC0 ^ 0x54D4;
        Category.f[0xFD3E ^ 0xFC09] = 0x4931 ^ 0xFC09;
        Category.f[0x683 ^ 0x64B] = 0x66D ^ 0x64B;
        Category.f[0xDCD2 ^ 0xDC17] = 0xFFFF23CE ^ 0xDC17;
        Category.f[0xE539 ^ 0xE41C] = 0xB93A ^ 0xE41C;
        Category.f[0x4808 ^ 0x48CA] = 0x48CA ^ 0x48CA;
        Category.f[0x3F31 ^ 0x3FD6] = 0xFFFFC0A5 ^ 0x3FD6;
        Category.f[0x9A93 ^ 0x9AEE] = 0xFFFF657A ^ 0x9AEE;
        Category.f[0x731F ^ 0x7336] = 0x730F ^ 0x7336;
        Category.f[0x504D ^ 0x50EE] = 0x50A3 ^ 0x50EE;
        Category.f[0x5BAD ^ 0x5AF9] = 0x1621 ^ 0x5AF9;
        Category.f[0xF221 ^ 0xF3A2] = 0x152 ^ 0xF3A2;
        Category.f[0xA3B4 ^ 0xA2AA] = 0x3D40 ^ 0xA2AA;
        Category.f[0x73D3 ^ 0x73D1] = 0x73CE ^ 0x73D1;
        Category.f[0x3819 ^ 0x3817] = 0x3838 ^ 0x3817;
        Category.f[0x4471 ^ 0x4523] = 0xB3B2 ^ 0x4523;
        Category.f[0xAB75 ^ 0xAB51] = 0xFFFF54C6 ^ 0xAB51;
        Category.f[0x4273 ^ 0x426A] = 0xFFFFBD91 ^ 0x426A;
        Category.f[0x8CD6 ^ 0x8CCD] = 0xFFFF7302 ^ 0x8CCD;
        Category.f[0xE0CD ^ 0xE1C3] = 0xFFFF504B ^ 0xE1C3;
        Category.f[0x42F ^ 0x514] = 0x58A8 ^ 0x514;
        Category.f[0xF77B ^ 0xF7CC] = 0xA3FD ^ 0xF7CC;
        Category.f[0x1808 ^ 0x1844] = 0xFFFFE7DE ^ 0x1844;
    }
}

