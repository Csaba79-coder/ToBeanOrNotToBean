package com.csaba79coder.demo.tobeanornottobean.model.annotation.component.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Component("studentBean")
public class Student {

    private int id;
    private String studentName;
}
