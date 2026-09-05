/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01354
 *  minecraft.class07049
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07878
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.caffeinemc.mods.lithium.common.reflection;

import java.util.WeakHashMap;
import minecraft.class00500;
import minecraft.class01354;
import minecraft.class07049;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07878;
import net.caffeinemc.mods.lithium.common.services.PlatformMappingInformation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReflectionUtil {
    private static final String REMAPPED_ON_ENTITY_COLLISION = PlatformMappingInformation.INSTANCE.mapMethodName("intermediary", "net.minecraft.class_4970", "method_9548", "(Lnet/minecraft/class_2680;Lnet/minecraft/class_1937;Lnet/minecraft/class_2338;Lnet/minecraft/class_1297;)V", "entityInside");
    private static final WeakHashMap<Class<?>, Boolean> CACHED_IS_ENTITY_TOUCHABLE = new WeakHashMap();

    public static boolean isBlockStateEntityTouchable(class00500 class005002) {
        Class<?> clazz = class005002.i().getClass();
        Boolean bl = CACHED_IS_ENTITY_TOUCHABLE.get(clazz);
        if (bl != null) {
            return bl;
        }
        boolean bl2 = ReflectionUtil.hasMethodOverride(clazz, class01354.class, true, REMAPPED_ON_ENTITY_COLLISION, class00500.class, class07299.class, class07209.class, class07049.class);
        CACHED_IS_ENTITY_TOUCHABLE.put(clazz, bl2);
        return bl2;
    }

    public static boolean hasMethodOverride(Class<?> clazz, Class<?> clazz2, boolean bl, String string, Class<?> ... classArray) {
        while (clazz != null && clazz != clazz2 && clazz2.isAssignableFrom(clazz)) {
            try {
                clazz.getDeclaredMethod(string, classArray);
                return true;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                clazz = clazz.getSuperclass();
            }
            catch (NoClassDefFoundError noClassDefFoundError) {
                Logger logger = LogManager.getLogger((String)"Lithium Class Analysis");
                logger.warn("Lithium Class Analysis Error: Class " + clazz.getName() + " cannot be analysed, because getting declared methods crashes with NoClassDefFoundError: " + noClassDefFoundError.getMessage() + ". This is usually caused by modded entities declaring methods that have a return type or parameter type that is annotated with @Environment(value=EnvType.CLIENT). Loading the type is not possible, because it only exists in the CLIENT environment. The recommended fix is to annotate the method with this argument or return type with the same annotation. Lithium handles this error by assuming the class cannot be included in some optimizations.");
                return bl;
            }
            catch (Throwable throwable) {
                String string2 = clazz.getName();
                class07080 class070802 = class07080.N((Throwable)throwable, (String)"Lithium Class Analysis");
                class07074 class070742 = class070802.N(throwable.getClass().toString() + " when getting declared methods.");
                class070742.N("Analyzed class", (Object)string2);
                class070742.N("Analyzed method name", (Object)string);
                class070742.N("Analyzed method args", classArray);
                throw new class07878(class070802);
            }
        }
        return false;
    }
}

