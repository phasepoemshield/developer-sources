/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.entrypoint.EntrypointContainer
 */
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.entrypoint.EntrypointContainer;

final class NurEntry<T>
implements EntrypointContainer<T> {
    private final T value;
    private final ModContainer provider;
    private final String definition;

    NurEntry(T t, ModContainer modContainer, String string) {
        this.value = t;
        this.provider = modContainer;
        this.definition = string;
    }

    public T getEntrypoint() {
        return this.value;
    }

    public ModContainer getProvider() {
        return this.provider;
    }

    public String getDefinition() {
        return this.definition;
    }
}

