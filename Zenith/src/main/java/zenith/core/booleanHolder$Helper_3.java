package zenith;

import net.minecraft.util.math.MathHelper;

public class booleanHolder$Helper_3 {
   public floatHolder$EventTarget I111I1Il1I11 = new floatHolder$EventTarget(0.0F, 0.0F, 0.0F);
   public floatHolder$EventTarget Il1llI11II1l = new floatHolder$EventTarget(0.0F, 0.0F, 0.0F);
   public boolean llI111IIII111lIIIll1lI1l;

   public float SocketFactoryHolder_3(float f) {
      return MathHelper.lerp(f, this.Il1llI11II1l.field_171, this.I111I1Il1I11.field_171);
   }

   public float SocketFactoryHolder_2(float f) {
      return MathHelper.lerp(f, this.Il1llI11II1l.field_172, this.I111I1Il1I11.field_172);
   }

   public float SocketFactoryHolder(float f) {
      return MathHelper.lerp(f, this.Il1llI11II1l.Ill1l1I1llllII11ll11III, this.I111I1Il1I11.Ill1l1I1llllII11ll11III);
   }

   public floatHolder$EventTarget ZenithInternal086(float f) {
      return new floatHolder$EventTarget(this.SocketFactoryHolder_3(f), this.SocketFactoryHolder_2(f), this.SocketFactoryHolder(f));
   }
}
