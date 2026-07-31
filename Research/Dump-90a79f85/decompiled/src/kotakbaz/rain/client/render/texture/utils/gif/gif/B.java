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
import kotakbaz.rain.client.render.texture.utils.gif.gif.b_0;

public class B
extends ImageReader {
    ImageInputStream a = null;
    boolean A;
    b_0 b;
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

    public B(ImageReaderSpi imageReaderSpi) {
        super(imageReaderSpi);
        int n = x[0];
        n -= x[1];
        this.A = n += x[2];
        this.b = null;
        int n2 = x[3];
        n2 -= x[4];
        this.B = n2 -= x[5];
        this.c = null;
        this.C = new ArrayList<Long>();
        int n3 = x[6];
        n3 ^= x[7];
        this.D = n3 -= x[8];
        int n4 = x[9];
        n4 += x[10];
        this.e = new byte[n4 += x[11]];
        int n5 = x[12];
        n5 ^= x[13];
        this.E = n5 ^= x[14];
        int n6 = x[15];
        n6 -= x[16];
        this.f = n6 -= x[17];
        int n7 = x[18];
        n7 -= x[19];
        this.F = n7 -= x[20];
        int n8 = x[21];
        n8 ^= x[22];
        this.H = n8 ^= x[23];
        int n9 = x[24];
        n9 += x[25];
        this.i = n9 += x[26];
        this.I = null;
        this.j = null;
        int n10 = x[27];
        n10 -= x[28];
        this.J = n10 -= x[29];
        int n11 = x[30];
        n11 += x[31];
        this.k = n11 ^= x[32];
        int n12 = x[33];
        n12 ^= x[34];
        this.K = n12 += x[35];
        int n13 = x[36];
        n13 ^= x[37];
        this.l = n13 ^= x[38];
        int n14 = x[39];
        n14 ^= x[40];
        this.L = n14 -= x[41];
        int n15 = x[42];
        n15 ^= x[43];
        this.m = n15 += x[44];
        this.M = null;
        int n16 = x[45];
        n16 ^= x[46];
        this.S = n16 += x[47];
        int n17 = x[48];
        n17 -= x[49];
        this.t = n17 += x[50];
    }

    @Override
    public void setInput(Object object, boolean bl, boolean bl2) {
        super.setInput(object, bl, bl2);
        if (object != null) {
            if (!(object instanceof ImageInputStream)) {
                int n = x[51];
                n ^= x[52];
                int n2 = x[54];
                n2 += x[55];
                throw new IllegalArgumentException((String)U[n ^= x[53]] + (String)U[n2 ^= x[56]]);
            }
            this.a = (ImageInputStream)object;
        } else {
            this.a = null;
        }
        this.resetStreamSettings();
    }

    @Override
    public int getNumImages(boolean bl) {
        if (this.a == null) {
            int n = x[57];
            n += x[58];
            throw new IllegalStateException((String)U[n += x[59]]);
        }
        if (this.seekForwardOnly && bl) {
            int n = x[60];
            n += x[61];
            int n2 = x[63];
            n2 -= x[64];
            throw new IllegalStateException((String)U[n ^= x[62]] + (String)U[n2 ^= x[65]]);
        }
        if (this.D > 0) {
            return this.D;
        }
        if (bl) {
            int n = x[66];
            n += x[67];
            int n3 = x[69];
            n3 -= x[70];
            this.D = this.locateImage(n += x[68]) + (n3 -= x[71]);
        }
        return this.D;
    }

    private void checkIndex(int n) {
        if (n < this.minIndex) {
            int n2 = x[72];
            n2 ^= x[73];
            int n3 = x[75];
            n3 ^= x[76];
            throw new IndexOutOfBoundsException((String)U[n2 -= x[74]] + (String)U[n3 += x[77]]);
        }
        if (this.seekForwardOnly) {
            this.minIndex = n;
        }
    }

    @Override
    public int getWidth(int n) {
        long l = 8634205238878413179L;
        this.checkIndex(n);
        int n2 = x[78];
        n2 ^= x[79];
        long l2 = l;
        int n3 = x[81];
        n3 -= x[82];
        l = l2 ^ ((long)this.locateImage(n) << (n2 -= x[80]) ^ l2) & -1L << (n3 ^= x[83]);
        int n4 = x[84];
        n4 ^= x[85];
        if ((int)(l >>> (n4 -= x[86])) != n) {
            throw new IndexOutOfBoundsException();
        }
        this.readMetadata();
        return this.c.c;
    }

    @Override
    public int getHeight(int n) {
        long l = 390362063264773640L;
        this.checkIndex(n);
        int n2 = x[87];
        n2 -= x[88];
        long l2 = l;
        int n3 = x[90];
        n3 += x[91];
        l = l2 ^ ((long)this.locateImage(n) << (n2 -= x[89]) ^ l2) & -1L << (n3 ^= x[92]);
        int n4 = x[93];
        n4 -= x[94];
        if ((int)(l >>> (n4 -= x[95])) != n) {
            throw new IndexOutOfBoundsException();
        }
        this.readMetadata();
        return this.c.C;
    }

    private ImageTypeSpecifier createIndexed(byte[] byArray, byte[] byArray2, byte[] byArray3, int n) {
        SampleModel sampleModel;
        IndexColorModel indexColorModel;
        long l = -1486769869131912859L;
        if (this.c.F) {
            int n2 = x[96];
            n2 += x[97];
            n2 -= x[98];
            int n3 = x[99];
            n3 -= x[100];
            long l2 = l;
            int n4 = x[102];
            n4 -= x[103];
            l = l2 ^ ((long)Math.min(this.c.G, byArray.length - n2) << (n3 ^= x[101]) ^ l2) & -1L << (n4 -= x[104]);
            int n5 = x[105];
            n5 += x[106];
            indexColorModel = new IndexColorModel(n, byArray.length, byArray, byArray2, byArray3, (int)(l >>> (n5 -= x[107])));
        } else {
            indexColorModel = new IndexColorModel(n, byArray.length, byArray, byArray2, byArray3);
        }
        int n6 = x[108];
        n6 ^= x[109];
        if (n == (n6 -= x[110])) {
            int n7 = x[111];
            n7 -= x[112];
            int[] nArray = new int[n7 += x[113]];
            int n8 = x[114];
            n8 += x[115];
            int n9 = x[117];
            n9 ^= x[118];
            nArray[n8 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[116]] = n9 += x[119];
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
            sampleModel = new MultiPixelPackedSampleModel(n15 ^= x[137], n16 -= x[140], n17 += x[143], n);
        }
        return new ImageTypeSpecifier(indexColorModel, sampleModel);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Iterator<ImageTypeSpecifier> getImageTypes(int var1_1) {
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
                    this.checkIndex(var1_1);
                    var46_18 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[144];
                    var46_18 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[145];
                    v0 = var13_8;
                    var48_19 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[147];
                    var48_19 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[148];
                    var13_8 = v0 ^ ((long)this.locateImage(var1_1) << (var46_18 -= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[146]) ^ v0) & -1L << (var48_19 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[149]);
                    var50_20 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[150];
                    var50_20 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[151];
                    if ((int)(var13_8 >>> (var50_20 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[152])) != var1_1) {
                        throw new IndexOutOfBoundsException();
                    }
                    this.readMetadata();
                    var52_21 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[153];
                    var52_21 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[154];
                    var3_22 = new ArrayList<ImageTypeSpecifier>(var52_21 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[155]);
                    if (this.c.e != null) {
                        var4_23 = this.c.e;
                        this.M = this.c.e;
                    } else {
                        var4_23 = this.b.f;
                    }
                    if (var4_23 == null) {
                        if (this.M == null) {
                            var54_24 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[156];
                            var54_24 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[157];
                            var56_25 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[159];
                            var56_25 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[160];
                            this.processWarningOccurred((String)kotakbaz.rain.client.render.texture.utils.gif.gif.B.U[var54_24 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[158]] + (String)kotakbaz.rain.client.render.texture.utils.gif.gif.B.U[var56_25 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[161]]);
                            this.M = kotakbaz.rain.client.render.texture.utils.gif.gif.B.getDefaultPalette();
                        }
                        var4_23 = this.M;
                    }
                    var58_26 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[162];
                    var58_26 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[163];
                    v1 = var31_17;
                    var60_27 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[165];
                    var60_27 -= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[166];
                    var31_17 = v1 ^ ((long)(var4_23.length / (var58_26 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[164])) ^ v1) & -1L >>> (var60_27 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[167]);
                    var62_28 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[168];
                    var62_28 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[169];
                    if ((int)var31_17 != (var62_28 -= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[170])) break block8;
                    v2 = var23_13;
                    var64_29 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[171];
                    var64_29 -= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[172];
                    var23_13 = v2 ^ (0x100000000L ^ v2) & -1L << (var64_29 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[173]);
                    break block9;
                }
                var66_30 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[174];
                var66_30 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[175];
                if ((int)var31_17 != (var66_30 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[176])) break block10;
                v3 = var23_13;
                var68_31 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[177];
                var68_31 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[178];
                var23_13 = v3 ^ (0x200000000L ^ v3) & -1L << (var68_31 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[179]);
                break block9;
            }
            var70_32 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[180];
            var70_32 -= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[181];
            if ((int)var31_17 == (var70_32 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[182])) ** GOTO lbl-1000
            var72_33 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[183];
            var72_33 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[184];
            if ((int)var31_17 == (var72_33 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[185])) lbl-1000:
            // 2 sources

            {
                v4 = var23_13;
                var74_34 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[186];
                var74_34 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[187];
                var23_13 = v4 ^ (0x400000000L ^ v4) & -1L << (var74_34 -= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[188]);
            } else {
                v5 = var23_13;
                var76_35 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[189];
                var76_35 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[190];
                var23_13 = v5 ^ (0x800000000L ^ v5) & -1L << (var76_35 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[191]);
            }
        }
        var78_36 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[192];
        var78_36 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[193];
        var78_36 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[194];
        var80_37 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[195];
        var80_37 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[196];
        var80_37 -= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[197];
        var82_38 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[198];
        var82_38 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[199];
        v6 = var27_15;
        var84_39 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[201];
        var84_39 -= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[202];
        var27_15 = v6 ^ ((long)(var78_36 << (int)(var23_13 >>> var80_37)) << (var82_38 -= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[200]) ^ v6) & -1L << (var84_39 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[203]);
        var86_40 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[204];
        var86_40 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[205];
        var8_41 = new byte[(int)(var27_15 >>> (var86_40 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[206]))];
        var88_42 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[207];
        var88_42 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[208];
        var9_43 = new byte[(int)(var27_15 >>> (var88_42 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[209]))];
        var90_44 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[210];
        var90_44 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[211];
        var10_45 = new byte[(int)(var27_15 >>> (var90_44 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[212]))];
        v7 = var29_16;
        var92_46 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[213];
        var92_46 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[214];
        var29_16 = v7 ^ (0L ^ v7) & -1L << (var92_46 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[215]);
        v8 = var31_17;
        var94_47 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[216];
        var94_47 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[217];
        var31_17 = v8 ^ (0L ^ v8) & -1L << (var94_47 -= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[218]);
        while (true) {
            var96_48 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[219];
            var96_48 -= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[220];
            if ((int)(var31_17 >>> (var96_48 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[221])) >= (int)var31_17) break;
            var98_49 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[222];
            var98_49 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[223];
            var100_50 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[225];
            var100_50 -= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[226];
            v9 = (int)(var29_16 >>> (var100_50 -= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[227]));
            var29_16 += 0x100000000L;
            var8_41[(int)(var31_17 >>> (var98_49 -= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[224]))] = var4_23[v9];
            var102_51 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[228];
            var102_51 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[229];
            var104_52 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[231];
            var104_52 -= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[232];
            v10 = (int)(var29_16 >>> (var104_52 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[233]));
            var29_16 += 0x100000000L;
            var9_43[(int)(var31_17 >>> (var102_51 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[230]))] = var4_23[v10];
            var106_53 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[234];
            var106_53 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[235];
            var108_54 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[237];
            var108_54 -= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[238];
            v11 = (int)(var29_16 >>> (var108_54 += kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[239]));
            var29_16 += 0x100000000L;
            var10_45[(int)(var31_17 >>> (var106_53 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[236]))] = var4_23[v11];
            var31_17 += 0x100000000L;
        }
        var110_55 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[240];
        var110_55 ^= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[241];
        var3_22.add(this.createIndexed(var8_41, var9_43, var10_45, (int)(var23_13 >>> (var110_55 -= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[242]))));
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
    public IIOMetadata getImageMetadata(int n) {
        long l = -6588270249310483267L;
        this.checkIndex(n);
        int n2 = x[243];
        n2 ^= x[244];
        long l2 = l;
        int n3 = x[246];
        n3 += x[247];
        l = l2 ^ ((long)this.locateImage(n) << (n2 -= x[245]) ^ l2) & -1L << (n3 -= x[248]);
        int n4 = x[249];
        n4 -= x[250];
        if ((int)(l >>> (n4 += x[251])) != n) {
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
        int n = x[258];
        n ^= x[259];
        int n2 = x[261];
        n2 ^= x[262];
        this.H = this.e[n ^= x[260]] & (n2 -= x[263]);
        int n3 = x[264];
        n3 ^= x[265];
        int n4 = x[267];
        n4 ^= x[268];
        int n5 = x[270];
        n5 -= x[271];
        this.H |= (this.e[n3 -= x[266]] & (n4 += x[269])) << (n5 -= x[272]);
        int n6 = x[273];
        n6 ^= x[274];
        int n7 = x[276];
        n7 ^= x[277];
        int n8 = x[279];
        n8 += x[280];
        this.H |= (this.e[n6 ^= x[275]] & (n7 -= x[278])) << (n8 ^= x[281]);
        int n9 = x[282];
        n9 -= x[283];
        int n10 = x[285];
        n10 ^= x[286];
        this.H |= this.e[n9 += x[284]] << (n10 -= x[287]);
        int n11 = x[288];
        n11 -= x[289];
        this.F = n11 ^= x[290];
    }

    private int getCode(int n, int n2) {
        long l = -2641987281996411069L;
        long l2 = -6990133213960372311L;
        long l3 = -2927708733455613078L;
        long l4 = 6379955650769522081L;
        long l5 = -2676185642713248711L;
        long l6 = 4302342294749963961L;
        long l7 = -7262359410056865666L;
        long l8 = 864652798035261781L;
        int n3 = x[291];
        n3 += x[292];
        if (this.f + n > (n3 += x[293])) {
            return this.h;
        }
        int n4 = x[294];
        n4 += x[295];
        long l9 = l4;
        int n5 = x[297];
        n5 += x[298];
        l4 = l9 ^ ((long)(this.H >> this.f & n2) << (n4 ^= x[296]) ^ l9) & -1L << (n5 ^= x[299]);
        this.f += n;
        while (true) {
            int n6 = x[300];
            n6 -= x[301];
            if (this.f < (n6 += x[302]) || this.i) break;
            int n7 = x[303];
            n7 ^= x[304];
            this.H >>>= (n7 ^= x[305]);
            int n8 = x[306];
            n8 ^= x[307];
            this.f -= (n8 += x[308]);
            if (this.F >= this.E) {
                this.E = this.a.readUnsignedByte();
                if (this.E == 0) {
                    int n9 = x[309];
                    n9 += x[310];
                    this.i = n9 -= x[311];
                    int n10 = x[312];
                    n10 ^= x[313];
                    return (int)(l4 >>> (n10 -= x[314]));
                }
                int n11 = x[315];
                n11 ^= x[316];
                long l10 = l7;
                int n12 = x[318];
                n12 -= x[319];
                l7 = l10 ^ ((long)this.E << (n11 -= x[317]) ^ l10) & -1L << (n12 ^= x[320]);
                long l11 = l8;
                int n13 = x[321];
                n13 -= x[322];
                l8 = l11 ^ (0L ^ l11) & -1L >>> (n13 += x[323]);
                while (true) {
                    int n14 = x[324];
                    n14 += x[325];
                    if ((int)(l7 >>> (n14 ^= x[326])) <= 0) break;
                    int n15 = x[327];
                    n15 += x[328];
                    n15 += x[329];
                    int n16 = x[330];
                    n16 -= x[331];
                    long l12 = l8;
                    int n17 = x[333];
                    n17 -= x[334];
                    l8 = l12 ^ ((long)this.a.read(this.e, (int)l8, (int)(l7 >>> n15)) << (n16 -= x[332]) ^ l12) & -1L << (n17 ^= x[335]);
                    int n18 = x[336];
                    n18 += x[337];
                    int n19 = x[339];
                    n19 += x[340];
                    if ((int)(l8 >>> (n18 -= x[338])) == (n19 += x[341])) {
                        int n20 = x[342];
                        n20 += x[343];
                        int n21 = x[345];
                        n21 += x[346];
                        int n22 = x[348];
                        n22 -= x[349];
                        throw new IIOException((String)U[n20 += x[344]] + (String)U[n21 ^= x[347]] + (String)U[n22 += x[350]]);
                    }
                    int n23 = x[351];
                    n23 += x[352];
                    long l13 = l8;
                    int n24 = x[354];
                    n24 += x[355];
                    l8 = l13 ^ ((long)((int)l8 + (int)(l8 >>> (n23 -= x[353]))) ^ l13) & -1L >>> (n24 -= x[356]);
                    int n25 = x[357];
                    n25 -= x[358];
                    n25 ^= x[359];
                    int n26 = x[360];
                    n26 ^= x[361];
                    n26 -= x[362];
                    int n27 = x[363];
                    n27 ^= x[364];
                    long l14 = l7;
                    int n28 = x[366];
                    n28 ^= x[367];
                    l7 = l14 ^ ((long)((int)(l7 >>> n25) - (int)(l8 >>> n26)) << (n27 += x[365]) ^ l14) & -1L << (n28 ^= x[368]);
                }
                int n29 = x[369];
                n29 += x[370];
                this.F = n29 += x[371];
            }
            int n30 = this.F;
            int n31 = x[372];
            n31 += x[373];
            this.F = n30 + (n31 -= x[374]);
            int n32 = x[375];
            n32 -= x[376];
            this.H |= this.e[n30] << (n32 += x[377]);
        }
        int n33 = x[378];
        n33 -= x[379];
        return (int)(l4 >>> (n33 -= x[380]));
    }

    public void initializeStringTable(int[] nArray, byte[] byArray, byte[] byArray2, int[] nArray2) {
        long l = -7362961470910442793L;
        long l2 = 1591697485586136572L;
        long l3 = 5052472478106944429L;
        long l4 = 4667543888036654193L;
        long l5 = -5718964173729456542L;
        long l6 = 838996314876718596L;
        long l7 = -7585873661231370810L;
        long l8 = -1291936465913437915L;
        long l9 = -5158452263455714354L;
        int n = x[381];
        n ^= x[382];
        long l10 = l6;
        int n2 = x[384];
        n2 -= x[385];
        l6 = l10 ^ ((long)((n ^= x[383]) << this.g) ^ l10) & -1L >>> (n2 ^= x[386]);
        long l11 = l9;
        int n3 = x[387];
        n3 += x[388];
        l9 = l11 ^ (0L ^ l11) & -1L << (n3 -= x[389]);
        while (true) {
            int n4 = x[390];
            n4 += x[391];
            if ((int)(l9 >>> (n4 += x[392])) >= (int)l6) break;
            int n5 = x[393];
            n5 += x[394];
            int n6 = x[396];
            n6 ^= x[397];
            nArray[(int)(l9 >>> (n5 -= kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[395]))] = n6 += x[398];
            int n7 = x[399];
            n7 -= 54;
            int n8 = -55;
            n8 -= 23;
            byArray[(int)(l9 >>> (n7 += -11))] = (byte)(l9 >>> (n8 += 110));
            int n9 = -71;
            n9 += 114;
            int n10 = 57;
            n10 ^= 0xFFFFFFCD;
            byArray2[(int)(l9 >>> (n9 += -11))] = (byte)(l9 >>> (n10 += 44));
            int n11 = -126;
            n11 ^= 0x52;
            int n12 = -53;
            n12 += 97;
            nArray2[(int)(l9 >>> (n11 -= -80))] = n12 += -43;
            l9 += 0x100000000L;
        }
        int n13 = 51;
        n13 += 88;
        long l12 = l9;
        int n14 = 30;
        n14 -= 59;
        l9 = l12 ^ ((long)((int)l6) << (n13 += -107) ^ l12) & -1L << (n14 ^= 0xFFFFFFC3);
        while (true) {
            int n15 = 86;
            n15 -= -41;
            int n16 = 4039;
            n16 += 10;
            if ((int)(l9 >>> (n15 ^= 0x5F)) >= (n16 += 47)) break;
            int n17 = 8;
            n17 -= 97;
            int n18 = 139;
            n18 += -69;
            nArray[(int)(l9 >>> (n17 -= -121))] = n18 ^= 0xFFFFFFB9;
            int n19 = -6;
            n19 ^= 0xFFFFFF85;
            int n20 = -149;
            n20 += 119;
            nArray2[(int)(l9 >>> (n19 ^= 0x5F))] = n20 += 31;
            l9 += 0x100000000L;
        }
    }

    private void outputRow() {
        long l = -1974572127544229319L;
        long l2 = -4942602838564171641L;
        long l3 = -9081569698828481104L;
        long l4 = 1786193016436245575L;
        long l5 = -1833234917219111081L;
        long l6 = 4167480032570990886L;
        long l7 = 5959844654032507626L;
        int n = -20;
        n ^= 0xFFFFFFBB;
        long l8 = l5;
        int n2 = 65;
        n2 -= -12;
        l5 = l8 ^ ((long)Math.min(this.o.width, this.r.width * this.O) << (n ^= 0x77) ^ l8) & -1L << (n2 ^= 0x6D);
        long l9 = l7;
        int n3 = 198;
        n3 ^= 0x5B;
        l7 = l9 ^ ((long)this.r.x ^ l9) & -1L >>> (n3 += -125);
        int n4 = 4;
        n4 -= -21;
        if (this.O == (n4 -= 24)) {
            int n5 = -102;
            n5 += 123;
            int n6 = -38;
            n6 += -72;
            this.j.setDataElements((int)l7, this.t, (int)(l5 >>> (n5 += 11)), n6 -= -111, this.T);
        } else {
            long l10 = l7;
            int n7 = -118;
            n7 += 103;
            l7 = l10 ^ (0L ^ l10) & -1L << (n7 += 47);
            while (true) {
                int n8 = 43;
                n8 += -3;
                int n9 = 131;
                n9 -= 64;
                if ((int)(l7 >>> (n8 -= 8)) >= (int)(l5 >>> (n9 += -35))) break;
                int n10 = 114;
                n10 ^= 0x28;
                int n11 = -65;
                n11 -= 3;
                int n12 = 141;
                n12 += 7;
                this.j.setSample((int)l7, this.t, n10 -= 90, this.T[(int)(l7 >>> (n11 -= -100))] & (n12 += 107));
                int n13 = -70;
                n13 ^= 0x43;
                n13 ^= 0xFFFFFFD9;
                int n14 = -158;
                n14 += 64;
                long l11 = l7;
                int n15 = 139;
                n15 -= 12;
                long l12 = l7 = l11 ^ ((long)((int)(l7 >>> n13) + this.O) << (n14 ^= 0xFFFFFF82) ^ l11) & -1L << (n15 -= 95);
                int n16 = -61;
                n16 ^= 7;
                int n17 = -35;
                n17 -= 3;
                l7 = l12 ^ (l12 ^ l12 + (long)(n16 ^= 0xFFFFFFC5)) & -1L >>> (n17 ^= 0xFFFFFFFA);
            }
        }
        if (this.updateListeners != null) {
            int n18 = -121;
            n18 ^= 0x50;
            int[] nArray = new int[n18 ^= 0xFFFFFFD6];
            int n19 = -74;
            n19 -= -33;
            int n20 = 107;
            n20 ^= 0x66;
            nArray[n19 -= -41] = n20 ^= 0xD;
            int[] nArray2 = nArray;
            int n21 = -102;
            n21 -= -91;
            int n22 = 21;
            n22 -= 65;
            int n23 = 52;
            n23 -= -9;
            this.processImageUpdate(this.I, (int)l7, this.t, (int)(l5 >>> (n21 += 43)), n22 -= -45, n23 -= 60, this.s, nArray2);
        }
    }

    private void computeDecodeThisRow() {
        int n;
        if (this.t < this.r.y + this.r.height && this.l >= this.o.y && this.l < this.o.y + this.o.height && (this.l - this.o.y) % this.p == 0) {
            int n2 = 39;
            n2 += -101;
            n = n2 += 63;
        } else {
            int n3 = -12;
            n3 += 58;
            n = n3 += -46;
        }
        this.S = n;
    }

    private void outputPixels(byte[] byArray, int n) {
        long l = -8887832579427270740L;
        long l2 = 66886116371376621L;
        if (this.m < this.P || this.m > this.q) {
            return;
        }
        long l3 = l2;
        int n2 = -123;
        n2 += 84;
        l2 = l3 ^ (0L ^ l3) & -1L << (n2 += 71);
        while (true) {
            int n3 = -30;
            n3 -= -39;
            if ((int)(l2 >>> (n3 ^= 0x29)) >= n) break;
            if (this.K >= this.o.x) {
                int n4 = -65;
                n4 ^= 0xFFFFFFAA;
                this.T[this.K - this.o.x] = byArray[(int)(l2 >>> (n4 -= -11))];
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
                    this.l += kotakbaz.rain.client.render.texture.utils.gif.gif.B.n[this.m];
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
            l2 += 0x100000000L;
        }
    }

    private void readHeader() {
        long l = 8543969854602136267L;
        long l2 = -2718412033190856005L;
        long l3 = 6421103972926453519L;
        long l4 = -3192124332430242594L;
        long l5 = -5539343440638379757L;
        if (this.A) {
            return;
        }
        if (this.a == null) {
            int n = 112;
            n ^= 0xFFFFFFDB;
            throw new IllegalStateException((String)U[n -= -103]);
        }
        this.b = new b_0();
        try {
            int n;
            int n2;
            this.a.setByteOrder(ByteOrder.LITTLE_ENDIAN);
            int n3 = -119;
            n3 -= -26;
            byte[] byArray = new byte[n3 ^= 0xFFFFFFA5];
            this.a.readFully(byArray);
            int n4 = 26;
            n4 -= -3;
            StringBuilder stringBuilder = new StringBuilder(n4 -= 26);
            int n5 = 45;
            n5 -= 98;
            stringBuilder.append((char)byArray[n5 += 56]);
            int n6 = 42;
            n6 += -9;
            stringBuilder.append((char)byArray[n6 -= 29]);
            int n7 = 122;
            n7 -= -10;
            stringBuilder.append((char)byArray[n7 += -127]);
            this.b.b = stringBuilder.toString();
            this.b.B = this.a.readUnsignedShort();
            this.b.c = this.a.readUnsignedShort();
            int n8 = 35;
            n8 += 83;
            long l6 = l3;
            int n9 = -66;
            n9 += 24;
            l3 = l6 ^ ((long)this.a.readUnsignedByte() << (n8 += -86) ^ l6) & -1L << (n9 += 74);
            int n10 = -1;
            n10 -= 64;
            int n11 = -249;
            n11 ^= 0xFFFFFFBD;
            if (((int)(l3 >>> (n10 -= -97)) & (n11 += -58)) != 0) {
                int n12 = 54;
                n12 -= 82;
                n2 = n12 += 29;
            } else {
                int n13 = -91;
                n13 += 17;
                n2 = n13 -= -74;
            }
            long l7 = l4;
            int n14 = 99;
            n14 -= -17;
            l4 = l7 ^ ((long)n2 ^ l7) & -1L >>> (n14 -= 84);
            int n15 = -16;
            n15 -= -25;
            n15 ^= 0x29;
            int n16 = 44;
            n16 += 3;
            int n17 = -37;
            n17 ^= 0;
            int n18 = 20;
            n18 += -50;
            this.b.C = ((int)(l3 >>> n15) >> (n16 -= 43) & (n17 -= -44)) + (n18 ^= 0xFFFFFFE3);
            int n19 = -99;
            n19 += 113;
            int n20 = -93;
            n20 ^= 9;
            if (((int)(l3 >>> (n19 ^= 0x2E)) & (n20 -= -94)) != 0) {
                int n21 = 164;
                n21 -= 121;
                n = n21 -= 42;
            } else {
                int n22 = 122;
                n22 += -27;
                n = n22 -= 95;
            }
            this.b.e = n;
            int n23 = 45;
            n23 -= 72;
            n23 += 28;
            int n24 = 45;
            n24 -= 23;
            n24 += 10;
            int n25 = -22;
            n25 += 21;
            n25 += 8;
            int n26 = -34;
            n26 += -37;
            n26 -= -72;
            int n27 = 41;
            n27 ^= 6;
            long l8 = l5;
            int n28 = 169;
            n28 -= 82;
            l5 = l8 ^ ((long)(n23 << ((int)(l3 >>> n24) & n25) + n26) << (n27 += -15) ^ l8) & -1L << (n28 += -55);
            this.b.D = this.a.readUnsignedByte();
            this.b.d = this.a.readUnsignedByte();
            if ((int)l4 != 0) {
                int n29 = -126;
                n29 += 114;
                int n30 = 181;
                n30 -= 41;
                this.b.f = new byte[(n29 -= -15) * (int)(l5 >>> (n30 -= 108))];
                this.a.readFully(this.b.f);
            } else {
                this.b.f = null;
            }
            this.C.add(this.a.getStreamPosition());
        }
        catch (IOException iOException) {
            int n = -53;
            n -= -84;
            int n31 = 13;
            n31 += -33;
            throw new IIOException((String)U[n += -31] + (String)U[n31 ^= 0xFFFFFFE9], iOException);
        }
        int n = 177;
        n += -115;
        this.A = n -= 61;
    }

    private boolean skipImage() {
        long l = 2666267853914277537L;
        long l2 = 7649825074554023734L;
        long l3 = -8968486914133913628L;
        long l4 = -780495511710076273L;
        long l5 = 8234136964776218158L;
        long l6 = -1653221167738535139L;
        long l7 = 594193170922425864L;
        long l8 = 3302957062642303811L;
        long l9 = 2630078810713894280L;
        long l10 = -558107696998386062L;
        long l11 = 7281024872352128043L;
        long l12 = 2619578645929588519L;
        try {
            while (true) {
                long l13 = l12;
                int n = 9;
                n ^= 0x42;
                l12 = l13 ^ ((long)this.a.readUnsignedByte() ^ l13) & -1L >>> (n -= 43);
                int n2 = 125;
                n2 += -50;
                if ((int)l12 == (n2 ^= 0x67)) {
                    int n3 = 121;
                    n3 += -5;
                    this.a.skipBytes(n3 -= 108);
                    int n4 = 24;
                    n4 += -55;
                    long l14 = l10;
                    int n5 = 111;
                    n5 ^= 0xFFFFFFDE;
                    l10 = l14 ^ ((long)this.a.readUnsignedByte() << (n4 -= -63) ^ l14) & -1L << (n5 ^= 0xFFFFFF91);
                    int n6 = 8;
                    n6 -= -82;
                    int n7 = -139;
                    n7 ^= 0xFFFFFFDF;
                    if (((int)(l10 >>> (n6 += -58)) & (n7 -= 42)) != 0) {
                        int n8 = -9;
                        n8 += 57;
                        n8 += -16;
                        int n9 = 57;
                        n9 -= -20;
                        n9 -= 70;
                        int n10 = -153;
                        n10 += 82;
                        n10 -= -72;
                        int n11 = -92;
                        n11 -= -13;
                        long l15 = l12;
                        int n12 = -73;
                        n12 -= -115;
                        l12 = l15 ^ ((long)(((int)(l10 >>> n8) & n9) + n10) << (n11 += 111) ^ l15) & -1L << (n12 += -10);
                        int n13 = 51;
                        n13 ^= 0xFFFFFF99;
                        int n14 = 114;
                        n14 += -99;
                        int n15 = -40;
                        n15 -= 17;
                        this.a.skipBytes((n13 -= -89) * ((n14 -= 14) << (int)(l12 >>> (n15 ^= 0xFFFFFFE7))));
                    }
                    int n16 = 87;
                    n16 -= -36;
                    this.a.skipBytes(n16 += -122);
                    long l16 = l12;
                    int n17 = 74;
                    n17 ^= 0xFFFFFFCF;
                    l12 = l16 ^ (0L ^ l16) & -1L << (n17 ^= 0xFFFFFFA5);
                    do {
                        int n18 = 47;
                        n18 -= 40;
                        long l17 = l12;
                        int n19 = 14;
                        n19 += 16;
                        l12 = l17 ^ ((long)this.a.readUnsignedByte() << (n18 += 25) ^ l17) & -1L << (n19 ^= 0x3E);
                        int n20 = -66;
                        n20 ^= 0xFFFFFFC7;
                        this.a.skipBytes((int)(l12 >>> (n20 -= 89)));
                        int n21 = -140;
                        n21 -= -99;
                    } while ((int)(l12 >>> (n21 += 73)) > 0);
                    int n8 = -86;
                    n8 = n8 ^ 0xFFFFFF8C;
                    boolean bl2 = n8 ^ 0x27;
                    return bl2;
                }
                int n22 = 65;
                n22 ^= 0xFFFFFF9A;
                if ((int)l12 == (n22 -= -96)) {
                    int n10 = 6;
                    n10 = n10 ^ 0x22;
                    boolean bl = n10 - 36;
                    return bl;
                }
                int n23 = 42;
                n23 -= 96;
                if ((int)l12 == (n23 -= -87)) {
                    int n24 = 39;
                    n24 -= 26;
                    long l18 = l10;
                    int n25 = 124;
                    n25 -= 16;
                    l10 = l18 ^ ((long)this.a.readUnsignedByte() << (n24 ^= 0x2D) ^ l18) & -1L << (n25 += -76);
                    long l19 = l12;
                    int n26 = 46;
                    n26 ^= 0xFFFFFF9B;
                    l12 = l19 ^ (0L ^ l19) & -1L << (n26 ^= 0xFFFFFF95);
                    do {
                        int n27 = -79;
                        n27 -= -121;
                        long l20 = l12;
                        int n28 = 81;
                        n28 ^= 0x4E;
                        l12 = l20 ^ ((long)this.a.readUnsignedByte() << (n27 ^= 0xA) ^ l20) & -1L << (n28 ^= 0x3F);
                        int n29 = 224;
                        n29 -= 99;
                        this.a.skipBytes((int)(l12 >>> (n29 -= 93)));
                        int n30 = 20;
                        n30 += 54;
                    } while ((int)(l12 >>> (n30 ^= 0x6A)) > 0);
                    continue;
                }
                if ((int)l12 == 0) {
                    int n12 = -57;
                    n12 = n12 - 0;
                    boolean bl = n12 ^ 0xFFFFFFC7;
                    return bl;
                }
                long l21 = l10;
                int n31 = 14;
                n31 ^= 0x51;
                l10 = l21 ^ (0L ^ l21) & -1L << (n31 += -63);
                do {
                    int n32 = 122;
                    n32 -= 97;
                    long l22 = l10;
                    int n33 = 94;
                    n33 -= 119;
                    l10 = l22 ^ ((long)this.a.readUnsignedByte() << (n32 -= -7) ^ l22) & -1L << (n33 ^= 0xFFFFFFC7);
                    int n34 = -151;
                    n34 += 71;
                    this.a.skipBytes((int)(l10 >>> (n34 -= -112)));
                    int n35 = 58;
                    n35 += 37;
                } while ((int)(l10 >>> (n35 -= 63)) > 0);
            }
        }
        catch (EOFException eOFException) {
            int n13 = 37;
            n13 = n13 + 33;
            boolean bl = n13 ^ 0x46;
            return bl;
        }
        catch (IOException iOException) {
            int n = -61;
            n -= -114;
            int n14 = -58;
            n14 ^= 0x33;
            throw new IIOException((String)U[n ^= 0x3C] + (String)U[n14 += 26], iOException);
        }
    }

    private int locateImage(int n) {
        long l = -4326589796981865496L;
        long l2 = 3560047528794626072L;
        long l3 = 305942329342766977L;
        this.readHeader();
        try {
            int n2 = -58;
            n2 ^= 0x54;
            n2 -= -111;
            int n3 = 48;
            n3 += 2;
            long l4 = l3;
            int n4 = -8;
            n4 ^= 0x19;
            l3 = l4 ^ ((long)Math.min(n, this.C.size() - n2) << (n3 ^= 0x12) ^ l4) & -1L << (n4 -= -63);
            int n5 = 53;
            n5 ^= 0x1A;
            Long l5 = this.C.get((int)(l3 >>> (n5 += -15)));
            this.a.seek(l5);
            while (true) {
                int n6 = 78;
                n6 ^= 0xFFFFFF9F;
                if ((int)(l3 >>> (n6 -= -79)) < n) {
                    if (!this.skipImage()) {
                        int n7 = 30;
                        n7 += -90;
                        return (int)((l3 += -4294967296L) >>> (n7 -= -92));
                    }
                    Long l6 = this.a.getStreamPosition();
                    this.C.add(l6);
                    l3 += 0x100000000L;
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
        if (this.B != n) {
            this.c = null;
        }
        this.B = n;
        return n;
    }

    private byte[] concatenateBlocks() {
        long l = 1972186362420831401L;
        long l2 = 444242525267067419L;
        long l3 = -2746920362522168155L;
        int n = 55;
        n += 24;
        byte[] byArray = new byte[n -= 79];
        while (true) {
            int n2 = -202;
            n2 ^= 0xFFFFFFB8;
            long l4 = l3;
            int n3 = -111;
            n3 ^= 0x75;
            l3 = l4 ^ ((long)this.a.readUnsignedByte() << (n2 -= 110) ^ l4) & -1L << (n3 -= -60);
            int n4 = 213;
            n4 += -66;
            if ((int)(l3 >>> (n4 += -115)) == 0) break;
            if (this.ignoreMetadata) {
                int n5 = 60;
                n5 += -13;
                this.a.skipBytes((int)(l3 >>> (n5 += -15)));
                continue;
            }
            int n6 = 17;
            n6 -= -7;
            byte[] byArray2 = kotakbaz.rain.client.render.texture.utils.gif.common.a.staggeredReadByteStream(this.a, (int)(l3 >>> (n6 ^= 0x38)));
            int n7 = 10;
            n7 += 113;
            byte[] byArray3 = new byte[byArray.length + (int)(l3 >>> (n7 -= 91))];
            int n8 = -39;
            n8 ^= 0x60;
            int n9 = -21;
            n9 -= 68;
            System.arraycopy(byArray, n8 ^= 0xFFFFFFB9, byArray3, n9 -= -89, byArray.length);
            int n10 = 61;
            n10 -= 124;
            int n11 = 99;
            n11 += 39;
            System.arraycopy(byArray2, n10 += 63, byArray3, byArray.length, (int)(l3 >>> (n11 -= 106)));
            byArray = byArray3;
        }
        return byArray;
    }

    private void readMetadata() {
        long l = 4773610623051502609L;
        long l2 = -1962884013776287959L;
        long l3 = -9087359376015734524L;
        long l4 = -4419055785685706525L;
        long l5 = 1005478648456327990L;
        long l6 = 2002766687675033980L;
        long l7 = -723644135527917544L;
        long l8 = -2826311928666643374L;
        long l9 = 7423499412868246049L;
        long l10 = -8510735690072121238L;
        long l11 = -3497250169747223584L;
        long l12 = 4272780393505156005L;
        long l13 = 7821975220695068756L;
        long l14 = 5648270446248744240L;
        long l15 = -1580973069219861381L;
        long l16 = 4966712941243247425L;
        long l17 = -6836996558654321112L;
        long l18 = 4470095257056698367L;
        long l19 = 6583006531927378969L;
        long l20 = 6238762102503803329L;
        long l21 = 235042028450816840L;
        long l22 = 1381075141360038523L;
        long l23 = 8700647626369316225L;
        long l24 = 6430938995544795764L;
        long l25 = -7217244767793906380L;
        if (this.a == null) {
            int n = -159;
            n += 98;
            throw new IllegalStateException((String)U[n -= -86]);
        }
        try {
            this.c = new a_0();
            long l26 = this.a.getStreamPosition();
            while (true) {
                int n = 165;
                n += -67;
                long l27 = l24;
                int n2 = 27;
                n2 ^= 0xFFFFFFCB;
                l24 = l27 ^ ((long)this.a.readUnsignedByte() << (n ^= 0x42) ^ l27) & -1L << (n2 -= -80);
                int n3 = -190;
                n3 += 103;
                int n4 = 14;
                n4 ^= 0xFFFFFFEF;
                if ((int)(l24 >>> (n3 += 119)) == (n4 += 75)) {
                    int n5;
                    int n6;
                    int n7;
                    this.c.b = this.a.readUnsignedShort();
                    this.c.B = this.a.readUnsignedShort();
                    this.c.c = this.a.readUnsignedShort();
                    this.c.C = this.a.readUnsignedShort();
                    int n8 = -38;
                    n8 += 26;
                    long l28 = l13;
                    int n9 = 72;
                    n9 -= -19;
                    l13 = l28 ^ ((long)this.a.readUnsignedByte() << (n8 += 44) ^ l28) & -1L << (n9 ^= 0x7B);
                    int n10 = -129;
                    n10 -= -49;
                    int n11 = 55;
                    n11 += -38;
                    if (((int)(l13 >>> (n10 ^= 0xFFFFFF90)) & (n11 -= -111)) != 0) {
                        int n12 = -163;
                        n12 -= -117;
                        n7 = n12 -= -47;
                    } else {
                        int n13 = 107;
                        n13 ^= 0xFFFFFF8C;
                        n7 = n13 += 25;
                    }
                    int n14 = 3;
                    n14 -= -124;
                    long l29 = l23;
                    int n15 = -135;
                    n15 -= -105;
                    l23 = l29 ^ ((long)n7 << (n14 += -95) ^ l29) & -1L << (n15 += 62);
                    int n16 = 168;
                    n16 += -24;
                    int n17 = -93;
                    n17 -= -50;
                    if (((int)(l13 >>> (n16 += -112)) & (n17 += 107)) != 0) {
                        int n18 = 2;
                        n18 ^= 0xFFFFFFDF;
                        n6 = n18 += 36;
                    } else {
                        int n19 = 26;
                        n19 += -73;
                        n6 = n19 -= -47;
                    }
                    this.c.d = n6;
                    int n20 = 59;
                    n20 += -85;
                    int n21 = 35;
                    n21 -= -93;
                    if (((int)(l13 >>> (n20 -= -58)) & (n21 += -96)) != 0) {
                        int n22 = -17;
                        n22 += -58;
                        n5 = n22 ^= 0xFFFFFFB4;
                    } else {
                        int n23 = -1;
                        n23 -= 71;
                        n5 = n23 -= -72;
                    }
                    this.c.D = n5;
                    int n24 = -148;
                    n24 += 65;
                    n24 += 84;
                    int n25 = -29;
                    n25 ^= 0xFFFFFFF2;
                    n25 -= -15;
                    int n26 = 110;
                    n26 += 16;
                    n26 ^= 0x79;
                    int n27 = -146;
                    n27 += 83;
                    n27 -= -64;
                    int n28 = 4;
                    n28 += 49;
                    long l30 = l20;
                    int n29 = -118;
                    n29 ^= 0xFFFFFFF6;
                    l20 = l30 ^ ((long)(n24 << ((int)(l13 >>> n25) & n26) + n27) << (n28 -= 21) ^ l30) & -1L << (n29 += -92);
                    int n30 = 78;
                    n30 ^= 0xE;
                    if ((int)(l23 >>> (n30 += -32)) != 0) {
                        int n31 = -65;
                        n31 += 39;
                        int n32 = 49;
                        n32 += 32;
                        this.c.e = kotakbaz.rain.client.render.texture.utils.gif.common.a.staggeredReadByteStream(this.a, (n31 += 29) * (int)(l20 >>> (n32 -= 49)));
                    } else {
                        this.c.e = null;
                    }
                    this.d = (int)(this.a.getStreamPosition() - l26);
                    return;
                }
                int n33 = 109;
                n33 -= 30;
                int n34 = 60;
                n34 -= 58;
                if ((int)(l24 >>> (n33 -= 47)) != (n34 += 31)) break;
                int n35 = 29;
                n35 ^= 0x54;
                long l31 = l13;
                int n36 = 152;
                n36 -= -2;
                l13 = l31 ^ ((long)this.a.readUnsignedByte() << (n35 ^= 0x69) ^ l31) & -1L << (n36 -= 122);
                int n37 = 59;
                n37 -= 64;
                int n38 = 383;
                n38 ^= 0x12;
                if ((int)(l13 >>> (n37 ^= 0xFFFFFFDB)) == (n38 += -116)) {
                    int n39;
                    int n40;
                    int n41 = -125;
                    n41 ^= 0x54;
                    long l32 = l23;
                    int n42 = -108;
                    n42 += 51;
                    l23 = l32 ^ ((long)this.a.readUnsignedByte() << (n41 -= -73) ^ l32) & -1L << (n42 ^= 0xFFFFFFE7);
                    int n43 = 92;
                    n43 -= 82;
                    long l33 = l20;
                    int n44 = 120;
                    n44 ^= 0x46;
                    l20 = l33 ^ ((long)this.a.readUnsignedByte() << (n43 -= -22) ^ l33) & -1L << (n44 ^= 0x1E);
                    int n45 = -110;
                    n45 -= -101;
                    int n46 = -43;
                    n46 += 101;
                    int n47 = 80;
                    n47 ^= 0xFFFFFF94;
                    this.c.E = (int)(l20 >>> (n45 -= -41)) >> (n46 ^= 0x38) & (n47 -= -63);
                    int n48 = 71;
                    n48 ^= 0xFFFFFFFC;
                    int n49 = -107;
                    n49 += 94;
                    if (((int)(l20 >>> (n48 -= -101)) & (n49 += 15)) != 0) {
                        int n50 = -5;
                        n50 += -88;
                        n40 = n50 ^= 0xFFFFFFA2;
                    } else {
                        int n51 = 83;
                        n51 += -56;
                        n40 = n51 += -27;
                    }
                    this.c.f = n40;
                    int n52 = 16;
                    n52 ^= 0x64;
                    int n53 = 86;
                    n53 ^= 0x26;
                    if (((int)(l20 >>> (n52 ^= 0x54)) & (n53 -= 111)) != 0) {
                        int n54 = 93;
                        n54 -= 101;
                        n39 = n54 ^= 0xFFFFFFF9;
                    } else {
                        int n55 = -108;
                        n55 ^= 0xFFFFFFBD;
                        n39 = n55 += -41;
                    }
                    this.c.F = n39;
                    this.c.g = this.a.readUnsignedShort();
                    this.c.G = this.a.readUnsignedByte();
                    long l34 = l10;
                    int n56 = 91;
                    n56 -= -49;
                    l10 = l34 ^ ((long)this.a.readUnsignedByte() ^ l34) & -1L >>> (n56 -= 108);
                    continue;
                }
                int n57 = -87;
                n57 ^= 0xFFFFFFF6;
                int n58 = -34;
                n58 += 17;
                if ((int)(l13 >>> (n57 += -63)) == (n58 ^= 0xFFFFFFEE)) {
                    int n59 = 229;
                    n59 ^= 0x7B;
                    long l35 = l23;
                    int n60 = -133;
                    n60 -= -58;
                    l23 = l35 ^ ((long)this.a.readUnsignedByte() << (n59 -= 126) ^ l35) & -1L << (n60 ^= 0xFFFFFF95);
                    if (!this.ignoreMetadata) {
                        int n61 = 104;
                        n61 += 8;
                        this.c.h = n61 -= 111;
                        this.c.H = this.a.readUnsignedShort();
                        this.c.i = this.a.readUnsignedShort();
                        this.c.I = this.a.readUnsignedShort();
                        this.c.j = this.a.readUnsignedShort();
                        this.c.J = this.a.readUnsignedByte();
                        this.c.k = this.a.readUnsignedByte();
                        this.c.K = this.a.readUnsignedByte();
                        this.c.l = this.a.readUnsignedByte();
                    } else {
                        int n62 = 49;
                        n62 += -76;
                        this.a.skipBytes((int)(l23 >>> (n62 += 59)));
                    }
                    this.c.L = this.concatenateBlocks();
                    continue;
                }
                int n63 = -58;
                n63 += 81;
                int n64 = 74;
                n64 -= -87;
                if ((int)(l13 >>> (n63 -= -9)) == (n64 ^= 0x5F)) {
                    byte[] byArray = this.concatenateBlocks();
                    if (this.ignoreMetadata) continue;
                    if (this.c.N == null) {
                        this.c.N = new ArrayList<byte[]>();
                    }
                    this.c.N.add(byArray);
                    continue;
                }
                int n65 = -59;
                n65 ^= 0x13;
                int n66 = 363;
                ++n66;
                if ((int)(l13 >>> (n65 -= -74)) == (n66 += -109)) {
                    int n67 = 240;
                    n67 ^= 0x70;
                    long l36 = l23;
                    int n68 = 47;
                    n68 ^= 0x41;
                    l23 = l36 ^ ((long)this.a.readUnsignedByte() << (n67 += -96) ^ l36) & -1L << (n68 += -78);
                    long l37 = l20;
                    int n69 = -106;
                    n69 += 36;
                    l20 = l37 ^ (0L ^ l37) & -1L << (n69 += 102);
                    int n70 = -113;
                    n70 += 53;
                    byte[] byArray = new byte[n70 += 60];
                    int n71 = -15;
                    n71 ^= 0xFFFFFFDE;
                    byte[] byArray2 = new byte[n71 -= 39];
                    int n72 = -36;
                    n72 += -81;
                    byte[] byArray3 = new byte[n72 -= -120];
                    if (!this.ignoreMetadata) {
                        int n73 = -60;
                        n73 -= -13;
                        byArray = kotakbaz.rain.client.render.texture.utils.gif.common.a.staggeredReadByteStream(this.a, (int)(l23 >>> (n73 ^= 0xFFFFFFF1)));
                        int n74 = -50;
                        n74 ^= 0x46;
                        n74 -= -120;
                        int n75 = -236;
                        n75 ^= 0xFFFFFF9D;
                        long l38 = l20;
                        int n76 = -204;
                        n76 -= -109;
                        l20 = l38 ^ ((long)this.copyData(byArray, n74, byArray2) << (n75 -= 105) ^ l38) & -1L << (n76 ^= 0xFFFFFF81);
                        int n77 = -5;
                        n77 ^= 0xFFFFFFC5;
                        n77 += -30;
                        int n78 = 73;
                        n78 ^= 0x67;
                        long l39 = l20;
                        int n79 = -32;
                        n79 ^= 0xFFFFFF9D;
                        l20 = l39 ^ ((long)this.copyData(byArray, (int)(l20 >>> n77), byArray3) << (n78 -= 14) ^ l39) & -1L << (n79 -= 93);
                    } else {
                        int n80 = -235;
                        n80 += 116;
                        this.a.skipBytes((int)(l23 >>> (n80 ^= 0xFFFFFFA9)));
                    }
                    byte[] byArray4 = this.concatenateBlocks();
                    if (!this.ignoreMetadata) {
                        int n81 = 118;
                        n81 -= 39;
                        int n82 = 79;
                        n82 -= 84;
                        if ((int)(l20 >>> (n81 -= 47)) < (int)(l23 >>> (n82 += 37))) {
                            int n83 = 87;
                            n83 ^= 0xFFFFFFA5;
                            n83 ^= 0xFFFFFFD2;
                            int n84 = 123;
                            n84 += -103;
                            n84 -= -12;
                            int n85 = 29;
                            n85 += -68;
                            long l40 = l21;
                            int n86 = 6;
                            n86 += -82;
                            l21 = l40 ^ ((long)((int)(l23 >>> n83) - (int)(l20 >>> n84)) << (n85 += 71) ^ l40) & -1L << (n86 ^= 0xFFFFFF94);
                            int n87 = 56;
                            n87 += 23;
                            byte[] byArray5 = new byte[(int)(l21 >>> (n87 += -47)) + byArray4.length];
                            int n88 = -96;
                            n88 ^= 0xFFFFFFD9;
                            int n89 = -14;
                            n89 ^= 0x63;
                            int n90 = 33;
                            n90 ^= 0x70;
                            System.arraycopy(byArray, (int)(l20 >>> (n88 -= 89)), byArray5, n89 ^= 0xFFFFFF91, (int)(l21 >>> (n90 -= 49)));
                            int n91 = 8;
                            n91 += 17;
                            int n92 = -117;
                            n92 -= -122;
                            System.arraycopy(byArray4, n91 ^= 0x19, byArray5, (int)(l21 >>> (n92 += 27)), byArray4.length);
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
                long l41 = l23;
                int n93 = 50;
                n93 ^= 0x11;
                l23 = l41 ^ (0L ^ l41) & -1L << (n93 ^= 3);
                do {
                    int n94 = -111;
                    n94 -= -113;
                    long l42 = l23;
                    int n95 = -2;
                    n95 += -61;
                    l23 = l42 ^ ((long)this.a.readUnsignedByte() << (n94 += 30) ^ l42) & -1L << (n95 += 95);
                    int n96 = 17;
                    n96 -= -20;
                    this.a.skipBytes((int)(l23 >>> (n96 ^= 5)));
                    int n97 = -70;
                    n97 += 56;
                } while ((int)(l23 >>> (n97 += 46)) > 0);
            }
            int n = 218;
            n -= 109;
            int n98 = -60;
            n98 += 80;
            if ((int)(l24 >>> (n -= 77)) == (n98 += 39)) {
                int n99 = 83;
                n99 ^= 0x52;
                int n100 = -45;
                n100 ^= 0xFFFFFFE7;
                throw new IndexOutOfBoundsException((String)U[n99 -= -3] + (String)U[n100 += -29]);
            }
            int n101 = -101;
            n101 ^= 0xFFFFFFAC;
            n101 -= 23;
            int n102 = 68;
            n102 -= -67;
            long l43 = l25;
            int n103 = 31;
            n103 ^= 0x53;
            l25 = l43 ^ ((long)((int)(l24 >>> n101)) << (n102 -= 103) ^ l43) & -1L << (n103 += -44);
            int n104 = -29;
            n104 -= -34;
            n104 -= -26;
            int n105 = -13;
            n105 -= -71;
            int n106 = 58;
            n106 += -13;
            int n107 = 87;
            n107 ^= 0x2C;
            throw new IIOException((String)U[n104] + (String)U[n105 -= 56] + (int)(l25 >>> (n106 -= 13)) + (String)U[n107 ^= 0x6D]);
        }
        catch (IIOException iIOException) {
            throw iIOException;
        }
        catch (IOException iOException) {
            int n = -68;
            n += 43;
            int n108 = -6;
            n108 ^= 2;
            throw new IIOException((String)U[n ^= 0xFFFFFFF3] + (String)U[n108 ^= 0xFFFFFFFB], iOException);
        }
    }

    private int copyData(byte[] byArray, int n, byte[] byArray2) {
        long l = 8336975281186034236L;
        long l2 = 3246639221092428428L;
        long l3 = -2492568541488181283L;
        long l4 = 3303956728858574271L;
        int n2 = -148;
        n2 -= -37;
        long l5 = l4;
        int n3 = -3;
        n3 += -73;
        l4 = l5 ^ ((long)byArray2.length << (n2 ^= 0xFFFFFFB1) ^ l5) & -1L << (n3 -= -108);
        int n4 = -19;
        n4 ^= 0xFFFFFF83;
        long l6 = l3;
        int n5 = 35;
        n5 -= -59;
        l3 = l6 ^ ((long)(byArray.length - n) << (n4 += -78) ^ l6) & -1L << (n5 -= 62);
        int n6 = 110;
        n6 ^= 0xFFFFFF9D;
        int n7 = 22;
        n7 ^= 0xFFFFFFBD;
        if ((int)(l4 >>> (n6 += 45)) > (int)(l3 >>> (n7 += 117))) {
            int n8 = -202;
            n8 ^= 0xFFFFFFBF;
            n8 -= 105;
            int n9 = 166;
            n9 -= 34;
            long l7 = l4;
            int n10 = -13;
            n10 ^= 0x12;
            l4 = l7 ^ ((long)((int)(l3 >>> n8)) << (n9 += -100) ^ l7) & -1L << (n10 -= -63);
        }
        int n11 = 31;
        n11 += -46;
        int n12 = -136;
        n12 -= -50;
        System.arraycopy(byArray, n, byArray2, n11 -= -15, (int)(l4 >>> (n12 ^= 0xFFFFFF8A)));
        int n13 = -106;
        n13 ^= 0xFFFFFFED;
        return n + (int)(l4 >>> (n13 -= 91));
    }

    private void startPass(int n) {
        long l = -8757399252391894192L;
        long l2 = 2441975139814486695L;
        long l3 = 8543733129103494706L;
        if (this.updateListeners == null || !this.c.d) {
            return;
        }
        int n2 = -19;
        n2 -= -7;
        long l4 = l2;
        int n3 = -56;
        n3 += 34;
        l2 = l4 ^ ((long)N[this.m] << (n2 ^= 0xFFFFFFD4) ^ l4) & -1L << (n3 -= -54);
        int n4 = -109;
        long l5 = l3;
        int n5 = 175;
        n5 += -49;
        l3 = l5 ^ ((long)kotakbaz.rain.client.render.texture.utils.gif.gif.B.n[this.m] << (n4 ^= 0xFFFFFFB3) ^ l5) & -1L << (n5 += -94);
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
        int[] nArray = kotakbaz.rain.client.render.texture.utils.gif.common.a.computeUpdatedPixels(this.o, this.Q, this.r.x, this.r.y, this.r.x + this.r.width - n6, this.r.y + this.r.height - n7, this.O, this.p, n8, (int)(l2 >>> n9), this.r.width, (this.r.height + (int)(l3 >>> n10) - n11) / (int)(l3 >>> (n12 -= 103)), n13 -= 89, (int)(l3 >>> (n14 += -48)));
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
    public BufferedImage read(int n, ImageReadParam imageReadParam) {
        long l = -4206173426493812334L;
        long l2 = -3635904148242693449L;
        long l3 = 3933358566617004373L;
        long l4 = 8194856528485125598L;
        long l5 = -34009538319092057L;
        long l6 = 4575787757216919782L;
        long l7 = 4403529277624466603L;
        long l8 = 5611022018682379776L;
        long l9 = 36866389656048334L;
        long l10 = 2726711620422896709L;
        long l11 = -335242126577824813L;
        long l12 = 7910620139910584042L;
        long l13 = 4988064599276329515L;
        long l14 = 1942927772482378673L;
        long l15 = -175079623777626743L;
        long l16 = 5964789017934400674L;
        long l17 = -7027241931977292362L;
        long l18 = -7028214521352820485L;
        long l19 = -2514872293989185887L;
        long l20 = 5774481689548345700L;
        long l21 = -1421638180528662087L;
        long l22 = 1918758364059413350L;
        long l23 = 4351695404853590143L;
        long l24 = 1105693761784104990L;
        long l25 = 7689120560779017302L;
        long l26 = -2135716623073099219L;
        long l27 = -2299719065872732259L;
        long l28 = 7886229428505429746L;
        long l29 = -5874732852001678337L;
        long l30 = -6702831191639245061L;
        long l31 = -379066999665071607L;
        long l32 = 3607776761661327799L;
        long l33 = -4559706268558514692L;
        long l34 = 113076309671985265L;
        long l35 = -626912198093193756L;
        long l36 = -2234983232500419463L;
        long l37 = 2633866705939188968L;
        long l38 = -6928455596728312669L;
        long l39 = -3709173289711073308L;
        long l40 = 8012736264216847861L;
        long l41 = -980102440482431180L;
        if (this.a == null) {
            int n2 = 8;
            n2 += -105;
            throw new IllegalStateException((String)U[n2 -= -125]);
        }
        this.checkIndex(n);
        int n3 = 151;
        n3 -= 50;
        long l42 = l12;
        int n4 = -48;
        n4 ^= 0x65;
        l12 = l42 ^ ((long)this.locateImage(n) << (n3 -= 69) ^ l42) & -1L << (n4 += 107);
        int n5 = -49;
        n5 += -3;
        if ((int)(l12 >>> (n5 ^= 0xFFFFFFEC)) != n) {
            int n6 = 208;
            n6 += -83;
            int n7 = -87;
            n7 ^= 0x14;
            throw new IndexOutOfBoundsException((String)U[n6 += -88] + (String)U[n7 ^= 0xFFFFFFA7]);
        }
        this.readMetadata();
        if (imageReadParam == null) {
            imageReadParam = this.getDefaultReadParam();
        }
        Iterator<ImageTypeSpecifier> iterator2 = this.getImageTypes(n);
        this.I = kotakbaz.rain.client.render.texture.utils.gif.gif.B.getDestination(imageReadParam, iterator2, this.c.c, this.c.C);
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
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.computeRegions(imageReadParam, this.J, this.k, this.I, this.o, this.r);
        this.Q = new Point(this.r.x, this.r.y);
        this.O = imageReadParam.getSourceXSubsampling();
        this.p = imageReadParam.getSourceYSubsampling();
        int n22 = 52;
        n22 += -24;
        this.P = Math.max(imageReadParam.getSourceMinProgressivePass(), n22 -= 28);
        int n23 = 65;
        n23 ^= 0xFFFFFFD9;
        this.q = Math.min(imageReadParam.getSourceMaxProgressivePass(), n23 -= -107);
        this.t = this.r.y + (this.l - this.o.y) / this.p;
        this.computeDecodeThisRow();
        this.clearAbortRequest();
        this.processImageStarted(n);
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
                long l43 = l14;
                int n28 = 2;
                n28 ^= 0xFFFFFFA6;
                l14 = l43 ^ ((long)this.g << (n27 -= 111) ^ l43) & -1L << (n28 += 124);
                int n29 = -39;
                n29 ^= 0x18;
                int n30 = -50;
                n30 -= -38;
                throw new IIOException((String)U[n29 += 73] + (int)(l14 >>> (n30 += 44)));
            }
            this.E = this.a.readUnsignedByte();
            long l44 = l24;
            int n31 = -65;
            n31 -= -40;
            l24 = l44 ^ ((long)this.E ^ l44) & -1L >>> (n31 ^= 0xFFFFFFC7);
            long l45 = l28;
            int n32 = 43;
            n32 += -83;
            l28 = l45 ^ (0L ^ l45) & -1L << (n32 ^= 0xFFFFFFF8);
            while ((int)l24 > 0) {
                int n33 = -39;
                n33 -= 50;
                long l46 = l28;
                int n34 = -35;
                n34 += -44;
                l28 = l46 ^ ((long)this.a.read(this.e, (int)(l28 >>> (n33 += 121)), (int)l24) ^ l46) & -1L >>> (n34 ^= 0xFFFFFF91);
                int n35 = -19;
                n35 += -34;
                if ((int)l28 == (n35 ^= 0x34)) {
                    int n36 = 92;
                    n36 -= 2;
                    int n37 = -89;
                    n37 ^= 3;
                    throw new IIOException((String)U[n36 += -63] + (String)U[n37 ^= 0xFFFFFFBA]);
                }
                long l47 = l24;
                int n38 = 72;
                n38 -= 118;
                l24 = l47 ^ ((long)((int)l24 - (int)l28) ^ l47) & -1L >>> (n38 ^= 0xFFFFFFF2);
                int n39 = 97;
                n39 -= -50;
                n39 += -115;
                int n40 = 98;
                n40 -= 0;
                long l48 = l28;
                int n41 = -88;
                n41 -= -107;
                l28 = l48 ^ ((long)((int)(l28 >>> n39) + (int)l28) << (n40 += -66) ^ l48) & -1L << (n41 += 13);
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
            long l49 = l28;
            int n48 = 93;
            n48 ^= 0x44;
            l28 = l49 ^ (0xFFFFFFFFFFFFFFFFL ^ l49) & -1L >>> (n48 ^= 0x39);
            long l50 = l41;
            int n49 = -154;
            n49 += 77;
            l41 = l50 ^ (0xFFFFFFFFFFFFFFFFL ^ l50) & -1L >>> (n49 += 109);
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
            long l51 = l40;
            int n58 = -230;
            n58 += 102;
            l40 = l51 ^ ((long)((n55 << this.g) + n56) << (n57 -= -127) ^ l51) & -1L << (n58 ^= 0xFFFFFFA0);
            int n59 = 117;
            n59 += 0;
            long l52 = l36;
            int n60 = 199;
            n60 ^= 0x52;
            l36 = l52 ^ ((long)(this.g + (n59 -= 116)) ^ l52) & -1L >>> (n60 -= 117);
            int n61 = 41;
            n61 -= 87;
            n61 -= -47;
            int n62 = -119;
            n62 += -4;
            n62 ^= 0xFFFFFF84;
            int n63 = 120;
            n63 ^= 0xFFFFFFAD;
            long l53 = l37;
            int n64 = 56;
            n64 ^= 0xFFFFFFFA;
            l37 = l53 ^ ((long)((n61 << (int)l36) - n62) << (n63 += 75) ^ l53) & -1L << (n64 -= -94);
            do {
                int n65 = -87;
                n65 -= 41;
                long l54 = l40;
                int n66 = -72;
                n66 -= 7;
                l40 = l54 ^ ((long)this.getCode((int)l36, (int)(l37 >>> (n65 ^= 0xFFFFFFA0))) ^ l54) & -1L >>> (n66 += 111);
                if ((int)l40 == this.G) {
                    this.initializeStringTable(nArray, byArray, byArray2, nArray2);
                    int n67 = 41;
                    n67 ^= 8;
                    n67 += -32;
                    int n68 = 111;
                    n68 ^= 0xFFFFFF8B;
                    n68 -= -30;
                    int n69 = 252;
                    n69 ^= 0x61;
                    long l55 = l40;
                    int n70 = -161;
                    n70 += 34;
                    l40 = l55 ^ ((long)((n67 << this.g) + n68) << (n69 += -125) ^ l55) & -1L << (n70 ^= 0xFFFFFFA1);
                    int n71 = -79;
                    n71 += -3;
                    long l56 = l36;
                    int n72 = -53;
                    n72 += 5;
                    l36 = l56 ^ ((long)(this.g + (n71 += 83)) ^ l56) & -1L >>> (n72 -= -80);
                    int n73 = -29;
                    n73 += 20;
                    n73 ^= 0xFFFFFFF6;
                    int n74 = -65;
                    n74 += -53;
                    n74 += 119;
                    int n75 = -30;
                    n75 ^= 0xFFFFFFBE;
                    long l57 = l37;
                    int n76 = 161;
                    n76 -= 104;
                    l37 = l57 ^ ((long)((n73 << (int)l36) - n74) << (n75 += -60) ^ l57) & -1L << (n76 += -25);
                    int n77 = -42;
                    n77 -= -82;
                    long l58 = l40;
                    int n78 = -13;
                    n78 ^= 0xFFFFFFF2;
                    l40 = l58 ^ ((long)this.getCode((int)l36, (int)(l37 >>> (n77 -= 8))) ^ l58) & -1L >>> (n78 += 31);
                    long l59 = l41;
                    int n79 = 121;
                    n79 ^= 0xFFFFFF9E;
                    l41 = l59 ^ (0xFFFFFFFFFFFFFFFFL ^ l59) & -1L >>> (n79 -= -57);
                    if ((int)l40 == this.h) {
                        this.processImageComplete();
                        return this.I;
                    }
                } else {
                    if ((int)l40 == this.h) {
                        this.processImageComplete();
                        return this.I;
                    }
                    int n80 = 88;
                    n80 -= -66;
                    if ((int)l40 < (int)(l40 >>> (n80 += -122))) {
                        int n81 = 35;
                        n81 ^= 0x45;
                        long l60 = l41;
                        int n82 = 15;
                        n82 += -69;
                        l41 = l60 ^ ((long)((int)l40) << (n81 += -70) ^ l60) & -1L << (n82 -= -86);
                    } else {
                        int n83 = 98;
                        n83 ^= 0xFFFFFFDB;
                        long l61 = l41;
                        int n84 = -15;
                        n84 ^= 0xFFFFFF9F;
                        l41 = l61 ^ ((long)((int)l41) << (n83 += 103) ^ l61) & -1L << (n84 += -78);
                        int n85 = -237;
                        n85 += 116;
                        if ((int)l40 != (int)(l40 >>> (n85 ^= 0xFFFFFFA7))) {
                            int n86 = -3;
                            n86 ^= 0x14;
                            int n87 = -36;
                            n87 += 98;
                            this.processWarningOccurred((String)U[n86 ^= 0xFFFFFFE5] + (String)U[n87 ^= 0x39]);
                        }
                    }
                    int n88 = -74;
                    n88 ^= 0xFFFFFFDD;
                    if ((n88 -= 108) != (int)l41) {
                        int n89 = 2;
                        n89 -= -60;
                        int n90 = 4189;
                        n90 -= -17;
                        if ((int)(l40 >>> (n89 += -30)) < (n90 += -110)) {
                            int n91 = 125;
                            n91 ^= 0xFFFFFFDF;
                            n91 ^= 0xFFFFFF82;
                            int n92 = -114;
                            n92 ^= 0xFFFFFF87;
                            long l62 = l27;
                            int n93 = 9;
                            n93 ^= 0x74;
                            l27 = l62 ^ ((long)((int)(l40 >>> n91)) << (n92 ^= 0x29) ^ l62) & -1L << (n93 += -93);
                            long l63 = l25;
                            int n94 = 201;
                            n94 += -114;
                            l25 = l63 ^ ((long)((int)l41) ^ l63) & -1L >>> (n94 += -55);
                            int n95 = 245;
                            n95 -= 101;
                            nArray[(int)(l27 >>> (n95 += -112))] = (int)l25;
                            int n96 = -4;
                            n96 += -76;
                            int n97 = 173;
                            n97 += -113;
                            byArray[(int)(l27 >>> (n96 -= -112))] = byArray2[(int)(l41 >>> (n97 ^= 0x1C))];
                            int n98 = 0;
                            n98 -= 53;
                            byArray2[(int)(l27 >>> (n98 += 85))] = byArray2[(int)l25];
                            int n99 = 43;
                            n99 ^= 0xFFFFFF98;
                            int n100 = -148;
                            n100 += 57;
                            nArray2[(int)(l27 >>> (n99 ^= 0xFFFFFF93))] = nArray2[(int)l25] + (n100 ^= 0xFFFFFFA4);
                            int n101 = 112;
                            n101 ^= 0xFFFFFFAC;
                            int n102 = -115;
                            n102 += 70;
                            if ((int)((l40 += 0x100000000L) >>> (n101 += 68)) == (n102 += 46) << (int)l36) {
                                int n103 = -50;
                                n103 ^= 0xFFFFFFA5;
                                int n104 = -4262;
                                n104 += 88;
                                if ((int)(l40 >>> (n103 -= 75)) < (n104 ^= 0xFFFFFFB2)) {
                                    long l64 = l36;
                                    int n105 = 29;
                                    n105 -= 64;
                                    int n106 = -101;
                                    n106 ^= 0xFFFFFFF4;
                                    l36 = l64 ^ (l64 ^ l64 + (long)(n105 += 36)) & -1L >>> (n106 += -79);
                                    int n107 = 111;
                                    n107 -= 53;
                                    n107 ^= 0x3B;
                                    int n108 = 118;
                                    n108 -= 104;
                                    n108 += -13;
                                    int n109 = -40;
                                    n109 -= -51;
                                    long l65 = l37;
                                    int n110 = 37;
                                    n110 += 65;
                                    l37 = l65 ^ ((long)((n107 << (int)l36) - n108) << (n109 ^= 0x2B) ^ l65) & -1L << (n110 -= 70);
                                }
                            }
                        }
                    }
                }
                int n111 = -66;
                n111 ^= 0x67;
                long l66 = l41;
                int n112 = -166;
                n112 += 120;
                l41 = l66 ^ ((long)((int)l40) << (n111 += 71) ^ l66) & -1L << (n112 += 78);
                int n113 = -60;
                n113 ^= 0x27;
                n113 -= -61;
                int n114 = -96;
                n114 ^= 0x41;
                long l67 = l27;
                int n115 = -39;
                n115 ^= 0xFFFFFFB6;
                l27 = l67 ^ ((long)nArray2[(int)(l41 >>> n113)] << (n114 -= -63) ^ l67) & -1L << (n115 += -79);
                int n116 = 11;
                n116 ^= 0x47;
                n116 ^= 0x6C;
                int n117 = -109;
                n117 ^= 0xFFFFFFE3;
                long l68 = l25;
                int n118 = 183;
                n118 ^= 0x29;
                l25 = l68 ^ ((long)((int)(l27 >>> n116) - (n117 += -111)) ^ l68) & -1L >>> (n118 += -126);
                while ((int)l25 >= 0) {
                    int n119 = -118;
                    n119 ^= 0x6A;
                    byArray3[(int)l25] = byArray[(int)(l41 >>> (n119 ^= 0xFFFFFFC0))];
                    int n120 = 93;
                    n120 -= 22;
                    n120 ^= 0x67;
                    int n121 = -55;
                    n121 -= -75;
                    long l69 = l41;
                    int n122 = 83;
                    n122 += -41;
                    l41 = l69 ^ ((long)nArray[(int)(l41 >>> n120)] << (n121 -= -12) ^ l69) & -1L << (n122 ^= 0xA);
                    long l70 = l25;
                    int n123 = 54;
                    n123 ^= 0xFFFFFF94;
                    int n124 = -99;
                    n124 -= 25;
                    l25 = l70 ^ (l70 ^ l70 + (long)(n123 -= -93)) & -1L >>> (n124 ^= 0xFFFFFFA4);
                }
                int n125 = -99;
                n125 -= 4;
                this.outputPixels(byArray3, (int)(l27 >>> (n125 ^= 0xFFFFFFB9)));
                long l71 = l41;
                int n126 = -103;
                n126 += 91;
                l41 = l71 ^ ((long)((int)l40) ^ l71) & -1L >>> (n126 ^= 0xFFFFFFD4);
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
        int n = -30;
        n ^= 0xFFFFFF9A;
        this.A = n -= 120;
        this.b = null;
        int n2 = -111;
        n2 ^= 0xFFFFFFC9;
        this.B = n2 -= 89;
        this.c = null;
        this.C = new ArrayList<Long>();
        int n3 = 64;
        n3 ^= 0x6D;
        this.D = n3 -= 46;
        int n4 = 78;
        n4 -= 125;
        this.E = n4 ^= 0xFFFFFFD1;
        int n5 = -25;
        n5 -= -104;
        this.f = n5 += -79;
        int n6 = 56;
        n6 += -97;
        this.F = n6 ^= 0xFFFFFFD7;
        int n7 = -78;
        n7 -= -46;
        this.H = n7 ^= 0xFFFFFFE0;
        int n8 = -53;
        n8 -= -21;
        this.i = n8 -= -32;
        this.I = null;
        this.j = null;
        int n9 = -28;
        n9 += 48;
        this.J = n9 += -21;
        int n10 = 0;
        n10 ^= 0xFFFFFFA5;
        this.k = n10 += 90;
        int n11 = -59;
        n11 -= -51;
        this.K = n11 ^= 7;
        int n12 = 62;
        n12 += -47;
        this.l = n12 ^= 0xFFFFFFF0;
        int n13 = -112;
        n13 ^= 0x35;
        this.L = n13 -= -91;
        int n14 = -202;
        n14 += 84;
        this.m = n14 -= -118;
        this.M = null;
    }

    private static synchronized byte[] getDefaultPalette() {
        long l = -8017447537597686885L;
        long l2 = 3018897854826113490L;
        long l3 = -794302349598156258L;
        long l4 = -6916689005220450909L;
        long l5 = 6417908893284172245L;
        long l6 = -7150908442423060211L;
        long l7 = -8192632298120209253L;
        long l8 = 9072096203157553612L;
        if (u == null) {
            int n = -90;
            n -= -65;
            int n2 = 129;
            n2 += -35;
            int n3 = -136;
            n3 += 64;
            BufferedImage bufferedImage = new BufferedImage(n -= -26, n2 -= 93, n3 -= -85);
            IndexColorModel indexColorModel = (IndexColorModel)bufferedImage.getColorModel();
            long l9 = l7;
            int n4 = -24;
            n4 += 97;
            l7 = l9 ^ ((long)indexColorModel.getMapSize() ^ l9) & -1L >>> (n4 ^= 0x69);
            byte[] byArray = new byte[(int)l7];
            byte[] byArray2 = new byte[(int)l7];
            byte[] byArray3 = new byte[(int)l7];
            indexColorModel.getReds(byArray);
            indexColorModel.getGreens(byArray2);
            indexColorModel.getBlues(byArray3);
            int n5 = -142;
            n5 -= -98;
            u = new byte[(int)l7 * (n5 += 47)];
            long l10 = l8;
            int n6 = -72;
            n6 ^= 0xFFFFFFAE;
            l8 = l10 ^ (0L ^ l10) & -1L << (n6 += 10);
            while (true) {
                int n7 = 1;
                n7 -= -33;
                if ((int)(l8 >>> (n7 -= 2)) >= (int)l7) break;
                int n8 = 41;
                n8 ^= 0x35;
                int n9 = 12;
                n9 += -27;
                int n10 = -118;
                n10 -= -66;
                kotakbaz.rain.client.render.texture.utils.gif.gif.B.u[(n8 += -25) * (int)(l8 >>> (n9 ^= 0xFFFFFFD1))] = byArray[(int)(l8 >>> (n10 ^= 0xFFFFFFEC))];
                int n11 = 91;
                n11 ^= 0xFFFFFFAF;
                n11 -= -15;
                int n12 = 129;
                n12 += -25;
                int n13 = 148;
                n13 -= 40;
                int n14 = 26;
                n14 -= 89;
                kotakbaz.rain.client.render.texture.utils.gif.gif.B.u[n11 * (int)(l8 >>> (n12 ^= 0x48)) + (n13 -= 107)] = byArray2[(int)(l8 >>> (n14 -= -95))];
                int n15 = 78;
                n15 += -105;
                n15 += 30;
                int n16 = 40;
                n16 ^= 0x71;
                int n17 = 120;
                n17 += -75;
                int n18 = -63;
                n18 += 76;
                kotakbaz.rain.client.render.texture.utils.gif.gif.B.u[n15 * (int)(l8 >>> (n16 -= 57)) + (n17 ^= 0x2F)] = byArray3[(int)(l8 >>> (n18 ^= 0x2D))];
                l8 += 0x100000000L;
            }
        }
        return u;
    }

    static {
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.b();
        long l = -781569981592524095L;
        long l2 = 2502455944034532614L;
        long l3 = 8910201035313564486L;
        long l4 = 7880268183150077084L;
        long l5 = 9847590064124741L;
        long l6 = 8975084696935800258L;
        long l7 = 4402465749624776878L;
        long l8 = -3135971363341716271L;
        long l9 = 455155751973794872L;
        long l10 = -356906618966597029L;
        long l11 = -3307959991074046314L;
        long l12 = 6899568013321031040L;
        long l13 = 4605880141859097832L;
        long l14 = 7907335583212150655L;
        int n = 76;
        n -= 2;
        U = new Object[n ^= 0x6C];
        long l15 = l14;
        int n2 = 154;
        n2 -= 106;
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 += -16);
        Object[] objectArray = new Object[3];
        objectArray[0] = v;
        objectArray[1] = 0;
        Object object = kotakbaz.rain.client.render.texture.utils.gif.gif.B.A()[0];
        if (object == null) {
            char[] cArray = "\u593c\u5a54\u5a70\u5a6d\u5a5c\u5a42\u5a51\u5927\u593f\u5a5c\u5a47\u5a65\u5a4e\u5a47\u5a43\u5927\u5a5c\u5a42\u593c\u5a54\u5a6d\u5922\u5923\u5a6f\u5930\u5a65\u5925\u5a4f\u5a60\u5a42\u5a67\u5a4f\u5a5c\u5a5d\u593d\u5a60\u5a64\u592d\u5a59\u5a45\u5a53\u5a6e\u5934\u5932\u5a5a\u593f\u5a60\u5923\u5a42\u5931\u5a68\u5933\u5a43\u5a48\u593d\u5a41\u5a5b\u5a5c\u5a6f\u5937\u592f\u5a50\u5a6f\u5933\u5a6e\u593c\u5a42\u592d\u5933\u5932\u5a51\u5925\u5a59\u5a4f\u5a59\u5a4e\u5a62\u5a5c\u5a4e\u5924\u5940\u5a5e\u5a5e\u593a\u592e\u5922\u5a6e\u5a61\u5a57\u5a5a\u5940\u593d\u593f\u593b\u5934\u5933\u5a47\u5a42\u5924\u5a4f\u5a5f\u5937\u5a4e\u592f\u5a67\u5925\u5a48\u5a41\u5a45\u592a\u5a68\u592e\u5a52\u5937\u5923\u5934\u5a6f\u5a53\u5926\u5a4f\u5a60\u5a51\u5a46\u5a62\u5933\u5a51\u5a68\u593e\u5a59\u5924\u5928\u593f\u5a45\u5a61\u592e\u5a65\u5a6f\u5a6e\u5a6d\u5a65\u5927\u5927\u5933\u5a4f\u5a51\u5a51\u5a4a\u5a4a\u5a54\u5a5c\u5a47\u5a62\u593d\u592a\u5a79\u5a47\u5a5b\u5a5c\u5921\u5a41\u5a5a\u5931\u592e\u5939\u5926\u5a6d\u5a64\u5a6f\u5923\u592d\u5a6d\u593c\u592d\u593c\u5932\u593b\u5932\u5927\u5a5e\u5a44\u593c\u5928\u5a4e\u5a52\u5927\u5a79\u5a70\u5a46\u5a6f\u593d\u592d\u592a\u5a51\u5a52\u5a4a\u5a50\u5a5d\u5a65\u5a5c\u5a48\u5a41\u5a70\u5a4f\u592f\u5937\u5a45\u5a57\u5a5b\u593f\u5a43\u5a65\u5a42\u593e\u5a64\u5a4e\u5932\u5a4f\u5a6e\u5a47\u5a6d\u592a\u5a51\u5931\u5a4d\u5931\u5922\u593d\u5a6f\u5926\u5921\u5a64\u5a62\u5933\u5a6f\u5925\u5937\u5a46\u5a4a\u5a52\u5931\u593e\u5a4f\u5a65\u5931\u593d\u5930\u5a62\u5a45\u5a6e\u592d\u5a41\u5a5e\u592d\u593b\u593c\u5a65\u5a53\u5921\u5a54\u593a\u5a4d\u5a64\u5940\u5a61\u5933\u5937\u593f\u5a64\u5931\u593e\u593f\u5a6d\u5a46\u5a53\u5932\u5a79\u5a6f\u5a62\u5a5c\u5934\u5a79\u5a4e\u5a5d\u5a67\u593e\u5a4f\u5a51\u5a41\u5927\u5924\u5937\u5932\u5a4f\u5a60\u593b\u5a45\u5a45\u592e\u5a4a\u5a79\u593f\u5a52\u5a44\u5a57\u5a46\u5928\u5a5f\u5a67\u5a6f\u593b\u5a50\u5a65\u5a5d\u592d\u5a43\u5934\u5a52\u5a63\u5a4a\u5a4a\u593b\u5a53\u5a6d\u593f\u5a5a\u5a60\u5a5b\u5a48\u5a61\u5a4d\u5923\u5922\u5a5c\u5a43\u5a65\u5a67\u593e\u5a4f\u5934\u5924\u592e\u5a64\u5a44\u5a46\u5a59\u5a59\u5a4d\u5a79\u5939\u5937\u5a48\u5926\u5927\u5a4a\u5a5e\u5a67\u5922\u5a5a\u592f\u5931\u5922\u592a\u5922\u5924\u5924\u5926\u592f\u5934\u593b\u5a60\u5a44\u5a67\u5a59\u5a68\u593b\u5a51\u5a43\u5930\u5931\u5926\u593c\u5a64\u5932\u5a5d\u593a\u5939\u5926\u593e\u593e\u5a41\u593f\u5a4a\u5a4e\u5a54\u5a62\u592a\u593b\u5a4f\u5a65\u592e\u5a50\u5924\u5a6e\u5a51\u5a62\u5940\u5a60\u5a62\u5923\u5a60\u5921\u5922\u5a53\u5933\u5a42\u5a4f\u5930\u5a5e\u5a46\u5a54\u5930\u5a62\u5a4f\u5921\u5a68\u5a6e\u5924\u592d\u5a5b\u592e\u5a4a\u5934\u5a53\u5a59\u5a61\u5a57\u5a65\u5a43\u5925\u5a70\u593c\u5928\u5931\u5a4e\u5a4a\u5a46\u5a6e\u5a44\u5939\u5a4a\u5a52\u5a48\u5a5a\u5a51\u5a53\u5a62\u5a43\u593e\u593e\u5a70\u5924\u5a4d\u5a60\u5a5b\u5a59\u5a52\u5a42\u5a70\u5a57\u5a68\u5a68\u5923\u5a43\u5a48\u5a54\u5a53\u5a43\u5a67\u5921\u5a5a\u5a70\u5a6e\u5a5e\u593e\u5a5d\u5a5f\u5924\u5a57\u593d\u5a79\u5a4a\u5a4f\u5933\u5a59\u5a45\u5a50\u593d\u5a57\u5a52\u5923\u5921\u5a50\u5a46\u5933\u5a5c\u5940\u5937\u5932\u593c\u593e\u5a4d\u5930\u5a6d\u592e\u5a5d\u5933\u5a6d\u5a5a\u5926\u5a4e\u5930\u5932\u5928\u5a54\u5a4e\u5a45\u593b\u5a63\u5931\u5a4a\u5a64\u5a5e\u5923\u593b\u5a4d\u5925\u5a5e\u5a42\u5924\u5a41\u5927\u5a5c\u5a6f\u593f\u593c\u5a4f\u593a\u5a47\u5a70\u5a70\u5a54\u5a42\u5937\u5a50\u5a47\u592e\u593b\u5a5f\u5939\u5a4e\u5a43\u593a\u5a5a\u5a4f\u5a68\u5a5b\u5921\u593e\u5a46\u5a52\u5a48\u5930\u5a6e\u593b\u593c\u5a4e\u5a5a\u593b\u5a5a\u5a5f\u5930\u5a5f\u592a\u5a59\u5a64\u5940\u5a47\u5a70\u5a53\u5926\u5a5c\u5a62\u5a46\u5932\u5937\u5a64\u5a6f\u5a45\u5a64\u5a70\u5924\u5a46\u5921\u5a54\u5a5e\u592a\u5a45\u5926\u5a42\u5a62\u5a50\u5939\u5939\u5a54\u5922\u5a4e\u5a79\u5a5a\u5a41\u5a5c\u5a64\u5a5a\u5a4e\u5928\u5a61\u5934\u5a47\u5925\u5a44\u5a65\u5939\u5a51\u5931\u5a47\u5a52\u5928\u5a43\u5a52\u5a6d\u5a67\u5937\u5a60\u5a57\u5a48\u5a5a\u5a65\u5a41\u5a60\u5a61\u5a5b\u5925\u592d\u5a6d\u5931\u5a5c\u5a4d\u5926\u5927\u5a6d\u5a79\u592e\u593f\u593b\u5a5a\u5a5c\u5a63\u5a45\u5927\u5a65\u5a6e\u5a53\u5a59\u5a64\u5921\u5a5b\u593a\u5928\u5a51\u5a62\u5924\u5a54\u5a4e\u5a53\u5a57\u5a6d\u5939\u592e\u5a50\u5a5f\u5a61\u5a61\u5928\u5a60\u5a53\u5939\u5a67\u5a48\u5a64\u5a5f\u5a5f\u5a5c\u5928\u5a4e\u5921\u5a43\u5a65\u5a42\u5a5c\u5a4e\u5a61\u592e\u5a79\u5a6e\u5a62\u5926\u5931\u5926\u5a42\u5923\u5a64\u5a68\u5a5e\u5922\u5a59\u5a48\u5a5d\u592f\u5a6e\u5930\u5a50\u5933\u5a5e\u5a50\u5a4e\u5a5c\u593f\u5a46\u5a5d\u5934\u5925\u5a61\u593f\u5a5c\u5940\u5a59\u593a\u5a52\u5a5b\u5a53\u5924\u5932\u5a70\u5933\u5928\u5a67\u5a45\u5a67\u5a4e\u5932\u5a5b\u5933\u5a42\u592a\u5a61\u5a5e\u593c\u5a70\u593f\u5a50\u5a5f\u5a41\u593f\u5a4f\u5a68\u5930\u5a5a\u5937\u5921\u5a41\u5a67\u5a61\u5930\u5939\u5a46\u5a48\u5a5f\u5a5c\u5a53\u5928\u593c\u5a4e\u5a61\u5932\u593d\u5924\u592f\u5a59\u5930\u5a46\u5940\u592f\u5a60\u5a79\u5a6e\u5937\u5925\u5a61\u5a46\u5a5b\u5934\u5a5c\u5a79\u5a62\u593a\u5a70\u5921\u593e\u5a6f\u5a52\u5a44\u5a48\u5a67\u5a5a\u5926\u5a5f\u5a6e\u5a61\u593c\u5a6e\u5a5d\u5931\u5a6e\u5931\u5a4e\u5a43\u5a46\u5a60\u5926\u5a53\u5a4e\u5927\u5930\u593d\u5923\u5939\u5940\u5a68\u5a63\u5a5e\u5937\u5a68\u5a5f\u593c\u592d\u5a6b\u5a6b".toCharArray();
            for (int i = 0; i < 856; ++i) {
                int n3 = cArray[i];
                n3 -= 16816;
                n3 += 33041;
                n3 -= 50722;
                n3 ^= 0xA512;
                n3 ^= 0xF467;
                n3 += 50567;
                n3 -= 64073;
                n3 -= 36717;
                n3 += 8813;
                n3 -= 45677;
                n3 += 39390;
                cArray[i] = (char)(n3 += 14255);
            }
            object = kotakbaz.rain.client.render.texture.utils.gif.gif.B.A()[0] = new String(cArray);
        }
        objectArray[2] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.render.texture.utils.gif.gif.B.a(objectArray)).toCharArray();
        long l16 = l5;
        int n4 = -50;
        n4 -= -20;
        l5 = l16 ^ (0x26800000000L ^ l16) & -1L << (n4 += 62);
        long l17 = l12;
        int n5 = -31;
        n5 += 87;
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n5 -= 24);
        while (true) {
            int n6 = 90;
            n6 ^= 0x58;
            if ((int)l12 >= (int)(l5 >>> (n6 += 30))) break;
            int n7 = (int)l12;
            long l18 = l12;
            int n8 = 73;
            n8 += -119;
            int n9 = -84;
            n9 -= 38;
            l12 = l18 ^ (l18 ^ l18 + (long)(n8 ^= 0xFFFFFFD3)) & -1L >>> (n9 ^= 0xFFFFFFA6);
            long l19 = l8;
            int n10 = 14;
            n10 ^= 0x26;
            l8 = l19 ^ ((long)cArray[n7] ^ l19) & -1L >>> (n10 -= 8);
            int n11 = (int)l12;
            long l20 = l12;
            int n12 = 51;
            int n13 = 8;
            n13 ^= 0xFFFFFFDE;
            l12 = l20 ^ (l20 ^ l20 + (long)(n12 += -50)) & -1L >>> (n13 -= -74);
            int n14 = -135;
            n14 ^= 0xFFFFFFFF;
            long l21 = l9;
            int n15 = -75;
            n15 ^= 0x30;
            l9 = l21 ^ ((long)cArray[n11] << (n14 += -102) ^ l21) & -1L << (n15 ^= 0xFFFFFFA5);
            int n16 = 82;
            n16 -= -52;
            n16 += -118;
            int n17 = 104;
            n17 -= 118;
            long l22 = l11;
            int n18 = 18;
            n18 += 98;
            l11 = l22 ^ ((long)((int)l8 << n16 | (int)(l9 >>> (n17 -= -46))) ^ l22) & -1L >>> (n18 -= 84);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n19 = -27;
            n19 ^= 3;
            l13 = l23 ^ (0L ^ l23) & -1L << (n19 -= -58);
            while (true) {
                int n20 = 71;
                n20 += -52;
                if ((int)(l13 >>> (n20 += 13)) >= (int)l11) break;
                int n21 = -1;
                n21 ^= 0xFFFFFFEC;
                int n22 = 11;
                n22 -= 75;
                cArray2[(int)(l13 >>> (n21 += 13))] = cArray[(int)l12 + (int)(l13 >>> (n22 -= -96))];
                l13 += 0x100000000L;
            }
            int n23 = -29;
            n23 ^= 2;
            int n24 = (int)(l14 >>> (n23 -= -63));
            l14 += 0x100000000L;
            kotakbaz.rain.client.render.texture.utils.gif.gif.B.U[n24] = new String(cArray2);
            long l24 = l12;
            int n25 = -70;
            n25 -= -8;
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n25 -= -94);
        }
        int n26 = -176;
        n26 += 54;
        int[] nArray = new int[n26 -= -127];
        int n27 = 101;
        n27 += -97;
        int n28 = -58;
        n28 -= 9;
        nArray[n27 ^= 4] = n28 -= -75;
        int n29 = 62;
        n29 ^= 0xFFFFFFDD;
        int n30 = -158;
        n30 += 121;
        nArray[n29 += 30] = n30 += 45;
        int n31 = -114;
        n31 -= -9;
        int n32 = 26;
        n32 += 24;
        nArray[n31 -= -107] = n32 -= 46;
        int n33 = 98;
        n33 ^= 0x53;
        int n34 = 127;
        n34 += -37;
        nArray[n33 += -46] = n34 += -88;
        int n35 = -124;
        n35 ^= 0x30;
        int n36 = 112;
        n36 += -53;
        nArray[n35 ^= 0xFFFFFFB0] = n36 -= 60;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.n = nArray;
        int n37 = -109;
        int[] nArray2 = new int[n37 += 114];
        int n38 = -32;
        n38 ^= 0x40;
        int n39 = 70;
        n39 += -17;
        nArray2[n38 ^= 0xFFFFFFA0] = n39 ^= 0x35;
        int n40 = -59;
        n40 += 92;
        int n41 = 54;
        n41 -= -66;
        nArray2[n40 += -32] = n41 -= 116;
        int n42 = 142;
        n42 -= 36;
        int n43 = -121;
        n43 ^= 0xFFFFFF8D;
        nArray2[n42 -= 104] = n43 -= 8;
        int n44 = -130;
        n44 += 23;
        int n45 = 70;
        n45 -= 96;
        nArray2[n44 ^= 0xFFFFFF96] = n45 ^= 0xFFFFFFE7;
        int n46 = 115;
        n46 -= 68;
        int n47 = 34;
        n47 ^= 0x65;
        nArray2[n46 += -43] = n47 -= 72;
        N = nArray2;
        u = null;
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[1];
        String string = (String)object[2];
        object = object[0];
        Object[] objectArray = w;
        if (w == null) {
            objectArray = w = new Object[1];
        }
        if ((object2 = objectArray[n]) == null) {
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
                Object object4 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u605a\u6060\u6065\u605e\u6064\u66b0\u6051\u6787\u606e\u6782\u6062\u669b\u678f\u678d\u605d\u6062\u606f\u66bf".toCharArray();
                    for (int i = 0; i < 18; ++i) {
                        int n2 = cArray[i];
                        n2 ^= 0xA381;
                        n2 += 40305;
                        n2 ^= 0x9F91;
                        n2 ^= 0x24E4;
                        n2 -= 11592;
                        n2 += 51739;
                        n2 -= 55995;
                        n2 += 60972;
                        n2 -= 3772;
                        n2 += 63037;
                        cArray[i] = (char)(n2 ^= 0x71AE);
                    }
                    object4 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.A()[1] = new String(cArray);
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
                Object object5 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ud6cd\ud6f9\ud65f".toCharArray();
                    for (int i = 0; i < 3; ++i) {
                        int n3 = cArray[i];
                        n3 += 48562;
                        n3 -= 9475;
                        n3 -= 30932;
                        n3 ^= 0x294;
                        n3 ^= 0xBAC6;
                        n3 ^= 0xA037;
                        n3 -= 36520;
                        n3 += 2777;
                        n3 ^= 0x357C;
                        n3 ^= 0x4AAD;
                        cArray[i] = (char)(n3 -= 5358);
                    }
                    object5 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.A()[2] = new String(cArray);
                }
                V = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.A()[3];
            if (object6 == null) {
                char[] cArray = "\ub1ab\ub1af\ub1a1\ub1dd\ub1b1\ub1b2\ub1b1\ub1dd\ub19c\ub1a9\ub1b1\ub1a1\ub1bf\ub19c\ub18b\ub190\ub190\ub183\ub19e\ub185".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 += 35088;
                    n4 -= 53378;
                    n4 -= 23939;
                    n4 -= 996;
                    n4 -= 43652;
                    n4 -= 54486;
                    n4 ^= 0x90E8;
                    n4 ^= 0xCADC;
                    n4 -= 24894;
                    cArray[i] = (char)(n4 ^= 0x724F);
                }
                object6 = kotakbaz.rain.client.render.texture.utils.gif.gif.B.A()[3] = new String(cArray);
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
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xC11C ^ 0xC10F] = 0xC168 ^ 0xC10F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xC343 ^ 0xC31B] = 0xFFFF3CE3 ^ 0xC31B;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x23DF ^ 0x2336] = 0x235A ^ 0x2336;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x125A ^ 0x1344] = 0x1302 ^ 0x1344;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x2479 ^ 0x253C] = 0xFFFFDADA ^ 0x253C;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x961A ^ 0x96AB] = 0x96A0 ^ 0x96AB;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7E9F ^ 0x7E62] = 0xFFFF81FD ^ 0x7E62;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x116A ^ 0x105D] = 0x1063 ^ 0x105D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x5917 ^ 0x5928] = 0xFFFFA6F3 ^ 0x5928;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF7A2 ^ 0xF6AC] = 0xFFFF095D ^ 0xF6AC;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xD135 ^ 0xD175] = 0xFFFF2E88 ^ 0xD175;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x43FF ^ 0x4388] = 0x43D3 ^ 0x4388;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x8A7D ^ 0x8A00] = 0xFFFF75C4 ^ 0x8A00;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xCCC2 ^ 0xCC89] = 0xFFFF3359 ^ 0xCC89;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xCCA6 ^ 0xCC90] = 0xCCA0 ^ 0xCC90;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3583 ^ 0x351B] = 0xFFFFCAE1 ^ 0x351B;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF9CB ^ 0xF96C] = 0xF903 ^ 0xF96C;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x49F ^ 0x5C0] = 0x5DF ^ 0x5C0;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x9C7D ^ 0x9CE8] = 0xFFFF631C ^ 0x9CE8;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xBFB6 ^ 0xBF69] = 0xFFFF4093 ^ 0xBF69;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xB76C ^ 0xB617] = 0xFFFF499C ^ 0xB617;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xCB8 ^ 0xD9E] = 0xFFFFF242 ^ 0xD9E;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xEA3D ^ 0xEA3E] = 0xEA26 ^ 0xEA3E;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x1728 ^ 0x17D1] = 0x17CC ^ 0x17D1;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x255B ^ 0x2452] = 0x2424 ^ 0x2452;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xBB43 ^ 0xBBAD] = 0xFFFF4454 ^ 0xBBAD;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x2C50 ^ 0x2C8D] = 0xFFFFD349 ^ 0x2C8D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xC6C2 ^ 0xC79C] = 0xFFFF3865 ^ 0xC79C;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xC192 ^ 0xC0BC] = 0xC0F1 ^ 0xC0BC;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x6177 ^ 0x61D8] = 0x61C2 ^ 0x61D8;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xC440 ^ 0xC46A] = 0xC479 ^ 0xC46A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xCCD8 ^ 0xCCB4] = 0xFFFF336B ^ 0xCCB4;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xAA2C ^ 0xAA55] = 0xAA67 ^ 0xAA55;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x5336 ^ 0x523C] = 0x526B ^ 0x523C;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x5E17 ^ 0x5F5D] = 0x5F58 ^ 0x5F5D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xE906 ^ 0xE9E6] = 0xE9D1 ^ 0xE9E6;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xBAAC ^ 0xBB2C] = 0xFFFF4484 ^ 0xBB2C;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7D64 ^ 0x7C2A] = 0xFFFF83DD ^ 0x7C2A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x10DFE ^ 0x10CAE] = 0x10C20 ^ 0x10CAE;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x5033 ^ 0x517B] = 0x512F ^ 0x517B;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x2C87 ^ 0x2C7F] = 0xFFFFD39E ^ 0x2C7F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3BDD ^ 0x3B81] = 0x3BE8 ^ 0x3B81;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xADA9 ^ 0xADD3] = 0xADDD ^ 0xADD3;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xC223 ^ 0xC27C] = 0xFFFF3DA9 ^ 0xC27C;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x10FD3 ^ 0x10F16] = 0x10F5E ^ 0x10F16;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xBD43 ^ 0xBC37] = 0xFFFF4354 ^ 0xBC37;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x6F3D ^ 0x6FC9] = 0x6FF0 ^ 0x6FC9;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xCAB9 ^ 0xCA1C] = 0xCA05 ^ 0xCA1C;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x762C ^ 0x7695] = 0x768B ^ 0x7695;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xE4CD ^ 0xE464] = 0xE413 ^ 0xE464;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x64D5 ^ 0x642B] = 0xFFFF9B8A ^ 0x642B;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x9155 ^ 0x918E] = 0x913C ^ 0x918E;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xD68B ^ 0xD61C] = 0xFFFF29A2 ^ 0xD61C;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x30D3 ^ 0x305D] = 0xFFFFCFD0 ^ 0x305D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3FDD ^ 0x3E52] = 0x3E33 ^ 0x3E52;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x10292 ^ 0x1024E] = 0x10218 ^ 0x1024E;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xC5BE ^ 0xC5DB] = 0xC5A1 ^ 0xC5DB;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x1DC3 ^ 0x1D89] = 0xFFFFE210 ^ 0x1D89;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x6475 ^ 0x64D4] = 0x64AD ^ 0x64D4;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xD344 ^ 0xD22F] = 0xD21C ^ 0xD22F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x1469 ^ 0x148D] = 0xFFFFEB50 ^ 0x148D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x9502 ^ 0x944B] = 0xFFFF6BBC ^ 0x944B;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x5429 ^ 0x5482] = 0x54ED ^ 0x5482;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x8907 ^ 0x888D] = 0xFFFF7730 ^ 0x888D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3004 ^ 0x3152] = 0xFFFFCEBF ^ 0x3152;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xD806 ^ 0xD915] = 0xFFFF26E0 ^ 0xD915;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x26F3 ^ 0x260F] = 0x2653 ^ 0x260F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x9BCA ^ 0x9B21] = 0x9B3A ^ 0x9B21;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x1277 ^ 0x1377] = 0x1301 ^ 0x1377;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x94C2 ^ 0x95E3] = 0xFFFF6A55 ^ 0x95E3;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x928F ^ 0x9287] = 0xFFFF6D05 ^ 0x9287;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7E8B ^ 0x7E1A] = 0x7E7B ^ 0x7E1A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x387C ^ 0x38BF] = 0xFFFFC749 ^ 0x38BF;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x53E5 ^ 0x5323] = 0xFFFFAC9A ^ 0x5323;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xBE37 ^ 0xBED4] = 0xFFFF4136 ^ 0xBED4;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x9CD9 ^ 0x9CBA] = 0x9C36 ^ 0x9CBA;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x1C08 ^ 0x1C5A] = 0xFFFFE3B1 ^ 0x1C5A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xA301 ^ 0xA217] = 0xFFFF5D93 ^ 0xA217;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xE06D ^ 0xE08C] = 0xE0D5 ^ 0xE08C;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xB42D ^ 0xB522] = 0xB502 ^ 0xB522;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF99 ^ 0xED6] = 0xFFFFF102 ^ 0xED6;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x1C86 ^ 0x1CDB] = 0xFFFFE331 ^ 0x1CDB;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x9A98 ^ 0x9ADC] = 0xFFFF651E ^ 0x9ADC;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xBB25 ^ 0xBB0A] = 0xBB7D ^ 0xBB0A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xC4A3 ^ 0xC413] = 0xC41F ^ 0xC413;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x9BA ^ 0x9B5] = 0x99A ^ 0x9B5;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x10FC4 ^ 0x10F15] = 0x10F03 ^ 0x10F15;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xFF12 ^ 0xFF5B] = 0xFFFF00D5 ^ 0xFF5B;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x8A66 ^ 0x8A21] = 0x8A2A ^ 0x8A21;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x258C ^ 0x2589] = 0x25E5 ^ 0x2589;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x41BA ^ 0x41D5] = 0x418C ^ 0x41D5;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF3 ^ 0x1D3] = 0x1E7 ^ 0x1D3;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x794A ^ 0x780B] = 0x7899 ^ 0x780B;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x4FA6 ^ 0x4F7C] = 0x4F07 ^ 0x4F7C;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x97C ^ 0x81B] = 0xFFFFF7AA ^ 0x81B;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x4B6 ^ 0x5CF] = 0xFFFFFA7A ^ 0x5CF;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xBC91 ^ 0xBCA2] = 0xBCED ^ 0xBCA2;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x384F ^ 0x3916] = 0x3972 ^ 0x3916;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xDA30 ^ 0xDA69] = 0xFFFF25B1 ^ 0xDA69;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xFC90 ^ 0xFD1E] = 0xFD71 ^ 0xFD1E;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xC762 ^ 0xC769] = 0xC73F ^ 0xC769;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xBBC0 ^ 0xBBA2] = 0xBBCE ^ 0xBBA2;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x6D15 ^ 0x6C27] = 0xFFFF939A ^ 0x6C27;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x5EA0 ^ 0x5E77] = 0xFFFFA1E6 ^ 0x5E77;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xAAF ^ 0xBAC] = 0xFFFFF44E ^ 0xBAC;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7802 ^ 0x781E] = 0x784A ^ 0x781E;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3D1D ^ 0x3C37] = 0x3C3B ^ 0x3C37;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF1E ^ 0xE16] = 0xE38 ^ 0xE16;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xA349 ^ 0xA37B] = 0xFFFF5CF0 ^ 0xA37B;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF047 ^ 0xF07B] = 0xFFFF0F99 ^ 0xF07B;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xAB2D ^ 0xAB5D] = 0xAB6E ^ 0xAB5D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x8D47 ^ 0x8CCF] = 0xFFFF736C ^ 0x8CCF;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF0CB ^ 0xF1B9] = 0xFFFF0E67 ^ 0xF1B9;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x43C1 ^ 0x430A] = 0xFFFFBCE6 ^ 0x430A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF05C ^ 0xF007] = 0xFFFF0FAD ^ 0xF007;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7306 ^ 0x73D3] = 0xFFFF8C9A ^ 0x73D3;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x62B2 ^ 0x6387] = 0x632E ^ 0x6387;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x5877 ^ 0x5963] = 0xFFFFA65E ^ 0x5963;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x105E5 ^ 0x1056A] = 0xFFFEFA92 ^ 0x1056A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x26 ^ 0x52] = 0x78 ^ 0x52;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xE33 ^ 0xF61] = 0xF6B ^ 0xF61;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xA64A ^ 0xA6E6] = 0xA69D ^ 0xA6E6;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x35DA ^ 0x35AC] = 0x359E ^ 0x35AC;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x2E4A ^ 0x2F2F] = 0xFFFFD0B4 ^ 0x2F2F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF2C3 ^ 0xF24A] = 0xF266 ^ 0xF24A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x961B ^ 0x9698] = 0xFFFF697A ^ 0x9698;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x10CDA ^ 0x10CA6] = 0x10CF1 ^ 0x10CA6;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x68AB ^ 0x68CD] = 0xFFFF9766 ^ 0x68CD;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x10183 ^ 0x100F3] = 0xFFFEFF7A ^ 0x100F3;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xDE1C ^ 0xDE76] = 0xDE31 ^ 0xDE76;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x1486 ^ 0x14C7] = 0xFFFFEB1F ^ 0x14C7;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xAF21 ^ 0xAE70] = 0xFFFF51EC ^ 0xAE70;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x6A79 ^ 0x6ACF] = 0xFFFF957A ^ 0x6ACF;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xFD93 ^ 0xFCFA] = 0xFCA9 ^ 0xFCFA;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xE9CD ^ 0xE9AA] = 0xE9A0 ^ 0xE9AA;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x10C82 ^ 0x10CEC] = 0xFFFEF35B ^ 0x10CEC;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3DCA ^ 0x3DFA] = 0x3D42 ^ 0x3DFA;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x2607 ^ 0x261A] = 0xFFFFD98C ^ 0x261A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xE723 ^ 0xE738] = 0xFFFF18D1 ^ 0xE738;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x2F2C ^ 0x2F6A] = 0xFFFFD08F ^ 0x2F6A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x4FFF ^ 0x4F6C] = 0x4FE8 ^ 0x4F6C;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x2AF0 ^ 0x2A0F] = 0x2A10 ^ 0x2A0F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x8823 ^ 0x89A7] = 0x89DE ^ 0x89A7;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xD5AF ^ 0xD5F8] = 0xFFFF2A08 ^ 0xD5F8;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x985B ^ 0x9894] = 0xFFFF6760 ^ 0x9894;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3149 ^ 0x31C9] = 0x318D ^ 0x31C9;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7DBA ^ 0x7DAC] = 0x7DF5 ^ 0x7DAC;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xFC5C ^ 0xFD17] = 0xFFFF02C9 ^ 0xFD17;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x935E ^ 0x9268] = 0xFFFF6DFE ^ 0x9268;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xE775 ^ 0xE7E1] = 0xFFFF1849 ^ 0xE7E1;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xD0E1 ^ 0xD1D1] = 0xD188 ^ 0xD1D1;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3E65 ^ 0x3E34] = 0xFFFFC1E9 ^ 0x3E34;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xB7F1 ^ 0xB6F0] = 0xB6B8 ^ 0xB6F0;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7A63 ^ 0x7ADE] = 0x7AB7 ^ 0x7ADE;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x10246 ^ 0x10259] = 0x1020E ^ 0x10259;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x233 ^ 0x2A8] = 0x29D ^ 0x2A8;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF861 ^ 0xF805] = 0xF837 ^ 0xF805;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF7C3 ^ 0xF713] = 0xF751 ^ 0xF713;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x174D ^ 0x1755] = 0xFFFFE888 ^ 0x1755;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x9019 ^ 0x911D] = 0xFFFF6E9F ^ 0x911D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xCD24 ^ 0xCD10] = 0xCD53 ^ 0xCD10;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x2568 ^ 0x25F4] = 0x25CC ^ 0x25F4;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3D43 ^ 0x3C7A] = 0xFFFFC384 ^ 0x3C7A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x5BC8 ^ 0x5AD5] = 0xFFFFA55B ^ 0x5AD5;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x4417 ^ 0x4441] = 0xFFFFBBC7 ^ 0x4441;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x2D02 ^ 0x2DAA] = 0xFFFFD22A ^ 0x2DAA;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xD871 ^ 0xD8DF] = 0xFFFF2731 ^ 0xD8DF;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x6161 ^ 0x616F] = 0xFFFF9E83 ^ 0x616F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xCA8B ^ 0xCA55] = 0xCA08 ^ 0xCA55;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x9BEA ^ 0x9BAF] = 0xFFFF645E ^ 0x9BAF;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x4780 ^ 0x47D5] = 0x47A5 ^ 0x47D5;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3D59 ^ 0x3CD4] = 0xFFFFC315 ^ 0x3CD4;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xFDE6 ^ 0xFCC4] = 0xFCBE ^ 0xFCC4;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3437 ^ 0x348C] = 0xFFFFCB37 ^ 0x348C;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x10B5B ^ 0x10BA8] = 0x10BEF ^ 0x10BA8;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xD11B ^ 0xD102] = 0xFFFF2EE5 ^ 0xD102;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x104D4 ^ 0x105CD] = 0x105FB ^ 0x105CD;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x76D8 ^ 0x765F] = 0xFFFF89AD ^ 0x765F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x10D ^ 0x56] = 0x6A ^ 0x56;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xA73C ^ 0xA771] = 0xFFFF5898 ^ 0xA771;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF3B ^ 0xF01] = 0xF74 ^ 0xF01;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7DAA ^ 0x7D89] = 0xFFFF8239 ^ 0x7D89;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xADA4 ^ 0xAD5F] = 0xAD51 ^ 0xAD5F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xEF94 ^ 0xEF0D] = 0xEF1D ^ 0xEF0D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x2CF4 ^ 0x2DB9] = 0xFFFFD252 ^ 0x2DB9;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xB7FC ^ 0xB783] = 0xB7C3 ^ 0xB783;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF820 ^ 0xF95A] = 0xF953 ^ 0xF95A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x2704 ^ 0x27B1] = 0x2799 ^ 0x27B1;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x9246 ^ 0x92F2] = 0x9289 ^ 0x92F2;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x113A ^ 0x116E] = 0xFFFFEEB8 ^ 0x116E;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xE974 ^ 0xE879] = 0xE847 ^ 0xE879;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x42BB ^ 0x420C] = 0x4229 ^ 0x420C;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xE138 ^ 0xE034] = 0xE051 ^ 0xE034;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x5FFF ^ 0x5F45] = 0xFFFFA0BB ^ 0x5F45;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xAB79 ^ 0xAA7F] = 0xAA2E ^ 0xAA7F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x44C1 ^ 0x445F] = 0x4463 ^ 0x445F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x5A06 ^ 0x5B6A] = 0x5B7A ^ 0x5B6A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x53AF ^ 0x533F] = 0xFFFFAC84 ^ 0x533F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x919D ^ 0x9100] = 0xFFFF6E8D ^ 0x9100;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xB10A ^ 0xB049] = 0xFFFF4FAA ^ 0xB049;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF790 ^ 0xF7AD] = 0xFFFF0873 ^ 0xF7AD;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xCF84 ^ 0xCE83] = 0xCEA6 ^ 0xCE83;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xBD7D ^ 0xBC13] = 0xBC71 ^ 0xBC13;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xCAA8 ^ 0xCB23] = 0xFFFF34EF ^ 0xCB23;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x48BC ^ 0x49D4] = 0x490E ^ 0x49D4;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7074 ^ 0x71F3] = 0xFFFF8E10 ^ 0x71F3;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xA14D ^ 0xA1EE] = 0xA1C6 ^ 0xA1EE;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x1D9E ^ 0x1D84] = 0x1DB8 ^ 0x1D84;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7A81 ^ 0x7AA4] = 0x7AC4 ^ 0x7AA4;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xDB3F ^ 0xDB1E] = 0xDB37 ^ 0xDB1E;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xBAD1 ^ 0xBAE0] = 0xBAA3 ^ 0xBAE0;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x1165 ^ 0x11D6] = 0xFFFFEE71 ^ 0x11D6;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x2515 ^ 0x2421] = 0x245B ^ 0x2421;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x4070 ^ 0x4005] = 0xFFFFBF92 ^ 0x4005;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7AA1 ^ 0x7A44] = 0xFFFF85AA ^ 0x7A44;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF0A0 ^ 0xF1CD] = 0xFFFF0E30 ^ 0xF1CD;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x46 ^ 0x84] = 0xD9 ^ 0x84;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x10FF ^ 0x11CE] = 0x1185 ^ 0x11CE;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF09C ^ 0xF0A4] = 0xFFFF0F64 ^ 0xF0A4;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x383A ^ 0x382D] = 0x3867 ^ 0x382D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x91E5 ^ 0x90BF] = 0xFFFF6F02 ^ 0x90BF;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7078 ^ 0x70BC] = 0x70CE ^ 0x70BC;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xEE10 ^ 0xEE62] = 0xEE77 ^ 0xEE62;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xDD5A ^ 0xDC72] = 0xFFFF2385 ^ 0xDC72;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x1014E ^ 0x10186] = 0xFFFEFE7F ^ 0x10186;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x8C8F ^ 0x8C67] = 0xFFFF739A ^ 0x8C67;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x1CC1 ^ 0x1C61] = 0xFFFFE3D9 ^ 0x1C61;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x4D61 ^ 0x4DFE] = 0xFFFFB22F ^ 0x4DFE;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3159 ^ 0x3138] = 0x3149 ^ 0x3138;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x6CE5 ^ 0x6C22] = 0x6C42 ^ 0x6C22;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xD081 ^ 0xD1BC] = 0xD1E2 ^ 0xD1BC;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x363D ^ 0x3712] = 0x3708 ^ 0x3712;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3534 ^ 0x3431] = 0x3544 ^ 0x3431;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7F19 ^ 0x7FE3] = 0x7FE8 ^ 0x7FE3;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x2945 ^ 0x2950] = 0x2943 ^ 0x2950;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7DF8 ^ 0x7D73] = 0xFFFF829C ^ 0x7D73;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x4B01 ^ 0x4B06] = 0xFFFFB4CA ^ 0x4B06;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x8B15 ^ 0x8A4D] = 0xFFFF75BC ^ 0x8A4D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x31E ^ 0x27D] = 0x227 ^ 0x27D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x6B18 ^ 0x6B4B] = 0xFFFF9499 ^ 0x6B4B;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x9B41 ^ 0x9B7F] = 0xFFFF649F ^ 0x9B7F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7F3B ^ 0x7F9D] = 0xFFFF8057 ^ 0x7F9D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xE59D ^ 0xE49F] = 0xE4FF ^ 0xE49F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x5F50 ^ 0x5F5A] = 0x5F2F ^ 0x5F5A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xCF5C ^ 0xCF88] = 0xFFFF301F ^ 0xCF88;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xCA6 ^ 0xD25] = 0xFFFFF2E6 ^ 0xD25;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xFF31 ^ 0xFE24] = 0xFFFF019A ^ 0xFE24;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xA7DA ^ 0xA77E] = 0xA730 ^ 0xA77E;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x58D ^ 0x55B] = 0xFFFFFA9D ^ 0x55B;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x5DDE ^ 0x5DF5] = 0xFFFFA240 ^ 0x5DF5;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3294 ^ 0x327E] = 0x3229 ^ 0x327E;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x21FE ^ 0x21BD] = 0x21C4 ^ 0x21BD;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3996 ^ 0x399F] = 0x39AB ^ 0x399F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xB1F5 ^ 0xB08D] = 0xFFFF4F32 ^ 0xB08D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x21CC ^ 0x21A4] = 0xFFFFDE25 ^ 0x21A4;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xFC42 ^ 0xFD7A] = 0xFFFF02FA ^ 0xFD7A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x700F ^ 0x7126] = 0x7177 ^ 0x7126;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7EFB ^ 0x7EB7] = 0xFFFF8148 ^ 0x7EB7;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x8A48 ^ 0x8BCD] = 0x8BD1 ^ 0x8BCD;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x47EA ^ 0x4781] = 0x479C ^ 0x4781;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x10711 ^ 0x10741] = 0x1072E ^ 0x10741;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x2971 ^ 0x2959] = 0x2936 ^ 0x2959;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x8685 ^ 0x8685] = 0x86B0 ^ 0x8685;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x9FBB ^ 0x9F05] = 0xFFFF609D ^ 0x9F05;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x1311 ^ 0x122E] = 0x126E ^ 0x122E;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xE662 ^ 0xE75E] = 0xE772 ^ 0xE75E;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF160 ^ 0xF071] = 0xFFFF0FF5 ^ 0xF071;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x4169 ^ 0x4016] = 0xFFFFBFAE ^ 0x4016;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xFAFF ^ 0xFBBD] = 0xFBE8 ^ 0xFBBD;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x5093 ^ 0x50ED] = 0x5068 ^ 0x50ED;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xFE63 ^ 0xFE18] = 0xFFFF01FE ^ 0xFE18;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xEC02 ^ 0xED6D] = 0xFFFF12A6 ^ 0xED6D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x10E7D ^ 0x10E6C] = 0x10E35 ^ 0x10E6C;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xD38A ^ 0xD3A6] = 0xD3FC ^ 0xD3A6;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xD94E ^ 0xD942] = 0xFFFF26CD ^ 0xD942;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xB06C ^ 0xB0D0] = 0xFFFF4F49 ^ 0xB0D0;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3E05 ^ 0x3EF3] = 0x3EC8 ^ 0x3EF3;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x4ABE ^ 0x4A7E] = 0x4A71 ^ 0x4A7E;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x320D ^ 0x3336] = 0x3364 ^ 0x3336;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xB4FA ^ 0xB5BA] = 0xFFFF4A58 ^ 0xB5BA;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xD1EC ^ 0xD0C9] = 0xD0A6 ^ 0xD0C9;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF309 ^ 0xF33E] = 0xFFFF0C8A ^ 0xF33E;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xB3FA ^ 0xB315] = 0xB328 ^ 0xB315;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x8422 ^ 0x857E] = 0x85E4 ^ 0x857E;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF0A0 ^ 0xF1D6] = 0xFFFF0E64 ^ 0xF1D6;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF8DD ^ 0xF9F9] = 0xF9E2 ^ 0xF9F9;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x2C32 ^ 0x2C7C] = 0xFFFFD30D ^ 0x2C7C;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x4B25 ^ 0x4A58] = 0x4A4E ^ 0x4A58;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x4277 ^ 0x42D5] = 0x42F0 ^ 0x42D5;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x30E5 ^ 0x31FA] = 0xFFFFCE4A ^ 0x31FA;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x107C2 ^ 0x106A4] = 0x106AE ^ 0x106A4;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xC2F ^ 0xC3F] = 0xFFFFF3E9 ^ 0xC3F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x1A4A ^ 0x1A80] = 0x1AF1 ^ 0x1A80;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x4449 ^ 0x446B] = 0x440D ^ 0x446B;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x6735 ^ 0x67C4] = 0xFFFF9857 ^ 0x67C4;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x8DD6 ^ 0x8DD0] = 0x8D9D ^ 0x8DD0;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xA522 ^ 0xA56A] = 0xA542 ^ 0xA56A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7147 ^ 0x7026] = 0xFFFF8FEE ^ 0x7026;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x233D ^ 0x2306] = 0xFFFFDCC0 ^ 0x2306;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xEC61 ^ 0xED7B] = 0xFFFF12E2 ^ 0xED7B;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x447D ^ 0x451D] = 0xFFFFBAD4 ^ 0x451D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xA9B6 ^ 0xA8A4] = 0xA8D7 ^ 0xA8A4;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xB7D2 ^ 0xB788] = 0xB717 ^ 0xB788;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xFB43 ^ 0xFB23] = 0xFFFF04DF ^ 0xFB23;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x32EC ^ 0x3201] = 0xFFFFCDDD ^ 0x3201;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xE3BD ^ 0xE2E9] = 0xFFFF1D37 ^ 0xE2E9;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7111 ^ 0x7162] = 0x7177 ^ 0x7162;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x87C1 ^ 0x87E1] = 0x87DA ^ 0x87E1;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF621 ^ 0xF7A7] = 0xF73D ^ 0xF7A7;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xE126 ^ 0xE10F] = 0xE130 ^ 0xE10F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF42F ^ 0xF4FD] = 0xFFFF0BBF ^ 0xF4FD;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x54BF ^ 0x5593] = 0xFFFFAAC0 ^ 0x5593;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x669E ^ 0x664D] = 0x6638 ^ 0x664D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7D4A ^ 0x7D92] = 0xFFFF82A3 ^ 0x7D92;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF132 ^ 0xF1F3] = 0xFFFF0E58 ^ 0xF1F3;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x2460 ^ 0x2418] = 0xFFFFDBD8 ^ 0x2418;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x52 ^ 0x123] = 0x11D ^ 0x123;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x612E ^ 0x607D] = 0xFFFF9FD6 ^ 0x607D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x584A ^ 0x5887] = 0x58F5 ^ 0x5887;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x9EB ^ 0x8FC] = 0x8B6 ^ 0x8FC;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xEE3C ^ 0xEF42] = 0xFFFF10ED ^ 0xEF42;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x87EA ^ 0x87E7] = 0x8784 ^ 0x87E7;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xDD4E ^ 0xDDA2] = 0xDDCE ^ 0xDDA2;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x9808 ^ 0x993B] = 0x9908 ^ 0x993B;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xFC28 ^ 0xFD54] = 0xFD0A ^ 0xFD54;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF40D ^ 0xF4B2] = 0xF4AD ^ 0xF4B2;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xC69B ^ 0xC685] = 0xFFFF39E8 ^ 0xC685;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x9455 ^ 0x94D4] = 0xFFFF6B11 ^ 0x94D4;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x1BB9 ^ 0x1AA1] = 0xFFFFE57D ^ 0x1AA1;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7122 ^ 0x716D] = 0xFFFF8E93 ^ 0x716D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x8B3C ^ 0x8BF2] = 0xFFFF741E ^ 0x8BF2;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x4345 ^ 0x4368] = 0xFFFFBC96 ^ 0x4368;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x8F15 ^ 0x8E32] = 0xFFFF71C9 ^ 0x8E32;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xB776 ^ 0xB762] = 0xB73E ^ 0xB762;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x5C4D ^ 0x5D2F] = 0x5D1D ^ 0x5D2F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3138 ^ 0x31BE] = 0xFFFFCE0D ^ 0x31BE;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x76EC ^ 0x76C2] = 0x76B6 ^ 0x76C2;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xD4C8 ^ 0xD42F] = 0xD466 ^ 0xD42F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xB15F ^ 0xB054] = 0xB0F0 ^ 0xB054;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xB3FC ^ 0xB2BA] = 0xFFFF4D5A ^ 0xB2BA;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3661 ^ 0x3687] = 0xFFFFC96C ^ 0x3687;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x5065 ^ 0x5092] = 0xFFFFAF54 ^ 0x5092;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x2AD5 ^ 0x2A51] = 0xFFFFD5A1 ^ 0x2A51;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x31E9 ^ 0x306B] = 0xFFFFCFD9 ^ 0x306B;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7512 ^ 0x7428] = 0x7476 ^ 0x7428;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3F44 ^ 0x3FE9] = 0x3FC5 ^ 0x3FE9;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x4128 ^ 0x41E1] = 0x4144 ^ 0x41E1;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x459C ^ 0x450E] = 0xFFFFBAB4 ^ 0x450E;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xD846 ^ 0xD965] = 0xFFFF26F3 ^ 0xD965;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xD0D1 ^ 0xD033] = 0xD064 ^ 0xD033;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF5BF ^ 0xF5AD] = 0xF56E ^ 0xF5AD;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x859F ^ 0x84FB] = 0x8497 ^ 0x84FB;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x444A ^ 0x4423] = 0xFFFFBBD5 ^ 0x4423;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xE1F ^ 0xE2A] = 0xE33 ^ 0xE2A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7FA8 ^ 0x7EEF] = 0xFFFF813A ^ 0x7EEF;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x9FC9 ^ 0x9ED9] = 0xFFFF6110 ^ 0x9ED9;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x344B ^ 0x353C] = 0x351E ^ 0x353C;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x14B8 ^ 0x1474] = 0x1432 ^ 0x1474;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x66AC ^ 0x6614] = 0xFFFF99D9 ^ 0x6614;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7E77 ^ 0x7F04] = 0xFFFF80E0 ^ 0x7F04;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xCB0A ^ 0xCBFA] = 0xCBA8 ^ 0xCBFA;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xDF ^ 0x9D] = 0x7FFFFF59 ^ 0x9D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x10516 ^ 0x10463] = 0x10433 ^ 0x10463;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x8FC0 ^ 0x8F35] = 0x8F6B ^ 0x8F35;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x8F7 ^ 0x87F] = 0x845 ^ 0x87F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x9FE8 ^ 0x9ED6] = 0x9ED4 ^ 0x9ED6;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xEB3D ^ 0xEA6A] = 0xEA5F ^ 0xEA6A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x142E ^ 0x156A] = 0xFFFFEAB0 ^ 0x156A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF89F ^ 0xF9F5] = 0xF99C ^ 0xF9F5;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x51E9 ^ 0x51EB] = 0xFFFFAE1B ^ 0x51EB;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x1360 ^ 0x127B] = 0xFFFFEDCF ^ 0x127B;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xE931 ^ 0xE81C] = 0xFFFF1784 ^ 0xE81C;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x10FAF ^ 0x10E23] = 0x10E72 ^ 0x10E23;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xAA27 ^ 0xAA00] = 0xAA50 ^ 0xAA00;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x5B1F ^ 0x5A42] = 0x5A32 ^ 0x5A42;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x573B ^ 0x5791] = 0xFFFFA864 ^ 0x5791;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x438A ^ 0x4203] = 0x422C ^ 0x4203;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x7FDE ^ 0x7FE7] = 0xFFFF8037 ^ 0x7FE7;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x10833 ^ 0x108C1] = 0xFFFEF760 ^ 0x108C1;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF5A ^ 0xF5B] = 0xF7E ^ 0xF5B;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x5289 ^ 0x5213] = 0xFFFFADCF ^ 0x5213;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xFA88 ^ 0xFBDD] = 0xFBAB ^ 0xFBDD;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xC39 ^ 0xC3D] = 0xFFFFF390 ^ 0xC3D;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x44DD ^ 0x4591] = 0x4596 ^ 0x4591;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x282E ^ 0x28AB] = 0xFFFFD715 ^ 0x28AB;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x501 ^ 0x42A] = 0x457 ^ 0x42A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x211B ^ 0x2197] = 0xFFFFDE69 ^ 0x2197;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xFC08 ^ 0xFC79] = 0xFFFF03A2 ^ 0xFC79;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xF601 ^ 0xF68B] = 0xF69B ^ 0xF68B;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x67E5 ^ 0x66F9] = 0x66E7 ^ 0x66F9;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x432A ^ 0x4398] = 0xFFFFBC14 ^ 0x4398;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xD7CC ^ 0xD7EA] = 0xFFFF2853 ^ 0xD7EA;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x5FA9 ^ 0x5E28] = 0x5E3E ^ 0x5E28;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xCAFE ^ 0xCA68] = 0xFFFF35F0 ^ 0xCA68;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3E31 ^ 0x3E6F] = 0xFFFFC19A ^ 0x3E6F;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x342 ^ 0x39B] = 0xFFFFFC31 ^ 0x39B;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x3518 ^ 0x3575] = 0x3515 ^ 0x3575;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x63BE ^ 0x639A] = 0x63BC ^ 0x639A;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0xC934 ^ 0xC9B9] = 0xFFFF363D ^ 0xC9B9;
        kotakbaz.rain.client.render.texture.utils.gif.gif.B.x[0x6FE ^ 0x67C] = 0x65A ^ 0x67C;
    }
}

