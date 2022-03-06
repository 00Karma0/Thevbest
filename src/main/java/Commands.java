
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.concurrent.TimeUnit;

public class Commands extends ListenerAdapter {
	
	public void onMessageReceived( MessageReceivedEvent event) {
        String messageSent = event.getMessage().getContentRaw();
        String[] messageSent1 = event.getMessage().getContentRaw().split("\\s+");


         if(messageSent.equalsIgnoreCase(main.prefix + "Who is king")) {
            event.getChannel().sendMessage("Ahmed is!").queue();
            return;
        }
         if(messageSent1[0].equalsIgnoreCase(main.prefix + "random")){
            try {
                int x = 0;
                String y = messageSent1[1];
                int input = Integer.parseInt(y);
                while (x < input) {
                    int z = (int) (Math.random() * 100);
                    event.getChannel().sendMessage("" + z).queue();
                    x++;
                }
            } catch (ArrayIndexOutOfBoundsException E){
                event.getChannel().sendMessage("Wrong format of random command invoked, please type is this format: ~random NUM_OF_TIMES_TO_INVOKE").queue();
            } finally {
                return;
            }
         }
         if(messageSent.equalsIgnoreCase(main.prefix + "ping")) {
        	 event.getChannel().sendMessage("pong").queue();
        	 return; 
        	 
         }
         if(messageSent.equalsIgnoreCase(main.prefix + "pong")) {
        	 event.getChannel().sendMessage("ping").queue();
        	 return; 
         	
         	
         }
         if(messageSent.equalsIgnoreCase(main.prefix + "rockpaperscissors")) {
        	 double x = Math.random();
        	 if(x > 0.0 && x < 0.33) {
        		 event.getChannel().sendMessage("rock").queue();
        	 }else if(x > 0.33 && x < 0.66) {
        		 event.getChannel().sendMessage("paper").queue();
         } else if(x > 0.66 && x < 1.0) {
        	 event.getChannel().sendMessage("scissors").queue();
         }
        }
         if(messageSent1[0].equalsIgnoreCase(main.prefix + "roll")) {
        	 if(messageSent1.length < 2) {
        		 event.getChannel().sendMessage("Please enter the max and min roll. In this format: ~roll MIN MAX");
        		 return;
        	 }
        	 int x = (int) (Math.random() * (Integer.parseInt(messageSent1[2]) + 1)) + Integer.parseInt(messageSent1[1]);
        	 event.getChannel().sendMessage("" + x).queue();
         }
         if(messageSent.equalsIgnoreCase(main.prefix + "who is our savior")) {
        	 event.getChannel().sendMessage("pinkguy" + "\n" + "https://tenor.com/view/thumbs-up-okay-good-job-gif-9207424").queue();
         }
         if (messageSent1[0].equalsIgnoreCase(main.prefix + "schedule"))
            if (messageSent1.length == 4){
            String h = messageSent1[1];
            String f = messageSent1[2];
            String hjj = messageSent1[3];
            int x = Integer.parseInt(h);
            if (f.equalsIgnoreCase("seconds")) {
                try {
                    TimeUnit.SECONDS.sleep(x);
                } catch (InterruptedException e) {
                    event.getChannel().sendMessage("TIMER:" + hjj).queue();
                    return;
                }

            } else if (f.equalsIgnoreCase("minutes")) {
                try {
                    TimeUnit.MINUTES.sleep(x);
                } catch (InterruptedException e) {
                    event.getChannel().sendMessage("TIMER:" + hjj).queue();
                    return;
                }
            } else if (f.equalsIgnoreCase("hours")) {
                try {
                    TimeUnit.HOURS.sleep(x);
                } catch (InterruptedException e) {
                    event.getChannel().sendMessage("TIMER:" + hjj).queue();
                    return;
                }
            } else if (f.equalsIgnoreCase("days")) {
                try {
                    TimeUnit.DAYS.sleep(x);
                } catch (InterruptedException e) {
                    event.getChannel().sendMessage("TIMER:" + hjj).queue();
                    return;
                }
            } else if (f.equalsIgnoreCase("months")) {
                try {
                    int z = x * 30;
                    TimeUnit.DAYS.sleep(z);
                } catch (InterruptedException e) {
                    event.getChannel().sendMessage("TIMER:" + hjj).queue();
                    return;
                }}
                    else if (f.equalsIgnoreCase("years")) {
                    try {
                        long z = (x * 30) * 12;
                        TimeUnit.DAYS.sleep(z);
                    } catch (InterruptedException e) {
                        event.getChannel().sendMessage("TIMER:" + hjj).queue();
                        return;
                    }
                }


            } else {
                event.getChannel().sendMessage("Please envoke method in proper format. FORMAT: ~schedule QUANTITY UNIT EVENTNAME." + "\n" + "Example: ~schedule 10 days Party!");
                return;
            }


    }}

	

	
	
	

