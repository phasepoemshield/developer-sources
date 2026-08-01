package fun.nexisdlc.client.utils.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import net.minecraft.client.MinecraftClient;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GPSStorage {
    private final File file;
    private final List<GPSPoint> points = new ArrayList<>();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static class GPSPoint {
        private final String name;
        private final double x;
        private final double y;
        private final double z;

        public GPSPoint(String name, double x, double y, double z) {
            this.name = name;
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public String getName() {
            return name;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double getZ() {
            return z;
        }
    }

    public GPSStorage() {
        this.file = new File(new File(MinecraftClient.getInstance().runDirectory, "nexis/files"), "gps.json");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        load();
    }

    public void add(String name, double x, double y, double z) {
        if (!exists(name)) {
            points.add(new GPSPoint(name, x, y, z));
            save();
        }
    }

    public void remove(String name) {
        points.removeIf(point -> point.getName().equalsIgnoreCase(name));
        save();
    }

    public void clear() {
        points.clear();
        save();
    }

    public List<GPSPoint> getPoints() {
        return new ArrayList<>(points);
    }

    public boolean exists(String name) {
        return points.stream().anyMatch(point -> point.getName().equalsIgnoreCase(name));
    }

    private void save() {
        try (Writer writer = new FileWriter(file)) {
            GSON.toJson(points, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        if (!file.exists()) return;
        try (Reader reader = new FileReader(file)) {
            List<GPSPoint> loadedPoints = GSON.fromJson(reader, new TypeToken<List<GPSPoint>>(){}.getType());
            if (loadedPoints != null) {
                points.clear();
                points.addAll(loadedPoints);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}