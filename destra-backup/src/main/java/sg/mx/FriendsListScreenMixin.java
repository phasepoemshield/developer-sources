package sg.mx;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.io.*;
import java.nio.file.*;
import java.util.*;

@Mixin(targets = "ru/destra/gui/FriendsListScreen", remap = false)
public abstract class FriendsListScreenMixin {

    private static final String FRIENDS_FILE = "destra_friends.ini";
    private static final String PARTY_FILE = "destra_party.ini";

    private static Path getConfigPath(String filename) {
        try {
            Class<?> dc = Class.forName("ru.destra.core.DestraClient");
            Object instance = dc.getMethod("getInstance").invoke(null);
            java.lang.reflect.Field configDirField = dc.getDeclaredField("configDir");
            configDirField.setAccessible(true);
            File configDir = (File) configDirField.get(instance);
            if (configDir != null) {
                return configDir.toPath().resolve(filename);
            }
        } catch (Throwable ignored) {}
        return Paths.get(filename);
    }

    private static List<String> loadFriendNames() {
        List<String> names = new ArrayList<>();
        try {
            Path path = getConfigPath(FRIENDS_FILE);
            if (Files.exists(path)) {
                for (String line : Files.readAllLines(path)) {
                    line = line.trim();
                    if (!line.isEmpty() && !line.startsWith("#") && !line.startsWith("[")) {
                        int eq = line.indexOf('=');
                        if (eq > 0) {
                            names.add(line.substring(0, eq).trim());
                        } else {
                            names.add(line);
                        }
                    }
                }
            }
        } catch (Throwable ignored) {}
        return names;
    }

    private static void saveFriendNames(List<String> names) {
        try {
            Path path = getConfigPath(FRIENDS_FILE);
            Files.createDirectories(path.getParent());
            List<String> lines = new ArrayList<>();
            lines.add("# Destra Friends List");
            for (String name : names) {
                lines.add(name + "=offline");
            }
            Files.write(path, lines);
        } catch (Throwable ignored) {}
    }

    @Inject(method = "submitAddFriendRequest", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$saveFriendLocally(CallbackInfo ci) {
        try {
            java.lang.reflect.Field inputField = this.getClass().getDeclaredField("addFriendInput");
            inputField.setAccessible(true);
            String name = (String) inputField.get(this);
            if (name != null && !name.trim().isEmpty()) {
                List<String> friends = loadFriendNames();
                if (!friends.contains(name.trim())) {
                    friends.add(name.trim());
                    saveFriendNames(friends);
                }
            }
            inputField.set(this, "");
            java.lang.reflect.Field dialogField = this.getClass().getDeclaredField("addFriendDialogVisible");
            dialogField.setAccessible(true);
            dialogField.set(this, false);

            java.lang.reflect.Field refreshField = this.getClass().getDeclaredField("friendsNeedRefresh");
            refreshField.setAccessible(true);
            refreshField.set(this, true);

            ci.cancel();
        } catch (Throwable ignored) {}
    }

    @Inject(method = "getFriends", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$loadFriendsLocally(CallbackInfoReturnable<java.util.List> cir) {
        try {
            java.lang.reflect.Field refreshField = this.getClass().getDeclaredField("friendsNeedRefresh");
            refreshField.setAccessible(true);
            boolean needsRefresh = refreshField.getBoolean(this);

            java.lang.reflect.Field timerField = this.getClass().getDeclaredField("friendsRefreshTimer");
            timerField.setAccessible(true);
            Object timer = timerField.get(this);
            boolean timerElapsed = false;
            if (timer != null) {
                java.lang.reflect.Field lastResetField = timer.getClass().getDeclaredField("lastResetTime");
                lastResetField.setAccessible(true);
                long lastReset = lastResetField.getLong(timer);
                if (System.currentTimeMillis() - lastReset > 5000) {
                    timerElapsed = true;
                }
            }

            if (!needsRefresh && !timerElapsed) {
                java.lang.reflect.Field cachedField = this.getClass().getDeclaredField("cachedFriends");
                cachedField.setAccessible(true);
                cir.setReturnValue((List) cachedField.get(this));
                return;
            }

            refreshField.setBoolean(this, false);

            Class<?> friendEntryClass = Class.forName("ru.destra.social.FriendEntry");
            java.lang.reflect.Constructor<?> ctor = friendEntryClass.getDeclaredConstructor(String.class, String.class, String.class, boolean.class);
            ctor.setAccessible(true);

            List<Object> entries = new ArrayList<>();
            for (String name : loadFriendNames()) {
                Object entry = ctor.newInstance(name, "", "Offline", false);
                entries.add(entry);
            }

            java.lang.reflect.Field cachedField = this.getClass().getDeclaredField("cachedFriends");
            cachedField.setAccessible(true);
            List cached = (List) cachedField.get(this);
            cached.clear();
            cached.addAll(entries);

            cir.setReturnValue(cached);
        } catch (Throwable ignored) {}
    }

    @Inject(method = "removeFriend", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$removeFriendLocally(String name, CallbackInfo ci) {
        try {
            List<String> friends = loadFriendNames();
            friends.remove(name);
            saveFriendNames(friends);

            java.lang.reflect.Field refreshField = this.getClass().getDeclaredField("friendsNeedRefresh");
            refreshField.setAccessible(true);
            refreshField.set(this, true);

            ci.cancel();
        } catch (Throwable ignored) {}
    }

    @Inject(method = "enterPartyScreen", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$enterPartyScreenLocal(CallbackInfo ci) {
        try {
            java.lang.reflect.Field partyField = this.getClass().getDeclaredField("partyScreenVisible");
            partyField.setAccessible(true);
            if (!partyField.getBoolean(this)) {
                partyField.setBoolean(this, true);

                Object partyManager = null;
                try {
                    java.lang.reflect.Field pmField = this.getClass().getDeclaredField("partyManager");
                    pmField.setAccessible(true);
                    partyManager = pmField.get(this);
                } catch (Throwable ignored) {}

                if (partyManager != null) {
                    Class<?> pmClass = partyManager.getClass();

                    Path partyFile = getConfigPath(PARTY_FILE);
                    if (Files.exists(partyFile)) {
                        List<String> lines = Files.readAllLines(partyFile);
                        if (!lines.isEmpty()) {
                            String firstLine = lines.get(0).trim();
                            if (firstLine.startsWith("party_id=")) {
                                int partyId = Integer.parseInt(firstLine.substring("party_id=".length()));
                                java.lang.reflect.Field pidField = pmClass.getDeclaredField("partyId");
                                pidField.setAccessible(true);
                                pidField.setInt(partyManager, partyId);

                                java.lang.reflect.Field inPartyField = pmClass.getDeclaredField("inParty");
                                inPartyField.setAccessible(true);
                                inPartyField.setBoolean(partyManager, true);

                                java.lang.reflect.Field membersField = pmClass.getDeclaredField("members");
                                membersField.setAccessible(true);
                                List members = (List) membersField.get(partyManager);
                                members.clear();

                                Class<?> partyMemberClass = Class.forName("ru.destra.social.PartyMember");
                                java.lang.reflect.Constructor<?> pmCtor = partyMemberClass.getDeclaredConstructor(
                                    String.class, String.class, boolean.class, boolean.class, boolean.class, String.class, String.class);
                                pmCtor.setAccessible(true);

                                String myName = "You";
                                try {
                                    Class<?> mc = Class.forName("net.minecraft.client.MinecraftClient");
                                    Object mcInstance = mc.getMethod("getInstance").invoke(null);
                                    Object session = mc.getDeclaredMethod("getSession").invoke(mcInstance);
                                    myName = (String) session.getClass().getMethod("getUsername").invoke(session);
                                } catch (Throwable ignored) {}

                                Object selfMember = pmCtor.newInstance(myName, "", true, true, true, "0,0,0", "");
                                members.add(selfMember);

                                for (int i = 1; i < lines.size(); i++) {
                                    String memberName = lines.get(i).trim();
                                    if (!memberName.isEmpty() && !memberName.startsWith("#")) {
                                        Object member = pmCtor.newInstance(memberName, "", false, false, false, "0,0,0", "");
                                        members.add(member);
                                    }
                                }

                                java.lang.reflect.Field mcField = pmClass.getDeclaredField("memberCount");
                                mcField.setAccessible(true);
                                mcField.setInt(partyManager, members.size());
                            }
                        }
                    }
                }
            }
        } catch (Throwable ignored) {}
    }

    @Inject(method = "handleKeyPressed", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$forwardKeyToParty(int key, int scanCode, int modifiers, CallbackInfoReturnable<Boolean> cir) {
        try {
            java.lang.reflect.Field partyField = this.getClass().getDeclaredField("partyScreenVisible");
            partyField.setAccessible(true);
            if (partyField.getBoolean(this)) {
                java.lang.reflect.Field pmField = this.getClass().getDeclaredField("partyManager");
                pmField.setAccessible(true);
                Object pm = pmField.get(this);
                if (pm != null) {
                    try {
                        java.lang.reflect.Method kpMethod = pm.getClass().getMethod("handleKeyPressed", int.class, int.class, int.class);
                        Boolean result = (Boolean) kpMethod.invoke(pm, key, scanCode, modifiers);
                        if (result != null && result) {
                            cir.setReturnValue(true);
                            return;
                        }
                    } catch (NoSuchMethodException ignored) {
                    } catch (Throwable ignored) {}
                }
            }
        } catch (Throwable ignored) {}
    }

    @Inject(method = "handleCharTyped", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$forwardCharToParty(char chr, int modifiers, CallbackInfoReturnable<Boolean> cir) {
        try {
            java.lang.reflect.Field partyField = this.getClass().getDeclaredField("partyScreenVisible");
            partyField.setAccessible(true);
            if (partyField.getBoolean(this)) {
                java.lang.reflect.Field pmField = this.getClass().getDeclaredField("partyManager");
                pmField.setAccessible(true);
                Object pm = pmField.get(this);
                if (pm != null) {
                    try {
                        java.lang.reflect.Method ctMethod = pm.getClass().getMethod("handleCharTyped", char.class, int.class);
                        Boolean result = (Boolean) ctMethod.invoke(pm, chr, modifiers);
                        if (result != null && result) {
                            cir.setReturnValue(true);
                            return;
                        }
                    } catch (NoSuchMethodException ignored) {
                    } catch (Throwable ignored) {}
                }
            }
        } catch (Throwable ignored) {}
    }
}
