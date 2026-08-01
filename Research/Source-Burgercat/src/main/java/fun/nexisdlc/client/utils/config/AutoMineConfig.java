package fun.nexisdlc.client.utils.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import fun.nexisdlc.client.utils.client.IMinecraft;
import lombok.Getter;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.BlockPos;

import java.io.*;

public class AutoMineConfig implements IMinecraft {
    private final File file;
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    @Getter
    private BlockPos pos1;
    @Getter
    private BlockPos pos2;

    public AutoMineConfig() {
        this.file = new File(new File(MinecraftClient.getInstance().runDirectory, "nexis/files"), "automine.json");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        load();
    }

    public void setPos1(BlockPos pos) {
        this.pos1 = pos;
        save();
    }

    public void setPos2(BlockPos pos) {
        this.pos2 = pos;
        save();
    }

    public void clear() {
        this.pos1 = null;
        this.pos2 = null;
        save();
    }

    public boolean hasArea() {
        return pos1 != null && pos2 != null;
    }

    private void save() {
        Data data = new Data();
        if (pos1 != null) {
            data.pos1 = new Pos(pos1.getX(), pos1.getY(), pos1.getZ());
        }
        if (pos2 != null) {
            data.pos2 = new Pos(pos2.getX(), pos2.getY(), pos2.getZ());
        }
        try (Writer writer = new FileWriter(file)) {
            GSON.toJson(data, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void load() {
        if (!file.exists()) return;
        try (Reader reader = new FileReader(file)) {
            Data data = GSON.fromJson(reader, Data.class);
            if (data != null) {
                if (data.pos1 != null) {
                    pos1 = new BlockPos(data.pos1.x, data.pos1.y, data.pos1.z);
                }
                if (data.pos2 != null) {
                    pos2 = new BlockPos(data.pos2.x, data.pos2.y, data.pos2.z);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class Data {
        Pos pos1;
        Pos pos2;
    }

    private static class Pos {
        int x, y, z;

        Pos(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
