/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class02796
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.DynamicMBean;
import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanAttributeInfo;
import javax.management.MBeanInfo;
import javax.management.MBeanNotificationInfo;
import javax.management.MBeanRegistrationException;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import minecraft.class02796;
import minecraft.class05072;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class class05084
implements DynamicMBean {
    private static final Logger N = LogUtils.getLogger();
    private final class02796 y;
    private final MBeanInfo L;
    private final Map<String, class05072> u = Stream.of(new class05072("tickTimes", this::y, "Historical tick times (ms)", long[].class), new class05072("averageTickTime", this::N, "Current average tick time (ms)", Long.TYPE)).collect(Collectors.toMap(class050722 -> class050722.N, Function.identity()));

    @Override
    public @Nullable Object invoke(String string, Object[] objectArray, String[] stringArray) {
        return null;
    }

    private class05084(class02796 class027962) {
        this.y = class027962;
        MBeanAttributeInfo[] mBeanAttributeInfoArray = (MBeanAttributeInfo[])this.u.values().stream().map(class05072::N).toArray(MBeanAttributeInfo[]::new);
        this.L = new MBeanInfo(class05084.class.getSimpleName(), "metrics for dedicated server", mBeanAttributeInfoArray, null, null, new MBeanNotificationInfo[0]);
    }

    @Override
    public AttributeList getAttributes(String[] stringArray) {
        List<Attribute> list = Arrays.stream(stringArray).map(this.u::get).filter(Objects::nonNull).map(class050722 -> new Attribute(class050722.N, class050722.y.get())).collect(Collectors.toList());
        return new AttributeList(list);
    }

    private long[] y() {
        return this.y.yP();
    }

    @Override
    public @Nullable Object getAttribute(String string) {
        class05072 class050722 = this.u.get(string);
        return class050722 == null ? null : class050722.y.get();
    }

    @Override
    public void setAttribute(Attribute attribute) {
    }

    private float N() {
        return this.y.yE();
    }

    public static void N(class02796 class027962) {
        try {
            ManagementFactory.getPlatformMBeanServer().registerMBean(new class05084(class027962), new ObjectName("net.minecraft.server:type=Server"));
        }
        catch (InstanceAlreadyExistsException | MBeanRegistrationException | MalformedObjectNameException | NotCompliantMBeanException jMException) {
            N.warn("Failed to initialise server as JMX bean", (Throwable)jMException);
        }
    }

    @Override
    public MBeanInfo getMBeanInfo() {
        return this.L;
    }

    @Override
    public AttributeList setAttributes(AttributeList attributeList) {
        return new AttributeList();
    }
}

