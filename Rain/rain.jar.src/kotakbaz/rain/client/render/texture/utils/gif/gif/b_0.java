/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.texture.utils.gif.gif;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.IndexColorModel;
import java.awt.image.MultiPixelPackedSampleModel;
import java.awt.image.PixelInterleavedSampleModel;
import java.awt.image.SampleModel;
import java.awt.image.WritableRaster;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.IIOException;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.stream.ImageInputStream;
import kotakbaz.rain.client.render.texture.utils.gif.common.a;
import kotakbaz.rain.client.render.texture.utils.gif.gif.a_0;
import kotakbaz.rain.client.render.texture.utils.gif.gif.b;

/*
 * Renamed from kotakbaz.rain.client.render.texture.utils.gif.gif.B
 */
public class b_0
extends ImageReader {
    ImageInputStream a = null;
    boolean A;
    b b;
    int B;
    a_0 c;
    List<Long> C;
    int d;
    int D;
    final byte[] e;
    int E;
    int f;
    int F;
    int g;
    int G;
    int h;
    int H;
    boolean i;
    BufferedImage I;
    WritableRaster j;
    int J;
    int k;
    int K;
    int l;
    int L;
    int m;
    private byte[] M;
    static final int[] n;
    static final int[] N;
    Rectangle o;
    int O;
    int p;
    int P;
    int q;
    Point Q;
    Rectangle r;
    int R;
    int s;
    boolean S;
    int t;
    byte[] T;
    private static byte[] u;
    private static Object[] U;
    private static Object V;
    private static Object[] w;
    private static Object[] v;
    private static Object[] W;
    public static int[] x;

    public b_0(ImageReaderSpi originatingProvider) {
        super(originatingProvider);
        int n2 = x[0];
        n2 -= x[1];
        this.A = n2 += x[2];
        this.b = null;
        int n3 = x[3];
        n3 -= x[4];
        this.B = n3 -= x[5];
        this.c = null;
        this.C = new ArrayList<Long>();
        int n4 = x[6];
        n4 ^= x[7];
        this.D = n4 -= x[8];
        int n5 = x[9];
        n5 += x[10];
        this.e = new byte[n5 += x[11]];
        int n6 = x[12];
        n6 ^= x[13];
        this.E = n6 ^= x[14];
        int n7 = x[15];
        n7 -= x[16];
        this.f = n7 -= x[17];
        int n8 = x[18];
        n8 -= x[19];
        this.F = n8 -= x[20];
        int n9 = x[21];
        n9 ^= x[22];
        this.H = n9 ^= x[23];
        int n10 = x[24];
        n10 += x[25];
        this.i = n10 += x[26];
        this.I = null;
        this.j = null;
        int n11 = x[27];
        n11 -= x[28];
        this.J = n11 -= x[29];
        int n12 = x[30];
        n12 += x[31];
        this.k = n12 ^= x[32];
        int n13 = x[33];
        n13 ^= x[34];
        this.K = n13 += x[35];
        int n14 = x[36];
        n14 ^= x[37];
        this.l = n14 ^= x[38];
        int n15 = x[39];
        n15 ^= x[40];
        this.L = n15 -= x[41];
        int n16 = x[42];
        n16 ^= x[43];
        this.m = n16 += x[44];
        this.M = null;
        int n17 = x[45];
        n17 ^= x[46];
        this.S = n17 += x[47];
        int n18 = x[48];
        n18 -= x[49];
        this.t = n18 += x[50];
    }

    @Override
    public void setInput(Object input, boolean seekForwardOnly, boolean ignoreMetadata) {
        super.setInput(input, seekForwardOnly, ignoreMetadata);
        if (input != null) {
            if (!(input instanceof ImageInputStream)) {
                int n2 = x[51];
                n2 ^= x[52];
                int n3 = x[54];
                n3 += x[55];
                throw new IllegalArgumentException((String)U[n2 ^= x[53]] + (String)U[n3 ^= x[56]]);
            }
            this.a = (ImageInputStream)input;
        } else {
            this.a = null;
        }
        this.resetStreamSettings();
    }

    @Override
    public int getNumImages(boolean allowSearch) {
        if (this.a == null) {
            int n2 = x[57];
            n2 += x[58];
            throw new IllegalStateException((String)U[n2 += x[59]]);
        }
        if (this.seekForwardOnly && allowSearch) {
            int n3 = x[60];
            n3 += x[61];
            int n4 = x[63];
            n4 -= x[64];
            throw new IllegalStateException((String)U[n3 ^= x[62]] + (String)U[n4 ^= x[65]]);
        }
        if (this.D > 0) {
            return this.D;
        }
        if (allowSearch) {
            int n5 = x[66];
            n5 += x[67];
            int n6 = x[69];
            n6 -= x[70];
            this.D = this.locateImage(n5 += x[68]) + (n6 -= x[71]);
        }
        return this.D;
    }

    private void checkIndex(int imageIndex) {
        if (imageIndex < this.minIndex) {
            int n2 = x[72];
            n2 ^= x[73];
            int n3 = x[75];
            n3 ^= x[76];
            throw new IndexOutOfBoundsException((String)U[n2 -= x[74]] + (String)U[n3 += x[77]]);
        }
        if (this.seekForwardOnly) {
            this.minIndex = imageIndex;
        }
    }

    @Override
    public int getWidth(int imageIndex) {
        long l2 = 8634205238878413179L;
        this.checkIndex(imageIndex);
        int n2 = x[78];
        n2 ^= x[79];
        long l3 = l2;
        int n3 = x[81];
        n3 -= x[82];
        l2 = l3 ^ ((long)this.locateImage(imageIndex) << (n2 -= x[80]) ^ l3) & -1L << (n3 ^= x[83]);
        int n4 = x[84];
        n4 ^= x[85];
        if ((int)(l2 >>> (n4 -= x[86])) != imageIndex) {
            throw new IndexOutOfBoundsException();
        }
        this.readMetadata();
        return this.c.c;
    }

    @Override
    public int getHeight(int imageIndex) {
        long l2 = 390362063264773640L;
        this.checkIndex(imageIndex);
        int n2 = x[87];
        n2 -= x[88];
        long l3 = l2;
        int n3 = x[90];
        n3 += x[91];
        l2 = l3 ^ ((long)this.locateImage(imageIndex) << (n2 -= x[89]) ^ l3) & -1L << (n3 ^= x[92]);
        int n4 = x[93];
        n4 -= x[94];
        if ((int)(l2 >>> (n4 -= x[95])) != imageIndex) {
            throw new IndexOutOfBoundsException();
        }
        this.readMetadata();
        return this.c.C;
    }

    private ImageTypeSpecifier createIndexed(byte[] r, byte[] g2, byte[] b2, int bits) {
        SampleModel sampleModel;
        IndexColorModel indexColorModel;
        long l2 = -1486769869131912859L;
        if (this.c.F) {
            int n2 = x[96];
            n2 += x[97];
            n2 -= x[98];
            int n3 = x[99];
            n3 -= x[100];
            long l3 = l2;
            int n4 = x[102];
            n4 -= x[103];
            l2 = l3 ^ ((long)Math.min(this.c.G, r.length - n2) << (n3 ^= x[101]) ^ l3) & -1L << (n4 -= x[104]);
            int n5 = x[105];
            n5 += x[106];
            indexColorModel = new IndexColorModel(bits, r.length, r, g2, b2, (int)(l2 >>> (n5 -= x[107])));
        } else {
            indexColorModel = new IndexColorModel(bits, r.length, r, g2, b2);
        }
        int n6 = x[108];
        n6 ^= x[109];
        if (bits == (n6 -= x[110])) {
            int n7 = x[111];
            n7 -= x[112];
            int[] nArray = new int[n7 += x[113]];
            int n8 = x[114];
            n8 += x[115];
            int n9 = x[117];
            n9 ^= x[118];
            nArray[n8 ^= b_0.x[116]] = n9 += x[119];
            int[] nArray2 = nArray;
            int n10 = x[120];
            n10 += x[121];
            n10 += x[122];
            int n11 = x[123];
            n11 += x[124];
            n11 += x[125];
            int n12 = x[126];
            n12 -= x[127];
            int n13 = x[129];
            n13 ^= x[130];
            int n14 = x[132];
            n14 ^= x[133];
            sampleModel = new PixelInterleavedSampleModel(n10, n11, n12 -= x[128], n13 ^= x[131], n14 += x[134], nArray2);
        } else {
            int n15 = x[135];
            n15 += x[136];
            int n16 = x[138];
            n16 ^= x[139];
            int n17 = x[141];
            n17 ^= x[142];
            sampleModel = new MultiPixelPackedSampleModel(n15 ^= x[137], n16 -= x[140], n17 += x[143], bits);
        }
        return new ImageTypeSpecifier(indexColorModel, sampleModel);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Iterator<ImageTypeSpecifier> getImageTypes(int imageIndex) {
        block9: {
            block10: {
                block8: {
                    var33_2 = -909051570617083773L;
                    var35_3 = -3106156292580179345L;
                    var37_4 = 8366639099358310602L;
                    var39_5 = 6395110073355280783L;
                    var41_6 = -187539772469221350L;
                    var43_7 = 81512381045358282L;
                    var13_8 = -6591955480974141496L;
                    var15_9 = 7500980940397900450L;
                    var17_10 = -2280599073477892639L;
                    var19_11 = 6997883324851467981L;
                    var21_12 = -1029838775585728782L;
                    var23_13 = 2753727447709580839L;
                    var25_14 = 9055136096524380451L;
                    var27_15 = 4717643315084875752L;
                    var29_16 = -4764335051371246454L;
                    var31_17 = -2168767343658692071L;
                    this.checkIndex(imageIndex);
                    var46_18 = b_0.x[144];
                    var46_18 ^= b_0.x[145];
                    v0 = var13_8;
                    var48_19 = b_0.x[147];
                    var48_19 += b_0.x[148];
                    var13_8 = v0 ^ ((long)this.locateImage(imageIndex) << (var46_18 -= b_0.x[146]) ^ v0) & -1L << (var48_19 += b_0.x[149]);
                    var50_20 = b_0.x[150];
                    var50_20 ^= b_0.x[151];
                    if ((int)(var13_8 >>> (var50_20 += b_0.x[152])) != imageIndex) {
                        throw new IndexOutOfBoundsException();
                    }
                    this.readMetadata();
                    var52_21 = b_0.x[153];
                    var52_21 ^= b_0.x[154];
                    var3_22 = new ArrayList<ImageTypeSpecifier>(var52_21 += b_0.x[155]);
                    if (this.c.e != null) {
                        var4_23 = this.c.e;
                        this.M = this.c.e;
                    } else {
                        var4_23 = this.b.f;
                    }
                    if (var4_23 == null) {
                        if (this.M == null) {
                            var54_24 = b_0.x[156];
                            var54_24 += b_0.x[157];
                            var56_25 = b_0.x[159];
                            var56_25 ^= b_0.x[160];
                            this.processWarningOccurred((String)b_0.U[var54_24 += b_0.x[158]] + (String)b_0.U[var56_25 ^= b_0.x[161]]);
                            this.M = b_0.getDefaultPalette();
                        }
                        var4_23 = this.M;
                    }
                    var58_26 = b_0.x[162];
                    var58_26 += b_0.x[163];
                    v1 = var31_17;
                    var60_27 = b_0.x[165];
                    var60_27 -= b_0.x[166];
                    var31_17 = v1 ^ ((long)(var4_23.length / (var58_26 ^= b_0.x[164])) ^ v1) & -1L >>> (var60_27 ^= b_0.x[167]);
                    var62_28 = b_0.x[168];
                    var62_28 += b_0.x[169];
                    if ((int)var31_17 != (var62_28 -= b_0.x[170])) break block8;
                    v2 = var23_13;
                    var64_29 = b_0.x[171];
                    var64_29 -= b_0.x[172];
                    var23_13 = v2 ^ (0x100000000L ^ v2) & -1L << (var64_29 += b_0.x[173]);
                    break block9;
                }
                var66_30 = b_0.x[174];
                var66_30 += b_0.x[175];
                if ((int)var31_17 != (var66_30 ^= b_0.x[176])) break block10;
                v3 = var23_13;
                var68_31 = b_0.x[177];
                var68_31 ^= b_0.x[178];
                var23_13 = v3 ^ (0x200000000L ^ v3) & -1L << (var68_31 ^= b_0.x[179]);
                break block9;
            }
            var70_32 = b_0.x[180];
            var70_32 -= b_0.x[181];
            if ((int)var31_17 == (var70_32 += b_0.x[182])) ** GOTO lbl-1000
            var72_33 = b_0.x[183];
            var72_33 += b_0.x[184];
            if ((int)var31_17 == (var72_33 += b_0.x[185])) lbl-1000:
            // 2 sources

            {
                v4 = var23_13;
                var74_34 = b_0.x[186];
                var74_34 += b_0.x[187];
                var23_13 = v4 ^ (0x400000000L ^ v4) & -1L << (var74_34 -= b_0.x[188]);
            } else {
                v5 = var23_13;
                var76_35 = b_0.x[189];
                var76_35 += b_0.x[190];
                var23_13 = v5 ^ (0x800000000L ^ v5) & -1L << (var76_35 += b_0.x[191]);
            }
        }
        var78_36 = b_0.x[192];
        var78_36 ^= b_0.x[193];
        var78_36 += b_0.x[194];
        var80_37 = b_0.x[195];
        var80_37 += b_0.x[196];
        var80_37 -= b_0.x[197];
        var82_38 = b_0.x[198];
        var82_38 += b_0.x[199];
        v6 = var27_15;
        var84_39 = b_0.x[201];
        var84_39 -= b_0.x[202];
        var27_15 = v6 ^ ((long)(var78_36 << (int)(var23_13 >>> var80_37)) << (var82_38 -= b_0.x[200]) ^ v6) & -1L << (var84_39 += b_0.x[203]);
        var86_40 = b_0.x[204];
        var86_40 ^= b_0.x[205];
        var8_41 = new byte[(int)(var27_15 >>> (var86_40 += b_0.x[206]))];
        var88_42 = b_0.x[207];
        var88_42 += b_0.x[208];
        var9_43 = new byte[(int)(var27_15 >>> (var88_42 ^= b_0.x[209]))];
        var90_44 = b_0.x[210];
        var90_44 += b_0.x[211];
        var10_45 = new byte[(int)(var27_15 >>> (var90_44 ^= b_0.x[212]))];
        v7 = var29_16;
        var92_46 = b_0.x[213];
        var92_46 ^= b_0.x[214];
        var29_16 = v7 ^ (0L ^ v7) & -1L << (var92_46 += b_0.x[215]);
        v8 = var31_17;
        var94_47 = b_0.x[216];
        var94_47 ^= b_0.x[217];
        var31_17 = v8 ^ (0L ^ v8) & -1L << (var94_47 -= b_0.x[218]);
        while (true) {
            var96_48 = b_0.x[219];
            var96_48 -= b_0.x[220];
            if ((int)(var31_17 >>> (var96_48 += b_0.x[221])) >= (int)var31_17) break;
            var98_49 = b_0.x[222];
            var98_49 += b_0.x[223];
            var100_50 = b_0.x[225];
            var100_50 -= b_0.x[226];
            v9 = (int)(var29_16 >>> (var100_50 -= b_0.x[227]));
            var29_16 += 0x100000000L;
            var8_41[(int)(var31_17 >>> (var98_49 -= b_0.x[224]))] = var4_23[v9];
            var102_51 = b_0.x[228];
            var102_51 += b_0.x[229];
            var104_52 = b_0.x[231];
            var104_52 -= b_0.x[232];
            v10 = (int)(var29_16 >>> (var104_52 ^= b_0.x[233]));
            var29_16 += 0x100000000L;
            var9_43[(int)(var31_17 >>> (var102_51 ^= b_0.x[230]))] = var4_23[v10];
            var106_53 = b_0.x[234];
            var106_53 ^= b_0.x[235];
            var108_54 = b_0.x[237];
            var108_54 -= b_0.x[238];
            v11 = (int)(var29_16 >>> (var108_54 += b_0.x[239]));
            var29_16 += 0x100000000L;
            var10_45[(int)(var31_17 >>> (var106_53 ^= b_0.x[236]))] = var4_23[v11];
            var31_17 += 0x100000000L;
        }
        var110_55 = b_0.x[240];
        var110_55 ^= b_0.x[241];
        var3_22.add(this.createIndexed(var8_41, var9_43, var10_45, (int)(var23_13 >>> (var110_55 -= b_0.x[242]))));
        return var3_22.iterator();
    }

    @Override
    public ImageReadParam getDefaultReadParam() {
        return new ImageReadParam();
    }

    @Override
    public IIOMetadata getStreamMetadata() {
        this.readHeader();
        return this.b;
    }

    @Override
    public IIOMetadata getImageMetadata(int imageIndex) {
        long l2 = -6588270249310483267L;
        this.checkIndex(imageIndex);
        int n2 = x[243];
        n2 ^= x[244];
        long l3 = l2;
        int n3 = x[246];
        n3 += x[247];
        l2 = l3 ^ ((long)this.locateImage(imageIndex) << (n2 -= x[245]) ^ l3) & -1L << (n3 -= x[248]);
        int n4 = x[249];
        n4 -= x[250];
        if ((int)(l2 >>> (n4 += x[251])) != imageIndex) {
            int n5 = x[252];
            n5 ^= x[253];
            int n6 = x[255];
            n6 ^= x[256];
            throw new IndexOutOfBoundsException((String)U[n5 -= x[254]] + (String)U[n6 ^= x[257]]);
        }
        this.readMetadata();
        return this.c;
    }

    private void initNext32Bits() {
        int n2 = x[258];
        n2 ^= x[259];
        int n3 = x[261];
        n3 ^= x[262];
        this.H = this.e[n2 ^= x[260]] & (n3 -= x[263]);
        int n4 = x[264];
        n4 ^= x[265];
        int n5 = x[267];
        n5 ^= x[268];
        int n6 = x[270];
        n6 -= x[271];
        this.H |= (this.e[n4 -= x[266]] & (n5 += x[269])) << (n6 -= x[272]);
        int n7 = x[273];
        n7 ^= x[274];
        int n8 = x[276];
        n8 ^= x[277];
        int n9 = x[279];
        n9 += x[280];
        this.H |= (this.e[n7 ^= x[275]] & (n8 -= x[278])) << (n9 ^= x[281]);
        int n10 = x[282];
        n10 -= x[283];
        int n11 = x[285];
        n11 ^= x[286];
        this.H |= this.e[n10 += x[284]] << (n11 -= x[287]);
        int n12 = x[288];
        n12 -= x[289];
        this.F = n12 ^= x[290];
    }

    private int getCode(int codeSize, int codeMask) {
        long l2 = -2641987281996411069L;
        long l3 = -6990133213960372311L;
        long l4 = -2927708733455613078L;
        long l5 = 6379955650769522081L;
        long l6 = -2676185642713248711L;
        long l7 = 4302342294749963961L;
        long l8 = -7262359410056865666L;
        long l9 = 864652798035261781L;
        int n2 = x[291];
        n2 += x[292];
        if (this.f + codeSize > (n2 += x[293])) {
            return this.h;
        }
        int n3 = x[294];
        n3 += x[295];
        long l10 = l5;
        int n4 = x[297];
        n4 += x[298];
        l5 = l10 ^ ((long)(this.H >> this.f & codeMask) << (n3 ^= x[296]) ^ l10) & -1L << (n4 ^= x[299]);
        this.f += codeSize;
        while (true) {
            int n5 = x[300];
            n5 -= x[301];
            if (this.f < (n5 += x[302]) || this.i) break;
            int n6 = x[303];
            n6 ^= x[304];
            this.H >>>= (n6 ^= x[305]);
            int n7 = x[306];
            n7 ^= x[307];
            this.f -= (n7 += x[308]);
            if (this.F >= this.E) {
                this.E = this.a.readUnsignedByte();
                if (this.E == 0) {
                    int n8 = x[309];
                    n8 += x[310];
                    this.i = n8 -= x[311];
                    int n9 = x[312];
                    n9 ^= x[313];
                    return (int)(l5 >>> (n9 -= x[314]));
                }
                int n10 = x[315];
                n10 ^= x[316];
                long l11 = l8;
                int n11 = x[318];
                n11 -= x[319];
                l8 = l11 ^ ((long)this.E << (n10 -= x[317]) ^ l11) & -1L << (n11 ^= x[320]);
                long l12 = l9;
                int n12 = x[321];
                n12 -= x[322];
                l9 = l12 ^ (0L ^ l12) & -1L >>> (n12 += x[323]);
                while (true) {
                    int n13 = x[324];
                    n13 += x[325];
                    if ((int)(l8 >>> (n13 ^= x[326])) <= 0) break;
                    int n14 = x[327];
                    n14 += x[328];
                    n14 += x[329];
                    int n15 = x[330];
                    n15 -= x[331];
                    long l13 = l9;
                    int n16 = x[333];
                    n16 -= x[334];
                    l9 = l13 ^ ((long)this.a.read(this.e, (int)l9, (int)(l8 >>> n14)) << (n15 -= x[332]) ^ l13) & -1L << (n16 ^= x[335]);
                    int n17 = x[336];
                    n17 += x[337];
                    int n18 = x[339];
                    n18 += x[340];
                    if ((int)(l9 >>> (n17 -= x[338])) == (n18 += x[341])) {
                        int n19 = x[342];
                        n19 += x[343];
                        int n20 = x[345];
                        n20 += x[346];
                        int n21 = x[348];
                        n21 -= x[349];
                        throw new IIOException((String)U[n19 += x[344]] + (String)U[n20 ^= x[347]] + (String)U[n21 += x[350]]);
                    }
                    int n22 = x[351];
                    n22 += x[352];
                    long l14 = l9;
                    int n23 = x[354];
                    n23 += x[355];
                    l9 = l14 ^ ((long)((int)l9 + (int)(l9 >>> (n22 -= x[353]))) ^ l14) & -1L >>> (n23 -= x[356]);
                    int n24 = x[357];
                    n24 -= x[358];
                    n24 ^= x[359];
                    int n25 = x[360];
                    n25 ^= x[361];
                    n25 -= x[362];
                    int n26 = x[363];
                    n26 ^= x[364];
                    long l15 = l8;
                    int n27 = x[366];
                    n27 ^= x[367];
                    l8 = l15 ^ ((long)((int)(l8 >>> n24) - (int)(l9 >>> n25)) << (n26 += x[365]) ^ l15) & -1L << (n27 ^= x[368]);
                }
                int n28 = x[369];
                n28 += x[370];
                this.F = n28 += x[371];
            }
            int n29 = this.F;
            int n30 = x[372];
            n30 += x[373];
            this.F = n29 + (n30 -= x[374]);
            int n31 = x[375];
            n31 -= x[376];
            this.H |= this.e[n29] << (n31 += x[377]);
        }
        int n32 = x[378];
        n32 -= x[379];
        return (int)(l5 >>> (n32 -= x[380]));
    }

    public void initializeStringTable(int[] prefix, byte[] suffix, byte[] initial, int[] length) {
        long l2 = -7362961470910442793L;
        long l3 = 1591697485586136572L;
        long l4 = 5052472478106944429L;
        long l5 = 4667543888036654193L;
        long l6 = -5718964173729456542L;
        long l7 = 838996314876718596L;
        long l8 = -7585873661231370810L;
        long l9 = -1291936465913437915L;
        long l10 = -5158452263455714354L;
        int n2 = x[381];
        n2 ^= x[382];
        long l11 = l7;
        int n3 = x[384];
        n3 -= x[385];
        l7 = l11 ^ ((long)((n2 ^= x[383]) << this.g) ^ l11) & -1L >>> (n3 ^= x[386]);
        long l12 = l10;
        int n4 = x[387];
        n4 += x[388];
        l10 = l12 ^ (0L ^ l12) & -1L << (n4 -= x[389]);
        while (true) {
            int n5 = x[390];
            n5 += x[391];
            if ((int)(l10 >>> (n5 += x[392])) >= (int)l7) break;
            int n6 = x[393];
            n6 += x[394];
            int n7 = x[396];
            n7 ^= x[397];
            prefix[(int)(l10 >>> (n6 -= b_0.x[395]))] = n7 += x[398];
            int n8 = x[399];
            n8 -= 54;
            int n9 = -55;
            n9 -= 23;
            suffix[(int)(l10 >>> (n8 += -11))] = (byte)(l10 >>> (n9 += 110));
            int n10 = -71;
            n10 += 114;
            int n11 = 57;
            n11 ^= 0xFFFFFFCD;
            initial[(int)(l10 >>> (n10 += -11))] = (byte)(l10 >>> (n11 += 44));
            int n12 = -126;
            n12 ^= 0x52;
            int n13 = -53;
            n13 += 97;
            length[(int)(l10 >>> (n12 -= -80))] = n13 += -43;
            l10 += 0x100000000L;
        }
        int n14 = 51;
        n14 += 88;
        long l13 = l10;
        int n15 = 30;
        n15 -= 59;
        l10 = l13 ^ ((long)((int)l7) << (n14 += -107) ^ l13) & -1L << (n15 ^= 0xFFFFFFC3);
        while (true) {
            int n16 = 86;
            n16 -= -41;
            int n17 = 4039;
            n17 += 10;
            if ((int)(l10 >>> (n16 ^= 0x5F)) >= (n17 += 47)) break;
            int n18 = 8;
            n18 -= 97;
            int n19 = 139;
            n19 += -69;
            prefix[(int)(l10 >>> (n18 -= -121))] = n19 ^= 0xFFFFFFB9;
            int n20 = -6;
            n20 ^= 0xFFFFFF85;
            int n21 = -149;
            n21 += 119;
            length[(int)(l10 >>> (n20 ^= 0x5F))] = n21 += 31;
            l10 += 0x100000000L;
        }
    }

    private void outputRow() {
        long l2 = -1974572127544229319L;
        long l3 = -4942602838564171641L;
        long l4 = -9081569698828481104L;
        long l5 = 1786193016436245575L;
        long l6 = -1833234917219111081L;
        long l7 = 4167480032570990886L;
        long l8 = 5959844654032507626L;
        int n2 = -20;
        n2 ^= 0xFFFFFFBB;
        long l9 = l6;
        int n3 = 65;
        n3 -= -12;
        l6 = l9 ^ ((long)Math.min(this.o.width, this.r.width * this.O) << (n2 ^= 0x77) ^ l9) & -1L << (n3 ^= 0x6D);
        long l10 = l8;
        int n4 = 198;
        n4 ^= 0x5B;
        l8 = l10 ^ ((long)this.r.x ^ l10) & -1L >>> (n4 += -125);
        int n5 = 4;
        n5 -= -21;
        if (this.O == (n5 -= 24)) {
            int n6 = -102;
            n6 += 123;
            int n7 = -38;
            n7 += -72;
            this.j.setDataElements((int)l8, this.t, (int)(l6 >>> (n6 += 11)), n7 -= -111, this.T);
        } else {
            long l11 = l8;
            int n8 = -118;
            n8 += 103;
            l8 = l11 ^ (0L ^ l11) & -1L << (n8 += 47);
            while (true) {
                int n9 = 43;
                n9 += -3;
                int n10 = 131;
                n10 -= 64;
                if ((int)(l8 >>> (n9 -= 8)) >= (int)(l6 >>> (n10 += -35))) break;
                int n11 = 114;
                n11 ^= 0x28;
                int n12 = -65;
                n12 -= 3;
                int n13 = 141;
                n13 += 7;
                this.j.setSample((int)l8, this.t, n11 -= 90, this.T[(int)(l8 >>> (n12 -= -100))] & (n13 += 107));
                int n14 = -70;
                n14 ^= 0x43;
                n14 ^= 0xFFFFFFD9;
                int n15 = -158;
                n15 += 64;
                long l12 = l8;
                int n16 = 139;
                n16 -= 12;
                long l13 = l8 = l12 ^ ((long)((int)(l8 >>> n14) + this.O) << (n15 ^= 0xFFFFFF82) ^ l12) & -1L << (n16 -= 95);
                int n17 = -61;
                n17 ^= 7;
                int n18 = -35;
                n18 -= 3;
                l8 = l13 ^ (l13 ^ l13 + (long)(n17 ^= 0xFFFFFFC5)) & -1L >>> (n18 ^= 0xFFFFFFFA);
            }
        }
        if (this.updateListeners != null) {
            int n19 = -121;
            n19 ^= 0x50;
            int[] nArray = new int[n19 ^= 0xFFFFFFD6];
            int n20 = -74;
            n20 -= -33;
            int n21 = 107;
            n21 ^= 0x66;
            nArray[n20 -= -41] = n21 ^= 0xD;
            int[] nArray2 = nArray;
            int n22 = -102;
            n22 -= -91;
            int n23 = 21;
            n23 -= 65;
            int n24 = 52;
            n24 -= -9;
            this.processImageUpdate(this.I, (int)l8, this.t, (int)(l6 >>> (n22 += 43)), n23 -= -45, n24 -= 60, this.s, nArray2);
        }
    }

    private void computeDecodeThisRow() {
        int n2;
        if (this.t < this.r.y + this.r.height && this.l >= this.o.y && this.l < this.o.y + this.o.height && (this.l - this.o.y) % this.p == 0) {
            int n3 = 39;
            n3 += -101;
            n2 = n3 += 63;
        } else {
            int n4 = -12;
            n4 += 58;
            n2 = n4 += -46;
        }
        this.S = n2;
    }

    private void outputPixels(byte[] string, int len) {
        long l2 = -8887832579427270740L;
        long l3 = 66886116371376621L;
        if (this.m < this.P || this.m > this.q) {
            return;
        }
        long l4 = l3;
        int n2 = -123;
        n2 += 84;
        l3 = l4 ^ (0L ^ l4) & -1L << (n2 += 71);
        while (true) {
            int n3 = -30;
            n3 -= -39;
            if ((int)(l3 >>> (n3 ^= 0x29)) >= len) break;
            if (this.K >= this.o.x) {
                int n4 = -65;
                n4 ^= 0xFFFFFFAA;
                this.T[this.K - this.o.x] = string[(int)(l3 >>> (n4 -= -11))];
            }
            int n5 = 127;
            n5 -= 94;
            this.K += (n5 += -32);
            if (this.K == this.J) {
                int n6 = 12;
                n6 += -27;
                this.L += (n6 ^= 0xFFFFFFF0);
                this.processImageProgress(100.0f * (float)this.L / (float)this.k);
                if (this.abortRequested()) {
                    return;
                }
                if (this.S) {
                    this.outputRow();
                }
                int n7 = -80;
                n7 ^= 0xFFFFFF8F;
                this.K = n7 += -63;
                if (this.c.d) {
                    this.l += n[this.m];
                    if (this.l >= this.k) {
                        if (this.updateListeners != null) {
                            this.processPassComplete(this.I);
                        }
                        int n8 = 85;
                        n8 -= 22;
                        this.m += (n8 -= 62);
                        if (this.m > this.q) {
                            return;
                        }
                        this.l = N[this.m];
                        this.startPass(this.m);
                    }
                } else {
                    int n9 = 65;
                    n9 -= 24;
                    this.l += (n9 ^= 0x28);
                }
                this.t = this.r.y + (this.l - this.o.y) / this.p;
                this.computeDecodeThisRow();
            }
            l3 += 0x100000000L;
        }
    }

    private void readHeader() {
        long l2 = 8543969854602136267L;
        long l3 = -2718412033190856005L;
        long l4 = 6421103972926453519L;
        long l5 = -3192124332430242594L;
        long l6 = -5539343440638379757L;
        if (this.A) {
            return;
        }
        if (this.a == null) {
            int n2 = 112;
            n2 ^= 0xFFFFFFDB;
            throw new IllegalStateException((String)U[n2 -= -103]);
        }
        this.b = new b();
        try {
            int n3;
            int n4;
            this.a.setByteOrder(ByteOrder.LITTLE_ENDIAN);
            int n5 = -119;
            n5 -= -26;
            byte[] byArray = new byte[n5 ^= 0xFFFFFFA5];
            this.a.readFully(byArray);
            int n6 = 26;
            n6 -= -3;
            StringBuilder stringBuilder = new StringBuilder(n6 -= 26);
            int n7 = 45;
            n7 -= 98;
            stringBuilder.append((char)byArray[n7 += 56]);
            int n8 = 42;
            n8 += -9;
            stringBuilder.append((char)byArray[n8 -= 29]);
            int n9 = 122;
            n9 -= -10;
            stringBuilder.append((char)byArray[n9 += -127]);
            this.b.b = stringBuilder.toString();
            this.b.B = this.a.readUnsignedShort();
            this.b.c = this.a.readUnsignedShort();
            int n10 = 35;
            n10 += 83;
            long l7 = l4;
            int n11 = -66;
            n11 += 24;
            l4 = l7 ^ ((long)this.a.readUnsignedByte() << (n10 += -86) ^ l7) & -1L << (n11 += 74);
            int n12 = -1;
            n12 -= 64;
            int n13 = -249;
            n13 ^= 0xFFFFFFBD;
            if (((int)(l4 >>> (n12 -= -97)) & (n13 += -58)) != 0) {
                int n14 = 54;
                n14 -= 82;
                n4 = n14 += 29;
            } else {
                int n15 = -91;
                n15 += 17;
                n4 = n15 -= -74;
            }
            long l8 = l5;
            int n16 = 99;
            n16 -= -17;
            l5 = l8 ^ ((long)n4 ^ l8) & -1L >>> (n16 -= 84);
            int n17 = -16;
            n17 -= -25;
            n17 ^= 0x29;
            int n18 = 44;
            n18 += 3;
            int n19 = -37;
            n19 ^= 0;
            int n20 = 20;
            n20 += -50;
            this.b.C = ((int)(l4 >>> n17) >> (n18 -= 43) & (n19 -= -44)) + (n20 ^= 0xFFFFFFE3);
            int n21 = -99;
            n21 += 113;
            int n22 = -93;
            n22 ^= 9;
            if (((int)(l4 >>> (n21 ^= 0x2E)) & (n22 -= -94)) != 0) {
                int n23 = 164;
                n23 -= 121;
                n3 = n23 -= 42;
            } else {
                int n24 = 122;
                n24 += -27;
                n3 = n24 -= 95;
            }
            this.b.e = n3;
            int n25 = 45;
            n25 -= 72;
            n25 += 28;
            int n26 = 45;
            n26 -= 23;
            n26 += 10;
            int n27 = -22;
            n27 += 21;
            n27 += 8;
            int n28 = -34;
            n28 += -37;
            n28 -= -72;
            int n29 = 41;
            n29 ^= 6;
            long l9 = l6;
            int n30 = 169;
            n30 -= 82;
            l6 = l9 ^ ((long)(n25 << ((int)(l4 >>> n26) & n27) + n28) << (n29 += -15) ^ l9) & -1L << (n30 += -55);
            this.b.D = this.a.readUnsignedByte();
            this.b.d = this.a.readUnsignedByte();
            if ((int)l5 != 0) {
                int n31 = -126;
                n31 += 114;
                int n32 = 181;
                n32 -= 41;
                this.b.f = new byte[(n31 -= -15) * (int)(l6 >>> (n32 -= 108))];
                this.a.readFully(this.b.f);
            } else {
                this.b.f = null;
            }
            this.C.add(this.a.getStreamPosition());
        }
        catch (IOException iOException) {
            int n33 = -53;
            n33 -= -84;
            int n34 = 13;
            n34 += -33;
            throw new IIOException((String)U[n33 += -31] + (String)U[n34 ^= 0xFFFFFFE9], iOException);
        }
        int n35 = 177;
        n35 += -115;
        this.A = n35 -= 61;
    }

    private boolean skipImage() {
        long l2 = 2666267853914277537L;
        long l3 = 7649825074554023734L;
        long l4 = -8968486914133913628L;
        long l5 = -780495511710076273L;
        long l6 = 8234136964776218158L;
        long l7 = -1653221167738535139L;
        long l8 = 594193170922425864L;
        long l9 = 3302957062642303811L;
        long l10 = 2630078810713894280L;
        long l11 = -558107696998386062L;
        long l12 = 7281024872352128043L;
        long l13 = 2619578645929588519L;
        try {
            while (true) {
                long l14 = l13;
                int n2 = 9;
                n2 ^= 0x42;
                l13 = l14 ^ ((long)this.a.readUnsignedByte() ^ l14) & -1L >>> (n2 -= 43);
                int n3 = 125;
                n3 += -50;
                if ((int)l13 == (n3 ^= 0x67)) {
                    int n4 = 121;
                    n4 += -5;
                    this.a.skipBytes(n4 -= 108);
                    int n5 = 24;
                    n5 += -55;
                    long l15 = l11;
                    int n6 = 111;
                    n6 ^= 0xFFFFFFDE;
                    l11 = l15 ^ ((long)this.a.readUnsignedByte() << (n5 -= -63) ^ l15) & -1L << (n6 ^= 0xFFFFFF91);
                    int n7 = 8;
                    n7 -= -82;
                    int n8 = -139;
                    n8 ^= 0xFFFFFFDF;
                    if (((int)(l11 >>> (n7 += -58)) & (n8 -= 42)) != 0) {
                        int n9 = -9;
                        n9 += 57;
                        n9 += -16;
                        int n10 = 57;
                        n10 -= -20;
                        n10 -= 70;
                        int n11 = -153;
                        n11 += 82;
                        n11 -= -72;
                        int n12 = -92;
                        n12 -= -13;
                        long l16 = l13;
                        int n13 = -73;
                        n13 -= -115;
                        l13 = l16 ^ ((long)(((int)(l11 >>> n9) & n10) + n11) << (n12 += 111) ^ l16) & -1L << (n13 += -10);
                        int n14 = 51;
                        n14 ^= 0xFFFFFF99;
                        int n15 = 114;
                        n15 += -99;
                        int n16 = -40;
                        n16 -= 17;
                        this.a.skipBytes((n14 -= -89) * ((n15 -= 14) << (int)(l13 >>> (n16 ^= 0xFFFFFFE7))));
                    }
                    int n17 = 87;
                    n17 -= -36;
                    this.a.skipBytes(n17 += -122);
                    long l17 = l13;
                    int n18 = 74;
                    n18 ^= 0xFFFFFFCF;
                    l13 = l17 ^ (0L ^ l17) & -1L << (n18 ^= 0xFFFFFFA5);
                    do {
                        int n19 = 47;
                        n19 -= 40;
                        long l18 = l13;
                        int n20 = 14;
                        n20 += 16;
                        l13 = l18 ^ ((long)this.a.readUnsignedByte() << (n19 += 25) ^ l18) & -1L << (n20 ^= 0x3E);
                        int n21 = -66;
                        n21 ^= 0xFFFFFFC7;
                        this.a.skipBytes((int)(l13 >>> (n21 -= 89)));
                        int n22 = -140;
                        n22 -= -99;
                    } while ((int)(l13 >>> (n22 += 73)) > 0);
                    int n9 = -86;
                    n9 = n9 ^ 0xFFFFFF8C;
                    boolean bl2 = n9 ^ 0x27;
                    return bl2;
                }
                int n23 = 65;
                n23 ^= 0xFFFFFF9A;
                if ((int)l13 == (n23 -= -96)) {
                    int n11 = 6;
                    n11 = n11 ^ 0x22;
                    boolean bl = n11 - 36;
                    return bl;
                }
                int n24 = 42;
                n24 -= 96;
                if ((int)l13 == (n24 -= -87)) {
                    int n25 = 39;
                    n25 -= 26;
                    long l19 = l11;
                    int n26 = 124;
                    n26 -= 16;
                    l11 = l19 ^ ((long)this.a.readUnsignedByte() << (n25 ^= 0x2D) ^ l19) & -1L << (n26 += -76);
                    long l20 = l13;
                    int n27 = 46;
                    n27 ^= 0xFFFFFF9B;
                    l13 = l20 ^ (0L ^ l20) & -1L << (n27 ^= 0xFFFFFF95);
                    do {
                        int n28 = -79;
                        n28 -= -121;
                        long l21 = l13;
                        int n29 = 81;
                        n29 ^= 0x4E;
                        l13 = l21 ^ ((long)this.a.readUnsignedByte() << (n28 ^= 0xA) ^ l21) & -1L << (n29 ^= 0x3F);
                        int n30 = 224;
                        n30 -= 99;
                        this.a.skipBytes((int)(l13 >>> (n30 -= 93)));
                        int n31 = 20;
                        n31 += 54;
                    } while ((int)(l13 >>> (n31 ^= 0x6A)) > 0);
                    continue;
                }
                if ((int)l13 == 0) {
                    int n13 = -57;
                    n13 = n13 - 0;
                    boolean bl = n13 ^ 0xFFFFFFC7;
                    return bl;
                }
                long l22 = l11;
                int n32 = 14;
                n32 ^= 0x51;
                l11 = l22 ^ (0L ^ l22) & -1L << (n32 += -63);
                do {
                    int n33 = 122;
                    n33 -= 97;
                    long l23 = l11;
                    int n34 = 94;
                    n34 -= 119;
                    l11 = l23 ^ ((long)this.a.readUnsignedByte() << (n33 -= -7) ^ l23) & -1L << (n34 ^= 0xFFFFFFC7);
                    int n35 = -151;
                    n35 += 71;
                    this.a.skipBytes((int)(l11 >>> (n35 -= -112)));
                    int n36 = 58;
                    n36 += 37;
                } while ((int)(l11 >>> (n36 -= 63)) > 0);
            }
        }
        catch (EOFException eOFException) {
            int n15 = 37;
            n15 = n15 + 33;
            boolean bl = n15 ^ 0x46;
            return bl;
        }
        catch (IOException iOException) {
            int n16 = -61;
            n16 -= -114;
            int n17 = -58;
            n17 ^= 0x33;
            throw new IIOException((String)U[n16 ^= 0x3C] + (String)U[n17 += 26], iOException);
        }
    }

    private int locateImage(int imageIndex) {
        long l2 = -4326589796981865496L;
        long l3 = 3560047528794626072L;
        long l4 = 305942329342766977L;
        this.readHeader();
        try {
            int n2 = -58;
            n2 ^= 0x54;
            n2 -= -111;
            int n3 = 48;
            n3 += 2;
            long l5 = l4;
            int n4 = -8;
            n4 ^= 0x19;
            l4 = l5 ^ ((long)Math.min(imageIndex, this.C.size() - n2) << (n3 ^= 0x12) ^ l5) & -1L << (n4 -= -63);
            int n5 = 53;
            n5 ^= 0x1A;
            Long l6 = this.C.get((int)(l4 >>> (n5 += -15)));
            this.a.seek(l6);
            while (true) {
                int n6 = 78;
                n6 ^= 0xFFFFFF9F;
                if ((int)(l4 >>> (n6 -= -79)) < imageIndex) {
                    if (!this.skipImage()) {
                        int n7 = 30;
                        n7 += -90;
                        return (int)((l4 += -4294967296L) >>> (n7 -= -92));
                    }
                    Long l7 = this.a.getStreamPosition();
                    this.C.add(l7);
                    l4 += 0x100000000L;
                    continue;
                }
                break;
            }
        }
        catch (IOException iOException) {
            int n8 = -13;
            n8 += -6;
            throw new IIOException((String)U[n8 ^= 0xFFFFFFE5], iOException);
        }
        if (this.B != imageIndex) {
            this.c = null;
        }
        this.B = imageIndex;
        return imageIndex;
    }

    private byte[] concatenateBlocks() {
        long l2 = 1972186362420831401L;
        long l3 = 444242525267067419L;
        long l4 = -2746920362522168155L;
        int n2 = 55;
        n2 += 24;
        byte[] byArray = new byte[n2 -= 79];
        while (true) {
            int n3 = -202;
            n3 ^= 0xFFFFFFB8;
            long l5 = l4;
            int n4 = -111;
            n4 ^= 0x75;
            l4 = l5 ^ ((long)this.a.readUnsignedByte() << (n3 -= 110) ^ l5) & -1L << (n4 -= -60);
            int n5 = 213;
            n5 += -66;
            if ((int)(l4 >>> (n5 += -115)) == 0) break;
            if (this.ignoreMetadata) {
                int n6 = 60;
                n6 += -13;
                this.a.skipBytes((int)(l4 >>> (n6 += -15)));
                continue;
            }
            int n7 = 17;
            n7 -= -7;
            byte[] byArray2 = kotakbaz.rain.client.render.texture.utils.gif.common.a.staggeredReadByteStream(this.a, (int)(l4 >>> (n7 ^= 0x38)));
            int n8 = 10;
            n8 += 113;
            byte[] byArray3 = new byte[byArray.length + (int)(l4 >>> (n8 -= 91))];
            int n9 = -39;
            n9 ^= 0x60;
            int n10 = -21;
            n10 -= 68;
            System.arraycopy(byArray, n9 ^= 0xFFFFFFB9, byArray3, n10 -= -89, byArray.length);
            int n11 = 61;
            n11 -= 124;
            int n12 = 99;
            n12 += 39;
            System.arraycopy(byArray2, n11 += 63, byArray3, byArray.length, (int)(l4 >>> (n12 -= 106)));
            byArray = byArray3;
        }
        return byArray;
    }

    private void readMetadata() {
        long l2 = 4773610623051502609L;
        long l3 = -1962884013776287959L;
        long l4 = -9087359376015734524L;
        long l5 = -4419055785685706525L;
        long l6 = 1005478648456327990L;
        long l7 = 2002766687675033980L;
        long l8 = -723644135527917544L;
        long l9 = -2826311928666643374L;
        long l10 = 7423499412868246049L;
        long l11 = -8510735690072121238L;
        long l12 = -3497250169747223584L;
        long l13 = 4272780393505156005L;
        long l14 = 7821975220695068756L;
        long l15 = 5648270446248744240L;
        long l16 = -1580973069219861381L;
        long l17 = 4966712941243247425L;
        long l18 = -6836996558654321112L;
        long l19 = 4470095257056698367L;
        long l20 = 6583006531927378969L;
        long l21 = 6238762102503803329L;
        long l22 = 235042028450816840L;
        long l23 = 1381075141360038523L;
        long l24 = 8700647626369316225L;
        long l25 = 6430938995544795764L;
        long l26 = -7217244767793906380L;
        if (this.a == null) {
            int n2 = -159;
            n2 += 98;
            throw new IllegalStateException((String)U[n2 -= -86]);
        }
        try {
            this.c = new a_0();
            long l27 = this.a.getStreamPosition();
            while (true) {
                int n3 = 165;
                n3 += -67;
                long l28 = l25;
                int n4 = 27;
                n4 ^= 0xFFFFFFCB;
                l25 = l28 ^ ((long)this.a.readUnsignedByte() << (n3 ^= 0x42) ^ l28) & -1L << (n4 -= -80);
                int n5 = -190;
                n5 += 103;
                int n6 = 14;
                n6 ^= 0xFFFFFFEF;
                if ((int)(l25 >>> (n5 += 119)) == (n6 += 75)) {
                    int n7;
                    int n8;
                    int n9;
                    this.c.b = this.a.readUnsignedShort();
                    this.c.B = this.a.readUnsignedShort();
                    this.c.c = this.a.readUnsignedShort();
                    this.c.C = this.a.readUnsignedShort();
                    int n10 = -38;
                    n10 += 26;
                    long l29 = l14;
                    int n11 = 72;
                    n11 -= -19;
                    l14 = l29 ^ ((long)this.a.readUnsignedByte() << (n10 += 44) ^ l29) & -1L << (n11 ^= 0x7B);
                    int n12 = -129;
                    n12 -= -49;
                    int n13 = 55;
                    n13 += -38;
                    if (((int)(l14 >>> (n12 ^= 0xFFFFFF90)) & (n13 -= -111)) != 0) {
                        int n14 = -163;
                        n14 -= -117;
                        n9 = n14 -= -47;
                    } else {
                        int n15 = 107;
                        n15 ^= 0xFFFFFF8C;
                        n9 = n15 += 25;
                    }
                    int n16 = 3;
                    n16 -= -124;
                    long l30 = l24;
                    int n17 = -135;
                    n17 -= -105;
                    l24 = l30 ^ ((long)n9 << (n16 += -95) ^ l30) & -1L << (n17 += 62);
                    int n18 = 168;
                    n18 += -24;
                    int n19 = -93;
                    n19 -= -50;
                    if (((int)(l14 >>> (n18 += -112)) & (n19 += 107)) != 0) {
                        int n20 = 2;
                        n20 ^= 0xFFFFFFDF;
                        n8 = n20 += 36;
                    } else {
                        int n21 = 26;
                        n21 += -73;
                        n8 = n21 -= -47;
                    }
                    this.c.d = n8;
                    int n22 = 59;
                    n22 += -85;
                    int n23 = 35;
                    n23 -= -93;
                    if (((int)(l14 >>> (n22 -= -58)) & (n23 += -96)) != 0) {
                        int n24 = -17;
                        n24 += -58;
                        n7 = n24 ^= 0xFFFFFFB4;
                    } else {
                        int n25 = -1;
                        n25 -= 71;
                        n7 = n25 -= -72;
                    }
                    this.c.D = n7;
                    int n26 = -148;
                    n26 += 65;
                    n26 += 84;
                    int n27 = -29;
                    n27 ^= 0xFFFFFFF2;
                    n27 -= -15;
                    int n28 = 110;
                    n28 += 16;
                    n28 ^= 0x79;
                    int n29 = -146;
                    n29 += 83;
                    n29 -= -64;
                    int n30 = 4;
                    n30 += 49;
                    long l31 = l21;
                    int n31 = -118;
                    n31 ^= 0xFFFFFFF6;
                    l21 = l31 ^ ((long)(n26 << ((int)(l14 >>> n27) & n28) + n29) << (n30 -= 21) ^ l31) & -1L << (n31 += -92);
                    int n32 = 78;
                    n32 ^= 0xE;
                    if ((int)(l24 >>> (n32 += -32)) != 0) {
                        int n33 = -65;
                        n33 += 39;
                        int n34 = 49;
                        n34 += 32;
                        this.c.e = kotakbaz.rain.client.render.texture.utils.gif.common.a.staggeredReadByteStream(this.a, (n33 += 29) * (int)(l21 >>> (n34 -= 49)));
                    } else {
                        this.c.e = null;
                    }
                    this.d = (int)(this.a.getStreamPosition() - l27);
                    return;
                }
                int n35 = 109;
                n35 -= 30;
                int n36 = 60;
                n36 -= 58;
                if ((int)(l25 >>> (n35 -= 47)) != (n36 += 31)) break;
                int n37 = 29;
                n37 ^= 0x54;
                long l32 = l14;
                int n38 = 152;
                n38 -= -2;
                l14 = l32 ^ ((long)this.a.readUnsignedByte() << (n37 ^= 0x69) ^ l32) & -1L << (n38 -= 122);
                int n39 = 59;
                n39 -= 64;
                int n40 = 383;
                n40 ^= 0x12;
                if ((int)(l14 >>> (n39 ^= 0xFFFFFFDB)) == (n40 += -116)) {
                    int n41;
                    int n42;
                    int n43 = -125;
                    n43 ^= 0x54;
                    long l33 = l24;
                    int n44 = -108;
                    n44 += 51;
                    l24 = l33 ^ ((long)this.a.readUnsignedByte() << (n43 -= -73) ^ l33) & -1L << (n44 ^= 0xFFFFFFE7);
                    int n45 = 92;
                    n45 -= 82;
                    long l34 = l21;
                    int n46 = 120;
                    n46 ^= 0x46;
                    l21 = l34 ^ ((long)this.a.readUnsignedByte() << (n45 -= -22) ^ l34) & -1L << (n46 ^= 0x1E);
                    int n47 = -110;
                    n47 -= -101;
                    int n48 = -43;
                    n48 += 101;
                    int n49 = 80;
                    n49 ^= 0xFFFFFF94;
                    this.c.E = (int)(l21 >>> (n47 -= -41)) >> (n48 ^= 0x38) & (n49 -= -63);
                    int n50 = 71;
                    n50 ^= 0xFFFFFFFC;
                    int n51 = -107;
                    n51 += 94;
                    if (((int)(l21 >>> (n50 -= -101)) & (n51 += 15)) != 0) {
                        int n52 = -5;
                        n52 += -88;
                        n42 = n52 ^= 0xFFFFFFA2;
                    } else {
                        int n53 = 83;
                        n53 += -56;
                        n42 = n53 += -27;
                    }
                    this.c.f = n42;
                    int n54 = 16;
                    n54 ^= 0x64;
                    int n55 = 86;
                    n55 ^= 0x26;
                    if (((int)(l21 >>> (n54 ^= 0x54)) & (n55 -= 111)) != 0) {
                        int n56 = 93;
                        n56 -= 101;
                        n41 = n56 ^= 0xFFFFFFF9;
                    } else {
                        int n57 = -108;
                        n57 ^= 0xFFFFFFBD;
                        n41 = n57 += -41;
                    }
                    this.c.F = n41;
                    this.c.g = this.a.readUnsignedShort();
                    this.c.G = this.a.readUnsignedByte();
                    long l35 = l11;
                    int n58 = 91;
                    n58 -= -49;
                    l11 = l35 ^ ((long)this.a.readUnsignedByte() ^ l35) & -1L >>> (n58 -= 108);
                    continue;
                }
                int n59 = -87;
                n59 ^= 0xFFFFFFF6;
                int n60 = -34;
                n60 += 17;
                if ((int)(l14 >>> (n59 += -63)) == (n60 ^= 0xFFFFFFEE)) {
                    int n61 = 229;
                    n61 ^= 0x7B;
                    long l36 = l24;
                    int n62 = -133;
                    n62 -= -58;
                    l24 = l36 ^ ((long)this.a.readUnsignedByte() << (n61 -= 126) ^ l36) & -1L << (n62 ^= 0xFFFFFF95);
                    if (!this.ignoreMetadata) {
                        int n63 = 104;
                        n63 += 8;
                        this.c.h = n63 -= 111;
                        this.c.H = this.a.readUnsignedShort();
                        this.c.i = this.a.readUnsignedShort();
                        this.c.I = this.a.readUnsignedShort();
                        this.c.j = this.a.readUnsignedShort();
                        this.c.J = this.a.readUnsignedByte();
                        this.c.k = this.a.readUnsignedByte();
                        this.c.K = this.a.readUnsignedByte();
                        this.c.l = this.a.readUnsignedByte();
                    } else {
                        int n64 = 49;
                        n64 += -76;
                        this.a.skipBytes((int)(l24 >>> (n64 += 59)));
                    }
                    this.c.L = this.concatenateBlocks();
                    continue;
                }
                int n65 = -58;
                n65 += 81;
                int n66 = 74;
                n66 -= -87;
                if ((int)(l14 >>> (n65 -= -9)) == (n66 ^= 0x5F)) {
                    byte[] byArray = this.concatenateBlocks();
                    if (this.ignoreMetadata) continue;
                    if (this.c.N == null) {
                        this.c.N = new ArrayList<byte[]>();
                    }
                    this.c.N.add(byArray);
                    continue;
                }
                int n67 = -59;
                n67 ^= 0x13;
                int n68 = 363;
                ++n68;
                if ((int)(l14 >>> (n67 -= -74)) == (n68 += -109)) {
                    int n69 = 240;
                    n69 ^= 0x70;
                    long l37 = l24;
                    int n70 = 47;
                    n70 ^= 0x41;
                    l24 = l37 ^ ((long)this.a.readUnsignedByte() << (n69 += -96) ^ l37) & -1L << (n70 += -78);
                    long l38 = l21;
                    int n71 = -106;
                    n71 += 36;
                    l21 = l38 ^ (0L ^ l38) & -1L << (n71 += 102);
                    int n72 = -113;
                    n72 += 53;
                    byte[] byArray = new byte[n72 += 60];
                    int n73 = -15;
                    n73 ^= 0xFFFFFFDE;
                    byte[] byArray2 = new byte[n73 -= 39];
                    int n74 = -36;
                    n74 += -81;
                    byte[] byArray3 = new byte[n74 -= -120];
                    if (!this.ignoreMetadata) {
                        int n75 = -60;
                        n75 -= -13;
                        byArray = kotakbaz.rain.client.render.texture.utils.gif.common.a.staggeredReadByteStream(this.a, (int)(l24 >>> (n75 ^= 0xFFFFFFF1)));
                        int n76 = -50;
                        n76 ^= 0x46;
                        n76 -= -120;
                        int n77 = -236;
                        n77 ^= 0xFFFFFF9D;
                        long l39 = l21;
                        int n78 = -204;
                        n78 -= -109;
                        l21 = l39 ^ ((long)this.copyData(byArray, n76, byArray2) << (n77 -= 105) ^ l39) & -1L << (n78 ^= 0xFFFFFF81);
                        int n79 = -5;
                        n79 ^= 0xFFFFFFC5;
                        n79 += -30;
                        int n80 = 73;
                        n80 ^= 0x67;
                        long l40 = l21;
                        int n81 = -32;
                        n81 ^= 0xFFFFFF9D;
                        l21 = l40 ^ ((long)this.copyData(byArray, (int)(l21 >>> n79), byArray3) << (n80 -= 14) ^ l40) & -1L << (n81 -= 93);
                    } else {
                        int n82 = -235;
                        n82 += 116;
                        this.a.skipBytes((int)(l24 >>> (n82 ^= 0xFFFFFFA9)));
                    }
                    byte[] byArray4 = this.concatenateBlocks();
                    if (!this.ignoreMetadata) {
                        int n83 = 118;
                        n83 -= 39;
                        int n84 = 79;
                        n84 -= 84;
                        if ((int)(l21 >>> (n83 -= 47)) < (int)(l24 >>> (n84 += 37))) {
                            int n85 = 87;
                            n85 ^= 0xFFFFFFA5;
                            n85 ^= 0xFFFFFFD2;
                            int n86 = 123;
                            n86 += -103;
                            n86 -= -12;
                            int n87 = 29;
                            n87 += -68;
                            long l41 = l22;
                            int n88 = 6;
                            n88 += -82;
                            l22 = l41 ^ ((long)((int)(l24 >>> n85) - (int)(l21 >>> n86)) << (n87 += 71) ^ l41) & -1L << (n88 ^= 0xFFFFFF94);
                            int n89 = 56;
                            n89 += 23;
                            byte[] byArray5 = new byte[(int)(l22 >>> (n89 += -47)) + byArray4.length];
                            int n90 = -96;
                            n90 ^= 0xFFFFFFD9;
                            int n91 = -14;
                            n91 ^= 0x63;
                            int n92 = 33;
                            n92 ^= 0x70;
                            System.arraycopy(byArray, (int)(l21 >>> (n90 -= 89)), byArray5, n91 ^= 0xFFFFFF91, (int)(l22 >>> (n92 -= 49)));
                            int n93 = 8;
                            n93 += 17;
                            int n94 = -117;
                            n94 -= -122;
                            System.arraycopy(byArray4, n93 ^= 0x19, byArray5, (int)(l22 >>> (n94 += 27)), byArray4.length);
                            byArray4 = byArray5;
                        }
                    }
                    if (this.ignoreMetadata) continue;
                    if (this.c.m == null) {
                        this.c.m = new ArrayList<byte[]>();
                        this.c.M = new ArrayList<byte[]>();
                        this.c.n = new ArrayList<byte[]>();
                    }
                    this.c.m.add(byArray2);
                    this.c.M.add(byArray3);
                    this.c.n.add(byArray4);
                    continue;
                }
                long l42 = l24;
                int n95 = 50;
                n95 ^= 0x11;
                l24 = l42 ^ (0L ^ l42) & -1L << (n95 ^= 3);
                do {
                    int n96 = -111;
                    n96 -= -113;
                    long l43 = l24;
                    int n97 = -2;
                    n97 += -61;
                    l24 = l43 ^ ((long)this.a.readUnsignedByte() << (n96 += 30) ^ l43) & -1L << (n97 += 95);
                    int n98 = 17;
                    n98 -= -20;
                    this.a.skipBytes((int)(l24 >>> (n98 ^= 5)));
                    int n99 = -70;
                    n99 += 56;
                } while ((int)(l24 >>> (n99 += 46)) > 0);
            }
            int n100 = 218;
            n100 -= 109;
            int n101 = -60;
            n101 += 80;
            if ((int)(l25 >>> (n100 -= 77)) == (n101 += 39)) {
                int n102 = 83;
                n102 ^= 0x52;
                int n103 = -45;
                n103 ^= 0xFFFFFFE7;
                throw new IndexOutOfBoundsException((String)U[n102 -= -3] + (String)U[n103 += -29]);
            }
            int n104 = -101;
            n104 ^= 0xFFFFFFAC;
            n104 -= 23;
            int n105 = 68;
            n105 -= -67;
            long l44 = l26;
            int n106 = 31;
            n106 ^= 0x53;
            l26 = l44 ^ ((long)((int)(l25 >>> n104)) << (n105 -= 103) ^ l44) & -1L << (n106 += -44);
            int n107 = -29;
            n107 -= -34;
            n107 -= -26;
            int n108 = -13;
            n108 -= -71;
            int n109 = 58;
            n109 += -13;
            int n110 = 87;
            n110 ^= 0x2C;
            throw new IIOException((String)U[n107] + (String)U[n108 -= 56] + (int)(l26 >>> (n109 -= 13)) + (String)U[n110 ^= 0x6D]);
        }
        catch (IIOException iIOException) {
            throw iIOException;
        }
        catch (IOException iOException) {
            int n111 = -68;
            n111 += 43;
            int n112 = -6;
            n112 ^= 2;
            throw new IIOException((String)U[n111 ^= 0xFFFFFFF3] + (String)U[n112 ^= 0xFFFFFFFB], iOException);
        }
    }

    private int copyData(byte[] src, int offset, byte[] dst) {
        long l2 = 8336975281186034236L;
        long l3 = 3246639221092428428L;
        long l4 = -2492568541488181283L;
        long l5 = 3303956728858574271L;
        int n2 = -148;
        n2 -= -37;
        long l6 = l5;
        int n3 = -3;
        n3 += -73;
        l5 = l6 ^ ((long)dst.length << (n2 ^= 0xFFFFFFB1) ^ l6) & -1L << (n3 -= -108);
        int n4 = -19;
        n4 ^= 0xFFFFFF83;
        long l7 = l4;
        int n5 = 35;
        n5 -= -59;
        l4 = l7 ^ ((long)(src.length - offset) << (n4 += -78) ^ l7) & -1L << (n5 -= 62);
        int n6 = 110;
        n6 ^= 0xFFFFFF9D;
        int n7 = 22;
        n7 ^= 0xFFFFFFBD;
        if ((int)(l5 >>> (n6 += 45)) > (int)(l4 >>> (n7 += 117))) {
            int n8 = -202;
            n8 ^= 0xFFFFFFBF;
            n8 -= 105;
            int n9 = 166;
            n9 -= 34;
            long l8 = l5;
            int n10 = -13;
            n10 ^= 0x12;
            l5 = l8 ^ ((long)((int)(l4 >>> n8)) << (n9 += -100) ^ l8) & -1L << (n10 -= -63);
        }
        int n11 = 31;
        n11 += -46;
        int n12 = -136;
        n12 -= -50;
        System.arraycopy(src, offset, dst, n11 -= -15, (int)(l5 >>> (n12 ^= 0xFFFFFF8A)));
        int n13 = -106;
        n13 ^= 0xFFFFFFED;
        return offset + (int)(l5 >>> (n13 -= 91));
    }

    private void startPass(int pass) {
        long l2 = -8757399252391894192L;
        long l3 = 2441975139814486695L;
        long l4 = 8543733129103494706L;
        if (this.updateListeners == null || !this.c.d) {
            return;
        }
        int n2 = -19;
        n2 -= -7;
        long l5 = l3;
        int n3 = -56;
        n3 += 34;
        l3 = l5 ^ ((long)N[this.m] << (n2 ^= 0xFFFFFFD4) ^ l5) & -1L << (n3 -= -54);
        int n4 = -109;
        long l6 = l4;
        int n5 = 175;
        n5 += -49;
        l4 = l6 ^ ((long)n[this.m] << (n4 ^= 0xFFFFFFB3) ^ l6) & -1L << (n5 += -94);
        int n6 = 41;
        n6 ^= 0xFFFFFFEE;
        n6 += 58;
        int n7 = 201;
        n7 += -106;
        n7 -= 94;
        int n8 = -87;
        n8 -= -118;
        n8 += -31;
        int n9 = -119;
        n9 ^= 0x3A;
        n9 -= -109;
        int n10 = -112;
        n10 -= -80;
        n10 -= -64;
        int n11 = -49;
        n11 += 7;
        n11 -= -43;
        int n12 = 215;
        n12 ^= 0x50;
        int n13 = 100;
        n13 += -10;
        int n14 = -2;
        n14 -= -82;
        int[] nArray = kotakbaz.rain.client.render.texture.utils.gif.common.a.computeUpdatedPixels(this.o, this.Q, this.r.x, this.r.y, this.r.x + this.r.width - n6, this.r.y + this.r.height - n7, this.O, this.p, n8, (int)(l3 >>> n9), this.r.width, (this.r.height + (int)(l4 >>> n10) - n11) / (int)(l4 >>> (n12 -= 103)), n13 -= 89, (int)(l4 >>> (n14 += -48)));
        int n15 = 133;
        n15 += -40;
        this.R = nArray[n15 -= 92];
        int n16 = 67;
        n16 ^= 0xFFFFFFB5;
        this.s = nArray[n16 -= -15];
        int n17 = -130;
        n17 += 37;
        int[] nArray2 = new int[n17 ^= 0xFFFFFFA2];
        int n18 = 91;
        n18 -= 84;
        int n19 = 96;
        n19 ^= 0xFFFFFFB2;
        nArray2[n18 += -7] = n19 ^= 0xFFFFFFD2;
        int[] nArray3 = nArray2;
        int n20 = 100;
        n20 += -38;
        int n21 = 115;
        n21 ^= 0xFFFFFF8F;
        this.processPassStarted(this.I, this.m, this.P, this.q, n20 -= 62, this.R, n21 ^= 0xFFFFFFFD, this.s, nArray3);
    }

    @Override
    public BufferedImage read(int imageIndex, ImageReadParam param) {
        long l2 = -4206173426493812334L;
        long l3 = -3635904148242693449L;
        long l4 = 3933358566617004373L;
        long l5 = 8194856528485125598L;
        long l6 = -34009538319092057L;
        long l7 = 4575787757216919782L;
        long l8 = 4403529277624466603L;
        long l9 = 5611022018682379776L;
        long l10 = 36866389656048334L;
        long l11 = 2726711620422896709L;
        long l12 = -335242126577824813L;
        long l13 = 7910620139910584042L;
        long l14 = 4988064599276329515L;
        long l15 = 1942927772482378673L;
        long l16 = -175079623777626743L;
        long l17 = 5964789017934400674L;
        long l18 = -7027241931977292362L;
        long l19 = -7028214521352820485L;
        long l20 = -2514872293989185887L;
        long l21 = 5774481689548345700L;
        long l22 = -1421638180528662087L;
        long l23 = 1918758364059413350L;
        long l24 = 4351695404853590143L;
        long l25 = 1105693761784104990L;
        long l26 = 7689120560779017302L;
        long l27 = -2135716623073099219L;
        long l28 = -2299719065872732259L;
        long l29 = 7886229428505429746L;
        long l30 = -5874732852001678337L;
        long l31 = -6702831191639245061L;
        long l32 = -379066999665071607L;
        long l33 = 3607776761661327799L;
        long l34 = -4559706268558514692L;
        long l35 = 113076309671985265L;
        long l36 = -626912198093193756L;
        long l37 = -2234983232500419463L;
        long l38 = 2633866705939188968L;
        long l39 = -6928455596728312669L;
        long l40 = -3709173289711073308L;
        long l41 = 8012736264216847861L;
        long l42 = -980102440482431180L;
        if (this.a == null) {
            int n2 = 8;
            n2 += -105;
            throw new IllegalStateException((String)U[n2 -= -125]);
        }
        this.checkIndex(imageIndex);
        int n3 = 151;
        n3 -= 50;
        long l43 = l13;
        int n4 = -48;
        n4 ^= 0x65;
        l13 = l43 ^ ((long)this.locateImage(imageIndex) << (n3 -= 69) ^ l43) & -1L << (n4 += 107);
        int n5 = -49;
        n5 += -3;
        if ((int)(l13 >>> (n5 ^= 0xFFFFFFEC)) != imageIndex) {
            int n6 = 208;
            n6 += -83;
            int n7 = -87;
            n7 ^= 0x14;
            throw new IndexOutOfBoundsException((String)U[n6 += -88] + (String)U[n7 ^= 0xFFFFFFA7]);
        }
        this.readMetadata();
        if (param == null) {
            param = this.getDefaultReadParam();
        }
        Iterator<ImageTypeSpecifier> iterator2 = this.getImageTypes(imageIndex);
        this.I = b_0.getDestination(param, iterator2, this.c.c, this.c.C);
        int n8 = -2;
        n8 ^= 0x7C;
        int n9 = 35;
        n9 -= 65;
        this.j = this.I.getWritableTile(n8 -= -126, n9 ^= 0xFFFFFFE2);
        this.J = this.c.c;
        this.k = this.c.C;
        int n10 = 118;
        n10 -= 104;
        this.K = n10 -= 14;
        int n11 = -71;
        n11 ^= 0x6A;
        this.l = n11 += 45;
        int n12 = 86;
        n12 ^= 0xFFFFFF8E;
        this.L = n12 -= -40;
        int n13 = -12;
        n13 += -66;
        this.m = n13 += 78;
        int n14 = 116;
        n14 -= 81;
        n14 += -35;
        int n15 = -37;
        n15 += 6;
        int n16 = 24;
        n16 -= 85;
        int n17 = 21;
        n17 -= 7;
        this.o = new Rectangle(n14, n15 ^= 0xFFFFFFE1, n16 ^= 0xFFFFFFC3, n17 ^= 0xE);
        int n18 = -135;
        n18 -= -19;
        n18 ^= 0xFFFFFF8C;
        int n19 = 77;
        n19 ^= 0xFFFFFFB8;
        int n20 = 82;
        n20 -= -23;
        int n21 = -128;
        n21 ^= 0xFFFFFFBA;
        this.r = new Rectangle(n18, n19 -= -11, n20 -= 105, n21 += -58);
        b_0.computeRegions(param, this.J, this.k, this.I, this.o, this.r);
        this.Q = new Point(this.r.x, this.r.y);
        this.O = param.getSourceXSubsampling();
        this.p = param.getSourceYSubsampling();
        int n22 = 52;
        n22 += -24;
        this.P = Math.max(param.getSourceMinProgressivePass(), n22 -= 28);
        int n23 = 65;
        n23 ^= 0xFFFFFFD9;
        this.q = Math.min(param.getSourceMaxProgressivePass(), n23 -= -107);
        this.t = this.r.y + (this.l - this.o.y) / this.p;
        this.computeDecodeThisRow();
        this.clearAbortRequest();
        this.processImageStarted(imageIndex);
        if (this.abortRequested()) {
            this.processReadAborted();
            return this.I;
        }
        int n24 = 117;
        n24 ^= 0xFFFFFFAF;
        this.startPass(n24 += 38);
        this.T = new byte[this.J];
        try {
            block26: {
                block25: {
                    this.g = this.a.readUnsignedByte();
                    int n25 = -16;
                    n25 += -109;
                    if (this.g < (n25 -= -126)) break block25;
                    int n26 = 22;
                    n26 -= 25;
                    if (this.g <= (n26 ^= 0xFFFFFFF5)) break block26;
                }
                int n27 = 153;
                n27 += -10;
                long l44 = l15;
                int n28 = 2;
                n28 ^= 0xFFFFFFA6;
                l15 = l44 ^ ((long)this.g << (n27 -= 111) ^ l44) & -1L << (n28 += 124);
                int n29 = -39;
                n29 ^= 0x18;
                int n30 = -50;
                n30 -= -38;
                throw new IIOException((String)U[n29 += 73] + (int)(l15 >>> (n30 += 44)));
            }
            this.E = this.a.readUnsignedByte();
            long l45 = l25;
            int n31 = -65;
            n31 -= -40;
            l25 = l45 ^ ((long)this.E ^ l45) & -1L >>> (n31 ^= 0xFFFFFFC7);
            long l46 = l29;
            int n32 = 43;
            n32 += -83;
            l29 = l46 ^ (0L ^ l46) & -1L << (n32 ^= 0xFFFFFFF8);
            while ((int)l25 > 0) {
                int n33 = -39;
                n33 -= 50;
                long l47 = l29;
                int n34 = -35;
                n34 += -44;
                l29 = l47 ^ ((long)this.a.read(this.e, (int)(l29 >>> (n33 += 121)), (int)l25) ^ l47) & -1L >>> (n34 ^= 0xFFFFFF91);
                int n35 = -19;
                n35 += -34;
                if ((int)l29 == (n35 ^= 0x34)) {
                    int n36 = 92;
                    n36 -= 2;
                    int n37 = -89;
                    n37 ^= 3;
                    throw new IIOException((String)U[n36 += -63] + (String)U[n37 ^= 0xFFFFFFBA]);
                }
                long l48 = l25;
                int n38 = 72;
                n38 -= 118;
                l25 = l48 ^ ((long)((int)l25 - (int)l29) ^ l48) & -1L >>> (n38 ^= 0xFFFFFFF2);
                int n39 = 97;
                n39 -= -50;
                n39 += -115;
                int n40 = 98;
                n40 -= 0;
                long l49 = l29;
                int n41 = -88;
                n41 -= -107;
                l29 = l49 ^ ((long)((int)(l29 >>> n39) + (int)l29) << (n40 += -66) ^ l49) & -1L << (n41 += 13);
            }
            int n42 = 74;
            n42 += -52;
            this.f = n42 ^= 0x16;
            int n43 = -95;
            n43 ^= 0xFFFFFFCA;
            this.F = n43 -= 107;
            int n44 = 14;
            n44 -= 112;
            this.i = n44 ^= 0xFFFFFF9E;
            int n45 = 104;
            n45 -= 32;
            this.m = n45 -= 72;
            this.initNext32Bits();
            int n46 = 51;
            n46 -= -45;
            this.G = (n46 -= 95) << this.g;
            int n47 = 64;
            n47 ^= 0x1A;
            this.h = this.G + (n47 ^= 0x5B);
            long l50 = l29;
            int n48 = 93;
            n48 ^= 0x44;
            l29 = l50 ^ (0xFFFFFFFFFFFFFFFFL ^ l50) & -1L >>> (n48 ^= 0x39);
            long l51 = l42;
            int n49 = -154;
            n49 += 77;
            l42 = l51 ^ (0xFFFFFFFFFFFFFFFFL ^ l51) & -1L >>> (n49 += 109);
            int n50 = 4026;
            n50 += 85;
            int[] nArray = new int[n50 -= 15];
            int n51 = 4099;
            n51 ^= 0x21;
            byte[] byArray = new byte[n51 -= 34];
            int n52 = 3962;
            n52 -= -9;
            byte[] byArray2 = new byte[n52 += 125];
            int n53 = 4098;
            n53 -= -57;
            int[] nArray2 = new int[n53 -= 59];
            int n54 = 4073;
            n54 += -53;
            byte[] byArray3 = new byte[n54 += 76];
            this.initializeStringTable(nArray, byArray, byArray2, nArray2);
            int n55 = -90;
            n55 ^= 0xFFFFFFEA;
            n55 += -75;
            int n56 = 82;
            n56 -= 17;
            n56 -= 63;
            int n57 = 38;
            n57 ^= 0xFFFFFF87;
            long l52 = l41;
            int n58 = -230;
            n58 += 102;
            l41 = l52 ^ ((long)((n55 << this.g) + n56) << (n57 -= -127) ^ l52) & -1L << (n58 ^= 0xFFFFFFA0);
            int n59 = 117;
            n59 += 0;
            long l53 = l37;
            int n60 = 199;
            n60 ^= 0x52;
            l37 = l53 ^ ((long)(this.g + (n59 -= 116)) ^ l53) & -1L >>> (n60 -= 117);
            int n61 = 41;
            n61 -= 87;
            n61 -= -47;
            int n62 = -119;
            n62 += -4;
            n62 ^= 0xFFFFFF84;
            int n63 = 120;
            n63 ^= 0xFFFFFFAD;
            long l54 = l38;
            int n64 = 56;
            n64 ^= 0xFFFFFFFA;
            l38 = l54 ^ ((long)((n61 << (int)l37) - n62) << (n63 += 75) ^ l54) & -1L << (n64 -= -94);
            do {
                int n65 = -87;
                n65 -= 41;
                long l55 = l41;
                int n66 = -72;
                n66 -= 7;
                l41 = l55 ^ ((long)this.getCode((int)l37, (int)(l38 >>> (n65 ^= 0xFFFFFFA0))) ^ l55) & -1L >>> (n66 += 111);
                if ((int)l41 == this.G) {
                    this.initializeStringTable(nArray, byArray, byArray2, nArray2);
                    int n67 = 41;
                    n67 ^= 8;
                    n67 += -32;
                    int n68 = 111;
                    n68 ^= 0xFFFFFF8B;
                    n68 -= -30;
                    int n69 = 252;
                    n69 ^= 0x61;
                    long l56 = l41;
                    int n70 = -161;
                    n70 += 34;
                    l41 = l56 ^ ((long)((n67 << this.g) + n68) << (n69 += -125) ^ l56) & -1L << (n70 ^= 0xFFFFFFA1);
                    int n71 = -79;
                    n71 += -3;
                    long l57 = l37;
                    int n72 = -53;
                    n72 += 5;
                    l37 = l57 ^ ((long)(this.g + (n71 += 83)) ^ l57) & -1L >>> (n72 -= -80);
                    int n73 = -29;
                    n73 += 20;
                    n73 ^= 0xFFFFFFF6;
                    int n74 = -65;
                    n74 += -53;
                    n74 += 119;
                    int n75 = -30;
                    n75 ^= 0xFFFFFFBE;
                    long l58 = l38;
                    int n76 = 161;
                    n76 -= 104;
                    l38 = l58 ^ ((long)((n73 << (int)l37) - n74) << (n75 += -60) ^ l58) & -1L << (n76 += -25);
                    int n77 = -42;
                    n77 -= -82;
                    long l59 = l41;
                    int n78 = -13;
                    n78 ^= 0xFFFFFFF2;
                    l41 = l59 ^ ((long)this.getCode((int)l37, (int)(l38 >>> (n77 -= 8))) ^ l59) & -1L >>> (n78 += 31);
                    long l60 = l42;
                    int n79 = 121;
                    n79 ^= 0xFFFFFF9E;
                    l42 = l60 ^ (0xFFFFFFFFFFFFFFFFL ^ l60) & -1L >>> (n79 -= -57);
                    if ((int)l41 == this.h) {
                        this.processImageComplete();
                        return this.I;
                    }
                } else {
                    if ((int)l41 == this.h) {
                        this.processImageComplete();
                        return this.I;
                    }
                    int n80 = 88;
                    n80 -= -66;
                    if ((int)l41 < (int)(l41 >>> (n80 += -122))) {
                        int n81 = 35;
                        n81 ^= 0x45;
                        long l61 = l42;
                        int n82 = 15;
                        n82 += -69;
                        l42 = l61 ^ ((long)((int)l41) << (n81 += -70) ^ l61) & -1L << (n82 -= -86);
                    } else {
                        int n83 = 98;
                        n83 ^= 0xFFFFFFDB;
                        long l62 = l42;
                        int n84 = -15;
                        n84 ^= 0xFFFFFF9F;
                        l42 = l62 ^ ((long)((int)l42) << (n83 += 103) ^ l62) & -1L << (n84 += -78);
                        int n85 = -237;
                        n85 += 116;
                        if ((int)l41 != (int)(l41 >>> (n85 ^= 0xFFFFFFA7))) {
                            int n86 = -3;
                            n86 ^= 0x14;
                            int n87 = -36;
                            n87 += 98;
                            this.processWarningOccurred((String)U[n86 ^= 0xFFFFFFE5] + (String)U[n87 ^= 0x39]);
                        }
                    }
                    int n88 = -74;
                    n88 ^= 0xFFFFFFDD;
                    if ((n88 -= 108) != (int)l42) {
                        int n89 = 2;
                        n89 -= -60;
                        int n90 = 4189;
                        n90 -= -17;
                        if ((int)(l41 >>> (n89 += -30)) < (n90 += -110)) {
                            int n91 = 125;
                            n91 ^= 0xFFFFFFDF;
                            n91 ^= 0xFFFFFF82;
                            int n92 = -114;
                            n92 ^= 0xFFFFFF87;
                            long l63 = l28;
                            int n93 = 9;
                            n93 ^= 0x74;
                            l28 = l63 ^ ((long)((int)(l41 >>> n91)) << (n92 ^= 0x29) ^ l63) & -1L << (n93 += -93);
                            long l64 = l26;
                            int n94 = 201;
                            n94 += -114;
                            l26 = l64 ^ ((long)((int)l42) ^ l64) & -1L >>> (n94 += -55);
                            int n95 = 245;
                            n95 -= 101;
                            nArray[(int)(l28 >>> (n95 += -112))] = (int)l26;
                            int n96 = -4;
                            n96 += -76;
                            int n97 = 173;
                            n97 += -113;
                            byArray[(int)(l28 >>> (n96 -= -112))] = byArray2[(int)(l42 >>> (n97 ^= 0x1C))];
                            int n98 = 0;
                            n98 -= 53;
                            byArray2[(int)(l28 >>> (n98 += 85))] = byArray2[(int)l26];
                            int n99 = 43;
                            n99 ^= 0xFFFFFF98;
                            int n100 = -148;
                            n100 += 57;
                            nArray2[(int)(l28 >>> (n99 ^= 0xFFFFFF93))] = nArray2[(int)l26] + (n100 ^= 0xFFFFFFA4);
                            int n101 = 112;
                            n101 ^= 0xFFFFFFAC;
                            int n102 = -115;
                            n102 += 70;
                            if ((int)((l41 += 0x100000000L) >>> (n101 += 68)) == (n102 += 46) << (int)l37) {
                                int n103 = -50;
                                n103 ^= 0xFFFFFFA5;
                                int n104 = -4262;
                                n104 += 88;
                                if ((int)(l41 >>> (n103 -= 75)) < (n104 ^= 0xFFFFFFB2)) {
                                    long l65 = l37;
                                    int n105 = 29;
                                    n105 -= 64;
                                    int n106 = -101;
                                    n106 ^= 0xFFFFFFF4;
                                    l37 = l65 ^ (l65 ^ l65 + (long)(n105 += 36)) & -1L >>> (n106 += -79);
                                    int n107 = 111;
                                    n107 -= 53;
                                    n107 ^= 0x3B;
                                    int n108 = 118;
                                    n108 -= 104;
                                    n108 += -13;
                                    int n109 = -40;
                                    n109 -= -51;
                                    long l66 = l38;
                                    int n110 = 37;
                                    n110 += 65;
                                    l38 = l66 ^ ((long)((n107 << (int)l37) - n108) << (n109 ^= 0x2B) ^ l66) & -1L << (n110 -= 70);
                                }
                            }
                        }
                    }
                }
                int n111 = -66;
                n111 ^= 0x67;
                long l67 = l42;
                int n112 = -166;
                n112 += 120;
                l42 = l67 ^ ((long)((int)l41) << (n111 += 71) ^ l67) & -1L << (n112 += 78);
                int n113 = -60;
                n113 ^= 0x27;
                n113 -= -61;
                int n114 = -96;
                n114 ^= 0x41;
                long l68 = l28;
                int n115 = -39;
                n115 ^= 0xFFFFFFB6;
                l28 = l68 ^ ((long)nArray2[(int)(l42 >>> n113)] << (n114 -= -63) ^ l68) & -1L << (n115 += -79);
                int n116 = 11;
                n116 ^= 0x47;
                n116 ^= 0x6C;
                int n117 = -109;
                n117 ^= 0xFFFFFFE3;
                long l69 = l26;
                int n118 = 183;
                n118 ^= 0x29;
                l26 = l69 ^ ((long)((int)(l28 >>> n116) - (n117 += -111)) ^ l69) & -1L >>> (n118 += -126);
                while ((int)l26 >= 0) {
                    int n119 = -118;
                    n119 ^= 0x6A;
                    byArray3[(int)l26] = byArray[(int)(l42 >>> (n119 ^= 0xFFFFFFC0))];
                    int n120 = 93;
                    n120 -= 22;
                    n120 ^= 0x67;
                    int n121 = -55;
                    n121 -= -75;
                    long l70 = l42;
                    int n122 = 83;
                    n122 += -41;
                    l42 = l70 ^ ((long)nArray[(int)(l42 >>> n120)] << (n121 -= -12) ^ l70) & -1L << (n122 ^= 0xA);
                    long l71 = l26;
                    int n123 = 54;
                    n123 ^= 0xFFFFFF94;
                    int n124 = -99;
                    n124 -= 25;
                    l26 = l71 ^ (l71 ^ l71 + (long)(n123 -= -93)) & -1L >>> (n124 ^= 0xFFFFFFA4);
                }
                int n125 = -99;
                n125 -= 4;
                this.outputPixels(byArray3, (int)(l28 >>> (n125 ^= 0xFFFFFFB9)));
                long l72 = l42;
                int n126 = -103;
                n126 += 91;
                l42 = l72 ^ ((long)((int)l41) ^ l72) & -1L >>> (n126 ^= 0xFFFFFFD4);
            } while (!this.abortRequested());
            this.processReadAborted();
            return this.I;
        }
        catch (IOException iOException) {
            int n127 = 29;
            n127 ^= 0xFFFFFF8B;
            int n128 = -16;
            n128 += 64;
            throw new IIOException((String)U[n127 -= -123] + (String)U[n128 ^= 0x3E], iOException);
        }
    }

    @Override
    public void reset() {
        super.reset();
        this.resetStreamSettings();
    }

    private void resetStreamSettings() {
        int n2 = -30;
        n2 ^= 0xFFFFFF9A;
        this.A = n2 -= 120;
        this.b = null;
        int n3 = -111;
        n3 ^= 0xFFFFFFC9;
        this.B = n3 -= 89;
        this.c = null;
        this.C = new ArrayList<Long>();
        int n4 = 64;
        n4 ^= 0x6D;
        this.D = n4 -= 46;
        int n5 = 78;
        n5 -= 125;
        this.E = n5 ^= 0xFFFFFFD1;
        int n6 = -25;
        n6 -= -104;
        this.f = n6 += -79;
        int n7 = 56;
        n7 += -97;
        this.F = n7 ^= 0xFFFFFFD7;
        int n8 = -78;
        n8 -= -46;
        this.H = n8 ^= 0xFFFFFFE0;
        int n9 = -53;
        n9 -= -21;
        this.i = n9 -= -32;
        this.I = null;
        this.j = null;
        int n10 = -28;
        n10 += 48;
        this.J = n10 += -21;
        int n11 = 0;
        n11 ^= 0xFFFFFFA5;
        this.k = n11 += 90;
        int n12 = -59;
        n12 -= -51;
        this.K = n12 ^= 7;
        int n13 = 62;
        n13 += -47;
        this.l = n13 ^= 0xFFFFFFF0;
        int n14 = -112;
        n14 ^= 0x35;
        this.L = n14 -= -91;
        int n15 = -202;
        n15 += 84;
        this.m = n15 -= -118;
        this.M = null;
    }

    private static synchronized byte[] getDefaultPalette() {
        long l2 = -8017447537597686885L;
        long l3 = 3018897854826113490L;
        long l4 = -794302349598156258L;
        long l5 = -6916689005220450909L;
        long l6 = 6417908893284172245L;
        long l7 = -7150908442423060211L;
        long l8 = -8192632298120209253L;
        long l9 = 9072096203157553612L;
        if (u == null) {
            int n2 = -90;
            n2 -= -65;
            int n3 = 129;
            n3 += -35;
            int n4 = -136;
            n4 += 64;
            BufferedImage bufferedImage = new BufferedImage(n2 -= -26, n3 -= 93, n4 -= -85);
            IndexColorModel indexColorModel = (IndexColorModel)bufferedImage.getColorModel();
            long l10 = l8;
            int n5 = -24;
            n5 += 97;
            l8 = l10 ^ ((long)indexColorModel.getMapSize() ^ l10) & -1L >>> (n5 ^= 0x69);
            byte[] byArray = new byte[(int)l8];
            byte[] byArray2 = new byte[(int)l8];
            byte[] byArray3 = new byte[(int)l8];
            indexColorModel.getReds(byArray);
            indexColorModel.getGreens(byArray2);
            indexColorModel.getBlues(byArray3);
            int n6 = -142;
            n6 -= -98;
            u = new byte[(int)l8 * (n6 += 47)];
            long l11 = l9;
            int n7 = -72;
            n7 ^= 0xFFFFFFAE;
            l9 = l11 ^ (0L ^ l11) & -1L << (n7 += 10);
            while (true) {
                int n8 = 1;
                n8 -= -33;
                if ((int)(l9 >>> (n8 -= 2)) >= (int)l8) break;
                int n9 = 41;
                n9 ^= 0x35;
                int n10 = 12;
                n10 += -27;
                int n11 = -118;
                n11 -= -66;
                b_0.u[(n9 += -25) * (int)(l9 >>> (n10 ^= 0xFFFFFFD1))] = byArray[(int)(l9 >>> (n11 ^= 0xFFFFFFEC))];
                int n12 = 91;
                n12 ^= 0xFFFFFFAF;
                n12 -= -15;
                int n13 = 129;
                n13 += -25;
                int n14 = 148;
                n14 -= 40;
                int n15 = 26;
                n15 -= 89;
                b_0.u[n12 * (int)(l9 >>> (n13 ^= 0x48)) + (n14 -= 107)] = byArray2[(int)(l9 >>> (n15 -= -95))];
                int n16 = 78;
                n16 += -105;
                n16 += 30;
                int n17 = 40;
                n17 ^= 0x71;
                int n18 = 120;
                n18 += -75;
                int n19 = -63;
                n19 += 76;
                b_0.u[n16 * (int)(l9 >>> (n17 -= 57)) + (n18 ^= 0x2F)] = byArray3[(int)(l9 >>> (n19 ^= 0x2D))];
                l9 += 0x100000000L;
            }
        }
        return u;
    }

    static {
        b_0.b();
        long l2 = -781569981592524095L;
        long l3 = 2502455944034532614L;
        long l4 = 8910201035313564486L;
        long l5 = 7880268183150077084L;
        long l6 = 9847590064124741L;
        long l7 = 8975084696935800258L;
        long l8 = 4402465749624776878L;
        long l9 = -3135971363341716271L;
        long l10 = 455155751973794872L;
        long l11 = -356906618966597029L;
        long l12 = -3307959991074046314L;
        long l13 = 6899568013321031040L;
        long l14 = 4605880141859097832L;
        long l15 = 7907335583212150655L;
        int n2 = 76;
        n2 -= 2;
        U = new Object[n2 ^= 0x6C];
        long l16 = l15;
        int n3 = 154;
        n3 -= 106;
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += -16);
        Object[] objectArray = new Object[3];
        objectArray[0] = v;
        objectArray[1] = 0;
        Object object = b_0.A()[0];
        if (object == null) {
            char[] cArray = "\u593c\u5a54\u5a70\u5a6d\u5a5c\u5a42\u5a51\u5927\u593f\u5a5c\u5a47\u5a65\u5a4e\u5a47\u5a43\u5927\u5a5c\u5a42\u593c\u5a54\u5a6d\u5922\u5923\u5a6f\u5930\u5a65\u5925\u5a4f\u5a60\u5a42\u5a67\u5a4f\u5a5c\u5a5d\u593d\u5a60\u5a64\u592d\u5a59\u5a45\u5a53\u5a6e\u5934\u5932\u5a5a\u593f\u5a60\u5923\u5a42\u5931\u5a68\u5933\u5a43\u5a48\u593d\u5a41\u5a5b\u5a5c\u5a6f\u5937\u592f\u5a50\u5a6f\u5933\u5a6e\u593c\u5a42\u592d\u5933\u5932\u5a51\u5925\u5a59\u5a4f\u5a59\u5a4e\u5a62\u5a5c\u5a4e\u5924\u5940\u5a5e\u5a5e\u593a\u592e\u5922\u5a6e\u5a61\u5a57\u5a5a\u5940\u593d\u593f\u593b\u5934\u5933\u5a47\u5a42\u5924\u5a4f\u5a5f\u5937\u5a4e\u592f\u5a67\u5925\u5a48\u5a41\u5a45\u592a\u5a68\u592e\u5a52\u5937\u5923\u5934\u5a6f\u5a53\u5926\u5a4f\u5a60\u5a51\u5a46\u5a62\u5933\u5a51\u5a68\u593e\u5a59\u5924\u5928\u593f\u5a45\u5a61\u592e\u5a65\u5a6f\u5a6e\u5a6d\u5a65\u5927\u5927\u5933\u5a4f\u5a51\u5a51\u5a4a\u5a4a\u5a54\u5a5c\u5a47\u5a62\u593d\u592a\u5a79\u5a47\u5a5b\u5a5c\u5921\u5a41\u5a5a\u5931\u592e\u5939\u5926\u5a6d\u5a64\u5a6f\u5923\u592d\u5a6d\u593c\u592d\u593c\u5932\u593b\u5932\u5927\u5a5e\u5a44\u593c\u5928\u5a4e\u5a52\u5927\u5a79\u5a70\u5a46\u5a6f\u593d\u592d\u592a\u5a51\u5a52\u5a4a\u5a50\u5a5d\u5a65\u5a5c\u5a48\u5a41\u5a70\u5a4f\u592f\u5937\u5a45\u5a57\u5a5b\u593f\u5a43\u5a65\u5a42\u593e\u5a64\u5a4e\u5932\u5a4f\u5a6e\u5a47\u5a6d\u592a\u5a51\u5931\u5a4d\u5931\u5922\u593d\u5a6f\u5926\u5921\u5a64\u5a62\u5933\u5a6f\u5925\u5937\u5a46\u5a4a\u5a52\u5931\u593e\u5a4f\u5a65\u5931\u593d\u5930\u5a62\u5a45\u5a6e\u592d\u5a41\u5a5e\u592d\u593b\u593c\u5a65\u5a53\u5921\u5a54\u593a\u5a4d\u5a64\u5940\u5a61\u5933\u5937\u593f\u5a64\u5931\u593e\u593f\u5a6d\u5a46\u5a53\u5932\u5a79\u5a6f\u5a62\u5a5c\u5934\u5a79\u5a4e\u5a5d\u5a67\u593e\u5a4f\u5a51\u5a41\u5927\u5924\u5937\u5932\u5a4f\u5a60\u593b\u5a45\u5a45\u592e\u5a4a\u5a79\u593f\u5a52\u5a44\u5a57\u5a46\u5928\u5a5f\u5a67\u5a6f\u593b\u5a50\u5a65\u5a5d\u592d\u5a43\u5934\u5a52\u5a63\u5a4a\u5a4a\u593b\u5a53\u5a6d\u593f\u5a5a\u5a60\u5a5b\u5a48\u5a61\u5a4d\u5923\u5922\u5a5c\u5a43\u5a65\u5a67\u593e\u5a4f\u5934\u5924\u592e\u5a64\u5a44\u5a46\u5a59\u5a59\u5a4d\u5a79\u5939\u5937\u5a48\u5926\u5927\u5a4a\u5a5e\u5a67\u5922\u5a5a\u592f\u5931\u5922\u592a\u5922\u5924\u5924\u5926\u592f\u5934\u593b\u5a60\u5a44\u5a67\u5a59\u5a68\u593b\u5a51\u5a43\u5930\u5931\u5926\u593c\u5a64\u5932\u5a5d\u593a\u5939\u5926\u593e\u593e\u5a41\u593f\u5a4a\u5a4e\u5a54\u5a62\u592a\u593b\u5a4f\u5a65\u592e\u5a50\u5924\u5a6e\u5a51\u5a62\u5940\u5a60\u5a62\u5923\u5a60\u5921\u5922\u5a53\u5933\u5a42\u5a4f\u5930\u5a5e\u5a46\u5a54\u5930\u5a62\u5a4f\u5921\u5a68\u5a6e\u5924\u592d\u5a5b\u592e\u5a4a\u5934\u5a53\u5a59\u5a61\u5a57\u5a65\u5a43\u5925\u5a70\u593c\u5928\u5931\u5a4e\u5a4a\u5a46\u5a6e\u5a44\u5939\u5a4a\u5a52\u5a48\u5a5a\u5a51\u5a53\u5a62\u5a43\u593e\u593e\u5a70\u5924\u5a4d\u5a60\u5a5b\u5a59\u5a52\u5a42\u5a70\u5a57\u5a68\u5a68\u5923\u5a43\u5a48\u5a54\u5a53\u5a43\u5a67\u5921\u5a5a\u5a70\u5a6e\u5a5e\u593e\u5a5d\u5a5f\u5924\u5a57\u593d\u5a79\u5a4a\u5a4f\u5933\u5a59\u5a45\u5a50\u593d\u5a57\u5a52\u5923\u5921\u5a50\u5a46\u5933\u5a5c\u5940\u5937\u5932\u593c\u593e\u5a4d\u5930\u5a6d\u592e\u5a5d\u5933\u5a6d\u5a5a\u5926\u5a4e\u5930\u5932\u5928\u5a54\u5a4e\u5a45\u593b\u5a63\u5931\u5a4a\u5a64\u5a5e\u5923\u593b\u5a4d\u5925\u5a5e\u5a42\u5924\u5a41\u5927\u5a5c\u5a6f\u593f\u593c\u5a4f\u593a\u5a47\u5a70\u5a70\u5a54\u5a42\u5937\u5a50\u5a47\u592e\u593b\u5a5f\u5939\u5a4e\u5a43\u593a\u5a5a\u5a4f\u5a68\u5a5b\u5921\u593e\u5a46\u5a52\u5a48\u5930\u5a6e\u593b\u593c\u5a4e\u5a5a\u593b\u5a5a\u5a5f\u5930\u5a5f\u592a\u5a59\u5a64\u5940\u5a47\u5a70\u5a53\u5926\u5a5c\u5a62\u5a46\u5932\u5937\u5a64\u5a6f\u5a45\u5a64\u5a70\u5924\u5a46\u5921\u5a54\u5a5e\u592a\u5a45\u5926\u5a42\u5a62\u5a50\u5939\u5939\u5a54\u5922\u5a4e\u5a79\u5a5a\u5a41\u5a5c\u5a64\u5a5a\u5a4e\u5928\u5a61\u5934\u5a47\u5925\u5a44\u5a65\u5939\u5a51\u5931\u5a47\u5a52\u5928\u5a43\u5a52\u5a6d\u5a67\u5937\u5a60\u5a57\u5a48\u5a5a\u5a65\u5a41\u5a60\u5a61\u5a5b\u5925\u592d\u5a6d\u5931\u5a5c\u5a4d\u5926\u5927\u5a6d\u5a79\u592e\u593f\u593b\u5a5a\u5a5c\u5a63\u5a45\u5927\u5a65\u5a6e\u5a53\u5a59\u5a64\u5921\u5a5b\u593a\u5928\u5a51\u5a62\u5924\u5a54\u5a4e\u5a53\u5a57\u5a6d\u5939\u592e\u5a50\u5a5f\u5a61\u5a61\u5928\u5a60\u5a53\u5939\u5a67\u5a48\u5a64\u5a5f\u5a5f\u5a5c\u5928\u5a4e\u5921\u5a43\u5a65\u5a42\u5a5c\u5a4e\u5a61\u592e\u5a79\u5a6e\u5a62\u5926\u5931\u5926\u5a42\u5923\u5a64\u5a68\u5a5e\u5922\u5a59\u5a48\u5a5d\u592f\u5a6e\u5930\u5a50\u5933\u5a5e\u5a50\u5a4e\u5a5c\u593f\u5a46\u5a5d\u5934\u5925\u5a61\u593f\u5a5c\u5940\u5a59\u593a\u5a52\u5a5b\u5a53\u5924\u5932\u5a70\u5933\u5928\u5a67\u5a45\u5a67\u5a4e\u5932\u5a5b\u5933\u5a42\u592a\u5a61\u5a5e\u593c\u5a70\u593f\u5a50\u5a5f\u5a41\u593f\u5a4f\u5a68\u5930\u5a5a\u5937\u5921\u5a41\u5a67\u5a61\u5930\u5939\u5a46\u5a48\u5a5f\u5a5c\u5a53\u5928\u593c\u5a4e\u5a61\u5932\u593d\u5924\u592f\u5a59\u5930\u5a46\u5940\u592f\u5a60\u5a79\u5a6e\u5937\u5925\u5a61\u5a46\u5a5b\u5934\u5a5c\u5a79\u5a62\u593a\u5a70\u5921\u593e\u5a6f\u5a52\u5a44\u5a48\u5a67\u5a5a\u5926\u5a5f\u5a6e\u5a61\u593c\u5a6e\u5a5d\u5931\u5a6e\u5931\u5a4e\u5a43\u5a46\u5a60\u5926\u5a53\u5a4e\u5927\u5930\u593d\u5923\u5939\u5940\u5a68\u5a63\u5a5e\u5937\u5a68\u5a5f\u593c\u592d\u5a6b\u5a6b".toCharArray();
            for (int i2 = 0; i2 < 856; ++i2) {
                int n4 = cArray[i2];
                n4 -= 16816;
                n4 += 33041;
                n4 -= 50722;
                n4 ^= 0xA512;
                n4 ^= 0xF467;
                n4 += 50567;
                n4 -= 64073;
                n4 -= 36717;
                n4 += 8813;
                n4 -= 45677;
                n4 += 39390;
                cArray[i2] = (char)(n4 += 14255);
            }
            object = b_0.A()[0] = new String(cArray);
        }
        objectArray[2] = (String)object;
        char[] cArray = ((String)b_0.a(objectArray)).toCharArray();
        long l17 = l6;
        int n5 = -50;
        n5 -= -20;
        l6 = l17 ^ (0x26800000000L ^ l17) & -1L << (n5 += 62);
        long l18 = l13;
        int n6 = -31;
        n6 += 87;
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n6 -= 24);
        while (true) {
            int n7 = 90;
            n7 ^= 0x58;
            if ((int)l13 >= (int)(l6 >>> (n7 += 30))) break;
            int n8 = (int)l13;
            long l19 = l13;
            int n9 = 73;
            n9 += -119;
            int n10 = -84;
            n10 -= 38;
            l13 = l19 ^ (l19 ^ l19 + (long)(n9 ^= 0xFFFFFFD3)) & -1L >>> (n10 ^= 0xFFFFFFA6);
            long l20 = l9;
            int n11 = 14;
            n11 ^= 0x26;
            l9 = l20 ^ ((long)cArray[n8] ^ l20) & -1L >>> (n11 -= 8);
            int n12 = (int)l13;
            long l21 = l13;
            int n13 = 51;
            int n14 = 8;
            n14 ^= 0xFFFFFFDE;
            l13 = l21 ^ (l21 ^ l21 + (long)(n13 += -50)) & -1L >>> (n14 -= -74);
            int n15 = -135;
            n15 ^= 0xFFFFFFFF;
            long l22 = l10;
            int n16 = -75;
            n16 ^= 0x30;
            l10 = l22 ^ ((long)cArray[n12] << (n15 += -102) ^ l22) & -1L << (n16 ^= 0xFFFFFFA5);
            int n17 = 82;
            n17 -= -52;
            n17 += -118;
            int n18 = 104;
            n18 -= 118;
            long l23 = l12;
            int n19 = 18;
            n19 += 98;
            l12 = l23 ^ ((long)((int)l9 << n17 | (int)(l10 >>> (n18 -= -46))) ^ l23) & -1L >>> (n19 -= 84);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n20 = -27;
            n20 ^= 3;
            l14 = l24 ^ (0L ^ l24) & -1L << (n20 -= -58);
            while (true) {
                int n21 = 71;
                n21 += -52;
                if ((int)(l14 >>> (n21 += 13)) >= (int)l12) break;
                int n22 = -1;
                n22 ^= 0xFFFFFFEC;
                int n23 = 11;
                n23 -= 75;
                cArray2[(int)(l14 >>> (n22 += 13))] = cArray[(int)l13 + (int)(l14 >>> (n23 -= -96))];
                l14 += 0x100000000L;
            }
            int n24 = -29;
            n24 ^= 2;
            int n25 = (int)(l15 >>> (n24 -= -63));
            l15 += 0x100000000L;
            b_0.U[n25] = new String(cArray2);
            long l25 = l13;
            int n26 = -70;
            n26 -= -8;
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n26 -= -94);
        }
        int n27 = -176;
        n27 += 54;
        int[] nArray = new int[n27 -= -127];
        int n28 = 101;
        n28 += -97;
        int n29 = -58;
        n29 -= 9;
        nArray[n28 ^= 4] = n29 -= -75;
        int n30 = 62;
        n30 ^= 0xFFFFFFDD;
        int n31 = -158;
        n31 += 121;
        nArray[n30 += 30] = n31 += 45;
        int n32 = -114;
        n32 -= -9;
        int n33 = 26;
        n33 += 24;
        nArray[n32 -= -107] = n33 -= 46;
        int n34 = 98;
        n34 ^= 0x53;
        int n35 = 127;
        n35 += -37;
        nArray[n34 += -46] = n35 += -88;
        int n36 = -124;
        n36 ^= 0x30;
        int n37 = 112;
        n37 += -53;
        nArray[n36 ^= 0xFFFFFFB0] = n37 -= 60;
        n = nArray;
        int n38 = -109;
        int[] nArray2 = new int[n38 += 114];
        int n39 = -32;
        n39 ^= 0x40;
        int n40 = 70;
        n40 += -17;
        nArray2[n39 ^= 0xFFFFFFA0] = n40 ^= 0x35;
        int n41 = -59;
        n41 += 92;
        int n42 = 54;
        n42 -= -66;
        nArray2[n41 += -32] = n42 -= 116;
        int n43 = 142;
        n43 -= 36;
        int n44 = -121;
        n44 ^= 0xFFFFFF8D;
        nArray2[n43 -= 104] = n44 -= 8;
        int n45 = -130;
        n45 += 23;
        int n46 = 70;
        n46 -= 96;
        nArray2[n45 ^= 0xFFFFFF96] = n46 ^= 0xFFFFFFE7;
        int n47 = 115;
        n47 -= 68;
        int n48 = 34;
        n48 ^= 0x65;
        nArray2[n47 += -43] = n48 -= 72;
        N = nArray2;
        u = null;
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[1];
        String string = (String)object[2];
        object = object[0];
        Object[] objectArray = w;
        if (w == null) {
            objectArray = w = new Object[1];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[1];
                v = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[0x61F6 ^ 0x61E6];
                byArray[0x54 ^ 0x54] = 0xFFFFFFA9 ^ 0x54;
                byArray[0x7904 ^ 0x7909] = 0xFFFF86B1 ^ 0x7909;
                byArray[0x44E4 ^ 0x44E2] = 0xFFFFBB69 ^ 0x44E2;
                byArray[0x86C8 ^ 0x86C7] = 0x8695 ^ 0x86C7;
                byArray[0x534F ^ 0x5347] = 0xFFFFACE4 ^ 0x5347;
                byArray[0x3578 ^ 0x357D] = 0xFFFFCAE4 ^ 0x357D;
                byArray[0x2282 ^ 0x2286] = 0xFFFFDD08 ^ 0x2286;
                byArray[0x814 ^ 0x81D] = 0xFFFFF7C1 ^ 0x81D;
                byArray[0xF54A ^ 0xF548] = 0xF512 ^ 0xF548;
                byArray[0x3CC0 ^ 0x3CCA] = 0xFFFFC320 ^ 0x3CCA;
                byArray[0x8CDF ^ 0x8CDC] = 0xFFFF736A ^ 0x8CDC;
                byArray[0x439 ^ 0x43E] = 0x476 ^ 0x43E;
                byArray[0x8096 ^ 0x8097] = 0x80A0 ^ 0x8097;
                byArray[0x5152 ^ 0x5159] = 0xFFFFAEB7 ^ 0x5159;
                byArray[0x82D0 ^ 0x82DC] = 0xFFFF7D06 ^ 0x82DC;
                byArray[0x7DF9 ^ 0x7DF7] = 0xFFFF8238 ^ 0x7DF7;
                objectArray2[0] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (V == null) {
                byte[] byArray2 = new byte[0xF2DF ^ 0xF2FF];
                byArray2[0x83CA ^ 0x83D0] = 0x83CE ^ 0x83D0;
                byArray2[0x108BB ^ 0x108A6] = 0x108A5 ^ 0x108A6;
                byArray2[0xCB97 ^ 0xCB9A] = 0xFFFF3420 ^ 0xCB9A;
                byArray2[0x3985 ^ 0x398D] = 0x398C ^ 0x398D;
                byArray2[0xBC48 ^ 0xBC5B] = 0xBC0F ^ 0xBC5B;
                byArray2[0xE413 ^ 0xE412] = 0xFFFF1BE0 ^ 0xE412;
                byArray2[0x3DB6 ^ 0x3DAD] = 0xFFFFC20C ^ 0x3DAD;
                byArray2[0xB7FC ^ 0xB7FA] = 0xFFFF480B ^ 0xB7FA;
                byArray2[0x5628 ^ 0x5628] = 0xFFFFA9D1 ^ 0x5628;
                byArray2[0x72A4 ^ 0x72B6] = 0x72F5 ^ 0x72B6;
                byArray2[0xB3F2 ^ 0xB3FC] = 0xB3ED ^ 0xB3FC;
                byArray2[0xE8AA ^ 0xE8B5] = 0xFFFF1772 ^ 0xE8B5;
                byArray2[0x9796 ^ 0x9795] = 0x97A9 ^ 0x9795;
                byArray2[0x9DB0 ^ 0x9DB2] = 0x9DA1 ^ 0x9DB2;
                byArray2[0x5826 ^ 0x583A] = 0x5826 ^ 0x583A;
                byArray2[0xA403 ^ 0xA413] = 0xA454 ^ 0xA413;
                byArray2[0xC95 ^ 0xC8D] = 0xFFFFF334 ^ 0xC8D;
                byArray2[0x675C ^ 0x6750] = 0xFFFF98FF ^ 0x6750;
                byArray2[0xD494 ^ 0xD48D] = 0xFFFF2B11 ^ 0xD48D;
                byArray2[0x9F3D ^ 0x9F28] = 0x9F23 ^ 0x9F28;
                byArray2[0x846 ^ 0x850] = 0xFFFFF7D4 ^ 0x850;
                byArray2[0x10C16 ^ 0x10C02] = 0x10C6A ^ 0x10C02;
                byArray2[0xCDA9 ^ 0xCDAC] = 0xCDAB ^ 0xCDAC;
                byArray2[0xF399 ^ 0xF39E] = 0xFFFF0C04 ^ 0xF39E;
                byArray2[0x801E ^ 0x8014] = 0x8015 ^ 0x8014;
                byArray2[0x9CE7 ^ 0x9CF6] = 0x9C94 ^ 0x9CF6;
                byArray2[0x2F31 ^ 0x2F26] = 0x2F16 ^ 0x2F26;
                byArray2[0x2038 ^ 0x2026] = 0x2047 ^ 0x2026;
                byArray2[0x683 ^ 0x688] = 0x68E ^ 0x688;
                byArray2[0x7207 ^ 0x7208] = 0x7231 ^ 0x7208;
                byArray2[0xA6E4 ^ 0xA6ED] = 0xA6DA ^ 0xA6ED;
                byArray2[0x3E25 ^ 0x3E21] = 0x3E1D ^ 0x3E21;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = b_0.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u605a\u6060\u6065\u605e\u6064\u66b0\u6051\u6787\u606e\u6782\u6062\u669b\u678f\u678d\u605d\u6062\u606f\u66bf".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= 0xA381;
                        n3 += 40305;
                        n3 ^= 0x9F91;
                        n3 ^= 0x24E4;
                        n3 -= 11592;
                        n3 += 51739;
                        n3 -= 55995;
                        n3 += 60972;
                        n3 -= 3772;
                        n3 += 63037;
                        cArray[i2] = (char)(n3 ^= 0x71AE);
                    }
                    object4 = b_0.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[11] = -70;
                byArray4[3] = -61;
                byArray4[7] = 44;
                byArray4[8] = 79;
                byArray4[10] = -29;
                byArray4[14] = 8;
                byArray4[2] = -90;
                byArray4[0] = -108;
                byArray4[15] = 76;
                byArray4[13] = 108;
                byArray4[6] = 125;
                byArray4[9] = -15;
                byArray4[4] = 26;
                byArray4[12] = -70;
                byArray4[1] = 22;
                byArray4[5] = -74;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 3, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = b_0.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ud6cd\ud6f9\ud65f".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 48562;
                        n4 -= 9475;
                        n4 -= 30932;
                        n4 ^= 0x294;
                        n4 ^= 0xBAC6;
                        n4 ^= 0xA037;
                        n4 -= 36520;
                        n4 += 2777;
                        n4 ^= 0x357C;
                        n4 ^= 0x4AAD;
                        cArray[i3] = (char)(n4 -= 5358);
                    }
                    object5 = b_0.A()[2] = new String(cArray);
                }
                V = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = b_0.A()[3];
            if (object6 == null) {
                char[] cArray = "\ub1ab\ub1af\ub1a1\ub1dd\ub1b1\ub1b2\ub1b1\ub1dd\ub19c\ub1a9\ub1b1\ub1a1\ub1bf\ub19c\ub18b\ub190\ub190\ub183\ub19e\ub185".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 += 35088;
                    n5 -= 53378;
                    n5 -= 23939;
                    n5 -= 996;
                    n5 -= 43652;
                    n5 -= 54486;
                    n5 ^= 0x90E8;
                    n5 ^= 0xCADC;
                    n5 -= 24894;
                    cArray[i4] = (char)(n5 ^= 0x724F);
                }
                object6 = b_0.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)V), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = W;
        if (W == null) {
            W = new Object[4];
            objectArray = W;
        }
        return objectArray;
    }

    public static void b() {
        x = new int[0xE1C6 ^ 0xE056];
        b_0.x[0xC11C ^ 0xC10F] = 0xC168 ^ 0xC10F;
        b_0.x[0xC343 ^ 0xC31B] = 0xFFFF3CE3 ^ 0xC31B;
        b_0.x[0x23DF ^ 0x2336] = 0x235A ^ 0x2336;
        b_0.x[0x125A ^ 0x1344] = 0x1302 ^ 0x1344;
        b_0.x[0x2479 ^ 0x253C] = 0xFFFFDADA ^ 0x253C;
        b_0.x[0x961A ^ 0x96AB] = 0x96A0 ^ 0x96AB;
        b_0.x[0x7E9F ^ 0x7E62] = 0xFFFF81FD ^ 0x7E62;
        b_0.x[0x116A ^ 0x105D] = 0x1063 ^ 0x105D;
        b_0.x[0x5917 ^ 0x5928] = 0xFFFFA6F3 ^ 0x5928;
        b_0.x[0xF7A2 ^ 0xF6AC] = 0xFFFF095D ^ 0xF6AC;
        b_0.x[0xD135 ^ 0xD175] = 0xFFFF2E88 ^ 0xD175;
        b_0.x[0x43FF ^ 0x4388] = 0x43D3 ^ 0x4388;
        b_0.x[0x8A7D ^ 0x8A00] = 0xFFFF75C4 ^ 0x8A00;
        b_0.x[0xCCC2 ^ 0xCC89] = 0xFFFF3359 ^ 0xCC89;
        b_0.x[0xCCA6 ^ 0xCC90] = 0xCCA0 ^ 0xCC90;
        b_0.x[0x3583 ^ 0x351B] = 0xFFFFCAE1 ^ 0x351B;
        b_0.x[0xF9CB ^ 0xF96C] = 0xF903 ^ 0xF96C;
        b_0.x[0x49F ^ 0x5C0] = 0x5DF ^ 0x5C0;
        b_0.x[0x9C7D ^ 0x9CE8] = 0xFFFF631C ^ 0x9CE8;
        b_0.x[0xBFB6 ^ 0xBF69] = 0xFFFF4093 ^ 0xBF69;
        b_0.x[0xB76C ^ 0xB617] = 0xFFFF499C ^ 0xB617;
        b_0.x[0xCB8 ^ 0xD9E] = 0xFFFFF242 ^ 0xD9E;
        b_0.x[0xEA3D ^ 0xEA3E] = 0xEA26 ^ 0xEA3E;
        b_0.x[0x1728 ^ 0x17D1] = 0x17CC ^ 0x17D1;
        b_0.x[0x255B ^ 0x2452] = 0x2424 ^ 0x2452;
        b_0.x[0xBB43 ^ 0xBBAD] = 0xFFFF4454 ^ 0xBBAD;
        b_0.x[0x2C50 ^ 0x2C8D] = 0xFFFFD349 ^ 0x2C8D;
        b_0.x[0xC6C2 ^ 0xC79C] = 0xFFFF3865 ^ 0xC79C;
        b_0.x[0xC192 ^ 0xC0BC] = 0xC0F1 ^ 0xC0BC;
        b_0.x[0x6177 ^ 0x61D8] = 0x61C2 ^ 0x61D8;
        b_0.x[0xC440 ^ 0xC46A] = 0xC479 ^ 0xC46A;
        b_0.x[0xCCD8 ^ 0xCCB4] = 0xFFFF336B ^ 0xCCB4;
        b_0.x[0xAA2C ^ 0xAA55] = 0xAA67 ^ 0xAA55;
        b_0.x[0x5336 ^ 0x523C] = 0x526B ^ 0x523C;
        b_0.x[0x5E17 ^ 0x5F5D] = 0x5F58 ^ 0x5F5D;
        b_0.x[0xE906 ^ 0xE9E6] = 0xE9D1 ^ 0xE9E6;
        b_0.x[0xBAAC ^ 0xBB2C] = 0xFFFF4484 ^ 0xBB2C;
        b_0.x[0x7D64 ^ 0x7C2A] = 0xFFFF83DD ^ 0x7C2A;
        b_0.x[0x10DFE ^ 0x10CAE] = 0x10C20 ^ 0x10CAE;
        b_0.x[0x5033 ^ 0x517B] = 0x512F ^ 0x517B;
        b_0.x[0x2C87 ^ 0x2C7F] = 0xFFFFD39E ^ 0x2C7F;
        b_0.x[0x3BDD ^ 0x3B81] = 0x3BE8 ^ 0x3B81;
        b_0.x[0xADA9 ^ 0xADD3] = 0xADDD ^ 0xADD3;
        b_0.x[0xC223 ^ 0xC27C] = 0xFFFF3DA9 ^ 0xC27C;
        b_0.x[0x10FD3 ^ 0x10F16] = 0x10F5E ^ 0x10F16;
        b_0.x[0xBD43 ^ 0xBC37] = 0xFFFF4354 ^ 0xBC37;
        b_0.x[0x6F3D ^ 0x6FC9] = 0x6FF0 ^ 0x6FC9;
        b_0.x[0xCAB9 ^ 0xCA1C] = 0xCA05 ^ 0xCA1C;
        b_0.x[0x762C ^ 0x7695] = 0x768B ^ 0x7695;
        b_0.x[0xE4CD ^ 0xE464] = 0xE413 ^ 0xE464;
        b_0.x[0x64D5 ^ 0x642B] = 0xFFFF9B8A ^ 0x642B;
        b_0.x[0x9155 ^ 0x918E] = 0x913C ^ 0x918E;
        b_0.x[0xD68B ^ 0xD61C] = 0xFFFF29A2 ^ 0xD61C;
        b_0.x[0x30D3 ^ 0x305D] = 0xFFFFCFD0 ^ 0x305D;
        b_0.x[0x3FDD ^ 0x3E52] = 0x3E33 ^ 0x3E52;
        b_0.x[0x10292 ^ 0x1024E] = 0x10218 ^ 0x1024E;
        b_0.x[0xC5BE ^ 0xC5DB] = 0xC5A1 ^ 0xC5DB;
        b_0.x[0x1DC3 ^ 0x1D89] = 0xFFFFE210 ^ 0x1D89;
        b_0.x[0x6475 ^ 0x64D4] = 0x64AD ^ 0x64D4;
        b_0.x[0xD344 ^ 0xD22F] = 0xD21C ^ 0xD22F;
        b_0.x[0x1469 ^ 0x148D] = 0xFFFFEB50 ^ 0x148D;
        b_0.x[0x9502 ^ 0x944B] = 0xFFFF6BBC ^ 0x944B;
        b_0.x[0x5429 ^ 0x5482] = 0x54ED ^ 0x5482;
        b_0.x[0x8907 ^ 0x888D] = 0xFFFF7730 ^ 0x888D;
        b_0.x[0x3004 ^ 0x3152] = 0xFFFFCEBF ^ 0x3152;
        b_0.x[0xD806 ^ 0xD915] = 0xFFFF26E0 ^ 0xD915;
        b_0.x[0x26F3 ^ 0x260F] = 0x2653 ^ 0x260F;
        b_0.x[0x9BCA ^ 0x9B21] = 0x9B3A ^ 0x9B21;
        b_0.x[0x1277 ^ 0x1377] = 0x1301 ^ 0x1377;
        b_0.x[0x94C2 ^ 0x95E3] = 0xFFFF6A55 ^ 0x95E3;
        b_0.x[0x928F ^ 0x9287] = 0xFFFF6D05 ^ 0x9287;
        b_0.x[0x7E8B ^ 0x7E1A] = 0x7E7B ^ 0x7E1A;
        b_0.x[0x387C ^ 0x38BF] = 0xFFFFC749 ^ 0x38BF;
        b_0.x[0x53E5 ^ 0x5323] = 0xFFFFAC9A ^ 0x5323;
        b_0.x[0xBE37 ^ 0xBED4] = 0xFFFF4136 ^ 0xBED4;
        b_0.x[0x9CD9 ^ 0x9CBA] = 0x9C36 ^ 0x9CBA;
        b_0.x[0x1C08 ^ 0x1C5A] = 0xFFFFE3B1 ^ 0x1C5A;
        b_0.x[0xA301 ^ 0xA217] = 0xFFFF5D93 ^ 0xA217;
        b_0.x[0xE06D ^ 0xE08C] = 0xE0D5 ^ 0xE08C;
        b_0.x[0xB42D ^ 0xB522] = 0xB502 ^ 0xB522;
        b_0.x[0xF99 ^ 0xED6] = 0xFFFFF102 ^ 0xED6;
        b_0.x[0x1C86 ^ 0x1CDB] = 0xFFFFE331 ^ 0x1CDB;
        b_0.x[0x9A98 ^ 0x9ADC] = 0xFFFF651E ^ 0x9ADC;
        b_0.x[0xBB25 ^ 0xBB0A] = 0xBB7D ^ 0xBB0A;
        b_0.x[0xC4A3 ^ 0xC413] = 0xC41F ^ 0xC413;
        b_0.x[0x9BA ^ 0x9B5] = 0x99A ^ 0x9B5;
        b_0.x[0x10FC4 ^ 0x10F15] = 0x10F03 ^ 0x10F15;
        b_0.x[0xFF12 ^ 0xFF5B] = 0xFFFF00D5 ^ 0xFF5B;
        b_0.x[0x8A66 ^ 0x8A21] = 0x8A2A ^ 0x8A21;
        b_0.x[0x258C ^ 0x2589] = 0x25E5 ^ 0x2589;
        b_0.x[0x41BA ^ 0x41D5] = 0x418C ^ 0x41D5;
        b_0.x[0xF3 ^ 0x1D3] = 0x1E7 ^ 0x1D3;
        b_0.x[0x794A ^ 0x780B] = 0x7899 ^ 0x780B;
        b_0.x[0x4FA6 ^ 0x4F7C] = 0x4F07 ^ 0x4F7C;
        b_0.x[0x97C ^ 0x81B] = 0xFFFFF7AA ^ 0x81B;
        b_0.x[0x4B6 ^ 0x5CF] = 0xFFFFFA7A ^ 0x5CF;
        b_0.x[0xBC91 ^ 0xBCA2] = 0xBCED ^ 0xBCA2;
        b_0.x[0x384F ^ 0x3916] = 0x3972 ^ 0x3916;
        b_0.x[0xDA30 ^ 0xDA69] = 0xFFFF25B1 ^ 0xDA69;
        b_0.x[0xFC90 ^ 0xFD1E] = 0xFD71 ^ 0xFD1E;
        b_0.x[0xC762 ^ 0xC769] = 0xC73F ^ 0xC769;
        b_0.x[0xBBC0 ^ 0xBBA2] = 0xBBCE ^ 0xBBA2;
        b_0.x[0x6D15 ^ 0x6C27] = 0xFFFF939A ^ 0x6C27;
        b_0.x[0x5EA0 ^ 0x5E77] = 0xFFFFA1E6 ^ 0x5E77;
        b_0.x[0xAAF ^ 0xBAC] = 0xFFFFF44E ^ 0xBAC;
        b_0.x[0x7802 ^ 0x781E] = 0x784A ^ 0x781E;
        b_0.x[0x3D1D ^ 0x3C37] = 0x3C3B ^ 0x3C37;
        b_0.x[0xF1E ^ 0xE16] = 0xE38 ^ 0xE16;
        b_0.x[0xA349 ^ 0xA37B] = 0xFFFF5CF0 ^ 0xA37B;
        b_0.x[0xF047 ^ 0xF07B] = 0xFFFF0F99 ^ 0xF07B;
        b_0.x[0xAB2D ^ 0xAB5D] = 0xAB6E ^ 0xAB5D;
        b_0.x[0x8D47 ^ 0x8CCF] = 0xFFFF736C ^ 0x8CCF;
        b_0.x[0xF0CB ^ 0xF1B9] = 0xFFFF0E67 ^ 0xF1B9;
        b_0.x[0x43C1 ^ 0x430A] = 0xFFFFBCE6 ^ 0x430A;
        b_0.x[0xF05C ^ 0xF007] = 0xFFFF0FAD ^ 0xF007;
        b_0.x[0x7306 ^ 0x73D3] = 0xFFFF8C9A ^ 0x73D3;
        b_0.x[0x62B2 ^ 0x6387] = 0x632E ^ 0x6387;
        b_0.x[0x5877 ^ 0x5963] = 0xFFFFA65E ^ 0x5963;
        b_0.x[0x105E5 ^ 0x1056A] = 0xFFFEFA92 ^ 0x1056A;
        b_0.x[0x26 ^ 0x52] = 0x78 ^ 0x52;
        b_0.x[0xE33 ^ 0xF61] = 0xF6B ^ 0xF61;
        b_0.x[0xA64A ^ 0xA6E6] = 0xA69D ^ 0xA6E6;
        b_0.x[0x35DA ^ 0x35AC] = 0x359E ^ 0x35AC;
        b_0.x[0x2E4A ^ 0x2F2F] = 0xFFFFD0B4 ^ 0x2F2F;
        b_0.x[0xF2C3 ^ 0xF24A] = 0xF266 ^ 0xF24A;
        b_0.x[0x961B ^ 0x9698] = 0xFFFF697A ^ 0x9698;
        b_0.x[0x10CDA ^ 0x10CA6] = 0x10CF1 ^ 0x10CA6;
        b_0.x[0x68AB ^ 0x68CD] = 0xFFFF9766 ^ 0x68CD;
        b_0.x[0x10183 ^ 0x100F3] = 0xFFFEFF7A ^ 0x100F3;
        b_0.x[0xDE1C ^ 0xDE76] = 0xDE31 ^ 0xDE76;
        b_0.x[0x1486 ^ 0x14C7] = 0xFFFFEB1F ^ 0x14C7;
        b_0.x[0xAF21 ^ 0xAE70] = 0xFFFF51EC ^ 0xAE70;
        b_0.x[0x6A79 ^ 0x6ACF] = 0xFFFF957A ^ 0x6ACF;
        b_0.x[0xFD93 ^ 0xFCFA] = 0xFCA9 ^ 0xFCFA;
        b_0.x[0xE9CD ^ 0xE9AA] = 0xE9A0 ^ 0xE9AA;
        b_0.x[0x10C82 ^ 0x10CEC] = 0xFFFEF35B ^ 0x10CEC;
        b_0.x[0x3DCA ^ 0x3DFA] = 0x3D42 ^ 0x3DFA;
        b_0.x[0x2607 ^ 0x261A] = 0xFFFFD98C ^ 0x261A;
        b_0.x[0xE723 ^ 0xE738] = 0xFFFF18D1 ^ 0xE738;
        b_0.x[0x2F2C ^ 0x2F6A] = 0xFFFFD08F ^ 0x2F6A;
        b_0.x[0x4FFF ^ 0x4F6C] = 0x4FE8 ^ 0x4F6C;
        b_0.x[0x2AF0 ^ 0x2A0F] = 0x2A10 ^ 0x2A0F;
        b_0.x[0x8823 ^ 0x89A7] = 0x89DE ^ 0x89A7;
        b_0.x[0xD5AF ^ 0xD5F8] = 0xFFFF2A08 ^ 0xD5F8;
        b_0.x[0x985B ^ 0x9894] = 0xFFFF6760 ^ 0x9894;
        b_0.x[0x3149 ^ 0x31C9] = 0x318D ^ 0x31C9;
        b_0.x[0x7DBA ^ 0x7DAC] = 0x7DF5 ^ 0x7DAC;
        b_0.x[0xFC5C ^ 0xFD17] = 0xFFFF02C9 ^ 0xFD17;
        b_0.x[0x935E ^ 0x9268] = 0xFFFF6DFE ^ 0x9268;
        b_0.x[0xE775 ^ 0xE7E1] = 0xFFFF1849 ^ 0xE7E1;
        b_0.x[0xD0E1 ^ 0xD1D1] = 0xD188 ^ 0xD1D1;
        b_0.x[0x3E65 ^ 0x3E34] = 0xFFFFC1E9 ^ 0x3E34;
        b_0.x[0xB7F1 ^ 0xB6F0] = 0xB6B8 ^ 0xB6F0;
        b_0.x[0x7A63 ^ 0x7ADE] = 0x7AB7 ^ 0x7ADE;
        b_0.x[0x10246 ^ 0x10259] = 0x1020E ^ 0x10259;
        b_0.x[0x233 ^ 0x2A8] = 0x29D ^ 0x2A8;
        b_0.x[0xF861 ^ 0xF805] = 0xF837 ^ 0xF805;
        b_0.x[0xF7C3 ^ 0xF713] = 0xF751 ^ 0xF713;
        b_0.x[0x174D ^ 0x1755] = 0xFFFFE888 ^ 0x1755;
        b_0.x[0x9019 ^ 0x911D] = 0xFFFF6E9F ^ 0x911D;
        b_0.x[0xCD24 ^ 0xCD10] = 0xCD53 ^ 0xCD10;
        b_0.x[0x2568 ^ 0x25F4] = 0x25CC ^ 0x25F4;
        b_0.x[0x3D43 ^ 0x3C7A] = 0xFFFFC384 ^ 0x3C7A;
        b_0.x[0x5BC8 ^ 0x5AD5] = 0xFFFFA55B ^ 0x5AD5;
        b_0.x[0x4417 ^ 0x4441] = 0xFFFFBBC7 ^ 0x4441;
        b_0.x[0x2D02 ^ 0x2DAA] = 0xFFFFD22A ^ 0x2DAA;
        b_0.x[0xD871 ^ 0xD8DF] = 0xFFFF2731 ^ 0xD8DF;
        b_0.x[0x6161 ^ 0x616F] = 0xFFFF9E83 ^ 0x616F;
        b_0.x[0xCA8B ^ 0xCA55] = 0xCA08 ^ 0xCA55;
        b_0.x[0x9BEA ^ 0x9BAF] = 0xFFFF645E ^ 0x9BAF;
        b_0.x[0x4780 ^ 0x47D5] = 0x47A5 ^ 0x47D5;
        b_0.x[0x3D59 ^ 0x3CD4] = 0xFFFFC315 ^ 0x3CD4;
        b_0.x[0xFDE6 ^ 0xFCC4] = 0xFCBE ^ 0xFCC4;
        b_0.x[0x3437 ^ 0x348C] = 0xFFFFCB37 ^ 0x348C;
        b_0.x[0x10B5B ^ 0x10BA8] = 0x10BEF ^ 0x10BA8;
        b_0.x[0xD11B ^ 0xD102] = 0xFFFF2EE5 ^ 0xD102;
        b_0.x[0x104D4 ^ 0x105CD] = 0x105FB ^ 0x105CD;
        b_0.x[0x76D8 ^ 0x765F] = 0xFFFF89AD ^ 0x765F;
        b_0.x[0x10D ^ 0x56] = 0x6A ^ 0x56;
        b_0.x[0xA73C ^ 0xA771] = 0xFFFF5898 ^ 0xA771;
        b_0.x[0xF3B ^ 0xF01] = 0xF74 ^ 0xF01;
        b_0.x[0x7DAA ^ 0x7D89] = 0xFFFF8239 ^ 0x7D89;
        b_0.x[0xADA4 ^ 0xAD5F] = 0xAD51 ^ 0xAD5F;
        b_0.x[0xEF94 ^ 0xEF0D] = 0xEF1D ^ 0xEF0D;
        b_0.x[0x2CF4 ^ 0x2DB9] = 0xFFFFD252 ^ 0x2DB9;
        b_0.x[0xB7FC ^ 0xB783] = 0xB7C3 ^ 0xB783;
        b_0.x[0xF820 ^ 0xF95A] = 0xF953 ^ 0xF95A;
        b_0.x[0x2704 ^ 0x27B1] = 0x2799 ^ 0x27B1;
        b_0.x[0x9246 ^ 0x92F2] = 0x9289 ^ 0x92F2;
        b_0.x[0x113A ^ 0x116E] = 0xFFFFEEB8 ^ 0x116E;
        b_0.x[0xE974 ^ 0xE879] = 0xE847 ^ 0xE879;
        b_0.x[0x42BB ^ 0x420C] = 0x4229 ^ 0x420C;
        b_0.x[0xE138 ^ 0xE034] = 0xE051 ^ 0xE034;
        b_0.x[0x5FFF ^ 0x5F45] = 0xFFFFA0BB ^ 0x5F45;
        b_0.x[0xAB79 ^ 0xAA7F] = 0xAA2E ^ 0xAA7F;
        b_0.x[0x44C1 ^ 0x445F] = 0x4463 ^ 0x445F;
        b_0.x[0x5A06 ^ 0x5B6A] = 0x5B7A ^ 0x5B6A;
        b_0.x[0x53AF ^ 0x533F] = 0xFFFFAC84 ^ 0x533F;
        b_0.x[0x919D ^ 0x9100] = 0xFFFF6E8D ^ 0x9100;
        b_0.x[0xB10A ^ 0xB049] = 0xFFFF4FAA ^ 0xB049;
        b_0.x[0xF790 ^ 0xF7AD] = 0xFFFF0873 ^ 0xF7AD;
        b_0.x[0xCF84 ^ 0xCE83] = 0xCEA6 ^ 0xCE83;
        b_0.x[0xBD7D ^ 0xBC13] = 0xBC71 ^ 0xBC13;
        b_0.x[0xCAA8 ^ 0xCB23] = 0xFFFF34EF ^ 0xCB23;
        b_0.x[0x48BC ^ 0x49D4] = 0x490E ^ 0x49D4;
        b_0.x[0x7074 ^ 0x71F3] = 0xFFFF8E10 ^ 0x71F3;
        b_0.x[0xA14D ^ 0xA1EE] = 0xA1C6 ^ 0xA1EE;
        b_0.x[0x1D9E ^ 0x1D84] = 0x1DB8 ^ 0x1D84;
        b_0.x[0x7A81 ^ 0x7AA4] = 0x7AC4 ^ 0x7AA4;
        b_0.x[0xDB3F ^ 0xDB1E] = 0xDB37 ^ 0xDB1E;
        b_0.x[0xBAD1 ^ 0xBAE0] = 0xBAA3 ^ 0xBAE0;
        b_0.x[0x1165 ^ 0x11D6] = 0xFFFFEE71 ^ 0x11D6;
        b_0.x[0x2515 ^ 0x2421] = 0x245B ^ 0x2421;
        b_0.x[0x4070 ^ 0x4005] = 0xFFFFBF92 ^ 0x4005;
        b_0.x[0x7AA1 ^ 0x7A44] = 0xFFFF85AA ^ 0x7A44;
        b_0.x[0xF0A0 ^ 0xF1CD] = 0xFFFF0E30 ^ 0xF1CD;
        b_0.x[0x46 ^ 0x84] = 0xD9 ^ 0x84;
        b_0.x[0x10FF ^ 0x11CE] = 0x1185 ^ 0x11CE;
        b_0.x[0xF09C ^ 0xF0A4] = 0xFFFF0F64 ^ 0xF0A4;
        b_0.x[0x383A ^ 0x382D] = 0x3867 ^ 0x382D;
        b_0.x[0x91E5 ^ 0x90BF] = 0xFFFF6F02 ^ 0x90BF;
        b_0.x[0x7078 ^ 0x70BC] = 0x70CE ^ 0x70BC;
        b_0.x[0xEE10 ^ 0xEE62] = 0xEE77 ^ 0xEE62;
        b_0.x[0xDD5A ^ 0xDC72] = 0xFFFF2385 ^ 0xDC72;
        b_0.x[0x1014E ^ 0x10186] = 0xFFFEFE7F ^ 0x10186;
        b_0.x[0x8C8F ^ 0x8C67] = 0xFFFF739A ^ 0x8C67;
        b_0.x[0x1CC1 ^ 0x1C61] = 0xFFFFE3D9 ^ 0x1C61;
        b_0.x[0x4D61 ^ 0x4DFE] = 0xFFFFB22F ^ 0x4DFE;
        b_0.x[0x3159 ^ 0x3138] = 0x3149 ^ 0x3138;
        b_0.x[0x6CE5 ^ 0x6C22] = 0x6C42 ^ 0x6C22;
        b_0.x[0xD081 ^ 0xD1BC] = 0xD1E2 ^ 0xD1BC;
        b_0.x[0x363D ^ 0x3712] = 0x3708 ^ 0x3712;
        b_0.x[0x3534 ^ 0x3431] = 0x3544 ^ 0x3431;
        b_0.x[0x7F19 ^ 0x7FE3] = 0x7FE8 ^ 0x7FE3;
        b_0.x[0x2945 ^ 0x2950] = 0x2943 ^ 0x2950;
        b_0.x[0x7DF8 ^ 0x7D73] = 0xFFFF829C ^ 0x7D73;
        b_0.x[0x4B01 ^ 0x4B06] = 0xFFFFB4CA ^ 0x4B06;
        b_0.x[0x8B15 ^ 0x8A4D] = 0xFFFF75BC ^ 0x8A4D;
        b_0.x[0x31E ^ 0x27D] = 0x227 ^ 0x27D;
        b_0.x[0x6B18 ^ 0x6B4B] = 0xFFFF9499 ^ 0x6B4B;
        b_0.x[0x9B41 ^ 0x9B7F] = 0xFFFF649F ^ 0x9B7F;
        b_0.x[0x7F3B ^ 0x7F9D] = 0xFFFF8057 ^ 0x7F9D;
        b_0.x[0xE59D ^ 0xE49F] = 0xE4FF ^ 0xE49F;
        b_0.x[0x5F50 ^ 0x5F5A] = 0x5F2F ^ 0x5F5A;
        b_0.x[0xCF5C ^ 0xCF88] = 0xFFFF301F ^ 0xCF88;
        b_0.x[0xCA6 ^ 0xD25] = 0xFFFFF2E6 ^ 0xD25;
        b_0.x[0xFF31 ^ 0xFE24] = 0xFFFF019A ^ 0xFE24;
        b_0.x[0xA7DA ^ 0xA77E] = 0xA730 ^ 0xA77E;
        b_0.x[0x58D ^ 0x55B] = 0xFFFFFA9D ^ 0x55B;
        b_0.x[0x5DDE ^ 0x5DF5] = 0xFFFFA240 ^ 0x5DF5;
        b_0.x[0x3294 ^ 0x327E] = 0x3229 ^ 0x327E;
        b_0.x[0x21FE ^ 0x21BD] = 0x21C4 ^ 0x21BD;
        b_0.x[0x3996 ^ 0x399F] = 0x39AB ^ 0x399F;
        b_0.x[0xB1F5 ^ 0xB08D] = 0xFFFF4F32 ^ 0xB08D;
        b_0.x[0x21CC ^ 0x21A4] = 0xFFFFDE25 ^ 0x21A4;
        b_0.x[0xFC42 ^ 0xFD7A] = 0xFFFF02FA ^ 0xFD7A;
        b_0.x[0x700F ^ 0x7126] = 0x7177 ^ 0x7126;
        b_0.x[0x7EFB ^ 0x7EB7] = 0xFFFF8148 ^ 0x7EB7;
        b_0.x[0x8A48 ^ 0x8BCD] = 0x8BD1 ^ 0x8BCD;
        b_0.x[0x47EA ^ 0x4781] = 0x479C ^ 0x4781;
        b_0.x[0x10711 ^ 0x10741] = 0x1072E ^ 0x10741;
        b_0.x[0x2971 ^ 0x2959] = 0x2936 ^ 0x2959;
        b_0.x[0x8685 ^ 0x8685] = 0x86B0 ^ 0x8685;
        b_0.x[0x9FBB ^ 0x9F05] = 0xFFFF609D ^ 0x9F05;
        b_0.x[0x1311 ^ 0x122E] = 0x126E ^ 0x122E;
        b_0.x[0xE662 ^ 0xE75E] = 0xE772 ^ 0xE75E;
        b_0.x[0xF160 ^ 0xF071] = 0xFFFF0FF5 ^ 0xF071;
        b_0.x[0x4169 ^ 0x4016] = 0xFFFFBFAE ^ 0x4016;
        b_0.x[0xFAFF ^ 0xFBBD] = 0xFBE8 ^ 0xFBBD;
        b_0.x[0x5093 ^ 0x50ED] = 0x5068 ^ 0x50ED;
        b_0.x[0xFE63 ^ 0xFE18] = 0xFFFF01FE ^ 0xFE18;
        b_0.x[0xEC02 ^ 0xED6D] = 0xFFFF12A6 ^ 0xED6D;
        b_0.x[0x10E7D ^ 0x10E6C] = 0x10E35 ^ 0x10E6C;
        b_0.x[0xD38A ^ 0xD3A6] = 0xD3FC ^ 0xD3A6;
        b_0.x[0xD94E ^ 0xD942] = 0xFFFF26CD ^ 0xD942;
        b_0.x[0xB06C ^ 0xB0D0] = 0xFFFF4F49 ^ 0xB0D0;
        b_0.x[0x3E05 ^ 0x3EF3] = 0x3EC8 ^ 0x3EF3;
        b_0.x[0x4ABE ^ 0x4A7E] = 0x4A71 ^ 0x4A7E;
        b_0.x[0x320D ^ 0x3336] = 0x3364 ^ 0x3336;
        b_0.x[0xB4FA ^ 0xB5BA] = 0xFFFF4A58 ^ 0xB5BA;
        b_0.x[0xD1EC ^ 0xD0C9] = 0xD0A6 ^ 0xD0C9;
        b_0.x[0xF309 ^ 0xF33E] = 0xFFFF0C8A ^ 0xF33E;
        b_0.x[0xB3FA ^ 0xB315] = 0xB328 ^ 0xB315;
        b_0.x[0x8422 ^ 0x857E] = 0x85E4 ^ 0x857E;
        b_0.x[0xF0A0 ^ 0xF1D6] = 0xFFFF0E64 ^ 0xF1D6;
        b_0.x[0xF8DD ^ 0xF9F9] = 0xF9E2 ^ 0xF9F9;
        b_0.x[0x2C32 ^ 0x2C7C] = 0xFFFFD30D ^ 0x2C7C;
        b_0.x[0x4B25 ^ 0x4A58] = 0x4A4E ^ 0x4A58;
        b_0.x[0x4277 ^ 0x42D5] = 0x42F0 ^ 0x42D5;
        b_0.x[0x30E5 ^ 0x31FA] = 0xFFFFCE4A ^ 0x31FA;
        b_0.x[0x107C2 ^ 0x106A4] = 0x106AE ^ 0x106A4;
        b_0.x[0xC2F ^ 0xC3F] = 0xFFFFF3E9 ^ 0xC3F;
        b_0.x[0x1A4A ^ 0x1A80] = 0x1AF1 ^ 0x1A80;
        b_0.x[0x4449 ^ 0x446B] = 0x440D ^ 0x446B;
        b_0.x[0x6735 ^ 0x67C4] = 0xFFFF9857 ^ 0x67C4;
        b_0.x[0x8DD6 ^ 0x8DD0] = 0x8D9D ^ 0x8DD0;
        b_0.x[0xA522 ^ 0xA56A] = 0xA542 ^ 0xA56A;
        b_0.x[0x7147 ^ 0x7026] = 0xFFFF8FEE ^ 0x7026;
        b_0.x[0x233D ^ 0x2306] = 0xFFFFDCC0 ^ 0x2306;
        b_0.x[0xEC61 ^ 0xED7B] = 0xFFFF12E2 ^ 0xED7B;
        b_0.x[0x447D ^ 0x451D] = 0xFFFFBAD4 ^ 0x451D;
        b_0.x[0xA9B6 ^ 0xA8A4] = 0xA8D7 ^ 0xA8A4;
        b_0.x[0xB7D2 ^ 0xB788] = 0xB717 ^ 0xB788;
        b_0.x[0xFB43 ^ 0xFB23] = 0xFFFF04DF ^ 0xFB23;
        b_0.x[0x32EC ^ 0x3201] = 0xFFFFCDDD ^ 0x3201;
        b_0.x[0xE3BD ^ 0xE2E9] = 0xFFFF1D37 ^ 0xE2E9;
        b_0.x[0x7111 ^ 0x7162] = 0x7177 ^ 0x7162;
        b_0.x[0x87C1 ^ 0x87E1] = 0x87DA ^ 0x87E1;
        b_0.x[0xF621 ^ 0xF7A7] = 0xF73D ^ 0xF7A7;
        b_0.x[0xE126 ^ 0xE10F] = 0xE130 ^ 0xE10F;
        b_0.x[0xF42F ^ 0xF4FD] = 0xFFFF0BBF ^ 0xF4FD;
        b_0.x[0x54BF ^ 0x5593] = 0xFFFFAAC0 ^ 0x5593;
        b_0.x[0x669E ^ 0x664D] = 0x6638 ^ 0x664D;
        b_0.x[0x7D4A ^ 0x7D92] = 0xFFFF82A3 ^ 0x7D92;
        b_0.x[0xF132 ^ 0xF1F3] = 0xFFFF0E58 ^ 0xF1F3;
        b_0.x[0x2460 ^ 0x2418] = 0xFFFFDBD8 ^ 0x2418;
        b_0.x[0x52 ^ 0x123] = 0x11D ^ 0x123;
        b_0.x[0x612E ^ 0x607D] = 0xFFFF9FD6 ^ 0x607D;
        b_0.x[0x584A ^ 0x5887] = 0x58F5 ^ 0x5887;
        b_0.x[0x9EB ^ 0x8FC] = 0x8B6 ^ 0x8FC;
        b_0.x[0xEE3C ^ 0xEF42] = 0xFFFF10ED ^ 0xEF42;
        b_0.x[0x87EA ^ 0x87E7] = 0x8784 ^ 0x87E7;
        b_0.x[0xDD4E ^ 0xDDA2] = 0xDDCE ^ 0xDDA2;
        b_0.x[0x9808 ^ 0x993B] = 0x9908 ^ 0x993B;
        b_0.x[0xFC28 ^ 0xFD54] = 0xFD0A ^ 0xFD54;
        b_0.x[0xF40D ^ 0xF4B2] = 0xF4AD ^ 0xF4B2;
        b_0.x[0xC69B ^ 0xC685] = 0xFFFF39E8 ^ 0xC685;
        b_0.x[0x9455 ^ 0x94D4] = 0xFFFF6B11 ^ 0x94D4;
        b_0.x[0x1BB9 ^ 0x1AA1] = 0xFFFFE57D ^ 0x1AA1;
        b_0.x[0x7122 ^ 0x716D] = 0xFFFF8E93 ^ 0x716D;
        b_0.x[0x8B3C ^ 0x8BF2] = 0xFFFF741E ^ 0x8BF2;
        b_0.x[0x4345 ^ 0x4368] = 0xFFFFBC96 ^ 0x4368;
        b_0.x[0x8F15 ^ 0x8E32] = 0xFFFF71C9 ^ 0x8E32;
        b_0.x[0xB776 ^ 0xB762] = 0xB73E ^ 0xB762;
        b_0.x[0x5C4D ^ 0x5D2F] = 0x5D1D ^ 0x5D2F;
        b_0.x[0x3138 ^ 0x31BE] = 0xFFFFCE0D ^ 0x31BE;
        b_0.x[0x76EC ^ 0x76C2] = 0x76B6 ^ 0x76C2;
        b_0.x[0xD4C8 ^ 0xD42F] = 0xD466 ^ 0xD42F;
        b_0.x[0xB15F ^ 0xB054] = 0xB0F0 ^ 0xB054;
        b_0.x[0xB3FC ^ 0xB2BA] = 0xFFFF4D5A ^ 0xB2BA;
        b_0.x[0x3661 ^ 0x3687] = 0xFFFFC96C ^ 0x3687;
        b_0.x[0x5065 ^ 0x5092] = 0xFFFFAF54 ^ 0x5092;
        b_0.x[0x2AD5 ^ 0x2A51] = 0xFFFFD5A1 ^ 0x2A51;
        b_0.x[0x31E9 ^ 0x306B] = 0xFFFFCFD9 ^ 0x306B;
        b_0.x[0x7512 ^ 0x7428] = 0x7476 ^ 0x7428;
        b_0.x[0x3F44 ^ 0x3FE9] = 0x3FC5 ^ 0x3FE9;
        b_0.x[0x4128 ^ 0x41E1] = 0x4144 ^ 0x41E1;
        b_0.x[0x459C ^ 0x450E] = 0xFFFFBAB4 ^ 0x450E;
        b_0.x[0xD846 ^ 0xD965] = 0xFFFF26F3 ^ 0xD965;
        b_0.x[0xD0D1 ^ 0xD033] = 0xD064 ^ 0xD033;
        b_0.x[0xF5BF ^ 0xF5AD] = 0xF56E ^ 0xF5AD;
        b_0.x[0x859F ^ 0x84FB] = 0x8497 ^ 0x84FB;
        b_0.x[0x444A ^ 0x4423] = 0xFFFFBBD5 ^ 0x4423;
        b_0.x[0xE1F ^ 0xE2A] = 0xE33 ^ 0xE2A;
        b_0.x[0x7FA8 ^ 0x7EEF] = 0xFFFF813A ^ 0x7EEF;
        b_0.x[0x9FC9 ^ 0x9ED9] = 0xFFFF6110 ^ 0x9ED9;
        b_0.x[0x344B ^ 0x353C] = 0x351E ^ 0x353C;
        b_0.x[0x14B8 ^ 0x1474] = 0x1432 ^ 0x1474;
        b_0.x[0x66AC ^ 0x6614] = 0xFFFF99D9 ^ 0x6614;
        b_0.x[0x7E77 ^ 0x7F04] = 0xFFFF80E0 ^ 0x7F04;
        b_0.x[0xCB0A ^ 0xCBFA] = 0xCBA8 ^ 0xCBFA;
        b_0.x[0xDF ^ 0x9D] = 0x7FFFFF59 ^ 0x9D;
        b_0.x[0x10516 ^ 0x10463] = 0x10433 ^ 0x10463;
        b_0.x[0x8FC0 ^ 0x8F35] = 0x8F6B ^ 0x8F35;
        b_0.x[0x8F7 ^ 0x87F] = 0x845 ^ 0x87F;
        b_0.x[0x9FE8 ^ 0x9ED6] = 0x9ED4 ^ 0x9ED6;
        b_0.x[0xEB3D ^ 0xEA6A] = 0xEA5F ^ 0xEA6A;
        b_0.x[0x142E ^ 0x156A] = 0xFFFFEAB0 ^ 0x156A;
        b_0.x[0xF89F ^ 0xF9F5] = 0xF99C ^ 0xF9F5;
        b_0.x[0x51E9 ^ 0x51EB] = 0xFFFFAE1B ^ 0x51EB;
        b_0.x[0x1360 ^ 0x127B] = 0xFFFFEDCF ^ 0x127B;
        b_0.x[0xE931 ^ 0xE81C] = 0xFFFF1784 ^ 0xE81C;
        b_0.x[0x10FAF ^ 0x10E23] = 0x10E72 ^ 0x10E23;
        b_0.x[0xAA27 ^ 0xAA00] = 0xAA50 ^ 0xAA00;
        b_0.x[0x5B1F ^ 0x5A42] = 0x5A32 ^ 0x5A42;
        b_0.x[0x573B ^ 0x5791] = 0xFFFFA864 ^ 0x5791;
        b_0.x[0x438A ^ 0x4203] = 0x422C ^ 0x4203;
        b_0.x[0x7FDE ^ 0x7FE7] = 0xFFFF8037 ^ 0x7FE7;
        b_0.x[0x10833 ^ 0x108C1] = 0xFFFEF760 ^ 0x108C1;
        b_0.x[0xF5A ^ 0xF5B] = 0xF7E ^ 0xF5B;
        b_0.x[0x5289 ^ 0x5213] = 0xFFFFADCF ^ 0x5213;
        b_0.x[0xFA88 ^ 0xFBDD] = 0xFBAB ^ 0xFBDD;
        b_0.x[0xC39 ^ 0xC3D] = 0xFFFFF390 ^ 0xC3D;
        b_0.x[0x44DD ^ 0x4591] = 0x4596 ^ 0x4591;
        b_0.x[0x282E ^ 0x28AB] = 0xFFFFD715 ^ 0x28AB;
        b_0.x[0x501 ^ 0x42A] = 0x457 ^ 0x42A;
        b_0.x[0x211B ^ 0x2197] = 0xFFFFDE69 ^ 0x2197;
        b_0.x[0xFC08 ^ 0xFC79] = 0xFFFF03A2 ^ 0xFC79;
        b_0.x[0xF601 ^ 0xF68B] = 0xF69B ^ 0xF68B;
        b_0.x[0x67E5 ^ 0x66F9] = 0x66E7 ^ 0x66F9;
        b_0.x[0x432A ^ 0x4398] = 0xFFFFBC14 ^ 0x4398;
        b_0.x[0xD7CC ^ 0xD7EA] = 0xFFFF2853 ^ 0xD7EA;
        b_0.x[0x5FA9 ^ 0x5E28] = 0x5E3E ^ 0x5E28;
        b_0.x[0xCAFE ^ 0xCA68] = 0xFFFF35F0 ^ 0xCA68;
        b_0.x[0x3E31 ^ 0x3E6F] = 0xFFFFC19A ^ 0x3E6F;
        b_0.x[0x342 ^ 0x39B] = 0xFFFFFC31 ^ 0x39B;
        b_0.x[0x3518 ^ 0x3575] = 0x3515 ^ 0x3575;
        b_0.x[0x63BE ^ 0x639A] = 0x63BC ^ 0x639A;
        b_0.x[0xC934 ^ 0xC9B9] = 0xFFFF363D ^ 0xC9B9;
        b_0.x[0x6FE ^ 0x67C] = 0x65A ^ 0x67C;
    }
}

