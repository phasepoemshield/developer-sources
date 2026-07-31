package sky.core.module.impl.visuals;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import sky.core.module.Category;
import sky.core.module.Module;
import sky.core.module.setting.BooleanSetting;
import sky.core.module.setting.MultiBooleanSetting;

public final class NoRender extends Module {
    public static final NoRender INSTANCE = new NoRender();

    public final MultiBooleanSetting mode = new MultiBooleanSetting(
            "Применять на",
            new BooleanSetting("Скорборд", true),
            new BooleanSetting("Удочка на экране", true),
            new BooleanSetting("Босс-бар", true),
            new BooleanSetting("Частицы разрушения", true),
            new BooleanSetting("Дождь", true),
            new BooleanSetting("Камера клип", true),
            new BooleanSetting("Тени", true),
            new BooleanSetting("Дым", true),
            new BooleanSetting("Снесение тотема", true),
            new BooleanSetting("Виньетка", true),
            new BooleanSetting("Стрелы в игроке", true),
            new BooleanSetting("Голограммы", true),
            new BooleanSetting("Трава", true),
            new BooleanSetting("Плохие эффекты", true),
            new BooleanSetting("Свечение игроков", true),
            new BooleanSetting("Размытие под водой", true),
            new BooleanSetting("Огонь", true),
            new BooleanSetting("Тайтлы", true)
    );

    private boolean lastGrass = false;
    private boolean eventsRegistered;

    private NoRender() {
        super("NoRender", "Увеличивает FPS, убирая лишние визуальные эффекты", Category.VISUALS);
        this.addSettings(this.mode);
    }

    public void registerTickEvents() {
        if (this.eventsRegistered) {
            return;
        }
        this.eventsRegistered = true;
        ClientTickEvents.END_CLIENT_TICK.register(this::onTick);
    }

    private void onTick(MinecraftClient client) {
        boolean grass = this.mode.is("Трава");
        if (grass != this.lastGrass) {
            this.lastGrass = grass;
            this.reloadTerrain(client);
        }
    }

    @Override
    protected void onEnable() {
        super.onEnable();
        this.reloadTerrain(MinecraftClient.getInstance());
    }

    @Override
    protected void onDisable() {
        super.onDisable();
        this.reloadTerrain(MinecraftClient.getInstance());
    }

    private void reloadTerrain(MinecraftClient client) {
        if (client.world != null && client.worldRenderer != null) {
            client.worldRenderer.scheduleTerrainUpdate();
        }
    }
}
