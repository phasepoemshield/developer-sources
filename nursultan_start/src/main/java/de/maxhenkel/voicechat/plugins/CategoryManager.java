/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins;

import de.maxhenkel.voicechat.plugins.impl.VolumeCategoryImpl;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;

public class CategoryManager {
    protected final Map<String, VolumeCategoryImpl> categories = new ConcurrentHashMap<String, VolumeCategoryImpl>();

    @Nullable
    public VolumeCategoryImpl removeCategory(String string) {
        return this.categories.remove(string);
    }

    public Collection<VolumeCategoryImpl> getCategories() {
        return this.categories.values();
    }

    public void addCategory(VolumeCategoryImpl volumeCategoryImpl) {
        this.categories.put(volumeCategoryImpl.getId(), volumeCategoryImpl);
    }
}

