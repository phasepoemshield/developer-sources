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
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectCategory;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class TargetPotions extends HudElement {
   private static final float llllll1I1II1ll11I11l1l = 17.0F;
   private static final float l11lIll1IlIII1II1I1I11lIII = 7.0F;
   private final GetStartTimeHandler l1I1lIIIl1l1IlIIII11 = new GetStartTimeHandler(200L, 100.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler l1111111llII1lI = new GetStartTimeHandler(200L, 0.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler ll1IlI1 = new GetStartTimeHandler(200L, 0.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler I1l11IIl11IllIl11I11II11l1II1l = new GetStartTimeHandler(150L, IReturn.ListHolder_8);
   private final GetStartTimeHandler Il1I1IIIllIll1 = new GetStartTimeHandler(150L, IReturn.ListHolder_8);
   private final Map<String, TargetPotions$II1Il11l111II11IIl> IlllllIIl1lIIl1lI = new LinkedHashMap<>();
   private final Set<String> lII11IlIl1l1I1IIl11II1llI = new HashSet<>();
   private boolean l1lII1I11 = false;
   private LivingEntity I1I1l1llIl1lI = null;

   public TargetPotions(
      String s, float f, float f1, float f2, float f3, float f4, float f5, HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil
   ) {
      super(s, f, f1, f2, f3, f4, f5, ii11l1l11lil1i1$ii1il11l111ii11iil);
   }

   @Override
   public void StringHolder_8(DrawContextImpl lliii11l1lllil) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         LivingEntity LivingEntityx = null;
         if (Aura.ll1II1l1lII11IlII1.I1IIl11I11l() != null
            && l11I1I1ll1Illll1I1l1111l1II.world.getEntityById(Aura.ll1II1l1lII11IlII1.I1IIl11I11l().getId()) instanceof LivingEntity LivingEntityx
            )
          {
            LivingEntityx = LivingEntityx;
         }

         if (this.I1I1l1llIl1lI != null || LivingEntityx != null) {
            if (LivingEntityx == null) {
               this.l1lII1I11 = true;
               LivingEntityx = this.I1I1l1llIl1lI;
            } else {
               this.l1lII1I11 = false;
            }

            this.I1I1l1llIl1lI = LivingEntityx;
            int i = 0;
            int j = 0;
            if (!this.l1lII1I11 && LivingEntityx != null) {
               this.lII11IlIl1l1I1IIl11II1llI.clear();

               for (StatusEffectInstance StatusEffectInstance : new ArrayList(LivingEntityx.getActiveStatusEffects().values())) {
                  String s = this.EventTarget(StatusEffectInstance);
                  boolean flag = this.StringHolder_8(StatusEffectInstance);
                  this.lII11IlIl1l1I1IIl11II1llI.add(s);
                  if (flag) {
                     i++;
                  } else {
                     j++;
                  }

                  if (!this.IlllllIIl1lIIl1lI.containsKey(s)) {
                     this.IlllllIIl1lIIl1lI.put(s, new TargetPotions$II1Il11l111II11IIl(this, StatusEffectInstance, flag));
                  }
               }
            }

            this.IlllllIIl1lIIl1lI.values().removeIf(TargetPotions$II1Il11l111II11IIl::IlIl11l11ll);
            if (this.IlllllIIl1lIIl1lI.isEmpty()) {
               this.l1111111llII1lI.StringHolder_8(0.0F);
            } else {
               TargetPotions$II1Il11l111II11IIl lilil1i111ll111li11l1l1$ii1il11l111ii11iilxx = this.IlllllIIl1lIIl1lI.values().iterator().next();
               this.l1111111llII1lI
                  .StringHolder_8(
                     this.IlllllIIl1lIIl1lI.size() == 1 && lilil1i111ll111li11l1l1$ii1il11l111ii11iilxx.l11111IllI11llI1I1l.HootBar() == 0.0F ? 0.0F : 1.0F
                  );
            }

            this.I1l11IIl11IllIl11I11II11l1II1l.StringHolder_8(i > 0 ? 1.0F : 0.0F);
            this.Il1I1IIIllIll1.StringHolder_8(j > 0 ? 1.0F : 0.0F);
            List list = this.IlllllIIl1lIIl1lI.values().stream().filter(TargetPotions$II1Il11l111II11IIl::l1lIII1l1I).toList();
            List list1 = this.IlllllIIl1lIIl1lI
               .values()
               .stream()
               .filter(lilil1i111ll111li11l1l1$ii1il11l111ii11iil -> !lilil1i111ll111li11l1l1$ii1il11l111ii11iilxxx.l1lIII1l1I())
               .toList();
            ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
            Font font = Fonts.NEW_ICONS.getFont(5.5F);
            Font font1 = Fonts.NEW_MEDIUM.getFont(5.5F);
            float f = this.x;
            float f1 = this.y;
            float f2 = (float)list.stream()
               .mapToDouble(
                  lilil1i111ll111li11l1l1$ii1il11l111ii11iil -> (double)(
                        (lilil1i111ll111li11l1l1$ii1il11l111ii11iilxxx.getHeight() + (float)GuiStyle.PADDING.intValue())
                           * lilil1i111ll111li11l1l1$ii1il11l111ii11iilxxx.l11111IllI11llI1I1l.CloudFriendInfo()
                     )
               )
               .sum();
            float f3 = (float)list1.stream()
               .mapToDouble(
                  lilil1i111ll111li11l1l1$ii1il11l111ii11iil -> (double)(
                        (lilil1i111ll111li11l1l1$ii1il11l111ii11iilxxx.getHeight() + (float)GuiStyle.PADDING.intValue())
                           * lilil1i111ll111li11l1l1$ii1il11l111ii11iilxxx.l11111IllI11llI1I1l.CloudFriendInfo()
                     )
               )
               .sum();
            float f4 = 17.0F + (float)GuiStyle.PADDING.intValue();
            f4 += (float)(5 + GuiStyle.PADDING) * this.I1l11IIl11IllIl11I11II11l1II1l.CloudFriendInfo();
            f4 += f2;
            f4 += (float)(5 + GuiStyle.PADDING) * this.Il1I1IIIllIll1.CloudFriendInfo();
            f4 += f3;
            float f5 = (float)this.IlllllIIl1lIIl1lI
               .values()
               .stream()
               .mapToDouble(TargetPotions$II1Il11l111II11IIl::IIIlI1lI11l1111IlIl11)
               .max()
               .orElse(100.0);
            float f6 = this.EventTarget("Positive", i);
            float f7 = this.EventTarget("Negative", j);
            float f8 = Math.max(f5, Math.max(f6, f7));
            f8 = this.l1I1lIIIl1l1IlIIII11.StringHolder_8(f8);
            this.width = f8;
            this.height = f4;
            this.ll1IlI1
               .ZenithInternal101(
                  l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof net.minecraft.client.gui.screen.ChatScreen
                     || ZenithClient.getInstance().ZenithInternal141().isRenderHud()
                     || !this.IlllllIIl1lIIl1lI.isEmpty()
               );
            float f9 = Interface.lIl111ll1l111lIIlIlI1I1();
            floatHolder_5 iil11iill1il1l1llilll1l1i1i1 = floatHolder_5.StringHolder_30(f9);
            lliii11l1lllil.lII1I1l1I11111l1llI1();
            lliii11l1lllil.getMatrices().translate(f + f8 / 2.0F, f1 + f4 / 2.0F, 0.0F);
            lliii11l1lllil.getMatrices().scale(this.ll1IlI1.CloudFriendInfo(), this.ll1IlI1.CloudFriendInfo(), 1.0F);
            lliii11l1lllil.getMatrices().translate(-(f + f8 / 2.0F), -(f1 + f4 / 2.0F), 0.0F);
            floatHolder_8.Event(
               lliii11l1lllil.getMatrices(), f, f1, f8, f4, 21.0F, iil11iill1il1l1llilll1l1i1i1, ByteBufferHolder.ll1lIllll111I1lIIl1lIl
            );
            lliii11l1lllil.StringHolder_8(f, f1, f8, f4, iil11iill1il1l1llilll1l1i1i1, zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1());
            lliii11l1lllil.StringHolder_8(
               f, f1, f8, 17.0F, iil11iill1il1l1llilll1l1i1i1, zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
            );
            lliii11l1lllil.StringHolder_8(
               font, "0", f + 8.0F, f1 + (17.0F - font.height()) / 2.0F, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1()
            );
            lliii11l1lllil.StringHolder_8(
               font, "m", f + f8 - 8.0F - font.width("m"), f1 + (17.0F - font.height()) / 2.0F, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1()
            );
            lliii11l1lllil.StringHolder_8(
               font1,
               "Target potions",
               f + 8.0F + font.width("0") + (float)GuiStyle.PADDING.intValue(),
               f1 + (17.0F - font1.height()) / 2.0F,
               zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
            );
            if (this.ll1IlI1.CloudFriendInfo() == 1.0F) {
               float f10 = f1 + 17.0F + (float)GuiStyle.PADDING.intValue();
               lliii11l1lllil.StringHolder_8((int)f, (int)f1, (int)(f + f8), (int)(f1 + f4));
               f10 = this.StringHolder_8(lliii11l1lllil, f, f10, f8, "Positive", i, this.I1l11IIl11IllIl11I11II11l1II1l, zenithstyle);

               for (TargetPotions$II1Il11l111II11IIl lilil1i111ll111li11l1l1$ii1il11l111ii11iil : list) {
                  lilil1i111ll111li11l1l1$ii1il11l111ii11iil.StringHolder_8(lliii11l1lllil, f, f10, f8);
                  f10 += (lilil1i111ll111li11l1l1$ii1il11l111ii11iil.getHeight() + (float)GuiStyle.PADDING.intValue())
                     * lilil1i111ll111li11l1l1$ii1il11l111ii11iil.l11111IllI11llI1I1l.CloudFriendInfo();
               }

               f10 = this.StringHolder_8(lliii11l1lllil, f, f10, f8, "Negative", j, this.Il1I1IIIllIll1, zenithstyle);

               for (TargetPotions$II1Il11l111II11IIl lilil1i111ll111li11l1l1$ii1il11l111ii11iilx : list1) {
                  lilil1i111ll111li11l1l1$ii1il11l111ii11iilx.StringHolder_8(lliii11l1lllil, f, f10, f8);
                  f10 += (lilil1i111ll111li11l1l1$ii1il11l111ii11iilx.getHeight() + (float)GuiStyle.PADDING.intValue())
                     * lilil1i111ll111li11l1l1$ii1il11l111ii11iilx.l11111IllI11llI1I1l.CloudFriendInfo();
               }

               lliii11l1lllil.llIIll1II1l1IIll();
            }

            lliii11l1lllil.IIlII1lII1();
         }
      }
   }

   private float StringHolder_8(
      DrawContextImpl lliii11l1lllil, float f, float f1, float f2, String s, int i, GetStartTimeHandler li1liiliill1, ZenithStyle zenithstyle
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
         lliii11l1lllil.StringHolder_8(
            font, s, f + 8.0F, f1 + (7.0F - font.height()) / 2.0F, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         float f6 = f + f2 - f5 - (float)(GuiStyle.PADDING * 2);
         lliii11l1lllil.StringHolder_8(
            font1, s1, f6 + (f5 - f4) / 2.0F, f1 + (7.0F - font1.height()) / 2.0F, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
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
