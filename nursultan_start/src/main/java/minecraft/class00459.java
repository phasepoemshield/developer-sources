/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04770
 *  minecraft.class05623
 *  minecraft.class07396
 *  minecraft.class07403
 *  minecraft.class07932
 *  minecraft.class08774
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import minecraft.class04770;
import minecraft.class05623;
import minecraft.class07396;
import minecraft.class07403;
import minecraft.class07932;
import minecraft.class08774;
import org.jspecify.annotations.Nullable;

public class class00459
implements class07396 {
    private final class07932 N;
    private final class05623 y;

    public Optional<class08774> L(UUID uUID) {
        return this.y.Nf().R().N(uUID);
    }

    public @Nullable class04770 L(String string) {
        return this.y.Nm().N(string);
    }

    public class00459(class05623 class056232, class07932 class079322) {
        this.N = class079322;
        this.y = class056232;
    }

    public Optional<class04770> y(Optional<UUID> optional, Optional<String> optional2) {
        if (optional.isPresent()) {
            return Optional.ofNullable(this.y.Nm().y(optional.get()));
        }
        if (optional2.isPresent()) {
            return Optional.ofNullable(this.y.Nm().N(optional2.get()));
        }
        return Optional.empty();
    }

    public Optional<class08774> y(UUID uUID) {
        return Optional.ofNullable(this.y.Nf().L().fetchProfile(uUID, true)).map(profileResult -> new class08774(profileResult.profile()));
    }

    public List<class04770> y(String string) {
        return this.y.Nm().y(string);
    }

    public void N(class04770 class047702, class07403 class074032) {
        this.y.Nm().y(class047702);
        this.N.N(class074032, "Remove player '{}'", new Object[]{class047702.method_74861()});
    }

    public List<class04770> N() {
        return this.y.Nm().v();
    }

    public Optional<class08774> N(String string) {
        return this.y.Nf().R().N(string);
    }

    public @Nullable class04770 N(UUID uUID) {
        return this.y.Nm().y(uUID);
    }
}

