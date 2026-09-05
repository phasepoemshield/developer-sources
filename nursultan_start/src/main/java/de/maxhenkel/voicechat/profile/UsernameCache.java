/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.VoicechatClient
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.profile;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.profile.UsernameCache$1;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class UsernameCache {
    private static final ExecutorService SAVE_EXECUTOR_SERVICE = Executors.newSingleThreadExecutor(runnable -> {
        Thread thread = new Thread(runnable);
        thread.setName("UsernameCacheSaver");
        thread.setDaemon(true);
        return thread;
    });
    private final File file;
    private final Gson gson;
    private Map<UUID, String> names;

    public boolean has(UUID uUID) {
        return this.names.containsKey(uUID);
    }

    public UsernameCache(File file) {
        this.file = file;
        this.gson = new GsonBuilder().create();
        this.names = new ConcurrentHashMap<UUID, String>();
        this.load();
    }

    public void load() {
        if (!this.file.exists()) {
            return;
        }
        try (FileReader fileReader = new FileReader(this.file);){
            Type type = new UsernameCache$1(this).getType();
            this.names = (Map)this.gson.fromJson((Reader)fileReader, type);
        }
        catch (Exception exception) {
            Voicechat.LOGGER.error("Failed to load username cache", new Object[]{exception});
        }
        if (this.names == null) {
            this.names = new ConcurrentHashMap<UUID, String>();
        }
    }

    public synchronized void save() {
        long l = System.currentTimeMillis();
        this.file.getParentFile().mkdirs();
        Set set = VoicechatClient.PLAYER_VOLUME_CONFIG.getVolumes().keySet();
        Map<Object, Object> map = this.names.entrySet().stream().filter(entry -> set.contains(entry.getKey())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        Voicechat.LOGGER.debug("Reduced cached usernames to save from {} to {}", new Object[]{this.names.size(), map.size()});
        try (FileWriter fileWriter = new FileWriter(this.file);){
            this.gson.toJson(map, (Appendable)fileWriter);
            Voicechat.LOGGER.debug("Saved username cache in {}ms", new Object[]{System.currentTimeMillis() - l});
        }
        catch (Exception exception) {
            Voicechat.LOGGER.error("Failed to save username cache", new Object[]{exception});
        }
    }

    public void updateUsername(UUID uUID, String string) {
        this.names.put(uUID, string);
    }

    @Nullable
    public String getUsername(UUID uUID) {
        return this.names.get(uUID);
    }

    public void updateUsernameAndSave(UUID uUID, String string) {
        String string2 = this.names.get(uUID);
        if (!string.equals(string2)) {
            this.names.put(uUID, string);
            if (VoicechatClient.PLAYER_VOLUME_CONFIG.contains((Object)uUID)) {
                this.saveAsync();
            }
        }
    }

    public void saveAsync() {
        SAVE_EXECUTOR_SERVICE.execute(this::save);
    }
}

