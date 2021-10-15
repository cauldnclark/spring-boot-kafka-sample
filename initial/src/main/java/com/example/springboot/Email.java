package com.example.springboot;

public class Email {
    private String subject;
    private String html;
    private String from;
    private String to;

    public Email(String subject, String html, String from, String to) {
        this.subject = subject;
        this.html = html;
        this.from = from;
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
