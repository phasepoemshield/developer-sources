package sg.mx;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.*;

@Mixin(targets = "ru/destra/social/FriendServerClient", remap = false)
public abstract class FriendServerClientMixin {

    @Inject(method = "getFilteredEntries", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$getRealEvents(CallbackInfoReturnable<List> cir) {
        try {
            Class<?> entryClass = Class.forName("ru.destra.social.NotificationEntry");
            java.lang.reflect.Constructor<?> ctor = entryClass.getDeclaredConstructor(
                String.class, String.class, String.class, String.class, long.class, String.class);
            ctor.setAccessible(true);

            List<Object> entries = new ArrayList<>();

            Class<?> wpModule = Class.forName("ru.destra.module.WaypointEventModule");
            java.lang.reflect.Field waypointsField = wpModule.getDeclaredField("waypoints");
            waypointsField.setAccessible(true);
            Set waypoints = (Set) waypointsField.get(null);

            if (waypoints != null) {
                for (Object wp : waypoints) {
                    java.lang.reflect.Field isEventField = wp.getClass().getDeclaredField("isEvent");
                    isEventField.setAccessible(true);
                    boolean isEvent = isEventField.getBoolean(wp);

                    java.lang.reflect.Field isForeignField = wp.getClass().getDeclaredField("isForeignEvent");
                    isForeignField.setAccessible(true);
                    boolean isForeign = isForeignField.getBoolean(wp);

                    if (!isEvent && !isForeign) continue;

                    java.lang.reflect.Field nameField = wp.getClass().getDeclaredField("name");
                    nameField.setAccessible(true);
                    String name = (String) nameField.get(wp);

                    java.lang.reflect.Field posField = wp.getClass().getDeclaredField("position");
                    posField.setAccessible(true);
                    Object pos = posField.get(wp);
                    int x = (int) pos.getClass().getMethod("getX").invoke(pos);
                    int y = (int) pos.getClass().getMethod("getY").invoke(pos);
                    int z = (int) pos.getClass().getMethod("getZ").invoke(pos);

                    java.lang.reflect.Field serverIdField = wp.getClass().getDeclaredField("serverId");
                    serverIdField.setAccessible(true);
                    int serverId = serverIdField.getInt(wp);

                    java.lang.reflect.Field createdField = wp.getClass().getDeclaredField("createdAt");
                    createdField.setAccessible(true);
                    long createdAt = createdField.getLong(wp);

                    java.lang.reflect.Field sourceField = wp.getClass().getDeclaredField("sourceLabel");
                    sourceField.setAccessible(true);
                    String source = (String) sourceField.get(wp);
                    if (source == null) source = "";

                    String type = isForeign ? "other_event" : "event";
                    String title = name != null ? name : "Event";
                    String message = "Server " + serverId + ", coords: " + x + ", " + y + ", " + z;
                    String id = "wp_" + name + "_" + createdAt;

                    Object entry = ctor.newInstance(type, title, message, "", createdAt, id);
                    entries.add(entry);
                }
            }

            cir.setReturnValue(entries);
        } catch (Throwable e) {
            e.printStackTrace();
            cir.setReturnValue(new ArrayList<>());
        }
    }
}
