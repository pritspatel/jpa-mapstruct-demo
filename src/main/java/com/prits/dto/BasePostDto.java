package com.prits.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by priteshpatel on 4/27/19.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasePostDto {
    private Long id;
    private String title;
}
