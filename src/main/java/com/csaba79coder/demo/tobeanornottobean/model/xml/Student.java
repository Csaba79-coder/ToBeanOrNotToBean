package com.csaba79coder.demo.tobeanornottobean.model.xml;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    // https://stackoverflow.com/questions/18931077/how-to-i-get-bean-value-from-bean-xml
    // https://www.geeksforgeeks.org/how-to-create-a-spring-bean-in-3-different-ways/

    // https://stackoverflow.com/questions/7711750/how-to-reference-a-bean-of-another-xml-file-in-spring

    private int id;
    private String studentName;
}
