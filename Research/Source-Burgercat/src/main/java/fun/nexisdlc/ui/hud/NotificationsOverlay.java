package fun.nexisdlc.ui.hud;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.client.EventPacket;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.color.basic.ColorUtils;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.modules.impl.render.Notifications;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ContainerComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket;
import net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

public class NotificationsOverlay {
    private static final float DEFAULT_X = 12f;
    private static final float DEFAULT_Y = 220f;
    private static final List<Notification> notifications = new ArrayList<>();
    private static final float FADE_IN_MS = 160f;
    private static final float FADE_OUT_MS = 220f;
    private static long lastFrameNs = System.nanoTime();
    private static final String CHAT_NOTIFICATION_TEXT = "Это тестовое уведомление! Нажмите для настройки";
    private static boolean chatWasOpen = false;

    private static final Kind[] CHAT_KINDS = {Kind.INFORMATION, Kind.OFF, Kind.COOLDOWN, Kind.ON, Kind.PICKUP};

    private static long lastDynamicKindChange = System.currentTimeMillis();
    private static int currentDynamicKindIndex = 0;

    public static void push(String text, int durationMs) {
        push(text, durationMs, Kind.INFO);
    }

    public static void push(String text, int durationMs, Kind kind) {
        if (text == null || text.isEmpty()) return;
        notifications.add(0, new Notification(text, Math.max(300, durationMs), System.currentTimeMillis(), kind, false));
    }

    public static void push(String text, int durationMs, Kind kind, String accentText) {
        if (text == null || text.isEmpty()) return;
        notifications.add(0, new Notification(text, accentText, Math.max(300, durationMs), System.currentTimeMillis(), kind, false));
    }

    public static void push(String text, int durationMs, net.minecraft.item.ItemStack itemStack) {
        if (text == null || text.isEmpty()) return;
        notifications.add(0, new Notification(text, Math.max(300, durationMs), System.currentTimeMillis(), Kind.INFORMATION, false, itemStack));
    }

    public static void push(String text, int durationMs, net.minecraft.item.ItemStack itemStack, String accentText) {
        if (text == null || text.isEmpty()) return;
        notifications.add(0, new Notification(text, accentText, Math.max(300, durationMs), System.currentTimeMillis(), Kind.COOLDOWN, false, itemStack));
    }

    public static void push(Text textObject, int durationMs, Kind kind, net.minecraft.item.ItemStack itemStack) {
        if (textObject == null) return;
        notifications.add(0, new Notification(textObject, Math.max(300, durationMs), System.currentTimeMillis(), kind, false, itemStack));
    }


    @EventHandler
    public void onRender(EventRender.Screen.Notifications event) {
        if (mc.world == null) return;
        if (!Interface.elements.getByName("Нотификации").get()) return;


        boolean chatIsOpen = mc.currentScreen instanceof ChatScreen;
        boolean previewVisible = chatIsOpen || isHudSettingEnabled(Notifications.SETTING_ALWAYS_SHOW, false);

        long now = System.currentTimeMillis();
        if (now - lastDynamicKindChange >= 1300) {
            currentDynamicKindIndex = (currentDynamicKindIndex + 1) % CHAT_KINDS.length;
            lastDynamicKindChange = now;

            for (Notification n : notifications) {
                if (n.text.equals(CHAT_NOTIFICATION_TEXT)) {
                    n.updateKind(CHAT_KINDS[currentDynamicKindIndex]);
                    break;
                }
            }
        }

        if (previewVisible && !chatWasOpen && !ClientContainer.isHide()) {
            push(CHAT_NOTIFICATION_TEXT, 100000000, CHAT_KINDS[currentDynamicKindIndex], "тестовое уведомление");
        } else if (!previewVisible && chatWasOpen) {
            for (Notification n : notifications) {
                if (n.text.equals(CHAT_NOTIFICATION_TEXT)) {
                    if (!n.dismissing) {
                        n.dismissing = true;
                        n.dismissStartMs = now;
                        n.dismissStartAlpha = n.lastAlpha;
                    }
                    break;
                }
            }
        }
        chatWasOpen = previewVisible;

        long now1 = System.currentTimeMillis();
        long nowNs = System.nanoTime();
        float dt = (nowNs - lastFrameNs) / 1_000_000_000.0f;
        lastFrameNs = nowNs;
        var renderer = event.getRenderer();
        float fontSize = 14f;
        float paddingX = 8f;
        float paddingY = 6f;
        float spacing = 6f;
        Dragging dragging = DraggingManager.draggables.get(Notifications.SETTINGS_SCOPE);
        float baseY = dragging != null ? Interface.scalePos(Notifications.SETTINGS_SCOPE, dragging.getY()) : DEFAULT_Y;
        float yOffset = 0f;
        float maxWidth = 0f;
        float maxBottom = baseY;
        float guiScaleX = event.getViewportWidth() > 0f
                ? (float) mc.getWindow().getScaledWidth() / event.getViewportWidth()
                : 1f;
        float guiScaleY = event.getViewportHeight() > 0f
                ? (float) mc.getWindow().getScaledHeight() / event.getViewportHeight()
                : 1f;


        Iterator<Notification> iterator = notifications.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            Notification n = iterator.next();

            long age = now1 - n.startMs;

            if (n.dismissing) {
                float outAge = now1 - n.dismissStartMs;
                float t = Math.min(1f, outAge / FADE_OUT_MS);
                float alpha = n.dismissStartAlpha * (1f - t);
                if (t >= 1f) {
                    iterator.remove();
                    continue;
                }
                n.lastAlpha = alpha;
            } else {
                long total = (long) n.durationMs + (long) (FADE_IN_MS + FADE_OUT_MS);
                if (age >= total) {
                    iterator.remove();
                    continue;
                }

                float alpha;
                if (age < FADE_IN_MS) {
                    alpha = age / FADE_IN_MS;
                } else if (age > (FADE_IN_MS + n.durationMs)) {
                    float outAge = age - (FADE_IN_MS + n.durationMs);
                    alpha = 1f - (outAge / FADE_OUT_MS);
                } else {
                    alpha = 1f;
                }
                n.lastAlpha = alpha;
            }
            float alpha = Math.max(0f, Math.min(1f, n.lastAlpha));

            float textWidth = FontRegistry.SF_SEMIBOLD.getWidth(n.text, fontSize);
            float textHeight = FontRegistry.SF_SEMIBOLD.getHeight(n.text, fontSize);
            float boxW = textWidth + paddingX * 2f + 32f;
            float boxH = textHeight + paddingY * 2f;

            float x = (event.getViewportWidth() - boxW) * 0.5f;
            float targetY = baseY + yOffset + index * (boxH + spacing);
            if (!Float.isFinite(n.y)) {
                n.y = targetY;
            } else {
                n.y = lerp(n.y, targetY, dt * 10f);
            }
            float y = n.y;


            int bgColor = ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), alpha);
            int outlineColor = ClientColors.applyAlpha(new Color(45, 45, 45, 95).getRGB(), alpha);
            int textColor = ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), alpha);

            float centerX = x + boxW * 0.5f;
            float centerY = y + boxH * 0.5f;
            boolean scaleAnim = Interface.animationMode != null && Interface.animationMode.is("Обычная");
            if (scaleAnim) {
                float scale = 0.9f + 0.1f * alpha;
                renderer.pushScale(scale, scale, centerX, centerY);
            }
            renderer.blur(x, y, boxW, boxH, 9, alpha);
            //renderer.rectOutline(x - 1f, y - 1f, boxW + 2f, boxH + 2f, 10f, outlineColor, 1f);
            renderer.rect(x, y, boxW, boxH, 9, bgColor);

            float separatorX = x + 34f;
            float separatorHeight = boxH * 0.5f;
            float separatorY = y + boxH * 0.51f - separatorHeight * 0.5f;
            float separatorWidth = 2f;
            int separatorColor = ClientColors.applyAlpha(Color.GRAY.getRGB(), alpha);
            renderer.rect(separatorX, separatorY, separatorWidth, separatorHeight, 0, separatorColor);

            float iconSize = 24f;
            float iconX = x + 7f;
            float iconY = y + (boxH - iconSize) / 2f + 12;

            if (n.itemStack != null && !n.itemStack.isEmpty()) {
                float itemY = y + (boxH - iconSize) / 2f - 0.75f;
                renderItemViaContext(renderer, n.itemStack, iconX, itemY, iconSize, alpha, guiScaleX, guiScaleY);
            } else {
                String iconChar = getIconForKind(n.kind);
                int iconColor = getColorForKind(n.kind);
                iconColor = ClientColors.applyAlpha(iconColor, alpha);

                float charWidth = FontRegistry.WEXSIDE_MENU_ICONS.getWidth(iconChar, iconSize);
                float charHeight = FontRegistry.WEXSIDE_MENU_ICONS.getHeight(iconChar, iconSize);
                float centeredX = iconX + (iconSize - charWidth) / 2f;
                float centeredY = iconY + (iconSize - charHeight) / 2f +
                        FontRegistry.centeredBaselineOffset(FontRegistry.ICONS_ASYNC, iconChar.charAt(0), iconSize);

                event.getRenderer().text(FontRegistry.WEXSIDE_MENU_ICONS, centeredX, centeredY, iconSize, iconChar, iconColor);
            }

            float textX = x + 14f + iconSize + 4f;
            float textY = y + boxH * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', fontSize);

            if (n.textObject != null) {
                Text textToRender = n.textObject;
                renderer.text(FontRegistry.SF_SEMIBOLD, textX, textY, fontSize, textToRender, textColor);
            } else if (n.accentPart != null && !n.accentPart.isEmpty()) {
                if (!n.beforeAccent.isEmpty()) {
                    float beforeWidth = FontRegistry.SF_SEMIBOLD.getWidth(n.beforeAccent, fontSize);
                    renderer.text(FontRegistry.SF_SEMIBOLD, textX, textY, fontSize, n.beforeAccent, textColor);
                    textX += beforeWidth;
                }

                int accentTextColor = ClientColors.applyAlpha(getColorForKind(n.kind), alpha);
                float accentWidth = FontRegistry.SF_SEMIBOLD.getWidth(n.accentPart, fontSize);
                renderer.text(FontRegistry.SF_SEMIBOLD, textX, textY, fontSize, n.accentPart, accentTextColor);
                textX += accentWidth;

                if (n.afterAccent != null && !n.afterAccent.isEmpty()) {
                    renderer.text(FontRegistry.SF_SEMIBOLD, textX, textY, fontSize, n.afterAccent, textColor);
                }
            } else {
                renderer.text(FontRegistry.SF_SEMIBOLD, textX, textY, fontSize, n.text, textColor);
            }
            if (scaleAnim) {
                renderer.popScale();
            }

            maxWidth = Math.max(maxWidth, boxW);
            maxBottom = Math.max(maxBottom, y + boxH);
            index++;

        }

        if (dragging != null) {
            float hitboxX = (event.getViewportWidth() - maxWidth) * 0.5f;
            float hudScale = Interface.getHudScale(Notifications.SETTINGS_SCOPE);
            dragging.setX(hitboxX * hudScale);
            dragging.setWidth(maxWidth * hudScale);
            dragging.setHeight(Math.max(0f, maxBottom - baseY) * hudScale);
        }
    }


    public enum Kind {
        ON,
        OFF,
        INFO,
        COOLDOWN,
        INFORMATION,
        PICKUP
    }

    private static float lerp(float current, float target, float speed) {
        return current + (target - current) * Math.min(speed, 1f);
    }

    private static class Notification {
        final String text;
        final String accentText;
        final String beforeAccent;
        final String accentPart;
        final String afterAccent;
        final Text textObject;
        int durationMs;
        long startMs;
        Kind kind;
        float y = Float.NaN;
        boolean stickyChat;
        boolean dismissing = false;
        long dismissStartMs = 0L;
        float dismissStartAlpha = 1f;
        float lastAlpha = 1f;
        final net.minecraft.item.ItemStack itemStack;

        private Notification(String text, int durationMs, long startMs, Kind kind, boolean stickyChat) {
            this.text = text;
            this.accentText = null;
            this.beforeAccent = text;
            this.accentPart = null;
            this.afterAccent = null;
            this.textObject = null;
            this.durationMs = durationMs;
            this.startMs = startMs;
            this.kind = kind;
            this.stickyChat = stickyChat;
            this.itemStack = null;
        }

        private Notification(String text, String accentText, int durationMs, long startMs, Kind kind, boolean stickyChat) {
            this.text = text;
            this.accentText = accentText;
            String[] parts = splitAccent(text, accentText);
            this.beforeAccent = parts[0];
            this.accentPart = parts[1];
            this.afterAccent = parts[2];
            this.textObject = null;
            this.durationMs = durationMs;
            this.startMs = startMs;
            this.kind = kind;
            this.stickyChat = stickyChat;
            this.itemStack = null;
        }

        private Notification(String text, int durationMs, long startMs, Kind kind, boolean stickyChat, net.minecraft.item.ItemStack itemStack) {
            this.text = text;
            this.accentText = null;
            this.beforeAccent = text;
            this.accentPart = null;
            this.afterAccent = null;
            this.textObject = null;
            this.durationMs = durationMs;
            this.startMs = startMs;
            this.kind = kind;
            this.stickyChat = stickyChat;
            this.itemStack = itemStack;
        }

        private Notification(String text, String accentText, int durationMs, long startMs, Kind kind, boolean stickyChat, net.minecraft.item.ItemStack itemStack) {
            this.text = text;
            this.accentText = accentText;
            String[] parts = splitAccent(text, accentText);
            this.beforeAccent = parts[0];
            this.accentPart = parts[1];
            this.afterAccent = parts[2];
            this.textObject = null;
            this.durationMs = durationMs;
            this.startMs = startMs;
            this.kind = kind;
            this.stickyChat = stickyChat;
            this.itemStack = itemStack;
        }

        private Notification(Text textObject, int durationMs, long startMs, Kind kind, boolean stickyChat, net.minecraft.item.ItemStack itemStack) {
            this.text = textObject != null ? textObject.getString() : "";
            this.accentText = null;
            this.beforeAccent = this.text;
            this.accentPart = null;
            this.afterAccent = null;
            this.textObject = textObject;
            this.durationMs = durationMs;
            this.startMs = startMs;
            this.kind = kind;
            this.stickyChat = stickyChat;
            this.itemStack = itemStack;
        }

        private static String[] splitAccent(String text, String accentText) {
            if (accentText == null || accentText.isEmpty()) {
                return new String[]{text, null, null};
            }
            int idx = text.indexOf(accentText);
            if (idx != -1) {
                return new String[]{
                        text.substring(0, idx),
                        text.substring(idx, idx + accentText.length()),
                        text.substring(idx + accentText.length())
                };
            }
            return new String[]{text, null, null};
        }

        public void updateKind(Kind newKind) {
            this.kind = newKind;
        }
    }


    private static String getIconForKind(Kind kind) {
        return switch (kind) {
            case ON -> "A";
            case OFF -> "B";
            case INFO -> "f";
            case COOLDOWN -> "J";
            case INFORMATION -> "J";
            case PICKUP -> "Q";
        };
    }

    public static boolean isHudSettingEnabled(String key, boolean defaultValue) {
        return DraggingManager.getHudBoolean(Notifications.SETTINGS_SCOPE, key, defaultValue);
    }

    private static int getColorForKind(Kind kind) {
        return switch (kind) {
            case ON -> ColorUtils.rgb(0, 255, 0);
            case OFF -> ColorUtils.rgb(255, 10, 10);
            case INFO -> ColorUtils.rgb(204, 204, 204);
            case COOLDOWN -> ColorUtils.rgb(253, 227, 38);
            case INFORMATION -> ColorUtils.rgb(86, 198, 225);
            case PICKUP -> ColorUtils.rgb(144, 225, 86);
        };
    }

    private static void renderItemViaContext(fun.nexisdlc.client.utils.render.main.core.Renderer2D renderer,
                                             ItemStack stack, float x, float y, float size, float alpha,
                                             float guiScaleX, float guiScaleY) {
        if (stack == null || stack.isEmpty()) return;
        if (mc == null) return;
        var context = Nexis.getInstance().testRender.getDrawContext();
        if (context == null) return;

        double scaleFactor = 2.0 * Math.max(0f, Math.min(1f, alpha));
        if (scaleFactor <= 0.0) return;

        if (!Float.isFinite(x) || !Float.isFinite(y) || !Float.isFinite(size) || size <= 0f) {
            return;
        }

        var transform = renderer.getTransformStack().current();
        float absX = x;
        float absY = y;
        float absSize = size;

        if (transform != null && transform.length >= 6) {
            float scaleX = (float) Math.sqrt(transform[0] * transform[0] + transform[3] * transform[3]);
            float scaleY = (float) Math.sqrt(transform[1] * transform[1] + transform[4] * transform[4]);
            absX = transform[0] * x + transform[1] * y + transform[2];
            absY = transform[3] * x + transform[4] * y + transform[5];
            absSize = size * Math.min(scaleX, scaleY);
        } else {
            float sx = Float.isFinite(guiScaleX) && guiScaleX > 0f ? guiScaleX : 1f;
            float sy = Float.isFinite(guiScaleY) && guiScaleY > 0f ? guiScaleY : 1f;
            absX *= sx;
            absY *= sy;
            absSize *= Math.min(sx, sy);
        }

        if (!Float.isFinite(absX) || !Float.isFinite(absY) || !Float.isFinite(absSize) || absSize <= 0f) {
            return;
        }

        double windowScale = mc.getWindow().getScaleFactor();
        if (windowScale <= 0.0) {
            return;
        }

        float guiX = (float) (absX / windowScale);
        float guiY = (float) (absY / windowScale);
        float baseGuiScale = (float) (absSize / (16f * windowScale));
        float guiScale = (float) (baseGuiScale * scaleFactor * 0.5f);
        if (!Float.isFinite(guiX) || !Float.isFinite(guiY) || !Float.isFinite(guiScale) || guiScale <= 0f) {
            return;
        }

        float baseSizeGui = 16f * baseGuiScale;
        float scaledSizeGui = 16f * guiScale;
        float centerOffset = (baseSizeGui - scaledSizeGui) * 0.5f;

        renderer.flush();
        var matrices = context.getMatrices();
        matrices.pushMatrix();
        try {
            matrices.translate(guiX + centerOffset, guiY + centerOffset);
            matrices.scale(guiScale, guiScale);
            context.drawItem(stack, 0, 0);
        } catch (Throwable ignored) {
        } finally {
            matrices.popMatrix();
            renderer.resetPipelineState();
        }
    }

    @EventHandler
    public void onPacketReceive(EventPacket event) {
        if (mc.world == null || mc.player == null) return;

        boolean check1 = Nexis.getFunctionManager().getNotifications().isState();
        boolean check2 = isHudSettingEnabled(Notifications.SETTING_ITEM_PICKUP, false);
        boolean check3 = isHudSettingEnabled(Notifications.SETTING_ITEM_PICKUP_SHULKER, false);
        boolean onlyDonItems = isHudSettingEnabled(Notifications.SETTING_ONLY_DON_ITEMS, false);

        if (!check1) {
            return;
        }

        if (event.getPacket() instanceof ItemPickupAnimationS2CPacket pickupPacket && check2) {
            if (pickupPacket.getCollectorEntityId() == mc.player.getId()) {
                Entity entity = mc.world.getEntityById(pickupPacket.getEntityId());
                if (entity instanceof ItemEntity itemEntity) {
                    ItemStack itemStack = itemEntity.getStack();
                    if (onlyDonItems && !shouldNotifySpecialItem(itemStack)) {
                        return;
                    }

                    push(Text.literal("Подобран предмет: ").append(itemStack.getName()), 1000, Kind.PICKUP, itemStack.getItem().getDefaultStack());
                }
            }
        } else if (event.getPacket() instanceof ScreenHandlerSlotUpdateS2CPacket slot
                && check3) {
            int slotId = slot.getSlot();
            ContainerComponent updatedContainer = slot.getStack().get(DataComponentTypes.CONTAINER);
            if (updatedContainer != null && slotId < Objects.requireNonNull(mc.player).currentScreenHandler.slots.size() && slot.getSyncId() == 0) {
                ContainerComponent currentContainer = mc.player.currentScreenHandler.getSlot(slotId).getStack().get(DataComponentTypes.CONTAINER);
                if (currentContainer != null) {
                    updatedContainer.stream()
                            .filter(stack -> currentContainer.stream()
                                    .noneMatch(s -> Objects.equals(s.getComponents(), stack.getComponents())
                                            && s.toString().equals(stack.toString())))
                            .forEach(stack -> {
                                if (onlyDonItems && !shouldNotifySpecialItem(stack)) {
                                    return;
                                }
                                MutableText text = Text.empty().append(stack.getName());
                                push(Text.literal("Предмет выложен в шалкер: ").append(stack.getName()), 1000, Kind.PICKUP, stack.getItem().getDefaultStack());
                            });
                }
            }
        }
    }

    private static boolean shouldNotifySpecialItem(ItemStack stack) {
        if (stack == null || stack.isEmpty()) {
            return false;
        }
        return hasCustomColoredName(stack) || isAllowedNetheriteItem(stack);
    }

    private static boolean hasCustomColoredName(ItemStack stack) {
        Text name = stack.getName();
        if (name == null) {
            return false;
        }

        final boolean[] colored = {false};
        name.visit((style, textPart) -> {
            Style resolved = style == null ? Style.EMPTY : style;
            if (resolved.getColor() != null) {
                colored[0] = true;
                return java.util.Optional.of(textPart);
            }
            return java.util.Optional.empty();
        }, Style.EMPTY);
        return colored[0];
    }

    private static boolean isAllowedNetheriteItem(ItemStack stack) {
        return stack.isOf(Items.NETHERITE_HELMET)
                || stack.isOf(Items.NETHERITE_CHESTPLATE)
                || stack.isOf(Items.NETHERITE_LEGGINGS)
                || stack.isOf(Items.NETHERITE_BOOTS)
                || stack.isOf(Items.NETHERITE_SWORD)
                || stack.isOf(Items.NETHERITE_AXE)
                || stack.isOf(Items.NETHERITE_PICKAXE)
                || stack.isOf(Items.NETHERITE_SHOVEL);
    }
}
