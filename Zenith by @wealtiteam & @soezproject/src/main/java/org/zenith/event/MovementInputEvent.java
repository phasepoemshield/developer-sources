package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.NoSlow;
import org.zenith.module.NoSweetSlow;

import org.zenith.event.Event18;
import org.zenith.module.NoSlow;
import org.zenith.module.NoSweetSlow;
import org.zenith.core.SimpleItemBuilder;
import org.zenith.ZenithClient;
import org.zenith.core.ItemSpec;
import org.zenith.core.NbtItemSpec;
import org.zenith.core.NbtEditor;
import org.zenith.core.EnchantItemSpec;
import org.zenith.core.ItemServiceBase;
import org.zenith.core.TextScanner;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;



import net.minecraft.util.PlayerInput;

public class MovementInputEvent extends Event18 {
   public PlayerInput playerInput2;

   public void ItemSpec(boolean var1) {
      this.playerInput2 = new PlayerInput(
         var1,
         this.playerInput2.backward(),
         this.playerInput2.left(),
         this.playerInput2.right(),
         this.playerInput2.jump(),
         this.playerInput2.sneak(),
         this.playerInput2.sprint()
      );
   }

   public void TextScanner(boolean var1) {
      this.playerInput2 = new PlayerInput(
         this.playerInput2.forward(),
         this.playerInput2.backward(),
         this.playerInput2.left(),
         this.playerInput2.right(),
         this.playerInput2.jump(),
         this.playerInput2.sneak(),
         var1
      );
   }

   public void NbtItemSpec(boolean var1) {
      this.playerInput2 = new PlayerInput(
         this.playerInput2.forward(),
         this.playerInput2.backward(),
         this.playerInput2.left(),
         this.playerInput2.right(),
         this.playerInput2.jump(),
         var1,
         this.playerInput2.sprint()
      );
   }

   public void EnchantItemSpec(boolean var1) {
      this.playerInput2 = new PlayerInput(
         this.playerInput2.forward(),
         this.playerInput2.backward(),
         this.playerInput2.left(),
         this.playerInput2.right(),
         var1,
         this.playerInput2.sneak(),
         this.playerInput2.sprint()
      );
   }

   public void on23(float var1, float var2) {
      boolean[] aboolean = NbtEditor(var1);
      boolean[] aboolean1 = NbtEditor(var2);
      this.playerInput2 = new PlayerInput(
         aboolean[0],
         aboolean[1],
         aboolean1[0],
         aboolean1[1],
         this.playerInput2.jump(),
         this.playerInput2.sneak(),
         this.playerInput2.sprint()
      );
   }

   public static boolean[] NbtEditor(float var0) {
      if (var0 == 1.0F) {
         return new boolean[]{true, false};
      } else {
         return var0 == -1.0F ? new boolean[]{false, true} : new boolean[]{false, false};
      }
   }

   public void NoSlow() {
      this.playerInput2 = new PlayerInput(false, false, false, false, false, false, false);
   }

   public void SimpleItemBuilder(boolean var1) {
      this.playerInput2 = new PlayerInput(
         this.playerInput2.forward(),
         this.playerInput2.backward(),
         var1,
         this.playerInput2.right(),
         this.playerInput2.jump(),
         this.playerInput2.sneak(),
         this.playerInput2.sprint()
      );
   }

   public void ItemServiceBase(boolean var1) {
      this.playerInput2 = new PlayerInput(
         this.playerInput2.forward(),
         this.playerInput2.backward(),
         this.playerInput2.left(),
         var1,
         this.playerInput2.jump(),
         this.playerInput2.sneak(),
         this.playerInput2.sprint()
      );
   }

   public void NbtEditor(boolean var1) {
      this.playerInput2 = new PlayerInput(
         this.playerInput2.forward(),
         var1,
         this.playerInput2.left(),
         this.playerInput2.right(),
         this.playerInput2.jump(),
         this.playerInput2.sneak(),
         this.playerInput2.sprint()
      );
   }

   public PlayerInput NoSweetSlow() {
      return this.playerInput2;
   }

   public void on23(PlayerInput var1) {
      this.playerInput2 = var1;
   }

   public MovementInputEvent(PlayerInput var1) {
      this.playerInput2 = var1;
   }
}
