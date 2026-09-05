/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.cache.IWaypoint
 *  baritone.api.cache.IWaypoint$Tag
 *  baritone.api.cache.IWaypointCollection
 *  baritone.api.cache.Waypoint
 *  baritone.api.utils.BetterBlockPos
 */
package baritone.cache;

import baritone.api.cache.IWaypoint;
import baritone.api.cache.IWaypointCollection;
import baritone.api.cache.Waypoint;
import baritone.api.utils.BetterBlockPos;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class WaypointCollection
implements IWaypointCollection {
    private static final long WAYPOINT_MAGIC_VALUE = 121977993584L;
    private final Path directory;
    private final Map<IWaypoint.Tag, Set<IWaypoint>> waypoints;

    WaypointCollection(Path path) {
        this.directory = path;
        if (!Files.exists(path, new LinkOption[0])) {
            try {
                Files.createDirectories(path, new FileAttribute[0]);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        System.out.println("Would save waypoints to " + String.valueOf(path));
        this.waypoints = new HashMap<IWaypoint.Tag, Set<IWaypoint>>();
        this.load();
    }

    private synchronized void load(IWaypoint.Tag tag) {
        this.waypoints.put(tag, new HashSet());
        Path path = this.directory.resolve(tag.name().toLowerCase() + ".mp4");
        if (!Files.exists(path, new LinkOption[0])) {
            return;
        }
        try (FileInputStream fileInputStream = new FileInputStream(path.toFile());
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
             DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);){
            long l = dataInputStream.readLong();
            if (l != 121977993584L) {
                throw new IOException("Bad magic value " + l);
            }
            long l2 = dataInputStream.readLong();
            while (l2-- > 0L) {
                String string = dataInputStream.readUTF();
                long l3 = dataInputStream.readLong();
                int n = dataInputStream.readInt();
                int n2 = dataInputStream.readInt();
                int n3 = dataInputStream.readInt();
                this.waypoints.get(tag).add((IWaypoint)new Waypoint(string, tag, new BetterBlockPos(n, n2, n3), l3));
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    private void load() {
        for (IWaypoint.Tag tag : IWaypoint.Tag.values()) {
            this.load(tag);
        }
    }

    private synchronized void save(IWaypoint.Tag tag) {
        Path path = this.directory.resolve(tag.name().toLowerCase() + ".mp4");
        try (FileOutputStream fileOutputStream = new FileOutputStream(path.toFile());
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
             DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);){
            dataOutputStream.writeLong(121977993584L);
            dataOutputStream.writeLong(this.waypoints.get(tag).size());
            for (IWaypoint iWaypoint : this.waypoints.get(tag)) {
                dataOutputStream.writeUTF(iWaypoint.getName());
                dataOutputStream.writeLong(iWaypoint.getCreationTimestamp());
                dataOutputStream.writeInt(iWaypoint.getLocation().method_10263());
                dataOutputStream.writeInt(iWaypoint.getLocation().method_10264());
                dataOutputStream.writeInt(iWaypoint.getLocation().method_10260());
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public Set<IWaypoint> getByTag(IWaypoint.Tag tag) {
        return Collections.unmodifiableSet(this.waypoints.get(tag));
    }

    public IWaypoint getMostRecentByTag(IWaypoint.Tag tag) {
        return this.waypoints.get(tag).stream().min(Comparator.comparingLong(iWaypoint -> -iWaypoint.getCreationTimestamp())).orElse(null);
    }

    public void removeWaypoint(IWaypoint iWaypoint) {
        if (this.waypoints.get(iWaypoint.getTag()).remove(iWaypoint)) {
            this.save(iWaypoint.getTag());
        }
    }

    public Set<IWaypoint> getAllWaypoints() {
        return this.waypoints.values().stream().flatMap(Collection::stream).collect(Collectors.toSet());
    }

    public void addWaypoint(IWaypoint iWaypoint) {
        if (this.waypoints.get(iWaypoint.getTag()).add(iWaypoint)) {
            this.save(iWaypoint.getTag());
        }
    }
}

