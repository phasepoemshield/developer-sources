package org.zenith.setting;

import org.zenith.event.Event26;
import org.zenith.event.Event29;

import org.zenith.config.ConfigJsonUtil;
import org.zenith.core.NpcCloneManager;
import org.zenith.event.Event26;
import org.zenith.ZenithClient;
import org.zenith.core.AnalyticsTracker;
import org.zenith.core.EmotePlayback;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.UiAnimation;
import org.zenith.event.Event29;


import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ModeSetting extends Setting {
   public final List<ModeSetting_Var159> list57;

   public ModeSetting(String var1) {
      this(var1, "");
   }

   public ModeSetting(String var1, String var2) {
      super(var1, var2);
      this.list57 = new ArrayList<>();
   }

   public ModeSetting(String var1, ModeSetting_Var159... var2) {
      this(var1, "", var2);
   }

   public ModeSetting(String var1, String var2, ModeSetting_Var159... var3) {
      super(var1, var2);
      this.list57 = new ArrayList<>(Arrays.asList(var3));
   }

   public ModeSetting_Var159 Event29(String var1) {
      return this.list57.stream().filter(var1x -> var1x.getKey().equalsIgnoreCase(var1)).findFirst().orElse(null);
   }

   public static ModeSetting UiAnimation(String var0, List<String> var1) {
      return on23(var0, "", var1);
   }

   public static ModeSetting on23(String var0, String var1, List<String> var2) {
      ModeSetting_Var159[] ai1i1lll1liii1il1llll1_ii1il11l111ii11iil = var2.stream()
         .map(var0x -> new ModeSetting_Var159(var0x, true))
         .toArray(ModeSetting_Var159[]::new);
      return new ModeSetting(var0, var1, ai1i1lll1liii1il1llll1_ii1il11l111ii11iil);
   }

   public ModeSetting_Var159 AnalyticsTracker(int var1) {
      return this.list57.get(var1);
   }

   public boolean Event26(String var1) {
      ModeSetting_Var159 i1i1lll1liii1il1llll1_ii1il11l111ii11iil = this.Event29(var1);
      return i1i1lll1liii1il1llll1_ii1il11l111ii11iil != null && i1i1lll1liii1il1llll1_ii1il11l111ii11iil.isEnabled();
   }

   public boolean ConfigJsonUtil(int var1) {
      if (var1 >= this.int212().size()) {
         return false;
      } else {
         ModeSetting_Var159 i1i1lll1liii1il1llll1_ii1il11l111ii11iil = this.AnalyticsTracker(var1);
         return i1i1lll1liii1il1llll1_ii1il11l111ii11iil != null && i1i1lll1liii1il1llll1_ii1il11l111ii11iil.isEnabled();
      }
   }

   public List<ModeSetting_Var159> class2() {
      return this.list57.stream().filter(ModeSetting_Var159::isEnabled).collect(Collectors.toList());
   }

   @Override
   public void safe(JsonObject var1) {
      StringBuilder stringbuilder = new StringBuilder();
      int i = 0;

      for (ModeSetting_Var159 i1i1lll1liii1il1llll1_ii1il11l111ii11iil : this.int212()) {
         if (this.Event29(i1i1lll1liii1il1llll1_ii1il11l111ii11iil.getKey()).isEnabled()) {
            stringbuilder.append(i1i1lll1liii1il1llll1_ii1il11l111ii11iil.getKey()).append("\n");
         }

         i++;
      }

      var1.addProperty(this.key, stringbuilder.toString());
   }

   @Override
   public void load(JsonObject var1) {
      this.int212().forEach(var0 -> var0.setEnabled(false));
      String[] astring = var1.get(String.valueOf(this.key)).getAsString().split("\n");

      for (String s : astring) {
         ModeSetting_Var159 i1i1lll1liii1il1llll1_ii1il11l111ii11iil = this.Event29(s);
         if (i1i1lll1liii1il1llll1_ii1il11l111ii11iil != null) {
            this.Event29(s).setEnabled(true);
         }
      }
   }

   public List<String> zClass100Var143Var143() {
      return this.list57
         .stream()
         .filter(ModeSetting_Var159::isEnabled)
         .map(ModeSetting_Var159::getKey)
         .toList();
   }

   public List<ModeSetting_Var159> int212() {
      return this.list57;
   }
}
