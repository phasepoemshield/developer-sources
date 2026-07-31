package zenith;

import java.util.Comparator;
import java.util.function.Predicate;
import net.minecraft.util.Hand;
import net.minecraft.entity.LivingEntity;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.component.DataComponentTypes;

@ModuleInfo(
   name = "OffHandManager",
   category = Category.COMBAT,
   description = ""
)
public final class Offhandmanager extends Module {
   public static final Offhandmanager Ill1lI1III1 = new Offhandmanager();
   private final ModeSetting llII1I1I1lI1IllIllI = new ModeSetting(
      "module.offhand.swapHealMode",
      "module.offhand.swapHealMode.desc",
      "module.offhand.mode.mythic",
      "module.offhand.mode.legendary",
      "module.offhand.mode.talisman",
      "module.offhand.mode.none"
   );
   private final ModeSetting lllIlll1Ill111l111Il11II11lII = new ModeSetting(
      "module.offhand.swapEnemyMode",
      "module.offhand.swapEnemyMode.desc",
      "module.offhand.mode.cerberus",
      "module.offhand.mode.mythic",
      "module.offhand.mode.legendary",
      "module.offhand.mode.talisman",
      "module.offhand.mode.none"
   );
   private final longHolder l1ll11llI11ll11l = new longHolder();

   private Offhandmanager() {
   }

   public void reset() {
      this.l1ll11llI11ll11l.reset();
   }

   @EventTarget
   public void Event(PlayerInputHolder ili11i1il11) {
      LivingEntity LivingEntity = Aura.ll1II1l1lII11IlII1.lI1IIllII11I();
      if (this.lllIl11lllllllIl1l1Il111lIIl()) {
         Slot Slot;
         if (!this.lllIlll1Ill111l111Il11II11lII.ClearHeadersHandler(4) && LivingEntity != null && this.ZenithInternal095(LivingEntity)) {
            Slot = this.EventBus(this.lllIlll1Ill111l111Il11II11lII);
         } else if (l11I1I1ll1Illll1I1l1111l1II.player.isUsingItem() && !this.llII1I1I1lI1IllIllI.ClearHeadersHandler(3)) {
            Slot = this.EventBus(this.llII1I1I1lI1IllIllI);
            if (Slot == null) {
               return;
            }

            if (!l11I1I1ll1Illll1I1l1111l1II.player.getOffHandStack().equals(Slot.getStack())
               && ListHolder_8.Event(Autototem.class)
               && ListHolder_8.Event(Autoswap.class)
               && ListHolder_8.Event(Offhandmanager.class)) {
               ListHolder_8.StringHolder_8(Offhandmanager.class, () -> {
                  if (ListHolder_8.Event(Autototem.class)) {
                     ListHolder_5.StringHolder_8(Slot, Hand.OFF_HAND, true);
                  }
               });
            }
         } else {
            Slot = null;
         }

         if (Slot != null
            && ListHolder_8.Event(Autototem.class)
            && ListHolder_8.Event(Autoswap.class)
            && ListHolder_8.Event(Offhandmanager.class)) {
            ListHolder_8.StringHolder_8(Offhandmanager.class, () -> {
               if (ListHolder_8.Event(Autototem.class)) {
                  ListHolder_5.StringHolder_8(Slot, Hand.OFF_HAND, true);
               }
            });
         }
      }
   }

   private boolean lllIl11lllllllIl1l1Il111lIIl() {
      return this.l1ll11llI11ll11l.HostnameVerifierImpl(1000L);
   }

   private Slot EventBus(ModeSetting liii11li1iliiiii1l1li) {
      try {
         if (liii11li1iliiiii1l1li.Il1I11IIlllIl111l11I1I11().equals("module.offhand.mode.talisman")) {
            return ListHolder_5.StringHolder_8(
               l11I1I1ll1Illll1I1l1111l1II.player.playerScreenHandler,
               Items.TOTEM_OF_UNDYING,
               Comparator.<Slot, Boolean>comparing(Slot -> !Slot.getStack().hasEnchantments()).thenComparing((Slot, Slot) -> {
                  NbtComponent NbtComponentx = (NbtComponent)Slot.getStack().get(DataComponentTypes.CUSTOM_DATA);
                  NbtComponent NbtComponentx = (NbtComponent)Slotx.getStack().get(DataComponentTypes.CUSTOM_DATA);
                  if (NbtComponentx == null && NbtComponentx != null) {
                     return -1;
                  } else if (NbtComponentx != null && NbtComponentx == null) {
                     return 1;
                  } else if (NbtComponentx == null) {
                     return 0;
                  } else {
                     boolean flag = NbtComponentx.contains("sphereEffect");
                     boolean flag1 = NbtComponentx.contains("sphereEffect");
                     if (flag && !flag1) {
                        return 1;
                     } else if (!flag && flag1) {
                        return -1;
                     } else if (!flag) {
                        return 0;
                     } else {
                        String s1 = NbtComponentx.getNbt().get("sphereEffect").toString();
                        String s2 = NbtComponentx.getNbt().get("sphereEffect").toString();
                        return Integer.compare(s2.length(), s1.length());
                     }
                  }
               }).thenComparingInt(Slot -> Slot.id).reversed(),
               Slot -> true
            );
         } else {
            String s = this.EventImpl_22(liii11li1iliiiii1l1li.Il1I11IIlllIl111l11I1I11());
            return ListHolder_5.StringHolder_8(
               Items.PLAYER_HEAD,
               (Predicate<Slot>)(Slot -> {
                  if (!Slot.getStack().isEmpty()) {
                     NbtComponent NbtComponent = (NbtComponent)Slot.getStack().get(DataComponentTypes.CUSTOM_DATA);
                     if (NbtComponent != null
                        && NbtComponent.getNbt().contains("SkullOwner")
                        && NbtComponent.getNbt().get("SkullOwner").toString().contains(s)) {
                        return true;
                     }
                  }

                  return false;
               })
            );
         }
      } catch (Exception exception) {
         exception.printStackTrace();
         return null;
      }
   }

   private String EventImpl_22(String s) {
      return switch (s) {
         case "module.offhand.mode.cerberus" -> "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjA5NWE3ZmQ5MGRhYTFiYmU3MDY5MDg5NzQwZTA1ZDBiZmM2NjI5NmVlM2M0MGVlNzFhNGUwYTY2MTZiMmJiYyJ9fX0=";
         case "module.offhand.mode.mythic" -> "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmFmZjJlYjQ5OGU1YzZhMDQ0ODRmMGM5Zjc4NWI0NDg0NzlhYjIxM2RmOTVlYzkxMTc2YTMwOGExMmFkZDcwIn19fQ==";
         case "module.offhand.mode.legendary" -> "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGM5MzY1NjQyYzZlZGRjZmVkZjViNWUxNGUyYmM3MTI1N2Q5ZTRhMzM2M2QxMjNjNmYzM2M1NWNhZmJmNmQifX19";
         default -> throw new RuntimeException("Unknown key: " + s);
      };
   }

   private boolean ZenithInternal095(LivingEntity LivingEntity) {
      if (LivingEntity.isUsingItem()) {
         return true;
      } else {
         return LivingEntity.getMainHandStack().getItem() instanceof SwordItem
            ? false
            : LivingEntity.getOffHandStack().getItem() != Items.PLAYER_HEAD || this.Event(LivingEntity.getOffHandStack());
      }
   }

   private boolean Event(ItemStack ItemStack) {
      NbtComponent NbtComponent = (NbtComponent)ItemStack.get(DataComponentTypes.CUSTOM_DATA);
      return NbtComponent != null
         && NbtComponent.getNbt().contains("SkullOwner")
         && NbtComponent.getNbt()
            .get("SkullOwner")
            .toString()
            .contains(
               "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGM5MzY1NjQyYzZlZGRjZmVkZjViNWUxNGUyYmM3MTI1N2Q5ZTRhMzM2M2QxMjNjNmYzM2M1NWNhZmJmNmQifX19"
            );
   }
}
