package fun.wonderful.client.modules.impl.movement;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.FloatSetting;

public class TpBack
extends Module {
    public static TpBack INSTANCE = new TpBack();
    private boolean isDead = false;
    private boolean waitingForRespawn = false;
    private int tickCounter = 0;
    public FloatSetting delay = new FloatSetting("Задержка", 5.0f, 1.0f, 20.0f, 1.0f);

    public TpBack() {
        super("TpBack", "Возвращает на точки смерти", Module.ModuleCategory.MOVEMENT);
        this.addSettings(this.delay);
    }

    @EventLink
    public void onEvent(EventUpdate event) {
        if (TpBack.mc.player == null || TpBack.mc.world == null) {
            return;
        }
        boolean playerDead = TpBack.mc.player.getHealth() <= 0.0f & TpBack.mc.player.deathTime > 0;
        if (playerDead && !this.isDead) {
            this.isDead = true;
            TpBack.mc.player.networkHandler.sendChatMessage("/sethome wonderful");
            TpBack.mc.player.requestRespawn();
            this.waitingForRespawn = true;
            this.tickCounter = 0;
        }
        if (this.waitingForRespawn && !playerDead) {
            ++this.tickCounter;
            if ((float)this.tickCounter >= this.delay.get()) {
                TpBack.mc.player.networkHandler.sendChatMessage("/home wonderful");
                this.waitingForRespawn = false;
                this.tickCounter = 0;
            }
        }
        if (!playerDead && !this.waitingForRespawn) {
            this.isDead = false;
        }
    }
}