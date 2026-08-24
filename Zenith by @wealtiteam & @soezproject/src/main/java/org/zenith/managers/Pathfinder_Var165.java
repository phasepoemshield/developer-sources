package org.zenith.managers;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;

public record Pathfinder_Var165(int int173, int int174, int int175, int int176, boolean boolean116, boolean boolean117, Pathfinder_Var143 zClass073Var143) {

   public static final Pathfinder_Var165 zClass073Var1652 = new Pathfinder_Var165(
      50000, 192, 3, 0, false, true, Pathfinder_Var143.val197
   );

   public Pathfinder_Var165(int var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      this(var1, var2, var3, var4, var5, var6, Pathfinder_Var143.val197);
   }

   public Pathfinder_Var165(int var1, int var2, int var3, boolean var4, boolean var5) {
      this(var1, var2, var3, 0, var4, var5, Pathfinder_Var143.val197);
   }

   public Pathfinder_Var165(int int173, int int174, int int175, int int176, boolean boolean116, boolean boolean117, Pathfinder_Var143 zClass073Var143) {
      if (int173 <= 0) {
         throw new IllegalArgumentException("maxVisitedNodes must be positive");
      } else if (int174 <= 0) {
         throw new IllegalArgumentException("maxRange must be positive");
      } else if (int175 < 0) {
         throw new IllegalArgumentException("maxFallDistance cannot be negative");
      } else if (int176 < 0) {
         throw new IllegalArgumentException("goalYTolerance cannot be negative");
      } else if (zClass073Var143 == null) {
         throw new IllegalArgumentException("pathMode cannot be null");
      } else {
         this.int173 = int173;
         this.int174 = int174;
         this.int175 = int175;
         this.int176 = int176;
         this.boolean116 = boolean116;
         this.boolean117 = boolean117;
         this.zClass073Var143 = zClass073Var143;
      }
   }

   public int float139() {
      return this.int173;
   }

   public int float140() {
      return this.int174;
   }

   public int float141() {
      return this.int175;
   }

   public int double159() {
      return this.int176;
   }

   public boolean double160() {
      return this.boolean116;
   }

   public boolean double161() {
      return this.boolean117;
   }

   public Pathfinder_Var143 double162() {
      return this.zClass073Var143;
   }
}
