package fun.nexisdlc.ui.screen.irc;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import fun.nexisdlc.ClientContainer;
import net.minecraft.client.MinecraftClient;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IrcChatHistory {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final File HISTORY_FILE = new File(
            MinecraftClient.getInstance().runDirectory,
            ClientContainer.getName() + File.separator + "irc" + File.separator + "history.json"
    );
    private static final int MAX_HISTORY_SIZE = 500;
    
    private static final List<IrcMessage> messages = new ArrayList<>();
    private static boolean loaded = false;

    public static void addMessage(String sender, String content, long timestamp) {
        if (!loaded) {
            load();
        }
        
        IrcMessage message = new IrcMessage(sender, content, timestamp);
        messages.add(message);
        
        // Ограничиваем размер истории
        while (messages.size() > MAX_HISTORY_SIZE) {
            messages.remove(0);
        }
        
        save();
    }

    public static List<IrcMessage> getMessages() {
        if (!loaded) {
            load();
        }
        return Collections.unmodifiableList(messages);
    }

    public static void clear() {
        messages.clear();
        save();
    }

    private static void load() {
        loaded = true;
        
        if (!HISTORY_FILE.exists()) {
            return;
        }

        try (FileReader reader = new FileReader(HISTORY_FILE)) {
            Type listType = new TypeToken<List<IrcMessage>>(){}.getType();
            List<IrcMessage> loadedMessages = GSON.fromJson(reader, listType);
            
            if (loadedMessages != null) {
                messages.clear();
                messages.addAll(loadedMessages);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void save() {
        File parentDir = HISTORY_FILE.getParentFile();
        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        try (FileWriter writer = new FileWriter(HISTORY_FILE)) {
            GSON.toJson(messages, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class IrcMessage {
        private final String sender;
        private final String content;
        private final long timestamp;

        public IrcMessage(String sender, String content, long timestamp) {
            this.sender = sender;
            this.content = content;
            this.timestamp = timestamp;
        }

        public String getSender() {
            return sender;
        }

        public String getContent() {
            return content;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public String getFormattedTime() {
            java.time.Instant instant = java.time.Instant.ofEpochMilli(timestamp);
            java.time.ZoneId zone = java.time.ZoneId.systemDefault();
            java.time.format.DateTimeFormatter formatter = 
                java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss");
            return formatter.format(instant.atZone(zone));
        }
    }
}
