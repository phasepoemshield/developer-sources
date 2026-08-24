package org.freedesktop.dbus.utils;

import java.io.FileDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from ReflectionFileDescriptorHelper.java
public final class ReflectionFileDescriptorHelper {
   private final Field fdField = FileDescriptor.class.getDeclaredField("fd");
   private final Constructor<FileDescriptor> constructor;
   private static final Optional<ReflectionFileDescriptorHelper> INSTANCE = createInstance();
   private static final Logger LOGGER = LoggerFactory.getLogger(ReflectionFileDescriptorHelper.class);

   private ReflectionFileDescriptorHelper() throws ReflectiveOperationException {
      this.fdField.setAccessible(true);
      this.constructor = FileDescriptor.class.getDeclaredConstructor(int.class);
      this.constructor.setAccessible(true);
   }

   public Optional<Integer> getFileDescriptorValue(FileDescriptor _fd) {
      try {
         return Optional.of(this.fdField.getInt(_fd));
      } catch (SecurityException | IllegalArgumentException | IllegalAccessException _ex) {
         LOGGER.error("Could not get file descriptor by reflection.", _ex);
         return Optional.empty();
      }
   }

   public Optional<FileDescriptor> createFileDescriptor(int _fd) {
      try {
         return Optional.of(this.constructor.newInstance(_fd));
      } catch (SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException var3) {
         LOGGER.error("Could not create new FileDescriptor instance by reflection.", var3);
         return Optional.empty();
      }
   }

   public static Optional<ReflectionFileDescriptorHelper> getInstance() {
      return INSTANCE;
   }

   private static Optional<ReflectionFileDescriptorHelper> createInstance() {
      try {
         return Optional.of(new ReflectionFileDescriptorHelper());
      } catch (ReflectiveOperationException _ex) {
         LOGGER.error("Unable to hook up java.io.FileDescriptor by using reflection.", _ex);
         return Optional.empty();
      }
   }
}
