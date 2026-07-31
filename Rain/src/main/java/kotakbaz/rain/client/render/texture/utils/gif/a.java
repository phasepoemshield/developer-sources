/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.texture.utils.gif;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.stream.ImageInputStream;
import kotakbaz.rain.client.render.texture.utils.gif.gif.A;
import kotakbaz.rain.client.render.texture.utils.gif.gif.a_0;
import kotakbaz.rain.client.render.texture.utils.gif.gif.b_0;

public class a {
    public static int[] A;

    public static kotakbaz.rain.client.render.texture.utils.gif.a_0 decompileFull(ImageInputStream inputStream) {
        ArrayList<BufferedImage> arrayList = new ArrayList<BufferedImage>();
        kotakbaz.rain.client.render.texture.utils.gif.a_0 a_02 = a.decompileDeltas(inputStream);
        List<BufferedImage> list = a_02.a;
        arrayList.add(list.removeFirst());
        for (BufferedImage bufferedImage : list) {
            int n2 = A[0];
            n2 -= A[1];
            BufferedImage bufferedImage2 = new BufferedImage(((BufferedImage)arrayList.getFirst()).getWidth(), ((BufferedImage)arrayList.getFirst()).getHeight(), n2 -= A[2]);
            Graphics graphics = bufferedImage2.getGraphics();
            int n3 = A[3];
            n3 ^= A[4];
            int n4 = A[6];
            n4 ^= A[7];
            graphics.drawImage((Image)arrayList.getLast(), n3 -= A[5], n4 ^= A[8], null);
            int n5 = A[9];
            n5 ^= A[10];
            int n6 = A[12];
            n6 ^= A[13];
            graphics.drawImage(bufferedImage, n5 += A[11], n6 ^= A[14], null);
            arrayList.add(bufferedImage2);
        }
        return new kotakbaz.rain.client.render.texture.utils.gif.a_0(arrayList, a_02.A);
    }

    public static kotakbaz.rain.client.render.texture.utils.gif.a_0 decompileDeltas(ImageInputStream inputStream) {
        long l2 = 8332886202968218048L;
        long l3 = 8067387325981334924L;
        ArrayList<BufferedImage> arrayList = new ArrayList<BufferedImage>();
        b_0 b_02 = new b_0(new A());
        b_02.setInput(inputStream);
        long l4 = l3;
        int n2 = A[15];
        n2 -= A[16];
        l3 = l4 ^ (0L ^ l4) & -1L << (n2 ^= A[17]);
        while (true) {
            int n3 = A[18];
            n3 ^= A[19];
            boolean bl = A[21];
            bl += A[22];
            if ((int)(l3 >>> (n3 -= A[20])) >= b_02.getNumImages(bl -= A[23])) break;
            int n4 = A[24];
            n4 += A[25];
            arrayList.add(b_02.read((int)(l3 >>> (n4 += A[26]))));
            l3 += 0x100000000L;
        }
        int n5 = A[27];
        n5 ^= A[28];
        return new kotakbaz.rain.client.render.texture.utils.gif.a_0(arrayList, ((a_0)b_02.getImageMetadata((int)(n5 -= a.A[29]))).g);
    }

    static {
        a.a();
    }

    public static void a() {
        A = new int[0x388D ^ 0x3893];
        a.A[0x8FF3 ^ 0x8FF9] = 0xFFFF7013 ^ 0x8FF9;
        a.A[0x2AE1 ^ 0x2AFC] = 0xFFFFD52D ^ 0x2AFC;
        a.A[0x805D ^ 0x805E] = 0x803C ^ 0x805E;
        a.A[0x3AD ^ 0x3BB] = 0xFFFFFC70 ^ 0x3BB;
        a.A[0x8F0F ^ 0x8F02] = 0xFFFF70D5 ^ 0x8F02;
        a.A[0x5AF0 ^ 0x5AF8] = 0xFFFFA528 ^ 0x5AF8;
        a.A[0x6366 ^ 0x637E] = 0x6318 ^ 0x637E;
        a.A[0xEAF4 ^ 0xEAFD] = 0xFFFF1537 ^ 0xEAFD;
        a.A[0x7C26 ^ 0x7C36] = 0xFFFF83AD ^ 0x7C36;
        a.A[0x1057C ^ 0x1057E] = 0x10557 ^ 0x1057E;
        a.A[0x9938 ^ 0x992D] = 0x9903 ^ 0x992D;
        a.A[0x5656 ^ 0x5645] = 0x5612 ^ 0x5645;
        a.A[0x17C2 ^ 0x17CD] = 0xFFFFE848 ^ 0x17CD;
        a.A[0xB417 ^ 0xB412] = 0xFFFF4BA2 ^ 0xB412;
        a.A[0xB307 ^ 0xB300] = 0xFFFF4CE3 ^ 0xB300;
        a.A[0x6B44 ^ 0x6B56] = 0x6B04 ^ 0x6B56;
        a.A[0xCF23 ^ 0xCF22] = 0xFFFF30CF ^ 0xCF22;
        a.A[0xBF6D ^ 0xBF7C] = 0xFFFF40B6 ^ 0xBF7C;
        a.A[0xCEE5 ^ 0xCEF9] = 0xFFFF3111 ^ 0xCEF9;
        a.A[0x4161 ^ 0x417B] = 0xFFFFBECF ^ 0x417B;
        a.A[0xB00A ^ 0xB001] = 0xFFFF4FE1 ^ 0xB001;
        a.A[0x71E4 ^ 0x71EA] = 0xFFFF8E09 ^ 0x71EA;
        a.A[0x79A8 ^ 0x79B3] = 0x798A ^ 0x79B3;
        a.A[0x8E6C ^ 0x8E68] = 0xFFFF71BA ^ 0x8E68;
        a.A[0x670F ^ 0x6716] = 0x6710 ^ 0x6716;
        a.A[0xCDCB ^ 0xCDC7] = 0xCDF3 ^ 0xCDC7;
        a.A[0xE1CC ^ 0xE1DB] = 0xFFFF1E23 ^ 0xE1DB;
        a.A[0x10D7C ^ 0x10D7C] = 0x10D6B ^ 0x10D7C;
        a.A[0x5928 ^ 0x592E] = 0x591D ^ 0x592E;
        a.A[0x6F2B ^ 0x6F3F] = 0xFFFF90DA ^ 0x6F3F;
    }
}

