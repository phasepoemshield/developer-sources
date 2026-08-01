package fun.nexisdlc.client.utils.client;

import lombok.experimental.UtilityClass;
import net.minecraft.util.Identifier;

import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.InputStream;

@UtilityClass
public class SoundUtil implements IMinecraft {
    private static final java.util.concurrent.CopyOnWriteArrayList<Clip> ACTIVE_CLIPS = new java.util.concurrent.CopyOnWriteArrayList<>();
    private static final java.util.concurrent.ConcurrentHashMap<String, Long> LAST_PLAY_MS = new java.util.concurrent.ConcurrentHashMap<>();
    private static final java.util.concurrent.ScheduledExecutorService SCHEDULER =
            java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r -> {
                Thread t = new Thread(r, "nexis-sound");
                t.setDaemon(true);
                return t;
            });
    private static final long DUPLICATE_WINDOW_MS = 100L;

    public void playSound(String sound, float value, boolean nonstop) {
        playSoundWithDuration(sound, value, nonstop);
    }

    public long playSoundWithDuration(String sound, float value, boolean nonstop) {
        if (sound == null || sound.isEmpty()) {
            return -1L;
        }

        if (mc == null || mc.getResourceManager() == null) return -1L;

        long now = System.currentTimeMillis();
        Long last = LAST_PLAY_MS.get(sound);
        if (last != null && (now - last) < DUPLICATE_WINDOW_MS) {
            return -1L;
        }
        LAST_PLAY_MS.put(sound, now);
        try {
            Clip clip = AudioSystem.getClip();
            InputStream is = mc.getResourceManager().getResource(Identifier.of("nexis","sounds/" + sound + ".wav")).get().getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(bis);
            if (audioInputStream == null) {
                return -1L;
            }

            clip.open(audioInputStream);
            clip.start();
            ACTIVE_CLIPS.add(clip);

            FloatControl floatControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            float min = floatControl.getMinimum();
            float max = floatControl.getMaximum();
            float volumeInDecibels = (float) (min * (1 - (value / 100.0)) + max * (value / 100.0));
            floatControl.setValue(volumeInDecibels);
            if (nonstop) {
                clip.addLineListener(event -> {
                    if (event.getType() == LineEvent.Type.STOP) {
                        clip.setFramePosition(0);
                        clip.start();
                    }
                });
            } else {
                clip.addLineListener(event -> {
                    if (event.getType() == LineEvent.Type.STOP) {
                        ACTIVE_CLIPS.remove(clip);
                        clip.close();
                    }
                });
            }
            return clip.getMicrosecondLength() / 1000L;
        } catch (Exception exception) {
            exception.printStackTrace();
            return -1L;
        }
    }

    public void stopSound() {
        for (Clip clip : ACTIVE_CLIPS) {
            try {
                clip.stop();
                clip.close();
            } catch (Exception ignored) {
            }
        }
        ACTIVE_CLIPS.clear();
    }

    public void playTogglePreview(String enableSound, String disableSound, float value) {
        if (enableSound == null || enableSound.isEmpty()) {
            return;
        }
        long durationMs = playSoundWithDuration(enableSound, value, false);
        if (disableSound == null || disableSound.isEmpty()) {
            return;
        }
        long delay = durationMs > 0 ? durationMs + 100L : 100L;
        SCHEDULER.schedule(() -> mc.execute(() -> playSoundWithDuration(disableSound, value, false)),
                delay, java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}
