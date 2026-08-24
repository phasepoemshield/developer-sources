/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.utils;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import org.freedesktop.dbus.connections.BusAddress;
import org.freedesktop.dbus.exceptions.AddressResolvingException;
import org.freedesktop.dbus.utils.Hexdump;
import org.freedesktop.dbus.utils.Util;
import org.slf4j.LoggerFactory;

public final class AddressBuilder {
    public static String createMachineId() {
        try {
            String ascii = Hexdump.toAscii(MessageDigest.getInstance("MD5").digest(InetAddress.getLocalHost().getHostName().getBytes()));
            return ascii;
        }
        catch (NoSuchAlgorithmException _ex) {
            LoggerFactory.getLogger(AddressBuilder.class).trace("MD5 algorithm not present", _ex);
        }
        catch (UnknownHostException _ex) {
            LoggerFactory.getLogger(AddressBuilder.class).trace("Unable to determine this machines hostname", _ex);
        }
        return Util.randomString(32);
    }

    private static File determineMachineIdFile(String _dbusMachineIdFile) {
        String[] stringArray = new String[5];
        stringArray[0] = System.getenv("DBUS_MACHINE_ID_LOCATION");
        stringArray[1] = _dbusMachineIdFile;
        stringArray[2] = "/var/lib/dbus/machine-id";
        stringArray[3] = "/usr/local/var/lib/dbus/machine-id";
        stringArray[4] = "/etc/machine-id";
        List<String> locationPriorityList = Arrays.asList(stringArray);
        return locationPriorityList.stream().filter(s -> s != null).map(File::new).filter(f -> {
            if (!f.exists()) return false;
            if (f.length() <= 0L) return false;
            return true;
        }).findFirst().orElse(null);
    }

    public static String getDbusMachineId(String _dbusMachineIdFile) {
        File uuidfile = AddressBuilder.determineMachineIdFile(_dbusMachineIdFile);
        if (uuidfile != null) {
            String uuid = Util.readFileToString(uuidfile);
            if (uuid.length() > 0) {
                return uuid;
            }
            throw new AddressResolvingException("Cannot Resolve Session Bus Address: MachineId file is empty.");
        }
        if (Util.isWindows() || Util.isMacOs()) {
            return AddressBuilder.getFakeDbusMachineId();
        }
        throw new AddressResolvingException("Cannot Resolve Session Bus Address: MachineId file can not be found");
    }

    /*
     * WARNING - void declaration
     */
    public static BusAddress getSessionConnection(String _dbusMachineIdFile) {
        void var1_1;
        Object s = System.getProperty("DBUS_SESSION_BUS_ADDRESS");
        if (s == null) {
            s = Util.isMacOs() ? "unix:path=" + System.getenv("DBUS_LAUNCHD_SESSION_BUS_SOCKET") : System.getenv("DBUS_SESSION_BUS_ADDRESS");
        }
        if (s == null) {
            String string;
            String display = System.getenv("DISPLAY");
            if (display == null) {
                throw new AddressResolvingException("Cannot Resolve Session Bus Address: DISPLAY variable not set");
            }
            if (display.charAt(0) != ':') {
                if (display.contains(":")) {
                    display = display.substring(display.indexOf(58));
                }
            }
            String uuid = AddressBuilder.getDbusMachineId(_dbusMachineIdFile);
            String homedir = System.getProperty("user.home");
            File addressfile = new File(homedir + "/.dbus/session-bus", uuid + "-" + display.replaceAll(":([0-9]*)\\..*", "$1"));
            if (!addressfile.exists()) {
                throw new AddressResolvingException("Cannot Resolve Session Bus Address: " + String.valueOf(addressfile) + " not found");
            }
            Properties readProperties = Util.readProperties(addressfile);
            if (readProperties == null) {
                throw new AddressResolvingException("Cannot Resolve Session Bus Address: Unable to read " + String.valueOf(addressfile));
            }
            String sessionAddress = readProperties.getProperty("DBUS_SESSION_BUS_ADDRESS");
            if (Util.isEmpty(sessionAddress)) {
                throw new AddressResolvingException("Cannot Resolve Session Bus Address: No session information found in " + String.valueOf(addressfile));
            }
            if (sessionAddress.matches("^'[^']+'$")) {
                string = sessionAddress.replaceFirst("^'([^']+)'$", "$1");
            }
            return BusAddress.of(string);
        }
        return BusAddress.of((String)var1_1);
    }

    private AddressBuilder() {
    }

    public static BusAddress getSystemConnection() {
        String bus = System.getenv("DBUS_SYSTEM_BUS_ADDRESS");
        if (bus == null) {
            bus = "unix:path=/var/run/dbus/system_bus_socket";
        }
        return BusAddress.of(bus);
    }

    private static String getFakeDbusMachineId() {
        Object[] objectArray = new Object[2];
        objectArray[0] = Util.getCurrentUser();
        objectArray[1] = Util.getHostName();
        return String.format("%s@%s", objectArray);
    }
}

