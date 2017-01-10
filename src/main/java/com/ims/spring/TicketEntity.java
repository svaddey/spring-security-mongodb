package com.ims.spring;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "tickets")
public class TicketEntity {
    private String id;
    private String description;
    private String createdBy;
    private Date createdDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "TicketEntity{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
