package org.zenith.module;

import org.zenith.core.NpcCloneManager;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;

import org.zenith.event.EventPushOutOfBlocks;


enum ShaderHand_Var159 {
   call451("module.shaderHand.shader.aqua", "sirius_aqua", 0.6F, false),
   call479("module.shaderHand.shader.flow", "sirius_flow", 0.06F, false),
   call480("module.shaderHand.shader.smoke", "sirius_smoke", 3.0F, false),
   call481("module.shaderHand.shader.holyFuck", "sirius_holyfuck", 0.6F, true),
   call482("module.shaderHand.shader.gang", "sirius_gang", 0.6F, true),
   call483("module.shaderHand.shader.gamer", "sirius_gamer", 1.8F, false),
   call484("module.shaderHand.shader.galaxy", "sirius_galaxy", 0.06F, false),
   call485("module.shaderHand.shader.techno", "sirius_techno", 0.6F, false),
   call486("module.shaderHand.shader.golden", "sirius_golden", 0.6F, false),
   call487("module.shaderHand.shader.guiShader", "sirius_guishader", 1.2F, false),
   call488("module.shaderHand.shader.hidef", "sirius_hidef", 3.0F, false),
   call489("module.shaderHand.shader.homie", "sirius_homie", 0.06F, false),
   call490("module.shaderHand.shader.sheldon", "sirius_sheldon", 0.06F, false),
   call491("module.shaderHand.shader.smoky", "sirius_smoky", 0.06F, false),
   call492("module.shaderHand.shader.yippieOwns", "sirius_yippieowns", 6.0F, false),
   call493("module.shaderHand.shader.purple", "sirius_purple", 3.0F, false);

   public final String string74;
   public final String string75;
   public final float float143;
   public final boolean boolean121;

   private ShaderHand_Var159(String var3, String var4, float var5, boolean var6) {
      this.string74 = var3;
      this.string75 = var4;
      this.float143 = var5;
      this.boolean121 = var6;
   }

   public static ShaderHand_Var159 EventPushOutOfBlocks(int var0) {
      ShaderHand_Var159[] allillll1i1i11iiii1ii11il_ii1il11l111ii11iil = values();
      return var0 >= 0 && var0 < allillll1i1i11iiii1ii11il_ii1il11l111ii11iil.length
         ? allillll1i1i11iiii1ii11il_ii1il11l111ii11iil[var0]
         : call451;
   }

   public static String[] keys() {
      ShaderHand_Var159[] allillll1i1i11iiii1ii11il_ii1il11l111ii11iil = values();
      String[] astring = new String[allillll1i1i11iiii1ii11il_ii1il11l111ii11iil.length];

      for (int i = 0; i < allillll1i1i11iiii1ii11il_ii1il11l111ii11iil.length; i++) {
         astring[i] = allillll1i1i11iiii1ii11il_ii1il11l111ii11iil[i].string74;
      }

      return astring;
   }
}
