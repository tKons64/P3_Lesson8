package me.tretyakovv.p3_lesson7.services;

public interface FilesService {
    boolean saveToFile(String json);

    String readFromFile();

    boolean cleanDataFile();
}