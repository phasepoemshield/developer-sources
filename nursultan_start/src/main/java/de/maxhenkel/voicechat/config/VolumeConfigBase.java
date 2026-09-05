/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 */
package de.maxhenkel.voicechat.config;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.configbuilder.CommentedProperties;
import de.maxhenkel.voicechat.configbuilder.CommentedPropertyConfig;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public abstract class VolumeConfigBase<T>
extends CommentedPropertyConfig {
    protected final Map<T, Double> volumes;

    public VolumeConfigBase(Path path) {
        super(new CommentedProperties(false));
        this.path = path;
        this.reload();
        this.properties.setHeaderComments(Collections.singletonList(String.format("%s %s volume config", CommonCompatibilityManager.INSTANCE.getModName(), this.getConfigName())));
        Map<String, String> map = this.getEntries();
        this.volumes = new HashMap<T, Double>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.properties.setComments(entry.getKey(), Collections.emptyList());
            try {
                double d = Double.parseDouble(entry.getValue());
                try {
                    this.volumes.put(this.mapKey(entry.getKey()), d);
                }
                catch (Exception exception) {
                    Voicechat.LOGGER.warn("Invalid volume key '{}'", new Object[]{entry.getKey()});
                }
            }
            catch (NumberFormatException numberFormatException) {
                Voicechat.LOGGER.warn("Invalid volume value '{}' for '{}'", new Object[]{entry.getValue(), entry.getKey()});
                this.properties.remove(entry.getKey());
            }
        }
        this.saveSync();
    }

    public boolean contains(T t) {
        return this.volumes.containsKey(t);
    }

    @Override
    public void save() {
        super.save();
        VoicechatClient.USERNAME_CACHE.saveAsync();
    }

    protected Double getDefaultValue() {
        return 1.0;
    }

    protected abstract String getConfigName();

    protected abstract String serializeKey(T var1);

    protected abstract T mapKey(String var1) throws Exception;

    public Map<T, Double> getVolumes() {
        return this.volumes;
    }

    public double getVolume(T t, double d) {
        Double d2 = this.volumes.get(t);
        if (d2 == null) {
            return d;
        }
        return d2;
    }

    public double getVolume(T t) {
        return this.getVolume(t, this.getDefaultValue());
    }

    public double setVolume(T t, double d, String ... stringArray) {
        this.volumes.put(t, d);
        this.properties.set(this.serializeKey(t), String.format(Locale.ROOT, "%.3f", d), stringArray);
        return d;
    }
}

