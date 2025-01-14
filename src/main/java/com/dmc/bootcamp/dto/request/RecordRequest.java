package com.dmc.bootcamp.dto.request;

import com.dmc.bootcamp.domain.Record;
import com.dmc.bootcamp.domain.AppUser;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RecordRequest {
    private String foodId; //food_id추가
    private String image;
    private String content;
    private  float score;
    private String userId;

    public Record toEntity(AppUser appUser){
        return Record.builder()
                .foodId(foodId)
                .content(content)
                .image(image)
                .score(score)
                .appUser(appUser)
                .build();
    }

}
