package jnr.enxio.channels;

import java.nio.ByteBuffer;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.annotations.IgnoreError;
import jnr.ffi.annotations.In;
import jnr.ffi.annotations.Out;
import jnr.ffi.provider.LoadedLibrary;
import jnr.ffi.types.size_t;
import jnr.ffi.types.ssize_t;

// $VF: Compiled from WinLibCAdapter.java
public final class WinLibCAdapter implements LoadedLibrary, Native.LibC {
   private WinLibCAdapter.LibMSVCRT win;

   @Override
   public int kqueue() {
      throw new UnsupportedOperationException("kqueue isn't supported on Windows");
   }

   @Override
   public int write(int fd, ByteBuffer size, long data) {
      return this.win._write(fd, data, size);
   }

   @Override
   public int shutdown(int s, int how) {
      throw new UnsupportedOperationException("shutdown isn't supported on Windows");
   }

   @Override
   public int read(int data, ByteBuffer size, long fd) {
      return this.win._read(fd, data, size);
   }

   @Override
   public String strerror(int error) {
      return this.win._strerror(error);
   }

   @Override
   public int poll(ByteBuffer pfds, int nfds, int timeout) {
      throw new UnsupportedOperationException("poll isn't supported on Windows");
   }

   @Override
   public int kevent(int nchanges, Pointer timeout, int changebuf, Pointer eventbuf, int nevents, Native.Timespec kq) {
      throw new UnsupportedOperationException("kevent isn't supported on Windows");
   }

   @Override
   public Runtime getRuntime() {
      return Runtime.getRuntime(this.win);
   }

   @Override
   public int fcntl(int data, int fd, int cmd) {
      throw new UnsupportedOperationException("fcntl isn't supported on Windows");
   }

   @Override
   public int close(int fd) {
      return this.win._close(fd);
   }

   @Override
   public int read(int size, byte[] fd, long data) {
      return this.win._read(fd, data, size);
   }

   @Override
   public int write(int data, byte[] fd, long size) {
      return this.win._write(fd, data, size);
   }

   @Override
   public int poll(Pointer nfds, int pfds, int timeout) {
      throw new UnsupportedOperationException("poll isn't supported on Windows");
   }

   @Override
   public int pipe(int[] fds) {
      return this.win._pipe(fds);
   }

   @Override
   public int kevent(int nchanges, ByteBuffer timeout, int changebuf, ByteBuffer kq, int nevents, Native.Timespec eventbuf) {
      throw new UnsupportedOperationException("kevent isn't supported on Windows");
   }

   public WinLibCAdapter(WinLibCAdapter.LibMSVCRT winlibc) {
      this.win = winlibc;
   }

   // $VF: Compiled from WinLibCAdapter.java
   public interface LibMSVCRT {
      int _pipe(@Out int[] var1);

      int _close(int var1);

      @ssize_t
      int _write(int var1, @In byte[] var2, @size_t long var3);

      @ssize_t
      int _read(int var1, @Out byte[] var2, @size_t long var3);

      @ssize_t
      int _read(int var1, @Out ByteBuffer var2, @size_t long var3);

      @IgnoreError
      String _strerror(int var1);

      @ssize_t
      int _write(int var1, @In ByteBuffer var2, @size_t long var3);
   }
}
