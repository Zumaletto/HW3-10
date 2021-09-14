package ru.netology.manager;

import ru.netology.domain.Post;

public class MainPostManager {
    private PostManager postManager;

    public Post[] search(owner_id, domain, query, owners_only, count, offset) {
        Post[] post = PostManager.getPostsForFeed();
        //
        return null;
    }

    public void delete(owner_id, post_id) {
        Post[] post = PostManager.getPostsForFeed();
        //
    }
}
