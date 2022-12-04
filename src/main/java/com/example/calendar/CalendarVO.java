package com.example.calendar;

import java.sql.Date;

public class CalendarVO {
    private int seq;
    private String name;
    private String writer;
    private String organization;
    private String participation;
    private Date start;
    private Date end;
    private int like_or_dislike;
    private String id;
    private String comment;
    private Boolean vote;
    private int cnt;

    public int getSeq() { return seq; }
    public void setSeq(int seq) { this.seq = seq; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getWriter() { return writer; }
    public void setWriter(String writer) { this.writer = writer; }

    public String getOrganization() { return organization; }
    public void setOrganization(String organization) { this.organization = organization; }

    public String getParticipation() { return participation; }
    public void setParticipation(String participation) { this.participation = participation; }

    public Date getStart() { return start; }
    public void setStart(Date start) { this.start = start; }

    public Date getEnd() { return end; }
    public void setEnd(Date end) { this.end = end; }

    public int getLike_or_dislike() { return like_or_dislike; }
    public void setLike_or_dislike(int like_or_dislike) { this.like_or_dislike = like_or_dislike; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }

    public Boolean getVote() { return vote; }
    public void setVote(Boolean vote) { this.vote = vote; }
}
