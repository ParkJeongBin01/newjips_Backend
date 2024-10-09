package com.kb.buddiz.dto;

import com.kb.board.dto.BoardAttachFile;
import com.kb.board.dto.BoardReply;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Buddiz {
    private long uno;
    private long liveInKr;
    private String personality;
    private long cost;
    private long hiredTimes;
    private long rating;
    private String selfInfo;
    private String lan;
    private long reviewcnt;
    private String location;

    // 외부 조인
    private String gender;
    private String userId;
    private String name;
    private String nickname;
    private String reviewer;
    private String reviewContent;

    private ArrayList<Buddiz> ReviewList;

}
