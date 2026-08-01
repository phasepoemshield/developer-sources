package l;

import antidaunleak.api.annotation.Native;
import java.util.Locale;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.s2c.common.DisconnectS2CPacket;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import org.lwjgl.glfw.GLFW;

public class JoinerHelper extends Helper242 {
   private final Setting5 serverSelection = new Setting5("Сервер", "Выберите целевой сервер")
      .method2381("ReallyWorld", "SpookyTime Duels")
      .method2383("РиллиВорлд");
   private final Setting2 griefSelection = new Setting2("Номер грифа", "Выберите номер сервера для грифа")
      .method2086(1.0F)
      .method2079(1, 54)
      .method2081(() -> this.serverSelection.method2385("ReallyWorld"));
   private long lastActionTime;
   private boolean isToggling;

   public static JoinerHelper method3702() {
      return Helper222.method1979(JoinerHelper.class);
   }

   public JoinerHelper() {
      super("JoinerHelper", "Joiner Helper", Helper269.MISC);
      this.setup(new Helper264[]{this.serverSelection, this.griefSelection});
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginUltra
   )
   public void onTick(Event8 var1) {
      if (this.state && mc.player != null) {
         if (GLFW.glfwGetKey(mc.getWindow().getHandle(), 260) == 1) {
            this.deactivate();
         } else if (mc.currentScreen == null && mc.player.age < 5) {
            this.method3704();
         } else if (mc.currentScreen instanceof GenericContainerScreen var2) {
            for (int var6 = 0; var6 < var2.getScreenHandler().slots.size(); var6++) {
               String var4 = this.method3705(var2.getScreenHandler().slots.get(var6).getStack().getName().getString());
               if (this.serverSelection.method2385("ReallyWorld") && Helper128.method1053()) {
                  if (var4.contains("гриферское выживание") && this.method3703()) {
                     Helper66.method703(var6, 0, SlotActionType.PICKUP, false);
                     this.lastActionTime = System.currentTimeMillis();
                  }

                  int var7 = (int)this.griefSelection.method2082();
                  if (var4.contains("гриф #" + var7) && this.method3703()) {
                     Helper66.method703(var6, 0, SlotActionType.PICKUP, false);
                     this.lastActionTime = System.currentTimeMillis();
                  }
               } else if (this.serverSelection.method2385("SpookyTime Duels") && Helper128.method1056()) {
                  String var5 = this.method3705(var2.getTitle().getString());
                  if (var5.contains("выберите режим") && this.method3703()) {
                     Helper66.method703(14, 0, SlotActionType.QUICK_MOVE, false);
                     this.lastActionTime = System.currentTimeMillis();
                  }
               }
            }
         }
      }
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (this.state && var1.method3896() == Helper385.RECEIVE && mc.player != null) {
         if (var1.method3895() instanceof DisconnectS2CPacket var2) {
            String var4 = this.method3705(var2.reason().getString());
            if (var4.contains("к сожалению сервер переполнен")
               || var4.contains("подождите 20 секунд!")
               || var4.contains("вы уже подключены на этот сервер!")
               || var4.contains("подождите несколько секунд перед повторным подключением!")
               || var4.contains("вы были кикнуты с сервера 1duels:")
               || var4.contains("вы были кикнуты")
               || var4.contains("большой поток игроков")
               || var4.contains("сервер заполнен!")) {
               this.method3704();
            }
         }
      }
   }

   @Override
   public void activate() {
      super.activate();
      this.method3704();
      this.isToggling = false;
      this.lastActionTime = 0L;
   }

   @Override
   public void deactivate() {
      super.deactivate();
      this.lastActionTime = 0L;
      this.isToggling = false;
   }

   private boolean method3703() {
      return System.currentTimeMillis() - this.lastActionTime > 50L;
   }

   private void method3704() {
      if (mc.player != null && mc.player.networkHandler != null) {
         Helper66.method721();
         mc.player
            .networkHandler
            .sendPacket(new PlayerInteractItemC2SPacket(Hand.MAIN_HAND, mc.player.getInventory().selectedSlot, mc.player.getYaw(), mc.player.getPitch()));
      }
   }

   private String method3705(String var1) {
      return var1 == null ? "" : var1.toLowerCase(Locale.ROOT);
   }
}
