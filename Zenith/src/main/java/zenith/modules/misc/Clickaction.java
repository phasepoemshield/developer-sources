// Module: ClickAction
// Category: misc
// Original class: Clickaction
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.util.hit.EntityHitResult;

@ModuleInfo(
   name = "ClickAction",
   description = "Делает что то по бинду",
   category = Category.MISC
)
public final class Clickaction extends Module {
   private final BindSetting lI111l1I111 = new BindSetting("module.clickAction.friendBind", "module.clickAction.friendBind.desc");
   private final BindSetting I11I1I1l1 = new BindSetting("module.clickAction.expBind", "module.clickAction.expBind.desc");
   private final List<Clickaction$II1Il11l111II11IIl> IlII1llll1lll11lIl1 = new ArrayList<>();
   private final longHolder llIIIl1llll1IlllIlll1II1 = new longHolder();
   public static final Clickaction I1l11l1IIIl1llIlI11II = new Clickaction();
   private Slot l1lIIIIl1I = null;
   private boolean l1llI1II111 = false;

   private Clickaction() {
      this.IlII1llll1lll11lIl1
         .add(
            new Clickaction$II1Il11l111II11IIl(
               Items.ENDER_PEARL, new BindSetting("module.clickAction.enderPearl", "module.clickAction.enderPearl.desc"), new booleanHolder_5()
            )
         );
      this.IlII1llll1lll11lIl1
         .add(
            new Clickaction$II1Il11l111II11IIl(
               Items.WIND_CHARGE, new BindSetting("module.clickAction.windCharge", "module.clickAction.windCharge.desc"), new booleanHolder_5()
            )
         );
   }

   @Override
   public List<Setting> getSettings() {
      ArrayList arraylist = new ArrayList();
      arraylist.add(this.I11I1I1l1);
      arraylist.add(this.lI111l1I111);
      arraylist.addAll(this.IlII1llll1lll11lIl1.stream().map(Clickaction$II1Il11l111II11IIl::II11l11I1111II1lIlIlll111Il).toList());
      return arraylist;
   }

   @EventTarget
   public void StringHolder_8(KeyEvent i111liliill1iii1iiii1) {
      if (i111liliill1iii1iiii1.StringHolder_5(this.lI111l1I111.Elytramotion())
         && l11I1I1ll1Illll1I1l1111l1II.crosshairTarget instanceof EntityHitResult EntityHitResult
         && EntityHitResult.getEntity() instanceof PlayerEntity PlayerEntity) {
         if (ZenithClient.getInstance().StringHolder_26().StringHolder_15(PlayerEntity.getGameProfile().getName())) {
            ZenithClient.getInstance()
               .StringHolder_26()
               .ZenithInternal033(PlayerEntity.getGameProfile().getName());
         } else {
            ZenithClient.getInstance().StringHolder_26().add(PlayerEntity.getGameProfile().getName());
         }
      }

      this.IlII1llll1lll11lIl1
         .stream()
         .filter(
            l1ill1li1il1illiiiilli1$ii1il11l111ii11iil -> i111liliill1iii1iiii1.StringHolder_5(
                     l1ill1li1il1illiiiilli1$ii1il11l111ii11iil.I1lI11ll1111II1111Il1IlIlII1.Elytramotion()
                  )
                  && ListHolder_5.EventImpl_13(l1ill1li1il1illiiiilli1$ii1il11l111ii11iil.lll11lI1I1I) != null
         )
         .forEach(l1ill1li1il1illiiiilli1$ii1il11l111ii11iil -> l1ill1li1il1illiiiilli1$ii1il11l111ii11iil.l1IIIIlIIIl1llI11lI11ll.ZenithInternal023(true));
      this.IlII1llll1lll11lIl1
         .stream()
         .filter(
            l1ill1li1il1illiiiilli1$ii1il11l111ii11iil -> i111liliill1iii1iiii1.longHolder_3(
                  l1ill1li1il1illiiiilli1$ii1il11l111ii11iil.I1lI11ll1111II1111Il1IlIlII1.Elytramotion()
               )
         )
         .forEach(l1ill1li1il1illiiiilli1$ii1il11l111ii11iil -> {
            ListHolder_5.byteHolder_2(l1ill1li1il1illiiiilli1$ii1il11l111ii11iil.lll11lI1I1I);
            l1ill1li1il1illiiiilli1$ii1il11l111ii11iil.l1IIIIlIIIl1llI11lI11ll.ZenithInternal023(false);
         });
      if (i111liliill1iii1iiii1.StringHolder_5(this.I11I1I1l1.Elytramotion())) {
         Slot Slot = ListHolder_5.EventImpl_13(Items.EXPERIENCE_BOTTLE);
         if (Slot == null) {
            ZenithClient.getInstance()
               .ZenithInternal015()
               .StringHolder_8(
                  "M",
                  Text.of(
                     Items.EXPERIENCE_BOTTLE
                        .getName()
                        .copy()
                        .setStyle(
                           Style.EMPTY
                              .withColor(
                                 II1l111II1Il11II111llllIl1.floatHolder_3()
                                    .getCurrentStyle()
                                    .getPrimaryColor()
                                    .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                                    .lllIlll1Ill111l111Il11II11lII()
                              )
                        )
                        .append(
                           Text.of("не найден")
                              .copy()
                              .setStyle(
                                 Style.EMPTY
                                    .withColor(
                                       II1l111II1Il11II111llllIl1.floatHolder_3()
                                          .getCurrentStyle()
                                          .getTextEnable()
                                          .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                                          .lllIlll1Ill111l111Il11II11lII()
                                    )
                              )
                        )
                  )
               );
            return;
         }
      }
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_34 ll1li1l111llllli1) {
      Predictions.l1l1IIIIl1IIllIIIlI
         .StringHolder_8(
            ll1li1l111llllli1.Norender(),
            this.IlII1llll1lll11lIl1
               .stream()
               .filter(l1ill1li1il1illiiiilli1$ii1il11l111ii11iil -> l1ill1li1il1illiiiilli1$ii1il11l111ii11iil.l1IIIIlIIIl1llI11lI11ll.isValue())
               .map(l1ill1li1il1illiiiilli1$ii1il11l111ii11iil -> l1ill1li1il1illiiiilli1$ii1il11l111ii11iil.lll11lI1I1I.getDefaultStack())
               .toList()
         );
   }

   @EventTarget(
      ZenithInternal095 = 4
   )
   public void EventTarget(ZenithInternal111 lii11l11i1lil11ii11ii1il1lll) {
      if (!lii11l11i1lil11ii11ii1il1lll.Event() && l11I1I1ll1Illll1I1l1111l1II.player != null) {
         if (this.l1llI1II111) {
            this.l1llI1II111 = false;
         } else {
            boolean flag = l11I1I1ll1Illll1I1l1111l1II.player.getMainHandStack().getItem().equals(Items.EXPERIENCE_BOTTLE);
            Slot Slot = ListHolder_5.EventImpl_13(Items.EXPERIENCE_BOTTLE);
            if (ZenithInternal066.StringHolder_8(this.I11I1I1l1) && Slot != null) {
               PlayerEntityHolder lll111ll1i1l11l1 = PlayerEntityHolder.FileHolder_2(3);
               floatHolder_6 il1ll111liili1ll11liil = new floatHolder_6(
                  l11I1I1ll1Illll1I1l1111l1II.player.getYaw(),
                  ZenithInternal131.longHolder_6(lll111ll1i1l11l1.IlIIll1l1lllll1I.getCenter()).Basefinder()
               );
               II1ll1II1l11lI.StringHolder_8(
                  new SupplierHolder(
                     il1ll111liili1ll11liil,
                     () -> llI1lIIIlII111I11l1lIIl11.StringHolder_8(llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II(), il1ll111liili1ll11liil),
                     llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II()
                  ),
                  5,
                  this
               );
               if (!flag) {
                  if (ListHolder_8.Event(Clickaction.class)) {
                     ListHolder_8.StringHolder_8(Clickaction.class, () -> {
                        if (this.l1lIIIIl1I == null) {
                           this.l1lIIIIl1I = Slot;
                        }

                        ListHolder_5.StringHolder_8(Slot, Hand.MAIN_HAND, true);
                        this.l1llI1II111 = true;
                     });
                  }
               } else if (this.llIIIl1llll1IlllIlll1II1.HostnameVerifierImpl(70L)
                  && II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1().longHolder_6(il1ll111liili1ll11liil).ZenithInternal042(180.0F, 10.0F)) {
                  ZenithInternal066.EventBus(Hand.MAIN_HAND);
                  lii11l11i1lil11ii11ii1il1lll.ZenithInternal069();
                  this.llIIIl1llll1IlllIlll1II1.reset();
               }
            } else if (this.l1lIIIIl1I != null) {
               ListHolder_8.StringHolder_8(Clickaction.class, () -> {
                  if (!ZenithInternal066.StringHolder_8(this.I11I1I1l1)) {
                     ListHolder_5.StringHolder_8(this.l1lIIIIl1I, Hand.MAIN_HAND, true);
                     this.l1lIIIIl1I = null;
                  }
               });
            }
         }
      }
   }

   public List<Clickaction$II1Il11l111II11IIl> I1II1l1IIl1I1lIIIlIIl1I1III() {
      return Collections.unmodifiableList(this.IlII1llll1lll11lIl1);
   }

   public BindSetting ll111111lI1IllllIll1() {
      return this.I11I1I1l1;
   }
}
