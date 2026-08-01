package zenith.hud;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.text.MutableText;
import net.minecraft.client.network.ClientPlayerEntity;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class Notifications extends HudElement {
   private static final int lIl111ll1l111lIIlIlI1I1 = 10;
   private static final float lIlI1111111ll111l1lllIIlIII = 15.0F;
   private static final long Il1lI11111I1IIIl1I1lI111I1l = 600000L;
   private final GetStartTimeHandler l1llII111lIIll = new GetStartTimeHandler(200L, IReturn.ListHolder_8);
   private final Deque<Notifications$II1Il11l111II11IIl> lll1I11l1111II111IlIlI1Il = new ArrayDeque<>();
   private final Set<String> lIIIIl11l111IIIIl1lI1I11I = new HashSet<>();
   private final Map<UUID, Notifications$l1lll11l1l> II11lI11l11IIIllIl11l = new HashMap<>();
   private boolean ll1II1lI1I1Illl11 = false;
   private final MultiBooleanSetting lII1ll11II1ll1I1l111Il1lI = new MultiBooleanSetting("module.interface.notifications.types", "module.interface.notifications.types.desc");
   private final MultiBooleanSetting$II1Il11l111II11IIl l1I11llIIl111llI1IIIll11lI11I = new MultiBooleanSetting$II1Il11l111II11IIl(
      this.lII1ll11II1ll1I1l111Il1lI, "module.interface.notifications.types.modules", true
   );
   private final MultiBooleanSetting$II1Il11l111II11IIl l1IIl1llllIII = new MultiBooleanSetting$II1Il11l111II11IIl(
      this.lII1ll11II1ll1I1l111Il1lI, "module.interface.notifications.types.strength", true
   );
   private final MultiBooleanSetting$II1Il11l111II11IIl lI1I1l1l1I11Il1lI1lll11ll11IlI = new MultiBooleanSetting$II1Il11l111II11IIl(
      this.lII1ll11II1ll1I1l111Il1lI, "module.interface.notifications.types.armor", true
   );
   private final MultiBooleanSetting$II1Il11l111II11IIl lllI1lIIII11l11l1 = new MultiBooleanSetting$II1Il11l111II11IIl(
      this.lII1ll11II1ll1I1l111Il1lI, "module.interface.notifications.types.totems", true
   );
   private final ModeSetting I1IIIlI111IlI11Ill = new ModeSetting(
      "module.interface.notifications.direction",
      "module.interface.notifications.direction.desc",
      "module.interface.notifications.direction.down",
      "module.interface.notifications.direction.up"
   );

   public Notifications(
      String s, float f, float f1, float f2, float f3, float f4, float f5, HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil
   ) {
      super(s, f, f1, f2, f3, f4, f5, ii11l1l11lil1i1$ii1il11l111ii11iil);
      EventBus.StringHolder_8(this);
   }

   public boolean II11lI1lIlIlI1IlllIlII() {
      return this.l1I11llIIl111llI1IIIll11lI11I.Spider();
   }

   public void StringHolder_8(Module ll111il1lliill11, boolean flag) {
      this.StringHolder_8(ll111il1lliill11, flag, 3000L);
   }

   public void StringHolder_8(Module ll111il1lliill11, boolean flag, long i) {
      this.lll1I11l1111II111IlIlI1Il.addLast(new Notifications$EventBus(ll111il1lliill11, flag, i));
   }

   public void EventBus(String s, Text Text) {
      this.EventBus(s, Text, 1500L);
   }

   public void EventBus(String s, Text Text, long i) {
      this.lll1I11l1111II111IlIlI1Il.addLast(new Notifications$EventTarget(s, Text, i));
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_22 l11llilil1) {
      ClientPlayerEntity ClientPlayerEntity = l11I1I1ll1Illll1I1l1111l1II.player;
      if (ClientPlayerEntity != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         if (this.StringHolder_8(this.l1IIl1llllIII)) {
            this.EventBus(ClientPlayerEntity);
         } else {
            this.ll1II1lI1I1Illl11 = false;
         }

         if (this.StringHolder_8(this.lI1I1l1l1I11Il1lI1lll11ll11IlI)) {
            this.EventTarget(ClientPlayerEntity);
         } else {
            this.lIIIIl11l111IIIIl1lI1I11I.clear();
         }

         if (this.StringHolder_8(this.lllI1lIIII11l11l1)) {
            if (ClientPlayerEntity.age % 20 == 0) {
               this.II11lI11l11IIIllIl11l.values().removeIf(Notifications$l1lll11l1l::IlIl11l11ll);
            }
         } else {
            this.II11lI11l11IIIllIl11l.clear();
         }
      } else {
         this.I11llII1IlIll1lllllII1IlI();
      }
   }

   @EventTarget
   public void StringHolder_8(EventImpl_4 i1ii11ilil1il1ii) {
      if (this.StringHolder_8(this.lllI1lIIII11l11l1) && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         EntityStatusS2CPacket EntityStatusS2CPacket = i1ii11ilil1il1ii.Carrotfarm();
         if (EntityStatusS2CPacket.getStatus() == 35) {
            if (EntityStatusS2CPacket.getEntity(l11I1I1ll1Illll1I1l1111l1II.world) instanceof PlayerEntity PlayerEntity
               && PlayerEntity != l11I1I1ll1Illll1I1l1111l1II.player) {
               Notifications$l1lll11l1l ili1111ii1l1li$l1lll11l1l = this.II11lI11l11IIIllIl11l
                  .computeIfAbsent(PlayerEntity.getUuid(), uuid -> new Notifications$l1lll11l1l(this));
               ili1111ii1l1li$l1lll11l1l.ZenithInternal095(PlayerEntity);
               return;
            }
         }
      }
   }

   @Override
   public void StringHolder_8(DrawContextImpl lliii11l1lllil) {
      Font font = Fonts.NEW_MEDIUM.getFont(5.5F);
      this.width = 91.928F;
      this.height = 17.0F;
      long i = System.currentTimeMillis();
      Iterator iterator = this.lll1I11l1111II111IlIlI1Il.iterator();
      this.l1llII111lIIll
         .ZenithInternal101(
            (
                  l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof net.minecraft.client.gui.screen.ChatScreen
                     || ZenithClient.getInstance().ZenithInternal141().isRenderHud()
               )
               && this.lll1I11l1111II111IlIlI1Il.isEmpty()
         );
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      Font font1 = Fonts.NEW_ICONS.getFont(6.0F);
      float f = this.x;
      float f1 = this.y;
      lliii11l1lllil.lII1I1l1I11111l1llI1();
      lliii11l1lllil.getMatrices().translate(this.x + this.width / 2.0F, this.y + this.height / 2.0F, 0.0F);
      lliii11l1lllil.getMatrices().scale(this.l1llII111lIIll.CloudFriendInfo(), this.l1llII111lIIll.CloudFriendInfo(), 1.0F);
      lliii11l1lllil.getMatrices().translate(-(this.x + this.width / 2.0F), -(this.y + this.height / 2.0F), 0.0F);
      float f2 = 17.0F;
      float f3 = Interface.lIl111ll1l111lIIlIlI1I1();
      floatHolder_8.Event(
         lliii11l1lllil.getMatrices(),
         this.x,
         this.y,
         this.width,
         f2,
         21.0F,
         floatHolder_5.StringHolder_30(f3),
         ByteBufferHolder.ll1lIllll111I1lIIl1lIl
      );
      lliii11l1lllil.StringHolder_8(
         this.x, this.y, this.width, f2, floatHolder_5.StringHolder_30(f3), zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.StringHolder_8(
         this.x, this.y, 16.0F, f2, floatHolder_5.StringHolder_30(f3), zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.StringHolder_8(
         font1,
         "A",
         this.x + (16.0F - font1.width("A")) / 2.0F,
         this.y + (f2 - font1.height()) / 2.0F,
         zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.StringHolder_8(
         font,
         "Пример уведомления",
         this.x + 16.0F + (float)(GuiStyle.PADDING * 2),
         this.y + (17.0F - font.height()) / 2.0F,
         zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      f1 += (f2 + 6.0F) * this.l1llII111lIIll.CloudFriendInfo();
      lliii11l1lllil.IIlII1lII1();
      int j = 0;

      while (iterator.hasNext()) {
         Notifications$II1Il11l111II11IIl ili1111ii1l1li$ii1il11l111ii11iil = (Notifications$II1Il11l111II11IIl)iterator.next();
         if (!ili1111ii1l1li$ii1il11l111ii11iil.III1II1Il1
            && i - ili1111ii1l1li$ii1il11l111ii11iil.IIl11I11lI1lI > ili1111ii1l1li$ii1il11l111ii11iil.ll1I111lllIIlIl1I1l1Il1l1) {
            ili1111ii1l1li$ii1il11l111ii11iil.III1II1Il1 = true;
            ili1111ii1l1li$ii1il11l111ii11iil.I1ll1lIIIlllI11l.StringHolder_8(0.0F);
         }

         if (ili1111ii1l1li$ii1il11l111ii11iil.III1II1Il1 && ili1111ii1l1li$ii1il11l111ii11iil.I1ll1lIIIlllI11l.CloudFriendInfo() < 0.01F) {
            iterator.remove();
         } else {
            if (!ili1111ii1l1li$ii1il11l111ii11iil.III1II1Il1) {
               if (ili1111ii1l1li$ii1il11l111ii11iil.IlllIl1lIIlIII1IIIIl11I11I1.ArrayListHolder()
                  && ili1111ii1l1li$ii1il11l111ii11iil.IlllIl1lIIlIII1IIIIl11I11I1.CloudFriendInfo() == 0.0F) {
                  ili1111ii1l1li$ii1il11l111ii11iil.IlllIl1lIIlIII1IIIIl11I11I1.EventTarget((float)j);
               }

               ili1111ii1l1li$ii1il11l111ii11iil.IlllIl1lIIlIII1IIIIl11I11I1.StringHolder_8((float)j);
               j++;
            }

            ili1111ii1l1li$ii1il11l111ii11iil.I1ll1lIIIlllI11l.StringHolder_8(ili1111ii1l1li$ii1il11l111ii11iil.III1II1Il1 ? 0.0F : 1.0F);
         }
      }

      for (Notifications$II1Il11l111II11IIl ili1111ii1l1li$ii1il11l111ii11iil1 : this.lll1I11l1111II111IlIlI1Il) {
         float f4 = 6.0F;
         float f5 = ili1111ii1l1li$ii1il11l111ii11iil1.IlllIl1lIIlIII1IIIIl11I11I1.CloudFriendInfo() * (f2 + f4);
         if (f5 < 100.0F) {
            ili1111ii1l1li$ii1il11l111ii11iil1.StringHolder_8(
               lliii11l1lllil, f, f1 + (this.I1IIIlI111IlI11Ill.ClearHeadersHandler(0) ? f5 : -f5), font, zenithstyle, f2, this
            );
         } else {
            ili1111ii1l1li$ii1il11l111ii11iil1.IIl11I11lI1lI = System.currentTimeMillis();
         }
      }
   }

   private void EventBus(PlayerEntity PlayerEntity) {
      StatusEffectInstance StatusEffectInstance = PlayerEntity.getStatusEffect(StatusEffects.STRENGTH);
      if (StatusEffectInstance == null) {
         this.ll1II1lI1I1Illl11 = false;
      } else {
         int i = StatusEffectInstance.getDuration() / 20;
         if (i <= 10 && !this.ll1II1lI1I1Illl11) {
            this.ll1II1lI1I1Illl11 = true;
            this.EventBus("3", this.ZenithInternal101("Сила заканчивается:", i + " сек"), 3500L);
         }

         if (i > 10) {
            this.ll1II1lI1I1Illl11 = false;
         }
      }
   }

   private void EventTarget(PlayerEntity PlayerEntity) {
      HashSet hashset = new HashSet();

      for (ItemStack ItemStack : PlayerEntity.getArmorItems()) {
         if (ItemStack != null && !ItemStack.isEmpty() && ItemStack.isDamageable()) {
            String s = ItemStack.getItem().getTranslationKey();
            hashset.add(s);
            int i = ItemStack.getMaxDamage();
            if (i > 0) {
               int j = i - ItemStack.getDamage();
               float f = (float)j * 100.0F / (float)i;
               if (f <= 15.0F && !this.lIIIIl11l111IIIIl1lI1I11I.contains(s)) {
                  this.lIIIIl11l111IIIIl1lI1I11I.add(s);
                  this.EventBus(
                     "3",
                     this.ZenithInternal101(
                        "Прочность низкая:", ItemStack.getItem().getName().getString() + " • " + String.format("%.1f", f) + "%"
                     ),
                     3500L
                  );
               }

               if (f > 15.0F) {
                  this.lIIIIl11l111IIIIl1lI1I11I.remove(s);
               }
            }
         }
      }

      this.lIIIIl11l111IIIIl1lI1I11I.retainAll(hashset);
   }

   private boolean StringHolder_8(MultiBooleanSetting$II1Il11l111II11IIl l11i1111l1i$ii1il11l111ii11iil) {
      return l11i1111l1i$ii1il11l111ii11iil.Spider()
         && Interface.ll11lIl1IlIl1lI1.Spider()
         && Interface.ll11lIl1IlIl1lI1.ll1II1lI1I1Illl11()
         && !ZenithInternal066.lII1IlIll11();
   }

   private void I11llII1IlIll1lllllII1IlI() {
      this.ll1II1lI1I1Illl11 = false;
      this.lIIIIl11l111IIIIl1lI1I11I.clear();
      this.II11lI11l11IIIllIl11l.clear();
   }

   private Text ZenithInternal101(String s, String s1) {
      return this.EventBus(
            s,
            ZenithClient.getInstance()
               .floatHolder_3()
               .getCurrentStyle()
               .getTextEnable()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .lllIlll1Ill111l111Il11II11lII()
         )
         .append(Text.literal(" "))
         .append(
            this.EventBus(
               s1,
               ZenithClient.getInstance()
                  .floatHolder_3()
                  .getCurrentStyle()
                  .getTextEnable()
                  .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                  .lllIlll1Ill111l111Il11II11lII()
            )
         );
   }

   private Text StringHolder_8(PlayerEntity PlayerEntity, int i) {
      return this.EventBus(
            PlayerEntity.getGameProfile().getName(),
            ZenithClient.getInstance()
               .floatHolder_3()
               .getCurrentStyle()
               .getPrimaryColor()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .lllIlll1Ill111l111Il11II11lII()
         )
         .append(
            this.EventBus(
               " потерял ",
               ZenithClient.getInstance()
                  .floatHolder_3()
                  .getCurrentStyle()
                  .getTextEnable()
                  .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                  .lllIlll1Ill111l111Il11II11lII()
            )
         )
         .append(
            this.EventBus(
               i + " ",
               ZenithClient.getInstance()
                  .floatHolder_3()
                  .getCurrentStyle()
                  .getPrimaryColor()
                  .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                  .lllIlll1Ill111l111Il11II11lII()
            )
         )
         .append(
            this.EventBus(
               this.StringHolder_11(i) + ".",
               ZenithClient.getInstance()
                  .floatHolder_3()
                  .getCurrentStyle()
                  .getTextEnable()
                  .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                  .lllIlll1Ill111l111Il11II11lII()
            )
         );
   }

   private MutableText EventBus(String s, int i) {
      return Text.literal(s).setStyle(Style.EMPTY.withColor(i));
   }

   private String StringHolder_11(int i) {
      int j = i % 100;
      if (j >= 11 && j <= 14) {
         return "тотемов";
      } else {
         return switch (i % 10) {
            case 1 -> "тотем";
            case 2, 3, 4 -> "тотема";
            default -> "тотемов";
         };
      }
   }
}
