package moscow.rockstar.module.visuals;

import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import moscow.rockstar.Rockstar;
import moscow.rockstar.framework.base.CustomDrawContext;
import moscow.rockstar.framework.base.CustomScreen;
import moscow.rockstar.framework.base.UIContext;
import moscow.rockstar.framework.msdf.Font;
import moscow.rockstar.framework.msdf.Fonts;
import moscow.rockstar.framework.objects.BorderRadius;
import moscow.rockstar.framework.objects.MouseButton;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.systems.event.impl.render.PreHudRenderEvent;
import moscow.rockstar.systems.event.impl.render.Render3DEvent;
import moscow.rockstar.systems.localization.Localizator;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.module.visuals.esp.EspAnimationState;
import moscow.rockstar.module.visuals.esp.EspItemType;
import moscow.rockstar.module.visuals.esp.EspPlayerType;
import moscow.rockstar.module.visuals.esp.EspPreviewRenderer;
import moscow.rockstar.module.visuals.esp.EspTarget;
import moscow.rockstar.module.visuals.esp.EspTargetType;
import moscow.rockstar.config.settings.BooleanSetting;
import moscow.rockstar.config.settings.ButtonSetting;
import moscow.rockstar.config.settings.ColorSetting;
import moscow.rockstar.config.settings.ModeSetting;
import moscow.rockstar.config.settings.SelectSetting;
import moscow.rockstar.config.settings.SliderSetting;
import moscow.rockstar.util.animation.base.Animation;
import moscow.rockstar.util.animation.base.Easing;
import moscow.rockstar.util.colors.ColorRGBA;
import moscow.rockstar.util.colors.Colors;
import moscow.rockstar.util.game.EntityUtility;
import moscow.rockstar.util.interfaces.IMinecraft;
import moscow.rockstar.util.interfaces.IScaledResolution;
import moscow.rockstar.util.render.CrystalRenderer;
import moscow.rockstar.util.render.Draw3DUtility;
import moscow.rockstar.util.render.DrawUtility;
import moscow.rockstar.util.render.RenderUtility;
import moscow.rockstar.util.render.Utils;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BuiltBuffer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
@ModuleInfo(name = "ESP", category = ModuleCategory.VISUALS, desc = "Подсветка и отображение информации о сущностях (игроки, мобы, предметы)")
public class ESP extends BaseModule {
   private static final Identifier ARROW_TEXTURE = Rockstar.id("textures/arrow.png");
   private static final Identifier BLOOM_TEXTURE = Rockstar.id("textures/bloom.png");


   private static final int FULL_BRIGHT_LIGHT = 0xF000F0;
   private static final ColorRGBA FRIEND_COLOR = new ColorRGBA(52.0F, 199.0F, 89.0F);
   private static final ColorRGBA LOCAL_COLOR = new ColorRGBA(86.0F, 190.0F, 255.0F);
   private static final ColorRGBA MOB_COLOR = new ColorRGBA(255.0F, 86.0F, 86.0F);
   private static final ColorRGBA ANIMAL_COLOR = new ColorRGBA(255.0F, 194.0F, 86.0F);
   private static final ColorRGBA ITEM_COLOR = new ColorRGBA(255.0F, 205.0F, 96.0F);

   private final ButtonSetting openMenu = new ButtonSetting(this, "Открыть меню").action(() -> mc.setScreen(new ESP.EspScreen(this)));
   private final BooleanSetting themeSync = new BooleanSetting(this, "Синхронизация с темой");
   private final SelectSetting targets = new SelectSetting(this, "Цели").min(1);
   private final SelectSetting.Value players = new SelectSetting.Value(this.targets, "Игроки").select();
   private final SelectSetting.Value mobs = new SelectSetting.Value(this.targets, "Мобы");
   private final SelectSetting.Value animals = new SelectSetting.Value(this.targets, "Животные");
   private final SelectSetting.Value items = new SelectSetting.Value(this.targets, "Предметы").select();

   private final SelectSetting playerTargets = new SelectSetting(this, "Игроки для ESP", () -> !this.players.isSelected()).min(1);
   private final SelectSetting.Value others = new SelectSetting.Value(this.playerTargets, "Другие").select();
   private final SelectSetting.Value local = new SelectSetting.Value(this.playerTargets, "Свой");
   private final SelectSetting.Value friends = new SelectSetting.Value(this.playerTargets, "Друзья").select();
   private final SelectSetting.Value rockstarUsers = new SelectSetting.Value(this.playerTargets, "Пользователи Rockstar");

   private final SelectSetting itemTargets = new SelectSetting(this, "Предметы для ESP", () -> !this.items.isSelected()).min(1);
   private final SelectSetting.Value heldItems = new SelectSetting.Value(this.itemTargets, "В руке").select();
   private final SelectSetting.Value droppedItems = new SelectSetting.Value(this.itemTargets, "Выброшенные").select();

   private final BooleanSetting boxes = new BooleanSetting(this, "Боксы").enable();
   private final SelectSetting boxMode = new SelectSetting(this, "Режим боксов", () -> !this.boxes.isEnabled()).min(1);
   private final SelectSetting.Value boxFill = new SelectSetting.Value(this.boxMode, "Заливка");
   private final SelectSetting.Value boxOutline = new SelectSetting.Value(this.boxMode, "Контур").select();
   private final SelectSetting.Value boxGradient = new SelectSetting.Value(this.boxMode, "Градиент");
   private final ColorSetting boxColor = new ColorSetting(this, "Цвет боксов", () -> !this.boxes.isEnabled())
      .color(new ColorRGBA(154.0F, 93.0F, 255.0F));

   private final BooleanSetting glow = new BooleanSetting(this, "Свечение").enable();
   private final ColorSetting glowColor = new ColorSetting(this, "Цвет свечения", () -> !this.glow.isEnabled())
      .color(new ColorRGBA(154.0F, 93.0F, 255.0F));
   private final BooleanSetting entityColor = new BooleanSetting(this, "Цвет сущности", () -> !this.glow.isEnabled()).enable();
   private final BooleanSetting glowGradient = new BooleanSetting(this, "Градиент свечения", () -> !this.glow.isEnabled());
   private final ColorSetting glowGradientColor = new ColorSetting(this, "Цвет градиента свечения", () -> !this.glowGradient.isEnabled())
      .color(new ColorRGBA(90.0F, 220.0F, 255.0F));
   private final ColorSetting itemColor = new ColorSetting(this, "Цвет предметов", () -> !this.glow.isEnabled()).color(ITEM_COLOR);
   private final SliderSetting glowStrength = new SliderSetting(this, "Сила свечения", () -> !this.glow.isEnabled())
      .min(0.2F)
      .max(7.0F)
      .step(0.1F)
      .currentValue(3.0F);
   private final SliderSetting glowStrengthItems = new SliderSetting(this, "Сила свечения предметов", () -> !this.glow.isEnabled())
      .min(0.2F)
      .max(7.0F)
      .step(0.1F)
      .currentValue(2.0F);

   private final BooleanSetting flame = new BooleanSetting(this, "Пламя");
   private final SliderSetting flameStrength = new SliderSetting(this, "Сила пламени", () -> !this.flame.isEnabled())
      .min(0.1F)
      .max(5.0F)
      .step(0.1F)
      .currentValue(1.3F);
   private final SliderSetting flameRiseSpeed = new SliderSetting(this, "Скорость подъема", () -> !this.flame.isEnabled())
      .min(0.1F)
      .max(4.0F)
      .step(0.1F)
      .currentValue(1.7F);
   private final SliderSetting flameWobble = new SliderSetting(this, "Колебания", () -> !this.flame.isEnabled())
      .min(0.0F)
      .max(2.5F)
      .step(0.05F)
      .currentValue(0.45F);
   private final SliderSetting flameFadeRate = new SliderSetting(this, "Скорость затухания", () -> !this.flame.isEnabled())
      .min(0.5F)
      .max(8.0F)
      .step(0.25F)
      .currentValue(3.7F);
   private final SliderSetting flameIntensity = new SliderSetting(this, "Интенсивность", () -> !this.flame.isEnabled())
      .min(0.1F)
      .max(2.5F)
      .step(0.1F)
      .currentValue(1.0F);
   private final BooleanSetting flameItemColor = new BooleanSetting(this, "Цвет предмета", () -> !this.flame.isEnabled()).enable();
   private final ColorSetting flameColor = new ColorSetting(this, "Цвет пламени", () -> !this.flame.isEnabled())
      .color(new ColorRGBA(255.0F, 110.0F, 50.0F));
   private final BooleanSetting flameGradient = new BooleanSetting(this, "Градиент пламени", () -> !this.flame.isEnabled()).enable();
   private final ColorSetting flameGradientColor = new ColorSetting(this, "Цвет градиента пламени", () -> !this.flameGradient.isEnabled())
      .color(new ColorRGBA(255.0F, 220.0F, 80.0F));

   private final BooleanSetting arrows = new BooleanSetting(this, "Стрелки");
   private final BooleanSetting arrowLines = new BooleanSetting(this, "Линии стрелок", () -> !this.arrows.isEnabled());
   private final ColorSetting arrowColor = new ColorSetting(this, "Цвет стрелок", () -> !this.arrows.isEnabled()).color(Colors.ACCENT);
   private final SliderSetting arrowDistance = new SliderSetting(this, "Дистанция стрелок", () -> !this.arrows.isEnabled())
      .min(1.5F)
      .max(10.0F)
      .step(0.1F)
      .currentValue(3.3F);
   private final BooleanSetting arrowHideNaked = new BooleanSetting(this, "Скрывать голых", () -> !this.arrows.isEnabled());

   private final BooleanSetting friendMarkers = new BooleanSetting(this, "Маркеры друзей");
   private final ModeSetting friendMarkerType = new ModeSetting(this, "Тип маркеров", () -> !this.friendMarkers.isEnabled());
   private final ModeSetting.Value friendHeads = new ModeSetting.Value(this.friendMarkerType, "Головы");
   private final ModeSetting.Value friendSims = new ModeSetting.Value(this.friendMarkerType, "Sims").select();

   private final BooleanSetting nametags = new BooleanSetting(this, "Надписи");
   private final BooleanSetting nametagArmor = new BooleanSetting(this, "Показывать броню", () -> !this.nametags.isEnabled()).enable();
   private final BooleanSetting nametagItemUse = new BooleanSetting(this, "Показывать использование предметов", () -> !this.nametags.isEnabled()).enable();
   private final BooleanSetting nametagBackground = new BooleanSetting(this, "Фон надписей", () -> !this.nametags.isEnabled()).enable();
   private final BooleanSetting hideSelf = new BooleanSetting(this, "Скрывать себя");

   private final SliderSetting maxDistance = new SliderSetting(this, "Макс. дистанция").min(8.0F).max(192.0F).step(1.0F).currentValue(96.0F);
   private final List<Entity> nametagEntities = new ArrayList<>();
   private final Map<Integer, EspAnimationState> worldAnimations = new HashMap<>();
   private final Map<Integer, EspAnimationState> arrowAnimations = new HashMap<>();
   private final Map<Integer, EspAnimationState> nametagAnimations = new HashMap<>();
   private final Map<Integer, EspAnimationState> friendMarkerAnimations = new HashMap<>();


   private final EventListener<Render3DEvent> onRender3D = event -> {
      if (mc.player == null || mc.world == null) {
         return;
      }

      List<EspTarget> renderTargets = this.collectTargets();
      this.renderBoxGlowFlame(event, renderTargets);
      this.renderArrowLines(event, renderTargets);
      this.renderFriendSims(event);
   };
   private final EventListener<PreHudRenderEvent> onPreHud = event -> {
      if (mc.player == null || mc.world == null) {
         return;
      }

      List<EspTarget> renderTargets = this.collectTargets();
      this.renderArrows(event, renderTargets);
      this.renderNametags(event, renderTargets);
      this.renderFriendHeads(event);
   };

    private List<EspTarget> collectTargets() {
       List<EspTarget> renderTargets = new ArrayList<>();

        for (Entity entity : mc.world.getEntities()) {
           EspTarget target = this.classify(entity);
           if (target != null && this.inDistance(entity)) {
              if (entity == mc.player) {
                 if (mc.options.getPerspective().isFirstPerson()) continue;
                 if (this.hideSelf.isEnabled() && (target.type() != EspTargetType.ITEMS || target.itemType() == EspItemType.HELD)) continue;
              }
              renderTargets.add(target);
           }
        }

       return renderTargets;
    }

   private EspAnimationState animationFor(Map<Integer, EspAnimationState> animations, Entity entity) {
      return animations.computeIfAbsent(entity.getId(), id -> new EspAnimationState());
   }

   private void fadeMissingAnimations(Map<Integer, EspAnimationState> animations, Set<Integer> visibleIds) {
      Iterator<Map.Entry<Integer, EspAnimationState>> iterator = animations.entrySet().iterator();

      while (iterator.hasNext()) {
         Map.Entry<Integer, EspAnimationState> entry = iterator.next();
         if (!visibleIds.contains(entry.getKey())) {
            entry.getValue().updateVisible(false);
            if (entry.getValue().hidden()) {
               iterator.remove();
            }
         }
      }
   }

   private void clearEspAnimations() {
      this.worldAnimations.clear();
      this.arrowAnimations.clear();
      this.nametagAnimations.clear();
      this.friendMarkerAnimations.clear();
   }

   private float animatedAlpha(EspAnimationState animation, float alpha) {
      return alpha * animation.visibility();
   }

   private Box scaleBox(Box box, float scale) {
      Vec3d center = box.getCenter();
      double halfX = box.getLengthX() * scale * 0.5D;
      double halfY = box.getLengthY() * scale * 0.5D;
      double halfZ = box.getLengthZ() * scale * 0.5D;
      return new Box(center.x - halfX, center.y - halfY, center.z - halfZ, center.x + halfX, center.y + halfY, center.z + halfZ);
   }

   private EspTarget classify(Entity entity) {
      if (entity == null || entity.isRemoved() || entity.isSpectator()) {
         return null;
      }

      if (entity instanceof PlayerEntity player) {
         return this.classifyPlayer(player);
      }

      if (entity instanceof ItemEntity || entity instanceof ExperienceOrbEntity) {
         return this.items.isSelected() && this.droppedItems.isSelected()
            ? new EspTarget(entity, EspTargetType.ITEMS, null, EspItemType.DROPPED)
            : null;
      }

      if (entity instanceof AnimalEntity) {
         return this.animals.isSelected() ? new EspTarget(entity, EspTargetType.ANIMALS, null, null) : null;
      }

      if (entity instanceof MobEntity) {
         return this.mobs.isSelected() ? new EspTarget(entity, EspTargetType.MOBS, null, null) : null;
      }

      if (entity instanceof LivingEntity living && this.items.isSelected() && this.heldItems.isSelected() && this.hasHeldItem(living)) {
         return new EspTarget(entity, EspTargetType.ITEMS, null, EspItemType.HELD);
      }

      return null;
   }

   private EspTarget classifyPlayer(PlayerEntity player) {
      if (!this.players.isSelected()) {
         return null;
      }

      EspPlayerType kind = this.getPlayerKind(player);
      boolean selected = switch (kind) {
         case LOCAL -> this.local.isSelected();
         case FRIENDS -> this.friends.isSelected();
         case ROCKSTAR_USERS -> this.rockstarUsers.isSelected();
         case OTHERS -> this.others.isSelected();
      };
      if (!selected) {
         if (this.items.isSelected() && this.heldItems.isSelected() && this.hasHeldItem(player)) {
            return new EspTarget(player, EspTargetType.ITEMS, null, EspItemType.HELD);
         }

         return null;
      }

      return new EspTarget(player, EspTargetType.PLAYERS, kind, null);
   }

   private EspPlayerType getPlayerKind(PlayerEntity player) {
      if (player == mc.player) {
         return EspPlayerType.LOCAL;
      }

      if (Rockstar.getInstance().getFriendManager().isFriend(player.getName().getString())) {
         return EspPlayerType.FRIENDS;
      }

      return this.isRockstarUser(player) ? EspPlayerType.ROCKSTAR_USERS : EspPlayerType.OTHERS;
   }

   private boolean isRockstarUser(PlayerEntity player) {
      String name = player.getName().getString();
      return name.startsWith("Rockstar_") || name.startsWith("Rock_");
   }

   private boolean inDistance(Entity entity) {
      if (entity == mc.player) {
         return true;
      }

      float distance = this.maxDistance.getCurrentValue();
      return mc.player.squaredDistanceTo(entity) <= distance * distance;
   }

   private boolean hasHeldItem(LivingEntity living) {
      return !living.getMainHandStack().isEmpty() || !living.getOffHandStack().isEmpty();
   }

   private void renderBoxGlowFlame(Render3DEvent event, List<EspTarget> renderTargets) {
      if (!this.boxes.isEnabled() && !this.glow.isEnabled() && !this.flame.isEnabled()) {
         return;
      }

      MatrixStack matrices = event.getMatrices();
      Camera camera = event.getCamera();
      Vec3d cameraPos = camera.getPos();
      Set<Integer> visibleIds = new HashSet<>();

      RenderUtility.setupRender3D(true);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      BufferBuilder quads = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);

      for (EspTarget target : renderTargets) {
         EspAnimationState animation = this.animationFor(this.worldAnimations, target.entity());
         animation.updateVisible(true);
         visibleIds.add(target.entity().getId());
         Box box = this.scaleBox(this.getRenderBox(target.entity(), event.getTickDelta()), animation.popScale(0.82F, 1.0F))
            .offset(-cameraPos.x, -cameraPos.y, -cameraPos.z);
          if (this.glow.isEnabled()) {
             if (!this.canUseModelChams(target.entity())) {
                this.renderGlow(matrices, quads, box, target, animation);
             }
          }

         if (this.boxes.isEnabled() && (this.boxFill.isSelected() || this.boxGradient.isSelected())) {
            ColorRGBA color = this.getBoxColor(target);
            if (this.boxGradient.isSelected()) {
               this.renderGradientBox(
                  matrices,
                  quads,
                  box,
                  color.withAlpha(this.animatedAlpha(animation, 45.0F)),
                  Colors.getAccent().withAlpha(this.animatedAlpha(animation, 8.0F))
               );
            } else {
               Draw3DUtility.renderFilledBox(matrices, quads, box, color.withAlpha(this.animatedAlpha(animation, 32.0F)));
            }
         }

         if (this.flame.isEnabled()) {
            this.renderFlameGlow(matrices, quads, box, target, animation);
            this.renderFlameBillboards(matrices, quads, box, target, animation);
         }
      }

      RenderUtility.buildBuffer(quads);

      BufferBuilder lines = RenderSystem.renderThreadTesselator().begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
      for (EspTarget target : renderTargets) {
         EspAnimationState animation = this.animationFor(this.worldAnimations, target.entity());
         Box box = this.scaleBox(this.getRenderBox(target.entity(), event.getTickDelta()), animation.popScale(0.82F, 1.0F))
            .offset(-cameraPos.x, -cameraPos.y, -cameraPos.z);
         if (this.boxes.isEnabled() && this.boxOutline.isSelected()) {
            Draw3DUtility.renderOutlinedBox(matrices, lines, box, this.getBoxColor(target).withAlpha(this.animatedAlpha(animation, 205.0F)));
         }

         if (this.flame.isEnabled()) {
            this.renderFlameLines(matrices, lines, box, target, animation);
         }
      }

      RenderUtility.buildBuffer(lines);
      RenderUtility.endRender3D();
      this.fadeMissingAnimations(this.worldAnimations, visibleIds);
   }

   private void renderGlow(MatrixStack matrices, BufferBuilder buffer, Box box, EspTarget target, EspAnimationState animation) {
      ColorRGBA color = this.getGlowColor(target);
      float strength = target.itemType() == EspItemType.DROPPED || target.itemType() == EspItemType.HELD
         ? this.glowStrengthItems.getCurrentValue()
         : this.glowStrength.getCurrentValue();
      float alpha = this.animatedAlpha(animation, MathHelper.clamp(18.0F + strength * 14.0F, 20.0F, 120.0F));
      int layers = Math.max(2, Math.round(strength));

      for (int i = layers; i >= 1; --i) {
         double expand = 0.045D * i * strength;
         float layerAlpha = alpha / (i + 1.5F);
         Draw3DUtility.renderFilledBox(matrices, buffer, box.expand(expand), color.withAlpha(layerAlpha));
      }

      Draw3DUtility.renderFilledBox(matrices, buffer, box.expand(0.015D), color.withAlpha(alpha * 0.38F));
   }

   private void renderFlameGlow(MatrixStack matrices, BufferBuilder buffer, Box box, EspTarget target, EspAnimationState animation) {
      ColorRGBA color = this.getFlameColor(target);
      float strength = this.flameStrength.getCurrentValue();
      float alpha = this.animatedAlpha(animation, 18.0F * this.flameIntensity.getCurrentValue());
      Draw3DUtility.renderFilledBox(matrices, buffer, box.expand(0.05D + strength * 0.02D), color.withAlpha(alpha));
   }

   private void renderFlameBillboards(MatrixStack matrices, BufferBuilder buffer, Box box, EspTarget target, EspAnimationState animation) {
      double time = (System.currentTimeMillis() / 1000.0D) * this.flameRiseSpeed.getCurrentValue() + target.entity().getId() * 0.37D;
      ColorRGBA bottom = this.getFlameColor(target);
      ColorRGBA middle = this.flameGradient.isEnabled() ? bottom.mix(this.getSettingColor(this.flameGradientColor), 0.55F) : bottom;
      ColorRGBA top = this.flameGradient.isEnabled() ? bottom.mix(this.getSettingColor(this.flameGradientColor), 0.92F) : bottom;
      Vec3d center = box.getCenter();
      double radius = Math.max(box.getLengthX(), box.getLengthZ()) * (0.58D + this.flameStrength.getCurrentValue() * 0.055D);
      double flameHeight = box.getLengthY() * (0.72D + this.flameFadeRate.getCurrentValue() * 0.055D);
      double baseY = box.minY + 0.02D;
      float intensity = this.flameIntensity.getCurrentValue();
      Matrix4f matrix = matrices.peek().getPositionMatrix();
      int tongues = 10;

      for (int i = 0; i < tongues; ++i) {
         double angle = time * 0.8D + i * Math.PI * 2.0D / tongues;
         double wave = Math.sin(time * 2.35D + i * 1.7D);
         double wobble = wave * this.flameWobble.getCurrentValue() * 0.08D;
         double x = Math.cos(angle) * (radius + wobble);
         double z = Math.sin(angle) * (radius - wobble);
         double tangentX = -Math.sin(angle);
         double tangentZ = Math.cos(angle);
         double halfWidth = Math.max(0.035D, radius * (0.18D + 0.025D * this.flameStrength.getCurrentValue()));
         double height = flameHeight * (0.78D + (wave + 1.0D) * 0.14D);
         double lean = Math.sin(time * 1.4D + i) * 0.13D;
         Vec3d leftBase = new Vec3d(center.x + x - tangentX * halfWidth, baseY, center.z + z - tangentZ * halfWidth);
         Vec3d rightBase = new Vec3d(center.x + x + tangentX * halfWidth, baseY, center.z + z + tangentZ * halfWidth);
         Vec3d rightTip = new Vec3d(center.x + x * 0.18D + tangentX * halfWidth * 0.22D + lean, baseY + height, center.z + z * 0.18D + tangentZ * halfWidth * 0.22D - lean);
         Vec3d leftTip = new Vec3d(center.x + x * 0.18D - tangentX * halfWidth * 0.22D + lean, baseY + height, center.z + z * 0.18D - tangentZ * halfWidth * 0.22D - lean);
         int baseColor = bottom.withAlpha(this.animatedAlpha(animation, 90.0F * intensity)).getRGB();
         int midColor = middle.withAlpha(this.animatedAlpha(animation, 56.0F * intensity)).getRGB();
         int topColor = top.withAlpha(this.animatedAlpha(animation, 0.0F)).getRGB();
         buffer.vertex(matrix, (float)leftBase.x, (float)leftBase.y, (float)leftBase.z).color(baseColor);
         buffer.vertex(matrix, (float)rightBase.x, (float)rightBase.y, (float)rightBase.z).color(baseColor);
         buffer.vertex(matrix, (float)rightTip.x, (float)rightTip.y, (float)rightTip.z).color(topColor);
         buffer.vertex(matrix, (float)leftTip.x, (float)leftTip.y, (float)leftTip.z).color(midColor);
      }
   }

   private void renderFlameLines(MatrixStack matrices, BufferBuilder lines, Box box, EspTarget target, EspAnimationState animation) {
      double time = (System.currentTimeMillis() / 1000.0D) * this.flameRiseSpeed.getCurrentValue() + target.entity().getId() * 0.31D;
      ColorRGBA bottom = this.getFlameColor(target);
      ColorRGBA top = this.flameGradient.isEnabled() ? bottom.mix(this.getSettingColor(this.flameGradientColor), 0.85F) : bottom;
      Vec3d center = box.getCenter();
      double width = Math.max(box.getLengthX(), box.getLengthZ()) * (0.55D + this.flameStrength.getCurrentValue() * 0.045D);
      double height = box.getLengthY() + this.flameFadeRate.getCurrentValue() * 0.14D;
      int tongues = 12;

      for (int i = 0; i < tongues; ++i) {
         double angle = time + i * Math.PI * 2.0D / tongues;
         double wobble = Math.sin(angle * 2.3D) * this.flameWobble.getCurrentValue() * 0.06D;
         double x = Math.cos(angle) * width + wobble;
         double z = Math.sin(angle) * width - wobble;
         double rise = (Math.sin(time * 1.7D + i) + 1.0D) * 0.12D;
         Vec3d from = new Vec3d(center.x + x, box.minY + 0.02D, center.z + z);
         Vec3d middle = new Vec3d(center.x + x * 0.55D, box.minY + height * (0.45D + rise), center.z + z * 0.55D);
         Vec3d to = new Vec3d(center.x + x * 0.18D, box.minY + height, center.z + z * 0.18D);
         float wave = (float)((Math.sin(time * 3.0D + i) + 1.0D) * 0.5D);
         Draw3DUtility.drawLine(matrices, lines, from, middle, bottom.withAlpha(this.animatedAlpha(animation, 95.0F * this.flameIntensity.getCurrentValue())));
         Draw3DUtility.drawLine(
            matrices,
            lines,
            middle,
            to,
            top.withAlpha(this.animatedAlpha(animation, (35.0F + wave * 65.0F) * this.flameIntensity.getCurrentValue()))
         );
      }
   }

   private void renderArrowLines(Render3DEvent event, List<EspTarget> renderTargets) {
      if (!this.arrows.isEnabled() || !this.arrowLines.isEnabled()) {
         return;
      }

      RenderUtility.setupRender3D(false);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      BufferBuilder builder = RenderSystem.renderThreadTesselator().begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);

      for (EspTarget target : renderTargets) {
         if (this.shouldSkipArrowTarget(target)) {
            continue;
         }

         EspAnimationState animation = this.animationFor(this.arrowAnimations, target.entity());
         animation.updateVisible(true);
         Vec3d pos = Utils.getInterpolatedPos(target.entity(), event.getTickDelta()).add(0.0D, target.entity().getHeight() * 0.5D, 0.0D);
         Draw3DUtility.renderLineFromPlayer(event.getMatrices(), builder, pos, this.getArrowColor(target).withAlpha(this.animatedAlpha(animation, 160.0F)));
      }

      RenderUtility.buildBuffer(builder);
      RenderUtility.endRender3D();
   }

   private void renderFriendSims(Render3DEvent event) {
      if (!this.friendMarkers.isEnabled() || !this.friendSims.isSelected() || mc.world == null) {
         return;
      }

      RenderUtility.setupRender3D(true);
      MatrixStack matrices = event.getMatrices();
      BufferBuilder builder = CrystalRenderer.createBuffer();
      Set<Integer> visibleIds = new HashSet<>();

      for (AbstractClientPlayerEntity player : mc.world.getPlayers()) {
         if (player != mc.player && Rockstar.getInstance().getFriendManager().isFriend(player.getName().getString())) {
            EspAnimationState animation = this.animationFor(this.friendMarkerAnimations, player);
            animation.updateVisible(true);
            visibleIds.add(player.getId());
            matrices.push();
            RenderUtility.prepareMatrices(matrices, Utils.getInterpolatedPos(player, event.getTickDelta()));
            CrystalRenderer.render(
               matrices,
               builder,
               0.0F,
               player.getHeight() + 0.4F,
               0.0F,
               0.1F * animation.popScale(0.6F, 1.0F),
               FRIEND_COLOR.withAlpha(this.animatedAlpha(animation, 255.0F))
            );
            matrices.pop();
         }
      }

      BuiltBuffer built = builder.endNullable();
      if (built != null) {
         BufferRenderer.drawWithGlobalProgram(built);
      }

      RenderUtility.endRender3D();
      this.fadeMissingAnimations(this.friendMarkerAnimations, visibleIds);
   }


    private void renderArrows(PreHudRenderEvent event, List<EspTarget> renderTargets) {
      if (!this.arrows.isEnabled()) {
         return;
      }

      CustomDrawContext context = event.getContext();
      MatrixStack matrices = context.getMatrices();
      float centerX = mc.getWindow().getScaledWidth() / 2.0F;
      float centerY = mc.getWindow().getScaledHeight() / 2.0F;
      float arrowOffset = this.arrowDistance.getCurrentValue() * 10.0F;
      Set<Integer> visibleIds = new HashSet<>();

      RenderSystem.enableBlend();
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
      RenderSystem.disableCull();
      matrices.push();
      matrices.translate(centerX, centerY, 0.0F);

      for (EspTarget target : renderTargets) {
         if (this.shouldSkipArrowTarget(target)) {
            continue;
         }

         Vec3d world = Utils.getInterpolatedPos(target.entity(), event.getTickDelta()).add(0.0D, target.entity().getHeight() * 0.5D, 0.0D);
         Vec2f screen = Utils.worldToScreen(world);
         if (this.isOnScreen(screen)) {
            continue;
         }

         float angle = this.calculateArrowAngle(target.entity(), event.getTickDelta());
         EspAnimationState animation = this.animationFor(this.arrowAnimations, target.entity());
         float visibility = animation.updateVisible(true);
         visibleIds.add(target.entity().getId());
         angle = animation.updateRotation(angle);
         ColorRGBA color = this.getArrowColor(target).withAlpha(230.0F * visibility);
         float arrowScale = animation.popScale(2.0F, 1.0F);
         matrices.push();
         matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(angle));
         matrices.scale(arrowScale, arrowScale, 1.0F);
         context.drawTexture(ARROW_TEXTURE, -10.0F, -10.0F + arrowOffset, 20.0F, 20.0F, color);
         matrices.pop();
      }

      matrices.pop();
      RenderSystem.defaultBlendFunc();
      RenderSystem.setShaderTexture(0, 0);
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
      this.fadeMissingAnimations(this.arrowAnimations, visibleIds);
   }

   private boolean shouldSkipArrowTarget(EspTarget target) {
      if (target.entity() == mc.player) {
         return true;
      }

      if (this.arrowHideNaked.isEnabled() && target.entity() instanceof PlayerEntity player && target.playerType() == EspPlayerType.OTHERS) {
         return this.isNaked(player);
      }

      return false;
   }

   private float calculateArrowAngle(Entity entity, float tickDelta) {
      Vec3d pos = Utils.getInterpolatedPos(entity, tickDelta);
      Vec3d camera = mc.gameRenderer.getCamera().getPos();
      double dx = pos.x - camera.x;
      double dz = pos.z - camera.z;
      return (float)(Math.toDegrees(Math.atan2(dz, dx)) - (mc.gameRenderer.getCamera().getYaw() - 90.0F));
   }

   private boolean isOnScreen(Vec2f screen) {
      return screen != null
         && screen.x >= 4.0F
         && screen.y >= 4.0F
         && screen.x <= mc.getWindow().getScaledWidth() - 4.0F
         && screen.y <= mc.getWindow().getScaledHeight() - 4.0F;
   }

   private void renderNametags(PreHudRenderEvent event, List<EspTarget> renderTargets) {
      if (!this.nametags.isEnabled()) {
         this.nametagEntities.clear();
         this.nametagAnimations.clear();
         return;
      }

      Set<Integer> visibleIds = new HashSet<>();
      this.nametagEntities.clear();
      for (EspTarget target : renderTargets) {
         if (target.entity() instanceof ExperienceOrbEntity) {
            continue;
         }

         this.nametagEntities.add(target.entity());
      }

      List<List<ItemEntity>> itemGroups = this.groupItems();
      for (Entity entity : this.nametagEntities) {
         if (entity instanceof ItemEntity) {
            continue;
         }

         Vec2f screen = this.screenPos(entity, event.getTickDelta());
         if (screen != null) {
            visibleIds.add(entity.getId());
            this.renderEntityNametag(event, entity, screen);
         }
      }

      Set<ItemEntity> groupedItems = new HashSet<>();
      for (List<ItemEntity> group : itemGroups) {
         groupedItems.addAll(group);
         if (!group.isEmpty()) {
            Vec2f screen = this.screenPos(group.getFirst(), event.getTickDelta());
            if (screen != null) {
               visibleIds.add(group.getFirst().getId());
               this.renderItemGroupTag(event, group, screen);
            }
         }
      }

      for (Entity entity : this.nametagEntities) {
         if (entity instanceof ItemEntity item && !groupedItems.contains(item)) {
            Vec2f screen = this.screenPos(entity, event.getTickDelta());
            if (screen != null) {
               visibleIds.add(entity.getId());
               this.renderItemGroupTag(event, List.of(item), screen);
            }
         }
      }

      this.fadeMissingAnimations(this.nametagAnimations, visibleIds);
   }

   private List<List<ItemEntity>> groupItems() {
      List<List<ItemEntity>> groups = new LinkedList<>();
      Set<ItemEntity> processed = new HashSet<>();

      for (Entity entity : this.nametagEntities) {
         if (!(entity instanceof ItemEntity item) || processed.contains(item)) {
            continue;
         }

         List<ItemEntity> group = new LinkedList<>();
         group.add(item);
         processed.add(item);

         for (Entity other : this.nametagEntities) {
            if (other instanceof ItemEntity otherItem && !processed.contains(otherItem) && item.squaredDistanceTo(otherItem) < 1.0D) {
               group.add(otherItem);
               processed.add(otherItem);
            }
         }

         groups.add(group);
      }

      return groups;
   }

   private void renderEntityNametag(PreHudRenderEvent event, Entity entity, Vec2f screen) {
      MatrixStack matrices = event.getContext().getMatrices();
      EspAnimationState animation = this.animationFor(this.nametagAnimations, entity);
      float visibility = animation.updateVisible(true);
      animation.updateScreen(screen.x, screen.y);
      Text text = Nametags.displayName(entity);
      String displayText = text.getString();
      float scale = this.tagScale(entity);
      float textWidth = Fonts.MEDIUM.getFont(11.0F).width(displayText);
      float textHeight = Fonts.MEDIUM.getFont(11.0F).height();
      float x = -textWidth / 2.0F;
      float y = 5.0F;
      matrices.push();
      matrices.translate(animation.screenX(), animation.screenY() - (1.0F - visibility) * 6.0F, 0.0F);
      float animatedScale = scale * animation.popScale(0.72F, 1.0F);
      matrices.scale(animatedScale, animatedScale, 1.0F);

      if (this.nametagBackground.isEnabled()) {
         ColorRGBA background = entity instanceof PlayerEntity player && Rockstar.getInstance().getFriendManager().isFriend(player.getName().getString())
            ? FRIEND_COLOR.withAlpha(105.0F * visibility)
            : ColorRGBA.BLACK.withAlpha(115.0F * visibility);
         event.getContext().drawRect(x - 4.0F, y - 3.0F, textWidth + 8.0F, textHeight + 6.0F, background);
      }

      if (entity instanceof PlayerEntity player && this.nametagArmor.isEnabled()) {
         this.renderArmor(event, player, -14);
      }

      event.getContext().drawText(Fonts.MEDIUM.getFont(11.0F), displayText, x, y, ColorRGBA.WHITE.withAlpha(255.0F * visibility));
      if (entity instanceof LivingEntity living && this.nametagItemUse.isEnabled()) {
         this.renderItemUseBar(event, living, x, y + textHeight + 5.0F, textWidth, visibility);
      }

      matrices.pop();
   }

   private void renderItemGroupTag(PreHudRenderEvent event, List<ItemEntity> group, Vec2f screen) {
      if (group.isEmpty()) {
         return;
      }

      MatrixStack matrices = event.getContext().getMatrices();
      EspAnimationState animation = this.animationFor(this.nametagAnimations, group.getFirst());
      float visibility = animation.updateVisible(true);
      animation.updateScreen(screen.x, screen.y);
      float scale = this.tagScale(group.getFirst());
      int textHeight = (int)Fonts.MEDIUM.getFont(11.0F).height();
      List<String> lines = new ArrayList<>();
      int maxWidth = 0;

      for (ItemEntity item : group) {
         Text text = item.getStack().getName().copy().append(" " + item.getStack().getCount() + "x");
         String line = text.getString();
         lines.add(line);
         maxWidth = Math.max(maxWidth, (int)Fonts.MEDIUM.getFont(11.0F).width(line));
      }

      matrices.push();
      matrices.translate(animation.screenX(), animation.screenY() - (1.0F - visibility) * 6.0F, 0.0F);
      float animatedScale = scale * animation.popScale(0.72F, 1.0F);
      matrices.scale(animatedScale, animatedScale, 1.0F);
      float x = -maxWidth / 2.0F;
      float y = 5.0F;
      float height = lines.size() * textHeight + Math.max(0, lines.size() - 1) * 2.0F;
      if (this.nametagBackground.isEnabled()) {
         event.getContext().drawRect(x - 4.0F, y - 3.0F, maxWidth + 8.0F, height + 6.0F, ColorRGBA.BLACK.withAlpha(115.0F * visibility));
      }

      for (int i = 0; i < lines.size(); ++i) {
         String line = lines.get(i);
         float lineWidth = Fonts.MEDIUM.getFont(11.0F).width(line);
         event.getContext()
            .drawText(Fonts.MEDIUM.getFont(11.0F), line, x + (maxWidth - lineWidth) / 2.0F, y + i * (textHeight + 2.0F), ColorRGBA.WHITE.withAlpha(255.0F * visibility));
      }

      matrices.pop();
   }

   private void renderArmor(PreHudRenderEvent event, PlayerEntity player, int y) {
      List<ItemStack> stacks = new LinkedList<>();
      stacks.add((ItemStack)player.getInventory().armor.get(3));
      stacks.add((ItemStack)player.getInventory().armor.get(2));
      stacks.add((ItemStack)player.getInventory().armor.get(1));
      stacks.add((ItemStack)player.getInventory().armor.get(0));
      stacks.add(player.getMainHandStack());
      stacks.add(player.getOffHandStack());
      stacks.removeIf(ItemStack::isEmpty);

      if (stacks.isEmpty()) {
         return;
      }

      float totalWidth = (stacks.size() - 1) * 18.0F + 16.0F;
      float startX = -totalWidth / 2.0F;
      for (int i = 0; i < stacks.size(); ++i) {
         event.getContext().drawBatchItem(stacks.get(i), (int)(startX + i * 18.0F), y);
      }
   }

   private void renderItemUseBar(PreHudRenderEvent event, LivingEntity living, float x, float y, float width, float alpha) {
      if (!living.isUsingItem()) {
         return;
      }

      float progress = MathHelper.clamp(living.getItemUseTime() / 32.0F, 0.0F, 1.0F);
      event.getContext().drawRect(x, y, width, 2.0F, ColorRGBA.BLACK.withAlpha(120.0F * alpha));
      event.getContext().drawRect(x, y, width * progress, 2.0F, Colors.getAccent().withAlpha(220.0F * alpha));
   }

   private void renderFriendHeads(PreHudRenderEvent event) {
      if (!this.friendMarkers.isEnabled() || !this.friendHeads.isSelected() || mc.world == null) {
         return;
      }

      MatrixStack matrices = event.getContext().getMatrices();
      Set<Integer> visibleIds = new HashSet<>();
      for (AbstractClientPlayerEntity player : mc.world.getPlayers()) {
         if (player == mc.player || !Rockstar.getInstance().getFriendManager().isFriend(player.getName().getString())) {
            continue;
         }

         Vec2f screen = this.screenPos(player, event.getTickDelta());
         if (screen == null) {
            continue;
         }

         EspAnimationState animation = this.animationFor(this.friendMarkerAnimations, player);
         float visibility = animation.updateVisible(true);
         animation.updateScreen(screen.x, screen.y - 24.0F * this.tagScale(player));
         visibleIds.add(player.getId());
         float scale = this.tagScale(player);
         matrices.push();
         matrices.translate(animation.screenX(), animation.screenY() - (1.0F - visibility) * 5.0F, 0.0F);
         float animatedScale = scale * animation.popScale(0.68F, 1.0F);
         matrices.scale(animatedScale, animatedScale, 1.0F);
         event.getContext().drawHead(player, -12.0F, -12.0F, 24.0F, BorderRadius.all(6.0F), ColorRGBA.WHITE.withAlpha(255.0F * visibility));
         matrices.pop();
      }

      this.fadeMissingAnimations(this.friendMarkerAnimations, visibleIds);
   }

   private Vec2f screenPos(Entity entity, float tickDelta) {
      Vec3d pos = Utils.getInterpolatedPos(entity, tickDelta).add(0.0D, entity.getBoundingBox().getLengthY() + 0.5D, 0.0D);
      return Utils.worldToScreen(pos);
   }

   private float tagScale(Entity entity) {
      float distance = entity.distanceTo(mc.player);
      return MathHelper.clamp(1.0F - distance / 20.0F, 0.5F, 1.0F);
   }

   private Box getRenderBox(Entity entity, float tickDelta) {
      double x = MathHelper.lerp(tickDelta, entity.prevX, entity.getX());
      double y = MathHelper.lerp(tickDelta, entity.prevY, entity.getY());
      double z = MathHelper.lerp(tickDelta, entity.prevZ, entity.getZ());
      return entity.getBoundingBox().offset(x - entity.getX(), y - entity.getY(), z - entity.getZ()).expand(0.02D);
   }

   private ColorRGBA getSettingColor(ColorSetting setting) {
      return this.themeSync.isEnabled() ? Colors.getAccent() : setting.getColor();
   }

   private ColorRGBA getBoxColor(EspTarget target) {
      ColorRGBA color = this.getSettingColor(this.boxColor);
      return this.boxGradient.isSelected() ? this.getBaseTargetColor(target).mix(color, 0.35F) : color.mix(this.getBaseTargetColor(target), 0.45F);
   }

   private ColorRGBA getGlowColor(EspTarget target) {
      ColorRGBA color;
      if (target.itemType() == EspItemType.DROPPED || target.itemType() == EspItemType.HELD) {
         color = this.getSettingColor(this.itemColor);
      } else {
         color = this.entityColor.isEnabled() ? this.getBaseTargetColor(target) : this.getSettingColor(this.glowColor);
      }

      if (this.glowGradient.isEnabled()) {
         float pulse = (float)((Math.sin(System.currentTimeMillis() / 450.0D + target.entity().getId()) + 1.0D) * 0.5D);
         color = color.mix(this.getSettingColor(this.glowGradientColor), pulse);
      }

      return color;
   }

   private ColorRGBA getFlameColor(EspTarget target) {
      if (this.flameItemColor.isEnabled() && (target.itemType() == EspItemType.DROPPED || target.itemType() == EspItemType.HELD)) {
         return this.getSettingColor(this.itemColor);
      }

      return this.getSettingColor(this.flameColor);
   }

   private ColorRGBA getArrowColor(EspTarget target) {
      if (target.playerType() == EspPlayerType.FRIENDS) {
         return FRIEND_COLOR;
      }

      return this.getSettingColor(this.arrowColor).mix(this.getBaseTargetColor(target), 0.25F);
   }

   private ColorRGBA getBaseTargetColor(EspTarget target) {
      if (target.playerType() == EspPlayerType.LOCAL) {
         return LOCAL_COLOR;
      }

      if (target.playerType() == EspPlayerType.FRIENDS) {
         return FRIEND_COLOR;
      }

      if (target.playerType() == EspPlayerType.ROCKSTAR_USERS) {
         return Colors.getAccent();
      }

      return switch (target.type()) {
         case PLAYERS -> Colors.getAccent();
         case MOBS -> MOB_COLOR;
         case ANIMALS -> ANIMAL_COLOR;
         case ITEMS -> this.getSettingColor(this.itemColor);
      };
   }

     private boolean canUseModelChams(Entity entity) {
         if (entity == null || mc.player == null || mc.world == null) {
            return false;
         }
         if (!this.isEnabled()) return false;
        EspTarget target = this.classify(entity);
        return target != null && target.type() != EspTargetType.ITEMS && this.inDistance(entity);
     }

    public boolean shouldRenderModelChams(Entity entity) {
       if (!this.glow.isEnabled()) return false;
       if (entity == mc.player && mc.options.getPerspective().isFirstPerson()) return false;
       return this.canUseModelChams(entity);
    }

   public int getModelChamsColor(Entity entity) {
      EspTarget target = this.classify(entity);
      if (target == null) {
         return ColorRGBA.WHITE.withAlpha(255.0F).getRGB();
      }

      return this.getGlowColor(target).withAlpha(220.0F).getRGB();
   }

   public int getModelChamsLight(int original) {
      return this.glow.isEnabled() ? FULL_BRIGHT_LIGHT : original;
   }

   private boolean isNaked(PlayerEntity player) {
      for (ItemStack stack : player.getArmorItems()) {
         if (!stack.isEmpty()) {
            return false;
         }
      }

      return true;
   }

   private void renderGradientBox(MatrixStack matrices, BufferBuilder buffer, Box box, ColorRGBA bottom, ColorRGBA top) {
      float minX = (float)box.minX;
      float minY = (float)box.minY;
      float minZ = (float)box.minZ;
      float maxX = (float)box.maxX;
      float maxY = (float)box.maxY;
      float maxZ = (float)box.maxZ;
      Matrix4f matrix = matrices.peek().getPositionMatrix();
      int bottomColor = bottom.getRGB();
      int topColor = top.getRGB();
      buffer.vertex(matrix, minX, minY, minZ).color(bottomColor);
      buffer.vertex(matrix, maxX, minY, minZ).color(bottomColor);
      buffer.vertex(matrix, maxX, minY, maxZ).color(bottomColor);
      buffer.vertex(matrix, minX, minY, maxZ).color(bottomColor);
      buffer.vertex(matrix, minX, maxY, minZ).color(topColor);
      buffer.vertex(matrix, minX, maxY, maxZ).color(topColor);
      buffer.vertex(matrix, maxX, maxY, maxZ).color(topColor);
      buffer.vertex(matrix, maxX, maxY, minZ).color(topColor);
      buffer.vertex(matrix, minX, minY, maxZ).color(bottomColor);
      buffer.vertex(matrix, maxX, minY, maxZ).color(bottomColor);
      buffer.vertex(matrix, maxX, maxY, maxZ).color(topColor);
      buffer.vertex(matrix, minX, maxY, maxZ).color(topColor);
      buffer.vertex(matrix, minX, minY, minZ).color(bottomColor);
      buffer.vertex(matrix, minX, maxY, minZ).color(topColor);
      buffer.vertex(matrix, maxX, maxY, minZ).color(topColor);
      buffer.vertex(matrix, maxX, minY, minZ).color(bottomColor);
      buffer.vertex(matrix, minX, minY, minZ).color(bottomColor);
      buffer.vertex(matrix, minX, minY, maxZ).color(bottomColor);
      buffer.vertex(matrix, minX, maxY, maxZ).color(topColor);
      buffer.vertex(matrix, minX, maxY, minZ).color(topColor);
      buffer.vertex(matrix, maxX, minY, minZ).color(bottomColor);
      buffer.vertex(matrix, maxX, maxY, minZ).color(topColor);
      buffer.vertex(matrix, maxX, maxY, maxZ).color(topColor);
      buffer.vertex(matrix, maxX, minY, maxZ).color(bottomColor);
   }

   @Override
   public void onDisable() {
      this.nametagEntities.clear();
      this.clearEspAnimations();
   }

   private static class EspScreen extends CustomScreen implements IScaledResolution, IMinecraft {
      private static final float BASE_WIDTH = 447.0F;
      private static final float BASE_HEIGHT = 270.0F;
      private static final float PADDING = 12.0F;
      private static final float ROW_HEIGHT = 18.0F;
      private static final ColorRGBA PANEL_COLOR = new ColorRGBA(45.0F, 7.0F, 7.0F, 170.0F);
      private static final ColorRGBA PANEL_TINT = new ColorRGBA(120.0F, 18.0F, 18.0F, 34.0F);
      private static final ColorRGBA GROUP_COLOR = new ColorRGBA(8.0F, 4.0F, 4.0F, 128.0F);
      private static final ColorRGBA GROUP_HOVER_COLOR = new ColorRGBA(22.0F, 8.0F, 8.0F, 150.0F);
      private final ESP esp;
      private final List<ESP.EspScreen.ClickArea> clickAreas = new ArrayList<>();
      private final List<ESP.EspScreen.SliderArea> sliderAreas = new ArrayList<>();
      private SliderSetting activeSlider = null;
      private float activeSliderTrackX = 0;
      private float activeSliderTrackWidth = 0;
      private final Map<String, Animation> animations = new HashMap<>();
      private final Animation openAnimation = new Animation(220L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
      private EspTargetType targetPage = EspTargetType.PLAYERS;
      private EspPlayerType playerPage = EspPlayerType.OTHERS;
      private EspItemType itemPage = EspItemType.DROPPED;
      private ColorSetting activeColorSetting = null;
      private float pickerX, pickerY;
      private boolean draggingHSB = false;
      private boolean draggingHue = false;
      private static final float PICKER_WIDTH = 130.0F;
      private static final float PICKER_HSB_SIZE = 110.0F;
      private static final float PICKER_PAD = 10.0F;

      private EspScreen(ESP esp) {
         this.esp = esp;
      }

      @Override
      public void render(UIContext context) {
         this.clickAreas.clear();
         this.sliderAreas.clear();
         float screenW = sr.getScaledWidth();
         float screenH = sr.getScaledHeight();
         boolean showPreview = this.targetPage == EspTargetType.PLAYERS;
         float previewWidth = EspPreviewRenderer.ORIGINAL_PLAYER_PREVIEW_WIDTH;
         float width = Math.min(BASE_WIDTH, Math.max(320.0F, screenW - 32.0F));
         float height = Math.min(BASE_HEIGHT, Math.max(230.0F, screenH - 32.0F));
         if (showPreview) {
            width = Math.min(width + previewWidth + PADDING, screenW - 32.0F);
         }
         float x = screenW / 2.0F - width / 2.0F;
         float y = screenH / 2.0F - height / 2.0F;
         float open = this.openAnimation.update(1.0F);
         float scale = 0.94F + open * 0.06F;
         context.drawRect(0.0F, 0.0F, screenW, screenH, ColorRGBA.BLACK.withAlpha(46.0F));
         MatrixStack matrices = context.getMatrices();
         matrices.push();
         matrices.translate(screenW / 2.0F, screenH / 2.0F, 0.0F);
         matrices.scale(scale, scale, 1.0F);
         matrices.translate(-screenW / 2.0F, -screenH / 2.0F + (1.0F - open) * 7.0F, 0.0F);
         context.drawClientRect(x, y, width, height, 1.0F, 0.0F, 7.0F);
         context.drawSquircle(x, y, width, height, 7.0F, BorderRadius.all(10.0F), PANEL_COLOR.withAlpha(170.0F * open));
         context.drawSquircle(x + 1.0F, y + 1.0F, width - 2.0F, height - 2.0F, 7.0F, BorderRadius.all(9.0F), PANEL_TINT.withAlpha(34.0F * open));
         context.drawShadow(x + 2.0F, y + 2.0F, width - 4.0F, height - 4.0F, 18.0F, BorderRadius.all(10.0F), Colors.getAccent().withAlpha(34.0F * open));

         float contentX = x + PADDING;
         float contentWidth = showPreview ? width - PADDING * 3 - previewWidth : width - PADDING * 2;
         float tabY = y + 11.0F;
         this.renderTargetTabs(context, contentX, tabY);
         float bodyY = tabY + 23.0F;

         if (this.targetPage == EspTargetType.PLAYERS) {
            this.renderPlayerTabs(context, contentX, bodyY);
            bodyY += 24.0F;
         } else if (this.targetPage == EspTargetType.ITEMS) {
            this.renderItemTabs(context, contentX, bodyY);
            bodyY += 24.0F;
         }

         this.renderSettings(context, contentX + 6.0F, bodyY + 2.0F, contentWidth - 12.0F);

         if (showPreview) {
            float previewX = x + width - PADDING - previewWidth;
            float previewY = y + PADDING;
            float previewHeight = height - PADDING * 2;
            this.renderPlayerPreviewPanel(context, previewX, previewY, previewWidth, previewHeight, open);
         }

         matrices.pop();
         this.renderColorPicker(context);
      }

      private void renderTargetTabs(UIContext context, float x, float y) {
         float offset = 0.0F;
         offset += this.renderPill(context, x + offset, y, "esp.targets.players", this.targetPage == EspTargetType.PLAYERS, () -> this.selectTarget(EspTargetType.PLAYERS));
         offset += this.renderPill(context, x + offset, y, "esp.targets.mobs", this.targetPage == EspTargetType.MOBS, () -> this.selectTarget(EspTargetType.MOBS));
         offset += this.renderPill(context, x + offset, y, "esp.targets.animals", this.targetPage == EspTargetType.ANIMALS, () -> this.selectTarget(EspTargetType.ANIMALS));
         this.renderPill(context, x + offset, y, "esp.targets.items", this.targetPage == EspTargetType.ITEMS, () -> this.selectTarget(EspTargetType.ITEMS));
      }

      private void renderPlayerTabs(UIContext context, float x, float y) {
         float offset = 0.0F;
         offset += this.renderPill(context, x + offset, y, "esp.targets.players.others", this.playerPage == EspPlayerType.OTHERS, () -> this.selectPlayer(EspPlayerType.OTHERS));
         offset += this.renderPill(context, x + offset, y, "esp.targets.players.local", this.playerPage == EspPlayerType.LOCAL, () -> this.selectPlayer(EspPlayerType.LOCAL));
         offset += this.renderPill(context, x + offset, y, "esp.targets.players.friends", this.playerPage == EspPlayerType.FRIENDS, () -> this.selectPlayer(EspPlayerType.FRIENDS));
         this.renderPill(context, x + offset, y, "esp.targets.players.rockstar_users", this.playerPage == EspPlayerType.ROCKSTAR_USERS, () -> this.selectPlayer(EspPlayerType.ROCKSTAR_USERS));
      }

      private void renderItemTabs(UIContext context, float x, float y) {
         float offset = 0.0F;
         offset += this.renderPill(context, x + offset, y, "esp.targets.items.held", this.itemPage == EspItemType.HELD, () -> this.selectItem(EspItemType.HELD));
         this.renderPill(context, x + offset, y, "esp.targets.items.dropped", this.itemPage == EspItemType.DROPPED, () -> this.selectItem(EspItemType.DROPPED));
      }

      private float renderPill(UIContext context, float x, float y, String key, boolean active, Runnable action) {
         Font font = Fonts.MEDIUM.getFont(8.0F);
         String label = this.translate(key);
         float width = Math.max(28.0F, font.width(label) + 12.0F);
         boolean hovered = this.hovered(context, x, y, width, 16.0F);
         float activeProgress = this.animation("pill-active:" + key, active, 180L);
         float hoverProgress = this.animation("pill-hover:" + key, hovered, 150L);
         ColorRGBA textColor = Colors.getTextColor().withAlpha(172.0F + activeProgress * 83.0F);
         float backgroundAlpha = activeProgress * 178.0F + hoverProgress * (1.0F - activeProgress) * 64.0F;
         if (backgroundAlpha > 1.0F) {
            ColorRGBA background = GROUP_HOVER_COLOR.mix(Colors.getAccent(), activeProgress).withAlpha(backgroundAlpha);
            context.drawSquircle(x, y, width, 16.0F, 7.0F, BorderRadius.all(5.0F), background);
         }

         context.drawText(font, label, x + 6.0F, y + 4.0F, textColor);
         this.clickAreas.add(new ESP.EspScreen.ClickArea(x, y, width, 16.0F, action));
         return width + 7.0F;
      }

      private void renderSettings(UIContext context, float x, float y, float width) {
         float gap = 12.0F;
         float columnWidth = (width - gap) / 2.0F;
         float leftY = y;
         float rightY = y;

         switch (this.targetPage) {
             case PLAYERS -> {
                leftY += this.renderGroup(
                   context,
                   x,
                   leftY,
                   columnWidth,
                   (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.glow", this.esp.glow),
                   (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "theme.sync", this.esp.themeSync),
                   (ctx, gx, gy, gw) -> this.renderColorRow(ctx, gx, gy, gw, "esp.glow.color", this.esp.glowColor),
                   (ctx, gx, gy, gw) -> this.renderSliderRow(ctx, gx, gy, gw, "esp.glow.strength", this.esp.glowStrength)
                ) + 9.0F;
                leftY += this.renderGroup(
                   context,
                   x,
                   leftY,
                   columnWidth,
                   (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.arrows", this.esp.arrows),
                   (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.arrows.hide_naked", this.esp.arrowHideNaked),
                   (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.arrows.lines", this.esp.arrowLines),
                   (ctx, gx, gy, gw) -> this.renderSliderRow(ctx, gx, gy, gw, "esp.arrows.distance", this.esp.arrowDistance),
                   (ctx, gx, gy, gw) -> this.renderColorRow(ctx, gx, gy, gw, "esp.arrows.color", this.esp.arrowColor)
                ) + 9.0F;

                if (this.playerPage == EspPlayerType.FRIENDS) {
                   leftY += this.renderGroup(
                      context,
                      x,
                      leftY,
                      columnWidth,
                      (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.friend_markers", this.esp.friendMarkers),
                      (ctx, gx, gy, gw) -> this.renderModeRow(ctx, gx, gy, gw, "esp.friend_markers.type", this.esp.friendMarkerType)
                   ) + 9.0F;
                } else if (this.playerPage == EspPlayerType.LOCAL) {
                }

                rightY += this.renderGroup(
                   context,
                   x + columnWidth + gap,
                   rightY,
                   columnWidth,
                   (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.nametags", this.esp.nametags),
                   (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.nametags.show_armor", this.esp.nametagArmor),
                   (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.nametags.show_item_use", this.esp.nametagItemUse),
                   (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.nametags.background", this.esp.nametagBackground)
                ) + 9.0F;
                rightY += this.renderGroup(
                   context,
                   x + columnWidth + gap,
                   rightY,
                   columnWidth,
                   (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.boxes", this.esp.boxes),
                   (ctx, gx, gy, gw) -> this.renderModeRow(ctx, gx, gy, gw, "esp.boxes.mode", this.esp.boxMode),
                   (ctx, gx, gy, gw) -> this.renderColorRow(ctx, gx, gy, gw, "esp.boxes.color", this.esp.boxColor)
                ) + 9.0F;
                rightY += this.renderGroup(
                   context,
                   x + columnWidth + gap,
                   rightY,
                   columnWidth,
                   (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.flame", this.esp.flame),
                   (ctx, gx, gy, gw) -> this.renderSliderRow(ctx, gx, gy, gw, "esp.flame.strength", this.esp.flameStrength),
                   (ctx, gx, gy, gw) -> this.renderColorRow(ctx, gx, gy, gw, "esp.flame.color", this.esp.flameColor)
                ) + 9.0F;
             }
            case MOBS, ANIMALS -> {
               this.renderGroup(
                  context,
                  x,
                  leftY,
                  columnWidth,
                  (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.glow", this.esp.glow),
                  (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "theme.sync", this.esp.themeSync),
                  (ctx, gx, gy, gw) -> this.renderColorRow(ctx, gx, gy, gw, "esp.glow.color", this.esp.glowColor),
                  (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.arrows", this.esp.arrows)
               );
               this.renderGroup(
                  context,
                  x + columnWidth + gap,
                  rightY,
                  columnWidth,
                  (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.nametags", this.esp.nametags),
                  (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.boxes", this.esp.boxes),
                  (ctx, gx, gy, gw) -> this.renderModeRow(ctx, gx, gy, gw, "esp.boxes.mode", this.esp.boxMode),
                  (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.flame", this.esp.flame)
               );
            }
            case ITEMS -> {
               this.renderGroup(
                  context,
                  x,
                  leftY,
                  columnWidth,
                  (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.glow", this.esp.glow),
                  (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "theme.sync", this.esp.themeSync),
                  (ctx, gx, gy, gw) -> this.renderColorRow(ctx, gx, gy, gw, "esp.glow.item_color", this.esp.itemColor),
                  (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.arrows", this.esp.arrows)
               );
               this.renderGroup(
                  context,
                  x + columnWidth + gap,
                  rightY,
                  columnWidth,
                  (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.nametags", this.esp.nametags),
                  (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.nametags.background", this.esp.nametagBackground),
                  (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.boxes", this.esp.boxes),
                  (ctx, gx, gy, gw) -> this.renderToggleRow(ctx, gx, gy, gw, "esp.flame", this.esp.flame)
               );
            }
         }
      }

      private float renderGroup(UIContext context, float x, float y, float width, ESP.EspScreen.SettingRenderer... rows) {
         float height = rows.length * ROW_HEIGHT + 4.0F;
         boolean hovered = this.hovered(context, x, y, width, height);
         float hover = this.animation("group:" + x + ":" + y, hovered, 180L);
         context.drawSquircle(x, y, width, height, 7.0F, BorderRadius.all(6.0F), GROUP_COLOR.mix(GROUP_HOVER_COLOR, hover));
         float rowY = y + 2.0F;

         for (ESP.EspScreen.SettingRenderer row : rows) {
            row.render(context, x, rowY, width);
            rowY += ROW_HEIGHT;
         }

         return height;
      }

      private void renderToggleRow(UIContext context, float x, float y, float width, String key, BooleanSetting setting) {
         Font font = Fonts.REGULAR.getFont(8.0F);
         boolean enabled = setting.isEnabled();
         float active = this.animation("toggle:" + key + ":" + System.identityHashCode(setting), enabled, 190L);
         ColorRGBA textColor = Colors.getTextColor().withAlpha(180.0F + active * 75.0F);
         context.drawText(font, this.translate(key), x + 10.0F, y + 5.0F, textColor);
         float switchW = 13.0F;
         float switchH = 8.0F;
         float switchX = x + width - switchW - 10.0F;
         float switchY = y + 5.0F;
         ColorRGBA switchColor = Colors.getAdditionalColor().withAlpha(120.0F).mix(Colors.getAccent(), active);
         context.drawSquircle(switchX, switchY, switchW, switchH, 7.0F, BorderRadius.all(4.0F), switchColor);
         float knobX = switchX + 1.0F + active * (switchW - 8.0F);
         context.drawSquircle(knobX, switchY + 1.0F, 6.0F, 6.0F, 6.0F, BorderRadius.all(3.0F), ColorRGBA.WHITE.withAlpha(235.0F));
         this.clickAreas.add(new ESP.EspScreen.ClickArea(x, y, width, ROW_HEIGHT, setting::toggle));
      }

      private void renderColorRow(UIContext context, float x, float y, float width, String key, ColorSetting setting) {
         Font font = Fonts.REGULAR.getFont(8.0F);
         boolean synced = this.esp.themeSync.isEnabled();
         ColorRGBA color = synced ? Colors.getAccent() : setting.getColor();
         context.drawText(font, this.translate(key), x + 10.0F, y + 5.0F, Colors.getTextColor());
         float swatch = 8.0F;
         float swatchX = x + width - swatch - 13.0F;
         float swatchY = y + 5.0F;
         context.drawSquircle(swatchX - 1.5F, swatchY - 1.5F, swatch + 3.0F, swatch + 3.0F, 6.0F, BorderRadius.all(5.0F), ColorRGBA.BLACK.withAlpha(62.0F));
         context.drawSquircle(swatchX, swatchY, swatch, swatch, 6.0F, BorderRadius.all(4.0F), color);
         this.clickAreas.add(new ESP.EspScreen.ClickArea(x, y, width, ROW_HEIGHT, () -> {
            if (this.esp.themeSync.isEnabled()) {
               this.esp.themeSync.setEnabled(false);
            }
            if (this.activeColorSetting == setting) {
               this.activeColorSetting = null;
            } else {
               this.activeColorSetting = setting;
               this.pickerX = Math.max(0.0F, x + width - PICKER_WIDTH);
               this.pickerY = y + ROW_HEIGHT;
            }
         }));
      }

      private float pickerTotalHeight() {
         return PICKER_PAD + PICKER_HSB_SIZE + 8.0F + 8.0F + 8.0F + 16.0F + PICKER_PAD;
      }

      private float pickerAdjustedY() {
         float y = this.pickerY;
         float totalH = this.pickerTotalHeight();
         if (y + totalH > sr.getScaledHeight() - 16.0F) {
            y = y - totalH - ROW_HEIGHT;
         }
         return y;
      }

      private void renderColorPicker(UIContext context) {
         if (this.activeColorSetting == null) return;
         float x = this.pickerX;
         float y = this.pickerAdjustedY();
         float w = PICKER_WIDTH;
         float hsbSize = PICKER_HSB_SIZE;
         float pad = PICKER_PAD;
         float hueH = 8.0F;
         float gap = 8.0F;
         float totalH = this.pickerTotalHeight();
         ColorRGBA current = this.activeColorSetting.getColor();
         float hue = current.getHue();
         float sat = current.getSaturation();
         float bri = current.getBrightness();

         context.drawSquircle(x, y, w, totalH, 7.0F, BorderRadius.all(8.0F), new ColorRGBA(20.0F, 20.0F, 20.0F, 210.0F));
         context.drawSquircle(x + 1.0F, y + 1.0F, w - 2.0F, totalH - 2.0F, 7.0F, BorderRadius.all(7.0F), new ColorRGBA(30.0F, 30.0F, 30.0F, 230.0F));

         float hsbX = x + pad;
         float hsbY = y + pad;
         float hsbW = hsbSize;
         float hsbH = hsbSize;
         DrawContext dc = context;
         for (int col = 0; col < (int)hsbW; col += 2) {
            float s = col / hsbW;
            int cTop = ColorRGBA.fromHSB(hue, s, 1.0F).getRGB();
            int cBot = ColorRGBA.fromHSB(hue, s, 0.0F).getRGB();
            dc.fillGradient((int)hsbX + col, (int)hsbY, (int)hsbX + col + 2, (int)(hsbY + hsbH), cTop, cBot);
         }
         float cx = hsbX + sat * hsbW;
         float cy = hsbY + (1.0F - bri) * hsbH;
         dc.fill((int)cx - 2, (int)cy - 2, (int)cx + 3, (int)cy + 3, ColorRGBA.WHITE.withAlpha(200.0F).getRGB());

         float hueX = x + pad;
         float hueY = y + pad + hsbSize + gap;
         float hueW = w - pad * 2;
         for (int col = 0; col < (int)hueW; col += 2) {
            float h = col / hueW;
            int c = ColorRGBA.fromHSB(h, 1.0F, 1.0F).getRGB();
            dc.fill((int)hueX + col, (int)hueY, (int)hueX + col + 2, (int)(hueY + hueH), c);
         }
         float hx = hueX + hue * hueW;
         dc.fill((int)hx - 2, (int)hueY - 2, (int)hx + 3, (int)(hueY + hueH + 2), ColorRGBA.WHITE.withAlpha(200.0F).getRGB());

         float prevX = x + pad;
         float prevY = y + pad + hsbSize + gap + hueH + gap;
         float prevSize = 16.0F;
         dc.fill((int)prevX, (int)prevY, (int)(prevX + prevSize), (int)(prevY + prevSize), current.getRGB());
         String hex = current.toHex();
         Font hexFont = Fonts.REGULAR.getFont(7.0F);
         context.drawText(hexFont, hex, prevX + prevSize + 6.0F, prevY + 5.0F, Colors.getTextColor().withAlpha(180.0F));
      }

      private void renderModeRow(UIContext context, float x, float y, float width, String key, ModeSetting setting) {
         Font font = Fonts.REGULAR.getFont(8.0F);
         Font valueFont = Fonts.REGULAR.getFont(7.0F);
         String value = setting.getValue() == null ? "" : this.translate(setting.getValue().getName());
         context.drawText(font, this.translate(key), x + 10.0F, y + 5.0F, Colors.getTextColor());
         float valueWidth = valueFont.width(value);
         context.drawText(valueFont, value, x + width - valueWidth - 10.0F, y + 5.5F, Colors.getTextColor().withAlpha(170.0F));
         this.clickAreas.add(new ESP.EspScreen.ClickArea(x, y, width, ROW_HEIGHT, () -> this.cycleMode(setting)));
      }

       private void renderModeRow(UIContext context, float x, float y, float width, String key, SelectSetting setting) {
          Font font = Fonts.REGULAR.getFont(8.0F);
          Font valueFont = Fonts.REGULAR.getFont(7.0F);
          String value = setting.getSelectedValues().isEmpty() ? "" : this.translate(setting.getSelectedValues().getFirst().getName());
          context.drawText(font, this.translate(key), x + 10.0F, y + 5.0F, Colors.getTextColor());
          float valueWidth = valueFont.width(value);
          context.drawText(valueFont, value, x + width - valueWidth - 10.0F, y + 5.5F, Colors.getTextColor().withAlpha(170.0F));
          this.clickAreas.add(new ESP.EspScreen.ClickArea(x, y, width, ROW_HEIGHT, () -> this.cycleSelect(setting)));
       }

       private void renderSliderRow(UIContext context, float x, float y, float width, String key, SliderSetting setting) {
          Font font = Fonts.REGULAR.getFont(8.0F);
          Font valueFont = Fonts.REGULAR.getFont(7.0F);
          context.drawText(font, this.translate(key), x + 10.0F, y + 3.0F, Colors.getTextColor());
          String value = String.format("%.1f", setting.getCurrentValue());
          float valueWidth = valueFont.width(value);
          context.drawText(valueFont, value, x + width - valueWidth - 10.0F, y + 3.5F, Colors.getTextColor().withAlpha(170.0F));
          float trackX = x + 10.0F;
          float trackY = y + 13.0F;
          float trackWidth = width - 20.0F;
          float trackHeight = 2.0F;
          context.drawSquircle(trackX, trackY, trackWidth, trackHeight, 1.0F, BorderRadius.all(1.0F), Colors.getAdditionalColor().withAlpha(80.0F));
          float progress = (setting.getCurrentValue() - setting.getMin()) / (setting.getMax() - setting.getMin());
          float filledWidth = Math.max(trackHeight, trackWidth * progress);
          context.drawSquircle(trackX, trackY, filledWidth, trackHeight, 1.0F, BorderRadius.all(1.0F), Colors.getAccent().withAlpha(180.0F));
          float knobRadius = 4.0F;
          float knobX = trackX + trackWidth * progress - knobRadius;
          float knobY = trackY - knobRadius + trackHeight / 2.0F;
          context.drawSquircle(knobX, knobY, knobRadius * 2.0F, knobRadius * 2.0F, knobRadius, BorderRadius.all(knobRadius), ColorRGBA.WHITE.withAlpha(235.0F));
          this.sliderAreas.add(new ESP.EspScreen.SliderArea(trackX - knobRadius, trackY - knobRadius, trackWidth + knobRadius * 2, knobRadius * 2 + trackHeight, setting, trackX, trackWidth));
       }

      private void renderPlayerPreviewPanel(UIContext context, float x, float y, float width, float height, float open) {
         if (mc.player == null) {
            return;
         }

         context.drawSquircle(x, y, width, height, 7.0F, BorderRadius.all(10.0F), PANEL_COLOR.withAlpha(170.0F * open));
         context.drawSquircle(x + 1.0F, y + 1.0F, width - 2.0F, height - 2.0F, 7.0F, BorderRadius.all(9.0F), PANEL_TINT.withAlpha(34.0F * open));
         context.drawShadow(x + 2.0F, y + 2.0F, width - 4.0F, height - 4.0F, 18.0F, BorderRadius.all(10.0F), Colors.getAccent().withAlpha(34.0F * open));

         EspPreviewRenderer.drawPlayer(
            context,
            mc.player,
            x,
            y,
            width,
            height,
            this.esp.getSettingColor(this.esp.glowColor),
            this.esp.getBoxColor(new EspTarget(mc.player, EspTargetType.PLAYERS, this.playerPage, null)),
            this.esp.getSettingColor(this.esp.arrowColor),
            ARROW_TEXTURE,
            this.esp.glow.isEnabled(),
            this.esp.boxes.isEnabled(),
            this.esp.nametags.isEnabled(),
            this.esp.arrows.isEnabled()
         );
      }

      private void cycleMode(ModeSetting setting) {
         if (setting.getValues().isEmpty()) {
            return;
         }

         int index = setting.getValues().indexOf(setting.getValue());
         setting.getValues().get((index + 1) % setting.getValues().size()).select();
      }

      private void cycleSelect(SelectSetting setting) {
         if (setting.getValues().isEmpty()) {
            return;
         }

         int index = setting.getSelectedValues().isEmpty() ? -1 : setting.getValues().indexOf(setting.getSelectedValues().getFirst());
         setting.getSelectedValues().clear();
         setting.getValues().get((index + 1) % setting.getValues().size()).select();
      }

      private void selectTarget(EspTargetType kind) {
         this.targetPage = kind;
         this.targetValue(kind).select();
      }

      private void selectPlayer(EspPlayerType kind) {
         this.playerPage = kind;
         this.esp.players.select();
         this.playerValue(kind).select();
      }

      private void selectItem(EspItemType kind) {
         this.itemPage = kind;
         this.esp.items.select();
         this.itemValue(kind).select();
      }

      private SelectSetting.Value targetValue(EspTargetType kind) {
         return switch (kind) {
            case PLAYERS -> this.esp.players;
            case MOBS -> this.esp.mobs;
            case ANIMALS -> this.esp.animals;
            case ITEMS -> this.esp.items;
         };
      }

      private SelectSetting.Value playerValue(EspPlayerType kind) {
         return switch (kind) {
            case OTHERS -> this.esp.others;
            case LOCAL -> this.esp.local;
            case FRIENDS -> this.esp.friends;
            case ROCKSTAR_USERS -> this.esp.rockstarUsers;
         };
      }

      private SelectSetting.Value itemValue(EspItemType kind) {
         return switch (kind) {
            case HELD -> this.esp.heldItems;
            case DROPPED -> this.esp.droppedItems;
         };
      }

      private boolean hovered(UIContext context, float x, float y, float width, float height) {
         return context.getMouseX() >= x && context.getMouseX() <= x + width && context.getMouseY() >= y && context.getMouseY() <= y + height;
      }

      private float animation(String key, boolean active, long duration) {
         Animation animation = this.animations.computeIfAbsent(key, ignored -> new Animation(duration, active ? 1.0F : 0.0F, Easing.FIGMA_EASE_IN_OUT));
         return animation.update(active ? 1.0F : 0.0F);
      }

      private String translate(String key) {
         return Localizator.translate(key);
      }

      @Override
      public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
         if (button != MouseButton.LEFT) {
            return;
         }

         if (this.activeColorSetting != null) {
            float px = this.pickerX;
            float py = this.pickerAdjustedY();
            float pw = PICKER_WIDTH;
            float ph = this.pickerTotalHeight();
            if (mouseX >= px && mouseX <= px + pw && mouseY >= py && mouseY <= py + ph) {
               float hsbX = px + PICKER_PAD;
               float hsbY = py + PICKER_PAD;
               float hsbS = PICKER_HSB_SIZE;
               if (mouseX >= hsbX && mouseX <= hsbX + hsbS && mouseY >= hsbY && mouseY <= hsbY + hsbS) {
                  this.draggingHSB = true;
                  float sat = (float)MathHelper.clamp((mouseX - hsbX) / hsbS, 0.0, 1.0);
                  float bri = 1.0F - (float)MathHelper.clamp((mouseY - hsbY) / hsbS, 0.0, 1.0);
                  float hue = this.activeColorSetting.getColor().getHue();
                  this.activeColorSetting.setColor(ColorRGBA.fromHSB(hue, sat, bri));
                  return;
               }
               float hueX = px + PICKER_PAD;
               float hueY = py + PICKER_PAD + hsbS + 8.0F;
               float hueW = pw - PICKER_PAD * 2;
               if (mouseX >= hueX && mouseX <= hueX + hueW && mouseY >= hueY && mouseY <= hueY + 8.0F) {
                  this.draggingHue = true;
                  float hue = (float)MathHelper.clamp((mouseX - hueX) / hueW, 0.0, 1.0);
                  float sat = this.activeColorSetting.getColor().getSaturation();
                  float bri = this.activeColorSetting.getColor().getBrightness();
                  this.activeColorSetting.setColor(ColorRGBA.fromHSB(hue, sat, bri));
                  return;
               }
               this.activeColorSetting = null;
               this.draggingHSB = false;
               this.draggingHue = false;
               return;
            }
            this.activeColorSetting = null;
         }

         for (int i = this.sliderAreas.size() - 1; i >= 0; --i) {
            ESP.EspScreen.SliderArea area = this.sliderAreas.get(i);
            if (area.contains(mouseX, mouseY)) {
               this.activeSlider = area.setting();
               this.activeSliderTrackX = area.trackX();
               this.activeSliderTrackWidth = area.trackWidth();
               float progress = (float) MathHelper.clamp((mouseX - area.trackX()) / area.trackWidth(), 0.0, 1.0);
               float value = area.setting().getMin() + progress * (area.setting().getMax() - area.setting().getMin());
               area.setting().setCurrentValue(value);
               return;
            }
         }

         for (int i = this.clickAreas.size() - 1; i >= 0; --i) {
            ESP.EspScreen.ClickArea area = this.clickAreas.get(i);
            if (area.contains(mouseX, mouseY)) {
               area.action().run();
               return;
            }
         }
      }

      @Override
      public void onMouseDragged(double mouseX, double mouseY, MouseButton button, double deltaX, double deltaY) {
         if (button != MouseButton.LEFT) return;
         if (this.draggingHSB && this.activeColorSetting != null) {
            float px = this.pickerX;
            float py = this.pickerAdjustedY();
            float hsbX = px + PICKER_PAD;
            float hsbY = py + PICKER_PAD;
            float hsbS = PICKER_HSB_SIZE;
            float sat = (float)MathHelper.clamp((mouseX - hsbX) / hsbS, 0.0, 1.0);
            float bri = 1.0F - (float)MathHelper.clamp((mouseY - hsbY) / hsbS, 0.0, 1.0);
            float hue = this.activeColorSetting.getColor().getHue();
            this.activeColorSetting.setColor(ColorRGBA.fromHSB(hue, sat, bri));
            return;
         }
         if (this.draggingHue && this.activeColorSetting != null) {
            float hueX = this.pickerX + PICKER_PAD;
            float hueW = PICKER_WIDTH - PICKER_PAD * 2;
            float hue = (float)MathHelper.clamp((mouseX - hueX) / hueW, 0.0, 1.0);
            float sat = this.activeColorSetting.getColor().getSaturation();
            float bri = this.activeColorSetting.getColor().getBrightness();
            this.activeColorSetting.setColor(ColorRGBA.fromHSB(hue, sat, bri));
            return;
         }
         if (this.activeSlider != null) {
            float progress = (float) MathHelper.clamp((mouseX - this.activeSliderTrackX) / this.activeSliderTrackWidth, 0.0, 1.0);
            float value = this.activeSlider.getMin() + progress * (this.activeSlider.getMax() - this.activeSlider.getMin());
            this.activeSlider.setCurrentValue(value);
         }
      }

      @Override
      public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
         this.draggingHSB = false;
         this.draggingHue = false;
         if (button == MouseButton.LEFT) {
            this.activeSlider = null;
         }
      }

      @Override
      public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
         if (keyCode == 256) {
            this.close();
            return true;
         }

         return super.keyPressed(keyCode, scanCode, modifiers);
      }

      @Override
      public void close() {
         super.close();
         mc.setScreen(Rockstar.getInstance().getMenuScreen());
      }

      @Override
      public boolean shouldPause() {
         return false;
      }

      @Override
      public void renderBackground(DrawContext context, int mouseX, int mouseY, float delta) {
      }

      @FunctionalInterface
      private interface SettingRenderer {
         void render(UIContext context, float x, float y, float width);
      }

       private record ClickArea(float x, float y, float width, float height, Runnable action) {
          private boolean contains(double mouseX, double mouseY) {
             return mouseX >= this.x && mouseX <= this.x + this.width && mouseY >= this.y && mouseY <= this.y + this.height;
          }
       }

       private record SliderArea(float x, float y, float width, float height, SliderSetting setting, float trackX, float trackWidth) {
          private boolean contains(double mouseX, double mouseY) {
             return mouseX >= this.x && mouseX <= this.x + this.width && mouseY >= this.y && mouseY <= this.y + this.height;
          }
       }
   }
}
