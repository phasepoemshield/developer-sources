// Module: BaseFinder
// Category: misc
// Original class: Basefinder
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.misc;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraft.world.LightType;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.BlockState;
import net.minecraft.util.Identifier;
import net.minecraft.block.MapColor;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.registry.Registries;
import net.minecraft.util.math.BlockPos.TimerCallbackSerializer9;
import zenith.zov.base.font.Fonts;

@ModuleInfo(
   name = "BaseFinder",
   description = "РёС‰РµС‚ Р±Р°Р·С‹",
   category = Category.MISC
)
public final class Basefinder extends Module {
   private static final int I1I1l1I11III1ll1l = 8192;
   private static final int III1I1Il1I1l1I1 = 4096;
   private static final int lll111I1l1IlIII1I111IIIl = 3072;
   private static final int IIII11IIIl1I1Ill = 1536;
   public static final Basefinder Illlll11I1I = new Basefinder();
   private JsonObject IIll11l1Il1Il1Il1l1llI11II;
   private final MultiBooleanSetting lII11lll11l11IlIlI = new MultiBooleanSetting(
      "module.baseFinder.mods",
      "module.baseFinder.mods.desc",
      MultiBooleanSetting$II1Il11l111II11IIl.ZenithInternal095("module.baseFinder.mods.cave", false),
      MultiBooleanSetting$II1Il11l111II11IIl.EventImpl_8("module.baseFinder.mods.bypass"),
      MultiBooleanSetting$II1Il11l111II11IIl.EventImpl_8("module.baseFinder.mods.click"),
      MultiBooleanSetting$II1Il11l111II11IIl.EventImpl_8("module.baseFinder.mods.packetAnalysis")
   );
   private final NumberSetting I1I1l111llllI = new NumberSetting(
      "module.baseFinder.range", 30.0F, 1.0F, 128.0F, 2.0F, "module.baseFinder.range.desc", "b"
   );
   private final NumberSetting Ill1I1l111I1II1I111lIIlI1l1 = new NumberSetting(
      "module.baseFinder.min",
      3.0F,
      0.0F,
      30.0F,
      1.0F,
      "module.baseFinder.min.desc",
      "x",
      () -> this.lII11lll11l11IlIlI.ConstructorHolder(0),
      null
   );
   private final NumberSetting l1l1II1Il1111I1I11I = new NumberSetting(
      "module.baseFinder.max",
      50.0F,
      5.0F,
      100.0F,
      5.0F,
      "module.baseFinder.max.desc",
      "x",
      () -> this.lII11lll11l11IlIlI.ConstructorHolder(0),
      null
   );
   private final NumberSetting lllIlI1II1 = new NumberSetting(
      "module.baseFinder.minLength",
      2.0F,
      0.0F,
      30.0F,
      1.0F,
      "module.baseFinder.minLength.desc",
      "b",
      () -> this.lII11lll11l11IlIlI.ConstructorHolder(0),
      null
   );
   private final NumberSetting I11111l11lI = new NumberSetting(
      "module.baseFinder.minWidth",
      2.0F,
      0.0F,
      30.0F,
      1.0F,
      "module.baseFinder.minWidth.desc",
      "b",
      () -> this.lII11lll11l11IlIlI.ConstructorHolder(0),
      null
   );
   private final longHolder II1lIIIl1ll1IlI1II1l1 = new longHolder();
   private final Set<BlockPos> lll11llI1llIllllI1l11 = ConcurrentHashMap.newKeySet();
   private final Set<BlockPos> l1ll11111lIlIIIIllIl1IllI1l = ConcurrentHashMap.newKeySet();
   private final CopyOnWriteArrayList<Basefinder$l1lll11l1l> IIIIIIIl1IlII111Il1llII1l = new CopyOnWriteArrayList<>();
   private final List<BlockPos> lI1lI111II = new ArrayList<>();
   private volatile int I1l1I1l1llI1III1IIIll = 1;
   private volatile int lI1llIlIl1 = 0;
   private volatile long IllI111l1lIlIIIl = 0L;
   private volatile boolean IIIlI1lI1I1lIllIll1IlI = false;
   private Basefinder$II1Il11l111II11IIl Il11lI1IlI1lI1IIlIl;
   private Basefinder$EventTarget Il11Il1l1lIIl11IlI1;

   private Basefinder() {
   }

   @Override
   public void onEnable() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         this.II1lIIIl1ll1IlI1II1l1.longHolder_4(0L);
         this.IIIIIIIl1IlII111Il1llII1l.clear();
         this.lll11llI1llIllllI1l11.clear();
         this.l1ll11111lIlIIIIllIl1IllI1l.clear();
         this.lI1lI111II.clear();
         this.Il11lI1IlI1lI1IIlIl = null;
         this.Il11Il1l1lIIl11IlI1 = null;
         this.IIIlI1lI1I1lIllIll1IlI = false;
         this.lI1llIlIl1 = 0;
         this.I1l1I1l1llI1III1IIIll = 1;
         this.I1I1I1lI1II1llIll1lIlI11l();
         this.l1IIllIIll1Il1II();
         super.l11l1lII();
      } else {
         this.StringHolder_11(false);
      }
   }

   @Override
   public boolean llI1lll1lIllII11I1111Illl() {
      return true;
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      this.Il11lI1IlI1lI1IIlIl = null;
      this.Il11Il1l1lIIl11IlI1 = null;
      this.IIIlI1lI1I1lIllIll1IlI = false;
      this.lll11llI1llIllllI1l11.clear();
      this.l1ll11111lIlIIIIllIl1IllI1l.clear();
      this.lI1lI111II.clear();
      this.IIll11l1Il1Il1Il1l1llI11II = null;
      super.l1l1lI111l1II1Illl111l1l1ll1l();
   }

   @EventTarget
   public void StringHolder_8(EventImpl_22 l11llilil1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         if (this.II1lIIIl1ll1IlI1II1l1.HostnameVerifierImpl(1000L)) {
            this.l1IIllIIll1Il1II();
            this.II1lIIIl1ll1IlI1II1l1.reset();
         }

         if (this.lII11lll11l11IlIlI.ReadingThread(1).Spider()) {
            this.I1llIl1I1llIlIl();
         } else {
            this.Il11lI1IlI1lI1IIlIl = null;
            this.lll11llI1llIllllI1l11.clear();
            this.lI1lI111II.clear();
         }

         if (this.lII11lll11l11IlIlI.ConstructorHolder(0)) {
            this.I1I1l1ll1l1II1l11llI1ll11l();
         } else {
            this.l1I11l11IIlIII1l1lI1lIl1I1l1I();
            this.l1ll11111lIlIIIIllIl1IllI1l.clear();
         }

         if (this.lII11lll11l11IlIlI.ConstructorHolder(2)) {
            for (int i = 0; i < 5 && !this.lI1lI111II.isEmpty(); i++) {
               BlockPos BlockPos = this.lI1lI111II.getFirst();
               ZenithInternal066.StringHolder_8(
                  new BlockHitResult(BlockPos.toCenterPos(), Direction.UP, BlockPos, false), Hand.OFF_HAND
               );
               TextHolder.EventImpl_27(this.lI1lI111II.size() + "|");
               this.lI1lI111II.removeFirst();
            }
         }
      }
   }

   @EventTarget
   public void EventBus(EventImpl_5 i1iilll1lili11lll11l11li1l) {
      if (this.IIIlI1lI1I1lIllIll1IlI && this.lII11lll11l11IlIlI.ConstructorHolder(0)) {
         double d0 = (double)this.lI1llIlIl1 * 100.0 / (double)Math.max(this.I1l1I1l1llI1III1IIIll, 1);
         long i = System.currentTimeMillis();
         long j = i - this.IllI111l1lIlIIIl;
         long k = (long)((double)j * ((double)this.I1l1I1l1llI1III1IIIll / (double)Math.max(this.lI1llIlIl1, 1)));
         long l = Math.max(k - j, 0L);
         long i1 = l / 1000L;
         long j1 = i1 / 60L;
         i1 %= 60L;
         String s = String.format("РџРѕРёСЃРє: %.1f%% (%d/%d) | РћСЃС‚Р°Р»РѕСЃСЊ: %02d:%02d", d0, this.lI1llIlIl1, this.I1l1I1l1llI1III1IIIll, j1, i1);
         i1iilll1lili11lll11l11li1l.HitParticles().StringHolder_8(Fonts.MEDIUM.getFont(20.0F), s, 0.0F, 0.0F, ByteBufferHolder.ll1lIllll111I1lIIl1lIl);
      }
   }

   @EventTarget
   public void EventImpl_24(EventImpl_34 ll1li1l111llllli1) {
      if (this.lII11lll11l11IlIlI.ConstructorHolder(1)) {
         this.lll11llI1llIllllI1l11.forEach(BlockPos -> this.StringHolder_8(BlockPos, -1));
      }

      if (this.lII11lll11l11IlIlI.ConstructorHolder(0)) {
         this.l1ll11111lIlIIIIllIl1IllI1l.forEach(BlockPos -> this.StringHolder_8(BlockPos, Color.GREEN.getRGB()));
      }

      this.IIIIIIIl1IlII111Il1llII1l.forEach(l1ii1iilii1i11lill1lll$l1lll11l1l -> {
         Block Block = l1ii1iilii1i11lill1lll$l1lll11l1l.I111II1I1III1I1l1l;
         if (Block == Blocks.DIAMOND_ORE || Block == Blocks.DEEPSLATE_DIAMOND_ORE) {
            this.StringHolder_8(l1ii1iilii1i11lill1lll$l1lll11l1l.I11lIIIlIl1l1II11ll11lll, Color.cyan.getRGB());
         } else if (Block == Blocks.GOLD_ORE || Block == Blocks.DEEPSLATE_GOLD_ORE || Block == Blocks.NETHER_GOLD_ORE) {
            this.StringHolder_8(l1ii1iilii1i11lill1lll$l1lll11l1l.I11lIIIlIl1l1II11ll11lll, (char)-10496);
         } else if (Block == Blocks.EMERALD_ORE || Block == Blocks.DEEPSLATE_EMERALD_ORE) {
            this.StringHolder_8(l1ii1iilii1i11lill1lll$l1lll11l1l.I11lIIIlIl1l1II11ll11lll, -16711859);
         } else if (Block == Blocks.IRON_ORE || Block == Blocks.DEEPSLATE_IRON_ORE) {
            this.StringHolder_8(l1ii1iilii1i11lill1lll$l1lll11l1l.I11lIIIlIl1l1II11ll11lll, -2763307);
         } else if (Block == Blocks.REDSTONE_ORE || Block == Blocks.DEEPSLATE_REDSTONE_ORE) {
            this.StringHolder_8(l1ii1iilii1i11lill1lll$l1lll11l1l.I11lIIIlIl1l1II11ll11lll, -65536);
         } else if (Block == Blocks.ANCIENT_DEBRIS) {
            this.StringHolder_8(l1ii1iilii1i11lill1lll$l1lll11l1l.I11lIIIlIl1l1II11ll11lll, -1);
         } else if (Block == Blocks.CHEST) {
            this.StringHolder_8(l1ii1iilii1i11lill1lll$l1lll11l1l.I11lIIIlIl1l1II11ll11lll, Color.ORANGE.getRGB());
         } else {
            MapColor MapColor = Block.getDefaultMapColor();
            if (MapColor != null) {
               this.StringHolder_8(l1ii1iilii1i11lill1lll$l1lll11l1l.I11lIIIlIl1l1II11ll11lll, new Color(MapColor.color).getRGB());
            }
         }
      });
   }

   @EventTarget
   public void EventTarget(PacketHolder ii1l11il1i1i) {
      if (this.lII11lll11l11IlIlI.ConstructorHolder(3)) {
      }
   }

   private void l1IIllIIll1Il1II() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         Basefinder$Event l1ii1iilii1i11lill1lll$liil11l111liil1ll = this.Ill111ll1Il11llllIIl1();
         if (this.lII11lll11l11IlIlI.ReadingThread(1).Spider() && this.Il11lI1IlI1lI1IIlIl == null) {
            this.Il11lI1IlI1lI1IIlIl = new Basefinder$II1Il11l111II11IIl(l1ii1iilii1i11lill1lll$liil11l111liil1ll);
         }

         if (this.lII11lll11l11IlIlI.ConstructorHolder(0) && this.Il11Il1l1lIIl11IlI1 == null) {
            this.Il11Il1l1lIIl11IlI1 = new Basefinder$EventTarget(l1ii1iilii1i11lill1lll$liil11l111liil1ll);
            this.IIIlI1lI1I1lIllIll1IlI = true;
            this.IllI111l1lIlIIIl = System.currentTimeMillis();
            this.lI1llIlIl1 = 0;
            this.I1l1I1l1llI1III1IIIll = Math.max(1, l1ii1iilii1i11lill1lll$liil11l111liil1ll.IIllIlII1I1());
         }
      }
   }

   private void I1llIl1I1llIlIl() {
      if (this.Il11lI1IlI1lI1IIlIl != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         int i = 0;
         int j = this.lII11lll11l11IlIlI.ConstructorHolder(0) ? 4096 : 8192;
         TimerCallbackSerializer9 TimerCallbackSerializer9 = new TimerCallbackSerializer9();

         Basefinder$II1Il11l111II11IIl l1ii1iilii1i11lill1lll$ii1il11l111ii11iil;
         for (l1ii1iilii1i11lill1lll$ii1il11l111ii11iil = this.Il11lI1IlI1lI1IIlIl; i < j && !l1ii1iilii1i11lill1lll$ii1il11l111ii11iil.finished; i++) {
            TimerCallbackSerializer9.set(
               l1ii1iilii1i11lill1lll$ii1il11l111ii11iil.field_252,
               l1ii1iilii1i11lill1lll$ii1il11l111ii11iil.field_253,
               l1ii1iilii1i11lill1lll$ii1il11l111ii11iil.field_254
            );
            if (l11I1I1ll1Illll1I1l1111l1II.world
               .isChunkLoaded(l1ii1iilii1i11lill1lll$ii1il11l111ii11iil.field_252 >> 4, l1ii1iilii1i11lill1lll$ii1il11l111ii11iil.field_254 >> 4)) {
               BlockState BlockState = l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(TimerCallbackSerializer9);
               if (this.StringHolder_8(BlockState, TimerCallbackSerializer9)) {
                  l1ii1iilii1i11lill1lll$ii1il11l111ii11iil.lIIIl111II11IlI111111llll1l1I.add(TimerCallbackSerializer9.toImmutable());
               }
            }

            l1ii1iilii1i11lill1lll$ii1il11l111ii11iil.IlIlIl11IlI1l11llI1lII11I1I1();
         }

         if (l1ii1iilii1i11lill1lll$ii1il11l111ii11iil.finished) {
            Set set = this.EventBus(l1ii1iilii1i11lill1lll$ii1il11l111ii11iil.lIIIl111II11IlI111111llll1l1I);
            this.lll11llI1llIllllI1l11.clear();
            this.lll11llI1llIllllI1l11.addAll(set);
            this.lI1lI111II.clear();
            this.lI1lI111II.addAll(set);
            this.Il11lI1IlI1lI1IIlIl = null;
         }
      }
   }

   private void I1I1l1ll1l1II1l11llI1ll11l() {
      if (this.Il11Il1l1lIIl11IlI1 != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         int i = 0;
         int j = this.lII11lll11l11IlIlI.ReadingThread(1).Spider() ? 1536 : 3072;

         Basefinder$EventTarget l1ii1iilii1i11lill1lll$illi1l1l1;
         for (l1ii1iilii1i11lill1lll$illi1l1l1 = this.Il11Il1l1lIIl11IlI1; i < j && !l1ii1iilii1i11lill1lll$illi1l1l1.finished; i++) {
            BlockPos BlockPos = new BlockPos(l1ii1iilii1i11lill1lll$illi1l1l1.x, l1ii1iilii1i11lill1lll$illi1l1l1.y, l1ii1iilii1i11lill1lll$illi1l1l1.z);
            this.lI1llIlIl1++;
            if (l11I1I1ll1Illll1I1l1111l1II.world.isChunkLoaded(BlockPos)
               && !l1ii1iilii1i11lill1lll$illi1l1l1.IlI1l1IlII1I1l11l11IIlI1.contains(BlockPos)
               && l11I1I1ll1Illll1I1l1111l1II.world.isAir(BlockPos)) {
               Basefinder$EventBus l1ii1iilii1i11lill1lll$l1i1illlili = this.StringHolder_8(
                  BlockPos,
                  l1ii1iilii1i11lill1lll$illi1l1l1.IlI1l1IlII1I1l11l11IIlI1,
                  l11I1I1ll1Illll1I1l1111l1II.world,
                  l1ii1iilii1i11lill1lll$illi1l1l1.I1IlIl1lII1I
               );
               if (this.StringHolder_8(l1ii1iilii1i11lill1lll$l1i1illlili)) {
                  l1ii1iilii1i11lill1lll$illi1l1l1.lIIIl111II11IlI111111llll1l1I.addAll(l1ii1iilii1i11lill1lll$l1i1illlili.I1I1111lIIlIII111IlI1IlII1ll11);
                  if (l1ii1iilii1i11lill1lll$l1i1illlili.Il1Il11IIl1lIII1) {
                     l1ii1iilii1i11lill1lll$illi1l1l1.lIIIl111II11IlI111111llll1l1I.addAll(l1ii1iilii1i11lill1lll$l1i1illlili.I1lll1111lI);
                  }
               }
            }

            l1ii1iilii1i11lill1lll$illi1l1l1.IlIlIl11IlI1l11llI1lII11I1I1();
         }

         if (l1ii1iilii1i11lill1lll$illi1l1l1.finished) {
            this.l1ll11111lIlIIIIllIl1IllI1l.clear();
            this.l1ll11111lIlIIIIllIl1IllI1l.addAll(l1ii1iilii1i11lill1lll$illi1l1l1.lIIIl111II11IlI111111llll1l1I);
            this.l1I11l11IIlIII1l1lI1lIl1I1l1I();
         }
      }
   }

   private void l1I11l11IIlIII1l1lI1lIl1I1l1I() {
      this.Il11Il1l1lIIl11IlI1 = null;
      this.IIIlI1lI1I1lIllIll1IlI = false;
   }

   private Basefinder$Event Ill111ll1Il11llllIIl1() {
      int i = (int)this.I1I1l111llllI.lll1lI1llll1IIllIIIII1lll();
      return new Basefinder$Event(
         (int)Math.floor(l11I1I1ll1Illll1I1l1111l1II.player.getX() - (double)i),
         (int)Math.ceil(l11I1I1ll1Illll1I1l1111l1II.player.getX() + (double)i),
         l11I1I1ll1Illll1I1l1111l1II.world.getBottomY() + 1,
         l11I1I1ll1Illll1I1l1111l1II.world.getTopYInclusive(),
         (int)Math.floor(l11I1I1ll1Illll1I1l1111l1II.player.getZ() - (double)i),
         (int)Math.ceil(l11I1I1ll1Illll1I1l1111l1II.player.getZ() + (double)i)
      );
   }

   private Set<BlockPos> EventBus(Set<BlockPos> set) {
      return !ZenithClient.getInstance().SupplierHolder().III11I1lI1I()
         ? set
         : StringHolder_8(set, 20).stream().flatMap(Collection::stream).collect(Collectors.toSet());
   }

   private boolean StringHolder_8(BlockState BlockState, BlockPos BlockPos) {
      if (ZenithClient.getInstance().SupplierHolder().III11I1lI1I()) {
         return BlockState.getBlock() != Blocks.LAVA
            && l11I1I1ll1Illll1I1l1111l1II.world.getLightLevel(LightType.BLOCK, BlockPos) > 5;
      } else {
         return l11I1I1ll1Illll1I1l1111l1II.world.getLightLevel(LightType.BLOCK, BlockPos) == 0
            ? false
            : BlockState.getBlock() == Blocks.NETHERRACK || BlockState.getBlock() == Blocks.STONE;
      }
   }

   private boolean StringHolder_8(Basefinder$EventBus l1ii1iilii1i11lill1lll$l1i1illlili) {
      if ((float)l1ii1iilii1i11lill1lll$l1i1illlili.size < this.Ill1I1l111I1II1I111lIIlI1l1.lll1lI1llll1IIllIIIII1lll()
         || (float)l1ii1iilii1i11lill1lll$l1i1illlili.size > this.l1l1II1Il1111I1I11I.lll1lI1llll1IIllIIIII1lll()) {
         return false;
      } else if ((float)l1ii1iilii1i11lill1lll$l1i1illlili.I111IIlI1Ill1IIlll() < this.lllIlI1II1.lll1lI1llll1IIllIIIII1lll()) {
         return false;
      } else {
         return (float)l1ii1iilii1i11lill1lll$l1i1illlili.Il1ll1llllIl() < this.I11111l11lI.lll1lI1llll1IIllIIIII1lll()
            ? false
            : l1ii1iilii1i11lill1lll$l1i1illlili.Il1Il11IIl1lIII1 || l1ii1iilii1i11lill1lll$l1i1illlili.I111l1I1IIll1lIlII1;
      }
   }

   private Basefinder$EventBus StringHolder_8(
      BlockPos BlockPos, Set<BlockPos> set, World World, Basefinder$Event l1ii1iilii1i11lill1lll$liil11l111liil1ll
   ) {
      ArrayDeque arraydeque = new ArrayDeque();
      Basefinder$EventBus l1ii1iilii1i11lill1lll$l1i1illlili = new Basefinder$EventBus();
      arraydeque.add(BlockPosxx);
      set.add(BlockPosxx);

      while (!arraydeque.isEmpty()) {
         BlockPos BlockPosx = (BlockPos)arraydeque.poll();
         l1ii1iilii1i11lill1lll$l1i1illlili.I1I1111lIIlIII111IlI1IlII1ll11.add(BlockPosx);
         l1ii1iilii1i11lill1lll$l1i1illlili.size++;
         int i = BlockPosx.getX();
         int j = BlockPosx.getY();
         int k = BlockPosx.getZ();
         l1ii1iilii1i11lill1lll$l1i1illlili.IlII11ll11llIll1IIlIll1ll = Math.min(l1ii1iilii1i11lill1lll$l1i1illlili.IlII11ll11llIll1IIlIll1ll, i);
         l1ii1iilii1i11lill1lll$l1i1illlili.Il1Il1IlIlllIlll1IIIIlIlIlI1I = Math.max(l1ii1iilii1i11lill1lll$l1i1illlili.Il1Il1IlIlllIlll1IIIIlIlIlI1I, i);
         l1ii1iilii1i11lill1lll$l1i1illlili.l1III11lIIlII1Il1IlIl = Math.min(l1ii1iilii1i11lill1lll$l1i1illlili.l1III11lIIlII1Il1IlIl, j);
         l1ii1iilii1i11lill1lll$l1i1illlili.I1Il1I11lIlllIII1lI1I1IIlI1lII = Math.max(l1ii1iilii1i11lill1lll$l1i1illlili.I1Il1I11lIlllIII1lI1I1IIlI1lII, j);
         l1ii1iilii1i11lill1lll$l1i1illlili.lI1I1l1lll = Math.min(l1ii1iilii1i11lill1lll$l1i1illlili.lI1I1l1lll, k);
         l1ii1iilii1i11lill1lll$l1i1illlili.llII111I1IllIlIl1Illl = Math.max(l1ii1iilii1i11lill1lll$l1i1illlili.llII111I1IllIlIl1Illl, k);
         if ((float)l1ii1iilii1i11lill1lll$l1i1illlili.size > this.l1l1II1Il1111I1I11I.lll1lI1llll1IIllIIIII1lll()) {
            break;
         }

         for (Direction Direction : Direction.values()) {
            BlockPos BlockPosxx = BlockPosx.offset(Direction);
            if (!l1ii1iilii1i11lill1lll$liil11l111liil1ll.StringHolder(BlockPosxx)) {
               l1ii1iilii1i11lill1lll$l1i1illlili.Il1Il11IIl1lIII1 = true;
               l1ii1iilii1i11lill1lll$l1i1illlili.I1lll1111lI.add(BlockPosx);
            } else if (!World.isChunkLoaded(BlockPosxx)) {
               l1ii1iilii1i11lill1lll$l1i1illlili.Il1Il11IIl1lIII1 = true;
               l1ii1iilii1i11lill1lll$l1i1illlili.I1lll1111lI.add(BlockPosx);
            } else if (!set.contains(BlockPosxx)) {
               if (World.isAir(BlockPosxx)) {
                  set.add(BlockPosxx);
                  arraydeque.add(BlockPosxx);
               } else if (this.StringHolder_8(World, BlockPosxx)) {
                  l1ii1iilii1i11lill1lll$l1i1illlili.Il1Il11IIl1lIII1 = true;
                  l1ii1iilii1i11lill1lll$l1i1illlili.I1lll1111lI.add(BlockPosxx);
               }
            }
         }
      }

      l1ii1iilii1i11lill1lll$l1i1illlili.I111l1I1IIll1lIlII1 = this.StringHolder_8(
         l1ii1iilii1i11lill1lll$l1i1illlili.I1I1111lIIlIII111IlI1IlII1ll11, World
      );
      return l1ii1iilii1i11lill1lll$l1i1illlili;
   }

   private boolean StringHolder_8(List<BlockPos> list, World World) {
      HashSet hashset = new HashSet(list);

      for (BlockPos BlockPosx : list) {
         for (Direction Direction : Direction.values()) {
            BlockPos BlockPosx = BlockPosx.offset(Direction);
            if (!World.isChunkLoaded(BlockPosx)) {
               return false;
            }

            if (!hashset.contains(BlockPosx) && World.isAir(BlockPosx)) {
               return false;
            }
         }
      }

      return true;
   }

   private boolean StringHolder_8(World World, BlockPos BlockPos) {
      return World.isChunkLoaded(BlockPos) && World.getBlockState(BlockPos).isReplaceable();
   }

   private void StringHolder_8(BlockPos BlockPos, int i) {
      ListHolder_2.StringHolder_8(new net.minecraft.util.math.Box(BlockPos), i, 1.0F);
   }

   private void I1I1I1lI1II1llIll1lIlI11l() {
      try {
         try (InputStream inputstream = ListHolder_10.class.getResourceAsStream("/assets/zenith/fonts/msdf/hold.json")) {
            if (inputstream != null) {
               byte[] abyte = Base64.getDecoder().decode(inputstream.readAllBytes());
               byte[] abyte1 = SecureRandomHolder.ZenithInternal095(abyte, "1.21.4");

               try (InputStreamReader inputstreamreader = new InputStreamReader(new ByteArrayInputStream(abyte1), StandardCharsets.UTF_8)) {
                  this.IIll11l1Il1Il1Il1l1llI11II = (JsonObject)new Gson().fromJson(inputstreamreader, JsonObject.class);
                  return;
               }
            }

            this.IIll11l1Il1Il1Il1l1llI11II = null;
         }
      } catch (Exception exception) {
         this.IIll11l1Il1Il1Il1l1llI11II = null;
         exception.printStackTrace();
      }
   }

   public static List<List<BlockPos>> StringHolder_8(Collection<BlockPos> collection, int i) {
      ArrayList arraylist = new ArrayList();
      HashSet hashset = new HashSet(collection);

      while (!hashset.isEmpty()) {
         BlockPos BlockPosxx = (BlockPos)hashset.iterator().next();
         ArrayList arraylist1 = new ArrayList();
         ArrayDeque arraydeque = new ArrayDeque();
         arraydeque.add(BlockPosxx);
         hashset.remove(BlockPosxx);

         while (!arraydeque.isEmpty()) {
            BlockPos BlockPosx = (BlockPos)arraydeque.poll();
            arraylist1.add(BlockPosx);

            for (BlockPos BlockPosxx : ZenithInternal045(BlockPosx)) {
               if (hashset.contains(BlockPosxx)) {
                  hashset.remove(BlockPosxx);
                  arraydeque.add(BlockPosxx);
               }
            }
         }

         if (arraylist1.size() <= i) {
            arraylist.add(arraylist1);
         }
      }

      return arraylist;
   }

   private static List<BlockPos> ZenithInternal045(BlockPos BlockPos) {
      ArrayList arraylist = new ArrayList(6);

      for (Direction Direction : Direction.values()) {
         arraylist.add(BlockPos.offset(Direction));
      }

      return arraylist;
   }

   public static CopyOnWriteArrayList<Basefinder$l1lll11l1l> StringHolder_8(InputStream inputstream, BlockPos BlockPos, double d0) {
      CopyOnWriteArrayList copyonwritearraylist = new CopyOnWriteArrayList();
      double d1 = d0 * d0;

      String s;
      try (BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream))) {
         while ((s = bufferedreader.readLine()) != null) {
            String[] astring = s.split(" ");
            if (astring.length == 4) {
               try {
                  int i = Integer.parseInt(astring[0]);
                  int j = Integer.parseInt(astring[1]);
                  int k = Integer.parseInt(astring[2]);
                  double d2 = (double)(i - BlockPos.getX());
                  double d3 = (double)(k - BlockPos.getZ());
                  if (!(d2 * d2 + d3 * d3 > d1)) {
                     String s1 = new String(Base64.getDecoder().decode(astring[3]), StandardCharsets.UTF_8);
                     if (s1.startsWith("block.minecraft.")) {
                        s1 = s1.substring("block.minecraft.".length());
                     }

                     Identifier Identifier = Identifier.of("minecraft", s1);
                     Block Block = (Block)Registries.BLOCK.get(Identifier);
                     if (Block != Blocks.AIR) {
                        copyonwritearraylist.add(new Basefinder$l1lll11l1l(new BlockPos(i, j, k), Block));
                     }
                  }
               } catch (Exception exception) {
                  exception.printStackTrace();
               }
            }
         }
      } catch (Exception exception1) {
         exception1.printStackTrace();
      }

      return copyonwritearraylist;
   }
}
