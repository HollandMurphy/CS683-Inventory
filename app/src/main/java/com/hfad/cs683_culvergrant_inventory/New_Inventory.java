package com.hfad.cs683_culvergrant_inventory;

public class New_Inventory {
    private String vinNumber;
    private String make;
    private String model;
    private int year;
    private String color;
    private String stockNumber;

    // Static Data for time being
    public static final New_Inventory[] newInventory = {
            new New_Inventory("20-446", "ZACNJBAB6LPL62554", "Jeep", "Renegade", 2020, "Aqua"),
            new New_Inventory("20-439", "ZACNJABB4LPL88465", "Jeep", "Renegade", 2020, "Silver Metallic"),
            new New_Inventory("20-179", "1C4PJLCB6LD552481", "Jeep", "Cherokee", 2020, "Red"),
            new New_Inventory("21-107", "3C4NJDEB8MT513719", "Jeep", "Compass", 2021, "blue"),
            new New_Inventory("21-102", "3C4NJDDB2MT516780", "Jeep", "Compass", 2021, "Desert Grey"),
            new New_Inventory("20-503", "1C4GJXAG1LW303726", "Jeep", "Wrangler", 2020, "White"),
            new New_Inventory("20-467", "1C4RJFAG2LC414726", "Jeep", "Grand Cherokee", 2020, "Black"),
            new New_Inventory("20-446", "1C4RJFBT6LC390359", "Jeep", "Grand Cherokee", 2020, "Black"),
            new New_Inventory("21-138", "1C4HJXFG5MW534823", "Jeep", "Wrangler", 2021, "Ugly")
    };

    // Constructor for instantaiting new inventory
    private New_Inventory(String stockNumber, String vinNumber, String make, String model, int year, String color) {
        this.stockNumber = stockNumber;
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getStockNumber() { return stockNumber; }
    public String getVinNumber() { return vinNumber; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getColor() { return color; }
    public String toString() {
        return "Stock Number: " + this.stockNumber + "\nVin Number: " + this.vinNumber +  "\nYear: " + this.year + "\nColor: " +  this.color + "\nMake: " + this.make + "\nModel: " +  this.model ;
    }
}
