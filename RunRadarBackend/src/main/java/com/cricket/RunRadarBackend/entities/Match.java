package com.cricket.RunRadarBackend.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cricket_matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;

    private String teamHeading;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlTeam;

    private String bowTeamScore;

    private String liveText;

    private String textComplete;

    @Enumerated
    private MatchStatus status;

    private Date date=new Date();

    public void setMatchStatus()
    {
        if (textComplete.isBlank())
            this.status = MatchStatus.LIVE;
        else
            this.status = MatchStatus.COMPLETED;
    }
    public Match() {
    }

    public Match(int matchId, String teamHeading, String battingTeam, String battingTeamScore, String bowlTeam, String bowTeamScore, String liveText, String textComplete, MatchStatus status, Date date) {
        this.matchId = matchId;
        this.teamHeading = teamHeading;
        this.battingTeam = battingTeam;
        this.battingTeamScore = battingTeamScore;
        this.bowlTeam = bowlTeam;
        this.bowTeamScore = bowTeamScore;
        this.liveText = liveText;
        this.textComplete = textComplete;
        this.status = status;
        this.date = date;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public String getTeamHeading() {
        return teamHeading;
    }

    public void setTeamHeading(String teamHeading) {
        this.teamHeading = teamHeading;
    }

    public String getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }

    public String getBattingTeamScore() {
        return battingTeamScore;
    }

    public void setBattingTeamScore(String battingTeamScore) {
        this.battingTeamScore = battingTeamScore;
    }

    public String getBowlTeam() {
        return bowlTeam;
    }

    public void setBowlTeam(String bowlTeam) {
        this.bowlTeam = bowlTeam;
    }

    public String getBowTeamScore() {
        return bowTeamScore;
    }

    public void setBowTeamScore(String bowTeamScore) {
        this.bowTeamScore = bowTeamScore;
    }

    public String getLiveText() {
        return liveText;
    }

    public void setLiveText(String liveText) {
        this.liveText = liveText;
    }

    public String getTextComplete() {
        return textComplete;
    }

    public void setTextComplete(String textComplete) {
        this.textComplete = textComplete;
    }

    public MatchStatus getStatus() {
        return status;
    }

    public void setStatus(MatchStatus status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
