package org.example;

import static org.example.ReplyType.*;

/**
 * Students implement this method to return the exact outputs defined in README.
 */
public class ReplyService {



    public String reply(String message, ReplyType type) {
        if (message == null || message.trim().isEmpty()){
            return "Please say something.";
        }

        String s = message.trim().toLowerCase();
        switch (s){
            case "hi":
                return select(type
                        , "Hello. How may I assist you today?"
                        , "Hey there! \uD83D\uDE0A How can I help?"
                        ,"Hello. How can I help?");

            case "hello":
                return select(type,
                        "Hello. How may I assist you today?",
                        "Hi! \uD83D\uDC4B What’s up?",
                        "Hello. How can I help?");

            case "how are you":
                return select(type,
                        "I am functioning properly. How may I assist you?",
                        "Doing great! \uD83D\uDE04 How can I help?",
                        "I’m good. How can I help?");
            case "i need help":
                return select(type,
                        "I can assist with that. Please provide more details.",
                        "I’ve got you! \uD83D\uDE42 Tell me a bit more.",
                        "Share details; I’ll help.");
            case "can you help me with my account":
                return select(type,
                        "Certainly. Please describe the account issue.",
                        "Sure thing! \uD83D\uDE0A What’s wrong with the account?",
                        "Describe the account issue…");
            case "thanks":
                return select(type,
                        "You are welcome.",
                        "Anytime! \uD83D\uDE4C",
                        "You’re welcome.");
            case "bye":
                return select(type,
                        "Goodbye.",
                        "See you later! \uD83D\uDC4B",
                        "Goodbye.");
            case "what is your name":
                return select(type,
                        "I am your virtual assistant.",
                        "I’m your helper bot \uD83E\uDD16",
                        "I’m your assistant.");
            default:
                return select(type,
                        "Could you clarify your request?",
                        "Could you tell me more?",
                        "Please clarify.");

        }

    }

    private String select(ReplyType type,String formal,String friendly,String concise) {
        switch (type) {
            case FORMAL:
                return formal;
            case FRIENDLY:
                return friendly;
            case CONCISE:
                return concise;
            default:
                throw new IllegalArgumentException("Unknown ReplyType: " + type);
        }
    }

}
