package moscow.rockstar.module.visuals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import moscow.rockstar.framework.msdf.Fonts;
import moscow.rockstar.framework.objects.BorderRadius;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.render.PreHudRenderEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.util.colors.ColorRGBA;
import moscow.rockstar.util.colors.Colors;
import moscow.rockstar.util.render.Utils;
import net.minecraft.block.ChestBlock;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;

@ModuleInfo(name = "Warden Helper", category = ModuleCategory.VISUALS, desc = "Визуальная помощь при борьбе c Варденом")
public class WardenHelper extends BaseModule {
   private static final Pattern CLOCK = Pattern.compile("(\\d{1,2}):(\\d{2})(?::(\\d{2}))?");
   private static final Pattern SEC = Pattern.compile("(\\d+)\\s*(с|s|сек|sec)", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
   private static final Pattern MIN = Pattern.compile(
      "(\\d+)\\s*(м|m|мин|min(?:\\.|ute)?)\\s*(?:(\\d+)\\s*(с|s|сек|sec(?:\\.|ond)?))?",
      Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE
   );

   private final EventListener<PreHudRenderEvent> onHud = event -> {
      if (mc.world == null || mc.player == null) {
         return;
      }

      MatrixStack matrices = event.getContext().getMatrices();
      for (Entity entity : mc.world.getEntities()) {
         if (!(entity instanceof ArmorStandEntity stand)) {
            continue;
         }
         String raw = stand.getName().getString();
         String time = this.extractTime(raw);
         if (time == null || this.findChestBelow(stand.getBlockPos()) == null) {
            continue;
         }

         Vec3d pos = Utils.getInterpolatedPos(stand, event.getTickDelta()).add(0.0, stand.getHeight() + 0.35, 0.0);
         Vec2f screen = Utils.worldToScreen(pos);
         if (screen == null) {
            continue;
         }

         float dist = (float) mc.player.getPos().distanceTo(stand.getPos());
         float scale = MathHelper.clamp(1.0F - dist / 40.0F, 0.55F, 1.0F);
         float textW = Fonts.SEMIBOLD.getFont(9.0F).width(time);
         float w = Math.max(textW + 22.0F, 52.0F);
         float h = 18.0F;

         matrices.push();
         matrices.translate(screen.x, screen.y, 0.0F);
         matrices.scale(scale, scale, 1.0F);
         event.getContext().drawRoundedRect(-w / 2.0F, 0.0F, w, h, BorderRadius.all(9.0F), new ColorRGBA(13.0F, 18.0F, 20.0F, 220.0F));
         event.getContext().drawRoundedRect(-w / 2.0F + 6.0F, (h - 6.0F) / 2.0F, 6.0F, 6.0F, BorderRadius.all(3.0F), Colors.getAccent());
         event.getContext().drawText(Fonts.SEMIBOLD.getFont(9.0F), time, -w / 2.0F + 16.0F, (h - Fonts.SEMIBOLD.getFont(9.0F).height()) / 2.0F, ColorRGBA.WHITE);
         matrices.pop();
      }
   };

   private String extractTime(String text) {
      if (text == null || text.isBlank()) {
         return null;
      }
      Matcher m = CLOCK.matcher(text);
      if (m.find()) {
         return m.group();
      }
      m = MIN.matcher(text);
      if (m.find()) {
         return m.group();
      }
      m = SEC.matcher(text);
      if (m.find()) {
         return m.group();
      }
      return null;
   }

   private BlockPos findChestBelow(BlockPos origin) {
      if (mc.world == null) {
         return null;
      }
      for (int i = 1; i <= 3; i++) {
         BlockPos below = origin.down(i);
         if (mc.world.getBlockState(below).getBlock() instanceof ChestBlock) {
            return below;
         }
      }
      return null;
   }
}
