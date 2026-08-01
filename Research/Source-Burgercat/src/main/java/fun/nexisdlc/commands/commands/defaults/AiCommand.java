package fun.nexisdlc.commands.commands.defaults;

import fun.nexisdlc.client.ai.AiManager;
import fun.nexisdlc.commands.Command;
import fun.nexisdlc.commands.argument.IArgConsumer;
import fun.nexisdlc.commands.exception.CommandException;
import net.minecraft.util.Formatting;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class AiCommand extends Command {
    private static final int MAX_CHAT_CHUNK = 220;

    public AiCommand() {
        super("ai", "aicomand");
    }

    @Override
    public void execute(String label, IArgConsumer args) throws CommandException {
        String action = args.hasAny() ? args.getString().toLowerCase(Locale.US) : "help";

        switch (action) {
            case "key" -> handleKey(args);
            case "model" -> handleModel(args);
            case "send" -> handleSend(args);
            case "help" -> printHelp();
            default -> {
                logDirect("Неизвестная команда: " + action, Formatting.RED);
                printHelp();
            }
        }
    }

    private void handleKey(IArgConsumer args) throws CommandException {
        AiManager.AiConfig config = AiManager.AiConfig.load();
        String rest = args.rawRest().trim();
        if (rest.isEmpty()) {
            if (config.apiKey == null || config.apiKey.isBlank()) {
                logDirect("Ключ не задан. Используй: .ai key <API_KEY>", Formatting.YELLOW);
            } else {
                logDirect("Текущий ключ: " + maskKey(config.apiKey), Formatting.GREEN);
            }
            return;
        }

        config.apiKey = rest;
        AiManager.AiConfig.save(config);
        logDirect("Ключ сохранен в Roaming.", Formatting.GREEN);
    }

    private void handleModel(IArgConsumer args) throws CommandException {
        AiManager.AiConfig config = AiManager.AiConfig.load();
        String rest = args.rawRest().trim();
        if (rest.isEmpty()) {
            logDirect("Текущая модель: " + config.getModel(), Formatting.GREEN);
            return;
        }

        config.model = rest;
        AiManager.AiConfig.save(config);
        logDirect("Модель установлена: " + config.model, Formatting.GREEN);
    }

    private void handleSend(IArgConsumer args) throws CommandException {
        AiManager.AiConfig config = AiManager.AiConfig.load();
        if (config.apiKey == null || config.apiKey.isBlank()) {
            logDirect("Сначала задай ключ: .ai key <API_KEY>", Formatting.RED);
            return;
        }

        String prompt = args.rawRest().trim();
        if (prompt.isEmpty()) {
            logDirect("Введите текст: .ai send <сообщение>", Formatting.YELLOW);
            return;
        }

        logDirect("Отправка запроса... Модель: " + config.getModel(), Formatting.GRAY);
        Thread thread = new Thread(() -> {
            try {
                String reply = AiManager.requestGemini(AiManager.getCommandSession(), prompt, (byte[]) null, (String) null);
                if (reply == null || reply.isBlank()) {
                    sendToChat("Пустой ответ от модели.", Formatting.YELLOW);
                } else {
                    sendMultiline("AI: " + reply, Formatting.GRAY);
                }
            } catch (Exception e) {
                sendToChat("Ошибка AI: " + e.getMessage(), Formatting.RED);
            }
        }, "AiCommand-Request");
        thread.setDaemon(true);
        thread.start();
    }

    private void printHelp() {
        logDirect("AI Command - помощь:");
        logDirect("  .ai key <API_KEY> - сохранить ключ", Formatting.GRAY);
        logDirect("  .ai model <MODEL_ID> - выбрать модель", Formatting.GRAY);
        logDirect("  .ai model - показать текущую модель", Formatting.GRAY);
        logDirect("  .ai send <сообщение> - отправить текст", Formatting.GRAY);
        logDirect("  .ai help - помощь", Formatting.GRAY);
    }

    private void sendToChat(String message, Formatting color) {
        mc.execute(() -> logDirect(message, color));
    }

    private void sendMultiline(String message, Formatting color) {
        mc.execute(() -> {
            String[] lines = message.split("\n");
            for (String line : lines) {
                if (line.length() <= MAX_CHAT_CHUNK) {
                    logDirect(line, color);
                    continue;
                }
                int start = 0;
                while (start < line.length()) {
                    int end = Math.min(line.length(), start + MAX_CHAT_CHUNK);
                    logDirect(line.substring(start, end), color);
                    start = end;
                }
            }
        });
    }

    private static String maskKey(String key) {
        if (key == null || key.length() < 8) return "****";
        return key.substring(0, 4) + "****" + key.substring(key.length() - 4);
    }

    @Override
    public Stream<String> tabComplete(String label, IArgConsumer args) throws CommandException {
        if (!args.hasAny()) return Stream.empty();
        if (args.hasExactlyOne()) {
            String prefix = args.getString().toLowerCase(Locale.US);
            return Stream.of("key", "model", "send", "help").filter(cmd -> cmd.startsWith(prefix));
        }
        return Stream.empty();
    }

    @Override
    public String getShortDesc() {
        return "Простой AI чат через .ai.";
    }

    @Override
    public List<String> getLongDesc() {
        return Arrays.asList("Простой AI чат без картинок.", "", "Использование:", "> .ai send <сообщение>");
    }
}