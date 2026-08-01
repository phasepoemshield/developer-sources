package fun.nexisdlc.client.utils.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import lombok.Getter;
import net.minecraft.client.MinecraftClient;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class StaffStorage {
    private final File file;
    private final List<Staff> staffNicks = new ArrayList<>();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Type STAFF_LIST_TYPE = new TypeToken<List<Staff>>() {}.getType();

    @Getter
    public static class Staff {
        private final String name;

        public Staff(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Staff)) return false;
            Staff staff = (Staff) o;
            return name.equalsIgnoreCase(staff.name);
        }

        @Override
        public int hashCode() {
            return name.toLowerCase().hashCode();
        }
    }

    public StaffStorage() {
        this.file = new File(new File(MinecraftClient.getInstance().runDirectory, "nexis/files"), "staffs.json");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        load();
    }

    public void add(String nick) {
        if (nick == null || nick.trim().isEmpty()) return;
        String trimmed = nick.trim();
        if (staffNicks.stream().noneMatch(s -> s.getName().equalsIgnoreCase(trimmed))) {
            staffNicks.add(new Staff(trimmed));
            save();
        }
    }

    public void remove(String nick) {
        if (nick != null) {
            staffNicks.removeIf(staff -> staff.getName().equalsIgnoreCase(nick.trim()));
            save();
        }
    }

    public void clear() {
        staffNicks.clear();
        save();
    }

    public List<Staff> getStaffs() {
        return new ArrayList<>(staffNicks);
    }

    public boolean isStaff(String name) {
        if (name == null) return false;
        return staffNicks.stream()
                .anyMatch(staff -> staff.getName().equalsIgnoreCase(name));
    }

    private void save() {
        try (Writer writer = new FileWriter(file)) {
            GSON.toJson(staffNicks, STAFF_LIST_TYPE, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean exists(String name) {
        if (name == null || name.isEmpty()) return false;
        return staffNicks.stream()
                .anyMatch(staff -> staff.getName().equalsIgnoreCase(name.trim()));
    }

    private void load() {
        if (!file.exists()) return;

        try (Reader reader = new FileReader(file)) {
            List<Staff> loaded = GSON.fromJson(reader, STAFF_LIST_TYPE);
            if (loaded != null) {
                staffNicks.clear();
                staffNicks.addAll(loaded);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}