package com.sdfworkshop17.model;

import java.math.BigDecimal;

import jakarta.json.JsonNumber;
import jakarta.json.JsonObject;

public class Query {
    private String from;
    private String to;
    private BigDecimal amount;
    
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public static Query createJson(JsonObject o){
        Query q = new Query();
        JsonObject queryObj = o.getJsonObject("query");
        String toString = queryObj.getString("To");
        q.to = toString;
        String fromString = queryObj.getString("From");
        q.from = fromString;
        JsonNumber jNum = queryObj.getJsonNumber("amount");
        q.amount = jNum.bigDecimalValue();
        return q;
    }
}
