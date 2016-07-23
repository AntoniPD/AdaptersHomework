package com.example.user.adaptershw.cmn;

import android.graphics.drawable.Drawable;
import android.widget.Button;

/**
 * Created by User on 7/22/2016.
 */
public class Post {

    String title;
    Drawable picture;
    int points;
    int commentNum;
    Button btnUp;
    Button btnDown;
    Button btnMore;
    Button btnShare;
    Button btnComment;


    public Post(int commentNum,int points, String title, Drawable picture) {

        this.commentNum = commentNum;
        this.points = points;
        this.title = title;
        this.picture = picture;
    }

    public Button getBtnUp() {
        return btnUp;
    }

    public void setBtnUp(Button btnUp) {
        this.btnUp = btnUp;
    }

    public Button getBtnDown() {
        return btnDown;
    }

    public void setBtnDown(Button btnDown) {
        this.btnDown = btnDown;
    }

    public Button getBtnMore() {
        return btnMore;
    }

    public void setBtnMore(Button btnMore) {
        this.btnMore = btnMore;
    }

    public Button getBtnShare() {
        return btnShare;
    }

    public void setBtnShare(Button btnShare) {
        this.btnShare = btnShare;
    }

    public Button getBtnComment() {
        return btnComment;
    }

    public void setBtnComment(Button btnComment) {
        this.btnComment = btnComment;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Drawable getPicture() {
        return picture;
    }

    public void setPicture(Drawable picture) {
        this.picture = picture;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }
}
