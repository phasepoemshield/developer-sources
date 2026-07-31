/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.font;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.A;
import kotakbaz.rain.client.render.texture.texture.b_0;
import kotakbaz.rain.client.util.render.font.B;
import kotakbaz.rain.client.util.render.font.E;
import kotakbaz.rain.client.util.render.font.a;
import kotakbaz.rain.client.util.render.font.a_0;
import kotakbaz.rain.client.util.render.font.c;
import kotakbaz.rain.client.util.render.font.c_0;
import kotakbaz.rain.client.util.render.font.d;
import kotakbaz.rain.client.util.render.font.d_0;
import kotakbaz.rain.client.util.render.font.e_0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\u0016*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\u00020\u001a*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002\u00a2\u0006\u0004\b#\u0010$R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0012\u0010%R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b'\u0010%\u00a8\u0006("}, d2={"Lkotakbaz/rain/client/util/render/font/FontBuilder;", "", "<init>", "()V", "", "fontName", "find", "(Ljava/lang/String;)Lkotakbaz/rain/client/util/render/font/FontBuilder;", "Lkotakbaz/rain/client/util/render/font/Font;", "build", "()Lkotakbaz/rain/client/util/render/font/Font;", "Lkotakbaz/rain/client/util/render/font/FontData;", "loadFontData", "()Lkotakbaz/rain/client/util/render/font/FontData;", "Lcom/google/gson/JsonObject;", "root", "parseFontData", "(Lcom/google/gson/JsonObject;)Lkotakbaz/rain/client/util/render/font/FontData;", "name", "Lkotakbaz/rain/client/util/render/font/FontData$BoundsData;", "bounds", "(Lcom/google/gson/JsonObject;Ljava/lang/String;)Lkotakbaz/rain/client/util/render/font/FontData$BoundsData;", "", "default", "float", "(Lcom/google/gson/JsonObject;Ljava/lang/String;F)F", "", "int", "(Lcom/google/gson/JsonObject;Ljava/lang/String;I)I", "string", "(Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "unicode", "glyphKey", "(I)Ljava/lang/String;", "Lkotakbaz/rain/client/render/texture/texture/GLTexture;", "loadFontTexture", "()Lkotakbaz/rain/client/render/texture/texture/GLTexture;", "Ljava/lang/String;", "dataPath", "atlasPath", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nFontBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontBuilder.kt\nkotakbaz/rain/client/util/render/font/FontBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n1915#2,2:139\n1915#2,2:141\n1586#2:143\n1661#2,3:144\n1586#2:147\n1661#2,3:148\n*S KotlinDebug\n*F\n+ 1 FontBuilder.kt\nkotakbaz/rain/client/util/render/font/FontBuilder\n*L\n35#1:139,2\n40#1:141,2\n74#1:143\n74#1:144,3\n84#1:147\n84#1:148,3\n*E\n"})
public final class C {
    @NotNull
    private String a = "";
    @NotNull
    private String A = "";
    @NotNull
    private String b = "";
    private static Object[] B;
    private static Object C;
    private static Object[] d;
    private static Object[] c;
    private static Object[] D;
    public static int[] e;

    public C() {
        super();
    }

    @NotNull
    public final C find(@NotNull String string) {
        int n = e[0];
        n ^= e[1];
        Intrinsics.checkNotNullParameter(string, (String)B[n += e[2]]);
        this.a = string;
        String string2 = string;
        String string3 = kotakbaz.rain.client.extensions.A.getCLIENT_ID();
        int n2 = e[3];
        n2 ^= e[4];
        int n3 = e[6];
        n3 -= e[7];
        int n4 = e[9];
        n4 += e[10];
        this.A = (String)B[n2 -= e[5]] + string3 + (String)B[n3 -= e[8]] + string2 + (String)B[n4 -= e[11]];
        String string4 = string;
        String string5 = kotakbaz.rain.client.extensions.A.getCLIENT_ID();
        int n5 = e[12];
        n5 += e[13];
        int n6 = e[15];
        n6 ^= e[16];
        int n7 = e[18];
        n7 -= e[19];
        this.b = (String)B[n5 ^= e[14]] + string5 + (String)B[n6 += e[17]] + string4 + (String)B[n7 ^= e[20]];
        return this;
    }

    @NotNull
    public final E build() {
        long l = -6288259074714942094L;
        long l2 = 547437255812038753L;
        d_0 d_02 = this.loadFontData();
        kotakbaz.rain.client.render.texture.texture.a_0 a_02 = this.loadFontTexture();
        float f2 = d_02.getAtlas().getWidth();
        float f3 = d_02.getAtlas().getHeight();
        HashMap hashMap = new HashMap(d_02.getGlyphs().size());
        Object object = d_02.getGlyphs();
        long l3 = l2;
        int n = e[21];
        n -= e[22];
        l2 = l3 ^ (0L ^ l3) & -1L << (n += e[23]);
        Iterator iterator2 = object.iterator();
        while (iterator2.hasNext()) {
            Object t2 = iterator2.next();
            B b2 = (B)t2;
            long l4 = l2;
            int n2 = e[24];
            n2 -= e[25];
            l2 = l4 ^ (0L ^ l4) & -1L >>> (n2 += e[26]);
            ((Map)hashMap).put(this.glyphKey(b2.getUnicode()), new e_0(b2, f2, f3, d_02.getAtlas().getYOrigin()));
        }
        object = new HashMap();
        Iterable iterable = d_02.getKernings();
        long l5 = l;
        int n3 = e[27];
        n3 += e[28];
        l = l5 ^ (0L ^ l5) & -1L << (n3 ^= e[29]);
        for (B b2 : iterable) {
            Map map;
            a a2 = (a)((Object)b2);
            long l6 = l;
            int n4 = e[30];
            n4 ^= e[31];
            l = l6 ^ (0L ^ l6) & -1L >>> (n4 += e[32]);
            int n5 = e[33];
            n5 ^= e[34];
            int n6 = e[36];
            n6 += e[37];
            Intrinsics.checkNotNullExpressionValue(((HashMap)object).computeIfAbsent(this.glyphKey(((a_0)a2).getLeftChar()), arg_0 -> C.build$lambda$1$1(C::build$lambda$1$0, arg_0)), (String)B[n5 ^= e[35]] + (String)B[n6 ^= e[38]]);
            map.put(this.glyphKey(((a_0)a2).getRightChar()), Float.valueOf(((a_0)a2).getAdvance()));
        }
        return new E(this.a, a_02, d_02.getAtlas(), d_02.getMetrics(), hashMap, (Map)object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final d_0 loadFontData() {
        long l = -6959613934973662805L;
        InputStream inputStream = kotakbaz.rain.client.util.other.a_0.fromAssets(this.A);
        if (inputStream == null) {
            String string = this.A;
            int n = e[39];
            n -= e[40];
            int n2 = e[42];
            n2 -= e[43];
            throw new IllegalStateException(((String)B[n -= e[41]] + (String)B[n2 += e[44]] + string).toString());
        }
        InputStream inputStream2 = inputStream;
        Closeable closeable = inputStream2;
        Throwable throwable = null;
        try {
            d_0 d_02;
            InputStream inputStream3 = (InputStream)closeable;
            long l2 = l;
            int n = e[45];
            n -= e[46];
            l = l2 ^ (0L ^ l2) & -1L << (n += e[47]);
            Closeable closeable2 = new InputStreamReader(inputStream3, StandardCharsets.UTF_8);
            Throwable throwable2 = null;
            try {
                InputStreamReader inputStreamReader = (InputStreamReader)closeable2;
                long l3 = l;
                int n3 = e[48];
                n3 += e[49];
                l = l3 ^ (0L ^ l3) & -1L >>> (n3 -= e[50]);
                JsonObject jsonObject = JsonParser.parseReader(inputStreamReader).getAsJsonObject();
                Intrinsics.checkNotNull(jsonObject);
                d_02 = this.parseFontData(jsonObject);
            }
            catch (Throwable throwable3) {
                try {
                    try {
                        throwable2 = throwable3;
                        throw throwable3;
                    }
                    catch (Throwable throwable4) {
                        CloseableKt.closeFinally(closeable2, throwable2);
                        throw throwable4;
                    }
                }
                catch (Throwable throwable5) {
                    throwable = throwable5;
                    throw throwable5;
                }
            }
            CloseableKt.closeFinally(closeable2, throwable2);
            d_0 d_03 = d_02;
            return d_03;
        }
        finally {
            CloseableKt.closeFinally(closeable, throwable);
        }
    }

    private final d_0 parseFontData(JsonObject jsonObject) {
        List list;
        List list2;
        Object object;
        Object object2;
        JsonObject jsonObject2;
        Collection collection;
        JsonElement jsonElement;
        Collection collection2;
        Iterable iterable;
        d d2;
        Iterable iterable2;
        long l = -1489645089665852075L;
        long l2 = -8701597333779627366L;
        long l3 = -7507101356514989990L;
        long l4 = -7419450369557120320L;
        d d3 = new d();
        int n = e[51];
        n -= e[52];
        JsonObject jsonObject3 = jsonObject.getAsJsonObject((String)B[n -= e[53]]);
        if (jsonObject3 == null) {
            String string = this.A;
            int n2 = e[54];
            n2 += e[55];
            int n3 = e[57];
            n3 ^= e[58];
            throw new IllegalStateException(((String)B[n2 -= e[56]] + (String)B[n3 ^= e[59]] + string).toString());
        }
        JsonObject jsonObject4 = jsonObject3;
        int n4 = e[60];
        n4 ^= e[61];
        JsonObject jsonObject5 = jsonObject.getAsJsonObject((String)B[n4 -= e[62]]);
        if (jsonObject5 == null) {
            String string = this.A;
            int n5 = e[63];
            n5 += e[64];
            int n6 = e[66];
            n6 -= e[67];
            throw new IllegalStateException(((String)B[n5 ^= e[65]] + (String)B[n6 += e[68]] + string).toString());
        }
        JsonObject jsonObject6 = jsonObject5;
        int n7 = e[69];
        n7 += e[70];
        int n8 = e[72];
        n8 -= e[73];
        ((d_0)d3).getAtlas().setRange(kotakbaz.rain.client.util.render.font.C.float$default(this, jsonObject4, (String)B[n7 ^= e[71]], 0.0f, n8 -= e[74], null));
        int n9 = e[75];
        n9 += e[76];
        int n10 = e[78];
        n10 ^= e[79];
        ((d_0)d3).getAtlas().setWidth(kotakbaz.rain.client.util.render.font.C.float$default(this, jsonObject4, (String)B[n9 += e[77]], 0.0f, n10 += e[80], null));
        int n11 = e[81];
        n11 -= e[82];
        int n12 = e[84];
        n12 ^= e[85];
        ((d_0)d3).getAtlas().setHeight(kotakbaz.rain.client.util.render.font.C.float$default(this, jsonObject4, (String)B[n11 -= e[83]], 0.0f, n12 += e[86], null));
        int n13 = e[87];
        n13 += e[88];
        int n14 = e[90];
        n14 ^= e[91];
        ((d_0)d3).getAtlas().setYOrigin(this.string(jsonObject4, (String)B[n13 += e[89]], (String)B[n14 -= e[92]]));
        int n15 = e[93];
        n15 ^= e[94];
        int n16 = e[96];
        n16 ^= e[97];
        ((d_0)d3).getMetrics().setLineHeight(kotakbaz.rain.client.util.render.font.C.float$default(this, jsonObject6, (String)B[n15 -= e[95]], 0.0f, n16 -= e[98], null));
        int n17 = e[99];
        n17 -= e[100];
        int n18 = e[102];
        n18 ^= e[103];
        ((d_0)d3).getMetrics().setAscender(kotakbaz.rain.client.util.render.font.C.float$default(this, jsonObject6, (String)B[n17 ^= e[101]], 0.0f, n18 ^= e[104], null));
        int n19 = e[105];
        n19 -= e[106];
        int n20 = e[108];
        n20 += e[109];
        ((d_0)d3).getMetrics().setDescender(kotakbaz.rain.client.util.render.font.C.float$default(this, jsonObject6, (String)B[n19 ^= e[107]], 0.0f, n20 -= e[110], null));
        d d4 = d3;
        int n21 = e[111];
        n21 -= e[112];
        JsonArray jsonArray = jsonObject.getAsJsonArray((String)B[n21 ^= e[113]]);
        if (jsonArray != null) {
            iterable2 = jsonArray;
            d2 = d4;
            long l5 = l3;
            int n22 = e[114];
            n22 += e[115];
            l3 = l5 ^ (0L ^ l5) & -1L << (n22 ^= e[116]);
            iterable = iterable2;
            int n23 = e[117];
            n23 += e[118];
            collection2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, n23 ^= e[119]));
            long l6 = l3;
            int n24 = e[120];
            n24 ^= e[121];
            l3 = l6 ^ (0L ^ l6) & -1L >>> (n24 ^= e[122]);
            for (Object t2 : iterable) {
                jsonElement = (JsonElement)t2;
                collection = collection2;
                long l7 = l4;
                int n25 = e[123];
                n25 ^= e[124];
                l4 = l7 ^ (0L ^ l7) & -1L << (n25 ^= e[125]);
                jsonObject2 = jsonElement.getAsJsonObject();
                object = object2 = new B();
                long l8 = l4;
                int n26 = e[126];
                n26 ^= e[127];
                l4 = l8 ^ (0L ^ l8) & -1L >>> (n26 -= e[128]);
                Intrinsics.checkNotNull(jsonObject2);
                int n27 = e[129];
                n27 -= e[130];
                int n28 = e[132];
                n28 -= e[133];
                int n29 = e[135];
                n29 -= e[136];
                ((B)object).setUnicode(kotakbaz.rain.client.util.render.font.C.int$default(this, jsonObject2, (String)B[n27 ^= e[131]], n28 -= e[134], n29 += e[137], null));
                int n30 = e[138];
                n30 ^= e[139];
                int n31 = e[141];
                n31 ^= e[142];
                ((B)object).setAdvance(kotakbaz.rain.client.util.render.font.C.float$default(this, jsonObject2, (String)B[n30 ^= e[140]], 0.0f, n31 ^= e[143], null));
                int n32 = e[144];
                n32 -= e[145];
                ((B)object).setPlaneBounds(this.bounds(jsonObject2, (String)B[n32 ^= e[146]]));
                int n33 = e[147];
                n33 -= e[148];
                ((B)object).setAtlasBounds(this.bounds(jsonObject2, (String)B[n33 -= e[149]]));
                collection.add(object2);
            }
            list2 = (List)collection2;
            d4 = d2;
        } else {
            list2 = CollectionsKt.emptyList();
        }
        ((d_0)d4).setGlyphs(list2);
        d d5 = d3;
        int n34 = e[150];
        n34 ^= e[151];
        JsonArray jsonArray2 = jsonObject.getAsJsonArray((String)B[n34 -= e[152]]);
        if (jsonArray2 != null) {
            iterable2 = jsonArray2;
            d2 = d5;
            long l9 = l3;
            int n35 = e[153];
            n35 += e[154];
            l3 = l9 ^ (0L ^ l9) & -1L << (n35 += e[155]);
            iterable = iterable2;
            int n36 = e[156];
            n36 += e[157];
            collection2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, n36 += e[158]));
            long l10 = l3;
            int n37 = e[159];
            n37 -= e[160];
            l3 = l10 ^ (0L ^ l10) & -1L >>> (n37 += e[161]);
            for (Object t2 : iterable) {
                jsonElement = (JsonElement)t2;
                collection = collection2;
                long l11 = l4;
                int n38 = e[162];
                n38 += e[163];
                l4 = l11 ^ (0L ^ l11) & -1L << (n38 -= e[164]);
                jsonObject2 = jsonElement.getAsJsonObject();
                object = object2 = new a();
                long l12 = l4;
                int n39 = e[165];
                n39 ^= e[166];
                l4 = l12 ^ (0L ^ l12) & -1L >>> (n39 += e[167]);
                Intrinsics.checkNotNull(jsonObject2);
                int n40 = e[168];
                n40 ^= e[169];
                int n41 = e[171];
                n41 -= e[172];
                int n42 = e[174];
                n42 -= e[175];
                ((a_0)object).setLeftChar(kotakbaz.rain.client.util.render.font.C.int$default(this, jsonObject2, (String)B[n40 += e[170]], n41 += e[173], n42 ^= e[176], null));
                int n43 = e[177];
                n43 += e[178];
                int n44 = e[180];
                n44 -= e[181];
                int n45 = e[183];
                n45 ^= e[184];
                ((a_0)object).setRightChar(kotakbaz.rain.client.util.render.font.C.int$default(this, jsonObject2, (String)B[n43 -= e[179]], n44 += e[182], n45 -= e[185], null));
                int n46 = e[186];
                n46 -= e[187];
                int n47 = e[189];
                n47 += e[190];
                ((a_0)object).setAdvance(kotakbaz.rain.client.util.render.font.C.float$default(this, jsonObject2, (String)B[n46 ^= e[188]], 0.0f, n47 ^= e[191], null));
                collection.add(object2);
            }
            list = (List)collection2;
            d5 = d2;
        } else {
            list = CollectionsKt.emptyList();
        }
        ((d_0)d5).setKernings(list);
        return d3;
    }

    private final c_0 bounds(JsonObject jsonObject, String string) {
        c c2;
        long l = 6103202619667218857L;
        JsonObject jsonObject2 = jsonObject.getAsJsonObject(string);
        if (jsonObject2 == null) {
            return null;
        }
        JsonObject jsonObject3 = jsonObject2;
        c c3 = c2 = new c();
        long l2 = l;
        int n = e[192];
        n ^= e[193];
        l = l2 ^ (0L ^ l2) & -1L << (n -= e[194]);
        int n2 = e[195];
        n2 ^= e[196];
        int n3 = e[198];
        n3 ^= e[199];
        ((c_0)c3).setLeft(kotakbaz.rain.client.util.render.font.C.float$default(this, jsonObject3, (String)B[n2 ^= e[197]], 0.0f, n3 ^= e[200], null));
        int n4 = e[201];
        n4 += e[202];
        int n5 = e[204];
        n5 ^= e[205];
        ((c_0)c3).setTop(kotakbaz.rain.client.util.render.font.C.float$default(this, jsonObject3, (String)B[n4 += e[203]], 0.0f, n5 += e[206], null));
        int n6 = e[207];
        n6 += e[208];
        int n7 = e[210];
        n7 -= e[211];
        ((c_0)c3).setRight(kotakbaz.rain.client.util.render.font.C.float$default(this, jsonObject3, (String)B[n6 ^= e[209]], 0.0f, n7 -= e[212], null));
        int n8 = e[213];
        n8 ^= e[214];
        int n9 = e[216];
        n9 -= e[217];
        ((c_0)c3).setBottom(kotakbaz.rain.client.util.render.font.C.float$default(this, jsonObject3, (String)B[n8 += e[215]], 0.0f, n9 -= e[218], null));
        return c2;
    }

    private final float float(JsonObject jsonObject, String string, float f2) {
        JsonElement jsonElement = jsonObject.get(string);
        return jsonElement != null ? jsonElement.getAsFloat() : f2;
    }

    static /* synthetic */ float float$default(C c2, JsonObject jsonObject, String string, float f2, int n, Object object) {
        int n2 = e[219];
        n2 -= e[220];
        if ((n & (n2 ^= e[221])) != 0) {
            f2 = 0.0f;
        }
        return c2.float(jsonObject, string, f2);
    }

    private final int int(JsonObject jsonObject, String string, int n) {
        JsonElement jsonElement = jsonObject.get(string);
        return jsonElement != null ? jsonElement.getAsInt() : n;
    }

    static /* synthetic */ int int$default(C c2, JsonObject jsonObject, String string, int n, int n2, Object object) {
        int n3 = e[222];
        n3 += e[223];
        if ((n2 & (n3 += e[224])) != 0) {
            int n4 = e[225];
            n4 -= e[226];
            n = n4 ^= e[227];
        }
        return c2.int(jsonObject, string, n);
    }

    private final String string(JsonObject jsonObject, String string, String string2) {
        Object object = jsonObject.get(string);
        if (object == null || (object = ((JsonElement)object).getAsString()) == null) {
            object = string2;
        }
        return object;
    }

    static /* synthetic */ String string$default(C c2, JsonObject jsonObject, String string, String string2, int n, Object object) {
        int n2 = e[228];
        n2 ^= e[229];
        if ((n & (n2 += e[230])) != 0) {
            string2 = "";
        }
        return c2.string(jsonObject, string, string2);
    }

    private final String glyphKey(int n) {
        char[] cArray = Character.toChars(n);
        int n2 = e[231];
        n2 ^= e[232];
        Intrinsics.checkNotNullExpressionValue(cArray, (String)B[n2 += e[233]]);
        char[] cArray2 = cArray;
        return new String(cArray2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final kotakbaz.rain.client.render.texture.texture.a_0 loadFontTexture() {
        long l = 4694313358634841735L;
        InputStream inputStream = kotakbaz.rain.client.util.other.a_0.fromAssets(this.b);
        if (inputStream == null) {
            String string = this.b;
            int n = e[234];
            n -= e[235];
            int n2 = e[237];
            n2 -= e[238];
            throw new IllegalStateException(((String)B[n += e[236]] + (String)B[n2 ^= e[239]] + string).toString());
        }
        InputStream inputStream2 = inputStream;
        Closeable closeable = inputStream2;
        Throwable throwable = null;
        try {
            InputStream inputStream3 = (InputStream)closeable;
            long l2 = l;
            int n = e[240];
            n += e[241];
            l = l2 ^ (0L ^ l2) & -1L << (n ^= e[242]);
            kotakbaz.rain.client.render.texture.builder.b_0 b_02 = kotakbaz.rain.client.render.texture.loader.C.a.load(inputStream3, kotakbaz.rain.client.render.texture.texture.B.A, kotakbaz.rain.client.render.texture.texture.A.A, b_0.a);
            char c2 = e[243];
            c2 ^= e[244];
            c2 ^= e[245];
            char c3 = e[246];
            c3 += e[247];
            boolean bl = e[249];
            bl -= e[250];
            int n3 = e[252];
            n3 -= e[253];
            String string = StringsKt.replace$default(this.a, c2, c3 ^= e[248], bl += e[251], n3 ^= e[254], null);
            int n4 = e[255];
            n4 += e[256];
            kotakbaz.rain.client.render.texture.texture.a_0 a_02 = kotakbaz.rain.client.render.texture.texture.a_0.of((String)B[n4 ^= e[257]] + string, b_02);
            int n5 = e[258];
            n5 ^= e[259];
            Intrinsics.checkNotNullExpressionValue(a_02, (String)B[n5 -= e[260]]);
            kotakbaz.rain.client.render.texture.texture.a_0 a_03 = a_02;
            return a_03;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            CloseableKt.closeFinally(closeable, throwable);
        }
    }

    private static final Map build$lambda$1$0(String string) {
        int n = e[261];
        n += e[262];
        Intrinsics.checkNotNullParameter(string, (String)B[n -= e[263]]);
        return new HashMap();
    }

    private static final Map build$lambda$1$1(Function1 function1, Object object) {
        return (Map)function1.invoke(object);
    }

    static {
        kotakbaz.rain.client.util.render.font.C.b();
        long l = -1885286785544678952L;
        long l2 = -8975766260904139918L;
        long l3 = -8905638760256311769L;
        long l4 = -6898849961608984940L;
        long l5 = 3078592063348944409L;
        long l6 = 7455253781338578502L;
        long l7 = 6738824978907547206L;
        long l8 = -3977741523093853421L;
        long l9 = -690161563207418769L;
        long l10 = -6476812082116766729L;
        long l11 = -3730572254500648749L;
        long l12 = -2925350168616511031L;
        long l13 = -3663817104254846784L;
        long l14 = -2634941798921695756L;
        int n = e[264];
        n -= e[265];
        B = new Object[n -= e[266]];
        long l15 = l14;
        int n2 = e[267];
        n2 ^= e[268];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 += e[269]);
        Object[] objectArray = new Object[e[270]];
        objectArray[kotakbaz.rain.client.util.render.font.C.e[271]] = c;
        objectArray[kotakbaz.rain.client.util.render.font.C.e[272]] = e[273];
        int n3 = e[274];
        Object object = kotakbaz.rain.client.util.render.font.C.A()[e[275]];
        if (object == null) {
            char[] cArray = "\u8a7f\u8beb\u8a76\u8c11\u8bec\u8ab2\u8bdb\u8a7b\u8c10\u8c11\u8c14\u8c09\u8a7b\u8c12\u8bdb\u8bd8\u8c3b\u8c10\u8be9\u8be9\u8c0d\u8c0c\u8bea\u8b75\u8a77\u8c38\u8c0a\u8c0e\u8c04\u8bf3\u8c0b\u8a77\u8c0e\u8c11\u8c0f\u8bf3\u8bf1\u8bee\u8c14\u8be8\u8bd6\u8bd6\u8bec\u8c37\u8c3d\u8c10\u8c0d\u8c36\u8c0b\u8bd7\u8c3a\u8c0a\u8c08\u8a7d\u8c06\u8a77\u8c11\u8c3c\u8c3b\u8bf1\u8bdb\u8bd7\u8bd9\u8a78\u8be4\u8c3a\u8a79\u8bef\u8b72\u8c3a\u8bdb\u8a79\u8c11\u8bea\u8a76\u8bd9\u8a7f\u8bec\u8be9\u8c12\u8beb\u8c12\u8c3a\u8c0b\u8b72\u8bef\u8be9\u8a7b\u8c14\u8be4\u8c37\u8bdb\u8b74\u8c3a\u8c3b\u8c3c\u8bee\u8bd8\u8c0e\u8c0b\u8bed\u8c0a\u8b74\u8c12\u8c3b\u8b72\u8be4\u8bed\u8a78\u8a7a\u8bdf\u8c36\u8c3d\u8c10\u8c3b\u8bed\u8c37\u8b74\u8a7a\u8c3a\u8bdb\u8c3b\u8bf0\u8bdb\u8c2e\u8a78\u8bdd\u8a79\u8a79\u8c06\u8c3f\u8bd8\u8b72\u8c15\u8bd6\u8c3a\u8beb\u8c37\u8c3a\u8c3a\u8bd7\u8a77\u8bdd\u8a7f\u8bea\u8bdb\u8c0f\u8a78\u8be9\u8ab2\u8b75\u8bdc\u8bdd\u8be1\u8c0e\u8c11\u8c06\u8c15\u8be9\u8bd7\u8c0e\u8c39\u8bee\u8ab2\u8ab4\u8bdd\u8c14\u8c3c\u8bdc\u8c12\u8b74\u8bdd\u8be4\u8b75\u8c12\u8b75\u8a7a\u8be8\u8b72\u8c2e\u8b75\u8a76\u8c3f\u8bee\u8a79\u8be4\u8bf1\u8b72\u8c41\u8c06\u8bea\u8a7c\u8be4\u8c14\u8c3f\u8bd9\u8a7f\u8c04\u8c0c\u8a7b\u8bf3\u8c3f\u8c3f\u8c09\u8a7f\u8c3f\u8a7d\u8b74\u8bdc\u8a79\u8c10\u8be8\u8c0f\u8c36\u8c0d\u8bef\u8c10\u8c3c\u8bdf\u8c04\u8c0c\u8a7a\u8c38\u8a7a\u8c0f\u8a7b\u8c3c\u8c06\u8c06\u8c0c\u8bd6\u8a7c\u8bf0\u8be9\u8bdf\u8b72\u8a7f\u8be6\u8c38\u8ab2\u8c38\u8c12\u8c3c\u8a7f\u8a7c\u8b72\u8c09\u8c14\u8bec\u8c3b\u8bdd\u8c06\u8c12\u8bec\u8bd6\u8a7c\u8c2e\u8c0f\u8beb\u8c2e\u8c38\u8c3f\u8beb\u8c41\u8be6\u8bd6\u8b75\u8a77\u8c0d\u8bd7\u8c41\u8c3b\u8a7b\u8b74\u8c41\u8c11\u8bec\u8bdd\u8c41\u8bf1\u8c41\u8c0e\u8b75\u8c3b\u8b72\u8bdd\u8bec\u8ab2\u8ab4\u8be1\u8a7c\u8bd8\u8bdc\u8bef\u8c3c\u8bf1\u8bea\u8c10\u8b74\u8bf1\u8be6\u8c0d\u8c0f\u8b72\u8c36\u8c11\u8bda\u8be8\u8be4\u8c0b\u8c12\u8c2e\u8a7f\u8be6\u8bd9\u8bed\u8bf1\u8bd7\u8c41\u8bea\u8c38\u8a79\u8bee\u8c3b\u8ab2\u8a78\u8bdc\u8c38\u8c08\u8c41\u8c15\u8c0e\u8c0a\u8bdb\u8a7a\u8bf1\u8c2e\u8be8\u8c37\u8a7c\u8c08\u8be6\u8beb\u8c0e\u8bd8\u8c12\u8c12\u8a7b\u8bd7\u8c0f\u8bd8\u8c37\u8c04\u8bd8\u8be8\u8c0c\u8a7d\u8c14\u8c13\u8bdb\u8c08\u8bea\u8bf3\u8bd9\u8a7f\u8bed\u8bd9\u8bec\u8bf1\u8bf1\u8a7d\u8a7b\u8bea\u8c13\u8c3a\u8bd9\u8a7c\u8a7f\u8c09\u8c11\u8be8\u8be4\u8c38\u8bd7\u8bdc\u8c0f\u8bdb\u8c3a\u8beb\u8c39\u8bec\u8c04\u8c0c\u8c36\u8c36\u8be8\u8c15\u8bdd\u8a7b\u8bf3\u8c0c\u8c3a\u8beb\u8c3d\u8bd7\u8bd7\u8bed\u8c3f\u8c38\u8c10\u8c3f\u8ab4\u8c14\u8c0c\u8bdd\u8bec\u8c0d\u8bf0\u8bed\u8c0a\u8bdd\u8c0c\u8c0a\u8bf0\u8c0c\u8bec\u8c11\u8a76\u8bf0\u8c3d\u8b75\u8a7b\u8c0a\u8bed\u8beb\u8bdc\u8c39\u8c06\u8c37\u8a7a\u8bdc\u8bdc\u8c14\u8bf1\u8bda\u8c0d\u8c14\u8bda\u8bdc\u8be6\u8c0a\u8c37\u8c39\u8bf3\u8a78\u8c14\u8bec\u8bda\u8bd7\u8bf0\u8bd8\u8ab2\u8c09\u8bd7\u8c3a\u8a79\u8b72\u8a7c\u8c2e\u8c36\u8bdb\u8bf0\u8c38\u8c12\u8a7f\u8c37\u8ab2\u8b72\u8bef\u8a7d\u8b72\u8bec\u8c0f\u8c38\u8ab4\u8bec\u8bdc\u8be6\u8ab2\u8beb\u8bec\u8c08\u8be1\u8bd6\u8bdf\u8be9\u8c2e\u8bdd\u8ab2\u8a7a\u8bf3\u8c0c\u8bda\u8a78\u8c0d\u8bdf\u8c15\u8bd9\u8b72\u8bf1\u8b72\u8bdd\u8c12\u8c09\u8bea\u8a7c\u8c39\u8bd9\u8be1\u8c3a\u8c39\u8bf1\u8bf0\u8c0e\u8bec\u8be1\u8bee\u8c38\u8c0f\u8be4\u8c12\u8a7d\u8c2e\u8be9\u8c08\u8bdf\u8a76\u8bd6\u8b74\u8bf0\u8c0f\u8bf3\u8ab2\u8bee\u8a79\u8ab4\u8c38\u8c13\u8c15\u8c10\u8bf3\u8a77\u8c3f\u8c38\u8c11\u8c15\u8c15\u8ab4\u8b72\u8be8\u8a7a\u8c0f\u8c38\u8c15\u8c10\u8be8\u8bf3\u8be1\u8bdc\u8c41\u8be1\u8c14\u8c3c\u8c0d\u8ab4\u8bef\u8bdf\u8b75\u8a7c\u8bda\u8c04\u8a7a\u8c3b\u8a78\u8c37\u8a76\u8bf0\u8bea\u8bda\u8bd7\u8c0a\u8c3f\u8bdf\u8c3b\u8be1\u8bec\u8bf3\u8c0f\u8c0f\u8bd8\u8b75\u8be4\u8a7a\u8bd9\u8c3c\u8a76\u8c3c\u8bec\u8bdb\u8c06\u8c0a\u8c2e\u8b75\u8a79\u8c08\u8be8\u8c0c\u8c0c\u8bd8\u8c15\u8c3f\u8bef\u8c08\u8bd9\u8c13\u8c15\u8bf1\u8bd9\u8c0c\u8bf3\u8bd6\u8bee\u8a77\u8bd6\u8c39\u8bee\u8bd8\u8a79\u8bda\u8bdd".toCharArray();
            for (int i = e[276]; i < e[277]; ++i) {
                int n4 = cArray[i];
                n4 -= e[278];
                n4 -= e[279];
                n4 ^= e[280];
                n4 ^= e[281];
                n4 += e[282];
                n4 += e[283];
                n4 += e[284];
                n4 ^= e[285];
                n4 ^= e[286];
                n4 ^= e[287];
                n4 -= e[288];
                cArray[i] = (char)(n4 ^= e[289]);
            }
            object = kotakbaz.rain.client.util.render.font.C.A()[kotakbaz.rain.client.util.render.font.C.e[290]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.util.render.font.C.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = e[291];
        n5 += e[292];
        l5 = l16 ^ (0x1C500000000L ^ l16) & -1L << (n5 ^= e[293]);
        long l17 = l12;
        int n6 = e[294];
        n6 ^= e[295];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 += e[296]);
        while (true) {
            int n7 = e[297];
            n7 ^= e[298];
            if ((int)l12 >= (int)(l5 >>> (n7 += e[299]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = e[300];
            n9 += e[301];
            int n10 = e[303];
            n10 -= e[304];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= e[302])) & -1L >>> (n10 ^= e[305]);
            long l19 = l8;
            int n11 = e[306];
            n11 += e[307];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += e[308]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = e[309];
            n13 ^= e[310];
            int n14 = e[312];
            n14 -= e[313];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 ^= e[311])) & -1L >>> (n14 -= e[314]);
            int n15 = e[315];
            n15 += e[316];
            long l21 = l9;
            int n16 = e[318];
            n16 ^= e[319];
            l9 = l21 ^ ((long)cArray[n12] << (n15 += e[317]) ^ l21) & -1L << (n16 -= e[320]);
            int n17 = e[321];
            n17 -= e[322];
            n17 -= e[323];
            int n18 = e[324];
            n18 += e[325];
            long l22 = l11;
            int n19 = e[327];
            n19 ^= e[328];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 ^= e[326]))) ^ l22) & -1L >>> (n19 ^= e[329]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = e[330];
            n20 -= e[331];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 += e[332]);
            while (true) {
                int n21 = e[333];
                n21 ^= e[334];
                if ((int)(l13 >>> (n21 ^= e[335])) >= (int)l11) break;
                int n22 = e[336];
                n22 ^= e[337];
                int n23 = e[339];
                n23 ^= e[340];
                cArray2[(int)(l13 >>> (n22 -= kotakbaz.rain.client.util.render.font.C.e[338]))] = cArray[(int)l12 + (int)(l13 >>> (n23 += e[341]))];
                l13 += 0x100000000L;
            }
            int n24 = e[342];
            n24 += e[343];
            int n25 = (int)(l14 >>> (n24 += e[344]));
            l14 += 0x100000000L;
            kotakbaz.rain.client.util.render.font.C.B[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = e[345];
            n26 -= e[346];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 -= e[347]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[e[348]];
        String string = (String)object[e[349]];
        object = object[e[350]];
        Object[] objectArray = d;
        if (d == null) {
            objectArray = d = new Object[e[351]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[e[352]];
                c = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[e[354] ^ e[355]];
                byArray[kotakbaz.rain.client.util.render.font.C.e[356] ^ kotakbaz.rain.client.util.render.font.C.e[357]] = e[358] ^ e[359];
                byArray[kotakbaz.rain.client.util.render.font.C.e[360] ^ kotakbaz.rain.client.util.render.font.C.e[361]] = e[362] ^ e[363];
                byArray[kotakbaz.rain.client.util.render.font.C.e[364] ^ kotakbaz.rain.client.util.render.font.C.e[365]] = e[366] ^ e[367];
                byArray[kotakbaz.rain.client.util.render.font.C.e[368] ^ kotakbaz.rain.client.util.render.font.C.e[369]] = e[370] ^ e[371];
                byArray[kotakbaz.rain.client.util.render.font.C.e[372] ^ kotakbaz.rain.client.util.render.font.C.e[373]] = e[374] ^ e[375];
                byArray[kotakbaz.rain.client.util.render.font.C.e[376] ^ kotakbaz.rain.client.util.render.font.C.e[377]] = e[378] ^ e[379];
                byArray[kotakbaz.rain.client.util.render.font.C.e[380] ^ kotakbaz.rain.client.util.render.font.C.e[381]] = e[382] ^ e[383];
                byArray[kotakbaz.rain.client.util.render.font.C.e[384] ^ kotakbaz.rain.client.util.render.font.C.e[385]] = e[386] ^ e[387];
                byArray[kotakbaz.rain.client.util.render.font.C.e[388] ^ kotakbaz.rain.client.util.render.font.C.e[389]] = e[390] ^ e[391];
                byArray[kotakbaz.rain.client.util.render.font.C.e[392] ^ kotakbaz.rain.client.util.render.font.C.e[393]] = e[394] ^ e[395];
                byArray[kotakbaz.rain.client.util.render.font.C.e[396] ^ kotakbaz.rain.client.util.render.font.C.e[397]] = e[398] ^ e[399];
                byArray[0xDD70 ^ 0xDD7F] = 0xFFFF22D8 ^ 0xDD7F;
                byArray[0x1028D ^ 0x10285] = 0xFFFEFD5B ^ 0x10285;
                byArray[0x2654 ^ 0x2655] = 0xFFFFD9FE ^ 0x2655;
                byArray[0x964 ^ 0x961] = 0x904 ^ 0x961;
                byArray[0x9B1C ^ 0x9B12] = 0xFFFF64DB ^ 0x9B12;
                objectArray2[kotakbaz.rain.client.util.render.font.C.e[353]] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (C == null) {
                byte[] byArray2 = new byte[0xEE11 ^ 0xEE31];
                byArray2[0xE1AB ^ 0xE1B5] = 0xE1E3 ^ 0xE1B5;
                byArray2[0x265 ^ 0x26C] = 0xFFFFFDAD ^ 0x26C;
                byArray2[0x5AEF ^ 0x5AFD] = 0x5A82 ^ 0x5AFD;
                byArray2[0xAF34 ^ 0xAF2C] = 0xAF0D ^ 0xAF2C;
                byArray2[0x67EB ^ 0x67F4] = 0x67EC ^ 0x67F4;
                byArray2[0xDC94 ^ 0xDC8E] = 0xDCFC ^ 0xDC8E;
                byArray2[0xA750 ^ 0xA74D] = 0xFFFF58C9 ^ 0xA74D;
                byArray2[0xE2A4 ^ 0xE2B0] = 0xE2DA ^ 0xE2B0;
                byArray2[0xB2B7 ^ 0xB2BC] = 0xFFFF4D53 ^ 0xB2BC;
                byArray2[0xACD0 ^ 0xACD4] = 0xFFFF5355 ^ 0xACD4;
                byArray2[0x17B1 ^ 0x17BD] = 0xFFFFE823 ^ 0x17BD;
                byArray2[0x9464 ^ 0x9464] = 0x9421 ^ 0x9464;
                byArray2[0x5238 ^ 0x523A] = 0x5214 ^ 0x523A;
                byArray2[0xC988 ^ 0xC991] = 0xC98A ^ 0xC991;
                byArray2[0xB920 ^ 0xB937] = 0xFFFF4690 ^ 0xB937;
                byArray2[0x8F97 ^ 0x8F9F] = 0xFFFF7058 ^ 0x8F9F;
                byArray2[0x2AB5 ^ 0x2ABF] = 0xFFFFD51A ^ 0x2ABF;
                byArray2[0xD14F ^ 0xD154] = 0xD170 ^ 0xD154;
                byArray2[0xE527 ^ 0xE531] = 0xFFFF1AE6 ^ 0xE531;
                byArray2[0xE3A8 ^ 0xE3AF] = 0xE3C2 ^ 0xE3AF;
                byArray2[0x4EE5 ^ 0x4EF0] = 0x4EA0 ^ 0x4EF0;
                byArray2[0xF6A ^ 0xF65] = 0xFFFFF0BC ^ 0xF65;
                byArray2[0x45D8 ^ 0x45C8] = 0x458F ^ 0x45C8;
                byArray2[0x52D2 ^ 0x52C3] = 0xFFFFAD53 ^ 0x52C3;
                byArray2[0xE72D ^ 0xE72B] = 0xE74C ^ 0xE72B;
                byArray2[0xDCDB ^ 0xDCC7] = 0xFFFF2325 ^ 0xDCC7;
                byArray2[0x1D2F ^ 0x1D2C] = 0xFFFFE293 ^ 0x1D2C;
                byArray2[0x333B ^ 0x333E] = 0xFFFFCCEF ^ 0x333E;
                byArray2[0xF90A ^ 0xF90B] = 0xFFFF069A ^ 0xF90B;
                byArray2[0xD4E9 ^ 0xD4FA] = 0xD4BB ^ 0xD4FA;
                byArray2[0x2FD5 ^ 0x2FD8] = 0xFFFFD046 ^ 0x2FD8;
                byArray2[0xDA14 ^ 0xDA1A] = 0xFFFF25B1 ^ 0xDA1A;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.util.render.font.C.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u0f09\u04f7\u04f0\u04c5\u04c3\u04e7\u0f14\u0f1a\u05b5\u0f11\u04f1\u05a6\u0fe2\u0f18\u0f08\u04f1\u04c2\u04f2".toCharArray();
                    for (int i = 0; i < 18; ++i) {
                        int n2 = cArray[i];
                        n2 ^= 0xC561;
                        n2 -= 7553;
                        n2 -= 28805;
                        n2 ^= 0x8B87;
                        n2 -= 2634;
                        n2 += 10059;
                        n2 -= 21772;
                        n2 += 43887;
                        n2 ^= 0x2F55;
                        n2 += 30710;
                        n2 += 18264;
                        n2 -= 36570;
                        n2 += 64669;
                        cArray[i] = (char)(n2 ^= 0x317D);
                    }
                    object4 = kotakbaz.rain.client.util.render.font.C.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[3] = -55;
                byArray4[6] = -8;
                byArray4[10] = 86;
                byArray4[4] = 37;
                byArray4[9] = 61;
                byArray4[11] = 63;
                byArray4[1] = -5;
                byArray4[7] = -57;
                byArray4[5] = 126;
                byArray4[15] = 20;
                byArray4[8] = -112;
                byArray4[12] = 18;
                byArray4[14] = 80;
                byArray4[2] = 29;
                byArray4[0] = 22;
                byArray4[13] = 60;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 15, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.util.render.font.C.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ub231\ub23d\ub23f".toCharArray();
                    for (int i = 0; i < 3; ++i) {
                        int n3 = cArray[i];
                        n3 -= 64641;
                        n3 += 30370;
                        n3 ^= 0x1584;
                        n3 += 39252;
                        n3 ^= 0x62E5;
                        n3 ^= 0x9A85;
                        n3 -= 13669;
                        n3 -= 5910;
                        n3 += 13015;
                        n3 -= 21387;
                        n3 ^= 0xD0CB;
                        cArray[i] = (char)(n3 -= 28303);
                    }
                    object5 = kotakbaz.rain.client.util.render.font.C.A()[2] = new String(cArray);
                }
                C = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.client.util.render.font.C.A()[3];
            if (object6 == null) {
                char[] cArray = "\uc72b\uc727\uc60d\uc771\uc61d\uc724\uc61d\uc771\uc61a\uc745\uc61d\uc60d\uc777\uc61a\uc74b\uc746\uc746\uc733\uc728\uc729".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 ^= 0x4F02;
                    n4 -= 10274;
                    n4 ^= 0x4804;
                    n4 ^= 0x6586;
                    n4 += 5351;
                    n4 += 64295;
                    n4 += 30793;
                    n4 ^= 0x394C;
                    n4 ^= 0x52AC;
                    n4 -= 14157;
                    n4 += 52815;
                    n4 ^= 0x23F4;
                    n4 += 12471;
                    n4 ^= 0x8599;
                    cArray[i] = (char)(n4 ^= 0x2259);
                }
                object6 = kotakbaz.rain.client.util.render.font.C.A()[3] = new String(cArray);
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
        e = new int[0x9A54 ^ 0x9BC4];
        kotakbaz.rain.client.util.render.font.C.e[0xDBC9 ^ 0xDB59] = 0xFFFF2493 ^ 0xDB59;
        kotakbaz.rain.client.util.render.font.C.e[0x2565 ^ 0x2593] = 0xFFFFDAAB ^ 0x2593;
        kotakbaz.rain.client.util.render.font.C.e[0xB5E0 ^ 0xB46F] = 0xA101 ^ 0xB46F;
        kotakbaz.rain.client.util.render.font.C.e[0xA3A0 ^ 0xA2D7] = 0x624F ^ 0xA2D7;
        kotakbaz.rain.client.util.render.font.C.e[0x4942 ^ 0x4828] = 0xFFFF7A3C ^ 0x4828;
        kotakbaz.rain.client.util.render.font.C.e[0x9FE0 ^ 0x9F5C] = 0xFFFF60B1 ^ 0x9F5C;
        kotakbaz.rain.client.util.render.font.C.e[0x16D2 ^ 0x16DE] = 0x168E ^ 0x16DE;
        kotakbaz.rain.client.util.render.font.C.e[0xA52B ^ 0xA54C] = 0xFFFF5A97 ^ 0xA54C;
        kotakbaz.rain.client.util.render.font.C.e[0xD686 ^ 0xD67E] = 0xFFFF29AD ^ 0xD67E;
        kotakbaz.rain.client.util.render.font.C.e[0x8533 ^ 0x8508] = 0xFFFF7A81 ^ 0x8508;
        kotakbaz.rain.client.util.render.font.C.e[0x460A ^ 0x4646] = 0xFFFFB9E9 ^ 0x4646;
        kotakbaz.rain.client.util.render.font.C.e[0x9F4C ^ 0x9E49] = 0x9ED3 ^ 0x9E49;
        kotakbaz.rain.client.util.render.font.C.e[0xA8D4 ^ 0xA85D] = 0xA856 ^ 0xA85D;
        kotakbaz.rain.client.util.render.font.C.e[0x97D7 ^ 0x974F] = 0xFFFF688A ^ 0x974F;
        kotakbaz.rain.client.util.render.font.C.e[0x5829 ^ 0x5903] = 0x5975 ^ 0x5903;
        kotakbaz.rain.client.util.render.font.C.e[0xE637 ^ 0xE672] = 0xE6A5 ^ 0xE672;
        kotakbaz.rain.client.util.render.font.C.e[0x1A65 ^ 0x1A2F] = 0xFFFFE5FD ^ 0x1A2F;
        kotakbaz.rain.client.util.render.font.C.e[0x38DA ^ 0x3997] = 0x39F6 ^ 0x3997;
        kotakbaz.rain.client.util.render.font.C.e[0x3BA7 ^ 0x3BE7] = 0x3BB5 ^ 0x3BE7;
        kotakbaz.rain.client.util.render.font.C.e[0x14DE ^ 0x14EA] = 0xFFFFEB24 ^ 0x14EA;
        kotakbaz.rain.client.util.render.font.C.e[0x100E1 ^ 0x1016D] = 0x11407 ^ 0x1016D;
        kotakbaz.rain.client.util.render.font.C.e[0x3D20 ^ 0x3D41] = 0xFFFFC293 ^ 0x3D41;
        kotakbaz.rain.client.util.render.font.C.e[0x7D55 ^ 0x7DF2] = 0x7DDE ^ 0x7DF2;
        kotakbaz.rain.client.util.render.font.C.e[0x7DE9 ^ 0x7C96] = 0x17516 ^ 0x7C96;
        kotakbaz.rain.client.util.render.font.C.e[0x6FA9 ^ 0x6EA7] = 0x6EA4 ^ 0x6EA7;
        kotakbaz.rain.client.util.render.font.C.e[0x3094 ^ 0x30A5] = 0x30A7 ^ 0x30A5;
        kotakbaz.rain.client.util.render.font.C.e[0xE225 ^ 0xE2A5] = 0xFFFF1D73 ^ 0xE2A5;
        kotakbaz.rain.client.util.render.font.C.e[0xDBFA ^ 0xDB35] = 0xFFFF24E1 ^ 0xDB35;
        kotakbaz.rain.client.util.render.font.C.e[0xDAD0 ^ 0xDA1A] = 0xFFFF25F1 ^ 0xDA1A;
        kotakbaz.rain.client.util.render.font.C.e[0x20B ^ 0x2BA] = 0x218 ^ 0x2BA;
        kotakbaz.rain.client.util.render.font.C.e[0x3CCB ^ 0x3DD8] = 0x3DD8 ^ 0x3DD8;
        kotakbaz.rain.client.util.render.font.C.e[0xFE87 ^ 0xFF91] = 0x4FC2 ^ 0xFF91;
        kotakbaz.rain.client.util.render.font.C.e[0x1904 ^ 0x1842] = 0xFFFFE7A1 ^ 0x1842;
        kotakbaz.rain.client.util.render.font.C.e[0xC5DE ^ 0xC4BF] = 0xC4BF ^ 0xC4BF;
        kotakbaz.rain.client.util.render.font.C.e[0x10936 ^ 0x109D3] = 0x109F8 ^ 0x109D3;
        kotakbaz.rain.client.util.render.font.C.e[0xC922 ^ 0xC9F6] = 0xFFFF3666 ^ 0xC9F6;
        kotakbaz.rain.client.util.render.font.C.e[0x6B25 ^ 0x6B15] = 0x6B1B ^ 0x6B15;
        kotakbaz.rain.client.util.render.font.C.e[0xABC8 ^ 0xAAAB] = 0x15E5 ^ 0xAAAB;
        kotakbaz.rain.client.util.render.font.C.e[0x2AF7 ^ 0x2AAE] = 0x2AF1 ^ 0x2AAE;
        kotakbaz.rain.client.util.render.font.C.e[0xBCE7 ^ 0xBDF7] = 0xBDF6 ^ 0xBDF7;
        kotakbaz.rain.client.util.render.font.C.e[0x42A2 ^ 0x43A2] = 0xFFFFBC7A ^ 0x43A2;
        kotakbaz.rain.client.util.render.font.C.e[0xB9E8 ^ 0xB972] = 0xB91E ^ 0xB972;
        kotakbaz.rain.client.util.render.font.C.e[0x77DF ^ 0x76B6] = 0xBB75 ^ 0x76B6;
        kotakbaz.rain.client.util.render.font.C.e[0x1E11 ^ 0x1EEF] = 0xFFFFE16E ^ 0x1EEF;
        kotakbaz.rain.client.util.render.font.C.e[0x1004D ^ 0x1001F] = 0xFFFEFFC8 ^ 0x1001F;
        kotakbaz.rain.client.util.render.font.C.e[0x30F9 ^ 0x31F1] = 0xFFFFCE5F ^ 0x31F1;
        kotakbaz.rain.client.util.render.font.C.e[0x3E6C ^ 0x3E0A] = 0x3E77 ^ 0x3E0A;
        kotakbaz.rain.client.util.render.font.C.e[0xE6C0 ^ 0xE666] = 0xFFFF19FC ^ 0xE666;
        kotakbaz.rain.client.util.render.font.C.e[0xD1D8 ^ 0xD0A1] = 0xCFE4 ^ 0xD0A1;
        kotakbaz.rain.client.util.render.font.C.e[0xB949 ^ 0xB8C0] = 0x8817 ^ 0xB8C0;
        kotakbaz.rain.client.util.render.font.C.e[0x780B ^ 0x796D] = 0xD1A6 ^ 0x796D;
        kotakbaz.rain.client.util.render.font.C.e[0x9C6 ^ 0x915] = 0x947 ^ 0x915;
        kotakbaz.rain.client.util.render.font.C.e[0xEA0B ^ 0xEB54] = 0xEB55 ^ 0xEB54;
        kotakbaz.rain.client.util.render.font.C.e[0x36FD ^ 0x378F] = 0x8668 ^ 0x378F;
        kotakbaz.rain.client.util.render.font.C.e[0x18FC ^ 0x1867] = 0x1848 ^ 0x1867;
        kotakbaz.rain.client.util.render.font.C.e[0xC4AD ^ 0xC41F] = 0xFFFF3BD4 ^ 0xC41F;
        kotakbaz.rain.client.util.render.font.C.e[0xE0BD ^ 0xE015] = 0xFFFF1FB6 ^ 0xE015;
        kotakbaz.rain.client.util.render.font.C.e[0xDDBF ^ 0xDD6A] = 0xFFFF22E7 ^ 0xDD6A;
        kotakbaz.rain.client.util.render.font.C.e[0x8767 ^ 0x8631] = 0x8614 ^ 0x8631;
        kotakbaz.rain.client.util.render.font.C.e[0x23E0 ^ 0x23F4] = 0xFFFFDC39 ^ 0x23F4;
        kotakbaz.rain.client.util.render.font.C.e[0xE549 ^ 0xE5C5] = 0xE5D2 ^ 0xE5C5;
        kotakbaz.rain.client.util.render.font.C.e[0xA42A ^ 0xA4D9] = 0xFFFF5B6E ^ 0xA4D9;
        kotakbaz.rain.client.util.render.font.C.e[0x7716 ^ 0x7615] = 0x766F ^ 0x7615;
        kotakbaz.rain.client.util.render.font.C.e[0x4475 ^ 0x456B] = 0xD500 ^ 0x456B;
        kotakbaz.rain.client.util.render.font.C.e[0xCA2B ^ 0xCAEE] = 0xCAE0 ^ 0xCAEE;
        kotakbaz.rain.client.util.render.font.C.e[0x10C98 ^ 0x10D99] = 0xFFFEF218 ^ 0x10D99;
        kotakbaz.rain.client.util.render.font.C.e[0x10EA0 ^ 0x10E80] = 0x10E93 ^ 0x10E80;
        kotakbaz.rain.client.util.render.font.C.e[0x566D ^ 0x573A] = 0x576C ^ 0x573A;
        kotakbaz.rain.client.util.render.font.C.e[0xF835 ^ 0xF915] = 0xF37B ^ 0xF915;
        kotakbaz.rain.client.util.render.font.C.e[0xBD49 ^ 0xBC3A] = 0xD86 ^ 0xBC3A;
        kotakbaz.rain.client.util.render.font.C.e[0x37D1 ^ 0x37AE] = 0x378E ^ 0x37AE;
        kotakbaz.rain.client.util.render.font.C.e[0xD1F9 ^ 0xD0DC] = 0xFFFF2F24 ^ 0xD0DC;
        kotakbaz.rain.client.util.render.font.C.e[0x1725 ^ 0x170F] = 0x1703 ^ 0x170F;
        kotakbaz.rain.client.util.render.font.C.e[0x1AF5 ^ 0x1A85] = 0xFFFFE558 ^ 0x1A85;
        kotakbaz.rain.client.util.render.font.C.e[0x1F81 ^ 0x1EEA] = 0xD329 ^ 0x1EEA;
        kotakbaz.rain.client.util.render.font.C.e[0x73BD ^ 0x7360] = 0x734E ^ 0x7360;
        kotakbaz.rain.client.util.render.font.C.e[0xC9FD ^ 0xC8AE] = 0xFFFF374E ^ 0xC8AE;
        kotakbaz.rain.client.util.render.font.C.e[0x1A3F ^ 0x1B7E] = 0x1B13 ^ 0x1B7E;
        kotakbaz.rain.client.util.render.font.C.e[0x10B5B ^ 0x10A74] = 0xFFFEF5FB ^ 0x10A74;
        kotakbaz.rain.client.util.render.font.C.e[0x7840 ^ 0x7880] = 0x78A4 ^ 0x7880;
        kotakbaz.rain.client.util.render.font.C.e[0xA63C ^ 0xA62E] = 0xA615 ^ 0xA62E;
        kotakbaz.rain.client.util.render.font.C.e[0xCD66 ^ 0xCC02] = 0x64F4 ^ 0xCC02;
        kotakbaz.rain.client.util.render.font.C.e[0xC881 ^ 0xC9CF] = 0xC9AB ^ 0xC9CF;
        kotakbaz.rain.client.util.render.font.C.e[0xBC89 ^ 0xBC18] = 0xBC1A ^ 0xBC18;
        kotakbaz.rain.client.util.render.font.C.e[0xA250 ^ 0xA245] = 0xA2CD ^ 0xA245;
        kotakbaz.rain.client.util.render.font.C.e[0xA57D ^ 0xA469] = 0xA469 ^ 0xA469;
        kotakbaz.rain.client.util.render.font.C.e[0x939B ^ 0x931F] = 0x9396 ^ 0x931F;
        kotakbaz.rain.client.util.render.font.C.e[0x3023 ^ 0x312F] = 0xFFFFCE89 ^ 0x312F;
        kotakbaz.rain.client.util.render.font.C.e[0xDDFE ^ 0xDD67] = 0xFFFF22E2 ^ 0xDD67;
        kotakbaz.rain.client.util.render.font.C.e[0x9023 ^ 0x9019] = 0x907A ^ 0x9019;
        kotakbaz.rain.client.util.render.font.C.e[0xC9CF ^ 0xC9AF] = 0xFFFF363D ^ 0xC9AF;
        kotakbaz.rain.client.util.render.font.C.e[0x8170 ^ 0x807B] = 0x8009 ^ 0x807B;
        kotakbaz.rain.client.util.render.font.C.e[0x6478 ^ 0x64B5] = 0x64B6 ^ 0x64B5;
        kotakbaz.rain.client.util.render.font.C.e[0x205A ^ 0x21DA] = 0x2504 ^ 0x21DA;
        kotakbaz.rain.client.util.render.font.C.e[0xDAF8 ^ 0xDABA] = 0xFFFF2560 ^ 0xDABA;
        kotakbaz.rain.client.util.render.font.C.e[0xEB9B ^ 0xEAE6] = 0x1E366 ^ 0xEAE6;
        kotakbaz.rain.client.util.render.font.C.e[0x44E0 ^ 0x444F] = 0x445F ^ 0x444F;
        kotakbaz.rain.client.util.render.font.C.e[0x9744 ^ 0x978D] = 0xFFFF6855 ^ 0x978D;
        kotakbaz.rain.client.util.render.font.C.e[0x4F28 ^ 0x4E01] = 0xFFFFB1BD ^ 0x4E01;
        kotakbaz.rain.client.util.render.font.C.e[0xC6CA ^ 0xC7FE] = 0xFFFF386F ^ 0xC7FE;
        kotakbaz.rain.client.util.render.font.C.e[0xC913 ^ 0xC847] = 0xFFFF37A6 ^ 0xC847;
        kotakbaz.rain.client.util.render.font.C.e[0x1EFA ^ 0x1EBC] = 0xFFFFE133 ^ 0x1EBC;
        kotakbaz.rain.client.util.render.font.C.e[0xAF07 ^ 0xAF90] = 0xFFFF5069 ^ 0xAF90;
        kotakbaz.rain.client.util.render.font.C.e[0xC543 ^ 0xC530] = 0xC51C ^ 0xC530;
        kotakbaz.rain.client.util.render.font.C.e[0x2C5F ^ 0x2D06] = 0xFFFFD241 ^ 0x2D06;
        kotakbaz.rain.client.util.render.font.C.e[0xE14F ^ 0xE1BB] = 0xE1C3 ^ 0xE1BB;
        kotakbaz.rain.client.util.render.font.C.e[0xB2EA ^ 0xB229] = 0xFFFF4D90 ^ 0xB229;
        kotakbaz.rain.client.util.render.font.C.e[0x11D6 ^ 0x11C1] = 0xFFFFEE31 ^ 0x11C1;
        kotakbaz.rain.client.util.render.font.C.e[0xD34D ^ 0xD209] = 0xFFFF2D6B ^ 0xD209;
        kotakbaz.rain.client.util.render.font.C.e[0xEBB5 ^ 0xEAEE] = 0xFFFF157E ^ 0xEAEE;
        kotakbaz.rain.client.util.render.font.C.e[0xBAFE ^ 0xBA7C] = 0xFFFF4592 ^ 0xBA7C;
        kotakbaz.rain.client.util.render.font.C.e[0x6795 ^ 0x6731] = 0xFFFF98D9 ^ 0x6731;
        kotakbaz.rain.client.util.render.font.C.e[0xE1CB ^ 0xE195] = 0xFFFF1E4A ^ 0xE195;
        kotakbaz.rain.client.util.render.font.C.e[0x8F3E ^ 0x8E34] = 0xFFFF7194 ^ 0x8E34;
        kotakbaz.rain.client.util.render.font.C.e[0x9B17 ^ 0x9A6F] = 0x8529 ^ 0x9A6F;
        kotakbaz.rain.client.util.render.font.C.e[0x724B ^ 0x723E] = 0x7272 ^ 0x723E;
        kotakbaz.rain.client.util.render.font.C.e[0x16B5 ^ 0x1780] = 0x17A5 ^ 0x1780;
        kotakbaz.rain.client.util.render.font.C.e[0x8295 ^ 0x82C1] = 0x8290 ^ 0x82C1;
        kotakbaz.rain.client.util.render.font.C.e[0xED3F ^ 0xED85] = 0xFFFF124B ^ 0xED85;
        kotakbaz.rain.client.util.render.font.C.e[0xCC64 ^ 0xCDE5] = 0xC937 ^ 0xCDE5;
        kotakbaz.rain.client.util.render.font.C.e[0x4EAC ^ 0x4F91] = 0xFFFFB035 ^ 0x4F91;
        kotakbaz.rain.client.util.render.font.C.e[0xF7B3 ^ 0xF6A4] = 0x9FA7 ^ 0xF6A4;
        kotakbaz.rain.client.util.render.font.C.e[0x6D41 ^ 0x6D05] = 0x6D3E ^ 0x6D05;
        kotakbaz.rain.client.util.render.font.C.e[0x76B5 ^ 0x778B] = 0xFFFF8824 ^ 0x778B;
        kotakbaz.rain.client.util.render.font.C.e[0xA515 ^ 0xA46E] = 0xBB2B ^ 0xA46E;
        kotakbaz.rain.client.util.render.font.C.e[0x9862 ^ 0x98C7] = 0x98A9 ^ 0x98C7;
        kotakbaz.rain.client.util.render.font.C.e[0x72D8 ^ 0x724B] = 0x7253 ^ 0x724B;
        kotakbaz.rain.client.util.render.font.C.e[0x80FD ^ 0x8060] = 0x8051 ^ 0x8060;
        kotakbaz.rain.client.util.render.font.C.e[0x664A ^ 0x66C7] = 0x66B1 ^ 0x66C7;
        kotakbaz.rain.client.util.render.font.C.e[0x1055C ^ 0x10585] = 0xFFFEFA09 ^ 0x10585;
        kotakbaz.rain.client.util.render.font.C.e[0x6DAC ^ 0x6C28] = 0x4A5F ^ 0x6C28;
        kotakbaz.rain.client.util.render.font.C.e[0x9854 ^ 0x98D1] = 0x98F1 ^ 0x98D1;
        kotakbaz.rain.client.util.render.font.C.e[0x1196 ^ 0x11DF] = 0xFFFFEE1C ^ 0x11DF;
        kotakbaz.rain.client.util.render.font.C.e[0xCD59 ^ 0xCD7A] = 0xCD40 ^ 0xCD7A;
        kotakbaz.rain.client.util.render.font.C.e[0x5ED7 ^ 0x5FCB] = 0x4FBC ^ 0x5FCB;
        kotakbaz.rain.client.util.render.font.C.e[0x39CE ^ 0x395C] = 0xFFFFC698 ^ 0x395C;
        kotakbaz.rain.client.util.render.font.C.e[0xA0F7 ^ 0xA1E2] = 0xA362 ^ 0xA1E2;
        kotakbaz.rain.client.util.render.font.C.e[0x10031 ^ 0x1015D] = 0x161C3 ^ 0x1015D;
        kotakbaz.rain.client.util.render.font.C.e[0xD7C7 ^ 0xD7C4] = 0xFFFF2848 ^ 0xD7C4;
        kotakbaz.rain.client.util.render.font.C.e[0x4514 ^ 0x45AC] = 0x45CD ^ 0x45AC;
        kotakbaz.rain.client.util.render.font.C.e[0x679D ^ 0x67E4] = 0x67AE ^ 0x67E4;
        kotakbaz.rain.client.util.render.font.C.e[0x7823 ^ 0x7876] = 0x7817 ^ 0x7876;
        kotakbaz.rain.client.util.render.font.C.e[0xF484 ^ 0xF46C] = 0xFFFF0BCA ^ 0xF46C;
        kotakbaz.rain.client.util.render.font.C.e[0x1924 ^ 0x193C] = 0xFFFFE682 ^ 0x193C;
        kotakbaz.rain.client.util.render.font.C.e[0xF1DB ^ 0xF1A1] = 0xF1ED ^ 0xF1A1;
        kotakbaz.rain.client.util.render.font.C.e[0x8322 ^ 0x831F] = 0x837C ^ 0x831F;
        kotakbaz.rain.client.util.render.font.C.e[0x1887 ^ 0x18B8] = 0xFFFFE7F1 ^ 0x18B8;
        kotakbaz.rain.client.util.render.font.C.e[0xD6C4 ^ 0xD798] = 0xD799 ^ 0xD798;
        kotakbaz.rain.client.util.render.font.C.e[0xFC9F ^ 0xFC7B] = 0xFFFF03C5 ^ 0xFC7B;
        kotakbaz.rain.client.util.render.font.C.e[0xA7CC ^ 0xA6F7] = 0xA6F5 ^ 0xA6F7;
        kotakbaz.rain.client.util.render.font.C.e[0x23E2 ^ 0x22AB] = 0xFFFFDD2C ^ 0x22AB;
        kotakbaz.rain.client.util.render.font.C.e[0xD508 ^ 0xD443] = 0xD406 ^ 0xD443;
        kotakbaz.rain.client.util.render.font.C.e[0xF6BB ^ 0xF6B3] = 0xF689 ^ 0xF6B3;
        kotakbaz.rain.client.util.render.font.C.e[0x1DB6 ^ 0x1D6C] = 0x1D68 ^ 0x1D6C;
        kotakbaz.rain.client.util.render.font.C.e[0x69F8 ^ 0x69F6] = 0x69AC ^ 0x69F6;
        kotakbaz.rain.client.util.render.font.C.e[0x9D73 ^ 0x9D0F] = 0x9D47 ^ 0x9D0F;
        kotakbaz.rain.client.util.render.font.C.e[0xBA69 ^ 0xBAA5] = 0xFFFF454D ^ 0xBAA5;
        kotakbaz.rain.client.util.render.font.C.e[0x125F ^ 0x1369] = 0xFFFFEC9E ^ 0x1369;
        kotakbaz.rain.client.util.render.font.C.e[0xF080 ^ 0xF1A2] = 0xF1A2 ^ 0xF1A2;
        kotakbaz.rain.client.util.render.font.C.e[0xD881 ^ 0xD9DB] = 0xFFFF264C ^ 0xD9DB;
        kotakbaz.rain.client.util.render.font.C.e[0x6CB7 ^ 0x6C01] = 0x6C1F ^ 0x6C01;
        kotakbaz.rain.client.util.render.font.C.e[0x26D7 ^ 0x2790] = 0xFFFFD835 ^ 0x2790;
        kotakbaz.rain.client.util.render.font.C.e[0xCE78 ^ 0xCEDA] = 0xCEC0 ^ 0xCEDA;
        kotakbaz.rain.client.util.render.font.C.e[0xA4BE ^ 0xA486] = 0xFFFF5B16 ^ 0xA486;
        kotakbaz.rain.client.util.render.font.C.e[0x9D96 ^ 0x9D3B] = 0xFFFF6299 ^ 0x9D3B;
        kotakbaz.rain.client.util.render.font.C.e[0x8968 ^ 0x8954] = 0xFFFF76DB ^ 0x8954;
        kotakbaz.rain.client.util.render.font.C.e[0xF9F3 ^ 0xF8BC] = 0xF899 ^ 0xF8BC;
        kotakbaz.rain.client.util.render.font.C.e[0xC9D6 ^ 0xC94A] = 0xFFFF3687 ^ 0xC94A;
        kotakbaz.rain.client.util.render.font.C.e[0xC5CD ^ 0xC5D0] = 0xC5FD ^ 0xC5D0;
        kotakbaz.rain.client.util.render.font.C.e[0xC989 ^ 0xC9EA] = 0xFFFF3657 ^ 0xC9EA;
        kotakbaz.rain.client.util.render.font.C.e[0x2FA0 ^ 0x2FAD] = 0x2F8F ^ 0x2FAD;
        kotakbaz.rain.client.util.render.font.C.e[0xF52B ^ 0xF55F] = 0xFFFF0ADE ^ 0xF55F;
        kotakbaz.rain.client.util.render.font.C.e[0x8B22 ^ 0x8B5A] = 0x8B7C ^ 0x8B5A;
        kotakbaz.rain.client.util.render.font.C.e[0x1922 ^ 0x18AC] = 0xDC0 ^ 0x18AC;
        kotakbaz.rain.client.util.render.font.C.e[0x43A9 ^ 0x4381] = 0x4385 ^ 0x4381;
        kotakbaz.rain.client.util.render.font.C.e[0x1581 ^ 0x15CC] = 0x15A4 ^ 0x15CC;
        kotakbaz.rain.client.util.render.font.C.e[0xE7C8 ^ 0xE6CC] = 0xE6A2 ^ 0xE6CC;
        kotakbaz.rain.client.util.render.font.C.e[0x3B9B ^ 0x3A92] = 0xFFFFC570 ^ 0x3A92;
        kotakbaz.rain.client.util.render.font.C.e[0x13AA ^ 0x13F9] = 0x13D4 ^ 0x13F9;
        kotakbaz.rain.client.util.render.font.C.e[0xC4DC ^ 0xC467] = 0xFFFF3BB9 ^ 0xC467;
        kotakbaz.rain.client.util.render.font.C.e[0x9C84 ^ 0x9DAF] = 0x9DF9 ^ 0x9DAF;
        kotakbaz.rain.client.util.render.font.C.e[0x1033F ^ 0x10217] = 0x1026F ^ 0x10217;
        kotakbaz.rain.client.util.render.font.C.e[0x64C3 ^ 0x65A1] = 0xDAFF ^ 0x65A1;
        kotakbaz.rain.client.util.render.font.C.e[0xB022 ^ 0xB103] = 0xAA3C ^ 0xB103;
        kotakbaz.rain.client.util.render.font.C.e[0x753A ^ 0x750D] = 0x753A ^ 0x750D;
        kotakbaz.rain.client.util.render.font.C.e[0xFCA0 ^ 0xFCFB] = 0xFFFF0357 ^ 0xFCFB;
        kotakbaz.rain.client.util.render.font.C.e[0xAD84 ^ 0xADC3] = 0xADAC ^ 0xADC3;
        kotakbaz.rain.client.util.render.font.C.e[0x3E86 ^ 0x3ED7] = 0x3EC0 ^ 0x3ED7;
        kotakbaz.rain.client.util.render.font.C.e[0x10092 ^ 0x10049] = 0x1006B ^ 0x10049;
        kotakbaz.rain.client.util.render.font.C.e[0x6520 ^ 0x655E] = 0xFFFF9A88 ^ 0x655E;
        kotakbaz.rain.client.util.render.font.C.e[0xEE8D ^ 0xEE49] = 0xFFFF11E2 ^ 0xEE49;
        kotakbaz.rain.client.util.render.font.C.e[0x80F0 ^ 0x81B5] = 0x81D4 ^ 0x81B5;
        kotakbaz.rain.client.util.render.font.C.e[0x108B3 ^ 0x108D9] = 0x108AB ^ 0x108D9;
        kotakbaz.rain.client.util.render.font.C.e[0x1C28 ^ 0x1C70] = 0x1C60 ^ 0x1C70;
        kotakbaz.rain.client.util.render.font.C.e[0xD027 ^ 0xD15B] = 0x1D8D1 ^ 0xD15B;
        kotakbaz.rain.client.util.render.font.C.e[0xBB19 ^ 0xBB51] = 0xFFFF44C6 ^ 0xBB51;
        kotakbaz.rain.client.util.render.font.C.e[0x7654 ^ 0x766A] = 0xFFFF89BB ^ 0x766A;
        kotakbaz.rain.client.util.render.font.C.e[0xE22E ^ 0xE245] = 0xFFFF1DA7 ^ 0xE245;
        kotakbaz.rain.client.util.render.font.C.e[0xE2B0 ^ 0xE257] = 0xFFFF1DC5 ^ 0xE257;
        kotakbaz.rain.client.util.render.font.C.e[0x5108 ^ 0x503A] = 0x5053 ^ 0x503A;
        kotakbaz.rain.client.util.render.font.C.e[0xF8DF ^ 0xF8EC] = 0xFFFF0757 ^ 0xF8EC;
        kotakbaz.rain.client.util.render.font.C.e[0xDFBE ^ 0xDF0D] = 0xDF65 ^ 0xDF0D;
        kotakbaz.rain.client.util.render.font.C.e[0x3C3B ^ 0x3CE9] = 0xFFFFC30D ^ 0x3CE9;
        kotakbaz.rain.client.util.render.font.C.e[0x3191 ^ 0x311F] = 0x310C ^ 0x311F;
        kotakbaz.rain.client.util.render.font.C.e[0x10183 ^ 0x10136] = 0x10122 ^ 0x10136;
        kotakbaz.rain.client.util.render.font.C.e[0xFBD2 ^ 0xFBF3] = 0xFFFF0444 ^ 0xFBF3;
        kotakbaz.rain.client.util.render.font.C.e[0x802F ^ 0x806E] = 0xFFFF7FFB ^ 0x806E;
        kotakbaz.rain.client.util.render.font.C.e[0x29FC ^ 0x29FE] = 0xFFFFD617 ^ 0x29FE;
        kotakbaz.rain.client.util.render.font.C.e[0x8122 ^ 0x8052] = 0x31E3 ^ 0x8052;
        kotakbaz.rain.client.util.render.font.C.e[0x7284 ^ 0x7265] = 0x72C0 ^ 0x7265;
        kotakbaz.rain.client.util.render.font.C.e[0x3DFC ^ 0x3D13] = 0xFFFFC282 ^ 0x3D13;
        kotakbaz.rain.client.util.render.font.C.e[0xEC48 ^ 0xEC86] = 0xEC91 ^ 0xEC86;
        kotakbaz.rain.client.util.render.font.C.e[0xDE8A ^ 0xDE8A] = 0xDEA1 ^ 0xDE8A;
        kotakbaz.rain.client.util.render.font.C.e[0xE584 ^ 0xE4BC] = 0xFFFF1B43 ^ 0xE4BC;
        kotakbaz.rain.client.util.render.font.C.e[0x8776 ^ 0x87F0] = 0x8799 ^ 0x87F0;
        kotakbaz.rain.client.util.render.font.C.e[0x3A49 ^ 0x3B6F] = 0x3B10 ^ 0x3B6F;
        kotakbaz.rain.client.util.render.font.C.e[0x3691 ^ 0x379E] = 0x379E ^ 0x379E;
        kotakbaz.rain.client.util.render.font.C.e[0xC946 ^ 0xC865] = 0xC85A ^ 0xC865;
        kotakbaz.rain.client.util.render.font.C.e[0xF15E ^ 0xF06D] = 0xF04B ^ 0xF06D;
        kotakbaz.rain.client.util.render.font.C.e[0x10B4 ^ 0x107F] = 0x1024 ^ 0x107F;
        kotakbaz.rain.client.util.render.font.C.e[0xA1E4 ^ 0xA134] = 0xA102 ^ 0xA134;
        kotakbaz.rain.client.util.render.font.C.e[0x8DD5 ^ 0x8DA2] = 0x8DB1 ^ 0x8DA2;
        kotakbaz.rain.client.util.render.font.C.e[0x6F56 ^ 0x6E66] = 0xFFFF91DA ^ 0x6E66;
        kotakbaz.rain.client.util.render.font.C.e[0x95A9 ^ 0x9485] = 0x941E ^ 0x9485;
        kotakbaz.rain.client.util.render.font.C.e[0x57BA ^ 0x57EA] = 0xFFFFA81A ^ 0x57EA;
        kotakbaz.rain.client.util.render.font.C.e[0xC864 ^ 0xC8AC] = 0xC8E9 ^ 0xC8AC;
        kotakbaz.rain.client.util.render.font.C.e[0xCB02 ^ 0xCB07] = 0xFFFF34CD ^ 0xCB07;
        kotakbaz.rain.client.util.render.font.C.e[0xFCA6 ^ 0xFC79] = 0xFC5B ^ 0xFC79;
        kotakbaz.rain.client.util.render.font.C.e[0x8629 ^ 0x865B] = 0xFFFF792E ^ 0x865B;
        kotakbaz.rain.client.util.render.font.C.e[0x77D5 ^ 0x7788] = 0xFFFF8811 ^ 0x7788;
        kotakbaz.rain.client.util.render.font.C.e[0x2B13 ^ 0x2BF1] = 0x2B91 ^ 0x2BF1;
        kotakbaz.rain.client.util.render.font.C.e[0x5A2B ^ 0x5AE9] = 0xFFFFA551 ^ 0x5AE9;
        kotakbaz.rain.client.util.render.font.C.e[0x16DA ^ 0x17B4] = 0x7754 ^ 0x17B4;
        kotakbaz.rain.client.util.render.font.C.e[0xBEBB ^ 0xBE4C] = 0xBE18 ^ 0xBE4C;
        kotakbaz.rain.client.util.render.font.C.e[0xB573 ^ 0xB41E] = 0xD482 ^ 0xB41E;
        kotakbaz.rain.client.util.render.font.C.e[0x5731 ^ 0x5669] = 0xFFFFA9CC ^ 0x5669;
        kotakbaz.rain.client.util.render.font.C.e[0x402B ^ 0x4134] = 0x3419 ^ 0x4134;
        kotakbaz.rain.client.util.render.font.C.e[0x47C ^ 0x496] = 0x4AC ^ 0x496;
        kotakbaz.rain.client.util.render.font.C.e[0xFAC5 ^ 0xFA99] = 0xFAA0 ^ 0xFA99;
        kotakbaz.rain.client.util.render.font.C.e[0x62BD ^ 0x62AC] = 0x62F5 ^ 0x62AC;
        kotakbaz.rain.client.util.render.font.C.e[0xF31C ^ 0xF29F] = 0xF64D ^ 0xF29F;
        kotakbaz.rain.client.util.render.font.C.e[0xBB12 ^ 0xBBB2] = 0xFFFF446A ^ 0xBBB2;
        kotakbaz.rain.client.util.render.font.C.e[0x995F ^ 0x994C] = 0x992D ^ 0x994C;
        kotakbaz.rain.client.util.render.font.C.e[0x57B7 ^ 0x570A] = 0xFFFFA8CC ^ 0x570A;
        kotakbaz.rain.client.util.render.font.C.e[0xA36 ^ 0xA2C] = 0xA65 ^ 0xA2C;
        kotakbaz.rain.client.util.render.font.C.e[0x2C67 ^ 0x2CB9] = 0x2CB2 ^ 0x2CB9;
        kotakbaz.rain.client.util.render.font.C.e[0x3DC9 ^ 0x3CBD] = 0xFC22 ^ 0x3CBD;
        kotakbaz.rain.client.util.render.font.C.e[0x8F9E ^ 0x8EEF] = 0x3F53 ^ 0x8EEF;
        kotakbaz.rain.client.util.render.font.C.e[0x13B9 ^ 0x1331] = 0x1314 ^ 0x1331;
        kotakbaz.rain.client.util.render.font.C.e[0x2F01 ^ 0x2E51] = 0xFFFFD16F ^ 0x2E51;
        kotakbaz.rain.client.util.render.font.C.e[0xF646 ^ 0xF680] = 0xF6C5 ^ 0xF680;
        kotakbaz.rain.client.util.render.font.C.e[0x4CAB ^ 0x4C8E] = 0x4CBF ^ 0x4C8E;
        kotakbaz.rain.client.util.render.font.C.e[0xA735 ^ 0xA759] = 0xFFFF588C ^ 0xA759;
        kotakbaz.rain.client.util.render.font.C.e[0xB46D ^ 0xB56B] = 0xFFFF4A82 ^ 0xB56B;
        kotakbaz.rain.client.util.render.font.C.e[0x59D ^ 0x410] = 0x117E ^ 0x410;
        kotakbaz.rain.client.util.render.font.C.e[0x97F8 ^ 0x96F5] = 0x96B9 ^ 0x96F5;
        kotakbaz.rain.client.util.render.font.C.e[0x1931 ^ 0x1930] = 0x1903 ^ 0x1930;
        kotakbaz.rain.client.util.render.font.C.e[0x3C83 ^ 0x3C6F] = 0xFFFFC3C8 ^ 0x3C6F;
        kotakbaz.rain.client.util.render.font.C.e[0x43D1 ^ 0x43FA] = 0xFFFFBC47 ^ 0x43FA;
        kotakbaz.rain.client.util.render.font.C.e[0x2791 ^ 0x26CF] = 0x26CF ^ 0x26CF;
        kotakbaz.rain.client.util.render.font.C.e[0x10AFD ^ 0x10B78] = 0x12D09 ^ 0x10B78;
        kotakbaz.rain.client.util.render.font.C.e[0xA8AD ^ 0xA875] = 0xFFFF57E7 ^ 0xA875;
        kotakbaz.rain.client.util.render.font.C.e[0x10AAF ^ 0x10BEC] = 0xFFFEF414 ^ 0x10BEC;
        kotakbaz.rain.client.util.render.font.C.e[0xFAA9 ^ 0xFB8E] = 0xFFFF0459 ^ 0xFB8E;
        kotakbaz.rain.client.util.render.font.C.e[0x4B73 ^ 0x4B38] = 0xFFFFB4C2 ^ 0x4B38;
        kotakbaz.rain.client.util.render.font.C.e[0x3C7 ^ 0x287] = 0xFFFFFD1F ^ 0x287;
        kotakbaz.rain.client.util.render.font.C.e[0x4B85 ^ 0x4A9F] = 0xEE6A ^ 0x4A9F;
        kotakbaz.rain.client.util.render.font.C.e[0xCFEA ^ 0xCF53] = 0xCF0E ^ 0xCF53;
        kotakbaz.rain.client.util.render.font.C.e[0x2D41 ^ 0x2C6C] = 0xFFFFD388 ^ 0x2C6C;
        kotakbaz.rain.client.util.render.font.C.e[0xBC67 ^ 0xBC28] = 0xBC6F ^ 0xBC28;
        kotakbaz.rain.client.util.render.font.C.e[0x3FC5 ^ 0x3FF7] = 0xFFFFC007 ^ 0x3FF7;
        kotakbaz.rain.client.util.render.font.C.e[0xD256 ^ 0xD2D7] = 0xD292 ^ 0xD2D7;
        kotakbaz.rain.client.util.render.font.C.e[0xDAE9 ^ 0xDA63] = 0xFFFF2599 ^ 0xDA63;
        kotakbaz.rain.client.util.render.font.C.e[0x3C03 ^ 0x3D75] = 0xFFFF025E ^ 0x3D75;
        kotakbaz.rain.client.util.render.font.C.e[0x82E4 ^ 0x83D8] = 0x83A2 ^ 0x83D8;
        kotakbaz.rain.client.util.render.font.C.e[0x10357 ^ 0x103FD] = 0x103A2 ^ 0x103FD;
        kotakbaz.rain.client.util.render.font.C.e[0x4E84 ^ 0x4E6F] = 0xFFFFB1D4 ^ 0x4E6F;
        kotakbaz.rain.client.util.render.font.C.e[0xB75B ^ 0xB7F8] = 0xFFFF4816 ^ 0xB7F8;
        kotakbaz.rain.client.util.render.font.C.e[0x5637 ^ 0x5602] = 0xFFFFA9C8 ^ 0x5602;
        kotakbaz.rain.client.util.render.font.C.e[0xF6F5 ^ 0xF7C2] = 0xFFFF0811 ^ 0xF7C2;
        kotakbaz.rain.client.util.render.font.C.e[0x8B27 ^ 0x8B8E] = 0x8BEB ^ 0x8B8E;
        kotakbaz.rain.client.util.render.font.C.e[0x7280 ^ 0x7237] = 0x7209 ^ 0x7237;
        kotakbaz.rain.client.util.render.font.C.e[0xD501 ^ 0xD483] = 0xFFFF2F8A ^ 0xD483;
        kotakbaz.rain.client.util.render.font.C.e[0xF27A ^ 0xF2A6] = 0xFFFF0D50 ^ 0xF2A6;
        kotakbaz.rain.client.util.render.font.C.e[0xE440 ^ 0xE469] = 0xE466 ^ 0xE469;
        kotakbaz.rain.client.util.render.font.C.e[0x7AE1 ^ 0x7A6A] = 0xFFFF8580 ^ 0x7A6A;
        kotakbaz.rain.client.util.render.font.C.e[0x105CD ^ 0x10553] = 0x1055F ^ 0x10553;
        kotakbaz.rain.client.util.render.font.C.e[0xB1E4 ^ 0xB118] = 0xFFFF4E61 ^ 0xB118;
        kotakbaz.rain.client.util.render.font.C.e[0x37A1 ^ 0x36C4] = 0x9E32 ^ 0x36C4;
        kotakbaz.rain.client.util.render.font.C.e[0x968F ^ 0x97DA] = 0x97C5 ^ 0x97DA;
        kotakbaz.rain.client.util.render.font.C.e[0x4DA4 ^ 0x4DF3] = 0xFFFFB253 ^ 0x4DF3;
        kotakbaz.rain.client.util.render.font.C.e[0x4CDD ^ 0x4CF2] = 0x4CAA ^ 0x4CF2;
        kotakbaz.rain.client.util.render.font.C.e[0x8608 ^ 0x866A] = 0x8654 ^ 0x866A;
        kotakbaz.rain.client.util.render.font.C.e[0xB719 ^ 0xB7F0] = 0xFFFF4826 ^ 0xB7F0;
        kotakbaz.rain.client.util.render.font.C.e[0x8282 ^ 0x82EB] = 0x8287 ^ 0x82EB;
        kotakbaz.rain.client.util.render.font.C.e[0xCEF9 ^ 0xCF9E] = 0x6768 ^ 0xCF9E;
        kotakbaz.rain.client.util.render.font.C.e[0x866F ^ 0x8612] = 0x863D ^ 0x8612;
        kotakbaz.rain.client.util.render.font.C.e[0xDBE4 ^ 0xDB1B] = 0xFFFF24B2 ^ 0xDB1B;
        kotakbaz.rain.client.util.render.font.C.e[0x821D ^ 0x8247] = 0xFFFF7DB6 ^ 0x8247;
        kotakbaz.rain.client.util.render.font.C.e[0x2648 ^ 0x2666] = 0x2650 ^ 0x2666;
        kotakbaz.rain.client.util.render.font.C.e[0xC44 ^ 0xC12] = 0xFFFFF3C0 ^ 0xC12;
        kotakbaz.rain.client.util.render.font.C.e[0xDDD7 ^ 0xDD79] = 0xDD64 ^ 0xDD79;
        kotakbaz.rain.client.util.render.font.C.e[0xF483 ^ 0xF478] = 0xFFFF0B9C ^ 0xF478;
        kotakbaz.rain.client.util.render.font.C.e[0xEB14 ^ 0xEB13] = 0xEB75 ^ 0xEB13;
        kotakbaz.rain.client.util.render.font.C.e[0xED27 ^ 0xEC3A] = 0x2EC2 ^ 0xEC3A;
        kotakbaz.rain.client.util.render.font.C.e[0xA206 ^ 0xA200] = 0xA2A6 ^ 0xA200;
        kotakbaz.rain.client.util.render.font.C.e[0x10405 ^ 0x1046B] = 0x1044F ^ 0x1046B;
        kotakbaz.rain.client.util.render.font.C.e[0xA0BC ^ 0xA0B6] = 0xA0C5 ^ 0xA0B6;
        kotakbaz.rain.client.util.render.font.C.e[0xC278 ^ 0xC342] = 0xFFFF3CB4 ^ 0xC342;
        kotakbaz.rain.client.util.render.font.C.e[0x84EA ^ 0x8455] = 0x847B ^ 0x8455;
        kotakbaz.rain.client.util.render.font.C.e[0xC774 ^ 0xC7DF] = 0xC74D ^ 0xC7DF;
        kotakbaz.rain.client.util.render.font.C.e[0xE1F9 ^ 0xE176] = 0xE111 ^ 0xE176;
        kotakbaz.rain.client.util.render.font.C.e[0x9B9B ^ 0x9AF4] = 0xFA68 ^ 0x9AF4;
        kotakbaz.rain.client.util.render.font.C.e[0x3400 ^ 0x34F0] = 0xFFFFCB05 ^ 0x34F0;
        kotakbaz.rain.client.util.render.font.C.e[0x9BD9 ^ 0x9AFD] = 0xFFFF6564 ^ 0x9AFD;
        kotakbaz.rain.client.util.render.font.C.e[0xACC ^ 0xAC5] = 0xFFFFF5EA ^ 0xAC5;
        kotakbaz.rain.client.util.render.font.C.e[0xE0D8 ^ 0xE1DA] = 0xE1DE ^ 0xE1DA;
        kotakbaz.rain.client.util.render.font.C.e[0x10D35 ^ 0x10DD8] = 0xFFFEF28B ^ 0x10DD8;
        kotakbaz.rain.client.util.render.font.C.e[0xED42 ^ 0xED34] = 0xFFFF12F9 ^ 0xED34;
        kotakbaz.rain.client.util.render.font.C.e[0x3CB4 ^ 0x3CA8] = 0x3CFA ^ 0x3CA8;
        kotakbaz.rain.client.util.render.font.C.e[0x49F3 ^ 0x48BB] = 0x48B9 ^ 0x48BB;
        kotakbaz.rain.client.util.render.font.C.e[0x5DEA ^ 0x5CA8] = 0x5CCD ^ 0x5CA8;
        kotakbaz.rain.client.util.render.font.C.e[0xCD4D ^ 0xCCCA] = 0xEABB ^ 0xCCCA;
        kotakbaz.rain.client.util.render.font.C.e[0xDB3F ^ 0xDB26] = 0xFFFF24C1 ^ 0xDB26;
        kotakbaz.rain.client.util.render.font.C.e[0x1623 ^ 0x173B] = 0x9AEF ^ 0x173B;
        kotakbaz.rain.client.util.render.font.C.e[0xF4C9 ^ 0xF42F] = 0xF442 ^ 0xF42F;
        kotakbaz.rain.client.util.render.font.C.e[0x60C ^ 0x6F6] = 0x69F ^ 0x6F6;
        kotakbaz.rain.client.util.render.font.C.e[0x16D6 ^ 0x17EF] = 0xFFFFE806 ^ 0x17EF;
        kotakbaz.rain.client.util.render.font.C.e[0xA7AD ^ 0xA70C] = 0xFFFF58A9 ^ 0xA70C;
        kotakbaz.rain.client.util.render.font.C.e[0xA932 ^ 0xA9E3] = 0xA9FF ^ 0xA9E3;
        kotakbaz.rain.client.util.render.font.C.e[0xDCEF ^ 0xDC9E] = 0xDC93 ^ 0xDC9E;
        kotakbaz.rain.client.util.render.font.C.e[0x9883 ^ 0x9876] = 0xFFFF6796 ^ 0x9876;
        kotakbaz.rain.client.util.render.font.C.e[0x743D ^ 0x74BE] = 0x74E2 ^ 0x74BE;
        kotakbaz.rain.client.util.render.font.C.e[0x2FC1 ^ 0x2E47] = 0xFFFFF7FC ^ 0x2E47;
        kotakbaz.rain.client.util.render.font.C.e[0xAEC4 ^ 0xAEA9] = 0xAEF8 ^ 0xAEA9;
        kotakbaz.rain.client.util.render.font.C.e[0xA508 ^ 0xA54B] = 0xA54B ^ 0xA54B;
        kotakbaz.rain.client.util.render.font.C.e[0x8308 ^ 0x8213] = 0xA504 ^ 0x8213;
        kotakbaz.rain.client.util.render.font.C.e[0x58CA ^ 0x58F3] = 0xFFFFA714 ^ 0x58F3;
        kotakbaz.rain.client.util.render.font.C.e[0xBCE7 ^ 0xBC82] = 0xFFFF4332 ^ 0xBC82;
        kotakbaz.rain.client.util.render.font.C.e[0x33B6 ^ 0x3322] = 0x3340 ^ 0x3322;
        kotakbaz.rain.client.util.render.font.C.e[0xD9AD ^ 0xD97B] = 0xD908 ^ 0xD97B;
        kotakbaz.rain.client.util.render.font.C.e[0x4B51 ^ 0x4B90] = 0xFFFFB46C ^ 0x4B90;
        kotakbaz.rain.client.util.render.font.C.e[0x9D99 ^ 0x9D8F] = 0x9DD7 ^ 0x9D8F;
        kotakbaz.rain.client.util.render.font.C.e[0x2954 ^ 0x2865] = 0xFFFFD796 ^ 0x2865;
        kotakbaz.rain.client.util.render.font.C.e[0x67C ^ 0x714] = 0xCADE ^ 0x714;
        kotakbaz.rain.client.util.render.font.C.e[0x2CF ^ 0x27B] = 0xFFFFFD8D ^ 0x27B;
        kotakbaz.rain.client.util.render.font.C.e[0x2962 ^ 0x2966] = 0x2927 ^ 0x2966;
        kotakbaz.rain.client.util.render.font.C.e[0x631B ^ 0x627B] = 0x627A ^ 0x627B;
        kotakbaz.rain.client.util.render.font.C.e[0x93B9 ^ 0x93C2] = 0x9385 ^ 0x93C2;
        kotakbaz.rain.client.util.render.font.C.e[0xF155 ^ 0xF02F] = 0xFFFF10D0 ^ 0xF02F;
        kotakbaz.rain.client.util.render.font.C.e[0xE048 ^ 0xE1C3] = 0xD114 ^ 0xE1C3;
        kotakbaz.rain.client.util.render.font.C.e[0x10C77 ^ 0x10CE8] = 0x10CBB ^ 0x10CE8;
        kotakbaz.rain.client.util.render.font.C.e[0x9D02 ^ 0x9C53] = 0xFFFF63F8 ^ 0x9C53;
        kotakbaz.rain.client.util.render.font.C.e[0x5DD9 ^ 0x5D39] = 0xFFFFA2EC ^ 0x5D39;
        kotakbaz.rain.client.util.render.font.C.e[0xA4FC ^ 0xA4E3] = 0xFFFF5B5D ^ 0xA4E3;
        kotakbaz.rain.client.util.render.font.C.e[0xEE7A ^ 0xEE8B] = 0xEEDA ^ 0xEE8B;
        kotakbaz.rain.client.util.render.font.C.e[0xB793 ^ 0xB770] = 0xB735 ^ 0xB770;
        kotakbaz.rain.client.util.render.font.C.e[0x4E3D ^ 0x4ECF] = 0x4EA9 ^ 0x4ECF;
        kotakbaz.rain.client.util.render.font.C.e[0xB48D ^ 0xB45A] = 0xB44C ^ 0xB45A;
        kotakbaz.rain.client.util.render.font.C.e[0x2767 ^ 0x279A] = 0xFFFFD86E ^ 0x279A;
        kotakbaz.rain.client.util.render.font.C.e[0xA203 ^ 0xA224] = 0xA231 ^ 0xA224;
        kotakbaz.rain.client.util.render.font.C.e[0x9BC9 ^ 0x9B87] = 0x9BD2 ^ 0x9B87;
        kotakbaz.rain.client.util.render.font.C.e[0x2D7D ^ 0x2C7A] = 0x2C10 ^ 0x2C7A;
        kotakbaz.rain.client.util.render.font.C.e[0xFF20 ^ 0xFF8C] = 0xFFB8 ^ 0xFF8C;
        kotakbaz.rain.client.util.render.font.C.e[0x6BB7 ^ 0x6AC9] = 0x16339 ^ 0x6AC9;
        kotakbaz.rain.client.util.render.font.C.e[0x77CA ^ 0x77C5] = 0xFFFF880F ^ 0x77C5;
        kotakbaz.rain.client.util.render.font.C.e[0xB267 ^ 0xB279] = 0xFFFF4DCA ^ 0xB279;
        kotakbaz.rain.client.util.render.font.C.e[0xB5D9 ^ 0xB48B] = 0xB4FE ^ 0xB48B;
        kotakbaz.rain.client.util.render.font.C.e[0x2B69 ^ 0x2A56] = 0x2A41 ^ 0x2A56;
        kotakbaz.rain.client.util.render.font.C.e[0x6ED1 ^ 0x6E47] = 0x6E4E ^ 0x6E47;
        kotakbaz.rain.client.util.render.font.C.e[0xF1FC ^ 0xF194] = 0xFFFF0E30 ^ 0xF194;
        kotakbaz.rain.client.util.render.font.C.e[0x908D ^ 0x904A] = 0x9048 ^ 0x904A;
        kotakbaz.rain.client.util.render.font.C.e[0x9888 ^ 0x9883] = 0xFFFF6701 ^ 0x9883;
        kotakbaz.rain.client.util.render.font.C.e[0x88A2 ^ 0x8884] = 0xFFFF7748 ^ 0x8884;
        kotakbaz.rain.client.util.render.font.C.e[0xA15B ^ 0xA017] = 0xA02B ^ 0xA017;
        kotakbaz.rain.client.util.render.font.C.e[0x1C43 ^ 0x1CBA] = 0x1C3F ^ 0x1CBA;
        kotakbaz.rain.client.util.render.font.C.e[0x9B96 ^ 0x9A1E] = 0xAAC2 ^ 0x9A1E;
        kotakbaz.rain.client.util.render.font.C.e[0xC572 ^ 0xC5CC] = 0xC5AA ^ 0xC5CC;
        kotakbaz.rain.client.util.render.font.C.e[0x4384 ^ 0x43A9] = 0xFFFFBC57 ^ 0x43A9;
        kotakbaz.rain.client.util.render.font.C.e[0x6FD4 ^ 0x6ECD] = 0xB478 ^ 0x6ECD;
        kotakbaz.rain.client.util.render.font.C.e[0xBBAE ^ 0xBA24] = 0x8AAB ^ 0xBA24;
        kotakbaz.rain.client.util.render.font.C.e[0xED14 ^ 0xED22] = 0xFFFF12A1 ^ 0xED22;
        kotakbaz.rain.client.util.render.font.C.e[0x3E38 ^ 0x3EAD] = 0xFFFFC139 ^ 0x3EAD;
        kotakbaz.rain.client.util.render.font.C.e[0x1133 ^ 0x11DD] = 0xFFFFEE7E ^ 0x11DD;
        kotakbaz.rain.client.util.render.font.C.e[0xAB04 ^ 0xAB1F] = 0xFFFF54A4 ^ 0xAB1F;
        kotakbaz.rain.client.util.render.font.C.e[0xFE19 ^ 0xFE9E] = 0xFE82 ^ 0xFE9E;
        kotakbaz.rain.client.util.render.font.C.e[0x1697 ^ 0x16F8] = 0xFFFFE917 ^ 0x16F8;
        kotakbaz.rain.client.util.render.font.C.e[0xC0C6 ^ 0xC0EA] = 0xFFFF3F53 ^ 0xC0EA;
        kotakbaz.rain.client.util.render.font.C.e[0xFE84 ^ 0xFFD9] = 0xFFDB ^ 0xFFD9;
        kotakbaz.rain.client.util.render.font.C.e[0x77EE ^ 0x77B1] = 0x77AC ^ 0x77B1;
        kotakbaz.rain.client.util.render.font.C.e[0x4210 ^ 0x433E] = 0x4340 ^ 0x433E;
        kotakbaz.rain.client.util.render.font.C.e[0x10BD1 ^ 0x10BF3] = 0xFFFEF464 ^ 0x10BF3;
        kotakbaz.rain.client.util.render.font.C.e[0xF5AD ^ 0xF4E7] = 0xF4CE ^ 0xF4E7;
        kotakbaz.rain.client.util.render.font.C.e[0xF885 ^ 0xF8A1] = 0xFFFF070C ^ 0xF8A1;
        kotakbaz.rain.client.util.render.font.C.e[0x5347 ^ 0x5255] = 0x5257 ^ 0x5255;
        kotakbaz.rain.client.util.render.font.C.e[0x6EB3 ^ 0x6FC6] = 0xAF5E ^ 0x6FC6;
        kotakbaz.rain.client.util.render.font.C.e[0x1079D ^ 0x1078D] = 0x107EC ^ 0x1078D;
        kotakbaz.rain.client.util.render.font.C.e[0x3C36 ^ 0x3D27] = 0x3D27 ^ 0x3D27;
        kotakbaz.rain.client.util.render.font.C.e[0x881C ^ 0x8878] = 0x885E ^ 0x8878;
        kotakbaz.rain.client.util.render.font.C.e[0x3D7C ^ 0x3DCC] = 0x3DC3 ^ 0x3DCC;
    }
}

