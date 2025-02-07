package com.example.expensemanager;

public class TransactionModel {
    private double amount;
    private String note;
    private String category;
    private String Type; // "Income" or "Expense"
    private long timestamp; // Unix timestamp or any time format

    // Getters and Setters
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return Type;
    }

    public void setType(String transactionType) {
        this.Type = transactionType;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
