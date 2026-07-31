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
import kotakbaz.rain.client.render.texture.utils.gif.A;
import kotakbaz.rain.client.render.texture.utils.gif.gif.B;

/*
 * Renamed from kotakbaz.rain.client.render.texture.utils.gif.a
 */
public class a_0 {
    public static int[] A;

    public a_0() {
        super();
    }

    public static A decompileFull(ImageInputStream imageInputStream) {
        ArrayList<BufferedImage> arrayList = new ArrayList<BufferedImage>();
        A a2 = a_0.decompileDeltas(imageInputStream);
        List<BufferedImage> list = a2.a;
        arrayList.add(list.removeFirst());
        for (BufferedImage bufferedImage : list) {
            int n = A[0];
            n -= A[1];
            BufferedImage bufferedImage2 = new BufferedImage(((BufferedImage)arrayList.getFirst()).getWidth(), ((BufferedImage)arrayList.getFirst()).getHeight(), n -= A[2]);
            Graphics graphics = bufferedImage2.getGraphics();
            int n2 = A[3];
            n2 ^= A[4];
            int n3 = A[6];
            n3 ^= A[7];
            graphics.drawImage((Image)arrayList.getLast(), n2 -= A[5], n3 ^= A[8], null);
            int n4 = A[9];
            n4 ^= A[10];
            int n5 = A[12];
            n5 ^= A[13];
            graphics.drawImage(bufferedImage, n4 += A[11], n5 ^= A[14], null);
            arrayList.add(bufferedImage2);
        }
        return new A(arrayList, a2.A);
    }

    public static A decompileDeltas(ImageInputStream imageInputStream) {
        long l = 8332886202968218048L;
        long l2 = 8067387325981334924L;
        ArrayList<BufferedImage> arrayList = new ArrayList<BufferedImage>();
        B b2 = new B(new kotakbaz.rain.client.render.texture.utils.gif.gif.A());
        b2.setInput(imageInputStream);
        long l3 = l2;
        int n = A[15];
        n -= A[16];
        l2 = l3 ^ (0L ^ l3) & -1L << (n ^= A[17]);
        while (true) {
            int n2 = A[18];
            n2 ^= A[19];
            boolean bl = A[21];
            bl += A[22];
            if ((int)(l2 >>> (n2 -= A[20])) >= b2.getNumImages(bl -= A[23])) break;
            int n3 = A[24];
            n3 += A[25];
            arrayList.add(b2.read((int)(l2 >>> (n3 += A[26]))));
            l2 += 0x100000000L;
        }
        int n4 = A[27];
        n4 ^= A[28];
        return new A(arrayList, ((kotakbaz.rain.client.render.texture.utils.gif.gif.a_0)b2.getImageMetadata((int)(n4 -= a_0.A[29]))).g);
    }

    static {
        a_0.a();
    }

    public static void a() {
        A = new int[0x388D ^ 0x3893];
        a_0.A[0x8FF3 ^ 0x8FF9] = 0xFFFF7013 ^ 0x8FF9;
        a_0.A[0x2AE1 ^ 0x2AFC] = 0xFFFFD52D ^ 0x2AFC;
        a_0.A[0x805D ^ 0x805E] = 0x803C ^ 0x805E;
        a_0.A[0x3AD ^ 0x3BB] = 0xFFFFFC70 ^ 0x3BB;
        a_0.A[0x8F0F ^ 0x8F02] = 0xFFFF70D5 ^ 0x8F02;
        a_0.A[0x5AF0 ^ 0x5AF8] = 0xFFFFA528 ^ 0x5AF8;
        a_0.A[0x6366 ^ 0x637E] = 0x6318 ^ 0x637E;
        a_0.A[0xEAF4 ^ 0xEAFD] = 0xFFFF1537 ^ 0xEAFD;
        a_0.A[0x7C26 ^ 0x7C36] = 0xFFFF83AD ^ 0x7C36;
        a_0.A[0x1057C ^ 0x1057E] = 0x10557 ^ 0x1057E;
        a_0.A[0x9938 ^ 0x992D] = 0x9903 ^ 0x992D;
        a_0.A[0x5656 ^ 0x5645] = 0x5612 ^ 0x5645;
        a_0.A[0x17C2 ^ 0x17CD] = 0xFFFFE848 ^ 0x17CD;
        a_0.A[0xB417 ^ 0xB412] = 0xFFFF4BA2 ^ 0xB412;
        a_0.A[0xB307 ^ 0xB300] = 0xFFFF4CE3 ^ 0xB300;
        a_0.A[0x6B44 ^ 0x6B56] = 0x6B04 ^ 0x6B56;
        a_0.A[0xCF23 ^ 0xCF22] = 0xFFFF30CF ^ 0xCF22;
        a_0.A[0xBF6D ^ 0xBF7C] = 0xFFFF40B6 ^ 0xBF7C;
        a_0.A[0xCEE5 ^ 0xCEF9] = 0xFFFF3111 ^ 0xCEF9;
        a_0.A[0x4161 ^ 0x417B] = 0xFFFFBECF ^ 0x417B;
        a_0.A[0xB00A ^ 0xB001] = 0xFFFF4FE1 ^ 0xB001;
        a_0.A[0x71E4 ^ 0x71EA] = 0xFFFF8E09 ^ 0x71EA;
        a_0.A[0x79A8 ^ 0x79B3] = 0x798A ^ 0x79B3;
        a_0.A[0x8E6C ^ 0x8E68] = 0xFFFF71BA ^ 0x8E68;
        a_0.A[0x670F ^ 0x6716] = 0x6710 ^ 0x6716;
        a_0.A[0xCDCB ^ 0xCDC7] = 0xCDF3 ^ 0xCDC7;
        a_0.A[0xE1CC ^ 0xE1DB] = 0xFFFF1E23 ^ 0xE1DB;
        a_0.A[0x10D7C ^ 0x10D7C] = 0x10D6B ^ 0x10D7C;
        a_0.A[0x5928 ^ 0x592E] = 0x591D ^ 0x592E;
        a_0.A[0x6F2B ^ 0x6F3F] = 0xFFFF90DA ^ 0x6F3F;
    }
}

