package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean can_post;
    private boolean groups_can_post;
    private boolean can_close;
    private boolean can_open;
    private String text;

    public boolean isCan_post() {
        return can_post;
    }

    public void setCan_post(boolean can_post) {
        this.can_post = can_post;
    }

    public boolean isGroups_can_post() {
        return groups_can_post;
    }

    public void setGroups_can_post(boolean groups_can_post) {
        this.groups_can_post = groups_can_post;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCan_close() {
        return can_close;
    }

    public void setCan_close(boolean can_close) {
        this.can_close = can_close;
    }

    public boolean isCan_open() {
        return can_open;
    }

    public void setCan_open(boolean can_open) {
        this.can_open = can_open;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
