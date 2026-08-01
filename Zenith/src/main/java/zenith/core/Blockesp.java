package zenith;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.minecraft.block.AirBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.util.math.BlockPos.TimerCallbackSerializer9;

@ModuleInfo(
   name = "BlockESP",
   category = Category.RENDER,
   description = "РџРѕРґСЃРІРµС‡РёРІР°РµС‚ Р±Р»РѕРєРё"
)
public final class Blockesp extends Module {
   private final Set<BlockPos> l1lIII1llIIIlIIlIIl1 = ConcurrentHashMap.newKeySet();
   private final ExecutorService lI1l111l1II1llll1IIll1I = Executors.newSingleThreadExecutor(runnable -> {
      Thread thread = new Thread(runnable, "zenith-block-esp-search");
      thread.setDaemon(true);
      return thread;
   });
   private final ListSetting I1l1III1IIl111IIl1lI11ll11l = new ListSetting(
      "module.blockESP.itemSelectSetting", "module.blockESP.itemSelectSetting.desc", new ArrayList<>(), () -> true
   );
   private final ModeSetting l1l1l11ll1IllIlI1l111I = new ModeSetting("module.blockESP.mode", "module.blockESP.mode.desc");
   private final ModeOption lI11IlII1l1llIII1l111111lI = new ModeOption(
         this.l1l1l11ll1IllIlI1l111I, "module.blockESP.onlyUpdate"
      )
      .I1lII1lllll11IIlIIl1l11lII();
   private final ModeOption IIIIIIl1I1ll = new ModeOption(
      this.l1l1l11ll1IllIlI1l111I, "module.blockESP.all"
   );
   private final NumberSetting l1ll1IlIl1I1ll1lII11I1 = new NumberSetting(
      "module.blockESP.range", 80.0F, 1.0F, 128.0F, 2.0F, "module.blockESP.range.desc", "b", this.IIIIIIl1I1ll::isSelected, null
   );
   private final NumberSetting l1llIlI1IlI1I111Ill1111 = new NumberSetting(
      "module.blockESP.time", 4.0F, 0.0F, 100.0F, 5.0F, "module.blockESP.time.desc", "s", this.IIIIIIl1I1ll::isSelected, null
   );
   private final BooleanSetting l1ll1I1I11 = new BooleanSetting("module.blockESP.tracers", "module.blockESP.tracers.desc", false);
   private final longHolder llllllII11Il1Ill1Il1IllIIlIl = new longHolder();
   private volatile boolean IIl1l1IIlllII11I1lII111I11lIl1;
   private volatile int III1II11lIIIl1llIlllIl1;
   public static final Blockesp lI1I111IlIll1Ill = new Blockesp();

   private Blockesp() {
      this.I1l1III1IIl111IIl1lI11ll11l.StringHolder_8(Blocks.DIAMOND_ORE);
   }

   @Override
   public void onEnable() {
      this.llllllII11Il1Ill1Il1IllIIlIl.longHolder_4(0L);
      this.Il1IlllllI11llIIlIl1I11lII111();
      super.l11l1lII();
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      this.Il1IlllllI11llIIlIl1I11lII111();
      this.l1lIII1llIIIlIIlIIl1.clear();
      super.l1l1lI111l1II1Illl111l1l1ll1l();
   }

   @EventTarget
   public void ZenithInternal028(EventImpl_22 l11llilil1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player == null || l11I1I1ll1Illll1I1l1111l1II.world == null) {
         this.Il1IlllllI11llIIlIl1I11lII111();
      } else if (this.lI11IlII1l1llIII1l111111lI.isSelected()) {
         this.Il1IlllllI11llIIlIl1I11lII111();
      } else {
         if (!this.IIl1l1IIlllII11I1lII111I11lIl1
            && this.llllllII11Il1Ill1Il1IllIIlIl.booleanHolder(this.l1llIlI1IlI1I111Ill1111.lll1lI1llll1IIllIIIII1lll() * 1000.0F)) {
            this.llIl1II111I();
            this.llllllII11Il1Ill1Il1IllIIlIl.reset();
         }
      }
   }

   @EventTarget
   public void EventImpl_13(EventImpl_34 ll1li1l111llllli1) {
      if (l11I1I1ll1Illll1I1l1111l1II.world != null) {
         for (BlockPos BlockPos : this.l1lIII1llIIIlIIlIIl1) {
            Block Block = l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPos).getBlock();
            if (this.I1l1III1IIl111IIl1lI11ll11l.EventTarget(Block)) {
               if (Block == Blocks.DIAMOND_ORE || Block == Blocks.DEEPSLATE_DIAMOND_ORE) {
                  this.StringHolder_8(BlockPos, Color.cyan.getRGB());
               } else if (Block == Blocks.GOLD_ORE || Block == Blocks.DEEPSLATE_GOLD_ORE || Block == Blocks.NETHER_GOLD_ORE) {
                  this.StringHolder_8(BlockPos, (char)-10496);
               } else if (Block == Blocks.EMERALD_ORE || Block == Blocks.DEEPSLATE_EMERALD_ORE) {
                  this.StringHolder_8(BlockPos, -16711859);
               } else if (Block == Blocks.IRON_ORE || Block == Blocks.DEEPSLATE_IRON_ORE) {
                  this.StringHolder_8(BlockPos, -2763307);
               } else if (Block == Blocks.REDSTONE_ORE || Block == Blocks.DEEPSLATE_REDSTONE_ORE) {
                  this.StringHolder_8(BlockPos, -65536);
               } else if (Block == Blocks.ANCIENT_DEBRIS) {
                  this.StringHolder_8(BlockPos, -1);
               } else {
                  MapColor MapColor = Block.getDefaultMapColor();
                  if (MapColor != null) {
                     this.StringHolder_8(BlockPos, new Color(MapColor.color).getRGB());
                  }
               }
            }
         }
      }
   }

   @EventTarget
   public void EventTarget(PacketHolder ii1l11il1i1i) {
      if (ii1l11il1i1i.longHolder_8()) {
         if (ii1l11il1i1i.Swinganimation() instanceof ChunkDeltaUpdateS2CPacket ChunkDeltaUpdateS2CPacket) {
            ChunkDeltaUpdateS2CPacket.visitUpdates((BlockPos, BlockState) -> this.StringHolder_8(BlockPos.toImmutable(), BlockState.getBlock()));
         }

         if (ii1l11il1i1i.Swinganimation() instanceof BlockUpdateS2CPacket BlockUpdateS2CPacket) {
            this.StringHolder_8(BlockUpdateS2CPacket.getPos().toImmutable(), BlockUpdateS2CPacket.getState().getBlock());
         }
      }
   }

   private void StringHolder_8(BlockPos BlockPos, Block Block) {
      if (this.ZenithInternal095(Block)) {
         this.l1lIII1llIIIlIIlIIl1.add(BlockPos);
      } else {
         this.l1lIII1llIIIlIIlIIl1.remove(BlockPos);
      }
   }

   private void StringHolder_8(BlockPos BlockPos, int i) {
      ListHolder_2.StringHolder_8(new net.minecraft.util.math.Box(BlockPos), i, 1.0F);
      if (this.l1ll1I1I11.Spider()) {
         net.minecraft.util.math.Vec3d Vec3d = new net.minecraft.util.math.Vec3d(0.0, 0.0, 75.0)
            .rotateX(-((float)Math.toRadians((double)l11I1I1ll1Illll1I1l1111l1II.gameRenderer.getCamera().getPitch())))
            .rotateY(-((float)Math.toRadians((double)l11I1I1ll1Illll1I1l1111l1II.gameRenderer.getCamera().getYaw())))
            .add(Freecam.IlIl11lIIl.llllllIllIIl1Il1lIlI1I1lIIl11l());
         ListHolder_2.StringHolder_8(Vec3d, BlockPos.toCenterPos(), i, 1.0F, false);
      }
   }

   private boolean ZenithInternal095(Block Block) {
      return !(Block instanceof AirBlock) && this.I1l1III1IIl111IIl1lI11ll11l.EventTarget(Block);
   }

   private void llIl1II111I() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null && !this.IIl1l1IIlllII11I1lII111I11lIl1) {
         this.IIl1l1IIlllII11I1lII111I11lIl1 = true;
         int i = this.III1II11lIIIl1llIlllIl1;
         CompletableFuture.<Set<BlockPos>>supplyAsync(() -> this.floatHolder_12(i), this.lI1l111l1II1llll1IIll1I)
            .thenAccept(set -> l11I1I1ll1Illll1I1l1111l1II.execute(() -> this.StringHolder_8(set, i)))
            .exceptionally(throwable -> {
               l11I1I1ll1Illll1I1l1111l1II.execute(() -> this.ArrayListHolder_2(i));
               return null;
            });
      }
   }

   private Set<BlockPos> floatHolder_12(int i) {
      ClientPlayerEntity ClientPlayerEntity = l11I1I1ll1Illll1I1l1111l1II.player;
      ClientWorld ClientWorld = l11I1I1ll1Illll1I1l1111l1II.world;
      if (ClientPlayerEntity != null && ClientWorld != null) {
         int j = (int)this.l1ll1IlIl1I1ll1lII11I1.lll1lI1llll1IIllIIIII1lll();
         int k = (int)Math.floor(ClientPlayerEntity.getX() - (double)j);
         int l = (int)Math.ceil(ClientPlayerEntity.getX() + (double)j);
         int i1 = ClientWorld.getBottomY() + 1;
         int j1 = ClientWorld.getTopYInclusive();
         int k1 = (int)Math.floor(ClientPlayerEntity.getZ() - (double)j);
         int l1 = (int)Math.ceil(ClientPlayerEntity.getZ() + (double)j);
         HashSet hashset = new HashSet();
         TimerCallbackSerializer9 TimerCallbackSerializer9 = new TimerCallbackSerializer9();

         for (int i2 = k; i2 <= l && i == this.III1II11lIIIl1llIlllIl1; i2++) {
            for (int j2 = k1; j2 <= l1 && i == this.III1II11lIIIl1llIlllIl1; j2++) {
               if (ClientWorld.isChunkLoaded(i2 >> 4, j2 >> 4)) {
                  for (int k2 = i1; k2 <= j1; k2++) {
                     TimerCallbackSerializer9.set(i2, k2, j2);
                     Block Block = ClientWorld.getBlockState(TimerCallbackSerializer9).getBlock();
                     if (this.ZenithInternal095(Block)) {
                        hashset.add(TimerCallbackSerializer9.toImmutable());
                     }
                  }
               }
            }
         }

         return hashset;
      } else {
         return Collections.emptySet();
      }
   }

   private void StringHolder_8(Set<BlockPos> set, int i) {
      if (i == this.III1II11lIIIl1llIlllIl1) {
         if (this.Spider() && l11I1I1ll1Illll1I1l1111l1II.world != null && !this.lI11IlII1l1llIII1l111111lI.isSelected()) {
            this.l1lIII1llIIIlIIlIIl1.clear();
            this.l1lIII1llIIIlIIlIIl1.addAll(set);
            this.IIl1l1IIlllII11I1lII111I11lIl1 = false;
         } else {
            this.IIl1l1IIlllII11I1lII111I11lIl1 = false;
         }
      }
   }

   private void ArrayListHolder_2(int i) {
      if (i == this.III1II11lIIIl1llIlllIl1) {
         this.IIl1l1IIlllII11I1lII111I11lIl1 = false;
      }
   }

   private void Il1IlllllI11llIIlIl1I11lII111() {
      this.III1II11lIIIl1llIlllIl1++;
      this.IIl1l1IIlllII11I1lII111I11lIl1 = false;
   }
}
