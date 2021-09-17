package ru.netology.manager;

import ru.netology.domain.Post;

public class MainPostManager {
    private PostManager postManager;

    public Post[] search(int owner_id, String domain, String query, boolean owners_only, int count, int offset) {
        Post[] post = PostManager.getPostsForFeed();
        //
        return null;
    }

    public void delete(int owner_id, int post_id) {
        Post[] post = PostManager.getPostsForFeed();
        //
    }
}
