package com.email.writer.app;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class EmailRequest {
    private String tone;
    private String emailContent;


    public String getTone() {
        return tone;
    }

    public String getEmailContent() {
        return emailContent;
    }

    public void setTone(String tone) {
        this.tone = tone;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

}

