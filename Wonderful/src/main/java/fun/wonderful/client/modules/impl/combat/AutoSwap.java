package fun.wonderful.client.modules.impl.combat;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventBinding;
import fun.wonderful.api.events.implement.EventMoveInput;
import fun.wonderful.api.events.implement.EventRender;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.utils.input.KeyBoardUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.impl.movement.Sprint;
import fun.wonderful.client.modules.settings.implement.BindSetting;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import fun.wonderful.client.modules.settings.implement.TextSetting;
import java.util.Locale;
import java.util.Objects;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.Identifier;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.registry.Registries;
import net.minecraft.client.render.BuiltBuffer;
import org.lwjgl.glfw.GLFW;

public class AutoSwap
extends Module {
    public static AutoSwap INSTANCE = new AutoSwap();
    private static final String MODE_ITEMS = "Предметы";
    private static final String MODE_WHEEL = "Колесо";
    private static final String MODE_RUNE = "Руна";
    private static final String MODE_TOTEM = "Тотем";
    private static final String MODE_BALL = "Шар";
    private static final String MODE_GAPPLE = "Гепл";
    private static final String MODE_SHIELD = "Щит";
    private static final String MODE_HELMET = "Шлем";
    private static final int HELMET_CONTAINER_SLOT = 5;
    private final ModeSetting swapMode = new ModeSetting("Режим", "Предметы", "Предметы", "Колесо");
    private final ModeSetting firstItem = new ModeSetting("Первый предмет", "Руна", "Руна", "Тотем", "Шар", "Гепл", "Щит", "Шлем").visible(() -> this.swapMode.is(MODE_ITEMS));
    private final ModeSetting secondItem = new ModeSetting("Второй предмет", "Тотем", "Руна", "Тотем", "Шар", "Гепл", "Щит", "Шлем").visible(() -> this.swapMode.is(MODE_ITEMS));
    private final BindSetting swapKey = new BindSetting("Кнопка свапа", -98).visible(() -> this.swapMode.is(MODE_ITEMS));
    private final BindSetting helmetKey = new BindSetting("Кнопка шар/шлем", -1).visible(() -> this.swapMode.is(MODE_ITEMS));
    private final BindSetting wheelKey = new BindSetting("Бинд колеса", -1).visible(() -> this.swapMode.is(MODE_WHEEL));
    private final FloatSetting wheelSlots = new FloatSetting("Ячейки", 3.0f, 3.0f, 8.0f, 1.0f).visible(() -> this.swapMode.is(MODE_WHEEL));
    private final TextSetting wheelSlot1 = new TextSetting("Слот 1", "minecraft:air", 64).visible(() -> false);
    private final TextSetting wheelSlot2 = new TextSetting("Слот 2", "minecraft:air", 64).visible(() -> false);
    private final TextSetting wheelSlot3 = new TextSetting("Слот 3", "minecraft:air", 64).visible(() -> false);
    private final TextSetting wheelSlot4 = new TextSetting("Слот 4", "minecraft:air", 64).visible(() -> false);
    private final TextSetting wheelSlot5 = new TextSetting("Слот 5", "minecraft:air", 64).visible(() -> false);
    private final TextSetting wheelSlot6 = new TextSetting("Слот 6", "minecraft:air", 64).visible(() -> false);
    private final TextSetting wheelSlot7 = new TextSetting("Слот 7", "minecraft:air", 64).visible(() -> false);
    private final TextSetting wheelSlot8 = new TextSetting("Слот 8", "minecraft:air", 64).visible(() -> false);
    private final BooleanSetting bypassgrim = new BooleanSetting("Обходить Grim", true);
    private final TextSetting[] wheelSettings = new TextSetting[]{this.wheelSlot1, this.wheelSlot2, this.wheelSlot3, this.wheelSlot4, this.wheelSlot5, this.wheelSlot6, this.wheelSlot7, this.wheelSlot8};
    private final ItemStack[] wheelStacks = new ItemStack[]{ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY};
    private int bypassTicks;
    private boolean sprintPaused;
    private int swapCooldown;
    private int targetSlot = -1;
    private boolean needSwap = false;
    private int lastHelmetReturnSlot = -1;
    private ItemStack lastHelmetStack = ItemStack.EMPTY;
    private boolean wheelOpen;
    private boolean cursorUnlocked;
    private int pendingPickSlot = -1;
    private boolean returnToWheelPending;
    private boolean lastWheelLeftPressed;
    private boolean lastWheelRightPressed;
    private boolean lastWheelMiddlePressed;
    private boolean suppressWheelClickUntilRelease;

    public AutoSwap() {
        super("AutoSwap", "Быстрая смена предметов", Module.ModuleCategory.COMBAT);
        this.addSettings(this.swapMode, this.firstItem, this.secondItem, this.swapKey, this.helmetKey, this.wheelKey, this.wheelSlots, this.wheelSlot1, this.wheelSlot2, this.wheelSlot3, this.wheelSlot4, this.wheelSlot5, this.wheelSlot6, this.wheelSlot7, this.wheelSlot8, this.bypassgrim);
    }

    @Override
    public void onEnable() {
        this.needSwap = false;
        this.targetSlot = -1;
        this.bypassTicks = 0;
        this.swapCooldown = 0;
        this.closeWheel();
        this.clearLastHelmetReturn();
        super.onEnable();
    }

    @EventLink
    public void onBinding(EventBinding var1) {
    }

    @EventLink
    public void onInput(EventMoveInput e2) {
        if (this.bypassgrim.isState() && this.bypassTicks > 0) {
            if (AutoSwap.mc.player == null) {
                return;
            }
            AutoSwap.mc.player.setSprinting(false);
            e2.setForward(0.0f);
            e2.setStrafe(0.0f);
            e2.setJump(false);
            e2.setSneak(false);
        }
    }

    @EventLink
    public void onUpdate(EventUpdate e2) {
        if (AutoSwap.mc.player == null || AutoSwap.mc.world == null) {
            return;
        }
        if (!this.swapMode.is(MODE_WHEEL) && this.wheelOpen) {
            this.closeWheel();
        }
        if (this.returnToWheelPending && AutoSwap.mc.currentScreen instanceof InventoryScreen) {
            this.returnToWheelPending = false;
            mc.setScreen(null);
            this.cursorUnlocked = false;
            this.updateWheelCursorState(true);
        }
        if (this.capturesWheelMouse()) {
            this.updateWheelCursorState(true);
        }
        if (this.swapCooldown > 0) {
            --this.swapCooldown;
        }
        if (this.bypassgrim.isState() && this.bypassTicks > 0) {
            AutoSwap.mc.player.setSprinting(false);
            --this.bypassTicks;
            if (this.bypassTicks == 1) {
                this.performSwap();
            }
            if (this.bypassTicks == 0) {
                this.restoreSprint();
            }
            return;
        }
        if (this.needSwap && this.targetSlot == -1) {
            this.needSwap = false;
            this.processMainSwap();
        }
    }

    @EventLink
    public void onRender2D(EventRender.Default event) {
        if (AutoSwap.mc.player == null || AutoSwap.mc.world == null) {
            return;
        }
        if (!this.swapMode.is(MODE_WHEEL) || !this.wheelOpen || AutoSwap.mc.currentScreen != null) {
            return;
        }
        this.updateWheelCursorState(true);
        int count = this.getWheelSlotCount();
        float cx = (float)mc.getWindow().getScaledWidth() / 2.0f;
        float cy = (float)mc.getWindow().getScaledHeight() / 2.0f;
        float innerR = 54.0f;
        float outerR = 92.0f;
        float mouseX = this.getScaledMouseX();
        float mouseY = this.getScaledMouseY();
        int hover = this.getHoverIndex(mouseX, mouseY, cx, cy, innerR, outerR, count);
        boolean resetHover = this.isResetButtonHovered(mouseX, mouseY, cx, cy, outerR);
        this.handleWheelMouseButtons(hover, resetHover);
        this.drawWheel(event, cx, cy, innerR, outerR, count, hover, resetHover);
    }

    public boolean handleWheelInventoryPick(Slot slot, SlotActionType actionType) {
        if (!this.isEnable() || AutoSwap.mc.player == null || AutoSwap.mc.world == null) {
            return false;
        }
        if (!this.swapMode.is(MODE_WHEEL) || !this.wheelOpen || this.pendingPickSlot == -1) {
            return false;
        }
        if (!(AutoSwap.mc.currentScreen instanceof InventoryScreen) || actionType != SlotActionType.PICKUP) {
            return false;
        }
        if (slot == null || !slot.hasStack()) {
            return false;
        }
        ItemStack picked = slot.getStack();
        if (picked.isEmpty() || picked.getItem() == Items.AIR) {
            return false;
        }
        Identifier id = Registries.ITEM.getId(picked.getItem());
        if (id == null) {
            return false;
        }
        this.setWheelSlot(this.pendingPickSlot, id.toString());
        this.wheelStacks[this.pendingPickSlot] = picked.copyWithCount(1);
        this.pendingPickSlot = -1;
        this.returnToWheelPending = true;
        return true;
    }

    public boolean capturesWheelMouse() {
        return this.isEnable() && this.swapMode.is(MODE_WHEEL) && this.wheelOpen && AutoSwap.mc.currentScreen == null;
    }

    private void processMainSwap() {
    }


    private void handleWheelMouseButtons(int hover, boolean resetHover) {
        boolean middlePressed;
        long window = mc.getWindow().getHandle();
        boolean leftPressed = GLFW.glfwGetMouseButton((long)window, (int)0) == 1;
        boolean rightPressed = GLFW.glfwGetMouseButton((long)window, (int)1) == 1;
        boolean bl = middlePressed = GLFW.glfwGetMouseButton((long)window, (int)2) == 1;
        if (this.suppressWheelClickUntilRelease) {
            this.lastWheelLeftPressed = leftPressed;
            this.lastWheelRightPressed = rightPressed;
            this.lastWheelMiddlePressed = middlePressed;
            if (!(leftPressed || rightPressed || middlePressed)) {
                this.suppressWheelClickUntilRelease = false;
            }
            return;
        }
        if (leftPressed && !this.lastWheelLeftPressed) {
            if (resetHover) {
                this.clearWheelSlots();
            } else {
                this.handleWheelClick(0, hover);
            }
        } else if (middlePressed && !this.lastWheelMiddlePressed) {
            this.handleWheelClick(2, hover);
        }
        this.lastWheelLeftPressed = leftPressed;
        this.lastWheelRightPressed = rightPressed;
        this.lastWheelMiddlePressed = middlePressed;
    }

    private void handleWheelClick(int button, int hover) {
        if (hover == -1) {
            return;
        }
        if (button == 2) {
            this.openWheelItemPicker(hover);
            return;
        }
        ItemStack stack = this.getWheelStack(hover);
        if (stack.isEmpty() || stack.getItem() == Items.AIR) {
            this.openWheelItemPicker(hover);
            return;
        }
        int slot = this.findWheelItemSlot(stack);
        if (slot == -1) {
            return;
        }
        this.scheduleSwap(slot);
        this.closeWheel();
    }

    private void drawWheel(EventRender.Default event, float cx, float cy, float innerR, float outerR, int count, int hover, boolean resetHover) {
        int i2;
        RenderSystem.enableBlend();
        RenderSystem.disableDepthTest();
        RenderSystem.disableCull();
        RenderSystem.blendFunc((GlStateManager.SrcFactor)GlStateManager.SrcFactor.SRC_ALPHA, (GlStateManager.DstFactor)GlStateManager.DstFactor.ONE_MINUS_SRC_ALPHA);
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_COLOR);
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.TRIANGLES, VertexFormats.POSITION_COLOR);
        for (i2 = 0; i2 < count; ++i2) {
            boolean isHover = i2 == hover;
            int r2 = 205;
            int g2 = 205;
            int b2 = 205;
            int a2 = 95;
            if (isHover) {
                r2 = 255;
                g2 = 209;
                b2 = 47;
                a2 = 140;
            }
            float start = (float)(-1.5707963267948966 + Math.PI * 2 * ((double)i2 / (double)count));
            float end = (float)(-1.5707963267948966 + Math.PI * 2 * (((double)i2 + 1.0) / (double)count));
            this.drawRingSegment(buffer, cx, cy, innerR, outerR, start, end, r2, g2, b2, a2);
        }
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
        RenderSystem.enableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
        for (i2 = 0; i2 < count; ++i2) {
            ItemStack stack = this.getWheelStack(i2);
            if (stack.isEmpty() || stack.getItem() == Items.AIR) continue;
            float start = (float)(-1.5707963267948966 + Math.PI * 2 * ((double)i2 / (double)count));
            float end = (float)(-1.5707963267948966 + Math.PI * 2 * (((double)i2 + 1.0) / (double)count));
            float mid = (start + end) / 2.0f;
            float iconR = (innerR + outerR) / 2.0f;
            float ix = cx + (float)Math.cos(mid) * iconR;
            float iy = cy + (float)Math.sin(mid) * iconR;
            event.getContext().drawItem(stack, (int)(ix - 8.0f), (int)(iy - 8.0f));
        }
        this.drawResetButton(event, cx, cy, outerR, resetHover);
    }

    private void drawRingSegment(BufferBuilder buffer, float cx, float cy, float innerR, float outerR, float start, float end, int r2, int g2, int b2, int a2) {
        int steps = Math.max(10, (int)(48.0 * ((double)Math.abs(end - start) / (Math.PI * 2))));
        float step = (end - start) / (float)steps;
        for (int i2 = 0; i2 < steps; ++i2) {
            float a0 = start + step * (float)i2;
            float a1 = start + step * (float)(i2 + 1);
            float x0o = cx + (float)Math.cos(a0) * outerR;
            float y0o = cy + (float)Math.sin(a0) * outerR;
            float x1o = cx + (float)Math.cos(a1) * outerR;
            float y1o = cy + (float)Math.sin(a1) * outerR;
            float x0i = cx + (float)Math.cos(a0) * innerR;
            float y0i = cy + (float)Math.sin(a0) * innerR;
            float x1i = cx + (float)Math.cos(a1) * innerR;
            float y1i = cy + (float)Math.sin(a1) * innerR;
            buffer.vertex(x0i, y0i, 0.0f).color(r2, g2, b2, a2);
            buffer.vertex(x0o, y0o, 0.0f).color(r2, g2, b2, a2);
            buffer.vertex(x1o, y1o, 0.0f).color(r2, g2, b2, a2);
            buffer.vertex(x0i, y0i, 0.0f).color(r2, g2, b2, a2);
            buffer.vertex(x1o, y1o, 0.0f).color(r2, g2, b2, a2);
            buffer.vertex(x1i, y1i, 0.0f).color(r2, g2, b2, a2);
        }
    }

    private void drawResetButton(EventRender.Default event, float cx, float cy, float outerR, boolean hovered) {
        String text = "Сбросить";
        int x2 = Math.round(cx + outerR + 12.0f);
        int y2 = Math.round(cy - outerR + 8.0f);
        int width = AutoSwap.mc.textRenderer.getWidth(text) + 12;
        int height = 16;
        int background = hovered ? -1269147046 : -1775095246;
        event.getContext().fill(x2, y2, x2 + width, y2 + height, background);
        event.getContext().drawTextWithShadow(AutoSwap.mc.textRenderer, text, x2 + 6, y2 + 4, -1);
    }

    private boolean isResetButtonHovered(float mouseX, float mouseY, float cx, float cy, float outerR) {
        int x2 = Math.round(cx + outerR + 12.0f);
        int y2 = Math.round(cy - outerR + 8.0f);
        int width = AutoSwap.mc.textRenderer.getWidth("Сбросить") + 12;
        return mouseX >= (float)x2 && mouseX <= (float)(x2 + width) && mouseY >= (float)y2 && mouseY <= (float)(y2 + 16);
    }

    private void openWheelItemPicker(int index) {
        this.pendingPickSlot = index;
        this.returnToWheelPending = false;
        mc.setScreen((Screen)new InventoryScreen((PlayerEntity)Objects.requireNonNull(AutoSwap.mc.player)));
    }

    private void clearWheelSlots() {
        for (int i2 = 0; i2 < this.wheelSettings.length; ++i2) {
            this.setWheelSlot(i2, "minecraft:air");
        }
    }

    private void scheduleSwap(int slot) {
        if (slot == -1 || !this.isCursorEmpty() || this.swapCooldown > 0) {
            return;
        }
        this.targetSlot = slot;
        if (this.bypassgrim.isState()) {
            this.disableSprint();
            this.bypassTicks = 2;
            this.swapCooldown = 2;
        } else {
            this.performSwap();
            this.swapCooldown = 2;
        }
    }

    private void handleHelmetKey() {
        if (!this.isCursorEmpty()) {
            return;
        }
        this.swapWithHelmet(MODE_BALL);
    }

    private void swapWithHelmet(String mode) {
        if (!this.isCursorEmpty()) {
            return;
        }
        ItemStack currentHelmet = AutoSwap.mc.player.getEquippedStack(EquipmentSlot.HEAD);
        if (this.matchesHelmetMode(currentHelmet, mode)) {
            int returnSlot = this.findLastHelmetReturnSlot();
            if (returnSlot != -1 && this.doHelmetSwap(returnSlot)) {
                this.clearLastHelmetReturn();
            }
            return;
        }
        int itemSlot = this.findInventorySlotForHelmet(mode);
        if (itemSlot != -1) {
            this.lastHelmetReturnSlot = itemSlot;
            this.lastHelmetStack = currentHelmet.copy();
            if (!this.doHelmetSwap(itemSlot)) {
                this.clearLastHelmetReturn();
            }
        }
    }

    private boolean doHelmetSwap(int inventorySlot) {
        if (!this.isCursorEmpty()) {
            return false;
        }
        AutoSwap.mc.interactionManager.clickSlot(0, inventorySlot, 0, SlotActionType.PICKUP, (PlayerEntity)AutoSwap.mc.player);
        AutoSwap.mc.interactionManager.clickSlot(0, 5, 0, SlotActionType.PICKUP, (PlayerEntity)AutoSwap.mc.player);
        AutoSwap.mc.interactionManager.clickSlot(0, inventorySlot, 0, SlotActionType.PICKUP, (PlayerEntity)AutoSwap.mc.player);
        AutoSwap.mc.player.networkHandler.sendPacket((Packet)new CloseHandledScreenC2SPacket(0));
        return this.isCursorEmpty();
    }

    private void performSwap() {
        if (this.targetSlot == -1) {
            return;
        }
        this.doSwap(this.targetSlot);
        AutoSwap.mc.player.networkHandler.sendPacket((Packet)new CloseHandledScreenC2SPacket(0));
        this.targetSlot = -1;
    }

    private void doSwap(int slot) {
        if (slot >= 36 && slot <= 44) {
            int hotbarSlot = slot - 36;
            AutoSwap.mc.interactionManager.clickSlot(0, 45, hotbarSlot, SlotActionType.SWAP, (PlayerEntity)AutoSwap.mc.player);
        } else {
            AutoSwap.mc.interactionManager.clickSlot(0, slot, 0, SlotActionType.SWAP, (PlayerEntity)AutoSwap.mc.player);
            AutoSwap.mc.interactionManager.clickSlot(0, 45, 0, SlotActionType.SWAP, (PlayerEntity)AutoSwap.mc.player);
            AutoSwap.mc.interactionManager.clickSlot(0, slot, 0, SlotActionType.SWAP, (PlayerEntity)AutoSwap.mc.player);
        }
    }

    private int findItemSlot(Item item, boolean helmetSwap) {
        for (int i2 = 9; i2 < 45; ++i2) {
            ItemStack stack = AutoSwap.mc.player.playerScreenHandler.getSlot(i2).getStack();
            if (stack.getItem() != item) continue;
            return i2;
        }
        return -1;
    }

    private int findWheelItemSlot(ItemStack selected) {
        if (selected == null || selected.isEmpty()) {
            return -1;
        }
        for (int i2 = 9; i2 < 45; ++i2) {
            ItemStack stack = AutoSwap.mc.player.playerScreenHandler.getSlot(i2).getStack();
            if (!ItemStack.areItemsAndComponentsEqual((ItemStack)stack, (ItemStack)selected)) continue;
            return i2;
        }
        if (this.hasCustomComponents(selected)) {
            return this.findSimilarCustomWheelItemSlot(selected);
        }
        return this.findItemSlot(selected.getItem(), false);
    }

    private int findSimilarCustomWheelItemSlot(ItemStack selected) {
        String selectedName = selected.getName().getString();
        int firstCustomSlot = -1;
        for (int i2 = 9; i2 < 45; ++i2) {
            ItemStack stack = AutoSwap.mc.player.playerScreenHandler.getSlot(i2).getStack();
            if (stack.getItem() != selected.getItem() || !this.hasCustomComponents(stack)) continue;
            if (stack.getName().getString().equals(selectedName)) {
                return i2;
            }
            if (firstCustomSlot != -1) continue;
            firstCustomSlot = i2;
        }
        return firstCustomSlot;
    }

    private boolean hasCustomComponents(ItemStack stack) {
        if (stack == null || stack.isEmpty()) {
            return false;
        }
        return !ItemStack.areItemsAndComponentsEqual((ItemStack)stack, (ItemStack)stack.getItem().getDefaultStack());
    }

    private int findInventorySlotForHelmet(String mode) {
        for (int i2 = 9; i2 < 45; ++i2) {
            ItemStack stack = AutoSwap.mc.player.playerScreenHandler.getSlot(i2).getStack();
            if (!this.matchesHelmetMode(stack, mode)) continue;
            return i2;
        }
        return -1;
    }

    private boolean matchesOffhandMode(ItemStack stack, String mode) {
        if (stack == null || stack.isEmpty()) {
            return false;
        }
        return switch (mode) {
            case MODE_RUNE -> {
                if (stack.getItem() == Items.FIREWORK_STAR) {
                    yield true;
                }
                yield false;
            }
            case MODE_BALL -> {
                if (stack.getItem() == Items.PLAYER_HEAD && !this.isMarkedHead(stack)) {
                    yield true;
                }
                yield false;
            }
            case MODE_TOTEM -> {
                if (stack.getItem() == Items.TOTEM_OF_UNDYING) {
                    yield true;
                }
                yield false;
            }
            case MODE_GAPPLE -> {
                if (stack.getItem() == Items.GOLDEN_APPLE) {
                    yield true;
                }
                yield false;
            }
            case MODE_SHIELD -> {
                if (stack.getItem() == Items.SHIELD) {
                    yield true;
                }
                yield false;
            }
            case MODE_HELMET -> this.isHelmet(stack.getItem());
            default -> false;
        };
    }

    private boolean matchesHelmetMode(ItemStack stack, String mode) {
        if (stack == null || stack.isEmpty()) {
            return false;
        }
        return switch (mode) {
            case MODE_RUNE -> {
                if (stack.getItem() == Items.FIREWORK_STAR) {
                    yield true;
                }
                yield false;
            }
            case MODE_BALL -> this.isMarkedHead(stack);
            case MODE_TOTEM -> {
                if (stack.getItem() == Items.TOTEM_OF_UNDYING) {
                    yield true;
                }
                yield false;
            }
            case MODE_GAPPLE -> {
                if (stack.getItem() == Items.GOLDEN_APPLE) {
                    yield true;
                }
                yield false;
            }
            case MODE_SHIELD -> {
                if (stack.getItem() == Items.SHIELD) {
                    yield true;
                }
                yield false;
            }
            case MODE_HELMET -> this.isHelmet(stack.getItem());
            default -> false;
        };
    }

    private boolean isHelmet(Item item) {
        return item == Items.NETHERITE_HELMET || item == Items.DIAMOND_HELMET || item == Items.IRON_HELMET || item == Items.GOLDEN_HELMET || item == Items.CHAINMAIL_HELMET || item == Items.LEATHER_HELMET || item == Items.TURTLE_HELMET;
    }

    private boolean isMarkedHead(ItemStack stack) {
        if (stack == null || stack.isEmpty() || stack.getItem() != Items.PLAYER_HEAD) {
            return false;
        }
        String displayName = stack.getName().getString().toLowerCase(Locale.ROOT);
        return displayName.contains("супермен") || displayName.contains("superman");
    }

    private int findLastHelmetReturnSlot() {
        if (this.lastHelmetReturnSlot >= 9 && this.lastHelmetReturnSlot < 45 && this.sameStackForReturn(AutoSwap.mc.player.playerScreenHandler.getSlot(this.lastHelmetReturnSlot).getStack(), this.lastHelmetStack)) {
            return this.lastHelmetReturnSlot;
        }
        for (int i2 = 9; i2 < 45; ++i2) {
            if (!this.sameStackForReturn(AutoSwap.mc.player.playerScreenHandler.getSlot(i2).getStack(), this.lastHelmetStack)) continue;
            return i2;
        }
        return -1;
    }

    private boolean sameStackForReturn(ItemStack current, ItemStack expected) {
        if (expected == null || expected.isEmpty()) {
            return current == null || current.isEmpty();
        }
        if (current == null || current.isEmpty()) {
            return false;
        }
        return current.getItem() == expected.getItem();
    }

    private void clearLastHelmetReturn() {
        this.lastHelmetReturnSlot = -1;
        this.lastHelmetStack = ItemStack.EMPTY;
    }

    private boolean isCursorEmpty() {
        return AutoSwap.mc.player == null || AutoSwap.mc.player.playerScreenHandler.getCursorStack().isEmpty();
    }

    private Item getItem(String name) {
        return switch (name) {
            case MODE_RUNE -> Items.FIREWORK_STAR;
            case MODE_TOTEM -> Items.TOTEM_OF_UNDYING;
            case MODE_BALL -> Items.PLAYER_HEAD;
            case MODE_GAPPLE -> Items.GOLDEN_APPLE;
            case MODE_SHIELD -> Items.SHIELD;
            default -> Items.AIR;
        };
    }

    private int getWheelSlotCount() {
        return Math.max(3, Math.min(8, Math.round(this.wheelSlots.get())));
    }

    private void setWheelSlot(int index, String value) {
        if (index < 0 || index >= this.wheelSettings.length) {
            return;
        }
        this.wheelSettings[index].setText(value);
        if ("minecraft:air".equals(value)) {
            this.wheelStacks[index] = ItemStack.EMPTY;
        }
    }

    private ItemStack getWheelStack(int index) {
        if (index < 0 || index >= this.wheelSettings.length) {
            return ItemStack.EMPTY;
        }
        if (!this.wheelStacks[index].isEmpty()) {
            return this.wheelStacks[index];
        }
        String raw = this.wheelSettings[index].get();
        if (raw == null || raw.isBlank()) {
            return ItemStack.EMPTY;
        }
        Identifier id = Identifier.tryParse((String)raw);
        if (id == null) {
            return ItemStack.EMPTY;
        }
        Item item = (Item)Registries.ITEM.get(id);
        if (item == null || item == Items.AIR) {
            return ItemStack.EMPTY;
        }
        ItemStack inventoryStack = this.findInventoryStackForItem(item);
        if (!inventoryStack.isEmpty()) {
            this.wheelStacks[index] = inventoryStack.copyWithCount(1);
            return this.wheelStacks[index];
        }
        return item.getDefaultStack();
    }

    private ItemStack findInventoryStackForItem(Item item) {
        if (AutoSwap.mc.player == null) {
            return ItemStack.EMPTY;
        }
        for (int i2 = 9; i2 < 45; ++i2) {
            ItemStack stack = AutoSwap.mc.player.playerScreenHandler.getSlot(i2).getStack();
            if (stack.getItem() != item) continue;
            return stack;
        }
        return ItemStack.EMPTY;
    }

    private int getHoverIndex(float mouseX, float mouseY, float cx, float cy, float innerR, float outerR, int count) {
        int idx;
        float dx = mouseX - cx;
        float dy = mouseY - cy;
        float dist = (float)Math.sqrt(dx * dx + dy * dy);
        if (dist < innerR || dist > outerR) {
            return -1;
        }
        double ang = Math.atan2(dy, dx) + 1.5707963267948966;
        if (ang < 0.0) {
            ang += Math.PI * 2;
        }
        if ((idx = (int)Math.floor(ang / (Math.PI * 2) * (double)count)) < 0 || idx >= count) {
            return -1;
        }
        return idx;
    }

    private float getScaledMouseX() {
        return (float)(AutoSwap.mc.mouse.getX() * (double)mc.getWindow().getScaledWidth() / (double)mc.getWindow().getWidth());
    }

    private float getScaledMouseY() {
        return (float)(AutoSwap.mc.mouse.getY() * (double)mc.getWindow().getScaledHeight() / (double)mc.getWindow().getHeight());
    }

    private void toggleWheel() {
        if (this.wheelOpen) {
            this.closeWheel();
            return;
        }
        this.wheelOpen = true;
        this.pendingPickSlot = -1;
        this.lastWheelLeftPressed = false;
        this.lastWheelRightPressed = false;
        this.lastWheelMiddlePressed = false;
        this.suppressWheelClickUntilRelease = KeyBoardUtils.isMouseButton(this.wheelKey.getKey());
        this.updateWheelCursorState(true);
    }

    private void closeWheel() {
        if (!this.wheelOpen && !this.cursorUnlocked) {
            return;
        }
        this.wheelOpen = false;
        this.pendingPickSlot = -1;
        this.returnToWheelPending = false;
        this.lastWheelLeftPressed = false;
        this.lastWheelRightPressed = false;
        this.lastWheelMiddlePressed = false;
        this.suppressWheelClickUntilRelease = false;
        this.updateWheelCursorState(false);
    }

    private void updateWheelCursorState(boolean shouldBeUnlocked) {
        if (mc == null || AutoSwap.mc.mouse == null) {
            return;
        }
        if (shouldBeUnlocked) {
            AutoSwap.mc.mouse.unlockCursor();
            this.cursorUnlocked = true;
            return;
        }
        if (this.cursorUnlocked) {
            if (AutoSwap.mc.currentScreen == null) {
                AutoSwap.mc.mouse.lockCursor();
            }
            this.cursorUnlocked = false;
        }
    }

    private void disableSprint() {
        if (this.sprintPaused) {
            return;
        }
        Sprint.pushPause(1000L);
        this.sprintPaused = true;
    }

    private void restoreSprint() {
        if (!this.sprintPaused) {
            return;
        }
        this.sprintPaused = false;
        Sprint.popPause();
    }

    @Override
    public void onDisable() {
        this.bypassTicks = 0;
        this.swapCooldown = 0;
        this.needSwap = false;
        this.targetSlot = -1;
        this.closeWheel();
        this.restoreSprint();
        this.clearLastHelmetReturn();
        super.onDisable();
    }
}