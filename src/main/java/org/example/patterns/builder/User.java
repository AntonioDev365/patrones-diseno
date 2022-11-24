package org.example.patterns.builder;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {

    private Long id;
    private  String firstName;
    private  String lastName;
    private  int age;
}
