/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.stream.ImageInputStream;

public class \u0632\u0641 {
    /*
     * WARNING - void declaration
     */
    public static byte[] staggeredReadByteStream(ImageInputStream iis, int length) throws IOException {
        void var3_3;
        int UNIT_SIZE = 1024000;
        if (length < 1024000) {
            decodedData = new byte[length];
            iis.readFully(decodedData, 0, length);
        } else {
            int sz;
            int bytesRead = 0;
            ArrayList<byte[]> bufs = new ArrayList<byte[]>();
            for (int bytesToRead = length; bytesToRead != 0; bytesToRead -= sz) {
                sz = Math.min(bytesToRead, 1024000);
                byte[] unit = new byte[sz];
                iis.readFully(unit, 0, sz);
                bufs.add(unit);
                bytesRead += sz;
            }
            decodedData = new byte[bytesRead];
            int copiedBytes = 0;
            for (byte[] ba : bufs) {
                void var9_9;
                System.arraycopy(ba, 0, decodedData, copiedBytes, ba.length);
                int n = copiedBytes + ((void)var9_9).length;
            }
        }
        return var3_3;
    }

    /*
     * WARNING - void declaration
     */
    private static void computeUpdatedPixels(int sourceOffset, int sourceExtent, int destinationOffset, int dstMin, int dstMax, int sourceSubsampling, int passStart, int passExtent, int passPeriod, int[] vals, int offset) {
        void var12_12;
        void var13_13;
        boolean gotPixel = false;
        int firstDst = -1;
        int secondDst = -1;
        int lastDst = -1;
        int i = 0;
        while (i < passExtent) {
            void var15_15;
            int src = passStart + i * passPeriod;
            if (src >= sourceOffset && (src - sourceOffset) % sourceSubsampling == 0) {
                if (src >= sourceOffset + sourceExtent) break;
                int dst = destinationOffset + (src - sourceOffset) / sourceSubsampling;
                if (dst >= dstMin) {
                    void var17_17;
                    if (dst > dstMax) break;
                    if (!gotPixel) {
                        firstDst = dst;
                        gotPixel = true;
                    } else if (secondDst == -1) {
                        secondDst = var17_17;
                    }
                    lastDst = var17_17;
                }
            }
            ++var15_15;
        }
        vals[offset] = firstDst;
        vals[offset + 2] = !gotPixel ? 0 : lastDst - firstDst + 1;
        vals[offset + 4] = Math.max((int)(var13_13 - var12_12), 1);
    }

    /*
     * WARNING - void declaration
     */
    public static int readMultiByteInteger(ImageInputStream iis) throws IOException {
        void var2_2;
        byte value = iis.readByte();
        int result = value & 0x7F;
        while ((value & 0x80) == 128) {
            result <<= 7;
            value = iis.readByte();
            result |= value & 0x7F;
        }
        return (int)var2_2;
    }

    /*
     * WARNING - void declaration
     */
    public static int[] computeUpdatedPixels(Rectangle sourceRegion, Point destinationOffset, int dstMinX, int dstMinY, int dstMaxX, int dstMaxY, int sourceXSubsampling, int sourceYSubsampling, int passXStart, int passYStart, int passWidth, int passHeight, int passPeriodX, int passPeriodY) {
        void var14_14;
        int[] vals = new int[6];
        \u0632\u0641.computeUpdatedPixels(sourceRegion.x, sourceRegion.width, destinationOffset.x, dstMinX, dstMaxX, sourceXSubsampling, passXStart, passWidth, passPeriodX, vals, 0);
        \u0632\u0641.computeUpdatedPixels(sourceRegion.y, sourceRegion.height, destinationOffset.y, dstMinY, dstMaxY, sourceYSubsampling, passYStart, passHeight, passPeriodY, vals, 1);
        return var14_14;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean tryReadFully(ImageInputStream iis, byte[] b2) throws IOException {
        void var1_1;
        void var2_2;
        int offset = 0;
        do {
            void var3_3;
            int n = iis.read(b2, offset, b2.length - offset);
            if (n < 0) {
                return false;
            }
            offset += var3_3;
        } while (var2_2 < ((void)var1_1).length);
        return true;
    }
}

