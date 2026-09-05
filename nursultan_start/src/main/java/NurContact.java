/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.metadata.ContactInformation
 */
import java.util.Map;
import java.util.Optional;
import net.fabricmc.loader.api.metadata.ContactInformation;

final class NurContact
implements ContactInformation {
    private final Map<String, String> map;

    NurContact(Map<String, String> map) {
        this.map = map;
    }

    public Optional<String> get(String string) {
        return Optional.ofNullable(this.map.get(string));
    }

    public Map<String, String> asMap() {
        return this.map;
    }
}

