package fun.wonderful.client.modules.impl.misc;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.text.Text;

public class DeathCoord
extends Module {
    public static DeathCoord INSTANCE = new DeathCoord();
    private final BooleanSetting copyToClipboard = new BooleanSetting("Копировать в буфер", true);
    private BlockPos deathPos = null;
    private boolean isDead = false;

    public DeathCoord() {
        super("DeathCoord", "Показывает координаты смерти", Module.ModuleCategory.MISC);
        this.addSettings(this.copyToClipboard);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        this.isDead = false;
        this.deathPos = null;
    }

    @EventLink
    public void onUpdate(EventUpdate event) {
        if (DeathCoord.mc.player == null || DeathCoord.mc.world == null) {
            return;
        }
        if (DeathCoord.mc.player.getHealth() <= 0.0f && !this.isDead) {
            this.isDead = true;
            this.deathPos = DeathCoord.mc.player.getBlockPos();
            String coords = "X: " + this.deathPos.getX() + " Y: " + this.deathPos.getY() + " Z: " + this.deathPos.getZ();
            String dimension = this.getDimension();
            String message = "§cВы умерли! §f" + coords + " §7(" + dimension + ")";
            DeathCoord.mc.player.sendMessage((Text)Text.literal((String)message), false);
            if (this.copyToClipboard.isState()) {
                DeathCoord.mc.keyboard.setClipboard(this.deathPos.getX() + " " + this.deathPos.getY() + " " + this.deathPos.getZ());
            }
        }
        if (DeathCoord.mc.player.getHealth() > 0.0f && this.isDead) {
            this.isDead = false;
        }
    }

    private String getDimension() {
        if (DeathCoord.mc.world == null) {
            return "Unknown";
        }
        String dimension = DeathCoord.mc.world.getRegistryKey().getValue().toString();
        if (dimension.contains("overworld")) {
            return "Overworld";
        }
        if (dimension.contains("nether")) {
            return "Nether";
        }
        if (dimension.contains("end")) {
            return "End";
        }
        return dimension;
    }

    @Override
    public void onDisable() {
        super.onDisable();
        this.isDead = false;
        this.deathPos = null;
    }
}