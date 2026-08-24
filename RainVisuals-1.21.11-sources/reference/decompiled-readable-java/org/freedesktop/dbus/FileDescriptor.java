/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus;

import java.util.Optional;
import org.freedesktop.dbus.exceptions.MarshallingException;
import org.freedesktop.dbus.spi.message.ISocketProvider;
import org.freedesktop.dbus.utils.ReflectionFileDescriptorHelper;

public final class FileDescriptor {
    private final int fd;

    public String toString() {
        return FileDescriptor.class.getSimpleName() + "[fd=" + this.fd + "]";
    }

    public boolean equals(Object _o) {
        block5: {
            block4: {
                if (this == _o) {
                    return true;
                }
                if (_o == null) break block4;
                if (this.getClass() == _o.getClass()) break block5;
            }
            return false;
        }
        FileDescriptor that = (FileDescriptor)_o;
        return this.fd == that.fd;
    }

    public static FileDescriptor fromJavaFileDescriptor(java.io.FileDescriptor _data, ISocketProvider _provider) throws MarshallingException {
        if (_provider != null) {
            Optional<Integer> result = _provider.getFileDescriptorValue(_data);
            if (result.isPresent()) {
                return new FileDescriptor(result.get());
            }
        }
        return new FileDescriptor((Integer)ReflectionFileDescriptorHelper.getInstance().flatMap(helper -> helper.getFileDescriptorValue(_data)).orElseThrow(() -> new MarshallingException("Could not get FileDescriptor value")));
    }

    public int hashCode() {
        return this.fd;
    }

    public FileDescriptor(int _fd) {
        this.fd = _fd;
    }

    public java.io.FileDescriptor toJavaFileDescriptor(ISocketProvider _provider) throws MarshallingException {
        if (_provider != null) {
            Optional<java.io.FileDescriptor> result = _provider.createFileDescriptor(this.fd);
            if (result.isPresent()) {
                return result.get();
            }
        }
        return (java.io.FileDescriptor)ReflectionFileDescriptorHelper.getInstance().flatMap(helper -> helper.createFileDescriptor(this.fd)).orElseThrow(() -> new MarshallingException("Could not create new FileDescriptor instance"));
    }

    public int getIntFileDescriptor() {
        return this.fd;
    }
}

