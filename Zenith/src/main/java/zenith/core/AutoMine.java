package zenith;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.util.Hand;
import net.minecraft.entity.ItemEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.text.Text;
import net.minecraft.block.BlockState;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.component.DataComponentTypes;

@ModuleInfo(
   name = "Auto Mine",
   category = Category.PLAYER,
   description = "Автоматический фарм руд в мире"
)
public class AutoMine extends Module {
   public static final AutoMine Il1Il11IIIIlI11l1I = new AutoMine();
   private final ListSetting ll1l1IllII = new ListSetting(
      "module.autoMine.priorityBlock", "module.autoMine.priorityBlock.desc", new ArrayList<>(), () -> true
   );
   private static final float lIIlI1I1llllIlll11IlI11I = 68.0F;
   private static final float II11I1111lI1lIIIlI1 = 46.0F;
   private static final float l1lIIl11ll1II111Ill1Il11 = 0.55F;
   private static final String IllIl1111llII1IIII1ll1l1lI = "сервер заполнен";
   private static final Set<Integer> lIlII1Il11 = Set.of(17, 2, 33, 49);
   private static final String Il11lllIl1I111I = "бур";
   private static final String I1IllI111l1l1I = "побереги свой инструмент, он почти сломан";
   private static final int llI1lIl1l1Il1l1lll1 = 650;
   private static final int lI1II1I1l1llll11111I1I1I = 19;
   private static final int IIll1llIlIlI11 = 100;
   private static final int Ill1llIl1I1 = 12;
   private static final int lll1II11l1lIlI111lIlI = 40;
   private static final int llII1IlIl1 = 60;
   private int l11lI1I1lIl1;
   private int I11ll1lIl1;
   private int I1111l11llll11I11Ill1;
   private int I1I1ll1IlIlllI1l1ll;
   private int lII11111IlIl11lII1Il11l1lI;
   private int I1I1llll1l1l1llIlII11;
   private List<BlockPos> IlIl1lIIlIl1l1lI11lII1Il11Il = List.of();
   private BlockPos l111II1IIlll1IIIl11lI1l11I1Il;
   private BlockPos l1lIIII11ll;
   private BlockPos I1I1Illll1II11l11IlI1;
   private BlockPos I1l111ll1III1;
   private net.minecraft.util.math.Vec3d I1I11lI1II1llIII1l11l1;
   private net.minecraft.util.math.Vec3d IIIIIIl1l11;
   private int ll1III111I11l11lIII11l1I1 = Integer.MIN_VALUE;
   private BlockHitResult ll1lI1II1IIII11l1l;
   private BlockHitResult lI1II1l1ll11I;
   private int Il11I1Il1111l;
   private int II1l1I1IIIlI1lI1lIl1IIl;
   private int III1llllll1lI111lI;
   private int II1lI1I11llII111l11llI;
   private int IIIlll1l11Il1IlI111;
   private boolean Il1l1111l11II111lII1llI1Il;
   private int I1llI1I1ll1lIl11 = -1;
   private boolean II1IIIllll11Illl;
   private boolean llIlI1I1111Il11I1I11;
   private int IIllI1II1lll111IIl;
   private int Il1lllI11I;
   private int l1ll1III11Il111ll1lI;
   private ItemStack lIlIIllI = ItemStack.EMPTY;
   private int lll1111IIl1I11IIllIII = -1;
   private int II11II1III1lllllI;
   private int IlI1I1l1l1lIlI1Ill;
   private int l1I11I11IlIlII1l1ll1lll1II11lI;
   private int Il1II11lIIlI1l111ll;
   private boolean lIII1II1lll1l1;
   private boolean lII111I11I1I11I1II;
   private boolean I1ll1I1l11I11lIll1ll;
   private final Set<Integer> l111Ill1lII1I1lll1ll = new HashSet<>();
   private final Set<BlockPos> IIlIIll11lIl = new HashSet<>();
   private final Set<BlockPos> ll1IIIl1111lll = new HashSet<>();
   private final Set<Item> ll1l1l1IlII11l1Ill = new HashSet<>();

   private AutoMine() {
   }

   @Override
   public void onEnable() {
      this.StringHolder_13(false);
      this.Il1lIll11I1I();
      super.l11l1lII();
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      this.lIl1I1II1l1I1111l111();
      this.ZenithInternal086(true);
      this.StringHolder_13(false);
      super.l1l1lI111l1II1Illl111l1l1ll1l();
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_22 l11llilil1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null && l11I1I1ll1Illll1I1l1111l1II.interactionManager != null) {
         if (!this.I11lIllIl1lIlI1I11lIIII()) {
            if (!this.llI1111ll11I1IlIlI1lllll1l11()) {
               this.l11II1llllll11l();
            } else if (!this.lll1Il111l1lll11lI11lIl1II11ll()) {
               if (this.I111lIIl11IIl1111111I()) {
                  this.Il1111l11Il1l1I1I1lII();
               } else if (!this.I1llll1Il1l1Il1llIl1II()) {
                  this.Il1lIl1l1lI1111lllll11l1IlIl();
                  this.IlIl1lIIIlIlI1ll1II1l11l1l();
                  this.l111IlI11IlIIll11l1llll();
                  this.I111Il1II1I11lIlIlIl11l();
               }
            }
         }
      }
   }

   private boolean I11lIllIl1lIlI1I11lIIII() {
      if (this.llIlI1I1111Il11I1I11) {
         this.l1l1l11Il11l();
         return true;
      } else if (this.l11lI1I1lIl1 != 0) {
         this.lIII1II1lll1l1 = false;
         this.ZenithInternal086(true);
         this.II1lI1III1l1IlI1IlIIII();
         return true;
      } else if (this.I1I1ll1IlIlllI1l1ll > 0) {
         this.I1I1ll1IlIlllI1l1ll--;
         this.III11Il11IlI();
         return true;
      } else if (!ZenithInternal001.EventBus(l11I1I1ll1Illll1I1l1111l1II.world)) {
         this.lIII1II1lll1l1 = false;
         this.ZenithInternal086(true);
         this.III11Il11IlI();
         return true;
      } else if (this.Il1l1111l11II111lII1llI1Il) {
         this.l11l11llllI11111Il1IIll();
         return true;
      } else {
         return false;
      }
   }

   private void III11Il11IlI() {
      this.I1IIl111IlI1I1l1III1I1l();
      this.l11lI1II1l1IlIIlIIIl1();
      this.l111IlI11IlIIll11l1llll();
      this.l11I11l111l11ll1II1l11Illl1I11();
   }

   private boolean I111lIIl11IIl1111111I() {
      return this.StringHolder_10(this.IlII1111lIII11II()) || this.I1ll1I1l11I11lIll1ll && this.Ill1IllIII1I1IlIIl11();
   }

   private void l11II1llllll11l() {
      this.IllIlII1I();
      this.lII11111IlIl11lII1Il11l1lI = 0;
      this.l11lllIIl1lI11lI();
      this.I1IIl111IlI1I1l1III1I1l();
      this.l111IlI11IlIIll11l1llll();
      this.lIII1II1lll1l1 = false;
   }

   private boolean lll1Il111l1lll11lI11lIl1II11ll() {
      if (!this.I1ll1I1l11I11lIll1ll) {
         this.lII11111IlIl11lII1Il11l1lI = 0;
         return false;
      } else if (++this.lII11111IlIl11lII1Il11l1lI < 100) {
         return false;
      } else {
         this.III11Il11IlI();
         this.Il1lIll11I1I();
         this.lII11111IlIl11lII1Il11l1lI = 0;
         return true;
      }
   }

   private boolean I1llll1Il1l1Il1llIl1II() {
      if (this.lll11lIIlllII() && (this.lIII1II1lll1l1 || this.I1lI11lIlllI1())) {
         this.lIII1II1lll1l1 = true;
         this.I1IIl111IlI1I1l1III1I1l();
         this.l11lI1II1l1IlIIlIIIl1();
         this.IIl1lll11I11I();
         this.llI1lIl111l1I1l1();
         return true;
      } else {
         this.lIII1II1lll1l1 = false;
         return false;
      }
   }

   @EventTarget
   public void Event(EventImpl_30 ll1iil11ii) {
      this.lII111I11I1I11I1II = false;
      this.I1I11lI1II1llIII1l11l1 = null;
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null && this.l11lI1I1lIl1 == 0) {
         if (ZenithInternal001.EventBus(l11I1I1ll1Illll1I1l1111l1II.world)) {
            if (this.llIlI1I1111Il11I1I11) {
               this.l11l11I111I1ll1II1Illllll1();
            } else if (this.Il1l1111l11II111lII1llI1Il) {
               this.I1I1IIII1lII1I();
            } else if (this.lIII1II1lll1l1) {
               this.IIl1lll11I11I();
            } else if (!this.llI1111ll11I1IlIlI1lllll1l11()) {
               this.I1I11lI1II1llIII1l11l1 = this.lII1II1III11lI1Il1lIIIlII();
               this.byteHolder_2(this.I1I11lI1II1llIII1l11l1);
            } else {
               this.IlIl1lIIIlIlI1ll1II1l11l1l();
               if (this.l1lIIII11ll != null) {
                  this.IIlIIl1Ill1ll1l1lI();
                  this.ZenithInternal084(this.l1lIIII11ll);
               } else {
                  this.I1I11lI1II1llIII1l11l1 = this.lIIIlII1ll11();
                  if (this.I1I11lI1II1llIII1l11l1 != null) {
                     this.byteHolder_2(this.I1I11lI1II1llIII1l11l1);
                  }
               }
            }
         }
      }
   }

   @EventTarget(
      ZenithInternal095 = 0
   )
   public void EventImpl_21(PlayerInputHolder ili11i1il11) {
      if (this.I11Il1lIIllII1l1I1I11()) {
         ili11i1il11.Creeperfarm();
      } else if (this.lIII1II1lll1l1) {
         ili11i1il11.Creeperfarm();
      } else {
         if (this.lII111I11I1I11I1II
            && (this.l1lIIII11ll != null || this.I1I11lI1II1llIII1l11l1 != null)
            && !(l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof net.minecraft.client.gui.screen.ChatScreen)
            && !(l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof InventoryScreen)) {
            if (this.I1I11lI1II1llIII1l11l1 != null) {
               this.CallableImpl(ili11i1il11);
               if (!this.llI1111ll11I1IlIlI1lllll1l11()) {
                  ili11i1il11.FinishThread(true);
               }

               return;
            }

            this.CallableImpl(ili11i1il11);
         }
      }
   }

   @EventTarget
   public void StringHolder_8(BlockPosHolder_2 ll11ii1i1l1) {
      if (this.Spider() && this.I11Il1lIIllII1l1I1I11()) {
         this.l11l11I111I1ll1II1Illllll1();
         ll11ii1i1l1.ZenithInternal069();
      } else {
         if (this.Spider() && !ZenithInternal001.ZenithInternal086(ll11ii1i1l1.Noslow())) {
            ll11ii1i1l1.ZenithInternal069();
         }
      }
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_14 ill1i111i1l1) {
      if (this.Spider() && l11I1I1ll1Illll1I1l1111l1II.player != null && ill1i111i1l1.Autobuy() instanceof ItemEntity ItemEntity) {
         if (!this.I11Il1lIIllII1l1I1I11()) {
            if (!(l11I1I1ll1Illll1I1l1111l1II.player.squaredDistanceTo(ItemEntity) > 36.0)) {
               ItemStack ItemStack = ItemEntity.getStack();
               if (this.CallableImpl(ItemStack)) {
                  ItemEntity.discard();
               }
            }
         }
      }
   }

   @EventTarget
   public void onChatReceive(TextHolder_2 l1li1l1111ii111i11l) {
      if (this.Spider() && l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.player.networkHandler != null) {
         String s = l1li1l1111ii111i11l.Shaderesp().getString().toLowerCase(Locale.ROOT);
         if (!this.I11Il1lIIllII1l1I1I11()) {
            if (this.l11lI1I1lIl1 != 0 && s.contains("сервер заполнен")) {
               this.booleanHolder(this.l11lI1I1lIl1);
            } else if (s.contains("побереги свой инструмент, он почти сломан")) {
               if (!this.l1lI1l1llll11ll1IlIIl()) {
                  this.lIl1I1II1l1I1111l111();
                  this.StringHolder_13(false);
                  l11I1I1ll1Illll1I1l1111l1II.player.networkHandler.sendChatCommand("hub");
                  this.StringHolder_32(false);
               }
            }
         }
      }
   }

   private void I111Il1II1I11lIlIlIl11l() {
      double d0 = this.IIllIlIll1Il();
      this.IlIl1lIIIlIlI1ll1II1l11l1l();
      if (this.l1lIIII11ll != null
         && !(ZenithInternal001.Event(l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F), this.l1lIIII11ll) > d0 * d0)) {
         BlockHitResult BlockHitResult = this.StringHolder_8(this.l1lIIII11ll, d0);
         this.lI1II1l1ll11I = BlockHitResult;
         if (BlockHitResult != null && BlockHitResult.getType() != net.minecraft.util.hit.HitResult.class_240.MISS) {
            this.EventImpl_13(BlockHitResult);
            if (!this.ClearHeadersHandler(BlockHitResult.getBlockPos())) {
               this.ZenithException_2(BlockHitResult.getBlockPos());
               this.IllIlII1I();
               this.l11I11l111l11ll1II1l11Illl1I11();
            }
         } else {
            this.lI1II1l1ll11I = null;
            if (!this.EventImpl_21(d0)) {
               this.I1IIl111IlI1I1l1III1I1l();
            }
         }
      } else {
         this.ll1lI1II1IIII11l1l = null;
         this.lI1II1l1ll11I = null;
         if (!this.EventImpl_21(d0)) {
            this.I1IIl111IlI1I1l1III1I1l();
         }
      }
   }

   private boolean EventImpl_21(double d0) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         List list = this.l111llII();
         List list1 = this.ConnectThread(list);
         BlockHitResult BlockHitResult = ZenithInternal088.StringHolder_8(
            l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F),
            II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1(),
            d0,
            BlockHitResult -> BlockHitResultx != null && this.StringHolder_8(BlockHitResultx.getBlockPos(), list, list1)
         );
         if (BlockHitResult != null
            && BlockHitResult.getType() != net.minecraft.util.hit.HitResult.class_240.MISS
            && this.StringHolder_8(BlockHitResult.getBlockPos(), list, list1)) {
            this.l1lIIII11ll = BlockHitResult.getBlockPos().toImmutable();
            this.lI1II1l1ll11I = BlockHitResult;
            this.EventImpl_13(BlockHitResult);
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean StringHolder_8(BlockPos BlockPos, List<BlockPos> list, List<BlockPos> list1) {
      if (!this.ClearHeadersHandler(BlockPos) || this.IIlIIll11lIl.contains(BlockPos)) {
         return false;
      } else if (this.ll1IIIl1111lll.contains(BlockPos)) {
         return false;
      } else if (!this.ZenithInternal021(BlockPos)) {
         return false;
      } else {
         return !this.CallableImpl(list1).contains(BlockPos) ? false : list1 == list || BlockPos.getY() == this.IlIl1lIllIIllII1llll111lI();
      }
   }

   private BlockHitResult StringHolder_8(BlockPos BlockPos, double d0) {
      return ZenithInternal088.StringHolder_8(
         l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F),
         II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1(),
         d0,
         BlockHitResult -> BlockHitResult != null && BlockHitResult.getBlockPos().equals(BlockPos) && this.ClearHeadersHandler(BlockHitResult.getBlockPos())
      );
   }

   private void IlIl1lIIIlIlI1ll1II1l11l1l() {
      if (this.l1lIIII11ll != null && !this.ClearHeadersHandler(this.l1lIIII11ll)) {
         if (this.ll1lI1II1IIII11l1l != null && this.ll1lI1II1IIII11l1l.getBlockPos().equals(this.l1lIIII11ll)) {
            this.ZenithException_2(this.l1lIIII11ll);
            this.l11I11l111l11ll1II1l11Illl1I11();
         }

         this.IllIlII1I();
      }

      if (this.l1lIIII11ll != null && !this.ZenithInternal021(this.l1lIIII11ll)) {
         BlockPos BlockPosx = this.I1IIlI1IIllll11I1l1lIIl();
         if (BlockPosx == null || !BlockPosx.equals(this.l1lIIII11ll)) {
            this.IllIlII1I();
         }
      }

      if (this.l1lIIII11ll != null && !this.l1lIIII11ll.equals(this.I1I1Illll1II11l11IlI1)) {
         this.I1I1llll1l1l1llIlII11++;
         if (this.I1I1llll1l1l1llIlII11 >= 60) {
            this.ll1IIIl1111lll.add(this.l1lIIII11ll.toImmutable());
            this.IllIlII1I();
            this.ll1lI1II1IIII11l1l = null;
            this.l11I11l111l11ll1II1l11Illl1I11();
         }
      }

      BlockPos BlockPos = this.lI1IlIlll1IlII11IIIIII1lII();
      if (BlockPos != null && !BlockPos.equals(this.l1lIIII11ll)) {
         this.ZenithInternal101(BlockPos);
         this.IIlIIl1Ill1ll1l1lI();
      }
   }

   private void ZenithInternal101(BlockPos BlockPos) {
      this.l1lIIII11ll = BlockPos;
      this.lI1II1l1ll11I = null;
      this.I1I1llll1l1l1llIlII11 = 0;
   }

   private void IllIlII1I() {
      this.l1lIIII11ll = null;
      this.lI1II1l1ll11I = null;
      this.I1I1llll1l1l1llIlII11 = 0;
   }

   private void ZenithInternal084(BlockPos BlockPos) {
      net.minecraft.util.math.Vec3d Vec3dx = l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F);
      BlockHitResult BlockHitResult = ZenithInternal001.StringHolder_8(
         BlockPos, this.IIllIlIll1Il(), l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F)
      );
      net.minecraft.util.math.Vec3d Vec3dx = BlockHitResult == null ? BlockPos.toCenterPos() : BlockHitResult.getPos();
      this.byteHolder_2(Vec3dx);
   }

   private void byteHolder_2(net.minecraft.util.math.Vec3d Vec3d) {
      net.minecraft.util.math.Vec3d Vec3dx = l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F);
      floatHolder_6 il1ll111liili1ll11liil = floatHolder_6.EventImpl_21(Vec3dx, Vec3dx);
      floatHolder_6 il1ll111liili1ll11liil1 = floatHolder.StringHolder_8(il1ll111liili1ll11liil, 68.0F, 46.0F, 0.55F);
      II1ll1II1l11lI.StringHolder_8(new SupplierHolder(il1ll111liili1ll11liil1, () -> {
         this.lII111I11I1I11I1II = true;
         return llI1lIIIlII111I11l1lIIl11.StringHolder_8(llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II(), il1ll111liili1ll11liil1);
      }, llI1lIIIlII111I11l1lIIl11.IlIll11I1lll1II1llI1I1II()), 20, this);
   }

   private void IIl1lll11I11I() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
         net.minecraft.util.math.Vec3d Vec3dxx = l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F);
         net.minecraft.util.math.Vec3d Vec3dx;
         if (this.l1lIIII11ll != null) {
            net.minecraft.util.math.Vec3d Vec3dxx = this.l1lIIII11ll.toCenterPos();
            Vec3dx = new net.minecraft.util.math.Vec3d(Vec3dxx.x - Vec3dxx.x, 0.0, Vec3dxx.z - Vec3dxx.z)
               .normalize();
         } else {
            Vec3dx = this.EventImpl_13(180.0);
         }

         if (Vec3dx.lengthSquared() < 0.01) {
            Vec3dx = this.EventImpl_13(180.0);
         }

         this.byteHolder_2(Vec3dxx.add(Vec3dx.multiply(this.IIllIlIll1Il())));
      }
   }

   private void I1I1IIII1lII1I() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
         net.minecraft.util.math.Vec3d Vec3d = l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F);
         this.byteHolder_2(Vec3d.add(0.0, -this.IIllIlIll1Il(), 0.0));
      }
   }

   private boolean l1lI1l1llll11ll1IlIIl() {
      if (this.I11Il1lIIllII1l1I1I11()
         || this.II1IIIllll11Illl
         || l11I1I1ll1Illll1I1l1111l1II.player == null
         || l11I1I1ll1Illll1I1l1111l1II.interactionManager == null
         || !this.lllIllllI()) {
         return false;
      } else if (!this.lII111l111I1l1Ill1llI()) {
         return false;
      } else {
         this.Il1l1111l11II111lII1llI1Il = true;
         this.l11l11I111I1ll1II1Illllll1();
         this.II1lI1I11llII111l11llI = 0;
         this.IIIlll1l11Il1IlI111 = 0;
         this.I1llI1I1ll1lIl11 = -1;
         this.II1IIIllll11Illl = false;
         this.llIlI1I1111Il11I1I11 = false;
         this.IIllI1II1lll111IIl = this.Il1lllI11I = this.l1ll1III11Il111ll1lI = 0;
         this.lIlIIllI = l11I1I1ll1Illll1I1l1111l1II.player.getOffHandStack().copy();
         this.lll1111IIl1I11IIllIII = this.l1IIlll1I1IIIlI1II1IIlll111();
         this.II11II1III1lllllI = 0;
         this.I1I1IIII1lII1I();
         return true;
      }
   }

   private void l11l11llllI11111Il1IIll() {
      this.l11l11I111I1ll1II1Illllll1();
      this.I1I1IIII1lII1I();
      if (!this.lllIllllI()) {
         this.ZenithInternal086(true);
      } else if (!this.lII111l111I1l1Ill1llI() || !this.lIlI1ll1I1I()) {
         this.IIlIIIl1I1l111ll1IIIllII();
      } else if (this.l1lIllIl1lIIIIl11lIl1lIll()) {
         if (this.II1lI1I11llII111l11llI > 0) {
            this.II1lI1I11llII111l11llI--;
         } else {
            ZenithInternal066.EventBus(Hand.OFF_HAND);
            this.II1lI1I11llII111l11llI = 5;
            this.IIIlll1l11Il1IlI111 = 0;
            this.II11II1III1lllllI++;
         }
      }
   }

   private boolean lIlI1ll1I1I() {
      int i = this.l1IIlll1I1IIIlI1II1IIlll111();
      if (this.lll1111IIl1I11IIllIII >= 0 && i < this.lll1111IIl1I11IIllIII) {
         this.II11II1III1lllllI = 0;
      }

      this.lll1111IIl1I11IIllIII = i;
      return this.II11II1III1lllllI < 32;
   }

   private boolean l1lIllIl1lIIIIl11lIl1lIll() {
      if (this.l1ll1III11Il111ll1lI > 0) {
         this.l1ll1III11Il111ll1lI--;
         return false;
      } else {
         boolean flag = l11I1I1ll1Illll1I1l1111l1II.player.getOffHandStack().getItem() == Items.EXPERIENCE_BOTTLE;
         if (!this.l111IIIlIl1II1llIll1IllII1I1()) {
            this.IIlIIIl1I1l111ll1IIIllII();
            return false;
         } else if (!flag) {
            this.IIIlll1l11Il1IlI111 = 0;
            return false;
         } else if (this.IIIlll1l11Il1IlI111 < 2) {
            this.IIIlll1l11Il1IlI111++;
            return false;
         } else {
            return true;
         }
      }
   }

   private void ZenithInternal086(boolean flag) {
      boolean flag1 = flag
         && this.II1IIIllll11Illl
         && this.I1llI1I1ll1lIl11 != -1
         && l11I1I1ll1Illll1I1l1111l1II.player != null
         && l11I1I1ll1Illll1I1l1111l1II.interactionManager != null;
      if (flag1) {
         this.llIlI1I1111Il11I1I11 = true;
         this.IIllI1II1lll111IIl = 24;
         this.Il1lllI11I = 0;
         this.IIlI1I1Ill1Il1IllI();
      }

      this.Il1l1111l11II111lII1llI1Il = false;
      this.II1lI1I11llII111l11llI = 0;
      this.IIIlll1l11Il1IlI111 = 0;
      this.lll1111IIl1I11IIllIII = -1;
      this.II11II1III1lllllI = 0;
      this.l11l11I111I1ll1II1Illllll1();
      if (!this.llIlI1I1111Il11I1I11) {
         this.l1llI1IIlIl11lI1IIl();
      }
   }

   private void IIlIIIl1I1l111ll1IIIllII() {
      this.ZenithInternal086(true);
      this.lIl1I1II1l1I1111l111();
      this.StringHolder_13(true);
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.player.networkHandler != null) {
         l11I1I1ll1Illll1I1l1111l1II.player.networkHandler.sendChatCommand("hub");
      }

      this.StringHolder_32(false);
   }

   private boolean l111IIIlIl1II1llIll1IllII1I1() {
      if (l11I1I1ll1Illll1I1l1111l1II.player.getOffHandStack().getItem() == Items.EXPERIENCE_BOTTLE) {
         return true;
      } else {
         Slot Slot = this.lI11I1IIlI1lll1I1l1();
         if (Slot == null) {
            return false;
         } else {
            if (this.I1llI1I1ll1lIl11 == -1) {
               this.I1llI1I1ll1lIl11 = Slot.id;
            }

            this.II1IIIllll11Illl = true;
            l11I1I1ll1Illll1I1l1111l1II.interactionManager
               .clickSlot(
                  l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.syncId,
                  Slot.id,
                  40,
                  SlotActionType.SWAP,
                  l11I1I1ll1Illll1I1l1111l1II.player
               );
            this.l1ll1III11Il111ll1lI = 40;
            return true;
         }
      }
   }

   private Slot lI11I1IIlI1lll1I1l1() {
      return ListHolder_5.StringHolder_8(Items.EXPERIENCE_BOTTLE, (Predicate<Slot>)(Slot -> Slot.id != 45));
   }

   private boolean lII111l111I1l1Ill1llI() {
      return l11I1I1ll1Illll1I1l1111l1II.player.getOffHandStack().getItem() == Items.EXPERIENCE_BOTTLE || this.lI11I1IIlI1lll1I1l1() != null;
   }

   private void l1l1l11Il11l() {
      this.l11l11I111I1ll1II1Illllll1();
      if (this.l1I11llIl1Il1ll()) {
         this.l1llI1IIlIl11lI1IIl();
      } else {
         if (this.IIllI1II1lll111IIl <= 0) {
            this.IIllI1II1lll111IIl = 24;
         }

         if (this.Il1lllI11I > 0) {
            this.Il1lllI11I--;
         } else {
            this.IIlI1I1Ill1Il1IllI();
            this.IIllI1II1lll111IIl--;
         }
      }
   }

   private void IIlI1I1Ill1Il1IllI() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null
         && l11I1I1ll1Illll1I1l1111l1II.interactionManager != null
         && this.I1llI1I1ll1lIl11 != -1
         && !this.l1I11llIl1Il1ll()) {
         ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getOffHandStack();
         if (ItemStack.isEmpty() || ItemStack.isOf(Items.EXPERIENCE_BOTTLE)) {
            l11I1I1ll1Illll1I1l1111l1II.interactionManager
               .clickSlot(
                  l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.syncId,
                  this.I1llI1I1ll1lIl11,
                  40,
                  SlotActionType.SWAP,
                  l11I1I1ll1Illll1I1l1111l1II.player
               );
            this.Il1lllI11I = 40;
         }
      }
   }

   private boolean l1I11llIl1Il1ll() {
      if (l11I1I1ll1Illll1I1l1111l1II.player == null) {
         return false;
      } else {
         ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getOffHandStack();
         return this.lIlIIllI.isEmpty()
            ? ItemStack.isEmpty()
            : ItemStack.areItemsEqual(ItemStack, this.lIlIIllI) && ItemStack.areEqual(ItemStack, this.lIlIIllI);
      }
   }

   private void l1llI1IIlIl11lI1IIl() {
      this.I1llI1I1ll1lIl11 = -1;
      this.II1IIIllll11Illl = false;
      this.llIlI1I1111Il11I1I11 = false;
      this.IIllI1II1lll111IIl = this.Il1lllI11I = this.l1ll1III11Il111ll1lI = 0;
      this.lIlIIllI = ItemStack.EMPTY;
   }

   private boolean lllIllllI() {
      ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getMainHandStack();
      return ItemStack.isDamageable() && ItemStack.getDamage() > 0 && ItemStack.getDamage() > ItemStack.getMaxDamage() * 10 / 100;
   }

   private boolean I11Il1lIIllII1l1I1I11() {
      return this.Il1l1111l11II111lII1llI1Il || this.llIlI1I1111Il11I1I11;
   }

   private void l11l11I111I1ll1II1Illllll1() {
      this.lIII1II1lll1l1 = false;
      this.IllIlII1I();
      this.I1I11lI1II1llIII1l11l1 = null;
      this.IIlIIl1Ill1ll1l1lI();
      this.ll1lI1II1IIII11l1l = null;
      this.lIl1I1II1l1I1111l111();
      this.l11I11l111l11ll1II1l11Illl1I11();
   }

   private int l1IIlll1I1IIIlI1II1IIlll111() {
      ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getMainHandStack();
      return ItemStack.isDamageable() ? ItemStack.getDamage() : 0;
   }

   private net.minecraft.util.math.Vec3d lII1II1III11lI1Il1lIIIlII() {
      net.minecraft.util.math.Vec3d Vec3d = l11I1I1ll1Illll1I1l1111l1II.player.getPos();
      double d0 = Math.max(63.5, Math.min(81.5, Vec3d.x));
      double d1 = Math.max(16.5, Math.min(34.5, Vec3d.z));
      return new net.minecraft.util.math.Vec3d(d0, l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F).y, d1);
   }

   private boolean EventImpl_13(BlockHitResult BlockHitResult) {
      this.lIl1Illl1l();
      if (this.ll1lI1II1IIII11l1l == null || !this.ll1lI1II1IIII11l1l.getBlockPos().equals(BlockHitResult.getBlockPos())) {
         this.ll1lI1II1IIII11l1l = BlockHitResult;
         l11I1I1ll1Illll1I1l1111l1II.interactionManager.attackBlock(BlockHitResult.getBlockPos(), BlockHitResult.getSide());
      }

      this.ll1lI1II1IIII11l1l = BlockHitResult;
      l11I1I1ll1Illll1I1l1111l1II.interactionManager.updateBlockBreakingProgress(BlockHitResult.getBlockPos(), BlockHitResult.getSide());
      l11I1I1ll1Illll1I1l1111l1II.player.swingHand(Hand.MAIN_HAND);
      return true;
   }

   private void lIl1Illl1l() {
      l11I1I1ll1Illll1I1l1111l1II.options.attackKey.setPressed(true);
   }

   private void I1IIl111IlI1I1l1III1I1l() {
      if (l11I1I1ll1Illll1I1l1111l1II != null && l11I1I1ll1Illll1I1l1111l1II.options != null) {
         l11I1I1ll1Illll1I1l1111l1II.options.attackKey.setPressed(false);
      }
   }

   private void l11lI1II1l1IlIIlIIIl1() {
      if (l11I1I1ll1Illll1I1l1111l1II != null && l11I1I1ll1Illll1I1l1111l1II.options != null) {
         l11I1I1ll1Illll1I1l1111l1II.options.forwardKey.setPressed(false);
      }
   }

   private void lIl1I1II1l1I1111l111() {
      this.I1IIl111IlI1I1l1III1I1l();
      this.l11lI1II1l1IlIIlIIIl1();
      this.l111IlI11IlIIll11l1llll();
      this.IlI1I1l1l1lIlI1Ill = 0;
      if (l11I1I1ll1Illll1I1l1111l1II != null && l11I1I1ll1Illll1I1l1111l1II.options != null) {
         l11I1I1ll1Illll1I1l1111l1II.options.backKey.setPressed(false);
         l11I1I1ll1Illll1I1l1111l1II.options.leftKey.setPressed(false);
         l11I1I1ll1Illll1I1l1111l1II.options.rightKey.setPressed(false);
         l11I1I1ll1Illll1I1l1111l1II.options.jumpKey.setPressed(false);
         l11I1I1ll1Illll1I1l1111l1II.options.sprintKey.setPressed(false);
         l11I1I1ll1Illll1I1l1111l1II.options.useKey.setPressed(false);
      }
   }

   private void CallableImpl(PlayerInputHolder ili11i1il11) {
      ili11i1il11.ZenithInternal061(true);
      ili11i1il11.ZenithInternal021(this.l1I11I11IlIlII1l1ll1lll1II11lI >= 12 || this.Il11II111lll1l1IllIIIll11IlIl());
   }

   private boolean Il11II111lll1l1IllIIIll11IlIl() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null
         && l11I1I1ll1Illll1I1l1111l1II.world != null
         && l11I1I1ll1Illll1I1l1111l1II.player.isOnGround()
         && !this.Il1l1111l11II111lII1llI1Il
         && !this.lIII1II1lll1l1) {
         net.minecraft.util.math.Vec3d Vec3dx = this.EventImpl_13(0.0);
         net.minecraft.util.math.Vec3d Vec3dx = l11I1I1ll1Illll1I1l1111l1II.player.getPos().add(Vec3dx.multiply(0.7));
         BlockPos BlockPos = BlockPos.ofFloored(Vec3dx.x, l11I1I1ll1Illll1I1l1111l1II.player.getY(), Vec3dx.z);
         if (!ZenithInternal001.StringHolder_13(BlockPos)) {
            this.IlI1I1l1l1lIlI1Ill = 0;
            return false;
         } else {
            boolean flag = !this.StringHolder_5(BlockPos)
               && this.StringHolder_5(BlockPos.up())
               && this.StringHolder_5(BlockPos.up(2));
            if (!flag) {
               this.IlI1I1l1l1lIlI1Ill = 0;
               return false;
            } else {
               this.IlI1I1l1l1lIlI1Ill++;
               return this.IlI1I1l1l1lIlI1Ill >= 40;
            }
         }
      } else {
         this.IlI1I1l1l1lIlI1Ill = 0;
         return false;
      }
   }

   private net.minecraft.util.math.Vec3d EventImpl_13(double d0) {
      double d1 = Math.toRadians((double)II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1().AutoBrewing() + d0);
      return new net.minecraft.util.math.Vec3d(-Math.sin(d1), 0.0, Math.cos(d1));
   }

   private boolean llI1lIl111l1I1l1() {
      if (this.IlI11I1l1II11I1I()) {
         return true;
      } else if (!this.l1II1I111lIlIIl1()) {
         return false;
      } else if (!this.lll11lIIlllII()) {
         this.II1l1I1IIIlI1lI1lIl1IIl = 20;
         this.l111IlI11IlIIll11l1llll();
         return false;
      } else if (this.III1llllll1lI111lI < 2) {
         this.III1llllll1lI111lI++;
         return true;
      } else {
         return this.lll111IIlIIll11ll1lll1I();
      }
   }

   private boolean IlI11I1l1II11I1I() {
      if (this.Il11I1Il1111l > 0) {
         this.Il11I1Il1111l--;
         this.l111IlI11IlIIll11l1llll();
         return true;
      } else {
         return false;
      }
   }

   private boolean l1II1I111lIlIIl1() {
      if (l11I1I1ll1Illll1I1l1111l1II.currentScreen != null || l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler == null) {
         this.l111IlI11IlIIll11l1llll();
         return false;
      } else if (!this.lIII1II1lll1l1 && !this.I1lI11lIlllI1()) {
         this.l111IlI11IlIIll11l1llll();
         return false;
      } else {
         boolean flag = this.lIIII11IIlIII111();
         if (this.II1l1I1IIIlI1lI1lIl1IIl > 0 && !flag && !this.lIII1II1lll1l1) {
            this.II1l1I1IIIlI1lI1lIl1IIl--;
            this.l111IlI11IlIIll11l1llll();
            return false;
         } else {
            return true;
         }
      }
   }

   private boolean lll111IIlIIll11ll1lll1I() {
      Slot Slot = this.StringHolder_8(this::ConnectThread);
      if (Slot != null) {
         this.HostnameVerifierImpl(Slot);
         return true;
      } else {
         this.II1l1I1IIIlI1lI1lIl1IIl = 20;
         this.l111IlI11IlIIll11l1llll();
         return false;
      }
   }

   private void HostnameVerifierImpl(Slot Slot) {
      ItemStack ItemStack = Slot.getStack();
      this.ll1l1l1IlII11l1Ill.add(ItemStack.getItem());
      l11I1I1ll1Illll1I1l1111l1II.interactionManager
         .clickSlot(
            l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.syncId,
            Slot.id,
            1,
            SlotActionType.THROW,
            l11I1I1ll1Illll1I1l1111l1II.player
         );
      this.Il11I1Il1111l = this.lIII1II1lll1l1 ? 0 : 4;
      this.II1l1I1IIIlI1lI1lIl1IIl = this.lIII1II1lll1l1 ? 0 : 20;
      this.III1llllll1lI111lI = 0;
   }

   private boolean I1lI11lIlllI1() {
      return l11I1I1ll1Illll1I1l1111l1II.player != null
         && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler != null
         && this.StringHolder_8(ItemStack::isEmpty) == null;
   }

   private boolean lll11lIIlllII() {
      return this.StringHolder_8(this::ConnectThread) != null;
   }

   private boolean lIIII11IIlIII111() {
      return !this.ll1l1l1IlII11l1Ill.isEmpty()
         && this.StringHolder_8(ItemStack -> !ItemStack.isEmpty() && this.ll1l1l1IlII11l1Ill.contains(ItemStack.getItem())) != null;
   }

   private Slot StringHolder_8(Predicate<ItemStack> predicate) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler != null) {
         int i = Math.min(44, l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.slots.size() - 1);

         for (int j = 9; j <= i; j++) {
            Slot Slot = l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.getSlot(j);
            if (predicate.test(Slot.getStack())) {
               return Slot;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private void l111IlI11IlIIll11l1llll() {
      if (l11I1I1ll1Illll1I1l1111l1II != null && l11I1I1ll1Illll1I1l1111l1II.options != null) {
         l11I1I1ll1Illll1I1l1111l1II.options.backKey.setPressed(false);
      }

      this.III1llllll1lI111lI = 0;
   }

   private boolean ConnectThread(ItemStack ItemStack) {
      if (!ItemStack.isOf(Items.PLAYER_HEAD) && !ItemStack.isOf(Items.REDSTONE) && !ItemStack.isOf(Items.TRIPWIRE_HOOK)
         )
       {
         return !ItemStack.isEmpty() && ItemStack.getItem() instanceof BlockItem BlockItem
            ? !ZenithInternal001.Event(BlockItem.getBlock())
            : false;
      } else {
         return false;
      }
   }

   private boolean CallableImpl(ItemStack ItemStack) {
      return !ItemStack.isEmpty() && this.ll1l1l1IlII11l1Ill.contains(ItemStack.getItem());
   }

   private BlockPos lI1IlIlll1IlII11IIIIII1lII() {
      List list = this.l111llII();
      List list1 = this.ConnectThread(list);
      BlockPos BlockPosxxxxx = this.I1IIlI1IIllll11I1l1lIIl();
      if (BlockPosxxxxx == null) {
         BlockPosxxxxx = this.lIIIIl1IlII1ll1II1111lll();
      }

      if (BlockPosxxxxx != null) {
         return BlockPosxxxxx;
      } else {
         List list2 = this.hasTimeElapsed(list1);
         List list3 = list2.stream()
            .filter(this::ZenithInternal021)
            .filter(
               BlockPos -> ZenithInternal001.StringHolder_8(
                        BlockPosxxxxxx, this.IIllIlIll1Il(), l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F)
                     )
                     != null
            )
            .toList();
         List list4 = this.CallableImpl(list3);
         net.minecraft.util.math.Vec3d Vec3dx = l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F);
         BlockPos BlockPosx = this.StringHolder_8(list1, Vec3dx);
         if (BlockPosx != null) {
            net.minecraft.util.math.Vec3d Vec3dx = l11I1I1ll1Illll1I1l1111l1II.player.getPos();
            BlockPos BlockPosxx = ZenithInternal001.StringHolder_8(BlockPosx, list4, Vec3dx, Vec3dx);
            if (BlockPosxx != null) {
               return BlockPosxx;
            }

            BlockPos BlockPosxxx = ZenithInternal001.StringHolder_8(
               BlockPosx, list4, Vec3dx, Vec3dx, this.IlIl1lIllIIllII1llll111lI()
            );
            if (BlockPosxxx != null) {
               return BlockPosxxx;
            }

            BlockPos BlockPosxxxx = this.StringHolder_8(list4, BlockPosx, Vec3dx);
            if (BlockPosxxxx != null) {
               return BlockPosxxxx;
            }
         }

         BlockPos BlockPosxxxx = list4.stream()
            .min(Comparator.comparingDouble(BlockPos -> ZenithInternal001.Event(Vec3dx, BlockPosxxxxxx)))
            .orElse(null);
         return BlockPosxxxx != null ? BlockPosxxxx : null;
      }
   }

   private List<BlockPos> ConnectThread(List<BlockPos> list) {
      return this.StringHolder_8(list, (Predicate<BlockPos>)(BlockPos -> BlockPos.getY() == this.IlIl1lIllIIllII1llll111lI()));
   }

   private List<BlockPos> CallableImpl(List<BlockPos> list) {
      return this.StringHolder_8(list, (Predicate<BlockPos>)(BlockPos -> BlockPos.getY() >= this.IlIl1lIllIIllII1llll111lI()));
   }

   private List<BlockPos> StringHolder_8(List<BlockPos> list, Predicate<BlockPos> predicate) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && !list.isEmpty()) {
         List list1 = list.stream().filter(predicate).toList();
         return list1.isEmpty() ? list : list1;
      } else {
         return list;
      }
   }

   private BlockPos StringHolder_8(List<BlockPos> list, BlockPos BlockPos, net.minecraft.util.math.Vec3d Vec3d) {
      return list.stream()
         .min(
            Comparator.<BlockPos>comparingDouble(BlockPos -> ZenithInternal001.Event(BlockPos.toCenterPos(), BlockPosxx))
               .thenComparingDouble(BlockPos -> ZenithInternal001.Event(Vec3d, BlockPosx))
         )
         .orElse(null);
   }

   private BlockPos StringHolder_8(List<BlockPos> list, net.minecraft.util.math.Vec3d Vec3d) {
      if (this.I1111l11llll11I11Ill1 > 0
         && this.l111II1IIlll1IIIl11lI1l11I1Il != null
         && list.contains(this.l111II1IIlll1IIIl11lI1l11I1Il)
         && this.StringHolder_19(this.l111II1IIlll1IIIl11lI1l11I1Il)) {
         this.I1111l11llll11I11Ill1--;
         return this.l111II1IIlll1IIIl11lI1l11I1Il;
      } else {
         this.l111II1IIlll1IIIl11lI1l11I1Il = this.EventBus(list, Vec3d);
         this.I1111l11llll11I11Ill1 = 10;
         return this.l111II1IIlll1IIIl11lI1l11I1Il;
      }
   }

   @Override
   public boolean llI1lll1lIllII11I1111Illl() {
      return true;
   }

   private BlockPos EventBus(List<BlockPos> list, net.minecraft.util.math.Vec3d Vec3d) {
      return this.ll1l1IllII.getDescription().isEmpty()
         ? null
         : list.stream()
            .filter(this::StringHolder_19)
            .max(
               Comparator.<BlockPos>comparingInt(this::ZenithInternal061)
                  .thenComparing(
                     Comparator.<BlockPos>comparingDouble(BlockPos -> ZenithInternal001.Event(Vec3d, BlockPos)).reversed()
                  )
            )
            .orElse(null);
   }

   private boolean StringHolder_19(BlockPos BlockPos) {
      return !this.ll1l1IllII.getDescription().isEmpty()
         && l11I1I1ll1Illll1I1l1111l1II.world != null
         && l11I1I1ll1Illll1I1l1111l1II.world.isChunkLoaded(BlockPos)
         && this.ll1l1IllII.EventTarget(l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPos).getBlock());
   }

   private int ZenithInternal061(BlockPos BlockPos) {
      int i = 0;

      for (BlockPos BlockPosx : BlockPos.iterate(BlockPosx.add(-2, -2, -2), BlockPosx.add(2, 2, 2))) {
         if (ZenithInternal001.ZenithInternal086(BlockPosx) && this.StringHolder_19(BlockPosx.toImmutable())) {
            i++;
         }
      }

      return i;
   }

   private net.minecraft.util.math.Vec3d lIIIlII1ll11() {
      if (l11I1I1ll1Illll1I1l1111l1II.player == null) {
         return null;
      } else {
         net.minecraft.util.math.Vec3d Vec3dx = l11I1I1ll1Illll1I1l1111l1II.player.getPos();
         List list = this.ConnectThread(this.l111llII());
         if (this.I1l111ll1III1 != null
            && (!list.contains(this.I1l111ll1III1) || ZenithInternal001.Event(Vec3dx, this.I1l111ll1III1) < 1.0)) {
            this.I1l111ll1III1 = null;
            this.Il1II11lIIlI1l111ll = 0;
         }

         if (this.I1l111ll1III1 == null || this.Il1II11lIIlI1l111ll <= 0) {
            this.I1l111ll1III1 = this.EventBus(list, Vec3dx);
            if (this.I1l111ll1III1 == null) {
               this.I1l111ll1III1 = list.stream()
                  .min(Comparator.comparingDouble(BlockPos -> ZenithInternal001.Event(Vec3dx, BlockPos)))
                  .orElse(null);
            }

            this.Il1II11lIIlI1l111ll = 60;
         }

         if (this.I1l111ll1III1 == null) {
            return null;
         } else {
            this.Il1II11lIIlI1l111ll--;
            net.minecraft.util.math.Vec3d Vec3dx = this.I1l111ll1III1.toCenterPos();
            return new net.minecraft.util.math.Vec3d(
               Vec3dx.x, l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F).y, Vec3dx.z
            );
         }
      }
   }

   private void Il1lIl1l1lI1111lllll11l1IlIl() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null
         && l11I1I1ll1Illll1I1l1111l1II.world != null
         && !this.I11Il1lIIllII1l1I1I11()
         && !this.lIII1II1lll1l1
         && this.llI1111ll11I1IlIlI1lllll1l11()) {
         net.minecraft.util.math.Vec3d Vec3d = l11I1I1ll1Illll1I1l1111l1II.player.getPos();
         if (this.IIIIIIl1l11 == null) {
            this.IIIIIIl1l11 = Vec3d;
            this.l1I11I11IlIlII1l1ll1lll1II11lI = 0;
            this.I1I1Illll1II11l11IlI1 = null;
         } else {
            double d0 = Vec3d.squaredDistanceTo(this.IIIIIIl1l11);
            this.IIIIIIl1l11 = Vec3d;
            if (d0 > 0.0025) {
               this.l1I11I11IlIlII1l1ll1lll1II11lI = 0;
               this.I1I1Illll1II11l11IlI1 = null;
            } else {
               BlockPos BlockPos = this.lIIIIl1IlII1ll1II1111lll();
               if (BlockPos == null) {
                  this.l1I11I11IlIlII1l1ll1lll1II11lI = 0;
                  this.I1I1Illll1II11l11IlI1 = null;
               } else {
                  this.l1I11I11IlIlII1l1ll1lll1II11lI++;
                  if (this.l1I11I11IlIlII1l1ll1lll1II11lI >= 12) {
                     this.I1I1Illll1II11l11IlI1 = BlockPos;
                     this.ZenithInternal101(BlockPos);
                     this.l11I11l111l11ll1II1l11Illl1I11();
                  }
               }
            }
         }
      } else {
         this.l11lllIIl1lI11lI();
      }
   }

   private BlockPos I1IIlI1IIllll11I1l1lIIl() {
      if (this.I1I1Illll1II11l11IlI1 == null
         || !this.ClearHeadersHandler(this.I1I1Illll1II11l11IlI1)
         || this.IIlIIll11lIl.contains(this.I1I1Illll1II11l11IlI1)) {
         this.I1I1Illll1II11l11IlI1 = null;
      }

      return this.I1I1Illll1II11l11IlI1;
   }

   private void l11lllIIl1lI11lI() {
      this.l1I11I11IlIlII1l1ll1lll1II11lI = 0;
      this.I1I1Illll1II11l11IlI1 = null;
      this.IIIIIIl1l11 = null;
   }

   private void IIlIIl1Ill1ll1l1lI() {
      this.I1l111ll1III1 = null;
      this.Il1II11lIIlI1l111ll = 0;
   }

   private BlockPos lIIIIl1IlII1ll1II1111lll() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         net.minecraft.util.math.Vec3d Vec3dxxx = this.EventImpl_13(0.0);
         net.minecraft.util.math.Vec3d Vec3dx = new net.minecraft.util.math.Vec3d(Vec3dxxx.z, 0.0, -Vec3dxxx.x);
         net.minecraft.util.math.Vec3d Vec3dxx = l11I1I1ll1Illll1I1l1111l1II.player.getPos();
         double[] adouble = new double[]{0.35, 0.7, 1.05, 1.35};
         double[] adouble1 = new double[]{0.0, 0.32, -0.32};

         for (double d0 : adouble) {
            for (double d1 : adouble1) {
               net.minecraft.util.math.Vec3d Vec3dxxx = Vec3dxx.add(Vec3dxxx.multiply(d0)).add(Vec3dx.multiply(d1));
               if (!(Vec3dxxx.x < 63.0)
                  && !(Vec3dxxx.x > 82.0)
                  && !(Vec3dxxx.z < 16.0)
                  && !(Vec3dxxx.z > 35.0)) {
                  BlockPos BlockPosxxx = BlockPos.ofFloored(
                     Vec3dxxx.x, l11I1I1ll1Illll1I1l1111l1II.player.getY(), Vec3dxxx.z
                  );
                  BlockPos BlockPosx = this.FinishThread(BlockPosxxx);
                  if (BlockPosx != null) {
                     return BlockPosx;
                  }

                  BlockPos BlockPosxx = this.FinishThread(BlockPosxxx.up());
                  if (BlockPosxx != null) {
                     return BlockPosxx;
                  }

                  BlockPos BlockPosxxx = this.FinishThread(BlockPosxxx.up(2));
                  if (this.longHolder_3(BlockPosxxx) && BlockPosxxx != null) {
                     return BlockPosxxx;
                  }
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private BlockPos FinishThread(BlockPos BlockPos) {
      return ZenithInternal001.ZenithInternal086(BlockPos)
            && this.ClearHeadersHandler(BlockPos)
            && !this.IIlIIll11lIl.contains(BlockPos)
         ? BlockPos.toImmutable()
         : null;
   }

   private boolean IIIl11IIII11llIIl111l() {
      if (l11I1I1ll1Illll1I1l1111l1II.player == null) {
         return false;
      } else {
         ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getMainHandStack();
         if (ItemStack.isEmpty()) {
            return false;
         } else {
            LoreComponent LoreComponent = (LoreComponent)ItemStack.get(DataComponentTypes.LORE);
            if (LoreComponent != null) {
               String s = LoreComponent.styledLines().stream().<CharSequence>map(Text::getString).collect(Collectors.joining(" ")).toLowerCase(Locale.ROOT);
               if (s.contains("бур")) {
                  return true;
               }
            }

            NbtComponent NbtComponent = (NbtComponent)ItemStack.get(DataComponentTypes.CUSTOM_DATA);
            return NbtComponent != null && NbtComponent.getNbt().toString().toLowerCase(Locale.ROOT).contains("бур");
         }
      }
   }

   private List<BlockPos> longHolder_5(List<BlockPos> list) {
      double d0 = this.IIllIlIll1Il() + 1.0;
      double d1 = d0 * d0;
      return list.stream()
         .filter(BlockPos -> ZenithInternal001.Event(l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F), BlockPos) <= d1)
         .toList();
   }

   private void III1llI1lI1Il11lIl1I1I111() {
      List list = this.l111llII();
      if (list.isEmpty()) {
         this.lIll1I111lIll1ll1II1I1II();
      } else if (this.ll1III111I11l11lIII11l1I1 == Integer.MIN_VALUE) {
         this.ZenithInternal042(list);
      } else if (this.ll1IlI1l1lIlIlI111lII() && this.FinishThread(list)) {
         this.l111Ill1lII1I1lll1ll.add(this.ll1III111I11l11lIII11l1I1);
         this.StringHolder_19(list);
      } else if (!this.ZenithException(this.ll1III111I11l11lIII11l1I1)) {
         this.StringHolder_19(list);
      } else {
         long i = this.ZenithInternal101(list);
         if (i == 0L || i <= 19L) {
            this.StringHolder_19(list);
         }
      }
   }

   private void lIll1I111lIll1ll1II1I1II() {
      this.ll1III111I11l11lIII11l1I1 = Integer.MIN_VALUE;
      this.IllIlII1I();
   }

   private void ZenithInternal042(List<BlockPos> list) {
      this.ll1III111I11l11lIII11l1I1 = this.ZenithInternal084(list);
      this.IllIlII1I();
   }

   private long ZenithInternal101(List<BlockPos> list) {
      return list.stream().filter(this::ZenithInternal064).count();
   }

   private int ZenithInternal084(List<BlockPos> list) {
      int i = this.StringHolder_8(list, j -> !this.l111Ill1lII1I1lll1ll.contains(j), true);
      if (i != Integer.MIN_VALUE) {
         return i;
      } else {
         i = this.EventBus(list, j -> !this.l111Ill1lII1I1lll1ll.contains(j), true);
         if (i != Integer.MIN_VALUE) {
            return i;
         } else {
            i = this.StringHolder_8(list, j -> true, true);
            return i != Integer.MIN_VALUE ? i : this.EventBus(list, j -> true, true);
         }
      }
   }

   private boolean StringHolder_19(List<BlockPos> list) {
      int i = this.ZenithInternal061(list);
      if (i == Integer.MIN_VALUE) {
         return false;
      } else {
         this.ll1III111I11l11lIII11l1I1 = i;
         this.l111Ill1lII1I1lll1ll.remove(i);
         this.IllIlII1I();
         return true;
      }
   }

   private int ZenithInternal061(List<BlockPos> list) {
      int i = this.StringHolder_8(list, j -> j < this.ll1III111I11l11lIII11l1I1 && !this.l111Ill1lII1I1lll1ll.contains(j), true);
      if (i != Integer.MIN_VALUE) {
         return i;
      } else {
         i = this.StringHolder_8(list, j -> j > this.ll1III111I11l11lIII11l1I1 && !this.l111Ill1lII1I1lll1ll.contains(j), false);
         if (i != Integer.MIN_VALUE) {
            return i;
         } else {
            i = this.StringHolder_8(list, j -> j > this.ll1III111I11l11lIII11l1I1, false);
            if (i != Integer.MIN_VALUE) {
               return i;
            } else {
               i = this.StringHolder_8(list, j -> j < this.ll1III111I11l11lIII11l1I1, true);
               return i != Integer.MIN_VALUE ? i : this.StringHolder_8(list, j -> true, true);
            }
         }
      }
   }

   private int StringHolder_8(List<BlockPos> list, IntPredicate intpredicate, boolean flag) {
      return this.StringHolder_8(list, intpredicate, flag, true);
   }

   private int EventBus(List<BlockPos> list, IntPredicate intpredicate, boolean flag) {
      return this.StringHolder_8(list, intpredicate, flag, false);
   }

   private int StringHolder_8(List<BlockPos> list, IntPredicate intpredicate, boolean flag, boolean flag1) {
      Stream stream = list.stream()
         .<Integer>map(Vec3i::getY)
         .distinct()
         .filter(integer -> intpredicate.test(integer) && (!flag1 || this.ZenithException(integer)));
      return (flag ? stream.max(Integer::compareTo) : stream.min(Integer::compareTo)).orElse(Integer.MIN_VALUE);
   }

   private boolean ZenithInternal064(BlockPos BlockPos) {
      return this.ll1III111I11l11lIII11l1I1 != Integer.MIN_VALUE && BlockPos.getY() == this.ll1III111I11l11lIII11l1I1;
   }

   private boolean ll1IlI1l1lIlIlI111lII() {
      return l11I1I1ll1Illll1I1l1111l1II.player != null
         && this.ll1III111I11l11lIII11l1I1 != Integer.MIN_VALUE
         && l11I1I1ll1Illll1I1l1111l1II.player.getBlockY() < this.ll1III111I11l11lIII11l1I1 - 1;
   }

   private boolean FinishThread(List<BlockPos> list) {
      return list.stream()
         .<Integer>map(Vec3i::getY)
         .distinct()
         .anyMatch(integer -> integer < this.ll1III111I11l11lIII11l1I1 && !this.l111Ill1lII1I1lll1ll.contains(integer) && this.ZenithException(integer));
   }

   private boolean ZenithException(int i) {
      if (l11I1I1ll1Illll1I1l1111l1II.player == null) {
         return true;
      } else {
         double d0 = l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F).y;
         double d1 = 0.0;
         if (d0 < (double)i) {
            d1 = (double)i - d0;
         } else if (d0 > (double)i + 1.0) {
            d1 = d0 - ((double)i + 1.0);
         }

         double d2 = this.IIllIlIll1Il();
         return d1 <= d2;
      }
   }

   private boolean ZenithInternal021(BlockPos BlockPos) {
      if (l11I1I1ll1Illll1I1l1111l1II.player == null) {
         return true;
      } else if (BlockPos.getY() <= this.IlIl1lIllIIllII1llll111lI()) {
         return true;
      } else {
         net.minecraft.util.math.Vec3d Vec3d = l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F);
         double d0 = this.IIllIlIll1Il();
         return ZenithInternal001.Event(Vec3d, BlockPos) <= d0 * d0;
      }
   }

   private int IlIl1lIllIIllII1llll111lI() {
      return BlockPos.ofFloored(l11I1I1ll1Illll1I1l1111l1II.player.getEyePos()).getY();
   }

   private List<BlockPos> l111llII() {
      if (this.I11ll1lIl1 > 0) {
         this.I11ll1lIl1--;
         return this.IlIl1lIIlIl1l1lI11lII1Il11Il;
      } else {
         List list = BlockPos.stream(63, 93, 16, 81, 101, 34)
            .<BlockPos>map(BlockPos::toImmutable)
            .filter(this::ClearHeadersHandler)
            .filter(BlockPos -> !this.IIlIIll11lIl.contains(BlockPos))
            .filter(BlockPos -> !this.ll1IIIl1111lll.contains(BlockPos))
            .toList();
         this.IlIl1lIIlIl1l1lI11lII1Il11Il = list;
         this.I11ll1lIl1 = 4;
         return list;
      }
   }

   private void ZenithException_2(BlockPos BlockPos) {
      if (ZenithInternal001.ZenithInternal086(BlockPosxx)) {
         this.lII11111IlIl11lII1Il11l1lI = 0;
         this.I1ll1I1l11I11lIll1ll = true;
         this.ll1IIIl1111lll.remove(BlockPosxx.toImmutable());
         if (BlockPosxx.equals(this.I1I1Illll1II11l11IlI1)) {
            this.l11lllIIl1lI11lI();
         }
      }

      if (!this.IIIl11IIII11llIIl111l()) {
         if (ZenithInternal001.ZenithInternal086(BlockPosxx)) {
            this.IIlIIll11lIl.add(BlockPosxx.toImmutable());
         }
      } else {
         for (BlockPos BlockPosx : BlockPos.iterate(BlockPosxx.add(-1, 0, -1), BlockPosxx.add(1, 0, 1))) {
            BlockPos BlockPosxx = BlockPosx.toImmutable();
            if (ZenithInternal001.ZenithInternal086(BlockPosxx) && BlockPosxx.getY() == BlockPosxx.getY()) {
               this.IIlIIll11lIl.add(BlockPosxx);
            }
         }
      }
   }

   private int IlII1111lIII11II() {
      return this.l111llII().size();
   }

   private boolean StringHolder_10(int i) {
      return i < 650;
   }

   private boolean Ill1IllIII1I1IlIIl11() {
      List list = this.l111llII();
      if (list.isEmpty()) {
         return false;
      } else {
         byte b0 = 100;
         return list.stream().<Integer>map(Vec3i::getY).distinct().allMatch(integer -> integer >= b0);
      }
   }

   private boolean ClearHeadersHandler(BlockPos BlockPos) {
      if (BlockPos != null
         && l11I1I1ll1Illll1I1l1111l1II.world != null
         && ZenithInternal001.ZenithInternal086(BlockPos)
         && l11I1I1ll1Illll1I1l1111l1II.world.isChunkLoaded(BlockPos)) {
         BlockState BlockState = l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPos);
         return !BlockState.isAir()
            && BlockState.getFluidState().isEmpty()
            && BlockState.getHardness(l11I1I1ll1Illll1I1l1111l1II.world, BlockPos) >= 0.0F;
      } else {
         return false;
      }
   }

   private double IIllIlIll1Il() {
      return l11I1I1ll1Illll1I1l1111l1II.player.getBlockInteractionRange();
   }

   private boolean StringHolder_5(BlockPos BlockPos) {
      return l11I1I1ll1Illll1I1l1111l1II.world.isChunkLoaded(BlockPos)
         && l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPos).getCollisionShape(l11I1I1ll1Illll1I1l1111l1II.world, BlockPos).isEmpty();
   }

   private boolean longHolder_3(BlockPos BlockPos) {
      return l11I1I1ll1Illll1I1l1111l1II.world.isChunkLoaded(BlockPos)
         && !l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPos).getCollisionShape(l11I1I1ll1Illll1I1l1111l1II.world, BlockPos).isEmpty();
   }

   private boolean llI1111ll11I1IlIlI1lllll1l11() {
      return ZenithInternal001.ZenithInternal084(l11I1I1ll1Illll1I1l1111l1II.player.getPos());
   }

   private void Il1111l11Il1l1I1I1lII() {
      this.booleanHolder(0);
   }

   private void booleanHolder(int i) {
      int j = this.ZenithInternal028(ZenithClient.getInstance().SupplierHolder().lIl1l1l11ll1lI1I1I(), i);
      this.I1IIl111IlI1I1l1III1I1l();
      this.l11lI1II1l1IlIIlIIIl1();
      this.l111IlI11IlIIll11l1llll();
      this.IIlIIll11lIl.clear();
      this.l11lI1I1lIl1 = j;
      this.Il11I1Il1111l = 0;
      this.II1l1I1IIIlI1lI1lIl1IIl = 0;
      this.ll1l1l1IlII11l1Ill.clear();
      this.l111Ill1lII1I1lll1ll.clear();
      this.ll1IIIl1111lll.clear();
      this.I1ll1I1l11I11lIll1ll = false;
      this.l11lllIIl1lI11lI();
      this.IIlIIl1Ill1ll1l1lI();
      this.IllIlII1I();
      this.lIII1II1lll1l1 = false;
      this.ZenithInternal086(true);
      this.ll1III111I11l11lIII11l1I1 = Integer.MIN_VALUE;
      this.ll1lI1II1IIII11l1l = null;
      this.l11I11l111l11ll1II1l11Illl1I11();
      ZenithClient.getInstance().FileHolder().longHolder_7(j);
   }

   private int ZenithInternal028(int i, int j) {
      int k = i;

      while (k == i || k == j || lIlII1Il11.contains(k)) {
         k = ThreadLocalRandom.current().nextInt(1, 64);
      }

      return k;
   }

   private void II1lI1III1l1IlI1IlIIII() {
      this.I1IIl111IlI1I1l1III1I1l();
      this.l11lI1II1l1IlIIlIIIl1();
      this.l111IlI11IlIIll11l1llll();
      if (ZenithClient.getInstance().SupplierHolder().lIl1l1l11ll1lI1I1I() == this.l11lI1I1lIl1) {
         this.l11lI1I1lIl1 = 0;
         this.IIlIIll11lIl.clear();
         this.l111Ill1lII1I1lll1ll.clear();
         this.ll1IIIl1111lll.clear();
         this.ll1III111I11l11lIII11l1I1 = Integer.MIN_VALUE;
         this.l11I11l111l11ll1II1l11Illl1I11();
         this.Il1lIll11I1I();
      }
   }

   private void Il1lIll11I1I() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.player.networkHandler != null) {
         l11I1I1ll1Illll1I1l1111l1II.player.networkHandler.sendChatCommand("warp mine");
         this.I1I1ll1IlIlllI1l1ll = 40;
         this.lII11111IlIl11lII1Il11l1lI = 0;
         this.I1ll1I1l11I11lIll1ll = false;
         this.l11lllIIl1lI11lI();
         this.IIlIIl1Ill1ll1l1lI();
         this.l11I11l111l11ll1II1l11Illl1I11();
      }
   }

   private void l11I11l111l11ll1II1l11Illl1I11() {
      this.I11ll1lIl1 = 0;
      this.I1111l11llll11I11Ill1 = 0;
      this.IlIl1lIIlIl1l1lI11lII1Il11Il = List.of();
      this.l111II1IIlll1IIIl11lI1l11I1Il = null;
      this.lI1II1l1ll11I = null;
   }

   private void StringHolder_13(boolean flag) {
      int i = this.I1llI1I1ll1lIl11;
      int j = this.IIllI1II1lll111IIl;
      int k = this.Il1lllI11I;
      boolean flag1 = this.II1IIIllll11Illl;
      boolean flag2 = this.llIlI1I1111Il11I1I11;
      ItemStack ItemStack = this.lIlIIllI.copy();
      this.l11lI1I1lIl1 = this.I11ll1lIl1 = this.I1111l11llll11I11Ill1 = this.I1I1ll1IlIlllI1l1ll = this.lII11111IlIl11lII1Il11l1lI = this.I1I1llll1l1l1llIlII11 = 0;
      this.IlIl1lIIlIl1l1lI11lII1Il11Il = List.of();
      this.l111II1IIlll1IIIl11lI1l11I1Il = this.l1lIIII11ll = null;
      this.I1I11lI1II1llIII1l11l1 = null;
      this.l11lllIIl1lI11lI();
      this.IIlIIl1Ill1ll1l1lI();
      this.ll1III111I11l11lIII11l1I1 = Integer.MIN_VALUE;
      this.ll1lI1II1IIII11l1l = this.lI1II1l1ll11I = null;
      this.lIII1II1lll1l1 = this.Il1l1111l11II111lII1llI1Il = this.lII111I11I1I11I1II = this.I1ll1I1l11I11lIll1ll = false;
      this.II1lI1I11llII111l11llI = this.IIIlll1l11Il1IlI111 = this.II11II1III1lllllI = this.IlI1I1l1l1lIlI1Ill = 0;
      this.l1llI1IIlIl11lI1IIl();
      this.lll1111IIl1I11IIllIII = -1;
      this.l111Ill1lII1I1lll1ll.clear();
      this.ll1IIIl1111lll.clear();
      this.IIlIIll11lIl.clear();
      this.ll1l1l1IlII11l1Ill.clear();
      this.Il11I1Il1111l = this.II1l1I1IIIlI1lI1lIl1IIl = this.III1llllll1lI111lI = 0;
      floatHolder.reset();
      if (flag && flag2) {
         this.I1llI1I1ll1lIl11 = i;
         this.II1IIIllll11Illl = flag1;
         this.llIlI1I1111Il11I1I11 = true;
         this.IIllI1II1lll111IIl = j;
         this.Il1lllI11I = k;
         this.lIlIIllI = ItemStack;
      }
   }
}
