package zenith.hud;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.potion.Potions;
import net.minecraft.network.packet.s2c.play.CooldownUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import net.minecraft.registry.Registries;
import net.minecraft.component.DataComponentTypes;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class Cooldowns extends HudElement {
   private static final float lIIII11IIlIII111 = 17.0F;
   private static final float l111IlI11IlIIll11l1llll = 7.0F;
   private final Map<String, Cooldowns$II1Il11l111II11IIl> lI1IlIlll1IlII11IIIIII1lII = new LinkedHashMap<>();
   private final Map<String, Cooldowns$EventTarget> lIIIlII1ll11 = new LinkedHashMap<>();
   private final Map<String, Cooldowns$EventTarget> Il1lIl1l1lI1111lllll11l1IlIl = new LinkedHashMap<>();
   private final GetStartTimeHandler I1IIlI1IIllll11I1l1lIIl = new GetStartTimeHandler(200L, 100.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler animationScale = new GetStartTimeHandler(200L, 0.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler l11lllIIl1lI11lI = new GetStartTimeHandler(200L, 0.0F, IReturn.ListHolder_8);

   @EventTarget
   public void StringHolder_8(PacketHolder ii1l11il1i1i) {
      if (l11I1I1ll1Illll1I1l1111l1II != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         if (ii1l11il1i1i.Swinganimation() instanceof CooldownUpdateS2CPacket CooldownUpdateS2CPacket) {
            Item Item = (Item)Registries.ITEM.get(CooldownUpdateS2CPacket.cooldownGroup());
            int i = CooldownUpdateS2CPacket.cooldown();
            String s = "vanilla:" + Item.getTranslationKey();
            if (i <= 0) {
               this.Il1lIl1l1lI1111lllll11l1IlIl.remove(s);
               this.lI1IlIlll1IlII11IIIIII1lII.remove(s);
               return;
            }

            long j = l11I1I1ll1Illll1I1l1111l1II.world.getTime();
            this.Il1lIl1l1lI1111lllll11l1IlIl
               .put(s, Cooldowns$EventTarget.StringHolder_8(s, Item.getName().getString(), Item.getDefaultStack(), j, (long)i));
         } else if (ii1l11il1i1i.Swinganimation() instanceof PlayerRespawnS2CPacket) {
            this.Il1lIl1l1lI1111lllll11l1IlIl.clear();
            this.lIIIlII1ll11.clear();
            this.lI1IlIlll1IlII11IIIIII1lII.clear();
         }
      }
   }

   public Cooldowns(
      String s, float f, float f1, float f2, float f3, float f4, float f5, HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil
   ) {
      super(s, f, f1, f2, f3, f4, f5, ii11l1l11lil1i1$ii1il11l111ii11iil);
      EventBus.StringHolder_8(this);
   }

   @EventTarget
   public void ZenithInternal095(PacketHolder ii1l11il1i1i) {
      if (l11I1I1ll1Illll1I1l1111l1II != null && l11I1I1ll1Illll1I1l1111l1II.player != null) {
         ItemStack ItemStackx = l11I1I1ll1Illll1I1l1111l1II.player.getActiveItem();
         if (ItemStackx != null && !ItemStackx.isEmpty()) {
            if (l11I1I1ll1Illll1I1l1111l1II.player.getItemUseTime() >= ItemStackx.getMaxUseTime(l11I1I1ll1Illll1I1l1111l1II.player)) {
               PotionContentsComponent PotionContentsComponent = (PotionContentsComponent)ItemStackx.get(DataComponentTypes.POTION_CONTENTS);
               if (PotionContentsComponent != null && (PotionContentsComponent.getColor() == 33461 || PotionContentsComponent.getColor() == -515037)) {
                  ItemStack ItemStackx = Items.POTION.getDefaultStack();
                  ItemStackx.set(
                     DataComponentTypes.POTION_CONTENTS,
                     new PotionContentsComponent(Optional.of(Potions.SWIFTNESS), Optional.of(PotionContentsComponent.getColor()), List.of(), Optional.empty())
                  );
                  this.StringHolder_8(ItemStackx, "Исцел", 10000L);
               }
            }
         }
      }
   }

   public void StringHolder_8(ItemStack ItemStack, long i) {
      String s = "custom:" + ItemStack.getItem().getTranslationKey();
      this.StringHolder_8(s, ItemStack.getItem().getName().getString(), ItemStack, i);
   }

   public void StringHolder_8(ItemStack ItemStack, String s, long i) {
      this.StringHolder_8("custom:" + s, s, ItemStack, i);
   }

   public void StringHolder_8(String s, String s1, ItemStack ItemStack, long i) {
      if (l11I1I1ll1Illll1I1l1111l1II != null && !this.lI1IlIlll1IlII11IIIIII1lII.containsKey(s)) {
         long j = System.nanoTime();
         this.lIIIlII1ll11.put(s, Cooldowns$EventTarget.EventBus(s, s1, ItemStack, j, Math.max(1L, i) * 1000000L));
      }
   }

   public void EventBus(String s, String s1, ItemStack ItemStack, long i) {
      if (l11I1I1ll1Illll1I1l1111l1II != null && l11I1I1ll1Illll1I1l1111l1II.world != null && !this.lI1IlIlll1IlII11IIIIII1lII.containsKey(s)) {
         long j = l11I1I1ll1Illll1I1l1111l1II.world.getTime();
         this.lIIIlII1ll11.put(s, Cooldowns$EventTarget.StringHolder_8(s, s1, ItemStack, j, Math.max(1L, i)));
      }
   }

   @Override
   public void StringHolder_8(DrawContextImpl lliii11l1lllil) {
      if (l11I1I1ll1Illll1I1l1111l1II != null) {
         this.IlI1Il1I11();
         if (this.lI1IlIlll1IlII11IIIIII1lII.isEmpty()) {
            this.animationScale.StringHolder_8(0.0F);
         } else {
            Cooldowns$II1Il11l111II11IIl lilliiill11llilll1ll1l$ii1il11l111ii11iilx = this.lI1IlIlll1IlII11IIIIII1lII.values().iterator().next();
            this.animationScale
               .StringHolder_8(
                  this.lI1IlIlll1IlII11IIIIII1lII.size() == 1 && lilliiill11llilll1ll1l$ii1il11l111ii11iilx.IIlIIl1Ill1ll1l1lI.HootBar() == 0.0F
                     ? 0.0F
                     : 1.0F
               );
         }

         ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
         Font font = Fonts.NEW_ICONS.getFont(5.5F);
         Font font1 = Fonts.NEW_MEDIUM.getFont(5.5F);
         float f = this.x;
         float f1 = this.y;
         float f2 = (float)(
            (double)(17.0F + (float)GuiStyle.PADDING.intValue())
               + this.lI1IlIlll1IlII11IIIIII1lII
                  .values()
                  .stream()
                  .mapToDouble(
                     lilliiill11llilll1ll1l$ii1il11l111ii11iil -> (double)(
                           (lilliiill11llilll1ll1l$ii1il11l111ii11iilxx.getHeight() + (float)GuiStyle.PADDING.intValue())
                              * lilliiill11llilll1ll1l$ii1il11l111ii11iilxx.IIlIIl1Ill1ll1l1lI.CloudFriendInfo()
                        )
                  )
                  .sum()
         );
         float f3 = (float)this.lI1IlIlll1IlII11IIIIII1lII
            .values()
            .stream()
            .mapToDouble(Cooldowns$II1Il11l111II11IIl::IIIlI1lI11l1111IlIl11)
            .max()
            .orElse(100.0);
         f3 = this.I1IIlI1IIllll11I1l1lIIl.StringHolder_8(f3);
         this.width = f3;
         this.height = f2;
         float f4 = Interface.lIl111ll1l111lIIlIlI1I1();
         this.l11lllIIl1lI11lI
            .ZenithInternal101(
               l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof net.minecraft.client.gui.screen.ChatScreen
                  || ZenithClient.getInstance().ZenithInternal141().isRenderHud()
                  || !this.lI1IlIlll1IlII11IIIIII1lII.isEmpty()
            );
         lliii11l1lllil.lII1I1l1I11111l1llI1();
         lliii11l1lllil.getMatrices().translate(f + f3 / 2.0F, f1 + f2 / 2.0F, 0.0F);
         lliii11l1lllil.getMatrices().scale(this.l11lllIIl1lI11lI.CloudFriendInfo(), this.l11lllIIl1lI11lI.CloudFriendInfo(), 1.0F);
         lliii11l1lllil.getMatrices().translate(-(f + f3 / 2.0F), -(f1 + f2 / 2.0F), 0.0F);
         floatHolder_5 iil11iill1il1l1llilll1l1i1i1 = floatHolder_5.StringHolder_30(f4);
         floatHolder_8.Event(
            lliii11l1lllil.getMatrices(), f, f1, f3, f2, 21.0F, iil11iill1il1l1llilll1l1i1i1, ByteBufferHolder.ll1lIllll111I1lIIl1lIl
         );
         lliii11l1lllil.StringHolder_8(f, f1, f3, f2, iil11iill1il1l1llilll1l1i1i1, zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1());
         lliii11l1lllil.StringHolder_8(
            f, f1, f3, 17.0F, iil11iill1il1l1llilll1l1i1i1, zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         lliii11l1lllil.StringHolder_8(
            font, "n", f + 8.0F, f1 + (17.0F - font.height()) / 2.0F, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         lliii11l1lllil.StringHolder_8(
            font, "m", f + f3 - 8.0F - font.width("m"), f1 + (17.0F - font.height()) / 2.0F, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         lliii11l1lllil.StringHolder_8(
            font1,
            "Cooldown",
            f + 8.0F + font.width("n") + (float)GuiStyle.PADDING.intValue(),
            f1 + (17.0F - font1.height()) / 2.0F,
            zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         if (this.l11lllIIl1lI11lI.CloudFriendInfo() == 1.0F) {
            float f5 = f1 + 17.0F + (float)GuiStyle.PADDING.intValue();
            lliii11l1lllil.StringHolder_8((int)f, (int)f1, (int)(f + f3), (int)(f1 + f2));

            for (Cooldowns$II1Il11l111II11IIl lilliiill11llilll1ll1l$ii1il11l111ii11iil : this.lI1IlIlll1IlII11IIIIII1lII.values()) {
               lilliiill11llilll1ll1l$ii1il11l111ii11iil.StringHolder_8(lliii11l1lllil, f, f5, f3);
               f5 += (lilliiill11llilll1ll1l$ii1il11l111ii11iil.getHeight() + (float)GuiStyle.PADDING.intValue())
                  * lilliiill11llilll1ll1l$ii1il11l111ii11iil.IIlIIl1Ill1ll1l1lI.CloudFriendInfo();
            }

            lliii11l1lllil.llIIll1II1l1IIll();
         }

         this.lI1IlIlll1IlII11IIIIII1lII.entrySet().removeIf(entry -> entry.getValue().IlIl11l11ll());
         this.II1I1Il1II1llIIIlIl11lll();
         lliii11l1lllil.IIlII1lII1();
      }
   }

   private void IlI1Il1I11() {
      long i = this.III1l1lIl1lI1Il11l1();

      for (Cooldowns$EventTarget lilliiill11llilll1ll1l$illi1l1l1x : this.Il1lIl1l1lI1111lllll11l1IlIl.values()) {
         if (!lilliiill11llilll1ll1l$illi1l1l1x.StringHolder_4(i)) {
            this.lI1IlIlll1IlII11IIIIII1lII
               .computeIfAbsent(lilliiill11llilll1ll1l$illi1l1l1x.IIllIlIll1Il, s -> this.StringHolder_8(lilliiill11llilll1ll1l$illi1l1l1x));
         }
      }

      for (Cooldowns$EventTarget lilliiill11llilll1ll1l$illi1l1l1x : this.lIIIlII1ll11.values()) {
         long j = this.StringHolder_8(lilliiill11llilll1ll1l$illi1l1l1x.II1lI1III1l1IlI1IlIIII);
         if (!lilliiill11llilll1ll1l$illi1l1l1x.StringHolder_4(j)) {
            this.lI1IlIlll1IlII11IIIIII1lII
               .computeIfAbsent(lilliiill11llilll1ll1l$illi1l1l1x.IIllIlIll1Il, s -> this.StringHolder_8(lilliiill11llilll1ll1l$illi1l1l1));
         }
      }
   }

   private Cooldowns$II1Il11l111II11IIl StringHolder_8(Cooldowns$EventTarget lilliiill11llilll1ll1l$illi1l1l1) {
      long i = this.StringHolder_8(lilliiill11llilll1ll1l$illi1l1l1.II1lI1III1l1IlI1IlIIII);
      return new Cooldowns$II1Il11l111II11IIl(
         this,
         lilliiill11llilll1ll1l$illi1l1l1.Il1111l11Il1l1I1I1lII,
         (float)lilliiill11llilll1ll1l$illi1l1l1.llI1111ll11I1IlIlI1lllll1l11,
         lilliiill11llilll1ll1l$illi1l1l1.byteHolder(i),
         (Supplier<Float>)() -> lilliiill11llilll1ll1l$illi1l1l1.byteHolder(
               this.StringHolder_8(lilliiill11llilll1ll1l$illi1l1l1.II1lI1III1l1IlI1IlIIII)
            ),
         (BooleanSupplier)() -> lilliiill11llilll1ll1l$illi1l1l1.StringHolder_4(this.StringHolder_8(lilliiill11llilll1ll1l$illi1l1l1.II1lI1III1l1IlI1IlIIII)),
         () -> lilliiill11llilll1ll1l$illi1l1l1.ZenithInternal128(this.StringHolder_8(lilliiill11llilll1ll1l$illi1l1l1.II1lI1III1l1IlI1IlIIII))
      );
   }

   private void II1I1Il1II1llIIIlIl11lll() {
      long i = this.III1l1lIl1lI1Il11l1();
      this.Il1lIl1l1lI1111lllll11l1IlIl.entrySet().removeIf(entry -> entry.getValue().StringHolder_4(i));
      this.lIIIlII1ll11.entrySet().removeIf(entry -> entry.getValue().StringHolder_4(this.StringHolder_8(entry.getValue().II1lI1III1l1IlI1IlIIII)));
   }

   private long III1l1lIl1lI1Il11l1() {
      return l11I1I1ll1Illll1I1l1111l1II != null && l11I1I1ll1Illll1I1l1111l1II.world != null ? l11I1I1ll1Illll1I1l1111l1II.world.getTime() : 0L;
   }

   private long StringHolder_8(Cooldowns$EventBus lilliiill11llilll1ll1l$l1i1illlili) {
      return lilliiill11llilll1ll1l$l1i1illlili == Cooldowns$EventBus.l111llII ? this.III1l1lIl1lI1Il11l1() : 0L;
   }
}
