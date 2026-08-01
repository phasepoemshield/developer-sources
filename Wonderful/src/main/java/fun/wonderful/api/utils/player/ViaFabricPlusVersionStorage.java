package fun.wonderful.api.utils.player;

import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public final class ViaFabricPlusVersionStorage {
    private static final String PROTOCOL_ID_KEY = "viaFabricPlusProtocolId";
    private static final String PROTOCOL_NAME_KEY = "viaFabricPlusProtocolName";
    private static Integer pendingProtocolId;

    private ViaFabricPlusVersionStorage() {
    }

    public static void append(JsonObject object) {
        String protocolName;
        ViaFabricPlusVersionStorage.applyPending();
        Object targetVersion = ViaFabricPlusVersionStorage.getTargetVersion();
        if (targetVersion == null) {
            return;
        }
        Integer protocolId = ViaFabricPlusVersionStorage.readProtocolId(targetVersion);
        if (protocolId != null) {
            object.addProperty(PROTOCOL_ID_KEY, (Number)protocolId);
        }
        if ((protocolName = ViaFabricPlusVersionStorage.readProtocolName(targetVersion)) != null && !protocolName.isBlank()) {
            object.addProperty(PROTOCOL_NAME_KEY, protocolName);
        }
    }

    public static void read(JsonObject object) {
        if (!object.has(PROTOCOL_ID_KEY)) {
            return;
        }
        try {
            int protocolId = object.get(PROTOCOL_ID_KEY).getAsInt();
            if (!ViaFabricPlusVersionStorage.setTargetVersion(protocolId)) {
                pendingProtocolId = protocolId;
            }
        }
        catch (Throwable throwable) {
            
        }
    }

    public static void applyPending() {
        if (pendingProtocolId == null) {
            return;
        }
        try {
            if (ViaFabricPlusVersionStorage.setTargetVersion(pendingProtocolId)) {
                pendingProtocolId = null;
            }
        }
        catch (Throwable throwable) {
            
        }
    }

    private static Object getTargetVersion() {
        try {
            Object impl = ViaFabricPlusVersionStorage.getViaFabricPlusImpl();
            if (impl == null) {
                return null;
            }
            Method method = impl.getClass().getMethod("getTargetVersion", new Class[0]);
            return method.invoke(impl, new Object[0]);
        }
        catch (Throwable ignored) {
            return null;
        }
    }

    private static boolean setTargetVersion(int protocolId) throws Exception {
        Object impl = ViaFabricPlusVersionStorage.getViaFabricPlusImpl();
        if (impl == null) {
            return false;
        }
        Class<?> protocolVersionClass = Class.forName("com.viaversion.viaversion.api.protocol.version.ProtocolVersion");
        Method getProtocol = protocolVersionClass.getMethod("getProtocol", Integer.TYPE);
        Object protocolVersion = getProtocol.invoke(null, protocolId);
        if (protocolVersion == null) {
            return false;
        }
        try {
            Method setTargetVersion = impl.getClass().getMethod("setTargetVersion", protocolVersionClass);
            setTargetVersion.invoke(impl, protocolVersion);
        }
        catch (NoSuchMethodException ignored) {
            Method setTargetVersion = impl.getClass().getMethod("setTargetVersion", protocolVersionClass, Boolean.TYPE);
            setTargetVersion.invoke(impl, protocolVersion, false);
        }
        return true;
    }

    private static Object getViaFabricPlusImpl() {
        try {
            Class<?> viaFabricPlusClass = Class.forName("com.viaversion.viafabricplus.ViaFabricPlus");
            return viaFabricPlusClass.getMethod("getImpl", new Class[0]).invoke(null, new Object[0]);
        }
        catch (Throwable ignored) {
            return null;
        }
    }

    private static Integer readProtocolId(Object targetVersion) {
        try {
            Method method = targetVersion.getClass().getMethod("getVersion", new Class[0]);
            Object value = method.invoke(targetVersion, new Object[0]);
            if (value instanceof Number) {
                Number number = (Number)value;
                return number.intValue();
            }
        }
        catch (Throwable throwable) {
            
        }
        try {
            for (Method method : targetVersion.getClass().getMethods()) {
                Object value;
                String name;
                Class<?> returnType;
                if (!Modifier.isPublic(method.getModifiers()) || method.getParameterCount() != 0 || (returnType = method.getReturnType()) != Integer.TYPE && returnType != Integer.class || !(name = method.getName().toLowerCase()).contains("version") && !name.contains("protocol") && !name.contains("id") || !((value = method.invoke(targetVersion, new Object[0])) instanceof Number)) continue;
                Number number = (Number)value;
                return number.intValue();
            }
        }
        catch (Throwable throwable) {
            
        }
        return null;
    }

    private static String readProtocolName(Object targetVersion) {
        try {
            Method method = targetVersion.getClass().getMethod("getName", new Class[0]);
            Object value = method.invoke(targetVersion, new Object[0]);
            return value == null ? null : String.valueOf(value);
        }
        catch (Throwable ignored) {
            return String.valueOf(targetVersion);
        }
    }
}