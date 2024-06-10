package dev.demoassist.model;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prompt {
    private String question;
    private String responseType;

    /*
    public Prompt() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }
*/
}
