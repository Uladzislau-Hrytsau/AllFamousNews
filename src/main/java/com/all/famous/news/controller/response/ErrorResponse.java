package com.all.famous.news.controller.response;

import lombok.*;

import java.util.List;

/**
 * The type Error response.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorResponse {

    private List<String> messages;

}
