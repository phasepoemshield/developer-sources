package zenith.zov.client.screens.override.main;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.UUID;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.session.Session;
import net.minecraft.text.Text;

/**
 * Lightweight offline alt manager: change the local Session username.
 */
public class AltManagerScreen extends Screen {
   private final Screen parent;
   private TextFieldWidget nameField;
   private String status = "";

   public AltManagerScreen(Screen parent) {
      super(Text.literal("Alt Manager"));
      this.parent = parent;
   }

   @Override
   protected void init() {
      int cx = this.width / 2;
      int cy = this.height / 2;
      String current = this.client != null ? this.client.getSession().getUsername() : "Player";
      this.nameField = new TextFieldWidget(this.textRenderer, cx - 100, cy - 20, 200, 20, Text.literal("Username"));
      this.nameField.setMaxLength(16);
      this.nameField.setText(current);
      this.addSelectableChild(this.nameField);
      this.setInitialFocus(this.nameField);

      this.addDrawableChild(ButtonWidget.builder(Text.literal("Apply"), b -> this.applyName())
         .dimensions(cx - 100, cy + 10, 95, 20)
         .build());
      this.addDrawableChild(ButtonWidget.builder(Text.literal("Back"), b -> this.close())
         .dimensions(cx + 5, cy + 10, 95, 20)
         .build());
   }

   private void applyName() {
      String name = this.nameField.getText().trim();
      if (name.isEmpty() || name.length() > 16 || !name.matches("[A-Za-z0-9_]+")) {
         this.status = "Invalid username";
         return;
      }
      try {
         MinecraftClient mc = this.client;
         Session old = mc.getSession();
         UUID uuid = UUID.nameUUIDFromBytes(("OfflinePlayer:" + name).getBytes(java.nio.charset.StandardCharsets.UTF_8));
         Session neu = new Session(
            name,
            uuid,
            old.getAccessToken(),
            old.getXuid(),
            old.getClientId(),
            old.getAccountType()
         );
         setSession(mc, neu);
         this.status = "Switched to " + name;
      } catch (Throwable t) {
         this.status = "Failed: " + t.getClass().getSimpleName();
         t.printStackTrace();
      }
   }

   private static void setSession(MinecraftClient mc, Session session) throws Exception {
      Field target = null;
      for (Field f : MinecraftClient.class.getDeclaredFields()) {
         if (f.getType() == Session.class && !Modifier.isStatic(f.getModifiers())) {
            target = f;
            break;
         }
      }
      if (target == null) {
         throw new NoSuchFieldException("session");
      }
      target.setAccessible(true);
      try {
         Field modifiers = Field.class.getDeclaredField("modifiers");
         modifiers.setAccessible(true);
         modifiers.setInt(target, target.getModifiers() & ~Modifier.FINAL);
      } catch (NoSuchFieldException ignored) {
         // Java 12+ may not expose modifiers; setAccessible is often enough in Loom
      }
      target.set(mc, session);
   }

   @Override
   public void render(DrawContext context, int mouseX, int mouseY, float delta) {
      this.renderBackground(context, mouseX, mouseY, delta);
      context.drawCenteredTextWithShadow(this.textRenderer, this.title, this.width / 2, this.height / 2 - 50, 0xFFFFFF);
      context.drawCenteredTextWithShadow(this.textRenderer, Text.literal("Offline username"), this.width / 2, this.height / 2 - 35, 0xAAAAAA);
      this.nameField.render(context, mouseX, mouseY, delta);
      if (!this.status.isEmpty()) {
         context.drawCenteredTextWithShadow(this.textRenderer, Text.literal(this.status), this.width / 2, this.height / 2 + 40, 0x55FF55);
      }
      super.render(context, mouseX, mouseY, delta);
   }

   @Override
   public void close() {
      this.client.setScreen(this.parent);
   }
}
