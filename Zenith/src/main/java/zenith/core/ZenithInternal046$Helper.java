package zenith;

import net.minecraft.entity.Entity;

class TotemParticles$II1Il11l111II11IIl {
   final Entity l11IlIlIII11I1l1ll1;
   final int I1lI1I1Il;
   final int lI1llllIl1I11IlI1I;
   int lIlI1IIIIlIIIlIIlIl;

   TotemParticles$II1Il11l111II11IIl(Entity Entity, int i, int j) {
      this.l11IlIlIII11I1l1ll1 = Entity;
      this.I1lI1I1Il = i;
      this.lI1llllIl1I11IlI1I = j;
      this.lIlI1IIIIlIIIlIIlIl = 0;
   }

   net.minecraft.util.math.Vec3d Cameratweaks() {
      if (this.l11IlIlIII11I1l1ll1 != null && !this.l11IlIlIII11I1l1ll1.isRemoved()) {
         net.minecraft.util.math.Box Box = this.l11IlIlIII11I1l1ll1.getBoundingBox();
         return new net.minecraft.util.math.Vec3d(
            (Box.minX + Box.maxX) / 2.0,
            (Box.minY + Box.maxY) / 2.0,
            (Box.minZ + Box.maxZ) / 2.0
         );
      } else {
         return null;
      }
   }
}
