package fun.wonderful.client.modules.impl.player;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventPacket;
import fun.wonderful.api.events.implement.EventRender;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.utils.chat.ChatUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.ListSetting;
import fun.wonderful.mixin.SlotAccessor;
import java.util.List;
import java.util.Locale;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.DataComponentTypes;

public class CatchItems
extends Module {
    public static final CatchItems INSTANCE = new CatchItems();
    private static final int INVENTORY_SIZE = 36;
    private static final float LOCK_SIZE = 12.0f;
    private static final float LOCK_MARGIN = 8.0f;
    private final ListSetting modes = new ListSetting("Предметы", new BooleanSetting("Элитры", true), new BooleanSetting("Шары", true), new BooleanSetting("Осколки", true), new BooleanSetting("Мечи", true), new BooleanSetting("Сферы", true), new BooleanSetting("Талисманы", true));
    private final boolean[] armedSlots = new boolean[36];
    private final boolean[] lockedSlots = new boolean[36];
    private final String[] lockedNames = new String[36];
    private float lockButtonX;
    private float lockButtonY;

    public CatchItems() {
        super("CatchItems", "Блокирует выбрасывание некоторых предметов", Module.ModuleCategory.PLAYER);
        this.addSettings(this.modes);
    }

    @Override
    public void onDisable() {
        this.resetState();
        super.onDisable();
    }

    @EventLink
    public void onUpdate(EventUpdate event) {
        if (CatchItems.mc.player == null) {
            this.resetState();
            return;
        }
        for (int slot = 0; slot < 36; ++slot) {
            ItemStack stack = CatchItems.mc.player.getInventory().getStack(slot);
            if (this.lockedSlots[slot] && !this.isProtected(stack)) {
                this.armedSlots[slot] = false;
                this.lockedSlots[slot] = false;
                this.lockedNames[slot] = null;
                continue;
            }
            if (!this.armedSlots[slot] || this.lockedSlots[slot] || !this.isProtected(stack)) continue;
            this.lockedSlots[slot] = true;
            this.lockedNames[slot] = stack.getName().getString();
            ChatUtils.sendMessage("CatchItems: locked " + this.lockedNames[slot] + " in slot " + this.getDisplaySlot(slot));
        }
    }

    @EventLink
    public void onPacket(EventPacket event) {
        if (CatchItems.mc.player == null || event.getType() != EventPacket.Type.SEND) {
            return;
        }
        DropAttempt drop = this.getDropAttempt(event);
        if (drop == null || drop.inventorySlot < 0 || drop.inventorySlot >= 36) {
            return;
        }
        if (this.lockedSlots[drop.inventorySlot]) {
            event.cancel();
            ChatUtils.sendMessage("CatchItems: drop blocked in slot " + this.getDisplaySlot(drop.inventorySlot));
            return;
        }
        this.rememberDrop(drop.inventorySlot);
    }

    @EventLink
    public void onRender2D(EventRender.Default event) {
        if (CatchItems.mc.currentScreen instanceof HandledScreen) {
            return;
        }
        this.renderLockOverlay(event.getContext());
    }

    public void renderLockOverlay(DrawContext context) {
        if (!this.isEnable() || CatchItems.mc.player == null || !this.hasLockedSlots()) {
            return;
        }
        this.drawLockButton(context, this.getDefaultLockX(), this.getDefaultLockY());
    }

    public void renderInventoryLocks(DrawContext context, int screenX, int screenY, int backgroundWidth, List<Slot> slots) {
        if (!this.isEnable() || CatchItems.mc.player == null || !this.hasLockedSlots()) {
            return;
        }
        for (Slot slot : slots) {
            int inventorySlot = this.getInventorySlot(slot);
            if (inventorySlot < 0 || !this.lockedSlots[inventorySlot]) continue;
            int x2 = screenX + slot.x;
            int y2 = screenY + slot.y;
            context.fill(x2 - 1, y2 - 1, x2 + 17, y2, -43691);
            context.fill(x2 - 1, y2 + 16, x2 + 17, y2 + 17, -43691);
            context.fill(x2 - 1, y2, x2, y2 + 16, -43691);
            context.fill(x2 + 16, y2, x2 + 17, y2 + 16, -43691);
        }
        this.drawLockButton(context, (float)screenX + 161.0f, (float)screenY + 5.0f);
    }

    private void drawLockButton(DrawContext context, float x2, float y2) {
        this.lockButtonX = x2;
        this.lockButtonY = y2;
    }

    public boolean handleInventoryThrow(Slot slot, SlotActionType actionType) {
        if (!this.isEnable() || CatchItems.mc.player == null || actionType != SlotActionType.THROW || slot == null) {
            return false;
        }
        int inventorySlot = this.getInventorySlot(slot);
        if (inventorySlot < 0 || inventorySlot >= 36) {
            return false;
        }
        ItemStack stack = slot.getStack();
        if (this.lockedSlots[inventorySlot]) {
            ChatUtils.sendMessage("CatchItems: drop blocked in slot " + this.getDisplaySlot(inventorySlot));
            return true;
        }
        if (this.armedSlots[inventorySlot] && this.isProtected(stack)) {
            this.lockedSlots[inventorySlot] = true;
            this.lockedNames[inventorySlot] = stack.getName().getString();
            ChatUtils.sendMessage("CatchItems: locked " + this.lockedNames[inventorySlot] + " in slot " + this.getDisplaySlot(inventorySlot));
            return true;
        }
        this.armedSlots[inventorySlot] = true;
        return false;
    }

    public boolean handleHudClick(int button, int action, double mouseX, double mouseY) {
        if (!this.isEnable() || button != 0 || action != 1 || !this.hasLockedSlots()) {
            return false;
        }
        if (mouseX < (double)this.lockButtonX || mouseX > (double)(this.lockButtonX + 12.0f) || mouseY < (double)this.lockButtonY || mouseY > (double)(this.lockButtonY + 12.0f)) {
            return false;
        }
        this.resetState();
        ChatUtils.sendMessage("CatchItems: lock disabled");
        return true;
    }

    private DropAttempt getDropAttempt(EventPacket event) {
        ClickSlotC2SPacket packet;
        Packet<?> class_25962 = event.getPacket();
        if (class_25962 instanceof PlayerActionC2SPacket) {
            PlayerActionC2SPacket packet2 = (PlayerActionC2SPacket)class_25962;
            if (CatchItems.mc.currentScreen instanceof HandledScreen) {
                return null;
            }
            if (packet2.getAction() != PlayerActionC2SPacket.Action.DROP_ITEM && packet2.getAction() != PlayerActionC2SPacket.Action.DROP_ALL_ITEMS) {
                return null;
            }
            int slot = CatchItems.mc.player.getInventory().selectedSlot;
            return new DropAttempt(slot);
        }
        Packet<?> slot = event.getPacket();
        if (slot instanceof ClickSlotC2SPacket && (packet = (ClickSlotC2SPacket)slot).getActionType() == SlotActionType.THROW) {
            int slot2 = this.getInventorySlotFromClick(packet.getSlot());
            if (slot2 == -1) {
                return null;
            }
            return new DropAttempt(slot2);
        }
        return null;
    }

    private void rememberDrop(int slot) {
        this.armedSlots[slot] = true;
    }

    private int getInventorySlotFromClick(int slotId) {
        if (CatchItems.mc.player == null || slotId < 0 || slotId >= CatchItems.mc.player.currentScreenHandler.slots.size()) {
            return -1;
        }
        return this.getInventorySlot(CatchItems.mc.player.currentScreenHandler.getSlot(slotId));
    }

    private int getInventorySlot(Slot slot) {
        if (CatchItems.mc.player == null || slot == null) {
            return -1;
        }
        SlotAccessor accessor = (SlotAccessor)slot;
        if (accessor.wonderful$getInventory() == CatchItems.mc.player.getInventory()) {
            int index = accessor.wonderful$getIndex();
            return index >= 0 && index < 36 ? index : -1;
        }
        return -1;
    }

    private boolean isProtected(ItemStack stack) {
        if (stack == null || stack.isEmpty()) {
            return false;
        }
        if (this.modes.is("Элитры") && stack.isOf(Items.ELYTRA)) {
            return true;
        }
        if (this.modes.is("Шары") && stack.isOf(Items.PLAYER_HEAD)) {
            return true;
        }
        if (this.modes.is("Осколки") && stack.isOf(Items.GHAST_TEAR)) {
            return true;
        }
        if (this.modes.is("Мечи") && this.isProtectedSword(stack)) {
            return true;
        }
        if (this.modes.is("Сферы") && this.isNamed(stack, "сфера цербера", "мифическая сфера", "сфера флеша")) {
            return true;
        }
        return this.modes.is("Талисманы") && this.isNamed(stack, "талисман eternity", "талисман infinity");
    }

    private boolean isProtectedSword(ItemStack stack) {
        if (!(stack.getItem() instanceof SwordItem)) {
            return false;
        }
        if (this.isNamed(stack, "алый лотос", "пасхаль", "фростморн")) {
            return true;
        }
        float damage = this.getAttackDamage(stack);
        return Math.abs(damage - 11.5f) < 0.01f || Math.abs(damage - 12.0f) < 0.01f;
    }

    private boolean isNamed(ItemStack stack, String ... needles) {
        String name = this.normalize(stack.getName().getString());
        for (String needle : needles) {
            if (!name.contains(this.normalize(needle))) continue;
            return true;
        }
        return false;
    }

    private String normalize(String value) {
        return value == null ? "" : value.toLowerCase(Locale.ROOT).replace('ё', 'е');
    }

    private float getAttackDamage(ItemStack stack) {
        AttributeModifiersComponent component = (AttributeModifiersComponent)stack.getOrDefault(DataComponentTypes.ATTRIBUTE_MODIFIERS, (Object)AttributeModifiersComponent.DEFAULT);
        double damage = 1.0;
        for (AttributeModifiersComponent.Entry entry : component.modifiers()) {
            if (!entry.attribute().equals((Object)EntityAttributes.ATTACK_DAMAGE)) continue;
            damage += entry.modifier().value();
        }
        return (float)damage;
    }

    private boolean hasLockedSlots() {
        for (boolean locked : this.lockedSlots) {
            if (!locked) continue;
            return true;
        }
        return false;
    }

    private void resetState() {
        for (int i2 = 0; i2 < 36; ++i2) {
            this.armedSlots[i2] = false;
            this.lockedSlots[i2] = false;
            this.lockedNames[i2] = null;
        }
    }

    private float getDefaultLockX() {
        return (float)mc.getWindow().getScaledWidth() - 12.0f - 8.0f;
    }

    private float getDefaultLockY() {
        return 8.0f;
    }

    private int getDisplaySlot(int slot) {
        return slot < 9 ? slot + 1 : slot + 1;
    }

    private record DropAttempt(int inventorySlot) {
    }
}