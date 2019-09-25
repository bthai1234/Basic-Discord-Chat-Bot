import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class BotMain extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event){
        Message msg = event.getMessage();
        MessageChannel channel = event.getChannel();

        if(event.getAuthor().isBot()){
            return;
        }

        if(msg.getContentRaw().equals("!info")){
            channel.sendMessage("Author: Ben Thai \nBot: v0.1").queue();
        }

    }

    public static void main(String[] args) throws LoginException{
        String token = "NjEzNDUwMzg1NTQ1MzYzNDU5.XVxGSg.alslUpccEMBjjfnB0GqllHmX0BI";

        JDABuilder jda = new JDABuilder(AccountType.BOT);
        jda.setToken(token);

        jda.addEventListeners(new BotMain());

        jda.build();




    }


}
