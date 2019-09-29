package com.example.webservice.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.example.webservice.entities.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "promotions")
public class Promo extends BaseEntity {
    @NotNull
    @Column(nullable = false)
    private String title;
    @Column(length = 2000)
    private String description;
    private String url;
    @JsonIgnore
    private String imagePath;
    private long viewCount;
    private long clickCount;
    private String priority;
    private String textColor;
    private String backgroundColor;
    private boolean active;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public enum Priority {
        NORMAL("normal"),
        HIGH("high");

        private String value;

        Priority(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public void increaseViewCount() {
        this.viewCount++;
    }

    public void increaseClickCount() {
        this.clickCount++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public long getViewCount() {
        return viewCount;
    }

    public void setViewCount(long viewCount) {
        this.viewCount = viewCount;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getTextColor() {
        if (!textColor.contains("#"))
            return "#" + textColor;
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getBackgroundColor() {
        if (!backgroundColor.contains("#"))
            return "#" + backgroundColor;
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public long getClickCount() {
        return clickCount;
    }

    public void setClickCount(long clickCount) {
        this.clickCount = clickCount;
    }
}
