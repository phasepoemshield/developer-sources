package zenith;

import zenith.hud.*;

import java.util.Comparator;
import java.util.List;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.entity.vehicle.TntMinecartEntity;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.component.DataComponentTypes;

@ModuleInfo(
   name = "AutoTotem",
   category = Category.COMBAT,
   description = "При условиях берет тотем в руку"
)
public final class Autototem extends Module {
   public static final Autototem IlII1I1llIllIl1IIl = new Autototem();
   private final NumberSetting lllIll1IlIIII11llll = new NumberSetting(
      "module.autoTotem.healthSetting", 4.0F, 2.0F, 20.0F, 0.5F, "module.autoTotem.healthSetting.desc", "hp"
   );
   private final NumberSetting llIIII11l1lllI1l = new NumberSetting(
      "module.autoTotem.time", 300.0F, 0.0F, 2000.0F, 100.0F, "module.autoTotem.time.desc", "ms"
   );
   private final NumberSetting l111lI11I1 = new NumberSetting(
      "module.autoTotem.elytraHealthSetting", 4.0F, 2.0F, 20.0F, 0.5F, "module.autoTotem.elytraHealthSetting.desc", "hp"
   );
   private final MultiBooleanSetting I11lII1l1l11IlIl1I1l1I1 = MultiBooleanSetting.StringHolder_8(
      "module.autoTotem.triggerSetting",
      "module.autoTotem.triggerSetting.desc",
      List.of("module.autoTotem.triggerCrystal", "module.autoTotem.triggerTNT", "module.autoTotem.trident", "module.autoTotem.minecartTNT")
   );
   private final NumberSetting Ill111IlIll1l1l1l1l1l = new NumberSetting(
      "module.autoTotem.TNTRangeSetting",
      8.0F,
      0.0F,
      50.0F,
      4.0F,
      "module.autoTotem.TNTRangeSetting.desc",
      "b",
      () -> this.I11lII1l1l11IlIl1I1l1I1.ConstructorHolder(1),
      null
   );
   private final NumberSetting lll11III11l1lIl1I11lII11Il = new NumberSetting(
      "module.autoTotem.tridentRangeSetting",
      8.0F,
      0.0F,
      50.0F,
      4.0F,
      "module.autoTotem.tridentRangeSetting.desc",
      "b",
      () -> this.I11lII1l1l11IlIl1I1l1I1.ConstructorHolder(2),
      null
   );
   private Slot l1IIl1IIl1lIlll = null;
   private final longHolder I11I11II1I111llIIII11llIIl1l1l = new longHolder();
   private longHolder I1lI1IlIIllllll1l11IIIII = new longHolder();

   private Autototem() {
   }

   @EventTarget
   public void Event(PacketHolder ii1l11il1i1i) {
   }

   @EventTarget
   public void StringHolder_8(EventImpl_10 iil111l1iil11i1iiii11) {
      this.I1I1111111I1l1lIll11();
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_30 ll1iil11ii) {
      this.I1I1111111I1l1lIll11();
   }

   public void I1I1111111I1l1lIll11() {
      if (this.I1lI1IlIIllllll1l11IIIII == null) {
         this.I1lI1IlIIllllll1l11IIIII = new longHolder();
      }

      if (this.I1IIlI11I()) {
         if (!this.I1lI1IlIIllllll1l11IIIII.HostnameVerifierImpl(400L)) {
            return;
         }

         this.I11I11II1I111llIIII11llIIl1l1l.reset();
         ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getOffHandStack();
         Slot Slotx = ListHolder_5.StringHolder_8(
            l11I1I1ll1Illll1I1l1111l1II.player.playerScreenHandler,
            Items.TOTEM_OF_UNDYING,
            Comparator.<Slot, Boolean>comparing(Slot -> !Slotxx.getStack().hasEnchantments()).thenComparing((Slot, Slot) -> {
               NbtComponent NbtComponentx = (NbtComponent)Slotxx.getStack().get(DataComponentTypes.CUSTOM_DATA);
               NbtComponent NbtComponentx = (NbtComponent)Slotxxx.getStack().get(DataComponentTypes.CUSTOM_DATA);
               if (NbtComponentx == null && NbtComponentx != null) {
                  return -1;
               } else if (NbtComponentx != null && NbtComponentx == null) {
                  return 1;
               } else if (NbtComponentx == null) {
                  return 0;
               } else {
                  boolean flag1 = NbtComponentx.contains("sphereEffect");
                  boolean flag2 = NbtComponentx.contains("sphereEffect");
                  if (flag1 && !flag2) {
                     return 1;
                  } else if (!flag1 && flag2) {
                     return -1;
                  } else if (!flag1) {
                     return 0;
                  } else {
                     String s = NbtComponentx.getNbt().get("sphereEffect").toString();
                     String s1 = NbtComponentx.getNbt().get("sphereEffect").toString();
                     return Integer.compare(s1.length(), s.length());
                  }
               }
            }).thenComparing(Comparator.comparingInt(Slot -> Slotxx.id)),
            Slot -> true
         );
         if (Slotx == null) {
            return;
         }

         boolean flag = ItemStack != Slotx.getStack();
         if (flag && ListHolder_8.ZenithInternal028(Autototem.class)) {
            if (!Inventorysetting.ll11II1111ll11I1llI.lII1llIIlII11Ill1I1IlIlIl()) {
               ListHolder_8.StringHolder_8(Autototem.class, () -> {
               }, 100);
               if (!(l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler)) {
                  ListHolder_5.IIl1IlI1l11Il();
               }

               this.I1lI1IlIIllllll1l11IIIII.reset();
               ListHolder_5.StringHolder_8(Slotx, Hand.OFF_HAND, true);
            } else {
               ListHolder_8.StringHolder_8(Autototem.class, () -> {
                  try {
                     if (!(l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler)) {
                        ListHolder_5.IIl1IlI1l11Il();
                     }
                  } catch (Exception exception) {
                     exception.printStackTrace();
                  }

                  this.I1lI1IlIIllllll1l11IIIII.reset();
                  ListHolder_5.StringHolder_8(Slotx, Hand.OFF_HAND, true);
               }, 100);
            }

            this.l1IIl1IIl1lIlll = Slotx;
         }
      } else if (this.l1IIl1IIl1lIlll != null
         && this.I11I11II1I111llIIII11llIIl1l1l.HostnameVerifierImpl((long)this.llIIII11l1lllI1l.lll1lI1llll1IIllIIIII1lll())
         && ListHolder_8.ZenithInternal028(Autototem.class)) {
         Slot Slotx = this.l1IIl1IIl1lIlll;
         this.l1IIl1IIl1lIlll = null;
         ListHolder_8.StringHolder_8(Autototem.class, () -> {
            if (!(l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler)) {
               ListHolder_5.IIl1IlI1l11Il();
            }

            ListHolder_5.StringHolder_8(Slot, Hand.OFF_HAND, true);
         }, 100);
      }
   }

   public boolean I1IIlI11I() {
      if (ZenithInternal066.lII1IlIll11()) {
         return false;
      } else if (this.Spider() && ListHolder_5.EventImpl_13(Items.TOTEM_OF_UNDYING) != null) {
         boolean flag = l11I1I1ll1Illll1I1l1111l1II.player.getEquippedStack(EquipmentSlot.CHEST).getItem().equals(Items.ELYTRA);
         float f = l11I1I1ll1Illll1I1l1111l1II.player.getHealth() + l11I1I1ll1Illll1I1l1111l1II.player.getAbsorptionAmount();
         if (l11I1I1ll1Illll1I1l1111l1II.player.getItemCooldownManager().isCoolingDown(Items.TOTEM_OF_UNDYING.getDefaultStack())) {
            return false;
         } else if (f < (flag ? this.l111lI11I1.lll1lI1llll1IIllIIIII1lll() : this.lllIll1IlIIII11llll.lll1lI1llll1IIllIIIII1lll())) {
            return true;
         } else if (this.I11lII1l1l11IlIl1I1l1I1.ConstructorHolder(0)
            && ZenithInternal066.l1IlIIllIIl1I1IlII1ll1III1I11()
               .anyMatch(
                  Entity -> Entity instanceof EndCrystalEntity
                        && l11I1I1ll1Illll1I1l1111l1II.player.squaredDistanceTo(Entity) < 25.0
                        && Entity.getY() > l11I1I1ll1Illll1I1l1111l1II.player.getEyeY()
               )) {
            return true;
         } else {
            return this.I11lII1l1l11IlIl1I1l1I1.ConstructorHolder(2)
                  && ZenithInternal066.l1IlIIllIIl1I1IlII1ll1III1I11()
                     .anyMatch(
                        Entity -> Entity instanceof TridentEntity
                              && l11I1I1ll1Illll1I1l1111l1II.player.squaredDistanceTo(Entity)
                                 < (double)this.lll11III11l1lIl1I11lII11Il.lll1lI1llll1IIllIIIII1lll()
                     )
               ? true
               : this.I11lII1l1l11IlIl1I1l1I1.ConstructorHolder(1)
                  && ZenithInternal066.l1IlIIllIIl1I1IlII1ll1III1I11()
                     .anyMatch(
                        Entity -> (
                                 Entity instanceof TntEntity
                                    || Entity instanceof TntMinecartEntity && this.I11lII1l1l11IlIl1I1l1I1.ConstructorHolder(3)
                              )
                              && l11I1I1ll1Illll1I1l1111l1II.player.squaredDistanceTo(Entity)
                                 < (double)(this.Ill111IlIll1l1l1l1l1l.lll1lI1llll1IIllIIIII1lll() * this.Ill111IlIll1l1l1l1l1l.lll1lI1llll1IIllIIIII1lll())
                     );
         }
      } else {
         return false;
      }
   }

   public NumberSetting lII11l1II11lllI111I1l1I1l1() {
      return this.lllIll1IlIIII11llll;
   }

   public NumberSetting I1I11111I1lIll1() {
      return this.llIIII11l1lllI1l;
   }

   public NumberSetting l1Il1lIlIlI1I11I1IlI1() {
      return this.l111lI11I1;
   }

   public MultiBooleanSetting l1lIlIl1I1() {
      return this.I11lII1l1l11IlIl1I1l1I1;
   }

   public NumberSetting l1lI1Ill11lIII1IIlI1() {
      return this.Ill111IlIll1l1l1l1l1l;
   }

   public NumberSetting lllIII1IIl111l111lI() {
      return this.lll11III11l1lIl1I11lII11Il;
   }

   public Slot lI1llI1lII1l11I1I() {
      return this.l1IIl1IIl1lIlll;
   }

   public longHolder llII1I11ll1I1lI1IIIll1l1I1lI1() {
      return this.I11I11II1I111llIIII11llIIl1l1l;
   }

   public longHolder llIIl1ll1l1() {
      return this.I1lI1IlIIllllll1l11IIIII;
   }
}
