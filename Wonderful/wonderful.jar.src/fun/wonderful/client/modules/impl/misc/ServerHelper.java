package fun.wonderful.client.modules.impl.misc;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventBinding;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BindSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import java.util.List;
import java.util.Locale;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.consume.UseAction;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import ru.ocz.protection.annotation.Compile;

public class ServerHelper
extends Module {
    public static ServerHelper INSTANCE = new ServerHelper();
    private final ModeSetting mode = new ModeSetting("Режим", "Lony", "Lony", "Spooky", "HolyWorld");
    private final BindSetting featherKey = new BindSetting("Перышко", -1).visible(() -> this.mode.is("Lony"));
    private final BindSetting magmaKey = new BindSetting("Ливалка", -1).visible(() -> this.mode.is("Lony"));
    private final BindSetting cryingObsidianKey = new BindSetting("Трапка", -1).visible(() -> this.mode.is("Lony"));
    private final BindSetting clayKey = new BindSetting("Ливалка с платформой", -1).visible(() -> this.mode.is("Lony"));
    private final BindSetting disorientationKey = new BindSetting("Дезориентация", -1).visible(() -> this.mode.is("Spooky"));
    private final BindSetting trapKey = new BindSetting("Трапка", -1).visible(() -> this.mode.is("Spooky"));
    private final BindSetting plastKey = new BindSetting("Пласт", -1).visible(() -> this.mode.is("Spooky"));
    private final BindSetting pilKey = new BindSetting("Явная пыль", -1).visible(() -> this.mode.is("Spooky"));
    private final BindSetting snegKey = new BindSetting("Снег заморозки", -1).visible(() -> this.mode.is("Spooky"));
    private final BindSetting auraKey = new BindSetting("Божья аура", -1).visible(() -> this.mode.is("Spooky"));
    private final BindSetting holySnowballKey = new BindSetting("Ком снега", -1).visible(() -> this.mode.is("HolyWorld"));
    private final BindSetting holyStunKey = new BindSetting("Стан", -1).visible(() -> this.mode.is("HolyWorld"));
    private final BindSetting holyExplosionThingKey = new BindSetting("Взрывная штучка", -1).visible(() -> this.mode.is("HolyWorld"));
    private final BindSetting holyExplosionTrapKey = new BindSetting("Взрывная трапка", -1).visible(() -> this.mode.is("HolyWorld"));
    private final BindSetting holyTrapKey = new BindSetting("Трапка", -1).visible(() -> this.mode.is("HolyWorld"));
    private Item pendingItem;
    private Action pendingAction;

    public ServerHelper() {
        super("ServerHelper", "Помощник для серверов", Module.ModuleCategory.MISC);
        this.addSettings(this.mode, this.featherKey, this.magmaKey, this.cryingObsidianKey, this.clayKey, this.disorientationKey, this.trapKey, this.plastKey, this.pilKey, this.snegKey, this.auraKey, this.holySnowballKey, this.holyStunKey, this.holyExplosionThingKey, this.holyExplosionTrapKey, this.holyTrapKey);
    }

    public boolean isSpookyMode() {
        return this.mode.is("Spooky");
    }

    public boolean isLonyMode() {
        return this.mode.is("Lony");
    }

    public boolean isHolyWorldMode() {
        return this.mode.is("HolyWorld");
    }

    public List<HelperBind> getActiveHelperBinds() {
        if (this.isLonyMode()) {
            return this.getLonyHelperBinds();
        }
        if (this.isHolyWorldMode()) {
            return this.getHolyWorldHelperBinds();
        }
        return this.getSpookyHelperBinds();
    }

    public List<HelperBind> getLonyHelperBinds() {
        return List.of(new HelperBind("Перышко", Items.FEATHER, this.featherKey), new HelperBind("Ливалка", Items.MAGMA_CREAM, this.magmaKey), new HelperBind("Трапка", Items.CRYING_OBSIDIAN, this.cryingObsidianKey), new HelperBind("Ливалка с платформой", Items.CLAY, this.clayKey));
    }

    public List<HelperBind> getSpookyHelperBinds() {
        return List.of(new HelperBind("Дезориентация", Items.ENDER_EYE, this.disorientationKey), new HelperBind("Трапка", Items.NETHERITE_SCRAP, this.trapKey), new HelperBind("Пласт", Items.DRIED_KELP, this.plastKey), new HelperBind("Явная пыль", Items.SUGAR, this.pilKey), new HelperBind("Снег заморозки", Items.SNOWBALL, this.snegKey), new HelperBind("Божья аура", Items.PHANTOM_MEMBRANE, this.auraKey));
    }

    public List<HelperBind> getHolyWorldHelperBinds() {
        return List.of(new HelperBind("Ком снега", Items.SNOWBALL, this.holySnowballKey), new HelperBind("Стан", Items.NETHER_STAR, this.holyStunKey), new HelperBind("Взрывная штучка", Items.FIRE_CHARGE, this.holyExplosionThingKey), new HelperBind("Взрывная трапка", Items.PRISMARINE_SHARD, this.holyExplosionTrapKey), new HelperBind("Трапка", Items.POPPED_CHORUS_FRUIT, this.holyTrapKey));
    }

    @Override
    public void onEnable() {
        this.pendingItem = null;
        this.pendingAction = null;
        super.onEnable();
    }

    @Override
    public void onDisable() {
        this.pendingItem = null;
        this.pendingAction = null;
        super.onDisable();
    }

    @EventLink
    public void onBinding(EventBinding event) {
        if (ServerHelper.mc.currentScreen != null) {
            return;
        }
        if (this.mode.is("Lony")) {
            if (event.getKey() == this.featherKey.getKey()) {
                this.pendingItem = Items.FEATHER;
            } else if (event.getKey() == this.magmaKey.getKey()) {
                this.pendingItem = Items.MAGMA_CREAM;
            } else if (event.getKey() == this.cryingObsidianKey.getKey()) {
                this.pendingItem = Items.CRYING_OBSIDIAN;
            } else if (event.getKey() == this.clayKey.getKey()) {
                this.pendingItem = Items.CLAY_BALL;
            }
            return;
        }
        if (this.mode.is("Spooky")) {
            if (event.getKey() == this.disorientationKey.getKey()) {
                this.pendingAction = Action.DISORIENTATION;
            } else if (event.getKey() == this.trapKey.getKey()) {
                this.pendingAction = Action.TRAP;
            } else if (event.getKey() == this.plastKey.getKey()) {
                this.pendingAction = Action.PLAST;
            } else if (event.getKey() == this.pilKey.getKey()) {
                this.pendingAction = Action.DUST;
            } else if (event.getKey() == this.snegKey.getKey()) {
                this.pendingAction = Action.FREEZE_SNOW;
            } else if (event.getKey() == this.auraKey.getKey()) {
                this.pendingAction = Action.AURA;
            }
            return;
        }
        if (this.mode.is("HolyWorld")) {
            if (event.getKey() == this.holySnowballKey.getKey()) {
                this.pendingAction = Action.HOLY_SNOWBALL;
            } else if (event.getKey() == this.holyStunKey.getKey()) {
                this.pendingAction = Action.HOLY_STUN;
            } else if (event.getKey() == this.holyExplosionThingKey.getKey()) {
                this.pendingAction = Action.HOLY_EXPLOSION_THING;
            } else if (event.getKey() == this.holyExplosionTrapKey.getKey()) {
                this.pendingAction = Action.HOLY_EXPLOSION_TRAP;
            } else if (event.getKey() == this.holyTrapKey.getKey()) {
                this.pendingAction = Action.HOLY_TRAP;
            }
        }
    }

    @EventLink
    @Compile
    public native void onUpdate(EventUpdate var1);

    @Compile
    private native void useAction(Action var1);

    private void useFromInventory(int inventorySlot) {
        int previousSlot = ServerHelper.mc.player.getInventory().selectedSlot;
        int hotbarSlot = this.findTemporaryHotbarSlot();
        boolean wasSprinting = false;
        if (ServerHelper.mc.player.isSprinting()) {
            ServerHelper.mc.player.networkHandler.sendPacket((Packet)new PlayerInputC2SPacket(new PlayerInput(false, false, false, false, false, false, false)));
            ServerHelper.mc.player.setSprinting(false);
            ServerHelper.mc.player.networkHandler.sendPacket((Packet)new ClientCommandC2SPacket((Entity)ServerHelper.mc.player, ClientCommandC2SPacket.class_2849.STOP_SPRINTING));
            if (!ModuleClass.sprint.isEnable()) {
                ServerHelper.mc.options.sprintKey.setPressed(false);
            }
            wasSprinting = true;
        }
        ServerHelper.mc.interactionManager.clickSlot(0, inventorySlot, hotbarSlot, SlotActionType.SWAP, (PlayerEntity)ServerHelper.mc.player);
        ServerHelper.mc.player.networkHandler.sendPacket((Packet)new CloseHandledScreenC2SPacket(0));
        ServerHelper.mc.player.networkHandler.sendPacket((Packet)new UpdateSelectedSlotC2SPacket(hotbarSlot));
        ServerHelper.mc.interactionManager.interactItem((PlayerEntity)ServerHelper.mc.player, Hand.MAIN_HAND);
        ServerHelper.mc.player.swingHand(Hand.MAIN_HAND);
        ServerHelper.mc.player.networkHandler.sendPacket((Packet)new UpdateSelectedSlotC2SPacket(previousSlot));
        ServerHelper.mc.interactionManager.clickSlot(0, inventorySlot, hotbarSlot, SlotActionType.SWAP, (PlayerEntity)ServerHelper.mc.player);
        ServerHelper.mc.player.networkHandler.sendPacket((Packet)new CloseHandledScreenC2SPacket(0));
        if (wasSprinting) {
            ServerHelper.mc.player.networkHandler.sendPacket((Packet)new PlayerInputC2SPacket(ServerHelper.mc.player.input.playerInput));
        }
    }

    private int findTemporaryHotbarSlot() {
        int fallback = 8;
        for (int slot = 0; slot < 9; ++slot) {
            if (slot == ServerHelper.mc.player.getInventory().selectedSlot) continue;
            ItemStack stack = ServerHelper.mc.player.getInventory().getStack(slot);
            if (stack.isEmpty()) {
                return slot;
            }
            if (stack.getUseAction() != UseAction.NONE) continue;
            fallback = slot;
        }
        return fallback;
    }

    private int findMatchingSlot(Action action, int start, int end) {
        for (int slot = start; slot <= end; ++slot) {
            if (!this.matchesAction(ServerHelper.mc.player.getInventory().getStack(slot), action)) continue;
            return slot;
        }
        return -1;
    }

    private boolean matchesAction(ItemStack stack, Action action) {
        if (stack == null || stack.isEmpty() || stack.getItem() != action.item) {
            return false;
        }
        return action.query.isEmpty() || stack.getName().getString().toLowerCase(Locale.ROOT).contains(action.query);
    }

        return "У предмета " + string + " есть кд";
    }

    public record HelperBind(String name, Item item, BindSetting bind) {
    }

    private static enum Action {
        DISORIENTATION("дезориентация", "дезориентации", Items.ENDER_EYE, "Использовал дезориентацию!", "Дезориентация не найдена!"),
        TRAP("трапка", "трапки", Items.NETHERITE_SCRAP, "Использовал трапку!", "Трапка не найдена!"),
        PLAST("пласт", "пласта", Items.DRIED_KELP, "Использовал пласт!", "Пласт не найден!"),
        DUST("явная пыль", "пыли", Items.SUGAR, "Использовал пыль!", "Пыль не найдена!"),
        FREEZE_SNOW("заморозка", "снега", Items.SNOWBALL, "Использовал снег!", "Снег не найден!"),
        AURA("божья", "ауры", Items.PHANTOM_MEMBRANE, "Использовал ауру!", "Аура не найдена!"),
        HOLY_SNOWBALL("", "кома снега", Items.SNOWBALL, "Использовал ком снега!", "Ком снега не найден!"),
        HOLY_STUN("", "стана", Items.NETHER_STAR, "Использовал стан!", "Стан не найден!"),
        HOLY_EXPLOSION_THING("", "взрывной штучки", Items.FIRE_CHARGE, "Использовал взрывную штучку!", "Взрывная штучка не найдена!"),
        HOLY_EXPLOSION_TRAP("", "взрывной трапки", Items.PRISMARINE_SHARD, "Использовал взрывную трапку!", "Взрывная трапка не найдена!"),
        HOLY_TRAP("", "трапки", Items.POPPED_CHORUS_FRUIT, "Использовал трапку!", "Трапка не найдена!");

        private final String query;
        private final String cooldownName;
        private final Item item;
        private final String successText;
        private final String failText;

        private Action(String query, String cooldownName, Item item, String successText, String failText) {
            this.query = query;
            this.cooldownName = cooldownName;
            this.item = item;
            this.successText = successText;
            this.failText = failText;
        }
    }
}