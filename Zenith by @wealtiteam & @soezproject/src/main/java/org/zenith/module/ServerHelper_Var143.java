package org.zenith.module;

import org.zenith.core.SimpleItemBuilder;
import org.zenith.ZenithClient;
import org.zenith.setting.Setting;




import org.zenith.util.ScreenUtils;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;

import org.zenith.setting.StringSetting2;



import java.util.function.Predicate;
import net.minecraft.item.Item;
import net.minecraft.screen.slot.Slot;

public record ServerHelper_Var143(Item item3, StringSetting2 stringSetting2, float float93, BooleanValue var4, Predicate<Slot> predicate) {

   public ServerHelper_Var143(Item var1, StringSetting2 var2, float var3, BooleanValue var4) {
      this(var1, var2, var3, var4, null);
   }

   public Slot int156() {
      return this.predicate != null
         ? ScreenUtils.on23(this.item3, this.predicate)
         : ScreenUtils.SimpleItemBuilder(this.item3);
   }

   public Predicate<Slot> double36() {
      return this.predicate != null ? this.predicate : var0 -> true;
   }

   public Item double21() {
      return this.item3;
   }

   public StringSetting2 double22() {
      return this.stringSetting2;
   }

   public float double37() {
      return this.float93;
   }

   public BooleanValue double23() {
      return this.var4;
   }

   public Predicate<Slot> double38() {
      return this.predicate;
   }
}
