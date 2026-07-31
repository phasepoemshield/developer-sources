package sg.mx;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.function.Consumer;

@Mixin(targets = "ru/destra/social/SocialAuthClient", remap = false)
public abstract class SocialAuthClientMixin {

    private static List<String> loadLocalFriends() {
        List<String> names = new ArrayList<>();
        try {
            Path path = Paths.get("destra_friends.ini");
            Class<?> dc = Class.forName("ru.destra.core.DestraClient");
            Object instance = dc.getMethod("getInstance").invoke(null);
            java.lang.reflect.Field f = dc.getDeclaredField("configDir");
            f.setAccessible(true);
            File dir = (File) f.get(instance);
            if (dir != null) path = dir.toPath().resolve("destra_friends.ini");
            if (Files.exists(path)) {
                for (String line : Files.readAllLines(path)) {
                    line = line.trim();
                    if (!line.isEmpty() && !line.startsWith("#") && !line.startsWith("[")) {
                        int eq = line.indexOf('=');
                        names.add(eq > 0 ? line.substring(0, eq).trim() : line);
                    }
                }
            }
        } catch (Throwable ignored) {}
        return names;
    }

    @Inject(method = "isConnected", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$isConnected(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }

    @Inject(method = "createPartyAsync", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$createParty(Consumer callback, CallbackInfo ci) {
        if (callback != null) callback.accept("PARTY_CREATED:99999");
        ci.cancel();
    }

    @Inject(method = "inviteToPartyAsync", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$invite(String name, Consumer callback, CallbackInfo ci) {
        if (callback != null) callback.accept("INVITE_SENT:" + name);
        ci.cancel();
    }

    @Inject(method = "disbandPartyAsync", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$disband(Consumer callback, CallbackInfo ci) {
        if (callback != null) callback.accept("PARTY_DISBANDED");
        ci.cancel();
    }

    @Inject(method = "leavePartyAsync", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$leave(Consumer callback, CallbackInfo ci) {
        if (callback != null) callback.accept("PARTY_LEFT");
        ci.cancel();
    }

    @Inject(method = "kickFromPartyAsync", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$kick(String name, Consumer callback, CallbackInfo ci) {
        if (callback != null) callback.accept("MEMBER_KICKED:" + name);
        ci.cancel();
    }

    @Inject(method = "sendFriendRequestAsync", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$sendFriendReq(String name, Consumer callback, CallbackInfo ci) {
        if (callback != null) callback.accept("FRIEND_REQUEST_SENT:" + name);
        ci.cancel();
    }

    @Inject(method = "removeFriendAsync", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$removeFriend(String name, Consumer callback, CallbackInfo ci) {
        if (callback != null) callback.accept("FRIEND_REMOVED:" + name);
        ci.cancel();
    }

    @Inject(method = "getFriendList", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$getFriendList(CallbackInfoReturnable<String> cir) {
        try {
            Class<?> pmClass = Class.forName("ru.destra.social.PartyManager");
            java.lang.reflect.Field prefixField = pmClass.getDeclaredField("PROTO_FRIENDS_PREFIX");
            prefixField.setAccessible(true);
            String prefix = (String) prefixField.get(null);

            java.lang.reflect.Field sepField = pmClass.getDeclaredField("FRIENDS_LIST_SEPARATOR");
            sepField.setAccessible(true);
            String sep = (String) sepField.get(null);

            java.lang.reflect.Field statusField = pmClass.getDeclaredField("FRIEND_STATUS_KEY");
            statusField.setAccessible(true);
            String statusKey = (String) statusField.get(null);

            java.lang.reflect.Field offlineField = pmClass.getDeclaredField("STATUS_OFFLINE");
            offlineField.setAccessible(true);
            String offline = (String) offlineField.get(null);

            java.lang.reflect.Field serverSepField = pmClass.getDeclaredField("FRIEND_SERVER_SEPARATOR");
            serverSepField.setAccessible(true);
            String serverSep = (String) serverSepField.get(null);

            StringBuilder sb = new StringBuilder(prefix);
            List<String> friends = loadLocalFriends();
            for (int i = 0; i < friends.size(); i++) {
                if (i > 0) sb.append(sep);
                sb.append(friends.get(i)).append(serverSep).append(statusKey).append("=").append(offline);
            }
            cir.setReturnValue(sb.toString());
        } catch (Throwable e) {
            cir.setReturnValue("");
        }
    }

    @Inject(method = "getPartyInfo", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$getPartyInfo(CallbackInfoReturnable<String> cir) {
        cir.setReturnValue("");
    }

    @Inject(method = "getPartyMemberMetadata", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$getPartyMetadata(String name, CallbackInfoReturnable<String> cir) {
        cir.setReturnValue("");
    }

    @Inject(method = "getFriendMetadata", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$getFriendMetadata(String name, CallbackInfoReturnable<String> cir) {
        cir.setReturnValue("");
    }
}
