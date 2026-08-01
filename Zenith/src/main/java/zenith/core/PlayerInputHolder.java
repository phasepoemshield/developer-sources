package zenith;

import net.minecraft.util.PlayerInput;

public class PlayerInputHolder extends EventImpl_33 {
   private PlayerInput l1l1Il1l1lIIl1lI;

   public void ZenithInternal061(boolean flag) {
      this.l1l1Il1l1lIIl1lI = new PlayerInput(
         flag,
         this.l1l1Il1l1lIIl1lI.backward(),
         this.l1l1Il1l1lIIl1lI.left(),
         this.l1l1Il1l1lIIl1lI.right(),
         this.l1l1Il1l1lIIl1lI.jump(),
         this.l1l1Il1l1lIIl1lI.sneak(),
         this.l1l1Il1l1lIIl1lI.sprint()
      );
   }

   public void FinishThread(boolean flag) {
      this.l1l1Il1l1lIIl1lI = new PlayerInput(
         this.l1l1Il1l1lIIl1lI.forward(),
         this.l1l1Il1l1lIIl1lI.backward(),
         this.l1l1Il1l1lIIl1lI.left(),
         this.l1l1Il1l1lIIl1lI.right(),
         this.l1l1Il1l1lIIl1lI.jump(),
         this.l1l1Il1l1lIIl1lI.sneak(),
         flag
      );
   }

   public void ZenithInternal064(boolean flag) {
      this.l1l1Il1l1lIIl1lI = new PlayerInput(
         this.l1l1Il1l1lIIl1lI.forward(),
         this.l1l1Il1l1lIIl1lI.backward(),
         this.l1l1Il1l1lIIl1lI.left(),
         this.l1l1Il1l1lIIl1lI.right(),
         this.l1l1Il1l1lIIl1lI.jump(),
         flag,
         this.l1l1Il1l1lIIl1lI.sprint()
      );
   }

   public void ZenithInternal021(boolean flag) {
      this.l1l1Il1l1lIIl1lI = new PlayerInput(
         this.l1l1Il1l1lIIl1lI.forward(),
         this.l1l1Il1l1lIIl1lI.backward(),
         this.l1l1Il1l1lIIl1lI.left(),
         this.l1l1Il1l1lIIl1lI.right(),
         flag,
         this.l1l1Il1l1lIIl1lI.sneak(),
         this.l1l1Il1l1lIIl1lI.sprint()
      );
   }

   public void StringHolder_8(float f, float f1) {
      boolean[] aboolean = ZenithInternal128(f);
      boolean[] aboolean1 = ZenithInternal128(f1);
      this.l1l1Il1l1lIIl1lI = new PlayerInput(
         aboolean[0],
         aboolean[1],
         aboolean1[0],
         aboolean1[1],
         this.l1l1Il1l1lIIl1lI.jump(),
         this.l1l1Il1l1lIIl1lI.sneak(),
         this.l1l1Il1l1lIIl1lI.sprint()
      );
   }

   private static boolean[] ZenithInternal128(float f) {
      if (f == 1.0F) {
         return new boolean[]{true, false};
      } else {
         return f == -1.0F ? new boolean[]{false, true} : new boolean[]{false, false};
      }
   }

   public void Creeperfarm() {
      this.l1l1Il1l1lIIl1lI = new PlayerInput(false, false, false, false, false, false, false);
   }

   public void ZenithException_2(boolean flag) {
      this.l1l1Il1l1lIIl1lI = new PlayerInput(
         this.l1l1Il1l1lIIl1lI.forward(),
         this.l1l1Il1l1lIIl1lI.backward(),
         flag,
         this.l1l1Il1l1lIIl1lI.right(),
         this.l1l1Il1l1lIIl1lI.jump(),
         this.l1l1Il1l1lIIl1lI.sneak(),
         this.l1l1Il1l1lIIl1lI.sprint()
      );
   }

   public void ClearHeadersHandler(boolean flag) {
      this.l1l1Il1l1lIIl1lI = new PlayerInput(
         this.l1l1Il1l1lIIl1lI.forward(),
         this.l1l1Il1l1lIIl1lI.backward(),
         this.l1l1Il1l1lIIl1lI.left(),
         flag,
         this.l1l1Il1l1lIIl1lI.jump(),
         this.l1l1Il1l1lIIl1lI.sneak(),
         this.l1l1Il1l1lIIl1lI.sprint()
      );
   }

   public void StringHolder_5(boolean flag) {
      this.l1l1Il1l1lIIl1lI = new PlayerInput(
         this.l1l1Il1l1lIIl1lI.forward(),
         flag,
         this.l1l1Il1l1lIIl1lI.left(),
         this.l1l1Il1l1lIIl1lI.right(),
         this.l1l1Il1l1lIIl1lI.jump(),
         this.l1l1Il1l1lIIl1lI.sneak(),
         this.l1l1Il1l1lIIl1lI.sprint()
      );
   }

   public PlayerInput Netherwartfarm() {
      return this.l1l1Il1l1lIIl1lI;
   }

   public void StringHolder_8(PlayerInput PlayerInput) {
      this.l1l1Il1l1lIIl1lI = PlayerInput;
   }

   public PlayerInputHolder(PlayerInput PlayerInput) {
      this.l1l1Il1l1lIIl1lI = PlayerInput;
   }
}
