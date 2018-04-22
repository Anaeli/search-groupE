/*
 * Search .java
 *
 * Copyright (c) 2018 Jalasoft.
 *
 * This software is the confidential and proprietary information of Jalasoft.
 * ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jalasoft.
 */
        package com.jalasoft.search.view;
        import javax.swing.*;
        import java.awt.*;
        import java.util.Date;

/**
 *
 This class implements the GUI for Search Menu Panel.
 using components from swing library, it contains a JFrame and add to it, more Custom Panels for this application
 *
 * @version  1.0
 * @author Rodrigo Saul Cespedes Murillo
 */
public class MainWindow extends JFrame {
    private SearchMenu menuPanel;
    private HeaderPanel headerPanel;
    private BodyPanel bodyPanel;
    private ResultSearchPanel resultSearchPanel;
    /**
     * Constructor initializes the name of JFrame
     * */
    public MainWindow() {
        super("Search App - Group E");
    }

    /**
     * This method is to add to main window all specific Custom JPanels for the Search App
     * */
    public void displayMainWindow() {
        this.getContentPane().setLayout(new BorderLayout());
        menuPanel = new SearchMenu();
        headerPanel = new HeaderPanel();
        bodyPanel = new BodyPanel();
        resultSearchPanel = new ResultSearchPanel();

        this.getContentPane().add(menuPanel, BorderLayout.WEST);
        this.getContentPane().add(bodyPanel, BorderLayout.CENTER);
        this.getContentPane().add(headerPanel, BorderLayout.NORTH);
        this.getContentPane().add(resultSearchPanel, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setResizable(false);
        this.setVisible(true);
    }

    /**
     * This method returns path string of simpleFieldPanel
     * @return string of fileChooser Component
     * */
    public String getPathText(){
        return bodyPanel.getSimpleFieldPanel().getPathTextField();
    }

    /**
     * * This method returns Filename string of simpleFieldPanel
     * @return string of filenameTextField Component
     * */
    public String getFileNameText(){
        return bodyPanel.getSimpleFieldPanel().getFilenameTextField();
    }

    /**
     * This method returns extension string of advancedFieldPanel
     * @return string of extensionTextField Component
     * */
    public String getExtensionText(){
        return bodyPanel.getAdvancedFieldPanel().getExtensionText();
    }

    /**
     * This method returns flag related to hidden field.
     * @return Boolean hiddenCheckBox Component
     * */
    public int getHiddenFlag(){
        return bodyPanel.getAdvancedFieldPanel().getHiddenFlag();
    }

    /**
     * This method returns flag related to hidden field.
     * @return Boolean hiddenCheckBox Component
     * */
    public int getTypeFlag(){
        return bodyPanel.getAdvancedFieldPanel().getTypeFlag();
    }

    /**
     * This method returns owner name
     * @return String owner name
     *
     */
    public String getOwnerText(){
        return bodyPanel.getAdvancedFieldPanel().getOwnerText();
    }

    /**
     * This method returns Search Button
     * @return JButton Component
     * */
    public JButton getSearchButton(){
        return menuPanel.getSearchButton();
    }

    /**
     * This method is to display an error message on Main Window of fields validations
     * */
    public void displayFieldErrorMessage(String errorMessage) {
        headerPanel.setErrorMessage(errorMessage);
    }

    /**
     * This method is to clean error message field
     * */
    public void cleanErrorMessage() {
        headerPanel.cleanErrorMessage();
    }

    /**
     * This method is to set rows on result table
     * */
    public void addRowResult(Object[] newRow){
        resultSearchPanel.addRowOnTable(newRow);
    }

    /**
     * This method is to clean all rows of table results
     * */
    public void cleanTable(){
        resultSearchPanel.cleanTable();
    }

    /**
     * This method returns get From Created Date
     * @return Date From Created Date
     *
     */
    public Date getFromCreatedDate() {
        return bodyPanel.getAdvancedFieldPanel().getFromCreatedDate();
    }

    /**
     * This method returns get From Modified Date
     * @return Date From Modified Date
     *
     */
    public Date getFromModifiedDate() {
        return bodyPanel.getAdvancedFieldPanel().getFromModifiedDate();
    }

    /**
     * This method returns get From Accessed Date
     * @return Date From Accessed Date
     *
     */
    public Date getFromAccessedDate() {
        return bodyPanel.getAdvancedFieldPanel().getFromAccessedDate();
    }

    /**
     * This method returns get From Created Date
     * @return Date From Created Date
     *
     */
    public Date getToCreatedDate() {
        return bodyPanel.getAdvancedFieldPanel().getToCreatedDate();
    }

    /**
     * This method returns get From Modified Date
     * @return Date From Modified Date
     *
     */
    public Date getToModifiedDate() {
        return bodyPanel.getAdvancedFieldPanel().getToModifiedDate();
    }

    /**
     * This method returns get From Accessed Date
     * @return Date From Accessed Date
     *
     */
    public Date getToAccessedDate() {
        return bodyPanel.getAdvancedFieldPanel().getToAccessedDate();
    }

    /**
     * This method returns Read Only value, it can be both = 0, read only = 1 and no read only = 2
     * @return int of Read Only TextField Component
     * */
    public int getReadOnlyIndex() {
        return bodyPanel.getAdvancedFieldPanel().getReadOnlyIndex();
    }

    /**
     * This method returns size value, it can be KB = 0, MB = 1 and GB = 2
     * @return int of size Combo box component
     * */
    public int getSizeIndex() {
        return bodyPanel.getAdvancedFieldPanel().getSizeIndex();
    }

    /**
     * This method returns From Size
     * @return String owner name
     *
     */
    public String getFromSize() {
        return bodyPanel.getAdvancedFieldPanel().getFromSize();
    }

    /**
     * This method returns To Size
     * @return String owner name
     *
     */
    public String getToSize() {
        return bodyPanel.getAdvancedFieldPanel().getToSize();
    }

    /**
     * This method returns Save Criteria Button to implement its event on Controller
     * @return JButton criteria Save Button
     *
     */
    public JButton getCriteriaSaveButton() {
        return bodyPanel.getCriteriaPanel().getCriteriaSaveButton();
    }

    /**
     * This method returns true if the window displays an error
     * @return boolean if in the window has error
     *
     */
    public boolean hasError() {
        return headerPanel.hasError();
    }

    /**
     * This method is to add rows on result table about search results
     * */
    public void addRowOnCriteriaTable(Object[] newRow){
        bodyPanel.getCriteriaPanel().addRowOnTable(newRow);
    }

    /**
     * This method returns JTable of criteria
     * */
    public JTable getCriteriaTable(){
        return bodyPanel.getCriteriaPanel().getCriteriaTable();
    }

    /**
     * This method is to clean results table
     * */
    public void cleanCriteriaTable(){
        bodyPanel.getCriteriaPanel().getCriteriaDefaultModel().setRowCount(0);
    }

    /**
     * This method returns Criteria text field string
     * */
    public String getCriteriaName(){
        return bodyPanel.getCriteriaPanel().getCriteriaName();
    }

    /**
     * This method returns Menu Panel
     * */
    public SearchMenu getMenuPanel(){
        return menuPanel;
    }

    /**
     * This method returns Body Panel
     * */
    public BodyPanel getBodyPanel(){
        return bodyPanel;
    }

    /**
     * This method sets file name field
     * */
    public void setFilenameTextField(String filenameTextField) {
        bodyPanel.getSimpleFieldPanel().setFilenameTextField(filenameTextField);
    }

    /**
     * This method sets path Text field
     * */
    public void setPathTextField(String pathTextField) {
        bodyPanel.getSimpleFieldPanel().setPathTextField(pathTextField);
    }

    /**
     * This method sets path Text field
     * */
    public void setOwnerTextField(String ownerTextstField) {
        bodyPanel.getAdvancedFieldPanel().setOwnerTextField(ownerTextstField);
    }

    /**
     * This method sets extension Text field
     * */
    public void setExtensionTextField(String extensionTextField) {
        bodyPanel.getAdvancedFieldPanel().setExtensionTextField(extensionTextField);
    }

    /**
     * This method sets size Text field from
     * */
    public void setSizeFrom(int size) {
        bodyPanel.getAdvancedFieldPanel().setFromSizeTextField(Integer.toString(size));
    }

    /**
     * This method sets size Text field To
     * */
    public void setSizeTo(int size) {
        bodyPanel.getAdvancedFieldPanel().setToSizeTextField(Integer.toString(size));
    }

    /**
     * This method sets type Combo Box
     * */
    public void setType(int setType) {
        bodyPanel.getAdvancedFieldPanel().setTypeComboBox(setType);
    }

    /**
     * This method sets Hidden Combo Box
     * */
    public void setHidden(int setHidden) {
        bodyPanel.getAdvancedFieldPanel().setHiddenComboBox(setHidden);
    }

    /**
     * This method sets Read Only Combo Box
     * */
    public void setReadOnly(int readOnly) {
        bodyPanel.getAdvancedFieldPanel().setReadOnlyComboBox(readOnly);
    }

    /**
     * This method sets CreatedDate from
     * */
    public void setCreatedFrom(Date date) {
        bodyPanel.getAdvancedFieldPanel().setFromCreatedDP(date);
    }

    /**
     * This method sets CreatedDate to
     * */
    public void setCreatedTo(Date date) {
        bodyPanel.getAdvancedFieldPanel().setToCreatedDP(date);
    }

    /**
     * This method sets ModifiedDate from
     * */
    public void setModifiedFrom(Date date) {
        bodyPanel.getAdvancedFieldPanel().setFromModifiedDP(date);
    }

    /**
     * This method sets ModifiedDate to
     * */
    public void setModifiedTo(Date date) {
        bodyPanel.getAdvancedFieldPanel().setToModifiedDP(date);
    }

    /**
     * This method sets Accessdate from
     * */
    public void setAccessFrom(Date date) {
        bodyPanel.getAdvancedFieldPanel().setFromAccessedDP(date);
    }

    /**
     * This method sets Accessdate to
     * */
    public void setAccessTo(Date date) {
        bodyPanel.getAdvancedFieldPanel().setToAccessedDP(date);
    }

    /**
     * This method sets path Text field
     * */
    public CriteriaPanel getCriteriaPanel() {
        return bodyPanel.getCriteriaPanel();
    }
}