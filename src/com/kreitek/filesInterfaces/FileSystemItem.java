package com.kreitek.filesInterfaces;

import java.util.List;

public interface FileSystemItem {
    String getName();
    void setName(String name);
    DirectoryItem getParent();
    void setParent(DirectoryItem directory);
    String getFullPath();
    int getSize();

}
