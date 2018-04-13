/*
 * Validator .java
 *
 * Copyright (c) 2018 Jalasoft.
 *
 * This software is the confidential and proprietary information of Jalasoft.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with Jalasoft.
 */
package com.jalasoft.search.controller;

import static com.jalasoft.search.common.Log.getInstance;

/*
 * Class to manage criteria for search files or folder
 * @version  1.0
 * @author Eliana Navia
 */
public class SearchCriteria {
    private String fileName;
    private String path;
    private String extension;
    private int isHidden;
    private int type;

    /**
     * Constructor method
     */
    public SearchCriteria(){
    }

    /**
     * Method to return the file name
     * @return file name
     */
    public String getFileName() {
        getInstance().getLogger().info("Filename: " + fileName);
        return fileName;
    }

    /**
     * Method to return the path
     * @return path
     */
    public String getPath() {
        getInstance().getLogger().info("Path: " + path);
        return path;
    }

    /**
     * Method to return the path
     * @return type file
     */
    public int getType() {
        getInstance().getLogger().info("type: " + type);
        return type;
    }
    /**
     * Method to set the file name
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Method to set the path
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Method to get file extension
     * @return file extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Method to get if a file is hidden or not
     * @return true if the file is hidden otherwise false
     */
    public int getHidden() {
        return isHidden;
    }

    /**
     * Method to set file extension
     * @param extension, file extension
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * Method to set if a file is hidden or not
     * @param hidden, true if the file is hidden otherwise false
     */
    public void setHidden(int hidden) {
        isHidden = hidden;
    }

    /**
     * Method to set if a file is hidden or not
     * @param type, true if the file is hidden otherwise false
     */
    public void setType(int type) {
        this.type = type;
    }
}
