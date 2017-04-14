package com.gmail.jorgegilcavazos.ballislife.features.shared;

import net.dean.jraw.models.Comment;
import net.dean.jraw.models.VoteDirection;

public interface OnCommentClickListener {

    void onVoteComment(Comment comment, VoteDirection voteDirection);

    void onSaveComment(Comment comment);

    void onReplyToComment(int position, Comment parentComment);
}
