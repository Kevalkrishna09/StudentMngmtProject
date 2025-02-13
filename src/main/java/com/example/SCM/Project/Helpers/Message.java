package com.example.SCM.Project.Helpers;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private String content;
    private MessageType type;
}
