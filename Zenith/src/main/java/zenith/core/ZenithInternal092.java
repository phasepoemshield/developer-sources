package zenith;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.util.Identifier;
import net.minecraft.resource.Resource;

public class ZenithInternal092 {
   private static final Map<Identifier, booleanHolder$EventTarget> IIII1l111III111llI1 = new HashMap<>();
   private static final Map<Identifier, floatHolder$EventBus[]> I1II1lII1111IIlII1lIIIl11 = new HashMap<>();
   private static final Map<Identifier, floatHolder$EventBus[]> I111IlIll1I1llI1l1I1ll1II111 = new HashMap<>();
   private static final Map<Identifier, floatHolder$Helper_2[]> lI1l11Il1II1Il1Il1IlI = new HashMap<>();

   public static floatHolder$Helper_2[] ZenithInternal095(Identifier Identifier) {
      floatHolder$Helper_2[] al1l1i1i1liilil$ii1il11l111ii11iil = lI1l11Il1II1Il1Il1IlI.get(Identifier);
      if (al1l1i1i1liilil$ii1il11l111ii11iil != null) {
         return al1l1i1i1liilil$ii1il11l111ii11iil;
      } else {
         floatHolder$Helper_2[] al1l1i1i1liilil$ii1il11l111ii11iil1 = Event(Identifier);
         lI1l11Il1II1Il1Il1IlI.put(Identifier, al1l1i1i1liilil$ii1il11l111ii11iil1);
         return al1l1i1i1liilil$ii1il11l111ii11iil1;
      }
   }

   private static floatHolder$Helper_2[] Event(Identifier Identifier) {
      try {
         net.minecraft.client.MinecraftClient MinecraftClient = net.minecraft.client.MinecraftClient.getInstance();
         Optional optional = MinecraftClient.getResourceManager().getResource(Identifier);
         if (optional.isEmpty()) {
            return new floatHolder$Helper_2[0];
         } else {
            NativeImage NativeImage = NativeImage.read(((Resource)optional.get()).getInputStream());

            floatHolder$Helper_2[] al1l1i1i1liilil$ii1il11l111ii11iil;
            try {
               al1l1i1i1liilil$ii1il11l111ii11iil = StringHolder_8(NativeImage, 110, 0.12F);
            } catch (Throwable throwable1) {
               if (NativeImage != null) {
                  try {
                     NativeImage.close();
                  } catch (Throwable throwable) {
                     throwable1.addSuppressed(throwable);
                  }
               }

               throw throwable1;
            }

            if (NativeImage != null) {
               NativeImage.close();
            }

            return al1l1i1i1liilil$ii1il11l111ii11iil;
         }
      } catch (Exception exception) {
         return new floatHolder$Helper_2[0];
      }
   }

   private static floatHolder$Helper_2[] StringHolder_8(NativeImage NativeImage, int i, float f) {
      int j = NativeImage.getWidth();
      int k = NativeImage.getHeight();
      int l = Math.max(1, j / i);
      int i1 = Math.max(1, k / i);
      int j1 = (j + l - 1) / l;
      int k1 = (k + i1 - 1) / i1;
      ArrayList arraylist = new ArrayList();

      for (int l1 = 0; l1 < k1; l1++) {
         int i2 = l1 * i1;
         int j2 = Math.min(i2 + i1, k);

         for (int k2 = 0; k2 < j1; k2++) {
            int l2 = k2 * l;
            int i3 = Math.min(l2 + l, j);
            float f1 = 0.0F;
            int j3 = 0;

            for (int k3 = i2; k3 < j2; k3++) {
               for (int l3 = l2; l3 < i3; l3++) {
                  f1 += EventImpl_29(NativeImage.getColorArgb(l3, k3));
                  j3++;
               }
            }

            if (j3 != 0) {
               float f5 = f1 / (float)j3;
               if (!(f5 < f)) {
                  float f6 = (float)(l2 + i3) * 0.5F / (float)Math.max(1, j - 1);
                  float f2 = (float)(i2 + j2) * 0.5F / (float)Math.max(1, k - 1);
                  float f3 = f6 * 2.0F - 1.0F;
                  float f4 = f2 * 2.0F - 1.0F;
                  arraylist.add(new floatHolder$Helper_2(f3, f4, f5));
               }
            }
         }
      }

      return arraylist.toArray(new floatHolder$Helper_2[0]);
   }

   public static floatHolder$EventBus[] EventImpl_24(Identifier Identifier) {
      floatHolder$EventBus[] al1l1i1i1liilil$l1i1illlili = I1II1lII1111IIlII1lIIIl11.get(Identifier);
      if (al1l1i1i1liilil$l1i1illlili != null) {
         return al1l1i1i1liilil$l1i1illlili;
      } else {
         floatHolder$EventBus[] al1l1i1i1liilil$l1i1illlili1 = EventImpl_13(Identifier);
         I1II1lII1111IIlII1lIIIl11.put(Identifier, al1l1i1i1liilil$l1i1illlili1);
         return al1l1i1i1liilil$l1i1illlili1;
      }
   }

   public static floatHolder$EventBus[] ZenithInternal028(Identifier Identifier) {
      floatHolder$EventBus[] al1l1i1i1liilil$l1i1illlili = I111IlIll1I1llI1l1I1ll1II111.get(Identifier);
      if (al1l1i1i1liilil$l1i1illlili != null) {
         return al1l1i1i1liilil$l1i1illlili;
      } else {
         floatHolder$EventBus[] al1l1i1i1liilil$l1i1illlili1 = EventImpl_21(Identifier);
         I111IlIll1I1llI1l1I1ll1II111.put(Identifier, al1l1i1i1liilil$l1i1illlili1);
         return al1l1i1i1liilil$l1i1illlili1;
      }
   }

   private static floatHolder$EventBus[] EventImpl_21(Identifier Identifier) {
      try {
         net.minecraft.client.MinecraftClient MinecraftClient = net.minecraft.client.MinecraftClient.getInstance();
         Optional optional = MinecraftClient.getResourceManager().getResource(Identifier);
         if (optional.isEmpty()) {
            return new floatHolder$EventBus[0];
         } else {
            NativeImage NativeImage = NativeImage.read(((Resource)optional.get()).getInputStream());

            floatHolder$EventBus[] al1l1i1i1liilil$l1i1illlili;
            try {
               al1l1i1i1liilil$l1i1illlili = StringHolder_8(NativeImage, 720);
            } catch (Throwable throwable1) {
               if (NativeImage != null) {
                  try {
                     NativeImage.close();
                  } catch (Throwable throwable) {
                     throwable1.addSuppressed(throwable);
                  }
               }

               throw throwable1;
            }

            if (NativeImage != null) {
               NativeImage.close();
            }

            return al1l1i1i1liilil$l1i1illlili;
         }
      } catch (Exception exception) {
         return new floatHolder$EventBus[0];
      }
   }

   private static floatHolder$EventBus[] StringHolder_8(NativeImage NativeImage, int i) {
      int j = NativeImage.getWidth();
      int k = NativeImage.getHeight();
      float f = (float)(j - 1) * 0.5F;
      float f1 = (float)(k - 1) * 0.5F;
      int l = Math.max(64, (int)(Math.max(f, f1) * 2.0F));
      float[] afloat = new float[i];
      float[] afloat1 = new float[i];
      float[] afloat2 = new float[l];
      float[] afloat3 = new float[l];
      float f2 = 0.0F;

      for (int i1 = 0; i1 < i; i1++) {
         float f3 = (float)i1 / (float)i * (float) (Math.PI * 2);
         float f4 = (float)Math.cos((double)f3);
         float f5 = (float)Math.sin((double)f3);

         for (int j1 = 0; j1 < l; j1++) {
            float f6 = ((float)j1 + 1.0F) / (float)l;
            afloat2[j1] = StringHolder_8(NativeImage, f + f * f6 * f4, f1 + f1 * f6 * f5, j, k);
         }

         for (int l1 = 0; l1 < l; l1++) {
            float f15 = afloat2[Math.max(0, l1 - 1)];
            float f7 = afloat2[l1];
            float f8 = afloat2[Math.min(l - 1, l1 + 1)];
            afloat3[l1] = (f15 + f7 * 2.0F + f8) * 0.25F;
         }

         float f14 = 0.0F;
         int i2 = 0;

         for (int k2 = 0; k2 < l; k2++) {
            if (afloat3[k2] > f14) {
               f14 = afloat3[k2];
               i2 = k2;
            }
         }

         float f16 = ((float)i2 + 1.0F) / (float)l;
         if (i2 > 0 && i2 < l - 1) {
            float f18 = afloat3[i2 - 1];
            float f9 = afloat3[i2];
            float f10 = afloat3[i2 + 1];
            float f11 = f18 - 2.0F * f9 + f10;
            if (Math.abs(f11) > 1.0E-6F) {
               float f12 = 0.5F * (f18 - f10) / f11;
               if (f12 > -1.0F && f12 < 1.0F) {
                  f16 = ((float)i2 + 1.0F + f12) / (float)l;
               }
            }
         }

         afloat[i1] = f14;
         afloat1[i1] = f16;
         if (f14 > f2) {
            f2 = f14;
         }
      }

      if (f2 < 0.02F) {
         return new floatHolder$EventBus[0];
      } else {
         int k1 = Math.max(2, i / 30);
         float[] afloat4 = EventTarget(afloat, k1);
         float[] afloat5 = EventTarget(afloat1, k1);
         float f13 = 1.0F / f2;
         floatHolder$EventBus[] al1l1i1i1liilil$l1i1illlili = new floatHolder$EventBus[i];

         for (int j2 = 0; j2 < i; j2++) {
            float f17 = (float)j2 / (float)i * (float) (Math.PI * 2);
            float f19 = Math.min(1.0F, afloat4[j2] * f13);
            al1l1i1i1liilil$l1i1illlili[j2] = new floatHolder$EventBus(f17, afloat5[j2], f19);
         }

         return al1l1i1i1liilil$l1i1illlili;
      }
   }

   private static float StringHolder_8(NativeImage NativeImage, float f, float f1, int i, int j) {
      if (!(f < 0.0F) && !(f1 < 0.0F) && !(f > (float)i - 1.0F) && !(f1 > (float)j - 1.0F)) {
         int k = (int)Math.floor((double)f);
         int l = (int)Math.floor((double)f1);
         int i1 = Math.min(k + 1, i - 1);
         int j1 = Math.min(l + 1, j - 1);
         float f2 = f - (float)k;
         float f3 = f1 - (float)l;
         float f4 = EventImpl_29(NativeImage.getColorArgb(k, l));
         float f5 = EventImpl_29(NativeImage.getColorArgb(i1, l));
         float f6 = EventImpl_29(NativeImage.getColorArgb(k, j1));
         float f7 = EventImpl_29(NativeImage.getColorArgb(i1, j1));
         float f8 = f4 * (1.0F - f2) + f5 * f2;
         float f9 = f6 * (1.0F - f2) + f7 * f2;
         return f8 * (1.0F - f3) + f9 * f3;
      } else {
         return 0.0F;
      }
   }

   private static float EventImpl_29(int i) {
      int j = i >>> 24 & 0xFF;
      int k = i >>> 16 & 0xFF;
      int l = i >>> 8 & 0xFF;
      int i1 = i & 0xFF;
      float f = (float)Math.max(k, Math.max(l, i1)) / 255.0F;
      return (float)j / 255.0F * f;
   }

   private static float[] EventTarget(float[] afloat, int i) {
      int j = afloat.length;
      float[] afloat1 = new float[j];
      float f = 1.0F / (float)(2 * i + 1);

      for (int k = 0; k < j; k++) {
         float f1 = 0.0F;

         for (int l = -i; l <= i; l++) {
            int i1 = ((k + l) % j + j) % j;
            f1 += afloat[i1];
         }

         afloat1[k] = f1 * f;
      }

      return afloat1;
   }

   private static floatHolder$EventBus[] EventImpl_13(Identifier Identifier) {
      try {
         net.minecraft.client.MinecraftClient MinecraftClient = net.minecraft.client.MinecraftClient.getInstance();
         Optional optional = MinecraftClient.getResourceManager().getResource(Identifier);
         if (optional.isEmpty()) {
            return new floatHolder$EventBus[0];
         } else {
            NativeImage NativeImage = NativeImage.read(((Resource)optional.get()).getInputStream());

            floatHolder$EventBus[] al1l1i1i1liilil$l1i1illlili;
            try {
               al1l1i1i1liilil$l1i1illlili = StringHolder_8(NativeImage);
            } catch (Throwable throwable1) {
               if (NativeImage != null) {
                  try {
                     NativeImage.close();
                  } catch (Throwable throwable) {
                     throwable1.addSuppressed(throwable);
                  }
               }

               throw throwable1;
            }

            if (NativeImage != null) {
               NativeImage.close();
            }

            return al1l1i1i1liilil$l1i1illlili;
         }
      } catch (Exception exception) {
         return new floatHolder$EventBus[0];
      }
   }

   private static floatHolder$EventBus[] StringHolder_8(NativeImage NativeImage) {
      int i = NativeImage.getWidth();
      int j = NativeImage.getHeight();
      float f = (float)i / 2.0F;
      float f1 = (float)j / 2.0F;
      float f2 = Math.min(f, f1);
      short short1 = 360;
      byte b0 = 32;
      float[] afloat = new float[short1];
      float[] afloat1 = new float[short1];

      for (int k = 0; k < short1; k++) {
         float f3 = (float)k / (float)short1 * (float) (Math.PI * 2);
         float f4 = (float)Math.cos((double)f3);
         float f5 = (float)Math.sin((double)f3);
         float f6 = 0.0F;
         float f7 = 0.0F;

         for (int l = 1; l <= b0; l++) {
            float f8 = (float)l / (float)b0;
            float f9 = f2 * f8;
            int i1 = (int)(f + f9 * f4);
            int j1 = (int)(f1 + f9 * f5);
            if (i1 >= 0 && i1 < i && j1 >= 0 && j1 < j) {
               int k1 = NativeImage.getColorArgb(i1, j1);
               int l1 = k1 >>> 24 & 0xFF;
               int i2 = k1 >>> 16 & 0xFF;
               int j2 = k1 >>> 8 & 0xFF;
               int k2 = k1 & 0xFF;
               float f10 = (float)Math.max(i2, Math.max(j2, k2)) / 255.0F;
               float f11 = (float)l1 / 255.0F * f10;
               if (f11 > f6) {
                  f6 = f11;
                  f7 = f8;
               }
            }
         }

         afloat[k] = f6;
         afloat1[k] = f7;
      }

      float f12 = 0.0F;

      for (float f14 : afloat) {
         if (f14 > f12) {
            f12 = f14;
         }
      }

      if (f12 < 0.05F) {
         return new floatHolder$EventBus[0];
      } else {
         float f13 = f12 * 0.55F;
         int l2 = short1 / 18;
         ArrayList arraylist = new ArrayList();

         for (int i3 = 0; i3 < short1; i3++) {
            float f15 = afloat[i3];
            if (!(f15 < f13)) {
               boolean flag = true;

               for (int j3 = -l2; j3 <= l2; j3++) {
                  if (j3 != 0) {
                     int k3 = ((i3 + j3) % short1 + short1) % short1;
                     if (afloat[k3] > f15) {
                        flag = false;
                        break;
                     }
                  }
               }

               if (flag) {
                  float f16 = (float)i3 / (float)short1 * (float) (Math.PI * 2);
                  arraylist.add(new floatHolder$EventBus(f16, afloat1[i3], f15 / f12));
               }
            }
         }

         return arraylist.toArray(new floatHolder$EventBus[0]);
      }
   }

   public static booleanHolder$EventTarget byteHolder_2(Identifier Identifier) {
      if (IIII1l111III111llI1.containsKey(Identifier)) {
         return IIII1l111III111llI1.get(Identifier);
      } else {
         booleanHolder$EventTarget l1l1i1i1liilil$illi1l1l1 = byteHolder(Identifier);
         IIII1l111III111llI1.put(Identifier, l1l1i1i1liilil$illi1l1l1);
         return l1l1i1i1liilil$illi1l1l1;
      }
   }

   private static booleanHolder$EventTarget byteHolder(Identifier Identifier) {
      try {
         net.minecraft.client.MinecraftClient MinecraftClient = net.minecraft.client.MinecraftClient.getInstance();
         if (MinecraftClient.getTextureManager().getTexture(Identifier) instanceof NativeImageBackedTexture NativeImageBackedTexture) {
            return StringHolder_8(NativeImageBackedTexture);
         } else {
            booleanHolder$EventTarget l1l1i1i1liilil$illi1l1l1 = StringHolder_4(Identifier);
            return l1l1i1i1liilil$illi1l1l1 != null ? l1l1i1i1liilil$illi1l1l1 : ZenithInternal128(Identifier);
         }
      } catch (Exception exception) {
         return ZenithInternal128(Identifier);
      }
   }

   private static booleanHolder$EventTarget StringHolder_8(NativeImageBackedTexture NativeImageBackedTexture) {
      try {
         NativeImage NativeImage = NativeImageBackedTexture.getImage();
         if (NativeImage != null) {
            return EventBus(NativeImage);
         }
      } catch (Exception exception) {
      }

      return new booleanHolder$EventTarget(false, false, true);
   }

   private static booleanHolder$EventTarget StringHolder_4(Identifier Identifier) {
      try {
         net.minecraft.client.MinecraftClient MinecraftClient = net.minecraft.client.MinecraftClient.getInstance();
         Optional optional = MinecraftClient.getResourceManager().getResource(Identifier);
         if (optional.isPresent()) {
            NativeImage NativeImage = NativeImage.read(((Resource)optional.get()).getInputStream());

            booleanHolder$EventTarget l1l1i1i1liilil$illi1l1l1;
            try {
               l1l1i1i1liilil$illi1l1l1 = EventBus(NativeImage);
            } catch (Throwable throwable1) {
               if (NativeImage != null) {
                  try {
                     NativeImage.close();
                  } catch (Throwable throwable) {
                     throwable1.addSuppressed(throwable);
                  }
               }

               throw throwable1;
            }

            if (NativeImage != null) {
               NativeImage.close();
            }

            return l1l1i1i1liilil$illi1l1l1;
         }
      } catch (Exception exception) {
      }

      return null;
   }

   private static booleanHolder$EventTarget EventBus(NativeImage NativeImage) {
      if (NativeImage == null) {
         return new booleanHolder$EventTarget(false, false, true);
      } else {
         int i = NativeImage.getWidth();
         int j = NativeImage.getHeight();
         boolean flag = false;
         boolean flag1 = false;
         boolean flag2 = false;
         int k = Math.max(1, Math.min(i, j) / 16);

         try {
            for (int l = 0; l < j; l += k) {
               for (int i1 = 0; i1 < i; i1 += k) {
                  byte b0 = NativeImage.getOpacity(i1, l);
                  if (b0 == 0) {
                     flag = true;
                  } else if (b0 < 255) {
                     flag1 = true;
                  } else {
                     flag2 = true;
                  }

                  if (flag && flag1 && flag2) {
                     break;
                  }
               }
            }
         } catch (Exception exception) {
            return new booleanHolder$EventTarget(false, true, false);
         }

         boolean flag3 = flag && !flag1;
         boolean flag4 = !flag && !flag1;
         return new booleanHolder$EventTarget(flag1, flag3, flag4);
      }
   }

   private static booleanHolder$EventTarget ZenithInternal128(Identifier Identifier) {
      String s = Identifier.getPath().toLowerCase();
      String s1 = Identifier.getNamespace().toLowerCase();
      boolean flag = s.contains("transparent")
         || s.contains("translucent")
         || s.contains("glass")
         || s.contains("water")
         || s.contains("overlay")
         || s.contains("glow");
      boolean flag1 = s.contains("cutout")
         || s.contains("leaves")
         || s.contains("grass")
         || s.contains("flower")
         || s.contains("plant")
         || s.contains("vine")
         || s.contains("chain")
         || s.contains("fence")
         || s.contains("bars");
      boolean flag2 = !flag && !flag1;
      return new booleanHolder$EventTarget(flag, flag1, flag2);
   }

   public static boolean ByteBufferHolder_2(Identifier Identifier) {
      return byteHolder_2(Identifier).l1lIl1lIIl1Ill1I1Ill;
   }

   public static boolean ConnectThread(Identifier Identifier) {
      return byteHolder_2(Identifier).IIllll1Il1l1l111ll;
   }

   public static boolean CallableImpl(Identifier Identifier) {
      return byteHolder_2(Identifier).Il1I111llI11IIIl1l11ll11lllll;
   }

   public static void l1l1ll11lIl11I11I11I1() {
      IIII1l111III111llI1.clear();
      I1II1lII1111IIlII1lIIIl11.clear();
      I111IlIll1I1llI1l1I1ll1II111.clear();
      lI1l11Il1II1Il1Il1IlI.clear();
   }

   public static String longHolder_5(Identifier Identifier) {
      booleanHolder$EventTarget l1l1i1i1liilil$illi1l1l1 = byteHolder_2(Identifier);
      if (l1l1i1i1liilil$illi1l1l1.l1lIl1lIIl1Ill1I1Ill) {
         return "translucent";
      } else {
         return l1l1i1i1liilil$illi1l1l1.IIllll1Il1l1l111ll ? "cutout" : "solid";
      }
   }
}
