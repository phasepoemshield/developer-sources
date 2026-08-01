// Module: XrayBypass
// Category: misc
// Original class: Xraybypass
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.misc;

import java.awt.Color;
import java.util.LinkedHashSet;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.text.Text;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.network.SequencedPacketCreator;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.GlUniform7;

@ModuleInfo(
   name = "XrayBypass",
   category = Category.MISC,
   description = ""
)
public final class Xraybypass extends Module {
   public static final Xraybypass ll1IlllI1l = new Xraybypass();
   private final NumberSetting I1lI1ll1lII1II1l1Il1IlIll1 = new NumberSetting(
      "module.xrayBypass.range", 30.0F, 1.0F, 128.0F, 2.0F, "module.xrayBypass.range.desc", "b"
   );
   private final NumberSetting ll1I1111Ill11l = new NumberSetting(
      "module.xrayBypass.height", 20.0F, 1.0F, 255.0F, 2.0F, "module.xrayBypass.height.desc", "b"
   );
   private final NumberSetting IlI1l11I1I11IlI1I = new NumberSetting(
      "module.xrayBypass.delay", 3.0F, 1.0F, 5.0F, 1.0F, "module.xrayBypass.delay.desc", "t"
   );
   private LinkedHashSet<BlockPos> lI1lI11II1llI1Il11IlI1;
   private longHolder lllII1l1IlI1l = new longHolder();

   @Override
   public boolean llI1lll1lIllII11I1111Illl() {
      return true;
   }

   @Override
   public void onEnable() {
      this.lI1lI11II1llI1Il11IlI1 = new LinkedHashSet<>();
      this.lI1lI11II1llI1Il11IlI1
         .addAll(
            ZenithInternal066.StringHolder_8(
                  l11I1I1ll1Illll1I1l1111l1II.player.getBlockPos(),
                  this.I1lI1ll1lII1II1l1Il1IlIll1.lll1lI1llll1IIllIIIII1lll(),
                  this.ll1I1111Ill11l.lll1lI1llll1IIllIIIII1lll(),
                  false
               )
               .stream()
               .filter(l11I1I1ll1Illll1I1l1111l1II.world::isChunkLoaded)
               .toList()
         );
      this.lllII1l1IlI1l = new longHolder();
      this.lllII1l1IlI1l.reset();
      super.l11l1lII();
   }

   @EventTarget
   public void EventImpl_21(EventImpl_34 ll1li1l111llllli1) {
      BlockHitResult BlockHitResult = ZenithInternal088.StringHolder_8(
         l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F), II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1(), 5.0, BlockHitResult -> true
      );
      if (BlockHitResult.getType() != net.minecraft.util.hit.HitResult.class_240.MISS) {
         ListHolder_2.StringHolder_8(new net.minecraft.util.math.Box(BlockHitResult.getBlockPos()), Color.RED.getRGB(), 1.0F);
      }

      if (!this.lI1lI11II1llI1Il11IlI1.isEmpty()) {
         ListHolder_2.StringHolder_8(new net.minecraft.util.math.Box(this.lI1lI11II1llI1Il11IlI1.getFirst()), Color.GREEN.getRGB(), 1.0F);
         ListHolder_2.StringHolder_8(
            l11I1I1ll1Illll1I1l1111l1II.player
               .getBoundingBox()
               .expand(
                  (double)this.I1lI1ll1lII1II1l1Il1IlIll1.lll1lI1llll1IIllIIIII1lll(), 0.0, (double)this.I1lI1ll1lII1II1l1Il1IlIll1.lll1lI1llll1IIllIIIII1lll()
               )
               .withMaxY(l11I1I1ll1Illll1I1l1111l1II.player.getPos().y + (double)this.ll1I1111Ill11l.lll1lI1llll1IIllIIIII1lll()),
            ZenithClient.getInstance().floatHolder_3().getClientColor(90).lllIlll1Ill111l111Il11II11lII(),
            1.0F
         );
      }
   }

   @EventTarget
   public void ZenithInternal128(PacketHolder ii1l11il1i1i) {
      if (ii1l11il1i1i.Swinganimation() instanceof BlockUpdateS2CPacket) {
         this.lllII1l1IlI1l.reset();
      }
   }

   @EventTarget
   public void byteHolder(EventImpl_30 ll1iil11ii) {
      floatHolder_6 il1ll111liili1ll11liil = new floatHolder_6(II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1().AutoBrewing(), -90.0F);
      II1ll1II1l11lI.StringHolder_8(
         new SupplierHolder(il1ll111liili1ll11liil, () -> il1ll111liili1ll11liil, II1ll1II1l11lI.I1IlIlIlllI1III1l1l1I1l1IlI111().IlIll11I1lll1II1llI1I1II()),
         50,
         this
      );
   }

   @EventTarget(
      ZenithInternal095 = 4
   )
   public void ZenithInternal042(PlayerInputHolder ili11i1il11) {
      ili11i1il11.Creeperfarm();
   }

   @EventTarget
   public void StringHolder_8(EventImpl_22 l11llilil1) {
      BlockHitResult BlockHitResult = ZenithInternal088.StringHolder_8(
         l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F), II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1(), 5.0, BlockHitResult -> true
      );
      if (BlockHitResult.getType() != net.minecraft.util.hit.HitResult.class_240.MISS) {
         if (l11I1I1ll1Illll1I1l1111l1II.player.age % 80 == 0) {
            ZenithClient.getInstance()
               .ZenithInternal015()
               .StringHolder_8("4", Text.of("Сломайте блок над  головой"), 4000L);
         }

         this.lllII1l1IlI1l.reset();
      } else {
         if (this.lllII1l1IlI1l.HostnameVerifierImpl(20000L)) {
            this.lllII1l1IlI1l.reset();
         }

         if (!this.lllII1l1IlI1l.HostnameVerifierImpl(1000L)) {
            for (int i = 0; (float)i < this.IlI1l11I1I11IlI1I.lll1lI1llll1IIllIIIII1lll(); i++) {
               if (!this.lI1lI11II1llI1Il11IlI1.isEmpty()) {
                  BlockPos BlockPos = this.lI1lI11II1llI1Il11IlI1.getFirst();
                  ZenithInternal066.StringHolder_8((SequencedPacketCreator)(j -> new PlayerActionC2SPacket(GlUniform7.START_DESTROY_BLOCK, BlockPos, Direction.UP, j)));
                  ZenithInternal066.StringHolder_8((SequencedPacketCreator)(j -> new PlayerActionC2SPacket(GlUniform7.STOP_DESTROY_BLOCK, BlockPos, Direction.UP, j)));
                  this.lI1lI11II1llI1Il11IlI1.removeFirst();
               }
            }
         }
      }
   }
}
