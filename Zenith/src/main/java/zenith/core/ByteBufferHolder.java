package zenith;

import java.awt.Color;
import java.nio.ByteBuffer;
import java.util.Objects;
import net.minecraft.util.math.MathHelper;

public class ByteBufferHolder {
   public static final ByteBufferHolder ll1lIllll111I1lIIl1lIl = new ByteBufferHolder(255, 255, 255, 255);
   public static final ByteBufferHolder lll1ll1l = new ByteBufferHolder(0, 0, 0, 255);
   public static final ByteBufferHolder II1l1Ill1III1I1l11Il11I = new ByteBufferHolder(0, 255, 0, 255);
   public static final ByteBufferHolder lIlll1llI1l11I1ll11llIll111I = new ByteBufferHolder(255, 0, 0, 255);
   public static final ByteBufferHolder l1ll11lIl = new ByteBufferHolder(0, 0, 255, 255);
   public static final ByteBufferHolder IIIIIl1I1l1Il1ll11 = new ByteBufferHolder(255, 255, 0, 255);
   public static final ByteBufferHolder Il1IIIllIIll111I1llIl11Il = new ByteBufferHolder(88, 87, 93, 255);
   public static final ByteBufferHolder lllIll11l1I11Il1II11II1I11 = new ByteBufferHolder(0, 0, 0, 0);
   public static final ByteBufferHolder Il1lII1I1l1ll1IlIllllll1Il1ll1 = new ByteBufferHolder(14, 14, 16, 255);
   private transient float[] lII1I11lI;
   private final int IlIIllllllIlII1IIllIlIIllIl;
   private final int l1llII1IIl1I1lIll1;
   private final int I1l1lllIlI1l1III;
   private final int l1lIllIIllI;
   private static final ByteBuffer II11I1Il11Il111l11I1II11I = ByteBuffer.allocateDirect(4);

   public ByteBufferHolder(String s) {
      if (s.startsWith("#")) {
         s = s.substring(1);
      }

      long i = Long.parseLong(s, 16);
      int j;
      int k;
      int l;
      int i1;
      if (s.length() == 8) {
         j = (int)(i >> 24 & 255L);
         k = (int)(i >> 16 & 255L);
         l = (int)(i >> 8 & 255L);
         i1 = (int)(i & 255L);
      } else {
         if (s.length() != 6) {
            throw new IllegalArgumentException("Invalid hex color: " + s);
         }

         j = (int)(i >> 16 & 255L);
         k = (int)(i >> 8 & 255L);
         l = (int)(i & 255L);
         i1 = 255;
      }

      this.IlIIllllllIlII1IIllIlIIllIl = j;
      this.l1llII1IIl1I1lIll1 = k;
      this.I1l1lllIlI1l1III = l;
      this.l1lIllIIllI = i1;
   }

   public ByteBufferHolder(int i) {
      this(
         PatternHolder.BlockPosHolder_2(i),
         PatternHolder.GetSlotIdHandler_2(i),
         PatternHolder.ScreenHolder(i),
         PatternHolder.EventImpl_27(i)
      );
   }

   public ByteBufferHolder(Color color) {
      this(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
   }

   public ByteBufferHolder(int i, int j, int k) {
      this(i, j, k, 255);
   }

   public ByteBufferHolder(int i, int j, int k, int l) {
      i = MathHelper.clamp(i, 0, 255);
      j = MathHelper.clamp(j, 0, 255);
      k = MathHelper.clamp(k, 0, 255);
      l = MathHelper.clamp(l, 0, 255);
      this.IlIIllllllIlII1IIllIlIIllIl = i;
      this.l1llII1IIl1I1lIll1 = j;
      this.I1l1lllIlI1l1III = k;
      this.l1lIllIIllI = l;
   }

   public int lllIlll1Ill111l111Il11II11lII() {
      int i = Math.round((float)this.StringHolder_6((float)this.l1lIllIIllI));
      int j = Math.round((float)this.StringHolder_6((float)this.IlIIllllllIlII1IIllIlIIllIl));
      int k = Math.round((float)this.StringHolder_6((float)this.l1llII1IIl1I1lIll1));
      int l = Math.round((float)this.StringHolder_6((float)this.I1l1lllIlI1l1III));
      return (i & 0xFF) << 24 | (j & 0xFF) << 16 | (k & 0xFF) << 8 | l & 0xFF;
   }

   private int StringHolder_6(float f) {
      return (int)Math.max(0.0F, Math.min(255.0F, f));
   }

   public static ByteBufferHolder GetClientColorHandler(String s) {
      String s1 = s.startsWith("#") ? s.substring(1) : s;
      if (s1.length() != 6 && s1.length() != 8) {
         throw new IllegalArgumentException("Hex color must be in the format #RRGGBB or #RRGGBBAA");
      } else {
         int i = Integer.parseInt(s1.substring(0, 2), 16);
         int j = Integer.parseInt(s1.substring(2, 4), 16);
         int k = Integer.parseInt(s1.substring(4, 6), 16);
         int l = s1.length() == 8 ? Integer.parseInt(s1.substring(6, 8), 16) : 255;
         return new ByteBufferHolder(i, j, k, l);
      }
   }

   public static ByteBufferHolder StringHolder_8(ByteBufferHolder il1iliilli1l1iill, ByteBufferHolder il1iliilli1l1iill1, float f) {
      float f1 = Math.max(0.0F, Math.min(1.0F, f));
      int i = (int)(
         (float)il1iliilli1l1iill.IlIIlllIIIlllI1Il1Il11llI1lll()
            + (float)(il1iliilli1l1iill1.IlIIlllIIIlllI1Il1Il11llI1lll() - il1iliilli1l1iill.IlIIlllIIIlllI1Il1Il11llI1lll()) * f1
      );
      int j = (int)((float)il1iliilli1l1iill.llI11I1ll11IlI() + (float)(il1iliilli1l1iill1.llI11I1ll11IlI() - il1iliilli1l1iill.llI11I1ll11IlI()) * f1);
      int k = (int)(
         (float)il1iliilli1l1iill.III11IllIIIIlII1Il1IIlI()
            + (float)(il1iliilli1l1iill1.III11IllIIIIlII1Il1IIlI() - il1iliilli1l1iill.III11IllIIIIlII1Il1IIlI()) * f1
      );
      int l = (int)(
         (float)il1iliilli1l1iill.I11Ill1I1I1llll11Il1I1I()
            + (float)(il1iliilli1l1iill1.I11Ill1I1I1llll11Il1I1I() - il1iliilli1l1iill.I11Ill1I1I1llll11Il1I1I()) * f1
      );
      return new ByteBufferHolder(i, j, k, l);
   }

   public static ByteBufferHolder ZenithInternal090(int i) {
      int j = i >> 24 & 0xFF;
      int k = i >> 16 & 0xFF;
      int l = i >> 8 & 0xFF;
      int i1 = i & 0xFF;
      return new ByteBufferHolder(k, l, i1, j);
   }

   public ByteBufferHolder StringHolder_27(float f) {
      return new ByteBufferHolder(
         this.IlIIllllllIlII1IIllIlIIllIl, this.l1llII1IIl1I1lIll1, this.I1l1lllIlI1l1III, this.StringHolder_6((float)((int)(255.0F * f)))
      );
   }

   public ByteBufferHolder EventImpl_36(int i) {
      return new ByteBufferHolder(this.IlIIllllllIlII1IIllIlIIllIl, this.l1llII1IIl1I1lIll1, this.I1l1lllIlI1l1III, i);
   }

   public ByteBufferHolder ZenithInternal039(float f) {
      return this.EventImpl_36((int)((float)this.l1lIllIIllI * f));
   }

   public ByteBufferHolder StringHolder_8(ByteBufferHolder il1iliilli1l1iill1, float f) {
      f = Math.min(1.0F, Math.max(0.0F, f));
      return new ByteBufferHolder(
         (int)doubleHolder_3.EventImpl_21((double)this.IlIIlllIIIlllI1Il1Il11llI1lll(), (double)il1iliilli1l1iill1.IlIIlllIIIlllI1Il1Il11llI1lll(), (double)f),
         (int)doubleHolder_3.EventImpl_21((double)this.llI11I1ll11IlI(), (double)il1iliilli1l1iill1.llI11I1ll11IlI(), (double)f),
         (int)doubleHolder_3.EventImpl_21((double)this.III11IllIIIIlII1Il1IIlI(), (double)il1iliilli1l1iill1.III11IllIIIIlII1Il1IIlI(), (double)f),
         (int)doubleHolder_3.EventImpl_21((double)this.I11Ill1I1I1llll11Il1I1I(), (double)il1iliilli1l1iill1.I11Ill1I1I1llll11Il1I1I(), (double)f)
      );
   }

   public ByteBufferHolder SecretKeySpecHolder(float f) {
      f = MathHelper.clamp(f, 0.0F, 1.0F);
      return new ByteBufferHolder(
         (int)((float)this.IlIIllllllIlII1IIllIlIIllIl * (1.0F - f)),
         (int)((float)this.l1llII1IIl1I1lIll1 * (1.0F - f)),
         (int)((float)this.I1l1lllIlI1l1III * (1.0F - f)),
         this.l1lIllIIllI
      );
   }

   public static ByteBufferHolder ConnectThread(float f, float f1, float f2) {
      if (f1 == 0.0F) {
         int i = (int)(f2 * 255.0F + 0.5F);
         return new ByteBufferHolder(i, i, i);
      } else {
         float f3 = (f - (float)Math.floor((double)f)) * 6.0F;
         float f4 = f3 - (float)Math.floor((double)f3);
         float f5 = f2 * (1.0F - f1);
         float f6 = f2 * (1.0F - f1 * f4);
         float f7 = f2 * (1.0F - f1 * (1.0F - f4));
         float f8 = 0.0F;
         float f9 = 0.0F;
         float f10 = 0.0F;
         switch ((int)f3) {
            case 0:
               f8 = f2;
               f9 = f7;
               f10 = f5;
               break;
            case 1:
               f8 = f6;
               f9 = f2;
               f10 = f5;
               break;
            case 2:
               f8 = f5;
               f9 = f2;
               f10 = f7;
               break;
            case 3:
               f8 = f5;
               f9 = f6;
               f10 = f2;
               break;
            case 4:
               f8 = f7;
               f9 = f5;
               f10 = f2;
               break;
            case 5:
               f8 = f2;
               f9 = f5;
               f10 = f6;
         }

         return new ByteBufferHolder((int)(f8 * 255.0F), (int)(f9 * 255.0F), (int)(f10 * 255.0F));
      }
   }

   public float l1ll11llI11ll11l() {
      return this.I1lIIIIl11Il1II1ll11llII()[0];
   }

   public float I1I1IIlIll() {
      return this.I1lIIIIl11Il1II1ll11llII()[2];
   }

   public float lIIIl1IIllIlllIl111l() {
      return this.I1lIIIIl11Il1II1ll11llII()[1];
   }

   private float[] I1lIIIIl11Il1II1ll11llII() {
      if (this.lII1I11lI == null) {
         this.lII1I11lI = this.IIIlllIl1I1();
      }

      return this.lII1I11lI;
   }

   private float[] IIIlllIl1I1() {
      float f = (float)this.IlIIllllllIlII1IIllIlIIllIl / 255.0F;
      float f1 = (float)this.l1llII1IIl1I1lIll1 / 255.0F;
      float f2 = (float)this.I1l1lllIlI1l1III / 255.0F;
      float f3 = Math.max(f, Math.max(f1, f2));
      float f4 = Math.min(f, Math.min(f1, f2));
      float f5 = f3 - f4;
      float f6 = 0.0F;
      if (f5 != 0.0F) {
         if (f3 == f) {
            f6 = (f1 - f2) / f5;
         } else if (f3 == f1) {
            f6 = (f2 - f) / f5 + 2.0F;
         } else {
            f6 = (f - f1) / f5 + 4.0F;
         }

         f6 /= 6.0F;
         if (f6 < 0.0F) {
            f6++;
         }
      }

      float f7 = f3 == 0.0F ? 0.0F : f5 / f3;
      return new float[]{f6, f7, f3};
   }

   public ByteBufferHolder StringHolder_24(float f) {
      f = MathHelper.clamp(f, 0.0F, 1.0F);
      return new ByteBufferHolder(
         (int)((float)this.IlIIllllllIlII1IIllIlIIllIl + (255.0F - (float)this.IlIIllllllIlII1IIllIlIIllIl) * f),
         (int)((float)this.l1llII1IIl1I1lIll1 + (255.0F - (float)this.l1llII1IIl1I1lIll1) * f),
         (int)((float)this.I1l1lllIlI1l1III + (255.0F - (float)this.I1l1lllIlI1l1III) * f),
         this.l1lIllIIllI
      );
   }

   @Override
   public boolean equals(Object object) {
      if (this == object) {
         return true;
      } else if (object != null && this.getClass() == object.getClass()) {
         ByteBufferHolder il1iliilli1l1iill1 = (ByteBufferHolder)object;
         return Float.compare((float)this.IlIIllllllIlII1IIllIlIIllIl, (float)il1iliilli1l1iill1.IlIIllllllIlII1IIllIlIIllIl) == 0
            && Float.compare((float)this.l1llII1IIl1I1lIll1, (float)il1iliilli1l1iill1.l1llII1IIl1I1lIll1) == 0
            && Float.compare((float)this.I1l1lllIlI1l1III, (float)il1iliilli1l1iill1.I1l1lllIlI1l1III) == 0
            && Float.compare((float)this.l1lIllIIllI, (float)il1iliilli1l1iill1.l1lIllIIllI) == 0;
      } else {
         return false;
      }
   }

   public float longHolder_4(ByteBufferHolder il1iliilli1l1iill1) {
      return Math.abs(this.l1ll11llI11ll11l() - il1iliilli1l1iill1.l1ll11llI11ll11l())
         + Math.abs(this.lIIIl1IIllIlllIl111l() - il1iliilli1l1iill1.lIIIl1IIllIlllIl111l())
         + Math.abs(this.I1I1IIlIll() - il1iliilli1l1iill1.I1I1IIlIll());
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.IlIIllllllIlII1IIllIlIIllIl, this.l1llII1IIl1I1lIll1, this.I1l1lllIlI1l1III, this.l1lIllIIllI);
   }

   public int IlIIlllIIIlllI1Il1Il11llI1lll() {
      return this.IlIIllllllIlII1IIllIlIIllIl;
   }

   public int llI11I1ll11IlI() {
      return this.l1llII1IIl1I1lIll1;
   }

   public int III11IllIIIIlII1Il1IIlI() {
      return this.I1l1lllIlI1l1III;
   }

   public int I11Ill1I1I1llll11Il1I1I() {
      return this.l1lIllIIllI;
   }
}
