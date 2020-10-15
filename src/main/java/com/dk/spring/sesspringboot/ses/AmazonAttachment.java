package com.dk.spring.sesspringboot.ses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AmazonAttachment {
    
    private String name;
    private byte[] content;
    private String contentType;
}
