package fun.nexisdlc.modules.impl.combat.aura.rotations;

import net.fabricmc.loader.api.FabricLoader;
import ru.sterford.annotations.NativeCall;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Пишет:
 * seq + normalized features + human delta labels.
 * <p>
 * seq нужен, чтобы train не строил окна через разрыв:
 * GUI, target null, target switch, enable/disable.
 */
public class NeuroDataLogger {
    private BufferedWriter writer;
    private Path file;
    private int seq = 0;

    @NativeCall
    public void start() {
        try {
            Path dir = FabricLoader.getInstance().getGameDir().resolve("nexis_rotation_logs");
            Files.createDirectories(dir);

            String name = "session_" + LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss")) + ".csv";

            file = dir.resolve(name);
            writer = Files.newBufferedWriter(file, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

            seq = 0;

            StringBuilder sb = new StringBuilder();
            sb.append("seq,");
            for (int i = 0; i < RotationFeatures.FEATURES; i++) {
                sb.append("f").append(i).append(",");
            }
            sb.append("dyaw,dpitch\n");

            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void nextSegment() {
        seq++;
    }

    public void writeRow(float[] features, float dYaw, float dPitch) {
        if (writer == null) return;

        try {
            StringBuilder sb = new StringBuilder();

            sb.append(seq).append(",");

            for (float v : features) {
                sb.append(v).append(",");
            }

            sb.append(dYaw).append(",").append(dPitch).append("\n");

            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        try {
            if (writer != null) {
                writer.flush();
                writer.close();
                writer = null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Path getFile() {
        return file;
    }
}