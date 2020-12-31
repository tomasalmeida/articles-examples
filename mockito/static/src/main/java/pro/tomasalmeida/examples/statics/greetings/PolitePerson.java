package pro.tomasalmeida.examples.statics.greetings;

import pro.tomasalmeida.examples.statics.util.GreetingsUtil;

public class PolitePerson {

    public String startConversationWith(final String name) {
        return GreetingsUtil.getFormalHello(name) + "!";
    }

    public String finishConversation() {
        return GreetingsUtil.sayFormalGoodbye() + "!";
    }
}
