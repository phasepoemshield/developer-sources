package zenith;

import java.util.Comparator;
import java.util.function.Predicate;
import net.minecraft.util.Hand;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.component.DataComponentTypes;

@ModuleInfo(
   name = "AutoSwap",
   category = Category.COMBAT,
   description = "Автоматический свап предметов"
)
public final class Autoswap extends Module {
   public static final Autoswap ll1IllI1lI1l = new Autoswap();
   private final ModeSetting IIIlll1l1I1l111IllIIIlIlI = new ModeSetting(
      "module.autoSwap.itemType",
      "module.autoSwap.itemType.desc",
      "module.autoSwap.itemHead",
      "module.autoSwap.itemTotem",
      "module.autoSwap.itemGapple",
      "module.autoSwap.itemShield"
   );
   private final ModeSetting I1II1Il1l1ll11IlIII1IIl1IlIlI = new ModeSetting(
      "module.autoSwap.swapType",
      "module.autoSwap.swapType.desc",
      "module.autoSwap.swapHead",
      "module.autoSwap.swapTotem",
      "module.autoSwap.swapGapple",
      "module.autoSwap.swapShield"
   );
   private final BindSetting l1lIl1IIlII11lIlII11IlII = new BindSetting("module.autoSwap.keyToSwap", "module.autoSwap.keyToSwap.desc", -1);
   private final BindSetting lIIIlll11ll1l = new BindSetting(
      "module.autoSwap.keyToSwapCerb", "module.autoSwap.keyToSwapCerb.desc", -1, () -> II1l111II1Il11II111llllIl1.SupplierHolder().III11I1lI1I()
   );

   private Autoswap() {
   }

   @EventTarget
   public void StringHolder_8(KeyEvent i111liliill1iii1iiii1) {
      if (l11I1I1ll1Illll1I1l1111l1II.currentScreen == null && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler) {
         if (i111liliill1iii1iiii1.Elytrafly() == 1) {
            Slot Slotxxx;
            if (this.lIIIlll11ll1l.Elytramotion() != -1) {
               Slotxxx = ListHolder_5.StringHolder_8(
                  Items.PLAYER_HEAD,
                  (Predicate<Slot>)(Slot -> {
                     if (!Slotxxxx.getStack().isEmpty()) {
                        NbtComponent NbtComponent = (NbtComponent)Slotxxxx.getStack().get(DataComponentTypes.CUSTOM_DATA);
                        if (NbtComponent != null
                           && NbtComponent.getNbt().contains("SkullOwner")
                           && NbtComponent.getNbt()
                              .get("SkullOwner")
                              .toString()
                              .contains(
                                 "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjA5NWE3ZmQ5MGRhYTFiYmU3MDY5MDg5NzQwZTA1ZDBiZmM2NjI5NmVlM2M0MGVlNzFhNGUwYTY2MTZiMmJiYyJ9fX0="
                              )) {
                           return true;
                        }
                     }

                     return false;
                  })
               );
            } else {
               Slotxxx = null;
            }

            if (i111liliill1iii1iiii1.StringHolder_5(this.l1lIl1IIlII11lIlII11IlII.Elytramotion())) {
               Slot Slotx = ListHolder_5.StringHolder_8(
                  this.StringHolder_8(this.IIIlll1l1I1l111IllIIIlIlI),
                  Comparator.comparing(Slot -> Slotxxxx.getStack().hasEnchantments()),
                  Slot -> Slotxxxxx != Slotxxx && Slotxxxxx.id != 46 && Slotxxxxx.id != 45
               );
               Slot Slotxx = ListHolder_5.StringHolder_8(
                  this.StringHolder_8(this.I1II1Il1l1ll11IlIII1IIl1IlIlI),
                  Comparator.comparing(Slot -> Slotxxxx.getStack().hasEnchantments()),
                  Slot -> Slotxxxxx != Slotxxx && Slotxxxxx.id != 46 && Slotxxxxx.id != 45
               );
               Slot Slotxxx = Slotx != null
                     && l11I1I1ll1Illll1I1l1111l1II.player.getOffHandStack().getItem() != Slotx.getStack().getItem()
                  ? Slotx
                  : Slotxx;
               if (ListHolder_8.Event(Autototem.class) && ListHolder_8.Event(Autoswap.class)) {
                  ListHolder_8.StringHolder_8(Autoswap.class, () -> {
                     if (ListHolder_8.Event(Autototem.class)) {
                        ListHolder_5.StringHolder_8(Slot, Hand.OFF_HAND, true);
                     }
                  });
                  Offhandmanager.Ill1lI1III1.reset();
               }
            }

            if (i111liliill1iii1iiii1.StringHolder_5(this.lIIIlll11ll1l.Elytramotion())
               && Slotxxx != null
               && ListHolder_8.Event(Autototem.class)
               && ListHolder_8.Event(Autoswap.class)) {
               Offhandmanager.Ill1lI1III1.reset();
               ListHolder_8.StringHolder_8(Autoswap.class, () -> {
                  if (ListHolder_8.Event(Autototem.class)) {
                     ListHolder_5.StringHolder_8(Slotxxx, Hand.OFF_HAND, true);
                  }
               });
            }
         }
      }
   }

   private Item StringHolder_8(ModeSetting liii11li1iliiiii1l1li) {
      return switch (liii11li1iliiiii1l1li.getIndex()) {
         case 0 -> Items.PLAYER_HEAD;
         case 1 -> Items.TOTEM_OF_UNDYING;
         case 2 -> Items.GOLDEN_APPLE;
         case 3 -> Items.SHIELD;
         default -> Items.AIR;
      };
   }
}
