/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.draggable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.draggable.DraggableManager;
import kotakbaz.rain.client.draggable.b;
import kotakbaz.rain.client.draggable.c;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b\u00a2\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u000f\u0010\u0003J\r\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0003R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u00128\u0006\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001e"}, d2={"Lkotakbaz/rain/client/draggable/DraggableManager;", "", "<init>", "()V", "Lkotakbaz/rain/module/Module;", "module", "", "name", "", "x", "y", "Lkotakbaz/rain/client/draggable/Draggable;", "create", "(Lkotakbaz/rain/module/Module;Ljava/lang/String;FF)Lkotakbaz/rain/client/draggable/Draggable;", "", "save", "load", "ensureParentDirectory", "Ljava/util/LinkedHashMap;", "draggables", "Ljava/util/LinkedHashMap;", "getDraggables", "()Ljava/util/LinkedHashMap;", "Ljava/io/File;", "configFile", "Ljava/io/File;", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "Companion", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nDraggableManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DraggableManager.kt\nkotakbaz/rain/client/draggable/DraggableManager\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,76:1\n221#2,2:77\n*S KotlinDebug\n*F\n+ 1 DraggableManager.kt\nkotakbaz/rain/client/draggable/DraggableManager\n*L\n54#1:77,2\n*E\n"})
public final class D {
    @NotNull
    public static final DraggableManager a;
    @NotNull
    private final LinkedHashMap<String, c> A = new LinkedHashMap();
    @NotNull
    private final File b;
    @NotNull
    private final Gson B;
    @JvmField
    @NotNull
    public static final D INSTANCE;
    private static Object[] c;
    private static Object d;
    private static Object[] D;
    private static Object[] C;
    private static Object[] e;
    public static int[] E;

    private D() {
        int n2 = E[0];
        n2 += E[1];
        int n3 = E[3];
        n3 ^= E[4];
        int n4 = E[6];
        n4 ^= E[7];
        this.b = new File(System.getProperty((String)c[n2 += E[2]]), (String)c[n3 -= E[5]] + (String)c[n4 ^= E[8]]);
        Gson gson = new GsonBuilder().setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create();
        int n5 = E[9];
        n5 += E[10];
        Intrinsics.checkNotNullExpressionValue(gson, (String)c[n5 -= E[11]]);
        this.B = gson;
    }

    @NotNull
    public final LinkedHashMap<String, c> getDraggables() {
        return this.A;
    }

    @NotNull
    public final c create(@NotNull Module module, @NotNull String name, float x2, float y) {
        int n2 = E[12];
        n2 -= E[13];
        Intrinsics.checkNotNullParameter(module, (String)c[n2 ^= E[14]]);
        int n3 = E[15];
        n3 ^= E[16];
        Intrinsics.checkNotNullParameter(name, (String)c[n3 += E[17]]);
        c c2 = new c(module, name, x2, y);
        ((Map)this.A).put(name, c2);
        return c2;
    }

    public final void save() {
        this.ensureParentDirectory();
        if (this.b.toPath().getFileSystem().isOpen()) {
            try {
                int n2 = E[18];
                n2 += E[19];
                Path path = Files.writeString(this.b.toPath(), (CharSequence)this.B.toJson(this.A), new OpenOption[n2 += E[20]]);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                Unit unit = Unit.INSTANCE;
            }
        } else {
            int n3 = E[21];
            n3 += E[22];
            int n4 = E[24];
            n4 += E[25];
            System.err.println((String)c[n3 ^= E[23]] + (String)c[n4 ^= E[26]]);
        }
    }

    public final void load() {
        long l2 = -8630796393562838828L;
        if (!this.b.exists()) {
            this.ensureParentDirectory();
            return;
        }
        try {
            Map map;
            String string = Files.readString(this.b.toPath());
            Map map2 = (Map)this.B.fromJson(string, new b().getType());
            if (map2 == null) {
                return;
            }
            Map map3 = map = map2;
            long l3 = l2;
            int n2 = E[27];
            n2 ^= E[28];
            l2 = l3 ^ (0L ^ l3) & -1L << (n2 ^= E[29]);
            Iterator iterator2 = map3.entrySet().iterator();
            while (iterator2.hasNext()) {
                c c2;
                Map.Entry entry;
                Map.Entry entry2 = entry = iterator2.next();
                long l4 = l2;
                int n3 = E[30];
                n3 -= E[31];
                l2 = l4 ^ (0L ^ l4) & -1L >>> (n3 ^= E[32]);
                String string2 = (String)entry2.getKey();
                c c3 = (c)entry2.getValue();
                if (this.A.get(string2) == null) continue;
                c2.snapTo(c3.getX(), c3.getY());
                ((Map)this.A).put(string2, c2);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private final void ensureParentDirectory() {
        File file = this.b.getParentFile();
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
    }

    static {
        kotakbaz.rain.client.draggable.D.b();
        long l2 = 8244420188484974755L;
        long l3 = -7350382810200055587L;
        long l4 = 6465464252402458828L;
        long l5 = 1126400990076205569L;
        long l6 = -4261867921371536056L;
        long l7 = 5328889466421517941L;
        long l8 = -2182077465904029817L;
        long l9 = -6264226156262446341L;
        long l10 = 2581316979332152893L;
        long l11 = -5610786910047649637L;
        long l12 = 2457911306560442416L;
        long l13 = 7301596011272404370L;
        long l14 = -3490598355841783726L;
        long l15 = -3618545901610413685L;
        int n2 = E[33];
        n2 += E[34];
        c = new Object[n2 ^= E[35]];
        long l16 = l15;
        int n3 = E[36];
        n3 -= E[37];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += E[38]);
        Object[] objectArray = new Object[E[39]];
        objectArray[kotakbaz.rain.client.draggable.D.E[40]] = C;
        objectArray[kotakbaz.rain.client.draggable.D.E[41]] = E[42];
        int n4 = E[43];
        Object object = kotakbaz.rain.client.draggable.D.A()[E[44]];
        if (object == null) {
            char[] cArray = "\u64ce\u64d3\u64fa\u64a2\u64e7\u64e4\u64ef\u64df\u64d0\u64f9\u64ee\u64e2\u64d2\u64f5\u64ee\u64d6\u64e5\u64f9\u64dd\u64fe\u64ec\u64ff\u64fd\u64f0\u64c2\u64f0\u64c0\u64a0\u641e\u64a4\u64ff\u64f8\u64ff\u64fd\u64d5\u64fe\u64f5\u64e1\u64df\u64ec\u64fd\u64c1\u64aa\u64a2\u64c5\u64fb\u64f5\u64c7\u64d8\u64dc\u64c7\u64f1\u64fd\u64af\u641b\u64d6\u64a0\u64aa\u64e4\u64e1\u64dd\u64ad\u64d5\u64ed\u64f6\u64fc\u64e0\u64ce\u64dc\u64dc\u64d0\u64ee\u64ff\u64d6\u641b\u64e2\u64d8\u64f6\u64d9\u64a4\u64ed\u64a3\u64cd\u64c5\u64c1\u64aa\u64ad\u64c5\u64d1\u64d3\u64a4\u64f3\u64c0\u64d0\u64ac\u64f6\u64ca\u64f9\u64d0\u64e7\u64fb\u64d2\u64f3\u64fb\u64e3\u64d9\u64e5\u64cd\u64d6\u64db\u64f2\u64ce\u64ac\u64cc\u64ff\u64c3\u64ca\u64aa\u64c5\u641b\u64ed\u64a0\u64c0\u641b\u64d1\u64a4\u64e7\u64ac\u64d6\u64df\u64cc\u64d1\u64f6\u64e3\u64ee\u64ca\u641e\u64d2\u64d1\u641e\u64d5\u64cd\u64cf\u64c5\u64a0\u64f2\u64fd\u64a7\u64c2\u64de\u64f8\u64cc\u64c5\u64a3\u64fa\u64d5\u64de\u64f1\u64c2\u64e0\u64f9\u64ec\u64a1\u64e1\u64a5\u64f1\u64a1\u64db\u64ed\u64a3\u64ec\u64e9".toCharArray();
            for (int i2 = E[45]; i2 < E[46]; ++i2) {
                int n5 = cArray[i2];
                n5 ^= E[47];
                n5 += E[48];
                n5 += E[49];
                n5 += E[50];
                n5 += E[51];
                n5 += E[52];
                n5 -= E[53];
                n5 ^= E[54];
                n5 ^= E[55];
                cArray[i2] = (char)(n5 += E[56]);
            }
            object = kotakbaz.rain.client.draggable.D.A()[kotakbaz.rain.client.draggable.D.E[57]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.draggable.D.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = E[58];
        n6 += E[59];
        l6 = l17 ^ (0x6F00000000L ^ l17) & -1L << (n6 -= E[60]);
        long l18 = l13;
        int n7 = E[61];
        n7 += E[62];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += E[63]);
        while (true) {
            int n8 = E[64];
            n8 += E[65];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= E[66]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = E[67];
            n10 += E[68];
            int n11 = E[70];
            n11 ^= E[71];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= E[69])) & -1L >>> (n11 ^= E[72]);
            long l20 = l9;
            int n12 = E[73];
            n12 -= E[74];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += E[75]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = E[76];
            n14 ^= E[77];
            int n15 = E[79];
            n15 ^= E[80];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= E[78])) & -1L >>> (n15 -= E[81]);
            int n16 = E[82];
            n16 ^= E[83];
            long l22 = l10;
            int n17 = E[85];
            n17 ^= E[86];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= E[84]) ^ l22) & -1L << (n17 ^= E[87]);
            int n18 = E[88];
            n18 += E[89];
            n18 -= E[90];
            int n19 = E[91];
            n19 += E[92];
            long l23 = l12;
            int n20 = E[94];
            n20 ^= E[95];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= E[93]))) ^ l23) & -1L >>> (n20 ^= E[96]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = E[97];
            n21 -= E[98];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += E[99]);
            while (true) {
                int n22 = E[100];
                n22 -= E[101];
                if ((int)(l14 >>> (n22 -= E[102])) >= (int)l12) break;
                int n23 = E[103];
                n23 ^= E[104];
                int n24 = E[106];
                n24 ^= E[107];
                cArray2[(int)(l14 >>> (n23 -= kotakbaz.rain.client.draggable.D.E[105]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= E[108]))];
                l14 += 0x100000000L;
            }
            int n25 = E[109];
            n25 -= E[110];
            int n26 = (int)(l15 >>> (n25 ^= E[111]));
            l15 += 0x100000000L;
            kotakbaz.rain.client.draggable.D.c[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = E[112];
            n27 ^= E[113];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= E[114]);
        }
        a = new DraggableManager(null);
        INSTANCE = new D();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[E[115]];
        String string = (String)object[E[116]];
        object = object[E[117]];
        Object[] objectArray = D;
        if (D == null) {
            objectArray = D = new Object[E[118]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[E[119]];
                C = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[E[121] ^ E[122]];
                byArray[kotakbaz.rain.client.draggable.D.E[123] ^ kotakbaz.rain.client.draggable.D.E[124]] = E[125] ^ E[126];
                byArray[kotakbaz.rain.client.draggable.D.E[127] ^ kotakbaz.rain.client.draggable.D.E[128]] = E[129] ^ E[130];
                byArray[kotakbaz.rain.client.draggable.D.E[131] ^ kotakbaz.rain.client.draggable.D.E[132]] = E[133] ^ E[134];
                byArray[kotakbaz.rain.client.draggable.D.E[135] ^ kotakbaz.rain.client.draggable.D.E[136]] = E[137] ^ E[138];
                byArray[kotakbaz.rain.client.draggable.D.E[139] ^ kotakbaz.rain.client.draggable.D.E[140]] = E[141] ^ E[142];
                byArray[kotakbaz.rain.client.draggable.D.E[143] ^ kotakbaz.rain.client.draggable.D.E[144]] = E[145] ^ E[146];
                byArray[kotakbaz.rain.client.draggable.D.E[147] ^ kotakbaz.rain.client.draggable.D.E[148]] = E[149] ^ E[150];
                byArray[kotakbaz.rain.client.draggable.D.E[151] ^ kotakbaz.rain.client.draggable.D.E[152]] = E[153] ^ E[154];
                byArray[kotakbaz.rain.client.draggable.D.E[155] ^ kotakbaz.rain.client.draggable.D.E[156]] = E[157] ^ E[158];
                byArray[kotakbaz.rain.client.draggable.D.E[159] ^ kotakbaz.rain.client.draggable.D.E[160]] = E[161] ^ E[162];
                byArray[kotakbaz.rain.client.draggable.D.E[163] ^ kotakbaz.rain.client.draggable.D.E[164]] = E[165] ^ E[166];
                byArray[kotakbaz.rain.client.draggable.D.E[167] ^ kotakbaz.rain.client.draggable.D.E[168]] = E[169] ^ E[170];
                byArray[kotakbaz.rain.client.draggable.D.E[171] ^ kotakbaz.rain.client.draggable.D.E[172]] = E[173] ^ E[174];
                byArray[kotakbaz.rain.client.draggable.D.E[175] ^ kotakbaz.rain.client.draggable.D.E[176]] = E[177] ^ E[178];
                byArray[kotakbaz.rain.client.draggable.D.E[179] ^ kotakbaz.rain.client.draggable.D.E[180]] = E[181] ^ E[182];
                byArray[kotakbaz.rain.client.draggable.D.E[183] ^ kotakbaz.rain.client.draggable.D.E[184]] = E[185] ^ E[186];
                objectArray2[kotakbaz.rain.client.draggable.D.E[120]] = byArray;
            }
            byte[] byArray = (byte[])object3[E[187]];
            if (d == null) {
                byte[] byArray2 = new byte[E[188] ^ E[189]];
                byArray2[kotakbaz.rain.client.draggable.D.E[190] ^ kotakbaz.rain.client.draggable.D.E[191]] = E[192] ^ E[193];
                byArray2[kotakbaz.rain.client.draggable.D.E[194] ^ kotakbaz.rain.client.draggable.D.E[195]] = E[196] ^ E[197];
                byArray2[kotakbaz.rain.client.draggable.D.E[198] ^ kotakbaz.rain.client.draggable.D.E[199]] = E[200] ^ E[201];
                byArray2[kotakbaz.rain.client.draggable.D.E[202] ^ kotakbaz.rain.client.draggable.D.E[203]] = E[204] ^ E[205];
                byArray2[kotakbaz.rain.client.draggable.D.E[206] ^ kotakbaz.rain.client.draggable.D.E[207]] = E[208] ^ E[209];
                byArray2[kotakbaz.rain.client.draggable.D.E[210] ^ kotakbaz.rain.client.draggable.D.E[211]] = E[212] ^ E[213];
                byArray2[kotakbaz.rain.client.draggable.D.E[214] ^ kotakbaz.rain.client.draggable.D.E[215]] = E[216] ^ E[217];
                byArray2[kotakbaz.rain.client.draggable.D.E[218] ^ kotakbaz.rain.client.draggable.D.E[219]] = E[220] ^ E[221];
                byArray2[kotakbaz.rain.client.draggable.D.E[222] ^ kotakbaz.rain.client.draggable.D.E[223]] = E[224] ^ E[225];
                byArray2[kotakbaz.rain.client.draggable.D.E[226] ^ kotakbaz.rain.client.draggable.D.E[227]] = E[228] ^ E[229];
                byArray2[kotakbaz.rain.client.draggable.D.E[230] ^ kotakbaz.rain.client.draggable.D.E[231]] = E[232] ^ E[233];
                byArray2[kotakbaz.rain.client.draggable.D.E[234] ^ kotakbaz.rain.client.draggable.D.E[235]] = E[236] ^ E[237];
                byArray2[kotakbaz.rain.client.draggable.D.E[238] ^ kotakbaz.rain.client.draggable.D.E[239]] = E[240] ^ E[241];
                byArray2[kotakbaz.rain.client.draggable.D.E[242] ^ kotakbaz.rain.client.draggable.D.E[243]] = E[244] ^ E[245];
                byArray2[kotakbaz.rain.client.draggable.D.E[246] ^ kotakbaz.rain.client.draggable.D.E[247]] = E[248] ^ E[249];
                byArray2[kotakbaz.rain.client.draggable.D.E[250] ^ kotakbaz.rain.client.draggable.D.E[251]] = E[252] ^ E[253];
                byArray2[kotakbaz.rain.client.draggable.D.E[254] ^ kotakbaz.rain.client.draggable.D.E[255]] = E[256] ^ E[257];
                byArray2[kotakbaz.rain.client.draggable.D.E[258] ^ kotakbaz.rain.client.draggable.D.E[259]] = E[260] ^ E[261];
                byArray2[kotakbaz.rain.client.draggable.D.E[262] ^ kotakbaz.rain.client.draggable.D.E[263]] = E[264] ^ E[265];
                byArray2[kotakbaz.rain.client.draggable.D.E[266] ^ kotakbaz.rain.client.draggable.D.E[267]] = E[268] ^ E[269];
                byArray2[kotakbaz.rain.client.draggable.D.E[270] ^ kotakbaz.rain.client.draggable.D.E[271]] = E[272] ^ E[273];
                byArray2[kotakbaz.rain.client.draggable.D.E[274] ^ kotakbaz.rain.client.draggable.D.E[275]] = E[276] ^ E[277];
                byArray2[kotakbaz.rain.client.draggable.D.E[278] ^ kotakbaz.rain.client.draggable.D.E[279]] = E[280] ^ E[281];
                byArray2[kotakbaz.rain.client.draggable.D.E[282] ^ kotakbaz.rain.client.draggable.D.E[283]] = E[284] ^ E[285];
                byArray2[kotakbaz.rain.client.draggable.D.E[286] ^ kotakbaz.rain.client.draggable.D.E[287]] = E[288] ^ E[289];
                byArray2[kotakbaz.rain.client.draggable.D.E[290] ^ kotakbaz.rain.client.draggable.D.E[291]] = E[292] ^ E[293];
                byArray2[kotakbaz.rain.client.draggable.D.E[294] ^ kotakbaz.rain.client.draggable.D.E[295]] = E[296] ^ E[297];
                byArray2[kotakbaz.rain.client.draggable.D.E[298] ^ kotakbaz.rain.client.draggable.D.E[299]] = E[300] ^ E[301];
                byArray2[kotakbaz.rain.client.draggable.D.E[302] ^ kotakbaz.rain.client.draggable.D.E[303]] = E[304] ^ E[305];
                byArray2[kotakbaz.rain.client.draggable.D.E[306] ^ kotakbaz.rain.client.draggable.D.E[307]] = E[308] ^ E[309];
                byArray2[kotakbaz.rain.client.draggable.D.E[310] ^ kotakbaz.rain.client.draggable.D.E[311]] = E[312] ^ E[313];
                byArray2[kotakbaz.rain.client.draggable.D.E[314] ^ kotakbaz.rain.client.draggable.D.E[315]] = E[316] ^ E[317];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, E[318], byArray3, E[319], byArray.length);
                System.arraycopy(byArray2, E[320], byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.draggable.D.A()[E[321]];
                if (object4 == null) {
                    char[] cArray = "\ua457\ua16d\ua214\ua16b\ua231\ua23d\ua460\ua48e\ua47b\ua48f\ua16f\ua132\ua486\ua48c\ua45c\ua16f\ua166\ua236".toCharArray();
                    for (int i2 = E[322]; i2 < E[323]; ++i2) {
                        int n3 = cArray[i2];
                        n3 -= E[324];
                        n3 -= E[325];
                        n3 ^= E[326];
                        n3 -= E[327];
                        n3 ^= E[328];
                        n3 ^= E[329];
                        n3 ^= E[330];
                        n3 -= E[331];
                        n3 ^= E[332];
                        n3 += E[333];
                        cArray[i2] = (char)(n3 += E[334]);
                    }
                    object4 = kotakbaz.rain.client.draggable.D.A()[kotakbaz.rain.client.draggable.D.E[335]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[E[336]];
                byArray4[kotakbaz.rain.client.draggable.D.E[337]] = E[338];
                byArray4[kotakbaz.rain.client.draggable.D.E[339]] = E[340];
                byArray4[kotakbaz.rain.client.draggable.D.E[341]] = E[342];
                byArray4[kotakbaz.rain.client.draggable.D.E[343]] = E[344];
                byArray4[kotakbaz.rain.client.draggable.D.E[345]] = E[346];
                byArray4[kotakbaz.rain.client.draggable.D.E[347]] = E[348];
                byArray4[kotakbaz.rain.client.draggable.D.E[349]] = E[350];
                byArray4[kotakbaz.rain.client.draggable.D.E[351]] = E[352];
                byArray4[kotakbaz.rain.client.draggable.D.E[353]] = E[354];
                byArray4[kotakbaz.rain.client.draggable.D.E[355]] = E[356];
                byArray4[kotakbaz.rain.client.draggable.D.E[357]] = E[358];
                byArray4[kotakbaz.rain.client.draggable.D.E[359]] = E[360];
                byArray4[kotakbaz.rain.client.draggable.D.E[361]] = E[362];
                byArray4[kotakbaz.rain.client.draggable.D.E[363]] = E[364];
                byArray4[kotakbaz.rain.client.draggable.D.E[365]] = E[366];
                byArray4[kotakbaz.rain.client.draggable.D.E[367]] = E[368];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, E[369], E[370]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.draggable.D.A()[E[371]];
                if (object5 == null) {
                    char[] cArray = "\u0895\u0891\u08e3".toCharArray();
                    for (int i3 = E[372]; i3 < E[373]; ++i3) {
                        int n4 = cArray[i3];
                        n4 ^= E[374];
                        n4 ^= E[375];
                        n4 += E[376];
                        n4 -= E[377];
                        n4 ^= E[378];
                        n4 -= E[379];
                        n4 -= E[380];
                        n4 += E[381];
                        n4 += E[382];
                        n4 -= E[383];
                        n4 ^= E[384];
                        cArray[i3] = (char)(n4 += E[385]);
                    }
                    object5 = kotakbaz.rain.client.draggable.D.A()[kotakbaz.rain.client.draggable.D.E[386]] = new String(cArray);
                }
                d = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, E[387], E[388]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, E[389], byArray6.length);
            Object object6 = kotakbaz.rain.client.draggable.D.A()[E[390]];
            if (object6 == null) {
                char[] cArray = "\u5a88\u5aa4\u5c12\u5ac6\u5aa2\u5aa7\u5aa2\u5ac6\u5ab5\u5aba\u5aa2\u5c12\u5ab4\u5ab5\u5ce8\u5c01\u5c01\u5c00\u5c1b\u5c0e".toCharArray();
                for (int i4 = E[391]; i4 < E[392]; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= E[393];
                    n5 += E[394];
                    n5 ^= E[395];
                    n5 += E[396];
                    n5 ^= E[397];
                    n5 += E[398];
                    n5 -= E[399];
                    n5 -= 64030;
                    n5 ^= 0xF28E;
                    cArray[i4] = (char)(n5 -= 24750);
                }
                object6 = kotakbaz.rain.client.draggable.D.A()[3] = new String(cArray);
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
        E = new int[0x4940 ^ 0x48D0];
        kotakbaz.rain.client.draggable.D.E[0x372E ^ 0x3655] = 0xE55C ^ 0x3655;
        kotakbaz.rain.client.draggable.D.E[0x9C9A ^ 0x9DC2] = 0xFFFF6216 ^ 0x9DC2;
        kotakbaz.rain.client.draggable.D.E[0xFA3 ^ 0xF00] = 0xF99D ^ 0xF00;
        kotakbaz.rain.client.draggable.D.E[0xF352 ^ 0xF215] = 0x4327 ^ 0xF215;
        kotakbaz.rain.client.draggable.D.E[0x47CD ^ 0x46F0] = 0xD088 ^ 0x46F0;
        kotakbaz.rain.client.draggable.D.E[0xC594 ^ 0xC5B8] = 0xC5B8 ^ 0xC5B8;
        kotakbaz.rain.client.draggable.D.E[0x6BA3 ^ 0x6AAB] = 0xFFFFC246 ^ 0x6AAB;
        kotakbaz.rain.client.draggable.D.E[0x4DDF ^ 0x4CA6] = 0x1450 ^ 0x4CA6;
        kotakbaz.rain.client.draggable.D.E[0xB09D ^ 0xB00D] = 0x3C3A ^ 0xB00D;
        kotakbaz.rain.client.draggable.D.E[0xF5C3 ^ 0xF58D] = 0xF583 ^ 0xF58D;
        kotakbaz.rain.client.draggable.D.E[0x3796 ^ 0x3767] = 0xA616 ^ 0x3767;
        kotakbaz.rain.client.draggable.D.E[0x8726 ^ 0x86A1] = 0x86A1 ^ 0x86A1;
        kotakbaz.rain.client.draggable.D.E[0x1563 ^ 0x15C2] = 0xFFFF088F ^ 0x15C2;
        kotakbaz.rain.client.draggable.D.E[0x2A6B ^ 0x2B09] = 0x2B46 ^ 0x2B09;
        kotakbaz.rain.client.draggable.D.E[0x7BDD ^ 0x7BBA] = 0xFFFF8404 ^ 0x7BBA;
        kotakbaz.rain.client.draggable.D.E[0xB56C ^ 0xB5B5] = 0xE0D9 ^ 0xB5B5;
        kotakbaz.rain.client.draggable.D.E[0xAFB9 ^ 0xAFA2] = 0xAFA5 ^ 0xAFA2;
        kotakbaz.rain.client.draggable.D.E[0xBC24 ^ 0xBD12] = 0xD7FB ^ 0xBD12;
        kotakbaz.rain.client.draggable.D.E[0x62C0 ^ 0x623F] = 0x9408 ^ 0x623F;
        kotakbaz.rain.client.draggable.D.E[0x97E8 ^ 0x9704] = 0x4A73 ^ 0x9704;
        kotakbaz.rain.client.draggable.D.E[0x7A3F ^ 0x7BB4] = 0x57DD ^ 0x7BB4;
        kotakbaz.rain.client.draggable.D.E[0x4809 ^ 0x48AB] = 0xAA5C ^ 0x48AB;
        kotakbaz.rain.client.draggable.D.E[0xB142 ^ 0xB047] = 0x9286 ^ 0xB047;
        kotakbaz.rain.client.draggable.D.E[0xF014 ^ 0xF170] = 0xF12B ^ 0xF170;
        kotakbaz.rain.client.draggable.D.E[0xEA08 ^ 0xEA5E] = 0xEA06 ^ 0xEA5E;
        kotakbaz.rain.client.draggable.D.E[0xF80C ^ 0xF831] = 0xF823 ^ 0xF831;
        kotakbaz.rain.client.draggable.D.E[0x9C9F ^ 0x9CC0] = 0xFFFF631E ^ 0x9CC0;
        kotakbaz.rain.client.draggable.D.E[0x44E9 ^ 0x447B] = 0xC84C ^ 0x447B;
        kotakbaz.rain.client.draggable.D.E[0xA52D ^ 0xA5F3] = 0xFF83 ^ 0xA5F3;
        kotakbaz.rain.client.draggable.D.E[0xE6B4 ^ 0xE605] = 0xAAFC ^ 0xE605;
        kotakbaz.rain.client.draggable.D.E[0x9C2 ^ 0x8F6] = 0xBC0 ^ 0x8F6;
        kotakbaz.rain.client.draggable.D.E[0xD7CB ^ 0xD644] = 0x67DF ^ 0xD644;
        kotakbaz.rain.client.draggable.D.E[0x1D6A ^ 0x1C2E] = 0xA42E ^ 0x1C2E;
        kotakbaz.rain.client.draggable.D.E[0x2383 ^ 0x2344] = 0xBF36 ^ 0x2344;
        kotakbaz.rain.client.draggable.D.E[0x3983 ^ 0x380E] = 0xEC54 ^ 0x380E;
        kotakbaz.rain.client.draggable.D.E[0x4E9B ^ 0x4FBE] = 0x14A15 ^ 0x4FBE;
        kotakbaz.rain.client.draggable.D.E[0x5CD1 ^ 0x5CB5] = 0x5CD9 ^ 0x5CB5;
        kotakbaz.rain.client.draggable.D.E[0x4BE2 ^ 0x4BCD] = 0xFFAC ^ 0x4BCD;
        kotakbaz.rain.client.draggable.D.E[0x949D ^ 0x9514] = 0x1DD0 ^ 0x9514;
        kotakbaz.rain.client.draggable.D.E[0xD80D ^ 0xD81B] = 0xD868 ^ 0xD81B;
        kotakbaz.rain.client.draggable.D.E[0x2A4F ^ 0x2B5C] = 0xF230 ^ 0x2B5C;
        kotakbaz.rain.client.draggable.D.E[0xF7F ^ 0xE3F] = 0xE3F ^ 0xE3F;
        kotakbaz.rain.client.draggable.D.E[0x9855 ^ 0x9933] = 0x997E ^ 0x9933;
        kotakbaz.rain.client.draggable.D.E[0xFAC0 ^ 0xFBCC] = 0xFFFE08C3 ^ 0xFBCC;
        kotakbaz.rain.client.draggable.D.E[0x7330 ^ 0x7240] = 0xFFFF8DBB ^ 0x7240;
        kotakbaz.rain.client.draggable.D.E[0xEEBB ^ 0xEFC9] = 0xEEC9 ^ 0xEFC9;
        kotakbaz.rain.client.draggable.D.E[0xCC4D ^ 0xCC6B] = 0xCC07 ^ 0xCC6B;
        kotakbaz.rain.client.draggable.D.E[0x5D0A ^ 0x5D14] = 0xFFFFA2CB ^ 0x5D14;
        kotakbaz.rain.client.draggable.D.E[0xB5B ^ 0xB22] = 0xD47E ^ 0xB22;
        kotakbaz.rain.client.draggable.D.E[0xB801 ^ 0xB887] = 0xEDBE ^ 0xB887;
        kotakbaz.rain.client.draggable.D.E[0x10AB9 ^ 0x10A49] = 0xFFFE64F8 ^ 0x10A49;
        kotakbaz.rain.client.draggable.D.E[0x7575 ^ 0x753E] = 0xFFFF8AB6 ^ 0x753E;
        kotakbaz.rain.client.draggable.D.E[0xECE5 ^ 0xEC4F] = 0x5833 ^ 0xEC4F;
        kotakbaz.rain.client.draggable.D.E[0x4A9F ^ 0x4A69] = 0x65BC ^ 0x4A69;
        kotakbaz.rain.client.draggable.D.E[0xB950 ^ 0xB84B] = 0x702C ^ 0xB84B;
        kotakbaz.rain.client.draggable.D.E[0xE381 ^ 0xE2D5] = 0xE289 ^ 0xE2D5;
        kotakbaz.rain.client.draggable.D.E[0xE41C ^ 0xE59F] = 0xE59F ^ 0xE59F;
        kotakbaz.rain.client.draggable.D.E[0x12D ^ 0x1A3] = 0xAD27 ^ 0x1A3;
        kotakbaz.rain.client.draggable.D.E[0x210E ^ 0x21FC] = 0x121A ^ 0x21FC;
        kotakbaz.rain.client.draggable.D.E[0x6AAC ^ 0x6A17] = 0x6A17 ^ 0x6A17;
        kotakbaz.rain.client.draggable.D.E[0x9DFD ^ 0x9CC4] = 0xF62D ^ 0x9CC4;
        kotakbaz.rain.client.draggable.D.E[0x518A ^ 0x500E] = 0x501E ^ 0x500E;
        kotakbaz.rain.client.draggable.D.E[0x80EF ^ 0x81DC] = 0x82E5 ^ 0x81DC;
        kotakbaz.rain.client.draggable.D.E[0x365D ^ 0x3713] = 0x9B9C ^ 0x3713;
        kotakbaz.rain.client.draggable.D.E[0x74C5 ^ 0x75F9] = 0xFFFF1C51 ^ 0x75F9;
        kotakbaz.rain.client.draggable.D.E[0x8D17 ^ 0x8D95] = 0x184C3 ^ 0x8D95;
        kotakbaz.rain.client.draggable.D.E[0xB2AB ^ 0xB23A] = 0xFFFFC1BD ^ 0xB23A;
        kotakbaz.rain.client.draggable.D.E[0xA24 ^ 0xB72] = 0xB68 ^ 0xB72;
        kotakbaz.rain.client.draggable.D.E[0x5C3A ^ 0x5D3C] = 0xA67 ^ 0x5D3C;
        kotakbaz.rain.client.draggable.D.E[0x40FF ^ 0x41DD] = 0x14470 ^ 0x41DD;
        kotakbaz.rain.client.draggable.D.E[0xE075 ^ 0xE035] = 0xFFFF1FEF ^ 0xE035;
        kotakbaz.rain.client.draggable.D.E[0x70E5 ^ 0x7050] = 0x5E3D ^ 0x7050;
        kotakbaz.rain.client.draggable.D.E[0x59E9 ^ 0x5987] = 0xFFFFA639 ^ 0x5987;
        kotakbaz.rain.client.draggable.D.E[0x1084 ^ 0x1009] = 0xFFFF4313 ^ 0x1009;
        kotakbaz.rain.client.draggable.D.E[0xAB84 ^ 0xAB95] = 0xFFFF5475 ^ 0xAB95;
        kotakbaz.rain.client.draggable.D.E[0xAF56 ^ 0xAE76] = 0xFFFF7D47 ^ 0xAE76;
        kotakbaz.rain.client.draggable.D.E[0x319C ^ 0x31F6] = 0xFFFFCE3B ^ 0x31F6;
        kotakbaz.rain.client.draggable.D.E[0x1AA ^ 0xC3] = 0xC9 ^ 0xC3;
        kotakbaz.rain.client.draggable.D.E[0x73D4 ^ 0x73FF] = 0x73FD ^ 0x73FF;
        kotakbaz.rain.client.draggable.D.E[0x6F7A ^ 0x6FD2] = 0xDBAE ^ 0x6FD2;
        kotakbaz.rain.client.draggable.D.E[0xCE9F ^ 0xCE90] = 0xCEFE ^ 0xCE90;
        kotakbaz.rain.client.draggable.D.E[0x3F3E ^ 0x3F5E] = 0x3F10 ^ 0x3F5E;
        kotakbaz.rain.client.draggable.D.E[0xA924 ^ 0xA85A] = 0x9C81 ^ 0xA85A;
        kotakbaz.rain.client.draggable.D.E[0x291 ^ 0x20D] = 0x1F7F ^ 0x20D;
        kotakbaz.rain.client.draggable.D.E[0xD446 ^ 0xD523] = 0xD520 ^ 0xD523;
        kotakbaz.rain.client.draggable.D.E[0x1068C ^ 0x106D5] = 0x106C3 ^ 0x106D5;
        kotakbaz.rain.client.draggable.D.E[0xA94A ^ 0xA813] = 0xA81E ^ 0xA813;
        kotakbaz.rain.client.draggable.D.E[0x3C3A ^ 0x3CDD] = 0x5FA7 ^ 0x3CDD;
        kotakbaz.rain.client.draggable.D.E[0x973C ^ 0x97E6] = 0xAB92 ^ 0x97E6;
        kotakbaz.rain.client.draggable.D.E[0xB52C ^ 0xB5AB] = 0x1A45 ^ 0xB5AB;
        kotakbaz.rain.client.draggable.D.E[0x92F9 ^ 0x9217] = 0x379 ^ 0x9217;
        kotakbaz.rain.client.draggable.D.E[0x5902 ^ 0x581B] = 0x3E55 ^ 0x581B;
        kotakbaz.rain.client.draggable.D.E[0x29C7 ^ 0x29FC] = 0xFFFFD63B ^ 0x29FC;
        kotakbaz.rain.client.draggable.D.E[0x294D ^ 0x2936] = 0x2B88 ^ 0x2936;
        kotakbaz.rain.client.draggable.D.E[0x4C69 ^ 0x4D43] = 0xA731 ^ 0x4D43;
        kotakbaz.rain.client.draggable.D.E[0x100F6 ^ 0x10079] = 0x18C43 ^ 0x10079;
        kotakbaz.rain.client.draggable.D.E[0xEDEE ^ 0xECB2] = 0xECF7 ^ 0xECB2;
        kotakbaz.rain.client.draggable.D.E[0x6D9F ^ 0x6D99] = 0xFFFF9203 ^ 0x6D99;
        kotakbaz.rain.client.draggable.D.E[0x7E82 ^ 0x7E77] = 0x4D82 ^ 0x7E77;
        kotakbaz.rain.client.draggable.D.E[0x6367 ^ 0x620D] = 0xFFFF9DCD ^ 0x620D;
        kotakbaz.rain.client.draggable.D.E[0xA0C ^ 0xACC] = 0xFFFFC907 ^ 0xACC;
        kotakbaz.rain.client.draggable.D.E[0xCA1A ^ 0xCB53] = 0x8725 ^ 0xCB53;
        kotakbaz.rain.client.draggable.D.E[0xCB7D ^ 0xCBC7] = 0x847D ^ 0xCBC7;
        kotakbaz.rain.client.draggable.D.E[0xEB48 ^ 0xEA50] = 0xFFFF73DB ^ 0xEA50;
        kotakbaz.rain.client.draggable.D.E[0x8941 ^ 0x8995] = 0xFFFFA0EA ^ 0x8995;
        kotakbaz.rain.client.draggable.D.E[0x8431 ^ 0x84F8] = 0x188A ^ 0x84F8;
        kotakbaz.rain.client.draggable.D.E[0xF3E5 ^ 0xF356] = 0xDD6C ^ 0xF356;
        kotakbaz.rain.client.draggable.D.E[0x98C2 ^ 0x99CC] = 0x9B65 ^ 0x99CC;
        kotakbaz.rain.client.draggable.D.E[0xC558 ^ 0xC5B2] = 0x18D9 ^ 0xC5B2;
        kotakbaz.rain.client.draggable.D.E[0xB2D4 ^ 0xB2AC] = 0xB2AC ^ 0xB2AC;
        kotakbaz.rain.client.draggable.D.E[0x2049 ^ 0x211B] = 0x2173 ^ 0x211B;
        kotakbaz.rain.client.draggable.D.E[0x363 ^ 0x336] = 0xFFFFFC89 ^ 0x336;
        kotakbaz.rain.client.draggable.D.E[0x3734 ^ 0x361A] = 0x7C63 ^ 0x361A;
        kotakbaz.rain.client.draggable.D.E[0x103EE ^ 0x10378] = 0x1D049 ^ 0x10378;
        kotakbaz.rain.client.draggable.D.E[0x4FCA ^ 0x4FEE] = 0xFFFFB03B ^ 0x4FEE;
        kotakbaz.rain.client.draggable.D.E[0x970D ^ 0x9604] = 0xC146 ^ 0x9604;
        kotakbaz.rain.client.draggable.D.E[0x4CA6 ^ 0x4CEC] = 0xFFFFB354 ^ 0x4CEC;
        kotakbaz.rain.client.draggable.D.E[0xBDBC ^ 0xBCEB] = 0xBCE0 ^ 0xBCEB;
        kotakbaz.rain.client.draggable.D.E[0x10B16 ^ 0x10B53] = 0x10B08 ^ 0x10B53;
        kotakbaz.rain.client.draggable.D.E[0x1115 ^ 0x1195] = 0x118C3 ^ 0x1195;
        kotakbaz.rain.client.draggable.D.E[0xB2F9 ^ 0xB2E9] = 0xB2A2 ^ 0xB2E9;
        kotakbaz.rain.client.draggable.D.E[0x10726 ^ 0x1072C] = 0x1074A ^ 0x1072C;
        kotakbaz.rain.client.draggable.D.E[0x491D ^ 0x4893] = 0xED29 ^ 0x4893;
        kotakbaz.rain.client.draggable.D.E[0x6264 ^ 0x6312] = 0x49F3 ^ 0x6312;
        kotakbaz.rain.client.draggable.D.E[0x5099 ^ 0x51B4] = 0xBBDE ^ 0x51B4;
        kotakbaz.rain.client.draggable.D.E[0xF3C ^ 0xE10] = 0xFFFF1B95 ^ 0xE10;
        kotakbaz.rain.client.draggable.D.E[0xA6F8 ^ 0xA62F] = 0xF343 ^ 0xA62F;
        kotakbaz.rain.client.draggable.D.E[0xE98D ^ 0xE9CC] = 0xE9D5 ^ 0xE9CC;
        kotakbaz.rain.client.draggable.D.E[0xE4DE ^ 0xE55F] = 0xE0C1 ^ 0xE55F;
        kotakbaz.rain.client.draggable.D.E[0x877B ^ 0x860F] = 0x860F ^ 0x860F;
        kotakbaz.rain.client.draggable.D.E[0x376D ^ 0x3737] = 0xFFFFC8C4 ^ 0x3737;
        kotakbaz.rain.client.draggable.D.E[0xCD37 ^ 0xCDCE] = 0xE21A ^ 0xCDCE;
        kotakbaz.rain.client.draggable.D.E[0x60B6 ^ 0x6082] = 0xE1E1 ^ 0x6082;
        kotakbaz.rain.client.draggable.D.E[0xDD15 ^ 0xDC07] = 0x571 ^ 0xDC07;
        kotakbaz.rain.client.draggable.D.E[0x70DE ^ 0x70B6] = 0xFFFF8F4D ^ 0x70B6;
        kotakbaz.rain.client.draggable.D.E[0x623C ^ 0x62A3] = 0x8058 ^ 0x62A3;
        kotakbaz.rain.client.draggable.D.E[0x9DB6 ^ 0x9C95] = 0x1993E ^ 0x9C95;
        kotakbaz.rain.client.draggable.D.E[0x26A8 ^ 0x2694] = 0xFFFFD925 ^ 0x2694;
        kotakbaz.rain.client.draggable.D.E[0x7EAC ^ 0x7E0A] = 0x889C ^ 0x7E0A;
        kotakbaz.rain.client.draggable.D.E[0x3649 ^ 0x36F0] = 0xFFFF86FC ^ 0x36F0;
        kotakbaz.rain.client.draggable.D.E[0xFF3 ^ 0xE84] = 0x2761 ^ 0xE84;
        kotakbaz.rain.client.draggable.D.E[0x6ACA ^ 0x6A29] = 0x1639B ^ 0x6A29;
        kotakbaz.rain.client.draggable.D.E[0x7426 ^ 0x744A] = 0xFFFF8BDF ^ 0x744A;
        kotakbaz.rain.client.draggable.D.E[0x2C6F ^ 0x2CBD] = 0xFA30 ^ 0x2CBD;
        kotakbaz.rain.client.draggable.D.E[0x106CD ^ 0x10690] = 0xFFFEF914 ^ 0x10690;
        kotakbaz.rain.client.draggable.D.E[0x99 ^ 0x71] = 0x6350 ^ 0x71;
        kotakbaz.rain.client.draggable.D.E[0x4345 ^ 0x437A] = 0xFFFFBCE1 ^ 0x437A;
        kotakbaz.rain.client.draggable.D.E[0xAFEF ^ 0xAF9E] = 0xAFF0 ^ 0xAF9E;
        kotakbaz.rain.client.draggable.D.E[0xDE73 ^ 0xDE35] = 0xDE1A ^ 0xDE35;
        kotakbaz.rain.client.draggable.D.E[0xC991 ^ 0xC8FA] = 0xC8FE ^ 0xC8FA;
        kotakbaz.rain.client.draggable.D.E[0xACA1 ^ 0xAC8F] = 0xAC23 ^ 0xAC8F;
        kotakbaz.rain.client.draggable.D.E[0x16E4 ^ 0x164A] = 0x1B46 ^ 0x164A;
        kotakbaz.rain.client.draggable.D.E[0xCFE8 ^ 0xCF44] = 0xC248 ^ 0xCF44;
        kotakbaz.rain.client.draggable.D.E[0x4357 ^ 0x4303] = 0x4309 ^ 0x4303;
        kotakbaz.rain.client.draggable.D.E[0xEC8D ^ 0xEDDE] = 0xEDD0 ^ 0xEDDE;
        kotakbaz.rain.client.draggable.D.E[0x87C7 ^ 0x8763] = 0x71F5 ^ 0x8763;
        kotakbaz.rain.client.draggable.D.E[0x3AE3 ^ 0x3AC3] = 0x3AAD ^ 0x3AC3;
        kotakbaz.rain.client.draggable.D.E[0x8583 ^ 0x851D] = 0x986F ^ 0x851D;
        kotakbaz.rain.client.draggable.D.E[0x11BA ^ 0x11E6] = 0xFFFFEE70 ^ 0x11E6;
        kotakbaz.rain.client.draggable.D.E[0xEFCF ^ 0xEEA2] = 0xEEA5 ^ 0xEEA2;
        kotakbaz.rain.client.draggable.D.E[0x9F0E ^ 0x9F95] = 0x82E6 ^ 0x9F95;
        kotakbaz.rain.client.draggable.D.E[0xC0C1 ^ 0xC147] = 0xC144 ^ 0xC147;
        kotakbaz.rain.client.draggable.D.E[0xFDFF ^ 0xFDAC] = 0xFFFF0232 ^ 0xFDAC;
        kotakbaz.rain.client.draggable.D.E[0xC084 ^ 0xC1B6] = 0xC28C ^ 0xC1B6;
        kotakbaz.rain.client.draggable.D.E[0xED2D ^ 0xEDE3] = 0x6F54 ^ 0xEDE3;
        kotakbaz.rain.client.draggable.D.E[0x6AF1 ^ 0x6AD8] = 0x6AD9 ^ 0x6AD8;
        kotakbaz.rain.client.draggable.D.E[0x904C ^ 0x9014] = 0xFFFF6FF9 ^ 0x9014;
        kotakbaz.rain.client.draggable.D.E[0xDF7A ^ 0xDF9B] = 0x85F9 ^ 0xDF9B;
        kotakbaz.rain.client.draggable.D.E[0xBC92 ^ 0xBDAA] = 0xFFFF2885 ^ 0xBDAA;
        kotakbaz.rain.client.draggable.D.E[0x10C73 ^ 0x10C89] = 0x17356 ^ 0x10C89;
        kotakbaz.rain.client.draggable.D.E[0x5477 ^ 0x54B2] = 0x58BA ^ 0x54B2;
        kotakbaz.rain.client.draggable.D.E[0x8AB0 ^ 0x8AFF] = 0x8AAC ^ 0x8AFF;
        kotakbaz.rain.client.draggable.D.E[0xA12 ^ 0xB61] = 0xB63 ^ 0xB61;
        kotakbaz.rain.client.draggable.D.E[0x4F95 ^ 0x4FD7] = 0xFFFFB004 ^ 0x4FD7;
        kotakbaz.rain.client.draggable.D.E[0x86CD ^ 0x8628] = 0x18F9A ^ 0x8628;
        kotakbaz.rain.client.draggable.D.E[0x7CC6 ^ 0x7D8C] = 0xEE54 ^ 0x7D8C;
        kotakbaz.rain.client.draggable.D.E[0xB8BA ^ 0xB89F] = 0xB8BE ^ 0xB89F;
        kotakbaz.rain.client.draggable.D.E[0x1267 ^ 0x124D] = 0x124D ^ 0x124D;
        kotakbaz.rain.client.draggable.D.E[0xDDDB ^ 0xDD19] = 0xD10A ^ 0xDD19;
        kotakbaz.rain.client.draggable.D.E[0xD81F ^ 0xD861] = 0xDAD1 ^ 0xD861;
        kotakbaz.rain.client.draggable.D.E[0x10A4D ^ 0x10A9D] = 0xFFFE77F0 ^ 0x10A9D;
        kotakbaz.rain.client.draggable.D.E[0xC04D ^ 0xC0BA] = 0xEF6E ^ 0xC0BA;
        kotakbaz.rain.client.draggable.D.E[0xC570 ^ 0xC46E] = 0xE8BA ^ 0xC46E;
        kotakbaz.rain.client.draggable.D.E[0xED0E ^ 0xEC11] = 0xC0DB ^ 0xEC11;
        kotakbaz.rain.client.draggable.D.E[0x2F7A ^ 0x2E37] = 0x9488 ^ 0x2E37;
        kotakbaz.rain.client.draggable.D.E[0xDD96 ^ 0xDDE9] = 0x1D4B6 ^ 0xDDE9;
        kotakbaz.rain.client.draggable.D.E[0x1A0F ^ 0x1A98] = 0x690C ^ 0x1A98;
        kotakbaz.rain.client.draggable.D.E[0x7DCC ^ 0x7CCC] = 0x8AD1 ^ 0x7CCC;
        kotakbaz.rain.client.draggable.D.E[0x535A ^ 0x5395] = 0xD133 ^ 0x5395;
        kotakbaz.rain.client.draggable.D.E[0x394E ^ 0x399B] = 0xEF11 ^ 0x399B;
        kotakbaz.rain.client.draggable.D.E[0xB1CA ^ 0xB1ED] = 0xB1EE ^ 0xB1ED;
        kotakbaz.rain.client.draggable.D.E[0xAD ^ 0x9B] = 0x8701 ^ 0x9B;
        kotakbaz.rain.client.draggable.D.E[0xBF38 ^ 0xBFBC] = 0xEA85 ^ 0xBFBC;
        kotakbaz.rain.client.draggable.D.E[0xC228 ^ 0xC223] = 0xFFFF3DB3 ^ 0xC223;
        kotakbaz.rain.client.draggable.D.E[0xE7C9 ^ 0xE71F] = 0xB27E ^ 0xE71F;
        kotakbaz.rain.client.draggable.D.E[0x81B ^ 0x961] = 0xFF46 ^ 0x961;
        kotakbaz.rain.client.draggable.D.E[0x8C3A ^ 0x8C3F] = 0x8C53 ^ 0x8C3F;
        kotakbaz.rain.client.draggable.D.E[0x6153 ^ 0x6045] = 0x607 ^ 0x6045;
        kotakbaz.rain.client.draggable.D.E[0x2F91 ^ 0x2EFD] = 0xFFFFD109 ^ 0x2EFD;
        kotakbaz.rain.client.draggable.D.E[0xAAFD ^ 0xAA78] = 0xFF51 ^ 0xAA78;
        kotakbaz.rain.client.draggable.D.E[0x8EAD ^ 0x8E08] = 0x78D9 ^ 0x8E08;
        kotakbaz.rain.client.draggable.D.E[0x5A55 ^ 0x5B62] = 0x318B ^ 0x5B62;
        kotakbaz.rain.client.draggable.D.E[0x1DDE ^ 0x1D3E] = 0xFFFFB893 ^ 0x1D3E;
        kotakbaz.rain.client.draggable.D.E[0x44BB ^ 0x45B6] = 0x14947 ^ 0x45B6;
        kotakbaz.rain.client.draggable.D.E[0xB5EA ^ 0xB522] = 0x2943 ^ 0xB522;
        kotakbaz.rain.client.draggable.D.E[0xF270 ^ 0xF212] = 0xFFFF0DA3 ^ 0xF212;
        kotakbaz.rain.client.draggable.D.E[0xC83D ^ 0xC870] = 0xC82C ^ 0xC870;
        kotakbaz.rain.client.draggable.D.E[0xC9A5 ^ 0xC9BF] = 0xC986 ^ 0xC9BF;
        kotakbaz.rain.client.draggable.D.E[0x9CB6 ^ 0x9CDF] = 0x9CFA ^ 0x9CDF;
        kotakbaz.rain.client.draggable.D.E[0xD301 ^ 0xD3E3] = 0x1DA4C ^ 0xD3E3;
        kotakbaz.rain.client.draggable.D.E[0xE0D ^ 0xE95] = 0x7D07 ^ 0xE95;
        kotakbaz.rain.client.draggable.D.E[0x91BE ^ 0x917F] = 0xAD02 ^ 0x917F;
        kotakbaz.rain.client.draggable.D.E[0x9E6B ^ 0x9F61] = 0x1938C ^ 0x9F61;
        kotakbaz.rain.client.draggable.D.E[0xCD91 ^ 0xCC92] = 0xEE53 ^ 0xCC92;
        kotakbaz.rain.client.draggable.D.E[0x4734 ^ 0x466F] = 0x4667 ^ 0x466F;
        kotakbaz.rain.client.draggable.D.E[0x40F9 ^ 0x40C0] = 0x40C0 ^ 0x40C0;
        kotakbaz.rain.client.draggable.D.E[0xE4E5 ^ 0xE594] = 0xE59D ^ 0xE594;
        kotakbaz.rain.client.draggable.D.E[0x8607 ^ 0x86DB] = 0xBABD ^ 0x86DB;
        kotakbaz.rain.client.draggable.D.E[0x14C ^ 0x117] = 0x119 ^ 0x117;
        kotakbaz.rain.client.draggable.D.E[0x6733 ^ 0x6752] = 0x6742 ^ 0x6752;
        kotakbaz.rain.client.draggable.D.E[0x2E69 ^ 0x2EAF] = 0xB2D5 ^ 0x2EAF;
        kotakbaz.rain.client.draggable.D.E[0xA4B2 ^ 0xA5D1] = 0xA5D0 ^ 0xA5D1;
        kotakbaz.rain.client.draggable.D.E[0x12AD ^ 0x1260] = 0xDF29 ^ 0x1260;
        kotakbaz.rain.client.draggable.D.E[0x6E78 ^ 0x6EB2] = 0xA3FF ^ 0x6EB2;
        kotakbaz.rain.client.draggable.D.E[0x15BC ^ 0x159F] = 0x15CC ^ 0x159F;
        kotakbaz.rain.client.draggable.D.E[0xFEDA ^ 0xFEC2] = 0xFFFF0136 ^ 0xFEC2;
        kotakbaz.rain.client.draggable.D.E[0x4F4 ^ 0x44A] = 0x383D ^ 0x44A;
        kotakbaz.rain.client.draggable.D.E[0x3184 ^ 0x3117] = 0xE22E ^ 0x3117;
        kotakbaz.rain.client.draggable.D.E[0x149B ^ 0x142D] = 0x3A1D ^ 0x142D;
        kotakbaz.rain.client.draggable.D.E[0x7190 ^ 0x7176] = 0x121B ^ 0x7176;
        kotakbaz.rain.client.draggable.D.E[0x253A ^ 0x241B] = 0x8D1 ^ 0x241B;
        kotakbaz.rain.client.draggable.D.E[0x1FDC ^ 0x1FBF] = 0xFFFFE07E ^ 0x1FBF;
        kotakbaz.rain.client.draggable.D.E[0x230B ^ 0x236E] = 0xFFFFDC93 ^ 0x236E;
        kotakbaz.rain.client.draggable.D.E[0x6E0B ^ 0x6E48] = 0x6E8B ^ 0x6E48;
        kotakbaz.rain.client.draggable.D.E[0x966F ^ 0x9672] = 0x961D ^ 0x9672;
        kotakbaz.rain.client.draggable.D.E[0x9637 ^ 0x964A] = 0x94C9 ^ 0x964A;
        kotakbaz.rain.client.draggable.D.E[0x9E15 ^ 0x9EBE] = 0x93B6 ^ 0x9EBE;
        kotakbaz.rain.client.draggable.D.E[0xBC31 ^ 0xBC02] = 0xCD90 ^ 0xBC02;
        kotakbaz.rain.client.draggable.D.E[0x6411 ^ 0x6463] = 0x642C ^ 0x6463;
        kotakbaz.rain.client.draggable.D.E[0x745A ^ 0x7449] = 0x741A ^ 0x7449;
        kotakbaz.rain.client.draggable.D.E[0x4B9D ^ 0x4BAF] = 0x375D ^ 0x4BAF;
        kotakbaz.rain.client.draggable.D.E[0xB191 ^ 0xB0B6] = 0x1FCC ^ 0xB0B6;
        kotakbaz.rain.client.draggable.D.E[0x9F90 ^ 0x9F53] = 0x935B ^ 0x9F53;
        kotakbaz.rain.client.draggable.D.E[0x4EA ^ 0x5D4] = 0x5D4 ^ 0x5D4;
        kotakbaz.rain.client.draggable.D.E[0x7E1E ^ 0x7F36] = 0xD013 ^ 0x7F36;
        kotakbaz.rain.client.draggable.D.E[0xE45E ^ 0xE4CA] = 0x37FB ^ 0xE4CA;
        kotakbaz.rain.client.draggable.D.E[0xC183 ^ 0xC0C8] = 0x3B74 ^ 0xC0C8;
        kotakbaz.rain.client.draggable.D.E[0x86B6 ^ 0x864B] = 0xF996 ^ 0x864B;
        kotakbaz.rain.client.draggable.D.E[0x500F ^ 0x500E] = 0xFFFFAFE1 ^ 0x500E;
        kotakbaz.rain.client.draggable.D.E[0x1437 ^ 0x1467] = 0x141A ^ 0x1467;
        kotakbaz.rain.client.draggable.D.E[0xAC8A ^ 0xADBB] = 0xE7D2 ^ 0xADBB;
        kotakbaz.rain.client.draggable.D.E[0xA7CC ^ 0xA6D1] = 0x6EB6 ^ 0xA6D1;
        kotakbaz.rain.client.draggable.D.E[0x10139 ^ 0x10075] = 0x183EB ^ 0x10075;
        kotakbaz.rain.client.draggable.D.E[0x29E9 ^ 0x2934] = 0x154B ^ 0x2934;
        kotakbaz.rain.client.draggable.D.E[0x27B7 ^ 0x26E2] = 0x26EE ^ 0x26E2;
        kotakbaz.rain.client.draggable.D.E[0x2616 ^ 0x2732] = 0xFFFEDD51 ^ 0x2732;
        kotakbaz.rain.client.draggable.D.E[0xB18F ^ 0xB1CB] = 0xFFFF4E52 ^ 0xB1CB;
        kotakbaz.rain.client.draggable.D.E[0xAD27 ^ 0xADF6] = 0x2F50 ^ 0xADF6;
        kotakbaz.rain.client.draggable.D.E[0xEDC1 ^ 0xEC41] = 0xC66D ^ 0xEC41;
        kotakbaz.rain.client.draggable.D.E[0xE17 ^ 0xF51] = 0x3930 ^ 0xF51;
        kotakbaz.rain.client.draggable.D.E[0xA50F ^ 0xA404] = 0x1A8F5 ^ 0xA404;
        kotakbaz.rain.client.draggable.D.E[0x53D6 ^ 0x53D1] = 0x5390 ^ 0x53D1;
        kotakbaz.rain.client.draggable.D.E[0xA13B ^ 0xA113] = 0xA113 ^ 0xA113;
        kotakbaz.rain.client.draggable.D.E[0x6EE3 ^ 0x6E99] = 0xB1D5 ^ 0x6E99;
        kotakbaz.rain.client.draggable.D.E[0x10017 ^ 0x1005E] = 0x1000E ^ 0x1005E;
        kotakbaz.rain.client.draggable.D.E[0x3DD8 ^ 0x3CF3] = 0xD699 ^ 0x3CF3;
        kotakbaz.rain.client.draggable.D.E[0xA40E ^ 0xA514] = 0x6D67 ^ 0xA514;
        kotakbaz.rain.client.draggable.D.E[0x8C47 ^ 0x8DCF] = 0x8DDB ^ 0x8DCF;
        kotakbaz.rain.client.draggable.D.E[0x3E1 ^ 0x3DB] = 0x3D1 ^ 0x3DB;
        kotakbaz.rain.client.draggable.D.E[0x10199 ^ 0x100C7] = 0x10097 ^ 0x100C7;
        kotakbaz.rain.client.draggable.D.E[0x56D0 ^ 0x57C0] = 0x550B ^ 0x57C0;
        kotakbaz.rain.client.draggable.D.E[0xC511 ^ 0xC515] = 0xC55E ^ 0xC515;
        kotakbaz.rain.client.draggable.D.E[0x6AA ^ 0x603] = 0xFFFF4DE8 ^ 0x603;
        kotakbaz.rain.client.draggable.D.E[0x4668 ^ 0x4739] = 0x4736 ^ 0x4739;
        kotakbaz.rain.client.draggable.D.E[0x2C5F ^ 0x2CA1] = 0xDA99 ^ 0x2CA1;
        kotakbaz.rain.client.draggable.D.E[0x101FD ^ 0x10109] = 0xFFFECD28 ^ 0x10109;
        kotakbaz.rain.client.draggable.D.E[0x6EAA ^ 0x6E6E] = 0x6217 ^ 0x6E6E;
        kotakbaz.rain.client.draggable.D.E[0xD22B ^ 0xD24D] = 0xD202 ^ 0xD24D;
        kotakbaz.rain.client.draggable.D.E[0xAAA1 ^ 0xAB87] = 0x4F3 ^ 0xAB87;
        kotakbaz.rain.client.draggable.D.E[0xD2F5 ^ 0xD2FC] = 0xFFFF2DD1 ^ 0xD2FC;
        kotakbaz.rain.client.draggable.D.E[0xB887 ^ 0xB8B0] = 0x432D ^ 0xB8B0;
        kotakbaz.rain.client.draggable.D.E[0x10828 ^ 0x10946] = 0x10900 ^ 0x10946;
        kotakbaz.rain.client.draggable.D.E[0x10D42 ^ 0x10DC8] = 0x1A221 ^ 0x10DC8;
        kotakbaz.rain.client.draggable.D.E[0x6F9B ^ 0x6F13] = 0xC0FA ^ 0x6F13;
        kotakbaz.rain.client.draggable.D.E[0x1C53 ^ 0x1D51] = 0x3F86 ^ 0x1D51;
        kotakbaz.rain.client.draggable.D.E[0x9AAD ^ 0x9B92] = 0x9B92 ^ 0x9B92;
        kotakbaz.rain.client.draggable.D.E[0xF44B ^ 0xF41A] = 0xF414 ^ 0xF41A;
        kotakbaz.rain.client.draggable.D.E[0x2D14 ^ 0x2D79] = 0x2D65 ^ 0x2D79;
        kotakbaz.rain.client.draggable.D.E[0xBE59 ^ 0xBF36] = 0xBF34 ^ 0xBF36;
        kotakbaz.rain.client.draggable.D.E[0x8488 ^ 0x8437] = 0xB84A ^ 0x8437;
        kotakbaz.rain.client.draggable.D.E[0xF252 ^ 0xF24D] = 0xFFFF0DDC ^ 0xF24D;
        kotakbaz.rain.client.draggable.D.E[0x25ED ^ 0x255A] = 0x6AEF ^ 0x255A;
        kotakbaz.rain.client.draggable.D.E[0xDA42 ^ 0xDA37] = 0xDA37 ^ 0xDA37;
        kotakbaz.rain.client.draggable.D.E[0x3E3 ^ 0x283] = 0x2B9 ^ 0x283;
        kotakbaz.rain.client.draggable.D.E[0x10C67 ^ 0x10C2B] = 0x10C78 ^ 0x10C2B;
        kotakbaz.rain.client.draggable.D.E[0x14A8 ^ 0x14D4] = 0x1664 ^ 0x14D4;
        kotakbaz.rain.client.draggable.D.E[0x625C ^ 0x62C6] = 0x1154 ^ 0x62C6;
        kotakbaz.rain.client.draggable.D.E[0xB6E3 ^ 0xB668] = 0x1AE9 ^ 0xB668;
        kotakbaz.rain.client.draggable.D.E[0x35F2 ^ 0x356F] = 0xFFFFD7C0 ^ 0x356F;
        kotakbaz.rain.client.draggable.D.E[0x81F ^ 0x869] = 0x868 ^ 0x869;
        kotakbaz.rain.client.draggable.D.E[0xD506 ^ 0xD533] = 0x89AB ^ 0xD533;
        kotakbaz.rain.client.draggable.D.E[0xA056 ^ 0xA09D] = 0x6DD4 ^ 0xA09D;
        kotakbaz.rain.client.draggable.D.E[0x19E1 ^ 0x19EC] = 0xFFFFE652 ^ 0x19EC;
        kotakbaz.rain.client.draggable.D.E[0x11B4 ^ 0x109D] = 0xBFE7 ^ 0x109D;
        kotakbaz.rain.client.draggable.D.E[0x42DC ^ 0x42ED] = 0xAD5C ^ 0x42ED;
        kotakbaz.rain.client.draggable.D.E[0xFA8D ^ 0xFBC8] = 0x9D18 ^ 0xFBC8;
        kotakbaz.rain.client.draggable.D.E[0xE69A ^ 0xE656] = 0xFFFFD4A2 ^ 0xE656;
        kotakbaz.rain.client.draggable.D.E[0x54CC ^ 0x55DB] = 0x3395 ^ 0x55DB;
        kotakbaz.rain.client.draggable.D.E[0x33E9 ^ 0x339D] = 0x339F ^ 0x339D;
        kotakbaz.rain.client.draggable.D.E[0xF83D ^ 0xF9B1] = 0xAE68 ^ 0xF9B1;
        kotakbaz.rain.client.draggable.D.E[0x2685 ^ 0x2604] = 0x12F7D ^ 0x2604;
        kotakbaz.rain.client.draggable.D.E[0xC551 ^ 0xC582] = 0x1308 ^ 0xC582;
        kotakbaz.rain.client.draggable.D.E[0x82C1 ^ 0x829F] = 0xFFFF7D2F ^ 0x829F;
        kotakbaz.rain.client.draggable.D.E[0x795D ^ 0x7835] = 0xFFFF87FF ^ 0x7835;
        kotakbaz.rain.client.draggable.D.E[0x3FD ^ 0x301] = 0x7CBB ^ 0x301;
        kotakbaz.rain.client.draggable.D.E[0x125B ^ 0x1301] = 0xFFFFECC4 ^ 0x1301;
        kotakbaz.rain.client.draggable.D.E[0x1E3A ^ 0x1E34] = 0x1E30 ^ 0x1E34;
        kotakbaz.rain.client.draggable.D.E[0x7E2C ^ 0x7E64] = 0xFFFF81D7 ^ 0x7E64;
        kotakbaz.rain.client.draggable.D.E[0xEBCA ^ 0xEA85] = 0xEA84 ^ 0xEA85;
        kotakbaz.rain.client.draggable.D.E[0x87F7 ^ 0x86E3] = 0xFFFFA01E ^ 0x86E3;
        kotakbaz.rain.client.draggable.D.E[0x8B95 ^ 0x8BE6] = 0x8BE7 ^ 0x8BE6;
        kotakbaz.rain.client.draggable.D.E[0xC8F ^ 0xDA0] = 0x47C9 ^ 0xDA0;
        kotakbaz.rain.client.draggable.D.E[0xDC ^ 0xD0] = 0xFFFFFF11 ^ 0xD0;
        kotakbaz.rain.client.draggable.D.E[0x2DDD ^ 0x2D06] = 0x1179 ^ 0x2D06;
        kotakbaz.rain.client.draggable.D.E[0xC3FE ^ 0xC2FF] = 0x34C8 ^ 0xC2FF;
        kotakbaz.rain.client.draggable.D.E[0x3DB7 ^ 0x3CEA] = 0x3CEA ^ 0x3CEA;
        kotakbaz.rain.client.draggable.D.E[0x10183 ^ 0x10178] = 0x17EA5 ^ 0x10178;
        kotakbaz.rain.client.draggable.D.E[0x3E16 ^ 0x3F9C] = 0x39D8 ^ 0x3F9C;
        kotakbaz.rain.client.draggable.D.E[0xA40C ^ 0xA4B4] = 0xEB0E ^ 0xA4B4;
        kotakbaz.rain.client.draggable.D.E[0x4C99 ^ 0x4D9E] = 0x1ADC ^ 0x4D9E;
        kotakbaz.rain.client.draggable.D.E[0x10693 ^ 0x106B2] = 0x106EA ^ 0x106B2;
        kotakbaz.rain.client.draggable.D.E[0x4145 ^ 0x4135] = 0x4134 ^ 0x4135;
        kotakbaz.rain.client.draggable.D.E[0xCEB7 ^ 0xCEAB] = 0xCEE3 ^ 0xCEAB;
        kotakbaz.rain.client.draggable.D.E[0xCF4B ^ 0xCF5E] = 0xFFFF3031 ^ 0xCF5E;
        kotakbaz.rain.client.draggable.D.E[0x721B ^ 0x7359] = 0x7359 ^ 0x7359;
        kotakbaz.rain.client.draggable.D.E[0xD09A ^ 0xD0DD] = 0xFFFF2F61 ^ 0xD0DD;
        kotakbaz.rain.client.draggable.D.E[0x706F ^ 0x7067] = 0xFFFF8FBA ^ 0x7067;
        kotakbaz.rain.client.draggable.D.E[0xF4AE ^ 0xF409] = 0x4077 ^ 0xF409;
        kotakbaz.rain.client.draggable.D.E[0x332 ^ 0x39F] = 0xFFFFF136 ^ 0x39F;
        kotakbaz.rain.client.draggable.D.E[0x553B ^ 0x5446] = 0x6E7D ^ 0x5446;
        kotakbaz.rain.client.draggable.D.E[0x85CD ^ 0x85EF] = 0x85EC ^ 0x85EF;
        kotakbaz.rain.client.draggable.D.E[0xD6B3 ^ 0xD6D8] = 0xD6A0 ^ 0xD6D8;
        kotakbaz.rain.client.draggable.D.E[0x3AF1 ^ 0x3AC9] = 0xB626 ^ 0x3AC9;
        kotakbaz.rain.client.draggable.D.E[0xCD94 ^ 0xCC90] = 0xEE29 ^ 0xCC90;
        kotakbaz.rain.client.draggable.D.E[0x5D17 ^ 0x5C48] = 0x5C41 ^ 0x5C48;
        kotakbaz.rain.client.draggable.D.E[0x44BC ^ 0x4539] = 0x4529 ^ 0x4539;
        kotakbaz.rain.client.draggable.D.E[0x2EAE ^ 0x2E56] = 0xFFFFFE4B ^ 0x2E56;
        kotakbaz.rain.client.draggable.D.E[0x2A65 ^ 0x2B50] = 0x2869 ^ 0x2B50;
        kotakbaz.rain.client.draggable.D.E[0xDAAB ^ 0xDB29] = 0xDB2B ^ 0xDB29;
        kotakbaz.rain.client.draggable.D.E[0x10D2F ^ 0x10C7F] = 0x10C6F ^ 0x10C7F;
        kotakbaz.rain.client.draggable.D.E[0x7F1C ^ 0x7FC4] = 0x2AD0 ^ 0x7FC4;
        kotakbaz.rain.client.draggable.D.E[0xDB70 ^ 0xDB07] = 0xDB06 ^ 0xDB07;
        kotakbaz.rain.client.draggable.D.E[0x541C ^ 0x544E] = 0xFFFFABFA ^ 0x544E;
        kotakbaz.rain.client.draggable.D.E[0xBC97 ^ 0xBC94] = 0xBCB3 ^ 0xBC94;
        kotakbaz.rain.client.draggable.D.E[0xDE5 ^ 0xDF2] = 0xFFFFF212 ^ 0xDF2;
        kotakbaz.rain.client.draggable.D.E[0x1562 ^ 0x154F] = 0x154F ^ 0x154F;
        kotakbaz.rain.client.draggable.D.E[0xFC29 ^ 0xFCA5] = 0x5021 ^ 0xFCA5;
        kotakbaz.rain.client.draggable.D.E[0xA828 ^ 0xA847] = 0xA839 ^ 0xA847;
        kotakbaz.rain.client.draggable.D.E[0x17AF ^ 0x16D0] = 0x4BBC ^ 0x16D0;
        kotakbaz.rain.client.draggable.D.E[0x1DC ^ 0x17C] = 0xE38B ^ 0x17C;
        kotakbaz.rain.client.draggable.D.E[0xB187 ^ 0xB0BC] = 0x26C4 ^ 0xB0BC;
        kotakbaz.rain.client.draggable.D.E[0x3620 ^ 0x36B9] = 0x4521 ^ 0x36B9;
        kotakbaz.rain.client.draggable.D.E[0x22CE ^ 0x227C] = 0x6E81 ^ 0x227C;
        kotakbaz.rain.client.draggable.D.E[0xD6DD ^ 0xD661] = 0x64B0 ^ 0xD661;
        kotakbaz.rain.client.draggable.D.E[0x5C6 ^ 0x5DF] = 0x59B ^ 0x5DF;
        kotakbaz.rain.client.draggable.D.E[0xE721 ^ 0xE7D2] = 0xD427 ^ 0xE7D2;
        kotakbaz.rain.client.draggable.D.E[0x312 ^ 0x275] = 0x273 ^ 0x275;
        kotakbaz.rain.client.draggable.D.E[0x105F8 ^ 0x10557] = 0x149A9 ^ 0x10557;
        kotakbaz.rain.client.draggable.D.E[0xCA06 ^ 0xCAD9] = 0x90BB ^ 0xCAD9;
        kotakbaz.rain.client.draggable.D.E[0xCAD3 ^ 0xCBDC] = 0xC97C ^ 0xCBDC;
        kotakbaz.rain.client.draggable.D.E[0x48C3 ^ 0x4894] = 0xFFFFB753 ^ 0x4894;
        kotakbaz.rain.client.draggable.D.E[0xB340 ^ 0xB342] = 0xB375 ^ 0xB342;
        kotakbaz.rain.client.draggable.D.E[0x5503 ^ 0x55EE] = 0x8890 ^ 0x55EE;
        kotakbaz.rain.client.draggable.D.E[0x9EB0 ^ 0x9EA2] = 0xFFFF6194 ^ 0x9EA2;
        kotakbaz.rain.client.draggable.D.E[0x2839 ^ 0x28BA] = 0x7D83 ^ 0x28BA;
        kotakbaz.rain.client.draggable.D.E[0x7551 ^ 0x75BA] = 0xA8C4 ^ 0x75BA;
        kotakbaz.rain.client.draggable.D.E[0xF51B ^ 0xF453] = 0x3F11 ^ 0xF453;
        kotakbaz.rain.client.draggable.D.E[0xF8F5 ^ 0xF811] = 0xFFFE0E6A ^ 0xF811;
        kotakbaz.rain.client.draggable.D.E[0xE3DB ^ 0xE2EB] = 0xA8E7 ^ 0xE2EB;
        kotakbaz.rain.client.draggable.D.E[0xF6C8 ^ 0xF6C8] = 0xFFFF0916 ^ 0xF6C8;
        kotakbaz.rain.client.draggable.D.E[0xC0D2 ^ 0xC1E8] = 0x5795 ^ 0xC1E8;
        kotakbaz.rain.client.draggable.D.E[0x108 ^ 0x69] = 0x6C ^ 0x69;
        kotakbaz.rain.client.draggable.D.E[0x885D ^ 0x894C] = 0x8BEC ^ 0x894C;
        kotakbaz.rain.client.draggable.D.E[0x5FAB ^ 0x5F9B] = 0x645A ^ 0x5F9B;
        kotakbaz.rain.client.draggable.D.E[0xB231 ^ 0xB372] = 0xB360 ^ 0xB372;
        kotakbaz.rain.client.draggable.D.E[0xE475 ^ 0xE461] = 0xE416 ^ 0xE461;
        kotakbaz.rain.client.draggable.D.E[0xAB7F ^ 0xABCB] = 0x85FB ^ 0xABCB;
        kotakbaz.rain.client.draggable.D.E[0x582A ^ 0x58BF] = 0xFFFF7432 ^ 0x58BF;
        kotakbaz.rain.client.draggable.D.E[0x10D12 ^ 0x10DAF] = 0x1BF5E ^ 0x10DAF;
        kotakbaz.rain.client.draggable.D.E[0x829F ^ 0x83EA] = 0x83E9 ^ 0x83EA;
        kotakbaz.rain.client.draggable.D.E[0xA3BE ^ 0xA2C2] = 0xE1CB ^ 0xA2C2;
        kotakbaz.rain.client.draggable.D.E[0x8FB5 ^ 0x8EA9] = 0x46A8 ^ 0x8EA9;
        kotakbaz.rain.client.draggable.D.E[0x5FB5 ^ 0x5F5C] = 0x3C26 ^ 0x5F5C;
        kotakbaz.rain.client.draggable.D.E[0x73D6 ^ 0x7297] = 0x7296 ^ 0x7297;
        kotakbaz.rain.client.draggable.D.E[0x7CBE ^ 0x7DC6] = 0xDF3 ^ 0x7DC6;
        kotakbaz.rain.client.draggable.D.E[0x2F9C ^ 0x2E89] = 0xF7E5 ^ 0x2E89;
        kotakbaz.rain.client.draggable.D.E[0xC1DA ^ 0xC16A] = 0x8D97 ^ 0xC16A;
        kotakbaz.rain.client.draggable.D.E[0x6BA ^ 0x633] = 0xA9E9 ^ 0x633;
        kotakbaz.rain.client.draggable.D.E[0x36EA ^ 0x3605] = 0xA774 ^ 0x3605;
        kotakbaz.rain.client.draggable.D.E[0x53E4 ^ 0x53DA] = 0x53A9 ^ 0x53DA;
    }
}

