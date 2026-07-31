package l;

import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.entity.Entity;

public class Helper86<T extends Entity, S extends EntityRenderState> extends Helper88 {
   S state;

   public S method876() {
      return this.state;
   }

   public Helper86(S var1) {
      this.state = (S)var1;
   }
}
