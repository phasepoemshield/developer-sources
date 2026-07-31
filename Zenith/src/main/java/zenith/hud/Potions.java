package zenith.hud;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectCategory;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class Potions extends HudElement {
   private static final float IlllIIl1l1 = 17.0F;
   private static final float Ill1111111I1IlIlIIl1l1 = 7.0F;
   private final GetStartTimeHandler l1lIlIl1llIl11IIllllIII111I1l1 = new GetStartTimeHandler(200L, 100.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler llIlIIIIIIIlI1 = new GetStartTimeHandler(200L, 0.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler lI1IlIIlll11l1IIll = new GetStartTimeHandler(200L, 0.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler I1I111II1l1l1llI = new GetStartTimeHandler(150L, IReturn.ListHolder_8);
   private final GetStartTimeHandler ll1Il1lIIlIII1l1Il1I11l1 = new GetStartTimeHandler(150L, IReturn.ListHolder_8);
   private final Map<String, Potions$II1Il11l111II11IIl> II1IllII1l = new LinkedHashMap<>();
   private final Set<String> l111l11llII1Il11 = new HashSet<>();

   public Potions(
      String s, float f, float f1, float f2, float f3, float f4, float f5, HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil
   ) {
      super(s, f, f1, f2, f3, f4, f5, ii11l1l11lil1i1$ii1il11l111ii11iil);
   }

   @Override
   public void StringHolder_8(DrawContextImpl lliii11l1lllil) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
         this.l111l11llII1Il11.clear();
         ArrayList arraylist = new ArrayList(l11I1I1ll1Illll1I1l1111l1II.player.getActiveStatusEffects().values());
         int i = 0;
         int j = 0;

         for (StatusEffectInstance StatusEffectInstance : arraylist) {
            String s = this.EventTarget(StatusEffectInstance);
            boolean flag = this.StringHolder_8(StatusEffectInstance);
            this.l111l11llII1Il11.add(s);
            if (flag) {
               i++;
            } else {
               j++;
            }

            if (!this.II1IllII1l.containsKey(s)) {
               this.II1IllII1l.put(s, new Potions$II1Il11l111II11IIl(this, StatusEffectInstance, flag));
            }
         }

         this.II1IllII1l.values().removeIf(Potions$II1Il11l111II11IIl::IlIl11l11ll);
         if (this.II1IllII1l.isEmpty()) {
            this.llIlIIIIIIIlI1.StringHolder_8(0.0F);
         } else {
            Potions$II1Il11l111II11IIl lill1ii1l111iiiiii1l$ii1il11l111ii11iilx = this.II1IllII1l.values().iterator().next();
            this.llIlIIIIIIIlI1
               .StringHolder_8(
                  this.II1IllII1l.size() == 1 && lill1ii1l111iiiiii1l$ii1il11l111ii11iilx.l1II1ll1lIlllIl11IIl11l11lIlI.HootBar() == 0.0F ? 0.0F : 1.0F
               );
         }

         this.I1I111II1l1l1llI.StringHolder_8(i > 0 ? 1.0F : 0.0F);
         this.ll1Il1lIIlIII1l1Il1I11l1.StringHolder_8(j > 0 ? 1.0F : 0.0F);
         List list = this.II1IllII1l.values().stream().filter(Potions$II1Il11l111II11IIl::l1lIII1l1I).toList();
         List list1 = this.II1IllII1l
            .values()
            .stream()
            .filter(lill1ii1l111iiiiii1l$ii1il11l111ii11iil -> !lill1ii1l111iiiiii1l$ii1il11l111ii11iilxxx.l1lIII1l1I())
            .toList();
         Font font = Fonts.NEW_ICONS.getFont(5.5F);
         Font font1 = Fonts.NEW_MEDIUM.getFont(5.5F);
         ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
         float f = this.x;
         float f1 = this.y;
         float f2 = (float)list.stream()
            .mapToDouble(
               lill1ii1l111iiiiii1l$ii1il11l111ii11iil -> (double)(
                     (lill1ii1l111iiiiii1l$ii1il11l111ii11iilxxx.getHeight() + (float)GuiStyle.PADDING.intValue())
                        * lill1ii1l111iiiiii1l$ii1il11l111ii11iilxxx.l1II1ll1lIlllIl11IIl11l11lIlI.CloudFriendInfo()
                  )
            )
            .sum();
         float f3 = (float)list1.stream()
            .mapToDouble(
               lill1ii1l111iiiiii1l$ii1il11l111ii11iil -> (double)(
                     (lill1ii1l111iiiiii1l$ii1il11l111ii11iilxxx.getHeight() + (float)GuiStyle.PADDING.intValue())
                        * lill1ii1l111iiiiii1l$ii1il11l111ii11iilxxx.l1II1ll1lIlllIl11IIl11l11lIlI.CloudFriendInfo()
                  )
            )
            .sum();
         float f4 = 17.0F + (float)GuiStyle.PADDING.intValue();
         f4 += (float)(5 + GuiStyle.PADDING) * this.I1I111II1l1l1llI.CloudFriendInfo();
         f4 += f2;
         f4 += (float)(5 + GuiStyle.PADDING) * this.ll1Il1lIIlIII1l1Il1I11l1.CloudFriendInfo();
         f4 += f3;
         float f5 = (float)this.II1IllII1l.values().stream().mapToDouble(Potions$II1Il11l111II11IIl::IIIlI1lI11l1111IlIl11).max().orElse(100.0);
         float f6 = this.EventTarget("Positive", i);
         float f7 = this.EventTarget("Negative", j);
         float f8 = Math.max(f5, Math.max(f6, f7));
         f8 = this.l1lIlIl1llIl11IIllllIII111I1l1.StringHolder_8(f8);
         this.width = f8;
         this.height = f4;
         this.lI1IlIIlll11l1IIll
            .ZenithInternal101(
               l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof net.minecraft.client.gui.screen.ChatScreen
                  || ZenithClient.getInstance().ZenithInternal141().isRenderHud()
                  || !this.II1IllII1l.isEmpty()
            );
         float f9 = Interface.lIl111ll1l111lIIlIlI1I1();
         floatHolder_5 iil11iill1il1l1llilll1l1i1i1 = floatHolder_5.StringHolder_30(f9);
         lliii11l1lllil.lII1I1l1I11111l1llI1();
         lliii11l1lllil.getMatrices().translate(f + f8 / 2.0F, f1 + f4 / 2.0F, 0.0F);
         lliii11l1lllil.getMatrices().scale(this.lI1IlIIlll11l1IIll.CloudFriendInfo(), this.lI1IlIIlll11l1IIll.CloudFriendInfo(), 1.0F);
         lliii11l1lllil.getMatrices().translate(-(f + f8 / 2.0F), -(f1 + f4 / 2.0F), 0.0F);
         floatHolder_8.Event(
            lliii11l1lllil.getMatrices(), f, f1, f8, f4, 21.0F, iil11iill1il1l1llilll1l1i1i1, ByteBufferHolder.ll1lIllll111I1lIIl1lIl
         );
         lliii11l1lllil.StringHolder_8(f, f1, f8, f4, iil11iill1il1l1llilll1l1i1i1, zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1());
         lliii11l1lllil.StringHolder_8(
            f, f1, f8, 17.0F, iil11iill1il1l1llilll1l1i1i1, zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         lliii11l1lllil.StringHolder_8(
            font, "o", f + 8.0F, f1 + (17.0F - font.height()) / 2.0F, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         lliii11l1lllil.StringHolder_8(
            font, "m", f + f8 - 8.0F - font.width("m"), f1 + (17.0F - font.height()) / 2.0F, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         lliii11l1lllil.StringHolder_8(
            font1,
            "Potions",
            f + 8.0F + font.width("0") + (float)GuiStyle.PADDING.intValue(),
            f1 + (17.0F - font1.height()) / 2.0F,
            zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         if (this.lI1IlIIlll11l1IIll.CloudFriendInfo() == 1.0F) {
            float f10 = f1 + 17.0F + (float)GuiStyle.PADDING.intValue();
            lliii11l1lllil.StringHolder_8((int)f, (int)f1, (int)(f + f8), (int)(f1 + f4));
            f10 = this.StringHolder_8(lliii11l1lllil, f, f10, f8, "Positive", i, this.I1I111II1l1l1llI, true, zenithstyle);

            for (Potions$II1Il11l111II11IIl lill1ii1l111iiiiii1l$ii1il11l111ii11iil : list) {
               lill1ii1l111iiiiii1l$ii1il11l111ii11iil.StringHolder_8(lliii11l1lllil, f, f10, f8);
               f10 += (lill1ii1l111iiiiii1l$ii1il11l111ii11iil.getHeight() + (float)GuiStyle.PADDING.intValue())
                  * lill1ii1l111iiiiii1l$ii1il11l111ii11iil.l1II1ll1lIlllIl11IIl11l11lIlI.CloudFriendInfo();
            }

            f10 = this.StringHolder_8(lliii11l1lllil, f, f10, f8, "Negative", j, this.ll1Il1lIIlIII1l1Il1I11l1, false, zenithstyle);

            for (Potions$II1Il11l111II11IIl lill1ii1l111iiiiii1l$ii1il11l111ii11iilxx : list1) {
               lill1ii1l111iiiiii1l$ii1il11l111ii11iilxx.StringHolder_8(lliii11l1lllil, f, f10, f8);
               f10 += (lill1ii1l111iiiiii1l$ii1il11l111ii11iilxx.getHeight() + (float)GuiStyle.PADDING.intValue())
                  * lill1ii1l111iiiiii1l$ii1il11l111ii11iilxx.l1II1ll1lIlllIl11IIl11l11lIlI.CloudFriendInfo();
            }

            lliii11l1lllil.llIIll1II1l1IIll();
         }

         lliii11l1lllil.IIlII1lII1();
      }
   }

   private float StringHolder_8(
      DrawContextImpl lliii11l1lllil, float f, float f1, float f2, String s, int i, GetStartTimeHandler li1liiliill1, boolean flag, ZenithStyle zenithstyle
   ) {
      float f3 = li1liiliill1.CloudFriendInfo();
      if (f3 <= 0.0F) {
         return f1;
      } else {
         Font font = Fonts.NEW_REGULAR.getFont(5.4F);
         Font font1 = Fonts.NEW_REGULAR.getFont(5.4F);
         String s1 = String.valueOf(i);
         float f4 = font1.width(s1);
         float f5 = Math.max(7.0F, (float)GuiStyle.PADDING.intValue() + f4);
         lliii11l1lllil.lII1I1l1I11111l1llI1();
         lliii11l1lllil.getMatrices().translate(f + f2 / 2.0F, f1 + 3.5F, 0.0F);
         lliii11l1lllil.getMatrices().scale(f3, f3, 1.0F);
         lliii11l1lllil.getMatrices().translate(-(f + f2 / 2.0F), -(f1 + 3.5F), 0.0F);
         ByteBufferHolder il1iliilli1l1iill = zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1();
         lliii11l1lllil.StringHolder_8(font, s, f + 8.0F, f1 + (7.0F - font.height()) / 2.0F, il1iliilli1l1iill);
         float f6 = f + f2 - f5 - (float)(GuiStyle.PADDING * 2);
         lliii11l1lllil.StringHolder_8(font1, s1, f6 + (f5 - f4) / 2.0F, f1 + (7.0F - font1.height()) / 2.0F, il1iliilli1l1iill);
         lliii11l1lllil.IIlII1lII1();
         return f1 + (float)(5 + GuiStyle.PADDING) * f3;
      }
   }

   private float EventTarget(String s, int i) {
      Font font = Fonts.NEW_MEDIUM.getFont(5.4F);
      Font font1 = Fonts.NEW_SEMIBOLD.getFont(5.4F);
      String s1 = String.valueOf(Math.max(i, 0));
      float f = font1.width(s1);
      float f1 = Math.max(7.0F, (float)GuiStyle.PADDING.intValue() + f);
      float f2 = 8.0F + font.width(s) + (float)GuiStyle.PADDING.intValue();
      float f3 = (float)(GuiStyle.PADDING * 2) + f1 + 8.0F;
      return Math.max(100.0F, f2 + f3 + 8.0F);
   }

   private boolean StringHolder_8(StatusEffectInstance StatusEffectInstance) {
      return ((StatusEffect)StatusEffectInstance.getEffectType().value()).getCategory().equals(StatusEffectCategory.BENEFICIAL);
   }

   private String EventBus(StatusEffectInstance StatusEffectInstance) {
      String s = I18n.translate(((StatusEffect)StatusEffectInstance.getEffectType().value()).getTranslationKey(), new Object[0]);
      String s1 = this.StringHolder_32(StatusEffectInstance.getAmplifier());
      return s + " " + s1;
   }

   private String EventTarget(StatusEffectInstance StatusEffectInstance) {
      return ((StatusEffect)StatusEffectInstance.getEffectType().value()).getTranslationKey() + StatusEffectInstance.getAmplifier();
   }

   private String StringHolder_32(int i) {
      return String.valueOf(i + 1);
   }

   private String StringHolder_12(int i) {
      int j = i / 20;
      int k = j / 60;
      int l = j % 60;
      return String.format("%02d:%02d", k, l);
   }
}
