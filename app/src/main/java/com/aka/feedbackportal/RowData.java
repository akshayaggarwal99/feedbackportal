package com.aka.feedbackportal;

/**
 * Created by aksha on 8/26/2015.
 */
public class RowData {

    private String Purpose;
    private String querytime;


    public RowData(String name, String callDetails) {
        this.querytime = callDetails;
    }

    public String getName() {
        return Purpose;
    }

    public void setName(String name) {
        this.Purpose = name;
    }

    public String getCallDetails() {
        return querytime;
    }

    public void setCallDetails(String callDetails) {
        this.querytime = callDetails;
    }

}