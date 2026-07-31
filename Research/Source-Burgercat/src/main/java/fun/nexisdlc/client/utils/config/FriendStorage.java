package fun.nexisdlc.client.utils.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import fun.nexisdlc.client.utils.client.IMinecraft;
import lombok.Getter;
import net.minecraft.client.MinecraftClient;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class FriendStorage implements IMinecraft {
    private final File file;
    private final List<Friend> friendNicks = new ArrayList<>();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Type STAFF_LIST_TYPE = new TypeToken<List<Friend>>() {}.getType();

    @Getter
    public static class Friend {
        private final String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Friend friend)) return false;
            return name.equalsIgnoreCase(friend.name);
        }

        @Override
        public int hashCode() {
            return name.toLowerCase().hashCode();
        }
    }

    public FriendStorage() {
        this.file = new File(new File(MinecraftClient.getInstance().runDirectory, "nexis/files"), "friends.json");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        load();
    }

    public void add(String nick) {
        if (nick == null || nick.trim().isEmpty()) return;
        String trimmed = nick.trim();
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.getSession() != null && trimmed.equalsIgnoreCase(client.getSession().getUsername())) return;
        if (friendNicks.stream().noneMatch(s -> s.getName().equalsIgnoreCase(trimmed))) {
            friendNicks.add(new Friend(trimmed));
            save();
        }
    }

    public void addFriend(String nick) {
        add(nick);
    }

    public void remove(String nick) {
        if (nick != null) {
            friendNicks.removeIf(friend -> friend.getName().equalsIgnoreCase(nick.trim()));
            save();
        }
    }

    public void removeFriend(String nick) {
        remove(nick);
    }

    public void clear() {
        friendNicks.clear();
        save();
    }

    public List<Friend> getFriends() {
        return new ArrayList<>(friendNicks);
    }

    public boolean isFriend(String name) {
        if (name == null) return false;
        return friendNicks.stream()
                .anyMatch(friend -> friend.getName().equalsIgnoreCase(name));
    }

    private void save() {
        try (Writer writer = new FileWriter(file)) {
            GSON.toJson(friendNicks, STAFF_LIST_TYPE, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean exists(String name) {
        if (name == null || name.isEmpty()) return false;
        return friendNicks.stream()
                .anyMatch(friend -> friend.getName().equalsIgnoreCase(name.trim()));
    }

    private void load() {
        if (!file.exists()) return;

        try (Reader reader = new FileReader(file)) {
            List<Friend> loaded = GSON.fromJson(reader, STAFF_LIST_TYPE);
            if (loaded != null) {
                friendNicks.clear();
                friendNicks.addAll(loaded);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
