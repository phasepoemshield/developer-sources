package zenith;

import java.util.List;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.hit.EntityHitResult;

@ModuleInfo(
   name = "ItemUseController",
   description = "",
   category = Category.MISC
)
public final class Itemusecontroller extends Module {
   public static final Itemusecontroller lIl1ll11llIIIIIlIIlII1Ill1l1 = new Itemusecontroller();
   private final BooleanSetting IlI1I11I1111I1I1Illl1lIIl1Il = new BooleanSetting(
      "module.itemUseController.newVersion", "module.itemUseController.newVersion.desc", false
   );
   private final BooleanSetting I11II1ll1II1IllI = new BooleanSetting(
      "module.itemUseController.aim", "module.itemUseController.aim.desc", false
   );
   private final MultiBooleanSetting lI1IIllllIIl1lllll1IIl1lI1 = MultiBooleanSetting.StringHolder_8(
      "module.itemUseController.items",
      "module.itemUseController.items.desc",
      List.of("module.itemUseController.bow", "module.itemUseController.crossbow", "module.itemUseController.snowball", "module.itemUseController.trident")
   );
   private final NumberSetting llll11ll1I1lll = new NumberSetting(
      "module.itemUseController.predictSetting", 3.0F, 0.0F, 6.0F, 1.0F, "module.itemUseController.predictSetting.desc", "t"
   );
   boolean I1l1I1I1l1 = false;
   boolean I1lIllII1lI = false;

   public net.minecraft.util.math.Vec3d StringHolder_8(net.minecraft.util.math.Box Box) {
      return new net.minecraft.util.math.Vec3d(
         MathHelper.lerp(0.5, Box.minX, Box.maxX),
         MathHelper.lerp(0.8, Box.minY, Box.maxY),
         MathHelper.lerp(0.5, Box.minZ, Box.maxZ)
      );
   }

   public boolean lIlll111lIlll1l1l111lI1lI1() {
      ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getMainHandStack();
      Item Item = ItemStack.getItem();
      if (this.lI1IIllllIIl1lllll1IIl1lI1.EventImpl_30("module.itemUseController.bow") && Item == Items.BOW) {
         return true;
      } else if (this.lI1IIllllIIl1lllll1IIl1lI1.EventImpl_30("module.itemUseController.crossbow") && Item == Items.CROSSBOW) {
         return true;
      } else {
         return this.lI1IIllllIIl1lllll1IIl1lI1.EventImpl_30("module.itemUseController.snowball") && Item == Items.SNOWBALL
            ? true
            : this.lI1IIllllIIl1lllll1IIl1lI1.EventImpl_30("module.itemUseController.trident") && Item == Items.TRIDENT;
      }
   }

   private Itemusecontroller() {
   }

   @EventTarget
   public void Event(EventImpl_30 ll1iil11ii) {
      if (!this.IlI1I11I1111I1I1Illl1lIIl1Il.Spider()) {
         this.I1l1I1I1l1 = false;
         if (l11I1I1ll1Illll1I1l1111l1II.getOverlay() == null
            && l11I1I1ll1Illll1I1l1111l1II.currentScreen == null
            && (
               ZenithClient.getInstance().ZenithInternal057().I111Ill1lIllIIIl() != null
                  || this.I11II1ll1II1IllI.Spider() && this.lIlll111lIlll1l1l111lI1lI1()
            )
            && !ZenithClient.getInstance()
               .ZenithInternal057()
               .I111Ill1lIllIIIl()
               .longHolder_6(
                  new floatHolder_6(l11I1I1ll1Illll1I1l1111l1II.player.getYaw(), l11I1I1ll1Illll1I1l1111l1II.player.getPitch())
               )
               .ZenithException(5.0F)
            && (
               l11I1I1ll1Illll1I1l1111l1II.options.useKey.isPressed()
                     && l11I1I1ll1Illll1I1l1111l1II.itemUseCooldown == 0
                     && !l11I1I1ll1Illll1I1l1111l1II.player.isUsingItem()
                     && l11I1I1ll1Illll1I1l1111l1II.player.getMainHandStack().getMaxUseTime(l11I1I1ll1Illll1I1l1111l1II.player) == 0
                  || ZenithClient.getInstance().ModuleHolder().EventImpl_24(ZenithInternal111.class)
            )) {
            floatHolder_6 il1ll111liili1ll11liil = this.ll1Il11ll1l11l1lIl();
            floatHolder_6 il1ll111liili1ll11liil1 = llI1lIIIlII111I11l1lIIl11.StringHolder_8(
               llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II(), il1ll111liili1ll11liil
            );
            ZenithClient.getInstance()
               .ZenithInternal057()
               .StringHolder_8(
                  new SupplierHolder(il1ll111liili1ll11liil1, () -> il1ll111liili1ll11liil1, llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II()), 20, this
               );
            this.I1l1I1I1l1 = true;
         }
      } else if (l11I1I1ll1Illll1I1l1111l1II.getOverlay() == null
         && l11I1I1ll1Illll1I1l1111l1II.currentScreen == null
         && (
            ZenithClient.getInstance().ZenithInternal057().I111Ill1lIllIIIl() != null
               || this.I11II1ll1II1IllI.Spider() && this.lIlll111lIlll1l1l111lI1lI1()
         )
         && (
            l11I1I1ll1Illll1I1l1111l1II.options.useKey.isPressed()
                  && l11I1I1ll1Illll1I1l1111l1II.itemUseCooldown == 0
                  && !l11I1I1ll1Illll1I1l1111l1II.player.isUsingItem()
                  && l11I1I1ll1Illll1I1l1111l1II.player.getMainHandStack().getMaxUseTime(l11I1I1ll1Illll1I1l1111l1II.player) == 0
               || ZenithClient.getInstance().ModuleHolder().EventImpl_24(ZenithInternal111.class)
         )) {
         floatHolder_6 il1ll111liili1ll11liil2 = this.ll1Il11ll1l11l1lIl();
         floatHolder_6 il1ll111liili1ll11liil4 = llI1lIIIlII111I11l1lIIl11.StringHolder_8(
            llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II(), il1ll111liili1ll11liil2
         );
         ZenithClient.getInstance()
            .ZenithInternal057()
            .StringHolder_8(
               new SupplierHolder(il1ll111liili1ll11liil4, () -> il1ll111liili1ll11liil4, llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II()), 20, this
            );
      }

      this.I1lIllII1lI = false;
      if (!l11I1I1ll1Illll1I1l1111l1II.options.useKey.isPressed()
         && l11I1I1ll1Illll1I1l1111l1II.player.isUsingItem()
         && (
            ZenithClient.getInstance().ZenithInternal057().I111Ill1lIllIIIl() != null
               || this.I11II1ll1II1IllI.Spider() && this.lIlll111lIlll1l1l111lI1lI1()
         )) {
         floatHolder_6 il1ll111liili1ll11liil3 = this.ll1Il11ll1l11l1lIl();
         if (!ZenithClient.getInstance()
            .ZenithInternal057()
            .ll1ll1l11l1lllIIIIl1()
            .longHolder_6(this.ll1Il11ll1l11l1lIl())
            .ZenithException(5.0F)) {
            floatHolder_6 il1ll111liili1ll11liil5 = llI1lIIIlII111I11l1lIIl11.StringHolder_8(
               llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II(), il1ll111liili1ll11liil3
            );
            ZenithClient.getInstance()
               .ZenithInternal057()
               .StringHolder_8(
                  new SupplierHolder(il1ll111liili1ll11liil5, () -> il1ll111liili1ll11liil5, llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II()), 20, this
               );
            this.I1lIllII1lI = true;
         }
      }
   }

   @EventTarget
   public void ZenithInternal095(ZenithInternal055 il1ii11111lil1l1llllllli11i) {
      if (!this.IlI1I11I1111I1I1Illl1lIIl1Il.Spider() && this.I1l1I1I1l1) {
         il1ii11111lil1l1llllllli11i.ZenithInternal069();
      }
   }

   private floatHolder_6 ll1Il11ll1l11l1lIl() {
      floatHolder_6 il1ll111liili1ll11liil = new floatHolder_6(
         l11I1I1ll1Illll1I1l1111l1II.player.getYaw(), l11I1I1ll1Illll1I1l1111l1II.player.getPitch()
      );

      try {
         if (this.I11II1ll1II1IllI.Spider() && this.lIlll111lIlll1l1l111lI1lI1()) {
            ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getMainHandStack();
            LivingEntity LivingEntity = Aura.ll1II1l1lII11IlII1.I1IIl11I11l();
            if (!(LivingEntity instanceof PlayerEntity PlayerEntity)) {
               return il1ll111liili1ll11liil;
            } else {
               floatHolder_6 il1ll111liili1ll11liil1 = ZenithInternal131.ZenithInternal070(
                  this.StringHolder_8(
                        this.llll11ll1I1lll.lll1lI1llll1IIllIIIII1lll() == 0.0F
                           ? PlayerEntity.getBoundingBox()
                           : PlayerEntityHolder.ZenithInternal095(PlayerEntity, (int)this.llll11ll1I1lll.lll1lI1llll1IIllIIIII1lll()).IlIIll1l1lllll1I
                     )
                     .subtract(
                        PlayerEntityHolder.FileHolder_2(1)
                           .l1l111I11I1I
                           .add(
                              0.0, (double)l11I1I1ll1Illll1I1l1111l1II.player.getEyeHeight(l11I1I1ll1Illll1I1l1111l1II.player.getPose()), 0.0
                           )
                     )
               );
               float f = il1ll111liili1ll11liil1.AutoBrewing();
               int i = Math.round(il1ll111liili1ll11liil1.Basefinder());
               float f1 = Float.MAX_VALUE;
               floatHolder_6 il1ll111liili1ll11liil2 = il1ll111liili1ll11liil;

               for (int j = 0; j < 90; j++) {
                  int[] aint = new int[]{i + j, i - j};

                  for (int k : aint) {
                     floatHolder_6 il1ll111liili1ll11liil3 = new floatHolder_6(f, (float)k);
                     List list = Predictions.l1l1IIIIl1IIllIIIlI.StringHolder_8(ItemStack, ItemStack.getItem(), il1ll111liili1ll11liil3);
                     if (list != null && !list.isEmpty()) {
                        Object object = list.getFirst();
                        if (object instanceof EntityHitResult) {
                           EntityHitResult EntityHitResult = (EntityHitResult)object;
                           if (EntityHitResult.getEntity().equals(LivingEntity)) {
                              float f2 = Math.abs(il1ll111liili1ll11liil1.Basefinder() - (float)k);
                              if (f2 <= 5.0F) {
                                 return il1ll111liili1ll11liil3;
                              }

                              if (f2 < f1) {
                                 f1 = f2;
                                 il1ll111liili1ll11liil2 = il1ll111liili1ll11liil3;
                              }
                           }
                        }
                     }
                  }
               }

               return il1ll111liili1ll11liil2;
            }
         } else {
            return il1ll111liili1ll11liil;
         }
      } catch (Exception exception) {
         exception.printStackTrace();
         return il1ll111liili1ll11liil;
      }
   }

   @EventTarget
   public void StringHolder_8(ZenithInternal062 ilii1111lllilllilllii) {
      if (this.I1lIllII1lI) {
         ilii1111lllilllilllii.ZenithInternal069();
      }
   }
}
