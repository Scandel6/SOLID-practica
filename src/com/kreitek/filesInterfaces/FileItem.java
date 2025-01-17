package com.kreitek.filesInterfaces;

public interface FileItem extends FileSystemItem {
    String getExtension();
    void open();
    void close();
    void setPosition(int numberOfBytesFromBeginning) throws UnsupportedOperationException;
    byte[] read(int numberOfBytesToRead);
    void write(byte[] buffer);
}
