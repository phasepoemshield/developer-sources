/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 *  com.mojang.authlib.yggdrasil.ProfileResult
 *  minecraft.class00392
 *  minecraft.class01487
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.yggdrasil.ProfileResult;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01487;
import minecraft.class01610;
import org.jspecify.annotations.Nullable;

class class01625
extends Thread {
    final /* synthetic */ String N;
    final /* synthetic */ class01610 y;

    class01625(class01610 class016102, String string, String string2) {
        this.y = class016102;
        this.N = string2;
        super(string);
    }

    @Override
    public void run() {
        String string = Objects.requireNonNull(this.y.i, "Player name not initialized");
        try {
            ProfileResult profileResult = this.y.y.Nf().L().hasJoinedServer(string, this.N, this.N());
            if (profileResult != null) {
                GameProfile gameProfile = profileResult.profile();
                class01610.N.info("UUID of player {} is {}", (Object)gameProfile.name(), (Object)gameProfile.id());
                this.y.u.y();
                this.y.N(gameProfile);
            } else if (this.y.y.No()) {
                class01610.N.warn("Failed to verify username but will let them in anyway!");
                this.y.N(class01487.y((String)string));
            } else {
                this.y.N((class00392)class00392.L((String)"multiplayer.disconnect.unverified_username"));
                class01610.N.error("Username '{}' tried to join with an invalid session", (Object)string);
            }
        }
        catch (AuthenticationUnavailableException authenticationUnavailableException) {
            if (this.y.y.No()) {
                class01610.N.warn("Authentication servers are down but will let them in anyway!");
                this.y.N(class01487.y((String)string));
            }
            this.y.N((class00392)class00392.L((String)"multiplayer.disconnect.authservers_down"));
            class01610.N.error("Couldn't verify username because servers are unavailable");
        }
    }

    private @Nullable InetAddress N() {
        SocketAddress socketAddress = this.y.L.method_10755();
        return this.y.y.Nc() && socketAddress instanceof InetSocketAddress ? ((InetSocketAddress)socketAddress).getAddress() : null;
    }
}

