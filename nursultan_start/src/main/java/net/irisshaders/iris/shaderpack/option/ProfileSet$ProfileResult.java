/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.option;

import java.util.Optional;
import net.irisshaders.iris.shaderpack.option.Profile;

public class ProfileSet$ProfileResult {
    public final Optional<Profile> current;
    public final Profile next;
    public final Profile previous;

    ProfileSet$ProfileResult(Profile profile, Profile profile2, Profile profile3) {
        this.current = Optional.ofNullable(profile);
        this.next = profile2;
        this.previous = profile3;
    }
}

