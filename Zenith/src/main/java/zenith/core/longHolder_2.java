package zenith;

import com.google.gson.JsonObject;
import net.minecraft.util.math.BlockPos;

public class longHolder_2 {
   public static final longHolder_2 lIl1IIl111llIIllIl = new longHolder_2(Long.MIN_VALUE);
   private final long l11lI1111I1IIIll11llIII1;

   public longHolder_2(long i) {
      this.l11lI1111I1IIIll11llIII1 = i;
   }

   public static longHolder_2 CallableImpl(BlockPos BlockPos) {
      return new longHolder_2(BlockPos.asLong());
   }

   public boolean Il11I1IIIlI1111IIIIl() {
      return this.l11lI1111I1IIIll11llIII1 != Long.MIN_VALUE;
   }

   public BlockPos I11Il1I1IIl1IIll1l1I1() {
      return BlockPos.fromLong(this.l11lI1111I1IIIll11llIII1);
   }

   public JsonObject toJson() {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("packedPos", this.l11lI1111I1IIIll11llIII1);
      return jsonobject;
   }

   public static longHolder_2 ZenithInternal128(JsonObject jsonobject) {
      return jsonobject.has("packedPos") ? new longHolder_2(jsonobject.get("packedPos").getAsLong()) : lIl1IIl111llIIllIl;
   }
}
