package ru.netology.domain;

public class Post {
    private CommunityName communityName;
    private Content content;
    private Like like;
    private CommentsInfo commentsInfo;
    private Repost repost;
    private ViewsInfo viewsInfo;
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int replayOwnerId;
    private int replayPostId;
    private int friendsOnly;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private int signerId;
    private int canDelete;
    private int canEdit;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;
    private Donut donut;
    private Copyright copyright;
}
