package zenith;

import java.util.List;

public final class VoxelShapeHolder$Event  {
   private final net.minecraft.util.shape.VoxelShape llIll11ll1Il11lII1I11;
   private final List<Vec3dHolder$Helper> lII11ll111lll1llII1l1I1IlIl1l1;
   private final List<net.minecraft.util.math.Box> ll1IllI11IlIlIl111I1lIl;

   public VoxelShapeHolder$Event(
      net.minecraft.util.shape.VoxelShape VoxelShape, List<Vec3dHolder$Helper> list, List<net.minecraft.util.math.Box> list1
   ) {
      this.llIll11ll1Il11lII1I11 = VoxelShape;
      this.lII11ll111lll1llII1l1I1IlIl1l1 = list;
      this.ll1IllI11IlIlIl111I1lIl = list1;
   }

   public net.minecraft.util.shape.VoxelShape Il11ll1lllll1l() {
      return this.llIll11ll1Il11lII1I11;
   }

   public List<Vec3dHolder$Helper> IllIlIl1I1() {
      return this.lII11ll111lll1llII1l1I1IlIl1l1;
   }

   public List<net.minecraft.util.math.Box> IlII11l1l111ll1l1l1l1I11IIlI() {
      return this.ll1IllI11IlIlIl111I1lIl;
   }
}
