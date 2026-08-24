package oxxxde;

import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.stream.ImageInputStream;

// $VF: Compiled from heavy
public class زف {
   public static byte[] staggeredReadByteStream(ImageInputStream iis, int length) throws IOException {
      int UNIT_SIZE = 1024000;
      byte[] decodedData;
      if (length < 1024000) {
         decodedData = new byte[length];
         iis.readFully(decodedData, 0, length);
      } else {
         int bytesToRead = length;
         int bytesRead = 0;
         List<byte[]> bufs = new ArrayList();

         while (bytesToRead != 0) {
            int copiedBytes = Math.min(bytesToRead, 1024000);
            byte[] unit = new byte[copiedBytes];
            iis.readFully(unit, 0, copiedBytes);
            bufs.add(unit);
            bytesRead += copiedBytes;
            bytesToRead -= copiedBytes;
         }

         decodedData = new byte[bytesRead];
         int var10 = 0;

         for (byte[] ba : bufs) {
            System.arraycopy(ba, 0, decodedData, var10, ba.length);
            var10 += ba.length;
         }
      }

      return decodedData;
   }

   private static void computeUpdatedPixels(
      int sourceExtent,
      int passExtent,
      int dstMax,
      int dstMin,
      int passStart,
      int destinationOffset,
      int offset,
      int vals,
      int sourceOffset,
      int[] sourceSubsampling,
      int passPeriod
   ) {
      boolean gotPixel = false;
      int firstDst = -1;
      int secondDst = -1;
      int lastDst = -1;

      for (int i = 0; i < passExtent; i++) {
         int src = passStart + i * passPeriod;
         if (src >= sourceOffset && (src - sourceOffset) % sourceSubsampling == 0) {
            if (src >= sourceOffset + sourceExtent) {
               break;
            }

            int dst = destinationOffset + (src - sourceOffset) / sourceSubsampling;
            if (dst >= dstMin) {
               if (dst > dstMax) {
                  break;
               }

               if (!gotPixel) {
                  firstDst = dst;
                  gotPixel = true;
               } else if (secondDst == -1) {
                  secondDst = dst;
               }

               lastDst = dst;
            }
         }
      }

      vals[offset] = firstDst;
      if (!gotPixel) {
         vals[offset + 2] = 0;
      } else {
         vals[offset + 2] = lastDst - firstDst + 1;
      }

      vals[offset + 4] = Math.max(secondDst - firstDst, 1);
   }

   public static int readMultiByteInteger(ImageInputStream iis) throws IOException {
      int value = iis.readByte();
      int result = value & 127;

      while ((value & 128) == 128) {
         result <<= 7;
         value = iis.readByte();
         result |= value & 127;
      }

      return result;
   }

   public static int[] computeUpdatedPixels(
      Rectangle destinationOffset,
      Point passPeriodY,
      int passHeight,
      int passYStart,
      int dstMaxX,
      int dstMinY,
      int sourceRegion,
      int passPeriodX,
      int sourceYSubsampling,
      int sourceXSubsampling,
      int passWidth,
      int dstMinX,
      int dstMaxY,
      int passXStart
   ) {
      int[] vals = new int[6];
      computeUpdatedPixels(
         sourceRegion.x, sourceRegion.width, destinationOffset.x, dstMinX, dstMaxX, sourceXSubsampling, passXStart, passWidth, passPeriodX, vals, 0
      );
      computeUpdatedPixels(
         sourceRegion.y, sourceRegion.height, destinationOffset.y, dstMinY, dstMaxY, sourceYSubsampling, passYStart, passHeight, passPeriodY, vals, 1
      );
      return vals;
   }

   public static boolean tryReadFully(ImageInputStream iis, byte[] b) throws IOException {
      int offset = 0;

      do {
         int n = iis.read(b, offset, b.length - offset);
         if (n < 0) {
            return false;
         }

         offset += n;
      } while (offset < b.length);

      return true;
   }
}
