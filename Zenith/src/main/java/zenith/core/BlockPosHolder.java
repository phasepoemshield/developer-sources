package zenith;

import net.minecraft.util.math.BlockPos;

public class BlockPosHolder {
   private BlockPos Ill111II1lI11IlII1llI111I1;
   private BlockPos lI11ll11ll1l11II1l111;
   private final longHolder I1IIl11I11l = new longHolder();

   public BlockPosHolder() {
      EventBus.StringHolder_8(this);
   }

   public void StringHolder_8(BlockPos BlockPos) {
      this.Ill111II1lI11IlII1llI111I1 = BlockPos;
      this.I1IIl11I11l.reset();
   }

   public void EventBus(BlockPos BlockPos) {
      this.lI11ll11ll1l11II1l111 = BlockPos;
      this.I1IIl11I11l.reset();
   }

   @EventTarget
   public void EventBus(EventImpl_34 ll1li1l111llllli1) {
      if (this.Ill111II1lI11IlII1llI111I1 != null && this.lI11ll11ll1l11II1l111 != null && !this.I1IIl11I11l.HostnameVerifierImpl(5000L)) {
         ListHolder_2.StringHolder_8(
            new net.minecraft.util.math.Box(new net.minecraft.util.math.Vec3d(this.Ill111II1lI11IlII1llI111I1), new net.minecraft.util.math.Vec3d(this.lI11ll11ll1l11II1l111))
               .expand(1.5, 0.0, 1.5),
            ZenithClient.getInstance().floatHolder_3().getClientColor(90).lllIlll1Ill111l111Il11II11lII(),
            1.0F
         );
      } else {
         if (this.Ill111II1lI11IlII1llI111I1 != null) {
            ListHolder_2.StringHolder_8(
               new net.minecraft.util.math.Box(this.Ill111II1lI11IlII1llI111I1),
               ZenithClient.getInstance().floatHolder_3().getClientColor(90).lllIlll1Ill111l111Il11II11lII(),
               1.0F
            );
         }

         if (this.lI11ll11ll1l11II1l111 != null) {
            ListHolder_2.StringHolder_8(
               new net.minecraft.util.math.Box(this.lI11ll11ll1l11II1l111),
               ZenithClient.getInstance().floatHolder_3().getClientColor(90).lllIlll1Ill111l111Il11II11lII(),
               1.0F
            );
         }
      }
   }

   public void clear() {
      this.Ill111II1lI11IlII1llI111I1 = null;
      this.lI11ll11ll1l11II1l111 = null;
   }

   public BlockPos HeightHandler() {
      return this.Ill111II1lI11IlII1llI111I1;
   }

   public BlockPos floatHolder_4() {
      return this.lI11ll11ll1l11II1l111;
   }

   public longHolder ByteBufferHolder() {
      return this.I1IIl11I11l;
   }
}
