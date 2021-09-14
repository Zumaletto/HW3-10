package ru.netology.domain;

import javax.xml.transform.sax.SAXResult;

public class Post {
    private int id;
    private int owner_id;
    private int from_id;
    private int created_by;
    private int dateAndTime;
    private String text;
    private int reply_owner_id;
    private int reply_post_id;
    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private LikesInfo likesInfo;
    private RepostsInfo repostInfo;
    private ViewsInfo viewsInfo;
    private String post_source;
    private int signer_id;
    private int[] can_pin;
    private int[] can_delete;
    private int[] can_edit;
    private int postponed_id;
    private boolean complain;
    private boolean favorite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public int getFrom_id() {
        return from_id;
    }

    public void setFrom_id(int from_id) {
        this.from_id = from_id;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public int getDateAndTime() { return dateAndTime; }

    public void setDateAndTime(int dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReply_owner_id() {
        return reply_owner_id;
    }

    public void setReply_owner_id(int reply_owner_id) {
        this.reply_owner_id = reply_owner_id;
    }

    public int getReply_post_id() {
        return reply_post_id;
    }

    public void setReply_post_id(int reply_post_id) {
        this.reply_post_id = reply_post_id;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public Copyright getCopyright() {
        return copyright;
    }

    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public RepostsInfo getRepostInfo() {
        return repostInfo;
    }

    public void setRepostInfo(RepostsInfo repostInfo) {
        this.repostInfo = repostInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public String getPost_source() {
        return post_source;
    }

    public void setPost_source(String post_source) {
        this.post_source = post_source;
    }

    public int getSigner_id() {
        return signer_id;
    }

    public void setSigner_id(int signer_id) {
        this.signer_id = signer_id;
    }

    public int[] getCan_pin() {
        return can_pin;
    }

    public void setCan_pin(int[] can_pin) {
        this.can_pin = can_pin;
    }

    public int[] getCan_delete() {
        return can_delete;
    }

    public void setCan_delete(int[] can_delete) {
        this.can_delete = can_delete;
    }

    public int[] getCan_edit() {
        return can_edit;
    }

    public void setCan_edit(int[] can_edit) {
        this.can_edit = can_edit;
    }

    public int getPostponed_id() {
        return postponed_id;
    }

    public void setPostponed_id(int postponed_id) {
        this.postponed_id = postponed_id;
    }

    public boolean isComplain() {
        return complain;
    }

    public void setComplain(boolean complain) {
        this.complain = complain;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}

