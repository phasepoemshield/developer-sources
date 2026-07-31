// Module: Auto Brewing
// Category: pve
// Original class: AutoBrewing
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.pve;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.BrewingStandScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.potion.Potions;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.BlockState;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.component.DataComponentTypes;

@ModuleInfo(
   name = "Auto Brewing",
   category = Category.PLAYER,
   description = ""
)
public class AutoBrewing extends Module {
   public static final AutoBrewing IIIl1llII11llIll1 = new AutoBrewing();
   private static final long lllIIll1ll11lIIIlIllIIII1l1II = 50L;
   private static final long llIIl11Il1l11111III1I = 75L;
   private static final long lIIII11IlI1IllI1Ill111 = 20000L;
   private static final long ll111llII1II1 = 1500L;
   private static final int l1l1lII1lllllI1llIll1l = 5;
   private static final int lIlI1Il11 = 3;
   private static final int l111ll1lI1IlI = 4;
   private static final int[] IIIlIIl1I11lI1Illllllll1lI = new int[]{0, 1, 2};
   private static final ModeSetting Il111l11l1 = new ModeSetting(
      "module.autoPotionBrewing.potion",
      "",
      StringHolder_9.ll1I111Il1llIlI1l11IlI1I.IlI1lllII1IllIl11I1lIIIl,
      StringHolder_9.l1lII1Ill.IlI1lllII1IllIl11I1lIIIl,
      StringHolder_9.ll111lIII1l11I1111lllIlII.IlI1lllII1IllIl11I1lIIIl,
      StringHolder_9.ll11llI11IIlIll1.IlI1lllII1IllIl11I1lIIIl,
      StringHolder_9.IIIllllIll111IlIII1lII1.IlI1lllII1IllIl11I1lIIIl
   );
   private final longHolder II1l1II1Illl1IIlI1ll1l1II1 = new longHolder();
   private final List<BlockPos> lIllIIll11IlI1l1II111I = new ArrayList<>();
   private final List<BlockPos> lII1lI1lII1l11IIllIllII = new ArrayList<>();
   private List<Item> ll1lllI1lIIIlI1Il11lI1llII11I = List.of();
   private Map<Item, Integer> II1I11l1I1111IIIlll11Il1l = Map.of();
   private AutoBrewing$EventBus lll1lIl11l = AutoBrewing$EventBus.I11IlII1IIl1;
   private floatHolder_6 l1ll1II111lI;
   private BlockPos I1l1lIlII1l1;
   private BlockPos IIl1IIl11Illl1Il1;
   private int l11l1IllIII11l1l;
   private int I1IIl111I1IIl1IIIllIIllll1;
   private int IlIllIll1llII1IlI1l11;
   private int III1II1llIll1IlIIlIll11I11;
   private int l1I1l11I1ll1IIlllIl11111l11lI;
   private int IllIll1II1IIll1l1IlII1;
   private int Illl1III1I1IIIIlll1III11Ill = -1;
   private int lI111lIlII1IIlllIl1I1ll11lIl = -1;
   private AutoBrewing$l1lll11l1l l111l1lIIl111lI1ll1llIlIlI = AutoBrewing$l1lll11l1l.Il1lIlll1;
   private boolean llllI1IlIIl1I11lIIIl11lIlI;
   private boolean I1lIlllIII1l1lIIlI1Il;
   private AutoBrewing$II1Il11l111II11IIl ll1ll1l11lI1 = AutoBrewing$II1Il11l111II11IIl.II1IIllllI1ll111I11lIIl;

   @Override
   public void onEnable() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.player.networkHandler != null) {
         this.ll1lllI1lIIIlI1Il11lI1llII11I = this.I1IIIII1IIlIIllIlI1I1l1l1lIII();
         this.II1I11l1I1111IIIlll11Il1l = this.ZenithInternal064(this.ll1lllI1lIIIlI1Il11lI1llII11I);
         this.l11l1IllIII11l1l = 0;
         this.I1IIl111I1IIl1IIIllIIllll1 = 0;
         this.IlIllIll1llII1IlI1l11 = 0;
         this.III1II1llIll1IlIIlIll11I11 = 0;
         this.l1I1l11I1ll1IIlllIl11111l11lI = 0;
         this.IllIll1II1IIll1l1IlII1 = 0;
         this.lllIllI11lIIl1lIl1I1lIIIll();
         this.llllI1IlIIl1I11lIIIl11lIlI = false;
         this.I1lIlllIII1l1lIIlI1Il = false;
         this.ll1ll1l11lI1 = AutoBrewing$II1Il11l111II11IIl.II1IIllllI1ll111I11lIIl;
         this.I1l1lIlII1l1 = null;
         this.IIl1IIl11Illl1Il1 = null;
         this.l1ll1II111lI = null;
         this.lIllIIll11IlI1l1II111I.clear();
         this.lII1lI1lII1l11IIllIllII.clear();
         this.II11111lllIlIII11ll();
         this.II1l1II1Illl1IIlI1ll1l1II1.reset();
         super.l11l1lII();
      } else {
         this.StringHolder_11(false);
      }
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      this.lll1lIl11l = AutoBrewing$EventBus.I11IlII1IIl1;
      this.l1ll1II111lI = null;
      this.I1l1lIlII1l1 = null;
      this.IIl1IIl11Illl1Il1 = null;
      this.lIllIIll11IlI1l1II111I.clear();
      this.lII1lI1lII1l11IIllIllII.clear();
      this.I1IIl111I1IIl1IIIllIIllll1 = 0;
      this.IlIllIll1llII1IlI1l11 = 0;
      this.ll1ll1l11lI1 = AutoBrewing$II1Il11l111II11IIl.II1IIllllI1ll111I11lIIl;
      super.l1l1lI111l1II1Illl111l1l1ll1l();
   }

   @EventTarget
   public void Event(EventImpl_30 ll1iil11ii) {
      if (this.l1ll1II111lI != null) {
         II1ll1II1l11lI.StringHolder_8(
            new SupplierHolder(
               this.l1ll1II111lI,
               () -> llI1lIIIlII111I11l1lIIl11.StringHolder_8(llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II(), this.l1ll1II111lI),
               llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II()
            ),
            5,
            this
         );
      }
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_22 l11llilil1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null && l11I1I1ll1Illll1I1l1111l1II.interactionManager != null) {
         switch (this.lll1lIl11l) {
            case I11IlII1IIl1:
            default:
               break;
            case l1111Il11llI1lIlI1Il11Il11:
               this.II1lllll1Il1Il11II();
               break;
            case IIIll11lIl1lIllI1Il:
               this.IlIIlIl1II1I1l11lII1I1l11();
               break;
            case III111l1I1lIII1llIIII11Il1:
               this.I1l1llI1IlI1();
               break;
            case IIlIIllllI1l11Il1II:
               this.Il11I11l1IIlIlll11ll1lIllI11Il();
               break;
            case llIIl1lI1I1I111lIllIIl1II:
               this.lI1l1I111l1l1II11l11IllIlII();
               break;
            case I1IlIlll1I11l11I1IllI1llIIIIIl:
               this.I1IllI1I1l11l();
               break;
            case Illll1IlI1llIl1:
               this.Ill1111IIl();
               break;
            case III11IIl11IlIlI1I:
               this.lIlll1llIl();
               break;
            case lI1lIIl1Il1l1IIII11l1:
               this.Il1llI1l11lIIIII1l1II();
               break;
            case I1111l1IIIlllllI1II11l1Il111I:
               this.I1ll1Ill1l1I1();
               break;
            case lIlII1IIlll:
               this.IIlIl1llll11IIll();
               break;
            case lI11I111IIlII11I1ll11l:
               this.lI1IllIIII11Il11I11l11I1I1II1();
               break;
            case llllIIl:
               this.l1IIIIIlllIlIlI1111l1llIl1II();
         }
      } else {
         this.StringHolder_32(false);
      }
   }

   private void II11111lllIlIII11ll() {
      this.l11l1IllIII11l1l = this.lllI1l1lIl11llI1ll1llIllllIl();
      int i = this.l11l1IllIII11l1l * 3;
      if (this.l11l1IllIII11l1l <= 0) {
         if (!this.llllI1IlIIl1I11lIIIl11lIlI) {
            this.llllI1IlIIl1I11lIIIl11lIlI = true;
            this.I1lIlllIII1l1lIIlI1Il = false;
            this.lll1lIl11l = AutoBrewing$EventBus.l1111Il11llI1lIlI1Il11Il11;
         } else {
            this.lIIIlI11IIll1I1l();
            this.StringHolder_32(false);
         }
      } else {
         TextHolder.EventImpl_27("Ресурсов хватает на " + i + " зелий (" + this.l11l1IllIII11l1l + " варки)");
         this.lll1lIl11l = AutoBrewing$EventBus.Illll1IlI1llIl1;
      }
   }

   private void l1111II() {
      this.l111I1II();
      this.StringHolder_32(false);
   }

   private void lI1I111l1IlIIIlllllIIl1l11I1l() {
      this.lll1lIl11l = AutoBrewing$EventBus.III11IIl11IlIlI1I;
      this.II1l1II1Illl1IIlI1ll1l1II1.reset();
   }

   private void l111I1II() {
      ScreenHandler ScreenHandler = l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler;
      if (ScreenHandler != null && !ScreenHandler.getCursorStack().isEmpty()) {
         this.EventImpl_21(ScreenHandler);
         if (!ScreenHandler.getCursorStack().isEmpty()) {
            return;
         }
      }

      ListHolder_5.IIl1IlI1l11Il();
   }

   private int lllI1l1lIl11llI1ll1llIllllIl() {
      int i = this.II1IIlI11() / 3;

      for (Entry entry : this.II1I11l1I1111IIIlll11Il1l.entrySet()) {
         i = Math.min(i, this.Event((Item)entry.getKey()) / (Integer)entry.getValue());
      }

      return i;
   }

   private List<Item> I1IIIII1IIlIIllIlI1I1l1l1lIII() {
      return StringHolder_9.SupplierHolder(Il111l11l1.Il1I11IIlllIl111l11I1I11()).I1I1lI111l1l1I();
   }

   private Map<Item, Integer> ZenithInternal064(List<Item> list) {
      LinkedHashMap linkedhashmap = new LinkedHashMap();
      this.StringHolder_8(linkedhashmap, Items.BLAZE_POWDER, 1);

      for (Item Item : list) {
         this.StringHolder_8(linkedhashmap, Item, 1);
      }

      return linkedhashmap;
   }

   private void StringHolder_8(Map<Item, Integer> map, Item Item, int i) {
      map.put(Item, map.getOrDefault(Item, 0) + i);
   }

   private void lIIIlI11IIll1I1l() {
      ArrayList arraylist = new ArrayList();
      int i = this.II1IIlI11();
      if (i < 3) {
         arraylist.add(Items.POTION.getName().getString() + " " + i + "/3");
      }

      for (Entry entry : this.II1I11l1I1111IIIlll11Il1l.entrySet()) {
         int j = this.Event((Item)entry.getKey());
         int k = (Integer)entry.getValue();
         if (j < k) {
            arraylist.add(((Item)entry.getKey()).getName().getString() + " " + j + "/" + k);
         }
      }

      String s = Il111l11l1.lII1I1l1IlIIl1I().getName();
      if (arraylist.isEmpty()) {
         TextHolder.EventImpl_27("Для зелья " + s + " ресурсов хватает");
      } else {
         TextHolder.StringHolder_26("Для зелья " + s + " не хватает: " + String.join(", ", arraylist));
      }
   }

   private void II1lllll1Il1Il11II() {
      this.l111llI1I1lI1IlIlII1IIl1lI();
      if (this.lII1lI1lII1l11IIllIllII.isEmpty()) {
         this.lIIIlI11IIll1I1l();
         this.StringHolder_32(false);
      } else {
         this.lll11I1llI1I1111I1l();
      }
   }

   private void lll11I1llI1I1111I1l() {
      if (this.lII1lI1lII1l11IIllIllII.isEmpty()) {
         this.l111I1II();
         if (!this.I1lIlllIII1l1lIIlI1Il) {
            this.lIIIlI11IIll1I1l();
            this.StringHolder_32(false);
         } else {
            this.II11111lllIlIII11ll();
         }
      } else {
         this.IIl1IIl11Illl1Il1 = this.lII1lI1lII1l11IIllIllII.removeFirst();
         this.lll1lIl11l = AutoBrewing$EventBus.IIIll11lIl1lIllI1Il;
         this.II1l1II1Illl1IIlI1ll1l1II1.reset();
      }
   }

   private void IlIIlIl1II1I1l11lII1I1l11() {
      this.StringHolder_8(AutoBrewing$EventBus.III111l1I1lIII1llIIII11Il1, this::lll11I1llI1I1111I1l);
   }

   private void I1l1llI1IlI1() {
      GenericContainerScreenHandler GenericContainerScreenHandler = this.IllllII1l1IIIl1Il1lII();
      if (GenericContainerScreenHandler == null) {
         this.IlIIlIl1II1I1l11lII1I1l11();
      } else if (this.II1l1II1Illl1IIlI1ll1l1II1.HostnameVerifierImpl(50L)) {
         Slot Slot = this.Event(GenericContainerScreenHandler);
         if (Slot == null) {
            this.l111I1II();
            this.IIl1IIl11Illl1Il1 = null;
            this.lll11I1llI1I1111I1l();
         } else if (!this.ZenithInternal101(Slot.getStack())) {
            this.l111I1II();
            this.IIl1IIl11Illl1Il1 = null;
            this.lll11I1llI1I1111I1l();
         } else {
            ListHolder_5.StringHolder_8(GenericContainerScreenHandler.syncId, Slot.id, 0, SlotActionType.QUICK_MOVE, false);
            this.I1lIlllIII1l1lIIlI1Il = true;
            this.II1l1II1Illl1IIlI1ll1l1II1.reset();
         }
      }
   }

   private Slot Event(GenericContainerScreenHandler GenericContainerScreenHandler) {
      int i = GenericContainerScreenHandler.getInventory().size();

      for (int j = 0; j < i; j++) {
         Slot Slot = GenericContainerScreenHandler.getSlot(j);
         if (this.ZenithInternal042(Slot.getStack())) {
            return Slot;
         }
      }

      return null;
   }

   private boolean ZenithInternal042(ItemStack ItemStack) {
      return this.ZenithInternal084(ItemStack) || this.II1I11l1I1111IIIlll11Il1l.containsKey(ItemStack.getItem());
   }

   private boolean ZenithInternal101(ItemStack ItemStack) {
      for (int i = 0; i < l11I1I1ll1Illll1I1l1111l1II.player.getInventory().size(); i++) {
         ItemStack ItemStackx = l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(i);
         if (ItemStackx.isEmpty() || this.EventBus(ItemStackx, ItemStackx) && ItemStackx.getCount() < ItemStackx.getMaxCount()) {
            return true;
         }
      }

      return false;
   }

   private void Il11I11l1IIlIlll11ll1lIllI11Il() {
      this.l111llI1I1lI1IlIlII1IIl1lI();
      this.I1IllIIlI1lI1111IllI();
   }

   private void l111llI1I1lI1IlIlII1IIl1lI() {
      this.lII1lI1lII1l11IIllIllII.clear();

      for (BlockPos BlockPosx : ZenithInternal066.StringHolder_8(l11I1I1ll1Illll1I1l1111l1II.player.getBlockPos(), 5.0F, 3.0F)) {
         BlockPos BlockPosx = BlockPosx.toImmutable();
         if (this.EventBus(l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPosx)) && this.ZenithInternal095(BlockPosx) != null) {
            this.lII1lI1lII1l11IIllIllII.add(BlockPosx);
         }
      }

      this.lII1lI1lII1l11IIllIllII
         .sort(Comparator.comparingDouble(BlockPos -> BlockPosxx.toCenterPos().squaredDistanceTo(l11I1I1ll1Illll1I1l1111l1II.player.getEyePos())));
   }

   private void I1IllIIlI1lI1111IllI() {
      if (this.lII1lI1lII1l11IIllIllII.isEmpty()) {
         this.IIlI1lIII11lIIIllll1l1IlIII();
      } else {
         this.IIl1IIl11Illl1Il1 = this.lII1lI1lII1l11IIllIllII.removeFirst();
         this.lll1lIl11l = AutoBrewing$EventBus.llIIl1lI1I1I111lIllIIl1II;
         this.II1l1II1Illl1IIlI1ll1l1II1.reset();
      }
   }

   private void lI1l1I111l1l1II11l11IllIlII() {
      this.StringHolder_8(AutoBrewing$EventBus.I1IlIlll1I11l11I1IllI1llIIIIIl, this::I1IllIIlI1lI1111IllI);
   }

   private void StringHolder_8(AutoBrewing$EventBus llill1li1lliiiliii1i$l1i1illlili, Runnable runnable) {
      if (this.IIl1IIl11Illl1Il1 == null) {
         runnable.run();
      } else if (l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof GenericContainerScreenHandler) {
         this.lll1lIl11l = llill1li1lliiiliii1i$l1i1illlili;
         this.l1ll1II111lI = null;
         this.II1l1II1Illl1IIlI1ll1l1II1.reset();
      } else if (this.II1l1II1Illl1IIlI1ll1l1II1.HostnameVerifierImpl(1500L)) {
         this.IIl1IIl11Illl1Il1 = null;
         runnable.run();
      } else {
         BlockHitResult BlockHitResult = this.ZenithInternal095(this.IIl1IIl11Illl1Il1);
         if (BlockHitResult == null) {
            this.IIl1IIl11Illl1Il1 = null;
            runnable.run();
         } else {
            this.l1ll1II111lI = ZenithInternal131.longHolder_6(BlockHitResult.getPos());
            if (this.EventTarget(this.IIl1IIl11Illl1Il1) && this.II1l1II1Illl1IIlI1ll1l1II1.HostnameVerifierImpl(50L)) {
               ZenithInternal066.StringHolder_8(BlockHitResult, Hand.MAIN_HAND);
               this.II1l1II1Illl1IIlI1ll1l1II1.reset();
            }
         }
      }
   }

   private void I1IllI1I1l11l() {
      GenericContainerScreenHandler GenericContainerScreenHandler = this.IllllII1l1IIIl1Il1lII();
      if (GenericContainerScreenHandler == null) {
         this.lI1l1I111l1l1II11l11IllIlII();
      } else if (this.II1l1II1Illl1IIlI1ll1l1II1.HostnameVerifierImpl(50L)) {
         Slot Slot = this.StringHolder_8(GenericContainerScreenHandler, this::StringHolder_19);
         if (Slot == null) {
            this.l111I1II();
            this.IIlI1lIII11lIIIllll1l1IlIII();
         } else if (!this.StringHolder_8(GenericContainerScreenHandler, Slot.getStack())) {
            this.l111I1II();
            this.IIl1IIl11Illl1Il1 = null;
            this.I1IllIIlI1lI1111IllI();
         } else {
            ListHolder_5.StringHolder_8(GenericContainerScreenHandler.syncId, Slot.id, 0, SlotActionType.QUICK_MOVE, false);
            this.II1l1II1Illl1IIlI1ll1l1II1.reset();
         }
      }
   }

   private boolean StringHolder_8(GenericContainerScreenHandler GenericContainerScreenHandler, ItemStack ItemStack) {
      int i = GenericContainerScreenHandler.getInventory().size();

      for (int j = 0; j < i; j++) {
         ItemStack ItemStackx = GenericContainerScreenHandler.getSlot(j).getStack();
         if (ItemStackx.isEmpty() || this.EventBus(ItemStackx, ItemStackx) && ItemStackx.getCount() < ItemStackx.getMaxCount()) {
            return true;
         }
      }

      return false;
   }

   private void IIlI1lIII11lIIIllll1l1IlIII() {
      this.l111I1II();
      this.IIl1IIl11Illl1Il1 = null;
      if (this.l11l1IllIII11l1l <= 0) {
         TextHolder.EventImpl_27("Автозельеварение завершено");
         this.StringHolder_32(false);
      } else {
         this.lIIIllI1II1();
      }
   }

   private void Ill1111IIl() {
      this.lIllIIll11IlI1l1II111I.clear();

      for (BlockPos BlockPosx : ZenithInternal066.StringHolder_8(l11I1I1ll1Illll1I1l1111l1II.player.getBlockPos(), 5.0F, 3.0F)) {
         BlockPos BlockPosx = BlockPosx.toImmutable();
         if (l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPosx).isOf(Blocks.BREWING_STAND) && this.ZenithInternal095(BlockPosx) != null) {
            this.lIllIIll11IlI1l1II111I.add(BlockPosx);
         }
      }

      this.lIllIIll11IlI1l1II111I
         .sort(Comparator.comparingDouble(BlockPos -> BlockPosxx.toCenterPos().squaredDistanceTo(l11I1I1ll1Illll1I1l1111l1II.player.getEyePos())));
      if (this.lIllIIll11IlI1l1II111I.isEmpty()) {
         TextHolder.StringHolder_26("Рядом нет доступных зельеварок");
         this.StringHolder_32(false);
      } else {
         this.lIIIllI1II1();
      }
   }

   private void lIIIllI1II1() {
      this.I1IIl111I1IIl1IIIllIIllll1 = Math.min(this.l11l1IllIII11l1l, this.lIllIIll11IlI1l1II111I.size());
      this.IlIllIll1llII1IlI1l11 = 0;
      this.III1II1llIll1IlIIlIll11I11 = 0;
      this.ll1ll1l11lI1 = AutoBrewing$II1Il11l111II11IIl.II1IIllllI1ll111I11lIIl;
      this.I111Illl11I11II1lIll1lll1llI();
   }

   private void I111Illl11I11II1lIll1lll1llI() {
      if (this.IlIllIll1llII1IlI1l11 >= this.I1IIl111I1IIl1IIIllIIllll1) {
         this.IIl11II1lII1ll11lIIl1();
      } else {
         this.I1l1lIlII1l1 = this.lIllIIll11IlI1l1II111I.get(this.IlIllIll1llII1IlI1l11);
         this.l1I1l11I1ll1IIlllIl11111l11lI = 0;
         this.IllIll1II1IIll1l1IlII1 = 0;
         this.lllIllI11lIIl1lIl1I1lIIIll();
         this.lll1lIl11l = AutoBrewing$EventBus.III11IIl11IlIlI1I;
         this.II1l1II1Illl1IIlI1ll1l1II1.reset();
      }
   }

   private void lIl1I11IlI1I() {
      this.l111I1II();
      this.IlIllIll1llII1IlI1l11++;
      this.I111Illl11I11II1lIll1lll1llI();
   }

   private void IIl11II1lII1ll11lIIl1() {
      this.l111I1II();
      this.IlIllIll1llII1IlI1l11 = 0;
      this.lllIllI11lIIl1lIl1I1lIIIll();
      if (this.ll1ll1l11lI1 == AutoBrewing$II1Il11l111II11IIl.II1IIllllI1ll111I11lIIl) {
         this.ll1ll1l11lI1 = AutoBrewing$II1Il11l111II11IIl.I11II11IllII1I1l11;
         this.I1l1lIlII1l1 = null;
         this.lll1lIl11l = AutoBrewing$EventBus.lI11I111IIlII11I1ll11l;
         this.II1l1II1Illl1IIlI1ll1l1II1.reset();
      } else if (this.ll1ll1l11lI1 == AutoBrewing$II1Il11l111II11IIl.I1II1IlIIlI) {
         this.ll1ll1l11lI1 = AutoBrewing$II1Il11l111II11IIl.I11II11IllII1I1l11;
         this.I1l1lIlII1l1 = null;
         this.lll1lIl11l = AutoBrewing$EventBus.lI11I111IIlII11I1ll11l;
         this.II1l1II1Illl1IIlI1ll1l1II1.reset();
      } else {
         this.l11l1IllIII11l1l = this.l11l1IllIII11l1l - this.I1IIl111I1IIl1IIIllIIllll1;
         this.lll1lIl11l = AutoBrewing$EventBus.IIlIIllllI1l11Il1II;
         this.II1l1II1Illl1IIlI1ll1l1II1.reset();
      }
   }

   private void lIlll1llIl() {
      if (this.I1l1lIlII1l1 == null) {
         this.lll1lIl11l = AutoBrewing$EventBus.Illll1IlI1llIl1;
      } else if (l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof BrewingStandScreenHandler) {
         this.lll1lIl11l = switch (this.ll1ll1l11lI1) {
            case II1IIllllI1ll111I11lIIl -> AutoBrewing$EventBus.lI1lIIl1Il1l1IIII11l1;
            case I1II1IlIIlI -> AutoBrewing$EventBus.lIlII1IIlll;
            case I11II11IllII1I1l11 -> AutoBrewing$EventBus.lIlII1IIlll;
            case lIlIIIlIIllIIll11I -> AutoBrewing$EventBus.llllIIl;
         };
         this.l1I1l11I1ll1IIlllIl11111l11lI = 0;
         this.II1l1II1Illl1IIlI1ll1l1II1.reset();
         this.l1ll1II111lI = null;
      } else if (this.II1l1II1Illl1IIlI1ll1l1II1.HostnameVerifierImpl(1500L)) {
         this.I1l1lIlII1l1 = null;
         this.lll1lIl11l = AutoBrewing$EventBus.Illll1IlI1llIl1;
         this.l1ll1II111lI = null;
      } else {
         BlockHitResult BlockHitResult = this.ZenithInternal095(this.I1l1lIlII1l1);
         if (BlockHitResult == null) {
            this.I1l1lIlII1l1 = null;
            this.lll1lIl11l = AutoBrewing$EventBus.Illll1IlI1llIl1;
            this.l1ll1II111lI = null;
         } else {
            this.l1ll1II111lI = ZenithInternal131.longHolder_6(BlockHitResult.getPos());
            if (this.EventTarget(this.I1l1lIlII1l1) && this.II1l1II1Illl1IIlI1ll1l1II1.HostnameVerifierImpl(50L)) {
               ZenithInternal066.StringHolder_8(BlockHitResult, Hand.MAIN_HAND);
               this.II1l1II1Illl1IIlI1ll1l1II1.reset();
            }
         }
      }
   }

   private void Il1llI1l11lIIIII1l1II() {
      BrewingStandScreenHandler BrewingStandScreenHandler = this.l111llI111I1I();
      if (BrewingStandScreenHandler == null) {
         this.lI1I111l1IlIIIlllllIIl1l11I1l();
      } else if (this.II1l1II1Illl1IIlI1ll1l1II1.HostnameVerifierImpl(75L)) {
         if (this.l111l1lIIl111lI1ll1llIlIlI == AutoBrewing$l1lll11l1l.Il1lIlll1 && !BrewingStandScreenHandler.getCursorStack().isEmpty()) {
            this.EventImpl_21(BrewingStandScreenHandler);
            this.II1l1II1Illl1IIlI1ll1l1II1.reset();
         } else if (this.l1I1l11I1ll1IIlllIl11111l11lI >= IIIlIIl1I11lI1Illllllll1lI.length) {
            int j = this.StringHolder_8(BrewingStandScreenHandler);
            if (j != -1) {
               this.l1I1l11I1ll1IIlllIl11111l11lI = j;
               this.II1l1II1Illl1IIlI1ll1l1II1.reset();
            } else {
               this.lll1lIl11l = AutoBrewing$EventBus.I1111l1IIIlllllI1II11l1Il111I;
               this.II1l1II1Illl1IIlI1ll1l1II1.reset();
            }
         } else {
            int i = IIIlIIl1I11lI1Illllllll1lI[this.l1I1l11I1ll1IIlllIl11111l11lI];
            if (this.l111l1lIIl111lI1ll1llIlIlI != AutoBrewing$l1lll11l1l.Il1lIlll1) {
               this.StringHolder_8(BrewingStandScreenHandler, this::ZenithInternal084, i);
               this.II1l1II1Illl1IIlI1ll1l1II1.reset();
            } else {
               ItemStack ItemStack = BrewingStandScreenHandler.getSlot(i).getStack();
               if (this.ZenithInternal084(ItemStack)) {
                  this.lllIllI11lIIl1lIl1I1lIIIll();
                  this.l1I1l11I1ll1IIlllIl11111l11lI++;
                  this.II1l1II1Illl1IIlI1ll1l1II1.reset();
               } else if (!ItemStack.isEmpty()) {
                  this.IllIll1II1IIll1l1IlII1 = 0;
                  this.lll1lIl11l = AutoBrewing$EventBus.llllIIl;
                  this.II1l1II1Illl1IIlI1ll1l1II1.reset();
               } else if (!this.StringHolder_8(BrewingStandScreenHandler, this::ZenithInternal084, i)) {
                  TextHolder.StringHolder_26("Не найдены бутылочки с водой");
                  this.l1111II();
               } else {
                  this.II1l1II1Illl1IIlI1ll1l1II1.reset();
               }
            }
         }
      }
   }

   private void I1ll1Ill1l1I1() {
      BrewingStandScreenHandler BrewingStandScreenHandler = this.l111llI111I1I();
      if (BrewingStandScreenHandler == null) {
         this.lI1I111l1IlIIIlllllIIl1l11I1l();
      } else if (this.II1l1II1Illl1IIlI1ll1l1II1.HostnameVerifierImpl(50L)) {
         if (this.l111l1lIIl111lI1ll1llIlIlI == AutoBrewing$l1lll11l1l.Il1lIlll1 && !BrewingStandScreenHandler.getCursorStack().isEmpty()) {
            this.EventImpl_21(BrewingStandScreenHandler);
            this.II1l1II1Illl1IIlI1ll1l1II1.reset();
         } else if (this.l111l1lIIl111lI1ll1llIlIlI != AutoBrewing$l1lll11l1l.Il1lIlll1) {
            this.StringHolder_8(BrewingStandScreenHandler, ItemStack -> ItemStack.isOf(Items.BLAZE_POWDER), 4);
            this.II1l1II1Illl1IIlI1ll1l1II1.reset();
         } else if (!BrewingStandScreenHandler.getSlot(4).getStack().isEmpty()) {
            int i = this.StringHolder_8(BrewingStandScreenHandler);
            if (i != -1) {
               this.l1I1l11I1ll1IIlllIl11111l11lI = i;
               this.lll1lIl11l = AutoBrewing$EventBus.lI1lIIl1Il1l1IIII11l1;
               this.II1l1II1Illl1IIlI1ll1l1II1.reset();
            } else {
               this.lllIllI11lIIl1lIl1I1lIIIll();
               this.lll1lIl11l = AutoBrewing$EventBus.lIlII1IIlll;
            }
         } else if (!this.StringHolder_8(BrewingStandScreenHandler, ItemStack -> ItemStack.isOf(Items.BLAZE_POWDER), 4)) {
            TextHolder.StringHolder_26("Не найдено топливо для зельеварки");
            this.l1111II();
         } else {
            this.II1l1II1Illl1IIlI1ll1l1II1.reset();
         }
      }
   }

   private void IIlIl1llll11IIll() {
      BrewingStandScreenHandler BrewingStandScreenHandler = this.l111llI111I1I();
      if (BrewingStandScreenHandler == null) {
         this.lI1I111l1IlIIIlllllIIl1l11I1l();
      } else if (this.II1l1II1Illl1IIlI1ll1l1II1.HostnameVerifierImpl(50L)) {
         if (this.l111l1lIIl111lI1ll1llIlIlI == AutoBrewing$l1lll11l1l.Il1lIlll1 && !BrewingStandScreenHandler.getCursorStack().isEmpty()) {
            this.EventImpl_21(BrewingStandScreenHandler);
            this.II1l1II1Illl1IIlI1ll1l1II1.reset();
         } else if (this.III1II1llIll1IlIIlIll11I11 >= this.ll1lllI1lIIIlI1Il11lI1llII11I.size()) {
            this.lIl1I11IlI1I();
         } else {
            Item Item = this.ll1lllI1lIIIlI1Il11lI1llII11I.get(this.III1II1llIll1IlIIlIll11I11);
            if (this.l111l1lIIl111lI1ll1llIlIlI != AutoBrewing$l1lll11l1l.Il1lIlll1) {
               this.StringHolder_8(BrewingStandScreenHandler, ItemStack -> ItemStack.isOf(Item), 3);
               this.II1l1II1Illl1IIlI1ll1l1II1.reset();
            } else if (!BrewingStandScreenHandler.getSlot(3).getStack().isEmpty()) {
               this.lllIllI11lIIl1lIl1I1lIIIll();
               this.lIl1I11IlI1I();
            } else if (!this.StringHolder_8(BrewingStandScreenHandler, ItemStack -> ItemStack.isOf(Item), 3)) {
               TextHolder.StringHolder_26("Не найден ингредиент: " + Item.getName().getString());
               this.l1111II();
            } else {
               this.II1l1II1Illl1IIlI1ll1l1II1.reset();
            }
         }
      }
   }

   private void lI1IllIIII11Il11I11l11I1I1II1() {
      if (this.II1l1II1Illl1IIlI1ll1l1II1.HostnameVerifierImpl(20000L)) {
         this.III1II1llIll1IlIIlIll11I11++;
         if (this.III1II1llIll1IlIIlIll11I11 >= this.ll1lllI1lIIIlI1Il11lI1llII11I.size()) {
            this.ll1ll1l11lI1 = AutoBrewing$II1Il11l111II11IIl.lIlIIIlIIllIIll11I;
         } else {
            this.ll1ll1l11lI1 = AutoBrewing$II1Il11l111II11IIl.I1II1IlIIlI;
         }

         this.I111Illl11I11II1lIll1lll1llI();
      }
   }

   private void l1IIIIIlllIlIlI1111l1llIl1II() {
      BrewingStandScreenHandler BrewingStandScreenHandler = this.l111llI111I1I();
      if (BrewingStandScreenHandler == null) {
         this.lI1I111l1IlIIIlllllIIl1l11I1l();
      } else if (this.II1l1II1Illl1IIlI1ll1l1II1.HostnameVerifierImpl(50L)) {
         if (this.IllIll1II1IIll1l1IlII1 >= IIIlIIl1I11lI1Illllllll1lI.length) {
            this.lIl1I11IlI1I();
         } else {
            int i = IIIlIIl1I11lI1Illllllll1lI[this.IllIll1II1IIll1l1IlII1];
            if (BrewingStandScreenHandler.getSlot(i).getStack().isEmpty()) {
               this.IllIll1II1IIll1l1IlII1++;
               this.II1l1II1Illl1IIlI1ll1l1II1.reset();
            } else {
               ListHolder_5.StringHolder_8(BrewingStandScreenHandler.syncId, i, 0, SlotActionType.QUICK_MOVE, false);
               this.II1l1II1Illl1IIlI1ll1l1II1.reset();
            }
         }
      }
   }

   private BrewingStandScreenHandler l111llI111I1I() {
      return l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof BrewingStandScreenHandler BrewingStandScreenHandler ? BrewingStandScreenHandler : null;
   }

   private GenericContainerScreenHandler IllllII1l1IIIl1Il1lII() {
      return l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof GenericContainerScreenHandler GenericContainerScreenHandler ? GenericContainerScreenHandler : null;
   }

   private int StringHolder_8(BrewingStandScreenHandler BrewingStandScreenHandler) {
      if (BrewingStandScreenHandler.getCursorStack().isEmpty() && this.l111l1lIIl111lI1ll1llIlIlI == AutoBrewing$l1lll11l1l.Il1lIlll1) {
         for (int i = 0; i < IIIlIIl1I11lI1Illllllll1lI.length; i++) {
            if (!this.ZenithInternal084(BrewingStandScreenHandler.getSlot(IIIlIIl1I11lI1Illllllll1lI[i]).getStack())) {
               return i;
            }
         }

         return -1;
      } else {
         return 0;
      }
   }

   private boolean StringHolder_8(ScreenHandler ScreenHandler, AutoBrewing$EventTarget llill1li1lliiiliii1i$illi1l1l1, int i) {
      if (this.l111l1lIIl111lI1ll1llIlIlI == AutoBrewing$l1lll11l1l.Il1lIlll1) {
         Slot Slot = this.StringHolder_8(ScreenHandler, llill1li1lliiiliii1i$illi1l1l1);
         if (Slot == null) {
            return false;
         } else {
            this.Illl1III1I1IIIIlll1III11Ill = Slot.id;
            this.lI111lIlII1IIlllIl1I1ll11lIl = i;
            this.l111l1lIIl111lI1ll1llIlIlI = AutoBrewing$l1lll11l1l.l1l1IIlII1l1Ill11l1lIII11I1;
            ListHolder_5.StringHolder_8(ScreenHandler.syncId, Slot.id, 0, SlotActionType.PICKUP, false);
            return true;
         }
      } else if (this.lI111lIlII1IIlllIl1I1ll11lIl != i) {
         this.lllIllI11lIIl1lIl1I1lIIIll();
         return true;
      } else if (this.l111l1lIIl111lI1ll1llIlIlI == AutoBrewing$l1lll11l1l.l1l1IIlII1l1Ill11l1lIII11I1) {
         if (ScreenHandler.getCursorStack().isEmpty()) {
            this.lllIllI11lIIl1lIl1I1lIIIll();
            return true;
         } else {
            ListHolder_5.StringHolder_8(ScreenHandler.syncId, this.lI111lIlII1IIlllIl1I1ll11lIl, 1, SlotActionType.PICKUP, false);
            this.l111l1lIIl111lI1ll1llIlIlI = AutoBrewing$l1lll11l1l.llll1IIIlI11III;
            return true;
         }
      } else if (this.l111l1lIIl111lI1ll1llIlIlI == AutoBrewing$l1lll11l1l.llll1IIIlI11III) {
         if (ScreenHandler.getCursorStack().isEmpty()) {
            this.lllIllI11lIIl1lIl1I1lIIIll();
            return true;
         } else {
            this.EventImpl_21(ScreenHandler);
            this.l111l1lIIl111lI1ll1llIlIlI = AutoBrewing$l1lll11l1l.IllIII1lI1;
            return true;
         }
      } else {
         if (ScreenHandler.getCursorStack().isEmpty()) {
            this.lllIllI11lIIl1lIl1I1lIIIll();
         } else {
            this.EventImpl_21(ScreenHandler);
         }

         return true;
      }
   }

   private void lllIllI11lIIl1lIl1I1lIIIll() {
      this.Illl1III1I1IIIIlll1III11Ill = -1;
      this.lI111lIlII1IIlllIl1I1ll11lIl = -1;
      this.l111l1lIIl111lI1ll1llIlIlI = AutoBrewing$l1lll11l1l.Il1lIlll1;
   }

   private void EventImpl_21(ScreenHandler ScreenHandler) {
      if (ScreenHandler.getCursorStack().isEmpty()) {
         this.lllIllI11lIIl1lIl1I1lIIIll();
      } else {
         Slot Slot = this.EventTarget(ScreenHandler, this.Illl1III1I1IIIIlll1III11Ill);
         if (this.StringHolder_8(Slot, ScreenHandler.getCursorStack())) {
            ListHolder_5.StringHolder_8(ScreenHandler.syncId, Slot.id, 0, SlotActionType.PICKUP, false);
         } else {
            Slot = this.StringHolder_8(ScreenHandler, ItemStack::isEmpty);
            if (Slot != null) {
               ListHolder_5.StringHolder_8(ScreenHandler.syncId, Slot.id, 0, SlotActionType.PICKUP, false);
            } else {
               TextHolder.StringHolder_26("Нет свободного слота, чтобы вернуть предмет с курсора");
            }
         }
      }
   }

   private Slot EventTarget(ScreenHandler ScreenHandler, int i) {
      return ScreenHandler.slots.stream().filter(Slot -> Slot.id == i).findFirst().orElse(null);
   }

   private boolean StringHolder_8(Slot Slot, ItemStack ItemStack) {
      return Slot != null
         && Slot.inventory instanceof PlayerInventory
         && (
            Slot.getStack().isEmpty()
               || this.EventBus(Slot.getStack(), ItemStack) && Slot.getStack().getCount() < Slot.getStack().getMaxCount()
         );
   }

   private boolean EventBus(ItemStack ItemStack, ItemStack ItemStack) {
      return ItemStack.areItemsEqual(ItemStackx, ItemStack) && ItemStack.areEqual(ItemStackx, ItemStack);
   }

   private Slot StringHolder_8(ScreenHandler ScreenHandler, AutoBrewing$EventTarget llill1li1lliiiliii1i$illi1l1l1) {
      return ScreenHandler.slots
         .stream()
         .filter(Slot -> Slot.inventory instanceof PlayerInventory)
         .filter(Slot -> llill1li1lliiiliii1i$illi1l1l1.matches(Slot.getStack()))
         .findFirst()
         .orElse(null);
   }

   private boolean ZenithInternal084(ItemStack ItemStack) {
      if (!ItemStack.isOf(Items.POTION)) {
         return false;
      } else {
         PotionContentsComponent PotionContentsComponent = (PotionContentsComponent)ItemStack.get(DataComponentTypes.POTION_CONTENTS);
         return PotionContentsComponent != null && PotionContentsComponent.potion().isPresent() && ((RegistryEntry)PotionContentsComponent.potion().get()).equals(Potions.WATER);
      }
   }

   private boolean StringHolder_19(ItemStack ItemStack) {
      if (!ItemStack.isOf(Items.POTION)) {
         return false;
      } else {
         PotionContentsComponent PotionContentsComponent = (PotionContentsComponent)ItemStack.get(DataComponentTypes.POTION_CONTENTS);
         return PotionContentsComponent != null && PotionContentsComponent.potion().isPresent() && !((RegistryEntry)PotionContentsComponent.potion().get()).equals(Potions.WATER);
      }
   }

   private int II1IIlI11() {
      int i = 0;

      for (int j = 0; j < l11I1I1ll1Illll1I1l1111l1II.player.getInventory().size(); j++) {
         ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(j);
         if (this.ZenithInternal084(ItemStack)) {
            i += ItemStack.getCount();
         }
      }

      return i;
   }

   private int Event(Item Item) {
      int i = 0;

      for (int j = 0; j < l11I1I1ll1Illll1I1l1111l1II.player.getInventory().size(); j++) {
         if (l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(j).isOf(Item)) {
            i += l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(j).getCount();
         }
      }

      return i;
   }

   @Override
   public boolean llI1lll1lIllII11I1111Illl() {
      return true;
   }

   private boolean EventTarget(BlockPos BlockPos) {
      floatHolder_6 il1ll111liili1ll11liil = II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1();
      BlockHitResult BlockHitResult = ZenithInternal088.StringHolder_8(
         l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F),
         il1ll111liili1ll11liil,
         l11I1I1ll1Illll1I1l1111l1II.player.getBlockInteractionRange(),
         BlockHitResult -> BlockHitResultx != null && BlockHitResultx.getBlockPos().equals(BlockPos)
      );
      return BlockHitResult != null && BlockHitResult.getType() != net.minecraft.util.hit.HitResult.class_240.MISS && BlockHitResult.getBlockPos().equals(BlockPos);
   }

   private BlockHitResult ZenithInternal095(BlockPos BlockPos) {
      BlockState BlockState = l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPos);
      if (!BlockState.isOf(Blocks.BREWING_STAND) && !this.EventBus(BlockState)) {
         return null;
      } else {
         net.minecraft.util.math.Vec3d Vec3dxx = BlockPos.toCenterPos();
         ArrayList arraylist = new ArrayList();
         arraylist.add(Vec3dxx);

         for (Direction Direction : Direction.values()) {
            arraylist.add(Vec3dxx.add(net.minecraft.util.math.Vec3d.of(Direction.getVector()).multiply(0.5)));
         }

         net.minecraft.util.math.Vec3d Vec3dx = l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F);
         double d0 = l11I1I1ll1Illll1I1l1111l1II.player.getBlockInteractionRange();

         for (net.minecraft.util.math.Vec3d Vec3dxx : arraylist) {
            floatHolder_6 il1ll111liili1ll11liil = ZenithInternal131.longHolder_6(Vec3dxx);
            BlockHitResult BlockHitResult = ZenithInternal088.StringHolder_8(
               Vec3dx, il1ll111liili1ll11liil, d0, BlockHitResult -> BlockHitResultx != null && BlockHitResultx.getBlockPos().equals(BlockPos)
            );
            if (BlockHitResult != null && BlockHitResult.getType() != net.minecraft.util.hit.HitResult.class_240.MISS && BlockHitResult.getBlockPos().equals(BlockPos)
               )
             {
               return BlockHitResult;
            }
         }

         return null;
      }
   }

   private boolean EventBus(BlockState BlockState) {
      return BlockState.isOf(Blocks.CHEST)
         || BlockState.isOf(Blocks.TRAPPED_CHEST)
         || BlockState.isOf(Blocks.BARREL);
   }
}
