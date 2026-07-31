package zenith;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Kernel;

public class floatHolder_13 {
   protected float IIll11I111lIl11l1lIII1l1I1IIl1;
   protected Kernel ll1l11I11l111IlIIIIll1IIl1lI;

   public floatHolder_13(float f) {
      this.IReturn(f);
   }

   public static void StringHolder_8(Kernel kernel, int[] aint, int[] aint1, int i, int j, boolean flag, boolean flag1, boolean flag2, int k) {
      float[] afloat = kernel.getKernelData(null);
      int l = kernel.getWidth();
      int i1 = l / 2;

      for (int j1 = 0; j1 < j; j1++) {
         int k1 = j1;
         int l1 = j1 * i;

         for (int i2 = 0; i2 < i; i2++) {
            float f = 0.0F;
            float f1 = 0.0F;
            float f2 = 0.0F;
            float f3 = 0.0F;
            int j2 = i1;

            for (int k2 = -i1; k2 <= i1; k2++) {
               float f4 = afloat[j2 + k2];
               if (f4 != 0.0F) {
                  int l2 = i2 + k2;
                  if (l2 < 0) {
                     if (k == 1) {
                        l2 = 0;
                     } else if (k == 2) {
                        l2 = (i2 + i) % i;
                     }
                  } else if (l2 >= i) {
                     if (k == 1) {
                        l2 = i - 1;
                     } else if (k == 2) {
                        l2 = (i2 + i) % i;
                     }
                  }

                  int i3 = aint[l1 + l2];
                  int j3 = i3 >> 24 & 0xFF;
                  int k3 = i3 >> 16 & 0xFF;
                  int l3 = i3 >> 8 & 0xFF;
                  int i4 = i3 & 0xFF;
                  if (flag1) {
                     float f5 = (float)j3 * 0.003921569F;
                     k3 = (int)((float)k3 * f5);
                     l3 = (int)((float)l3 * f5);
                     i4 = (int)((float)i4 * f5);
                  }

                  f3 += f4 * (float)j3;
                  f += f4 * (float)k3;
                  f1 += f4 * (float)l3;
                  f2 += f4 * (float)i4;
               }
            }

            if (flag2 && f3 != 0.0F && f3 != 255.0F) {
               float f6 = 255.0F / f3;
               f *= f6;
               f1 *= f6;
               f2 *= f6;
            }

            int j4 = flag ? StringHolder_20((int)((double)f3 + 0.5)) : 255;
            int k4 = StringHolder_20((int)((double)f + 0.5));
            int l4 = StringHolder_20((int)((double)f1 + 0.5));
            int i5 = StringHolder_20((int)((double)f2 + 0.5));
            aint1[k1] = j4 << 24 | k4 << 16 | l4 << 8 | i5;
            k1 += j;
         }
      }
   }

   public static int StringHolder_20(int i) {
      return i < 0 ? 0 : Math.min(i, 255);
   }

   public static Kernel GetStartTimeHandler(float f) {
      int i = (int)Math.ceil((double)f);
      int j = i * 2 + 1;
      float[] afloat = new float[j];
      float f1 = f / 3.0F;
      float f2 = 2.0F * f1 * f1;
      float f3 = (float) (Math.PI * 2) * f1;
      float f4 = (float)Math.sqrt((double)f3);
      float f5 = f * f;
      float f6 = 0.0F;
      int k = 0;

      for (int l = -i; l <= i; l++) {
         float f7 = (float)(l * l);
         if (f7 > f5) {
            afloat[k] = 0.0F;
         } else {
            afloat[k] = (float)Math.exp((double)(-f7 / f2)) / f4;
         }

         f6 += afloat[k];
         k++;
      }

      for (int i1 = 0; i1 < j; i1++) {
         afloat[i1] /= f6;
      }

      return new Kernel(j, 1, afloat);
   }

   public void IReturn(float f) {
      this.IIll11I111lIl11l1lIII1l1I1IIl1 = f;
      this.ll1l11I11l111IlIIIIll1IIl1lI = GetStartTimeHandler(f);
   }

   public BufferedImage StringHolder_8(BufferedImage bufferedimage, BufferedImage bufferedimage1) {
      int i = bufferedimage.getWidth();
      int j = bufferedimage.getHeight();
      if (bufferedimage1 == null) {
         bufferedimage1 = this.StringHolder_8(bufferedimage, null);
      }

      int[] aint = new int[i * j];
      int[] aint1 = new int[i * j];
      bufferedimage.getRGB(0, 0, i, j, aint, 0, i);
      if (this.IIll11I111lIl11l1lIII1l1I1IIl1 > 0.0F) {
         StringHolder_8(this.ll1l11I11l111IlIIIIll1IIl1lI, aint, aint1, i, j, true, true, false, 1);
         StringHolder_8(this.ll1l11I11l111IlIIIIll1IIl1lI, aint1, aint, j, i, true, false, true, 1);
      }

      bufferedimage1.setRGB(0, 0, i, j, aint, 0, i);
      return bufferedimage1;
   }

   public BufferedImage StringHolder_8(BufferedImage bufferedimage, ColorModel colormodel) {
      if (colormodel == null) {
         colormodel = bufferedimage.getColorModel();
      }

      return new BufferedImage(
         colormodel, colormodel.createCompatibleWritableRaster(bufferedimage.getWidth(), bufferedimage.getHeight()), colormodel.isAlphaPremultiplied(), null
      );
   }
}
