package zenith;

import zenith.hud.*;

import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.IntPredicate;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import net.minecraft.util.Hand;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.inventory.EnderChestInventory;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.Registries;
import net.minecraft.component.DataComponentTypes;

public final class ListHolder_5 implements ZenithInternal140 {
   public static final List<net.minecraft.client.option.KeyBinding> lIIllllllI11Ill = List.of(
      net.minecraft.client.MinecraftClient.getInstance().options.forwardKey,
      net.minecraft.client.MinecraftClient.getInstance().options.backKey,
      net.minecraft.client.MinecraftClient.getInstance().options.leftKey,
      net.minecraft.client.MinecraftClient.getInstance().options.rightKey,
      net.minecraft.client.MinecraftClient.getInstance().options.jumpKey
   );

   public static int EventTarget(Predicate<Slot> predicate) {
      return lIll11III1IllI().filter(predicate).mapToInt(Slot -> Slot.getStack().getCount()).sum();
   }

   public static Slot Il1I1l1llI1l1lIIIlIlII1II11I1() {
      long i = lIll11III1IllI().count();
      int j = i == 46L ? 10 : 9;
      return lIll11III1IllI().toList().get(Math.toIntExact(i - (long)j + (long)l11I1I1ll1Illll1I1l1111l1II.player.getInventory().selectedSlot));
   }

   public static boolean ll1ll11lIlll11I1I() {
      return lIll11III1IllI().toList().size() != 46;
   }

   public static Stream<Slot> lIll11III1IllI() {
      return l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.slots.stream();
   }

   public static void l11l111IllI1lIlIIl1() {
      if (Inventorysetting.ll11II1111ll11I1llI.I111lII1()) {
         ScreenHandler ScreenHandler = l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler;
         ItemStack ItemStack = ((Item)Registries.ITEM.get((int)doubleHolder_3.EventImpl_21(0.0, 100.0))).getDefaultStack();
         l11I1I1ll1Illll1I1l1111l1II.player
            .networkHandler
            .sendPacket(
               new ClickSlotC2SPacket(
                  ScreenHandler.syncId, ScreenHandler.getRevision(), 0, 0, SlotActionType.PICKUP_ALL, ItemStack, Int2ObjectMaps.singleton(0, ItemStack)
               )
            );
      }
   }

   public static void IIl1IlI1l11Il() {
      if (l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler) {
         l11I1I1ll1Illll1I1l1111l1II.player.networkHandler.sendPacket(new CloseHandledScreenC2SPacket(l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.syncId));
      } else {
         l11I1I1ll1Illll1I1l1111l1II.player.closeHandledScreen();
      }
   }

   public static void StringHolder_8(Slot Slot, Hand Hand, boolean flag) {
      if (Slot != null
         && Slot.id != -1
         && (!Hand.equals(Hand.OFF_HAND) || Slot.inventory instanceof PlayerInventory || Slot.inventory instanceof EnderChestInventory)) {
         int i = Hand.equals(Hand.MAIN_HAND) ? l11I1I1ll1Illll1I1l1111l1II.player.getInventory().selectedSlot : 40;
         StringHolder_8(Slot, i, flag);
      }
   }

   public static void StringHolder_8(Slot Slot, int i, boolean flag) {
      StringHolder_8(Slot, i, SlotActionType.SWAP, false);
      if (flag) {
         l11l111IllI1lIlIIl1();
      }
   }

   public static void StringHolder_8(Slot Slot, int i) {
      StringHolder_8(Slot, i, SlotActionType.SWAP, false);
   }

   public static void StringHolder_8(Slot Slot, int i, SlotActionType SlotActionType, boolean flag) {
      if (Slot != null) {
         StringHolder_8(Slot.id, i, SlotActionType, flag);
      }
   }

   public static void StringHolder_8(int i, int j, SlotActionType SlotActionType, boolean flag) {
      StringHolder_8(l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.syncId, i, j, SlotActionType, flag);
   }

   public static void StringHolder_8(int i, int j, int k, SlotActionType SlotActionType, boolean flag) {
      l11I1I1ll1Illll1I1l1111l1II.interactionManager.clickSlot(i, j, k, SlotActionType, l11I1I1ll1Illll1I1l1111l1II.player);
      if (flag) {
         l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.onSlotClick(j, k, SlotActionType, l11I1I1ll1Illll1I1l1111l1II.player);
      }
   }

   public static Slot EventImpl_13(Item Item) {
      return StringHolder_8(Item, (Predicate<Slot>)(Slot -> true));
   }

   public static Slot StringHolder_8(Item Item, Predicate<Slot> predicate) {
      return StringHolder_8(Item, Comparator.comparingInt(Slot -> Slot.id), predicate);
   }

   public static Slot StringHolder_8(ScreenHandler ScreenHandler, Item Item) {
      return ScreenHandler.slots.stream().filter(Slot -> Slot.getStack().getItem() == Item).findFirst().orElse(null);
   }

   public static Slot StringHolder_8(ScreenHandler ScreenHandler, Predicate<Slot> predicate) {
      return (Slot)ScreenHandler.slots.stream().filter(predicate).findFirst().orElse(null);
   }

   public static Slot EventBus(Predicate<Slot> predicate) {
      return lIll11III1IllI().filter(predicate).findFirst().orElse(null);
   }

   public static Slot StringHolder_8(Predicate<Slot> predicate, Comparator<Slot> comparator) {
      return lIll11III1IllI().filter(predicate).max(comparator).orElse(null);
   }

   public static Slot StringHolder_8(ScreenHandler ScreenHandler, Item Item, Comparator<Slot> comparator, Predicate<Slot> predicate) {
      return ScreenHandler.slots
         .stream()
         .filter(Slot -> Slot.getStack().getItem().equals(Item))
         .filter(predicate)
         .max(comparator)
         .orElse(null);
   }

   public static Slot StringHolder_8(Item Item, Comparator<Slot> comparator, Predicate<Slot> predicate) {
      return lIll11III1IllI().filter(Slot -> Slot.getStack().getItem().equals(Item)).filter(predicate).max(comparator).orElse(null);
   }

   public static Slot llI11IIIl1llII1ll1I1I() {
      return lIll11III1IllI()
         .filter(
            Slot -> Slot.getStack().get(DataComponentTypes.FOOD) != null
                  && !((FoodComponent)Slot.getStack().get(DataComponentTypes.FOOD)).canAlwaysEat()
         )
         .max(Comparator.comparingDouble(Slot -> (double)((FoodComponent)Slot.getStack().get(DataComponentTypes.FOOD)).saturation()))
         .orElse(null);
   }

   public static Slot ClearHeadersHandler(List<Item> list) {
      return lIll11III1IllI().filter(Slot -> list.contains(Slot.getStack().getItem())).findFirst().orElse(null);
   }

   public static Slot StringHolder_8(List<Item> list, Comparator<Slot> comparator) {
      return lIll11III1IllI().filter(Slot -> list.contains(Slot.getStack().getItem())).max(comparator).orElse(null);
   }

   public static Slot EventBus(RegistryEntry<StatusEffect> RegistryEntry) {
      return lIll11III1IllI()
         .filter(
            Slot -> {
               PotionContentsComponent PotionContentsComponent = (PotionContentsComponent)Slot.getStack().get(DataComponentTypes.POTION_CONTENTS);
               return PotionContentsComponent == null
                  ? false
                  : StreamSupport.<StatusEffectInstance>stream(PotionContentsComponent.getEffects().spliterator(), false)
                     .anyMatch(StatusEffectInstance -> StatusEffectInstance.getEffectType().equals(RegistryEntry));
            }
         )
         .findFirst()
         .orElse(null);
   }

   public static Slot StringHolder_8(StatusEffectCategory StatusEffectCategory) {
      return lIll11III1IllI()
         .filter(
            Slot -> {
               ItemStack ItemStack = Slot.getStack();
               PotionContentsComponent PotionContentsComponent = (PotionContentsComponent)ItemStack.get(DataComponentTypes.POTION_CONTENTS);
               if (ItemStack.getItem().equals(Items.SPLASH_POTION) && PotionContentsComponent != null) {
                  StatusEffectCategory StatusEffectCategoryx = StatusEffectCategory.equals(StatusEffectCategory.BENEFICIAL) ? StatusEffectCategory.HARMFUL : StatusEffectCategory.BENEFICIAL;
                  long i = StreamSupport.<StatusEffectInstance>stream(PotionContentsComponent.getEffects().spliterator(), false)
                     .filter(StatusEffectInstance -> ((StatusEffect)StatusEffectInstance.getEffectType().value()).getCategory().equals(StatusEffectCategory))
                     .count();
                  long j = StreamSupport.<StatusEffectInstance>stream(PotionContentsComponent.getEffects().spliterator(), false)
                     .filter(StatusEffectInstance -> ((StatusEffect)StatusEffectInstance.getEffectType().value()).getCategory().equals(StatusEffectCategoryx))
                     .count();
                  return i >= j;
               } else {
                  return false;
               }
            }
         )
         .findFirst()
         .orElse(null);
   }

   public static int Event(Item Item) {
      return IntStream.range(0, 45)
         .filter(i -> Objects.requireNonNull(l11I1I1ll1Illll1I1l1111l1II.player).getInventory().getStack(i).getItem().equals(Item))
         .map(i -> l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(i).getCount())
         .sum();
   }

   public static int StringHolder_5(List<Item> list) {
      return IntStream.range(0, 9)
         .filter(i -> list.contains(l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(i).getItem()))
         .findFirst()
         .orElse(-1);
   }

   public static int StringHolder_8(IntPredicate intpredicate) {
      return IntStream.range(0, 9).filter(intpredicate).findFirst().orElse(-1);
   }

   public static void byteHolder_2(Item Item) {
      StringHolder_8(Item, Hand.MAIN_HAND);
   }

   public static void StringHolder_8(Item Item, Hand Hand) {
      float f = l11I1I1ll1Illll1I1l1111l1II.player.getItemCooldownManager().getCooldownProgress(Item.getDefaultStack(), 0.0F);
      if (f > 0.0F) {
         String s = doubleHolder_3.EventImpl_13((double)f, 0.1) + "с";
         ZenithClient.getInstance()
            .ZenithInternal015()
            .StringHolder_8(
               "N",
               Text.of(
                  Item.getName()
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
                        Text.of("находиться в кд")
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
      } else {
         Slot Slot = EventImpl_13(Item);
         if (Slot == null) {
            ZenithClient.getInstance()
               .ZenithInternal015()
               .StringHolder_8(
                  "M",
                  Text.of(
                     Item.getName()
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
         } else if (l11I1I1ll1Illll1I1l1111l1II.player.isUsingItem()
            && ZenithClient.getInstance().SupplierHolder().III11I1lI1I()) {
            ZenithClient.getInstance()
               .ZenithInternal015()
               .StringHolder_8(
                  "M",
                  Text.of(
                     Text.of("Хавать")
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
                           Text.of("нельзя")
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
         } else {
            AtomicLongHolder$EventBus illlli1liiiil1i1lll111$l1i1illlili = new AtomicLongHolder$EventBus();
            if (!Inventorysetting.ll11II1111ll11I1llI.lII1llIIlII11Ill1I1IlIlIl() && Inventorysetting.ll11II1111ll11I1llI.lIlI1I11111I11lI1()) {
               illlli1liiiil1i1lll111$l1i1illlili.StringHolder_8(ZenithInternal111.class, lii11l11i1lil11ii11ii1il1lll -> {
                  if (lii11l11i1lil11ii11ii1il1lll.Event()) {
                     return false;
                  } else {
                     StringHolder_8(Slot, Hand);
                     IIl1IlI1l11Il();
                     return true;
                  }
               });
            } else {
               int i = Math.toIntExact(lIll11III1IllI().count());
               int j = Slot.id - 36;
               if (Hand == Hand.MAIN_HAND && j >= 0 && j <= 8 && i == 46) {
                  AtomicInteger atomicinteger = new AtomicInteger(l11I1I1ll1Illll1I1l1111l1II.player.inventory.selectedSlot);
                  if (!Inventorysetting.ll11II1111ll11I1llI.lIlI1I11111I11lI1()) {
                     illlli1liiiil1i1lll111$l1i1illlili.StringHolder_8(ZenithInternal111.class, lii11l11i1lil11ii11ii1il1lll -> {
                        atomicinteger.set(l11I1I1ll1Illll1I1l1111l1II.player.inventory.selectedSlot);
                        l11I1I1ll1Illll1I1l1111l1II.player.inventory.setSelectedSlot(j);
                        return true;
                     });
                     illlli1liiiil1i1lll111$l1i1illlili.StringHolder_8(ZenithInternal111.class, lii11l11i1lil11ii11ii1il1lll -> {
                        if (lii11l11i1lil11ii11ii1il1lll.Event()) {
                           return false;
                        } else {
                           ZenithInternal066.EventBus(Hand.MAIN_HAND);
                           if (ZenithClient.getInstance().SupplierHolder().III11I1lI1I()) {
                              l11I1I1ll1Illll1I1l1111l1II.interactionManager.stopUsingItem(l11I1I1ll1Illll1I1l1111l1II.player);
                           }

                           l11I1I1ll1Illll1I1l1111l1II.player.inventory.setSelectedSlot(atomicinteger.get());
                           lii11l11i1lil11ii11ii1il1lll.ZenithInternal069();
                           return true;
                        }
                     });
                  } else {
                     illlli1liiiil1i1lll111$l1i1illlili.StringHolder_8(ZenithInternal111.class, lii11l11i1lil11ii11ii1il1lll -> {
                        if (lii11l11i1lil11ii11ii1il1lll.Event()) {
                           return false;
                        } else {
                           int j1 = l11I1I1ll1Illll1I1l1111l1II.player.inventory.selectedSlot;
                           l11I1I1ll1Illll1I1l1111l1II.player.inventory.setSelectedSlot(j);
                           ZenithInternal066.EventBus(Hand.MAIN_HAND);
                           l11I1I1ll1Illll1I1l1111l1II.player.inventory.setSelectedSlot(j1);
                           lii11l11i1lil11ii11ii1il1lll.ZenithInternal069();
                           return true;
                        }
                     });
                  }
               } else if (!Inventorysetting.ll11II1111ll11I1llI.lIlI1I11111I11lI1()) {
                  if (ListHolder_8.Event(Autototem.class) || Hand != Hand.OFF_HAND) {
                     int k = Hand.equals(Hand.MAIN_HAND) ? l11I1I1ll1Illll1I1l1111l1II.player.getInventory().selectedSlot : 40;
                     int l = l11I1I1ll1Illll1I1l1111l1II.player.getInventory().selectedSlot;
                     illlli1liiiil1i1lll111$l1i1illlili.StringHolder_8(
                        EventImpl_16.class,
                        illil11l111il11ili1il -> {
                           if (!Inventorysetting.ll11II1111ll11I1llI.lII1llIIlII11Ill1I1IlIlIl()
                              || !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.jump()
                                 && !l11I1I1ll1Illll1I1l1111l1II.player.isSprinting()
                                 && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.forward()
                                 && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.backward()
                                 && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.left()
                                 && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.right()) {
                              StringHolder_8(Slot, k, false);
                              IIl1IlI1l11Il();
                              return true;
                           } else {
                              return false;
                           }
                        }
                     );
                     illlli1liiiil1i1lll111$l1i1illlili.StringHolder_8(ZenithInternal111.class, lii11l11i1lil11ii11ii1il1lll -> {
                        if (lii11l11i1lil11ii11ii1il1lll.Event()) {
                           return false;
                        } else {
                           if (Hand == Hand.MAIN_HAND) {
                              l11I1I1ll1Illll1I1l1111l1II.player.getInventory().setSelectedSlot(k);
                              ZenithInternal066.EventBus(Hand);
                              if (ZenithClient.getInstance().SupplierHolder().III11I1lI1I()) {
                                 ZenithInternal066.EventBus(Hand);
                              }

                              l11I1I1ll1Illll1I1l1111l1II.player.getInventory().setSelectedSlot(l);
                              if (ZenithClient.getInstance().SupplierHolder().III11I1lI1I()) {
                                 l11I1I1ll1Illll1I1l1111l1II.interactionManager.stopUsingItem(l11I1I1ll1Illll1I1l1111l1II.player);
                              }
                           } else {
                              ZenithInternal066.EventBus(Hand);
                              if (ZenithClient.getInstance().SupplierHolder().III11I1lI1I()) {
                                 ZenithInternal066.EventBus(Hand);
                              }
                           }

                           lii11l11i1lil11ii11ii1il1lll.ZenithInternal069();
                           return true;
                        }
                     });
                     illlli1liiiil1i1lll111$l1i1illlili.StringHolder_8(
                        EventImpl_16.class,
                        illil11l111il11ili1il -> {
                           if (!Inventorysetting.ll11II1111ll11I1llI.lII1llIIlII11Ill1I1IlIlIl()
                              || !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.jump()
                                 && !l11I1I1ll1Illll1I1l1111l1II.player.isSprinting()
                                 && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.forward()
                                 && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.backward()
                                 && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.left()
                                 && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.right()) {
                              StringHolder_8(Slot, k, false);
                              IIl1IlI1l11Il();
                              return true;
                           } else {
                              return false;
                           }
                        }
                     );
                     if (Inventorysetting.ll11II1111ll11I1llI.lII1llIIlII11Ill1I1IlIlIl()) {
                        illlli1liiiil1i1lll111$l1i1illlili.EventBus(PlayerInputHolder.class, ili11i1il11 -> {
                           ili11i1il11.Creeperfarm();
                           return true;
                        });
                     }
                  }
               } else {
                  illlli1liiiil1i1lll111$l1i1illlili.StringHolder_8(
                     ZenithInternal111.class,
                     lii11l11i1lil11ii11ii1il1lll -> {
                        if (lii11l11i1lil11ii11ii1il1lll.Event()) {
                           return false;
                        } else if (!Inventorysetting.ll11II1111ll11I1llI.lII1llIIlII11Ill1I1IlIlIl()
                           || !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.jump()
                              && !l11I1I1ll1Illll1I1l1111l1II.player.isSprinting()
                              && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.forward()
                              && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.backward()
                              && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.left()
                              && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.right()) {
                           StringHolder_8(Slot, Hand);
                           IIl1IlI1l11Il();
                           return true;
                        } else {
                           return false;
                        }
                     }
                  );
                  if (Inventorysetting.ll11II1111ll11I1llI.lII1llIIlII11Ill1I1IlIlIl()) {
                     illlli1liiiil1i1lll111$l1i1illlili.EventBus(PlayerInputHolder.class, ili11i1il11 -> {
                        ili11i1il11.Creeperfarm();
                        return true;
                     });
                  }
               }
            }

            ZenithClient.getInstance().ModuleHolder().StringHolder_8(illlli1liiiil1i1lll111$l1i1illlili);
         }
      }
   }

   public static void StringHolder_8(Slot Slot, Hand Hand) {
      StringHolder_8(Slot, Hand, false);
      IIl1IlI1l11Il();
      ZenithInternal066.EventBus(Hand);
      StringHolder_8(Slot, Hand, true);
   }

   public static void EventBus(Slot Slot, int i) {
      if (Slot != null) {
         StringHolder_8(Slot.id, i, false, false);
      }
   }

   public static void EventBus(Slot Slot, int i, boolean flag) {
      StringHolder_8(Slot, i, flag, false);
   }

   public static void StringHolder_8(Slot Slot, int i, boolean flag, boolean flag1) {
      if (Slot != null) {
         StringHolder_8(Slot.id, i, flag, flag1);
      }
   }

   public static void StringHolder_8(int i, int j, boolean flag, boolean flag1) {
      if (i != j && i != -1) {
         int k = Math.toIntExact(lIll11III1IllI().count());
         int l = i - 36;
         if (l >= 0 && l <= 8 && k == 46) {
            if (flag) {
               ListHolder_8.StringHolder_8(ListHolder_5.class, () -> StringHolder_8(j, l, SlotActionType.SWAP, false));
            } else {
               StringHolder_8(j, l, SlotActionType.SWAP, false);
               IIl1IlI1l11Il();
            }
         } else if (!Elytrahelper.lIIIlIlllII1I1Il1I1IlI.Spider()
            || j != 6
            || !Elytrahelper.lIIIlIlllII1I1Il1I1IlI.II1lIII1I1111Il1ll11I1I1I1l1()) {
            if (flag) {
               if (Inventorysetting.ll11II1111ll11I1llI.lIlI1I11111I11lI1()) {
                  ListHolder_8.StringHolder_8(ListHolder_5.class, () -> StringHolder_8(i, j, flag1));
               } else {
                  AtomicLongHolder$EventBus illlli1liiiil1i1lll111$l1i1illlili = ZenithClient.getInstance()
                     .ModuleHolder()
                     .EventTarget(ListHolder_5.class)
                     .StringHolder_8(
                        PlayerInputHolder.class,
                        ili11i1il11 -> {
                           if (Inventorysetting.ll11II1111ll11I1llI.lII1llIIlII11Ill1I1IlIlIl()) {
                              ili11i1il11.Creeperfarm();
                              if (l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.jump()
                                 || l11I1I1ll1Illll1I1l1111l1II.player.isSprinting()
                                 || l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.forward()
                                 || l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.backward()
                                 || l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.left()
                                 || l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.right()) {
                                 return false;
                              }
                           }

                           StringHolder_8(i, 0, SlotActionType.SWAP, false);
                           IIl1IlI1l11Il();
                           return true;
                        },
                        0
                     )
                     .StringHolder_8(
                        PlayerInputHolder.class,
                        ili11i1il11 -> {
                           if (Inventorysetting.ll11II1111ll11I1llI.lII1llIIlII11Ill1I1IlIlIl()) {
                              ili11i1il11.Creeperfarm();
                              if (l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.jump()
                                 || l11I1I1ll1Illll1I1l1111l1II.player.isSprinting()
                                 || l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.forward()
                                 || l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.backward()
                                 || l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.left()
                                 || l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.right()) {
                                 return false;
                              }
                           }

                           StringHolder_8(j, 0, SlotActionType.SWAP, false);
                           IIl1IlI1l11Il();
                           StringHolder_8(i, 0, SlotActionType.SWAP, false);
                           IIl1IlI1l11Il();
                           return true;
                        }
                     );
                  ZenithClient.getInstance()
                     .ModuleHolder()
                     .StringHolder_8(illlli1liiiil1i1lll111$l1i1illlili, 0);
               }
            } else {
               StringHolder_8(i, j, flag1);
               IIl1IlI1l11Il();
            }
         }
      }
   }

   public static void StringHolder_8(int i, int j, boolean flag) {
      StringHolder_8(i, 0, SlotActionType.SWAP, false);
      IIl1IlI1l11Il();
      StringHolder_8(j, 0, SlotActionType.SWAP, false);
      StringHolder_8(i, 0, SlotActionType.SWAP, false);
      if (flag) {
         l11l111IllI1lIlIIl1();
      }
   }

   private ListHolder_5() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
