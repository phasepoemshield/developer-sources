package zenith.zov.client.screens.override.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

/**
 * Simple mod list when ModMenu is not installed.
 */
public class ModsListScreen extends Screen {
   private final Screen parent;
   private final List<String> lines = new ArrayList<>();
   private int scroll;

   public ModsListScreen(Screen parent) {
      super(Text.literal("Mods"));
      this.parent = parent;
      List<ModContainer> mods = new ArrayList<>(FabricLoader.getInstance().getAllMods());
      mods.sort(Comparator.comparing(m -> m.getMetadata().getId()));
      for (ModContainer mod : mods) {
         this.lines.add(mod.getMetadata().getName() + " (" + mod.getMetadata().getId() + ") " + mod.getMetadata().getVersion());
      }
   }

   @Override
   protected void init() {
      this.addDrawableChild(ButtonWidget.builder(Text.literal("Back"), b -> this.close())
         .dimensions(this.width / 2 - 50, this.height - 28, 100, 20)
         .build());
   }

   @Override
   public void render(DrawContext context, int mouseX, int mouseY, float delta) {
      this.renderBackground(context, mouseX, mouseY, delta);
      context.drawCenteredTextWithShadow(this.textRenderer, this.title, this.width / 2, 12, 0xFFFFFF);
      int y = 32 - this.scroll;
      int maxY = this.height - 40;
      for (String line : this.lines) {
         if (y >= 28 && y <= maxY) {
            context.drawTextWithShadow(this.textRenderer, line, 20, y, 0xDDDDDD);
         }
         y += 12;
      }
      super.render(context, mouseX, mouseY, delta);
   }

   @Override
   public boolean mouseScrolled(double mouseX, double mouseY, double horizontal, double vertical) {
      this.scroll = Math.max(0, this.scroll - (int) (vertical * 12));
      return true;
   }

   @Override
   public void close() {
      this.client.setScreen(this.parent);
   }

   /**
    * Prefer ModMenu when present; otherwise open this screen.
    */
   public static void open(Screen parent) {
      try {
         Class<?> modsScreen = Class.forName("com.terraformersmc.modmenu.gui.ModsScreen");
         Object screen = modsScreen.getConstructor(Screen.class).newInstance(parent);
         net.minecraft.client.MinecraftClient.getInstance().setScreen((Screen) screen);
      } catch (Throwable ignored) {
         net.minecraft.client.MinecraftClient.getInstance().setScreen(new ModsListScreen(parent));
      }
   }
}
