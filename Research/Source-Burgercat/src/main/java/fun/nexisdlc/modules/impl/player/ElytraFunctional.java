package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.client.EventFireworkUse;
import fun.nexisdlc.client.events.impl.client.FastestEvent;
import fun.nexisdlc.client.events.impl.player.RotationEvent;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.util.math.Vec3d;

import java.awt.*;

@FunctionAdd(name = "ElytraFunctional", alias = "Elytra Functional", category = Category.Player, description = "Бустер, авто-старт, предикт и анти-аим для элитры")
public class ElytraFunctional extends Function {
    public static BooleanSetting autoJump = new BooleanSetting("Авто-прыжок", false);

    public static BooleanSetting elytraBooster = new BooleanSetting("Элитра-бустер", false);
    ModeSetting elytraBoosterMode = new ModeSetting("Режим элитрабустера", "Обычный", "Обычный", "По BPS").setVisible(() -> elytraBooster.get());
    SliderSetting elytraBoosterBPS = new SliderSetting(
            "Ограничение BPS", 2, 1, 3, 0.1f).setVisible(() -> elytraBooster.get() && elytraBoosterMode.is("По BPS"));
    SliderSetting defaultModeBoost = new SliderSetting("Скорость обычного режима", 0.2f, 0.1f, 1f, 0.05f).setVisible(() -> elytraBooster.get() && elytraBoosterMode.is("Обычный"));

    public static BooleanSetting predict = new BooleanSetting("Предикт позиции", true);
    public static SliderSetting predictValue = new SliderSetting(
            "Значение предикта", 1.6f, 0, 5, 0.1f).setVisible(() -> predict.get());

    public static BooleanSetting bpsValueOnScreen = new BooleanSetting("Отображать значение BPS", true);
    public static BooleanSetting elytraAntiAim = new BooleanSetting("Анти-аим", false);
    public static BooleanSetting smartAntiAim = new BooleanSetting("Умный антиаим", false).setVisible(() -> elytraAntiAim.get());
    public static SliderSetting elytraAntiAimDuration = new SliderSetting(
            "Длительность антиаима", 400f, 10, 550, 10f).setVisible(() -> elytraAntiAim.get());
    public static SliderSetting elytraAntiAimPitch = new SliderSetting(
            "Высота антиаима", -36f, -90, 90, 1f).setVisible(() -> elytraAntiAim.get());

    public ElytraFunctional() {
        addSettings(autoJump, elytraBooster, elytraBoosterMode, elytraBoosterBPS, defaultModeBoost, predict,
                predictValue, bpsValueOnScreen, elytraAntiAim, smartAntiAim, elytraAntiAimDuration, elytraAntiAimPitch);
    }

    @EventHandler
    public void onFirework(EventFireworkUse e) {
        if (nullCheck()) return;
        if (!elytraBooster.get()) return;

        float pitch = PlayerUtils.getGlobalPitch();
        float yaw = PlayerUtils.getGlobalYaw();

        float normalizedYaw = yaw % 180.0F;
        if (normalizedYaw > 90.0F) {
            normalizedYaw -= 180.0F;
        } else if (normalizedYaw < -90.0F) {
            normalizedYaw += 180.0F;
        }

        if (mc.player.isGliding()) {
            if (PlayerUtils.getBPS() < 45)
                mc.player.setVelocity(mc.player.getVelocity().multiply(defaultModeBoost.get()));
        }

        if (elytraBoosterMode.is("Обычный")) {
            int ff = RotationEvent.getLastRotationEvent().getYaw() > 0F ? 45 : -45;
            double acceleration = Math.abs((RotationEvent.getLastRotationEvent().getYaw() + ff) % 90 - ff) / 45,
                    boost = defaultModeBoost.get() + 0.1f + (0.22 * acceleration * acceleration);
            boolean yAcceleration = Math.abs(RotationEvent.getLastRotationEvent().getPitch()) > 60;
            Vec3d vec3d = e.getVector();
            e.setVector(new Vec3d(vec3d.x * boost, yAcceleration ? vec3d.y * 0.9f : vec3d.y, vec3d.z * boost));

        } else if (elytraBoosterMode.is("По BPS")) {
            e.setVector(getStableBPSVector());
        }

        e.cancel();
    }

    @EventHandler
    public void onFastest(FastestEvent event) {
        if (nullCheck()) return;
        if (!autoJump.get()) return;

        if (checkElytra()) {
            if (mc.player.isOnGround()) {
                mc.player.jump();
            } else if (mc.player.getEquippedStack(EquipmentSlot.CHEST).isOf(Items.ELYTRA) && !mc.player.isGliding()) {
                mc.player.startGliding();
                mc.getNetworkHandler().sendPacket(new ClientCommandC2SPacket(mc.player, ClientCommandC2SPacket.Mode.START_FALL_FLYING));
            }
        }
    }

    @EventHandler
    public void onRenderScreen(EventRender.Screen.UnderHud event) {
        if (nullCheck()) return;
        if (!bpsValueOnScreen.get()) return;
        if (!mc.player.isGliding()) return;

        float width = event.getViewportWidth();
        float height = event.getViewportHeight();

        String bps = String.format("%.1f", PlayerUtils.getBPS()) + " BPS";
        float fontSize = 17f;
        float textWidth = FontRegistry.SF_SEMIBOLD.getWidth(bps, fontSize);
        float textHeight = FontRegistry.SF_SEMIBOLD.getLineHeight(fontSize);

        float padX = 7f;
        float padY = 4f;
        float panelWidth = textWidth + padX * 2f;
        float panelHeight = textHeight + padY * 2f;
        float x = width * 0.5f - panelWidth * 0.5f;
        float y = height * 0.5f + 20f;
        float rounding = 4f;

        Color animStartColor = ColorUtils.gradient(ClientColors.GRADIENT_START, ClientColors.GRADIENT_END, 4, 0);
        Color animEndColor = ColorUtils.gradient(ClientColors.GRADIENT_END, ClientColors.GRADIENT_START, 4, 90);

        var bps1 = String.format("%.1f", PlayerUtils.getBPS());

        event.getRenderer().blur(x, y, panelWidth, panelHeight, rounding);
        event.getRenderer().rect(x, y, panelWidth, panelHeight, rounding, ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), 1));
        event.getRenderer().gradientText(FontRegistry.SF_SEMIBOLD, x + padX, y + padY + 16, fontSize, bps1,
                animStartColor.getRGB(), animEndColor.getRGB());

        event.getRenderer().text(FontRegistry.SF_SEMIBOLD, x + padX + FontRegistry.SF_SEMIBOLD.getWidth(bps1, fontSize), y + padY + 16, fontSize, " BPS", Color.WHITE.getRGB());

    }

    boolean checkElytra() {
        if (!mc.player.hasVehicle() && !mc.player.isClimbing()) {
            ItemStack is = mc.player.getEquippedStack(EquipmentSlot.CHEST);
            return is.isOf(Items.ELYTRA);
        }
        return false;
    }

    private Vec3d getStableBPSVector() {
        double targetBPS = elytraBoosterBPS.get();
        double currentBPS = PlayerUtils.getBPS();

        float yaw = PlayerUtils.getGlobalYaw();
        float pitch = PlayerUtils.getGlobalPitch();

        double dirX = -Math.sin(Math.toRadians(yaw)) * Math.cos(Math.toRadians(pitch));
        double dirY = -Math.sin(Math.toRadians(pitch));
        double dirZ = Math.cos(Math.toRadians(yaw)) * Math.cos(Math.toRadians(pitch));

        Vec3d direction = new Vec3d(dirX, dirY, dirZ).normalize();

        double multiplier = targetBPS * 0.062;

        if (currentBPS > targetBPS + 0.05) {
            multiplier *= 0.75;
        } else if (currentBPS < targetBPS - 0.15) {
            multiplier *= 1.6;
        } else if (currentBPS < targetBPS) {
            multiplier *= 1.15;
        }

        return direction.multiply(multiplier);
    }
}
