package com.kreitek.service;


import com.kreitek.filesInterfaces.FileSystemItem;

public class FileManager {

    public static int calculateSize(FileSystemItem fileSystemItem) {
        return fileSystemItem.getSize();
    }

    // Aquí habría otros métodos para gestionar ficheros y directorios:
    // Crear ficheros, mover ficheros, eliminar ficheros, etc.
}
