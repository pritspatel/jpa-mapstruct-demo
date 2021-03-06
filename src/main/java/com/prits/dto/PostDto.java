package com.prits.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by priteshpatel on 4/27/19.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto extends BasePostDto {
    public List<TagDto> tagDtos = new ArrayList<>();
}
