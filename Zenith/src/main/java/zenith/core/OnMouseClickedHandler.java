package zenith;

import zenith.hud.*;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.InputUtil;
import net.minecraft.client.util.math.Vector2f;
import zenith.zov.base.font.Font;

public class OnMouseClickedHandler implements ZenithInternal076 {
   private static final Map<Character, Character> Illlll1IlI1ll11lIl;
   private String lIIII11lIIl1 = "";
   private boolean selected;
   private boolean lIIlIl1lIIIIl11I;
   private int I11I1II1II1l11I1;
   private float IIllI1lI1IIIII11l1l1l1llll1;
   private Font l1I11llllI11lIl;
   private Vector2f lIllIl111I1ll1I1l1I1lIl;
   private String ll11lllIIl11II11;
   private float width;
   private long II111II1III1 = System.currentTimeMillis();
   private int l1llI11ll11IlIlI1l1l1llI = Integer.MAX_VALUE;
   private ZenithInternal097$Helper I1II1lllI11lIlIIllllI1lI = ZenithInternal097$Helper.lI1llIIl1llIIl;
   private ZenithInternal096$EventBus l11I1ll1IlIIlI11l = ZenithInternal096$EventBus.IIlIll1I11llIII11lII11l1111Ill;
   private float scrollOffset = 0.0F;
   GetStartTimeHandler animation = new GetStartTimeHandler(400L, 0.2F, IReturn.ListHolder_8);

   public OnMouseClickedHandler(Vector2f Vector2f, Font font, String s, float f) {
      this.l1I11llllI11lIl = font;
      this.ll11lllIIl11II11 = s;
      this.width = f;
      this.lIllIl111I1ll1I1l1I1lIl = Vector2f;
   }

   public void StringHolder_8(DrawContextImpl lliii11l1lllil, float f, float f1, ByteBufferHolder il1iliilli1l1iill, ByteBufferHolder il1iliilli1l1iill1) {
      this.lIllIl111I1ll1I1l1I1lIl = new Vector2f(f, f1);
      this.I11I1II1II1l11I1 = MathHelper.clamp(this.I11I1II1II1l11I1, 0, this.lIIII11lIIl1.length());
      this.IIllI1lI1IIIII11l1l1l1llll1 = f;
      boolean flag = this.isEmpty();
      float f2 = 0.0F;
      if (!flag) {
         String s = this.lIIII11lIIl1.substring(0, this.I11I1II1II1l11I1);
         f2 = this.l1I11llllI11lIl.width(s);
      }

      float f4 = this.width;
      int i = 0;

      while (this.l1I11llllI11lIl.width(this.lIIII11lIIl1.substring(i, this.I11I1II1II1l11I1)) > f4) {
         i++;
      }

      int j = this.I11I1II1II1l11I1;

      while (j < this.lIIII11lIIl1.length() && this.l1I11llllI11lIl.width(this.lIIII11lIIl1.substring(i, j)) < f4) {
         j++;
      }

      String s1 = this.lIIII11lIIl1.substring(i, j);
      if (flag) {
         lliii11l1lllil.StringHolder_8(this.l1I11llllI11lIl, this.ll11lllIIl11II11, f, f1, il1iliilli1l1iill1);
      } else {
         lliii11l1lllil.StringHolder_8(this.l1I11llllI11lIl, s1, f, f1, il1iliilli1l1iill);
      }

      if (this.selected && System.currentTimeMillis() - this.II111II1III1 > 200L) {
         float f3 = this.IIllI1lI1IIIII11l1l1l1llll1 + Math.min(f2 - this.scrollOffset, this.width);
         this.animation.EventImpl_21(250L);
         lliii11l1lllil.StringHolder_8(
            f3,
            f1 - 1.0F,
            1.0F,
            this.l1I11llllI11lIl.height() + 2.0F,
            il1iliilli1l1iill.ZenithInternal039(
               this.animation
                  .StringHolder_8(
                     this.animation.CloudFriendInfo() == 0.2F
                        ? 1.0F
                        : (this.animation.CloudFriendInfo() == 1.0F ? 0.2F : this.animation.HootBar())
                  )
            )
         );
      }

      if (this.lIIlIl1lIIIIl11I) {
         lliii11l1lllil.StringHolder_8(
            f - 1.0F, f1 - 1.0F, this.l1I11llllI11lIl.width(s1) + 2.0F, this.l1I11llllI11lIl.height() + 2.0F, il1iliilli1l1iill1.ZenithInternal039(0.5F)
         );
      }
   }

   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      Vector2f Vector2f = this.I1l111ll1I();
      this.selected = ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 0
         && doubleHolder_3.StringHolder_8(
            d0,
            d1,
            (double)Vector2f.getX(),
            (double)(Vector2f.getY() - 3.0F),
            (double)this.width,
            (double)(this.l1I11llllI11lIl.height() + 6.0F)
         );
      if (this.selected) {
         this.lIIlIl1lIIIIl11I = false;
      }

      return this.selected;
   }

   public boolean keyPressed(int i, int j, int k) {
      if (!this.selected) {
         return false;
      } else if (i == 256) {
         this.selected = false;
         return true;
      } else {
         this.II111II1III1 = System.currentTimeMillis();
         this.I11I1II1II1l11I1 = MathHelper.clamp(this.I11I1II1II1l11I1, 0, this.lIIII11lIIl1.length());
         if (InputUtil.isKeyPressed(l11I1I1ll1Illll1I1l1111l1II.getWindow().getHandle(), 341)) {
            if (i == 86) {
               String s = l11I1I1ll1Illll1I1l1111l1II.keyboard.getClipboard();
               if (this.lIIlIl1lIIIIl11I) {
                  this.lIIII11lIIl1 = "";
                  this.I11I1II1II1l11I1 = 0;
                  this.lIIlIl1lIIIIl11I = false;
               }

               this.Event(s, this.I11I1II1II1l11I1);
               this.I11I1II1II1l11I1 = this.I11I1II1II1l11I1 + s.length();
               this.lIIlIl1lIIIIl11I = false;
            } else if (i == 65) {
               this.lIIlIl1lIIIIl11I = true;
               this.I11I1II1II1l11I1 = this.lIIII11lIIl1.length();
            } else if (i == 67 && this.selected && this.lIIlIl1lIIIIl11I) {
               l11I1I1ll1Illll1I1l1111l1II.keyboard.setClipboard(this.lIIII11lIIl1);
            }
         } else if (i == 261 && !this.lIIII11lIIl1.isEmpty()) {
            this.KeyEvent(this.I11I1II1II1l11I1 + 1);
            this.lIIlIl1lIIIIl11I = false;
         } else if (i == 259 && !this.lIIII11lIIl1.isEmpty()) {
            if (this.lIIlIl1lIIIIl11I) {
               this.lIIII11lIIl1 = "";
               this.I11I1II1II1l11I1 = 0;
               this.lIIlIl1lIIIIl11I = false;
            } else {
               this.KeyEvent(this.I11I1II1II1l11I1);
               this.I11I1II1II1l11I1--;
               if (InputUtil.isKeyPressed(l11I1I1ll1Illll1I1l1111l1II.getWindow().getHandle(), 341)) {
                  while (!this.lIIII11lIIl1.isEmpty() && this.I11I1II1II1l11I1 > 0) {
                     this.KeyEvent(this.I11I1II1II1l11I1);
                     this.I11I1II1II1l11I1--;
                  }
               }
            }
         } else if (i == 262) {
            this.I11I1II1II1l11I1++;
            if (InputUtil.isKeyPressed(l11I1I1ll1Illll1I1l1111l1II.getWindow().getHandle(), 341)) {
               this.I11I1II1II1l11I1 = this.lIIII11lIIl1.length();
            }

            this.lIIlIl1lIIIIl11I = false;
         } else if (i == 263) {
            this.I11I1II1II1l11I1--;
            if (InputUtil.isKeyPressed(l11I1I1ll1Illll1I1l1111l1II.getWindow().getHandle(), 341)) {
               this.I11I1II1II1l11I1 = 0;
            }

            this.lIIlIl1lIIIIl11I = false;
         } else if (i == 269) {
            this.I11I1II1II1l11I1 = this.lIIII11lIIl1.length();
            this.lIIlIl1lIIIIl11I = false;
         } else if (i == 268) {
            this.I11I1II1II1l11I1 = 0;
            this.lIIlIl1lIIIIl11I = false;
         }

         this.I11I1II1II1l11I1 = MathHelper.clamp(this.I11I1II1II1l11I1, 0, this.lIIII11lIIl1.length());
         return true;
      }
   }

   public boolean charTyped(char c0, int i) {
      if (!this.selected) {
         return false;
      } else {
         this.II111II1III1 = System.currentTimeMillis();
         this.I11I1II1II1l11I1 = MathHelper.clamp(this.I11I1II1II1l11I1, 0, this.lIIII11lIIl1.length());
         if (this.lIIlIl1lIIIIl11I) {
            this.lIIII11lIIl1 = "";
            this.I11I1II1II1l11I1 = 0;
            this.lIIlIl1lIIIIl11I = false;
         }

         this.Event(Character.toString(c0), this.I11I1II1II1l11I1);
         this.I11I1II1II1l11I1++;
         this.I11I1II1II1l11I1 = MathHelper.clamp(this.I11I1II1II1l11I1, 0, this.lIIII11lIIl1.length());
         return true;
      }
   }

   private void Event(String s, int i) {
      String s1 = this.ZenithInternal002(s);
      s1 = this.ListHolder_7(s1);
      StringBuilder stringbuilder = new StringBuilder();

      for (char c0 : s1.toCharArray()) {
         if (this.I1II1lllI11lIlIIllllI1lI.EventBus(c0)) {
            stringbuilder.append(c0);
         }
      }

      String s2 = stringbuilder.toString();
      if (this.lIIII11lIIl1.length() + s2.length() > this.l1llI11ll11IlIlI1l1l1llI) {
         int j = this.l1llI11ll11IlIlI1l1l1llI - this.lIIII11lIIl1.length();
         if (j <= 0) {
            return;
         }

         s2 = s2.substring(0, Math.min(j, s2.length()));
      }

      StringBuilder stringbuilder1 = new StringBuilder();
      boolean flag = false;

      for (int k = 0; k < this.lIIII11lIIl1.length(); k++) {
         if (k == i) {
            flag = true;
            stringbuilder1.append(s2);
         }

         stringbuilder1.append(this.lIIII11lIIl1.charAt(k));
      }

      if (!flag) {
         stringbuilder1.append(s2);
      }

      this.lIIII11lIIl1 = stringbuilder1.toString();
   }

   private void KeyEvent(int i) {
      StringBuilder stringbuilder = new StringBuilder();

      for (int j = 0; j < this.lIIII11lIIl1.length(); j++) {
         if (j != i - 1) {
            stringbuilder.append(this.lIIII11lIIl1.charAt(j));
         }
      }

      this.lIIII11lIIl1 = stringbuilder.toString();
   }

   public boolean isEmpty() {
      return this.lIIII11lIIl1.isEmpty();
   }

   private String ZenithInternal002(String s) {
      if (s != null && !s.isEmpty()) {
         return switch (this.I1II1lllI11lIlIIllllI1lI) {
            case III11IIl1l1l1lI, IIIll1l11I -> StringHolder_8(s, Illlll1IlI1ll11lIl);
            default -> s;
         };
      } else {
         return s;
      }
   }

   private String ListHolder_7(String s) {
      if (s != null && !s.isEmpty() && this.l11I1ll1IlIIlI11l != ZenithInternal096$EventBus.IIlIll1I11llIII11lII11l1111Ill) {
         StringBuilder stringbuilder = new StringBuilder(s.length());

         for (int i = 0; i < s.length(); i++) {
            char c0 = s.charAt(i);
            if (!Character.isWhitespace(c0)) {
               stringbuilder.append(c0);
            }
         }

         return stringbuilder.toString();
      } else {
         return s;
      }
   }

   private static String StringHolder_8(String s, Map<Character, Character> map) {
      StringBuilder stringbuilder = new StringBuilder(s.length());

      for (int i = 0; i < s.length(); i++) {
         char c0 = s.charAt(i);
         char c1 = Character.toLowerCase(c0);
         Character character = (Character)map.get(c1);
         if (character == null) {
            stringbuilder.append(c0);
         } else {
            char c2 = Character.isUpperCase(c0) ? Character.toUpperCase(character) : character;
            stringbuilder.append(c2);
         }
      }

      return stringbuilder.toString();
   }

   public String II1I11IIl() {
      return this.lIIII11lIIl1;
   }

   public boolean isSelected() {
      return this.selected;
   }

   public boolean llIIIII1Il11llIllI1I1l1ll1lll() {
      return this.lIIlIl1lIIIIl11I;
   }

   public int lll1I1lIl1l1III11l1IIII() {
      return this.I11I1II1II1l11I1;
   }

   public float l111l1IlI11llll11II() {
      return this.IIllI1lI1IIIII11l1l1l1llll1;
   }

   public Font IIl1llI1Il111I11I111II() {
      return this.l1I11llllI11lIl;
   }

   public Vector2f I1l111ll1I() {
      return this.lIllIl111I1ll1I1l1I1lIl;
   }

   public String Il1II11IIIl1I1Il1Il1I1Illl11() {
      return this.ll11lllIIl11II11;
   }

   public float getWidth() {
      return this.width;
   }

   public long IlIIl1llI1lI1() {
      return this.II111II1III1;
   }

   public int l1l1IIl11IIl1lIlI1Il1lIIl1I1l1() {
      return this.l1llI11ll11IlIlI1l1l1llI;
   }

   public ZenithInternal097$Helper IllllIll11lIlI1Il11lllII1IlI1() {
      return this.I1II1lllI11lIlIIllllI1lI;
   }

   public ZenithInternal096$EventBus lIllI1lI1Ill1I() {
      return this.l11I1ll1IlIIlI11l;
   }

   public float IlI1Il111lIlIl11I() {
      return this.scrollOffset;
   }

   public GetStartTimeHandler l1I1ll1IIl1l1() {
      return this.animation;
   }

   public void GetDisplayNameHandler(String s) {
      this.lIIII11lIIl1 = s;
   }

   public void setSelected(boolean flag) {
      this.selected = flag;
   }

   public void ZenithException(boolean flag) {
      this.lIIlIl1lIIIIl11I = flag;
   }

   public void EventImpl_16(int i) {
      this.I11I1II1II1l11I1 = i;
   }

   public void floatHolder_12(float f) {
      this.IIllI1lI1IIIII11l1l1l1llll1 = f;
   }

   public void StringHolder_8(Font font) {
      this.l1I11llllI11lIl = font;
   }

   public void StringHolder_8(Vector2f Vector2f) {
      this.lIllIl111I1ll1I1l1I1lIl = Vector2f;
   }

   public void SoundEventHolder(String s) {
      this.ll11lllIIl11II11 = s;
   }

   public void setWidth(float f) {
      this.width = f;
   }

   public void ZenithInternal045(long i) {
      this.II111II1III1 = i;
   }

   public void EventImpl_38(int i) {
      this.l1llI11ll11IlIlI1l1l1llI = i;
   }

   public void StringHolder_8(ZenithInternal097$Helper li111l1i1ili111111ll1iiii1$ii1il11l111ii11iil) {
      this.I1II1lllI11lIlIIllllI1lI = li111l1i1ili111111ll1iiii1$ii1il11l111ii11iil;
   }

   public void StringHolder_8(ZenithInternal096$EventBus li111l1i1ili111111ll1iiii1$l1i1illlili) {
      this.l11I1ll1IlIIlI11l = li111l1i1ili111111ll1iiii1$l1i1illlili;
   }

   public void ArrayListHolder_2(float f) {
      this.scrollOffset = f;
   }

   public void StringHolder_8(GetStartTimeHandler li1liiliill1) {
      this.animation = li1liiliill1;
   }

   @Override
   public boolean equals(Object object) {
      if (object == this) {
         return true;
      } else if (!(object instanceof OnMouseClickedHandler li111l1i1ili111111ll1iiii1)) {
         return false;
      } else if (!li111l1i1ili111111ll1iiii1.EventTarget(this)) {
         return false;
      } else if (this.isSelected() != li111l1i1ili111111ll1iiii1.isSelected()) {
         return false;
      } else if (this.llIIIII1Il11llIllI1I1l1ll1lll() != li111l1i1ili111111ll1iiii1.llIIIII1Il11llIllI1I1l1ll1lll()) {
         return false;
      } else if (this.lll1I1lIl1l1III11l1IIII() != li111l1i1ili111111ll1iiii1.lll1I1lIl1l1III11l1IIII()) {
         return false;
      } else if (Float.compare(this.l111l1IlI11llll11II(), li111l1i1ili111111ll1iiii1.l111l1IlI11llll11II()) != 0) {
         return false;
      } else if (Float.compare(this.getWidth(), li111l1i1ili111111ll1iiii1.getWidth()) != 0) {
         return false;
      } else if (this.IlIIl1llI1lI1() != li111l1i1ili111111ll1iiii1.IlIIl1llI1lI1()) {
         return false;
      } else if (this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1() != li111l1i1ili111111ll1iiii1.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1()) {
         return false;
      } else if (Float.compare(this.IlI1Il111lIlIl11I(), li111l1i1ili111111ll1iiii1.IlI1Il111lIlIl11I()) != 0) {
         return false;
      } else {
         String s = this.II1I11IIl();
         String s1 = li111l1i1ili111111ll1iiii1.II1I11IIl();
         if (s == null ? s1 == null : s.equals(s1)) {
            Font font = this.IIl1llI1Il111I11I111II();
            Font font1 = li111l1i1ili111111ll1iiii1.IIl1llI1Il111I11I111II();
            if (font == null ? font1 == null : font.equals(font1)) {
               Vector2f Vector2fx = this.I1l111ll1I();
               Vector2f Vector2fx = li111l1i1ili111111ll1iiii1.I1l111ll1I();
               if (Vector2fx == null ? Vector2fx == null : Vector2fx.equals(Vector2fx)) {
                  String s2 = this.Il1II11IIIl1I1Il1Il1I1Illl11();
                  String s3 = li111l1i1ili111111ll1iiii1.Il1II11IIIl1I1Il1Il1I1Illl11();
                  if (s2 == null ? s3 == null : s2.equals(s3)) {
                     ZenithInternal097$Helper li111l1i1ili111111ll1iiii1$ii1il11l111ii11iilx = this.IllllIll11lIlI1Il11lllII1IlI1();
                     ZenithInternal097$Helper li111l1i1ili111111ll1iiii1$ii1il11l111ii11iilx = li111l1i1ili111111ll1iiii1.IllllIll11lIlI1Il11lllII1IlI1();
                     if (li111l1i1ili111111ll1iiii1$ii1il11l111ii11iilx == null
                        ? li111l1i1ili111111ll1iiii1$ii1il11l111ii11iilx == null
                        : li111l1i1ili111111ll1iiii1$ii1il11l111ii11iilx.equals(li111l1i1ili111111ll1iiii1$ii1il11l111ii11iilx)) {
                        ZenithInternal096$EventBus li111l1i1ili111111ll1iiii1$l1i1illlilix = this.lIllI1lI1Ill1I();
                        ZenithInternal096$EventBus li111l1i1ili111111ll1iiii1$l1i1illlilix = li111l1i1ili111111ll1iiii1.lIllI1lI1Ill1I();
                        if (li111l1i1ili111111ll1iiii1$l1i1illlilix == null
                           ? li111l1i1ili111111ll1iiii1$l1i1illlilix == null
                           : li111l1i1ili111111ll1iiii1$l1i1illlilix.equals(li111l1i1ili111111ll1iiii1$l1i1illlilix)) {
                           GetStartTimeHandler li1liiliill1x = this.l1I1ll1IIl1l1();
                           GetStartTimeHandler li1liiliill1x = li111l1i1ili111111ll1iiii1.l1I1ll1IIl1l1();
                           return li1liiliill1x == null ? li1liiliill1x == null : li1liiliill1x.equals(li1liiliill1x);
                        } else {
                           return false;
                        }
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   protected boolean EventTarget(Object object) {
      return object instanceof OnMouseClickedHandler;
   }

   @Override
   public int hashCode() {
      byte b0 = 59;
      int i = 1;
      i = i * 59 + (this.isSelected() ? 79 : 97);
      i = i * 59 + (this.llIIIII1Il11llIllI1I1l1ll1lll() ? 79 : 97);
      i = i * 59 + this.lll1I1lIl1l1III11l1IIII();
      i = i * 59 + Float.floatToIntBits(this.l111l1IlI11llll11II());
      i = i * 59 + Float.floatToIntBits(this.getWidth());
      long j = this.IlIIl1llI1lI1();
      i = i * 59 + (int)(j >>> 32 ^ j);
      i = i * 59 + this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1();
      i = i * 59 + Float.floatToIntBits(this.IlI1Il111lIlIl11I());
      String s = this.II1I11IIl();
      i = i * 59 + (s == null ? 43 : s.hashCode());
      Font font = this.IIl1llI1Il111I11I111II();
      i = i * 59 + (font == null ? 43 : font.hashCode());
      Vector2f Vector2f = this.I1l111ll1I();
      i = i * 59 + (Vector2f == null ? 43 : Vector2f.hashCode());
      String s1 = this.Il1II11IIIl1I1Il1Il1I1Illl11();
      i = i * 59 + (s1 == null ? 43 : s1.hashCode());
      ZenithInternal097$Helper li111l1i1ili111111ll1iiii1$ii1il11l111ii11iil = this.IllllIll11lIlI1Il11lllII1IlI1();
      i = i * 59 + (li111l1i1ili111111ll1iiii1$ii1il11l111ii11iil == null ? 43 : li111l1i1ili111111ll1iiii1$ii1il11l111ii11iil.hashCode());
      ZenithInternal096$EventBus li111l1i1ili111111ll1iiii1$l1i1illlili = this.lIllI1lI1Ill1I();
      i = i * 59 + (li111l1i1ili111111ll1iiii1$l1i1illlili == null ? 43 : li111l1i1ili111111ll1iiii1$l1i1illlili.hashCode());
      GetStartTimeHandler li1liiliill1 = this.l1I1ll1IIl1l1();
      return i * 59 + (li1liiliill1 == null ? 43 : li1liiliill1.hashCode());
   }

   @Override
   public String toString() {
      return "TextBox(text="
         + this.II1I11IIl()
         + ", selected="
         + this.isSelected()
         + ", selectAll="
         + this.llIIIII1Il11llIllI1I1l1ll1lll()
         + ", cursor="
         + this.lll1I1lIl1l1III11l1IIII()
         + ", posX="
         + this.l111l1IlI11llll11II()
         + ", font="
         + this.IIl1llI1Il111I11I111II()
         + ", position="
         + this.I1l111ll1I()
         + ", emptyText="
         + this.Il1II11IIIl1I1Il1Il1I1Illl11()
         + ", width="
         + this.getWidth()
         + ", lastInputTime="
         + this.IlIIl1llI1lI1()
         + ", maxLength="
         + this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1()
         + ", charFilter="
         + this.IllllIll11lIlI1Il11lllII1IlI1()
         + ", wordLimit="
         + this.lIllI1lI1Ill1I()
         + ", scrollOffset="
         + this.IlI1Il111lIlIl11I()
         + ", animation="
         + this.l1I1ll1IIl1l1()
         + ")";
   }

   static {
      HashMap hashmap = new HashMap();
      hashmap.put('а', 'f');
      hashmap.put('б', ',');
      hashmap.put('в', 'd');
      hashmap.put('г', 'u');
      hashmap.put('д', 'l');
      hashmap.put('е', 't');
      hashmap.put('ж', ';');
      hashmap.put('з', 'p');
      hashmap.put('и', 'b');
      hashmap.put('й', 'q');
      hashmap.put('к', 'r');
      hashmap.put('л', 'k');
      hashmap.put('м', 'v');
      hashmap.put('н', 'y');
      hashmap.put('о', 'j');
      hashmap.put('п', 'g');
      hashmap.put('р', 'h');
      hashmap.put('с', 'c');
      hashmap.put('т', 'n');
      hashmap.put('у', 'e');
      hashmap.put('ф', 'a');
      hashmap.put('х', '[');
      hashmap.put('ц', 'w');
      hashmap.put('ч', 'x');
      hashmap.put('ш', 'i');
      hashmap.put('щ', 'o');
      hashmap.put('ъ', ']');
      hashmap.put('ы', 's');
      hashmap.put('ь', 'm');
      hashmap.put('э', '\'');
      hashmap.put('ю', '.');
      hashmap.put('я', 'z');
      hashmap.put('ё', '`');
      Illlll1IlI1ll11lIl = hashmap;
   }
}
