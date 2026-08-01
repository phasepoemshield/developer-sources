package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.client.OptimizedUpdateEvent;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.client.tweaks.crosshair.DrawContextFloatDrawTexture;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.globals.GlobalsManager;
import fun.nexisdlc.client.utils.globals.GlobalsMember;
import fun.nexisdlc.client.utils.globals.GlobalsParty;
import fun.nexisdlc.client.utils.math.ProjectionUtil;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.client.utils.render.animations.DecelerateAnimation;
import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.client.utils.render.gif.GifTexture;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.client.utils.render.main.text.TextRenderer;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeListSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@FunctionAdd(name = "NameTags", alias = "Name Tags", category = Category.Render, description = "Улучшенные неймтеги над игроками с инвентарём")
public class NameTags extends Function {
    private static final String CULLING_OWNER = "NameTags";
    private static final Pattern AMPERSAND_COLOR_PATTERN = Pattern.compile("&(?:[0-9A-FK-ORa-fk-or]|#[0-9A-Fa-f]{6})");
    private static final Pattern SECTION_COLOR_PATTERN = Pattern.compile("\u00A7(?:[0-9A-FK-ORa-fk-or]|x(?:\u00A7[0-9A-Fa-f]){6})");

    private final Map<Integer, CustomPlayer> trackedPlayers = new HashMap<>();

    ModeListSetting modeList = new ModeListSetting("Отображать на",
            new BooleanSetting("Игроках", true),
            new BooleanSetting("Мобах", true),
            new BooleanSetting("Предметах", true));

    BooleanSetting entArmor = new BooleanSetting("Броня", true)
            .setVisible(() -> modeList.getByName("Игроках").get());

    BooleanSetting showDistance = new BooleanSetting("Показывать дистанцию", false);

    SliderSetting rounding = new SliderSetting("Скругление", 0f, 0f, 10f, 0.5f);
    SliderSetting size = new SliderSetting("Размер", 100f, 75f, 125f, 1f);

    BooleanSetting playerHead = new BooleanSetting("Голова игрока", false)
            .setVisible(() -> modeList.getByName("Игроках").get());

    public NameTags() {
        addSettings(modeList, entArmor, playerHead, showDistance, rounding, size);
    }

    public record CustomPlayer(PlayerEntity player, DecelerateAnimation animation) {
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    @EventHandler
    public void onClientTick(OptimizedUpdateEvent event) {
        if (mc.world == null) {
            trackedPlayers.clear();
            return;
        }

        trackedPlayers.entrySet().removeIf(entry -> {
            CustomPlayer cp = entry.getValue();
            return cp == null || cp.player() == null || cp.player().isRemoved() || cp.animation().isFinished();
        });

        for (CustomPlayer cp : trackedPlayers.values()) {
            PlayerEntity p = cp.player();
            p.lastX = p.getX();
            p.lastY = p.getY();
            p.lastZ = p.getZ();
        }

        mc.world.getPlayers().forEach(player -> {
            if (player.isRemoved() || !player.isAlive()) {
                return;
            }

            trackedPlayers.compute(player.getId(), (id, existing) -> {
                if (existing != null) {
                    return existing.player() == player ? existing : new CustomPlayer(player, existing.animation());
                }
                var anim = new DecelerateAnimation()
                        .setDuration(200)
                        .setTarget(1f)
                        .setDirection(DecelerateAnimation.Direction.FORWARDS);
                return new CustomPlayer(player, anim);
            });
        });
    }

    @EventHandler
    public void renderHud(EventRender.Screen.UnderHud event) {
        if (nullCheck() || mc.options.hudHidden) return;
        renderNameTag(event.getRenderer());
    }

    void renderNameTag(Renderer2D render) {
        final int screenW = mc.getWindow().getWidth();
        final int screenH = mc.getWindow().getHeight();
        float tickDelta = mc.getRenderTickCounter().getTickProgress(true);
        List<DeferredItemDraw> deferredItems = new ArrayList<>();

        if (modeList.getByName("Игроках").get()) {
            for (CustomPlayer cp : trackedPlayers.values()) {
                PlayerEntity player = cp.player();
                if (player == null || player.isRemoved()) continue;

                boolean isSelf = player == mc.player;
                if (isSelf && mc.options.getPerspective().isFirstPerson()) {
                    continue;
                }

                double interpX = MathHelper.lerp((double) tickDelta, player.lastX, player.getX());
                double interpY = MathHelper.lerp((double) tickDelta, player.lastY, player.getY()) + player.getHeight() * 1.25f;
                double interpZ = MathHelper.lerp((double) tickDelta, player.lastZ, player.getZ());

                var screenPos = ProjectionUtil.toScreen(interpX, interpY, interpZ);

                if (screenPos.z < 0 ||
                        screenPos.x < 0 || screenPos.x > screenW ||
                        screenPos.y < 0 || screenPos.y > screenH) {
                    continue;
                }

                Text name = getTextPlayer(player, false);
                boolean partyMember = GlobalsManager.getInstance().getSiteLoginByMinecraftName(player.getName().getString()) != null;

                float scale = getTagScale();
                var font = FontRegistry.SF_SEMIBOLD;
                float fontSize = 18f * getTagSizeMultiplier();

                var metrics = getAdjustedTagMetrics(render, font, name, fontSize, false);
                float textWidth = metrics.width();
                float textHeight = metrics.height();

                float paddingX = 4f;
                float paddingY = 2f;
                boolean drawPlayerHead = !partyMember && playerHead.get() && player instanceof AbstractClientPlayerEntity;
                float playerHeadSize = drawPlayerHead || partyMember ? Math.max(10f, textHeight - 1f) : 0f;
                float playerHeadSpacing = drawPlayerHead || partyMember ? 4f : 0f;
                float bgWidth = textWidth + paddingX * 2 + playerHeadSize + playerHeadSpacing;
                float bgHeight = textHeight + paddingY * 2;

                render.pushTranslation((float) screenPos.x, (float) screenPos.y);
                render.pushScale(scale, scale);
                render.pushCullingOwner(CULLING_OWNER);
                try {
                    render.rect(-bgWidth / 2, -bgHeight, bgWidth, bgHeight, getTagRounding(), new Color(0, 0, 0, 130).getRGB());
                    float textX = -bgWidth / 2 + paddingX + playerHeadSize + playerHeadSpacing;
                    if (partyMember) {
                        Identifier frame = getGlobalsAvatarFrame();
                        float headX = -bgWidth / 2 + paddingX;
                        float headY = -bgHeight + Math.max(1f, (bgHeight - playerHeadSize) / 2f);
                        if (frame != null) {
                            render.drawTextureRounded(frame, headX, headY, playerHeadSize, playerHeadSize, 0xFFFFFFFF, 6f);
                        } else {
                            render.rect(headX, headY, playerHeadSize, playerHeadSize, 6f, new Color(46, 204, 113, 160).getRGB());
                        }
                    } else if (drawPlayerHead) {
                        float headX = -bgWidth / 2 + paddingX;
                        float headY = -bgHeight + Math.max(1f, (bgHeight - playerHeadSize) / 2f);
                        renderPlayerHead(render, (AbstractClientPlayerEntity) player, headX, headY, playerHeadSize);
                    }
                    render.text(font, textX, centeredTextBaseline(-bgHeight, bgHeight, font, fontSize), fontSize, name, -1);
                    if (entArmor.get()) {
                        renderPlayerItems(render, deferredItems, player, bgHeight);
                    }
                } finally {
                    render.popCullingOwner();
                }

                render.popTransform();
                render.popTransform();

                double feetY = MathHelper.lerp((double) tickDelta, player.lastY, player.getY()) + 0.1f;
                var feetPos = ProjectionUtil.toScreen(interpX, feetY, interpZ);
                if (!(feetPos.z < 0 ||
                        feetPos.x < 0 || feetPos.x > screenW ||
                        feetPos.y < 0 || feetPos.y > screenH)) {
                    renderOffhandTag(render, player, font, fontSize, scale, (float) feetPos.x, (float) feetPos.y);
                }
            }
        }

        renderGlobalsMemberNameTags(render, screenW, screenH);

        for (Entity entity : mc.world.getEntities()) {
            if (entity instanceof net.minecraft.entity.decoration.ArmorStandEntity ||
                    entity instanceof net.minecraft.entity.vehicle.BoatEntity) continue;

            if (entity == mc.player && mc.options.getPerspective().isFirstPerson()) continue;

            if (mc.player.distanceTo(entity) > 120) continue;

            if (shouldRender(entity) && !(entity instanceof PlayerEntity)) {
                double x = MathHelper.lerp((double) tickDelta, entity.lastX, entity.getX());
                double y = MathHelper.lerp((double) tickDelta, entity.lastY, entity.getY()) + (entity.getHeight() * 1.25f);
                double z = MathHelper.lerp((double) tickDelta, entity.lastZ, entity.getZ());

                var screenPos = ProjectionUtil.toScreen(x, y, z);

                if (screenPos.z < 0 ||
                        screenPos.x < 0 || screenPos.x > screenW ||
                        screenPos.y < 0 || screenPos.y > screenH) continue;

                Text displayName = getEntityName(entity);

                boolean itemTag = entity instanceof ItemEntity;
                float scale = getTagScale();
                var font = FontRegistry.SF_SEMIBOLD;
                float fontSize = 18f * getTagSizeMultiplier();
                if (itemTag && entity instanceof ItemEntity item) {
                    Text itemName = item.getStack().getName();
                    String rawDisplayName = itemName.getString();
                    boolean hasLiteralColorCodes = rawDisplayName != null && !rawDisplayName.isEmpty()
                            && (AMPERSAND_COLOR_PATTERN.matcher(rawDisplayName).find()
                            || SECTION_COLOR_PATTERN.matcher(rawDisplayName).find());
                    boolean hasStyledColor = itemName.getStyle().getColor() != null;
                    if (!hasStyledColor) {
                        for (Text part : itemName.getSiblings()) {
                            if (part.getStyle().getColor() != null) {
                                hasStyledColor = true;
                                break;
                            }
                        }
                    }
                    if (hasLiteralColorCodes || hasStyledColor) {
                        fontSize *= 1.25f;
                    }
                }

                var metrics = getAdjustedTagMetrics(render, font, displayName, fontSize, itemTag);
                float textWidth = metrics.width();
                float textHeight = metrics.height();

                float paddingX = 4f;
                float paddingY = 2f;
                float bgWidth = textWidth + paddingX * 2;
                float bgHeight = textHeight + paddingY * 2;

                render.pushTranslation((float) screenPos.x, (float) screenPos.y);
                render.pushScale(scale, scale);
                render.pushCullingOwner(CULLING_OWNER);
                try {
                    render.rect(-bgWidth / 2, -bgHeight, bgWidth, bgHeight, getTagRounding(), new Color(0, 0, 0, 180).getRGB());
                    render.text(font, -textWidth / 2, centeredTextBaseline(-bgHeight, bgHeight, font, fontSize), fontSize, displayName, -1);
                    if (itemTag && entity instanceof ItemEntity item) {
                        ItemStack itemStack = item.getStack();
                        float itemSize = 24f;
                        float itemY = -bgHeight - itemSize - 6f;
                        queueItem(render, deferredItems, itemStack, -itemSize / 2f, itemY, itemSize, true);
                    }
                } finally {
                    render.popCullingOwner();
                }

                render.popTransform();
                render.popTransform();
            }
        }

        render.flush();
        renderDeferredItems(render, deferredItems);
    }

    private void renderGlobalsMemberNameTags(Renderer2D render, int screenW, int screenH) {
        GlobalsParty party = GlobalsManager.getInstance().getParty();
        if (party == null || mc.player == null || mc.world == null) {
            return;
        }

        String selfName = mc.player.getName().getString();
        String worldKey = mc.world.getRegistryKey().getValue().toString();
        for (GlobalsMember member : party.members()) {
            if (!shouldRenderGlobalsMember(member, worldKey, selfName)) {
                continue;
            }

            var screenPos = ProjectionUtil.toScreen(member.x(), member.y() + 2.25f, member.z());
            if (screenPos.z < 0 ||
                    screenPos.x < 0 || screenPos.x > screenW ||
                    screenPos.y < 0 || screenPos.y > screenH) {
                continue;
            }

            Text name = getTextGlobalsMember(member);
            float scale = getTagScale();
            var font = FontRegistry.SF_SEMIBOLD;
            float fontSize = 18f * getTagSizeMultiplier();

            var metrics = getAdjustedTagMetrics(render, font, name, fontSize, false);
            float textWidth = metrics.width();
            float textHeight = metrics.height();

            float paddingX = 4f;
            float paddingY = 2f;
            float playerHeadSize = Math.max(10f, textHeight - 1f);
            float playerHeadSpacing = 4f;
            float bgWidth = textWidth + paddingX * 2 + playerHeadSize + playerHeadSpacing;
            float bgHeight = textHeight + paddingY * 2;

            render.pushTranslation((float) screenPos.x, (float) screenPos.y);
            render.pushScale(scale, scale);
            render.pushCullingOwner(CULLING_OWNER);
            try {
                render.rect(-bgWidth / 2, -bgHeight, bgWidth, bgHeight, getTagRounding(), new Color(0, 0, 0, 130).getRGB());
                Identifier frame = getGlobalsAvatarFrame();
                float headX = -bgWidth / 2 + paddingX;
                float headY = -bgHeight + Math.max(1f, (bgHeight - playerHeadSize) / 2f);
                if (frame != null) {
                    render.drawTextureRounded(frame, headX, headY, playerHeadSize, playerHeadSize, 0xFFFFFFFF, 6f);
                } else {
                    render.rect(headX, headY, playerHeadSize, playerHeadSize, 6f, new Color(46, 204, 113, 160).getRGB());
                }
                float textX = -bgWidth / 2 + paddingX + playerHeadSize + playerHeadSpacing;
                render.text(font, textX, centeredTextBaseline(-bgHeight, bgHeight, font, fontSize), fontSize, name, -1);
            } finally {
                render.popCullingOwner();
            }

            render.popTransform();
            render.popTransform();
        }
    }

    private boolean shouldRenderGlobalsMember(GlobalsMember member, String worldKey, String selfName) {
        if (member == null || !member.online()) {
            return false;
        }
        if (member.worldKey() == null || !member.worldKey().equals(worldKey)) {
            return false;
        }
        String minecraftName = member.minecraftName();
        if (minecraftName != null && minecraftName.equalsIgnoreCase(selfName)) {
            return false;
        }
        return !isLoadedPlayer(minecraftName);
    }

    private boolean isLoadedPlayer(String minecraftName) {
        if (minecraftName == null || minecraftName.isBlank() || mc.world == null) {
            return false;
        }
        for (PlayerEntity player : mc.world.getPlayers()) {
            if (player != null && player.getName().getString().equalsIgnoreCase(minecraftName)) {
                return true;
            }
        }
        return false;
    }

    private void renderPlayerItems(Renderer2D render, List<DeferredItemDraw> deferredItems, PlayerEntity player, float bgHeight) {
        List<ItemStack> queue = collectEquipment(player);
        if (queue.isEmpty()) return;

        float itemSize = 24f;
        float spacing = 4.7f;
        float totalWidth = queue.size() * itemSize + (queue.size() - 1) * spacing;
        float cursor = -(totalWidth / 2f);
        float itemY = -bgHeight - itemSize - 5;

        List<CountOverlay> overlays = new ArrayList<>();

        for (ItemStack stack : queue) {
            queueItem(render, deferredItems, stack, cursor, itemY, itemSize, true);

            cursor += itemSize + spacing;
        }

        var font = FontRegistry.SF_SEMIBOLD;
        for (CountOverlay overlay : overlays) {
            String countText = String.valueOf(overlay.count());
            render.text(font, overlay.x(), overlay.y(), overlay.fontSize(), countText, 0xFFFFFFFF);
        }
    }

    private void queueItem(Renderer2D render, List<DeferredItemDraw> deferredItems, ItemStack stack, float x, float y, float size, boolean overlay) {
        if (stack == null || stack.isEmpty()) return;

        float absX = x;
        float absY = y;
        float absSize = size;

        var transform = render.getTransformStack().current();
        if (transform != null && transform.length >= 6) {
            float scaleX = (float) Math.sqrt(transform[0] * transform[0] + transform[3] * transform[3]);
            float scaleY = (float) Math.sqrt(transform[1] * transform[1] + transform[4] * transform[4]);
            absX = transform[0] * x + transform[1] * y + transform[2];
            absY = transform[3] * x + transform[4] * y + transform[5];
            absSize = size * Math.min(scaleX, scaleY);
        }

        if (!Float.isFinite(absX) || !Float.isFinite(absY) || !Float.isFinite(absSize) || absSize <= 0f) {
            return;
        }

        deferredItems.add(new DeferredItemDraw(stack.copy(), absX, absY, absSize, overlay));
    }

    private void renderDeferredItems(Renderer2D render, List<DeferredItemDraw> deferredItems) {
        if (deferredItems.isEmpty()) {
            return;
        }

        DrawContext context = Nexis.getInstance().testRender.getDrawContext();
        if (context == null) {
            return;
        }

        double scaleFactor = mc.getWindow().getScaleFactor();
        if (scaleFactor <= 0.0) {
            return;
        }

        var matrices = context.getMatrices();
        for (DeferredItemDraw item : deferredItems) {
            float guiX = (float) (item.absX() / scaleFactor);
            float guiY = (float) (item.absY() / scaleFactor);
            float guiScale = (float) (item.absSize() / (16f * scaleFactor));
            if (!Float.isFinite(guiX) || !Float.isFinite(guiY) || !Float.isFinite(guiScale) || guiScale <= 0f) {
                continue;
            }

            matrices.pushMatrix();
            try {
                matrices.translate(guiX, guiY);
                matrices.scale(guiScale, guiScale);
                ((DrawContextFloatDrawTexture) context).nexis$drawItem(item.stack(), 0, 0, true, CULLING_OWNER);
                if (item.overlay()) {
                    context.drawStackOverlay(mc.textRenderer, item.stack(), 0, 0);
                }
            } catch (Throwable ignored) {
            } finally {
                matrices.popMatrix();
                render.resetPipelineState();
            }
        }

        render.resetPipelineState();
    }

    private void renderOffhandTag(Renderer2D render, PlayerEntity player,
                                  fun.nexisdlc.client.utils.render.main.text.FontObject font,
                                  float fontSize, float scale, float screenX, float screenY) {
        ItemStack offHand = player.getOffHandStack();
        if (offHand.isEmpty()) {
            return;
        }

        Text offhandName = offHand.getName();
        var metrics = getAdjustedTagMetrics(render, font, offhandName, fontSize, true);
        float textWidth = metrics.width();
        float textHeight = metrics.height();

        float paddingX = 4f;
        float paddingY = 2f;
        float bgWidth = textWidth + paddingX * 2;
        float bgHeight = textHeight + paddingY * 2;

        render.pushTranslation(screenX, screenY);
        render.pushScale(scale, scale);
        render.pushCullingOwner(CULLING_OWNER);
        try {
            render.rect(-bgWidth / 2, 0f, bgWidth, bgHeight, getTagRounding(), new Color(0, 0, 0, 130).getRGB());
            render.text(font, -textWidth / 2, centeredTextBaseline(0f, bgHeight, font, fontSize), fontSize, offhandName, -1);
        } finally {
            render.popCullingOwner();
        }
        render.popTransform();
        render.popTransform();
    }

    private void drawDurabilityBar(Renderer2D render, ItemStack stack, float x, float y, float itemSize) {
        if (!stack.isDamageable()) return;

        float durability = (float) (stack.getMaxDamage() - stack.getDamage()) / stack.getMaxDamage();
        float barWidth = 19f;
        float barX = x + (itemSize - barWidth) / 2f;
        float barY = y + itemSize + 2.5f;

        render.rect(barX, barY, barWidth, 4f, 0, new Color(0, 0, 0, 255).getRGB());
        render.rect(barX, barY, barWidth * durability, 4f, 0, getMinecraftDurabilityColor(durability));
    }

    private CountOverlay makeOverlay(ItemStack stack, float x, float itemSize, float y) {
        float fontSize = 12f;
        float countX = x + itemSize - 3f;
        float countY = y + itemSize - 9f;
        return new CountOverlay(stack.getCount(), countX, countY, fontSize);
    }

    public static int getMinecraftDurabilityColor(float percent) {
        if (percent > 0.75f) {
            return ColorUtils.rgb(85, 255, 85);
        } else if (percent > 0.5f) {
            return ColorUtils.rgb(255, 255, 85);
        } else if (percent > 0.25f) {
            return ColorUtils.rgb(255, 170, 85);
        } else if (percent > 0.1f) {
            return ColorUtils.rgb(255, 85, 85);
        } else {
            return ColorUtils.rgb(255, 40, 40);
        }
    }

    private void renderPlayerHead(Renderer2D render, AbstractClientPlayerEntity player, float x, float y, float size) {
        Identifier skin = player.getSkin().body().texturePath();
        float u0 = 8f / 64f;
        float v0 = 8f / 64f;
        float u1 = 16f / 64f;
        float v1 = 16f / 64f;
        render.drawTextureRegionRounded(skin, x, y, size, size, u0, v0, u1, v1, 0xFFFFFFFF, 6f);

        float hatU0 = 40f / 64f;
        float hatU1 = 48f / 64f;
        render.drawTextureRegionRounded(skin, x, y, size, size, hatU0, v0, hatU1, v1, 0xFFFFFFFF, 6f);
    }

    private Identifier getGlobalsAvatarFrame() {
        Identifier gif = Identifier.of("nexis", "gif/avatar.gif");
        GifTexture avatarGif = GifTexture.getCached(gif);
        if (avatarGif == null || avatarGif.getCurrentFrame() == null) {
            GifTexture.queueLoad(gif);
            return null;
        }
        return avatarGif.getCurrentFrame();
    }

    private List<ItemStack> collectEquipment(PlayerEntity player) {
        List<ItemStack> items = new ArrayList<>();

        ItemStack mainHand = player.getMainHandStack();
        if (!mainHand.isEmpty()) items.add(mainHand);

        for (EquipmentSlot slot : new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET}) {
            ItemStack stack = player.getEquippedStack(slot);
            if (!stack.isEmpty()) items.add(stack);
        }

        ItemStack offHand = player.getOffHandStack();
        if (!offHand.isEmpty()) items.add(offHand);

        return items;
    }

    private record CountOverlay(int count, float x, float y, float fontSize) {
    }

    private record DeferredItemDraw(ItemStack stack, float absX, float absY, float absSize, boolean overlay) {
    }

    private Text getEntityName(Entity entity) {
        if (entity instanceof PlayerEntity p) {
            boolean isSelf = p == mc.player;
            boolean isTeamMate = !isSelf && mc.player != null && mc.player.isTeammate(p);
            return getTextPlayer(p, false, isSelf, isTeamMate);
        } else if (entity instanceof ItemEntity item) {
            return item.getStack().getName();
        }
        return entity.getName();
    }

    boolean shouldRender(Entity entity) {
        if (modeList.getByName("Игроках").get() && entity instanceof PlayerEntity) return true;
        if (modeList.getByName("Мобах").get() && entity instanceof net.minecraft.entity.mob.MobEntity) return true;
        if (modeList.getByName("Предметах").get() && entity instanceof ItemEntity) return true;
        return false;
    }

    MutableText getTextPlayer(LivingEntity player, boolean friend, boolean isSelf, boolean teamMate) {
        String healthStr = PlayerUtils.getHealthString(player);
        float health = PlayerUtils.getHealthFloat(player) + player.getAbsorptionAmount();
        MutableText text = Text.empty();

        if (player instanceof PlayerEntity p) {
            boolean isFriend = Nexis.getInstance().getFriendStorage().isFriend(p.getName().getString());
            if (isFriend) {
                text.append(Text.literal("[F] ").formatted(Formatting.GREEN));
            }
        }

        if (teamMate) {
            Formatting teamColor = Formatting.AQUA;
            if (player instanceof PlayerEntity p && p.getScoreboardTeam() != null) {
                teamColor = p.getScoreboardTeam().getColor();
            }
            text.append(Text.literal("[TEAM] ").formatted(teamColor));
        }

        text.append(getDisplayName(player));

        Formatting color = health > 15 ? Formatting.GREEN : health > 8 ? Formatting.YELLOW : Formatting.RED;
        if (healthStr.contains("?")) {
            text.append(Text.literal(" [" + healthStr + "]").formatted(color));
        } else {
            text.append(Text.literal(" [" + healthStr + "HP]").formatted(color));
        }

        if (showDistance.get()) {
            double distance = mc.player.distanceTo(player);
            int distanceInt = (int) distance;
            text.append(Text.literal(" [" + distanceInt + "m]").formatted(Formatting.GRAY));
        }

        return text;
    }

    MutableText getTextPlayer(LivingEntity player, boolean friend) {
        boolean isSelf = player == mc.player;
        boolean isTeamMate = !isSelf && player instanceof PlayerEntity p && mc.player != null && mc.player.isTeammate(p);
        return getTextPlayer(player, friend, isSelf, isTeamMate);
    }

    private MutableText getTextGlobalsMember(GlobalsMember member) {
        MutableText text = Text.empty();
        text.append(Text.literal("[F] ").formatted(Formatting.GREEN));
        text.append(Text.literal(displayGlobalsMemberName(member)).formatted(Formatting.AQUA));

        float health = Math.max(0f, member.health());
        Formatting color = health > 15 ? Formatting.GREEN : health > 8 ? Formatting.YELLOW : Formatting.RED;
        text.append(Text.literal(" [" + Math.round(health) + "HP]").formatted(color));

        if (showDistance.get() && mc.player != null) {
            double distance = mc.player.getEntityPos().distanceTo(new Vec3d(member.x(), member.y(), member.z()));
            text.append(Text.literal(" [" + (int) distance + "m]").formatted(Formatting.GRAY));
        }

        return text;
    }

    private String displayGlobalsMemberName(GlobalsMember member) {
        if (member.username() != null && !member.username().isBlank()) {
            return member.username();
        }
        return member.minecraftName() == null || member.minecraftName().isBlank() ? "Globals" : member.minecraftName();
    }

    Text getDisplayName(LivingEntity player) {
        if (player instanceof PlayerEntity partyPlayer) {
            String siteLogin = GlobalsManager.getInstance().getSiteLoginByMinecraftName(partyPlayer.getName().getString());
            if (siteLogin != null && !siteLogin.isBlank()) {
                return Text.literal(siteLogin).formatted(Formatting.AQUA);
            }
        }
        Text displayName = player.getDisplayName();

        var strMode = Nexis.getFunctionManager().getStreamerMode();
        if (strMode.nameProtect.get() && strMode.isState()) {
            if (player.getName().equals(mc.player.getName())) {
                displayName = Text.of(strMode.nameProtectName.get());
            }
            if (strMode.nameProtectReplaceFriendNicknames.get() && Nexis.getInstance().getFriendStorage().isFriend(player.getName().getString())) {
                displayName = Text.of(strMode.nameProtectName.get());
            }
        }

        String raw = displayName.getString();

        if (!raw.isEmpty() && raw.charAt(0) == ' ') {
            return Text.literal(raw.trim()).setStyle(displayName.getStyle());
        }
        return displayName;
    }

    private float getTagScale() {
        return 0.85f * getTagSizeMultiplier();
    }

    private float getTagSizeMultiplier() {
        return size.get() / 100f;
    }

    private float getTagRounding() {
        return rounding.get();
    }

    private TagTextMetrics getAdjustedTagMetrics(Renderer2D render,
                                                 fun.nexisdlc.client.utils.render.main.text.FontObject font,
                                                 Text text,
                                                 float fontSize,
                                                 boolean applySpecialItemPadding) {
        TextRenderer.TextMetrics baseMetrics = render.measureText(font, text, fontSize);
        return new TagTextMetrics(baseMetrics.width, baseMetrics.height);
    }

    private float centeredTextBaseline(float y, float height,
                                       fun.nexisdlc.client.utils.render.main.text.FontObject font,
                                       float fontSize) {
        return y + height * 0.5f + FontRegistry.centeredBaselineOffset(font, 'H', fontSize);
    }

    private float getSpecialItemWidthBonus(Text text, float fontSize) {
        String raw = text.getString();
        if (raw == null || raw.isEmpty()) {
            return 0f;
        }

        int colorTokens = countMatches(raw, AMPERSAND_COLOR_PATTERN) + countMatches(raw, SECTION_COLOR_PATTERN);
        int unicodeSymbols = countSpecialUnicodeSymbols(raw);
        if (colorTokens == 0 && unicodeSymbols == 0) {
            return 0f;
        }

        float perColorBonus = fontSize * 0.55f;
        float perSymbolBonus = fontSize * 0.7f;
        return colorTokens * perColorBonus + unicodeSymbols * perSymbolBonus;
    }

    private int countMatches(String input, Pattern pattern) {
        int matches = 0;
        var matcher = pattern.matcher(input);
        while (matcher.find()) {
            matches++;
        }
        return matches;
    }

    private int countSpecialUnicodeSymbols(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); ) {
            int codePoint = input.codePointAt(i);
            i += Character.charCount(codePoint);

            if (isSpecialVisibleSymbol(codePoint)) {
                count++;
            }
        }
        return count;
    }

    private boolean isSpecialVisibleSymbol(int codePoint) {
        if (!Character.isValidCodePoint(codePoint) || codePoint <= 0x7F) {
            return false;
        }

        int type = Character.getType(codePoint);
        if (type == Character.SURROGATE || type == Character.CONTROL || type == Character.FORMAT
                || type == Character.PRIVATE_USE || type == Character.UNASSIGNED) {
            return false;
        }

        Character.UnicodeBlock block = Character.UnicodeBlock.of(codePoint);
        return block == Character.UnicodeBlock.MISCELLANEOUS_SYMBOLS
                || block == Character.UnicodeBlock.DINGBATS
                || block == Character.UnicodeBlock.MISCELLANEOUS_SYMBOLS_AND_ARROWS
                || block == Character.UnicodeBlock.GEOMETRIC_SHAPES
                || block == Character.UnicodeBlock.MATHEMATICAL_OPERATORS
                || block == Character.UnicodeBlock.ORNAMENTAL_DINGBATS
                || block == Character.UnicodeBlock.SUPPLEMENTAL_SYMBOLS_AND_PICTOGRAPHS
                || block == Character.UnicodeBlock.EMOTICONS
                || block == Character.UnicodeBlock.TRANSPORT_AND_MAP_SYMBOLS
                || block == Character.UnicodeBlock.MISCELLANEOUS_TECHNICAL
                || block == Character.UnicodeBlock.ENCLOSED_ALPHANUMERICS
                || block == Character.UnicodeBlock.ENCLOSED_ALPHANUMERIC_SUPPLEMENT;
    }

    private record TagTextMetrics(float width, float height) {
    }
}

