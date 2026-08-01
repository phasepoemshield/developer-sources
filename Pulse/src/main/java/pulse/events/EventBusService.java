package pulse.events;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import meteordevelopment.orbit.EventBus;
import ru.pulse.Pulse;

public final class EventBusService {
    public static final EventBus EVENT_BUS = new EventBus();

    private EventBusService() {
    }

    private static MethodHandles.Lookup createLookup(Method method, Class<?> cls) throws IllegalAccessException, InvocationTargetException {
        return (MethodHandles.Lookup) method.invoke(null, cls, MethodHandles.lookup());
    }

    static {
        EVENT_BUS.registerLambdaFactory(Pulse.CLIENT_NAME, EventBusService::createLookup);
    }
}
