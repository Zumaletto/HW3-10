package ru.netology.domain;

public class LikesInfo {
    private int amount;
    private boolean canLikes;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isCanLikes() {
        return canLikes;
    }

    public void setCanLikes(boolean canLikes) {
        this.canLikes = canLikes;
    }
}
