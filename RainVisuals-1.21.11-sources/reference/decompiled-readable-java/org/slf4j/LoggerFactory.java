/*
 * Decompiled with CFR 0.152.
 */
package org.slf4j;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.NOP_FallbackServiceProvider;
import org.slf4j.helpers.Reporter;
import org.slf4j.helpers.SubstituteLogger;
import org.slf4j.helpers.SubstituteServiceProvider;
import org.slf4j.helpers.Util;
import org.slf4j.spi.SLF4JServiceProvider;

public final class LoggerFactory {
    static final String REPLAY_URL = "https://www.slf4j.org/codes.html#replay";
    static final String LOGGER_NAME_MISMATCH_URL = "https://www.slf4j.org/codes.html#loggerNameMismatch";
    static final String JAVA_VENDOR_PROPERTY = "java.vendor.url";
    static final String NO_PROVIDERS_URL = "https://www.slf4j.org/codes.html#noProviders";
    static final SubstituteServiceProvider SUBST_PROVIDER;
    static final String SUBSTITUTE_LOGGER_URL = "https://www.slf4j.org/codes.html#substituteLogger";
    static final String VERSION_MISMATCH = "https://www.slf4j.org/codes.html#version_mismatch";
    static final int SUCCESSFUL_INITIALIZATION = 3;
    static final String MULTIPLE_BINDINGS_URL = "https://www.slf4j.org/codes.html#multiple_bindings";
    static boolean DETECT_LOGGER_NAME_MISMATCH;
    static final String IGNORED_BINDINGS_URL = "https://www.slf4j.org/codes.html#ignoredBindings";
    static final int ONGOING_INITIALIZATION = 1;
    public static final String PROVIDER_PROPERTY_KEY = "slf4j.provider";
    static final String DETECT_LOGGER_NAME_MISMATCH_PROPERTY = "slf4j.detectLoggerNameMismatch";
    static final String CODES_PREFIX = "https://www.slf4j.org/codes.html";
    static volatile int INITIALIZATION_STATE;
    private static final String STATIC_LOGGER_BINDER_PATH = "org/slf4j/impl/StaticLoggerBinder.class";
    static final String UNSUCCESSFUL_INIT_URL = "https://www.slf4j.org/codes.html#unsuccessfulInit";
    static volatile SLF4JServiceProvider PROVIDER;
    static final int UNINITIALIZED = 0;
    static final String UNSUCCESSFUL_INIT_MSG = "org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit";
    private static final String[] API_COMPATIBILITY_LIST;
    static final int NOP_FALLBACK_INITIALIZATION = 4;
    static final int FAILED_INITIALIZATION = 2;
    static final NOP_FallbackServiceProvider NOP_FALLBACK_SERVICE_PROVIDER;

    /*
     * WARNING - void declaration
     */
    public static Logger getLogger(Class<?> clazz) {
        void var1_1;
        Logger logger = LoggerFactory.getLogger(clazz.getName());
        if (DETECT_LOGGER_NAME_MISMATCH) {
            Class<?> autoComputedCallingClass = Util.getCallingClass();
            if (autoComputedCallingClass != null) {
                if (LoggerFactory.nonMatchingClasses(clazz, autoComputedCallingClass)) {
                    Object[] objectArray = new Object[2];
                    objectArray[0] = logger.getName();
                    objectArray[1] = autoComputedCallingClass.getName();
                    Reporter.warn(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", objectArray));
                    Reporter.warn("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
                }
            }
        }
        return var1_1;
    }

    public static Logger getLogger(String name) {
        ILoggerFactory iLoggerFactory = LoggerFactory.getILoggerFactory();
        return iLoggerFactory.getLogger(name);
    }

    private LoggerFactory() {
    }

    private static boolean nonMatchingClasses(Class<?> clazz, Class<?> autoComputedCallingClass) {
        return !autoComputedCallingClass.isAssignableFrom(clazz);
    }

    private static void emitReplayWarning(int eventCount) {
        Reporter.warn("A number (" + eventCount + ") of logging calls during the initialization phase have been intercepted and are");
        Reporter.warn("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        Reporter.warn("See also https://www.slf4j.org/codes.html#replay");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static SLF4JServiceProvider getProvider() {
        if (INITIALIZATION_STATE == 0) {
            Class<LoggerFactory> clazz = LoggerFactory.class;
            // MONITORENTER : org.slf4j.LoggerFactory.class
            if (INITIALIZATION_STATE == 0) {
                INITIALIZATION_STATE = 1;
                LoggerFactory.performInitialization();
            }
            // MONITOREXIT : clazz
        }
        switch (INITIALIZATION_STATE) {
            case 3: {
                return PROVIDER;
            }
            case 4: {
                return NOP_FALLBACK_SERVICE_PROVIDER;
            }
            case 2: {
                throw new IllegalStateException(UNSUCCESSFUL_INIT_MSG);
            }
            case 1: {
                return SUBST_PROVIDER;
            }
        }
        throw new IllegalStateException("Unreachable code");
    }

    private static void reportIgnoredStaticLoggerBinders(Set<URL> staticLoggerBinderPathSet) {
        if (staticLoggerBinderPathSet.isEmpty()) {
            return;
        }
        Reporter.warn("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        for (URL path : staticLoggerBinderPathSet) {
            Reporter.warn("Ignoring binding found at [" + path + "]");
        }
        Reporter.warn("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    private static void reportMultipleBindingAmbiguity(List<SLF4JServiceProvider> providerList) {
        if (LoggerFactory.isAmbiguousProviderList(providerList)) {
            Reporter.warn("Class path contains multiple SLF4J providers.");
            for (SLF4JServiceProvider provider : providerList) {
                Reporter.warn("Found provider [" + provider + "]");
            }
            Reporter.warn("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    private static void replaySingleEvent(SubstituteLoggingEvent event) {
        if (event == null) {
            return;
        }
        SubstituteLogger substLogger = event.getLogger();
        String loggerName = substLogger.getName();
        if (substLogger.isDelegateNull()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (!substLogger.isDelegateNOP()) {
            if (substLogger.isDelegateEventAware()) {
                if (substLogger.isEnabledForLevel(event.getLevel())) {
                    substLogger.log(event);
                }
            } else {
                Reporter.warn(loggerName);
            }
        }
    }

    private static void emitReplayOrSubstituionWarning(SubstituteLoggingEvent event, int queueSize) {
        if (event.getLogger().isDelegateEventAware()) {
            LoggerFactory.emitReplayWarning(queueSize);
        } else if (!event.getLogger().isDelegateNOP()) {
            LoggerFactory.emitSubstitutionWarning();
        }
    }

    private static final void performInitialization() {
        LoggerFactory.bind();
        if (INITIALIZATION_STATE == 3) {
            LoggerFactory.versionSanityCheck();
        }
    }

    private static void reportActualBinding(List<SLF4JServiceProvider> providerList) {
        if (!providerList.isEmpty() && LoggerFactory.isAmbiguousProviderList(providerList)) {
            Reporter.info("Actual provider is of type [" + providerList.get(0) + "]");
        }
    }

    private static void safelyInstantiate(List<SLF4JServiceProvider> providerList, Iterator<SLF4JServiceProvider> iterator2) {
        try {
            SLF4JServiceProvider provider = iterator2.next();
            providerList.add(provider);
        }
        catch (ServiceConfigurationError e) {
            Reporter.error("A service provider failed to instantiate:\n" + e.getMessage());
        }
    }

    private static boolean isAmbiguousProviderList(List<SLF4JServiceProvider> providerList) {
        return providerList.size() > 1;
    }

    /*
     * WARNING - void declaration
     */
    static List<SLF4JServiceProvider> findServiceProviders() {
        void var0;
        ArrayList<SLF4JServiceProvider> providerList = new ArrayList<SLF4JServiceProvider>();
        ClassLoader classLoaderOfLoggerFactory = LoggerFactory.class.getClassLoader();
        SLF4JServiceProvider explicitProvider = LoggerFactory.loadExplicitlySpecified(classLoaderOfLoggerFactory);
        if (explicitProvider != null) {
            providerList.add(explicitProvider);
            return providerList;
        }
        ServiceLoader<SLF4JServiceProvider> serviceLoader = LoggerFactory.getServiceLoader(classLoaderOfLoggerFactory);
        Iterator<SLF4JServiceProvider> iterator2 = serviceLoader.iterator();
        while (iterator2.hasNext()) {
            LoggerFactory.safelyInstantiate(providerList, iterator2);
        }
        return var0;
    }

    public static ILoggerFactory getILoggerFactory() {
        return LoggerFactory.getProvider().getLoggerFactory();
    }

    static void reset() {
        INITIALIZATION_STATE = 0;
    }

    private static void emitSubstitutionWarning() {
        Reporter.warn("The following set of substitute loggers may have been accessed");
        Reporter.warn("during the initialization phase. Logging calls during this");
        Reporter.warn("phase were not honored. However, subsequent logging calls to these");
        Reporter.warn("loggers will work as normally expected.");
        Reporter.warn("See also https://www.slf4j.org/codes.html#substituteLogger");
    }

    static {
        INITIALIZATION_STATE = 0;
        SUBST_PROVIDER = new SubstituteServiceProvider();
        NOP_FALLBACK_SERVICE_PROVIDER = new NOP_FallbackServiceProvider();
        DETECT_LOGGER_NAME_MISMATCH = Util.safeGetBooleanSystemProperty(DETECT_LOGGER_NAME_MISMATCH_PROPERTY);
        String[] stringArray = new String[1];
        stringArray[0] = "2.0";
        API_COMPATIBILITY_LIST = stringArray;
    }

    /*
     * WARNING - void declaration
     */
    static SLF4JServiceProvider loadExplicitlySpecified(ClassLoader classLoader) {
        String explicitlySpecified;
        block6: {
            block5: {
                explicitlySpecified = System.getProperty(PROVIDER_PROPERTY_KEY);
                if (null == explicitlySpecified) break block5;
                if (!explicitlySpecified.isEmpty()) break block6;
            }
            return null;
        }
        try {
            Object[] objectArray = new Object[2];
            objectArray[0] = explicitlySpecified;
            objectArray[1] = PROVIDER_PROPERTY_KEY;
            String message = String.format("Attempting to load provider \"%s\" specified via \"%s\" system property", objectArray);
            Reporter.info(message);
            Class<?> clazz = classLoader.loadClass(explicitlySpecified);
            Constructor<?> constructor = clazz.getConstructor(new Class[0]);
            Object obj = constructor.newInstance(new Object[0]);
            return (SLF4JServiceProvider)obj;
        }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            Object[] objectArray = new Object[1];
            objectArray[0] = explicitlySpecified;
            String message = String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", objectArray);
            Reporter.error(message, e);
            return null;
        }
        catch (ClassCastException e) {
            void var2_4;
            void var1_1;
            Object[] objectArray = new Object[1];
            objectArray[0] = var1_1;
            String string = String.format("Specified SLF4JServiceProvider (%s) does not implement SLF4JServiceProvider interface", objectArray);
            Reporter.error(string, (Throwable)var2_4);
            return null;
        }
    }

    static void failedBinding(Throwable t) {
        INITIALIZATION_STATE = 2;
        Reporter.error("Failed to instantiate SLF4J LoggerFactory", t);
    }

    /*
     * WARNING - void declaration
     */
    static Set<URL> findPossibleStaticLoggerBinderPathSet() {
        void var0;
        LinkedHashSet<URL> staticLoggerBinderPathSet = new LinkedHashSet<URL>();
        try {
            ClassLoader loggerFactoryClassLoader = LoggerFactory.class.getClassLoader();
            Enumeration<URL> paths = loggerFactoryClassLoader == null ? ClassLoader.getSystemResources(STATIC_LOGGER_BINDER_PATH) : loggerFactoryClassLoader.getResources(STATIC_LOGGER_BINDER_PATH);
            while (paths.hasMoreElements()) {
                URL path = paths.nextElement();
                staticLoggerBinderPathSet.add(path);
            }
        }
        catch (IOException ioe) {
            void var1_2;
            Reporter.error("Error getting resources from path", (Throwable)var1_2);
        }
        return var0;
    }

    /*
     * WARNING - void declaration
     */
    private static final void bind() {
        try {
            List<SLF4JServiceProvider> providersList = LoggerFactory.findServiceProviders();
            LoggerFactory.reportMultipleBindingAmbiguity(providersList);
            if (providersList != null && !providersList.isEmpty()) {
                PROVIDER = providersList.get(0);
                PROVIDER.initialize();
                INITIALIZATION_STATE = 3;
                LoggerFactory.reportActualBinding(providersList);
            } else {
                void var1_2;
                INITIALIZATION_STATE = 4;
                Reporter.warn("No SLF4J providers were found.");
                Reporter.warn("Defaulting to no-operation (NOP) logger implementation");
                Reporter.warn("See https://www.slf4j.org/codes.html#noProviders for further details.");
                Set<URL> staticLoggerBinderPathSet = LoggerFactory.findPossibleStaticLoggerBinderPathSet();
                LoggerFactory.reportIgnoredStaticLoggerBinders((Set<URL>)var1_2);
            }
            LoggerFactory.postBindCleanUp();
        }
        catch (Exception e) {
            void var0_1;
            LoggerFactory.failedBinding(e);
            throw new IllegalStateException("Unexpected initialization failure", (Throwable)var0_1);
        }
    }

    private static void replayEvents() {
        int numDrained;
        LinkedBlockingQueue<SubstituteLoggingEvent> queue = SUBST_PROVIDER.getSubstituteLoggerFactory().getEventQueue();
        int queueSize = queue.size();
        int count = 0;
        int maxDrain = 128;
        ArrayList eventList = new ArrayList(128);
        while ((numDrained = queue.drainTo(eventList, 128)) != 0) {
            for (SubstituteLoggingEvent event : eventList) {
                LoggerFactory.replaySingleEvent(event);
                if (count++ != 0) continue;
                LoggerFactory.emitReplayOrSubstituionWarning(event, queueSize);
            }
            eventList.clear();
        }
    }

    private static void postBindCleanUp() {
        LoggerFactory.fixSubstituteLoggers();
        LoggerFactory.replayEvents();
        SUBST_PROVIDER.getSubstituteLoggerFactory().clear();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void fixSubstituteLoggers() {
        SubstituteServiceProvider substituteServiceProvider = SUBST_PROVIDER;
        synchronized (substituteServiceProvider) {
            SUBST_PROVIDER.getSubstituteLoggerFactory().postInitialization();
            for (SubstituteLogger substLogger : SUBST_PROVIDER.getSubstituteLoggerFactory().getLoggers()) {
                Logger logger = LoggerFactory.getLogger(substLogger.getName());
                substLogger.setDelegate(logger);
            }
        }
    }

    private static final void versionSanityCheck() {
        try {
            String requested = PROVIDER.getRequestedApiVersion();
            boolean match = false;
            String[] stringArray = API_COMPATIBILITY_LIST;
            int n = stringArray.length;
            for (int i = 0; i < n; ++i) {
                String aAPI_COMPATIBILITY_LIST = stringArray[i];
                if (!requested.startsWith(aAPI_COMPATIBILITY_LIST)) continue;
                match = true;
            }
            if (!match) {
                Reporter.warn("The requested version " + requested + " by your slf4j provider is not compatible with " + Arrays.asList(API_COMPATIBILITY_LIST).toString());
                Reporter.warn("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        }
        catch (Throwable throwable) {
            Reporter.error("Unexpected problem occurred during version sanity check", throwable);
        }
    }

    private static ServiceLoader<SLF4JServiceProvider> getServiceLoader(ClassLoader classLoaderOfLoggerFactory) {
        ServiceLoader serviceLoader;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {
            ServiceLoader<SLF4JServiceProvider> serviceLoader2 = ServiceLoader.load(SLF4JServiceProvider.class, classLoaderOfLoggerFactory);
        } else {
            PrivilegedAction<ServiceLoader> action = () -> ServiceLoader.load(SLF4JServiceProvider.class, classLoaderOfLoggerFactory);
            serviceLoader = AccessController.doPrivileged(action);
        }
        return serviceLoader;
    }
}

