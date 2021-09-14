package ru.netology.domain;

public class RepostsInfo {
    private int count;
    private boolean user_reposted;
    private boolean canRepost;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUser_reposted()

    {
        return user_reposted;
    }

    public void setUser_reposted(boolean user_reposted) {
        this.user_reposted = user_reposted;
    }

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }
}
