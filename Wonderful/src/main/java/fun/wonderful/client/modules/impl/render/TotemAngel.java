package fun.wonderful.client.modules.impl.render;

import com.mojang.blaze3d.systems.RenderSystem;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.Event3DRender;
import fun.wonderful.api.events.implement.EventPacket;
import fun.wonderful.api.utils.chat.ChatUtils;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.render.font.ReplaceSymbols;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ListSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.scoreboard.Team;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.TextColor;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.client.render.BuiltBuffer;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;

public class TotemAngel
extends Module {
    public static TotemAngel INSTANCE = new TotemAngel();
    private final ModeSetting mode = new ModeSetting("Режим", "Angel", "Angel");
    private final BooleanSetting visuals = new BooleanSetting("Визуал", true);
    private final BooleanSetting chatInfo = new BooleanSetting("Чат инфо", true);
    private final FloatSetting riseHeight = new FloatSetting("Высота", 4.0f, 0.2f, 10.0f, 0.1f);
    private final FloatSetting duration = new FloatSetting("Длительность", 3.0f, 0.2f, 6.0f, 0.1f);
    private final ListSetting renderModes = new ListSetting("Режим", new BooleanSetting("Ангел", true));
    private static final float WING_SCALE = 1.0f;
    private static final float FLAP_SPEED = 1.6f;
    private static final float FLAP_AMPLITUDE = 25.0f;
    private static final float GLOW_INTENSITY = 0.1f;
    private static final int NIMBUS_ARMS = 2;
    private static final int NIMBUS_SEGMENTS = 17;
    private static final float NIMBUS_RADIUS = 0.45f;
    private static final float NIMBUS_BASE_SIZE = 0.23f;
    private static final double NIMBUS_STEP_RADIANS = 0.11;
    private static final int NIMBUS_MAX_ALPHA = 255;
    private static final int NIMBUS_ALPHA_FALLOFF = 9;
    private static final float NIMBUS_SPEED = 170.0f;
    private static final Identifier SPARKLE_TEXTURE = Identifier.of((String)"wonderful", (String)"textures/particle/sparkle.png");
    private static final int GREEN_COLOR = -13238485;
    private static final int YELLOW_COLOR = -3797;
    private final List<TotemGhost> ghosts = new CopyOnWriteArrayList<TotemGhost>();
    private final List<TotemSphereEffect> sphereEffects = new CopyOnWriteArrayList<TotemSphereEffect>();
    private final Map<Integer, Long> recentSphereSpawns = new ConcurrentHashMap<Integer, Long>();

    public TotemAngel() {
        super("TotemPop", "Отображает эффект и пишет в чат при срабатывании тотема", Module.ModuleCategory.RENDER);
        this.addSettings(this.renderModes, this.mode.visible(() -> false), this.visuals.visible(() -> false), this.chatInfo, this.riseHeight, this.duration);
    }

    @Override
    public void onDisable() {
        this.ghosts.clear();
        super.onDisable();
    }

    private Identifier getGlowTexture() {
        return Identifier.of((String)"wonderful", (String)"textures/targetesp/bloom.png");
    }

    private Identifier getSkinTexture() {
        return Identifier.of((String)"wonderful", (String)"textures/skin/skin.png");
    }

    @EventLink
    public void onPacket(EventPacket event) {
        EntityStatusS2CPacket packet;
        if (TotemAngel.mc.world == null || TotemAngel.mc.player == null || event.getType() != EventPacket.Type.RECEIVE) {
            return;
        }
        Packet<?> class_25962 = event.getPacket();
        if (class_25962 instanceof EntityStatusS2CPacket && (packet = (EntityStatusS2CPacket)class_25962).getStatus() == 35) {
            mc.execute(() -> this.handleTotemPopPacket(packet));
        }
    }

    private void handleTotemPopPacket(EntityStatusS2CPacket packet) {
        if (TotemAngel.mc.world == null || TotemAngel.mc.player == null) {
            return;
        }
        Entity entity = packet.getEntity((World)TotemAngel.mc.world);
        if (!(entity instanceof AbstractClientPlayerEntity)) {
            return;
        }
        AbstractClientPlayerEntity player = (AbstractClientPlayerEntity)entity;
        if (this.renderModes.is("Ангел")) {
            this.addGhost(player);
        }
        if (this.chatInfo.isState() && player != TotemAngel.mc.player) {
            ChatUtils.sendMessage(this.createTotemPopMessage(player));
        }
    }

    private MutableText createTotemPopMessage(AbstractClientPlayerEntity player) {
        PlayerChatParts parts = this.resolvePlayerChatParts(player);
        MutableText message = Text.literal((String)"");
        this.appendSegments(message, parts.donateSegments());
        if (!parts.donateSegments().isEmpty()) {
            message.append((Text)(Object)this.colored(" ", 0xC8C8C8));
        }
        message.append((Text)(Object)this.colored(parts.name(), 0xFFFFFF));
        this.appendClan(message, parts.clanSegments());
        message.append((Text)(Object)this.colored(" потерял тотем, зачарован: ", 0xC8C8C8));
        message.append((Text)(Object)this.colored("●", this.isPoppedTotemEnchanted(player) ? 0x55FF55 : 0xFF5555));
        return message;
    }

    private PlayerChatParts resolvePlayerChatParts(AbstractClientPlayerEntity player) {
        String name = player.getName().getString();
        Text displayName = this.getPlayerDisplayName(player);
        List<ChatSegment> segments = this.getTextSegments(displayName, 0xFFFFFF);
        String combined = this.joinSegments(segments);
        int nameIndex = this.indexOfIgnoreCase(combined, name);
        if (nameIndex >= 0) {
            List<ChatSegment> donate = this.trimSegments(this.sliceSegments(segments, 0, nameIndex));
            List<ChatSegment> clan = this.trimSegments(this.sliceSegments(segments, nameIndex + name.length(), combined.length()));
            return new PlayerChatParts(donate, name, clan);
        }
        Team team = player.getScoreboardTeam();
        List<ChatSegment> donate = team != null && team.getPrefix() != null ? this.trimSegments(this.getTextSegments(team.getPrefix(), 0xFFFFFF)) : List.of();
        return new PlayerChatParts(donate, name, List.of());
    }

    private Text getPlayerDisplayName(AbstractClientPlayerEntity player) {
        PlayerListEntry entry;
        if (mc.getNetworkHandler() != null && (entry = mc.getNetworkHandler().getPlayerListEntry(player.getUuid())) != null && entry.getDisplayName() != null) {
            return entry.getDisplayName();
        }
        return player.getDisplayName();
    }

    private List<ChatSegment> getTextSegments(Text text, int fallbackColor) {
        ArrayList<ChatSegment> segments = new ArrayList<ChatSegment>();
        if (text == null) {
            return segments;
        }
        text.visit((style, string) -> {
            if (string == null || string.isEmpty()) {
                return Optional.empty();
            }
            int color = style.getColor() != null ? style.getColor().getRgb() : fallbackColor;
            this.appendDecodedSegments(segments, string.replace('\n', ' ').replace('\r', ' '), style.withColor(TextColor.fromRgb((int)color)));
            return Optional.empty();
        }, Style.EMPTY);
        if (segments.isEmpty() && !text.getString().isEmpty()) {
            this.appendDecodedSegments(segments, text.getString(), Style.EMPTY.withColor(TextColor.fromRgb((int)fallbackColor)));
        }
        return segments;
    }

    private void appendDecodedSegments(List<ChatSegment> segments, String text, Style baseStyle) {
        if (text == null || text.isEmpty()) {
            return;
        }
        Style currentStyle = baseStyle;
        StringBuilder chunk = new StringBuilder();
        Style chunkStyle = currentStyle;
        int offset = 0;
        while (offset < text.length()) {
            String replacement;
            int codePoint = text.codePointAt(offset);
            int charCount = Character.charCount(codePoint);
            if (codePoint == 167 && offset + charCount < text.length()) {
                this.flushSegment(segments, chunk, chunkStyle);
                chunkStyle = currentStyle = this.applyLegacyFormatCode(currentStyle, Character.toLowerCase(text.charAt(offset + charCount)));
                offset += charCount + 1;
                continue;
            }
            String string = replacement = this.shouldPreserveResourcePackSymbol(codePoint) ? null : ReplaceSymbols.replaceCodePoint(codePoint);
            if (replacement != null) {
                this.flushSegment(segments, chunk, chunkStyle);
                int totalChars = Math.max(1, replacement.length());
                for (int i2 = 0; i2 < replacement.length(); ++i2) {
                    int gradientColor = ReplaceSymbols.getGradientColorForReplacement(codePoint, i2, totalChars, 1.0f, currentStyle.getColor() != null ? currentStyle.getColor().getRgb() : 0xFFFFFF) & 0xFFFFFF;
                    Style gradientStyle = currentStyle.withColor(TextColor.fromRgb((int)gradientColor));
                    if (chunk.length() > 0 && !chunkStyle.equals((Object)gradientStyle)) {
                        this.flushSegment(segments, chunk, chunkStyle);
                    }
                    chunkStyle = gradientStyle;
                    chunk.append(replacement.charAt(i2));
                }
                offset += charCount;
                continue;
            }
            if (chunk.length() > 0 && !chunkStyle.equals((Object)currentStyle)) {
                this.flushSegment(segments, chunk, chunkStyle);
            }
            chunkStyle = currentStyle;
            chunk.appendCodePoint(codePoint);
            offset += charCount;
        }
        this.flushSegment(segments, chunk, chunkStyle);
    }

    private void flushSegment(List<ChatSegment> segments, StringBuilder chunk, Style style) {
        if (chunk.isEmpty()) {
            return;
        }
        segments.add(new ChatSegment(chunk.toString(), style));
        chunk.setLength(0);
    }

    private Style applyLegacyFormatCode(Style style, char code) {
        return switch (code) {
            case '0' -> style.withColor(TextColor.fromRgb((int)0));
            case '1' -> style.withColor(TextColor.fromRgb((int)170));
            case '2' -> style.withColor(TextColor.fromRgb((int)43520));
            case '3' -> style.withColor(TextColor.fromRgb((int)43690));
            case '4' -> style.withColor(TextColor.fromRgb((int)0xAA0000));
            case '5' -> style.withColor(TextColor.fromRgb((int)0xAA00AA));
            case '6' -> style.withColor(TextColor.fromRgb((int)0xFFAA00));
            case '7' -> style.withColor(TextColor.fromRgb((int)0xAAAAAA));
            case '8' -> style.withColor(TextColor.fromRgb((int)0x555555));
            case '9' -> style.withColor(TextColor.fromRgb((int)0x5555FF));
            case 'a' -> style.withColor(TextColor.fromRgb((int)0x55FF55));
            case 'b' -> style.withColor(TextColor.fromRgb((int)0x55FFFF));
            case 'c' -> style.withColor(TextColor.fromRgb((int)0xFF5555));
            case 'd' -> style.withColor(TextColor.fromRgb((int)0xFF55FF));
            case 'e' -> style.withColor(TextColor.fromRgb((int)0xFFFF55));
            case 'f' -> style.withColor(TextColor.fromRgb((int)0xFFFFFF));
            case 'l' -> style.withBold(Boolean.valueOf(true));
            case 'n' -> style.withUnderline(Boolean.valueOf(true));
            case 'o' -> style.withItalic(Boolean.valueOf(true));
            case 'm' -> style.withStrikethrough(Boolean.valueOf(true));
            case 'k' -> style.withObfuscated(Boolean.valueOf(true));
            case 'r' -> Style.EMPTY;
            default -> style;
        };
    }

    private List<ChatSegment> sliceSegments(List<ChatSegment> segments, int from, int to) {
        ArrayList<ChatSegment> sliced = new ArrayList<ChatSegment>();
        int cursor = 0;
        for (ChatSegment segment : segments) {
            int start = cursor;
            int end = cursor + segment.text().length();
            if (end > from && start < to) {
                int localFrom = Math.max(0, from - start);
                int localTo = Math.min(segment.text().length(), to - start);
                sliced.add(new ChatSegment(segment.text().substring(localFrom, localTo), segment.style()));
            }
            cursor = end;
        }
        return sliced;
    }

    private List<ChatSegment> trimSegments(List<ChatSegment> segments) {
        ArrayList<ChatSegment> result = new ArrayList<ChatSegment>();
        for (ChatSegment segment2 : segments) {
            if (segment2.text().isEmpty()) continue;
            result.add(segment2);
        }
        while (!result.isEmpty() && ((ChatSegment)result.get(0)).text().isBlank()) {
            result.remove(0);
        }
        while (!result.isEmpty() && ((ChatSegment)result.get(result.size() - 1)).text().isBlank()) {
            result.remove(result.size() - 1);
        }
        if (result.isEmpty()) {
            return List.of();
        }
        ChatSegment first = (ChatSegment)result.get(0);
        result.set(0, new ChatSegment(this.stripLeading(first.text()), first.style()));
        ChatSegment last = (ChatSegment)result.get(result.size() - 1);
        result.set(result.size() - 1, new ChatSegment(this.stripTrailing(last.text()), last.style()));
        result.removeIf(segment -> segment.text().isEmpty());
        return result;
    }

    private String stripLeading(String value) {
        int index;
        for (index = 0; index < value.length() && Character.isWhitespace(value.charAt(index)); ++index) {
        }
        return value.substring(index);
    }

    private String stripTrailing(String value) {
        int index;
        for (index = value.length(); index > 0 && Character.isWhitespace(value.charAt(index - 1)); --index) {
        }
        return value.substring(0, index);
    }

    private String joinSegments(List<ChatSegment> segments) {
        StringBuilder builder = new StringBuilder();
        for (ChatSegment segment : segments) {
            builder.append(segment.text());
        }
        return builder.toString();
    }

    private int indexOfIgnoreCase(String text, String search) {
        if (text == null || search == null || search.isEmpty()) {
            return -1;
        }
        int limit = text.length() - search.length();
        for (int i2 = 0; i2 <= limit; ++i2) {
            if (!text.regionMatches(true, i2, search, 0, search.length())) continue;
            return i2;
        }
        return -1;
    }

    private void appendSegments(MutableText message, List<ChatSegment> segments) {
        for (ChatSegment segment : segments) {
            message.append((Text)Text.literal((String)segment.text()).setStyle(segment.style()));
        }
    }

    private void appendClan(MutableText message, List<ChatSegment> clanSegments) {
        if (clanSegments.isEmpty()) {
            return;
        }
        message.append((Text)(Object)this.colored(" ", 0xC8C8C8));
        this.appendSegments(message, clanSegments);
    }

    private MutableText colored(String text, int color) {
        return Text.literal((String)text).setStyle(Style.EMPTY.withColor(TextColor.fromRgb((int)(color & 0xFFFFFF))));
    }

    private boolean isPoppedTotemEnchanted(AbstractClientPlayerEntity player) {
        return this.isEnchantedTotem(player.getOffHandStack()) || this.isEnchantedTotem(player.getMainHandStack());
    }

    private boolean isEnchantedTotem(ItemStack stack) {
        return stack != null && stack.isOf(Items.TOTEM_OF_UNDYING) && stack.hasEnchantments();
    }

    private boolean shouldPreserveResourcePackSymbol(int codePoint) {
        return this.isReallyWorldServer() && ReplaceSymbols.replaceCodePoint(codePoint) != null;
    }

    private boolean isReallyWorldServer() {
        if (mc == null || mc.getCurrentServerEntry() == null || TotemAngel.mc.getCurrentServerEntry().address == null) {
            return false;
        }
        return TotemAngel.mc.getCurrentServerEntry().address.toLowerCase().contains("reallyworld");
    }

    @EventLink
    public void onRender3D(Event3DRender event) {
        if (TotemAngel.mc.world == null || TotemAngel.mc.player == null) {
            return;
        }
        if (this.renderModes.is("Ангел") && !this.ghosts.isEmpty()) {
            this.renderGhosts(event.getMatrices(), event.getTickDelta());
        }
    }

    private void addGhost(AbstractClientPlayerEntity player) {
        float partialTicks = mc.getRenderTickCounter().getTickDelta(true);
        double x2 = MathHelper.lerp((double)partialTicks, (double)player.lastRenderX, (double)player.getX());
        double y2 = MathHelper.lerp((double)partialTicks, (double)player.lastRenderY, (double)player.getY());
        double z2 = MathHelper.lerp((double)partialTicks, (double)player.lastRenderZ, (double)player.getZ());
        float bodyYaw = MathHelper.lerp((float)partialTicks, (float)player.prevBodyYaw, (float)player.bodyYaw);
        float headYaw = MathHelper.lerp((float)partialTicks, (float)player.prevHeadYaw, (float)player.headYaw);
        float headPitch = MathHelper.lerp((float)partialTicks, (float)player.prevPitch, (float)player.getPitch());
        float limbSwing = player.limbAnimator.getPos(partialTicks);
        float limbSwingAmount = player.limbAnimator.getSpeed(partialTicks);
        boolean sneaking = player.isSneaking();
        float height = player.getHeight();
        this.ghosts.add(new TotemGhost(new Vec3d(x2, y2, z2), bodyYaw, headYaw - bodyYaw, headPitch, limbSwing, limbSwingAmount, sneaking, height, System.currentTimeMillis()));
    }

    private void addSphereEffect(AbstractClientPlayerEntity player) {
        if (player == null || player == TotemAngel.mc.player) {
            return;
        }
        long now = System.currentTimeMillis();
        this.recentSphereSpawns.entrySet().removeIf(entry -> now - (Long)entry.getValue() > 1000L);
        Long lastSpawn = this.recentSphereSpawns.get(player.getId());
        if (lastSpawn != null && now - lastSpawn < 120L) {
            return;
        }
        this.recentSphereSpawns.put(player.getId(), now);
        double centerY = player.getY() + (double)player.getHeight() * 0.62;
        ArrayList<SphereParticle> particles = new ArrayList<SphereParticle>(64);
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i2 = 0; i2 < 64; ++i2) {
            double yaw = random.nextDouble(0.0, Math.PI * 2);
            double pitch = random.nextDouble(-0.8, 0.8);
            Vec3d direction = new Vec3d(Math.cos(yaw) * Math.cos(pitch), Math.sin(pitch) * 0.62 + random.nextDouble(-0.12, 0.24), Math.sin(yaw) * Math.cos(pitch)).normalize();
            particles.add(new SphereParticle(direction, random.nextFloat(0.28f, 1.08f), random.nextFloat(0.85f, 1.55f), random.nextFloat(1.05f, 1.85f), random.nextFloat(0.95f, 1.45f), random.nextFloat(0.0f, 1.0f), random.nextBoolean() ? -13238485 : -3797));
        }
        this.sphereEffects.add(new TotemSphereEffect(new Vec3d(player.getX(), centerY, player.getZ()), now, random.nextFloat(0.0f, 360.0f), particles, this.createSphereOrbitLines()));
    }

    private void renderGhosts(MatrixStack matrices, float tickDelta) {
        Vec3d cameraPos = TotemAngel.mc.gameRenderer.getCamera().getPos();
        long now = System.currentTimeMillis();
        ArrayList<TotemGhost> toRemove = new ArrayList<TotemGhost>();
        int themeColor = ColorUtils.getThemeColor();
        float r2 = ColorUtils.redf(themeColor);
        float g2 = ColorUtils.greenf(themeColor);
        float b2 = ColorUtils.bluef(themeColor);
        for (TotemGhost ghost : this.ghosts) {
            float progress = (float)(now - ghost.startTime) / (this.duration.get() * 1000.0f);
            if (progress >= 1.0f) {
                toRemove.add(ghost);
                continue;
            }
            double motionY = this.riseHeight.get() * this.easeOutCubic(progress);
            float alpha = (1.0f - this.easeInCubic(progress)) * 0.85f;
            double renderX = ghost.position.x - cameraPos.x;
            double renderY = ghost.position.y - cameraPos.y + motionY;
            double renderZ = ghost.position.z - cameraPos.z;
            matrices.push();
            matrices.translate(renderX, renderY, renderZ);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-ghost.bodyYaw));
            this.renderGlowingPlayerModel(matrices, r2, g2, b2, alpha, ghost);
            this.renderWings(matrices, ghost, progress, tickDelta, themeColor, alpha);
            this.renderHalo(matrices, ghost, themeColor, alpha);
            matrices.pop();
        }
        if (!toRemove.isEmpty()) {
            this.ghosts.removeAll(toRemove);
        }
    }

    private void renderSphereEffects(MatrixStack matrices, Vec3d cameraPos) {
        long now = System.currentTimeMillis();
        float sphereDurationMs = this.duration.get() * 1000.0f;
        this.sphereEffects.removeIf(effect -> (float)(now - effect.startTime) >= sphereDurationMs);
        if (this.sphereEffects.isEmpty()) {
            return;
        }
        RenderSystem.enableBlend();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        this.renderSphereParticles(matrices, cameraPos, now, sphereDurationMs);
        this.renderSphereArcs(matrices, cameraPos, now, sphereDurationMs);
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableCull();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
    }

    private void renderSphereParticles(MatrixStack matrices, Vec3d cameraPos, long now, float durationMs) {
        RenderSystem.blendFunc((int)770, (int)1);
        RenderSystem.setShaderTexture((int)0, (Identifier)SPARKLE_TEXTURE);
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_TEX_COLOR);
        float cameraYaw = TotemAngel.mc.gameRenderer.getCamera().getYaw();
        float cameraPitch = TotemAngel.mc.gameRenderer.getCamera().getPitch();
        float baseRadius = 1.18f;
        float baseSize = 0.28f;
        for (TotemSphereEffect effect : this.sphereEffects) {
            float age = (float)(now - effect.startTime) / durationMs;
            float appear = MathHelper.clamp((float)(1.0f - age), (float)0.0f, (float)1.0f);
            float burstProgress = this.easeOutQuad(Math.min(1.0f, age * 1.12f));
            for (SphereParticle particle : effect.particles) {
                float localProgress = MathHelper.clamp((float)(age * particle.timeScale + particle.progressOffset * 0.1f), (float)0.0f, (float)1.0f);
                float launchProgress = this.easeOutQuad(localProgress);
                float radial = (0.34f + launchProgress * (1.2f + particle.spread * 1.05f) + burstProgress * 0.32f) * baseRadius;
                float orbit = (float)now * 0.0012f * particle.rotationScale + particle.progressOffset * 5.4f;
                double swirlScale = (1.0f - localProgress) * 0.18f;
                double swirlX = Math.cos(orbit) * swirlScale * (double)particle.swirlAmount;
                double swirlY = Math.sin(orbit * 1.3f) * swirlScale * 0.75 * (double)particle.swirlAmount + (double)(localProgress * 0.08f);
                double swirlZ = Math.sin(orbit) * swirlScale * (double)particle.swirlAmount;
                double dragY = localProgress * localProgress * 0.14f;
                Vec3d worldPos = effect.origin.add(particle.direction.multiply((double)radial)).add(swirlX, swirlY - dragY, swirlZ);
                double x2 = worldPos.x - cameraPos.x;
                double y2 = worldPos.y - cameraPos.y;
                double z2 = worldPos.z - cameraPos.z;
                int color = this.setAlpha(particle.color, (int)(255.0f * appear * (0.5f + 0.5f * (1.0f - localProgress))));
                float drawSize = baseSize * (0.68f + particle.spread * 0.34f) * (0.7f + appear * 0.52f);
                matrices.push();
                matrices.translate(x2, y2, z2);
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-cameraYaw));
                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(cameraPitch));
                this.drawSphereBillboard(matrices.peek().getPositionMatrix(), drawSize, color);
                matrices.pop();
            }
        }
    }

    private void renderSphereArcs(MatrixStack matrices, Vec3d cameraPos, long now, float durationMs) {
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_COLOR);
        RenderSystem.lineWidth((float)1.05f);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        for (TotemSphereEffect effect : this.sphereEffects) {
            float age = (float)(now - effect.startTime) / durationMs;
            float appear = MathHelper.clamp((float)(1.0f - age), (float)0.0f, (float)1.0f);
            float grow = this.easeOutQuad(Math.min(1.0f, age * 1.25f));
            float elapsedSec = (float)(now - effect.startTime) / 1000.0f;
            float scale = 1.18f * (0.78f + grow * 0.1f);
            double x2 = effect.origin.x - cameraPos.x;
            double y2 = effect.origin.y - cameraPos.y;
            double z2 = effect.origin.z - cameraPos.z;
            for (OrbitLine line : effect.orbitLines) {
                matrices.push();
                matrices.translate(x2, y2, z2);
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(effect.baseRotation + line.baseYaw + elapsedSec * line.speedDeg));
                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(line.tiltX));
                matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(line.tiltZ));
                this.drawSphereOrbitArc(matrices, line.radiusX * scale, line.radiusZ * scale, line.yOffset, line.startDeg, line.arcDeg, appear * line.alphaMul, line.startColor, line.endColor);
                matrices.pop();
            }
        }
        GL11.glDisable((int)2848);
    }

    private void drawSphereOrbitArc(MatrixStack matrices, float radiusX, float radiusZ, float y2, float startDeg, float arcDeg, float alphaMul, int startColor, int endColor) {
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        int segments = 28;
        float from = (float)Math.toRadians(startDeg);
        float to = (float)Math.toRadians(startDeg + arcDeg);
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.DEBUG_LINE_STRIP, VertexFormats.POSITION_COLOR);
        for (int i2 = 0; i2 <= segments; ++i2) {
            float progress = (float)i2 / (float)segments;
            float angle = MathHelper.lerp((float)progress, (float)from, (float)to);
            float px = MathHelper.cos((float)angle) * radiusX;
            float pz = MathHelper.sin((float)angle) * radiusZ;
            float localY = y2 + MathHelper.sin((float)(angle * 1.35f)) * 0.01f;
            float edgeFade = MathHelper.clamp((float)(1.0f - Math.abs(progress - 0.5f) * 2.0f), (float)0.0f, (float)1.0f);
            int color = this.fadeLerp(startColor, endColor, progress, alphaMul * (0.22f + 0.78f * edgeFade));
            buffer.vertex(matrix, px, localY, pz).color(color);
        }
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
        BufferBuilder echo = Tessellator.getInstance().begin(VertexFormat.DrawMode.DEBUG_LINE_STRIP, VertexFormats.POSITION_COLOR);
        for (int i3 = 0; i3 <= segments; ++i3) {
            float progress = (float)i3 / (float)segments;
            float angle = MathHelper.lerp((float)progress, (float)(from + 0.015f), (float)(to - 0.012f));
            float px = MathHelper.cos((float)angle) * (radiusX + 0.012f);
            float pz = MathHelper.sin((float)angle) * (radiusZ + 0.012f);
            float localY = y2 + 0.004f + MathHelper.sin((float)(angle * 1.35f + 0.9f)) * 0.008f;
            float edgeFade = MathHelper.clamp((float)(1.0f - Math.abs(progress - 0.5f) * 2.0f), (float)0.0f, (float)1.0f);
            int color = this.fadeLerp(startColor, endColor, progress, alphaMul * 0.14f * edgeFade);
            echo.vertex(matrix, px, localY, pz).color(color);
        }
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)echo.end());
    }

    private List<OrbitLine> createSphereOrbitLines() {
        ArrayList<OrbitLine> lines = new ArrayList<OrbitLine>(5);
        lines.add(new OrbitLine(1.02f, 0.66f, 0.2f, 196.0f, 156.0f, 14.0f, -12.0f, 54.0f, 0.46f, -13238485, -13238485));
        lines.add(new OrbitLine(0.92f, 0.6f, 0.16f, 188.0f, 148.0f, 14.0f, -12.0f, 54.0f, 0.22f, -13238485, -13238485));
        lines.add(new OrbitLine(0.86f, 0.54f, -0.12f, 122.0f, 112.0f, 78.0f, 4.0f, -68.0f, 0.65f, -3797, -3797));
        lines.add(new OrbitLine(0.74f, 0.46f, -0.02f, 314.0f, 88.0f, 62.0f, -18.0f, 76.0f, 0.58f, -13238485, -3797));
        lines.add(new OrbitLine(0.68f, 0.34f, 0.0f, 202.0f, 44.0f, 8.0f, 52.0f, -44.0f, 0.18f, -13238485, -13238485));
        return lines;
    }

    private void drawSphereBillboard(Matrix4f matrix, float size, int color) {
        float half = size * 0.5f;
        int r2 = color >> 16 & 0xFF;
        int g2 = color >> 8 & 0xFF;
        int b2 = color & 0xFF;
        int a2 = color >> 24 & 0xFF;
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        buffer.vertex(matrix, -half, -half, 0.0f).texture(0.0f, 1.0f).color(r2, g2, b2, a2);
        buffer.vertex(matrix, -half, half, 0.0f).texture(0.0f, 0.0f).color(r2, g2, b2, a2);
        buffer.vertex(matrix, half, half, 0.0f).texture(1.0f, 0.0f).color(r2, g2, b2, a2);
        buffer.vertex(matrix, half, -half, 0.0f).texture(1.0f, 1.0f).color(r2, g2, b2, a2);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
    }

    private int fadeLerp(int start, int end, float progress, float alphaMul) {
        int sr = start >> 16 & 0xFF;
        int sg = start >> 8 & 0xFF;
        int sb = start & 0xFF;
        int er = end >> 16 & 0xFF;
        int eg = end >> 8 & 0xFF;
        int eb = end & 0xFF;
        int r2 = MathHelper.lerp((float)progress, (int)sr, (int)er);
        int g2 = MathHelper.lerp((float)progress, (int)sg, (int)eg);
        int b2 = MathHelper.lerp((float)progress, (int)sb, (int)eb);
        int a2 = MathHelper.clamp((int)((int)(255.0f * alphaMul)), (int)0, (int)255);
        return a2 << 24 | r2 << 16 | g2 << 8 | b2;
    }

    private int setAlpha(int color, int alpha) {
        return MathHelper.clamp((int)alpha, (int)0, (int)255) << 24 | color & 0xFFFFFF;
    }

    private float easeOutQuad(float value) {
        float inv = 1.0f - value;
        return 1.0f - inv * inv;
    }

    private void renderSkinPlayerModel(MatrixStack matrices, float alpha, TotemGhost ghost) {
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((int)770, (int)771);
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)true);
        RenderSystem.setShaderTexture((int)0, (Identifier)(Object)this.getSkinTexture());
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_TEX_COLOR);
        float unit = 0.0625f;
        float sneakOffset = ghost.sneaking ? 0.25f : 0.0f;
        float limbSwing = ghost.limbSwing;
        float limbSwingAmount = Math.min(1.0f, ghost.limbSwingAmount);
        float legSwing = MathHelper.cos((float)(limbSwing * 0.6662f)) * 1.4f * limbSwingAmount;
        float armSwing = MathHelper.cos((float)(limbSwing * 0.6662f + (float)Math.PI)) * 2.0f * limbSwingAmount;
        int alphaInt = (int)(alpha * 255.0f);
        matrices.push();
        matrices.translate(0.0f, 24.0f * unit - sneakOffset, 0.0f);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(ghost.netHeadYaw));
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(ghost.headPitch));
        this.renderSkinBox(matrices, -4.0f * unit, -8.0f * unit, -4.0f * unit, 8.0f * unit, 8.0f * unit, 8.0f * unit, 8, 8, 16, 16, 64, 64, alphaInt);
        matrices.pop();
        matrices.push();
        if (ghost.sneaking) {
            matrices.translate(0.0f, 12.0f * unit, 0.0f);
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(28.0f));
            matrices.translate(0.0f, -12.0f * unit, 0.0f);
        }
        this.renderSkinBox(matrices, -4.0f * unit, 12.0f * unit - sneakOffset, -2.0f * unit, 8.0f * unit, 12.0f * unit, 4.0f * unit, 20, 20, 28, 32, 64, 64, alphaInt);
        matrices.pop();
        matrices.push();
        matrices.translate(-5.0f * unit, 22.0f * unit - sneakOffset, 0.0f);
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(armSwing * 57.295776f));
        this.renderSkinBox(matrices, -2.0f * unit, -12.0f * unit, -2.0f * unit, 4.0f * unit, 12.0f * unit, 4.0f * unit, 44, 20, 48, 32, 64, 64, alphaInt);
        matrices.pop();
        matrices.push();
        matrices.translate(5.0f * unit, 22.0f * unit - sneakOffset, 0.0f);
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-armSwing * 57.295776f));
        this.renderSkinBox(matrices, -2.0f * unit, -12.0f * unit, -2.0f * unit, 4.0f * unit, 12.0f * unit, 4.0f * unit, 36, 52, 40, 64, 64, 64, alphaInt);
        matrices.pop();
        matrices.push();
        matrices.translate(-2.0f * unit, 12.0f * unit - sneakOffset, 0.0f);
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(legSwing * 57.295776f));
        this.renderSkinBox(matrices, -2.0f * unit, -12.0f * unit, -2.0f * unit, 4.0f * unit, 12.0f * unit, 4.0f * unit, 4, 20, 8, 32, 64, 64, alphaInt);
        matrices.pop();
        matrices.push();
        matrices.translate(2.0f * unit, 12.0f * unit - sneakOffset, 0.0f);
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-legSwing * 57.295776f));
        this.renderSkinBox(matrices, -2.0f * unit, -12.0f * unit, -2.0f * unit, 4.0f * unit, 12.0f * unit, 4.0f * unit, 20, 52, 24, 64, 64, 64, alphaInt);
        matrices.pop();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
    }

    private void renderSkinBox(MatrixStack matrices, float x2, float y2, float z2, float width, float height, float depth, int u2, int v2, int u22, int v22, int texWidth, int texHeight, int alpha) {
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        float x1 = x2;
        float y1 = y2;
        float z1 = z2;
        float x22 = x2 + width;
        float y22 = y2 + height;
        float z22 = z2 + depth;
        float w2 = width * 16.0f;
        float h2 = height * 16.0f;
        float d2 = depth * 16.0f;
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        float uMin = (float)u2 / (float)texWidth;
        float vMin = (float)v2 / (float)texHeight;
        float uMax = (float)u22 / (float)texWidth;
        float vMax = (float)v22 / (float)texHeight;
        float frontU1 = ((float)u2 + d2) / (float)texWidth;
        float frontU2 = ((float)u2 + d2 + w2) / (float)texWidth;
        float frontV1 = ((float)v2 + d2) / (float)texHeight;
        float frontV2 = ((float)v2 + d2 + h2) / (float)texHeight;
        buffer.vertex(matrix, x1, y1, z22).texture(frontU1, frontV2).color(255, 255, 255, alpha);
        buffer.vertex(matrix, x22, y1, z22).texture(frontU2, frontV2).color(255, 255, 255, alpha);
        buffer.vertex(matrix, x22, y22, z22).texture(frontU2, frontV1).color(255, 255, 255, alpha);
        buffer.vertex(matrix, x1, y22, z22).texture(frontU1, frontV1).color(255, 255, 255, alpha);
        float backU1 = ((float)u2 + d2 + w2 + d2) / (float)texWidth;
        float backU2 = ((float)u2 + d2 + w2 + d2 + w2) / (float)texWidth;
        float backV1 = ((float)v2 + d2) / (float)texHeight;
        float backV2 = ((float)v2 + d2 + h2) / (float)texHeight;
        buffer.vertex(matrix, x22, y1, z1).texture(backU1, backV2).color(255, 255, 255, alpha);
        buffer.vertex(matrix, x1, y1, z1).texture(backU2, backV2).color(255, 255, 255, alpha);
        buffer.vertex(matrix, x1, y22, z1).texture(backU2, backV1).color(255, 255, 255, alpha);
        buffer.vertex(matrix, x22, y22, z1).texture(backU1, backV1).color(255, 255, 255, alpha);
        float topU1 = ((float)u2 + d2) / (float)texWidth;
        float topU2 = ((float)u2 + d2 + w2) / (float)texWidth;
        float topV1 = (float)v2 / (float)texHeight;
        float topV2 = ((float)v2 + d2) / (float)texHeight;
        buffer.vertex(matrix, x1, y22, z1).texture(topU1, topV1).color(255, 255, 255, alpha);
        buffer.vertex(matrix, x1, y22, z22).texture(topU1, topV2).color(255, 255, 255, alpha);
        buffer.vertex(matrix, x22, y22, z22).texture(topU2, topV2).color(255, 255, 255, alpha);
        buffer.vertex(matrix, x22, y22, z1).texture(topU2, topV1).color(255, 255, 255, alpha);
        float bottomU1 = ((float)u2 + d2 + w2) / (float)texWidth;
        float bottomU2 = ((float)u2 + d2 + w2 + w2) / (float)texWidth;
        float bottomV1 = (float)v2 / (float)texHeight;
        float bottomV2 = ((float)v2 + d2) / (float)texHeight;
        buffer.vertex(matrix, x1, y1, z22).texture(bottomU1, bottomV1).color(255, 255, 255, alpha);
        buffer.vertex(matrix, x1, y1, z1).texture(bottomU1, bottomV2).color(255, 255, 255, alpha);
        buffer.vertex(matrix, x22, y1, z1).texture(bottomU2, bottomV2).color(255, 255, 255, alpha);
        buffer.vertex(matrix, x22, y1, z22).texture(bottomU2, bottomV1).color(255, 255, 255, alpha);
        float rightU1 = (float)u2 / (float)texWidth;
        float rightU2 = ((float)u2 + d2) / (float)texWidth;
        float rightV1 = ((float)v2 + d2) / (float)texHeight;
        float rightV2 = ((float)v2 + d2 + h2) / (float)texHeight;
        buffer.vertex(matrix, x1, y1, z1).texture(rightU1, rightV2).color(255, 255, 255, alpha);
        buffer.vertex(matrix, x1, y1, z22).texture(rightU2, rightV2).color(255, 255, 255, alpha);
        buffer.vertex(matrix, x1, y22, z22).texture(rightU2, rightV1).color(255, 255, 255, alpha);
        buffer.vertex(matrix, x1, y22, z1).texture(rightU1, rightV1).color(255, 255, 255, alpha);
        float leftU1 = ((float)u2 + d2 + w2) / (float)texWidth;
        float leftU2 = ((float)u2 + d2 + w2 + d2) / (float)texWidth;
        float leftV1 = ((float)v2 + d2) / (float)texHeight;
        float leftV2 = ((float)v2 + d2 + h2) / (float)texHeight;
        buffer.vertex(matrix, x22, y1, z22).texture(leftU1, leftV2).color(255, 255, 255, alpha);
        buffer.vertex(matrix, x22, y1, z1).texture(leftU2, leftV2).color(255, 255, 255, alpha);
        buffer.vertex(matrix, x22, y22, z1).texture(leftU2, leftV1).color(255, 255, 255, alpha);
        buffer.vertex(matrix, x22, y22, z22).texture(leftU1, leftV1).color(255, 255, 255, alpha);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
    }

    private void renderWings(MatrixStack matrices, TotemGhost ghost, float progress, float tickDelta, int themeColor, float alpha) {
        float anim = (float)System.currentTimeMillis() / 50.0f * 0.22f * 1.6f + progress * 2.0f;
        float sin = MathHelper.sin((float)anim);
        float cos = MathHelper.cos((float)anim);
        float spreadAngle = 18.0f + progress * 15.0f;
        float pitchAngle = 13.0f + cos * 4.0f;
        float rollAngle = sin * 25.0f;
        if (ghost.sneaking) {
            spreadAngle -= 3.0f;
            pitchAngle += 8.0f;
        }
        int topColor = ColorUtils.setAlphaColor(themeColor, (int)(132.0f * alpha));
        int bottomColor = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.85f), (int)(102.0f * alpha));
        int edgeColor = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.7f), (int)(190.0f * alpha));
        int boneColorA = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.52f), (int)(175.0f * alpha));
        int boneColorB = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.58f), (int)(150.0f * alpha));
        RenderSystem.enableBlend();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)true);
        RenderSystem.blendFunc((int)770, (int)771);
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_COLOR);
        matrices.push();
        float sneakOffset = ghost.sneaking ? 0.25f : 0.0f;
        matrices.translate(0.0f, 1.3f - sneakOffset, -0.08f);
        if (ghost.sneaking) {
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(24.0f));
        }
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
        this.renderButterflyWing(buffer, matrices, 1.0f, spreadAngle, pitchAngle, rollAngle, 1.0f, topColor, bottomColor, edgeColor, boneColorA, boneColorB);
        this.renderButterflyWing(buffer, matrices, -1.0f, spreadAngle, pitchAngle, rollAngle, 1.0f, topColor, bottomColor, edgeColor, boneColorA, boneColorB);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.blendFunc((int)770, (int)1);
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_COLOR);
        int glowA = ColorUtils.setAlphaColor(themeColor, (int)(72.0f * alpha));
        int glowB = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.82f), (int)(66.0f * alpha));
        BufferBuilder glowBuffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
        this.renderButterflyGlow(glowBuffer, matrices, 1.0f, spreadAngle, pitchAngle, rollAngle, 1.0f, glowA, glowB);
        this.renderButterflyGlow(glowBuffer, matrices, -1.0f, spreadAngle, pitchAngle, rollAngle, 1.0f, glowA, glowB);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)glowBuffer.end());
        matrices.pop();
        RenderSystem.enableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
        RenderSystem.depthMask((boolean)true);
    }

    private void renderButterflyWing(BufferBuilder buffer, MatrixStack matrices, float side, float spread, float pitch, float roll, float scale, int topColor, int bottomColor, int edgeColor, int boneColorA, int boneColorB) {
        float root = 0.12f * scale;
        float topW = 1.5f * scale;
        float topH = 0.61f * scale;
        float lowW = 1.1f * scale;
        float lowH = 0.35f * scale;
        matrices.push();
        matrices.translate(0.15f * side, 0.0f, -0.17f);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(side * spread));
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(pitch));
        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(side * roll));
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        this.addDoubleSidedGradientQuad(buffer, matrix, side * root, 0.02f, 0.0f, side * (root + topW * 0.18f), topH * 0.95f, -0.06f, side * (root + topW), topH * 0.3f, -0.13f, side * (root + topW * 0.2f), 0.06f, -0.03f, topColor, bottomColor);
        this.addDoubleSidedGradientQuad(buffer, matrix, side * root, -0.01f, -0.02f, side * (root + lowW * 0.18f), -lowH * 0.94f, -0.1f, side * (root + lowW), -lowH * 0.36f, -0.17f, side * (root + lowW * 0.6f), -0.1f, -0.07f, bottomColor, topColor);
        this.addDoubleSidedQuad(buffer, matrix, side * root, 0.012f, 0.01f, side * root, -0.032f, -0.01f, side * (root + topW * 0.56f), -0.008f, -0.08f, side * (root + topW * 0.56f), 0.008f, -0.04f, edgeColor >> 16 & 0xFF, edgeColor >> 8 & 0xFF, edgeColor & 0xFF, edgeColor >> 24 & 0xFF);
        this.renderWingBoneLine(buffer, matrix, side * root, 0.0f, -0.02f, side * (root + topW * 0.22f), topH * 0.82f, -0.07f, side * (root + topW), topH * 0.3f, -0.13f, 0.016f * scale, boneColorB, boneColorB);
        this.renderWingBoneLine(buffer, matrix, side * root, 0.012f, -0.008f, side * (root + topW * 0.36f), topH * 0.56f, -0.065f, side * (root + topW * 0.86f), topH * 0.26f, -0.115f, 0.012f * scale, boneColorA, boneColorB);
        this.renderWingBoneLine(buffer, matrix, side * root, -0.02f, -0.04f, side * (root + lowW * 0.22f), -lowH * 0.84f, -0.11f, side * (root + lowW), -lowH * 0.34f, -0.18f, 0.009f * scale, boneColorB, boneColorB);
        this.renderWingBoneLine(buffer, matrix, side * root, -0.004f, -0.018f, side * (root + lowW * 0.34f), -lowH * 0.52f, -0.085f, side * (root + lowW * 0.88f), -lowH * 0.3f, -0.145f, 0.01f * scale, boneColorB, boneColorA);
        matrices.pop();
    }

    private void renderButterflyGlow(BufferBuilder buffer, MatrixStack matrices, float side, float spread, float pitch, float roll, float scale, int glowA, int glowB) {
        float root = 0.12f * scale;
        float topW = 1.5f * scale;
        float topH = 0.61f * scale;
        float lowW = 1.1f * scale;
        float lowH = 0.35f * scale;
        matrices.push();
        matrices.translate(0.15f * side, 0.0f, -0.17f);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(side * spread));
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(pitch));
        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(side * roll));
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        this.renderWingBoneLine(buffer, matrix, side * root, 0.0f, -0.02f, side * (root + topW * 0.2f), topH * 0.86f, -0.08f, side * (root + topW), topH * 0.3f, -0.16f, 0.02f * scale, glowA, glowB);
        this.renderWingBoneLine(buffer, matrix, side * root, -0.02f, -0.05f, side * (root + lowW * 0.2f), -lowH * 0.86f, -0.13f, side * (root + lowW), -lowH * 0.32f, -0.2f, 0.018f * scale, glowB, glowA);
        this.renderWingBoneLine(buffer, matrix, side * root, 0.012f, -0.008f, side * (root + topW * 0.36f), topH * 0.56f, -0.07f, side * (root + topW * 0.84f), topH * 0.25f, -0.125f, 0.016f * scale, glowA, glowB);
        matrices.pop();
    }

    private void renderHalo(MatrixStack matrices, TotemGhost ghost, int themeColor, float alpha) {
        float sneakOffset = ghost.sneaking ? 0.25f : 0.0f;
        long nowMs = System.currentTimeMillis();
        double radiansPerMillisecond = 0.0029670597283903604;
        float cameraYaw = TotemAngel.mc.gameRenderer.getCamera().getYaw();
        float cameraPitch = TotemAngel.mc.gameRenderer.getCamera().getPitch();
        double y2 = 1.9f - sneakOffset;
        RenderSystem.enableBlend();
        RenderSystem.disableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.blendFunc((int)770, (int)1);
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_TEX_COLOR);
        RenderSystem.setShaderTexture((int)0, (Identifier)(Object)this.getGlowTexture());
        for (int arm = 0; arm < 2; ++arm) {
            double baseAngle = radiansPerMillisecond * (double)nowMs + (double)arm * Math.PI;
            for (int segment = 0; segment < 17; ++segment) {
                double segmentAngle = baseAngle - (double)segment * 0.11;
                double offsetX = Math.cos(segmentAngle) * (double)0.45f;
                double offsetZ = Math.sin(segmentAngle) * (double)0.45f;
                float progress = (float)segment / (float)Math.max(1, 16);
                float size = 0.23f * (1.0f - progress * 0.7f);
                int segmentAlpha = MathHelper.clamp((int)((int)((float)(255 - segment * 9) * alpha)), (int)0, (int)255);
                int segmentColor = ColorUtils.setAlphaColor(themeColor, segmentAlpha);
                this.renderNimbusBillboard(matrices, ghost.bodyYaw, cameraYaw, cameraPitch, offsetX, y2, offsetZ, size, segmentColor);
            }
        }
        RenderSystem.enableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)true);
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
    }

    private void renderNimbusBillboard(MatrixStack matrices, float bodyYaw, float cameraYaw, float cameraPitch, double x2, double y2, double z2, float size, int color) {
        int a2 = color >> 24 & 0xFF;
        if (a2 <= 0) {
            return;
        }
        int r2 = color >> 16 & 0xFF;
        int g2 = color >> 8 & 0xFF;
        int b2 = color & 0xFF;
        float half = size * 0.5f;
        matrices.push();
        matrices.translate(x2, y2, z2);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(bodyYaw - cameraYaw));
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(cameraPitch));
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        buffer.vertex(matrix, -half, -half, 0.0f).texture(0.0f, 1.0f).color(r2, g2, b2, a2);
        buffer.vertex(matrix, -half, half, 0.0f).texture(0.0f, 0.0f).color(r2, g2, b2, a2);
        buffer.vertex(matrix, half, half, 0.0f).texture(1.0f, 0.0f).color(r2, g2, b2, a2);
        buffer.vertex(matrix, half, -half, 0.0f).texture(1.0f, 1.0f).color(r2, g2, b2, a2);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
        matrices.pop();
    }

    private void addDoubleSidedQuad(BufferBuilder buffer, Matrix4f matrix, float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4, int r2, int g2, int b2, int a2) {
        this.addQuad(buffer, matrix, x1, y1, z1, x2, y2, z2, x3, y3, z3, x4, y4, z4, r2, g2, b2, a2);
        this.addQuad(buffer, matrix, x4, y4, z4, x3, y3, z3, x2, y2, z2, x1, y1, z1, r2, g2, b2, a2);
    }

    private void addDoubleSidedGradientQuad(BufferBuilder buffer, Matrix4f matrix, float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4, int nearColor, int farColor) {
        int nr = nearColor >> 16 & 0xFF;
        int ng = nearColor >> 8 & 0xFF;
        int nb = nearColor & 0xFF;
        int na = nearColor >> 24 & 0xFF;
        int fr = farColor >> 16 & 0xFF;
        int fg = farColor >> 8 & 0xFF;
        int fb = farColor & 0xFF;
        int fa = farColor >> 24 & 0xFF;
        buffer.vertex(matrix, x1, y1, z1).color(nr, ng, nb, na);
        buffer.vertex(matrix, x2, y2, z2).color(fr, fg, fb, fa);
        buffer.vertex(matrix, x3, y3, z3).color(fr, fg, fb, fa);
        buffer.vertex(matrix, x4, y4, z4).color(nr, ng, nb, na);
        buffer.vertex(matrix, x4, y4, z4).color(nr, ng, nb, na);
        buffer.vertex(matrix, x3, y3, z3).color(fr, fg, fb, fa);
        buffer.vertex(matrix, x2, y2, z2).color(fr, fg, fb, fa);
        buffer.vertex(matrix, x1, y1, z1).color(nr, ng, nb, na);
    }

    private void renderWingBoneLine(BufferBuilder buffer, Matrix4f matrix, float x0, float y0, float z0, float x1, float y1, float z1, float x2, float y2, float z2, float thickness, int colorA, int colorB) {
        float vx1 = x1 - x0;
        float vy1 = y1 - y0;
        float len1 = Math.max(1.0E-4f, (float)Math.sqrt(vx1 * vx1 + vy1 * vy1));
        float nx1 = -vy1 / len1 * thickness;
        float ny1 = vx1 / len1 * thickness;
        int aR = colorA >> 16 & 0xFF;
        int aG = colorA >> 8 & 0xFF;
        int aB = colorA & 0xFF;
        int aA = colorA >> 24 & 0xFF;
        int bR = colorB >> 16 & 0xFF;
        int bG = colorB >> 8 & 0xFF;
        int bB = colorB & 0xFF;
        int bA = colorB >> 24 & 0xFF;
        this.addDoubleSidedQuad(buffer, matrix, x0 + nx1, y0 + ny1, z0, x0 - nx1, y0 - ny1, z0, x1 - nx1, y1 - ny1, z1, x1 + nx1, y1 + ny1, z1, aR, aG, aB, aA);
        float vx2 = x2 - x1;
        float vy2 = y2 - y1;
        float len2 = Math.max(1.0E-4f, (float)Math.sqrt(vx2 * vx2 + vy2 * vy2));
        float nx2 = -vy2 / len2 * thickness;
        float ny2 = vx2 / len2 * thickness;
        this.addDoubleSidedQuad(buffer, matrix, x1 + nx2, y1 + ny2, z1, x1 - nx2, y1 - ny2, z1, x2 - nx2, y2 - ny2, z2, x2 + nx2, y2 + ny2, z2, bR, bG, bB, bA);
    }

    private void addQuad(BufferBuilder buffer, Matrix4f matrix, float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4, int r2, int g2, int b2, int a2) {
        buffer.vertex(matrix, x1, y1, z1).color(r2, g2, b2, a2);
        buffer.vertex(matrix, x2, y2, z2).color(r2, g2, b2, a2);
        buffer.vertex(matrix, x3, y3, z3).color(r2, g2, b2, a2);
        buffer.vertex(matrix, x4, y4, z4).color(r2, g2, b2, a2);
    }

    private void renderGlowingPlayerModel(MatrixStack matrices, float r2, float g2, float b2, float alpha, TotemGhost ghost) {
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((int)770, (int)1);
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableCull();
        RenderSystem.setShaderTexture((int)0, (Identifier)(Object)this.getGlowTexture());
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_TEX_COLOR);
        float unit = 0.0625f;
        float sneakOffset = ghost.sneaking ? 0.25f : 0.0f;
        float limbSwing = ghost.limbSwing;
        float limbSwingAmount = Math.min(1.0f, ghost.limbSwingAmount);
        float legSwing = MathHelper.cos((float)(limbSwing * 0.6662f)) * 1.4f * limbSwingAmount;
        float armSwing = MathHelper.cos((float)(limbSwing * 0.6662f + (float)Math.PI)) * 1.4f * limbSwingAmount;
        matrices.push();
        matrices.translate(0.0f, 24.0f * unit - sneakOffset, 0.0f);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(ghost.netHeadYaw));
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(ghost.headPitch));
        this.renderGlowBox(matrices, -4.0f * unit, -8.0f * unit, -4.0f * unit, 8.0f * unit, 8.0f * unit, 8.0f * unit, r2, g2, b2, alpha * 0.1f);
        matrices.pop();
        matrices.push();
        if (ghost.sneaking) {
            matrices.translate(0.0f, 12.0f * unit, 0.0f);
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(25.0f));
            matrices.translate(0.0f, -12.0f * unit, 0.0f);
        }
        this.renderGlowBox(matrices, -4.0f * unit, 12.0f * unit - sneakOffset, -2.0f * unit, 8.0f * unit, 12.0f * unit, 4.0f * unit, r2, g2, b2, alpha * 0.1f);
        matrices.pop();
        float armWidth = 3.0f * unit;
        matrices.push();
        matrices.translate(-4.0f * unit - armWidth / 2.0f, 22.0f * unit - sneakOffset, 0.0f);
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(armSwing * 57.295776f));
        this.renderGlowBox(matrices, -armWidth / 2.0f, -10.0f * unit, -2.0f * unit, armWidth, 12.0f * unit, 4.0f * unit, r2, g2, b2, alpha * 0.1f);
        matrices.pop();
        matrices.push();
        matrices.translate(4.0f * unit + armWidth / 2.0f, 22.0f * unit - sneakOffset, 0.0f);
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-armSwing * 57.295776f));
        this.renderGlowBox(matrices, -armWidth / 2.0f, -10.0f * unit, -2.0f * unit, armWidth, 12.0f * unit, 4.0f * unit, r2, g2, b2, alpha * 0.1f);
        matrices.pop();
        matrices.push();
        matrices.translate(-2.0f * unit, 12.0f * unit, 0.0f);
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(legSwing * 57.295776f));
        this.renderGlowBox(matrices, -2.0f * unit, -12.0f * unit, -2.0f * unit, 4.0f * unit, 12.0f * unit, 4.0f * unit, r2, g2, b2, alpha * 0.1f);
        matrices.pop();
        matrices.push();
        matrices.translate(2.0f * unit, 12.0f * unit, 0.0f);
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-legSwing * 57.295776f));
        this.renderGlowBox(matrices, -2.0f * unit, -12.0f * unit, -2.0f * unit, 4.0f * unit, 12.0f * unit, 4.0f * unit, r2, g2, b2, alpha * 0.1f);
        matrices.pop();
        RenderSystem.enableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)true);
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
    }

    private void renderGlowBox(MatrixStack matrices, float x2, float y2, float z2, float width, float height, float depth, float r2, float g2, float b2, float alpha) {
        float centerX = x2 + width / 2.0f;
        float centerY = y2 + height / 2.0f;
        float centerZ = z2 + depth / 2.0f;
        float glowSize = Math.max(width, Math.max(height, depth)) * 1.8f;
        this.renderGlowSprite(matrices, centerX, centerY, centerZ + depth / 2.0f + 0.01f, glowSize, width, height, r2, g2, b2, alpha);
        this.renderGlowSprite(matrices, centerX, centerY, centerZ - depth / 2.0f - 0.01f, glowSize, width, height, r2, g2, b2, alpha);
        matrices.push();
        matrices.translate(centerX, centerY, centerZ);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90.0f));
        this.renderGlowSpriteRotated(matrices, 0.0f, 0.0f, depth / 2.0f + 0.01f, glowSize, depth, height, r2, g2, b2, alpha);
        this.renderGlowSpriteRotated(matrices, 0.0f, 0.0f, -depth / 2.0f - 0.01f, glowSize, depth, height, r2, g2, b2, alpha);
        matrices.pop();
        matrices.push();
        matrices.translate(centerX, centerY, centerZ);
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90.0f));
        this.renderGlowSpriteRotated(matrices, 0.0f, 0.0f, height / 2.0f + 0.01f, glowSize, width, depth, r2, g2, b2, alpha);
        this.renderGlowSpriteRotated(matrices, 0.0f, 0.0f, -height / 2.0f - 0.01f, glowSize, width, depth, r2, g2, b2, alpha);
        matrices.pop();
        float innerAlpha = alpha * 0.4f;
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_COLOR);
        this.renderSolidBox(matrices, x2, y2, z2, width, height, depth, r2, g2, b2, innerAlpha);
        RenderSystem.setShaderTexture((int)0, (Identifier)(Object)this.getGlowTexture());
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_TEX_COLOR);
    }

    private void renderGlowSprite(MatrixStack matrices, float x2, float y2, float z2, float glowSize, float boxWidth, float boxHeight, float r2, float g2, float b2, float alpha) {
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        int rInt = (int)(r2 * 255.0f);
        int gInt = (int)(g2 * 255.0f);
        int bInt = (int)(b2 * 255.0f);
        int aInt = (int)(MathHelper.clamp((float)alpha, (float)0.0f, (float)1.0f) * 255.0f);
        float halfW = glowSize / 2.0f;
        float halfH = glowSize / 2.0f;
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        buffer.vertex(matrix, x2 - halfW, y2 - halfH, z2).texture(0.0f, 0.0f).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x2 - halfW, y2 + halfH, z2).texture(0.0f, 1.0f).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x2 + halfW, y2 + halfH, z2).texture(1.0f, 1.0f).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x2 + halfW, y2 - halfH, z2).texture(1.0f, 0.0f).color(rInt, gInt, bInt, aInt);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
    }

    private void renderGlowSpriteRotated(MatrixStack matrices, float x2, float y2, float z2, float glowSize, float boxWidth, float boxHeight, float r2, float g2, float b2, float alpha) {
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        int rInt = (int)(r2 * 255.0f);
        int gInt = (int)(g2 * 255.0f);
        int bInt = (int)(b2 * 255.0f);
        int aInt = (int)(MathHelper.clamp((float)alpha, (float)0.0f, (float)1.0f) * 255.0f);
        float halfW = glowSize / 2.0f;
        float halfH = glowSize / 2.0f;
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        buffer.vertex(matrix, x2 - halfW, y2 - halfH, z2).texture(0.0f, 0.0f).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x2 - halfW, y2 + halfH, z2).texture(0.0f, 1.0f).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x2 + halfW, y2 + halfH, z2).texture(1.0f, 1.0f).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x2 + halfW, y2 - halfH, z2).texture(1.0f, 0.0f).color(rInt, gInt, bInt, aInt);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
    }

    private void renderSolidBox(MatrixStack matrices, float x2, float y2, float z2, float width, float height, float depth, float r2, float g2, float b2, float alpha) {
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        float x1 = x2;
        float y1 = y2;
        float z1 = z2;
        float x22 = x2 + width;
        float y22 = y2 + height;
        float z22 = z2 + depth;
        int rInt = (int)(r2 * 255.0f);
        int gInt = (int)(g2 * 255.0f);
        int bInt = (int)(b2 * 255.0f);
        int aInt = (int)(MathHelper.clamp((float)alpha, (float)0.0f, (float)1.0f) * 255.0f);
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
        buffer.vertex(matrix, x1, y1, z22).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x22, y1, z22).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x22, y22, z22).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x1, y22, z22).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x22, y1, z1).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x1, y1, z1).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x1, y22, z1).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x22, y22, z1).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x1, y1, z1).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x1, y1, z22).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x1, y22, z22).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x1, y22, z1).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x22, y1, z22).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x22, y1, z1).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x22, y22, z1).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x22, y22, z22).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x1, y22, z1).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x1, y22, z22).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x22, y22, z22).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x22, y22, z1).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x1, y1, z22).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x1, y1, z1).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x22, y1, z1).color(rInt, gInt, bInt, aInt);
        buffer.vertex(matrix, x22, y1, z22).color(rInt, gInt, bInt, aInt);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
    }

    private float easeOutCubic(float t2) {
        return 1.0f - (float)Math.pow(1.0 - (double)t2, 3.0);
    }

    private float easeInCubic(float t2) {
        return t2 * t2 * t2;
    }

    private record PlayerChatParts(List<ChatSegment> donateSegments, String name, List<ChatSegment> clanSegments) {
    }

    private record ChatSegment(String text, Style style) {
    }

    private static class TotemGhost {
        final Vec3d position;
        final float bodyYaw;
        final float netHeadYaw;
        final float headPitch;
        final float limbSwing;
        final float limbSwingAmount;
        final boolean sneaking;
        final float height;
        final long startTime;

        TotemGhost(Vec3d position, float bodyYaw, float netHeadYaw, float headPitch, float limbSwing, float limbSwingAmount, boolean sneaking, float height, long startTime) {
            this.position = position;
            this.bodyYaw = bodyYaw;
            this.netHeadYaw = netHeadYaw;
            this.headPitch = headPitch;
            this.limbSwing = limbSwing;
            this.limbSwingAmount = limbSwingAmount;
            this.sneaking = sneaking;
            this.height = height;
            this.startTime = startTime;
        }
    }

    private static class SphereParticle {
        private final Vec3d direction;
        private final float spread;
        private final float swirlAmount;
        private final float rotationScale;
        private final float timeScale;
        private final float progressOffset;
        private final int color;

        private SphereParticle(Vec3d direction, float spread, float swirlAmount, float rotationScale, float timeScale, float progressOffset, int color) {
            this.direction = direction;
            this.spread = spread;
            this.swirlAmount = swirlAmount;
            this.rotationScale = rotationScale;
            this.timeScale = timeScale;
            this.progressOffset = progressOffset;
            this.color = color;
        }
    }

    private static class TotemSphereEffect {
        private final Vec3d origin;
        private final long startTime;
        private final float baseRotation;
        private final List<SphereParticle> particles;
        private final List<OrbitLine> orbitLines;

        private TotemSphereEffect(Vec3d origin, long startTime, float baseRotation, List<SphereParticle> particles, List<OrbitLine> orbitLines) {
            this.origin = origin;
            this.startTime = startTime;
            this.baseRotation = baseRotation;
            this.particles = particles;
            this.orbitLines = orbitLines;
        }
    }

    private static class OrbitLine {
        private final float radiusX;
        private final float radiusZ;
        private final float yOffset;
        private final float startDeg;
        private final float arcDeg;
        private final float tiltX;
        private final float tiltZ;
        private final float speedDeg;
        private final float alphaMul;
        private final int startColor;
        private final int endColor;
        private final float baseYaw;

        private OrbitLine(float radiusX, float radiusZ, float yOffset, float startDeg, float arcDeg, float tiltX, float tiltZ, float speedDeg, float alphaMul, int startColor, int endColor) {
            this.radiusX = radiusX;
            this.radiusZ = radiusZ;
            this.yOffset = yOffset;
            this.startDeg = startDeg;
            this.arcDeg = arcDeg;
            this.tiltX = tiltX;
            this.tiltZ = tiltZ;
            this.speedDeg = speedDeg;
            this.alphaMul = alphaMul;
            this.startColor = startColor;
            this.endColor = endColor;
            this.baseYaw = startDeg * 0.35f;
        }
    }
}