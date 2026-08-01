package l;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.CheckboxWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.CheckboxWidget.Builder;
import net.minecraft.text.Text;
import org.apache.commons.lang3.StringUtils;

public class Widget15 extends Screen {
   private boolean isSocks4 = false;
   private TextFieldWidget ipPort;
   private TextFieldWidget username;
   private TextFieldWidget password;
   private CheckboxWidget enabledCheck;
   private Screen parentScreen;
   private String msg = "";
   private int[] positionY;
   private int positionX;
   private static String text_proxy = Text.translatable("PROXY").getString();

   public Widget15(Screen var1) {
      super(Text.literal(text_proxy));
      this.parentScreen = var1;
   }

   private static boolean method483(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         String[] var1 = var0.split(":");
         if (var1.length <= 1) {
            return false;
         } else if (!StringUtils.isNumeric(var1[1])) {
            return false;
         } else {
            try {
               int var2 = Integer.parseInt(var1[1]);
               return var2 >= 0 && var2 <= 65535;
            } catch (NumberFormatException var3) {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private boolean method484() {
      if (!method483(this.ipPort.getText())) {
         this.ipPort.setFocused(true);
         return false;
      } else {
         return true;
      }
   }

   private void method485(int var1, int var2, int var3) {
      this.positionX = this.width / 2 - var2 / 2;
      this.positionY = new int[var1];
      int var4 = (this.height + var1 * var3) / 2;
      int var5 = var4 - var1 * var3;

      for (int var6 = 0; var6 != var1; var6++) {
         this.positionY[var6] = var5 + var3 * var6;
      }
   }

   @Override
   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      if (keyCode == 256) {
         MinecraftClient.getInstance().setScreen(this.parentScreen);
         return true;
      } else {
         super.keyPressed(keyCode, scanCode, modifiers);
         this.msg = "";
         return true;
      }
   }

   @Override
   public void render(DrawContext context, int mouseX, int mouseY, float delta) {
      super.render(context, mouseX, mouseY, delta);
      if (this.enabledCheck.isChecked() && !method483(this.ipPort.getText())) {
         this.enabledCheck.onPress();
      }

      context.drawTextWithShadow(
         this.textRenderer, Text.translatable("Введите айпи адрес и порт. Пример ниже").getString(), this.width / 2 - 106, this.positionY[3] - 15, 10526880
      );
      context.drawTextWithShadow(this.textRenderer, Text.translatable("Айпи:Порт ▸").getString(), this.width / 2 - 140, this.positionY[3] + 15, 10526880);
      this.ipPort.render(context, mouseX, mouseY, delta);
      context.drawTextWithShadow(this.textRenderer, Text.translatable("Никнейм ▸").getString(), this.width / 2 - 131, this.positionY[4] + 15, 10526880);
      context.drawTextWithShadow(this.textRenderer, Text.translatable("Пароль ▸").getString(), this.width / 2 - 126, this.positionY[5] + 15, 10526880);
      this.username.render(context, mouseX, mouseY, delta);
      this.password.render(context, mouseX, mouseY, delta);
      context.drawCenteredTextWithShadow(this.textRenderer, this.msg, this.width / 2, this.positionY[6] + 5, 10526880);
   }

   @Override
   public void init() {
      short var1 = 160;
      this.method485(10, var1, 26);
      this.isSocks4 = Helper301.proxy.type == Helper28.SOCKS4;
      this.ipPort = new TextFieldWidget(this.textRenderer, this.positionX, this.positionY[3] + 10, var1, 20, Text.literal(""));
      this.ipPort.setText(Helper301.proxy.ipPort);
      this.ipPort.setMaxLength(1024);
      this.ipPort.setFocused(true);
      this.addSelectableChild(this.ipPort);
      this.username = new TextFieldWidget(this.textRenderer, this.positionX, this.positionY[4] + 10, var1, 20, Text.literal(""));
      this.username.setMaxLength(255);
      this.username.setText(Helper301.proxy.username);
      this.addSelectableChild(this.username);
      this.password = new TextFieldWidget(this.textRenderer, this.positionX, this.positionY[5] + 10, var1, 20, Text.literal(""));
      this.password.setMaxLength(255);
      this.password.setText(Helper301.proxy.password);
      this.addSelectableChild(this.password);
      int var2 = this.width / 2 - var1 / 2 * 3 / 2;
      ButtonWidget var3 = ButtonWidget.builder(Text.translatable("Применить"), var1x -> {
         if (this.enabledCheck.isChecked()) {
            if (this.method484()) {
               Helper301.proxy = new Helper29(this.isSocks4, this.ipPort.getText(), this.username.getText(), this.password.getText());
               Helper301.proxyEnabled = true;
               Helper16.method377(Helper301.proxy);
               Helper16.method378();
               MinecraftClient.getInstance().setScreen(new MultiplayerScreen(new TitleScreen()));
            }
         } else {
            Helper301.proxy = new Helper29(this.isSocks4, this.ipPort.getText(), this.username.getText(), this.password.getText());
            Helper301.proxyEnabled = false;
            Helper16.method377(Helper301.proxy);
            Helper16.method378();
            MinecraftClient.getInstance().setScreen(new MultiplayerScreen(new TitleScreen()));
         }
      }).dimensions(var2 + (var1 / 2 - 62) * 2, this.positionY[7] - 10, var1 / 2 + 3, 20).build();
      this.addDrawableChild(var3);
      Builder var4 = CheckboxWidget.builder(Text.translatable("Включить прокси"), this.textRenderer);
      var4.pos(this.width / 2 - 34 - (13 + this.textRenderer.getWidth(Text.translatable("Включить прокси"))) / 2, this.positionY[7] + 15);
      if (Helper301.proxyEnabled) {
         var4.checked(Helper301.proxyEnabled);
      }

      this.enabledCheck = var4.build();
      this.addDrawableChild(this.enabledCheck);
      ButtonWidget var5 = ButtonWidget.builder(Text.translatable("Отменить"), var1x -> MinecraftClient.getInstance().setScreen(this.parentScreen))
         .dimensions(var2 + (var1 / 2 - 16) * 2, this.positionY[7] - 10, var1 / 2 - 3, 20)
         .build();
      this.addDrawableChild(var5);
   }

   @Override
   public void close() {
      this.msg = "";
      MinecraftClient.getInstance().setScreen(this.parentScreen);
   }
}
