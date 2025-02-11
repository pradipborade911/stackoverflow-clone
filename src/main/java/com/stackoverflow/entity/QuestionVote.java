package com.stackoverflow.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "question_likes")
@NoArgsConstructor
@AllArgsConstructor
public class QuestionVote extends BaseEntity {

    @Column(name = "isUpvote")
    private Boolean isUpvote;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

    @ManyToOne()
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
