package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.client.events.impl.client.EventPacket;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.client.ILogger;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import fun.nexisdlc.modules.impl.combat.AuraModule;
import fun.nexisdlc.ui.hud.NotificationsOverlay;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@FunctionAdd(name = "Tracker", alias = "Tracker", category = Category.Utilities, description = "Отслеживает использование предметов ближайшими игроками и целью ауры")
public class Tracker extends Function {
    private static final byte TOTEM_STATUS = 35;

    private final ModeSetting targetMode = new ModeSetting("Цель", "Оба", "Рядом", "Таргет ауры", "Оба");
    private final SliderSetting range = new SliderSetting("Радиус", 5f, 1f, 12f, 0.5f)
            .setVisible(() -> !targetMode.is("Таргет ауры"));

    private final Map<UUID, UseState> useStates = new HashMap<>();
    private final List<PendingUsage> pendingUsages = new ArrayList<>();

    public Tracker() {
        addSettings(targetMode, range);
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (nullCheck()) {
            useStates.clear();
            pendingUsages.clear();
            return;
        }

        Map<UUID, LivingEntity> tracked = collectTrackedEntities();
        useStates.keySet().removeIf(uuid -> !tracked.containsKey(uuid));

        long now = System.currentTimeMillis();
        for (LivingEntity entity : tracked.values()) {
            ItemStack activeStack = entity.isUsingItem() ? entity.getActiveItem() : ItemStack.EMPTY;
            UseState previous = useStates.get(entity.getUuid());

            if (!activeStack.isEmpty()) {
                Hand activeHand = entity.getActiveHand();
                int count = activeStack.getCount();
                if (previous == null || previous.hand() != activeHand || !ItemStack.areItemsAndComponentsEqual(previous.stack(), activeStack) || !previous.using()) {
                    useStates.put(entity.getUuid(), new UseState(true, activeStack.copy(), activeHand, count, now));
                }
                continue;
            }

            if (previous != null && previous.using()) {
                ItemStack currentHandStack = getHandStack(entity, previous.hand());
                boolean countReduced = !currentHandStack.isEmpty() && currentHandStack.getCount() < previous.count();
                boolean itemChanged = currentHandStack.isEmpty() || !ItemStack.areItemsAndComponentsEqual(previous.stack(), currentHandStack);
                if (countReduced || itemChanged) {
                    queueUsage(entity, previous.stack(), false);
                }
            }

            useStates.remove(entity.getUuid());
        }

        flushPendingUsages();
    }

    @EventHandler
    public void onPacketReceive(EventPacket event) {
        if (!event.isReceive() || nullCheck()) {
            return;
        }

        if (event.getPacket() instanceof EntityStatusS2CPacket packet && packet.getStatus() == TOTEM_STATUS) {
            Entity entity = packet.getEntity(mc.world);
            if (entity instanceof LivingEntity living && collectTrackedEntities().containsKey(living.getUuid())) {
                ItemStack totemStack = findTotemStack(living);
                queueUsage(living, totemStack, true);
            }
        }
    }

    @Override
    public void onDisable() {
        useStates.clear();
        pendingUsages.clear();
        super.onDisable();
    }

    private Map<UUID, LivingEntity> collectTrackedEntities() {
        Map<UUID, LivingEntity> tracked = new LinkedHashMap<>();

        if (!targetMode.is("Таргет ауры")) {
            double maxDistanceSq = range.get() * range.get();
            for (PlayerEntity player : mc.world.getPlayers()) {
                if (player == null || player == mc.player || !player.isAlive() || player.isRemoved()) {
                    continue;
                }
                if (mc.player.squaredDistanceTo(player) <= maxDistanceSq) {
                    tracked.put(player.getUuid(), player);
                }
            }
        }

        if (!targetMode.is("Рядом")) {
            LivingEntity auraTarget = AuraModule.target;
            if (auraTarget != null && auraTarget != mc.player && auraTarget.isAlive() && !auraTarget.isRemoved()) {
                tracked.put(auraTarget.getUuid(), auraTarget);
            }
        }

        return tracked;
    }

    private void queueUsage(LivingEntity entity, ItemStack usedStack, boolean forced) {
        if (entity == null || usedStack == null || usedStack.isEmpty()) {
            return;
        }
        pendingUsages.add(new PendingUsage(getActorLabel(entity), usedStack.copy(), forced));
    }

    private void flushPendingUsages() {
        if (pendingUsages.isEmpty()) {
            return;
        }

        List<PendingUsage> usages = new ArrayList<>(pendingUsages);
        pendingUsages.clear();
        for (PendingUsage usage : usages) {
            announceUsage(usage.actorLabel(), usage.stack(), usage.forced());
        }
    }

    private void announceUsage(Text actorLabel, ItemStack usedStack, boolean forced) {
        if (usedStack == null || usedStack.isEmpty()) {
            return;
        }

        ItemStack displayStack = usedStack.copy();
        if (!forced && displayStack.isOf(Items.TOTEM_OF_UNDYING)) {
            return;
        }

        MutableText message = Text.empty()
                .append(actorLabel.copy())
                .append(Text.literal(" использовал ").formatted(Formatting.GRAY))
                .append(getItemLabel(displayStack));

        addChatPrefixed(message);
        NotificationsOverlay.push(message, 1600, NotificationsOverlay.Kind.INFORMATION, displayStack);
    }

    private MutableText getActorLabel(LivingEntity entity) {
        MutableText label = Text.empty();
        if (entity instanceof PlayerEntity) {
            label.append(Text.literal("Игрок ").formatted(Formatting.GRAY));
        } else {
            label.append(Text.literal("Таргет ").formatted(Formatting.GRAY));
        }
        return label.append(Text.literal(entity.getName().getString()).formatted(Formatting.WHITE));
    }

    private MutableText getItemLabel(ItemStack stack) {
        MutableText label = Text.empty();

        if (stack.isOf(Items.TOTEM_OF_UNDYING)) {
            label.append(Text.literal("Тотем бессмертия").formatted(Formatting.WHITE));
            if (stack.hasEnchantments()) {
                label.append(Text.literal(" [Зачарованный]").formatted(Formatting.LIGHT_PURPLE));
            }
            return label;
        }

        Text customLabel = getCustomItemLabel(stack);
        if (customLabel != null) {
            label.append(customLabel);
        }

        if (customLabel == null) {
            label.append(stack.getName().copy());
        }

        return label;
    }

    private ItemStack getHandStack(LivingEntity entity, Hand hand) {
        if (hand == Hand.OFF_HAND) {
            return entity.getOffHandStack();
        }
        return entity.getMainHandStack();
    }

    private ItemStack findTotemStack(LivingEntity entity) {
        if (entity.getMainHandStack().isOf(Items.TOTEM_OF_UNDYING)) {
            return entity.getMainHandStack();
        }
        if (entity.getOffHandStack().isOf(Items.TOTEM_OF_UNDYING)) {
            return entity.getOffHandStack();
        }
        return Items.TOTEM_OF_UNDYING.getDefaultStack();
    }

    private Text getCustomItemLabel(ItemStack stack) {
        Item item = stack.getItem();
        if (item == Items.GOLDEN_APPLE) {
            return Text.literal("Золотое яблоко").formatted(Formatting.YELLOW);
        }
        if (item == Items.ENCHANTED_GOLDEN_APPLE) {
            return Text.literal("Зачарованное золотое яблоко").formatted(Formatting.LIGHT_PURPLE);
        }
        if (item == Items.GOLDEN_CARROT) {
            return Text.literal("Золотая морковь").formatted(Formatting.YELLOW);
        }
        return null;
    }

    private static void addChatPrefixed(Text text) {
        MutableText component = Text.empty()
                .append(ILogger.getPrefix())
                .append(Text.literal(" "))
                .append(text);
        addChat(component);
    }

    private static void addChat(Text text) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player == null) {
            return;
        }
        if (client.inGameHud != null) {
            client.inGameHud.getChatHud().addMessage(text);
        }
    }

    private record UseState(boolean using, ItemStack stack, Hand hand, int count, long startMs) {
    }

    private record PendingUsage(Text actorLabel, ItemStack stack, boolean forced) {
    }
}
