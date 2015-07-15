package com.sungmook.domain;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.List;

/**
 * Created by Lim Sungmook(sungmook.lim@sk.com, ipes4579@gmail.com).
 */
@Data
@Entity
@PrimaryKeyJoinColumn(name="id")
@DiscriminatorValue(value=Content.Discriminator.STORY_STRING)
public class Story extends Content{

    @OneToMany(mappedBy="story")
    private List<Comment> comments;

}
