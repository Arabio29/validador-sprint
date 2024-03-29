package com.example.validador.model;



public class Documento {

    private String date;

    private String injuryLocation;

    private String gender;

    private String ageGroup;

    private String incidentType;

    private int daysLost;

    private String plant;

    private String reportType;

    private String shift;

    private String department;

    private double incidentCost;

    private String wkDay;

    private String month;

    private int year;

    public Documento() {
        // Constructor vacío
    }

    // Constructor
    public Documento(String date, String injuryLocation, String gender, String ageGroup, String incidentType,
                     int daysLost, String plant, String reportType, String shift, String department, double incidentCost,
                     String wkDay, String month, int year) {
        this.date = date;
        this.injuryLocation = injuryLocation;
        this.gender = gender;
        this.ageGroup = ageGroup;
        this.incidentType = incidentType;
        this.daysLost = daysLost;
        this.plant = plant;
        this.reportType = reportType;
        this.shift = shift;
        this.department = department;
        this.incidentCost = incidentCost;
        this.wkDay = wkDay;
        this.month = month;
        this.year = year;
    }

    // Getters y setters
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getInjuryLocation() {
        return injuryLocation;
    }

    public void setInjuryLocation(String injuryLocation) {
        this.injuryLocation = injuryLocation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public int getDaysLost() {
        return daysLost;
    }

    public void setDaysLost(int daysLost) {
        this.daysLost = daysLost;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getIncidentCost() {
        return incidentCost;
    }

    public void setIncidentCost(double incidentCost) {
        this.incidentCost = incidentCost;
    }

    public String getWkDay() {
        return wkDay;
    }

    public void setWkDay(String wkDay) {
        this.wkDay = wkDay;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Método toString para facilitar la impresión de objetos ContenidoExcel
    @Override
    public String toString() {
        return "ContenidoExcel [date=" + date + ", injuryLocation=" + injuryLocation + ", gender=" + gender
                + ", ageGroup=" + ageGroup + ", incidentType=" + incidentType + ", daysLost=" + daysLost + ", plant="
                + plant + ", reportType=" + reportType + ", shift=" + shift + ", department=" + department
                + ", incidentCost=" + incidentCost + ", wkDay=" + wkDay + ", month=" + month + ", year=" + year + "]";
    }
}
