package fun.nexisdlc.client.utils.player;

import fun.nexisdlc.client.utils.config.AltStorage;
import fun.nexisdlc.mixins.accessors.MinecraftClientAccessor;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.session.Session;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Optional;
import java.util.UUID;

public final class AltSessionUtil {
    private AltSessionUtil() {
    }

    public static boolean applyOfflineSession(String rawNickname) {
        String nickname = AltStorage.normalizeNickname(rawNickname);
        if (nickname == null) {
            return false;
        }

        MinecraftClient client = MinecraftClient.getInstance();
        try {
            Session offlineSession = createOfflineSession(client.getSession().getClass(), nickname);
            ((MinecraftClientAccessor) client).setSession(offlineSession);
            return true;
        } catch (ReflectiveOperationException ignored) {
            return false;
        }
    }

    private static Session createOfflineSession(Class<?> sessionClass, String nickname) throws ReflectiveOperationException {
        Session fromFactory = tryCreateWithFactoryMethod(sessionClass, nickname);
        if (fromFactory != null) {
            return fromFactory;
        }

        UUID offlineUuid = UUID.nameUUIDFromBytes(("OfflinePlayer:" + nickname).getBytes(StandardCharsets.UTF_8));
        Constructor<?>[] constructors = sessionClass.getDeclaredConstructors();
        Arrays.sort(constructors, (a, b) -> Integer.compare(b.getParameterCount(), a.getParameterCount()));

        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            Object[] args = buildConstructorArgs(constructor.getParameterTypes(), nickname, offlineUuid);
            if (args == null) {
                continue;
            }
            try {
                return (Session) constructor.newInstance(args);
            } catch (IllegalArgumentException | InvocationTargetException ignored) {
            }
        }

        throw new ReflectiveOperationException("Unable to construct offline session");
    }

    private static Session tryCreateWithFactoryMethod(Class<?> sessionClass, String nickname) {
        for (Method method : sessionClass.getDeclaredMethods()) {
            if (!Modifier.isStatic(method.getModifiers())) {
                continue;
            }
            if (method.getParameterCount() != 1 || method.getParameterTypes()[0] != String.class) {
                continue;
            }
            if (method.getReturnType() != sessionClass) {
                continue;
            }
            String lower = method.getName().toLowerCase();
            if (!lower.contains("offline")) {
                continue;
            }
            try {
                method.setAccessible(true);
                return (Session) method.invoke(null, nickname);
            } catch (ReflectiveOperationException ignored) {
                return null;
            }
        }
        return null;
    }

    private static Object[] buildConstructorArgs(Class<?>[] parameterTypes, String nickname, UUID offlineUuid) {
        Object[] args = new Object[parameterTypes.length];
        int stringIndex = 0;

        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> type = parameterTypes[i];

            if (type == String.class) {
                if (stringIndex == 0) {
                    args[i] = nickname;
                } else if (stringIndex == 1) {
                    args[i] = offlineUuid.toString();
                } else {
                    args[i] = "";
                }
                stringIndex++;
                continue;
            }

            if (type == UUID.class) {
                args[i] = offlineUuid;
                continue;
            }

            if (type == Optional.class) {
                args[i] = Optional.empty();
                continue;
            }

            if (type.isEnum()) {
                Object constant = resolvePreferredEnumConstant(type);
                if (constant == null) {
                    return null;
                }
                args[i] = constant;
                continue;
            }

            if (type == boolean.class || type == Boolean.class) {
                args[i] = false;
                continue;
            }

            if (type == int.class || type == Integer.class) {
                args[i] = 0;
                continue;
            }

            return null;
        }
        return args;
    }

    private static Object resolvePreferredEnumConstant(Class<?> enumClass) {
        Object[] constants = enumClass.getEnumConstants();
        if (constants == null || constants.length == 0) {
            return null;
        }

        for (Object constant : constants) {
            String name = ((Enum<?>) constant).name();
            if ("LEGACY".equals(name) || "OFFLINE".equals(name) || "MOJANG".equals(name)) {
                return constant;
            }
        }

        return constants[0];
    }
}
