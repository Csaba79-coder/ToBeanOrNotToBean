package com.csaba79coder.demo.tobeanornottobean.model.annotation.bean.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private int id;
    private String studentName;
}
