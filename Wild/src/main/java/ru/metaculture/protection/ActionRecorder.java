package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.Entity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.MathHelper;
import org.wild.mixin.acceser.ClientPlayerInteractionManagerAccessor;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleAccess(
   O0000000000 = {"lichoday", "bitrixtime", "oblamovvv"}
)
@ModuleRegister(
   O00000000 = "ActionRecorder",
   O000000000 = "Записывает и воспроизводит действия игрока",
   O0000000000 = Category.Player,
   O00000000000 = {O0000000OO0OOO.NEW}
)
public class ActionRecorder extends Module {
   private static final String O000000000O = "KEY";
   private static final String O000000000O0 = "MOUSE";
   private static final String O000000000O00 = "SCROLL";
   private final TextSetting O000000000O000 = new TextSetting("File", "default").O00000000(48);
   private final KeybindSetting O000000000O00O = new KeybindSetting("Record Key", -1);
   private final KeybindSetting O000000000O0O = new KeybindSetting("Play Key", -1);
   private final KeybindSetting O000000000O0O0 = new KeybindSetting("Stop Key", -1);
   private final BooleanSetting O000000000O0OO = new BooleanSetting("Infinite Loop", false);
   private final NumberSetting O000000000OO = new NumberSetting("Loops", 1.0F, 1.0F, 20.0F, 1.0F, false).O00000000(this.O000000000O0OO::O0000000000);
   private final NumberSetting O000000000OO0 = new NumberSetting("Play Duration Sec", 0.0F, 0.0F, 600.0F, 1.0F, false);
   private final NumberSetting O000000000OO00 = new NumberSetting("Record Limit Sec", 0.0F, 0.0F, 600.0F, 1.0F, false);
   private final BooleanSetting O000000000OO0O = new BooleanSetting("Auto Save", true);
   private final BooleanSetting O000000000OOO = new BooleanSetting("Rotation Controller", true);
   private final NumberSetting O000000000OOO0 = new NumberSetting("Min Rotation Speed", 1.0F, 0.2F, 180.0F, 0.1F, false)
      .O00000000(() -> !this.O000000000OOO.O0000000000());
   private final Gson O000000000OOOO = new GsonBuilder().setPrettyPrinting().create();
   private final O000000OO O00000000O = new O000000OO();
   private ActionRecorder.W124 O00000000O0;
   private ActionRecorder.W124 O00000000O00;
   private boolean O00000000O000;
   private boolean O00000000O0000;
   private int O00000000O000O;
   private int O00000000O00O;
   private int O00000000O00O0;
   private int O00000000O00OO = -1;
   private float O00000000O0O;
   private float O00000000O0O0;
   private float O00000000O0O00;
   private float O00000000O0O0O;
   private boolean O00000000O0OO;
   private boolean O00000000O0OO0;
   private boolean O00000000O0OOO;
   private double O00000000OO;
   private double O00000000OO0;
   private boolean O00000000OO00;
   private boolean O00000000OO000;
   private boolean O00000000OO00O;

   public ActionRecorder() {
      this.O00000000(
         new Setting[]{
            this.O000000000O000,
            this.O000000000O00O,
            this.O000000000O0O,
            this.O000000000O0O0,
            this.O000000000O0OO,
            this.O000000000OO,
            this.O000000000OO0,
            this.O000000000OO00,
            this.O000000000OO0O,
            this.O000000000OOO,
            this.O000000000OOO0
         }
      );
   }

   @Override
   public void O000000000() {
      if (this.O00000000O000) {
         this.O0000000000(this.O000000000OO0O.O0000000000());
      }

      if (this.O00000000O0000) {
         this.O00000000000(false);
      }

      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O0O0 o0000000O0O0) {
      if (o0000000O0O0.O0000000000000() == 1 && this.O000000000O00O.O0000000000() != -1 && o0000000O0O0.O00000000000() == this.O000000000O00O.O0000000000()) {
         this.O0000000000O0();
         o0000000O0O0.O000000000();
      } else if (o0000000O0O0.O0000000000000() == 1
         && this.O000000000O0O.O0000000000() != -1
         && o0000000O0O0.O00000000000() == this.O000000000O0O.O0000000000()) {
         this.O0000000000O00();
         o0000000O0O0.O000000000();
      } else if (o0000000O0O0.O0000000000000() == 1
         && this.O000000000O0O0.O0000000000() != -1
         && o0000000O0O0.O00000000000() == this.O000000000O0O0.O0000000000()) {
         this.O0000000000OO0();
         o0000000O0O0.O000000000();
      } else {
         if (this.O00000000O000 && o0000000O0O0.O00000000000() >= 0 && !this.O00000000000(o0000000O0O0.O00000000000())) {
            this.O00000000(
               ActionRecorder.W122.O00000000(
                  this.O00000000O000O,
                  this.O00000000O0.O0000000000000.size(),
                  o0000000O0O0.O00000000000(),
                  o0000000O0O0.O000000000000(),
                  o0000000O0O0.O0000000000000(),
                  o0000000O0O0.O000000000000O()
               )
            );
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O00 o0000000O0O00) {
      if (this.O00000000O000) {
         if (!this.O00000000000(-100 - o0000000O0O00.O00000000000())) {
            this.O00000000(
               ActionRecorder.W122.O00000000(
                  this.O00000000O000O,
                  this.O00000000O0.O0000000000000.size(),
                  o0000000O0O00.O00000000000(),
                  o0000000O0O00.O000000000000(),
                  o0000000O0O00.O0000000000000()
               )
            );
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O000 o0000000O0O000) {
      if (this.O00000000O000) {
         if ((!(o0000000O0O000.O000000000000() > 0.0) || !this.O00000000000(-200)) && (!(o0000000O0O000.O000000000000() < 0.0) || !this.O00000000000(-201))) {
            this.O00000000(
               ActionRecorder.W122.O00000000(
                  this.O00000000O000O, this.O00000000O0.O0000000000000.size(), o0000000O0O000.O00000000000(), o0000000O0O000.O000000000000()
               )
            );
         }
      }
   }

   @EventHandler(
      O00000000 = 4
   )
   public void O00000000(O0000000O0OO0 o0000000O0OO0) {
      if (this.O00000000O0000) {
         ActionRecorder.W123 var2 = this.O000000000(this.O00000000O00O);
         if (var2 != null) {
            o0000000O0OO0.O00000000(var2.O00000000000O);
            o0000000O0OO0.O000000000(var2.O00000000000O0);
            o0000000O0OO0.O00000000(var2.O00000000000OO);
            o0000000O0OO0.O000000000(var2.O0000000000O);
            o0000000O0OO0.O0000000000(var2.O0000000000O0);
         }
      } else {
         if (this.O00000000O000) {
            this.O00000000O0O00 = o0000000O0OO0.O0000000000();
            this.O00000000O0O0O = o0000000O0OO0.O00000000000();
            this.O00000000O0OO = o0000000O0OO0.O000000000000();
            this.O00000000O0OO0 = o0000000O0OO0.O0000000000000();
            this.O00000000O0OOO = o0000000O0OO0.O000000000000O();
         }
      }
   }

   @EventHandler(
      O00000000 = 4
   )
   public void O00000000(O0000000O0OO0O o0000000O0OO0O) {
      if (this.O00000000O0000) {
         o0000000O0OO0O.O000000000();
      } else {
         if (this.O00000000O000) {
            this.O00000000OO = this.O00000000OO + o0000000O0OO0O.O0000000000();
            this.O00000000OO0 = this.O00000000OO0 + o0000000O0OO0O.O00000000000();
         }
      }
   }

   @EventHandler(
      O00000000 = 4
   )
   public void O00000000(O0000000O0OOO o0000000O0OOO) {
      if (this.O00000000O0000) {
         ActionRecorder.W123 var2 = this.O000000000(this.O00000000O00O);
         if (var2 != null) {
            this.O00000000(var2);
            this.O00000000(var2, o0000000O0OOO);
            this.O00000000(this.O00000000O00O);
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O0O0 o0000000O0O0O0) {
      if (this.O00000000O000) {
         this.O0000000000OOO();
         this.O00000000O000O++;
         if (this.O000000000OO00.O0000000000() > 0.0F && this.O00000000O000O >= Math.round(this.O000000000OO00.O0000000000() * 20.0F)) {
            this.O0000000000(this.O000000000OO0O.O0000000000());
         }
      }

      if (this.O00000000O0000) {
         if (this.O00000000O00OO != this.O00000000O00O) {
            ActionRecorder.W123 var2 = this.O000000000(this.O00000000O00O);
            if (var2 != null) {
               this.O00000000(var2);
            }

            this.O00000000(this.O00000000O00O);
         }

         this.O000000000O00();
      }
   }

   @EventHandler
   public void O00000000(O0000000O00OO0 o0000000O00OO0) {
      this.O0000000000OO0();
   }

   @EventHandler
   public void O00000000(O0000000O000O o0000000O000O) {
      this.O0000000000OO0();
   }

   private void O0000000000O0() {
      if (this.O00000000O000) {
         this.O0000000000(this.O000000000OO0O.O0000000000());
      } else {
         this.O0000000000O0O();
      }
   }

   private void O0000000000O00() {
      if (this.O00000000O0000) {
         this.O00000000000(true);
      } else {
         if (this.O00000000O000) {
            this.O0000000000(this.O000000000OO0O.O0000000000());
         }

         this.O0000000000OO();
      }
   }

   private void O0000000000O0O() {
      if (!this.O000000000OO00()) {
         ChatUtil.O00000000("[ActionRecorder] Player is not ready.");
      } else {
         if (this.O00000000O0000) {
            this.O00000000000(false);
         }

         this.O00000000O0 = new ActionRecorder.W124();
         this.O00000000O0.O000000000 = System.currentTimeMillis();
         this.O00000000O0.O0000000000 = this.O000000000OO();
         this.O00000000O000 = true;
         this.O00000000O000O = 0;
         this.O00000000O0O = O0000000000.player.getYaw();
         this.O00000000O0O0 = O0000000000.player.getPitch();
         this.O00000000O0O00 = 0.0F;
         this.O00000000O0O0O = 0.0F;
         this.O00000000O0OO = false;
         this.O00000000O0OO0 = false;
         this.O00000000O0OOO = false;
         this.O00000000OO = 0.0;
         this.O00000000OO0 = 0.0;
         ChatUtil.O00000000("[ActionRecorder] Recording: " + this.O00000000O0.O0000000000);
      }
   }

   private void O0000000000(boolean bl) {
      if (this.O00000000O000) {
         this.O00000000O000 = false;
         if (bl && this.O00000000O0 != null) {
            this.O00000000(this.O00000000O0);
         }

         int var2 = this.O00000000O0 != null && this.O00000000O0.O000000000000 != null ? this.O00000000O0.O000000000000.size() : 0;
         ChatUtil.O00000000("[ActionRecorder] Recording stopped. Ticks: " + var2);
      }
   }

   private void O0000000000OO() {
      if (!this.O000000000OO00()) {
         ChatUtil.O00000000("[ActionRecorder] Player is not ready.");
      } else {
         ActionRecorder.W124 var1 = this.O000000000O00O();
         if (var1 != null && var1.O000000000000 != null && !var1.O000000000000.isEmpty()) {
            this.O000000000(var1);
            this.O00000000O00 = var1;
            this.O00000000O0000 = true;
            this.O00000000O00O = 0;
            this.O00000000O00O0 = 0;
            this.O00000000O00OO = -1;
            this.O00000000OO00 = false;
            this.O00000000OO000 = false;
            this.O00000000OO00O = false;
            ChatUtil.O00000000("[ActionRecorder] Playback: " + this.O00000000O00.O0000000000);
         } else {
            ChatUtil.O00000000("[ActionRecorder] Recording is empty or missing.");
         }
      }
   }

   private void O00000000000(boolean bl) {
      if (this.O00000000O0000) {
         this.O00000000O0000 = false;
         this.O00000000O00 = null;
         this.O00000000O00O = 0;
         this.O00000000O00O0 = 0;
         this.O00000000O00OO = -1;
         this.O00000000OO00 = false;
         this.O00000000OO000 = false;
         this.O00000000OO00O = false;
         this.O00000000O.O00000000();
         this.O000000000OO0();
         if (bl) {
            ChatUtil.O00000000("[ActionRecorder] Playback stopped.");
         }
      }
   }

   private void O0000000000OO0() {
      if (this.O00000000O000) {
         this.O0000000000(this.O000000000OO0O.O0000000000());
      }

      if (this.O00000000O0000) {
         this.O00000000000(false);
      }
   }

   private void O0000000000OOO() {
      if (this.O000000000OO00() && this.O00000000O0 != null) {
         ActionRecorder.W123 var1 = new ActionRecorder.W123();
         var1.O00000000 = this.O00000000O000O;
         var1.O000000000 = O0000000000.player.getYaw();
         var1.O0000000000 = O0000000000.player.getPitch();
         var1.O00000000000 = Math.abs(MathHelper.wrapDegrees(var1.O000000000 - this.O00000000O0O));
         var1.O000000000000 = Math.abs(var1.O0000000000 - this.O00000000O0O0);
         var1.O0000000000000 = this.O00000000OO;
         var1.O000000000000O = this.O00000000OO0;
         var1.O00000000000O = this.O00000000O0O00;
         var1.O00000000000O0 = this.O00000000O0O0O;
         var1.O00000000000OO = this.O00000000O0OO;
         var1.O0000000000O = this.O00000000O0OO0;
         var1.O0000000000O0 = this.O00000000O0OOO;
         var1.O0000000000O00 = O0000000000.player.getInventory().getSelectedSlot();
         var1.O0000000000O0O = O0000000000.player.getVelocity().x;
         var1.O0000000000OO = O0000000000.player.getVelocity().y;
         var1.O0000000000OO0 = O0000000000.player.getVelocity().z;
         var1.O0000000000OOO = Math.hypot(var1.O0000000000O0O, var1.O0000000000OO0);
         this.O00000000O0.O000000000000.add(var1);
         this.O00000000O0O = var1.O000000000;
         this.O00000000O0O0 = var1.O0000000000;
         this.O00000000OO = 0.0;
         this.O00000000OO0 = 0.0;
      }
   }

   private void O00000000(ActionRecorder.W122 o00000000) {
      if (this.O00000000O0 != null && this.O00000000O0.O0000000000000 != null) {
         this.O00000000O0.O0000000000000.add(o00000000);
      }
   }

   private void O00000000(ActionRecorder.W123 o000000000) {
      if (!this.O000000000OO00()) {
         this.O00000000000(false);
      } else {
         this.O0000000000(o000000000.O0000000000O00);
         O0000000000.options.forwardKey.setPressed(o000000000.O00000000000O > 0.0F);
         O0000000000.options.backKey.setPressed(o000000000.O00000000000O < 0.0F);
         O0000000000.options.leftKey.setPressed(o000000000.O00000000000O0 > 0.0F);
         O0000000000.options.rightKey.setPressed(o000000000.O00000000000O0 < 0.0F);
         O0000000000.options.jumpKey.setPressed(o000000000.O00000000000OO);
         O0000000000.options.sneakKey.setPressed(o000000000.O0000000000O);
         O0000000000.options.sprintKey.setPressed(o000000000.O0000000000O0);
         O0000000000.options.attackKey.setPressed(this.O00000000OO00);
         O0000000000.options.useKey.setPressed(this.O00000000OO000);
         O0000000000.options.pickItemKey.setPressed(this.O00000000OO00O);
         O0000000000.player.setSprinting(o000000000.O0000000000O0);
      }
   }

   private void O00000000(ActionRecorder.W123 o000000000, O0000000O0OOO o0000000O0OOO) {
      if (O0000000000.player != null) {
         if (this.O000000000OOO.O0000000000()) {
            float var3 = Math.abs(MathHelper.wrapDegrees(o000000000.O000000000 - O0000000000.player.getYaw()));
            float var4 = Math.abs(o000000000.O0000000000 - O0000000000.player.getPitch());
            float var5 = Math.max(this.O000000000OOO0.O0000000000(), Math.max(o000000000.O00000000000, var3));
            float var6 = Math.max(this.O000000000OOO0.O0000000000(), Math.max(o000000000.O000000000000, var4));
            this.O00000000O.O00000000(new O000000O0O00OO(o000000000.O000000000, o000000000.O0000000000), var5, var6, 1, 30);
            o0000000O0OOO.O00000000(O0000000000.player.getYaw());
            o0000000O0OOO.O000000000(O0000000000.player.getPitch());
         } else {
            O0000000000.player.setYaw(o000000000.O000000000);
            O0000000000.player.setPitch(o000000000.O0000000000);
            o0000000O0OOO.O00000000(o000000000.O000000000);
            o0000000O0OOO.O000000000(o000000000.O0000000000);
         }
      }
   }

   private void O00000000(int i) {
      if (this.O00000000O00 != null && this.O00000000O00.O0000000000000 != null && this.O00000000O00OO != i) {
         this.O00000000O00OO = i;

         for (ActionRecorder.W122 var3 : this.O00000000O00.O0000000000000) {
            if (var3.O00000000 == i) {
               this.O000000000(var3);
            }
         }
      }
   }

   private void O000000000(ActionRecorder.W122 o00000000) {
      if ("KEY".equals(o00000000.O0000000000)) {
         this.O0000000000(o00000000);
      } else if ("MOUSE".equals(o00000000.O0000000000)) {
         this.O00000000000(o00000000);
      }
   }

   private void O0000000000(ActionRecorder.W122 o00000000) {
      boolean var2 = o00000000.O0000000000000 != 0;
      if (this.O00000000(O0000000000.options.attackKey, o00000000.O00000000000, o00000000.O000000000000)) {
         this.O00000000OO00 = var2;
         O0000000000.options.attackKey.setPressed(var2);
         if (var2) {
            this.O000000000O();
         }
      } else if (this.O00000000(O0000000000.options.useKey, o00000000.O00000000000, o00000000.O000000000000)) {
         this.O00000000OO000 = var2;
         O0000000000.options.useKey.setPressed(var2);
         if (var2) {
            this.O000000000O0();
         }
      } else if (this.O00000000(O0000000000.options.pickItemKey, o00000000.O00000000000, o00000000.O000000000000)) {
         this.O00000000OO00O = var2;
         O0000000000.options.pickItemKey.setPressed(var2);
      } else {
         if (var2 && O0000000000.options.hotbarKeys != null) {
            for (int var3 = 0; var3 < O0000000000.options.hotbarKeys.length; var3++) {
               if (this.O00000000(O0000000000.options.hotbarKeys[var3], o00000000.O00000000000, o00000000.O000000000000)) {
                  this.O0000000000(var3);
                  return;
               }
            }
         }
      }
   }

   private void O00000000000(ActionRecorder.W122 o00000000) {
      boolean var2 = o00000000.O0000000000000 != 0;
      if (o00000000.O00000000000 == 0) {
         this.O00000000OO00 = var2;
         O0000000000.options.attackKey.setPressed(var2);
         if (var2) {
            this.O000000000O();
         }
      } else if (o00000000.O00000000000 == 1) {
         this.O00000000OO000 = var2;
         O0000000000.options.useKey.setPressed(var2);
         if (var2) {
            this.O000000000O0();
         }
      } else {
         if (o00000000.O00000000000 == 2) {
            this.O00000000OO00O = var2;
            O0000000000.options.pickItemKey.setPressed(var2);
         }
      }
   }

   private void O000000000O() {
      if (this.O000000000OO00() && O0000000000.currentScreen == null) {
         if (O0000000000.crosshairTarget instanceof EntityHitResult var1) {
            Entity var4 = var1.getEntity();
            if (var4 != null) {
               O0000000000.interactionManager.attackEntity(O0000000000.player, var4);
               O0000000000.player.swingHand(Hand.MAIN_HAND);
               return;
            }
         }

         if (O0000000000.crosshairTarget instanceof BlockHitResult var3 && O0000000000.interactionManager.attackBlock(var3.getBlockPos(), var3.getSide())) {
            O0000000000.player.swingHand(Hand.MAIN_HAND);
         }
      }
   }

   private void O000000000O0() {
      if (this.O000000000OO00() && O0000000000.currentScreen == null) {
         if (O0000000000.crosshairTarget instanceof BlockHitResult var1) {
            ActionResult var4 = O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var1);
            if (var4 != ActionResult.PASS && var4 != ActionResult.FAIL) {
               O0000000000.player.swingHand(Hand.MAIN_HAND);
               return;
            }
         }

         ActionResult var3 = O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
         if (var3 != ActionResult.PASS && var3 != ActionResult.FAIL) {
            O0000000000.player.swingHand(Hand.MAIN_HAND);
         }
      }
   }

   private void O000000000O00() {
      int var1 = this.O000000000O000();
      if (var1 <= 0) {
         this.O00000000000(false);
      } else if (this.O00000000O00O + 1 < var1) {
         this.O00000000O00O++;
      } else {
         this.O00000000O00O0++;
         if (!this.O000000000O0OO.O0000000000() && this.O00000000O00O0 >= Math.max(1, Math.round(this.O000000000OO.O0000000000()))) {
            this.O00000000000(true);
         } else {
            this.O00000000O00O = 0;
            this.O00000000O00OO = -1;
            this.O00000000OO00 = false;
            this.O00000000OO000 = false;
            this.O00000000OO00O = false;
         }
      }
   }

   private int O000000000O000() {
      if (this.O00000000O00 != null && this.O00000000O00.O000000000000 != null) {
         int var1 = this.O00000000O00.O000000000000.size();
         if (this.O000000000OO0.O0000000000() > 0.0F) {
            var1 = Math.min(var1, Math.max(1, Math.round(this.O000000000OO0.O0000000000() * 20.0F)));
         }

         return var1;
      } else {
         return 0;
      }
   }

   private ActionRecorder.W123 O000000000(int i) {
      if (this.O00000000O00 != null && this.O00000000O00.O000000000000 != null && !this.O00000000O00.O000000000000.isEmpty()) {
         int var2 = Math.max(0, Math.min(i, this.O00000000O00.O000000000000.size() - 1));
         ActionRecorder.W123 var3 = this.O00000000O00.O000000000000.get(var2);
         if (var3.O00000000 == i) {
            return var3;
         } else {
            for (ActionRecorder.W123 var5 : this.O00000000O00.O000000000000) {
               if (var5.O00000000 == i) {
                  return var5;
               }
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   private void O00000000(ActionRecorder.W124 o0000000000) {
      try {
         this.O000000000(o0000000000);
         Path var2 = this.O000000000O0O();
         Files.createDirectories(var2.getParent());

         try (BufferedWriter var3 = Files.newBufferedWriter(var2, StandardCharsets.UTF_8)) {
            this.O000000000OOOO.toJson(o0000000000, var3);
         }

         ChatUtil.O00000000("[ActionRecorder] Saved: " + var2.getFileName());
      } catch (Throwable var8) {
         ChatUtil.O00000000("[ActionRecorder] Save failed: " + var8.getMessage());
      }
   }

   private ActionRecorder.W124 O000000000O00O() {
      try {
         Path var1 = this.O000000000O0O();
         if (!Files.isRegularFile(var1)) {
            return null;
         } else {
            ActionRecorder.W124 var3;
            try (BufferedReader var2 = Files.newBufferedReader(var1, StandardCharsets.UTF_8)) {
               var3 = (ActionRecorder.W124)this.O000000000OOOO.fromJson(var2, ActionRecorder.W124.class);
            }

            return var3;
         }
      } catch (Throwable var7) {
         ChatUtil.O00000000("[ActionRecorder] Load failed: " + var7.getMessage());
         return null;
      }
   }

   private void O000000000(ActionRecorder.W124 o0000000000) {
      if (o0000000000.O000000000000 == null) {
         o0000000000.O000000000000 = new ArrayList<>();
      }

      if (o0000000000.O0000000000000 == null) {
         o0000000000.O0000000000000 = new ArrayList<>();
      }

      o0000000000.O00000000 = 1;
      o0000000000.O0000000000 = this.O000000000OO();
      o0000000000.O00000000000 = o0000000000.O000000000000.size();
      o0000000000.O000000000000.sort(Comparator.comparingInt(o000000000 -> o000000000.O00000000));
      o0000000000.O0000000000000
         .sort(Comparator.<ActionRecorder.W122>comparingInt(o00000000 -> o00000000.O00000000).thenComparingInt(o00000000 -> o00000000.O000000000));
   }

   private Path O000000000O0O() {
      return this.O000000000O0O0().resolve(this.O000000000O0OO());
   }

   private Path O000000000O0O0() {
      return WildClient.O00000000 != null && WildClient.O00000000.O0000000000000 != null
         ? WildClient.O00000000.O0000000000000.toPath().resolve("action_records")
         : O0000000000.runDirectory.toPath().resolve("Wild").resolve("action_records");
   }

   private String O000000000O0OO() {
      String var1 = this.O000000000OO();
      return var1.endsWith(".json") ? var1 : var1 + ".json";
   }

   private String O000000000OO() {
      String var1 = this.O000000000O000.O0000000000();
      if (var1 == null || var1.isBlank()) {
         var1 = "default";
      }

      var1 = var1.trim().replace('\\', '/');
      int var2 = var1.lastIndexOf(47);
      if (var2 >= 0) {
         var1 = var1.substring(var2 + 1);
      }

      String var3 = var1.replaceAll("[^a-zA-Z0-9._-]", "_");
      if (var3.isBlank() || var3.equals(".") || var3.equals("..")) {
         var3 = "default";
      }

      if (var3.endsWith(".json")) {
         var3 = var3.substring(0, var3.length() - 5);
      }

      return var3;
   }

   private void O0000000000(int i) {
      if (O0000000000.player != null && i >= 0 && i <= 8) {
         if (O0000000000.player.getInventory().getSelectedSlot() != i) {
            O0000000000.player.getInventory().setSelectedSlot(i);
            if (O0000000000.interactionManager instanceof ClientPlayerInteractionManagerAccessor var2) {
               var2.invokeSyncSelectedSlot();
            }
         }
      }
   }

   private boolean O00000000(KeyBinding keyBinding, int i, int j) {
      return keyBinding != null && keyBinding.matchesKey(i, j);
   }

   private boolean O00000000000(int i) {
      return i != -1 && (i == this.O000000000O00O.O0000000000() || i == this.O000000000O0O.O0000000000() || i == this.O000000000O0O0.O0000000000());
   }

   private void O000000000OO0() {
      if (O0000000000.options != null) {
         this.O00000000(O0000000000.options.forwardKey);
         this.O00000000(O0000000000.options.backKey);
         this.O00000000(O0000000000.options.leftKey);
         this.O00000000(O0000000000.options.rightKey);
         this.O00000000(O0000000000.options.jumpKey);
         this.O00000000(O0000000000.options.sneakKey);
         this.O00000000(O0000000000.options.sprintKey);
         O0000000000.options.attackKey.setPressed(false);
         O0000000000.options.useKey.setPressed(false);
         O0000000000.options.pickItemKey.setPressed(false);
         if (O0000000000.player != null) {
            O0000000000.player.setSprinting(false);
         }
      }
   }

   private void O00000000(KeyBinding keyBinding) {
      if (keyBinding != null && O0000000000.getWindow() != null) {
         boolean var2 = InputUtil.isKeyPressed(O0000000000.getWindow().getHandle(), keyBinding.getDefaultKey().getCode());
         keyBinding.setPressed(var2);
      }
   }

   private boolean O000000000OO00() {
      return O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null && O0000000000.options != null;
   }

   static final class W122 {
      int O00000000;
      int O000000000;
      String O0000000000;
      int O00000000000;
      int O000000000000;
      int O0000000000000;
      int O000000000000O;
      double O00000000000O;
      double O00000000000O0;

      private W122() {
      }

      static ActionRecorder.W122 O00000000(int i, int j, int k, int l, int m, int n) {
         ActionRecorder.W122 var6 = new ActionRecorder.W122();
         var6.O00000000 = i;
         var6.O000000000 = j;
         var6.O0000000000 = "KEY";
         var6.O00000000000 = k;
         var6.O000000000000 = l;
         var6.O0000000000000 = m;
         var6.O000000000000O = n;
         return var6;
      }

      static ActionRecorder.W122 O00000000(int i, int j, int k, int l, int m) {
         ActionRecorder.W122 var5 = new ActionRecorder.W122();
         var5.O00000000 = i;
         var5.O000000000 = j;
         var5.O0000000000 = "MOUSE";
         var5.O00000000000 = k;
         var5.O0000000000000 = l;
         var5.O000000000000O = m;
         return var5;
      }

      static ActionRecorder.W122 O00000000(int i, int j, double d, double e) {
         ActionRecorder.W122 var6 = new ActionRecorder.W122();
         var6.O00000000 = i;
         var6.O000000000 = j;
         var6.O0000000000 = "SCROLL";
         var6.O00000000000O = d;
         var6.O00000000000O0 = e;
         return var6;
      }
   }

   static final class W123 {
      int O00000000;
      float O000000000;
      float O0000000000;
      float O00000000000;
      float O000000000000;
      double O0000000000000;
      double O000000000000O;
      float O00000000000O;
      float O00000000000O0;
      boolean O00000000000OO;
      boolean O0000000000O;
      boolean O0000000000O0;
      int O0000000000O00;
      double O0000000000O0O;
      double O0000000000OO;
      double O0000000000OO0;
      double O0000000000OOO;
   }

   static final class W124 {
      int O00000000 = 1;
      long O000000000;
      String O0000000000 = "default";
      int O00000000000;
      List<ActionRecorder.W123> O000000000000 = new ArrayList<>();
      List<ActionRecorder.W122> O0000000000000 = new ArrayList<>();
   }
}
