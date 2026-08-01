package zenith.hud;

import com.google.gson.JsonObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.client.util.math.Vector2f;
import org.joml.Vector2f;

public abstract class HudElement implements ZenithInternal076 {
   private final String l1l1l11lIII11IIlIIlIllllll;
   // $VF: renamed from: x float
   protected float field_322;
   // $VF: renamed from: y float
   protected float field_323;
   protected float width;
   protected float height;
   protected float l1l11l111IIl11lI1I1111lII1;
   protected float IlIllI1lI11Ill11llII1111l;
   protected float lII1II11IIIII1 = Float.NaN;
   protected float l1IlIIllIIl1I1IlII1ll1III1I11 = Float.NaN;
   protected float llI1I11llIIl1lIII1I11IlllI = -1.0F;
   protected float lllll1I1l1lIIIllII1IIIl11I = -1.0F;
   protected final NumberSetting lII1IlIll11 = new NumberSetting(
      "module.interface.hudElement.scale", 100.0F, 90.0F, 250.0F, 1.0F, "module.interface.hudElement.scale.desc", "%"
   );
   private static final float lIll1Il1111l1ll1l1Il = 8.0F;
   private boolean ll1lII11I1II1Il = true;
   private HudElement$II1Il11l111II11IIl ll11llIlIIlIIll111l111l = HudElement$II1Il11l111II11IIl.Il111lI1lllIIIIll11Il1IIlI;
   private float l1Il1I1I1lIlI1I1I1l1l11 = 0.0F;
   private float l1III111I1II1I = 0.0F;

   public void tick() {
   }

   public boolean StringHolder_8(EventImpl_38 lllll1l1iliiiiiiililii11) {
      return false;
   }

   public HudElement(
      String s, float f, float f1, float f2, float f3, float f4, float f5, HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil
   ) {
      this.l1l1l11lIII11IIlIIlIllllll = s;
      this.field_322 = f;
      this.field_323 = f1;
      this.l1l11l111IIl11lI1I1111lII1 = f2;
      this.IlIllI1lI11Ill11llII1111l = f3;
      this.l1Il1I1I1lIlI1I1I1l1l11 = f4;
      this.l1III111I1II1I = f5;
      this.ll11llIlIIlIIll111l111l = ii11l1l11lil1i1$ii1il11l111ii11iil != null
         ? ii11l1l11lil1i1$ii1il11l111ii11iil
         : HudElement$II1Il11l111II11IIl.Il111lI1lllIIIIll11Il1IIlI;
   }

   public float IlI1IllI111lllllIIlllIll() {
      return Math.max(0.01F, this.lII1IlIll11.lll1lI1llll1IIllIIIII1lll() / 100.0F);
   }

   public float lI11l1IIl1II11l11lI11() {
      return this.width * this.IlI1IllI111lllllIIlllIll();
   }

   public float lll1lI1I1l1l() {
      return this.height * this.IlI1IllI111lllllIIlllIll();
   }

   public float l1l11Il1l11IlllIIllI() {
      return this.field_322 - this.lIl1lllI1IlIl11lI1llllIll();
   }

   public float I1llllIIIIllIl() {
      return this.field_323 - this.l1I11Il1lllI();
   }

   private float lIl1lllI1IlIl11lI1llllIll() {
      return (this.lI11l1IIl1II11l11lI11() - this.width) / 2.0F;
   }

   protected float l1I11Il1lllI() {
      return (this.lll1lI1I1l1l() - this.height) / 2.0F;
   }

   public void StringHolder_8(floatHolder_4 iiii1ilili1l1l1lilli1liliii) {
      float f = this.IlI1IllI111lllllIIlllIll();
      iiii1ilili1l1l1lilli1liliii.lII1I1l1I11111l1llI1();
      iiii1ilili1l1l1lilli1liliii.getMatrices().translate(this.field_322 + this.width / 2.0F, this.field_323 + this.height / 2.0F, 0.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().scale(f, f, 1.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().translate(-this.field_322 - this.width / 2.0F, -this.field_323 - this.height / 2.0F, 0.0F);
      this.StringHolder_8((DrawContextImpl)iiii1ilili1l1l1lilli1liliii);
      iiii1ilili1l1l1lilli1liliii.IIlII1lII1();
   }

   public abstract void StringHolder_8(DrawContextImpl lliii11l1lllil);

   public boolean Spider() {
      return this.ll1lII11I1II1Il;
   }

   public void StringHolder_11(boolean flag) {
      this.ll1lII11I1II1Il = flag;
   }

   public void lI1Il11I1l1III11IIlI1lI1II11I() {
      this.ll1lII11I1II1Il = !this.ll1lII11I1II1Il;
   }

   public List<Setting> getSettings() {
      ArrayList arraylist = new ArrayList();

      for (Class oclass = this.getClass(); oclass != null && HudElement.class.isAssignableFrom(oclass); oclass = oclass.getSuperclass()) {
         Arrays.stream(oclass.getDeclaredFields()).forEach(field -> {
            try {
               field.setAccessible(true);
               if (field.get(this) instanceof Setting l1i111illi1i1) {
                  arraylist.add(l1i111illi1i1);
               }
            } catch (IllegalAccessException illegalaccessexception) {
            }
         });
         if (oclass == HudElement.class) {
            break;
         }
      }

      return arraylist;
   }

   public boolean EventBus(double d0, double d1) {
      float f = this.l1l11Il1l11IlllIIllI();
      float f1 = this.I1llllIIIIllIl();
      return d0 >= (double)f && d0 <= (double)(f + this.lI11l1IIl1II11l11lI11()) && d1 >= (double)f1 && d1 <= (double)(f1 + this.lll1lI1I1l1l());
   }

   public boolean EventTarget(double d0, double d1) {
      float f = this.l1l11Il1l11IlllIIllI();
      float f1 = this.I1llllIIIIllIl();
      float f2 = f + this.lI11l1IIl1II11l11lI11();
      float f3 = f1 + this.lll1lI1I1l1l();
      return d0 >= (double)(f2 - 8.0F) && d0 <= (double)(f2 + 2.0F) && d1 >= (double)(f3 - 8.0F) && d1 <= (double)(f3 + 2.0F);
   }

   protected void EventBus(DrawContextImpl lliii11l1lllil) {
      float f = 5.5F;
      float f1 = 6.0F;
      ByteBufferHolder il1iliilli1l1iill = new ByteBufferHolder(179, 145, 255, 255);
      lliii11l1lllil.EventBus(this.field_322, this.field_323, this.width, this.height, f, floatHolder_5.StringHolder_30(f1), il1iliilli1l1iill);
   }

   public void StringHolder_8(DrawContextImpl lliii11l1lllil, float f, float f1, Interface lil1i1i1l1il, float f2, float f3) {
      float f4 = this.ZenithInternal028(f, f2);
      float f5 = this.EventImpl_21(f1, f3);
      float f6 = this.lI11l1IIl1II11l11lI11();
      float f7 = this.lll1lI1I1l1l();
      Vector2f vector2f = lil1i1i1l1il.StringHolder_4(f4, f5);
      HudElement$EventBus ii11l1l11lil1i1$l1i1illlili = new HudElement$EventBus(this, vector2f.x, 0.0F);
      HudElement$EventBus ii11l1l11lil1i1$l1i1illlili1 = new HudElement$EventBus(this, vector2f.y, 0.0F);
      Vector2f vector2f1 = lil1i1i1l1il.StringHolder_4(f4 + f6, f5 + f7);
      HudElement$EventBus ii11l1l11lil1i1$l1i1illlili2 = new HudElement$EventBus(this, vector2f1.x, -f6);
      HudElement$EventBus ii11l1l11lil1i1$l1i1illlili3 = new HudElement$EventBus(this, vector2f1.y, -f7);
      Vector2f vector2f2 = lil1i1i1l1il.StringHolder_4(f4 + f6 / 2.0F, f5 + f7 / 2.0F);
      HudElement$EventBus ii11l1l11lil1i1$l1i1illlili4 = new HudElement$EventBus(this, vector2f2.x, -f6 / 2.0F);
      HudElement$EventBus ii11l1l11lil1i1$l1i1illlili5 = new HudElement$EventBus(this, vector2f2.y, -f7 / 2.0F);
      this.field_322 = f4 + this.lIl1lllI1IlIl11lI1llllIll();
      this.field_323 = f5 + this.l1I11Il1lllI();
      this.l1l11l111IIl11lI1I1111lII1 = f2;
      this.IlIllI1lI11Ill11llII1111l = f3;
      this.ZenithInternal095(f2, f3);
      HudElement$EventBus ii11l1l11lil1i1$l1i1illlili6 = this.StringHolder_8(
         ii11l1l11lil1i1$l1i1illlili, ii11l1l11lil1i1$l1i1illlili2, ii11l1l11lil1i1$l1i1illlili4
      );
      HudElement$EventBus ii11l1l11lil1i1$l1i1illlili7 = this.StringHolder_8(
         ii11l1l11lil1i1$l1i1illlili1, ii11l1l11lil1i1$l1i1illlili3, ii11l1l11lil1i1$l1i1illlili5
      );
      this.StringHolder_8(lliii11l1lllil, ii11l1l11lil1i1$l1i1illlili6);
      this.EventBus(lliii11l1lllil, ii11l1l11lil1i1$l1i1illlili7);
   }

   private HudElement$EventBus StringHolder_8(
      HudElement$EventBus ii11l1l11lil1i1$l1i1illlili,
      HudElement$EventBus ii11l1l11lil1i1$l1i1illlili1,
      HudElement$EventBus ii11l1l11lil1i1$l1i1illlili2
   ) {
      if (ii11l1l11lil1i1$l1i1illlili.l1II111ll1 != -1.0F) {
         return ii11l1l11lil1i1$l1i1illlili;
      } else {
         return ii11l1l11lil1i1$l1i1illlili1.l1II111ll1 != -1.0F ? ii11l1l11lil1i1$l1i1illlili1 : ii11l1l11lil1i1$l1i1illlili2;
      }
   }

   protected void EventBus(DrawContextImpl lliii11l1lllil, HudElement$EventBus ii11l1l11lil1i1$l1i1illlili) {
      if (ii11l1l11lil1i1$l1i1illlili.l1II111ll1 == -1.0F) {
         this.lllll1I1l1lIIIllII1IIIl11I = ii11l1l11lil1i1$l1i1illlili.l1II111ll1;
      } else {
         float f = this.l1l11l111IIl11lI1I1111lII1 > 0.0F ? this.l1l11l111IIl11lI1I1111lII1 : (float)lliii11l1lllil.getScaledWindowWidth();
         lliii11l1lllil.StringHolder_8(
            this.FinishThread(f),
            ii11l1l11lil1i1$l1i1illlili.l1II111ll1,
            this.ZenithInternal021(f),
            1.0F,
            floatHolder_5.IlI11I1ll1lI1I11IlI1Il1,
            ZenithClient.getInstance()
               .floatHolder_3()
               .getCurrentStyle()
               .getPrimaryColor()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         this.lllll1I1l1lIIIllII1IIIl11I = ii11l1l11lil1i1$l1i1illlili.l1II111ll1 + ii11l1l11lil1i1$l1i1illlili.IllI1IIIlII11;
      }
   }

   protected void StringHolder_8(DrawContextImpl lliii11l1lllil, HudElement$EventBus ii11l1l11lil1i1$l1i1illlili) {
      if (ii11l1l11lil1i1$l1i1illlili.l1II111ll1 == -1.0F) {
         this.llI1I11llIIl1lIII1I11IlllI = ii11l1l11lil1i1$l1i1illlili.l1II111ll1;
      } else {
         float f = this.IlIllI1lI11Ill11llII1111l > 0.0F ? this.IlIllI1lI11Ill11llII1111l : (float)lliii11l1lllil.getScaledWindowHeight();
         lliii11l1lllil.StringHolder_8(
            ii11l1l11lil1i1$l1i1illlili.l1II111ll1,
            this.ZenithException_2(f),
            1.0F,
            this.StringHolder_5(f),
            floatHolder_5.IlI11I1ll1lI1I11IlI1Il1,
            ZenithClient.getInstance()
               .floatHolder_3()
               .getCurrentStyle()
               .getPrimaryColor()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         this.llI1I11llIIl1lIII1I11IlllI = ii11l1l11lil1i1$l1i1illlili.l1II111ll1 + ii11l1l11lil1i1$l1i1illlili.IllI1IIIlII11;
      }
   }

   public void StringHolder_8(float f, float f1) {
      this.field_322 = f;
      this.field_323 = f1;
      float f2 = this.longHolder_6(this.l1l11l111IIl11lI1I1111lII1);
      float f3 = this.ListHolder_6(this.IlIllI1lI11Ill11llII1111l);
      if (f2 > 0.0F && f3 > 0.0F) {
         this.Event(f2, f3);
         this.EventImpl_13(f2, f3);
      }

      this.ZenithInternal095(f2, f3);
   }

   public void EventTarget(float f, float f1) {
      if (!(f1 <= 0.0F) && !(f <= 0.0F)) {
         if (!this.llIII1ll1IlllllIlI()) {
            float f2 = this.l1l11l111IIl11lI1I1111lII1 > 0.0F ? this.l1l11l111IIl11lI1I1111lII1 : f;
            float f3 = this.IlIllI1lI11Ill11llII1111l > 0.0F ? this.IlIllI1lI11Ill11llII1111l : f1;
            this.ZenithInternal095(f2, f3);
         }

         this.l1l11l111IIl11lI1I1111lII1 = f;
         this.IlIllI1lI11Ill11llII1111l = f1;
         float f6;
         float f7;
         if (this.llIII1ll1IlllllIlI()) {
            f6 = this.FinishThread(f) + this.lII1II11IIIII1 * this.ZenithInternal021(f);
            f7 = this.ZenithException_2(f1) + this.l1IlIIllIIl1I1IlII1ll1III1I11 * this.StringHolder_5(f1);
         } else if (this.ll11llIlIIlIIll111l111l != null) {
            float f4 = this.StringHolder_8(this.ll11llIlIIlIIll111l111l, f) + this.l1Il1I1I1lIlI1I1I1l1l11;
            float f5 = this.EventBus(this.ll11llIlIIlIIll111l111l, f1) + this.l1III111I1II1I;
            f6 = f4 - this.lIl1lllI1IlIl11lI1llllIll();
            f7 = f5 - this.l1I11Il1lllI();
         } else {
            f6 = this.l1l11Il1l11IlllIIllI();
            f7 = this.I1llllIIIIllIl();
         }

         this.field_322 = this.ZenithInternal028(f6, f) + this.lIl1lllI1IlIl11lI1llllIll();
         this.field_323 = this.EventImpl_21(f7, f1) + this.l1I11Il1lllI();
      }
   }

   public void Event(float f, float f1) {
      if (!(f <= 0.0F) && !(f1 <= 0.0F)) {
         float f2 = this.ZenithInternal028(this.l1l11Il1l11IlllIIllI(), f);
         float f3 = this.EventImpl_21(this.I1llllIIIIllIl(), f1);
         this.field_322 = f2 + this.lIl1lllI1IlIl11lI1llllIll();
         this.field_323 = f3 + this.l1I11Il1lllI();
      }
   }

   public void llIIl1lllllII() {
      if (this.llI1I11llIIl1lIII1I11IlllI != -1.0F) {
         this.field_322 = this.llI1I11llIIl1lIII1I11IlllI + this.lIl1lllI1IlIl11lI1llllIll();
      }

      if (this.lllll1I1l1lIIIllII1IIIl11I != -1.0F) {
         this.field_323 = this.lllll1I1l1lIIIllII1IIIl11I + this.l1I11Il1lllI();
      }

      float f = this.longHolder_6(this.l1l11l111IIl11lI1I1111lII1);
      float f1 = this.ListHolder_6(this.IlIllI1lI11Ill11llII1111l);
      if (f > 0.0F && f1 > 0.0F) {
         this.Event(f, f1);
         this.EventImpl_13(f, f1);
      }

      this.llI1I11llIIl1lIII1I11IlllI = -1.0F;
      this.lllll1I1l1lIIIllII1IIIl11I = -1.0F;
      this.ZenithInternal095(f, f1);
   }

   private HudElement$II1Il11l111II11IIl StringHolder_5(float f, float f1, float f2, float f3) {
      float f4 = this.FinishThread(f2);
      float f5 = this.ZenithException_2(f3);
      float f6 = this.ZenithInternal021(f2);
      float f7 = this.StringHolder_5(f3);
      float f8 = f - this.lIl1lllI1IlIl11lI1llllIll();
      float f9 = f1 - this.l1I11Il1lllI();
      float f10 = f8 + this.lI11l1IIl1II11l11lI11() / 2.0F;
      float f11 = f9 + this.lll1lI1I1l1l() / 2.0F;
      boolean flag = f10 < f4 + f6 / 3.0F;
      boolean flag1 = f10 > f4 + f6 * 2.0F / 3.0F;
      boolean flag2 = !flag && !flag1;
      boolean flag3 = f11 < f5 + f7 / 3.0F;
      boolean flag4 = f11 > f5 + f7 * 2.0F / 3.0F;
      boolean flag5 = !flag3 && !flag4;
      if (flag3) {
         if (flag) {
            return HudElement$II1Il11l111II11IIl.Il111lI1lllIIIIll11Il1IIlI;
         } else {
            return flag2 ? HudElement$II1Il11l111II11IIl.IIlII1II1lI : HudElement$II1Il11l111II11IIl.l11l111IllI1lIlIIl1;
         }
      } else if (flag5) {
         if (flag) {
            return HudElement$II1Il11l111II11IIl.IIl1IlI1l11Il;
         } else {
            return flag2 ? HudElement$II1Il11l111II11IIl.llI11IIIl1llII1ll1I1I : HudElement$II1Il11l111II11IIl.Il1I1l1llI1l1lIIIlIlII1II11I1;
         }
      } else if (flag) {
         return HudElement$II1Il11l111II11IIl.ll1ll11lIlll11I1I;
      } else {
         return flag2 ? HudElement$II1Il11l111II11IIl.lIll11III1IllI : HudElement$II1Il11l111II11IIl.l1I1lI1llIlIlI;
      }
   }

   private float StringHolder_8(HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil, float f) {
      float f1 = this.FinishThread(f);
      float f2 = this.ZenithInternal064(f);
      float f3 = f1 + this.ZenithInternal021(f) / 2.0F;
      float f4 = this.lI11l1IIl1II11l11lI11();

      float f5 = switch (ii11l1l11lil1i1$ii1il11l111ii11iil) {
         case Il111lI1lllIIIIll11Il1IIlI, IIl1IlI1l11Il, ll1ll11lIlll11I1I -> f1;
         case IIlII1II1lI, llI11IIIl1llII1ll1I1I, lIll11III1IllI -> f3 - f4 / 2.0F;
         case l11l111IllI1lIlIIl1, Il1I1l1llI1l1lIIIlIlII1II11I1, l1I1lI1llIlIlI -> f2 - f4;
      };
      return f5 + this.lIl1lllI1IlIl11lI1llllIll();
   }

   private float EventBus(HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil, float f) {
      float f1 = this.ZenithException_2(f);
      float f2 = this.ClearHeadersHandler(f);
      float f3 = f1 + this.StringHolder_5(f) / 2.0F;
      float f4 = this.lll1lI1I1l1l();

      float f5 = switch (ii11l1l11lil1i1$ii1il11l111ii11iil) {
         case Il111lI1lllIIIIll11Il1IIlI, IIlII1II1lI, l11l111IllI1lIlIIl1 -> f1;
         case IIl1IlI1l11Il, llI11IIIl1llII1ll1I1I, Il1I1l1llI1l1lIIIlIlII1II11I1 -> f3 - f4 / 2.0F;
         case ll1ll11lIlll11I1I, lIll11III1IllI, l1I1lI1llIlIlI -> f2 - f4;
      };
      return f5 + this.l1I11Il1lllI();
   }

   protected float FinishThread(float f) {
      return 0.0F;
   }

   protected float ZenithInternal064(float f) {
      return this.FinishThread(f) + this.ZenithInternal021(f);
   }

   protected float ZenithInternal021(float f) {
      return f;
   }

   protected float ZenithException_2(float f) {
      return 0.0F;
   }

   protected float ClearHeadersHandler(float f) {
      return this.ZenithException_2(f) + this.StringHolder_5(f);
   }

   protected float StringHolder_5(float f) {
      return f;
   }

   public JsonObject save() {
      if (!this.llIII1ll1IlllllIlI()) {
         this.ZenithInternal095(this.longHolder_6(this.l1l11l111IIl11lI1I1111lII1), this.ListHolder_6(this.IlIllI1lI11Ill11llII1111l));
      }

      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("enable", this.ll1lII11I1II1Il);
      jsonobject.addProperty("enabled", this.ll1lII11I1II1Il);
      jsonobject.addProperty("x", this.field_322);
      jsonobject.addProperty("y", this.field_323);
      jsonobject.addProperty("width", this.width);
      jsonobject.addProperty("height", this.height);
      jsonobject.addProperty("windowWidth", this.l1l11l111IIl11lI1I1111lII1);
      jsonobject.addProperty("windowHeight", this.IlIllI1lI11Ill11llII1111l);
      jsonobject.addProperty("offsetX", this.l1Il1I1I1lIlI1I1I1l1l11);
      jsonobject.addProperty("offsetY", this.l1III111I1II1I);
      jsonobject.addProperty("align", this.ll11llIlIIlIIll111l111l.name());
      if (Float.isFinite(this.lII1II11IIIII1)) {
         jsonobject.addProperty("relativeX", this.lII1II11IIIII1);
      }

      if (Float.isFinite(this.l1IlIIllIIl1I1IlII1ll1III1I11)) {
         jsonobject.addProperty("relativeY", this.l1IlIIllIIl1I1IlII1ll1III1I11);
      }

      JsonObject jsonobject1 = new JsonObject();

      for (Setting l1i111illi1i1 : this.getSettings()) {
         l1i111illi1i1.safe(jsonobject1);
      }

      jsonobject.add("Settings", jsonobject1);
      return jsonobject;
   }

   public void load(JsonObject jsonobject) {
      boolean flag = false;
      boolean flag1 = false;
      boolean flag2 = false;
      if (jsonobject.has("enable")) {
         this.ll1lII11I1II1Il = jsonobject.get("enable").getAsBoolean();
      } else if (jsonobject.has("enabled")) {
         this.ll1lII11I1II1Il = jsonobject.get("enabled").getAsBoolean();
      }

      if (jsonobject.has("x")) {
         this.field_322 = jsonobject.get("x").getAsFloat();
      }

      if (jsonobject.has("y")) {
         this.field_323 = jsonobject.get("y").getAsFloat();
      }

      if (jsonobject.has("width")) {
         this.width = jsonobject.get("width").getAsFloat();
      }

      if (jsonobject.has("height")) {
         this.height = jsonobject.get("height").getAsFloat();
      }

      if (jsonobject.has("windowWidth")) {
         this.l1l11l111IIl11lI1I1111lII1 = jsonobject.get("windowWidth").getAsFloat();
      }

      if (jsonobject.has("windowHeight")) {
         this.IlIllI1lI11Ill11llII1111l = jsonobject.get("windowHeight").getAsFloat();
      }

      if (jsonobject.has("offsetX")) {
         this.l1Il1I1I1lIlI1I1I1l1l11 = jsonobject.get("offsetX").getAsFloat();
         flag1 = true;
      }

      if (jsonobject.has("offsetY")) {
         this.l1III111I1II1I = jsonobject.get("offsetY").getAsFloat();
         flag2 = true;
      }

      if (jsonobject.has("align")) {
         try {
            this.ll11llIlIIlIIll111l111l = HudElement$II1Il11l111II11IIl.valueOf(jsonobject.get("align").getAsString());
            flag = true;
         } catch (IllegalArgumentException illegalargumentexception) {
            this.ll11llIlIIlIIll111l111l = HudElement$II1Il11l111II11IIl.Il111lI1lllIIIIll11Il1IIlI;
         }
      }

      if (jsonobject.has("relativeX")) {
         this.lII1II11IIIII1 = jsonobject.get("relativeX").getAsFloat();
      }

      if (jsonobject.has("relativeY")) {
         this.l1IlIIllIIl1I1IlII1ll1III1I11 = jsonobject.get("relativeY").getAsFloat();
      }

      if (jsonobject.has("Settings") && jsonobject.get("Settings").isJsonObject()) {
         JsonObject jsonobject1 = jsonobject.getAsJsonObject("Settings");

         for (Setting l1i111illi1i1 : this.getSettings()) {
            if (jsonobject1.has(l1i111illi1i1.getName()) || l1i111illi1i1 instanceof ContainerSetting) {
               l1i111illi1i1.load(jsonobject1);
            }
         }
      }

      if (!flag || !flag1 || !flag2) {
         float f = this.longHolder_6(this.l1l11l111IIl11lI1I1111lII1);
         float f1 = this.ListHolder_6(this.IlIllI1lI11Ill11llII1111l);
         this.EventImpl_13(f, f1);
      }

      if (!this.llIII1ll1IlllllIlI()) {
         this.ZenithInternal095(this.longHolder_6(this.l1l11l111IIl11lI1I1111lII1), this.ListHolder_6(this.IlIllI1lI11Ill11llII1111l));
      }

      if (l11I1I1ll1Illll1I1l1111l1II != null && l11I1I1ll1Illll1I1l1111l1II.getWindow() != null) {
         this.EventTarget((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth(), (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight());
      }
   }

   public void EventImpl_24(float f, float f1) {
      this.field_322 = f;
      this.field_323 = f1;
      float f2 = this.longHolder_6(this.l1l11l111IIl11lI1I1111lII1);
      float f3 = this.ListHolder_6(this.IlIllI1lI11Ill11llII1111l);
      if (f2 > 0.0F && f3 > 0.0F) {
         this.Event(f2, f3);
         this.EventImpl_13(f2, f3);
      }

      this.ZenithInternal095(f2, f3);
   }

   protected float ZenithInternal028(float f, float f1) {
      float f2 = this.FinishThread(f1);
      float f3 = this.ZenithInternal064(f1) - this.lI11l1IIl1II11l11lI11();
      if (f3 < f2) {
         f3 = f2;
      }

      return Math.max(f2, Math.min(f, f3));
   }

   protected float EventImpl_21(float f, float f1) {
      float f2 = this.ZenithException_2(f1);
      float f3 = this.ClearHeadersHandler(f1) - this.lll1lI1I1l1l();
      if (f3 < f2) {
         f3 = f2;
      }

      return Math.max(f2, Math.min(f, f3));
   }

   protected boolean llIII1ll1IlllllIlI() {
      return Float.isFinite(this.lII1II11IIIII1) && Float.isFinite(this.l1IlIIllIIl1I1IlII1ll1III1I11);
   }

   protected void ZenithInternal095(float f, float f1) {
      if (!(f <= 0.0F) && !(f1 <= 0.0F)) {
         float f2 = this.ZenithInternal021(f);
         float f3 = this.StringHolder_5(f1);
         if (!(f2 <= 0.0F) && !(f3 <= 0.0F)) {
            float f4 = (this.ZenithInternal028(this.l1l11Il1l11IlllIIllI(), f) - this.FinishThread(f)) / f2;
            float f5 = (this.EventImpl_21(this.I1llllIIIIllIl(), f1) - this.ZenithException_2(f1)) / f3;
            this.lII1II11IIIII1 = Math.max(0.0F, Math.min(1.0F, f4));
            this.l1IlIIllIIl1I1IlII1ll1III1I11 = Math.max(0.0F, Math.min(1.0F, f5));
         }
      }
   }

   protected void EventImpl_13(float f, float f1) {
      if (!(f <= 0.0F) && !(f1 <= 0.0F)) {
         HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil = this.StringHolder_5(this.field_322, this.field_323, f, f1);
         float f2 = this.StringHolder_8(ii11l1l11lil1i1$ii1il11l111ii11iil, f);
         float f3 = this.EventBus(ii11l1l11lil1i1$ii1il11l111ii11iil, f1);
         this.ll11llIlIIlIIll111l111l = ii11l1l11lil1i1$ii1il11l111ii11iil;
         this.l1Il1I1I1lIlI1I1I1l1l11 = this.field_322 - f2;
         this.l1III111I1II1I = this.field_323 - f3;
      }
   }

   protected float longHolder_3(float f) {
      return Math.max(0.0F, this.ZenithInternal021(f) - this.lI11l1IIl1II11l11lI11());
   }

   protected float ZenithInternal070(float f) {
      return Math.max(0.0F, this.StringHolder_5(f) - this.lll1lI1I1l1l());
   }

   protected float longHolder_6(float f) {
      if (f > 0.0F) {
         return f;
      } else if (this.l1l11l111IIl11lI1I1111lII1 > 0.0F) {
         return this.l1l11l111IIl11lI1I1111lII1;
      } else {
         return l11I1I1ll1Illll1I1l1111l1II != null && l11I1I1ll1Illll1I1l1111l1II.getWindow() != null
            ? (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth()
            : f;
      }
   }

   protected float ListHolder_6(float f) {
      if (f > 0.0F) {
         return f;
      } else if (this.IlIllI1lI11Ill11llII1111l > 0.0F) {
         return this.IlIllI1lI11Ill11llII1111l;
      } else {
         return l11I1I1ll1Illll1I1l1111l1II != null && l11I1I1ll1Illll1I1l1111l1II.getWindow() != null
            ? (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight()
            : f;
      }
   }

   protected Vector2f II1IIll1IlI1llII1lIlI1I1() {
      Vector2f Vector2f = ZenithInternal143.ZenithInternal064((double)((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaleFactor()));
      float f = this.IlI1IllI111lllllIIlllIll();
      float f1 = this.field_322 + this.width / 2.0F;
      float f2 = this.field_323 + this.height / 2.0F;
      float f3 = f1 + (Vector2f.getX() - f1) / f;
      float f4 = f2 + (Vector2f.getY() - f2) / f;
      return new Vector2f(f3, f4);
   }

   public String getName() {
      return this.l1l1l11lIII11IIlIIlIllllll;
   }

   public float getX() {
      return this.field_322;
   }

   public float getY() {
      return this.field_323;
   }

   public float getWidth() {
      return this.width;
   }

   public float getHeight() {
      return this.height;
   }

   public NumberSetting IIIlI1I1111l1I1IIll() {
      return this.lII1IlIll11;
   }
}
