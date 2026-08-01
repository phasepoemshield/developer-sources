package fun.nexisdlc.modules.api;

import fun.nexisdlc.NexisClient;
import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.client.utils.client.IMinecraft;
import fun.nexisdlc.client.utils.client.SoundUtil;
import fun.nexisdlc.client.utils.player.ServerUtil;
import fun.nexisdlc.modules.api.settings.api.Setting;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.modules.impl.render.Notifications;
import fun.nexisdlc.modules.impl.utils.SoundFX;
import fun.nexisdlc.ui.hud.NotificationsOverlay;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Formatting;

import java.util.List;
import java.util.Set;

import static fun.nexisdlc.Nexis.noNeedSounds;

@Getter
public abstract class Function implements IMinecraft {

    private static final Set<String> DEV_UIDS = Set.of("1", "2");

    final String name;
    final String description;
    final Category category;
    final boolean needPremium;
    final boolean needDev;

    volatile boolean state;
    @Setter
    int bind;
    final List<Setting<?>> settings = new ObjectArrayList<>();

    public Function() {
        FunctionAdd annotation = getClass().getAnnotation(FunctionAdd.class);
        this.name = annotation.name();
        this.description = annotation.description();
        this.category = annotation.category();
        this.bind = annotation.key();
        this.needPremium = annotation.needPremium();
        this.needDev = annotation.needDev();
    }

    public void addSettings(Setting<?>... settings) {
        this.settings.addAll(List.of(settings));
    }

    public void onEnable() {
        try {
            NexisClient.getEventBus().subscribe(this);
        } catch (Exception e) {
            NexisClient.LOGGER.error("[Function] Failed to subscribe {} to EventBus", name, e);
        }
    }

    public void onDisable() {
        try {
            NexisClient.getEventBus().unsubscribe(this);
        } catch (Exception e) {
            NexisClient.LOGGER.error("[Function] Failed to unsubscribe {} from EventBus", name, e);
        }
    }

    public String getAlias() {
        return getClass().getAnnotation(FunctionAdd.class).alias();
    }

    public final void toggle() {
        setState(!state);
    }

    public final void setState(boolean newState) {
        if (state == newState) {
            return;
        }

        if (newState && needDev && !isDevUser()) {
            return;
        }

        if (newState && needPremium && ServerUtil.anarchyType != 'l') {
            sendMessage("Модуль " + Formatting.GOLD + name + Formatting.RESET + " недоступен без премиум подписки! Приобрести премиум-доступ можно на сайте " + Formatting.GOLD + "https://nexisdlc.fun");
            NotificationsOverlay.push(name + " - недоступен. Это премиум-модуль", 2400, NotificationsOverlay.Kind.COOLDOWN, name);
            return;
        }
        try {
            if (newState) {
                onEnable();
            } else {
                onDisable();
            }
            state = newState;
            if (newState) {
                if (Interface.elements.getByName("Нотификации").get() && !noNeedSounds && NotificationsOverlay.isHudSettingEnabled(Notifications.SETTING_MODULE_ON, true)) {
                    NotificationsOverlay.push("Модуль " + name + " включён", 1200, NotificationsOverlay.Kind.ON, name);
                }
            } else {
                if (Interface.elements.getByName("Нотификации").get() && !noNeedSounds && NotificationsOverlay.isHudSettingEnabled(Notifications.SETTING_MODULE_OFF, true)) {
                    NotificationsOverlay.push("Модуль " + name + " выключен", 1200, NotificationsOverlay.Kind.OFF, name);
                }
            }
            if (!noNeedSounds) {
                SoundFX sounds = NexisClient.getFunctionManager().soundFX;

                if (sounds != null && sounds.isState()) {
                    String fileName = sounds.getFileName(state);
                    float volume = sounds.volume.get();
                    SoundUtil.playSound("functions/" + fileName, volume, false);
                }
            }
        } catch (Exception e) {
            NexisClient.LOGGER.error("[Function] Exception in setState for {}", name, e);
        }
    }

    public static void sendMessage(String message) {
        if (mc.player == null) return;
        if (MinecraftClient.getInstance().inGameHud != null) {
            MinecraftClient.getInstance().inGameHud.getChatHud()
                    .addMessage(net.minecraft.text.Text.literal(message));
        }
    }

    public boolean nullCheck() {
        return mc.player == null || mc.world == null;
    }

    public boolean getState(){
        return state;
    }

    public boolean isState() {
        return state;
    }

    public static boolean isDevUser() {
        String uid = ClientContainer.getUid();
        return uid != null && DEV_UIDS.contains(uid);
    }

    public boolean isVisible() {
        return !needDev || isDevUser();
    }
}
